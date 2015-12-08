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
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Decal1 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Decal1() {
        super();
    }

    public Decal1(int layer) {
        super(layer);
    }

    public Decal1(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Decal1(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        if (getIncludeY()) {
            paintDecal(offsetX + shiftX - 9, offsetY + shiftY + 70, g2d);
        } else {
            paintDecal(offsetX + shiftX - 9, shiftY + 70, g2d);
        }
    }

    public void paintDecal(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 11 + y, 1, 6);
        g2d.fillRect(113 + x, 11 + y, 1, 6);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
    }
}
