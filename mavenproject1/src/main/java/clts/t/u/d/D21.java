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
public class D21 extends SuperTU {

    int prevStep = 0;
    int prevY = 0;

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = true;

    public D21() {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public D21(String middle) {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public D21(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
    }

    public void drawB(int x, int y, GraphicsMap g2d) {
    }

    public void drawC(int x, int y, GraphicsMap g2d) {
    }

    public void drawD(int x, int y, GraphicsMap g2d) {
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        paint6TL(x, 0, g2d);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        paint6TB(offsetX, prevY, g2d);
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
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paint6TU(offsetX, offsetY, g2d);
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paint6TL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 101, 113, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 108, 144, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 68 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(111, 108, 145, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 63 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 67 + y, 1, 4);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 6);
        g2d.fillRect(102 + x, 81 + y, 1, 5);
        g2d.fillRect(101 + x, 86 + y, 1, 11);
        g2d.fillRect(102 + x, 97 + y, 1, 5);
        g2d.fillRect(103 + x, 106 + y, 1, 4);
        g2d.fillRect(104 + x, 110 + y, 1, 3);
        g2d.fillRect(105 + x, 118 + y, 1, 3);
        g2d.fillRect(104 + x, 123 + y, 1, 4);
        g2d.fillRect(103 + x, 127 + y, 1, 2);
        g2d.fillRect(119 + x, 127 + y, 1, 3);
        g2d.fillRect(101 + x, 130 + y, 1, 2);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(121 + x, 132 + y, 1, 4);
        g2d.fillRect(100 + x, 133 + y, 1, 1);
        g2d.fillRect(99 + x, 134 + y, 1, 2);
        g2d.fillRect(122 + x, 134 + y, 1, 1);
        g2d.fillRect(122 + x, 136 + y, 2, 1);
        g2d.fillRect(98 + x, 137 + y, 1, 1);
        g2d.fillRect(124 + x, 137 + y, 1, 1);
        g2d.fillRect(97 + x, 138 + y, 1, 1);
        g2d.fillRect(123 + x, 138 + y, 1, 1);
        g2d.fillRect(124 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 141 + y, 1, 1);
        g2d.fillRect(116 + x, 142 + y, 1, 3);
        g2d.fillRect(125 + x, 142 + y, 1, 1);
        g2d.fillRect(95 + x, 143 + y, 2, 1);
        g2d.fillRect(126 + x, 143 + y, 1, 2);
        g2d.fillRect(129 + x, 143 + y, 1, 1);
        g2d.fillRect(94 + x, 144 + y, 1, 1);
        g2d.fillRect(95 + x, 145 + y, 1, 2);
        g2d.fillRect(117 + x, 145 + y, 1, 2);
        g2d.fillRect(131 + x, 145 + y, 1, 1);
        g2d.fillRect(93 + x, 146 + y, 1, 1);
        g2d.fillRect(127 + x, 146 + y, 1, 1);
        g2d.fillRect(92 + x, 147 + y, 1, 1);
        g2d.fillRect(133 + x, 147 + y, 1, 1);
        g2d.fillRect(90 + x, 148 + y, 1, 1);
        g2d.fillRect(93 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 148 + y, 1, 2);
        g2d.fillRect(129 + x, 148 + y, 1, 1);
        g2d.fillRect(92 + x, 149 + y, 1, 1);
        g2d.fillRect(136 + x, 149 + y, 1, 1);
        g2d.fillRect(88 + x, 150 + y, 1, 1);
        g2d.fillRect(123 + x, 150 + y, 1, 1);
        g2d.fillRect(131 + x, 150 + y, 1, 1);
        g2d.fillRect(91 + x, 151 + y, 1, 1);
        g2d.fillRect(124 + x, 151 + y, 1, 1);
        g2d.fillRect(132 + x, 151 + y, 1, 1);
        g2d.fillRect(137 + x, 151 + y, 1, 1);
        g2d.fillRect(87 + x, 152 + y, 1, 1);
        g2d.fillRect(90 + x, 152 + y, 1, 1);
        g2d.fillRect(134 + x, 152 + y, 2, 1);
        g2d.fillRect(139 + x, 152 + y, 2, 1);
        g2d.fillRect(125 + x, 153 + y, 1, 1);
        g2d.fillRect(85 + x, 154 + y, 1, 1);
        g2d.fillRect(89 + x, 154 + y, 1, 1);
        g2d.fillRect(119 + x, 154 + y, 1, 1);
        g2d.fillRect(126 + x, 154 + y, 1, 1);
        g2d.fillRect(143 + x, 154 + y, 1, 1);
        g2d.fillRect(88 + x, 155 + y, 1, 1);
        g2d.fillRect(120 + x, 155 + y, 1, 1);
        g2d.fillRect(144 + x, 155 + y, 1, 1);
        g2d.fillRect(82 + x, 156 + y, 1, 1);
        g2d.fillRect(138 + x, 156 + y, 1, 1);
        g2d.fillRect(146 + x, 156 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 1);
        g2d.fillRect(128 + x, 157 + y, 1, 2);
        g2d.fillRect(140 + x, 157 + y, 1, 1);
        g2d.fillRect(151 + x, 157 + y, 1, 1);
        g2d.fillRect(79 + x, 158 + y, 1, 2);
        g2d.fillRect(86 + x, 158 + y, 1, 1);
        g2d.fillRect(143 + x, 158 + y, 1, 1);
        g2d.fillRect(154 + x, 158 + y, 1, 1);
        g2d.fillRect(77 + x, 159 + y, 1, 4);
        g2d.fillRect(123 + x, 159 + y, 1, 2);
        g2d.fillRect(129 + x, 159 + y, 1, 1);
        g2d.fillRect(142 + x, 159 + y, 1, 1);
        g2d.fillRect(159 + x, 159 + y, 1, 2);
        g2d.fillRect(80 + x, 160 + y, 1, 4);
        g2d.fillRect(84 + x, 160 + y, 1, 1);
        g2d.fillRect(145 + x, 160 + y, 1, 1);
        g2d.fillRect(124 + x, 161 + y, 1, 1);
        g2d.fillRect(143 + x, 161 + y, 1, 3);
        g2d.fillRect(158 + x, 161 + y, 1, 2);
        g2d.fillRect(82 + x, 162 + y, 1, 1);
        g2d.fillRect(130 + x, 162 + y, 1, 2);
        g2d.fillRect(146 + x, 162 + y, 1, 1);
        g2d.fillRect(157 + x, 162 + y, 1, 3);
        g2d.fillRect(125 + x, 163 + y, 1, 2);
        g2d.fillRect(142 + x, 163 + y, 1, 1);
        g2d.fillRect(144 + x, 163 + y, 1, 4);
        g2d.fillRect(155 + x, 163 + y, 1, 1);
        g2d.fillRect(78 + x, 164 + y, 1, 1);
        g2d.fillRect(131 + x, 164 + y, 1, 2);
        g2d.fillRect(141 + x, 164 + y, 1, 1);
        g2d.fillRect(148 + x, 164 + y, 1, 1);
        g2d.fillRect(154 + x, 164 + y, 1, 1);
        g2d.fillRect(81 + x, 165 + y, 1, 1);
        g2d.fillRect(121 + x, 165 + y, 2, 1);
        g2d.fillRect(126 + x, 165 + y, 1, 1);
        g2d.fillRect(140 + x, 165 + y, 1, 1);
        g2d.fillRect(153 + x, 165 + y, 1, 1);
        g2d.fillRect(84 + x, 166 + y, 3, 1);
        g2d.fillRect(90 + x, 166 + y, 2, 1);
        g2d.fillRect(125 + x, 166 + y, 1, 2);
        g2d.fillRect(139 + x, 166 + y, 1, 1);
        g2d.fillRect(145 + x, 166 + y, 1, 2);
        g2d.fillRect(147 + x, 166 + y, 1, 1);
        g2d.fillRect(152 + x, 166 + y, 1, 3);
        g2d.fillRect(155 + x, 166 + y, 1, 1);
        g2d.fillRect(87 + x, 167 + y, 1, 1);
        g2d.fillRect(92 + x, 167 + y, 1, 2);
        g2d.fillRect(93 + x, 167 + y, 1, 2);
        g2d.fillRect(118 + x, 167 + y, 1, 2);
        g2d.fillRect(122 + x, 167 + y, 3, 1);
        g2d.fillRect(126 + x, 167 + y, 6, 1);
        g2d.fillRect(137 + x, 167 + y, 2, 1);
        g2d.fillRect(148 + x, 167 + y, 1, 2);
        g2d.fillRect(149 + x, 167 + y, 1, 2);
        g2d.fillRect(94 + x, 168 + y, 3, 1);
        g2d.fillRect(114 + x, 168 + y, 4, 1);
        g2d.fillRect(119 + x, 168 + y, 3, 1);
        g2d.fillRect(132 + x, 168 + y, 5, 1);
        g2d.fillRect(150 + x, 168 + y, 2, 1);
        g2d.fillRect(97 + x, 169 + y, 17, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(121, 121, 145, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(156 + x, 163 + y, 1, 3);
        g2d.fillRect(79 + x, 164 + y, 1, 2);
        g2d.fillRect(142 + x, 164 + y, 1, 2);
        g2d.fillRect(155 + x, 164 + y, 1, 2);
        g2d.fillRect(80 + x, 165 + y, 1, 1);
        g2d.fillRect(83 + x, 165 + y, 3, 1);
        g2d.fillRect(123 + x, 165 + y, 2, 1);
        g2d.fillRect(141 + x, 165 + y, 1, 1);
        g2d.fillRect(154 + x, 165 + y, 1, 3);
        g2d.fillRect(87 + x, 166 + y, 2, 1);
        g2d.fillRect(119 + x, 166 + y, 1, 2);
        g2d.fillRect(120 + x, 166 + y, 2, 1);
        g2d.fillRect(153 + x, 166 + y, 1, 2);
        g2d.fillRect(88 + x, 167 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44, 130, 248, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 150 + y, 1, 1);
        g2d.fillRect(95 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 1);
        g2d.fillRect(115 + x, 155 + y, 1, 1);
        g2d.fillRect(82 + x, 158 + y, 1, 1);
        g2d.fillRect(117 + x, 158 + y, 1, 1);
        g2d.fillRect(133 + x, 158 + y, 1, 1);
        g2d.fillRect(153 + x, 158 + y, 1, 1);
        g2d.fillRect(126 + x, 159 + y, 1, 1);
        g2d.fillRect(121 + x, 161 + y, 1, 1);
        g2d.fillRect(139 + x, 161 + y, 1, 1);
        g2d.fillRect(92 + x, 163 + y, 2, 1);
        g2d.fillRect(103 + x, 163 + y, 2, 1);
        g2d.fillRect(128 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(139, 134, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 138, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(144, 138, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 66 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 140, 186, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(119 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 1, 4);
        g2d.fillRect(118 + x, 68 + y, 2, 1);
        g2d.fillRect(119 + x, 69 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 8);
        g2d.fillRect(104 + x, 76 + y, 1, 5);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 7);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 23);
        g2d.fillRect(112 + x, 83 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 1, 11);
        g2d.fillRect(110 + x, 86 + y, 1, 30);
        g2d.fillRect(111 + x, 86 + y, 1, 3);
        g2d.fillRect(103 + x, 88 + y, 1, 3);
        g2d.fillRect(109 + x, 91 + y, 1, 22);
        g2d.fillRect(103 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 96 + y, 1, 10);
        g2d.fillRect(108 + x, 96 + y, 1, 15);
        g2d.fillRect(111 + x, 96 + y, 1, 9);
        g2d.fillRect(104 + x, 98 + y, 1, 3);
        g2d.fillRect(104 + x, 102 + y, 1, 8);
        g2d.fillRect(106 + x, 102 + y, 1, 1);
        g2d.fillRect(105 + x, 103 + y, 1, 3);
        g2d.fillRect(107 + x, 103 + y, 1, 15);
        g2d.fillRect(120 + x, 105 + y, 1, 6);
        g2d.fillRect(106 + x, 106 + y, 1, 19);
        g2d.fillRect(105 + x, 107 + y, 1, 11);
        g2d.fillRect(119 + x, 111 + y, 1, 6);
        g2d.fillRect(105 + x, 128 + y, 1, 7);
        g2d.fillRect(114 + x, 130 + y, 1, 8);
        g2d.fillRect(119 + x, 130 + y, 1, 3);
        g2d.fillRect(120 + x, 131 + y, 1, 4);
        g2d.fillRect(115 + x, 136 + y, 1, 7);
        g2d.fillRect(121 + x, 136 + y, 1, 2);
        g2d.fillRect(122 + x, 137 + y, 1, 2);
        g2d.fillRect(104 + x, 139 + y, 1, 5);
        g2d.fillRect(123 + x, 139 + y, 1, 2);
        g2d.fillRect(124 + x, 140 + y, 1, 2);
        g2d.fillRect(119 + x, 143 + y, 1, 2);
        g2d.fillRect(116 + x, 145 + y, 1, 3);
        g2d.fillRect(120 + x, 145 + y, 1, 1);
        g2d.fillRect(117 + x, 147 + y, 1, 3);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(122 + x, 148 + y, 1, 2);
        g2d.fillRect(118 + x, 150 + y, 1, 4);
        g2d.fillRect(123 + x, 151 + y, 1, 1);
        g2d.fillRect(124 + x, 152 + y, 1, 2);
        g2d.fillRect(102 + x, 153 + y, 1, 5);
        g2d.fillRect(125 + x, 154 + y, 1, 2);
        g2d.fillRect(119 + x, 155 + y, 1, 3);
        g2d.fillRect(126 + x, 155 + y, 1, 2);
        g2d.fillRect(139 + x, 155 + y, 1, 1);
        g2d.fillRect(101 + x, 156 + y, 1, 10);
        g2d.fillRect(120 + x, 156 + y, 1, 3);
        g2d.fillRect(127 + x, 156 + y, 1, 3);
        g2d.fillRect(121 + x, 157 + y, 1, 3);
        g2d.fillRect(131 + x, 157 + y, 1, 1);
        g2d.fillRect(143 + x, 157 + y, 1, 1);
        g2d.fillRect(122 + x, 158 + y, 1, 3);
        g2d.fillRect(141 + x, 158 + y, 1, 1);
        g2d.fillRect(144 + x, 158 + y, 1, 1);
        g2d.fillRect(100 + x, 159 + y, 1, 10);
        g2d.fillRect(128 + x, 159 + y, 1, 4);
        g2d.fillRect(132 + x, 159 + y, 1, 2);
        g2d.fillRect(145 + x, 159 + y, 1, 1);
        g2d.fillRect(78 + x, 160 + y, 1, 4);
        g2d.fillRect(129 + x, 160 + y, 1, 5);
        g2d.fillRect(133 + x, 160 + y, 1, 2);
        g2d.fillRect(143 + x, 160 + y, 1, 1);
        g2d.fillRect(99 + x, 161 + y, 1, 8);
        g2d.fillRect(123 + x, 161 + y, 1, 4);
        g2d.fillRect(144 + x, 161 + y, 1, 2);
        g2d.fillRect(146 + x, 161 + y, 2, 1);
        g2d.fillRect(122 + x, 162 + y, 1, 1);
        g2d.fillRect(124 + x, 162 + y, 1, 3);
        g2d.fillRect(131 + x, 162 + y, 1, 2);
        g2d.fillRect(147 + x, 162 + y, 2, 1);
        g2d.fillRect(79 + x, 163 + y, 1, 1);
        g2d.fillRect(98 + x, 163 + y, 1, 6);
        g2d.fillRect(102 + x, 163 + y, 1, 3);
        g2d.fillRect(127 + x, 163 + y, 1, 3);
        g2d.fillRect(134 + x, 163 + y, 1, 2);
        g2d.fillRect(145 + x, 163 + y, 1, 3);
        g2d.fillRect(148 + x, 163 + y, 2, 1);
        g2d.fillRect(80 + x, 164 + y, 1, 1);
        g2d.fillRect(83 + x, 164 + y, 2, 1);
        g2d.fillRect(128 + x, 164 + y, 1, 1);
        g2d.fillRect(130 + x, 164 + y, 1, 3);
        g2d.fillRect(135 + x, 164 + y, 1, 4);
        g2d.fillRect(143 + x, 164 + y, 1, 2);
        g2d.fillRect(149 + x, 164 + y, 3, 1);
        g2d.fillRect(82 + x, 165 + y, 1, 1);
        g2d.fillRect(86 + x, 165 + y, 2, 1);
        g2d.fillRect(97 + x, 165 + y, 1, 4);
        g2d.fillRect(146 + x, 165 + y, 1, 3);
        g2d.fillRect(147 + x, 165 + y, 1, 1);
        g2d.fillRect(150 + x, 165 + y, 1, 3);
        g2d.fillRect(151 + x, 165 + y, 1, 3);
        g2d.fillRect(152 + x, 165 + y, 1, 1);
        g2d.fillRect(89 + x, 166 + y, 1, 1);
        g2d.fillRect(96 + x, 166 + y, 1, 2);
        g2d.fillRect(126 + x, 166 + y, 1, 1);
        g2d.fillRect(131 + x, 166 + y, 4, 1);
        g2d.fillRect(136 + x, 166 + y, 1, 2);
        g2d.fillRect(148 + x, 166 + y, 2, 1);
        g2d.fillRect(132 + x, 167 + y, 3, 1);
        g2d.fillRect(147 + x, 167 + y, 1, 1);
        g2d.fillRect(101 + x, 168 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157, 147, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(152, 152, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158, 158, 211, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(162, 162, 210, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(163, 163, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165, 165, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 168, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 43 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(166, 166, 212, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(122 + x, 53 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165, 165, 214, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170, 170, 206, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(116 + x, 65 + y, 1, 3);
        g2d.fillRect(117 + x, 65 + y, 1, 5);
        g2d.fillRect(118 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(118 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 6);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 3);
        g2d.fillRect(118 + x, 69 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(105 + x, 72 + y, 1, 11);
        g2d.fillRect(104 + x, 73 + y, 1, 3);
        g2d.fillRect(106 + x, 73 + y, 1, 5);
        g2d.fillRect(109 + x, 73 + y, 2, 1);
        g2d.fillRect(113 + x, 73 + y, 2, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 2);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(118 + x, 74 + y, 1, 4);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 4);
        g2d.fillRect(115 + x, 79 + y, 1, 2);
        g2d.fillRect(118 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 1, 6);
        g2d.fillRect(104 + x, 81 + y, 1, 17);
        g2d.fillRect(110 + x, 81 + y, 1, 5);
        g2d.fillRect(111 + x, 81 + y, 1, 5);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 82 + y, 1, 9);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 23);
        g2d.fillRect(108 + x, 83 + y, 1, 13);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 6);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 57);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 7);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 8);
        g2d.fillRect(105 + x, 96 + y, 1, 7);
        g2d.fillRect(113 + x, 96 + y, 1, 51);
        g2d.fillRect(106 + x, 97 + y, 1, 5);
        g2d.fillRect(114 + x, 99 + y, 1, 2);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 3);
        g2d.fillRect(111 + x, 105 + y, 1, 34);
        g2d.fillRect(119 + x, 105 + y, 1, 6);
        g2d.fillRect(105 + x, 106 + y, 1, 1);
        g2d.fillRect(108 + x, 111 + y, 1, 17);
        g2d.fillRect(109 + x, 113 + y, 1, 12);
        g2d.fillRect(110 + x, 116 + y, 1, 16);
        g2d.fillRect(119 + x, 117 + y, 1, 8);
        g2d.fillRect(107 + x, 118 + y, 1, 13);
        g2d.fillRect(105 + x, 121 + y, 1, 7);
        g2d.fillRect(118 + x, 124 + y, 1, 12);
        g2d.fillRect(106 + x, 125 + y, 1, 12);
        g2d.fillRect(104 + x, 131 + y, 1, 8);
        g2d.fillRect(119 + x, 133 + y, 1, 10);
        g2d.fillRect(105 + x, 135 + y, 1, 11);
        g2d.fillRect(120 + x, 135 + y, 1, 10);
        g2d.fillRect(122 + x, 135 + y, 1, 1);
        g2d.fillRect(103 + x, 136 + y, 1, 26);
        g2d.fillRect(123 + x, 137 + y, 1, 1);
        g2d.fillRect(114 + x, 138 + y, 1, 14);
        g2d.fillRect(121 + x, 138 + y, 1, 2);
        g2d.fillRect(124 + x, 138 + y, 1, 1);
        g2d.fillRect(122 + x, 139 + y, 1, 2);
        g2d.fillRect(125 + x, 140 + y, 1, 2);
        g2d.fillRect(123 + x, 141 + y, 1, 2);
        g2d.fillRect(126 + x, 141 + y, 1, 2);
        g2d.fillRect(102 + x, 142 + y, 1, 11);
        g2d.fillRect(124 + x, 142 + y, 1, 2);
        g2d.fillRect(115 + x, 143 + y, 1, 11);
        g2d.fillRect(125 + x, 143 + y, 1, 4);
        g2d.fillRect(127 + x, 143 + y, 1, 3);
        g2d.fillRect(104 + x, 144 + y, 1, 9);
        g2d.fillRect(101 + x, 145 + y, 1, 11);
        g2d.fillRect(119 + x, 145 + y, 1, 2);
        g2d.fillRect(121 + x, 145 + y, 1, 2);
        g2d.fillRect(126 + x, 145 + y, 1, 3);
        g2d.fillRect(120 + x, 146 + y, 1, 2);
        g2d.fillRect(128 + x, 146 + y, 1, 4);
        g2d.fillRect(122 + x, 147 + y, 1, 1);
        g2d.fillRect(127 + x, 147 + y, 1, 1);
        g2d.fillRect(129 + x, 147 + y, 1, 1);
        g2d.fillRect(100 + x, 148 + y, 1, 11);
        g2d.fillRect(116 + x, 148 + y, 1, 2);
        g2d.fillRect(121 + x, 148 + y, 1, 3);
        g2d.fillRect(130 + x, 148 + y, 1, 4);
        g2d.fillRect(131 + x, 148 + y, 1, 2);
        g2d.fillRect(129 + x, 149 + y, 1, 2);
        g2d.fillRect(132 + x, 149 + y, 1, 2);
        g2d.fillRect(133 + x, 149 + y, 1, 5);
        g2d.fillRect(99 + x, 150 + y, 1, 11);
        g2d.fillRect(122 + x, 150 + y, 1, 2);
        g2d.fillRect(134 + x, 150 + y, 1, 2);
        g2d.fillRect(135 + x, 150 + y, 1, 2);
        g2d.fillRect(116 + x, 151 + y, 1, 6);
        g2d.fillRect(117 + x, 151 + y, 1, 6);
        g2d.fillRect(131 + x, 151 + y, 1, 1);
        g2d.fillRect(98 + x, 152 + y, 1, 11);
        g2d.fillRect(123 + x, 152 + y, 1, 3);
        g2d.fillRect(132 + x, 152 + y, 1, 2);
        g2d.fillRect(136 + x, 152 + y, 1, 5);
        g2d.fillRect(89 + x, 153 + y, 1, 1);
        g2d.fillRect(134 + x, 153 + y, 1, 3);
        g2d.fillRect(135 + x, 153 + y, 1, 2);
        g2d.fillRect(137 + x, 153 + y, 1, 6);
        g2d.fillRect(88 + x, 154 + y, 1, 1);
        g2d.fillRect(118 + x, 154 + y, 1, 3);
        g2d.fillRect(124 + x, 154 + y, 1, 2);
        g2d.fillRect(128 + x, 154 + y, 1, 2);
        g2d.fillRect(138 + x, 154 + y, 1, 2);
        g2d.fillRect(139 + x, 154 + y, 1, 1);
        g2d.fillRect(97 + x, 155 + y, 1, 10);
        g2d.fillRect(140 + x, 155 + y, 1, 2);
        g2d.fillRect(87 + x, 156 + y, 1, 1);
        g2d.fillRect(125 + x, 156 + y, 1, 3);
        g2d.fillRect(129 + x, 156 + y, 3, 1);
        g2d.fillRect(139 + x, 156 + y, 1, 4);
        g2d.fillRect(141 + x, 156 + y, 1, 2);
        g2d.fillRect(142 + x, 156 + y, 1, 3);
        g2d.fillRect(78 + x, 157 + y, 1, 3);
        g2d.fillRect(85 + x, 157 + y, 1, 2);
        g2d.fillRect(86 + x, 157 + y, 1, 1);
        g2d.fillRect(126 + x, 157 + y, 1, 2);
        g2d.fillRect(130 + x, 157 + y, 1, 3);
        g2d.fillRect(138 + x, 157 + y, 1, 2);
        g2d.fillRect(144 + x, 157 + y, 2, 1);
        g2d.fillRect(149 + x, 157 + y, 2, 1);
        g2d.fillRect(96 + x, 158 + y, 1, 5);
        g2d.fillRect(102 + x, 158 + y, 1, 5);
        g2d.fillRect(119 + x, 158 + y, 1, 8);
        g2d.fillRect(131 + x, 158 + y, 1, 4);
        g2d.fillRect(140 + x, 158 + y, 1, 3);
        g2d.fillRect(145 + x, 158 + y, 1, 1);
        g2d.fillRect(150 + x, 158 + y, 2, 1);
        g2d.fillRect(83 + x, 159 + y, 1, 2);
        g2d.fillRect(84 + x, 159 + y, 1, 1);
        g2d.fillRect(104 + x, 159 + y, 1, 3);
        g2d.fillRect(118 + x, 159 + y, 1, 4);
        g2d.fillRect(120 + x, 159 + y, 1, 2);
        g2d.fillRect(127 + x, 159 + y, 1, 4);
        g2d.fillRect(133 + x, 159 + y, 3, 1);
        g2d.fillRect(141 + x, 159 + y, 1, 5);
        g2d.fillRect(143 + x, 159 + y, 2, 1);
        g2d.fillRect(146 + x, 159 + y, 1, 2);
        g2d.fillRect(154 + x, 159 + y, 5, 1);
        g2d.fillRect(79 + x, 160 + y, 1, 3);
        g2d.fillRect(95 + x, 160 + y, 1, 8);
        g2d.fillRect(126 + x, 160 + y, 1, 5);
        g2d.fillRect(134 + x, 160 + y, 1, 3);
        g2d.fillRect(135 + x, 160 + y, 1, 4);
        g2d.fillRect(142 + x, 160 + y, 1, 3);
        g2d.fillRect(144 + x, 160 + y, 1, 1);
        g2d.fillRect(155 + x, 160 + y, 4, 1);
        g2d.fillRect(81 + x, 161 + y, 1, 4);
        g2d.fillRect(82 + x, 161 + y, 1, 1);
        g2d.fillRect(94 + x, 161 + y, 1, 7);
        g2d.fillRect(105 + x, 161 + y, 1, 8);
        g2d.fillRect(125 + x, 161 + y, 1, 2);
        g2d.fillRect(132 + x, 161 + y, 1, 5);
        g2d.fillRect(136 + x, 161 + y, 1, 1);
        g2d.fillRect(145 + x, 161 + y, 1, 2);
        g2d.fillRect(148 + x, 161 + y, 2, 1);
        g2d.fillRect(83 + x, 162 + y, 1, 2);
        g2d.fillRect(120 + x, 162 + y, 1, 4);
        g2d.fillRect(133 + x, 162 + y, 1, 4);
        g2d.fillRect(140 + x, 162 + y, 1, 1);
        g2d.fillRect(149 + x, 162 + y, 3, 1);
        g2d.fillRect(82 + x, 163 + y, 1, 2);
        g2d.fillRect(84 + x, 163 + y, 4, 1);
        g2d.fillRect(121 + x, 163 + y, 1, 2);
        g2d.fillRect(122 + x, 163 + y, 1, 2);
        g2d.fillRect(136 + x, 163 + y, 1, 3);
        g2d.fillRect(146 + x, 163 + y, 1, 2);
        g2d.fillRect(147 + x, 163 + y, 1, 2);
        g2d.fillRect(150 + x, 163 + y, 1, 1);
        g2d.fillRect(152 + x, 163 + y, 1, 2);
        g2d.fillRect(153 + x, 163 + y, 1, 2);
        g2d.fillRect(85 + x, 164 + y, 2, 1);
        g2d.fillRect(96 + x, 164 + y, 1, 2);
        g2d.fillRect(92 + x, 165 + y, 1, 2);
        g2d.fillRect(93 + x, 165 + y, 1, 2);
        g2d.fillRect(103 + x, 165 + y, 1, 4);
        g2d.fillRect(104 + x, 165 + y, 1, 4);
        g2d.fillRect(125 + x, 165 + y, 1, 1);
        g2d.fillRect(128 + x, 165 + y, 1, 2);
        g2d.fillRect(129 + x, 165 + y, 1, 2);
        g2d.fillRect(137 + x, 165 + y, 1, 2);
        g2d.fillRect(148 + x, 165 + y, 2, 1);
        g2d.fillRect(106 + x, 166 + y, 1, 3);
        g2d.fillRect(122 + x, 166 + y, 2, 1);
        g2d.fillRect(127 + x, 166 + y, 1, 1);
        g2d.fillRect(138 + x, 166 + y, 1, 1);
        g2d.fillRect(107 + x, 167 + y, 1, 2);
        g2d.fillRect(120 + x, 167 + y, 2, 1);
        g2d.fillRect(108 + x, 168 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(167, 167, 215, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169, 169, 215, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170, 170, 215, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 174, 180, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 46 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(174, 174, 214, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173, 173, 217, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(176, 176, 216, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 2);
        g2d.fillRect(112 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177, 177, 216, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(176, 176, 219, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(122 + x, 51 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(178, 178, 217, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(179, 179, 218, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 180, 217, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 180, 218, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 45 + y, 1, 1);
        g2d.fillRect(123 + x, 47 + y, 2, 1);
        g2d.fillRect(121 + x, 48 + y, 2, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 2);
        g2d.fillRect(123 + x, 49 + y, 2, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(95 + x, 52 + y, 1, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 2);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(124 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(125 + x, 54 + y, 1, 1);
        g2d.fillRect(124 + x, 55 + y, 1, 3);
        g2d.fillRect(126 + x, 56 + y, 1, 1);
        g2d.fillRect(125 + x, 58 + y, 1, 1);
        g2d.fillRect(124 + x, 59 + y, 1, 1);
        g2d.fillRect(100 + x, 67 + y, 1, 2);
        g2d.fillRect(99 + x, 68 + y, 1, 2);
        g2d.fillRect(101 + x, 68 + y, 1, 2);
        g2d.fillRect(98 + x, 69 + y, 1, 1);
        g2d.fillRect(96 + x, 70 + y, 1, 1);
        g2d.fillRect(100 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 70 + y, 1, 11);
        g2d.fillRect(99 + x, 71 + y, 1, 3);
        g2d.fillRect(101 + x, 71 + y, 1, 1);
        g2d.fillRect(97 + x, 72 + y, 1, 5);
        g2d.fillRect(95 + x, 73 + y, 2, 1);
        g2d.fillRect(100 + x, 73 + y, 1, 7);
        g2d.fillRect(101 + x, 73 + y, 1, 7);
        g2d.fillRect(96 + x, 76 + y, 1, 1);
        g2d.fillRect(98 + x, 76 + y, 1, 2);
        g2d.fillRect(99 + x, 76 + y, 1, 1);
        g2d.fillRect(97 + x, 78 + y, 1, 2);
        g2d.fillRect(99 + x, 78 + y, 1, 4);
        g2d.fillRect(98 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 81 + y, 2, 1);
        g2d.fillRect(97 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 4);
        g2d.fillRect(99 + x, 83 + y, 1, 3);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 11);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 102 + y, 1, 3);
        g2d.fillRect(102 + x, 102 + y, 1, 6);
        g2d.fillRect(99 + x, 103 + y, 1, 2);
        g2d.fillRect(100 + x, 108 + y, 1, 2);
        g2d.fillRect(101 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 110 + y, 1, 5);
        g2d.fillRect(103 + x, 110 + y, 1, 17);
        g2d.fillRect(100 + x, 111 + y, 1, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 10);
        g2d.fillRect(101 + x, 116 + y, 1, 1);
        g2d.fillRect(102 + x, 117 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 2);
        g2d.fillRect(102 + x, 121 + y, 1, 9);
        g2d.fillRect(101 + x, 122 + y, 1, 1);
        g2d.fillRect(100 + x, 126 + y, 2, 1);
        g2d.fillRect(99 + x, 128 + y, 1, 1);
        g2d.fillRect(101 + x, 128 + y, 1, 1);
        g2d.fillRect(98 + x, 130 + y, 1, 1);
        g2d.fillRect(100 + x, 130 + y, 1, 3);
        g2d.fillRect(99 + x, 131 + y, 1, 1);
        g2d.fillRect(98 + x, 132 + y, 1, 1);
        g2d.fillRect(99 + x, 133 + y, 1, 1);
        g2d.fillRect(97 + x, 134 + y, 2, 1);
        g2d.fillRect(96 + x, 135 + y, 1, 1);
        g2d.fillRect(98 + x, 135 + y, 1, 2);
        g2d.fillRect(97 + x, 136 + y, 1, 2);
        g2d.fillRect(96 + x, 137 + y, 1, 1);
        g2d.fillRect(94 + x, 139 + y, 1, 5);
        g2d.fillRect(96 + x, 139 + y, 1, 2);
        g2d.fillRect(93 + x, 141 + y, 1, 5);
        g2d.fillRect(95 + x, 141 + y, 1, 2);
        g2d.fillRect(92 + x, 144 + y, 1, 3);
        g2d.fillRect(91 + x, 145 + y, 1, 1);
        g2d.fillRect(90 + x, 146 + y, 1, 2);
        g2d.fillRect(91 + x, 147 + y, 1, 1);
        g2d.fillRect(88 + x, 148 + y, 1, 2);
        g2d.fillRect(89 + x, 148 + y, 1, 2);
        g2d.fillRect(87 + x, 151 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181, 181, 218, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(182, 182, 219, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 2, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(182, 182, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(122 + x, 54 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 210, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 150 + y, 1, 1);
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(107 + x, 154 + y, 1, 2);
        g2d.fillRect(115 + x, 154 + y, 1, 1);
        g2d.fillRect(106 + x, 155 + y, 1, 1);
        g2d.fillRect(114 + x, 155 + y, 1, 1);
        g2d.fillRect(129 + x, 155 + y, 1, 1);
        g2d.fillRect(91 + x, 156 + y, 1, 2);
        g2d.fillRect(143 + x, 156 + y, 1, 1);
        g2d.fillRect(82 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 157 + y, 1, 1);
        g2d.fillRect(95 + x, 157 + y, 1, 2);
        g2d.fillRect(118 + x, 157 + y, 1, 2);
        g2d.fillRect(134 + x, 157 + y, 1, 2);
        g2d.fillRect(153 + x, 157 + y, 1, 1);
        g2d.fillRect(81 + x, 158 + y, 1, 1);
        g2d.fillRect(94 + x, 158 + y, 1, 1);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(132 + x, 158 + y, 1, 1);
        g2d.fillRect(125 + x, 159 + y, 1, 1);
        g2d.fillRect(152 + x, 159 + y, 2, 1);
        g2d.fillRect(109 + x, 160 + y, 1, 1);
        g2d.fillRect(121 + x, 160 + y, 1, 1);
        g2d.fillRect(139 + x, 160 + y, 1, 1);
        g2d.fillRect(147 + x, 160 + y, 1, 1);
        g2d.fillRect(120 + x, 161 + y, 1, 1);
        g2d.fillRect(122 + x, 161 + y, 1, 1);
        g2d.fillRect(138 + x, 161 + y, 1, 1);
        g2d.fillRect(140 + x, 161 + y, 1, 1);
        g2d.fillRect(93 + x, 162 + y, 1, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 1);
        g2d.fillRect(113 + x, 162 + y, 1, 1);
        g2d.fillRect(121 + x, 162 + y, 1, 1);
        g2d.fillRect(136 + x, 162 + y, 1, 1);
        g2d.fillRect(139 + x, 162 + y, 1, 1);
        g2d.fillRect(154 + x, 162 + y, 1, 1);
        g2d.fillRect(96 + x, 163 + y, 1, 1);
        g2d.fillRect(151 + x, 163 + y, 1, 1);
        g2d.fillRect(92 + x, 164 + y, 2, 1);
        g2d.fillRect(103 + x, 164 + y, 2, 1);
        g2d.fillRect(117 + x, 164 + y, 1, 1);
        g2d.fillRect(134 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 166 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(184, 184, 219, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(184, 184, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183, 183, 224, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 51 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185, 185, 222, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 187, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(187, 187, 222, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 47 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(123 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(188, 188, 223, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(179, 204, 218, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 47 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(190, 190, 224, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(191, 191, 226, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 191, 199, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 46 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193, 193, 226, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 194, 222, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(194, 194, 226, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195, 195, 227, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(194, 194, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(196, 197, 227, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(216, 202, 203, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197, 197, 228, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 1);
        g2d.fillRect(90 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 54 + y, 1, 1);
        g2d.fillRect(123 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 198, 228, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 199, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 5);
        g2d.fillRect(114 + x, 65 + y, 1, 3);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 3);
        g2d.fillRect(106 + x, 68 + y, 1, 5);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 2);
        g2d.fillRect(108 + x, 69 + y, 1, 3);
        g2d.fillRect(109 + x, 71 + y, 1, 2);
        g2d.fillRect(110 + x, 71 + y, 1, 2);
        g2d.fillRect(113 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 72 + y, 1, 4);
        g2d.fillRect(114 + x, 72 + y, 2, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 7);
        g2d.fillRect(115 + x, 73 + y, 1, 6);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 3);
        g2d.fillRect(110 + x, 74 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 3);
        g2d.fillRect(112 + x, 77 + y, 1, 4);
        g2d.fillRect(113 + x, 77 + y, 1, 3);
        g2d.fillRect(116 + x, 77 + y, 1, 5);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 4);
        g2d.fillRect(111 + x, 78 + y, 1, 3);
        g2d.fillRect(109 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 3);
        g2d.fillRect(117 + x, 80 + y, 1, 3);
        g2d.fillRect(107 + x, 81 + y, 1, 14);
        g2d.fillRect(115 + x, 81 + y, 1, 4);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(105 + x, 83 + y, 1, 13);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(116 + x, 83 + y, 1, 4);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 6);
        g2d.fillRect(106 + x, 86 + y, 1, 11);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 12);
        g2d.fillRect(118 + x, 87 + y, 1, 37);
        g2d.fillRect(113 + x, 89 + y, 1, 7);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 14);
        g2d.fillRect(115 + x, 96 + y, 1, 9);
        g2d.fillRect(114 + x, 101 + y, 1, 29);
        g2d.fillRect(115 + x, 108 + y, 1, 5);
        g2d.fillRect(117 + x, 111 + y, 1, 26);
        g2d.fillRect(116 + x, 113 + y, 1, 19);
        g2d.fillRect(109 + x, 125 + y, 1, 18);
        g2d.fillRect(119 + x, 125 + y, 1, 2);
        g2d.fillRect(115 + x, 127 + y, 1, 9);
        g2d.fillRect(108 + x, 128 + y, 1, 20);
        g2d.fillRect(104 + x, 129 + y, 1, 2);
        g2d.fillRect(103 + x, 131 + y, 1, 5);
        g2d.fillRect(107 + x, 131 + y, 1, 22);
        g2d.fillRect(110 + x, 132 + y, 1, 15);
        g2d.fillRect(102 + x, 136 + y, 1, 6);
        g2d.fillRect(118 + x, 136 + y, 1, 7);
        g2d.fillRect(106 + x, 137 + y, 1, 17);
        g2d.fillRect(101 + x, 138 + y, 1, 7);
        g2d.fillRect(116 + x, 138 + y, 1, 4);
        g2d.fillRect(111 + x, 139 + y, 1, 12);
        g2d.fillRect(125 + x, 139 + y, 2, 1);
        g2d.fillRect(121 + x, 140 + y, 1, 5);
        g2d.fillRect(126 + x, 140 + y, 1, 1);
        g2d.fillRect(100 + x, 141 + y, 1, 7);
        g2d.fillRect(122 + x, 141 + y, 1, 6);
        g2d.fillRect(127 + x, 141 + y, 1, 2);
        g2d.fillRect(117 + x, 142 + y, 1, 3);
        g2d.fillRect(99 + x, 143 + y, 1, 7);
        g2d.fillRect(112 + x, 143 + y, 1, 13);
        g2d.fillRect(123 + x, 143 + y, 1, 3);
        g2d.fillRect(128 + x, 143 + y, 1, 3);
        g2d.fillRect(124 + x, 144 + y, 1, 3);
        g2d.fillRect(129 + x, 144 + y, 1, 3);
        g2d.fillRect(130 + x, 145 + y, 1, 3);
        g2d.fillRect(98 + x, 146 + y, 1, 6);
        g2d.fillRect(105 + x, 146 + y, 1, 15);
        g2d.fillRect(131 + x, 146 + y, 1, 2);
        g2d.fillRect(97 + x, 147 + y, 1, 7);
        g2d.fillRect(113 + x, 147 + y, 1, 11);
        g2d.fillRect(118 + x, 147 + y, 2, 1);
        g2d.fillRect(125 + x, 147 + y, 1, 1);
        g2d.fillRect(132 + x, 147 + y, 1, 2);
        g2d.fillRect(119 + x, 148 + y, 2, 1);
        g2d.fillRect(123 + x, 148 + y, 1, 2);
        g2d.fillRect(124 + x, 148 + y, 1, 3);
        g2d.fillRect(126 + x, 148 + y, 2, 1);
        g2d.fillRect(133 + x, 148 + y, 3, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(127 + x, 149 + y, 1, 1);
        g2d.fillRect(134 + x, 149 + y, 2, 1);
        g2d.fillRect(96 + x, 150 + y, 1, 8);
        g2d.fillRect(125 + x, 150 + y, 1, 3);
        g2d.fillRect(128 + x, 150 + y, 1, 2);
        g2d.fillRect(136 + x, 150 + y, 1, 2);
        g2d.fillRect(121 + x, 151 + y, 1, 3);
        g2d.fillRect(129 + x, 151 + y, 1, 1);
        g2d.fillRect(114 + x, 152 + y, 1, 2);
        g2d.fillRect(119 + x, 152 + y, 1, 2);
        g2d.fillRect(122 + x, 152 + y, 1, 3);
        g2d.fillRect(126 + x, 152 + y, 1, 2);
        g2d.fillRect(130 + x, 152 + y, 1, 4);
        g2d.fillRect(131 + x, 152 + y, 1, 2);
        g2d.fillRect(137 + x, 152 + y, 1, 1);
        g2d.fillRect(95 + x, 153 + y, 1, 4);
        g2d.fillRect(104 + x, 153 + y, 1, 6);
        g2d.fillRect(120 + x, 153 + y, 1, 2);
        g2d.fillRect(128 + x, 153 + y, 2, 1);
        g2d.fillRect(138 + x, 153 + y, 1, 1);
        g2d.fillRect(94 + x, 154 + y, 1, 3);
        g2d.fillRect(127 + x, 154 + y, 1, 2);
        g2d.fillRect(132 + x, 154 + y, 1, 3);
        g2d.fillRect(133 + x, 154 + y, 1, 2);
        g2d.fillRect(140 + x, 154 + y, 1, 1);
        g2d.fillRect(121 + x, 155 + y, 1, 2);
        g2d.fillRect(123 + x, 155 + y, 1, 4);
        g2d.fillRect(131 + x, 155 + y, 1, 1);
        g2d.fillRect(141 + x, 155 + y, 2, 1);
        g2d.fillRect(93 + x, 156 + y, 1, 6);
        g2d.fillRect(106 + x, 156 + y, 1, 10);
        g2d.fillRect(114 + x, 156 + y, 1, 4);
        g2d.fillRect(115 + x, 156 + y, 1, 5);
        g2d.fillRect(122 + x, 156 + y, 1, 1);
        g2d.fillRect(124 + x, 156 + y, 1, 5);
        g2d.fillRect(128 + x, 156 + y, 1, 1);
        g2d.fillRect(134 + x, 156 + y, 2, 1);
        g2d.fillRect(144 + x, 156 + y, 1, 1);
        g2d.fillRect(92 + x, 157 + y, 1, 5);
        g2d.fillRect(107 + x, 157 + y, 1, 10);
        g2d.fillRect(129 + x, 157 + y, 1, 2);
        g2d.fillRect(136 + x, 157 + y, 1, 4);
        g2d.fillRect(147 + x, 157 + y, 2, 1);
        g2d.fillRect(135 + x, 158 + y, 1, 1);
        g2d.fillRect(146 + x, 158 + y, 1, 1);
        g2d.fillRect(148 + x, 158 + y, 1, 3);
        g2d.fillRect(149 + x, 158 + y, 1, 1);
        g2d.fillRect(90 + x, 159 + y, 1, 7);
        g2d.fillRect(91 + x, 159 + y, 1, 7);
        g2d.fillRect(94 + x, 159 + y, 1, 2);
        g2d.fillRect(95 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 159 + y, 1, 5);
        g2d.fillRect(117 + x, 159 + y, 1, 5);
        g2d.fillRect(137 + x, 159 + y, 1, 2);
        g2d.fillRect(138 + x, 159 + y, 1, 2);
        g2d.fillRect(151 + x, 159 + y, 1, 1);
        g2d.fillRect(108 + x, 160 + y, 1, 8);
        g2d.fillRect(125 + x, 160 + y, 1, 1);
        g2d.fillRect(130 + x, 160 + y, 1, 2);
        g2d.fillRect(149 + x, 160 + y, 1, 1);
        g2d.fillRect(152 + x, 160 + y, 1, 3);
        g2d.fillRect(153 + x, 160 + y, 2, 1);
        g2d.fillRect(89 + x, 161 + y, 1, 5);
        g2d.fillRect(150 + x, 161 + y, 2, 1);
        g2d.fillRect(155 + x, 161 + y, 3, 1);
        g2d.fillRect(88 + x, 162 + y, 1, 4);
        g2d.fillRect(109 + x, 162 + y, 1, 6);
        g2d.fillRect(153 + x, 162 + y, 1, 1);
        g2d.fillRect(110 + x, 163 + y, 1, 5);
        g2d.fillRect(118 + x, 163 + y, 1, 4);
        g2d.fillRect(137 + x, 163 + y, 1, 2);
        g2d.fillRect(139 + x, 163 + y, 1, 2);
        g2d.fillRect(140 + x, 163 + y, 1, 2);
        g2d.fillRect(154 + x, 163 + y, 1, 1);
        g2d.fillRect(87 + x, 164 + y, 1, 1);
        g2d.fillRect(138 + x, 164 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 4);
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 1, 3);
        g2d.fillRect(124 + x, 166 + y, 1, 1);
        g2d.fillRect(113 + x, 167 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 199, 230, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(123 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201, 200, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 2, 1);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201, 201, 231, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201, 202, 230, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(210, 205, 220, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 65 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(202, 202, 231, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 204, 231, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204, 204, 233, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 47 + y, 1, 1);
        g2d.fillRect(92 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 2, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 207, 233, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 199, 225, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 44 + y, 1, 1);
        g2d.fillRect(85 + x, 50 + y, 1, 2);
        g2d.fillRect(86 + x, 52 + y, 1, 1);
        g2d.fillRect(87 + x, 58 + y, 1, 1);
        g2d.fillRect(93 + x, 63 + y, 1, 1);
        g2d.fillRect(94 + x, 64 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 235, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(207, 207, 236, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 199, 226, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 199, 226, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 1, 1);
        g2d.fillRect(87 + x, 55 + y, 1, 1);
        g2d.fillRect(87 + x, 59 + y, 1, 1);
        g2d.fillRect(89 + x, 60 + y, 1, 1);
        g2d.fillRect(90 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208, 208, 235, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(209, 209, 236, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(94 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(94 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(123 + x, 58 + y, 1, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(123 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 201, 227, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 44 + y, 1, 1);
        g2d.fillRect(89 + x, 44 + y, 1, 1);
        g2d.fillRect(86 + x, 48 + y, 1, 1);
        g2d.fillRect(87 + x, 54 + y, 1, 1);
        g2d.fillRect(90 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 203, 228, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 41 + y, 1, 1);
        g2d.fillRect(86 + x, 45 + y, 1, 1);
        g2d.fillRect(87 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(211, 211, 236, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(96 + x, 58 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 204, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(85 + x, 46 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(212, 211, 237, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 44 + y, 1, 3);
        g2d.fillRect(94 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(88 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 2, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(120 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(120 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(218, 214, 228, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(212, 212, 237, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 45 + y, 1, 1);
        g2d.fillRect(94 + x, 46 + y, 2, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 2, 1);
        g2d.fillRect(100 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 248, 159, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 205, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 57 + y, 1, 1);
        g2d.fillRect(95 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(212, 213, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 59 + y, 1, 1);
        g2d.fillRect(120 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 43 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 1, 2);
        g2d.fillRect(122 + x, 44 + y, 2, 1);
        g2d.fillRect(123 + x, 45 + y, 1, 2);
        g2d.fillRect(124 + x, 45 + y, 1, 2);
        g2d.fillRect(125 + x, 45 + y, 1, 9);
        g2d.fillRect(126 + x, 45 + y, 1, 2);
        g2d.fillRect(127 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 1);
        g2d.fillRect(122 + x, 46 + y, 1, 2);
        g2d.fillRect(121 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 48 + y, 1, 3);
        g2d.fillRect(123 + x, 48 + y, 2, 1);
        g2d.fillRect(126 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 2, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(123 + x, 50 + y, 2, 1);
        g2d.fillRect(126 + x, 50 + y, 1, 6);
        g2d.fillRect(127 + x, 50 + y, 1, 3);
        g2d.fillRect(94 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(124 + x, 51 + y, 1, 1);
        g2d.fillRect(128 + x, 52 + y, 1, 1);
        g2d.fillRect(124 + x, 53 + y, 1, 2);
        g2d.fillRect(128 + x, 54 + y, 1, 4);
        g2d.fillRect(125 + x, 55 + y, 1, 3);
        g2d.fillRect(127 + x, 55 + y, 1, 7);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(126 + x, 57 + y, 1, 5);
        g2d.fillRect(124 + x, 58 + y, 1, 1);
        g2d.fillRect(125 + x, 59 + y, 1, 4);
        g2d.fillRect(128 + x, 59 + y, 1, 1);
        g2d.fillRect(124 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(126 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(101 + x, 65 + y, 1, 3);
        g2d.fillRect(100 + x, 66 + y, 1, 1);
        g2d.fillRect(123 + x, 66 + y, 1, 1);
        g2d.fillRect(97 + x, 67 + y, 1, 5);
        g2d.fillRect(99 + x, 67 + y, 1, 1);
        g2d.fillRect(95 + x, 68 + y, 1, 5);
        g2d.fillRect(96 + x, 68 + y, 1, 2);
        g2d.fillRect(98 + x, 68 + y, 1, 1);
        g2d.fillRect(102 + x, 68 + y, 1, 2);
        g2d.fillRect(100 + x, 69 + y, 1, 1);
        g2d.fillRect(98 + x, 70 + y, 1, 6);
        g2d.fillRect(99 + x, 70 + y, 1, 1);
        g2d.fillRect(101 + x, 70 + y, 1, 1);
        g2d.fillRect(94 + x, 71 + y, 1, 1);
        g2d.fillRect(96 + x, 71 + y, 1, 2);
        g2d.fillRect(100 + x, 72 + y, 2, 1);
        g2d.fillRect(94 + x, 73 + y, 1, 3);
        g2d.fillRect(92 + x, 74 + y, 1, 2);
        g2d.fillRect(95 + x, 74 + y, 1, 4);
        g2d.fillRect(96 + x, 74 + y, 1, 2);
        g2d.fillRect(99 + x, 74 + y, 1, 2);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(96 + x, 77 + y, 2, 1);
        g2d.fillRect(99 + x, 77 + y, 1, 1);
        g2d.fillRect(98 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 5);
        g2d.fillRect(100 + x, 91 + y, 1, 6);
        g2d.fillRect(98 + x, 95 + y, 2, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 1);
        g2d.fillRect(99 + x, 107 + y, 1, 6);
        g2d.fillRect(98 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 112 + y, 1, 1);
        g2d.fillRect(100 + x, 112 + y, 1, 5);
        g2d.fillRect(101 + x, 112 + y, 1, 4);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(102 + x, 115 + y, 1, 2);
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(99 + x, 117 + y, 1, 3);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(98 + x, 118 + y, 1, 2);
        g2d.fillRect(102 + x, 118 + y, 1, 3);
        g2d.fillRect(101 + x, 120 + y, 1, 2);
        g2d.fillRect(99 + x, 121 + y, 1, 7);
        g2d.fillRect(100 + x, 121 + y, 1, 5);
        g2d.fillRect(98 + x, 122 + y, 1, 1);
        g2d.fillRect(101 + x, 123 + y, 1, 3);
        g2d.fillRect(97 + x, 126 + y, 2, 1);
        g2d.fillRect(98 + x, 127 + y, 1, 3);
        g2d.fillRect(100 + x, 127 + y, 1, 3);
        g2d.fillRect(101 + x, 127 + y, 1, 1);
        g2d.fillRect(97 + x, 128 + y, 1, 3);
        g2d.fillRect(99 + x, 129 + y, 1, 2);
        g2d.fillRect(101 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 131 + y, 1, 1);
        g2d.fillRect(97 + x, 132 + y, 1, 2);
        g2d.fillRect(99 + x, 132 + y, 1, 1);
        g2d.fillRect(98 + x, 133 + y, 1, 1);
        g2d.fillRect(94 + x, 134 + y, 1, 1);
        g2d.fillRect(96 + x, 134 + y, 1, 1);
        g2d.fillRect(95 + x, 135 + y, 1, 6);
        g2d.fillRect(97 + x, 135 + y, 1, 1);
        g2d.fillRect(96 + x, 136 + y, 1, 1);
        g2d.fillRect(94 + x, 137 + y, 1, 2);
        g2d.fillRect(93 + x, 138 + y, 1, 3);
        g2d.fillRect(96 + x, 138 + y, 1, 1);
        g2d.fillRect(92 + x, 139 + y, 1, 1);
        g2d.fillRect(91 + x, 141 + y, 1, 4);
        g2d.fillRect(92 + x, 141 + y, 1, 3);
        g2d.fillRect(90 + x, 142 + y, 1, 1);
        g2d.fillRect(88 + x, 144 + y, 1, 1);
        g2d.fillRect(90 + x, 144 + y, 1, 2);
        g2d.fillRect(88 + x, 146 + y, 1, 2);
        g2d.fillRect(89 + x, 146 + y, 1, 2);
        g2d.fillRect(91 + x, 146 + y, 1, 1);
        g2d.fillRect(87 + x, 148 + y, 1, 3);
        g2d.fillRect(85 + x, 149 + y, 1, 2);
        g2d.fillRect(86 + x, 149 + y, 1, 5);
        g2d.fillRect(84 + x, 152 + y, 2, 1);
        g2d.fillRect(83 + x, 153 + y, 1, 1);
        g2d.fillRect(85 + x, 153 + y, 1, 1);
        g2d.fillRect(84 + x, 154 + y, 1, 2);
        g2d.fillRect(83 + x, 155 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 208, 231, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 42 + y, 1, 1);
        g2d.fillRect(87 + x, 50 + y, 1, 1);
        g2d.fillRect(94 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 215, 239, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(91 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(123 + x, 57 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 1);
        g2d.fillRect(96 + x, 80 + y, 2, 1);
        g2d.fillRect(100 + x, 80 + y, 2, 1);
        g2d.fillRect(97 + x, 81 + y, 1, 1);
        g2d.fillRect(96 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 82 + y, 1, 3);
        g2d.fillRect(99 + x, 82 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(96 + x, 85 + y, 2, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 1, 2);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 106 + y, 1, 1);
        g2d.fillRect(100 + x, 107 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 2);
        g2d.fillRect(102 + x, 108 + y, 1, 2);
        g2d.fillRect(97 + x, 110 + y, 1, 1);
        g2d.fillRect(100 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215, 216, 240, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(216, 216, 239, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 63 + y, 1, 1);
        g2d.fillRect(97 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 2, 1);
        g2d.fillRect(99 + x, 88 + y, 2, 1);
        g2d.fillRect(97 + x, 97 + y, 1, 2);
        g2d.fillRect(98 + x, 98 + y, 1, 4);
        g2d.fillRect(99 + x, 98 + y, 1, 3);
        g2d.fillRect(100 + x, 99 + y, 1, 3);
        g2d.fillRect(99 + x, 102 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 218, 234, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(217, 216, 240, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 1);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(93 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(122 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 2, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(118 + x, 62 + y, 2, 1);
        g2d.fillRect(122 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(100 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(217, 218, 239, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 211, 233, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(85 + x, 47 + y, 1, 1);
        g2d.fillRect(88 + x, 58 + y, 1, 1);
        g2d.fillRect(90 + x, 59 + y, 1, 1);
        g2d.fillRect(91 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(218, 218, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(123 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(99 + x, 63 + y, 1, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 1);
        g2d.fillRect(100 + x, 64 + y, 1, 1);
        g2d.fillRect(123 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 220, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 61 + y, 1, 1);
        g2d.fillRect(122 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220, 220, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(93 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(93 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 223, 232, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 221, 242, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 217, 237, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 41 + y, 1, 1);
        g2d.fillRect(86 + x, 46 + y, 1, 1);
        g2d.fillRect(88 + x, 56 + y, 1, 1);
        g2d.fillRect(88 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 222, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 49 + y, 1, 1);
        g2d.fillRect(92 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 223, 243, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(93 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 1);
        g2d.fillRect(97 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 218, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 41 + y, 1, 1);
        g2d.fillRect(89 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223, 224, 244, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 1);
        g2d.fillRect(92 + x, 49 + y, 1, 1);
        g2d.fillRect(95 + x, 55 + y, 1, 2);
        g2d.fillRect(95 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 220, 239, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 42 + y, 1, 1);
        g2d.fillRect(86 + x, 50 + y, 1, 1);
        g2d.fillRect(88 + x, 55 + y, 1, 1);
        g2d.fillRect(91 + x, 59 + y, 1, 1);
        g2d.fillRect(92 + x, 61 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224, 225, 244, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 56 + y, 1, 1);
        g2d.fillRect(93 + x, 58 + y, 1, 1);
        g2d.fillRect(96 + x, 60 + y, 1, 1);
        g2d.fillRect(93 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225, 226, 245, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(94 + x, 57 + y, 1, 1);
        g2d.fillRect(94 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 226, 245, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(91 + x, 50 + y, 1, 2);
        g2d.fillRect(123 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(123 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 223, 241, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 52 + y, 1, 1);
        g2d.fillRect(91 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 226, 246, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 48 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 2);
        g2d.fillRect(118 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 5);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 2);
        g2d.fillRect(109 + x, 74 + y, 1, 5);
        g2d.fillRect(110 + x, 76 + y, 1, 3);
        g2d.fillRect(111 + x, 76 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 2, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 4);
        g2d.fillRect(115 + x, 85 + y, 1, 6);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 26);
        g2d.fillRect(117 + x, 91 + y, 1, 20);
        g2d.fillRect(115 + x, 93 + y, 1, 3);
        g2d.fillRect(115 + x, 105 + y, 1, 3);
        g2d.fillRect(115 + x, 113 + y, 1, 14);
        g2d.fillRect(104 + x, 127 + y, 1, 2);
        g2d.fillRect(103 + x, 129 + y, 1, 2);
        g2d.fillRect(102 + x, 132 + y, 1, 4);
        g2d.fillRect(116 + x, 132 + y, 1, 6);
        g2d.fillRect(101 + x, 133 + y, 1, 5);
        g2d.fillRect(100 + x, 136 + y, 1, 5);
        g2d.fillRect(117 + x, 137 + y, 1, 5);
        g2d.fillRect(99 + x, 138 + y, 1, 5);
        g2d.fillRect(98 + x, 141 + y, 1, 5);
        g2d.fillRect(96 + x, 142 + y, 2, 1);
        g2d.fillRect(97 + x, 143 + y, 1, 4);
        g2d.fillRect(109 + x, 143 + y, 1, 16);
        g2d.fillRect(118 + x, 143 + y, 1, 4);
        g2d.fillRect(94 + x, 145 + y, 1, 2);
        g2d.fillRect(96 + x, 146 + y, 1, 4);
        g2d.fillRect(123 + x, 146 + y, 1, 2);
        g2d.fillRect(110 + x, 147 + y, 1, 16);
        g2d.fillRect(124 + x, 147 + y, 1, 1);
        g2d.fillRect(92 + x, 148 + y, 1, 1);
        g2d.fillRect(94 + x, 148 + y, 1, 4);
        g2d.fillRect(95 + x, 148 + y, 1, 4);
        g2d.fillRect(108 + x, 148 + y, 1, 12);
        g2d.fillRect(125 + x, 148 + y, 1, 2);
        g2d.fillRect(119 + x, 149 + y, 1, 3);
        g2d.fillRect(90 + x, 150 + y, 1, 2);
        g2d.fillRect(91 + x, 150 + y, 1, 1);
        g2d.fillRect(120 + x, 150 + y, 1, 3);
        g2d.fillRect(126 + x, 150 + y, 1, 2);
        g2d.fillRect(127 + x, 150 + y, 1, 4);
        g2d.fillRect(93 + x, 151 + y, 1, 5);
        g2d.fillRect(111 + x, 151 + y, 1, 14);
        g2d.fillRect(88 + x, 152 + y, 1, 2);
        g2d.fillRect(89 + x, 152 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 5);
        g2d.fillRect(128 + x, 152 + y, 2, 1);
        g2d.fillRect(138 + x, 152 + y, 1, 1);
        g2d.fillRect(94 + x, 153 + y, 1, 1);
        g2d.fillRect(107 + x, 153 + y, 1, 1);
        g2d.fillRect(139 + x, 153 + y, 2, 1);
        g2d.fillRect(87 + x, 154 + y, 1, 2);
        g2d.fillRect(91 + x, 154 + y, 1, 2);
        g2d.fillRect(121 + x, 154 + y, 1, 1);
        g2d.fillRect(131 + x, 154 + y, 1, 1);
        g2d.fillRect(141 + x, 154 + y, 2, 1);
        g2d.fillRect(90 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 155 + y, 1, 1);
        g2d.fillRect(143 + x, 155 + y, 1, 1);
        g2d.fillRect(85 + x, 156 + y, 1, 1);
        g2d.fillRect(107 + x, 156 + y, 1, 1);
        g2d.fillRect(112 + x, 156 + y, 1, 6);
        g2d.fillRect(133 + x, 156 + y, 1, 1);
        g2d.fillRect(145 + x, 156 + y, 1, 1);
        g2d.fillRect(83 + x, 157 + y, 1, 2);
        g2d.fillRect(84 + x, 157 + y, 1, 2);
        g2d.fillRect(88 + x, 157 + y, 1, 5);
        g2d.fillRect(89 + x, 157 + y, 1, 4);
        g2d.fillRect(135 + x, 157 + y, 1, 1);
        g2d.fillRect(146 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 2, 1);
        g2d.fillRect(113 + x, 158 + y, 1, 4);
        g2d.fillRect(147 + x, 158 + y, 1, 1);
        g2d.fillRect(81 + x, 159 + y, 1, 2);
        g2d.fillRect(82 + x, 159 + y, 1, 2);
        g2d.fillRect(87 + x, 159 + y, 1, 4);
        g2d.fillRect(149 + x, 159 + y, 2, 1);
        g2d.fillRect(114 + x, 160 + y, 1, 8);
        g2d.fillRect(150 + x, 160 + y, 2, 1);
        g2d.fillRect(86 + x, 161 + y, 1, 2);
        g2d.fillRect(109 + x, 161 + y, 1, 1);
        g2d.fillRect(115 + x, 161 + y, 1, 7);
        g2d.fillRect(137 + x, 161 + y, 1, 2);
        g2d.fillRect(153 + x, 161 + y, 1, 1);
        g2d.fillRect(85 + x, 162 + y, 1, 1);
        g2d.fillRect(138 + x, 162 + y, 1, 2);
        g2d.fillRect(155 + x, 162 + y, 2, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 3);
        g2d.fillRect(113 + x, 163 + y, 1, 4);
        g2d.fillRect(116 + x, 165 + y, 1, 3);
        g2d.fillRect(139 + x, 165 + y, 1, 1);
        g2d.fillRect(117 + x, 166 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(226, 227, 246, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 224, 242, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 41 + y, 1, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 1);
        g2d.fillRect(87 + x, 48 + y, 1, 1);
        g2d.fillRect(86 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(227, 228, 246, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 51 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(122 + x, 64 + y, 1, 1);
        g2d.fillRect(122 + x, 66 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(210, 237, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 154 + y, 1, 1);
        g2d.fillRect(90 + x, 156 + y, 1, 1);
        g2d.fillRect(94 + x, 157 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 1);
        g2d.fillRect(132 + x, 157 + y, 1, 1);
        g2d.fillRect(152 + x, 157 + y, 1, 1);
        g2d.fillRect(92 + x, 162 + y, 1, 1);
        g2d.fillRect(103 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228, 229, 246, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 226, 242, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229, 230, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(121 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(121 + x, 63 + y, 1, 1);
        g2d.fillRect(120 + x, 64 + y, 1, 4);
        g2d.fillRect(121 + x, 66 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 231, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(96 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(230, 231, 248, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 232, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 233, 235, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 46 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 232, 248, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(92 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(122 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(232, 232, 248, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 1);
        g2d.fillRect(89 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(99 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(99 + x, 62 + y, 1, 1);
        g2d.fillRect(118 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 231, 246, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 42 + y, 1, 1);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(88 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 242, 251, 255), COLORS.get(ImageUtilities.GREY)));


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233, 234, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(90 + x, 50 + y, 1, 1);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 1);
        g2d.fillRect(98 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234, 235, 250, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235, 236, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 234, 248, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 57 + y, 1, 1);
        g2d.fillRect(90 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 237, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236, 237, 250, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 44 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 236, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 43 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237, 238, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(93 + x, 52 + y, 1, 1);
        g2d.fillRect(92 + x, 57 + y, 1, 1);
        g2d.fillRect(94 + x, 58 + y, 1, 1);
        g2d.fillRect(94 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 238, 250, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(89 + x, 45 + y, 1, 1);
        g2d.fillRect(86 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 47 + y, 1, 1);
        g2d.fillRect(91 + x, 58 + y, 1, 1);
        g2d.fillRect(93 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(238, 239, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 238, 249, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 46 + y, 1, 1);
        g2d.fillRect(106 + x, 47 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(240, 239, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(86 + x, 51 + y, 1, 1);
        g2d.fillRect(88 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(92 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 240, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(89 + x, 43 + y, 1, 1);
        g2d.fillRect(90 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(87 + x, 49 + y, 1, 1);
        g2d.fillRect(92 + x, 53 + y, 1, 1);
        g2d.fillRect(97 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(240, 241, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 45 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 1);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(89 + x, 51 + y, 1, 1);
        g2d.fillRect(92 + x, 52 + y, 1, 1);
        g2d.fillRect(89 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 1);
        g2d.fillRect(95 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(89 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 60 + y, 1, 1);
        g2d.fillRect(95 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(97 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 242, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 40 + y, 1, 4);
        g2d.fillRect(119 + x, 41 + y, 1, 8);
        g2d.fillRect(121 + x, 41 + y, 1, 3);
        g2d.fillRect(124 + x, 41 + y, 1, 4);
        g2d.fillRect(125 + x, 41 + y, 1, 4);
        g2d.fillRect(92 + x, 42 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 3);
        g2d.fillRect(122 + x, 42 + y, 1, 2);
        g2d.fillRect(127 + x, 42 + y, 1, 3);
        g2d.fillRect(90 + x, 43 + y, 1, 1);
        g2d.fillRect(93 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 5);
        g2d.fillRect(97 + x, 44 + y, 3, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 6);
        g2d.fillRect(120 + x, 44 + y, 1, 2);
        g2d.fillRect(126 + x, 44 + y, 1, 1);
        g2d.fillRect(128 + x, 44 + y, 1, 8);
        g2d.fillRect(129 + x, 44 + y, 1, 3);
        g2d.fillRect(87 + x, 45 + y, 1, 3);
        g2d.fillRect(99 + x, 45 + y, 2, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 4);
        g2d.fillRect(88 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 5);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(127 + x, 46 + y, 1, 4);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(126 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 2, 1);
        g2d.fillRect(129 + x, 48 + y, 1, 11);
        g2d.fillRect(130 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(126 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 2, 1);
        g2d.fillRect(92 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(130 + x, 51 + y, 1, 1);
        g2d.fillRect(88 + x, 52 + y, 3, 1);
        g2d.fillRect(89 + x, 53 + y, 1, 3);
        g2d.fillRect(90 + x, 53 + y, 1, 3);
        g2d.fillRect(91 + x, 53 + y, 1, 5);
        g2d.fillRect(127 + x, 53 + y, 1, 2);
        g2d.fillRect(128 + x, 53 + y, 1, 1);
        g2d.fillRect(130 + x, 53 + y, 1, 6);
        g2d.fillRect(131 + x, 55 + y, 1, 1);
        g2d.fillRect(92 + x, 56 + y, 2, 1);
        g2d.fillRect(132 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(131 + x, 57 + y, 1, 2);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(128 + x, 58 + y, 1, 1);
        g2d.fillRect(128 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 1);
        g2d.fillRect(129 + x, 61 + y, 2, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(124 + x, 62 + y, 1, 2);
        g2d.fillRect(126 + x, 62 + y, 2, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(125 + x, 63 + y, 1, 2);
        g2d.fillRect(118 + x, 64 + y, 1, 1);
        g2d.fillRect(95 + x, 65 + y, 1, 3);
        g2d.fillRect(96 + x, 65 + y, 1, 3);
        g2d.fillRect(97 + x, 65 + y, 1, 2);
        g2d.fillRect(98 + x, 65 + y, 1, 3);
        g2d.fillRect(99 + x, 65 + y, 1, 2);
        g2d.fillRect(100 + x, 65 + y, 1, 1);
        g2d.fillRect(102 + x, 65 + y, 1, 3);
        g2d.fillRect(94 + x, 67 + y, 1, 4);
        g2d.fillRect(93 + x, 68 + y, 1, 8);
        g2d.fillRect(92 + x, 70 + y, 1, 4);
        g2d.fillRect(91 + x, 71 + y, 1, 2);
        g2d.fillRect(94 + x, 72 + y, 1, 1);
        g2d.fillRect(89 + x, 73 + y, 1, 2);
        g2d.fillRect(90 + x, 74 + y, 2, 1);
        g2d.fillRect(91 + x, 75 + y, 1, 1);
        g2d.fillRect(92 + x, 76 + y, 1, 1);
        g2d.fillRect(94 + x, 76 + y, 1, 7);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(93 + x, 77 + y, 1, 6);
        g2d.fillRect(92 + x, 78 + y, 1, 2);
        g2d.fillRect(95 + x, 78 + y, 1, 6);
        g2d.fillRect(96 + x, 78 + y, 1, 2);
        g2d.fillRect(90 + x, 79 + y, 2, 1);
        g2d.fillRect(92 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 2);
        g2d.fillRect(94 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 106 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 1, 2);
        g2d.fillRect(98 + x, 108 + y, 1, 2);
        g2d.fillRect(96 + x, 111 + y, 1, 2);
        g2d.fillRect(97 + x, 111 + y, 1, 1);
        g2d.fillRect(98 + x, 112 + y, 1, 4);
        g2d.fillRect(97 + x, 113 + y, 1, 13);
        g2d.fillRect(99 + x, 113 + y, 1, 2);
        g2d.fillRect(96 + x, 115 + y, 1, 2);
        g2d.fillRect(99 + x, 116 + y, 1, 1);
        g2d.fillRect(98 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 117 + y, 1, 4);
        g2d.fillRect(96 + x, 118 + y, 1, 1);
        g2d.fillRect(98 + x, 120 + y, 1, 2);
        g2d.fillRect(99 + x, 120 + y, 1, 1);
        g2d.fillRect(96 + x, 122 + y, 1, 1);
        g2d.fillRect(98 + x, 123 + y, 1, 3);
        g2d.fillRect(96 + x, 125 + y, 1, 9);
        g2d.fillRect(97 + x, 127 + y, 1, 1);
        g2d.fillRect(94 + x, 130 + y, 1, 4);
        g2d.fillRect(95 + x, 130 + y, 1, 5);
        g2d.fillRect(97 + x, 131 + y, 1, 1);
        g2d.fillRect(93 + x, 132 + y, 1, 6);
        g2d.fillRect(92 + x, 134 + y, 1, 5);
        g2d.fillRect(94 + x, 135 + y, 1, 2);
        g2d.fillRect(91 + x, 136 + y, 1, 5);
        g2d.fillRect(90 + x, 137 + y, 1, 5);
        g2d.fillRect(89 + x, 139 + y, 1, 7);
        g2d.fillRect(88 + x, 140 + y, 1, 4);
        g2d.fillRect(92 + x, 140 + y, 1, 1);
        g2d.fillRect(87 + x, 142 + y, 1, 6);
        g2d.fillRect(86 + x, 143 + y, 1, 6);
        g2d.fillRect(90 + x, 143 + y, 1, 1);
        g2d.fillRect(85 + x, 145 + y, 1, 4);
        g2d.fillRect(88 + x, 145 + y, 1, 1);
        g2d.fillRect(84 + x, 147 + y, 1, 5);
        g2d.fillRect(83 + x, 148 + y, 1, 5);
        g2d.fillRect(82 + x, 150 + y, 1, 6);
        g2d.fillRect(85 + x, 151 + y, 1, 1);
        g2d.fillRect(81 + x, 152 + y, 1, 5);
        g2d.fillRect(84 + x, 153 + y, 1, 1);
        g2d.fillRect(80 + x, 154 + y, 1, 3);
        g2d.fillRect(83 + x, 154 + y, 1, 1);
        g2d.fillRect(79 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 243, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 2, 1);
        g2d.fillRect(87 + x, 51 + y, 1, 1);
        g2d.fillRect(92 + x, 54 + y, 1, 1);
        g2d.fillRect(90 + x, 56 + y, 1, 2);
        g2d.fillRect(96 + x, 81 + y, 1, 1);
        g2d.fillRect(96 + x, 83 + y, 1, 2);
        g2d.fillRect(97 + x, 83 + y, 1, 2);
        g2d.fillRect(98 + x, 85 + y, 1, 10);
        g2d.fillRect(96 + x, 86 + y, 1, 2);
        g2d.fillRect(97 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 6);
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 97 + y, 1, 2);
        g2d.fillRect(97 + x, 99 + y, 1, 6);
        g2d.fillRect(96 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 102 + y, 1, 1);
        g2d.fillRect(96 + x, 103 + y, 1, 1);
        g2d.fillRect(96 + x, 105 + y, 1, 2);
        g2d.fillRect(95 + x, 106 + y, 1, 1);
        g2d.fillRect(97 + x, 107 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242, 243, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 43 + y, 1, 1);
        g2d.fillRect(90 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 44 + y, 1, 1);
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(98 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(98 + x, 62 + y, 1, 1);
        g2d.fillRect(121 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 244, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243, 244, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(89 + x, 46 + y, 1, 1);
        g2d.fillRect(88 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(91 + x, 52 + y, 1, 1);
        g2d.fillRect(92 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 130 + y, 1, 2);
        g2d.fillRect(101 + x, 132 + y, 1, 1);
        g2d.fillRect(100 + x, 134 + y, 1, 2);
        g2d.fillRect(99 + x, 136 + y, 1, 2);
        g2d.fillRect(98 + x, 138 + y, 1, 3);
        g2d.fillRect(97 + x, 139 + y, 1, 3);
        g2d.fillRect(95 + x, 144 + y, 2, 1);
        g2d.fillRect(96 + x, 145 + y, 1, 1);
        g2d.fillRect(93 + x, 147 + y, 3, 1);
        g2d.fillRect(91 + x, 148 + y, 1, 2);
        g2d.fillRect(90 + x, 149 + y, 1, 1);
        g2d.fillRect(93 + x, 149 + y, 1, 2);
        g2d.fillRect(89 + x, 150 + y, 1, 2);
        g2d.fillRect(92 + x, 150 + y, 1, 2);
        g2d.fillRect(88 + x, 151 + y, 1, 1);
        g2d.fillRect(91 + x, 152 + y, 1, 2);
        g2d.fillRect(87 + x, 153 + y, 1, 1);
        g2d.fillRect(90 + x, 153 + y, 1, 2);
        g2d.fillRect(86 + x, 154 + y, 1, 2);
        g2d.fillRect(85 + x, 155 + y, 1, 1);
        g2d.fillRect(89 + x, 155 + y, 1, 2);
        g2d.fillRect(83 + x, 156 + y, 2, 1);
        g2d.fillRect(88 + x, 156 + y, 1, 1);
        g2d.fillRect(79 + x, 157 + y, 2, 1);
        g2d.fillRect(87 + x, 157 + y, 1, 2);
        g2d.fillRect(80 + x, 158 + y, 1, 2);
        g2d.fillRect(85 + x, 159 + y, 1, 3);
        g2d.fillRect(86 + x, 159 + y, 1, 2);
        g2d.fillRect(83 + x, 161 + y, 2, 1);
        g2d.fillRect(84 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244, 245, 254, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 42 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(88 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(90 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(97 + x, 61 + y, 1, 1);
        g2d.fillRect(100 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 246, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(88 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 248, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(119 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250, 251, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 48 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 149 + y, 1, 1);
        g2d.fillRect(114 + x, 154 + y, 1, 1);
        g2d.fillRect(129 + x, 154 + y, 1, 1);
        g2d.fillRect(135 + x, 155 + y, 1, 1);
        g2d.fillRect(86 + x, 156 + y, 1, 1);
        g2d.fillRect(81 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 157 + y, 1, 1);
        g2d.fillRect(133 + x, 157 + y, 1, 1);
        g2d.fillRect(152 + x, 158 + y, 1, 1);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(147 + x, 159 + y, 1, 1);
        g2d.fillRect(154 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(138 + x, 165 + y, 1, 1);
        g2d.fillRect(101 + x, 166 + y, 1, 1);
    }

    public void paint6TU(int x, int y, GraphicsMap g2d) {
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158, 158, 211, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 59 + y, 1, 4);
        g2d.fillRect(119 + x, 65 + y, 2, 1);
        g2d.fillRect(120 + x, 66 + y, 1, 1);
        g2d.fillRect(121 + x, 68 + y, 1, 1);
        g2d.fillRect(120 + x, 69 + y, 1, 2);
        g2d.fillRect(121 + x, 70 + y, 1, 1);
        g2d.fillRect(120 + x, 72 + y, 1, 1);
        g2d.fillRect(121 + x, 73 + y, 1, 2);
        g2d.fillRect(120 + x, 74 + y, 1, 1);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(121 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 79 + y, 1, 2);
        g2d.fillRect(123 + x, 79 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(123 + x, 83 + y, 1, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 2, 1);
        g2d.fillRect(123 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 98 + y, 1, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 180, 218, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 50 + y, 1, 4);
        g2d.fillRect(121 + x, 50 + y, 1, 2);
        g2d.fillRect(122 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 6);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(124 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(122 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 4);
        g2d.fillRect(125 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(124 + x, 55 + y, 1, 3);
        g2d.fillRect(120 + x, 56 + y, 3, 1);
        g2d.fillRect(126 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 57 + y, 1, 6);
        g2d.fillRect(122 + x, 57 + y, 1, 7);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 2, 1);
        g2d.fillRect(123 + x, 58 + y, 1, 1);
        g2d.fillRect(125 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(124 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 5);
        g2d.fillRect(123 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 2, 1);
        g2d.fillRect(118 + x, 62 + y, 1, 1);
        g2d.fillRect(123 + x, 62 + y, 1, 1);
        g2d.fillRect(120 + x, 63 + y, 1, 2);
        g2d.fillRect(118 + x, 64 + y, 1, 2);
        g2d.fillRect(121 + x, 64 + y, 1, 3);
        g2d.fillRect(123 + x, 64 + y, 1, 1);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 3);
        g2d.fillRect(123 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 67 + y, 1, 3);
        g2d.fillRect(120 + x, 67 + y, 1, 2);
        g2d.fillRect(118 + x, 68 + y, 1, 1);
        g2d.fillRect(121 + x, 69 + y, 1, 1);
        g2d.fillRect(123 + x, 69 + y, 1, 1);
        g2d.fillRect(122 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 2, 1);
        g2d.fillRect(120 + x, 71 + y, 2, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 2);
        g2d.fillRect(121 + x, 72 + y, 2, 1);
        g2d.fillRect(124 + x, 72 + y, 1, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 1);
        g2d.fillRect(123 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 2, 1);
        g2d.fillRect(122 + x, 74 + y, 1, 1);
        g2d.fillRect(124 + x, 74 + y, 1, 2);
        g2d.fillRect(120 + x, 75 + y, 1, 2);
        g2d.fillRect(121 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 3, 1);
        g2d.fillRect(122 + x, 76 + y, 1, 8);
        g2d.fillRect(123 + x, 76 + y, 1, 2);
        g2d.fillRect(116 + x, 77 + y, 1, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(124 + x, 78 + y, 1, 5);
        g2d.fillRect(125 + x, 78 + y, 1, 3);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 3);
        g2d.fillRect(121 + x, 81 + y, 1, 2);
        g2d.fillRect(123 + x, 81 + y, 1, 2);
        g2d.fillRect(125 + x, 82 + y, 1, 4);
        g2d.fillRect(126 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(123 + x, 84 + y, 1, 5);
        g2d.fillRect(124 + x, 84 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 2, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 4);
        g2d.fillRect(124 + x, 87 + y, 1, 1);
        g2d.fillRect(126 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(125 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 11);
        g2d.fillRect(124 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 4);
        g2d.fillRect(123 + x, 92 + y, 1, 2);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(125 + x, 93 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(121 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 3, 1);
        g2d.fillRect(121 + x, 99 + y, 1, 2);
        g2d.fillRect(123 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 6);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 6);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(123 + x, 101 + y, 1, 1);
        g2d.fillRect(115 + x, 104 + y, 3, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 3);
        g2d.fillRect(120 + x, 107 + y, 1, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 2);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(119 + x, 109 + y, 1, 2);
        g2d.fillRect(121 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(120 + x, 110 + y, 1, 3);
        g2d.fillRect(121 + x, 111 + y, 2, 1);
        g2d.fillRect(119 + x, 112 + y, 1, 1);
        g2d.fillRect(121 + x, 113 + y, 2, 1);
        g2d.fillRect(120 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 199, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 50 + y, 1, 3);
        g2d.fillRect(110 + x, 56 + y, 3, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 2, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(112 + x, 66 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 248, 159, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(123 + x, 47 + y, 1, 4);
        g2d.fillRect(124 + x, 47 + y, 1, 5);
        g2d.fillRect(118 + x, 48 + y, 1, 4);
        g2d.fillRect(120 + x, 48 + y, 1, 2);
        g2d.fillRect(121 + x, 48 + y, 1, 2);
        g2d.fillRect(122 + x, 48 + y, 1, 2);
        g2d.fillRect(125 + x, 48 + y, 2, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(126 + x, 49 + y, 1, 7);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(125 + x, 50 + y, 1, 4);
        g2d.fillRect(127 + x, 50 + y, 1, 3);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 4);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 3);
        g2d.fillRect(121 + x, 52 + y, 2, 1);
        g2d.fillRect(128 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(124 + x, 53 + y, 1, 2);
        g2d.fillRect(122 + x, 54 + y, 1, 2);
        g2d.fillRect(128 + x, 54 + y, 1, 4);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(125 + x, 55 + y, 1, 3);
        g2d.fillRect(127 + x, 55 + y, 1, 6);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 3);
        g2d.fillRect(123 + x, 57 + y, 1, 1);
        g2d.fillRect(126 + x, 57 + y, 1, 4);
        g2d.fillRect(114 + x, 58 + y, 2, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(124 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 3);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(125 + x, 59 + y, 1, 5);
        g2d.fillRect(128 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(124 + x, 60 + y, 1, 6);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(123 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 5);
        g2d.fillRect(118 + x, 63 + y, 1, 1);
        g2d.fillRect(121 + x, 63 + y, 1, 1);
        g2d.fillRect(123 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(122 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(116 + x, 65 + y, 1, 3);
        g2d.fillRect(123 + x, 65 + y, 1, 1);
        g2d.fillRect(118 + x, 66 + y, 1, 2);
        g2d.fillRect(122 + x, 66 + y, 1, 4);
        g2d.fillRect(125 + x, 66 + y, 1, 4);
        g2d.fillRect(127 + x, 66 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(121 + x, 67 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 2);
        g2d.fillRect(124 + x, 67 + y, 1, 5);
        g2d.fillRect(126 + x, 67 + y, 1, 1);
        g2d.fillRect(118 + x, 69 + y, 1, 2);
        g2d.fillRect(119 + x, 69 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 4);
        g2d.fillRect(116 + x, 70 + y, 1, 4);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(123 + x, 70 + y, 1, 3);
        g2d.fillRect(122 + x, 71 + y, 1, 1);
        g2d.fillRect(125 + x, 71 + y, 1, 7);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 2);
        g2d.fillRect(118 + x, 72 + y, 1, 2);
        g2d.fillRect(126 + x, 72 + y, 1, 4);
        g2d.fillRect(127 + x, 72 + y, 1, 2);
        g2d.fillRect(122 + x, 73 + y, 1, 1);
        g2d.fillRect(124 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 75 + y, 2, 1);
        g2d.fillRect(123 + x, 75 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 2);
        g2d.fillRect(124 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 5);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 10);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(126 + x, 77 + y, 1, 5);
        g2d.fillRect(123 + x, 78 + y, 1, 1);
        g2d.fillRect(127 + x, 78 + y, 1, 7);
        g2d.fillRect(125 + x, 81 + y, 1, 1);
        g2d.fillRect(128 + x, 81 + y, 1, 4);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(124 + x, 83 + y, 1, 1);
        g2d.fillRect(126 + x, 83 + y, 1, 4);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(124 + x, 86 + y, 2, 1);
        g2d.fillRect(127 + x, 86 + y, 1, 3);
        g2d.fillRect(128 + x, 86 + y, 1, 1);
        g2d.fillRect(125 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 4, 1);
        g2d.fillRect(124 + x, 88 + y, 1, 1);
        g2d.fillRect(126 + x, 88 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(119 + x, 89 + y, 1, 3);
        g2d.fillRect(125 + x, 89 + y, 1, 4);
        g2d.fillRect(128 + x, 89 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 1, 4);
        g2d.fillRect(127 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(123 + x, 91 + y, 1, 1);
        g2d.fillRect(122 + x, 92 + y, 1, 1);
        g2d.fillRect(126 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 3, 1);
        g2d.fillRect(127 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 2, 1);
        g2d.fillRect(122 + x, 94 + y, 2, 1);
        g2d.fillRect(125 + x, 94 + y, 1, 2);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(123 + x, 95 + y, 1, 4);
        g2d.fillRect(126 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 2);
        g2d.fillRect(118 + x, 96 + y, 1, 2);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(124 + x, 96 + y, 1, 2);
        g2d.fillRect(119 + x, 97 + y, 1, 1);
        g2d.fillRect(122 + x, 97 + y, 1, 6);
        g2d.fillRect(125 + x, 97 + y, 1, 2);
        g2d.fillRect(126 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 3, 1);
        g2d.fillRect(124 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 1);
        g2d.fillRect(120 + x, 100 + y, 1, 1);
        g2d.fillRect(123 + x, 100 + y, 1, 1);
        g2d.fillRect(125 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 3);
        g2d.fillRect(121 + x, 101 + y, 1, 1);
        g2d.fillRect(115 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 103 + y, 1, 4);
        g2d.fillRect(117 + x, 103 + y, 1, 1);
        g2d.fillRect(121 + x, 103 + y, 1, 6);
        g2d.fillRect(123 + x, 103 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 3);
        g2d.fillRect(120 + x, 104 + y, 1, 3);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(122 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 1, 2);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(122 + x, 107 + y, 1, 1);
        g2d.fillRect(114 + x, 108 + y, 2, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 2);
        g2d.fillRect(123 + x, 108 + y, 1, 8);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(122 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 3);
        g2d.fillRect(121 + x, 110 + y, 1, 1);
        g2d.fillRect(124 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(119 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 112 + y, 1, 1);
        g2d.fillRect(121 + x, 112 + y, 2, 1);
        g2d.fillRect(124 + x, 112 + y, 1, 1);
        g2d.fillRect(119 + x, 113 + y, 2, 1);
        g2d.fillRect(118 + x, 114 + y, 1, 1);
        g2d.fillRect(120 + x, 114 + y, 3, 1);
        g2d.fillRect(124 + x, 114 + y, 1, 2);
        g2d.fillRect(119 + x, 115 + y, 1, 2);
        g2d.fillRect(121 + x, 115 + y, 1, 2);
        g2d.fillRect(122 + x, 115 + y, 1, 1);
        g2d.fillRect(125 + x, 115 + y, 1, 1);
        g2d.fillRect(120 + x, 116 + y, 1, 1);
        g2d.fillRect(118 + x, 117 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 242, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 47 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 242, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 43 + y, 1, 5);
        g2d.fillRect(123 + x, 44 + y, 1, 3);
        g2d.fillRect(124 + x, 44 + y, 1, 3);
        g2d.fillRect(126 + x, 44 + y, 1, 4);
        g2d.fillRect(118 + x, 45 + y, 5, 1);
        g2d.fillRect(127 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 1, 4);
        g2d.fillRect(119 + x, 46 + y, 1, 3);
        g2d.fillRect(120 + x, 46 + y, 1, 2);
        g2d.fillRect(121 + x, 46 + y, 1, 2);
        g2d.fillRect(122 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 4);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(127 + x, 47 + y, 1, 3);
        g2d.fillRect(128 + x, 47 + y, 1, 5);
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(130 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 4);
        g2d.fillRect(125 + x, 49 + y, 1, 1);
        g2d.fillRect(129 + x, 49 + y, 1, 10);
        g2d.fillRect(114 + x, 50 + y, 1, 8);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(130 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(127 + x, 53 + y, 1, 2);
        g2d.fillRect(128 + x, 53 + y, 1, 1);
        g2d.fillRect(130 + x, 53 + y, 1, 6);
        g2d.fillRect(112 + x, 54 + y, 2, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(131 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(132 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 11);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(131 + x, 57 + y, 1, 2);
        g2d.fillRect(128 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(128 + x, 60 + y, 1, 2);
        g2d.fillRect(126 + x, 61 + y, 1, 6);
        g2d.fillRect(127 + x, 61 + y, 1, 5);
        g2d.fillRect(129 + x, 61 + y, 2, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 3);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 2);
        g2d.fillRect(128 + x, 63 + y, 1, 1);
        g2d.fillRect(125 + x, 64 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(128 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(124 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 3);
        g2d.fillRect(128 + x, 67 + y, 1, 2);
        g2d.fillRect(129 + x, 67 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(126 + x, 68 + y, 1, 4);
        g2d.fillRect(127 + x, 68 + y, 1, 4);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 4);
        g2d.fillRect(125 + x, 70 + y, 1, 1);
        g2d.fillRect(128 + x, 70 + y, 1, 11);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(129 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 2);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(127 + x, 74 + y, 1, 4);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 3);
        g2d.fillRect(126 + x, 76 + y, 1, 1);
        g2d.fillRect(129 + x, 76 + y, 1, 2);
        g2d.fillRect(130 + x, 76 + y, 1, 3);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(115 + x, 78 + y, 1, 3);
        g2d.fillRect(116 + x, 78 + y, 1, 5);
        g2d.fillRect(118 + x, 80 + y, 1, 3);
        g2d.fillRect(129 + x, 80 + y, 1, 6);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(130 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 2, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 6);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 84 + y, 1, 3);
        g2d.fillRect(130 + x, 84 + y, 1, 1);
        g2d.fillRect(127 + x, 85 + y, 2, 1);
        g2d.fillRect(131 + x, 85 + y, 1, 1);
        g2d.fillRect(130 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(128 + x, 87 + y, 1, 2);
        g2d.fillRect(129 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 3);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(127 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 9);
        g2d.fillRect(126 + x, 90 + y, 1, 2);
        g2d.fillRect(128 + x, 90 + y, 1, 3);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(127 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(126 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 2);
        g2d.fillRect(124 + x, 94 + y, 1, 2);
        g2d.fillRect(127 + x, 94 + y, 1, 5);
        g2d.fillRect(128 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 5);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(125 + x, 96 + y, 2, 1);
        g2d.fillRect(128 + x, 97 + y, 1, 1);
        g2d.fillRect(124 + x, 98 + y, 1, 1);
        g2d.fillRect(126 + x, 98 + y, 1, 4);
        g2d.fillRect(114 + x, 99 + y, 1, 4);
        g2d.fillRect(125 + x, 99 + y, 1, 1);
        g2d.fillRect(113 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 1);
        g2d.fillRect(124 + x, 100 + y, 1, 10);
        g2d.fillRect(127 + x, 100 + y, 1, 1);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(125 + x, 101 + y, 1, 2);
        g2d.fillRect(113 + x, 102 + y, 1, 2);
        g2d.fillRect(121 + x, 102 + y, 1, 1);
        g2d.fillRect(123 + x, 102 + y, 1, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(122 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 104 + y, 2, 1);
        g2d.fillRect(123 + x, 104 + y, 1, 4);
        g2d.fillRect(125 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 6);
        g2d.fillRect(111 + x, 106 + y, 1, 2);
        g2d.fillRect(122 + x, 106 + y, 1, 1);
        g2d.fillRect(125 + x, 106 + y, 1, 9);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(126 + x, 107 + y, 1, 10);
        g2d.fillRect(127 + x, 107 + y, 1, 1);
        g2d.fillRect(122 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 110 + y, 1, 5);
        g2d.fillRect(127 + x, 110 + y, 1, 3);
        g2d.fillRect(115 + x, 111 + y, 1, 6);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(124 + x, 111 + y, 1, 1);
        g2d.fillRect(112 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 4);
        g2d.fillRect(117 + x, 112 + y, 1, 8);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 5);
        g2d.fillRect(118 + x, 113 + y, 1, 1);
        g2d.fillRect(124 + x, 113 + y, 1, 1);
        g2d.fillRect(119 + x, 114 + y, 1, 1);
        g2d.fillRect(127 + x, 114 + y, 1, 3);
        g2d.fillRect(118 + x, 115 + y, 1, 2);
        g2d.fillRect(122 + x, 116 + y, 1, 4);
        g2d.fillRect(123 + x, 116 + y, 1, 4);
        g2d.fillRect(124 + x, 116 + y, 2, 1);
        g2d.fillRect(119 + x, 117 + y, 1, 3);
        g2d.fillRect(120 + x, 117 + y, 1, 2);
        g2d.fillRect(121 + x, 117 + y, 1, 4);
        g2d.fillRect(125 + x, 117 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);

        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 47 + y, 1, 2);
    }

    public void paint6TB(int x, int y, GraphicsMap g2d) {
        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(158, 158, 211, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 61 + y, 1, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 2);
        g2d.fillRect(96 + x, 63 + y, 1, 1);
        g2d.fillRect(96 + x, 65 + y, 1, 1);
        g2d.fillRect(97 + x, 66 + y, 1, 1);
        g2d.fillRect(96 + x, 68 + y, 1, 1);
        g2d.fillRect(95 + x, 69 + y, 1, 1);
        g2d.fillRect(97 + x, 69 + y, 1, 1);
        g2d.fillRect(95 + x, 72 + y, 1, 2);
        g2d.fillRect(97 + x, 72 + y, 1, 2);
        g2d.fillRect(98 + x, 74 + y, 1, 1);
        g2d.fillRect(97 + x, 75 + y, 1, 1);
        g2d.fillRect(96 + x, 77 + y, 1, 1);
        g2d.fillRect(97 + x, 78 + y, 1, 2);
        g2d.fillRect(98 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 80 + y, 1, 1);
        g2d.fillRect(97 + x, 82 + y, 2, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 1);
        g2d.fillRect(97 + x, 84 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 4);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(97 + x, 97 + y, 2, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(180, 180, 218, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 58 + y, 1, 3);
        g2d.fillRect(98 + x, 58 + y, 1, 6);
        g2d.fillRect(93 + x, 59 + y, 1, 1);
        g2d.fillRect(95 + x, 59 + y, 1, 2);
        g2d.fillRect(96 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 2);
        g2d.fillRect(97 + x, 62 + y, 1, 4);
        g2d.fillRect(94 + x, 63 + y, 1, 1);
        g2d.fillRect(93 + x, 64 + y, 1, 1);
        g2d.fillRect(95 + x, 64 + y, 1, 5);
        g2d.fillRect(96 + x, 64 + y, 1, 1);
        g2d.fillRect(92 + x, 65 + y, 1, 1);
        g2d.fillRect(94 + x, 65 + y, 1, 1);
        g2d.fillRect(98 + x, 65 + y, 1, 2);
        g2d.fillRect(99 + x, 65 + y, 1, 1);
        g2d.fillRect(96 + x, 66 + y, 1, 2);
        g2d.fillRect(93 + x, 67 + y, 1, 4);
        g2d.fillRect(94 + x, 67 + y, 1, 2);
        g2d.fillRect(97 + x, 67 + y, 1, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 8);
        g2d.fillRect(98 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 70 + y, 1, 1);
        g2d.fillRect(94 + x, 70 + y, 1, 5);
        g2d.fillRect(95 + x, 70 + y, 1, 2);
        g2d.fillRect(97 + x, 70 + y, 1, 2);
        g2d.fillRect(98 + x, 71 + y, 1, 3);
        g2d.fillRect(93 + x, 72 + y, 1, 3);
        g2d.fillRect(100 + x, 73 + y, 1, 1);
        g2d.fillRect(97 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 75 + y, 1, 2);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(97 + x, 76 + y, 1, 2);
        g2d.fillRect(98 + x, 76 + y, 1, 2);
        g2d.fillRect(99 + x, 76 + y, 3, 1);
        g2d.fillRect(94 + x, 77 + y, 1, 2);
        g2d.fillRect(95 + x, 78 + y, 1, 2);
        g2d.fillRect(96 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 78 + y, 2, 1);
        g2d.fillRect(98 + x, 79 + y, 2, 1);
        g2d.fillRect(94 + x, 80 + y, 1, 1);
        g2d.fillRect(96 + x, 80 + y, 2, 1);
        g2d.fillRect(99 + x, 80 + y, 1, 1);
        g2d.fillRect(97 + x, 81 + y, 2, 1);
        g2d.fillRect(100 + x, 81 + y, 2, 1);
        g2d.fillRect(96 + x, 82 + y, 1, 1);
        g2d.fillRect(95 + x, 83 + y, 1, 1);
        g2d.fillRect(97 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 3);
        g2d.fillRect(98 + x, 84 + y, 1, 2);
        g2d.fillRect(99 + x, 84 + y, 1, 3);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(95 + x, 86 + y, 1, 1);
        g2d.fillRect(97 + x, 86 + y, 1, 3);
        g2d.fillRect(96 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 2);
        g2d.fillRect(95 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 2);
        g2d.fillRect(99 + x, 88 + y, 1, 5);
        g2d.fillRect(96 + x, 89 + y, 1, 8);
        g2d.fillRect(95 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 7);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(95 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(94 + x, 93 + y, 1, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(93 + x, 94 + y, 1, 1);
        g2d.fillRect(95 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 2, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(94 + x, 95 + y, 1, 3);
        g2d.fillRect(100 + x, 95 + y, 1, 4);
        g2d.fillRect(92 + x, 96 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 6);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(93 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 2);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 4);
        g2d.fillRect(94 + x, 100 + y, 1, 1);
        g2d.fillRect(100 + x, 100 + y, 1, 1);
        g2d.fillRect(96 + x, 101 + y, 1, 2);
        g2d.fillRect(97 + x, 101 + y, 1, 2);
        g2d.fillRect(99 + x, 101 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(199, 199, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 71 + y, 1, 3);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 96 + y, 3, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 248, 159, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 103 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213, 213, 238, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 58 + y, 1, 1);
        g2d.fillRect(95 + x, 58 + y, 2, 1);
        g2d.fillRect(99 + x, 58 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(91 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 4);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(92 + x, 60 + y, 2, 1);
        g2d.fillRect(96 + x, 60 + y, 1, 1);
        g2d.fillRect(91 + x, 61 + y, 1, 2);
        g2d.fillRect(93 + x, 61 + y, 1, 3);
        g2d.fillRect(95 + x, 61 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 4);
        g2d.fillRect(100 + x, 61 + y, 1, 4);
        g2d.fillRect(101 + x, 61 + y, 1, 1);
        g2d.fillRect(90 + x, 63 + y, 1, 1);
        g2d.fillRect(92 + x, 63 + y, 1, 2);
        g2d.fillRect(91 + x, 64 + y, 1, 3);
        g2d.fillRect(94 + x, 64 + y, 1, 1);
        g2d.fillRect(98 + x, 64 + y, 1, 1);
        g2d.fillRect(101 + x, 64 + y, 1, 1);
        g2d.fillRect(93 + x, 65 + y, 1, 2);
        g2d.fillRect(90 + x, 66 + y, 1, 1);
        g2d.fillRect(92 + x, 66 + y, 1, 4);
        g2d.fillRect(94 + x, 66 + y, 1, 1);
        g2d.fillRect(99 + x, 66 + y, 1, 10);
        g2d.fillRect(100 + x, 66 + y, 1, 4);
        g2d.fillRect(98 + x, 67 + y, 1, 2);
        g2d.fillRect(90 + x, 68 + y, 1, 4);
        g2d.fillRect(91 + x, 68 + y, 1, 7);
        g2d.fillRect(97 + x, 68 + y, 1, 1);
        g2d.fillRect(94 + x, 69 + y, 1, 1);
        g2d.fillRect(98 + x, 70 + y, 1, 1);
        g2d.fillRect(92 + x, 71 + y, 1, 5);
        g2d.fillRect(93 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 71 + y, 1, 5);
        g2d.fillRect(95 + x, 74 + y, 1, 1);
        g2d.fillRect(100 + x, 74 + y, 1, 2);
        g2d.fillRect(93 + x, 75 + y, 1, 7);
        g2d.fillRect(94 + x, 75 + y, 1, 2);
        g2d.fillRect(98 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 2);
        g2d.fillRect(102 + x, 76 + y, 1, 2);
        g2d.fillRect(92 + x, 77 + y, 1, 4);
        g2d.fillRect(95 + x, 77 + y, 1, 1);
        g2d.fillRect(99 + x, 77 + y, 1, 2);
        g2d.fillRect(100 + x, 77 + y, 2, 1);
        g2d.fillRect(91 + x, 79 + y, 1, 2);
        g2d.fillRect(94 + x, 79 + y, 1, 1);
        g2d.fillRect(96 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 79 + y, 1, 2);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 4);
        g2d.fillRect(103 + x, 79 + y, 1, 4);
        g2d.fillRect(95 + x, 80 + y, 1, 3);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(94 + x, 81 + y, 1, 5);
        g2d.fillRect(96 + x, 81 + y, 1, 1);
        g2d.fillRect(99 + x, 81 + y, 1, 3);
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(93 + x, 83 + y, 1, 4);
        g2d.fillRect(96 + x, 83 + y, 1, 4);
        g2d.fillRect(95 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(91 + x, 85 + y, 1, 2);
        g2d.fillRect(92 + x, 85 + y, 1, 1);
        g2d.fillRect(97 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 86 + y, 1, 5);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(94 + x, 87 + y, 1, 6);
        g2d.fillRect(95 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(96 + x, 88 + y, 1, 1);
        g2d.fillRect(93 + x, 89 + y, 1, 5);
        g2d.fillRect(95 + x, 89 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(95 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 4);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(91 + x, 92 + y, 1, 6);
        g2d.fillRect(92 + x, 92 + y, 1, 4);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(90 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 2, 1);
        g2d.fillRect(94 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(90 + x, 95 + y, 1, 4);
        g2d.fillRect(93 + x, 95 + y, 1, 3);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 2);
        g2d.fillRect(101 + x, 95 + y, 1, 2);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(92 + x, 97 + y, 1, 8);
        g2d.fillRect(96 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(94 + x, 98 + y, 1, 2);
        g2d.fillRect(99 + x, 98 + y, 1, 3);
        g2d.fillRect(101 + x, 98 + y, 1, 4);
        g2d.fillRect(103 + x, 98 + y, 1, 2);
        g2d.fillRect(93 + x, 99 + y, 1, 4);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 2);
        g2d.fillRect(90 + x, 100 + y, 2, 1);
        g2d.fillRect(96 + x, 100 + y, 2, 1);
        g2d.fillRect(91 + x, 101 + y, 1, 2);
        g2d.fillRect(94 + x, 101 + y, 1, 5);
        g2d.fillRect(100 + x, 101 + y, 1, 4);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(95 + x, 102 + y, 1, 4);
        g2d.fillRect(99 + x, 102 + y, 1, 2);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(96 + x, 103 + y, 1, 2);
        g2d.fillRect(97 + x, 103 + y, 1, 2);
        g2d.fillRect(98 + x, 103 + y, 1, 2);
        g2d.fillRect(93 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 105 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221, 242, 251, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 104 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(241, 242, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 58 + y, 3, 1);
        g2d.fillRect(94 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 2, 1);
        g2d.fillRect(92 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 4);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(90 + x, 60 + y, 1, 3);
        g2d.fillRect(91 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 60 + y, 2, 1);
        g2d.fillRect(92 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 3);
        g2d.fillRect(89 + x, 62 + y, 1, 4);
        g2d.fillRect(101 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(91 + x, 63 + y, 1, 1);
        g2d.fillRect(90 + x, 64 + y, 1, 2);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(100 + x, 65 + y, 2, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(88 + x, 66 + y, 1, 1);
        g2d.fillRect(101 + x, 66 + y, 1, 5);
        g2d.fillRect(102 + x, 66 + y, 1, 3);
        g2d.fillRect(87 + x, 67 + y, 1, 1);
        g2d.fillRect(89 + x, 67 + y, 1, 6);
        g2d.fillRect(90 + x, 67 + y, 2, 1);
        g2d.fillRect(88 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 3);
        g2d.fillRect(88 + x, 70 + y, 1, 2);
        g2d.fillRect(100 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 70 + y, 1, 5);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(90 + x, 72 + y, 1, 11);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(88 + x, 74 + y, 1, 3);
        g2d.fillRect(104 + x, 74 + y, 1, 3);
        g2d.fillRect(105 + x, 74 + y, 1, 2);
        g2d.fillRect(89 + x, 75 + y, 1, 2);
        g2d.fillRect(91 + x, 75 + y, 1, 4);
        g2d.fillRect(92 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(89 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 4);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(91 + x, 81 + y, 1, 4);
        g2d.fillRect(92 + x, 81 + y, 1, 4);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(93 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 2, 1);
        g2d.fillRect(90 + x, 84 + y, 1, 2);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(89 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 11);
        g2d.fillRect(92 + x, 86 + y, 1, 6);
        g2d.fillRect(94 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(90 + x, 87 + y, 2, 1);
        g2d.fillRect(93 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(91 + x, 88 + y, 1, 4);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 88 + y, 1, 3);
        g2d.fillRect(90 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 2);
        g2d.fillRect(88 + x, 91 + y, 3, 1);
        g2d.fillRect(90 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 2);
        g2d.fillRect(87 + x, 94 + y, 1, 2);
        g2d.fillRect(88 + x, 94 + y, 1, 6);
        g2d.fillRect(89 + x, 94 + y, 1, 10);
        g2d.fillRect(90 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 2, 1);
        g2d.fillRect(86 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 7);
        g2d.fillRect(87 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 2);
        g2d.fillRect(91 + x, 98 + y, 1, 2);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(90 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 4);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(88 + x, 101 + y, 1, 1);
        g2d.fillRect(90 + x, 101 + y, 1, 5);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 3);
        g2d.fillRect(103 + x, 102 + y, 1, 4);
        g2d.fillRect(91 + x, 103 + y, 1, 3);
        g2d.fillRect(93 + x, 103 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 4);
        g2d.fillRect(88 + x, 104 + y, 1, 1);
        g2d.fillRect(99 + x, 104 + y, 1, 4);
        g2d.fillRect(92 + x, 105 + y, 1, 4);
        g2d.fillRect(93 + x, 105 + y, 1, 5);
        g2d.fillRect(96 + x, 105 + y, 1, 3);
        g2d.fillRect(97 + x, 105 + y, 1, 3);
        g2d.fillRect(98 + x, 105 + y, 1, 3);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(94 + x, 106 + y, 1, 3);
        g2d.fillRect(95 + x, 106 + y, 1, 3);
        g2d.fillRect(91 + x, 107 + y, 1, 1);
        g2d.fillRect(100 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(245, 245, 253, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 254, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 104 + y, 1, 2);
    }
}
