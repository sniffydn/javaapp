/*
 * Sch.java
 *
 * Created on July 2, 2007, 11:36 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import util.dFactoryTypes.*;
//import b.Same;
import clts.*;
import draw.Panel;
import util.Color;
import util.ColorArray;
import util.DFactory;


/**
 *
 * @author doubleD
 */
public class SchSame
{
    static ColorArray top;
    static ColorArray bottom;

    static double randTwo = -1;
    static double randThree = -1;
    static double randFour = -1;
    /** Creates a new instance of Sch */
    protected SchSame()
    {
        super();
    }

    public static SuperC [] newSuperC(Panel p)
    {
        if(DFactory.RAND_ONE == -1)
        {
            DFactory.RAND_ONE = Math.random();
            randTwo = Math.random();
            randThree = Math.random();
            randFour = Math.random();
        }

        top = DFactory.accTercaryArray;
        if(DFactory.RAND_ONE < .5)
        {
            if(randTwo < .5)
            {
                top = DFactory.tercaryArray;
            }
            else
            {
                top = DFactory.primaryArray;
            }
        }

        bottom = DFactory.accPrimaryArray;
        if(randThree < .66)
        {
            if(randFour < .5)
            {
                bottom = DFactory.secondaryArray;
            }
            else
            {
                bottom = DFactory.accSecondaryArray;
            }
        }

        if(DFactory.primaryC == null)
        {
            DFactory.primaryC = Sch.newSuperC(p);
        }
        SuperC [] c;
        c = new SuperC [DFactory.primaryC.length];
        for(int i = 0; i < c.length; i++)
        {
//            c[i] = DFactory.primaryC[i].cloneC();

            checkC(p, c[i]);
        }

        return c;
    }

    private static void checkC(Panel p, SuperC c)
    {
        if(c instanceof SuperTU)
        {
//            Same.checkTU(p, c);
            c.setColors(top);
        }

        if(c instanceof SuperTL)
        {
            c.setColors(top);
        }

        if(c instanceof SuperB)
        {
            c.setColors(DFactory.primaryArray.getNewColorArray());
        }

        if(c instanceof SuperS)
        {
            if(((SuperS)c).sock)
            {
                c.setColors(DFactory.accTercaryArray.getNewColorArray());
            }
            else
            {
                c.setColors(bottom);
            }
        }

        if(c instanceof clts.t.u.a.T0)
        {
            c.setColors(DFactory.primaryArray);
        }


        DFactory.checkArms(p, c);
    }
}
