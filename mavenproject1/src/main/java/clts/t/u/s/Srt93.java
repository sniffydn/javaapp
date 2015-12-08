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
public class Srt93 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt93() {
        super();
        containsTL = true;
    }

    public Srt93(String middle) {
        super(middle);
        containsTL = true;
    }

    public Srt93(String middle, ColorArray colorSwitch) {
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 50 + y, 1, 8);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 51 + y, 1, 5);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 5, 1);
        g2d.fillRect(114 + x, 52 + y, 2, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 2, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 4);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 2, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 4);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 4);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 4);
        g2d.fillRect(113 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 2, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 4);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(117 + x, 44 + y, 1, 2);
        g2d.fillRect(99 + x, 45 + y, 1, 3);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 42 + y, 2, 1);
        g2d.fillRect(120 + x, 43 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 1, 1);
        g2d.fillRect(122 + x, 45 + y, 1, 2);
        g2d.fillRect(123 + x, 47 + y, 1, 5);
        g2d.fillRect(91 + x, 48 + y, 1, 1);
        g2d.fillRect(92 + x, 49 + y, 1, 2);
        g2d.fillRect(93 + x, 51 + y, 1, 5);
        g2d.fillRect(94 + x, 52 + y, 2, 1);
        g2d.fillRect(122 + x, 52 + y, 1, 4);
        g2d.fillRect(92 + x, 53 + y, 1, 3);
        g2d.fillRect(95 + x, 53 + y, 2, 1);
        g2d.fillRect(91 + x, 54 + y, 1, 2);
        g2d.fillRect(96 + x, 54 + y, 2, 1);
        g2d.fillRect(123 + x, 54 + y, 1, 1);
        g2d.fillRect(94 + x, 55 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 2);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(93 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 42 + y, 1, 2);
        g2d.fillRect(97 + x, 42 + y, 1, 4);
        g2d.fillRect(92 + x, 43 + y, 1, 2);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(98 + x, 44 + y, 1, 4);
        g2d.fillRect(120 + x, 44 + y, 1, 1);
        g2d.fillRect(91 + x, 45 + y, 1, 3);
        g2d.fillRect(121 + x, 45 + y, 1, 3);
        g2d.fillRect(92 + x, 48 + y, 1, 1);
        g2d.fillRect(93 + x, 49 + y, 1, 2);
        g2d.fillRect(121 + x, 49 + y, 1, 4);
        g2d.fillRect(95 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 50 + y, 1, 4);
        g2d.fillRect(122 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 1);
        g2d.fillRect(94 + x, 53 + y, 1, 2);
        g2d.fillRect(97 + x, 55 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(93 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 2);
        g2d.fillRect(92 + x, 45 + y, 1, 3);
        g2d.fillRect(94 + x, 45 + y, 2, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(95 + x, 46 + y, 1, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 4);
        g2d.fillRect(94 + x, 47 + y, 1, 5);
        g2d.fillRect(96 + x, 47 + y, 1, 5);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(122 + x, 47 + y, 1, 1);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(121 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(122 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 54 + y, 1, 2);
        g2d.fillRect(96 + x, 55 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(93 + x, 45 + y, 1, 3);
        g2d.fillRect(94 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 3);
        g2d.fillRect(95 + x, 47 + y, 1, 2);
        g2d.fillRect(122 + x, 48 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(41, 41, 41));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(156, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(206, 0, 82));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 57, 173));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 156, 173));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
