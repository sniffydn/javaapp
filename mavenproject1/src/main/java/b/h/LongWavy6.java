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
public class LongWavy6 extends SuperHLong
{
    public LongWavy6()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongWavy6(int step, int dir)
    {
        super(step, dir);
    }

    public LongWavy6(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(94 + x, 25 + y, 1, 3);
        g2d.fillRect(95 + x, 25 + y, 1, 5);
        g2d.fillRect(96 + x, 25 + y, 1, 19);
        g2d.fillRect(97 + x, 25 + y, 1, 9);
        g2d.fillRect(98 + x, 25 + y, 1, 5);
        g2d.fillRect(98 + x, 31 + y, 1, 6);
        g2d.fillRect(101 + x, 31 + y, 1, 3);
        g2d.fillRect(99 + x, 32 + y, 1, 4);
        g2d.fillRect(100 + x, 32 + y, 1, 3);
        g2d.fillRect(95 + x, 33 + y, 1, 7);
        g2d.fillRect(103 + x, 35 + y, 1, 4);
        g2d.fillRect(104 + x, 35 + y, 1, 5);
        g2d.fillRect(97 + x, 36 + y, 1, 1);
        g2d.fillRect(119 + x, 36 + y, 1, 4);
        g2d.fillRect(124 + x, 36 + y, 1, 3);
        g2d.fillRect(115 + x, 37 + y, 1, 6);
        g2d.fillRect(116 + x, 37 + y, 1, 7);
        g2d.fillRect(117 + x, 37 + y, 2, 1);
        g2d.fillRect(123 + x, 37 + y, 1, 13);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 7);
        g2d.fillRect(106 + x, 38 + y, 1, 4);
        g2d.fillRect(114 + x, 38 + y, 1, 3);
        g2d.fillRect(118 + x, 38 + y, 1, 1);
        g2d.fillRect(121 + x, 39 + y, 1, 6);
        g2d.fillRect(97 + x, 40 + y, 1, 7);
        g2d.fillRect(98 + x, 40 + y, 1, 7);
        g2d.fillRect(99 + x, 40 + y, 1, 2);
        g2d.fillRect(100 + x, 40 + y, 1, 2);
        g2d.fillRect(101 + x, 40 + y, 1, 5);
        g2d.fillRect(122 + x, 40 + y, 1, 5);
        g2d.fillRect(103 + x, 41 + y, 1, 6);
        g2d.fillRect(104 + x, 41 + y, 1, 6);
        g2d.fillRect(117 + x, 41 + y, 1, 6);
        g2d.fillRect(119 + x, 41 + y, 2, 1);
        g2d.fillRect(120 + x, 42 + y, 1, 2);
        g2d.fillRect(124 + x, 42 + y, 1, 5);
        g2d.fillRect(118 + x, 43 + y, 1, 4);
        g2d.fillRect(106 + x, 44 + y, 1, 5);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 2, 1);
        g2d.fillRect(122 + x, 46 + y, 1, 1);
        g2d.fillRect(124 + x, 48 + y, 1, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 2);
        g2d.fillRect(122 + x, 55 + y, 1, 1);
        g2d.fillRect(123 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 60 + y, 1, 1);
        g2d.fillRect(98 + x, 61 + y, 1, 2);
        g2d.fillRect(122 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(96 + x, 47 + y, 1, 7);
        g2d.fillRect(97 + x, 47 + y, 1, 7);
        g2d.fillRect(99 + x, 47 + y, 1, 3);
        g2d.fillRect(102 + x, 47 + y, 1, 3);
        g2d.fillRect(104 + x, 47 + y, 1, 2);
        g2d.fillRect(105 + x, 47 + y, 1, 15);
        g2d.fillRect(114 + x, 47 + y, 1, 5);
        g2d.fillRect(115 + x, 47 + y, 1, 7);
        g2d.fillRect(121 + x, 47 + y, 1, 11);
        g2d.fillRect(122 + x, 47 + y, 1, 4);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 3);
        g2d.fillRect(106 + x, 49 + y, 1, 3);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 5);
        g2d.fillRect(98 + x, 50 + y, 1, 7);
        g2d.fillRect(101 + x, 50 + y, 1, 2);
        g2d.fillRect(104 + x, 50 + y, 1, 6);
        g2d.fillRect(116 + x, 51 + y, 1, 6);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 15);
        g2d.fillRect(115 + x, 55 + y, 1, 8);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 3);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 4);
        g2d.fillRect(120 + x, 57 + y, 1, 3);
        g2d.fillRect(99 + x, 58 + y, 1, 9);
        g2d.fillRect(98 + x, 59 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 4);
        g2d.fillRect(104 + x, 59 + y, 1, 11);
        g2d.fillRect(122 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 4);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 5);
        g2d.fillRect(118 + x, 61 + y, 1, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 3);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(98 + x, 63 + y, 1, 2);
        g2d.fillRect(122 + x, 63 + y, 1, 1);
        g2d.fillRect(101 + x, 64 + y, 1, 6);
        g2d.fillRect(118 + x, 64 + y, 1, 2);
        g2d.fillRect(120 + x, 64 + y, 1, 4);
        g2d.fillRect(102 + x, 65 + y, 1, 3);
        g2d.fillRect(115 + x, 65 + y, 1, 2);
        g2d.fillRect(119 + x, 65 + y, 1, 5);
        g2d.fillRect(121 + x, 65 + y, 1, 5);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 3);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 3);
        g2d.fillRect(116 + x, 67 + y, 2, 1);
        g2d.fillRect(99 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 2);
        g2d.fillRect(102 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(117 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(98 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(99 + x, 28 + y, 1, 4);
        g2d.fillRect(98 + x, 30 + y, 1, 1);
        g2d.fillRect(100 + x, 30 + y, 1, 2);
        g2d.fillRect(97 + x, 34 + y, 1, 2);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(120 + x, 36 + y, 1, 2);
        g2d.fillRect(123 + x, 36 + y, 1, 1);
        g2d.fillRect(97 + x, 37 + y, 1, 3);
        g2d.fillRect(98 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 3);
        g2d.fillRect(121 + x, 37 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 4);
        g2d.fillRect(117 + x, 38 + y, 1, 2);
        g2d.fillRect(122 + x, 38 + y, 1, 2);
        g2d.fillRect(98 + x, 39 + y, 3, 1);
        g2d.fillRect(103 + x, 39 + y, 1, 2);
        g2d.fillRect(118 + x, 39 + y, 1, 1);
        g2d.fillRect(120 + x, 39 + y, 1, 2);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 3);
        g2d.fillRect(120 + x, 44 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 2);
        g2d.fillRect(122 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 4);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(103 + x, 52 + y, 1, 3);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 4);
        g2d.fillRect(120 + x, 62 + y, 1, 2);
        g2d.fillRect(121 + x, 64 + y, 1, 1);
        g2d.fillRect(118 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 29 + y, 1, 1);
        g2d.fillRect(101 + x, 34 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 1, 2);
        g2d.fillRect(121 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 3);
        g2d.fillRect(103 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 2, 1);
        g2d.fillRect(120 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 2, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 2);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(121 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(120 + x, 60 + y, 1, 2);
        g2d.fillRect(119 + x, 61 + y, 1, 2);
        g2d.fillRect(117 + x, 63 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(101 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(122 + x, 36 + y, 1, 2);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(120 + x, 38 + y, 1, 1);
        g2d.fillRect(104 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 2, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 2);
        g2d.fillRect(119 + x, 42 + y, 1, 4);
        g2d.fillRect(102 + x, 43 + y, 1, 2);
        g2d.fillRect(100 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 45 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(118 + x, 68 + y, 1, 1);
        g2d.fillRect(120 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 47 + y, 1, 4);
        g2d.fillRect(118 + x, 47 + y, 2, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(122 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 3);
        g2d.fillRect(118 + x, 62 + y, 1, 2);
        g2d.fillRect(101 + x, 63 + y, 2, 1);
        g2d.fillRect(119 + x, 63 + y, 1, 2);
        g2d.fillRect(102 + x, 64 + y, 2, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(122 + x, 64 + y, 1, 1);
        g2d.fillRect(118 + x, 66 + y, 1, 1);
        g2d.fillRect(122 + x, 66 + y, 1, 1);
        g2d.fillRect(99 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(98 + x, 58 + y, 1, 1);


//        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(124 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);


//        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(105 + x, 46 + y, 1, 1);


//        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(112 + x, 19 + y, 1, 7);
        g2d.fillRect(113 + x, 19 + y, 10, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 5);
        g2d.fillRect(118 + x, 20 + y, 5, 1);
        g2d.fillRect(120 + x, 21 + y, 4, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 2);
        g2d.fillRect(121 + x, 22 + y, 1, 2);
        g2d.fillRect(122 + x, 22 + y, 1, 4);
        g2d.fillRect(123 + x, 22 + y, 1, 10);
        g2d.fillRect(124 + x, 22 + y, 1, 4);
        g2d.fillRect(113 + x, 23 + y, 1, 4);
        g2d.fillRect(114 + x, 24 + y, 1, 4);
        g2d.fillRect(115 + x, 25 + y, 1, 4);
        g2d.fillRect(116 + x, 26 + y, 1, 4);
        g2d.fillRect(117 + x, 26 + y, 1, 5);
        g2d.fillRect(118 + x, 27 + y, 1, 5);
        g2d.fillRect(119 + x, 28 + y, 1, 4);
        g2d.fillRect(120 + x, 29 + y, 1, 3);
        g2d.fillRect(121 + x, 30 + y, 1, 2);
        g2d.fillRect(122 + x, 30 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(113 + x, 20 + y, 1, 3);
        g2d.fillRect(114 + x, 20 + y, 1, 4);
        g2d.fillRect(115 + x, 20 + y, 3, 1);
        g2d.fillRect(117 + x, 21 + y, 3, 1);
        g2d.fillRect(119 + x, 22 + y, 2, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 2);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(116 + x, 24 + y, 1, 2);
        g2d.fillRect(121 + x, 24 + y, 1, 2);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(118 + x, 26 + y, 1, 1);
        g2d.fillRect(122 + x, 26 + y, 1, 4);
        g2d.fillRect(119 + x, 27 + y, 2, 1);
        g2d.fillRect(120 + x, 28 + y, 2, 1);
        g2d.fillRect(121 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 22 + y, 3, 1);
        g2d.fillRect(117 + x, 23 + y, 2, 1);
        g2d.fillRect(118 + x, 24 + y, 2, 1);
        g2d.fillRect(119 + x, 25 + y, 2, 1);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
    }





    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(103 + x, 11 + y, 15, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 2, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 4);
        g2d.fillRect(118 + x, 13 + y, 2, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 4);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(119 + x, 14 + y, 1, 6);
        g2d.fillRect(120 + x, 14 + y, 1, 6);
        g2d.fillRect(99 + x, 15 + y, 1, 5);
        g2d.fillRect(98 + x, 16 + y, 1, 5);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 3);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 5);
        g2d.fillRect(108 + x, 18 + y, 1, 4);
        g2d.fillRect(109 + x, 18 + y, 1, 5);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(97 + x, 19 + y, 1, 7);
        g2d.fillRect(104 + x, 19 + y, 1, 17);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 4);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 4);
        g2d.fillRect(106 + x, 21 + y, 1, 3);
        g2d.fillRect(96 + x, 22 + y, 1, 4);
        g2d.fillRect(102 + x, 22 + y, 1, 3);
        g2d.fillRect(105 + x, 22 + y, 1, 6);
        g2d.fillRect(95 + x, 23 + y, 1, 3);
        g2d.fillRect(98 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 24 + y, 1, 3);
        g2d.fillRect(94 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 4);
        g2d.fillRect(100 + x, 25 + y, 1, 2);
        g2d.fillRect(102 + x, 30 + y, 1, 3);
        g2d.fillRect(103 + x, 30 + y, 1, 6);
        g2d.fillRect(101 + x, 31 + y, 1, 1);
        g2d.fillRect(119 + x, 31 + y, 1, 6);
        g2d.fillRect(120 + x, 31 + y, 1, 3);
        g2d.fillRect(121 + x, 31 + y, 1, 2);
        g2d.fillRect(122 + x, 31 + y, 1, 3);
        g2d.fillRect(123 + x, 31 + y, 1, 4);
        g2d.fillRect(124 + x, 31 + y, 1, 6);
        g2d.fillRect(118 + x, 33 + y, 1, 5);
        g2d.fillRect(117 + x, 34 + y, 1, 4);
        g2d.fillRect(116 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(103 + x, 12 + y, 1, 4);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 4);
        g2d.fillRect(108 + x, 15 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 3);
        g2d.fillRect(111 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 16 + y, 1, 4);
        g2d.fillRect(101 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(117 + x, 17 + y, 1, 2);
        g2d.fillRect(100 + x, 18 + y, 1, 3);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 1, 3);
        g2d.fillRect(101 + x, 22 + y, 1, 2);
        g2d.fillRect(99 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 23 + y, 1, 2);
        g2d.fillRect(102 + x, 25 + y, 1, 2);
        g2d.fillRect(103 + x, 25 + y, 1, 5);
        g2d.fillRect(100 + x, 27 + y, 1, 2);
        g2d.fillRect(102 + x, 29 + y, 1, 1);
        g2d.fillRect(101 + x, 30 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(120 + x, 34 + y, 1, 3);
        g2d.fillRect(122 + x, 34 + y, 1, 2);
        g2d.fillRect(123 + x, 35 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 2, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 3);
        g2d.fillRect(113 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 3, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 2, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 1);
        g2d.fillRect(101 + x, 29 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 1, 1);
        g2d.fillRect(121 + x, 35 + y, 1, 2);
        g2d.fillRect(122 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 12 + y, 7, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 3);
        g2d.fillRect(104 + x, 15 + y, 2, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 27 + y, 1, 2);
        g2d.fillRect(101 + x, 28 + y, 1, 1);
        g2d.fillRect(102 + x, 33 + y, 1, 2);
        g2d.fillRect(121 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 4, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 3);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 2);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(19 + x, 25 + y, 1, 3);
        g2d.fillRect(18 + x, 25 + y, 1, 5);
        g2d.fillRect(17 + x, 25 + y, 1, 19);
        g2d.fillRect(16 + x, 25 + y, 1, 9);
        g2d.fillRect(15 + x, 25 + y, 1, 5);
        g2d.fillRect(15 + x, 31 + y, 1, 6);
        g2d.fillRect(12 + x, 31 + y, 1, 3);
        g2d.fillRect(14 + x, 32 + y, 1, 4);
        g2d.fillRect(13 + x, 32 + y, 1, 3);
        g2d.fillRect(18 + x, 33 + y, 1, 7);
        g2d.fillRect(10 + x, 35 + y, 1, 4);
        g2d.fillRect(9 + x, 35 + y, 1, 5);
        g2d.fillRect(16 + x, 36 + y, 1, 1);
        g2d.fillRect(-6 + x, 36 + y, 1, 4);
        g2d.fillRect(-11 + x, 36 + y, 1, 3);
        g2d.fillRect(-2 + x, 37 + y, 1, 6);
        g2d.fillRect(-3 + x, 37 + y, 1, 7);
        g2d.fillRect(-5 + x, 37 + y, 2, 1);
        g2d.fillRect(-10 + x, 37 + y, 1, 13);
        g2d.fillRect(13 + x, 38 + y, 1, 1);
        g2d.fillRect(8 + x, 38 + y, 1, 7);
        g2d.fillRect(7 + x, 38 + y, 1, 4);
        g2d.fillRect(-1 + x, 38 + y, 1, 3);
        g2d.fillRect(-5 + x, 38 + y, 1, 1);
        g2d.fillRect(-8 + x, 39 + y, 1, 6);
        g2d.fillRect(16 + x, 40 + y, 1, 7);
        g2d.fillRect(15 + x, 40 + y, 1, 7);
        g2d.fillRect(14 + x, 40 + y, 1, 2);
        g2d.fillRect(13 + x, 40 + y, 1, 2);
        g2d.fillRect(12 + x, 40 + y, 1, 5);
        g2d.fillRect(-9 + x, 40 + y, 1, 5);
        g2d.fillRect(10 + x, 41 + y, 1, 6);
        g2d.fillRect(9 + x, 41 + y, 1, 6);
        g2d.fillRect(-4 + x, 41 + y, 1, 6);
        g2d.fillRect(-7 + x, 41 + y, 2, 1);
        g2d.fillRect(-7 + x, 42 + y, 1, 2);
        g2d.fillRect(-11 + x, 42 + y, 1, 5);
        g2d.fillRect(-5 + x, 43 + y, 1, 4);
        g2d.fillRect(7 + x, 44 + y, 1, 5);
        g2d.fillRect(-3 + x, 46 + y, 1, 1);
        g2d.fillRect(-7 + x, 46 + y, 2, 1);
        g2d.fillRect(-9 + x, 46 + y, 1, 1);
        g2d.fillRect(-11 + x, 48 + y, 1, 1);
        g2d.fillRect(6 + x, 49 + y, 1, 2);
        g2d.fillRect(-9 + x, 55 + y, 1, 1);
        g2d.fillRect(-10 + x, 56 + y, 1, 1);
        g2d.fillRect(16 + x, 60 + y, 1, 1);
        g2d.fillRect(15 + x, 61 + y, 1, 2);
        g2d.fillRect(-9 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(17 + x, 47 + y, 1, 7);
        g2d.fillRect(16 + x, 47 + y, 1, 7);
        g2d.fillRect(14 + x, 47 + y, 1, 3);
        g2d.fillRect(11 + x, 47 + y, 1, 3);
        g2d.fillRect(9 + x, 47 + y, 1, 2);
        g2d.fillRect(8 + x, 47 + y, 1, 15);
        g2d.fillRect(-1 + x, 47 + y, 1, 5);
        g2d.fillRect(-2 + x, 47 + y, 1, 7);
        g2d.fillRect(-8 + x, 47 + y, 1, 11);
        g2d.fillRect(-9 + x, 47 + y, 1, 4);
        g2d.fillRect(-3 + x, 48 + y, 1, 2);
        g2d.fillRect(-4 + x, 48 + y, 1, 2);
        g2d.fillRect(-6 + x, 48 + y, 1, 2);
        g2d.fillRect(10 + x, 49 + y, 1, 3);
        g2d.fillRect(7 + x, 49 + y, 1, 3);
        g2d.fillRect(-5 + x, 49 + y, 1, 1);
        g2d.fillRect(-7 + x, 49 + y, 1, 5);
        g2d.fillRect(15 + x, 50 + y, 1, 7);
        g2d.fillRect(12 + x, 50 + y, 1, 2);
        g2d.fillRect(9 + x, 50 + y, 1, 6);
        g2d.fillRect(-3 + x, 51 + y, 1, 6);
        g2d.fillRect(13 + x, 52 + y, 1, 2);
        g2d.fillRect(11 + x, 52 + y, 1, 2);
        g2d.fillRect(14 + x, 54 + y, 1, 3);
        g2d.fillRect(12 + x, 54 + y, 1, 2);
        g2d.fillRect(-4 + x, 54 + y, 1, 1);
        g2d.fillRect(-6 + x, 54 + y, 1, 2);
        g2d.fillRect(13 + x, 55 + y, 1, 15);
        g2d.fillRect(-2 + x, 55 + y, 1, 8);
        g2d.fillRect(10 + x, 56 + y, 1, 3);
        g2d.fillRect(-4 + x, 56 + y, 1, 3);
        g2d.fillRect(-5 + x, 56 + y, 1, 2);
        g2d.fillRect(11 + x, 57 + y, 1, 3);
        g2d.fillRect(9 + x, 57 + y, 1, 1);
        g2d.fillRect(-6 + x, 57 + y, 1, 4);
        g2d.fillRect(-7 + x, 57 + y, 1, 3);
        g2d.fillRect(14 + x, 58 + y, 1, 9);
        g2d.fillRect(15 + x, 59 + y, 1, 2);
        g2d.fillRect(12 + x, 59 + y, 1, 4);
        g2d.fillRect(9 + x, 59 + y, 1, 11);
        g2d.fillRect(-9 + x, 59 + y, 1, 2);
        g2d.fillRect(10 + x, 60 + y, 1, 4);
        g2d.fillRect(11 + x, 61 + y, 1, 2);
        g2d.fillRect(-3 + x, 61 + y, 1, 5);
        g2d.fillRect(-5 + x, 61 + y, 1, 1);
        g2d.fillRect(-8 + x, 61 + y, 1, 3);
        g2d.fillRect(-4 + x, 62 + y, 1, 1);
        g2d.fillRect(15 + x, 63 + y, 1, 2);
        g2d.fillRect(-9 + x, 63 + y, 1, 1);
        g2d.fillRect(12 + x, 64 + y, 1, 6);
        g2d.fillRect(-5 + x, 64 + y, 1, 2);
        g2d.fillRect(-7 + x, 64 + y, 1, 4);
        g2d.fillRect(11 + x, 65 + y, 1, 3);
        g2d.fillRect(-2 + x, 65 + y, 1, 2);
        g2d.fillRect(-6 + x, 65 + y, 1, 5);
        g2d.fillRect(-8 + x, 65 + y, 1, 5);
        g2d.fillRect(-9 + x, 65 + y, 1, 1);
        g2d.fillRect(10 + x, 66 + y, 1, 3);
        g2d.fillRect(8 + x, 66 + y, 1, 3);
        g2d.fillRect(-1 + x, 66 + y, 1, 2);
        g2d.fillRect(7 + x, 67 + y, 1, 3);
        g2d.fillRect(-4 + x, 67 + y, 2, 1);
        g2d.fillRect(14 + x, 68 + y, 1, 1);
        g2d.fillRect(-2 + x, 68 + y, 1, 2);
        g2d.fillRect(11 + x, 69 + y, 1, 1);
        g2d.fillRect(-5 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(-4 + x, 66 + y, 1, 1);
        g2d.fillRect(-4 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(15 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(14 + x, 28 + y, 1, 4);
        g2d.fillRect(15 + x, 30 + y, 1, 1);
        g2d.fillRect(13 + x, 30 + y, 1, 2);
        g2d.fillRect(16 + x, 34 + y, 1, 2);
        g2d.fillRect(13 + x, 35 + y, 1, 1);
        g2d.fillRect(14 + x, 36 + y, 1, 1);
        g2d.fillRect(-7 + x, 36 + y, 1, 2);
        g2d.fillRect(-10 + x, 36 + y, 1, 1);
        g2d.fillRect(16 + x, 37 + y, 1, 3);
        g2d.fillRect(15 + x, 37 + y, 1, 1);
        g2d.fillRect(12 + x, 37 + y, 1, 3);
        g2d.fillRect(-8 + x, 37 + y, 1, 2);
        g2d.fillRect(11 + x, 38 + y, 1, 4);
        g2d.fillRect(-4 + x, 38 + y, 1, 2);
        g2d.fillRect(-9 + x, 38 + y, 1, 2);
        g2d.fillRect(13 + x, 39 + y, 3, 1);
        g2d.fillRect(10 + x, 39 + y, 1, 2);
        g2d.fillRect(-5 + x, 39 + y, 1, 1);
        g2d.fillRect(-7 + x, 39 + y, 1, 2);
        g2d.fillRect(-6 + x, 40 + y, 1, 1);
        g2d.fillRect(14 + x, 42 + y, 1, 3);
        g2d.fillRect(-7 + x, 44 + y, 1, 1);
        g2d.fillRect(11 + x, 45 + y, 1, 2);
        g2d.fillRect(-9 + x, 45 + y, 1, 1);
        g2d.fillRect(14 + x, 46 + y, 1, 1);
        g2d.fillRect(-8 + x, 46 + y, 1, 1);
        g2d.fillRect(15 + x, 49 + y, 1, 1);
        g2d.fillRect(11 + x, 50 + y, 1, 2);
        g2d.fillRect(-5 + x, 50 + y, 1, 2);
        g2d.fillRect(-6 + x, 50 + y, 1, 4);
        g2d.fillRect(6 + x, 51 + y, 1, 1);
        g2d.fillRect(-4 + x, 51 + y, 1, 2);
        g2d.fillRect(10 + x, 52 + y, 1, 3);
        g2d.fillRect(7 + x, 52 + y, 1, 1);
        g2d.fillRect(9 + x, 56 + y, 1, 1);
        g2d.fillRect(-3 + x, 57 + y, 1, 4);
        g2d.fillRect(-7 + x, 62 + y, 1, 2);
        g2d.fillRect(-8 + x, 64 + y, 1, 1);
        g2d.fillRect(-5 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(13 + x, 29 + y, 1, 1);
        g2d.fillRect(12 + x, 34 + y, 1, 1);
        g2d.fillRect(11 + x, 35 + y, 1, 2);
        g2d.fillRect(-8 + x, 36 + y, 1, 1);
        g2d.fillRect(14 + x, 38 + y, 1, 1);
        g2d.fillRect(13 + x, 42 + y, 1, 3);
        g2d.fillRect(11 + x, 42 + y, 1, 1);
        g2d.fillRect(14 + x, 45 + y, 1, 1);
        g2d.fillRect(12 + x, 45 + y, 1, 1);
        g2d.fillRect(15 + x, 47 + y, 1, 2);
        g2d.fillRect(12 + x, 47 + y, 1, 3);
        g2d.fillRect(10 + x, 47 + y, 1, 2);
        g2d.fillRect(-4 + x, 47 + y, 2, 1);
        g2d.fillRect(-7 + x, 47 + y, 1, 2);
        g2d.fillRect(-5 + x, 48 + y, 1, 1);
        g2d.fillRect(9 + x, 49 + y, 1, 1);
        g2d.fillRect(-4 + x, 50 + y, 2, 1);
        g2d.fillRect(13 + x, 51 + y, 1, 1);
        g2d.fillRect(14 + x, 52 + y, 1, 2);
        g2d.fillRect(12 + x, 52 + y, 1, 2);
        g2d.fillRect(-4 + x, 53 + y, 1, 1);
        g2d.fillRect(13 + x, 54 + y, 1, 1);
        g2d.fillRect(11 + x, 54 + y, 1, 1);
        g2d.fillRect(-5 + x, 54 + y, 1, 2);
        g2d.fillRect(10 + x, 55 + y, 1, 1);
        g2d.fillRect(-4 + x, 55 + y, 1, 1);
        g2d.fillRect(-6 + x, 56 + y, 1, 1);
        g2d.fillRect(12 + x, 58 + y, 1, 1);
        g2d.fillRect(-5 + x, 59 + y, 1, 2);
        g2d.fillRect(-8 + x, 59 + y, 1, 2);
        g2d.fillRect(11 + x, 60 + y, 1, 1);
        g2d.fillRect(-7 + x, 60 + y, 1, 2);
        g2d.fillRect(-6 + x, 61 + y, 1, 2);
        g2d.fillRect(-4 + x, 63 + y, 1, 3);
        g2d.fillRect(-3 + x, 68 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(11 + x, 37 + y, 1, 1);
        g2d.fillRect(12 + x, 46 + y, 1, 1);
        g2d.fillRect(-5 + x, 52 + y, 1, 1);
        g2d.fillRect(-7 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-9 + x, 56 + y, 1, 1);
        g2d.fillRect(-10 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(13 + x, 28 + y, 1, 1);
        g2d.fillRect(12 + x, 35 + y, 1, 2);
        g2d.fillRect(13 + x, 36 + y, 1, 2);
        g2d.fillRect(-9 + x, 36 + y, 1, 2);
        g2d.fillRect(14 + x, 37 + y, 1, 1);
        g2d.fillRect(15 + x, 38 + y, 1, 1);
        g2d.fillRect(-7 + x, 38 + y, 1, 1);
        g2d.fillRect(9 + x, 40 + y, 1, 1);
        g2d.fillRect(-5 + x, 40 + y, 2, 1);
        g2d.fillRect(-5 + x, 41 + y, 1, 2);
        g2d.fillRect(-6 + x, 42 + y, 1, 4);
        g2d.fillRect(11 + x, 43 + y, 1, 2);
        g2d.fillRect(13 + x, 45 + y, 1, 2);
        g2d.fillRect(-8 + x, 45 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-3 + x, 66 + y, 1, 1);
        g2d.fillRect(-5 + x, 68 + y, 1, 1);
        g2d.fillRect(-7 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(13 + x, 47 + y, 1, 4);
        g2d.fillRect(-6 + x, 47 + y, 2, 1);
        g2d.fillRect(14 + x, 50 + y, 1, 2);
        g2d.fillRect(-5 + x, 53 + y, 1, 1);
        g2d.fillRect(-7 + x, 54 + y, 1, 3);
        g2d.fillRect(11 + x, 55 + y, 1, 2);
        g2d.fillRect(12 + x, 56 + y, 1, 2);
        g2d.fillRect(-9 + x, 57 + y, 1, 2);
        g2d.fillRect(-5 + x, 58 + y, 1, 1);
        g2d.fillRect(-8 + x, 58 + y, 1, 1);
        g2d.fillRect(-4 + x, 59 + y, 1, 3);
        g2d.fillRect(-5 + x, 62 + y, 1, 2);
        g2d.fillRect(11 + x, 63 + y, 2, 1);
        g2d.fillRect(-6 + x, 63 + y, 1, 2);
        g2d.fillRect(10 + x, 64 + y, 2, 1);
        g2d.fillRect(10 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(9 + x, 58 + y, 1, 1);
        g2d.fillRect(11 + x, 68 + y, 1, 1);
        g2d.fillRect(8 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-9 + x, 64 + y, 1, 1);
        g2d.fillRect(-5 + x, 66 + y, 1, 1);
        g2d.fillRect(-9 + x, 66 + y, 1, 1);
        g2d.fillRect(14 + x, 67 + y, 1, 1);
        g2d.fillRect(10 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(15 + x, 58 + y, 1, 1);


//        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(-11 + x, 47 + y, 1, 1);
        g2d.fillRect(-1 + x, 52 + y, 1, 1);
        g2d.fillRect(14 + x, 57 + y, 1, 1);
        g2d.fillRect(10 + x, 59 + y, 1, 1);
        g2d.fillRect(-2 + x, 67 + y, 1, 1);


//        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(8 + x, 46 + y, 1, 1);


//        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(8 + x, 45 + y, 1, 1);
        g2d.fillRect(-2 + x, 54 + y, 1, 1);
        g2d.fillRect(15 + x, 57 + y, 1, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(1 + x, 19 + y, 1, 7);
        g2d.fillRect(-9 + x, 19 + y, 10, 1);
        g2d.fillRect(2 + x, 20 + y, 1, 5);
        g2d.fillRect(-9 + x, 20 + y, 5, 1);
        g2d.fillRect(-10 + x, 21 + y, 4, 1);
        g2d.fillRect(3 + x, 22 + y, 1, 2);
        g2d.fillRect(-8 + x, 22 + y, 1, 2);
        g2d.fillRect(-9 + x, 22 + y, 1, 4);
        g2d.fillRect(-10 + x, 22 + y, 1, 10);
        g2d.fillRect(-11 + x, 22 + y, 1, 4);
        g2d.fillRect(0 + x, 23 + y, 1, 4);
        g2d.fillRect(-1 + x, 24 + y, 1, 4);
        g2d.fillRect(-2 + x, 25 + y, 1, 4);
        g2d.fillRect(-3 + x, 26 + y, 1, 4);
        g2d.fillRect(-4 + x, 26 + y, 1, 5);
        g2d.fillRect(-5 + x, 27 + y, 1, 5);
        g2d.fillRect(-6 + x, 28 + y, 1, 4);
        g2d.fillRect(-7 + x, 29 + y, 1, 3);
        g2d.fillRect(-8 + x, 30 + y, 1, 2);
        g2d.fillRect(-9 + x, 30 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(0 + x, 20 + y, 1, 3);
        g2d.fillRect(-1 + x, 20 + y, 1, 4);
        g2d.fillRect(-4 + x, 20 + y, 3, 1);
        g2d.fillRect(-6 + x, 21 + y, 3, 1);
        g2d.fillRect(-7 + x, 22 + y, 2, 1);
        g2d.fillRect(-2 + x, 23 + y, 1, 2);
        g2d.fillRect(-7 + x, 23 + y, 1, 2);
        g2d.fillRect(-3 + x, 24 + y, 1, 2);
        g2d.fillRect(-8 + x, 24 + y, 1, 2);
        g2d.fillRect(-4 + x, 25 + y, 1, 1);
        g2d.fillRect(-5 + x, 26 + y, 1, 1);
        g2d.fillRect(-9 + x, 26 + y, 1, 4);
        g2d.fillRect(-7 + x, 27 + y, 2, 1);
        g2d.fillRect(-8 + x, 28 + y, 2, 1);
        g2d.fillRect(-8 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(-3 + x, 21 + y, 1, 1);
        g2d.fillRect(-5 + x, 22 + y, 1, 1);
        g2d.fillRect(-3 + x, 23 + y, 1, 1);
        g2d.fillRect(-5 + x, 25 + y, 1, 1);
        g2d.fillRect(-6 + x, 26 + y, 1, 1);
        g2d.fillRect(-8 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(-2 + x, 21 + y, 1, 1);
        g2d.fillRect(-6 + x, 23 + y, 1, 1);
        g2d.fillRect(-4 + x, 24 + y, 1, 1);
        g2d.fillRect(-8 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-4 + x, 22 + y, 3, 1);
        g2d.fillRect(-5 + x, 23 + y, 2, 1);
        g2d.fillRect(-6 + x, 24 + y, 2, 1);
        g2d.fillRect(-7 + x, 25 + y, 2, 1);
        g2d.fillRect(-7 + x, 26 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(-4 + x, 11 + y, 15, 1);
        g2d.fillRect(11 + x, 12 + y, 1, 1);
        g2d.fillRect(-5 + x, 12 + y, 2, 1);
        g2d.fillRect(12 + x, 13 + y, 1, 4);
        g2d.fillRect(-6 + x, 13 + y, 2, 1);
        g2d.fillRect(13 + x, 14 + y, 1, 4);
        g2d.fillRect(11 + x, 14 + y, 1, 2);
        g2d.fillRect(-6 + x, 14 + y, 1, 6);
        g2d.fillRect(-7 + x, 14 + y, 1, 6);
        g2d.fillRect(14 + x, 15 + y, 1, 5);
        g2d.fillRect(15 + x, 16 + y, 1, 5);
        g2d.fillRect(10 + x, 16 + y, 1, 1);
        g2d.fillRect(11 + x, 17 + y, 1, 1);
        g2d.fillRect(-8 + x, 17 + y, 1, 3);
        g2d.fillRect(10 + x, 18 + y, 1, 1);
        g2d.fillRect(7 + x, 18 + y, 1, 2);
        g2d.fillRect(6 + x, 18 + y, 1, 5);
        g2d.fillRect(5 + x, 18 + y, 1, 4);
        g2d.fillRect(4 + x, 18 + y, 1, 5);
        g2d.fillRect(-5 + x, 18 + y, 1, 2);
        g2d.fillRect(16 + x, 19 + y, 1, 7);
        g2d.fillRect(9 + x, 19 + y, 1, 17);
        g2d.fillRect(8 + x, 19 + y, 1, 1);
        g2d.fillRect(3 + x, 19 + y, 1, 4);
        g2d.fillRect(2 + x, 19 + y, 1, 2);
        g2d.fillRect(-4 + x, 19 + y, 1, 1);
        g2d.fillRect(-9 + x, 19 + y, 1, 1);
        g2d.fillRect(10 + x, 21 + y, 1, 4);
        g2d.fillRect(7 + x, 21 + y, 1, 3);
        g2d.fillRect(17 + x, 22 + y, 1, 4);
        g2d.fillRect(11 + x, 22 + y, 1, 3);
        g2d.fillRect(8 + x, 22 + y, 1, 6);
        g2d.fillRect(18 + x, 23 + y, 1, 3);
        g2d.fillRect(15 + x, 24 + y, 1, 2);
        g2d.fillRect(12 + x, 24 + y, 1, 3);
        g2d.fillRect(19 + x, 25 + y, 1, 1);
        g2d.fillRect(14 + x, 25 + y, 1, 4);
        g2d.fillRect(13 + x, 25 + y, 1, 2);
        g2d.fillRect(11 + x, 30 + y, 1, 3);
        g2d.fillRect(10 + x, 30 + y, 1, 6);
        g2d.fillRect(12 + x, 31 + y, 1, 1);
        g2d.fillRect(-6 + x, 31 + y, 1, 6);
        g2d.fillRect(-7 + x, 31 + y, 1, 3);
        g2d.fillRect(-8 + x, 31 + y, 1, 2);
        g2d.fillRect(-9 + x, 31 + y, 1, 3);
        g2d.fillRect(-10 + x, 31 + y, 1, 4);
        g2d.fillRect(-11 + x, 31 + y, 1, 6);
        g2d.fillRect(-5 + x, 33 + y, 1, 5);
        g2d.fillRect(-4 + x, 34 + y, 1, 4);
        g2d.fillRect(-3 + x, 35 + y, 1, 3);
        g2d.fillRect(-2 + x, 36 + y, 1, 2);
        g2d.fillRect(-1 + x, 37 + y, 1, 2);
        g2d.fillRect(0 + x, 38 + y, 1, 2);
        g2d.fillRect(1 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(10 + x, 12 + y, 1, 4);
        g2d.fillRect(9 + x, 12 + y, 1, 1);
        g2d.fillRect(-3 + x, 12 + y, 1, 1);
        g2d.fillRect(11 + x, 13 + y, 1, 1);
        g2d.fillRect(-4 + x, 13 + y, 1, 1);
        g2d.fillRect(6 + x, 14 + y, 1, 1);
        g2d.fillRect(-5 + x, 14 + y, 1, 4);
        g2d.fillRect(5 + x, 15 + y, 1, 3);
        g2d.fillRect(11 + x, 16 + y, 1, 1);
        g2d.fillRect(9 + x, 16 + y, 1, 3);
        g2d.fillRect(2 + x, 16 + y, 1, 3);
        g2d.fillRect(-2 + x, 16 + y, 1, 4);
        g2d.fillRect(12 + x, 17 + y, 1, 2);
        g2d.fillRect(10 + x, 17 + y, 1, 1);
        g2d.fillRect(8 + x, 17 + y, 1, 2);
        g2d.fillRect(-4 + x, 17 + y, 1, 2);
        g2d.fillRect(13 + x, 18 + y, 1, 3);
        g2d.fillRect(11 + x, 18 + y, 1, 1);
        g2d.fillRect(3 + x, 18 + y, 1, 1);
        g2d.fillRect(1 + x, 18 + y, 1, 2);
        g2d.fillRect(0 + x, 18 + y, 1, 2);
        g2d.fillRect(-1 + x, 18 + y, 1, 2);
        g2d.fillRect(-3 + x, 18 + y, 1, 2);
        g2d.fillRect(10 + x, 19 + y, 1, 2);
        g2d.fillRect(14 + x, 20 + y, 1, 2);
        g2d.fillRect(11 + x, 20 + y, 1, 2);
        g2d.fillRect(15 + x, 21 + y, 1, 3);
        g2d.fillRect(12 + x, 22 + y, 1, 2);
        g2d.fillRect(14 + x, 23 + y, 1, 2);
        g2d.fillRect(13 + x, 23 + y, 1, 2);
        g2d.fillRect(11 + x, 25 + y, 1, 2);
        g2d.fillRect(10 + x, 25 + y, 1, 5);
        g2d.fillRect(13 + x, 27 + y, 1, 2);
        g2d.fillRect(11 + x, 29 + y, 1, 1);
        g2d.fillRect(12 + x, 30 + y, 1, 1);
        g2d.fillRect(-8 + x, 33 + y, 1, 1);
        g2d.fillRect(-7 + x, 34 + y, 1, 3);
        g2d.fillRect(-9 + x, 34 + y, 1, 2);
        g2d.fillRect(-10 + x, 35 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(7 + x, 12 + y, 2, 1);
        g2d.fillRect(-2 + x, 12 + y, 2, 1);
        g2d.fillRect(9 + x, 13 + y, 1, 2);
        g2d.fillRect(6 + x, 13 + y, 2, 1);
        g2d.fillRect(-3 + x, 13 + y, 1, 1);
        g2d.fillRect(8 + x, 14 + y, 1, 1);
        g2d.fillRect(5 + x, 14 + y, 1, 1);
        g2d.fillRect(2 + x, 14 + y, 1, 2);
        g2d.fillRect(-2 + x, 14 + y, 1, 1);
        g2d.fillRect(-4 + x, 14 + y, 1, 3);
        g2d.fillRect(0 + x, 15 + y, 1, 1);
        g2d.fillRect(7 + x, 16 + y, 1, 2);
        g2d.fillRect(4 + x, 16 + y, 1, 1);
        g2d.fillRect(-1 + x, 17 + y, 3, 1);
        g2d.fillRect(-3 + x, 17 + y, 1, 1);
        g2d.fillRect(16 + x, 18 + y, 1, 1);
        g2d.fillRect(11 + x, 19 + y, 2, 1);
        g2d.fillRect(8 + x, 20 + y, 1, 2);
        g2d.fillRect(7 + x, 20 + y, 1, 1);
        g2d.fillRect(12 + x, 21 + y, 1, 1);
        g2d.fillRect(14 + x, 22 + y, 1, 1);
        g2d.fillRect(12 + x, 27 + y, 1, 1);
        g2d.fillRect(12 + x, 29 + y, 1, 1);
        g2d.fillRect(11 + x, 35 + y, 1, 1);
        g2d.fillRect(-8 + x, 35 + y, 1, 2);
        g2d.fillRect(-9 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(7 + x, 15 + y, 1, 1);
        g2d.fillRect(-2 + x, 15 + y, 1, 1);
        g2d.fillRect(0 + x, 16 + y, 1, 1);
        g2d.fillRect(4 + x, 17 + y, 1, 1);
        g2d.fillRect(12 + x, 20 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(0 + x, 12 + y, 7, 1);
        g2d.fillRect(8 + x, 13 + y, 1, 1);
        g2d.fillRect(5 + x, 13 + y, 1, 1);
        g2d.fillRect(3 + x, 13 + y, 1, 1);
        g2d.fillRect(-2 + x, 13 + y, 1, 1);
        g2d.fillRect(4 + x, 14 + y, 1, 2);
        g2d.fillRect(0 + x, 14 + y, 1, 1);
        g2d.fillRect(-3 + x, 14 + y, 1, 3);
        g2d.fillRect(8 + x, 15 + y, 2, 1);
        g2d.fillRect(-1 + x, 15 + y, 1, 2);
        g2d.fillRect(8 + x, 16 + y, 1, 1);
        g2d.fillRect(1 + x, 16 + y, 1, 1);
        g2d.fillRect(6 + x, 17 + y, 1, 1);
        g2d.fillRect(3 + x, 17 + y, 1, 1);
        g2d.fillRect(13 + x, 21 + y, 1, 2);
        g2d.fillRect(11 + x, 27 + y, 1, 2);
        g2d.fillRect(12 + x, 28 + y, 1, 1);
        g2d.fillRect(11 + x, 33 + y, 1, 2);
        g2d.fillRect(-8 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(4 + x, 13 + y, 1, 1);
        g2d.fillRect(-1 + x, 13 + y, 4, 1);
        g2d.fillRect(7 + x, 14 + y, 1, 1);
        g2d.fillRect(3 + x, 14 + y, 1, 3);
        g2d.fillRect(1 + x, 14 + y, 1, 2);
        g2d.fillRect(-1 + x, 14 + y, 1, 1);
        g2d.fillRect(6 + x, 15 + y, 1, 2);
    }
}
