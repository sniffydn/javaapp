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
import util.ColorArray;
import java.util.Hashtable;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower5 extends SuperTL
{
    ImageUtilities [] images = null;
    /** Creates a new instance of GenericClothes */
    public TopLower5()
    {
        super(2);
        prep = true;
    }

    public TopLower5(int layer)
    {
        super(layer);
        prep = true;
    }

    public TopLower5(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        prep = true;
    }

    public TopLower5(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        prep = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 79 + y, 3, 1);
        g2d.fillRect(101 + x, 79 + y, 4, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 2);
        g2d.fillRect(108 + x, 74 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 9);
        g2d.fillRect(112 + x, 63 + y, 1, 11);
        g2d.fillRect(113 + x, 56 + y, 1, 7);
        g2d.fillRect(108 + x, 56 + y, 1, 9);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 2);
        g2d.fillRect(109 + x, 74 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 3);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 3);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 6, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 1, 3);
        g2d.fillRect(111 + x, 70 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 76 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 2);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 2, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 2, 2);
        g2d.fillRect(110 + x, 62 + y, 2, 3);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 3, 1);
        g2d.fillRect(109 + x, 56 + y, 4, 3);
    }
}
