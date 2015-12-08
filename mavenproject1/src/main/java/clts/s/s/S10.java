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
public class S10 extends SuperS
{
    /** Creates a new instance of Shoes1 */
    public S10()
    {
        super();
        drs = true;
        sch = true;
        nurse = true;
    }

    public S10(ColorArray colorSwitch)
    {
        super(colorSwitch);
        drs = true;
        sch = true;
        nurse = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos - 2) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos - 6) + x, tempYpos, 6, 1);
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 4, 3, 1);
        g2d.fillRect((tempXpos - 7) + x, tempYpos - 5, 4, 1);
        g2d.fillRect((tempXpos - 6) + x, tempYpos - 6, 1, 1);
        g2d.fillRect((tempXpos - 6) + x, tempYpos - 7, 3, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos - 1) + x, tempYpos - 5, 2, 2);
        g2d.fillRect((tempXpos) + x, tempYpos - 6, 1, 1);
        g2d.fillRect((tempXpos - 1) + x, tempYpos - 7, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos - 4) + x, tempYpos - 4, 3, 1);
        g2d.fillRect((tempXpos - 3) + x, tempYpos - 5, 2, 1);
        g2d.fillRect((tempXpos - 3) + x, tempYpos - 7, 2, 1);

    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((tempXpos + 5) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 1, 3, 1);
        g2d.fillRect((tempXpos + 1) + x, tempYpos, 6, 1);
        g2d.fillRect((tempXpos + 7) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos + 5) + x, tempYpos - 4, 3, 1);
        g2d.fillRect((tempXpos + 4) + x, tempYpos - 5, 4, 1);
        g2d.fillRect((tempXpos + 6) + x, tempYpos - 6, 1, 1);
        g2d.fillRect((tempXpos + 4) + x, tempYpos - 7, 3, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 3, 1, 2);
        g2d.fillRect((tempXpos) + x, tempYpos - 5, 2, 2);
        g2d.fillRect((tempXpos) + x, tempYpos - 6, 1, 1);
        g2d.fillRect((tempXpos) + x, tempYpos - 7, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((tempXpos + 2) + x, tempYpos - 4, 3, 1);
        g2d.fillRect((tempXpos + 2) + x, tempYpos - 5, 2, 1);
        g2d.fillRect((tempXpos + 2) + x, tempYpos - 7, 2, 1);
    }
}
