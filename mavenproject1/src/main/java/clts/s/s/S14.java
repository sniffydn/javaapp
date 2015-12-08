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
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class S14 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public S14()
    {
        super();
        strapAllowed = false;
        nurse = true;
    }

    public S14(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        nurse = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-2 + x + tempXpos, -13 + tempYpos, 1, 4);
        g2d.fillRect(-1 + x + tempXpos, -13 + tempYpos, 1, 2);
        g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 11);
        g2d.fillRect(-5 + x + tempXpos, -12 + tempYpos, 1, 9);
        g2d.fillRect(-4 + x + tempXpos, -12 + tempYpos, 1, 3);
        g2d.fillRect(-3 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -10 + tempYpos, 1, 5);
        g2d.fillRect(-1 + x + tempXpos, -10 + tempYpos, 1, 8);
        g2d.fillRect(-6 + x + tempXpos, -8 + tempYpos, 1, 6);
        g2d.fillRect(-4 + x + tempXpos, -8 + tempYpos, 1, 1);
        g2d.fillRect(-2 + x + tempXpos, -8 + tempYpos, 1, 1);
        g2d.fillRect(-4 + x + tempXpos, -6 + tempYpos, 1, 3);
        g2d.fillRect(-2 + x + tempXpos, -6 + tempYpos, 1, 4);
        g2d.fillRect(-7 + x + tempXpos, -5 + tempYpos, 1, 3);
        g2d.fillRect(-3 + x + tempXpos, -4 + tempYpos, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 1);
        g2d.fillRect(1 + x + tempXpos, -13 + tempYpos, 1, 1);
        g2d.fillRect(-8 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(4 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(-7 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(-1 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(5 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(-9 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(-4 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(-2 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(-4 + x + tempXpos, -7 + tempYpos, 1, 1);
        g2d.fillRect(-2 + x + tempXpos, -7 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.fillRect(-5 + x + tempXpos, -3 + tempYpos, 1, 4);
        g2d.fillRect(-4 + x + tempXpos, -3 + tempYpos, 1, 4);
        g2d.fillRect(-3 + x + tempXpos, -3 + tempYpos, 1, 4);
        g2d.fillRect(-7 + x + tempXpos, -2 + tempYpos, 1, 2);
        g2d.fillRect(-6 + x + tempXpos, -2 + tempYpos, 1, 2);
        g2d.fillRect(-2 + x + tempXpos, -2 + tempYpos, 1, 3);
        g2d.fillRect(-1 + x + tempXpos, -2 + tempYpos, 1, 2);
        g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(2 + x + tempXpos, -13 + tempYpos, 1, 4);
        g2d.fillRect(1 + x + tempXpos, -13 + tempYpos, 1, 2);
        g2d.fillRect(0 + x + tempXpos, -13 + tempYpos, 1, 11);
        g2d.fillRect(5 + x + tempXpos, -12 + tempYpos, 1, 9);
        g2d.fillRect(4 + x + tempXpos, -12 + tempYpos, 1, 3);
        g2d.fillRect(3 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -10 + tempYpos, 1, 5);
        g2d.fillRect(1 + x + tempXpos, -10 + tempYpos, 1, 8);
        g2d.fillRect(6 + x + tempXpos, -8 + tempYpos, 1, 6);
        g2d.fillRect(4 + x + tempXpos, -8 + tempYpos, 1, 1);
        g2d.fillRect(2 + x + tempXpos, -8 + tempYpos, 1, 1);
        g2d.fillRect(4 + x + tempXpos, -6 + tempYpos, 1, 3);
        g2d.fillRect(2 + x + tempXpos, -6 + tempYpos, 1, 4);
        g2d.fillRect(7 + x + tempXpos, -5 + tempYpos, 1, 3);
        g2d.fillRect(3 + x + tempXpos, -4 + tempYpos, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 1);
        g2d.fillRect(-1 + x + tempXpos, -13 + tempYpos, 1, 1);
        g2d.fillRect(8 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(-4 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(7 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(1 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(-5 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(9 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(4 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(2 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(4 + x + tempXpos, -7 + tempYpos, 1, 1);
        g2d.fillRect(2 + x + tempXpos, -7 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.fillRect(5 + x + tempXpos, -3 + tempYpos, 1, 4);
        g2d.fillRect(4 + x + tempXpos, -3 + tempYpos, 1, 4);
        g2d.fillRect(3 + x + tempXpos, -3 + tempYpos, 1, 4);
        g2d.fillRect(7 + x + tempXpos, -2 + tempYpos, 1, 2);
        g2d.fillRect(6 + x + tempXpos, -2 + tempYpos, 1, 2);
        g2d.fillRect(2 + x + tempXpos, -2 + tempYpos, 1, 3);
        g2d.fillRect(1 + x + tempXpos, -2 + tempYpos, 1, 2);
        g2d.fillRect(0 + x + tempXpos, -2 + tempYpos, 1, 2);
    }
}
