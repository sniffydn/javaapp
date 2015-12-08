/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clts;

import util.GraphicsMap;

/**
 *
 * @author nyffeldd
 */
public interface Paintable {
    public abstract void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d);
    public abstract void paintBack(int offsetX, int offsetY, GraphicsMap g2d);
    public abstract void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d);
    public abstract void paintFront(int offsetX, int offsetY, GraphicsMap g2d);
    public abstract void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d);
    public abstract void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm,int eye);
    public abstract void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d);
    public abstract void drawBody(b.Bd bd);
    public abstract void drawBody(b.Bd bd, int offsetX, int offsetY, GraphicsMap g2d);
    public abstract util.ColorArray getColors();
    public abstract void setColors(util.ColorArray COLORS);
    
    
    public abstract int getCSType();
    public abstract void setCSType(int colorSprayType);
    public abstract int getCSHue();
    public abstract void setCSHue(int colorSprayHue);
    public abstract int getCSSaturation();
    public abstract void setCSSaturation(int colorSpraySaturation);
    public abstract int getCSBrightness();
    public abstract void setCSBrightness(int colorSprayBrightness);
    public abstract int getCSFrequency();
    public abstract void setCSFrequency(int colorSprayFrequency);
}
