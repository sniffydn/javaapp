/*
 * AnkleStrap1.java
 *
 * Created on March 6, 2007, 9:10 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.as;

import clts.SuperS;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class AS1 extends SuperS
{
    int location = 0;
    /** Creates a new instance of AnkleStrap0 */
    public AS1()
    {
        super();
        strap = true;
    }

    public AS1(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strap = true;
    }

    public AS1(int distanceFromTop)
    {
        super();
        location = distanceFromTop;
        strap = true;
    }

    public AS1(int distanceFromTop, ColorArray colorSwitch)
    {
        super(colorSwitch);
        location = distanceFromTop;
        strap = true;
    }

    public int getDistance()
    {
        return location;
    }

    public void setDistance(int location)
    {
        this.location = location;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (15 - location), 2, 1);
        g2d.fillRect((rightXpos - 1) + x, rightYpos - (15 - location), 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((rightXpos - 3) + x, rightYpos - (15 - location), 2, 1);

    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
                     g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((leftXpos) + x, leftYpos - (15 - location), 2, 1);
        g2d.fillRect((leftXpos + 4) + x, leftYpos - (15 - location), 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((leftXpos + 2) + x, leftYpos - (15 - location), 2, 1);
    }
}
