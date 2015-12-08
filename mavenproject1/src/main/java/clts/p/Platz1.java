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
public class Platz1 extends SuperP {

    public Platz1() {
        this(6);
    }

    public Platz1(int height) {
        super(height);
    }

    public Platz1(int height, int width) {
        super(height, width);
    }

    public Platz1(String height, String width) {
        super(height, width);
    }

    public Platz1(int height, ColorArray colorsToSwitch) {
        super(height, colorsToSwitch);
    }

    public Platz1(int height, int width, ColorArray colorsToSwitch) {
        super(height, width, colorsToSwitch);
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        return new obsolete.Spike(this.height, this.width, c);
    }

    public SuperC cloneC() {
        return new Platz1(height, width);
    }

    public void paintRight(int x, GraphicsMap g2d) {

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((rightXpos - 7) + x, rightYpos, 1, height);
        g2d.fillRect((rightXpos - 5) + x, 1 + rightYpos, 1, height);
        g2d.fillRect((rightXpos - 3) + x, 1 + rightYpos, 1, height);
        g2d.fillRect((rightXpos - 1) + x, rightYpos, 1, height + 1);

        if (width >= 2) {
            g2d.fillRect((rightXpos + 1) + x, rightYpos - 12, 1, height + 11);
        }

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((rightXpos - 6) + x, rightYpos, 1, height + 1);
        g2d.fillRect((rightXpos - 4) + x, 1 + rightYpos, 1, height);
        g2d.fillRect((rightXpos - 2) + x, 1 + rightYpos, 1, height);
        g2d.fillRect((rightXpos) + x, rightYpos, 1, height);

        if (width >= 1) {
            g2d.fillRect((rightXpos - 8) + x, rightYpos - 3, 1, height + 2);
        }



    }

    public void paintLeft(int x, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect((leftXpos + 7) + x, leftYpos, 1, height);
        g2d.fillRect((leftXpos + 5) + x, 1 + leftYpos, 1, height);
        g2d.fillRect((leftXpos + 3) + x, 1 + leftYpos, 1, height);
        g2d.fillRect((leftXpos + 1) + x, leftYpos, 1, height + 1);

        if (width >= 2) {
            g2d.fillRect((leftXpos - 1) + x, leftYpos - 12, 1, height + 11);
        }

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect((leftXpos + 6) + x, leftYpos, 1, height + 1);
        g2d.fillRect((leftXpos + 4) + x, 1 + leftYpos, 1, height);
        g2d.fillRect((leftXpos + 2) + x, 1 + leftYpos, 1, height);
        g2d.fillRect((leftXpos) + x, leftYpos, 1, height);


        if (width >= 1) {
            g2d.fillRect((leftXpos + 8) + x, leftYpos - 3, 1, height + 2);
        }

    }
}
