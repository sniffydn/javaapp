/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b.a;

import b.Bd;
import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Patch1 extends SuperB {

    private Bd b = new Bd();

    /** Creates a new instance of GenericClothes */
    public Patch1() {
        super();
    }

    public Patch1(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void paintBack(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (step <= 12 && step > 3) {
            paintLeft(offsetX, 0, g2d);
        } else {
        }
    }

    public void paintMiddle(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);


        if (step <= 12 && step > 3) {
        } else {
            paintLeft(offsetX, 0, g2d);
        }
    }


    private void paintLeft(int x, int y, GraphicsMap g2d) {
        if (step == 0 || step == 1 || step == 7 || step == 8) {
            paint1(x, y, g2d);
        } else if (step == 3 || step == 4 || step == 5) {
            paint3(x, y, g2d);
        } else if (step == 2 || step == 6) {
            paint2(x, y, g2d);
        } else if (step == 9 || step == 15) {
            paint4(x, y, g2d);
        } else if (step == 10 || step == 14) {
            paint5(x, y, g2d);
        } else if (step == 11 || step == 13) {
            paint6(x, y, g2d);
        } else if (step == 12) {
            paint7(x, y, g2d);
        }
    }

    public void paint7(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 97 + y, 1, 3);
        g2d.fillRect(107 + x, 97 + y, 1, 2);
    }

    public void paint1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(107 + x, 107 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 108 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 106 + y, 2, 1);
        g2d.fillRect(106 + x, 107 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 3);
        g2d.fillRect(107 + x, 109 + y, 1, 2);
    }

    public void paint2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(106 + x, 107 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 108 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 106 + y, 2, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 107 + y, 1, 3);
        g2d.fillRect(106 + x, 109 + y, 1, 2);
    }

    public void paint3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(105 + x, 107 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 108 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 106 + y, 2, 1);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 107 + y, 1, 3);
        g2d.fillRect(105 + x, 109 + y, 1, 2);
    }

    public void paint4(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(106 + x, 104 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 105 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 103 + y, 2, 1);
        g2d.fillRect(105 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 104 + y, 1, 3);
        g2d.fillRect(106 + x, 106 + y, 1, 2);
    }

    public void paint5(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(106 + x, 102 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 103 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 101 + y, 2, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(107 + x, 102 + y, 1, 3);
        g2d.fillRect(106 + x, 104 + y, 1, 2);
    }

    public void paint6(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(106 + x, 102 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 102 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 101 + y, 2, 1);
        g2d.fillRect(107 + x, 102 + y, 1, 2);
        g2d.fillRect(106 + x, 103 + y, 1, 2);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.GREY, new Color(204, 204, 204));
        COLORS.set(ImageUtilities.GREY_1, new Color(204, 255, 204));
    }

    public boolean getOriginalColorArray() {
        return false;
    }

    public void drawBody(b.Bd bd, int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void drawBody(b.Bd bd) {
        b = bd;
    }
}
