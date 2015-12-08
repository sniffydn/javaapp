/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b.a;

import clts.b.*;
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
public class Patch2 extends SuperB {

    private Bd b = new Bd();

    /** Creates a new instance of GenericClothes */
    public Patch2() {
        super();
    }

    public Patch2(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void paintBack(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (step <= 12 && step > 3) {
        } else {
            paintRight(offsetX, 0, g2d);
        }
    }

    public void paintMiddle(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);


        if (step <= 12 && step > 3) {
            paintRight(offsetX, 0, g2d);
        } else {
        }
    }

    private void paintRight(int x, int y, GraphicsMap g2d) {

        if (step == 0 || step == 8 || step == 9 || step == 15) {
            paint1(x, y, g2d);
        } else if (step == 11 || step == 12 || step == 13) {
            paint3(x, y, g2d);
        } else if (step == 1 || step == 7) {
            paint4(x, y, g2d);
        } else if (step == 2 || step == 6) {
            paint5(x, y, g2d);
        } else if (step == 3 || step == 5) {
            paint6(x, y, g2d);
        } else if (step == 10 || step == 14) {
            paint2(x, y, g2d);
        } else if (step == 4) {
            paint7(x, y, g2d);
        }
    }

    public void paint7(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 107 + y, 2, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 2);
        g2d.fillRect(116 + x, 115 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 101 + y, 1, 2);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 108 + y, 2, 1);
    }

    public void paint1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(113 + x, 107 + y, 2, 1);
        g2d.fillRect(114 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 3);
        g2d.fillRect(112 + x, 118 + y, 1, 1);
        g2d.fillRect(111 + x, 133 + y, 1, 3);
        g2d.fillRect(112 + x, 134 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 105 + y, 1, 2);
        g2d.fillRect(113 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 3);
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(111 + x, 132 + y, 1, 1);
        g2d.fillRect(110 + x, 133 + y, 1, 3);
        g2d.fillRect(112 + x, 133 + y, 2, 1);
        g2d.fillRect(113 + x, 134 + y, 1, 2);
        g2d.fillRect(112 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 108 + y, 1, 2);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 115 + y, 1, 1);
        g2d.fillRect(112 + x, 117 + y, 1, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 115 + y, 1, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 3);
        g2d.fillRect(111 + x, 117 + y, 1, 2);
        g2d.fillRect(112 + x, 119 + y, 2, 1);
    }

    public void paint2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(114 + x, 107 + y, 2, 1);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 3);
        g2d.fillRect(113 + x, 118 + y, 1, 1);
        g2d.fillRect(112 + x, 133 + y, 1, 3);
        g2d.fillRect(113 + x, 134 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 1, 3);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 132 + y, 1, 1);
        g2d.fillRect(111 + x, 133 + y, 1, 3);
        g2d.fillRect(113 + x, 133 + y, 2, 1);
        g2d.fillRect(114 + x, 134 + y, 1, 2);
        g2d.fillRect(113 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 115 + y, 1, 1);
        g2d.fillRect(113 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 136 + y, 1, 1);
        g2d.fillRect(114 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 3);
        g2d.fillRect(112 + x, 117 + y, 1, 2);
        g2d.fillRect(113 + x, 119 + y, 2, 1);
    }

    public void paint3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 107 + y, 2, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 3);
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(113 + x, 133 + y, 1, 3);
        g2d.fillRect(114 + x, 134 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 3);
        g2d.fillRect(114 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 132 + y, 1, 1);
        g2d.fillRect(112 + x, 133 + y, 1, 3);
        g2d.fillRect(114 + x, 133 + y, 2, 1);
        g2d.fillRect(115 + x, 134 + y, 1, 2);
        g2d.fillRect(114 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 108 + y, 1, 2);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 117 + y, 1, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 1);
        g2d.fillRect(115 + x, 136 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 3);
        g2d.fillRect(113 + x, 117 + y, 1, 2);
        g2d.fillRect(114 + x, 119 + y, 2, 1);
    }

    public void paint4(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(114 + x, 105 + y, 2, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 114 + y, 1, 3);
        g2d.fillRect(113 + x, 116 + y, 1, 1);
        g2d.fillRect(112 + x, 131 + y, 1, 3);
        g2d.fillRect(113 + x, 132 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 103 + y, 1, 2);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 3);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 130 + y, 1, 1);
        g2d.fillRect(111 + x, 131 + y, 1, 3);
        g2d.fillRect(113 + x, 131 + y, 2, 1);
        g2d.fillRect(114 + x, 132 + y, 1, 2);
        g2d.fillRect(113 + x, 134 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 106 + y, 1, 2);
        g2d.fillRect(113 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(113 + x, 115 + y, 1, 1);
        g2d.fillRect(112 + x, 134 + y, 1, 1);
        g2d.fillRect(114 + x, 134 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 113 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 3);
        g2d.fillRect(112 + x, 115 + y, 1, 2);
        g2d.fillRect(113 + x, 117 + y, 2, 1);
    }

    public void paint5(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 3);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(112 + x, 129 + y, 1, 3);
        g2d.fillRect(113 + x, 130 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 102 + y, 1, 2);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(112 + x, 128 + y, 1, 1);
        g2d.fillRect(111 + x, 129 + y, 1, 3);
        g2d.fillRect(113 + x, 129 + y, 2, 1);
        g2d.fillRect(114 + x, 130 + y, 1, 2);
        g2d.fillRect(113 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 104 + y, 1, 2);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(112 + x, 132 + y, 1, 1);
        g2d.fillRect(114 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 3);
        g2d.fillRect(112 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 115 + y, 2, 1);
    }

    public void paint6(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getFillColor());
        g2d.fillRect(116 + x, 102 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 1);
        g2d.fillRect(113 + x, 121 + y, 1, 3);
        g2d.fillRect(114 + x, 122 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 101 + y, 3, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 1);
        g2d.fillRect(113 + x, 120 + y, 1, 1);
        g2d.fillRect(112 + x, 121 + y, 1, 3);
        g2d.fillRect(114 + x, 121 + y, 2, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 2);
        g2d.fillRect(114 + x, 124 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 102 + y, 1, 2);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 124 + y, 1, 1);
        g2d.fillRect(115 + x, 124 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 111 + y, 2, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(102, 204, 255));
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
