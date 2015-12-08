/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.SuperS;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class B extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public B()
    {
        super();
    }

    public B(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -44 + tempYpos, 7, 1);
            g2d.fillRect(-4 + tempXpos + x, -43 + tempYpos, 1, 6);
            g2d.fillRect(4 + tempXpos + x, -43 + tempYpos, 1, 6);
            g2d.fillRect(3 + tempXpos + x, -37 + tempYpos, 1, 4);
            g2d.fillRect(-3 + tempXpos + x, -37 + tempYpos, 1, 20);
            g2d.fillRect(2 + tempXpos + x, -33 + tempYpos, 1, 7);
            g2d.fillRect(1 + tempXpos + x, -26 + tempYpos, 1, 11);
            g2d.fillRect(-4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + tempXpos + x, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + tempXpos + x, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, -1 + tempYpos, 2, 1);
            g2d.fillRect(-6 + tempXpos + x, 0 + tempYpos, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-2 + tempXpos + x, -43 + tempYpos, 5, 1);
            g2d.fillRect(3 + tempXpos + x, -43 + tempYpos, 1, 6);
            g2d.fillRect(-3 + tempXpos + x, -43 + tempYpos, 1, 6);
            g2d.fillRect(2 + tempXpos + x, -37 + tempYpos, 1, 4);
            g2d.fillRect(-2 + tempXpos + x, -37 + tempYpos, 1, 20);
            g2d.fillRect(1 + tempXpos + x, -33 + tempYpos, 1, 7);
            g2d.fillRect(0 + tempXpos + x, -26 + tempYpos, 1, 11);
            g2d.fillRect(-3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(-1 + tempXpos + x, -15 + tempYpos, 1, 13);
            g2d.fillRect(-5 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(-6 + tempXpos + x, -5 + tempYpos, 1, 3);
            g2d.fillRect(-6 + tempXpos + x, -2 + tempYpos, 6, 1);
            g2d.fillRect(-4 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -42 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -37 + tempYpos, 3, 4);
            g2d.fillRect(-1 + tempXpos + x, -33 + tempYpos, 2, 7);
            g2d.fillRect(-1 + tempXpos + x, -26 + tempYpos, 1, 11);
            g2d.fillRect(-2 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(-3 + tempXpos + x, -14 + tempYpos, 2, 12);
            g2d.fillRect(-4 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(-5 + tempXpos + x, -3 + tempYpos, 2, 1);
        }
        else if(step == 1 || step == 7)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -43 + tempYpos, 7, 1);
            g2d.fillRect(-4 + tempXpos + x, -42 + tempYpos, 1, 6);
            g2d.fillRect(-3 + tempXpos + x, -36 + tempYpos, 1, 19);
            g2d.fillRect(-4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(-6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(4 + tempXpos + x, -42 + tempYpos, 1, 6);
            g2d.fillRect(3 + tempXpos + x, -36 + tempYpos, 1, 4);
            g2d.fillRect(2 + tempXpos + x, -32 + tempYpos, 1, 7);
            g2d.fillRect(1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 15);
            g2d.fillRect(-7 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(-2 + tempXpos + x, -1 + tempYpos, 2, 1);
            g2d.fillRect(-6 + tempXpos + x, 0 + tempYpos, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + tempXpos + x, -42 + tempYpos, 7, 1);
            g2d.fillRect(-3 + tempXpos + x, -41 + tempYpos, 1, 5);
            g2d.fillRect(3 + tempXpos + x, -41 + tempYpos, 1, 5);
            g2d.fillRect(-2 + tempXpos + x, -36 + tempYpos, 1, 19);
            g2d.fillRect(2 + tempXpos + x, -36 + tempYpos, 1, 4);
            g2d.fillRect(1 + tempXpos + x, -32 + tempYpos, 1, 7);
            g2d.fillRect(0 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(-3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(-1 + tempXpos + x, -15 + tempYpos, 1, 14);
            g2d.fillRect(-5 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(-6 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + tempXpos + x, -2 + tempYpos, 4, 1);
            g2d.fillRect(-4 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -41 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -36 + tempYpos, 3, 4);
            g2d.fillRect(-1 + tempXpos + x, -32 + tempYpos, 2, 7);
            g2d.fillRect(-1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(-2 + tempXpos + x, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + tempXpos + x, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(-5 + tempXpos + x, -3 + tempYpos, 2, 1);
        }
        else if(step == 2 || step == 6)
        {
                         g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -42 + tempYpos, 7, 1);
            g2d.fillRect(-4 + tempXpos + x, -41 + tempYpos, 1, 6);
            g2d.fillRect(4 + tempXpos + x, -41 + tempYpos, 1, 6);
            g2d.fillRect(3 + tempXpos + x, -35 + tempYpos, 1, 4);
            g2d.fillRect(2 + tempXpos + x, -31 + tempYpos, 1, 6);
            g2d.fillRect(1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(-3 + tempXpos + x, -35 + tempYpos, 1, 18);
            g2d.fillRect(-4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(-6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 14);
            g2d.fillRect(-7 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(-2 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(-6 + tempXpos + x, 0 + tempYpos, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + tempXpos + x, -41 + tempYpos, 7, 1);
            g2d.fillRect(-3 + tempXpos + x, -40 + tempYpos, 1, 5);
            g2d.fillRect(-2 + tempXpos + x, -35 + tempYpos, 1, 18);
            g2d.fillRect(3 + tempXpos + x, -40 + tempYpos, 1, 5);
            g2d.fillRect(2 + tempXpos + x, -35 + tempYpos, 1, 4);
            g2d.fillRect(1 + tempXpos + x, -31 + tempYpos, 1, 6);
            g2d.fillRect(0 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(-3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(-1 + tempXpos + x, -15 + tempYpos, 1, 13);
            g2d.fillRect(-5 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(-6 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + tempXpos + x, -2 + tempYpos, 5, 1);
            g2d.fillRect(-4 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -40 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -35 + tempYpos, 3, 4);
            g2d.fillRect(-1 + tempXpos + x, -31 + tempYpos, 2, 6);
            g2d.fillRect(-1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(-2 + tempXpos + x, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + tempXpos + x, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + tempXpos + x, -8 + tempYpos, 1, 6);
            g2d.fillRect(-5 + tempXpos + x, -3 + tempYpos, 1, 1);
        }
        else if(step == 3 || step == 4 || step == 5)
        {
                         g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -40 + tempYpos, 7, 1);
            g2d.fillRect(-4 + tempXpos + x, -39 + tempYpos, 1, 6);
            g2d.fillRect(4 + tempXpos + x, -39 + tempYpos, 1, 6);
            g2d.fillRect(-3 + tempXpos + x, -33 + tempYpos, 1, 16);
            g2d.fillRect(3 + tempXpos + x, -33 + tempYpos, 1, 4);
            g2d.fillRect(2 + tempXpos + x, -29 + tempYpos, 1, 5);
            g2d.fillRect(1 + tempXpos + x, -24 + tempYpos, 1, 9);
            g2d.fillRect(-4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(-5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 15);
            g2d.fillRect(-6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(-7 + tempXpos + x, -5 + tempYpos, 1, 5);
            g2d.fillRect(-6 + tempXpos + x, -1 + tempYpos, 2, 1);
            g2d.fillRect(-2 + tempXpos + x, -1 + tempYpos, 2, 1);
            g2d.fillRect(-6 + tempXpos + x, 0 + tempYpos, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + tempXpos + x, -39 + tempYpos, 7, 1);
            g2d.fillRect(-3 + tempXpos + x, -38 + tempYpos, 1, 5);
            g2d.fillRect(3 + tempXpos + x, -38 + tempYpos, 1, 5);
            g2d.fillRect(-2 + tempXpos + x, -33 + tempYpos, 1, 16);
            g2d.fillRect(2 + tempXpos + x, -33 + tempYpos, 1, 4);
            g2d.fillRect(1 + tempXpos + x, -29 + tempYpos, 1, 5);
            g2d.fillRect(0 + tempXpos + x, -24 + tempYpos, 1, 9);
            g2d.fillRect(-3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(-4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(-1 + tempXpos + x, -15 + tempYpos, 1, 13);
            g2d.fillRect(-5 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(-6 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(-5 + tempXpos + x, -2 + tempYpos, 5, 1);
            g2d.fillRect(-4 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -38 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -33 + tempYpos, 3, 4);
            g2d.fillRect(-1 + tempXpos + x, -29 + tempYpos, 2, 5);
            g2d.fillRect(-1 + tempXpos + x, -24 + tempYpos, 1, 9);
            g2d.fillRect(-2 + tempXpos + x, -17 + tempYpos, 1, 15);
            g2d.fillRect(-3 + tempXpos + x, -14 + tempYpos, 1, 12);
            g2d.fillRect(-4 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(-5 + tempXpos + x, -3 + tempYpos, 2, 1);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;


        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
                         g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -44 + tempYpos, 7, 1);
            g2d.fillRect(-4 + tempXpos + x, -43 + tempYpos, 1, 6);
            g2d.fillRect(4 + tempXpos + x, -43 + tempYpos, 1, 6);
            g2d.fillRect(-3 + tempXpos + x, -37 + tempYpos, 1, 4);
            g2d.fillRect(3 + tempXpos + x, -37 + tempYpos, 1, 20);
            g2d.fillRect(-2 + tempXpos + x, -33 + tempYpos, 1, 7);
            g2d.fillRect(-1 + tempXpos + x, -26 + tempYpos, 1, 11);
            g2d.fillRect(4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 14);
            g2d.fillRect(6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(0 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(5 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + tempXpos + x, 0 + tempYpos, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + tempXpos + x, -43 + tempYpos, 7, 1);
            g2d.fillRect(-3 + tempXpos + x, -42 + tempYpos, 1, 5);
            g2d.fillRect(3 + tempXpos + x, -42 + tempYpos, 1, 5);
            g2d.fillRect(-2 + tempXpos + x, -37 + tempYpos, 1, 4);
            g2d.fillRect(2 + tempXpos + x, -38 + tempYpos, 1, 21);
            g2d.fillRect(-1 + tempXpos + x, -33 + tempYpos, 1, 7);
            g2d.fillRect(0 + tempXpos + x, -26 + tempYpos, 1, 11);
            g2d.fillRect(3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(1 + tempXpos + x, -15 + tempYpos, 1, 13);
            g2d.fillRect(1 + tempXpos + x, -2 + tempYpos, 5, 1);
            g2d.fillRect(5 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(6 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(3 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -42 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -37 + tempYpos, 3, 4);
            g2d.fillRect(0 + tempXpos + x, -33 + tempYpos, 2, 7);
            g2d.fillRect(1 + tempXpos + x, -26 + tempYpos, 1, 11);
            g2d.fillRect(2 + tempXpos + x, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + tempXpos + x, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + tempXpos + x, -8 + tempYpos, 1, 6);
            g2d.fillRect(5 + tempXpos + x, -3 + tempYpos, 1, 1);
        }
        else if(step == 9 || step == 15)
        {
                         g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -43 + tempYpos, 7, 1);
            g2d.fillRect(-4 + tempXpos + x, -42 + tempYpos, 1, 6);
            g2d.fillRect(4 + tempXpos + x, -42 + tempYpos, 1, 6);
            g2d.fillRect(-3 + tempXpos + x, -36 + tempYpos, 1, 4);
            g2d.fillRect(-2 + tempXpos + x, -32 + tempYpos, 1, 7);
            g2d.fillRect(-1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 14);
            g2d.fillRect(3 + tempXpos + x, -36 + tempYpos, 1, 19);
            g2d.fillRect(4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(0 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(5 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + tempXpos + x, 0 + tempYpos, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + tempXpos + x, -42 + tempYpos, 7, 1);
            g2d.fillRect(-3 + tempXpos + x, -41 + tempYpos, 1, 5);
            g2d.fillRect(3 + tempXpos + x, -41 + tempYpos, 1, 5);
            g2d.fillRect(-2 + tempXpos + x, -36 + tempYpos, 1, 4);
            g2d.fillRect(-1 + tempXpos + x, -32 + tempYpos, 1, 7);
            g2d.fillRect(0 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(1 + tempXpos + x, -15 + tempYpos, 1, 13);
            g2d.fillRect(2 + tempXpos + x, -36 + tempYpos, 1, 19);
            g2d.fillRect(3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(5 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(6 + tempXpos + x, -5 + tempYpos, 1, 3);
            g2d.fillRect(1 + tempXpos + x, -2 + tempYpos, 6, 1);
            g2d.fillRect(3 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -41 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -36 + tempYpos, 3, 4);
            g2d.fillRect(0 + tempXpos + x, -32 + tempYpos, 2, 7);
            g2d.fillRect(1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(2 + tempXpos + x, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + tempXpos + x, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + tempXpos + x, -8 + tempYpos, 1, 6);
            g2d.fillRect(5 + tempXpos + x, -3 + tempYpos, 1, 1);
        }
        else if(step == 10 || step == 14)
        {
                         g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -42 + tempYpos, 7, 1);
            g2d.fillRect(4 + tempXpos + x, -41 + tempYpos, 1, 6);
            g2d.fillRect(-4 + tempXpos + x, -41 + tempYpos, 1, 6);
            g2d.fillRect(-3 + tempXpos + x, -35 + tempYpos, 1, 4);
            g2d.fillRect(-2 + tempXpos + x, -31 + tempYpos, 1, 6);
            g2d.fillRect(-1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(3 + tempXpos + x, -35 + tempYpos, 1, 18);
            g2d.fillRect(4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 15);
            g2d.fillRect(6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + tempXpos + x, -5 + tempYpos, 1, 5);
            g2d.fillRect(1 + tempXpos + x, -1 + tempYpos, 2, 1);
            g2d.fillRect(5 + tempXpos + x, -1 + tempYpos, 2, 1);
            g2d.fillRect(1 + tempXpos + x, 0 + tempYpos, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + tempXpos + x, -41 + tempYpos, 7, 1);
            g2d.fillRect(-3 + tempXpos + x, -40 + tempYpos, 1, 5);
            g2d.fillRect(-2 + tempXpos + x, -35 + tempYpos, 1, 4);
            g2d.fillRect(-1 + tempXpos + x, -31 + tempYpos, 1, 6);
            g2d.fillRect(0 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(1 + tempXpos + x, -15 + tempYpos, 1, 13);
            g2d.fillRect(3 + tempXpos + x, -40 + tempYpos, 1, 5);
            g2d.fillRect(2 + tempXpos + x, -35 + tempYpos, 1, 18);
            g2d.fillRect(3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(5 + tempXpos + x, -9 + tempYpos, 1, 6);
            g2d.fillRect(6 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(1 + tempXpos + x, -2 + tempYpos, 5, 1);
            g2d.fillRect(3 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -40 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -35 + tempYpos, 3, 4);
            g2d.fillRect(0 + tempXpos + x, -31 + tempYpos, 2, 6);
            g2d.fillRect(1 + tempXpos + x, -25 + tempYpos, 1, 10);
            g2d.fillRect(2 + tempXpos + x, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + tempXpos + x, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + tempXpos + x, -8 + tempYpos, 1, 6);
            g2d.fillRect(5 + tempXpos + x, -3 + tempYpos, 1, 1);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
                         g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-3 + tempXpos + x, -40 + tempYpos, 7, 1);
            g2d.fillRect(-4 + tempXpos + x, -39 + tempYpos, 1, 6);
            g2d.fillRect(4 + tempXpos + x, -39 + tempYpos, 1, 6);
            g2d.fillRect(-3 + tempXpos + x, -33 + tempYpos, 1, 4);
            g2d.fillRect(-2 + tempXpos + x, -29 + tempYpos, 1, 5);
            g2d.fillRect(-1 + tempXpos + x, -24 + tempYpos, 1, 9);
            g2d.fillRect(0 + tempXpos + x, -15 + tempYpos, 1, 14);
            g2d.fillRect(3 + tempXpos + x, -33 + tempYpos, 1, 16);
            g2d.fillRect(4 + tempXpos + x, -17 + tempYpos, 1, 1);
            g2d.fillRect(5 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(6 + tempXpos + x, -8 + tempYpos, 1, 3);
            g2d.fillRect(7 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(0 + tempXpos + x, -1 + tempYpos, 3, 1);
            g2d.fillRect(1 + tempXpos + x, 0 + tempYpos, 6, 1);
            g2d.fillRect(5 + tempXpos + x, -1 + tempYpos, 3, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + tempXpos + x, -39 + tempYpos, 7, 1);
            g2d.fillRect(-3 + tempXpos + x, -38 + tempYpos, 1, 5);
            g2d.fillRect(-2 + tempXpos + x, -33 + tempYpos, 1, 4);
            g2d.fillRect(-1 + tempXpos + x, -29 + tempYpos, 1, 5);
            g2d.fillRect(0 + tempXpos + x, -24 + tempYpos, 1, 9);
            g2d.fillRect(1 + tempXpos + x, -15 + tempYpos, 1, 13);
            g2d.fillRect(3 + tempXpos + x, -38 + tempYpos, 1, 5);
            g2d.fillRect(2 + tempXpos + x, -33 + tempYpos, 1, 16);
            g2d.fillRect(3 + tempXpos + x, -17 + tempYpos, 1, 3);
            g2d.fillRect(4 + tempXpos + x, -16 + tempYpos, 1, 8);
            g2d.fillRect(5 + tempXpos + x, -8 + tempYpos, 1, 5);
            g2d.fillRect(6 + tempXpos + x, -5 + tempYpos, 1, 4);
            g2d.fillRect(1 + tempXpos + x, -2 + tempYpos, 5, 1);
            g2d.fillRect(3 + tempXpos + x, -1 + tempYpos, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-2 + tempXpos + x, -38 + tempYpos, 5, 5);
            g2d.fillRect(-1 + tempXpos + x, -33 + tempYpos, 3, 4);
            g2d.fillRect(0 + tempXpos + x, -29 + tempYpos, 2, 5);
            g2d.fillRect(1 + tempXpos + x, -24 + tempYpos, 1, 9);
            g2d.fillRect(2 + tempXpos + x, -17 + tempYpos, 1, 15);
            g2d.fillRect(3 + tempXpos + x, -14 + tempYpos, 1, 12);
            g2d.fillRect(4 + tempXpos + x, -8 + tempYpos, 1, 6);
            g2d.fillRect(5 + tempXpos + x, -3 + tempYpos, 1, 1);
        }
    }
}
