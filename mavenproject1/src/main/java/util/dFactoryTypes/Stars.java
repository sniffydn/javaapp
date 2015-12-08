/*
 * Jean.java
 *
 * Created on July 2, 2007, 11:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryTypes;

import obsolete.Same;
import clts.SuperC;
import draw.Panel;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class Stars {

    /** Creates a new instance of Jean */
    private Stars() {
    }

    public static SuperC [] newSuperC(Panel p)
    {
        SuperC [] c = new SuperC [6];

        c[0] = randomPlatz();
        c[0].setColors(DFactory.primaryArray.getNewColorArray());
        c[2] = randomShoe();
        c[2].setColors(DFactory.accSecondaryArray.getNewColorArray());
        c[1] = randomAnkleStrap(c[2]);
        c[1].setColors(DFactory.secondaryArray.getNewColorArray());
        c[3] = randomBottom();
        c[3].setColors(DFactory.secondaryArray.getNewColorArray());

        c[4] = randomTopUpper(p.b.sMiddle);
//        Same.checkTU(p, c[4]);
        c[4].setColors(DFactory.accPrimaryArray.getNewColorArray());

        c[5] = randomTopUpperAcc(p.b.sMiddle);
        c[5].setColors(DFactory.accSecondaryArray.getNewColorArray());

        return c;
    }

    private static SuperC randomShoe()
    {
        SuperC [] c =   {
                            new obsolete.S21()
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomTopUpper(String sMiddle)
    {
        SuperC [] c =   {
                            new clts.t.u.TopUpper13(sMiddle, 3)
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomAnkleStrap(SuperC shoe)
    {
        SuperC [] c =   {
                            new obsolete.AS4()
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomBottom()
    {
        SuperC [] c =   {
                            new clts.b.Bot24()
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomPlatz() {
        SuperC [] c =   {
                            new clts.p.Platz1(5,0),
                            new clts.p.Platz2(6,0)
                        };
        return c[(int)(Math.random() * c.length)];
    }

    private static SuperC randomTopUpperAcc(String sMiddle)
    {
        SuperC [] c =   {
                            new clts.t.u.a.NL0()
                        };
        return c[(int)(Math.random() * c.length)];
    }
}
