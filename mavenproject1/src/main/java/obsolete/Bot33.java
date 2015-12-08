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
public class Bot33 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot33()
    {
        super();
        skt = true;
    }

    public Bot33(int layer)
    {
        super(layer);
        skt = true;
    }

    public Bot33(ColorArray colorSwitch)
    {
        super(colorSwitch);
        skt = true;
    }

    public Bot33(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(108 + x, 91, 1, 3);
        g2d.fillRect(107 + x, 94, 1, 3);
        g2d.fillRect(99 + x, 95, 1, 1);
        g2d.fillRect(98 + x, 96, 1, 2);
        g2d.fillRect(105 + x, 97, 1, 4);
        g2d.fillRect(97 + x, 98, 1, 1);
        g2d.fillRect(118 + x, 100, 1, 3);
        g2d.fillRect(104 + x, 103, 1, 2);
        g2d.fillRect(102 + x, 104, 2, 1);
        g2d.fillRect(105 + x, 104, 1, 2);
        g2d.fillRect(106 + x, 104, 1, 2);
        g2d.fillRect(107 + x, 105, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(99 + x, 83, 1, 2);
        g2d.fillRect(101 + x, 83, 1, 1);
        g2d.fillRect(120 + x, 83, 1, 4);
        g2d.fillRect(102 + x, 84, 1, 1);
        g2d.fillRect(118 + x, 84, 2, 1);
        g2d.fillRect(103 + x, 85, 1, 1);
        g2d.fillRect(115 + x, 85, 3, 1);
        g2d.fillRect(121 + x, 87, 1, 1);
        g2d.fillRect(108 + x, 88, 1, 3);
        g2d.fillRect(101 + x, 89, 1, 3);
        g2d.fillRect(121 + x, 89, 1, 1);
        g2d.fillRect(107 + x, 90, 1, 4);
        g2d.fillRect(120 + x, 90, 1, 3);
        g2d.fillRect(122 + x, 90, 1, 2);
        g2d.fillRect(100 + x, 91, 1, 3);
        g2d.fillRect(116 + x, 92, 1, 7);
        g2d.fillRect(121 + x, 92, 1, 2);
        g2d.fillRect(123 + x, 92, 1, 2);
        g2d.fillRect(99 + x, 93, 1, 2);
        g2d.fillRect(106 + x, 94, 1, 9);
        g2d.fillRect(108 + x, 94, 1, 4);
        g2d.fillRect(122 + x, 94, 1, 4);
        g2d.fillRect(124 + x, 94, 1, 1);
        g2d.fillRect(93 + x, 95, 2, 1);
        g2d.fillRect(98 + x, 95, 1, 1);
        g2d.fillRect(100 + x, 95, 1, 1);
        g2d.fillRect(125 + x, 95, 1, 1);
        g2d.fillRect(95 + x, 96, 2, 1);
        g2d.fillRect(99 + x, 96, 1, 2);
        g2d.fillRect(104 + x, 96, 1, 5);
        g2d.fillRect(117 + x, 96, 1, 2);
        g2d.fillRect(124 + x, 96, 1, 1);
        g2d.fillRect(97 + x, 97, 1, 1);
        g2d.fillRect(98 + x, 98, 1, 3);
        g2d.fillRect(107 + x, 98, 1, 2);
        g2d.fillRect(123 + x, 98, 1, 3);
        g2d.fillRect(96 + x, 99, 2, 1);
        g2d.fillRect(117 + x, 99, 1, 4);
        g2d.fillRect(118 + x, 99, 1, 1);
        g2d.fillRect(97 + x, 100, 1, 2);
        g2d.fillRect(124 + x, 100, 1, 1);
        g2d.fillRect(105 + x, 101, 1, 3);
        g2d.fillRect(107 + x, 101, 1, 1);
        g2d.fillRect(119 + x, 101, 1, 2);
        g2d.fillRect(121 + x, 101, 2, 1);
        g2d.fillRect(98 + x, 102, 1, 1);
        g2d.fillRect(104 + x, 102, 1, 1);
        g2d.fillRect(99 + x, 103, 2, 1);
        g2d.fillRect(102 + x, 103, 2, 1);
        g2d.fillRect(118 + x, 103, 1, 1);
        g2d.fillRect(101 + x, 104, 1, 1);
        g2d.fillRect(107 + x, 104, 3, 1);
        g2d.fillRect(117 + x, 104, 1, 1);
        g2d.fillRect(102 + x, 105, 3, 1);
        g2d.fillRect(110 + x, 105, 5, 1);
        g2d.fillRect(116 + x, 105, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(121 + x, 88, 1, 1);
        g2d.fillRect(116 + x, 91, 1, 1);
        g2d.fillRect(121 + x, 91, 1, 1);
        g2d.fillRect(100 + x, 94, 1, 1);
        g2d.fillRect(121 + x, 94, 1, 1);
        g2d.fillRect(104 + x, 95, 1, 1);
        g2d.fillRect(117 + x, 95, 1, 1);
        g2d.fillRect(123 + x, 96, 1, 1);
        g2d.fillRect(107 + x, 97, 1, 1);
        g2d.fillRect(99 + x, 98, 1, 1);
        g2d.fillRect(117 + x, 98, 1, 1);
        g2d.fillRect(107 + x, 100, 1, 1);
        g2d.fillRect(104 + x, 101, 1, 1);
        g2d.fillRect(120 + x, 102, 1, 1);
        g2d.fillRect(101 + x, 103, 1, 1);
        g2d.fillRect(106 + x, 103, 1, 1);
        g2d.fillRect(117 + x, 103, 1, 1);
        g2d.fillRect(115 + x, 105, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 83, 1, 4);
        g2d.fillRect(102 + x, 83, 1, 1);
        g2d.fillRect(103 + x, 84, 1, 1);
        g2d.fillRect(106 + x, 84, 2, 1);
        g2d.fillRect(121 + x, 84, 1, 3);
        g2d.fillRect(99 + x, 85, 1, 3);
        g2d.fillRect(102 + x, 85, 1, 1);
        g2d.fillRect(104 + x, 85, 1, 2);
        g2d.fillRect(118 + x, 85, 2, 1);
        g2d.fillRect(101 + x, 86, 1, 3);
        g2d.fillRect(103 + x, 86, 1, 1);
        g2d.fillRect(105 + x, 86, 1, 3);
        g2d.fillRect(108 + x, 86, 1, 2);
        g2d.fillRect(109 + x, 86, 2, 1);
        g2d.fillRect(115 + x, 86, 1, 10);
        g2d.fillRect(119 + x, 86, 1, 1);
        g2d.fillRect(102 + x, 87, 1, 2);
        g2d.fillRect(117 + x, 87, 1, 8);
        g2d.fillRect(120 + x, 87, 1, 3);
        g2d.fillRect(98 + x, 88, 1, 2);
        g2d.fillRect(100 + x, 88, 1, 3);
        g2d.fillRect(104 + x, 88, 1, 1);
        g2d.fillRect(109 + x, 88, 1, 2);
        g2d.fillRect(110 + x, 88, 1, 3);
        g2d.fillRect(114 + x, 88, 1, 1);
        g2d.fillRect(119 + x, 88, 1, 3);
        g2d.fillRect(107 + x, 89, 1, 1);
        g2d.fillRect(97 + x, 90, 1, 1);
        g2d.fillRect(104 + x, 90, 1, 2);
        g2d.fillRect(106 + x, 90, 1, 1);
        g2d.fillRect(114 + x, 90, 1, 2);
        g2d.fillRect(116 + x, 90, 1, 1);
        g2d.fillRect(121 + x, 90, 1, 1);
        g2d.fillRect(96 + x, 91, 1, 1);
        g2d.fillRect(99 + x, 91, 1, 2);
        g2d.fillRect(103 + x, 91, 1, 7);
        g2d.fillRect(109 + x, 91, 1, 2);
        g2d.fillRect(118 + x, 91, 1, 2);
        g2d.fillRect(95 + x, 92, 1, 1);
        g2d.fillRect(101 + x, 92, 1, 1);
        g2d.fillRect(105 + x, 92, 2, 1);
        g2d.fillRect(122 + x, 92, 1, 1);
        g2d.fillRect(94 + x, 93, 1, 2);
        g2d.fillRect(97 + x, 93, 2, 1);
        g2d.fillRect(104 + x, 93, 1, 2);
        g2d.fillRect(106 + x, 93, 1, 1);
        g2d.fillRect(114 + x, 93, 1, 1);
        g2d.fillRect(120 + x, 93, 1, 1);
        g2d.fillRect(93 + x, 94, 1, 1);
        g2d.fillRect(98 + x, 94, 1, 1);
        g2d.fillRect(105 + x, 94, 1, 3);
        g2d.fillRect(118 + x, 94, 1, 5);
        g2d.fillRect(96 + x, 95, 2, 1);
        g2d.fillRect(114 + x, 95, 1, 7);
        g2d.fillRect(121 + x, 95, 1, 1);
        g2d.fillRect(123 + x, 95, 1, 1);
        g2d.fillRect(97 + x, 96, 1, 1);
        g2d.fillRect(100 + x, 96, 1, 1);
        g2d.fillRect(113 + x, 96, 1, 1);
        g2d.fillRect(102 + x, 97, 1, 5);
        g2d.fillRect(115 + x, 97, 1, 5);
        g2d.fillRect(119 + x, 97, 1, 2);
        g2d.fillRect(108 + x, 98, 1, 2);
        g2d.fillRect(113 + x, 98, 1, 1);
        g2d.fillRect(122 + x, 98, 1, 1);
        g2d.fillRect(99 + x, 99, 1, 1);
        g2d.fillRect(103 + x, 99, 1, 4);
        g2d.fillRect(116 + x, 99, 1, 1);
        g2d.fillRect(113 + x, 100, 1, 1);
        g2d.fillRect(119 + x, 100, 4, 1);
        g2d.fillRect(101 + x, 101, 1, 1);
        g2d.fillRect(116 + x, 101, 1, 4);
        g2d.fillRect(120 + x, 101, 1, 1);
        g2d.fillRect(99 + x, 102, 1, 1);
        g2d.fillRect(107 + x, 102, 1, 2);
        g2d.fillRect(108 + x, 103, 1, 1);
        g2d.fillRect(115 + x, 103, 1, 2);
        g2d.fillRect(110 + x, 104, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 84, 1, 1);
        g2d.fillRect(105 + x, 84, 1, 1);
        g2d.fillRect(100 + x, 87, 1, 1);
        g2d.fillRect(104 + x, 87, 1, 1);
        g2d.fillRect(109 + x, 87, 1, 1);
        g2d.fillRect(107 + x, 88, 1, 1);
        g2d.fillRect(104 + x, 89, 1, 1);
        g2d.fillRect(114 + x, 89, 1, 1);
        g2d.fillRect(99 + x, 90, 1, 1);
        g2d.fillRect(109 + x, 90, 1, 1);
        g2d.fillRect(106 + x, 91, 1, 1);
        g2d.fillRect(98 + x, 92, 1, 1);
        g2d.fillRect(114 + x, 92, 1, 1);
        g2d.fillRect(105 + x, 93, 1, 1);
        g2d.fillRect(118 + x, 93, 1, 1);
        g2d.fillRect(97 + x, 94, 1, 1);
        g2d.fillRect(114 + x, 94, 1, 1);
        g2d.fillRect(95 + x, 95, 1, 1);
        g2d.fillRect(115 + x, 96, 1, 1);
        g2d.fillRect(113 + x, 97, 1, 1);
        g2d.fillRect(103 + x, 98, 1, 1);
        g2d.fillRect(113 + x, 99, 1, 1);
        g2d.fillRect(119 + x, 99, 1, 1);
        g2d.fillRect(122 + x, 99, 1, 1);
        g2d.fillRect(101 + x, 100, 1, 1);
        g2d.fillRect(116 + x, 100, 1, 1);
        g2d.fillRect(98 + x, 101, 1, 1);
        g2d.fillRect(113 + x, 101, 1, 1);
        g2d.fillRect(114 + x, 103, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 84, 1, 1);
        g2d.fillRect(116 + x, 84, 2, 1);
        g2d.fillRect(101 + x, 85, 1, 1);
        g2d.fillRect(108 + x, 85, 3, 1);
        g2d.fillRect(113 + x, 85, 1, 11);
        g2d.fillRect(114 + x, 85, 1, 3);
        g2d.fillRect(106 + x, 86, 1, 4);
        g2d.fillRect(111 + x, 86, 1, 3);
        g2d.fillRect(112 + x, 86, 1, 3);
        g2d.fillRect(117 + x, 86, 2, 1);
        g2d.fillRect(103 + x, 87, 1, 4);
        g2d.fillRect(107 + x, 87, 1, 1);
        g2d.fillRect(110 + x, 87, 1, 1);
        g2d.fillRect(118 + x, 87, 1, 4);
        g2d.fillRect(119 + x, 87, 1, 1);
        g2d.fillRect(99 + x, 88, 1, 2);
        g2d.fillRect(116 + x, 88, 1, 2);
        g2d.fillRect(102 + x, 89, 1, 1);
        g2d.fillRect(105 + x, 89, 1, 3);
        g2d.fillRect(97 + x, 91, 1, 1);
        g2d.fillRect(119 + x, 91, 1, 2);
        g2d.fillRect(96 + x, 92, 1, 1);
        g2d.fillRect(104 + x, 92, 1, 1);
        g2d.fillRect(112 + x, 92, 1, 11);
        g2d.fillRect(95 + x, 93, 1, 2);
        g2d.fillRect(101 + x, 93, 1, 1);
        g2d.fillRect(109 + x, 93, 1, 3);
        g2d.fillRect(122 + x, 93, 1, 1);
        g2d.fillRect(96 + x, 94, 1, 1);
        g2d.fillRect(102 + x, 94, 1, 3);
        g2d.fillRect(120 + x, 94, 1, 1);
        g2d.fillRect(123 + x, 94, 1, 1);
        g2d.fillRect(119 + x, 95, 1, 2);
        g2d.fillRect(124 + x, 95, 1, 1);
        g2d.fillRect(111 + x, 96, 1, 7);
        g2d.fillRect(121 + x, 96, 1, 4);
        g2d.fillRect(100 + x, 97, 1, 2);
        g2d.fillRect(101 + x, 99, 1, 1);
        g2d.fillRect(120 + x, 99, 1, 1);
        g2d.fillRect(99 + x, 100, 1, 2);
        g2d.fillRect(108 + x, 100, 1, 1);
        g2d.fillRect(110 + x, 100, 1, 2);
        g2d.fillRect(100 + x, 102, 1, 1);
        g2d.fillRect(102 + x, 102, 1, 1);
        g2d.fillRect(108 + x, 102, 1, 1);
        g2d.fillRect(113 + x, 102, 3, 1);
        g2d.fillRect(109 + x, 103, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 79, 2, 1);
        g2d.fillRect(118 + x, 79, 2, 1);
        g2d.fillRect(100 + x, 80, 1, 3);
        g2d.fillRect(105 + x, 80, 1, 1);
        g2d.fillRect(115 + x, 80, 1, 1);
        g2d.fillRect(119 + x, 80, 1, 1);
        g2d.fillRect(101 + x, 81, 2, 1);
        g2d.fillRect(117 + x, 81, 2, 1);
        g2d.fillRect(120 + x, 81, 1, 2);
        g2d.fillRect(103 + x, 82, 1, 2);
        g2d.fillRect(115 + x, 82, 1, 1);
        g2d.fillRect(121 + x, 82, 1, 2);
        g2d.fillRect(104 + x, 83, 3, 1);
        g2d.fillRect(116 + x, 83, 4, 1);
        g2d.fillRect(108 + x, 84, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 85, 3, 1);
        g2d.fillRect(111 + x, 89, 2, 1);
        g2d.fillRect(98 + x, 90, 1, 2);
        g2d.fillRect(102 + x, 91, 1, 2);
        g2d.fillRect(110 + x, 91, 1, 2);
        g2d.fillRect(112 + x, 91, 1, 1);
        g2d.fillRect(97 + x, 92, 1, 1);
        g2d.fillRect(96 + x, 93, 1, 1);
        g2d.fillRect(111 + x, 93, 1, 2);
        g2d.fillRect(119 + x, 93, 1, 2);
        g2d.fillRect(101 + x, 94, 1, 3);
        g2d.fillRect(120 + x, 95, 1, 1);
        g2d.fillRect(109 + x, 97, 1, 1);
        g2d.fillRect(120 + x, 97, 1, 2);
        g2d.fillRect(101 + x, 98, 1, 1);
        g2d.fillRect(110 + x, 98, 1, 2);
        g2d.fillRect(100 + x, 99, 1, 3);
        g2d.fillRect(108 + x, 101, 2, 1);
        g2d.fillRect(101 + x, 102, 1, 1);
        g2d.fillRect(110 + x, 102, 1, 1);
        g2d.fillRect(112 + x, 103, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 85, 2, 1);
        g2d.fillRect(102 + x, 86, 1, 1);
        g2d.fillRect(107 + x, 86, 1, 1);
        g2d.fillRect(116 + x, 86, 1, 2);
        g2d.fillRect(102 + x, 90, 1, 1);
        g2d.fillRect(111 + x, 90, 1, 3);
        g2d.fillRect(112 + x, 90, 1, 1);
        g2d.fillRect(102 + x, 93, 1, 1);
        g2d.fillRect(110 + x, 94, 1, 4);
        g2d.fillRect(111 + x, 95, 1, 1);
        g2d.fillRect(109 + x, 96, 1, 1);
        g2d.fillRect(120 + x, 96, 1, 1);
        g2d.fillRect(101 + x, 97, 1, 1);
        g2d.fillRect(109 + x, 98, 1, 3);
        g2d.fillRect(109 + x, 102, 1, 1);
        g2d.fillRect(111 + x, 103, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 105, 1, 1);
        g2d.fillRect(108 + x, 105, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 93, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 79, 1, 1);
        g2d.fillRect(116 + x, 79, 2, 1);
        g2d.fillRect(101 + x, 80, 2, 1);
        g2d.fillRect(104 + x, 80, 1, 1);
        g2d.fillRect(107 + x, 80, 3, 1);
        g2d.fillRect(112 + x, 80, 2, 1);
        g2d.fillRect(103 + x, 81, 1, 1);
        g2d.fillRect(110 + x, 81, 1, 2);
        g2d.fillRect(111 + x, 81, 1, 1);
        g2d.fillRect(101 + x, 82, 2, 1);
        g2d.fillRect(107 + x, 82, 1, 2);
        g2d.fillRect(108 + x, 82, 1, 1);
        g2d.fillRect(114 + x, 82, 1, 1);
        g2d.fillRect(116 + x, 82, 1, 1);
        g2d.fillRect(118 + x, 82, 2, 1);
        g2d.fillRect(109 + x, 83, 1, 1);
        g2d.fillRect(111 + x, 83, 3, 1);
        g2d.fillRect(115 + x, 83, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(103 + x, 80, 1, 1);
        g2d.fillRect(106 + x, 80, 1, 2);
        g2d.fillRect(110 + x, 80, 2, 1);
        g2d.fillRect(116 + x, 80, 1, 2);
        g2d.fillRect(117 + x, 80, 1, 1);
        g2d.fillRect(105 + x, 81, 1, 2);
        g2d.fillRect(108 + x, 81, 2, 1);
        g2d.fillRect(114 + x, 81, 1, 1);
        g2d.fillRect(119 + x, 81, 1, 1);
        g2d.fillRect(104 + x, 82, 1, 1);
        g2d.fillRect(111 + x, 82, 2, 1);
        g2d.fillRect(117 + x, 82, 1, 1);
        g2d.fillRect(108 + x, 83, 1, 1);
        g2d.fillRect(110 + x, 83, 1, 1);
        g2d.fillRect(114 + x, 83, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(114 + x, 80, 1, 1);
        g2d.fillRect(118 + x, 80, 1, 1);
        g2d.fillRect(104 + x, 81, 1, 1);
        g2d.fillRect(107 + x, 81, 1, 1);
        g2d.fillRect(112 + x, 81, 2, 1);
        g2d.fillRect(115 + x, 81, 1, 1);
        g2d.fillRect(106 + x, 82, 1, 1);
        g2d.fillRect(109 + x, 82, 1, 1);
        g2d.fillRect(113 + x, 82, 1, 1);
    }
}
