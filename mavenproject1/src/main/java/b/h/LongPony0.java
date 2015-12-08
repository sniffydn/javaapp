/*
 * LongWavy1.java
 *
 * Created on March 30, 2007, 9:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package b.h;

import clts.SuperH;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class LongPony0 extends SuperH {

    public LongPony0() {
        super();
    }

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = true;

    public LongPony0(int step, int dir) {
        super(step, dir);
    }

    public LongPony0(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d) {
        super.drawFront(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackF(x, y, g2d);
        } else {
            paintF(x, y, g2d);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d) {
        super.drawMiddle(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackM(x, y, g2d);
        } else {
            paintM(x, y, g2d);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d) {
        super.drawBack(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {

            paintBackB1(x, y, g2d);
            paintBackB2(x, prevY + y, g2d);
        } else {
            paintB1(x, y, g2d);
            paintB2(x, prevY + y, g2d);
        }
        prevY = y;
    }
    int prevY = 0;

    public void drawVeryBack(int x, int y, GraphicsMap g2d) {
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 8 + y, 4, 1);
        g2d.fillRect(102 + x, 9 + y, 2, 1);
        g2d.fillRect(108 + x, 9 + y, 2, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(110 + x, 10 + y, 1, 4);
        g2d.fillRect(100 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 4, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 11 + y, 1, 3);
        g2d.fillRect(113 + x, 11 + y, 1, 2);
        g2d.fillRect(104 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 12 + y, 3, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 4);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 2, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 26);
        g2d.fillRect(120 + x, 18 + y, 1, 3);
        g2d.fillRect(121 + x, 21 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 10 + y, 2, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 2);
        g2d.fillRect(115 + x, 20 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 10 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 24);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 11 + y, 2, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 9 + y, 1, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 3);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 2);
        g2d.fillRect(102 + x, 19 + y, 1, 3);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(120 + x, 21 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 9 + y, 2, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 14);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 9 + y, 1, 1);
        g2d.fillRect(103 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 2);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 36 + y, 1, 1);
    }

    public void paintB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 9 + y, 2, 1);
        g2d.fillRect(97 + x, 10 + y, 2, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(96 + x, 11 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 1, 2);
        g2d.fillRect(94 + x, 14 + y, 1, 5);
        g2d.fillRect(93 + x, 19 + y, 1, 25);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 13 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 10 + y, 2, 1);
        g2d.fillRect(97 + x, 11 + y, 1, 1);
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 3);
        g2d.fillRect(98 + x, 27 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 12 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 16 + y, 1, 3);
        g2d.fillRect(96 + x, 25 + y, 1, 6);
        g2d.fillRect(96 + x, 38 + y, 1, 6);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 29 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 3);
        g2d.fillRect(96 + x, 31 + y, 1, 2);
        g2d.fillRect(96 + x, 34 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 14 + y, 1, 2);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(94 + x, 26 + y, 1, 11);
        g2d.fillRect(98 + x, 31 + y, 1, 1);
        g2d.fillRect(94 + x, 39 + y, 1, 5);
        g2d.fillRect(98 + x, 40 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 19 + y, 1, 7);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 3);
        g2d.fillRect(98 + x, 32 + y, 1, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 4);
        g2d.fillRect(94 + x, 37 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 11 + y, 1, 1);
        g2d.fillRect(97 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 13 + y, 1, 3);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 21 + y, 1, 3);
        g2d.fillRect(98 + x, 33 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 18 + y, 1, 26);
        g2d.fillRect(97 + x, 30 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 19 + y, 1, 11);
        g2d.fillRect(95 + x, 30 + y, 1, 2);
        g2d.fillRect(97 + x, 32 + y, 1, 12);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 19 + y, 1, 11);
        g2d.fillRect(95 + x, 32 + y, 1, 12);
    }

    public void paintB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 42 + y, 1, 10);
        g2d.fillRect(100 + x, 42 + y, 1, 13);
        g2d.fillRect(92 + x, 52 + y, 1, 3);
        g2d.fillRect(91 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 45 + y, 1, 2);
        g2d.fillRect(96 + x, 48 + y, 1, 3);
        g2d.fillRect(95 + x, 51 + y, 1, 4);
        g2d.fillRect(94 + x, 55 + y, 1, 2);
        g2d.fillRect(93 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 42 + y, 1, 3);
        g2d.fillRect(96 + x, 47 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 44 + y, 1, 9);
        g2d.fillRect(97 + x, 53 + y, 1, 3);
        g2d.fillRect(96 + x, 56 + y, 1, 2);
        g2d.fillRect(95 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 42 + y, 1, 13);
        g2d.fillRect(102 + x, 55 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 42 + y, 1, 9);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(93 + x, 52 + y, 1, 3);
        g2d.fillRect(92 + x, 55 + y, 1, 2);
        g2d.fillRect(91 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 42 + y, 1, 16);
        g2d.fillRect(98 + x, 58 + y, 1, 3);
        g2d.fillRect(97 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 44 + y, 1, 7);
        g2d.fillRect(102 + x, 49 + y, 1, 3);
        g2d.fillRect(94 + x, 51 + y, 1, 4);
        g2d.fillRect(93 + x, 55 + y, 1, 2);
        g2d.fillRect(92 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 42 + y, 1, 9);
        g2d.fillRect(96 + x, 51 + y, 1, 4);
        g2d.fillRect(95 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 42 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 1, 3);
        g2d.fillRect(103 + x, 55 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 22 + y, 1, 9);
        g2d.fillRect(103 + x, 23 + y, 1, 8);
        g2d.fillRect(104 + x, 31 + y, 1, 3);
        g2d.fillRect(120 + x, 31 + y, 1, 6);
        g2d.fillRect(119 + x, 33 + y, 1, 1);
        g2d.fillRect(105 + x, 34 + y, 1, 2);
        g2d.fillRect(118 + x, 34 + y, 1, 3);
        g2d.fillRect(106 + x, 36 + y, 1, 1);
        g2d.fillRect(117 + x, 37 + y, 1, 4);
        g2d.fillRect(119 + x, 37 + y, 1, 4);
        g2d.fillRect(116 + x, 41 + y, 1, 3);
        g2d.fillRect(118 + x, 41 + y, 1, 3);
        g2d.fillRect(117 + x, 44 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 23 + y, 1, 8);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(117 + x, 21 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(114 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 24 + y, 1, 4);
        g2d.fillRect(118 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 3);
        g2d.fillRect(118 + x, 37 + y, 1, 4);
        g2d.fillRect(117 + x, 41 + y, 1, 3);
        g2d.fillRect(116 + x, 44 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 23 + y, 1, 8);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 31 + y, 1, 3);
        g2d.fillRect(106 + x, 34 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 5);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 27 + y, 1, 4);
        g2d.fillRect(119 + x, 31 + y, 1, 2);
        g2d.fillRect(118 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 8 + y, 4, 1);
        g2d.fillRect(112 + x, 9 + y, 2, 1);
        g2d.fillRect(106 + x, 9 + y, 2, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(105 + x, 10 + y, 1, 4);
        g2d.fillRect(115 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 4, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 11 + y, 1, 3);
        g2d.fillRect(102 + x, 11 + y, 1, 2);
        g2d.fillRect(110 + x, 12 + y, 2, 1);
        g2d.fillRect(106 + x, 12 + y, 3, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 4);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 26);
        g2d.fillRect(95 + x, 18 + y, 1, 3);
        g2d.fillRect(94 + x, 21 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 10 + y, 2, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 2);
        g2d.fillRect(100 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 24);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 11 + y, 2, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 9 + y, 1, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 3);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 3);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(95 + x, 21 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 9 + y, 2, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 14);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 9 + y, 1, 1);
        g2d.fillRect(112 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 36 + y, 1, 1);
    }

    public void paintBackB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 9 + y, 2, 1);
        g2d.fillRect(117 + x, 10 + y, 2, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(119 + x, 11 + y, 1, 1);
        g2d.fillRect(120 + x, 12 + y, 1, 2);
        g2d.fillRect(121 + x, 14 + y, 1, 5);
        g2d.fillRect(122 + x, 19 + y, 1, 25);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 13 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 10 + y, 2, 1);
        g2d.fillRect(118 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 3);
        g2d.fillRect(117 + x, 27 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 12 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 16 + y, 1, 3);
        g2d.fillRect(119 + x, 25 + y, 1, 6);
        g2d.fillRect(119 + x, 38 + y, 1, 6);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 29 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 3);
        g2d.fillRect(119 + x, 31 + y, 1, 2);
        g2d.fillRect(119 + x, 34 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(121 + x, 26 + y, 1, 11);
        g2d.fillRect(117 + x, 31 + y, 1, 1);
        g2d.fillRect(121 + x, 39 + y, 1, 5);
        g2d.fillRect(117 + x, 40 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 19 + y, 1, 7);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 3);
        g2d.fillRect(117 + x, 32 + y, 1, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 4);
        g2d.fillRect(121 + x, 37 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 11 + y, 1, 1);
        g2d.fillRect(118 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 13 + y, 1, 3);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 21 + y, 1, 3);
        g2d.fillRect(117 + x, 33 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 1, 26);
        g2d.fillRect(118 + x, 30 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 19 + y, 1, 11);
        g2d.fillRect(120 + x, 30 + y, 1, 2);
        g2d.fillRect(118 + x, 32 + y, 1, 12);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 19 + y, 1, 11);
        g2d.fillRect(120 + x, 32 + y, 1, 12);
    }

    public void paintBackB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 42 + y, 1, 10);
        g2d.fillRect(115 + x, 42 + y, 1, 13);
        g2d.fillRect(123 + x, 52 + y, 1, 3);
        g2d.fillRect(124 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 3);
        g2d.fillRect(113 + x, 58 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 45 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 3);
        g2d.fillRect(120 + x, 51 + y, 1, 4);
        g2d.fillRect(121 + x, 55 + y, 1, 2);
        g2d.fillRect(122 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 42 + y, 1, 3);
        g2d.fillRect(119 + x, 47 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 44 + y, 1, 9);
        g2d.fillRect(118 + x, 53 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 42 + y, 1, 13);
        g2d.fillRect(113 + x, 55 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 42 + y, 1, 9);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(122 + x, 52 + y, 1, 3);
        g2d.fillRect(123 + x, 55 + y, 1, 2);
        g2d.fillRect(124 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 42 + y, 1, 16);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 44 + y, 1, 7);
        g2d.fillRect(113 + x, 49 + y, 1, 3);
        g2d.fillRect(121 + x, 51 + y, 1, 4);
        g2d.fillRect(122 + x, 55 + y, 1, 2);
        g2d.fillRect(123 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 42 + y, 1, 9);
        g2d.fillRect(119 + x, 51 + y, 1, 4);
        g2d.fillRect(120 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 42 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 1, 3);
        g2d.fillRect(112 + x, 55 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 131, 43, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 135, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 22 + y, 1, 9);
        g2d.fillRect(112 + x, 23 + y, 1, 8);
        g2d.fillRect(111 + x, 31 + y, 1, 3);
        g2d.fillRect(95 + x, 31 + y, 1, 6);
        g2d.fillRect(96 + x, 33 + y, 1, 1);
        g2d.fillRect(110 + x, 34 + y, 1, 2);
        g2d.fillRect(97 + x, 34 + y, 1, 3);
        g2d.fillRect(109 + x, 36 + y, 1, 1);
        g2d.fillRect(98 + x, 37 + y, 1, 4);
        g2d.fillRect(96 + x, 37 + y, 1, 4);
        g2d.fillRect(99 + x, 41 + y, 1, 3);
        g2d.fillRect(97 + x, 41 + y, 1, 3);
        g2d.fillRect(98 + x, 44 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 149, 50, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 167, 59, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 156, 63, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 159, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 23 + y, 1, 8);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 170, 75, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 187, 67, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 170, 78, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 173, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 185, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 182, 91, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 209, 77, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 186, 96, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 189, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 24 + y, 1, 4);
        g2d.fillRect(97 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 202, 100, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 3);
        g2d.fillRect(97 + x, 37 + y, 1, 4);
        g2d.fillRect(98 + x, 41 + y, 1, 3);
        g2d.fillRect(99 + x, 44 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 195, 106, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 23 + y, 1, 8);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 31 + y, 1, 3);
        g2d.fillRect(109 + x, 34 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 196, 113, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 209, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 219, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 203, 128, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 206, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 210, 146, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 225, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 5);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 218, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 218, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 230, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 27 + y, 1, 4);
        g2d.fillRect(96 + x, 31 + y, 1, 2);
        g2d.fillRect(97 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 227, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 236, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
    }
}
