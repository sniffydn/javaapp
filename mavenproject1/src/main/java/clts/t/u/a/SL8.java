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
public class SL8 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public SL8()
    {
        super();
    }

    public SL8(ColorArray colorSwitch)
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
        paintSL(x,y,g2d);
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

    public void paintSL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 6, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(126 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 11);
        g2d.fillRect(89 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 1);
        g2d.fillRect(127 + x, 56 + y, 1, 2);
        g2d.fillRect(90 + x, 57 + y, 1, 3);
        g2d.fillRect(92 + x, 57 + y, 2, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 7);
        g2d.fillRect(121 + x, 57 + y, 1, 1);
        g2d.fillRect(88 + x, 58 + y, 1, 1);
        g2d.fillRect(91 + x, 58 + y, 1, 1);
        g2d.fillRect(124 + x, 58 + y, 1, 1);
        g2d.fillRect(126 + x, 58 + y, 1, 1);
        g2d.fillRect(95 + x, 60 + y, 1, 2);
        g2d.fillRect(94 + x, 62 + y, 1, 2);
        g2d.fillRect(91 + x, 63 + y, 3, 1);
        g2d.fillRect(124 + x, 63 + y, 1, 1);
        g2d.fillRect(93 + x, 64 + y, 1, 1);
        g2d.fillRect(97 + x, 64 + y, 1, 10);
        g2d.fillRect(121 + x, 64 + y, 1, 1);
        g2d.fillRect(92 + x, 65 + y, 1, 1);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(91 + x, 66 + y, 1, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 7);
        g2d.fillRect(123 + x, 66 + y, 1, 2);
        g2d.fillRect(88 + x, 67 + y, 1, 3);
        g2d.fillRect(126 + x, 67 + y, 1, 3);
        g2d.fillRect(95 + x, 68 + y, 1, 3);
        g2d.fillRect(124 + x, 68 + y, 1, 5);
        g2d.fillRect(89 + x, 70 + y, 1, 1);
        g2d.fillRect(125 + x, 70 + y, 1, 1);
        g2d.fillRect(94 + x, 71 + y, 1, 2);
        g2d.fillRect(90 + x, 72 + y, 2, 1);
        g2d.fillRect(89 + x, 73 + y, 1, 1);
        g2d.fillRect(92 + x, 73 + y, 2, 1);
        g2d.fillRect(96 + x, 73 + y, 1, 3);
        g2d.fillRect(120 + x, 73 + y, 1, 4);
        g2d.fillRect(125 + x, 73 + y, 1, 1);
        g2d.fillRect(88 + x, 74 + y, 1, 3);
        g2d.fillRect(93 + x, 74 + y, 1, 1);
        g2d.fillRect(126 + x, 74 + y, 1, 3);
        g2d.fillRect(92 + x, 75 + y, 1, 1);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(123 + x, 76 + y, 1, 1);
        g2d.fillRect(89 + x, 77 + y, 1, 1);
        g2d.fillRect(95 + x, 77 + y, 1, 3);
        g2d.fillRect(121 + x, 77 + y, 1, 3);
        g2d.fillRect(124 + x, 77 + y, 2, 1);
        g2d.fillRect(125 + x, 78 + y, 1, 2);
        g2d.fillRect(94 + x, 80 + y, 1, 3);
        g2d.fillRect(122 + x, 80 + y, 1, 3);
        g2d.fillRect(92 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(120 + x, 54 + y, 3, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 5);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(126 + x, 56 + y, 1, 2);
        g2d.fillRect(88 + x, 57 + y, 2, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 7);
        g2d.fillRect(125 + x, 57 + y, 1, 2);
        g2d.fillRect(89 + x, 58 + y, 1, 1);
        g2d.fillRect(122 + x, 58 + y, 1, 1);
        g2d.fillRect(92 + x, 64 + y, 1, 1);
        g2d.fillRect(122 + x, 64 + y, 1, 1);
        g2d.fillRect(91 + x, 65 + y, 1, 1);
        g2d.fillRect(121 + x, 65 + y, 1, 2);
        g2d.fillRect(123 + x, 65 + y, 1, 1);
        g2d.fillRect(89 + x, 66 + y, 1, 4);
        g2d.fillRect(90 + x, 66 + y, 1, 2);
        g2d.fillRect(122 + x, 66 + y, 1, 2);
        g2d.fillRect(124 + x, 66 + y, 1, 2);
        g2d.fillRect(125 + x, 66 + y, 1, 4);
        g2d.fillRect(123 + x, 68 + y, 1, 2);
        g2d.fillRect(96 + x, 69 + y, 1, 4);
        g2d.fillRect(120 + x, 72 + y, 1, 1);
        g2d.fillRect(90 + x, 73 + y, 1, 4);
        g2d.fillRect(91 + x, 73 + y, 1, 3);
        g2d.fillRect(124 + x, 73 + y, 1, 4);
        g2d.fillRect(89 + x, 74 + y, 1, 3);
        g2d.fillRect(92 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 74 + y, 1, 3);
        g2d.fillRect(122 + x, 74 + y, 2, 1);
        g2d.fillRect(125 + x, 74 + y, 1, 3);
        g2d.fillRect(95 + x, 75 + y, 1, 2);
        g2d.fillRect(123 + x, 75 + y, 1, 1);
        g2d.fillRect(122 + x, 76 + y, 1, 1);
        g2d.fillRect(123 + x, 77 + y, 1, 1);
        g2d.fillRect(122 + x, 78 + y, 1, 2);
        g2d.fillRect(94 + x, 79 + y, 1, 1);
        g2d.fillRect(123 + x, 81 + y, 1, 2);
        g2d.fillRect(93 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(89 + x, 53 + y, 5, 1);
        g2d.fillRect(88 + x, 54 + y, 1, 2);
        g2d.fillRect(94 + x, 54 + y, 1, 2);
        g2d.fillRect(123 + x, 54 + y, 3, 1);
        g2d.fillRect(93 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 2, 1);
        g2d.fillRect(126 + x, 55 + y, 1, 1);
        g2d.fillRect(87 + x, 56 + y, 1, 2);
        g2d.fillRect(96 + x, 56 + y, 1, 3);
        g2d.fillRect(125 + x, 56 + y, 1, 1);
        g2d.fillRect(122 + x, 57 + y, 1, 1);
        g2d.fillRect(124 + x, 57 + y, 1, 1);
        g2d.fillRect(95 + x, 58 + y, 1, 2);
        g2d.fillRect(120 + x, 58 + y, 1, 5);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(123 + x, 58 + y, 1, 2);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(124 + x, 59 + y, 1, 2);
        g2d.fillRect(89 + x, 60 + y, 1, 3);
        g2d.fillRect(125 + x, 60 + y, 1, 3);
        g2d.fillRect(94 + x, 61 + y, 1, 1);
        g2d.fillRect(93 + x, 62 + y, 1, 1);
        g2d.fillRect(90 + x, 63 + y, 1, 1);
        g2d.fillRect(121 + x, 63 + y, 3, 1);
        g2d.fillRect(120 + x, 65 + y, 1, 7);
        g2d.fillRect(91 + x, 67 + y, 1, 1);
        g2d.fillRect(121 + x, 67 + y, 1, 1);
        g2d.fillRect(90 + x, 68 + y, 1, 4);
        g2d.fillRect(122 + x, 68 + y, 1, 1);
        g2d.fillRect(121 + x, 72 + y, 1, 2);
        g2d.fillRect(123 + x, 72 + y, 1, 1);
        g2d.fillRect(122 + x, 73 + y, 1, 1);
        g2d.fillRect(91 + x, 76 + y, 1, 1);
        g2d.fillRect(90 + x, 77 + y, 1, 1);
        g2d.fillRect(122 + x, 77 + y, 1, 1);
        g2d.fillRect(89 + x, 78 + y, 1, 3);
        g2d.fillRect(124 + x, 78 + y, 1, 2);
        g2d.fillRect(125 + x, 80 + y, 1, 2);
        g2d.fillRect(90 + x, 81 + y, 1, 1);
        g2d.fillRect(91 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(95 + x, 55 + y, 1, 3);
        g2d.fillRect(122 + x, 55 + y, 3, 1);
        g2d.fillRect(91 + x, 56 + y, 2, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 2);
        g2d.fillRect(96 + x, 59 + y, 1, 10);
        g2d.fillRect(121 + x, 59 + y, 1, 1);
        g2d.fillRect(93 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 2, 1);
        g2d.fillRect(92 + x, 61 + y, 1, 1);
        g2d.fillRect(119 + x, 62 + y, 1, 4);
        g2d.fillRect(124 + x, 62 + y, 1, 1);
        g2d.fillRect(120 + x, 63 + y, 1, 2);
        g2d.fillRect(121 + x, 68 + y, 1, 2);
        g2d.fillRect(122 + x, 69 + y, 1, 2);
        g2d.fillRect(95 + x, 71 + y, 1, 4);
        g2d.fillRect(94 + x, 74 + y, 1, 5);
        g2d.fillRect(93 + x, 78 + y, 1, 4);
        g2d.fillRect(123 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(89 + x, 54 + y, 1, 1);
        g2d.fillRect(88 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 1, 2);
        g2d.fillRect(92 + x, 58 + y, 1, 1);
        g2d.fillRect(93 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 1);
        g2d.fillRect(122 + x, 61 + y, 1, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 6);
        g2d.fillRect(94 + x, 67 + y, 1, 4);
        g2d.fillRect(93 + x, 69 + y, 1, 3);
        g2d.fillRect(94 + x, 73 + y, 1, 1);
        g2d.fillRect(123 + x, 73 + y, 1, 1);
        g2d.fillRect(92 + x, 79 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(90 + x, 54 + y, 1, 3);
        g2d.fillRect(91 + x, 54 + y, 1, 2);
        g2d.fillRect(92 + x, 54 + y, 1, 2);
        g2d.fillRect(93 + x, 54 + y, 1, 1);
        g2d.fillRect(89 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 2);
        g2d.fillRect(125 + x, 55 + y, 1, 1);
        g2d.fillRect(122 + x, 56 + y, 3, 1);
        g2d.fillRect(91 + x, 57 + y, 1, 1);
        g2d.fillRect(123 + x, 57 + y, 1, 1);
        g2d.fillRect(93 + x, 58 + y, 2, 1);
        g2d.fillRect(91 + x, 59 + y, 1, 4);
        g2d.fillRect(92 + x, 59 + y, 1, 2);
        g2d.fillRect(90 + x, 60 + y, 1, 3);
        g2d.fillRect(121 + x, 60 + y, 1, 3);
        g2d.fillRect(93 + x, 61 + y, 1, 1);
        g2d.fillRect(123 + x, 61 + y, 1, 2);
        g2d.fillRect(124 + x, 61 + y, 1, 1);
        g2d.fillRect(92 + x, 62 + y, 1, 1);
        g2d.fillRect(122 + x, 62 + y, 1, 1);
        g2d.fillRect(94 + x, 64 + y, 1, 3);
        g2d.fillRect(93 + x, 65 + y, 1, 4);
        g2d.fillRect(92 + x, 66 + y, 1, 7);
        g2d.fillRect(91 + x, 68 + y, 1, 4);
        g2d.fillRect(121 + x, 70 + y, 1, 2);
        g2d.fillRect(123 + x, 70 + y, 1, 2);
        g2d.fillRect(122 + x, 71 + y, 1, 2);
        g2d.fillRect(93 + x, 72 + y, 1, 1);
        g2d.fillRect(93 + x, 75 + y, 1, 3);
        g2d.fillRect(92 + x, 76 + y, 1, 3);
        g2d.fillRect(91 + x, 77 + y, 1, 5);
        g2d.fillRect(90 + x, 78 + y, 1, 3);
        g2d.fillRect(123 + x, 79 + y, 1, 2);
        g2d.fillRect(124 + x, 80 + y, 1, 3);
        g2d.fillRect(92 + x, 81 + y, 1, 2);
    }
}
