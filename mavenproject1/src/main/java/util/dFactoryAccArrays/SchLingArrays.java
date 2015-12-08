/*
 * Sch.java
 *
 * Created on July 2, 2007, 12:41 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util.dFactoryAccArrays;

import util.Color;
import util.ColorArrayFactory;
import util.DFactory;
import util.dFactoryArrays.*;

/**
 *
 * @author doubleD
 */
public class SchLingArrays {

    /** Creates a new instance of Sch */
    private SchLingArrays() {
    }

    public static void setArrays(int index)
    {
        setSilver();
        setBlack();
        setWhite();
    }

    private static void setSilver()
    {
        String [] temp = new String [7];
        int h = 0;
        int s = 0;
        int b = 0;

        int bUpper = 95;
        int bLower = 65;

        for(int i = 0; i < temp.length; i++)
        {
            if(bUpper > bLower)
            {
                b = (int)(((double)i / temp.length) * (bUpper - bLower) + bLower);
            }
            else
            {
                b = (int)(((double)(temp.length - i) / temp.length) * (bLower - bUpper) + bUpper);
            }
            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = "m," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ",255";
        }

        String [] gen = new String [temp.length + temp.length - 2];
        int place = 0;
        boolean forward = true;
        for(int i = 0; i < gen.length; i++)
        {
            gen[i] = temp[place];
            if(forward)
            {
                place++;
                if(place == temp.length)
                {
                    place-=2;
                    forward = false;
                }
            }
            else
            {
                place--;
            }
        }

        DFactory.accPrimaryArray = ColorArrayFactory.getArray(gen);
    }

    private static void setBlack() {String [] temp = new String [5];
        int h = 0;
        int s = 0;
        int b = 0;

        int bUpper = 55;
        int bLower = 0;

        for(int i = 0; i < temp.length; i++)
        {
            if(bUpper > bLower)
            {
                b = (int)(((double)i / temp.length) * (bUpper - bLower) + bLower);
            }
            else
            {
                b = (int)(((double)(temp.length - i) / temp.length) * (bLower - bUpper) + bUpper);
            }
            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = "n," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ",255";
        }

        String [] gen = new String [temp.length + temp.length - 2];
        int place = 0;
        boolean forward = true;
        for(int i = 0; i < gen.length; i++)
        {
            gen[i] = temp[place];
            if(forward)
            {
                place++;
                if(place == temp.length)
                {
                    place-=2;
                    forward = false;
                }
            }
            else
            {
                place--;
            }
        }

        DFactory.accSecondaryArray = ColorArrayFactory.getArray(gen);
    }

    private static void setWhite()
    {
        DFactory.accTercaryArray = ColorArrayFactory.getArray("m,228,227,227,255");
    }

}
