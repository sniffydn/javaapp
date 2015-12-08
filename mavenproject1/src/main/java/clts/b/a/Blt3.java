/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b.a;

import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Blt3 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Blt3()
    {
        super();
    }

    public Blt3(int layer)
    {
        super(layer);
    }

    public Blt3(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public Blt3(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        y+=shiftY;
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 83 + y, 2, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
    }
}
