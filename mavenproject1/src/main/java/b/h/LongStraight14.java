/*
 * LongWavy1.java
 *
 * Created on March 30, 2007, 9:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package b.h;

import clts.SuperHLong;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class LongStraight14 extends SuperHLong {

    int prevY = 0;
    int prevPrevY = 0;

    public LongStraight14() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight14(int step, int dir) {
        super(step, dir);
    }

    public LongStraight14(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void drawBack(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(0, 0, 0, 0, 0);

        if (direction.equalsIgnoreCase("left")) {
            paintBackB1(x, prevY, g2d);
            paintBackB2(x, prevY + prevPrevY, g2d);
        } else {
            paintB1(x, prevY, g2d);
            paintB2(x, prevY + prevPrevY, g2d);
        }

        prevPrevY = prevY;
        if (prevPrevY == 1) {
            prevPrevY = 0;
        }
        prevY = y;
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 2, 1);
        g2d.fillRect(110 + x, 23 + y, 2, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 2, 1);
        g2d.fillRect(117 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(114 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 1, 2);
        g2d.fillRect(113 + x, 21 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 2);
        g2d.fillRect(115 + x, 24 + y, 1, 2);
        g2d.fillRect(116 + x, 25 + y, 1, 2);
        g2d.fillRect(117 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 20 + y, 3, 1);
        g2d.fillRect(109 + x, 21 + y, 2, 1);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 10 + y, 1, 2);
        g2d.fillRect(104 + x, 10 + y, 11, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 2);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 3);
        g2d.fillRect(108 + x, 11 + y, 1, 2);
        g2d.fillRect(109 + x, 11 + y, 1, 3);
        g2d.fillRect(110 + x, 11 + y, 1, 4);
        g2d.fillRect(113 + x, 11 + y, 1, 3);
        g2d.fillRect(114 + x, 11 + y, 1, 10);
        g2d.fillRect(115 + x, 11 + y, 1, 10);
        g2d.fillRect(116 + x, 11 + y, 1, 9);
        g2d.fillRect(100 + x, 12 + y, 1, 2);
        g2d.fillRect(106 + x, 12 + y, 1, 4);
        g2d.fillRect(111 + x, 12 + y, 1, 3);
        g2d.fillRect(112 + x, 12 + y, 1, 2);
        g2d.fillRect(117 + x, 12 + y, 2, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 3);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 4);
        g2d.fillRect(118 + x, 13 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 10);
        g2d.fillRect(101 + x, 14 + y, 1, 7);
        g2d.fillRect(104 + x, 14 + y, 1, 3);
        g2d.fillRect(117 + x, 14 + y, 1, 4);
        g2d.fillRect(119 + x, 14 + y, 1, 2);
        g2d.fillRect(120 + x, 14 + y, 1, 3);
        g2d.fillRect(121 + x, 14 + y, 1, 6);
        g2d.fillRect(97 + x, 15 + y, 1, 10);
        g2d.fillRect(100 + x, 15 + y, 1, 16);
        g2d.fillRect(118 + x, 15 + y, 1, 2);
        g2d.fillRect(122 + x, 15 + y, 1, 4);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(123 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 5);
        g2d.fillRect(119 + x, 17 + y, 1, 17);
        g2d.fillRect(124 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 18 + y, 1, 5);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 2, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 8);
        g2d.fillRect(103 + x, 20 + y, 1, 4);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(116 + x, 21 + y, 1, 4);
        g2d.fillRect(117 + x, 21 + y, 1, 5);
        g2d.fillRect(118 + x, 21 + y, 1, 6);
        g2d.fillRect(120 + x, 21 + y, 1, 4);
        g2d.fillRect(105 + x, 23 + y, 1, 15);
        g2d.fillRect(95 + x, 24 + y, 1, 9);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 2);
        g2d.fillRect(94 + x, 25 + y, 1, 5);
        g2d.fillRect(103 + x, 25 + y, 1, 7);
        g2d.fillRect(121 + x, 25 + y, 1, 10);
        g2d.fillRect(122 + x, 27 + y, 1, 8);
        g2d.fillRect(123 + x, 27 + y, 1, 8);
        g2d.fillRect(124 + x, 28 + y, 1, 1);
        g2d.fillRect(97 + x, 29 + y, 1, 3);
        g2d.fillRect(101 + x, 31 + y, 1, 2);
        g2d.fillRect(96 + x, 32 + y, 1, 2);
        g2d.fillRect(97 + x, 33 + y, 2, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 4);
        g2d.fillRect(117 + x, 18 + y, 1, 3);
        g2d.fillRect(122 + x, 19 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 10);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 3);
        g2d.fillRect(115 + x, 21 + y, 1, 4);
        g2d.fillRect(99 + x, 22 + y, 1, 6);
        g2d.fillRect(123 + x, 22 + y, 1, 5);
        g2d.fillRect(102 + x, 23 + y, 1, 13);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 9);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 25 + y, 1, 4);
        g2d.fillRect(104 + x, 25 + y, 1, 13);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 9);
        g2d.fillRect(97 + x, 32 + y, 1, 1);
        g2d.fillRect(99 + x, 32 + y, 1, 2);
        g2d.fillRect(103 + x, 32 + y, 1, 5);
        g2d.fillRect(101 + x, 33 + y, 1, 2);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(119 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 3);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 14 + y, 1, 3);
        g2d.fillRect(112 + x, 14 + y, 2, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 2, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 2, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 5);
        g2d.fillRect(105 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 2);
        g2d.fillRect(122 + x, 22 + y, 1, 5);
        g2d.fillRect(120 + x, 25 + y, 1, 10);
        g2d.fillRect(99 + x, 28 + y, 1, 4);
        g2d.fillRect(100 + x, 31 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 6);
        g2d.fillRect(102 + x, 14 + y, 1, 3);
        g2d.fillRect(110 + x, 15 + y, 3, 1);
        g2d.fillRect(107 + x, 16 + y, 2, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 3);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 4);
        g2d.fillRect(110 + x, 17 + y, 1, 4);
        g2d.fillRect(104 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 3);
        g2d.fillRect(111 + x, 18 + y, 1, 3);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 4);
    }

    public void paintB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 28 + y, 1, 4);
        g2d.fillRect(96 + x, 33 + y, 1, 4);
        g2d.fillRect(97 + x, 33 + y, 1, 10);
        g2d.fillRect(98 + x, 33 + y, 1, 38);
        g2d.fillRect(121 + x, 34 + y, 1, 11);
        g2d.fillRect(122 + x, 34 + y, 1, 3);
        g2d.fillRect(123 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 36 + y, 1, 10);
        g2d.fillRect(105 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 25);
        g2d.fillRect(119 + x, 38 + y, 1, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 7);
        g2d.fillRect(105 + x, 41 + y, 1, 27);
        g2d.fillRect(119 + x, 42 + y, 1, 8);
        g2d.fillRect(120 + x, 43 + y, 1, 7);
        g2d.fillRect(97 + x, 44 + y, 1, 2);
        g2d.fillRect(118 + x, 44 + y, 1, 6);
        g2d.fillRect(104 + x, 45 + y, 1, 5);
        g2d.fillRect(101 + x, 46 + y, 1, 4);
        g2d.fillRect(100 + x, 47 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(115 + x, 50 + y, 1, 3);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 10);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 8);
        g2d.fillRect(120 + x, 58 + y, 1, 7);
        g2d.fillRect(118 + x, 59 + y, 1, 6);
        g2d.fillRect(104 + x, 62 + y, 1, 5);
        g2d.fillRect(101 + x, 63 + y, 1, 4);
        g2d.fillRect(100 + x, 64 + y, 1, 3);
        g2d.fillRect(99 + x, 65 + y, 1, 2);
        g2d.fillRect(115 + x, 65 + y, 1, 12);
        g2d.fillRect(120 + x, 67 + y, 1, 1);
        g2d.fillRect(119 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 7);
        g2d.fillRect(99 + x, 71 + y, 1, 8);
        g2d.fillRect(102 + x, 71 + y, 1, 3);
        g2d.fillRect(103 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 72 + y, 1, 7);
        g2d.fillRect(117 + x, 74 + y, 1, 3);
        g2d.fillRect(102 + x, 75 + y, 1, 3);
        g2d.fillRect(100 + x, 76 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 33 + y, 1, 3);
        g2d.fillRect(101 + x, 34 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(100 + x, 35 + y, 1, 4);
        g2d.fillRect(102 + x, 35 + y, 1, 1);
        g2d.fillRect(117 + x, 35 + y, 1, 3);
        g2d.fillRect(118 + x, 35 + y, 1, 9);
        g2d.fillRect(103 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 3);
        g2d.fillRect(104 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 13);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 3);
        g2d.fillRect(103 + x, 39 + y, 1, 1);
        g2d.fillRect(119 + x, 39 + y, 1, 3);
        g2d.fillRect(100 + x, 40 + y, 1, 7);
        g2d.fillRect(104 + x, 40 + y, 1, 5);
        g2d.fillRect(103 + x, 47 + y, 1, 6);
        g2d.fillRect(117 + x, 47 + y, 1, 3);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(118 + x, 50 + y, 1, 9);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 12);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 7);
        g2d.fillRect(104 + x, 57 + y, 1, 5);
        g2d.fillRect(117 + x, 62 + y, 1, 3);
        g2d.fillRect(103 + x, 64 + y, 1, 7);
        g2d.fillRect(116 + x, 65 + y, 1, 7);
        g2d.fillRect(118 + x, 65 + y, 1, 4);
        g2d.fillRect(101 + x, 67 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(100 + x, 69 + y, 1, 1);
        g2d.fillRect(102 + x, 69 + y, 1, 2);
        g2d.fillRect(99 + x, 70 + y, 1, 1);
        g2d.fillRect(101 + x, 71 + y, 1, 1);
        g2d.fillRect(102 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 33 + y, 1, 2);
        g2d.fillRect(120 + x, 34 + y, 1, 6);
        g2d.fillRect(101 + x, 35 + y, 1, 3);
        g2d.fillRect(102 + x, 36 + y, 1, 3);
        g2d.fillRect(119 + x, 36 + y, 1, 2);
        g2d.fillRect(103 + x, 37 + y, 1, 2);
        g2d.fillRect(104 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 1, 7);
        g2d.fillRect(103 + x, 40 + y, 1, 7);
        g2d.fillRect(116 + x, 44 + y, 1, 6);
        g2d.fillRect(102 + x, 45 + y, 1, 7);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 3);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(104 + x, 50 + y, 1, 3);
        g2d.fillRect(117 + x, 50 + y, 1, 3);
        g2d.fillRect(119 + x, 50 + y, 1, 3);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 7);
        g2d.fillRect(103 + x, 57 + y, 1, 7);
        g2d.fillRect(116 + x, 59 + y, 1, 6);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 7);
        g2d.fillRect(99 + x, 63 + y, 1, 2);
        g2d.fillRect(117 + x, 65 + y, 1, 3);
        g2d.fillRect(119 + x, 65 + y, 1, 3);
        g2d.fillRect(120 + x, 65 + y, 1, 2);
        g2d.fillRect(99 + x, 67 + y, 1, 3);
        g2d.fillRect(100 + x, 67 + y, 1, 2);
        g2d.fillRect(104 + x, 67 + y, 1, 4);
        g2d.fillRect(101 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 69 + y, 1, 1);
        g2d.fillRect(100 + x, 70 + y, 1, 6);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(116 + x, 72 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 38 + y, 1, 7);
        g2d.fillRect(102 + x, 39 + y, 1, 6);
        g2d.fillRect(116 + x, 39 + y, 1, 5);
        g2d.fillRect(120 + x, 40 + y, 1, 3);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 6);
        g2d.fillRect(117 + x, 53 + y, 1, 7);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 56 + y, 1, 6);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
    }

    public void paintB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 45 + y, 1, 1);
        g2d.fillRect(123 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 65 + y, 1, 5);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(122 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 6);
        g2d.fillRect(117 + x, 77 + y, 1, 4);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 4);
        g2d.fillRect(116 + x, 78 + y, 1, 5);
        g2d.fillRect(119 + x, 78 + y, 1, 3);
        g2d.fillRect(100 + x, 79 + y, 1, 6);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 80 + y, 1, 1);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 2, 1);
        g2d.fillRect(104 + x, 23 + y, 2, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 2, 1);
        g2d.fillRect(98 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(101 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 24 + y, 1, 2);
        g2d.fillRect(99 + x, 25 + y, 1, 2);
        g2d.fillRect(98 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 20 + y, 3, 1);
        g2d.fillRect(105 + x, 21 + y, 2, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 10 + y, 1, 2);
        g2d.fillRect(101 + x, 10 + y, 11, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 2);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 3);
        g2d.fillRect(107 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 1, 3);
        g2d.fillRect(105 + x, 11 + y, 1, 4);
        g2d.fillRect(102 + x, 11 + y, 1, 3);
        g2d.fillRect(101 + x, 11 + y, 1, 10);
        g2d.fillRect(100 + x, 11 + y, 1, 10);
        g2d.fillRect(99 + x, 11 + y, 1, 9);
        g2d.fillRect(115 + x, 12 + y, 1, 2);
        g2d.fillRect(109 + x, 12 + y, 1, 4);
        g2d.fillRect(104 + x, 12 + y, 1, 3);
        g2d.fillRect(103 + x, 12 + y, 1, 2);
        g2d.fillRect(97 + x, 12 + y, 2, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 3);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 4);
        g2d.fillRect(96 + x, 13 + y, 2, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 10);
        g2d.fillRect(114 + x, 14 + y, 1, 7);
        g2d.fillRect(111 + x, 14 + y, 1, 3);
        g2d.fillRect(98 + x, 14 + y, 1, 4);
        g2d.fillRect(96 + x, 14 + y, 1, 2);
        g2d.fillRect(95 + x, 14 + y, 1, 3);
        g2d.fillRect(94 + x, 14 + y, 1, 6);
        g2d.fillRect(118 + x, 15 + y, 1, 10);
        g2d.fillRect(115 + x, 15 + y, 1, 16);
        g2d.fillRect(97 + x, 15 + y, 1, 2);
        g2d.fillRect(93 + x, 15 + y, 1, 4);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(92 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 5);
        g2d.fillRect(96 + x, 17 + y, 1, 17);
        g2d.fillRect(91 + x, 17 + y, 1, 2);
        g2d.fillRect(113 + x, 18 + y, 1, 5);
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 2, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 8);
        g2d.fillRect(112 + x, 20 + y, 1, 4);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(99 + x, 21 + y, 1, 4);
        g2d.fillRect(98 + x, 21 + y, 1, 5);
        g2d.fillRect(97 + x, 21 + y, 1, 6);
        g2d.fillRect(95 + x, 21 + y, 1, 4);
        g2d.fillRect(110 + x, 23 + y, 1, 15);
        g2d.fillRect(120 + x, 24 + y, 1, 9);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 2);
        g2d.fillRect(121 + x, 25 + y, 1, 5);
        g2d.fillRect(112 + x, 25 + y, 1, 7);
        g2d.fillRect(94 + x, 25 + y, 1, 10);
        g2d.fillRect(93 + x, 27 + y, 1, 8);
        g2d.fillRect(92 + x, 27 + y, 1, 8);
        g2d.fillRect(91 + x, 28 + y, 1, 1);
        g2d.fillRect(118 + x, 29 + y, 1, 3);
        g2d.fillRect(114 + x, 31 + y, 1, 2);
        g2d.fillRect(119 + x, 32 + y, 1, 2);
        g2d.fillRect(117 + x, 33 + y, 2, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 4);
        g2d.fillRect(98 + x, 18 + y, 1, 3);
        g2d.fillRect(93 + x, 19 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 10);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 3);
        g2d.fillRect(100 + x, 21 + y, 1, 4);
        g2d.fillRect(116 + x, 22 + y, 1, 6);
        g2d.fillRect(92 + x, 22 + y, 1, 5);
        g2d.fillRect(113 + x, 23 + y, 1, 13);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 9);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(118 + x, 25 + y, 1, 4);
        g2d.fillRect(111 + x, 25 + y, 1, 13);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 9);
        g2d.fillRect(118 + x, 32 + y, 1, 1);
        g2d.fillRect(116 + x, 32 + y, 1, 2);
        g2d.fillRect(112 + x, 32 + y, 1, 5);
        g2d.fillRect(114 + x, 33 + y, 1, 2);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(96 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 3);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 2);
        g2d.fillRect(106 + x, 14 + y, 1, 3);
        g2d.fillRect(102 + x, 14 + y, 2, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 2, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 2, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 5);
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 2);
        g2d.fillRect(93 + x, 22 + y, 1, 5);
        g2d.fillRect(95 + x, 25 + y, 1, 10);
        g2d.fillRect(116 + x, 28 + y, 1, 4);
        g2d.fillRect(115 + x, 31 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 6);
        g2d.fillRect(113 + x, 14 + y, 1, 3);
        g2d.fillRect(103 + x, 15 + y, 3, 1);
        g2d.fillRect(107 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 3);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 4);
        g2d.fillRect(105 + x, 17 + y, 1, 4);
        g2d.fillRect(111 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 3);
        g2d.fillRect(104 + x, 18 + y, 1, 3);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 4);
    }

    public void paintBackB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 28 + y, 1, 4);
        g2d.fillRect(119 + x, 33 + y, 1, 4);
        g2d.fillRect(118 + x, 33 + y, 1, 10);
        g2d.fillRect(117 + x, 33 + y, 1, 38);
        g2d.fillRect(94 + x, 34 + y, 1, 11);
        g2d.fillRect(93 + x, 34 + y, 1, 3);
        g2d.fillRect(92 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 36 + y, 1, 10);
        g2d.fillRect(110 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 25);
        g2d.fillRect(96 + x, 38 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 7);
        g2d.fillRect(110 + x, 41 + y, 1, 27);
        g2d.fillRect(96 + x, 42 + y, 1, 8);
        g2d.fillRect(95 + x, 43 + y, 1, 7);
        g2d.fillRect(118 + x, 44 + y, 1, 2);
        g2d.fillRect(97 + x, 44 + y, 1, 6);
        g2d.fillRect(111 + x, 45 + y, 1, 5);
        g2d.fillRect(114 + x, 46 + y, 1, 4);
        g2d.fillRect(115 + x, 47 + y, 1, 3);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 3);
        g2d.fillRect(95 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 10);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 8);
        g2d.fillRect(95 + x, 58 + y, 1, 7);
        g2d.fillRect(97 + x, 59 + y, 1, 6);
        g2d.fillRect(111 + x, 62 + y, 1, 5);
        g2d.fillRect(114 + x, 63 + y, 1, 4);
        g2d.fillRect(115 + x, 64 + y, 1, 3);
        g2d.fillRect(116 + x, 65 + y, 1, 2);
        g2d.fillRect(100 + x, 65 + y, 1, 12);
        g2d.fillRect(95 + x, 67 + y, 1, 1);
        g2d.fillRect(96 + x, 68 + y, 1, 3);
        g2d.fillRect(97 + x, 70 + y, 1, 7);
        g2d.fillRect(116 + x, 71 + y, 1, 8);
        g2d.fillRect(113 + x, 71 + y, 1, 3);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 7);
        g2d.fillRect(98 + x, 74 + y, 1, 3);
        g2d.fillRect(113 + x, 75 + y, 1, 3);
        g2d.fillRect(115 + x, 76 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 33 + y, 1, 3);
        g2d.fillRect(114 + x, 34 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(115 + x, 35 + y, 1, 4);
        g2d.fillRect(113 + x, 35 + y, 1, 1);
        g2d.fillRect(98 + x, 35 + y, 1, 3);
        g2d.fillRect(97 + x, 35 + y, 1, 9);
        g2d.fillRect(112 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 3);
        g2d.fillRect(111 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 13);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(110 + x, 38 + y, 1, 3);
        g2d.fillRect(112 + x, 39 + y, 1, 1);
        g2d.fillRect(96 + x, 39 + y, 1, 3);
        g2d.fillRect(115 + x, 40 + y, 1, 7);
        g2d.fillRect(111 + x, 40 + y, 1, 5);
        g2d.fillRect(112 + x, 47 + y, 1, 6);
        g2d.fillRect(98 + x, 47 + y, 1, 3);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 3);
        g2d.fillRect(97 + x, 50 + y, 1, 9);
        g2d.fillRect(115 + x, 52 + y, 1, 4);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(100 + x, 53 + y, 1, 12);
        g2d.fillRect(96 + x, 54 + y, 1, 3);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 7);
        g2d.fillRect(111 + x, 57 + y, 1, 5);
        g2d.fillRect(98 + x, 62 + y, 1, 3);
        g2d.fillRect(112 + x, 64 + y, 1, 7);
        g2d.fillRect(99 + x, 65 + y, 1, 7);
        g2d.fillRect(97 + x, 65 + y, 1, 4);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(98 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 33 + y, 1, 2);
        g2d.fillRect(95 + x, 34 + y, 1, 6);
        g2d.fillRect(114 + x, 35 + y, 1, 3);
        g2d.fillRect(113 + x, 36 + y, 1, 3);
        g2d.fillRect(96 + x, 36 + y, 1, 2);
        g2d.fillRect(112 + x, 37 + y, 1, 2);
        g2d.fillRect(111 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 39 + y, 1, 7);
        g2d.fillRect(112 + x, 40 + y, 1, 7);
        g2d.fillRect(99 + x, 44 + y, 1, 6);
        g2d.fillRect(113 + x, 45 + y, 1, 7);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(115 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 3);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(96 + x, 50 + y, 1, 3);
        g2d.fillRect(95 + x, 50 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 4);
        g2d.fillRect(113 + x, 53 + y, 1, 3);
        g2d.fillRect(112 + x, 53 + y, 1, 3);
        g2d.fillRect(111 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 7);
        g2d.fillRect(112 + x, 57 + y, 1, 7);
        g2d.fillRect(99 + x, 59 + y, 1, 6);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 7);
        g2d.fillRect(116 + x, 63 + y, 1, 2);
        g2d.fillRect(98 + x, 65 + y, 1, 3);
        g2d.fillRect(96 + x, 65 + y, 1, 3);
        g2d.fillRect(95 + x, 65 + y, 1, 2);
        g2d.fillRect(116 + x, 67 + y, 1, 3);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 67 + y, 1, 4);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(97 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 6);
        g2d.fillRect(98 + x, 71 + y, 1, 3);
        g2d.fillRect(99 + x, 72 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 38 + y, 1, 7);
        g2d.fillRect(113 + x, 39 + y, 1, 6);
        g2d.fillRect(99 + x, 39 + y, 1, 5);
        g2d.fillRect(95 + x, 40 + y, 1, 3);
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 6);
        g2d.fillRect(98 + x, 53 + y, 1, 7);
        g2d.fillRect(95 + x, 55 + y, 1, 3);
        g2d.fillRect(113 + x, 56 + y, 1, 6);
        g2d.fillRect(98 + x, 61 + y, 1, 1);
    }

    public void paintBackB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 45 + y, 1, 1);
        g2d.fillRect(92 + x, 46 + y, 1, 1);
        g2d.fillRect(94 + x, 65 + y, 1, 5);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(93 + x, 70 + y, 1, 1);
        g2d.fillRect(101 + x, 74 + y, 1, 6);
        g2d.fillRect(98 + x, 77 + y, 1, 4);
        g2d.fillRect(97 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 4);
        g2d.fillRect(99 + x, 78 + y, 1, 5);
        g2d.fillRect(96 + x, 78 + y, 1, 3);
        g2d.fillRect(115 + x, 79 + y, 1, 6);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(95 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 83 + y, 2, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 80 + y, 1, 1);
    }
}
