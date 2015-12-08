/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author nyffeldd
 */
public class Color implements java.io.Serializable{

    public static final Color BLACK = new Color(0,0,0);
    
    public static float[] RGBtoHSB(int red, int green, int blue, float[] temp) {
        return java.awt.Color.RGBtoHSB(red, green, blue, temp);
    }

    public static Color getHSBColor(float h, float s, float b) {
        Color temp = new Color(0,0,0);
        temp.setColor(java.awt.Color.getHSBColor(h, s, b));
        return temp;
    }

    java.awt.Color color;
    int r;
    int g;
    int b;
    int a;

    public Color(int r, int g, int b) {
        color = new java.awt.Color(r, g, b);
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = 255;
    }

    public Color(int r, int g, int b, int a) {
        color = new java.awt.Color(r, g, b, a);
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public void setColor(java.awt.Color c) {
        color = c;
    }

    public java.awt.Color getColor() {
        return color;
    }

    public int getRed() {
        return color.getRed();
    }

    public int getGreen() {
        return color.getGreen();
    }

    public int getBlue() {
        return color.getBlue();
    }

    public int getAlpha() {
        return color.getAlpha();
    }

    public Color brighter() {
        Color temp = new Color(0,0,0);
        temp.setColor(color.brighter());
        return temp;
    }

    public Color darker() {
        Color temp = new Color(0,0,0);
        temp.setColor(color.darker());
        return temp;
    }
    
    public String toString()
    {
        return color.toString();
    }
}
