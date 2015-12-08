/*
 * Sch.java
 *
 * Created on July 2, 2007, 11:36 AM
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
import util.ColorArray;
import util.CthsFactory;
import util.DFactory;


/**
 *
 * @author doubleD
 */
public class Sch
{
    /** Creates a new instance of Sch */
    protected Sch()
    {
        super();
    }

    public static SuperC [] newSuperC(Panel p)
    {
        SuperC [] c = null;
        
        ColorArray top = DFactory.accTercaryArray;
        if(Math.random() < .5)
        {
            if(Math.random() < .5)
            {
                top = DFactory.tercaryArray;
            }
            else
            {
                top = DFactory.primaryArray;
            }
        }
        
        ColorArray bottom = DFactory.accPrimaryArray;
        if(Math.random() < .66)
        {
            if(Math.random() < .5)
            {
                bottom = DFactory.secondaryArray;
            }
            else
            {
                bottom = DFactory.accSecondaryArray;
            }
        }
        
        SuperC tu = getRandomTopUpper(p.b.sMiddle, top.getNewColorArray());
        SuperC tl = getRandomTopLower((SuperTU)tu, top.getNewColorArray());
        SuperC b = getRandomBottoms((SuperTU)tu, (SuperTL)tl, DFactory.primaryArray.getNewColorArray());
        SuperC s = getRandomShoes((SuperTU)tu, (SuperTL)tl, (SuperB) b, bottom.getNewColorArray());
        SuperC as = getRandomAnkleStraps((SuperTU)tu, (SuperTL)tl, (SuperB) b, (SuperS)s, bottom.getNewColorArray());
        SuperC pl = CthsFactory.getRandomPlatz((SuperTU)tu, (SuperTL)tl, (SuperB) b, (SuperS)s, bottom.getNewColorArray());
        SuperC sk = getRandomSock((SuperS) s, DFactory.accTercaryArray.getNewColorArray());
        
        
        ArrayList al = new ArrayList();
        al.add(sk);
        SuperC temp = CthsFactory.getRecommendedAccessory(sk, DFactory.accSecondaryArray.getNewColorArray());
        if(temp != null)
            al.add(temp);
        al.add(pl);
        al.add(s);
        temp = CthsFactory.getRecommendedAccessory(s, DFactory.accSecondaryArray.getNewColorArray());
        if(temp != null)
            al.add(temp);
        al.add(as);
        temp = CthsFactory.getRecommendedAccessory(as, DFactory.accSecondaryArray.getNewColorArray());
        if(temp != null)
            al.add(temp);
        al.add(b);
        temp = CthsFactory.getRecommendedAccessory(b, DFactory.accSecondaryArray.getNewColorArray());
        if(temp != null)
            al.add(temp);
        al.add(tl);
        temp = CthsFactory.getRecommendedAccessory(tl, DFactory.accSecondaryArray.getNewColorArray());
        if(temp != null)
            al.add(temp);
        al.add(tu);
        temp = CthsFactory.getRecommendedAccessory(tu, DFactory.tercaryArray.getNewColorArray());
        if(temp != null)
            al.add(temp);
        
        c = new SuperC[al.size()];
        
        for(int i = 0; i < c.length; i++)
        {
            c[i] = (SuperC) al.get(i);
        }
        
        return c;
        
        
        
//        SuperC [] c = {new clts.p.Platz0(5, 0), util.CthsFactory.newShoe(99)};
//        c = new SuperC[9];
//        c[0] = randomSock();
//        if(c[0] instanceof clts.s.s.B0)
//        {
//            c[1] = new clts.s.s.S11();
//            c[1].setColors(DFactory.primaryArray.getNewColorArray());
//            c[0].setColors(DFactory.accPrimaryArray.getNewColorArray());
//        }
//        else
//        {
//            c[1] = new clts.s.as.AS2();
//            c[1].setColors(DFactory.secondaryArray.getNewColorArray());
//            c[0].setColors(DFactory.primaryArray.getNewColorArray());
//        }
//        c[2] = new clts.p.Platz0(5, 0);
//        c[2].setColors(DFactory.secondaryArray.getNewColorArray());
//        c[3] = randomShoe();
//        c[3].setColors(DFactory.secondaryArray.getNewColorArray());
//        c[4] = randomAnkleStrap();
//        c[4].setColors(DFactory.secondaryArray.getNewColorArray());
//        c[5] = randomBottom();
//        c[5].setColors(DFactory.primaryArray.getNewColorArray());
//
//        c[6] = new clts.Blank();
//
//        if(Math.random() < .5)
//        {
//            c[7] = randomTopLower();
//            c[8] = randomTopUpper(p.bd.sMiddle);
//        }
//        else
//        {
//            if(Math.random() < .5)
//            {
//                if(Math.random() < .5)
//                {
//                    if(Math.random() < .5)
//                    {
//                        c[6] = randomTopLower();
//                    }
//
//                    if(Math.random() < .5)
//                    {
//                        clts.t.u.Srt2 shirt = new clts.t.u.Srt2(p.bd.sMiddle);
//                        c[7] = shirt;
//                        c[8] = new clts.t.u.a.T0();
//                    }
//                    else
//                    {
//                        clts.t.u.Srt4 shirt = new clts.t.u.Srt4(p.bd.sMiddle);
//                        c[7] = shirt;
//                        c[8] = new clts.t.u.a.T0();
//                    }
//                }
//                else
//                {
//                    if(Math.random() < .5)
//                    {
//                        clts.t.u.Srt5 shirt = new clts.t.u.Srt5(p.bd.sMiddle);
//                        c[7] = shirt;
//                        c[8] = new clts.t.u.a.T0();
//                    }
//                    else
//                    {
//                        clts.t.u.Srt6 shirt = new clts.t.u.Srt6(p.bd.sMiddle);
//                        c[7] = shirt;
//                        c[8] = new clts.t.u.a.T0();
//                    }
//                }
//            }
//            else
//            {
//                if(Math.random() < .5)
//                {
//                    c[7] = new clts.Blank();
//                    c[8] = new clts.t.u.Srt1(p.bd.sMiddle);
//                }
//                else
//                {
//                    c[7] = new clts.Blank();
//                    c[8] = new clts.t.u.Srt3(p.bd.sMiddle);
//                }
//            }
//        }
//
//        if(Math.random() < .5)
//        {
//            c[6].setColors(DFactory.accPrimaryArray.getNewColorArray());
//            c[7].setColors(DFactory.accPrimaryArray.getNewColorArray());
//            c[8].setColors(DFactory.accPrimaryArray.getNewColorArray());
//        }
//        else
//        {
//            if(Math.random() < .5)
//            {
//                c[6].setColors(DFactory.secondaryArray.getNewColorArray());
//                c[7].setColors(DFactory.secondaryArray.getNewColorArray());
//                c[8].setColors(DFactory.secondaryArray.getNewColorArray());
//            }
//            else
//            {
//                c[6].setColors(DFactory.tercaryArray.getNewColorArray());
//                c[7].setColors(DFactory.tercaryArray.getNewColorArray());
//                c[8].setColors(DFactory.tercaryArray.getNewColorArray());
//            }
//        }
//        if(c[7] instanceof clts.t.u.Srt2)
//        {
//            c[6].setColors(DFactory.accPrimaryArray.getNewColorArray());
//            c[7].setColors(DFactory.accPrimaryArray.getNewColorArray());
//            c[8].setColors(DFactory.primaryArray.getNewColorArray());
//        }
//        return c;
    }

//    private static SuperC randomTopLower()
//    {
//        SuperC [] c =   {
//                            new clts.t.l.TopLower6(2),
//                            new clts.t.l.TopLower2(2),
//                            new clts.t.l.TopLower1(2),
//                            new clts.t.l.TopLower4(2)
//                        };
//        return c[(int)(Math.random() * c.length)];
//    }
//
//    private static SuperC randomBottom()
//    {
//        SuperC [] c =   {
//                            new clts.b.Bot10(2),
//                            new clts.b.Bot10(2),
//                            new clts.b.Bot10(2),
//                            new clts.b.Bot26(2)
//                        };
//        return c[(int)(Math.random() * c.length)];
//    }
//
//    private static SuperC randomTopUpper(String sMiddle)
//    {
//        SuperC [] c =   {
//                            new clts.t.u.TopUpper6(sMiddle, 3),
//                            new clts.t.u.TopUpper9(sMiddle, 3),
//                            new clts.t.u.TopUpper5(sMiddle, 3),
//                            new clts.t.u.TopUpper1(sMiddle, 3)
//                        };
//        return c[(int)(Math.random() * c.length)];
//    }
//
//    private static SuperC randomSock()
//    {
//        SuperC [] c =   {
//                            new clts.s.s.B0(),
//                            new clts.s.as.SK5(),
//                            new obsolete.SK4()
//                        };
//        return c[(int)(Math.random() * c.length)];
//    }
//
//    private static SuperC randomShoe()
//    {
//        SuperC [] c =   {
//                            new clts.s.s.S10(),
//                            new clts.s.s.S2(),
//                            new clts.s.s.S0(),
//                            new clts.s.s.S3(),
//                            new clts.s.s.S1(),
//                            new clts.s.s.S5(),
//                            new clts.s.s.S7(),
//                            new clts.s.s.S6()
//                        };
//        return c[(int)(Math.random() * c.length)];
//    }
//
//    private static SuperC randomAnkleStrap()
//    {
//        SuperC [] c =   {
//                            new clts.s.as.AS2(),
//                            new clts.Blank()
//                        };
//        return c[(int)(Math.random() * c.length)];
//    }
    
    
    public static SuperC getRandomSock(SuperS shoe, ColorArray colors)
    {
        SuperC [] temp = CthsFactory.getAllShoes();
        
        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].sch && ((SuperS)temp[i]).sock && (shoe.slenderS == ((SuperS)temp[i]).slenderS))
                al.add(temp[i]);
        }
        
        temp = CthsFactory.getAllAnkleStraps();
        
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].sch && ((SuperS)temp[i]).sock && (shoe.slenderS == ((SuperS)temp[i]).slenderS))
                al.add(temp[i]);
        }
        
        SuperC s = (SuperC) al.get((int)(Math.random() * al.size()));

        s.setColors(colors);

        return s;
    }
    
    public static SuperC getRandomTopUpper(String middle, ColorArray colors)
    {
        SuperC [] temp = CthsFactory.getAllTopUppers( middle);

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].sch)
                al.add(temp[i]);
        }
        
        SuperTU tu = (SuperTU) al.get((int)(Math.random() * al.size()));

        tu.setMiddle(middle);
        tu.setColors(colors);

        return tu;
    }
    
    public static SuperC getRandomTopLower(SuperTU topUpper, ColorArray colors)
    {
        if(topUpper.containsTL)
            return new clts.BlankTL();

        SuperC [] temp = CthsFactory.getAllTopLowers();

        if(topUpper.shuni)
        {
            ArrayList al = new ArrayList();
            for(int i = 0; i < temp.length; i++)
            {
                if(!temp[i].prep)
                    al.add(temp[i]);
            }

            temp = new SuperC [al.size()];

            for(int i = 0; i < temp.length; i++)
            {
                temp[i] = (SuperC)al.get(i);
            }
        }
        else if(topUpper.prep)
        {
            ArrayList al = new ArrayList();
            for(int i = 0; i < temp.length; i++)
            {
                if(!temp[i].shuni)
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
            if(temp[i].sch)
                al.add(temp[i]);
        }
        
        SuperC tl = (SuperC) al.get((int)(Math.random() * al.size()));

        tl.setColors(colors);

        return tl;
    }
    
    public static SuperC getRandomBottoms(SuperTU topUpper, SuperTL topLower, ColorArray colors)
    {
        if(topUpper.containsB || topLower.containsB)
            return new clts.BlankB();

        SuperC [] temp = CthsFactory.getAllBottoms();

        if(topLower.slenderB)
        {
            ArrayList al = new ArrayList();
            for(int i = 0; i < temp.length; i++)
            {
                if(temp[i].slenderB)
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
            if(temp[i].sch)
                al.add(temp[i]);
        }
        
        SuperC b = (SuperC) al.get((int)(Math.random() * al.size()));

        b.setColors(colors);

        return b;
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
            if(temp[i].sch && ! ((SuperS)temp[i]).sock)
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
}
