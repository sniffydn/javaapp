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
public class FireyArrays {
    private static int size = 1;
    private static int type = 0;

    /** Creates a new instance of RBow */
    private FireyArrays() {
    }

    public static void setArraysCycling(int index)
    {
        if(DFactory.primaryArray == null)
        {
            setRandoms();
        }
        if(type == 0)
            setUpCycle0(size);
        else if(type == 1)
            setUpCycle1(size);
        else
            setUpCycle2(size);
    }

    public static void setArraysCyclingRand(int index)
    {
        setRandoms();
        if(type == 0)
            setUpCycle0(size);
        else if(type == 1)
            setUpCycle1(size);
        else
            setUpCycle2(size);
    }
    private static void setRandoms()
    {
        size = 7 + (int)(Math.random() * 5);
        type = (int)(Math.random() * 2);
    }

    private static void setUpCycle0(int size)
    {
        String [] temp = new String [size];
        int h = 0;
        int s = 100;
        int b = 100;

        for(int i = 0; i < temp.length; i++)
        {
            h = (int)((i / (double)temp.length) * 50);
            s = 100;
            b = 75 + (h / 2);
            if(h == 50)
            {
                s = 0;
                b = 100;
            }

            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = "m," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ",255";
        }

        String [] gen = new String [temp.length + temp.length - 2];
        int place = 0;
        boolean forward = true;
        for(int i = 0; i < gen.length; i++)
        {
            if(forward)
            {
                gen[i] = temp[place];
                place++;
                if(place == temp.length)
                {
                    place-=2;
                    forward = false;
                }
            }
            else
            {
                if(i > gen.length * .75)
                    gen[i] = temp[place].replaceFirst("m", "g");
                else
                    gen[i] = temp[place];
                place--;
            }
        }
        setGenericCyclingArray(gen);
    }

    private static void setUpCycle1(int size)
    {
        String [] temp = new String [size];
        int h = 0;
        int s = 100;
        int b = 100;

        for(int i = 0; i < temp.length; i++)
        {
            h = (int)((i / (double)temp.length) * 35) + 10;
            s = 100;
            b = 75 + (h / 2);

            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = "g," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ",255";
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

    private static void setUpCycle2(int size)
    {
        String [] temp = new String [size];
        int h = 0;
        int s = 100;
        int b = 100;

        for(int i = 0; i < temp.length; i++)
        {
            h = (int)((i / (double)temp.length) * 35) + 10;
            s = 100;
            b = 75 + (h / 2);

            Color c = Color.getHSBColor(h / 360f, s / 100f, b / 100f);
            temp[i] = "g," + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ",255";
        }

        String [] gen = new String [temp.length + temp.length - 2];
        int place = 0;
        boolean forward = true;
        for(int i = 0; i < gen.length; i++)
        {
            if(forward)
            {
                gen[i] = temp[place];
                place++;
                if(place == temp.length)
                {
                    place-=2;
                    forward = false;
                }
            }
            else
            {
                if(i > gen.length * .75)
                    gen[i] = temp[place].replaceFirst("m", "g");
                else
                    gen[i] = temp[place];
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
        DFactory.secondaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(5));
        DFactory.tercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(9));
        DFactory.accPrimaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(10));
        DFactory.accSecondaryArray = ColorArrayFactory.getArray("m", DFactory.accPrimaryArray.getColorsAtRow(5));
        DFactory.accTercaryArray = ColorArrayFactory.getArray("m", DFactory.primaryArray.getColorsAtRow(3));
    }
}
