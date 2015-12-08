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
public class H11 extends SuperTL
{
    int direction = 0;
    public H11()
    {
        super();
    }

    public H11(ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 8 + y, 7, 1);
        g2d.fillRect(101 + x, 9 + y, 2, 1);
        g2d.fillRect(110 + x, 9 + y, 3, 1);
        g2d.fillRect(98 + x, 10 + y, 3, 1);
        g2d.fillRect(113 + x, 10 + y, 2, 1);
        g2d.fillRect(97 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 11 + y, 3, 1);
        g2d.fillRect(96 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 2, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 2);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 2);
        g2d.fillRect(93 + x, 15 + y, 1, 2);
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 4);
        g2d.fillRect(104 + x, 17 + y, 4, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 4);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(109 + x, 16 + y, 3, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 3);
        g2d.fillRect(99 + x, 17 + y, 1, 3);
        g2d.fillRect(101 + x, 18 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 3, 1);
        g2d.fillRect(114 + x, 12 + y, 3, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 14 + y, 2, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 15 + y, 1, 3);
        g2d.fillRect(108 + x, 15 + y, 1, 2);
        g2d.fillRect(109 + x, 15 + y, 9, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 2, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 4, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 9 + y, 1, 5);
        g2d.fillRect(104 + x, 9 + y, 1, 5);
        g2d.fillRect(105 + x, 9 + y, 1, 5);
        g2d.fillRect(106 + x, 9 + y, 1, 7);
        g2d.fillRect(107 + x, 9 + y, 1, 7);
        g2d.fillRect(108 + x, 9 + y, 1, 6);
        g2d.fillRect(109 + x, 9 + y, 1, 6);
        g2d.fillRect(101 + x, 10 + y, 1, 5);
        g2d.fillRect(102 + x, 10 + y, 1, 5);
        g2d.fillRect(110 + x, 10 + y, 1, 5);
        g2d.fillRect(111 + x, 10 + y, 1, 5);
        g2d.fillRect(98 + x, 11 + y, 3, 1);
        g2d.fillRect(112 + x, 11 + y, 1, 4);
        g2d.fillRect(97 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 3);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(116 + x, 13 + y, 1, 2);
        g2d.fillRect(95 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 16 + y, 10, 1);
        g2d.fillRect(91 + x, 17 + y, 3, 1);
        g2d.fillRect(108 + x, 17 + y, 4, 1);
        g2d.fillRect(122 + x, 17 + y, 1, 3);
        g2d.fillRect(90 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 4, 1);
        g2d.fillRect(89 + x, 19 + y, 1, 3);
        g2d.fillRect(95 + x, 19 + y, 1, 6);
        g2d.fillRect(100 + x, 19 + y, 4, 1);
        g2d.fillRect(96 + x, 20 + y, 4, 1);
        g2d.fillRect(123 + x, 20 + y, 1, 3);
        g2d.fillRect(113 + x, 21 + y, 7, 1);
        g2d.fillRect(90 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 4, 1);
        g2d.fillRect(120 + x, 22 + y, 2, 1);
        g2d.fillRect(91 + x, 23 + y, 3, 1);
        g2d.fillRect(105 + x, 23 + y, 4, 1);
        g2d.fillRect(122 + x, 23 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 4, 1);
        g2d.fillRect(96 + x, 25 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 3);
        g2d.fillRect(104 + x, 19 + y, 2, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 7, 1);
        g2d.fillRect(90 + x, 21 + y, 1, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 1, 4);
        g2d.fillRect(109 + x, 21 + y, 4, 1);
        g2d.fillRect(120 + x, 21 + y, 2, 1);
        g2d.fillRect(91 + x, 22 + y, 2, 1);
        g2d.fillRect(97 + x, 22 + y, 3, 1);
        g2d.fillRect(105 + x, 22 + y, 4, 1);
        g2d.fillRect(122 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 4, 1);
        g2d.fillRect(97 + x, 24 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(91 + x, 18 + y, 2, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(90 + x, 19 + y, 1, 2);
        g2d.fillRect(93 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 7, 1);
        g2d.fillRect(101 + x, 20 + y, 2, 1);
        g2d.fillRect(109 + x, 20 + y, 4, 1);
        g2d.fillRect(120 + x, 20 + y, 2, 1);
        g2d.fillRect(91 + x, 21 + y, 2, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(105 + x, 21 + y, 4, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 2);
        g2d.fillRect(101 + x, 22 + y, 3, 1);
        g2d.fillRect(97 + x, 23 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(114 + x, 17 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(117 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 17 + y, 1, 2);
        g2d.fillRect(119 + x, 17 + y, 1, 2);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(91 + x, 19 + y, 1, 2);
        g2d.fillRect(92 + x, 19 + y, 1, 2);
        g2d.fillRect(108 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 4, 1);
        g2d.fillRect(122 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 5, 1);
    }





    public void paintBackT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 8 + y, 7, 1);
        g2d.fillRect(113 + x, 9 + y, 2, 1);
        g2d.fillRect(103 + x, 9 + y, 3, 1);
        g2d.fillRect(115 + x, 10 + y, 3, 1);
        g2d.fillRect(101 + x, 10 + y, 2, 1);
        g2d.fillRect(118 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 11 + y, 3, 1);
        g2d.fillRect(119 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 2, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 2);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 2);
        g2d.fillRect(122 + x, 15 + y, 1, 2);
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 4);
        g2d.fillRect(108 + x, 17 + y, 4, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 4);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 3, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 3);
        g2d.fillRect(116 + x, 17 + y, 1, 3);
        g2d.fillRect(112 + x, 18 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 3, 1);
        g2d.fillRect(99 + x, 12 + y, 3, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 2);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 2, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 15 + y, 1, 3);
        g2d.fillRect(107 + x, 15 + y, 1, 2);
        g2d.fillRect(98 + x, 15 + y, 9, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 2, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 4, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 9 + y, 1, 5);
        g2d.fillRect(111 + x, 9 + y, 1, 5);
        g2d.fillRect(110 + x, 9 + y, 1, 5);
        g2d.fillRect(109 + x, 9 + y, 1, 7);
        g2d.fillRect(108 + x, 9 + y, 1, 7);
        g2d.fillRect(107 + x, 9 + y, 1, 6);
        g2d.fillRect(106 + x, 9 + y, 1, 6);
        g2d.fillRect(114 + x, 10 + y, 1, 5);
        g2d.fillRect(113 + x, 10 + y, 1, 5);
        g2d.fillRect(105 + x, 10 + y, 1, 5);
        g2d.fillRect(104 + x, 10 + y, 1, 5);
        g2d.fillRect(115 + x, 11 + y, 3, 1);
        g2d.fillRect(103 + x, 11 + y, 1, 4);
        g2d.fillRect(118 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 3);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(99 + x, 13 + y, 1, 2);
        g2d.fillRect(120 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 16 + y, 10, 1);
        g2d.fillRect(122 + x, 17 + y, 3, 1);
        g2d.fillRect(104 + x, 17 + y, 4, 1);
        g2d.fillRect(93 + x, 17 + y, 1, 3);
        g2d.fillRect(125 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 4, 1);
        g2d.fillRect(126 + x, 19 + y, 1, 3);
        g2d.fillRect(120 + x, 19 + y, 1, 6);
        g2d.fillRect(112 + x, 19 + y, 4, 1);
        g2d.fillRect(116 + x, 20 + y, 4, 1);
        g2d.fillRect(92 + x, 20 + y, 1, 3);
        g2d.fillRect(96 + x, 21 + y, 7, 1);
        g2d.fillRect(125 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 4, 1);
        g2d.fillRect(94 + x, 22 + y, 2, 1);
        g2d.fillRect(122 + x, 23 + y, 3, 1);
        g2d.fillRect(107 + x, 23 + y, 4, 1);
        g2d.fillRect(93 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 4, 1);
        g2d.fillRect(115 + x, 25 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 3);
        g2d.fillRect(110 + x, 19 + y, 2, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 7, 1);
        g2d.fillRect(125 + x, 21 + y, 1, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 2);
        g2d.fillRect(119 + x, 21 + y, 1, 4);
        g2d.fillRect(103 + x, 21 + y, 4, 1);
        g2d.fillRect(94 + x, 21 + y, 2, 1);
        g2d.fillRect(123 + x, 22 + y, 2, 1);
        g2d.fillRect(116 + x, 22 + y, 3, 1);
        g2d.fillRect(107 + x, 22 + y, 4, 1);
        g2d.fillRect(93 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 4, 1);
        g2d.fillRect(115 + x, 24 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(123 + x, 18 + y, 2, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(125 + x, 19 + y, 1, 2);
        g2d.fillRect(122 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 7, 1);
        g2d.fillRect(113 + x, 20 + y, 2, 1);
        g2d.fillRect(103 + x, 20 + y, 4, 1);
        g2d.fillRect(94 + x, 20 + y, 2, 1);
        g2d.fillRect(123 + x, 21 + y, 2, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(107 + x, 21 + y, 4, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 3, 1);
        g2d.fillRect(116 + x, 23 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 17 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 2);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 2);
        g2d.fillRect(124 + x, 19 + y, 1, 2);
        g2d.fillRect(123 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 4, 1);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 5, 1);
    }
}
