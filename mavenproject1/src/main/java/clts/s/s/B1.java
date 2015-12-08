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
import pieces.p.LittleBuckle0;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class B1 extends B
{
    /** Creates a new instance of Shoes1 */
    Piece rightBuckle = new LittleBuckle0();
    Piece leftBuckle = new LittleBuckle0(false);
    public B1()
    {
        super();
        init();
        rightBuckle = new LittleBuckle0(COLORS);
        leftBuckle = new LittleBuckle0(COLORS, false);
        police = true;
    }

    public B1(ColorArray colorSwitch)
    {
        super(colorSwitch);
        init();
        rightBuckle = new LittleBuckle0(colorSwitch);
        leftBuckle = new LittleBuckle0(colorSwitch, false);
        police = true;
    }

    private void init()
    {
        strapAllowed = false;
        notSlenderS = true;
    }

    public void setColors(ColorArray COLORS)
    {
        super.setColors(COLORS);
        rightBuckle.setColors(COLORS);
        leftBuckle.setColors(COLORS);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {

        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
            rightBuckle.paint(1 + tempXpos + x, -40 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -31 + tempYpos, g2d);
        }
        else if(step == 1 || step == 7)
        {
            rightBuckle.paint(1 + tempXpos + x, -40 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -32 + tempYpos, g2d);
        }
        else if(step == 2 || step == 6)
        {
            rightBuckle.paint(1 + tempXpos + x, -39 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -32 + tempYpos, g2d);
        }
        else if(step == 3 || step == 4 || step == 5)
        {
            rightBuckle.paint(1 + tempXpos + x, -39 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            rightBuckle.paint(0 + tempXpos + x, -32 + tempYpos, g2d);
        }
        super.paintRight(x, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
            leftBuckle.paint(-1 + tempXpos + x, -40 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -31 + tempYpos, g2d);
        }
        else if(step == 9 || step == 15)
        {
            leftBuckle.paint(-1 + tempXpos + x, -40 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -32 + tempYpos, g2d);
        }
        else if(step == 10 || step == 14)
        {
            leftBuckle.paint(-1 + tempXpos + x, -39 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -32 + tempYpos, g2d);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            leftBuckle.paint(-1 + tempXpos + x, -39 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -36 + tempYpos, g2d);
            leftBuckle.paint(0 + tempXpos + x, -32 + tempYpos, g2d);
        }
        super.paintLeft(x, g2d);
    }
}
