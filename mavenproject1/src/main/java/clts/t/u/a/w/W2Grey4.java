/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a.w;

import clts.SuperB;
import clts.SuperC;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import pieces.clts.*;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class W2Grey4
{
    public W2Grey4()
    {
    }

    public static void paintW(Color color, int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(color);
        g2d.fillRect(78 + x, 7 + y, 1, 1);
        g2d.fillRect(79 + x, 11 + y, 1, 1);
        g2d.fillRect(138 + x, 11 + y, 1, 1);
        g2d.fillRect(140 + x, 12 + y, 1, 1);
        g2d.fillRect(138 + x, 13 + y, 1, 1);
        g2d.fillRect(86 + x, 14 + y, 1, 1);
        g2d.fillRect(137 + x, 19 + y, 1, 1);
        g2d.fillRect(138 + x, 21 + y, 1, 1);
        g2d.fillRect(147 + x, 25 + y, 1, 1);
        g2d.fillRect(92 + x, 35 + y, 1, 1);
        g2d.fillRect(93 + x, 38 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(66 + x, 41 + y, 1, 1);
        g2d.fillRect(69 + x, 44 + y, 1, 1);
        g2d.fillRect(77 + x, 44 + y, 1, 1);
        g2d.fillRect(140 + x, 47 + y, 1, 1);
        g2d.fillRect(148 + x, 51 + y, 1, 1);
        g2d.fillRect(124 + x, 53 + y, 1, 1);
        g2d.fillRect(65 + x, 54 + y, 1, 1);
        g2d.fillRect(67 + x, 54 + y, 1, 1);
        g2d.fillRect(150 + x, 54 + y, 1, 1);
        g2d.fillRect(73 + x, 55 + y, 1, 1);
        g2d.fillRect(82 + x, 55 + y, 1, 1);
        g2d.fillRect(91 + x, 55 + y, 1, 1);
        g2d.fillRect(135 + x, 55 + y, 1, 1);
        g2d.fillRect(76 + x, 58 + y, 1, 1);
        g2d.fillRect(141 + x, 58 + y, 1, 1);
        g2d.fillRect(152 + x, 58 + y, 1, 1);
        g2d.fillRect(95 + x, 63 + y, 1, 1);
        g2d.fillRect(89 + x, 64 + y, 1, 1);
        g2d.fillRect(63 + x, 65 + y, 1, 1);
        g2d.fillRect(141 + x, 66 + y, 1, 1);
        g2d.fillRect(63 + x, 72 + y, 1, 1);
        g2d.fillRect(154 + x, 72 + y, 1, 1);
        g2d.fillRect(133 + x, 73 + y, 1, 1);
        g2d.fillRect(140 + x, 74 + y, 1, 1);
        g2d.fillRect(75 + x, 75 + y, 1, 1);
        g2d.fillRect(84 + x, 75 + y, 1, 1);
        g2d.fillRect(133 + x, 75 + y, 1, 1);
        g2d.fillRect(141 + x, 77 + y, 1, 1);
        g2d.fillRect(75 + x, 79 + y, 1, 1);
        g2d.fillRect(146 + x, 79 + y, 1, 1);
        g2d.fillRect(70 + x, 81 + y, 1, 1);
        g2d.fillRect(65 + x, 82 + y, 1, 1);
        g2d.fillRect(139 + x, 83 + y, 1, 1);
        g2d.fillRect(79 + x, 84 + y, 1, 1);
        g2d.fillRect(81 + x, 84 + y, 1, 1);
        g2d.fillRect(138 + x, 84 + y, 1, 1);
        g2d.fillRect(75 + x, 86 + y, 1, 1);
        g2d.fillRect(142 + x, 86 + y, 1, 1);
        g2d.fillRect(145 + x, 86 + y, 1, 1);
        g2d.fillRect(151 + x, 87 + y, 1, 1);
        g2d.fillRect(69 + x, 90 + y, 1, 1);
        g2d.fillRect(143 + x, 90 + y, 1, 1);
        g2d.fillRect(148 + x, 90 + y, 1, 1);
        g2d.fillRect(68 + x, 91 + y, 1, 1);
        g2d.fillRect(141 + x, 91 + y, 1, 1);
        g2d.fillRect(75 + x, 92 + y, 1, 1);
        g2d.fillRect(80 + x, 92 + y, 1, 1);
        g2d.fillRect(137 + x, 92 + y, 1, 1);
        g2d.fillRect(69 + x, 93 + y, 1, 1);
        g2d.fillRect(77 + x, 93 + y, 1, 1);
        g2d.fillRect(84 + x, 93 + y, 1, 1);
        g2d.fillRect(148 + x, 93 + y, 1, 1);
        g2d.fillRect(144 + x, 95 + y, 1, 1);
        g2d.fillRect(147 + x, 97 + y, 1, 1);
        g2d.fillRect(132 + x, 104 + y, 1, 1);
        g2d.fillRect(73 + x, 105 + y, 1, 1);
        g2d.fillRect(82 + x, 106 + y, 1, 1);
        g2d.fillRect(132 + x, 106 + y, 1, 1);
        g2d.fillRect(75 + x, 107 + y, 1, 1);
        g2d.fillRect(138 + x, 107 + y, 1, 1);
        g2d.fillRect(80 + x, 110 + y, 1, 1);
        g2d.fillRect(137 + x, 110 + y, 1, 1);
        g2d.fillRect(84 + x, 112 + y, 1, 1);
        g2d.fillRect(128 + x, 117 + y, 1, 1);
        g2d.fillRect(95 + x, 131 + y, 1, 1);
    }
}
