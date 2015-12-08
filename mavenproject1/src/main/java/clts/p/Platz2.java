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
public class Platz2 extends SuperP {

    public Platz2() {
        this(6);
    }

    public Platz2(int height) {
        super(height);
    }

    public Platz2(int height, int width) {
        super(height, width);
    }

    public Platz2(String height, String width) {
        super(height, width);
    }

    public Platz2(int height, ColorArray colorsToSwitch) {
        super(height, colorsToSwitch);
    }

    public Platz2(int height, int width, ColorArray colorsToSwitch) {
        super(height, width, colorsToSwitch);
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        return new obsolete.Spike(this.height, this.width, c);
    }

    public SuperC cloneC() {
        return new Platz2(height, width);
    }

    public void paintRight(int x, GraphicsMap g2d) {
        int len = width + 8;
        int start = -7;
        if (width > 0) {
            start--;
        }
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                g2d.setColor(COLORS.get(ImageUtilities.GREY));
            } else {
                g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            }


            if (i + 1 < height) {
                g2d.fillRect(start + x + rightXpos, i + rightYpos, len, 1);
            } else {
                g2d.fillRect(start + 1 + x + rightXpos, i + rightYpos, len - 2, 1);
            }
        }
    }

    public void paintLeft(int x, GraphicsMap g2d) {
        int len = width + 8;
        int start = 0;
        if (width > 0) {
            start--;
        }
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                g2d.setColor(COLORS.get(ImageUtilities.GREY));
            } else {
                g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            }


            if (i + 1 < height) {
                g2d.fillRect(start + x + leftXpos, i + leftYpos, len, 1);
            } else {
                g2d.fillRect(start + 1 + x + leftXpos, i + leftYpos, len - 2, 1);
            }
        }
    }
}
