/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.s.so;

import clts.SuperS;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class SK8 extends SuperS {

    {
        sock = true;
        nurse = true;
        legLength = 0;
    }

    public SK8() {
        super();
    }

    public SK8(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    private void paintLeftOne(int x, int y, GraphicsMap g2d) {
        paintLeftTwo(x, y, g2d);
    }

    private void paintLeftTwo(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-7 + x, -64 + y, 1, 2);
        g2d.fillRect(-6 + x, -64 + y, 8, 1);
        g2d.fillRect(1 + x, -63 + y, 1, 1);
        g2d.fillRect(-6 + x, -61 + y, 1, 1);
        g2d.fillRect(-5 + x, -56 + y, 1, 2);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(-3 + x, -51 + y, 1, 1);
        g2d.fillRect(-3 + x, -48 + y, 1, 1);
        g2d.fillRect(3 + x, -48 + y, 1, 2);
        g2d.fillRect(-4 + x, -42 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(-3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(-2 + x, -30 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(-1 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 2);
        g2d.fillRect(5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(6 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);
        g2d.fillRect(3 + x, 0 + y, 1, 1);
        g2d.fillRect(5 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, -63 + y, 1, 2);
        g2d.fillRect(-5 + x, -63 + y, 6, 1);
        g2d.fillRect(-5 + x, -60 + y, 1, 2);
        g2d.fillRect(1 + x, -60 + y, 1, 2);
        g2d.fillRect(-4 + x, -58 + y, 1, 2);
        g2d.fillRect(-3 + x, -56 + y, 1, 2);
        g2d.fillRect(1 + x, -56 + y, 1, 2);
        g2d.fillRect(-3 + x, -52 + y, 1, 1);
        g2d.fillRect(1 + x, -52 + y, 1, 2);
        g2d.fillRect(-3 + x, -47 + y, 1, 1);
        g2d.fillRect(-3 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(-3 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -37 + y, 1, 1);
        g2d.fillRect(2 + x, -37 + y, 1, 1);
        g2d.fillRect(-1 + x, -32 + y, 1, 2);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(0 + x, -18 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 2);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(5 + x, -8 + y, 1, 2);
        g2d.fillRect(6 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-2 + x, -62 + y, 1, 2);
        g2d.fillRect(-3 + x, -60 + y, 1, 2);
        g2d.fillRect(-1 + x, -60 + y, 1, 2);
        g2d.fillRect(0 + x, -58 + y, 1, 2);
        g2d.fillRect(-1 + x, -56 + y, 1, 2);
        g2d.fillRect(-2 + x, -54 + y, 1, 2);
        g2d.fillRect(-1 + x, -52 + y, 1, 2);
        g2d.fillRect(0 + x, -50 + y, 1, 2);
        g2d.fillRect(-1 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -48 + y, 1, 2);
        g2d.fillRect(-2 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(-1 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -38 + y, 1, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 1);
        g2d.fillRect(-1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(0 + x, -34 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(5 + x, -4 + y, 1, 2);
    }

    private void paintLeftThree(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-6 + x, -64 + y, 1, 4);
        g2d.fillRect(-5 + x, -64 + y, 8, 1);
        g2d.fillRect(2 + x, -63 + y, 1, 3);
        g2d.fillRect(-5 + x, -56 + y, 1, 2);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(-3 + x, -51 + y, 1, 1);
        g2d.fillRect(-3 + x, -48 + y, 1, 1);
        g2d.fillRect(3 + x, -48 + y, 1, 2);
        g2d.fillRect(-4 + x, -42 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(-3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(-2 + x, -30 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(-1 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 2);
        g2d.fillRect(5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(6 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);
        g2d.fillRect(3 + x, 0 + y, 1, 1);
        g2d.fillRect(5 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-5 + x, -63 + y, 1, 5);
        g2d.fillRect(-4 + x, -63 + y, 1, 2);
        g2d.fillRect(-3 + x, -63 + y, 5, 1);
        g2d.fillRect(1 + x, -60 + y, 1, 2);
        g2d.fillRect(-4 + x, -58 + y, 1, 2);
        g2d.fillRect(-3 + x, -56 + y, 1, 2);
        g2d.fillRect(1 + x, -56 + y, 1, 2);
        g2d.fillRect(-3 + x, -52 + y, 1, 1);
        g2d.fillRect(1 + x, -52 + y, 1, 2);
        g2d.fillRect(-3 + x, -47 + y, 1, 1);
        g2d.fillRect(-3 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(-3 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -37 + y, 1, 1);
        g2d.fillRect(2 + x, -37 + y, 1, 1);
        g2d.fillRect(-1 + x, -32 + y, 1, 2);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(0 + x, -18 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 2);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(5 + x, -8 + y, 1, 2);
        g2d.fillRect(6 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-2 + x, -62 + y, 1, 2);
        g2d.fillRect(-3 + x, -60 + y, 1, 2);
        g2d.fillRect(-1 + x, -60 + y, 1, 2);
        g2d.fillRect(0 + x, -58 + y, 1, 2);
        g2d.fillRect(-1 + x, -56 + y, 1, 2);
        g2d.fillRect(-2 + x, -54 + y, 1, 2);
        g2d.fillRect(-1 + x, -52 + y, 1, 2);
        g2d.fillRect(0 + x, -50 + y, 1, 2);
        g2d.fillRect(-1 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -48 + y, 1, 2);
        g2d.fillRect(-2 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(-1 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -38 + y, 1, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 1);
        g2d.fillRect(-1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(0 + x, -34 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(5 + x, -4 + y, 1, 2);
    }

    private void paintLeftFour(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-7 + x, -62 + y, 1, 4);
        g2d.fillRect(-6 + x, -62 + y, 8, 1);
        g2d.fillRect(1 + x, -61 + y, 1, 3);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(-4 + x, -50 + y, 1, 1);
        g2d.fillRect(-3 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -47 + y, 1, 1);
        g2d.fillRect(-4 + x, -42 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(-3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(-2 + x, -30 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(-1 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 2);
        g2d.fillRect(5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(6 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);
        g2d.fillRect(3 + x, 0 + y, 1, 1);
        g2d.fillRect(5 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, -61 + y, 1, 2);
        g2d.fillRect(-5 + x, -61 + y, 1, 3);
        g2d.fillRect(-4 + x, -61 + y, 5, 1);
        g2d.fillRect(-4 + x, -58 + y, 1, 2);
        g2d.fillRect(0 + x, -58 + y, 1, 2);
        g2d.fillRect(-5 + x, -56 + y, 1, 2);
        g2d.fillRect(1 + x, -56 + y, 1, 2);
        g2d.fillRect(-3 + x, -52 + y, 1, 2);
        g2d.fillRect(1 + x, -52 + y, 1, 2);
        g2d.fillRect(1 + x, -48 + y, 1, 1);
        g2d.fillRect(-2 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(-3 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(-3 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(-1 + x, -32 + y, 1, 2);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -25 + y, 1, 1);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(0 + x, -18 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 2);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(5 + x, -8 + y, 1, 2);
        g2d.fillRect(6 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-3 + x, -60 + y, 1, 2);
        g2d.fillRect(-1 + x, -60 + y, 1, 2);
        g2d.fillRect(-3 + x, -56 + y, 1, 2);
        g2d.fillRect(-1 + x, -56 + y, 1, 2);
        g2d.fillRect(-2 + x, -54 + y, 1, 2);
        g2d.fillRect(-1 + x, -52 + y, 1, 2);
        g2d.fillRect(0 + x, -50 + y, 1, 2);
        g2d.fillRect(-1 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -47 + y, 1, 1);
        g2d.fillRect(-1 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(-1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(0 + x, -34 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(5 + x, -4 + y, 1, 2);
    }

    private void paintLeftFive(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-7 + x, -59 + y, 1, 3);
        g2d.fillRect(-6 + x, -59 + y, 8, 1);
        g2d.fillRect(1 + x, -58 + y, 1, 3);
        g2d.fillRect(-6 + x, -54 + y, 1, 2);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(-5 + x, -52 + y, 1, 2);
        g2d.fillRect(-4 + x, -50 + y, 1, 2);
        g2d.fillRect(-3 + x, -47 + y, 1, 1);
        g2d.fillRect(3 + x, -44 + y, 1, 1);
        g2d.fillRect(-4 + x, -42 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(-3 + x, -35 + y, 1, 1);
        g2d.fillRect(3 + x, -35 + y, 1, 1);
        g2d.fillRect(-3 + x, -32 + y, 1, 1);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(-2 + x, -30 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(-1 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 2);
        g2d.fillRect(5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(6 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);
        g2d.fillRect(3 + x, 0 + y, 1, 1);
        g2d.fillRect(5 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, -58 + y, 1, 2);
        g2d.fillRect(-5 + x, -58 + y, 6, 1);
        g2d.fillRect(0 + x, -57 + y, 1, 1);
        g2d.fillRect(-5 + x, -56 + y, 1, 2);
        g2d.fillRect(1 + x, -55 + y, 1, 1);
        g2d.fillRect(-3 + x, -52 + y, 1, 2);
        g2d.fillRect(1 + x, -52 + y, 1, 2);
        g2d.fillRect(-3 + x, -48 + y, 1, 1);
        g2d.fillRect(1 + x, -48 + y, 1, 2);
        g2d.fillRect(-2 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(-3 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -43 + y, 1, 1);
        g2d.fillRect(-3 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(-3 + x, -36 + y, 1, 1);
        g2d.fillRect(3 + x, -36 + y, 1, 1);
        g2d.fillRect(-1 + x, -31 + y, 1, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -25 + y, 1, 1);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(0 + x, -18 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 2);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(5 + x, -8 + y, 1, 2);
        g2d.fillRect(6 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-4 + x, -57 + y, 1, 1);
        g2d.fillRect(-3 + x, -56 + y, 1, 2);
        g2d.fillRect(-1 + x, -56 + y, 1, 2);
        g2d.fillRect(-2 + x, -54 + y, 1, 2);
        g2d.fillRect(-1 + x, -52 + y, 1, 2);
        g2d.fillRect(0 + x, -50 + y, 1, 2);
        g2d.fillRect(-1 + x, -48 + y, 1, 2);
        g2d.fillRect(-1 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(-1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(0 + x, -34 + y, 1, 2);
        g2d.fillRect(-1 + x, -32 + y, 1, 1);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 1);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(5 + x, -4 + y, 1, 2);
    }

    private void paintLeftSix(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-6 + x, -53 + y, 1, 3);
        g2d.fillRect(-5 + x, -53 + y, 8, 1);
        g2d.fillRect(2 + x, -52 + y, 1, 1);
        g2d.fillRect(-5 + x, -48 + y, 1, 1);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(-3 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -43 + y, 1, 1);
        g2d.fillRect(-4 + x, -41 + y, 1, 1);
        g2d.fillRect(-4 + x, -34 + y, 1, 1);
        g2d.fillRect(4 + x, -34 + y, 1, 1);
        g2d.fillRect(-3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(-2 + x, -29 + y, 1, 1);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(-1 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 2);
        g2d.fillRect(5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(6 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);
        g2d.fillRect(3 + x, 0 + y, 1, 1);
        g2d.fillRect(5 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-5 + x, -52 + y, 1, 2);
        g2d.fillRect(-4 + x, -52 + y, 1, 4);
        g2d.fillRect(-3 + x, -52 + y, 5, 1);
        g2d.fillRect(1 + x, -51 + y, 1, 1);
        g2d.fillRect(-3 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 1);
        g2d.fillRect(-3 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(-3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(-2 + x, -30 + y, 1, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(0 + x, -18 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 2);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(5 + x, -8 + y, 1, 2);
        g2d.fillRect(6 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-3 + x, -51 + y, 1, 1);
        g2d.fillRect(-1 + x, -51 + y, 1, 1);
        g2d.fillRect(0 + x, -50 + y, 1, 2);
        g2d.fillRect(-1 + x, -48 + y, 1, 2);
        g2d.fillRect(-2 + x, -46 + y, 1, 2);
        g2d.fillRect(-1 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -43 + y, 1, 1);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(-1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(0 + x, -34 + y, 1, 2);
        g2d.fillRect(-1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(5 + x, -4 + y, 1, 2);
    }

    private void paintLeftSeven(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-5 + x, -50 + y, 9, 1);
        g2d.fillRect(-4 + x, -49 + y, 1, 2);
        g2d.fillRect(3 + x, -49 + y, 1, 3);
        g2d.fillRect(-3 + x, -47 + y, 1, 1);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(-3 + x, -43 + y, 1, 1);
        g2d.fillRect(-4 + x, -41 + y, 1, 1);
        g2d.fillRect(-4 + x, -34 + y, 1, 1);
        g2d.fillRect(4 + x, -34 + y, 1, 1);
        g2d.fillRect(-3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(-2 + x, -29 + y, 1, 1);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(-1 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(-1 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(4 + x, -17 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 2);
        g2d.fillRect(5 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(6 + x, -6 + y, 1, 1);
        g2d.fillRect(7 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);
        g2d.fillRect(3 + x, 0 + y, 1, 1);
        g2d.fillRect(5 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-3 + x, -49 + y, 1, 2);
        g2d.fillRect(-2 + x, -49 + y, 5, 1);
        g2d.fillRect(-2 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(-1 + x, -44 + y, 1, 1);
        g2d.fillRect(-3 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(-3 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(-2 + x, -30 + y, 1, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(-1 + x, -28 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(0 + x, -18 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 2);
        g2d.fillRect(1 + x, -15 + y, 1, 1);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(5 + x, -8 + y, 1, 2);
        g2d.fillRect(6 + x, -5 + y, 1, 1);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-1 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(-1 + x, -43 + y, 1, 1);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(-1 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(-2 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(-1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(0 + x, -34 + y, 1, 2);
        g2d.fillRect(-1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(0 + x, -26 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(5 + x, -4 + y, 1, 2);
    }

    private void paintRightOne(int x, int y, GraphicsMap g2d) {
        paintRightTwo(x, y, g2d);
    }

    private void paintRightTwo(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(11 + x, -64 + y, 1, 2);
        g2d.fillRect(3 + x, -64 + y, 8, 1);
        g2d.fillRect(3 + x, -63 + y, 1, 1);
        g2d.fillRect(10 + x, -61 + y, 1, 1);
        g2d.fillRect(9 + x, -56 + y, 1, 2);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(7 + x, -51 + y, 1, 1);
        g2d.fillRect(7 + x, -48 + y, 1, 1);
        g2d.fillRect(1 + x, -48 + y, 1, 2);
        g2d.fillRect(8 + x, -42 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(6 + x, -30 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(5 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(5 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 2);
        g2d.fillRect(-1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(10 + x, -63 + y, 1, 2);
        g2d.fillRect(4 + x, -63 + y, 6, 1);
        g2d.fillRect(9 + x, -60 + y, 1, 2);
        g2d.fillRect(3 + x, -60 + y, 1, 2);
        g2d.fillRect(8 + x, -58 + y, 1, 2);
        g2d.fillRect(7 + x, -56 + y, 1, 2);
        g2d.fillRect(3 + x, -56 + y, 1, 2);
        g2d.fillRect(7 + x, -52 + y, 1, 1);
        g2d.fillRect(3 + x, -52 + y, 1, 2);
        g2d.fillRect(7 + x, -47 + y, 1, 1);
        g2d.fillRect(7 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(7 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -37 + y, 1, 1);
        g2d.fillRect(2 + x, -37 + y, 1, 1);
        g2d.fillRect(5 + x, -32 + y, 1, 2);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(5 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -26 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(4 + x, -18 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 2);
        g2d.fillRect(3 + x, -15 + y, 1, 1);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(-1 + x, -8 + y, 1, 2);
        g2d.fillRect(-2 + x, -5 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(6 + x, -62 + y, 1, 2);
        g2d.fillRect(7 + x, -60 + y, 1, 2);
        g2d.fillRect(5 + x, -60 + y, 1, 2);
        g2d.fillRect(4 + x, -58 + y, 1, 2);
        g2d.fillRect(5 + x, -56 + y, 1, 2);
        g2d.fillRect(6 + x, -54 + y, 1, 2);
        g2d.fillRect(5 + x, -52 + y, 1, 2);
        g2d.fillRect(4 + x, -50 + y, 1, 2);
        g2d.fillRect(5 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -48 + y, 1, 2);
        g2d.fillRect(6 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(5 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -38 + y, 1, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 1);
        g2d.fillRect(5 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(4 + x, -34 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(-1 + x, -4 + y, 1, 2);
    }

    private void paintRightThree(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(10 + x, -64 + y, 1, 4);
        g2d.fillRect(2 + x, -64 + y, 8, 1);
        g2d.fillRect(2 + x, -63 + y, 1, 3);
        g2d.fillRect(9 + x, -56 + y, 1, 2);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(7 + x, -51 + y, 1, 1);
        g2d.fillRect(7 + x, -48 + y, 1, 1);
        g2d.fillRect(1 + x, -48 + y, 1, 2);
        g2d.fillRect(8 + x, -42 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(6 + x, -30 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(5 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(5 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 2);
        g2d.fillRect(-1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(9 + x, -63 + y, 1, 5);
        g2d.fillRect(8 + x, -63 + y, 1, 2);
        g2d.fillRect(3 + x, -63 + y, 5, 1);
        g2d.fillRect(3 + x, -60 + y, 1, 2);
        g2d.fillRect(8 + x, -58 + y, 1, 2);
        g2d.fillRect(7 + x, -56 + y, 1, 2);
        g2d.fillRect(3 + x, -56 + y, 1, 2);
        g2d.fillRect(7 + x, -52 + y, 1, 1);
        g2d.fillRect(3 + x, -52 + y, 1, 2);
        g2d.fillRect(7 + x, -47 + y, 1, 1);
        g2d.fillRect(7 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(7 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -37 + y, 1, 1);
        g2d.fillRect(2 + x, -37 + y, 1, 1);
        g2d.fillRect(5 + x, -32 + y, 1, 2);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(5 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -26 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(4 + x, -18 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 2);
        g2d.fillRect(3 + x, -15 + y, 1, 1);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(-1 + x, -8 + y, 1, 2);
        g2d.fillRect(-2 + x, -5 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(6 + x, -62 + y, 1, 2);
        g2d.fillRect(7 + x, -60 + y, 1, 2);
        g2d.fillRect(5 + x, -60 + y, 1, 2);
        g2d.fillRect(4 + x, -58 + y, 1, 2);
        g2d.fillRect(5 + x, -56 + y, 1, 2);
        g2d.fillRect(6 + x, -54 + y, 1, 2);
        g2d.fillRect(5 + x, -52 + y, 1, 2);
        g2d.fillRect(4 + x, -50 + y, 1, 2);
        g2d.fillRect(5 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -48 + y, 1, 2);
        g2d.fillRect(6 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(5 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -38 + y, 1, 1);
        g2d.fillRect(2 + x, -38 + y, 1, 1);
        g2d.fillRect(5 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(4 + x, -34 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(-1 + x, -4 + y, 1, 2);
    }

    private void paintRightFour(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(11 + x, -62 + y, 1, 4);
        g2d.fillRect(3 + x, -62 + y, 8, 1);
        g2d.fillRect(3 + x, -61 + y, 1, 3);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(8 + x, -50 + y, 1, 1);
        g2d.fillRect(7 + x, -48 + y, 1, 2);
        g2d.fillRect(1 + x, -47 + y, 1, 1);
        g2d.fillRect(8 + x, -42 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(6 + x, -30 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(5 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(5 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 2);
        g2d.fillRect(-1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(10 + x, -61 + y, 1, 2);
        g2d.fillRect(9 + x, -61 + y, 1, 3);
        g2d.fillRect(4 + x, -61 + y, 5, 1);
        g2d.fillRect(8 + x, -58 + y, 1, 2);
        g2d.fillRect(4 + x, -58 + y, 1, 2);
        g2d.fillRect(9 + x, -56 + y, 1, 2);
        g2d.fillRect(3 + x, -56 + y, 1, 2);
        g2d.fillRect(7 + x, -52 + y, 1, 2);
        g2d.fillRect(3 + x, -52 + y, 1, 2);
        g2d.fillRect(3 + x, -48 + y, 1, 1);
        g2d.fillRect(6 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(7 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(7 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(5 + x, -32 + y, 1, 2);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(5 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -25 + y, 1, 1);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(4 + x, -18 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 2);
        g2d.fillRect(3 + x, -15 + y, 1, 1);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(-1 + x, -8 + y, 1, 2);
        g2d.fillRect(-2 + x, -5 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(7 + x, -60 + y, 1, 2);
        g2d.fillRect(5 + x, -60 + y, 1, 2);
        g2d.fillRect(7 + x, -56 + y, 1, 2);
        g2d.fillRect(5 + x, -56 + y, 1, 2);
        g2d.fillRect(6 + x, -54 + y, 1, 2);
        g2d.fillRect(5 + x, -52 + y, 1, 2);
        g2d.fillRect(4 + x, -50 + y, 1, 2);
        g2d.fillRect(5 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -47 + y, 1, 1);
        g2d.fillRect(5 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(5 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(4 + x, -34 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -26 + y, 1, 1);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(-1 + x, -4 + y, 1, 2);
    }

    private void paintRightFive(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(11 + x, -59 + y, 1, 3);
        g2d.fillRect(3 + x, -59 + y, 8, 1);
        g2d.fillRect(3 + x, -58 + y, 1, 3);
        g2d.fillRect(10 + x, -54 + y, 1, 2);
        g2d.fillRect(2 + x, -54 + y, 1, 2);
        g2d.fillRect(9 + x, -52 + y, 1, 2);
        g2d.fillRect(8 + x, -50 + y, 1, 2);
        g2d.fillRect(7 + x, -47 + y, 1, 1);
        g2d.fillRect(1 + x, -44 + y, 1, 1);
        g2d.fillRect(8 + x, -42 + y, 1, 2);
        g2d.fillRect(0 + x, -42 + y, 1, 2);
        g2d.fillRect(7 + x, -35 + y, 1, 1);
        g2d.fillRect(1 + x, -35 + y, 1, 1);
        g2d.fillRect(7 + x, -32 + y, 1, 1);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(6 + x, -30 + y, 1, 2);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(5 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(5 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 2);
        g2d.fillRect(-1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(10 + x, -58 + y, 1, 2);
        g2d.fillRect(4 + x, -58 + y, 6, 1);
        g2d.fillRect(4 + x, -57 + y, 1, 1);
        g2d.fillRect(9 + x, -56 + y, 1, 2);
        g2d.fillRect(3 + x, -55 + y, 1, 1);
        g2d.fillRect(7 + x, -52 + y, 1, 2);
        g2d.fillRect(3 + x, -52 + y, 1, 2);
        g2d.fillRect(7 + x, -48 + y, 1, 1);
        g2d.fillRect(3 + x, -48 + y, 1, 2);
        g2d.fillRect(6 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(7 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -43 + y, 1, 1);
        g2d.fillRect(7 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 1);
        g2d.fillRect(1 + x, -36 + y, 1, 1);
        g2d.fillRect(5 + x, -31 + y, 1, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(5 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -25 + y, 1, 1);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(4 + x, -18 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 2);
        g2d.fillRect(3 + x, -15 + y, 1, 1);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(-1 + x, -8 + y, 1, 2);
        g2d.fillRect(-2 + x, -5 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(8 + x, -57 + y, 1, 1);
        g2d.fillRect(7 + x, -56 + y, 1, 2);
        g2d.fillRect(5 + x, -56 + y, 1, 2);
        g2d.fillRect(6 + x, -54 + y, 1, 2);
        g2d.fillRect(5 + x, -52 + y, 1, 2);
        g2d.fillRect(4 + x, -50 + y, 1, 2);
        g2d.fillRect(5 + x, -48 + y, 1, 2);
        g2d.fillRect(5 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(5 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(4 + x, -34 + y, 1, 2);
        g2d.fillRect(5 + x, -32 + y, 1, 1);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -26 + y, 1, 1);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(-1 + x, -4 + y, 1, 2);
    }

    private void paintRightSix(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(10 + x, -53 + y, 1, 3);
        g2d.fillRect(2 + x, -53 + y, 8, 1);
        g2d.fillRect(2 + x, -52 + y, 1, 1);
        g2d.fillRect(9 + x, -48 + y, 1, 1);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(7 + x, -44 + y, 1, 2);
        g2d.fillRect(1 + x, -43 + y, 1, 1);
        g2d.fillRect(8 + x, -41 + y, 1, 1);
        g2d.fillRect(8 + x, -34 + y, 1, 1);
        g2d.fillRect(0 + x, -34 + y, 1, 1);
        g2d.fillRect(7 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(6 + x, -29 + y, 1, 1);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(5 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(5 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 2);
        g2d.fillRect(-1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(9 + x, -52 + y, 1, 2);
        g2d.fillRect(8 + x, -52 + y, 1, 4);
        g2d.fillRect(3 + x, -52 + y, 5, 1);
        g2d.fillRect(3 + x, -51 + y, 1, 1);
        g2d.fillRect(7 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 1);
        g2d.fillRect(7 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(6 + x, -30 + y, 1, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(5 + x, -28 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(4 + x, -18 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 2);
        g2d.fillRect(3 + x, -15 + y, 1, 1);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(-1 + x, -8 + y, 1, 2);
        g2d.fillRect(-2 + x, -5 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(7 + x, -51 + y, 1, 1);
        g2d.fillRect(5 + x, -51 + y, 1, 1);
        g2d.fillRect(4 + x, -50 + y, 1, 2);
        g2d.fillRect(5 + x, -48 + y, 1, 2);
        g2d.fillRect(6 + x, -46 + y, 1, 2);
        g2d.fillRect(5 + x, -44 + y, 1, 2);
        g2d.fillRect(3 + x, -43 + y, 1, 1);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(5 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(4 + x, -34 + y, 1, 2);
        g2d.fillRect(5 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -26 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(-1 + x, -4 + y, 1, 2);
    }

    private void paintRightSeven(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(1 + x, -50 + y, 9, 1);
        g2d.fillRect(8 + x, -49 + y, 1, 2);
        g2d.fillRect(1 + x, -49 + y, 1, 3);
        g2d.fillRect(7 + x, -47 + y, 1, 1);
        g2d.fillRect(1 + x, -44 + y, 1, 2);
        g2d.fillRect(7 + x, -43 + y, 1, 1);
        g2d.fillRect(8 + x, -41 + y, 1, 1);
        g2d.fillRect(8 + x, -34 + y, 1, 1);
        g2d.fillRect(0 + x, -34 + y, 1, 1);
        g2d.fillRect(7 + x, -32 + y, 1, 2);
        g2d.fillRect(1 + x, -32 + y, 1, 2);
        g2d.fillRect(6 + x, -29 + y, 1, 1);
        g2d.fillRect(1 + x, -28 + y, 1, 2);
        g2d.fillRect(5 + x, -24 + y, 1, 2);
        g2d.fillRect(1 + x, -24 + y, 1, 2);
        g2d.fillRect(5 + x, -20 + y, 1, 2);
        g2d.fillRect(1 + x, -20 + y, 1, 2);
        g2d.fillRect(0 + x, -17 + y, 1, 1);
        g2d.fillRect(5 + x, -16 + y, 1, 1);
        g2d.fillRect(-1 + x, -16 + y, 1, 2);
        g2d.fillRect(-1 + x, -12 + y, 1, 2);
        g2d.fillRect(4 + x, -10 + y, 1, 2);
        g2d.fillRect(-2 + x, -6 + y, 1, 1);
        g2d.fillRect(-3 + x, -4 + y, 1, 2);
        g2d.fillRect(4 + x, -2 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(7 + x, -49 + y, 1, 2);
        g2d.fillRect(2 + x, -49 + y, 5, 1);
        g2d.fillRect(6 + x, -46 + y, 1, 2);
        g2d.fillRect(2 + x, -46 + y, 1, 2);
        g2d.fillRect(5 + x, -44 + y, 1, 1);
        g2d.fillRect(7 + x, -40 + y, 1, 2);
        g2d.fillRect(1 + x, -40 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 2);
        g2d.fillRect(1 + x, -36 + y, 1, 2);
        g2d.fillRect(6 + x, -30 + y, 1, 1);
        g2d.fillRect(2 + x, -30 + y, 1, 2);
        g2d.fillRect(5 + x, -28 + y, 1, 2);
        g2d.fillRect(2 + x, -22 + y, 1, 2);
        g2d.fillRect(4 + x, -18 + y, 1, 2);
        g2d.fillRect(1 + x, -16 + y, 1, 2);
        g2d.fillRect(3 + x, -15 + y, 1, 1);
        g2d.fillRect(3 + x, -12 + y, 1, 2);
        g2d.fillRect(0 + x, -10 + y, 1, 2);
        g2d.fillRect(3 + x, -8 + y, 1, 2);
        g2d.fillRect(-1 + x, -8 + y, 1, 2);
        g2d.fillRect(-2 + x, -5 + y, 1, 1);
        g2d.fillRect(3 + x, -4 + y, 1, 2);
        g2d.fillRect(0 + x, -2 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(5 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -48 + y, 1, 2);
        g2d.fillRect(3 + x, -44 + y, 1, 2);
        g2d.fillRect(5 + x, -43 + y, 1, 1);
        g2d.fillRect(4 + x, -42 + y, 1, 2);
        g2d.fillRect(5 + x, -40 + y, 1, 2);
        g2d.fillRect(3 + x, -40 + y, 1, 2);
        g2d.fillRect(6 + x, -38 + y, 1, 2);
        g2d.fillRect(2 + x, -38 + y, 1, 2);
        g2d.fillRect(5 + x, -36 + y, 1, 2);
        g2d.fillRect(3 + x, -36 + y, 1, 2);
        g2d.fillRect(4 + x, -34 + y, 1, 2);
        g2d.fillRect(5 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -32 + y, 1, 2);
        g2d.fillRect(3 + x, -28 + y, 1, 2);
        g2d.fillRect(4 + x, -26 + y, 1, 2);
        g2d.fillRect(3 + x, -24 + y, 1, 2);
        g2d.fillRect(3 + x, -20 + y, 1, 2);
        g2d.fillRect(3 + x, -16 + y, 1, 1);
        g2d.fillRect(2 + x, -14 + y, 1, 2);
        g2d.fillRect(1 + x, -12 + y, 1, 2);
        g2d.fillRect(1 + x, -8 + y, 1, 2);
        g2d.fillRect(2 + x, -6 + y, 1, 2);
        g2d.fillRect(1 + x, -4 + y, 1, 2);
        g2d.fillRect(-1 + x, -4 + y, 1, 2);
    }

    public void paintRight(int x, GraphicsMap g2d) {
        x = rightXpos + x - 4;

        if (step == 0 || step == 8) {
            rightXStrapLoc = 7;
            rightYStrapLoc = -64;
            paintRightOne(x, rightYpos, g2d);
        } else if (step == 9 || step == 10 || step == 14 || step == 15) {
            rightXStrapLoc = 7;
            rightYStrapLoc = -64;
            paintRightTwo(x, rightYpos, g2d);
        } else if (step == 11 || step == 12 || step == 13) {
            rightXStrapLoc = 7;
            rightYStrapLoc = -64;
            paintRightThree(x, rightYpos, g2d);
        } else if (step == 1 || step == 7) {
            rightXStrapLoc = 7;
            rightYStrapLoc = -62;
            paintRightFour(x, rightYpos, g2d);
        } else if (step == 2 || step == 6) {
            rightXStrapLoc = 7;
            rightYStrapLoc = -59;
            paintRightFive(x, rightYpos, g2d);
        } else if (step == 3 || step == 5) {
            rightXStrapLoc = 6;
            rightYStrapLoc = -53;
            paintRightSix(x, rightYpos, g2d);
        } else if (step == 4) {
            rightXStrapLoc = 5;
            rightYStrapLoc = -50;
            paintRightSeven(x, rightYpos, g2d);
        }

        int[] strap = g2d.getRightStrap();
        if (strap[0] != -9999) {
            rightXStrapLoc += x;
            rightYStrapLoc += rightYpos;
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            ImageUtilities.drawLine(strap[0], strap[1], rightXStrapLoc, rightYStrapLoc, g2d);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d) {
        x = leftXpos + x;

        if (step == 0 || step == 8) {
            leftXStrapLoc = -3;
            leftYStrapLoc = -64;
            paintLeftOne(x, leftYpos, g2d);
        } else if (step == 1 || step == 7 || step == 2 || step == 6) {
            leftXStrapLoc = -3;
            leftYStrapLoc = -64;
            paintLeftTwo(x, leftYpos, g2d);
        } else if (step == 3 || step == 4 || step == 5) {
            leftXStrapLoc = -2;
            leftYStrapLoc = -64;
            paintLeftThree(x, leftYpos, g2d);
        } else if (step == 9 || step == 15) {
            leftXStrapLoc = -3;
            leftYStrapLoc = -62;
            paintLeftFour(x, leftYpos, g2d);
        } else if (step == 10 || step == 14) {
            leftXStrapLoc = -3;
            leftYStrapLoc = -59;
            paintLeftFive(x, leftYpos, g2d);
        } else if (step == 11 || step == 13) {
            leftXStrapLoc = -2;
            leftYStrapLoc = -53;
            paintLeftSix(x, leftYpos, g2d);
        } else if (step == 12) {
            leftXStrapLoc = -1;
            leftYStrapLoc = -50;
            paintLeftSeven(x, leftYpos, g2d);
        }


        int[] strap = g2d.getLeftStrap();
        if (strap[0] != -9999) {
            leftXStrapLoc += x;
            leftYStrapLoc += leftYpos;
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            ImageUtilities.drawLine(strap[0], strap[1], leftXStrapLoc, leftYStrapLoc, g2d);
        }
    }
}
