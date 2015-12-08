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
public class W2NegGrey4
{
    public W2NegGrey4()
    {
    }

    public static void paintW(Color color, int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(color);
        g2d.fillRect(78 + x, 4 + y, 1, 1);
        g2d.fillRect(139 + x, 4 + y, 1, 1);
        g2d.fillRect(81 + x, 5 + y, 1, 1);
        g2d.fillRect(75 + x, 6 + y, 1, 1);
        g2d.fillRect(82 + x, 6 + y, 1, 1);
        g2d.fillRect(135 + x, 6 + y, 1, 1);
        g2d.fillRect(142 + x, 6 + y, 1, 1);
        g2d.fillRect(73 + x, 7 + y, 1, 1);
        g2d.fillRect(144 + x, 7 + y, 1, 1);
        g2d.fillRect(84 + x, 8 + y, 1, 1);
        g2d.fillRect(133 + x, 8 + y, 1, 1);
        g2d.fillRect(141 + x, 8 + y, 1, 2);
        g2d.fillRect(145 + x, 8 + y, 1, 1);
        g2d.fillRect(78 + x, 9 + y, 1, 1);
        g2d.fillRect(139 + x, 9 + y, 1, 1);
        g2d.fillRect(146 + x, 9 + y, 1, 1);
        g2d.fillRect(70 + x, 10 + y, 1, 1);
        g2d.fillRect(81 + x, 10 + y, 1, 1);
        g2d.fillRect(136 + x, 10 + y, 1, 1);
        g2d.fillRect(147 + x, 10 + y, 1, 1);
        g2d.fillRect(69 + x, 11 + y, 1, 1);
        g2d.fillRect(73 + x, 11 + y, 1, 1);
        g2d.fillRect(87 + x, 11 + y, 1, 2);
        g2d.fillRect(130 + x, 11 + y, 1, 2);
        g2d.fillRect(144 + x, 11 + y, 1, 1);
        g2d.fillRect(148 + x, 11 + y, 1, 1);
        g2d.fillRect(72 + x, 12 + y, 1, 1);
        g2d.fillRect(85 + x, 12 + y, 1, 1);
        g2d.fillRect(132 + x, 12 + y, 1, 1);
        g2d.fillRect(145 + x, 12 + y, 1, 1);
        g2d.fillRect(68 + x, 13 + y, 1, 1);
        g2d.fillRect(88 + x, 13 + y, 1, 1);
        g2d.fillRect(129 + x, 13 + y, 1, 1);
        g2d.fillRect(149 + x, 13 + y, 1, 1);
        g2d.fillRect(78 + x, 14 + y, 1, 1);
        g2d.fillRect(139 + x, 14 + y, 1, 1);
        g2d.fillRect(80 + x, 15 + y, 1, 1);
        g2d.fillRect(85 + x, 15 + y, 1, 1);
        g2d.fillRect(89 + x, 15 + y, 1, 1);
        g2d.fillRect(132 + x, 15 + y, 1, 1);
        g2d.fillRect(137 + x, 15 + y, 1, 1);
        g2d.fillRect(150 + x, 15 + y, 1, 1);
        g2d.fillRect(90 + x, 16 + y, 1, 1);
        g2d.fillRect(127 + x, 16 + y, 1, 1);
        g2d.fillRect(143 + x, 16 + y, 1, 1);
        g2d.fillRect(66 + x, 17 + y, 1, 1);
        g2d.fillRect(81 + x, 17 + y, 1, 1);
        g2d.fillRect(136 + x, 17 + y, 1, 1);
        g2d.fillRect(151 + x, 17 + y, 1, 1);
        g2d.fillRect(127 + x, 18 + y, 1, 1);
        g2d.fillRect(65 + x, 19 + y, 1, 1);
        g2d.fillRect(75 + x, 19 + y, 1, 1);
        g2d.fillRect(82 + x, 19 + y, 1, 1);
        g2d.fillRect(135 + x, 19 + y, 1, 1);
        g2d.fillRect(142 + x, 19 + y, 1, 1);
        g2d.fillRect(73 + x, 20 + y, 1, 1);
        g2d.fillRect(144 + x, 20 + y, 1, 1);
        g2d.fillRect(64 + x, 21 + y, 1, 1);
        g2d.fillRect(68 + x, 21 + y, 1, 1);
        g2d.fillRect(149 + x, 21 + y, 1, 1);
        g2d.fillRect(153 + x, 21 + y, 1, 1);
        g2d.fillRect(73 + x, 22 + y, 1, 1);
        g2d.fillRect(88 + x, 22 + y, 1, 1);
        g2d.fillRect(93 + x, 22 + y, 1, 1);
        g2d.fillRect(124 + x, 22 + y, 1, 1);
        g2d.fillRect(129 + x, 22 + y, 1, 1);
        g2d.fillRect(144 + x, 22 + y, 1, 1);
        g2d.fillRect(64 + x, 23 + y, 2, 1);
        g2d.fillRect(152 + x, 23 + y, 2, 1);
        g2d.fillRect(63 + x, 24 + y, 1, 1);
        g2d.fillRect(135 + x, 24 + y, 1, 1);
        g2d.fillRect(150 + x, 24 + y, 1, 1);
        g2d.fillRect(154 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 25 + y, 1, 1);
        g2d.fillRect(123 + x, 25 + y, 1, 1);
        g2d.fillRect(63 + x, 26 + y, 1, 1);
        g2d.fillRect(68 + x, 27 + y, 1, 1);
        g2d.fillRect(149 + x, 27 + y, 1, 1);
        g2d.fillRect(62 + x, 28 + y, 1, 1);
        g2d.fillRect(155 + x, 28 + y, 1, 1);
        g2d.fillRect(70 + x, 29 + y, 1, 1);
        g2d.fillRect(147 + x, 29 + y, 1, 1);
        g2d.fillRect(62 + x, 30 + y, 1, 1);
        g2d.fillRect(155 + x, 30 + y, 1, 1);
        g2d.fillRect(156 + x, 31 + y, 1, 1);
        g2d.fillRect(60 + x, 33 + y, 1, 1);
        g2d.fillRect(157 + x, 33 + y, 1, 1);
        g2d.fillRect(63 + x, 34 + y, 2, 1);
        g2d.fillRect(153 + x, 34 + y, 2, 1);
        g2d.fillRect(60 + x, 35 + y, 1, 2);
        g2d.fillRect(157 + x, 35 + y, 1, 2);
        g2d.fillRect(60 + x, 38 + y, 1, 2);
        g2d.fillRect(157 + x, 38 + y, 1, 1);
        g2d.fillRect(60 + x, 41 + y, 1, 1);
        g2d.fillRect(157 + x, 41 + y, 1, 1);
        g2d.fillRect(64 + x, 42 + y, 1, 1);
        g2d.fillRect(60 + x, 43 + y, 1, 1);
        g2d.fillRect(67 + x, 43 + y, 1, 1);
        g2d.fillRect(150 + x, 43 + y, 1, 1);
        g2d.fillRect(157 + x, 43 + y, 1, 1);
        g2d.fillRect(60 + x, 45 + y, 1, 1);
        g2d.fillRect(157 + x, 45 + y, 1, 1);
        g2d.fillRect(60 + x, 47 + y, 1, 2);
        g2d.fillRect(157 + x, 47 + y, 1, 2);
        g2d.fillRect(60 + x, 51 + y, 1, 1);
        g2d.fillRect(157 + x, 51 + y, 1, 1);
        g2d.fillRect(60 + x, 53 + y, 1, 2);
        g2d.fillRect(63 + x, 53 + y, 1, 1);
        g2d.fillRect(154 + x, 53 + y, 1, 1);
        g2d.fillRect(157 + x, 53 + y, 1, 2);
        g2d.fillRect(60 + x, 56 + y, 1, 2);
        g2d.fillRect(64 + x, 56 + y, 1, 1);
        g2d.fillRect(153 + x, 56 + y, 1, 1);
        g2d.fillRect(157 + x, 56 + y, 1, 2);
        g2d.fillRect(60 + x, 59 + y, 1, 1);
        g2d.fillRect(157 + x, 59 + y, 1, 2);
        g2d.fillRect(67 + x, 60 + y, 1, 1);
        g2d.fillRect(150 + x, 60 + y, 1, 1);
        g2d.fillRect(60 + x, 62 + y, 1, 1);
        g2d.fillRect(157 + x, 62 + y, 1, 1);
        g2d.fillRect(61 + x, 63 + y, 1, 2);
        g2d.fillRect(156 + x, 64 + y, 1, 1);
        g2d.fillRect(61 + x, 66 + y, 1, 4);
        g2d.fillRect(156 + x, 66 + y, 1, 4);
        g2d.fillRect(65 + x, 69 + y, 1, 1);
        g2d.fillRect(152 + x, 69 + y, 1, 1);
        g2d.fillRect(61 + x, 71 + y, 1, 1);
        g2d.fillRect(156 + x, 71 + y, 1, 1);
        g2d.fillRect(152 + x, 72 + y, 1, 2);
        g2d.fillRect(62 + x, 73 + y, 1, 1);
        g2d.fillRect(65 + x, 73 + y, 1, 1);
        g2d.fillRect(155 + x, 73 + y, 1, 2);
        g2d.fillRect(62 + x, 76 + y, 1, 2);
        g2d.fillRect(155 + x, 77 + y, 1, 1);
        g2d.fillRect(67 + x, 78 + y, 1, 2);
        g2d.fillRect(150 + x, 78 + y, 1, 2);
        g2d.fillRect(62 + x, 79 + y, 1, 3);
        g2d.fillRect(155 + x, 79 + y, 1, 3);
        g2d.fillRect(154 + x, 83 + y, 1, 1);
        g2d.fillRect(63 + x, 85 + y, 1, 1);
        g2d.fillRect(154 + x, 85 + y, 1, 1);
        g2d.fillRect(64 + x, 87 + y, 1, 1);
        g2d.fillRect(153 + x, 87 + y, 1, 1);
        g2d.fillRect(65 + x, 89 + y, 1, 1);
        g2d.fillRect(152 + x, 89 + y, 1, 1);
        g2d.fillRect(66 + x, 91 + y, 1, 1);
        g2d.fillRect(151 + x, 91 + y, 1, 1);
        g2d.fillRect(67 + x, 93 + y, 1, 1);
        g2d.fillRect(150 + x, 93 + y, 1, 1);
        g2d.fillRect(150 + x, 95 + y, 1, 1);
        g2d.fillRect(68 + x, 97 + y, 1, 1);
        g2d.fillRect(149 + x, 97 + y, 1, 1);
        g2d.fillRect(69 + x, 100 + y, 1, 1);
        g2d.fillRect(148 + x, 100 + y, 1, 1);
        g2d.fillRect(70 + x, 103 + y, 1, 1);
        g2d.fillRect(147 + x, 103 + y, 1, 1);
        g2d.fillRect(73 + x, 108 + y, 1, 1);
        g2d.fillRect(144 + x, 108 + y, 1, 1);
        g2d.fillRect(136 + x, 119 + y, 1, 1);
        g2d.fillRect(90 + x, 122 + y, 1, 1);
        g2d.fillRect(127 + x, 122 + y, 1, 1);
        g2d.fillRect(85 + x, 124 + y, 1, 1);
        g2d.fillRect(132 + x, 124 + y, 1, 1);
        g2d.fillRect(96 + x, 125 + y, 1, 1);
        g2d.fillRect(121 + x, 125 + y, 1, 1);
        g2d.fillRect(87 + x, 126 + y, 1, 1);
        g2d.fillRect(97 + x, 126 + y, 1, 1);
        g2d.fillRect(130 + x, 126 + y, 1, 1);
        g2d.fillRect(88 + x, 127 + y, 1, 1);
        g2d.fillRect(129 + x, 127 + y, 1, 1);
        g2d.fillRect(97 + x, 128 + y, 1, 1);
        g2d.fillRect(120 + x, 128 + y, 1, 1);
        g2d.fillRect(90 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 129 + y, 1, 1);
        g2d.fillRect(127 + x, 129 + y, 1, 1);
        g2d.fillRect(91 + x, 130 + y, 2, 1);
        g2d.fillRect(99 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 130 + y, 1, 1);
        g2d.fillRect(125 + x, 130 + y, 2, 1);
        g2d.fillRect(93 + x, 131 + y, 1, 1);
        g2d.fillRect(101 + x, 131 + y, 2, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(124 + x, 131 + y, 1, 1);
        g2d.fillRect(103 + x, 132 + y, 1, 1);
        g2d.fillRect(114 + x, 132 + y, 1, 1);
        g2d.fillRect(122 + x, 132 + y, 1, 1);
        g2d.fillRect(105 + x, 133 + y, 1, 1);
        g2d.fillRect(112 + x, 133 + y, 1, 1);
        g2d.fillRect(98 + x, 134 + y, 3, 1);
        g2d.fillRect(117 + x, 134 + y, 3, 1);
        g2d.fillRect(102 + x, 135 + y, 2, 1);
        g2d.fillRect(105 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 1, 1);
        g2d.fillRect(114 + x, 135 + y, 2, 1);
    }
}
