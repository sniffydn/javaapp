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
public class SL2 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public SL2()
    {
        super();
    }

    public SL2(ColorArray colorSwitch)
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
        g2d.fillRect(93 + x, 50 + y, 1, 2);
        g2d.fillRect(93 + x, 57 + y, 1, 2);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 57 + y, 1, 6);
        g2d.fillRect(96 + x, 59 + y, 1, 2);
        g2d.fillRect(95 + x, 61 + y, 1, 2);
        g2d.fillRect(94 + x, 63 + y, 1, 1);
        g2d.fillRect(97 + x, 63 + y, 1, 5);
        g2d.fillRect(93 + x, 64 + y, 1, 3);
        g2d.fillRect(92 + x, 67 + y, 1, 3);
        g2d.fillRect(96 + x, 68 + y, 1, 10);
        g2d.fillRect(91 + x, 70 + y, 1, 1);
        g2d.fillRect(90 + x, 72 + y, 1, 3);
        g2d.fillRect(89 + x, 75 + y, 1, 3);
        g2d.fillRect(97 + x, 76 + y, 1, 6);
        g2d.fillRect(95 + x, 77 + y, 1, 1);
        g2d.fillRect(88 + x, 78 + y, 1, 6);
        g2d.fillRect(93 + x, 78 + y, 1, 2);
        g2d.fillRect(94 + x, 78 + y, 1, 1);
        g2d.fillRect(92 + x, 79 + y, 1, 2);
        g2d.fillRect(91 + x, 80 + y, 1, 3);
        g2d.fillRect(98 + x, 81 + y, 1, 3);
        g2d.fillRect(90 + x, 82 + y, 1, 3);
        g2d.fillRect(89 + x, 84 + y, 1, 1);
        g2d.fillRect(91 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 49 + y, 1, 4);
        g2d.fillRect(95 + x, 49 + y, 1, 2);
        g2d.fillRect(96 + x, 49 + y, 3, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 52 + y, 1, 5);
        g2d.fillRect(95 + x, 53 + y, 2, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 57 + y, 1, 3);
        g2d.fillRect(95 + x, 59 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 2);
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(95 + x, 63 + y, 1, 1);
        g2d.fillRect(94 + x, 64 + y, 1, 3);
        g2d.fillRect(96 + x, 64 + y, 1, 4);
        g2d.fillRect(93 + x, 67 + y, 1, 3);
        g2d.fillRect(95 + x, 68 + y, 1, 9);
        g2d.fillRect(92 + x, 70 + y, 1, 2);
        g2d.fillRect(91 + x, 71 + y, 1, 3);
        g2d.fillRect(93 + x, 77 + y, 2, 1);
        g2d.fillRect(89 + x, 78 + y, 1, 6);
        g2d.fillRect(92 + x, 78 + y, 1, 1);
        g2d.fillRect(96 + x, 78 + y, 1, 4);
        g2d.fillRect(91 + x, 79 + y, 1, 1);
        g2d.fillRect(90 + x, 80 + y, 1, 2);
        g2d.fillRect(92 + x, 81 + y, 1, 3);
        g2d.fillRect(97 + x, 82 + y, 1, 2);
        g2d.fillRect(91 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 50 + y, 1, 3);
        g2d.fillRect(97 + x, 50 + y, 1, 2);
        g2d.fillRect(95 + x, 51 + y, 1, 2);
        g2d.fillRect(96 + x, 56 + y, 1, 3);
        g2d.fillRect(95 + x, 57 + y, 1, 2);
        g2d.fillRect(97 + x, 62 + y, 1, 1);
        g2d.fillRect(93 + x, 70 + y, 1, 1);
        g2d.fillRect(94 + x, 71 + y, 1, 6);
        g2d.fillRect(92 + x, 72 + y, 1, 3);
        g2d.fillRect(91 + x, 74 + y, 1, 3);
        g2d.fillRect(90 + x, 75 + y, 1, 5);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(92 + x, 77 + y, 1, 1);
        g2d.fillRect(91 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 62 + y, 1, 2);
        g2d.fillRect(95 + x, 64 + y, 1, 4);
        g2d.fillRect(94 + x, 67 + y, 1, 4);
        g2d.fillRect(93 + x, 71 + y, 1, 5);
        g2d.fillRect(92 + x, 75 + y, 1, 2);
        g2d.fillRect(91 + x, 77 + y, 1, 1);
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 61 + y, 1, 1);
        g2d.fillRect(119 + x, 62 + y, 1, 1);
        g2d.fillRect(118 + x, 63 + y, 1, 3);
        g2d.fillRect(120 + x, 63 + y, 2, 1);
        g2d.fillRect(122 + x, 64 + y, 1, 3);
        g2d.fillRect(119 + x, 66 + y, 1, 11);
        g2d.fillRect(123 + x, 67 + y, 1, 2);
        g2d.fillRect(124 + x, 69 + y, 1, 2);
        g2d.fillRect(125 + x, 71 + y, 1, 3);
        g2d.fillRect(120 + x, 73 + y, 1, 1);
        g2d.fillRect(126 + x, 73 + y, 1, 3);
        g2d.fillRect(121 + x, 74 + y, 1, 1);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(123 + x, 76 + y, 1, 1);
        g2d.fillRect(127 + x, 76 + y, 1, 9);
        g2d.fillRect(118 + x, 77 + y, 1, 5);
        g2d.fillRect(124 + x, 77 + y, 1, 1);
        g2d.fillRect(125 + x, 78 + y, 1, 2);
        g2d.fillRect(126 + x, 79 + y, 1, 3);
        g2d.fillRect(128 + x, 81 + y, 1, 3);
        g2d.fillRect(119 + x, 82 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(125 + x, 84 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(122 + x, 67 + y, 1, 2);
        g2d.fillRect(123 + x, 69 + y, 1, 2);
        g2d.fillRect(124 + x, 71 + y, 1, 2);
        g2d.fillRect(121 + x, 73 + y, 1, 1);
        g2d.fillRect(120 + x, 74 + y, 1, 3);
        g2d.fillRect(122 + x, 74 + y, 1, 1);
        g2d.fillRect(125 + x, 74 + y, 1, 2);
        g2d.fillRect(121 + x, 75 + y, 1, 7);
        g2d.fillRect(123 + x, 75 + y, 1, 1);
        g2d.fillRect(124 + x, 76 + y, 1, 1);
        g2d.fillRect(126 + x, 76 + y, 1, 3);
        g2d.fillRect(119 + x, 77 + y, 1, 5);
        g2d.fillRect(125 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 3);
        g2d.fillRect(125 + x, 82 + y, 1, 2);
        g2d.fillRect(126 + x, 82 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 62 + y, 1, 1);
        g2d.fillRect(119 + x, 63 + y, 1, 3);
        g2d.fillRect(120 + x, 64 + y, 1, 9);
        g2d.fillRect(121 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 66 + y, 1, 1);
        g2d.fillRect(122 + x, 69 + y, 1, 2);
        g2d.fillRect(123 + x, 71 + y, 1, 2);
        g2d.fillRect(122 + x, 73 + y, 1, 1);
        g2d.fillRect(124 + x, 73 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(124 + x, 75 + y, 1, 1);
        g2d.fillRect(125 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(121 + x, 65 + y, 1, 1);
        g2d.fillRect(121 + x, 67 + y, 1, 6);
        g2d.fillRect(122 + x, 71 + y, 1, 2);
        g2d.fillRect(123 + x, 73 + y, 1, 1);
        g2d.fillRect(124 + x, 74 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 4);
        g2d.fillRect(125 + x, 80 + y, 1, 2);
    }

    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {

        if(leftA == 0)
        {
            drawSleevesLeft0(x,y,g2d);
        }
        if(rightA == 0)
        {
            drawSleevesRight0(x,y,g2d);
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
