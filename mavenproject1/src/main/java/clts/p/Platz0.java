/*
 * Platforms.java
 *
 * Created on March 1, 2007, 12:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.p;

import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author 6uest
 */
public class Platz0 extends SuperP {

    public Platz0() {
        this(6);
    }

    public Platz0(int height) {
        super(height);
    }

    public Platz0(int height, int width) {
        super(height, width);
    }

    public Platz0(String height, String width) {
        super(height, width);
    }

    public Platz0(int height, ColorArray colorsToSwitch) {
        super(height, colorsToSwitch);
    }

    public Platz0(int height, int width, ColorArray colorsToSwitch) {
        super(height, width, colorsToSwitch);
    }

    public SuperC cloneC() {
        return new Platz0(height, width);
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        return new obsolete.Spike(this.height, this.width, c);
    }

    public void paintRight(int x, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        //topline
        g2d.fillRect(rightXpos + x, rightYpos, 1, height);
        g2d.fillRect((rightXpos - 1) + x, rightYpos, 1, 1);
        g2d.fillRect((rightXpos - 6) + x, rightYpos, 1, 1);
        g2d.fillRect((rightXpos - 7) + x, rightYpos, 1, height);
        //rest
        g2d.fillRect((rightXpos - 6) + x, rightYpos + 1, 6, height);

        if (width >= 1) {
            g2d.fillRect((rightXpos - 8) + x, rightYpos - 3, 1, height + 2);
        }

        if (width >= 2) {
            g2d.fillRect((rightXpos + 1) + x, rightYpos - 12, 1, height + 11);
        }
        //highlight
        if (height > 1) {
            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect((rightXpos - 5) + x, rightYpos + 1, 1, height - 1);
            if (height > 3) {
                g2d.fillRect((rightXpos - 4) + x, rightYpos + 3, 1, height - 3);
            }
        }
    }

    public void paintLeft(int x, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(leftXpos + x, leftYpos, 1, height);
        g2d.fillRect((leftXpos + 1) + x, leftYpos, 1, 1);
        g2d.fillRect((leftXpos + 6) + x, leftYpos, 1, 1);
        g2d.fillRect((leftXpos + 7) + x, leftYpos, 1, height);
        //rest
        g2d.fillRect((leftXpos + 1) + x, leftYpos + 1, 6, height);

        if (width >= 1) {
            g2d.fillRect((leftXpos + 8) + x, leftYpos - 3, 1, height + 2);
        }

        if (width >= 2) {
            g2d.fillRect((leftXpos - 1) + x, leftYpos - 12, 1, height + 11);
        }
        //highlight
        if (height > 1) {
            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect((leftXpos + 3) + x, leftYpos + 1, 1, height - 1);
            if (height > 3) {
                g2d.fillRect((leftXpos + 4) + x, leftYpos + 3, 1, height - 3);
            }
        }
    }
}
