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
public class SL4 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public SL4()
    {
        super();
    }

    public SL4(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        leftA = leftArm;
        rightA = rightArm;
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 46 + y, 1, 1);
        g2d.fillRect(95 + x, 46 + y, 1, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 1);
        g2d.fillRect(94 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 48 + y, 1, 1);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(94 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(93 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 1);
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(93 + x, 54 + y, 1, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(97 + x, 54 + y, 1, 1);
        g2d.fillRect(94 + x, 55 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 57 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(93 + x, 58 + y, 1, 1);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(96 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(120 + x, 59 + y, 1, 1);
        g2d.fillRect(93 + x, 60 + y, 1, 1);
        g2d.fillRect(95 + x, 60 + y, 1, 1);
        g2d.fillRect(97 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(94 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(118 + x, 61 + y, 1, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(93 + x, 62 + y, 1, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(97 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(119 + x, 62 + y, 1, 1);
        g2d.fillRect(121 + x, 62 + y, 1, 1);
        g2d.fillRect(94 + x, 63 + y, 1, 1);
        g2d.fillRect(96 + x, 63 + y, 1, 1);
        g2d.fillRect(118 + x, 63 + y, 1, 1);
        g2d.fillRect(120 + x, 63 + y, 1, 1);
        g2d.fillRect(122 + x, 63 + y, 1, 1);
        g2d.fillRect(93 + x, 64 + y, 1, 1);
        g2d.fillRect(95 + x, 64 + y, 1, 1);
        g2d.fillRect(97 + x, 64 + y, 1, 1);
        g2d.fillRect(119 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 64 + y, 1, 1);
        g2d.fillRect(94 + x, 65 + y, 1, 1);
        g2d.fillRect(96 + x, 65 + y, 1, 1);
        g2d.fillRect(118 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 65 + y, 1, 1);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(93 + x, 66 + y, 1, 1);
        g2d.fillRect(95 + x, 66 + y, 1, 1);
        g2d.fillRect(97 + x, 66 + y, 1, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 1);
        g2d.fillRect(121 + x, 66 + y, 1, 1);
        g2d.fillRect(92 + x, 67 + y, 1, 1);
        g2d.fillRect(94 + x, 67 + y, 1, 1);
        g2d.fillRect(96 + x, 67 + y, 1, 1);
        g2d.fillRect(120 + x, 67 + y, 1, 1);
        g2d.fillRect(122 + x, 67 + y, 1, 1);
        g2d.fillRect(93 + x, 68 + y, 1, 1);
        g2d.fillRect(95 + x, 68 + y, 1, 1);
        g2d.fillRect(97 + x, 68 + y, 1, 1);
        g2d.fillRect(119 + x, 68 + y, 1, 1);
        g2d.fillRect(121 + x, 68 + y, 1, 1);
        g2d.fillRect(123 + x, 68 + y, 1, 1);
        g2d.fillRect(92 + x, 69 + y, 1, 1);
        g2d.fillRect(94 + x, 69 + y, 1, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 1);
        g2d.fillRect(120 + x, 69 + y, 1, 1);
        g2d.fillRect(122 + x, 69 + y, 1, 1);
        g2d.fillRect(93 + x, 70 + y, 1, 1);
        g2d.fillRect(95 + x, 70 + y, 1, 1);
        g2d.fillRect(97 + x, 70 + y, 1, 1);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(121 + x, 70 + y, 1, 1);
        g2d.fillRect(123 + x, 70 + y, 1, 1);
        g2d.fillRect(92 + x, 71 + y, 1, 1);
        g2d.fillRect(94 + x, 71 + y, 1, 1);
        g2d.fillRect(96 + x, 71 + y, 1, 1);
        g2d.fillRect(98 + x, 71 + y, 1, 1);
        g2d.fillRect(120 + x, 71 + y, 1, 1);
        g2d.fillRect(122 + x, 71 + y, 1, 1);
        g2d.fillRect(124 + x, 71 + y, 1, 1);
        g2d.fillRect(91 + x, 72 + y, 1, 1);
        g2d.fillRect(93 + x, 72 + y, 1, 1);
        g2d.fillRect(95 + x, 72 + y, 1, 1);
        g2d.fillRect(97 + x, 72 + y, 1, 1);
        g2d.fillRect(121 + x, 72 + y, 1, 1);
        g2d.fillRect(123 + x, 72 + y, 1, 1);
        g2d.fillRect(125 + x, 72 + y, 1, 1);
        g2d.fillRect(92 + x, 73 + y, 1, 1);
        g2d.fillRect(94 + x, 73 + y, 1, 1);
        g2d.fillRect(96 + x, 73 + y, 1, 1);
        g2d.fillRect(98 + x, 73 + y, 1, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 1);
        g2d.fillRect(122 + x, 73 + y, 1, 1);
        g2d.fillRect(124 + x, 73 + y, 1, 1);
        g2d.fillRect(91 + x, 74 + y, 1, 1);
        g2d.fillRect(93 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 1);
        g2d.fillRect(97 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(125 + x, 74 + y, 1, 1);
        g2d.fillRect(90 + x, 75 + y, 1, 1);
        g2d.fillRect(92 + x, 75 + y, 1, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 1);
        g2d.fillRect(96 + x, 75 + y, 1, 1);
        g2d.fillRect(98 + x, 75 + y, 1, 1);
        g2d.fillRect(120 + x, 75 + y, 1, 1);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(124 + x, 75 + y, 1, 1);
        g2d.fillRect(91 + x, 76 + y, 1, 1);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(95 + x, 76 + y, 1, 1);
        g2d.fillRect(97 + x, 76 + y, 1, 1);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(123 + x, 76 + y, 1, 1);
        g2d.fillRect(125 + x, 76 + y, 1, 1);
        g2d.fillRect(92 + x, 77 + y, 1, 1);
        g2d.fillRect(94 + x, 77 + y, 1, 1);
        g2d.fillRect(96 + x, 77 + y, 1, 1);
        g2d.fillRect(98 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(122 + x, 77 + y, 1, 1);
        g2d.fillRect(124 + x, 77 + y, 1, 1);
        g2d.fillRect(93 + x, 78 + y, 1, 1);
        g2d.fillRect(95 + x, 78 + y, 1, 1);
        g2d.fillRect(97 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(123 + x, 78 + y, 1, 1);
        g2d.fillRect(125 + x, 78 + y, 1, 1);
        g2d.fillRect(94 + x, 79 + y, 1, 1);
        g2d.fillRect(96 + x, 79 + y, 1, 1);
        g2d.fillRect(122 + x, 79 + y, 1, 1);
        g2d.fillRect(124 + x, 79 + y, 1, 2);
        g2d.fillRect(95 + x, 80 + y, 1, 1);
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
