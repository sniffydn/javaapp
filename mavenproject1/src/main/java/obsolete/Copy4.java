/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.*;
import draw.Panel;
import util.Color;
import util.DFactory;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import clts.t.u.a.T0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Copy4 extends SuperTL
{
    int y = -50;
    int alpha = 0;
    int count = 0;
    int increment = 0;
    int length = 0;

    public Copy4()
    {
        super();
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public Copy4(ColorArray colorSwitch)
    {
        super(colorSwitch);
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;

        count++;
        if(count > DFactory.ARRAY_SIZE)
        {
            count = 0;
            alpha = 0;
            y = -50;
        }

        if(count > (length - 3))
        {
            if((count - (length - 3)) < (length / 2))
            {
                alpha += increment;
                if(alpha > 255)
                    alpha = 255;
            }
            else
            {
                alpha -= increment;
                if(alpha < 0)
                    alpha = 0;
            }

            if(alpha != 255)
                y-=4;
        }

        COLORS.setAlpha(alpha);
    }


    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintND(offsetX + 25 + shiftX, y + 125 + shiftY,g2d);
    }

    public void paintND(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(99 + x, 5 + y, 3, 1);
        g2d.fillRect(142 + x, 5 + y, 2, 1);
        g2d.fillRect(70 + x, 7 + y, 1, 1);
        g2d.fillRect(13 + x, 8 + y, 1, 5);
        g2d.fillRect(22 + x, 8 + y, 1, 2);
        g2d.fillRect(59 + x, 8 + y, 1, 1);
        g2d.fillRect(96 + x, 8 + y, 1, 4);
        g2d.fillRect(121 + x, 8 + y, 1, 1);
        g2d.fillRect(139 + x, 8 + y, 1, 1);
        g2d.fillRect(14 + x, 9 + y, 1, 11);
        g2d.fillRect(21 + x, 9 + y, 1, 5);
        g2d.fillRect(116 + x, 9 + y, 1, 2);
        g2d.fillRect(122 + x, 9 + y, 1, 1);
        g2d.fillRect(160 + x, 9 + y, 1, 1);
        g2d.fillRect(60 + x, 10 + y, 1, 3);
        g2d.fillRect(89 + x, 10 + y, 1, 2);
        g2d.fillRect(123 + x, 10 + y, 1, 7);
        g2d.fillRect(138 + x, 10 + y, 1, 4);
        g2d.fillRect(159 + x, 10 + y, 1, 4);
        g2d.fillRect(85 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 11 + y, 1, 5);
        g2d.fillRect(28 + x, 12 + y, 1, 4);
        g2d.fillRect(37 + x, 12 + y, 1, 1);
        g2d.fillRect(75 + x, 12 + y, 1, 6);
        g2d.fillRect(81 + x, 12 + y, 1, 3);
        g2d.fillRect(88 + x, 12 + y, 1, 4);
        g2d.fillRect(95 + x, 12 + y, 1, 4);
        g2d.fillRect(100 + x, 12 + y, 1, 3);
        g2d.fillRect(124 + x, 12 + y, 1, 2);
        g2d.fillRect(132 + x, 12 + y, 1, 3);
        g2d.fillRect(143 + x, 12 + y, 1, 2);
        g2d.fillRect(152 + x, 12 + y, 1, 1);
        g2d.fillRect(170 + x, 12 + y, 1, 3);
        g2d.fillRect(41 + x, 13 + y, 1, 3);
        g2d.fillRect(61 + x, 13 + y, 1, 3);
        g2d.fillRect(153 + x, 13 + y, 1, 4);
        g2d.fillRect(20 + x, 14 + y, 1, 4);
        g2d.fillRect(76 + x, 14 + y, 1, 2);
        g2d.fillRect(137 + x, 14 + y, 1, 4);
        g2d.fillRect(158 + x, 14 + y, 1, 3);
        g2d.fillRect(34 + x, 15 + y, 1, 1);
        g2d.fillRect(80 + x, 15 + y, 1, 3);
        g2d.fillRect(114 + x, 15 + y, 1, 4);
        g2d.fillRect(147 + x, 15 + y, 1, 5);
        g2d.fillRect(27 + x, 16 + y, 1, 5);
        g2d.fillRect(35 + x, 16 + y, 1, 4);
        g2d.fillRect(42 + x, 16 + y, 1, 1);
        g2d.fillRect(62 + x, 16 + y, 1, 2);
        g2d.fillRect(69 + x, 16 + y, 1, 4);
        g2d.fillRect(87 + x, 16 + y, 1, 5);
        g2d.fillRect(99 + x, 16 + y, 1, 5);
        g2d.fillRect(126 + x, 16 + y, 1, 5);
        g2d.fillRect(131 + x, 16 + y, 1, 5);
        g2d.fillRect(164 + x, 16 + y, 1, 5);
        g2d.fillRect(169 + x, 16 + y, 1, 5);
        g2d.fillRect(15 + x, 17 + y, 1, 1);
        g2d.fillRect(43 + x, 17 + y, 1, 2);
        g2d.fillRect(94 + x, 17 + y, 1, 3);
        g2d.fillRect(122 + x, 17 + y, 1, 1);
        g2d.fillRect(146 + x, 17 + y, 1, 2);
        g2d.fillRect(19 + x, 18 + y, 1, 3);
        g2d.fillRect(31 + x, 18 + y, 1, 2);
        g2d.fillRect(63 + x, 18 + y, 1, 2);
        g2d.fillRect(140 + x, 18 + y, 1, 1);
        g2d.fillRect(152 + x, 18 + y, 1, 1);
        g2d.fillRect(157 + x, 18 + y, 1, 3);
        g2d.fillRect(79 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(136 + x, 19 + y, 1, 2);
        g2d.fillRect(141 + x, 19 + y, 1, 2);
        g2d.fillRect(5 + x, 20 + y, 1, 1);
        g2d.fillRect(34 + x, 20 + y, 1, 1);
        g2d.fillRect(39 + x, 20 + y, 1, 1);
        g2d.fillRect(70 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(127 + x, 20 + y, 1, 1);
        g2d.fillRect(148 + x, 20 + y, 1, 1);
        g2d.fillRect(158 + x, 20 + y, 1, 1);
        g2d.fillRect(165 + x, 20 + y, 1, 1);
        g2d.fillRect(142 + x, 22 + y, 1, 1);
        g2d.fillRect(148 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(141 + x, 5 + y, 1, 1);
        g2d.fillRect(30 + x, 6 + y, 1, 2);
        g2d.fillRect(119 + x, 7 + y, 1, 1);
        g2d.fillRect(139 + x, 7 + y, 1, 1);
        g2d.fillRect(59 + x, 9 + y, 1, 1);
        g2d.fillRect(89 + x, 9 + y, 1, 1);
        g2d.fillRect(139 + x, 9 + y, 1, 1);
        g2d.fillRect(20 + x, 10 + y, 1, 1);
        g2d.fillRect(19 + x, 11 + y, 1, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(133 + x, 11 + y, 1, 1);
        g2d.fillRect(171 + x, 11 + y, 1, 1);
        g2d.fillRect(6 + x, 12 + y, 1, 2);
        g2d.fillRect(41 + x, 12 + y, 1, 1);
        g2d.fillRect(44 + x, 12 + y, 1, 1);
        g2d.fillRect(153 + x, 12 + y, 1, 1);
        g2d.fillRect(33 + x, 13 + y, 1, 2);
        g2d.fillRect(148 + x, 13 + y, 1, 1);
        g2d.fillRect(17 + x, 14 + y, 1, 1);
        g2d.fillRect(70 + x, 14 + y, 1, 1);
        g2d.fillRect(142 + x, 14 + y, 1, 1);
        g2d.fillRect(147 + x, 14 + y, 1, 1);
        g2d.fillRect(69 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(132 + x, 15 + y, 1, 1);
        g2d.fillRect(170 + x, 15 + y, 1, 1);
        g2d.fillRect(34 + x, 16 + y, 1, 1);
        g2d.fillRect(94 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(62 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(136 + x, 18 + y, 1, 1);
        g2d.fillRect(38 + x, 19 + y, 1, 1);
        g2d.fillRect(70 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(32 + x, 20 + y, 1, 1);
        g2d.fillRect(63 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(147 + x, 20 + y, 1, 1);
        g2d.fillRect(51 + x, 21 + y, 1, 1);
        g2d.fillRect(143 + x, 23 + y, 1, 1);
        g2d.fillRect(144 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(140 + x, 6 + y, 1, 1);
        g2d.fillRect(59 + x, 7 + y, 1, 1);
        g2d.fillRect(97 + x, 7 + y, 1, 1);
        g2d.fillRect(66 + x, 9 + y, 1, 1);
        g2d.fillRect(115 + x, 9 + y, 1, 1);
        g2d.fillRect(22 + x, 10 + y, 1, 1);
        g2d.fillRect(29 + x, 12 + y, 1, 1);
        g2d.fillRect(34 + x, 12 + y, 1, 1);
        g2d.fillRect(65 + x, 12 + y, 1, 1);
        g2d.fillRect(89 + x, 12 + y, 1, 1);
        g2d.fillRect(76 + x, 13 + y, 1, 1);
        g2d.fillRect(80 + x, 14 + y, 1, 1);
        g2d.fillRect(124 + x, 14 + y, 1, 1);
        g2d.fillRect(127 + x, 14 + y, 1, 1);
        g2d.fillRect(165 + x, 14 + y, 1, 1);
        g2d.fillRect(42 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(16 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(42 + x, 17 + y, 1, 1);
        g2d.fillRect(140 + x, 17 + y, 1, 1);
        g2d.fillRect(153 + x, 17 + y, 1, 1);
        g2d.fillRect(158 + x, 17 + y, 1, 1);
        g2d.fillRect(56 + x, 18 + y, 1, 1);
        g2d.fillRect(79 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(137 + x, 18 + y, 1, 1);
        g2d.fillRect(43 + x, 19 + y, 1, 1);
        g2d.fillRect(41 + x, 20 + y, 2, 1);
        g2d.fillRect(71 + x, 20 + y, 1, 1);
        g2d.fillRect(88 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 20 + y, 2, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(142 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(97 + x, 6 + y, 1, 1);
        g2d.fillRect(23 + x, 7 + y, 1, 1);
        g2d.fillRect(68 + x, 7 + y, 2, 1);
        g2d.fillRect(118 + x, 7 + y, 1, 1);
        g2d.fillRect(60 + x, 9 + y, 1, 1);
        g2d.fillRect(123 + x, 9 + y, 1, 1);
        g2d.fillRect(138 + x, 9 + y, 1, 1);
        g2d.fillRect(58 + x, 10 + y, 1, 1);
        g2d.fillRect(84 + x, 11 + y, 1, 1);
        g2d.fillRect(88 + x, 11 + y, 1, 1);
        g2d.fillRect(95 + x, 11 + y, 1, 1);
        g2d.fillRect(124 + x, 11 + y, 1, 1);
        g2d.fillRect(27 + x, 12 + y, 1, 1);
        g2d.fillRect(71 + x, 12 + y, 1, 1);
        g2d.fillRect(74 + x, 12 + y, 1, 1);
        g2d.fillRect(83 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(129 + x, 12 + y, 1, 1);
        g2d.fillRect(149 + x, 12 + y, 1, 1);
        g2d.fillRect(158 + x, 12 + y, 1, 2);
        g2d.fillRect(167 + x, 12 + y, 1, 1);
        g2d.fillRect(18 + x, 13 + y, 1, 1);
        g2d.fillRect(20 + x, 13 + y, 1, 1);
        g2d.fillRect(70 + x, 13 + y, 1, 1);
        g2d.fillRect(152 + x, 13 + y, 1, 1);
        g2d.fillRect(21 + x, 14 + y, 1, 1);
        g2d.fillRect(57 + x, 14 + y, 1, 1);
        g2d.fillRect(138 + x, 14 + y, 1, 2);
        g2d.fillRect(62 + x, 15 + y, 1, 1);
        g2d.fillRect(87 + x, 15 + y, 1, 1);
        g2d.fillRect(28 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(146 + x, 16 + y, 1, 1);
        g2d.fillRect(19 + x, 17 + y, 1, 1);
        g2d.fillRect(152 + x, 17 + y, 1, 1);
        g2d.fillRect(157 + x, 17 + y, 1, 1);
        g2d.fillRect(38 + x, 18 + y, 1, 1);
        g2d.fillRect(80 + x, 18 + y, 1, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);
        g2d.fillRect(130 + x, 18 + y, 1, 1);
        g2d.fillRect(168 + x, 18 + y, 1, 1);
        g2d.fillRect(39 + x, 19 + y, 1, 1);
        g2d.fillRect(74 + x, 19 + y, 1, 1);
        g2d.fillRect(146 + x, 19 + y, 1, 1);
        g2d.fillRect(151 + x, 19 + y, 1, 1);
        g2d.fillRect(160 + x, 19 + y, 1, 1);
        g2d.fillRect(6 + x, 20 + y, 2, 1);
        g2d.fillRect(20 + x, 20 + y, 1, 1);
        g2d.fillRect(31 + x, 20 + y, 1, 1);
        g2d.fillRect(40 + x, 20 + y, 1, 1);
        g2d.fillRect(55 + x, 20 + y, 1, 1);
        g2d.fillRect(72 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(150 + x, 20 + y, 1, 1);
        g2d.fillRect(52 + x, 21 + y, 1, 1);
        g2d.fillRect(147 + x, 24 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(12 + x, 7 + y, 2, 1);
        g2d.fillRect(58 + x, 7 + y, 1, 1);
        g2d.fillRect(115 + x, 7 + y, 1, 1);
        g2d.fillRect(117 + x, 7 + y, 1, 1);
        g2d.fillRect(14 + x, 8 + y, 1, 1);
        g2d.fillRect(122 + x, 8 + y, 1, 1);
        g2d.fillRect(7 + x, 9 + y, 1, 1);
        g2d.fillRect(53 + x, 9 + y, 1, 1);
        g2d.fillRect(6 + x, 10 + y, 1, 2);
        g2d.fillRect(115 + x, 10 + y, 1, 1);
        g2d.fillRect(160 + x, 10 + y, 1, 1);
        g2d.fillRect(36 + x, 11 + y, 1, 1);
        g2d.fillRect(43 + x, 11 + y, 1, 1);
        g2d.fillRect(58 + x, 11 + y, 1, 1);
        g2d.fillRect(74 + x, 11 + y, 1, 1);
        g2d.fillRect(131 + x, 11 + y, 2, 1);
        g2d.fillRect(142 + x, 11 + y, 1, 2);
        g2d.fillRect(151 + x, 11 + y, 1, 1);
        g2d.fillRect(169 + x, 11 + y, 2, 1);
        g2d.fillRect(18 + x, 12 + y, 1, 1);
        g2d.fillRect(52 + x, 12 + y, 1, 1);
        g2d.fillRect(80 + x, 12 + y, 1, 1);
        g2d.fillRect(84 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(133 + x, 12 + y, 1, 1);
        g2d.fillRect(171 + x, 12 + y, 1, 1);
        g2d.fillRect(13 + x, 13 + y, 1, 3);
        g2d.fillRect(53 + x, 13 + y, 1, 1);
        g2d.fillRect(137 + x, 13 + y, 1, 1);
        g2d.fillRect(34 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(159 + x, 14 + y, 1, 1);
        g2d.fillRect(27 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(126 + x, 15 + y, 1, 1);
        g2d.fillRect(131 + x, 15 + y, 1, 1);
        g2d.fillRect(164 + x, 15 + y, 1, 1);
        g2d.fillRect(169 + x, 15 + y, 1, 1);
        g2d.fillRect(64 + x, 16 + y, 1, 1);
        g2d.fillRect(132 + x, 16 + y, 1, 1);
        g2d.fillRect(170 + x, 16 + y, 1, 1);
        g2d.fillRect(20 + x, 18 + y, 1, 1);
        g2d.fillRect(36 + x, 18 + y, 1, 1);
        g2d.fillRect(75 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(125 + x, 18 + y, 1, 2);
        g2d.fillRect(163 + x, 18 + y, 1, 2);
        g2d.fillRect(42 + x, 19 + y, 1, 1);
        g2d.fillRect(86 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(18 + x, 20 + y, 1, 1);
        g2d.fillRect(28 + x, 20 + y, 1, 1);
        g2d.fillRect(33 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 2, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(130 + x, 20 + y, 1, 1);
        g2d.fillRect(149 + x, 20 + y, 1, 1);
        g2d.fillRect(168 + x, 20 + y, 1, 1);
        g2d.fillRect(5 + x, 21 + y, 1, 1);
        g2d.fillRect(54 + x, 21 + y, 1, 1);
        g2d.fillRect(141 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 5 + y, 1, 1);
        g2d.fillRect(144 + x, 5 + y, 1, 1);
        g2d.fillRect(11 + x, 7 + y, 1, 1);
        g2d.fillRect(116 + x, 7 + y, 1, 1);
        g2d.fillRect(120 + x, 7 + y, 1, 1);
        g2d.fillRect(8 + x, 8 + y, 1, 1);
        g2d.fillRect(54 + x, 8 + y, 1, 1);
        g2d.fillRect(113 + x, 8 + y, 1, 1);
        g2d.fillRect(58 + x, 9 + y, 1, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 1);
        g2d.fillRect(139 + x, 10 + y, 1, 1);
        g2d.fillRect(29 + x, 11 + y, 1, 1);
        g2d.fillRect(35 + x, 11 + y, 1, 1);
        g2d.fillRect(52 + x, 11 + y, 1, 1);
        g2d.fillRect(73 + x, 11 + y, 1, 1);
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(152 + x, 11 + y, 1, 1);
        g2d.fillRect(36 + x, 12 + y, 1, 1);
        g2d.fillRect(45 + x, 12 + y, 1, 1);
        g2d.fillRect(61 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(60 + x, 13 + y, 1, 1);
        g2d.fillRect(82 + x, 13 + y, 1, 1);
        g2d.fillRect(128 + x, 13 + y, 1, 1);
        g2d.fillRect(166 + x, 13 + y, 1, 1);
        g2d.fillRect(57 + x, 15 + y, 1, 1);
        g2d.fillRect(70 + x, 15 + y, 1, 1);
        g2d.fillRect(81 + x, 15 + y, 1, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 1);
        g2d.fillRect(43 + x, 16 + y, 1, 1);
        g2d.fillRect(61 + x, 16 + y, 1, 1);
        g2d.fillRect(76 + x, 16 + y, 1, 1);
        g2d.fillRect(88 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(139 + x, 16 + y, 1, 1);
        g2d.fillRect(10 + x, 17 + y, 1, 1);
        g2d.fillRect(56 + x, 17 + y, 1, 1);
        g2d.fillRect(63 + x, 17 + y, 1, 1);
        g2d.fillRect(123 + x, 17 + y, 1, 1);
        g2d.fillRect(136 + x, 17 + y, 1, 1);
        g2d.fillRect(15 + x, 18 + y, 1, 1);
        g2d.fillRect(39 + x, 18 + y, 1, 1);
        g2d.fillRect(74 + x, 18 + y, 1, 1);
        g2d.fillRect(26 + x, 19 + y, 1, 2);
        g2d.fillRect(129 + x, 19 + y, 1, 1);
        g2d.fillRect(158 + x, 19 + y, 1, 1);
        g2d.fillRect(167 + x, 19 + y, 1, 1);
        g2d.fillRect(8 + x, 20 + y, 1, 1);
        g2d.fillRect(86 + x, 20 + y, 1, 1);
        g2d.fillRect(6 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(67 + x, 7 + y, 1, 1);
        g2d.fillRect(96 + x, 7 + y, 1, 1);
        g2d.fillRect(21 + x, 8 + y, 1, 1);
        g2d.fillRect(55 + x, 8 + y, 1, 1);
        g2d.fillRect(97 + x, 8 + y, 1, 1);
        g2d.fillRect(20 + x, 9 + y, 1, 1);
        g2d.fillRect(159 + x, 9 + y, 1, 1);
        g2d.fillRect(59 + x, 10 + y, 1, 1);
        g2d.fillRect(122 + x, 10 + y, 1, 1);
        g2d.fillRect(22 + x, 11 + y, 1, 1);
        g2d.fillRect(28 + x, 11 + y, 1, 1);
        g2d.fillRect(44 + x, 11 + y, 1, 1);
        g2d.fillRect(65 + x, 11 + y, 1, 1);
        g2d.fillRect(81 + x, 11 + y, 1, 1);
        g2d.fillRect(160 + x, 11 + y, 1, 2);
        g2d.fillRect(7 + x, 13 + y, 1, 1);
        g2d.fillRect(29 + x, 13 + y, 1, 1);
        g2d.fillRect(52 + x, 13 + y, 1, 1);
        g2d.fillRect(65 + x, 13 + y, 1, 1);
        g2d.fillRect(78 + x, 13 + y, 1, 1);
        g2d.fillRect(80 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(16 + x, 15 + y, 1, 1);
        g2d.fillRect(33 + x, 15 + y, 1, 1);
        g2d.fillRect(64 + x, 15 + y, 1, 1);
        g2d.fillRect(124 + x, 15 + y, 1, 1);
        g2d.fillRect(141 + x, 15 + y, 1, 1);
        g2d.fillRect(13 + x, 16 + y, 1, 1);
        g2d.fillRect(15 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(122 + x, 16 + y, 1, 1);
        g2d.fillRect(36 + x, 17 + y, 1, 1);
        g2d.fillRect(64 + x, 17 + y, 1, 1);
        g2d.fillRect(70 + x, 18 + y, 1, 1);
        g2d.fillRect(91 + x, 18 + y, 1, 1);
        g2d.fillRect(158 + x, 18 + y, 1, 1);
        g2d.fillRect(9 + x, 19 + y, 1, 1);
        g2d.fillRect(29 + x, 19 + y, 1, 1);
        g2d.fillRect(80 + x, 19 + y, 1, 1);
        g2d.fillRect(89 + x, 19 + y, 2, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(130 + x, 19 + y, 1, 1);
        g2d.fillRect(133 + x, 19 + y, 1, 1);
        g2d.fillRect(137 + x, 19 + y, 1, 1);
        g2d.fillRect(140 + x, 19 + y, 1, 1);
        g2d.fillRect(168 + x, 19 + y, 1, 1);
        g2d.fillRect(171 + x, 19 + y, 1, 1);
        g2d.fillRect(51 + x, 20 + y, 1, 1);
        g2d.fillRect(69 + x, 20 + y, 1, 1);
        g2d.fillRect(73 + x, 20 + y, 1, 1);
        g2d.fillRect(132 + x, 20 + y, 1, 1);
        g2d.fillRect(159 + x, 20 + y, 1, 1);
        g2d.fillRect(170 + x, 20 + y, 1, 1);
        g2d.fillRect(142 + x, 23 + y, 1, 1);
        g2d.fillRect(145 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(14 + x, 7 + y, 1, 1);
        g2d.fillRect(57 + x, 7 + y, 1, 1);
        g2d.fillRect(9 + x, 8 + y, 1, 1);
        g2d.fillRect(60 + x, 8 + y, 1, 1);
        g2d.fillRect(12 + x, 9 + y, 1, 1);
        g2d.fillRect(66 + x, 10 + y, 1, 1);
        g2d.fillRect(88 + x, 10 + y, 1, 1);
        g2d.fillRect(95 + x, 10 + y, 1, 1);
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(42 + x, 11 + y, 1, 2);
        g2d.fillRect(143 + x, 11 + y, 1, 1);
        g2d.fillRect(150 + x, 11 + y, 1, 1);
        g2d.fillRect(87 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(137 + x, 12 + y, 1, 1);
        g2d.fillRect(140 + x, 12 + y, 1, 1);
        g2d.fillRect(57 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(11 + x, 14 + y, 1, 2);
        g2d.fillRect(87 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(21 + x, 15 + y, 1, 1);
        g2d.fillRect(127 + x, 15 + y, 1, 1);
        g2d.fillRect(140 + x, 15 + y, 1, 1);
        g2d.fillRect(165 + x, 15 + y, 1, 1);
        g2d.fillRect(19 + x, 16 + y, 1, 1);
        g2d.fillRect(152 + x, 16 + y, 1, 1);
        g2d.fillRect(157 + x, 16 + y, 1, 1);
        g2d.fillRect(28 + x, 17 + y, 1, 1);
        g2d.fillRect(79 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(86 + x, 18 + y, 1, 1);
        g2d.fillRect(141 + x, 18 + y, 1, 1);
        g2d.fillRect(62 + x, 19 + y, 1, 1);
        g2d.fillRect(35 + x, 20 + y, 1, 1);
        g2d.fillRect(128 + x, 20 + y, 1, 1);
        g2d.fillRect(166 + x, 20 + y, 1, 1);
        g2d.fillRect(143 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 4 + y, 2, 1);
        g2d.fillRect(143 + x, 4 + y, 1, 1);
        g2d.fillRect(31 + x, 6 + y, 1, 1);
        g2d.fillRect(69 + x, 6 + y, 1, 1);
        g2d.fillRect(10 + x, 7 + y, 1, 1);
        g2d.fillRect(22 + x, 7 + y, 1, 1);
        g2d.fillRect(29 + x, 7 + y, 1, 1);
        g2d.fillRect(56 + x, 7 + y, 1, 1);
        g2d.fillRect(114 + x, 7 + y, 1, 1);
        g2d.fillRect(140 + x, 7 + y, 1, 1);
        g2d.fillRect(12 + x, 8 + y, 1, 1);
        g2d.fillRect(23 + x, 8 + y, 1, 1);
        g2d.fillRect(58 + x, 8 + y, 1, 1);
        g2d.fillRect(66 + x, 8 + y, 2, 1);
        g2d.fillRect(112 + x, 8 + y, 1, 1);
        g2d.fillRect(120 + x, 8 + y, 1, 1);
        g2d.fillRect(138 + x, 8 + y, 1, 1);
        g2d.fillRect(90 + x, 9 + y, 1, 1);
        g2d.fillRect(97 + x, 9 + y, 1, 1);
        g2d.fillRect(117 + x, 9 + y, 1, 1);
        g2d.fillRect(12 + x, 10 + y, 1, 2);
        g2d.fillRect(53 + x, 10 + y, 1, 1);
        g2d.fillRect(85 + x, 10 + y, 1, 1);
        g2d.fillRect(124 + x, 10 + y, 1, 1);
        g2d.fillRect(20 + x, 11 + y, 1, 2);
        g2d.fillRect(37 + x, 11 + y, 1, 1);
        g2d.fillRect(75 + x, 11 + y, 1, 1);
        g2d.fillRect(86 + x, 11 + y, 1, 2);
        g2d.fillRect(101 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(130 + x, 11 + y, 1, 2);
        g2d.fillRect(139 + x, 11 + y, 1, 1);
        g2d.fillRect(158 + x, 11 + y, 1, 1);
        g2d.fillRect(168 + x, 11 + y, 1, 2);
        g2d.fillRect(19 + x, 12 + y, 1, 1);
        g2d.fillRect(26 + x, 12 + y, 1, 1);
        g2d.fillRect(33 + x, 12 + y, 1, 1);
        g2d.fillRect(58 + x, 12 + y, 1, 1);
        g2d.fillRect(72 + x, 12 + y, 1, 1);
        g2d.fillRect(76 + x, 12 + y, 1, 1);
        g2d.fillRect(79 + x, 12 + y, 1, 1);
        g2d.fillRect(90 + x, 12 + y, 2, 1);
        g2d.fillRect(131 + x, 12 + y, 1, 1);
        g2d.fillRect(151 + x, 12 + y, 1, 1);
        g2d.fillRect(157 + x, 12 + y, 1, 1);
        g2d.fillRect(161 + x, 12 + y, 1, 1);
        g2d.fillRect(169 + x, 12 + y, 1, 1);
        g2d.fillRect(11 + x, 13 + y, 1, 1);
        g2d.fillRect(17 + x, 13 + y, 1, 1);
        g2d.fillRect(25 + x, 13 + y, 1, 1);
        g2d.fillRect(34 + x, 13 + y, 1, 1);
        g2d.fillRect(37 + x, 13 + y, 1, 1);
        g2d.fillRect(40 + x, 13 + y, 1, 2);
        g2d.fillRect(71 + x, 13 + y, 1, 1);
        g2d.fillRect(89 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(133 + x, 13 + y, 1, 1);
        g2d.fillRect(139 + x, 13 + y, 1, 1);
        g2d.fillRect(142 + x, 13 + y, 1, 1);
        g2d.fillRect(171 + x, 13 + y, 1, 1);
        g2d.fillRect(27 + x, 14 + y, 1, 1);
        g2d.fillRect(62 + x, 14 + y, 1, 1);
        g2d.fillRect(69 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(131 + x, 14 + y, 1, 1);
        g2d.fillRect(148 + x, 14 + y, 1, 1);
        g2d.fillRect(152 + x, 14 + y, 1, 2);
        g2d.fillRect(154 + x, 14 + y, 1, 2);
        g2d.fillRect(169 + x, 14 + y, 1, 1);
        g2d.fillRect(17 + x, 15 + y, 1, 1);
        g2d.fillRect(35 + x, 15 + y, 1, 1);
        g2d.fillRect(139 + x, 15 + y, 1, 1);
        g2d.fillRect(146 + x, 15 + y, 1, 1);
        g2d.fillRect(159 + x, 15 + y, 1, 1);
        g2d.fillRect(41 + x, 16 + y, 1, 1);
        g2d.fillRect(57 + x, 16 + y, 1, 1);
        g2d.fillRect(70 + x, 16 + y, 1, 2);
        g2d.fillRect(136 + x, 16 + y, 1, 1);
        g2d.fillRect(138 + x, 16 + y, 1, 1);
        g2d.fillRect(13 + x, 17 + y, 1, 3);
        g2d.fillRect(68 + x, 17 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(125 + x, 17 + y, 1, 1);
        g2d.fillRect(132 + x, 17 + y, 1, 1);
        g2d.fillRect(139 + x, 17 + y, 1, 1);
        g2d.fillRect(163 + x, 17 + y, 1, 1);
        g2d.fillRect(170 + x, 17 + y, 1, 1);
        g2d.fillRect(9 + x, 18 + y, 1, 1);
        g2d.fillRect(26 + x, 18 + y, 1, 1);
        g2d.fillRect(30 + x, 18 + y, 1, 2);
        g2d.fillRect(42 + x, 18 + y, 1, 1);
        g2d.fillRect(161 + x, 18 + y, 1, 1);
        g2d.fillRect(18 + x, 19 + y, 1, 1);
        g2d.fillRect(20 + x, 19 + y, 1, 1);
        g2d.fillRect(55 + x, 19 + y, 2, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(127 + x, 19 + y, 1, 1);
        g2d.fillRect(132 + x, 19 + y, 1, 1);
        g2d.fillRect(148 + x, 19 + y, 1, 1);
        g2d.fillRect(165 + x, 19 + y, 1, 1);
        g2d.fillRect(170 + x, 19 + y, 1, 1);
        g2d.fillRect(14 + x, 20 + y, 1, 1);
        g2d.fillRect(21 + x, 20 + y, 2, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(142 + x, 20 + y, 1, 1);
        g2d.fillRect(53 + x, 21 + y, 1, 1);
        g2d.fillRect(143 + x, 22 + y, 1, 1);
        g2d.fillRect(148 + x, 22 + y, 1, 1);
        g2d.fillRect(146 + x, 24 + y, 1, 2);
        g2d.fillRect(145 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(142 + x, 4 + y, 1, 1);
        g2d.fillRect(140 + x, 5 + y, 1, 1);
        g2d.fillRect(70 + x, 6 + y, 1, 1);
        g2d.fillRect(98 + x, 6 + y, 1, 1);
        g2d.fillRect(139 + x, 6 + y, 1, 1);
        g2d.fillRect(121 + x, 7 + y, 1, 1);
        g2d.fillRect(95 + x, 9 + y, 1, 1);
        g2d.fillRect(121 + x, 9 + y, 1, 1);
        g2d.fillRect(19 + x, 10 + y, 1, 1);
        g2d.fillRect(52 + x, 10 + y, 1, 1);
        g2d.fillRect(34 + x, 11 + y, 1, 1);
        g2d.fillRect(61 + x, 11 + y, 1, 1);
        g2d.fillRect(72 + x, 11 + y, 1, 1);
        g2d.fillRect(82 + x, 11 + y, 1, 2);
        g2d.fillRect(141 + x, 11 + y, 1, 1);
        g2d.fillRect(22 + x, 12 + y, 1, 1);
        g2d.fillRect(43 + x, 12 + y, 1, 1);
        g2d.fillRect(53 + x, 12 + y, 1, 1);
        g2d.fillRect(85 + x, 12 + y, 1, 1);
        g2d.fillRect(148 + x, 12 + y, 1, 1);
        g2d.fillRect(26 + x, 13 + y, 1, 1);
        g2d.fillRect(83 + x, 13 + y, 1, 1);
        g2d.fillRect(147 + x, 13 + y, 1, 1);
        g2d.fillRect(154 + x, 13 + y, 1, 1);
        g2d.fillRect(29 + x, 14 + y, 1, 1);
        g2d.fillRect(60 + x, 14 + y, 1, 1);
        g2d.fillRect(64 + x, 14 + y, 2, 1);
        g2d.fillRect(82 + x, 14 + y, 1, 1);
        g2d.fillRect(143 + x, 14 + y, 1, 1);
        g2d.fillRect(10 + x, 16 + y, 1, 1);
        g2d.fillRect(56 + x, 16 + y, 1, 1);
        g2d.fillRect(34 + x, 17 + y, 1, 1);
        g2d.fillRect(61 + x, 17 + y, 1, 1);
        g2d.fillRect(76 + x, 17 + y, 1, 1);
        g2d.fillRect(88 + x, 17 + y, 1, 1);
        g2d.fillRect(130 + x, 17 + y, 1, 1);
        g2d.fillRect(168 + x, 17 + y, 1, 1);
        g2d.fillRect(28 + x, 18 + y, 1, 1);
        g2d.fillRect(64 + x, 18 + y, 1, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(134 + x, 18 + y, 1, 1);
        g2d.fillRect(172 + x, 18 + y, 1, 1);
        g2d.fillRect(8 + x, 19 + y, 1, 1);
        g2d.fillRect(36 + x, 19 + y, 1, 1);
        g2d.fillRect(73 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(128 + x, 19 + y, 1, 1);
        g2d.fillRect(152 + x, 19 + y, 1, 1);
        g2d.fillRect(159 + x, 19 + y, 1, 1);
        g2d.fillRect(166 + x, 19 + y, 1, 1);
        g2d.fillRect(38 + x, 20 + y, 1, 1);
        g2d.fillRect(78 + x, 20 + y, 1, 1);
        g2d.fillRect(80 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(125 + x, 20 + y, 1, 1);
        g2d.fillRect(135 + x, 20 + y, 1, 1);
        g2d.fillRect(137 + x, 20 + y, 1, 1);
        g2d.fillRect(163 + x, 20 + y, 1, 1);
        g2d.fillRect(7 + x, 21 + y, 1, 1);
        g2d.fillRect(147 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(68 + x, 6 + y, 1, 1);
        g2d.fillRect(60 + x, 7 + y, 1, 1);
        g2d.fillRect(56 + x, 8 + y, 1, 1);
        g2d.fillRect(114 + x, 8 + y, 1, 1);
        g2d.fillRect(117 + x, 8 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 1);
        g2d.fillRect(65 + x, 10 + y, 1, 1);
        g2d.fillRect(59 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(137 + x, 11 + y, 1, 1);
        g2d.fillRect(12 + x, 12 + y, 1, 1);
        g2d.fillRect(35 + x, 12 + y, 1, 1);
        g2d.fillRect(57 + x, 12 + y, 1, 1);
        g2d.fillRect(128 + x, 12 + y, 1, 1);
        g2d.fillRect(139 + x, 12 + y, 1, 1);
        g2d.fillRect(141 + x, 12 + y, 1, 1);
        g2d.fillRect(150 + x, 12 + y, 1, 1);
        g2d.fillRect(162 + x, 12 + y, 1, 1);
        g2d.fillRect(166 + x, 12 + y, 1, 1);
        g2d.fillRect(44 + x, 13 + y, 1, 1);
        g2d.fillRect(74 + x, 13 + y, 1, 1);
        g2d.fillRect(87 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(127 + x, 13 + y, 1, 1);
        g2d.fillRect(165 + x, 13 + y, 1, 1);
        g2d.fillRect(7 + x, 14 + y, 1, 1);
        g2d.fillRect(19 + x, 15 + y, 1, 1);
        g2d.fillRect(122 + x, 15 + y, 1, 1);
        g2d.fillRect(157 + x, 15 + y, 1, 1);
        g2d.fillRect(21 + x, 16 + y, 1, 1);
        g2d.fillRect(68 + x, 16 + y, 1, 1);
        g2d.fillRect(79 + x, 16 + y, 1, 1);
        g2d.fillRect(81 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(74 + x, 17 + y, 1, 1);
        g2d.fillRect(86 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(132 + x, 18 + y, 1, 1);
        g2d.fillRect(162 + x, 18 + y, 1, 1);
        g2d.fillRect(170 + x, 18 + y, 1, 1);
        g2d.fillRect(28 + x, 19 + y, 1, 1);
        g2d.fillRect(32 + x, 19 + y, 1, 1);
        g2d.fillRect(68 + x, 19 + y, 1, 1);
        g2d.fillRect(88 + x, 19 + y, 1, 1);
        g2d.fillRect(4 + x, 20 + y, 1, 1);
        g2d.fillRect(13 + x, 20 + y, 1, 1);
        g2d.fillRect(50 + x, 20 + y, 1, 1);
        g2d.fillRect(89 + x, 20 + y, 1, 1);
        g2d.fillRect(151 + x, 20 + y, 1, 1);
        g2d.fillRect(63 + x, 21 + y, 1, 1);
        g2d.fillRect(147 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(29 + x, 6 + y, 1, 1);
        g2d.fillRect(143 + x, 6 + y, 1, 1);
        g2d.fillRect(31 + x, 7 + y, 1, 1);
        g2d.fillRect(10 + x, 8 + y, 1, 1);
        g2d.fillRect(90 + x, 8 + y, 1, 1);
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(90 + x, 10 + y, 1, 2);
        g2d.fillRect(53 + x, 11 + y, 1, 1);
        g2d.fillRect(80 + x, 11 + y, 1, 1);
        g2d.fillRect(87 + x, 11 + y, 1, 1);
        g2d.fillRect(91 + x, 11 + y, 1, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(122 + x, 11 + y, 1, 1);
        g2d.fillRect(157 + x, 11 + y, 1, 1);
        g2d.fillRect(161 + x, 11 + y, 1, 1);
        g2d.fillRect(5 + x, 12 + y, 1, 1);
        g2d.fillRect(73 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(144 + x, 12 + y, 1, 1);
        g2d.fillRect(15 + x, 13 + y, 1, 3);
        g2d.fillRect(45 + x, 13 + y, 1, 1);
        g2d.fillRect(58 + x, 13 + y, 1, 1);
        g2d.fillRect(94 + x, 13 + y, 1, 1);
        g2d.fillRect(6 + x, 14 + y, 1, 1);
        g2d.fillRect(42 + x, 14 + y, 1, 1);
        g2d.fillRect(89 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(136 + x, 15 + y, 1, 1);
        g2d.fillRect(142 + x, 15 + y, 1, 1);
        g2d.fillRect(124 + x, 16 + y, 1, 1);
        g2d.fillRect(127 + x, 16 + y, 1, 1);
        g2d.fillRect(165 + x, 16 + y, 1, 1);
        g2d.fillRect(16 + x, 17 + y, 1, 1);
        g2d.fillRect(26 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
        g2d.fillRect(10 + x, 18 + y, 1, 1);
        g2d.fillRect(44 + x, 18 + y, 1, 1);
        g2d.fillRect(153 + x, 18 + y, 1, 1);
        g2d.fillRect(34 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(156 + x, 19 + y, 1, 1);
        g2d.fillRect(161 + x, 19 + y, 1, 1);
        g2d.fillRect(140 + x, 20 + y, 1, 1);
        g2d.fillRect(21 + x, 21 + y, 2, 1);
        g2d.fillRect(32 + x, 21 + y, 2, 1);
        g2d.fillRect(40 + x, 21 + y, 1, 1);
        g2d.fillRect(50 + x, 21 + y, 1, 1);
        g2d.fillRect(71 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 3, 1);
        g2d.fillRect(148 + x, 21 + y, 1, 1);
        g2d.fillRect(52 + x, 22 + y, 1, 1);
        g2d.fillRect(141 + x, 22 + y, 1, 1);
        g2d.fillRect(149 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(99 + x, 4 + y, 1, 1);
        g2d.fillRect(144 + x, 4 + y, 1, 1);
        g2d.fillRect(102 + x, 5 + y, 1, 1);
        g2d.fillRect(100 + x, 6 + y, 2, 1);
        g2d.fillRect(9 + x, 7 + y, 1, 1);
        g2d.fillRect(55 + x, 7 + y, 1, 1);
        g2d.fillRect(71 + x, 7 + y, 1, 1);
        g2d.fillRect(7 + x, 8 + y, 1, 1);
        g2d.fillRect(160 + x, 8 + y, 1, 1);
        g2d.fillRect(6 + x, 9 + y, 1, 1);
        g2d.fillRect(23 + x, 9 + y, 1, 1);
        g2d.fillRect(54 + x, 9 + y, 1, 1);
        g2d.fillRect(88 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 9 + y, 1, 1);
        g2d.fillRect(97 + x, 10 + y, 1, 1);
        g2d.fillRect(111 + x, 10 + y, 1, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 1);
        g2d.fillRect(5 + x, 11 + y, 1, 1);
        g2d.fillRect(27 + x, 11 + y, 1, 1);
        g2d.fillRect(45 + x, 11 + y, 1, 1);
        g2d.fillRect(66 + x, 11 + y, 1, 1);
        g2d.fillRect(153 + x, 11 + y, 1, 1);
        g2d.fillRect(162 + x, 11 + y, 1, 1);
        g2d.fillRect(11 + x, 12 + y, 1, 1);
        g2d.fillRect(38 + x, 12 + y, 1, 1);
        g2d.fillRect(156 + x, 12 + y, 1, 1);
        g2d.fillRect(27 + x, 13 + y, 1, 1);
        g2d.fillRect(64 + x, 13 + y, 1, 1);
        g2d.fillRect(131 + x, 13 + y, 1, 1);
        g2d.fillRect(169 + x, 13 + y, 1, 1);
        g2d.fillRect(18 + x, 14 + y, 1, 1);
        g2d.fillRect(133 + x, 14 + y, 1, 1);
        g2d.fillRect(171 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(148 + x, 15 + y, 1, 1);
        g2d.fillRect(11 + x, 16 + y, 1, 1);
        g2d.fillRect(36 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(154 + x, 16 + y, 1, 1);
        g2d.fillRect(159 + x, 16 + y, 1, 1);
        g2d.fillRect(57 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(29 + x, 18 + y, 1, 1);
        g2d.fillRect(32 + x, 18 + y, 1, 1);
        g2d.fillRect(90 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(151 + x, 18 + y, 1, 1);
        g2d.fillRect(135 + x, 19 + y, 1, 1);
        g2d.fillRect(43 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(146 + x, 20 + y, 1, 1);
        g2d.fillRect(156 + x, 20 + y, 1, 1);
        g2d.fillRect(4 + x, 21 + y, 1, 1);
        g2d.fillRect(13 + x, 21 + y, 1, 1);
        g2d.fillRect(27 + x, 21 + y, 1, 1);
        g2d.fillRect(41 + x, 21 + y, 1, 1);
        g2d.fillRect(55 + x, 21 + y, 1, 1);
        g2d.fillRect(87 + x, 21 + y, 1, 1);
        g2d.fillRect(126 + x, 21 + y, 1, 1);
        g2d.fillRect(130 + x, 21 + y, 1, 1);
        g2d.fillRect(149 + x, 21 + y, 1, 1);
        g2d.fillRect(157 + x, 21 + y, 1, 1);
        g2d.fillRect(164 + x, 21 + y, 1, 1);
        g2d.fillRect(168 + x, 21 + y, 1, 1);
        g2d.fillRect(53 + x, 22 + y, 1, 1);
        g2d.fillRect(147 + x, 22 + y, 1, 1);
        g2d.fillRect(144 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(23 + x, 6 + y, 1, 1);
        g2d.fillRect(138 + x, 7 + y, 1, 1);
        g2d.fillRect(57 + x, 8 + y, 1, 1);
        g2d.fillRect(140 + x, 8 + y, 1, 1);
        g2d.fillRect(161 + x, 8 + y, 1, 1);
        g2d.fillRect(8 + x, 9 + y, 1, 1);
        g2d.fillRect(7 + x, 10 + y, 1, 1);
        g2d.fillRect(61 + x, 10 + y, 1, 1);
        g2d.fillRect(86 + x, 10 + y, 1, 1);
        g2d.fillRect(133 + x, 10 + y, 1, 1);
        g2d.fillRect(171 + x, 10 + y, 1, 1);
        g2d.fillRect(18 + x, 11 + y, 1, 1);
        g2d.fillRect(41 + x, 11 + y, 1, 1);
        g2d.fillRect(57 + x, 11 + y, 1, 1);
        g2d.fillRect(149 + x, 11 + y, 1, 1);
        g2d.fillRect(15 + x, 12 + y, 1, 1);
        g2d.fillRect(12 + x, 13 + y, 1, 1);
        g2d.fillRect(62 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(144 + x, 13 + y, 1, 1);
        g2d.fillRect(53 + x, 14 + y, 1, 1);
        g2d.fillRect(126 + x, 14 + y, 1, 1);
        g2d.fillRect(141 + x, 14 + y, 1, 1);
        g2d.fillRect(164 + x, 14 + y, 1, 1);
        g2d.fillRect(40 + x, 15 + y, 1, 1);
        g2d.fillRect(65 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(63 + x, 16 + y, 1, 1);
        g2d.fillRect(125 + x, 16 + y, 1, 1);
        g2d.fillRect(140 + x, 16 + y, 1, 1);
        g2d.fillRect(163 + x, 16 + y, 1, 1);
        g2d.fillRect(44 + x, 17 + y, 1, 1);
        g2d.fillRect(93 + x, 17 + y, 1, 1);
        g2d.fillRect(18 + x, 18 + y, 1, 1);
        g2d.fillRect(88 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(148 + x, 18 + y, 1, 1);
        g2d.fillRect(15 + x, 19 + y, 1, 1);
        g2d.fillRect(64 + x, 19 + y, 1, 1);
        g2d.fillRect(78 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(23 + x, 20 + y, 1, 1);
        g2d.fillRect(62 + x, 20 + y, 1, 1);
        g2d.fillRect(39 + x, 21 + y, 1, 1);
        g2d.fillRect(70 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 2, 1);
        g2d.fillRect(127 + x, 21 + y, 1, 1);
        g2d.fillRect(131 + x, 21 + y, 1, 1);
        g2d.fillRect(165 + x, 21 + y, 1, 1);
        g2d.fillRect(169 + x, 21 + y, 1, 1);
        g2d.fillRect(144 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(141 + x, 4 + y, 1, 1);
        g2d.fillRect(97 + x, 5 + y, 1, 1);
        g2d.fillRect(24 + x, 6 + y, 1, 1);
        g2d.fillRect(96 + x, 6 + y, 1, 1);
        g2d.fillRect(141 + x, 6 + y, 2, 1);
        g2d.fillRect(144 + x, 6 + y, 1, 1);
        g2d.fillRect(113 + x, 7 + y, 1, 1);
        g2d.fillRect(53 + x, 8 + y, 1, 1);
        g2d.fillRect(89 + x, 8 + y, 1, 1);
        g2d.fillRect(95 + x, 8 + y, 1, 1);
        g2d.fillRect(115 + x, 8 + y, 1, 1);
        g2d.fillRect(119 + x, 8 + y, 1, 1);
        g2d.fillRect(123 + x, 8 + y, 1, 1);
        g2d.fillRect(67 + x, 9 + y, 1, 1);
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(84 + x, 10 + y, 1, 1);
        g2d.fillRect(134 + x, 10 + y, 1, 2);
        g2d.fillRect(137 + x, 10 + y, 1, 1);
        g2d.fillRect(158 + x, 10 + y, 1, 1);
        g2d.fillRect(172 + x, 10 + y, 1, 2);
        g2d.fillRect(83 + x, 11 + y, 1, 1);
        g2d.fillRect(92 + x, 11 + y, 1, 2);
        g2d.fillRect(129 + x, 11 + y, 1, 1);
        g2d.fillRect(156 + x, 11 + y, 1, 1);
        g2d.fillRect(167 + x, 11 + y, 1, 1);
        g2d.fillRect(7 + x, 12 + y, 1, 1);
        g2d.fillRect(40 + x, 12 + y, 1, 1);
        g2d.fillRect(59 + x, 12 + y, 1, 1);
        g2d.fillRect(70 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 12 + y, 1, 1);
        g2d.fillRect(154 + x, 12 + y, 1, 1);
        g2d.fillRect(5 + x, 13 + y, 1, 1);
        g2d.fillRect(22 + x, 13 + y, 1, 1);
        g2d.fillRect(36 + x, 13 + y, 1, 1);
        g2d.fillRect(69 + x, 13 + y, 1, 1);
        g2d.fillRect(79 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(140 + x, 13 + y, 1, 1);
        g2d.fillRect(149 + x, 13 + y, 1, 1);
        g2d.fillRect(16 + x, 14 + y, 1, 1);
        g2d.fillRect(19 + x, 14 + y, 1, 1);
        g2d.fillRect(52 + x, 14 + y, 1, 1);
        g2d.fillRect(71 + x, 14 + y, 1, 1);
        g2d.fillRect(122 + x, 14 + y, 1, 1);
        g2d.fillRect(128 + x, 14 + y, 1, 1);
        g2d.fillRect(146 + x, 14 + y, 1, 1);
        g2d.fillRect(157 + x, 14 + y, 1, 1);
        g2d.fillRect(166 + x, 14 + y, 1, 1);
        g2d.fillRect(10 + x, 15 + y, 1, 1);
        g2d.fillRect(29 + x, 15 + y, 1, 1);
        g2d.fillRect(43 + x, 15 + y, 1, 1);
        g2d.fillRect(56 + x, 15 + y, 1, 1);
        g2d.fillRect(60 + x, 15 + y, 1, 1);
        g2d.fillRect(68 + x, 15 + y, 1, 1);
        g2d.fillRect(79 + x, 15 + y, 1, 1);
        g2d.fillRect(33 + x, 16 + y, 1, 1);
        g2d.fillRect(74 + x, 16 + y, 1, 1);
        g2d.fillRect(86 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(138 + x, 17 + y, 1, 1);
        g2d.fillRect(141 + x, 17 + y, 1, 1);
        g2d.fillRect(55 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(123 + x, 18 + y, 1, 1);
        g2d.fillRect(129 + x, 18 + y, 1, 1);
        g2d.fillRect(133 + x, 18 + y, 1, 1);
        g2d.fillRect(139 + x, 18 + y, 1, 1);
        g2d.fillRect(156 + x, 18 + y, 1, 1);
        g2d.fillRect(167 + x, 18 + y, 1, 1);
        g2d.fillRect(171 + x, 18 + y, 1, 1);
        g2d.fillRect(71 + x, 19 + y, 1, 1);
        g2d.fillRect(75 + x, 19 + y, 1, 1);
        g2d.fillRect(91 + x, 19 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 1, 1);
        g2d.fillRect(134 + x, 19 + y, 1, 1);
        g2d.fillRect(142 + x, 19 + y, 1, 1);
        g2d.fillRect(150 + x, 19 + y, 1, 1);
        g2d.fillRect(172 + x, 19 + y, 1, 1);
        g2d.fillRect(29 + x, 20 + y, 2, 1);
        g2d.fillRect(52 + x, 20 + y, 1, 1);
        g2d.fillRect(54 + x, 20 + y, 1, 1);
        g2d.fillRect(56 + x, 20 + y, 1, 1);
        g2d.fillRect(74 + x, 20 + y, 1, 1);
        g2d.fillRect(129 + x, 20 + y, 1, 1);
        g2d.fillRect(133 + x, 20 + y, 1, 1);
        g2d.fillRect(160 + x, 20 + y, 1, 1);
        g2d.fillRect(167 + x, 20 + y, 1, 1);
        g2d.fillRect(171 + x, 20 + y, 1, 1);
        g2d.fillRect(14 + x, 21 + y, 1, 1);
        g2d.fillRect(23 + x, 21 + y, 1, 1);
        g2d.fillRect(26 + x, 21 + y, 1, 1);
        g2d.fillRect(34 + x, 21 + y, 1, 1);
        g2d.fillRect(72 + x, 21 + y, 1, 1);
        g2d.fillRect(86 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(158 + x, 21 + y, 1, 1);
        g2d.fillRect(51 + x, 22 + y, 1, 1);
    }

    public void attributesSetUpDecreaseShiftX()
    {
        shiftX--;
    }

    public void attributesSetUpIncreaseShiftX()
    {
        shiftX++;
    }

    public int getShiftX()
    {
        return shiftX;
    }

    public void attributesSetUpDecreaseShiftY()
    {
        shiftY--;
    }

    public void attributesSetUpIncreaseShiftY()
    {
        shiftY++;
    }

    public int getShiftY()
    {
        return shiftY;
    }

    int shiftX = 0;
    int shiftY = 0;
}
