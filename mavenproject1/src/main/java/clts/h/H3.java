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
public class H3 extends SuperTL
{
    int direction = 0;
    public H3()
    {
        super();
    }

    public H3(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        return new clts.h.HB1(c);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            paintHat(offsetX, 0, g2d);
        }
        else
        {
            paintBackHat(offsetX, 0, g2d);
        }
    }
    public void paintHat(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(120 + x, 15 + y, 1, 3);
        g2d.fillRect(121 + x, 15 + y, 1, 3);
        g2d.fillRect(117 + x, 16 + y, 1, 3);
        g2d.fillRect(118 + x, 16 + y, 1, 2);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 17 + y, 1, 3);
        g2d.fillRect(111 + x, 17 + y, 1, 3);
        g2d.fillRect(112 + x, 17 + y, 1, 3);
        g2d.fillRect(113 + x, 17 + y, 1, 3);
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(115 + x, 17 + y, 1, 3);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 5, 1);
        g2d.fillRect(108 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 17 + y, 3, 1);
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(118 + x, 18 + y, 4, 1);
        g2d.fillRect(104 + x, 19 + y, 4, 1);
        g2d.fillRect(116 + x, 19 + y, 2, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 10, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(117 + x, 15 + y, 3, 1);
        g2d.fillRect(102 + x, 16 + y, 14, 1);
        g2d.fillRect(105 + x, 17 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 12 + y, 1, 3);
        g2d.fillRect(117 + x, 13 + y, 1, 2);
        g2d.fillRect(118 + x, 13 + y, 1, 2);
        g2d.fillRect(120 + x, 13 + y, 1, 2);
        g2d.fillRect(97 + x, 14 + y, 6, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 14, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 4 + y, 1, 2);
        g2d.fillRect(111 + x, 4 + y, 9, 1);
        g2d.fillRect(107 + x, 5 + y, 1, 2);
        g2d.fillRect(108 + x, 5 + y, 2, 1);
        g2d.fillRect(123 + x, 5 + y, 1, 4);
        g2d.fillRect(102 + x, 6 + y, 1, 3);
        g2d.fillRect(103 + x, 6 + y, 1, 3);
        g2d.fillRect(104 + x, 6 + y, 1, 2);
        g2d.fillRect(105 + x, 6 + y, 1, 2);
        g2d.fillRect(106 + x, 6 + y, 1, 1);
        g2d.fillRect(122 + x, 6 + y, 1, 6);
        g2d.fillRect(101 + x, 7 + y, 1, 2);
        g2d.fillRect(121 + x, 7 + y, 1, 6);
        g2d.fillRect(100 + x, 8 + y, 1, 1);
        g2d.fillRect(98 + x, 9 + y, 1, 2);
        g2d.fillRect(99 + x, 9 + y, 1, 2);
        g2d.fillRect(120 + x, 9 + y, 1, 4);
        g2d.fillRect(97 + x, 10 + y, 1, 1);
        g2d.fillRect(119 + x, 10 + y, 1, 2);
        g2d.fillRect(96 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 11 + y, 1, 2);
        g2d.fillRect(118 + x, 11 + y, 1, 2);
        g2d.fillRect(97 + x, 12 + y, 1, 2);
        g2d.fillRect(98 + x, 12 + y, 1, 2);
        g2d.fillRect(116 + x, 12 + y, 1, 2);
        g2d.fillRect(99 + x, 13 + y, 6, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 12, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 7 + y, 3, 1);
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 2);
        g2d.fillRect(107 + x, 9 + y, 2, 1);
        g2d.fillRect(102 + x, 10 + y, 1, 1);
        g2d.fillRect(105 + x, 10 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 7 + y, 1, 2);
        g2d.fillRect(113 + x, 7 + y, 1, 2);
        g2d.fillRect(114 + x, 7 + y, 2, 1);
        g2d.fillRect(106 + x, 8 + y, 1, 2);
        g2d.fillRect(107 + x, 8 + y, 5, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 2);
        g2d.fillRect(105 + x, 9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(120 + x, 4 + y, 1, 5);
        g2d.fillRect(121 + x, 4 + y, 1, 3);
        g2d.fillRect(122 + x, 4 + y, 1, 2);
        g2d.fillRect(111 + x, 5 + y, 1, 2);
        g2d.fillRect(112 + x, 5 + y, 1, 2);
        g2d.fillRect(113 + x, 5 + y, 2, 1);
        g2d.fillRect(117 + x, 5 + y, 1, 6);
        g2d.fillRect(118 + x, 5 + y, 1, 6);
        g2d.fillRect(119 + x, 5 + y, 1, 5);
        g2d.fillRect(108 + x, 6 + y, 1, 2);
        g2d.fillRect(109 + x, 6 + y, 2, 1);
        g2d.fillRect(106 + x, 7 + y, 2, 1);
        g2d.fillRect(116 + x, 7 + y, 1, 1);
        g2d.fillRect(104 + x, 8 + y, 1, 1);
        g2d.fillRect(100 + x, 9 + y, 1, 4);
        g2d.fillRect(101 + x, 9 + y, 1, 4);
        g2d.fillRect(102 + x, 9 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 5);
        g2d.fillRect(113 + x, 9 + y, 1, 5);
        g2d.fillRect(114 + x, 9 + y, 1, 5);
        g2d.fillRect(115 + x, 9 + y, 1, 4);
        g2d.fillRect(116 + x, 9 + y, 1, 3);
        g2d.fillRect(108 + x, 10 + y, 1, 4);
        g2d.fillRect(109 + x, 10 + y, 1, 4);
        g2d.fillRect(110 + x, 10 + y, 1, 4);
        g2d.fillRect(111 + x, 10 + y, 1, 4);
        g2d.fillRect(97 + x, 11 + y, 3, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 3);
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 5, 1);
        g2d.fillRect(105 + x, 13 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(115 + x, 5 + y, 1, 2);
        g2d.fillRect(116 + x, 5 + y, 1, 2);
        g2d.fillRect(113 + x, 6 + y, 2, 1);
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(114 + x, 8 + y, 2, 1);
        g2d.fillRect(109 + x, 9 + y, 3, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 5, 1);
    }





    public void paintBackHat(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(95 + x, 15 + y, 1, 3);
        g2d.fillRect(94 + x, 15 + y, 1, 3);
        g2d.fillRect(98 + x, 16 + y, 1, 3);
        g2d.fillRect(97 + x, 16 + y, 1, 2);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 3);
        g2d.fillRect(104 + x, 17 + y, 1, 3);
        g2d.fillRect(103 + x, 17 + y, 1, 3);
        g2d.fillRect(102 + x, 17 + y, 1, 3);
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(100 + x, 17 + y, 1, 3);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 5, 1);
        g2d.fillRect(106 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(111 + x, 17 + y, 3, 1);
        g2d.fillRect(111 + x, 18 + y, 2, 1);
        g2d.fillRect(94 + x, 18 + y, 4, 1);
        g2d.fillRect(108 + x, 19 + y, 4, 1);
        g2d.fillRect(98 + x, 19 + y, 2, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 10, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(96 + x, 15 + y, 3, 1);
        g2d.fillRect(100 + x, 16 + y, 14, 1);
        g2d.fillRect(106 + x, 17 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 12 + y, 1, 3);
        g2d.fillRect(98 + x, 13 + y, 1, 2);
        g2d.fillRect(97 + x, 13 + y, 1, 2);
        g2d.fillRect(95 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 6, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 14, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 4 + y, 1, 2);
        g2d.fillRect(96 + x, 4 + y, 9, 1);
        g2d.fillRect(108 + x, 5 + y, 1, 2);
        g2d.fillRect(106 + x, 5 + y, 2, 1);
        g2d.fillRect(92 + x, 5 + y, 1, 4);
        g2d.fillRect(113 + x, 6 + y, 1, 3);
        g2d.fillRect(112 + x, 6 + y, 1, 3);
        g2d.fillRect(111 + x, 6 + y, 1, 2);
        g2d.fillRect(110 + x, 6 + y, 1, 2);
        g2d.fillRect(109 + x, 6 + y, 1, 1);
        g2d.fillRect(93 + x, 6 + y, 1, 6);
        g2d.fillRect(114 + x, 7 + y, 1, 2);
        g2d.fillRect(94 + x, 7 + y, 1, 6);
        g2d.fillRect(115 + x, 8 + y, 1, 1);
        g2d.fillRect(117 + x, 9 + y, 1, 2);
        g2d.fillRect(116 + x, 9 + y, 1, 2);
        g2d.fillRect(95 + x, 9 + y, 1, 4);
        g2d.fillRect(118 + x, 10 + y, 1, 1);
        g2d.fillRect(96 + x, 10 + y, 1, 2);
        g2d.fillRect(119 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 11 + y, 1, 2);
        g2d.fillRect(97 + x, 11 + y, 1, 2);
        g2d.fillRect(118 + x, 12 + y, 1, 2);
        g2d.fillRect(117 + x, 12 + y, 1, 2);
        g2d.fillRect(99 + x, 12 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 6, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 12, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 7 + y, 3, 1);
        g2d.fillRect(99 + x, 8 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 2);
        g2d.fillRect(107 + x, 9 + y, 2, 1);
        g2d.fillRect(113 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 7 + y, 1, 2);
        g2d.fillRect(102 + x, 7 + y, 1, 2);
        g2d.fillRect(100 + x, 7 + y, 2, 1);
        g2d.fillRect(109 + x, 8 + y, 1, 2);
        g2d.fillRect(104 + x, 8 + y, 5, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 2);
        g2d.fillRect(110 + x, 9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(95 + x, 4 + y, 1, 5);
        g2d.fillRect(94 + x, 4 + y, 1, 3);
        g2d.fillRect(93 + x, 4 + y, 1, 2);
        g2d.fillRect(104 + x, 5 + y, 1, 2);
        g2d.fillRect(103 + x, 5 + y, 1, 2);
        g2d.fillRect(101 + x, 5 + y, 2, 1);
        g2d.fillRect(98 + x, 5 + y, 1, 6);
        g2d.fillRect(97 + x, 5 + y, 1, 6);
        g2d.fillRect(96 + x, 5 + y, 1, 5);
        g2d.fillRect(107 + x, 6 + y, 1, 2);
        g2d.fillRect(105 + x, 6 + y, 2, 1);
        g2d.fillRect(108 + x, 7 + y, 2, 1);
        g2d.fillRect(99 + x, 7 + y, 1, 1);
        g2d.fillRect(111 + x, 8 + y, 1, 1);
        g2d.fillRect(115 + x, 9 + y, 1, 4);
        g2d.fillRect(114 + x, 9 + y, 1, 4);
        g2d.fillRect(113 + x, 9 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 5);
        g2d.fillRect(102 + x, 9 + y, 1, 5);
        g2d.fillRect(101 + x, 9 + y, 1, 5);
        g2d.fillRect(100 + x, 9 + y, 1, 4);
        g2d.fillRect(99 + x, 9 + y, 1, 3);
        g2d.fillRect(107 + x, 10 + y, 1, 4);
        g2d.fillRect(106 + x, 10 + y, 1, 4);
        g2d.fillRect(105 + x, 10 + y, 1, 4);
        g2d.fillRect(104 + x, 10 + y, 1, 4);
        g2d.fillRect(116 + x, 11 + y, 3, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 3);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 5, 1);
        g2d.fillRect(109 + x, 13 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(100 + x, 5 + y, 1, 2);
        g2d.fillRect(99 + x, 5 + y, 1, 2);
        g2d.fillRect(101 + x, 6 + y, 2, 1);
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(100 + x, 8 + y, 2, 1);
        g2d.fillRect(104 + x, 9 + y, 3, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 5, 1);
    }
}
