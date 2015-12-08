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
public class Bot38 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot38()
    {
        super();
        skt = true;
    }

    public Bot38(int layer)
    {
        super(layer);
        skt = true;
    }

    public Bot38(ColorArray colorSwitch)
    {
        super(colorSwitch);
        skt = true;
    }

    public Bot38(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 76, 1, 7);
        g2d.fillRect(118 + x, 77, 1, 5);
        g2d.fillRect(101 + x, 78, 1, 4);
        g2d.fillRect(117 + x, 78, 1, 4);
        g2d.fillRect(102 + x, 79, 1, 5);
        g2d.fillRect(103 + x, 79, 1, 3);
        g2d.fillRect(104 + x, 79, 1, 3);
        g2d.fillRect(113 + x, 79, 1, 6);
        g2d.fillRect(114 + x, 79, 1, 5);
        g2d.fillRect(115 + x, 79, 1, 3);
        g2d.fillRect(116 + x, 79, 1, 2);
        g2d.fillRect(120 + x, 79, 1, 2);
        g2d.fillRect(100 + x, 80, 1, 1);
        g2d.fillRect(105 + x, 80, 1, 2);
        g2d.fillRect(106 + x, 80, 1, 4);
        g2d.fillRect(107 + x, 80, 1, 5);
        g2d.fillRect(108 + x, 80, 1, 3);
        g2d.fillRect(109 + x, 80, 1, 3);
        g2d.fillRect(110 + x, 80, 1, 2);
        g2d.fillRect(111 + x, 80, 1, 2);
        g2d.fillRect(112 + x, 80, 1, 3);
        g2d.fillRect(121 + x, 82, 1, 1);
        g2d.fillRect(131 + x, 100, 1, 1);
        g2d.fillRect(131 + x, 103, 1, 1);
        g2d.fillRect(129 + x, 104, 2, 1);
        g2d.fillRect(88 + x, 105, 1, 1);
        g2d.fillRect(130 + x, 105, 2, 1);
        g2d.fillRect(129 + x, 106, 1, 2);
        g2d.fillRect(89 + x, 107, 1, 1);
        g2d.fillRect(88 + x, 108, 1, 2);
        g2d.fillRect(90 + x, 108, 1, 3);
        g2d.fillRect(91 + x, 108, 1, 2);
        g2d.fillRect(92 + x, 108, 1, 3);
        g2d.fillRect(93 + x, 108, 1, 2);
        g2d.fillRect(126 + x, 108, 3, 1);
        g2d.fillRect(89 + x, 109, 1, 1);
        g2d.fillRect(125 + x, 109, 1, 1);
        g2d.fillRect(127 + x, 109, 1, 1);
        g2d.fillRect(124 + x, 110, 1, 1);
        g2d.fillRect(126 + x, 110, 1, 1);
        g2d.fillRect(91 + x, 111, 1, 1);
        g2d.fillRect(93 + x, 111, 1, 2);
        g2d.fillRect(101 + x, 111, 1, 3);
        g2d.fillRect(123 + x, 111, 1, 1);
        g2d.fillRect(125 + x, 111, 1, 1);
        g2d.fillRect(94 + x, 112, 1, 2);
        g2d.fillRect(103 + x, 112, 1, 2);
        g2d.fillRect(104 + x, 112, 1, 3);
        g2d.fillRect(118 + x, 112, 1, 1);
        g2d.fillRect(120 + x, 112, 1, 1);
        g2d.fillRect(122 + x, 112, 1, 1);
        g2d.fillRect(95 + x, 113, 3, 1);
        g2d.fillRect(99 + x, 113, 2, 1);
        g2d.fillRect(116 + x, 113, 1, 2);
        g2d.fillRect(117 + x, 113, 1, 1);
        g2d.fillRect(119 + x, 113, 1, 1);
        g2d.fillRect(97 + x, 114, 2, 1);
        g2d.fillRect(100 + x, 114, 1, 1);
        g2d.fillRect(102 + x, 114, 1, 1);
        g2d.fillRect(106 + x, 114, 1, 1);
        g2d.fillRect(113 + x, 114, 2, 1);
        g2d.fillRect(105 + x, 115, 1, 1);
        g2d.fillRect(107 + x, 115, 1, 1);
        g2d.fillRect(109 + x, 115, 2, 1);
        g2d.fillRect(112 + x, 115, 1, 1);
        g2d.fillRect(115 + x, 115, 1, 1);
        g2d.fillRect(108 + x, 116, 1, 1);
        g2d.fillRect(111 + x, 116, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 81, 1, 2);
        g2d.fillRect(116 + x, 81, 1, 5);
        g2d.fillRect(120 + x, 81, 1, 9);
        g2d.fillRect(99 + x, 82, 1, 2);
        g2d.fillRect(101 + x, 82, 1, 6);
        g2d.fillRect(103 + x, 82, 1, 7);
        g2d.fillRect(104 + x, 82, 1, 4);
        g2d.fillRect(105 + x, 82, 1, 4);
        g2d.fillRect(110 + x, 82, 1, 4);
        g2d.fillRect(111 + x, 82, 1, 4);
        g2d.fillRect(115 + x, 82, 1, 21);
        g2d.fillRect(117 + x, 82, 1, 2);
        g2d.fillRect(118 + x, 82, 1, 1);
        g2d.fillRect(108 + x, 83, 1, 2);
        g2d.fillRect(109 + x, 83, 1, 3);
        g2d.fillRect(112 + x, 83, 1, 1);
        g2d.fillRect(119 + x, 83, 1, 3);
        g2d.fillRect(121 + x, 83, 1, 3);
        g2d.fillRect(100 + x, 84, 1, 7);
        g2d.fillRect(102 + x, 84, 1, 4);
        g2d.fillRect(106 + x, 84, 1, 18);
        g2d.fillRect(114 + x, 84, 1, 12);
        g2d.fillRect(107 + x, 85, 1, 9);
        g2d.fillRect(112 + x, 85, 2, 1);
        g2d.fillRect(122 + x, 85, 1, 5);
        g2d.fillRect(113 + x, 86, 1, 3);
        g2d.fillRect(117 + x, 86, 1, 2);
        g2d.fillRect(105 + x, 87, 1, 26);
        g2d.fillRect(108 + x, 87, 1, 1);
        g2d.fillRect(116 + x, 87, 1, 1);
        g2d.fillRect(123 + x, 87, 1, 5);
        g2d.fillRect(99 + x, 88, 1, 6);
        g2d.fillRect(102 + x, 89, 1, 5);
        g2d.fillRect(124 + x, 89, 1, 7);
        g2d.fillRect(121 + x, 90, 1, 5);
        g2d.fillRect(98 + x, 91, 1, 6);
        g2d.fillRect(125 + x, 92, 1, 2);
        g2d.fillRect(97 + x, 94, 1, 7);
        g2d.fillRect(126 + x, 94, 1, 3);
        g2d.fillRect(104 + x, 95, 1, 17);
        g2d.fillRect(96 + x, 96, 1, 7);
        g2d.fillRect(116 + x, 97, 1, 16);
        g2d.fillRect(125 + x, 97, 1, 2);
        g2d.fillRect(128 + x, 98, 1, 2);
        g2d.fillRect(95 + x, 99, 1, 7);
        g2d.fillRect(126 + x, 99, 1, 3);
        g2d.fillRect(123 + x, 100, 1, 3);
        g2d.fillRect(129 + x, 100, 1, 1);
        g2d.fillRect(103 + x, 101, 1, 11);
        g2d.fillRect(94 + x, 102, 1, 9);
        g2d.fillRect(127 + x, 102, 1, 3);
        g2d.fillRect(130 + x, 102, 1, 1);
        g2d.fillRect(124 + x, 103, 1, 6);
        g2d.fillRect(128 + x, 103, 1, 4);
        g2d.fillRect(93 + x, 104, 1, 4);
        g2d.fillRect(99 + x, 104, 1, 2);
        g2d.fillRect(98 + x, 106, 1, 2);
        g2d.fillRect(102 + x, 106, 1, 5);
        g2d.fillRect(117 + x, 106, 1, 5);
        g2d.fillRect(125 + x, 106, 1, 2);
        g2d.fillRect(92 + x, 107, 1, 1);
        g2d.fillRect(97 + x, 107, 1, 1);
        g2d.fillRect(118 + x, 108, 1, 4);
        g2d.fillRect(101 + x, 109, 1, 2);
        g2d.fillRect(119 + x, 110, 1, 2);
        g2d.fillRect(100 + x, 111, 1, 1);
        g2d.fillRect(120 + x, 111, 1, 1);
        g2d.fillRect(106 + x, 112, 1, 2);
        g2d.fillRect(115 + x, 112, 1, 2);
        g2d.fillRect(107 + x, 113, 1, 2);
        g2d.fillRect(114 + x, 113, 1, 1);
        g2d.fillRect(108 + x, 114, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 83, 1, 1);
        g2d.fillRect(118 + x, 83, 1, 14);
        g2d.fillRect(99 + x, 84, 1, 4);
        g2d.fillRect(112 + x, 84, 1, 1);
        g2d.fillRect(117 + x, 84, 1, 2);
        g2d.fillRect(98 + x, 85, 1, 6);
        g2d.fillRect(108 + x, 85, 1, 2);
        g2d.fillRect(104 + x, 86, 1, 9);
        g2d.fillRect(105 + x, 86, 1, 1);
        g2d.fillRect(109 + x, 86, 1, 3);
        g2d.fillRect(110 + x, 86, 1, 9);
        g2d.fillRect(111 + x, 86, 1, 2);
        g2d.fillRect(112 + x, 86, 1, 23);
        g2d.fillRect(116 + x, 86, 1, 1);
        g2d.fillRect(119 + x, 86, 1, 5);
        g2d.fillRect(121 + x, 86, 1, 4);
        g2d.fillRect(97 + x, 87, 1, 7);
        g2d.fillRect(101 + x, 88, 1, 12);
        g2d.fillRect(102 + x, 88, 1, 1);
        g2d.fillRect(108 + x, 88, 1, 9);
        g2d.fillRect(116 + x, 88, 2, 1);
        g2d.fillRect(96 + x, 89, 1, 3);
        g2d.fillRect(103 + x, 89, 1, 5);
        g2d.fillRect(113 + x, 89, 1, 6);
        g2d.fillRect(117 + x, 89, 1, 4);
        g2d.fillRect(120 + x, 90, 1, 7);
        g2d.fillRect(122 + x, 90, 1, 12);
        g2d.fillRect(125 + x, 90, 1, 2);
        g2d.fillRect(95 + x, 91, 1, 3);
        g2d.fillRect(100 + x, 91, 1, 3);
        g2d.fillRect(116 + x, 91, 1, 6);
        g2d.fillRect(119 + x, 92, 1, 18);
        g2d.fillRect(123 + x, 92, 1, 3);
        g2d.fillRect(126 + x, 92, 1, 2);
        g2d.fillRect(94 + x, 94, 1, 2);
        g2d.fillRect(96 + x, 94, 1, 2);
        g2d.fillRect(99 + x, 94, 1, 3);
        g2d.fillRect(102 + x, 94, 1, 3);
        g2d.fillRect(107 + x, 94, 1, 7);
        g2d.fillRect(125 + x, 94, 1, 3);
        g2d.fillRect(127 + x, 94, 1, 8);
        g2d.fillRect(111 + x, 95, 1, 15);
        g2d.fillRect(121 + x, 95, 1, 3);
        g2d.fillRect(93 + x, 96, 1, 2);
        g2d.fillRect(100 + x, 96, 1, 9);
        g2d.fillRect(103 + x, 96, 1, 5);
        g2d.fillRect(114 + x, 96, 1, 10);
        g2d.fillRect(124 + x, 96, 1, 3);
        g2d.fillRect(128 + x, 96, 1, 2);
        g2d.fillRect(95 + x, 97, 1, 2);
        g2d.fillRect(98 + x, 97, 1, 2);
        g2d.fillRect(126 + x, 97, 1, 2);
        g2d.fillRect(92 + x, 98, 1, 3);
        g2d.fillRect(99 + x, 98, 1, 6);
        g2d.fillRect(123 + x, 98, 1, 2);
        g2d.fillRect(129 + x, 98, 1, 2);
        g2d.fillRect(120 + x, 99, 1, 12);
        g2d.fillRect(125 + x, 99, 1, 3);
        g2d.fillRect(130 + x, 99, 1, 3);
        g2d.fillRect(91 + x, 100, 1, 3);
        g2d.fillRect(94 + x, 100, 1, 2);
        g2d.fillRect(109 + x, 100, 1, 9);
        g2d.fillRect(113 + x, 100, 1, 9);
        g2d.fillRect(117 + x, 100, 1, 6);
        g2d.fillRect(128 + x, 100, 1, 3);
        g2d.fillRect(97 + x, 101, 1, 6);
        g2d.fillRect(129 + x, 101, 1, 3);
        g2d.fillRect(90 + x, 102, 1, 6);
        g2d.fillRect(93 + x, 102, 1, 2);
        g2d.fillRect(98 + x, 102, 1, 4);
        g2d.fillRect(102 + x, 102, 1, 4);
        g2d.fillRect(106 + x, 102, 1, 10);
        g2d.fillRect(124 + x, 102, 1, 1);
        g2d.fillRect(126 + x, 102, 1, 6);
        g2d.fillRect(92 + x, 103, 1, 4);
        g2d.fillRect(96 + x, 103, 1, 7);
        g2d.fillRect(108 + x, 103, 1, 5);
        g2d.fillRect(115 + x, 103, 1, 9);
        g2d.fillRect(121 + x, 103, 1, 5);
        g2d.fillRect(122 + x, 103, 2, 1);
        g2d.fillRect(89 + x, 104, 1, 3);
        g2d.fillRect(91 + x, 104, 1, 4);
        g2d.fillRect(107 + x, 104, 1, 5);
        g2d.fillRect(118 + x, 104, 1, 4);
        g2d.fillRect(123 + x, 104, 1, 7);
        g2d.fillRect(110 + x, 105, 1, 4);
        g2d.fillRect(125 + x, 105, 1, 1);
        g2d.fillRect(127 + x, 105, 1, 3);
        g2d.fillRect(95 + x, 106, 1, 2);
        g2d.fillRect(99 + x, 106, 1, 2);
        g2d.fillRect(101 + x, 107, 1, 2);
        g2d.fillRect(97 + x, 108, 1, 2);
        g2d.fillRect(98 + x, 108, 1, 1);
        g2d.fillRect(100 + x, 109, 1, 2);
        g2d.fillRect(121 + x, 109, 1, 3);
        g2d.fillRect(122 + x, 109, 1, 2);
        g2d.fillRect(95 + x, 110, 1, 2);
        g2d.fillRect(99 + x, 110, 1, 3);
        g2d.fillRect(114 + x, 110, 1, 3);
        g2d.fillRect(96 + x, 111, 1, 2);
        g2d.fillRect(98 + x, 111, 1, 2);
        g2d.fillRect(107 + x, 111, 1, 2);
        g2d.fillRect(113 + x, 111, 1, 3);
        g2d.fillRect(97 + x, 112, 1, 1);
        g2d.fillRect(108 + x, 112, 1, 2);
        g2d.fillRect(109 + x, 112, 1, 2);
        g2d.fillRect(110 + x, 112, 1, 2);
        g2d.fillRect(111 + x, 112, 1, 2);
        g2d.fillRect(112 + x, 112, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 88, 1, 7);
        g2d.fillRect(109 + x, 89, 1, 11);
        g2d.fillRect(116 + x, 89, 1, 2);
        g2d.fillRect(119 + x, 91, 1, 1);
        g2d.fillRect(96 + x, 92, 1, 2);
        g2d.fillRect(117 + x, 93, 1, 7);
        g2d.fillRect(95 + x, 94, 1, 3);
        g2d.fillRect(100 + x, 94, 1, 2);
        g2d.fillRect(103 + x, 94, 1, 2);
        g2d.fillRect(110 + x, 95, 1, 10);
        g2d.fillRect(113 + x, 95, 1, 5);
        g2d.fillRect(123 + x, 95, 1, 3);
        g2d.fillRect(94 + x, 96, 1, 4);
        g2d.fillRect(99 + x, 97, 1, 1);
        g2d.fillRect(102 + x, 97, 1, 5);
        g2d.fillRect(108 + x, 97, 1, 6);
        g2d.fillRect(118 + x, 97, 1, 7);
        g2d.fillRect(120 + x, 97, 1, 2);
        g2d.fillRect(93 + x, 98, 1, 4);
        g2d.fillRect(121 + x, 98, 1, 5);
        g2d.fillRect(98 + x, 99, 1, 3);
        g2d.fillRect(124 + x, 99, 1, 3);
        g2d.fillRect(101 + x, 100, 1, 7);
        g2d.fillRect(92 + x, 101, 1, 2);
        g2d.fillRect(107 + x, 101, 1, 3);
        g2d.fillRect(122 + x, 102, 1, 1);
        g2d.fillRect(125 + x, 102, 1, 3);
        g2d.fillRect(91 + x, 103, 1, 1);
        g2d.fillRect(122 + x, 104, 1, 5);
        g2d.fillRect(100 + x, 105, 1, 4);
        g2d.fillRect(114 + x, 106, 1, 4);
        g2d.fillRect(95 + x, 108, 1, 2);
        g2d.fillRect(99 + x, 108, 1, 2);
        g2d.fillRect(108 + x, 108, 1, 4);
        g2d.fillRect(121 + x, 108, 1, 1);
        g2d.fillRect(98 + x, 109, 1, 2);
        g2d.fillRect(107 + x, 109, 1, 2);
        g2d.fillRect(109 + x, 109, 1, 3);
        g2d.fillRect(110 + x, 109, 1, 3);
        g2d.fillRect(112 + x, 109, 1, 3);
        g2d.fillRect(113 + x, 109, 1, 2);
        g2d.fillRect(96 + x, 110, 2, 1);
        g2d.fillRect(111 + x, 110, 1, 2);
        g2d.fillRect(97 + x, 111, 1, 1);
    }
}
