/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b;

import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot63 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Bot63() {
        super();
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot63(int layer) {
        super(layer);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot63(ColorArray colorSwitch) {
        super(colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot63(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        paintB(x, y, g2d);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 80 + y, 3, 1);
        g2d.fillRect(119 + x, 80 + y, 2, 1);
        g2d.fillRect(104 + x, 81 + y, 2, 1);
        g2d.fillRect(116 + x, 81 + y, 3, 1);
        g2d.fillRect(106 + x, 82 + y, 10, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 2, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 3, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 3, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 81 + y, 1, 4);
        g2d.fillRect(101 + x, 81 + y, 1, 3);
        g2d.fillRect(120 + x, 81 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 3);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 82 + y, 1, 5);
        g2d.fillRect(116 + x, 82 + y, 1, 5);
        g2d.fillRect(117 + x, 82 + y, 1, 5);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 1, 4);
        g2d.fillRect(108 + x, 83 + y, 1, 3);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 7);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(115 + x, 83 + y, 1, 4);
        g2d.fillRect(101 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 3, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 5);
        g2d.fillRect(112 + x, 85 + y, 1, 5);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 86 + y, 1, 3);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(16, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(189, 41, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(231, 16, 0));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
