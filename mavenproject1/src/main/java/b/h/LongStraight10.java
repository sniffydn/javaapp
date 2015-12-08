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
public class LongStraight10 extends SuperHLong
{
    public LongStraight10()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight10(int step, int dir)
    {
        super(step, dir);
    }

    public LongStraight10(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 13 + y, 3, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 4);
        g2d.fillRect(117 + x, 14 + y, 1, 4);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 4);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(121 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 1, 3);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 2);
        g2d.fillRect(106 + x, 23 + y, 1, 2);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 9);
        g2d.fillRect(105 + x, 33 + y, 1, 7);
        g2d.fillRect(117 + x, 34 + y, 1, 1);
        g2d.fillRect(104 + x, 35 + y, 1, 3);
        g2d.fillRect(116 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 10 + y, 1, 4);
        g2d.fillRect(106 + x, 10 + y, 1, 4);
        g2d.fillRect(107 + x, 10 + y, 1, 3);
        g2d.fillRect(108 + x, 10 + y, 1, 2);
        g2d.fillRect(109 + x, 10 + y, 1, 2);
        g2d.fillRect(110 + x, 10 + y, 4, 1);
        g2d.fillRect(103 + x, 11 + y, 1, 3);
        g2d.fillRect(104 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 11 + y, 1, 3);
        g2d.fillRect(113 + x, 11 + y, 1, 6);
        g2d.fillRect(114 + x, 11 + y, 1, 2);
        g2d.fillRect(115 + x, 11 + y, 1, 2);
        g2d.fillRect(101 + x, 12 + y, 2, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 3);
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(116 + x, 12 + y, 2, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 1, 4);
        g2d.fillRect(109 + x, 13 + y, 1, 3);
        g2d.fillRect(117 + x, 13 + y, 2, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 15 + y, 1, 3);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 4);
        g2d.fillRect(112 + x, 15 + y, 1, 3);
        g2d.fillRect(119 + x, 15 + y, 2, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(120 + x, 16 + y, 1, 4);
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 17 + y, 1, 5);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 5);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(113 + x, 18 + y, 1, 3);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 15);
        g2d.fillRect(100 + x, 19 + y, 1, 3);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 3);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(121 + x, 19 + y, 1, 7);
        g2d.fillRect(102 + x, 20 + y, 1, 3);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 2, 1);
        g2d.fillRect(123 + x, 20 + y, 1, 15);
        g2d.fillRect(99 + x, 21 + y, 1, 3);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(120 + x, 21 + y, 1, 3);
        g2d.fillRect(96 + x, 22 + y, 1, 9);
        g2d.fillRect(101 + x, 22 + y, 1, 3);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 2);
        g2d.fillRect(99 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 2);
        g2d.fillRect(120 + x, 27 + y, 1, 2);
        g2d.fillRect(97 + x, 28 + y, 1, 3);
        g2d.fillRect(98 + x, 28 + y, 1, 1);
        g2d.fillRect(121 + x, 28 + y, 1, 3);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(122 + x, 34 + y, 1, 1);
        g2d.fillRect(117 + x, 35 + y, 2, 1);
        g2d.fillRect(118 + x, 36 + y, 1, 2);
        g2d.fillRect(119 + x, 36 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 2, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 2, 1);
        g2d.fillRect(111 + x, 14 + y, 2, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 3);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 3);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 9);
        g2d.fillRect(104 + x, 19 + y, 3, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 3);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 5);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 2);
        g2d.fillRect(103 + x, 24 + y, 1, 5);
        g2d.fillRect(101 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 5);
        g2d.fillRect(120 + x, 26 + y, 2, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);
        g2d.fillRect(117 + x, 27 + y, 1, 1);
        g2d.fillRect(121 + x, 27 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 2);
        g2d.fillRect(99 + x, 29 + y, 1, 2);
        g2d.fillRect(119 + x, 29 + y, 1, 1);
        g2d.fillRect(121 + x, 32 + y, 1, 1);
        g2d.fillRect(122 + x, 33 + y, 1, 1);
        g2d.fillRect(117 + x, 37 + y, 1, 1);
        g2d.fillRect(120 + x, 37 + y, 2, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 5);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 3);
        g2d.fillRect(113 + x, 21 + y, 1, 3);
        g2d.fillRect(118 + x, 21 + y, 1, 3);
        g2d.fillRect(100 + x, 22 + y, 1, 4);
        g2d.fillRect(103 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 1, 2);
        g2d.fillRect(114 + x, 22 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 6);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 5);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(102 + x, 24 + y, 1, 2);
        g2d.fillRect(117 + x, 24 + y, 1, 3);
        g2d.fillRect(120 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 25 + y, 1, 3);
        g2d.fillRect(101 + x, 26 + y, 1, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 4);
        g2d.fillRect(119 + x, 27 + y, 1, 2);
        g2d.fillRect(99 + x, 28 + y, 1, 1);
        g2d.fillRect(101 + x, 29 + y, 1, 2);
        g2d.fillRect(103 + x, 29 + y, 1, 10);
        g2d.fillRect(120 + x, 29 + y, 1, 3);
        g2d.fillRect(119 + x, 30 + y, 1, 1);
        g2d.fillRect(121 + x, 31 + y, 1, 1);
        g2d.fillRect(118 + x, 33 + y, 1, 2);
        g2d.fillRect(104 + x, 34 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(120 + x, 34 + y, 1, 3);
        g2d.fillRect(117 + x, 36 + y, 1, 1);
        g2d.fillRect(121 + x, 36 + y, 2, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 2);
        g2d.fillRect(122 + x, 37 + y, 1, 1);
        g2d.fillRect(104 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(123 + x, 38 + y, 1, 1);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 37 + y, 1, 16);
        g2d.fillRect(117 + x, 37 + y, 1, 8);
        g2d.fillRect(105 + x, 39 + y, 1, 2);
        g2d.fillRect(98 + x, 40 + y, 1, 7);
        g2d.fillRect(112 + x, 40 + y, 2, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(123 + x, 41 + y, 1, 8);
        g2d.fillRect(104 + x, 43 + y, 1, 16);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 3);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 47 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(124 + x, 49 + y, 1, 6);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 3);
        g2d.fillRect(95 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 9);
        g2d.fillRect(122 + x, 53 + y, 1, 1);
        g2d.fillRect(125 + x, 53 + y, 1, 2);
        g2d.fillRect(97 + x, 54 + y, 1, 2);
        g2d.fillRect(123 + x, 54 + y, 1, 3);
        g2d.fillRect(98 + x, 55 + y, 2, 1);
        g2d.fillRect(126 + x, 55 + y, 1, 1);
        g2d.fillRect(96 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(124 + x, 57 + y, 1, 4);
        g2d.fillRect(99 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(125 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 2);
        g2d.fillRect(119 + x, 60 + y, 1, 5);
        g2d.fillRect(120 + x, 60 + y, 1, 1);
        g2d.fillRect(126 + x, 60 + y, 1, 1);
        g2d.fillRect(97 + x, 61 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 5);
        g2d.fillRect(118 + x, 61 + y, 1, 4);
        g2d.fillRect(121 + x, 61 + y, 1, 2);
        g2d.fillRect(125 + x, 61 + y, 1, 3);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(122 + x, 62 + y, 1, 2);
        g2d.fillRect(123 + x, 62 + y, 1, 3);
        g2d.fillRect(124 + x, 62 + y, 1, 1);
        g2d.fillRect(126 + x, 62 + y, 1, 3);
        g2d.fillRect(101 + x, 63 + y, 1, 1);
        g2d.fillRect(98 + x, 64 + y, 1, 1);
        g2d.fillRect(127 + x, 64 + y, 1, 1);
        g2d.fillRect(100 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 65 + y, 1, 1);
        g2d.fillRect(124 + x, 65 + y, 1, 2);
        g2d.fillRect(98 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 30 + y, 1, 4);
        g2d.fillRect(97 + x, 30 + y, 1, 6);
        g2d.fillRect(98 + x, 35 + y, 1, 5);
        g2d.fillRect(119 + x, 37 + y, 1, 3);
        g2d.fillRect(122 + x, 38 + y, 1, 2);
        g2d.fillRect(100 + x, 39 + y, 1, 2);
        g2d.fillRect(102 + x, 39 + y, 1, 3);
        g2d.fillRect(115 + x, 39 + y, 1, 1);
        g2d.fillRect(120 + x, 39 + y, 1, 3);
        g2d.fillRect(123 + x, 39 + y, 1, 2);
        g2d.fillRect(99 + x, 40 + y, 1, 8);
        g2d.fillRect(118 + x, 40 + y, 1, 4);
        g2d.fillRect(101 + x, 41 + y, 1, 3);
        g2d.fillRect(104 + x, 41 + y, 1, 2);
        g2d.fillRect(121 + x, 41 + y, 1, 3);
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(103 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 4);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(122 + x, 44 + y, 1, 9);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(103 + x, 45 + y, 1, 6);
        g2d.fillRect(117 + x, 45 + y, 1, 8);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(102 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 4);
        g2d.fillRect(120 + x, 47 + y, 1, 10);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 4);
        g2d.fillRect(97 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(123 + x, 49 + y, 1, 5);
        g2d.fillRect(100 + x, 50 + y, 1, 6);
        g2d.fillRect(102 + x, 50 + y, 1, 4);
        g2d.fillRect(121 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 8);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(122 + x, 54 + y, 1, 4);
        g2d.fillRect(103 + x, 55 + y, 1, 4);
        g2d.fillRect(121 + x, 56 + y, 1, 5);
        g2d.fillRect(102 + x, 57 + y, 1, 5);
        g2d.fillRect(123 + x, 57 + y, 1, 5);
        g2d.fillRect(101 + x, 58 + y, 1, 3);
        g2d.fillRect(119 + x, 59 + y, 2, 1);
        g2d.fillRect(99 + x, 60 + y, 2, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 2);
        g2d.fillRect(100 + x, 61 + y, 1, 1);
        g2d.fillRect(124 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 1, 1);
        g2d.fillRect(100 + x, 63 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 30 + y, 1, 5);
        g2d.fillRect(99 + x, 30 + y, 1, 10);
        g2d.fillRect(102 + x, 30 + y, 1, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 8);
        g2d.fillRect(102 + x, 32 + y, 1, 1);
        g2d.fillRect(101 + x, 36 + y, 1, 5);
        g2d.fillRect(102 + x, 37 + y, 1, 2);
        g2d.fillRect(118 + x, 37 + y, 1, 3);
        g2d.fillRect(120 + x, 37 + y, 1, 2);
        g2d.fillRect(121 + x, 37 + y, 1, 4);
        g2d.fillRect(122 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 4);
        g2d.fillRect(115 + x, 38 + y, 1, 1);
        g2d.fillRect(123 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 3);
        g2d.fillRect(104 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 3);
        g2d.fillRect(122 + x, 40 + y, 1, 4);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 2);
        g2d.fillRect(120 + x, 42 + y, 1, 5);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 1, 6);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 7);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(122 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 61 + y, 1, 1);
        g2d.fillRect(100 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 30 + y, 2, 1);
        g2d.fillRect(101 + x, 31 + y, 1, 5);
        g2d.fillRect(102 + x, 31 + y, 1, 1);
        g2d.fillRect(102 + x, 33 + y, 1, 4);
        g2d.fillRect(121 + x, 36 + y, 1, 1);
        g2d.fillRect(104 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 2);
        g2d.fillRect(105 + x, 41 + y, 1, 4);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 3);
        g2d.fillRect(102 + x, 54 + y, 1, 2);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 23 + y, 1, 3);
        g2d.fillRect(112 + x, 25 + y, 1, 2);
        g2d.fillRect(113 + x, 26 + y, 1, 2);
        g2d.fillRect(114 + x, 27 + y, 1, 2);
        g2d.fillRect(115 + x, 28 + y, 1, 2);
        g2d.fillRect(116 + x, 30 + y, 1, 2);
        g2d.fillRect(117 + x, 31 + y, 1, 2);
        g2d.fillRect(118 + x, 32 + y, 1, 2);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(121 + x, 36 + y, 2, 1);
        g2d.fillRect(122 + x, 37 + y, 2, 1);
        g2d.fillRect(123 + x, 38 + y, 2, 1);
        g2d.fillRect(124 + x, 39 + y, 1, 2);
        g2d.fillRect(125 + x, 39 + y, 1, 2);
        g2d.fillRect(126 + x, 39 + y, 1, 2);
        g2d.fillRect(127 + x, 40 + y, 1, 2);
        g2d.fillRect(128 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 31 + y, 1, 1);
        g2d.fillRect(120 + x, 32 + y, 1, 3);
        g2d.fillRect(121 + x, 33 + y, 1, 3);
        g2d.fillRect(122 + x, 34 + y, 1, 2);
        g2d.fillRect(123 + x, 34 + y, 1, 3);
        g2d.fillRect(124 + x, 35 + y, 1, 3);
        g2d.fillRect(125 + x, 37 + y, 1, 2);
        g2d.fillRect(126 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 27 + y, 1, 3);
        g2d.fillRect(116 + x, 29 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 1);
        g2d.fillRect(120 + x, 31 + y, 1, 1);
        g2d.fillRect(125 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 23 + y, 1, 2);
        g2d.fillRect(113 + x, 23 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 4);
        g2d.fillRect(115 + x, 27 + y, 3, 1);
        g2d.fillRect(116 + x, 28 + y, 2, 1);
        g2d.fillRect(117 + x, 29 + y, 1, 2);
        g2d.fillRect(118 + x, 30 + y, 1, 2);
        g2d.fillRect(119 + x, 32 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 13 + y, 3, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 4);
        g2d.fillRect(98 + x, 14 + y, 1, 4);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 4);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(94 + x, 16 + y, 1, 3);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 1, 3);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 9);
        g2d.fillRect(110 + x, 33 + y, 1, 7);
        g2d.fillRect(98 + x, 34 + y, 1, 1);
        g2d.fillRect(111 + x, 35 + y, 1, 3);
        g2d.fillRect(99 + x, 35 + y, 1, 3);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 10 + y, 1, 4);
        g2d.fillRect(109 + x, 10 + y, 1, 4);
        g2d.fillRect(108 + x, 10 + y, 1, 3);
        g2d.fillRect(107 + x, 10 + y, 1, 2);
        g2d.fillRect(106 + x, 10 + y, 1, 2);
        g2d.fillRect(102 + x, 10 + y, 4, 1);
        g2d.fillRect(112 + x, 11 + y, 1, 3);
        g2d.fillRect(111 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 11 + y, 1, 3);
        g2d.fillRect(102 + x, 11 + y, 1, 6);
        g2d.fillRect(101 + x, 11 + y, 1, 2);
        g2d.fillRect(100 + x, 11 + y, 1, 2);
        g2d.fillRect(113 + x, 12 + y, 2, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 3);
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(98 + x, 12 + y, 2, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 1, 4);
        g2d.fillRect(106 + x, 13 + y, 1, 3);
        g2d.fillRect(97 + x, 13 + y, 2, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 15 + y, 1, 3);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 4);
        g2d.fillRect(103 + x, 15 + y, 1, 3);
        g2d.fillRect(95 + x, 15 + y, 2, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(95 + x, 16 + y, 1, 4);
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 17 + y, 1, 5);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 5);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(102 + x, 18 + y, 1, 3);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 15);
        g2d.fillRect(115 + x, 19 + y, 1, 3);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 3);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(94 + x, 19 + y, 1, 7);
        g2d.fillRect(113 + x, 20 + y, 1, 3);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 2, 1);
        g2d.fillRect(92 + x, 20 + y, 1, 15);
        g2d.fillRect(116 + x, 21 + y, 1, 3);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(95 + x, 21 + y, 1, 3);
        g2d.fillRect(119 + x, 22 + y, 1, 9);
        g2d.fillRect(114 + x, 22 + y, 1, 3);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 1, 2);
        g2d.fillRect(116 + x, 26 + y, 1, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 2);
        g2d.fillRect(95 + x, 27 + y, 1, 2);
        g2d.fillRect(118 + x, 28 + y, 1, 3);
        g2d.fillRect(117 + x, 28 + y, 1, 1);
        g2d.fillRect(94 + x, 28 + y, 1, 3);
        g2d.fillRect(94 + x, 33 + y, 1, 1);
        g2d.fillRect(93 + x, 34 + y, 1, 1);
        g2d.fillRect(97 + x, 35 + y, 2, 1);
        g2d.fillRect(97 + x, 36 + y, 1, 2);
        g2d.fillRect(96 + x, 36 + y, 1, 2);
        g2d.fillRect(112 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(106 + x, 12 + y, 2, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 2, 1);
        g2d.fillRect(103 + x, 14 + y, 2, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 3);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 3);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 9);
        g2d.fillRect(109 + x, 19 + y, 3, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 3);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 5);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 2);
        g2d.fillRect(112 + x, 24 + y, 1, 5);
        g2d.fillRect(114 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 1, 5);
        g2d.fillRect(94 + x, 26 + y, 2, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 1, 1);
        g2d.fillRect(94 + x, 27 + y, 1, 1);
        g2d.fillRect(117 + x, 29 + y, 1, 2);
        g2d.fillRect(116 + x, 29 + y, 1, 2);
        g2d.fillRect(96 + x, 29 + y, 1, 1);
        g2d.fillRect(94 + x, 32 + y, 1, 1);
        g2d.fillRect(93 + x, 33 + y, 1, 1);
        g2d.fillRect(98 + x, 37 + y, 1, 1);
        g2d.fillRect(94 + x, 37 + y, 2, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 1, 5);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 3);
        g2d.fillRect(102 + x, 21 + y, 1, 3);
        g2d.fillRect(97 + x, 21 + y, 1, 3);
        g2d.fillRect(115 + x, 22 + y, 1, 4);
        g2d.fillRect(112 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 22 + y, 1, 2);
        g2d.fillRect(101 + x, 22 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 6);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 5);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(113 + x, 24 + y, 1, 2);
        g2d.fillRect(98 + x, 24 + y, 1, 3);
        g2d.fillRect(95 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 25 + y, 1, 3);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 4);
        g2d.fillRect(96 + x, 27 + y, 1, 2);
        g2d.fillRect(116 + x, 28 + y, 1, 1);
        g2d.fillRect(114 + x, 29 + y, 1, 2);
        g2d.fillRect(112 + x, 29 + y, 1, 10);
        g2d.fillRect(95 + x, 29 + y, 1, 3);
        g2d.fillRect(96 + x, 30 + y, 1, 1);
        g2d.fillRect(94 + x, 31 + y, 1, 1);
        g2d.fillRect(97 + x, 33 + y, 1, 2);
        g2d.fillRect(111 + x, 34 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(95 + x, 34 + y, 1, 3);
        g2d.fillRect(98 + x, 36 + y, 1, 1);
        g2d.fillRect(93 + x, 36 + y, 2, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 2);
        g2d.fillRect(93 + x, 37 + y, 1, 1);
        g2d.fillRect(111 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(92 + x, 38 + y, 1, 1);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 16);
        g2d.fillRect(98 + x, 37 + y, 1, 8);
        g2d.fillRect(110 + x, 39 + y, 1, 2);
        g2d.fillRect(117 + x, 40 + y, 1, 7);
        g2d.fillRect(102 + x, 40 + y, 2, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(92 + x, 41 + y, 1, 8);
        g2d.fillRect(111 + x, 43 + y, 1, 16);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 3);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(91 + x, 49 + y, 1, 6);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 9);
        g2d.fillRect(93 + x, 53 + y, 1, 1);
        g2d.fillRect(90 + x, 53 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(92 + x, 54 + y, 1, 3);
        g2d.fillRect(116 + x, 55 + y, 2, 1);
        g2d.fillRect(89 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(91 + x, 57 + y, 1, 4);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(90 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(96 + x, 60 + y, 1, 5);
        g2d.fillRect(95 + x, 60 + y, 1, 1);
        g2d.fillRect(89 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 5);
        g2d.fillRect(97 + x, 61 + y, 1, 4);
        g2d.fillRect(94 + x, 61 + y, 1, 2);
        g2d.fillRect(90 + x, 61 + y, 1, 3);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(93 + x, 62 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 62 + y, 1, 1);
        g2d.fillRect(89 + x, 62 + y, 1, 3);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(117 + x, 64 + y, 1, 1);
        g2d.fillRect(88 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(95 + x, 65 + y, 1, 1);
        g2d.fillRect(91 + x, 65 + y, 1, 2);
        g2d.fillRect(117 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 30 + y, 1, 4);
        g2d.fillRect(118 + x, 30 + y, 1, 6);
        g2d.fillRect(117 + x, 35 + y, 1, 5);
        g2d.fillRect(96 + x, 37 + y, 1, 3);
        g2d.fillRect(93 + x, 38 + y, 1, 2);
        g2d.fillRect(115 + x, 39 + y, 1, 2);
        g2d.fillRect(113 + x, 39 + y, 1, 3);
        g2d.fillRect(100 + x, 39 + y, 1, 1);
        g2d.fillRect(95 + x, 39 + y, 1, 3);
        g2d.fillRect(92 + x, 39 + y, 1, 2);
        g2d.fillRect(116 + x, 40 + y, 1, 8);
        g2d.fillRect(97 + x, 40 + y, 1, 4);
        g2d.fillRect(114 + x, 41 + y, 1, 3);
        g2d.fillRect(111 + x, 41 + y, 1, 2);
        g2d.fillRect(94 + x, 41 + y, 1, 3);
        g2d.fillRect(115 + x, 42 + y, 1, 3);
        g2d.fillRect(112 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 4);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 44 + y, 1, 9);
        g2d.fillRect(114 + x, 45 + y, 1, 3);
        g2d.fillRect(112 + x, 45 + y, 1, 6);
        g2d.fillRect(98 + x, 45 + y, 1, 8);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(97 + x, 47 + y, 1, 4);
        g2d.fillRect(95 + x, 47 + y, 1, 10);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(92 + x, 49 + y, 1, 5);
        g2d.fillRect(115 + x, 50 + y, 1, 6);
        g2d.fillRect(113 + x, 50 + y, 1, 4);
        g2d.fillRect(94 + x, 50 + y, 1, 2);
        g2d.fillRect(116 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(97 + x, 53 + y, 1, 8);
        g2d.fillRect(94 + x, 53 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 54 + y, 1, 4);
        g2d.fillRect(112 + x, 55 + y, 1, 4);
        g2d.fillRect(94 + x, 56 + y, 1, 5);
        g2d.fillRect(113 + x, 57 + y, 1, 5);
        g2d.fillRect(92 + x, 57 + y, 1, 5);
        g2d.fillRect(114 + x, 58 + y, 1, 3);
        g2d.fillRect(95 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(93 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(91 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 30 + y, 1, 5);
        g2d.fillRect(116 + x, 30 + y, 1, 10);
        g2d.fillRect(113 + x, 30 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 8);
        g2d.fillRect(113 + x, 32 + y, 1, 1);
        g2d.fillRect(114 + x, 36 + y, 1, 5);
        g2d.fillRect(113 + x, 37 + y, 1, 2);
        g2d.fillRect(97 + x, 37 + y, 1, 3);
        g2d.fillRect(95 + x, 37 + y, 1, 2);
        g2d.fillRect(94 + x, 37 + y, 1, 4);
        g2d.fillRect(93 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 4);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(92 + x, 38 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 3);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 3);
        g2d.fillRect(93 + x, 40 + y, 1, 4);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 2);
        g2d.fillRect(95 + x, 42 + y, 1, 5);
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 6);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 3);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(96 + x, 52 + y, 1, 7);
        g2d.fillRect(94 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(95 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(93 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 30 + y, 2, 1);
        g2d.fillRect(114 + x, 31 + y, 1, 5);
        g2d.fillRect(113 + x, 31 + y, 1, 1);
        g2d.fillRect(113 + x, 33 + y, 1, 4);
        g2d.fillRect(94 + x, 36 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 2);
        g2d.fillRect(110 + x, 41 + y, 1, 4);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 3);
        g2d.fillRect(113 + x, 54 + y, 1, 2);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 23 + y, 1, 3);
        g2d.fillRect(103 + x, 25 + y, 1, 2);
        g2d.fillRect(102 + x, 26 + y, 1, 2);
        g2d.fillRect(101 + x, 27 + y, 1, 2);
        g2d.fillRect(100 + x, 28 + y, 1, 2);
        g2d.fillRect(99 + x, 30 + y, 1, 2);
        g2d.fillRect(98 + x, 31 + y, 1, 2);
        g2d.fillRect(97 + x, 32 + y, 1, 2);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(93 + x, 36 + y, 2, 1);
        g2d.fillRect(92 + x, 37 + y, 2, 1);
        g2d.fillRect(91 + x, 38 + y, 2, 1);
        g2d.fillRect(91 + x, 39 + y, 1, 2);
        g2d.fillRect(90 + x, 39 + y, 1, 2);
        g2d.fillRect(89 + x, 39 + y, 1, 2);
        g2d.fillRect(88 + x, 40 + y, 1, 2);
        g2d.fillRect(87 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 31 + y, 1, 1);
        g2d.fillRect(95 + x, 32 + y, 1, 3);
        g2d.fillRect(94 + x, 33 + y, 1, 3);
        g2d.fillRect(93 + x, 34 + y, 1, 2);
        g2d.fillRect(92 + x, 34 + y, 1, 3);
        g2d.fillRect(91 + x, 35 + y, 1, 3);
        g2d.fillRect(90 + x, 37 + y, 1, 2);
        g2d.fillRect(89 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 27 + y, 1, 3);
        g2d.fillRect(99 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 1);
        g2d.fillRect(95 + x, 31 + y, 1, 1);
        g2d.fillRect(90 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 23 + y, 1, 2);
        g2d.fillRect(102 + x, 23 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 4);
        g2d.fillRect(98 + x, 27 + y, 3, 1);
        g2d.fillRect(98 + x, 28 + y, 2, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 2);
        g2d.fillRect(97 + x, 30 + y, 1, 2);
        g2d.fillRect(96 + x, 32 + y, 1, 1);
    }

}
