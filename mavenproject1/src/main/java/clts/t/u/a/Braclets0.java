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
public class Braclets0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Braclets0()
    {
        super(2);
    }

    public Braclets0(int layer)
    {
        super(layer);
    }

    public Braclets0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Braclets0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {
        
    }
    
    
    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintH(offsetX,0,g2d);
    }
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(92 + x, 75 + y, 1, 3);
        g2d.fillRect(94 + x, 75 + y, 1, 3);
        g2d.fillRect(96 + x, 75 + y, 1, 3);
        g2d.fillRect(91 + x, 76 + y, 1, 1);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(95 + x, 76 + y, 1, 1);
        g2d.fillRect(97 + x, 76 + y, 1, 1);
    }
}
