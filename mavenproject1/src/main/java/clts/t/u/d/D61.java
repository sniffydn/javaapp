/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.d;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;
import util.Color;

/**
 *
 * @author doubleD
 */
public class D61 extends SuperTU {

    int prevY = 0;
    

    {
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 14;
    }

    /** Creates a new instance of GenericClothes */
    public D61() {
        super();
    }

    public D61(String middle) {
        super(middle);
    }

    public D61(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x, 0, g2d);
        
        if (step == 1) {
            paintBL1(x, 0, g2d);
        } else if (step == 2 || step == 7) {
            paintBL2(x, 0, g2d);
        } else if (step == 3 || step == 6) {
            paintBL3(x, 0, g2d);
        } else if (step == 4 || step == 5) {
            paintBL4(x, 0, g2d);
        } else if (step == 9) {
            paintBR1(x, 0, g2d);
        } else if (step == 10 || step == 15) {
            paintBR2(x, 0, g2d);
        } else if (step == 11 || step == 14) {
            paintBR3(x, 0, g2d);
        } else if (step == 12 || step == 13) {
            paintBR4(x, 0, g2d);
        } else {
            paintBF(x, 0, g2d);
        }

    }

    public void drawB(int x, int y, GraphicsMap g2d) {
        paintTU(x, y, g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);


        drawB(x, y, g2d);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        if (prevY < 0) {
            paintB3(offsetX, 0, g2d);
        } else if (prevY > 0) {
            paintB1(offsetX, 0, g2d);
        } else {
            paintB2(offsetX, 0, g2d);
        }

        prevY = offsetY;
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {
        drawLower(offsetX, offsetY, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintTU(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 52 + y, 3, 1);
        g2d.fillRect(118 + x, 52 + y, 3, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 3, 1);
        g2d.fillRect(113 + x, 54 + y, 2, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 3, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 4, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(113 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(46, 45, 46, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(104 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(109 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 85, 87, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98, 99, 102, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(191, 192, 194, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214, 207, 207, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 51 + y, 4, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 203, 214, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(99 + x, 49 + y, 2, 1);
        g2d.fillRect(101 + x, 50 + y, 4, 1);
        g2d.fillRect(116 + x, 50 + y, 3, 1);
        g2d.fillRect(109 + x, 51 + y, 3, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 50 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 227, 227, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 235, 235, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 53 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 239, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(105 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(246, 239, 239, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 242, 249, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(109 + x, 52 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 247, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 250, 247, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(100 + x, 54 + y, 1, 4);
        g2d.fillRect(119 + x, 54 + y, 1, 4);
        g2d.fillRect(120 + x, 54 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 2, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 54 + y, 2, 1);
        g2d.fillRect(115 + x, 54 + y, 2, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
    }

    public void paintB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 163 + y, 1, 1);
        g2d.fillRect(93 + x, 166 + y, 1, 1);
        g2d.fillRect(129 + x, 166 + y, 2, 1);
        g2d.fillRect(128 + x, 167 + y, 1, 1);
        g2d.fillRect(90 + x, 168 + y, 3, 1);
        g2d.fillRect(130 + x, 169 + y, 2, 1);
        g2d.fillRect(91 + x, 170 + y, 1, 2);
        g2d.fillRect(129 + x, 170 + y, 1, 1);
        g2d.fillRect(92 + x, 171 + y, 1, 1);
        g2d.fillRect(132 + x, 171 + y, 1, 1);
        g2d.fillRect(85 + x, 172 + y, 1, 1);
        g2d.fillRect(89 + x, 172 + y, 1, 1);
        g2d.fillRect(90 + x, 173 + y, 1, 1);
        g2d.fillRect(130 + x, 173 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 170 + y, 1, 1);
        g2d.fillRect(136 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(92 + x, 165 + y, 1, 1);
        g2d.fillRect(91 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 171 + y, 1, 1);
        g2d.fillRect(131 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(91 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 166 + y, 1, 1);
        g2d.fillRect(87 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 167 + y, 1, 1);
        g2d.fillRect(133 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(130 + x, 164 + y, 1, 1);
        g2d.fillRect(132 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(135 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(128 + x, 162 + y, 1, 1);
        g2d.fillRect(86 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 169 + y, 1, 1);
        g2d.fillRect(84 + x, 171 + y, 1, 1);
        g2d.fillRect(134 + x, 171 + y, 1, 1);
        g2d.fillRect(129 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(91 + x, 164 + y, 1, 1);
        g2d.fillRect(87 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 167 + y, 1, 1);
        g2d.fillRect(89 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(132 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 85, 87, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98, 99, 102, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 106, 109, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(91 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 109, 112, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 112, 115, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(134 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172, 173, 176, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(83 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177, 178, 181, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183, 184, 187, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(132 + x, 167 + y, 1, 1);
        g2d.fillRect(79 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185, 186, 188, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(188, 189, 191, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 159 + y, 1, 1);
        g2d.fillRect(130 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(192, 192, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(191, 192, 194, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(128 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195, 195, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 196, 196, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195, 196, 198, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(81 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 199, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(131 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 195, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 122 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 199, 201, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(130 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 200, 200, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 203, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(133 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(126 + x, 151 + y, 1, 1);
        g2d.fillRect(127 + x, 155 + y, 1, 1);
        g2d.fillRect(90 + x, 157 + y, 1, 1);
        g2d.fillRect(128 + x, 159 + y, 1, 1);
        g2d.fillRect(80 + x, 170 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201, 202, 204, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 166 + y, 1, 1);
        g2d.fillRect(135 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 204, 204, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205, 206, 207, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 132 + y, 1, 2);
        g2d.fillRect(124 + x, 137 + y, 1, 2);
        g2d.fillRect(96 + x, 138 + y, 1, 1);
        g2d.fillRect(96 + x, 140 + y, 1, 2);
        g2d.fillRect(124 + x, 140 + y, 1, 4);
        g2d.fillRect(95 + x, 143 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 1);
        g2d.fillRect(125 + x, 146 + y, 1, 2);
        g2d.fillRect(92 + x, 152 + y, 1, 1);
        g2d.fillRect(126 + x, 152 + y, 1, 2);
        g2d.fillRect(91 + x, 155 + y, 1, 1);
        g2d.fillRect(127 + x, 156 + y, 1, 1);
        g2d.fillRect(93 + x, 165 + y, 1, 1);
        g2d.fillRect(84 + x, 167 + y, 1, 1);
        g2d.fillRect(83 + x, 168 + y, 1, 1);
        g2d.fillRect(82 + x, 172 + y, 1, 1);
        g2d.fillRect(89 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 208, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(137 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 210, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 157 + y, 1, 1);
        g2d.fillRect(130 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 209, 211, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(91 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 124 + y, 1, 1);
        g2d.fillRect(123 + x, 124 + y, 1, 1);
        g2d.fillRect(123 + x, 126 + y, 1, 10);
        g2d.fillRect(124 + x, 139 + y, 1, 1);
        g2d.fillRect(124 + x, 144 + y, 1, 1);
        g2d.fillRect(125 + x, 148 + y, 1, 3);
        g2d.fillRect(127 + x, 168 + y, 1, 1);
        g2d.fillRect(93 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 166 + y, 1, 1);
        g2d.fillRect(136 + x, 171 + y, 1, 1);
        g2d.fillRect(127 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 136 + y, 1, 1);
        g2d.fillRect(96 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 142 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 1, 1);
        g2d.fillRect(97 + x, 146 + y, 1, 2);
        g2d.fillRect(94 + x, 147 + y, 1, 2);
        g2d.fillRect(93 + x, 150 + y, 1, 2);
        g2d.fillRect(92 + x, 153 + y, 1, 2);
        g2d.fillRect(126 + x, 154 + y, 1, 1);
        g2d.fillRect(86 + x, 165 + y, 1, 1);
        g2d.fillRect(93 + x, 167 + y, 1, 1);
        g2d.fillRect(135 + x, 173 + y, 1, 1);
        g2d.fillRect(88 + x, 174 + y, 1, 1);
        g2d.fillRect(91 + x, 174 + y, 1, 1);
        g2d.fillRect(128 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(211, 212, 213, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 159 + y, 1, 1);
        g2d.fillRect(88 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 134 + y, 1, 2);
        g2d.fillRect(97 + x, 137 + y, 1, 1);
        g2d.fillRect(95 + x, 145 + y, 1, 1);
        g2d.fillRect(124 + x, 145 + y, 1, 1);
        g2d.fillRect(97 + x, 149 + y, 1, 2);
        g2d.fillRect(95 + x, 157 + y, 1, 1);
        g2d.fillRect(128 + x, 160 + y, 1, 1);
        g2d.fillRect(126 + x, 162 + y, 1, 1);
        g2d.fillRect(82 + x, 169 + y, 1, 1);
        g2d.fillRect(81 + x, 171 + y, 1, 1);
        g2d.fillRect(86 + x, 173 + y, 1, 1);
        g2d.fillRect(94 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 214, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(133 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 215, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(95 + x, 156 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 1, 1);
        g2d.fillRect(87 + x, 163 + y, 1, 1);
        g2d.fillRect(131 + x, 165 + y, 1, 1);
        g2d.fillRect(92 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214, 215, 215, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(89 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(203, 203, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 125 + y, 1, 6);
        g2d.fillRect(123 + x, 125 + y, 1, 1);
        g2d.fillRect(122 + x, 129 + y, 1, 1);
        g2d.fillRect(124 + x, 149 + y, 1, 1);
        g2d.fillRect(126 + x, 173 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(122 + x, 123 + y, 1, 1);
        g2d.fillRect(98 + x, 131 + y, 1, 1);
        g2d.fillRect(99 + x, 133 + y, 1, 6);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(124 + x, 148 + y, 1, 1);
        g2d.fillRect(97 + x, 151 + y, 1, 1);
        g2d.fillRect(124 + x, 151 + y, 1, 3);
        g2d.fillRect(96 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 155 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(125 + x, 156 + y, 1, 1);
        g2d.fillRect(95 + x, 158 + y, 1, 1);
        g2d.fillRect(94 + x, 159 + y, 1, 1);
        g2d.fillRect(94 + x, 163 + y, 1, 1);
        g2d.fillRect(126 + x, 164 + y, 1, 3);
        g2d.fillRect(94 + x, 166 + y, 1, 1);
        g2d.fillRect(93 + x, 169 + y, 1, 1);
        g2d.fillRect(94 + x, 172 + y, 1, 1);
        g2d.fillRect(93 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 148 + y, 1, 1);
        g2d.fillRect(124 + x, 154 + y, 1, 1);
        g2d.fillRect(126 + x, 160 + y, 1, 2);
        g2d.fillRect(126 + x, 163 + y, 1, 1);
        g2d.fillRect(133 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 122 + y, 1, 2);
        g2d.fillRect(99 + x, 123 + y, 1, 2);
        g2d.fillRect(122 + x, 124 + y, 1, 1);
        g2d.fillRect(104 + x, 126 + y, 1, 1);
        g2d.fillRect(99 + x, 131 + y, 1, 2);
        g2d.fillRect(123 + x, 136 + y, 1, 12);
        g2d.fillRect(98 + x, 139 + y, 1, 6);
        g2d.fillRect(96 + x, 153 + y, 1, 2);
        g2d.fillRect(125 + x, 157 + y, 1, 3);
        g2d.fillRect(94 + x, 160 + y, 1, 3);
        g2d.fillRect(127 + x, 169 + y, 1, 4);
        g2d.fillRect(92 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(216, 217, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 160 + y, 1, 1);
        g2d.fillRect(88 + x, 162 + y, 1, 1);
        g2d.fillRect(87 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(217, 218, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 84 + y, 1, 38);
        g2d.fillRect(102 + x, 84 + y, 1, 21);
        g2d.fillRect(120 + x, 84 + y, 1, 24);
        g2d.fillRect(100 + x, 104 + y, 1, 18);
        g2d.fillRect(121 + x, 108 + y, 1, 15);
        g2d.fillRect(99 + x, 125 + y, 1, 6);
        g2d.fillRect(122 + x, 125 + y, 1, 4);
        g2d.fillRect(122 + x, 130 + y, 1, 2);
        g2d.fillRect(124 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 165 + y, 1, 1);
        g2d.fillRect(129 + x, 165 + y, 1, 1);
        g2d.fillRect(131 + x, 166 + y, 1, 1);
        g2d.fillRect(87 + x, 169 + y, 1, 1);
        g2d.fillRect(131 + x, 170 + y, 1, 1);
        g2d.fillRect(135 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 169 + y, 1, 1);
        g2d.fillRect(128 + x, 172 + y, 1, 1);
        g2d.fillRect(84 + x, 173 + y, 2, 1);
        g2d.fillRect(87 + x, 173 + y, 1, 1);
        g2d.fillRect(134 + x, 173 + y, 1, 1);
        g2d.fillRect(132 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 227, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 227, 229, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(94 + x, 167 + y, 1, 1);
        g2d.fillRect(93 + x, 168 + y, 1, 1);
        g2d.fillRect(92 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 228, 228, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 168 + y, 1, 1);
        g2d.fillRect(130 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 164 + y, 1, 1);
        g2d.fillRect(91 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 229, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 231, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(90 + x, 160 + y, 1, 1);
        g2d.fillRect(92 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 219, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 122 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 163 + y, 1, 1);
        g2d.fillRect(130 + x, 168 + y, 1, 1);
        g2d.fillRect(84 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 226, 248, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(100 + x, 131 + y, 1, 8);
        g2d.fillRect(120 + x, 145 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 5);
        g2d.fillRect(101 + x, 150 + y, 1, 7);
        g2d.fillRect(123 + x, 151 + y, 1, 6);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 5);
        g2d.fillRect(124 + x, 156 + y, 1, 1);
        g2d.fillRect(120 + x, 158 + y, 1, 4);
        g2d.fillRect(95 + x, 159 + y, 1, 1);
        g2d.fillRect(99 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 1, 1);
        g2d.fillRect(124 + x, 162 + y, 1, 1);
        g2d.fillRect(125 + x, 163 + y, 1, 4);
        g2d.fillRect(97 + x, 165 + y, 1, 1);
        g2d.fillRect(122 + x, 165 + y, 1, 3);
        g2d.fillRect(95 + x, 166 + y, 1, 1);
        g2d.fillRect(126 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 163 + y, 1, 1);
        g2d.fillRect(128 + x, 164 + y, 1, 1);
        g2d.fillRect(90 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(81 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 224, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 84 + y, 1, 38);
        g2d.fillRect(104 + x, 84 + y, 1, 42);
        g2d.fillRect(105 + x, 84 + y, 1, 88);
        g2d.fillRect(106 + x, 84 + y, 1, 88);
        g2d.fillRect(107 + x, 84 + y, 1, 88);
        g2d.fillRect(108 + x, 84 + y, 1, 88);
        g2d.fillRect(109 + x, 84 + y, 1, 88);
        g2d.fillRect(110 + x, 84 + y, 1, 88);
        g2d.fillRect(111 + x, 84 + y, 1, 88);
        g2d.fillRect(112 + x, 84 + y, 1, 88);
        g2d.fillRect(113 + x, 84 + y, 1, 88);
        g2d.fillRect(114 + x, 84 + y, 1, 88);
        g2d.fillRect(115 + x, 84 + y, 1, 88);
        g2d.fillRect(116 + x, 84 + y, 1, 88);
        g2d.fillRect(117 + x, 84 + y, 1, 89);
        g2d.fillRect(118 + x, 84 + y, 1, 89);
        g2d.fillRect(119 + x, 84 + y, 1, 40);
        g2d.fillRect(102 + x, 105 + y, 1, 17);
        g2d.fillRect(120 + x, 108 + y, 1, 14);
        g2d.fillRect(101 + x, 122 + y, 1, 3);
        g2d.fillRect(120 + x, 124 + y, 2, 1);
        g2d.fillRect(103 + x, 125 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(121 + x, 125 + y, 1, 1);
        g2d.fillRect(104 + x, 127 + y, 1, 45);
        g2d.fillRect(119 + x, 127 + y, 1, 18);
        g2d.fillRect(121 + x, 130 + y, 1, 4);
        g2d.fillRect(122 + x, 132 + y, 1, 15);
        g2d.fillRect(121 + x, 136 + y, 1, 1);
        g2d.fillRect(121 + x, 139 + y, 1, 1);
        g2d.fillRect(99 + x, 140 + y, 1, 1);
        g2d.fillRect(103 + x, 141 + y, 1, 31);
        g2d.fillRect(99 + x, 143 + y, 1, 1);
        g2d.fillRect(123 + x, 148 + y, 1, 2);
        g2d.fillRect(102 + x, 151 + y, 1, 21);
        g2d.fillRect(101 + x, 157 + y, 1, 16);
        g2d.fillRect(119 + x, 157 + y, 1, 17);
        g2d.fillRect(124 + x, 157 + y, 1, 1);
        g2d.fillRect(125 + x, 160 + y, 1, 3);
        g2d.fillRect(100 + x, 161 + y, 1, 12);
        g2d.fillRect(120 + x, 163 + y, 1, 1);
        g2d.fillRect(94 + x, 164 + y, 1, 1);
        g2d.fillRect(99 + x, 165 + y, 1, 9);
        g2d.fillRect(120 + x, 165 + y, 1, 9);
        g2d.fillRect(96 + x, 167 + y, 1, 1);
        g2d.fillRect(98 + x, 167 + y, 1, 7);
        g2d.fillRect(94 + x, 169 + y, 1, 1);
        g2d.fillRect(121 + x, 169 + y, 1, 5);
        g2d.fillRect(123 + x, 169 + y, 1, 1);
        g2d.fillRect(125 + x, 169 + y, 2, 1);
        g2d.fillRect(93 + x, 170 + y, 1, 1);
        g2d.fillRect(97 + x, 170 + y, 1, 5);
        g2d.fillRect(126 + x, 170 + y, 1, 3);
        g2d.fillRect(122 + x, 171 + y, 1, 4);
        g2d.fillRect(123 + x, 171 + y, 1, 4);
        g2d.fillRect(95 + x, 172 + y, 1, 3);
        g2d.fillRect(96 + x, 172 + y, 1, 3);
        g2d.fillRect(124 + x, 172 + y, 2, 1);
        g2d.fillRect(124 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 164 + y, 1, 1);
        g2d.fillRect(132 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 225, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 122 + y, 1, 13);
        g2d.fillRect(103 + x, 123 + y, 1, 2);
        g2d.fillRect(120 + x, 123 + y, 2, 1);
        g2d.fillRect(100 + x, 124 + y, 1, 7);
        g2d.fillRect(119 + x, 124 + y, 1, 1);
        g2d.fillRect(101 + x, 125 + y, 1, 5);
        g2d.fillRect(120 + x, 125 + y, 1, 20);
        g2d.fillRect(103 + x, 126 + y, 1, 15);
        g2d.fillRect(119 + x, 126 + y, 1, 1);
        g2d.fillRect(121 + x, 126 + y, 1, 4);
        g2d.fillRect(121 + x, 134 + y, 1, 2);
        g2d.fillRect(121 + x, 137 + y, 1, 2);
        g2d.fillRect(102 + x, 138 + y, 1, 13);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(121 + x, 140 + y, 1, 2);
        g2d.fillRect(99 + x, 141 + y, 1, 2);
        g2d.fillRect(99 + x, 144 + y, 1, 2);
        g2d.fillRect(119 + x, 145 + y, 1, 12);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(122 + x, 147 + y, 1, 1);
        g2d.fillRect(123 + x, 150 + y, 1, 1);
        g2d.fillRect(97 + x, 153 + y, 1, 3);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(120 + x, 157 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 4);
        g2d.fillRect(95 + x, 160 + y, 1, 6);
        g2d.fillRect(99 + x, 161 + y, 1, 4);
        g2d.fillRect(120 + x, 162 + y, 2, 1);
        g2d.fillRect(121 + x, 163 + y, 1, 6);
        g2d.fillRect(98 + x, 164 + y, 1, 3);
        g2d.fillRect(120 + x, 164 + y, 1, 1);
        g2d.fillRect(97 + x, 166 + y, 1, 4);
        g2d.fillRect(125 + x, 167 + y, 1, 2);
        g2d.fillRect(94 + x, 168 + y, 1, 1);
        g2d.fillRect(96 + x, 168 + y, 1, 4);
        g2d.fillRect(122 + x, 168 + y, 1, 3);
        g2d.fillRect(126 + x, 168 + y, 1, 1);
        g2d.fillRect(95 + x, 169 + y, 1, 3);
        g2d.fillRect(124 + x, 169 + y, 1, 3);
        g2d.fillRect(94 + x, 170 + y, 1, 2);
        g2d.fillRect(123 + x, 170 + y, 1, 1);
        g2d.fillRect(125 + x, 170 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(91 + x, 162 + y, 1, 1);
        g2d.fillRect(88 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 166 + y, 1, 1);
        g2d.fillRect(133 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 235, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(93 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 166 + y, 1, 1);
        g2d.fillRect(90 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 147 + y, 1, 2);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(125 + x, 151 + y, 1, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 2);
        g2d.fillRect(123 + x, 157 + y, 1, 1);
        g2d.fillRect(123 + x, 159 + y, 1, 3);
        g2d.fillRect(128 + x, 161 + y, 1, 1);
        g2d.fillRect(85 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 158 + y, 1, 1);
        g2d.fillRect(89 + x, 162 + y, 1, 1);
        g2d.fillRect(89 + x, 164 + y, 1, 1);
        g2d.fillRect(87 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 161 + y, 1, 1);
        g2d.fillRect(88 + x, 163 + y, 1, 1);
        g2d.fillRect(84 + x, 168 + y, 1, 1);
        g2d.fillRect(87 + x, 171 + y, 1, 1);
        g2d.fillRect(134 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(90 + x, 161 + y, 1, 1);
        g2d.fillRect(128 + x, 165 + y, 1, 1);
        g2d.fillRect(90 + x, 166 + y, 1, 1);
        g2d.fillRect(89 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 232, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 130 + y, 1, 15);
        g2d.fillRect(102 + x, 135 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 7);
        g2d.fillRect(121 + x, 142 + y, 1, 6);
        g2d.fillRect(99 + x, 146 + y, 1, 6);
        g2d.fillRect(101 + x, 146 + y, 1, 1);
        g2d.fillRect(120 + x, 146 + y, 1, 2);
        g2d.fillRect(122 + x, 148 + y, 1, 9);
        g2d.fillRect(101 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 150 + y, 1, 7);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 156 + y, 1, 9);
        g2d.fillRect(121 + x, 157 + y, 1, 5);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(98 + x, 160 + y, 1, 4);
        g2d.fillRect(96 + x, 161 + y, 1, 6);
        g2d.fillRect(124 + x, 163 + y, 1, 6);
        g2d.fillRect(122 + x, 164 + y, 1, 1);
        g2d.fillRect(94 + x, 165 + y, 1, 1);
        g2d.fillRect(123 + x, 165 + y, 1, 4);
        g2d.fillRect(95 + x, 167 + y, 1, 2);
        g2d.fillRect(93 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 166 + y, 1, 1);
        g2d.fillRect(128 + x, 169 + y, 1, 1);
        g2d.fillRect(132 + x, 170 + y, 1, 1);
        g2d.fillRect(131 + x, 172 + y, 1, 1);
        g2d.fillRect(133 + x, 172 + y, 1, 1);
        g2d.fillRect(129 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 132 + y, 1, 3);
        g2d.fillRect(98 + x, 136 + y, 1, 1);
        g2d.fillRect(97 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 141 + y, 1, 2);
        g2d.fillRect(101 + x, 145 + y, 1, 1);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(120 + x, 150 + y, 1, 7);
        g2d.fillRect(125 + x, 152 + y, 1, 2);
        g2d.fillRect(98 + x, 154 + y, 1, 2);
        g2d.fillRect(126 + x, 156 + y, 1, 1);
        g2d.fillRect(123 + x, 158 + y, 1, 1);
        g2d.fillRect(98 + x, 159 + y, 1, 1);
        g2d.fillRect(122 + x, 162 + y, 1, 2);
        g2d.fillRect(123 + x, 162 + y, 1, 1);
        g2d.fillRect(83 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 155 + y, 1, 1);
        g2d.fillRect(89 + x, 167 + y, 1, 1);
        g2d.fillRect(85 + x, 168 + y, 1, 1);
        g2d.fillRect(84 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 162 + y, 1, 1);
        g2d.fillRect(90 + x, 167 + y, 1, 1);
        g2d.fillRect(86 + x, 168 + y, 1, 1);
        g2d.fillRect(86 + x, 171 + y, 1, 1);
        g2d.fillRect(130 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(129 + x, 169 + y, 1, 1);
        g2d.fillRect(85 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 135 + y, 1, 1);
        g2d.fillRect(98 + x, 137 + y, 1, 2);
        g2d.fillRect(97 + x, 140 + y, 1, 1);
        g2d.fillRect(96 + x, 143 + y, 2, 1);
        g2d.fillRect(95 + x, 146 + y, 1, 1);
        g2d.fillRect(124 + x, 146 + y, 1, 2);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(91 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 159 + y, 1, 1);
        g2d.fillRect(127 + x, 165 + y, 1, 1);
        g2d.fillRect(82 + x, 170 + y, 1, 2);
        g2d.fillRect(84 + x, 172 + y, 1, 1);
        g2d.fillRect(132 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(126 + x, 157 + y, 1, 1);
        g2d.fillRect(86 + x, 167 + y, 1, 1);
        g2d.fillRect(130 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(91 + x, 163 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 163 + y, 1, 1);
        g2d.fillRect(127 + x, 163 + y, 1, 1);
        g2d.fillRect(88 + x, 169 + y, 1, 1);
        g2d.fillRect(83 + x, 170 + y, 1, 2);
        g2d.fillRect(130 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 144 + y, 1, 2);
        g2d.fillRect(100 + x, 146 + y, 1, 4);
        g2d.fillRect(121 + x, 148 + y, 1, 9);
        g2d.fillRect(99 + x, 152 + y, 1, 4);
        g2d.fillRect(125 + x, 154 + y, 1, 2);
        g2d.fillRect(98 + x, 156 + y, 1, 3);
        g2d.fillRect(122 + x, 157 + y, 1, 5);
        g2d.fillRect(123 + x, 163 + y, 1, 2);
        g2d.fillRect(127 + x, 164 + y, 1, 1);
        g2d.fillRect(128 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 160 + y, 1, 1);
        g2d.fillRect(89 + x, 163 + y, 1, 1);
        g2d.fillRect(88 + x, 164 + y, 1, 1);
        g2d.fillRect(91 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 159 + y, 1, 3);
        g2d.fillRect(128 + x, 166 + y, 1, 1);
        g2d.fillRect(88 + x, 173 + y, 2, 1);
        g2d.fillRect(94 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 167 + y, 1, 1);
        g2d.fillRect(129 + x, 168 + y, 1, 1);
        g2d.fillRect(88 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 144 + y, 1, 2);
        g2d.fillRect(95 + x, 147 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 150 + y, 1, 1);
        g2d.fillRect(93 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 158 + y, 1, 2);
        g2d.fillRect(92 + x, 167 + y, 1, 1);
        g2d.fillRect(91 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 168 + y, 1, 1);
        g2d.fillRect(90 + x, 170 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 151 + y, 1, 1);
        g2d.fillRect(95 + x, 153 + y, 1, 1);
        g2d.fillRect(128 + x, 170 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(96 + x, 149 + y, 1, 1);
        g2d.fillRect(94 + x, 150 + y, 1, 1);
        g2d.fillRect(96 + x, 151 + y, 1, 1);
        g2d.fillRect(95 + x, 154 + y, 1, 2);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(91 + x, 158 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(96 + x, 146 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(93 + x, 154 + y, 1, 1);
        g2d.fillRect(94 + x, 156 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 149 + y, 1, 4);
        g2d.fillRect(94 + x, 154 + y, 1, 2);
        g2d.fillRect(93 + x, 155 + y, 1, 2);
        g2d.fillRect(92 + x, 157 + y, 1, 2);
        g2d.fillRect(93 + x, 158 + y, 1, 3);
        g2d.fillRect(92 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 152 + y, 1, 2);
        g2d.fillRect(93 + x, 157 + y, 1, 1);
        g2d.fillRect(92 + x, 159 + y, 1, 1);
    }

    public void paintB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 164 + y, 1, 1);
        g2d.fillRect(93 + x, 167 + y, 1, 1);
        g2d.fillRect(129 + x, 167 + y, 2, 1);
        g2d.fillRect(128 + x, 168 + y, 1, 1);
        g2d.fillRect(90 + x, 169 + y, 3, 1);
        g2d.fillRect(130 + x, 170 + y, 2, 1);
        g2d.fillRect(91 + x, 171 + y, 1, 2);
        g2d.fillRect(129 + x, 171 + y, 1, 1);
        g2d.fillRect(92 + x, 172 + y, 1, 1);
        g2d.fillRect(132 + x, 172 + y, 1, 1);
        g2d.fillRect(85 + x, 173 + y, 1, 1);
        g2d.fillRect(89 + x, 173 + y, 1, 1);
        g2d.fillRect(90 + x, 174 + y, 1, 1);
        g2d.fillRect(130 + x, 174 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 171 + y, 1, 1);
        g2d.fillRect(136 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(92 + x, 166 + y, 1, 1);
        g2d.fillRect(91 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 172 + y, 1, 1);
        g2d.fillRect(131 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(91 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 167 + y, 1, 1);
        g2d.fillRect(87 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 168 + y, 1, 1);
        g2d.fillRect(133 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(130 + x, 165 + y, 1, 1);
        g2d.fillRect(132 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(135 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(128 + x, 163 + y, 1, 1);
        g2d.fillRect(86 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 170 + y, 1, 1);
        g2d.fillRect(84 + x, 172 + y, 1, 1);
        g2d.fillRect(134 + x, 172 + y, 1, 1);
        g2d.fillRect(129 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(91 + x, 165 + y, 1, 1);
        g2d.fillRect(87 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 168 + y, 1, 1);
        g2d.fillRect(89 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(132 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 85, 87, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98, 99, 102, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 106, 109, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(91 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 109, 112, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 112, 115, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(134 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172, 173, 176, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(83 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177, 178, 181, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183, 184, 187, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(132 + x, 168 + y, 1, 1);
        g2d.fillRect(79 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185, 186, 188, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(188, 189, 191, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 160 + y, 1, 1);
        g2d.fillRect(130 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(192, 192, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(191, 192, 194, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(128 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195, 195, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 196, 196, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195, 196, 198, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(81 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 199, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(131 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 195, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 122 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 199, 201, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(130 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 200, 200, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 203, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(133 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(126 + x, 151 + y, 1, 1);
        g2d.fillRect(127 + x, 155 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 1, 1);
        g2d.fillRect(128 + x, 160 + y, 1, 1);
        g2d.fillRect(80 + x, 171 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201, 202, 204, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 167 + y, 1, 1);
        g2d.fillRect(135 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 203, 205, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 204, 204, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205, 206, 207, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 132 + y, 1, 2);
        g2d.fillRect(124 + x, 137 + y, 1, 2);
        g2d.fillRect(96 + x, 138 + y, 1, 1);
        g2d.fillRect(96 + x, 140 + y, 1, 2);
        g2d.fillRect(124 + x, 140 + y, 1, 4);
        g2d.fillRect(95 + x, 143 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 1);
        g2d.fillRect(125 + x, 146 + y, 1, 2);
        g2d.fillRect(92 + x, 152 + y, 1, 1);
        g2d.fillRect(126 + x, 152 + y, 1, 2);
        g2d.fillRect(91 + x, 155 + y, 1, 1);
        g2d.fillRect(127 + x, 156 + y, 1, 1);
        g2d.fillRect(93 + x, 166 + y, 1, 1);
        g2d.fillRect(84 + x, 168 + y, 1, 1);
        g2d.fillRect(83 + x, 169 + y, 1, 1);
        g2d.fillRect(82 + x, 173 + y, 1, 1);
        g2d.fillRect(89 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 208, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(137 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 210, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 158 + y, 1, 1);
        g2d.fillRect(130 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 209, 211, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(91 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 124 + y, 1, 1);
        g2d.fillRect(123 + x, 124 + y, 1, 1);
        g2d.fillRect(123 + x, 126 + y, 1, 10);
        g2d.fillRect(124 + x, 139 + y, 1, 1);
        g2d.fillRect(124 + x, 144 + y, 1, 1);
        g2d.fillRect(125 + x, 148 + y, 1, 3);
        g2d.fillRect(127 + x, 169 + y, 1, 1);
        g2d.fillRect(93 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 167 + y, 1, 1);
        g2d.fillRect(136 + x, 172 + y, 1, 1);
        g2d.fillRect(127 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 136 + y, 1, 1);
        g2d.fillRect(96 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 142 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 1, 1);
        g2d.fillRect(97 + x, 146 + y, 1, 2);
        g2d.fillRect(94 + x, 147 + y, 1, 2);
        g2d.fillRect(93 + x, 150 + y, 1, 2);
        g2d.fillRect(92 + x, 153 + y, 1, 2);
        g2d.fillRect(126 + x, 154 + y, 1, 1);
        g2d.fillRect(91 + x, 157 + y, 1, 1);
        g2d.fillRect(86 + x, 166 + y, 1, 1);
        g2d.fillRect(93 + x, 168 + y, 1, 1);
        g2d.fillRect(135 + x, 174 + y, 1, 1);
        g2d.fillRect(88 + x, 175 + y, 1, 1);
        g2d.fillRect(91 + x, 175 + y, 1, 1);
        g2d.fillRect(128 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(211, 212, 213, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 160 + y, 1, 1);
        g2d.fillRect(88 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 134 + y, 1, 2);
        g2d.fillRect(97 + x, 137 + y, 1, 1);
        g2d.fillRect(95 + x, 145 + y, 1, 1);
        g2d.fillRect(124 + x, 145 + y, 1, 1);
        g2d.fillRect(97 + x, 149 + y, 1, 2);
        g2d.fillRect(95 + x, 157 + y, 1, 2);
        g2d.fillRect(128 + x, 161 + y, 1, 1);
        g2d.fillRect(126 + x, 163 + y, 1, 1);
        g2d.fillRect(82 + x, 170 + y, 1, 1);
        g2d.fillRect(81 + x, 172 + y, 1, 1);
        g2d.fillRect(86 + x, 174 + y, 1, 1);
        g2d.fillRect(94 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 214, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(133 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 215, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(95 + x, 156 + y, 1, 1);
        g2d.fillRect(90 + x, 159 + y, 1, 1);
        g2d.fillRect(87 + x, 164 + y, 1, 1);
        g2d.fillRect(131 + x, 166 + y, 1, 1);
        g2d.fillRect(92 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214, 215, 215, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(89 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(203, 203, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 125 + y, 1, 6);
        g2d.fillRect(123 + x, 125 + y, 1, 1);
        g2d.fillRect(122 + x, 129 + y, 1, 1);
        g2d.fillRect(124 + x, 149 + y, 1, 1);
        g2d.fillRect(126 + x, 174 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(122 + x, 123 + y, 1, 1);
        g2d.fillRect(98 + x, 131 + y, 1, 1);
        g2d.fillRect(99 + x, 133 + y, 1, 6);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(124 + x, 148 + y, 1, 1);
        g2d.fillRect(97 + x, 151 + y, 1, 1);
        g2d.fillRect(124 + x, 151 + y, 1, 3);
        g2d.fillRect(96 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 155 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(125 + x, 156 + y, 1, 1);
        g2d.fillRect(95 + x, 159 + y, 1, 1);
        g2d.fillRect(94 + x, 160 + y, 1, 1);
        g2d.fillRect(94 + x, 164 + y, 1, 1);
        g2d.fillRect(126 + x, 165 + y, 1, 3);
        g2d.fillRect(94 + x, 167 + y, 1, 1);
        g2d.fillRect(93 + x, 170 + y, 1, 1);
        g2d.fillRect(94 + x, 173 + y, 1, 1);
        g2d.fillRect(93 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 148 + y, 1, 1);
        g2d.fillRect(124 + x, 154 + y, 1, 1);
        g2d.fillRect(126 + x, 161 + y, 1, 2);
        g2d.fillRect(126 + x, 164 + y, 1, 1);
        g2d.fillRect(133 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 122 + y, 1, 2);
        g2d.fillRect(99 + x, 123 + y, 1, 2);
        g2d.fillRect(122 + x, 124 + y, 1, 1);
        g2d.fillRect(104 + x, 126 + y, 1, 1);
        g2d.fillRect(99 + x, 131 + y, 1, 2);
        g2d.fillRect(123 + x, 136 + y, 1, 12);
        g2d.fillRect(98 + x, 139 + y, 1, 6);
        g2d.fillRect(96 + x, 153 + y, 1, 2);
        g2d.fillRect(125 + x, 157 + y, 1, 4);
        g2d.fillRect(94 + x, 161 + y, 1, 3);
        g2d.fillRect(127 + x, 170 + y, 1, 4);
        g2d.fillRect(92 + x, 173 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(216, 217, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 161 + y, 1, 1);
        g2d.fillRect(88 + x, 163 + y, 1, 1);
        g2d.fillRect(87 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(217, 218, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 84 + y, 1, 38);
        g2d.fillRect(102 + x, 84 + y, 1, 21);
        g2d.fillRect(120 + x, 84 + y, 1, 24);
        g2d.fillRect(100 + x, 104 + y, 1, 18);
        g2d.fillRect(121 + x, 108 + y, 1, 15);
        g2d.fillRect(99 + x, 125 + y, 1, 6);
        g2d.fillRect(122 + x, 125 + y, 1, 4);
        g2d.fillRect(122 + x, 130 + y, 1, 2);
        g2d.fillRect(124 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 166 + y, 1, 1);
        g2d.fillRect(129 + x, 166 + y, 1, 1);
        g2d.fillRect(131 + x, 167 + y, 1, 1);
        g2d.fillRect(87 + x, 170 + y, 1, 1);
        g2d.fillRect(131 + x, 171 + y, 1, 1);
        g2d.fillRect(135 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 170 + y, 1, 1);
        g2d.fillRect(128 + x, 173 + y, 1, 1);
        g2d.fillRect(84 + x, 174 + y, 2, 1);
        g2d.fillRect(87 + x, 174 + y, 1, 1);
        g2d.fillRect(134 + x, 174 + y, 1, 1);
        g2d.fillRect(132 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 227, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 227, 229, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(94 + x, 168 + y, 1, 1);
        g2d.fillRect(93 + x, 169 + y, 1, 1);
        g2d.fillRect(92 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 228, 228, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 169 + y, 1, 1);
        g2d.fillRect(130 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 165 + y, 1, 1);
        g2d.fillRect(91 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 229, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 231, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(90 + x, 161 + y, 1, 1);
        g2d.fillRect(92 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 219, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 122 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 164 + y, 1, 1);
        g2d.fillRect(130 + x, 169 + y, 1, 1);
        g2d.fillRect(84 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 226, 248, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(100 + x, 131 + y, 1, 8);
        g2d.fillRect(120 + x, 145 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 5);
        g2d.fillRect(101 + x, 150 + y, 1, 7);
        g2d.fillRect(123 + x, 151 + y, 1, 6);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 6);
        g2d.fillRect(124 + x, 156 + y, 1, 1);
        g2d.fillRect(120 + x, 159 + y, 1, 4);
        g2d.fillRect(95 + x, 160 + y, 1, 1);
        g2d.fillRect(99 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 161 + y, 1, 1);
        g2d.fillRect(124 + x, 163 + y, 1, 1);
        g2d.fillRect(125 + x, 164 + y, 1, 4);
        g2d.fillRect(97 + x, 166 + y, 1, 1);
        g2d.fillRect(122 + x, 166 + y, 1, 3);
        g2d.fillRect(95 + x, 167 + y, 1, 1);
        g2d.fillRect(126 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 164 + y, 1, 1);
        g2d.fillRect(128 + x, 165 + y, 1, 1);
        g2d.fillRect(90 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(81 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 224, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 84 + y, 1, 38);
        g2d.fillRect(104 + x, 84 + y, 1, 42);
        g2d.fillRect(105 + x, 84 + y, 1, 89);
        g2d.fillRect(106 + x, 84 + y, 1, 89);
        g2d.fillRect(107 + x, 84 + y, 1, 89);
        g2d.fillRect(108 + x, 84 + y, 1, 89);
        g2d.fillRect(109 + x, 84 + y, 1, 89);
        g2d.fillRect(110 + x, 84 + y, 1, 89);
        g2d.fillRect(111 + x, 84 + y, 1, 89);
        g2d.fillRect(112 + x, 84 + y, 1, 89);
        g2d.fillRect(113 + x, 84 + y, 1, 89);
        g2d.fillRect(114 + x, 84 + y, 1, 89);
        g2d.fillRect(115 + x, 84 + y, 1, 89);
        g2d.fillRect(116 + x, 84 + y, 1, 89);
        g2d.fillRect(117 + x, 84 + y, 1, 90);
        g2d.fillRect(118 + x, 84 + y, 1, 90);
        g2d.fillRect(119 + x, 84 + y, 1, 40);
        g2d.fillRect(102 + x, 105 + y, 1, 17);
        g2d.fillRect(120 + x, 108 + y, 1, 14);
        g2d.fillRect(101 + x, 122 + y, 1, 3);
        g2d.fillRect(120 + x, 124 + y, 2, 1);
        g2d.fillRect(103 + x, 125 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(121 + x, 125 + y, 1, 1);
        g2d.fillRect(104 + x, 127 + y, 1, 46);
        g2d.fillRect(119 + x, 127 + y, 1, 18);
        g2d.fillRect(121 + x, 130 + y, 1, 4);
        g2d.fillRect(122 + x, 132 + y, 1, 15);
        g2d.fillRect(121 + x, 136 + y, 1, 1);
        g2d.fillRect(121 + x, 139 + y, 1, 1);
        g2d.fillRect(99 + x, 140 + y, 1, 1);
        g2d.fillRect(103 + x, 141 + y, 1, 32);
        g2d.fillRect(99 + x, 143 + y, 1, 1);
        g2d.fillRect(123 + x, 148 + y, 1, 2);
        g2d.fillRect(102 + x, 151 + y, 1, 22);
        g2d.fillRect(101 + x, 157 + y, 1, 17);
        g2d.fillRect(124 + x, 157 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 1, 17);
        g2d.fillRect(125 + x, 161 + y, 1, 3);
        g2d.fillRect(100 + x, 162 + y, 1, 12);
        g2d.fillRect(120 + x, 164 + y, 1, 1);
        g2d.fillRect(94 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 166 + y, 1, 9);
        g2d.fillRect(120 + x, 166 + y, 1, 9);
        g2d.fillRect(96 + x, 168 + y, 1, 1);
        g2d.fillRect(98 + x, 168 + y, 1, 7);
        g2d.fillRect(94 + x, 170 + y, 1, 1);
        g2d.fillRect(121 + x, 170 + y, 1, 5);
        g2d.fillRect(123 + x, 170 + y, 1, 1);
        g2d.fillRect(125 + x, 170 + y, 2, 1);
        g2d.fillRect(93 + x, 171 + y, 1, 1);
        g2d.fillRect(97 + x, 171 + y, 1, 5);
        g2d.fillRect(126 + x, 171 + y, 1, 3);
        g2d.fillRect(122 + x, 172 + y, 1, 4);
        g2d.fillRect(123 + x, 172 + y, 1, 4);
        g2d.fillRect(95 + x, 173 + y, 1, 3);
        g2d.fillRect(96 + x, 173 + y, 1, 3);
        g2d.fillRect(124 + x, 173 + y, 2, 1);
        g2d.fillRect(124 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 165 + y, 1, 1);
        g2d.fillRect(132 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 225, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 122 + y, 1, 13);
        g2d.fillRect(103 + x, 123 + y, 1, 2);
        g2d.fillRect(120 + x, 123 + y, 2, 1);
        g2d.fillRect(100 + x, 124 + y, 1, 7);
        g2d.fillRect(119 + x, 124 + y, 1, 1);
        g2d.fillRect(101 + x, 125 + y, 1, 5);
        g2d.fillRect(120 + x, 125 + y, 1, 20);
        g2d.fillRect(103 + x, 126 + y, 1, 15);
        g2d.fillRect(119 + x, 126 + y, 1, 1);
        g2d.fillRect(121 + x, 126 + y, 1, 4);
        g2d.fillRect(121 + x, 134 + y, 1, 2);
        g2d.fillRect(121 + x, 137 + y, 1, 2);
        g2d.fillRect(102 + x, 138 + y, 1, 13);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(121 + x, 140 + y, 1, 2);
        g2d.fillRect(99 + x, 141 + y, 1, 2);
        g2d.fillRect(99 + x, 144 + y, 1, 2);
        g2d.fillRect(119 + x, 145 + y, 1, 13);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(122 + x, 147 + y, 1, 1);
        g2d.fillRect(123 + x, 150 + y, 1, 1);
        g2d.fillRect(97 + x, 153 + y, 1, 3);
        g2d.fillRect(100 + x, 157 + y, 1, 4);
        g2d.fillRect(120 + x, 157 + y, 1, 2);
        g2d.fillRect(124 + x, 159 + y, 1, 4);
        g2d.fillRect(95 + x, 161 + y, 1, 6);
        g2d.fillRect(99 + x, 162 + y, 1, 4);
        g2d.fillRect(120 + x, 163 + y, 2, 1);
        g2d.fillRect(121 + x, 164 + y, 1, 6);
        g2d.fillRect(98 + x, 165 + y, 1, 3);
        g2d.fillRect(120 + x, 165 + y, 1, 1);
        g2d.fillRect(97 + x, 167 + y, 1, 4);
        g2d.fillRect(125 + x, 168 + y, 1, 2);
        g2d.fillRect(94 + x, 169 + y, 1, 1);
        g2d.fillRect(96 + x, 169 + y, 1, 4);
        g2d.fillRect(122 + x, 169 + y, 1, 3);
        g2d.fillRect(126 + x, 169 + y, 1, 1);
        g2d.fillRect(95 + x, 170 + y, 1, 3);
        g2d.fillRect(124 + x, 170 + y, 1, 3);
        g2d.fillRect(94 + x, 171 + y, 1, 2);
        g2d.fillRect(123 + x, 171 + y, 1, 1);
        g2d.fillRect(125 + x, 171 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(91 + x, 163 + y, 1, 1);
        g2d.fillRect(88 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 167 + y, 1, 1);
        g2d.fillRect(133 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 235, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(93 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 167 + y, 1, 1);
        g2d.fillRect(90 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 147 + y, 1, 2);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(125 + x, 151 + y, 1, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(123 + x, 157 + y, 1, 2);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(123 + x, 160 + y, 1, 3);
        g2d.fillRect(128 + x, 162 + y, 1, 1);
        g2d.fillRect(85 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 159 + y, 1, 1);
        g2d.fillRect(89 + x, 163 + y, 1, 1);
        g2d.fillRect(89 + x, 165 + y, 1, 1);
        g2d.fillRect(87 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 162 + y, 1, 1);
        g2d.fillRect(88 + x, 164 + y, 1, 1);
        g2d.fillRect(84 + x, 169 + y, 1, 1);
        g2d.fillRect(87 + x, 172 + y, 1, 1);
        g2d.fillRect(134 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(90 + x, 162 + y, 1, 1);
        g2d.fillRect(128 + x, 166 + y, 1, 1);
        g2d.fillRect(90 + x, 167 + y, 1, 1);
        g2d.fillRect(89 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 232, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 130 + y, 1, 15);
        g2d.fillRect(102 + x, 135 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 7);
        g2d.fillRect(121 + x, 142 + y, 1, 6);
        g2d.fillRect(99 + x, 146 + y, 1, 6);
        g2d.fillRect(101 + x, 146 + y, 1, 1);
        g2d.fillRect(120 + x, 146 + y, 1, 2);
        g2d.fillRect(122 + x, 148 + y, 1, 9);
        g2d.fillRect(101 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 150 + y, 1, 7);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 156 + y, 1, 10);
        g2d.fillRect(121 + x, 157 + y, 1, 6);
        g2d.fillRect(99 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 161 + y, 1, 4);
        g2d.fillRect(96 + x, 162 + y, 1, 6);
        g2d.fillRect(124 + x, 164 + y, 1, 6);
        g2d.fillRect(122 + x, 165 + y, 1, 1);
        g2d.fillRect(94 + x, 166 + y, 1, 1);
        g2d.fillRect(123 + x, 166 + y, 1, 4);
        g2d.fillRect(95 + x, 168 + y, 1, 2);
        g2d.fillRect(93 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 167 + y, 1, 1);
        g2d.fillRect(128 + x, 170 + y, 1, 1);
        g2d.fillRect(132 + x, 171 + y, 1, 1);
        g2d.fillRect(131 + x, 173 + y, 1, 1);
        g2d.fillRect(133 + x, 173 + y, 1, 1);
        g2d.fillRect(129 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 132 + y, 1, 3);
        g2d.fillRect(98 + x, 136 + y, 1, 1);
        g2d.fillRect(97 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 141 + y, 1, 2);
        g2d.fillRect(101 + x, 145 + y, 1, 1);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(120 + x, 150 + y, 1, 7);
        g2d.fillRect(125 + x, 152 + y, 1, 2);
        g2d.fillRect(98 + x, 154 + y, 1, 2);
        g2d.fillRect(126 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(123 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 160 + y, 1, 1);
        g2d.fillRect(122 + x, 163 + y, 1, 2);
        g2d.fillRect(123 + x, 163 + y, 1, 1);
        g2d.fillRect(83 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 155 + y, 1, 1);
        g2d.fillRect(89 + x, 168 + y, 1, 1);
        g2d.fillRect(85 + x, 169 + y, 1, 1);
        g2d.fillRect(84 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 163 + y, 1, 1);
        g2d.fillRect(90 + x, 168 + y, 1, 1);
        g2d.fillRect(86 + x, 169 + y, 1, 1);
        g2d.fillRect(86 + x, 172 + y, 1, 1);
        g2d.fillRect(130 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(129 + x, 170 + y, 1, 1);
        g2d.fillRect(85 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 135 + y, 1, 1);
        g2d.fillRect(98 + x, 137 + y, 1, 2);
        g2d.fillRect(97 + x, 140 + y, 1, 1);
        g2d.fillRect(96 + x, 143 + y, 2, 1);
        g2d.fillRect(95 + x, 146 + y, 1, 1);
        g2d.fillRect(124 + x, 146 + y, 1, 2);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(126 + x, 157 + y, 1, 1);
        g2d.fillRect(91 + x, 158 + y, 1, 1);
        g2d.fillRect(90 + x, 160 + y, 1, 1);
        g2d.fillRect(127 + x, 166 + y, 1, 1);
        g2d.fillRect(82 + x, 171 + y, 1, 2);
        g2d.fillRect(84 + x, 173 + y, 1, 1);
        g2d.fillRect(132 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(126 + x, 158 + y, 1, 1);
        g2d.fillRect(86 + x, 168 + y, 1, 1);
        g2d.fillRect(130 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(91 + x, 164 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 164 + y, 1, 1);
        g2d.fillRect(127 + x, 164 + y, 1, 1);
        g2d.fillRect(88 + x, 170 + y, 1, 1);
        g2d.fillRect(83 + x, 171 + y, 1, 2);
        g2d.fillRect(130 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 144 + y, 1, 2);
        g2d.fillRect(100 + x, 146 + y, 1, 4);
        g2d.fillRect(121 + x, 148 + y, 1, 9);
        g2d.fillRect(99 + x, 152 + y, 1, 4);
        g2d.fillRect(125 + x, 154 + y, 1, 2);
        g2d.fillRect(98 + x, 156 + y, 1, 4);
        g2d.fillRect(122 + x, 157 + y, 1, 6);
        g2d.fillRect(123 + x, 164 + y, 1, 2);
        g2d.fillRect(127 + x, 165 + y, 1, 1);
        g2d.fillRect(128 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 161 + y, 1, 1);
        g2d.fillRect(89 + x, 164 + y, 1, 1);
        g2d.fillRect(88 + x, 165 + y, 1, 1);
        g2d.fillRect(91 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 160 + y, 1, 3);
        g2d.fillRect(128 + x, 167 + y, 1, 1);
        g2d.fillRect(88 + x, 174 + y, 2, 1);
        g2d.fillRect(94 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 168 + y, 1, 1);
        g2d.fillRect(129 + x, 169 + y, 1, 1);
        g2d.fillRect(88 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 144 + y, 1, 2);
        g2d.fillRect(95 + x, 147 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 150 + y, 1, 1);
        g2d.fillRect(93 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 159 + y, 1, 2);
        g2d.fillRect(92 + x, 168 + y, 1, 1);
        g2d.fillRect(91 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 169 + y, 1, 1);
        g2d.fillRect(90 + x, 171 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 151 + y, 1, 1);
        g2d.fillRect(95 + x, 153 + y, 1, 1);
        g2d.fillRect(92 + x, 157 + y, 1, 1);
        g2d.fillRect(128 + x, 171 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(96 + x, 149 + y, 1, 1);
        g2d.fillRect(94 + x, 150 + y, 1, 1);
        g2d.fillRect(96 + x, 151 + y, 1, 1);
        g2d.fillRect(95 + x, 154 + y, 1, 2);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(91 + x, 159 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(96 + x, 146 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(93 + x, 154 + y, 1, 1);
        g2d.fillRect(94 + x, 156 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 149 + y, 1, 4);
        g2d.fillRect(94 + x, 154 + y, 1, 2);
        g2d.fillRect(93 + x, 155 + y, 1, 3);
        g2d.fillRect(92 + x, 158 + y, 1, 2);
        g2d.fillRect(93 + x, 159 + y, 1, 3);
        g2d.fillRect(92 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 152 + y, 1, 2);
        g2d.fillRect(93 + x, 158 + y, 1, 1);
        g2d.fillRect(92 + x, 160 + y, 1, 1);
    }

    public void paintB3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 165 + y, 1, 1);
        g2d.fillRect(93 + x, 168 + y, 1, 1);
        g2d.fillRect(129 + x, 168 + y, 2, 1);
        g2d.fillRect(128 + x, 169 + y, 1, 1);
        g2d.fillRect(90 + x, 170 + y, 3, 1);
        g2d.fillRect(130 + x, 171 + y, 2, 1);
        g2d.fillRect(91 + x, 172 + y, 1, 2);
        g2d.fillRect(129 + x, 172 + y, 1, 1);
        g2d.fillRect(92 + x, 173 + y, 1, 1);
        g2d.fillRect(132 + x, 173 + y, 1, 1);
        g2d.fillRect(85 + x, 174 + y, 1, 1);
        g2d.fillRect(89 + x, 174 + y, 1, 1);
        g2d.fillRect(90 + x, 175 + y, 1, 1);
        g2d.fillRect(130 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 172 + y, 1, 1);
        g2d.fillRect(136 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(92 + x, 167 + y, 1, 1);
        g2d.fillRect(91 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 173 + y, 1, 1);
        g2d.fillRect(131 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(91 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 168 + y, 1, 1);
        g2d.fillRect(87 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 169 + y, 1, 1);
        g2d.fillRect(133 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(130 + x, 166 + y, 1, 1);
        g2d.fillRect(132 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(135 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(128 + x, 164 + y, 1, 1);
        g2d.fillRect(86 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 171 + y, 1, 1);
        g2d.fillRect(84 + x, 173 + y, 1, 1);
        g2d.fillRect(134 + x, 173 + y, 1, 1);
        g2d.fillRect(129 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(91 + x, 166 + y, 1, 1);
        g2d.fillRect(87 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 169 + y, 1, 1);
        g2d.fillRect(89 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(132 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 85, 87, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98, 99, 102, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(105, 106, 109, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(91 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108, 109, 112, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 112, 115, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(134 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172, 173, 176, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(83 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177, 178, 181, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183, 184, 187, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(132 + x, 169 + y, 1, 1);
        g2d.fillRect(79 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185, 186, 188, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(188, 189, 191, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 161 + y, 1, 1);
        g2d.fillRect(130 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(192, 192, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(191, 192, 194, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(128 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195, 195, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 196, 196, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195, 196, 198, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(81 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 199, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(131 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 195, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 123 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 199, 201, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(130 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 200, 200, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 203, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(133 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(126 + x, 152 + y, 1, 1);
        g2d.fillRect(127 + x, 156 + y, 1, 1);
        g2d.fillRect(90 + x, 159 + y, 1, 1);
        g2d.fillRect(128 + x, 161 + y, 1, 1);
        g2d.fillRect(80 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201, 202, 204, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 168 + y, 1, 1);
        g2d.fillRect(135 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 203, 205, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 204, 204, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205, 206, 207, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 133 + y, 1, 2);
        g2d.fillRect(124 + x, 138 + y, 1, 2);
        g2d.fillRect(96 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 141 + y, 1, 2);
        g2d.fillRect(124 + x, 141 + y, 1, 4);
        g2d.fillRect(95 + x, 144 + y, 1, 1);
        g2d.fillRect(94 + x, 147 + y, 1, 1);
        g2d.fillRect(125 + x, 147 + y, 1, 2);
        g2d.fillRect(92 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 153 + y, 1, 2);
        g2d.fillRect(91 + x, 156 + y, 1, 1);
        g2d.fillRect(127 + x, 157 + y, 1, 1);
        g2d.fillRect(93 + x, 167 + y, 1, 1);
        g2d.fillRect(84 + x, 169 + y, 1, 1);
        g2d.fillRect(83 + x, 170 + y, 1, 1);
        g2d.fillRect(82 + x, 174 + y, 1, 1);
        g2d.fillRect(89 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 208, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(137 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 210, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 159 + y, 1, 1);
        g2d.fillRect(130 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 209, 211, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(91 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 125 + y, 1, 1);
        g2d.fillRect(123 + x, 125 + y, 1, 1);
        g2d.fillRect(123 + x, 127 + y, 1, 10);
        g2d.fillRect(124 + x, 140 + y, 1, 1);
        g2d.fillRect(124 + x, 145 + y, 1, 1);
        g2d.fillRect(125 + x, 149 + y, 1, 3);
        g2d.fillRect(127 + x, 170 + y, 1, 1);
        g2d.fillRect(93 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 168 + y, 1, 1);
        g2d.fillRect(136 + x, 173 + y, 1, 1);
        g2d.fillRect(127 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 137 + y, 1, 1);
        g2d.fillRect(96 + x, 140 + y, 1, 1);
        g2d.fillRect(96 + x, 143 + y, 1, 1);
        g2d.fillRect(95 + x, 145 + y, 1, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 2);
        g2d.fillRect(94 + x, 148 + y, 1, 2);
        g2d.fillRect(93 + x, 151 + y, 1, 2);
        g2d.fillRect(92 + x, 154 + y, 1, 2);
        g2d.fillRect(126 + x, 155 + y, 1, 1);
        g2d.fillRect(91 + x, 158 + y, 1, 1);
        g2d.fillRect(86 + x, 167 + y, 1, 1);
        g2d.fillRect(93 + x, 169 + y, 1, 1);
        g2d.fillRect(135 + x, 175 + y, 1, 1);
        g2d.fillRect(88 + x, 176 + y, 1, 1);
        g2d.fillRect(91 + x, 176 + y, 1, 1);
        g2d.fillRect(128 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(211, 212, 213, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 161 + y, 1, 1);
        g2d.fillRect(88 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 123 + y, 1, 1);
        g2d.fillRect(97 + x, 135 + y, 1, 2);
        g2d.fillRect(97 + x, 138 + y, 1, 1);
        g2d.fillRect(95 + x, 146 + y, 1, 1);
        g2d.fillRect(124 + x, 146 + y, 1, 1);
        g2d.fillRect(97 + x, 150 + y, 1, 2);
        g2d.fillRect(95 + x, 158 + y, 1, 2);
        g2d.fillRect(128 + x, 162 + y, 1, 1);
        g2d.fillRect(126 + x, 164 + y, 1, 1);
        g2d.fillRect(82 + x, 171 + y, 1, 1);
        g2d.fillRect(81 + x, 173 + y, 1, 1);
        g2d.fillRect(86 + x, 175 + y, 1, 1);
        g2d.fillRect(94 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 214, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(133 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 215, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(95 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 160 + y, 1, 1);
        g2d.fillRect(87 + x, 165 + y, 1, 1);
        g2d.fillRect(131 + x, 167 + y, 1, 1);
        g2d.fillRect(92 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214, 215, 215, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(89 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(203, 203, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 126 + y, 1, 6);
        g2d.fillRect(123 + x, 126 + y, 1, 1);
        g2d.fillRect(122 + x, 130 + y, 1, 1);
        g2d.fillRect(124 + x, 150 + y, 1, 1);
        g2d.fillRect(126 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(122 + x, 124 + y, 1, 1);
        g2d.fillRect(98 + x, 132 + y, 1, 1);
        g2d.fillRect(99 + x, 134 + y, 1, 6);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(124 + x, 149 + y, 1, 1);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(124 + x, 152 + y, 1, 3);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 1);
        g2d.fillRect(124 + x, 156 + y, 1, 1);
        g2d.fillRect(125 + x, 157 + y, 1, 1);
        g2d.fillRect(95 + x, 160 + y, 1, 1);
        g2d.fillRect(94 + x, 161 + y, 1, 1);
        g2d.fillRect(94 + x, 165 + y, 1, 1);
        g2d.fillRect(126 + x, 166 + y, 1, 3);
        g2d.fillRect(94 + x, 168 + y, 1, 1);
        g2d.fillRect(93 + x, 171 + y, 1, 1);
        g2d.fillRect(94 + x, 174 + y, 1, 1);
        g2d.fillRect(93 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 149 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(126 + x, 162 + y, 1, 2);
        g2d.fillRect(126 + x, 165 + y, 1, 1);
        g2d.fillRect(133 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 123 + y, 1, 2);
        g2d.fillRect(99 + x, 124 + y, 1, 2);
        g2d.fillRect(122 + x, 125 + y, 1, 1);
        g2d.fillRect(104 + x, 127 + y, 1, 1);
        g2d.fillRect(99 + x, 132 + y, 1, 2);
        g2d.fillRect(123 + x, 137 + y, 1, 12);
        g2d.fillRect(98 + x, 140 + y, 1, 6);
        g2d.fillRect(96 + x, 154 + y, 1, 2);
        g2d.fillRect(125 + x, 158 + y, 1, 4);
        g2d.fillRect(94 + x, 162 + y, 1, 3);
        g2d.fillRect(127 + x, 171 + y, 1, 4);
        g2d.fillRect(92 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(216, 217, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 162 + y, 1, 1);
        g2d.fillRect(88 + x, 164 + y, 1, 1);
        g2d.fillRect(87 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(217, 218, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 84 + y, 1, 39);
        g2d.fillRect(102 + x, 84 + y, 1, 21);
        g2d.fillRect(120 + x, 84 + y, 1, 24);
        g2d.fillRect(100 + x, 104 + y, 1, 19);
        g2d.fillRect(121 + x, 108 + y, 1, 16);
        g2d.fillRect(99 + x, 126 + y, 1, 6);
        g2d.fillRect(122 + x, 126 + y, 1, 4);
        g2d.fillRect(122 + x, 131 + y, 1, 2);
        g2d.fillRect(124 + x, 151 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(87 + x, 167 + y, 1, 1);
        g2d.fillRect(129 + x, 167 + y, 1, 1);
        g2d.fillRect(131 + x, 168 + y, 1, 1);
        g2d.fillRect(87 + x, 171 + y, 1, 1);
        g2d.fillRect(131 + x, 172 + y, 1, 1);
        g2d.fillRect(135 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 171 + y, 1, 1);
        g2d.fillRect(128 + x, 174 + y, 1, 1);
        g2d.fillRect(84 + x, 175 + y, 2, 1);
        g2d.fillRect(87 + x, 175 + y, 1, 1);
        g2d.fillRect(134 + x, 175 + y, 1, 1);
        g2d.fillRect(132 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 227, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 227, 229, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(94 + x, 169 + y, 1, 1);
        g2d.fillRect(93 + x, 170 + y, 1, 1);
        g2d.fillRect(92 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 228, 228, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 170 + y, 1, 1);
        g2d.fillRect(130 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 166 + y, 1, 1);
        g2d.fillRect(91 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 229, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(85 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 231, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(90 + x, 162 + y, 1, 1);
        g2d.fillRect(92 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 219, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 123 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(129 + x, 165 + y, 1, 1);
        g2d.fillRect(130 + x, 170 + y, 1, 1);
        g2d.fillRect(84 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 226, 248, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 123 + y, 1, 1);
        g2d.fillRect(100 + x, 132 + y, 1, 8);
        g2d.fillRect(120 + x, 146 + y, 1, 1);
        g2d.fillRect(98 + x, 148 + y, 1, 5);
        g2d.fillRect(101 + x, 151 + y, 1, 7);
        g2d.fillRect(123 + x, 152 + y, 1, 6);
        g2d.fillRect(97 + x, 153 + y, 1, 1);
        g2d.fillRect(96 + x, 157 + y, 1, 6);
        g2d.fillRect(124 + x, 157 + y, 1, 1);
        g2d.fillRect(120 + x, 160 + y, 1, 4);
        g2d.fillRect(95 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 161 + y, 1, 2);
        g2d.fillRect(100 + x, 162 + y, 1, 1);
        g2d.fillRect(124 + x, 164 + y, 1, 1);
        g2d.fillRect(125 + x, 165 + y, 1, 4);
        g2d.fillRect(97 + x, 167 + y, 1, 1);
        g2d.fillRect(122 + x, 167 + y, 1, 3);
        g2d.fillRect(95 + x, 168 + y, 1, 1);
        g2d.fillRect(126 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(93 + x, 165 + y, 1, 1);
        g2d.fillRect(128 + x, 166 + y, 1, 1);
        g2d.fillRect(90 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(81 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 224, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 84 + y, 1, 39);
        g2d.fillRect(104 + x, 84 + y, 1, 43);
        g2d.fillRect(105 + x, 84 + y, 1, 90);
        g2d.fillRect(106 + x, 84 + y, 1, 90);
        g2d.fillRect(107 + x, 84 + y, 1, 90);
        g2d.fillRect(108 + x, 84 + y, 1, 90);
        g2d.fillRect(109 + x, 84 + y, 1, 90);
        g2d.fillRect(110 + x, 84 + y, 1, 90);
        g2d.fillRect(111 + x, 84 + y, 1, 90);
        g2d.fillRect(112 + x, 84 + y, 1, 90);
        g2d.fillRect(113 + x, 84 + y, 1, 90);
        g2d.fillRect(114 + x, 84 + y, 1, 90);
        g2d.fillRect(115 + x, 84 + y, 1, 90);
        g2d.fillRect(116 + x, 84 + y, 1, 90);
        g2d.fillRect(117 + x, 84 + y, 1, 91);
        g2d.fillRect(118 + x, 84 + y, 1, 91);
        g2d.fillRect(119 + x, 84 + y, 1, 41);
        g2d.fillRect(102 + x, 105 + y, 1, 18);
        g2d.fillRect(120 + x, 108 + y, 1, 15);
        g2d.fillRect(101 + x, 123 + y, 1, 3);
        g2d.fillRect(120 + x, 125 + y, 2, 1);
        g2d.fillRect(103 + x, 126 + y, 1, 1);
        g2d.fillRect(119 + x, 126 + y, 1, 1);
        g2d.fillRect(121 + x, 126 + y, 1, 1);
        g2d.fillRect(104 + x, 128 + y, 1, 46);
        g2d.fillRect(119 + x, 128 + y, 1, 18);
        g2d.fillRect(121 + x, 131 + y, 1, 4);
        g2d.fillRect(122 + x, 133 + y, 1, 15);
        g2d.fillRect(121 + x, 137 + y, 1, 1);
        g2d.fillRect(121 + x, 140 + y, 1, 1);
        g2d.fillRect(99 + x, 141 + y, 1, 1);
        g2d.fillRect(103 + x, 142 + y, 1, 32);
        g2d.fillRect(99 + x, 144 + y, 1, 1);
        g2d.fillRect(123 + x, 149 + y, 1, 2);
        g2d.fillRect(102 + x, 152 + y, 1, 22);
        g2d.fillRect(101 + x, 158 + y, 1, 17);
        g2d.fillRect(124 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 159 + y, 1, 17);
        g2d.fillRect(125 + x, 162 + y, 1, 3);
        g2d.fillRect(100 + x, 163 + y, 1, 12);
        g2d.fillRect(120 + x, 165 + y, 1, 1);
        g2d.fillRect(94 + x, 166 + y, 1, 1);
        g2d.fillRect(99 + x, 167 + y, 1, 9);
        g2d.fillRect(120 + x, 167 + y, 1, 9);
        g2d.fillRect(96 + x, 169 + y, 1, 1);
        g2d.fillRect(98 + x, 169 + y, 1, 7);
        g2d.fillRect(94 + x, 171 + y, 1, 1);
        g2d.fillRect(121 + x, 171 + y, 1, 5);
        g2d.fillRect(123 + x, 171 + y, 1, 1);
        g2d.fillRect(125 + x, 171 + y, 2, 1);
        g2d.fillRect(93 + x, 172 + y, 1, 1);
        g2d.fillRect(97 + x, 172 + y, 1, 5);
        g2d.fillRect(126 + x, 172 + y, 1, 3);
        g2d.fillRect(122 + x, 173 + y, 1, 4);
        g2d.fillRect(123 + x, 173 + y, 1, 4);
        g2d.fillRect(95 + x, 174 + y, 1, 3);
        g2d.fillRect(96 + x, 174 + y, 1, 3);
        g2d.fillRect(124 + x, 174 + y, 2, 1);
        g2d.fillRect(124 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 166 + y, 1, 1);
        g2d.fillRect(132 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 225, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 123 + y, 1, 13);
        g2d.fillRect(103 + x, 124 + y, 1, 2);
        g2d.fillRect(120 + x, 124 + y, 2, 1);
        g2d.fillRect(100 + x, 125 + y, 1, 7);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(101 + x, 126 + y, 1, 5);
        g2d.fillRect(120 + x, 126 + y, 1, 20);
        g2d.fillRect(103 + x, 127 + y, 1, 15);
        g2d.fillRect(119 + x, 127 + y, 1, 1);
        g2d.fillRect(121 + x, 127 + y, 1, 4);
        g2d.fillRect(121 + x, 135 + y, 1, 2);
        g2d.fillRect(121 + x, 138 + y, 1, 2);
        g2d.fillRect(102 + x, 139 + y, 1, 13);
        g2d.fillRect(99 + x, 140 + y, 1, 1);
        g2d.fillRect(121 + x, 141 + y, 1, 2);
        g2d.fillRect(99 + x, 142 + y, 1, 2);
        g2d.fillRect(99 + x, 145 + y, 1, 2);
        g2d.fillRect(119 + x, 146 + y, 1, 13);
        g2d.fillRect(98 + x, 147 + y, 1, 1);
        g2d.fillRect(122 + x, 148 + y, 1, 1);
        g2d.fillRect(123 + x, 151 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 3);
        g2d.fillRect(100 + x, 158 + y, 1, 4);
        g2d.fillRect(120 + x, 158 + y, 1, 2);
        g2d.fillRect(124 + x, 160 + y, 1, 4);
        g2d.fillRect(95 + x, 162 + y, 1, 6);
        g2d.fillRect(99 + x, 163 + y, 1, 4);
        g2d.fillRect(120 + x, 164 + y, 2, 1);
        g2d.fillRect(121 + x, 165 + y, 1, 6);
        g2d.fillRect(98 + x, 166 + y, 1, 3);
        g2d.fillRect(120 + x, 166 + y, 1, 1);
        g2d.fillRect(97 + x, 168 + y, 1, 4);
        g2d.fillRect(125 + x, 169 + y, 1, 2);
        g2d.fillRect(94 + x, 170 + y, 1, 1);
        g2d.fillRect(96 + x, 170 + y, 1, 4);
        g2d.fillRect(122 + x, 170 + y, 1, 3);
        g2d.fillRect(126 + x, 170 + y, 1, 1);
        g2d.fillRect(95 + x, 171 + y, 1, 3);
        g2d.fillRect(124 + x, 171 + y, 1, 3);
        g2d.fillRect(94 + x, 172 + y, 1, 2);
        g2d.fillRect(123 + x, 172 + y, 1, 1);
        g2d.fillRect(125 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(91 + x, 164 + y, 1, 1);
        g2d.fillRect(88 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 168 + y, 1, 1);
        g2d.fillRect(133 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 235, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(93 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 168 + y, 1, 1);
        g2d.fillRect(90 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 148 + y, 1, 2);
        g2d.fillRect(120 + x, 150 + y, 1, 1);
        g2d.fillRect(125 + x, 152 + y, 1, 1);
        g2d.fillRect(98 + x, 154 + y, 1, 1);
        g2d.fillRect(126 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(123 + x, 158 + y, 1, 2);
        g2d.fillRect(99 + x, 159 + y, 1, 1);
        g2d.fillRect(123 + x, 161 + y, 1, 3);
        g2d.fillRect(128 + x, 163 + y, 1, 1);
        g2d.fillRect(85 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 160 + y, 1, 1);
        g2d.fillRect(89 + x, 164 + y, 1, 1);
        g2d.fillRect(89 + x, 166 + y, 1, 1);
        g2d.fillRect(87 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(89 + x, 163 + y, 1, 1);
        g2d.fillRect(88 + x, 165 + y, 1, 1);
        g2d.fillRect(84 + x, 170 + y, 1, 1);
        g2d.fillRect(87 + x, 173 + y, 1, 1);
        g2d.fillRect(134 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(90 + x, 163 + y, 1, 1);
        g2d.fillRect(128 + x, 167 + y, 1, 1);
        g2d.fillRect(90 + x, 168 + y, 1, 1);
        g2d.fillRect(89 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 232, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 131 + y, 1, 15);
        g2d.fillRect(102 + x, 136 + y, 1, 3);
        g2d.fillRect(100 + x, 140 + y, 1, 7);
        g2d.fillRect(121 + x, 143 + y, 1, 6);
        g2d.fillRect(99 + x, 147 + y, 1, 6);
        g2d.fillRect(101 + x, 147 + y, 1, 1);
        g2d.fillRect(120 + x, 147 + y, 1, 2);
        g2d.fillRect(122 + x, 149 + y, 1, 9);
        g2d.fillRect(101 + x, 150 + y, 1, 1);
        g2d.fillRect(100 + x, 151 + y, 1, 7);
        g2d.fillRect(98 + x, 153 + y, 1, 1);
        g2d.fillRect(97 + x, 157 + y, 1, 10);
        g2d.fillRect(121 + x, 158 + y, 1, 6);
        g2d.fillRect(99 + x, 160 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 1, 4);
        g2d.fillRect(96 + x, 163 + y, 1, 6);
        g2d.fillRect(124 + x, 165 + y, 1, 6);
        g2d.fillRect(122 + x, 166 + y, 1, 1);
        g2d.fillRect(94 + x, 167 + y, 1, 1);
        g2d.fillRect(123 + x, 167 + y, 1, 4);
        g2d.fillRect(95 + x, 169 + y, 1, 2);
        g2d.fillRect(93 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(86 + x, 168 + y, 1, 1);
        g2d.fillRect(128 + x, 171 + y, 1, 1);
        g2d.fillRect(132 + x, 172 + y, 1, 1);
        g2d.fillRect(131 + x, 174 + y, 1, 1);
        g2d.fillRect(133 + x, 174 + y, 1, 1);
        g2d.fillRect(129 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 133 + y, 1, 3);
        g2d.fillRect(98 + x, 137 + y, 1, 1);
        g2d.fillRect(97 + x, 139 + y, 1, 2);
        g2d.fillRect(97 + x, 142 + y, 1, 2);
        g2d.fillRect(101 + x, 146 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(120 + x, 151 + y, 1, 7);
        g2d.fillRect(125 + x, 153 + y, 1, 2);
        g2d.fillRect(98 + x, 155 + y, 1, 2);
        g2d.fillRect(126 + x, 157 + y, 1, 1);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(123 + x, 160 + y, 1, 1);
        g2d.fillRect(98 + x, 161 + y, 1, 1);
        g2d.fillRect(122 + x, 164 + y, 1, 2);
        g2d.fillRect(123 + x, 164 + y, 1, 1);
        g2d.fillRect(83 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(89 + x, 169 + y, 1, 1);
        g2d.fillRect(85 + x, 170 + y, 1, 1);
        g2d.fillRect(84 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 164 + y, 1, 1);
        g2d.fillRect(90 + x, 169 + y, 1, 1);
        g2d.fillRect(86 + x, 170 + y, 1, 1);
        g2d.fillRect(86 + x, 173 + y, 1, 1);
        g2d.fillRect(130 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 150 + y, 1, 1);
        g2d.fillRect(129 + x, 171 + y, 1, 1);
        g2d.fillRect(85 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 136 + y, 1, 1);
        g2d.fillRect(98 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 141 + y, 1, 1);
        g2d.fillRect(96 + x, 144 + y, 2, 1);
        g2d.fillRect(95 + x, 147 + y, 1, 1);
        g2d.fillRect(124 + x, 147 + y, 1, 2);
        g2d.fillRect(93 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 158 + y, 1, 1);
        g2d.fillRect(91 + x, 159 + y, 1, 1);
        g2d.fillRect(90 + x, 161 + y, 1, 1);
        g2d.fillRect(127 + x, 167 + y, 1, 1);
        g2d.fillRect(82 + x, 172 + y, 1, 2);
        g2d.fillRect(84 + x, 174 + y, 1, 1);
        g2d.fillRect(132 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(126 + x, 159 + y, 1, 1);
        g2d.fillRect(86 + x, 169 + y, 1, 1);
        g2d.fillRect(130 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(88 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(91 + x, 165 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(90 + x, 165 + y, 1, 1);
        g2d.fillRect(127 + x, 165 + y, 1, 1);
        g2d.fillRect(88 + x, 171 + y, 1, 1);
        g2d.fillRect(83 + x, 172 + y, 1, 2);
        g2d.fillRect(130 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 145 + y, 1, 2);
        g2d.fillRect(100 + x, 147 + y, 1, 4);
        g2d.fillRect(121 + x, 149 + y, 1, 9);
        g2d.fillRect(99 + x, 153 + y, 1, 4);
        g2d.fillRect(125 + x, 155 + y, 1, 2);
        g2d.fillRect(98 + x, 157 + y, 1, 4);
        g2d.fillRect(122 + x, 158 + y, 1, 6);
        g2d.fillRect(123 + x, 165 + y, 1, 2);
        g2d.fillRect(127 + x, 166 + y, 1, 1);
        g2d.fillRect(128 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 162 + y, 1, 1);
        g2d.fillRect(89 + x, 165 + y, 1, 1);
        g2d.fillRect(88 + x, 166 + y, 1, 1);
        g2d.fillRect(91 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(127 + x, 161 + y, 1, 3);
        g2d.fillRect(128 + x, 168 + y, 1, 1);
        g2d.fillRect(88 + x, 175 + y, 2, 1);
        g2d.fillRect(94 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 169 + y, 1, 1);
        g2d.fillRect(129 + x, 170 + y, 1, 1);
        g2d.fillRect(88 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 145 + y, 1, 2);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 149 + y, 1, 1);
        g2d.fillRect(96 + x, 151 + y, 1, 1);
        g2d.fillRect(93 + x, 154 + y, 1, 1);
        g2d.fillRect(126 + x, 160 + y, 1, 2);
        g2d.fillRect(92 + x, 169 + y, 1, 1);
        g2d.fillRect(91 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 170 + y, 1, 1);
        g2d.fillRect(90 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(95 + x, 154 + y, 1, 1);
        g2d.fillRect(92 + x, 158 + y, 1, 1);
        g2d.fillRect(128 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 150 + y, 1, 1);
        g2d.fillRect(94 + x, 151 + y, 1, 1);
        g2d.fillRect(96 + x, 152 + y, 1, 1);
        g2d.fillRect(95 + x, 155 + y, 1, 2);
        g2d.fillRect(92 + x, 157 + y, 1, 1);
        g2d.fillRect(91 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(95 + x, 149 + y, 1, 1);
        g2d.fillRect(93 + x, 155 + y, 1, 1);
        g2d.fillRect(94 + x, 157 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 150 + y, 1, 4);
        g2d.fillRect(94 + x, 155 + y, 1, 2);
        g2d.fillRect(93 + x, 156 + y, 1, 3);
        g2d.fillRect(92 + x, 159 + y, 1, 2);
        g2d.fillRect(93 + x, 160 + y, 1, 3);
        g2d.fillRect(92 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 153 + y, 1, 2);
        g2d.fillRect(93 + x, 159 + y, 1, 1);
        g2d.fillRect(92 + x, 161 + y, 1, 1);
    }

    public void paintBF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 160 + y, 1, 5);
        g2d.fillRect(104 + x, 161 + y, 1, 1);
        g2d.fillRect(104 + x, 163 + y, 1, 1);
        g2d.fillRect(108 + x, 163 + y, 2, 1);
        g2d.fillRect(114 + x, 163 + y, 2, 1);
        g2d.fillRect(103 + x, 164 + y, 1, 1);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(111 + x, 164 + y, 1, 1);
        g2d.fillRect(104 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 166 + y, 1, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 169 + y, 1, 1);
        g2d.fillRect(101 + x, 170 + y, 1, 2);
        g2d.fillRect(103 + x, 170 + y, 2, 1);
        g2d.fillRect(106 + x, 170 + y, 1, 2);
        g2d.fillRect(108 + x, 170 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 2);
        g2d.fillRect(112 + x, 170 + y, 1, 1);
        g2d.fillRect(104 + x, 171 + y, 1, 1);
        g2d.fillRect(107 + x, 172 + y, 2, 1);
        g2d.fillRect(118 + x, 172 + y, 1, 1);
        g2d.fillRect(112 + x, 173 + y, 1, 1);
        g2d.fillRect(100 + x, 174 + y, 1, 1);
        g2d.fillRect(106 + x, 174 + y, 2, 1);
        g2d.fillRect(110 + x, 174 + y, 1, 1);
        g2d.fillRect(120 + x, 174 + y, 2, 1);
        g2d.fillRect(98 + x, 175 + y, 1, 1);
        g2d.fillRect(109 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 170 + y, 1, 1);
        g2d.fillRect(116 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(103 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 166 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 1, 1);
        g2d.fillRect(119 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(109 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(101 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 167 + y, 1, 1);
        g2d.fillRect(110 + x, 169 + y, 1, 1);
        g2d.fillRect(117 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(106 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(114 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(105 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 163 + y, 1, 1);
        g2d.fillRect(103 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 164 + y, 1, 1);
        g2d.fillRect(102 + x, 167 + y, 1, 1);
        g2d.fillRect(104 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 169 + y, 1, 1);
        g2d.fillRect(102 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 84, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 165 + y, 1, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 1, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);
        g2d.fillRect(108 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 159 + y, 1, 1);
        g2d.fillRect(99 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(97 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 159 + y, 1, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);
        g2d.fillRect(109 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 175 + y, 1, 1);
        g2d.fillRect(107 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 174 + y, 1, 1);
        g2d.fillRect(119 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(122 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 176 + y, 1, 1);
        g2d.fillRect(123 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 166 + y, 1, 1);
        g2d.fillRect(120 + x, 172 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 1, 1);
        g2d.fillRect(103 + x, 175 + y, 2, 1);
        g2d.fillRect(114 + x, 175 + y, 1, 1);
        g2d.fillRect(96 + x, 176 + y, 1, 1);
        g2d.fillRect(106 + x, 176 + y, 1, 1);
        g2d.fillRect(121 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 152 + y, 1, 6);
        g2d.fillRect(118 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 1, 1);
        g2d.fillRect(118 + x, 163 + y, 1, 2);
        g2d.fillRect(99 + x, 168 + y, 1, 1);
        g2d.fillRect(98 + x, 170 + y, 1, 2);
        g2d.fillRect(96 + x, 174 + y, 1, 1);
        g2d.fillRect(123 + x, 174 + y, 1, 1);
        g2d.fillRect(125 + x, 174 + y, 1, 1);
        g2d.fillRect(95 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 89 + y, 1, 5);
        g2d.fillRect(118 + x, 89 + y, 1, 8);
        g2d.fillRect(105 + x, 94 + y, 1, 39);
        g2d.fillRect(117 + x, 97 + y, 1, 5);
        g2d.fillRect(116 + x, 111 + y, 1, 23);
        g2d.fillRect(104 + x, 133 + y, 1, 9);
        g2d.fillRect(118 + x, 162 + y, 1, 1);
        g2d.fillRect(99 + x, 163 + y, 1, 2);
        g2d.fillRect(100 + x, 165 + y, 1, 1);
        g2d.fillRect(98 + x, 169 + y, 1, 1);
        g2d.fillRect(120 + x, 171 + y, 1, 1);
        g2d.fillRect(97 + x, 172 + y, 1, 2);
        g2d.fillRect(95 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 175 + y, 1, 1);
        g2d.fillRect(120 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 102 + y, 1, 4);
        g2d.fillRect(116 + x, 106 + y, 1, 5);
        g2d.fillRect(116 + x, 134 + y, 1, 19);
        g2d.fillRect(103 + x, 142 + y, 1, 10);
        g2d.fillRect(117 + x, 153 + y, 1, 6);
        g2d.fillRect(101 + x, 158 + y, 1, 4);
        g2d.fillRect(99 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 167 + y, 1, 2);
        g2d.fillRect(122 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 165 + y, 1, 1);
        g2d.fillRect(103 + x, 174 + y, 1, 1);
        g2d.fillRect(118 + x, 174 + y, 1, 1);
        g2d.fillRect(99 + x, 175 + y, 1, 1);
        g2d.fillRect(108 + x, 176 + y, 1, 1);
        g2d.fillRect(110 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 171 + y, 1, 1);
        g2d.fillRect(97 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 171 + y, 1, 1);
        g2d.fillRect(112 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 172 + y, 1, 1);
        g2d.fillRect(103 + x, 173 + y, 1, 1);
        g2d.fillRect(104 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 164 + y, 1, 1);
        g2d.fillRect(98 + x, 174 + y, 2, 1);
        g2d.fillRect(105 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 90 + y, 1, 7);
        g2d.fillRect(116 + x, 97 + y, 1, 9);
        g2d.fillRect(116 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);
        g2d.fillRect(101 + x, 169 + y, 1, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 1);
        g2d.fillRect(97 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 159 + y, 1, 1);
        g2d.fillRect(101 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 165 + y, 1, 1);
        g2d.fillRect(100 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 159 + y, 1, 1);
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(105 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(115 + x, 164 + y, 1, 1);
        g2d.fillRect(102 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(116 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(102 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(115 + x, 162 + y, 1, 1);
        g2d.fillRect(108 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 164 + y, 1, 1);
        g2d.fillRect(99 + x, 169 + y, 1, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(107 + x, 155 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 1);
        g2d.fillRect(102 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 1, 2);
        g2d.fillRect(112 + x, 140 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(114 + x, 170 + y, 1, 1);
        g2d.fillRect(108 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(108 + x, 149 + y, 1, 1);
        g2d.fillRect(107 + x, 156 + y, 1, 2);
        g2d.fillRect(107 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 97 + y, 1, 6);
        g2d.fillRect(112 + x, 105 + y, 1, 4);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 137 + y, 1, 3);
        g2d.fillRect(104 + x, 146 + y, 1, 1);
        g2d.fillRect(108 + x, 150 + y, 1, 6);
        g2d.fillRect(107 + x, 154 + y, 1, 1);
        g2d.fillRect(114 + x, 156 + y, 1, 2);
        g2d.fillRect(116 + x, 156 + y, 1, 1);
        g2d.fillRect(102 + x, 158 + y, 1, 1);
        g2d.fillRect(107 + x, 158 + y, 1, 2);
        g2d.fillRect(106 + x, 162 + y, 1, 2);
        g2d.fillRect(111 + x, 163 + y, 1, 1);
        g2d.fillRect(114 + x, 165 + y, 1, 1);
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 1, 1);
        g2d.fillRect(115 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 94 + y, 1, 39);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 44);
        g2d.fillRect(105 + x, 133 + y, 1, 9);
        g2d.fillRect(104 + x, 142 + y, 1, 4);
        g2d.fillRect(103 + x, 152 + y, 1, 4);
        g2d.fillRect(116 + x, 153 + y, 1, 3);
        g2d.fillRect(117 + x, 161 + y, 1, 2);
        g2d.fillRect(101 + x, 165 + y, 1, 1);
        g2d.fillRect(100 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 168 + y, 1, 1);
        g2d.fillRect(99 + x, 170 + y, 1, 1);
        g2d.fillRect(119 + x, 174 + y, 1, 1);
        g2d.fillRect(96 + x, 175 + y, 1, 1);
        g2d.fillRect(121 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 163 + y, 1, 1);
        g2d.fillRect(106 + x, 164 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(107 + x, 171 + y, 1, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 162 + y, 1, 1);
        g2d.fillRect(117 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 167 + y, 1, 1);
        g2d.fillRect(100 + x, 168 + y, 1, 1);
        g2d.fillRect(118 + x, 169 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 1);
        g2d.fillRect(116 + x, 170 + y, 1, 1);
        g2d.fillRect(105 + x, 171 + y, 1, 1);
        g2d.fillRect(119 + x, 172 + y, 1, 1);
        g2d.fillRect(118 + x, 173 + y, 1, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);
        g2d.fillRect(114 + x, 174 + y, 1, 1);
        g2d.fillRect(107 + x, 175 + y, 1, 1);
        g2d.fillRect(110 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(103 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 161 + y, 1, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 1);
        g2d.fillRect(111 + x, 167 + y, 1, 1);
        g2d.fillRect(111 + x, 170 + y, 1, 1);
        g2d.fillRect(105 + x, 172 + y, 1, 1);
        g2d.fillRect(114 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 165 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 1);
        g2d.fillRect(109 + x, 169 + y, 1, 1);
        g2d.fillRect(101 + x, 172 + y, 1, 1);
        g2d.fillRect(106 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 164 + y, 1, 1);
        g2d.fillRect(112 + x, 171 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 134 + y, 1, 1);
        g2d.fillRect(103 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 171 + y, 1, 1);
        g2d.fillRect(110 + x, 172 + y, 1, 1);
        g2d.fillRect(120 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(113 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 5);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 7);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 17);
        g2d.fillRect(109 + x, 95 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 97 + y, 1, 9);
        g2d.fillRect(111 + x, 103 + y, 1, 2);
        g2d.fillRect(114 + x, 106 + y, 1, 5);
        g2d.fillRect(110 + x, 108 + y, 2, 1);
        g2d.fillRect(111 + x, 109 + y, 1, 2);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(106 + x, 134 + y, 1, 8);
        g2d.fillRect(107 + x, 134 + y, 1, 3);
        g2d.fillRect(108 + x, 135 + y, 1, 1);
        g2d.fillRect(111 + x, 135 + y, 1, 1);
        g2d.fillRect(113 + x, 135 + y, 2, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 1);
        g2d.fillRect(114 + x, 136 + y, 1, 18);
        g2d.fillRect(108 + x, 137 + y, 1, 1);
        g2d.fillRect(111 + x, 138 + y, 1, 4);
        g2d.fillRect(113 + x, 140 + y, 1, 1);
        g2d.fillRect(105 + x, 142 + y, 1, 1);
        g2d.fillRect(104 + x, 147 + y, 1, 5);
        g2d.fillRect(105 + x, 147 + y, 1, 1);
        g2d.fillRect(111 + x, 149 + y, 1, 1);
        g2d.fillRect(106 + x, 150 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 1);
        g2d.fillRect(113 + x, 152 + y, 1, 1);
        g2d.fillRect(104 + x, 153 + y, 1, 2);
        g2d.fillRect(115 + x, 153 + y, 1, 5);
        g2d.fillRect(109 + x, 156 + y, 1, 2);
        g2d.fillRect(110 + x, 156 + y, 1, 2);
        g2d.fillRect(103 + x, 157 + y, 1, 2);
        g2d.fillRect(114 + x, 158 + y, 1, 1);
        g2d.fillRect(108 + x, 159 + y, 1, 1);
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(104 + x, 160 + y, 1, 1);
        g2d.fillRect(115 + x, 160 + y, 1, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 2);
        g2d.fillRect(109 + x, 164 + y, 2, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 166 + y, 2, 1);
        g2d.fillRect(101 + x, 168 + y, 1, 1);
        g2d.fillRect(106 + x, 168 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 8);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 86 + y, 1, 11);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 3);
        g2d.fillRect(115 + x, 87 + y, 1, 10);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 47);
        g2d.fillRect(109 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 15);
        g2d.fillRect(108 + x, 92 + y, 1, 43);
        g2d.fillRect(110 + x, 93 + y, 1, 15);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 59);
        g2d.fillRect(111 + x, 99 + y, 1, 4);
        g2d.fillRect(111 + x, 105 + y, 1, 3);
        g2d.fillRect(110 + x, 109 + y, 1, 27);
        g2d.fillRect(107 + x, 111 + y, 1, 23);
        g2d.fillRect(111 + x, 111 + y, 1, 24);
        g2d.fillRect(112 + x, 111 + y, 1, 24);
        g2d.fillRect(114 + x, 111 + y, 1, 23);
        g2d.fillRect(106 + x, 133 + y, 1, 1);
        g2d.fillRect(108 + x, 136 + y, 1, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 2);
        g2d.fillRect(113 + x, 136 + y, 1, 4);
        g2d.fillRect(107 + x, 137 + y, 1, 17);
        g2d.fillRect(110 + x, 137 + y, 1, 15);
        g2d.fillRect(108 + x, 138 + y, 1, 11);
        g2d.fillRect(112 + x, 141 + y, 1, 18);
        g2d.fillRect(113 + x, 141 + y, 1, 11);
        g2d.fillRect(106 + x, 142 + y, 1, 8);
        g2d.fillRect(111 + x, 142 + y, 1, 7);
        g2d.fillRect(105 + x, 143 + y, 1, 4);
        g2d.fillRect(105 + x, 148 + y, 1, 13);
        g2d.fillRect(111 + x, 150 + y, 1, 13);
        g2d.fillRect(106 + x, 151 + y, 1, 11);
        g2d.fillRect(104 + x, 152 + y, 1, 1);
        g2d.fillRect(110 + x, 153 + y, 1, 3);
        g2d.fillRect(113 + x, 153 + y, 1, 7);
        g2d.fillRect(114 + x, 154 + y, 1, 2);
        g2d.fillRect(104 + x, 155 + y, 1, 5);
        g2d.fillRect(108 + x, 156 + y, 1, 3);
        g2d.fillRect(109 + x, 158 + y, 1, 4);
        g2d.fillRect(110 + x, 158 + y, 1, 1);
        g2d.fillRect(115 + x, 158 + y, 1, 1);
        g2d.fillRect(108 + x, 160 + y, 1, 2);
        g2d.fillRect(110 + x, 160 + y, 1, 3);
        g2d.fillRect(112 + x, 160 + y, 1, 1);
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 3);
        g2d.fillRect(116 + x, 163 + y, 1, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 165 + y, 1, 2);
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 166 + y, 1, 1);
        g2d.fillRect(114 + x, 166 + y, 1, 2);
        g2d.fillRect(104 + x, 167 + y, 1, 2);
        g2d.fillRect(108 + x, 167 + y, 1, 1);
        g2d.fillRect(110 + x, 167 + y, 1, 2);
        g2d.fillRect(113 + x, 167 + y, 1, 1);
        g2d.fillRect(103 + x, 168 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 2);
        g2d.fillRect(105 + x, 169 + y, 1, 2);
        g2d.fillRect(111 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 169 + y, 1, 1);
        g2d.fillRect(116 + x, 169 + y, 1, 1);
        g2d.fillRect(109 + x, 170 + y, 1, 1);
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(102 + x, 171 + y, 2, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 2);
        g2d.fillRect(117 + x, 171 + y, 1, 1);
        g2d.fillRect(100 + x, 173 + y, 2, 1);
        g2d.fillRect(109 + x, 173 + y, 2, 1);
        g2d.fillRect(108 + x, 174 + y, 1, 1);
    }

    public void paintBL1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 160 + y, 1, 5);
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 163 + y, 2, 1);
        g2d.fillRect(113 + x, 163 + y, 2, 1);
        g2d.fillRect(102 + x, 164 + y, 1, 1);
        g2d.fillRect(106 + x, 164 + y, 1, 1);
        g2d.fillRect(110 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 166 + y, 1, 1);
        g2d.fillRect(114 + x, 166 + y, 1, 1);
        g2d.fillRect(108 + x, 167 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(101 + x, 169 + y, 1, 1);
        g2d.fillRect(112 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 169 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 2);
        g2d.fillRect(102 + x, 170 + y, 2, 1);
        g2d.fillRect(105 + x, 170 + y, 1, 2);
        g2d.fillRect(107 + x, 170 + y, 1, 1);
        g2d.fillRect(109 + x, 170 + y, 1, 2);
        g2d.fillRect(111 + x, 170 + y, 1, 1);
        g2d.fillRect(103 + x, 171 + y, 1, 1);
        g2d.fillRect(106 + x, 172 + y, 2, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 1, 1);
        g2d.fillRect(99 + x, 174 + y, 1, 1);
        g2d.fillRect(105 + x, 174 + y, 2, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);
        g2d.fillRect(119 + x, 174 + y, 2, 1);
        g2d.fillRect(97 + x, 175 + y, 1, 1);
        g2d.fillRect(108 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 170 + y, 1, 1);
        g2d.fillRect(115 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(102 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 166 + y, 1, 1);
        g2d.fillRect(104 + x, 173 + y, 1, 1);
        g2d.fillRect(118 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 160 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(100 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 167 + y, 1, 1);
        g2d.fillRect(109 + x, 169 + y, 1, 1);
        g2d.fillRect(116 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(105 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(113 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(104 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(113 + x, 159 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 173 + y, 1, 1);
        g2d.fillRect(114 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 1);
        g2d.fillRect(103 + x, 169 + y, 1, 1);
        g2d.fillRect(112 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 162 + y, 1, 1);
        g2d.fillRect(106 + x, 169 + y, 1, 1);
        g2d.fillRect(101 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 84, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(117 + x, 171 + y, 1, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);
        g2d.fillRect(107 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 159 + y, 1, 1);
        g2d.fillRect(114 + x, 174 + y, 1, 1);
        g2d.fillRect(108 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 175 + y, 1, 1);
        g2d.fillRect(106 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 174 + y, 1, 1);
        g2d.fillRect(118 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 176 + y, 1, 1);
        g2d.fillRect(122 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 166 + y, 1, 1);
        g2d.fillRect(119 + x, 172 + y, 1, 1);
        g2d.fillRect(101 + x, 174 + y, 1, 1);
        g2d.fillRect(116 + x, 174 + y, 1, 1);
        g2d.fillRect(102 + x, 175 + y, 2, 1);
        g2d.fillRect(113 + x, 175 + y, 1, 1);
        g2d.fillRect(95 + x, 176 + y, 1, 1);
        g2d.fillRect(105 + x, 176 + y, 1, 1);
        g2d.fillRect(120 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 152 + y, 1, 6);
        g2d.fillRect(117 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 162 + y, 1, 1);
        g2d.fillRect(117 + x, 163 + y, 1, 2);
        g2d.fillRect(98 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 170 + y, 1, 2);
        g2d.fillRect(95 + x, 174 + y, 1, 1);
        g2d.fillRect(122 + x, 174 + y, 1, 1);
        g2d.fillRect(124 + x, 174 + y, 1, 1);
        g2d.fillRect(94 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 89 + y, 1, 44);
        g2d.fillRect(118 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 94 + y, 1, 3);
        g2d.fillRect(116 + x, 97 + y, 1, 5);
        g2d.fillRect(115 + x, 111 + y, 1, 23);
        g2d.fillRect(103 + x, 133 + y, 1, 9);
        g2d.fillRect(117 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 163 + y, 1, 2);
        g2d.fillRect(99 + x, 165 + y, 1, 1);
        g2d.fillRect(97 + x, 169 + y, 1, 1);
        g2d.fillRect(119 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 172 + y, 1, 2);
        g2d.fillRect(94 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 175 + y, 1, 1);
        g2d.fillRect(119 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 106 + y, 1, 5);
        g2d.fillRect(115 + x, 134 + y, 1, 19);
        g2d.fillRect(102 + x, 142 + y, 1, 10);
        g2d.fillRect(116 + x, 153 + y, 1, 6);
        g2d.fillRect(100 + x, 158 + y, 1, 4);
        g2d.fillRect(98 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 167 + y, 1, 2);
        g2d.fillRect(121 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 1, 1);
        g2d.fillRect(98 + x, 175 + y, 1, 1);
        g2d.fillRect(107 + x, 176 + y, 1, 1);
        g2d.fillRect(109 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 166 + y, 1, 1);
        g2d.fillRect(106 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(108 + x, 162 + y, 1, 1);
        g2d.fillRect(104 + x, 167 + y, 1, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 172 + y, 1, 1);
        g2d.fillRect(102 + x, 173 + y, 1, 1);
        g2d.fillRect(103 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 164 + y, 1, 1);
        g2d.fillRect(97 + x, 174 + y, 2, 1);
        g2d.fillRect(104 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 90 + y, 1, 4);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(115 + x, 97 + y, 1, 9);
        g2d.fillRect(115 + x, 166 + y, 1, 1);
        g2d.fillRect(108 + x, 168 + y, 1, 1);
        g2d.fillRect(100 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(116 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 163 + y, 1, 1);
        g2d.fillRect(101 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 159 + y, 1, 1);
        g2d.fillRect(115 + x, 159 + y, 1, 1);
        g2d.fillRect(114 + x, 161 + y, 1, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 168 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 158 + y, 1, 1);
        g2d.fillRect(101 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 160 + y, 1, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 1);
        g2d.fillRect(110 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(98 + x, 169 + y, 1, 1);
        g2d.fillRect(116 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 108 + y, 1, 1);
        g2d.fillRect(106 + x, 155 + y, 1, 1);
        g2d.fillRect(115 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 1, 1);
        g2d.fillRect(99 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 109 + y, 1, 1);
        g2d.fillRect(111 + x, 135 + y, 1, 2);
        g2d.fillRect(111 + x, 140 + y, 1, 1);
        g2d.fillRect(110 + x, 166 + y, 1, 1);
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(107 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(111 + x, 103 + y, 1, 2);
        g2d.fillRect(107 + x, 149 + y, 1, 1);
        g2d.fillRect(106 + x, 156 + y, 1, 2);
        g2d.fillRect(106 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 97 + y, 1, 6);
        g2d.fillRect(111 + x, 105 + y, 1, 4);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 137 + y, 1, 3);
        g2d.fillRect(103 + x, 146 + y, 1, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 6);
        g2d.fillRect(106 + x, 154 + y, 1, 1);
        g2d.fillRect(113 + x, 156 + y, 1, 2);
        g2d.fillRect(115 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 158 + y, 1, 2);
        g2d.fillRect(105 + x, 162 + y, 1, 2);
        g2d.fillRect(110 + x, 163 + y, 1, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(116 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 1);
        g2d.fillRect(108 + x, 171 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 1);
        g2d.fillRect(110 + x, 172 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 94 + y, 1, 39);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 44);
        g2d.fillRect(104 + x, 133 + y, 1, 9);
        g2d.fillRect(103 + x, 142 + y, 1, 4);
        g2d.fillRect(102 + x, 152 + y, 1, 4);
        g2d.fillRect(115 + x, 153 + y, 1, 3);
        g2d.fillRect(116 + x, 161 + y, 1, 2);
        g2d.fillRect(100 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);
        g2d.fillRect(98 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 174 + y, 1, 1);
        g2d.fillRect(95 + x, 175 + y, 1, 1);
        g2d.fillRect(120 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(106 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 1);
        g2d.fillRect(112 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 162 + y, 1, 1);
        g2d.fillRect(116 + x, 163 + y, 1, 1);
        g2d.fillRect(106 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 167 + y, 1, 1);
        g2d.fillRect(99 + x, 168 + y, 1, 1);
        g2d.fillRect(117 + x, 169 + y, 1, 1);
        g2d.fillRect(99 + x, 170 + y, 1, 1);
        g2d.fillRect(115 + x, 170 + y, 1, 1);
        g2d.fillRect(104 + x, 171 + y, 1, 1);
        g2d.fillRect(118 + x, 172 + y, 1, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);
        g2d.fillRect(108 + x, 174 + y, 1, 1);
        g2d.fillRect(113 + x, 174 + y, 1, 1);
        g2d.fillRect(106 + x, 175 + y, 1, 1);
        g2d.fillRect(109 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 161 + y, 1, 1);
        g2d.fillRect(104 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 161 + y, 1, 1);
        g2d.fillRect(113 + x, 162 + y, 1, 1);
        g2d.fillRect(110 + x, 167 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 1);
        g2d.fillRect(104 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 162 + y, 1, 1);
        g2d.fillRect(106 + x, 165 + y, 1, 1);
        g2d.fillRect(100 + x, 167 + y, 1, 1);
        g2d.fillRect(108 + x, 169 + y, 1, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 1);
        g2d.fillRect(112 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 134 + y, 1, 1);
        g2d.fillRect(102 + x, 156 + y, 1, 1);
        g2d.fillRect(98 + x, 171 + y, 1, 1);
        g2d.fillRect(109 + x, 172 + y, 1, 1);
        g2d.fillRect(119 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 22);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 5);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(110 + x, 97 + y, 1, 2);
        g2d.fillRect(114 + x, 97 + y, 1, 9);
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 106 + y, 1, 5);
        g2d.fillRect(109 + x, 108 + y, 2, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(105 + x, 134 + y, 1, 8);
        g2d.fillRect(106 + x, 134 + y, 1, 3);
        g2d.fillRect(107 + x, 135 + y, 1, 1);
        g2d.fillRect(110 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 2, 1);
        g2d.fillRect(109 + x, 136 + y, 1, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 18);
        g2d.fillRect(107 + x, 137 + y, 1, 1);
        g2d.fillRect(110 + x, 138 + y, 1, 4);
        g2d.fillRect(112 + x, 140 + y, 1, 1);
        g2d.fillRect(104 + x, 142 + y, 1, 1);
        g2d.fillRect(103 + x, 147 + y, 1, 5);
        g2d.fillRect(104 + x, 147 + y, 1, 1);
        g2d.fillRect(110 + x, 149 + y, 1, 1);
        g2d.fillRect(105 + x, 150 + y, 1, 1);
        g2d.fillRect(109 + x, 152 + y, 1, 1);
        g2d.fillRect(112 + x, 152 + y, 1, 1);
        g2d.fillRect(103 + x, 153 + y, 1, 2);
        g2d.fillRect(114 + x, 153 + y, 1, 5);
        g2d.fillRect(108 + x, 156 + y, 1, 2);
        g2d.fillRect(109 + x, 156 + y, 1, 2);
        g2d.fillRect(102 + x, 157 + y, 1, 2);
        g2d.fillRect(113 + x, 158 + y, 1, 1);
        g2d.fillRect(107 + x, 159 + y, 1, 1);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(103 + x, 160 + y, 1, 1);
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(103 + x, 164 + y, 1, 2);
        g2d.fillRect(108 + x, 164 + y, 2, 1);
        g2d.fillRect(115 + x, 164 + y, 1, 1);
        g2d.fillRect(100 + x, 166 + y, 2, 1);
        g2d.fillRect(100 + x, 168 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 49);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 86 + y, 1, 10);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 3);
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 18);
        g2d.fillRect(109 + x, 91 + y, 1, 17);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 6);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(110 + x, 93 + y, 1, 4);
        g2d.fillRect(112 + x, 94 + y, 1, 41);
        g2d.fillRect(108 + x, 97 + y, 1, 59);
        g2d.fillRect(110 + x, 99 + y, 1, 4);
        g2d.fillRect(110 + x, 105 + y, 1, 3);
        g2d.fillRect(109 + x, 109 + y, 1, 27);
        g2d.fillRect(106 + x, 111 + y, 1, 23);
        g2d.fillRect(110 + x, 111 + y, 1, 24);
        g2d.fillRect(111 + x, 111 + y, 1, 24);
        g2d.fillRect(113 + x, 111 + y, 1, 23);
        g2d.fillRect(105 + x, 133 + y, 1, 1);
        g2d.fillRect(107 + x, 136 + y, 1, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 2);
        g2d.fillRect(112 + x, 136 + y, 1, 4);
        g2d.fillRect(106 + x, 137 + y, 1, 17);
        g2d.fillRect(109 + x, 137 + y, 1, 15);
        g2d.fillRect(107 + x, 138 + y, 1, 11);
        g2d.fillRect(111 + x, 141 + y, 1, 18);
        g2d.fillRect(112 + x, 141 + y, 1, 11);
        g2d.fillRect(105 + x, 142 + y, 1, 8);
        g2d.fillRect(110 + x, 142 + y, 1, 7);
        g2d.fillRect(104 + x, 143 + y, 1, 4);
        g2d.fillRect(104 + x, 148 + y, 1, 13);
        g2d.fillRect(110 + x, 150 + y, 1, 13);
        g2d.fillRect(105 + x, 151 + y, 1, 11);
        g2d.fillRect(103 + x, 152 + y, 1, 1);
        g2d.fillRect(109 + x, 153 + y, 1, 3);
        g2d.fillRect(112 + x, 153 + y, 1, 7);
        g2d.fillRect(113 + x, 154 + y, 1, 2);
        g2d.fillRect(103 + x, 155 + y, 1, 5);
        g2d.fillRect(107 + x, 156 + y, 1, 3);
        g2d.fillRect(108 + x, 158 + y, 1, 4);
        g2d.fillRect(109 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 158 + y, 1, 1);
        g2d.fillRect(107 + x, 160 + y, 1, 2);
        g2d.fillRect(109 + x, 160 + y, 1, 3);
        g2d.fillRect(111 + x, 160 + y, 1, 1);
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 3);
        g2d.fillRect(115 + x, 163 + y, 1, 1);
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(102 + x, 165 + y, 1, 2);
        g2d.fillRect(104 + x, 165 + y, 1, 1);
        g2d.fillRect(107 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(108 + x, 166 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 2);
        g2d.fillRect(103 + x, 167 + y, 1, 2);
        g2d.fillRect(107 + x, 167 + y, 1, 1);
        g2d.fillRect(109 + x, 167 + y, 1, 2);
        g2d.fillRect(112 + x, 167 + y, 1, 1);
        g2d.fillRect(102 + x, 168 + y, 1, 1);
        g2d.fillRect(106 + x, 168 + y, 1, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 2);
        g2d.fillRect(104 + x, 169 + y, 1, 2);
        g2d.fillRect(110 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 169 + y, 1, 1);
        g2d.fillRect(108 + x, 170 + y, 1, 1);
        g2d.fillRect(112 + x, 170 + y, 1, 1);
        g2d.fillRect(101 + x, 171 + y, 2, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 2);
        g2d.fillRect(116 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 173 + y, 2, 1);
        g2d.fillRect(108 + x, 173 + y, 2, 1);
        g2d.fillRect(107 + x, 174 + y, 1, 1);
    }

    public void paintBL2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 160 + y, 1, 5);
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(106 + x, 163 + y, 2, 1);
        g2d.fillRect(112 + x, 163 + y, 2, 1);
        g2d.fillRect(101 + x, 164 + y, 1, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(109 + x, 164 + y, 1, 1);
        g2d.fillRect(102 + x, 166 + y, 1, 1);
        g2d.fillRect(108 + x, 166 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 167 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 1);
        g2d.fillRect(100 + x, 169 + y, 1, 1);
        g2d.fillRect(111 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 1);
        g2d.fillRect(99 + x, 170 + y, 1, 2);
        g2d.fillRect(101 + x, 170 + y, 2, 1);
        g2d.fillRect(104 + x, 170 + y, 1, 2);
        g2d.fillRect(106 + x, 170 + y, 1, 1);
        g2d.fillRect(108 + x, 170 + y, 1, 2);
        g2d.fillRect(110 + x, 170 + y, 1, 1);
        g2d.fillRect(102 + x, 171 + y, 1, 1);
        g2d.fillRect(105 + x, 172 + y, 2, 1);
        g2d.fillRect(116 + x, 172 + y, 1, 1);
        g2d.fillRect(110 + x, 173 + y, 1, 1);
        g2d.fillRect(98 + x, 174 + y, 1, 1);
        g2d.fillRect(104 + x, 174 + y, 2, 1);
        g2d.fillRect(108 + x, 174 + y, 1, 1);
        g2d.fillRect(118 + x, 174 + y, 2, 1);
        g2d.fillRect(96 + x, 175 + y, 1, 1);
        g2d.fillRect(107 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(101 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 166 + y, 1, 1);
        g2d.fillRect(103 + x, 173 + y, 1, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(107 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(99 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 167 + y, 1, 1);
        g2d.fillRect(108 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(104 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(112 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(103 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(112 + x, 159 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 173 + y, 1, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 163 + y, 1, 1);
        g2d.fillRect(101 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 164 + y, 1, 1);
        g2d.fillRect(100 + x, 167 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 169 + y, 1, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 84, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 165 + y, 1, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 1);
        g2d.fillRect(116 + x, 171 + y, 1, 1);
        g2d.fillRect(110 + x, 174 + y, 1, 1);
        g2d.fillRect(106 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 159 + y, 1, 1);
        g2d.fillRect(97 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(95 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 174 + y, 1, 1);
        g2d.fillRect(107 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 175 + y, 1, 1);
        g2d.fillRect(105 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 174 + y, 1, 1);
        g2d.fillRect(117 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 176 + y, 1, 1);
        g2d.fillRect(121 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 166 + y, 1, 1);
        g2d.fillRect(118 + x, 172 + y, 1, 1);
        g2d.fillRect(100 + x, 174 + y, 1, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);
        g2d.fillRect(101 + x, 175 + y, 2, 1);
        g2d.fillRect(112 + x, 175 + y, 1, 1);
        g2d.fillRect(94 + x, 176 + y, 1, 1);
        g2d.fillRect(104 + x, 176 + y, 1, 1);
        g2d.fillRect(119 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 152 + y, 1, 6);
        g2d.fillRect(116 + x, 160 + y, 1, 2);
        g2d.fillRect(99 + x, 162 + y, 1, 1);
        g2d.fillRect(116 + x, 163 + y, 1, 2);
        g2d.fillRect(97 + x, 168 + y, 1, 1);
        g2d.fillRect(96 + x, 170 + y, 1, 2);
        g2d.fillRect(94 + x, 174 + y, 1, 1);
        g2d.fillRect(121 + x, 174 + y, 1, 1);
        g2d.fillRect(123 + x, 174 + y, 1, 1);
        g2d.fillRect(93 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 47);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 94 + y, 1, 3);
        g2d.fillRect(116 + x, 97 + y, 1, 5);
        g2d.fillRect(115 + x, 111 + y, 1, 23);
        g2d.fillRect(102 + x, 133 + y, 1, 9);
        g2d.fillRect(116 + x, 162 + y, 1, 1);
        g2d.fillRect(97 + x, 163 + y, 1, 2);
        g2d.fillRect(98 + x, 165 + y, 1, 1);
        g2d.fillRect(96 + x, 169 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 1, 1);
        g2d.fillRect(95 + x, 172 + y, 1, 2);
        g2d.fillRect(93 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 175 + y, 1, 1);
        g2d.fillRect(118 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 106 + y, 1, 5);
        g2d.fillRect(115 + x, 134 + y, 1, 9);
        g2d.fillRect(101 + x, 142 + y, 1, 10);
        g2d.fillRect(114 + x, 143 + y, 1, 10);
        g2d.fillRect(115 + x, 153 + y, 1, 6);
        g2d.fillRect(99 + x, 158 + y, 1, 4);
        g2d.fillRect(97 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 167 + y, 1, 2);
        g2d.fillRect(120 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 160 + y, 1, 1);
        g2d.fillRect(116 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 165 + y, 1, 1);
        g2d.fillRect(101 + x, 174 + y, 1, 1);
        g2d.fillRect(116 + x, 174 + y, 1, 1);
        g2d.fillRect(97 + x, 175 + y, 1, 1);
        g2d.fillRect(106 + x, 176 + y, 1, 1);
        g2d.fillRect(108 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 166 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 171 + y, 1, 1);
        g2d.fillRect(95 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(107 + x, 162 + y, 1, 1);
        g2d.fillRect(103 + x, 167 + y, 1, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(110 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 172 + y, 1, 1);
        g2d.fillRect(101 + x, 173 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 164 + y, 1, 1);
        g2d.fillRect(96 + x, 174 + y, 2, 1);
        g2d.fillRect(103 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 8);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 90 + y, 1, 4);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(115 + x, 97 + y, 1, 9);
        g2d.fillRect(114 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);
        g2d.fillRect(99 + x, 169 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);
        g2d.fillRect(95 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(99 + x, 163 + y, 1, 1);
        g2d.fillRect(103 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(101 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 163 + y, 1, 1);
        g2d.fillRect(100 + x, 165 + y, 1, 1);
        g2d.fillRect(98 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 159 + y, 1, 1);
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 162 + y, 1, 1);
        g2d.fillRect(103 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(100 + x, 168 + y, 1, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 158 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 160 + y, 1, 1);
        g2d.fillRect(113 + x, 162 + y, 1, 1);
        g2d.fillRect(106 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 164 + y, 1, 1);
        g2d.fillRect(97 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 155 + y, 1, 1);
        g2d.fillRect(114 + x, 157 + y, 1, 1);
        g2d.fillRect(100 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 1);
        g2d.fillRect(110 + x, 135 + y, 1, 2);
        g2d.fillRect(110 + x, 140 + y, 1, 1);
        g2d.fillRect(109 + x, 166 + y, 1, 1);
        g2d.fillRect(112 + x, 170 + y, 1, 1);
        g2d.fillRect(106 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(106 + x, 149 + y, 1, 1);
        g2d.fillRect(105 + x, 156 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 97 + y, 1, 6);
        g2d.fillRect(110 + x, 105 + y, 1, 4);
        g2d.fillRect(110 + x, 137 + y, 1, 3);
        g2d.fillRect(102 + x, 146 + y, 1, 1);
        g2d.fillRect(106 + x, 150 + y, 1, 6);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(112 + x, 156 + y, 1, 2);
        g2d.fillRect(114 + x, 156 + y, 1, 1);
        g2d.fillRect(100 + x, 158 + y, 1, 1);
        g2d.fillRect(105 + x, 158 + y, 1, 2);
        g2d.fillRect(104 + x, 162 + y, 1, 2);
        g2d.fillRect(109 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(115 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 171 + y, 1, 1);
        g2d.fillRect(97 + x, 172 + y, 1, 1);
        g2d.fillRect(109 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 94 + y, 1, 39);
        g2d.fillRect(114 + x, 126 + y, 1, 17);
        g2d.fillRect(103 + x, 133 + y, 1, 9);
        g2d.fillRect(102 + x, 142 + y, 1, 4);
        g2d.fillRect(113 + x, 143 + y, 1, 10);
        g2d.fillRect(101 + x, 152 + y, 1, 4);
        g2d.fillRect(114 + x, 153 + y, 1, 3);
        g2d.fillRect(115 + x, 161 + y, 1, 2);
        g2d.fillRect(99 + x, 165 + y, 1, 1);
        g2d.fillRect(98 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 170 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 1, 1);
        g2d.fillRect(94 + x, 175 + y, 1, 1);
        g2d.fillRect(119 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 1);
        g2d.fillRect(105 + x, 171 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 162 + y, 1, 1);
        g2d.fillRect(115 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 167 + y, 1, 1);
        g2d.fillRect(115 + x, 167 + y, 1, 1);
        g2d.fillRect(98 + x, 168 + y, 1, 1);
        g2d.fillRect(116 + x, 169 + y, 1, 1);
        g2d.fillRect(98 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 170 + y, 1, 1);
        g2d.fillRect(103 + x, 171 + y, 1, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);
        g2d.fillRect(116 + x, 173 + y, 1, 1);
        g2d.fillRect(107 + x, 174 + y, 1, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);
        g2d.fillRect(105 + x, 175 + y, 1, 1);
        g2d.fillRect(108 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(101 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(109 + x, 170 + y, 1, 1);
        g2d.fillRect(103 + x, 172 + y, 1, 1);
        g2d.fillRect(112 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 167 + y, 1, 1);
        g2d.fillRect(107 + x, 169 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 1);
        g2d.fillRect(104 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 164 + y, 1, 1);
        g2d.fillRect(110 + x, 171 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 134 + y, 1, 1);
        g2d.fillRect(101 + x, 156 + y, 1, 1);
        g2d.fillRect(97 + x, 171 + y, 1, 1);
        g2d.fillRect(108 + x, 172 + y, 1, 1);
        g2d.fillRect(118 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 25);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 5);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 2);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 2, 1);
        g2d.fillRect(109 + x, 109 + y, 1, 2);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 134 + y, 1, 8);
        g2d.fillRect(105 + x, 134 + y, 1, 3);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 1);
        g2d.fillRect(113 + x, 135 + y, 1, 8);
        g2d.fillRect(108 + x, 136 + y, 1, 1);
        g2d.fillRect(106 + x, 137 + y, 1, 1);
        g2d.fillRect(109 + x, 138 + y, 1, 4);
        g2d.fillRect(103 + x, 142 + y, 1, 1);
        g2d.fillRect(112 + x, 143 + y, 1, 11);
        g2d.fillRect(102 + x, 147 + y, 1, 5);
        g2d.fillRect(103 + x, 147 + y, 1, 1);
        g2d.fillRect(109 + x, 149 + y, 1, 1);
        g2d.fillRect(104 + x, 150 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(111 + x, 152 + y, 1, 1);
        g2d.fillRect(102 + x, 153 + y, 1, 2);
        g2d.fillRect(113 + x, 153 + y, 1, 5);
        g2d.fillRect(107 + x, 156 + y, 1, 2);
        g2d.fillRect(108 + x, 156 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 2);
        g2d.fillRect(112 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 159 + y, 1, 1);
        g2d.fillRect(108 + x, 159 + y, 1, 1);
        g2d.fillRect(102 + x, 160 + y, 1, 1);
        g2d.fillRect(113 + x, 160 + y, 1, 1);
        g2d.fillRect(102 + x, 164 + y, 1, 2);
        g2d.fillRect(107 + x, 164 + y, 2, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(99 + x, 166 + y, 2, 1);
        g2d.fillRect(99 + x, 168 + y, 1, 1);
        g2d.fillRect(104 + x, 168 + y, 1, 1);
        g2d.fillRect(96 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 49);
        g2d.fillRect(107 + x, 86 + y, 1, 5);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 10);
        g2d.fillRect(111 + x, 86 + y, 1, 66);
        g2d.fillRect(112 + x, 86 + y, 1, 57);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 39);
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 46);
        g2d.fillRect(108 + x, 91 + y, 1, 17);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 3);
        g2d.fillRect(109 + x, 93 + y, 1, 4);
        g2d.fillRect(107 + x, 97 + y, 1, 59);
        g2d.fillRect(109 + x, 99 + y, 1, 4);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 109 + y, 1, 27);
        g2d.fillRect(105 + x, 111 + y, 1, 23);
        g2d.fillRect(109 + x, 111 + y, 1, 24);
        g2d.fillRect(110 + x, 111 + y, 1, 24);
        g2d.fillRect(104 + x, 133 + y, 1, 1);
        g2d.fillRect(106 + x, 136 + y, 1, 1);
        g2d.fillRect(109 + x, 136 + y, 1, 2);
        g2d.fillRect(105 + x, 137 + y, 1, 17);
        g2d.fillRect(108 + x, 137 + y, 1, 15);
        g2d.fillRect(106 + x, 138 + y, 1, 11);
        g2d.fillRect(110 + x, 141 + y, 1, 18);
        g2d.fillRect(104 + x, 142 + y, 1, 8);
        g2d.fillRect(109 + x, 142 + y, 1, 7);
        g2d.fillRect(103 + x, 143 + y, 1, 4);
        g2d.fillRect(103 + x, 148 + y, 1, 13);
        g2d.fillRect(109 + x, 150 + y, 1, 13);
        g2d.fillRect(104 + x, 151 + y, 1, 11);
        g2d.fillRect(102 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 153 + y, 1, 3);
        g2d.fillRect(111 + x, 153 + y, 1, 7);
        g2d.fillRect(112 + x, 154 + y, 1, 2);
        g2d.fillRect(102 + x, 155 + y, 1, 5);
        g2d.fillRect(106 + x, 156 + y, 1, 3);
        g2d.fillRect(107 + x, 158 + y, 1, 4);
        g2d.fillRect(108 + x, 158 + y, 1, 1);
        g2d.fillRect(113 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 160 + y, 1, 2);
        g2d.fillRect(108 + x, 160 + y, 1, 3);
        g2d.fillRect(110 + x, 160 + y, 1, 1);
        g2d.fillRect(101 + x, 161 + y, 1, 1);
        g2d.fillRect(105 + x, 162 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 1, 3);
        g2d.fillRect(114 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 165 + y, 1, 2);
        g2d.fillRect(103 + x, 165 + y, 1, 1);
        g2d.fillRect(106 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);
        g2d.fillRect(107 + x, 166 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 2);
        g2d.fillRect(102 + x, 167 + y, 1, 2);
        g2d.fillRect(106 + x, 167 + y, 1, 1);
        g2d.fillRect(108 + x, 167 + y, 1, 2);
        g2d.fillRect(111 + x, 167 + y, 1, 1);
        g2d.fillRect(101 + x, 168 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 2);
        g2d.fillRect(103 + x, 169 + y, 1, 2);
        g2d.fillRect(109 + x, 169 + y, 1, 1);
        g2d.fillRect(112 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 169 + y, 1, 1);
        g2d.fillRect(107 + x, 170 + y, 1, 1);
        g2d.fillRect(111 + x, 170 + y, 1, 1);
        g2d.fillRect(100 + x, 171 + y, 2, 1);
        g2d.fillRect(112 + x, 171 + y, 1, 2);
        g2d.fillRect(115 + x, 171 + y, 1, 1);
        g2d.fillRect(98 + x, 173 + y, 2, 1);
        g2d.fillRect(107 + x, 173 + y, 2, 1);
        g2d.fillRect(106 + x, 174 + y, 1, 1);
    }

    public void paintBL3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 160 + y, 1, 5);
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(111 + x, 163 + y, 2, 1);
        g2d.fillRect(102 + x, 164 + y, 1, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(108 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 166 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 1);
        g2d.fillRect(108 + x, 168 + y, 1, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 1);
        g2d.fillRect(101 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 169 + y, 1, 1);
        g2d.fillRect(112 + x, 169 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 2);
        g2d.fillRect(102 + x, 170 + y, 3, 1);
        g2d.fillRect(106 + x, 170 + y, 2, 1);
        g2d.fillRect(109 + x, 170 + y, 1, 1);
        g2d.fillRect(103 + x, 171 + y, 2, 1);
        g2d.fillRect(107 + x, 171 + y, 1, 1);
        g2d.fillRect(105 + x, 172 + y, 2, 1);
        g2d.fillRect(115 + x, 172 + y, 1, 1);
        g2d.fillRect(109 + x, 173 + y, 1, 1);
        g2d.fillRect(99 + x, 174 + y, 1, 1);
        g2d.fillRect(104 + x, 174 + y, 2, 1);
        g2d.fillRect(107 + x, 174 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 2, 1);
        g2d.fillRect(97 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 170 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(102 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 166 + y, 1, 1);
        g2d.fillRect(116 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(100 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 167 + y, 1, 1);
        g2d.fillRect(107 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(104 + x, 167 + y, 1, 1);
        g2d.fillRect(115 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(111 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(111 + x, 159 + y, 1, 1);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(108 + x, 173 + y, 1, 1);
        g2d.fillRect(112 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 1);
        g2d.fillRect(103 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 169 + y, 1, 1);
        g2d.fillRect(101 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 171 + y, 1, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);
        g2d.fillRect(106 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 175 + y, 1, 1);
        g2d.fillRect(105 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 174 + y, 1, 1);
        g2d.fillRect(116 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 176 + y, 1, 1);
        g2d.fillRect(120 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 166 + y, 1, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);
        g2d.fillRect(101 + x, 174 + y, 1, 1);
        g2d.fillRect(114 + x, 174 + y, 1, 1);
        g2d.fillRect(102 + x, 175 + y, 2, 1);
        g2d.fillRect(111 + x, 175 + y, 1, 1);
        g2d.fillRect(95 + x, 176 + y, 1, 1);
        g2d.fillRect(104 + x, 176 + y, 1, 1);
        g2d.fillRect(118 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 152 + y, 1, 6);
        g2d.fillRect(115 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 162 + y, 1, 1);
        g2d.fillRect(115 + x, 163 + y, 1, 2);
        g2d.fillRect(98 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 170 + y, 1, 2);
        g2d.fillRect(95 + x, 174 + y, 1, 1);
        g2d.fillRect(120 + x, 174 + y, 1, 1);
        g2d.fillRect(122 + x, 174 + y, 1, 1);
        g2d.fillRect(94 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 47);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 94 + y, 1, 3);
        g2d.fillRect(116 + x, 97 + y, 1, 5);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 22);
        g2d.fillRect(102 + x, 133 + y, 1, 9);
        g2d.fillRect(115 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 163 + y, 1, 2);
        g2d.fillRect(99 + x, 165 + y, 1, 1);
        g2d.fillRect(97 + x, 169 + y, 1, 1);
        g2d.fillRect(117 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 172 + y, 1, 2);
        g2d.fillRect(94 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 175 + y, 1, 1);
        g2d.fillRect(117 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 106 + y, 1, 5);
        g2d.fillRect(114 + x, 134 + y, 1, 9);
        g2d.fillRect(101 + x, 142 + y, 1, 10);
        g2d.fillRect(113 + x, 143 + y, 1, 10);
        g2d.fillRect(114 + x, 153 + y, 1, 6);
        g2d.fillRect(100 + x, 158 + y, 1, 4);
        g2d.fillRect(98 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 167 + y, 1, 2);
        g2d.fillRect(119 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);
        g2d.fillRect(98 + x, 175 + y, 1, 1);
        g2d.fillRect(106 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 166 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(113 + x, 171 + y, 1, 1);
        g2d.fillRect(109 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 172 + y, 1, 1);
        g2d.fillRect(102 + x, 173 + y, 1, 1);
        g2d.fillRect(103 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 164 + y, 1, 1);
        g2d.fillRect(97 + x, 174 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 8);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 90 + y, 1, 4);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(115 + x, 97 + y, 1, 9);
        g2d.fillRect(113 + x, 166 + y, 1, 1);
        g2d.fillRect(100 + x, 169 + y, 1, 1);
        g2d.fillRect(108 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 163 + y, 1, 1);
        g2d.fillRect(101 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 168 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 158 + y, 1, 1);
        g2d.fillRect(101 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 160 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(106 + x, 168 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 1);
        g2d.fillRect(108 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(98 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 155 + y, 1, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 1, 1);
        g2d.fillRect(99 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 2);
        g2d.fillRect(109 + x, 140 + y, 1, 1);
        g2d.fillRect(108 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 170 + y, 1, 1);
        g2d.fillRect(106 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(106 + x, 149 + y, 1, 1);
        g2d.fillRect(105 + x, 156 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 97 + y, 1, 6);
        g2d.fillRect(110 + x, 105 + y, 1, 4);
        g2d.fillRect(109 + x, 137 + y, 1, 3);
        g2d.fillRect(102 + x, 146 + y, 1, 1);
        g2d.fillRect(106 + x, 150 + y, 1, 6);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(111 + x, 156 + y, 1, 2);
        g2d.fillRect(113 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 2);
        g2d.fillRect(108 + x, 163 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 166 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 1);
        g2d.fillRect(108 + x, 172 + y, 1, 1);
        g2d.fillRect(112 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 94 + y, 1, 39);
        g2d.fillRect(113 + x, 126 + y, 1, 17);
        g2d.fillRect(103 + x, 133 + y, 1, 9);
        g2d.fillRect(102 + x, 142 + y, 1, 4);
        g2d.fillRect(112 + x, 143 + y, 1, 10);
        g2d.fillRect(101 + x, 152 + y, 1, 4);
        g2d.fillRect(113 + x, 153 + y, 1, 3);
        g2d.fillRect(114 + x, 161 + y, 1, 2);
        g2d.fillRect(100 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 167 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);
        g2d.fillRect(98 + x, 170 + y, 1, 1);
        g2d.fillRect(116 + x, 174 + y, 1, 1);
        g2d.fillRect(95 + x, 175 + y, 1, 1);
        g2d.fillRect(118 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 1);
        g2d.fillRect(107 + x, 165 + y, 1, 1);
        g2d.fillRect(105 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 1);
        g2d.fillRect(110 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 162 + y, 1, 1);
        g2d.fillRect(114 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 167 + y, 1, 1);
        g2d.fillRect(114 + x, 167 + y, 1, 1);
        g2d.fillRect(99 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 169 + y, 1, 1);
        g2d.fillRect(99 + x, 170 + y, 1, 1);
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(116 + x, 172 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 1, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);
        g2d.fillRect(105 + x, 175 + y, 1, 1);
        g2d.fillRect(107 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 161 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 1);
        g2d.fillRect(108 + x, 167 + y, 1, 1);
        g2d.fillRect(108 + x, 170 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(100 + x, 167 + y, 1, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 1);
        g2d.fillRect(104 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 164 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);
        g2d.fillRect(110 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 134 + y, 1, 1);
        g2d.fillRect(101 + x, 156 + y, 1, 1);
        g2d.fillRect(98 + x, 171 + y, 1, 1);
        g2d.fillRect(107 + x, 172 + y, 1, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 25);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 5);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 2);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 2, 1);
        g2d.fillRect(109 + x, 109 + y, 1, 2);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 134 + y, 1, 8);
        g2d.fillRect(105 + x, 134 + y, 1, 3);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 1, 8);
        g2d.fillRect(108 + x, 136 + y, 1, 1);
        g2d.fillRect(106 + x, 137 + y, 1, 1);
        g2d.fillRect(103 + x, 142 + y, 1, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 11);
        g2d.fillRect(102 + x, 147 + y, 1, 5);
        g2d.fillRect(103 + x, 147 + y, 1, 1);
        g2d.fillRect(104 + x, 150 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 1);
        g2d.fillRect(102 + x, 153 + y, 1, 2);
        g2d.fillRect(112 + x, 153 + y, 1, 5);
        g2d.fillRect(107 + x, 156 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 1);
        g2d.fillRect(102 + x, 158 + y, 1, 1);
        g2d.fillRect(111 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 159 + y, 2, 1);
        g2d.fillRect(103 + x, 160 + y, 1, 1);
        g2d.fillRect(112 + x, 160 + y, 1, 1);
        g2d.fillRect(103 + x, 164 + y, 1, 2);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(100 + x, 166 + y, 2, 1);
        g2d.fillRect(100 + x, 168 + y, 1, 1);
        g2d.fillRect(104 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 49);
        g2d.fillRect(107 + x, 86 + y, 1, 5);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 10);
        g2d.fillRect(111 + x, 86 + y, 1, 57);
        g2d.fillRect(112 + x, 86 + y, 1, 48);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 25);
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 38);
        g2d.fillRect(108 + x, 91 + y, 1, 17);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 3);
        g2d.fillRect(109 + x, 93 + y, 1, 4);
        g2d.fillRect(107 + x, 97 + y, 1, 59);
        g2d.fillRect(109 + x, 99 + y, 1, 4);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 109 + y, 1, 27);
        g2d.fillRect(105 + x, 111 + y, 1, 23);
        g2d.fillRect(109 + x, 111 + y, 1, 24);
        g2d.fillRect(110 + x, 111 + y, 1, 41);
        g2d.fillRect(104 + x, 133 + y, 1, 1);
        g2d.fillRect(106 + x, 136 + y, 1, 1);
        g2d.fillRect(105 + x, 137 + y, 1, 17);
        g2d.fillRect(108 + x, 137 + y, 1, 15);
        g2d.fillRect(106 + x, 138 + y, 1, 11);
        g2d.fillRect(109 + x, 141 + y, 1, 18);
        g2d.fillRect(104 + x, 142 + y, 1, 8);
        g2d.fillRect(103 + x, 143 + y, 1, 4);
        g2d.fillRect(103 + x, 148 + y, 1, 12);
        g2d.fillRect(104 + x, 151 + y, 1, 11);
        g2d.fillRect(102 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 153 + y, 1, 10);
        g2d.fillRect(110 + x, 153 + y, 1, 7);
        g2d.fillRect(111 + x, 154 + y, 1, 2);
        g2d.fillRect(102 + x, 155 + y, 1, 3);
        g2d.fillRect(106 + x, 156 + y, 1, 3);
        g2d.fillRect(105 + x, 158 + y, 1, 2);
        g2d.fillRect(107 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 160 + y, 1, 2);
        g2d.fillRect(107 + x, 160 + y, 1, 3);
        g2d.fillRect(109 + x, 160 + y, 1, 1);
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(105 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 1, 3);
        g2d.fillRect(113 + x, 163 + y, 1, 1);
        g2d.fillRect(111 + x, 164 + y, 1, 1);
        g2d.fillRect(102 + x, 165 + y, 1, 2);
        g2d.fillRect(106 + x, 165 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 2);
        g2d.fillRect(103 + x, 167 + y, 1, 2);
        g2d.fillRect(106 + x, 167 + y, 2, 1);
        g2d.fillRect(110 + x, 167 + y, 1, 1);
        g2d.fillRect(102 + x, 168 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 2);
        g2d.fillRect(108 + x, 169 + y, 1, 1);
        g2d.fillRect(111 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 1);
        g2d.fillRect(101 + x, 171 + y, 2, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 2);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 173 + y, 2, 1);
        g2d.fillRect(107 + x, 173 + y, 1, 1);
        g2d.fillRect(106 + x, 174 + y, 1, 1);
    }

    public void paintBL4(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 160 + y, 1, 5);
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 163 + y, 2, 1);
        g2d.fillRect(102 + x, 164 + y, 1, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 166 + y, 1, 1);
        g2d.fillRect(106 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(101 + x, 169 + y, 1, 1);
        g2d.fillRect(109 + x, 169 + y, 1, 1);
        g2d.fillRect(111 + x, 169 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 2);
        g2d.fillRect(102 + x, 170 + y, 3, 1);
        g2d.fillRect(106 + x, 170 + y, 1, 2);
        g2d.fillRect(108 + x, 170 + y, 1, 1);
        g2d.fillRect(103 + x, 171 + y, 2, 1);
        g2d.fillRect(105 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 1, 1);
        g2d.fillRect(108 + x, 173 + y, 1, 1);
        g2d.fillRect(99 + x, 174 + y, 1, 1);
        g2d.fillRect(104 + x, 174 + y, 3, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);
        g2d.fillRect(97 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(102 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(100 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 169 + y, 1, 1);
        g2d.fillRect(112 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(104 + x, 167 + y, 1, 1);
        g2d.fillRect(113 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(110 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 1);
        g2d.fillRect(107 + x, 173 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 1);
        g2d.fillRect(103 + x, 169 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 169 + y, 1, 1);
        g2d.fillRect(101 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 1);
        g2d.fillRect(108 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(96 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 159 + y, 1, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 175 + y, 1, 1);
        g2d.fillRect(105 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 176 + y, 1, 1);
        g2d.fillRect(117 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 166 + y, 1, 1);
        g2d.fillRect(115 + x, 172 + y, 1, 1);
        g2d.fillRect(101 + x, 174 + y, 1, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);
        g2d.fillRect(102 + x, 175 + y, 2, 1);
        g2d.fillRect(110 + x, 175 + y, 1, 1);
        g2d.fillRect(95 + x, 176 + y, 1, 1);
        g2d.fillRect(104 + x, 176 + y, 1, 1);
        g2d.fillRect(115 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 152 + y, 1, 6);
        g2d.fillRect(113 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 162 + y, 1, 1);
        g2d.fillRect(113 + x, 163 + y, 1, 2);
        g2d.fillRect(98 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 170 + y, 1, 2);
        g2d.fillRect(95 + x, 174 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 2, 1);
        g2d.fillRect(94 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 47);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 94 + y, 1, 3);
        g2d.fillRect(116 + x, 97 + y, 1, 5);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 11);
        g2d.fillRect(113 + x, 123 + y, 1, 11);
        g2d.fillRect(102 + x, 133 + y, 1, 9);
        g2d.fillRect(113 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 163 + y, 1, 2);
        g2d.fillRect(99 + x, 165 + y, 1, 1);
        g2d.fillRect(97 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 172 + y, 1, 2);
        g2d.fillRect(94 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 106 + y, 1, 5);
        g2d.fillRect(113 + x, 134 + y, 1, 9);
        g2d.fillRect(101 + x, 142 + y, 1, 10);
        g2d.fillRect(112 + x, 143 + y, 1, 16);
        g2d.fillRect(100 + x, 158 + y, 1, 4);
        g2d.fillRect(98 + x, 167 + y, 1, 1);
        g2d.fillRect(114 + x, 167 + y, 1, 2);
        g2d.fillRect(116 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 160 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);
        g2d.fillRect(113 + x, 174 + y, 1, 1);
        g2d.fillRect(98 + x, 175 + y, 1, 1);
        g2d.fillRect(106 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 166 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 167 + y, 1, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(108 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 172 + y, 1, 1);
        g2d.fillRect(102 + x, 173 + y, 1, 1);
        g2d.fillRect(103 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(100 + x, 164 + y, 1, 1);
        g2d.fillRect(97 + x, 174 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 8);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 90 + y, 1, 4);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(115 + x, 97 + y, 1, 9);
        g2d.fillRect(100 + x, 169 + y, 1, 1);
        g2d.fillRect(107 + x, 171 + y, 1, 1);
        g2d.fillRect(96 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 163 + y, 1, 1);
        g2d.fillRect(101 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 159 + y, 1, 1);
        g2d.fillRect(111 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 168 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 160 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 1);
        g2d.fillRect(107 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 164 + y, 1, 1);
        g2d.fillRect(98 + x, 169 + y, 1, 1);
        g2d.fillRect(112 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 155 + y, 1, 1);
        g2d.fillRect(111 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 1, 1);
        g2d.fillRect(99 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 1);
        g2d.fillRect(108 + x, 135 + y, 1, 2);
        g2d.fillRect(108 + x, 140 + y, 1, 1);
        g2d.fillRect(107 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(105 + x, 156 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 97 + y, 1, 6);
        g2d.fillRect(110 + x, 105 + y, 1, 4);
        g2d.fillRect(108 + x, 137 + y, 1, 3);
        g2d.fillRect(102 + x, 146 + y, 1, 1);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(109 + x, 156 + y, 1, 2);
        g2d.fillRect(111 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 2);
        g2d.fillRect(107 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 166 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 1);
        g2d.fillRect(107 + x, 172 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 94 + y, 1, 39);
        g2d.fillRect(112 + x, 126 + y, 1, 17);
        g2d.fillRect(103 + x, 133 + y, 1, 9);
        g2d.fillRect(102 + x, 142 + y, 1, 4);
        g2d.fillRect(111 + x, 143 + y, 1, 13);
        g2d.fillRect(101 + x, 152 + y, 1, 4);
        g2d.fillRect(112 + x, 161 + y, 1, 2);
        g2d.fillRect(100 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 167 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(98 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 174 + y, 1, 1);
        g2d.fillRect(95 + x, 175 + y, 1, 1);
        g2d.fillRect(115 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 1);
        g2d.fillRect(106 + x, 165 + y, 1, 1);
        g2d.fillRect(105 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 1);
        g2d.fillRect(109 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 167 + y, 1, 1);
        g2d.fillRect(112 + x, 167 + y, 1, 1);
        g2d.fillRect(99 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 1);
        g2d.fillRect(99 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);
        g2d.fillRect(110 + x, 174 + y, 1, 1);
        g2d.fillRect(105 + x, 175 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 161 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 167 + y, 1, 1);
        g2d.fillRect(107 + x, 170 + y, 1, 1);
        g2d.fillRect(110 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(100 + x, 167 + y, 1, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 1);
        g2d.fillRect(104 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 171 + y, 1, 1);
        g2d.fillRect(109 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 134 + y, 1, 1);
        g2d.fillRect(101 + x, 156 + y, 1, 1);
        g2d.fillRect(98 + x, 171 + y, 1, 1);
        g2d.fillRect(106 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 25);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 5);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 2);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 2, 1);
        g2d.fillRect(109 + x, 109 + y, 1, 2);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 134 + y, 1, 8);
        g2d.fillRect(105 + x, 134 + y, 1, 3);
        g2d.fillRect(111 + x, 135 + y, 1, 8);
        g2d.fillRect(107 + x, 136 + y, 1, 1);
        g2d.fillRect(103 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 143 + y, 1, 16);
        g2d.fillRect(102 + x, 147 + y, 1, 5);
        g2d.fillRect(103 + x, 147 + y, 1, 1);
        g2d.fillRect(104 + x, 150 + y, 1, 1);
        g2d.fillRect(107 + x, 152 + y, 1, 1);
        g2d.fillRect(109 + x, 152 + y, 1, 2);
        g2d.fillRect(102 + x, 153 + y, 1, 2);
        g2d.fillRect(106 + x, 156 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 1);
        g2d.fillRect(102 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 159 + y, 1, 1);
        g2d.fillRect(103 + x, 160 + y, 1, 1);
        g2d.fillRect(111 + x, 160 + y, 1, 1);
        g2d.fillRect(103 + x, 164 + y, 1, 2);
        g2d.fillRect(106 + x, 164 + y, 1, 1);
        g2d.fillRect(100 + x, 166 + y, 2, 1);
        g2d.fillRect(100 + x, 168 + y, 1, 1);
        g2d.fillRect(104 + x, 168 + y, 1, 1);
        g2d.fillRect(97 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 70);
        g2d.fillRect(107 + x, 86 + y, 1, 5);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 10);
        g2d.fillRect(111 + x, 86 + y, 1, 48);
        g2d.fillRect(112 + x, 86 + y, 1, 40);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 25);
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 35);
        g2d.fillRect(108 + x, 91 + y, 1, 17);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 3);
        g2d.fillRect(109 + x, 93 + y, 1, 4);
        g2d.fillRect(107 + x, 97 + y, 1, 39);
        g2d.fillRect(109 + x, 99 + y, 1, 4);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 109 + y, 1, 26);
        g2d.fillRect(105 + x, 111 + y, 1, 23);
        g2d.fillRect(109 + x, 111 + y, 1, 41);
        g2d.fillRect(110 + x, 111 + y, 1, 32);
        g2d.fillRect(104 + x, 133 + y, 1, 1);
        g2d.fillRect(105 + x, 137 + y, 1, 17);
        g2d.fillRect(107 + x, 137 + y, 1, 15);
        g2d.fillRect(108 + x, 141 + y, 1, 18);
        g2d.fillRect(104 + x, 142 + y, 1, 8);
        g2d.fillRect(103 + x, 143 + y, 1, 4);
        g2d.fillRect(103 + x, 148 + y, 1, 12);
        g2d.fillRect(104 + x, 151 + y, 1, 11);
        g2d.fillRect(102 + x, 152 + y, 1, 1);
        g2d.fillRect(107 + x, 153 + y, 1, 10);
        g2d.fillRect(109 + x, 154 + y, 1, 2);
        g2d.fillRect(102 + x, 155 + y, 1, 3);
        g2d.fillRect(105 + x, 158 + y, 1, 2);
        g2d.fillRect(106 + x, 158 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 2);
        g2d.fillRect(111 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 160 + y, 1, 3);
        g2d.fillRect(108 + x, 160 + y, 1, 1);
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(105 + x, 162 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 1, 3);
        g2d.fillRect(110 + x, 164 + y, 1, 1);
        g2d.fillRect(102 + x, 165 + y, 1, 2);
        g2d.fillRect(107 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 166 + y, 1, 2);
        g2d.fillRect(103 + x, 167 + y, 1, 2);
        g2d.fillRect(106 + x, 167 + y, 1, 2);
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(102 + x, 168 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);
        g2d.fillRect(108 + x, 168 + y, 1, 2);
        g2d.fillRect(107 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 169 + y, 1, 1);
        g2d.fillRect(109 + x, 170 + y, 1, 1);
        g2d.fillRect(101 + x, 171 + y, 2, 1);
        g2d.fillRect(110 + x, 171 + y, 1, 2);
        g2d.fillRect(112 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 173 + y, 2, 1);
        g2d.fillRect(106 + x, 173 + y, 1, 1);
    }

    public void paintBR1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 160 + y, 1, 5);
        g2d.fillRect(105 + x, 161 + y, 1, 1);
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 2, 1);
        g2d.fillRect(115 + x, 163 + y, 2, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 1);
        g2d.fillRect(108 + x, 164 + y, 1, 1);
        g2d.fillRect(112 + x, 164 + y, 1, 1);
        g2d.fillRect(105 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(116 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 167 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);
        g2d.fillRect(103 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 169 + y, 1, 1);
        g2d.fillRect(116 + x, 169 + y, 1, 1);
        g2d.fillRect(102 + x, 170 + y, 1, 2);
        g2d.fillRect(104 + x, 170 + y, 2, 1);
        g2d.fillRect(107 + x, 170 + y, 1, 2);
        g2d.fillRect(109 + x, 170 + y, 1, 1);
        g2d.fillRect(111 + x, 170 + y, 1, 2);
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(105 + x, 171 + y, 1, 1);
        g2d.fillRect(108 + x, 172 + y, 2, 1);
        g2d.fillRect(119 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);
        g2d.fillRect(101 + x, 174 + y, 1, 1);
        g2d.fillRect(107 + x, 174 + y, 2, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);
        g2d.fillRect(121 + x, 174 + y, 2, 1);
        g2d.fillRect(99 + x, 175 + y, 1, 1);
        g2d.fillRect(110 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 170 + y, 1, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(104 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 166 + y, 1, 1);
        g2d.fillRect(106 + x, 173 + y, 1, 1);
        g2d.fillRect(120 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 160 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(102 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 167 + y, 1, 1);
        g2d.fillRect(111 + x, 169 + y, 1, 1);
        g2d.fillRect(118 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(107 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(115 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(106 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(115 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 173 + y, 1, 1);
        g2d.fillRect(116 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 167 + y, 1, 1);
        g2d.fillRect(105 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 162 + y, 1, 1);
        g2d.fillRect(108 + x, 169 + y, 1, 1);
        g2d.fillRect(103 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 84, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 165 + y, 1, 1);
        g2d.fillRect(116 + x, 171 + y, 1, 1);
        g2d.fillRect(119 + x, 171 + y, 1, 1);
        g2d.fillRect(113 + x, 174 + y, 1, 1);
        g2d.fillRect(109 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(98 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 174 + y, 1, 1);
        g2d.fillRect(110 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 175 + y, 1, 1);
        g2d.fillRect(108 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 174 + y, 1, 1);
        g2d.fillRect(120 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(123 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(122 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 176 + y, 1, 1);
        g2d.fillRect(124 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 166 + y, 1, 1);
        g2d.fillRect(121 + x, 172 + y, 1, 1);
        g2d.fillRect(103 + x, 174 + y, 1, 1);
        g2d.fillRect(118 + x, 174 + y, 1, 1);
        g2d.fillRect(104 + x, 175 + y, 2, 1);
        g2d.fillRect(115 + x, 175 + y, 1, 1);
        g2d.fillRect(97 + x, 176 + y, 1, 1);
        g2d.fillRect(107 + x, 176 + y, 1, 1);
        g2d.fillRect(122 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 152 + y, 1, 6);
        g2d.fillRect(119 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 162 + y, 1, 1);
        g2d.fillRect(119 + x, 163 + y, 1, 2);
        g2d.fillRect(100 + x, 168 + y, 1, 1);
        g2d.fillRect(99 + x, 170 + y, 1, 2);
        g2d.fillRect(97 + x, 174 + y, 1, 1);
        g2d.fillRect(124 + x, 174 + y, 1, 1);
        g2d.fillRect(126 + x, 174 + y, 1, 1);
        g2d.fillRect(96 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 89 + y, 1, 5);
        g2d.fillRect(118 + x, 89 + y, 1, 8);
        g2d.fillRect(105 + x, 94 + y, 1, 12);
        g2d.fillRect(117 + x, 97 + y, 1, 5);
        g2d.fillRect(106 + x, 106 + y, 1, 27);
        g2d.fillRect(117 + x, 111 + y, 1, 23);
        g2d.fillRect(105 + x, 133 + y, 1, 9);
        g2d.fillRect(119 + x, 162 + y, 1, 1);
        g2d.fillRect(100 + x, 163 + y, 1, 2);
        g2d.fillRect(101 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 169 + y, 1, 1);
        g2d.fillRect(121 + x, 171 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 2);
        g2d.fillRect(96 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 175 + y, 1, 1);
        g2d.fillRect(121 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 102 + y, 1, 9);
        g2d.fillRect(117 + x, 134 + y, 1, 19);
        g2d.fillRect(104 + x, 142 + y, 1, 10);
        g2d.fillRect(118 + x, 153 + y, 1, 6);
        g2d.fillRect(102 + x, 158 + y, 1, 4);
        g2d.fillRect(100 + x, 167 + y, 1, 1);
        g2d.fillRect(120 + x, 167 + y, 1, 2);
        g2d.fillRect(123 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 160 + y, 1, 1);
        g2d.fillRect(119 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 165 + y, 1, 1);
        g2d.fillRect(104 + x, 174 + y, 1, 1);
        g2d.fillRect(119 + x, 174 + y, 1, 1);
        g2d.fillRect(100 + x, 175 + y, 1, 1);
        g2d.fillRect(109 + x, 176 + y, 1, 1);
        g2d.fillRect(111 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 166 + y, 1, 1);
        g2d.fillRect(108 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 167 + y, 1, 1);
        g2d.fillRect(120 + x, 171 + y, 1, 1);
        g2d.fillRect(98 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(110 + x, 162 + y, 1, 1);
        g2d.fillRect(106 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 171 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 172 + y, 1, 1);
        g2d.fillRect(104 + x, 173 + y, 1, 1);
        g2d.fillRect(105 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 164 + y, 1, 1);
        g2d.fillRect(99 + x, 174 + y, 2, 1);
        g2d.fillRect(106 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 90 + y, 1, 7);
        g2d.fillRect(116 + x, 97 + y, 1, 9);
        g2d.fillRect(117 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);
        g2d.fillRect(112 + x, 171 + y, 1, 1);
        g2d.fillRect(98 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 159 + y, 1, 1);
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(106 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(104 + x, 163 + y, 1, 1);
        g2d.fillRect(118 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(103 + x, 165 + y, 1, 1);
        g2d.fillRect(101 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 161 + y, 1, 1);
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(106 + x, 164 + y, 1, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 168 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 158 + y, 1, 1);
        g2d.fillRect(103 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 160 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);
        g2d.fillRect(116 + x, 168 + y, 1, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 164 + y, 1, 1);
        g2d.fillRect(100 + x, 169 + y, 1, 1);
        g2d.fillRect(118 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(117 + x, 157 + y, 1, 1);
        g2d.fillRect(103 + x, 159 + y, 1, 1);
        g2d.fillRect(101 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 135 + y, 1, 2);
        g2d.fillRect(113 + x, 140 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 1);
        g2d.fillRect(115 + x, 170 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(109 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 156 + y, 1, 2);
        g2d.fillRect(108 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 97 + y, 1, 6);
        g2d.fillRect(112 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 106 + y, 1, 3);
        g2d.fillRect(116 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 137 + y, 1, 3);
        g2d.fillRect(105 + x, 146 + y, 1, 1);
        g2d.fillRect(109 + x, 150 + y, 1, 6);
        g2d.fillRect(108 + x, 154 + y, 1, 1);
        g2d.fillRect(115 + x, 156 + y, 1, 2);
        g2d.fillRect(117 + x, 156 + y, 1, 1);
        g2d.fillRect(103 + x, 158 + y, 1, 1);
        g2d.fillRect(108 + x, 158 + y, 1, 2);
        g2d.fillRect(107 + x, 162 + y, 1, 2);
        g2d.fillRect(112 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 165 + y, 1, 1);
        g2d.fillRect(118 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 171 + y, 1, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 1);
        g2d.fillRect(112 + x, 172 + y, 1, 1);
        g2d.fillRect(116 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 94 + y, 1, 12);
        g2d.fillRect(107 + x, 106 + y, 1, 27);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 44);
        g2d.fillRect(106 + x, 133 + y, 1, 9);
        g2d.fillRect(105 + x, 142 + y, 1, 4);
        g2d.fillRect(104 + x, 152 + y, 1, 4);
        g2d.fillRect(117 + x, 153 + y, 1, 3);
        g2d.fillRect(118 + x, 161 + y, 1, 2);
        g2d.fillRect(102 + x, 165 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 168 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 1);
        g2d.fillRect(120 + x, 174 + y, 1, 1);
        g2d.fillRect(97 + x, 175 + y, 1, 1);
        g2d.fillRect(122 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);
        g2d.fillRect(108 + x, 171 + y, 1, 1);
        g2d.fillRect(101 + x, 172 + y, 1, 1);
        g2d.fillRect(114 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 162 + y, 1, 1);
        g2d.fillRect(118 + x, 163 + y, 1, 1);
        g2d.fillRect(108 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 167 + y, 1, 1);
        g2d.fillRect(101 + x, 168 + y, 1, 1);
        g2d.fillRect(119 + x, 169 + y, 1, 1);
        g2d.fillRect(101 + x, 170 + y, 1, 1);
        g2d.fillRect(117 + x, 170 + y, 1, 1);
        g2d.fillRect(106 + x, 171 + y, 1, 1);
        g2d.fillRect(120 + x, 172 + y, 1, 1);
        g2d.fillRect(119 + x, 173 + y, 1, 1);
        g2d.fillRect(110 + x, 174 + y, 1, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);
        g2d.fillRect(108 + x, 175 + y, 1, 1);
        g2d.fillRect(111 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 161 + y, 1, 1);
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 161 + y, 1, 1);
        g2d.fillRect(113 + x, 161 + y, 1, 1);
        g2d.fillRect(115 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 167 + y, 1, 1);
        g2d.fillRect(112 + x, 170 + y, 1, 1);
        g2d.fillRect(106 + x, 172 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 167 + y, 1, 1);
        g2d.fillRect(110 + x, 169 + y, 1, 1);
        g2d.fillRect(102 + x, 172 + y, 1, 1);
        g2d.fillRect(107 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 134 + y, 1, 1);
        g2d.fillRect(104 + x, 156 + y, 1, 1);
        g2d.fillRect(100 + x, 171 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 1, 1);
        g2d.fillRect(121 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 5);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 7);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 12);
        g2d.fillRect(109 + x, 95 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 97 + y, 1, 14);
        g2d.fillRect(111 + x, 103 + y, 1, 2);
        g2d.fillRect(108 + x, 106 + y, 1, 5);
        g2d.fillRect(111 + x, 108 + y, 2, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 1, 1);
        g2d.fillRect(107 + x, 134 + y, 1, 8);
        g2d.fillRect(108 + x, 134 + y, 1, 3);
        g2d.fillRect(109 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 1, 1);
        g2d.fillRect(114 + x, 135 + y, 2, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
        g2d.fillRect(115 + x, 136 + y, 1, 18);
        g2d.fillRect(109 + x, 137 + y, 1, 1);
        g2d.fillRect(112 + x, 138 + y, 1, 4);
        g2d.fillRect(114 + x, 140 + y, 1, 1);
        g2d.fillRect(106 + x, 142 + y, 1, 1);
        g2d.fillRect(105 + x, 147 + y, 1, 5);
        g2d.fillRect(106 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 1);
        g2d.fillRect(111 + x, 152 + y, 1, 1);
        g2d.fillRect(114 + x, 152 + y, 1, 1);
        g2d.fillRect(105 + x, 153 + y, 1, 2);
        g2d.fillRect(116 + x, 153 + y, 1, 5);
        g2d.fillRect(110 + x, 156 + y, 1, 2);
        g2d.fillRect(111 + x, 156 + y, 1, 2);
        g2d.fillRect(104 + x, 157 + y, 1, 2);
        g2d.fillRect(115 + x, 158 + y, 1, 1);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(111 + x, 159 + y, 1, 1);
        g2d.fillRect(105 + x, 160 + y, 1, 1);
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 2);
        g2d.fillRect(110 + x, 164 + y, 2, 1);
        g2d.fillRect(117 + x, 164 + y, 1, 1);
        g2d.fillRect(102 + x, 166 + y, 2, 1);
        g2d.fillRect(102 + x, 168 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 8);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 86 + y, 1, 11);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 3);
        g2d.fillRect(115 + x, 87 + y, 1, 10);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 18);
        g2d.fillRect(109 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 44);
        g2d.fillRect(108 + x, 92 + y, 1, 14);
        g2d.fillRect(110 + x, 93 + y, 1, 63);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 38);
        g2d.fillRect(111 + x, 99 + y, 1, 4);
        g2d.fillRect(111 + x, 105 + y, 1, 3);
        g2d.fillRect(112 + x, 106 + y, 1, 2);
        g2d.fillRect(111 + x, 109 + y, 1, 27);
        g2d.fillRect(108 + x, 111 + y, 1, 23);
        g2d.fillRect(112 + x, 111 + y, 1, 24);
        g2d.fillRect(113 + x, 111 + y, 1, 24);
        g2d.fillRect(115 + x, 111 + y, 1, 23);
        g2d.fillRect(107 + x, 133 + y, 1, 1);
        g2d.fillRect(109 + x, 136 + y, 1, 1);
        g2d.fillRect(112 + x, 136 + y, 1, 2);
        g2d.fillRect(114 + x, 136 + y, 1, 4);
        g2d.fillRect(108 + x, 137 + y, 1, 17);
        g2d.fillRect(111 + x, 137 + y, 1, 15);
        g2d.fillRect(109 + x, 138 + y, 1, 11);
        g2d.fillRect(113 + x, 141 + y, 1, 18);
        g2d.fillRect(114 + x, 141 + y, 1, 11);
        g2d.fillRect(107 + x, 142 + y, 1, 8);
        g2d.fillRect(112 + x, 142 + y, 1, 7);
        g2d.fillRect(106 + x, 143 + y, 1, 4);
        g2d.fillRect(106 + x, 148 + y, 1, 13);
        g2d.fillRect(112 + x, 150 + y, 1, 13);
        g2d.fillRect(107 + x, 151 + y, 1, 11);
        g2d.fillRect(105 + x, 152 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 3);
        g2d.fillRect(114 + x, 153 + y, 1, 7);
        g2d.fillRect(115 + x, 154 + y, 1, 2);
        g2d.fillRect(105 + x, 155 + y, 1, 5);
        g2d.fillRect(109 + x, 156 + y, 1, 3);
        g2d.fillRect(110 + x, 158 + y, 1, 4);
        g2d.fillRect(111 + x, 158 + y, 1, 1);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(109 + x, 160 + y, 1, 2);
        g2d.fillRect(111 + x, 160 + y, 1, 3);
        g2d.fillRect(113 + x, 160 + y, 1, 1);
        g2d.fillRect(104 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 1, 1);
        g2d.fillRect(113 + x, 162 + y, 1, 3);
        g2d.fillRect(117 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 164 + y, 1, 1);
        g2d.fillRect(104 + x, 165 + y, 1, 2);
        g2d.fillRect(106 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 166 + y, 1, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 2);
        g2d.fillRect(105 + x, 167 + y, 1, 2);
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(111 + x, 167 + y, 1, 2);
        g2d.fillRect(114 + x, 167 + y, 1, 1);
        g2d.fillRect(104 + x, 168 + y, 1, 1);
        g2d.fillRect(108 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 2);
        g2d.fillRect(106 + x, 169 + y, 1, 2);
        g2d.fillRect(112 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 169 + y, 1, 1);
        g2d.fillRect(117 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 170 + y, 1, 1);
        g2d.fillRect(103 + x, 171 + y, 2, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 2);
        g2d.fillRect(118 + x, 171 + y, 1, 1);
        g2d.fillRect(101 + x, 173 + y, 2, 1);
        g2d.fillRect(110 + x, 173 + y, 2, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);
    }

    public void paintBR2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 160 + y, 1, 5);
        g2d.fillRect(106 + x, 161 + y, 1, 1);
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 163 + y, 2, 1);
        g2d.fillRect(116 + x, 163 + y, 2, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(109 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(106 + x, 166 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 1);
        g2d.fillRect(117 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 167 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(116 + x, 168 + y, 1, 1);
        g2d.fillRect(104 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 169 + y, 1, 1);
        g2d.fillRect(117 + x, 169 + y, 1, 1);
        g2d.fillRect(103 + x, 170 + y, 1, 2);
        g2d.fillRect(105 + x, 170 + y, 2, 1);
        g2d.fillRect(108 + x, 170 + y, 1, 2);
        g2d.fillRect(110 + x, 170 + y, 1, 1);
        g2d.fillRect(112 + x, 170 + y, 1, 2);
        g2d.fillRect(114 + x, 170 + y, 1, 1);
        g2d.fillRect(106 + x, 171 + y, 1, 1);
        g2d.fillRect(109 + x, 172 + y, 2, 1);
        g2d.fillRect(120 + x, 172 + y, 1, 1);
        g2d.fillRect(114 + x, 173 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);
        g2d.fillRect(108 + x, 174 + y, 2, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);
        g2d.fillRect(122 + x, 174 + y, 2, 1);
        g2d.fillRect(100 + x, 175 + y, 1, 1);
        g2d.fillRect(111 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(105 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 173 + y, 1, 1);
        g2d.fillRect(121 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 160 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(103 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 167 + y, 1, 1);
        g2d.fillRect(112 + x, 169 + y, 1, 1);
        g2d.fillRect(119 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(108 + x, 167 + y, 1, 1);
        g2d.fillRect(120 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(48, 47, 48, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(116 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(107 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(116 + x, 159 + y, 1, 1);
        g2d.fillRect(114 + x, 165 + y, 1, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 164 + y, 1, 1);
        g2d.fillRect(104 + x, 167 + y, 1, 1);
        g2d.fillRect(106 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 169 + y, 1, 1);
        g2d.fillRect(104 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 84, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 165 + y, 1, 1);
        g2d.fillRect(117 + x, 171 + y, 1, 1);
        g2d.fillRect(120 + x, 171 + y, 1, 1);
        g2d.fillRect(114 + x, 174 + y, 1, 1);
        g2d.fillRect(110 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 159 + y, 1, 1);
        g2d.fillRect(101 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 1, 1);
        g2d.fillRect(111 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 175 + y, 1, 1);
        g2d.fillRect(109 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 174 + y, 1, 1);
        g2d.fillRect(121 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(124 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(123 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 176 + y, 1, 1);
        g2d.fillRect(125 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 166 + y, 1, 1);
        g2d.fillRect(122 + x, 172 + y, 1, 1);
        g2d.fillRect(104 + x, 174 + y, 1, 1);
        g2d.fillRect(119 + x, 174 + y, 1, 1);
        g2d.fillRect(105 + x, 175 + y, 2, 1);
        g2d.fillRect(116 + x, 175 + y, 1, 1);
        g2d.fillRect(98 + x, 176 + y, 1, 1);
        g2d.fillRect(108 + x, 176 + y, 1, 1);
        g2d.fillRect(123 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 152 + y, 1, 6);
        g2d.fillRect(120 + x, 160 + y, 1, 2);
        g2d.fillRect(103 + x, 162 + y, 1, 1);
        g2d.fillRect(120 + x, 163 + y, 1, 2);
        g2d.fillRect(101 + x, 168 + y, 1, 1);
        g2d.fillRect(100 + x, 170 + y, 1, 2);
        g2d.fillRect(98 + x, 174 + y, 1, 1);
        g2d.fillRect(125 + x, 174 + y, 1, 1);
        g2d.fillRect(127 + x, 174 + y, 1, 1);
        g2d.fillRect(97 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 89 + y, 1, 5);
        g2d.fillRect(118 + x, 89 + y, 1, 13);
        g2d.fillRect(105 + x, 94 + y, 1, 6);
        g2d.fillRect(106 + x, 100 + y, 1, 6);
        g2d.fillRect(107 + x, 106 + y, 1, 27);
        g2d.fillRect(118 + x, 111 + y, 1, 23);
        g2d.fillRect(106 + x, 133 + y, 1, 9);
        g2d.fillRect(120 + x, 162 + y, 1, 1);
        g2d.fillRect(101 + x, 163 + y, 1, 2);
        g2d.fillRect(102 + x, 165 + y, 1, 1);
        g2d.fillRect(100 + x, 169 + y, 1, 1);
        g2d.fillRect(122 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 2);
        g2d.fillRect(97 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 175 + y, 1, 1);
        g2d.fillRect(122 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 102 + y, 1, 9);
        g2d.fillRect(118 + x, 134 + y, 1, 19);
        g2d.fillRect(105 + x, 142 + y, 1, 10);
        g2d.fillRect(119 + x, 153 + y, 1, 6);
        g2d.fillRect(103 + x, 158 + y, 1, 4);
        g2d.fillRect(101 + x, 167 + y, 1, 1);
        g2d.fillRect(121 + x, 167 + y, 1, 2);
        g2d.fillRect(124 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 160 + y, 1, 1);
        g2d.fillRect(120 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 165 + y, 1, 1);
        g2d.fillRect(105 + x, 174 + y, 1, 1);
        g2d.fillRect(120 + x, 174 + y, 1, 1);
        g2d.fillRect(101 + x, 175 + y, 1, 1);
        g2d.fillRect(110 + x, 176 + y, 1, 1);
        g2d.fillRect(112 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 167 + y, 1, 1);
        g2d.fillRect(121 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(111 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 172 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 1, 1);
        g2d.fillRect(106 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 164 + y, 1, 1);
        g2d.fillRect(100 + x, 174 + y, 2, 1);
        g2d.fillRect(107 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 90 + y, 1, 16);
        g2d.fillRect(118 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 1);
        g2d.fillRect(103 + x, 169 + y, 1, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(119 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 159 + y, 1, 1);
        g2d.fillRect(118 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(117 + x, 164 + y, 1, 1);
        g2d.fillRect(104 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);
        g2d.fillRect(118 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 158 + y, 1, 1);
        g2d.fillRect(104 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 162 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 164 + y, 1, 1);
        g2d.fillRect(101 + x, 169 + y, 1, 1);
        g2d.fillRect(119 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(109 + x, 155 + y, 1, 1);
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(104 + x, 159 + y, 1, 1);
        g2d.fillRect(102 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 135 + y, 1, 2);
        g2d.fillRect(114 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 1);
        g2d.fillRect(116 + x, 170 + y, 1, 1);
        g2d.fillRect(110 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(113 + x, 103 + y, 1, 2);
        g2d.fillRect(110 + x, 149 + y, 1, 1);
        g2d.fillRect(109 + x, 156 + y, 1, 2);
        g2d.fillRect(109 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 97 + y, 1, 6);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 3);
        g2d.fillRect(106 + x, 146 + y, 1, 1);
        g2d.fillRect(110 + x, 150 + y, 1, 6);
        g2d.fillRect(109 + x, 154 + y, 1, 1);
        g2d.fillRect(116 + x, 156 + y, 1, 2);
        g2d.fillRect(118 + x, 156 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 2);
        g2d.fillRect(108 + x, 162 + y, 1, 2);
        g2d.fillRect(113 + x, 163 + y, 1, 1);
        g2d.fillRect(116 + x, 165 + y, 1, 1);
        g2d.fillRect(119 + x, 165 + y, 1, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 1);
        g2d.fillRect(101 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 1, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 94 + y, 1, 6);
        g2d.fillRect(107 + x, 100 + y, 1, 6);
        g2d.fillRect(108 + x, 106 + y, 1, 27);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 44);
        g2d.fillRect(107 + x, 133 + y, 1, 9);
        g2d.fillRect(106 + x, 142 + y, 1, 4);
        g2d.fillRect(105 + x, 152 + y, 1, 4);
        g2d.fillRect(118 + x, 153 + y, 1, 3);
        g2d.fillRect(119 + x, 161 + y, 1, 2);
        g2d.fillRect(103 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 167 + y, 1, 1);
        g2d.fillRect(120 + x, 168 + y, 1, 1);
        g2d.fillRect(101 + x, 170 + y, 1, 1);
        g2d.fillRect(121 + x, 174 + y, 1, 1);
        g2d.fillRect(98 + x, 175 + y, 1, 1);
        g2d.fillRect(123 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 163 + y, 1, 1);
        g2d.fillRect(108 + x, 164 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);
        g2d.fillRect(102 + x, 172 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 162 + y, 1, 1);
        g2d.fillRect(119 + x, 163 + y, 1, 1);
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 167 + y, 1, 1);
        g2d.fillRect(102 + x, 168 + y, 1, 1);
        g2d.fillRect(120 + x, 169 + y, 1, 1);
        g2d.fillRect(102 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 170 + y, 1, 1);
        g2d.fillRect(107 + x, 171 + y, 1, 1);
        g2d.fillRect(121 + x, 172 + y, 1, 1);
        g2d.fillRect(120 + x, 173 + y, 1, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);
        g2d.fillRect(116 + x, 174 + y, 1, 1);
        g2d.fillRect(109 + x, 175 + y, 1, 1);
        g2d.fillRect(112 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 161 + y, 1, 1);
        g2d.fillRect(114 + x, 161 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 1, 1);
        g2d.fillRect(113 + x, 167 + y, 1, 1);
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(107 + x, 172 + y, 1, 1);
        g2d.fillRect(116 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(103 + x, 167 + y, 1, 1);
        g2d.fillRect(111 + x, 169 + y, 1, 1);
        g2d.fillRect(103 + x, 172 + y, 1, 1);
        g2d.fillRect(108 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 164 + y, 1, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(115 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 134 + y, 1, 1);
        g2d.fillRect(105 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 171 + y, 1, 1);
        g2d.fillRect(112 + x, 172 + y, 1, 1);
        g2d.fillRect(122 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 5);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 7);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 6);
        g2d.fillRect(109 + x, 95 + y, 1, 2);
        g2d.fillRect(112 + x, 97 + y, 1, 2);
        g2d.fillRect(116 + x, 97 + y, 1, 14);
        g2d.fillRect(108 + x, 100 + y, 1, 6);
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(109 + x, 106 + y, 1, 5);
        g2d.fillRect(112 + x, 108 + y, 2, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 1);
        g2d.fillRect(108 + x, 134 + y, 1, 8);
        g2d.fillRect(109 + x, 134 + y, 1, 3);
        g2d.fillRect(110 + x, 135 + y, 1, 1);
        g2d.fillRect(113 + x, 135 + y, 1, 1);
        g2d.fillRect(115 + x, 135 + y, 2, 1);
        g2d.fillRect(112 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 18);
        g2d.fillRect(110 + x, 137 + y, 1, 1);
        g2d.fillRect(113 + x, 138 + y, 1, 4);
        g2d.fillRect(115 + x, 140 + y, 1, 1);
        g2d.fillRect(107 + x, 142 + y, 1, 1);
        g2d.fillRect(106 + x, 147 + y, 1, 5);
        g2d.fillRect(107 + x, 147 + y, 1, 1);
        g2d.fillRect(113 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 150 + y, 1, 1);
        g2d.fillRect(112 + x, 152 + y, 1, 1);
        g2d.fillRect(115 + x, 152 + y, 1, 1);
        g2d.fillRect(106 + x, 153 + y, 1, 2);
        g2d.fillRect(117 + x, 153 + y, 1, 5);
        g2d.fillRect(111 + x, 156 + y, 1, 2);
        g2d.fillRect(112 + x, 156 + y, 1, 2);
        g2d.fillRect(105 + x, 157 + y, 1, 2);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 159 + y, 1, 1);
        g2d.fillRect(106 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 160 + y, 1, 1);
        g2d.fillRect(106 + x, 164 + y, 1, 2);
        g2d.fillRect(111 + x, 164 + y, 2, 1);
        g2d.fillRect(118 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 166 + y, 2, 1);
        g2d.fillRect(103 + x, 168 + y, 1, 1);
        g2d.fillRect(108 + x, 168 + y, 1, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 8);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 86 + y, 1, 70);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 3);
        g2d.fillRect(115 + x, 87 + y, 1, 48);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 9);
        g2d.fillRect(109 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 15);
        g2d.fillRect(108 + x, 92 + y, 1, 8);
        g2d.fillRect(110 + x, 93 + y, 1, 42);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 9);
        g2d.fillRect(112 + x, 99 + y, 1, 4);
        g2d.fillRect(112 + x, 105 + y, 1, 3);
        g2d.fillRect(113 + x, 106 + y, 1, 2);
        g2d.fillRect(112 + x, 109 + y, 1, 27);
        g2d.fillRect(109 + x, 111 + y, 1, 23);
        g2d.fillRect(113 + x, 111 + y, 1, 24);
        g2d.fillRect(114 + x, 111 + y, 1, 24);
        g2d.fillRect(116 + x, 111 + y, 1, 23);
        g2d.fillRect(108 + x, 133 + y, 1, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 2);
        g2d.fillRect(115 + x, 136 + y, 1, 4);
        g2d.fillRect(109 + x, 137 + y, 1, 17);
        g2d.fillRect(112 + x, 137 + y, 1, 15);
        g2d.fillRect(110 + x, 138 + y, 1, 11);
        g2d.fillRect(114 + x, 141 + y, 1, 18);
        g2d.fillRect(115 + x, 141 + y, 1, 11);
        g2d.fillRect(108 + x, 142 + y, 1, 8);
        g2d.fillRect(113 + x, 142 + y, 1, 7);
        g2d.fillRect(107 + x, 143 + y, 1, 4);
        g2d.fillRect(107 + x, 148 + y, 1, 13);
        g2d.fillRect(113 + x, 150 + y, 1, 13);
        g2d.fillRect(108 + x, 151 + y, 1, 11);
        g2d.fillRect(106 + x, 152 + y, 1, 1);
        g2d.fillRect(112 + x, 153 + y, 1, 3);
        g2d.fillRect(115 + x, 153 + y, 1, 7);
        g2d.fillRect(116 + x, 154 + y, 1, 2);
        g2d.fillRect(106 + x, 155 + y, 1, 5);
        g2d.fillRect(110 + x, 156 + y, 1, 3);
        g2d.fillRect(111 + x, 158 + y, 1, 4);
        g2d.fillRect(112 + x, 158 + y, 1, 1);
        g2d.fillRect(117 + x, 158 + y, 1, 1);
        g2d.fillRect(110 + x, 160 + y, 1, 2);
        g2d.fillRect(112 + x, 160 + y, 1, 3);
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 3);
        g2d.fillRect(118 + x, 163 + y, 1, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(105 + x, 165 + y, 1, 2);
        g2d.fillRect(107 + x, 165 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(115 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(116 + x, 166 + y, 1, 2);
        g2d.fillRect(106 + x, 167 + y, 1, 2);
        g2d.fillRect(110 + x, 167 + y, 1, 1);
        g2d.fillRect(112 + x, 167 + y, 1, 2);
        g2d.fillRect(115 + x, 167 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 2);
        g2d.fillRect(107 + x, 169 + y, 1, 2);
        g2d.fillRect(113 + x, 169 + y, 1, 1);
        g2d.fillRect(116 + x, 169 + y, 1, 1);
        g2d.fillRect(118 + x, 169 + y, 1, 1);
        g2d.fillRect(111 + x, 170 + y, 1, 1);
        g2d.fillRect(115 + x, 170 + y, 1, 1);
        g2d.fillRect(104 + x, 171 + y, 2, 1);
        g2d.fillRect(116 + x, 171 + y, 1, 2);
        g2d.fillRect(119 + x, 171 + y, 1, 1);
        g2d.fillRect(102 + x, 173 + y, 2, 1);
        g2d.fillRect(111 + x, 173 + y, 2, 1);
        g2d.fillRect(110 + x, 174 + y, 1, 1);
    }

    public void paintBR3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 160 + y, 1, 5);
        g2d.fillRect(108 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);
        g2d.fillRect(117 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(111 + x, 164 + y, 1, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(108 + x, 166 + y, 1, 1);
        g2d.fillRect(113 + x, 166 + y, 1, 1);
        g2d.fillRect(117 + x, 166 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 1);
        g2d.fillRect(116 + x, 169 + y, 2, 1);
        g2d.fillRect(106 + x, 170 + y, 1, 2);
        g2d.fillRect(107 + x, 170 + y, 2, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 2);
        g2d.fillRect(112 + x, 170 + y, 2, 1);
        g2d.fillRect(115 + x, 170 + y, 1, 1);
        g2d.fillRect(108 + x, 171 + y, 1, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 2, 1);
        g2d.fillRect(120 + x, 172 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 1, 1);
        g2d.fillRect(105 + x, 174 + y, 1, 1);
        g2d.fillRect(110 + x, 174 + y, 2, 1);
        g2d.fillRect(113 + x, 174 + y, 1, 1);
        g2d.fillRect(122 + x, 174 + y, 2, 1);
        g2d.fillRect(103 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(107 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 173 + y, 1, 1);
        g2d.fillRect(121 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 167 + y, 1, 1);
        g2d.fillRect(113 + x, 169 + y, 1, 1);
        g2d.fillRect(119 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(36, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(110 + x, 167 + y, 1, 1);
        g2d.fillRect(120 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(109 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(117 + x, 159 + y, 1, 1);
        g2d.fillRect(115 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 173 + y, 1, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 161 + y, 1, 1);
        g2d.fillRect(113 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 164 + y, 1, 1);
        g2d.fillRect(106 + x, 167 + y, 1, 1);
        g2d.fillRect(108 + x, 169 + y, 1, 1);
        g2d.fillRect(116 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 162 + y, 1, 1);
        g2d.fillRect(111 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(117 + x, 171 + y, 1, 1);
        g2d.fillRect(120 + x, 171 + y, 1, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);
        g2d.fillRect(112 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 159 + y, 1, 1);
        g2d.fillRect(104 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 165 + y, 1, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 175, 179, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 175 + y, 1, 1);
        g2d.fillRect(111 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 174 + y, 1, 1);
        g2d.fillRect(121 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(124 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(123 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 176 + y, 1, 1);
        g2d.fillRect(125 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 166 + y, 1, 1);
        g2d.fillRect(122 + x, 172 + y, 1, 1);
        g2d.fillRect(119 + x, 174 + y, 1, 1);
        g2d.fillRect(107 + x, 175 + y, 2, 1);
        g2d.fillRect(117 + x, 175 + y, 1, 1);
        g2d.fillRect(101 + x, 176 + y, 1, 1);
        g2d.fillRect(110 + x, 176 + y, 1, 1);
        g2d.fillRect(123 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 152 + y, 1, 6);
        g2d.fillRect(120 + x, 160 + y, 1, 2);
        g2d.fillRect(105 + x, 162 + y, 1, 1);
        g2d.fillRect(120 + x, 163 + y, 1, 2);
        g2d.fillRect(104 + x, 168 + y, 1, 1);
        g2d.fillRect(103 + x, 170 + y, 1, 2);
        g2d.fillRect(101 + x, 174 + y, 1, 1);
        g2d.fillRect(125 + x, 174 + y, 2, 1);
        g2d.fillRect(100 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 89 + y, 1, 5);
        g2d.fillRect(118 + x, 89 + y, 1, 13);
        g2d.fillRect(105 + x, 94 + y, 1, 6);
        g2d.fillRect(106 + x, 100 + y, 1, 6);
        g2d.fillRect(107 + x, 106 + y, 1, 7);
        g2d.fillRect(118 + x, 111 + y, 1, 23);
        g2d.fillRect(108 + x, 113 + y, 1, 20);
        g2d.fillRect(107 + x, 133 + y, 1, 9);
        g2d.fillRect(120 + x, 162 + y, 1, 1);
        g2d.fillRect(104 + x, 163 + y, 1, 3);
        g2d.fillRect(103 + x, 169 + y, 1, 1);
        g2d.fillRect(122 + x, 171 + y, 1, 1);
        g2d.fillRect(102 + x, 172 + y, 1, 2);
        g2d.fillRect(100 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 175 + y, 1, 1);
        g2d.fillRect(122 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 102 + y, 1, 9);
        g2d.fillRect(118 + x, 134 + y, 1, 13);
        g2d.fillRect(106 + x, 142 + y, 1, 10);
        g2d.fillRect(119 + x, 147 + y, 1, 6);
        g2d.fillRect(120 + x, 153 + y, 1, 6);
        g2d.fillRect(105 + x, 158 + y, 1, 4);
        g2d.fillRect(104 + x, 167 + y, 1, 1);
        g2d.fillRect(121 + x, 167 + y, 1, 2);
        g2d.fillRect(124 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 160 + y, 1, 1);
        g2d.fillRect(120 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 165 + y, 1, 1);
        g2d.fillRect(107 + x, 174 + y, 1, 1);
        g2d.fillRect(120 + x, 174 + y, 1, 1);
        g2d.fillRect(104 + x, 175 + y, 1, 1);
        g2d.fillRect(112 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 167 + y, 1, 1);
        g2d.fillRect(121 + x, 171 + y, 1, 1);
        g2d.fillRect(102 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 1, 1);
        g2d.fillRect(115 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 172 + y, 1, 1);
        g2d.fillRect(107 + x, 173 + y, 1, 1);
        g2d.fillRect(108 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 174 + y, 2, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 90 + y, 1, 16);
        g2d.fillRect(118 + x, 166 + y, 1, 1);
        g2d.fillRect(106 + x, 169 + y, 1, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 159 + y, 1, 1);
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(107 + x, 163 + y, 1, 1);
        g2d.fillRect(119 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(106 + x, 165 + y, 1, 1);
        g2d.fillRect(105 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 159 + y, 1, 1);
        g2d.fillRect(119 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 164 + y, 1, 1);
        g2d.fillRect(117 + x, 164 + y, 1, 1);
        g2d.fillRect(116 + x, 168 + y, 1, 1);
        g2d.fillRect(118 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);
        g2d.fillRect(114 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 164 + y, 1, 1);
        g2d.fillRect(104 + x, 169 + y, 1, 1);
        g2d.fillRect(119 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 155 + y, 1, 1);
        g2d.fillRect(119 + x, 157 + y, 1, 1);
        g2d.fillRect(106 + x, 159 + y, 1, 1);
        g2d.fillRect(105 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 135 + y, 1, 2);
        g2d.fillRect(114 + x, 140 + y, 1, 1);
        g2d.fillRect(114 + x, 166 + y, 1, 1);
        g2d.fillRect(112 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(113 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 149 + y, 1, 1);
        g2d.fillRect(111 + x, 156 + y, 1, 2);
        g2d.fillRect(111 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 97 + y, 1, 6);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 3);
        g2d.fillRect(107 + x, 146 + y, 1, 1);
        g2d.fillRect(111 + x, 150 + y, 1, 2);
        g2d.fillRect(111 + x, 154 + y, 1, 1);
        g2d.fillRect(112 + x, 155 + y, 1, 1);
        g2d.fillRect(117 + x, 156 + y, 1, 2);
        g2d.fillRect(119 + x, 156 + y, 1, 1);
        g2d.fillRect(106 + x, 158 + y, 1, 1);
        g2d.fillRect(111 + x, 158 + y, 1, 2);
        g2d.fillRect(110 + x, 162 + y, 1, 2);
        g2d.fillRect(114 + x, 163 + y, 1, 1);
        g2d.fillRect(119 + x, 165 + y, 1, 1);
        g2d.fillRect(116 + x, 166 + y, 1, 1);
        g2d.fillRect(104 + x, 172 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 1, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 94 + y, 1, 6);
        g2d.fillRect(107 + x, 100 + y, 1, 6);
        g2d.fillRect(108 + x, 106 + y, 1, 7);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 38);
        g2d.fillRect(109 + x, 113 + y, 1, 20);
        g2d.fillRect(108 + x, 133 + y, 1, 9);
        g2d.fillRect(107 + x, 142 + y, 1, 4);
        g2d.fillRect(118 + x, 147 + y, 1, 6);
        g2d.fillRect(107 + x, 152 + y, 1, 4);
        g2d.fillRect(119 + x, 153 + y, 1, 3);
        g2d.fillRect(119 + x, 161 + y, 1, 2);
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(120 + x, 168 + y, 1, 1);
        g2d.fillRect(104 + x, 170 + y, 1, 1);
        g2d.fillRect(121 + x, 174 + y, 1, 1);
        g2d.fillRect(101 + x, 175 + y, 1, 1);
        g2d.fillRect(123 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 164 + y, 1, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 1);
        g2d.fillRect(105 + x, 172 + y, 1, 1);
        g2d.fillRect(116 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(119 + x, 163 + y, 1, 1);
        g2d.fillRect(111 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 167 + y, 1, 1);
        g2d.fillRect(105 + x, 168 + y, 1, 1);
        g2d.fillRect(120 + x, 169 + y, 1, 1);
        g2d.fillRect(105 + x, 170 + y, 1, 1);
        g2d.fillRect(118 + x, 170 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);
        g2d.fillRect(121 + x, 172 + y, 1, 1);
        g2d.fillRect(120 + x, 173 + y, 1, 1);
        g2d.fillRect(111 + x, 175 + y, 1, 1);
        g2d.fillRect(113 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 161 + y, 1, 1);
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(114 + x, 167 + y, 1, 1);
        g2d.fillRect(114 + x, 170 + y, 1, 1);
        g2d.fillRect(109 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);
        g2d.fillRect(105 + x, 167 + y, 1, 1);
        g2d.fillRect(106 + x, 172 + y, 1, 1);
        g2d.fillRect(110 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 164 + y, 1, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);
        g2d.fillRect(116 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 134 + y, 1, 1);
        g2d.fillRect(107 + x, 156 + y, 1, 1);
        g2d.fillRect(104 + x, 171 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 1, 1);
        g2d.fillRect(122 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 5);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 7);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 6);
        g2d.fillRect(109 + x, 95 + y, 1, 2);
        g2d.fillRect(112 + x, 97 + y, 1, 2);
        g2d.fillRect(116 + x, 97 + y, 1, 14);
        g2d.fillRect(108 + x, 100 + y, 1, 6);
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(109 + x, 106 + y, 1, 5);
        g2d.fillRect(112 + x, 108 + y, 2, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 1);
        g2d.fillRect(109 + x, 134 + y, 1, 8);
        g2d.fillRect(110 + x, 134 + y, 1, 3);
        g2d.fillRect(111 + x, 135 + y, 1, 1);
        g2d.fillRect(115 + x, 135 + y, 2, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 11);
        g2d.fillRect(111 + x, 137 + y, 1, 1);
        g2d.fillRect(115 + x, 140 + y, 1, 1);
        g2d.fillRect(108 + x, 142 + y, 1, 1);
        g2d.fillRect(107 + x, 147 + y, 1, 5);
        g2d.fillRect(108 + x, 147 + y, 1, 1);
        g2d.fillRect(117 + x, 147 + y, 1, 7);
        g2d.fillRect(114 + x, 149 + y, 1, 1);
        g2d.fillRect(109 + x, 150 + y, 1, 1);
        g2d.fillRect(113 + x, 152 + y, 1, 1);
        g2d.fillRect(116 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 153 + y, 1, 2);
        g2d.fillRect(118 + x, 153 + y, 1, 5);
        g2d.fillRect(113 + x, 156 + y, 1, 2);
        g2d.fillRect(107 + x, 157 + y, 1, 2);
        g2d.fillRect(117 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 159 + y, 2, 1);
        g2d.fillRect(108 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 160 + y, 1, 1);
        g2d.fillRect(108 + x, 164 + y, 1, 2);
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(118 + x, 164 + y, 1, 1);
        g2d.fillRect(105 + x, 166 + y, 2, 1);
        g2d.fillRect(106 + x, 168 + y, 1, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(103 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 8);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 86 + y, 1, 49);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 3);
        g2d.fillRect(115 + x, 87 + y, 1, 48);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 9);
        g2d.fillRect(109 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 15);
        g2d.fillRect(108 + x, 92 + y, 1, 8);
        g2d.fillRect(110 + x, 93 + y, 1, 41);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 9);
        g2d.fillRect(112 + x, 99 + y, 1, 4);
        g2d.fillRect(112 + x, 105 + y, 1, 3);
        g2d.fillRect(113 + x, 106 + y, 1, 2);
        g2d.fillRect(112 + x, 109 + y, 1, 46);
        g2d.fillRect(109 + x, 111 + y, 1, 2);
        g2d.fillRect(113 + x, 111 + y, 1, 25);
        g2d.fillRect(114 + x, 111 + y, 1, 24);
        g2d.fillRect(116 + x, 111 + y, 1, 23);
        g2d.fillRect(109 + x, 133 + y, 1, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
        g2d.fillRect(115 + x, 136 + y, 1, 4);
        g2d.fillRect(110 + x, 137 + y, 1, 25);
        g2d.fillRect(113 + x, 137 + y, 1, 15);
        g2d.fillRect(111 + x, 138 + y, 1, 11);
        g2d.fillRect(114 + x, 141 + y, 1, 8);
        g2d.fillRect(115 + x, 141 + y, 1, 18);
        g2d.fillRect(109 + x, 142 + y, 1, 8);
        g2d.fillRect(108 + x, 143 + y, 1, 4);
        g2d.fillRect(116 + x, 147 + y, 1, 5);
        g2d.fillRect(108 + x, 148 + y, 1, 5);
        g2d.fillRect(114 + x, 150 + y, 1, 13);
        g2d.fillRect(109 + x, 151 + y, 1, 10);
        g2d.fillRect(111 + x, 152 + y, 1, 2);
        g2d.fillRect(113 + x, 153 + y, 1, 3);
        g2d.fillRect(116 + x, 153 + y, 1, 7);
        g2d.fillRect(117 + x, 154 + y, 1, 2);
        g2d.fillRect(108 + x, 155 + y, 1, 5);
        g2d.fillRect(112 + x, 156 + y, 1, 3);
        g2d.fillRect(113 + x, 158 + y, 1, 1);
        g2d.fillRect(118 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 160 + y, 1, 2);
        g2d.fillRect(113 + x, 160 + y, 1, 3);
        g2d.fillRect(115 + x, 160 + y, 1, 1);
        g2d.fillRect(107 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 1);
        g2d.fillRect(115 + x, 162 + y, 1, 3);
        g2d.fillRect(118 + x, 163 + y, 1, 1);
        g2d.fillRect(107 + x, 165 + y, 1, 2);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 165 + y, 1, 1);
        g2d.fillRect(116 + x, 165 + y, 1, 1);
        g2d.fillRect(108 + x, 167 + y, 1, 2);
        g2d.fillRect(112 + x, 167 + y, 2, 1);
        g2d.fillRect(116 + x, 167 + y, 1, 1);
        g2d.fillRect(107 + x, 168 + y, 1, 1);
        g2d.fillRect(111 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 2);
        g2d.fillRect(109 + x, 169 + y, 1, 2);
        g2d.fillRect(114 + x, 169 + y, 1, 1);
        g2d.fillRect(118 + x, 169 + y, 1, 1);
        g2d.fillRect(116 + x, 170 + y, 1, 1);
        g2d.fillRect(107 + x, 171 + y, 1, 1);
        g2d.fillRect(119 + x, 171 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 2, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);
    }

    public void paintBR4(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 160 + y, 1, 5);
        g2d.fillRect(111 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 163 + y, 1, 1);
        g2d.fillRect(114 + x, 163 + y, 1, 1);
        g2d.fillRect(118 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 164 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 1);
        g2d.fillRect(118 + x, 166 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 1, 1);
        g2d.fillRect(117 + x, 169 + y, 2, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 2);
        g2d.fillRect(111 + x, 170 + y, 1, 2);
        g2d.fillRect(113 + x, 170 + y, 1, 2);
        g2d.fillRect(116 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 1, 1);
        g2d.fillRect(120 + x, 172 + y, 1, 1);
        g2d.fillRect(116 + x, 173 + y, 1, 1);
        g2d.fillRect(109 + x, 174 + y, 1, 1);
        g2d.fillRect(113 + x, 174 + y, 2, 1);
        g2d.fillRect(122 + x, 174 + y, 2, 1);
        g2d.fillRect(107 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 11, 11, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(110 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21, 21, 21, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 166 + y, 1, 1);
        g2d.fillRect(112 + x, 173 + y, 1, 1);
        g2d.fillRect(121 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25, 25, 25, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 30, 31, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(110 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(113 + x, 167 + y, 1, 1);
        g2d.fillRect(120 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 50, 51, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(112 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(55, 55, 56, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(60, 60, 61, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(64, 63, 64, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(118 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 165 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 1, 1);
        g2d.fillRect(118 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 67, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 164 + y, 1, 1);
        g2d.fillRect(110 + x, 167 + y, 1, 1);
        g2d.fillRect(111 + x, 169 + y, 1, 1);
        g2d.fillRect(117 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(76, 76, 77, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 162 + y, 1, 1);
        g2d.fillRect(114 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(79, 80, 81, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(80, 78, 88, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(93, 93, 96, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 165 + y, 1, 1);
        g2d.fillRect(118 + x, 171 + y, 1, 1);
        g2d.fillRect(120 + x, 171 + y, 1, 1);
        g2d.fillRect(116 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 159 + y, 1, 1);
        g2d.fillRect(108 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 165 + y, 1, 1);
        g2d.fillRect(116 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 181, 183, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 159 + y, 1, 1);
        g2d.fillRect(118 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 175 + y, 1, 1);
        g2d.fillRect(114 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 190, 192, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 194, 196, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 216, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(124 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200, 201, 230, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(123 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 210, 212, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(115 + x, 176 + y, 1, 1);
        g2d.fillRect(125 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 166 + y, 1, 1);
        g2d.fillRect(122 + x, 172 + y, 1, 1);
        g2d.fillRect(119 + x, 174 + y, 1, 1);
        g2d.fillRect(110 + x, 175 + y, 2, 1);
        g2d.fillRect(118 + x, 175 + y, 1, 1);
        g2d.fillRect(106 + x, 176 + y, 1, 1);
        g2d.fillRect(113 + x, 176 + y, 1, 1);
        g2d.fillRect(123 + x, 176 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 207, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 152 + y, 1, 6);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(108 + x, 162 + y, 1, 1);
        g2d.fillRect(121 + x, 163 + y, 1, 2);
        g2d.fillRect(108 + x, 168 + y, 1, 1);
        g2d.fillRect(107 + x, 170 + y, 1, 2);
        g2d.fillRect(106 + x, 174 + y, 1, 1);
        g2d.fillRect(125 + x, 174 + y, 2, 1);
        g2d.fillRect(105 + x, 176 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 16);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(107 + x, 97 + y, 1, 3);
        g2d.fillRect(108 + x, 100 + y, 1, 6);
        g2d.fillRect(109 + x, 106 + y, 1, 7);
        g2d.fillRect(119 + x, 111 + y, 1, 23);
        g2d.fillRect(110 + x, 113 + y, 1, 20);
        g2d.fillRect(109 + x, 133 + y, 1, 9);
        g2d.fillRect(121 + x, 162 + y, 1, 1);
        g2d.fillRect(108 + x, 163 + y, 1, 3);
        g2d.fillRect(107 + x, 169 + y, 1, 1);
        g2d.fillRect(122 + x, 171 + y, 1, 1);
        g2d.fillRect(106 + x, 172 + y, 1, 2);
        g2d.fillRect(105 + x, 174 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 175 + y, 1, 1);
        g2d.fillRect(122 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 208, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 102 + y, 1, 9);
        g2d.fillRect(119 + x, 134 + y, 1, 13);
        g2d.fillRect(109 + x, 142 + y, 1, 10);
        g2d.fillRect(120 + x, 147 + y, 1, 6);
        g2d.fillRect(121 + x, 153 + y, 1, 6);
        g2d.fillRect(108 + x, 158 + y, 1, 4);
        g2d.fillRect(108 + x, 167 + y, 1, 1);
        g2d.fillRect(121 + x, 167 + y, 1, 2);
        g2d.fillRect(124 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 219, 220, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 170 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 160 + y, 1, 1);
        g2d.fillRect(121 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 228, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 221, 242, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 169 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(121 + x, 165 + y, 1, 1);
        g2d.fillRect(120 + x, 174 + y, 1, 1);
        g2d.fillRect(108 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 232, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 231, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 167 + y, 1, 1);
        g2d.fillRect(121 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 236, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(112 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 172 + y, 1, 1);
        g2d.fillRect(111 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 233, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 164 + y, 1, 1);
        g2d.fillRect(107 + x, 174 + y, 2, 1);
        g2d.fillRect(112 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 16);
        g2d.fillRect(106 + x, 91 + y, 1, 3);
        g2d.fillRect(119 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 169 + y, 1, 1);
        g2d.fillRect(115 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 159 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 239, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(119 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);
        g2d.fillRect(109 + x, 169 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 175 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(120 + x, 159 + y, 1, 1);
        g2d.fillRect(118 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 164 + y, 1, 1);
        g2d.fillRect(118 + x, 164 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 242, 243, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 162 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 1);
        g2d.fillRect(118 + x, 168 + y, 1, 1);
        g2d.fillRect(115 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 239, 250, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(120 + x, 164 + y, 1, 1);
        g2d.fillRect(108 + x, 169 + y, 1, 1);
        g2d.fillRect(119 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 108 + y, 1, 1);
        g2d.fillRect(120 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(109 + x, 171 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 244, 245, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 135 + y, 1, 2);
        g2d.fillRect(115 + x, 140 + y, 1, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 246, 243, 255), COLORS.get(ImageUtilities.GREY_3)));
        g2d.fillRect(114 + x, 103 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 97 + y, 1, 6);
        g2d.fillRect(114 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 3);
        g2d.fillRect(118 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 137 + y, 1, 3);
        g2d.fillRect(110 + x, 146 + y, 1, 1);
        g2d.fillRect(114 + x, 155 + y, 1, 1);
        g2d.fillRect(118 + x, 156 + y, 1, 2);
        g2d.fillRect(120 + x, 156 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 1);
        g2d.fillRect(113 + x, 162 + y, 1, 2);
        g2d.fillRect(115 + x, 163 + y, 1, 1);
        g2d.fillRect(120 + x, 165 + y, 1, 1);
        g2d.fillRect(117 + x, 166 + y, 1, 1);
        g2d.fillRect(108 + x, 172 + y, 1, 1);
        g2d.fillRect(115 + x, 172 + y, 1, 1);
        g2d.fillRect(118 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 242, 244, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(118 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 94 + y, 1, 3);
        g2d.fillRect(108 + x, 97 + y, 1, 3);
        g2d.fillRect(109 + x, 100 + y, 1, 6);
        g2d.fillRect(110 + x, 106 + y, 1, 7);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 109 + y, 1, 38);
        g2d.fillRect(111 + x, 113 + y, 1, 20);
        g2d.fillRect(110 + x, 133 + y, 1, 13);
        g2d.fillRect(119 + x, 147 + y, 1, 6);
        g2d.fillRect(110 + x, 152 + y, 1, 4);
        g2d.fillRect(120 + x, 153 + y, 1, 3);
        g2d.fillRect(120 + x, 161 + y, 1, 2);
        g2d.fillRect(109 + x, 165 + y, 1, 1);
        g2d.fillRect(120 + x, 168 + y, 1, 1);
        g2d.fillRect(108 + x, 170 + y, 1, 1);
        g2d.fillRect(121 + x, 174 + y, 1, 1);
        g2d.fillRect(106 + x, 175 + y, 1, 1);
        g2d.fillRect(123 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(109 + x, 172 + y, 1, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(120 + x, 163 + y, 1, 1);
        g2d.fillRect(119 + x, 167 + y, 1, 1);
        g2d.fillRect(109 + x, 168 + y, 1, 1);
        g2d.fillRect(120 + x, 169 + y, 1, 1);
        g2d.fillRect(109 + x, 170 + y, 1, 1);
        g2d.fillRect(112 + x, 171 + y, 1, 1);
        g2d.fillRect(121 + x, 172 + y, 1, 1);
        g2d.fillRect(120 + x, 173 + y, 1, 1);
        g2d.fillRect(114 + x, 175 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249, 249, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 250, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 161 + y, 1, 1);
        g2d.fillRect(116 + x, 161 + y, 1, 1);
        g2d.fillRect(115 + x, 167 + y, 1, 1);
        g2d.fillRect(115 + x, 170 + y, 1, 1);
        g2d.fillRect(112 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 251, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 167 + y, 1, 1);
        g2d.fillRect(110 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252, 252, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(116 + x, 171 + y, 1, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251, 252, 253, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(117 + x, 134 + y, 1, 1);
        g2d.fillRect(110 + x, 156 + y, 1, 1);
        g2d.fillRect(108 + x, 171 + y, 1, 1);
        g2d.fillRect(122 + x, 173 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 250, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 10);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 3);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 3);
        g2d.fillRect(110 + x, 95 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 1, 3);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 14);
        g2d.fillRect(110 + x, 100 + y, 1, 6);
        g2d.fillRect(113 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 106 + y, 1, 5);
        g2d.fillRect(113 + x, 108 + y, 2, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 134 + y, 1, 9);
        g2d.fillRect(112 + x, 134 + y, 1, 3);
        g2d.fillRect(116 + x, 135 + y, 2, 1);
        g2d.fillRect(114 + x, 136 + y, 1, 1);
        g2d.fillRect(117 + x, 136 + y, 1, 11);
        g2d.fillRect(116 + x, 140 + y, 1, 1);
        g2d.fillRect(110 + x, 147 + y, 1, 5);
        g2d.fillRect(111 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 7);
        g2d.fillRect(115 + x, 149 + y, 1, 1);
        g2d.fillRect(112 + x, 150 + y, 1, 1);
        g2d.fillRect(117 + x, 152 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 2);
        g2d.fillRect(119 + x, 153 + y, 1, 5);
        g2d.fillRect(110 + x, 157 + y, 1, 2);
        g2d.fillRect(118 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(111 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 160 + y, 1, 1);
        g2d.fillRect(111 + x, 164 + y, 1, 2);
        g2d.fillRect(119 + x, 164 + y, 1, 1);
        g2d.fillRect(109 + x, 166 + y, 2, 1);
        g2d.fillRect(110 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 1, 1);
        g2d.fillRect(107 + x, 172 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 5);
        g2d.fillRect(108 + x, 86 + y, 1, 8);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 86 + y, 1, 6);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 3);
        g2d.fillRect(115 + x, 87 + y, 1, 19);
        g2d.fillRect(116 + x, 87 + y, 1, 48);
        g2d.fillRect(113 + x, 88 + y, 1, 9);
        g2d.fillRect(110 + x, 91 + y, 1, 4);
        g2d.fillRect(114 + x, 91 + y, 1, 6);
        g2d.fillRect(109 + x, 92 + y, 1, 5);
        g2d.fillRect(111 + x, 93 + y, 1, 13);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(110 + x, 97 + y, 1, 3);
        g2d.fillRect(112 + x, 97 + y, 1, 37);
        g2d.fillRect(113 + x, 99 + y, 1, 4);
        g2d.fillRect(113 + x, 105 + y, 1, 3);
        g2d.fillRect(114 + x, 106 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 53);
        g2d.fillRect(111 + x, 111 + y, 1, 2);
        g2d.fillRect(114 + x, 111 + y, 1, 25);
        g2d.fillRect(115 + x, 111 + y, 1, 24);
        g2d.fillRect(117 + x, 111 + y, 1, 23);
        g2d.fillRect(111 + x, 133 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 4);
        g2d.fillRect(112 + x, 137 + y, 1, 13);
        g2d.fillRect(114 + x, 137 + y, 1, 18);
        g2d.fillRect(115 + x, 141 + y, 1, 8);
        g2d.fillRect(116 + x, 141 + y, 1, 18);
        g2d.fillRect(111 + x, 143 + y, 1, 4);
        g2d.fillRect(117 + x, 147 + y, 1, 5);
        g2d.fillRect(111 + x, 148 + y, 1, 5);
        g2d.fillRect(115 + x, 150 + y, 1, 13);
        g2d.fillRect(112 + x, 151 + y, 1, 10);
        g2d.fillRect(117 + x, 153 + y, 1, 7);
        g2d.fillRect(118 + x, 154 + y, 1, 2);
        g2d.fillRect(111 + x, 155 + y, 1, 5);
        g2d.fillRect(114 + x, 156 + y, 1, 3);
        g2d.fillRect(119 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 160 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(110 + x, 161 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 1, 3);
        g2d.fillRect(119 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);
        g2d.fillRect(114 + x, 165 + y, 2, 1);
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(111 + x, 167 + y, 1, 2);
        g2d.fillRect(114 + x, 167 + y, 1, 1);
        g2d.fillRect(117 + x, 167 + y, 1, 1);
        g2d.fillRect(116 + x, 168 + y, 1, 2);
        g2d.fillRect(112 + x, 169 + y, 1, 2);
        g2d.fillRect(115 + x, 169 + y, 1, 1);
        g2d.fillRect(117 + x, 170 + y, 1, 1);
        g2d.fillRect(119 + x, 171 + y, 1, 1);
        g2d.fillRect(109 + x, 173 + y, 2, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 2, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(7, 6, 6, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(32, 6, 2, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 14, 17, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(108 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(28, 28, 28, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 38, 38, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(43, 42, 43, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(109 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(46, 45, 46, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 71, 72, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 85, 87, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 91, 93, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(95, 96, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(106, 98, 93, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(103 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183, 184, 187, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 188, 190, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 195, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(118 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(219, 203, 214, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(104 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 208, 219, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 60 + y, 1, 8);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 208, 233, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 9);
        g2d.fillRect(102 + x, 79 + y, 1, 6);
        g2d.fillRect(103 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 223, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(110 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 223, 225, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 231, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 225, 234, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 229, 241, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 235, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(108 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 236, 237, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(113 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 237, 238, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 8);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(117 + x, 70 + y, 1, 7);
        g2d.fillRect(103 + x, 73 + y, 1, 4);
        g2d.fillRect(118 + x, 73 + y, 1, 5);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 241, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 243, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 246, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248, 242, 249, 255), COLORS.get(ImageUtilities.NEG_GREY_5)));
        g2d.fillRect(117 + x, 83 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 243, 254, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 77 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 251, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(109 + x, 79 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 2, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 17);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 17);
        g2d.fillRect(105 + x, 61 + y, 1, 4);
        g2d.fillRect(104 + x, 62 + y, 1, 2);
        g2d.fillRect(109 + x, 62 + y, 1, 15);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 14);
        g2d.fillRect(110 + x, 63 + y, 1, 14);
        g2d.fillRect(111 + x, 63 + y, 1, 14);
        g2d.fillRect(112 + x, 63 + y, 1, 17);
        g2d.fillRect(105 + x, 66 + y, 1, 13);
        g2d.fillRect(107 + x, 66 + y, 1, 11);
        g2d.fillRect(114 + x, 68 + y, 1, 11);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(104 + x, 73 + y, 1, 4);
        g2d.fillRect(116 + x, 73 + y, 1, 6);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 4);
        g2d.fillRect(107 + x, 78 + y, 1, 3);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 2, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 3);
        g2d.fillRect(107 + x, 82 + y, 2, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 3);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 2, 1);
    }

    boolean originalColorArray = true;
    
    public void setOriginalColorArray(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalColorArray() {
        return originalColorArray;
    }
}
