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
public class TopLower1_4 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower1_4()
    {
        super(2);
        sch = true;
        prep = true;
    }

    public TopLower1_4(int layer)
    {
        super(layer);
        sch = true;
        prep = true;
    }

    public TopLower1_4(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        sch = true;
        prep = true;
    }

    public TopLower1_4(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        sch = true;
        prep = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 9);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(113 + x, 65 + y, 2, 1);
        g2d.fillRect(111 + x, 66 + y, 2, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 2, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 2, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 7);
        g2d.fillRect(103 + x, 58 + y, 1, 7);
        g2d.fillRect(113 + x, 64 + y, 2, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 4);
        g2d.fillRect(111 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 2, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 2, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 56 + y, 14, 1);
        g2d.fillRect(103 + x, 57 + y, 12, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 7);
        g2d.fillRect(105 + x, 58 + y, 1, 11);
        g2d.fillRect(106 + x, 58 + y, 1, 11);
        g2d.fillRect(107 + x, 58 + y, 1, 10);
        g2d.fillRect(108 + x, 58 + y, 1, 9);
        g2d.fillRect(109 + x, 58 + y, 1, 9);
        g2d.fillRect(110 + x, 58 + y, 1, 8);
        g2d.fillRect(111 + x, 58 + y, 1, 7);
        g2d.fillRect(112 + x, 58 + y, 1, 7);
        g2d.fillRect(113 + x, 58 + y, 1, 6);
        g2d.fillRect(114 + x, 58 + y, 1, 6);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
    }
}
