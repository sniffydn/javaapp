/*
 * LongWavy1.java
 *
 * Created on March 30, 2007, 9:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package b.h;

import clts.SuperH;
import util.Color;
import util.GraphicsMap;
import clts.Piece;
import util.ColorArray;
import util.ImageUtilities;

public class MediumPony12 extends SuperH {

    public MediumPony12() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumPony12(int step, int dir) {
        super(step, dir);
    }

    public MediumPony12(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d) {
        if (y == 1) {
            y = 0;
        }
        super.drawFront(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackF(x, y, g2d);
        } else {
            paintF(x, y, g2d);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d) {
        super.drawMiddle(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackM(x, y, g2d);
        } else {
            paintM(x, y, g2d);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d) {
        super.drawBack(x, y, g2d);
        if (direction.equalsIgnoreCase("left")) {
            paintBackB(x, y, g2d);
        } else {
            paintB(x, y, g2d);
        }
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d) {
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 11 + y, 2, 1);
        g2d.fillRect(101 + x, 12 + y, 2, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 5, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 3);
        g2d.fillRect(110 + x, 14 + y, 1, 4);
        g2d.fillRect(111 + x, 14 + y, 1, 2);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 1, 3);
        g2d.fillRect(96 + x, 18 + y, 1, 5);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 6);
        g2d.fillRect(101 + x, 23 + y, 1, 7);
        g2d.fillRect(118 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 2, 1);
        g2d.fillRect(112 + x, 11 + y, 1, 2);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 13 + y, 4, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 2, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 4);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 4);
        g2d.fillRect(97 + x, 19 + y, 1, 12);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 5);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 6);
        g2d.fillRect(119 + x, 21 + y, 2, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 7);
        g2d.fillRect(109 + x, 22 + y, 1, 3);
        g2d.fillRect(117 + x, 22 + y, 2, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 5);
        g2d.fillRect(115 + x, 23 + y, 1, 4);
        g2d.fillRect(118 + x, 23 + y, 1, 8);
        g2d.fillRect(119 + x, 23 + y, 1, 4);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 3);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 27 + y, 1, 5);
        g2d.fillRect(99 + x, 29 + y, 1, 3);
        g2d.fillRect(122 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 34 + y, 1, 4);
        g2d.fillRect(104 + x, 34 + y, 1, 7);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 11 + y, 1, 2);
        g2d.fillRect(104 + x, 12 + y, 1, 7);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 3, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 4);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 2);
        g2d.fillRect(106 + x, 15 + y, 3, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 7);
        g2d.fillRect(107 + x, 16 + y, 2, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 4);
        g2d.fillRect(106 + x, 17 + y, 1, 3);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 5);
        g2d.fillRect(112 + x, 17 + y, 1, 4);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 17);
        g2d.fillRect(100 + x, 18 + y, 1, 4);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 19 + y, 1, 6);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 3);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 6);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 6);
        g2d.fillRect(117 + x, 21 + y, 2, 1);
        g2d.fillRect(123 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 22 + y, 1, 5);
        g2d.fillRect(108 + x, 22 + y, 1, 3);
        g2d.fillRect(111 + x, 22 + y, 1, 5);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 2);
        g2d.fillRect(120 + x, 24 + y, 1, 2);
        g2d.fillRect(102 + x, 25 + y, 1, 9);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 27 + y, 1, 2);
        g2d.fillRect(120 + x, 27 + y, 1, 3);
        g2d.fillRect(96 + x, 28 + y, 1, 4);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(93 + x, 30 + y, 1, 1);
        g2d.fillRect(101 + x, 30 + y, 1, 9);
        g2d.fillRect(97 + x, 31 + y, 1, 3);
        g2d.fillRect(99 + x, 32 + y, 1, 7);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(118 + x, 34 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(115 + x, 38 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 1, 2);
        g2d.fillRect(113 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 11 + y, 1, 2);
        g2d.fillRect(114 + x, 11 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 3);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 5);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 8);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 19 + y, 1, 3);
        g2d.fillRect(110 + x, 19 + y, 1, 5);
        g2d.fillRect(111 + x, 19 + y, 1, 3);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 2);
        g2d.fillRect(107 + x, 22 + y, 1, 3);
        g2d.fillRect(116 + x, 23 + y, 1, 4);
        g2d.fillRect(121 + x, 24 + y, 1, 4);
        g2d.fillRect(103 + x, 27 + y, 1, 12);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 3);
        g2d.fillRect(104 + x, 32 + y, 1, 2);
        g2d.fillRect(120 + x, 33 + y, 1, 5);
        g2d.fillRect(96 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 2);
        g2d.fillRect(117 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(115 + x, 11 + y, 2, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 11);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 2, 1);
        g2d.fillRect(120 + x, 22 + y, 2, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 3);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 7);
        g2d.fillRect(120 + x, 30 + y, 1, 3);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 4);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(101 + x, 45 + y, 1, 7);
        g2d.fillRect(116 + x, 45 + y, 1, 3);
        g2d.fillRect(115 + x, 47 + y, 1, 3);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 3);
        g2d.fillRect(102 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 3);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 38 + y, 1, 2);
        g2d.fillRect(113 + x, 39 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 9);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 2);
        g2d.fillRect(100 + x, 46 + y, 1, 4);
        g2d.fillRect(103 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 2, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(103 + x, 40 + y, 2, 1);
        g2d.fillRect(112 + x, 40 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 1, 4);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 2);
        g2d.fillRect(116 + x, 43 + y, 2, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 6);
        g2d.fillRect(105 + x, 45 + y, 1, 3);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 3);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 4);
        g2d.fillRect(102 + x, 56 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 46 + y, 1, 5);
        g2d.fillRect(103 + x, 47 + y, 1, 3);
        g2d.fillRect(116 + x, 48 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 3);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 24 + y, 1, 2);
        g2d.fillRect(117 + x, 24 + y, 1, 3);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 24 + y, 1, 2);
        g2d.fillRect(113 + x, 25 + y, 1, 2);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(111 + x, 11 + y, 2, 1);
        g2d.fillRect(113 + x, 12 + y, 2, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 5, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 3);
        g2d.fillRect(105 + x, 14 + y, 1, 4);
        g2d.fillRect(104 + x, 14 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 16 + y, 1, 3);
        g2d.fillRect(119 + x, 18 + y, 1, 5);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 6);
        g2d.fillRect(114 + x, 23 + y, 1, 7);
        g2d.fillRect(97 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 11 + y, 1, 2);
        g2d.fillRect(108 + x, 11 + y, 2, 1);
        g2d.fillRect(103 + x, 11 + y, 1, 2);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 1, 3);
        g2d.fillRect(98 + x, 13 + y, 4, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 2);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 4);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 4);
        g2d.fillRect(118 + x, 19 + y, 1, 12);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 5);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 6);
        g2d.fillRect(95 + x, 21 + y, 2, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 7);
        g2d.fillRect(106 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 22 + y, 2, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 5);
        g2d.fillRect(100 + x, 23 + y, 1, 4);
        g2d.fillRect(97 + x, 23 + y, 1, 8);
        g2d.fillRect(96 + x, 23 + y, 1, 4);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 3);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 27 + y, 1, 5);
        g2d.fillRect(116 + x, 29 + y, 1, 3);
        g2d.fillRect(93 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 34 + y, 1, 4);
        g2d.fillRect(111 + x, 34 + y, 1, 7);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 11 + y, 1, 2);
        g2d.fillRect(111 + x, 12 + y, 1, 7);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 3, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 4);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 3, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 7);
        g2d.fillRect(107 + x, 16 + y, 2, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 4);
        g2d.fillRect(109 + x, 17 + y, 1, 3);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 5);
        g2d.fillRect(103 + x, 17 + y, 1, 4);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 17);
        g2d.fillRect(115 + x, 18 + y, 1, 4);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 2);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(110 + x, 19 + y, 1, 6);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 3);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 6);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 6);
        g2d.fillRect(97 + x, 21 + y, 2, 1);
        g2d.fillRect(92 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 1, 5);
        g2d.fillRect(107 + x, 22 + y, 1, 3);
        g2d.fillRect(104 + x, 22 + y, 1, 5);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 2);
        g2d.fillRect(95 + x, 24 + y, 1, 2);
        g2d.fillRect(113 + x, 25 + y, 1, 9);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(120 + x, 27 + y, 1, 2);
        g2d.fillRect(95 + x, 27 + y, 1, 3);
        g2d.fillRect(119 + x, 28 + y, 1, 4);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(122 + x, 30 + y, 1, 1);
        g2d.fillRect(114 + x, 30 + y, 1, 9);
        g2d.fillRect(118 + x, 31 + y, 1, 3);
        g2d.fillRect(116 + x, 32 + y, 1, 7);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(97 + x, 34 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(100 + x, 38 + y, 1, 2);
        g2d.fillRect(112 + x, 39 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 11 + y, 1, 2);
        g2d.fillRect(101 + x, 11 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 3);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 5);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 8);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 1, 3);
        g2d.fillRect(105 + x, 19 + y, 1, 5);
        g2d.fillRect(104 + x, 19 + y, 1, 3);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 2);
        g2d.fillRect(108 + x, 22 + y, 1, 3);
        g2d.fillRect(99 + x, 23 + y, 1, 4);
        g2d.fillRect(94 + x, 24 + y, 1, 4);
        g2d.fillRect(112 + x, 27 + y, 1, 12);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 3);
        g2d.fillRect(111 + x, 32 + y, 1, 2);
        g2d.fillRect(95 + x, 33 + y, 1, 5);
        g2d.fillRect(119 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 2);
        g2d.fillRect(98 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(99 + x, 11 + y, 2, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 11);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 2, 1);
        g2d.fillRect(94 + x, 22 + y, 2, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 3);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 7);
        g2d.fillRect(95 + x, 30 + y, 1, 3);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 4);
        g2d.fillRect(113 + x, 44 + y, 1, 2);
        g2d.fillRect(114 + x, 45 + y, 1, 7);
        g2d.fillRect(99 + x, 45 + y, 1, 3);
        g2d.fillRect(100 + x, 47 + y, 1, 3);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(112 + x, 43 + y, 1, 3);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 3);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 38 + y, 1, 2);
        g2d.fillRect(102 + x, 39 + y, 1, 1);
        g2d.fillRect(111 + x, 41 + y, 1, 9);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 4);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 3);
        g2d.fillRect(97 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 2, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(111 + x, 40 + y, 2, 1);
        g2d.fillRect(102 + x, 40 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 2);
        g2d.fillRect(102 + x, 41 + y, 1, 4);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(98 + x, 43 + y, 2, 1);
        g2d.fillRect(98 + x, 44 + y, 1, 6);
        g2d.fillRect(110 + x, 45 + y, 1, 3);
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 3);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 4);
        g2d.fillRect(113 + x, 56 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 2);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 5);
        g2d.fillRect(112 + x, 47 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 1, 3);
        g2d.fillRect(112 + x, 51 + y, 1, 3);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 24 + y, 1, 2);
        g2d.fillRect(98 + x, 24 + y, 1, 3);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 24 + y, 1, 2);
        g2d.fillRect(102 + x, 25 + y, 1, 2);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(99, 49, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(115, 66, 16));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(156, 99, 49));
        COLORS.set(ImageUtilities.NEG_GREY_7, new Color(255, 24, 66));
        COLORS.set(ImageUtilities.GREY_1, new Color(173, 115, 66));
        COLORS.set(ImageUtilities.GREY_2, new Color(206, 156, 99));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
