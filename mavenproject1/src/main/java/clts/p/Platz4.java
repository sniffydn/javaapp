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
public class Platz4 extends SuperP {

    public Platz4() {
        this(5);
    }

    public Platz4(int height) {
        super(height);
        this.height = 5;
    }

    public Platz4(int height, int width) {
        super(height, width);
        this.height = 5;
    }

    public Platz4(String height, String width) {
        super(height, width);
        this.height = 5;
    }

    public Platz4(int height, ColorArray colorsToSwitch) {
        super(height, colorsToSwitch);
        this.height = 5;
    }

    public Platz4(int height, int width, ColorArray colorsToSwitch) {
        super(height, width, colorsToSwitch);
        this.height = 5;
    }

    public SuperC cloneC() {
        return new Platz4(height, width);
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
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-7 + x, 0 + y, 1, 1);
        g2d.fillRect(0 + x, 0 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-7 + x, 1 + y, 1, 1);
        g2d.fillRect(-6 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);
        g2d.fillRect(0 + x, 1 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-7 + x, 2 + y, 1, 1);
        g2d.fillRect(-6 + x, 1 + y, 2, 1);
        g2d.fillRect(-1 + x, 1 + y, 1, 1);
        g2d.fillRect(0 + x, 2 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-7 + x, 3 + y, 1, 1);
        g2d.fillRect(-6 + x, 2 + y, 2, 1);
        g2d.fillRect(-2 + x, 1 + y, 1, 1);
        g2d.fillRect(-1 + x, 2 + y, 1, 1);
        g2d.fillRect(0 + x, 3 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(-7 + x, 4 + y, 1, 1);
        g2d.fillRect(-6 + x, 3 + y, 2, 1);
        g2d.fillRect(-4 + x, 1 + y, 2, 1);
        g2d.fillRect(-2 + x, 2 + y, 1, 1);
        g2d.fillRect(-1 + x, 3 + y, 1, 1);
        g2d.fillRect(0 + x, 4 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(-6 + x, 4 + y, 3, 1);
        g2d.fillRect(-4 + x, 2 + y, 1, 2);
        g2d.fillRect(-3 + x, 2 + y, 1, 1);
        g2d.fillRect(-2 + x, 3 + y, 1, 1);
        g2d.fillRect(-1 + x, 4 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(-6 + x, 5 + y, 6, 1);
        g2d.fillRect(-3 + x, 3 + y, 1, 2);
        g2d.fillRect(-2 + x, 4 + y, 1, 1);
    }

    private void paintL(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(7 + x, 0 + y, 1, 1);
        g2d.fillRect(0 + x, 0 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(7 + x, 1 + y, 1, 1);
        g2d.fillRect(6 + x, 0 + y, 1, 1);
        g2d.fillRect(1 + x, 0 + y, 1, 1);
        g2d.fillRect(0 + x, 1 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(7 + x, 2 + y, 1, 1);
        g2d.fillRect(5 + x, 1 + y, 2, 1);
        g2d.fillRect(1 + x, 1 + y, 1, 1);
        g2d.fillRect(0 + x, 2 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(7 + x, 3 + y, 1, 1);
        g2d.fillRect(5 + x, 2 + y, 2, 1);
        g2d.fillRect(2 + x, 1 + y, 1, 1);
        g2d.fillRect(1 + x, 2 + y, 1, 1);
        g2d.fillRect(0 + x, 3 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(7 + x, 4 + y, 1, 1);
        g2d.fillRect(5 + x, 3 + y, 2, 1);
        g2d.fillRect(3 + x, 1 + y, 2, 1);
        g2d.fillRect(2 + x, 2 + y, 1, 1);
        g2d.fillRect(1 + x, 3 + y, 1, 1);
        g2d.fillRect(0 + x, 4 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(4 + x, 4 + y, 3, 1);
        g2d.fillRect(4 + x, 2 + y, 1, 2);
        g2d.fillRect(3 + x, 2 + y, 1, 1);
        g2d.fillRect(2 + x, 3 + y, 1, 1);
        g2d.fillRect(1 + x, 4 + y, 1, 1);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(1 + x, 5 + y, 6, 1);
        g2d.fillRect(3 + x, 3 + y, 1, 2);
        g2d.fillRect(2 + x, 4 + y, 1, 1);
    }
}
