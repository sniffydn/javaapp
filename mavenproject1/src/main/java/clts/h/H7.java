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
public class H7 extends SuperTL
{
    int direction = 0;
    public H7()
    {
        super();
    }

    public H7(ColorArray colorSwitch)
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
            paintT(offsetX + 2, -3,g2d);
        else
            paintBackT(offsetX - 2, -3,g2d);
    }

    public void paintT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(101 + x, 0 + y, 4, 1);
        g2d.fillRect(99 + x, 1 + y, 2, 1);
        g2d.fillRect(105 + x, 1 + y, 2, 1);
        g2d.fillRect(109 + x, 1 + y, 5, 1);
        g2d.fillRect(96 + x, 2 + y, 3, 1);
        g2d.fillRect(107 + x, 2 + y, 2, 1);
        g2d.fillRect(114 + x, 2 + y, 1, 1);
        g2d.fillRect(95 + x, 3 + y, 1, 1);
        g2d.fillRect(115 + x, 3 + y, 1, 1);
        g2d.fillRect(94 + x, 4 + y, 1, 1);
        g2d.fillRect(116 + x, 4 + y, 1, 2);
        g2d.fillRect(93 + x, 5 + y, 1, 1);
        g2d.fillRect(91 + x, 6 + y, 2, 1);
        g2d.fillRect(117 + x, 6 + y, 3, 1);
        g2d.fillRect(90 + x, 7 + y, 1, 1);
        g2d.fillRect(120 + x, 7 + y, 2, 1);
        g2d.fillRect(89 + x, 8 + y, 1, 1);
        g2d.fillRect(122 + x, 8 + y, 1, 2);
        g2d.fillRect(88 + x, 9 + y, 1, 1);
        g2d.fillRect(87 + x, 10 + y, 1, 3);
        g2d.fillRect(123 + x, 10 + y, 1, 2);
        g2d.fillRect(122 + x, 12 + y, 1, 3);
        g2d.fillRect(88 + x, 13 + y, 1, 3);
        g2d.fillRect(108 + x, 13 + y, 5, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 2, 1);
        g2d.fillRect(113 + x, 14 + y, 2, 1);
        g2d.fillRect(93 + x, 15 + y, 1, 10);
        g2d.fillRect(95 + x, 15 + y, 3, 1);
        g2d.fillRect(103 + x, 15 + y, 3, 1);
        g2d.fillRect(115 + x, 15 + y, 3, 1);
        g2d.fillRect(121 + x, 15 + y, 1, 2);
        g2d.fillRect(89 + x, 16 + y, 2, 1);
        g2d.fillRect(98 + x, 16 + y, 5, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 3);
        g2d.fillRect(91 + x, 17 + y, 2, 1);
        g2d.fillRect(119 + x, 17 + y, 2, 1);
        g2d.fillRect(107 + x, 19 + y, 7, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 6);
        g2d.fillRect(105 + x, 20 + y, 2, 1);
        g2d.fillRect(114 + x, 20 + y, 2, 1);
        g2d.fillRect(103 + x, 21 + y, 2, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 3, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 2);
        g2d.fillRect(98 + x, 23 + y, 2, 1);
        g2d.fillRect(96 + x, 24 + y, 2, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 25 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(91 + x, 9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(92 + x, 7 + y, 1, 1);
        g2d.fillRect(91 + x, 10 + y, 1, 1);
        g2d.fillRect(92 + x, 11 + y, 1, 2);
        g2d.fillRect(111 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 4 + y, 1, 1);
        g2d.fillRect(117 + x, 7 + y, 1, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 1);
        g2d.fillRect(91 + x, 14 + y, 1, 1);
        g2d.fillRect(92 + x, 15 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(92 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(93 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 3 + y, 1, 1);
        g2d.fillRect(93 + x, 6 + y, 1, 1);
        g2d.fillRect(118 + x, 9 + y, 1, 1);
        g2d.fillRect(117 + x, 11 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(92 + x, 13 + y, 2, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 2);
        g2d.fillRect(94 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 5, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(91 + x, 7 + y, 1, 2);
        g2d.fillRect(117 + x, 8 + y, 1, 2);
        g2d.fillRect(118 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 3, 1);
        g2d.fillRect(103 + x, 14 + y, 3, 1);
        g2d.fillRect(115 + x, 14 + y, 2, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 2);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 8);
        g2d.fillRect(96 + x, 18 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 1, 6);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 5 + y, 1, 1);
        g2d.fillRect(110 + x, 5 + y, 1, 1);
        g2d.fillRect(93 + x, 7 + y, 1, 1);
        g2d.fillRect(92 + x, 10 + y, 1, 1);
        g2d.fillRect(91 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 2, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 3);
        g2d.fillRect(118 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(92 + x, 9 + y, 2, 1);
        g2d.fillRect(93 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(93 + x, 12 + y, 1, 1);
        g2d.fillRect(94 + x, 13 + y, 2, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 2 + y, 1, 1);
        g2d.fillRect(113 + x, 2 + y, 1, 1);
        g2d.fillRect(110 + x, 3 + y, 1, 1);
        g2d.fillRect(116 + x, 7 + y, 1, 1);
        g2d.fillRect(121 + x, 8 + y, 1, 1);
        g2d.fillRect(116 + x, 10 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 3 + y, 1, 1);
        g2d.fillRect(94 + x, 7 + y, 1, 1);
        g2d.fillRect(93 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 10 + y, 2, 1);
        g2d.fillRect(93 + x, 11 + y, 1, 1);
        g2d.fillRect(96 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(92 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 4, 1);
        g2d.fillRect(89 + x, 15 + y, 1, 1);
        g2d.fillRect(91 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(95 + x, 4 + y, 1, 4);
        g2d.fillRect(94 + x, 6 + y, 1, 1);
        g2d.fillRect(94 + x, 8 + y, 1, 4);
        g2d.fillRect(112 + x, 10 + y, 1, 1);
        g2d.fillRect(95 + x, 11 + y, 1, 2);
        g2d.fillRect(96 + x, 12 + y, 1, 2);
        g2d.fillRect(106 + x, 12 + y, 1, 2);
        g2d.fillRect(116 + x, 12 + y, 1, 2);
        g2d.fillRect(117 + x, 12 + y, 1, 2);
        g2d.fillRect(91 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(91 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 3 + y, 1, 2);
        g2d.fillRect(96 + x, 5 + y, 1, 2);
        g2d.fillRect(116 + x, 6 + y, 1, 1);
        g2d.fillRect(118 + x, 7 + y, 2, 1);
        g2d.fillRect(95 + x, 8 + y, 1, 3);
        g2d.fillRect(96 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 9 + y, 3, 1);
        g2d.fillRect(96 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(97 + x, 11 + y, 2, 1);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(88 + x, 12 + y, 1, 1);
        g2d.fillRect(90 + x, 12 + y, 1, 4);
        g2d.fillRect(98 + x, 12 + y, 2, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(89 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 1 + y, 1, 1);
        g2d.fillRect(99 + x, 2 + y, 1, 1);
        g2d.fillRect(98 + x, 3 + y, 1, 1);
        g2d.fillRect(96 + x, 4 + y, 1, 1);
        g2d.fillRect(97 + x, 5 + y, 1, 2);
        g2d.fillRect(96 + x, 7 + y, 1, 1);
        g2d.fillRect(96 + x, 9 + y, 1, 1);
        g2d.fillRect(88 + x, 10 + y, 1, 1);
        g2d.fillRect(97 + x, 10 + y, 1, 1);
        g2d.fillRect(118 + x, 10 + y, 1, 3);
        g2d.fillRect(122 + x, 10 + y, 1, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(89 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 3, 1);
        g2d.fillRect(121 + x, 13 + y, 1, 1);
        g2d.fillRect(89 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 3, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(100 + x, 18 + y, 1, 3);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 3);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 4 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(92 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 1 + y, 1, 2);
        g2d.fillRect(100 + x, 2 + y, 2, 1);
        g2d.fillRect(104 + x, 2 + y, 1, 1);
        g2d.fillRect(99 + x, 3 + y, 1, 1);
        g2d.fillRect(98 + x, 4 + y, 1, 3);
        g2d.fillRect(115 + x, 4 + y, 1, 1);
        g2d.fillRect(112 + x, 6 + y, 1, 2);
        g2d.fillRect(97 + x, 7 + y, 1, 3);
        g2d.fillRect(111 + x, 8 + y, 1, 1);
        g2d.fillRect(90 + x, 9 + y, 1, 1);
        g2d.fillRect(113 + x, 9 + y, 1, 2);
        g2d.fillRect(119 + x, 9 + y, 1, 1);
        g2d.fillRect(98 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 2);
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 17 + y, 3, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 1 + y, 1, 1);
        g2d.fillRect(112 + x, 2 + y, 1, 1);
        g2d.fillRect(111 + x, 3 + y, 1, 1);
        g2d.fillRect(114 + x, 3 + y, 1, 1);
        g2d.fillRect(90 + x, 8 + y, 1, 1);
        g2d.fillRect(98 + x, 8 + y, 1, 1);
        g2d.fillRect(112 + x, 8 + y, 1, 1);
        g2d.fillRect(119 + x, 8 + y, 1, 1);
        g2d.fillRect(109 + x, 9 + y, 1, 1);
        g2d.fillRect(90 + x, 10 + y, 1, 2);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 10 + y, 1, 2);
        g2d.fillRect(119 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(121 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 2, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 1 + y, 1, 1);
        g2d.fillRect(111 + x, 2 + y, 1, 1);
        g2d.fillRect(100 + x, 3 + y, 2, 1);
        g2d.fillRect(103 + x, 3 + y, 1, 1);
        g2d.fillRect(99 + x, 4 + y, 1, 2);
        g2d.fillRect(112 + x, 4 + y, 1, 1);
        g2d.fillRect(111 + x, 6 + y, 1, 1);
        g2d.fillRect(99 + x, 7 + y, 1, 1);
        g2d.fillRect(110 + x, 7 + y, 1, 1);
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(115 + x, 8 + y, 1, 1);
        g2d.fillRect(120 + x, 8 + y, 1, 1);
        g2d.fillRect(98 + x, 9 + y, 2, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 1);
        g2d.fillRect(99 + x, 10 + y, 1, 1);
        g2d.fillRect(105 + x, 10 + y, 2, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 2 + y, 1, 1);
        g2d.fillRect(106 + x, 2 + y, 1, 1);
        g2d.fillRect(102 + x, 3 + y, 1, 1);
        g2d.fillRect(100 + x, 4 + y, 1, 3);
        g2d.fillRect(101 + x, 4 + y, 1, 1);
        g2d.fillRect(112 + x, 5 + y, 2, 1);
        g2d.fillRect(99 + x, 6 + y, 1, 1);
        g2d.fillRect(109 + x, 6 + y, 1, 1);
        g2d.fillRect(98 + x, 7 + y, 1, 1);
        g2d.fillRect(113 + x, 7 + y, 1, 2);
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(114 + x, 8 + y, 1, 2);
        g2d.fillRect(100 + x, 9 + y, 1, 2);
        g2d.fillRect(106 + x, 9 + y, 1, 1);
        g2d.fillRect(115 + x, 9 + y, 2, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 2);
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(119 + x, 12 + y, 2, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 2 + y, 1, 1);
        g2d.fillRect(112 + x, 3 + y, 1, 1);
        g2d.fillRect(110 + x, 6 + y, 1, 1);
        g2d.fillRect(111 + x, 7 + y, 1, 1);
        g2d.fillRect(99 + x, 8 + y, 1, 1);
        g2d.fillRect(121 + x, 9 + y, 1, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(108 + x, 3 + y, 1, 1);
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(89 + x, 9 + y, 1, 1);
        g2d.fillRect(88 + x, 11 + y, 1, 1);
        g2d.fillRect(122 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 3 + y, 1, 1);
        g2d.fillRect(113 + x, 3 + y, 1, 2);
        g2d.fillRect(109 + x, 4 + y, 1, 1);
        g2d.fillRect(100 + x, 7 + y, 1, 1);
        g2d.fillRect(109 + x, 7 + y, 1, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 1);
        g2d.fillRect(120 + x, 9 + y, 1, 1);
        g2d.fillRect(119 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(105 + x, 2 + y, 1, 1);
        g2d.fillRect(104 + x, 3 + y, 1, 1);
        g2d.fillRect(103 + x, 4 + y, 1, 1);
        g2d.fillRect(115 + x, 5 + y, 1, 1);
        g2d.fillRect(108 + x, 8 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 4, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(105 + x, 3 + y, 1, 7);
        g2d.fillRect(107 + x, 3 + y, 1, 6);
        g2d.fillRect(102 + x, 4 + y, 1, 7);
        g2d.fillRect(104 + x, 4 + y, 1, 7);
        g2d.fillRect(106 + x, 4 + y, 1, 5);
        g2d.fillRect(108 + x, 4 + y, 1, 4);
        g2d.fillRect(114 + x, 4 + y, 1, 4);
        g2d.fillRect(101 + x, 5 + y, 1, 5);
        g2d.fillRect(103 + x, 5 + y, 1, 6);
        g2d.fillRect(109 + x, 5 + y, 1, 1);
        g2d.fillRect(113 + x, 6 + y, 1, 1);
        g2d.fillRect(115 + x, 6 + y, 1, 2);
        g2d.fillRect(100 + x, 8 + y, 1, 1);
        g2d.fillRect(89 + x, 10 + y, 1, 2);
        g2d.fillRect(120 + x, 10 + y, 1, 2);
        g2d.fillRect(121 + x, 10 + y, 1, 2);
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 2, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 2, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 2);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
    }





    public void paintBackT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(111 + x, 0 + y, 4, 1);
        g2d.fillRect(115 + x, 1 + y, 2, 1);
        g2d.fillRect(109 + x, 1 + y, 2, 1);
        g2d.fillRect(102 + x, 1 + y, 5, 1);
        g2d.fillRect(117 + x, 2 + y, 3, 1);
        g2d.fillRect(107 + x, 2 + y, 2, 1);
        g2d.fillRect(101 + x, 2 + y, 1, 1);
        g2d.fillRect(120 + x, 3 + y, 1, 1);
        g2d.fillRect(100 + x, 3 + y, 1, 1);
        g2d.fillRect(121 + x, 4 + y, 1, 1);
        g2d.fillRect(99 + x, 4 + y, 1, 2);
        g2d.fillRect(122 + x, 5 + y, 1, 1);
        g2d.fillRect(123 + x, 6 + y, 2, 1);
        g2d.fillRect(96 + x, 6 + y, 3, 1);
        g2d.fillRect(125 + x, 7 + y, 1, 1);
        g2d.fillRect(94 + x, 7 + y, 2, 1);
        g2d.fillRect(126 + x, 8 + y, 1, 1);
        g2d.fillRect(93 + x, 8 + y, 1, 2);
        g2d.fillRect(127 + x, 9 + y, 1, 1);
        g2d.fillRect(128 + x, 10 + y, 1, 3);
        g2d.fillRect(92 + x, 10 + y, 1, 2);
        g2d.fillRect(93 + x, 12 + y, 1, 3);
        g2d.fillRect(127 + x, 13 + y, 1, 3);
        g2d.fillRect(103 + x, 13 + y, 5, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 2, 1);
        g2d.fillRect(101 + x, 14 + y, 2, 1);
        g2d.fillRect(122 + x, 15 + y, 1, 10);
        g2d.fillRect(118 + x, 15 + y, 3, 1);
        g2d.fillRect(110 + x, 15 + y, 3, 1);
        g2d.fillRect(98 + x, 15 + y, 3, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 2);
        g2d.fillRect(125 + x, 16 + y, 2, 1);
        g2d.fillRect(113 + x, 16 + y, 5, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 3);
        g2d.fillRect(123 + x, 17 + y, 2, 1);
        g2d.fillRect(95 + x, 17 + y, 2, 1);
        g2d.fillRect(102 + x, 19 + y, 7, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 6);
        g2d.fillRect(109 + x, 20 + y, 2, 1);
        g2d.fillRect(100 + x, 20 + y, 2, 1);
        g2d.fillRect(111 + x, 21 + y, 2, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 3, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 2);
        g2d.fillRect(116 + x, 23 + y, 2, 1);
        g2d.fillRect(118 + x, 24 + y, 2, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(124 + x, 9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(123 + x, 7 + y, 1, 1);
        g2d.fillRect(124 + x, 10 + y, 1, 1);
        g2d.fillRect(123 + x, 11 + y, 1, 2);
        g2d.fillRect(104 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 4 + y, 1, 1);
        g2d.fillRect(98 + x, 7 + y, 1, 1);
        g2d.fillRect(98 + x, 10 + y, 1, 1);
        g2d.fillRect(124 + x, 14 + y, 1, 1);
        g2d.fillRect(123 + x, 15 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(123 + x, 8 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(122 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 3 + y, 1, 1);
        g2d.fillRect(122 + x, 6 + y, 1, 1);
        g2d.fillRect(97 + x, 9 + y, 1, 1);
        g2d.fillRect(98 + x, 11 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(122 + x, 13 + y, 2, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 2);
        g2d.fillRect(121 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 15 + y, 5, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(124 + x, 7 + y, 1, 2);
        g2d.fillRect(98 + x, 8 + y, 1, 2);
        g2d.fillRect(97 + x, 8 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 3, 1);
        g2d.fillRect(110 + x, 14 + y, 3, 1);
        g2d.fillRect(99 + x, 14 + y, 2, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 2);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 8);
        g2d.fillRect(119 + x, 18 + y, 1, 2);
        g2d.fillRect(120 + x, 19 + y, 1, 6);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 5 + y, 1, 1);
        g2d.fillRect(105 + x, 5 + y, 1, 1);
        g2d.fillRect(122 + x, 7 + y, 1, 1);
        g2d.fillRect(123 + x, 10 + y, 1, 1);
        g2d.fillRect(124 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 2, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 3);
        g2d.fillRect(97 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 9 + y, 2, 1);
        g2d.fillRect(122 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(122 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 2, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 2 + y, 1, 1);
        g2d.fillRect(102 + x, 2 + y, 1, 1);
        g2d.fillRect(105 + x, 3 + y, 1, 1);
        g2d.fillRect(99 + x, 7 + y, 1, 1);
        g2d.fillRect(94 + x, 8 + y, 1, 1);
        g2d.fillRect(99 + x, 10 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 3 + y, 1, 1);
        g2d.fillRect(121 + x, 7 + y, 1, 1);
        g2d.fillRect(122 + x, 8 + y, 1, 1);
        g2d.fillRect(104 + x, 10 + y, 2, 1);
        g2d.fillRect(122 + x, 11 + y, 1, 1);
        g2d.fillRect(119 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 1);
        g2d.fillRect(121 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(123 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 4, 1);
        g2d.fillRect(126 + x, 15 + y, 1, 1);
        g2d.fillRect(124 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(120 + x, 4 + y, 1, 4);
        g2d.fillRect(121 + x, 6 + y, 1, 1);
        g2d.fillRect(121 + x, 8 + y, 1, 4);
        g2d.fillRect(103 + x, 10 + y, 1, 1);
        g2d.fillRect(120 + x, 11 + y, 1, 2);
        g2d.fillRect(119 + x, 12 + y, 1, 2);
        g2d.fillRect(109 + x, 12 + y, 1, 2);
        g2d.fillRect(99 + x, 12 + y, 1, 2);
        g2d.fillRect(98 + x, 12 + y, 1, 2);
        g2d.fillRect(124 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(124 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 3 + y, 1, 2);
        g2d.fillRect(119 + x, 5 + y, 1, 2);
        g2d.fillRect(99 + x, 6 + y, 1, 1);
        g2d.fillRect(96 + x, 7 + y, 2, 1);
        g2d.fillRect(120 + x, 8 + y, 1, 3);
        g2d.fillRect(119 + x, 8 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 3, 1);
        g2d.fillRect(119 + x, 10 + y, 1, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(117 + x, 11 + y, 2, 1);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(127 + x, 12 + y, 1, 1);
        g2d.fillRect(125 + x, 12 + y, 1, 4);
        g2d.fillRect(116 + x, 12 + y, 2, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 2, 1);
        g2d.fillRect(126 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 1 + y, 1, 1);
        g2d.fillRect(116 + x, 2 + y, 1, 1);
        g2d.fillRect(117 + x, 3 + y, 1, 1);
        g2d.fillRect(119 + x, 4 + y, 1, 1);
        g2d.fillRect(118 + x, 5 + y, 1, 2);
        g2d.fillRect(119 + x, 7 + y, 1, 1);
        g2d.fillRect(119 + x, 9 + y, 1, 1);
        g2d.fillRect(127 + x, 10 + y, 1, 1);
        g2d.fillRect(118 + x, 10 + y, 1, 1);
        g2d.fillRect(97 + x, 10 + y, 1, 3);
        g2d.fillRect(93 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(126 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 3, 1);
        g2d.fillRect(94 + x, 13 + y, 1, 1);
        g2d.fillRect(126 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 3, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(115 + x, 18 + y, 1, 3);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 3);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 4 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(123 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 1 + y, 1, 2);
        g2d.fillRect(114 + x, 2 + y, 2, 1);
        g2d.fillRect(111 + x, 2 + y, 1, 1);
        g2d.fillRect(116 + x, 3 + y, 1, 1);
        g2d.fillRect(117 + x, 4 + y, 1, 3);
        g2d.fillRect(100 + x, 4 + y, 1, 1);
        g2d.fillRect(103 + x, 6 + y, 1, 2);
        g2d.fillRect(118 + x, 7 + y, 1, 3);
        g2d.fillRect(104 + x, 8 + y, 1, 1);
        g2d.fillRect(125 + x, 9 + y, 1, 1);
        g2d.fillRect(102 + x, 9 + y, 1, 2);
        g2d.fillRect(96 + x, 9 + y, 1, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 2);
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 2, 1);
        g2d.fillRect(110 + x, 17 + y, 3, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 1 + y, 1, 1);
        g2d.fillRect(103 + x, 2 + y, 1, 1);
        g2d.fillRect(104 + x, 3 + y, 1, 1);
        g2d.fillRect(101 + x, 3 + y, 1, 1);
        g2d.fillRect(125 + x, 8 + y, 1, 1);
        g2d.fillRect(117 + x, 8 + y, 1, 1);
        g2d.fillRect(103 + x, 8 + y, 1, 1);
        g2d.fillRect(96 + x, 8 + y, 1, 1);
        g2d.fillRect(106 + x, 9 + y, 1, 1);
        g2d.fillRect(125 + x, 10 + y, 1, 2);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(100 + x, 10 + y, 1, 2);
        g2d.fillRect(96 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 2, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 1 + y, 1, 1);
        g2d.fillRect(104 + x, 2 + y, 1, 1);
        g2d.fillRect(114 + x, 3 + y, 2, 1);
        g2d.fillRect(112 + x, 3 + y, 1, 1);
        g2d.fillRect(116 + x, 4 + y, 1, 2);
        g2d.fillRect(103 + x, 4 + y, 1, 1);
        g2d.fillRect(104 + x, 6 + y, 1, 1);
        g2d.fillRect(116 + x, 7 + y, 1, 1);
        g2d.fillRect(105 + x, 7 + y, 1, 1);
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(100 + x, 8 + y, 1, 1);
        g2d.fillRect(95 + x, 8 + y, 1, 1);
        g2d.fillRect(116 + x, 9 + y, 2, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 1);
        g2d.fillRect(116 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 2, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(112 + x, 2 + y, 1, 1);
        g2d.fillRect(109 + x, 2 + y, 1, 1);
        g2d.fillRect(113 + x, 3 + y, 1, 1);
        g2d.fillRect(115 + x, 4 + y, 1, 3);
        g2d.fillRect(114 + x, 4 + y, 1, 1);
        g2d.fillRect(102 + x, 5 + y, 2, 1);
        g2d.fillRect(116 + x, 6 + y, 1, 1);
        g2d.fillRect(106 + x, 6 + y, 1, 1);
        g2d.fillRect(117 + x, 7 + y, 1, 1);
        g2d.fillRect(102 + x, 7 + y, 1, 2);
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(101 + x, 8 + y, 1, 2);
        g2d.fillRect(115 + x, 9 + y, 1, 2);
        g2d.fillRect(109 + x, 9 + y, 1, 1);
        g2d.fillRect(99 + x, 9 + y, 2, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 2);
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 2, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(105 + x, 2 + y, 1, 1);
        g2d.fillRect(103 + x, 3 + y, 1, 1);
        g2d.fillRect(105 + x, 6 + y, 1, 1);
        g2d.fillRect(104 + x, 7 + y, 1, 1);
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(94 + x, 9 + y, 1, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(107 + x, 3 + y, 1, 1);
        g2d.fillRect(99 + x, 8 + y, 1, 1);
        g2d.fillRect(126 + x, 9 + y, 1, 1);
        g2d.fillRect(127 + x, 11 + y, 1, 1);
        g2d.fillRect(93 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(109 + x, 3 + y, 1, 1);
        g2d.fillRect(102 + x, 3 + y, 1, 2);
        g2d.fillRect(106 + x, 4 + y, 1, 1);
        g2d.fillRect(115 + x, 7 + y, 1, 1);
        g2d.fillRect(106 + x, 7 + y, 1, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 1);
        g2d.fillRect(95 + x, 9 + y, 1, 1);
        g2d.fillRect(96 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 2 + y, 1, 1);
        g2d.fillRect(111 + x, 3 + y, 1, 1);
        g2d.fillRect(112 + x, 4 + y, 1, 1);
        g2d.fillRect(100 + x, 5 + y, 1, 1);
        g2d.fillRect(107 + x, 8 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 4, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 3 + y, 1, 7);
        g2d.fillRect(108 + x, 3 + y, 1, 6);
        g2d.fillRect(113 + x, 4 + y, 1, 7);
        g2d.fillRect(111 + x, 4 + y, 1, 7);
        g2d.fillRect(109 + x, 4 + y, 1, 5);
        g2d.fillRect(107 + x, 4 + y, 1, 4);
        g2d.fillRect(101 + x, 4 + y, 1, 4);
        g2d.fillRect(114 + x, 5 + y, 1, 5);
        g2d.fillRect(112 + x, 5 + y, 1, 6);
        g2d.fillRect(106 + x, 5 + y, 1, 1);
        g2d.fillRect(102 + x, 6 + y, 1, 1);
        g2d.fillRect(100 + x, 6 + y, 1, 2);
        g2d.fillRect(115 + x, 8 + y, 1, 1);
        g2d.fillRect(126 + x, 10 + y, 1, 2);
        g2d.fillRect(95 + x, 10 + y, 1, 2);
        g2d.fillRect(94 + x, 10 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 2, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 2, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 2);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
    }
}
