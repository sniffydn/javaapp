/*
 * Shoes0.java
 *
 * Created on March 6, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.s.s;

import clts.SuperS;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class B11 extends SuperS {

    /** Creates a new instance of Shoes0 */
    public B11() {
        super();
        platzHeight = 0;
        notSlenderS = true;
    }

    public B11(ColorArray colorSwitch) {
        super(colorSwitch);
        platzHeight = 0;
        notSlenderS = true;
    }

    public void paintRight(int x, GraphicsMap g2d) {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        paintH(x + tempXpos, tempYpos, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d) {

        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        paintBackH(x + tempXpos, tempYpos, g2d);
    }

    public void paintH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(0 + x, -1 + y, 1, 2);
        g2d.fillRect(-7 + x, 0 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(1 + x, -15 + y, 1, 5);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(-7 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(0 + x, -19 + y, 1, 2);
        g2d.fillRect(1 + x, -19 + y, 1, 4);
        g2d.fillRect(-5 + x, -17 + y, 1, 2);
        g2d.fillRect(-4 + x, -17 + y, 1, 1);
        g2d.fillRect(-6 + x, -15 + y, 1, 4);
        g2d.fillRect(0 + x, -15 + y, 1, 5);
        g2d.fillRect(-7 + x, -10 + y, 1, 3);
        g2d.fillRect(-1 + x, -10 + y, 1, 2);
        g2d.fillRect(-6 + x, -9 + y, 1, 1);
        g2d.fillRect(0 + x, -8 + y, 1, 1);
        g2d.fillRect(-5 + x, -7 + y, 1, 1);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(-7 + x, -5 + y, 1, 3);
        g2d.fillRect(-1 + x, -5 + y, 1, 2);
        g2d.fillRect(0 + x, -5 + y, 1, 4);
        g2d.fillRect(-6 + x, -4 + y, 1, 1);
        g2d.fillRect(-1 + x, -2 + y, 1, 2);
        g2d.fillRect(-6 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-1 + x, -17 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 2);
        g2d.fillRect(-4 + x, -16 + y, 1, 5);
        g2d.fillRect(-3 + x, -16 + y, 1, 3);
        g2d.fillRect(-2 + x, -16 + y, 1, 6);
        g2d.fillRect(-1 + x, -14 + y, 1, 4);
        g2d.fillRect(-3 + x, -12 + y, 1, 2);
        g2d.fillRect(-6 + x, -11 + y, 1, 2);
        g2d.fillRect(-5 + x, -11 + y, 1, 2);
        g2d.fillRect(-4 + x, -10 + y, 1, 1);
        g2d.fillRect(-6 + x, -6 + y, 1, 2);
        g2d.fillRect(-5 + x, -6 + y, 1, 2);
        g2d.fillRect(-3 + x, -6 + y, 1, 2);
        g2d.fillRect(-4 + x, -5 + y, 1, 1);
        g2d.fillRect(-2 + x, -5 + y, 1, 4);
        g2d.fillRect(-6 + x, -3 + y, 1, 2);
        g2d.fillRect(-5 + x, -3 + y, 1, 2);
        g2d.fillRect(-4 + x, -3 + y, 1, 2);
        g2d.fillRect(-3 + x, -3 + y, 1, 2);
        g2d.fillRect(-1 + x, -3 + y, 1, 1);
        g2d.fillRect(-7 + x, -2 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-3 + x, -17 + y, 2, 1);
        g2d.fillRect(-5 + x, -15 + y, 1, 4);
        g2d.fillRect(-1 + x, -15 + y, 1, 1);
        g2d.fillRect(-3 + x, -13 + y, 1, 1);
        g2d.fillRect(-4 + x, -11 + y, 1, 1);
        g2d.fillRect(-3 + x, -10 + y, 2, 1);
        g2d.fillRect(-2 + x, -9 + y, 1, 1);
        g2d.fillRect(-4 + x, -7 + y, 1, 2);
        g2d.fillRect(-3 + x, -7 + y, 1, 1);
        g2d.fillRect(-5 + x, -4 + y, 3, 1);
        g2d.fillRect(-5 + x, -1 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(1 + x, -27 + y, 2, 1);
        g2d.fillRect(-2 + x, -26 + y, 1, 1);
        g2d.fillRect(2 + x, -26 + y, 1, 2);
        g2d.fillRect(-6 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 1);
        g2d.fillRect(-2 + x, -24 + y, 1, 1);
        g2d.fillRect(1 + x, -24 + y, 1, 1);
        g2d.fillRect(-7 + x, -23 + y, 1, 2);
        g2d.fillRect(-4 + x, -23 + y, 2, 1);
        g2d.fillRect(3 + x, -23 + y, 1, 2);
        g2d.fillRect(0 + x, -22 + y, 1, 1);
        g2d.fillRect(4 + x, -21 + y, 1, 1);
        g2d.fillRect(-6 + x, -20 + y, 1, 2);
        g2d.fillRect(-2 + x, -20 + y, 1, 3);
        g2d.fillRect(-1 + x, -20 + y, 1, 1);
        g2d.fillRect(1 + x, -20 + y, 2, 1);
        g2d.fillRect(-5 + x, -19 + y, 1, 1);
        g2d.fillRect(-4 + x, -18 + y, 2, 1);
        g2d.fillRect(-1 + x, -18 + y, 1, 1);
        g2d.fillRect(-5 + x, -9 + y, 1, 2);
        g2d.fillRect(-4 + x, -9 + y, 1, 1);
        g2d.fillRect(-6 + x, -8 + y, 1, 1);
        g2d.fillRect(-3 + x, -8 + y, 2, 1);
        g2d.fillRect(-2 + x, -7 + y, 1, 1);
        g2d.fillRect(0 + x, -7 + y, 1, 2);
        g2d.fillRect(-7 + x, -6 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-5 + x, -26 + y, 1, 2);
        g2d.fillRect(3 + x, -26 + y, 1, 2);
        g2d.fillRect(-4 + x, -25 + y, 2, 1);
        g2d.fillRect(1 + x, -25 + y, 1, 1);
        g2d.fillRect(-3 + x, -24 + y, 1, 1);
        g2d.fillRect(-1 + x, -24 + y, 2, 1);
        g2d.fillRect(2 + x, -24 + y, 1, 3);
        g2d.fillRect(-6 + x, -23 + y, 2, 1);
        g2d.fillRect(-2 + x, -23 + y, 1, 1);
        g2d.fillRect(-5 + x, -22 + y, 1, 3);
        g2d.fillRect(-4 + x, -22 + y, 2, 1);
        g2d.fillRect(1 + x, -22 + y, 1, 2);
        g2d.fillRect(-2 + x, -21 + y, 3, 1);
        g2d.fillRect(-4 + x, -20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-1 + x, -26 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 2, 1);
        g2d.fillRect(-2 + x, -25 + y, 1, 1);
        g2d.fillRect(-6 + x, -24 + y, 3, 1);
        g2d.fillRect(-1 + x, -23 + y, 1, 2);
        g2d.fillRect(0 + x, -23 + y, 2, 1);
        g2d.fillRect(-6 + x, -22 + y, 1, 2);
        g2d.fillRect(-2 + x, -22 + y, 1, 1);
        g2d.fillRect(-4 + x, -21 + y, 2, 1);
        g2d.fillRect(2 + x, -21 + y, 2, 1);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(-4 + x, -19 + y, 2, 1);
        g2d.fillRect(-1 + x, -19 + y, 1, 1);
        g2d.fillRect(-5 + x, -18 + y, 1, 1);
        g2d.fillRect(-3 + x, -9 + y, 1, 1);
        g2d.fillRect(-4 + x, -8 + y, 1, 1);
        g2d.fillRect(-1 + x, -8 + y, 1, 3);
        g2d.fillRect(-7 + x, -7 + y, 2, 1);
    }

    public void paintBackH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(0 + x, -1 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-1 + x, -15 + y, 1, 5);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(7 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(0 + x, -19 + y, 1, 2);
        g2d.fillRect(-1 + x, -19 + y, 1, 4);
        g2d.fillRect(5 + x, -17 + y, 1, 2);
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(6 + x, -15 + y, 1, 4);
        g2d.fillRect(0 + x, -15 + y, 1, 5);
        g2d.fillRect(7 + x, -10 + y, 1, 3);
        g2d.fillRect(1 + x, -10 + y, 1, 2);
        g2d.fillRect(6 + x, -9 + y, 1, 1);
        g2d.fillRect(0 + x, -8 + y, 1, 1);
        g2d.fillRect(5 + x, -7 + y, 1, 1);
        g2d.fillRect(2 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -5 + y, 1, 3);
        g2d.fillRect(1 + x, -5 + y, 1, 2);
        g2d.fillRect(0 + x, -5 + y, 1, 4);
        g2d.fillRect(6 + x, -4 + y, 1, 1);
        g2d.fillRect(1 + x, -2 + y, 1, 2);
        g2d.fillRect(6 + x, -1 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(1 + x, -17 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 2);
        g2d.fillRect(4 + x, -16 + y, 1, 5);
        g2d.fillRect(3 + x, -16 + y, 1, 3);
        g2d.fillRect(2 + x, -16 + y, 1, 6);
        g2d.fillRect(1 + x, -14 + y, 1, 4);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(6 + x, -11 + y, 1, 2);
        g2d.fillRect(5 + x, -11 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 1);
        g2d.fillRect(6 + x, -6 + y, 1, 2);
        g2d.fillRect(5 + x, -6 + y, 1, 2);
        g2d.fillRect(3 + x, -6 + y, 1, 2);
        g2d.fillRect(4 + x, -5 + y, 1, 1);
        g2d.fillRect(2 + x, -5 + y, 1, 4);
        g2d.fillRect(6 + x, -3 + y, 1, 2);
        g2d.fillRect(5 + x, -3 + y, 1, 2);
        g2d.fillRect(4 + x, -3 + y, 1, 2);
        g2d.fillRect(3 + x, -3 + y, 1, 2);
        g2d.fillRect(1 + x, -3 + y, 1, 1);
        g2d.fillRect(7 + x, -2 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(2 + x, -17 + y, 2, 1);
        g2d.fillRect(5 + x, -15 + y, 1, 4);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(3 + x, -13 + y, 1, 1);
        g2d.fillRect(4 + x, -11 + y, 1, 1);
        g2d.fillRect(2 + x, -10 + y, 2, 1);
        g2d.fillRect(2 + x, -9 + y, 1, 1);
        g2d.fillRect(4 + x, -7 + y, 1, 2);
        g2d.fillRect(3 + x, -7 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 3, 1);
        g2d.fillRect(2 + x, -1 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-2 + x, -27 + y, 2, 1);
        g2d.fillRect(2 + x, -26 + y, 1, 1);
        g2d.fillRect(-2 + x, -26 + y, 1, 2);
        g2d.fillRect(6 + x, -25 + y, 1, 1);
        g2d.fillRect(0 + x, -25 + y, 1, 1);
        g2d.fillRect(2 + x, -24 + y, 1, 1);
        g2d.fillRect(-1 + x, -24 + y, 1, 1);
        g2d.fillRect(7 + x, -23 + y, 1, 2);
        g2d.fillRect(3 + x, -23 + y, 2, 1);
        g2d.fillRect(-3 + x, -23 + y, 1, 2);
        g2d.fillRect(0 + x, -22 + y, 1, 1);
        g2d.fillRect(-4 + x, -21 + y, 1, 1);
        g2d.fillRect(6 + x, -20 + y, 1, 2);
        g2d.fillRect(2 + x, -20 + y, 1, 3);
        g2d.fillRect(1 + x, -20 + y, 1, 1);
        g2d.fillRect(-2 + x, -20 + y, 2, 1);
        g2d.fillRect(5 + x, -19 + y, 1, 1);
        g2d.fillRect(3 + x, -18 + y, 2, 1);
        g2d.fillRect(1 + x, -18 + y, 1, 1);
        g2d.fillRect(5 + x, -9 + y, 1, 2);
        g2d.fillRect(4 + x, -9 + y, 1, 1);
        g2d.fillRect(6 + x, -8 + y, 1, 1);
        g2d.fillRect(2 + x, -8 + y, 2, 1);
        g2d.fillRect(2 + x, -7 + y, 1, 1);
        g2d.fillRect(0 + x, -7 + y, 1, 2);
        g2d.fillRect(7 + x, -6 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(5 + x, -26 + y, 1, 2);
        g2d.fillRect(-3 + x, -26 + y, 1, 2);
        g2d.fillRect(3 + x, -25 + y, 2, 1);
        g2d.fillRect(-1 + x, -25 + y, 1, 1);
        g2d.fillRect(3 + x, -24 + y, 1, 1);
        g2d.fillRect(0 + x, -24 + y, 2, 1);
        g2d.fillRect(-2 + x, -24 + y, 1, 3);
        g2d.fillRect(5 + x, -23 + y, 2, 1);
        g2d.fillRect(2 + x, -23 + y, 1, 1);
        g2d.fillRect(5 + x, -22 + y, 1, 3);
        g2d.fillRect(3 + x, -22 + y, 2, 1);
        g2d.fillRect(-1 + x, -22 + y, 1, 2);
        g2d.fillRect(0 + x, -21 + y, 3, 1);
        g2d.fillRect(3 + x, -20 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(1 + x, -26 + y, 1, 2);
        g2d.fillRect(-1 + x, -26 + y, 2, 1);
        g2d.fillRect(2 + x, -25 + y, 1, 1);
        g2d.fillRect(4 + x, -24 + y, 3, 1);
        g2d.fillRect(1 + x, -23 + y, 1, 2);
        g2d.fillRect(-1 + x, -23 + y, 2, 1);
        g2d.fillRect(6 + x, -22 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 1);
        g2d.fillRect(3 + x, -21 + y, 2, 1);
        g2d.fillRect(-3 + x, -21 + y, 2, 1);
        g2d.fillRect(0 + x, -20 + y, 1, 1);
        g2d.fillRect(3 + x, -19 + y, 2, 1);
        g2d.fillRect(1 + x, -19 + y, 1, 1);
        g2d.fillRect(5 + x, -18 + y, 1, 1);
        g2d.fillRect(3 + x, -9 + y, 1, 1);
        g2d.fillRect(4 + x, -8 + y, 1, 1);
        g2d.fillRect(1 + x, -8 + y, 1, 3);
        g2d.fillRect(6 + x, -7 + y, 2, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(156, 90, 0));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(156, 90, 82));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(156, 123, 82));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(206, 156, 82));
        COLORS.set(ImageUtilities.GREY, new Color(255, 189, 82));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 173));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 222, 255));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 255, 255));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
