/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

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
public class SL1 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public SL1()
    {
        super();
    }

    public SL1(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        leftA = leftArm;
        rightA = rightArm;
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 49 + y, 1, 19);
        g2d.fillRect(94 + x, 49 + y, 3, 1);
        g2d.fillRect(97 + x, 50 + y, 2, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 4);
        g2d.fillRect(97 + x, 61 + y, 1, 7);
        g2d.fillRect(92 + x, 68 + y, 1, 7);
        g2d.fillRect(96 + x, 68 + y, 1, 6);
        g2d.fillRect(95 + x, 73 + y, 1, 1);
        g2d.fillRect(93 + x, 74 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 50 + y, 1, 18);
        g2d.fillRect(97 + x, 51 + y, 1, 10);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 7);
        g2d.fillRect(93 + x, 68 + y, 1, 6);
        g2d.fillRect(95 + x, 68 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 50 + y, 1, 11);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 50 + y, 1, 11);
        g2d.fillRect(95 + x, 61 + y, 1, 7);
        g2d.fillRect(94 + x, 68 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
    }

    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {

        if(leftA == 0)
        {
            drawSleevesLeft0(x,y,g2d);
        }

    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
        drawSleeves(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
    }
}
