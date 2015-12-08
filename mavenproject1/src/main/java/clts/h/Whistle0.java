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
public class Whistle0 extends SuperTL
{
    int direction = 0;
    public Whistle0()
    {
        super();
    }

    public Whistle0(ColorArray colorSwitch)
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
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintWhistle(offsetX + 98, 0 + 20,g2d);//98,20
        else
            paintBackWhistle(offsetX - 98, 0 + 20,g2d);
    }

    public void paintWhistle(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(16 + x, 18 + y, 1, 1);
        g2d.fillRect(6 + x, 19 + y, 1, 1);
        g2d.fillRect(14 + x, 19 + y, 2, 1);
        g2d.fillRect(17 + x, 19 + y, 1, 2);
        g2d.fillRect(7 + x, 20 + y, 1, 1);
        g2d.fillRect(16 + x, 20 + y, 1, 2);
        g2d.fillRect(8 + x, 21 + y, 1, 1);
        g2d.fillRect(9 + x, 22 + y, 1, 2);
        g2d.fillRect(14 + x, 22 + y, 1, 2);
        g2d.fillRect(15 + x, 22 + y, 1, 1);
        g2d.fillRect(10 + x, 23 + y, 4, 1);


        g2d.setColor(new Color(150,150,150,255));
        g2d.fillRect(13 + x, 15 + y, 2, 1);
        g2d.fillRect(15 + x, 16 + y, 1, 1);
        g2d.fillRect(19 + x, 16 + y, 1, 2);
        g2d.fillRect(18 + x, 18 + y, 1, 1);


        g2d.setColor(new Color(180,180,180,255));
        g2d.fillRect(15 + x, 15 + y, 3, 1);
        g2d.fillRect(16 + x, 16 + y, 1, 2);
        g2d.fillRect(17 + x, 16 + y, 1, 3);
        g2d.fillRect(18 + x, 16 + y, 1, 2);
    }


    public void paintBackWhistle(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(199 + x, 18 + y, 1, 1);
        g2d.fillRect(209 + x, 19 + y, 1, 1);
        g2d.fillRect(200 + x, 19 + y, 2, 1);
        g2d.fillRect(198 + x, 19 + y, 1, 2);
        g2d.fillRect(208 + x, 20 + y, 1, 1);
        g2d.fillRect(199 + x, 20 + y, 1, 2);
        g2d.fillRect(207 + x, 21 + y, 1, 1);
        g2d.fillRect(206 + x, 22 + y, 1, 2);
        g2d.fillRect(201 + x, 22 + y, 1, 2);
        g2d.fillRect(200 + x, 22 + y, 1, 1);
        g2d.fillRect(202 + x, 23 + y, 4, 1);


        g2d.setColor(new Color(150,150,150,255));
        g2d.fillRect(201 + x, 15 + y, 2, 1);
        g2d.fillRect(200 + x, 16 + y, 1, 1);
        g2d.fillRect(196 + x, 16 + y, 1, 2);
        g2d.fillRect(197 + x, 18 + y, 1, 1);


        g2d.setColor(new Color(180,180,180,255));
        g2d.fillRect(198 + x, 15 + y, 3, 1);
        g2d.fillRect(199 + x, 16 + y, 1, 2);
        g2d.fillRect(198 + x, 16 + y, 1, 3);
        g2d.fillRect(197 + x, 16 + y, 1, 2);
    }
}
