/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts;

import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class SuperTL extends SuperC
{
    public int layer = 2;

    /** Creates a new instance of GenericClothes */
    public SuperTL()
    {
    }

    public SuperTL(int layer)
    {
        this.layer = layer;
    }

    public SuperTL(ColorArray colorSwitch)
    {
        COLORS = colorSwitch;
    }

    public SuperTL(int layer, ColorArray colorSwitch)
    {
        this.layer = layer;
        COLORS = colorSwitch;
    }

    public void setLayer(int layer)
    {
        this.layer = layer;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(layer == 0)
        {
            draw(offsetX, 0, g2d);
        }
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(layer == 1)
        {
            draw(offsetX, 0, g2d);
        }
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(layer == 2)
        {
            draw(offsetX, 0, g2d);
        }
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(layer == 3)
        {
            draw(offsetX, 0, g2d);
        }
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(layer == 4)
        {
            draw(offsetX, 0, g2d);
        }
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(layer == 5)
        {
            draw(offsetX, 0, g2d);
        }
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
    }

    public SuperC cloneC()
    {
        Class [] classParm = null;
        Object [] objectParm = null;
        Class c = this.getClass();
        try
        {
            java.lang.reflect.Constructor co = c.getConstructor(classParm);
            return (SuperC) co.newInstance(objectParm);
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
