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
import pieces.clts.*;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class D7 extends SuperB
{
    int prevY = 0;
    int prevPrevY = 0;
    /** Creates a new instance of GenericClothes */
    public D7()
    {
        super();
        includeY = true;
        drs = true;
        platzHeight = 10;
    }

    public D7(int layer)
    {
        super(layer);
        includeY = true;
        drs = true;
        platzHeight = 10;
    }

    public D7(ColorArray colorSwitch)
    {
        super(colorSwitch);
        includeY = true;
        drs = true;
        platzHeight = 10;
    }

    public D7(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        includeY = true;
        drs = true;
        platzHeight = 10;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintd3(x,0,g2d);
        paintd4(x,prevY,g2d);
        paintd2(x,prevY + prevPrevY,g2d);
        paintd1(x,prevY + y,g2d);

        prevPrevY = prevY;
        prevY = y;
    }

    public void paintd4(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(88 + x, 133 + y, 1, 4);
        g2d.fillRect(93 + x, 133 + y, 1, 3);
        g2d.fillRect(95 + x, 133 + y, 1, 1);
        g2d.fillRect(96 + x, 134 + y, 1, 4);
        g2d.fillRect(87 + x, 138 + y, 1, 5);
        g2d.fillRect(64 + x, 149 + y, 1, 2);
        g2d.fillRect(65 + x, 149 + y, 1, 3);
        g2d.fillRect(71 + x, 149 + y, 1, 3);
        g2d.fillRect(72 + x, 149 + y, 1, 6);
        g2d.fillRect(73 + x, 149 + y, 1, 4);
        g2d.fillRect(66 + x, 151 + y, 1, 2);
        g2d.fillRect(67 + x, 151 + y, 2, 1);
        g2d.fillRect(69 + x, 152 + y, 1, 4);
        g2d.fillRect(70 + x, 152 + y, 1, 5);
        g2d.fillRect(67 + x, 153 + y, 1, 2);
        g2d.fillRect(68 + x, 153 + y, 1, 3);
        g2d.fillRect(71 + x, 153 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(85 + x, 128 + y, 1, 10);
        g2d.fillRect(90 + x, 128 + y, 1, 5);
        g2d.fillRect(95 + x, 128 + y, 1, 5);
        g2d.fillRect(96 + x, 128 + y, 1, 6);
        g2d.fillRect(86 + x, 130 + y, 1, 4);
        g2d.fillRect(91 + x, 131 + y, 2, 1);
        g2d.fillRect(87 + x, 132 + y, 3, 1);
        g2d.fillRect(92 + x, 132 + y, 3, 1);
        g2d.fillRect(89 + x, 133 + y, 1, 1);
        g2d.fillRect(84 + x, 135 + y, 1, 4);
        g2d.fillRect(97 + x, 136 + y, 1, 2);
        g2d.fillRect(140 + x, 136 + y, 1, 3);
        g2d.fillRect(141 + x, 136 + y, 1, 5);
        g2d.fillRect(83 + x, 137 + y, 1, 5);
        g2d.fillRect(139 + x, 137 + y, 1, 1);
        g2d.fillRect(98 + x, 138 + y, 1, 2);
        g2d.fillRect(138 + x, 138 + y, 1, 8);
        g2d.fillRect(142 + x, 139 + y, 1, 4);
        g2d.fillRect(73 + x, 140 + y, 1, 4);
        g2d.fillRect(74 + x, 140 + y, 1, 2);
        g2d.fillRect(75 + x, 140 + y, 1, 1);
        g2d.fillRect(81 + x, 140 + y, 1, 4);
        g2d.fillRect(82 + x, 140 + y, 1, 3);
        g2d.fillRect(99 + x, 140 + y, 1, 2);
        g2d.fillRect(100 + x, 140 + y, 1, 8);
        g2d.fillRect(72 + x, 141 + y, 1, 6);
        g2d.fillRect(80 + x, 141 + y, 1, 5);
        g2d.fillRect(105 + x, 142 + y, 1, 12);
        g2d.fillRect(106 + x, 142 + y, 1, 4);
        g2d.fillRect(137 + x, 142 + y, 1, 10);
        g2d.fillRect(143 + x, 142 + y, 1, 2);
        g2d.fillRect(71 + x, 143 + y, 1, 5);
        g2d.fillRect(79 + x, 143 + y, 1, 4);
        g2d.fillRect(99 + x, 143 + y, 1, 3);
        g2d.fillRect(107 + x, 143 + y, 1, 14);
        g2d.fillRect(139 + x, 143 + y, 1, 6);
        g2d.fillRect(70 + x, 144 + y, 1, 3);
        g2d.fillRect(78 + x, 144 + y, 1, 4);
        g2d.fillRect(144 + x, 144 + y, 1, 3);
        g2d.fillRect(77 + x, 146 + y, 1, 3);
        g2d.fillRect(76 + x, 147 + y, 1, 4);
        g2d.fillRect(101 + x, 147 + y, 1, 3);
        g2d.fillRect(145 + x, 147 + y, 1, 5);
        g2d.fillRect(72 + x, 148 + y, 1, 1);
        g2d.fillRect(75 + x, 148 + y, 1, 4);
        g2d.fillRect(104 + x, 148 + y, 1, 7);
        g2d.fillRect(140 + x, 148 + y, 1, 10);
        g2d.fillRect(74 + x, 149 + y, 1, 6);
        g2d.fillRect(138 + x, 149 + y, 1, 6);
        g2d.fillRect(141 + x, 149 + y, 1, 9);
        g2d.fillRect(144 + x, 149 + y, 1, 2);
        g2d.fillRect(146 + x, 149 + y, 1, 2);
        g2d.fillRect(102 + x, 150 + y, 1, 1);
        g2d.fillRect(103 + x, 151 + y, 1, 4);
        g2d.fillRect(143 + x, 151 + y, 1, 1);
        g2d.fillRect(106 + x, 152 + y, 1, 2);
        g2d.fillRect(134 + x, 152 + y, 1, 9);
        g2d.fillRect(139 + x, 152 + y, 1, 6);
        g2d.fillRect(142 + x, 152 + y, 1, 4);
        g2d.fillRect(144 + x, 152 + y, 1, 1);
        g2d.fillRect(73 + x, 153 + y, 1, 4);
        g2d.fillRect(110 + x, 153 + y, 1, 6);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(143 + x, 153 + y, 1, 2);
        g2d.fillRect(112 + x, 154 + y, 1, 5);
        g2d.fillRect(72 + x, 155 + y, 1, 3);
        g2d.fillRect(71 + x, 156 + y, 1, 5);
        g2d.fillRect(70 + x, 157 + y, 1, 7);
        g2d.fillRect(132 + x, 157 + y, 1, 5);
        g2d.fillRect(135 + x, 158 + y, 1, 10);
        g2d.fillRect(138 + x, 158 + y, 1, 2);
        g2d.fillRect(69 + x, 159 + y, 1, 3);
        g2d.fillRect(111 + x, 159 + y, 1, 4);
        g2d.fillRect(119 + x, 160 + y, 1, 9);
        g2d.fillRect(136 + x, 160 + y, 1, 2);
        g2d.fillRect(137 + x, 160 + y, 1, 1);
        g2d.fillRect(72 + x, 161 + y, 1, 1);
        g2d.fillRect(71 + x, 162 + y, 1, 3);
        g2d.fillRect(73 + x, 162 + y, 1, 2);
        g2d.fillRect(133 + x, 162 + y, 1, 6);
        g2d.fillRect(72 + x, 164 + y, 1, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 3);
        g2d.fillRect(73 + x, 165 + y, 1, 1);
        g2d.fillRect(121 + x, 165 + y, 1, 6);
        g2d.fillRect(134 + x, 165 + y, 1, 4);
        g2d.fillRect(117 + x, 166 + y, 1, 4);
        g2d.fillRect(118 + x, 166 + y, 1, 2);
        g2d.fillRect(120 + x, 166 + y, 1, 5);
        g2d.fillRect(123 + x, 166 + y, 1, 5);
        g2d.fillRect(136 + x, 166 + y, 1, 2);
        g2d.fillRect(126 + x, 167 + y, 1, 3);
        g2d.fillRect(122 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 133 + y, 1, 3);
        g2d.fillRect(89 + x, 134 + y, 1, 3);
        g2d.fillRect(95 + x, 134 + y, 1, 2);
        g2d.fillRect(138 + x, 136 + y, 1, 1);
        g2d.fillRect(87 + x, 137 + y, 2, 1);
        g2d.fillRect(142 + x, 137 + y, 1, 2);
        g2d.fillRect(88 + x, 138 + y, 1, 5);
        g2d.fillRect(86 + x, 139 + y, 1, 5);
        g2d.fillRect(143 + x, 139 + y, 1, 3);
        g2d.fillRect(70 + x, 140 + y, 1, 1);
        g2d.fillRect(144 + x, 140 + y, 1, 4);
        g2d.fillRect(145 + x, 140 + y, 1, 3);
        g2d.fillRect(69 + x, 141 + y, 1, 1);
        g2d.fillRect(146 + x, 141 + y, 1, 3);
        g2d.fillRect(68 + x, 142 + y, 1, 1);
        g2d.fillRect(71 + x, 142 + y, 1, 1);
        g2d.fillRect(85 + x, 142 + y, 1, 2);
        g2d.fillRect(147 + x, 142 + y, 1, 2);
        g2d.fillRect(67 + x, 143 + y, 1, 1);
        g2d.fillRect(70 + x, 143 + y, 1, 1);
        g2d.fillRect(84 + x, 143 + y, 1, 4);
        g2d.fillRect(66 + x, 144 + y, 1, 2);
        g2d.fillRect(69 + x, 144 + y, 1, 5);
        g2d.fillRect(145 + x, 144 + y, 1, 3);
        g2d.fillRect(148 + x, 144 + y, 1, 2);
        g2d.fillRect(65 + x, 145 + y, 1, 2);
        g2d.fillRect(149 + x, 145 + y, 1, 2);
        g2d.fillRect(64 + x, 146 + y, 1, 3);
        g2d.fillRect(68 + x, 146 + y, 1, 2);
        g2d.fillRect(83 + x, 146 + y, 1, 3);
        g2d.fillRect(150 + x, 146 + y, 1, 2);
        g2d.fillRect(70 + x, 147 + y, 1, 5);
        g2d.fillRect(146 + x, 147 + y, 1, 2);
        g2d.fillRect(151 + x, 147 + y, 1, 2);
        g2d.fillRect(65 + x, 148 + y, 2, 1);
        g2d.fillRect(71 + x, 148 + y, 1, 1);
        g2d.fillRect(82 + x, 148 + y, 1, 3);
        g2d.fillRect(147 + x, 148 + y, 1, 3);
        g2d.fillRect(66 + x, 149 + y, 1, 2);
        g2d.fillRect(67 + x, 149 + y, 1, 2);
        g2d.fillRect(68 + x, 149 + y, 1, 2);
        g2d.fillRect(81 + x, 149 + y, 1, 4);
        g2d.fillRect(69 + x, 151 + y, 1, 1);
        g2d.fillRect(102 + x, 151 + y, 1, 1);
        g2d.fillRect(148 + x, 151 + y, 1, 2);
        g2d.fillRect(67 + x, 152 + y, 2, 1);
        g2d.fillRect(71 + x, 152 + y, 1, 1);
        g2d.fillRect(80 + x, 152 + y, 1, 4);
        g2d.fillRect(145 + x, 152 + y, 1, 9);
        g2d.fillRect(149 + x, 152 + y, 1, 4);
        g2d.fillRect(79 + x, 153 + y, 1, 4);
        g2d.fillRect(144 + x, 153 + y, 1, 8);
        g2d.fillRect(150 + x, 153 + y, 1, 2);
        g2d.fillRect(143 + x, 155 + y, 1, 2);
        g2d.fillRect(78 + x, 156 + y, 1, 2);
        g2d.fillRect(142 + x, 156 + y, 1, 6);
        g2d.fillRect(77 + x, 157 + y, 1, 4);
        g2d.fillRect(146 + x, 157 + y, 1, 3);
        g2d.fillRect(140 + x, 158 + y, 1, 3);
        g2d.fillRect(141 + x, 158 + y, 1, 3);
        g2d.fillRect(76 + x, 160 + y, 1, 4);
        g2d.fillRect(138 + x, 161 + y, 1, 3);
        g2d.fillRect(143 + x, 161 + y, 1, 1);
        g2d.fillRect(75 + x, 162 + y, 1, 4);
        g2d.fillRect(136 + x, 162 + y, 1, 3);
        g2d.fillRect(137 + x, 162 + y, 1, 2);
        g2d.fillRect(74 + x, 164 + y, 1, 2);
        g2d.fillRect(126 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(91 + x, 132 + y, 1, 4);
        g2d.fillRect(90 + x, 133 + y, 1, 4);
        g2d.fillRect(92 + x, 133 + y, 1, 3);
        g2d.fillRect(139 + x, 136 + y, 1, 1);
        g2d.fillRect(138 + x, 137 + y, 1, 1);
        g2d.fillRect(137 + x, 138 + y, 1, 4);
        g2d.fillRect(136 + x, 139 + y, 1, 9);
        g2d.fillRect(71 + x, 140 + y, 1, 2);
        g2d.fillRect(72 + x, 140 + y, 1, 1);
        g2d.fillRect(133 + x, 140 + y, 1, 2);
        g2d.fillRect(134 + x, 140 + y, 1, 3);
        g2d.fillRect(70 + x, 141 + y, 1, 2);
        g2d.fillRect(69 + x, 142 + y, 1, 2);
        g2d.fillRect(99 + x, 142 + y, 1, 1);
        g2d.fillRect(107 + x, 142 + y, 1, 1);
        g2d.fillRect(68 + x, 143 + y, 1, 3);
        g2d.fillRect(135 + x, 143 + y, 1, 4);
        g2d.fillRect(145 + x, 143 + y, 1, 1);
        g2d.fillRect(67 + x, 144 + y, 1, 5);
        g2d.fillRect(147 + x, 144 + y, 1, 2);
        g2d.fillRect(66 + x, 146 + y, 1, 2);
        g2d.fillRect(134 + x, 146 + y, 1, 2);
        g2d.fillRect(146 + x, 146 + y, 1, 1);
        g2d.fillRect(148 + x, 146 + y, 1, 1);
        g2d.fillRect(65 + x, 147 + y, 1, 1);
        g2d.fillRect(133 + x, 147 + y, 1, 9);
        g2d.fillRect(147 + x, 147 + y, 1, 1);
        g2d.fillRect(149 + x, 147 + y, 1, 1);
        g2d.fillRect(68 + x, 148 + y, 1, 1);
        g2d.fillRect(132 + x, 148 + y, 1, 3);
        g2d.fillRect(135 + x, 148 + y, 1, 1);
        g2d.fillRect(148 + x, 148 + y, 1, 3);
        g2d.fillRect(150 + x, 148 + y, 1, 1);
        g2d.fillRect(69 + x, 149 + y, 1, 2);
        g2d.fillRect(134 + x, 149 + y, 1, 3);
        g2d.fillRect(149 + x, 149 + y, 1, 3);
        g2d.fillRect(151 + x, 149 + y, 1, 3);
        g2d.fillRect(101 + x, 150 + y, 1, 1);
        g2d.fillRect(146 + x, 151 + y, 2, 1);
        g2d.fillRect(150 + x, 151 + y, 1, 2);
        g2d.fillRect(147 + x, 152 + y, 1, 1);
        g2d.fillRect(128 + x, 153 + y, 1, 2);
        g2d.fillRect(129 + x, 153 + y, 1, 5);
        g2d.fillRect(130 + x, 153 + y, 1, 13);
        g2d.fillRect(146 + x, 153 + y, 1, 4);
        g2d.fillRect(148 + x, 153 + y, 1, 4);
        g2d.fillRect(105 + x, 154 + y, 2, 1);
        g2d.fillRect(106 + x, 155 + y, 1, 3);
        g2d.fillRect(131 + x, 155 + y, 1, 5);
        g2d.fillRect(132 + x, 155 + y, 1, 1);
        g2d.fillRect(143 + x, 157 + y, 1, 4);
        g2d.fillRect(147 + x, 157 + y, 1, 1);
        g2d.fillRect(139 + x, 158 + y, 1, 2);
        g2d.fillRect(109 + x, 159 + y, 1, 2);
        g2d.fillRect(110 + x, 160 + y, 1, 5);
        g2d.fillRect(128 + x, 160 + y, 1, 4);
        g2d.fillRect(138 + x, 160 + y, 1, 1);
        g2d.fillRect(137 + x, 161 + y, 1, 1);
        g2d.fillRect(139 + x, 161 + y, 1, 1);
        g2d.fillRect(129 + x, 162 + y, 1, 6);
        g2d.fillRect(111 + x, 163 + y, 1, 2);
        g2d.fillRect(122 + x, 165 + y, 4, 1);
        g2d.fillRect(127 + x, 165 + y, 1, 4);
        g2d.fillRect(75 + x, 166 + y, 1, 1);
        g2d.fillRect(114 + x, 166 + y, 1, 2);
        g2d.fillRect(115 + x, 166 + y, 1, 2);
        g2d.fillRect(125 + x, 166 + y, 2, 1);
        g2d.fillRect(128 + x, 166 + y, 1, 3);
        g2d.fillRect(116 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(136 + x, 138 + y, 1, 1);
        g2d.fillRect(135 + x, 141 + y, 1, 2);
        g2d.fillRect(133 + x, 142 + y, 1, 1);
        g2d.fillRect(134 + x, 143 + y, 1, 1);
        g2d.fillRect(146 + x, 144 + y, 1, 2);
        g2d.fillRect(132 + x, 146 + y, 1, 2);
        g2d.fillRect(147 + x, 146 + y, 1, 1);
        g2d.fillRect(148 + x, 147 + y, 1, 1);
        g2d.fillRect(149 + x, 148 + y, 1, 1);
        g2d.fillRect(150 + x, 149 + y, 1, 2);
        g2d.fillRect(132 + x, 151 + y, 1, 4);
        g2d.fillRect(146 + x, 152 + y, 1, 1);
        g2d.fillRect(131 + x, 153 + y, 1, 2);
        g2d.fillRect(147 + x, 153 + y, 1, 2);
        g2d.fillRect(128 + x, 155 + y, 1, 1);
        g2d.fillRect(147 + x, 156 + y, 1, 1);
        g2d.fillRect(108 + x, 157 + y, 1, 5);
        g2d.fillRect(129 + x, 158 + y, 1, 2);
        g2d.fillRect(139 + x, 160 + y, 1, 1);
        g2d.fillRect(109 + x, 161 + y, 1, 1);
        g2d.fillRect(128 + x, 164 + y, 1, 2);
        g2d.fillRect(112 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(86 + x, 128 + y, 1, 2);
        g2d.fillRect(87 + x, 128 + y, 1, 4);
        g2d.fillRect(91 + x, 128 + y, 1, 3);
        g2d.fillRect(89 + x, 129 + y, 1, 3);
        g2d.fillRect(88 + x, 130 + y, 1, 2);
        g2d.fillRect(93 + x, 131 + y, 2, 1);
        g2d.fillRect(97 + x, 131 + y, 1, 5);
        g2d.fillRect(99 + x, 132 + y, 1, 1);
        g2d.fillRect(101 + x, 132 + y, 1, 15);
        g2d.fillRect(87 + x, 133 + y, 1, 4);
        g2d.fillRect(86 + x, 134 + y, 1, 5);
        g2d.fillRect(98 + x, 136 + y, 1, 2);
        g2d.fillRect(100 + x, 137 + y, 1, 3);
        g2d.fillRect(85 + x, 138 + y, 1, 4);
        g2d.fillRect(99 + x, 138 + y, 1, 2);
        g2d.fillRect(139 + x, 138 + y, 1, 5);
        g2d.fillRect(84 + x, 139 + y, 1, 4);
        g2d.fillRect(140 + x, 139 + y, 1, 2);
        g2d.fillRect(76 + x, 140 + y, 1, 7);
        g2d.fillRect(77 + x, 140 + y, 1, 6);
        g2d.fillRect(79 + x, 140 + y, 1, 3);
        g2d.fillRect(80 + x, 140 + y, 1, 1);
        g2d.fillRect(75 + x, 141 + y, 1, 7);
        g2d.fillRect(78 + x, 141 + y, 1, 3);
        g2d.fillRect(141 + x, 141 + y, 1, 1);
        g2d.fillRect(74 + x, 142 + y, 1, 7);
        g2d.fillRect(83 + x, 142 + y, 1, 4);
        g2d.fillRect(82 + x, 143 + y, 1, 5);
        g2d.fillRect(142 + x, 143 + y, 1, 1);
        g2d.fillRect(73 + x, 144 + y, 1, 5);
        g2d.fillRect(81 + x, 144 + y, 1, 2);
        g2d.fillRect(143 + x, 144 + y, 1, 3);
        g2d.fillRect(104 + x, 145 + y, 1, 3);
        g2d.fillRect(80 + x, 146 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 4);
        g2d.fillRect(106 + x, 146 + y, 1, 6);
        g2d.fillRect(138 + x, 146 + y, 1, 3);
        g2d.fillRect(140 + x, 146 + y, 1, 2);
        g2d.fillRect(72 + x, 147 + y, 1, 1);
        g2d.fillRect(79 + x, 147 + y, 1, 1);
        g2d.fillRect(81 + x, 147 + y, 1, 2);
        g2d.fillRect(141 + x, 147 + y, 1, 2);
        g2d.fillRect(144 + x, 147 + y, 1, 2);
        g2d.fillRect(78 + x, 148 + y, 1, 1);
        g2d.fillRect(103 + x, 148 + y, 1, 3);
        g2d.fillRect(136 + x, 148 + y, 1, 4);
        g2d.fillRect(142 + x, 148 + y, 1, 4);
        g2d.fillRect(77 + x, 149 + y, 1, 3);
        g2d.fillRect(80 + x, 149 + y, 1, 3);
        g2d.fillRect(109 + x, 149 + y, 1, 1);
        g2d.fillRect(135 + x, 149 + y, 1, 9);
        g2d.fillRect(139 + x, 149 + y, 1, 3);
        g2d.fillRect(143 + x, 149 + y, 1, 2);
        g2d.fillRect(76 + x, 151 + y, 1, 2);
        g2d.fillRect(144 + x, 151 + y, 1, 1);
        g2d.fillRect(75 + x, 152 + y, 1, 3);
        g2d.fillRect(79 + x, 152 + y, 1, 1);
        g2d.fillRect(137 + x, 152 + y, 1, 4);
        g2d.fillRect(143 + x, 152 + y, 1, 1);
        g2d.fillRect(78 + x, 153 + y, 1, 3);
        g2d.fillRect(109 + x, 154 + y, 1, 5);
        g2d.fillRect(111 + x, 154 + y, 1, 5);
        g2d.fillRect(113 + x, 154 + y, 1, 7);
        g2d.fillRect(74 + x, 155 + y, 1, 1);
        g2d.fillRect(77 + x, 155 + y, 1, 2);
        g2d.fillRect(138 + x, 155 + y, 1, 3);
        g2d.fillRect(108 + x, 156 + y, 1, 1);
        g2d.fillRect(132 + x, 156 + y, 1, 1);
        g2d.fillRect(73 + x, 157 + y, 1, 1);
        g2d.fillRect(76 + x, 157 + y, 1, 3);
        g2d.fillRect(136 + x, 157 + y, 1, 3);
        g2d.fillRect(72 + x, 158 + y, 1, 3);
        g2d.fillRect(74 + x, 158 + y, 1, 2);
        g2d.fillRect(75 + x, 158 + y, 1, 4);
        g2d.fillRect(133 + x, 158 + y, 1, 4);
        g2d.fillRect(137 + x, 158 + y, 1, 2);
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 159 + y, 1, 6);
        g2d.fillRect(116 + x, 160 + y, 1, 4);
        g2d.fillRect(118 + x, 160 + y, 1, 6);
        g2d.fillRect(120 + x, 160 + y, 1, 6);
        g2d.fillRect(71 + x, 161 + y, 1, 1);
        g2d.fillRect(73 + x, 161 + y, 2, 1);
        g2d.fillRect(134 + x, 161 + y, 1, 4);
        g2d.fillRect(72 + x, 162 + y, 1, 2);
        g2d.fillRect(74 + x, 162 + y, 1, 2);
        g2d.fillRect(132 + x, 162 + y, 1, 3);
        g2d.fillRect(73 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 164 + y, 1, 2);
        g2d.fillRect(115 + x, 164 + y, 1, 2);
        g2d.fillRect(114 + x, 165 + y, 1, 1);
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(122 + x, 166 + y, 1, 4);
        g2d.fillRect(124 + x, 166 + y, 1, 6);
        g2d.fillRect(130 + x, 166 + y, 1, 4);
        g2d.fillRect(118 + x, 168 + y, 1, 3);
        g2d.fillRect(129 + x, 168 + y, 1, 2);
        g2d.fillRect(132 + x, 168 + y, 1, 2);
        g2d.fillRect(133 + x, 168 + y, 1, 1);
        g2d.fillRect(119 + x, 169 + y, 1, 2);
        g2d.fillRect(127 + x, 169 + y, 1, 2);
        g2d.fillRect(128 + x, 169 + y, 1, 2);
        g2d.fillRect(131 + x, 169 + y, 1, 2);
        g2d.fillRect(125 + x, 170 + y, 1, 2);
        g2d.fillRect(126 + x, 170 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(135 + x, 139 + y, 1, 2);
        g2d.fillRect(133 + x, 143 + y, 1, 1);
        g2d.fillRect(134 + x, 144 + y, 1, 2);
        g2d.fillRect(132 + x, 145 + y, 1, 1);
        g2d.fillRect(133 + x, 146 + y, 1, 1);
        g2d.fillRect(135 + x, 147 + y, 1, 1);
        g2d.fillRect(134 + x, 148 + y, 1, 1);
        g2d.fillRect(147 + x, 155 + y, 1, 1);
        g2d.fillRect(128 + x, 156 + y, 1, 4);
        g2d.fillRect(107 + x, 157 + y, 1, 1);
        g2d.fillRect(129 + x, 160 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(88 + x, 128 + y, 1, 2);
        g2d.fillRect(89 + x, 128 + y, 1, 1);
        g2d.fillRect(92 + x, 128 + y, 1, 3);
        g2d.fillRect(93 + x, 128 + y, 1, 3);
        g2d.fillRect(94 + x, 129 + y, 1, 2);
        g2d.fillRect(99 + x, 133 + y, 1, 5);
        g2d.fillRect(100 + x, 133 + y, 1, 4);
        g2d.fillRect(102 + x, 138 + y, 1, 8);
        g2d.fillRect(78 + x, 140 + y, 1, 1);
        g2d.fillRect(140 + x, 141 + y, 1, 5);
        g2d.fillRect(104 + x, 142 + y, 1, 3);
        g2d.fillRect(141 + x, 142 + y, 1, 1);
        g2d.fillRect(142 + x, 144 + y, 1, 4);
        g2d.fillRect(103 + x, 145 + y, 1, 3);
        g2d.fillRect(81 + x, 146 + y, 1, 1);
        g2d.fillRect(141 + x, 146 + y, 1, 1);
        g2d.fillRect(80 + x, 147 + y, 1, 2);
        g2d.fillRect(143 + x, 147 + y, 1, 2);
        g2d.fillRect(79 + x, 148 + y, 1, 4);
        g2d.fillRect(78 + x, 149 + y, 1, 4);
        g2d.fillRect(109 + x, 150 + y, 1, 4);
        g2d.fillRect(77 + x, 152 + y, 1, 3);
        g2d.fillRect(136 + x, 152 + y, 1, 1);
        g2d.fillRect(76 + x, 153 + y, 1, 4);
        g2d.fillRect(114 + x, 154 + y, 1, 1);
        g2d.fillRect(75 + x, 155 + y, 1, 3);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(74 + x, 156 + y, 1, 2);
        g2d.fillRect(133 + x, 156 + y, 1, 2);
        g2d.fillRect(137 + x, 157 + y, 1, 1);
        g2d.fillRect(73 + x, 158 + y, 1, 3);
        g2d.fillRect(115 + x, 158 + y, 1, 6);
        g2d.fillRect(74 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 160 + y, 1, 5);
        g2d.fillRect(131 + x, 160 + y, 1, 9);
        g2d.fillRect(113 + x, 161 + y, 1, 3);
        g2d.fillRect(114 + x, 163 + y, 1, 2);
        g2d.fillRect(132 + x, 165 + y, 1, 3);
        g2d.fillRect(125 + x, 167 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(94 + x, 128 + y, 1, 1);
        g2d.fillRect(98 + x, 132 + y, 1, 4);
        g2d.fillRect(100 + x, 132 + y, 1, 1);
        g2d.fillRect(103 + x, 143 + y, 1, 2);
        g2d.fillRect(141 + x, 143 + y, 1, 3);
        g2d.fillRect(108 + x, 152 + y, 1, 3);
        g2d.fillRect(136 + x, 153 + y, 1, 4);
        g2d.fillRect(114 + x, 155 + y, 1, 8);
        g2d.fillRect(137 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 140 + y, 1, 3);
        g2d.fillRect(108 + x, 147 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(135 + x, 138 + y, 1, 1);
        g2d.fillRect(133 + x, 144 + y, 1, 2);
    }





    public void paintd1(int x, int y, GraphicsMap g2d)
    {
        if(y == -2)
            y = -1;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(93 + x, 85 + y, 4, 1);
        g2d.fillRect(91 + x, 86 + y, 2, 1);
        g2d.fillRect(90 + x, 87 + y, 1, 1);
        g2d.fillRect(89 + x, 88 + y, 1, 4);
        g2d.fillRect(88 + x, 90 + y, 1, 6);
        g2d.fillRect(92 + x, 92 + y, 1, 4);
        g2d.fillRect(87 + x, 94 + y, 1, 6);
        g2d.fillRect(91 + x, 96 + y, 1, 4);
        g2d.fillRect(86 + x, 100 + y, 1, 4);
        g2d.fillRect(90 + x, 100 + y, 1, 4);
        g2d.fillRect(89 + x, 102 + y, 1, 2);
        g2d.fillRect(85 + x, 104 + y, 1, 4);
        g2d.fillRect(84 + x, 108 + y, 1, 3);
        g2d.fillRect(83 + x, 111 + y, 1, 4);
        g2d.fillRect(82 + x, 115 + y, 1, 4);
        g2d.fillRect(81 + x, 117 + y, 1, 5);
        g2d.fillRect(80 + x, 119 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(90 + x, 104 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(93 + x, 86 + y, 4, 1);
        g2d.fillRect(91 + x, 87 + y, 2, 1);
        g2d.fillRect(90 + x, 88 + y, 1, 4);
        g2d.fillRect(89 + x, 92 + y, 1, 2);
        g2d.fillRect(93 + x, 92 + y, 1, 2);
        g2d.fillRect(91 + x, 94 + y, 1, 2);
        g2d.fillRect(88 + x, 96 + y, 1, 4);
        g2d.fillRect(92 + x, 96 + y, 1, 2);
        g2d.fillRect(90 + x, 98 + y, 1, 2);
        g2d.fillRect(87 + x, 100 + y, 1, 6);
        g2d.fillRect(91 + x, 100 + y, 1, 3);
        g2d.fillRect(86 + x, 104 + y, 1, 6);
        g2d.fillRect(89 + x, 104 + y, 1, 2);
        g2d.fillRect(88 + x, 106 + y, 1, 3);
        g2d.fillRect(85 + x, 108 + y, 1, 7);
        g2d.fillRect(84 + x, 111 + y, 1, 8);
        g2d.fillRect(87 + x, 113 + y, 1, 5);
        g2d.fillRect(83 + x, 115 + y, 1, 7);
        g2d.fillRect(86 + x, 117 + y, 1, 4);
        g2d.fillRect(82 + x, 119 + y, 1, 3);
        g2d.fillRect(85 + x, 119 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 87 + y, 1, 3);
        g2d.fillRect(94 + x, 87 + y, 3, 1);
        g2d.fillRect(91 + x, 88 + y, 1, 4);
        g2d.fillRect(92 + x, 88 + y, 1, 2);
        g2d.fillRect(96 + x, 90 + y, 1, 5);
        g2d.fillRect(90 + x, 92 + y, 1, 2);
        g2d.fillRect(94 + x, 92 + y, 1, 2);
        g2d.fillRect(89 + x, 94 + y, 1, 2);
        g2d.fillRect(93 + x, 94 + y, 1, 5);
        g2d.fillRect(92 + x, 98 + y, 1, 5);
        g2d.fillRect(87 + x, 111 + y, 1, 2);
        g2d.fillRect(85 + x, 115 + y, 1, 4);
        g2d.fillRect(86 + x, 115 + y, 1, 2);
        g2d.fillRect(84 + x, 119 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 88 + y, 1, 4);
        g2d.fillRect(95 + x, 88 + y, 1, 7);
        g2d.fillRect(96 + x, 88 + y, 1, 2);
        g2d.fillRect(92 + x, 90 + y, 1, 2);
        g2d.fillRect(93 + x, 90 + y, 1, 2);
        g2d.fillRect(91 + x, 92 + y, 1, 2);
        g2d.fillRect(90 + x, 94 + y, 1, 4);
        g2d.fillRect(94 + x, 94 + y, 1, 5);
        g2d.fillRect(89 + x, 96 + y, 1, 6);
        g2d.fillRect(88 + x, 100 + y, 1, 6);
        g2d.fillRect(87 + x, 106 + y, 1, 5);
        g2d.fillRect(86 + x, 110 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
    }





    public void paintd2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(93 + x, 134 + y, 1, 11);
        g2d.fillRect(96 + x, 136 + y, 1, 9);
        g2d.fillRect(87 + x, 141 + y, 1, 5);
        g2d.fillRect(86 + x, 146 + y, 1, 7);
        g2d.fillRect(85 + x, 153 + y, 1, 8);
        g2d.fillRect(84 + x, 161 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 134 + y, 1, 8);
        g2d.fillRect(95 + x, 134 + y, 1, 3);
        g2d.fillRect(97 + x, 136 + y, 1, 18);
        g2d.fillRect(86 + x, 142 + y, 1, 4);
        g2d.fillRect(93 + x, 145 + y, 1, 23);
        g2d.fillRect(96 + x, 145 + y, 1, 2);
        g2d.fillRect(85 + x, 146 + y, 1, 7);
        g2d.fillRect(87 + x, 146 + y, 1, 3);
        g2d.fillRect(102 + x, 150 + y, 1, 17);
        g2d.fillRect(86 + x, 153 + y, 1, 4);
        g2d.fillRect(103 + x, 153 + y, 1, 4);
        g2d.fillRect(104 + x, 153 + y, 1, 13);
        g2d.fillRect(84 + x, 156 + y, 1, 5);
        g2d.fillRect(94 + x, 160 + y, 1, 7);
        g2d.fillRect(85 + x, 161 + y, 1, 3);
        g2d.fillRect(83 + x, 165 + y, 1, 4);
        g2d.fillRect(84 + x, 165 + y, 1, 4);
        g2d.fillRect(81 + x, 168 + y, 2, 1);
        g2d.fillRect(92 + x, 168 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(91 + x, 134 + y, 1, 8);
        g2d.fillRect(92 + x, 134 + y, 1, 34);
        g2d.fillRect(89 + x, 135 + y, 1, 7);
        g2d.fillRect(95 + x, 137 + y, 1, 5);
        g2d.fillRect(98 + x, 138 + y, 1, 25);
        g2d.fillRect(88 + x, 141 + y, 1, 8);
        g2d.fillRect(85 + x, 142 + y, 1, 4);
        g2d.fillRect(94 + x, 142 + y, 1, 18);
        g2d.fillRect(84 + x, 145 + y, 1, 4);
        g2d.fillRect(83 + x, 147 + y, 1, 5);
        g2d.fillRect(96 + x, 147 + y, 1, 24);
        g2d.fillRect(82 + x, 149 + y, 1, 6);
        g2d.fillRect(87 + x, 149 + y, 1, 8);
        g2d.fillRect(101 + x, 149 + y, 1, 12);
        g2d.fillRect(81 + x, 151 + y, 1, 5);
        g2d.fillRect(84 + x, 152 + y, 1, 4);
        g2d.fillRect(105 + x, 153 + y, 1, 16);
        g2d.fillRect(80 + x, 154 + y, 1, 4);
        g2d.fillRect(97 + x, 154 + y, 1, 15);
        g2d.fillRect(79 + x, 155 + y, 1, 6);
        g2d.fillRect(95 + x, 155 + y, 1, 14);
        g2d.fillRect(78 + x, 156 + y, 1, 8);
        g2d.fillRect(83 + x, 156 + y, 1, 9);
        g2d.fillRect(106 + x, 156 + y, 1, 7);
        g2d.fillRect(86 + x, 157 + y, 1, 8);
        g2d.fillRect(103 + x, 157 + y, 1, 14);
        g2d.fillRect(77 + x, 159 + y, 1, 9);
        g2d.fillRect(76 + x, 162 + y, 1, 6);
        g2d.fillRect(110 + x, 163 + y, 1, 9);
        g2d.fillRect(111 + x, 163 + y, 1, 9);
        g2d.fillRect(82 + x, 164 + y, 1, 4);
        g2d.fillRect(85 + x, 164 + y, 1, 6);
        g2d.fillRect(113 + x, 164 + y, 1, 5);
        g2d.fillRect(104 + x, 166 + y, 1, 3);
        g2d.fillRect(114 + x, 166 + y, 1, 6);
        g2d.fillRect(115 + x, 166 + y, 1, 3);
        g2d.fillRect(116 + x, 166 + y, 1, 6);
        g2d.fillRect(102 + x, 167 + y, 1, 2);
        g2d.fillRect(78 + x, 168 + y, 3, 1);
        g2d.fillRect(91 + x, 168 + y, 1, 2);
        g2d.fillRect(86 + x, 169 + y, 5, 1);
        g2d.fillRect(112 + x, 171 + y, 2, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(90 + x, 135 + y, 1, 8);
        g2d.fillRect(89 + x, 142 + y, 1, 8);
        g2d.fillRect(91 + x, 142 + y, 1, 26);
        g2d.fillRect(95 + x, 142 + y, 1, 13);
        g2d.fillRect(99 + x, 144 + y, 1, 13);
        g2d.fillRect(100 + x, 146 + y, 1, 5);
        g2d.fillRect(84 + x, 149 + y, 1, 3);
        g2d.fillRect(88 + x, 149 + y, 1, 9);
        g2d.fillRect(83 + x, 152 + y, 1, 4);
        g2d.fillRect(81 + x, 156 + y, 1, 1);
        g2d.fillRect(82 + x, 157 + y, 1, 7);
        g2d.fillRect(87 + x, 157 + y, 1, 8);
        g2d.fillRect(80 + x, 158 + y, 1, 3);
        g2d.fillRect(108 + x, 160 + y, 1, 5);
        g2d.fillRect(109 + x, 160 + y, 1, 12);
        g2d.fillRect(79 + x, 161 + y, 1, 3);
        g2d.fillRect(101 + x, 161 + y, 1, 9);
        g2d.fillRect(98 + x, 163 + y, 1, 7);
        g2d.fillRect(106 + x, 163 + y, 1, 8);
        g2d.fillRect(78 + x, 164 + y, 1, 2);
        g2d.fillRect(81 + x, 164 + y, 1, 4);
        g2d.fillRect(112 + x, 164 + y, 1, 7);
        g2d.fillRect(86 + x, 165 + y, 1, 4);
        g2d.fillRect(80 + x, 167 + y, 1, 1);
        g2d.fillRect(97 + x, 169 + y, 1, 2);
        g2d.fillRect(102 + x, 169 + y, 1, 3);
        g2d.fillRect(105 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 2);
        g2d.fillRect(115 + x, 169 + y, 1, 2);
        g2d.fillRect(107 + x, 170 + y, 2, 1);
        g2d.fillRect(98 + x, 171 + y, 4, 1);
        g2d.fillRect(108 + x, 171 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(90 + x, 143 + y, 1, 26);
        g2d.fillRect(89 + x, 150 + y, 1, 4);
        g2d.fillRect(100 + x, 151 + y, 1, 9);
        g2d.fillRect(82 + x, 155 + y, 1, 2);
        g2d.fillRect(107 + x, 156 + y, 1, 7);
        g2d.fillRect(81 + x, 157 + y, 1, 7);
        g2d.fillRect(99 + x, 157 + y, 1, 14);
        g2d.fillRect(88 + x, 158 + y, 1, 9);
        g2d.fillRect(80 + x, 161 + y, 1, 6);
        g2d.fillRect(79 + x, 164 + y, 1, 4);
        g2d.fillRect(87 + x, 165 + y, 1, 4);
        g2d.fillRect(108 + x, 165 + y, 1, 5);
        g2d.fillRect(78 + x, 166 + y, 1, 2);
        g2d.fillRect(98 + x, 170 + y, 1, 1);
        g2d.fillRect(101 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(89 + x, 154 + y, 1, 15);
        g2d.fillRect(100 + x, 160 + y, 1, 11);
        g2d.fillRect(107 + x, 163 + y, 1, 7);
        g2d.fillRect(88 + x, 167 + y, 1, 2);
    }





    public void paintd3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(98 + x, 87 + y, 1, 7);
        g2d.fillRect(97 + x, 90 + y, 1, 6);
        g2d.fillRect(96 + x, 96 + y, 1, 2);
        g2d.fillRect(95 + x, 98 + y, 1, 2);
        g2d.fillRect(132 + x, 116 + y, 1, 3);
        g2d.fillRect(133 + x, 118 + y, 1, 2);
        g2d.fillRect(134 + x, 119 + y, 1, 2);
        g2d.fillRect(80 + x, 121 + y, 1, 6);
        g2d.fillRect(81 + x, 121 + y, 1, 4);
        g2d.fillRect(131 + x, 121 + y, 1, 3);
        g2d.fillRect(79 + x, 124 + y, 1, 4);
        g2d.fillRect(132 + x, 124 + y, 1, 1);
        g2d.fillRect(102 + x, 125 + y, 1, 4);
        g2d.fillRect(133 + x, 125 + y, 1, 1);
        g2d.fillRect(130 + x, 126 + y, 1, 4);
        g2d.fillRect(134 + x, 126 + y, 1, 1);
        g2d.fillRect(78 + x, 127 + y, 1, 4);
        g2d.fillRect(139 + x, 127 + y, 1, 3);
        g2d.fillRect(77 + x, 130 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(90 + x, 105 + y, 1, 7);
        g2d.fillRect(89 + x, 108 + y, 1, 6);
        g2d.fillRect(91 + x, 108 + y, 1, 20);
        g2d.fillRect(88 + x, 115 + y, 1, 4);
        g2d.fillRect(92 + x, 116 + y, 1, 2);
        g2d.fillRect(93 + x, 116 + y, 1, 7);
        g2d.fillRect(87 + x, 119 + y, 1, 3);
        g2d.fillRect(86 + x, 121 + y, 1, 5);
        g2d.fillRect(96 + x, 123 + y, 1, 6);
        g2d.fillRect(95 + x, 124 + y, 1, 5);
        g2d.fillRect(81 + x, 125 + y, 1, 5);
        g2d.fillRect(82 + x, 125 + y, 1, 4);
        g2d.fillRect(85 + x, 125 + y, 1, 4);
        g2d.fillRect(90 + x, 125 + y, 1, 4);
        g2d.fillRect(80 + x, 127 + y, 1, 4);
        g2d.fillRect(84 + x, 127 + y, 1, 4);
        g2d.fillRect(79 + x, 128 + y, 1, 5);
        g2d.fillRect(102 + x, 130 + y, 1, 5);
        g2d.fillRect(78 + x, 131 + y, 1, 4);
        g2d.fillRect(138 + x, 133 + y, 1, 3);
        g2d.fillRect(139 + x, 133 + y, 1, 3);
        g2d.fillRect(77 + x, 134 + y, 1, 4);
        g2d.fillRect(84 + x, 134 + y, 1, 2);
        g2d.fillRect(76 + x, 135 + y, 1, 4);
        g2d.fillRect(83 + x, 135 + y, 1, 3);
        g2d.fillRect(140 + x, 136 + y, 1, 1);
        g2d.fillRect(75 + x, 138 + y, 1, 3);
        g2d.fillRect(82 + x, 138 + y, 1, 3);
        g2d.fillRect(74 + x, 139 + y, 1, 2);
        g2d.fillRect(81 + x, 139 + y, 1, 2);
        g2d.fillRect(105 + x, 139 + y, 1, 4);
        g2d.fillRect(73 + x, 140 + y, 1, 1);
        g2d.fillRect(106 + x, 142 + y, 1, 1);
        g2d.fillRect(115 + x, 148 + y, 1, 5);
        g2d.fillRect(110 + x, 149 + y, 1, 5);
        g2d.fillRect(111 + x, 151 + y, 1, 3);
        g2d.fillRect(112 + x, 151 + y, 1, 4);
        g2d.fillRect(119 + x, 156 + y, 1, 5);
        g2d.fillRect(121 + x, 163 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 2);
        g2d.fillRect(95 + x, 96 + y, 1, 2);
        g2d.fillRect(94 + x, 100 + y, 1, 4);
        g2d.fillRect(95 + x, 100 + y, 1, 2);
        g2d.fillRect(101 + x, 100 + y, 1, 2);
        g2d.fillRect(91 + x, 102 + y, 1, 4);
        g2d.fillRect(100 + x, 102 + y, 1, 4);
        g2d.fillRect(93 + x, 104 + y, 1, 4);
        g2d.fillRect(99 + x, 104 + y, 1, 6);
        g2d.fillRect(89 + x, 105 + y, 1, 3);
        g2d.fillRect(88 + x, 108 + y, 1, 7);
        g2d.fillRect(92 + x, 108 + y, 1, 2);
        g2d.fillRect(98 + x, 110 + y, 1, 6);
        g2d.fillRect(87 + x, 117 + y, 1, 2);
        g2d.fillRect(131 + x, 119 + y, 1, 2);
        g2d.fillRect(132 + x, 119 + y, 1, 1);
        g2d.fillRect(86 + x, 120 + y, 1, 1);
        g2d.fillRect(133 + x, 120 + y, 1, 1);
        g2d.fillRect(82 + x, 121 + y, 1, 4);
        g2d.fillRect(84 + x, 121 + y, 1, 6);
        g2d.fillRect(85 + x, 121 + y, 1, 4);
        g2d.fillRect(132 + x, 121 + y, 1, 3);
        g2d.fillRect(134 + x, 121 + y, 1, 1);
        g2d.fillRect(130 + x, 122 + y, 1, 4);
        g2d.fillRect(135 + x, 122 + y, 1, 2);
        g2d.fillRect(136 + x, 123 + y, 1, 2);
        g2d.fillRect(131 + x, 124 + y, 1, 1);
        g2d.fillRect(133 + x, 124 + y, 1, 1);
        g2d.fillRect(137 + x, 124 + y, 1, 3);
        g2d.fillRect(83 + x, 125 + y, 1, 2);
        g2d.fillRect(132 + x, 125 + y, 1, 2);
        g2d.fillRect(134 + x, 125 + y, 1, 1);
        g2d.fillRect(138 + x, 125 + y, 1, 4);
        g2d.fillRect(133 + x, 126 + y, 1, 3);
        g2d.fillRect(129 + x, 127 + y, 1, 3);
        g2d.fillRect(131 + x, 127 + y, 1, 8);
        g2d.fillRect(134 + x, 127 + y, 1, 4);
        g2d.fillRect(135 + x, 127 + y, 1, 7);
        g2d.fillRect(136 + x, 129 + y, 1, 6);
        g2d.fillRect(128 + x, 130 + y, 1, 5);
        g2d.fillRect(130 + x, 130 + y, 1, 1);
        g2d.fillRect(137 + x, 130 + y, 1, 8);
        g2d.fillRect(138 + x, 130 + y, 1, 3);
        g2d.fillRect(139 + x, 130 + y, 1, 1);
        g2d.fillRect(77 + x, 132 + y, 1, 2);
        g2d.fillRect(75 + x, 133 + y, 1, 3);
        g2d.fillRect(76 + x, 133 + y, 1, 2);
        g2d.fillRect(74 + x, 134 + y, 1, 2);
        g2d.fillRect(132 + x, 135 + y, 1, 5);
        g2d.fillRect(73 + x, 136 + y, 1, 2);
        g2d.fillRect(138 + x, 136 + y, 1, 1);
        g2d.fillRect(72 + x, 137 + y, 1, 2);
        g2d.fillRect(71 + x, 138 + y, 1, 2);
        g2d.fillRect(70 + x, 140 + y, 1, 1);
        g2d.fillRect(69 + x, 141 + y, 1, 1);
        g2d.fillRect(68 + x, 142 + y, 1, 1);
        g2d.fillRect(67 + x, 143 + y, 1, 1);
        g2d.fillRect(122 + x, 152 + y, 1, 14);
        g2d.fillRect(126 + x, 163 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 83 + y, 1, 2);
        g2d.fillRect(97 + x, 87 + y, 1, 3);
        g2d.fillRect(99 + x, 92 + y, 1, 4);
        g2d.fillRect(98 + x, 94 + y, 1, 2);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(100 + x, 96 + y, 1, 2);
        g2d.fillRect(93 + x, 98 + y, 1, 4);
        g2d.fillRect(96 + x, 98 + y, 1, 2);
        g2d.fillRect(100 + x, 100 + y, 1, 2);
        g2d.fillRect(92 + x, 102 + y, 1, 4);
        g2d.fillRect(95 + x, 102 + y, 1, 2);
        g2d.fillRect(99 + x, 102 + y, 1, 2);
        g2d.fillRect(101 + x, 102 + y, 1, 6);
        g2d.fillRect(94 + x, 104 + y, 1, 2);
        g2d.fillRect(102 + x, 104 + y, 1, 21);
        g2d.fillRect(91 + x, 106 + y, 1, 2);
        g2d.fillRect(103 + x, 106 + y, 1, 6);
        g2d.fillRect(93 + x, 108 + y, 1, 2);
        g2d.fillRect(98 + x, 108 + y, 1, 2);
        g2d.fillRect(92 + x, 110 + y, 1, 6);
        g2d.fillRect(99 + x, 110 + y, 1, 2);
        g2d.fillRect(104 + x, 110 + y, 1, 8);
        g2d.fillRect(105 + x, 112 + y, 1, 23);
        g2d.fillRect(93 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 114 + y, 1, 9);
        g2d.fillRect(94 + x, 116 + y, 1, 1);
        g2d.fillRect(97 + x, 116 + y, 1, 3);
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(95 + x, 117 + y, 2, 1);
        g2d.fillRect(96 + x, 118 + y, 1, 5);
        g2d.fillRect(95 + x, 120 + y, 1, 1);
        g2d.fillRect(101 + x, 120 + y, 1, 6);
        g2d.fillRect(132 + x, 120 + y, 1, 1);
        g2d.fillRect(83 + x, 121 + y, 1, 4);
        g2d.fillRect(109 + x, 121 + y, 1, 11);
        g2d.fillRect(133 + x, 121 + y, 1, 3);
        g2d.fillRect(134 + x, 122 + y, 1, 3);
        g2d.fillRect(97 + x, 123 + y, 1, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 1);
        g2d.fillRect(98 + x, 124 + y, 1, 1);
        g2d.fillRect(113 + x, 124 + y, 1, 5);
        g2d.fillRect(135 + x, 124 + y, 1, 3);
        g2d.fillRect(99 + x, 125 + y, 2, 1);
        g2d.fillRect(103 + x, 125 + y, 1, 8);
        g2d.fillRect(131 + x, 125 + y, 1, 2);
        g2d.fillRect(136 + x, 125 + y, 1, 4);
        g2d.fillRect(112 + x, 126 + y, 1, 7);
        g2d.fillRect(132 + x, 127 + y, 1, 8);
        g2d.fillRect(137 + x, 127 + y, 1, 3);
        g2d.fillRect(114 + x, 128 + y, 1, 2);
        g2d.fillRect(102 + x, 129 + y, 1, 1);
        g2d.fillRect(133 + x, 129 + y, 1, 1);
        g2d.fillRect(138 + x, 129 + y, 1, 1);
        g2d.fillRect(104 + x, 130 + y, 1, 3);
        g2d.fillRect(129 + x, 130 + y, 1, 3);
        g2d.fillRect(130 + x, 131 + y, 1, 3);
        g2d.fillRect(134 + x, 131 + y, 1, 2);
        g2d.fillRect(108 + x, 132 + y, 1, 12);
        g2d.fillRect(113 + x, 132 + y, 1, 19);
        g2d.fillRect(115 + x, 132 + y, 1, 5);
        g2d.fillRect(133 + x, 133 + y, 1, 8);
        g2d.fillRect(106 + x, 134 + y, 1, 8);
        g2d.fillRect(117 + x, 134 + y, 1, 15);
        g2d.fillRect(118 + x, 135 + y, 1, 3);
        g2d.fillRect(128 + x, 135 + y, 2, 1);
        g2d.fillRect(131 + x, 135 + y, 1, 5);
        g2d.fillRect(136 + x, 135 + y, 1, 1);
        g2d.fillRect(74 + x, 136 + y, 1, 3);
        g2d.fillRect(75 + x, 136 + y, 1, 2);
        g2d.fillRect(129 + x, 136 + y, 1, 2);
        g2d.fillRect(130 + x, 136 + y, 1, 2);
        g2d.fillRect(139 + x, 136 + y, 1, 1);
        g2d.fillRect(73 + x, 138 + y, 1, 2);
        g2d.fillRect(127 + x, 138 + y, 1, 14);
        g2d.fillRect(137 + x, 138 + y, 1, 1);
        g2d.fillRect(72 + x, 139 + y, 1, 2);
        g2d.fillRect(134 + x, 139 + y, 1, 2);
        g2d.fillRect(71 + x, 140 + y, 1, 1);
        g2d.fillRect(128 + x, 140 + y, 1, 2);
        g2d.fillRect(132 + x, 140 + y, 1, 2);
        g2d.fillRect(107 + x, 141 + y, 1, 2);
        g2d.fillRect(109 + x, 142 + y, 1, 2);
        g2d.fillRect(129 + x, 142 + y, 1, 2);
        g2d.fillRect(120 + x, 143 + y, 1, 16);
        g2d.fillRect(114 + x, 144 + y, 1, 5);
        g2d.fillRect(126 + x, 144 + y, 1, 6);
        g2d.fillRect(130 + x, 144 + y, 1, 4);
        g2d.fillRect(110 + x, 146 + y, 1, 3);
        g2d.fillRect(116 + x, 147 + y, 1, 5);
        g2d.fillRect(131 + x, 147 + y, 1, 2);
        g2d.fillRect(111 + x, 149 + y, 1, 2);
        g2d.fillRect(112 + x, 149 + y, 1, 2);
        g2d.fillRect(122 + x, 149 + y, 1, 3);
        g2d.fillRect(128 + x, 150 + y, 1, 4);
        g2d.fillRect(117 + x, 152 + y, 2, 1);
        g2d.fillRect(125 + x, 152 + y, 1, 14);
        g2d.fillRect(129 + x, 152 + y, 1, 2);
        g2d.fillRect(119 + x, 153 + y, 1, 3);
        g2d.fillRect(123 + x, 153 + y, 1, 13);
        g2d.fillRect(126 + x, 154 + y, 1, 5);
        g2d.fillRect(127 + x, 157 + y, 1, 5);
        g2d.fillRect(121 + x, 159 + y, 1, 4);
        g2d.fillRect(126 + x, 162 + y, 1, 1);
        g2d.fillRect(127 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(99 + x, 81 + y, 1, 1);
        g2d.fillRect(98 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 4);
        g2d.fillRect(95 + x, 94 + y, 1, 2);
        g2d.fillRect(102 + x, 94 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(103 + x, 96 + y, 1, 4);
        g2d.fillRect(94 + x, 98 + y, 1, 2);
        g2d.fillRect(97 + x, 98 + y, 1, 2);
        g2d.fillRect(99 + x, 98 + y, 1, 4);
        g2d.fillRect(100 + x, 98 + y, 1, 2);
        g2d.fillRect(96 + x, 100 + y, 1, 4);
        g2d.fillRect(104 + x, 100 + y, 1, 2);
        g2d.fillRect(93 + x, 102 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 4);
        g2d.fillRect(95 + x, 104 + y, 1, 2);
        g2d.fillRect(92 + x, 106 + y, 1, 2);
        g2d.fillRect(94 + x, 106 + y, 1, 4);
        g2d.fillRect(98 + x, 106 + y, 1, 2);
        g2d.fillRect(100 + x, 106 + y, 1, 4);
        g2d.fillRect(106 + x, 106 + y, 1, 2);
        g2d.fillRect(101 + x, 108 + y, 1, 12);
        g2d.fillRect(107 + x, 108 + y, 1, 4);
        g2d.fillRect(93 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 112 + y, 1, 4);
        g2d.fillRect(99 + x, 112 + y, 1, 4);
        g2d.fillRect(103 + x, 112 + y, 1, 13);
        g2d.fillRect(108 + x, 112 + y, 1, 4);
        g2d.fillRect(109 + x, 116 + y, 1, 1);
        g2d.fillRect(98 + x, 117 + y, 1, 2);
        g2d.fillRect(107 + x, 117 + y, 1, 3);
        g2d.fillRect(110 + x, 117 + y, 1, 2);
        g2d.fillRect(104 + x, 118 + y, 1, 12);
        g2d.fillRect(97 + x, 119 + y, 1, 2);
        g2d.fillRect(108 + x, 119 + y, 1, 4);
        g2d.fillRect(111 + x, 119 + y, 1, 2);
        g2d.fillRect(100 + x, 121 + y, 1, 4);
        g2d.fillRect(112 + x, 121 + y, 1, 2);
        g2d.fillRect(114 + x, 121 + y, 1, 7);
        g2d.fillRect(106 + x, 123 + y, 1, 11);
        g2d.fillRect(110 + x, 123 + y, 1, 5);
        g2d.fillRect(113 + x, 123 + y, 1, 1);
        g2d.fillRect(115 + x, 124 + y, 1, 8);
        g2d.fillRect(108 + x, 128 + y, 1, 4);
        g2d.fillRect(116 + x, 128 + y, 1, 9);
        g2d.fillRect(113 + x, 129 + y, 1, 3);
        g2d.fillRect(114 + x, 130 + y, 1, 14);
        g2d.fillRect(133 + x, 130 + y, 1, 3);
        g2d.fillRect(109 + x, 132 + y, 1, 10);
        g2d.fillRect(117 + x, 132 + y, 1, 2);
        g2d.fillRect(112 + x, 133 + y, 1, 5);
        g2d.fillRect(129 + x, 133 + y, 1, 2);
        g2d.fillRect(134 + x, 133 + y, 1, 1);
        g2d.fillRect(118 + x, 134 + y, 1, 1);
        g2d.fillRect(130 + x, 134 + y, 1, 2);
        g2d.fillRect(135 + x, 134 + y, 1, 2);
        g2d.fillRect(128 + x, 136 + y, 1, 4);
        g2d.fillRect(134 + x, 136 + y, 1, 3);
        g2d.fillRect(136 + x, 136 + y, 1, 3);
        g2d.fillRect(115 + x, 137 + y, 1, 1);
        g2d.fillRect(107 + x, 138 + y, 1, 3);
        g2d.fillRect(118 + x, 138 + y, 1, 14);
        g2d.fillRect(119 + x, 138 + y, 1, 2);
        g2d.fillRect(130 + x, 138 + y, 1, 2);
        g2d.fillRect(129 + x, 140 + y, 1, 2);
        g2d.fillRect(131 + x, 140 + y, 1, 2);
        g2d.fillRect(128 + x, 142 + y, 1, 3);
        g2d.fillRect(132 + x, 142 + y, 1, 1);
        g2d.fillRect(130 + x, 143 + y, 1, 1);
        g2d.fillRect(129 + x, 144 + y, 1, 3);
        g2d.fillRect(131 + x, 144 + y, 1, 3);
        g2d.fillRect(121 + x, 147 + y, 1, 12);
        g2d.fillRect(128 + x, 148 + y, 1, 2);
        g2d.fillRect(130 + x, 148 + y, 1, 2);
        g2d.fillRect(117 + x, 149 + y, 1, 3);
        g2d.fillRect(131 + x, 149 + y, 1, 4);
        g2d.fillRect(126 + x, 150 + y, 1, 2);
        g2d.fillRect(129 + x, 150 + y, 1, 2);
        g2d.fillRect(127 + x, 152 + y, 1, 2);
        g2d.fillRect(130 + x, 153 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 3);
        g2d.fillRect(126 + x, 159 + y, 1, 3);
        g2d.fillRect(127 + x, 162 + y, 1, 3);
        g2d.fillRect(124 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 4);
        g2d.fillRect(97 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 13);
        g2d.fillRect(122 + x, 84 + y, 1, 3);
        g2d.fillRect(98 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 30);
        g2d.fillRect(123 + x, 86 + y, 1, 3);
        g2d.fillRect(99 + x, 87 + y, 1, 5);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 88 + y, 1, 5);
        g2d.fillRect(121 + x, 89 + y, 1, 2);
        g2d.fillRect(125 + x, 89 + y, 1, 10);
        g2d.fillRect(100 + x, 90 + y, 1, 6);
        g2d.fillRect(121 + x, 93 + y, 1, 2);
        g2d.fillRect(101 + x, 94 + y, 1, 6);
        g2d.fillRect(126 + x, 95 + y, 1, 14);
        g2d.fillRect(102 + x, 96 + y, 1, 8);
        g2d.fillRect(121 + x, 97 + y, 1, 2);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(103 + x, 100 + y, 1, 6);
        g2d.fillRect(121 + x, 101 + y, 1, 2);
        g2d.fillRect(125 + x, 101 + y, 1, 2);
        g2d.fillRect(127 + x, 101 + y, 1, 10);
        g2d.fillRect(104 + x, 102 + y, 1, 8);
        g2d.fillRect(120 + x, 103 + y, 1, 2);
        g2d.fillRect(128 + x, 103 + y, 1, 16);
        g2d.fillRect(125 + x, 105 + y, 1, 2);
        g2d.fillRect(105 + x, 106 + y, 1, 6);
        g2d.fillRect(120 + x, 107 + y, 1, 2);
        g2d.fillRect(106 + x, 108 + y, 1, 6);
        g2d.fillRect(129 + x, 109 + y, 1, 18);
        g2d.fillRect(126 + x, 111 + y, 1, 2);
        g2d.fillRect(130 + x, 111 + y, 1, 11);
        g2d.fillRect(90 + x, 112 + y, 1, 2);
        g2d.fillRect(107 + x, 112 + y, 1, 5);
        g2d.fillRect(127 + x, 113 + y, 1, 2);
        g2d.fillRect(131 + x, 113 + y, 1, 6);
        g2d.fillRect(89 + x, 114 + y, 1, 6);
        g2d.fillRect(108 + x, 116 + y, 1, 3);
        g2d.fillRect(109 + x, 117 + y, 1, 4);
        g2d.fillRect(127 + x, 117 + y, 1, 1);
        g2d.fillRect(92 + x, 118 + y, 1, 6);
        g2d.fillRect(95 + x, 118 + y, 1, 2);
        g2d.fillRect(88 + x, 119 + y, 1, 7);
        g2d.fillRect(110 + x, 119 + y, 1, 4);
        g2d.fillRect(127 + x, 119 + y, 1, 1);
        g2d.fillRect(90 + x, 120 + y, 1, 5);
        g2d.fillRect(128 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 121 + y, 1, 3);
        g2d.fillRect(111 + x, 121 + y, 1, 4);
        g2d.fillRect(127 + x, 121 + y, 1, 1);
        g2d.fillRect(87 + x, 122 + y, 1, 7);
        g2d.fillRect(128 + x, 122 + y, 1, 2);
        g2d.fillRect(93 + x, 123 + y, 1, 3);
        g2d.fillRect(97 + x, 124 + y, 1, 8);
        g2d.fillRect(112 + x, 124 + y, 1, 2);
        g2d.fillRect(127 + x, 124 + y, 1, 1);
        g2d.fillRect(128 + x, 125 + y, 1, 5);
        g2d.fillRect(86 + x, 126 + y, 1, 3);
        g2d.fillRect(99 + x, 126 + y, 1, 7);
        g2d.fillRect(101 + x, 126 + y, 1, 7);
        g2d.fillRect(127 + x, 126 + y, 1, 1);
        g2d.fillRect(83 + x, 127 + y, 1, 8);
        g2d.fillRect(91 + x, 128 + y, 1, 1);
        g2d.fillRect(82 + x, 129 + y, 1, 1);
        g2d.fillRect(127 + x, 129 + y, 1, 1);
        g2d.fillRect(81 + x, 130 + y, 1, 1);
        g2d.fillRect(80 + x, 131 + y, 1, 3);
        g2d.fillRect(82 + x, 131 + y, 1, 7);
        g2d.fillRect(84 + x, 131 + y, 1, 3);
        g2d.fillRect(127 + x, 131 + y, 1, 2);
        g2d.fillRect(79 + x, 133 + y, 1, 3);
        g2d.fillRect(81 + x, 134 + y, 1, 5);
        g2d.fillRect(127 + x, 134 + y, 1, 4);
        g2d.fillRect(78 + x, 135 + y, 1, 5);
        g2d.fillRect(102 + x, 135 + y, 1, 4);
        g2d.fillRect(105 + x, 135 + y, 1, 4);
        g2d.fillRect(80 + x, 136 + y, 1, 5);
        g2d.fillRect(77 + x, 138 + y, 1, 3);
        g2d.fillRect(126 + x, 138 + y, 1, 6);
        g2d.fillRect(76 + x, 139 + y, 1, 2);
        g2d.fillRect(79 + x, 139 + y, 1, 2);
        g2d.fillRect(120 + x, 140 + y, 1, 3);
        g2d.fillRect(125 + x, 143 + y, 1, 9);
        g2d.fillRect(109 + x, 144 + y, 1, 6);
        g2d.fillRect(121 + x, 145 + y, 1, 2);
        g2d.fillRect(122 + x, 148 + y, 1, 1);
        g2d.fillRect(114 + x, 149 + y, 1, 4);
        g2d.fillRect(123 + x, 150 + y, 1, 3);
        g2d.fillRect(124 + x, 150 + y, 1, 8);
        g2d.fillRect(113 + x, 151 + y, 1, 4);
        g2d.fillRect(116 + x, 152 + y, 1, 3);
        g2d.fillRect(115 + x, 153 + y, 1, 5);
        g2d.fillRect(118 + x, 153 + y, 1, 8);
        g2d.fillRect(120 + x, 159 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 80 + y, 1, 3);
        g2d.fillRect(98 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 3);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 2);
        g2d.fillRect(99 + x, 96 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(98 + x, 98 + y, 1, 8);
        g2d.fillRect(104 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 98 + y, 1, 8);
        g2d.fillRect(97 + x, 100 + y, 1, 12);
        g2d.fillRect(105 + x, 100 + y, 1, 2);
        g2d.fillRect(107 + x, 100 + y, 1, 8);
        g2d.fillRect(96 + x, 104 + y, 1, 2);
        g2d.fillRect(108 + x, 104 + y, 1, 8);
        g2d.fillRect(95 + x, 106 + y, 1, 4);
        g2d.fillRect(109 + x, 108 + y, 1, 8);
        g2d.fillRect(94 + x, 110 + y, 1, 6);
        g2d.fillRect(96 + x, 110 + y, 1, 7);
        g2d.fillRect(100 + x, 110 + y, 1, 11);
        g2d.fillRect(110 + x, 110 + y, 1, 7);
        g2d.fillRect(93 + x, 112 + y, 1, 2);
        g2d.fillRect(95 + x, 114 + y, 1, 3);
        g2d.fillRect(111 + x, 114 + y, 1, 5);
        g2d.fillRect(99 + x, 116 + y, 1, 3);
        g2d.fillRect(112 + x, 117 + y, 1, 4);
        g2d.fillRect(98 + x, 119 + y, 1, 5);
        g2d.fillRect(113 + x, 119 + y, 1, 4);
        g2d.fillRect(99 + x, 120 + y, 1, 5);
        g2d.fillRect(107 + x, 120 + y, 1, 3);
        g2d.fillRect(114 + x, 120 + y, 1, 1);
        g2d.fillRect(97 + x, 121 + y, 1, 2);
        g2d.fillRect(115 + x, 121 + y, 1, 3);
        g2d.fillRect(108 + x, 123 + y, 1, 5);
        g2d.fillRect(116 + x, 124 + y, 1, 4);
        g2d.fillRect(111 + x, 125 + y, 1, 5);
        g2d.fillRect(110 + x, 128 + y, 1, 18);
        g2d.fillRect(117 + x, 128 + y, 1, 4);
        g2d.fillRect(118 + x, 131 + y, 1, 3);
        g2d.fillRect(107 + x, 133 + y, 1, 5);
        g2d.fillRect(134 + x, 134 + y, 1, 1);
        g2d.fillRect(135 + x, 136 + y, 1, 2);
        g2d.fillRect(116 + x, 137 + y, 1, 1);
        g2d.fillRect(112 + x, 138 + y, 1, 11);
        g2d.fillRect(115 + x, 138 + y, 1, 10);
        g2d.fillRect(129 + x, 138 + y, 1, 2);
        g2d.fillRect(119 + x, 140 + y, 1, 7);
        g2d.fillRect(130 + x, 140 + y, 1, 3);
        g2d.fillRect(131 + x, 143 + y, 1, 1);
        g2d.fillRect(116 + x, 144 + y, 1, 3);
        g2d.fillRect(128 + x, 145 + y, 1, 3);
        g2d.fillRect(132 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 147 + y, 1, 2);
        g2d.fillRect(129 + x, 147 + y, 1, 3);
        g2d.fillRect(119 + x, 150 + y, 1, 3);
        g2d.fillRect(130 + x, 150 + y, 1, 3);
        g2d.fillRect(126 + x, 152 + y, 1, 2);
        g2d.fillRect(131 + x, 153 + y, 1, 1);
        g2d.fillRect(127 + x, 154 + y, 1, 3);
        g2d.fillRect(124 + x, 161 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 82 + y, 2, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 4);
        g2d.fillRect(116 + x, 83 + y, 1, 5);
        g2d.fillRect(117 + x, 83 + y, 1, 3);
        g2d.fillRect(118 + x, 83 + y, 1, 28);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 6);
        g2d.fillRect(105 + x, 86 + y, 1, 4);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 8);
        g2d.fillRect(106 + x, 88 + y, 1, 6);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(123 + x, 89 + y, 1, 16);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(121 + x, 91 + y, 1, 2);
        g2d.fillRect(124 + x, 93 + y, 1, 24);
        g2d.fillRect(107 + x, 94 + y, 1, 4);
        g2d.fillRect(121 + x, 95 + y, 1, 2);
        g2d.fillRect(108 + x, 96 + y, 1, 4);
        g2d.fillRect(120 + x, 97 + y, 1, 2);
        g2d.fillRect(121 + x, 99 + y, 1, 2);
        g2d.fillRect(125 + x, 99 + y, 1, 2);
        g2d.fillRect(109 + x, 100 + y, 1, 4);
        g2d.fillRect(120 + x, 101 + y, 1, 2);
        g2d.fillRect(121 + x, 103 + y, 1, 15);
        g2d.fillRect(125 + x, 103 + y, 1, 2);
        g2d.fillRect(110 + x, 104 + y, 1, 4);
        g2d.fillRect(120 + x, 105 + y, 1, 2);
        g2d.fillRect(125 + x, 107 + y, 1, 36);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 13);
        g2d.fillRect(120 + x, 109 + y, 1, 15);
        g2d.fillRect(126 + x, 109 + y, 1, 2);
        g2d.fillRect(112 + x, 110 + y, 1, 4);
        g2d.fillRect(127 + x, 111 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 5);
        g2d.fillRect(126 + x, 113 + y, 1, 25);
        g2d.fillRect(90 + x, 114 + y, 1, 6);
        g2d.fillRect(114 + x, 114 + y, 1, 5);
        g2d.fillRect(119 + x, 115 + y, 1, 5);
        g2d.fillRect(127 + x, 115 + y, 1, 2);
        g2d.fillRect(94 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 117 + y, 1, 7);
        g2d.fillRect(127 + x, 118 + y, 1, 1);
        g2d.fillRect(128 + x, 119 + y, 1, 1);
        g2d.fillRect(89 + x, 120 + y, 1, 9);
        g2d.fillRect(127 + x, 120 + y, 1, 1);
        g2d.fillRect(117 + x, 121 + y, 1, 7);
        g2d.fillRect(128 + x, 121 + y, 1, 1);
        g2d.fillRect(127 + x, 122 + y, 1, 2);
        g2d.fillRect(92 + x, 124 + y, 1, 5);
        g2d.fillRect(128 + x, 124 + y, 1, 1);
        g2d.fillRect(98 + x, 125 + y, 1, 3);
        g2d.fillRect(127 + x, 125 + y, 1, 1);
        g2d.fillRect(88 + x, 126 + y, 1, 3);
        g2d.fillRect(93 + x, 126 + y, 1, 3);
        g2d.fillRect(100 + x, 126 + y, 1, 6);
        g2d.fillRect(118 + x, 127 + y, 1, 4);
        g2d.fillRect(122 + x, 127 + y, 1, 21);
        g2d.fillRect(127 + x, 127 + y, 1, 2);
        g2d.fillRect(82 + x, 130 + y, 1, 1);
        g2d.fillRect(127 + x, 130 + y, 1, 1);
        g2d.fillRect(81 + x, 131 + y, 1, 3);
        g2d.fillRect(103 + x, 133 + y, 1, 6);
        g2d.fillRect(104 + x, 133 + y, 1, 1);
        g2d.fillRect(119 + x, 133 + y, 1, 5);
        g2d.fillRect(127 + x, 133 + y, 1, 1);
        g2d.fillRect(80 + x, 134 + y, 1, 2);
        g2d.fillRect(79 + x, 136 + y, 1, 3);
        g2d.fillRect(120 + x, 136 + y, 1, 4);
        g2d.fillRect(121 + x, 138 + y, 1, 7);
        g2d.fillRect(124 + x, 138 + y, 1, 12);
        g2d.fillRect(78 + x, 140 + y, 1, 1);
        g2d.fillRect(104 + x, 142 + y, 1, 1);
        g2d.fillRect(123 + x, 148 + y, 1, 2);
        g2d.fillRect(114 + x, 153 + y, 1, 2);
        g2d.fillRect(117 + x, 153 + y, 1, 2);
        g2d.fillRect(116 + x, 155 + y, 1, 5);
        g2d.fillRect(115 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 83 + y, 1, 3);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 3, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 4, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 6);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(113 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 18);
        g2d.fillRect(107 + x, 87 + y, 1, 7);
        g2d.fillRect(112 + x, 87 + y, 1, 3);
        g2d.fillRect(108 + x, 88 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 4);
        g2d.fillRect(113 + x, 90 + y, 1, 12);
        g2d.fillRect(115 + x, 90 + y, 1, 18);
        g2d.fillRect(108 + x, 92 + y, 1, 4);
        g2d.fillRect(112 + x, 92 + y, 1, 4);
        g2d.fillRect(114 + x, 92 + y, 1, 22);
        g2d.fillRect(109 + x, 94 + y, 1, 6);
        g2d.fillRect(122 + x, 95 + y, 1, 8);
        g2d.fillRect(110 + x, 98 + y, 1, 6);
        g2d.fillRect(111 + x, 100 + y, 1, 8);
        g2d.fillRect(112 + x, 104 + y, 1, 6);
        g2d.fillRect(123 + x, 105 + y, 1, 4);
        g2d.fillRect(113 + x, 108 + y, 1, 4);
        g2d.fillRect(116 + x, 110 + y, 1, 7);
        g2d.fillRect(118 + x, 111 + y, 1, 6);
        g2d.fillRect(124 + x, 117 + y, 1, 17);
        g2d.fillRect(94 + x, 118 + y, 1, 11);
        g2d.fillRect(117 + x, 118 + y, 1, 3);
        g2d.fillRect(121 + x, 118 + y, 1, 3);
        g2d.fillRect(119 + x, 120 + y, 1, 2);
        g2d.fillRect(118 + x, 124 + y, 1, 3);
        g2d.fillRect(120 + x, 124 + y, 1, 3);
        g2d.fillRect(122 + x, 125 + y, 1, 2);
        g2d.fillRect(98 + x, 128 + y, 1, 5);
        g2d.fillRect(119 + x, 129 + y, 1, 4);
        g2d.fillRect(100 + x, 132 + y, 1, 1);
        g2d.fillRect(120 + x, 133 + y, 1, 3);
        g2d.fillRect(104 + x, 134 + y, 1, 3);
        g2d.fillRect(123 + x, 134 + y, 1, 14);
        g2d.fillRect(121 + x, 136 + y, 1, 2);
        g2d.fillRect(124 + x, 136 + y, 1, 2);
        g2d.fillRect(103 + x, 139 + y, 1, 2);
        g2d.fillRect(104 + x, 141 + y, 1, 1);
        g2d.fillRect(108 + x, 144 + y, 1, 3);
        g2d.fillRect(117 + x, 155 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 83 + y, 4, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 4);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 5, 1);
        g2d.fillRect(107 + x, 86 + y, 4, 1);
        g2d.fillRect(108 + x, 87 + y, 3, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 4);
        g2d.fillRect(110 + x, 90 + y, 1, 8);
        g2d.fillRect(111 + x, 90 + y, 1, 10);
        g2d.fillRect(112 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 18);
        g2d.fillRect(112 + x, 96 + y, 1, 8);
        g2d.fillRect(113 + x, 102 + y, 1, 6);
        g2d.fillRect(122 + x, 103 + y, 1, 22);
        g2d.fillRect(117 + x, 104 + y, 1, 14);
        g2d.fillRect(123 + x, 109 + y, 1, 25);
        g2d.fillRect(118 + x, 117 + y, 1, 7);
        g2d.fillRect(121 + x, 121 + y, 1, 15);
        g2d.fillRect(119 + x, 122 + y, 1, 7);
        g2d.fillRect(120 + x, 127 + y, 1, 6);
        g2d.fillRect(124 + x, 134 + y, 1, 2);
        g2d.fillRect(104 + x, 137 + y, 1, 4);
        g2d.fillRect(108 + x, 147 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 2, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 6);
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 87 + y, 1, 3);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(105 + x, 90 + y, 1, 6);
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 4);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(107 + x, 98 + y, 1, 2);
        g2d.fillRect(108 + x, 100 + y, 1, 4);
        g2d.fillRect(109 + x, 104 + y, 1, 4);
        g2d.fillRect(96 + x, 106 + y, 1, 4);
        g2d.fillRect(110 + x, 108 + y, 1, 2);
        g2d.fillRect(95 + x, 110 + y, 1, 4);
        g2d.fillRect(111 + x, 110 + y, 1, 4);
        g2d.fillRect(112 + x, 114 + y, 1, 3);
        g2d.fillRect(113 + x, 117 + y, 1, 2);
        g2d.fillRect(99 + x, 119 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(107 + x, 123 + y, 1, 10);
        g2d.fillRect(111 + x, 130 + y, 1, 17);
        g2d.fillRect(134 + x, 135 + y, 1, 1);
        g2d.fillRect(116 + x, 138 + y, 1, 6);
        g2d.fillRect(135 + x, 138 + y, 1, 1);
        g2d.fillRect(131 + x, 142 + y, 1, 1);
        g2d.fillRect(132 + x, 143 + y, 1, 2);
        g2d.fillRect(119 + x, 147 + y, 1, 3);
    }
}
