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
public class H2 extends SuperTL
{
    int direction = 0;
    public H2()
    {
        super();
    }

    public H2(ColorArray colorSwitch)
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
            paintH(offsetX, -6, g2d);
        else
            paintH(offsetX - 5, -6, g2d);
    }

    public void paintH(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 13 + y, 1, 6);
        g2d.fillRect(116 + x, 13 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 10 + y, 1, 2);
        g2d.fillRect(111 + x, 10 + y, 2, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 2);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 5);
        g2d.fillRect(115 + x, 14 + y, 1, 5);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 9 + y, 2, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 4);
        g2d.fillRect(114 + x, 15 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 6);
        g2d.fillRect(113 + x, 14 + y, 1, 6);
        g2d.fillRect(111 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 12 + y, 1, 7);
        g2d.fillRect(112 + x, 13 + y, 1, 6);
    }

}
