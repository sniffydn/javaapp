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
public class SL5 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public SL5()
    {
        super();
    }

    public SL5(ColorArray colorSwitch)
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
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(93 + x, 55 + y, 6, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 57 + y, 1, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 1);
        g2d.fillRect(93 + x, 58 + y, 1, 1);
        g2d.fillRect(96 + x, 58 + y, 1, 1);
        g2d.fillRect(95 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 60 + y, 1, 1);
        g2d.fillRect(97 + x, 60 + y, 1, 1);
        g2d.fillRect(93 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(94 + x, 63 + y, 1, 1);
        g2d.fillRect(97 + x, 63 + y, 1, 1);
        g2d.fillRect(93 + x, 64 + y, 1, 1);
        g2d.fillRect(96 + x, 64 + y, 1, 1);
        g2d.fillRect(95 + x, 65 + y, 1, 1);
        g2d.fillRect(94 + x, 66 + y, 1, 1);
        g2d.fillRect(97 + x, 66 + y, 1, 1);
        g2d.fillRect(93 + x, 67 + y, 1, 1);
        g2d.fillRect(96 + x, 67 + y, 1, 1);
        g2d.fillRect(95 + x, 68 + y, 1, 1);
        g2d.fillRect(94 + x, 69 + y, 1, 1);
        g2d.fillRect(93 + x, 70 + y, 1, 1);
        g2d.fillRect(96 + x, 70 + y, 1, 1);
        g2d.fillRect(92 + x, 71 + y, 1, 1);
        g2d.fillRect(95 + x, 71 + y, 1, 1);
        g2d.fillRect(94 + x, 72 + y, 1, 1);
        g2d.fillRect(93 + x, 73 + y, 1, 1);
        g2d.fillRect(96 + x, 73 + y, 1, 1);
        g2d.fillRect(92 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 2);
        g2d.fillRect(93 + x, 76 + y, 1, 2);
        g2d.fillRect(95 + x, 76 + y, 2, 1);
        g2d.fillRect(92 + x, 77 + y, 1, 1);
    }

    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {
        drawSleevesLeft0(x,y,g2d);
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
