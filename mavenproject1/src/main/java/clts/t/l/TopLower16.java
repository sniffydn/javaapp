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
public class TopLower16 extends SuperTL
{
    ImageUtilities [] images = null;
    /** Creates a new instance of GenericClothes */
    public TopLower16()
    {
        super(2);
        shuni = true;
    }

    public TopLower16(int layer)
    {
        super(layer);
        shuni = true;
    }

    public TopLower16(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        shuni = true;
    }

    public TopLower16(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        shuni = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 2, 1);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 3);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 1);
        g2d.fillRect(102 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(117 + x, 66 + y, 1, 2);
        g2d.fillRect(103 + x, 67 + y, 1, 3);
        g2d.fillRect(106 + x, 67 + y, 1, 4);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 3);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(118 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
    }
}
