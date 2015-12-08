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
public class Srt94 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt94() {
        super();
        containsTL = true;
    }

    public Srt94(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt94(String middle, ColorArray colorSwitch) {
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 52 + y, 3, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 2, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 2, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 2, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(101 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 51 + y, 6, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 5, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 3);
        g2d.fillRect(106 + x, 52 + y, 2, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 52 + y, 1, 6);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 5);
        g2d.fillRect(102 + x, 53 + y, 1, 8);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 2, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 7);
        g2d.fillRect(116 + x, 53 + y, 1, 2);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(106 + x, 54 + y, 1, 6);
        g2d.fillRect(108 + x, 54 + y, 3, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 5);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(99 + x, 55 + y, 1, 4);
        g2d.fillRect(107 + x, 55 + y, 1, 5);
        g2d.fillRect(109 + x, 55 + y, 2, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 4);
        g2d.fillRect(111 + x, 56 + y, 1, 4);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 2, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 3);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 3);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(100 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 3, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 2, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 2, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 3);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 2);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 2, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 2);
        g2d.fillRect(107 + x, 72 + y, 1, 2);
        g2d.fillRect(108 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 2, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 75 + y, 1, 2);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 3);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 2, 1);
        g2d.fillRect(103 + x, 79 + y, 2, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 59 + y, 3, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 3);
        g2d.fillRect(112 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 3, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 12);
        g2d.fillRect(109 + x, 60 + y, 1, 16);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 3);
        g2d.fillRect(116 + x, 60 + y, 1, 14);
        g2d.fillRect(103 + x, 61 + y, 3, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 6);
        g2d.fillRect(114 + x, 61 + y, 1, 5);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 5);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 6);
        g2d.fillRect(110 + x, 63 + y, 2, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 1, 3);
        g2d.fillRect(112 + x, 65 + y, 1, 20);
        g2d.fillRect(105 + x, 66 + y, 1, 10);
        g2d.fillRect(106 + x, 66 + y, 1, 6);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 3);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 3);
        g2d.fillRect(107 + x, 69 + y, 1, 3);
        g2d.fillRect(113 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 4);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 70 + y, 1, 7);
        g2d.fillRect(117 + x, 70 + y, 1, 2);
        g2d.fillRect(118 + x, 71 + y, 1, 4);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 7);
        g2d.fillRect(106 + x, 73 + y, 1, 11);
        g2d.fillRect(110 + x, 73 + y, 1, 3);
        g2d.fillRect(115 + x, 73 + y, 1, 3);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 6);
        g2d.fillRect(108 + x, 74 + y, 1, 7);
        g2d.fillRect(113 + x, 74 + y, 1, 5);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 9);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 5);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 2, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 5);
        g2d.fillRect(103 + x, 78 + y, 3, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 5);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 78 + y, 1, 3);
        g2d.fillRect(105 + x, 79 + y, 1, 5);
        g2d.fillRect(109 + x, 79 + y, 1, 6);
        g2d.fillRect(110 + x, 79 + y, 1, 3);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 5);
        g2d.fillRect(104 + x, 81 + y, 1, 3);
        g2d.fillRect(113 + x, 81 + y, 1, 4);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 2, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 3);
        g2d.fillRect(108 + x, 82 + y, 1, 3);
        g2d.fillRect(117 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 2, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(140, 140, 140));
        COLORS.set(ImageUtilities.GREY_1, new Color(230, 230, 230));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
