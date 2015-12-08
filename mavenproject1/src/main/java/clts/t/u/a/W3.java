/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

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
public class W3 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public W3()
    {
        super();
        includeY = true;
    }

    public W3(int layer)
    {
        super(layer);
        includeY = true;
    }

    public W3(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public W3(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryBack(offsetX, offsetY, g2d);
        if(!isIncludeY())
            offsetY = 0;
        paintW(offsetX, offsetY, g2d);
    }

    public void paintW(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(84 + x, 21 + y, 1, 2);
        g2d.fillRect(85 + x, 21 + y, 1, 5);
        g2d.fillRect(130 + x, 21 + y, 1, 5);
        g2d.fillRect(131 + x, 21 + y, 1, 2);
        g2d.fillRect(82 + x, 23 + y, 1, 2);
        g2d.fillRect(83 + x, 23 + y, 1, 1);
        g2d.fillRect(132 + x, 23 + y, 2, 1);
        g2d.fillRect(133 + x, 24 + y, 1, 1);
        g2d.fillRect(81 + x, 25 + y, 1, 1);
        g2d.fillRect(134 + x, 25 + y, 1, 1);
        g2d.fillRect(80 + x, 26 + y, 1, 2);
        g2d.fillRect(86 + x, 26 + y, 1, 5);
        g2d.fillRect(129 + x, 26 + y, 1, 5);
        g2d.fillRect(135 + x, 26 + y, 1, 2);
        g2d.fillRect(79 + x, 27 + y, 1, 2);
        g2d.fillRect(136 + x, 27 + y, 1, 2);
        g2d.fillRect(78 + x, 29 + y, 1, 3);
        g2d.fillRect(137 + x, 29 + y, 1, 3);
        g2d.fillRect(87 + x, 31 + y, 1, 2);
        g2d.fillRect(128 + x, 31 + y, 1, 2);
        g2d.fillRect(77 + x, 32 + y, 1, 4);
        g2d.fillRect(138 + x, 32 + y, 1, 4);
        g2d.fillRect(88 + x, 33 + y, 1, 2);
        g2d.fillRect(127 + x, 33 + y, 1, 2);
        g2d.fillRect(89 + x, 35 + y, 1, 2);
        g2d.fillRect(126 + x, 35 + y, 1, 2);
        g2d.fillRect(76 + x, 36 + y, 1, 6);
        g2d.fillRect(139 + x, 36 + y, 1, 6);
        g2d.fillRect(90 + x, 37 + y, 1, 1);
        g2d.fillRect(125 + x, 37 + y, 1, 1);
        g2d.fillRect(91 + x, 38 + y, 1, 2);
        g2d.fillRect(124 + x, 38 + y, 1, 2);
        g2d.fillRect(92 + x, 39 + y, 1, 2);
        g2d.fillRect(123 + x, 39 + y, 1, 2);
        g2d.fillRect(93 + x, 40 + y, 1, 2);
        g2d.fillRect(122 + x, 40 + y, 1, 2);
        g2d.fillRect(94 + x, 41 + y, 1, 2);
        g2d.fillRect(121 + x, 41 + y, 1, 2);
        g2d.fillRect(77 + x, 42 + y, 1, 2);
        g2d.fillRect(138 + x, 42 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(120 + x, 43 + y, 1, 2);
        g2d.fillRect(78 + x, 44 + y, 1, 3);
        g2d.fillRect(96 + x, 44 + y, 1, 2);
        g2d.fillRect(119 + x, 44 + y, 1, 2);
        g2d.fillRect(137 + x, 44 + y, 1, 3);
        g2d.fillRect(66 + x, 46 + y, 1, 4);
        g2d.fillRect(79 + x, 46 + y, 1, 2);
        g2d.fillRect(80 + x, 46 + y, 7, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(129 + x, 46 + y, 8, 1);
        g2d.fillRect(149 + x, 46 + y, 1, 4);
        g2d.fillRect(67 + x, 47 + y, 11, 1);
        g2d.fillRect(87 + x, 47 + y, 2, 1);
        g2d.fillRect(127 + x, 47 + y, 2, 1);
        g2d.fillRect(136 + x, 47 + y, 1, 1);
        g2d.fillRect(138 + x, 47 + y, 11, 1);
        g2d.fillRect(80 + x, 48 + y, 1, 1);
        g2d.fillRect(89 + x, 48 + y, 2, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 8);
        g2d.fillRect(117 + x, 48 + y, 1, 8);
        g2d.fillRect(125 + x, 48 + y, 2, 1);
        g2d.fillRect(135 + x, 48 + y, 1, 1);
        g2d.fillRect(81 + x, 49 + y, 1, 2);
        g2d.fillRect(91 + x, 49 + y, 1, 1);
        g2d.fillRect(124 + x, 49 + y, 1, 1);
        g2d.fillRect(134 + x, 49 + y, 1, 2);
        g2d.fillRect(67 + x, 50 + y, 1, 2);
        g2d.fillRect(82 + x, 50 + y, 1, 2);
        g2d.fillRect(92 + x, 50 + y, 2, 1);
        g2d.fillRect(122 + x, 50 + y, 1, 2);
        g2d.fillRect(123 + x, 50 + y, 1, 1);
        g2d.fillRect(133 + x, 50 + y, 1, 2);
        g2d.fillRect(148 + x, 50 + y, 1, 2);
        g2d.fillRect(83 + x, 51 + y, 1, 2);
        g2d.fillRect(93 + x, 51 + y, 2, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 2);
        g2d.fillRect(132 + x, 51 + y, 1, 2);
        g2d.fillRect(68 + x, 52 + y, 1, 3);
        g2d.fillRect(84 + x, 52 + y, 1, 1);
        g2d.fillRect(94 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(131 + x, 52 + y, 1, 1);
        g2d.fillRect(147 + x, 52 + y, 1, 3);
        g2d.fillRect(85 + x, 53 + y, 2, 1);
        g2d.fillRect(95 + x, 53 + y, 2, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 3);
        g2d.fillRect(129 + x, 53 + y, 2, 1);
        g2d.fillRect(87 + x, 54 + y, 3, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 2);
        g2d.fillRect(97 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(126 + x, 54 + y, 1, 2);
        g2d.fillRect(127 + x, 54 + y, 2, 1);
        g2d.fillRect(69 + x, 55 + y, 1, 1);
        g2d.fillRect(89 + x, 55 + y, 7, 1);
        g2d.fillRect(120 + x, 55 + y, 6, 1);
        g2d.fillRect(146 + x, 55 + y, 1, 1);
        g2d.fillRect(70 + x, 56 + y, 1, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 2);
        g2d.fillRect(94 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 2, 1);
        g2d.fillRect(145 + x, 56 + y, 1, 1);
        g2d.fillRect(71 + x, 57 + y, 2, 1);
        g2d.fillRect(122 + x, 57 + y, 1, 1);
        g2d.fillRect(143 + x, 57 + y, 1, 2);
        g2d.fillRect(144 + x, 57 + y, 1, 1);
        g2d.fillRect(72 + x, 58 + y, 3, 1);
        g2d.fillRect(89 + x, 58 + y, 4, 1);
        g2d.fillRect(123 + x, 58 + y, 4, 1);
        g2d.fillRect(141 + x, 58 + y, 1, 2);
        g2d.fillRect(142 + x, 58 + y, 1, 1);
        g2d.fillRect(74 + x, 59 + y, 3, 1);
        g2d.fillRect(86 + x, 59 + y, 1, 2);
        g2d.fillRect(87 + x, 59 + y, 2, 1);
        g2d.fillRect(127 + x, 59 + y, 3, 1);
        g2d.fillRect(139 + x, 59 + y, 2, 1);
        g2d.fillRect(77 + x, 60 + y, 9, 1);
        g2d.fillRect(129 + x, 60 + y, 10, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(84 + x, 23 + y, 1, 4);
        g2d.fillRect(131 + x, 23 + y, 1, 4);
        g2d.fillRect(83 + x, 24 + y, 1, 2);
        g2d.fillRect(132 + x, 24 + y, 1, 2);
        g2d.fillRect(82 + x, 25 + y, 1, 2);
        g2d.fillRect(133 + x, 25 + y, 1, 2);
        g2d.fillRect(81 + x, 26 + y, 1, 2);
        g2d.fillRect(85 + x, 26 + y, 1, 5);
        g2d.fillRect(130 + x, 26 + y, 1, 5);
        g2d.fillRect(134 + x, 26 + y, 1, 2);
        g2d.fillRect(80 + x, 28 + y, 1, 3);
        g2d.fillRect(135 + x, 28 + y, 1, 3);
        g2d.fillRect(79 + x, 29 + y, 1, 4);
        g2d.fillRect(136 + x, 29 + y, 1, 4);
        g2d.fillRect(86 + x, 31 + y, 1, 2);
        g2d.fillRect(129 + x, 31 + y, 1, 2);
        g2d.fillRect(78 + x, 32 + y, 1, 4);
        g2d.fillRect(137 + x, 32 + y, 1, 4);
        g2d.fillRect(87 + x, 33 + y, 1, 3);
        g2d.fillRect(128 + x, 33 + y, 1, 3);
        g2d.fillRect(88 + x, 35 + y, 1, 2);
        g2d.fillRect(127 + x, 35 + y, 1, 2);
        g2d.fillRect(77 + x, 36 + y, 1, 6);
        g2d.fillRect(138 + x, 36 + y, 1, 6);
        g2d.fillRect(89 + x, 37 + y, 1, 2);
        g2d.fillRect(126 + x, 37 + y, 1, 2);
        g2d.fillRect(90 + x, 38 + y, 1, 2);
        g2d.fillRect(125 + x, 38 + y, 1, 2);
        g2d.fillRect(91 + x, 40 + y, 1, 1);
        g2d.fillRect(124 + x, 40 + y, 1, 1);
        g2d.fillRect(92 + x, 41 + y, 1, 2);
        g2d.fillRect(123 + x, 41 + y, 1, 2);
        g2d.fillRect(78 + x, 42 + y, 1, 2);
        g2d.fillRect(93 + x, 42 + y, 1, 2);
        g2d.fillRect(122 + x, 42 + y, 1, 2);
        g2d.fillRect(137 + x, 42 + y, 1, 2);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(121 + x, 43 + y, 1, 2);
        g2d.fillRect(79 + x, 44 + y, 1, 2);
        g2d.fillRect(136 + x, 44 + y, 1, 2);
        g2d.fillRect(95 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 45 + y, 1, 2);
        g2d.fillRect(96 + x, 46 + y, 1, 3);
        g2d.fillRect(119 + x, 46 + y, 1, 3);
        g2d.fillRect(78 + x, 47 + y, 1, 2);
        g2d.fillRect(80 + x, 47 + y, 7, 1);
        g2d.fillRect(129 + x, 47 + y, 1, 2);
        g2d.fillRect(130 + x, 47 + y, 6, 1);
        g2d.fillRect(137 + x, 47 + y, 1, 2);
        g2d.fillRect(68 + x, 48 + y, 1, 4);
        g2d.fillRect(69 + x, 48 + y, 2, 1);
        g2d.fillRect(72 + x, 48 + y, 4, 1);
        g2d.fillRect(77 + x, 48 + y, 1, 1);
        g2d.fillRect(81 + x, 48 + y, 2, 1);
        g2d.fillRect(86 + x, 48 + y, 3, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 6);
        g2d.fillRect(118 + x, 48 + y, 1, 6);
        g2d.fillRect(127 + x, 48 + y, 2, 1);
        g2d.fillRect(133 + x, 48 + y, 1, 2);
        g2d.fillRect(134 + x, 48 + y, 1, 1);
        g2d.fillRect(138 + x, 48 + y, 1, 1);
        g2d.fillRect(140 + x, 48 + y, 4, 1);
        g2d.fillRect(145 + x, 48 + y, 3, 1);
        g2d.fillRect(67 + x, 49 + y, 1, 1);
        g2d.fillRect(82 + x, 49 + y, 1, 1);
        g2d.fillRect(89 + x, 49 + y, 2, 1);
        g2d.fillRect(125 + x, 49 + y, 1, 2);
        g2d.fillRect(126 + x, 49 + y, 1, 1);
        g2d.fillRect(147 + x, 49 + y, 1, 3);
        g2d.fillRect(148 + x, 49 + y, 1, 1);
        g2d.fillRect(83 + x, 50 + y, 2, 1);
        g2d.fillRect(90 + x, 50 + y, 2, 1);
        g2d.fillRect(124 + x, 50 + y, 1, 2);
        g2d.fillRect(131 + x, 50 + y, 1, 2);
        g2d.fillRect(132 + x, 50 + y, 1, 1);
        g2d.fillRect(84 + x, 51 + y, 2, 1);
        g2d.fillRect(91 + x, 51 + y, 2, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 2);
        g2d.fillRect(130 + x, 51 + y, 1, 2);
        g2d.fillRect(85 + x, 52 + y, 3, 1);
        g2d.fillRect(92 + x, 52 + y, 2, 1);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(128 + x, 52 + y, 1, 2);
        g2d.fillRect(129 + x, 52 + y, 1, 1);
        g2d.fillRect(69 + x, 53 + y, 1, 2);
        g2d.fillRect(87 + x, 53 + y, 3, 1);
        g2d.fillRect(94 + x, 53 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(126 + x, 53 + y, 2, 1);
        g2d.fillRect(146 + x, 53 + y, 1, 2);
        g2d.fillRect(70 + x, 54 + y, 1, 2);
        g2d.fillRect(90 + x, 54 + y, 4, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(122 + x, 54 + y, 4, 1);
        g2d.fillRect(145 + x, 54 + y, 1, 2);
        g2d.fillRect(71 + x, 55 + y, 1, 2);
        g2d.fillRect(144 + x, 55 + y, 1, 2);
        g2d.fillRect(73 + x, 56 + y, 1, 2);
        g2d.fillRect(92 + x, 56 + y, 1, 2);
        g2d.fillRect(123 + x, 56 + y, 1, 2);
        g2d.fillRect(142 + x, 56 + y, 1, 2);
        g2d.fillRect(74 + x, 57 + y, 1, 1);
        g2d.fillRect(88 + x, 57 + y, 1, 2);
        g2d.fillRect(89 + x, 57 + y, 3, 1);
        g2d.fillRect(124 + x, 57 + y, 4, 1);
        g2d.fillRect(141 + x, 57 + y, 1, 1);
        g2d.fillRect(75 + x, 58 + y, 4, 1);
        g2d.fillRect(85 + x, 58 + y, 1, 2);
        g2d.fillRect(86 + x, 58 + y, 2, 1);
        g2d.fillRect(127 + x, 58 + y, 4, 1);
        g2d.fillRect(137 + x, 58 + y, 1, 2);
        g2d.fillRect(138 + x, 58 + y, 1, 2);
        g2d.fillRect(139 + x, 58 + y, 2, 1);
        g2d.fillRect(77 + x, 59 + y, 8, 1);
        g2d.fillRect(130 + x, 59 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(82 + x, 27 + y, 1, 3);
        g2d.fillRect(83 + x, 27 + y, 2, 1);
        g2d.fillRect(131 + x, 27 + y, 1, 2);
        g2d.fillRect(132 + x, 27 + y, 2, 1);
        g2d.fillRect(84 + x, 28 + y, 1, 1);
        g2d.fillRect(133 + x, 28 + y, 1, 2);
        g2d.fillRect(81 + x, 29 + y, 1, 3);
        g2d.fillRect(134 + x, 29 + y, 1, 3);
        g2d.fillRect(84 + x, 30 + y, 1, 2);
        g2d.fillRect(131 + x, 30 + y, 1, 2);
        g2d.fillRect(85 + x, 31 + y, 1, 4);
        g2d.fillRect(130 + x, 31 + y, 1, 4);
        g2d.fillRect(80 + x, 32 + y, 1, 2);
        g2d.fillRect(135 + x, 32 + y, 1, 2);
        g2d.fillRect(79 + x, 33 + y, 1, 1);
        g2d.fillRect(136 + x, 33 + y, 1, 1);
        g2d.fillRect(86 + x, 34 + y, 1, 3);
        g2d.fillRect(129 + x, 34 + y, 1, 3);
        g2d.fillRect(79 + x, 35 + y, 1, 3);
        g2d.fillRect(136 + x, 35 + y, 1, 3);
        g2d.fillRect(87 + x, 36 + y, 1, 2);
        g2d.fillRect(128 + x, 36 + y, 1, 2);
        g2d.fillRect(78 + x, 37 + y, 1, 2);
        g2d.fillRect(137 + x, 37 + y, 1, 2);
        g2d.fillRect(88 + x, 38 + y, 1, 2);
        g2d.fillRect(127 + x, 38 + y, 1, 2);
        g2d.fillRect(79 + x, 39 + y, 1, 5);
        g2d.fillRect(89 + x, 39 + y, 1, 2);
        g2d.fillRect(126 + x, 39 + y, 1, 2);
        g2d.fillRect(136 + x, 39 + y, 1, 5);
        g2d.fillRect(78 + x, 40 + y, 1, 2);
        g2d.fillRect(90 + x, 40 + y, 1, 2);
        g2d.fillRect(125 + x, 40 + y, 1, 2);
        g2d.fillRect(137 + x, 40 + y, 1, 2);
        g2d.fillRect(91 + x, 41 + y, 1, 3);
        g2d.fillRect(124 + x, 41 + y, 1, 3);
        g2d.fillRect(80 + x, 43 + y, 1, 3);
        g2d.fillRect(92 + x, 43 + y, 1, 2);
        g2d.fillRect(123 + x, 43 + y, 1, 2);
        g2d.fillRect(135 + x, 43 + y, 1, 3);
        g2d.fillRect(93 + x, 44 + y, 1, 2);
        g2d.fillRect(122 + x, 44 + y, 1, 2);
        g2d.fillRect(81 + x, 45 + y, 1, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 2);
        g2d.fillRect(121 + x, 45 + y, 1, 2);
        g2d.fillRect(134 + x, 45 + y, 1, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 2);
        g2d.fillRect(79 + x, 48 + y, 1, 2);
        g2d.fillRect(83 + x, 48 + y, 1, 2);
        g2d.fillRect(84 + x, 48 + y, 1, 2);
        g2d.fillRect(85 + x, 48 + y, 1, 3);
        g2d.fillRect(130 + x, 48 + y, 1, 3);
        g2d.fillRect(131 + x, 48 + y, 1, 2);
        g2d.fillRect(132 + x, 48 + y, 1, 2);
        g2d.fillRect(136 + x, 48 + y, 1, 2);
        g2d.fillRect(70 + x, 49 + y, 1, 5);
        g2d.fillRect(71 + x, 49 + y, 8, 1);
        g2d.fillRect(80 + x, 49 + y, 1, 1);
        g2d.fillRect(86 + x, 49 + y, 1, 3);
        g2d.fillRect(87 + x, 49 + y, 1, 3);
        g2d.fillRect(88 + x, 49 + y, 1, 4);
        g2d.fillRect(96 + x, 49 + y, 1, 4);
        g2d.fillRect(119 + x, 49 + y, 1, 4);
        g2d.fillRect(127 + x, 49 + y, 1, 4);
        g2d.fillRect(128 + x, 49 + y, 1, 3);
        g2d.fillRect(129 + x, 49 + y, 1, 3);
        g2d.fillRect(135 + x, 49 + y, 1, 1);
        g2d.fillRect(137 + x, 49 + y, 9, 1);
        g2d.fillRect(69 + x, 50 + y, 1, 2);
        g2d.fillRect(72 + x, 50 + y, 2, 1);
        g2d.fillRect(75 + x, 50 + y, 1, 1);
        g2d.fillRect(89 + x, 50 + y, 1, 3);
        g2d.fillRect(126 + x, 50 + y, 1, 3);
        g2d.fillRect(140 + x, 50 + y, 1, 1);
        g2d.fillRect(142 + x, 50 + y, 2, 1);
        g2d.fillRect(145 + x, 50 + y, 1, 4);
        g2d.fillRect(146 + x, 50 + y, 1, 2);
        g2d.fillRect(90 + x, 51 + y, 1, 3);
        g2d.fillRect(125 + x, 51 + y, 1, 3);
        g2d.fillRect(91 + x, 52 + y, 1, 2);
        g2d.fillRect(124 + x, 52 + y, 1, 2);
        g2d.fillRect(71 + x, 53 + y, 2, 1);
        g2d.fillRect(92 + x, 53 + y, 2, 1);
        g2d.fillRect(122 + x, 53 + y, 2, 1);
        g2d.fillRect(143 + x, 53 + y, 1, 3);
        g2d.fillRect(144 + x, 53 + y, 1, 1);
        g2d.fillRect(72 + x, 54 + y, 1, 2);
        g2d.fillRect(73 + x, 54 + y, 1, 2);
        g2d.fillRect(142 + x, 54 + y, 1, 2);
        g2d.fillRect(74 + x, 55 + y, 1, 2);
        g2d.fillRect(141 + x, 55 + y, 1, 2);
        g2d.fillRect(75 + x, 56 + y, 1, 1);
        g2d.fillRect(87 + x, 56 + y, 1, 2);
        g2d.fillRect(88 + x, 56 + y, 4, 1);
        g2d.fillRect(124 + x, 56 + y, 5, 1);
        g2d.fillRect(140 + x, 56 + y, 1, 1);
        g2d.fillRect(76 + x, 57 + y, 3, 1);
        g2d.fillRect(84 + x, 57 + y, 1, 2);
        g2d.fillRect(85 + x, 57 + y, 2, 1);
        g2d.fillRect(128 + x, 57 + y, 4, 1);
        g2d.fillRect(137 + x, 57 + y, 3, 1);
        g2d.fillRect(79 + x, 58 + y, 5, 1);
        g2d.fillRect(131 + x, 58 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(83 + x, 28 + y, 1, 6);
        g2d.fillRect(132 + x, 28 + y, 1, 6);
        g2d.fillRect(82 + x, 31 + y, 1, 2);
        g2d.fillRect(133 + x, 31 + y, 1, 2);
        g2d.fillRect(81 + x, 32 + y, 1, 4);
        g2d.fillRect(84 + x, 32 + y, 1, 4);
        g2d.fillRect(131 + x, 32 + y, 1, 4);
        g2d.fillRect(134 + x, 32 + y, 1, 4);
        g2d.fillRect(80 + x, 34 + y, 1, 9);
        g2d.fillRect(135 + x, 34 + y, 1, 9);
        g2d.fillRect(82 + x, 35 + y, 1, 4);
        g2d.fillRect(85 + x, 35 + y, 1, 2);
        g2d.fillRect(130 + x, 35 + y, 1, 2);
        g2d.fillRect(133 + x, 35 + y, 1, 4);
        g2d.fillRect(84 + x, 37 + y, 1, 1);
        g2d.fillRect(86 + x, 37 + y, 1, 2);
        g2d.fillRect(129 + x, 37 + y, 1, 2);
        g2d.fillRect(131 + x, 37 + y, 1, 1);
        g2d.fillRect(79 + x, 38 + y, 1, 1);
        g2d.fillRect(87 + x, 38 + y, 1, 3);
        g2d.fillRect(128 + x, 38 + y, 1, 3);
        g2d.fillRect(136 + x, 38 + y, 1, 1);
        g2d.fillRect(81 + x, 40 + y, 1, 5);
        g2d.fillRect(88 + x, 40 + y, 1, 2);
        g2d.fillRect(127 + x, 40 + y, 1, 2);
        g2d.fillRect(134 + x, 40 + y, 1, 5);
        g2d.fillRect(89 + x, 41 + y, 1, 3);
        g2d.fillRect(126 + x, 41 + y, 1, 3);
        g2d.fillRect(82 + x, 42 + y, 1, 1);
        g2d.fillRect(87 + x, 42 + y, 1, 1);
        g2d.fillRect(90 + x, 42 + y, 1, 4);
        g2d.fillRect(125 + x, 42 + y, 1, 4);
        g2d.fillRect(128 + x, 42 + y, 1, 1);
        g2d.fillRect(133 + x, 42 + y, 1, 1);
        g2d.fillRect(83 + x, 43 + y, 1, 1);
        g2d.fillRect(132 + x, 43 + y, 1, 1);
        g2d.fillRect(82 + x, 44 + y, 1, 2);
        g2d.fillRect(91 + x, 44 + y, 1, 1);
        g2d.fillRect(124 + x, 44 + y, 1, 1);
        g2d.fillRect(133 + x, 44 + y, 1, 2);
        g2d.fillRect(83 + x, 45 + y, 1, 1);
        g2d.fillRect(92 + x, 45 + y, 1, 2);
        g2d.fillRect(123 + x, 45 + y, 1, 2);
        g2d.fillRect(132 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 46 + y, 1, 2);
        g2d.fillRect(122 + x, 46 + y, 1, 2);
        g2d.fillRect(94 + x, 47 + y, 1, 3);
        g2d.fillRect(121 + x, 47 + y, 1, 3);
        g2d.fillRect(95 + x, 49 + y, 1, 3);
        g2d.fillRect(120 + x, 49 + y, 1, 3);
        g2d.fillRect(76 + x, 50 + y, 1, 3);
        g2d.fillRect(77 + x, 50 + y, 1, 2);
        g2d.fillRect(78 + x, 50 + y, 3, 1);
        g2d.fillRect(135 + x, 50 + y, 1, 2);
        g2d.fillRect(136 + x, 50 + y, 4, 1);
        g2d.fillRect(71 + x, 51 + y, 1, 2);
        g2d.fillRect(72 + x, 51 + y, 1, 2);
        g2d.fillRect(73 + x, 51 + y, 1, 3);
        g2d.fillRect(74 + x, 51 + y, 2, 1);
        g2d.fillRect(80 + x, 51 + y, 1, 1);
        g2d.fillRect(138 + x, 51 + y, 7, 1);
        g2d.fillRect(78 + x, 52 + y, 1, 1);
        g2d.fillRect(81 + x, 52 + y, 1, 1);
        g2d.fillRect(134 + x, 52 + y, 1, 1);
        g2d.fillRect(137 + x, 52 + y, 1, 1);
        g2d.fillRect(139 + x, 52 + y, 1, 1);
        g2d.fillRect(142 + x, 52 + y, 1, 2);
        g2d.fillRect(143 + x, 52 + y, 2, 1);
        g2d.fillRect(74 + x, 53 + y, 1, 2);
        g2d.fillRect(77 + x, 53 + y, 1, 1);
        g2d.fillRect(79 + x, 53 + y, 1, 1);
        g2d.fillRect(136 + x, 53 + y, 1, 1);
        g2d.fillRect(138 + x, 53 + y, 1, 1);
        g2d.fillRect(141 + x, 53 + y, 1, 2);
        g2d.fillRect(75 + x, 54 + y, 1, 2);
        g2d.fillRect(76 + x, 54 + y, 1, 3);
        g2d.fillRect(139 + x, 54 + y, 1, 3);
        g2d.fillRect(140 + x, 54 + y, 1, 2);
        g2d.fillRect(77 + x, 55 + y, 1, 2);
        g2d.fillRect(83 + x, 55 + y, 1, 3);
        g2d.fillRect(85 + x, 55 + y, 1, 2);
        g2d.fillRect(87 + x, 55 + y, 2, 1);
        g2d.fillRect(127 + x, 55 + y, 2, 1);
        g2d.fillRect(130 + x, 55 + y, 1, 2);
        g2d.fillRect(132 + x, 55 + y, 1, 3);
        g2d.fillRect(138 + x, 55 + y, 1, 2);
        g2d.fillRect(79 + x, 56 + y, 1, 2);
        g2d.fillRect(81 + x, 56 + y, 1, 2);
        g2d.fillRect(84 + x, 56 + y, 1, 1);
        g2d.fillRect(86 + x, 56 + y, 1, 1);
        g2d.fillRect(129 + x, 56 + y, 1, 1);
        g2d.fillRect(131 + x, 56 + y, 1, 1);
        g2d.fillRect(134 + x, 56 + y, 1, 2);
        g2d.fillRect(136 + x, 56 + y, 1, 2);
        g2d.fillRect(80 + x, 57 + y, 1, 1);
        g2d.fillRect(82 + x, 57 + y, 1, 1);
        g2d.fillRect(133 + x, 57 + y, 1, 1);
        g2d.fillRect(135 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(84 + x, 38 + y, 1, 2);
        g2d.fillRect(131 + x, 38 + y, 1, 2);
        g2d.fillRect(83 + x, 40 + y, 1, 1);
        g2d.fillRect(85 + x, 40 + y, 1, 1);
        g2d.fillRect(130 + x, 40 + y, 1, 1);
        g2d.fillRect(132 + x, 40 + y, 1, 1);
        g2d.fillRect(84 + x, 41 + y, 1, 2);
        g2d.fillRect(86 + x, 41 + y, 1, 1);
        g2d.fillRect(129 + x, 41 + y, 1, 1);
        g2d.fillRect(131 + x, 41 + y, 1, 2);
        g2d.fillRect(85 + x, 43 + y, 1, 2);
        g2d.fillRect(87 + x, 43 + y, 1, 1);
        g2d.fillRect(128 + x, 43 + y, 1, 1);
        g2d.fillRect(130 + x, 43 + y, 1, 2);
        g2d.fillRect(88 + x, 44 + y, 1, 1);
        g2d.fillRect(127 + x, 44 + y, 1, 1);
        g2d.fillRect(86 + x, 45 + y, 1, 1);
        g2d.fillRect(129 + x, 45 + y, 1, 1);
        g2d.fillRect(87 + x, 46 + y, 1, 1);
        g2d.fillRect(89 + x, 46 + y, 1, 1);
        g2d.fillRect(126 + x, 46 + y, 1, 1);
        g2d.fillRect(128 + x, 46 + y, 1, 1);
        g2d.fillRect(90 + x, 47 + y, 1, 1);
        g2d.fillRect(125 + x, 47 + y, 1, 1);
        g2d.fillRect(91 + x, 48 + y, 1, 1);
        g2d.fillRect(124 + x, 48 + y, 1, 1);
        g2d.fillRect(92 + x, 49 + y, 1, 1);
        g2d.fillRect(123 + x, 49 + y, 1, 1);
        g2d.fillRect(81 + x, 53 + y, 1, 1);
        g2d.fillRect(83 + x, 53 + y, 1, 1);
        g2d.fillRect(132 + x, 53 + y, 1, 1);
        g2d.fillRect(134 + x, 53 + y, 1, 1);
        g2d.fillRect(79 + x, 54 + y, 1, 1);
        g2d.fillRect(82 + x, 54 + y, 1, 1);
        g2d.fillRect(85 + x, 54 + y, 1, 1);
        g2d.fillRect(130 + x, 54 + y, 1, 1);
        g2d.fillRect(133 + x, 54 + y, 1, 1);
        g2d.fillRect(136 + x, 54 + y, 1, 1);
        g2d.fillRect(80 + x, 55 + y, 1, 1);
        g2d.fillRect(135 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(82 + x, 33 + y, 1, 2);
        g2d.fillRect(133 + x, 33 + y, 1, 2);
        g2d.fillRect(83 + x, 34 + y, 1, 3);
        g2d.fillRect(132 + x, 34 + y, 1, 3);
        g2d.fillRect(81 + x, 36 + y, 1, 4);
        g2d.fillRect(84 + x, 36 + y, 1, 1);
        g2d.fillRect(131 + x, 36 + y, 1, 1);
        g2d.fillRect(134 + x, 36 + y, 1, 4);
        g2d.fillRect(85 + x, 37 + y, 1, 3);
        g2d.fillRect(130 + x, 37 + y, 1, 3);
        g2d.fillRect(82 + x, 39 + y, 1, 3);
        g2d.fillRect(86 + x, 39 + y, 1, 2);
        g2d.fillRect(129 + x, 39 + y, 1, 2);
        g2d.fillRect(133 + x, 39 + y, 1, 3);
        g2d.fillRect(87 + x, 41 + y, 1, 1);
        g2d.fillRect(128 + x, 41 + y, 1, 1);
        g2d.fillRect(88 + x, 42 + y, 1, 2);
        g2d.fillRect(127 + x, 42 + y, 1, 2);
        g2d.fillRect(82 + x, 43 + y, 1, 1);
        g2d.fillRect(133 + x, 43 + y, 1, 1);
        g2d.fillRect(83 + x, 44 + y, 2, 1);
        g2d.fillRect(89 + x, 44 + y, 1, 1);
        g2d.fillRect(126 + x, 44 + y, 1, 1);
        g2d.fillRect(131 + x, 44 + y, 1, 2);
        g2d.fillRect(132 + x, 44 + y, 1, 1);
        g2d.fillRect(84 + x, 45 + y, 2, 1);
        g2d.fillRect(91 + x, 45 + y, 1, 2);
        g2d.fillRect(124 + x, 45 + y, 1, 2);
        g2d.fillRect(130 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 48 + y, 1, 2);
        g2d.fillRect(122 + x, 48 + y, 1, 2);
        g2d.fillRect(94 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(78 + x, 51 + y, 2, 1);
        g2d.fillRect(81 + x, 51 + y, 1, 1);
        g2d.fillRect(134 + x, 51 + y, 1, 1);
        g2d.fillRect(136 + x, 51 + y, 1, 2);
        g2d.fillRect(137 + x, 51 + y, 1, 1);
        g2d.fillRect(74 + x, 52 + y, 2, 1);
        g2d.fillRect(77 + x, 52 + y, 1, 1);
        g2d.fillRect(79 + x, 52 + y, 2, 1);
        g2d.fillRect(82 + x, 52 + y, 1, 1);
        g2d.fillRect(133 + x, 52 + y, 1, 1);
        g2d.fillRect(135 + x, 52 + y, 1, 1);
        g2d.fillRect(138 + x, 52 + y, 1, 1);
        g2d.fillRect(140 + x, 52 + y, 1, 2);
        g2d.fillRect(141 + x, 52 + y, 1, 1);
        g2d.fillRect(75 + x, 53 + y, 2, 1);
        g2d.fillRect(78 + x, 53 + y, 1, 1);
        g2d.fillRect(137 + x, 53 + y, 1, 1);
        g2d.fillRect(139 + x, 53 + y, 1, 1);
        g2d.fillRect(77 + x, 54 + y, 1, 1);
        g2d.fillRect(86 + x, 54 + y, 1, 2);
        g2d.fillRect(129 + x, 54 + y, 1, 2);
        g2d.fillRect(138 + x, 54 + y, 1, 1);
        g2d.fillRect(84 + x, 55 + y, 1, 1);
        g2d.fillRect(131 + x, 55 + y, 1, 1);
        g2d.fillRect(78 + x, 56 + y, 1, 1);
        g2d.fillRect(80 + x, 56 + y, 1, 1);
        g2d.fillRect(82 + x, 56 + y, 1, 1);
        g2d.fillRect(133 + x, 56 + y, 1, 1);
        g2d.fillRect(135 + x, 56 + y, 1, 1);
        g2d.fillRect(137 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(83 + x, 37 + y, 1, 3);
        g2d.fillRect(132 + x, 37 + y, 1, 3);
        g2d.fillRect(84 + x, 40 + y, 1, 1);
        g2d.fillRect(131 + x, 40 + y, 1, 1);
        g2d.fillRect(83 + x, 41 + y, 1, 2);
        g2d.fillRect(85 + x, 41 + y, 1, 2);
        g2d.fillRect(130 + x, 41 + y, 1, 2);
        g2d.fillRect(132 + x, 41 + y, 1, 2);
        g2d.fillRect(86 + x, 42 + y, 1, 3);
        g2d.fillRect(129 + x, 42 + y, 1, 3);
        g2d.fillRect(84 + x, 43 + y, 1, 1);
        g2d.fillRect(131 + x, 43 + y, 1, 1);
        g2d.fillRect(87 + x, 44 + y, 1, 2);
        g2d.fillRect(128 + x, 44 + y, 1, 2);
        g2d.fillRect(88 + x, 45 + y, 1, 2);
        g2d.fillRect(89 + x, 45 + y, 1, 1);
        g2d.fillRect(126 + x, 45 + y, 2, 1);
        g2d.fillRect(90 + x, 46 + y, 1, 1);
        g2d.fillRect(125 + x, 46 + y, 1, 1);
        g2d.fillRect(127 + x, 46 + y, 1, 1);
        g2d.fillRect(89 + x, 47 + y, 1, 1);
        g2d.fillRect(91 + x, 47 + y, 2, 1);
        g2d.fillRect(123 + x, 47 + y, 1, 2);
        g2d.fillRect(124 + x, 47 + y, 1, 1);
        g2d.fillRect(126 + x, 47 + y, 1, 1);
        g2d.fillRect(92 + x, 48 + y, 1, 1);
        g2d.fillRect(80 + x, 53 + y, 1, 2);
        g2d.fillRect(82 + x, 53 + y, 1, 1);
        g2d.fillRect(84 + x, 53 + y, 1, 2);
        g2d.fillRect(131 + x, 53 + y, 1, 2);
        g2d.fillRect(133 + x, 53 + y, 1, 1);
        g2d.fillRect(135 + x, 53 + y, 1, 2);
        g2d.fillRect(78 + x, 54 + y, 1, 2);
        g2d.fillRect(81 + x, 54 + y, 1, 2);
        g2d.fillRect(83 + x, 54 + y, 1, 1);
        g2d.fillRect(132 + x, 54 + y, 1, 1);
        g2d.fillRect(134 + x, 54 + y, 1, 2);
        g2d.fillRect(137 + x, 54 + y, 1, 2);
        g2d.fillRect(79 + x, 55 + y, 1, 1);
        g2d.fillRect(82 + x, 55 + y, 1, 1);
        g2d.fillRect(133 + x, 55 + y, 1, 1);
        g2d.fillRect(136 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(83 + x, 26 + y, 1, 1);
        g2d.fillRect(132 + x, 26 + y, 1, 1);
        g2d.fillRect(81 + x, 28 + y, 1, 1);
        g2d.fillRect(134 + x, 28 + y, 1, 1);
        g2d.fillRect(84 + x, 29 + y, 1, 1);
        g2d.fillRect(131 + x, 29 + y, 1, 1);
        g2d.fillRect(82 + x, 30 + y, 1, 1);
        g2d.fillRect(133 + x, 30 + y, 1, 1);
        g2d.fillRect(80 + x, 31 + y, 1, 1);
        g2d.fillRect(135 + x, 31 + y, 1, 1);
        g2d.fillRect(86 + x, 33 + y, 1, 1);
        g2d.fillRect(129 + x, 33 + y, 1, 1);
        g2d.fillRect(79 + x, 34 + y, 1, 1);
        g2d.fillRect(136 + x, 34 + y, 1, 1);
        g2d.fillRect(78 + x, 36 + y, 1, 1);
        g2d.fillRect(137 + x, 36 + y, 1, 1);
        g2d.fillRect(88 + x, 37 + y, 1, 1);
        g2d.fillRect(127 + x, 37 + y, 1, 1);
        g2d.fillRect(78 + x, 39 + y, 1, 1);
        g2d.fillRect(137 + x, 39 + y, 1, 1);
        g2d.fillRect(67 + x, 48 + y, 1, 1);
        g2d.fillRect(71 + x, 48 + y, 1, 1);
        g2d.fillRect(76 + x, 48 + y, 1, 1);
        g2d.fillRect(139 + x, 48 + y, 1, 1);
        g2d.fillRect(144 + x, 48 + y, 1, 1);
        g2d.fillRect(148 + x, 48 + y, 1, 1);
        g2d.fillRect(69 + x, 49 + y, 1, 1);
        g2d.fillRect(146 + x, 49 + y, 1, 1);
        g2d.fillRect(71 + x, 50 + y, 1, 1);
        g2d.fillRect(74 + x, 50 + y, 1, 1);
        g2d.fillRect(141 + x, 50 + y, 1, 1);
        g2d.fillRect(144 + x, 50 + y, 1, 1);
        g2d.fillRect(69 + x, 52 + y, 1, 1);
        g2d.fillRect(146 + x, 52 + y, 1, 1);
        g2d.fillRect(71 + x, 54 + y, 1, 1);
        g2d.fillRect(144 + x, 54 + y, 1, 1);
        g2d.fillRect(72 + x, 56 + y, 1, 1);
        g2d.fillRect(143 + x, 56 + y, 1, 1);
        g2d.fillRect(75 + x, 57 + y, 1, 1);
        g2d.fillRect(140 + x, 57 + y, 1, 1);
    }
}