/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.l;

import clts.SuperTL;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower1_8 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower1_8()
    {
        super(2);
        sch = true;
        prep = true;
    }

    public TopLower1_8(int layer)
    {
        super(layer);
        sch = true;
        prep = true;
    }

    public TopLower1_8(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        sch = true;
        prep = true;
    }

    public TopLower1_8(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        sch = true;
        prep = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        x = x + 84;
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(20 + x, 75 + y, 1, 1);
        g2d.fillRect(21 + x, 74 + y, 2, 1);
        g2d.fillRect(23 + x, 73 + y, 1, 1);
        g2d.fillRect(18 + x, 73 + y, 1, 4);
        g2d.fillRect(24 + x, 72 + y, 2, 1);
        g2d.fillRect(26 + x, 71 + y, 1, 1);
        g2d.fillRect(27 + x, 70 + y, 2, 1);
        g2d.fillRect(29 + x, 69 + y, 2, 1);
        g2d.fillRect(19 + x, 65 + y, 1, 8);
        g2d.fillRect(32 + x, 62 + y, 1, 7);
        g2d.fillRect(18 + x, 62 + y, 1, 3);
        g2d.fillRect(33 + x, 56 + y, 1, 6);
        g2d.fillRect(31 + x, 68 + y, 1, 1);
        g2d.fillRect(19 + x, 76 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(21 + x, 73 + y, 2, 1);
        g2d.fillRect(19 + x, 73 + y, 1, 3);
        g2d.fillRect(23 + x, 72 + y, 1, 1);
        g2d.fillRect(24 + x, 71 + y, 2, 1);
        g2d.fillRect(26 + x, 70 + y, 1, 1);
        g2d.fillRect(27 + x, 69 + y, 2, 1);
        g2d.fillRect(29 + x, 68 + y, 2, 1);
        g2d.fillRect(20 + x, 65 + y, 1, 8);
        g2d.fillRect(31 + x, 62 + y, 1, 6);
        g2d.fillRect(19 + x, 62 + y, 1, 3);
        g2d.fillRect(18 + x, 60 + y, 1, 2);
        g2d.fillRect(17 + x, 59 + y, 1, 1);
        g2d.fillRect(32 + x, 55 + y, 1, 7);
        g2d.fillRect(15 + x, 55 + y, 2, 1);
        g2d.fillRect(16 + x, 56 + y, 1, 3);
        g2d.fillRect(20 + x, 74 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(20 + x, 73 + y, 1, 1);
        g2d.fillRect(17 + x, 55 + y, 15, 4);
        g2d.fillRect(18 + x, 59 + y, 14, 1);
        g2d.fillRect(19 + x, 60 + y, 13, 2);
        g2d.fillRect(20 + x, 62 + y, 11, 3);
        g2d.fillRect(21 + x, 65 + y, 10, 3);
        g2d.fillRect(21 + x, 68 + y, 8, 1);
        g2d.fillRect(21 + x, 69 + y, 6, 1);
        g2d.fillRect(21 + x, 70 + y, 5, 1);
        g2d.fillRect(21 + x, 71 + y, 3, 1);
        g2d.fillRect(21 + x, 72 + y, 2, 1);
    }
}
