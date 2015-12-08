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
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class GL2 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public GL2()
    {
        super();
    }

    public GL2(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {}
    public void drawSleevesLeft1(int x, int y, GraphicsMap g2d)
    {}
    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {}
    
    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        leftA = leftArm;
        rightA = rightArm;
    }
    public void drawSleevesFront(int x, int y, GraphicsMap g2d)
    {
        if(leftA == 1)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(91 + x, 64 + y, 2, 1);
            g2d.fillRect(88 + x, 65 + y, 1, 2);
            g2d.fillRect(89 + x, 65 + y, 2, 1);
            g2d.fillRect(93 + x, 65 + y, 1, 2);
            g2d.fillRect(89 + x, 67 + y, 1, 2);
            g2d.fillRect(94 + x, 67 + y, 1, 3);
            g2d.fillRect(90 + x, 69 + y, 1, 1);
            g2d.fillRect(91 + x, 70 + y, 1, 2);
            g2d.fillRect(95 + x, 70 + y, 1, 1);
            g2d.fillRect(96 + x, 71 + y, 1, 2);
            g2d.fillRect(92 + x, 72 + y, 1, 1);
            g2d.fillRect(93 + x, 73 + y, 1, 1);
            g2d.fillRect(97 + x, 73 + y, 2, 1);
            g2d.fillRect(101 + x, 73 + y, 2, 1);
            g2d.fillRect(94 + x, 74 + y, 1, 1);
            g2d.fillRect(98 + x, 74 + y, 3, 1);
            g2d.fillRect(103 + x, 74 + y, 1, 1);
            g2d.fillRect(95 + x, 75 + y, 1, 1);
            g2d.fillRect(99 + x, 75 + y, 1, 2);
            g2d.fillRect(104 + x, 75 + y, 1, 2);
            g2d.fillRect(96 + x, 76 + y, 1, 2);
            g2d.fillRect(97 + x, 77 + y, 1, 2);
            g2d.fillRect(102 + x, 77 + y, 2, 1);
            g2d.fillRect(98 + x, 78 + y, 1, 1);
            g2d.fillRect(101 + x, 78 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(91 + x, 65 + y, 1, 3);
            g2d.fillRect(92 + x, 65 + y, 1, 2);
            g2d.fillRect(89 + x, 66 + y, 2, 1);
            g2d.fillRect(90 + x, 67 + y, 1, 2);
            g2d.fillRect(93 + x, 67 + y, 1, 2);
            g2d.fillRect(91 + x, 69 + y, 1, 1);
            g2d.fillRect(92 + x, 70 + y, 1, 2);
            g2d.fillRect(93 + x, 71 + y, 1, 2);
            g2d.fillRect(95 + x, 71 + y, 1, 1);
            g2d.fillRect(94 + x, 73 + y, 1, 1);
            g2d.fillRect(96 + x, 73 + y, 1, 1);
            g2d.fillRect(95 + x, 74 + y, 1, 1);
            g2d.fillRect(97 + x, 74 + y, 1, 1);
            g2d.fillRect(101 + x, 74 + y, 1, 2);
            g2d.fillRect(102 + x, 74 + y, 1, 1);
            g2d.fillRect(98 + x, 75 + y, 1, 1);
            g2d.fillRect(100 + x, 75 + y, 1, 4);
            g2d.fillRect(99 + x, 77 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(92 + x, 67 + y, 1, 3);
            g2d.fillRect(91 + x, 68 + y, 1, 1);
            g2d.fillRect(93 + x, 69 + y, 1, 2);
            g2d.fillRect(94 + x, 70 + y, 1, 3);
            g2d.fillRect(95 + x, 72 + y, 1, 2);
            g2d.fillRect(96 + x, 74 + y, 1, 2);
            g2d.fillRect(97 + x, 75 + y, 1, 2);
            g2d.fillRect(102 + x, 75 + y, 1, 2);
            g2d.fillRect(103 + x, 75 + y, 1, 2);
            g2d.fillRect(98 + x, 76 + y, 1, 2);
            g2d.fillRect(101 + x, 76 + y, 1, 2);
        }
    }
    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {
        if(rightA == 0)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(119 + x, 66 + y, 1, 5);
            g2d.fillRect(120 + x, 66 + y, 3, 1);
            g2d.fillRect(123 + x, 67 + y, 1, 7);
            g2d.fillRect(120 + x, 71 + y, 1, 3);
            g2d.fillRect(121 + x, 74 + y, 1, 7);
            g2d.fillRect(124 + x, 74 + y, 1, 9);
            g2d.fillRect(123 + x, 83 + y, 1, 1);
            g2d.fillRect(122 + x, 84 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(120 + x, 67 + y, 1, 4);
            g2d.fillRect(121 + x, 67 + y, 1, 2);
            g2d.fillRect(122 + x, 67 + y, 1, 7);
            g2d.fillRect(123 + x, 74 + y, 1, 9);
            g2d.fillRect(122 + x, 78 + y, 1, 6);
            g2d.fillRect(121 + x, 81 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(121 + x, 69 + y, 1, 5);
            g2d.fillRect(122 + x, 74 + y, 1, 4);
        }

        if(leftA == 0)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(93 + x, 67 + y, 5, 1);
            g2d.fillRect(92 + x, 68 + y, 1, 9);
            g2d.fillRect(96 + x, 68 + y, 1, 10);
            g2d.fillRect(91 + x, 77 + y, 1, 8);
            g2d.fillRect(95 + x, 78 + y, 1, 2);
            g2d.fillRect(94 + x, 80 + y, 1, 1);
            g2d.fillRect(95 + x, 81 + y, 2, 1);
            g2d.fillRect(97 + x, 82 + y, 1, 1);
            g2d.fillRect(95 + x, 83 + y, 1, 2);
            g2d.fillRect(96 + x, 83 + y, 1, 1);
            g2d.fillRect(92 + x, 84 + y, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(93 + x, 68 + y, 1, 9);
            g2d.fillRect(94 + x, 68 + y, 1, 2);
            g2d.fillRect(95 + x, 68 + y, 1, 10);
            g2d.fillRect(92 + x, 77 + y, 1, 7);
            g2d.fillRect(94 + x, 78 + y, 1, 2);
            g2d.fillRect(94 + x, 81 + y, 1, 1);
            g2d.fillRect(95 + x, 82 + y, 2, 1);
            g2d.fillRect(93 + x, 83 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(94 + x, 70 + y, 1, 8);
            g2d.fillRect(93 + x, 77 + y, 1, 6);
            g2d.fillRect(94 + x, 82 + y, 1, 1);
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
        drawSleevesFront(offsetX, 0, g2d);
    }
}
