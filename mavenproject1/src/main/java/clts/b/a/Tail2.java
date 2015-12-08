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
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Tail2 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Tail2() {
        super();
    }

    public Tail2(int layer) {
        super(layer);
    }

    public Tail2(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Tail2(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        paintT(offsetX + shiftX, shiftY + offsetY, g2d);
    }

    public void paintT(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 2, 1);
        g2d.fillRect(95 + x, 98 + y, 2, 1);
        g2d.fillRect(92 + x, 100 + y, 1, 1);
        g2d.fillRect(91 + x, 101 + y, 1, 1);
        g2d.fillRect(89 + x, 102 + y, 1, 2);
        g2d.fillRect(90 + x, 102 + y, 1, 1);
        g2d.fillRect(88 + x, 103 + y, 1, 2);
        g2d.fillRect(87 + x, 105 + y, 1, 5);
        g2d.fillRect(88 + x, 110 + y, 1, 1);
        g2d.fillRect(89 + x, 111 + y, 2, 1);
        g2d.fillRect(91 + x, 112 + y, 3, 1);
        g2d.fillRect(94 + x, 113 + y, 2, 1);
        g2d.fillRect(96 + x, 114 + y, 1, 2);
        g2d.fillRect(97 + x, 116 + y, 1, 3);
        g2d.fillRect(93 + x, 118 + y, 1, 2);
        g2d.fillRect(92 + x, 120 + y, 1, 2);
        g2d.fillRect(94 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 2, 1);
        g2d.fillRect(91 + x, 123 + y, 1, 2);
        g2d.fillRect(93 + x, 123 + y, 2, 1);
        g2d.fillRect(92 + x, 124 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 2);
        g2d.fillRect(100 + x, 95 + y, 1, 2);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 2, 1);
        g2d.fillRect(95 + x, 97 + y, 2, 1);
        g2d.fillRect(93 + x, 98 + y, 1, 2);
        g2d.fillRect(94 + x, 98 + y, 1, 2);
        g2d.fillRect(92 + x, 99 + y, 1, 1);
        g2d.fillRect(91 + x, 100 + y, 1, 1);
        g2d.fillRect(90 + x, 101 + y, 1, 1);
        g2d.fillRect(95 + x, 114 + y, 1, 1);
        g2d.fillRect(96 + x, 116 + y, 1, 4);
        g2d.fillRect(93 + x, 120 + y, 1, 3);
        g2d.fillRect(95 + x, 120 + y, 1, 1);
        g2d.fillRect(94 + x, 121 + y, 1, 2);
        g2d.fillRect(92 + x, 122 + y, 1, 2);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(99, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(156, 0, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(181, 0, 0));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
