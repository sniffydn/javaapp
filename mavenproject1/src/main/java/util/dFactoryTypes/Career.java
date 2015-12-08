package util.dFactoryTypes;

import clts.SuperB;
import clts.SuperC;
import clts.SuperS;
import clts.SuperTL;
import clts.SuperTU;
import draw.Panel;
import util.Color;
import java.lang.reflect.Method;
import java.util.ArrayList;
import util.ColorArray;
import util.CthsFactory;
import util.DFactory;

public class Career
{

    private static SuperC[] getRandomOutfit(String sMiddle) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    protected Career()
    {
        super();
    }

    public static SuperC [] newSuperC(Panel p)
    {
        SuperC [] c = null;

        if(Math.random() < 1 / 5.0)
        {
            c = Police.newSuperC(p);
        }
        else
        {
            if(Math.random() < .5)
            {
                if(Math.random() < .5)
                    c = lifeguard(p);
                else
                    c = rocker(p);
            }
            else
            {
                if(Math.random() < .5)
                    c = Nurse.newSuperC(p);
                else
                    c = baker(p);
            }
        }

        ArrayList uppers = new ArrayList();
        for(int j = 0; j < c.length; j++)
        {
            if(c[j] instanceof clts.SuperTU)
                uppers.add(c[j]);
            if(c[j] instanceof clts.SuperTL)
                uppers.add(c[j]);
        }

        for(int j = 0; j < uppers.size(); j++)
            DFactory.checkArms(p, (clts.SuperC) uppers.get(j));

        return c;
    }

    public static SuperC [] lifeguard(Panel p)
    {
        ArrayList al = new ArrayList();

        SuperC [] c = Swim.newSuperC(p);

        for(int i = 0; i < c.length; i++)
        {
            al.add(c[i]);
        }

        if(Math.random() < .7)
        {
            al.add(new clts.h.Whistle0());
            if(Math.random() < .5)
                al.add(new clts.t.u.a.Float0());
        }
        else
        {
            al.add(new clts.t.u.a.Float0());
        }

        if(Math.random() < .7)
        {
            if(Math.random() < .5)
                al.add(new clts.h.GL1());
            else
                al.add(new clts.h.GL2());
        }

        c = new SuperC [al.size()];

        for(int i = 0; i < c.length; i++)
        {
            c[i] = (SuperC)al.get(i);
        }

        return c;
    }

    public static SuperC [] baker(Panel p)
    {
        ArrayList al = new ArrayList();

        SuperC [] c = JeanPant.newSuperC(p);

        for(int i = 0; i < c.length; i++)
        {
            if(!(c[i] instanceof clts.SuperTU || c[i] instanceof clts.SuperTL))
                al.add(c[i]);
        }

        al.add(new clts.b.Aprn0(DFactory.primaryArray));
        al.add(new clts.t.u.s.Srt52(p.b.sMiddle,DFactory.primaryArray));
        al.add(new clts.t.u.a.Cake0(DFactory.primaryArray));
        al.add(new clts.h.H7(DFactory.primaryArray));

        c = new SuperC [al.size()];

        for(int i = 0; i < c.length; i++)
        {
            c[i] = (SuperC)al.get(i);
        }

        return c;
    }

    public static SuperC [] rocker(Panel p)
    {
        ArrayList al = new ArrayList();

        SuperC [] c = JeanPant.newSuperC(p);

        for(int i = 0; i < c.length; i++)
        {
            if(!(c[i] instanceof clts.SuperTU || c[i] instanceof clts.SuperTL))
                al.add(c[i]);
        }
        SuperTU tu = (SuperTU)sleevelessTop(p);
        al.add(util.CthsFactory.getRandomTopLower(tu, DFactory.primaryArray));
        al.add(tu);

        al.add(new clts.t.u.a.Guitar0(DFactory.primaryArray));

        c = new SuperC [al.size()];

        for(int i = 0; i < c.length; i++)
        {
            c[i] = (SuperC)al.get(i);
        }

        for(int i = 0; i < p.inFrontArray.length; i++)
            p.inFrontArray[i] = 0;

        return c;
    }

    public static SuperC sleevelessTop(Panel p)
    {
        SuperC [] temp = CthsFactory.getAllTopUppers( p.b.sMiddle);

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            Method [] methods = temp[i].getClass().getMethods();

            boolean add = true;
            for(int j = 0; j < methods.length; j++)
            {
                if(methods[j].getName().startsWith("drawSleeves"))
                {
                    add = false;
                    break;
                }
            }

            if(((SuperC)temp[i]).includeInAutoPick && add && !((SuperC)temp[i]).drs)
                al.add(temp[i]);
        }

        temp = new SuperC [al.size()];

        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = (SuperC)al.get(i);
        }

        SuperTU tu = (SuperTU) temp[(int)(Math.random() * temp.length)];

        tu.setMiddle(p.b.sMiddle);
        tu.setColors(DFactory.primaryArray);

        return tu;
    }
}
