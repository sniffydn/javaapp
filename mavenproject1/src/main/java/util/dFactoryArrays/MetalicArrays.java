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
public class MetalicArrays {
    private static int size = 1;
    private static int hue = 0;
    private static int sat = 0;
    private static int bri = 0;

    /** Creates a new instance of RBow */
    private MetalicArrays() {
    }

    public static void setArraysSilver(int index)
    {
        size = 5 + (int)(Math.random() * 10);
        String [] temp = new String [size];
        for(int i = 0; i < temp.length; i++)
        {
            int h = 0;
            int b = (int)((i / (double)temp.length) * 15) + 80;
            int s = 0;
            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = "c," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ",255";
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
        setGenericCyclingArray(gen);
    }

    public static void setArraysBronze(int index)
    {
        size = 5 + (int)(Math.random() * 10);
        String [] temp = new String [size];
        for(int i = 0; i < temp.length; i++)
        {
            int h = (int)((i / (double)temp.length) * 5) + 25;
            int b = (int)((i / (double)temp.length) * 15) + 80;
            int s = (int)((i / (double)temp.length) * 15) + 80;
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
        setGenericCyclingArray(gen);
    }

    public static void setArraysGold(int index)
    {
        size = 5 + (int)(Math.random() * 10);
        String [] temp = new String [size];
        for(int i = 0; i < temp.length; i++)
        {
            int h = (int)((i / (double)temp.length) * 4) + 43;
            int b = (int)((i / (double)temp.length) * 15) + 85;
            int s = 100;
            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = "c," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ",255";
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
        setGenericCyclingArray(gen);
    }

    private static void setUpCycle(int size, int hue, int sat, int bri)
    {
        String [] temp = new String [size];
        int h = hue;
        int s = sat;
        int b = bri;

        for(int i = 0; i < temp.length; i++)
        {
            if(hue == -1)
                h = (int)((i / (double)temp.length) * 360);
            if(bri == -1)
                b = (int)((i / (double)temp.length) * 70) + 30;
            if(sat == -1)
                s = (int)((i / (double)temp.length) * 80) + 20;
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
        setGenericCyclingArray(gen);
    }

    private static void setGenericArray(String s)
    {
        DFactory.primaryArray = ColorArrayFactory.getArray(s);//red
        DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(5));
        DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(9));
        DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(10));
        DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.get(5));
        DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.get(3));
    }

    private static void setGenericCyclingArray(String [] colors)
    {
        DFactory.primaryArray = ColorArrayFactory.getArray(colors);
        DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(5));
        DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(9));
        DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(10));
        DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAt(5));
        DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAt(3));
    }
}
