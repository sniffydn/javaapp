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
public class LongStraight4 extends SuperHLong {

    public LongStraight4() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight4(int step, int dir) {
        super(step, dir);
    }

    public LongStraight4(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 39 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 64 + y, 1, 1);
        g2d.fillRect(93 + x, 67 + y, 1, 1);
        g2d.fillRect(121 + x, 67 + y, 1, 4);
        g2d.fillRect(92 + x, 70 + y, 1, 1);
        g2d.fillRect(90 + x, 72 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 35 + y, 1, 8);
        g2d.fillRect(119 + x, 36 + y, 1, 11);
        g2d.fillRect(115 + x, 38 + y, 1, 6);
        g2d.fillRect(95 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 9);
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(104 + x, 42 + y, 2, 1);
        g2d.fillRect(113 + x, 42 + y, 2, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(116 + x, 44 + y, 1, 3);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 3);
        g2d.fillRect(95 + x, 48 + y, 1, 3);
        g2d.fillRect(96 + x, 48 + y, 1, 1);
        g2d.fillRect(94 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 3);
        g2d.fillRect(121 + x, 50 + y, 1, 2);
        g2d.fillRect(95 + x, 52 + y, 1, 4);
        g2d.fillRect(122 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 8);
        g2d.fillRect(118 + x, 55 + y, 1, 10);
        g2d.fillRect(102 + x, 59 + y, 1, 9);
        g2d.fillRect(96 + x, 60 + y, 1, 2);
        g2d.fillRect(94 + x, 61 + y, 1, 3);
        g2d.fillRect(95 + x, 61 + y, 1, 2);
        g2d.fillRect(120 + x, 62 + y, 1, 2);
        g2d.fillRect(96 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 64 + y, 1, 2);
        g2d.fillRect(93 + x, 65 + y, 1, 1);
        g2d.fillRect(119 + x, 65 + y, 1, 3);
        g2d.fillRect(95 + x, 66 + y, 1, 1);
        g2d.fillRect(92 + x, 67 + y, 1, 3);
        g2d.fillRect(94 + x, 67 + y, 1, 2);
        g2d.fillRect(93 + x, 68 + y, 1, 1);
        g2d.fillRect(101 + x, 68 + y, 1, 2);
        g2d.fillRect(120 + x, 68 + y, 1, 2);
        g2d.fillRect(91 + x, 70 + y, 1, 2);
        g2d.fillRect(122 + x, 70 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(120 + x, 34 + y, 1, 2);
        g2d.fillRect(121 + x, 34 + y, 1, 2);
        g2d.fillRect(118 + x, 35 + y, 1, 11);
        g2d.fillRect(117 + x, 37 + y, 1, 4);
        g2d.fillRect(99 + x, 38 + y, 1, 10);
        g2d.fillRect(104 + x, 38 + y, 1, 1);
        g2d.fillRect(121 + x, 38 + y, 1, 1);
        g2d.fillRect(96 + x, 39 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 1, 3);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(98 + x, 41 + y, 1, 9);
        g2d.fillRect(104 + x, 41 + y, 3, 1);
        g2d.fillRect(120 + x, 41 + y, 1, 4);
        g2d.fillRect(122 + x, 41 + y, 1, 1);
        g2d.fillRect(106 + x, 42 + y, 2, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(121 + x, 42 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 3);
        g2d.fillRect(102 + x, 43 + y, 1, 7);
        g2d.fillRect(107 + x, 43 + y, 1, 1);
        g2d.fillRect(113 + x, 43 + y, 2, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 2);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 47 + y, 1, 4);
        g2d.fillRect(101 + x, 47 + y, 1, 4);
        g2d.fillRect(119 + x, 47 + y, 1, 3);
        g2d.fillRect(96 + x, 49 + y, 1, 4);
        g2d.fillRect(100 + x, 49 + y, 1, 4);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(94 + x, 51 + y, 1, 2);
        g2d.fillRect(95 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 4);
        g2d.fillRect(93 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 4);
        g2d.fillRect(100 + x, 54 + y, 1, 6);
        g2d.fillRect(120 + x, 54 + y, 1, 4);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(122 + x, 56 + y, 2, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 9);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 9);
        g2d.fillRect(119 + x, 59 + y, 1, 4);
        g2d.fillRect(121 + x, 59 + y, 1, 1);
        g2d.fillRect(120 + x, 60 + y, 1, 2);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 3);
        g2d.fillRect(101 + x, 61 + y, 1, 7);
        g2d.fillRect(96 + x, 65 + y, 1, 4);
        g2d.fillRect(100 + x, 65 + y, 1, 4);
        g2d.fillRect(118 + x, 65 + y, 1, 3);
        g2d.fillRect(95 + x, 67 + y, 1, 2);
        g2d.fillRect(120 + x, 67 + y, 1, 1);
        g2d.fillRect(119 + x, 68 + y, 1, 1);
        g2d.fillRect(93 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(120 + x, 36 + y, 1, 3);
        g2d.fillRect(98 + x, 37 + y, 1, 3);
        g2d.fillRect(102 + x, 38 + y, 1, 4);
        g2d.fillRect(97 + x, 39 + y, 1, 2);
        g2d.fillRect(121 + x, 39 + y, 1, 3);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 41 + y, 1, 3);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 4);
        g2d.fillRect(122 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 1);
        g2d.fillRect(123 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(124 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 45 + y, 1, 2);
        g2d.fillRect(100 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(121 + x, 47 + y, 1, 2);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(122 + x, 48 + y, 1, 1);
        g2d.fillRect(123 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 7);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 8);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 10);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 6);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 5);
        g2d.fillRect(122 + x, 54 + y, 1, 2);
        g2d.fillRect(123 + x, 55 + y, 1, 1);
        g2d.fillRect(96 + x, 58 + y, 1, 2);
        g2d.fillRect(120 + x, 58 + y, 1, 2);
        g2d.fillRect(95 + x, 59 + y, 1, 2);
        g2d.fillRect(94 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 60 + y, 1, 5);
        g2d.fillRect(121 + x, 60 + y, 1, 2);
        g2d.fillRect(93 + x, 61 + y, 1, 1);
        g2d.fillRect(122 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 62 + y, 1, 2);
        g2d.fillRect(123 + x, 62 + y, 1, 1);
        g2d.fillRect(95 + x, 63 + y, 1, 3);
        g2d.fillRect(119 + x, 63 + y, 1, 2);
        g2d.fillRect(99 + x, 64 + y, 1, 3);
        g2d.fillRect(120 + x, 64 + y, 1, 3);
        g2d.fillRect(94 + x, 65 + y, 1, 1);
        g2d.fillRect(93 + x, 66 + y, 1, 1);
        g2d.fillRect(98 + x, 66 + y, 1, 3);
        g2d.fillRect(121 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 67 + y, 1, 1);
        g2d.fillRect(122 + x, 67 + y, 1, 1);
        g2d.fillRect(97 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 68 + y, 1, 2);
        g2d.fillRect(96 + x, 69 + y, 1, 1);
        g2d.fillRect(100 + x, 69 + y, 1, 1);
        g2d.fillRect(119 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 38 + y, 1, 2);
        g2d.fillRect(116 + x, 39 + y, 1, 3);
        g2d.fillRect(120 + x, 39 + y, 1, 2);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 5);
        g2d.fillRect(122 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(112 + x, 21 + y, 1, 2);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 25 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 37 + y, 1, 1);
        g2d.fillRect(123 + x, 38 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 20 + y, 1, 3);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 2, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 2);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 2);
        g2d.fillRect(118 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 29 + y, 2, 1);
        g2d.fillRect(120 + x, 30 + y, 1, 1);
        g2d.fillRect(119 + x, 31 + y, 1, 1);
        g2d.fillRect(121 + x, 31 + y, 1, 3);
        g2d.fillRect(122 + x, 34 + y, 1, 1);
        g2d.fillRect(121 + x, 35 + y, 1, 1);
        g2d.fillRect(122 + x, 36 + y, 1, 1);
        g2d.fillRect(123 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 2);
        g2d.fillRect(116 + x, 23 + y, 1, 2);
        g2d.fillRect(117 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 25 + y, 1, 3);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 1);
        g2d.fillRect(120 + x, 31 + y, 1, 3);
        g2d.fillRect(121 + x, 34 + y, 1, 1);
        g2d.fillRect(122 + x, 35 + y, 1, 1);
        g2d.fillRect(123 + x, 36 + y, 1, 1);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 11 + y, 6, 1);
        g2d.fillRect(111 + x, 11 + y, 3, 1);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 2, 1);
        g2d.fillRect(100 + x, 13 + y, 2, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 4, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 4, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 3);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 2, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 4);
        g2d.fillRect(100 + x, 19 + y, 1, 3);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(120 + x, 20 + y, 2, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 8);
        g2d.fillRect(99 + x, 22 + y, 1, 3);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 17);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(98 + x, 25 + y, 1, 5);
        g2d.fillRect(122 + x, 29 + y, 1, 4);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(123 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(105 + x, 12 + y, 1, 2);
        g2d.fillRect(106 + x, 12 + y, 1, 2);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 3, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 3);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 2, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 4);
        g2d.fillRect(107 + x, 17 + y, 1, 3);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 3);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(113 + x, 18 + y, 1, 3);
        g2d.fillRect(116 + x, 18 + y, 3, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 4);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 2);
        g2d.fillRect(115 + x, 19 + y, 1, 3);
        g2d.fillRect(117 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 2, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 2);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 4);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 2);
        g2d.fillRect(97 + x, 23 + y, 2, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 3);
        g2d.fillRect(120 + x, 23 + y, 1, 7);
        g2d.fillRect(98 + x, 24 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 2);
        g2d.fillRect(99 + x, 25 + y, 1, 4);
        g2d.fillRect(102 + x, 25 + y, 1, 5);
        g2d.fillRect(119 + x, 25 + y, 1, 2);
        g2d.fillRect(97 + x, 26 + y, 1, 14);
        g2d.fillRect(101 + x, 28 + y, 1, 12);
        g2d.fillRect(121 + x, 29 + y, 1, 3);
        g2d.fillRect(98 + x, 30 + y, 1, 5);
        g2d.fillRect(119 + x, 31 + y, 1, 4);
        g2d.fillRect(104 + x, 33 + y, 1, 6);
        g2d.fillRect(118 + x, 33 + y, 1, 3);
        g2d.fillRect(120 + x, 33 + y, 1, 2);
        g2d.fillRect(122 + x, 33 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(121 + x, 36 + y, 1, 3);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 3);
        g2d.fillRect(106 + x, 15 + y, 3, 1);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 4);
        g2d.fillRect(115 + x, 17 + y, 2, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 3);
        g2d.fillRect(109 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 19 + y, 1, 2);
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 1, 3);
        g2d.fillRect(105 + x, 21 + y, 1, 3);
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 1, 2);
        g2d.fillRect(104 + x, 23 + y, 1, 4);
        g2d.fillRect(97 + x, 24 + y, 1, 2);
        g2d.fillRect(100 + x, 26 + y, 1, 3);
        g2d.fillRect(103 + x, 26 + y, 1, 6);
        g2d.fillRect(99 + x, 29 + y, 1, 6);
        g2d.fillRect(102 + x, 30 + y, 1, 9);
        g2d.fillRect(104 + x, 32 + y, 1, 1);
        g2d.fillRect(117 + x, 34 + y, 1, 4);
        g2d.fillRect(98 + x, 35 + y, 1, 3);
        g2d.fillRect(120 + x, 36 + y, 1, 2);
        g2d.fillRect(116 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 25 + y, 1, 3);
        g2d.fillRect(104 + x, 27 + y, 1, 5);
        g2d.fillRect(100 + x, 29 + y, 1, 6);
        g2d.fillRect(103 + x, 32 + y, 1, 7);
        g2d.fillRect(99 + x, 35 + y, 1, 4);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(111 + x, 39 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 64 + y, 1, 1);
        g2d.fillRect(122 + x, 67 + y, 1, 1);
        g2d.fillRect(94 + x, 67 + y, 1, 4);
        g2d.fillRect(123 + x, 70 + y, 1, 1);
        g2d.fillRect(124 + x, 72 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 35 + y, 1, 8);
        g2d.fillRect(96 + x, 36 + y, 1, 11);
        g2d.fillRect(100 + x, 38 + y, 1, 6);
        g2d.fillRect(120 + x, 41 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 9);
        g2d.fillRect(118 + x, 42 + y, 1, 2);
        g2d.fillRect(110 + x, 42 + y, 2, 1);
        g2d.fillRect(101 + x, 42 + y, 2, 1);
        g2d.fillRect(120 + x, 43 + y, 1, 4);
        g2d.fillRect(99 + x, 44 + y, 1, 3);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 3);
        g2d.fillRect(120 + x, 48 + y, 1, 3);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 3);
        g2d.fillRect(94 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(93 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 53 + y, 1, 8);
        g2d.fillRect(97 + x, 55 + y, 1, 10);
        g2d.fillRect(113 + x, 59 + y, 1, 9);
        g2d.fillRect(119 + x, 60 + y, 1, 2);
        g2d.fillRect(121 + x, 61 + y, 1, 3);
        g2d.fillRect(120 + x, 61 + y, 1, 2);
        g2d.fillRect(95 + x, 62 + y, 1, 2);
        g2d.fillRect(119 + x, 64 + y, 1, 1);
        g2d.fillRect(94 + x, 64 + y, 1, 2);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(96 + x, 65 + y, 1, 3);
        g2d.fillRect(120 + x, 66 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 3);
        g2d.fillRect(121 + x, 67 + y, 1, 2);
        g2d.fillRect(122 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(95 + x, 68 + y, 1, 2);
        g2d.fillRect(124 + x, 70 + y, 1, 2);
        g2d.fillRect(93 + x, 70 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(95 + x, 34 + y, 1, 2);
        g2d.fillRect(94 + x, 34 + y, 1, 2);
        g2d.fillRect(97 + x, 35 + y, 1, 11);
        g2d.fillRect(98 + x, 37 + y, 1, 4);
        g2d.fillRect(116 + x, 38 + y, 1, 10);
        g2d.fillRect(111 + x, 38 + y, 1, 1);
        g2d.fillRect(94 + x, 38 + y, 1, 1);
        g2d.fillRect(119 + x, 39 + y, 1, 2);
        g2d.fillRect(114 + x, 39 + y, 1, 3);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(101 + x, 40 + y, 1, 2);
        g2d.fillRect(117 + x, 41 + y, 1, 9);
        g2d.fillRect(109 + x, 41 + y, 3, 1);
        g2d.fillRect(95 + x, 41 + y, 1, 4);
        g2d.fillRect(93 + x, 41 + y, 1, 1);
        g2d.fillRect(108 + x, 42 + y, 2, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(94 + x, 42 + y, 1, 2);
        g2d.fillRect(92 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 3);
        g2d.fillRect(113 + x, 43 + y, 1, 7);
        g2d.fillRect(108 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 2, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 4);
        g2d.fillRect(114 + x, 47 + y, 1, 4);
        g2d.fillRect(96 + x, 47 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 4);
        g2d.fillRect(115 + x, 49 + y, 1, 4);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 4);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 2);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 4);
        g2d.fillRect(115 + x, 54 + y, 1, 6);
        g2d.fillRect(95 + x, 54 + y, 1, 4);
        g2d.fillRect(94 + x, 55 + y, 1, 1);
        g2d.fillRect(92 + x, 56 + y, 2, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 9);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 9);
        g2d.fillRect(96 + x, 59 + y, 1, 4);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(95 + x, 60 + y, 1, 2);
        g2d.fillRect(93 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 3);
        g2d.fillRect(114 + x, 61 + y, 1, 7);
        g2d.fillRect(119 + x, 65 + y, 1, 4);
        g2d.fillRect(115 + x, 65 + y, 1, 4);
        g2d.fillRect(97 + x, 65 + y, 1, 3);
        g2d.fillRect(120 + x, 67 + y, 1, 2);
        g2d.fillRect(95 + x, 67 + y, 1, 1);
        g2d.fillRect(96 + x, 68 + y, 1, 1);
        g2d.fillRect(121 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(95 + x, 36 + y, 1, 3);
        g2d.fillRect(117 + x, 37 + y, 1, 3);
        g2d.fillRect(113 + x, 38 + y, 1, 4);
        g2d.fillRect(118 + x, 39 + y, 1, 2);
        g2d.fillRect(94 + x, 39 + y, 1, 3);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 3);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(120 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 4);
        g2d.fillRect(93 + x, 42 + y, 1, 1);
        g2d.fillRect(121 + x, 43 + y, 1, 1);
        g2d.fillRect(92 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 1);
        g2d.fillRect(91 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 2);
        g2d.fillRect(95 + x, 45 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 2);
        g2d.fillRect(97 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 47 + y, 1, 2);
        g2d.fillRect(121 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(92 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 7);
        g2d.fillRect(96 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 8);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 10);
        g2d.fillRect(95 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 6);
        g2d.fillRect(94 + x, 53 + y, 1, 2);
        g2d.fillRect(96 + x, 54 + y, 1, 5);
        g2d.fillRect(93 + x, 54 + y, 1, 2);
        g2d.fillRect(92 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 2);
        g2d.fillRect(95 + x, 58 + y, 1, 2);
        g2d.fillRect(120 + x, 59 + y, 1, 2);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 5);
        g2d.fillRect(94 + x, 60 + y, 1, 2);
        g2d.fillRect(122 + x, 61 + y, 1, 1);
        g2d.fillRect(93 + x, 61 + y, 1, 1);
        g2d.fillRect(119 + x, 62 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 1, 1);
        g2d.fillRect(120 + x, 63 + y, 1, 3);
        g2d.fillRect(96 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 64 + y, 1, 3);
        g2d.fillRect(95 + x, 64 + y, 1, 3);
        g2d.fillRect(121 + x, 65 + y, 1, 1);
        g2d.fillRect(122 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 66 + y, 1, 3);
        g2d.fillRect(94 + x, 66 + y, 1, 1);
        g2d.fillRect(98 + x, 67 + y, 1, 1);
        g2d.fillRect(93 + x, 67 + y, 1, 1);
        g2d.fillRect(118 + x, 68 + y, 1, 2);
        g2d.fillRect(97 + x, 68 + y, 1, 2);
        g2d.fillRect(119 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 38 + y, 1, 2);
        g2d.fillRect(99 + x, 39 + y, 1, 3);
        g2d.fillRect(95 + x, 39 + y, 1, 2);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 5);
        g2d.fillRect(93 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(94 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 1);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 1, 1);
        g2d.fillRect(100 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 37 + y, 1, 1);
        g2d.fillRect(91 + x, 38 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 20 + y, 1, 3);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 2, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 2);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 2);
        g2d.fillRect(97 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 2, 1);
        g2d.fillRect(95 + x, 30 + y, 1, 1);
        g2d.fillRect(96 + x, 31 + y, 1, 1);
        g2d.fillRect(94 + x, 31 + y, 1, 3);
        g2d.fillRect(93 + x, 34 + y, 1, 1);
        g2d.fillRect(94 + x, 35 + y, 1, 1);
        g2d.fillRect(93 + x, 36 + y, 1, 1);
        g2d.fillRect(91 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 2);
        g2d.fillRect(99 + x, 23 + y, 1, 2);
        g2d.fillRect(98 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 25 + y, 1, 3);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 1);
        g2d.fillRect(95 + x, 31 + y, 1, 3);
        g2d.fillRect(94 + x, 34 + y, 1, 1);
        g2d.fillRect(93 + x, 35 + y, 1, 1);
        g2d.fillRect(92 + x, 36 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 11 + y, 6, 1);
        g2d.fillRect(102 + x, 11 + y, 3, 1);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 2, 1);
        g2d.fillRect(114 + x, 13 + y, 2, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 4, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 4, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 3);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 11 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 2, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 4);
        g2d.fillRect(115 + x, 19 + y, 1, 3);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(94 + x, 20 + y, 2, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 8);
        g2d.fillRect(116 + x, 22 + y, 1, 3);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 17);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(117 + x, 25 + y, 1, 5);
        g2d.fillRect(93 + x, 29 + y, 1, 4);
        g2d.fillRect(115 + x, 35 + y, 1, 1);
        g2d.fillRect(92 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(110 + x, 12 + y, 1, 2);
        g2d.fillRect(109 + x, 12 + y, 1, 2);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 3, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 3);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 2, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 4);
        g2d.fillRect(108 + x, 17 + y, 1, 3);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 3);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(102 + x, 18 + y, 1, 3);
        g2d.fillRect(97 + x, 18 + y, 3, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 4);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 2);
        g2d.fillRect(100 + x, 19 + y, 1, 3);
        g2d.fillRect(98 + x, 19 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 2, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 2);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 4);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 2);
        g2d.fillRect(117 + x, 23 + y, 2, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 3);
        g2d.fillRect(95 + x, 23 + y, 1, 7);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 2);
        g2d.fillRect(116 + x, 25 + y, 1, 4);
        g2d.fillRect(113 + x, 25 + y, 1, 5);
        g2d.fillRect(96 + x, 25 + y, 1, 2);
        g2d.fillRect(118 + x, 26 + y, 1, 14);
        g2d.fillRect(114 + x, 28 + y, 1, 12);
        g2d.fillRect(94 + x, 29 + y, 1, 3);
        g2d.fillRect(117 + x, 30 + y, 1, 5);
        g2d.fillRect(96 + x, 31 + y, 1, 4);
        g2d.fillRect(111 + x, 33 + y, 1, 6);
        g2d.fillRect(97 + x, 33 + y, 1, 3);
        g2d.fillRect(95 + x, 33 + y, 1, 2);
        g2d.fillRect(93 + x, 33 + y, 1, 2);
        g2d.fillRect(99 + x, 35 + y, 1, 3);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(94 + x, 36 + y, 1, 3);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 13 + y, 2, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 3);
        g2d.fillRect(107 + x, 15 + y, 3, 1);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 1, 3);
        g2d.fillRect(101 + x, 16 + y, 2, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 4);
        g2d.fillRect(99 + x, 17 + y, 2, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 3);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 2);
        g2d.fillRect(113 + x, 21 + y, 1, 3);
        g2d.fillRect(110 + x, 21 + y, 1, 3);
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 2);
        g2d.fillRect(111 + x, 23 + y, 1, 4);
        g2d.fillRect(118 + x, 24 + y, 1, 2);
        g2d.fillRect(115 + x, 26 + y, 1, 3);
        g2d.fillRect(112 + x, 26 + y, 1, 6);
        g2d.fillRect(116 + x, 29 + y, 1, 6);
        g2d.fillRect(113 + x, 30 + y, 1, 9);
        g2d.fillRect(111 + x, 32 + y, 1, 1);
        g2d.fillRect(98 + x, 34 + y, 1, 4);
        g2d.fillRect(117 + x, 35 + y, 1, 3);
        g2d.fillRect(95 + x, 36 + y, 1, 2);
        g2d.fillRect(99 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 2);
        g2d.fillRect(114 + x, 25 + y, 1, 3);
        g2d.fillRect(111 + x, 27 + y, 1, 5);
        g2d.fillRect(115 + x, 29 + y, 1, 6);
        g2d.fillRect(112 + x, 32 + y, 1, 7);
        g2d.fillRect(116 + x, 35 + y, 1, 4);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 1, 1);
    }
}
