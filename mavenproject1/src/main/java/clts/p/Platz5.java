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
public class Platz5 extends SuperP {

    public Platz5() {
        this(6);
    }

    public Platz5(int height) {
        super(height);
        this.height = 8;
        includeInAutoPick = false;
    }

    public Platz5(int height, int width) {
        super(height, width);
        this.height = 8;
        includeInAutoPick = false;
    }

    public Platz5(String height, String width) {
        super(height, width);
        this.height = 8;
        includeInAutoPick = false;
    }

    public Platz5(int height, ColorArray colorsToSwitch) {
        super(height, colorsToSwitch);
        this.height = 8;
        includeInAutoPick = false;
    }

    public Platz5(int height, int width, ColorArray colorsToSwitch) {
        super(height, width, colorsToSwitch);
        this.height = 8;
        includeInAutoPick = false;
    }

    public SuperC cloneC() {
        return new Platz5(height, width);
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        return new obsolete.Spike(this.height, this.width, c);
    }

    public void paintRight(int x, GraphicsMap g2d) {
        paintR(x + rightXpos, rightYpos, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d) {
        paintL(x + leftXpos, leftYpos, g2d);
    }

    private void paintR(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-5 + x, 1 + y, 1, 3);
        g2d.fillRect(-5 + x, 6 + y, 1, 3);
        g2d.fillRect(-4 + x, 8 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);

        g2d.fillRect(-7 + x, 0 + y, 1, 9);
        g2d.fillRect(-6 + x, 1 + y, 1, 3);
        g2d.fillRect(-6 + x, 6 + y, 1, 4);
        g2d.fillRect(-4 + x, 1 + y, 5, 1);
        g2d.fillRect(0 + x, 0 + y, 1, 1);
        g2d.fillRect(-2 + x, 2 + y, 1, 2);
        g2d.fillRect(-1 + x, 2 + y, 1, 2);
        g2d.fillRect(0 + x, 2 + y, 1, 7);
        g2d.fillRect(-3 + x, 8 + y, 1, 2);
        g2d.fillRect(-2 + x, 8 + y, 1, 2);
        g2d.fillRect(-1 + x, 8 + y, 1, 2);
        g2d.fillRect(-2 + x, 6 + y, 1, 2);
        g2d.fillRect(-1 + x, 6 + y, 1, 2);
        g2d.fillRect(-5 + x, 9 + y, 2, 1);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(-3 + x, 2 + y, 1, 6);
        g2d.fillRect(-6 + x, 4 + y, 1, 2);
        g2d.fillRect(-2 + x, 4 + y, 1, 2);
        g2d.fillRect(-1 + x, 4 + y, 1, 2);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(-4 + x, 2 + y, 1, 6);
        g2d.fillRect(-5 + x, 4 + y, 1, 2);
    }

    private void paintL(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(5 + x, 1 + y, 1, 3);
        g2d.fillRect(5 + x, 6 + y, 1, 3);
        g2d.fillRect(4 + x, 8 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(3 + x, 2 + y, 1, 6);
        g2d.fillRect(6 + x, 4 + y, 1, 2);
        g2d.fillRect(2 + x, 4 + y, 1, 2);
        g2d.fillRect(1 + x, 4 + y, 1, 2);
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(6 + x, 0 + y, 1, 1);
        g2d.fillRect(1 + x, 0 + y, 1, 1);

        g2d.fillRect(7 + x, 0 + y, 1, 9);
        g2d.fillRect(6 + x, 1 + y, 1, 3);
        g2d.fillRect(6 + x, 6 + y, 1, 4);
        g2d.fillRect(0 + x, 1 + y, 5, 1);
        g2d.fillRect(0 + x, 0 + y, 1, 1);
        g2d.fillRect(2 + x, 2 + y, 1, 2);
        g2d.fillRect(1 + x, 2 + y, 1, 2);
        g2d.fillRect(0 + x, 2 + y, 1, 7);
        g2d.fillRect(3 + x, 8 + y, 1, 2);
        g2d.fillRect(2 + x, 8 + y, 1, 2);
        g2d.fillRect(1 + x, 8 + y, 1, 2);
        g2d.fillRect(2 + x, 6 + y, 1, 2);
        g2d.fillRect(1 + x, 6 + y, 1, 2);
        g2d.fillRect(4 + x, 9 + y, 2, 1);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(4 + x, 2 + y, 1, 6);
        g2d.fillRect(5 + x, 4 + y, 1, 2);
    }
}
