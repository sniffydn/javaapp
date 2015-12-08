/*
 * AnkleStrap0.java
 *
 * Created on March 6, 2007, 8:20 AM
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
public class AS3 extends SuperS
{
    /** Creates a new instance of AnkleStrap0 */
    public AS3()
    {
        super();
    }

    public AS3(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (14), 6, 1);
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (16), 7, 1);
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (15), 6, 1);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((leftXpos) + x, leftYpos - (14), 6, 1);
        g2d.fillRect((leftXpos - 1) + x, leftYpos - (16), 7, 1);
        g2d.fillRect((leftXpos) + x, leftYpos - (15), 6, 1);
    }
}
