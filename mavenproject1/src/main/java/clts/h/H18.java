/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.h;

import clts.*;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class H18 extends SuperTL {

    int direction = 0;

    public H18() {
        super();
    }

    public H18(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm, int eye) {
        step = s;
        this.direction = direction;
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if (direction == 1) {
            paintH(offsetX + shiftX, shiftY, g2d);
        } else {
            paintBackH(offsetX + shiftX, shiftY, g2d);
        }
    }

    public void paintH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 11 + y, 1, 2);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 11 + y, 1, 4);
        g2d.fillRect(118 + x, 11 + y, 3, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 2);
        g2d.fillRect(103 + x, 12 + y, 2, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 12 + y, 1, 2);
        g2d.fillRect(121 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(122 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 2, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(123 + x, 14 + y, 3, 1);
        g2d.fillRect(97 + x, 15 + y, 2, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 12 + y, 1, 2);
        g2d.fillRect(118 + x, 12 + y, 1, 3);
        g2d.fillRect(119 + x, 12 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 13 + y, 1, 4);
        g2d.fillRect(116 + x, 13 + y, 1, 4);
        g2d.fillRect(121 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(122 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
    }

    public void paintBackH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 11 + y, 1, 2);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 11 + y, 1, 4);
        g2d.fillRect(95 + x, 11 + y, 3, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 2);
        g2d.fillRect(111 + x, 12 + y, 2, 1);
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 1, 2);
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(93 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 2, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(90 + x, 14 + y, 3, 1);
        g2d.fillRect(117 + x, 15 + y, 2, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 12 + y, 1, 2);
        g2d.fillRect(97 + x, 12 + y, 1, 3);
        g2d.fillRect(96 + x, 12 + y, 1, 2);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 13 + y, 1, 4);
        g2d.fillRect(99 + x, 13 + y, 1, 4);
        g2d.fillRect(94 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(93 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(99, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(181, 0, 0));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
