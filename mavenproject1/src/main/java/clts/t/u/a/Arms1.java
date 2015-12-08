/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.a;

import b.Bd;
import clts.*;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Arms1 extends SuperTL {

    int leftA = 0;
    int rightA = 0;

    public Arms1() {
        super();
    }

    public Arms1(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void drawSleevesRight5(int x, int y, GraphicsMap g2d) {
    }

    public void drawSleevesLeft6(int x, int y, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintBack(offsetX, offsetY, g2d);
        paintB(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintF(offsetX, 0, g2d);
    }

    public void drawBody(Bd bd) {
        b = bd;
    }
    Bd b = new b.Bd();

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 44 + y, 1, 3);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(111 + x, 38 + y, 1, 3);
        g2d.fillRect(112 + x, 38 + y, 5, 1);
        g2d.fillRect(117 + x, 39 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 2, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 43 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(121 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(121 + x, 50 + y, 2, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(122 + x, 51 + y, 1, 1);
        g2d.fillRect(94 + x, 53 + y, 1, 2);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 12);
        g2d.fillRect(122 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(123 + x, 54 + y, 1, 2);
        g2d.fillRect(95 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(124 + x, 57 + y, 1, 4);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(97 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 11, 1);
        g2d.fillRect(98 + x, 61 + y, 1, 1);
        g2d.fillRect(125 + x, 61 + y, 1, 6);
        g2d.fillRect(99 + x, 62 + y, 1, 1);
        g2d.fillRect(100 + x, 63 + y, 1, 1);
        g2d.fillRect(119 + x, 63 + y, 1, 5);
        g2d.fillRect(101 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 4, 1);
        g2d.fillRect(102 + x, 65 + y, 2, 1);
        g2d.fillRect(109 + x, 65 + y, 5, 1);
        g2d.fillRect(104 + x, 66 + y, 5, 1);
        g2d.fillRect(120 + x, 67 + y, 5, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 3);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 9);
        g2d.fillRect(122 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(123 + x, 56 + y, 1, 5);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 5, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 1);
        g2d.fillRect(124 + x, 61 + y, 1, 6);
        g2d.fillRect(100 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 2);
        g2d.fillRect(101 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 2, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(120 + x, 64 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 5, 1);
        g2d.fillRect(123 + x, 65 + y, 1, 2);
        g2d.fillRect(121 + x, 66 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 3, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 3, 1);



        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 3, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(97 + x, 54 + y, 2, 1);
        g2d.fillRect(112 + x, 39 + y, 5, 1);
        g2d.fillRect(114 + x, 40 + y, 4, 1);
        g2d.fillRect(115 + x, 41 + y, 3, 1);
        g2d.fillRect(116 + x, 42 + y, 3, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 2);
        g2d.fillRect(118 + x, 43 + y, 1, 4);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 3, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 7);
        g2d.fillRect(120 + x, 54 + y, 1, 10);
        g2d.fillRect(121 + x, 54 + y, 1, 12);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 55 + y, 1, 4);
        g2d.fillRect(100 + x, 56 + y, 1, 6);
        g2d.fillRect(122 + x, 56 + y, 1, 10);
        g2d.fillRect(101 + x, 57 + y, 1, 6);
        g2d.fillRect(102 + x, 58 + y, 1, 6);
        g2d.fillRect(103 + x, 59 + y, 1, 6);
        g2d.fillRect(104 + x, 60 + y, 1, 5);
        g2d.fillRect(110 + x, 60 + y, 1, 5);
        g2d.fillRect(111 + x, 60 + y, 1, 5);
        g2d.fillRect(112 + x, 60 + y, 1, 5);
        g2d.fillRect(113 + x, 60 + y, 1, 5);
        g2d.fillRect(114 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 1, 3);
        g2d.fillRect(116 + x, 60 + y, 1, 3);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 4);
        g2d.fillRect(106 + x, 61 + y, 1, 4);
        g2d.fillRect(107 + x, 61 + y, 1, 4);
        g2d.fillRect(108 + x, 61 + y, 1, 4);
        g2d.fillRect(109 + x, 61 + y, 1, 4);
        g2d.fillRect(123 + x, 61 + y, 1, 4);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(153, 95, 85));
        COLORS.set(ImageUtilities.GREY, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 159, 85));

        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(156, 90, 82));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(153, 95, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.GREY, new Color(82, 132, 214));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 156, 82));
        COLORS.set(ImageUtilities.GREY_2, new Color(214, 82, 198));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 159, 85));
    }

    public boolean getOriginalColorArray() {
        return false;
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(99 + x, 41 + y, 2, 1);
        g2d.fillRect(95 + x, 42 + y, 3, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 10);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 2, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 3);
        g2d.fillRect(96 + x, 43 + y, 2, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 3);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(99 + x, 43 + y, 1, 7);
        g2d.fillRect(96 + x, 44 + y, 1, 9);
        g2d.fillRect(97 + x, 44 + y, 1, 9);
        g2d.fillRect(98 + x, 44 + y, 1, 4);
        g2d.fillRect(95 + x, 46 + y, 1, 4);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
    }
}
