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
public class H4 extends SuperTL
{
    int direction = 0;
    public H4()
    {
        super();
    }

    public H4(ColorArray colorSwitch)
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
            paintHAT1(offsetX,0,g2d);
        else
            paintBackHAT1(offsetX,0,g2d);
    }

    public void paintHAT1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(96 + x, 10 + y, 1, 6);
        g2d.fillRect(93 + x, 14 + y, 1, 2);
        g2d.fillRect(94 + x, 14 + y, 2, 1);
        g2d.fillRect(91 + x, 15 + y, 2, 1);
        g2d.fillRect(88 + x, 16 + y, 1, 3);
        g2d.fillRect(89 + x, 16 + y, 1, 2);
        g2d.fillRect(90 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(95 + x, 8 + y, 1, 6);
        g2d.fillRect(96 + x, 8 + y, 1, 2);
        g2d.fillRect(97 + x, 8 + y, 1, 10);
        g2d.fillRect(98 + x, 8 + y, 1, 10);
        g2d.fillRect(99 + x, 8 + y, 1, 10);
        g2d.fillRect(100 + x, 8 + y, 1, 10);
        g2d.fillRect(101 + x, 8 + y, 1, 10);
        g2d.fillRect(102 + x, 8 + y, 1, 9);
        g2d.fillRect(103 + x, 8 + y, 1, 9);
        g2d.fillRect(104 + x, 8 + y, 1, 9);
        g2d.fillRect(105 + x, 8 + y, 1, 9);
        g2d.fillRect(106 + x, 8 + y, 1, 9);
        g2d.fillRect(107 + x, 8 + y, 1, 8);
        g2d.fillRect(108 + x, 8 + y, 1, 7);
        g2d.fillRect(122 + x, 8 + y, 1, 9);
        g2d.fillRect(123 + x, 8 + y, 1, 8);
        g2d.fillRect(124 + x, 8 + y, 1, 7);
        g2d.fillRect(125 + x, 8 + y, 1, 6);
        g2d.fillRect(126 + x, 8 + y, 1, 5);
        g2d.fillRect(127 + x, 8 + y, 1, 4);
        g2d.fillRect(94 + x, 9 + y, 1, 5);
        g2d.fillRect(109 + x, 9 + y, 1, 5);
        g2d.fillRect(110 + x, 9 + y, 1, 5);
        g2d.fillRect(111 + x, 9 + y, 1, 4);
        g2d.fillRect(112 + x, 9 + y, 1, 4);
        g2d.fillRect(113 + x, 9 + y, 1, 4);
        g2d.fillRect(114 + x, 9 + y, 1, 3);
        g2d.fillRect(115 + x, 9 + y, 1, 3);
        g2d.fillRect(116 + x, 9 + y, 1, 2);
        g2d.fillRect(117 + x, 9 + y, 1, 1);
        g2d.fillRect(120 + x, 9 + y, 1, 10);
        g2d.fillRect(121 + x, 9 + y, 1, 9);
        g2d.fillRect(93 + x, 10 + y, 1, 4);
        g2d.fillRect(92 + x, 11 + y, 1, 4);
        g2d.fillRect(119 + x, 11 + y, 1, 8);
        g2d.fillRect(91 + x, 12 + y, 1, 3);
        g2d.fillRect(90 + x, 13 + y, 1, 3);
        g2d.fillRect(117 + x, 13 + y, 1, 7);
        g2d.fillRect(118 + x, 13 + y, 1, 7);
        g2d.fillRect(115 + x, 14 + y, 1, 7);
        g2d.fillRect(116 + x, 14 + y, 1, 7);
        g2d.fillRect(89 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 7);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 7);
        g2d.fillRect(113 + x, 16 + y, 1, 7);
        g2d.fillRect(111 + x, 17 + y, 1, 6);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 6);
        g2d.fillRect(110 + x, 18 + y, 1, 6);
        g2d.fillRect(106 + x, 19 + y, 1, 6);
        g2d.fillRect(107 + x, 19 + y, 1, 5);
        g2d.fillRect(108 + x, 19 + y, 1, 5);
        g2d.fillRect(93 + x, 20 + y, 1, 7);
        g2d.fillRect(103 + x, 20 + y, 1, 5);
        g2d.fillRect(104 + x, 20 + y, 1, 5);
        g2d.fillRect(105 + x, 20 + y, 1, 5);
        g2d.fillRect(92 + x, 21 + y, 1, 7);
        g2d.fillRect(94 + x, 21 + y, 1, 6);
        g2d.fillRect(95 + x, 21 + y, 1, 6);
        g2d.fillRect(96 + x, 21 + y, 1, 6);
        g2d.fillRect(97 + x, 21 + y, 1, 6);
        g2d.fillRect(98 + x, 21 + y, 1, 5);
        g2d.fillRect(99 + x, 21 + y, 1, 5);
        g2d.fillRect(100 + x, 21 + y, 1, 5);
        g2d.fillRect(101 + x, 21 + y, 1, 5);
        g2d.fillRect(102 + x, 21 + y, 1, 5);
        g2d.fillRect(91 + x, 22 + y, 1, 6);
        g2d.fillRect(90 + x, 23 + y, 1, 5);
        g2d.fillRect(89 + x, 24 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 8 + y, 1, 2);
        g2d.fillRect(119 + x, 8 + y, 1, 2);
        g2d.fillRect(93 + x, 18 + y, 1, 2);
        g2d.fillRect(94 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 10 + y, 1, 3);
        g2d.fillRect(118 + x, 10 + y, 1, 3);
        g2d.fillRect(119 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 3);
        g2d.fillRect(114 + x, 12 + y, 1, 3);
        g2d.fillRect(115 + x, 12 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
        g2d.fillRect(109 + x, 17 + y, 2, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 2, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 14 + y, 2, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 3);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(100 + x, 18 + y, 1, 3);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 20 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
    }





    public void paintBackHAT1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 10 + y, 1, 6);
        g2d.fillRect(122 + x, 14 + y, 1, 2);
        g2d.fillRect(120 + x, 14 + y, 2, 1);
        g2d.fillRect(123 + x, 15 + y, 2, 1);
        g2d.fillRect(127 + x, 16 + y, 1, 3);
        g2d.fillRect(126 + x, 16 + y, 1, 2);
        g2d.fillRect(125 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 8 + y, 1, 6);
        g2d.fillRect(119 + x, 8 + y, 1, 2);
        g2d.fillRect(118 + x, 8 + y, 1, 10);
        g2d.fillRect(117 + x, 8 + y, 1, 10);
        g2d.fillRect(116 + x, 8 + y, 1, 10);
        g2d.fillRect(115 + x, 8 + y, 1, 10);
        g2d.fillRect(114 + x, 8 + y, 1, 10);
        g2d.fillRect(113 + x, 8 + y, 1, 9);
        g2d.fillRect(112 + x, 8 + y, 1, 9);
        g2d.fillRect(111 + x, 8 + y, 1, 9);
        g2d.fillRect(110 + x, 8 + y, 1, 9);
        g2d.fillRect(109 + x, 8 + y, 1, 9);
        g2d.fillRect(108 + x, 8 + y, 1, 8);
        g2d.fillRect(107 + x, 8 + y, 1, 7);
        g2d.fillRect(93 + x, 8 + y, 1, 9);
        g2d.fillRect(92 + x, 8 + y, 1, 8);
        g2d.fillRect(91 + x, 8 + y, 1, 7);
        g2d.fillRect(90 + x, 8 + y, 1, 6);
        g2d.fillRect(89 + x, 8 + y, 1, 5);
        g2d.fillRect(88 + x, 8 + y, 1, 4);
        g2d.fillRect(121 + x, 9 + y, 1, 5);
        g2d.fillRect(106 + x, 9 + y, 1, 5);
        g2d.fillRect(105 + x, 9 + y, 1, 5);
        g2d.fillRect(104 + x, 9 + y, 1, 4);
        g2d.fillRect(103 + x, 9 + y, 1, 4);
        g2d.fillRect(102 + x, 9 + y, 1, 4);
        g2d.fillRect(101 + x, 9 + y, 1, 3);
        g2d.fillRect(100 + x, 9 + y, 1, 3);
        g2d.fillRect(99 + x, 9 + y, 1, 2);
        g2d.fillRect(98 + x, 9 + y, 1, 1);
        g2d.fillRect(95 + x, 9 + y, 1, 10);
        g2d.fillRect(94 + x, 9 + y, 1, 9);
        g2d.fillRect(122 + x, 10 + y, 1, 4);
        g2d.fillRect(123 + x, 11 + y, 1, 4);
        g2d.fillRect(96 + x, 11 + y, 1, 8);
        g2d.fillRect(124 + x, 12 + y, 1, 3);
        g2d.fillRect(125 + x, 13 + y, 1, 3);
        g2d.fillRect(98 + x, 13 + y, 1, 7);
        g2d.fillRect(97 + x, 13 + y, 1, 7);
        g2d.fillRect(100 + x, 14 + y, 1, 7);
        g2d.fillRect(99 + x, 14 + y, 1, 7);
        g2d.fillRect(126 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 7);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 7);
        g2d.fillRect(102 + x, 16 + y, 1, 7);
        g2d.fillRect(104 + x, 17 + y, 1, 6);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 6);
        g2d.fillRect(105 + x, 18 + y, 1, 6);
        g2d.fillRect(109 + x, 19 + y, 1, 6);
        g2d.fillRect(108 + x, 19 + y, 1, 5);
        g2d.fillRect(107 + x, 19 + y, 1, 5);
        g2d.fillRect(122 + x, 20 + y, 1, 7);
        g2d.fillRect(112 + x, 20 + y, 1, 5);
        g2d.fillRect(111 + x, 20 + y, 1, 5);
        g2d.fillRect(110 + x, 20 + y, 1, 5);
        g2d.fillRect(123 + x, 21 + y, 1, 7);
        g2d.fillRect(121 + x, 21 + y, 1, 6);
        g2d.fillRect(120 + x, 21 + y, 1, 6);
        g2d.fillRect(119 + x, 21 + y, 1, 6);
        g2d.fillRect(118 + x, 21 + y, 1, 6);
        g2d.fillRect(117 + x, 21 + y, 1, 5);
        g2d.fillRect(116 + x, 21 + y, 1, 5);
        g2d.fillRect(115 + x, 21 + y, 1, 5);
        g2d.fillRect(114 + x, 21 + y, 1, 5);
        g2d.fillRect(113 + x, 21 + y, 1, 5);
        g2d.fillRect(124 + x, 22 + y, 1, 6);
        g2d.fillRect(125 + x, 23 + y, 1, 5);
        g2d.fillRect(126 + x, 24 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 8 + y, 1, 2);
        g2d.fillRect(96 + x, 8 + y, 1, 2);
        g2d.fillRect(122 + x, 18 + y, 1, 2);
        g2d.fillRect(121 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 10 + y, 1, 3);
        g2d.fillRect(97 + x, 10 + y, 1, 3);
        g2d.fillRect(96 + x, 10 + y, 1, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 3);
        g2d.fillRect(101 + x, 12 + y, 1, 3);
        g2d.fillRect(100 + x, 12 + y, 1, 2);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 2, 1);
        g2d.fillRect(105 + x, 17 + y, 2, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 2);
        g2d.fillRect(118 + x, 19 + y, 2, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 14 + y, 2, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 3);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(115 + x, 18 + y, 1, 3);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
    }
}
