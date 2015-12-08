/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.h;

import clts.*;
import draw.Panel;
import util.Color;
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
public class H9 extends SuperTL
{
    int direction = 0;
    public H9()
    {
        super();
    }

    public H9(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }


    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintT(offsetX, 0,g2d);
        else
            paintBackT(offsetX, 0,g2d);
    }

    public void paintT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(122 + x, 25 + y, 1, 3);
        g2d.fillRect(123 + x, 25 + y, 1, 2);
        g2d.fillRect(124 + x, 25 + y, 1, 3);
        g2d.fillRect(125 + x, 25 + y, 1, 4);
        g2d.fillRect(126 + x, 25 + y, 1, 5);
        g2d.fillRect(127 + x, 25 + y, 1, 4);
        g2d.fillRect(128 + x, 26 + y, 1, 4);
        g2d.fillRect(129 + x, 26 + y, 1, 5);
        g2d.fillRect(130 + x, 26 + y, 1, 4);
        g2d.fillRect(123 + x, 28 + y, 1, 1);
        g2d.fillRect(131 + x, 28 + y, 1, 3);
        g2d.fillRect(124 + x, 29 + y, 1, 1);
        g2d.fillRect(122 + x, 31 + y, 1, 2);
        g2d.fillRect(123 + x, 33 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_7));
        g2d.fillRect(99 + x, 15 + y, 2, 1);
        g2d.fillRect(101 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 17 + y, 2, 1);
        g2d.fillRect(101 + x, 18 + y, 2, 1);
        g2d.fillRect(105 + x, 18 + y, 2, 1);
        g2d.fillRect(99 + x, 19 + y, 2, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 6, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 3);
        g2d.fillRect(119 + x, 23 + y, 8, 1);
        g2d.fillRect(120 + x, 24 + y, 9, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 5);
        g2d.fillRect(128 + x, 25 + y, 3, 1);
        g2d.fillRect(131 + x, 26 + y, 1, 2);
        g2d.fillRect(86 + x, 30 + y, 1, 1);
        g2d.fillRect(87 + x, 31 + y, 1, 1);
        g2d.fillRect(88 + x, 32 + y, 1, 1);
        g2d.fillRect(89 + x, 33 + y, 2, 1);
        g2d.fillRect(122 + x, 33 + y, 1, 3);
        g2d.fillRect(131 + x, 33 + y, 1, 2);
        g2d.fillRect(91 + x, 34 + y, 2, 1);
        g2d.fillRect(92 + x, 35 + y, 2, 1);
        g2d.fillRect(130 + x, 35 + y, 1, 1);
        g2d.fillRect(94 + x, 36 + y, 3, 1);
        g2d.fillRect(128 + x, 36 + y, 2, 1);
        g2d.fillRect(123 + x, 37 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(90 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(111 + x, 7 + y, 2, 1);
        g2d.fillRect(113 + x, 8 + y, 2, 1);
        g2d.fillRect(115 + x, 9 + y, 2, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 1);
        g2d.fillRect(118 + x, 11 + y, 1, 2);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 2, 1);
        g2d.fillRect(99 + x, 18 + y, 2, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 2, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 20 + y, 2, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 2, 1);
        g2d.fillRect(124 + x, 21 + y, 2, 1);
        g2d.fillRect(114 + x, 22 + y, 2, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(127 + x, 22 + y, 2, 1);
        g2d.fillRect(129 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 8);
        g2d.fillRect(130 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(123 + x, 27 + y, 1, 1);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(122 + x, 28 + y, 1, 3);
        g2d.fillRect(124 + x, 28 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 1);
        g2d.fillRect(125 + x, 29 + y, 1, 3);
        g2d.fillRect(127 + x, 29 + y, 1, 3);
        g2d.fillRect(87 + x, 30 + y, 1, 1);
        g2d.fillRect(94 + x, 30 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 5);
        g2d.fillRect(124 + x, 30 + y, 1, 1);
        g2d.fillRect(126 + x, 30 + y, 1, 1);
        g2d.fillRect(128 + x, 30 + y, 1, 2);
        g2d.fillRect(130 + x, 30 + y, 1, 5);
        g2d.fillRect(88 + x, 31 + y, 1, 1);
        g2d.fillRect(123 + x, 31 + y, 1, 2);
        g2d.fillRect(129 + x, 31 + y, 1, 2);
        g2d.fillRect(131 + x, 31 + y, 1, 2);
        g2d.fillRect(89 + x, 32 + y, 1, 1);
        g2d.fillRect(93 + x, 32 + y, 2, 1);
        g2d.fillRect(124 + x, 32 + y, 1, 2);
        g2d.fillRect(126 + x, 32 + y, 1, 2);
        g2d.fillRect(91 + x, 33 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 1, 3);
        g2d.fillRect(95 + x, 33 + y, 1, 1);
        g2d.fillRect(125 + x, 33 + y, 1, 4);
        g2d.fillRect(127 + x, 33 + y, 1, 4);
        g2d.fillRect(128 + x, 33 + y, 1, 1);
        g2d.fillRect(129 + x, 34 + y, 1, 1);
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(124 + x, 35 + y, 1, 1);
        g2d.fillRect(126 + x, 35 + y, 1, 1);
        g2d.fillRect(128 + x, 35 + y, 1, 1);
        g2d.fillRect(123 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 7 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(126 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(94 + x, 26 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 29 + y, 1, 1);
        g2d.fillRect(123 + x, 30 + y, 1, 1);
        g2d.fillRect(94 + x, 31 + y, 1, 1);
        g2d.fillRect(124 + x, 31 + y, 1, 1);
        g2d.fillRect(126 + x, 31 + y, 1, 1);
        g2d.fillRect(95 + x, 32 + y, 1, 1);
        g2d.fillRect(125 + x, 32 + y, 1, 1);
        g2d.fillRect(127 + x, 32 + y, 2, 1);
        g2d.fillRect(92 + x, 33 + y, 1, 1);
        g2d.fillRect(129 + x, 33 + y, 1, 1);
        g2d.fillRect(93 + x, 34 + y, 1, 1);
        g2d.fillRect(95 + x, 34 + y, 1, 1);
        g2d.fillRect(124 + x, 34 + y, 1, 1);
        g2d.fillRect(126 + x, 34 + y, 1, 1);
        g2d.fillRect(128 + x, 34 + y, 1, 1);
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(129 + x, 35 + y, 1, 1);
        g2d.fillRect(124 + x, 36 + y, 1, 1);
        g2d.fillRect(126 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 8 + y, 1, 1);
        g2d.fillRect(91 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(83 + x, 21 + y, 1, 1);
        g2d.fillRect(84 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(83 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 25 + y, 1, 1);
        g2d.fillRect(83 + x, 26 + y, 1, 1);
        g2d.fillRect(84 + x, 28 + y, 1, 1);
        g2d.fillRect(90 + x, 31 + y, 1, 1);
        g2d.fillRect(93 + x, 31 + y, 1, 1);
        g2d.fillRect(93 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 16 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 7 + y, 1, 1);
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 1);
        g2d.fillRect(93 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(89 + x, 14 + y, 1, 1);
        g2d.fillRect(85 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 24 + y, 1, 1);
        g2d.fillRect(83 + x, 25 + y, 1, 1);
        g2d.fillRect(92 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 14 + y, 2, 1);
        g2d.fillRect(119 + x, 14 + y, 2, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(121 + x, 15 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(122 + x, 17 + y, 1, 2);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(120 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 2);
        g2d.fillRect(121 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(108 + x, 7 + y, 1, 1);
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 2, 1);
        g2d.fillRect(102 + x, 10 + y, 1, 1);
        g2d.fillRect(92 + x, 13 + y, 1, 1);
        g2d.fillRect(94 + x, 13 + y, 2, 1);
        g2d.fillRect(90 + x, 14 + y, 1, 1);
        g2d.fillRect(87 + x, 15 + y, 2, 1);
        g2d.fillRect(86 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 2, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 2, 1);
        g2d.fillRect(85 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 2, 1);
        g2d.fillRect(108 + x, 18 + y, 2, 1);
        g2d.fillRect(84 + x, 19 + y, 1, 3);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(83 + x, 22 + y, 1, 2);
        g2d.fillRect(94 + x, 22 + y, 1, 1);
        g2d.fillRect(84 + x, 23 + y, 1, 5);
        g2d.fillRect(85 + x, 27 + y, 1, 3);
        g2d.fillRect(94 + x, 27 + y, 1, 1);
        g2d.fillRect(86 + x, 29 + y, 2, 1);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(88 + x, 30 + y, 1, 1);
        g2d.fillRect(93 + x, 30 + y, 1, 1);
        g2d.fillRect(89 + x, 31 + y, 1, 1);
        g2d.fillRect(91 + x, 31 + y, 1, 2);
        g2d.fillRect(92 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(101 + x, 12 + y, 1, 2);
        g2d.fillRect(93 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(89 + x, 15 + y, 1, 2);
        g2d.fillRect(92 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(87 + x, 16 + y, 1, 1);
        g2d.fillRect(93 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(86 + x, 17 + y, 1, 1);
        g2d.fillRect(90 + x, 17 + y, 1, 1);
        g2d.fillRect(87 + x, 18 + y, 1, 1);
        g2d.fillRect(91 + x, 18 + y, 1, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(85 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(86 + x, 20 + y, 1, 1);
        g2d.fillRect(89 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
        g2d.fillRect(85 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(86 + x, 22 + y, 1, 1);
        g2d.fillRect(89 + x, 22 + y, 1, 1);
        g2d.fillRect(85 + x, 23 + y, 1, 1);
        g2d.fillRect(92 + x, 23 + y, 1, 1);
        g2d.fillRect(86 + x, 24 + y, 1, 1);
        g2d.fillRect(88 + x, 25 + y, 1, 1);
        g2d.fillRect(92 + x, 25 + y, 1, 2);
        g2d.fillRect(85 + x, 26 + y, 1, 1);
        g2d.fillRect(89 + x, 26 + y, 1, 1);
        g2d.fillRect(86 + x, 27 + y, 1, 1);
        g2d.fillRect(93 + x, 27 + y, 1, 1);
        g2d.fillRect(87 + x, 28 + y, 1, 1);
        g2d.fillRect(89 + x, 28 + y, 1, 1);
        g2d.fillRect(91 + x, 28 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 8 + y, 1, 10);
        g2d.fillRect(109 + x, 8 + y, 1, 10);
        g2d.fillRect(110 + x, 8 + y, 1, 12);
        g2d.fillRect(111 + x, 8 + y, 1, 8);
        g2d.fillRect(112 + x, 8 + y, 1, 13);
        g2d.fillRect(105 + x, 9 + y, 1, 8);
        g2d.fillRect(106 + x, 9 + y, 1, 8);
        g2d.fillRect(107 + x, 9 + y, 1, 9);
        g2d.fillRect(113 + x, 9 + y, 1, 7);
        g2d.fillRect(114 + x, 9 + y, 1, 8);
        g2d.fillRect(103 + x, 10 + y, 1, 6);
        g2d.fillRect(104 + x, 10 + y, 1, 5);
        g2d.fillRect(115 + x, 10 + y, 1, 5);
        g2d.fillRect(116 + x, 10 + y, 1, 4);
        g2d.fillRect(102 + x, 11 + y, 1, 3);
        g2d.fillRect(117 + x, 11 + y, 1, 3);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(118 + x, 13 + y, 1, 2);
        g2d.fillRect(92 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 7);
        g2d.fillRect(96 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(90 + x, 15 + y, 1, 2);
        g2d.fillRect(91 + x, 15 + y, 1, 3);
        g2d.fillRect(93 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 15 + y, 1, 4);
        g2d.fillRect(97 + x, 15 + y, 1, 3);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(88 + x, 16 + y, 1, 9);
        g2d.fillRect(92 + x, 16 + y, 1, 7);
        g2d.fillRect(87 + x, 17 + y, 1, 1);
        g2d.fillRect(89 + x, 17 + y, 1, 3);
        g2d.fillRect(93 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 4);
        g2d.fillRect(113 + x, 17 + y, 1, 4);
        g2d.fillRect(86 + x, 18 + y, 1, 2);
        g2d.fillRect(90 + x, 18 + y, 1, 13);
        g2d.fillRect(114 + x, 18 + y, 1, 4);
        g2d.fillRect(115 + x, 18 + y, 1, 4);
        g2d.fillRect(87 + x, 19 + y, 1, 9);
        g2d.fillRect(91 + x, 19 + y, 1, 9);
        g2d.fillRect(93 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 3);
        g2d.fillRect(85 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 20 + y, 1, 2);
        g2d.fillRect(119 + x, 20 + y, 1, 2);
        g2d.fillRect(120 + x, 20 + y, 1, 2);
        g2d.fillRect(121 + x, 20 + y, 1, 2);
        g2d.fillRect(86 + x, 21 + y, 1, 1);
        g2d.fillRect(89 + x, 21 + y, 1, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 6);
        g2d.fillRect(122 + x, 21 + y, 2, 1);
        g2d.fillRect(85 + x, 22 + y, 1, 1);
        g2d.fillRect(124 + x, 22 + y, 3, 1);
        g2d.fillRect(86 + x, 23 + y, 1, 1);
        g2d.fillRect(89 + x, 23 + y, 1, 3);
        g2d.fillRect(127 + x, 23 + y, 2, 1);
        g2d.fillRect(85 + x, 24 + y, 1, 2);
        g2d.fillRect(92 + x, 24 + y, 1, 1);
        g2d.fillRect(129 + x, 24 + y, 1, 1);
        g2d.fillRect(86 + x, 25 + y, 1, 2);
        g2d.fillRect(88 + x, 26 + y, 1, 4);
        g2d.fillRect(89 + x, 27 + y, 1, 1);
        g2d.fillRect(92 + x, 27 + y, 1, 2);
        g2d.fillRect(86 + x, 28 + y, 1, 1);
        g2d.fillRect(93 + x, 28 + y, 1, 2);
        g2d.fillRect(89 + x, 29 + y, 1, 2);
        g2d.fillRect(91 + x, 29 + y, 1, 2);
    }





    public void paintBackT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(93 + x, 25 + y, 1, 3);
        g2d.fillRect(92 + x, 25 + y, 1, 2);
        g2d.fillRect(91 + x, 25 + y, 1, 3);
        g2d.fillRect(90 + x, 25 + y, 1, 4);
        g2d.fillRect(89 + x, 25 + y, 1, 5);
        g2d.fillRect(88 + x, 25 + y, 1, 4);
        g2d.fillRect(87 + x, 26 + y, 1, 4);
        g2d.fillRect(86 + x, 26 + y, 1, 5);
        g2d.fillRect(85 + x, 26 + y, 1, 4);
        g2d.fillRect(92 + x, 28 + y, 1, 1);
        g2d.fillRect(84 + x, 28 + y, 1, 3);
        g2d.fillRect(91 + x, 29 + y, 1, 1);
        g2d.fillRect(93 + x, 31 + y, 1, 2);
        g2d.fillRect(92 + x, 33 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_7));
        g2d.fillRect(115 + x, 15 + y, 2, 1);
        g2d.fillRect(113 + x, 16 + y, 2, 1);
        g2d.fillRect(111 + x, 17 + y, 2, 1);
        g2d.fillRect(113 + x, 18 + y, 2, 1);
        g2d.fillRect(109 + x, 18 + y, 2, 1);
        g2d.fillRect(115 + x, 19 + y, 2, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 2);
        g2d.fillRect(92 + x, 22 + y, 6, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 3);
        g2d.fillRect(89 + x, 23 + y, 8, 1);
        g2d.fillRect(87 + x, 24 + y, 9, 1);
        g2d.fillRect(94 + x, 25 + y, 1, 5);
        g2d.fillRect(85 + x, 25 + y, 3, 1);
        g2d.fillRect(84 + x, 26 + y, 1, 2);
        g2d.fillRect(129 + x, 30 + y, 1, 1);
        g2d.fillRect(128 + x, 31 + y, 1, 1);
        g2d.fillRect(127 + x, 32 + y, 1, 1);
        g2d.fillRect(125 + x, 33 + y, 2, 1);
        g2d.fillRect(93 + x, 33 + y, 1, 3);
        g2d.fillRect(84 + x, 33 + y, 1, 2);
        g2d.fillRect(123 + x, 34 + y, 2, 1);
        g2d.fillRect(122 + x, 35 + y, 2, 1);
        g2d.fillRect(85 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 36 + y, 3, 1);
        g2d.fillRect(86 + x, 36 + y, 2, 1);
        g2d.fillRect(88 + x, 37 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(125 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(103 + x, 7 + y, 2, 1);
        g2d.fillRect(101 + x, 8 + y, 2, 1);
        g2d.fillRect(99 + x, 9 + y, 2, 1);
        g2d.fillRect(98 + x, 10 + y, 1, 1);
        g2d.fillRect(97 + x, 11 + y, 1, 2);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 2, 1);
        g2d.fillRect(115 + x, 18 + y, 2, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 2, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(92 + x, 20 + y, 2, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 2, 1);
        g2d.fillRect(90 + x, 21 + y, 2, 1);
        g2d.fillRect(100 + x, 22 + y, 2, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(87 + x, 22 + y, 2, 1);
        g2d.fillRect(86 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 8);
        g2d.fillRect(85 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(92 + x, 27 + y, 1, 1);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(93 + x, 28 + y, 1, 3);
        g2d.fillRect(91 + x, 28 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 1);
        g2d.fillRect(90 + x, 29 + y, 1, 3);
        g2d.fillRect(88 + x, 29 + y, 1, 3);
        g2d.fillRect(128 + x, 30 + y, 1, 1);
        g2d.fillRect(121 + x, 30 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 5);
        g2d.fillRect(91 + x, 30 + y, 1, 1);
        g2d.fillRect(89 + x, 30 + y, 1, 1);
        g2d.fillRect(87 + x, 30 + y, 1, 2);
        g2d.fillRect(85 + x, 30 + y, 1, 5);
        g2d.fillRect(127 + x, 31 + y, 1, 1);
        g2d.fillRect(92 + x, 31 + y, 1, 2);
        g2d.fillRect(86 + x, 31 + y, 1, 2);
        g2d.fillRect(84 + x, 31 + y, 1, 2);
        g2d.fillRect(126 + x, 32 + y, 1, 1);
        g2d.fillRect(121 + x, 32 + y, 2, 1);
        g2d.fillRect(91 + x, 32 + y, 1, 2);
        g2d.fillRect(89 + x, 32 + y, 1, 2);
        g2d.fillRect(124 + x, 33 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 3);
        g2d.fillRect(120 + x, 33 + y, 1, 1);
        g2d.fillRect(90 + x, 33 + y, 1, 4);
        g2d.fillRect(88 + x, 33 + y, 1, 4);
        g2d.fillRect(87 + x, 33 + y, 1, 1);
        g2d.fillRect(86 + x, 34 + y, 1, 1);
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(91 + x, 35 + y, 1, 1);
        g2d.fillRect(89 + x, 35 + y, 1, 1);
        g2d.fillRect(87 + x, 35 + y, 1, 1);
        g2d.fillRect(92 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 7 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(89 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 29 + y, 1, 1);
        g2d.fillRect(92 + x, 30 + y, 1, 1);
        g2d.fillRect(121 + x, 31 + y, 1, 1);
        g2d.fillRect(91 + x, 31 + y, 1, 1);
        g2d.fillRect(89 + x, 31 + y, 1, 1);
        g2d.fillRect(120 + x, 32 + y, 1, 1);
        g2d.fillRect(90 + x, 32 + y, 1, 1);
        g2d.fillRect(87 + x, 32 + y, 2, 1);
        g2d.fillRect(123 + x, 33 + y, 1, 1);
        g2d.fillRect(86 + x, 33 + y, 1, 1);
        g2d.fillRect(122 + x, 34 + y, 1, 1);
        g2d.fillRect(120 + x, 34 + y, 1, 1);
        g2d.fillRect(91 + x, 34 + y, 1, 1);
        g2d.fillRect(89 + x, 34 + y, 1, 1);
        g2d.fillRect(87 + x, 34 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(86 + x, 35 + y, 1, 1);
        g2d.fillRect(91 + x, 36 + y, 1, 1);
        g2d.fillRect(89 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 8 + y, 1, 1);
        g2d.fillRect(124 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(132 + x, 21 + y, 1, 1);
        g2d.fillRect(131 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(132 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 1);
        g2d.fillRect(132 + x, 26 + y, 1, 1);
        g2d.fillRect(131 + x, 28 + y, 1, 1);
        g2d.fillRect(125 + x, 31 + y, 1, 1);
        g2d.fillRect(122 + x, 31 + y, 1, 1);
        g2d.fillRect(122 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(96 + x, 16 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 7 + y, 1, 1);
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 1);
        g2d.fillRect(122 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(126 + x, 14 + y, 1, 1);
        g2d.fillRect(130 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 24 + y, 1, 1);
        g2d.fillRect(132 + x, 25 + y, 1, 1);
        g2d.fillRect(123 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 14 + y, 2, 1);
        g2d.fillRect(95 + x, 14 + y, 2, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(94 + x, 15 + y, 1, 2);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(93 + x, 17 + y, 1, 2);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(94 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 2);
        g2d.fillRect(94 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(107 + x, 7 + y, 1, 1);
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(111 + x, 9 + y, 2, 1);
        g2d.fillRect(113 + x, 10 + y, 1, 1);
        g2d.fillRect(123 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 2, 1);
        g2d.fillRect(125 + x, 14 + y, 1, 1);
        g2d.fillRect(127 + x, 15 + y, 2, 1);
        g2d.fillRect(129 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 2, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 2, 1);
        g2d.fillRect(130 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 2, 1);
        g2d.fillRect(106 + x, 18 + y, 2, 1);
        g2d.fillRect(131 + x, 19 + y, 1, 3);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 2);
        g2d.fillRect(132 + x, 22 + y, 1, 2);
        g2d.fillRect(121 + x, 22 + y, 1, 1);
        g2d.fillRect(131 + x, 23 + y, 1, 5);
        g2d.fillRect(130 + x, 27 + y, 1, 3);
        g2d.fillRect(121 + x, 27 + y, 1, 1);
        g2d.fillRect(128 + x, 29 + y, 2, 1);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(127 + x, 30 + y, 1, 1);
        g2d.fillRect(122 + x, 30 + y, 1, 1);
        g2d.fillRect(126 + x, 31 + y, 1, 1);
        g2d.fillRect(124 + x, 31 + y, 1, 2);
        g2d.fillRect(123 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(114 + x, 12 + y, 1, 2);
        g2d.fillRect(122 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(126 + x, 15 + y, 1, 2);
        g2d.fillRect(123 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(128 + x, 16 + y, 1, 1);
        g2d.fillRect(122 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(129 + x, 17 + y, 1, 1);
        g2d.fillRect(125 + x, 17 + y, 1, 1);
        g2d.fillRect(128 + x, 18 + y, 1, 1);
        g2d.fillRect(124 + x, 18 + y, 1, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(130 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(129 + x, 20 + y, 1, 1);
        g2d.fillRect(126 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 20 + y, 1, 1);
        g2d.fillRect(130 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 1);
        g2d.fillRect(129 + x, 22 + y, 1, 1);
        g2d.fillRect(126 + x, 22 + y, 1, 1);
        g2d.fillRect(130 + x, 23 + y, 1, 1);
        g2d.fillRect(123 + x, 23 + y, 1, 1);
        g2d.fillRect(129 + x, 24 + y, 1, 1);
        g2d.fillRect(127 + x, 25 + y, 1, 1);
        g2d.fillRect(123 + x, 25 + y, 1, 2);
        g2d.fillRect(130 + x, 26 + y, 1, 1);
        g2d.fillRect(126 + x, 26 + y, 1, 1);
        g2d.fillRect(129 + x, 27 + y, 1, 1);
        g2d.fillRect(122 + x, 27 + y, 1, 1);
        g2d.fillRect(128 + x, 28 + y, 1, 1);
        g2d.fillRect(126 + x, 28 + y, 1, 1);
        g2d.fillRect(124 + x, 28 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(107 + x, 8 + y, 1, 10);
        g2d.fillRect(106 + x, 8 + y, 1, 10);
        g2d.fillRect(105 + x, 8 + y, 1, 12);
        g2d.fillRect(104 + x, 8 + y, 1, 8);
        g2d.fillRect(103 + x, 8 + y, 1, 13);
        g2d.fillRect(110 + x, 9 + y, 1, 8);
        g2d.fillRect(109 + x, 9 + y, 1, 8);
        g2d.fillRect(108 + x, 9 + y, 1, 9);
        g2d.fillRect(102 + x, 9 + y, 1, 7);
        g2d.fillRect(101 + x, 9 + y, 1, 8);
        g2d.fillRect(112 + x, 10 + y, 1, 6);
        g2d.fillRect(111 + x, 10 + y, 1, 5);
        g2d.fillRect(100 + x, 10 + y, 1, 5);
        g2d.fillRect(99 + x, 10 + y, 1, 4);
        g2d.fillRect(113 + x, 11 + y, 1, 3);
        g2d.fillRect(98 + x, 11 + y, 1, 3);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(97 + x, 13 + y, 1, 2);
        g2d.fillRect(123 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 7);
        g2d.fillRect(119 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(125 + x, 15 + y, 1, 2);
        g2d.fillRect(124 + x, 15 + y, 1, 3);
        g2d.fillRect(122 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 15 + y, 1, 4);
        g2d.fillRect(118 + x, 15 + y, 1, 3);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(127 + x, 16 + y, 1, 9);
        g2d.fillRect(123 + x, 16 + y, 1, 7);
        g2d.fillRect(128 + x, 17 + y, 1, 1);
        g2d.fillRect(126 + x, 17 + y, 1, 3);
        g2d.fillRect(122 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 4);
        g2d.fillRect(102 + x, 17 + y, 1, 4);
        g2d.fillRect(129 + x, 18 + y, 1, 2);
        g2d.fillRect(125 + x, 18 + y, 1, 13);
        g2d.fillRect(101 + x, 18 + y, 1, 4);
        g2d.fillRect(100 + x, 18 + y, 1, 4);
        g2d.fillRect(128 + x, 19 + y, 1, 9);
        g2d.fillRect(124 + x, 19 + y, 1, 9);
        g2d.fillRect(122 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 3);
        g2d.fillRect(130 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 2);
        g2d.fillRect(97 + x, 20 + y, 1, 2);
        g2d.fillRect(96 + x, 20 + y, 1, 2);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(94 + x, 20 + y, 1, 2);
        g2d.fillRect(129 + x, 21 + y, 1, 1);
        g2d.fillRect(126 + x, 21 + y, 1, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 6);
        g2d.fillRect(92 + x, 21 + y, 2, 1);
        g2d.fillRect(130 + x, 22 + y, 1, 1);
        g2d.fillRect(89 + x, 22 + y, 3, 1);
        g2d.fillRect(129 + x, 23 + y, 1, 1);
        g2d.fillRect(126 + x, 23 + y, 1, 3);
        g2d.fillRect(87 + x, 23 + y, 2, 1);
        g2d.fillRect(130 + x, 24 + y, 1, 2);
        g2d.fillRect(123 + x, 24 + y, 1, 1);
        g2d.fillRect(86 + x, 24 + y, 1, 1);
        g2d.fillRect(129 + x, 25 + y, 1, 2);
        g2d.fillRect(127 + x, 26 + y, 1, 4);
        g2d.fillRect(126 + x, 27 + y, 1, 1);
        g2d.fillRect(123 + x, 27 + y, 1, 2);
        g2d.fillRect(129 + x, 28 + y, 1, 1);
        g2d.fillRect(122 + x, 28 + y, 1, 2);
        g2d.fillRect(126 + x, 29 + y, 1, 2);
        g2d.fillRect(124 + x, 29 + y, 1, 2);
    }
}
