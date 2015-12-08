/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.a;

import clts.SuperTL;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class WH1 extends SuperTL {

    /** Creates a new instance of GenericClothes */
    public WH1() {
        super(2);
    }

    public WH1(int layer) {
        super(layer);
    }

    public WH1(ColorArray colorSwitch) {
        super(2, colorSwitch);
    }

    public WH1(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d) {
    }

    @Override
    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintC(offsetX + shiftX, shiftY, g2d);
    }

    @Override
    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryBack(offsetX, offsetY, g2d);
        paintC(offsetX + shiftX, shiftY, g2d);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 78 + y, 2, 1);
        g2d.fillRect(97 + x, 79 + y, 1, 1);
        g2d.fillRect(96 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 79 + y, 1, 1);
    }

    public void paintC(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 81 + y, 1, 2);
        g2d.fillRect(92 + x, 82 + y, 2, 1);
        g2d.fillRect(91 + x, 83 + y, 1, 1);
        g2d.fillRect(89 + x, 85 + y, 3, 1);
        g2d.fillRect(90 + x, 86 + y, 1, 1);
        g2d.fillRect(90 + x, 88 + y, 1, 4);
        g2d.fillRect(88 + x, 90 + y, 1, 12);
        g2d.fillRect(89 + x, 91 + y, 1, 1);
        g2d.fillRect(90 + x, 93 + y, 1, 8);
        g2d.fillRect(91 + x, 99 + y, 1, 6);
        g2d.fillRect(89 + x, 102 + y, 1, 3);
        g2d.fillRect(92 + x, 104 + y, 1, 15);
        g2d.fillRect(88 + x, 105 + y, 1, 5);
        g2d.fillRect(90 + x, 106 + y, 1, 10);
        g2d.fillRect(87 + x, 110 + y, 1, 3);
        g2d.fillRect(87 + x, 114 + y, 1, 1);
        g2d.fillRect(87 + x, 116 + y, 1, 6);
        g2d.fillRect(91 + x, 117 + y, 1, 9);
        g2d.fillRect(90 + x, 118 + y, 1, 2);
        g2d.fillRect(93 + x, 118 + y, 1, 2);
        g2d.fillRect(89 + x, 120 + y, 1, 5);
        g2d.fillRect(88 + x, 121 + y, 1, 1);
        g2d.fillRect(94 + x, 122 + y, 1, 5);
        g2d.fillRect(87 + x, 124 + y, 1, 2);
        g2d.fillRect(88 + x, 124 + y, 1, 1);
        g2d.fillRect(90 + x, 124 + y, 1, 1);
        g2d.fillRect(85 + x, 126 + y, 2, 1);
        g2d.fillRect(95 + x, 127 + y, 1, 1);
        g2d.fillRect(96 + x, 128 + y, 1, 2);
        g2d.fillRect(91 + x, 129 + y, 2, 1);
        g2d.fillRect(92 + x, 130 + y, 1, 1);
        g2d.fillRect(97 + x, 130 + y, 1, 4);
        g2d.fillRect(96 + x, 133 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(92 + x, 83 + y, 1, 2);
        g2d.fillRect(93 + x, 83 + y, 1, 1);
        g2d.fillRect(90 + x, 84 + y, 2, 1);
        g2d.fillRect(89 + x, 86 + y, 1, 2);
        g2d.fillRect(89 + x, 89 + y, 1, 2);
        g2d.fillRect(89 + x, 92 + y, 1, 3);
        g2d.fillRect(90 + x, 103 + y, 1, 3);
        g2d.fillRect(91 + x, 105 + y, 1, 12);
        g2d.fillRect(90 + x, 116 + y, 1, 2);
        g2d.fillRect(88 + x, 122 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(93 + x, 81 + y, 1, 1);
        g2d.fillRect(90 + x, 87 + y, 1, 1);
        g2d.fillRect(89 + x, 88 + y, 1, 1);
        g2d.fillRect(88 + x, 89 + y, 1, 1);
        g2d.fillRect(89 + x, 95 + y, 1, 7);
        g2d.fillRect(90 + x, 101 + y, 1, 2);
        g2d.fillRect(88 + x, 102 + y, 1, 3);
        g2d.fillRect(87 + x, 113 + y, 1, 1);
        g2d.fillRect(87 + x, 115 + y, 1, 1);
        g2d.fillRect(94 + x, 120 + y, 1, 2);
        g2d.fillRect(90 + x, 125 + y, 1, 2);
        g2d.fillRect(91 + x, 126 + y, 1, 3);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(49, 49, 49));
        COLORS.set(ImageUtilities.GREY_1, new Color(66, 66, 66));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
