/*
 * Hair.java
 */
package clts;

import b.Bd;
import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author 6uest
 */
public class SuperH implements java.io.Serializable, Paintable {

    protected ColorArray COLORS = new ColorArray();
    public transient int step = 0;
    public transient String direction = "Left";
    public transient boolean inFront = false;
    public transient int prevY = 0;
    protected int colorSprayType = 0;
    protected int colorSprayHue = 0;
    protected int colorSpraySaturation = 0;
    protected int colorSprayBrightness = 0;
    protected int colorSprayFrequency = 0;

    public SuperH() {
        setStep(0, 0, 0, 0, 0);
    }

    /** Creates a new instance of Hair */
    public SuperH(int step, int dir) {
        setStep(step, dir, 0, 0, 0);
    }

    public SuperH(int step, int dir, ColorArray colorSwitch) {
        setStep(step, dir, 0, 0, 0);
        COLORS = colorSwitch;
    }

    public SuperH copy() {
        SuperH h = null;
        Class[] classParm = null;
        Object[] objectParm = null;
        Class c = this.getClass();
        try {
            java.lang.reflect.Constructor co = c.getConstructor(classParm);
            h = (SuperH) co.newInstance(objectParm);
            h.setColors(COLORS.getNewColorArray());
        } catch (Exception e) {
        }

        return h;
    }

    public void setInFront(int inFront) {
        this.inFront = inFront == 1;
    }

    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm, int eye) {
        this.direction = "Left";
        if (iDirection == 1) {
            direction = "Right";
        }
    }

    public void setColors(ColorArray COLORS) {
        this.COLORS = COLORS;
    }

    public void drawFront(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }

    public void drawBack(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }

    public void drawVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }

    public SuperH cloneH() {
        Class[] classParm = {};
        Object[] objectParm = {};
        Class c = this.getClass();
        try {
            java.lang.reflect.Constructor co = c.getConstructor(classParm);
            SuperH hairClone = (SuperH) co.newInstance(objectParm);
            hairClone.COLORS = this.COLORS.getNewColorArray();
            return hairClone;
        } catch (Exception e) {
            System.out.println("Error in cloneH:" + c);
            e.printStackTrace();
            return null;
        }
    }

    public ColorArray getColors() {
        return COLORS;
    }

    public void drawBody(Bd bd) {
    }

    public void drawBody(Bd bd, int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        drawVeryBack(offsetX, offsetY, g2d);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        if (!inFront) {
            drawMiddle(offsetX, 0, g2d);
            drawBack(offsetX, offsetY, g2d);
        }
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {

    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        if (!inFront) {
            drawFront(offsetX, offsetY, g2d);
        }
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        if (inFront) {
            drawFront(offsetX, offsetY, g2d);
            drawMiddle(offsetX, 0, g2d);
            drawBack(offsetX, offsetY, g2d);
        }
    }

    public String toString() {
        String retVal = this.getClass() + "";
        retVal = retVal.substring(retVal.indexOf(" ")) + "();";
        return retVal;
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
}
