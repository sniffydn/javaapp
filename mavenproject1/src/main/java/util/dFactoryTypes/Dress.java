/*
 * Jean.java
 *
 * Created on July 2, 2007, 11:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryTypes;

import clts.SuperB;
import clts.SuperC;
import clts.SuperS;
import clts.SuperTL;
import clts.SuperTU;
import draw.Panel;
import java.util.ArrayList;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class Dress {

    /** Creates a new instance of Jean */
    private Dress() {
    }

    public static SuperC [] newSuperC(Panel p)
    {
        SuperC [] c = new SuperC [6];

        c[5] = randomTopUpper(p.b.sMiddle);
        c[5].setColors(DFactory.primaryArray.getNewColorArray());

        c[4] = randomTopLower((SuperTU)c[5]);
        c[4].setColors(DFactory.primaryArray.getNewColorArray());

        c[3] = randomBottoms((SuperTU)c[5], (SuperTL)c[4]);
        c[3].setColors(DFactory.primaryArray.getNewColorArray());

        c[1] = randomShoe();
        c[1].setColors(DFactory.accSecondaryArray.getNewColorArray());

        c[2] = randomAnkleStraps((SuperS)c[1]);
        c[2].setColors(DFactory.accSecondaryArray.getNewColorArray());

        c[0] = util.CthsFactory.getRandomPlatz((SuperTU)c[5], (SuperTL)c[4], (SuperB)c[3], (SuperS)c[1], DFactory.accSecondaryArray.getNewColorArray());

//        if(c.length == 4)
//        {
//            do
//            {
//                c[3] = randomSleeves();
//            }while(c[2] instanceof clts.t.u.D1 && c[3] instanceof clts.t.u.a.SL0);
//
//            if(((c[3].getClass() + "").startsWith("class clts.t.u.a.SL")))
//            {
//                if(c[2] instanceof clts.t.u.D4)
//                    c[3] = new clts.Blank();
//                else if(c[2] instanceof clts.t.u.D2)
//                    c[3].setColors(DFactory.tercaryArray.getNewColorArray());
//                else if(c[2] instanceof clts.t.u.D3)
//                    c[3].setColors(DFactory.secondaryArray.getNewColorArray());
//                else
//                    c[3].setColors(DFactory.primaryArray.getNewColorArray());
//            }
//            else
//            {
//                if(Math.random() < .5)
//                    c[3].setColors(DFactory.tercaryArray.getNewColorArray());
//                else
//                    c[3].setColors(DFactory.secondaryArray.getNewColorArray());
//            }
//        }
        return c;
    }

    private static SuperC randomSleeves()
    {
        SuperC [] c =   {
                            new clts.t.u.a.SL0(),
                            new clts.t.u.a.GL1(),
                            new clts.t.u.a.GL2(),
                            new clts.t.u.a.GL3()
                        };
        return c[(int)(Math.random() * c.length)];
    }

    public static SuperC randomAnkleStraps(SuperS shoe)
    {
        if(Math.random() < .5 || !shoe.strapAllowed)
            return new clts.Blank();

        SuperC [] temp = util.CthsFactory.getAllAnkleStraps();

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(((SuperS)temp[i]).strap)
                al.add(temp[i]);
        }

        temp = new SuperC [al.size()];

        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = (SuperC)al.get(i);
        }

        SuperS s = (SuperS) temp[(int)(Math.random() * temp.length)];

        return s;
    }

    private static SuperC randomShoe()
    {
        SuperC [] temp = util.CthsFactory.getAllShoes();

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].drs)
                al.add(temp[i]);
        }

        temp = new SuperC [al.size()];

        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = (SuperC)al.get(i);
        }

        SuperC s = (SuperC) temp[(int)(Math.random() * temp.length)];

        return s;
    }

    private static SuperC randomBottoms(SuperTU tu, SuperTL tl)
    {
        if(tu.containsB || tl.containsB)
            return new clts.BlankB();

        SuperC [] temp = util.CthsFactory.getAllBottoms();

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].drs)
                al.add(temp[i]);
        }

        temp = new SuperC [al.size()];

        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = (SuperC)al.get(i);
        }

        SuperC b = temp[(int)(Math.random() * temp.length)];

        return b;
    }

    private static SuperC randomTopLower(SuperTU tu)
    {
        if(tu.containsTL)
            return new clts.BlankTL();

        SuperC [] temp = util.CthsFactory.getAllTopLowers();

        if(tu instanceof clts.t.u.TopUpper7 || tu instanceof clts.t.u.TopUpper8)
        {
            return new clts.t.l.TopLower7();
        }
        else if(tu.prep)
        {
            if(tu instanceof clts.t.u.TopUpper14)
            {
                return new clts.t.l.D5();
            }
        }

        return new clts.BlankTL();
    }

    private static SuperC randomTopUpper(String sMiddle)
    {

        SuperC [] temp = util.CthsFactory.getAllTopUppers( sMiddle);

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].drs)
                al.add(temp[i]);
        }

        temp = new SuperC [al.size()];

        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = (SuperC)al.get(i);
        }

        SuperTU tu = (SuperTU) temp[(int)(Math.random() * temp.length)];

        tu.setMiddle(sMiddle);

        return tu;
    }
}
