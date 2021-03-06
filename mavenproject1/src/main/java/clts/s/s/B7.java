/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import obsolete.*;
import clts.SuperS;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class B7 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public B7()
    {
        super();
    }

    public B7(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        if(step == 3 || step == 4 || step == 5)
        {
            paintS6(rightXpos + x, rightYpos, g2d);
        }
        else if(step == 2 || step == 6)
        {
            paintS5(rightXpos + x, rightYpos, g2d);
        }
        else if(step == 1 || step == 7)
        {
            paintS4(rightXpos + x, rightYpos, g2d);
        }
        else
        {
            paintS1(rightXpos + x, rightYpos, g2d);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        if(step == 11 || step == 12 || step == 13)
        {
            paintBackS6(leftXpos + x, leftYpos, g2d);
        }
        else if(step == 10 || step == 14)
        {
            paintBackS5(leftXpos + x, leftYpos, g2d);
        }
        else if(step == 9 || step == 15)
        {
            paintBackS4(leftXpos + x, leftYpos, g2d);
        }
        else
        {
            paintBackS1(leftXpos + x, leftYpos, g2d);
        }
    }
    
    public void paintS6(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-3 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -15 + y, 1, 1);
        g2d.fillRect(-5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(0 + x, -39 + y, 2, 1);
        g2d.fillRect(-2 + x, -38 + y, 1, 2);
        g2d.fillRect(-1 + x, -38 + y, 1, 1);
        g2d.fillRect(3 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 1, 3);
        g2d.fillRect(-3 + x, -36 + y, 1, 2);
        g2d.fillRect(2 + x, -36 + y, 1, 1);
        g2d.fillRect(-4 + x, -35 + y, 1, 2);
        g2d.fillRect(5 + x, -35 + y, 1, 3);
        g2d.fillRect(-5 + x, -33 + y, 1, 1);
        g2d.fillRect(-2 + x, -32 + y, 1, 1);
        g2d.fillRect(1 + x, -32 + y, 2, 1);
        g2d.fillRect(-2 + x, -30 + y, 1, 2);
        g2d.fillRect(1 + x, -30 + y, 1, 6);
        g2d.fillRect(-1 + x, -28 + y, 1, 1);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(-3 + x, -25 + y, 1, 2);
        g2d.fillRect(0 + x, -24 + y, 1, 3);
        g2d.fillRect(-1 + x, -23 + y, 1, 1);
        g2d.fillRect(-2 + x, -21 + y, 1, 1);
        g2d.fillRect(-3 + x, -19 + y, 1, 2);
        g2d.fillRect(-2 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -13 + y, 1, 1);
        g2d.fillRect(-2 + x, -13 + y, 1, 1);
        g2d.fillRect(-1 + x, -11 + y, 1, 1);
        g2d.fillRect(-4 + x, -10 + y, 1, 1);
        g2d.fillRect(-2 + x, -9 + y, 1, 1);
        g2d.fillRect(-5 + x, -8 + y, 1, 3);
        g2d.fillRect(-3 + x, -8 + y, 1, 1);
        g2d.fillRect(-1 + x, -7 + y, 1, 1);
        g2d.fillRect(-2 + x, -6 + y, 1, 4);
        g2d.fillRect(-5 + x, -4 + y, 1, 1);
        g2d.fillRect(-3 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -2 + y, 3, 1);
        g2d.fillRect(-1 + x, -2 + y, 1, 1);
        g2d.fillRect(-4 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-1 + x, -41 + y, 1, 2);
        g2d.fillRect(-2 + x, -40 + y, 1, 2);
        g2d.fillRect(0 + x, -40 + y, 4, 1);
        g2d.fillRect(-4 + x, -39 + y, 1, 1);
        g2d.fillRect(2 + x, -39 + y, 4, 1);
        g2d.fillRect(-5 + x, -38 + y, 1, 2);
        g2d.fillRect(-3 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -38 + y, 2, 1);
        g2d.fillRect(5 + x, -37 + y, 1, 2);
        g2d.fillRect(-5 + x, -34 + y, 1, 1);
        g2d.fillRect(4 + x, -34 + y, 1, 1);
        g2d.fillRect(-4 + x, -33 + y, 1, 1);
        g2d.fillRect(3 + x, -33 + y, 1, 1);
        g2d.fillRect(-5 + x, -32 + y, 1, 1);
        g2d.fillRect(-3 + x, -32 + y, 1, 7);
        g2d.fillRect(4 + x, -32 + y, 1, 1);
        g2d.fillRect(-4 + x, -31 + y, 1, 1);
        g2d.fillRect(-2 + x, -31 + y, 6, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 6);
        g2d.fillRect(3 + x, -30 + y, 1, 1);
        g2d.fillRect(0 + x, -29 + y, 1, 1);
        g2d.fillRect(-2 + x, -28 + y, 1, 5);
        g2d.fillRect(-1 + x, -25 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 9);
        g2d.fillRect(-3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(-2 + x, -20 + y, 1, 1);
        g2d.fillRect(-4 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(-4 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -13 + y, 1, 2);
        g2d.fillRect(-1 + x, -13 + y, 1, 2);
        g2d.fillRect(-2 + x, -12 + y, 1, 1);
        g2d.fillRect(-1 + x, -10 + y, 1, 3);
        g2d.fillRect(-6 + x, -8 + y, 1, 5);
        g2d.fillRect(-2 + x, -8 + y, 1, 2);
        g2d.fillRect(-3 + x, -7 + y, 1, 2);
        g2d.fillRect(-4 + x, -6 + y, 1, 1);
        g2d.fillRect(-7 + x, -5 + y, 1, 5);
        g2d.fillRect(-1 + x, -5 + y, 1, 1);
        g2d.fillRect(-1 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -1 + y, 1, 2);
        g2d.fillRect(-1 + x, -1 + y, 1, 2);
        g2d.fillRect(-5 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-4 + x, -16 + y, 1, 1);
        g2d.fillRect(-2 + x, -15 + y, 1, 1);
        g2d.fillRect(-4 + x, -11 + y, 1, 1);
        g2d.fillRect(-5 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -41 + y, 1, 1);
        g2d.fillRect(-3 + x, -39 + y, 1, 1);
        g2d.fillRect(-1 + x, -39 + y, 1, 1);
        g2d.fillRect(0 + x, -38 + y, 1, 2);
        g2d.fillRect(1 + x, -38 + y, 1, 1);
        g2d.fillRect(-4 + x, -37 + y, 2, 1);
        g2d.fillRect(3 + x, -37 + y, 1, 1);
        g2d.fillRect(-5 + x, -36 + y, 1, 1);
        g2d.fillRect(-2 + x, -36 + y, 2, 1);
        g2d.fillRect(-1 + x, -35 + y, 2, 1);
        g2d.fillRect(2 + x, -35 + y, 1, 2);
        g2d.fillRect(3 + x, -35 + y, 1, 1);
        g2d.fillRect(-3 + x, -34 + y, 1, 1);
        g2d.fillRect(0 + x, -34 + y, 1, 1);
        g2d.fillRect(1 + x, -33 + y, 1, 1);
        g2d.fillRect(4 + x, -33 + y, 1, 1);
        g2d.fillRect(-1 + x, -32 + y, 2, 1);
        g2d.fillRect(3 + x, -32 + y, 1, 1);
        g2d.fillRect(0 + x, -30 + y, 1, 1);
        g2d.fillRect(-1 + x, -27 + y, 1, 2);
        g2d.fillRect(-1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(-1 + x, -18 + y, 1, 1);
        g2d.fillRect(-5 + x, -16 + y, 1, 3);
        g2d.fillRect(-3 + x, -16 + y, 1, 4);
        g2d.fillRect(-3 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -8 + y, 1, 2);
        g2d.fillRect(-4 + x, -5 + y, 2, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 1);
        g2d.fillRect(-4 + x, -3 + y, 1, 1);
        g2d.fillRect(-3 + x, -2 + y, 2, 1);
        g2d.fillRect(-5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-4 + x, -38 + y, 1, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(-1 + x, -37 + y, 1, 1);
        g2d.fillRect(1 + x, -37 + y, 1, 4);
        g2d.fillRect(-4 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -36 + y, 1, 1);
        g2d.fillRect(3 + x, -36 + y, 1, 1);
        g2d.fillRect(-5 + x, -35 + y, 1, 1);
        g2d.fillRect(-2 + x, -35 + y, 1, 3);
        g2d.fillRect(-1 + x, -34 + y, 1, 2);
        g2d.fillRect(3 + x, -34 + y, 1, 1);
        g2d.fillRect(-3 + x, -33 + y, 1, 1);
        g2d.fillRect(0 + x, -33 + y, 1, 1);
        g2d.fillRect(2 + x, -33 + y, 1, 1);
        g2d.fillRect(-4 + x, -32 + y, 1, 1);
        g2d.fillRect(-1 + x, -30 + y, 1, 2);
        g2d.fillRect(0 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -25 + y, 1, 1);
        g2d.fillRect(-2 + x, -23 + y, 1, 2);
        g2d.fillRect(-1 + x, -22 + y, 1, 1);
        g2d.fillRect(-2 + x, -17 + y, 1, 2);
        g2d.fillRect(-4 + x, -12 + y, 2, 1);
        g2d.fillRect(-3 + x, -11 + y, 2, 1);
        g2d.fillRect(-2 + x, -10 + y, 1, 1);
        g2d.fillRect(-1 + x, -6 + y, 1, 1);
        g2d.fillRect(-5 + x, -5 + y, 1, 1);
        g2d.fillRect(-4 + x, -4 + y, 1, 1);
        g2d.fillRect(-1 + x, -4 + y, 1, 1);
        g2d.fillRect(-6 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-4 + x, -17 + y, 1, 1);
        g2d.fillRect(-2 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -11 + y, 1, 1);
        g2d.fillRect(-3 + x, -9 + y, 1, 1);
    }





    public void paintS1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-3 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -15 + y, 1, 1);
        g2d.fillRect(-5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(0 + x, -43 + y, 2, 1);
        g2d.fillRect(-2 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -42 + y, 1, 1);
        g2d.fillRect(3 + x, -42 + y, 1, 1);
        g2d.fillRect(4 + x, -41 + y, 1, 3);
        g2d.fillRect(-3 + x, -40 + y, 1, 2);
        g2d.fillRect(2 + x, -40 + y, 1, 1);
        g2d.fillRect(-4 + x, -39 + y, 1, 2);
        g2d.fillRect(5 + x, -39 + y, 1, 3);
        g2d.fillRect(-5 + x, -37 + y, 1, 1);
        g2d.fillRect(-2 + x, -36 + y, 1, 1);
        g2d.fillRect(1 + x, -36 + y, 2, 1);
        g2d.fillRect(-2 + x, -34 + y, 1, 1);
        g2d.fillRect(1 + x, -34 + y, 1, 2);
        g2d.fillRect(-1 + x, -33 + y, 1, 1);
        g2d.fillRect(-2 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -31 + y, 1, 5);
        g2d.fillRect(-1 + x, -30 + y, 1, 1);
        g2d.fillRect(0 + x, -28 + y, 1, 1);
        g2d.fillRect(-3 + x, -27 + y, 1, 4);
        g2d.fillRect(-2 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 4);
        g2d.fillRect(-1 + x, -23 + y, 1, 1);
        g2d.fillRect(-2 + x, -21 + y, 1, 1);
        g2d.fillRect(-3 + x, -19 + y, 1, 2);
        g2d.fillRect(-2 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -13 + y, 1, 1);
        g2d.fillRect(-2 + x, -13 + y, 1, 1);
        g2d.fillRect(-1 + x, -11 + y, 1, 1);
        g2d.fillRect(-4 + x, -10 + y, 1, 1);
        g2d.fillRect(-2 + x, -9 + y, 1, 1);
        g2d.fillRect(-5 + x, -8 + y, 1, 3);
        g2d.fillRect(-3 + x, -8 + y, 1, 1);
        g2d.fillRect(-1 + x, -7 + y, 1, 1);
        g2d.fillRect(-2 + x, -6 + y, 1, 4);
        g2d.fillRect(-5 + x, -4 + y, 1, 1);
        g2d.fillRect(-3 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -2 + y, 3, 1);
        g2d.fillRect(-1 + x, -2 + y, 1, 1);
        g2d.fillRect(-4 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-1 + x, -45 + y, 1, 2);
        g2d.fillRect(-2 + x, -44 + y, 1, 2);
        g2d.fillRect(0 + x, -44 + y, 4, 1);
        g2d.fillRect(-4 + x, -43 + y, 1, 1);
        g2d.fillRect(2 + x, -43 + y, 4, 1);
        g2d.fillRect(-5 + x, -42 + y, 1, 2);
        g2d.fillRect(-3 + x, -42 + y, 1, 1);
        g2d.fillRect(4 + x, -42 + y, 2, 1);
        g2d.fillRect(5 + x, -41 + y, 1, 2);
        g2d.fillRect(-5 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -38 + y, 1, 1);
        g2d.fillRect(-4 + x, -37 + y, 1, 1);
        g2d.fillRect(3 + x, -37 + y, 1, 1);
        g2d.fillRect(-5 + x, -36 + y, 1, 1);
        g2d.fillRect(-3 + x, -36 + y, 1, 9);
        g2d.fillRect(4 + x, -36 + y, 1, 1);
        g2d.fillRect(-4 + x, -35 + y, 1, 1);
        g2d.fillRect(-2 + x, -35 + y, 6, 1);
        g2d.fillRect(2 + x, -34 + y, 1, 8);
        g2d.fillRect(3 + x, -34 + y, 1, 1);
        g2d.fillRect(1 + x, -32 + y, 1, 1);
        g2d.fillRect(0 + x, -31 + y, 1, 1);
        g2d.fillRect(-2 + x, -30 + y, 1, 5);
        g2d.fillRect(-1 + x, -27 + y, 1, 4);
        g2d.fillRect(1 + x, -26 + y, 1, 11);
        g2d.fillRect(-2 + x, -24 + y, 1, 1);
        g2d.fillRect(-3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(-2 + x, -20 + y, 1, 1);
        g2d.fillRect(-4 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(-4 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -13 + y, 1, 2);
        g2d.fillRect(-1 + x, -13 + y, 1, 2);
        g2d.fillRect(-2 + x, -12 + y, 1, 1);
        g2d.fillRect(-1 + x, -10 + y, 1, 3);
        g2d.fillRect(-6 + x, -8 + y, 1, 5);
        g2d.fillRect(-2 + x, -8 + y, 1, 2);
        g2d.fillRect(-3 + x, -7 + y, 1, 2);
        g2d.fillRect(-4 + x, -6 + y, 1, 1);
        g2d.fillRect(-7 + x, -5 + y, 1, 5);
        g2d.fillRect(-1 + x, -5 + y, 1, 1);
        g2d.fillRect(-1 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -1 + y, 1, 2);
        g2d.fillRect(-1 + x, -1 + y, 1, 2);
        g2d.fillRect(-5 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-4 + x, -16 + y, 1, 1);
        g2d.fillRect(-2 + x, -15 + y, 1, 1);
        g2d.fillRect(-4 + x, -11 + y, 1, 1);
        g2d.fillRect(-5 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -45 + y, 1, 1);
        g2d.fillRect(-3 + x, -43 + y, 1, 1);
        g2d.fillRect(-1 + x, -43 + y, 1, 1);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(1 + x, -42 + y, 1, 1);
        g2d.fillRect(-4 + x, -41 + y, 2, 1);
        g2d.fillRect(3 + x, -41 + y, 1, 1);
        g2d.fillRect(-5 + x, -40 + y, 1, 1);
        g2d.fillRect(-2 + x, -40 + y, 2, 1);
        g2d.fillRect(-1 + x, -39 + y, 2, 1);
        g2d.fillRect(2 + x, -39 + y, 1, 2);
        g2d.fillRect(3 + x, -39 + y, 1, 1);
        g2d.fillRect(-3 + x, -38 + y, 1, 1);
        g2d.fillRect(0 + x, -38 + y, 1, 1);
        g2d.fillRect(1 + x, -37 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 1, 1);
        g2d.fillRect(-1 + x, -36 + y, 2, 1);
        g2d.fillRect(3 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -34 + y, 1, 3);
        g2d.fillRect(-1 + x, -29 + y, 1, 2);
        g2d.fillRect(-1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(-1 + x, -18 + y, 1, 1);
        g2d.fillRect(-5 + x, -16 + y, 1, 3);
        g2d.fillRect(-3 + x, -16 + y, 1, 4);
        g2d.fillRect(-3 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -8 + y, 1, 2);
        g2d.fillRect(-4 + x, -5 + y, 2, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 1);
        g2d.fillRect(-4 + x, -3 + y, 1, 1);
        g2d.fillRect(-3 + x, -2 + y, 2, 1);
        g2d.fillRect(-5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-4 + x, -42 + y, 1, 1);
        g2d.fillRect(2 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -41 + y, 1, 1);
        g2d.fillRect(1 + x, -41 + y, 1, 4);
        g2d.fillRect(-4 + x, -40 + y, 1, 1);
        g2d.fillRect(0 + x, -40 + y, 1, 1);
        g2d.fillRect(3 + x, -40 + y, 1, 1);
        g2d.fillRect(-5 + x, -39 + y, 1, 1);
        g2d.fillRect(-2 + x, -39 + y, 1, 3);
        g2d.fillRect(-1 + x, -38 + y, 1, 2);
        g2d.fillRect(3 + x, -38 + y, 1, 1);
        g2d.fillRect(-3 + x, -37 + y, 1, 1);
        g2d.fillRect(0 + x, -37 + y, 1, 1);
        g2d.fillRect(2 + x, -37 + y, 1, 1);
        g2d.fillRect(-4 + x, -36 + y, 1, 1);
        g2d.fillRect(-1 + x, -34 + y, 1, 1);
        g2d.fillRect(-2 + x, -33 + y, 1, 1);
        g2d.fillRect(-1 + x, -32 + y, 1, 2);
        g2d.fillRect(0 + x, -30 + y, 1, 2);
        g2d.fillRect(0 + x, -27 + y, 1, 2);
        g2d.fillRect(-2 + x, -23 + y, 1, 2);
        g2d.fillRect(-1 + x, -22 + y, 1, 1);
        g2d.fillRect(-2 + x, -17 + y, 1, 2);
        g2d.fillRect(-4 + x, -12 + y, 2, 1);
        g2d.fillRect(-3 + x, -11 + y, 2, 1);
        g2d.fillRect(-2 + x, -10 + y, 1, 1);
        g2d.fillRect(-1 + x, -6 + y, 1, 1);
        g2d.fillRect(-5 + x, -5 + y, 1, 1);
        g2d.fillRect(-4 + x, -4 + y, 1, 1);
        g2d.fillRect(-1 + x, -4 + y, 1, 1);
        g2d.fillRect(-6 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-4 + x, -17 + y, 1, 1);
        g2d.fillRect(-2 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -11 + y, 1, 1);
        g2d.fillRect(-3 + x, -9 + y, 1, 1);
    }





    public void paintS4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-3 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -15 + y, 1, 1);
        g2d.fillRect(-5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(0 + x, -42 + y, 2, 1);
        g2d.fillRect(-2 + x, -41 + y, 1, 2);
        g2d.fillRect(-1 + x, -41 + y, 1, 1);
        g2d.fillRect(3 + x, -41 + y, 1, 1);
        g2d.fillRect(4 + x, -40 + y, 1, 3);
        g2d.fillRect(-3 + x, -39 + y, 1, 2);
        g2d.fillRect(2 + x, -39 + y, 1, 1);
        g2d.fillRect(-4 + x, -38 + y, 1, 2);
        g2d.fillRect(5 + x, -38 + y, 1, 3);
        g2d.fillRect(-5 + x, -36 + y, 1, 1);
        g2d.fillRect(-2 + x, -35 + y, 1, 1);
        g2d.fillRect(1 + x, -35 + y, 2, 1);
        g2d.fillRect(-2 + x, -33 + y, 1, 1);
        g2d.fillRect(1 + x, -33 + y, 1, 2);
        g2d.fillRect(-1 + x, -32 + y, 1, 1);
        g2d.fillRect(-2 + x, -31 + y, 1, 2);
        g2d.fillRect(1 + x, -30 + y, 1, 5);
        g2d.fillRect(-1 + x, -29 + y, 1, 1);
        g2d.fillRect(0 + x, -27 + y, 1, 1);
        g2d.fillRect(-3 + x, -26 + y, 1, 3);
        g2d.fillRect(-2 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 4);
        g2d.fillRect(-1 + x, -23 + y, 1, 1);
        g2d.fillRect(-2 + x, -21 + y, 1, 1);
        g2d.fillRect(-3 + x, -19 + y, 1, 2);
        g2d.fillRect(-2 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -13 + y, 1, 1);
        g2d.fillRect(-2 + x, -13 + y, 1, 1);
        g2d.fillRect(-1 + x, -11 + y, 1, 1);
        g2d.fillRect(-4 + x, -10 + y, 1, 1);
        g2d.fillRect(-2 + x, -9 + y, 1, 1);
        g2d.fillRect(-5 + x, -8 + y, 1, 3);
        g2d.fillRect(-3 + x, -8 + y, 1, 1);
        g2d.fillRect(-1 + x, -7 + y, 1, 1);
        g2d.fillRect(-2 + x, -6 + y, 1, 4);
        g2d.fillRect(-5 + x, -4 + y, 1, 1);
        g2d.fillRect(-3 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -2 + y, 3, 1);
        g2d.fillRect(-1 + x, -2 + y, 1, 1);
        g2d.fillRect(-4 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-1 + x, -44 + y, 1, 2);
        g2d.fillRect(-2 + x, -43 + y, 1, 2);
        g2d.fillRect(0 + x, -43 + y, 4, 1);
        g2d.fillRect(-4 + x, -42 + y, 1, 1);
        g2d.fillRect(2 + x, -42 + y, 4, 1);
        g2d.fillRect(-5 + x, -41 + y, 1, 2);
        g2d.fillRect(-3 + x, -41 + y, 1, 1);
        g2d.fillRect(4 + x, -41 + y, 2, 1);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(-5 + x, -37 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 1, 1);
        g2d.fillRect(-4 + x, -36 + y, 1, 1);
        g2d.fillRect(3 + x, -36 + y, 1, 1);
        g2d.fillRect(-5 + x, -35 + y, 1, 1);
        g2d.fillRect(-3 + x, -35 + y, 1, 9);
        g2d.fillRect(4 + x, -35 + y, 1, 1);
        g2d.fillRect(-4 + x, -34 + y, 1, 1);
        g2d.fillRect(-2 + x, -34 + y, 6, 1);
        g2d.fillRect(2 + x, -33 + y, 1, 8);
        g2d.fillRect(3 + x, -33 + y, 1, 1);
        g2d.fillRect(1 + x, -31 + y, 1, 1);
        g2d.fillRect(0 + x, -30 + y, 1, 1);
        g2d.fillRect(-2 + x, -29 + y, 1, 4);
        g2d.fillRect(-1 + x, -26 + y, 1, 3);
        g2d.fillRect(1 + x, -25 + y, 1, 10);
        g2d.fillRect(-2 + x, -24 + y, 1, 1);
        g2d.fillRect(-3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(-2 + x, -20 + y, 1, 1);
        g2d.fillRect(-4 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(-4 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -13 + y, 1, 2);
        g2d.fillRect(-1 + x, -13 + y, 1, 2);
        g2d.fillRect(-2 + x, -12 + y, 1, 1);
        g2d.fillRect(-1 + x, -10 + y, 1, 3);
        g2d.fillRect(-6 + x, -8 + y, 1, 5);
        g2d.fillRect(-2 + x, -8 + y, 1, 2);
        g2d.fillRect(-3 + x, -7 + y, 1, 2);
        g2d.fillRect(-4 + x, -6 + y, 1, 1);
        g2d.fillRect(-7 + x, -5 + y, 1, 5);
        g2d.fillRect(-1 + x, -5 + y, 1, 1);
        g2d.fillRect(-1 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -1 + y, 1, 2);
        g2d.fillRect(-1 + x, -1 + y, 1, 2);
        g2d.fillRect(-5 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-4 + x, -16 + y, 1, 1);
        g2d.fillRect(-2 + x, -15 + y, 1, 1);
        g2d.fillRect(-4 + x, -11 + y, 1, 1);
        g2d.fillRect(-5 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -44 + y, 1, 1);
        g2d.fillRect(-3 + x, -42 + y, 1, 1);
        g2d.fillRect(-1 + x, -42 + y, 1, 1);
        g2d.fillRect(0 + x, -41 + y, 1, 2);
        g2d.fillRect(1 + x, -41 + y, 1, 1);
        g2d.fillRect(-4 + x, -40 + y, 2, 1);
        g2d.fillRect(3 + x, -40 + y, 1, 1);
        g2d.fillRect(-5 + x, -39 + y, 1, 1);
        g2d.fillRect(-2 + x, -39 + y, 2, 1);
        g2d.fillRect(-1 + x, -38 + y, 2, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(3 + x, -38 + y, 1, 1);
        g2d.fillRect(-3 + x, -37 + y, 1, 1);
        g2d.fillRect(0 + x, -37 + y, 1, 1);
        g2d.fillRect(1 + x, -36 + y, 1, 1);
        g2d.fillRect(4 + x, -36 + y, 1, 1);
        g2d.fillRect(-1 + x, -35 + y, 2, 1);
        g2d.fillRect(3 + x, -35 + y, 1, 1);
        g2d.fillRect(0 + x, -33 + y, 1, 3);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(-1 + x, -18 + y, 1, 1);
        g2d.fillRect(-5 + x, -16 + y, 1, 3);
        g2d.fillRect(-3 + x, -16 + y, 1, 4);
        g2d.fillRect(-3 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -8 + y, 1, 2);
        g2d.fillRect(-4 + x, -5 + y, 2, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 1);
        g2d.fillRect(-4 + x, -3 + y, 1, 1);
        g2d.fillRect(-3 + x, -2 + y, 2, 1);
        g2d.fillRect(-5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-4 + x, -41 + y, 1, 1);
        g2d.fillRect(2 + x, -41 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 1);
        g2d.fillRect(1 + x, -40 + y, 1, 4);
        g2d.fillRect(-4 + x, -39 + y, 1, 1);
        g2d.fillRect(0 + x, -39 + y, 1, 1);
        g2d.fillRect(3 + x, -39 + y, 1, 1);
        g2d.fillRect(-5 + x, -38 + y, 1, 1);
        g2d.fillRect(-2 + x, -38 + y, 1, 3);
        g2d.fillRect(-1 + x, -37 + y, 1, 2);
        g2d.fillRect(3 + x, -37 + y, 1, 1);
        g2d.fillRect(-3 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -36 + y, 1, 1);
        g2d.fillRect(2 + x, -36 + y, 1, 1);
        g2d.fillRect(-4 + x, -35 + y, 1, 1);
        g2d.fillRect(-1 + x, -33 + y, 1, 1);
        g2d.fillRect(-2 + x, -32 + y, 1, 1);
        g2d.fillRect(-1 + x, -31 + y, 1, 2);
        g2d.fillRect(0 + x, -29 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(-2 + x, -23 + y, 1, 2);
        g2d.fillRect(-1 + x, -22 + y, 1, 1);
        g2d.fillRect(-2 + x, -17 + y, 1, 2);
        g2d.fillRect(-4 + x, -12 + y, 2, 1);
        g2d.fillRect(-3 + x, -11 + y, 2, 1);
        g2d.fillRect(-2 + x, -10 + y, 1, 1);
        g2d.fillRect(-1 + x, -6 + y, 1, 1);
        g2d.fillRect(-5 + x, -5 + y, 1, 1);
        g2d.fillRect(-4 + x, -4 + y, 1, 1);
        g2d.fillRect(-1 + x, -4 + y, 1, 1);
        g2d.fillRect(-6 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-4 + x, -17 + y, 1, 1);
        g2d.fillRect(-2 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -11 + y, 1, 1);
        g2d.fillRect(-3 + x, -9 + y, 1, 1);
    }





    public void paintS5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-3 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -15 + y, 1, 1);
        g2d.fillRect(-5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(0 + x, -41 + y, 2, 1);
        g2d.fillRect(-2 + x, -40 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 1);
        g2d.fillRect(3 + x, -40 + y, 1, 1);
        g2d.fillRect(4 + x, -39 + y, 1, 3);
        g2d.fillRect(-3 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 1);
        g2d.fillRect(-4 + x, -37 + y, 1, 2);
        g2d.fillRect(5 + x, -37 + y, 1, 3);
        g2d.fillRect(-5 + x, -35 + y, 1, 1);
        g2d.fillRect(-2 + x, -34 + y, 1, 1);
        g2d.fillRect(1 + x, -34 + y, 2, 1);
        g2d.fillRect(-2 + x, -32 + y, 1, 3);
        g2d.fillRect(1 + x, -32 + y, 1, 1);
        g2d.fillRect(1 + x, -30 + y, 1, 5);
        g2d.fillRect(-1 + x, -29 + y, 1, 1);
        g2d.fillRect(0 + x, -27 + y, 1, 1);
        g2d.fillRect(-3 + x, -26 + y, 1, 3);
        g2d.fillRect(-2 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 4);
        g2d.fillRect(-1 + x, -23 + y, 1, 1);
        g2d.fillRect(-2 + x, -21 + y, 1, 1);
        g2d.fillRect(-3 + x, -19 + y, 1, 2);
        g2d.fillRect(-2 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(-4 + x, -13 + y, 1, 1);
        g2d.fillRect(-2 + x, -13 + y, 1, 1);
        g2d.fillRect(-1 + x, -11 + y, 1, 1);
        g2d.fillRect(-4 + x, -10 + y, 1, 1);
        g2d.fillRect(-2 + x, -9 + y, 1, 1);
        g2d.fillRect(-5 + x, -8 + y, 1, 3);
        g2d.fillRect(-3 + x, -8 + y, 1, 1);
        g2d.fillRect(-1 + x, -7 + y, 1, 1);
        g2d.fillRect(-2 + x, -6 + y, 1, 4);
        g2d.fillRect(-5 + x, -4 + y, 1, 1);
        g2d.fillRect(-3 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -2 + y, 3, 1);
        g2d.fillRect(-1 + x, -2 + y, 1, 1);
        g2d.fillRect(-4 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-1 + x, -43 + y, 1, 2);
        g2d.fillRect(-2 + x, -42 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 4, 1);
        g2d.fillRect(-4 + x, -41 + y, 1, 1);
        g2d.fillRect(2 + x, -41 + y, 4, 1);
        g2d.fillRect(-5 + x, -40 + y, 1, 2);
        g2d.fillRect(-3 + x, -40 + y, 1, 1);
        g2d.fillRect(4 + x, -40 + y, 2, 1);
        g2d.fillRect(5 + x, -39 + y, 1, 2);
        g2d.fillRect(-5 + x, -36 + y, 1, 1);
        g2d.fillRect(4 + x, -36 + y, 1, 1);
        g2d.fillRect(-4 + x, -35 + y, 1, 1);
        g2d.fillRect(3 + x, -35 + y, 1, 1);
        g2d.fillRect(-5 + x, -34 + y, 1, 1);
        g2d.fillRect(-3 + x, -34 + y, 1, 8);
        g2d.fillRect(4 + x, -34 + y, 1, 1);
        g2d.fillRect(-4 + x, -33 + y, 1, 1);
        g2d.fillRect(-2 + x, -33 + y, 6, 1);
        g2d.fillRect(2 + x, -32 + y, 1, 7);
        g2d.fillRect(3 + x, -32 + y, 1, 1);
        g2d.fillRect(1 + x, -31 + y, 1, 1);
        g2d.fillRect(0 + x, -30 + y, 1, 1);
        g2d.fillRect(-2 + x, -29 + y, 1, 4);
        g2d.fillRect(-1 + x, -26 + y, 1, 3);
        g2d.fillRect(1 + x, -25 + y, 1, 10);
        g2d.fillRect(-2 + x, -24 + y, 1, 1);
        g2d.fillRect(-3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(-2 + x, -20 + y, 1, 1);
        g2d.fillRect(-4 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(-4 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -13 + y, 1, 2);
        g2d.fillRect(-1 + x, -13 + y, 1, 2);
        g2d.fillRect(-2 + x, -12 + y, 1, 1);
        g2d.fillRect(-1 + x, -10 + y, 1, 3);
        g2d.fillRect(-6 + x, -8 + y, 1, 5);
        g2d.fillRect(-2 + x, -8 + y, 1, 2);
        g2d.fillRect(-3 + x, -7 + y, 1, 2);
        g2d.fillRect(-4 + x, -6 + y, 1, 1);
        g2d.fillRect(-7 + x, -5 + y, 1, 5);
        g2d.fillRect(-1 + x, -5 + y, 1, 1);
        g2d.fillRect(-1 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -1 + y, 1, 2);
        g2d.fillRect(-1 + x, -1 + y, 1, 2);
        g2d.fillRect(-5 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-4 + x, -16 + y, 1, 1);
        g2d.fillRect(-2 + x, -15 + y, 1, 1);
        g2d.fillRect(-4 + x, -11 + y, 1, 1);
        g2d.fillRect(-5 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -43 + y, 1, 1);
        g2d.fillRect(-3 + x, -41 + y, 1, 1);
        g2d.fillRect(-1 + x, -41 + y, 1, 1);
        g2d.fillRect(0 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 1);
        g2d.fillRect(-4 + x, -39 + y, 2, 1);
        g2d.fillRect(3 + x, -39 + y, 1, 1);
        g2d.fillRect(-5 + x, -38 + y, 1, 1);
        g2d.fillRect(-2 + x, -38 + y, 2, 1);
        g2d.fillRect(-1 + x, -37 + y, 2, 1);
        g2d.fillRect(2 + x, -37 + y, 1, 2);
        g2d.fillRect(3 + x, -37 + y, 1, 1);
        g2d.fillRect(-3 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -36 + y, 1, 1);
        g2d.fillRect(1 + x, -35 + y, 1, 1);
        g2d.fillRect(4 + x, -35 + y, 1, 1);
        g2d.fillRect(-1 + x, -34 + y, 2, 1);
        g2d.fillRect(3 + x, -34 + y, 1, 1);
        g2d.fillRect(0 + x, -32 + y, 1, 2);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(-1 + x, -18 + y, 1, 1);
        g2d.fillRect(-5 + x, -16 + y, 1, 3);
        g2d.fillRect(-3 + x, -16 + y, 1, 4);
        g2d.fillRect(-3 + x, -10 + y, 1, 1);
        g2d.fillRect(-4 + x, -8 + y, 1, 2);
        g2d.fillRect(-4 + x, -5 + y, 2, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 1);
        g2d.fillRect(-4 + x, -3 + y, 1, 1);
        g2d.fillRect(-3 + x, -2 + y, 2, 1);
        g2d.fillRect(-5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-4 + x, -40 + y, 1, 1);
        g2d.fillRect(2 + x, -40 + y, 1, 2);
        g2d.fillRect(-1 + x, -39 + y, 1, 1);
        g2d.fillRect(1 + x, -39 + y, 1, 4);
        g2d.fillRect(-4 + x, -38 + y, 1, 1);
        g2d.fillRect(0 + x, -38 + y, 1, 1);
        g2d.fillRect(3 + x, -38 + y, 1, 1);
        g2d.fillRect(-5 + x, -37 + y, 1, 1);
        g2d.fillRect(-2 + x, -37 + y, 1, 3);
        g2d.fillRect(-1 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 1);
        g2d.fillRect(-3 + x, -35 + y, 1, 1);
        g2d.fillRect(0 + x, -35 + y, 1, 1);
        g2d.fillRect(2 + x, -35 + y, 1, 1);
        g2d.fillRect(-4 + x, -34 + y, 1, 1);
        g2d.fillRect(-1 + x, -32 + y, 1, 3);
        g2d.fillRect(0 + x, -29 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(-2 + x, -23 + y, 1, 2);
        g2d.fillRect(-1 + x, -22 + y, 1, 1);
        g2d.fillRect(-2 + x, -17 + y, 1, 2);
        g2d.fillRect(-4 + x, -12 + y, 2, 1);
        g2d.fillRect(-3 + x, -11 + y, 2, 1);
        g2d.fillRect(-2 + x, -10 + y, 1, 1);
        g2d.fillRect(-1 + x, -6 + y, 1, 1);
        g2d.fillRect(-5 + x, -5 + y, 1, 1);
        g2d.fillRect(-4 + x, -4 + y, 1, 1);
        g2d.fillRect(-1 + x, -4 + y, 1, 1);
        g2d.fillRect(-6 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-4 + x, -17 + y, 1, 1);
        g2d.fillRect(-2 + x, -14 + y, 1, 1);
        g2d.fillRect(-5 + x, -11 + y, 1, 1);
        g2d.fillRect(-3 + x, -9 + y, 1, 1);
    }





    public void paintBackS6(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(3 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -15 + y, 1, 1);
        g2d.fillRect(5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-1 + x, -39 + y, 2, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(1 + x, -38 + y, 1, 1);
        g2d.fillRect(-3 + x, -38 + y, 1, 1);
        g2d.fillRect(-4 + x, -37 + y, 1, 3);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(-2 + x, -36 + y, 1, 1);
        g2d.fillRect(4 + x, -35 + y, 1, 2);
        g2d.fillRect(-5 + x, -35 + y, 1, 3);
        g2d.fillRect(5 + x, -33 + y, 1, 1);
        g2d.fillRect(2 + x, -32 + y, 1, 1);
        g2d.fillRect(-2 + x, -32 + y, 2, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(-1 + x, -30 + y, 1, 6);
        g2d.fillRect(1 + x, -28 + y, 1, 1);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(3 + x, -25 + y, 1, 2);
        g2d.fillRect(0 + x, -24 + y, 1, 3);
        g2d.fillRect(1 + x, -23 + y, 1, 1);
        g2d.fillRect(2 + x, -21 + y, 1, 1);
        g2d.fillRect(3 + x, -19 + y, 1, 2);
        g2d.fillRect(2 + x, -19 + y, 1, 2);
        g2d.fillRect(1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -13 + y, 1, 1);
        g2d.fillRect(2 + x, -13 + y, 1, 1);
        g2d.fillRect(1 + x, -11 + y, 1, 1);
        g2d.fillRect(4 + x, -10 + y, 1, 1);
        g2d.fillRect(2 + x, -9 + y, 1, 1);
        g2d.fillRect(5 + x, -8 + y, 1, 3);
        g2d.fillRect(3 + x, -8 + y, 1, 1);
        g2d.fillRect(1 + x, -7 + y, 1, 1);
        g2d.fillRect(2 + x, -6 + y, 1, 4);
        g2d.fillRect(5 + x, -4 + y, 1, 1);
        g2d.fillRect(3 + x, -3 + y, 1, 1);
        g2d.fillRect(4 + x, -2 + y, 3, 1);
        g2d.fillRect(1 + x, -2 + y, 1, 1);
        g2d.fillRect(2 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(1 + x, -41 + y, 1, 2);
        g2d.fillRect(2 + x, -40 + y, 1, 2);
        g2d.fillRect(-3 + x, -40 + y, 4, 1);
        g2d.fillRect(4 + x, -39 + y, 1, 1);
        g2d.fillRect(-5 + x, -39 + y, 4, 1);
        g2d.fillRect(5 + x, -38 + y, 1, 2);
        g2d.fillRect(3 + x, -38 + y, 1, 1);
        g2d.fillRect(-5 + x, -38 + y, 2, 1);
        g2d.fillRect(-5 + x, -37 + y, 1, 2);
        g2d.fillRect(5 + x, -34 + y, 1, 1);
        g2d.fillRect(-4 + x, -34 + y, 1, 1);
        g2d.fillRect(4 + x, -33 + y, 1, 1);
        g2d.fillRect(-3 + x, -33 + y, 1, 1);
        g2d.fillRect(5 + x, -32 + y, 1, 1);
        g2d.fillRect(3 + x, -32 + y, 1, 7);
        g2d.fillRect(-4 + x, -32 + y, 1, 1);
        g2d.fillRect(4 + x, -31 + y, 1, 1);
        g2d.fillRect(-3 + x, -31 + y, 6, 1);
        g2d.fillRect(-2 + x, -30 + y, 1, 6);
        g2d.fillRect(-3 + x, -30 + y, 1, 1);
        g2d.fillRect(0 + x, -29 + y, 1, 1);
        g2d.fillRect(2 + x, -28 + y, 1, 5);
        g2d.fillRect(1 + x, -25 + y, 1, 2);
        g2d.fillRect(-1 + x, -24 + y, 1, 9);
        g2d.fillRect(3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(2 + x, -20 + y, 1, 1);
        g2d.fillRect(4 + x, -19 + y, 1, 2);
        g2d.fillRect(0 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(4 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -13 + y, 1, 2);
        g2d.fillRect(1 + x, -13 + y, 1, 2);
        g2d.fillRect(2 + x, -12 + y, 1, 1);
        g2d.fillRect(1 + x, -10 + y, 1, 3);
        g2d.fillRect(6 + x, -8 + y, 1, 5);
        g2d.fillRect(2 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -7 + y, 1, 2);
        g2d.fillRect(4 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -5 + y, 1, 5);
        g2d.fillRect(1 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -3 + y, 1, 1);
        g2d.fillRect(6 + x, -1 + y, 1, 2);
        g2d.fillRect(1 + x, -1 + y, 1, 2);
        g2d.fillRect(2 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(4 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -15 + y, 1, 1);
        g2d.fillRect(4 + x, -11 + y, 1, 1);
        g2d.fillRect(5 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -41 + y, 1, 1);
        g2d.fillRect(3 + x, -39 + y, 1, 1);
        g2d.fillRect(1 + x, -39 + y, 1, 1);
        g2d.fillRect(0 + x, -38 + y, 1, 2);
        g2d.fillRect(-1 + x, -38 + y, 1, 1);
        g2d.fillRect(3 + x, -37 + y, 2, 1);
        g2d.fillRect(-3 + x, -37 + y, 1, 1);
        g2d.fillRect(5 + x, -36 + y, 1, 1);
        g2d.fillRect(1 + x, -36 + y, 2, 1);
        g2d.fillRect(0 + x, -35 + y, 2, 1);
        g2d.fillRect(-2 + x, -35 + y, 1, 2);
        g2d.fillRect(-3 + x, -35 + y, 1, 1);
        g2d.fillRect(3 + x, -34 + y, 1, 1);
        g2d.fillRect(0 + x, -34 + y, 1, 1);
        g2d.fillRect(-1 + x, -33 + y, 1, 1);
        g2d.fillRect(-4 + x, -33 + y, 1, 1);
        g2d.fillRect(0 + x, -32 + y, 2, 1);
        g2d.fillRect(-3 + x, -32 + y, 1, 1);
        g2d.fillRect(0 + x, -30 + y, 1, 1);
        g2d.fillRect(1 + x, -27 + y, 1, 2);
        g2d.fillRect(1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(1 + x, -18 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 3);
        g2d.fillRect(3 + x, -16 + y, 1, 4);
        g2d.fillRect(3 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -5 + y, 2, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 1);
        g2d.fillRect(4 + x, -3 + y, 1, 1);
        g2d.fillRect(2 + x, -2 + y, 2, 1);
        g2d.fillRect(5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(4 + x, -38 + y, 1, 1);
        g2d.fillRect(-2 + x, -38 + y, 1, 2);
        g2d.fillRect(1 + x, -37 + y, 1, 1);
        g2d.fillRect(-1 + x, -37 + y, 1, 4);
        g2d.fillRect(4 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -36 + y, 1, 1);
        g2d.fillRect(-3 + x, -36 + y, 1, 1);
        g2d.fillRect(5 + x, -35 + y, 1, 1);
        g2d.fillRect(2 + x, -35 + y, 1, 3);
        g2d.fillRect(1 + x, -34 + y, 1, 2);
        g2d.fillRect(-3 + x, -34 + y, 1, 1);
        g2d.fillRect(3 + x, -33 + y, 1, 1);
        g2d.fillRect(0 + x, -33 + y, 1, 1);
        g2d.fillRect(-2 + x, -33 + y, 1, 1);
        g2d.fillRect(4 + x, -32 + y, 1, 1);
        g2d.fillRect(1 + x, -30 + y, 1, 2);
        g2d.fillRect(0 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -25 + y, 1, 1);
        g2d.fillRect(2 + x, -23 + y, 1, 2);
        g2d.fillRect(1 + x, -22 + y, 1, 1);
        g2d.fillRect(2 + x, -17 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 2, 1);
        g2d.fillRect(2 + x, -11 + y, 2, 1);
        g2d.fillRect(2 + x, -10 + y, 1, 1);
        g2d.fillRect(1 + x, -6 + y, 1, 1);
        g2d.fillRect(5 + x, -5 + y, 1, 1);
        g2d.fillRect(4 + x, -4 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 1);
        g2d.fillRect(5 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -11 + y, 1, 1);
        g2d.fillRect(3 + x, -9 + y, 1, 1);
    }





    public void paintBackS1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(3 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -15 + y, 1, 1);
        g2d.fillRect(5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-1 + x, -43 + y, 2, 1);
        g2d.fillRect(2 + x, -42 + y, 1, 2);
        g2d.fillRect(1 + x, -42 + y, 1, 1);
        g2d.fillRect(-3 + x, -42 + y, 1, 1);
        g2d.fillRect(-4 + x, -41 + y, 1, 3);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -40 + y, 1, 1);
        g2d.fillRect(4 + x, -39 + y, 1, 2);
        g2d.fillRect(-5 + x, -39 + y, 1, 3);
        g2d.fillRect(5 + x, -37 + y, 1, 1);
        g2d.fillRect(2 + x, -36 + y, 1, 1);
        g2d.fillRect(-2 + x, -36 + y, 2, 1);
        g2d.fillRect(2 + x, -34 + y, 1, 1);
        g2d.fillRect(-1 + x, -34 + y, 1, 2);
        g2d.fillRect(1 + x, -33 + y, 1, 1);
        g2d.fillRect(2 + x, -32 + y, 1, 2);
        g2d.fillRect(-1 + x, -31 + y, 1, 5);
        g2d.fillRect(1 + x, -30 + y, 1, 1);
        g2d.fillRect(0 + x, -28 + y, 1, 1);
        g2d.fillRect(3 + x, -27 + y, 1, 4);
        g2d.fillRect(2 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 4);
        g2d.fillRect(1 + x, -23 + y, 1, 1);
        g2d.fillRect(2 + x, -21 + y, 1, 1);
        g2d.fillRect(3 + x, -19 + y, 1, 2);
        g2d.fillRect(2 + x, -19 + y, 1, 2);
        g2d.fillRect(1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -13 + y, 1, 1);
        g2d.fillRect(2 + x, -13 + y, 1, 1);
        g2d.fillRect(1 + x, -11 + y, 1, 1);
        g2d.fillRect(4 + x, -10 + y, 1, 1);
        g2d.fillRect(2 + x, -9 + y, 1, 1);
        g2d.fillRect(5 + x, -8 + y, 1, 3);
        g2d.fillRect(3 + x, -8 + y, 1, 1);
        g2d.fillRect(1 + x, -7 + y, 1, 1);
        g2d.fillRect(2 + x, -6 + y, 1, 4);
        g2d.fillRect(5 + x, -4 + y, 1, 1);
        g2d.fillRect(3 + x, -3 + y, 1, 1);
        g2d.fillRect(4 + x, -2 + y, 3, 1);
        g2d.fillRect(1 + x, -2 + y, 1, 1);
        g2d.fillRect(2 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(1 + x, -45 + y, 1, 2);
        g2d.fillRect(2 + x, -44 + y, 1, 2);
        g2d.fillRect(-3 + x, -44 + y, 4, 1);
        g2d.fillRect(4 + x, -43 + y, 1, 1);
        g2d.fillRect(-5 + x, -43 + y, 4, 1);
        g2d.fillRect(5 + x, -42 + y, 1, 2);
        g2d.fillRect(3 + x, -42 + y, 1, 1);
        g2d.fillRect(-5 + x, -42 + y, 2, 1);
        g2d.fillRect(-5 + x, -41 + y, 1, 2);
        g2d.fillRect(5 + x, -38 + y, 1, 1);
        g2d.fillRect(-4 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 1, 1);
        g2d.fillRect(-3 + x, -37 + y, 1, 1);
        g2d.fillRect(5 + x, -36 + y, 1, 1);
        g2d.fillRect(3 + x, -36 + y, 1, 9);
        g2d.fillRect(-4 + x, -36 + y, 1, 1);
        g2d.fillRect(4 + x, -35 + y, 1, 1);
        g2d.fillRect(-3 + x, -35 + y, 6, 1);
        g2d.fillRect(-2 + x, -34 + y, 1, 8);
        g2d.fillRect(-3 + x, -34 + y, 1, 1);
        g2d.fillRect(-1 + x, -32 + y, 1, 1);
        g2d.fillRect(0 + x, -31 + y, 1, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 5);
        g2d.fillRect(1 + x, -27 + y, 1, 4);
        g2d.fillRect(-1 + x, -26 + y, 1, 11);
        g2d.fillRect(2 + x, -24 + y, 1, 1);
        g2d.fillRect(3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(2 + x, -20 + y, 1, 1);
        g2d.fillRect(4 + x, -19 + y, 1, 2);
        g2d.fillRect(0 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(4 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -13 + y, 1, 2);
        g2d.fillRect(1 + x, -13 + y, 1, 2);
        g2d.fillRect(2 + x, -12 + y, 1, 1);
        g2d.fillRect(1 + x, -10 + y, 1, 3);
        g2d.fillRect(6 + x, -8 + y, 1, 5);
        g2d.fillRect(2 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -7 + y, 1, 2);
        g2d.fillRect(4 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -5 + y, 1, 5);
        g2d.fillRect(1 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -3 + y, 1, 1);
        g2d.fillRect(6 + x, -1 + y, 1, 2);
        g2d.fillRect(1 + x, -1 + y, 1, 2);
        g2d.fillRect(2 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(4 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -15 + y, 1, 1);
        g2d.fillRect(4 + x, -11 + y, 1, 1);
        g2d.fillRect(5 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -45 + y, 1, 1);
        g2d.fillRect(3 + x, -43 + y, 1, 1);
        g2d.fillRect(1 + x, -43 + y, 1, 1);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -42 + y, 1, 1);
        g2d.fillRect(3 + x, -41 + y, 2, 1);
        g2d.fillRect(-3 + x, -41 + y, 1, 1);
        g2d.fillRect(5 + x, -40 + y, 1, 1);
        g2d.fillRect(1 + x, -40 + y, 2, 1);
        g2d.fillRect(0 + x, -39 + y, 2, 1);
        g2d.fillRect(-2 + x, -39 + y, 1, 2);
        g2d.fillRect(-3 + x, -39 + y, 1, 1);
        g2d.fillRect(3 + x, -38 + y, 1, 1);
        g2d.fillRect(0 + x, -38 + y, 1, 1);
        g2d.fillRect(-1 + x, -37 + y, 1, 1);
        g2d.fillRect(-4 + x, -37 + y, 1, 1);
        g2d.fillRect(0 + x, -36 + y, 2, 1);
        g2d.fillRect(-3 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -34 + y, 1, 3);
        g2d.fillRect(1 + x, -29 + y, 1, 2);
        g2d.fillRect(1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(1 + x, -18 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 3);
        g2d.fillRect(3 + x, -16 + y, 1, 4);
        g2d.fillRect(3 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -5 + y, 2, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 1);
        g2d.fillRect(4 + x, -3 + y, 1, 1);
        g2d.fillRect(2 + x, -2 + y, 2, 1);
        g2d.fillRect(5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(4 + x, -42 + y, 1, 1);
        g2d.fillRect(-2 + x, -42 + y, 1, 2);
        g2d.fillRect(1 + x, -41 + y, 1, 1);
        g2d.fillRect(-1 + x, -41 + y, 1, 4);
        g2d.fillRect(4 + x, -40 + y, 1, 1);
        g2d.fillRect(0 + x, -40 + y, 1, 1);
        g2d.fillRect(-3 + x, -40 + y, 1, 1);
        g2d.fillRect(5 + x, -39 + y, 1, 1);
        g2d.fillRect(2 + x, -39 + y, 1, 3);
        g2d.fillRect(1 + x, -38 + y, 1, 2);
        g2d.fillRect(-3 + x, -38 + y, 1, 1);
        g2d.fillRect(3 + x, -37 + y, 1, 1);
        g2d.fillRect(0 + x, -37 + y, 1, 1);
        g2d.fillRect(-2 + x, -37 + y, 1, 1);
        g2d.fillRect(4 + x, -36 + y, 1, 1);
        g2d.fillRect(1 + x, -34 + y, 1, 1);
        g2d.fillRect(2 + x, -33 + y, 1, 1);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(0 + x, -30 + y, 1, 2);
        g2d.fillRect(0 + x, -27 + y, 1, 2);
        g2d.fillRect(2 + x, -23 + y, 1, 2);
        g2d.fillRect(1 + x, -22 + y, 1, 1);
        g2d.fillRect(2 + x, -17 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 2, 1);
        g2d.fillRect(2 + x, -11 + y, 2, 1);
        g2d.fillRect(2 + x, -10 + y, 1, 1);
        g2d.fillRect(1 + x, -6 + y, 1, 1);
        g2d.fillRect(5 + x, -5 + y, 1, 1);
        g2d.fillRect(4 + x, -4 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 1);
        g2d.fillRect(5 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -11 + y, 1, 1);
        g2d.fillRect(3 + x, -9 + y, 1, 1);
    }





    public void paintBackS4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(3 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -15 + y, 1, 1);
        g2d.fillRect(5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-1 + x, -42 + y, 2, 1);
        g2d.fillRect(2 + x, -41 + y, 1, 2);
        g2d.fillRect(1 + x, -41 + y, 1, 1);
        g2d.fillRect(-3 + x, -41 + y, 1, 1);
        g2d.fillRect(-4 + x, -40 + y, 1, 3);
        g2d.fillRect(3 + x, -39 + y, 1, 2);
        g2d.fillRect(-2 + x, -39 + y, 1, 1);
        g2d.fillRect(4 + x, -38 + y, 1, 2);
        g2d.fillRect(-5 + x, -38 + y, 1, 3);
        g2d.fillRect(5 + x, -36 + y, 1, 1);
        g2d.fillRect(2 + x, -35 + y, 1, 1);
        g2d.fillRect(-2 + x, -35 + y, 2, 1);
        g2d.fillRect(2 + x, -33 + y, 1, 1);
        g2d.fillRect(-1 + x, -33 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 1);
        g2d.fillRect(2 + x, -31 + y, 1, 2);
        g2d.fillRect(-1 + x, -30 + y, 1, 5);
        g2d.fillRect(1 + x, -29 + y, 1, 1);
        g2d.fillRect(0 + x, -27 + y, 1, 1);
        g2d.fillRect(3 + x, -26 + y, 1, 3);
        g2d.fillRect(2 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 4);
        g2d.fillRect(1 + x, -23 + y, 1, 1);
        g2d.fillRect(2 + x, -21 + y, 1, 1);
        g2d.fillRect(3 + x, -19 + y, 1, 2);
        g2d.fillRect(2 + x, -19 + y, 1, 2);
        g2d.fillRect(1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -13 + y, 1, 1);
        g2d.fillRect(2 + x, -13 + y, 1, 1);
        g2d.fillRect(1 + x, -11 + y, 1, 1);
        g2d.fillRect(4 + x, -10 + y, 1, 1);
        g2d.fillRect(2 + x, -9 + y, 1, 1);
        g2d.fillRect(5 + x, -8 + y, 1, 3);
        g2d.fillRect(3 + x, -8 + y, 1, 1);
        g2d.fillRect(1 + x, -7 + y, 1, 1);
        g2d.fillRect(2 + x, -6 + y, 1, 4);
        g2d.fillRect(5 + x, -4 + y, 1, 1);
        g2d.fillRect(3 + x, -3 + y, 1, 1);
        g2d.fillRect(4 + x, -2 + y, 3, 1);
        g2d.fillRect(1 + x, -2 + y, 1, 1);
        g2d.fillRect(2 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(2 + x, -43 + y, 1, 2);
        g2d.fillRect(-3 + x, -43 + y, 4, 1);
        g2d.fillRect(4 + x, -42 + y, 1, 1);
        g2d.fillRect(-5 + x, -42 + y, 4, 1);
        g2d.fillRect(5 + x, -41 + y, 1, 2);
        g2d.fillRect(3 + x, -41 + y, 1, 1);
        g2d.fillRect(-5 + x, -41 + y, 2, 1);
        g2d.fillRect(-5 + x, -40 + y, 1, 2);
        g2d.fillRect(5 + x, -37 + y, 1, 1);
        g2d.fillRect(-4 + x, -37 + y, 1, 1);
        g2d.fillRect(4 + x, -36 + y, 1, 1);
        g2d.fillRect(-3 + x, -36 + y, 1, 1);
        g2d.fillRect(5 + x, -35 + y, 1, 1);
        g2d.fillRect(3 + x, -35 + y, 1, 9);
        g2d.fillRect(-4 + x, -35 + y, 1, 1);
        g2d.fillRect(4 + x, -34 + y, 1, 1);
        g2d.fillRect(-3 + x, -34 + y, 6, 1);
        g2d.fillRect(-2 + x, -33 + y, 1, 8);
        g2d.fillRect(-3 + x, -33 + y, 1, 1);
        g2d.fillRect(-1 + x, -31 + y, 1, 1);
        g2d.fillRect(0 + x, -30 + y, 1, 1);
        g2d.fillRect(2 + x, -29 + y, 1, 4);
        g2d.fillRect(1 + x, -26 + y, 1, 3);
        g2d.fillRect(-1 + x, -25 + y, 1, 10);
        g2d.fillRect(2 + x, -24 + y, 1, 1);
        g2d.fillRect(3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(2 + x, -20 + y, 1, 1);
        g2d.fillRect(4 + x, -19 + y, 1, 2);
        g2d.fillRect(0 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(4 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -13 + y, 1, 2);
        g2d.fillRect(1 + x, -13 + y, 1, 2);
        g2d.fillRect(2 + x, -12 + y, 1, 1);
        g2d.fillRect(1 + x, -10 + y, 1, 3);
        g2d.fillRect(6 + x, -8 + y, 1, 5);
        g2d.fillRect(2 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -7 + y, 1, 2);
        g2d.fillRect(4 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -5 + y, 1, 5);
        g2d.fillRect(1 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -3 + y, 1, 1);
        g2d.fillRect(6 + x, -1 + y, 1, 2);
        g2d.fillRect(1 + x, -1 + y, 1, 2);
        g2d.fillRect(2 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(4 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -15 + y, 1, 1);
        g2d.fillRect(4 + x, -11 + y, 1, 1);
        g2d.fillRect(5 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -44 + y, 1, 1);
        g2d.fillRect(3 + x, -42 + y, 1, 1);
        g2d.fillRect(1 + x, -42 + y, 1, 1);
        g2d.fillRect(0 + x, -41 + y, 1, 2);
        g2d.fillRect(-1 + x, -41 + y, 1, 1);
        g2d.fillRect(3 + x, -40 + y, 2, 1);
        g2d.fillRect(-3 + x, -40 + y, 1, 1);
        g2d.fillRect(5 + x, -39 + y, 1, 1);
        g2d.fillRect(1 + x, -39 + y, 2, 1);
        g2d.fillRect(0 + x, -38 + y, 2, 1);
        g2d.fillRect(-2 + x, -38 + y, 1, 2);
        g2d.fillRect(-3 + x, -38 + y, 1, 1);
        g2d.fillRect(3 + x, -37 + y, 1, 1);
        g2d.fillRect(0 + x, -37 + y, 1, 1);
        g2d.fillRect(-1 + x, -36 + y, 1, 1);
        g2d.fillRect(-4 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -35 + y, 2, 1);
        g2d.fillRect(-3 + x, -35 + y, 1, 1);
        g2d.fillRect(0 + x, -33 + y, 1, 3);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(1 + x, -18 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 3);
        g2d.fillRect(3 + x, -16 + y, 1, 4);
        g2d.fillRect(3 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -5 + y, 2, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 1);
        g2d.fillRect(4 + x, -3 + y, 1, 1);
        g2d.fillRect(2 + x, -2 + y, 2, 1);
        g2d.fillRect(5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(4 + x, -41 + y, 1, 1);
        g2d.fillRect(-2 + x, -41 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 1);
        g2d.fillRect(-1 + x, -40 + y, 1, 4);
        g2d.fillRect(4 + x, -39 + y, 1, 1);
        g2d.fillRect(0 + x, -39 + y, 1, 1);
        g2d.fillRect(-3 + x, -39 + y, 1, 1);
        g2d.fillRect(5 + x, -38 + y, 1, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 3);
        g2d.fillRect(1 + x, -37 + y, 1, 2);
        g2d.fillRect(-3 + x, -37 + y, 1, 1);
        g2d.fillRect(3 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -36 + y, 1, 1);
        g2d.fillRect(-2 + x, -36 + y, 1, 1);
        g2d.fillRect(4 + x, -35 + y, 1, 1);
        g2d.fillRect(1 + x, -33 + y, 1, 1);
        g2d.fillRect(2 + x, -32 + y, 1, 1);
        g2d.fillRect(1 + x, -31 + y, 1, 2);
        g2d.fillRect(0 + x, -29 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(2 + x, -23 + y, 1, 2);
        g2d.fillRect(1 + x, -22 + y, 1, 1);
        g2d.fillRect(2 + x, -17 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 2, 1);
        g2d.fillRect(2 + x, -11 + y, 2, 1);
        g2d.fillRect(2 + x, -10 + y, 1, 1);
        g2d.fillRect(1 + x, -6 + y, 1, 1);
        g2d.fillRect(5 + x, -5 + y, 1, 1);
        g2d.fillRect(4 + x, -4 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 1);
        g2d.fillRect(5 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -11 + y, 1, 1);
        g2d.fillRect(3 + x, -9 + y, 1, 1);
    }





    public void paintBackS5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(3 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -15 + y, 1, 1);
        g2d.fillRect(5 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-1 + x, -41 + y, 2, 1);
        g2d.fillRect(2 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 1);
        g2d.fillRect(-3 + x, -40 + y, 1, 1);
        g2d.fillRect(-4 + x, -39 + y, 1, 3);
        g2d.fillRect(3 + x, -38 + y, 1, 2);
        g2d.fillRect(-2 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 1, 2);
        g2d.fillRect(-5 + x, -37 + y, 1, 3);
        g2d.fillRect(5 + x, -35 + y, 1, 1);
        g2d.fillRect(2 + x, -34 + y, 1, 1);
        g2d.fillRect(-2 + x, -34 + y, 2, 1);
        g2d.fillRect(2 + x, -32 + y, 1, 3);
        g2d.fillRect(-1 + x, -32 + y, 1, 1);
        g2d.fillRect(-1 + x, -30 + y, 1, 5);
        g2d.fillRect(1 + x, -29 + y, 1, 1);
        g2d.fillRect(0 + x, -27 + y, 1, 1);
        g2d.fillRect(3 + x, -26 + y, 1, 3);
        g2d.fillRect(2 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 4);
        g2d.fillRect(1 + x, -23 + y, 1, 1);
        g2d.fillRect(2 + x, -21 + y, 1, 1);
        g2d.fillRect(3 + x, -19 + y, 1, 2);
        g2d.fillRect(2 + x, -19 + y, 1, 2);
        g2d.fillRect(1 + x, -17 + y, 1, 4);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(4 + x, -13 + y, 1, 1);
        g2d.fillRect(2 + x, -13 + y, 1, 1);
        g2d.fillRect(1 + x, -11 + y, 1, 1);
        g2d.fillRect(4 + x, -10 + y, 1, 1);
        g2d.fillRect(2 + x, -9 + y, 1, 1);
        g2d.fillRect(5 + x, -8 + y, 1, 3);
        g2d.fillRect(3 + x, -8 + y, 1, 1);
        g2d.fillRect(1 + x, -7 + y, 1, 1);
        g2d.fillRect(2 + x, -6 + y, 1, 4);
        g2d.fillRect(5 + x, -4 + y, 1, 1);
        g2d.fillRect(3 + x, -3 + y, 1, 1);
        g2d.fillRect(4 + x, -2 + y, 3, 1);
        g2d.fillRect(1 + x, -2 + y, 1, 1);
        g2d.fillRect(2 + x, -1 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(1 + x, -43 + y, 1, 2);
        g2d.fillRect(2 + x, -42 + y, 1, 2);
        g2d.fillRect(-3 + x, -42 + y, 4, 1);
        g2d.fillRect(4 + x, -41 + y, 1, 1);
        g2d.fillRect(-5 + x, -41 + y, 4, 1);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 1);
        g2d.fillRect(-5 + x, -40 + y, 2, 1);
        g2d.fillRect(-5 + x, -39 + y, 1, 2);
        g2d.fillRect(5 + x, -36 + y, 1, 1);
        g2d.fillRect(-4 + x, -36 + y, 1, 1);
        g2d.fillRect(4 + x, -35 + y, 1, 1);
        g2d.fillRect(-3 + x, -35 + y, 1, 1);
        g2d.fillRect(5 + x, -34 + y, 1, 1);
        g2d.fillRect(3 + x, -34 + y, 1, 8);
        g2d.fillRect(-4 + x, -34 + y, 1, 1);
        g2d.fillRect(4 + x, -33 + y, 1, 1);
        g2d.fillRect(-3 + x, -33 + y, 6, 1);
        g2d.fillRect(-2 + x, -32 + y, 1, 7);
        g2d.fillRect(-3 + x, -32 + y, 1, 1);
        g2d.fillRect(-1 + x, -31 + y, 1, 1);
        g2d.fillRect(0 + x, -30 + y, 1, 1);
        g2d.fillRect(2 + x, -29 + y, 1, 4);
        g2d.fillRect(1 + x, -26 + y, 1, 3);
        g2d.fillRect(-1 + x, -25 + y, 1, 10);
        g2d.fillRect(2 + x, -24 + y, 1, 1);
        g2d.fillRect(3 + x, -23 + y, 1, 4);
        g2d.fillRect(0 + x, -21 + y, 1, 1);
        g2d.fillRect(2 + x, -20 + y, 1, 1);
        g2d.fillRect(4 + x, -19 + y, 1, 2);
        g2d.fillRect(0 + x, -19 + y, 2, 1);
        g2d.fillRect(0 + x, -18 + y, 1, 1);
        g2d.fillRect(0 + x, -16 + y, 1, 16);
        g2d.fillRect(4 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -13 + y, 1, 2);
        g2d.fillRect(1 + x, -13 + y, 1, 2);
        g2d.fillRect(2 + x, -12 + y, 1, 1);
        g2d.fillRect(1 + x, -10 + y, 1, 3);
        g2d.fillRect(6 + x, -8 + y, 1, 5);
        g2d.fillRect(2 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -7 + y, 1, 2);
        g2d.fillRect(4 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -5 + y, 1, 5);
        g2d.fillRect(1 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -3 + y, 1, 1);
        g2d.fillRect(6 + x, -1 + y, 1, 2);
        g2d.fillRect(1 + x, -1 + y, 1, 2);
        g2d.fillRect(2 + x, 0 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(4 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -15 + y, 1, 1);
        g2d.fillRect(4 + x, -11 + y, 1, 1);
        g2d.fillRect(5 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -9 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, -43 + y, 1, 1);
        g2d.fillRect(3 + x, -41 + y, 1, 1);
        g2d.fillRect(1 + x, -41 + y, 1, 1);
        g2d.fillRect(0 + x, -40 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 1);
        g2d.fillRect(3 + x, -39 + y, 2, 1);
        g2d.fillRect(-3 + x, -39 + y, 1, 1);
        g2d.fillRect(5 + x, -38 + y, 1, 1);
        g2d.fillRect(1 + x, -38 + y, 2, 1);
        g2d.fillRect(0 + x, -37 + y, 2, 1);
        g2d.fillRect(-2 + x, -37 + y, 1, 2);
        g2d.fillRect(-3 + x, -37 + y, 1, 1);
        g2d.fillRect(3 + x, -36 + y, 1, 1);
        g2d.fillRect(0 + x, -36 + y, 1, 1);
        g2d.fillRect(-1 + x, -35 + y, 1, 1);
        g2d.fillRect(-4 + x, -35 + y, 1, 1);
        g2d.fillRect(0 + x, -34 + y, 2, 1);
        g2d.fillRect(-3 + x, -34 + y, 1, 1);
        g2d.fillRect(0 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(1 + x, -21 + y, 1, 2);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(1 + x, -18 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 3);
        g2d.fillRect(3 + x, -16 + y, 1, 4);
        g2d.fillRect(3 + x, -10 + y, 1, 1);
        g2d.fillRect(4 + x, -8 + y, 1, 2);
        g2d.fillRect(3 + x, -5 + y, 2, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 1);
        g2d.fillRect(4 + x, -3 + y, 1, 1);
        g2d.fillRect(2 + x, -2 + y, 2, 1);
        g2d.fillRect(5 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(4 + x, -40 + y, 1, 1);
        g2d.fillRect(-2 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -39 + y, 1, 1);
        g2d.fillRect(-1 + x, -39 + y, 1, 4);
        g2d.fillRect(4 + x, -38 + y, 1, 1);
        g2d.fillRect(0 + x, -38 + y, 1, 1);
        g2d.fillRect(-3 + x, -38 + y, 1, 1);
        g2d.fillRect(5 + x, -37 + y, 1, 1);
        g2d.fillRect(2 + x, -37 + y, 1, 3);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(-3 + x, -36 + y, 1, 1);
        g2d.fillRect(3 + x, -35 + y, 1, 1);
        g2d.fillRect(0 + x, -35 + y, 1, 1);
        g2d.fillRect(-2 + x, -35 + y, 1, 1);
        g2d.fillRect(4 + x, -34 + y, 1, 1);
        g2d.fillRect(1 + x, -32 + y, 1, 3);
        g2d.fillRect(0 + x, -29 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(2 + x, -23 + y, 1, 2);
        g2d.fillRect(1 + x, -22 + y, 1, 1);
        g2d.fillRect(2 + x, -17 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 2, 1);
        g2d.fillRect(2 + x, -11 + y, 2, 1);
        g2d.fillRect(2 + x, -10 + y, 1, 1);
        g2d.fillRect(1 + x, -6 + y, 1, 1);
        g2d.fillRect(5 + x, -5 + y, 1, 1);
        g2d.fillRect(4 + x, -4 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 1);
        g2d.fillRect(5 + x, -3 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 1);
        g2d.fillRect(5 + x, -11 + y, 1, 1);
        g2d.fillRect(3 + x, -9 + y, 1, 1);
    }

}
