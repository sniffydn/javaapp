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
import util.ColorArray;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower4 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower4()
    {
        super(2);
        sch = true;
        prep = true;
    }

    public TopLower4(int layer)
    {
        super(layer);
        sch = true;
        prep = true;
    }

    public TopLower4(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        sch = true;
        prep = true;
    }

    public TopLower4(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        sch = true;
        prep = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(102 + x, 56 + y, 1, 9);
        g2d.fillRect(103 + x, 64 + y, 1, 11);
        g2d.fillRect(102 + x, 73 + y, 1, 5);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(116 + x, 56 + y, 1, 14);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 7);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 56 + y, 2, 8);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 2, 10);
        g2d.fillRect(103 + x, 75 + y, 2, 3);
        g2d.fillRect(102 + x, 78 + y, 2, 1);
        g2d.fillRect(102 + x, 79 + y, 17, 1);
        g2d.fillRect(114 + x, 56 + y, 2, 14);
        g2d.fillRect(115 + x, 70 + y, 2, 1);
        g2d.fillRect(116 + x, 71 + y, 2, 3);
        g2d.fillRect(117 + x, 74 + y, 2, 5);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 75 + y, 1, 4);
        g2d.fillRect(116 + x, 74 + y, 1, 5);
        g2d.fillRect(115 + x, 71 + y, 1, 3);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 10);
        g2d.fillRect(113 + x, 56 + y, 1, 14);
        g2d.fillRect(105 + x, 56 + y, 1, 9);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 10, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 56 + y, 1, 9);
        g2d.fillRect(106 + x, 75 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 6, 22);
        g2d.fillRect(113 + x, 70 + y, 1, 8);
        g2d.fillRect(114 + x, 71 + y, 1, 7);
        g2d.fillRect(115 + x, 74 + y, 1, 4);
    }
}
