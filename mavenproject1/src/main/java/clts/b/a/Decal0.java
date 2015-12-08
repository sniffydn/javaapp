/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b.a;

import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Decal0 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Decal0() {
        super();
    }

    public Decal0(int layer) {
        super(layer);
    }

    public Decal0(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Decal0(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        if (getIncludeY()) {
            paintDecal(offsetX + shiftX + 102, offsetY + shiftY + 83, g2d);
        } else {
            paintDecal(offsetX + shiftX + 102, shiftY + 83, g2d);
        }
    }

    public void paintDecal(int x, int y, GraphicsMap g2d) {
        g2d.setColor(new Color(255, 0, 0, 255));
        g2d.fillRect(1 + x, 1 + y, 1, 1);
        g2d.fillRect(1 + x, 3 + y, 1, 1);
        g2d.fillRect(3 + x, 3 + y, 1, 1);


        g2d.setColor(new Color(255, 191, 0, 255));
        g2d.fillRect(1 + x, 0 + y, 3, 1);
        g2d.fillRect(0 + x, 1 + y, 1, 3);
        g2d.fillRect(4 + x, 1 + y, 1, 3);
        g2d.fillRect(1 + x, 4 + y, 3, 1);


        g2d.setColor(new Color(187, 187, 187, 255));
        g2d.fillRect(1 + x, 2 + y, 2, 1);
        g2d.fillRect(2 + x, 3 + y, 1, 1);


        g2d.setColor(new Color(238, 238, 238, 255));
        g2d.fillRect(2 + x, 1 + y, 2, 1);
        g2d.fillRect(3 + x, 2 + y, 1, 1);
    }
}
