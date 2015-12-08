/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts;

import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class GenericC extends SuperC
{
    public String middle = "c";

    public GenericC()
    {

    }

    /** Creates a new instance of GenericClothes */
    public GenericC(String middle)
    {
        this.middle = middle;
    }

    public GenericC(String middle, ColorArray colorSwitch)
    {
        this.middle = middle;
        COLORS = colorSwitch;
    }

    public void setMiddle(String middle)
    {
        this.middle = middle;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
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
