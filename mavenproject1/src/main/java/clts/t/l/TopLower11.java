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
public class TopLower11 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower11()
    {
        super(2);
        sch = true;
    }

    public TopLower11(int layer)
    {
        super(layer);
        sch = true;
    }

    public TopLower11(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        sch = true;
    }

    public TopLower11(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        sch = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 56 + y, 1, 7);
        g2d.fillRect(102 + x, 62 + y, 1, 3);
        g2d.fillRect(116 + x, 63 + y, 1, 5);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 9);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 2, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 2);
        g2d.fillRect(101 + x, 76 + y, 1, 3);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 4, 1);
        g2d.fillRect(116 + x, 76 + y, 2, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(110 + x, 77 + y, 6, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 2);
        g2d.fillRect(100 + x, 78 + y, 1, 3);
        g2d.fillRect(112 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(103 + x, 79 + y, 1, 2);
        g2d.fillRect(109 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 2);
        g2d.fillRect(116 + x, 79 + y, 1, 2);
        g2d.fillRect(121 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(99 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 3);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(104 + x, 64 + y, 1, 8);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 2, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 5);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 4);
        g2d.fillRect(110 + x, 69 + y, 2, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 6);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 3);
        g2d.fillRect(107 + x, 73 + y, 2, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(103 + x, 74 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 2, 1);
        g2d.fillRect(102 + x, 77 + y, 2, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 77 + y, 1, 4);
        g2d.fillRect(108 + x, 77 + y, 1, 2);
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 2, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 3, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 4);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 2, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 1, 3);
        g2d.fillRect(118 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 2, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 5);
        g2d.fillRect(104 + x, 56 + y, 1, 8);
        g2d.fillRect(105 + x, 56 + y, 1, 12);
        g2d.fillRect(106 + x, 56 + y, 1, 9);
        g2d.fillRect(107 + x, 56 + y, 1, 11);
        g2d.fillRect(108 + x, 56 + y, 1, 8);
        g2d.fillRect(109 + x, 56 + y, 1, 8);
        g2d.fillRect(110 + x, 56 + y, 1, 7);
        g2d.fillRect(111 + x, 56 + y, 1, 6);
        g2d.fillRect(112 + x, 56 + y, 1, 5);
        g2d.fillRect(113 + x, 56 + y, 1, 5);
        g2d.fillRect(114 + x, 56 + y, 1, 7);
        g2d.fillRect(115 + x, 56 + y, 1, 6);
        g2d.fillRect(116 + x, 56 + y, 1, 5);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 2, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 4);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 66 + y, 1, 4);
        g2d.fillRect(111 + x, 66 + y, 1, 3);
        g2d.fillRect(112 + x, 66 + y, 1, 8);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(114 + x, 68 + y, 1, 6);
        g2d.fillRect(105 + x, 69 + y, 1, 4);
        g2d.fillRect(106 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 69 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 6);
        g2d.fillRect(110 + x, 71 + y, 2, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 3, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 2, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 2);
        g2d.fillRect(108 + x, 74 + y, 2, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 2, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 2, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 61 + y, 2, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 2, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 2, 1);
        g2d.fillRect(106 + x, 71 + y, 3, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 2, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
    }
}
