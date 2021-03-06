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
public class TopLower6_1 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower6_1()
    {
        super(2);
        sch = true;
    }

    public TopLower6_1(int layer)
    {
        super(layer);
        sch = true;
    }

    public TopLower6_1(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        sch = true;
    }

    public TopLower6_1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        sch = true;
    }

//    public void draw(int x, int y, GraphicsMap g2d)
//    {
//        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
//        g2d.fillRect(113 + x, 71 + y, 4, 1);
//        g2d.fillRect(107 + x, 70 + y, 6, 1);
//        g2d.fillRect(117 + x, 69 + y, 1, 4);
//        g2d.fillRect(103 + x, 66 + y, 1, 7);
//        g2d.fillRect(116 + x, 63 + y, 1, 6);
//        g2d.fillRect(102 + x, 60 + y, 1, 6);
//        g2d.fillRect(101 + x, 59 + y, 1, 1);
//        g2d.fillRect(100 + x, 57 + y, 1, 2);
//        g2d.fillRect(117 + x, 56 + y, 1, 7);
//        g2d.fillRect(104 + x, 71 + y, 1, 2);
//        g2d.fillRect(105 + x, 71 + y, 2, 1);
//        g2d.fillRect(118 + x, 72 + y, 1, 1);
//
//        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
//        g2d.fillRect(106 + x, 69 + y, 1, 1);
//        g2d.fillRect(104 + x, 67 + y, 1, 4);
//        g2d.fillRect(115 + x, 66 + y, 1, 5);
//        g2d.fillRect(103 + x, 60 + y, 1, 6);
//        g2d.fillRect(102 + x, 59 + y, 1, 1);
//        g2d.fillRect(101 + x, 57 + y, 1, 2);
//        g2d.fillRect(116 + x, 56 + y, 1, 7);
//        g2d.fillRect(105 + x, 68 + y, 1, 3);
//        g2d.fillRect(114 + x, 70 + y, 1, 1);
//        g2d.fillRect(116 + x, 69 + y, 1, 2);
//
//        g2d.setColor(COLORS.get(ImageUtilities.GREY));
//        g2d.fillRect(106 + x, 70 + y, 1, 1);
//        g2d.fillRect(100 + x, 56 + y, 16, 1);
//        g2d.fillRect(102 + x, 57 + y, 14, 2);
//        g2d.fillRect(103 + x, 59 + y, 13, 1);
//        g2d.fillRect(104 + x, 60 + y, 1, 7);
//        g2d.fillRect(105 + x, 66 + y, 1, 2);
//        g2d.fillRect(106 + x, 67 + y, 1, 2);
//        g2d.fillRect(107 + x, 68 + y, 1, 1);
//        g2d.fillRect(107 + x, 69 + y, 3, 1);
//        g2d.fillRect(105 + x, 63 + y, 1, 1);
//        g2d.fillRect(105 + x, 62 + y, 3, 1);
//        g2d.fillRect(105 + x, 60 + y, 11, 2);
//        g2d.fillRect(112 + x, 62 + y, 4, 1);
//        g2d.fillRect(114 + x, 63 + y, 2, 2);
//        g2d.fillRect(113 + x, 65 + y, 3, 1);
//        g2d.fillRect(113 + x, 66 + y, 2, 3);
//        g2d.fillRect(114 + x, 69 + y, 1, 1);
//
//        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
//        g2d.fillRect(108 + x, 62 + y, 4, 1);
//        g2d.fillRect(106 + x, 63 + y, 8, 1);
//        g2d.fillRect(105 + x, 64 + y, 9, 1);
//        g2d.fillRect(105 + x, 65 + y, 8, 1);
//        g2d.fillRect(106 + x, 66 + y, 7, 1);
//        g2d.fillRect(107 + x, 67 + y, 6, 1);
//        g2d.fillRect(108 + x, 68 + y, 5, 1);
//        g2d.fillRect(110 + x, 69 + y, 4, 1);
//        g2d.fillRect(113 + x, 70 + y, 1, 1);
//    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 7);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 6);
        g2d.fillRect(116 + x, 63 + y, 1, 5);
        g2d.fillRect(103 + x, 66 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 6);
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(107 + x, 76 + y, 6, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(105 + x, 77 + y, 2, 1);
        g2d.fillRect(113 + x, 77 + y, 4, 1);
        g2d.fillRect(103 + x, 78 + y, 2, 1);
        g2d.fillRect(117 + x, 78 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 7);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 6);
        g2d.fillRect(115 + x, 65 + y, 1, 12);
        g2d.fillRect(104 + x, 66 + y, 1, 12);
        g2d.fillRect(116 + x, 68 + y, 1, 9);
        g2d.fillRect(105 + x, 70 + y, 1, 7);
        g2d.fillRect(117 + x, 70 + y, 1, 8);
        g2d.fillRect(103 + x, 73 + y, 1, 5);
        g2d.fillRect(118 + x, 73 + y, 1, 5);
        g2d.fillRect(114 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 4);
        g2d.fillRect(104 + x, 56 + y, 1, 10);
        g2d.fillRect(105 + x, 56 + y, 1, 8);
        g2d.fillRect(106 + x, 56 + y, 1, 7);
        g2d.fillRect(107 + x, 56 + y, 1, 7);
        g2d.fillRect(108 + x, 56 + y, 1, 6);
        g2d.fillRect(109 + x, 56 + y, 1, 6);
        g2d.fillRect(110 + x, 56 + y, 1, 6);
        g2d.fillRect(111 + x, 56 + y, 1, 6);
        g2d.fillRect(112 + x, 56 + y, 1, 7);
        g2d.fillRect(113 + x, 56 + y, 1, 7);
        g2d.fillRect(114 + x, 56 + y, 1, 20);
        g2d.fillRect(115 + x, 56 + y, 1, 9);
        g2d.fillRect(113 + x, 65 + y, 1, 9);
        g2d.fillRect(105 + x, 66 + y, 1, 4);
        g2d.fillRect(106 + x, 68 + y, 1, 9);
        g2d.fillRect(107 + x, 70 + y, 1, 6);
        g2d.fillRect(108 + x, 72 + y, 1, 4);
        g2d.fillRect(109 + x, 74 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 62 + y, 1, 10);
        g2d.fillRect(109 + x, 62 + y, 1, 12);
        g2d.fillRect(110 + x, 62 + y, 1, 14);
        g2d.fillRect(111 + x, 62 + y, 1, 14);
        g2d.fillRect(106 + x, 63 + y, 1, 5);
        g2d.fillRect(107 + x, 63 + y, 1, 7);
        g2d.fillRect(112 + x, 63 + y, 1, 13);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 3);
    }

}
