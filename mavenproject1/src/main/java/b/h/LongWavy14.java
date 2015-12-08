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
public class LongWavy14 extends clts.SuperHLong {

    public LongWavy14() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongWavy14(int step, int dir) {
        super(step, dir);
    }

    public LongWavy14(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }
    
    
    public void drawFront(int x, int y, GraphicsMap g2d) {
        if(y > 0)
            y = 0;
        super.drawFront(x, y, g2d);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(113 + x, 13 + y, 1, 6);
        g2d.fillRect(111 + x, 14 + y, 1, 3);
        g2d.fillRect(112 + x, 14 + y, 1, 3);
        g2d.fillRect(114 + x, 14 + y, 1, 6);
        g2d.fillRect(115 + x, 15 + y, 1, 5);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 31 + y, 1, 8);
        g2d.fillRect(118 + x, 33 + y, 1, 2);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 3);
        g2d.fillRect(114 + x, 37 + y, 1, 4);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 11 + y, 9, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 3);
        g2d.fillRect(109 + x, 13 + y, 1, 4);
        g2d.fillRect(110 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 13 + y, 2, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 3);
        g2d.fillRect(115 + x, 14 + y, 2, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 7);
        g2d.fillRect(108 + x, 17 + y, 1, 3);
        g2d.fillRect(110 + x, 17 + y, 3, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 17 + y, 1, 6);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 2, 1);
        g2d.fillRect(112 + x, 19 + y, 2, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 3, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 3);
        g2d.fillRect(101 + x, 25 + y, 1, 4);
        g2d.fillRect(102 + x, 25 + y, 1, 2);
        g2d.fillRect(121 + x, 25 + y, 1, 4);
        g2d.fillRect(100 + x, 26 + y, 1, 2);
        g2d.fillRect(119 + x, 26 + y, 1, 4);
        g2d.fillRect(96 + x, 27 + y, 1, 4);
        g2d.fillRect(97 + x, 28 + y, 1, 2);
        g2d.fillRect(103 + x, 32 + y, 1, 4);
        g2d.fillRect(100 + x, 34 + y, 1, 2);
        g2d.fillRect(101 + x, 34 + y, 1, 1);
        g2d.fillRect(95 + x, 35 + y, 2, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 36 + y, 1, 2);
        g2d.fillRect(116 + x, 36 + y, 1, 2);
        g2d.fillRect(117 + x, 36 + y, 1, 3);
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 3);
        g2d.fillRect(115 + x, 39 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 2);
        g2d.fillRect(108 + x, 12 + y, 3, 1);
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 8);
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(116 + x, 13 + y, 2, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 6);
        g2d.fillRect(117 + x, 14 + y, 2, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 10);
        g2d.fillRect(106 + x, 17 + y, 1, 3);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 4);
        g2d.fillRect(121 + x, 20 + y, 1, 5);
        g2d.fillRect(97 + x, 22 + y, 1, 6);
        g2d.fillRect(99 + x, 22 + y, 1, 3);
        g2d.fillRect(100 + x, 22 + y, 1, 3);
        g2d.fillRect(116 + x, 22 + y, 1, 2);
        g2d.fillRect(117 + x, 23 + y, 1, 2);
        g2d.fillRect(118 + x, 23 + y, 1, 4);
        g2d.fillRect(102 + x, 24 + y, 2, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 6);
        g2d.fillRect(103 + x, 25 + y, 1, 4);
        g2d.fillRect(120 + x, 25 + y, 1, 4);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 27 + y, 1, 4);
        g2d.fillRect(101 + x, 29 + y, 1, 4);
        g2d.fillRect(121 + x, 29 + y, 1, 6);
        g2d.fillRect(97 + x, 30 + y, 1, 3);
        g2d.fillRect(119 + x, 30 + y, 1, 4);
        g2d.fillRect(96 + x, 31 + y, 1, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 3);
        g2d.fillRect(95 + x, 32 + y, 1, 3);
        g2d.fillRect(102 + x, 33 + y, 1, 3);
        g2d.fillRect(99 + x, 34 + y, 1, 1);
        g2d.fillRect(98 + x, 35 + y, 1, 2);
        g2d.fillRect(118 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(103 + x, 36 + y, 1, 2);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 2, 1);
        g2d.fillRect(116 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 3);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 2);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 5);
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(100 + x, 21 + y, 2, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 3);
        g2d.fillRect(102 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 3);
        g2d.fillRect(100 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 3);
        g2d.fillRect(120 + x, 29 + y, 1, 4);
        g2d.fillRect(99 + x, 32 + y, 1, 2);
        g2d.fillRect(97 + x, 33 + y, 1, 2);
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(103 + x, 38 + y, 1, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 4);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 4);
        g2d.fillRect(98 + x, 31 + y, 1, 4);
        g2d.fillRect(120 + x, 33 + y, 1, 2);
        g2d.fillRect(101 + x, 35 + y, 1, 3);
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(96 + x, 32 + y, 1, 3);
        g2d.fillRect(97 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 17 + y, 1, 4);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(96 + x, 36 + y, 1, 3);
        g2d.fillRect(98 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 38 + y, 1, 9);
        g2d.fillRect(117 + x, 38 + y, 1, 3);
        g2d.fillRect(95 + x, 39 + y, 1, 2);
        g2d.fillRect(102 + x, 39 + y, 1, 9);
        g2d.fillRect(103 + x, 39 + y, 1, 5);
        g2d.fillRect(104 + x, 39 + y, 1, 2);
        g2d.fillRect(122 + x, 39 + y, 1, 3);
        g2d.fillRect(96 + x, 40 + y, 2, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 2);
        g2d.fillRect(97 + x, 41 + y, 1, 4);
        g2d.fillRect(105 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 3);
        g2d.fillRect(118 + x, 41 + y, 1, 4);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 6);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(120 + x, 43 + y, 1, 7);
        g2d.fillRect(98 + x, 44 + y, 1, 3);
        g2d.fillRect(115 + x, 44 + y, 1, 2);
        g2d.fillRect(117 + x, 44 + y, 1, 3);
        g2d.fillRect(116 + x, 45 + y, 1, 3);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 48 + y, 1, 4);
        g2d.fillRect(97 + x, 49 + y, 1, 14);
        g2d.fillRect(96 + x, 50 + y, 1, 3);
        g2d.fillRect(101 + x, 51 + y, 1, 2);
        g2d.fillRect(116 + x, 51 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 19);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 6);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 5);
        g2d.fillRect(102 + x, 54 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 54 + y, 1, 4);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(121 + x, 56 + y, 1, 4);
        g2d.fillRect(116 + x, 57 + y, 1, 5);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(99 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(98 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 61 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 3);
        g2d.fillRect(116 + x, 63 + y, 1, 3);
        g2d.fillRect(118 + x, 63 + y, 1, 3);
        g2d.fillRect(99 + x, 64 + y, 1, 2);
        g2d.fillRect(98 + x, 65 + y, 1, 2);
        g2d.fillRect(101 + x, 65 + y, 1, 4);
        g2d.fillRect(119 + x, 66 + y, 1, 2);
        g2d.fillRect(118 + x, 67 + y, 1, 2);
        g2d.fillRect(100 + x, 68 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(99 + x, 69 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(122 + x, 30 + y, 1, 4);
        g2d.fillRect(123 + x, 33 + y, 1, 7);
        g2d.fillRect(121 + x, 34 + y, 1, 1);
        g2d.fillRect(118 + x, 36 + y, 1, 2);
        g2d.fillRect(97 + x, 37 + y, 1, 3);
        g2d.fillRect(98 + x, 37 + y, 1, 4);
        g2d.fillRect(120 + x, 37 + y, 1, 3);
        g2d.fillRect(96 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 3);
        g2d.fillRect(101 + x, 39 + y, 1, 2);
        g2d.fillRect(96 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 3);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 6);
        g2d.fillRect(104 + x, 44 + y, 1, 5);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 1, 4);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 8);
        g2d.fillRect(114 + x, 47 + y, 2, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 4);
        g2d.fillRect(115 + x, 48 + y, 1, 4);
        g2d.fillRect(116 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 2, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 4);
        g2d.fillRect(98 + x, 59 + y, 1, 2);
        g2d.fillRect(99 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(99 + x, 66 + y, 1, 3);
        g2d.fillRect(116 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(121 + x, 35 + y, 1, 5);
        g2d.fillRect(119 + x, 36 + y, 1, 4);
        g2d.fillRect(101 + x, 38 + y, 2, 1);
        g2d.fillRect(120 + x, 40 + y, 1, 3);
        g2d.fillRect(95 + x, 41 + y, 1, 3);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(96 + x, 45 + y, 1, 2);
        g2d.fillRect(105 + x, 45 + y, 1, 2);
        g2d.fillRect(121 + x, 45 + y, 1, 1);
        g2d.fillRect(122 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 3, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(99 + x, 62 + y, 1, 2);
        g2d.fillRect(101 + x, 64 + y, 1, 1);
        g2d.fillRect(118 + x, 66 + y, 1, 1);
        g2d.fillRect(102 + x, 68 + y, 1, 4);
        g2d.fillRect(119 + x, 68 + y, 1, 1);
        g2d.fillRect(99 + x, 71 + y, 1, 4);
        g2d.fillRect(103 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 34 + y, 1, 3);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 38 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 3);
        g2d.fillRect(98 + x, 41 + y, 1, 3);
        g2d.fillRect(101 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 41 + y, 1, 3);
        g2d.fillRect(117 + x, 41 + y, 1, 3);
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 2);
        g2d.fillRect(118 + x, 45 + y, 1, 3);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 3, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 3);
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 4);
        g2d.fillRect(99 + x, 53 + y, 1, 6);
        g2d.fillRect(100 + x, 53 + y, 1, 15);
        g2d.fillRect(117 + x, 53 + y, 1, 8);
        g2d.fillRect(118 + x, 57 + y, 1, 6);
        g2d.fillRect(101 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 62 + y, 1, 6);
        g2d.fillRect(101 + x, 63 + y, 1, 1);
        g2d.fillRect(100 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(122 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(98 + x, 63 + y, 1, 2);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 3);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 22 + y, 1, 2);
        g2d.fillRect(110 + x, 23 + y, 1, 2);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(108 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 30 + y, 1, 2);
        g2d.fillRect(103 + x, 31 + y, 1, 2);
        g2d.fillRect(102 + x, 32 + y, 1, 2);
        g2d.fillRect(101 + x, 33 + y, 1, 2);
        g2d.fillRect(100 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 3);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 2);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 4);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 2, 1);
        g2d.fillRect(106 + x, 26 + y, 1, 2);
        g2d.fillRect(108 + x, 26 + y, 1, 1);
        g2d.fillRect(105 + x, 28 + y, 1, 1);
        g2d.fillRect(103 + x, 29 + y, 1, 2);
        g2d.fillRect(104 + x, 29 + y, 1, 1);
        g2d.fillRect(102 + x, 30 + y, 1, 2);
        g2d.fillRect(101 + x, 32 + y, 1, 1);
        g2d.fillRect(100 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 18 + y, 1, 3);
        g2d.fillRect(109 + x, 19 + y, 1, 3);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 2);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 3);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(109 + x, 26 + y, 2, 1);
        g2d.fillRect(105 + x, 27 + y, 1, 1);
        g2d.fillRect(108 + x, 27 + y, 1, 1);
        g2d.fillRect(103 + x, 28 + y, 2, 1);
        g2d.fillRect(106 + x, 28 + y, 1, 1);
        g2d.fillRect(105 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 2);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 2);
        g2d.fillRect(105 + x, 24 + y, 1, 3);
        g2d.fillRect(104 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 23 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 13 + y, 1, 6);
        g2d.fillRect(104 + x, 14 + y, 1, 3);
        g2d.fillRect(103 + x, 14 + y, 1, 3);
        g2d.fillRect(101 + x, 14 + y, 1, 6);
        g2d.fillRect(100 + x, 15 + y, 1, 5);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 31 + y, 1, 8);
        g2d.fillRect(97 + x, 33 + y, 1, 2);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 3);
        g2d.fillRect(101 + x, 37 + y, 1, 4);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 11 + y, 9, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(103 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 3);
        g2d.fillRect(106 + x, 13 + y, 1, 4);
        g2d.fillRect(105 + x, 13 + y, 1, 3);
        g2d.fillRect(100 + x, 13 + y, 2, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 3);
        g2d.fillRect(99 + x, 14 + y, 2, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 7);
        g2d.fillRect(107 + x, 17 + y, 1, 3);
        g2d.fillRect(103 + x, 17 + y, 3, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 17 + y, 1, 6);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(102 + x, 19 + y, 2, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 3, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 3);
        g2d.fillRect(114 + x, 25 + y, 1, 4);
        g2d.fillRect(113 + x, 25 + y, 1, 2);
        g2d.fillRect(94 + x, 25 + y, 1, 4);
        g2d.fillRect(115 + x, 26 + y, 1, 2);
        g2d.fillRect(96 + x, 26 + y, 1, 4);
        g2d.fillRect(119 + x, 27 + y, 1, 4);
        g2d.fillRect(118 + x, 28 + y, 1, 2);
        g2d.fillRect(112 + x, 32 + y, 1, 4);
        g2d.fillRect(115 + x, 34 + y, 1, 2);
        g2d.fillRect(114 + x, 34 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 2, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 36 + y, 1, 2);
        g2d.fillRect(99 + x, 36 + y, 1, 2);
        g2d.fillRect(98 + x, 36 + y, 1, 3);
        g2d.fillRect(116 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 3);
        g2d.fillRect(100 + x, 39 + y, 1, 3);
        g2d.fillRect(101 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 19 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 2);
        g2d.fillRect(105 + x, 12 + y, 3, 1);
        g2d.fillRect(100 + x, 12 + y, 2, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 8);
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(98 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 6);
        g2d.fillRect(97 + x, 14 + y, 2, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(97 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 10);
        g2d.fillRect(109 + x, 17 + y, 1, 3);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 4);
        g2d.fillRect(94 + x, 20 + y, 1, 5);
        g2d.fillRect(118 + x, 22 + y, 1, 6);
        g2d.fillRect(116 + x, 22 + y, 1, 3);
        g2d.fillRect(115 + x, 22 + y, 1, 3);
        g2d.fillRect(99 + x, 22 + y, 1, 2);
        g2d.fillRect(98 + x, 23 + y, 1, 2);
        g2d.fillRect(97 + x, 23 + y, 1, 4);
        g2d.fillRect(112 + x, 24 + y, 2, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 6);
        g2d.fillRect(112 + x, 25 + y, 1, 4);
        g2d.fillRect(95 + x, 25 + y, 1, 4);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 27 + y, 1, 4);
        g2d.fillRect(114 + x, 29 + y, 1, 4);
        g2d.fillRect(94 + x, 29 + y, 1, 6);
        g2d.fillRect(118 + x, 30 + y, 1, 3);
        g2d.fillRect(96 + x, 30 + y, 1, 4);
        g2d.fillRect(119 + x, 31 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 3);
        g2d.fillRect(120 + x, 32 + y, 1, 3);
        g2d.fillRect(113 + x, 33 + y, 1, 3);
        g2d.fillRect(116 + x, 34 + y, 1, 1);
        g2d.fillRect(117 + x, 35 + y, 1, 2);
        g2d.fillRect(97 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(112 + x, 36 + y, 1, 2);
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 2, 1);
        g2d.fillRect(99 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 3);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 5);
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 21 + y, 2, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 3);
        g2d.fillRect(113 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 3);
        g2d.fillRect(115 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 3);
        g2d.fillRect(95 + x, 29 + y, 1, 4);
        g2d.fillRect(116 + x, 32 + y, 1, 2);
        g2d.fillRect(118 + x, 33 + y, 1, 2);
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(112 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 4);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 4);
        g2d.fillRect(117 + x, 31 + y, 1, 4);
        g2d.fillRect(95 + x, 33 + y, 1, 2);
        g2d.fillRect(114 + x, 35 + y, 1, 3);
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(119 + x, 32 + y, 1, 3);
        g2d.fillRect(118 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(113 + x, 17 + y, 1, 4);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(111 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 36 + y, 1, 3);
        g2d.fillRect(117 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 38 + y, 1, 9);
        g2d.fillRect(98 + x, 38 + y, 1, 3);
        g2d.fillRect(120 + x, 39 + y, 1, 2);
        g2d.fillRect(113 + x, 39 + y, 1, 9);
        g2d.fillRect(112 + x, 39 + y, 1, 5);
        g2d.fillRect(111 + x, 39 + y, 1, 2);
        g2d.fillRect(93 + x, 39 + y, 1, 3);
        g2d.fillRect(118 + x, 40 + y, 2, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 2);
        g2d.fillRect(118 + x, 41 + y, 1, 4);
        g2d.fillRect(110 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 3);
        g2d.fillRect(97 + x, 41 + y, 1, 4);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 6);
        g2d.fillRect(101 + x, 43 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 7);
        g2d.fillRect(117 + x, 44 + y, 1, 3);
        g2d.fillRect(100 + x, 44 + y, 1, 2);
        g2d.fillRect(98 + x, 44 + y, 1, 3);
        g2d.fillRect(99 + x, 45 + y, 1, 3);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 49 + y, 1, 14);
        g2d.fillRect(119 + x, 50 + y, 1, 3);
        g2d.fillRect(114 + x, 51 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 3);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 19);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 6);
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 5);
        g2d.fillRect(113 + x, 54 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 4);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 3);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(94 + x, 56 + y, 1, 4);
        g2d.fillRect(99 + x, 57 + y, 1, 5);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(93 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 2);
        g2d.fillRect(98 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 3);
        g2d.fillRect(99 + x, 63 + y, 1, 3);
        g2d.fillRect(97 + x, 63 + y, 1, 3);
        g2d.fillRect(116 + x, 64 + y, 1, 2);
        g2d.fillRect(117 + x, 65 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 4);
        g2d.fillRect(96 + x, 66 + y, 1, 2);
        g2d.fillRect(97 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 68 + y, 1, 3);
        g2d.fillRect(99 + x, 68 + y, 1, 2);
        g2d.fillRect(98 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(93 + x, 30 + y, 1, 4);
        g2d.fillRect(92 + x, 33 + y, 1, 7);
        g2d.fillRect(94 + x, 34 + y, 1, 1);
        g2d.fillRect(97 + x, 36 + y, 1, 2);
        g2d.fillRect(118 + x, 37 + y, 1, 3);
        g2d.fillRect(117 + x, 37 + y, 1, 4);
        g2d.fillRect(95 + x, 37 + y, 1, 3);
        g2d.fillRect(119 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 3);
        g2d.fillRect(114 + x, 39 + y, 1, 2);
        g2d.fillRect(119 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 2);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 3);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 6);
        g2d.fillRect(111 + x, 44 + y, 1, 5);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 4);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 8);
        g2d.fillRect(100 + x, 47 + y, 2, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(113 + x, 48 + y, 1, 4);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(99 + x, 48 + y, 1, 3);
        g2d.fillRect(97 + x, 48 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 2, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(113 + x, 57 + y, 1, 2);
        g2d.fillRect(96 + x, 57 + y, 1, 4);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(99 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 3);
        g2d.fillRect(99 + x, 66 + y, 1, 2);
        g2d.fillRect(99 + x, 70 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 35 + y, 1, 5);
        g2d.fillRect(96 + x, 36 + y, 1, 4);
        g2d.fillRect(113 + x, 38 + y, 2, 1);
        g2d.fillRect(95 + x, 40 + y, 1, 3);
        g2d.fillRect(120 + x, 41 + y, 1, 3);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 3);
        g2d.fillRect(119 + x, 45 + y, 1, 2);
        g2d.fillRect(110 + x, 45 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 2);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 3, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 2);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(97 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 4);
        g2d.fillRect(96 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 4);
        g2d.fillRect(112 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(95 + x, 34 + y, 1, 3);
        g2d.fillRect(115 + x, 38 + y, 1, 1);
        g2d.fillRect(112 + x, 38 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 3);
        g2d.fillRect(117 + x, 41 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 41 + y, 1, 3);
        g2d.fillRect(98 + x, 41 + y, 1, 3);
        g2d.fillRect(115 + x, 42 + y, 1, 3);
        g2d.fillRect(100 + x, 42 + y, 1, 2);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(97 + x, 45 + y, 1, 3);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 3, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 3);
        g2d.fillRect(115 + x, 48 + y, 2, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 3);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 4);
        g2d.fillRect(116 + x, 53 + y, 1, 6);
        g2d.fillRect(115 + x, 53 + y, 1, 15);
        g2d.fillRect(98 + x, 53 + y, 1, 8);
        g2d.fillRect(97 + x, 57 + y, 1, 6);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(98 + x, 62 + y, 1, 6);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(93 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(117 + x, 63 + y, 1, 2);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 3);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 22 + y, 1, 2);
        g2d.fillRect(105 + x, 23 + y, 1, 2);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(107 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 30 + y, 1, 2);
        g2d.fillRect(112 + x, 31 + y, 1, 2);
        g2d.fillRect(113 + x, 32 + y, 1, 2);
        g2d.fillRect(114 + x, 33 + y, 1, 2);
        g2d.fillRect(115 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 3);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 2);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 2);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 4);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 2, 1);
        g2d.fillRect(109 + x, 26 + y, 1, 2);
        g2d.fillRect(107 + x, 26 + y, 1, 1);
        g2d.fillRect(110 + x, 28 + y, 1, 1);
        g2d.fillRect(112 + x, 29 + y, 1, 2);
        g2d.fillRect(111 + x, 29 + y, 1, 1);
        g2d.fillRect(113 + x, 30 + y, 1, 2);
        g2d.fillRect(114 + x, 32 + y, 1, 1);
        g2d.fillRect(115 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 18 + y, 1, 3);
        g2d.fillRect(106 + x, 19 + y, 1, 3);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 2);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 3);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 2, 1);
        g2d.fillRect(110 + x, 27 + y, 1, 1);
        g2d.fillRect(107 + x, 27 + y, 1, 1);
        g2d.fillRect(111 + x, 28 + y, 2, 1);
        g2d.fillRect(109 + x, 28 + y, 1, 1);
        g2d.fillRect(110 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 2);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(110 + x, 24 + y, 1, 3);
        g2d.fillRect(111 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 23 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(156, 123, 82));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(206, 156, 82));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 189, 82));
        COLORS.set(ImageUtilities.GREY, new Color(255, 222, 173));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 173));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 255, 254));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
