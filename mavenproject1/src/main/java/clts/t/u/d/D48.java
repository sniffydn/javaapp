/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.d;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D48 extends D49
{
    public D48()
    {
        super();
    }

    public D48(String middle)
    {
        super(middle);
    }

    public D48(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
    }
    
    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {    
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);    
        prevPrevPrevY = prevPrevY;
        prevPrevY = prevY;
        prevY = offsetY;
    }
}
