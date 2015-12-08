package util.dFactoryTypes;

import clts.SuperB;
import clts.SuperC;
import clts.SuperS;
import clts.SuperTL;
import clts.SuperTU;
import draw.Panel;
import util.Color;
import java.util.ArrayList;
import util.ColorArray;
import util.CthsFactory;
import util.DFactory;

public class Nurse
{

    protected Nurse()
    {
        super();
    }

    public static SuperC [] newSuperC(Panel p)
    {
        SuperC [] c = null;

        SuperC [] tuTlB = getRandomOutfit(p.b.sMiddle, getWhite());
        SuperC [] acc = getAccessories();

        SuperC tu = tuTlB[0];
        SuperC tl = tuTlB[1];
        SuperC b = tuTlB[2];
        SuperC s = getRandomShoes((SuperTU)tu, (SuperTL)tl, (SuperB) b, getRed());
        SuperC as = getRandomAnkleStraps((SuperTU)tu, (SuperTL)tl, (SuperB) b, (SuperS)s, getRed());
        SuperC pl = new clts.p.Platz5(8, 0, getRed());
        SuperC sk = getRandomSock((SuperS) s, getWhite());


        ArrayList al = new ArrayList();
        al.add(sk);
        al.add(pl);
        al.add(s);
        if(("" + as.getClass()).indexOf("Blank") == -1)
            al.add(as);
        if(("" + b.getClass()).indexOf("Blank") == -1)
            al.add(b);
        al.add(tl);
        al.add(tu);

        for(int i = 3; i < tuTlB.length; i++)
        {
            al.add(tuTlB[i]);
        }

        for(int i = 0; i < acc.length; i++)
        {
            al.add(acc[i]);
        }

        c = new SuperC[al.size()];

        for(int i = 0; i < c.length; i++)
        {
            c[i] = (SuperC) al.get(i);
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

    public static SuperC getRandomSock(SuperS shoe, ColorArray colors)
    {
        if(Math.random() < .5)
            return new clts.Blank();

        SuperC [] temp = CthsFactory.getAllShoes();

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(((SuperS)temp[i]).nurse && ((SuperS)temp[i]).sock && (shoe.slenderS == ((SuperS)temp[i]).slenderS))
                al.add(temp[i]);
        }

        temp = CthsFactory.getAllAnkleStraps();

        for(int i = 0; i < temp.length; i++)
        {
            if(((SuperS)temp[i]).nurse && ((SuperS)temp[i]).sock && (shoe.slenderS == ((SuperS)temp[i]).slenderS))
                al.add(temp[i]);
        }

        SuperC s = (SuperC) al.get((int)(Math.random() * al.size()));

        s.setColors(colors);

        return s;
    }

    public static SuperC[] getAccessories()
    {
        ArrayList al = new ArrayList();

        if(Math.random() < .5)
        {
            if(Math.random() < .5)
            {
                al.add(new clts.t.u.a.GL1(getGlovesGreen()));
            }
            else
            {
                al.add(new clts.t.u.a.GL2(getGlovesGreen()));
            }
        }

        if(Math.random() < .8)
        {
            if(Math.random() < .5)
                al.add(new clts.h.H14(getWhite()));
            else
                al.add(new clts.h.H10(getWhiteHat()));
        }

        if(Math.random() < .3)
        {
            al.add(new clts.h.GL0(getBlack()));
        }

        if(Math.random() < .3)
        {
            al.add(new clts.h.Mask0(getWhite()));
        }

        if(Math.random() < .5)
        {
            al.add(new clts.t.u.a.NL2(getRed()));
        }

        SuperC [] c = new SuperC[al.size()];

        for(int i = 0; i < c.length; i++)
        {
            c[i] = (SuperC) al.get(i);
        }

        return c;
    }

    public static SuperC [] getRandomOutfit(String middle, ColorArray colors)
    {
        SuperB [] bots = {new clts.b.Bot44(2,getRed()),new clts.b.Bot44(2,getRed()),new clts.b.Bot44(2,getRed()),new clts.b.Bot0(2,getRed())};
        SuperC [] tuTlB = new SuperC [3];

        if(Math.random() < .5)
        {
            if(Math.random() < .5)
            {
                tuTlB = new SuperC [5];
                tuTlB[0] = new clts.t.u.TopUpper25(middle, colors);
                tuTlB[1] = new clts.t.l.TopLower21(colors);
                tuTlB[2] = bots[(int)(Math.random() * bots.length)];

                clts.b.a.Decal1 decal = new clts.b.a.Decal1(2, getDecalRed());
                decal.setShiftY(-27);
                decal.setShiftX(6);
                decal.setIncludeY(true);
                tuTlB[3] = decal;

                if(Math.random() < .5)
                    tuTlB[4] = new clts.b.Bot51(2, colors);
                else
                    tuTlB[4] = new clts.BlankB();
            }
            else
            {
                tuTlB = new SuperC [5];
                tuTlB[0] = new clts.t.u.TopUpper26(middle, getRed());
                tuTlB[1] = new clts.BlankTL();

                if(Math.random() < .5)
                    tuTlB[2] = new clts.b.Bot5(colors);
                else
                    tuTlB[2] = new clts.b.Bot59(2, colors);



                tuTlB[3] = new clts.t.u.s.Srt60(middle, colors);

                clts.b.a.Decal1 decal = new clts.b.a.Decal1(2, getDecalRed());
                decal.setShiftY(-13);
                decal.setShiftX(2);
                for(int i = 0; i < 13; i++)
                tuTlB[4] = decal;

            }
        }
        else
        {
            if(Math.random() < .5)
            {
                tuTlB = new SuperC [4];
                tuTlB[0] = new clts.t.u.TopUpper24(middle, colors);
                tuTlB[1] = new clts.t.l.TopLower15(colors);
                tuTlB[2] = bots[(int)(Math.random() * bots.length)];

                clts.b.a.Decal1 decal = new clts.b.a.Decal1(2, getDecalRed());
                decal.setShiftY(-1);
                decal.setShiftX(1);
                decal.setIncludeY(true);
                tuTlB[3] = decal;
            }
            else
            {
                tuTlB = new SuperC [4];
                tuTlB[0] = new clts.t.u.TopUpper10(middle, colors);
                tuTlB[1] = new clts.t.l.TopLower12(colors);
                tuTlB[2] = new clts.BlankB();

                clts.b.a.Decal1 decal = new clts.b.a.Decal1(2, getDecalRed());
                decal.setShiftX(1);
                tuTlB[3] = decal;
            }
        }

        return tuTlB;
    }

    public static SuperC getRandomShoes(SuperTU topUpper, SuperTL topLower, SuperB bottoms, ColorArray colors)
    {
        SuperC [] temp = CthsFactory.getAllShoes();

        if(topUpper.slenderS || topLower.slenderS || bottoms.slenderS)
        {
            ArrayList al = new ArrayList();
            for(int i = 0; i < temp.length; i++)
            {
                if(!((SuperS)temp[i]).notSlenderS)
                    al.add(temp[i]);
            }

            temp = new SuperC [al.size()];

            for(int i = 0; i < temp.length; i++)
            {
                temp[i] = (SuperC)al.get(i);
            }
        }

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(((SuperS)temp[i]).nurse && ! ((SuperS)temp[i]).sock)
                al.add(temp[i]);
        }

        SuperC s = (SuperC) al.get((int)(Math.random() * al.size()));

        s.setColors(colors);

        return s;
    }

