/*
 * RBow.java
 *
 * Created on July 2, 2007, 12:36 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryArrays;

import util.Color;
import util.ColorArrayFactory;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class DiffArrays {
    private static String type = "m";
    private static int size = 1;
    private static int hUpper = -1;
    private static int hLower = -1;
    private static int sUpper = -1;
    private static int sLower = -1;
    private static int bUpper = -1;
    private static int bLower = -1;

    /** Creates a new instance of RBow */
    private DiffArrays() {
    }

    public static void setArraysCycling(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setRandoms();
        }
        setUpCycle();
    }

    public static void setArraysCyclingRand(int index)
    {
        setRandoms();
        setUpCycle();
    }
    private static void setRandoms()
    {
        type = ColorArrayFactory.types[(int)(Math.random() * ColorArrayFactory.types.length)];
        size = 5 + (int)(Math.random() * 20);
        hUpper = (int) (Math.random() * 360);
        hLower = (int) (Math.random() * 360);
        sUpper = (int) (Math.random() * 100);
        sLower = (int) (Math.random() * 100);
        bUpper = (int) (Math.random() * 100);
        bLower = (int) (Math.random() * 100);
    }

    private static void setUpCycle()
    {
        DFactory.primaryArray = ColorArrayFactory.getCyclingColorArray(type,size,hUpper, hLower, sUpper, sLower, bUpper, bLower, 255);
        setGenericCyclingArray();
    }

    private static void setGenericCyclingArray()
    {
        DFactory.secondaryArray = ColorArrayFactory.getArray(type, DFactory.primaryArray.getColorsAt(5));
        DFactory.tercaryArray = ColorArrayFactory.getArray(type, DFactory.primaryArray.getColorsAt(9));
        DFactory.accPrimaryArray = ColorArrayFactory.getArray(type, DFactory.primaryArray.getColorsAt(10));
        DFactory.accSecondaryArray = ColorArrayFactory.getArray(type, DFactory.accPrimaryArray.getColorsAt(5));
        DFactory.accTercaryArray = ColorArrayFactory.getArray(type, DFactory.primaryArray.getColorsAt(3));
    }
}
