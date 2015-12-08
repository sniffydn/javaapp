/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clts;

import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author nyffeldd
 */
public abstract class SuperMU extends SuperC {

    protected int direction = 0;
    protected int eye = 0;
    protected int layer = 1;

    public SuperMU() {
        super();
    }

    public SuperMU(ColorArray colorSwitch) {
        super();
        COLORS = colorSwitch;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm, int eye) {
        step = s;
        this.direction = direction;
        this.eye = eye;
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        draw(offsetX, offsetY, g2d);
        drawMU(offsetX, 0, g2d);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 1) {
            draw(offsetX, offsetY, g2d);
            drawMU(offsetX, 0, g2d);
        }
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 2) {
            draw(offsetX, offsetY, g2d);
            drawMU(offsetX, 0, g2d);
        }
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 3) {
            draw(offsetX, offsetY, g2d);
            drawMU(offsetX, 0, g2d);
        }

    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 4) {
            draw(offsetX, offsetY, g2d);
            drawMU(offsetX, 0, g2d);
        }

    }

    public abstract void draw(int x, int y, GraphicsMap g2d);

    private void drawMU(int offsetX, int offsetY, GraphicsMap g2d) {
        offsetX = offsetX + 84;
        if (direction == 1) {
            if (eye == 0) {
                g2d.setColor(COLORS.get(ImageUtilities.GREY));
                g2d.fillRect(23 + offsetX, 25, 2, 1);
                g2d.fillRect(34 + offsetX, 25, 1, 1);
                g2d.fillRect(25 + offsetX, 26, 2, 1);
                g2d.fillRect(33 + offsetX, 26, 1, 1);
                g2d.fillRect(27 + offsetX, 27, 1, 1);
                g2d.fillRect(32 + offsetX, 27, 1, 1);
                g2d.fillRect(31 + offsetX, 28, 1, 1);
            } else if (eye == 1) {

                g2d.setColor(COLORS.get(ImageUtilities.GREY));
                g2d.fillRect(23 + offsetX, 25, 2, 1);
                g2d.fillRect(34 + offsetX, 25, 1, 1);
                g2d.fillRect(22 + offsetX, 26, 5, 1);
                g2d.fillRect(33 + offsetX, 26, 1, 1);
                g2d.fillRect(22 + offsetX, 27, 6, 1);
                g2d.fillRect(32 + offsetX, 27, 1, 1);
                g2d.fillRect(31 + offsetX, 28, 1, 1);
            } else if (eye == 2) {


                g2d.setColor(COLORS.get(ImageUtilities.GREY));
                g2d.fillRect(23 + offsetX, 25, 2, 1);
                g2d.fillRect(34 + offsetX, 25, 1, 1);
                g2d.fillRect(22 + offsetX, 26, 5, 1);
                g2d.fillRect(33 + offsetX, 26, 2, 1);
                g2d.fillRect(22 + offsetX, 27, 6, 1);
                g2d.fillRect(32 + offsetX, 27, 3, 1);
                g2d.fillRect(31 + offsetX, 28, 4, 1);
            }
        } else {
            if (eye == 0) {

                g2d.setColor(COLORS.get(ImageUtilities.GREY));
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 23, offsetX, 25, offsetY, 2, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 34, offsetX, 25, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 25, offsetX, 26, offsetY, 2, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 33, offsetX, 26, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 27, offsetX, 27, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 32, offsetX, 27, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 31, offsetX, 28, offsetY, 1, 1);
            } else if (eye == 1) {

                g2d.setColor(COLORS.get(ImageUtilities.GREY));
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 23, offsetX, 25, offsetY, 2, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 34, offsetX, 25, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 22, offsetX, 26, offsetY, 5, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 33, offsetX, 26, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 22, offsetX, 27, offsetY, 6, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 32, offsetX, 27, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 31, offsetX, 28, offsetY, 1, 1);
            } else if (eye == 2) {


                g2d.setColor(COLORS.get(ImageUtilities.GREY));
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 23, offsetX, 25, offsetY, 2, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 34, offsetX, 25, offsetY, 1, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 22, offsetX, 26, offsetY, 5, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 33, offsetX, 26, offsetY, 2, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 22, offsetX, 27, offsetY, 6, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 32, offsetX, 27, offsetY, 3, 1);
                ImageUtilities.fillRect(g2d, b.Hd.flipOverX, 31, offsetX, 28, offsetY, 4, 1);
            }
        }
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }
}
