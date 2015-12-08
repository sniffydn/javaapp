/*
 * PrintHelper.java
 *
 * Created on April 9, 2007, 1:37 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import util.Color;

/**
 *
 * @author doubleD
 */
public class PrintHelper {

    /** Creates a new instance of PrintHelper */
    private PrintHelper()
    {
    }

    public static String printColorArray(ColorArray COLORS)
    {
        String retVal = "";
        if(COLORS == null)
            retVal = "temp = null;";
        String temp = util.ColorArrayFactory.arrayIsCommon(COLORS);
        if(!temp.equalsIgnoreCase(""))
        {
            retVal = "temp = " + temp;
        }
        else
        {
            retVal = "temp = new Color [" + COLORS.getLength() + "];";
            for(int i = 0; i < COLORS.getLength(); i++)
            {
                retVal += "\ntemp[" + i + "] = " + printColor(COLORS.get(i)) + ";";
            }
        }
        return retVal;
    }

    public static String replace(String toChange, String replace, String with)
    {
        while(toChange.indexOf(replace) != -1)
        {
            toChange = toChange.substring(0, toChange.indexOf(replace)) + with + toChange.substring(toChange.indexOf(replace) + replace.length());
        }
        return toChange;
    }

    public static String printColor(Color color) {
        return "new Color(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "," + color.getAlpha() + ")";
    }

}
