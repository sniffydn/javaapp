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
import util.GraphicsMap;
import util.Color;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class LongPony2 extends SuperH {

    public LongPony2() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongPony2(int step, int dir) {
        super(step, dir);
    }

    public LongPony2(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d) {
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
        if (y == -1) {
            y = 0;
        }
        if (direction.equalsIgnoreCase("left")) {
            paintBackB(x, prevY, g2d);
        } else {
            paintB(x, prevY, g2d);
        }
        prevY = y;
    }
    int prevY = 0;

    public void drawVeryBack(int x, int y, GraphicsMap g2d) {
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(107 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 2, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 35 + y, 1, 2);
        g2d.fillRect(102 + x, 36 + y, 1, 1);
        g2d.fillRect(103 + x, 37 + y, 1, 2);
        g2d.fillRect(104 + x, 37 + y, 1, 3);
        g2d.fillRect(105 + x, 38 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 2, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 3, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 3, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 4);
        g2d.fillRect(107 + x, 16 + y, 1, 4);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 2);
        g2d.fillRect(98 + x, 27 + y, 1, 4);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(103 + x, 30 + y, 1, 3);
        g2d.fillRect(99 + x, 31 + y, 1, 1);
        g2d.fillRect(120 + x, 31 + y, 1, 3);
        g2d.fillRect(121 + x, 31 + y, 1, 1);
        g2d.fillRect(104 + x, 33 + y, 1, 2);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(101 + x, 34 + y, 2, 1);
        g2d.fillRect(102 + x, 35 + y, 2, 1);
        g2d.fillRect(105 + x, 35 + y, 1, 1);
        g2d.fillRect(103 + x, 36 + y, 2, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 2);
        g2d.fillRect(102 + x, 37 + y, 1, 2);
        g2d.fillRect(105 + x, 37 + y, 1, 1);
        g2d.fillRect(105 + x, 40 + y, 1, 1);
        g2d.fillRect(106 + x, 41 + y, 1, 2);
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(105 + x, 43 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 12 + y, 10, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 21);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 7, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 5);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 2, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 3);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 2, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 9);
        g2d.fillRect(110 + x, 16 + y, 1, 5);
        g2d.fillRect(111 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 3, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 1, 4);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 2, 1);
        g2d.fillRect(118 + x, 17 + y, 3, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 3);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 4);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 3);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 2, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 3);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 22 + y, 1, 5);
        g2d.fillRect(100 + x, 22 + y, 1, 12);
        g2d.fillRect(107 + x, 22 + y, 2, 1);
        g2d.fillRect(122 + x, 22 + y, 1, 7);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 3);
        g2d.fillRect(96 + x, 25 + y, 1, 2);
        g2d.fillRect(103 + x, 25 + y, 1, 5);
        g2d.fillRect(105 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 27 + y, 1, 3);
        g2d.fillRect(104 + x, 27 + y, 1, 6);
        g2d.fillRect(102 + x, 28 + y, 1, 6);
        g2d.fillRect(121 + x, 29 + y, 1, 2);
        g2d.fillRect(99 + x, 30 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 3);
        g2d.fillRect(120 + x, 30 + y, 1, 1);
        g2d.fillRect(99 + x, 32 + y, 1, 1);
        g2d.fillRect(97 + x, 33 + y, 1, 1);
        g2d.fillRect(103 + x, 33 + y, 1, 2);
        g2d.fillRect(105 + x, 34 + y, 1, 1);
        g2d.fillRect(117 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(104 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(118 + x, 35 + y, 1, 1);
        g2d.fillRect(105 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 3);
        g2d.fillRect(117 + x, 36 + y, 1, 2);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 2, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(106 + x, 43 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(112 + x, 14 + y, 3, 1);
        g2d.fillRect(113 + x, 15 + y, 1, 2);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 4);
        g2d.fillRect(99 + x, 18 + y, 2, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 19 + y, 1, 3);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 2);
        g2d.fillRect(97 + x, 21 + y, 1, 3);
        g2d.fillRect(99 + x, 21 + y, 1, 9);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 2, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 2);
        g2d.fillRect(94 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 2);
        g2d.fillRect(102 + x, 25 + y, 1, 3);
        g2d.fillRect(97 + x, 27 + y, 1, 4);
        g2d.fillRect(98 + x, 31 + y, 1, 2);
        g2d.fillRect(118 + x, 31 + y, 1, 4);
        g2d.fillRect(99 + x, 33 + y, 1, 1);
        g2d.fillRect(100 + x, 34 + y, 1, 1);
        g2d.fillRect(117 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 39 + y, 2, 1);
        g2d.fillRect(103 + x, 40 + y, 2, 1);
        g2d.fillRect(105 + x, 41 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(107 + x, 23 + y, 1, 2);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(98 + x, 14 + y, 3, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 2);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 22 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(95 + x, 42 + y, 1, 3);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 7);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 4);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 2, 1);
        g2d.fillRect(97 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 5);
        g2d.fillRect(99 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 3);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(100 + x, 65 + y, 1, 2);
        g2d.fillRect(99 + x, 67 + y, 1, 1);
        g2d.fillRect(101 + x, 67 + y, 1, 1);
        g2d.fillRect(100 + x, 68 + y, 1, 3);
        g2d.fillRect(98 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 2);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(98 + x, 39 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 1, 5);
        g2d.fillRect(103 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 2);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 47 + y, 2, 1);
        g2d.fillRect(95 + x, 48 + y, 1, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 2, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 1, 4);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(100 + x, 58 + y, 1, 3);
        g2d.fillRect(102 + x, 65 + y, 1, 1);
        g2d.fillRect(101 + x, 66 + y, 1, 1);
        g2d.fillRect(100 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 39 + y, 2, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 2);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(104 + x, 46 + y, 1, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(99 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(98 + x, 63 + y, 1, 4);
        g2d.fillRect(99 + x, 63 + y, 3, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(97 + x, 65 + y, 1, 1);
        g2d.fillRect(98 + x, 68 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 39 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 3);
        g2d.fillRect(101 + x, 42 + y, 1, 2);
        g2d.fillRect(100 + x, 43 + y, 1, 2);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 2);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(104 + x, 48 + y, 1, 5);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 60 + y, 1, 3);
        g2d.fillRect(101 + x, 61 + y, 1, 2);
        g2d.fillRect(97 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(99 + x, 64 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 1, 2);
        g2d.fillRect(97 + x, 63 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(98 + x, 44 + y, 1, 1);
        g2d.fillRect(104 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 3);
        g2d.fillRect(104 + x, 43 + y, 1, 1);
        g2d.fillRect(105 + x, 44 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 2);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 6);
        g2d.fillRect(120 + x, 25 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 18 + y, 2, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 21 + y, 1, 10);
        g2d.fillRect(110 + x, 22 + y, 1, 3);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 9);
        g2d.fillRect(121 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 3);
        g2d.fillRect(116 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(112 + x, 24 + y, 1, 4);
        g2d.fillRect(117 + x, 24 + y, 1, 6);
        g2d.fillRect(113 + x, 25 + y, 1, 4);
        g2d.fillRect(114 + x, 25 + y, 1, 5);
        g2d.fillRect(116 + x, 26 + y, 1, 6);
        g2d.fillRect(115 + x, 27 + y, 1, 4);
        g2d.fillRect(117 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 17 + y, 2, 1);
        g2d.fillRect(113 + x, 18 + y, 2, 1);
        g2d.fillRect(111 + x, 19 + y, 2, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 3);
        g2d.fillRect(114 + x, 21 + y, 1, 3);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 3);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 2);
        g2d.fillRect(117 + x, 30 + y, 1, 1);
        g2d.fillRect(118 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(114 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(108 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 15 + y, 2, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(114 + x, 35 + y, 1, 2);
        g2d.fillRect(113 + x, 36 + y, 1, 1);
        g2d.fillRect(112 + x, 37 + y, 1, 2);
        g2d.fillRect(111 + x, 37 + y, 1, 3);
        g2d.fillRect(110 + x, 38 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 2, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 3, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 3, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 4);
        g2d.fillRect(108 + x, 16 + y, 1, 4);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 2);
        g2d.fillRect(117 + x, 27 + y, 1, 4);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(112 + x, 30 + y, 1, 3);
        g2d.fillRect(116 + x, 31 + y, 1, 1);
        g2d.fillRect(95 + x, 31 + y, 1, 3);
        g2d.fillRect(94 + x, 31 + y, 1, 1);
        g2d.fillRect(111 + x, 33 + y, 1, 2);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(113 + x, 34 + y, 2, 1);
        g2d.fillRect(112 + x, 35 + y, 2, 1);
        g2d.fillRect(110 + x, 35 + y, 1, 1);
        g2d.fillRect(111 + x, 36 + y, 2, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(113 + x, 37 + y, 1, 2);
        g2d.fillRect(110 + x, 37 + y, 1, 1);
        g2d.fillRect(110 + x, 40 + y, 1, 1);
        g2d.fillRect(109 + x, 41 + y, 1, 2);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(110 + x, 43 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 12 + y, 10, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 21);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 7, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 5);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 2, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 3);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 2, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 9);
        g2d.fillRect(105 + x, 16 + y, 1, 5);
        g2d.fillRect(104 + x, 16 + y, 1, 2);
        g2d.fillRect(96 + x, 16 + y, 3, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 2);
        g2d.fillRect(111 + x, 17 + y, 1, 4);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
        g2d.fillRect(95 + x, 17 + y, 3, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 3);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 4);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 3);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 2, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 3);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 2);
        g2d.fillRect(117 + x, 22 + y, 1, 5);
        g2d.fillRect(115 + x, 22 + y, 1, 12);
        g2d.fillRect(107 + x, 22 + y, 2, 1);
        g2d.fillRect(93 + x, 22 + y, 1, 7);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 3);
        g2d.fillRect(119 + x, 25 + y, 1, 2);
        g2d.fillRect(112 + x, 25 + y, 1, 5);
        g2d.fillRect(110 + x, 25 + y, 1, 1);
        g2d.fillRect(120 + x, 27 + y, 1, 3);
        g2d.fillRect(111 + x, 27 + y, 1, 6);
        g2d.fillRect(113 + x, 28 + y, 1, 6);
        g2d.fillRect(94 + x, 29 + y, 1, 2);
        g2d.fillRect(116 + x, 30 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 3);
        g2d.fillRect(95 + x, 30 + y, 1, 1);
        g2d.fillRect(116 + x, 32 + y, 1, 1);
        g2d.fillRect(118 + x, 33 + y, 1, 1);
        g2d.fillRect(112 + x, 33 + y, 1, 2);
        g2d.fillRect(110 + x, 34 + y, 1, 1);
        g2d.fillRect(98 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(111 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(97 + x, 35 + y, 1, 1);
        g2d.fillRect(110 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 3);
        g2d.fillRect(98 + x, 36 + y, 1, 2);
        g2d.fillRect(115 + x, 38 + y, 1, 1);
        g2d.fillRect(112 + x, 39 + y, 1, 1);
        g2d.fillRect(111 + x, 41 + y, 2, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 1);
        g2d.fillRect(109 + x, 43 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(101 + x, 14 + y, 3, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 4);
        g2d.fillRect(115 + x, 18 + y, 2, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 19 + y, 1, 3);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 21 + y, 1, 3);
        g2d.fillRect(116 + x, 21 + y, 1, 9);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 2, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 2);
        g2d.fillRect(121 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 2);
        g2d.fillRect(113 + x, 25 + y, 1, 3);
        g2d.fillRect(118 + x, 27 + y, 1, 4);
        g2d.fillRect(117 + x, 31 + y, 1, 2);
        g2d.fillRect(97 + x, 31 + y, 1, 4);
        g2d.fillRect(116 + x, 33 + y, 1, 1);
        g2d.fillRect(115 + x, 34 + y, 1, 1);
        g2d.fillRect(98 + x, 35 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 2, 1);
        g2d.fillRect(111 + x, 40 + y, 2, 1);
        g2d.fillRect(110 + x, 41 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(108 + x, 23 + y, 1, 2);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(115 + x, 14 + y, 3, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(113 + x, 22 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(120 + x, 42 + y, 1, 3);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 7);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 4);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 2, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 2, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 3);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 5);
        g2d.fillRect(116 + x, 60 + y, 1, 3);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 2);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 39 + y, 1, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 5);
        g2d.fillRect(112 + x, 42 + y, 1, 2);
        g2d.fillRect(114 + x, 44 + y, 1, 2);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 2);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(109 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 2, 1);
        g2d.fillRect(120 + x, 48 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 2, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 2);
        g2d.fillRect(114 + x, 50 + y, 1, 4);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 4);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 39 + y, 2, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(120 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(111 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(109 + x, 44 + y, 1, 1);
        g2d.fillRect(110 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 2);
        g2d.fillRect(112 + x, 46 + y, 1, 2);
        g2d.fillRect(111 + x, 46 + y, 1, 1);
        g2d.fillRect(109 + x, 46 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 2);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 4);
        g2d.fillRect(114 + x, 63 + y, 3, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(118 + x, 65 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 39 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 3);
        g2d.fillRect(114 + x, 42 + y, 1, 2);
        g2d.fillRect(115 + x, 43 + y, 1, 2);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 2);
        g2d.fillRect(111 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(111 + x, 48 + y, 1, 5);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(114 + x, 61 + y, 1, 2);
        g2d.fillRect(118 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(118 + x, 63 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(111 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 3);
        g2d.fillRect(111 + x, 43 + y, 1, 1);
        g2d.fillRect(110 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 2);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 6);
        g2d.fillRect(95 + x, 25 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 2);
        g2d.fillRect(97 + x, 21 + y, 1, 10);
        g2d.fillRect(105 + x, 22 + y, 1, 3);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 9);
        g2d.fillRect(94 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 3);
        g2d.fillRect(99 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(103 + x, 24 + y, 1, 4);
        g2d.fillRect(98 + x, 24 + y, 1, 6);
        g2d.fillRect(102 + x, 25 + y, 1, 4);
        g2d.fillRect(101 + x, 25 + y, 1, 5);
        g2d.fillRect(99 + x, 26 + y, 1, 6);
        g2d.fillRect(100 + x, 27 + y, 1, 4);
        g2d.fillRect(98 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 17 + y, 2, 1);
        g2d.fillRect(101 + x, 18 + y, 2, 1);
        g2d.fillRect(103 + x, 19 + y, 2, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 3);
        g2d.fillRect(101 + x, 21 + y, 1, 3);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 3);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 2);
        g2d.fillRect(98 + x, 30 + y, 1, 1);
        g2d.fillRect(97 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(101 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_5, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(8, 8, 8));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(49, 24, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(99, 57, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(156, 90, 0));
        COLORS.set(ImageUtilities.GREY, new Color(156, 90, 82));
        COLORS.set(ImageUtilities.GREY_1, new Color(206, 123, 0));
        COLORS.set(ImageUtilities.GREY_2, new Color(206, 123, 82));
        COLORS.set(ImageUtilities.GREY_3, new Color(206, 156, 82));
        COLORS.set(ImageUtilities.GREY_4, new Color(255, 156, 82));
        COLORS.set(ImageUtilities.GREY_5, new Color(255, 222, 173));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
