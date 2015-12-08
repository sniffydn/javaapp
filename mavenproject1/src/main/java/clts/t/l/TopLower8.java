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
public class TopLower8 extends SuperTL
{
    ImageUtilities [] images = null;
    /** Creates a new instance of GenericClothes */
    public TopLower8()
    {
        super(2);
        shuni = true;
    }

    public TopLower8(int layer)
    {
        super(layer);
        shuni = true;
    }

    public TopLower8(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        shuni = true;
    }

    public TopLower8(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        shuni = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 7);
        g2d.fillRect(102 + x, 64 + y, 15, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 4);
        g2d.fillRect(101 + x, 55 + y, 1, 5);
        g2d.fillRect(102 + x, 55 + y, 1, 8);
        g2d.fillRect(104 + x, 65 + y, 2, 1);
        g2d.fillRect(115 + x, 65 + y, 2, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 8);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 79 + y, 1, 3);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(105 + x, 78 + y, 1, 4);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 3, 1);
        g2d.fillRect(106 + x, 65 + y, 3, 1);
        g2d.fillRect(115 + x, 66 + y, 2, 1);
        g2d.fillRect(102 + x, 83 + y, 3, 1);
        g2d.fillRect(103 + x, 55 + y, 14, 8);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 5);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 3);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 84 + y, 3, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 5);
        g2d.fillRect(114 + x, 74 + y, 1, 8);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 7);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 19);
        g2d.fillRect(109 + x, 65 + y, 3, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 16);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 63 + y, 2, 1);
        g2d.fillRect(102 + x, 63 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 3);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 71 + y, 1, 4);
        g2d.fillRect(112 + x, 70 + y, 1, 11);
        g2d.fillRect(116 + x, 68 + y, 1, 6);
        g2d.fillRect(107 + x, 68 + y, 1, 13);
        g2d.fillRect(113 + x, 67 + y, 1, 3);
        g2d.fillRect(109 + x, 67 + y, 1, 14);
        g2d.fillRect(100 + x, 82 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 3);
        g2d.fillRect(109 + x, 81 + y, 1, 3);
        g2d.fillRect(107 + x, 81 + y, 1, 3);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 2);
        g2d.fillRect(115 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 7);
        g2d.fillRect(105 + x, 67 + y, 1, 9);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 3);
        g2d.fillRect(108 + x, 67 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 63 + y, 2, 1);
        g2d.fillRect(104 + x, 63 + y, 3, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 3);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 4);
        g2d.fillRect(104 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 5);
        g2d.fillRect(113 + x, 70 + y, 1, 4);
        g2d.fillRect(108 + x, 69 + y, 1, 10);
        g2d.fillRect(111 + x, 68 + y, 1, 15);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(115 + x, 80 + y, 1, 3);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 5);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(117 + x, 70 + y, 1, 3);

//        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(122 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);

    }
}
