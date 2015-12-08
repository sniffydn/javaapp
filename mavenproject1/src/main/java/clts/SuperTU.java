/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts;

import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class SuperTU extends SuperC {

    public int layer = 3;
    public String middle = "b";

    public SuperTU() {
        
    }

    /** Creates a new instance of GenericClothes */
    public SuperTU(String middle) {
        this.middle = middle;
    }

    public SuperTU(String middle, int layer) {
        this.middle = middle;
        this.layer = layer;
    }

    public SuperTU(String middle, ColorArray colorSwitch) {
        this.middle = middle;
        COLORS = colorSwitch;
    }

    public SuperTU(String middle, int layer, ColorArray colorSwitch) {
        this.middle = middle;
        this.layer = layer;
        COLORS = colorSwitch;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm, int eye) {
        step = s;
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 0) {
            draw(offsetX, offsetY, g2d);
        }
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 1) {
            draw(offsetX, offsetY, g2d);
        }
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

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 4) {
            draw(offsetX, 0, g2d);
        }
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (layer == 5) {
            draw(offsetX, offsetY, g2d);
        }
    }

    public void draw(int x, int y, GraphicsMap g2d) {
    }

    public SuperC cloneC() {
        Class[] classParm = {String.class};
        Object[] objectParm = {this.middle};
        Class c = this.getClass();
        try {
            java.lang.reflect.Constructor co = c.getConstructor(classParm);
            return (SuperC) co.newInstance(objectParm);
        } catch (Exception e) {
            return null;
        }
    }
}
