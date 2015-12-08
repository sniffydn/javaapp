/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

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
public class Bot34 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot34()
    {
        super();
        jean = true;
        skt = true;
    }

    public Bot34(int layer)
    {
        super(layer);
        jean = true;
        skt = true;
    }

    public Bot34(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        skt = true;
    }

    public Bot34(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 97, 2, 1);
        g2d.fillRect(121 + x, 98, 1, 1);
        g2d.fillRect(118 + x, 99, 2, 1);
        g2d.fillRect(97 + x, 100, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 97, 1, 1);
        g2d.fillRect(102 + x, 98, 1, 3);
        g2d.fillRect(107 + x, 98, 1, 1);
        g2d.fillRect(98 + x, 100, 1, 1);
        g2d.fillRect(99 + x, 101, 1, 1);
        g2d.fillRect(108 + x, 101, 1, 2);
        g2d.fillRect(109 + x, 102, 3, 1);
        g2d.fillRect(123 + x, 104, 1, 1);
        g2d.fillRect(121 + x, 105, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 84, 1, 3);
        g2d.fillRect(111 + x, 84, 1, 4);
        g2d.fillRect(120 + x, 89, 1, 2);
        g2d.fillRect(103 + x, 90, 1, 10);
        g2d.fillRect(121 + x, 92, 1, 2);
        g2d.fillRect(113 + x, 93, 1, 1);
        g2d.fillRect(114 + x, 94, 1, 2);
        g2d.fillRect(118 + x, 94, 1, 5);
        g2d.fillRect(122 + x, 94, 1, 2);
        g2d.fillRect(115 + x, 95, 1, 2);
        g2d.fillRect(102 + x, 96, 1, 2);
        g2d.fillRect(116 + x, 96, 1, 1);
        g2d.fillRect(117 + x, 97, 1, 9);
        g2d.fillRect(104 + x, 98, 3, 1);
        g2d.fillRect(108 + x, 98, 1, 2);
        g2d.fillRect(120 + x, 99, 1, 1);
        g2d.fillRect(101 + x, 100, 1, 2);
        g2d.fillRect(118 + x, 100, 1, 1);
        g2d.fillRect(102 + x, 101, 1, 2);
        g2d.fillRect(113 + x, 101, 1, 2);
        g2d.fillRect(114 + x, 101, 1, 3);
        g2d.fillRect(115 + x, 101, 1, 4);
        g2d.fillRect(116 + x, 101, 1, 4);
        g2d.fillRect(112 + x, 102, 1, 1);
        g2d.fillRect(109 + x, 103, 1, 3);
        g2d.fillRect(111 + x, 103, 1, 1);
        g2d.fillRect(118 + x, 104, 1, 2);
        g2d.fillRect(122 + x, 104, 1, 1);
        g2d.fillRect(119 + x, 105, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 81, 1, 2);
        g2d.fillRect(120 + x, 81, 1, 8);
        g2d.fillRect(101 + x, 82, 1, 1);
        g2d.fillRect(117 + x, 82, 3, 1);
        g2d.fillRect(102 + x, 83, 2, 1);
        g2d.fillRect(105 + x, 83, 1, 1);
        g2d.fillRect(112 + x, 83, 3, 1);
        g2d.fillRect(116 + x, 83, 1, 4);
        g2d.fillRect(119 + x, 83, 1, 4);
        g2d.fillRect(101 + x, 84, 1, 3);
        g2d.fillRect(107 + x, 84, 1, 10);
        g2d.fillRect(109 + x, 84, 2, 1);
        g2d.fillRect(115 + x, 84, 1, 1);
        g2d.fillRect(104 + x, 85, 1, 8);
        g2d.fillRect(110 + x, 85, 1, 3);
        g2d.fillRect(100 + x, 87, 1, 2);
        g2d.fillRect(103 + x, 87, 1, 3);
        g2d.fillRect(106 + x, 87, 1, 1);
        g2d.fillRect(108 + x, 87, 1, 9);
        g2d.fillRect(99 + x, 88, 1, 5);
        g2d.fillRect(111 + x, 88, 1, 2);
        g2d.fillRect(117 + x, 88, 1, 4);
        g2d.fillRect(121 + x, 88, 1, 4);
        g2d.fillRect(112 + x, 89, 1, 4);
        g2d.fillRect(102 + x, 92, 1, 4);
        g2d.fillRect(113 + x, 92, 1, 1);
        g2d.fillRect(122 + x, 92, 1, 2);
        g2d.fillRect(98 + x, 93, 1, 3);
        g2d.fillRect(114 + x, 93, 1, 1);
        g2d.fillRect(118 + x, 93, 1, 1);
        g2d.fillRect(113 + x, 94, 1, 1);
        g2d.fillRect(115 + x, 94, 1, 1);
        g2d.fillRect(121 + x, 94, 1, 2);
        g2d.fillRect(97 + x, 95, 1, 3);
        g2d.fillRect(109 + x, 95, 1, 7);
        g2d.fillRect(117 + x, 95, 1, 2);
        g2d.fillRect(123 + x, 95, 2, 1);
        g2d.fillRect(114 + x, 96, 1, 1);
        g2d.fillRect(122 + x, 96, 1, 3);
        g2d.fillRect(95 + x, 97, 2, 1);
        g2d.fillRect(115 + x, 97, 2, 1);
        g2d.fillRect(110 + x, 98, 1, 1);
        g2d.fillRect(116 + x, 98, 1, 1);
        g2d.fillRect(119 + x, 98, 2, 1);
        g2d.fillRect(123 + x, 98, 1, 1);
        g2d.fillRect(101 + x, 99, 1, 1);
        g2d.fillRect(104 + x, 99, 3, 1);
        g2d.fillRect(103 + x, 100, 1, 1);
        g2d.fillRect(107 + x, 100, 2, 1);
        g2d.fillRect(119 + x, 100, 1, 3);
        g2d.fillRect(98 + x, 101, 1, 1);
        g2d.fillRect(100 + x, 101, 1, 1);
        g2d.fillRect(118 + x, 101, 1, 1);
        g2d.fillRect(97 + x, 103, 1, 1);
        g2d.fillRect(102 + x, 103, 1, 4);
        g2d.fillRect(110 + x, 103, 1, 5);
        g2d.fillRect(112 + x, 103, 1, 1);
        g2d.fillRect(101 + x, 105, 1, 1);
        g2d.fillRect(103 + x, 106, 3, 1);
        g2d.fillRect(116 + x, 106, 1, 2);
        g2d.fillRect(109 + x, 107, 1, 1);
        g2d.fillRect(113 + x, 107, 3, 1);
        g2d.fillRect(117 + x, 107, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 79, 1, 2);
        g2d.fillRect(100 + x, 80, 1, 1);
        g2d.fillRect(116 + x, 80, 1, 2);
        g2d.fillRect(117 + x, 80, 2, 1);
        g2d.fillRect(101 + x, 81, 1, 1);
        g2d.fillRect(110 + x, 81, 6, 1);
        g2d.fillRect(121 + x, 82, 1, 6);
        g2d.fillRect(100 + x, 83, 1, 4);
        g2d.fillRect(101 + x, 83, 1, 1);
        g2d.fillRect(117 + x, 83, 2, 1);
        g2d.fillRect(103 + x, 84, 1, 3);
        g2d.fillRect(112 + x, 84, 1, 3);
        g2d.fillRect(118 + x, 84, 1, 1);
        g2d.fillRect(108 + x, 85, 1, 2);
        g2d.fillRect(99 + x, 86, 1, 2);
        g2d.fillRect(116 + x, 87, 1, 1);
        g2d.fillRect(122 + x, 87, 1, 5);
        g2d.fillRect(110 + x, 88, 1, 1);
        g2d.fillRect(98 + x, 89, 1, 4);
        g2d.fillRect(109 + x, 89, 1, 3);
        g2d.fillRect(102 + x, 90, 1, 2);
        g2d.fillRect(111 + x, 90, 1, 1);
        g2d.fillRect(110 + x, 91, 1, 3);
        g2d.fillRect(113 + x, 91, 1, 1);
        g2d.fillRect(117 + x, 92, 1, 3);
        g2d.fillRect(97 + x, 93, 1, 2);
        g2d.fillRect(104 + x, 93, 1, 5);
        g2d.fillRect(123 + x, 93, 1, 2);
        g2d.fillRect(101 + x, 94, 1, 5);
        g2d.fillRect(107 + x, 94, 1, 1);
        g2d.fillRect(96 + x, 95, 1, 2);
        g2d.fillRect(111 + x, 95, 1, 2);
        g2d.fillRect(108 + x, 96, 1, 2);
        g2d.fillRect(114 + x, 97, 1, 1);
        g2d.fillRect(96 + x, 99, 1, 1);
        g2d.fillRect(100 + x, 99, 1, 1);
        g2d.fillRect(107 + x, 99, 1, 1);
        g2d.fillRect(110 + x, 99, 1, 3);
        g2d.fillRect(121 + x, 99, 1, 1);
        g2d.fillRect(105 + x, 100, 2, 1);
        g2d.fillRect(106 + x, 101, 1, 3);
        g2d.fillRect(107 + x, 101, 1, 3);
        g2d.fillRect(111 + x, 101, 1, 1);
        g2d.fillRect(122 + x, 101, 1, 1);
        g2d.fillRect(98 + x, 102, 1, 1);
        g2d.fillRect(100 + x, 102, 2, 1);
        g2d.fillRect(105 + x, 102, 1, 1);
        g2d.fillRect(118 + x, 102, 1, 2);
        g2d.fillRect(123 + x, 102, 1, 2);
        g2d.fillRect(101 + x, 103, 1, 1);
        g2d.fillRect(113 + x, 103, 1, 3);
        g2d.fillRect(119 + x, 103, 1, 1);
        g2d.fillRect(114 + x, 104, 1, 1);
        g2d.fillRect(107 + x, 105, 1, 2);
        g2d.fillRect(108 + x, 105, 1, 1);
        g2d.fillRect(115 + x, 105, 2, 1);
        g2d.fillRect(106 + x, 106, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 80, 1, 2);
        g2d.fillRect(102 + x, 81, 2, 1);
        g2d.fillRect(105 + x, 81, 1, 2);
        g2d.fillRect(106 + x, 81, 1, 3);
        g2d.fillRect(107 + x, 81, 1, 1);
        g2d.fillRect(110 + x, 82, 5, 1);
        g2d.fillRect(104 + x, 83, 1, 1);
        g2d.fillRect(115 + x, 83, 1, 1);
        g2d.fillRect(101 + x, 87, 1, 3);
        g2d.fillRect(105 + x, 88, 1, 3);
        g2d.fillRect(113 + x, 88, 1, 3);
        g2d.fillRect(118 + x, 89, 1, 3);
        g2d.fillRect(100 + x, 90, 1, 1);
        g2d.fillRect(112 + x, 93, 1, 1);
        g2d.fillRect(119 + x, 93, 1, 3);
        g2d.fillRect(100 + x, 94, 1, 1);
        g2d.fillRect(110 + x, 95, 1, 3);
        g2d.fillRect(113 + x, 95, 1, 1);
        g2d.fillRect(113 + x, 97, 1, 2);
        g2d.fillRect(99 + x, 98, 1, 1);
        g2d.fillRect(111 + x, 98, 1, 2);
        g2d.fillRect(98 + x, 99, 1, 1);
        g2d.fillRect(104 + x, 100, 1, 1);
        g2d.fillRect(120 + x, 100, 2, 1);
        g2d.fillRect(121 + x, 101, 1, 1);
        g2d.fillRect(120 + x, 103, 2, 1);
        g2d.fillRect(104 + x, 104, 1, 1);
        g2d.fillRect(108 + x, 104, 1, 1);
        g2d.fillRect(119 + x, 104, 1, 1);
        g2d.fillRect(114 + x, 105, 1, 2);
        g2d.fillRect(112 + x, 106, 1, 1);
        g2d.fillRect(115 + x, 106, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 80, 1, 1);
        g2d.fillRect(108 + x, 81, 2, 1);
        g2d.fillRect(102 + x, 84, 1, 1);
        g2d.fillRect(113 + x, 84, 1, 1);
        g2d.fillRect(117 + x, 84, 1, 2);
        g2d.fillRect(118 + x, 85, 1, 3);
        g2d.fillRect(105 + x, 87, 1, 1);
        g2d.fillRect(119 + x, 87, 1, 6);
        g2d.fillRect(102 + x, 88, 1, 2);
        g2d.fillRect(106 + x, 88, 1, 4);
        g2d.fillRect(110 + x, 89, 1, 2);
        g2d.fillRect(114 + x, 89, 1, 4);
        g2d.fillRect(111 + x, 91, 1, 1);
        g2d.fillRect(115 + x, 91, 1, 3);
        g2d.fillRect(120 + x, 91, 1, 5);
        g2d.fillRect(111 + x, 93, 1, 2);
        g2d.fillRect(116 + x, 93, 1, 3);
        g2d.fillRect(110 + x, 94, 1, 1);
        g2d.fillRect(107 + x, 95, 1, 1);
        g2d.fillRect(112 + x, 96, 1, 2);
        g2d.fillRect(121 + x, 96, 1, 1);
        g2d.fillRect(115 + x, 99, 2, 1);
        g2d.fillRect(111 + x, 100, 1, 1);
        g2d.fillRect(116 + x, 100, 1, 1);
        g2d.fillRect(103 + x, 101, 1, 1);
        g2d.fillRect(105 + x, 101, 1, 1);
        g2d.fillRect(112 + x, 101, 1, 1);
        g2d.fillRect(120 + x, 101, 1, 2);
        g2d.fillRect(101 + x, 104, 1, 1);
        g2d.fillRect(112 + x, 104, 1, 2);
        g2d.fillRect(120 + x, 104, 1, 1);
        g2d.fillRect(103 + x, 105, 1, 1);
        g2d.fillRect(105 + x, 105, 2, 1);
        g2d.fillRect(113 + x, 106, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 80, 2, 1);
        g2d.fillRect(102 + x, 82, 3, 1);
        g2d.fillRect(107 + x, 83, 3, 1);
        g2d.fillRect(114 + x, 85, 1, 2);
        g2d.fillRect(113 + x, 87, 1, 1);
        g2d.fillRect(115 + x, 87, 1, 1);
        g2d.fillRect(116 + x, 88, 1, 2);
        g2d.fillRect(100 + x, 91, 1, 1);
        g2d.fillRect(105 + x, 91, 1, 1);
        g2d.fillRect(98 + x, 96, 1, 1);
        g2d.fillRect(105 + x, 96, 2, 1);
        g2d.fillRect(113 + x, 96, 1, 1);
        g2d.fillRect(99 + x, 97, 1, 1);
        g2d.fillRect(97 + x, 98, 1, 2);
        g2d.fillRect(114 + x, 98, 1, 2);
        g2d.fillRect(115 + x, 98, 1, 1);
        g2d.fillRect(99 + x, 99, 1, 1);
        g2d.fillRect(112 + x, 100, 2, 1);
        g2d.fillRect(104 + x, 101, 1, 1);
        g2d.fillRect(99 + x, 102, 1, 1);
        g2d.fillRect(103 + x, 102, 1, 1);
        g2d.fillRect(121 + x, 102, 1, 1);
        g2d.fillRect(122 + x, 103, 1, 1);
        g2d.fillRect(98 + x, 104, 1, 1);
        g2d.fillRect(103 + x, 104, 1, 1);
        g2d.fillRect(111 + x, 105, 1, 1);
        g2d.fillRect(111 + x, 107, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(117 + x, 81, 3, 1);
        g2d.fillRect(107 + x, 82, 3, 1);
        g2d.fillRect(115 + x, 82, 2, 1);
        g2d.fillRect(110 + x, 83, 2, 1);
        g2d.fillRect(104 + x, 84, 2, 1);
        g2d.fillRect(108 + x, 84, 1, 1);
        g2d.fillRect(102 + x, 85, 1, 3);
        g2d.fillRect(105 + x, 85, 1, 2);
        g2d.fillRect(109 + x, 85, 1, 4);
        g2d.fillRect(113 + x, 85, 1, 2);
        g2d.fillRect(117 + x, 86, 1, 2);
        g2d.fillRect(112 + x, 87, 1, 2);
        g2d.fillRect(114 + x, 87, 1, 2);
        g2d.fillRect(115 + x, 88, 1, 3);
        g2d.fillRect(118 + x, 88, 1, 1);
        g2d.fillRect(100 + x, 89, 1, 1);
        g2d.fillRect(101 + x, 90, 1, 4);
        g2d.fillRect(116 + x, 90, 1, 3);
        g2d.fillRect(106 + x, 92, 1, 4);
        g2d.fillRect(109 + x, 92, 1, 3);
        g2d.fillRect(111 + x, 92, 1, 1);
        g2d.fillRect(118 + x, 92, 1, 1);
        g2d.fillRect(112 + x, 94, 1, 2);
        g2d.fillRect(100 + x, 95, 1, 4);
        g2d.fillRect(119 + x, 96, 1, 2);
        g2d.fillRect(120 + x, 96, 1, 2);
        g2d.fillRect(121 + x, 97, 1, 1);
        g2d.fillRect(112 + x, 98, 1, 1);
        g2d.fillRect(99 + x, 100, 2, 1);
        g2d.fillRect(104 + x, 102, 1, 2);
        g2d.fillRect(99 + x, 103, 2, 1);
        g2d.fillRect(105 + x, 103, 1, 2);
        g2d.fillRect(108 + x, 103, 1, 1);
        g2d.fillRect(106 + x, 104, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(114 + x, 84, 1, 1);
        g2d.fillRect(115 + x, 85, 1, 2);
        g2d.fillRect(100 + x, 92, 1, 2);
        g2d.fillRect(105 + x, 92, 1, 4);
        g2d.fillRect(99 + x, 93, 1, 4);
        g2d.fillRect(107 + x, 96, 1, 1);
        g2d.fillRect(98 + x, 97, 1, 2);
        g2d.fillRect(111 + x, 97, 1, 1);
        g2d.fillRect(112 + x, 99, 2, 1);
        g2d.fillRect(114 + x, 100, 2, 1);
        g2d.fillRect(122 + x, 102, 1, 1);
        g2d.fillRect(98 + x, 103, 1, 1);
        g2d.fillRect(103 + x, 103, 1, 1);
        g2d.fillRect(99 + x, 104, 2, 1);
        g2d.fillRect(111 + x, 104, 1, 1);
        g2d.fillRect(121 + x, 104, 1, 1);
        g2d.fillRect(104 + x, 105, 1, 1);
        g2d.fillRect(111 + x, 106, 1, 1);
    }
}
