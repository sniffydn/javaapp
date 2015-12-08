/*
 * JeanArrays.java
 *
 * Created on July 2, 2007, 12:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryAccArrays;

import util.ColorArrayFactory;
import util.DFactory;
import util.Color;
import util.dFactoryArrays.*;
/**
 *
 * @author doubleD
 */
public class JeanArrays {
    private static int h = 0;
    private static int s = 0;
    private static int b = 0;
    /** Creates a new instance of JeanArrays */
    public JeanArrays()
    {}

    public static void setArrays(int index)
    {
        if(DFactory.reset == true)
        {
            h = 0;
            s = 0;
            b = 0;
        }

        if(h == 0)
        {
            setArraysRand(index);
        }

        Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
        DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", c);
        DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(3 + ((int) (Math.random() * 3))));
        DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(7 + ((int) (Math.random() * 6))));
    }

    public static void setArraysRand(int index)
    {
        h = (int)(Math.random() * 25) + 200;
        s = 20 + (int)(Math.random() * 70);
        b = 120 - s;
        Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
        DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", c);
        DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(3 + ((int) (Math.random() * 3))));
        DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(7 + ((int) (Math.random() * 6))));
    }
}
