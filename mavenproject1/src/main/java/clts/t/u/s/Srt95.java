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
public class Srt95 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt95() {
        super();
        containsTL = true;
    }

    public Srt95(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt95(String middle, ColorArray colorSwitch) {
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(115 + x, 50 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 3);
        g2d.fillRect(116 + x, 52 + y, 2, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 2, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 2, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 2, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 2, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 2, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 53 + y, 2, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 3, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 2, 1);
        g2d.fillRect(119 + x, 55 + y, 2, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 2, 1);
        g2d.fillRect(116 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 2, 1);
        g2d.fillRect(118 + x, 57 + y, 2, 1);
        g2d.fillRect(101 + x, 58 + y, 2, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 54 + y, 2, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 3, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 2, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 48 + y, 1, 4);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 3);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 3);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 2, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 49 + y, 1, 3);
        g2d.fillRect(118 + x, 49 + y, 1, 4);
        g2d.fillRect(102 + x, 51 + y, 1, 4);
        g2d.fillRect(103 + x, 51 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 3);
        g2d.fillRect(101 + x, 52 + y, 1, 3);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 47 + y, 1, 3);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 2, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 2);
        g2d.fillRect(104 + x, 48 + y, 2, 1);
        g2d.fillRect(120 + x, 48 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(121 + x, 49 + y, 1, 3);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 2, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 47 + y, 1, 4);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 4);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 3, 1);
        g2d.fillRect(113 + x, 60 + y, 5, 1);
        g2d.fillRect(111 + x, 61 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 62 + y, 2, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);
        g2d.fillRect(107 + x, 63 + y, 2, 1);
        g2d.fillRect(113 + x, 63 + y, 2, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 2, 1);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 6);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 2, 1);
        g2d.fillRect(107 + x, 66 + y, 2, 1);
        g2d.fillRect(105 + x, 67 + y, 2, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 3, 1);
        g2d.fillRect(111 + x, 62 + y, 2, 1);
        g2d.fillRect(109 + x, 63 + y, 2, 1);
        g2d.fillRect(107 + x, 64 + y, 2, 1);
        g2d.fillRect(105 + x, 65 + y, 2, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 2, 1);
        g2d.fillRect(109 + x, 64 + y, 2, 1);
        g2d.fillRect(107 + x, 65 + y, 2, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 2);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 2, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 3, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 3, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 1, 3);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 2, 1);
        g2d.fillRect(111 + x, 65 + y, 2, 1);
        g2d.fillRect(109 + x, 66 + y, 2, 1);
        g2d.fillRect(113 + x, 66 + y, 2, 1);
        g2d.fillRect(107 + x, 67 + y, 2, 1);
        g2d.fillRect(111 + x, 67 + y, 2, 1);
        g2d.fillRect(105 + x, 68 + y, 2, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 3);
        g2d.fillRect(105 + x, 70 + y, 2, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 42 + y, 2, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 2, 1);
        g2d.fillRect(111 + x, 66 + y, 2, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 2, 1);
        g2d.fillRect(105 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 3);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 2);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 3);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(140, 140, 140));
        COLORS.set(ImageUtilities.GREY_1, new Color(230, 230, 230));
        COLORS.set(ImageUtilities.NEG_GREY_5, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(16, 16, 16));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(33, 33, 33));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(49, 49, 49));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 0, 173));
        COLORS.set(ImageUtilities.GREY, new Color(255, 90, 173));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 123, 173));
        COLORS.set(ImageUtilities.GREY_2, new Color(189, 189, 189));
        COLORS.set(ImageUtilities.GREY_3, new Color(222, 222, 222));
        COLORS.set(ImageUtilities.GREY_4, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
