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
public class S18 extends S17
{
    /** Creates a new instance of Shoes1 */
    public S18()
    {
        super();
        strapAllowed = false;
    }

    public S18(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-7 + x + tempXpos, -1 + tempYpos, 8, 1);
        g2d.fillRect(-5 + x + tempXpos, 0 + tempYpos, 4, 1);

        super.paintRight(x, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(0 + x + tempXpos, -1 + tempYpos, 8, 1);
        g2d.fillRect(2 + x + tempXpos, 0 + tempYpos, 4, 1);

        super.paintLeft(x, g2d);
    }
}
