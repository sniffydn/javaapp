/*
 * Hair.java
 */
package clts;

import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author 6uest
 */
public class SuperHLong extends SuperH {

    public SuperHLong() {
        super();
    }

    /** Creates a new instance of Hair */
    public SuperHLong(int step, int dir) {
        super(step, dir);
    }

    public SuperHLong(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (direction.equalsIgnoreCase("left")) {
            paintBackF(x, y, g2d);
        } else {
            paintF(x, y, g2d);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (direction.equalsIgnoreCase("left")) {
            paintBackM(x, y, g2d);
        } else {
            paintM(x, y, g2d);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (direction.equalsIgnoreCase("left")) {
            paintBackB(x, prevY, g2d);
        } else {
            paintB(x, prevY, g2d);
        }

        prevY = y;
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 36, 1, 4);
        g2d.fillRect(111 + x, 34, 1, 6);
        g2d.fillRect(112 + x, 28, 1, 12);
        g2d.fillRect(102 + x, 37, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 23, 1, 4);
        g2d.fillRect(105 + x, 23, 1, 4);
    }

    public void paintB(int x, int prevY, GraphicsMap g2d) {
    }

    public void paintBackB(int x, int prevY, GraphicsMap g2d) {
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {
    }

    public void paintF(int x, int y, GraphicsMap g2d) {
    }

    public void paintM(int x, int y, GraphicsMap g2d) {
    }
}
