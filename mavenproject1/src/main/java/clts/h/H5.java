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
public class H5 extends SuperTL
{
    int direction = 0;
    public H5()
    {
        super();
    }

    public H5(ColorArray colorSwitch)
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
            paintT1(offsetX,0,g2d);
        else
            paintBackT1(offsetX,0,g2d);
    }

    public void paintT1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 12 + y, 1, 4);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 2, 1);
        g2d.fillRect(113 + x, 17 + y, 2, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 4, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 12 + y, 1, 3);
        g2d.fillRect(112 + x, 13 + y, 1, 3);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 2, 1);
        g2d.fillRect(104 + x, 17 + y, 2, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
    }





    public void paintBackT1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 12 + y, 1, 4);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 2, 1);
        g2d.fillRect(101 + x, 17 + y, 2, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 4, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 2);
        g2d.fillRect(110 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 12 + y, 1, 3);
        g2d.fillRect(103 + x, 13 + y, 1, 3);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 2, 1);
        g2d.fillRect(110 + x, 17 + y, 2, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
    }
}
