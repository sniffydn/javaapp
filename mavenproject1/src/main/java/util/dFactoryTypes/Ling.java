/*
 * Jean.java
 *
 * Created on July 2, 2007, 11:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryTypes;

import clts.SuperC;
import clts.SuperTU;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
import com.sun.org.apache.xerces.internal.impl.io.UCSReader;
import draw.Panel;
import util.Color;
import java.util.ArrayList;
import util.ColorArray;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class Ling
{
    private static boolean strap = false;
    /** Creates a new instance of Jean */
    private Ling()
    {
    }

    public static SuperC [] newSuperC(Panel p)
    {
        ColorArray shoeCol;
        if(Math.random() < .3)
        {
            shoeCol = DFactory.primaryArray.getNewColorArray();
        }
        else
        {
            if(Math.random() < .5)
            {
                shoeCol = DFactory.accPrimaryArray.getNewColorArray();
            }
            else
            {
                shoeCol = DFactory.accSecondaryArray.getNewColorArray();
            }
        }

        SuperC [] c = new SuperC [9];

        c[1] = randomPlatz();
        c[1].setColors(shoeCol.getNewColorArray());
        c[3] = randomShoe();
        c[3].setColors(shoeCol.getNewColorArray());
        c[2] = randomAnkleStrap(c[2]);
        c[2].setColors(shoeCol.getNewColorArray());

        c[0] = randomSocks();


        c[7] = randomTopUpper(p.b.sMiddle);
        c[7].setColors(DFactory.primaryArray.getNewColorArray());

        c[6] = randomTopLower((SuperTU)c[7]);
        c[6].setColors(DFactory.primaryArray.getNewColorArray());

        c[5] = randomLowerTopLower(c[6]);
        c[5].setColors(DFactory.accTercaryArray.getNewColorArray());


        c[4] = randomBottom(c[6]);
        c[4].setColors(DFactory.secondaryArray.getNewColorArray());

        c[8] = randomTopUpperAcc(p.b.sMiddle, c[7]);

        if(c[6] instanceof clts.t.l.TopLower15)
        {
            if(Math.random() < .3)
            {
                c[6].getColors().setAlpha(175);
            }
            else
            {
                if(Math.random() < .5)
                {
                    c[6].getColors().setAlpha(165);
                }

            }
        }

        return c;
    }

    private static SuperC randomShoe()
    {
        if(Math.random() < .5)
        {
            SuperC [] c =   {
                                new obsolete.B(),
                                new clts.s.s.B1(),
                                new clts.s.s.B2(),
                                new clts.s.s.B3(),
                                new clts.s.s.S4(),
                                new clts.s.s.S7(),
                                new clts.s.s.S9(),
                                new clts.s.s.S8(),
                                new clts.s.s.S12(),
                                new clts.s.s.S17(),
                                new clts.s.s.S18()
                            };
            strap = false;
            return c[(int)(Math.random() * c.length)];
        }
        else
        {
            SuperC [] c =   {
                                new clts.s.s.S0(),
                                new clts.s.s.S1(),
                                new clts.s.s.S2(),
                                new clts.s.s.S3(),
                                new clts.s.s.S5(),
                                new clts.s.s.S6(),
                                new clts.s.s.S10(),
                                new clts.s.s.S15(),
                                new clts.s.s.S19()

                            };
            strap = Math.random() < .5;
            return c[(int)(Math.random() * c.length)];
        }
    }
    private static SuperC randomLowerTopLower(SuperC lower)
    {
        if(lower instanceof clts.t.l.TopLower5)
            return new clts.t.l.TopLower4();
        return new clts.Blank();
    }

    private static SuperC randomTopLower(SuperTU top)
    {
        if(top.containsTL)
            return new clts.BlankTL();

        if(top instanceof clts.t.u.TopUpper0)
            return new clts.t.l.TopLower15();

        if(top instanceof clts.t.u.TopUpper3 || top instanceof clts.t.u.TopUpper4)
        {
            SuperC [] c =   {
                                new clts.t.l.TopLower15(),
                                new clts.t.l.TopLower5(),
                                new clts.t.l.TopLower7(),
                                new clts.Blank()
                            };
            return c[(int)(Math.random() * c.length)];
        }


        if((top instanceof clts.t.u.TopUpper5 || top instanceof clts.t.u.TopUpper6) && Math.random() < .3)
        {
            SuperC [] c =   {
                                new clts.t.l.TopLower15(),
                                new clts.t.l.TopLower5(),
                                new clts.Blank()
                            };
            return c[(int)(Math.random() * c.length)];
        }

        SuperC [] c =   {
                            new clts.t.l.TopLower10(),
                            new clts.t.l.TopLower7(),
                            new clts.t.l.TopLower8(),
                            new clts.t.l.TopLower9()
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomTopUpper(String sMiddle)
    {

        SuperC [] temp = util.CthsFactory.getAllTopUppers( sMiddle);

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].ling)
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

    private static SuperC randomAnkleStrap(SuperC shoe)
    {
        if(!strap)
            return new clts.Blank();
        SuperC [] c =   {
                            new clts.s.as.AS1(),
                            new clts.s.as.AS2()
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomBottom(SuperC lower)
    {
        if(lower instanceof clts.t.l.TopLower15)
        {
            SuperC [] c =   {
                                new clts.b.Bot0(),
                                new clts.b.Bot2(),
                                new clts.b.Bot25(),
                                new clts.b.Bot36()
                            };
            return c[(int)(Math.random() * c.length)];
        }

        SuperC [] c =   {
                            new clts.b.Bot0(),
                            new clts.b.BSw0(),
                            new clts.b.Bot2(),
                            new clts.b.Bot25(),
                            new clts.b.Bot26(),
                            new clts.b.Bot27(),
                            new clts.b.Bot28(),
                            new clts.b.Bot36()
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomPlatz() {
        SuperC [] c =   {
                            new clts.p.Platz0(3,0),
                            new clts.p.Platz0(4,0),
                            new clts.p.Platz0(5,0),
                            new clts.p.Platz0(6,0),
                            new clts.p.Platz0(7,0),
                            new clts.p.Platz1(5,0),
                            new clts.p.Platz1(6,0),
                            new clts.p.Platz2(6,0)
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomTopUpperAcc(String sMiddle, SuperC top)
    {

        if(top instanceof clts.t.u.TopUpper0)
        {
            SuperC [] c =   {
                                new clts.t.u.a.NL0(),
                                new clts.t.u.a.NB0(),
                                new clts.t.u.a.NB0(),
                                new clts.Blank(),
                                new clts.Blank()
                            };
            SuperC retVal = c[(int)(Math.random() * c.length)];
            if(retVal instanceof clts.t.u.a.NB0)
                retVal.setColors(top.getColors().getNewColorArray());
            else
            {
                if(Math.random() < .1)
                {
                    retVal.setColors(DFactory.primaryArray.getNewColorArray());
                }
                else
                {
                    if(Math.random() < .5)
                    {
                        retVal.setColors(DFactory.accPrimaryArray.getNewColorArray());
                    }
                    else
                    {
                        retVal.setColors(DFactory.accSecondaryArray.getNewColorArray());
                    }
                }
            }
            return retVal;
        }
        else if(top instanceof clts.t.u.s.L5)
        {
            SuperC retVal = new obsolete.L5a(sMiddle);
            retVal.setColors(top.getColors().oppositeColorArray());
            return retVal;
        }

        SuperC [] c =   {
                            new clts.t.u.a.NL0(),
                            new clts.Blank(),
                            new clts.Blank(),
                            new clts.Blank(),
                            new clts.Blank()
                        };

        SuperC retVal = c[(int)(Math.random() * c.length)];
        if(Math.random() < .1)
        {
            retVal.setColors(DFactory.primaryArray.getNewColorArray());
        }
        else
        {
            if(Math.random() < .5)
            {
                retVal.setColors(DFactory.accPrimaryArray.getNewColorArray());
            }
            else
            {
                retVal.setColors(DFactory.accSecondaryArray.getNewColorArray());
            }
        }
        return retVal;
    }

    private static SuperC randomSocks()
    {
        SuperC [] c =   {
                            new clts.s.so.SK1(),
                            new clts.s.so.SK2(),
                            new clts.s.so.SK3(),
                            new clts.s.so.SK5(),
                            new clts.Blank(),
                            new clts.Blank(),
                            new clts.Blank(),
                            new clts.Blank()
                        };
        SuperC retVal = c[(int)(Math.random() * c.length)];
        if(retVal instanceof clts.s.so.SK5)
        {
            ((clts.s.so.SK5)retVal).setColors(DFactory.accTercaryArray.getNewColorArray());
        }
        else
        {
            if(Math.random() < .3)
            {
                retVal.setColors(DFactory.primaryArray.getNewColorArray());
            }
            else
            {
                if(Math.random() < .5)
                {
                    retVal.setColors(DFactory.accPrimaryArray.getNewColorArray());
                }
                else
                {
                    retVal.setColors(DFactory.accSecondaryArray.getNewColorArray());
                }
            }
        }
        return retVal;
    }
}
