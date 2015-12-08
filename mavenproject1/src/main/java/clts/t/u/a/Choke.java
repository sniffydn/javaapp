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
public class Choke extends SuperC {
    private int direction = 0;
    private int layer = 1;

    public Choke() {
        super();
    }

    public void paintH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 38 + y, 1, 2);
        g2d.fillRect(105 + x, 39 + y, 1, 2);
        g2d.fillRect(106 + x, 39 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 1, 2);
        g2d.fillRect(107 + x, 40 + y, 1, 2);
        g2d.fillRect(108 + x, 40 + y, 1, 2);
        g2d.fillRect(109 + x, 40 + y, 1, 2);
        g2d.fillRect(110 + x, 40 + y, 1, 2);
    }

    public void paintBackH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 38 + y, 1, 2);
        g2d.fillRect(110 + x, 39 + y, 1, 2);
        g2d.fillRect(109 + x, 39 + y, 1, 2);
        g2d.fillRect(104 + x, 39 + y, 1, 2);
        g2d.fillRect(108 + x, 40 + y, 1, 2);
        g2d.fillRect(107 + x, 40 + y, 1, 2);
        g2d.fillRect(106 + x, 40 + y, 1, 2);
        g2d.fillRect(105 + x, 40 + y, 1, 2);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (direction == 1) {
            paintH(x, 0, g2d);
        } else {
            paintBackH(x, 0, g2d);
        }
    }

    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm, int eye) {
        direction = iDirection;
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
}
