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
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class S31 extends SuperS {

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = false;

    public S31() {
        super();
        drs = true;
    }

    public S31(ColorArray colorSwitch) {
        super(colorSwitch);
        drs = true;
    }

    public void paintRight(int x, GraphicsMap g2d) {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        paintForwards(x + tempXpos, tempYpos, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d) {

        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        paintBackwards(x + tempXpos, tempYpos, g2d);
    }

    public void paintForwards(int x, int y, GraphicsMap g2d) {
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 0, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-6 + x, -6 + y, 1, 1);
        g2d.fillRect(0 + x, -7 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 100, 120, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-6 + x, -7 + y, 1, 1);
        g2d.fillRect(0 + x, -8 + y, 1, 1);
        g2d.fillRect(-5 + x, -3 + y, 1, 2);
        g2d.fillRect(-4 + x, -2 + y, 1, 2);
        g2d.fillRect(-3 + x, -2 + y, 1, 2);
        g2d.fillRect(-2 + x, -2 + y, 1, 1);
        g2d.fillRect(-1 + x, -4 + y, 1, 2);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 150, 150, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-6 + x, -8 + y, 1, 1);
        g2d.fillRect(0 + x, -9 + y, 1, 1);
        g2d.fillRect(-4 + x, -3 + y, 1, 1);
        g2d.fillRect(-2 + x, -3 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 0, 77, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-6 + x, -5 + y, 1, 1);
        g2d.fillRect(0 + x, -6 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205, 0, 52, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-7 + x, -5 + y, 1, 1);
        g2d.fillRect(-6 + x, -4 + y, 1, 1);
        g2d.fillRect(0 + x, -5 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 0, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-7 + x, -4 + y, 1, 1);
        g2d.fillRect(-6 + x, -3 + y, 1, 1);
        g2d.fillRect(0 + x, -4 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(155, 0, 2, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-7 + x, -3 + y, 1, 1);
        g2d.fillRect(-6 + x, -2 + y, 1, 1);
        g2d.fillRect(-1 + x, -2 + y, 1, 1);
        g2d.fillRect(0 + x, -3 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-7 + x, -2 + y, 1, 1);
        g2d.fillRect(-5 + x, -1 + y, 1, 1);
        g2d.fillRect(-2 + x, -1 + y, 1, 1);
        g2d.fillRect(0 + x, -2 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-5 + x, 0 + y, 4, 1);
        g2d.fillRect(-7 + x, -1 + y, 2, 1);
        g2d.fillRect(-1 + x, -1 + y, 2, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 170, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, -10 + y, 1, 1);
        g2d.fillRect(-5 + x, -5 + y, 1, 2);
        g2d.fillRect(-1 + x, -6 + y, 1, 2);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 200, 200, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, -11 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 227, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, -12 + y, 1, 1);
        g2d.fillRect(-5 + x, -8 + y, 1, 3);
        g2d.fillRect(-1 + x, -9 + y, 1, 3);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(-5 + x, -10 + y, 1, 2);
        g2d.fillRect(-1 + x, -11 + y, 1, 2);
    }

    public void paintBackwards(int x, int y, GraphicsMap g2d) {
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 0, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, -6 + y, 1, 1);
        g2d.fillRect(0 + x, -7 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 100, 120, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, -7 + y, 1, 1);
        g2d.fillRect(0 + x, -8 + y, 1, 1);
        g2d.fillRect(5 + x, -3 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);
        g2d.fillRect(3 + x, -2 + y, 1, 2);
        g2d.fillRect(2 + x, -2 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 150, 150, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, -8 + y, 1, 1);
        g2d.fillRect(0 + x, -9 + y, 1, 1);
        g2d.fillRect(4 + x, -3 + y, 1, 1);
        g2d.fillRect(2 + x, -3 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 0, 77, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, -5 + y, 1, 1);
        g2d.fillRect(0 + x, -6 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205, 0, 52, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, -5 + y, 1, 1);
        g2d.fillRect(6 + x, -4 + y, 1, 1);
        g2d.fillRect(0 + x, -5 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 0, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, -4 + y, 1, 1);
        g2d.fillRect(6 + x, -3 + y, 1, 1);
        g2d.fillRect(0 + x, -4 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(155, 0, 2, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, -3 + y, 1, 1);
        g2d.fillRect(6 + x, -2 + y, 1, 1);
        g2d.fillRect(1 + x, -2 + y, 1, 1);
        g2d.fillRect(0 + x, -3 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, -2 + y, 1, 1);
        g2d.fillRect(5 + x, -1 + y, 1, 1);
        g2d.fillRect(2 + x, -1 + y, 1, 1);
        g2d.fillRect(0 + x, -2 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(2 + x, 0 + y, 4, 1);
        g2d.fillRect(6 + x, -1 + y, 2, 1);
        g2d.fillRect(0 + x, -1 + y, 2, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 170, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, -10 + y, 1, 1);
        g2d.fillRect(5 + x, -5 + y, 1, 2);
        g2d.fillRect(1 + x, -6 + y, 1, 2);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 200, 200, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, -11 + y, 1, 1);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 227, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, -12 + y, 1, 1);
        g2d.fillRect(5 + x, -8 + y, 1, 3);
        g2d.fillRect(1 + x, -9 + y, 1, 3);
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(5 + x, -10 + y, 1, 2);
        g2d.fillRect(1 + x, -11 + y, 1, 2);
    }
}
