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
public class Mask0 extends SuperTL
{
    int direction = 0;
    public Mask0()
    {
        super();
    }

    public Mask0(ColorArray colorSwitch)
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
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintMask(offsetX, 0,g2d);
        else
            paintBackMask(offsetX, 0,g2d);
    }

    public void paintMask(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 29 + y, 2, 1);
        g2d.fillRect(107 + x, 30 + y, 4, 1);
        g2d.fillRect(110 + x, 31 + y, 1, 2);
        g2d.fillRect(111 + x, 31 + y, 1, 2);
        g2d.fillRect(112 + x, 31 + y, 5, 1);
        g2d.fillRect(118 + x, 31 + y, 1, 3);
        g2d.fillRect(104 + x, 32 + y, 1, 1);
        g2d.fillRect(109 + x, 32 + y, 1, 2);
        g2d.fillRect(116 + x, 32 + y, 2, 1);
        g2d.fillRect(105 + x, 33 + y, 4, 1);
        g2d.fillRect(108 + x, 36 + y, 1, 1);
        g2d.fillRect(109 + x, 37 + y, 1, 1);
        g2d.fillRect(111 + x, 38 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 33 + y, 4, 1);
        g2d.fillRect(115 + x, 34 + y, 2, 1);
        g2d.fillRect(110 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 32 + y, 4, 1);
        g2d.fillRect(110 + x, 33 + y, 2, 1);
        g2d.fillRect(116 + x, 33 + y, 2, 1);
        g2d.fillRect(107 + x, 34 + y, 2, 1);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(108 + x, 35 + y, 1, 1);
        g2d.fillRect(110 + x, 35 + y, 5, 1);
        g2d.fillRect(113 + x, 36 + y, 4, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 34 + y, 1, 3);
        g2d.fillRect(110 + x, 34 + y, 5, 1);
        g2d.fillRect(115 + x, 35 + y, 2, 1);
        g2d.fillRect(110 + x, 36 + y, 3, 1);
        g2d.fillRect(112 + x, 37 + y, 3, 1);
    }





    public void paintBackMask(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 29 + y, 2, 1);
        g2d.fillRect(105 + x, 30 + y, 4, 1);
        g2d.fillRect(105 + x, 31 + y, 1, 2);
        g2d.fillRect(104 + x, 31 + y, 1, 2);
        g2d.fillRect(99 + x, 31 + y, 5, 1);
        g2d.fillRect(97 + x, 31 + y, 1, 3);
        g2d.fillRect(111 + x, 32 + y, 1, 1);
        g2d.fillRect(106 + x, 32 + y, 1, 2);
        g2d.fillRect(98 + x, 32 + y, 2, 1);
        g2d.fillRect(107 + x, 33 + y, 4, 1);
        g2d.fillRect(107 + x, 36 + y, 1, 1);
        g2d.fillRect(106 + x, 37 + y, 1, 1);
        g2d.fillRect(103 + x, 38 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 33 + y, 4, 1);
        g2d.fillRect(99 + x, 34 + y, 2, 1);
        g2d.fillRect(104 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 32 + y, 4, 1);
        g2d.fillRect(104 + x, 33 + y, 2, 1);
        g2d.fillRect(98 + x, 33 + y, 2, 1);
        g2d.fillRect(107 + x, 34 + y, 2, 1);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(107 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 35 + y, 5, 1);
        g2d.fillRect(99 + x, 36 + y, 4, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 34 + y, 1, 3);
        g2d.fillRect(101 + x, 34 + y, 5, 1);
        g2d.fillRect(99 + x, 35 + y, 2, 1);
        g2d.fillRect(103 + x, 36 + y, 3, 1);
        g2d.fillRect(101 + x, 37 + y, 3, 1);
    }
}
