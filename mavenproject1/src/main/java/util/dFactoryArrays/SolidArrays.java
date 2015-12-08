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
public class SolidArrays {
    private static int size = 1;
    private static int hUpper = -1;
    private static int hLower = -1;
    private static int sUpper = -1;
    private static int sLower = -1;
    private static int bUpper = -1;
    private static int bLower = -1;

    /** Creates a new instance of RBow */
    private SolidArrays() {
    }

    public static void setArraysCyclingSameHue(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setArraysCyclingRandSameHue(index);
        }
    }

    public static void setArraysCyclingRandSameHue(int index)
    {
        setRandoms();
        hLower = hUpper - 1;
        setUpCycle();
    }

    public static void setArraysCyclingPink(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setArraysCyclingRandPink(index);
        }
    }

    public static void setArraysCyclingRandPink(int index)
    {
        setRandoms();
        //12 - 38
        if(Math.random() < .5)
        {
            hUpper = (int) (Math.random() * (11 - 1) + 1);
            hLower = hUpper - 1;
        }
        else
        {
            hUpper = (int) (Math.random() * (360 - 340) + 340);
            hLower = hUpper - 1;
        }
        sUpper = (int) (Math.random() * 20) + 40;
        sLower = (int) (Math.random() * 20) + 40;
        bUpper = (int) (Math.random() * 20) + 80;
        bLower = (int) (Math.random() * 20) + 80;

        setUpCycle();
    }

    public static void setArraysCyclingOrange(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setArraysCyclingRandOrange(index);
        }
    }

    public static void setArraysCyclingRandOrange(int index)
    {
        setRandoms();
        //12 - 38
        hUpper = (int) (Math.random() * (38 - 12)) + 12;
        hLower = hUpper - 1;
        sUpper = (int) (Math.random() * 20) + 80;
        sLower = (int) (Math.random() * 20) + 80;
        bUpper = (int) (Math.random() * 20) + 80;
        bLower = (int) (Math.random() * 20) + 80;

        setUpCycle();
    }


    public static void setArraysCyclingGreen(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setArraysCyclingRandGreen(index);
        }
    }

    public static void setArraysCyclingRandGreen(int index)
    {
        setRandoms();
        //12 - 38
        hUpper = (int) (Math.random() * (155 - 80)) + 80;
        hLower = hUpper - 1;
        sUpper = (int) (Math.random() * 20) + 80;
        sLower = (int) (Math.random() * 20) + 80;
        bUpper = (int) (Math.random() * 20) + 80;
        bLower = (int) (Math.random() * 20) + 80;

        setUpCycle();
    }

    public static void setArraysCyclingWhite(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setArraysCyclingRandWhite(index);
        }
    }

    public static void setArraysCyclingRandWhite(int index)
    {
        setRandoms();
        hUpper = 1;
        hLower = 0;
        sUpper = 0;
        sLower = 0;
        bUpper = (int) (Math.random() * 20) + 80;
        bLower = (int) (Math.random() * 30) + 70;

        setUpCycle();
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

    protected static void setRandoms()
    {
        size = 5 + (int)(Math.random() * 20);
        hUpper = (int) (Math.random() * 360);
        hLower = (int) (Math.random() * 360);
        sUpper = (int) (Math.random() * 80) + 20;
        sLower = (int) (Math.random() * 80) + 20;
        bUpper = (int) (Math.random() * 70) + 30;
        bLower = (int) (Math.random() * 70) + 30;
    }

    protected static void setUpCycle()
    {
        DFactory.primaryArray = ColorArrayFactory.getCyclingColorArray("m",size,hUpper, hLower, sUpper, sLower, bUpper, bLower, 255);
        setGenericCyclingArray();
    }

    protected static void setGenericCyclingArray()
    {
        DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(5));
        DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(9));
        DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(10));
        DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAtRow(5));
        DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(3));
    }
}
