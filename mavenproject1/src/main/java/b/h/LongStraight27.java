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
public class LongStraight27 extends SuperHLong {

    public LongStraight27() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight27(int step, int dir) {
        super(step, dir);
    }

    public LongStraight27(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 11 + y, 1, 3);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 5);
        g2d.fillRect(111 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 7);
        g2d.fillRect(109 + x, 12 + y, 1, 5);
        g2d.fillRect(105 + x, 13 + y, 1, 5);
        g2d.fillRect(108 + x, 13 + y, 1, 4);
        g2d.fillRect(102 + x, 14 + y, 1, 4);
        g2d.fillRect(103 + x, 14 + y, 1, 3);
        g2d.fillRect(104 + x, 14 + y, 1, 3);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 4);
        g2d.fillRect(111 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(123 + x, 23 + y, 1, 10);
        g2d.fillRect(124 + x, 26 + y, 1, 3);
        g2d.fillRect(122 + x, 27 + y, 1, 7);
        g2d.fillRect(120 + x, 29 + y, 2, 1);
        g2d.fillRect(121 + x, 30 + y, 1, 3);
        g2d.fillRect(118 + x, 33 + y, 1, 4);
        g2d.fillRect(117 + x, 34 + y, 1, 3);
        g2d.fillRect(116 + x, 35 + y, 1, 5);
        g2d.fillRect(115 + x, 36 + y, 1, 4);
        g2d.fillRect(105 + x, 37 + y, 1, 4);
        g2d.fillRect(114 + x, 37 + y, 1, 3);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(106 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 34 + y, 1, 3);
        g2d.fillRect(106 + x, 35 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 11 + y, 4, 1);
        g2d.fillRect(116 + x, 12 + y, 3, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 2, 1);
        g2d.fillRect(118 + x, 13 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 2, 1);
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 3, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 3);
        g2d.fillRect(120 + x, 34 + y, 1, 3);
        g2d.fillRect(102 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 11 + y, 1, 3);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 4);
        g2d.fillRect(113 + x, 12 + y, 1, 2);
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(115 + x, 13 + y, 3, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 3, 1);
        g2d.fillRect(118 + x, 15 + y, 2, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 3);
        g2d.fillRect(119 + x, 16 + y, 2, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 3);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 2);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(121 + x, 17 + y, 1, 4);
        g2d.fillRect(105 + x, 18 + y, 1, 3);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 5);
        g2d.fillRect(107 + x, 19 + y, 1, 4);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(105 + x, 23 + y, 1, 2);
        g2d.fillRect(96 + x, 28 + y, 1, 6);
        g2d.fillRect(104 + x, 29 + y, 1, 12);
        g2d.fillRect(124 + x, 29 + y, 1, 4);
        g2d.fillRect(120 + x, 30 + y, 1, 4);
        g2d.fillRect(119 + x, 31 + y, 1, 3);
        g2d.fillRect(97 + x, 33 + y, 1, 2);
        g2d.fillRect(123 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 3);
        g2d.fillRect(115 + x, 14 + y, 1, 3);
        g2d.fillRect(114 + x, 15 + y, 1, 3);
        g2d.fillRect(116 + x, 15 + y, 1, 3);
        g2d.fillRect(117 + x, 15 + y, 1, 3);
        g2d.fillRect(101 + x, 16 + y, 1, 3);
        g2d.fillRect(118 + x, 16 + y, 1, 3);
        g2d.fillRect(100 + x, 17 + y, 1, 3);
        g2d.fillRect(119 + x, 17 + y, 1, 3);
        g2d.fillRect(99 + x, 18 + y, 1, 4);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 5);
        g2d.fillRect(103 + x, 19 + y, 1, 3);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 2, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(120 + x, 19 + y, 1, 3);
        g2d.fillRect(122 + x, 19 + y, 1, 8);
        g2d.fillRect(104 + x, 20 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 3, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(97 + x, 21 + y, 1, 3);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 2);
        g2d.fillRect(121 + x, 21 + y, 1, 6);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 2);
        g2d.fillRect(97 + x, 27 + y, 1, 6);
        g2d.fillRect(104 + x, 27 + y, 1, 2);
        g2d.fillRect(99 + x, 30 + y, 1, 5);
        g2d.fillRect(101 + x, 35 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 17 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 3);
        g2d.fillRect(116 + x, 18 + y, 2, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 16);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 17);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 3);
        g2d.fillRect(119 + x, 20 + y, 1, 4);
        g2d.fillRect(99 + x, 22 + y, 1, 8);
        g2d.fillRect(102 + x, 22 + y, 1, 19);
        g2d.fillRect(103 + x, 22 + y, 1, 19);
        g2d.fillRect(120 + x, 22 + y, 1, 3);
        g2d.fillRect(104 + x, 23 + y, 1, 4);
        g2d.fillRect(97 + x, 24 + y, 1, 3);
        g2d.fillRect(98 + x, 24 + y, 1, 11);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(122 + x, 33 + y, 1, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 14);
        g2d.fillRect(118 + x, 36 + y, 1, 3);
        g2d.fillRect(112 + x, 39 + y, 5, 1);
        g2d.fillRect(105 + x, 40 + y, 1, 3);
        g2d.fillRect(106 + x, 40 + y, 1, 7);
        g2d.fillRect(113 + x, 40 + y, 1, 2);
        g2d.fillRect(114 + x, 40 + y, 1, 5);
        g2d.fillRect(115 + x, 40 + y, 1, 8);
        g2d.fillRect(116 + x, 40 + y, 1, 13);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 33 + y, 1, 2);
        g2d.fillRect(96 + x, 34 + y, 1, 3);
        g2d.fillRect(97 + x, 36 + y, 1, 5);
        g2d.fillRect(119 + x, 36 + y, 1, 5);
        g2d.fillRect(120 + x, 36 + y, 1, 3);
        g2d.fillRect(118 + x, 39 + y, 1, 14);
        g2d.fillRect(122 + x, 39 + y, 1, 1);
        g2d.fillRect(105 + x, 43 + y, 1, 9);
        g2d.fillRect(106 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 13);
        g2d.fillRect(98 + x, 50 + y, 1, 5);
        g2d.fillRect(117 + x, 50 + y, 1, 3);
        g2d.fillRect(100 + x, 53 + y, 1, 10);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 16);
        g2d.fillRect(117 + x, 77 + y, 1, 3);
        g2d.fillRect(119 + x, 77 + y, 1, 10);
        g2d.fillRect(118 + x, 78 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(123 + x, 33 + y, 1, 3);
        g2d.fillRect(97 + x, 34 + y, 1, 2);
        g2d.fillRect(98 + x, 34 + y, 1, 16);
        g2d.fillRect(122 + x, 34 + y, 1, 5);
        g2d.fillRect(121 + x, 35 + y, 1, 18);
        g2d.fillRect(120 + x, 39 + y, 1, 7);
        g2d.fillRect(104 + x, 40 + y, 1, 32);
        g2d.fillRect(107 + x, 40 + y, 1, 4);
        g2d.fillRect(122 + x, 40 + y, 1, 2);
        g2d.fillRect(100 + x, 44 + y, 1, 9);
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 13);
        g2d.fillRect(116 + x, 53 + y, 1, 21);
        g2d.fillRect(117 + x, 53 + y, 1, 3);
        g2d.fillRect(101 + x, 63 + y, 1, 10);
        g2d.fillRect(117 + x, 72 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 34 + y, 1, 13);
        g2d.fillRect(100 + x, 37 + y, 1, 7);
        g2d.fillRect(101 + x, 40 + y, 1, 13);
        g2d.fillRect(102 + x, 40 + y, 1, 13);
        g2d.fillRect(103 + x, 45 + y, 1, 8);
        g2d.fillRect(118 + x, 53 + y, 1, 9);
        g2d.fillRect(120 + x, 53 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 5);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 58 + y, 1, 4);
        g2d.fillRect(101 + x, 59 + y, 1, 4);
        g2d.fillRect(100 + x, 63 + y, 1, 4);
        g2d.fillRect(119 + x, 63 + y, 1, 5);
        g2d.fillRect(120 + x, 63 + y, 1, 5);
        g2d.fillRect(118 + x, 67 + y, 1, 11);
        g2d.fillRect(102 + x, 69 + y, 1, 3);
        g2d.fillRect(103 + x, 73 + y, 1, 11);
        g2d.fillRect(119 + x, 74 + y, 1, 3);
        g2d.fillRect(117 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 5);
        g2d.fillRect(119 + x, 41 + y, 1, 14);
        g2d.fillRect(120 + x, 46 + y, 1, 7);
        g2d.fillRect(101 + x, 53 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 16);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 7);
        g2d.fillRect(117 + x, 61 + y, 1, 11);
        g2d.fillRect(118 + x, 62 + y, 1, 5);
        g2d.fillRect(120 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 7);
        g2d.fillRect(119 + x, 68 + y, 1, 6);
        g2d.fillRect(102 + x, 72 + y, 1, 1);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 27 + y, 1, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 2);
        g2d.fillRect(121 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 3, 1);
        g2d.fillRect(110 + x, 23 + y, 4, 1);
        g2d.fillRect(111 + x, 24 + y, 4, 1);
        g2d.fillRect(112 + x, 25 + y, 4, 1);
        g2d.fillRect(113 + x, 26 + y, 4, 1);
        g2d.fillRect(114 + x, 27 + y, 4, 1);
        g2d.fillRect(116 + x, 28 + y, 4, 1);
        g2d.fillRect(117 + x, 29 + y, 3, 1);
        g2d.fillRect(118 + x, 30 + y, 2, 1);
        g2d.fillRect(119 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 1, 3);
        g2d.fillRect(113 + x, 20 + y, 3, 1);
        g2d.fillRect(108 + x, 21 + y, 2, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 2);
        g2d.fillRect(115 + x, 21 + y, 3, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 2, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 2, 1);
        g2d.fillRect(117 + x, 26 + y, 2, 1);
        g2d.fillRect(120 + x, 26 + y, 1, 2);
        g2d.fillRect(121 + x, 26 + y, 1, 3);
        g2d.fillRect(118 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 2, 1);
        g2d.fillRect(114 + x, 22 + y, 2, 1);
        g2d.fillRect(115 + x, 23 + y, 2, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 2, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 2, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 11 + y, 1, 3);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 5);
        g2d.fillRect(104 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 7);
        g2d.fillRect(106 + x, 12 + y, 1, 5);
        g2d.fillRect(110 + x, 13 + y, 1, 5);
        g2d.fillRect(107 + x, 13 + y, 1, 4);
        g2d.fillRect(113 + x, 14 + y, 1, 4);
        g2d.fillRect(112 + x, 14 + y, 1, 3);
        g2d.fillRect(111 + x, 14 + y, 1, 3);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 4);
        g2d.fillRect(104 + x, 15 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(92 + x, 23 + y, 1, 10);
        g2d.fillRect(91 + x, 26 + y, 1, 3);
        g2d.fillRect(93 + x, 27 + y, 1, 7);
        g2d.fillRect(94 + x, 29 + y, 2, 1);
        g2d.fillRect(94 + x, 30 + y, 1, 3);
        g2d.fillRect(97 + x, 33 + y, 1, 4);
        g2d.fillRect(98 + x, 34 + y, 1, 3);
        g2d.fillRect(99 + x, 35 + y, 1, 5);
        g2d.fillRect(100 + x, 36 + y, 1, 4);
        g2d.fillRect(110 + x, 37 + y, 1, 4);
        g2d.fillRect(101 + x, 37 + y, 1, 3);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(109 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 34 + y, 1, 3);
        g2d.fillRect(109 + x, 35 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 11 + y, 4, 1);
        g2d.fillRect(97 + x, 12 + y, 3, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 2, 1);
        g2d.fillRect(96 + x, 13 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 2, 1);
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 3, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 3);
        g2d.fillRect(95 + x, 34 + y, 1, 3);
        g2d.fillRect(113 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 11 + y, 1, 3);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 4);
        g2d.fillRect(102 + x, 12 + y, 1, 2);
        g2d.fillRect(100 + x, 12 + y, 2, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(98 + x, 13 + y, 3, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 3, 1);
        g2d.fillRect(96 + x, 15 + y, 2, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 3);
        g2d.fillRect(95 + x, 16 + y, 2, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 3);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 2);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(94 + x, 17 + y, 1, 4);
        g2d.fillRect(110 + x, 18 + y, 1, 3);
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 5);
        g2d.fillRect(108 + x, 19 + y, 1, 4);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(110 + x, 23 + y, 1, 2);
        g2d.fillRect(119 + x, 28 + y, 1, 6);
        g2d.fillRect(111 + x, 29 + y, 1, 12);
        g2d.fillRect(91 + x, 29 + y, 1, 4);
        g2d.fillRect(95 + x, 30 + y, 1, 4);
        g2d.fillRect(96 + x, 31 + y, 1, 3);
        g2d.fillRect(118 + x, 33 + y, 1, 2);
        g2d.fillRect(92 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 3);
        g2d.fillRect(100 + x, 14 + y, 1, 3);
        g2d.fillRect(101 + x, 15 + y, 1, 3);
        g2d.fillRect(99 + x, 15 + y, 1, 3);
        g2d.fillRect(98 + x, 15 + y, 1, 3);
        g2d.fillRect(114 + x, 16 + y, 1, 3);
        g2d.fillRect(97 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 17 + y, 1, 3);
        g2d.fillRect(96 + x, 17 + y, 1, 3);
        g2d.fillRect(116 + x, 18 + y, 1, 4);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 5);
        g2d.fillRect(112 + x, 19 + y, 1, 3);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 2, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 1, 3);
        g2d.fillRect(93 + x, 19 + y, 1, 8);
        g2d.fillRect(111 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 3, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 21 + y, 1, 3);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(94 + x, 21 + y, 1, 6);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 2);
        g2d.fillRect(118 + x, 27 + y, 1, 6);
        g2d.fillRect(111 + x, 27 + y, 1, 2);
        g2d.fillRect(116 + x, 30 + y, 1, 5);
        g2d.fillRect(114 + x, 35 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 17 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 3);
        g2d.fillRect(98 + x, 18 + y, 2, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 16);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 17);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 3);
        g2d.fillRect(96 + x, 20 + y, 1, 4);
        g2d.fillRect(116 + x, 22 + y, 1, 8);
        g2d.fillRect(113 + x, 22 + y, 1, 19);
        g2d.fillRect(112 + x, 22 + y, 1, 19);
        g2d.fillRect(95 + x, 22 + y, 1, 3);
        g2d.fillRect(111 + x, 23 + y, 1, 4);
        g2d.fillRect(118 + x, 24 + y, 1, 3);
        g2d.fillRect(117 + x, 24 + y, 1, 11);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(93 + x, 33 + y, 1, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 14);
        g2d.fillRect(97 + x, 36 + y, 1, 3);
        g2d.fillRect(99 + x, 39 + y, 5, 1);
        g2d.fillRect(110 + x, 40 + y, 1, 3);
        g2d.fillRect(109 + x, 40 + y, 1, 7);
        g2d.fillRect(102 + x, 40 + y, 1, 2);
        g2d.fillRect(101 + x, 40 + y, 1, 5);
        g2d.fillRect(100 + x, 40 + y, 1, 8);
        g2d.fillRect(99 + x, 40 + y, 1, 13);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 33 + y, 1, 2);
        g2d.fillRect(119 + x, 34 + y, 1, 3);
        g2d.fillRect(118 + x, 36 + y, 1, 5);
        g2d.fillRect(96 + x, 36 + y, 1, 5);
        g2d.fillRect(95 + x, 36 + y, 1, 3);
        g2d.fillRect(97 + x, 39 + y, 1, 14);
        g2d.fillRect(93 + x, 39 + y, 1, 1);
        g2d.fillRect(110 + x, 43 + y, 1, 9);
        g2d.fillRect(109 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 13);
        g2d.fillRect(117 + x, 50 + y, 1, 5);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(115 + x, 53 + y, 1, 10);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 16);
        g2d.fillRect(98 + x, 77 + y, 1, 3);
        g2d.fillRect(96 + x, 77 + y, 1, 10);
        g2d.fillRect(97 + x, 78 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(92 + x, 33 + y, 1, 3);
        g2d.fillRect(118 + x, 34 + y, 1, 2);
        g2d.fillRect(117 + x, 34 + y, 1, 16);
        g2d.fillRect(93 + x, 34 + y, 1, 5);
        g2d.fillRect(94 + x, 35 + y, 1, 18);
        g2d.fillRect(95 + x, 39 + y, 1, 7);
        g2d.fillRect(111 + x, 40 + y, 1, 32);
        g2d.fillRect(108 + x, 40 + y, 1, 4);
        g2d.fillRect(93 + x, 40 + y, 1, 2);
        g2d.fillRect(115 + x, 44 + y, 1, 9);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 13);
        g2d.fillRect(99 + x, 53 + y, 1, 21);
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 63 + y, 1, 10);
        g2d.fillRect(98 + x, 72 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 34 + y, 1, 13);
        g2d.fillRect(115 + x, 37 + y, 1, 7);
        g2d.fillRect(114 + x, 40 + y, 1, 13);
        g2d.fillRect(113 + x, 40 + y, 1, 13);
        g2d.fillRect(112 + x, 45 + y, 1, 8);
        g2d.fillRect(97 + x, 53 + y, 1, 9);
        g2d.fillRect(95 + x, 53 + y, 1, 2);
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(94 + x, 55 + y, 1, 4);
        g2d.fillRect(98 + x, 56 + y, 1, 5);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(95 + x, 58 + y, 1, 4);
        g2d.fillRect(114 + x, 59 + y, 1, 4);
        g2d.fillRect(115 + x, 63 + y, 1, 4);
        g2d.fillRect(96 + x, 63 + y, 1, 5);
        g2d.fillRect(95 + x, 63 + y, 1, 5);
        g2d.fillRect(97 + x, 67 + y, 1, 11);
        g2d.fillRect(113 + x, 69 + y, 1, 3);
        g2d.fillRect(112 + x, 73 + y, 1, 11);
        g2d.fillRect(96 + x, 74 + y, 1, 3);
        g2d.fillRect(98 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 5);
        g2d.fillRect(96 + x, 41 + y, 1, 14);
        g2d.fillRect(95 + x, 46 + y, 1, 7);
        g2d.fillRect(114 + x, 53 + y, 1, 4);
        g2d.fillRect(113 + x, 53 + y, 1, 16);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(95 + x, 55 + y, 1, 3);
        g2d.fillRect(96 + x, 56 + y, 1, 7);
        g2d.fillRect(98 + x, 61 + y, 1, 11);
        g2d.fillRect(97 + x, 62 + y, 1, 5);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 7);
        g2d.fillRect(96 + x, 68 + y, 1, 6);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(96 + x, 27 + y, 1, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 2);
        g2d.fillRect(94 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 3, 1);
        g2d.fillRect(102 + x, 23 + y, 4, 1);
        g2d.fillRect(101 + x, 24 + y, 4, 1);
        g2d.fillRect(100 + x, 25 + y, 4, 1);
        g2d.fillRect(99 + x, 26 + y, 4, 1);
        g2d.fillRect(98 + x, 27 + y, 4, 1);
        g2d.fillRect(96 + x, 28 + y, 4, 1);
        g2d.fillRect(96 + x, 29 + y, 3, 1);
        g2d.fillRect(96 + x, 30 + y, 2, 1);
        g2d.fillRect(96 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 3);
        g2d.fillRect(100 + x, 20 + y, 3, 1);
        g2d.fillRect(106 + x, 21 + y, 2, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 3, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 2, 1);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 2, 1);
        g2d.fillRect(97 + x, 26 + y, 2, 1);
        g2d.fillRect(95 + x, 26 + y, 1, 2);
        g2d.fillRect(94 + x, 26 + y, 1, 3);
        g2d.fillRect(97 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 2, 1);
        g2d.fillRect(100 + x, 22 + y, 2, 1);
        g2d.fillRect(99 + x, 23 + y, 2, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 2, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 25 + y, 2, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(155, 122, 82));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(206, 156, 82));
        COLORS.set(ImageUtilities.GREY, new Color(255, 222, 173));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 173));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
