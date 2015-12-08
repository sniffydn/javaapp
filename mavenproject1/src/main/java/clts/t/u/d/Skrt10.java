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
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Skrt10 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt10() {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt10(String middle) {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt10(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        return new obsolete.Skrt10H(middle, c);
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        paintTL2(x, prevY, g2d);
        paintTL1(x, 0, g2d);

    }
    int prevY = 0;

    public void drawB(int x, int y, GraphicsMap g2d) {
        paintTU(x, y, g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (middle.equals("b")) {
            drawB(x, y, g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
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

    public void paintTL1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(106 + x, 60 + y, 3, 1);
        g2d.fillRect(112 + x, 60 + y, 3, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 3, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 2, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 62 + y, 1, 2);
        g2d.fillRect(108 + x, 62 + y, 2, 1);
        g2d.fillRect(111 + x, 62 + y, 5, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 2);
        g2d.fillRect(104 + x, 63 + y, 2, 1);
        g2d.fillRect(115 + x, 63 + y, 2, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(108 + x, 63 + y, 3, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(111 + x, 63 + y, 2, 1);
        g2d.fillRect(104 + x, 64 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 63 + y, 1, 3);
        g2d.fillRect(111 + x, 64 + y, 1, 9);
        g2d.fillRect(112 + x, 64 + y, 1, 7);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(116 + x, 64 + y, 1, 3);
        g2d.fillRect(117 + x, 64 + y, 1, 3);
        g2d.fillRect(103 + x, 65 + y, 1, 2);
        g2d.fillRect(104 + x, 65 + y, 1, 5);
        g2d.fillRect(105 + x, 65 + y, 1, 8);
        g2d.fillRect(118 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 5);
        g2d.fillRect(113 + x, 67 + y, 1, 7);
        g2d.fillRect(119 + x, 67 + y, 2, 1);
        g2d.fillRect(120 + x, 68 + y, 1, 2);
        g2d.fillRect(121 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 4);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(119 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(121 + x, 70 + y, 1, 2);
        g2d.fillRect(110 + x, 71 + y, 1, 5);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(122 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(112 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 7);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 2);
        g2d.fillRect(101 + x, 73 + y, 1, 4);
        g2d.fillRect(104 + x, 73 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(123 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 7);
        g2d.fillRect(120 + x, 74 + y, 1, 2);
        g2d.fillRect(124 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(121 + x, 75 + y, 1, 2);
        g2d.fillRect(125 + x, 75 + y, 1, 2);
        g2d.fillRect(100 + x, 76 + y, 1, 3);
        g2d.fillRect(103 + x, 76 + y, 1, 2);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(122 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(116 + x, 79 + y, 1, 4);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 5);
        g2d.fillRect(117 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 3, 1);
        g2d.fillRect(104 + x, 62 + y, 2, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(118 + x, 69 + y, 1, 3);
        g2d.fillRect(104 + x, 70 + y, 1, 3);
        g2d.fillRect(120 + x, 70 + y, 1, 4);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 2);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 2, 1);
        g2d.fillRect(121 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 2, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 3);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(123 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 2);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 64 + y, 1, 3);
        g2d.fillRect(107 + x, 64 + y, 4, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(102 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 6);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(101 + x, 67 + y, 1, 5);
        g2d.fillRect(103 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 67 + y, 1, 5);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(109 + x, 71 + y, 1, 15);
        g2d.fillRect(100 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 3);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(99 + x, 74 + y, 1, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 1);
        g2d.fillRect(98 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(117 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(121 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(119 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(123 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(116 + x, 67 + y, 2, 1);
        g2d.fillRect(117 + x, 68 + y, 3, 1);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(121 + x, 72 + y, 1, 2);
        g2d.fillRect(122 + x, 73 + y, 1, 4);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 5);
        g2d.fillRect(102 + x, 76 + y, 1, 2);
        g2d.fillRect(123 + x, 76 + y, 2, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(124 + x, 77 + y, 2, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 3);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 7);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(108 + x, 65 + y, 1, 21);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(102 + x, 67 + y, 1, 1);
        g2d.fillRect(102 + x, 69 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 9);
        g2d.fillRect(116 + x, 73 + y, 1, 6);
        g2d.fillRect(100 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 3);
        g2d.fillRect(99 + x, 75 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 3);
        g2d.fillRect(118 + x, 76 + y, 1, 2);
        g2d.fillRect(120 + x, 76 + y, 1, 2);
        g2d.fillRect(121 + x, 78 + y, 1, 3);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(107 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 66 + y, 1, 4);
        g2d.fillRect(102 + x, 68 + y, 1, 1);
        g2d.fillRect(102 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(100 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 8);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 7);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 2, 1);
        g2d.fillRect(117 + x, 80 + y, 2, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 4);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
    }

    public void paintTL2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(126 + x, 75 + y, 1, 2);
        g2d.fillRect(127 + x, 76 + y, 1, 2);
        g2d.fillRect(99 + x, 77 + y, 1, 3);
        g2d.fillRect(123 + x, 77 + y, 1, 1);
        g2d.fillRect(128 + x, 77 + y, 1, 1);
        g2d.fillRect(124 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 3);
        g2d.fillRect(125 + x, 79 + y, 1, 1);
        g2d.fillRect(97 + x, 80 + y, 1, 1);
        g2d.fillRect(126 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 3, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 4);
        g2d.fillRect(117 + x, 83 + y, 3, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 3);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(125 + x, 77 + y, 1, 2);
        g2d.fillRect(126 + x, 78 + y, 1, 2);
        g2d.fillRect(127 + x, 78 + y, 1, 3);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(97 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 76 + y, 1, 1);
        g2d.fillRect(99 + x, 76 + y, 1, 1);
        g2d.fillRect(96 + x, 77 + y, 1, 1);
        g2d.fillRect(95 + x, 78 + y, 1, 1);
        g2d.fillRect(123 + x, 78 + y, 1, 1);
        g2d.fillRect(124 + x, 79 + y, 1, 1);
        g2d.fillRect(95 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 1);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 3);
        g2d.fillRect(123 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(122 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(125 + x, 80 + y, 1, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 1);
        g2d.fillRect(122 + x, 82 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(124 + x, 77 + y, 1, 1);
        g2d.fillRect(126 + x, 77 + y, 1, 1);
        g2d.fillRect(99 + x, 80 + y, 1, 5);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(98 + x, 82 + y, 1, 3);
        g2d.fillRect(115 + x, 83 + y, 1, 3);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 85 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(98 + x, 77 + y, 1, 2);
        g2d.fillRect(97 + x, 78 + y, 1, 1);
        g2d.fillRect(122 + x, 79 + y, 1, 2);
        g2d.fillRect(96 + x, 80 + y, 1, 1);
        g2d.fillRect(124 + x, 80 + y, 1, 3);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(123 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 2, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 4);
        g2d.fillRect(103 + x, 83 + y, 1, 3);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(122 + x, 84 + y, 1, 3);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 4);
        g2d.fillRect(107 + x, 86 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(98 + x, 76 + y, 1, 1);
        g2d.fillRect(97 + x, 77 + y, 1, 1);
        g2d.fillRect(96 + x, 78 + y, 1, 2);
        g2d.fillRect(122 + x, 78 + y, 1, 1);
        g2d.fillRect(95 + x, 79 + y, 1, 1);
        g2d.fillRect(97 + x, 79 + y, 1, 1);
        g2d.fillRect(123 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 82 + y, 1, 2);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(122 + x, 83 + y, 1, 1);
        g2d.fillRect(123 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
    }

    public void paintTU(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 6, 1);
        g2d.fillRect(116 + x, 61 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(110 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(109 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 51 + y, 6, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 5);
        g2d.fillRect(108 + x, 55 + y, 2, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 3);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 52 + y, 6, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 4);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 3);
        g2d.fillRect(104 + x, 57 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 2, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 4);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 3);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 2, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 7);
        g2d.fillRect(102 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 4);
        g2d.fillRect(105 + x, 53 + y, 1, 4);
        g2d.fillRect(106 + x, 53 + y, 1, 3);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(115 + x, 51 + y, 1, 7);
        g2d.fillRect(116 + x, 51 + y, 1, 7);
        g2d.fillRect(113 + x, 53 + y, 1, 5);
        g2d.fillRect(114 + x, 53 + y, 1, 5);
        g2d.fillRect(117 + x, 54 + y, 1, 4);
        g2d.fillRect(118 + x, 54 + y, 1, 3);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_7, new Color(4, 12, 86));
        COLORS.set(ImageUtilities.NEG_GREY_6, new Color(51, 51, 51));
        COLORS.set(ImageUtilities.NEG_GREY_5, new Color(0, 86, 73));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(85, 85, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(46, 0, 254));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(119, 119, 119));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(72, 63, 255));
        COLORS.set(ImageUtilities.GREY, new Color(0, 153, 251));
        COLORS.set(ImageUtilities.GREY_1, new Color(0, 176, 239));
        COLORS.set(ImageUtilities.GREY_2, new Color(142, 121, 170));
        COLORS.set(ImageUtilities.GREY_3, new Color(105, 85, 255));
        COLORS.set(ImageUtilities.GREY_4, new Color(85, 109, 255));
        COLORS.set(ImageUtilities.GREY_5, new Color(1, 204, 255));
        COLORS.set(ImageUtilities.GREY_6, new Color(1, 250, 248));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
