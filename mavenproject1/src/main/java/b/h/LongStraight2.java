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
public class LongStraight2 extends SuperHLong {

    public LongStraight2() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight2(int step, int dir) {
        super(step, dir);
    }

    public LongStraight2(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(0, 0, 0, 0, 0);
        if (direction.equalsIgnoreCase("left")) {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(111 + x, 12 + y, 1, 2);
            g2d.fillRect(110 + x, 13 + y, 1, 2);
            g2d.fillRect(109 + x, 14 + y, 1, 3);
            g2d.fillRect(108 + x, 16 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(110 + x, 11 + y, 2, 1);
            g2d.fillRect(112 + x, 12 + y, 1, 4);
            g2d.fillRect(110 + x, 12 + y, 1, 1);
            g2d.fillRect(113 + x, 13 + y, 1, 3);
            g2d.fillRect(107 + x, 13 + y, 3, 1);
            g2d.fillRect(114 + x, 14 + y, 1, 2);
            g2d.fillRect(111 + x, 14 + y, 1, 3);
            g2d.fillRect(107 + x, 14 + y, 2, 1);
            g2d.fillRect(110 + x, 15 + y, 1, 4);
            g2d.fillRect(106 + x, 16 + y, 2, 1);
            g2d.fillRect(109 + x, 17 + y, 1, 4);
            g2d.fillRect(108 + x, 18 + y, 1, 3);
            g2d.fillRect(105 + x, 18 + y, 2, 1);
            g2d.fillRect(107 + x, 19 + y, 1, 2);
            g2d.fillRect(103 + x, 19 + y, 3, 1);
            g2d.fillRect(103 + x, 20 + y, 2, 1);
            g2d.fillRect(102 + x, 21 + y, 2, 1);
            g2d.fillRect(101 + x, 22 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(112 + x, 11 + y, 1, 1);
            g2d.fillRect(109 + x, 11 + y, 1, 2);
            g2d.fillRect(108 + x, 11 + y, 1, 2);
            g2d.fillRect(102 + x, 11 + y, 6, 1);
            g2d.fillRect(114 + x, 12 + y, 1, 2);
            g2d.fillRect(113 + x, 12 + y, 1, 1);
            g2d.fillRect(100 + x, 12 + y, 4, 1);
            g2d.fillRect(115 + x, 13 + y, 1, 5);
            g2d.fillRect(102 + x, 13 + y, 1, 2);
            g2d.fillRect(101 + x, 13 + y, 1, 2);
            g2d.fillRect(100 + x, 13 + y, 1, 2);
            g2d.fillRect(99 + x, 13 + y, 1, 3);
            g2d.fillRect(98 + x, 13 + y, 1, 3);
            g2d.fillRect(116 + x, 14 + y, 1, 7);
            g2d.fillRect(106 + x, 14 + y, 1, 2);
            g2d.fillRect(105 + x, 14 + y, 1, 2);
            g2d.fillRect(103 + x, 14 + y, 2, 1);
            g2d.fillRect(97 + x, 14 + y, 1, 4);
            g2d.fillRect(107 + x, 15 + y, 2, 1);
            g2d.fillRect(117 + x, 16 + y, 1, 7);
            g2d.fillRect(112 + x, 16 + y, 3, 1);
            g2d.fillRect(96 + x, 16 + y, 1, 3);
            g2d.fillRect(111 + x, 17 + y, 3, 1);
            g2d.fillRect(107 + x, 17 + y, 1, 2);
            g2d.fillRect(104 + x, 17 + y, 3, 1);
            g2d.fillRect(95 + x, 17 + y, 1, 6);
            g2d.fillRect(118 + x, 18 + y, 1, 8);
            g2d.fillRect(112 + x, 18 + y, 1, 4);
            g2d.fillRect(111 + x, 18 + y, 1, 3);
            g2d.fillRect(98 + x, 18 + y, 7, 1);
            g2d.fillRect(113 + x, 19 + y, 1, 7);
            g2d.fillRect(110 + x, 19 + y, 1, 8);
            g2d.fillRect(97 + x, 19 + y, 2, 1);
            g2d.fillRect(94 + x, 19 + y, 1, 4);
            g2d.fillRect(96 + x, 20 + y, 2, 1);
            g2d.fillRect(119 + x, 21 + y, 1, 6);
            g2d.fillRect(109 + x, 21 + y, 1, 3);
            g2d.fillRect(108 + x, 21 + y, 1, 2);
            g2d.fillRect(101 + x, 21 + y, 1, 1);
            g2d.fillRect(96 + x, 21 + y, 1, 1);
            g2d.fillRect(93 + x, 21 + y, 1, 2);
            g2d.fillRect(100 + x, 22 + y, 1, 2);
            g2d.fillRect(114 + x, 23 + y, 1, 4);
            g2d.fillRect(99 + x, 23 + y, 1, 4);
            g2d.fillRect(98 + x, 24 + y, 1, 4);
            g2d.fillRect(93 + x, 24 + y, 3, 1);
            g2d.fillRect(115 + x, 25 + y, 1, 6);
            g2d.fillRect(93 + x, 25 + y, 2, 1);
            g2d.fillRect(120 + x, 26 + y, 1, 5);
            g2d.fillRect(111 + x, 26 + y, 1, 5);
            g2d.fillRect(97 + x, 26 + y, 1, 3);
            g2d.fillRect(94 + x, 27 + y, 1, 4);
            g2d.fillRect(93 + x, 27 + y, 1, 10);
            g2d.fillRect(96 + x, 28 + y, 1, 1);
            g2d.fillRect(96 + x, 30 + y, 1, 5);
            g2d.fillRect(97 + x, 33 + y, 1, 4);
            g2d.fillRect(101 + x, 37 + y, 1, 2);
            g2d.fillRect(102 + x, 38 + y, 1, 2);
            g2d.fillRect(104 + x, 39 + y, 1, 2);
            g2d.fillRect(103 + x, 39 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(104 + x, 12 + y, 1, 2);
            g2d.fillRect(103 + x, 13 + y, 1, 1);
            g2d.fillRect(104 + x, 15 + y, 1, 2);
            g2d.fillRect(103 + x, 15 + y, 1, 3);
            g2d.fillRect(100 + x, 15 + y, 3, 1);
            g2d.fillRect(105 + x, 16 + y, 1, 1);
            g2d.fillRect(98 + x, 16 + y, 3, 1);
            g2d.fillRect(114 + x, 17 + y, 1, 6);
            g2d.fillRect(102 + x, 17 + y, 1, 1);
            g2d.fillRect(98 + x, 17 + y, 2, 1);
            g2d.fillRect(115 + x, 18 + y, 1, 2);
            g2d.fillRect(113 + x, 18 + y, 1, 1);
            g2d.fillRect(97 + x, 18 + y, 1, 1);
            g2d.fillRect(99 + x, 19 + y, 4, 1);
            g2d.fillRect(96 + x, 19 + y, 1, 1);
            g2d.fillRect(116 + x, 21 + y, 1, 1);
            g2d.fillRect(111 + x, 21 + y, 1, 1);
            g2d.fillRect(115 + x, 23 + y, 1, 2);
            g2d.fillRect(111 + x, 23 + y, 1, 3);
            g2d.fillRect(97 + x, 25 + y, 1, 1);
            g2d.fillRect(116 + x, 26 + y, 1, 5);
            g2d.fillRect(96 + x, 26 + y, 1, 2);
            g2d.fillRect(119 + x, 27 + y, 1, 4);
            g2d.fillRect(112 + x, 27 + y, 1, 4);
            g2d.fillRect(95 + x, 27 + y, 1, 3);
            g2d.fillRect(94 + x, 31 + y, 1, 1);
            g2d.fillRect(98 + x, 34 + y, 1, 1);
            g2d.fillRect(99 + x, 35 + y, 1, 3);
            g2d.fillRect(96 + x, 35 + y, 1, 2);
            g2d.fillRect(100 + x, 36 + y, 1, 4);
            g2d.fillRect(98 + x, 36 + y, 1, 1);
            g2d.fillRect(94 + x, 36 + y, 1, 1);
            g2d.fillRect(101 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(106 + x, 12 + y, 1, 2);
            g2d.fillRect(105 + x, 12 + y, 1, 2);
            g2d.fillRect(101 + x, 16 + y, 2, 1);
            g2d.fillRect(100 + x, 17 + y, 2, 1);
            g2d.fillRect(115 + x, 20 + y, 1, 3);
            g2d.fillRect(98 + x, 20 + y, 5, 1);
            g2d.fillRect(99 + x, 21 + y, 2, 1);
            g2d.fillRect(97 + x, 21 + y, 1, 1);
            g2d.fillRect(116 + x, 22 + y, 1, 4);
            g2d.fillRect(112 + x, 22 + y, 1, 5);
            g2d.fillRect(111 + x, 22 + y, 1, 1);
            g2d.fillRect(99 + x, 22 + y, 1, 1);
            g2d.fillRect(96 + x, 22 + y, 1, 1);
            g2d.fillRect(117 + x, 23 + y, 1, 8);
            g2d.fillRect(97 + x, 23 + y, 2, 1);
            g2d.fillRect(95 + x, 23 + y, 1, 1);
            g2d.fillRect(96 + x, 24 + y, 2, 1);
            g2d.fillRect(95 + x, 25 + y, 2, 1);
            g2d.fillRect(118 + x, 26 + y, 1, 3);
            g2d.fillRect(113 + x, 26 + y, 1, 5);
            g2d.fillRect(93 + x, 26 + y, 3, 1);
            g2d.fillRect(114 + x, 27 + y, 1, 4);
            g2d.fillRect(96 + x, 29 + y, 1, 1);
            g2d.fillRect(95 + x, 30 + y, 1, 2);
            g2d.fillRect(94 + x, 32 + y, 1, 4);
            g2d.fillRect(98 + x, 35 + y, 1, 1);
            g2d.fillRect(95 + x, 35 + y, 1, 2);
            g2d.fillRect(98 + x, 37 + y, 1, 3);
            g2d.fillRect(99 + x, 38 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(98 + x, 21 + y, 1, 2);
            g2d.fillRect(97 + x, 22 + y, 1, 1);
            g2d.fillRect(96 + x, 23 + y, 1, 1);
            g2d.fillRect(93 + x, 23 + y, 2, 1);
            g2d.fillRect(118 + x, 29 + y, 1, 2);
            g2d.fillRect(95 + x, 32 + y, 1, 3);
        } else {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(104 + x, 12 + y, 1, 2);
            g2d.fillRect(105 + x, 13 + y, 1, 2);
            g2d.fillRect(106 + x, 14 + y, 1, 3);
            g2d.fillRect(107 + x, 16 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(104 + x, 11 + y, 2, 1);
            g2d.fillRect(103 + x, 12 + y, 1, 4);
            g2d.fillRect(105 + x, 12 + y, 1, 1);
            g2d.fillRect(102 + x, 13 + y, 1, 3);
            g2d.fillRect(106 + x, 13 + y, 3, 1);
            g2d.fillRect(101 + x, 14 + y, 1, 2);
            g2d.fillRect(104 + x, 14 + y, 1, 3);
            g2d.fillRect(107 + x, 14 + y, 2, 1);
            g2d.fillRect(105 + x, 15 + y, 1, 4);
            g2d.fillRect(108 + x, 16 + y, 2, 1);
            g2d.fillRect(106 + x, 17 + y, 1, 4);
            g2d.fillRect(107 + x, 18 + y, 1, 3);
            g2d.fillRect(109 + x, 18 + y, 2, 1);
            g2d.fillRect(108 + x, 19 + y, 1, 2);
            g2d.fillRect(110 + x, 19 + y, 3, 1);
            g2d.fillRect(111 + x, 20 + y, 2, 1);
            g2d.fillRect(112 + x, 21 + y, 2, 1);
            g2d.fillRect(114 + x, 22 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(103 + x, 11 + y, 1, 1);
            g2d.fillRect(106 + x, 11 + y, 1, 2);
            g2d.fillRect(107 + x, 11 + y, 1, 2);
            g2d.fillRect(108 + x, 11 + y, 6, 1);
            g2d.fillRect(101 + x, 12 + y, 1, 2);
            g2d.fillRect(102 + x, 12 + y, 1, 1);
            g2d.fillRect(112 + x, 12 + y, 4, 1);
            g2d.fillRect(100 + x, 13 + y, 1, 5);
            g2d.fillRect(113 + x, 13 + y, 1, 2);
            g2d.fillRect(114 + x, 13 + y, 1, 2);
            g2d.fillRect(115 + x, 13 + y, 1, 2);
            g2d.fillRect(116 + x, 13 + y, 1, 3);
            g2d.fillRect(117 + x, 13 + y, 1, 3);
            g2d.fillRect(99 + x, 14 + y, 1, 7);
            g2d.fillRect(109 + x, 14 + y, 1, 2);
            g2d.fillRect(110 + x, 14 + y, 1, 2);
            g2d.fillRect(111 + x, 14 + y, 2, 1);
            g2d.fillRect(118 + x, 14 + y, 1, 4);
            g2d.fillRect(107 + x, 15 + y, 2, 1);
            g2d.fillRect(98 + x, 16 + y, 1, 7);
            g2d.fillRect(101 + x, 16 + y, 3, 1);
            g2d.fillRect(119 + x, 16 + y, 1, 3);
            g2d.fillRect(102 + x, 17 + y, 3, 1);
            g2d.fillRect(108 + x, 17 + y, 1, 2);
            g2d.fillRect(109 + x, 17 + y, 3, 1);
            g2d.fillRect(120 + x, 17 + y, 1, 6);
            g2d.fillRect(97 + x, 18 + y, 1, 8);
            g2d.fillRect(103 + x, 18 + y, 1, 4);
            g2d.fillRect(104 + x, 18 + y, 1, 3);
            g2d.fillRect(111 + x, 18 + y, 7, 1);
            g2d.fillRect(102 + x, 19 + y, 1, 7);
            g2d.fillRect(105 + x, 19 + y, 1, 8);
            g2d.fillRect(117 + x, 19 + y, 2, 1);
            g2d.fillRect(121 + x, 19 + y, 1, 4);
            g2d.fillRect(118 + x, 20 + y, 2, 1);
            g2d.fillRect(96 + x, 21 + y, 1, 6);
            g2d.fillRect(106 + x, 21 + y, 1, 3);
            g2d.fillRect(107 + x, 21 + y, 1, 2);
            g2d.fillRect(114 + x, 21 + y, 1, 1);
            g2d.fillRect(119 + x, 21 + y, 1, 1);
            g2d.fillRect(122 + x, 21 + y, 1, 2);
            g2d.fillRect(115 + x, 22 + y, 1, 2);
            g2d.fillRect(101 + x, 23 + y, 1, 4);
            g2d.fillRect(116 + x, 23 + y, 1, 4);
            g2d.fillRect(117 + x, 24 + y, 1, 4);
            g2d.fillRect(120 + x, 24 + y, 3, 1);
            g2d.fillRect(100 + x, 25 + y, 1, 6);
            g2d.fillRect(121 + x, 25 + y, 2, 1);
            g2d.fillRect(95 + x, 26 + y, 1, 5);
            g2d.fillRect(104 + x, 26 + y, 1, 5);
            g2d.fillRect(118 + x, 26 + y, 1, 3);
            g2d.fillRect(121 + x, 27 + y, 1, 4);
            g2d.fillRect(122 + x, 27 + y, 1, 10);
            g2d.fillRect(119 + x, 28 + y, 1, 1);
            g2d.fillRect(119 + x, 30 + y, 1, 5);
            g2d.fillRect(118 + x, 33 + y, 1, 4);
            g2d.fillRect(114 + x, 37 + y, 1, 2);
            g2d.fillRect(113 + x, 38 + y, 1, 2);
            g2d.fillRect(111 + x, 39 + y, 1, 2);
            g2d.fillRect(112 + x, 39 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(111 + x, 12 + y, 1, 2);
            g2d.fillRect(112 + x, 13 + y, 1, 1);
            g2d.fillRect(111 + x, 15 + y, 1, 2);
            g2d.fillRect(112 + x, 15 + y, 1, 3);
            g2d.fillRect(113 + x, 15 + y, 3, 1);
            g2d.fillRect(110 + x, 16 + y, 1, 1);
            g2d.fillRect(115 + x, 16 + y, 3, 1);
            g2d.fillRect(101 + x, 17 + y, 1, 6);
            g2d.fillRect(113 + x, 17 + y, 1, 1);
            g2d.fillRect(116 + x, 17 + y, 2, 1);
            g2d.fillRect(100 + x, 18 + y, 1, 2);
            g2d.fillRect(102 + x, 18 + y, 1, 1);
            g2d.fillRect(118 + x, 18 + y, 1, 1);
            g2d.fillRect(113 + x, 19 + y, 4, 1);
            g2d.fillRect(119 + x, 19 + y, 1, 1);
            g2d.fillRect(99 + x, 21 + y, 1, 1);
            g2d.fillRect(104 + x, 21 + y, 1, 1);
            g2d.fillRect(100 + x, 23 + y, 1, 2);
            g2d.fillRect(104 + x, 23 + y, 1, 3);
            g2d.fillRect(118 + x, 25 + y, 1, 1);
            g2d.fillRect(99 + x, 26 + y, 1, 5);
            g2d.fillRect(119 + x, 26 + y, 1, 2);
            g2d.fillRect(96 + x, 27 + y, 1, 4);
            g2d.fillRect(103 + x, 27 + y, 1, 4);
            g2d.fillRect(120 + x, 27 + y, 1, 3);
            g2d.fillRect(121 + x, 31 + y, 1, 1);
            g2d.fillRect(117 + x, 34 + y, 1, 1);
            g2d.fillRect(116 + x, 35 + y, 1, 3);
            g2d.fillRect(119 + x, 35 + y, 1, 2);
            g2d.fillRect(115 + x, 36 + y, 1, 4);
            g2d.fillRect(117 + x, 36 + y, 1, 1);
            g2d.fillRect(121 + x, 36 + y, 1, 1);
            g2d.fillRect(114 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(109 + x, 12 + y, 1, 2);
            g2d.fillRect(110 + x, 12 + y, 1, 2);
            g2d.fillRect(113 + x, 16 + y, 2, 1);
            g2d.fillRect(114 + x, 17 + y, 2, 1);
            g2d.fillRect(100 + x, 20 + y, 1, 3);
            g2d.fillRect(113 + x, 20 + y, 5, 1);
            g2d.fillRect(115 + x, 21 + y, 2, 1);
            g2d.fillRect(118 + x, 21 + y, 1, 1);
            g2d.fillRect(99 + x, 22 + y, 1, 4);
            g2d.fillRect(103 + x, 22 + y, 1, 5);
            g2d.fillRect(104 + x, 22 + y, 1, 1);
            g2d.fillRect(116 + x, 22 + y, 1, 1);
            g2d.fillRect(119 + x, 22 + y, 1, 1);
            g2d.fillRect(98 + x, 23 + y, 1, 8);
            g2d.fillRect(117 + x, 23 + y, 2, 1);
            g2d.fillRect(120 + x, 23 + y, 1, 1);
            g2d.fillRect(118 + x, 24 + y, 2, 1);
            g2d.fillRect(119 + x, 25 + y, 2, 1);
            g2d.fillRect(97 + x, 26 + y, 1, 3);
            g2d.fillRect(102 + x, 26 + y, 1, 5);
            g2d.fillRect(120 + x, 26 + y, 3, 1);
            g2d.fillRect(101 + x, 27 + y, 1, 4);
            g2d.fillRect(119 + x, 29 + y, 1, 1);
            g2d.fillRect(120 + x, 30 + y, 1, 2);
            g2d.fillRect(121 + x, 32 + y, 1, 4);
            g2d.fillRect(117 + x, 35 + y, 1, 1);
            g2d.fillRect(120 + x, 35 + y, 1, 2);
            g2d.fillRect(117 + x, 37 + y, 1, 3);
            g2d.fillRect(116 + x, 38 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(117 + x, 21 + y, 1, 2);
            g2d.fillRect(118 + x, 22 + y, 1, 1);
            g2d.fillRect(119 + x, 23 + y, 1, 1);
            g2d.fillRect(121 + x, 23 + y, 2, 1);
            g2d.fillRect(97 + x, 29 + y, 1, 2);
            g2d.fillRect(120 + x, 32 + y, 1, 3);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(0, 0, 0, 0, 0);
        if (y == -1) {
            y = 0;
        }

        if (direction.equalsIgnoreCase("left")) {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(120 + x, 30 + y, 1, 2);
            g2d.fillRect(111 + x, 30 + y, 1, 21);
            g2d.fillRect(115 + x, 34 + y, 1, 18);
            g2d.fillRect(110 + x, 34 + y, 1, 13);
            g2d.fillRect(97 + x, 36 + y, 1, 9);
            g2d.fillRect(101 + x, 39 + y, 1, 6);
            g2d.fillRect(96 + x, 39 + y, 1, 2);
            g2d.fillRect(109 + x, 40 + y, 1, 1);
            g2d.fillRect(118 + x, 42 + y, 1, 9);
            g2d.fillRect(114 + x, 43 + y, 1, 1);
            g2d.fillRect(109 + x, 44 + y, 1, 4);
            g2d.fillRect(102 + x, 44 + y, 1, 4);
            g2d.fillRect(100 + x, 46 + y, 1, 14);
            g2d.fillRect(114 + x, 48 + y, 1, 7);
            g2d.fillRect(108 + x, 48 + y, 1, 2);
            g2d.fillRect(98 + x, 48 + y, 1, 1);
            g2d.fillRect(117 + x, 51 + y, 1, 7);
            g2d.fillRect(99 + x, 51 + y, 1, 1);
            g2d.fillRect(97 + x, 51 + y, 1, 2);
            g2d.fillRect(120 + x, 52 + y, 1, 3);
            g2d.fillRect(119 + x, 52 + y, 1, 1);
            g2d.fillRect(116 + x, 53 + y, 1, 2);
            g2d.fillRect(113 + x, 53 + y, 1, 2);
            g2d.fillRect(99 + x, 53 + y, 1, 3);
            g2d.fillRect(115 + x, 54 + y, 1, 3);
            g2d.fillRect(112 + x, 54 + y, 1, 1);
            g2d.fillRect(101 + x, 54 + y, 1, 1);
            g2d.fillRect(98 + x, 55 + y, 1, 2);
            g2d.fillRect(118 + x, 59 + y, 1, 6);
            g2d.fillRect(116 + x, 60 + y, 1, 8);
            g2d.fillRect(117 + x, 62 + y, 1, 5);
            g2d.fillRect(115 + x, 62 + y, 1, 1);
            g2d.fillRect(105 + x, 40, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(116 + x, 30 + y, 1, 23);
            g2d.fillRect(112 + x, 30 + y, 1, 9);
            g2d.fillRect(120 + x, 32 + y, 1, 8);
            g2d.fillRect(119 + x, 35 + y, 1, 17);
            g2d.fillRect(96 + x, 36 + y, 1, 3);
            g2d.fillRect(95 + x, 36 + y, 1, 21);
            g2d.fillRect(94 + x, 36 + y, 1, 10);
            g2d.fillRect(93 + x, 36 + y, 1, 14);
            g2d.fillRect(118 + x, 37 + y, 1, 1);
            g2d.fillRect(118 + x, 39 + y, 1, 3);
            g2d.fillRect(102 + x, 39 + y, 1, 5);
            g2d.fillRect(100 + x, 39 + y, 1, 7);
            g2d.fillRect(113 + x, 41 + y, 1, 12);
            g2d.fillRect(96 + x, 41 + y, 1, 2);
            g2d.fillRect(98 + x, 43 + y, 1, 5);
            g2d.fillRect(117 + x, 44 + y, 1, 1);
            g2d.fillRect(114 + x, 44 + y, 1, 3);
            g2d.fillRect(120 + x, 45 + y, 1, 7);
            g2d.fillRect(101 + x, 45 + y, 1, 8);
            g2d.fillRect(97 + x, 45 + y, 1, 2);
            g2d.fillRect(117 + x, 46 + y, 1, 5);
            g2d.fillRect(96 + x, 47 + y, 1, 4);
            g2d.fillRect(112 + x, 48 + y, 1, 6);
            g2d.fillRect(102 + x, 48 + y, 1, 1);
            g2d.fillRect(98 + x, 49 + y, 1, 4);
            g2d.fillRect(99 + x, 50 + y, 1, 1);
            g2d.fillRect(97 + x, 50 + y, 1, 1);
            g2d.fillRect(118 + x, 51 + y, 1, 8);
            g2d.fillRect(94 + x, 51 + y, 1, 3);
            g2d.fillRect(119 + x, 53 + y, 1, 10);
            g2d.fillRect(97 + x, 53 + y, 1, 2);
            g2d.fillRect(101 + x, 55 + y, 1, 5);
            g2d.fillRect(96 + x, 55 + y, 1, 3);
            g2d.fillRect(114 + x, 56 + y, 1, 7);
            g2d.fillRect(99 + x, 56 + y, 1, 2);
            g2d.fillRect(117 + x, 58 + y, 1, 4);
            g2d.fillRect(97 + x, 58 + y, 1, 1);
            g2d.fillRect(100 + x, 60 + y, 1, 2);
            g2d.fillRect(103 + x, 41, 2, 1);
            g2d.fillRect(103 + x, 42, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(119 + x, 30 + y, 1, 2);
            g2d.fillRect(117 + x, 30 + y, 1, 14);
            g2d.fillRect(115 + x, 30 + y, 1, 4);
            g2d.fillRect(114 + x, 30 + y, 1, 2);
            g2d.fillRect(113 + x, 30 + y, 1, 11);
            g2d.fillRect(118 + x, 32 + y, 1, 1);
            g2d.fillRect(114 + x, 34 + y, 1, 9);
            g2d.fillRect(118 + x, 38 + y, 1, 1);
            g2d.fillRect(112 + x, 39 + y, 1, 9);
            g2d.fillRect(98 + x, 39 + y, 1, 4);
            g2d.fillRect(120 + x, 40 + y, 1, 5);
            g2d.fillRect(99 + x, 43 + y, 1, 7);
            g2d.fillRect(96 + x, 43 + y, 1, 2);
            g2d.fillRect(117 + x, 45 + y, 1, 1);
            g2d.fillRect(114 + x, 47 + y, 1, 1);
            g2d.fillRect(94 + x, 48 + y, 1, 3);
            g2d.fillRect(96 + x, 51 + y, 1, 2);
            g2d.fillRect(115 + x, 52 + y, 1, 2);
            g2d.fillRect(99 + x, 52 + y, 1, 1);
            g2d.fillRect(116 + x, 55 + y, 1, 5);
            g2d.fillRect(113 + x, 55 + y, 2, 1);
            g2d.fillRect(113 + x, 56 + y, 1, 2);
            g2d.fillRect(115 + x, 57 + y, 1, 5);
            g2d.fillRect(98 + x, 57 + y, 1, 3);
            g2d.fillRect(99 + x, 60 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(118 + x, 30 + y, 1, 2);
            g2d.fillRect(119 + x, 32 + y, 1, 3);
            g2d.fillRect(114 + x, 32 + y, 1, 2);
            g2d.fillRect(118 + x, 33 + y, 1, 4);
            g2d.fillRect(99 + x, 39 + y, 1, 4);
            g2d.fillRect(96 + x, 45 + y, 1, 2);
            g2d.fillRect(94 + x, 46 + y, 1, 2);
            g2d.fillRect(97 + x, 47 + y, 1, 3);
            g2d.fillRect(92 + x, 47 + y, 1, 1);
            g2d.fillRect(101 + x, 53 + y, 1, 1);
            g2d.fillRect(96 + x, 53 + y, 1, 2);
            g2d.fillRect(97 + x, 55 + y, 1, 3);
        } else {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(111 + x, 41, 2, 1);
            g2d.fillRect(112 + x, 42, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(95 + x, 30 + y, 1, 2);
            g2d.fillRect(104 + x, 30 + y, 1, 21);
            g2d.fillRect(100 + x, 34 + y, 1, 18);
            g2d.fillRect(105 + x, 34 + y, 1, 13);
            g2d.fillRect(118 + x, 36 + y, 1, 9);
            g2d.fillRect(114 + x, 39 + y, 1, 6);
            g2d.fillRect(119 + x, 39 + y, 1, 2);
            g2d.fillRect(106 + x, 40 + y, 1, 1);
            g2d.fillRect(97 + x, 42 + y, 1, 9);
            g2d.fillRect(101 + x, 43 + y, 1, 1);
            g2d.fillRect(106 + x, 44 + y, 1, 4);
            g2d.fillRect(113 + x, 44 + y, 1, 4);
            g2d.fillRect(115 + x, 46 + y, 1, 14);
            g2d.fillRect(101 + x, 48 + y, 1, 7);
            g2d.fillRect(107 + x, 48 + y, 1, 2);
            g2d.fillRect(117 + x, 48 + y, 1, 1);
            g2d.fillRect(98 + x, 51 + y, 1, 7);
            g2d.fillRect(116 + x, 51 + y, 1, 1);
            g2d.fillRect(118 + x, 51 + y, 1, 2);
            g2d.fillRect(95 + x, 52 + y, 1, 3);
            g2d.fillRect(96 + x, 52 + y, 1, 1);
            g2d.fillRect(99 + x, 53 + y, 1, 2);
            g2d.fillRect(102 + x, 53 + y, 1, 2);
            g2d.fillRect(116 + x, 53 + y, 1, 3);
            g2d.fillRect(100 + x, 54 + y, 1, 3);
            g2d.fillRect(103 + x, 54 + y, 1, 1);
            g2d.fillRect(114 + x, 54 + y, 1, 1);
            g2d.fillRect(117 + x, 55 + y, 1, 2);
            g2d.fillRect(97 + x, 59 + y, 1, 6);
            g2d.fillRect(99 + x, 60 + y, 1, 8);
            g2d.fillRect(98 + x, 62 + y, 1, 5);
            g2d.fillRect(100 + x, 62 + y, 1, 1);
            g2d.fillRect(110 + x, 40, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(99 + x, 30 + y, 1, 23);
            g2d.fillRect(103 + x, 30 + y, 1, 9);
            g2d.fillRect(95 + x, 32 + y, 1, 8);
            g2d.fillRect(96 + x, 35 + y, 1, 17);
            g2d.fillRect(119 + x, 36 + y, 1, 3);
            g2d.fillRect(120 + x, 36 + y, 1, 21);
            g2d.fillRect(121 + x, 36 + y, 1, 10);
            g2d.fillRect(122 + x, 36 + y, 1, 14);
            g2d.fillRect(97 + x, 37 + y, 1, 1);
            g2d.fillRect(97 + x, 39 + y, 1, 3);
            g2d.fillRect(113 + x, 39 + y, 1, 5);
            g2d.fillRect(115 + x, 39 + y, 1, 7);
            g2d.fillRect(102 + x, 41 + y, 1, 12);
            g2d.fillRect(119 + x, 41 + y, 1, 2);
            g2d.fillRect(117 + x, 43 + y, 1, 5);
            g2d.fillRect(98 + x, 44 + y, 1, 1);
            g2d.fillRect(101 + x, 44 + y, 1, 3);
            g2d.fillRect(95 + x, 45 + y, 1, 7);
            g2d.fillRect(114 + x, 45 + y, 1, 8);
            g2d.fillRect(118 + x, 45 + y, 1, 2);
            g2d.fillRect(98 + x, 46 + y, 1, 5);
            g2d.fillRect(119 + x, 47 + y, 1, 4);
            g2d.fillRect(103 + x, 48 + y, 1, 6);
            g2d.fillRect(113 + x, 48 + y, 1, 1);
            g2d.fillRect(117 + x, 49 + y, 1, 4);
            g2d.fillRect(116 + x, 50 + y, 1, 1);
            g2d.fillRect(118 + x, 50 + y, 1, 1);
            g2d.fillRect(97 + x, 51 + y, 1, 8);
            g2d.fillRect(121 + x, 51 + y, 1, 3);
            g2d.fillRect(96 + x, 53 + y, 1, 10);
            g2d.fillRect(118 + x, 53 + y, 1, 2);
            g2d.fillRect(114 + x, 55 + y, 1, 5);
            g2d.fillRect(119 + x, 55 + y, 1, 3);
            g2d.fillRect(101 + x, 56 + y, 1, 7);
            g2d.fillRect(116 + x, 56 + y, 1, 2);
            g2d.fillRect(98 + x, 58 + y, 1, 4);
            g2d.fillRect(118 + x, 58 + y, 1, 1);
            g2d.fillRect(115 + x, 60 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(96 + x, 30 + y, 1, 2);
            g2d.fillRect(98 + x, 30 + y, 1, 14);
            g2d.fillRect(100 + x, 30 + y, 1, 4);
            g2d.fillRect(101 + x, 30 + y, 1, 2);
            g2d.fillRect(102 + x, 30 + y, 1, 11);
            g2d.fillRect(97 + x, 32 + y, 1, 1);
            g2d.fillRect(101 + x, 34 + y, 1, 9);
            g2d.fillRect(97 + x, 38 + y, 1, 1);
            g2d.fillRect(103 + x, 39 + y, 1, 9);
            g2d.fillRect(117 + x, 39 + y, 1, 4);
            g2d.fillRect(95 + x, 40 + y, 1, 5);
            g2d.fillRect(116 + x, 43 + y, 1, 7);
            g2d.fillRect(119 + x, 43 + y, 1, 2);
            g2d.fillRect(98 + x, 45 + y, 1, 1);
            g2d.fillRect(101 + x, 47 + y, 1, 1);
            g2d.fillRect(121 + x, 48 + y, 1, 3);
            g2d.fillRect(119 + x, 51 + y, 1, 2);
            g2d.fillRect(100 + x, 52 + y, 1, 2);
            g2d.fillRect(116 + x, 52 + y, 1, 1);
            g2d.fillRect(99 + x, 55 + y, 1, 5);
            g2d.fillRect(101 + x, 55 + y, 2, 1);
            g2d.fillRect(102 + x, 56 + y, 1, 2);
            g2d.fillRect(100 + x, 57 + y, 1, 5);
            g2d.fillRect(117 + x, 57 + y, 1, 3);
            g2d.fillRect(116 + x, 60 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(97 + x, 30 + y, 1, 2);
            g2d.fillRect(96 + x, 32 + y, 1, 3);
            g2d.fillRect(101 + x, 32 + y, 1, 2);
            g2d.fillRect(97 + x, 33 + y, 1, 4);
            g2d.fillRect(116 + x, 39 + y, 1, 4);
            g2d.fillRect(119 + x, 45 + y, 1, 2);
            g2d.fillRect(121 + x, 46 + y, 1, 2);
            g2d.fillRect(118 + x, 47 + y, 1, 3);
            g2d.fillRect(123 + x, 47 + y, 1, 1);
            g2d.fillRect(114 + x, 53 + y, 1, 1);
            g2d.fillRect(119 + x, 53 + y, 1, 2);
            g2d.fillRect(118 + x, 55 + y, 1, 3);
        }
    }
}
