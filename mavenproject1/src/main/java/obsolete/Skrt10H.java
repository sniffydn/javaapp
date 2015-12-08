/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package obsolete;

import clts.t.u.d.*;
import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Skrt10H extends SuperTU {

    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt10H() {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt10H(String middle) {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt10H(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        paintTL3(x, y + prevY, g2d);
        paintTL1B(x, 0, g2d);

    }
    int prevY = 0;

    public void drawB(int x, int y, GraphicsMap g2d) {
        paintTUB(x, y, g2d);
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

    public void paintTL1B(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 3, 1);
        g2d.fillRect(104 + x, 62 + y, 2, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
    }

    public void paintTL3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(96 + x, 83 + y, 1, 4);
        g2d.fillRect(97 + x, 83 + y, 1, 5);
        g2d.fillRect(124 + x, 83 + y, 1, 7);
        g2d.fillRect(125 + x, 83 + y, 1, 6);
        g2d.fillRect(98 + x, 84 + y, 1, 4);
        g2d.fillRect(126 + x, 84 + y, 1, 3);
        g2d.fillRect(99 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(123 + x, 85 + y, 1, 4);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(127 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 4);
        g2d.fillRect(103 + x, 87 + y, 1, 4);
        g2d.fillRect(110 + x, 87 + y, 1, 3);
        g2d.fillRect(119 + x, 87 + y, 2, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 2);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 3);
        g2d.fillRect(105 + x, 88 + y, 1, 4);
        g2d.fillRect(108 + x, 88 + y, 2, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 5);
        g2d.fillRect(121 + x, 88 + y, 1, 4);
        g2d.fillRect(106 + x, 89 + y, 1, 3);
        g2d.fillRect(122 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(123 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 3);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(97 + x, 89 + y, 3, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 4);
        g2d.fillRect(114 + x, 89 + y, 1, 3);
        g2d.fillRect(98 + x, 90 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 3);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(125 + x, 81 + y, 1, 2);
        g2d.fillRect(124 + x, 82 + y, 1, 1);
        g2d.fillRect(126 + x, 82 + y, 1, 2);
        g2d.fillRect(127 + x, 83 + y, 1, 3);
        g2d.fillRect(128 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(129 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 2);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(126 + x, 87 + y, 2, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 2, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(125 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(128 + x, 87 + y, 2, 1);
        g2d.fillRect(126 + x, 88 + y, 1, 3);
        g2d.fillRect(127 + x, 88 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(95 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 87 + y, 1, 3);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(97 + x, 88 + y, 3, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 2);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(123 + x, 89 + y, 1, 2);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 3, 1);
        g2d.fillRect(98 + x, 91 + y, 2, 1);
        g2d.fillRect(122 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 86 + y, 2, 1);
        g2d.fillRect(118 + x, 86 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 2, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
    }

    public void paintTUB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_7, new Color(0, 0, 0));
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
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(34, 34, 34));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(51, 51, 51));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 86, 73));
        COLORS.set(ImageUtilities.GREY, new Color(69, 68, 67));
        COLORS.set(ImageUtilities.GREY_1, new Color(85, 85, 85));
        COLORS.set(ImageUtilities.GREY_2, new Color(96, 90, 80));
        COLORS.set(ImageUtilities.GREY_3, new Color(119, 119, 119));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
