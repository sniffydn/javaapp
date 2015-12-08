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
public class S21 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public S21()
    {
        super();
    }

    public S21(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-7 + x + tempXpos, -3 + tempYpos, 1, 1);
        g2d.fillRect(-6 + x + tempXpos, -4 + tempYpos, 1, 1);
        g2d.fillRect(-5 + x + tempXpos, -5 + tempYpos, 3, 1);
        g2d.fillRect(-2 + x + tempXpos, -4 + tempYpos, 2, 1);
        g2d.fillRect(0 + x + tempXpos, -3 + tempYpos, 1, 1);
        g2d.fillRect(-6 + x + tempXpos, -6 + tempYpos, 1, 1);
        g2d.fillRect(-5 + x + tempXpos, -7 + tempYpos, 3, 1);
        g2d.fillRect(-2 + x + tempXpos, -6 + tempYpos, 2, 1);
        g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.fillRect(-7 + x + tempXpos, -1 + tempYpos, 3, 1);
        g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 4, 1);
        g2d.fillRect(-2 + x + tempXpos, -1 + tempYpos, 3, 1);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(7 + x + tempXpos, -3 + tempYpos, 1, 1);
        g2d.fillRect(6 + x + tempXpos, -4 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -5 + tempYpos, 3, 1);
        g2d.fillRect(1 + x + tempXpos, -4 + tempYpos, 2, 1);
        g2d.fillRect(0 + x + tempXpos, -3 + tempYpos, 1, 1);
        g2d.fillRect(6 + x + tempXpos, -6 + tempYpos, 1, 1);
        g2d.fillRect(3 + x + tempXpos, -7 + tempYpos, 3, 1);
        g2d.fillRect(1 + x + tempXpos, -6 + tempYpos, 2, 1);
        g2d.fillRect(0 + x + tempXpos, -5 + tempYpos, 1, 1);
        g2d.fillRect(5 + x + tempXpos, -1 + tempYpos, 3, 1);
        g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 4, 1);
        g2d.fillRect(0 + x + tempXpos, -1 + tempYpos, 3, 1);
    }
}
