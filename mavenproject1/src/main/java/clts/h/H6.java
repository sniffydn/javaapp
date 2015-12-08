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
public class H6 extends SuperTL
{
    int direction = 0;
    public H6()
    {
        super();
    }

    public H6(ColorArray colorSwitch)
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
            paintT(offsetX,0,g2d);
        else
            paintBackT(offsetX,0,g2d);
    }

     public void paintT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 6 + y, 9, 1);
        g2d.fillRect(103 + x, 7 + y, 2, 1);
        g2d.fillRect(114 + x, 7 + y, 2, 1);
        g2d.fillRect(102 + x, 8 + y, 1, 1);
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(101 + x, 9 + y, 1, 1);
        g2d.fillRect(117 + x, 9 + y, 1, 1);
        g2d.fillRect(100 + x, 10 + y, 1, 1);
        g2d.fillRect(118 + x, 10 + y, 1, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(119 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 3);
        g2d.fillRect(121 + x, 13 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 7 + y, 9, 1);
        g2d.fillRect(103 + x, 8 + y, 1, 2);
        g2d.fillRect(104 + x, 8 + y, 1, 1);
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(112 + x, 8 + y, 4, 1);
        g2d.fillRect(102 + x, 9 + y, 1, 2);
        g2d.fillRect(114 + x, 9 + y, 2, 1);
        g2d.fillRect(105 + x, 10 + y, 2, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 10 + y, 2, 1);
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(118 + x, 11 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 8 + y, 1, 2);
        g2d.fillRect(108 + x, 8 + y, 1, 2);
        g2d.fillRect(109 + x, 8 + y, 1, 2);
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(105 + x, 9 + y, 1, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 2);
        g2d.fillRect(113 + x, 9 + y, 1, 1);
        g2d.fillRect(104 + x, 10 + y, 1, 2);
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 3);
        g2d.fillRect(103 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 2, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 2);
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(112 + x, 11 + y, 2, 1);
        g2d.fillRect(115 + x, 11 + y, 1, 2);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 2, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 2, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 3 + y, 4, 1);
        g2d.fillRect(106 + x, 4 + y, 1, 1);
        g2d.fillRect(111 + x, 4 + y, 1, 1);
        g2d.fillRect(105 + x, 5 + y, 1, 1);
        g2d.fillRect(112 + x, 5 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 15, 1);
        g2d.fillRect(100 + x, 14 + y, 2, 1);
        g2d.fillRect(117 + x, 14 + y, 2, 1);
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(119 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(121 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(122 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(123 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 5);
        g2d.fillRect(103 + x, 19 + y, 11, 1);
        g2d.fillRect(124 + x, 19 + y, 1, 5);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 4, 1);
        g2d.fillRect(99 + x, 21 + y, 2, 1);
        g2d.fillRect(118 + x, 21 + y, 2, 1);
        g2d.fillRect(97 + x, 22 + y, 2, 1);
        g2d.fillRect(120 + x, 22 + y, 2, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(122 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(123 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(111 + x, 8 + y, 1, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 1);
        g2d.fillRect(106 + x, 9 + y, 1, 1);
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 1);
        g2d.fillRect(116 + x, 9 + y, 1, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 10 + y, 1, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 11 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 4 + y, 1, 2);
        g2d.fillRect(108 + x, 5 + y, 2, 1);
        g2d.fillRect(111 + x, 5 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 4, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 4, 1);
        g2d.fillRect(100 + x, 15 + y, 2, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 2, 1);
        g2d.fillRect(98 + x, 16 + y, 2, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 2);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 3, 1);
        g2d.fillRect(107 + x, 18 + y, 5, 1);
        g2d.fillRect(113 + x, 18 + y, 3, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 2);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 2, 1);
        g2d.fillRect(114 + x, 19 + y, 5, 1);
        g2d.fillRect(123 + x, 19 + y, 1, 2);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 2, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(122 + x, 22 + y, 2, 1);
        g2d.fillRect(123 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 4 + y, 1, 1);
        g2d.fillRect(107 + x, 5 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 3, 1);
        g2d.fillRect(110 + x, 14 + y, 3, 1);
        g2d.fillRect(102 + x, 15 + y, 4, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 15 + y, 4, 1);
        g2d.fillRect(100 + x, 16 + y, 2, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 3, 1);
        g2d.fillRect(116 + x, 18 + y, 3, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 1);
        g2d.fillRect(123 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 4 + y, 2, 1);
        g2d.fillRect(106 + x, 5 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 3, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 3, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 3, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 3, 1);
        g2d.fillRect(116 + x, 17 + y, 3, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(120 + x, 19 + y, 2, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(96 + x, 21 + y, 1, 1);
    }





    public void paintBackT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 6 + y, 9, 1);
        g2d.fillRect(111 + x, 7 + y, 2, 1);
        g2d.fillRect(100 + x, 7 + y, 2, 1);
        g2d.fillRect(113 + x, 8 + y, 1, 1);
        g2d.fillRect(99 + x, 8 + y, 1, 1);
        g2d.fillRect(114 + x, 9 + y, 1, 1);
        g2d.fillRect(98 + x, 9 + y, 1, 1);
        g2d.fillRect(115 + x, 10 + y, 1, 1);
        g2d.fillRect(97 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(96 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 3);
        g2d.fillRect(94 + x, 13 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 7 + y, 9, 1);
        g2d.fillRect(112 + x, 8 + y, 1, 2);
        g2d.fillRect(111 + x, 8 + y, 1, 1);
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(100 + x, 8 + y, 4, 1);
        g2d.fillRect(113 + x, 9 + y, 1, 2);
        g2d.fillRect(100 + x, 9 + y, 2, 1);
        g2d.fillRect(109 + x, 10 + y, 2, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(105 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 10 + y, 1, 1);
        g2d.fillRect(98 + x, 10 + y, 2, 1);
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(97 + x, 11 + y, 1, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 8 + y, 1, 2);
        g2d.fillRect(107 + x, 8 + y, 1, 2);
        g2d.fillRect(106 + x, 8 + y, 1, 2);
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 2);
        g2d.fillRect(102 + x, 9 + y, 1, 1);
        g2d.fillRect(111 + x, 10 + y, 1, 2);
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 3);
        g2d.fillRect(112 + x, 11 + y, 1, 2);
        g2d.fillRect(108 + x, 11 + y, 2, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 2);
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 2, 1);
        g2d.fillRect(100 + x, 11 + y, 1, 2);
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 2, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 2, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 3 + y, 4, 1);
        g2d.fillRect(109 + x, 4 + y, 1, 1);
        g2d.fillRect(104 + x, 4 + y, 1, 1);
        g2d.fillRect(110 + x, 5 + y, 1, 1);
        g2d.fillRect(103 + x, 5 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 15, 1);
        g2d.fillRect(114 + x, 14 + y, 2, 1);
        g2d.fillRect(97 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(95 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(94 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(93 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(92 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 5);
        g2d.fillRect(102 + x, 19 + y, 11, 1);
        g2d.fillRect(91 + x, 19 + y, 1, 5);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 4, 1);
        g2d.fillRect(115 + x, 21 + y, 2, 1);
        g2d.fillRect(96 + x, 21 + y, 2, 1);
        g2d.fillRect(117 + x, 22 + y, 2, 1);
        g2d.fillRect(94 + x, 22 + y, 2, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(93 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(92 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(104 + x, 8 + y, 1, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 1);
        g2d.fillRect(109 + x, 9 + y, 1, 1);
        g2d.fillRect(105 + x, 9 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 1);
        g2d.fillRect(99 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 10 + y, 1, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 10 + y, 1, 1);
        g2d.fillRect(100 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 4 + y, 1, 2);
        g2d.fillRect(106 + x, 5 + y, 2, 1);
        g2d.fillRect(104 + x, 5 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 4, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 4, 1);
        g2d.fillRect(114 + x, 15 + y, 2, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 2, 1);
        g2d.fillRect(116 + x, 16 + y, 2, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 2);
        g2d.fillRect(94 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 3, 1);
        g2d.fillRect(104 + x, 18 + y, 5, 1);
        g2d.fillRect(100 + x, 18 + y, 3, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 2);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 5, 1);
        g2d.fillRect(92 + x, 19 + y, 1, 2);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 2, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(92 + x, 22 + y, 2, 1);
        g2d.fillRect(92 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 4 + y, 1, 1);
        g2d.fillRect(108 + x, 5 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 3, 1);
        g2d.fillRect(103 + x, 14 + y, 3, 1);
        g2d.fillRect(110 + x, 15 + y, 4, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 4, 1);
        g2d.fillRect(114 + x, 16 + y, 2, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 2, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 3, 1);
        g2d.fillRect(97 + x, 18 + y, 3, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(92 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 4 + y, 2, 1);
        g2d.fillRect(109 + x, 5 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 3, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 3, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 3, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 3, 1);
        g2d.fillRect(97 + x, 17 + y, 3, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(94 + x, 19 + y, 2, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(119 + x, 21 + y, 1, 1);
    }
}
