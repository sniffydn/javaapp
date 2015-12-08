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
public class Srt90 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt90() {
        super();
        containsTL = true;
    }

    public Srt90(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt90(String middle, ColorArray colorSwitch) {
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 47 + y, 3, 1);
        g2d.fillRect(111 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 2, 1);
        g2d.fillRect(115 + x, 50 + y, 5, 1);
        g2d.fillRect(119 + x, 51 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 47 + y, 3, 1);
        g2d.fillRect(106 + x, 48 + y, 5, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 11);
        g2d.fillRect(110 + x, 49 + y, 3, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 7);
        g2d.fillRect(112 + x, 50 + y, 1, 4);
        g2d.fillRect(113 + x, 50 + y, 2, 1);
        g2d.fillRect(115 + x, 51 + y, 4, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 6);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(113 + x, 54 + y, 1, 6);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(117 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 6);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 2, 1);
        g2d.fillRect(115 + x, 52 + y, 4, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 4, 1);
        g2d.fillRect(108 + x, 57 + y, 3, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(109 + x, 59 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 47 + y, 1, 8);
        g2d.fillRect(102 + x, 47 + y, 1, 9);
        g2d.fillRect(103 + x, 47 + y, 1, 5);
        g2d.fillRect(104 + x, 47 + y, 1, 3);
        g2d.fillRect(105 + x, 50 + y, 1, 3);
        g2d.fillRect(106 + x, 50 + y, 1, 4);
        g2d.fillRect(108 + x, 51 + y, 3, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 3);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 2, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 50 + y, 1, 5);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 2, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(99 + x, 43 + y, 3, 1);
        g2d.fillRect(102 + x, 44 + y, 2, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 3);
        g2d.fillRect(104 + x, 45 + y, 2, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(96 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 5);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 3, 1);
        g2d.fillRect(103 + x, 74 + y, 2, 1);
        g2d.fillRect(115 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 10, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 3, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 2);
        g2d.fillRect(102 + x, 45 + y, 2, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 47 + y, 1, 2);
        g2d.fillRect(107 + x, 47 + y, 1, 19);
        g2d.fillRect(95 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 5);
        g2d.fillRect(112 + x, 51 + y, 1, 3);
        g2d.fillRect(113 + x, 54 + y, 1, 16);
        g2d.fillRect(117 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 7);
        g2d.fillRect(104 + x, 58 + y, 1, 4);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 3);
        g2d.fillRect(108 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 4);
        g2d.fillRect(115 + x, 58 + y, 1, 12);
        g2d.fillRect(116 + x, 58 + y, 1, 4);
        g2d.fillRect(104 + x, 65 + y, 1, 7);
        g2d.fillRect(114 + x, 65 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 5);
        g2d.fillRect(106 + x, 66 + y, 1, 9);
        g2d.fillRect(116 + x, 68 + y, 1, 4);
        g2d.fillRect(112 + x, 69 + y, 1, 6);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 2);
        g2d.fillRect(118 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 44 + y, 2, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 4);
        g2d.fillRect(99 + x, 45 + y, 3, 1);
        g2d.fillRect(100 + x, 46 + y, 5, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 47 + y, 3, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 5);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 3, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 4, 1);
        g2d.fillRect(108 + x, 57 + y, 3, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(109 + x, 59 + y, 3, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 5);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 3);
        g2d.fillRect(114 + x, 62 + y, 1, 3);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 4);
        g2d.fillRect(115 + x, 70 + y, 1, 4);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 45 + y, 1, 2);
        g2d.fillRect(98 + x, 45 + y, 1, 2);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 5, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 7);
        g2d.fillRect(102 + x, 48 + y, 1, 8);
        g2d.fillRect(103 + x, 48 + y, 1, 4);
        g2d.fillRect(104 + x, 48 + y, 1, 2);
        g2d.fillRect(105 + x, 50 + y, 1, 3);
        g2d.fillRect(106 + x, 50 + y, 1, 4);
        g2d.fillRect(108 + x, 51 + y, 3, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 3);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 2, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 3, 1);
        g2d.fillRect(108 + x, 62 + y, 3, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 63 + y, 1, 3);
        g2d.fillRect(109 + x, 63 + y, 2, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 5);
        g2d.fillRect(111 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 2);
        g2d.fillRect(107 + x, 69 + y, 1, 3);
        g2d.fillRect(113 + x, 70 + y, 1, 5);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 3);
        g2d.fillRect(114 + x, 72 + y, 1, 3);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 5);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 2);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 2);
        g2d.fillRect(94 + x, 47 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 2, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(16, 16, 16));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(33, 33, 33));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(49, 49, 49));
        COLORS.set(ImageUtilities.GREY, new Color(66, 66, 66));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 0, 173));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 90, 173));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 156, 173));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
