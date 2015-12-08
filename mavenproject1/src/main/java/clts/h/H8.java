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
public class H8 extends SuperTL
{
    int direction = 0;
    public H8()
    {
        super();
    }

    public H8(ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(104 + x, 10 + y, 7, 1);
        g2d.fillRect(116 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 4);
        g2d.fillRect(102 + x, 11 + y, 2, 1);
        g2d.fillRect(117 + x, 11 + y, 3, 1);
        g2d.fillRect(119 + x, 12 + y, 1, 4);
        g2d.fillRect(104 + x, 14 + y, 8, 1);
        g2d.fillRect(115 + x, 14 + y, 2, 1);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(117 + x, 15 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 11 + y, 1, 3);
        g2d.fillRect(116 + x, 11 + y, 1, 3);
        g2d.fillRect(102 + x, 12 + y, 1, 3);
        g2d.fillRect(103 + x, 12 + y, 1, 3);
        g2d.fillRect(117 + x, 12 + y, 1, 3);
        g2d.fillRect(118 + x, 12 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 0 + y, 11, 1);
        g2d.fillRect(114 + x, 0 + y, 5, 1);
        g2d.fillRect(99 + x, 1 + y, 3, 1);
        g2d.fillRect(119 + x, 1 + y, 3, 1);
        g2d.fillRect(98 + x, 2 + y, 1, 3);
        g2d.fillRect(102 + x, 2 + y, 17, 1);
        g2d.fillRect(122 + x, 2 + y, 1, 3);
        g2d.fillRect(99 + x, 5 + y, 1, 3);
        g2d.fillRect(121 + x, 5 + y, 1, 3);
        g2d.fillRect(100 + x, 8 + y, 1, 3);
        g2d.fillRect(120 + x, 8 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 13, 1);
        g2d.fillRect(100 + x, 16 + y, 2, 1);
        g2d.fillRect(117 + x, 16 + y, 4, 1);
        g2d.fillRect(98 + x, 17 + y, 2, 1);
        g2d.fillRect(121 + x, 17 + y, 2, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 9, 1);
        g2d.fillRect(123 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 2, 1);
        g2d.fillRect(103 + x, 19 + y, 3, 1);
        g2d.fillRect(115 + x, 19 + y, 3, 1);
        g2d.fillRect(124 + x, 19 + y, 2, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 3);
        g2d.fillRect(101 + x, 20 + y, 2, 1);
        g2d.fillRect(118 + x, 20 + y, 2, 1);
        g2d.fillRect(126 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 3, 1);
        g2d.fillRect(120 + x, 21 + y, 3, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 2, 1);
        g2d.fillRect(123 + x, 22 + y, 3, 1);
        g2d.fillRect(125 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(123 + x, 24 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 0 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 11 + y, 1, 3);
        g2d.fillRect(106 + x, 11 + y, 1, 3);
        g2d.fillRect(107 + x, 11 + y, 1, 3);
        g2d.fillRect(108 + x, 11 + y, 1, 3);
        g2d.fillRect(109 + x, 11 + y, 1, 3);
        g2d.fillRect(110 + x, 11 + y, 1, 3);
        g2d.fillRect(112 + x, 11 + y, 1, 2);
        g2d.fillRect(113 + x, 11 + y, 1, 2);
        g2d.fillRect(114 + x, 11 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 1 + y, 2, 1);
        g2d.fillRect(117 + x, 1 + y, 2, 1);
        g2d.fillRect(99 + x, 2 + y, 1, 3);
        g2d.fillRect(101 + x, 2 + y, 1, 1);
        g2d.fillRect(119 + x, 2 + y, 1, 1);
        g2d.fillRect(121 + x, 2 + y, 1, 3);
        g2d.fillRect(102 + x, 3 + y, 17, 1);
        g2d.fillRect(100 + x, 5 + y, 1, 3);
        g2d.fillRect(120 + x, 5 + y, 1, 3);
        g2d.fillRect(101 + x, 8 + y, 1, 3);
        g2d.fillRect(119 + x, 8 + y, 1, 3);
        g2d.fillRect(104 + x, 9 + y, 8, 1);
        g2d.fillRect(115 + x, 9 + y, 2, 1);
        g2d.fillRect(102 + x, 10 + y, 2, 1);
        g2d.fillRect(117 + x, 10 + y, 2, 1);
        g2d.fillRect(102 + x, 16 + y, 15, 1);
        g2d.fillRect(100 + x, 17 + y, 2, 1);
        g2d.fillRect(117 + x, 17 + y, 4, 1);
        g2d.fillRect(98 + x, 18 + y, 2, 1);
        g2d.fillRect(121 + x, 18 + y, 2, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 3, 1);
        g2d.fillRect(120 + x, 20 + y, 3, 1);
        g2d.fillRect(125 + x, 20 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 2, 1);
        g2d.fillRect(123 + x, 21 + y, 2, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(123 + x, 23 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 1 + y, 2, 1);
        g2d.fillRect(115 + x, 1 + y, 2, 1);
        g2d.fillRect(100 + x, 2 + y, 1, 3);
        g2d.fillRect(120 + x, 2 + y, 1, 3);
        g2d.fillRect(101 + x, 3 + y, 1, 1);
        g2d.fillRect(119 + x, 3 + y, 1, 1);
        g2d.fillRect(101 + x, 5 + y, 1, 3);
        g2d.fillRect(102 + x, 5 + y, 1, 5);
        g2d.fillRect(118 + x, 5 + y, 1, 5);
        g2d.fillRect(119 + x, 5 + y, 1, 3);
        g2d.fillRect(103 + x, 8 + y, 1, 2);
        g2d.fillRect(117 + x, 8 + y, 1, 2);
        g2d.fillRect(100 + x, 18 + y, 2, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 2, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(123 + x, 20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 1 + y, 1, 1);
        g2d.fillRect(114 + x, 1 + y, 1, 1);
        g2d.fillRect(101 + x, 4 + y, 4, 1);
        g2d.fillRect(116 + x, 4 + y, 1, 5);
        g2d.fillRect(117 + x, 4 + y, 1, 4);
        g2d.fillRect(118 + x, 4 + y, 2, 1);
        g2d.fillRect(103 + x, 5 + y, 1, 3);
        g2d.fillRect(104 + x, 5 + y, 1, 4);
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(115 + x, 8 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(116 + x, 18 + y, 3, 1);
        g2d.fillRect(99 + x, 19 + y, 3, 1);
        g2d.fillRect(118 + x, 19 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 1 + y, 6, 1);
        g2d.fillRect(105 + x, 4 + y, 1, 4);
        g2d.fillRect(106 + x, 4 + y, 1, 5);
        g2d.fillRect(107 + x, 4 + y, 1, 5);
        g2d.fillRect(108 + x, 4 + y, 1, 5);
        g2d.fillRect(109 + x, 4 + y, 1, 5);
        g2d.fillRect(110 + x, 4 + y, 1, 5);
        g2d.fillRect(111 + x, 4 + y, 1, 5);
        g2d.fillRect(112 + x, 4 + y, 1, 5);
        g2d.fillRect(113 + x, 4 + y, 1, 5);
        g2d.fillRect(114 + x, 4 + y, 1, 5);
        g2d.fillRect(115 + x, 4 + y, 1, 4);
        g2d.fillRect(102 + x, 17 + y, 15, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(114 + x, 9 + y, 1, 1);
        g2d.fillRect(115 + x, 10 + y, 1, 2);
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(112 + x, 9 + y, 1, 2);
        g2d.fillRect(113 + x, 9 + y, 1, 2);
        g2d.fillRect(111 + x, 10 + y, 1, 2);
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 3, 1);
        g2d.fillRect(113 + x, 14 + y, 2, 1);
    }





    public void paintBackT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(105 + x, 10 + y, 7, 1);
        g2d.fillRect(99 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 4);
        g2d.fillRect(112 + x, 11 + y, 2, 1);
        g2d.fillRect(96 + x, 11 + y, 3, 1);
        g2d.fillRect(96 + x, 12 + y, 1, 4);
        g2d.fillRect(104 + x, 14 + y, 8, 1);
        g2d.fillRect(99 + x, 14 + y, 2, 1);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 15 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(111 + x, 11 + y, 1, 3);
        g2d.fillRect(99 + x, 11 + y, 1, 3);
        g2d.fillRect(113 + x, 12 + y, 1, 3);
        g2d.fillRect(112 + x, 12 + y, 1, 3);
        g2d.fillRect(98 + x, 12 + y, 1, 3);
        g2d.fillRect(97 + x, 12 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 0 + y, 11, 1);
        g2d.fillRect(97 + x, 0 + y, 5, 1);
        g2d.fillRect(114 + x, 1 + y, 3, 1);
        g2d.fillRect(94 + x, 1 + y, 3, 1);
        g2d.fillRect(117 + x, 2 + y, 1, 3);
        g2d.fillRect(97 + x, 2 + y, 17, 1);
        g2d.fillRect(93 + x, 2 + y, 1, 3);
        g2d.fillRect(116 + x, 5 + y, 1, 3);
        g2d.fillRect(94 + x, 5 + y, 1, 3);
        g2d.fillRect(115 + x, 8 + y, 1, 3);
        g2d.fillRect(95 + x, 8 + y, 1, 3);
        g2d.fillRect(99 + x, 15 + y, 13, 1);
        g2d.fillRect(114 + x, 16 + y, 2, 1);
        g2d.fillRect(95 + x, 16 + y, 4, 1);
        g2d.fillRect(116 + x, 17 + y, 2, 1);
        g2d.fillRect(93 + x, 17 + y, 2, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 9, 1);
        g2d.fillRect(92 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 2, 1);
        g2d.fillRect(110 + x, 19 + y, 3, 1);
        g2d.fillRect(98 + x, 19 + y, 3, 1);
        g2d.fillRect(90 + x, 19 + y, 2, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 3);
        g2d.fillRect(113 + x, 20 + y, 2, 1);
        g2d.fillRect(96 + x, 20 + y, 2, 1);
        g2d.fillRect(89 + x, 20 + y, 1, 2);
        g2d.fillRect(115 + x, 21 + y, 3, 1);
        g2d.fillRect(93 + x, 21 + y, 3, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 2, 1);
        g2d.fillRect(90 + x, 22 + y, 3, 1);
        g2d.fillRect(90 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(91 + x, 24 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 0 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 11 + y, 1, 3);
        g2d.fillRect(109 + x, 11 + y, 1, 3);
        g2d.fillRect(108 + x, 11 + y, 1, 3);
        g2d.fillRect(107 + x, 11 + y, 1, 3);
        g2d.fillRect(106 + x, 11 + y, 1, 3);
        g2d.fillRect(105 + x, 11 + y, 1, 3);
        g2d.fillRect(103 + x, 11 + y, 1, 2);
        g2d.fillRect(102 + x, 11 + y, 1, 2);
        g2d.fillRect(101 + x, 11 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 1 + y, 2, 1);
        g2d.fillRect(97 + x, 1 + y, 2, 1);
        g2d.fillRect(116 + x, 2 + y, 1, 3);
        g2d.fillRect(114 + x, 2 + y, 1, 1);
        g2d.fillRect(96 + x, 2 + y, 1, 1);
        g2d.fillRect(94 + x, 2 + y, 1, 3);
        g2d.fillRect(97 + x, 3 + y, 17, 1);
        g2d.fillRect(115 + x, 5 + y, 1, 3);
        g2d.fillRect(95 + x, 5 + y, 1, 3);
        g2d.fillRect(114 + x, 8 + y, 1, 3);
        g2d.fillRect(96 + x, 8 + y, 1, 3);
        g2d.fillRect(104 + x, 9 + y, 8, 1);
        g2d.fillRect(99 + x, 9 + y, 2, 1);
        g2d.fillRect(112 + x, 10 + y, 2, 1);
        g2d.fillRect(97 + x, 10 + y, 2, 1);
        g2d.fillRect(99 + x, 16 + y, 15, 1);
        g2d.fillRect(114 + x, 17 + y, 2, 1);
        g2d.fillRect(95 + x, 17 + y, 4, 1);
        g2d.fillRect(116 + x, 18 + y, 2, 1);
        g2d.fillRect(93 + x, 18 + y, 2, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 2);
        g2d.fillRect(115 + x, 20 + y, 3, 1);
        g2d.fillRect(93 + x, 20 + y, 3, 1);
        g2d.fillRect(90 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 21 + y, 2, 1);
        g2d.fillRect(91 + x, 21 + y, 2, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(91 + x, 23 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 1 + y, 2, 1);
        g2d.fillRect(99 + x, 1 + y, 2, 1);
        g2d.fillRect(115 + x, 2 + y, 1, 3);
        g2d.fillRect(95 + x, 2 + y, 1, 3);
        g2d.fillRect(114 + x, 3 + y, 1, 1);
        g2d.fillRect(96 + x, 3 + y, 1, 1);
        g2d.fillRect(114 + x, 5 + y, 1, 3);
        g2d.fillRect(113 + x, 5 + y, 1, 5);
        g2d.fillRect(97 + x, 5 + y, 1, 5);
        g2d.fillRect(96 + x, 5 + y, 1, 3);
        g2d.fillRect(112 + x, 8 + y, 1, 2);
        g2d.fillRect(98 + x, 8 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 2, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 2, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(92 + x, 19 + y, 2, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(91 + x, 20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 1 + y, 1, 1);
        g2d.fillRect(101 + x, 1 + y, 1, 1);
        g2d.fillRect(111 + x, 4 + y, 4, 1);
        g2d.fillRect(99 + x, 4 + y, 1, 5);
        g2d.fillRect(98 + x, 4 + y, 1, 4);
        g2d.fillRect(96 + x, 4 + y, 2, 1);
        g2d.fillRect(112 + x, 5 + y, 1, 3);
        g2d.fillRect(111 + x, 5 + y, 1, 4);
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(100 + x, 8 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 18 + y, 2, 1);
        g2d.fillRect(97 + x, 18 + y, 3, 1);
        g2d.fillRect(114 + x, 19 + y, 3, 1);
        g2d.fillRect(94 + x, 19 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 1 + y, 6, 1);
        g2d.fillRect(110 + x, 4 + y, 1, 4);
        g2d.fillRect(109 + x, 4 + y, 1, 5);
        g2d.fillRect(108 + x, 4 + y, 1, 5);
        g2d.fillRect(107 + x, 4 + y, 1, 5);
        g2d.fillRect(106 + x, 4 + y, 1, 5);
        g2d.fillRect(105 + x, 4 + y, 1, 5);
        g2d.fillRect(104 + x, 4 + y, 1, 5);
        g2d.fillRect(103 + x, 4 + y, 1, 5);
        g2d.fillRect(102 + x, 4 + y, 1, 5);
        g2d.fillRect(101 + x, 4 + y, 1, 5);
        g2d.fillRect(100 + x, 4 + y, 1, 4);
        g2d.fillRect(99 + x, 17 + y, 15, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 9 + y, 1, 1);
        g2d.fillRect(100 + x, 10 + y, 1, 2);
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(103 + x, 9 + y, 1, 2);
        g2d.fillRect(102 + x, 9 + y, 1, 2);
        g2d.fillRect(104 + x, 10 + y, 1, 2);
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 3, 1);
        g2d.fillRect(101 + x, 14 + y, 2, 1);
    }
}
