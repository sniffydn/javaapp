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
public class ShortStraight15 extends SuperH {

    public ShortStraight15() {
        super();
    }

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = true;

    public ShortStraight15(int step, int dir) {
        super(step, dir);
    }

    public ShortStraight15(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d) {
        y -= 2;
        super.drawFront(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackF(x, y, g2d);
        } else {
            paintF(x, y, g2d);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d) {
        y -= 2;
        super.drawMiddle(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackM(x, y, g2d);
        } else {
            paintM(x, y, g2d);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d) {
        y -= 2;
        super.drawBack(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackB(x, y, g2d);
        } else {
            paintB(x, y, g2d);
        }
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d) {
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(54, 26, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 7 + y, 1, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 2);
        g2d.fillRect(101 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 29, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 6 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 27, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 30, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 28, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 35, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 5 + y, 1, 1);
        g2d.fillRect(103 + x, 8 + y, 1, 1);
        g2d.fillRect(100 + x, 9 + y, 1, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 33, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 4 + y, 1, 1);
        g2d.fillRect(110 + x, 5 + y, 1, 1);
        g2d.fillRect(103 + x, 6 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 1);
        g2d.fillRect(100 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 10 + y, 1, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 33, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 3 + y, 1, 1);
        g2d.fillRect(107 + x, 4 + y, 1, 1);
        g2d.fillRect(99 + x, 9 + y, 1, 1);
        g2d.fillRect(103 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 2 + y, 1, 1);
        g2d.fillRect(117 + x, 3 + y, 1, 1);
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 36, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 5 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(63, 30, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 36, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 33, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 6 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 6 + y, 1, 1);
        g2d.fillRect(103 + x, 7 + y, 1, 1);
        g2d.fillRect(99 + x, 8 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 35, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 6 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 31, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 3 + y, 1, 1);
        g2d.fillRect(116 + x, 4 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(59, 28, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 38, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 6 + y, 1, 1);
        g2d.fillRect(106 + x, 6 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 35, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 4 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 3 + y, 1, 1);
        g2d.fillRect(124 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 37, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 3 + y, 1, 1);
        g2d.fillRect(108 + x, 4 + y, 1, 1);
        g2d.fillRect(100 + x, 5 + y, 1, 1);
        g2d.fillRect(107 + x, 5 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 39, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 4 + y, 1, 1);
        g2d.fillRect(106 + x, 7 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 30, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 3 + y, 1, 1);
        g2d.fillRect(119 + x, 8 + y, 1, 1);
        g2d.fillRect(98 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 41, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 5 + y, 1, 1);
        g2d.fillRect(104 + x, 5 + y, 1, 1);
        g2d.fillRect(106 + x, 5 + y, 1, 1);
        g2d.fillRect(100 + x, 7 + y, 1, 1);
        g2d.fillRect(104 + x, 7 + y, 1, 1);
        g2d.fillRect(107 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 35, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 34, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 8 + y, 2, 1);
        g2d.fillRect(115 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 40, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 41, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 36, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 3 + y, 1, 1);
        g2d.fillRect(116 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 40, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 4 + y, 2, 1);
        g2d.fillRect(111 + x, 6 + y, 1, 1);
        g2d.fillRect(93 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 40, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 39, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 7 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 42, 9, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 6 + y, 1, 1);
        g2d.fillRect(108 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 42, 12, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 4 + y, 2, 1);
        g2d.fillRect(105 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 6 + y, 1, 1);
        g2d.fillRect(119 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 41, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 4 + y, 1, 1);
        g2d.fillRect(114 + x, 4 + y, 1, 1);
        g2d.fillRect(107 + x, 6 + y, 1, 1);
        g2d.fillRect(100 + x, 8 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 3 + y, 1, 1);
        g2d.fillRect(123 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 35, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 7 + y, 1, 1);
        g2d.fillRect(123 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 43, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 7 + y, 1, 1);
        g2d.fillRect(118 + x, 7 + y, 1, 1);
        g2d.fillRect(105 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 33, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 43, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 0 + y, 4, 1);
        g2d.fillRect(113 + x, 0 + y, 3, 1);
        g2d.fillRect(104 + x, 1 + y, 2, 1);
        g2d.fillRect(110 + x, 1 + y, 3, 1);
        g2d.fillRect(116 + x, 1 + y, 2, 1);
        g2d.fillRect(102 + x, 2 + y, 2, 1);
        g2d.fillRect(118 + x, 2 + y, 1, 1);
        g2d.fillRect(99 + x, 3 + y, 3, 1);
        g2d.fillRect(119 + x, 3 + y, 1, 1);
        g2d.fillRect(96 + x, 4 + y, 3, 1);
        g2d.fillRect(120 + x, 4 + y, 1, 1);
        g2d.fillRect(93 + x, 5 + y, 3, 1);
        g2d.fillRect(121 + x, 5 + y, 1, 1);
        g2d.fillRect(92 + x, 6 + y, 1, 1);
        g2d.fillRect(94 + x, 6 + y, 1, 3);
        g2d.fillRect(122 + x, 6 + y, 2, 1);
        g2d.fillRect(91 + x, 7 + y, 1, 4);
        g2d.fillRect(93 + x, 9 + y, 1, 2);
        g2d.fillRect(92 + x, 11 + y, 1, 3);
        g2d.fillRect(91 + x, 14 + y, 1, 5);
        g2d.fillRect(92 + x, 19 + y, 1, 2);
        g2d.fillRect(93 + x, 21 + y, 1, 5);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(94 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 42, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 6 + y, 1, 1);
        g2d.fillRect(111 + x, 7 + y, 1, 1);
        g2d.fillRect(117 + x, 7 + y, 1, 1);
        g2d.fillRect(119 + x, 7 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 5 + y, 1, 1);
        g2d.fillRect(122 + x, 7 + y, 1, 1);
        g2d.fillRect(124 + x, 9 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 39, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 5 + y, 1, 1);
        g2d.fillRect(106 + x, 9 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 9 + y, 1, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 3 + y, 1, 1);
        g2d.fillRect(96 + x, 9 + y, 1, 1);
        g2d.fillRect(103 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 41, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 2 + y, 1, 1);
        g2d.fillRect(123 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 35, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 45, 12, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 8 + y, 1, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 1);
        g2d.fillRect(113 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 41, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 42, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 5 + y, 1, 1);
        g2d.fillRect(110 + x, 7 + y, 1, 1);
        g2d.fillRect(115 + x, 7 + y, 1, 1);
        g2d.fillRect(106 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 34, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 43, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 3 + y, 1, 1);
        g2d.fillRect(115 + x, 6 + y, 1, 1);
        g2d.fillRect(124 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(88, 43, 12, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 15 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 37, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 9 + y, 1, 1);
        g2d.fillRect(123 + x, 18 + y, 1, 1);
        g2d.fillRect(122 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 45, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 3 + y, 1, 1);
        g2d.fillRect(102 + x, 4 + y, 1, 1);
        g2d.fillRect(108 + x, 7 + y, 1, 1);
        g2d.fillRect(120 + x, 7 + y, 1, 1);
        g2d.fillRect(97 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 2 + y, 1, 1);
        g2d.fillRect(97 + x, 11 + y, 1, 1);
        g2d.fillRect(124 + x, 23 + y, 1, 2);
        g2d.fillRect(120 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 43, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 2 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 41, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 4 + y, 1, 1);
        g2d.fillRect(123 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 41, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 3 + y, 1, 1);
        g2d.fillRect(124 + x, 17 + y, 1, 1);
        g2d.fillRect(123 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 41, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 47, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 8 + y, 1, 1);
        g2d.fillRect(125 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 6 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 40, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 44, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 43, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 3 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 37, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 13 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 38, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 4 + y, 1, 1);
        g2d.fillRect(97 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 38, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 40, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 45, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 8 + y, 1, 1);
        g2d.fillRect(124 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 44, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 15 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 43, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 18 + y, 1, 1);
        g2d.fillRect(124 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 42, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 6 + y, 1, 1);
        g2d.fillRect(93 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 45, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 4 + y, 1, 1);
        g2d.fillRect(119 + x, 4 + y, 1, 1);
        g2d.fillRect(109 + x, 7 + y, 1, 1);
        g2d.fillRect(124 + x, 15 + y, 1, 1);
        g2d.fillRect(125 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 45, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 42, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 14 + y, 1, 1);
        g2d.fillRect(124 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 45, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 42, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 13, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 7 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 40, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 2 + y, 1, 1);
        g2d.fillRect(119 + x, 10 + y, 1, 1);
        g2d.fillRect(120 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 8 + y, 2, 1);
        g2d.fillRect(124 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 48, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 3 + y, 1, 1);
        g2d.fillRect(125 + x, 21 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 40, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 1 + y, 1, 1);
        g2d.fillRect(104 + x, 3 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 47, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 6 + y, 1, 1);
        g2d.fillRect(123 + x, 27 + y, 1, 1);
        g2d.fillRect(103 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 45, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 9 + y, 1, 1);
        g2d.fillRect(99 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 44, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 41, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 48, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 49, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 15 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 1);
        g2d.fillRect(123 + x, 22 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 48, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 2 + y, 1, 1);
        g2d.fillRect(99 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 50, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 49, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 5 + y, 1, 1);
        g2d.fillRect(113 + x, 8 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(120 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 53, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 46, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 3 + y, 1, 1);
        g2d.fillRect(98 + x, 5 + y, 1, 1);
        g2d.fillRect(114 + x, 9 + y, 1, 1);
        g2d.fillRect(96 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 51, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 51, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 8 + y, 1, 1);
        g2d.fillRect(121 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 49, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 10 + y, 1, 1);
        g2d.fillRect(121 + x, 12 + y, 1, 1);
        g2d.fillRect(123 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(103 + x, 28 + y, 1, 1);
        g2d.fillRect(102 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 50, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 53, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 5 + y, 1, 1);
        g2d.fillRect(122 + x, 8 + y, 1, 1);
        g2d.fillRect(99 + x, 10 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(122 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 45, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 1 + y, 1, 1);
        g2d.fillRect(111 + x, 2 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 54, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 6 + y, 1, 1);
        g2d.fillRect(94 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 53, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 53, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 4 + y, 1, 1);
        g2d.fillRect(114 + x, 8 + y, 1, 1);
        g2d.fillRect(120 + x, 8 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 55, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 13 + y, 1, 1);
        g2d.fillRect(123 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 51, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 9 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 55, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 55, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 2 + y, 1, 1);
        g2d.fillRect(115 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 5 + y, 1, 1);
        g2d.fillRect(119 + x, 5 + y, 1, 1);
        g2d.fillRect(116 + x, 9 + y, 1, 1);
        g2d.fillRect(93 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 57, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 2 + y, 1, 1);
        g2d.fillRect(112 + x, 4 + y, 1, 1);
        g2d.fillRect(103 + x, 5 + y, 1, 1);
        g2d.fillRect(124 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 52, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 2 + y, 1, 1);
        g2d.fillRect(123 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 57, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 57, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(106, 58, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100, 55, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(124 + x, 19 + y, 1, 1);
        g2d.fillRect(123 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 6 + y, 1, 1);
        g2d.fillRect(95 + x, 10 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 59, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 9 + y, 1, 1);
        g2d.fillRect(109 + x, 9 + y, 1, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 60, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 6 + y, 1, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 59, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 1 + y, 4, 1);
        g2d.fillRect(93 + x, 11 + y, 1, 1);
        g2d.fillRect(123 + x, 12 + y, 1, 1);
        g2d.fillRect(92 + x, 14 + y, 1, 1);
        g2d.fillRect(92 + x, 16 + y, 1, 3);
        g2d.fillRect(93 + x, 19 + y, 1, 2);
        g2d.fillRect(94 + x, 21 + y, 1, 5);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 62, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(122 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 11 + y, 2, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 59, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 60, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 7 + y, 1, 1);
        g2d.fillRect(114 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 56, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 2 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 10 + y, 1, 1);
        g2d.fillRect(122 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 59, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103, 60, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 9 + y, 1, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 58, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 27 + y, 1, 1);
        g2d.fillRect(98 + x, 28 + y, 1, 1);
        g2d.fillRect(98 + x, 30 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(106, 61, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(110, 65, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 6 + y, 1, 1);
        g2d.fillRect(93 + x, 12 + y, 1, 1);
        g2d.fillRect(125 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 63, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(110, 59, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 49, 63, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112, 63, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 11 + y, 1, 1);
        g2d.fillRect(122 + x, 16 + y, 1, 1);
        g2d.fillRect(123 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 63, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 62, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 6 + y, 1, 1);
        g2d.fillRect(97 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 65, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 6 + y, 1, 1);
        g2d.fillRect(118 + x, 11 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(125 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 59, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117, 65, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 8 + y, 1, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 7 + y, 1, 1);
        g2d.fillRect(98 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 69, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 70, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 7 + y, 1, 1);
        g2d.fillRect(119 + x, 9 + y, 1, 1);
        g2d.fillRect(99 + x, 29 + y, 1, 1);
        g2d.fillRect(103 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(118, 69, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(114, 70, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 5 + y, 1, 1);
        g2d.fillRect(94 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 69, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 6 + y, 1, 1);
        g2d.fillRect(125 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 69, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 63, 61, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 70, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 5 + y, 1, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 74, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 72, 55, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 75, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 5 + y, 1, 1);
        g2d.fillRect(102 + x, 5 + y, 1, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(94 + x, 16 + y, 1, 2);
        g2d.fillRect(95 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126, 73, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 2 + y, 3, 1);
        g2d.fillRect(96 + x, 10 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124, 77, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 3 + y, 1, 1);
        g2d.fillRect(103 + x, 4 + y, 1, 1);
        g2d.fillRect(113 + x, 4 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128, 78, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 77, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 77, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 9 + y, 1, 1);
        g2d.fillRect(126 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 77, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 10 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 79, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 26 + y, 2, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 79, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122, 76, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 1);
        g2d.fillRect(102 + x, 28 + y, 1, 1);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(101 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(135, 83, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 10 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134, 79, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 82, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 2, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 71, 58, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 5 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 85, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(126 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 88, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 11 + y, 1, 1);
        g2d.fillRect(122 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 87, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144, 89, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 87, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(145, 91, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 10 + y, 1, 1);
        g2d.fillRect(121 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 91, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(146, 94, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 13 + y, 1, 2);
        g2d.fillRect(123 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(150, 93, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(121 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148, 94, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(93 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 94, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 11 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 99, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142, 88, 78, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164, 107, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134, 103, 83, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168, 110, 46, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 31 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 95, 86, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 1 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(59, 28, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 41 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 36, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 40, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 32, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 39 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 40, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 42 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 43, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 38 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 40 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 45, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 41, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 43, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 42, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 38 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 41, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 40 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 48, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 39 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 49, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 49, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 31 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100, 53, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 45, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112, 63, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 30 + y, 1, 1);
        g2d.fillRect(123 + x, 31 + y, 1, 1);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 64, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 69, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 42 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 88, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 43 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 88, 45, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 41 + y, 1, 1);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 26, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 29, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 28, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 26, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 9 + y, 2, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 28, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 33, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 33, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(63, 30, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 31, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 10 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(59, 28, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 35, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 37, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 32, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 30, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 32, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 27 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 40, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 41, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 35, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 33, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 42, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 32, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 2);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 39, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 41, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 43, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 37, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 45, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 41, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 43, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 41, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 41, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 41, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 40, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 44, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 43, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 37, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 38, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 40, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 45, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 43, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 45, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 42, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(87, 46, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 43, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 42, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 13, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 40, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 40, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 11 + y, 2, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 47, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 43, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 44, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 48, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(88, 49, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 49, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 40, 48, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 48, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 2, 1);
        g2d.fillRect(106 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 50, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 49, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98, 49, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 46, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 46, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 51, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 51, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 49, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 50, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 53, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 45, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 54, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 53, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 55, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 55, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 52, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100, 55, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 60, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 56, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109, 61, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103, 60, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 58, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(106, 61, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 63, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 62, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 64, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 59, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 26 + y, 1, 6);
        g2d.fillRect(109 + x, 27 + y, 1, 1);
        g2d.fillRect(108 + x, 28 + y, 1, 1);
        g2d.fillRect(106 + x, 29 + y, 2, 1);
        g2d.fillRect(104 + x, 30 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 63, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 27 + y, 1, 1);
        g2d.fillRect(107 + x, 28 + y, 1, 1);
        g2d.fillRect(104 + x, 29 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 65, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 59, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117, 65, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(114, 69, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 62, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 67, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 70, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(118, 69, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 69, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 69, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 70, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 74, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 75, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126, 73, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126, 77, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128, 78, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 77, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 77, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130, 78, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 79, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 79, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 16 + y, 2, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122, 76, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(135, 83, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 82, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 85, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(108 + x, 26 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 83, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 88, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(141, 85, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 87, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);
        g2d.fillRect(103 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(145, 91, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 91, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147, 95, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(146, 94, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(150, 93, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148, 94, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 94, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 99, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(161, 104, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 14 + y, 2, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164, 107, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168, 110, 46, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 3);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(54, 26, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 7 + y, 1, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 2);
        g2d.fillRect(114 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 29, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 6 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 27, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 30, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(113 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 28, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 35, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 5 + y, 1, 1);
        g2d.fillRect(112 + x, 8 + y, 1, 1);
        g2d.fillRect(115 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 33, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 4 + y, 1, 1);
        g2d.fillRect(105 + x, 5 + y, 1, 1);
        g2d.fillRect(112 + x, 6 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 1);
        g2d.fillRect(115 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 33, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 3 + y, 1, 1);
        g2d.fillRect(108 + x, 4 + y, 1, 1);
        g2d.fillRect(116 + x, 9 + y, 1, 1);
        g2d.fillRect(112 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 2 + y, 1, 1);
        g2d.fillRect(98 + x, 3 + y, 1, 1);
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 36, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 5 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(63, 30, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 36, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 8 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 33, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 6 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 6 + y, 1, 1);
        g2d.fillRect(112 + x, 7 + y, 1, 1);
        g2d.fillRect(116 + x, 8 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 35, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 6 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 31, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 3 + y, 1, 1);
        g2d.fillRect(99 + x, 4 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(59, 28, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 38, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 6 + y, 1, 1);
        g2d.fillRect(109 + x, 6 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 35, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 4 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 3 + y, 1, 1);
        g2d.fillRect(91 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 37, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 3 + y, 1, 1);
        g2d.fillRect(107 + x, 4 + y, 1, 1);
        g2d.fillRect(115 + x, 5 + y, 1, 1);
        g2d.fillRect(108 + x, 5 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 39, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 4 + y, 1, 1);
        g2d.fillRect(109 + x, 7 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 30, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 3 + y, 1, 1);
        g2d.fillRect(96 + x, 8 + y, 1, 1);
        g2d.fillRect(117 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 41, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 5 + y, 1, 1);
        g2d.fillRect(111 + x, 5 + y, 1, 1);
        g2d.fillRect(109 + x, 5 + y, 1, 1);
        g2d.fillRect(115 + x, 7 + y, 1, 1);
        g2d.fillRect(111 + x, 7 + y, 1, 1);
        g2d.fillRect(108 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 35, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 34, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 8 + y, 2, 1);
        g2d.fillRect(100 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 40, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 41, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 36, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 3 + y, 1, 1);
        g2d.fillRect(99 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 40, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 4 + y, 2, 1);
        g2d.fillRect(104 + x, 6 + y, 1, 1);
        g2d.fillRect(122 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 40, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 39, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 7 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 42, 9, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 6 + y, 1, 1);
        g2d.fillRect(107 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 42, 12, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 4 + y, 2, 1);
        g2d.fillRect(110 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 6 + y, 1, 1);
        g2d.fillRect(96 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 41, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 4 + y, 1, 1);
        g2d.fillRect(101 + x, 4 + y, 1, 1);
        g2d.fillRect(108 + x, 6 + y, 1, 1);
        g2d.fillRect(115 + x, 8 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 3 + y, 1, 1);
        g2d.fillRect(92 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 35, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 7 + y, 1, 1);
        g2d.fillRect(92 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 43, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 7 + y, 1, 1);
        g2d.fillRect(97 + x, 7 + y, 1, 1);
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 33, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 43, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 0 + y, 4, 1);
        g2d.fillRect(100 + x, 0 + y, 3, 1);
        g2d.fillRect(110 + x, 1 + y, 2, 1);
        g2d.fillRect(103 + x, 1 + y, 3, 1);
        g2d.fillRect(98 + x, 1 + y, 2, 1);
        g2d.fillRect(112 + x, 2 + y, 2, 1);
        g2d.fillRect(97 + x, 2 + y, 1, 1);
        g2d.fillRect(114 + x, 3 + y, 3, 1);
        g2d.fillRect(96 + x, 3 + y, 1, 1);
        g2d.fillRect(117 + x, 4 + y, 3, 1);
        g2d.fillRect(95 + x, 4 + y, 1, 1);
        g2d.fillRect(120 + x, 5 + y, 3, 1);
        g2d.fillRect(94 + x, 5 + y, 1, 1);
        g2d.fillRect(123 + x, 6 + y, 1, 1);
        g2d.fillRect(121 + x, 6 + y, 1, 3);
        g2d.fillRect(92 + x, 6 + y, 2, 1);
        g2d.fillRect(124 + x, 7 + y, 1, 4);
        g2d.fillRect(122 + x, 9 + y, 1, 2);
        g2d.fillRect(123 + x, 11 + y, 1, 3);
        g2d.fillRect(124 + x, 14 + y, 1, 5);
        g2d.fillRect(123 + x, 19 + y, 1, 2);
        g2d.fillRect(122 + x, 21 + y, 1, 5);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 1);
        g2d.fillRect(120 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 42, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 6 + y, 1, 1);
        g2d.fillRect(104 + x, 7 + y, 1, 1);
        g2d.fillRect(98 + x, 7 + y, 1, 1);
        g2d.fillRect(96 + x, 7 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 5 + y, 1, 1);
        g2d.fillRect(93 + x, 7 + y, 1, 1);
        g2d.fillRect(91 + x, 9 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 39, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 5 + y, 1, 1);
        g2d.fillRect(109 + x, 9 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 9 + y, 1, 1);
        g2d.fillRect(98 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 3 + y, 1, 1);
        g2d.fillRect(119 + x, 9 + y, 1, 1);
        g2d.fillRect(112 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 41, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 2 + y, 1, 1);
        g2d.fillRect(92 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 35, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 45, 12, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 8 + y, 1, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 1);
        g2d.fillRect(102 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 41, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 42, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 5 + y, 1, 1);
        g2d.fillRect(105 + x, 7 + y, 1, 1);
        g2d.fillRect(100 + x, 7 + y, 1, 1);
        g2d.fillRect(109 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 34, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 43, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 3 + y, 1, 1);
        g2d.fillRect(100 + x, 6 + y, 1, 1);
        g2d.fillRect(91 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(88, 43, 12, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 15 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 37, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 9 + y, 1, 1);
        g2d.fillRect(92 + x, 18 + y, 1, 1);
        g2d.fillRect(93 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 45, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 3 + y, 1, 1);
        g2d.fillRect(113 + x, 4 + y, 1, 1);
        g2d.fillRect(107 + x, 7 + y, 1, 1);
        g2d.fillRect(95 + x, 7 + y, 1, 1);
        g2d.fillRect(118 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 2 + y, 1, 1);
        g2d.fillRect(118 + x, 11 + y, 1, 1);
        g2d.fillRect(91 + x, 23 + y, 1, 2);
        g2d.fillRect(95 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 43, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 2 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 41, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 4 + y, 1, 1);
        g2d.fillRect(92 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 41, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 3 + y, 1, 1);
        g2d.fillRect(91 + x, 17 + y, 1, 1);
        g2d.fillRect(92 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 41, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 47, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 8 + y, 1, 1);
        g2d.fillRect(90 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 6 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 40, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 44, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 43, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 3 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 37, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 13 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 38, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 4 + y, 1, 1);
        g2d.fillRect(118 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 38, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 40, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 45, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 8 + y, 1, 1);
        g2d.fillRect(91 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 44, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 15 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 43, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 18 + y, 1, 1);
        g2d.fillRect(91 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 42, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 6 + y, 1, 1);
        g2d.fillRect(122 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 45, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 4 + y, 1, 1);
        g2d.fillRect(96 + x, 4 + y, 1, 1);
        g2d.fillRect(106 + x, 7 + y, 1, 1);
        g2d.fillRect(91 + x, 15 + y, 1, 1);
        g2d.fillRect(90 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 45, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 42, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 14 + y, 1, 1);
        g2d.fillRect(91 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 45, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 42, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 13, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 7 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 40, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 2 + y, 1, 1);
        g2d.fillRect(96 + x, 10 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 8 + y, 2, 1);
        g2d.fillRect(91 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 48, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 3 + y, 1, 1);
        g2d.fillRect(90 + x, 21 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 40, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 1 + y, 1, 1);
        g2d.fillRect(111 + x, 3 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 47, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 6 + y, 1, 1);
        g2d.fillRect(92 + x, 27 + y, 1, 1);
        g2d.fillRect(112 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 45, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 9 + y, 1, 1);
        g2d.fillRect(116 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 44, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 41, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 48, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 49, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 15 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(92 + x, 22 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 48, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 2 + y, 1, 1);
        g2d.fillRect(116 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 50, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 49, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 5 + y, 1, 1);
        g2d.fillRect(102 + x, 8 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 1);
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(95 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 53, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 46, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 3 + y, 1, 1);
        g2d.fillRect(117 + x, 5 + y, 1, 1);
        g2d.fillRect(101 + x, 9 + y, 1, 1);
        g2d.fillRect(119 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 51, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 51, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 8 + y, 1, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 49, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 10 + y, 1, 1);
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(92 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 28 + y, 1, 1);
        g2d.fillRect(113 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 50, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 53, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 5 + y, 1, 1);
        g2d.fillRect(93 + x, 8 + y, 1, 1);
        g2d.fillRect(116 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(93 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 45, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 1 + y, 1, 1);
        g2d.fillRect(104 + x, 2 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 54, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 6 + y, 1, 1);
        g2d.fillRect(121 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 53, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 53, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 4 + y, 1, 1);
        g2d.fillRect(101 + x, 8 + y, 1, 1);
        g2d.fillRect(95 + x, 8 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 55, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 13 + y, 1, 1);
        g2d.fillRect(92 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 51, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 9 + y, 1, 1);
        g2d.fillRect(120 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 55, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 55, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 2 + y, 1, 1);
        g2d.fillRect(100 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 5 + y, 1, 1);
        g2d.fillRect(96 + x, 5 + y, 1, 1);
        g2d.fillRect(99 + x, 9 + y, 1, 1);
        g2d.fillRect(122 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 57, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 2 + y, 1, 1);
        g2d.fillRect(103 + x, 4 + y, 1, 1);
        g2d.fillRect(112 + x, 5 + y, 1, 1);
        g2d.fillRect(91 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 52, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 2 + y, 1, 1);
        g2d.fillRect(92 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 57, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 57, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(106, 58, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100, 55, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(91 + x, 19 + y, 1, 1);
        g2d.fillRect(92 + x, 28 + y, 1, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 6 + y, 1, 1);
        g2d.fillRect(120 + x, 10 + y, 1, 1);
        g2d.fillRect(93 + x, 17 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 59, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 9 + y, 1, 1);
        g2d.fillRect(106 + x, 9 + y, 1, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 60, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 6 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 59, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 1 + y, 4, 1);
        g2d.fillRect(122 + x, 11 + y, 1, 1);
        g2d.fillRect(92 + x, 12 + y, 1, 1);
        g2d.fillRect(123 + x, 14 + y, 1, 1);
        g2d.fillRect(123 + x, 16 + y, 1, 3);
        g2d.fillRect(122 + x, 19 + y, 1, 2);
        g2d.fillRect(121 + x, 21 + y, 1, 5);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 62, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 8 + y, 1, 1);
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(93 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 11 + y, 2, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 59, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 60, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 7 + y, 1, 1);
        g2d.fillRect(101 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 56, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 2 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 10 + y, 1, 1);
        g2d.fillRect(93 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 59, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103, 60, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 9 + y, 1, 1);
        g2d.fillRect(121 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 58, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(117 + x, 28 + y, 1, 1);
        g2d.fillRect(117 + x, 30 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(106, 61, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(110, 65, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 6 + y, 1, 1);
        g2d.fillRect(122 + x, 12 + y, 1, 1);
        g2d.fillRect(90 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 63, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(110, 59, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 49, 63, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112, 63, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 11 + y, 1, 1);
        g2d.fillRect(93 + x, 16 + y, 1, 1);
        g2d.fillRect(92 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 63, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 62, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 6 + y, 1, 1);
        g2d.fillRect(118 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 65, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 6 + y, 1, 1);
        g2d.fillRect(97 + x, 11 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(90 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 59, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117, 65, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 8 + y, 1, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 2);
        g2d.fillRect(113 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 7 + y, 1, 1);
        g2d.fillRect(117 + x, 7 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 69, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 70, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 7 + y, 1, 1);
        g2d.fillRect(96 + x, 9 + y, 1, 1);
        g2d.fillRect(116 + x, 29 + y, 1, 1);
        g2d.fillRect(112 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(118, 69, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(114, 70, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 5 + y, 1, 1);
        g2d.fillRect(121 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 69, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 6 + y, 1, 1);
        g2d.fillRect(90 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 69, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 5 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 63, 61, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 70, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 5 + y, 1, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 74, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 72, 55, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 8 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 75, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 5 + y, 1, 1);
        g2d.fillRect(113 + x, 5 + y, 1, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(121 + x, 16 + y, 1, 2);
        g2d.fillRect(120 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126, 73, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 2 + y, 3, 1);
        g2d.fillRect(119 + x, 10 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(124, 77, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 3 + y, 1, 1);
        g2d.fillRect(112 + x, 4 + y, 1, 1);
        g2d.fillRect(102 + x, 4 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128, 78, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 77, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 77, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 9 + y, 1, 1);
        g2d.fillRect(89 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(94 + x, 25 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 77, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 10 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 79, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 26 + y, 2, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 79, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122, 76, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(105 + x, 9 + y, 1, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 1);
        g2d.fillRect(113 + x, 28 + y, 1, 1);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(114 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(135, 83, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 10 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134, 79, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 82, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 26 + y, 2, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 71, 58, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 5 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 85, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(89 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 88, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 11 + y, 1, 1);
        g2d.fillRect(93 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 87, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144, 89, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 87, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(145, 91, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 10 + y, 1, 1);
        g2d.fillRect(94 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 91, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(146, 94, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 13 + y, 1, 2);
        g2d.fillRect(92 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(150, 93, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(94 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148, 94, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 12 + y, 1, 1);
        g2d.fillRect(122 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 94, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 11 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 99, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(142, 88, 78, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 6 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164, 107, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134, 103, 83, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168, 110, 46, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 31 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 95, 86, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 1 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(59, 28, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 41 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 36, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 40, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 32, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 39 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 40, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 42 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 43, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 38 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 40 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 45, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 41, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 43, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 42, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 38 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 41, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 40 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 48, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 39 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 49, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 49, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 31 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100, 53, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 45, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(112, 63, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 30 + y, 1, 1);
        g2d.fillRect(92 + x, 31 + y, 1, 1);
        g2d.fillRect(115 + x, 35 + y, 1, 1);
        g2d.fillRect(96 + x, 36 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 64, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 69, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 42 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 88, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 43 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 88, 45, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 41 + y, 1, 1);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 26, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 9 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 29, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 28, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 26, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 9 + y, 2, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58, 28, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 10 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 33, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 33, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 9 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(63, 30, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 34, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62, 31, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 10 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(59, 28, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 35, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 11 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 31, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 37, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 11 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 32, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 30, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 12 + y, 2, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 36, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(69, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 33, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 32, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 27 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75, 40, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 10 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 41, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 35, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(67, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70, 35, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(65, 33, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 42, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 32, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 2);
        g2d.fillRect(99 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 39, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 34, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 33, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 38, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 16 + y, 2, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 41, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 43, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 37, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 45, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 41, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 37, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 43, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 41, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 41, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 41, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(77, 40, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 40, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84, 44, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 43, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(72, 37, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 38, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 40, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 45, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 43, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 45, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 42, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(87, 46, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 43, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(81, 42, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 13, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(78, 40, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 46, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(73, 40, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 11 + y, 2, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 47, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 44, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 46, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 43, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 44, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 48, 17, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 24 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(88, 49, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 49, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 40, 48, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(97, 48, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 2, 1);
        g2d.fillRect(109 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 50, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 47, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 49, 14, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98, 49, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86, 46, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83, 46, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 51, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(92, 51, 23, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91, 49, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 50, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 53, 18, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 45, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(94, 54, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 16 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 53, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 55, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 55, 22, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(101, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89, 52, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(100, 55, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 60, 19, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 20 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109, 58, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 56, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(109, 61, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(96, 54, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103, 60, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 58, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(106, 61, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 63, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 13 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 62, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 64, 20, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 59, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 26 + y, 1, 6);
        g2d.fillRect(106 + x, 27 + y, 1, 1);
        g2d.fillRect(107 + x, 28 + y, 1, 1);
        g2d.fillRect(108 + x, 29 + y, 2, 1);
        g2d.fillRect(110 + x, 30 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 63, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 27 + y, 1, 1);
        g2d.fillRect(108 + x, 28 + y, 1, 1);
        g2d.fillRect(110 + x, 29 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 65, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 59, 40, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117, 65, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(114, 69, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 62, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 67, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 70, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 66, 39, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(118, 69, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 69, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 69, 32, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(113, 70, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 74, 26, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 75, 27, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 19 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126, 73, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(126, 77, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(128, 78, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 77, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(125, 77, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(130, 78, 30, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 79, 29, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(129, 79, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 16 + y, 2, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(122, 76, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(135, 83, 31, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 82, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(137, 85, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(107 + x, 26 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131, 83, 43, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 83, 36, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 88, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(141, 85, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 87, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(145, 91, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 91, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147, 95, 35, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(146, 94, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(150, 93, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148, 94, 42, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 94, 37, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 99, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(161, 104, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 14 + y, 2, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164, 107, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168, 110, 46, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 3);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
    }
}
