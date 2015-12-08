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
public class Srt91 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt91() {
        super();
        containsTL = true;
    }

    public Srt91(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt91(String middle, ColorArray colorSwitch) {
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

//    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d) {
//    }
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
        g2d.fillRect(103 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 48 + y, 3, 1);
        g2d.fillRect(116 + x, 48 + y, 2, 1);
        g2d.fillRect(100 + x, 49 + y, 2, 1);
        g2d.fillRect(118 + x, 49 + y, 2, 1);
        g2d.fillRect(100 + x, 59 + y, 4, 1);
        g2d.fillRect(116 + x, 59 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 48 + y, 3, 1);
        g2d.fillRect(114 + x, 48 + y, 2, 1);
        g2d.fillRect(108 + x, 51 + y, 2, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 3);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 3, 1);
        g2d.fillRect(111 + x, 58 + y, 3, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 4, 1);
        g2d.fillRect(100 + x, 58 + y, 5, 1);
        g2d.fillRect(115 + x, 58 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 8);
        g2d.fillRect(115 + x, 50 + y, 1, 8);
        g2d.fillRect(118 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 6);
        g2d.fillRect(119 + x, 51 + y, 1, 7);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(102 + x, 52 + y, 1, 6);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 54 + y, 1, 4);
        g2d.fillRect(118 + x, 54 + y, 1, 4);
        g2d.fillRect(103 + x, 55 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 3);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 4);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 56 + y, 2, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 48 + y, 6, 1);
        g2d.fillRect(107 + x, 50 + y, 4, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 3);
        g2d.fillRect(110 + x, 53 + y, 1, 2);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 49 + y, 14, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 50 + y, 1, 3);
        g2d.fillRect(106 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 6);
        g2d.fillRect(114 + x, 50 + y, 1, 5);
        g2d.fillRect(116 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 5);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 5);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(108 + x, 52 + y, 1, 3);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 6, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 3);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 3);
        g2d.fillRect(105 + x, 69 + y, 1, 4);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 75 + y, 3, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 2, 1);
        g2d.fillRect(103 + x, 77 + y, 3, 1);
        g2d.fillRect(116 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 58 + y, 3, 1);
        g2d.fillRect(111 + x, 58 + y, 3, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 2, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 2, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 2, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 3, 1);
        g2d.fillRect(114 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 57 + y, 4, 1);
        g2d.fillRect(102 + x, 58 + y, 3, 1);
        g2d.fillRect(115 + x, 58 + y, 3, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(122 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 2);
        g2d.fillRect(123 + x, 80 + y, 1, 1);
        g2d.fillRect(98 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(124 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 57 + y, 4, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 6, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 8, 1);
        g2d.fillRect(102 + x, 60 + y, 3, 1);
        g2d.fillRect(114 + x, 60 + y, 4, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(115 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(101 + x, 76 + y, 1, 3);
        g2d.fillRect(100 + x, 77 + y, 1, 4);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(99 + x, 79 + y, 1, 3);
        g2d.fillRect(114 + x, 79 + y, 1, 2);
        g2d.fillRect(121 + x, 79 + y, 1, 4);
        g2d.fillRect(122 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(123 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 82 + y, 3, 1);
        g2d.fillRect(107 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 4, 1);
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 83 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 58 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 2);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 2, 1);
        g2d.fillRect(115 + x, 70 + y, 2, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 3);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 3, 1);
        g2d.fillRect(109 + x, 77 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 77 + y, 1, 4);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 4);
        g2d.fillRect(109 + x, 78 + y, 1, 4);
        g2d.fillRect(110 + x, 78 + y, 5, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(101 + x, 79 + y, 1, 3);
        g2d.fillRect(105 + x, 79 + y, 1, 4);
        g2d.fillRect(112 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 1, 3);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 2, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(122 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 60 + y, 2, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 3);
        g2d.fillRect(104 + x, 61 + y, 1, 4);
        g2d.fillRect(105 + x, 61 + y, 1, 8);
        g2d.fillRect(107 + x, 61 + y, 3, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 6);
        g2d.fillRect(107 + x, 63 + y, 1, 4);
        g2d.fillRect(108 + x, 63 + y, 1, 3);
        g2d.fillRect(109 + x, 63 + y, 1, 3);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 1, 4);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 1, 8);
        g2d.fillRect(114 + x, 65 + y, 1, 7);
        g2d.fillRect(112 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 2);
        g2d.fillRect(106 + x, 69 + y, 1, 2);
        g2d.fillRect(108 + x, 69 + y, 1, 6);
        g2d.fillRect(107 + x, 70 + y, 1, 4);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 2);
        g2d.fillRect(110 + x, 71 + y, 1, 4);
        g2d.fillRect(112 + x, 71 + y, 1, 6);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 5);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 75 + y, 2, 1);
        g2d.fillRect(103 + x, 76 + y, 8, 1);
        g2d.fillRect(113 + x, 76 + y, 5, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 5);
        g2d.fillRect(102 + x, 79 + y, 1, 3);
        g2d.fillRect(107 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(98 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 3, 1);
        g2d.fillRect(107 + x, 83 + y, 3, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(113 + x, 83 + y, 3, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 4, 1);
        g2d.fillRect(110 + x, 84 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 5, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(102, 127, 0));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(153, 159, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(204, 63, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 127, 170));
        COLORS.set(ImageUtilities.GREY, new Color(204, 204, 204));
        COLORS.set(ImageUtilities.GREY_1, new Color(221, 221, 221));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 191, 255));
        COLORS.set(ImageUtilities.GREY_3, new Color(238, 238, 238));
        COLORS.set(ImageUtilities.GREY_4, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
