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
public class S8 extends SuperS
{
    int location = 0;
    /** Creates a new instance of Shoes1 */
    public S8()
    {
        super();
        strapAllowed = false;
        drs = true;
        nurse = true;
        police = true;
    }

    public S8(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        drs = true;
        nurse = true;
        police = true;
    }

    public S8(int distanceFromTop)
    {
        super();
        strapAllowed = false;
        location = distanceFromTop;
        drs = true;
        nurse = true;
        police = true;
    }

    public S8(int distanceFromTop, ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        location = distanceFromTop;
        drs = true;
        nurse = true;
        police = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos - 2) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos - 5) + x, tempYpos, 4, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 12, 1, 11);
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 5, 1, 4);
        g2d.fillRect((tempXpos - 6) + x, tempYpos - 8, 1, 7);
        g2d.fillRect((tempXpos - 1) + x, tempYpos - 2, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos - 5) + x, tempYpos - 10, 1, 9);
        g2d.fillRect((tempXpos - 1) + x, tempYpos - 11, 1, 9);
        g2d.fillRect((tempXpos - 4) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos - 2) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos - 3) + x, tempYpos - 2, 1, 1);
        g2d.fillRect((tempXpos - 4) + x, tempYpos - 1, 2, 1);

    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((tempXpos + 5) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos + 2) + x, tempYpos, 4, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 12, 1, 11);
        g2d.fillRect((tempXpos + 7) + x, tempYpos - 5, 1, 4);
        g2d.fillRect((tempXpos + 6) + x, tempYpos - 8, 1, 7);
        g2d.fillRect((tempXpos + 1) + x, tempYpos - 2, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos + 5) + x, tempYpos - 10, 1, 9);
        g2d.fillRect((tempXpos + 1) + x, tempYpos - 11, 1, 9);
        g2d.fillRect((tempXpos + 4) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos + 2) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos + 3) + x, tempYpos - 2, 1, 1);
        g2d.fillRect((tempXpos + 3) + x, tempYpos - 1, 2, 1);
    }
}
