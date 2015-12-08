/*
 * clothes.java
 */
package clts;

import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public abstract class SuperC implements java.io.Serializable, Paintable {

    public boolean slenderS = false;
    public boolean drs = false;
    public boolean pant = false;
    public boolean under = false;
    public boolean jean = false;
    public boolean skt = false;
    public boolean shrt = false;
    public boolean sch = false;
    public boolean ling = false;
    public boolean containsTL = false;
    public boolean containsB = false;
    public boolean slenderB = false;
    public boolean shuni = false;
    public boolean prep = false;
    public boolean swim = false;
    public boolean includeInAutoPick = true;
    public boolean noWalk = false;
    public int legLength = -1;
    public int legPos = -1;
    public int platzHeight = -1;
    protected int colorSprayType = 0;
    protected int colorSprayHue = 0;
    protected int colorSpraySaturation = 0;
    protected int colorSprayBrightness = 0;
    protected int colorSprayFrequency = 0;
    public transient int step = 0;
    protected ColorArray COLORS = new ColorArray();
    protected int shiftX = 0;
    protected int shiftY = 0;


    public abstract void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d);

    public abstract void paintBack(int offsetX, int offsetY, GraphicsMap g2d);

    public abstract void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d);

    public abstract void paintFront(int offsetX, int offsetY, GraphicsMap g2d);

    public abstract void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d);

    public abstract void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm, int eye);

    public abstract void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d);

    public String toString() {
        String retVal = this.getClass() + "";
        retVal = retVal.substring(retVal.indexOf(" ")) + "();";
        return retVal;
    }

    public void setLayer(int layer) {
    }

    public void setMiddle(String middle) {
    }

    public void drawBody(b.Bd bd) {
    }

    public void drawBody(b.Bd bd, int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public int getCSType() {
        return colorSprayType;
    }

    public void setCSType(int colorSprayType) {
        this.colorSprayType = colorSprayType;
    }

    public int getCSHue() {
        return colorSprayHue;
    }

    public void setCSHue(int colorSprayHue) {
        this.colorSprayHue = colorSprayHue;
    }

    public int getCSSaturation() {
        return colorSpraySaturation;
    }

    public void setCSSaturation(int colorSpraySaturation) {
        this.colorSpraySaturation = colorSpraySaturation;
    }

    public int getCSBrightness() {
        return colorSprayBrightness;
    }

    public void setCSBrightness(int colorSprayBrightness) {
        this.colorSprayBrightness = colorSprayBrightness;
    }

    public int getCSFrequency() {
        return colorSprayFrequency;
    }

    public void setCSFrequency(int colorSprayFrequency) {
        this.colorSprayFrequency = colorSprayFrequency;
    }

    public ColorArray getColors() {
        return COLORS;
    }

    public void setColors(ColorArray COLORS) {
        this.COLORS = COLORS;
    }
    
    public int getShiftX() {
        return shiftX;
    }

    public void setShiftX(int shiftX) {
        this.shiftX = shiftX;
    }

    public int getShiftY() {
        return shiftY;
    }

    public void setShiftY(int shiftY) {
        this.shiftY = shiftY;
    }
}
