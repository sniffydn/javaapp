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
public class Braclets1 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Braclets1()
    {
        super(2);
    }

    public Braclets1(int layer)
    {
        super(layer);
    }

    public Braclets1(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Braclets1(int layer, ColorArray colorSwitch)
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
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(90 + x, 80 + y, 1, 1);
        g2d.fillRect(96 + x, 80 + y, 1, 1);
        g2d.fillRect(92 + x, 81 + y, 1, 1);
        g2d.fillRect(94 + x, 81 + y, 1, 1);
        g2d.fillRect(91 + x, 82 + y, 1, 1);
        g2d.fillRect(91 + x, 84 + y, 1, 1);
        g2d.fillRect(91 + x, 86 + y, 1, 1);
        g2d.fillRect(90 + x, 88 + y, 1, 1);
        g2d.fillRect(92 + x, 88 + y, 1, 1);
        g2d.fillRect(89 + x, 89 + y, 1, 1);
        g2d.fillRect(93 + x, 89 + y, 1, 1);
        g2d.fillRect(90 + x, 90 + y, 1, 1);
        g2d.fillRect(92 + x, 90 + y, 1, 1);
        g2d.fillRect(91 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(90 + x, 79 + y, 1, 1);
        g2d.fillRect(96 + x, 79 + y, 1, 1);
        g2d.fillRect(91 + x, 81 + y, 1, 1);
        g2d.fillRect(93 + x, 81 + y, 1, 1);
        g2d.fillRect(95 + x, 81 + y, 1, 1);
        g2d.fillRect(90 + x, 82 + y, 1, 2);
        g2d.fillRect(91 + x, 85 + y, 1, 1);
        g2d.fillRect(91 + x, 87 + y, 1, 1);
        g2d.fillRect(90 + x, 89 + y, 3, 1);
        g2d.fillRect(91 + x, 90 + y, 1, 1);
    }

}
