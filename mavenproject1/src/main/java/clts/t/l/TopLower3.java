/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.l;

import clts.SuperTL;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower3 extends SuperTL {

    ImageUtilities[] images = null;

    /** Creates a new instance of GenericClothes */
    public TopLower3() {
        super(2);
        prep = true;
    }

    public TopLower3(int layer) {
        super(layer);
        prep = true;
    }

    public TopLower3(ColorArray colorSwitch) {
        super(2, colorSwitch);
        prep = true;
    }

    public TopLower3(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
        prep = true;
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 75 + y, 3, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 7);
        g2d.fillRect(103 + x, 59 + y, 1, 17);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(105 + x, 67 + y, 1, 4);
        g2d.fillRect(116 + x, 56 + y, 2, 6);
        g2d.fillRect(115 + x, 62 + y, 2, 6);
        g2d.fillRect(116 + x, 68 + y, 2, 2);
        g2d.fillRect(117 + x, 70 + y, 2, 3);
        g2d.fillRect(118 + x, 73 + y, 2, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 57 + y, 6, 1);
        g2d.fillRect(103 + x, 58 + y, 5, 1);
        g2d.fillRect(104 + x, 59 + y, 4, 6);
        g2d.fillRect(105 + x, 65 + y, 3, 2);
        g2d.fillRect(106 + x, 67 + y, 2, 1);
        g2d.fillRect(106 + x, 68 + y, 3, 8);
        g2d.fillRect(105 + x, 71 + y, 1, 5);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 2, 6);
        g2d.fillRect(111 + x, 68 + y, 5, 8);
        g2d.fillRect(116 + x, 70 + y, 1, 6);
        g2d.fillRect(117 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 3, 12);
        g2d.fillRect(115 + x, 56 + y, 1, 6);
    }
}
