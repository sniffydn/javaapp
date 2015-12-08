/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package obsolete;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt96_1 extends SuperTU {

    /** Creates a new instance of GenericClothes */
    public Srt96_1() {
        super();
    }

    public Srt96_1(String middle) {
        super(middle);
    }

    public Srt96_1(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 55 + y, 4, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 3);
        g2d.fillRect(113 + x, 56 + y, 3, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 51 + y, 4, 1);
        g2d.fillRect(118 + x, 51 + y, 3, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 51 + y, 3, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 4, 1);
        g2d.fillRect(105 + x, 56 + y, 3, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 3, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
    }

    public void paintTL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 4);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 66 + y, 4, 1);
        g2d.fillRect(113 + x, 66 + y, 5, 1);
        g2d.fillRect(106 + x, 67 + y, 2, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 2, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 59 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 67 + y, 4, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(153, 153, 153));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(204, 191, 170));
        COLORS.set(ImageUtilities.GREY, new Color(221, 221, 221));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 255));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(102, 31, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(153, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(204, 0, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 0, 0));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 31, 0));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
