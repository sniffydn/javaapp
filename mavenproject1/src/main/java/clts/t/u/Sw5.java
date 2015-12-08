package clts.t.u;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

public class Sw5 extends SuperTU {

    public Sw5() {
        super();
        containsTL = true;
    }

    public Sw5(String middle) {
        super(middle);
        containsTL = true;
    }

    public Sw5(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
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
        drawLower(offsetX, 0, g2d);
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
        g2d.fillRect(100 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 53 + y, 2, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 2);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 1, 4);
        g2d.fillRect(108 + x, 56 + y, 2, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 5);
        g2d.fillRect(112 + x, 56 + y, 3, 1);
        g2d.fillRect(109 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 2, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 2, 1);
        g2d.fillRect(109 + x, 55 + y, 3, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 61 + y, 1, 3);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 2, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 2, 1);
        g2d.fillRect(104 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 2, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 2, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 3, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 2, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 2, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 2, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 2, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 52 + y, 4, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 2, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(103 + x, 54 + y, 4, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(113 + x, 55 + y, 2, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_5, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(34, 34, 34));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(51, 51, 51));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(68, 68, 68));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(85, 85, 85));
        COLORS.set(ImageUtilities.GREY, new Color(204, 0, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 0, 170));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 31, 170));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 63, 170));
        COLORS.set(ImageUtilities.GREY_4, new Color(255, 95, 170));
        COLORS.set(ImageUtilities.GREY_5, new Color(255, 127, 170));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
