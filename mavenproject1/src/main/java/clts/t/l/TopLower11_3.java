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
public class TopLower11_3 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower11_3()
    {
        super(2);
        sch = true;
    }

    public TopLower11_3(int layer)
    {
        super(layer);
        sch = true;
    }

    public TopLower11_3(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        sch = true;
    }

    public TopLower11_3(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        sch = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 4, 1);
        g2d.fillRect(116 + x, 73 + y, 2, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 3);
        g2d.fillRect(110 + x, 74 + y, 6, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(118 + x, 75 + y, 1, 2);
        g2d.fillRect(120 + x, 75 + y, 1, 1);
        g2d.fillRect(100 + x, 76 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(99 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(102 + x, 56 + y, 1, 5);
        g2d.fillRect(116 + x, 56 + y, 1, 6);
        g2d.fillRect(103 + x, 58 + y, 1, 7);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 3);
        g2d.fillRect(104 + x, 63 + y, 1, 6);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 2, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 5);
        g2d.fillRect(110 + x, 66 + y, 2, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 3);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 2, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 3);
        g2d.fillRect(107 + x, 70 + y, 2, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(104 + x, 71 + y, 1, 3);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 2, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 74 + y, 1, 3);
        g2d.fillRect(107 + x, 74 + y, 1, 4);
        g2d.fillRect(108 + x, 74 + y, 1, 2);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 2, 1);
        g2d.fillRect(109 + x, 75 + y, 3, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 4);
        g2d.fillRect(102 + x, 76 + y, 1, 2);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(110 + x, 76 + y, 1, 2);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 2, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 3);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 78 + y, 1, 2);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 2, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 55 + y, 1, 7);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 7);
        g2d.fillRect(105 + x, 56 + y, 1, 9);
        g2d.fillRect(106 + x, 56 + y, 1, 9);
        g2d.fillRect(107 + x, 56 + y, 1, 8);
        g2d.fillRect(108 + x, 56 + y, 1, 7);
        g2d.fillRect(109 + x, 56 + y, 1, 7);
        g2d.fillRect(111 + x, 56 + y, 1, 5);
        g2d.fillRect(112 + x, 56 + y, 1, 4);
        g2d.fillRect(113 + x, 56 + y, 1, 4);
        g2d.fillRect(114 + x, 56 + y, 1, 6);
        g2d.fillRect(115 + x, 56 + y, 1, 5);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 3);
        g2d.fillRect(113 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 3, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 6);
        g2d.fillRect(105 + x, 66 + y, 1, 4);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 66 + y, 1, 5);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 2, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 3, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 4);
        g2d.fillRect(110 + x, 70 + y, 2, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 2, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 2, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 60 + y, 2, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 2, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 2, 1);
        g2d.fillRect(106 + x, 68 + y, 3, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 2, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
    }
}
