/*
 * RBow.java
 *
 * Created on July 2, 2007, 12:36 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryArrays;

import util.ColorArrayFactory;
import util.DFactory;

/**
 *
 * @author doubleD
 */
public class RBow {

    /** Creates a new instance of RBow */
    private RBow() {
    }

    public static void setArrays(int index) {
        if(index % 7 == 0)
        {
            DFactory.primaryArray = ColorArrayFactory.getArray("m,255,0,0,255");//red
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
        }
        else if(index % 7 == 1)
        {
            DFactory.primaryArray = ColorArrayFactory.getArray("m,255,107,0,255");//orange
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
        }
        else if(index % 7 == 2)
        {
            DFactory.primaryArray = ColorArrayFactory.getArray("m,255,234,0,255");//yellow
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
        }
        else if(index % 7 == 3)
        {
            DFactory.primaryArray = ColorArrayFactory.getArray("m,84,255,0,255");//green
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
        }
        else if(index % 7 == 4)
        {
            DFactory.primaryArray = ColorArrayFactory.getArray("m,0,153,255,255");//blue
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
        }
        else if(index % 7 == 5)
        {
            DFactory.primaryArray = ColorArrayFactory.getArray("m,71,0,255,255");//indigo
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
        }
        else if(index % 7 == 6)
        {
            DFactory.primaryArray = ColorArrayFactory.getArray("m,199,0,255,255");//violet
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
        }
    }

    public static void setArraysCycling(int index) {
        if(index % 7 == 0)
        {
            String [] red = {"m,255,0,0,255", "m,255,107,0,255", "m,255,234,0,255", "m,84,255,0,255", "m,0,153,255,255", "m,71,0,255,255", "m,199,0,255,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(red);//red
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
        }
        else if(index % 7 == 1)
        {
            String [] orange = {"m,255,107,0,255", "m,255,234,0,255", "m,84,255,0,255", "m,0,153,255,255", "m,71,0,255,255", "m,199,0,255,255", "m,255,0,0,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(orange);//orange
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
        }
        else if(index % 7 == 2)
        {
            String [] yellow = {"m,255,234,0,255", "m,84,255,0,255", "m,0,153,255,255", "m,71,0,255,255", "m,199,0,255,255", "m,255,0,0,255", "m,255,107,0,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(yellow);//yellow
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
        }
        else if(index % 7 == 3)
        {
            String [] green = {"m,84,255,0,255", "m,0,153,255,255", "m,71,0,255,255", "m,199,0,255,255", "m,255,0,0,255", "m,255,107,0,255", "m,255,234,0,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(green);//green
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
        }
        else if(index % 7 == 4)
        {
            String [] blue = {"m,0,153,255,255", "m,71,0,255,255", "m,199,0,255,255", "m,255,0,0,255", "m,255,107,0,255", "m,255,234,0,255", "m,84,255,0,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(blue);//blue
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
        }
        else if(index % 7 == 5)
        {
            String [] indigo = {"m,71,0,255,255", "m,199,0,255,255", "m,255,0,0,255", "m,255,107,0,255", "m,255,234,0,255", "m,84,255,0,255", "m,0,153,255,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(indigo);//indigo
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
        }
        else if(index % 7 == 6)
        {
            String [] violet = {"m,199,0,255,255", "m,255,0,0,255", "m,255,107,0,255", "m,255,234,0,255", "m,84,255,0,255", "m,0,153,255,255", "m,71,0,255,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(violet);//violet
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
        }
    }
    public static void setArraysCyclingSame(int index)
    {
            String [] red = {"m,255,0,0,255", "m,255,107,0,255", "m,255,234,0,255", "m,84,255,0,255", "m,0,153,255,255", "m,71,0,255,255", "m,199,0,255,255"};
            DFactory.primaryArray = ColorArrayFactory.getArray(red);//red
            DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
            DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
            DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
            DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
            DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
    }
}
