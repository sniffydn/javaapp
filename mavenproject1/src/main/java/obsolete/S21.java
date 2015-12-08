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
        x = rightXpos + x;
        int y = rightYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-6 + x, -7 + y, 1, 5);
        g2d.fillRect(-5 + x, -5 + y, 1, 2);
        g2d.fillRect(-2 + x, -5 + y, 1, 2);
        g2d.fillRect(-1 + x, -7 + y, 1, 5);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-7 + x, -5 + y, 1, 5);
        g2d.fillRect(-6 + x, -1 + y, 1, 2);
        g2d.fillRect(-5 + x, -1 + y, 1, 2);
        g2d.fillRect(-4 + x, 0 + y, 4, 1);
        g2d.fillRect(-2 + x, -1 + y, 3, 1);
        g2d.fillRect(0 + x, -8 + y, 1, 7);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-4 + x, -4 + y, 1, 1);
        g2d.fillRect(-2 + x, -4 + y, 1, 1);
        g2d.fillRect(-4 + x, -5 + y, 3, 1);
        g2d.fillRect(-5 + x, -6 + y, 5, 1);
        g2d.fillRect(-3 + x, -7 + y, 1, 1);


    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        x = leftXpos + x;
        int y = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(6 + x, -7 + y, 1, 5);
        g2d.fillRect(5 + x, -5 + y, 1, 2);
        g2d.fillRect(2 + x, -5 + y, 1, 2);
        g2d.fillRect(1 + x, -7 + y, 1, 5);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(7 + x, -5 + y, 1, 5);
        g2d.fillRect(6 + x, -1 + y, 1, 2);
        g2d.fillRect(5 + x, -1 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 4, 1);
        g2d.fillRect(0 + x, -1 + y, 3, 1);
        g2d.fillRect(0 + x, -8 + y, 1, 7);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(4 + x, -4 + y, 1, 1);
        g2d.fillRect(2 + x, -4 + y, 1, 1);
        g2d.fillRect(2 + x, -5 + y, 3, 1);
        g2d.fillRect(1 + x, -6 + y, 5, 1);
        g2d.fillRect(3 + x, -7 + y, 1, 1);

    }
}
