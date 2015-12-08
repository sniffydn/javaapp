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
public class H15 extends SuperTL {

    int direction = 0;

    public H15() {
        super();
    }

    public H15(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm, int eye) {
        step = s;
        this.direction = direction;
    }

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = true;

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if (direction == 1) {
            paintH(offsetX, 0, g2d);
        } else {
            paintBackH(offsetX, 0, g2d);
        }
    }

    public void paintH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128, 73, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132, 81, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(184, 137, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(102 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 137, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 147, 1, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(122 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205, 142, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(115 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 152, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(218, 157, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(120 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 167, 5, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(190, 154, 50, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 167, 4, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(110 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 170, 7, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 172, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(107 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 171, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(114 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 171, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(111 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 176, 29, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(118 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 185, 6, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 177, 32, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 186, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 183, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(113 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 189, 13, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 193, 4, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(107 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 192, 10, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(121 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 197, 5, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 0, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(111 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 205, 3, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(101 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 191, 29, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(110 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(240, 191, 38, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 207, 11, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(116 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 202, 18, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(114 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 200, 22, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(117 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 199, 33, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(114 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 219, 29, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(110 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 233, 17, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(113 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 199, 67, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(115 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 214, 51, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(106 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 212, 70, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(115 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 47, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(116 + x, 19 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 209, 86, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(113 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 228, 65, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(105 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 229, 73, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(120 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 230, 75, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(115 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 237, 69, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(105 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 221, 92, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(118 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 231, 85, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(117 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 213, 108, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(108 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 249, 69, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(112 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 224, 105, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(116 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 221, 110, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 77, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(118 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 219, 119, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(115 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 112, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(119 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 87, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(111 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 217, 141, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 101, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(113 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 238, 119, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(107 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 244, 117, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(109 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 222, 148, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(118 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 235, 141, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(112 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 130, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(119 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 246, 146, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(111 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 140, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(118 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 163, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(108 + x, 15 + y, 1, 1);
    }

    public void paintBackH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128, 73, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(111 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132, 81, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(112 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(184, 137, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(113 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 137, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 147, 1, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(93 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205, 142, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 152, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(218, 157, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(95 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 167, 5, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(190, 154, 50, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 167, 4, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(105 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 170, 7, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 172, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(108 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 171, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(101 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 171, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 176, 29, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(97 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 185, 6, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 177, 32, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 186, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 183, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(102 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 189, 13, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 193, 4, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(108 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 192, 10, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(94 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 197, 5, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 0, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(104 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 205, 3, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(114 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 191, 29, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(105 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(240, 191, 38, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(106 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 207, 11, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(99 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 202, 18, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(101 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 200, 22, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(98 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 199, 33, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(101 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 219, 29, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(105 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 233, 17, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(102 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 199, 67, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 214, 51, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(109 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 212, 70, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 47, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(98 + x, 19 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 209, 86, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(102 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 228, 65, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(110 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 229, 73, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(95 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 230, 75, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(100 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 237, 69, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(110 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 221, 92, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(97 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 231, 85, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(98 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 213, 108, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(107 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 249, 69, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(103 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 224, 105, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(99 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 221, 110, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 77, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(97 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 219, 119, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 112, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(96 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 87, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(104 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 217, 141, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 101, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(102 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 238, 119, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(108 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 244, 117, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(106 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 222, 148, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(97 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 235, 141, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(103 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 130, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(96 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 246, 146, 255), COLORS.get(ImageUtilities.GREY_5)));
        g2d.fillRect(104 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 140, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(97 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 163, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(107 + x, 15 + y, 1, 1);
    }
}
