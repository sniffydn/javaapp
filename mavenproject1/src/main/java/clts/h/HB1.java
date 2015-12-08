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
public class HB1 extends SuperTL
{
    int direction = 0;
    public HB1()
    {
        super();
    }

    public HB1(ColorArray colorSwitch)
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
        {
            paintbadgw(offsetX, 0, g2d);
        }
        else
        {
            paintbadgw(offsetX - 11, 0, g2d);
        }
    }
    public void paintbadgw(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(113 + x, 7 + y, 1, 3);
        g2d.fillRect(114 + x, 7 + y, 1, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 3);
        g2d.fillRect(112 + x, 9 + y, 1, 2);
        g2d.fillRect(116 + x, 9 + y, 1, 3);
        g2d.fillRect(110 + x, 10 + y, 1, 2);
        g2d.fillRect(109 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 9 + y, 1, 2);
        g2d.fillRect(113 + x, 10 + y, 1, 3);
        g2d.fillRect(112 + x, 11 + y, 1, 3);
        g2d.fillRect(110 + x, 12 + y, 1, 2);
        g2d.fillRect(111 + x, 12 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 7 + y, 1, 2);
        g2d.fillRect(112 + x, 7 + y, 1, 2);
        g2d.fillRect(110 + x, 8 + y, 1, 2);
        g2d.fillRect(114 + x, 8 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 10 + y, 1, 2);
        g2d.fillRect(114 + x, 11 + y, 1, 2);
        g2d.fillRect(109 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 6 + y, 1, 1);
        g2d.fillRect(114 + x, 6 + y, 1, 1);
        g2d.fillRect(115 + x, 8 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 7 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 7 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(115 + x, 9 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 3, 1);
    }





    public void paintBackbadgw(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 7 + y, 1, 3);
        g2d.fillRect(101 + x, 7 + y, 1, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 3);
        g2d.fillRect(103 + x, 9 + y, 1, 2);
        g2d.fillRect(99 + x, 9 + y, 1, 3);
        g2d.fillRect(105 + x, 10 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 9 + y, 1, 1);
        g2d.fillRect(101 + x, 9 + y, 1, 2);
        g2d.fillRect(102 + x, 10 + y, 1, 3);
        g2d.fillRect(103 + x, 11 + y, 1, 3);
        g2d.fillRect(105 + x, 12 + y, 1, 2);
        g2d.fillRect(104 + x, 12 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 7 + y, 1, 2);
        g2d.fillRect(103 + x, 7 + y, 1, 2);
        g2d.fillRect(105 + x, 8 + y, 1, 2);
        g2d.fillRect(101 + x, 8 + y, 1, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(100 + x, 10 + y, 1, 2);
        g2d.fillRect(101 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 14 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 6 + y, 1, 1);
        g2d.fillRect(101 + x, 6 + y, 1, 1);
        g2d.fillRect(100 + x, 8 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 7 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 7 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(100 + x, 9 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 3, 1);
    }
}
