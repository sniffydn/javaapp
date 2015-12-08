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
public class AS0 extends SuperS {

    int location = 0;

    /** Creates a new instance of AnkleStrap0 */
    public AS0() {
        super();
    }

    public AS0(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public AS0(int distanceFromTop) {
        super();
        location = distanceFromTop;
    }

    public AS0(int distanceFromTop, ColorArray colorSwitch) {
        super(colorSwitch);
        location = distanceFromTop;
    }

    public void paintRight(int x, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (13 - location), 6, 1);
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (15 - location), 6, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((rightXpos - 5) + x, rightYpos - (14 - location), 6, 1);
    }

    public void paintLeft(int x, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((leftXpos) + x, leftYpos - (13 - location), 6, 1);
        g2d.fillRect((leftXpos) + x, leftYpos - (15 - location), 6, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((leftXpos) + x, leftYpos - (14 - location), 6, 1);
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
