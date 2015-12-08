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
public class LongWavy16 extends clts.SuperHLong {

    public LongWavy16() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongWavy16(int step, int dir) {
        super(step, dir);
    }

    public LongWavy16(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 15 + y, 2, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 4);
        g2d.fillRect(96 + x, 20 + y, 1, 3);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 4);
        g2d.fillRect(100 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 24 + y, 1, 5);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(94 + x, 26 + y, 1, 4);
        g2d.fillRect(102 + x, 26 + y, 1, 1);
        g2d.fillRect(93 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 2);
        g2d.fillRect(95 + x, 28 + y, 1, 9);
        g2d.fillRect(102 + x, 29 + y, 1, 5);
        g2d.fillRect(98 + x, 30 + y, 1, 2);
        g2d.fillRect(101 + x, 30 + y, 1, 4);
        g2d.fillRect(99 + x, 32 + y, 1, 3);
        g2d.fillRect(122 + x, 32 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 1, 2);
        g2d.fillRect(98 + x, 33 + y, 1, 2);
        g2d.fillRect(103 + x, 33 + y, 1, 2);
        g2d.fillRect(118 + x, 33 + y, 1, 4);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(123 + x, 33 + y, 1, 1);
        g2d.fillRect(100 + x, 34 + y, 1, 4);
        g2d.fillRect(104 + x, 34 + y, 1, 4);
        g2d.fillRect(117 + x, 34 + y, 1, 5);
        g2d.fillRect(122 + x, 34 + y, 1, 4);
        g2d.fillRect(101 + x, 35 + y, 1, 3);
        g2d.fillRect(105 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 3);
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(123 + x, 35 + y, 1, 2);
        g2d.fillRect(96 + x, 36 + y, 2, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(120 + x, 36 + y, 2, 1);
        g2d.fillRect(98 + x, 37 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(121 + x, 37 + y, 1, 2);
        g2d.fillRect(103 + x, 38 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(119 + x, 38 + y, 1, 3);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(104 + x, 39 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(115 + x, 39 + y, 2, 1);
        g2d.fillRect(118 + x, 39 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 2);
        g2d.fillRect(100 + x, 21 + y, 1, 3);
        g2d.fillRect(101 + x, 21 + y, 1, 3);
        g2d.fillRect(103 + x, 21 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 4);
        g2d.fillRect(96 + x, 23 + y, 2, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 4);
        g2d.fillRect(104 + x, 23 + y, 1, 3);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 2, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(93 + x, 25 + y, 1, 2);
        g2d.fillRect(94 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(97 + x, 26 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(123 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 27 + y, 1, 2);
        g2d.fillRect(105 + x, 27 + y, 2, 1);
        g2d.fillRect(96 + x, 28 + y, 2, 1);
        g2d.fillRect(103 + x, 28 + y, 1, 5);
        g2d.fillRect(104 + x, 28 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 2, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 2);
        g2d.fillRect(99 + x, 31 + y, 1, 1);
        g2d.fillRect(97 + x, 32 + y, 1, 4);
        g2d.fillRect(98 + x, 32 + y, 1, 1);
        g2d.fillRect(100 + x, 32 + y, 1, 2);
        g2d.fillRect(120 + x, 32 + y, 1, 2);
        g2d.fillRect(121 + x, 32 + y, 1, 1);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(104 + x, 33 + y, 1, 1);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(122 + x, 33 + y, 1, 1);
        g2d.fillRect(101 + x, 34 + y, 2, 1);
        g2d.fillRect(121 + x, 34 + y, 1, 2);
        g2d.fillRect(123 + x, 34 + y, 1, 1);
        g2d.fillRect(94 + x, 35 + y, 1, 3);
        g2d.fillRect(98 + x, 35 + y, 1, 2);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 1, 3);
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(105 + x, 36 + y, 1, 1);
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 3);
        g2d.fillRect(118 + x, 37 + y, 1, 2);
        g2d.fillRect(120 + x, 37 + y, 1, 3);
        g2d.fillRect(100 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(104 + x, 38 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 2, 1);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(117 + x, 39 + y, 1, 2);
        g2d.fillRect(115 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 3);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(94 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 25 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 2);
        g2d.fillRect(106 + x, 26 + y, 3, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);
        g2d.fillRect(103 + x, 27 + y, 1, 1);
        g2d.fillRect(98 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 29 + y, 2, 1);
        g2d.fillRect(99 + x, 29 + y, 1, 2);
        g2d.fillRect(100 + x, 30 + y, 1, 2);
        g2d.fillRect(97 + x, 31 + y, 1, 1);
        g2d.fillRect(96 + x, 32 + y, 1, 1);
        g2d.fillRect(120 + x, 34 + y, 1, 1);
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(103 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(119 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 39 + y, 1, 2);
        g2d.fillRect(121 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 1);
        g2d.fillRect(97 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 24 + y, 1, 2);
        g2d.fillRect(108 + x, 24 + y, 1, 2);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(94 + x, 37 + y, 1, 2);
        g2d.fillRect(97 + x, 37 + y, 1, 2);
        g2d.fillRect(122 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 38 + y, 1, 7);
        g2d.fillRect(95 + x, 39 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 1, 4);
        g2d.fillRect(112 + x, 39 + y, 2, 1);
        g2d.fillRect(120 + x, 39 + y, 1, 3);
        g2d.fillRect(122 + x, 39 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 6);
        g2d.fillRect(104 + x, 40 + y, 1, 7);
        g2d.fillRect(105 + x, 40 + y, 2, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(115 + x, 40 + y, 1, 4);
        g2d.fillRect(116 + x, 40 + y, 1, 7);
        g2d.fillRect(117 + x, 40 + y, 3, 1);
        g2d.fillRect(121 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(106 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 3);
        g2d.fillRect(102 + x, 42 + y, 1, 5);
        g2d.fillRect(105 + x, 42 + y, 1, 3);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(121 + x, 42 + y, 2, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 2);
        g2d.fillRect(117 + x, 43 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 3);
        g2d.fillRect(120 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 3);
        g2d.fillRect(119 + x, 45 + y, 1, 4);
        g2d.fillRect(122 + x, 45 + y, 1, 4);
        g2d.fillRect(123 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(96 + x, 48 + y, 1, 2);
        g2d.fillRect(98 + x, 48 + y, 1, 3);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(104 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 2);
        g2d.fillRect(97 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(122 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 36 + y, 1, 3);
        g2d.fillRect(96 + x, 37 + y, 1, 3);
        g2d.fillRect(122 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(121 + x, 39 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 2);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(122 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 2, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 3);
        g2d.fillRect(120 + x, 42 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 1, 3);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 3);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(121 + x, 43 + y, 2, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 2);
        g2d.fillRect(122 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 2);
        g2d.fillRect(117 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 45 + y, 2, 1);
        g2d.fillRect(95 + x, 46 + y, 2, 1);
        g2d.fillRect(99 + x, 46 + y, 2, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 3);
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 49 + y, 2, 1);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(121 + x, 49 + y, 2, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 36 + y, 1, 1);
        g2d.fillRect(97 + x, 39 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(121 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(123 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 15 + y, 2, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 4);
        g2d.fillRect(119 + x, 20 + y, 1, 3);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 4);
        g2d.fillRect(115 + x, 24 + y, 1, 2);
        g2d.fillRect(114 + x, 24 + y, 1, 5);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 4);
        g2d.fillRect(113 + x, 26 + y, 1, 1);
        g2d.fillRect(122 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 2);
        g2d.fillRect(120 + x, 28 + y, 1, 9);
        g2d.fillRect(113 + x, 29 + y, 1, 5);
        g2d.fillRect(117 + x, 30 + y, 1, 2);
        g2d.fillRect(114 + x, 30 + y, 1, 4);
        g2d.fillRect(116 + x, 32 + y, 1, 3);
        g2d.fillRect(93 + x, 32 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 2);
        g2d.fillRect(117 + x, 33 + y, 1, 2);
        g2d.fillRect(112 + x, 33 + y, 1, 2);
        g2d.fillRect(97 + x, 33 + y, 1, 4);
        g2d.fillRect(94 + x, 33 + y, 1, 1);
        g2d.fillRect(92 + x, 33 + y, 1, 1);
        g2d.fillRect(115 + x, 34 + y, 1, 4);
        g2d.fillRect(111 + x, 34 + y, 1, 4);
        g2d.fillRect(98 + x, 34 + y, 1, 5);
        g2d.fillRect(93 + x, 34 + y, 1, 4);
        g2d.fillRect(114 + x, 35 + y, 1, 3);
        g2d.fillRect(110 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 3);
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(92 + x, 35 + y, 1, 2);
        g2d.fillRect(118 + x, 36 + y, 2, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(94 + x, 36 + y, 2, 1);
        g2d.fillRect(117 + x, 37 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 2);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(94 + x, 37 + y, 1, 2);
        g2d.fillRect(112 + x, 38 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(96 + x, 38 + y, 1, 3);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(99 + x, 39 + y, 2, 1);
        g2d.fillRect(97 + x, 39 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 2);
        g2d.fillRect(115 + x, 21 + y, 1, 3);
        g2d.fillRect(114 + x, 21 + y, 1, 3);
        g2d.fillRect(112 + x, 21 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 4);
        g2d.fillRect(118 + x, 23 + y, 2, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 4);
        g2d.fillRect(111 + x, 23 + y, 1, 3);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 2, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(122 + x, 25 + y, 1, 2);
        g2d.fillRect(121 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(118 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(92 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 27 + y, 1, 2);
        g2d.fillRect(109 + x, 27 + y, 2, 1);
        g2d.fillRect(118 + x, 28 + y, 2, 1);
        g2d.fillRect(112 + x, 28 + y, 1, 5);
        g2d.fillRect(111 + x, 28 + y, 1, 1);
        g2d.fillRect(117 + x, 29 + y, 1, 1);
        g2d.fillRect(114 + x, 29 + y, 2, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 2);
        g2d.fillRect(116 + x, 31 + y, 1, 1);
        g2d.fillRect(118 + x, 32 + y, 1, 4);
        g2d.fillRect(117 + x, 32 + y, 1, 1);
        g2d.fillRect(115 + x, 32 + y, 1, 2);
        g2d.fillRect(95 + x, 32 + y, 1, 2);
        g2d.fillRect(94 + x, 32 + y, 1, 1);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(111 + x, 33 + y, 1, 1);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(93 + x, 33 + y, 1, 1);
        g2d.fillRect(113 + x, 34 + y, 2, 1);
        g2d.fillRect(94 + x, 34 + y, 1, 2);
        g2d.fillRect(92 + x, 34 + y, 1, 1);
        g2d.fillRect(121 + x, 35 + y, 1, 3);
        g2d.fillRect(117 + x, 35 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(113 + x, 35 + y, 1, 3);
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(110 + x, 36 + y, 1, 1);
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 37 + y, 1, 3);
        g2d.fillRect(97 + x, 37 + y, 1, 2);
        g2d.fillRect(95 + x, 37 + y, 1, 3);
        g2d.fillRect(115 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 38 + y, 2, 1);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 39 + y, 1, 2);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 3);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(121 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 25 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 2);
        g2d.fillRect(107 + x, 26 + y, 3, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(112 + x, 27 + y, 1, 1);
        g2d.fillRect(117 + x, 28 + y, 1, 1);
        g2d.fillRect(118 + x, 29 + y, 2, 1);
        g2d.fillRect(116 + x, 29 + y, 1, 2);
        g2d.fillRect(115 + x, 30 + y, 1, 2);
        g2d.fillRect(118 + x, 31 + y, 1, 1);
        g2d.fillRect(119 + x, 32 + y, 1, 1);
        g2d.fillRect(95 + x, 34 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(112 + x, 35 + y, 1, 3);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(96 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 39 + y, 1, 2);
        g2d.fillRect(94 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(117 + x, 27 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 1);
        g2d.fillRect(118 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 24 + y, 1, 2);
        g2d.fillRect(107 + x, 24 + y, 1, 2);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(121 + x, 37 + y, 1, 2);
        g2d.fillRect(118 + x, 37 + y, 1, 2);
        g2d.fillRect(93 + x, 37 + y, 1, 1);
        g2d.fillRect(117 + x, 38 + y, 1, 7);
        g2d.fillRect(120 + x, 39 + y, 1, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 2);
        g2d.fillRect(112 + x, 39 + y, 1, 4);
        g2d.fillRect(102 + x, 39 + y, 2, 1);
        g2d.fillRect(95 + x, 39 + y, 1, 3);
        g2d.fillRect(93 + x, 39 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 6);
        g2d.fillRect(111 + x, 40 + y, 1, 7);
        g2d.fillRect(109 + x, 40 + y, 2, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 2);
        g2d.fillRect(100 + x, 40 + y, 1, 4);
        g2d.fillRect(99 + x, 40 + y, 1, 7);
        g2d.fillRect(96 + x, 40 + y, 3, 1);
        g2d.fillRect(94 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 2);
        g2d.fillRect(109 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(113 + x, 42 + y, 1, 5);
        g2d.fillRect(110 + x, 42 + y, 1, 3);
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(93 + x, 42 + y, 2, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 2);
        g2d.fillRect(98 + x, 43 + y, 1, 2);
        g2d.fillRect(114 + x, 44 + y, 1, 3);
        g2d.fillRect(95 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 3);
        g2d.fillRect(96 + x, 45 + y, 1, 4);
        g2d.fillRect(93 + x, 45 + y, 1, 4);
        g2d.fillRect(92 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(115 + x, 48 + y, 1, 3);
        g2d.fillRect(111 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(95 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(96 + x, 50 + y, 1, 1);
        g2d.fillRect(94 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(93 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(92 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 36 + y, 1, 3);
        g2d.fillRect(119 + x, 37 + y, 1, 3);
        g2d.fillRect(93 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(94 + x, 39 + y, 1, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 2);
        g2d.fillRect(116 + x, 41 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(93 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 2, 1);
        g2d.fillRect(97 + x, 42 + y, 1, 3);
        g2d.fillRect(95 + x, 42 + y, 1, 2);
        g2d.fillRect(92 + x, 42 + y, 1, 3);
        g2d.fillRect(114 + x, 43 + y, 1, 1);
        g2d.fillRect(112 + x, 43 + y, 1, 3);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(93 + x, 43 + y, 2, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 2);
        g2d.fillRect(98 + x, 45 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 2, 1);
        g2d.fillRect(119 + x, 46 + y, 2, 1);
        g2d.fillRect(115 + x, 46 + y, 2, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 47 + y, 1, 3);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 2, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 49 + y, 2, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(92 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 36 + y, 1, 1);
        g2d.fillRect(118 + x, 39 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 1, 2);
        g2d.fillRect(95 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(92 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(94 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(33, 33, 33));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(99, 0, 0));
        COLORS.set(ImageUtilities.GREY, new Color(156, 0, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(206, 0, 0));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(49, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(49, 24, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(99, 57, 0));
        COLORS.set(ImageUtilities.GREY, new Color(156, 90, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(206, 123, 0));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 156, 0));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
