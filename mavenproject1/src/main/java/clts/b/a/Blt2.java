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
public class Blt2 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Blt2() {
        super();
    }

    public Blt2(int layer) {
        super(layer);
    }

    public Blt2(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Blt2(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        y += shiftY;
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 76 + y, 3, 1);
        g2d.fillRect(117 + x, 76 + y, 3, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(105 + x, 77 + y, 1, 3);
        g2d.fillRect(116 + x, 77 + y, 1, 3);
        g2d.fillRect(120 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 79 + y, 3, 1);
        g2d.fillRect(112 + x, 79 + y, 3, 1);
        g2d.fillRect(102 + x, 80 + y, 3, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 80 + y, 1, 3);
        g2d.fillRect(111 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 3);
        g2d.fillRect(117 + x, 80 + y, 3, 1);
        g2d.fillRect(107 + x, 83 + y, 3, 1);
        g2d.fillRect(112 + x, 83 + y, 3, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 8);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
    }
}
