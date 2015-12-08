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
public class Mask2 extends SuperTL {

    int direction = 0;

    public Mask2() {
        super();
    }

    public Mask2(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm, int eye) {
        step = s;
        this.direction = direction;
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintFront(offsetX, offsetY, g2d);
        if (direction == 1) {
            if(offsetY < 0)
                paintMask2(offsetX, 0, g2d);
            else
                paintMask1(offsetX, 0, g2d);
        } else {
            if(offsetY < 0)
                paintBackMask2(offsetX, 0, g2d);
            else
                paintBackMask1(offsetX, 0, g2d);
        }
    }

    public void paintMask2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 12 + y, 4, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 13 + y, 1, 3);
        g2d.fillRect(105 + x, 13 + y, 3, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 2);
        g2d.fillRect(121 + x, 13 + y, 1, 4);
        g2d.fillRect(122 + x, 13 + y, 1, 3);
        g2d.fillRect(104 + x, 14 + y, 1, 5);
        g2d.fillRect(106 + x, 14 + y, 4, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 3);
        g2d.fillRect(118 + x, 14 + y, 1, 2);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(123 + x, 14 + y, 1, 2);
        g2d.fillRect(124 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 2, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 2);
        g2d.fillRect(119 + x, 17 + y, 1, 4);
        g2d.fillRect(118 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 30 + y, 7, 1);
        g2d.fillRect(108 + x, 31 + y, 4, 1);
        g2d.fillRect(117 + x, 31 + y, 6, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 2);
        g2d.fillRect(103 + x, 32 + y, 5, 1);
        g2d.fillRect(114 + x, 32 + y, 3, 1);
        g2d.fillRect(101 + x, 33 + y, 1, 1);
        g2d.fillRect(117 + x, 33 + y, 5, 1);
        g2d.fillRect(122 + x, 34 + y, 2, 1);
        g2d.fillRect(124 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 31 + y, 1, 2);
        g2d.fillRect(113 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 2);
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
    }

    public void paintMask1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 13 + y, 4, 1);
        g2d.fillRect(102 + x, 14 + y, 2, 1);
        g2d.fillRect(105 + x, 14 + y, 5, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 2);
        g2d.fillRect(121 + x, 14 + y, 1, 3);
        g2d.fillRect(122 + x, 14 + y, 1, 3);
        g2d.fillRect(103 + x, 15 + y, 2, 1);
        g2d.fillRect(108 + x, 15 + y, 2, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(117 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 2, 1);
        g2d.fillRect(123 + x, 15 + y, 1, 2);
        g2d.fillRect(124 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 3);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 4);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 29 + y, 3, 1);
        g2d.fillRect(104 + x, 30 + y, 4, 1);
        g2d.fillRect(120 + x, 30 + y, 3, 1);
        g2d.fillRect(108 + x, 31 + y, 4, 1);
        g2d.fillRect(117 + x, 31 + y, 3, 1);
        g2d.fillRect(102 + x, 32 + y, 6, 1);
        g2d.fillRect(114 + x, 32 + y, 3, 1);
        g2d.fillRect(100 + x, 33 + y, 2, 1);
        g2d.fillRect(117 + x, 33 + y, 5, 1);
        g2d.fillRect(122 + x, 34 + y, 2, 1);
        g2d.fillRect(124 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 31 + y, 1, 2);
        g2d.fillRect(113 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 3, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 2);
        g2d.fillRect(119 + x, 16 + y, 2, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
    }

    public void paintBackMask2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 12 + y, 4, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 1, 3);
        g2d.fillRect(108 + x, 13 + y, 3, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 2);
        g2d.fillRect(94 + x, 13 + y, 1, 4);
        g2d.fillRect(93 + x, 13 + y, 1, 3);
        g2d.fillRect(111 + x, 14 + y, 1, 5);
        g2d.fillRect(106 + x, 14 + y, 4, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 3);
        g2d.fillRect(97 + x, 14 + y, 1, 2);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(92 + x, 14 + y, 1, 2);
        g2d.fillRect(91 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 2, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 2);
        g2d.fillRect(96 + x, 17 + y, 1, 4);
        g2d.fillRect(97 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 30 + y, 7, 1);
        g2d.fillRect(104 + x, 31 + y, 4, 1);
        g2d.fillRect(93 + x, 31 + y, 6, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 2);
        g2d.fillRect(108 + x, 32 + y, 5, 1);
        g2d.fillRect(99 + x, 32 + y, 3, 1);
        g2d.fillRect(114 + x, 33 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 5, 1);
        g2d.fillRect(92 + x, 34 + y, 2, 1);
        g2d.fillRect(91 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 31 + y, 1, 2);
        g2d.fillRect(102 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 2);
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
    }

    public void paintBackMask1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 13 + y, 4, 1);
        g2d.fillRect(112 + x, 14 + y, 2, 1);
        g2d.fillRect(106 + x, 14 + y, 5, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 2);
        g2d.fillRect(94 + x, 14 + y, 1, 3);
        g2d.fillRect(93 + x, 14 + y, 1, 3);
        g2d.fillRect(111 + x, 15 + y, 2, 1);
        g2d.fillRect(106 + x, 15 + y, 2, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(98 + x, 15 + y, 1, 2);
        g2d.fillRect(96 + x, 15 + y, 2, 1);
        g2d.fillRect(92 + x, 15 + y, 1, 2);
        g2d.fillRect(91 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 3);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 4);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 29 + y, 3, 1);
        g2d.fillRect(108 + x, 30 + y, 4, 1);
        g2d.fillRect(93 + x, 30 + y, 3, 1);
        g2d.fillRect(104 + x, 31 + y, 4, 1);
        g2d.fillRect(96 + x, 31 + y, 3, 1);
        g2d.fillRect(108 + x, 32 + y, 6, 1);
        g2d.fillRect(99 + x, 32 + y, 3, 1);
        g2d.fillRect(114 + x, 33 + y, 2, 1);
        g2d.fillRect(94 + x, 33 + y, 5, 1);
        g2d.fillRect(92 + x, 34 + y, 2, 1);
        g2d.fillRect(91 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 31 + y, 1, 2);
        g2d.fillRect(102 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 3, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 2);
        g2d.fillRect(95 + x, 16 + y, 2, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(102, 102, 102));
        COLORS.set(ImageUtilities.GREY, new Color(255, 63, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 191, 170));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
