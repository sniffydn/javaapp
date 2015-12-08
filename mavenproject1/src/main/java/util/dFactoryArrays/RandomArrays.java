/*
 * RandomArrays.java
 *
 * Created on July 2, 2007, 1:51 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryArrays;

import util.Color;
import util.ColorArray;
import util.ColorArrayFactory;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class RandomArrays {

    private static ColorArray getNewArrayFromColor(Color c) {
        String s = ColorArrayFactory.randomTypes[(int) Math.round(Math.random() * (ColorArrayFactory.randomTypes.length - 1))] + ",";
        s += c.getRed() + "," + c.getGreen() + "," + c.getBlue() + "," + c.getAlpha();
        return ColorArrayFactory.getArray(s);
    }

    private static void randomize() {
        if(Math.random() < .5){
            Color c = DFactory.primaryArray.get(7);
            DFactory.primaryArray = getNewArrayFromColor(c);
        }
        if(Math.random() < .5){
            Color c = DFactory.secondaryArray.get(7);
            DFactory.secondaryArray = getNewArrayFromColor(c);
        }
        if(Math.random() < .5){
            Color c = DFactory.tercaryArray.get(7);
            DFactory.tercaryArray = getNewArrayFromColor(c);
        }
        if(Math.random() < .5){
            Color c = DFactory.accPrimaryArray.get(7);
            DFactory.accPrimaryArray = getNewArrayFromColor(c);
        }
        if(Math.random() < .5){
            Color c = DFactory.accSecondaryArray.get(7);
            DFactory.accSecondaryArray = getNewArrayFromColor(c);
        }
        if(Math.random() < .5){
            Color c = DFactory.accTercaryArray.get(7);
            DFactory.accTercaryArray = getNewArrayFromColor(c);
        }
    }

    /** Creates a new instance of RandomArrays */
    protected RandomArrays() {
    }

    public static void setArrays(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setArraysRand(index);
        }
    }

    public static void setArraysRand(int index)
    {
        DFactory.primaryArray = ColorArrayFactory.getArray(999);
        DFactory.secondaryArray = ColorArrayFactory.getArray(999);
        DFactory.tercaryArray = ColorArrayFactory.getArray(999);
        DFactory.accPrimaryArray = ColorArrayFactory.getArray(999);
        DFactory.accSecondaryArray = ColorArrayFactory.getArray(999);
        DFactory.accTercaryArray = ColorArrayFactory.getArray(999);
    }
    
    public static void setArraysSolid(int index)
    {
        if(DFactory.primaryArray == null)
        {
            SolidArrays.setRandoms();
        }
        SolidArrays.setUpCycle();
        randomize();
    }

    public static void setArraysSolidRand(int index)
    {
        SolidArrays.setRandoms();
        SolidArrays.setUpCycle();
        randomize();
    }
}