    public static SuperC getRandomAnkleStraps(SuperTU topUpper, SuperTL topLower, SuperB bottoms, SuperS shoe, ColorArray colors)
    {
        if(Math.random() < .5)
            return new clts.Blank();

        SuperC [] temp = CthsFactory.getAllAnkleStraps();

        if(!shoe.strapAllowed)
        {
            return new clts.Blank();
        }

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(((SuperS)temp[i]).strap)
                al.add(temp[i]);
        }

        SuperC s = (SuperC) al.get((int)(Math.random() * al.size()));

        s.setColors(colors);

        return s;
    }

    public static ColorArray getRed()
    {
        Color [][] temp = new Color [1][14];
        temp[0][0] = new Color(29,0,0,255);
        temp[0][1] = new Color(54,0,0,255);
        temp[0][2] = new Color(79,0,0,255);
        temp[0][3] = new Color(104,0,0,255);
        temp[0][4] = new Color(129,0,0,255);
        temp[0][5] = new Color(154,0,0,255);
        temp[0][6] = new Color(179,0,0,255);
        temp[0][7] = new Color(204,0,0,255);
        temp[0][8] = new Color(229,50,50,255);
        temp[0][9] = new Color(254,75,75,255);
        temp[0][10] = new Color(255,100,100,255);
        temp[0][11] = new Color(255,125,125,255);
        temp[0][12] = new Color(227,226,226,255);
        temp[0][13] = new Color(255,255,255,255);

        return new ColorArray(temp);
    }

    public static ColorArray getDecalRed()
    {
        Color [][] temp = new Color [1][14];
        temp[0][0] = new Color(55,53,53,255);
        temp[0][1] = new Color(80,78,78,255);
        temp[0][2] = new Color(105,103,103,255);
        temp[0][3] = new Color(130,128,128,255);
        temp[0][4] = new Color(199,0,0,255);
        temp[0][5] = new Color(180,178,178,255);
        temp[0][6] = new Color(205,203,203,255);
        temp[0][7] = new Color(230,228,228,255);
        temp[0][8] = new Color(255,253,253,255);
        temp[0][9] = new Color(255,255,255,255);
        temp[0][10] = new Color(255,255,255,255);
        temp[0][11] = new Color(255,255,255,255);
        temp[0][12] = new Color(255,255,255,255);
        temp[0][13] = new Color(255,255,255,255);

        return new ColorArray(temp);
    }

    public static ColorArray getWhite()
    {
        return util.ColorArrayFactory.getArrayFromColor("m," + 228 + "," + 227 + "," + 227 + "," + 255);
    }

    public static ColorArray getWhiteHat()
    {
        Color [][] temp = new Color [1][14];
        temp[0][0] = new Color(55,53,53,255);
        temp[0][1] = new Color(80,78,78,255);
        temp[0][2] = new Color(105,103,103,255);
        temp[0][3] = new Color(130,128,128,255);
        temp[0][4] = new Color(199,0,0,255);
        temp[0][5] = new Color(180,178,178,255);
        temp[0][6] = new Color(205,203,203,255);
        temp[0][7] = new Color(230,228,228,255);
        temp[0][8] = new Color(255,253,253,255);
        temp[0][9] = new Color(255,255,255,255);
        temp[0][10] = new Color(255,255,255,255);
        temp[0][11] = new Color(255,255,255,255);
        temp[0][12] = new Color(255,255,255,255);
        temp[0][13] = new Color(255,255,255,255);


        return new ColorArray(temp);
    }

    public static ColorArray getBlack()
    {
        return util.ColorArrayFactory.getArrayFromColor("m," + 100 + "," + 100 + "," + 100 + "," + 255);
    }

    public static ColorArray getGlovesGreen()
    {
        return util.ColorArrayFactory.getArrayFromColor("m," + 100 + "," + 194 + "," + 162 + "," + 255);
    }
}
