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
public class LongStraight9 extends SuperHLong {

    public LongStraight9() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight9(int step, int dir) {
        super(step, dir);
    }

    public LongStraight9(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 10 + y, 1, 13);
        g2d.fillRect(105 + x, 10 + y, 1, 4);
        g2d.fillRect(106 + x, 10 + y, 1, 3);
        g2d.fillRect(107 + x, 10 + y, 1, 2);
        g2d.fillRect(108 + x, 10 + y, 1, 2);
        g2d.fillRect(109 + x, 10 + y, 1, 2);
        g2d.fillRect(110 + x, 10 + y, 1, 2);
        g2d.fillRect(111 + x, 10 + y, 1, 2);
        g2d.fillRect(112 + x, 10 + y, 1, 2);
        g2d.fillRect(113 + x, 10 + y, 1, 2);
        g2d.fillRect(101 + x, 11 + y, 1, 12);
        g2d.fillRect(102 + x, 11 + y, 1, 10);
        g2d.fillRect(103 + x, 11 + y, 1, 9);
        g2d.fillRect(114 + x, 11 + y, 3, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 3);
        g2d.fillRect(115 + x, 12 + y, 3, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 3);
        g2d.fillRect(118 + x, 14 + y, 2, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 5);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 13);
        g2d.fillRect(109 + x, 16 + y, 1, 6);
        g2d.fillRect(96 + x, 17 + y, 1, 5);
        g2d.fillRect(105 + x, 17 + y, 1, 4);
        g2d.fillRect(112 + x, 17 + y, 1, 4);
        g2d.fillRect(116 + x, 17 + y, 1, 6);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 3);
        g2d.fillRect(118 + x, 18 + y, 1, 9);
        g2d.fillRect(95 + x, 19 + y, 1, 5);
        g2d.fillRect(107 + x, 19 + y, 1, 5);
        g2d.fillRect(108 + x, 19 + y, 1, 4);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 3);
        g2d.fillRect(115 + x, 19 + y, 1, 3);
        g2d.fillRect(117 + x, 19 + y, 1, 5);
        g2d.fillRect(121 + x, 19 + y, 1, 3);
        g2d.fillRect(103 + x, 23 + y, 1, 3);
        g2d.fillRect(106 + x, 23 + y, 1, 2);
        g2d.fillRect(105 + x, 24 + y, 1, 2);
        g2d.fillRect(98 + x, 25 + y, 1, 4);
        g2d.fillRect(102 + x, 25 + y, 1, 5);
        g2d.fillRect(101 + x, 28 + y, 1, 4);
        g2d.fillRect(104 + x, 28 + y, 1, 4);
        g2d.fillRect(118 + x, 33 + y, 1, 2);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 12 + y, 1, 3);
        g2d.fillRect(108 + x, 12 + y, 1, 3);
        g2d.fillRect(109 + x, 12 + y, 1, 4);
        g2d.fillRect(110 + x, 12 + y, 1, 2);
        g2d.fillRect(111 + x, 12 + y, 1, 3);
        g2d.fillRect(112 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 12 + y, 1, 2);
        g2d.fillRect(114 + x, 12 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 1, 5);
        g2d.fillRect(115 + x, 13 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 3);
        g2d.fillRect(116 + x, 14 + y, 1, 3);
        g2d.fillRect(117 + x, 14 + y, 1, 5);
        g2d.fillRect(100 + x, 15 + y, 1, 6);
        g2d.fillRect(110 + x, 15 + y, 1, 4);
        g2d.fillRect(112 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 15 + y, 1, 4);
        g2d.fillRect(118 + x, 15 + y, 1, 3);
        g2d.fillRect(107 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 16 + y, 1, 3);
        g2d.fillRect(98 + x, 17 + y, 2, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 18 + y, 1, 3);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 9);
        g2d.fillRect(97 + x, 20 + y, 1, 6);
        g2d.fillRect(98 + x, 20 + y, 1, 5);
        g2d.fillRect(103 + x, 20 + y, 1, 3);
        g2d.fillRect(102 + x, 21 + y, 1, 4);
        g2d.fillRect(105 + x, 21 + y, 1, 3);
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 2, 1);
        g2d.fillRect(121 + x, 22 + y, 1, 4);
        g2d.fillRect(100 + x, 23 + y, 1, 6);
        g2d.fillRect(101 + x, 23 + y, 1, 5);
        g2d.fillRect(104 + x, 23 + y, 1, 4);
        g2d.fillRect(99 + x, 25 + y, 1, 4);
        g2d.fillRect(103 + x, 26 + y, 1, 6);
        g2d.fillRect(102 + x, 30 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 2);
        g2d.fillRect(97 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 4, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(113 + x, 15 + y, 1, 2);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(99 + x, 21 + y, 2, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(122 + x, 21 + y, 1, 20);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(94 + x, 24 + y, 1, 4);
        g2d.fillRect(97 + x, 26 + y, 1, 33);
        g2d.fillRect(96 + x, 27 + y, 1, 22);
        g2d.fillRect(119 + x, 27 + y, 1, 30);
        g2d.fillRect(121 + x, 27 + y, 1, 16);
        g2d.fillRect(98 + x, 28 + y, 1, 37);
        g2d.fillRect(100 + x, 29 + y, 1, 36);
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(95 + x, 30 + y, 1, 13);
        g2d.fillRect(99 + x, 31 + y, 1, 40);
        g2d.fillRect(101 + x, 31 + y, 1, 33);
        g2d.fillRect(104 + x, 31 + y, 1, 9);
        g2d.fillRect(103 + x, 32 + y, 1, 25);
        g2d.fillRect(94 + x, 33 + y, 1, 1);
        g2d.fillRect(118 + x, 34 + y, 1, 30);
        g2d.fillRect(120 + x, 34 + y, 1, 20);
        g2d.fillRect(117 + x, 35 + y, 1, 32);
        g2d.fillRect(116 + x, 36 + y, 1, 33);
        g2d.fillRect(115 + x, 37 + y, 1, 26);
        g2d.fillRect(114 + x, 38 + y, 1, 10);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 12);
        g2d.fillRect(121 + x, 51 + y, 1, 5);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 4);
        g2d.fillRect(114 + x, 60 + y, 1, 6);
        g2d.fillRect(95 + x, 61 + y, 1, 2);
        g2d.fillRect(94 + x, 63 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 4);
        g2d.fillRect(119 + x, 64 + y, 1, 3);
        g2d.fillRect(100 + x, 66 + y, 1, 2);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(120 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 23 + y, 1, 4);
        g2d.fillRect(95 + x, 25 + y, 1, 5);
        g2d.fillRect(121 + x, 25 + y, 1, 2);
        g2d.fillRect(120 + x, 27 + y, 1, 2);
        g2d.fillRect(94 + x, 28 + y, 1, 5);
        g2d.fillRect(99 + x, 28 + y, 1, 3);
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(120 + x, 30 + y, 1, 4);
        g2d.fillRect(102 + x, 31 + y, 1, 15);
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(100 + x, 65 + y, 1, 1);
        g2d.fillRect(116 + x, 69 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 10 + y, 1, 13);
        g2d.fillRect(110 + x, 10 + y, 1, 4);
        g2d.fillRect(109 + x, 10 + y, 1, 3);
        g2d.fillRect(108 + x, 10 + y, 1, 2);
        g2d.fillRect(107 + x, 10 + y, 1, 2);
        g2d.fillRect(106 + x, 10 + y, 1, 2);
        g2d.fillRect(105 + x, 10 + y, 1, 2);
        g2d.fillRect(104 + x, 10 + y, 1, 2);
        g2d.fillRect(103 + x, 10 + y, 1, 2);
        g2d.fillRect(102 + x, 10 + y, 1, 2);
        g2d.fillRect(114 + x, 11 + y, 1, 12);
        g2d.fillRect(113 + x, 11 + y, 1, 10);
        g2d.fillRect(112 + x, 11 + y, 1, 9);
        g2d.fillRect(99 + x, 11 + y, 3, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 3);
        g2d.fillRect(98 + x, 12 + y, 3, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 2, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 3);
        g2d.fillRect(96 + x, 14 + y, 2, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 5);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 13);
        g2d.fillRect(106 + x, 16 + y, 1, 6);
        g2d.fillRect(119 + x, 17 + y, 1, 5);
        g2d.fillRect(110 + x, 17 + y, 1, 4);
        g2d.fillRect(103 + x, 17 + y, 1, 4);
        g2d.fillRect(99 + x, 17 + y, 1, 6);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 3);
        g2d.fillRect(97 + x, 18 + y, 1, 9);
        g2d.fillRect(120 + x, 19 + y, 1, 5);
        g2d.fillRect(108 + x, 19 + y, 1, 5);
        g2d.fillRect(107 + x, 19 + y, 1, 4);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 3);
        g2d.fillRect(100 + x, 19 + y, 1, 3);
        g2d.fillRect(98 + x, 19 + y, 1, 5);
        g2d.fillRect(94 + x, 19 + y, 1, 3);
        g2d.fillRect(112 + x, 23 + y, 1, 3);
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(110 + x, 24 + y, 1, 2);
        g2d.fillRect(117 + x, 25 + y, 1, 4);
        g2d.fillRect(113 + x, 25 + y, 1, 5);
        g2d.fillRect(114 + x, 28 + y, 1, 4);
        g2d.fillRect(111 + x, 28 + y, 1, 4);
        g2d.fillRect(97 + x, 33 + y, 1, 2);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 35 + y, 1, 3);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 12 + y, 1, 3);
        g2d.fillRect(107 + x, 12 + y, 1, 3);
        g2d.fillRect(106 + x, 12 + y, 1, 4);
        g2d.fillRect(105 + x, 12 + y, 1, 2);
        g2d.fillRect(104 + x, 12 + y, 1, 3);
        g2d.fillRect(103 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 12 + y, 1, 2);
        g2d.fillRect(101 + x, 12 + y, 1, 2);
        g2d.fillRect(109 + x, 13 + y, 1, 5);
        g2d.fillRect(99 + x, 13 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 3);
        g2d.fillRect(99 + x, 14 + y, 1, 3);
        g2d.fillRect(98 + x, 14 + y, 1, 5);
        g2d.fillRect(115 + x, 15 + y, 1, 6);
        g2d.fillRect(105 + x, 15 + y, 1, 4);
        g2d.fillRect(103 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 1, 4);
        g2d.fillRect(97 + x, 15 + y, 1, 3);
        g2d.fillRect(108 + x, 16 + y, 1, 3);
        g2d.fillRect(100 + x, 16 + y, 1, 3);
        g2d.fillRect(116 + x, 17 + y, 2, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 1, 3);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 9);
        g2d.fillRect(118 + x, 20 + y, 1, 6);
        g2d.fillRect(117 + x, 20 + y, 1, 5);
        g2d.fillRect(112 + x, 20 + y, 1, 3);
        g2d.fillRect(113 + x, 21 + y, 1, 4);
        g2d.fillRect(110 + x, 21 + y, 1, 3);
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 2, 1);
        g2d.fillRect(94 + x, 22 + y, 1, 4);
        g2d.fillRect(115 + x, 23 + y, 1, 6);
        g2d.fillRect(114 + x, 23 + y, 1, 5);
        g2d.fillRect(111 + x, 23 + y, 1, 4);
        g2d.fillRect(116 + x, 25 + y, 1, 4);
        g2d.fillRect(112 + x, 26 + y, 1, 6);
        g2d.fillRect(113 + x, 30 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 2);
        g2d.fillRect(118 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 4, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 3);
        g2d.fillRect(102 + x, 15 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 21 + y, 2, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(93 + x, 21 + y, 1, 20);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(121 + x, 24 + y, 1, 4);
        g2d.fillRect(118 + x, 26 + y, 1, 33);
        g2d.fillRect(119 + x, 27 + y, 1, 22);
        g2d.fillRect(96 + x, 27 + y, 1, 30);
        g2d.fillRect(94 + x, 27 + y, 1, 16);
        g2d.fillRect(117 + x, 28 + y, 1, 37);
        g2d.fillRect(115 + x, 29 + y, 1, 36);
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(120 + x, 30 + y, 1, 13);
        g2d.fillRect(116 + x, 31 + y, 1, 40);
        g2d.fillRect(114 + x, 31 + y, 1, 33);
        g2d.fillRect(111 + x, 31 + y, 1, 9);
        g2d.fillRect(112 + x, 32 + y, 1, 25);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(97 + x, 34 + y, 1, 30);
        g2d.fillRect(95 + x, 34 + y, 1, 20);
        g2d.fillRect(98 + x, 35 + y, 1, 32);
        g2d.fillRect(99 + x, 36 + y, 1, 33);
        g2d.fillRect(100 + x, 37 + y, 1, 26);
        g2d.fillRect(101 + x, 38 + y, 1, 10);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(113 + x, 46 + y, 1, 12);
        g2d.fillRect(94 + x, 51 + y, 1, 5);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 4);
        g2d.fillRect(101 + x, 60 + y, 1, 6);
        g2d.fillRect(120 + x, 61 + y, 1, 2);
        g2d.fillRect(121 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 4);
        g2d.fillRect(96 + x, 64 + y, 1, 3);
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(102 + x, 66 + y, 1, 2);
        g2d.fillRect(95 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 1);
        g2d.fillRect(99 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 23 + y, 1, 4);
        g2d.fillRect(120 + x, 25 + y, 1, 5);
        g2d.fillRect(94 + x, 25 + y, 1, 2);
        g2d.fillRect(95 + x, 27 + y, 1, 2);
        g2d.fillRect(121 + x, 28 + y, 1, 5);
        g2d.fillRect(116 + x, 28 + y, 1, 3);
        g2d.fillRect(115 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 30 + y, 1, 4);
        g2d.fillRect(113 + x, 31 + y, 1, 15);
        g2d.fillRect(112 + x, 31 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(99 + x, 69 + y, 1, 1);
    }
}
