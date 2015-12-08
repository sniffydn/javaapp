/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import clts.SuperS;
import util.Color;
import obsolete.B;
import util.GraphicsMap;
import pieces.p.LittleBow1;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class B2 extends B
{
    /** Creates a new instance of Shoes1 */
    Piece right = new LittleBow1(4, true);
    Piece left = new LittleBow1(4, false);
    public B2()
    {
        super();
        strapAllowed = false;
        notSlenderS = true;
        right = new LittleBow1(4, true, COLORS);
        left = new LittleBow1(4, false, COLORS);
        police = true;
    }

    public B2(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        notSlenderS = true;
        right = new LittleBow1(4, true, colorSwitch);
        left = new LittleBow1(4, false, colorSwitch);
        police = true;
    }



    public void setColors(ColorArray COLORS)
    {
        super.setColors(COLORS);
        right.setColors(COLORS);
        left.setColors(COLORS);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
            right.paint(4 + tempXpos + x, -42 + tempYpos, g2d);
            left.paint(-4 + tempXpos + x, -42 + tempYpos, g2d);
        }
        else if(step == 1 || step == 7)
        {
            right.paint(4 + tempXpos + x, -41 + tempYpos, g2d);
            left.paint(-4 + tempXpos + x, -41 + tempYpos, g2d);
        }
        else if(step == 2 || step == 6)
        {
            right.paint(4 + tempXpos + x, -40 + tempYpos, g2d);
            left.paint(-4 + tempXpos + x, -40 + tempYpos, g2d);
        }
        else if(step == 3 || step == 4 || step == 5)
        {
            right.paint(4 + tempXpos + x, -38 + tempYpos, g2d);
            left.paint(-4 + tempXpos + x, -38 + tempYpos, g2d);
        }
        super.paintRight(x, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
            left.paint(-4 + tempXpos + x, -42 + tempYpos, g2d);
            right.paint(4 + tempXpos + x, -42 + tempYpos, g2d);
        }
        else if(step == 9 || step == 15)
        {
            left.paint(-4 + tempXpos + x, -41 + tempYpos, g2d);
            right.paint(4 + tempXpos + x, -41 + tempYpos, g2d);
        }
        else if(step == 10 || step == 14)
        {
            left.paint(-4 + tempXpos + x, -40 + tempYpos, g2d);
            right.paint(4 + tempXpos + x, -40 + tempYpos, g2d);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            left.paint(-4 + tempXpos + x, -38 + tempYpos, g2d);
            right.paint(4 + tempXpos + x, -38 + tempYpos, g2d);
        }
        super.paintLeft(x, g2d);
    }
}
