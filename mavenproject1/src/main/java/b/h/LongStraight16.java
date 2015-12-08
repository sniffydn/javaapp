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
public class LongStraight16 extends SuperHLong
{

    public LongStraight16()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight16(int step, int dir)
    {
        super(step, dir);
    }

    public LongStraight16(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }


    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 12 + y, 1, 3);
        g2d.fillRect(105 + x, 13 + y, 2, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 10);
        g2d.fillRect(118 + x, 32 + y, 1, 2);
        g2d.fillRect(105 + x, 34 + y, 1, 3);
        g2d.fillRect(117 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 4);
        g2d.fillRect(114 + x, 37 + y, 1, 3);
        g2d.fillRect(113 + x, 38 + y, 1, 3);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 31 + y, 1, 2);
        g2d.fillRect(104 + x, 34 + y, 1, 3);
        g2d.fillRect(117 + x, 35 + y, 1, 3);
        g2d.fillRect(116 + x, 37 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 11 + y, 10, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 4);
        g2d.fillRect(103 + x, 12 + y, 1, 3);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(115 + x, 12 + y, 2, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(116 + x, 13 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 2);
        g2d.fillRect(108 + x, 15 + y, 1, 3);
        g2d.fillRect(109 + x, 15 + y, 1, 3);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 3, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 3);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(119 + x, 18 + y, 1, 3);
        g2d.fillRect(95 + x, 19 + y, 1, 3);
        g2d.fillRect(106 + x, 19 + y, 1, 5);
        g2d.fillRect(107 + x, 19 + y, 1, 3);
        g2d.fillRect(120 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 3);
        g2d.fillRect(121 + x, 22 + y, 1, 2);
        g2d.fillRect(113 + x, 23 + y, 1, 2);
        g2d.fillRect(114 + x, 25 + y, 2, 1);
        g2d.fillRect(122 + x, 26 + y, 1, 10);
        g2d.fillRect(103 + x, 28 + y, 1, 3);
        g2d.fillRect(119 + x, 30 + y, 1, 3);
        g2d.fillRect(102 + x, 33 + y, 1, 4);
        g2d.fillRect(118 + x, 34 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 12 + y, 4, 1);
        g2d.fillRect(114 + x, 13 + y, 2, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 3, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 3);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 5);
        g2d.fillRect(115 + x, 17 + y, 2, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 6);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 2, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 2, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(122 + x, 21 + y, 1, 4);
        g2d.fillRect(95 + x, 22 + y, 1, 8);
        g2d.fillRect(100 + x, 22 + y, 2, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 3);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 24 + y, 1, 4);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 2);
        g2d.fillRect(117 + x, 25 + y, 1, 2);
        g2d.fillRect(119 + x, 26 + y, 1, 4);
        g2d.fillRect(120 + x, 29 + y, 1, 3);
        g2d.fillRect(97 + x, 30 + y, 1, 1);
        g2d.fillRect(96 + x, 32 + y, 1, 3);
        g2d.fillRect(103 + x, 33 + y, 1, 4);
        g2d.fillRect(119 + x, 33 + y, 1, 4);
        g2d.fillRect(98 + x, 34 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 3);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 2, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 3);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 10);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 2, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 11);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 6);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 14);
        g2d.fillRect(116 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 3);
        g2d.fillRect(103 + x, 24 + y, 1, 4);
        g2d.fillRect(100 + x, 25 + y, 1, 12);
        g2d.fillRect(120 + x, 25 + y, 1, 4);
        g2d.fillRect(122 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 8);
        g2d.fillRect(121 + x, 28 + y, 1, 3);
        g2d.fillRect(98 + x, 29 + y, 1, 1);
        g2d.fillRect(97 + x, 31 + y, 1, 6);
        g2d.fillRect(102 + x, 32 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(114 + x, 14 + y, 2, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 2, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 2, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 4);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 2, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 6);
        g2d.fillRect(103 + x, 19 + y, 1, 5);
        g2d.fillRect(108 + x, 19 + y, 1, 3);
        g2d.fillRect(114 + x, 19 + y, 2, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 3);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 22 + y, 1, 7);
        g2d.fillRect(110 + x, 22 + y, 1, 2);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 9);
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 30 + y, 1, 4);
        g2d.fillRect(121 + x, 31 + y, 1, 2);
        g2d.fillRect(120 + x, 32 + y, 1, 4);
        g2d.fillRect(99 + x, 34 + y, 1, 3);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 36 + y, 1, 11);
        g2d.fillRect(115 + x, 38 + y, 1, 7);
        g2d.fillRect(114 + x, 39 + y, 1, 3);
        g2d.fillRect(113 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 36 + y, 1, 12);
        g2d.fillRect(117 + x, 37 + y, 1, 2);
        g2d.fillRect(116 + x, 38 + y, 1, 9);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(122 + x, 35 + y, 1, 2);
        g2d.fillRect(102 + x, 36 + y, 1, 27);
        g2d.fillRect(103 + x, 36 + y, 1, 22);
        g2d.fillRect(118 + x, 36 + y, 1, 4);
        g2d.fillRect(117 + x, 39 + y, 1, 30);
        g2d.fillRect(121 + x, 39 + y, 1, 8);
        g2d.fillRect(104 + x, 50 + y, 1, 4);
        g2d.fillRect(119 + x, 53 + y, 1, 27);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 36 + y, 1, 2);
        g2d.fillRect(119 + x, 36 + y, 1, 8);
        g2d.fillRect(98 + x, 40 + y, 1, 6);
        g2d.fillRect(118 + x, 40 + y, 1, 7);
        g2d.fillRect(99 + x, 41 + y, 1, 10);
        g2d.fillRect(120 + x, 47 + y, 1, 3);
        g2d.fillRect(100 + x, 48 + y, 1, 12);
        g2d.fillRect(119 + x, 49 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(121 + x, 35 + y, 1, 4);
        g2d.fillRect(98 + x, 36 + y, 1, 4);
        g2d.fillRect(100 + x, 36 + y, 1, 4);
        g2d.fillRect(101 + x, 36 + y, 1, 11);
        g2d.fillRect(120 + x, 39 + y, 1, 1);
        g2d.fillRect(120 + x, 41 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 5);
        g2d.fillRect(118 + x, 47 + y, 1, 27);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(120 + x, 35 + y, 1, 4);
        g2d.fillRect(99 + x, 36 + y, 1, 5);
        g2d.fillRect(100 + x, 40 + y, 1, 8);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(120 + x, 42 + y, 1, 5);
        g2d.fillRect(101 + x, 47 + y, 1, 12);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 23 + y, 1, 2);
        g2d.fillRect(117 + x, 26 + y, 2, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 22 + y, 1, 2);
        g2d.fillRect(110 + x, 23 + y, 1, 2);
        g2d.fillRect(111 + x, 24 + y, 1, 2);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 1, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 12 + y, 1, 3);
        g2d.fillRect(109 + x, 13 + y, 2, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 10);
        g2d.fillRect(97 + x, 32 + y, 1, 2);
        g2d.fillRect(110 + x, 34 + y, 1, 3);
        g2d.fillRect(98 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 4);
        g2d.fillRect(101 + x, 37 + y, 1, 3);
        g2d.fillRect(102 + x, 38 + y, 1, 3);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 31 + y, 1, 2);
        g2d.fillRect(111 + x, 34 + y, 1, 3);
        g2d.fillRect(98 + x, 35 + y, 1, 3);
        g2d.fillRect(99 + x, 37 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 11 + y, 10, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 4);
        g2d.fillRect(112 + x, 12 + y, 1, 3);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(99 + x, 12 + y, 2, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 2);
        g2d.fillRect(98 + x, 13 + y, 2, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 1, 3);
        g2d.fillRect(106 + x, 15 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 3, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 3);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(96 + x, 18 + y, 1, 3);
        g2d.fillRect(120 + x, 19 + y, 1, 3);
        g2d.fillRect(109 + x, 19 + y, 1, 5);
        g2d.fillRect(108 + x, 19 + y, 1, 3);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 3);
        g2d.fillRect(94 + x, 22 + y, 1, 2);
        g2d.fillRect(102 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 25 + y, 2, 1);
        g2d.fillRect(93 + x, 26 + y, 1, 10);
        g2d.fillRect(112 + x, 28 + y, 1, 3);
        g2d.fillRect(96 + x, 30 + y, 1, 3);
        g2d.fillRect(113 + x, 33 + y, 1, 4);
        g2d.fillRect(97 + x, 34 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 12 + y, 4, 1);
        g2d.fillRect(100 + x, 13 + y, 2, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 3, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 3);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 5);
        g2d.fillRect(99 + x, 17 + y, 2, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 6);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(95 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 2, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 2, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 2);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(93 + x, 21 + y, 1, 4);
        g2d.fillRect(120 + x, 22 + y, 1, 8);
        g2d.fillRect(114 + x, 22 + y, 2, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 3);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 2);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 24 + y, 1, 4);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 2);
        g2d.fillRect(98 + x, 25 + y, 1, 2);
        g2d.fillRect(96 + x, 26 + y, 1, 4);
        g2d.fillRect(95 + x, 29 + y, 1, 3);
        g2d.fillRect(118 + x, 30 + y, 1, 1);
        g2d.fillRect(119 + x, 32 + y, 1, 3);
        g2d.fillRect(112 + x, 33 + y, 1, 4);
        g2d.fillRect(96 + x, 33 + y, 1, 4);
        g2d.fillRect(117 + x, 34 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 15 + y, 1, 3);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 3);
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 2, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 3);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 10);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 2, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 11);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 6);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 14);
        g2d.fillRect(99 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 3);
        g2d.fillRect(112 + x, 24 + y, 1, 4);
        g2d.fillRect(115 + x, 25 + y, 1, 12);
        g2d.fillRect(95 + x, 25 + y, 1, 4);
        g2d.fillRect(93 + x, 25 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 8);
        g2d.fillRect(94 + x, 28 + y, 1, 3);
        g2d.fillRect(117 + x, 29 + y, 1, 1);
        g2d.fillRect(118 + x, 31 + y, 1, 6);
        g2d.fillRect(113 + x, 32 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(100 + x, 14 + y, 2, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 2, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 4);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 2, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 6);
        g2d.fillRect(112 + x, 19 + y, 1, 5);
        g2d.fillRect(107 + x, 19 + y, 1, 3);
        g2d.fillRect(100 + x, 19 + y, 2, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 3);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 2);
        g2d.fillRect(117 + x, 22 + y, 1, 7);
        g2d.fillRect(105 + x, 22 + y, 1, 2);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 9);
        g2d.fillRect(100 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 30 + y, 1, 4);
        g2d.fillRect(94 + x, 31 + y, 1, 2);
        g2d.fillRect(95 + x, 32 + y, 1, 4);
        g2d.fillRect(116 + x, 34 + y, 1, 3);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 36 + y, 1, 11);
        g2d.fillRect(100 + x, 38 + y, 1, 7);
        g2d.fillRect(101 + x, 39 + y, 1, 3);
        g2d.fillRect(102 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 36 + y, 1, 12);
        g2d.fillRect(98 + x, 37 + y, 1, 2);
        g2d.fillRect(99 + x, 38 + y, 1, 9);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(93 + x, 35 + y, 1, 2);
        g2d.fillRect(113 + x, 36 + y, 1, 27);
        g2d.fillRect(112 + x, 36 + y, 1, 22);
        g2d.fillRect(97 + x, 36 + y, 1, 4);
        g2d.fillRect(98 + x, 39 + y, 1, 30);
        g2d.fillRect(94 + x, 39 + y, 1, 8);
        g2d.fillRect(111 + x, 50 + y, 1, 4);
        g2d.fillRect(96 + x, 53 + y, 1, 27);
        g2d.fillRect(95 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(97 + x, 74 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 36 + y, 1, 2);
        g2d.fillRect(96 + x, 36 + y, 1, 8);
        g2d.fillRect(117 + x, 40 + y, 1, 6);
        g2d.fillRect(97 + x, 40 + y, 1, 7);
        g2d.fillRect(116 + x, 41 + y, 1, 10);
        g2d.fillRect(95 + x, 47 + y, 1, 3);
        g2d.fillRect(115 + x, 48 + y, 1, 12);
        g2d.fillRect(96 + x, 49 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(94 + x, 35 + y, 1, 4);
        g2d.fillRect(117 + x, 36 + y, 1, 4);
        g2d.fillRect(115 + x, 36 + y, 1, 4);
        g2d.fillRect(114 + x, 36 + y, 1, 11);
        g2d.fillRect(95 + x, 39 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 5);
        g2d.fillRect(97 + x, 47 + y, 1, 27);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(95 + x, 35 + y, 1, 4);
        g2d.fillRect(116 + x, 36 + y, 1, 5);
        g2d.fillRect(115 + x, 40 + y, 1, 8);
        g2d.fillRect(95 + x, 40 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 5);
        g2d.fillRect(114 + x, 47 + y, 1, 12);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 23 + y, 1, 2);
        g2d.fillRect(97 + x, 26 + y, 2, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 22 + y, 1, 2);
        g2d.fillRect(105 + x, 23 + y, 1, 2);
        g2d.fillRect(104 + x, 24 + y, 1, 2);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 1);
    }
}
