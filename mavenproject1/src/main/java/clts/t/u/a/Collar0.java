/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.a;

import clts.SuperC;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Collar0 extends SuperC {

    private int layer = 1;

    /** Creates a new instance of GenericClothes */
    public Collar0() {
        super();
    }

    public void paintH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 39 + y, 1, 3);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(111 + x, 39 + y, 3, 1);
        g2d.fillRect(106 + x, 40 + y, 4, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 2);
        g2d.fillRect(105 + x, 43 + y, 2, 1);
        g2d.fillRect(109 + x, 43 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(105 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 41 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 41 + y, 1, 2);
        g2d.fillRect(110 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 39 + y, 2, 1);
        g2d.fillRect(114 + x, 39 + y, 2, 1);
        g2d.fillRect(98 + x, 40 + y, 2, 1);
        g2d.fillRect(104 + x, 40 + y, 2, 1);
        g2d.fillRect(110 + x, 40 + y, 1, 2);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 2, 1);
        g2d.fillRect(100 + x, 41 + y, 2, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 2);
        g2d.fillRect(105 + x, 41 + y, 1, 1);
        g2d.fillRect(107 + x, 41 + y, 1, 4);
        g2d.fillRect(108 + x, 41 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 2);
        g2d.fillRect(114 + x, 41 + y, 2, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(108 + x, 43 + y, 1, 1);
        g2d.fillRect(113 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 40 + y, 2, 1);
        g2d.fillRect(114 + x, 40 + y, 2, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(111 + x, 41 + y, 1, 1);
        g2d.fillRect(108 + x, 42 + y, 1, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        paintH(x, y, g2d);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        draw(offsetX, offsetY, g2d);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 1) {
            draw(offsetX, offsetY, g2d);
        }
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 2) {
            draw(offsetX, offsetY, g2d);
        }
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 3) {
            draw(offsetX, offsetY, g2d);
        }

    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 4) {
            draw(offsetX, offsetY, g2d);
        }

    }

    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm, int eye) {
    }
}
