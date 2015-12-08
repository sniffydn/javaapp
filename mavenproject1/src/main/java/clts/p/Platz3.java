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
public class Platz3 extends SuperP {

    public Platz3() {
        this(6);
    }

    public Platz3(int height) {
        super(height);
    }

    public Platz3(int height, int width) {
        super(height, width);
    }

    public Platz3(String height, String width) {
        super(height, width);
    }

    public Platz3(int height, ColorArray colorsToSwitch) {
        super(height, colorsToSwitch);
    }

    public Platz3(int height, int width, ColorArray colorsToSwitch) {
        super(height, width, colorsToSwitch);
    }

    public SuperC cloneC() {
        return new Platz0(height, width);
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
        if (height < 1) {
            return;
        }
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-4 + x, 1 + y, 1, height - 1);
        g2d.fillRect(-5 + x, (height / 2) + y, 1, height / 2);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-7 + x, 0 + y, 2, height);
        g2d.fillRect(-5 + x, 1 + y, 4, height - 1);
        g2d.fillRect(-1 + x, 0 + y, 2, height);


        g2d.fillRect(-6 + x, height + y, 6, 1);
    }

    private void paintL(int x, int y, GraphicsMap g2d) {
        if (height < 1) {
            return;
        }
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(3 + x, 1 + y, 1, height - 1);
        g2d.fillRect(2 + x, (height / 2) + y, 1, height / 2);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(0 + x, 0 + y, 2, height);
        g2d.fillRect(2 + x, 1 + y, 4, height - 1);
        g2d.fillRect(6 + x, 0 + y, 2, height);


        g2d.fillRect(1 + x, height + y, 6, 1);
    }
}
