/*
 * Shoes0.java
 *
 * Created on March 6, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import clts.SuperS;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class S26 extends SuperS
{

    /** Creates a new instance of Shoes0 */
    public S26()
    {
        super();
        drs = true;
    }

    public S26(ColorArray colorSwitch)
    {
        super(colorSwitch);
        drs = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        paintForwards(x + tempXpos, tempYpos, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {

        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        paintBackwards(x + tempXpos, tempYpos, g2d);
    }

    public void paintForwards(int x, int y, GraphicsMap g2d)
    {
g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
g2d.fillRect(-5 + x, 0 + y, 1, 1);
g2d.fillRect(-5 + x, -1 + y, 2, 1);
g2d.fillRect(-4 + x, -2 + y, 2, 1);
g2d.fillRect(-2 + x, -1 + y, 1, 2);
g2d.fillRect(-3 + x, 0 + y, 1, 1);
g2d.fillRect(-7 + x, -5 + y, 1, 1);
g2d.fillRect(0 + x, -5 + y, 1, 1);
g2d.fillRect(-5 + x, -6 + y, 5, 1);
g2d.fillRect(-6 + x, -6 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY));
g2d.fillRect(-6 + x, -1 + y, 1, 1);
g2d.fillRect(-6 + x, -2 + y, 2, 1);
g2d.fillRect(-5 + x, -3 + y, 4, 1);
g2d.fillRect(-2 + x, -2 + y, 2, 1);
g2d.fillRect(-1 + x, -1 + y, 1, 1);
g2d.fillRect(-7 + x, -4 + y, 1, 1);
g2d.fillRect(-6 + x, -5 + y, 6, 1);
g2d.fillRect(0 + x, -4 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
g2d.fillRect(-7 + x, -3 + y, 1, 3);
g2d.fillRect(-6 + x, -3 + y, 1, 1);
g2d.fillRect(-6 + x, -4 + y, 6, 1);
g2d.fillRect(-1 + x, -3 + y, 2, 1);
g2d.fillRect(0 + x, -2 + y, 1, 2);
g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
g2d.fillRect(-3 + x, -1 + y, 1, 1);
g2d.fillRect(-4 + x, 0 + y, 1, 1);
g2d.fillRect(-4 + x, -7 + y, 3, 1);
g2d.fillRect(-5 + x, -7 + y, 1, 1);
    }





    public void paintBackwards(int x, int y, GraphicsMap g2d)
    {
g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
g2d.fillRect(5 + x, 0 + y, 1, 1);
g2d.fillRect(4 + x, -1 + y, 2, 1);
g2d.fillRect(3 + x, -2 + y, 2, 1);
g2d.fillRect(2 + x, -1 + y, 1, 2);
g2d.fillRect(3 + x, 0 + y, 1, 1);
g2d.fillRect(7 + x, -5 + y, 1, 1);
g2d.fillRect(0 + x, -5 + y, 1, 1);
g2d.fillRect(1 + x, -6 + y, 5, 1);
g2d.fillRect(6 + x, -6 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY));
g2d.fillRect(6 + x, -1 + y, 1, 1);
g2d.fillRect(5 + x, -2 + y, 2, 1);
g2d.fillRect(2 + x, -3 + y, 4, 1);
g2d.fillRect(1 + x, -2 + y, 2, 1);
g2d.fillRect(1 + x, -1 + y, 1, 1);
g2d.fillRect(7 + x, -4 + y, 1, 1);
g2d.fillRect(1 + x, -5 + y, 6, 1);
g2d.fillRect(0 + x, -4 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
g2d.fillRect(7 + x, -3 + y, 1, 3);
g2d.fillRect(6 + x, -3 + y, 1, 1);
g2d.fillRect(1 + x, -4 + y, 6, 1);
g2d.fillRect(0 + x, -3 + y, 2, 1);
g2d.fillRect(0 + x, -2 + y, 1, 2);
g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
g2d.fillRect(3 + x, -1 + y, 1, 1);
g2d.fillRect(4 + x, 0 + y, 1, 1);
g2d.fillRect(2 + x, -7 + y, 3, 1);
g2d.fillRect(5 + x, -7 + y, 1, 1);
    }
}
