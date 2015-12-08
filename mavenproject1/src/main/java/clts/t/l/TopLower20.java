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
public class TopLower20 extends SuperTL
{
    ImageUtilities [] images = null;
    /** Creates a new instance of GenericClothes */
    public TopLower20()
    {
        super(2);
        prep = true;
    }

    public TopLower20(int layer)
    {
        super(layer);
        prep = true;
    }

    public TopLower20(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        prep = true;
    }

    public TopLower20(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        prep = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 60 + y, 1, 5);
        g2d.fillRect(105 + x, 60 + y, 1, 14);
        g2d.fillRect(106 + x, 60 + y, 1, 14);
        g2d.fillRect(107 + x, 60 + y, 1, 14);
        g2d.fillRect(108 + x, 60 + y, 1, 14);
        g2d.fillRect(109 + x, 60 + y, 1, 14);
        g2d.fillRect(110 + x, 60 + y, 1, 14);
        g2d.fillRect(111 + x, 60 + y, 1, 14);
        g2d.fillRect(112 + x, 60 + y, 1, 14);
        g2d.fillRect(113 + x, 60 + y, 1, 14);
        g2d.fillRect(114 + x, 68 + y, 1, 6);
        g2d.fillRect(115 + x, 70 + y, 1, 4);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(102 + x, 56 + y, 1, 6);
        g2d.fillRect(103 + x, 56 + y, 1, 9);
        g2d.fillRect(104 + x, 56 + y, 1, 4);
        g2d.fillRect(105 + x, 56 + y, 1, 4);
        g2d.fillRect(106 + x, 56 + y, 1, 4);
        g2d.fillRect(107 + x, 56 + y, 1, 4);
        g2d.fillRect(108 + x, 56 + y, 1, 4);
        g2d.fillRect(109 + x, 56 + y, 1, 4);
        g2d.fillRect(110 + x, 56 + y, 1, 4);
        g2d.fillRect(111 + x, 56 + y, 1, 4);
        g2d.fillRect(112 + x, 56 + y, 1, 4);
        g2d.fillRect(113 + x, 56 + y, 1, 4);
        g2d.fillRect(114 + x, 56 + y, 1, 12);
        g2d.fillRect(115 + x, 56 + y, 1, 14);
        g2d.fillRect(116 + x, 56 + y, 1, 6);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(117 + x, 70 + y, 1, 5);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 13, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(102 + x, 62 + y, 1, 3);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 16, 1);
    }
}
