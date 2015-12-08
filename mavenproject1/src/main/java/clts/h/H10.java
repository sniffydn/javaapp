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
public class H10 extends SuperTL
{
    int direction = 0;
    public H10()
    {
        super();
    }

    public H10(ColorArray colorSwitch)
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
            paintNurseHat(offsetX, 0,g2d);
        else
            paintBackNurseHat(offsetX, 0,g2d);
    }

    public void paintNurseHat(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 11 + y, 1, 6);
        g2d.fillRect(113 + x, 11 + y, 1, 6);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(115 + x, 13 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 9 + y, 9, 1);
        g2d.fillRect(106 + x, 10 + y, 2, 1);
        g2d.fillRect(117 + x, 10 + y, 2, 1);
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(119 + x, 11 + y, 2, 1);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(121 + x, 12 + y, 2, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(123 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(124 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(125 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(124 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(123 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 11, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 2, 1);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 2, 1);
        g2d.fillRect(119 + x, 20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 15 + y, 1, 3);
        g2d.fillRect(123 + x, 15 + y, 1, 2);
        g2d.fillRect(124 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 3);
        g2d.fillRect(122 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 3);
        g2d.fillRect(121 + x, 17 + y, 1, 2);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 12 + y, 1, 7);
        g2d.fillRect(120 + x, 12 + y, 1, 6);
        g2d.fillRect(102 + x, 13 + y, 1, 4);
        g2d.fillRect(103 + x, 13 + y, 1, 6);
        g2d.fillRect(121 + x, 13 + y, 1, 4);
        g2d.fillRect(122 + x, 13 + y, 1, 3);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(119 + x, 14 + y, 1, 5);
        g2d.fillRect(123 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 3);
        g2d.fillRect(118 + x, 16 + y, 1, 3);
        g2d.fillRect(117 + x, 17 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 10 + y, 1, 8);
        g2d.fillRect(109 + x, 10 + y, 1, 8);
        g2d.fillRect(116 + x, 10 + y, 1, 8);
        g2d.fillRect(106 + x, 11 + y, 1, 7);
        g2d.fillRect(107 + x, 11 + y, 1, 7);
        g2d.fillRect(117 + x, 11 + y, 1, 6);
        g2d.fillRect(118 + x, 11 + y, 1, 5);
        g2d.fillRect(105 + x, 12 + y, 1, 4);
        g2d.fillRect(119 + x, 12 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 10 + y, 1, 3);
        g2d.fillRect(111 + x, 10 + y, 1, 3);
        g2d.fillRect(112 + x, 10 + y, 4, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 2);
        g2d.fillRect(115 + x, 11 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 1, 3);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(114 + x, 15 + y, 1, 3);
        g2d.fillRect(115 + x, 15 + y, 1, 3);
        g2d.fillRect(112 + x, 17 + y, 2, 1);
    }





    public void paintBackNurseHat(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 11 + y, 1, 6);
        g2d.fillRect(102 + x, 11 + y, 1, 6);
        g2d.fillRect(105 + x, 13 + y, 1, 2);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(100 + x, 13 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 9 + y, 9, 1);
        g2d.fillRect(108 + x, 10 + y, 2, 1);
        g2d.fillRect(97 + x, 10 + y, 2, 1);
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(95 + x, 11 + y, 2, 1);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(93 + x, 12 + y, 2, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(92 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(91 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(90 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(91 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(92 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 11, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 2, 1);
        g2d.fillRect(95 + x, 20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 15 + y, 1, 3);
        g2d.fillRect(92 + x, 15 + y, 1, 2);
        g2d.fillRect(91 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 3);
        g2d.fillRect(93 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 3);
        g2d.fillRect(94 + x, 17 + y, 1, 2);
        g2d.fillRect(95 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 12 + y, 1, 7);
        g2d.fillRect(95 + x, 12 + y, 1, 6);
        g2d.fillRect(113 + x, 13 + y, 1, 4);
        g2d.fillRect(112 + x, 13 + y, 1, 6);
        g2d.fillRect(94 + x, 13 + y, 1, 4);
        g2d.fillRect(93 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(96 + x, 14 + y, 1, 5);
        g2d.fillRect(92 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 3);
        g2d.fillRect(97 + x, 16 + y, 1, 3);
        g2d.fillRect(98 + x, 17 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 10 + y, 1, 8);
        g2d.fillRect(106 + x, 10 + y, 1, 8);
        g2d.fillRect(99 + x, 10 + y, 1, 8);
        g2d.fillRect(109 + x, 11 + y, 1, 7);
        g2d.fillRect(108 + x, 11 + y, 1, 7);
        g2d.fillRect(98 + x, 11 + y, 1, 6);
        g2d.fillRect(97 + x, 11 + y, 1, 5);
        g2d.fillRect(110 + x, 12 + y, 1, 4);
        g2d.fillRect(96 + x, 12 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 10 + y, 1, 3);
        g2d.fillRect(104 + x, 10 + y, 1, 3);
        g2d.fillRect(100 + x, 10 + y, 4, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 2);
        g2d.fillRect(100 + x, 11 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 1, 3);
        g2d.fillRect(101 + x, 15 + y, 1, 3);
        g2d.fillRect(100 + x, 15 + y, 1, 3);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
    }
}
