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
public class TopLower17 extends SuperTL
{
    ImageUtilities [] images = null;
    /** Creates a new instance of GenericClothes */
    public TopLower17()
    {
        super(2);
    }

    public TopLower17(int layer)
    {
        super(layer);
    }

    public TopLower17(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public TopLower17(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 58 + y, 1, 20);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 16);
        g2d.fillRect(112 + x, 61 + y, 1, 17);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 1, 3);
        g2d.fillRect(104 + x, 62 + y, 1, 14);
        g2d.fillRect(106 + x, 62 + y, 1, 15);
        g2d.fillRect(114 + x, 63 + y, 1, 15);
        g2d.fillRect(116 + x, 63 + y, 1, 13);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(101 + x, 66 + y, 1, 1);
        g2d.fillRect(100 + x, 67 + y, 1, 2);
        g2d.fillRect(102 + x, 67 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(101 + x, 69 + y, 1, 2);
        g2d.fillRect(102 + x, 69 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 5);
        g2d.fillRect(100 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(99 + x, 73 + y, 1, 1);
        g2d.fillRect(101 + x, 74 + y, 1, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 57 + y, 1, 3);
        g2d.fillRect(111 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 4);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 3);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 5);
        g2d.fillRect(115 + x, 67 + y, 1, 3);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(105 + x, 73 + y, 1, 3);
        g2d.fillRect(113 + x, 74 + y, 1, 3);
        g2d.fillRect(107 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 60 + y, 1, 4);
        g2d.fillRect(111 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 61 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 4);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 5);
        g2d.fillRect(115 + x, 70 + y, 1, 6);
        g2d.fillRect(105 + x, 71 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 6);
        g2d.fillRect(109 + x, 72 + y, 1, 5);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 63 + y, 1, 8);
        g2d.fillRect(109 + x, 64 + y, 1, 8);
        g2d.fillRect(113 + x, 64 + y, 1, 5);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 7);
    }
}
