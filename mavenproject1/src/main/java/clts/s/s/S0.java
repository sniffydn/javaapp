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
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class S0 extends SuperS
{

    /** Creates a new instance of Shoes0 */
    public S0()
    {
        super();
        drs = true;
        sch = true;
        nurse = true;
    }

    public S0(ColorArray colorSwitch)
    {
        super(colorSwitch);
        drs = true;
        sch = true;
        nurse = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((rightXpos - 7) + x, rightYpos - 1, 3, 1);
        g2d.fillRect((rightXpos - 2) + x, rightYpos - 1, 3, 1);
        g2d.fillRect((rightXpos - 5) + x, rightYpos, 4, 1);
        g2d.fillRect((rightXpos - 7) + x, rightYpos - 2, 1, 1);
        g2d.fillRect((rightXpos) + x, rightYpos - 2, 1, 1);
        g2d.fillRect((rightXpos - 6) + x, rightYpos - 3, 1, 1);
        g2d.fillRect((rightXpos - 1) + x, rightYpos - 3, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((rightXpos - 7) + x, rightYpos - 4, 8, 1);
        g2d.fillRect((rightXpos - 7) + x, rightYpos - 5, 1, 3);
        g2d.fillRect((rightXpos) + x, rightYpos - 5, 1, 3);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((leftXpos + 5) + x, leftYpos - 1, 3, 1);
        g2d.fillRect((leftXpos) + x, leftYpos - 1, 3, 1);
        g2d.fillRect((leftXpos + 2) + x, leftYpos, 4, 1);
        g2d.fillRect((leftXpos + 7) + x, leftYpos - 2, 1, 1);
        g2d.fillRect((leftXpos) + x, leftYpos - 2, 1, 1);
        g2d.fillRect((leftXpos + 6) + x, leftYpos - 3, 1, 1);
        g2d.fillRect((leftXpos + 1) + x, leftYpos - 3, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((leftXpos) + x, leftYpos - 4, 8, 1);
        g2d.fillRect((leftXpos + 7) + x, leftYpos - 5, 1, 3);
        g2d.fillRect((leftXpos) + x, leftYpos - 5, 1, 3);
    }
}
