/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.d;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;

/**
 *
 * @author doubleD
 */
public class D57 extends D55 {


    public D57() {
        super();
    }

    public D57(String middle) {
        super(middle);
    }

    public D57(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
    }

    public SuperC getRecommendedAccessory(ColorArray c) {
        obsolete.D55_1 temp = new obsolete.D55_1(middle, c);
        temp.drawTUU = false;
        return temp;
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (middle.equals("b")) {
            drawB(x, y, g2d);
        }
    }
    

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {        
        prevY = offsetY;
    }
}
