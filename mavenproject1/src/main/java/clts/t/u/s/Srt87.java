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
public class Srt87 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt87() {
        super();
        containsTL = true;
    }

    public Srt87(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt87(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(113 + x, 47 + y, 1, 4);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 2, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 2, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(116 + x, 50 + y, 2, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 3);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 2, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 2, 1);
        g2d.fillRect(115 + x, 58 + y, 2, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 2, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 51 + y, 1, 5);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 3);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(103 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 47 + y, 1, 9);
        g2d.fillRect(102 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 3, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 47 + y, 6, 1);
        g2d.fillRect(115 + x, 47 + y, 2, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 8);
        g2d.fillRect(104 + x, 48 + y, 1, 8);
        g2d.fillRect(105 + x, 48 + y, 1, 8);
        g2d.fillRect(106 + x, 48 + y, 1, 8);
        g2d.fillRect(107 + x, 48 + y, 1, 8);
        g2d.fillRect(108 + x, 48 + y, 1, 8);
        g2d.fillRect(109 + x, 48 + y, 1, 7);
        g2d.fillRect(110 + x, 48 + y, 1, 7);
        g2d.fillRect(111 + x, 48 + y, 1, 4);
        g2d.fillRect(112 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 2, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 3);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 3);
        g2d.fillRect(102 + x, 51 + y, 1, 5);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 4);
        g2d.fillRect(112 + x, 52 + y, 1, 4);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(113 + x, 47 + y, 1, 4);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 2, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(117 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(116 + x, 50 + y, 2, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 4);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(117 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 3);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 2, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 3, 1);
        g2d.fillRect(114 + x, 64 + y, 2, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 2, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 2, 1);
        g2d.fillRect(115 + x, 58 + y, 2, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(98 + x, 41 + y, 1, 3);
        g2d.fillRect(99 + x, 41 + y, 1, 2);
        g2d.fillRect(100 + x, 41 + y, 3, 1);
        g2d.fillRect(115 + x, 41 + y, 3, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 3);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 3);
        g2d.fillRect(112 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 2);
        g2d.fillRect(110 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 5);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 3);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 3);
        g2d.fillRect(121 + x, 51 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 2, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 2, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 3);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 2);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 3);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 72 + y, 1, 4);
        g2d.fillRect(119 + x, 72 + y, 1, 5);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 75 + y, 3, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 3, 1);
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 3, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(99 + x, 43 + y, 1, 2);
        g2d.fillRect(105 + x, 43 + y, 1, 1);
        g2d.fillRect(107 + x, 44 + y, 3, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 3);
        g2d.fillRect(108 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(94 + x, 46 + y, 1, 4);
        g2d.fillRect(96 + x, 47 + y, 1, 4);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 51 + y, 1, 3);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 3);
        g2d.fillRect(114 + x, 57 + y, 1, 4);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 3, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 4);
        g2d.fillRect(104 + x, 71 + y, 2, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 2, 1);
        g2d.fillRect(108 + x, 75 + y, 2, 1);
        g2d.fillRect(111 + x, 75 + y, 3, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 2, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 4);
        g2d.fillRect(97 + x, 44 + y, 2, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 11);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 3);
        g2d.fillRect(96 + x, 46 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 4);
        g2d.fillRect(102 + x, 48 + y, 1, 3);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 2, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 3, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 9);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 2, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 2);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 2);
        g2d.fillRect(104 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 72 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 2, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 2);
        g2d.fillRect(106 + x, 75 + y, 2, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 2, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(101 + x, 42 + y, 1, 3);
        g2d.fillRect(102 + x, 42 + y, 1, 6);
        g2d.fillRect(103 + x, 43 + y, 1, 13);
        g2d.fillRect(104 + x, 43 + y, 1, 13);
        g2d.fillRect(113 + x, 43 + y, 1, 4);
        g2d.fillRect(114 + x, 43 + y, 1, 4);
        g2d.fillRect(115 + x, 43 + y, 1, 5);
        g2d.fillRect(116 + x, 43 + y, 2, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 2);
        g2d.fillRect(105 + x, 44 + y, 1, 12);
        g2d.fillRect(106 + x, 44 + y, 1, 12);
        g2d.fillRect(111 + x, 44 + y, 1, 8);
        g2d.fillRect(112 + x, 44 + y, 1, 6);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 5);
        g2d.fillRect(97 + x, 45 + y, 1, 5);
        g2d.fillRect(98 + x, 45 + y, 1, 4);
        g2d.fillRect(107 + x, 45 + y, 1, 11);
        g2d.fillRect(109 + x, 45 + y, 1, 10);
        g2d.fillRect(110 + x, 45 + y, 1, 10);
        g2d.fillRect(108 + x, 46 + y, 1, 10);
        g2d.fillRect(116 + x, 46 + y, 1, 3);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(114 + x, 49 + y, 1, 3);
        g2d.fillRect(115 + x, 50 + y, 1, 3);
        g2d.fillRect(102 + x, 51 + y, 1, 5);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 4);
        g2d.fillRect(112 + x, 52 + y, 1, 4);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 2, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(105 + x, 62 + y, 2, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 2, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 2);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 3);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 3);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 4);
        g2d.fillRect(114 + x, 65 + y, 1, 4);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 66 + y, 1, 8);
        g2d.fillRect(110 + x, 67 + y, 1, 8);
        g2d.fillRect(111 + x, 67 + y, 1, 8);
        g2d.fillRect(109 + x, 68 + y, 1, 3);
        g2d.fillRect(106 + x, 69 + y, 3, 1);
        g2d.fillRect(107 + x, 70 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 4);
        g2d.fillRect(114 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 72 + y, 1, 3);
        g2d.fillRect(105 + x, 73 + y, 1, 4);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 6, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 77 + y, 6, 1);
        g2d.fillRect(105 + x, 78 + y, 2, 1);
        g2d.fillRect(108 + x, 79 + y, 4, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_6, new Color(153, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_5, new Color(204, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(51, 159, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(51, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(255, 0, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(51, 223, 85));
        COLORS.set(ImageUtilities.GREY, new Color(153, 159, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(204, 191, 170));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 223, 170));
        COLORS.set(ImageUtilities.GREY_3, new Color(221, 221, 221));
        COLORS.set(ImageUtilities.GREY_4, new Color(238, 238, 238));
        COLORS.set(ImageUtilities.GREY_5, new Color(255, 255, 255));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
