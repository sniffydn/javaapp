/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.s;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt89 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt89() {
        super();
        containsTL = true;
    }

    public Srt89(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt89(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x, 0, g2d);
    }

    public void drawB(int x, int y, GraphicsMap g2d) {
        paintTU(x, y, g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        if (middle.equals("b")) {
            drawB(x, y, g2d);
        }
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d) {
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d) {
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
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
        g2d.fillRect(108 + x, 48 + y, 1, 3);
        g2d.fillRect(114 + x, 49 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 31, 0, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 31, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68, 68, 68, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 63, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 85, 85, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 95, 85, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(109 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 95, 85, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 119, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 47 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136, 136, 136, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 153, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 159, 170, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170, 170, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 187, 187, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 2, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 191, 170, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 2, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 204, 204, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 47 + y, 2, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 223, 170, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(102 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 221, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 3);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 238, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 47 + y, 1, 3);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 2, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 3);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 4, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 3, 1);
        g2d.fillRect(107 + x, 47 + y, 2, 1);
        g2d.fillRect(113 + x, 47 + y, 4, 1);
        g2d.fillRect(103 + x, 48 + y, 3, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 9);
        g2d.fillRect(111 + x, 48 + y, 1, 9);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 8);
        g2d.fillRect(112 + x, 49 + y, 1, 7);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 4);
        g2d.fillRect(104 + x, 51 + y, 1, 4);
        g2d.fillRect(105 + x, 51 + y, 1, 6);
        g2d.fillRect(107 + x, 51 + y, 1, 5);
        g2d.fillRect(113 + x, 51 + y, 1, 5);
        g2d.fillRect(116 + x, 51 + y, 1, 5);
        g2d.fillRect(117 + x, 51 + y, 1, 5);
        g2d.fillRect(102 + x, 52 + y, 1, 3);
        g2d.fillRect(108 + x, 52 + y, 1, 5);
        g2d.fillRect(109 + x, 52 + y, 1, 4);
        g2d.fillRect(114 + x, 52 + y, 1, 4);
        g2d.fillRect(115 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 52 + y, 1, 4);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 3);
        g2d.fillRect(105 + x, 63 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 59 + y, 5, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 7);
        g2d.fillRect(113 + x, 59 + y, 1, 6);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 5, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 3);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(110 + x, 61 + y, 1, 3);
        g2d.fillRect(111 + x, 61 + y, 1, 4);
        g2d.fillRect(114 + x, 61 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(34, 34, 34, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 31, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 31, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 64 + y, 1, 3);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 2);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 4);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 63, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(114 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85, 85, 85, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 31, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 7);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 68 + y, 1, 4);
        g2d.fillRect(113 + x, 70 + y, 1, 4);
        g2d.fillRect(107 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 63, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102, 102, 102, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 31, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 3);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 95, 85, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 63, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(107 + x, 66 + y, 1, 6);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 5);
        g2d.fillRect(112 + x, 73 + y, 1, 3);
        g2d.fillRect(107 + x, 74 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 3);
        g2d.fillRect(108 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 119, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 63, 85, 255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(108 + x, 68 + y, 1, 7);
        g2d.fillRect(109 + x, 69 + y, 1, 7);
        g2d.fillRect(107 + x, 72 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136, 136, 136, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 127, 170, 255), COLORS.get(ImageUtilities.NEG_GREY_7)));
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 153, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 159, 170, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170, 170, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 187, 187, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 191, 170, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(111 + x, 40 + y, 4, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(98 + x, 41 + y, 1, 3);
        g2d.fillRect(99 + x, 41 + y, 1, 2);
        g2d.fillRect(100 + x, 41 + y, 2, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 4, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 3);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 8, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 3);
        g2d.fillRect(112 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 2);
        g2d.fillRect(110 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 5);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 4);
        g2d.fillRect(117 + x, 61 + y, 1, 2);
        g2d.fillRect(102 + x, 62 + y, 1, 3);
        g2d.fillRect(116 + x, 65 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 2);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 3);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 2, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 3);
        g2d.fillRect(103 + x, 77 + y, 3, 1);
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 3, 1);
        g2d.fillRect(103 + x, 79 + y, 2, 1);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 204, 204, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 223, 170, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(116 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 2, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 221, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 41 + y, 2, 1);
        g2d.fillRect(99 + x, 43 + y, 1, 2);
        g2d.fillRect(105 + x, 43 + y, 1, 1);
        g2d.fillRect(107 + x, 44 + y, 3, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 4);
        g2d.fillRect(108 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(94 + x, 46 + y, 1, 4);
        g2d.fillRect(96 + x, 47 + y, 1, 4);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 4);
        g2d.fillRect(104 + x, 71 + y, 2, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 2, 1);
        g2d.fillRect(115 + x, 79 + y, 3, 1);
        g2d.fillRect(108 + x, 80 + y, 6, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 238, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 41 + y, 2, 1);
        g2d.fillRect(110 + x, 41 + y, 2, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 2, 1);
        g2d.fillRect(104 + x, 43 + y, 1, 1);
        g2d.fillRect(110 + x, 43 + y, 2, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 4);
        g2d.fillRect(97 + x, 44 + y, 2, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 3);
        g2d.fillRect(96 + x, 46 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 4);
        g2d.fillRect(110 + x, 46 + y, 3, 1);
        g2d.fillRect(113 + x, 47 + y, 4, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 1, 11);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(116 + x, 71 + y, 1, 2);
        g2d.fillRect(104 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(118 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 2, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 3, 1);
        g2d.fillRect(113 + x, 79 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 41 + y, 1, 7);
        g2d.fillRect(107 + x, 41 + y, 3, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 3);
        g2d.fillRect(103 + x, 43 + y, 1, 5);
        g2d.fillRect(106 + x, 43 + y, 1, 5);
        g2d.fillRect(107 + x, 43 + y, 3, 1);
        g2d.fillRect(113 + x, 43 + y, 1, 4);
        g2d.fillRect(114 + x, 43 + y, 1, 4);
        g2d.fillRect(115 + x, 43 + y, 1, 4);
        g2d.fillRect(116 + x, 43 + y, 2, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 2);
        g2d.fillRect(104 + x, 44 + y, 1, 4);
        g2d.fillRect(105 + x, 44 + y, 1, 4);
        g2d.fillRect(111 + x, 44 + y, 1, 2);
        g2d.fillRect(112 + x, 44 + y, 1, 2);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 5);
        g2d.fillRect(97 + x, 45 + y, 1, 5);
        g2d.fillRect(98 + x, 45 + y, 1, 4);
        g2d.fillRect(107 + x, 45 + y, 1, 3);
        g2d.fillRect(109 + x, 45 + y, 1, 3);
        g2d.fillRect(110 + x, 45 + y, 1, 1);
        g2d.fillRect(108 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 4);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 2, 1);
    }
    boolean originalColorArray = true;

    public void setOriginalColorArray(boolean b) {
        originalColorArray = b;

    }

    public boolean getOriginalColorArray() {
        return originalColorArray;
    }
}
