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
public class StarArrays {
    private static int size = 1;
    private static int hue = 0;
    private static int sat = 0;
    private static int bri = 0;

    /** Creates a new instance of RBow */
    private StarArrays() {
    }

    public static void setArraysCycling(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setRandoms();
        }
        setUpCycle(size, 0, sat, bri);
        setUpCycle(size, 260, sat, bri);
    }

    private static void setRandoms()
    {
        size = 20 + (int)(Math.random() * 20);
        hue = 0;
        sat = (int) (Math.random() * 20) + 80;
        bri = (int) (Math.random() * 30) + 70;
        if(Math.random() < .5)
        {
            sat = -1;
        }
        else
        {
            bri = -1;
        }
    }

    private static void setUpCycle(int size, int hue, int sat, int bri)
    {
        String [] temp = new String [size];
        int h = hue;
        int s = sat;
        int b = bri;

        for(int i = 0; i < temp.length; i++)
        {
            if(bri == -1)
                b = (int)((i / (double)temp.length) * 20) + 80;
            if(sat == -1)
                s = (int)((i / (double)temp.length) * 20) + 80;
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
        if(hue == 0)
        {
            setPrimaryGenericCyclingArray(gen);
        }
        else
        {
            setSecondaryGenericCyclingArray(gen);
        }
    }

    private static void setPrimaryGenericCyclingArray(String [] colors)
    {
        DFactory.primaryArray = ColorArrayFactory.getArray(colors);
        DFactory.primaryArray.set(7, new Color(255,255,255,255));
        DFactory.accPrimaryArray = ColorArrayFactory.getArray(colors);
        DFactory.accPrimaryArray.set(10, new Color(255,255,255,255));
        DFactory.accPrimaryArray.set(9, new Color(240,240,240,255));
        DFactory.accPrimaryArray.set(8, new Color(230,230,230,255));
        DFactory.accPrimaryArray.set(4, new Color(0,0,255,255));
    }

    private static void setSecondaryGenericCyclingArray(String [] colors)
    {
        DFactory.secondaryArray = ColorArrayFactory.getArray(colors);
        DFactory.secondaryArray.set(9, new Color(255,255,255,255));
        DFactory.tercaryArray = ColorArrayFactory.getArray(colors);
        DFactory.accSecondaryArray = ColorArrayFactory.getArray(colors);
        DFactory.accSecondaryArray.set(8, new Color(255,255,255,255));
        DFactory.accTercaryArray = ColorArrayFactory.getArray(colors);


    }
}
