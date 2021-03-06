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
import util.ColorArray;
import util.CthsFactory;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class JeanSkirt extends Jean{

    /** Creates a new instance of Jean */
    private JeanSkirt() {
    }

    public static SuperC [] newSuperC(Panel p)
    {
        SuperC [] c = new SuperC [6];
        c[5] = getRandomTopUpper(p.b.sMiddle, DFactory.tercaryArray);
        c[4] = getRandomTopLower((SuperTU) c[5], DFactory.tercaryArray);
        c[3] = getRandomBottoms((SuperTU) c[5], (SuperTL) c[4], DFactory.accPrimaryArray);
        c[2] = CthsFactory.getRandomShoes((SuperTU) c[5], (SuperTL) c[4], (SuperB) c[3], DFactory.secondaryArray);
        c[1] = CthsFactory.getRandomAnkleStraps((SuperTU) c[5], (SuperTL) c[4], (SuperB) c[3], (SuperS) c[2], DFactory.secondaryArray);
        c[0] = CthsFactory.getRandomPlatz((SuperTU) c[5], (SuperTL) c[4], (SuperB) c[3], (SuperS) c[2], DFactory.secondaryArray);

        return c;
    }
protected static SuperC getRandomTopLower(SuperTU topUpper, ColorArray colors) {
        if(topUpper.containsTL)
            return new clts.BlankTL();

        SuperC [] temp = CthsFactory.getAllTopLowers();

        if(topUpper.shuni)
        {
            ArrayList al = new ArrayList();
            for(int i = 0; i < temp.length; i++)
            {
                if(!temp[i].prep && !temp[i].drs && !temp[i].containsB && !temp[i].slenderB)
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
                if(!temp[i].shuni && !temp[i].drs && !temp[i].containsB && !temp[i].slenderB)
                    al.add(temp[i]);
            }

            temp = new SuperC [al.size()];

            for(int i = 0; i < temp.length; i++)
            {
                temp[i] = (SuperC)al.get(i);
            }
        }
        else
        {
            ArrayList al = new ArrayList();
            for(int i = 0; i < temp.length; i++)
            {
                if(!temp[i].drs && !temp[i].containsB && !temp[i].slenderB)
                    al.add(temp[i]);
            }

            temp = new SuperC [al.size()];

            for(int i = 0; i < temp.length; i++)
            {
                temp[i] = (SuperC)al.get(i);
            }
        }

        SuperTL tl = (SuperTL) temp[(int)(Math.random() * temp.length)];

        tl.setColors(colors);

        return tl;
    }

    protected static SuperC getRandomBottoms(SuperTU topUpper, SuperTL topLower, ColorArray colors)
    {
        SuperC [] temp = CthsFactory.getAllBottoms();

        ArrayList al = new ArrayList();
        for(int i = 0; i < temp.length; i++)
        {
            if(temp[i].jean && temp[i].skt)
                al.add(temp[i]);
        }

        temp = new SuperC [al.size()];

        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = (SuperC)al.get(i);
        }

        SuperB b = (SuperB) temp[(int)(Math.random() * temp.length)];

        b.setColors(colors);

        return b;
    }
}
