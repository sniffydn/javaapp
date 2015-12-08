package clts.t.u.s;

import clts.*;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

public class Jac5 extends SuperTU {

    public Jac5() {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Jac5(String middle) {
        super(middle);
        containsTL = true;
    }

    public Jac5(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d) {
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d) {
    }

    public void drawB(int x, int y, GraphicsMap g2d) {
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (middle.equalsIgnoreCase("b")) {
            paintU(x,0,g2d);
            paintTU(x, y, g2d);
            paintTL(x, 0, g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintU(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 36 + y, 2, 1);
        g2d.fillRect(116 + x, 36 + y, 2, 1);
        g2d.fillRect(99 + x, 37 + y, 2, 1);
        g2d.fillRect(118 + x, 37 + y, 2, 1);
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(120 + x, 38 + y, 1, 1);
        g2d.fillRect(97 + x, 39 + y, 1, 1);
        g2d.fillRect(104 + x, 39 + y, 1, 2);
        g2d.fillRect(121 + x, 39 + y, 1, 1);
        g2d.fillRect(95 + x, 40 + y, 2, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(122 + x, 40 + y, 2, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 2);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(124 + x, 41 + y, 1, 1);
        g2d.fillRect(92 + x, 42 + y, 2, 1);
        g2d.fillRect(125 + x, 42 + y, 2, 1);
        g2d.fillRect(91 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 4);
        g2d.fillRect(115 + x, 43 + y, 1, 2);
        g2d.fillRect(127 + x, 43 + y, 1, 1);
        g2d.fillRect(90 + x, 44 + y, 1, 3);
        g2d.fillRect(128 + x, 44 + y, 1, 3);
        g2d.fillRect(91 + x, 45 + y, 7, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 2);
        g2d.fillRect(121 + x, 45 + y, 7, 1);
        g2d.fillRect(89 + x, 46 + y, 1, 2);
        g2d.fillRect(98 + x, 46 + y, 2, 1);
        g2d.fillRect(119 + x, 46 + y, 2, 1);
        g2d.fillRect(129 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 2, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(120 + x, 47 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 36 + y, 1, 5);
        g2d.fillRect(115 + x, 36 + y, 1, 7);
        g2d.fillRect(114 + x, 37 + y, 1, 4);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(116 + x, 38 + y, 1, 2);
        g2d.fillRect(117 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(100 + x, 40 + y, 2, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 2);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(117 + x, 41 + y, 1, 2);
        g2d.fillRect(118 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 4);
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(100 + x, 44 + y, 1, 2);
        g2d.fillRect(117 + x, 44 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 38 + y, 1, 2);
        g2d.fillRect(100 + x, 39 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(117 + x, 39 + y, 1, 2);
        g2d.fillRect(118 + x, 39 + y, 1, 2);
        g2d.fillRect(119 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 5);
        g2d.fillRect(99 + x, 40 + y, 1, 5);
        g2d.fillRect(116 + x, 40 + y, 1, 2);
        g2d.fillRect(97 + x, 41 + y, 1, 3);
        g2d.fillRect(100 + x, 41 + y, 1, 3);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(120 + x, 41 + y, 1, 4);
        g2d.fillRect(121 + x, 41 + y, 1, 3);
        g2d.fillRect(95 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 42 + y, 1, 4);
        g2d.fillRect(119 + x, 42 + y, 1, 3);
        g2d.fillRect(122 + x, 42 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 1, 2);
        g2d.fillRect(94 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(124 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 37 + y, 2, 1);
        g2d.fillRect(116 + x, 37 + y, 2, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 2, 1);
        g2d.fillRect(120 + x, 39 + y, 1, 1);
        g2d.fillRect(121 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(98 + x, 39 + y, 1, 1);
        g2d.fillRect(122 + x, 41 + y, 2, 1);
        g2d.fillRect(124 + x, 42 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(125 + x, 43 + y, 1, 2);
        g2d.fillRect(126 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 44 + y, 5, 1);
        g2d.fillRect(124 + x, 44 + y, 1, 1);
        g2d.fillRect(127 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 2, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 2, 1);
        g2d.fillRect(94 + x, 42 + y, 1, 1);
        g2d.fillRect(92 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 43 + y, 1, 1);
        g2d.fillRect(91 + x, 44 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 3, 1);
        g2d.fillRect(119 + x, 45 + y, 2, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(108 + x, 60 + y, 1, 3);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(109 + x, 63 + y, 1, 14);
        g2d.fillRect(111 + x, 63 + y, 1, 14);
        g2d.fillRect(103 + x, 65 + y, 1, 5);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(102 + x, 70 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(101 + x, 72 + y, 1, 2);
        g2d.fillRect(119 + x, 72 + y, 1, 2);
        g2d.fillRect(100 + x, 74 + y, 1, 2);
        g2d.fillRect(120 + x, 74 + y, 1, 2);
        g2d.fillRect(99 + x, 76 + y, 1, 2);
        g2d.fillRect(121 + x, 76 + y, 1, 2);
        g2d.fillRect(108 + x, 77 + y, 1, 5);
        g2d.fillRect(112 + x, 77 + y, 1, 5);
        g2d.fillRect(98 + x, 78 + y, 1, 2);
        g2d.fillRect(122 + x, 78 + y, 1, 2);
        g2d.fillRect(97 + x, 80 + y, 1, 2);
        g2d.fillRect(123 + x, 80 + y, 1, 2);
        g2d.fillRect(96 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 5);
        g2d.fillRect(113 + x, 82 + y, 1, 5);
        g2d.fillRect(124 + x, 82 + y, 1, 2);
        g2d.fillRect(95 + x, 84 + y, 1, 2);
        g2d.fillRect(125 + x, 84 + y, 1, 2);
        g2d.fillRect(94 + x, 86 + y, 1, 2);
        g2d.fillRect(126 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 6);
        g2d.fillRect(114 + x, 87 + y, 1, 6);
        g2d.fillRect(93 + x, 88 + y, 1, 2);
        g2d.fillRect(127 + x, 88 + y, 1, 2);
        g2d.fillRect(92 + x, 90 + y, 1, 2);
        g2d.fillRect(128 + x, 90 + y, 1, 2);
        g2d.fillRect(91 + x, 92 + y, 1, 2);
        g2d.fillRect(129 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 93 + y, 1, 5);
        g2d.fillRect(115 + x, 93 + y, 1, 5);
        g2d.fillRect(92 + x, 94 + y, 1, 1);
        g2d.fillRect(128 + x, 94 + y, 1, 1);
        g2d.fillRect(93 + x, 95 + y, 1, 1);
        g2d.fillRect(127 + x, 95 + y, 1, 1);
        g2d.fillRect(94 + x, 96 + y, 1, 1);
        g2d.fillRect(126 + x, 96 + y, 1, 1);
        g2d.fillRect(95 + x, 97 + y, 1, 1);
        g2d.fillRect(125 + x, 97 + y, 1, 1);
        g2d.fillRect(96 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 5);
        g2d.fillRect(116 + x, 98 + y, 1, 5);
        g2d.fillRect(124 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 99 + y, 1, 1);
        g2d.fillRect(123 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 100 + y, 1, 1);
        g2d.fillRect(122 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 1);
        g2d.fillRect(121 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 1);
        g2d.fillRect(103 + x, 103 + y, 1, 3);
        g2d.fillRect(117 + x, 103 + y, 1, 3);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 8);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(114 + x, 69 + y, 1, 4);
        g2d.fillRect(105 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 3);
        g2d.fillRect(107 + x, 70 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 1, 5);
        g2d.fillRect(104 + x, 72 + y, 1, 3);
        g2d.fillRect(118 + x, 72 + y, 1, 5);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 4);
        g2d.fillRect(103 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 74 + y, 1, 4);
        g2d.fillRect(119 + x, 74 + y, 1, 6);
        g2d.fillRect(105 + x, 75 + y, 1, 4);
        g2d.fillRect(107 + x, 75 + y, 1, 2);
        g2d.fillRect(102 + x, 76 + y, 1, 4);
        g2d.fillRect(116 + x, 76 + y, 1, 5);
        g2d.fillRect(120 + x, 76 + y, 1, 6);
        g2d.fillRect(101 + x, 78 + y, 1, 5);
        g2d.fillRect(104 + x, 78 + y, 1, 6);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 6);
        g2d.fillRect(121 + x, 79 + y, 1, 4);
        g2d.fillRect(100 + x, 80 + y, 1, 6);
        g2d.fillRect(105 + x, 80 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 8);
        g2d.fillRect(99 + x, 82 + y, 1, 7);
        g2d.fillRect(103 + x, 82 + y, 1, 7);
        g2d.fillRect(122 + x, 82 + y, 1, 3);
        g2d.fillRect(98 + x, 84 + y, 1, 7);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 9);
        g2d.fillRect(123 + x, 84 + y, 1, 3);
        g2d.fillRect(102 + x, 85 + y, 1, 10);
        g2d.fillRect(104 + x, 85 + y, 1, 3);
        g2d.fillRect(97 + x, 86 + y, 1, 8);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 11);
        g2d.fillRect(124 + x, 86 + y, 1, 4);
        g2d.fillRect(125 + x, 87 + y, 1, 5);
        g2d.fillRect(96 + x, 88 + y, 1, 9);
        g2d.fillRect(101 + x, 89 + y, 1, 13);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 11);
        g2d.fillRect(126 + x, 89 + y, 1, 6);
        g2d.fillRect(95 + x, 90 + y, 1, 6);
        g2d.fillRect(103 + x, 90 + y, 1, 4);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(122 + x, 91 + y, 1, 7);
        g2d.fillRect(127 + x, 91 + y, 1, 3);
        g2d.fillRect(94 + x, 92 + y, 1, 3);
        g2d.fillRect(100 + x, 94 + y, 1, 7);
        g2d.fillRect(123 + x, 94 + y, 1, 2);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 7);
        g2d.fillRect(124 + x, 96 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(123 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 6);
        g2d.fillRect(105 + x, 61 + y, 1, 9);
        g2d.fillRect(106 + x, 61 + y, 1, 7);
        g2d.fillRect(107 + x, 63 + y, 1, 3);
        g2d.fillRect(113 + x, 63 + y, 1, 4);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 3);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 3);
        g2d.fillRect(103 + x, 71 + y, 1, 3);
        g2d.fillRect(105 + x, 72 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 3);
        g2d.fillRect(114 + x, 74 + y, 1, 2);
        g2d.fillRect(101 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 75 + y, 1, 3);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 75 + y, 1, 4);
        g2d.fillRect(100 + x, 77 + y, 1, 3);
        g2d.fillRect(103 + x, 77 + y, 1, 5);
        g2d.fillRect(115 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 4);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 79 + y, 1, 3);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 4);
        g2d.fillRect(122 + x, 80 + y, 1, 2);
        g2d.fillRect(98 + x, 81 + y, 1, 3);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 1, 3);
        g2d.fillRect(120 + x, 82 + y, 1, 4);
        g2d.fillRect(123 + x, 82 + y, 1, 2);
        g2d.fillRect(97 + x, 83 + y, 1, 3);
        g2d.fillRect(121 + x, 83 + y, 1, 6);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(124 + x, 84 + y, 1, 2);
        g2d.fillRect(96 + x, 85 + y, 1, 3);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(122 + x, 85 + y, 1, 6);
        g2d.fillRect(101 + x, 86 + y, 1, 3);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(125 + x, 86 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 1, 3);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(123 + x, 87 + y, 1, 7);
        g2d.fillRect(126 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 89 + y, 1, 3);
        g2d.fillRect(100 + x, 89 + y, 1, 5);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 2);
        g2d.fillRect(124 + x, 90 + y, 1, 6);
        g2d.fillRect(127 + x, 90 + y, 1, 1);
        g2d.fillRect(93 + x, 91 + y, 1, 3);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 91 + y, 1, 3);
        g2d.fillRect(92 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 7);
        g2d.fillRect(125 + x, 92 + y, 1, 4);
        g2d.fillRect(128 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(97 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 3);
        g2d.fillRect(118 + x, 96 + y, 1, 7);
        g2d.fillRect(123 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 2);
        g2d.fillRect(122 + x, 98 + y, 1, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 69 + y, 1, 3);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 5);
        g2d.fillRect(128 + x, 93 + y, 1, 1);
        g2d.fillRect(127 + x, 94 + y, 1, 1);
        g2d.fillRect(126 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
        g2d.fillRect(96 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 100 + y, 1, 1);
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 2);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 62 + y, 1, 3);
        g2d.fillRect(104 + x, 66 + y, 1, 3);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 74 + y, 1, 1);
        g2d.fillRect(100 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(99 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 3);
        g2d.fillRect(97 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 3);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(96 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(95 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 3);
        g2d.fillRect(93 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 4);
        g2d.fillRect(98 + x, 92 + y, 1, 4);
        g2d.fillRect(119 + x, 95 + y, 1, 4);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(120 + x, 99 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 3);
        g2d.fillRect(108 + x, 63 + y, 1, 13);
        g2d.fillRect(112 + x, 63 + y, 1, 6);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 5);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 3);
        g2d.fillRect(106 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 1, 4);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 5);
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(94 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(125 + x, 96 + y, 1, 1);
        g2d.fillRect(124 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 5);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(121 + x, 100 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 3);
        g2d.fillRect(114 + x, 82 + y, 1, 5);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 87 + y, 1, 6);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(92 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(93 + x, 94 + y, 1, 1);
        g2d.fillRect(123 + x, 98 + y, 1, 1);
        g2d.fillRect(122 + x, 99 + y, 1, 1);
    }

    public void paintTU(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 3);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 3);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 4, 1);
        g2d.fillRect(116 + x, 59 + y, 3, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 49 + y, 1, 3);
        g2d.fillRect(100 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 2, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 3);
        g2d.fillRect(105 + x, 56 + y, 1, 5);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 4, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 3, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 3);
        g2d.fillRect(114 + x, 58 + y, 1, 3);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 5);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 6);
        g2d.fillRect(101 + x, 52 + y, 1, 5);
        g2d.fillRect(118 + x, 52 + y, 1, 4);
        g2d.fillRect(119 + x, 52 + y, 1, 3);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 2, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 4);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 53 + y, 1, 2);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 3);
        g2d.fillRect(113 + x, 58 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(20, 22, 21));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(36, 41, 38));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(61, 64, 62));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(184, 30, 0));
        COLORS.set(ImageUtilities.GREY, new Color(201, 39, 7));
        COLORS.set(ImageUtilities.GREY_1, new Color(98, 101, 99));
        COLORS.set(ImageUtilities.GREY_2, new Color(225, 54, 20));
        COLORS.set(ImageUtilities.GREY_3, new Color(252, 64, 26));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
