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
public class Bot37 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot37()
    {
        super();
        jean = true;
        skt = true;
    }

    public Bot37(int layer)
    {
        super(layer);
        jean = true;
        skt = true;
    }

    public Bot37(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        skt = true;
    }

    public Bot37(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(102 + x, 79, 1, 2);
        g2d.fillRect(100 + x, 80, 1, 1);
        g2d.fillRect(99 + x, 82, 1, 1);
        g2d.fillRect(113 + x, 82, 1, 1);
        g2d.fillRect(112 + x, 83, 1, 1);
        g2d.fillRect(97 + x, 84, 1, 1);
        g2d.fillRect(95 + x, 86, 1, 1);
        g2d.fillRect(99 + x, 87, 1, 1);
        g2d.fillRect(127 + x, 87, 1, 1);
        g2d.fillRect(95 + x, 88, 1, 1);
        g2d.fillRect(98 + x, 88, 1, 1);
        g2d.fillRect(100 + x, 88, 1, 1);
        g2d.fillRect(97 + x, 89, 1, 1);
        g2d.fillRect(125 + x, 89, 1, 1);
        g2d.fillRect(129 + x, 89, 1, 1);
        g2d.fillRect(103 + x, 90, 1, 1);
        g2d.fillRect(124 + x, 90, 1, 1);
        g2d.fillRect(105 + x, 91, 1, 1);
        g2d.fillRect(123 + x, 91, 1, 1);
        g2d.fillRect(128 + x, 91, 1, 1);
        g2d.fillRect(104 + x, 92, 1, 2);
        g2d.fillRect(106 + x, 92, 2, 1);
        g2d.fillRect(109 + x, 92, 1, 1);
        g2d.fillRect(111 + x, 92, 1, 1);
        g2d.fillRect(113 + x, 92, 1, 1);
        g2d.fillRect(124 + x, 92, 1, 1);
        g2d.fillRect(126 + x, 92, 1, 1);
        g2d.fillRect(100 + x, 93, 1, 1);
        g2d.fillRect(115 + x, 93, 1, 1);
        g2d.fillRect(123 + x, 93, 1, 1);
        g2d.fillRect(125 + x, 93, 1, 1);
        g2d.fillRect(127 + x, 93, 1, 1);
        g2d.fillRect(110 + x, 94, 1, 1);
        g2d.fillRect(114 + x, 94, 1, 2);
        g2d.fillRect(116 + x, 94, 1, 1);
        g2d.fillRect(124 + x, 94, 1, 1);
        g2d.fillRect(102 + x, 95, 1, 1);
        g2d.fillRect(117 + x, 95, 1, 1);
        g2d.fillRect(120 + x, 95, 1, 1);
        g2d.fillRect(110 + x, 96, 1, 1);
        g2d.fillRect(113 + x, 96, 1, 1);
        g2d.fillRect(115 + x, 96, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 79, 1, 1);
        g2d.fillRect(104 + x, 81, 1, 1);
        g2d.fillRect(111 + x, 82, 1, 1);
        g2d.fillRect(114 + x, 82, 1, 1);
        g2d.fillRect(98 + x, 83, 1, 1);
        g2d.fillRect(96 + x, 85, 1, 1);
        g2d.fillRect(99 + x, 86, 1, 1);
        g2d.fillRect(127 + x, 86, 1, 1);
        g2d.fillRect(98 + x, 87, 1, 1);
        g2d.fillRect(129 + x, 88, 1, 1);
        g2d.fillRect(100 + x, 90, 2, 1);
        g2d.fillRect(99 + x, 91, 1, 1);
        g2d.fillRect(122 + x, 91, 1, 1);
        g2d.fillRect(100 + x, 92, 1, 1);
        g2d.fillRect(114 + x, 92, 1, 1);
        g2d.fillRect(118 + x, 92, 1, 1);
        g2d.fillRect(120 + x, 92, 1, 1);
        g2d.fillRect(119 + x, 93, 1, 1);
        g2d.fillRect(102 + x, 94, 1, 1);
        g2d.fillRect(109 + x, 95, 1, 1);
        g2d.fillRect(111 + x, 96, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 79, 1, 2);
        g2d.fillRect(104 + x, 79, 1, 1);
        g2d.fillRect(101 + x, 80, 1, 3);
        g2d.fillRect(106 + x, 80, 1, 2);
        g2d.fillRect(107 + x, 80, 2, 1);
        g2d.fillRect(100 + x, 81, 1, 1);
        g2d.fillRect(102 + x, 81, 1, 1);
        g2d.fillRect(108 + x, 81, 1, 2);
        g2d.fillRect(112 + x, 81, 1, 1);
        g2d.fillRect(119 + x, 81, 1, 2);
        g2d.fillRect(120 + x, 81, 1, 2);
        g2d.fillRect(109 + x, 82, 2, 1);
        g2d.fillRect(115 + x, 82, 4, 1);
        g2d.fillRect(121 + x, 82, 1, 1);
        g2d.fillRect(100 + x, 83, 1, 1);
        g2d.fillRect(113 + x, 83, 2, 1);
        g2d.fillRect(98 + x, 84, 1, 3);
        g2d.fillRect(96 + x, 86, 1, 4);
        g2d.fillRect(97 + x, 86, 1, 1);
        g2d.fillRect(95 + x, 87, 1, 1);
        g2d.fillRect(128 + x, 87, 1, 2);
        g2d.fillRect(97 + x, 88, 1, 1);
        g2d.fillRect(99 + x, 88, 1, 2);
        g2d.fillRect(126 + x, 88, 1, 4);
        g2d.fillRect(98 + x, 89, 1, 1);
        g2d.fillRect(101 + x, 89, 1, 1);
        g2d.fillRect(127 + x, 89, 1, 1);
        g2d.fillRect(102 + x, 90, 1, 3);
        g2d.fillRect(123 + x, 90, 1, 1);
        g2d.fillRect(125 + x, 90, 1, 3);
        g2d.fillRect(128 + x, 90, 2, 1);
        g2d.fillRect(103 + x, 91, 1, 2);
        g2d.fillRect(104 + x, 91, 1, 1);
        g2d.fillRect(106 + x, 91, 1, 1);
        g2d.fillRect(124 + x, 91, 1, 1);
        g2d.fillRect(127 + x, 91, 1, 2);
        g2d.fillRect(101 + x, 92, 1, 2);
        g2d.fillRect(108 + x, 92, 1, 1);
        g2d.fillRect(110 + x, 92, 1, 1);
        g2d.fillRect(112 + x, 92, 1, 1);
        g2d.fillRect(117 + x, 92, 1, 1);
        g2d.fillRect(121 + x, 92, 1, 4);
        g2d.fillRect(123 + x, 92, 1, 1);
        g2d.fillRect(105 + x, 93, 1, 3);
        g2d.fillRect(106 + x, 93, 1, 2);
        g2d.fillRect(107 + x, 93, 1, 1);
        g2d.fillRect(111 + x, 93, 1, 2);
        g2d.fillRect(114 + x, 93, 1, 1);
        g2d.fillRect(116 + x, 93, 1, 1);
        g2d.fillRect(122 + x, 93, 1, 1);
        g2d.fillRect(108 + x, 94, 1, 2);
        g2d.fillRect(109 + x, 94, 1, 1);
        g2d.fillRect(112 + x, 94, 1, 2);
        g2d.fillRect(113 + x, 94, 1, 2);
        g2d.fillRect(118 + x, 94, 1, 2);
        g2d.fillRect(119 + x, 94, 1, 2);
        g2d.fillRect(123 + x, 94, 1, 1);
        g2d.fillRect(125 + x, 94, 1, 1);
        g2d.fillRect(103 + x, 95, 2, 1);
        g2d.fillRect(116 + x, 95, 1, 1);
        g2d.fillRect(109 + x, 96, 1, 1);
        g2d.fillRect(114 + x, 96, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 81, 1, 1);
        g2d.fillRect(100 + x, 82, 1, 1);
        g2d.fillRect(102 + x, 82, 1, 1);
        g2d.fillRect(106 + x, 82, 1, 2);
        g2d.fillRect(107 + x, 82, 1, 1);
        g2d.fillRect(99 + x, 83, 1, 3);
        g2d.fillRect(101 + x, 83, 1, 1);
        g2d.fillRect(108 + x, 83, 1, 1);
        g2d.fillRect(100 + x, 84, 1, 1);
        g2d.fillRect(103 + x, 84, 1, 1);
        g2d.fillRect(116 + x, 84, 1, 1);
        g2d.fillRect(124 + x, 84, 1, 1);
        g2d.fillRect(97 + x, 85, 1, 1);
        g2d.fillRect(125 + x, 85, 1, 1);
        g2d.fillRect(100 + x, 86, 2, 1);
        g2d.fillRect(126 + x, 86, 1, 2);
        g2d.fillRect(106 + x, 87, 1, 1);
        g2d.fillRect(101 + x, 88, 1, 1);
        g2d.fillRect(125 + x, 88, 1, 1);
        g2d.fillRect(102 + x, 89, 2, 1);
        g2d.fillRect(105 + x, 89, 1, 2);
        g2d.fillRect(106 + x, 89, 1, 2);
        g2d.fillRect(123 + x, 89, 2, 1);
        g2d.fillRect(104 + x, 90, 1, 1);
        g2d.fillRect(112 + x, 90, 1, 2);
        g2d.fillRect(117 + x, 90, 1, 1);
        g2d.fillRect(122 + x, 90, 1, 1);
        g2d.fillRect(107 + x, 91, 5, 1);
        g2d.fillRect(113 + x, 91, 4, 1);
        g2d.fillRect(119 + x, 91, 1, 1);
        g2d.fillRect(115 + x, 92, 1, 1);
        g2d.fillRect(108 + x, 93, 1, 1);
        g2d.fillRect(107 + x, 94, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 80, 2, 1);
        g2d.fillRect(118 + x, 80, 1, 2);
        g2d.fillRect(119 + x, 80, 1, 1);
        g2d.fillRect(105 + x, 81, 1, 1);
        g2d.fillRect(107 + x, 81, 1, 1);
        g2d.fillRect(109 + x, 81, 3, 1);
        g2d.fillRect(114 + x, 81, 4, 1);
        g2d.fillRect(112 + x, 82, 1, 1);
        g2d.fillRect(115 + x, 83, 3, 1);
        g2d.fillRect(122 + x, 83, 1, 1);
        g2d.fillRect(113 + x, 84, 1, 2);
        g2d.fillRect(114 + x, 84, 1, 1);
        g2d.fillRect(117 + x, 84, 1, 1);
        g2d.fillRect(123 + x, 84, 1, 1);
        g2d.fillRect(100 + x, 87, 1, 1);
        g2d.fillRect(127 + x, 88, 1, 1);
        g2d.fillRect(99 + x, 90, 1, 1);
        g2d.fillRect(127 + x, 90, 1, 1);
        g2d.fillRect(101 + x, 91, 1, 1);
        g2d.fillRect(120 + x, 91, 2, 1);
        g2d.fillRect(116 + x, 92, 1, 1);
        g2d.fillRect(119 + x, 92, 1, 1);
        g2d.fillRect(122 + x, 92, 1, 1);
        g2d.fillRect(109 + x, 93, 2, 1);
        g2d.fillRect(106 + x, 95, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 81, 1, 1);
        g2d.fillRect(103 + x, 82, 2, 1);
        g2d.fillRect(104 + x, 83, 1, 2);
        g2d.fillRect(110 + x, 83, 2, 1);
        g2d.fillRect(118 + x, 83, 1, 3);
        g2d.fillRect(119 + x, 83, 1, 2);
        g2d.fillRect(120 + x, 83, 2, 1);
        g2d.fillRect(101 + x, 84, 1, 1);
        g2d.fillRect(106 + x, 84, 1, 3);
        g2d.fillRect(108 + x, 84, 1, 3);
        g2d.fillRect(109 + x, 84, 1, 2);
        g2d.fillRect(111 + x, 84, 2, 1);
        g2d.fillRect(122 + x, 84, 1, 1);
        g2d.fillRect(100 + x, 85, 1, 1);
        g2d.fillRect(112 + x, 85, 1, 1);
        g2d.fillRect(114 + x, 85, 1, 2);
        g2d.fillRect(116 + x, 85, 2, 1);
        g2d.fillRect(124 + x, 85, 1, 1);
        g2d.fillRect(105 + x, 86, 1, 3);
        g2d.fillRect(107 + x, 86, 1, 5);
        g2d.fillRect(113 + x, 86, 1, 1);
        g2d.fillRect(125 + x, 86, 1, 2);
        g2d.fillRect(101 + x, 87, 2, 1);
        g2d.fillRect(118 + x, 87, 1, 5);
        g2d.fillRect(119 + x, 87, 1, 3);
        g2d.fillRect(102 + x, 88, 3, 1);
        g2d.fillRect(106 + x, 88, 1, 1);
        g2d.fillRect(123 + x, 88, 2, 1);
        g2d.fillRect(104 + x, 89, 1, 1);
        g2d.fillRect(108 + x, 89, 1, 1);
        g2d.fillRect(116 + x, 89, 1, 2);
        g2d.fillRect(117 + x, 89, 1, 1);
        g2d.fillRect(120 + x, 89, 1, 2);
        g2d.fillRect(122 + x, 89, 1, 1);
        g2d.fillRect(109 + x, 90, 3, 1);
        g2d.fillRect(114 + x, 90, 2, 1);
        g2d.fillRect(121 + x, 90, 1, 1);
        g2d.fillRect(117 + x, 91, 1, 1);
        g2d.fillRect(117 + x, 93, 1, 1);
        g2d.fillRect(120 + x, 94, 1, 1);
        g2d.fillRect(122 + x, 94, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 83, 1, 1);
        g2d.fillRect(115 + x, 84, 1, 2);
        g2d.fillRect(101 + x, 85, 1, 1);
        g2d.fillRect(122 + x, 85, 1, 1);
        g2d.fillRect(116 + x, 86, 1, 3);
        g2d.fillRect(118 + x, 86, 1, 1);
        g2d.fillRect(120 + x, 86, 1, 1);
        g2d.fillRect(123 + x, 86, 1, 2);
        g2d.fillRect(109 + x, 88, 1, 1);
        g2d.fillRect(117 + x, 88, 1, 1);
        g2d.fillRect(120 + x, 88, 3, 1);
        g2d.fillRect(113 + x, 89, 1, 1);
        g2d.fillRect(124 + x, 93, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 83, 1, 4);
        g2d.fillRect(105 + x, 83, 1, 3);
        g2d.fillRect(107 + x, 84, 1, 2);
        g2d.fillRect(110 + x, 84, 1, 3);
        g2d.fillRect(120 + x, 84, 1, 2);
        g2d.fillRect(103 + x, 85, 1, 1);
        g2d.fillRect(119 + x, 85, 1, 1);
        g2d.fillRect(123 + x, 85, 1, 1);
        g2d.fillRect(109 + x, 86, 1, 1);
        g2d.fillRect(112 + x, 86, 1, 1);
        g2d.fillRect(103 + x, 87, 2, 1);
        g2d.fillRect(108 + x, 87, 1, 2);
        g2d.fillRect(115 + x, 87, 1, 1);
        g2d.fillRect(109 + x, 89, 2, 1);
        g2d.fillRect(115 + x, 89, 1, 1);
        g2d.fillRect(121 + x, 89, 1, 1);
        g2d.fillRect(119 + x, 90, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 82, 1, 1);
        g2d.fillRect(107 + x, 83, 1, 1);
        g2d.fillRect(109 + x, 83, 1, 1);
        g2d.fillRect(123 + x, 83, 1, 1);
        g2d.fillRect(121 + x, 84, 1, 2);
        g2d.fillRect(111 + x, 85, 1, 5);
        g2d.fillRect(103 + x, 86, 2, 1);
        g2d.fillRect(115 + x, 86, 1, 1);
        g2d.fillRect(117 + x, 86, 1, 2);
        g2d.fillRect(119 + x, 86, 1, 1);
        g2d.fillRect(124 + x, 86, 1, 2);
        g2d.fillRect(109 + x, 87, 2, 1);
        g2d.fillRect(113 + x, 87, 1, 2);
        g2d.fillRect(114 + x, 87, 1, 1);
        g2d.fillRect(120 + x, 87, 3, 1);
        g2d.fillRect(110 + x, 88, 1, 1);
        g2d.fillRect(112 + x, 88, 1, 2);
        g2d.fillRect(115 + x, 88, 1, 1);
        g2d.fillRect(114 + x, 89, 1, 1);
        g2d.fillRect(108 + x, 90, 1, 1);
        g2d.fillRect(113 + x, 90, 1, 1);
        g2d.fillRect(120 + x, 93, 1, 1);
        g2d.fillRect(117 + x, 94, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(122 + x, 82, 1, 1);
        g2d.fillRect(124 + x, 83, 1, 1);
        g2d.fillRect(125 + x, 84, 1, 1);
        g2d.fillRect(104 + x, 85, 1, 1);
        g2d.fillRect(121 + x, 86, 2, 1);
        g2d.fillRect(112 + x, 87, 1, 1);
        g2d.fillRect(114 + x, 88, 1, 1);
        g2d.fillRect(118 + x, 93, 1, 1);
    }
}
