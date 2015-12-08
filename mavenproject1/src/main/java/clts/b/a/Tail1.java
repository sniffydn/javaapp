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
public class Tail1 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Tail1() {
        super();
    }

    public Tail1(int layer) {
        super(layer);
    }

    public Tail1(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Tail1(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }


    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        if(offsetY > 0)
        {
            paint11T1(offsetX + shiftX, shiftY, g2d);
        }
        else
        {
            paint11T2(offsetX + shiftX, shiftY, g2d);
        }
    }

    public void paint11T2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 77 + y, 1, 3);
        g2d.fillRect(100 + x, 77 + y, 1, 3);
        g2d.fillRect(96 + x, 78 + y, 1, 3);
        g2d.fillRect(97 + x, 78 + y, 1, 3);
        g2d.fillRect(98 + x, 78 + y, 1, 2);
        g2d.fillRect(94 + x, 79 + y, 1, 3);
        g2d.fillRect(95 + x, 79 + y, 1, 2);
        g2d.fillRect(93 + x, 80 + y, 1, 4);
        g2d.fillRect(92 + x, 81 + y, 1, 5);
        g2d.fillRect(91 + x, 82 + y, 1, 10);
        g2d.fillRect(90 + x, 84 + y, 1, 5);
        g2d.fillRect(92 + x, 88 + y, 1, 6);
        g2d.fillRect(93 + x, 91 + y, 1, 6);
        g2d.fillRect(94 + x, 93 + y, 1, 13);
        g2d.fillRect(95 + x, 95 + y, 1, 10);
        g2d.fillRect(80 + x, 97 + y, 1, 2);
        g2d.fillRect(81 + x, 97 + y, 1, 10);
        g2d.fillRect(82 + x, 98 + y, 1, 12);
        g2d.fillRect(93 + x, 103 + y, 1, 5);
        g2d.fillRect(92 + x, 105 + y, 1, 4);
        g2d.fillRect(83 + x, 106 + y, 1, 5);
        g2d.fillRect(91 + x, 106 + y, 1, 4);
        g2d.fillRect(90 + x, 107 + y, 1, 3);
        g2d.fillRect(84 + x, 108 + y, 1, 4);
        g2d.fillRect(88 + x, 108 + y, 1, 3);
        g2d.fillRect(89 + x, 108 + y, 1, 3);
        g2d.fillRect(85 + x, 109 + y, 1, 3);
        g2d.fillRect(86 + x, 109 + y, 1, 3);
        g2d.fillRect(87 + x, 109 + y, 1, 3);
    }

    public void paint11T1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 77 + y, 1, 3);
        g2d.fillRect(100 + x, 77 + y, 1, 3);
        g2d.fillRect(96 + x, 78 + y, 1, 3);
        g2d.fillRect(97 + x, 78 + y, 1, 3);
        g2d.fillRect(98 + x, 78 + y, 1, 2);
        g2d.fillRect(94 + x, 79 + y, 1, 3);
        g2d.fillRect(95 + x, 79 + y, 1, 2);
        g2d.fillRect(93 + x, 80 + y, 1, 4);
        g2d.fillRect(92 + x, 81 + y, 1, 5);
        g2d.fillRect(91 + x, 82 + y, 1, 11);
        g2d.fillRect(90 + x, 84 + y, 1, 6);
        g2d.fillRect(92 + x, 89 + y, 1, 6);
        g2d.fillRect(93 + x, 92 + y, 1, 6);
        g2d.fillRect(94 + x, 94 + y, 1, 14);
        g2d.fillRect(95 + x, 96 + y, 1, 11);
        g2d.fillRect(80 + x, 101 + y, 1, 2);
        g2d.fillRect(81 + x, 101 + y, 1, 8);
        g2d.fillRect(82 + x, 102 + y, 1, 10);
        g2d.fillRect(93 + x, 105 + y, 1, 5);
        g2d.fillRect(92 + x, 107 + y, 1, 4);
        g2d.fillRect(83 + x, 108 + y, 1, 5);
        g2d.fillRect(91 + x, 108 + y, 1, 4);
        g2d.fillRect(90 + x, 109 + y, 1, 3);
        g2d.fillRect(84 + x, 110 + y, 1, 4);
        g2d.fillRect(88 + x, 110 + y, 1, 3);
        g2d.fillRect(89 + x, 110 + y, 1, 3);
        g2d.fillRect(85 + x, 111 + y, 1, 3);
        g2d.fillRect(86 + x, 111 + y, 1, 3);
        g2d.fillRect(87 + x, 111 + y, 1, 3);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.GREY, new Color(0, 0, 0));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
