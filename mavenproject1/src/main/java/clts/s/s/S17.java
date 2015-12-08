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
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class S17 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public S17()
    {
        super();
        strapAllowed = false;
    }

    public S17(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(-3 + x + tempXpos, -14 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -10 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(-3 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -8 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(-3 + x + tempXpos, -13 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(-2 + x + tempXpos, -14 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(-4 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(-3 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(-3 + x + tempXpos, -6 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(-3 + x + tempXpos, -7 + tempYpos, 1, 1);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(3 + x + tempXpos, -14 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -10 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(3 + x + tempXpos, -12 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -8 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(3 + x + tempXpos, -13 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(2 + x + tempXpos, -14 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -11 + tempYpos, 1, 1);
        g2d.fillRect(4 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(3 + x + tempXpos, -9 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -6 + tempYpos, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2 + (int)(Math.random() * 7)));
        g2d.fillRect(3 + x + tempXpos, -7 + tempYpos, 1, 1);
    }
}
