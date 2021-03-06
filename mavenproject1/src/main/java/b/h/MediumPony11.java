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

public class MediumPony11 extends SuperH {

    public MediumPony11() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumPony11(int step, int dir) {
        super(step, dir);
    }

    public MediumPony11(int step, int dir, ColorArray colorSwitch) {
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 12 + y, 1, 4);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 3);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 3, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 3);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 3);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 21 + y, 1, 3);
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 2, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 2);
        g2d.fillRect(122 + x, 21 + y, 1, 3);
        g2d.fillRect(97 + x, 22 + y, 1, 7);
        g2d.fillRect(110 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 3, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 2);
        g2d.fillRect(114 + x, 23 + y, 2, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 2, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 2);
        g2d.fillRect(116 + x, 25 + y, 2, 1);
        g2d.fillRect(122 + x, 25 + y, 1, 2);
        g2d.fillRect(118 + x, 27 + y, 1, 8);
        g2d.fillRect(96 + x, 28 + y, 1, 5);
        g2d.fillRect(103 + x, 28 + y, 1, 4);
        g2d.fillRect(104 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 2);
        g2d.fillRect(120 + x, 28 + y, 1, 2);
        g2d.fillRect(122 + x, 28 + y, 1, 5);
        g2d.fillRect(105 + x, 29 + y, 1, 3);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 1);
        g2d.fillRect(97 + x, 30 + y, 1, 4);
        g2d.fillRect(124 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 5);
        g2d.fillRect(121 + x, 32 + y, 1, 2);
        g2d.fillRect(95 + x, 33 + y, 1, 1);
        g2d.fillRect(98 + x, 33 + y, 1, 3);
        g2d.fillRect(100 + x, 34 + y, 1, 1);
        g2d.fillRect(105 + x, 34 + y, 1, 3);
        g2d.fillRect(103 + x, 35 + y, 1, 5);
        g2d.fillRect(120 + x, 35 + y, 1, 2);
        g2d.fillRect(101 + x, 36 + y, 1, 2);
        g2d.fillRect(121 + x, 36 + y, 1, 1);
        g2d.fillRect(106 + x, 37 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(118 + x, 38 + y, 1, 1);
        g2d.fillRect(120 + x, 38 + y, 1, 1);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 13 + y, 2, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 2, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 3);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 2, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 3, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 3);
        g2d.fillRect(107 + x, 20 + y, 4, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 2);
        g2d.fillRect(104 + x, 26 + y, 1, 2);
        g2d.fillRect(102 + x, 28 + y, 1, 4);
        g2d.fillRect(100 + x, 29 + y, 1, 3);
        g2d.fillRect(120 + x, 30 + y, 1, 1);
        g2d.fillRect(104 + x, 32 + y, 1, 3);
        g2d.fillRect(117 + x, 34 + y, 1, 3);
        g2d.fillRect(116 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 2, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 3);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 4);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 5, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 3);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 2, 1);
        g2d.fillRect(113 + x, 15 + y, 1, 3);
        g2d.fillRect(118 + x, 15 + y, 2, 1);
        g2d.fillRect(100 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 2);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 2, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 2, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 4);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 1, 3);
        g2d.fillRect(100 + x, 19 + y, 1, 5);
        g2d.fillRect(105 + x, 19 + y, 1, 3);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 6);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 3, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 5);
        g2d.fillRect(108 + x, 23 + y, 2, 1);
        g2d.fillRect(111 + x, 23 + y, 3, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 2);
        g2d.fillRect(118 + x, 23 + y, 1, 3);
        g2d.fillRect(114 + x, 24 + y, 1, 1);
        g2d.fillRect(122 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 3);
        g2d.fillRect(119 + x, 25 + y, 2, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 1, 4);
        g2d.fillRect(99 + x, 27 + y, 1, 11);
        g2d.fillRect(119 + x, 27 + y, 5, 1);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(97 + x, 29 + y, 1, 1);
        g2d.fillRect(104 + x, 29 + y, 1, 3);
        g2d.fillRect(119 + x, 30 + y, 1, 9);
        g2d.fillRect(100 + x, 32 + y, 1, 2);
        g2d.fillRect(103 + x, 32 + y, 1, 3);
        g2d.fillRect(101 + x, 34 + y, 1, 2);
        g2d.fillRect(104 + x, 35 + y, 1, 5);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 37 + y, 1, 1);
        g2d.fillRect(120 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 1, 2);
        g2d.fillRect(116 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 4, 1);
        g2d.fillRect(110 + x, 15 + y, 2, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 1, 4);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 18 + y, 4, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 2, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 3, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 3);
        g2d.fillRect(112 + x, 20 + y, 2, 1);
        g2d.fillRect(120 + x, 20 + y, 2, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 4);
        g2d.fillRect(114 + x, 21 + y, 2, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 6);
        g2d.fillRect(102 + x, 22 + y, 1, 3);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 4);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(95 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 24 + y, 1, 2);
        g2d.fillRect(121 + x, 24 + y, 1, 3);
        g2d.fillRect(100 + x, 25 + y, 1, 4);
        g2d.fillRect(117 + x, 26 + y, 4, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 7);
        g2d.fillRect(121 + x, 30 + y, 1, 2);
        g2d.fillRect(98 + x, 31 + y, 1, 2);
        g2d.fillRect(120 + x, 31 + y, 1, 4);
        g2d.fillRect(121 + x, 34 + y, 1, 2);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(118 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(117 + x, 37 + y, 1, 3);
        g2d.fillRect(114 + x, 38 + y, 1, 2);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(117 + x, 42 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 36 + y, 1, 1);
        g2d.fillRect(122 + x, 37 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 1);
        g2d.fillRect(120 + x, 38 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 3, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 3);
        g2d.fillRect(116 + x, 44 + y, 3, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 4);
        g2d.fillRect(118 + x, 45 + y, 1, 6);
        g2d.fillRect(119 + x, 47 + y, 1, 4);
        g2d.fillRect(113 + x, 48 + y, 1, 3);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 4);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 1, 6);
        g2d.fillRect(114 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 4);
        g2d.fillRect(117 + x, 59 + y, 1, 6);
        g2d.fillRect(121 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 4);
        g2d.fillRect(119 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 39 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 5);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 5);
        g2d.fillRect(113 + x, 53 + y, 1, 4);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 38 + y, 1, 2);
        g2d.fillRect(115 + x, 39 + y, 1, 2);
        g2d.fillRect(118 + x, 39 + y, 1, 3);
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 5);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 3);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 6);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 2, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 39 + y, 1, 2);
        g2d.fillRect(117 + x, 39 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 4);
        g2d.fillRect(114 + x, 49 + y, 1, 3);
        g2d.fillRect(116 + x, 50 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 4);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 23 + y, 3, 1);
        g2d.fillRect(110 + x, 24 + y, 3, 1);
        g2d.fillRect(113 + x, 25 + y, 2, 1);
        g2d.fillRect(114 + x, 26 + y, 3, 1);
        g2d.fillRect(115 + x, 27 + y, 2, 1);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
        g2d.fillRect(106 + x, 40 + y, 1, 4);
        g2d.fillRect(105 + x, 43 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 39 + y, 1, 2);
        g2d.fillRect(103 + x, 40 + y, 1, 3);
        g2d.fillRect(104 + x, 42 + y, 1, 2);
        g2d.fillRect(103 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 45 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 23 + y, 2, 1);
        g2d.fillRect(113 + x, 24 + y, 3, 1);
        g2d.fillRect(115 + x, 25 + y, 2, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 12 + y, 1, 4);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 3);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 15 + y, 3, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 3);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 21 + y, 1, 3);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 2, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 2);
        g2d.fillRect(93 + x, 21 + y, 1, 3);
        g2d.fillRect(118 + x, 22 + y, 1, 7);
        g2d.fillRect(105 + x, 22 + y, 1, 2);
        g2d.fillRect(101 + x, 22 + y, 3, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 23 + y, 2, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 2, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 2);
        g2d.fillRect(98 + x, 25 + y, 2, 1);
        g2d.fillRect(93 + x, 25 + y, 1, 2);
        g2d.fillRect(97 + x, 27 + y, 1, 8);
        g2d.fillRect(119 + x, 28 + y, 1, 5);
        g2d.fillRect(112 + x, 28 + y, 1, 4);
        g2d.fillRect(111 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 2);
        g2d.fillRect(95 + x, 28 + y, 1, 2);
        g2d.fillRect(93 + x, 28 + y, 1, 5);
        g2d.fillRect(110 + x, 29 + y, 1, 3);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 1);
        g2d.fillRect(118 + x, 30 + y, 1, 4);
        g2d.fillRect(91 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 5);
        g2d.fillRect(94 + x, 32 + y, 1, 2);
        g2d.fillRect(120 + x, 33 + y, 1, 1);
        g2d.fillRect(117 + x, 33 + y, 1, 3);
        g2d.fillRect(115 + x, 34 + y, 1, 1);
        g2d.fillRect(110 + x, 34 + y, 1, 3);
        g2d.fillRect(112 + x, 35 + y, 1, 5);
        g2d.fillRect(95 + x, 35 + y, 1, 2);
        g2d.fillRect(114 + x, 36 + y, 1, 2);
        g2d.fillRect(94 + x, 36 + y, 1, 1);
        g2d.fillRect(109 + x, 37 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(97 + x, 38 + y, 1, 1);
        g2d.fillRect(95 + x, 38 + y, 1, 1);
        g2d.fillRect(110 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 13 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 2, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 3);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 2, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 3, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 3);
        g2d.fillRect(105 + x, 20 + y, 4, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 2);
        g2d.fillRect(111 + x, 26 + y, 1, 2);
        g2d.fillRect(113 + x, 28 + y, 1, 4);
        g2d.fillRect(115 + x, 29 + y, 1, 3);
        g2d.fillRect(95 + x, 30 + y, 1, 1);
        g2d.fillRect(111 + x, 32 + y, 1, 3);
        g2d.fillRect(98 + x, 34 + y, 1, 3);
        g2d.fillRect(99 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(106 + x, 12 + y, 2, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 3);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 4);
        g2d.fillRect(105 + x, 13 + y, 1, 2);
        g2d.fillRect(98 + x, 13 + y, 5, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 3);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 2, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 3);
        g2d.fillRect(96 + x, 15 + y, 2, 1);
        g2d.fillRect(114 + x, 16 + y, 2, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 2);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 2, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 2, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 4);
        g2d.fillRect(109 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 1, 3);
        g2d.fillRect(115 + x, 19 + y, 1, 5);
        g2d.fillRect(110 + x, 19 + y, 1, 3);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 6);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 3, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 5);
        g2d.fillRect(106 + x, 23 + y, 2, 1);
        g2d.fillRect(102 + x, 23 + y, 3, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 2);
        g2d.fillRect(97 + x, 23 + y, 1, 3);
        g2d.fillRect(101 + x, 24 + y, 1, 1);
        g2d.fillRect(93 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 3);
        g2d.fillRect(95 + x, 25 + y, 2, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(117 + x, 27 + y, 1, 4);
        g2d.fillRect(116 + x, 27 + y, 1, 11);
        g2d.fillRect(92 + x, 27 + y, 5, 1);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(118 + x, 29 + y, 1, 1);
        g2d.fillRect(111 + x, 29 + y, 1, 3);
        g2d.fillRect(96 + x, 30 + y, 1, 9);
        g2d.fillRect(115 + x, 32 + y, 1, 2);
        g2d.fillRect(112 + x, 32 + y, 1, 3);
        g2d.fillRect(114 + x, 34 + y, 1, 2);
        g2d.fillRect(111 + x, 35 + y, 1, 5);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 37 + y, 1, 1);
        g2d.fillRect(95 + x, 37 + y, 1, 1);
        g2d.fillRect(117 + x, 38 + y, 1, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 2);
        g2d.fillRect(99 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 4, 1);
        g2d.fillRect(104 + x, 15 + y, 2, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 16 + y, 1, 4);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(101 + x, 18 + y, 4, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 2, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 3, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 3);
        g2d.fillRect(102 + x, 20 + y, 2, 1);
        g2d.fillRect(94 + x, 20 + y, 2, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 4);
        g2d.fillRect(100 + x, 21 + y, 2, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 6);
        g2d.fillRect(113 + x, 22 + y, 1, 3);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 4);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(120 + x, 24 + y, 1, 2);
        g2d.fillRect(114 + x, 24 + y, 1, 2);
        g2d.fillRect(94 + x, 24 + y, 1, 3);
        g2d.fillRect(115 + x, 25 + y, 1, 4);
        g2d.fillRect(95 + x, 26 + y, 4, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 7);
        g2d.fillRect(94 + x, 30 + y, 1, 2);
        g2d.fillRect(117 + x, 31 + y, 1, 2);
        g2d.fillRect(95 + x, 31 + y, 1, 4);
        g2d.fillRect(94 + x, 34 + y, 1, 2);
        g2d.fillRect(115 + x, 35 + y, 1, 1);
        g2d.fillRect(97 + x, 35 + y, 1, 3);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(98 + x, 37 + y, 1, 3);
        g2d.fillRect(101 + x, 38 + y, 1, 2);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(100 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 36 + y, 1, 1);
        g2d.fillRect(93 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 1);
        g2d.fillRect(95 + x, 38 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 41 + y, 3, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 3);
        g2d.fillRect(97 + x, 44 + y, 3, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 4);
        g2d.fillRect(97 + x, 45 + y, 1, 6);
        g2d.fillRect(96 + x, 47 + y, 1, 4);
        g2d.fillRect(102 + x, 48 + y, 1, 3);
        g2d.fillRect(95 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 55 + y, 1, 4);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 6);
        g2d.fillRect(101 + x, 58 + y, 1, 3);
        g2d.fillRect(97 + x, 58 + y, 1, 4);
        g2d.fillRect(98 + x, 59 + y, 1, 6);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 4);
        g2d.fillRect(96 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 5);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(102 + x, 53 + y, 1, 4);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 2, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 1);
        g2d.fillRect(98 + x, 58 + y, 1, 1);
        g2d.fillRect(99 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 38 + y, 1, 2);
        g2d.fillRect(100 + x, 39 + y, 1, 2);
        g2d.fillRect(97 + x, 39 + y, 1, 3);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 5);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 3);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 6);
        g2d.fillRect(98 + x, 54 + y, 1, 2);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 39 + y, 1, 2);
        g2d.fillRect(98 + x, 39 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 4);
        g2d.fillRect(101 + x, 49 + y, 1, 3);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(95 + x, 52 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(97 + x, 53 + y, 1, 4);
        g2d.fillRect(98 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 4);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 23 + y, 3, 1);
        g2d.fillRect(103 + x, 24 + y, 3, 1);
        g2d.fillRect(101 + x, 25 + y, 2, 1);
        g2d.fillRect(99 + x, 26 + y, 3, 1);
        g2d.fillRect(99 + x, 27 + y, 2, 1);
        g2d.fillRect(110 + x, 39 + y, 1, 1);
        g2d.fillRect(109 + x, 40 + y, 1, 4);
        g2d.fillRect(110 + x, 43 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 39 + y, 1, 2);
        g2d.fillRect(112 + x, 40 + y, 1, 3);
        g2d.fillRect(111 + x, 42 + y, 1, 2);
        g2d.fillRect(112 + x, 44 + y, 1, 2);
        g2d.fillRect(113 + x, 45 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 23 + y, 2, 1);
        g2d.fillRect(100 + x, 24 + y, 3, 1);
        g2d.fillRect(99 + x, 25 + y, 2, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_7, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 191, 85));
        COLORS.set(ImageUtilities.GREY, new Color(255, 223, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 170));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 255, 254));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
