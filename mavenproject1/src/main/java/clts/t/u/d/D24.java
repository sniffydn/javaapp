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
public class D24 extends SuperTU {

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = true;
    boolean switcher = false;

    public D24() {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public D24(String middle) {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public D24(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x, 0, g2d);
        paintBOT(x, y, g2d);

        if (y == 1) {
            paintLL3(x, 0, g2d);
        } else if (y == -1) {
            paintLL1(x, 0, g2d);
        } else {
            paintLL2(x, 0, g2d);
        }

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
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
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

    public void paintBOT(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 108 + y, 1, 2);
        g2d.fillRect(123 + x, 113 + y, 1, 11);
        g2d.fillRect(124 + x, 113 + y, 1, 1);
        g2d.fillRect(91 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 129 + y, 1, 2);
        g2d.fillRect(125 + x, 130 + y, 1, 2);
        g2d.fillRect(118 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 121 + y, 1, 8);
        g2d.fillRect(126 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 97 + y, 1, 11);
        g2d.fillRect(122 + x, 110 + y, 1, 4);
        g2d.fillRect(125 + x, 163 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 81, 122, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 160 + y, 2, 1);
        g2d.fillRect(90 + x, 163 + y, 1, 1);
        g2d.fillRect(123 + x, 164 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 75, 128, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 165 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 87, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 132 + y, 1, 6);
        g2d.fillRect(126 + x, 135 + y, 1, 9);
        g2d.fillRect(127 + x, 142 + y, 1, 3);
        g2d.fillRect(128 + x, 144 + y, 1, 3);
        g2d.fillRect(129 + x, 146 + y, 1, 3);
        g2d.fillRect(130 + x, 148 + y, 1, 3);
        g2d.fillRect(131 + x, 150 + y, 1, 3);
        g2d.fillRect(132 + x, 152 + y, 1, 2);
        g2d.fillRect(133 + x, 153 + y, 1, 3);
        g2d.fillRect(134 + x, 155 + y, 1, 4);
        g2d.fillRect(131 + x, 159 + y, 1, 2);
        g2d.fillRect(132 + x, 159 + y, 2, 1);
        g2d.fillRect(130 + x, 161 + y, 1, 1);
        g2d.fillRect(127 + x, 162 + y, 1, 2);
        g2d.fillRect(128 + x, 162 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 77, 127, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 164 + y, 1, 1);
        g2d.fillRect(121 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 71, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 166 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 69, 138, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 151 + y, 1, 1);
        g2d.fillRect(86 + x, 158 + y, 1, 2);
        g2d.fillRect(88 + x, 160 + y, 1, 1);
        g2d.fillRect(104 + x, 166 + y, 2, 1);
        g2d.fillRect(115 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 68, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 153 + y, 1, 1);
        g2d.fillRect(88 + x, 154 + y, 1, 1);
        g2d.fillRect(114 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 66, 142, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 152 + y, 1, 1);
        g2d.fillRect(87 + x, 155 + y, 1, 1);
        g2d.fillRect(89 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 65, 144, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 150 + y, 1, 1);
        g2d.fillRect(86 + x, 156 + y, 1, 1);
        g2d.fillRect(85 + x, 158 + y, 1, 1);
        g2d.fillRect(89 + x, 162 + y, 1, 1);
        g2d.fillRect(92 + x, 162 + y, 2, 1);
        g2d.fillRect(110 + x, 166 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 60, 150, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 63, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 136 + y, 1, 2);
        g2d.fillRect(90 + x, 149 + y, 1, 1);
        g2d.fillRect(85 + x, 157 + y, 1, 1);
        g2d.fillRect(93 + x, 163 + y, 1, 2);
        g2d.fillRect(94 + x, 164 + y, 2, 1);
        g2d.fillRect(100 + x, 166 + y, 2, 1);
        g2d.fillRect(109 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 59, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 58, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 146 + y, 1, 1);
        g2d.fillRect(91 + x, 147 + y, 1, 2);
        g2d.fillRect(97 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 80, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 56, 156, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 135 + y, 1, 4);
        g2d.fillRect(93 + x, 138 + y, 1, 6);
        g2d.fillRect(92 + x, 143 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 55, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 119 + y, 1, 6);
        g2d.fillRect(97 + x, 119 + y, 1, 1);
        g2d.fillRect(95 + x, 130 + y, 1, 4);
        g2d.fillRect(94 + x, 131 + y, 1, 4);
        g2d.fillRect(99 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 53, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 122 + y, 1, 8);
        g2d.fillRect(97 + x, 165 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 92, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(132 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 100 + y, 1, 7);
        g2d.fillRect(120 + x, 114 + y, 1, 5);
        g2d.fillRect(121 + x, 115 + y, 1, 11);
        g2d.fillRect(121 + x, 145 + y, 1, 1);
        g2d.fillRect(122 + x, 148 + y, 1, 1);
        g2d.fillRect(123 + x, 152 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 137, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 149 + y, 1, 3);
        g2d.fillRect(124 + x, 151 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 153 + y, 1, 4);
        g2d.fillRect(126 + x, 156 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 144, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 99 + y, 1, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 3);
        g2d.fillRect(117 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 97, 148, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 118 + y, 1, 4);
        g2d.fillRect(102 + x, 119 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 103, 142, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 104 + y, 1, 3);
        g2d.fillRect(119 + x, 109 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 1, 2);
        g2d.fillRect(117 + x, 113 + y, 1, 1);
        g2d.fillRect(121 + x, 146 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 91, 155, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 155 + y, 1, 1);
        g2d.fillRect(87 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 146 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 141, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 107 + y, 1, 7);
        g2d.fillRect(121 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 79, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 121 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 89, 157, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 153 + y, 1, 1);
        g2d.fillRect(86 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 93, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 116 + y, 1, 3);
        g2d.fillRect(103 + x, 117 + y, 1, 1);
        g2d.fillRect(89 + x, 154 + y, 1, 2);
        g2d.fillRect(90 + x, 154 + y, 1, 2);
        g2d.fillRect(88 + x, 156 + y, 1, 1);
        g2d.fillRect(87 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 133 + y, 1, 2);
        g2d.fillRect(100 + x, 137 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 122 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 87, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 116 + y, 1, 3);
        g2d.fillRect(101 + x, 128 + y, 1, 2);
        g2d.fillRect(87 + x, 156 + y, 1, 1);
        g2d.fillRect(90 + x, 160 + y, 1, 3);
        g2d.fillRect(91 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 80, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 138 + y, 1, 2);
        g2d.fillRect(92 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 111, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 144 + y, 1, 4);
        g2d.fillRect(127 + x, 145 + y, 1, 5);
        g2d.fillRect(128 + x, 147 + y, 1, 4);
        g2d.fillRect(129 + x, 149 + y, 1, 2);
        g2d.fillRect(130 + x, 151 + y, 1, 1);
        g2d.fillRect(126 + x, 155 + y, 1, 1);
        g2d.fillRect(127 + x, 157 + y, 1, 3);
        g2d.fillRect(133 + x, 157 + y, 1, 2);
        g2d.fillRect(131 + x, 158 + y, 2, 1);
        g2d.fillRect(128 + x, 159 + y, 1, 2);
        g2d.fillRect(129 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 84, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 125 + y, 1, 2);
        g2d.fillRect(101 + x, 130 + y, 1, 6);
        g2d.fillRect(100 + x, 135 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 82, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 119 + y, 1, 10);
        g2d.fillRect(102 + x, 123 + y, 1, 2);
        g2d.fillRect(97 + x, 128 + y, 1, 8);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 112, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 151 + y, 1, 1);
        g2d.fillRect(130 + x, 152 + y, 1, 2);
        g2d.fillRect(131 + x, 153 + y, 1, 1);
        g2d.fillRect(133 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 88, 163, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 114, 138, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(132 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 121, 143, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 152 + y, 1, 1);
        g2d.fillRect(130 + x, 154 + y, 1, 1);
        g2d.fillRect(132 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 88, 180, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 139 + y, 1, 5);
        g2d.fillRect(93 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 122 + y, 1, 2);
        g2d.fillRect(101 + x, 126 + y, 1, 2);
        g2d.fillRect(104 + x, 127 + y, 1, 4);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 1);
        g2d.fillRect(105 + x, 153 + y, 1, 1);
        g2d.fillRect(88 + x, 157 + y, 1, 1);
        g2d.fillRect(89 + x, 160 + y, 1, 1);
        g2d.fillRect(111 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 94, 175, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 117 + y, 1, 3);
        g2d.fillRect(100 + x, 118 + y, 1, 3);
        g2d.fillRect(99 + x, 120 + y, 1, 8);
        g2d.fillRect(97 + x, 122 + y, 1, 6);
        g2d.fillRect(96 + x, 125 + y, 1, 19);
        g2d.fillRect(98 + x, 129 + y, 1, 4);
        g2d.fillRect(97 + x, 136 + y, 1, 2);
        g2d.fillRect(97 + x, 148 + y, 1, 1);
        g2d.fillRect(93 + x, 149 + y, 1, 1);
        g2d.fillRect(95 + x, 152 + y, 1, 1);
        g2d.fillRect(93 + x, 156 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 99, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 121 + y, 1, 2);
        g2d.fillRect(104 + x, 125 + y, 1, 2);
        g2d.fillRect(100 + x, 127 + y, 1, 2);
        g2d.fillRect(99 + x, 132 + y, 1, 2);
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(95 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 92, 177, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 117 + y, 1, 3);
        g2d.fillRect(97 + x, 120 + y, 1, 2);
        g2d.fillRect(95 + x, 134 + y, 1, 10);
        g2d.fillRect(99 + x, 136 + y, 1, 2);
        g2d.fillRect(96 + x, 144 + y, 1, 1);
        g2d.fillRect(95 + x, 145 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 2);
        g2d.fillRect(93 + x, 147 + y, 1, 2);
        g2d.fillRect(98 + x, 147 + y, 1, 2);
        g2d.fillRect(92 + x, 148 + y, 1, 2);
        g2d.fillRect(97 + x, 149 + y, 1, 2);
        g2d.fillRect(96 + x, 151 + y, 1, 2);
        g2d.fillRect(93 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 90, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 144 + y, 1, 2);
        g2d.fillRect(95 + x, 144 + y, 1, 1);
        g2d.fillRect(93 + x, 145 + y, 1, 2);
        g2d.fillRect(92 + x, 147 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 110, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 124 + y, 1, 2);
        g2d.fillRect(103 + x, 142 + y, 1, 2);
        g2d.fillRect(117 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 102, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 122 + y, 1, 2);
        g2d.fillRect(100 + x, 123 + y, 1, 2);
        g2d.fillRect(105 + x, 124 + y, 1, 4);
        g2d.fillRect(108 + x, 133 + y, 1, 6);
        g2d.fillRect(107 + x, 146 + y, 1, 2);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(106 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(92 + x, 155 + y, 1, 1);
        g2d.fillRect(97 + x, 156 + y, 1, 2);
        g2d.fillRect(112 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 106, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 128 + y, 1, 2);
        g2d.fillRect(109 + x, 130 + y, 1, 2);
        g2d.fillRect(104 + x, 131 + y, 1, 4);
        g2d.fillRect(103 + x, 140 + y, 1, 2);
        g2d.fillRect(100 + x, 150 + y, 1, 1);
        g2d.fillRect(92 + x, 151 + y, 1, 1);
        g2d.fillRect(106 + x, 154 + y, 1, 1);
        g2d.fillRect(87 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 115, 155, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 114 + y, 1, 5);
        g2d.fillRect(112 + x, 115 + y, 2, 1);
        g2d.fillRect(117 + x, 115 + y, 1, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(110 + x, 117 + y, 1, 2);
        g2d.fillRect(109 + x, 118 + y, 1, 2);
        g2d.fillRect(117 + x, 122 + y, 1, 12);
        g2d.fillRect(116 + x, 123 + y, 1, 2);
        g2d.fillRect(118 + x, 135 + y, 1, 4);
        g2d.fillRect(119 + x, 146 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 7);
        g2d.fillRect(121 + x, 154 + y, 1, 4);
        g2d.fillRect(122 + x, 158 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 108, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 116 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 2);
        g2d.fillRect(104 + x, 141 + y, 1, 3);
        g2d.fillRect(102 + x, 147 + y, 1, 1);
        g2d.fillRect(94 + x, 150 + y, 1, 1);
        g2d.fillRect(93 + x, 151 + y, 1, 1);
        g2d.fillRect(112 + x, 153 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 130 + y, 1, 6);
        g2d.fillRect(124 + x, 131 + y, 1, 13);
        g2d.fillRect(123 + x, 146 + y, 1, 2);
        g2d.fillRect(124 + x, 149 + y, 1, 2);
        g2d.fillRect(125 + x, 150 + y, 1, 3);
        g2d.fillRect(129 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 119, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 107 + y, 1, 8);
        g2d.fillRect(120 + x, 119 + y, 1, 14);
        g2d.fillRect(121 + x, 126 + y, 1, 4);
        g2d.fillRect(121 + x, 140 + y, 1, 4);
        g2d.fillRect(122 + x, 160 + y, 1, 1);
        g2d.fillRect(124 + x, 162 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 163, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 128 + y, 1, 2);
        g2d.fillRect(105 + x, 130 + y, 1, 2);
        g2d.fillRect(101 + x, 148 + y, 1, 3);
        g2d.fillRect(102 + x, 148 + y, 1, 1);
        g2d.fillRect(93 + x, 150 + y, 1, 1);
        g2d.fillRect(100 + x, 151 + y, 1, 1);
        g2d.fillRect(91 + x, 152 + y, 1, 2);
        g2d.fillRect(92 + x, 152 + y, 1, 2);
        g2d.fillRect(106 + x, 155 + y, 1, 1);
        g2d.fillRect(112 + x, 155 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 149, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 114 + y, 1, 13);
        g2d.fillRect(123 + x, 124 + y, 1, 6);
        g2d.fillRect(121 + x, 130 + y, 1, 10);
        g2d.fillRect(122 + x, 144 + y, 1, 2);
        g2d.fillRect(123 + x, 148 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 114, 156, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(110 + x, 116 + y, 1, 1);
        g2d.fillRect(109 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 2);
        g2d.fillRect(118 + x, 139 + y, 1, 2);
        g2d.fillRect(119 + x, 147 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 111, 159, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 114 + y, 1, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 1);
        g2d.fillRect(107 + x, 116 + y, 2, 1);
        g2d.fillRect(113 + x, 118 + y, 1, 2);
        g2d.fillRect(105 + x, 120 + y, 1, 2);
        g2d.fillRect(104 + x, 135 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 116 + y, 1, 1);
        g2d.fillRect(109 + x, 132 + y, 1, 2);
        g2d.fillRect(103 + x, 136 + y, 1, 4);
        g2d.fillRect(106 + x, 152 + y, 1, 2);
        g2d.fillRect(89 + x, 156 + y, 1, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 97, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 115 + y, 1, 2);
        g2d.fillRect(105 + x, 115 + y, 4, 1);
        g2d.fillRect(99 + x, 128 + y, 1, 4);
        g2d.fillRect(98 + x, 133 + y, 1, 4);
        g2d.fillRect(99 + x, 134 + y, 1, 2);
        g2d.fillRect(97 + x, 138 + y, 1, 4);
        g2d.fillRect(99 + x, 142 + y, 1, 2);
        g2d.fillRect(95 + x, 146 + y, 1, 1);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(94 + x, 148 + y, 1, 1);
        g2d.fillRect(92 + x, 150 + y, 1, 1);
        g2d.fillRect(91 + x, 151 + y, 1, 1);
        g2d.fillRect(96 + x, 157 + y, 1, 1);
        g2d.fillRect(103 + x, 159 + y, 1, 3);
        g2d.fillRect(94 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 103, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 139 + y, 1, 5);
        g2d.fillRect(92 + x, 154 + y, 1, 1);
        g2d.fillRect(98 + x, 154 + y, 1, 2);
        g2d.fillRect(112 + x, 157 + y, 1, 3);
        g2d.fillRect(112 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 104, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 134 + y, 1, 4);
        g2d.fillRect(108 + x, 144 + y, 1, 2);
        g2d.fillRect(107 + x, 148 + y, 1, 2);
        g2d.fillRect(100 + x, 149 + y, 1, 1);
        g2d.fillRect(91 + x, 154 + y, 1, 2);
        g2d.fillRect(105 + x, 155 + y, 1, 1);
        g2d.fillRect(98 + x, 156 + y, 1, 2);
        g2d.fillRect(112 + x, 156 + y, 1, 1);
        g2d.fillRect(104 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 112, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 116 + y, 1, 1);
        g2d.fillRect(105 + x, 118 + y, 1, 2);
        g2d.fillRect(106 + x, 119 + y, 1, 2);
        g2d.fillRect(113 + x, 120 + y, 1, 8);
        g2d.fillRect(118 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 113, 157, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 2);
        g2d.fillRect(112 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(106 + x, 117 + y, 1, 2);
        g2d.fillRect(107 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 1, 4);
        g2d.fillRect(116 + x, 125 + y, 1, 2);
        g2d.fillRect(118 + x, 145 + y, 1, 2);
        g2d.fillRect(119 + x, 148 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 161, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(113 + x, 112 + y, 2, 1);
        g2d.fillRect(110 + x, 113 + y, 1, 2);
        g2d.fillRect(111 + x, 113 + y, 2, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 2);
        g2d.fillRect(104 + x, 139 + y, 1, 2);
        g2d.fillRect(103 + x, 144 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 100, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 120 + y, 1, 2);
        g2d.fillRect(101 + x, 124 + y, 1, 2);
        g2d.fillRect(100 + x, 125 + y, 1, 2);
        g2d.fillRect(100 + x, 129 + y, 1, 2);
        g2d.fillRect(103 + x, 132 + y, 1, 4);
        g2d.fillRect(92 + x, 156 + y, 1, 2);
        g2d.fillRect(111 + x, 161 + y, 1, 1);
        g2d.fillRect(94 + x, 162 + y, 2, 1);
        g2d.fillRect(102 + x, 162 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 117, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 109 + y, 1, 3);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(119 + x, 111 + y, 1, 9);
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(117 + x, 116 + y, 1, 6);
        g2d.fillRect(116 + x, 119 + y, 1, 4);
        g2d.fillRect(118 + x, 133 + y, 1, 2);
        g2d.fillRect(121 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 160 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 155 + y, 1, 1);
        g2d.fillRect(88 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 102, 171, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 125, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 138 + y, 1, 6);
        g2d.fillRect(125 + x, 145 + y, 1, 5);
        g2d.fillRect(126 + x, 148 + y, 1, 5);
        g2d.fillRect(127 + x, 150 + y, 1, 1);
        g2d.fillRect(131 + x, 154 + y, 1, 1);
        g2d.fillRect(127 + x, 156 + y, 2, 1);
        g2d.fillRect(128 + x, 157 + y, 1, 2);
        g2d.fillRect(129 + x, 158 + y, 1, 2);
        g2d.fillRect(130 + x, 158 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 126, 148, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 153 + y, 1, 2);
        g2d.fillRect(127 + x, 155 + y, 2, 1);
        g2d.fillRect(132 + x, 155 + y, 1, 1);
        g2d.fillRect(129 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 171, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(99 + x, 152 + y, 1, 1);
        g2d.fillRect(91 + x, 156 + y, 1, 1);
        g2d.fillRect(89 + x, 159 + y, 1, 1);
        g2d.fillRect(104 + x, 159 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 104, 175, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 158 + y, 1, 1);
        g2d.fillRect(95 + x, 159 + y, 1, 1);
        g2d.fillRect(111 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 112, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 102, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 155 + y, 1, 1);
        g2d.fillRect(101 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 155 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 118, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 110, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 158 + y, 1, 1);
        g2d.fillRect(97 + x, 158 + y, 1, 1);
        g2d.fillRect(90 + x, 159 + y, 1, 1);
        g2d.fillRect(95 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 112, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 132, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(127 + x, 154 + y, 1, 1);
        g2d.fillRect(129 + x, 155 + y, 1, 2);
        g2d.fillRect(130 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 189, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 3);
        g2d.fillRect(100 + x, 160 + y, 1, 5);
        g2d.fillRect(99 + x, 161 + y, 1, 4);
        g2d.fillRect(98 + x, 163 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 108, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 139 + y, 1, 2);
        g2d.fillRect(99 + x, 140 + y, 1, 2);
        g2d.fillRect(101 + x, 140 + y, 1, 2);
        g2d.fillRect(100 + x, 141 + y, 1, 4);
        g2d.fillRect(97 + x, 144 + y, 1, 1);
        g2d.fillRect(91 + x, 150 + y, 1, 1);
        g2d.fillRect(95 + x, 156 + y, 1, 1);
        g2d.fillRect(103 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 160 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(97 + x, 163 + y, 1, 1);
        g2d.fillRect(100 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 104, 186, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 153 + y, 1, 3);
        g2d.fillRect(102 + x, 156 + y, 1, 1);
        g2d.fillRect(95 + x, 157 + y, 1, 1);
        g2d.fillRect(93 + x, 158 + y, 1, 1);
        g2d.fillRect(102 + x, 158 + y, 1, 3);
        g2d.fillRect(94 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 159 + y, 1, 1);
        g2d.fillRect(101 + x, 161 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 184, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 141 + y, 1, 3);
        g2d.fillRect(99 + x, 146 + y, 1, 2);
        g2d.fillRect(105 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 149 + y, 1, 2);
        g2d.fillRect(97 + x, 151 + y, 1, 1);
        g2d.fillRect(104 + x, 151 + y, 1, 1);
        g2d.fillRect(94 + x, 158 + y, 2, 1);
        g2d.fillRect(93 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 115, 177, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 125 + y, 1, 8);
        g2d.fillRect(107 + x, 126 + y, 1, 4);
        g2d.fillRect(106 + x, 127 + y, 1, 2);
        g2d.fillRect(107 + x, 144 + y, 1, 2);
        g2d.fillRect(97 + x, 145 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(106 + x, 148 + y, 1, 1);
        g2d.fillRect(102 + x, 150 + y, 1, 1);
        g2d.fillRect(99 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 152 + y, 1, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 1);
        g2d.fillRect(110 + x, 157 + y, 1, 1);
        g2d.fillRect(111 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 160 + y, 1, 2);
        g2d.fillRect(110 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 166 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 110, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 131 + y, 1, 4);
        g2d.fillRect(101 + x, 136 + y, 1, 4);
        g2d.fillRect(98 + x, 137 + y, 1, 2);
        g2d.fillRect(100 + x, 139 + y, 1, 2);
        g2d.fillRect(106 + x, 141 + y, 1, 3);
        g2d.fillRect(97 + x, 142 + y, 1, 2);
        g2d.fillRect(96 + x, 145 + y, 1, 1);
        g2d.fillRect(99 + x, 148 + y, 1, 1);
        g2d.fillRect(104 + x, 152 + y, 1, 3);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(109 + x, 161 + y, 2, 1);
        g2d.fillRect(109 + x, 163 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 113, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 123 + y, 1, 2);
        g2d.fillRect(107 + x, 132 + y, 1, 8);
        g2d.fillRect(102 + x, 139 + y, 1, 2);
        g2d.fillRect(100 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 150 + y, 1, 1);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 153 + y, 1, 1);
        g2d.fillRect(96 + x, 155 + y, 1, 1);
        g2d.fillRect(92 + x, 160 + y, 1, 2);
        g2d.fillRect(93 + x, 160 + y, 1, 2);
        g2d.fillRect(94 + x, 160 + y, 1, 1);
        g2d.fillRect(91 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 111, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 124 + y, 1, 2);
        g2d.fillRect(102 + x, 127 + y, 1, 4);
        g2d.fillRect(101 + x, 142 + y, 1, 2);
        g2d.fillRect(100 + x, 145 + y, 1, 1);
        g2d.fillRect(96 + x, 146 + y, 1, 1);
        g2d.fillRect(105 + x, 148 + y, 1, 1);
        g2d.fillRect(99 + x, 149 + y, 1, 1);
        g2d.fillRect(98 + x, 151 + y, 1, 1);
        g2d.fillRect(102 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 151 + y, 1, 1);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(104 + x, 155 + y, 1, 1);
        g2d.fillRect(103 + x, 157 + y, 1, 2);
        g2d.fillRect(109 + x, 160 + y, 2, 1);
        g2d.fillRect(109 + x, 164 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 108, 184, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 145 + y, 1, 1);
        g2d.fillRect(95 + x, 153 + y, 1, 1);
        g2d.fillRect(94 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 118, 175, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 121 + y, 1, 2);
        g2d.fillRect(107 + x, 124 + y, 1, 2);
        g2d.fillRect(109 + x, 138 + y, 1, 4);
        g2d.fillRect(102 + x, 141 + y, 1, 3);
        g2d.fillRect(101 + x, 145 + y, 1, 1);
        g2d.fillRect(109 + x, 145 + y, 1, 1);
        g2d.fillRect(108 + x, 146 + y, 1, 1);
        g2d.fillRect(103 + x, 147 + y, 1, 1);
        g2d.fillRect(100 + x, 148 + y, 1, 1);
        g2d.fillRect(99 + x, 153 + y, 1, 2);
        g2d.fillRect(111 + x, 154 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(98 + x, 158 + y, 1, 1);
        g2d.fillRect(113 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 117, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 123 + y, 1, 2);
        g2d.fillRect(109 + x, 142 + y, 1, 3);
        g2d.fillRect(97 + x, 146 + y, 1, 1);
        g2d.fillRect(95 + x, 147 + y, 1, 1);
        g2d.fillRect(95 + x, 151 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 5);
        g2d.fillRect(111 + x, 155 + y, 1, 4);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(113 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 121 + y, 1, 2);
        g2d.fillRect(110 + x, 123 + y, 1, 2);
        g2d.fillRect(110 + x, 129 + y, 1, 2);
        g2d.fillRect(111 + x, 144 + y, 1, 4);
        g2d.fillRect(103 + x, 146 + y, 1, 1);
        g2d.fillRect(108 + x, 149 + y, 1, 1);
        g2d.fillRect(111 + x, 149 + y, 1, 4);
        g2d.fillRect(107 + x, 152 + y, 1, 1);
        g2d.fillRect(107 + x, 156 + y, 1, 1);
        g2d.fillRect(105 + x, 161 + y, 1, 2);
        g2d.fillRect(116 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 142 + y, 1, 2);
        g2d.fillRect(121 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 114, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 131 + y, 1, 2);
        g2d.fillRect(107 + x, 140 + y, 1, 4);
        g2d.fillRect(103 + x, 148 + y, 1, 1);
        g2d.fillRect(90 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 155 + y, 1, 1);
        g2d.fillRect(107 + x, 158 + y, 1, 1);
        g2d.fillRect(110 + x, 158 + y, 1, 2);
        g2d.fillRect(94 + x, 161 + y, 1, 1);
        g2d.fillRect(96 + x, 162 + y, 2, 1);
        g2d.fillRect(110 + x, 163 + y, 1, 2);
        g2d.fillRect(111 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 121 + y, 1, 2);
        g2d.fillRect(102 + x, 145 + y, 1, 1);
        g2d.fillRect(112 + x, 151 + y, 1, 1);
        g2d.fillRect(107 + x, 153 + y, 2, 1);
        g2d.fillRect(113 + x, 153 + y, 1, 3);
        g2d.fillRect(107 + x, 155 + y, 1, 1);
        g2d.fillRect(116 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 120, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 120 + y, 1, 2);
        g2d.fillRect(110 + x, 125 + y, 1, 4);
        g2d.fillRect(110 + x, 139 + y, 1, 2);
        g2d.fillRect(109 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(108 + x, 148 + y, 1, 1);
        g2d.fillRect(111 + x, 148 + y, 1, 1);
        g2d.fillRect(102 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 152 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 112, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 121 + y, 1, 2);
        g2d.fillRect(103 + x, 126 + y, 1, 6);
        g2d.fillRect(102 + x, 135 + y, 1, 4);
        g2d.fillRect(106 + x, 144 + y, 1, 4);
        g2d.fillRect(100 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 154 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 1);
        g2d.fillRect(92 + x, 159 + y, 1, 1);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(96 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 131, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 120 + y, 1, 8);
        g2d.fillRect(119 + x, 132 + y, 1, 2);
        g2d.fillRect(120 + x, 139 + y, 1, 2);
        g2d.fillRect(121 + x, 147 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 119, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 122 + y, 1, 2);
        g2d.fillRect(106 + x, 123 + y, 1, 4);
        g2d.fillRect(110 + x, 137 + y, 1, 2);
        g2d.fillRect(102 + x, 144 + y, 1, 1);
        g2d.fillRect(101 + x, 146 + y, 1, 2);
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(108 + x, 147 + y, 1, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 2);
        g2d.fillRect(90 + x, 156 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 165 + y, 1, 1);
        g2d.fillRect(103 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 126, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 128 + y, 1, 10);
        g2d.fillRect(114 + x, 139 + y, 1, 2);
        g2d.fillRect(117 + x, 142 + y, 1, 4);
        g2d.fillRect(118 + x, 148 + y, 1, 3);
        g2d.fillRect(120 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 122, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 131 + y, 1, 6);
        g2d.fillRect(103 + x, 145 + y, 1, 1);
        g2d.fillRect(112 + x, 145 + y, 1, 6);
        g2d.fillRect(94 + x, 151 + y, 1, 1);
        g2d.fillRect(101 + x, 151 + y, 1, 1);
        g2d.fillRect(112 + x, 152 + y, 1, 1);
        g2d.fillRect(113 + x, 156 + y, 1, 1);
        g2d.fillRect(105 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 162 + y, 1, 2);
        g2d.fillRect(104 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 124, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 144 + y, 1, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 1);
        g2d.fillRect(115 + x, 152 + y, 1, 1);
        g2d.fillRect(107 + x, 154 + y, 1, 1);
        g2d.fillRect(115 + x, 155 + y, 1, 3);
        g2d.fillRect(106 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 125, 169, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 117 + y, 1, 4);
        g2d.fillRect(108 + x, 119 + y, 1, 2);
        g2d.fillRect(111 + x, 120 + y, 1, 2);
        g2d.fillRect(113 + x, 138 + y, 1, 2);
        g2d.fillRect(114 + x, 141 + y, 1, 4);
        g2d.fillRect(115 + x, 144 + y, 1, 5);
        g2d.fillRect(116 + x, 147 + y, 1, 3);
        g2d.fillRect(108 + x, 150 + y, 1, 3);
        g2d.fillRect(116 + x, 152 + y, 1, 5);
        g2d.fillRect(115 + x, 153 + y, 1, 2);
        g2d.fillRect(117 + x, 155 + y, 1, 2);
        g2d.fillRect(116 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 127, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 115 + y, 1, 3);
        g2d.fillRect(114 + x, 117 + y, 1, 22);
        g2d.fillRect(107 + x, 118 + y, 1, 2);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(116 + x, 127 + y, 1, 2);
        g2d.fillRect(117 + x, 136 + y, 1, 6);
        g2d.fillRect(118 + x, 144 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 1);
        g2d.fillRect(119 + x, 152 + y, 1, 4);
        g2d.fillRect(120 + x, 157 + y, 1, 1);
        g2d.fillRect(120 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 116, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 157 + y, 1, 1);
        g2d.fillRect(107 + x, 157 + y, 1, 1);
        g2d.fillRect(103 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 136 + y, 1, 10);
        g2d.fillRect(122 + x, 139 + y, 1, 2);
        g2d.fillRect(124 + x, 147 + y, 1, 2);
        g2d.fillRect(126 + x, 159 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 135, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 127 + y, 1, 12);
        g2d.fillRect(122 + x, 141 + y, 1, 3);
        g2d.fillRect(124 + x, 155 + y, 1, 2);
        g2d.fillRect(125 + x, 157 + y, 1, 6);
        g2d.fillRect(122 + x, 162 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 116 + y, 1, 2);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 2);
        g2d.fillRect(115 + x, 118 + y, 1, 4);
        g2d.fillRect(110 + x, 119 + y, 1, 2);
        g2d.fillRect(118 + x, 141 + y, 1, 3);
        g2d.fillRect(119 + x, 144 + y, 1, 2);
        g2d.fillRect(120 + x, 146 + y, 1, 3);
        g2d.fillRect(120 + x, 156 + y, 1, 1);
        g2d.fillRect(120 + x, 158 + y, 1, 1);
        g2d.fillRect(121 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 133, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 128 + y, 1, 4);
        g2d.fillRect(120 + x, 133 + y, 1, 6);
        g2d.fillRect(122 + x, 149 + y, 1, 3);
        g2d.fillRect(123 + x, 153 + y, 1, 4);
        g2d.fillRect(124 + x, 157 + y, 1, 5);
        g2d.fillRect(122 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 131, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 112 + y, 2, 1);
        g2d.fillRect(118 + x, 113 + y, 1, 20);
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(119 + x, 134 + y, 1, 8);
        g2d.fillRect(120 + x, 141 + y, 1, 5);
        g2d.fillRect(121 + x, 149 + y, 1, 4);
        g2d.fillRect(122 + x, 152 + y, 1, 6);
        g2d.fillRect(123 + x, 157 + y, 1, 3);
        g2d.fillRect(123 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 126, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 138, 157, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(129 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 159 + y, 1, 1);
        g2d.fillRect(118 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 139, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 145 + y, 1, 2);
        g2d.fillRect(127 + x, 160 + y, 1, 2);
        g2d.fillRect(128 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 120, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 133, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 125, 175, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 111, 189, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 163 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 116, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 154 + y, 1, 1);
        g2d.fillRect(94 + x, 155 + y, 1, 1);
        g2d.fillRect(98 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 130, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 156 + y, 1, 1);
        g2d.fillRect(119 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(104 + x, 156 + y, 1, 2);
        g2d.fillRect(113 + x, 162 + y, 1, 1);
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(111 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 133, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 159 + y, 1, 1);
        g2d.fillRect(119 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 144, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 151 + y, 1, 1);
        g2d.fillRect(130 + x, 155 + y, 1, 1);
        g2d.fillRect(131 + x, 156 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 130, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 152 + y, 1, 1);
        g2d.fillRect(105 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 185, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 159 + y, 1, 1);
        g2d.fillRect(98 + x, 160 + y, 1, 1);
        g2d.fillRect(97 + x, 161 + y, 1, 1);
        g2d.fillRect(113 + x, 164 + y, 1, 1);
        g2d.fillRect(103 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 139, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 150 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 1);
        g2d.fillRect(119 + x, 158 + y, 1, 1);
        g2d.fillRect(120 + x, 162 + y, 1, 1);
        g2d.fillRect(120 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 196, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 149 + y, 1, 2);
        g2d.fillRect(103 + x, 152 + y, 1, 1);
        g2d.fillRect(102 + x, 155 + y, 1, 1);
        g2d.fillRect(101 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 146 + y, 1, 1);
        g2d.fillRect(104 + x, 148 + y, 1, 1);
        g2d.fillRect(103 + x, 150 + y, 1, 1);
        g2d.fillRect(100 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 125, 193, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 156 + y, 1, 1);
        g2d.fillRect(108 + x, 158 + y, 1, 6);
        g2d.fillRect(107 + x, 162 + y, 1, 5);
        g2d.fillRect(106 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 127, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 135 + y, 1, 6);
        g2d.fillRect(103 + x, 149 + y, 1, 1);
        g2d.fillRect(105 + x, 150 + y, 1, 1);
        g2d.fillRect(100 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 157 + y, 1, 1);
        g2d.fillRect(106 + x, 161 + y, 1, 2);
        g2d.fillRect(108 + x, 164 + y, 1, 1);
        g2d.fillRect(106 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 150, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(127 + x, 153 + y, 1, 1);
        g2d.fillRect(128 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 130, 190, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 129 + y, 1, 4);
        g2d.fillRect(107 + x, 130 + y, 1, 2);
        g2d.fillRect(105 + x, 142 + y, 1, 2);
        g2d.fillRect(99 + x, 144 + y, 1, 1);
        g2d.fillRect(101 + x, 144 + y, 1, 1);
        g2d.fillRect(104 + x, 146 + y, 1, 1);
        g2d.fillRect(108 + x, 156 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 1);
        g2d.fillRect(99 + x, 159 + y, 1, 1);
        g2d.fillRect(106 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 184, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 144 + y, 1, 1);
        g2d.fillRect(95 + x, 150 + y, 1, 1);
        g2d.fillRect(109 + x, 152 + y, 1, 1);
        g2d.fillRect(106 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 158 + y, 1, 1);
        g2d.fillRect(97 + x, 159 + y, 1, 1);
        g2d.fillRect(115 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 163 + y, 1, 2);
        g2d.fillRect(116 + x, 163 + y, 1, 3);
        g2d.fillRect(115 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 133, 188, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(100 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 135, 186, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 140 + y, 1, 2);
        g2d.fillRect(110 + x, 141 + y, 1, 7);
        g2d.fillRect(104 + x, 145 + y, 1, 1);
        g2d.fillRect(106 + x, 150 + y, 1, 1);
        g2d.fillRect(110 + x, 151 + y, 1, 1);
        g2d.fillRect(109 + x, 153 + y, 1, 1);
        g2d.fillRect(108 + x, 154 + y, 1, 1);
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(115 + x, 161 + y, 1, 3);
        g2d.fillRect(114 + x, 162 + y, 1, 1);
        g2d.fillRect(113 + x, 163 + y, 1, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 2);
        g2d.fillRect(115 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 139, 183, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 124 + y, 1, 6);
        g2d.fillRect(116 + x, 141 + y, 1, 3);
        g2d.fillRect(111 + x, 142 + y, 1, 2);
        g2d.fillRect(115 + x, 158 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 141, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 117 + y, 1, 4);
        g2d.fillRect(112 + x, 127 + y, 1, 2);
        g2d.fillRect(105 + x, 134 + y, 1, 2);
        g2d.fillRect(112 + x, 139 + y, 1, 2);
        g2d.fillRect(113 + x, 140 + y, 1, 4);
        g2d.fillRect(115 + x, 142 + y, 1, 2);
        g2d.fillRect(114 + x, 145 + y, 1, 3);
        g2d.fillRect(116 + x, 145 + y, 1, 2);
        g2d.fillRect(117 + x, 147 + y, 1, 1);
        g2d.fillRect(109 + x, 148 + y, 1, 3);
        g2d.fillRect(114 + x, 149 + y, 1, 1);
        g2d.fillRect(118 + x, 151 + y, 1, 2);
        g2d.fillRect(117 + x, 152 + y, 1, 3);
        g2d.fillRect(118 + x, 155 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 145, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 2);
        g2d.fillRect(115 + x, 126 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 141, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 121 + y, 1, 2);
        g2d.fillRect(111 + x, 122 + y, 1, 2);
        g2d.fillRect(111 + x, 130 + y, 1, 12);
        g2d.fillRect(105 + x, 132 + y, 1, 2);
        g2d.fillRect(105 + x, 136 + y, 1, 2);
        g2d.fillRect(116 + x, 139 + y, 1, 2);
        g2d.fillRect(112 + x, 141 + y, 1, 3);
        g2d.fillRect(109 + x, 147 + y, 1, 1);
        g2d.fillRect(114 + x, 148 + y, 1, 1);
        g2d.fillRect(114 + x, 150 + y, 1, 3);
        g2d.fillRect(109 + x, 151 + y, 1, 1);
        g2d.fillRect(117 + x, 165 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 143, 180, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 128 + y, 1, 12);
        g2d.fillRect(116 + x, 129 + y, 1, 10);
        g2d.fillRect(117 + x, 146 + y, 1, 1);
        g2d.fillRect(118 + x, 153 + y, 1, 2);
        g2d.fillRect(119 + x, 156 + y, 1, 1);
        g2d.fillRect(119 + x, 159 + y, 1, 1);
        g2d.fillRect(106 + x, 166 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 127, 197, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 152 + y, 1, 1);
        g2d.fillRect(102 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 147, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 124 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 136, 189, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 150 + y, 1, 1);
        g2d.fillRect(101 + x, 155 + y, 1, 1);
        g2d.fillRect(96 + x, 160 + y, 1, 1);
        g2d.fillRect(114 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 154, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 155 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 146, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 157 + y, 1, 1);
        g2d.fillRect(119 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 142, 191, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 155 + y, 1, 1);
        g2d.fillRect(89 + x, 158 + y, 1, 1);
        g2d.fillRect(98 + x, 159 + y, 1, 1);
        g2d.fillRect(104 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 161, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(127 + x, 152 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 142, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 149, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 153 + y, 1, 1);
        g2d.fillRect(100 + x, 154 + y, 1, 1);
        g2d.fillRect(105 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 155, 188, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 149 + y, 1, 1);
        g2d.fillRect(116 + x, 150 + y, 1, 1);
        g2d.fillRect(115 + x, 151 + y, 1, 1);
        g2d.fillRect(89 + x, 157 + y, 1, 1);
        g2d.fillRect(116 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 164, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(131 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 167, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 145, 207, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 144 + y, 1, 2);
        g2d.fillRect(104 + x, 147 + y, 1, 1);
        g2d.fillRect(103 + x, 151 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 148, 205, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 156 + y, 1, 1);
        g2d.fillRect(107 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 151, 203, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 133 + y, 1, 2);
        g2d.fillRect(109 + x, 155 + y, 1, 1);
        g2d.fillRect(109 + x, 157 + y, 1, 1);
        g2d.fillRect(107 + x, 159 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 155, 200, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 150 + y, 1, 1);
        g2d.fillRect(101 + x, 154 + y, 1, 1);
        g2d.fillRect(109 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 159, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 138 + y, 1, 2);
        g2d.fillRect(110 + x, 148 + y, 1, 2);
        g2d.fillRect(97 + x, 160 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 161, 196, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 144 + y, 1, 1);
        g2d.fillRect(113 + x, 147 + y, 1, 6);
        g2d.fillRect(100 + x, 153 + y, 1, 1);
        g2d.fillRect(114 + x, 153 + y, 1, 5);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 163, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 123 + y, 1, 4);
        g2d.fillRect(112 + x, 129 + y, 1, 10);
        g2d.fillRect(115 + x, 140 + y, 1, 2);
        g2d.fillRect(113 + x, 144 + y, 1, 3);
        g2d.fillRect(117 + x, 148 + y, 1, 4);
        g2d.fillRect(118 + x, 158 + y, 1, 1);
        g2d.fillRect(120 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 150, 210, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 163, 202, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 153 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 167, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 159 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 164, 208, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 153 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 172, 204, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 149 + y, 1, 1);
        g2d.fillRect(119 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 183, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(127 + x, 151 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 182, 207, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 151 + y, 1, 1);
        g2d.fillRect(106 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 177, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 144 + y, 1, 1);
        g2d.fillRect(106 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 192, 202, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(128 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 180, 216, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 154 + y, 2, 1);
        g2d.fillRect(103 + x, 164 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 198, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 207, 215, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 213, 220, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(130 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 225, 236, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 157 + y, 1, 1);
        g2d.fillRect(119 + x, 163 + y, 1, 1);
        g2d.fillRect(102 + x, 164 + y, 1, 1);
    }

    public void paintLL1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 109 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 96 + y, 1, 8);
        g2d.fillRect(122 + x, 97 + y, 1, 12);
        g2d.fillRect(123 + x, 97 + y, 1, 1);
        g2d.fillRect(125 + x, 107 + y, 1, 2);
        g2d.fillRect(125 + x, 114 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 98 + y, 1, 1);
        g2d.fillRect(124 + x, 112 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 87, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 100 + y, 1, 7);
        g2d.fillRect(126 + x, 107 + y, 1, 5);
        g2d.fillRect(127 + x, 111 + y, 1, 3);
        g2d.fillRect(128 + x, 113 + y, 1, 3);
        g2d.fillRect(129 + x, 115 + y, 1, 2);
        g2d.fillRect(126 + x, 116 + y, 1, 2);
        g2d.fillRect(127 + x, 117 + y, 1, 1);
        g2d.fillRect(130 + x, 117 + y, 1, 3);
        g2d.fillRect(128 + x, 118 + y, 2, 1);
        g2d.fillRect(131 + x, 118 + y, 2, 1);
        g2d.fillRect(133 + x, 119 + y, 1, 1);
        g2d.fillRect(131 + x, 120 + y, 2, 1);
        g2d.fillRect(135 + x, 120 + y, 1, 1);
        g2d.fillRect(133 + x, 121 + y, 1, 3);
        g2d.fillRect(136 + x, 121 + y, 1, 2);
        g2d.fillRect(134 + x, 123 + y, 1, 4);
        g2d.fillRect(137 + x, 123 + y, 1, 1);
        g2d.fillRect(138 + x, 124 + y, 1, 2);
        g2d.fillRect(139 + x, 126 + y, 1, 4);
        g2d.fillRect(133 + x, 129 + y, 1, 3);
        g2d.fillRect(137 + x, 130 + y, 2, 1);
        g2d.fillRect(132 + x, 131 + y, 1, 1);
        g2d.fillRect(134 + x, 131 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 92, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 127 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 98, 124, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 99 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 111, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(127 + x, 116 + y, 2, 1);
        g2d.fillRect(128 + x, 117 + y, 2, 1);
        g2d.fillRect(131 + x, 119 + y, 2, 1);
        g2d.fillRect(133 + x, 120 + y, 1, 1);
        g2d.fillRect(138 + x, 129 + y, 1, 1);
        g2d.fillRect(134 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 112, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 114, 138, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 129 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 121, 143, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 129 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 104 + y, 1, 3);
        g2d.fillRect(123 + x, 106 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 149, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 108 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 125, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 114 + y, 1, 2);
        g2d.fillRect(127 + x, 114 + y, 1, 2);
        g2d.fillRect(134 + x, 120 + y, 1, 3);
        g2d.fillRect(135 + x, 121 + y, 1, 3);
        g2d.fillRect(138 + x, 127 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 126, 148, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(138 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 132, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 127 + y, 1, 1);
        g2d.fillRect(136 + x, 129 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 107 + y, 1, 3);
        g2d.fillRect(125 + x, 109 + y, 1, 1);
        g2d.fillRect(125 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 139, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 112 + y, 1, 2);
        g2d.fillRect(136 + x, 123 + y, 1, 2);
        g2d.fillRect(135 + x, 124 + y, 1, 1);
        g2d.fillRect(137 + x, 124 + y, 1, 1);
        g2d.fillRect(138 + x, 126 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 141, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 150, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 127 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 154, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 110 + y, 1, 2);
        g2d.fillRect(125 + x, 110 + y, 1, 3);
        g2d.fillRect(137 + x, 125 + y, 1, 2);
        g2d.fillRect(136 + x, 127 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 161, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 164, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 125 + y, 1, 1);
        g2d.fillRect(135 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 175, 188, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 126 + y, 2, 1);
        g2d.fillRect(136 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 198, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 125 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 213, 220, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 129 + y, 1, 1);
    }

    public void paintLL2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 110 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 96 + y, 1, 8);
        g2d.fillRect(122 + x, 97 + y, 1, 13);
        g2d.fillRect(123 + x, 97 + y, 1, 1);
        g2d.fillRect(125 + x, 108 + y, 1, 2);
        g2d.fillRect(125 + x, 114 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 98 + y, 1, 1);
        g2d.fillRect(124 + x, 113 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 87, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 100 + y, 1, 8);
        g2d.fillRect(126 + x, 108 + y, 1, 5);
        g2d.fillRect(127 + x, 112 + y, 1, 2);
        g2d.fillRect(128 + x, 113 + y, 1, 3);
        g2d.fillRect(129 + x, 115 + y, 1, 2);
        g2d.fillRect(126 + x, 116 + y, 1, 2);
        g2d.fillRect(127 + x, 117 + y, 1, 1);
        g2d.fillRect(130 + x, 117 + y, 1, 3);
        g2d.fillRect(128 + x, 118 + y, 2, 1);
        g2d.fillRect(131 + x, 118 + y, 2, 1);
        g2d.fillRect(133 + x, 119 + y, 1, 1);
        g2d.fillRect(131 + x, 120 + y, 1, 1);
        g2d.fillRect(134 + x, 120 + y, 1, 1);
        g2d.fillRect(132 + x, 121 + y, 1, 1);
        g2d.fillRect(135 + x, 121 + y, 1, 1);
        g2d.fillRect(133 + x, 122 + y, 1, 3);
        g2d.fillRect(136 + x, 122 + y, 1, 2);
        g2d.fillRect(134 + x, 124 + y, 1, 6);
        g2d.fillRect(137 + x, 124 + y, 1, 1);
        g2d.fillRect(138 + x, 125 + y, 1, 2);
        g2d.fillRect(139 + x, 127 + y, 1, 5);
        g2d.fillRect(133 + x, 131 + y, 1, 3);
        g2d.fillRect(137 + x, 132 + y, 2, 1);
        g2d.fillRect(132 + x, 133 + y, 1, 1);
        g2d.fillRect(134 + x, 133 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 98, 124, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 99 + y, 1, 8);
        g2d.fillRect(124 + x, 104 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 111, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(127 + x, 116 + y, 2, 1);
        g2d.fillRect(128 + x, 117 + y, 2, 1);
        g2d.fillRect(131 + x, 119 + y, 2, 1);
        g2d.fillRect(132 + x, 120 + y, 2, 1);
        g2d.fillRect(133 + x, 121 + y, 1, 1);
        g2d.fillRect(138 + x, 131 + y, 1, 1);
        g2d.fillRect(134 + x, 132 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 112, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 132 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 114, 138, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 131 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 121, 143, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 131 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 105 + y, 1, 3);
        g2d.fillRect(123 + x, 107 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 149, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 125, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 114 + y, 1, 2);
        g2d.fillRect(127 + x, 114 + y, 1, 2);
        g2d.fillRect(134 + x, 121 + y, 1, 3);
        g2d.fillRect(135 + x, 122 + y, 1, 3);
        g2d.fillRect(138 + x, 129 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 126, 148, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(138 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 132, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 131 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 108 + y, 1, 3);
        g2d.fillRect(125 + x, 110 + y, 1, 1);
        g2d.fillRect(125 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 139, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 113 + y, 1, 1);
        g2d.fillRect(136 + x, 124 + y, 1, 2);
        g2d.fillRect(135 + x, 125 + y, 1, 1);
        g2d.fillRect(137 + x, 125 + y, 1, 1);
        g2d.fillRect(138 + x, 127 + y, 1, 2);
        g2d.fillRect(135 + x, 129 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 141, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 154, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 111 + y, 1, 2);
        g2d.fillRect(125 + x, 111 + y, 1, 2);
        g2d.fillRect(137 + x, 126 + y, 1, 1);
        g2d.fillRect(137 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 161, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 132 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 164, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 126 + y, 1, 1);
        g2d.fillRect(135 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 167, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 127 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 175, 188, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 127 + y, 1, 1);
        g2d.fillRect(135 + x, 128 + y, 2, 1);
        g2d.fillRect(136 + x, 130 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 192, 202, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 127 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 198, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 126 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 213, 220, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 131 + y, 1, 1);
    }

    public void paintLL3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 111 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 96 + y, 1, 8);
        g2d.fillRect(122 + x, 97 + y, 1, 14);
        g2d.fillRect(123 + x, 97 + y, 1, 1);
        g2d.fillRect(125 + x, 109 + y, 1, 2);
        g2d.fillRect(125 + x, 116 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 98 + y, 1, 1);
        g2d.fillRect(124 + x, 114 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 87, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(125 + x, 100 + y, 1, 9);
        g2d.fillRect(126 + x, 109 + y, 1, 5);
        g2d.fillRect(127 + x, 113 + y, 1, 3);
        g2d.fillRect(128 + x, 115 + y, 1, 3);
        g2d.fillRect(129 + x, 117 + y, 1, 2);
        g2d.fillRect(126 + x, 118 + y, 1, 2);
        g2d.fillRect(127 + x, 119 + y, 1, 1);
        g2d.fillRect(130 + x, 119 + y, 1, 3);
        g2d.fillRect(128 + x, 120 + y, 2, 1);
        g2d.fillRect(131 + x, 120 + y, 2, 1);
        g2d.fillRect(133 + x, 121 + y, 1, 1);
        g2d.fillRect(131 + x, 122 + y, 1, 1);
        g2d.fillRect(134 + x, 122 + y, 1, 1);
        g2d.fillRect(132 + x, 123 + y, 1, 1);
        g2d.fillRect(135 + x, 123 + y, 1, 1);
        g2d.fillRect(133 + x, 124 + y, 1, 3);
        g2d.fillRect(136 + x, 124 + y, 1, 2);
        g2d.fillRect(134 + x, 126 + y, 1, 6);
        g2d.fillRect(137 + x, 126 + y, 1, 1);
        g2d.fillRect(138 + x, 127 + y, 1, 2);
        g2d.fillRect(139 + x, 129 + y, 1, 7);
        g2d.fillRect(133 + x, 134 + y, 1, 3);
        g2d.fillRect(137 + x, 135 + y, 2, 1);
        g2d.fillRect(132 + x, 136 + y, 1, 1);
        g2d.fillRect(134 + x, 136 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 92, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 132 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 98, 124, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 133 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 99 + y, 1, 9);
        g2d.fillRect(124 + x, 104 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 111, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(127 + x, 118 + y, 2, 1);
        g2d.fillRect(128 + x, 119 + y, 2, 1);
        g2d.fillRect(131 + x, 121 + y, 2, 1);
        g2d.fillRect(132 + x, 122 + y, 2, 1);
        g2d.fillRect(133 + x, 123 + y, 1, 1);
        g2d.fillRect(138 + x, 134 + y, 1, 1);
        g2d.fillRect(134 + x, 135 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 112, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 135 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 114, 138, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(134 + x, 134 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 121, 143, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 134 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 106 + y, 1, 3);
        g2d.fillRect(123 + x, 108 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 149, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 125, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 116 + y, 1, 2);
        g2d.fillRect(127 + x, 116 + y, 1, 2);
        g2d.fillRect(134 + x, 123 + y, 1, 3);
        g2d.fillRect(135 + x, 124 + y, 1, 3);
        g2d.fillRect(138 + x, 131 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 126, 148, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(138 + x, 133 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 132, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 132 + y, 1, 1);
        g2d.fillRect(136 + x, 134 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 109 + y, 1, 3);
        g2d.fillRect(125 + x, 111 + y, 1, 1);
        g2d.fillRect(125 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 139, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 114 + y, 1, 2);
        g2d.fillRect(136 + x, 126 + y, 1, 2);
        g2d.fillRect(135 + x, 127 + y, 1, 1);
        g2d.fillRect(137 + x, 127 + y, 1, 1);
        g2d.fillRect(138 + x, 129 + y, 1, 2);
        g2d.fillRect(135 + x, 131 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 141, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 133 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 150, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 132 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 154, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 112 + y, 1, 2);
        g2d.fillRect(125 + x, 112 + y, 1, 3);
        g2d.fillRect(137 + x, 128 + y, 1, 1);
        g2d.fillRect(137 + x, 130 + y, 1, 1);
        g2d.fillRect(136 + x, 132 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 161, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 135 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 164, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 128 + y, 1, 1);
        g2d.fillRect(135 + x, 133 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 167, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 129 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 175, 188, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(137 + x, 129 + y, 1, 1);
        g2d.fillRect(135 + x, 130 + y, 2, 1);
        g2d.fillRect(136 + x, 133 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 192, 202, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 129 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 198, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(136 + x, 128 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 213, 220, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(135 + x, 134 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(124 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 86 + y, 1, 4);
        g2d.fillRect(123 + x, 91 + y, 1, 1);
        g2d.fillRect(123 + x, 93 + y, 1, 3);
        g2d.fillRect(122 + x, 97 + y, 1, 1);
        g2d.fillRect(95 + x, 105 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 60 + y, 1, 10);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(125 + x, 80 + y, 1, 4);
        g2d.fillRect(125 + x, 88 + y, 1, 6);
        g2d.fillRect(124 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 81, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(124 + x, 79 + y, 1, 3);
        g2d.fillRect(124 + x, 83 + y, 1, 3);
        g2d.fillRect(124 + x, 87 + y, 1, 2);
        g2d.fillRect(124 + x, 91 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 3);
        g2d.fillRect(123 + x, 96 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 119, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(123 + x, 78 + y, 1, 2);
        g2d.fillRect(99 + x, 80 + y, 1, 1);
        g2d.fillRect(123 + x, 84 + y, 1, 2);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 5);
        g2d.fillRect(121 + x, 91 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 79, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 4);
        g2d.fillRect(97 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 104 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 77, 125, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 81, 122, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 74 + y, 1, 1);
        g2d.fillRect(122 + x, 75 + y, 1, 10);
        g2d.fillRect(121 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 3);
        g2d.fillRect(120 + x, 99 + y, 1, 5);
        g2d.fillRect(121 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 75, 128, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 75 + y, 2, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 87, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(126 + x, 83 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 77, 127, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 59 + y, 9, 1);
        g2d.fillRect(119 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 4);
        g2d.fillRect(119 + x, 78 + y, 1, 3);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 5);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 79, 125, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 74 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(95 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 2);
        g2d.fillRect(96 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 73, 132, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 71, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 62 + y, 1, 7);
        g2d.fillRect(111 + x, 83 + y, 2, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 2, 1);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(108 + x, 115 + y, 1, 1);
        g2d.fillRect(103 + x, 117 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 75, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(97 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(95 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 69, 138, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 2, 1);
        g2d.fillRect(102 + x, 91 + y, 2, 1);
        g2d.fillRect(95 + x, 94 + y, 1, 1);
        g2d.fillRect(107 + x, 97 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(111 + x, 106 + y, 1, 1);
        g2d.fillRect(95 + x, 108 + y, 1, 1);
        g2d.fillRect(110 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 68, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 68 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(109 + x, 108 + y, 1, 1);
        g2d.fillRect(95 + x, 109 + y, 1, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(108 + x, 114 + y, 1, 1);
        g2d.fillRect(107 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 66, 142, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(96 + x, 105 + y, 1, 1);
        g2d.fillRect(95 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 109 + y, 2, 1);
        g2d.fillRect(108 + x, 112 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 65, 144, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(95 + x, 106 + y, 1, 1);
        g2d.fillRect(105 + x, 110 + y, 2, 1);
        g2d.fillRect(106 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 60, 150, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 70 + y, 1, 5);
        g2d.fillRect(99 + x, 81 + y, 1, 1);
        g2d.fillRect(98 + x, 84 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 2);
        g2d.fillRect(102 + x, 112 + y, 1, 1);
        g2d.fillRect(103 + x, 115 + y, 1, 2);
        g2d.fillRect(104 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 117 + y, 1, 2);
        g2d.fillRect(101 + x, 117 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 63, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 82 + y, 1, 2);
        g2d.fillRect(96 + x, 90 + y, 1, 1);
        g2d.fillRect(95 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 111 + y, 2, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 59, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(98 + x, 85 + y, 1, 1);
        g2d.fillRect(97 + x, 118 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 58, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 78 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(97 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(99 + x, 113 + y, 2, 1);
        g2d.fillRect(99 + x, 117 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 80, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 56, 156, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 91 + y, 2, 1);
        g2d.fillRect(97 + x, 100 + y, 1, 2);
        g2d.fillRect(98 + x, 101 + y, 1, 1);
        g2d.fillRect(97 + x, 113 + y, 2, 1);
        g2d.fillRect(98 + x, 116 + y, 2, 1);
        g2d.fillRect(97 + x, 117 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 55, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 100 + y, 1, 3);
        g2d.fillRect(95 + x, 111 + y, 1, 4);
        g2d.fillRect(96 + x, 113 + y, 1, 1);
        g2d.fillRect(94 + x, 117 + y, 3, 1);
        g2d.fillRect(96 + x, 118 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 53, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 92 + y, 1, 1);
        g2d.fillRect(94 + x, 114 + y, 1, 1);
        g2d.fillRect(93 + x, 115 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 92, 131, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 97, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 137, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 83 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(123 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 61 + y, 1, 6);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 3);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(125 + x, 86 + y, 1, 2);
        g2d.fillRect(124 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 144, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 2, 1);
        g2d.fillRect(120 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 97, 148, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(97 + x, 97 + y, 2, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 2);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(97 + x, 108 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 103, 142, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(121 + x, 75 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 99, 146, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 79 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 87, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 61 + y, 1, 7);
        g2d.fillRect(104 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 69 + y, 1, 2);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 2);
        g2d.fillRect(97 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 91, 155, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 101 + y, 2, 1);
        g2d.fillRect(111 + x, 104 + y, 1, 2);
        g2d.fillRect(111 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(122 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 141, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(121 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 79, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 2, 1);
        g2d.fillRect(100 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 89, 157, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(104 + x, 67 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 1);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(110 + x, 106 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 93, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 102 + y, 1, 3);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 95, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 2);
        g2d.fillRect(96 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 106 + y, 1, 1);
        g2d.fillRect(105 + x, 108 + y, 1, 2);
        g2d.fillRect(104 + x, 109 + y, 1, 1);
        g2d.fillRect(96 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(97 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 108 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 87, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 60 + y, 4, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 3);
        g2d.fillRect(106 + x, 61 + y, 1, 6);
        g2d.fillRect(105 + x, 68 + y, 1, 5);
        g2d.fillRect(107 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 106 + y, 1, 4);
        g2d.fillRect(107 + x, 108 + y, 1, 1);
        g2d.fillRect(96 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 80, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 77 + y, 2, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 4);
        g2d.fillRect(100 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 76, 171, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 100 + y, 1, 1);
        g2d.fillRect(96 + x, 111 + y, 2, 1);
        g2d.fillRect(97 + x, 112 + y, 1, 1);
        g2d.fillRect(97 + x, 114 + y, 1, 1);
        g2d.fillRect(94 + x, 115 + y, 1, 2);
        g2d.fillRect(95 + x, 115 + y, 2, 1);
        g2d.fillRect(98 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 75, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 112 + y, 1, 1);
        g2d.fillRect(96 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 78, 169, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 78 + y, 1, 3);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 2, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 2, 1);
        g2d.fillRect(99 + x, 100 + y, 2, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 3);
        g2d.fillRect(99 + x, 110 + y, 1, 3);
        g2d.fillRect(100 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 84, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 108 + y, 1, 1);
        g2d.fillRect(97 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 110 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 82, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 71 + y, 1, 4);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 108 + y, 1, 1);
        g2d.fillRect(102 + x, 110 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 96, 152, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 110, 145, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 88, 180, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(96 + x, 116 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 86, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 92 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 105 + y, 1, 2);
        g2d.fillRect(107 + x, 110 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 94, 175, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 77 + y, 2, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 1);
        g2d.fillRect(102 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 99, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(106 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 92, 177, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 2, 1);
        g2d.fillRect(100 + x, 108 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 90, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(101 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 102 + y, 2, 1);
        g2d.fillRect(95 + x, 116 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 110, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 2, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 2);
        g2d.fillRect(104 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 102, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(110 + x, 102 + y, 1, 1);
        g2d.fillRect(109 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 105 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 106, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 108 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 115, 155, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 2, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 108, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 2);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(96 + x, 106 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 119, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(114 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 2);
        g2d.fillRect(121 + x, 95 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 163, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 1);
        g2d.fillRect(108 + x, 97 + y, 1, 1);
        g2d.fillRect(107 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 100 + y, 1, 3);
        g2d.fillRect(102 + x, 101 + y, 2, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(113 + x, 106 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 149, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 114, 156, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(110 + x, 100 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 111, 159, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 4);
        g2d.fillRect(107 + x, 103 + y, 2, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(101 + x, 106 + y, 1, 2);
        g2d.fillRect(102 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 97, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 106 + y, 1, 2);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 103, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 102 + y, 1, 1);
        g2d.fillRect(110 + x, 103 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 104, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 2);
        g2d.fillRect(98 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 112, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 113, 157, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 70 + y, 1, 3);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 161, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 2, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 98 + y, 1, 1);
        g2d.fillRect(106 + x, 99 + y, 2, 1);
        g2d.fillRect(114 + x, 100 + y, 1, 2);
        g2d.fillRect(114 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 106 + y, 1, 1);
        g2d.fillRect(103 + x, 106 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 100, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(107 + x, 105 + y, 1, 3);
        g2d.fillRect(107 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 117, 153, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 3);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 115, 159, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 110, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 122, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 120, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 126, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 189, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(97 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 115 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 108, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 113 + y, 1, 2);
        g2d.fillRect(104 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 104, 186, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 114 + y, 2, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 116 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 184, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 113 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 115, 177, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 76 + y, 2, 1);
        g2d.fillRect(109 + x, 103 + y, 1, 1);
        g2d.fillRect(108 + x, 110 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 110, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 113, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 108, 184, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 118, 175, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 108 + y, 1, 1);
        g2d.fillRect(110 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 117, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 109 + y, 1, 1);
        g2d.fillRect(109 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 2, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 70 + y, 1, 3);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 114, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 2, 1);
        g2d.fillRect(111 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 2, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 106 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 120, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 106 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 112, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 119, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 100 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 126, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 1);
        g2d.fillRect(104 + x, 104 + y, 2, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 122, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 124, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(99 + x, 106 + y, 1, 1);
        g2d.fillRect(99 + x, 108 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 125, 169, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 65 + y, 1, 2);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
        g2d.fillRect(107 + x, 101 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 1);
        g2d.fillRect(106 + x, 102 + y, 1, 1);
        g2d.fillRect(109 + x, 102 + y, 1, 1);
        g2d.fillRect(105 + x, 103 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 105 + y, 2, 1);
        g2d.fillRect(99 + x, 107 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 127, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 97 + y, 1, 1);
        g2d.fillRect(110 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 1);
        g2d.fillRect(107 + x, 102 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(125 + x, 85 + y, 1, 1);
        g2d.fillRect(124 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 135, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(115 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 2);
        g2d.fillRect(123 + x, 80 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 92 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 68 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 97 + y, 1, 1);
        g2d.fillRect(109 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 133, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 4);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(121 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 131, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 4);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 130, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 133, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 130, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 134, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 84 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 169, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 139, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 121, 196, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 114 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 123, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 114 + y, 1, 3);
        g2d.fillRect(102 + x, 116 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 125, 193, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 142, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 127, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 112 + y, 1, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 130, 190, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(96 + x, 93 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 137, 184, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(97 + x, 94 + y, 2, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 103 + y, 2, 1);
        g2d.fillRect(97 + x, 104 + y, 1, 2);
        g2d.fillRect(98 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(111 + x, 112 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 133, 188, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(109 + x, 111 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 135, 186, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(110 + x, 112 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 139, 183, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 3, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(98 + x, 105 + y, 2, 1);
        g2d.fillRect(113 + x, 108 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 141, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 97 + y, 1, 1);
        g2d.fillRect(109 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 145, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 3);
        g2d.fillRect(112 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 141, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 98 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 2, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(104 + x, 103 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 143, 180, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 3);
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 147, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 70 + y, 1, 3);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 147, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 149, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 2, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 154, 172, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 63 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 146, 182, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 149, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 155, 188, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 93 + y, 2, 1);
        g2d.fillRect(111 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 163, 187, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 145, 207, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 115 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 151, 203, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 112 + y, 1, 1);
        g2d.fillRect(105 + x, 113 + y, 1, 1);
        g2d.fillRect(107 + x, 114 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 155, 200, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 3, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 2);
        g2d.fillRect(109 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 159, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 161, 196, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 2);
        g2d.fillRect(102 + x, 103 + y, 2, 1);
        g2d.fillRect(99 + x, 104 + y, 2, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 163, 195, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 165, 194, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 167, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(120 + x, 76 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 169, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 79 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 172, 189, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(123 + x, 81 + y, 1, 1);
        g2d.fillRect(125 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 167, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 177, 205, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 180, 201, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 185, 205, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(111 + x, 99 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 190, 209, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 191, 216, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 103 + y, 1, 1);
        g2d.fillRect(111 + x, 109 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 198, 213, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254, 216, 229, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 110 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 225, 236, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 88 + y, 1, 1);
    }

    public void paintTU(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 117, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 79, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 77, 125, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 81, 122, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 2, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 77, 127, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 2, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 79, 125, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 2, 1);
        g2d.fillRect(109 + x, 55 + y, 3, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 69, 138, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 68, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 66, 142, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 52 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 65, 144, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 63, 147, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 52 + y, 2, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 135, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 144, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 103, 142, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 99, 146, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 59 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 87, 158, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 91, 155, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 107, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 105, 141, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 53 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 95, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 85, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 83, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 87, 160, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 84, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 53 + y, 1, 4);
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 101, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 99, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 102, 168, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 106, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 119, 151, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 57 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 114, 156, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 111, 159, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 97, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 103, 167, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 104, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 113, 157, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 58 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 109, 161, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 100, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 115, 177, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 54 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 113, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 114, 179, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 120, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 131, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 119, 174, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 124, 170, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 125, 169, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 129, 166, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 133, 162, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 131, 164, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 53 + y, 2, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 143, 180, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 56 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 147, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 54 + y, 2, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 147, 178, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 149, 176, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 165, 193, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 165, 194, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253, 167, 192, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
    }
}
