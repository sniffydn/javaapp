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
public class WH0 extends SuperTL {

    /** Creates a new instance of GenericClothes */
    public WH0() {
        super(2);
    }

    public WH0(int layer) {
        super(layer);
    }

    public WH0(ColorArray colorSwitch) {
        super(2, colorSwitch);
    }

    public WH0(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft2(int x, int y, GraphicsMap g2d) {
    }

    @Override
    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintL2(offsetX + shiftX, shiftY, g2d);
    }

    @Override
    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryBack(offsetX, offsetY, g2d);
        paintL1(offsetX + shiftX, shiftY, g2d);
    }
    @Override
    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryBack(offsetX, offsetY, g2d);
        paintL3(offsetX + shiftX, shiftY, g2d);
    }

    public void paintL3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(92 + x, 47 + y, 1, 3);
        g2d.fillRect(93 + x, 47 + y, 1, 2);
        g2d.fillRect(91 + x, 49 + y, 1, 1);
        g2d.fillRect(88 + x, 50 + y, 1, 3);
        g2d.fillRect(89 + x, 50 + y, 1, 1);
        g2d.fillRect(87 + x, 51 + y, 1, 1);
        g2d.fillRect(91 + x, 52 + y, 1, 4);
        g2d.fillRect(92 + x, 53 + y, 1, 2);
        g2d.fillRect(89 + x, 55 + y, 2, 1);
        g2d.fillRect(87 + x, 56 + y, 1, 2);
        g2d.fillRect(88 + x, 57 + y, 1, 3);
        g2d.fillRect(86 + x, 59 + y, 2, 1);
        g2d.fillRect(82 + x, 60 + y, 1, 2);
        g2d.fillRect(83 + x, 60 + y, 1, 3);
        g2d.fillRect(84 + x, 60 + y, 1, 1);
        g2d.fillRect(88 + x, 64 + y, 3, 1);
        g2d.fillRect(82 + x, 65 + y, 2, 1);
        g2d.fillRect(87 + x, 65 + y, 1, 2);
        g2d.fillRect(91 + x, 65 + y, 1, 1);
        g2d.fillRect(83 + x, 66 + y, 2, 1);
        g2d.fillRect(90 + x, 66 + y, 1, 1);
        g2d.fillRect(84 + x, 67 + y, 2, 1);
        g2d.fillRect(89 + x, 67 + y, 1, 1);
        g2d.fillRect(81 + x, 68 + y, 1, 1);
        g2d.fillRect(90 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(83 + x, 47 + y, 1, 4);
        g2d.fillRect(84 + x, 47 + y, 1, 2);
        g2d.fillRect(88 + x, 47 + y, 2, 1);
        g2d.fillRect(86 + x, 48 + y, 1, 2);
        g2d.fillRect(87 + x, 48 + y, 1, 1);
        g2d.fillRect(89 + x, 48 + y, 1, 2);
        g2d.fillRect(82 + x, 49 + y, 1, 9);
        g2d.fillRect(85 + x, 49 + y, 1, 4);
        g2d.fillRect(90 + x, 49 + y, 1, 4);
        g2d.fillRect(81 + x, 50 + y, 1, 4);
        g2d.fillRect(91 + x, 50 + y, 1, 2);
        g2d.fillRect(80 + x, 51 + y, 1, 2);
        g2d.fillRect(83 + x, 52 + y, 1, 7);
        g2d.fillRect(86 + x, 52 + y, 1, 4);
        g2d.fillRect(89 + x, 52 + y, 1, 2);
        g2d.fillRect(88 + x, 53 + y, 1, 4);
        g2d.fillRect(85 + x, 55 + y, 1, 2);
        g2d.fillRect(81 + x, 56 + y, 1, 7);
        g2d.fillRect(84 + x, 56 + y, 1, 4);
        g2d.fillRect(89 + x, 56 + y, 1, 7);
        g2d.fillRect(80 + x, 57 + y, 1, 6);
        g2d.fillRect(79 + x, 58 + y, 1, 2);
        g2d.fillRect(85 + x, 59 + y, 1, 4);
        g2d.fillRect(90 + x, 59 + y, 1, 3);
        g2d.fillRect(91 + x, 59 + y, 3, 1);
        g2d.fillRect(93 + x, 60 + y, 1, 2);
        g2d.fillRect(87 + x, 61 + y, 1, 3);
        g2d.fillRect(88 + x, 61 + y, 1, 2);
        g2d.fillRect(78 + x, 62 + y, 1, 2);
        g2d.fillRect(79 + x, 62 + y, 1, 1);
        g2d.fillRect(94 + x, 62 + y, 1, 2);
        g2d.fillRect(77 + x, 63 + y, 1, 2);
        g2d.fillRect(82 + x, 63 + y, 1, 2);
        g2d.fillRect(83 + x, 63 + y, 1, 2);
        g2d.fillRect(84 + x, 63 + y, 1, 2);
        g2d.fillRect(86 + x, 63 + y, 1, 2);
        g2d.fillRect(76 + x, 64 + y, 1, 2);
        g2d.fillRect(80 + x, 64 + y, 1, 4);
        g2d.fillRect(81 + x, 64 + y, 1, 1);
        g2d.fillRect(85 + x, 64 + y, 1, 1);
        g2d.fillRect(81 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(92 + x, 63 + y, 1, 1);
    }

    public void paintL1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 46 + y, 1, 3);
        g2d.fillRect(101 + x, 48 + y, 1, 3);
        g2d.fillRect(102 + x, 49 + y, 1, 4);
        g2d.fillRect(103 + x, 51 + y, 1, 4);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
    }

    public void paintL2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(84 + x, 30 + y, 2, 1);
        g2d.fillRect(83 + x, 31 + y, 1, 1);
        g2d.fillRect(86 + x, 31 + y, 4, 1);
        g2d.fillRect(80 + x, 32 + y, 1, 1);
        g2d.fillRect(90 + x, 32 + y, 1, 1);
        g2d.fillRect(79 + x, 33 + y, 1, 2);
        g2d.fillRect(91 + x, 33 + y, 3, 1);
        g2d.fillRect(92 + x, 34 + y, 1, 2);
        g2d.fillRect(93 + x, 34 + y, 1, 3);
        g2d.fillRect(78 + x, 35 + y, 1, 6);
        g2d.fillRect(94 + x, 35 + y, 1, 4);
        g2d.fillRect(95 + x, 37 + y, 1, 4);
        g2d.fillRect(96 + x, 39 + y, 1, 3);
        g2d.fillRect(79 + x, 40 + y, 1, 2);
        g2d.fillRect(80 + x, 41 + y, 1, 2);
        g2d.fillRect(97 + x, 41 + y, 1, 3);
        g2d.fillRect(81 + x, 42 + y, 1, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 4);
        g2d.fillRect(82 + x, 43 + y, 1, 1);
        g2d.fillRect(85 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 4);
        g2d.fillRect(90 + x, 45 + y, 2, 1);
        g2d.fillRect(92 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(84 + x, 27 + y, 1, 3);
        g2d.fillRect(85 + x, 27 + y, 3, 1);
        g2d.fillRect(81 + x, 28 + y, 1, 2);
        g2d.fillRect(82 + x, 28 + y, 2, 1);
        g2d.fillRect(88 + x, 28 + y, 1, 2);
        g2d.fillRect(89 + x, 28 + y, 1, 3);
        g2d.fillRect(90 + x, 28 + y, 1, 4);
        g2d.fillRect(80 + x, 29 + y, 1, 2);
        g2d.fillRect(85 + x, 29 + y, 3, 1);
        g2d.fillRect(91 + x, 29 + y, 1, 4);
        g2d.fillRect(79 + x, 30 + y, 1, 2);
        g2d.fillRect(82 + x, 30 + y, 1, 2);
        g2d.fillRect(83 + x, 30 + y, 1, 1);
        g2d.fillRect(78 + x, 31 + y, 1, 3);
        g2d.fillRect(81 + x, 31 + y, 1, 3);
        g2d.fillRect(92 + x, 31 + y, 1, 2);
        g2d.fillRect(77 + x, 33 + y, 1, 3);
        g2d.fillRect(80 + x, 33 + y, 1, 3);
        g2d.fillRect(84 + x, 33 + y, 6, 1);
        g2d.fillRect(82 + x, 34 + y, 1, 2);
        g2d.fillRect(83 + x, 34 + y, 1, 1);
        g2d.fillRect(86 + x, 34 + y, 3, 1);
        g2d.fillRect(90 + x, 34 + y, 2, 1);
        g2d.fillRect(76 + x, 35 + y, 1, 6);
        g2d.fillRect(81 + x, 35 + y, 1, 7);
        g2d.fillRect(85 + x, 35 + y, 1, 2);
        g2d.fillRect(79 + x, 36 + y, 1, 3);
        g2d.fillRect(84 + x, 36 + y, 1, 4);
        g2d.fillRect(80 + x, 38 + y, 1, 3);
        g2d.fillRect(82 + x, 39 + y, 1, 2);
        g2d.fillRect(85 + x, 39 + y, 1, 3);
        g2d.fillRect(77 + x, 40 + y, 1, 2);
        g2d.fillRect(78 + x, 41 + y, 1, 2);
        g2d.fillRect(83 + x, 41 + y, 1, 6);
        g2d.fillRect(86 + x, 41 + y, 1, 1);
        g2d.fillRect(79 + x, 42 + y, 1, 2);
        g2d.fillRect(82 + x, 42 + y, 1, 1);
        g2d.fillRect(84 + x, 42 + y, 1, 1);
        g2d.fillRect(87 + x, 42 + y, 2, 1);
        g2d.fillRect(80 + x, 43 + y, 1, 2);
        g2d.fillRect(85 + x, 43 + y, 2, 1);
        g2d.fillRect(88 + x, 43 + y, 2, 1);
        g2d.fillRect(81 + x, 44 + y, 2, 1);
        g2d.fillRect(84 + x, 44 + y, 1, 3);
        g2d.fillRect(86 + x, 44 + y, 2, 1);
        g2d.fillRect(89 + x, 44 + y, 1, 3);
        g2d.fillRect(82 + x, 45 + y, 1, 1);
        g2d.fillRect(87 + x, 45 + y, 2, 1);
        g2d.fillRect(88 + x, 46 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(49, 49, 49));
        COLORS.set(ImageUtilities.GREY_1, new Color(66, 66, 66));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(99, 99, 99));
        COLORS.set(ImageUtilities.GREY_1, new Color(156, 156, 156));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
