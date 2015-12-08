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
public class CR01 extends SuperTL
{
    int direction = 0;
    public CR01()
    {
        super();
    }

    public CR01(ColorArray colorSwitch)
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
            paintH(offsetX, 0,g2d);
        else
            paintBackH(offsetX, 0,g2d);
    }

    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(124 + x, 26 + y, 1, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);
        g2d.fillRect(123 + x, 27 + y, 1, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(97 + x, 30 + y, 1, 1);
        g2d.fillRect(100 + x, 30 + y, 1, 1);
        g2d.fillRect(125 + x, 30 + y, 1, 1);
        g2d.fillRect(123 + x, 31 + y, 2, 1);
        g2d.fillRect(97 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 16 + y, 2, 1);
        g2d.fillRect(119 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 2, 1);
        g2d.fillRect(103 + x, 19 + y, 2, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 1, 2);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(122 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(125 + x, 28 + y, 1, 1);
        g2d.fillRect(124 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 17 + y, 2, 1);
        g2d.fillRect(116 + x, 17 + y, 2, 1);
        g2d.fillRect(106 + x, 18 + y, 2, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 2);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(124 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(123 + x, 25 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 27 + y, 1, 1);
        g2d.fillRect(112 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(122 + x, 28 + y, 1, 1);
        g2d.fillRect(97 + x, 29 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 18 + y, 5, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 2, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 2);
        g2d.fillRect(101 + x, 27 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 2, 1);
    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 22 + y, 1, 2);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(91 + x, 26 + y, 1, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(92 + x, 27 + y, 1, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 1);
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(118 + x, 30 + y, 1, 1);
        g2d.fillRect(115 + x, 30 + y, 1, 1);
        g2d.fillRect(90 + x, 30 + y, 1, 1);
        g2d.fillRect(91 + x, 31 + y, 2, 1);
        g2d.fillRect(118 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 16 + y, 2, 1);
        g2d.fillRect(95 + x, 16 + y, 2, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 2, 1);
        g2d.fillRect(111 + x, 19 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(113 + x, 21 + y, 1, 2);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(93 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(90 + x, 28 + y, 1, 1);
        g2d.fillRect(91 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 17 + y, 2, 1);
        g2d.fillRect(98 + x, 17 + y, 2, 1);
        g2d.fillRect(108 + x, 18 + y, 2, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 2);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(91 + x, 24 + y, 1, 1);
        g2d.fillRect(118 + x, 25 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(92 + x, 25 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 1);
        g2d.fillRect(120 + x, 27 + y, 1, 1);
        g2d.fillRect(103 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);
        g2d.fillRect(93 + x, 28 + y, 1, 1);
        g2d.fillRect(118 + x, 29 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 18 + y, 5, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 2, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(94 + x, 26 + y, 1, 2);
        g2d.fillRect(114 + x, 27 + y, 1, 1);
        g2d.fillRect(116 + x, 29 + y, 2, 1);
    }
}
