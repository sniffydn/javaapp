/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b.a;

import clts.*;
import util.DFactory;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Copy extends SuperTL {

    int y = -60;
    int alpha = 0;
    int count = 0;
    int increment = 0;
    int length = 0;

    public Copy() {
        super();
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public Copy(ColorArray colorSwitch) {
        super(colorSwitch);
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm, int eye) {
        step = s;

        count++;
        if (count > DFactory.ARRAY_SIZE) {
            count = 0;
            alpha = 0;
            y = -60;
        }

        if (count > (length - 3)) {
            if ((count - (length - 3)) < (length / 2)) {
                alpha += increment;
                if (alpha > 255) {
                    alpha = 255;
                }
            } else {
                alpha -= increment;
                if (alpha < 0) {
                    alpha = 0;
                }
            }

            if (alpha != 255) {
                y -= 4;
            }
        }

        COLORS.setAlpha(alpha);
    }

    public void drawS(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(97 + x, 162 + y, 1, 7);
        g2d.fillRect(98 + x, 162 + y, 4, 1);
        g2d.fillRect(101 + x, 163 + y, 2, 1);
        g2d.fillRect(102 + x, 164 + y, 1, 5);
        g2d.fillRect(103 + x, 164 + y, 1, 4);
        g2d.fillRect(115 + x, 164 + y, 1, 2);
        g2d.fillRect(107 + x, 165 + y, 1, 5);
        g2d.fillRect(110 + x, 165 + y, 2, 1);
        g2d.fillRect(114 + x, 165 + y, 1, 4);
        g2d.fillRect(120 + x, 165 + y, 1, 3);
        g2d.fillRect(122 + x, 165 + y, 1, 2);
        g2d.fillRect(123 + x, 165 + y, 1, 1);
        g2d.fillRect(98 + x, 166 + y, 1, 4);
        g2d.fillRect(104 + x, 166 + y, 1, 2);
        g2d.fillRect(108 + x, 166 + y, 2, 1);
        g2d.fillRect(117 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 167 + y, 2, 1);
        g2d.fillRect(118 + x, 167 + y, 1, 1);
        g2d.fillRect(101 + x, 168 + y, 1, 2);
        g2d.fillRect(112 + x, 168 + y, 1, 1);
        g2d.fillRect(119 + x, 168 + y, 1, 4);
        g2d.fillRect(121 + x, 168 + y, 1, 1);
        g2d.fillRect(124 + x, 168 + y, 1, 2);
        g2d.fillRect(99 + x, 169 + y, 2, 1);
        g2d.fillRect(105 + x, 169 + y, 2, 1);
        g2d.fillRect(110 + x, 169 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(96 + x, 162 + y, 1, 2);
        g2d.fillRect(124 + x, 165 + y, 1, 2);
        g2d.fillRect(125 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 167 + y, 1, 1);
        g2d.fillRect(121 + x, 167 + y, 1, 1);
        g2d.fillRect(100 + x, 168 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);
        g2d.fillRect(118 + x, 168 + y, 1, 1);
        g2d.fillRect(114 + x, 169 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 163 + y, 1, 1);
        g2d.fillRect(98 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 166 + y, 1, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 1);
        g2d.fillRect(122 + x, 167 + y, 1, 1);
        g2d.fillRect(124 + x, 167 + y, 2, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 169 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 168 + y, 1, 1);
        g2d.fillRect(104 + x, 168 + y, 1, 1);
        g2d.fillRect(121 + x, 169 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 168 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 161 + y, 2, 1);
        g2d.fillRect(96 + x, 164 + y, 1, 1);
        g2d.fillRect(98 + x, 164 + y, 1, 1);
        g2d.fillRect(105 + x, 166 + y, 1, 2);
        g2d.fillRect(108 + x, 167 + y, 1, 2);
        g2d.fillRect(112 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 167 + y, 1, 1);
        g2d.fillRect(98 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(103 + x, 168 + y, 1, 1);
        g2d.fillRect(125 + x, 168 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);
        g2d.fillRect(109 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 169 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 163 + y, 1, 1);
        g2d.fillRect(119 + x, 166 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(122 + x, 168 + y, 1, 1);
        g2d.fillRect(112 + x, 169 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 165 + y, 1, 1);
        g2d.fillRect(121 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 161 + y, 1, 1);
        g2d.fillRect(96 + x, 165 + y, 1, 1);
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(118 + x, 166 + y, 1, 1);
        g2d.fillRect(99 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 161 + y, 1, 1);
        g2d.fillRect(101 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 163 + y, 1, 1);
        g2d.fillRect(101 + x, 164 + y, 1, 1);
        g2d.fillRect(119 + x, 165 + y, 1, 1);
        g2d.fillRect(123 + x, 166 + y, 1, 1);
        g2d.fillRect(115 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 169 + y, 1, 1);
        g2d.fillRect(125 + x, 169 + y, 1, 1);
        g2d.fillRect(120 + x, 170 + y, 1, 1);
        g2d.fillRect(124 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(125 + x, 165 + y, 1, 1);
        g2d.fillRect(96 + x, 166 + y, 1, 1);
        g2d.fillRect(104 + x, 169 + y, 1, 1);
        g2d.fillRect(97 + x, 170 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(113 + x, 167 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);
        g2d.fillRect(108 + x, 169 + y, 1, 1);
        g2d.fillRect(122 + x, 169 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 164 + y, 1, 1);
        g2d.fillRect(122 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 165 + y, 1, 2);
        g2d.fillRect(96 + x, 167 + y, 1, 1);
        g2d.fillRect(99 + x, 167 + y, 1, 1);
        g2d.fillRect(106 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);
        g2d.fillRect(123 + x, 169 + y, 1, 1);
        g2d.fillRect(106 + x, 170 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 170 + y, 1, 1);
        g2d.fillRect(120 + x, 171 + y, 1, 1);
        g2d.fillRect(119 + x, 172 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(114 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(111 + x, 164 + y, 1, 1);
        g2d.fillRect(120 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(96 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);
        g2d.fillRect(123 + x, 168 + y, 1, 1);
        g2d.fillRect(101 + x, 170 + y, 1, 1);
        g2d.fillRect(105 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 162 + y, 1, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 1);
        g2d.fillRect(108 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(118 + x, 165 + y, 1, 1);
        g2d.fillRect(103 + x, 169 + y, 1, 1);
        g2d.fillRect(107 + x, 170 + y, 1, 1);
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(123 + x, 170 + y, 1, 1);
        g2d.fillRect(125 + x, 170 + y, 1, 1);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        drawS(0 + shiftX, y + shiftY, g2d);
    }

    public int getShiftX() {
        return shiftX;
    }

    public int getShiftY() {
        return shiftY;
    }
    int shiftX = 0;
    int shiftY = 0;

    public void setShiftX(int shiftX) {
        this.shiftX = shiftX;
    }

    public void setShiftY(int shiftY) {
        this.shiftY = shiftY;
    }
}
