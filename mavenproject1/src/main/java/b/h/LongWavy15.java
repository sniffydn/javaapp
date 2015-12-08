/*
 * LongWavy1.java
 *
 * Created on March 30, 2007, 9:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package b.h;

import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;
import util.Color;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class LongWavy15 extends clts.SuperHLong {

    public LongWavy15() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongWavy15(int step, int dir) {
        super(step, dir);
    }

    public LongWavy15(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 11 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 3);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(112 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 11 + y, 3, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 2);
        g2d.fillRect(110 + x, 11 + y, 1, 3);
        g2d.fillRect(111 + x, 11 + y, 2, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 3);
        g2d.fillRect(102 + x, 12 + y, 1, 2);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 2, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 3);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 3, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 4);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 2, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 15 + y, 1, 2);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 2, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 3);
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 8);
        g2d.fillRect(111 + x, 18 + y, 1, 2);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(121 + x, 18 + y, 1, 10);
        g2d.fillRect(100 + x, 19 + y, 1, 3);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 3);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 5);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(101 + x, 24 + y, 1, 5);
        g2d.fillRect(105 + x, 25 + y, 1, 4);
        g2d.fillRect(96 + x, 26 + y, 1, 3);
        g2d.fillRect(98 + x, 26 + y, 1, 4);
        g2d.fillRect(122 + x, 26 + y, 1, 3);
        g2d.fillRect(123 + x, 26 + y, 1, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 4);
        g2d.fillRect(120 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 1);
        g2d.fillRect(99 + x, 31 + y, 1, 2);
        g2d.fillRect(120 + x, 31 + y, 1, 2);
        g2d.fillRect(122 + x, 31 + y, 1, 3);
        g2d.fillRect(119 + x, 32 + y, 1, 1);
        g2d.fillRect(118 + x, 34 + y, 1, 2);
        g2d.fillRect(117 + x, 35 + y, 1, 3);
        g2d.fillRect(114 + x, 37 + y, 1, 3);
        g2d.fillRect(118 + x, 37 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 3);
        g2d.fillRect(99 + x, 16 + y, 1, 3);
        g2d.fillRect(104 + x, 16 + y, 2, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 2, 1);
        g2d.fillRect(117 + x, 17 + y, 2, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 2, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 7);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 6);
        g2d.fillRect(100 + x, 22 + y, 1, 5);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 5);
        g2d.fillRect(97 + x, 26 + y, 1, 4);
        g2d.fillRect(99 + x, 27 + y, 1, 3);
        g2d.fillRect(120 + x, 28 + y, 1, 3);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 29 + y, 1, 1);
        g2d.fillRect(101 + x, 29 + y, 1, 2);
        g2d.fillRect(104 + x, 29 + y, 1, 1);
        g2d.fillRect(122 + x, 29 + y, 1, 2);
        g2d.fillRect(98 + x, 30 + y, 1, 2);
        g2d.fillRect(119 + x, 30 + y, 1, 2);
        g2d.fillRect(100 + x, 31 + y, 1, 2);
        g2d.fillRect(103 + x, 31 + y, 1, 2);
        g2d.fillRect(121 + x, 31 + y, 1, 3);
        g2d.fillRect(104 + x, 33 + y, 1, 2);
        g2d.fillRect(118 + x, 33 + y, 1, 1);
        g2d.fillRect(117 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(117 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(105 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 2, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 2, 1);
        g2d.fillRect(113 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 3);
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 2, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 3);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 2);
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(101 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 5);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 29 + y, 1, 2);
        g2d.fillRect(119 + x, 29 + y, 1, 1);
        g2d.fillRect(121 + x, 29 + y, 1, 2);
        g2d.fillRect(99 + x, 30 + y, 1, 1);
        g2d.fillRect(101 + x, 31 + y, 1, 4);
        g2d.fillRect(120 + x, 33 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 2);
        g2d.fillRect(116 + x, 38 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 17 + y, 1, 3);
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 2, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 4);
        g2d.fillRect(103 + x, 28 + y, 1, 3);
        g2d.fillRect(102 + x, 31 + y, 1, 4);
        g2d.fillRect(103 + x, 33 + y, 1, 2);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(118 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 29 + y, 1, 2);
        g2d.fillRect(94 + x, 30 + y, 1, 5);
        g2d.fillRect(96 + x, 31 + y, 1, 3);
        g2d.fillRect(99 + x, 32 + y, 1, 3);
        g2d.fillRect(122 + x, 33 + y, 1, 2);
        g2d.fillRect(97 + x, 34 + y, 1, 1);
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(98 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 35 + y, 1, 4);
        g2d.fillRect(121 + x, 35 + y, 1, 2);
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(94 + x, 37 + y, 1, 9);
        g2d.fillRect(97 + x, 37 + y, 1, 7);
        g2d.fillRect(120 + x, 37 + y, 1, 3);
        g2d.fillRect(122 + x, 37 + y, 1, 2);
        g2d.fillRect(103 + x, 38 + y, 1, 2);
        g2d.fillRect(118 + x, 38 + y, 1, 3);
        g2d.fillRect(123 + x, 38 + y, 1, 4);
        g2d.fillRect(99 + x, 39 + y, 1, 4);
        g2d.fillRect(121 + x, 39 + y, 1, 2);
        g2d.fillRect(115 + x, 40 + y, 1, 3);
        g2d.fillRect(101 + x, 41 + y, 1, 4);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(124 + x, 41 + y, 1, 7);
        g2d.fillRect(100 + x, 42 + y, 1, 6);
        g2d.fillRect(103 + x, 42 + y, 1, 2);
        g2d.fillRect(114 + x, 42 + y, 1, 11);
        g2d.fillRect(119 + x, 42 + y, 1, 2);
        g2d.fillRect(122 + x, 42 + y, 1, 7);
        g2d.fillRect(96 + x, 43 + y, 1, 3);
        g2d.fillRect(98 + x, 43 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 4);
        g2d.fillRect(117 + x, 44 + y, 2, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 2);
        g2d.fillRect(97 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 2, 1);
        g2d.fillRect(99 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 5);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(125 + x, 47 + y, 1, 2);
        g2d.fillRect(95 + x, 48 + y, 1, 4);
        g2d.fillRect(101 + x, 48 + y, 1, 2);
        g2d.fillRect(112 + x, 48 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 2);
        g2d.fillRect(121 + x, 49 + y, 1, 2);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(122 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 3);
        g2d.fillRect(115 + x, 51 + y, 2, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(93 + x, 52 + y, 2, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 29 + y, 1, 6);
        g2d.fillRect(96 + x, 29 + y, 1, 2);
        g2d.fillRect(97 + x, 31 + y, 1, 3);
        g2d.fillRect(100 + x, 32 + y, 1, 3);
        g2d.fillRect(98 + x, 33 + y, 1, 2);
        g2d.fillRect(121 + x, 33 + y, 1, 2);
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(101 + x, 34 + y, 1, 7);
        g2d.fillRect(104 + x, 34 + y, 1, 2);
        g2d.fillRect(105 + x, 35 + y, 1, 2);
        g2d.fillRect(120 + x, 35 + y, 1, 2);
        g2d.fillRect(99 + x, 36 + y, 1, 2);
        g2d.fillRect(103 + x, 36 + y, 1, 2);
        g2d.fillRect(95 + x, 37 + y, 1, 7);
        g2d.fillRect(96 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 37 + y, 1, 6);
        g2d.fillRect(106 + x, 37 + y, 1, 2);
        g2d.fillRect(119 + x, 37 + y, 1, 3);
        g2d.fillRect(121 + x, 37 + y, 1, 2);
        g2d.fillRect(104 + x, 38 + y, 1, 2);
        g2d.fillRect(117 + x, 38 + y, 1, 3);
        g2d.fillRect(100 + x, 39 + y, 1, 3);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
        g2d.fillRect(122 + x, 39 + y, 1, 3);
        g2d.fillRect(102 + x, 40 + y, 1, 1);
        g2d.fillRect(106 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 3);
        g2d.fillRect(121 + x, 41 + y, 1, 8);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 2);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 1, 6);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(113 + x, 43 + y, 1, 4);
        g2d.fillRect(115 + x, 43 + y, 1, 5);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 2, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(117 + x, 45 + y, 1, 2);
        g2d.fillRect(118 + x, 45 + y, 1, 2);
        g2d.fillRect(94 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 4);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 48 + y, 1, 3);
        g2d.fillRect(116 + x, 48 + y, 1, 3);
        g2d.fillRect(124 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 3);
        g2d.fillRect(113 + x, 49 + y, 1, 3);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(125 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(124 + x, 50 + y, 1, 2);
        g2d.fillRect(126 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 3);
        g2d.fillRect(121 + x, 51 + y, 2, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 2);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 2);
        g2d.fillRect(122 + x, 52 + y, 1, 2);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(125 + x, 52 + y, 1, 2);
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(123 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 31 + y, 1, 2);
        g2d.fillRect(120 + x, 33 + y, 1, 2);
        g2d.fillRect(102 + x, 34 + y, 1, 6);
        g2d.fillRect(97 + x, 35 + y, 1, 2);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 1, 2);
        g2d.fillRect(96 + x, 38 + y, 1, 5);
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 2);
        g2d.fillRect(116 + x, 40 + y, 1, 3);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 2, 1);
        g2d.fillRect(105 + x, 42 + y, 1, 2);
        g2d.fillRect(120 + x, 42 + y, 1, 7);
        g2d.fillRect(104 + x, 44 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 2);
        g2d.fillRect(95 + x, 46 + y, 2, 1);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(123 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(124 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 2, 1);
        g2d.fillRect(125 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 3);
        g2d.fillRect(96 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 3);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 34 + y, 1, 2);
        g2d.fillRect(104 + x, 36 + y, 1, 2);
        g2d.fillRect(105 + x, 37 + y, 1, 2);
        g2d.fillRect(106 + x, 39 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 3);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 17 + y, 1, 6);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 2, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 3);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 2);
        g2d.fillRect(114 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 2, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 3);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 2);
        g2d.fillRect(116 + x, 25 + y, 1, 2);
        g2d.fillRect(117 + x, 26 + y, 3, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 2, 1);
        g2d.fillRect(115 + x, 21 + y, 2, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 3);
        g2d.fillRect(118 + x, 24 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 2);
        g2d.fillRect(116 + x, 22 + y, 1, 3);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 11 + y, 2, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 1, 3);
        g2d.fillRect(103 + x, 17 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 11 + y, 3, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 2);
        g2d.fillRect(105 + x, 11 + y, 1, 3);
        g2d.fillRect(103 + x, 11 + y, 2, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 3);
        g2d.fillRect(113 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 2, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 3);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 3, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 4);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 2, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(103 + x, 15 + y, 1, 2);
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 2, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 3);
        g2d.fillRect(97 + x, 16 + y, 2, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 8);
        g2d.fillRect(104 + x, 18 + y, 1, 2);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 2);
        g2d.fillRect(94 + x, 18 + y, 1, 10);
        g2d.fillRect(115 + x, 19 + y, 1, 3);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 3);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 5);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(114 + x, 24 + y, 1, 5);
        g2d.fillRect(110 + x, 25 + y, 1, 4);
        g2d.fillRect(119 + x, 26 + y, 1, 3);
        g2d.fillRect(117 + x, 26 + y, 1, 4);
        g2d.fillRect(93 + x, 26 + y, 1, 3);
        g2d.fillRect(92 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 4);
        g2d.fillRect(95 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 1);
        g2d.fillRect(116 + x, 31 + y, 1, 2);
        g2d.fillRect(95 + x, 31 + y, 1, 2);
        g2d.fillRect(93 + x, 31 + y, 1, 3);
        g2d.fillRect(96 + x, 32 + y, 1, 1);
        g2d.fillRect(97 + x, 34 + y, 1, 2);
        g2d.fillRect(98 + x, 35 + y, 1, 3);
        g2d.fillRect(101 + x, 37 + y, 1, 3);
        g2d.fillRect(97 + x, 37 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 3);
        g2d.fillRect(116 + x, 16 + y, 1, 3);
        g2d.fillRect(110 + x, 16 + y, 2, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 2, 1);
        g2d.fillRect(97 + x, 17 + y, 2, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 2, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 7);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 6);
        g2d.fillRect(115 + x, 22 + y, 1, 5);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 5);
        g2d.fillRect(118 + x, 26 + y, 1, 4);
        g2d.fillRect(116 + x, 27 + y, 1, 3);
        g2d.fillRect(95 + x, 28 + y, 1, 3);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 29 + y, 1, 1);
        g2d.fillRect(114 + x, 29 + y, 1, 2);
        g2d.fillRect(111 + x, 29 + y, 1, 1);
        g2d.fillRect(93 + x, 29 + y, 1, 2);
        g2d.fillRect(117 + x, 30 + y, 1, 2);
        g2d.fillRect(96 + x, 30 + y, 1, 2);
        g2d.fillRect(115 + x, 31 + y, 1, 2);
        g2d.fillRect(112 + x, 31 + y, 1, 2);
        g2d.fillRect(94 + x, 31 + y, 1, 3);
        g2d.fillRect(111 + x, 33 + y, 1, 2);
        g2d.fillRect(97 + x, 33 + y, 1, 1);
        g2d.fillRect(98 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 3);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 14 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 2, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 2, 1);
        g2d.fillRect(101 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 3);
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(98 + x, 18 + y, 2, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 3);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(114 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 5);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 29 + y, 1, 2);
        g2d.fillRect(96 + x, 29 + y, 1, 1);
        g2d.fillRect(94 + x, 29 + y, 1, 2);
        g2d.fillRect(116 + x, 30 + y, 1, 1);
        g2d.fillRect(114 + x, 31 + y, 1, 4);
        g2d.fillRect(95 + x, 33 + y, 1, 1);
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 2);
        g2d.fillRect(99 + x, 38 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 17 + y, 1, 3);
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 2, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 4);
        g2d.fillRect(112 + x, 28 + y, 1, 3);
        g2d.fillRect(113 + x, 31 + y, 1, 4);
        g2d.fillRect(112 + x, 33 + y, 1, 2);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(97 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 29 + y, 1, 2);
        g2d.fillRect(121 + x, 30 + y, 1, 5);
        g2d.fillRect(119 + x, 31 + y, 1, 3);
        g2d.fillRect(116 + x, 32 + y, 1, 3);
        g2d.fillRect(93 + x, 33 + y, 1, 2);
        g2d.fillRect(118 + x, 34 + y, 1, 1);
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(117 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 35 + y, 1, 4);
        g2d.fillRect(94 + x, 35 + y, 1, 2);
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(121 + x, 37 + y, 1, 9);
        g2d.fillRect(118 + x, 37 + y, 1, 7);
        g2d.fillRect(95 + x, 37 + y, 1, 3);
        g2d.fillRect(93 + x, 37 + y, 1, 2);
        g2d.fillRect(112 + x, 38 + y, 1, 2);
        g2d.fillRect(97 + x, 38 + y, 1, 3);
        g2d.fillRect(92 + x, 38 + y, 1, 4);
        g2d.fillRect(116 + x, 39 + y, 1, 4);
        g2d.fillRect(94 + x, 39 + y, 1, 2);
        g2d.fillRect(100 + x, 40 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 4);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(91 + x, 41 + y, 1, 7);
        g2d.fillRect(115 + x, 42 + y, 1, 6);
        g2d.fillRect(112 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 42 + y, 1, 11);
        g2d.fillRect(96 + x, 42 + y, 1, 2);
        g2d.fillRect(93 + x, 42 + y, 1, 7);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(117 + x, 43 + y, 1, 2);
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(120 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 4);
        g2d.fillRect(97 + x, 44 + y, 2, 1);
        g2d.fillRect(122 + x, 45 + y, 1, 2);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 2, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 47 + y, 1, 5);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(90 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 4);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 2);
        g2d.fillRect(94 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 3);
        g2d.fillRect(99 + x, 51 + y, 2, 1);
        g2d.fillRect(92 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 2, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(97 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 29 + y, 1, 6);
        g2d.fillRect(119 + x, 29 + y, 1, 2);
        g2d.fillRect(118 + x, 31 + y, 1, 3);
        g2d.fillRect(115 + x, 32 + y, 1, 3);
        g2d.fillRect(117 + x, 33 + y, 1, 2);
        g2d.fillRect(94 + x, 33 + y, 1, 2);
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(114 + x, 34 + y, 1, 7);
        g2d.fillRect(111 + x, 34 + y, 1, 2);
        g2d.fillRect(110 + x, 35 + y, 1, 2);
        g2d.fillRect(95 + x, 35 + y, 1, 2);
        g2d.fillRect(116 + x, 36 + y, 1, 2);
        g2d.fillRect(112 + x, 36 + y, 1, 2);
        g2d.fillRect(120 + x, 37 + y, 1, 7);
        g2d.fillRect(119 + x, 37 + y, 1, 1);
        g2d.fillRect(117 + x, 37 + y, 1, 6);
        g2d.fillRect(109 + x, 37 + y, 1, 2);
        g2d.fillRect(96 + x, 37 + y, 1, 3);
        g2d.fillRect(94 + x, 37 + y, 1, 2);
        g2d.fillRect(111 + x, 38 + y, 1, 2);
        g2d.fillRect(98 + x, 38 + y, 1, 3);
        g2d.fillRect(115 + x, 39 + y, 1, 3);
        g2d.fillRect(110 + x, 39 + y, 1, 1);
        g2d.fillRect(93 + x, 39 + y, 1, 3);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(109 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 2);
        g2d.fillRect(95 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 3);
        g2d.fillRect(94 + x, 41 + y, 1, 8);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(92 + x, 42 + y, 1, 6);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 4);
        g2d.fillRect(100 + x, 43 + y, 1, 5);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 2);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 2, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 3);
        g2d.fillRect(98 + x, 45 + y, 1, 2);
        g2d.fillRect(97 + x, 45 + y, 1, 2);
        g2d.fillRect(121 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 4);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 1, 3);
        g2d.fillRect(91 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 3);
        g2d.fillRect(102 + x, 49 + y, 1, 3);
        g2d.fillRect(95 + x, 49 + y, 1, 2);
        g2d.fillRect(90 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(91 + x, 50 + y, 1, 2);
        g2d.fillRect(89 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 3);
        g2d.fillRect(93 + x, 51 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(93 + x, 52 + y, 1, 2);
        g2d.fillRect(92 + x, 52 + y, 1, 1);
        g2d.fillRect(90 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(92 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 31 + y, 1, 2);
        g2d.fillRect(95 + x, 33 + y, 1, 2);
        g2d.fillRect(113 + x, 34 + y, 1, 6);
        g2d.fillRect(118 + x, 35 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(96 + x, 35 + y, 1, 2);
        g2d.fillRect(119 + x, 38 + y, 1, 5);
        g2d.fillRect(116 + x, 38 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 2);
        g2d.fillRect(99 + x, 40 + y, 1, 3);
        g2d.fillRect(111 + x, 41 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 2, 1);
        g2d.fillRect(110 + x, 42 + y, 1, 2);
        g2d.fillRect(95 + x, 42 + y, 1, 7);
        g2d.fillRect(111 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 2);
        g2d.fillRect(119 + x, 46 + y, 2, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(92 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 3);
        g2d.fillRect(96 + x, 49 + y, 1, 3);
        g2d.fillRect(91 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 2, 1);
        g2d.fillRect(90 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 3);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 2);
        g2d.fillRect(94 + x, 52 + y, 1, 3);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 34 + y, 1, 2);
        g2d.fillRect(111 + x, 36 + y, 1, 2);
        g2d.fillRect(110 + x, 37 + y, 1, 2);
        g2d.fillRect(109 + x, 39 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 3);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 17 + y, 1, 6);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 2, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 2, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 2);
        g2d.fillRect(99 + x, 25 + y, 1, 2);
        g2d.fillRect(96 + x, 26 + y, 3, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 2, 1);
        g2d.fillRect(99 + x, 21 + y, 2, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 24 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 2);
        g2d.fillRect(99 + x, 22 + y, 1, 3);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(102, 95, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(153, 127, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(204, 159, 85));
        COLORS.set(ImageUtilities.GREY, new Color(255, 191, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 223, 85));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 255, 85));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
