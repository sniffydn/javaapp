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
public class LongStraight26 extends SuperHLong {

    public LongStraight26() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight26(int step, int dir) {
        super(step, dir);
    }

    public LongStraight26(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 3);
        g2d.fillRect(101 + x, 13 + y, 1, 4);
        g2d.fillRect(115 + x, 13 + y, 3, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 4);
        g2d.fillRect(117 + x, 14 + y, 1, 3);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 5);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 5);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 4);
        g2d.fillRect(114 + x, 17 + y, 1, 5);
        g2d.fillRect(115 + x, 17 + y, 1, 8);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 4);
        g2d.fillRect(105 + x, 18 + y, 1, 3);
        g2d.fillRect(108 + x, 18 + y, 1, 3);
        g2d.fillRect(109 + x, 18 + y, 1, 3);
        g2d.fillRect(110 + x, 18 + y, 1, 3);
        g2d.fillRect(111 + x, 18 + y, 1, 3);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(119 + x, 18 + y, 1, 3);
        g2d.fillRect(103 + x, 20 + y, 1, 3);
        g2d.fillRect(102 + x, 21 + y, 1, 4);
        g2d.fillRect(118 + x, 22 + y, 1, 3);
        g2d.fillRect(120 + x, 22 + y, 1, 5);
        g2d.fillRect(99 + x, 23 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(98 + x, 24 + y, 1, 4);
        g2d.fillRect(101 + x, 24 + y, 1, 3);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 6);
        g2d.fillRect(97 + x, 26 + y, 1, 8);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 9);
        g2d.fillRect(105 + x, 32 + y, 1, 11);
        g2d.fillRect(118 + x, 32 + y, 1, 9);
        g2d.fillRect(98 + x, 33 + y, 1, 5);
        g2d.fillRect(104 + x, 34 + y, 1, 9);
        g2d.fillRect(117 + x, 34 + y, 1, 7);
        g2d.fillRect(99 + x, 35 + y, 1, 3);
        g2d.fillRect(116 + x, 35 + y, 1, 5);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(123 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 11 + y, 1, 3);
        g2d.fillRect(105 + x, 11 + y, 8, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 3);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 3);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 3);
        g2d.fillRect(98 + x, 20 + y, 1, 2);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 2);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 22 + y, 1, 3);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(122 + x, 24 + y, 1, 8);
        g2d.fillRect(97 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 2);
        g2d.fillRect(100 + x, 26 + y, 1, 4);
        g2d.fillRect(101 + x, 27 + y, 1, 2);
        g2d.fillRect(98 + x, 28 + y, 1, 5);
        g2d.fillRect(120 + x, 28 + y, 1, 8);
        g2d.fillRect(121 + x, 31 + y, 1, 1);
        g2d.fillRect(102 + x, 34 + y, 2, 1);
        g2d.fillRect(103 + x, 35 + y, 1, 8);
        g2d.fillRect(115 + x, 37 + y, 1, 3);
        g2d.fillRect(114 + x, 38 + y, 1, 5);
        g2d.fillRect(113 + x, 39 + y, 1, 3);
        g2d.fillRect(116 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 12 + y, 7, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 3);
        g2d.fillRect(118 + x, 14 + y, 1, 3);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 2);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 3);
        g2d.fillRect(101 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 2, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 7);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 9);
        g2d.fillRect(118 + x, 18 + y, 1, 4);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 21 + y, 1, 3);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 2);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 3);
        g2d.fillRect(122 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 3, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 8);
        g2d.fillRect(120 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 30 + y, 1, 8);
        g2d.fillRect(101 + x, 34 + y, 1, 4);
        g2d.fillRect(102 + x, 35 + y, 1, 8);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 4, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 3);
        g2d.fillRect(110 + x, 14 + y, 1, 3);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 3);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 2, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 2);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(96 + x, 26 + y, 1, 7);
        g2d.fillRect(95 + x, 27 + y, 1, 12);
        g2d.fillRect(121 + x, 31 + y, 1, 7);
        g2d.fillRect(97 + x, 33 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 6);
        g2d.fillRect(98 + x, 37 + y, 1, 30);
        g2d.fillRect(99 + x, 37 + y, 1, 17);
        g2d.fillRect(115 + x, 40 + y, 1, 14);
        g2d.fillRect(117 + x, 40 + y, 1, 14);
        g2d.fillRect(118 + x, 40 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 5);
        g2d.fillRect(105 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 2);
        g2d.fillRect(97 + x, 52 + y, 1, 11);
        g2d.fillRect(114 + x, 54 + y, 1, 27);
        g2d.fillRect(116 + x, 54 + y, 1, 10);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 66 + y, 1, 2);
        g2d.fillRect(99 + x, 67 + y, 1, 9);
        g2d.fillRect(116 + x, 67 + y, 1, 10);
        g2d.fillRect(100 + x, 72 + y, 1, 10);
        g2d.fillRect(115 + x, 73 + y, 1, 7);
        g2d.fillRect(101 + x, 79 + y, 1, 5);
        g2d.fillRect(114 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 25 + y, 1, 5);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(122 + x, 31 + y, 1, 2);
        g2d.fillRect(96 + x, 33 + y, 1, 1);
        g2d.fillRect(97 + x, 34 + y, 1, 15);
        g2d.fillRect(119 + x, 35 + y, 1, 3);
        g2d.fillRect(120 + x, 35 + y, 1, 15);
        g2d.fillRect(100 + x, 37 + y, 1, 17);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 14);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 16);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 10);
        g2d.fillRect(114 + x, 42 + y, 1, 8);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 6);
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 11);
        g2d.fillRect(102 + x, 54 + y, 1, 7);
        g2d.fillRect(113 + x, 54 + y, 1, 6);
        g2d.fillRect(115 + x, 54 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 13);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 7);
        g2d.fillRect(113 + x, 61 + y, 1, 3);
        g2d.fillRect(116 + x, 64 + y, 1, 3);
        g2d.fillRect(101 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 4);
        g2d.fillRect(101 + x, 74 + y, 1, 3);
        g2d.fillRect(101 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 24 + y, 1, 2);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(119 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 6);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 10);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 4);
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 54 + y, 1, 3);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(101 + x, 59 + y, 1, 9);
        g2d.fillRect(117 + x, 59 + y, 1, 9);
        g2d.fillRect(99 + x, 65 + y, 1, 2);
        g2d.fillRect(113 + x, 66 + y, 1, 11);
        g2d.fillRect(115 + x, 66 + y, 1, 3);
        g2d.fillRect(102 + x, 68 + y, 1, 11);
        g2d.fillRect(100 + x, 70 + y, 1, 2);
        g2d.fillRect(101 + x, 71 + y, 1, 3);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 2);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 3, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 2, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 3);
        g2d.fillRect(113 + x, 22 + y, 1, 2);
        g2d.fillRect(114 + x, 22 + y, 1, 4);
        g2d.fillRect(102 + x, 24 + y, 1, 2);
        g2d.fillRect(108 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 2);
        g2d.fillRect(112 + x, 26 + y, 1, 2);
        g2d.fillRect(110 + x, 27 + y, 1, 3);
        g2d.fillRect(111 + x, 27 + y, 1, 2);
        g2d.fillRect(109 + x, 28 + y, 1, 2);
        g2d.fillRect(103 + x, 29 + y, 1, 1);
        g2d.fillRect(106 + x, 29 + y, 1, 4);
        g2d.fillRect(107 + x, 29 + y, 1, 3);
        g2d.fillRect(108 + x, 29 + y, 1, 2);
        g2d.fillRect(102 + x, 30 + y, 1, 1);
        g2d.fillRect(104 + x, 31 + y, 1, 4);
        g2d.fillRect(105 + x, 31 + y, 1, 2);
        g2d.fillRect(101 + x, 32 + y, 1, 3);
        g2d.fillRect(103 + x, 33 + y, 1, 2);
        g2d.fillRect(102 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 19 + y, 1, 4);
        g2d.fillRect(107 + x, 20 + y, 1, 3);
        g2d.fillRect(108 + x, 20 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 4);
        g2d.fillRect(110 + x, 21 + y, 1, 6);
        g2d.fillRect(111 + x, 21 + y, 1, 3);
        g2d.fillRect(105 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 3);
        g2d.fillRect(112 + x, 24 + y, 1, 2);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 1);
        g2d.fillRect(107 + x, 26 + y, 1, 1);
        g2d.fillRect(109 + x, 26 + y, 1, 2);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(108 + x, 27 + y, 1, 2);
        g2d.fillRect(106 + x, 28 + y, 2, 1);
        g2d.fillRect(101 + x, 29 + y, 1, 3);
        g2d.fillRect(102 + x, 29 + y, 1, 1);
        g2d.fillRect(105 + x, 29 + y, 1, 2);
        g2d.fillRect(103 + x, 30 + y, 1, 3);
        g2d.fillRect(104 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 23 + y, 1, 5);
        g2d.fillRect(107 + x, 23 + y, 1, 3);
        g2d.fillRect(108 + x, 23 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 5);
        g2d.fillRect(109 + x, 24 + y, 1, 2);
        g2d.fillRect(111 + x, 24 + y, 1, 2);
        g2d.fillRect(103 + x, 26 + y, 1, 3);
        g2d.fillRect(104 + x, 26 + y, 1, 4);
        g2d.fillRect(108 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 27 + y, 1, 2);
        g2d.fillRect(107 + x, 27 + y, 1, 1);
        g2d.fillRect(101 + x, 28 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 13 + y, 1, 4);
        g2d.fillRect(98 + x, 13 + y, 3, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 4);
        g2d.fillRect(98 + x, 14 + y, 1, 3);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 5);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 5);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 4);
        g2d.fillRect(101 + x, 17 + y, 1, 5);
        g2d.fillRect(100 + x, 17 + y, 1, 8);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 4);
        g2d.fillRect(110 + x, 18 + y, 1, 3);
        g2d.fillRect(107 + x, 18 + y, 1, 3);
        g2d.fillRect(106 + x, 18 + y, 1, 3);
        g2d.fillRect(105 + x, 18 + y, 1, 3);
        g2d.fillRect(104 + x, 18 + y, 1, 3);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(96 + x, 18 + y, 1, 3);
        g2d.fillRect(112 + x, 20 + y, 1, 3);
        g2d.fillRect(113 + x, 21 + y, 1, 4);
        g2d.fillRect(97 + x, 22 + y, 1, 3);
        g2d.fillRect(95 + x, 22 + y, 1, 5);
        g2d.fillRect(116 + x, 23 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(117 + x, 24 + y, 1, 4);
        g2d.fillRect(114 + x, 24 + y, 1, 3);
        g2d.fillRect(98 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 25 + y, 1, 6);
        g2d.fillRect(118 + x, 26 + y, 1, 8);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 9);
        g2d.fillRect(110 + x, 32 + y, 1, 11);
        g2d.fillRect(97 + x, 32 + y, 1, 9);
        g2d.fillRect(117 + x, 33 + y, 1, 5);
        g2d.fillRect(111 + x, 34 + y, 1, 9);
        g2d.fillRect(98 + x, 34 + y, 1, 7);
        g2d.fillRect(116 + x, 35 + y, 1, 3);
        g2d.fillRect(99 + x, 35 + y, 1, 5);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(92 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 11 + y, 1, 3);
        g2d.fillRect(103 + x, 11 + y, 8, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 1, 3);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 3);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 3);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 2);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 22 + y, 1, 3);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(93 + x, 24 + y, 1, 8);
        g2d.fillRect(118 + x, 25 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 2);
        g2d.fillRect(115 + x, 26 + y, 1, 4);
        g2d.fillRect(114 + x, 27 + y, 1, 2);
        g2d.fillRect(117 + x, 28 + y, 1, 5);
        g2d.fillRect(95 + x, 28 + y, 1, 8);
        g2d.fillRect(94 + x, 31 + y, 1, 1);
        g2d.fillRect(112 + x, 34 + y, 2, 1);
        g2d.fillRect(112 + x, 35 + y, 1, 8);
        g2d.fillRect(100 + x, 37 + y, 1, 3);
        g2d.fillRect(101 + x, 38 + y, 1, 5);
        g2d.fillRect(102 + x, 39 + y, 1, 3);
        g2d.fillRect(99 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 12 + y, 7, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 2);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 3);
        g2d.fillRect(97 + x, 14 + y, 1, 3);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 2);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 3);
        g2d.fillRect(114 + x, 17 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 2, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 7);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 9);
        g2d.fillRect(97 + x, 18 + y, 1, 4);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 21 + y, 1, 3);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 2);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 3);
        g2d.fillRect(93 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 3, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 8);
        g2d.fillRect(95 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 30 + y, 1, 8);
        g2d.fillRect(114 + x, 34 + y, 1, 4);
        g2d.fillRect(113 + x, 35 + y, 1, 8);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 4, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 3);
        g2d.fillRect(105 + x, 14 + y, 1, 3);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 3);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 2, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 26 + y, 1, 7);
        g2d.fillRect(120 + x, 27 + y, 1, 12);
        g2d.fillRect(94 + x, 31 + y, 1, 7);
        g2d.fillRect(118 + x, 33 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 6);
        g2d.fillRect(117 + x, 37 + y, 1, 30);
        g2d.fillRect(116 + x, 37 + y, 1, 17);
        g2d.fillRect(100 + x, 40 + y, 1, 14);
        g2d.fillRect(98 + x, 40 + y, 1, 14);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 5);
        g2d.fillRect(110 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 11);
        g2d.fillRect(101 + x, 54 + y, 1, 27);
        g2d.fillRect(99 + x, 54 + y, 1, 10);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 67 + y, 1, 9);
        g2d.fillRect(99 + x, 67 + y, 1, 10);
        g2d.fillRect(115 + x, 72 + y, 1, 10);
        g2d.fillRect(100 + x, 73 + y, 1, 7);
        g2d.fillRect(114 + x, 79 + y, 1, 5);
        g2d.fillRect(101 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 5);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(93 + x, 31 + y, 1, 2);
        g2d.fillRect(119 + x, 33 + y, 1, 1);
        g2d.fillRect(118 + x, 34 + y, 1, 15);
        g2d.fillRect(96 + x, 35 + y, 1, 3);
        g2d.fillRect(95 + x, 35 + y, 1, 15);
        g2d.fillRect(115 + x, 37 + y, 1, 17);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 14);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 16);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(112 + x, 42 + y, 1, 10);
        g2d.fillRect(101 + x, 42 + y, 1, 8);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 6);
        g2d.fillRect(113 + x, 48 + y, 1, 2);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 11);
        g2d.fillRect(113 + x, 54 + y, 1, 7);
        g2d.fillRect(102 + x, 54 + y, 1, 6);
        g2d.fillRect(100 + x, 54 + y, 1, 4);
        g2d.fillRect(98 + x, 56 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 13);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 59 + y, 1, 7);
        g2d.fillRect(102 + x, 61 + y, 1, 3);
        g2d.fillRect(99 + x, 64 + y, 1, 3);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(98 + x, 68 + y, 1, 1);
        g2d.fillRect(100 + x, 69 + y, 1, 4);
        g2d.fillRect(114 + x, 74 + y, 1, 3);
        g2d.fillRect(114 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 24 + y, 1, 2);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(96 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 6);
        g2d.fillRect(114 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 10);
        g2d.fillRect(114 + x, 45 + y, 1, 3);
        g2d.fillRect(113 + x, 50 + y, 1, 4);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(114 + x, 54 + y, 1, 3);
        g2d.fillRect(98 + x, 54 + y, 1, 2);
        g2d.fillRect(97 + x, 57 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 9);
        g2d.fillRect(98 + x, 59 + y, 1, 9);
        g2d.fillRect(116 + x, 65 + y, 1, 2);
        g2d.fillRect(102 + x, 66 + y, 1, 11);
        g2d.fillRect(100 + x, 66 + y, 1, 3);
        g2d.fillRect(113 + x, 68 + y, 1, 11);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 3);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(99 + x, 77 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 83 + y, 1, 2);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 3, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 2, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 3);
        g2d.fillRect(102 + x, 22 + y, 1, 2);
        g2d.fillRect(101 + x, 22 + y, 1, 4);
        g2d.fillRect(113 + x, 24 + y, 1, 2);
        g2d.fillRect(107 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 2);
        g2d.fillRect(103 + x, 26 + y, 1, 2);
        g2d.fillRect(105 + x, 27 + y, 1, 3);
        g2d.fillRect(104 + x, 27 + y, 1, 2);
        g2d.fillRect(106 + x, 28 + y, 1, 2);
        g2d.fillRect(112 + x, 29 + y, 1, 1);
        g2d.fillRect(109 + x, 29 + y, 1, 4);
        g2d.fillRect(108 + x, 29 + y, 1, 3);
        g2d.fillRect(107 + x, 29 + y, 1, 2);
        g2d.fillRect(113 + x, 30 + y, 1, 1);
        g2d.fillRect(111 + x, 31 + y, 1, 4);
        g2d.fillRect(110 + x, 31 + y, 1, 2);
        g2d.fillRect(114 + x, 32 + y, 1, 3);
        g2d.fillRect(112 + x, 33 + y, 1, 2);
        g2d.fillRect(113 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 19 + y, 1, 4);
        g2d.fillRect(108 + x, 20 + y, 1, 3);
        g2d.fillRect(107 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 4);
        g2d.fillRect(105 + x, 21 + y, 1, 6);
        g2d.fillRect(104 + x, 21 + y, 1, 3);
        g2d.fillRect(110 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 3);
        g2d.fillRect(103 + x, 24 + y, 1, 2);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 1, 1);
        g2d.fillRect(108 + x, 26 + y, 1, 1);
        g2d.fillRect(106 + x, 26 + y, 1, 2);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(107 + x, 27 + y, 1, 2);
        g2d.fillRect(108 + x, 28 + y, 2, 1);
        g2d.fillRect(114 + x, 29 + y, 1, 3);
        g2d.fillRect(113 + x, 29 + y, 1, 1);
        g2d.fillRect(110 + x, 29 + y, 1, 2);
        g2d.fillRect(112 + x, 30 + y, 1, 3);
        g2d.fillRect(111 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 23 + y, 1, 5);
        g2d.fillRect(108 + x, 23 + y, 1, 3);
        g2d.fillRect(107 + x, 23 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 5);
        g2d.fillRect(106 + x, 24 + y, 1, 2);
        g2d.fillRect(104 + x, 24 + y, 1, 2);
        g2d.fillRect(112 + x, 26 + y, 1, 3);
        g2d.fillRect(111 + x, 26 + y, 1, 4);
        g2d.fillRect(107 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 27 + y, 1, 2);
        g2d.fillRect(108 + x, 27 + y, 1, 1);
        g2d.fillRect(114 + x, 28 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(204, 191, 170));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(204, 204, 204));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 223, 170));
        COLORS.set(ImageUtilities.GREY, new Color(221, 221, 221));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 170));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
