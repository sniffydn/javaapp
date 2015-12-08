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
public class H19 extends SuperTL {

    int direction = 0;

    public H19() {
        super();
    }

    public H19(ColorArray colorSwitch) {
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 11 + y, 1, 2);
        g2d.fillRect(117 + x, 12 + y, 1, 5);
        g2d.fillRect(119 + x, 12 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 9);
        g2d.fillRect(120 + x, 14 + y, 1, 2);
        g2d.fillRect(121 + x, 15 + y, 1, 3);
        g2d.fillRect(122 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 18 + y, 1, 4);
        g2d.fillRect(121 + x, 19 + y, 1, 2);
        g2d.fillRect(122 + x, 20 + y, 1, 2);
        g2d.fillRect(117 + x, 22 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 2);
        g2d.fillRect(121 + x, 22 + y, 1, 4);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(122 + x, 23 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 13 + y, 1, 3);
        g2d.fillRect(119 + x, 14 + y, 1, 3);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 5);
        g2d.fillRect(117 + x, 18 + y, 1, 4);
        g2d.fillRect(119 + x, 18 + y, 1, 2);
        g2d.fillRect(120 + x, 19 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 9 + y, 1, 2);
        g2d.fillRect(107 + x, 9 + y, 10, 1);
        g2d.fillRect(104 + x, 10 + y, 1, 2);
        g2d.fillRect(105 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 5);
        g2d.fillRect(110 + x, 10 + y, 2, 1);
        g2d.fillRect(117 + x, 10 + y, 1, 2);
        g2d.fillRect(118 + x, 10 + y, 1, 1);
        g2d.fillRect(102 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 3);
        g2d.fillRect(119 + x, 11 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 4);
        g2d.fillRect(120 + x, 12 + y, 1, 2);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 11);
        g2d.fillRect(115 + x, 13 + y, 1, 5);
        g2d.fillRect(99 + x, 14 + y, 1, 4);
        g2d.fillRect(107 + x, 14 + y, 1, 3);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 3);
        g2d.fillRect(122 + x, 15 + y, 1, 1);
        g2d.fillRect(123 + x, 16 + y, 1, 10);
        g2d.fillRect(98 + x, 18 + y, 1, 3);
        g2d.fillRect(105 + x, 18 + y, 1, 3);
        g2d.fillRect(113 + x, 18 + y, 1, 6);
        g2d.fillRect(100 + x, 20 + y, 5, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 3);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 3);
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 2);
        g2d.fillRect(116 + x, 23 + y, 1, 2);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 3, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 2, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 2, 1);
        g2d.fillRect(112 + x, 27 + y, 1, 1);
        g2d.fillRect(123 + x, 27 + y, 1, 2);
        g2d.fillRect(113 + x, 28 + y, 1, 1);
        g2d.fillRect(124 + x, 28 + y, 1, 2);
        g2d.fillRect(114 + x, 29 + y, 1, 1);
        g2d.fillRect(125 + x, 29 + y, 1, 2);
        g2d.fillRect(115 + x, 30 + y, 1, 1);
        g2d.fillRect(126 + x, 30 + y, 1, 3);
        g2d.fillRect(116 + x, 31 + y, 1, 2);
        g2d.fillRect(119 + x, 31 + y, 1, 2);
        g2d.fillRect(120 + x, 31 + y, 3, 1);
        g2d.fillRect(117 + x, 32 + y, 2, 1);
        g2d.fillRect(123 + x, 32 + y, 2, 1);
        g2d.fillRect(125 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 10 + y, 2, 1);
        g2d.fillRect(112 + x, 10 + y, 1, 2);
        g2d.fillRect(113 + x, 10 + y, 1, 2);
        g2d.fillRect(114 + x, 10 + y, 1, 3);
        g2d.fillRect(115 + x, 10 + y, 1, 3);
        g2d.fillRect(116 + x, 10 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 2, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 3);
        g2d.fillRect(111 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 5);
        g2d.fillRect(100 + x, 14 + y, 1, 6);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 3);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 5);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 3);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 2, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 3);
        g2d.fillRect(104 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(120 + x, 18 + y, 2, 1);
        g2d.fillRect(101 + x, 19 + y, 3, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 2);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(122 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 2);
        g2d.fillRect(121 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(122 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 4, 1);
        g2d.fillRect(110 + x, 24 + y, 3, 1);
        g2d.fillRect(114 + x, 24 + y, 2, 1);
        g2d.fillRect(111 + x, 25 + y, 2, 1);
        g2d.fillRect(115 + x, 25 + y, 4, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 2, 1);
        g2d.fillRect(113 + x, 27 + y, 3, 1);
        g2d.fillRect(120 + x, 27 + y, 3, 1);
        g2d.fillRect(114 + x, 28 + y, 2, 1);
        g2d.fillRect(121 + x, 28 + y, 2, 1);
        g2d.fillRect(119 + x, 29 + y, 1, 2);
        g2d.fillRect(122 + x, 29 + y, 1, 2);
        g2d.fillRect(123 + x, 29 + y, 1, 3);
        g2d.fillRect(116 + x, 30 + y, 3, 1);
        g2d.fillRect(120 + x, 30 + y, 2, 1);
        g2d.fillRect(124 + x, 30 + y, 1, 2);
        g2d.fillRect(117 + x, 31 + y, 2, 1);
        g2d.fillRect(125 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 5);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 4);
        g2d.fillRect(104 + x, 15 + y, 1, 3);
        g2d.fillRect(111 + x, 15 + y, 1, 4);
        g2d.fillRect(109 + x, 16 + y, 1, 3);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 4);
        g2d.fillRect(110 + x, 14 + y, 1, 4);
        g2d.fillRect(102 + x, 15 + y, 1, 4);
        g2d.fillRect(113 + x, 24 + y, 1, 3);
        g2d.fillRect(114 + x, 25 + y, 1, 2);
        g2d.fillRect(115 + x, 26 + y, 4, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 3);
        g2d.fillRect(117 + x, 27 + y, 1, 3);
        g2d.fillRect(118 + x, 27 + y, 1, 3);
        g2d.fillRect(119 + x, 27 + y, 1, 2);
        g2d.fillRect(120 + x, 28 + y, 1, 2);
        g2d.fillRect(115 + x, 29 + y, 1, 1);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
    }

    public void paintBackH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 11 + y, 1, 2);
        g2d.fillRect(98 + x, 12 + y, 1, 5);
        g2d.fillRect(96 + x, 12 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 9);
        g2d.fillRect(95 + x, 14 + y, 1, 2);
        g2d.fillRect(94 + x, 15 + y, 1, 3);
        g2d.fillRect(93 + x, 16 + y, 1, 3);
        g2d.fillRect(100 + x, 18 + y, 1, 4);
        g2d.fillRect(94 + x, 19 + y, 1, 2);
        g2d.fillRect(93 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 22 + y, 1, 2);
        g2d.fillRect(97 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 2);
        g2d.fillRect(94 + x, 22 + y, 1, 4);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(93 + x, 23 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 13 + y, 1, 3);
        g2d.fillRect(96 + x, 14 + y, 1, 3);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 5);
        g2d.fillRect(98 + x, 18 + y, 1, 4);
        g2d.fillRect(96 + x, 18 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 9 + y, 1, 2);
        g2d.fillRect(99 + x, 9 + y, 10, 1);
        g2d.fillRect(111 + x, 10 + y, 1, 2);
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 5);
        g2d.fillRect(104 + x, 10 + y, 2, 1);
        g2d.fillRect(98 + x, 10 + y, 1, 2);
        g2d.fillRect(97 + x, 10 + y, 1, 1);
        g2d.fillRect(113 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 3);
        g2d.fillRect(96 + x, 11 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 4);
        g2d.fillRect(95 + x, 12 + y, 1, 2);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 11);
        g2d.fillRect(100 + x, 13 + y, 1, 5);
        g2d.fillRect(116 + x, 14 + y, 1, 4);
        g2d.fillRect(108 + x, 14 + y, 1, 3);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 3);
        g2d.fillRect(93 + x, 15 + y, 1, 1);
        g2d.fillRect(92 + x, 16 + y, 1, 10);
        g2d.fillRect(117 + x, 18 + y, 1, 3);
        g2d.fillRect(110 + x, 18 + y, 1, 3);
        g2d.fillRect(102 + x, 18 + y, 1, 6);
        g2d.fillRect(111 + x, 20 + y, 5, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 3);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 3);
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(105 + x, 21 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 2);
        g2d.fillRect(99 + x, 23 + y, 1, 2);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 3, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 2, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(93 + x, 26 + y, 2, 1);
        g2d.fillRect(103 + x, 27 + y, 1, 1);
        g2d.fillRect(92 + x, 27 + y, 1, 2);
        g2d.fillRect(102 + x, 28 + y, 1, 1);
        g2d.fillRect(91 + x, 28 + y, 1, 2);
        g2d.fillRect(101 + x, 29 + y, 1, 1);
        g2d.fillRect(90 + x, 29 + y, 1, 2);
        g2d.fillRect(100 + x, 30 + y, 1, 1);
        g2d.fillRect(89 + x, 30 + y, 1, 3);
        g2d.fillRect(99 + x, 31 + y, 1, 2);
        g2d.fillRect(96 + x, 31 + y, 1, 2);
        g2d.fillRect(93 + x, 31 + y, 3, 1);
        g2d.fillRect(97 + x, 32 + y, 2, 1);
        g2d.fillRect(91 + x, 32 + y, 2, 1);
        g2d.fillRect(90 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 10 + y, 2, 1);
        g2d.fillRect(103 + x, 10 + y, 1, 2);
        g2d.fillRect(102 + x, 10 + y, 1, 2);
        g2d.fillRect(101 + x, 10 + y, 1, 3);
        g2d.fillRect(100 + x, 10 + y, 1, 3);
        g2d.fillRect(99 + x, 10 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 2, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 3);
        g2d.fillRect(104 + x, 11 + y, 1, 2);
        g2d.fillRect(111 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 2, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 5);
        g2d.fillRect(115 + x, 14 + y, 1, 6);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 3);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 5);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 3);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 2, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 3);
        g2d.fillRect(111 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(94 + x, 18 + y, 2, 1);
        g2d.fillRect(112 + x, 19 + y, 3, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(93 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 2);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(93 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 4, 1);
        g2d.fillRect(103 + x, 24 + y, 3, 1);
        g2d.fillRect(100 + x, 24 + y, 2, 1);
        g2d.fillRect(103 + x, 25 + y, 2, 1);
        g2d.fillRect(97 + x, 25 + y, 4, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 26 + y, 2, 1);
        g2d.fillRect(100 + x, 27 + y, 3, 1);
        g2d.fillRect(93 + x, 27 + y, 3, 1);
        g2d.fillRect(100 + x, 28 + y, 2, 1);
        g2d.fillRect(93 + x, 28 + y, 2, 1);
        g2d.fillRect(96 + x, 29 + y, 1, 2);
        g2d.fillRect(93 + x, 29 + y, 1, 2);
        g2d.fillRect(92 + x, 29 + y, 1, 3);
        g2d.fillRect(97 + x, 30 + y, 3, 1);
        g2d.fillRect(94 + x, 30 + y, 2, 1);
        g2d.fillRect(91 + x, 30 + y, 1, 2);
        g2d.fillRect(97 + x, 31 + y, 2, 1);
        g2d.fillRect(90 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 5);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 4);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 1, 4);
        g2d.fillRect(106 + x, 16 + y, 1, 3);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 4);
        g2d.fillRect(105 + x, 14 + y, 1, 4);
        g2d.fillRect(113 + x, 15 + y, 1, 4);
        g2d.fillRect(102 + x, 24 + y, 1, 3);
        g2d.fillRect(101 + x, 25 + y, 1, 2);
        g2d.fillRect(97 + x, 26 + y, 4, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 3);
        g2d.fillRect(98 + x, 27 + y, 1, 3);
        g2d.fillRect(97 + x, 27 + y, 1, 3);
        g2d.fillRect(96 + x, 27 + y, 1, 2);
        g2d.fillRect(95 + x, 28 + y, 1, 2);
        g2d.fillRect(100 + x, 29 + y, 1, 1);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(33, 33, 33));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(99, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(156, 0, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(206, 0, 0));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 0, 0));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
