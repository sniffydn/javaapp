/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.a;

import b.Bd;
import clts.*;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Guitar0 extends SuperTL {

    int leftA = 0;
    int rightA = 0;

    public Guitar0() {
        super();
    }

    public Guitar0(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = true;

    public void drawSleevesRight5(int x, int y, GraphicsMap g2d) {
    }

    public void drawSleevesLeft6(int x, int y, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintGuitarBod(offsetX, 0, g2d);
        paintGuitar(offsetX, 0, g2d);
    }

    public void drawBody(Bd bd) {
        b = bd;
    }
    Bd b = new b.Bd();

    public void paintGuitar(int x, int y, GraphicsMap g2d) {
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 43 + y, 2, 1);
        g2d.fillRect(120 + x, 44 + y, 4, 1);
        g2d.fillRect(121 + x, 45 + y, 6, 1);
        g2d.fillRect(124 + x, 46 + y, 6, 1);
        g2d.fillRect(127 + x, 47 + y, 6, 1);
        g2d.fillRect(150 + x, 47 + y, 1, 2);
        g2d.fillRect(152 + x, 47 + y, 1, 1);
        g2d.fillRect(154 + x, 47 + y, 1, 1);
        g2d.fillRect(130 + x, 48 + y, 6, 1);
        g2d.fillRect(146 + x, 48 + y, 1, 2);
        g2d.fillRect(148 + x, 48 + y, 1, 2);
        g2d.fillRect(151 + x, 48 + y, 1, 5);
        g2d.fillRect(153 + x, 48 + y, 1, 4);
        g2d.fillRect(155 + x, 48 + y, 1, 2);
        g2d.fillRect(133 + x, 49 + y, 6, 1);
        g2d.fillRect(141 + x, 49 + y, 1, 3);
        g2d.fillRect(144 + x, 49 + y, 1, 3);
        g2d.fillRect(147 + x, 49 + y, 1, 6);
        g2d.fillRect(149 + x, 49 + y, 1, 5);
        g2d.fillRect(152 + x, 49 + y, 1, 4);
        g2d.fillRect(154 + x, 49 + y, 1, 2);
        g2d.fillRect(136 + x, 50 + y, 5, 1);
        g2d.fillRect(142 + x, 50 + y, 2, 1);
        g2d.fillRect(145 + x, 50 + y, 1, 3);
        g2d.fillRect(150 + x, 50 + y, 1, 4);
        g2d.fillRect(139 + x, 51 + y, 2, 1);
        g2d.fillRect(146 + x, 51 + y, 1, 4);
        g2d.fillRect(148 + x, 51 + y, 1, 4);
        g2d.fillRect(139 + x, 54 + y, 1, 1);
        g2d.fillRect(137 + x, 55 + y, 2, 1);
        g2d.fillRect(135 + x, 56 + y, 2, 1);
        g2d.fillRect(133 + x, 57 + y, 2, 1);
        g2d.fillRect(140 + x, 57 + y, 1, 1);
        g2d.fillRect(132 + x, 58 + y, 1, 1);
        g2d.fillRect(138 + x, 58 + y, 2, 1);
        g2d.fillRect(130 + x, 59 + y, 2, 1);
        g2d.fillRect(137 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 4, 1);
        g2d.fillRect(128 + x, 60 + y, 2, 1);
        g2d.fillRect(135 + x, 60 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 2, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 2);
        g2d.fillRect(127 + x, 61 + y, 1, 1);
        g2d.fillRect(133 + x, 61 + y, 2, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(125 + x, 62 + y, 2, 1);
        g2d.fillRect(132 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(118 + x, 63 + y, 1, 1);
        g2d.fillRect(123 + x, 63 + y, 2, 1);
        g2d.fillRect(130 + x, 63 + y, 2, 1);
        g2d.fillRect(94 + x, 64 + y, 1, 6);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 2, 1);
        g2d.fillRect(121 + x, 64 + y, 2, 1);
        g2d.fillRect(129 + x, 64 + y, 1, 1);
        g2d.fillRect(102 + x, 65 + y, 2, 1);
        g2d.fillRect(108 + x, 65 + y, 2, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 65 + y, 1, 1);
        g2d.fillRect(127 + x, 65 + y, 2, 1);
        g2d.fillRect(105 + x, 66 + y, 3, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(118 + x, 66 + y, 2, 1);
        g2d.fillRect(125 + x, 66 + y, 2, 1);
        g2d.fillRect(116 + x, 67 + y, 2, 1);
        g2d.fillRect(124 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(122 + x, 68 + y, 2, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 1);
        g2d.fillRect(121 + x, 69 + y, 1, 1);
        g2d.fillRect(93 + x, 70 + y, 1, 7);
        g2d.fillRect(95 + x, 70 + y, 1, 2);
        g2d.fillRect(119 + x, 70 + y, 2, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 71 + y, 2, 1);
        g2d.fillRect(94 + x, 72 + y, 1, 7);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(121 + x, 73 + y, 2, 1);
        g2d.fillRect(118 + x, 74 + y, 3, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 2);
        g2d.fillRect(122 + x, 76 + y, 1, 1);
        g2d.fillRect(121 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 2, 1);
        g2d.fillRect(95 + x, 79 + y, 1, 2);
        g2d.fillRect(116 + x, 79 + y, 3, 1);
        g2d.fillRect(112 + x, 80 + y, 4, 1);
        g2d.fillRect(96 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(97 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(98 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 2, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(8, 8, 8, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 66 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(24, 24, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 24, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(41, 33, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 33, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 64 + y, 1, 5);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 33, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(57, 41, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(57, 41, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 73 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 41, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 41, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 73 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 49, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 49, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 49, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 57, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 2, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 57, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 57, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 57, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(98 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 66, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 5);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(100 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 74, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 74, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165, 49, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 69 + y, 2, 1);
        g2d.fillRect(111 + x, 70 + y, 2, 1);
        g2d.fillRect(109 + x, 71 + y, 2, 1);
        g2d.fillRect(113 + x, 71 + y, 2, 1);
        g2d.fillRect(107 + x, 72 + y, 2, 1);
        g2d.fillRect(114 + x, 72 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 82, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 3);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(97 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132, 82, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(98 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165, 74, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(144 + x, 53 + y, 1, 1);
        g2d.fillRect(141 + x, 54 + y, 1, 1);
        g2d.fillRect(139 + x, 55 + y, 1, 3);
        g2d.fillRect(140 + x, 55 + y, 1, 2);
        g2d.fillRect(138 + x, 56 + y, 1, 1);
        g2d.fillRect(135 + x, 57 + y, 1, 2);
        g2d.fillRect(136 + x, 57 + y, 1, 3);
        g2d.fillRect(137 + x, 57 + y, 1, 2);
        g2d.fillRect(133 + x, 58 + y, 1, 3);
        g2d.fillRect(132 + x, 59 + y, 1, 2);
        g2d.fillRect(134 + x, 59 + y, 1, 2);
        g2d.fillRect(130 + x, 60 + y, 1, 3);
        g2d.fillRect(128 + x, 61 + y, 2, 1);
        g2d.fillRect(131 + x, 61 + y, 1, 2);
        g2d.fillRect(127 + x, 62 + y, 1, 3);
        g2d.fillRect(129 + x, 62 + y, 1, 1);
        g2d.fillRect(125 + x, 63 + y, 2, 1);
        g2d.fillRect(128 + x, 63 + y, 1, 2);
        g2d.fillRect(123 + x, 64 + y, 1, 3);
        g2d.fillRect(124 + x, 64 + y, 1, 3);
        g2d.fillRect(126 + x, 64 + y, 1, 1);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(125 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 66 + y, 1, 3);
        g2d.fillRect(121 + x, 66 + y, 1, 3);
        g2d.fillRect(119 + x, 67 + y, 1, 1);
        g2d.fillRect(122 + x, 67 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 3, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(117 + x, 69 + y, 3, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 90, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148, 90, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148, 99, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(100 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(156, 99, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165, 107, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173, 107, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173, 115, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(97 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181, 115, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 123, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 123, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 72 + y, 1, 1);
        g2d.fillRect(119 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 115, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 77 + y, 1, 1);
        g2d.fillRect(98 + x, 78 + y, 1, 2);
        g2d.fillRect(99 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 115, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 76 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 132, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(95 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 132, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 1);
        g2d.fillRect(100 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 140, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214, 132, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214, 140, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(95 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(104 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 156, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(140 + x, 54 + y, 1, 1);
        g2d.fillRect(137 + x, 56 + y, 1, 1);
        g2d.fillRect(138 + x, 57 + y, 1, 1);
        g2d.fillRect(134 + x, 58 + y, 1, 1);
        g2d.fillRect(135 + x, 59 + y, 1, 1);
        g2d.fillRect(131 + x, 60 + y, 1, 1);
        g2d.fillRect(132 + x, 61 + y, 1, 1);
        g2d.fillRect(128 + x, 62 + y, 1, 1);
        g2d.fillRect(129 + x, 63 + y, 1, 1);
        g2d.fillRect(125 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 65 + y, 1, 1);
        g2d.fillRect(126 + x, 65 + y, 1, 1);
        g2d.fillRect(122 + x, 66 + y, 1, 1);
        g2d.fillRect(118 + x, 67 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 1);
        g2d.fillRect(119 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 69 + y, 1, 1);
        g2d.fillRect(120 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 140, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 140, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(95 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132, 132, 132, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 70 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 148, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 148, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 66 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 148, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(97 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 156, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 66 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 123, 82, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(140 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 148, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(96 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(120 + x, 75 + y, 1, 1);
        g2d.fillRect(95 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 156, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 156, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 156, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 61 + y, 1, 1);
        g2d.fillRect(97 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(96 + x, 73 + y, 1, 1);
        g2d.fillRect(120 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 156, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(95 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 165, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 63 + y, 1, 1);
        g2d.fillRect(100 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 165, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 70 + y, 1, 1);
        g2d.fillRect(96 + x, 74 + y, 1, 2);
        g2d.fillRect(121 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 173, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(96 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 165, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 173, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 71 + y, 1, 1);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 181, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 74 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 173, 57, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 181, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 68 + y, 1, 1);
        g2d.fillRect(97 + x, 72 + y, 1, 2);
        g2d.fillRect(96 + x, 77 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 189, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 72 + y, 1, 1);
        g2d.fillRect(99 + x, 75 + y, 1, 1);
        g2d.fillRect(96 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 189, 49, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 72 + y, 1, 3);
        g2d.fillRect(99 + x, 73 + y, 1, 2);
        g2d.fillRect(97 + x, 74 + y, 1, 3);
        g2d.fillRect(96 + x, 79 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165, 165, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 189, 57, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 71 + y, 1, 1);
        g2d.fillRect(98 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 189, 74, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 181, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(152 + x, 48 + y, 1, 1);
        g2d.fillRect(154 + x, 48 + y, 1, 1);
        g2d.fillRect(150 + x, 49 + y, 1, 1);
        g2d.fillRect(146 + x, 50 + y, 1, 1);
        g2d.fillRect(148 + x, 50 + y, 1, 1);
        g2d.fillRect(142 + x, 51 + y, 2, 1);
        g2d.fillRect(144 + x, 52 + y, 1, 1);
        g2d.fillRect(145 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 198, 189, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(99 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 74 + y, 1, 4);
        g2d.fillRect(113 + x, 75 + y, 1, 3);
        g2d.fillRect(115 + x, 75 + y, 1, 3);
        g2d.fillRect(110 + x, 76 + y, 1, 3);
        g2d.fillRect(111 + x, 76 + y, 1, 3);
        g2d.fillRect(112 + x, 76 + y, 1, 3);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(98 + x, 77 + y, 2, 1);
        g2d.fillRect(100 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
    }

    public void paintGuitarBod(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(96 + x, 41 + y, 2, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 16);
        g2d.fillRect(98 + x, 58 + y, 1, 3);
        g2d.fillRect(94 + x, 61 + y, 1, 3);
        g2d.fillRect(99 + x, 61 + y, 1, 3);
        g2d.fillRect(95 + x, 64 + y, 1, 1);
        g2d.fillRect(100 + x, 64 + y, 1, 2);
        g2d.fillRect(96 + x, 65 + y, 1, 2);
        g2d.fillRect(97 + x, 67 + y, 1, 1);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(122 + x, 47 + y, 1, 1);
        g2d.fillRect(123 + x, 48 + y, 1, 2);
        g2d.fillRect(124 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(125 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(126 + x, 52 + y, 1, 1);
        g2d.fillRect(142 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(127 + x, 53 + y, 1, 2);
        g2d.fillRect(140 + x, 53 + y, 2, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(145 + x, 54 + y, 1, 3);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(128 + x, 55 + y, 1, 1);
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(129 + x, 56 + y, 1, 1);
        g2d.fillRect(123 + x, 57 + y, 1, 1);
        g2d.fillRect(130 + x, 57 + y, 1, 1);
        g2d.fillRect(144 + x, 57 + y, 1, 1);
        g2d.fillRect(124 + x, 58 + y, 1, 1);
        g2d.fillRect(131 + x, 58 + y, 1, 1);
        g2d.fillRect(142 + x, 58 + y, 2, 1);
        g2d.fillRect(125 + x, 59 + y, 1, 1);
        g2d.fillRect(140 + x, 59 + y, 2, 1);
        g2d.fillRect(126 + x, 60 + y, 1, 1);
        g2d.fillRect(139 + x, 60 + y, 1, 1);
        g2d.fillRect(138 + x, 61 + y, 1, 1);
        g2d.fillRect(137 + x, 62 + y, 1, 1);
        g2d.fillRect(136 + x, 63 + y, 1, 1);
        g2d.fillRect(134 + x, 64 + y, 2, 1);
        g2d.fillRect(130 + x, 65 + y, 1, 1);
        g2d.fillRect(133 + x, 65 + y, 1, 1);
        g2d.fillRect(101 + x, 66 + y, 1, 2);
        g2d.fillRect(131 + x, 66 + y, 2, 1);
        g2d.fillRect(97 + x, 68 + y, 1, 1);
        g2d.fillRect(102 + x, 68 + y, 1, 2);
        g2d.fillRect(98 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 2);
        g2d.fillRect(99 + x, 71 + y, 1, 1);
        g2d.fillRect(100 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 72 + y, 1, 2);
        g2d.fillRect(101 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 74 + y, 3, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 3);
        g2d.fillRect(109 + x, 76 + y, 1, 4);
        g2d.fillRect(103 + x, 79 + y, 2, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(98 + x, 41 + y, 2, 1);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 16);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 7);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(142 + x, 53 + y, 1, 3);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(144 + x, 54 + y, 1, 3);
        g2d.fillRect(122 + x, 55 + y, 1, 1);
        g2d.fillRect(123 + x, 56 + y, 1, 1);
        g2d.fillRect(124 + x, 57 + y, 1, 1);
        g2d.fillRect(142 + x, 57 + y, 2, 1);
        g2d.fillRect(125 + x, 58 + y, 1, 1);
        g2d.fillRect(141 + x, 58 + y, 1, 1);
        g2d.fillRect(126 + x, 59 + y, 1, 1);
        g2d.fillRect(139 + x, 59 + y, 1, 1);
        g2d.fillRect(127 + x, 60 + y, 1, 1);
        g2d.fillRect(138 + x, 60 + y, 1, 1);
        g2d.fillRect(98 + x, 61 + y, 1, 1);
        g2d.fillRect(137 + x, 61 + y, 1, 1);
        g2d.fillRect(136 + x, 62 + y, 1, 1);
        g2d.fillRect(95 + x, 63 + y, 1, 1);
        g2d.fillRect(134 + x, 63 + y, 2, 1);
        g2d.fillRect(96 + x, 64 + y, 1, 1);
        g2d.fillRect(99 + x, 64 + y, 1, 1);
        g2d.fillRect(130 + x, 64 + y, 1, 1);
        g2d.fillRect(133 + x, 64 + y, 1, 1);
        g2d.fillRect(131 + x, 65 + y, 2, 1);
        g2d.fillRect(97 + x, 66 + y, 1, 1);
        g2d.fillRect(98 + x, 67 + y, 1, 2);
        g2d.fillRect(99 + x, 69 + y, 1, 2);
        g2d.fillRect(100 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 72 + y, 1, 2);
        g2d.fillRect(102 + x, 74 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 2);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(104 + x, 78 + y, 1, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(97 + x, 42 + y, 1, 24);
        g2d.fillRect(98 + x, 42 + y, 1, 9);
        g2d.fillRect(99 + x, 42 + y, 1, 8);
        g2d.fillRect(96 + x, 43 + y, 1, 21);
        g2d.fillRect(95 + x, 44 + y, 1, 19);
        g2d.fillRect(98 + x, 62 + y, 1, 5);
        g2d.fillRect(99 + x, 65 + y, 1, 2);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(117 + x, 43 + y, 1, 7);
        g2d.fillRect(118 + x, 44 + y, 1, 7);
        g2d.fillRect(119 + x, 45 + y, 1, 7);
        g2d.fillRect(120 + x, 46 + y, 1, 7);
        g2d.fillRect(121 + x, 47 + y, 1, 7);
        g2d.fillRect(122 + x, 48 + y, 1, 7);
        g2d.fillRect(123 + x, 50 + y, 1, 6);
        g2d.fillRect(124 + x, 51 + y, 1, 6);
        g2d.fillRect(125 + x, 52 + y, 1, 6);
        g2d.fillRect(126 + x, 53 + y, 1, 6);
        g2d.fillRect(143 + x, 53 + y, 1, 4);
        g2d.fillRect(127 + x, 55 + y, 1, 5);
        g2d.fillRect(141 + x, 55 + y, 1, 3);
        g2d.fillRect(128 + x, 56 + y, 1, 4);
        g2d.fillRect(142 + x, 56 + y, 1, 1);
        g2d.fillRect(129 + x, 57 + y, 1, 3);
        g2d.fillRect(130 + x, 58 + y, 1, 1);
        g2d.fillRect(138 + x, 59 + y, 1, 1);
        g2d.fillRect(137 + x, 60 + y, 1, 1);
        g2d.fillRect(135 + x, 61 + y, 1, 2);
        g2d.fillRect(136 + x, 61 + y, 1, 1);
        g2d.fillRect(133 + x, 62 + y, 1, 2);
        g2d.fillRect(134 + x, 62 + y, 1, 1);
        g2d.fillRect(132 + x, 63 + y, 1, 2);
        g2d.fillRect(131 + x, 64 + y, 1, 1);
        g2d.fillRect(100 + x, 66 + y, 1, 5);
        g2d.fillRect(99 + x, 67 + y, 1, 2);
        g2d.fillRect(101 + x, 68 + y, 1, 4);
        g2d.fillRect(102 + x, 70 + y, 1, 4);
        g2d.fillRect(103 + x, 72 + y, 1, 4);
        g2d.fillRect(104 + x, 74 + y, 1, 4);
        g2d.fillRect(105 + x, 75 + y, 1, 5);
        g2d.fillRect(106 + x, 75 + y, 2, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 78 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 1, 2);
    }
}
