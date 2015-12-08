/*
 * Platforms.java
 *
 * Created on March 1, 2007, 12:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts;

import util.ColorArray;

/**
 *
 * @author 6uest
 */
public class SuperP extends SuperS {

    public int height = 0;
    public int width = 0;

    /** Creates a new instance of Platforms */
    public SuperP(int height) {
        super();
        this.height = height;
    }

    public SuperP(int height, int width) {
        super();
        this.width = width;
        this.height = height;
    }

    public SuperP(String height, String width) {
        super();
        this.width = Integer.parseInt(width);
        this.height = Integer.parseInt(height);
    }

    public SuperP(int height, ColorArray colorsToSwitch) {
        super(colorsToSwitch);
        this.height = height;
    }

    public SuperP(int height, int width, ColorArray colorsToSwitch) {
        super(colorsToSwitch);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
