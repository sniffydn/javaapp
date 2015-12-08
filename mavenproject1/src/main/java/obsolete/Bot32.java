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
public class Bot32 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot32()
    {
        super();
        skt = true;
    }

    public Bot32(int layer)
    {
        super(layer);
        skt = true;
    }

    public Bot32(ColorArray colorSwitch)
    {
        super(colorSwitch);
        skt = true;
    }

    public Bot32(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 77, 1, 1);
        g2d.fillRect(115 + x, 77, 2, 1);
        g2d.fillRect(109 + x, 78, 6, 1);
        g2d.fillRect(117 + x, 78, 1, 1);
        g2d.fillRect(98 + x, 116, 1, 1);
        g2d.fillRect(120 + x, 116, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 78, 1, 1);
        g2d.fillRect(116 + x, 78, 1, 1);
        g2d.fillRect(119 + x, 79, 1, 1);
        g2d.fillRect(104 + x, 117, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 83, 2, 1);
        g2d.fillRect(104 + x, 84, 2, 1);
        g2d.fillRect(120 + x, 84, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 78, 1, 1);
        g2d.fillRect(101 + x, 82, 1, 1);
        g2d.fillRect(103 + x, 83, 1, 1);
        g2d.fillRect(119 + x, 83, 1, 2);
        g2d.fillRect(120 + x, 83, 2, 1);
        g2d.fillRect(110 + x, 85, 7, 1);
        g2d.fillRect(120 + x, 85, 1, 1);
        g2d.fillRect(121 + x, 86, 1, 1);
        g2d.fillRect(92 + x, 114, 1, 1);
        g2d.fillRect(127 + x, 114, 1, 2);
        g2d.fillRect(120 + x, 115, 1, 1);
        g2d.fillRect(104 + x, 116, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 76, 3, 1);
        g2d.fillRect(118 + x, 76, 2, 1);
        g2d.fillRect(105 + x, 77, 1, 2);
        g2d.fillRect(114 + x, 77, 1, 1);
        g2d.fillRect(117 + x, 77, 1, 1);
        g2d.fillRect(106 + x, 78, 2, 1);
        g2d.fillRect(115 + x, 78, 1, 1);
        g2d.fillRect(117 + x, 79, 1, 1);
        g2d.fillRect(118 + x, 80, 1, 2);
        g2d.fillRect(119 + x, 80, 1, 3);
        g2d.fillRect(120 + x, 82, 1, 1);
        g2d.fillRect(89 + x, 113, 1, 1);
        g2d.fillRect(126 + x, 114, 1, 1);
        g2d.fillRect(128 + x, 114, 1, 2);
        g2d.fillRect(94 + x, 115, 2, 1);
        g2d.fillRect(99 + x, 116, 3, 1);
        g2d.fillRect(118 + x, 116, 1, 1);
        g2d.fillRect(122 + x, 116, 1, 1);
        g2d.fillRect(103 + x, 117, 1, 1);
        g2d.fillRect(109 + x, 117, 1, 1);
        g2d.fillRect(114 + x, 117, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 82, 1, 1);
        g2d.fillRect(100 + x, 83, 1, 2);
        g2d.fillRect(102 + x, 84, 1, 2);
        g2d.fillRect(103 + x, 84, 1, 1);
        g2d.fillRect(106 + x, 84, 1, 2);
        g2d.fillRect(107 + x, 84, 1, 2);
        g2d.fillRect(108 + x, 84, 1, 3);
        g2d.fillRect(109 + x, 84, 1, 2);
        g2d.fillRect(118 + x, 84, 1, 4);
        g2d.fillRect(101 + x, 85, 1, 1);
        g2d.fillRect(104 + x, 85, 1, 3);
        g2d.fillRect(105 + x, 85, 1, 2);
        g2d.fillRect(117 + x, 85, 1, 4);
        g2d.fillRect(119 + x, 85, 1, 3);
        g2d.fillRect(121 + x, 85, 1, 1);
        g2d.fillRect(110 + x, 86, 7, 1);
        g2d.fillRect(120 + x, 86, 1, 3);
        g2d.fillRect(100 + x, 87, 1, 2);
        g2d.fillRect(103 + x, 87, 1, 2);
        g2d.fillRect(111 + x, 87, 1, 3);
        g2d.fillRect(113 + x, 87, 1, 3);
        g2d.fillRect(115 + x, 87, 1, 1);
        g2d.fillRect(121 + x, 87, 1, 2);
        g2d.fillRect(107 + x, 88, 1, 3);
        g2d.fillRect(116 + x, 88, 1, 3);
        g2d.fillRect(117 + x, 91, 1, 1);
        g2d.fillRect(98 + x, 115, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 77, 1, 5);
        g2d.fillRect(103 + x, 77, 1, 1);
        g2d.fillRect(106 + x, 77, 8, 1);
        g2d.fillRect(119 + x, 77, 1, 2);
        g2d.fillRect(104 + x, 78, 1, 1);
        g2d.fillRect(109 + x, 79, 6, 1);
        g2d.fillRect(116 + x, 79, 1, 1);
        g2d.fillRect(118 + x, 79, 1, 1);
        g2d.fillRect(102 + x, 80, 2, 1);
        g2d.fillRect(117 + x, 80, 1, 2);
        g2d.fillRect(106 + x, 81, 1, 1);
        g2d.fillRect(115 + x, 81, 2, 1);
        g2d.fillRect(120 + x, 81, 1, 1);
        g2d.fillRect(100 + x, 82, 1, 1);
        g2d.fillRect(103 + x, 82, 2, 1);
        g2d.fillRect(108 + x, 82, 6, 1);
        g2d.fillRect(118 + x, 82, 1, 2);
        g2d.fillRect(99 + x, 83, 1, 1);
        g2d.fillRect(104 + x, 83, 3, 1);
        g2d.fillRect(101 + x, 84, 1, 1);
        g2d.fillRect(110 + x, 84, 8, 1);
        g2d.fillRect(122 + x, 84, 1, 3);
        g2d.fillRect(99 + x, 85, 1, 5);
        g2d.fillRect(100 + x, 85, 1, 2);
        g2d.fillRect(103 + x, 85, 1, 2);
        g2d.fillRect(98 + x, 86, 1, 6);
        g2d.fillRect(101 + x, 86, 1, 2);
        g2d.fillRect(102 + x, 86, 1, 4);
        g2d.fillRect(106 + x, 86, 1, 2);
        g2d.fillRect(107 + x, 86, 1, 2);
        g2d.fillRect(109 + x, 86, 1, 3);
        g2d.fillRect(105 + x, 87, 1, 2);
        g2d.fillRect(108 + x, 87, 1, 4);
        g2d.fillRect(110 + x, 87, 1, 3);
        g2d.fillRect(112 + x, 87, 1, 9);
        g2d.fillRect(114 + x, 87, 1, 2);
        g2d.fillRect(116 + x, 87, 1, 1);
        g2d.fillRect(104 + x, 88, 1, 4);
        g2d.fillRect(115 + x, 88, 1, 1);
        g2d.fillRect(118 + x, 88, 1, 4);
        g2d.fillRect(119 + x, 88, 1, 1);
        g2d.fillRect(122 + x, 88, 1, 4);
        g2d.fillRect(100 + x, 89, 1, 1);
        g2d.fillRect(103 + x, 89, 1, 1);
        g2d.fillRect(117 + x, 89, 1, 2);
        g2d.fillRect(120 + x, 89, 1, 2);
        g2d.fillRect(121 + x, 89, 1, 1);
        g2d.fillRect(109 + x, 90, 1, 2);
        g2d.fillRect(111 + x, 90, 1, 2);
        g2d.fillRect(113 + x, 90, 1, 3);
        g2d.fillRect(99 + x, 91, 1, 1);
        g2d.fillRect(101 + x, 91, 1, 2);
        g2d.fillRect(107 + x, 91, 1, 2);
        g2d.fillRect(116 + x, 91, 1, 1);
        g2d.fillRect(121 + x, 91, 1, 1);
        g2d.fillRect(117 + x, 92, 1, 12);
        g2d.fillRect(119 + x, 92, 1, 1);
        g2d.fillRect(123 + x, 92, 1, 4);
        g2d.fillRect(97 + x, 93, 1, 3);
        g2d.fillRect(100 + x, 93, 1, 1);
        g2d.fillRect(103 + x, 94, 1, 1);
        g2d.fillRect(106 + x, 94, 1, 8);
        g2d.fillRect(96 + x, 95, 1, 4);
        g2d.fillRect(124 + x, 95, 1, 3);
        g2d.fillRect(120 + x, 96, 1, 6);
        g2d.fillRect(95 + x, 97, 1, 3);
        g2d.fillRect(99 + x, 97, 1, 1);
        g2d.fillRect(123 + x, 98, 1, 2);
        g2d.fillRect(102 + x, 99, 1, 2);
        g2d.fillRect(125 + x, 99, 1, 1);
        g2d.fillRect(94 + x, 100, 1, 1);
        g2d.fillRect(118 + x, 100, 1, 4);
        g2d.fillRect(98 + x, 101, 1, 2);
        g2d.fillRect(124 + x, 101, 1, 6);
        g2d.fillRect(125 + x, 101, 1, 2);
        g2d.fillRect(94 + x, 102, 1, 1);
        g2d.fillRect(101 + x, 102, 1, 1);
        g2d.fillRect(105 + x, 102, 1, 4);
        g2d.fillRect(94 + x, 104, 1, 1);
        g2d.fillRect(97 + x, 104, 1, 1);
        g2d.fillRect(126 + x, 104, 1, 1);
        g2d.fillRect(101 + x, 105, 1, 1);
        g2d.fillRect(118 + x, 106, 1, 6);
        g2d.fillRect(93 + x, 107, 1, 1);
        g2d.fillRect(100 + x, 107, 1, 2);
        g2d.fillRect(125 + x, 107, 1, 4);
        g2d.fillRect(96 + x, 108, 1, 2);
        g2d.fillRect(92 + x, 109, 1, 5);
        g2d.fillRect(114 + x, 109, 1, 8);
        g2d.fillRect(104 + x, 110, 1, 3);
        g2d.fillRect(121 + x, 110, 1, 3);
        g2d.fillRect(127 + x, 110, 1, 1);
        g2d.fillRect(91 + x, 112, 1, 2);
        g2d.fillRect(99 + x, 112, 1, 4);
        g2d.fillRect(106 + x, 112, 1, 2);
        g2d.fillRect(125 + x, 112, 1, 2);
        g2d.fillRect(126 + x, 112, 1, 2);
        g2d.fillRect(96 + x, 113, 1, 3);
        g2d.fillRect(97 + x, 113, 1, 3);
        g2d.fillRect(118 + x, 113, 1, 3);
        g2d.fillRect(122 + x, 113, 1, 3);
        g2d.fillRect(123 + x, 113, 1, 4);
        g2d.fillRect(124 + x, 113, 1, 3);
        g2d.fillRect(127 + x, 113, 2, 1);
        g2d.fillRect(93 + x, 114, 1, 1);
        g2d.fillRect(95 + x, 114, 1, 1);
        g2d.fillRect(98 + x, 114, 1, 1);
        g2d.fillRect(100 + x, 115, 2, 1);
        g2d.fillRect(105 + x, 115, 1, 3);
        g2d.fillRect(119 + x, 115, 1, 1);
        g2d.fillRect(121 + x, 115, 1, 2);
        g2d.fillRect(125 + x, 115, 1, 1);
        g2d.fillRect(103 + x, 116, 1, 1);
        g2d.fillRect(106 + x, 116, 1, 1);
        g2d.fillRect(109 + x, 116, 1, 1);
        g2d.fillRect(101 + x, 117, 2, 1);
        g2d.fillRect(108 + x, 117, 1, 1);
        g2d.fillRect(110 + x, 117, 2, 1);
        g2d.fillRect(115 + x, 117, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 78, 1, 2);
        g2d.fillRect(103 + x, 78, 1, 2);
        g2d.fillRect(104 + x, 79, 1, 3);
        g2d.fillRect(105 + x, 79, 1, 4);
        g2d.fillRect(106 + x, 79, 1, 2);
        g2d.fillRect(107 + x, 79, 1, 5);
        g2d.fillRect(108 + x, 79, 1, 3);
        g2d.fillRect(115 + x, 79, 1, 2);
        g2d.fillRect(109 + x, 80, 1, 2);
        g2d.fillRect(110 + x, 80, 1, 2);
        g2d.fillRect(111 + x, 80, 1, 2);
        g2d.fillRect(112 + x, 80, 1, 2);
        g2d.fillRect(113 + x, 80, 1, 2);
        g2d.fillRect(114 + x, 80, 1, 4);
        g2d.fillRect(116 + x, 80, 1, 1);
        g2d.fillRect(100 + x, 81, 1, 1);
        g2d.fillRect(102 + x, 81, 2, 1);
        g2d.fillRect(106 + x, 82, 1, 1);
        g2d.fillRect(115 + x, 82, 1, 2);
        g2d.fillRect(116 + x, 82, 1, 2);
        g2d.fillRect(117 + x, 82, 1, 2);
        g2d.fillRect(121 + x, 82, 1, 1);
        g2d.fillRect(108 + x, 83, 6, 1);
        g2d.fillRect(98 + x, 84, 1, 2);
        g2d.fillRect(99 + x, 84, 1, 1);
        g2d.fillRect(97 + x, 85, 1, 1);
        g2d.fillRect(123 + x, 85, 1, 7);
        g2d.fillRect(124 + x, 86, 1, 6);
        g2d.fillRect(97 + x, 87, 1, 6);
        g2d.fillRect(122 + x, 87, 1, 1);
        g2d.fillRect(101 + x, 88, 1, 3);
        g2d.fillRect(106 + x, 88, 1, 2);
        g2d.fillRect(96 + x, 89, 1, 3);
        g2d.fillRect(105 + x, 89, 1, 4);
        g2d.fillRect(109 + x, 89, 1, 1);
        g2d.fillRect(114 + x, 89, 1, 20);
        g2d.fillRect(115 + x, 89, 1, 16);
        g2d.fillRect(119 + x, 89, 1, 3);
        g2d.fillRect(125 + x, 89, 1, 1);
        g2d.fillRect(99 + x, 90, 2, 1);
        g2d.fillRect(102 + x, 90, 1, 4);
        g2d.fillRect(103 + x, 90, 1, 4);
        g2d.fillRect(110 + x, 90, 1, 2);
        g2d.fillRect(121 + x, 90, 1, 1);
        g2d.fillRect(95 + x, 91, 1, 3);
        g2d.fillRect(108 + x, 91, 1, 21);
        g2d.fillRect(120 + x, 91, 1, 5);
        g2d.fillRect(125 + x, 91, 1, 5);
        g2d.fillRect(98 + x, 92, 1, 6);
        g2d.fillRect(99 + x, 92, 1, 5);
        g2d.fillRect(100 + x, 92, 1, 1);
        g2d.fillRect(104 + x, 92, 1, 3);
        g2d.fillRect(109 + x, 92, 1, 10);
        g2d.fillRect(111 + x, 92, 1, 25);
        g2d.fillRect(116 + x, 92, 1, 6);
        g2d.fillRect(118 + x, 92, 1, 8);
        g2d.fillRect(121 + x, 92, 1, 9);
        g2d.fillRect(122 + x, 92, 1, 6);
        g2d.fillRect(96 + x, 93, 1, 2);
        g2d.fillRect(101 + x, 93, 1, 5);
        g2d.fillRect(106 + x, 93, 2, 1);
        g2d.fillRect(113 + x, 93, 1, 17);
        g2d.fillRect(119 + x, 93, 1, 22);
        g2d.fillRect(124 + x, 93, 1, 2);
        g2d.fillRect(94 + x, 94, 1, 3);
        g2d.fillRect(100 + x, 94, 1, 2);
        g2d.fillRect(107 + x, 94, 1, 24);
        g2d.fillRect(93 + x, 95, 1, 4);
        g2d.fillRect(102 + x, 95, 1, 4);
        g2d.fillRect(103 + x, 95, 1, 3);
        g2d.fillRect(126 + x, 95, 1, 3);
        g2d.fillRect(95 + x, 96, 1, 1);
        g2d.fillRect(97 + x, 96, 1, 4);
        g2d.fillRect(112 + x, 96, 1, 22);
        g2d.fillRect(123 + x, 96, 1, 2);
        g2d.fillRect(104 + x, 97, 1, 4);
        g2d.fillRect(105 + x, 97, 1, 5);
        g2d.fillRect(92 + x, 98, 1, 6);
        g2d.fillRect(99 + x, 98, 1, 3);
        g2d.fillRect(100 + x, 98, 1, 4);
        g2d.fillRect(124 + x, 98, 1, 3);
        g2d.fillRect(125 + x, 98, 1, 1);
        g2d.fillRect(127 + x, 98, 1, 4);
        g2d.fillRect(94 + x, 99, 1, 1);
        g2d.fillRect(96 + x, 99, 1, 4);
        g2d.fillRect(98 + x, 99, 1, 2);
        g2d.fillRect(95 + x, 100, 1, 8);
        g2d.fillRect(123 + x, 100, 1, 3);
        g2d.fillRect(125 + x, 100, 1, 1);
        g2d.fillRect(94 + x, 101, 1, 1);
        g2d.fillRect(101 + x, 101, 3, 1);
        g2d.fillRect(110 + x, 101, 1, 14);
        g2d.fillRect(122 + x, 101, 1, 7);
        g2d.fillRect(126 + x, 101, 1, 3);
        g2d.fillRect(91 + x, 102, 1, 6);
        g2d.fillRect(93 + x, 102, 1, 5);
        g2d.fillRect(99 + x, 102, 1, 4);
        g2d.fillRect(103 + x, 102, 1, 3);
        g2d.fillRect(106 + x, 102, 1, 10);
        g2d.fillRect(120 + x, 102, 1, 13);
        g2d.fillRect(121 + x, 102, 1, 8);
        g2d.fillRect(128 + x, 102, 1, 8);
        g2d.fillRect(94 + x, 103, 1, 1);
        g2d.fillRect(97 + x, 103, 1, 1);
        g2d.fillRect(101 + x, 103, 1, 2);
        g2d.fillRect(102 + x, 103, 1, 1);
        g2d.fillRect(125 + x, 103, 1, 4);
        g2d.fillRect(117 + x, 104, 1, 8);
        g2d.fillRect(118 + x, 104, 1, 2);
        g2d.fillRect(90 + x, 105, 1, 6);
        g2d.fillRect(92 + x, 105, 1, 4);
        g2d.fillRect(94 + x, 105, 1, 8);
        g2d.fillRect(97 + x, 105, 1, 3);
        g2d.fillRect(104 + x, 105, 1, 5);
        g2d.fillRect(116 + x, 105, 1, 12);
        g2d.fillRect(126 + x, 105, 1, 7);
        g2d.fillRect(127 + x, 105, 1, 5);
        g2d.fillRect(96 + x, 106, 1, 2);
        g2d.fillRect(98 + x, 106, 1, 4);
        g2d.fillRect(100 + x, 106, 3, 1);
        g2d.fillRect(105 + x, 106, 1, 9);
        g2d.fillRect(102 + x, 107, 1, 5);
        g2d.fillRect(124 + x, 107, 1, 1);
        g2d.fillRect(129 + x, 107, 1, 9);
        g2d.fillRect(93 + x, 108, 1, 6);
        g2d.fillRect(123 + x, 108, 1, 5);
        g2d.fillRect(89 + x, 109, 1, 4);
        g2d.fillRect(99 + x, 109, 1, 3);
        g2d.fillRect(100 + x, 109, 1, 3);
        g2d.fillRect(95 + x, 110, 1, 4);
        g2d.fillRect(96 + x, 110, 1, 2);
        g2d.fillRect(97 + x, 110, 1, 3);
        g2d.fillRect(88 + x, 111, 1, 1);
        g2d.fillRect(91 + x, 111, 1, 1);
        g2d.fillRect(109 + x, 111, 1, 5);
        g2d.fillRect(125 + x, 111, 1, 1);
        g2d.fillRect(127 + x, 111, 1, 2);
        g2d.fillRect(128 + x, 111, 1, 2);
        g2d.fillRect(90 + x, 112, 1, 3);
        g2d.fillRect(101 + x, 112, 1, 3);
        g2d.fillRect(118 + x, 112, 1, 1);
        g2d.fillRect(124 + x, 112, 1, 1);
        g2d.fillRect(98 + x, 113, 1, 1);
        g2d.fillRect(103 + x, 113, 1, 3);
        g2d.fillRect(104 + x, 113, 1, 3);
        g2d.fillRect(121 + x, 113, 1, 2);
        g2d.fillRect(91 + x, 114, 1, 1);
        g2d.fillRect(94 + x, 114, 1, 1);
        g2d.fillRect(100 + x, 114, 1, 1);
        g2d.fillRect(106 + x, 114, 1, 2);
        g2d.fillRect(125 + x, 114, 1, 1);
        g2d.fillRect(102 + x, 115, 1, 2);
        g2d.fillRect(126 + x, 115, 1, 1);
        g2d.fillRect(97 + x, 116, 1, 1);
        g2d.fillRect(108 + x, 116, 1, 1);
        g2d.fillRect(110 + x, 116, 1, 1);
        g2d.fillRect(113 + x, 116, 1, 2);
        g2d.fillRect(115 + x, 116, 1, 1);
        g2d.fillRect(117 + x, 116, 1, 2);
        g2d.fillRect(119 + x, 116, 1, 2);
        g2d.fillRect(124 + x, 116, 1, 1);
        g2d.fillRect(127 + x, 116, 1, 1);
        g2d.fillRect(106 + x, 117, 1, 1);
        g2d.fillRect(120 + x, 117, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 75, 1, 1);
        g2d.fillRect(119 + x, 75, 1, 1);
        g2d.fillRect(105 + x, 76, 1, 1);
        g2d.fillRect(117 + x, 76, 1, 1);
        g2d.fillRect(102 + x, 77, 1, 1);
        g2d.fillRect(118 + x, 77, 1, 1);
        g2d.fillRect(100 + x, 80, 1, 1);
        g2d.fillRect(99 + x, 82, 1, 1);
        g2d.fillRect(122 + x, 83, 1, 1);
        g2d.fillRect(96 + x, 86, 1, 3);
        g2d.fillRect(97 + x, 86, 1, 1);
        g2d.fillRect(95 + x, 88, 1, 3);
        g2d.fillRect(125 + x, 88, 1, 1);
        g2d.fillRect(94 + x, 90, 1, 4);
        g2d.fillRect(106 + x, 90, 1, 3);
        g2d.fillRect(125 + x, 90, 2, 1);
        g2d.fillRect(100 + x, 91, 1, 1);
        g2d.fillRect(126 + x, 91, 1, 4);
        g2d.fillRect(93 + x, 92, 1, 3);
        g2d.fillRect(96 + x, 92, 1, 1);
        g2d.fillRect(110 + x, 92, 1, 9);
        g2d.fillRect(124 + x, 92, 1, 1);
        g2d.fillRect(105 + x, 93, 1, 4);
        g2d.fillRect(92 + x, 94, 1, 4);
        g2d.fillRect(95 + x, 94, 1, 2);
        g2d.fillRect(102 + x, 94, 1, 1);
        g2d.fillRect(127 + x, 94, 1, 4);
        g2d.fillRect(104 + x, 95, 1, 2);
        g2d.fillRect(91 + x, 96, 1, 6);
        g2d.fillRect(100 + x, 96, 1, 2);
        g2d.fillRect(125 + x, 96, 1, 2);
        g2d.fillRect(94 + x, 97, 1, 2);
        g2d.fillRect(128 + x, 97, 1, 5);
        g2d.fillRect(90 + x, 98, 1, 7);
        g2d.fillRect(98 + x, 98, 1, 1);
        g2d.fillRect(101 + x, 98, 1, 3);
        g2d.fillRect(103 + x, 98, 1, 3);
        g2d.fillRect(116 + x, 98, 1, 7);
        g2d.fillRect(122 + x, 98, 1, 3);
        g2d.fillRect(126 + x, 98, 1, 3);
        g2d.fillRect(93 + x, 99, 1, 3);
        g2d.fillRect(129 + x, 99, 1, 8);
        g2d.fillRect(89 + x, 100, 1, 9);
        g2d.fillRect(97 + x, 100, 1, 3);
        g2d.fillRect(99 + x, 101, 1, 1);
        g2d.fillRect(104 + x, 101, 1, 4);
        g2d.fillRect(121 + x, 101, 1, 1);
        g2d.fillRect(100 + x, 102, 1, 4);
        g2d.fillRect(102 + x, 102, 1, 1);
        g2d.fillRect(109 + x, 102, 1, 9);
        g2d.fillRect(127 + x, 102, 1, 3);
        g2d.fillRect(96 + x, 103, 1, 3);
        g2d.fillRect(98 + x, 103, 1, 3);
        g2d.fillRect(123 + x, 103, 1, 5);
        g2d.fillRect(130 + x, 103, 1, 12);
        g2d.fillRect(88 + x, 104, 1, 7);
        g2d.fillRect(92 + x, 104, 1, 1);
        g2d.fillRect(102 + x, 104, 1, 2);
        g2d.fillRect(103 + x, 105, 1, 8);
        g2d.fillRect(115 + x, 105, 1, 11);
        g2d.fillRect(99 + x, 106, 1, 3);
        g2d.fillRect(101 + x, 107, 1, 5);
        g2d.fillRect(91 + x, 108, 1, 3);
        g2d.fillRect(95 + x, 108, 1, 2);
        g2d.fillRect(97 + x, 108, 1, 2);
        g2d.fillRect(122 + x, 108, 1, 5);
        g2d.fillRect(124 + x, 108, 1, 4);
        g2d.fillRect(131 + x, 108, 1, 5);
        g2d.fillRect(98 + x, 110, 1, 3);
        g2d.fillRect(113 + x, 110, 1, 6);
        g2d.fillRect(128 + x, 110, 1, 1);
        g2d.fillRect(90 + x, 111, 1, 1);
        g2d.fillRect(96 + x, 112, 1, 1);
        g2d.fillRect(100 + x, 112, 1, 2);
        g2d.fillRect(102 + x, 112, 1, 3);
        g2d.fillRect(108 + x, 112, 1, 4);
        g2d.fillRect(117 + x, 112, 1, 4);
        g2d.fillRect(94 + x, 113, 1, 1);
        g2d.fillRect(93 + x, 115, 1, 1);
        g2d.fillRect(110 + x, 115, 1, 1);
        g2d.fillRect(96 + x, 116, 1, 1);
        g2d.fillRect(126 + x, 116, 1, 1);
        g2d.fillRect(118 + x, 117, 1, 1);
    }
}
