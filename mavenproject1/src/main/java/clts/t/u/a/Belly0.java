/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperTL;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Belly0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Belly0()
    {
        super(2);
    }

    public Belly0(int layer)
    {
        super(layer);
    }

    public Belly0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Belly0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }    
    
    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintH(offsetX,0,g2d);
    }
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 3);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
    }

}
