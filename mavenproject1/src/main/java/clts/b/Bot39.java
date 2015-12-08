/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b;

import clts.SuperB;
import clts.SuperC;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot39 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot39()
    {
        super();
        skt = true;
    }

    public Bot39(int layer)
    {
        super(layer);
        skt = true;
    }

    public Bot39(ColorArray colorSwitch)
    {
        super(colorSwitch);
        skt = true;
    }

    public Bot39(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(100 + x, 87, 1, 1);
        g2d.fillRect(120 + x, 81, 1, 1);
        g2d.fillRect(117 + x, 82, 2, 1);
        g2d.fillRect(109 + x, 83, 2, 1);
        g2d.fillRect(101 + x, 84, 2, 1);
        g2d.fillRect(104 + x, 84, 4, 1);
        g2d.fillRect(100 + x, 85, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(117 + x, 84, 1, 1);
        g2d.fillRect(119 + x, 84, 1, 1);
        g2d.fillRect(110 + x, 85, 1, 1);
        g2d.fillRect(112 + x, 85, 1, 1);
        g2d.fillRect(114 + x, 85, 1, 1);
        g2d.fillRect(99 + x, 86, 1, 1);
        g2d.fillRect(101 + x, 86, 2, 1);
        g2d.fillRect(104 + x, 86, 1, 1);
        g2d.fillRect(106 + x, 86, 1, 1);
        g2d.fillRect(108 + x, 86, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(115 + x, 82, 2, 1);
        g2d.fillRect(119 + x, 82, 2, 1);
        g2d.fillRect(111 + x, 83, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(121 + x, 83, 1, 1);
        g2d.fillRect(116 + x, 84, 1, 1);
        g2d.fillRect(118 + x, 84, 1, 1);
        g2d.fillRect(111 + x, 85, 1, 1);
        g2d.fillRect(113 + x, 85, 1, 1);
        g2d.fillRect(105 + x, 86, 1, 1);
        g2d.fillRect(107 + x, 86, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 83, 2, 1);
        g2d.fillRect(103 + x, 87, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 82, 1, 1);
        g2d.fillRect(116 + x, 83, 1, 1);
        g2d.fillRect(118 + x, 83, 3, 1);
        g2d.fillRect(110 + x, 84, 4, 1);
        g2d.fillRect(115 + x, 84, 1, 1);
        g2d.fillRect(101 + x, 85, 2, 1);
        g2d.fillRect(104 + x, 85, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 84, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 83, 1, 1);
        g2d.fillRect(101 + x, 88, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 83, 1, 1);
        g2d.fillRect(114 + x, 84, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 79, 1, 2);
        g2d.fillRect(100 + x, 80, 1, 5);
        g2d.fillRect(102 + x, 80, 2, 1);
        g2d.fillRect(104 + x, 81, 1, 1);
        g2d.fillRect(102 + x, 83, 1, 1);
        g2d.fillRect(115 + x, 85, 1, 1);
        g2d.fillRect(113 + x, 86, 1, 1);
        g2d.fillRect(99 + x, 87, 1, 1);
        g2d.fillRect(102 + x, 87, 1, 1);
        g2d.fillRect(99 + x, 89, 1, 1);
        g2d.fillRect(105 + x, 90, 1, 1);
        g2d.fillRect(99 + x, 91, 1, 1);
        g2d.fillRect(105 + x, 92, 1, 7);
        g2d.fillRect(99 + x, 93, 1, 1);
        g2d.fillRect(98 + x, 95, 1, 1);
        g2d.fillRect(107 + x, 95, 1, 5);
        g2d.fillRect(109 + x, 95, 1, 1);
        g2d.fillRect(99 + x, 96, 1, 1);
        g2d.fillRect(101 + x, 96, 1, 1);
        g2d.fillRect(104 + x, 96, 1, 3);
        g2d.fillRect(116 + x, 96, 1, 1);
        g2d.fillRect(121 + x, 96, 1, 1);
        g2d.fillRect(98 + x, 97, 1, 1);
        g2d.fillRect(100 + x, 97, 1, 1);
        g2d.fillRect(106 + x, 97, 1, 3);
        g2d.fillRect(109 + x, 97, 1, 1);
        g2d.fillRect(117 + x, 97, 1, 1);
        g2d.fillRect(101 + x, 98, 1, 2);
        g2d.fillRect(116 + x, 98, 1, 1);
        g2d.fillRect(121 + x, 98, 1, 1);
        g2d.fillRect(102 + x, 99, 2, 1);
        g2d.fillRect(108 + x, 99, 1, 1);
        g2d.fillRect(110 + x, 99, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 83, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 80, 10, 1);
        g2d.fillRect(115 + x, 80, 1, 1);
        g2d.fillRect(102 + x, 81, 1, 1);
        g2d.fillRect(101 + x, 82, 1, 1);
        g2d.fillRect(103 + x, 82, 1, 1);
        g2d.fillRect(105 + x, 82, 1, 1);
        g2d.fillRect(107 + x, 82, 1, 1);
        g2d.fillRect(109 + x, 82, 1, 1);
        g2d.fillRect(103 + x, 84, 1, 1);
        g2d.fillRect(121 + x, 84, 1, 1);
        g2d.fillRect(118 + x, 85, 1, 3);
        g2d.fillRect(115 + x, 86, 1, 1);
        g2d.fillRect(105 + x, 87, 1, 3);
        g2d.fillRect(106 + x, 87, 1, 1);
        g2d.fillRect(113 + x, 87, 1, 3);
        g2d.fillRect(116 + x, 87, 1, 9);
        g2d.fillRect(121 + x, 87, 1, 9);
        g2d.fillRect(99 + x, 88, 1, 1);
        g2d.fillRect(112 + x, 88, 1, 8);
        g2d.fillRect(119 + x, 88, 1, 2);
        g2d.fillRect(101 + x, 89, 1, 7);
        g2d.fillRect(106 + x, 89, 1, 8);
        g2d.fillRect(109 + x, 89, 1, 1);
        g2d.fillRect(99 + x, 90, 1, 1);
        g2d.fillRect(114 + x, 90, 1, 2);
        g2d.fillRect(104 + x, 91, 1, 5);
        g2d.fillRect(105 + x, 91, 1, 1);
        g2d.fillRect(109 + x, 91, 1, 4);
        g2d.fillRect(99 + x, 92, 1, 1);
        g2d.fillRect(118 + x, 92, 1, 7);
        g2d.fillRect(107 + x, 93, 1, 2);
        g2d.fillRect(98 + x, 94, 2, 1);
        g2d.fillRect(108 + x, 94, 1, 1);
        g2d.fillRect(99 + x, 95, 1, 1);
        g2d.fillRect(114 + x, 95, 1, 3);
        g2d.fillRect(117 + x, 95, 1, 2);
        g2d.fillRect(122 + x, 95, 1, 4);
        g2d.fillRect(98 + x, 96, 1, 1);
        g2d.fillRect(109 + x, 96, 1, 1);
        g2d.fillRect(99 + x, 97, 1, 1);
        g2d.fillRect(101 + x, 97, 1, 1);
        g2d.fillRect(116 + x, 97, 1, 1);
        g2d.fillRect(121 + x, 97, 1, 1);
        g2d.fillRect(123 + x, 97, 1, 1);
        g2d.fillRect(109 + x, 98, 1, 1);
        g2d.fillRect(119 + x, 98, 2, 1);
        g2d.fillRect(111 + x, 99, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(103 + x, 85, 1, 2);
        g2d.fillRect(100 + x, 86, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(119 + x, 79, 1, 3);
        g2d.fillRect(114 + x, 80, 1, 1);
        g2d.fillRect(116 + x, 80, 3, 1);
        g2d.fillRect(101 + x, 81, 1, 1);
        g2d.fillRect(103 + x, 81, 1, 1);
        g2d.fillRect(105 + x, 81, 4, 1);
        g2d.fillRect(110 + x, 81, 1, 2);
        g2d.fillRect(113 + x, 81, 1, 2);
        g2d.fillRect(115 + x, 81, 1, 1);
        g2d.fillRect(117 + x, 81, 1, 1);
        g2d.fillRect(102 + x, 82, 1, 1);
        g2d.fillRect(104 + x, 82, 1, 2);
        g2d.fillRect(106 + x, 82, 1, 2);
        g2d.fillRect(108 + x, 82, 1, 2);
        g2d.fillRect(111 + x, 82, 2, 1);
        g2d.fillRect(114 + x, 82, 1, 1);
        g2d.fillRect(105 + x, 83, 1, 1);
        g2d.fillRect(120 + x, 84, 1, 1);
        g2d.fillRect(116 + x, 85, 1, 2);
        g2d.fillRect(117 + x, 85, 1, 10);
        g2d.fillRect(119 + x, 85, 1, 3);
        g2d.fillRect(121 + x, 85, 1, 2);
        g2d.fillRect(122 + x, 85, 1, 3);
        g2d.fillRect(112 + x, 86, 1, 2);
        g2d.fillRect(101 + x, 87, 1, 1);
        g2d.fillRect(104 + x, 87, 1, 4);
        g2d.fillRect(107 + x, 87, 1, 1);
        g2d.fillRect(109 + x, 87, 1, 2);
        g2d.fillRect(115 + x, 87, 1, 2);
        g2d.fillRect(106 + x, 88, 1, 1);
        g2d.fillRect(108 + x, 88, 1, 1);
        g2d.fillRect(118 + x, 88, 1, 4);
        g2d.fillRect(107 + x, 89, 1, 4);
        g2d.fillRect(114 + x, 89, 1, 1);
        g2d.fillRect(123 + x, 89, 1, 1);
        g2d.fillRect(109 + x, 90, 1, 1);
        g2d.fillRect(111 + x, 90, 1, 9);
        g2d.fillRect(113 + x, 90, 1, 9);
        g2d.fillRect(119 + x, 90, 1, 2);
        g2d.fillRect(114 + x, 92, 1, 3);
        g2d.fillRect(103 + x, 93, 1, 6);
        g2d.fillRect(119 + x, 93, 1, 5);
        g2d.fillRect(122 + x, 94, 1, 1);
        g2d.fillRect(124 + x, 94, 1, 4);
        g2d.fillRect(108 + x, 96, 1, 3);
        g2d.fillRect(112 + x, 96, 1, 3);
        g2d.fillRect(115 + x, 96, 1, 3);
        g2d.fillRect(123 + x, 96, 1, 1);
        g2d.fillRect(110 + x, 97, 1, 2);
        g2d.fillRect(120 + x, 97, 1, 1);
        g2d.fillRect(102 + x, 98, 1, 1);
        g2d.fillRect(114 + x, 98, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(109 + x, 81, 1, 1);
        g2d.fillRect(111 + x, 81, 2, 1);
        g2d.fillRect(114 + x, 81, 1, 1);
        g2d.fillRect(116 + x, 81, 1, 1);
        g2d.fillRect(118 + x, 81, 1, 1);
        g2d.fillRect(107 + x, 83, 1, 1);
        g2d.fillRect(120 + x, 85, 1, 12);
        g2d.fillRect(109 + x, 86, 3, 1);
        g2d.fillRect(114 + x, 86, 1, 3);
        g2d.fillRect(108 + x, 87, 1, 1);
        g2d.fillRect(110 + x, 87, 1, 10);
        g2d.fillRect(111 + x, 87, 1, 3);
        g2d.fillRect(100 + x, 88, 1, 9);
        g2d.fillRect(102 + x, 88, 1, 10);
        g2d.fillRect(103 + x, 88, 1, 5);
        g2d.fillRect(107 + x, 88, 1, 1);
        g2d.fillRect(122 + x, 88, 1, 6);
        g2d.fillRect(108 + x, 89, 1, 5);
        g2d.fillRect(115 + x, 89, 1, 7);
        g2d.fillRect(123 + x, 90, 1, 6);
        g2d.fillRect(119 + x, 92, 1, 1);
        g2d.fillRect(108 + x, 95, 1, 1);
    }
}
