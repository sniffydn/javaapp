package clts.t.u.s;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

public class Srt101 extends SuperTU {

    boolean switcher = false;

    public Srt101() {
        super();
        containsTL = true;
    }

    public Srt101(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt101(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d) {
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


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 2, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 5);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 50 + y, 1, 3);
        g2d.fillRect(100 + x, 51 + y, 2, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 3);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 3);
        g2d.fillRect(99 + x, 54 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(113 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 2, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 4);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 3);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(102 + x, 51 + y, 1, 4);
        g2d.fillRect(100 + x, 52 + y, 1, 3);
        g2d.fillRect(103 + x, 52 + y, 1, 3);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(97 + x, 56 + y, 1, 3);
        g2d.fillRect(96 + x, 57 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 1);
        g2d.fillRect(121 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(115 + x, 61 + y, 2, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 3);
        g2d.fillRect(116 + x, 62 + y, 1, 9);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 2, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 2, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 57 + y, 2, 1);
        g2d.fillRect(95 + x, 58 + y, 2, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 7);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 1, 3);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 2);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 3);
        g2d.fillRect(108 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 3, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 3, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 55 + y, 1, 3);
        g2d.fillRect(94 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 4, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 6);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 2, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 8);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 4);
        g2d.fillRect(106 + x, 67 + y, 2, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(112 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 62 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 67 + y, 2, 1);
        g2d.fillRect(110 + x, 69 + y, 3, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(95 + x, 82 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(97 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 4);
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 3);
        g2d.fillRect(120 + x, 46 + y, 1, 3);
        g2d.fillRect(99 + x, 47 + y, 1, 3);
        g2d.fillRect(92 + x, 49 + y, 1, 5);
        g2d.fillRect(121 + x, 49 + y, 1, 3);
        g2d.fillRect(97 + x, 52 + y, 1, 3);
        g2d.fillRect(122 + x, 52 + y, 1, 4);
        g2d.fillRect(94 + x, 53 + y, 1, 3);
        g2d.fillRect(93 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 3);
        g2d.fillRect(93 + x, 58 + y, 1, 2);
        g2d.fillRect(98 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 7);
        g2d.fillRect(96 + x, 59 + y, 1, 3);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(121 + x, 59 + y, 1, 1);
        g2d.fillRect(92 + x, 60 + y, 1, 5);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 5);
        g2d.fillRect(97 + x, 61 + y, 1, 7);
        g2d.fillRect(120 + x, 61 + y, 1, 4);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 2);
        g2d.fillRect(91 + x, 65 + y, 1, 9);
        g2d.fillRect(118 + x, 65 + y, 1, 2);
        g2d.fillRect(121 + x, 65 + y, 1, 8);
        g2d.fillRect(123 + x, 65 + y, 1, 6);
        g2d.fillRect(93 + x, 66 + y, 1, 5);
        g2d.fillRect(119 + x, 67 + y, 1, 4);
        g2d.fillRect(96 + x, 68 + y, 1, 10);
        g2d.fillRect(109 + x, 70 + y, 1, 3);
        g2d.fillRect(110 + x, 70 + y, 1, 5);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(92 + x, 71 + y, 1, 8);
        g2d.fillRect(94 + x, 71 + y, 1, 7);
        g2d.fillRect(105 + x, 71 + y, 1, 3);
        g2d.fillRect(115 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(120 + x, 71 + y, 1, 9);
        g2d.fillRect(122 + x, 71 + y, 1, 7);
        g2d.fillRect(124 + x, 71 + y, 1, 4);
        g2d.fillRect(103 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 5);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(108 + x, 73 + y, 1, 3);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 10);
        g2d.fillRect(90 + x, 74 + y, 1, 10);
        g2d.fillRect(104 + x, 74 + y, 1, 4);
        g2d.fillRect(113 + x, 74 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 4);
        g2d.fillRect(111 + x, 75 + y, 1, 4);
        g2d.fillRect(125 + x, 75 + y, 1, 10);
        g2d.fillRect(101 + x, 76 + y, 1, 5);
        g2d.fillRect(107 + x, 77 + y, 1, 3);
        g2d.fillRect(95 + x, 78 + y, 1, 1);
        g2d.fillRect(97 + x, 78 + y, 1, 4);
        g2d.fillRect(123 + x, 78 + y, 1, 6);
        g2d.fillRect(91 + x, 79 + y, 1, 6);
        g2d.fillRect(96 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 2);
        g2d.fillRect(105 + x, 79 + y, 2, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 3, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(96 + x, 83 + y, 1, 1);
        g2d.fillRect(95 + x, 84 + y, 1, 1);
        g2d.fillRect(124 + x, 84 + y, 1, 2);
        g2d.fillRect(92 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 3);
        g2d.fillRect(119 + x, 46 + y, 1, 2);
        g2d.fillRect(97 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 4);
        g2d.fillRect(94 + x, 50 + y, 1, 3);
        g2d.fillRect(93 + x, 51 + y, 1, 3);
        g2d.fillRect(96 + x, 51 + y, 1, 4);
        g2d.fillRect(95 + x, 54 + y, 1, 3);
        g2d.fillRect(97 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 2, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 2, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(95 + x, 59 + y, 1, 3);
        g2d.fillRect(97 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 6);
        g2d.fillRect(120 + x, 60 + y, 2, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 6);
        g2d.fillRect(121 + x, 61 + y, 1, 2);
        g2d.fillRect(96 + x, 62 + y, 1, 1);
        g2d.fillRect(95 + x, 63 + y, 1, 3);
        g2d.fillRect(120 + x, 65 + y, 1, 6);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(94 + x, 66 + y, 1, 5);
        g2d.fillRect(107 + x, 70 + y, 1, 7);
        g2d.fillRect(113 + x, 70 + y, 1, 4);
        g2d.fillRect(104 + x, 71 + y, 1, 3);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 8);
        g2d.fillRect(116 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 72 + y, 1, 5);
        g2d.fillRect(103 + x, 73 + y, 1, 7);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 4);
        g2d.fillRect(106 + x, 76 + y, 1, 3);
        g2d.fillRect(91 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 4);
        g2d.fillRect(96 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(95 + x, 44 + y, 1, 10);
        g2d.fillRect(94 + x, 45 + y, 1, 5);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 4);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(93 + x, 49 + y, 1, 2);
        g2d.fillRect(97 + x, 49 + y, 1, 3);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(93 + x, 60 + y, 1, 6);
        g2d.fillRect(96 + x, 63 + y, 1, 5);
        g2d.fillRect(121 + x, 63 + y, 1, 2);
        g2d.fillRect(92 + x, 65 + y, 1, 6);
        g2d.fillRect(95 + x, 66 + y, 1, 8);
        g2d.fillRect(122 + x, 66 + y, 1, 5);
        g2d.fillRect(123 + x, 71 + y, 1, 7);
        g2d.fillRect(106 + x, 73 + y, 1, 3);
        g2d.fillRect(111 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 73 + y, 1, 6);
        g2d.fillRect(91 + x, 74 + y, 1, 3);
        g2d.fillRect(105 + x, 74 + y, 1, 5);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 5);
        g2d.fillRect(116 + x, 75 + y, 1, 5);
        g2d.fillRect(124 + x, 75 + y, 1, 9);
        g2d.fillRect(102 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 76 + y, 1, 3);
        g2d.fillRect(113 + x, 76 + y, 1, 3);
        g2d.fillRect(117 + x, 77 + y, 1, 3);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(51, 31, 0));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(102, 63, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(153, 95, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(85, 85, 85));
        COLORS.set(ImageUtilities.GREY, new Color(102, 102, 102));
        COLORS.set(ImageUtilities.GREY_1, new Color(153, 153, 153));
        COLORS.set(ImageUtilities.GREY_2, new Color(170, 170, 170));
        COLORS.set(ImageUtilities.GREY_3, new Color(204, 204, 204));
        COLORS.set(ImageUtilities.GREY_4, new Color(238, 238, 238));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}