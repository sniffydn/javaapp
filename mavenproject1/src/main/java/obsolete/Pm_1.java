/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package obsolete;

import clts.b.a.*;
import clts.SuperB;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;
import util.Color;

/**
 *
 * @author doubleD
 */
public class Pm_1 extends SuperB {

    public Pm_1() {
        super();
    }

    public Pm_1(int layer) {
        super(layer);
    }

    public Pm_1(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Pm_1(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        int x = offsetX;
        int y = 0;

        paintTA(x, y, g2d);
    }

    public void paintTA(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 66 + y, 1, 4);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 69 + y, 1, 2);
        g2d.fillRect(87 + x, 70 + y, 1, 2);
        g2d.fillRect(86 + x, 71 + y, 1, 1);
        g2d.fillRect(88 + x, 71 + y, 1, 2);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(89 + x, 72 + y, 1, 2);
        g2d.fillRect(90 + x, 72 + y, 1, 2);
        g2d.fillRect(91 + x, 73 + y, 1, 2);
        g2d.fillRect(94 + x, 78 + y, 2, 1);
        g2d.fillRect(98 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 79 + y, 2, 1);
        g2d.fillRect(105 + x, 79 + y, 2, 1);
        g2d.fillRect(102 + x, 80 + y, 2, 1);
        g2d.fillRect(108 + x, 80 + y, 3, 1);
        g2d.fillRect(106 + x, 81 + y, 2, 1);
        g2d.fillRect(112 + x, 81 + y, 3, 1);
        g2d.fillRect(109 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
        g2d.fillRect(96 + x, 141 + y, 1, 2);
        g2d.fillRect(113 + x, 141 + y, 1, 2);
        g2d.fillRect(98 + x, 144 + y, 1, 1);
        g2d.fillRect(108 + x, 144 + y, 1, 1);
        g2d.fillRect(111 + x, 144 + y, 2, 1);
        g2d.fillRect(99 + x, 145 + y, 1, 1);
        g2d.fillRect(102 + x, 145 + y, 2, 1);
        g2d.fillRect(107 + x, 145 + y, 1, 1);
        g2d.fillRect(100 + x, 148 + y, 1, 4);
        g2d.fillRect(106 + x, 150 + y, 1, 3);
        g2d.fillRect(112 + x, 150 + y, 1, 3);
        g2d.fillRect(101 + x, 152 + y, 2, 1);
        g2d.fillRect(104 + x, 152 + y, 2, 1);
        g2d.fillRect(107 + x, 153 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 150 + y, 1, 2);
        g2d.fillRect(104 + x, 150 + y, 2, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 3);
        g2d.fillRect(111 + x, 150 + y, 1, 3);
        g2d.fillRect(102 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 151 + y, 1, 1);
        g2d.fillRect(108 + x, 151 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 150 + y, 2, 1);
        g2d.fillRect(108 + x, 150 + y, 3, 1);
        g2d.fillRect(103 + x, 151 + y, 1, 2);
        g2d.fillRect(104 + x, 151 + y, 1, 1);
        g2d.fillRect(109 + x, 151 + y, 1, 2);
        g2d.fillRect(110 + x, 151 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(173, 173, 173));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(189, 189, 189));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(206, 206, 206));
        COLORS.set(ImageUtilities.GREY, new Color(222, 222, 222));
        COLORS.set(ImageUtilities.GREY_1, new Color(239, 239, 239));
        COLORS.set(ImageUtilities.GREY_2, new Color(254, 254, 255));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 255, 255));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(66, 66, 66));
        COLORS.set(ImageUtilities.GREY, new Color(82, 82, 82));
        COLORS.set(ImageUtilities.GREY_1, new Color(99, 99, 99));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
