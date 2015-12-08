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
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class H17 extends SuperTL
{
    int direction = 0;
    public H17()
    {
        super();
    }

    public H17(ColorArray colorSwitch)
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
            paintH(offsetX + shiftX, shiftY,g2d);
        else
            paintBackH(offsetX + shiftX, shiftY,g2d);
    }

    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 2, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 2, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(107 + x, 23 + y, 1, 2);
        g2d.fillRect(109 + x, 23 + y, 2, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(109 + x, 22 + y, 5, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(114 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 3);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 2);
        g2d.fillRect(102 + x, 24 + y, 1, 2);
        g2d.fillRect(119 + x, 24 + y, 1, 2);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 1);
        g2d.fillRect(122 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 2, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 3);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(100 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 10 + y, 4, 1);
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 2);
        g2d.fillRect(109 + x, 11 + y, 5, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 3);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 2);
        g2d.fillRect(121 + x, 19 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 4, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 3, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 1);
        g2d.fillRect(123 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 3);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 2, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(122 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 10 + y, 2, 1);
        g2d.fillRect(112 + x, 10 + y, 3, 1);
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 3);
        g2d.fillRect(104 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 15 + y, 1, 7);
        g2d.fillRect(102 + x, 21 + y, 2, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 2, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 2);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(122 + x, 25 + y, 1, 1);
        g2d.fillRect(123 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 2, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 2, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 11 + y, 2, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 2, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 2, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 2);
        g2d.fillRect(120 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 10 + y, 2, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(104 + x, 12 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 14 + y, 1, 5);
        g2d.fillRect(104 + x, 14 + y, 2, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 5);
        g2d.fillRect(106 + x, 16 + y, 1, 4);
        g2d.fillRect(119 + x, 16 + y, 1, 4);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 3);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 2, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 3, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(121 + x, 24 + y, 1, 1);
    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 2, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 2, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(108 + x, 23 + y, 1, 2);
        g2d.fillRect(105 + x, 23 + y, 2, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(102 + x, 22 + y, 5, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 3);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 2);
        g2d.fillRect(113 + x, 24 + y, 1, 2);
        g2d.fillRect(96 + x, 24 + y, 1, 2);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(94 + x, 26 + y, 1, 1);
        g2d.fillRect(93 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 2, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(115 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 10 + y, 4, 1);
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 2);
        g2d.fillRect(102 + x, 11 + y, 5, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 3);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 2);
        g2d.fillRect(94 + x, 19 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 4, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 3, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 25 + y, 1, 1);
        g2d.fillRect(92 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 3);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 2, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(93 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 10 + y, 2, 1);
        g2d.fillRect(101 + x, 10 + y, 3, 1);
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 3);
        g2d.fillRect(111 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(114 + x, 15 + y, 1, 7);
        g2d.fillRect(112 + x, 21 + y, 2, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 2, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 2);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(93 + x, 25 + y, 1, 1);
        g2d.fillRect(92 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 2, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 2, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(108 + x, 11 + y, 2, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 2, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 2, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 2);
        g2d.fillRect(95 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(104 + x, 10 + y, 2, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 12 + y, 2, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 1, 5);
        g2d.fillRect(110 + x, 14 + y, 2, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 5);
        g2d.fillRect(109 + x, 16 + y, 1, 4);
        g2d.fillRect(96 + x, 16 + y, 1, 4);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 3);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(100 + x, 19 + y, 2, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 3, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(94 + x, 24 + y, 1, 1);
    }

}
