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
public class SL7 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public SL7()
    {
        super();
    }

    public SL7(ColorArray colorSwitch)
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

    }
    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {
        paintL(x,y,g2d);
        paintR(x,y,g2d);
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

    public void paintL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(93 + x, 60 + y, 1, 8);
        g2d.fillRect(94 + x, 60 + y, 5, 1);
        g2d.fillRect(97 + x, 61 + y, 1, 8);
        g2d.fillRect(92 + x, 68 + y, 1, 9);
        g2d.fillRect(96 + x, 68 + y, 1, 10);
        g2d.fillRect(91 + x, 77 + y, 1, 4);
        g2d.fillRect(95 + x, 78 + y, 1, 1);
        g2d.fillRect(94 + x, 79 + y, 1, 1);
        g2d.fillRect(93 + x, 80 + y, 1, 1);
        g2d.fillRect(92 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 61 + y, 1, 8);
        g2d.fillRect(95 + x, 61 + y, 1, 3);
        g2d.fillRect(96 + x, 61 + y, 1, 7);
        g2d.fillRect(93 + x, 68 + y, 1, 12);
        g2d.fillRect(95 + x, 68 + y, 1, 10);
        g2d.fillRect(94 + x, 73 + y, 1, 6);
        g2d.fillRect(92 + x, 77 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(95 + x, 64 + y, 1, 4);
        g2d.fillRect(94 + x, 69 + y, 1, 4);
    }





    public void paintR(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 61 + y, 6, 1);
        g2d.fillRect(118 + x, 62 + y, 1, 4);
        g2d.fillRect(122 + x, 62 + y, 1, 5);
        g2d.fillRect(119 + x, 66 + y, 1, 5);
        g2d.fillRect(123 + x, 67 + y, 1, 7);
        g2d.fillRect(120 + x, 71 + y, 1, 3);
        g2d.fillRect(121 + x, 74 + y, 1, 4);
        g2d.fillRect(124 + x, 74 + y, 1, 5);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(121 + x, 79 + y, 1, 1);
        g2d.fillRect(123 + x, 79 + y, 1, 1);
        g2d.fillRect(122 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 62 + y, 1, 4);
        g2d.fillRect(120 + x, 62 + y, 1, 3);
        g2d.fillRect(121 + x, 62 + y, 1, 5);
        g2d.fillRect(120 + x, 67 + y, 1, 4);
        g2d.fillRect(122 + x, 67 + y, 1, 7);
        g2d.fillRect(123 + x, 74 + y, 1, 3);
        g2d.fillRect(122 + x, 77 + y, 1, 3);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(123 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 65 + y, 1, 2);
        g2d.fillRect(121 + x, 67 + y, 1, 7);
        g2d.fillRect(122 + x, 74 + y, 1, 3);
        g2d.fillRect(123 + x, 77 + y, 1, 1);
    }
}
