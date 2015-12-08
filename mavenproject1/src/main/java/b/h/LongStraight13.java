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
public class LongStraight13 extends SuperHLong {

    int prevY = 0;
    int prevPrevY = 0;

    public LongStraight13() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight13(int step, int dir) {
        super(step, dir);
    }

    public LongStraight13(int step, int dir, ColorArray colorSwitch) {
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
        prevY = y;
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 11 + y, 1, 4);
        g2d.fillRect(105 + x, 11 + y, 1, 4);
        g2d.fillRect(106 + x, 11 + y, 1, 4);
        g2d.fillRect(107 + x, 11 + y, 1, 4);
        g2d.fillRect(108 + x, 11 + y, 1, 4);
        g2d.fillRect(109 + x, 11 + y, 1, 7);
        g2d.fillRect(110 + x, 11 + y, 1, 2);
        g2d.fillRect(111 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 11 + y, 1, 4);
        g2d.fillRect(113 + x, 11 + y, 1, 4);
        g2d.fillRect(101 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 4);
        g2d.fillRect(115 + x, 12 + y, 1, 4);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 4);
        g2d.fillRect(117 + x, 13 + y, 1, 4);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 6);
        g2d.fillRect(118 + x, 14 + y, 1, 5);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 5);
        g2d.fillRect(119 + x, 15 + y, 1, 5);
        g2d.fillRect(98 + x, 16 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 5);
        g2d.fillRect(107 + x, 16 + y, 1, 4);
        g2d.fillRect(108 + x, 16 + y, 1, 3);
        g2d.fillRect(112 + x, 16 + y, 1, 3);
        g2d.fillRect(120 + x, 16 + y, 1, 5);
        g2d.fillRect(105 + x, 17 + y, 1, 4);
        g2d.fillRect(113 + x, 17 + y, 2, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 4, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 5);
        g2d.fillRect(100 + x, 19 + y, 1, 3);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(121 + x, 19 + y, 1, 11);
        g2d.fillRect(108 + x, 20 + y, 2, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 1, 13);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 21 + y, 1, 3);
        g2d.fillRect(122 + x, 21 + y, 1, 3);
        g2d.fillRect(99 + x, 22 + y, 1, 3);
        g2d.fillRect(119 + x, 22 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 4);
        g2d.fillRect(103 + x, 24 + y, 1, 2);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 5);
        g2d.fillRect(102 + x, 25 + y, 1, 5);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 26 + y, 1, 4);
        g2d.fillRect(97 + x, 26 + y, 1, 8);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 28 + y, 1, 6);
        g2d.fillRect(104 + x, 28 + y, 1, 5);
        g2d.fillRect(118 + x, 28 + y, 1, 2);
        g2d.fillRect(119 + x, 29 + y, 1, 7);
        g2d.fillRect(122 + x, 29 + y, 1, 4);
        g2d.fillRect(118 + x, 33 + y, 1, 3);
        g2d.fillRect(120 + x, 34 + y, 1, 2);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 13 + y, 1, 3);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(100 + x, 14 + y, 1, 5);
        g2d.fillRect(101 + x, 14 + y, 1, 4);
        g2d.fillRect(104 + x, 15 + y, 1, 4);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(106 + x, 15 + y, 3, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 6);
        g2d.fillRect(103 + x, 16 + y, 1, 5);
        g2d.fillRect(102 + x, 17 + y, 1, 5);
        g2d.fillRect(113 + x, 18 + y, 1, 3);
        g2d.fillRect(98 + x, 19 + y, 1, 6);
        g2d.fillRect(101 + x, 19 + y, 1, 9);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 4);
        g2d.fillRect(115 + x, 19 + y, 1, 5);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(118 + x, 20 + y, 2, 1);
        g2d.fillRect(122 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 4);
        g2d.fillRect(119 + x, 21 + y, 2, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 12);
        g2d.fillRect(117 + x, 22 + y, 1, 4);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 2);
        g2d.fillRect(97 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 24 + y, 1, 4);
        g2d.fillRect(122 + x, 24 + y, 1, 5);
        g2d.fillRect(99 + x, 25 + y, 1, 9);
        g2d.fillRect(104 + x, 25 + y, 1, 3);
        g2d.fillRect(119 + x, 25 + y, 1, 4);
        g2d.fillRect(103 + x, 26 + y, 1, 8);
        g2d.fillRect(120 + x, 27 + y, 1, 7);
        g2d.fillRect(95 + x, 30 + y, 1, 4);
        g2d.fillRect(98 + x, 30 + y, 1, 4);
        g2d.fillRect(102 + x, 30 + y, 1, 4);
        g2d.fillRect(121 + x, 30 + y, 1, 6);
        g2d.fillRect(104 + x, 33 + y, 1, 1);
        g2d.fillRect(122 + x, 33 + y, 1, 3);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 13 + y, 2, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(113 + x, 16 + y, 3, 1);
        g2d.fillRect(115 + x, 17 + y, 3, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
    }

    public void paintB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 43 + y, 1, 13);
        g2d.fillRect(121 + x, 51 + y, 1, 7);
        g2d.fillRect(98 + x, 56 + y, 1, 7);
        g2d.fillRect(116 + x, 56 + y, 1, 11);
        g2d.fillRect(100 + x, 57 + y, 1, 18);
        g2d.fillRect(102 + x, 58 + y, 1, 10);
        g2d.fillRect(103 + x, 58 + y, 1, 4);
        g2d.fillRect(120 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 13);
        g2d.fillRect(99 + x, 61 + y, 1, 8);
        g2d.fillRect(101 + x, 61 + y, 1, 8);
        g2d.fillRect(118 + x, 61 + y, 1, 10);
        g2d.fillRect(119 + x, 62 + y, 1, 6);
        g2d.fillRect(101 + x, 70 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 33 + y, 1, 8);
        g2d.fillRect(97 + x, 33 + y, 1, 3);
        g2d.fillRect(101 + x, 33 + y, 1, 6);
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 35 + y, 1, 8);
        g2d.fillRect(118 + x, 35 + y, 1, 7);
        g2d.fillRect(119 + x, 35 + y, 1, 21);
        g2d.fillRect(121 + x, 35 + y, 1, 5);
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(122 + x, 36 + y, 1, 6);
        g2d.fillRect(115 + x, 37 + y, 1, 16);
        g2d.fillRect(104 + x, 39 + y, 1, 2);
        g2d.fillRect(103 + x, 41 + y, 1, 17);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 4);
        g2d.fillRect(102 + x, 43 + y, 1, 6);
        g2d.fillRect(122 + x, 43 + y, 1, 2);
        g2d.fillRect(100 + x, 44 + y, 1, 1);
        g2d.fillRect(121 + x, 45 + y, 1, 6);
        g2d.fillRect(97 + x, 47 + y, 1, 4);
        g2d.fillRect(101 + x, 47 + y, 1, 7);
        g2d.fillRect(118 + x, 51 + y, 1, 5);
        g2d.fillRect(99 + x, 53 + y, 2, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 5);
        g2d.fillRect(119 + x, 58 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 33 + y, 1, 2);
        g2d.fillRect(98 + x, 33 + y, 1, 21);
        g2d.fillRect(99 + x, 33 + y, 1, 20);
        g2d.fillRect(100 + x, 33 + y, 1, 2);
        g2d.fillRect(102 + x, 33 + y, 1, 10);
        g2d.fillRect(103 + x, 33 + y, 1, 8);
        g2d.fillRect(104 + x, 33 + y, 1, 6);
        g2d.fillRect(117 + x, 35 + y, 1, 20);
        g2d.fillRect(120 + x, 35 + y, 1, 24);
        g2d.fillRect(122 + x, 35 + y, 1, 1);
        g2d.fillRect(97 + x, 36 + y, 1, 11);
        g2d.fillRect(116 + x, 37 + y, 1, 18);
        g2d.fillRect(114 + x, 38 + y, 1, 5);
        g2d.fillRect(101 + x, 39 + y, 1, 3);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(121 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 41 + y, 1, 2);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 9);
        g2d.fillRect(121 + x, 42 + y, 1, 3);
        g2d.fillRect(122 + x, 42 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 2, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 3);
        g2d.fillRect(100 + x, 45 + y, 1, 8);
        g2d.fillRect(102 + x, 49 + y, 1, 9);
        g2d.fillRect(97 + x, 51 + y, 1, 6);
        g2d.fillRect(99 + x, 54 + y, 1, 7);
        g2d.fillRect(101 + x, 54 + y, 1, 7);
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 5);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
    }

    public void paintB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 54 + y, 1, 4);
        g2d.fillRect(122 + x, 55 + y, 1, 5);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(123 + x, 60 + y, 1, 1);
        g2d.fillRect(97 + x, 61 + y, 1, 4);
        g2d.fillRect(115 + x, 64 + y, 1, 6);
        g2d.fillRect(96 + x, 65 + y, 1, 2);
        g2d.fillRect(95 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 4);
        g2d.fillRect(120 + x, 68 + y, 1, 3);
        g2d.fillRect(114 + x, 70 + y, 1, 2);
        g2d.fillRect(121 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 11 + y, 1, 4);
        g2d.fillRect(110 + x, 11 + y, 1, 4);
        g2d.fillRect(109 + x, 11 + y, 1, 4);
        g2d.fillRect(108 + x, 11 + y, 1, 4);
        g2d.fillRect(107 + x, 11 + y, 1, 4);
        g2d.fillRect(106 + x, 11 + y, 1, 7);
        g2d.fillRect(105 + x, 11 + y, 1, 2);
        g2d.fillRect(104 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 11 + y, 1, 4);
        g2d.fillRect(102 + x, 11 + y, 1, 4);
        g2d.fillRect(114 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 4);
        g2d.fillRect(100 + x, 12 + y, 1, 4);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 4);
        g2d.fillRect(98 + x, 13 + y, 1, 4);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 6);
        g2d.fillRect(97 + x, 14 + y, 1, 5);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 5);
        g2d.fillRect(96 + x, 15 + y, 1, 5);
        g2d.fillRect(117 + x, 16 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 5);
        g2d.fillRect(108 + x, 16 + y, 1, 4);
        g2d.fillRect(107 + x, 16 + y, 1, 3);
        g2d.fillRect(103 + x, 16 + y, 1, 3);
        g2d.fillRect(95 + x, 16 + y, 1, 5);
        g2d.fillRect(110 + x, 17 + y, 1, 4);
        g2d.fillRect(101 + x, 17 + y, 2, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 4, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 5);
        g2d.fillRect(115 + x, 19 + y, 1, 3);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(94 + x, 19 + y, 1, 11);
        g2d.fillRect(106 + x, 20 + y, 2, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 2);
        g2d.fillRect(119 + x, 21 + y, 1, 13);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 21 + y, 1, 3);
        g2d.fillRect(93 + x, 21 + y, 1, 3);
        g2d.fillRect(116 + x, 22 + y, 1, 3);
        g2d.fillRect(96 + x, 22 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 4);
        g2d.fillRect(112 + x, 24 + y, 1, 2);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 5);
        g2d.fillRect(113 + x, 25 + y, 1, 5);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(120 + x, 26 + y, 1, 4);
        g2d.fillRect(118 + x, 26 + y, 1, 8);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(114 + x, 28 + y, 1, 6);
        g2d.fillRect(111 + x, 28 + y, 1, 5);
        g2d.fillRect(97 + x, 28 + y, 1, 2);
        g2d.fillRect(96 + x, 29 + y, 1, 7);
        g2d.fillRect(93 + x, 29 + y, 1, 4);
        g2d.fillRect(97 + x, 33 + y, 1, 3);
        g2d.fillRect(95 + x, 34 + y, 1, 2);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 13 + y, 1, 3);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 1, 5);
        g2d.fillRect(114 + x, 14 + y, 1, 4);
        g2d.fillRect(111 + x, 15 + y, 1, 4);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 3, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 6);
        g2d.fillRect(112 + x, 16 + y, 1, 5);
        g2d.fillRect(113 + x, 17 + y, 1, 5);
        g2d.fillRect(102 + x, 18 + y, 1, 3);
        g2d.fillRect(117 + x, 19 + y, 1, 6);
        g2d.fillRect(114 + x, 19 + y, 1, 9);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 4);
        g2d.fillRect(100 + x, 19 + y, 1, 5);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(96 + x, 20 + y, 2, 1);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 4);
        g2d.fillRect(95 + x, 21 + y, 2, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 12);
        g2d.fillRect(98 + x, 22 + y, 1, 4);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 2);
        g2d.fillRect(118 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 24 + y, 1, 4);
        g2d.fillRect(93 + x, 24 + y, 1, 5);
        g2d.fillRect(116 + x, 25 + y, 1, 9);
        g2d.fillRect(111 + x, 25 + y, 1, 3);
        g2d.fillRect(96 + x, 25 + y, 1, 4);
        g2d.fillRect(112 + x, 26 + y, 1, 8);
        g2d.fillRect(95 + x, 27 + y, 1, 7);
        g2d.fillRect(120 + x, 30 + y, 1, 4);
        g2d.fillRect(117 + x, 30 + y, 1, 4);
        g2d.fillRect(113 + x, 30 + y, 1, 4);
        g2d.fillRect(94 + x, 30 + y, 1, 6);
        g2d.fillRect(111 + x, 33 + y, 1, 1);
        g2d.fillRect(93 + x, 33 + y, 1, 3);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 13 + y, 2, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(100 + x, 16 + y, 3, 1);
        g2d.fillRect(98 + x, 17 + y, 3, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
    }

    public void paintBackB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(111 + x, 43 + y, 1, 13);
        g2d.fillRect(94 + x, 51 + y, 1, 7);
        g2d.fillRect(117 + x, 56 + y, 1, 7);
        g2d.fillRect(99 + x, 56 + y, 1, 11);
        g2d.fillRect(115 + x, 57 + y, 1, 18);
        g2d.fillRect(113 + x, 58 + y, 1, 10);
        g2d.fillRect(112 + x, 58 + y, 1, 4);
        g2d.fillRect(95 + x, 59 + y, 1, 2);
        g2d.fillRect(98 + x, 60 + y, 1, 13);
        g2d.fillRect(116 + x, 61 + y, 1, 8);
        g2d.fillRect(114 + x, 61 + y, 1, 8);
        g2d.fillRect(97 + x, 61 + y, 1, 10);
        g2d.fillRect(96 + x, 62 + y, 1, 6);
        g2d.fillRect(114 + x, 70 + y, 1, 2);
        g2d.fillRect(98 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 33 + y, 1, 8);
        g2d.fillRect(118 + x, 33 + y, 1, 3);
        g2d.fillRect(114 + x, 33 + y, 1, 6);
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 35 + y, 1, 8);
        g2d.fillRect(97 + x, 35 + y, 1, 7);
        g2d.fillRect(96 + x, 35 + y, 1, 21);
        g2d.fillRect(94 + x, 35 + y, 1, 5);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(93 + x, 36 + y, 1, 6);
        g2d.fillRect(100 + x, 37 + y, 1, 16);
        g2d.fillRect(111 + x, 39 + y, 1, 2);
        g2d.fillRect(112 + x, 41 + y, 1, 17);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 4);
        g2d.fillRect(113 + x, 43 + y, 1, 6);
        g2d.fillRect(93 + x, 43 + y, 1, 2);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 6);
        g2d.fillRect(118 + x, 47 + y, 1, 4);
        g2d.fillRect(114 + x, 47 + y, 1, 7);
        g2d.fillRect(97 + x, 51 + y, 1, 5);
        g2d.fillRect(115 + x, 53 + y, 2, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(98 + x, 55 + y, 1, 5);
        g2d.fillRect(96 + x, 58 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 33 + y, 1, 2);
        g2d.fillRect(117 + x, 33 + y, 1, 21);
        g2d.fillRect(116 + x, 33 + y, 1, 20);
        g2d.fillRect(115 + x, 33 + y, 1, 2);
        g2d.fillRect(113 + x, 33 + y, 1, 10);
        g2d.fillRect(112 + x, 33 + y, 1, 8);
        g2d.fillRect(111 + x, 33 + y, 1, 6);
        g2d.fillRect(98 + x, 35 + y, 1, 20);
        g2d.fillRect(95 + x, 35 + y, 1, 24);
        g2d.fillRect(93 + x, 35 + y, 1, 1);
        g2d.fillRect(118 + x, 36 + y, 1, 11);
        g2d.fillRect(99 + x, 37 + y, 1, 18);
        g2d.fillRect(101 + x, 38 + y, 1, 5);
        g2d.fillRect(114 + x, 39 + y, 1, 3);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(94 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 2);
        g2d.fillRect(111 + x, 41 + y, 1, 1);
        g2d.fillRect(120 + x, 42 + y, 1, 1);
        g2d.fillRect(97 + x, 42 + y, 1, 9);
        g2d.fillRect(94 + x, 42 + y, 1, 3);
        g2d.fillRect(93 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 2, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 3);
        g2d.fillRect(115 + x, 45 + y, 1, 8);
        g2d.fillRect(113 + x, 49 + y, 1, 9);
        g2d.fillRect(118 + x, 51 + y, 1, 6);
        g2d.fillRect(116 + x, 54 + y, 1, 7);
        g2d.fillRect(114 + x, 54 + y, 1, 7);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(98 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 5);
        g2d.fillRect(96 + x, 56 + y, 1, 2);
    }

    public void paintBackB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 54 + y, 1, 4);
        g2d.fillRect(93 + x, 55 + y, 1, 5);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(92 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 61 + y, 1, 4);
        g2d.fillRect(100 + x, 64 + y, 1, 6);
        g2d.fillRect(119 + x, 65 + y, 1, 2);
        g2d.fillRect(120 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 4);
        g2d.fillRect(95 + x, 68 + y, 1, 3);
        g2d.fillRect(101 + x, 70 + y, 1, 2);
        g2d.fillRect(94 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 1);
    }
}
