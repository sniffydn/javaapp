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
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class LongWavy3 extends SuperHLong
{

    public LongWavy3()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongWavy3(int step, int dir)
    {
        super(step, dir);
    }

    public LongWavy3(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(0, 0, 0,0,0);
        y--;
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(103 + x, 20 + y, 1, 2);
            g2d.fillRect(101 + x, 20 + y, 2, 1);
            g2d.fillRect(106 + x, 21 + y, 1, 2);
            g2d.fillRect(105 + x, 21 + y, 1, 2);
            g2d.fillRect(104 + x, 21 + y, 1, 1);
            g2d.fillRect(99 + x, 21 + y, 2, 1);
            g2d.fillRect(99 + x, 22 + y, 1, 1);
            g2d.fillRect(107 + x, 23 + y, 1, 1);
            g2d.fillRect(100 + x, 23 + y, 1, 1);
            g2d.fillRect(108 + x, 24 + y, 1, 1);
            g2d.fillRect(101 + x, 24 + y, 2, 1);
            g2d.fillRect(109 + x, 25 + y, 2, 1);
            g2d.fillRect(103 + x, 25 + y, 2, 1);
            g2d.fillRect(111 + x, 26 + y, 1, 1);
            g2d.fillRect(105 + x, 26 + y, 3, 1);
            g2d.fillRect(112 + x, 27 + y, 1, 1);
            g2d.fillRect(108 + x, 27 + y, 2, 1);
            g2d.fillRect(113 + x, 28 + y, 1, 1);
            g2d.fillRect(110 + x, 28 + y, 1, 1);
            g2d.fillRect(114 + x, 29 + y, 1, 1);
            g2d.fillRect(111 + x, 29 + y, 1, 1);
            g2d.fillRect(115 + x, 30 + y, 1, 1);
            g2d.fillRect(112 + x, 30 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(102 + x, 21 + y, 1, 2);
            g2d.fillRect(101 + x, 21 + y, 1, 3);
            g2d.fillRect(100 + x, 22 + y, 1, 1);
            g2d.fillRect(112 + x, 29 + y, 2, 1);
            g2d.fillRect(114 + x, 30 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(104 + x, 22 + y, 1, 2);
            g2d.fillRect(103 + x, 22 + y, 1, 3);
            g2d.fillRect(105 + x, 23 + y, 1, 1);
            g2d.fillRect(102 + x, 23 + y, 1, 1);
            g2d.fillRect(110 + x, 26 + y, 1, 2);
            g2d.fillRect(109 + x, 26 + y, 1, 1);
            g2d.fillRect(111 + x, 27 + y, 1, 2);
            g2d.fillRect(112 + x, 28 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(106 + x, 23 + y, 1, 2);
            g2d.fillRect(105 + x, 24 + y, 1, 2);
            g2d.fillRect(104 + x, 24 + y, 1, 1);
            g2d.fillRect(108 + x, 25 + y, 1, 2);
            g2d.fillRect(107 + x, 25 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(107 + x, 24 + y, 1, 1);
            g2d.fillRect(106 + x, 25 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(112 + x, 20 + y, 1, 2);
            g2d.fillRect(113 + x, 20 + y, 2, 1);
            g2d.fillRect(109 + x, 21 + y, 1, 2);
            g2d.fillRect(110 + x, 21 + y, 1, 2);
            g2d.fillRect(111 + x, 21 + y, 1, 1);
            g2d.fillRect(115 + x, 21 + y, 2, 1);
            g2d.fillRect(116 + x, 22 + y, 1, 1);
            g2d.fillRect(108 + x, 23 + y, 1, 1);
            g2d.fillRect(115 + x, 23 + y, 1, 1);
            g2d.fillRect(107 + x, 24 + y, 1, 1);
            g2d.fillRect(113 + x, 24 + y, 2, 1);
            g2d.fillRect(105 + x, 25 + y, 2, 1);
            g2d.fillRect(111 + x, 25 + y, 2, 1);
            g2d.fillRect(104 + x, 26 + y, 1, 1);
            g2d.fillRect(108 + x, 26 + y, 3, 1);
            g2d.fillRect(103 + x, 27 + y, 1, 1);
            g2d.fillRect(106 + x, 27 + y, 2, 1);
            g2d.fillRect(102 + x, 28 + y, 1, 1);
            g2d.fillRect(105 + x, 28 + y, 1, 1);
            g2d.fillRect(101 + x, 29 + y, 1, 1);
            g2d.fillRect(104 + x, 29 + y, 1, 1);
            g2d.fillRect(100 + x, 30 + y, 1, 1);
            g2d.fillRect(102 + x, 30 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(113 + x, 21 + y, 1, 2);
            g2d.fillRect(114 + x, 21 + y, 1, 3);
            g2d.fillRect(115 + x, 22 + y, 1, 1);
            g2d.fillRect(102 + x, 29 + y, 2, 1);
            g2d.fillRect(101 + x, 30 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(111 + x, 22 + y, 1, 2);
            g2d.fillRect(112 + x, 22 + y, 1, 3);
            g2d.fillRect(110 + x, 23 + y, 1, 1);
            g2d.fillRect(113 + x, 23 + y, 1, 1);
            g2d.fillRect(105 + x, 26 + y, 1, 2);
            g2d.fillRect(106 + x, 26 + y, 1, 1);
            g2d.fillRect(104 + x, 27 + y, 1, 2);
            g2d.fillRect(103 + x, 28 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(109 + x, 23 + y, 1, 2);
            g2d.fillRect(110 + x, 24 + y, 1, 2);
            g2d.fillRect(111 + x, 24 + y, 1, 1);
            g2d.fillRect(107 + x, 25 + y, 1, 2);
            g2d.fillRect(108 + x, 25 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(108 + x, 24 + y, 1, 1);
            g2d.fillRect(109 + x, 25 + y, 1, 1);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(0, 0, 0,0,0);
        if(direction.equalsIgnoreCase("left"))
        {

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(112 + x, 11 + y, 1, 2);
            g2d.fillRect(106 + x, 11 + y, 6, 1);
            g2d.fillRect(103 + x, 11 + y, 2, 1);
            g2d.fillRect(114 + x, 12 + y, 1, 2);
            g2d.fillRect(113 + x, 12 + y, 1, 2);
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(106 + x, 12 + y, 1, 1);
            g2d.fillRect(102 + x, 12 + y, 1, 3);
            g2d.fillRect(101 + x, 12 + y, 1, 3);
            g2d.fillRect(100 + x, 12 + y, 1, 3);
            g2d.fillRect(115 + x, 13 + y, 1, 3);
            g2d.fillRect(107 + x, 13 + y, 1, 2);
            g2d.fillRect(105 + x, 13 + y, 1, 1);
            g2d.fillRect(98 + x, 13 + y, 2, 1);
            g2d.fillRect(116 + x, 14 + y, 1, 4);
            g2d.fillRect(110 + x, 14 + y, 1, 3);
            g2d.fillRect(109 + x, 14 + y, 1, 3);
            g2d.fillRect(108 + x, 14 + y, 1, 5);
            g2d.fillRect(103 + x, 14 + y, 2, 1);
            g2d.fillRect(97 + x, 14 + y, 2, 1);
            g2d.fillRect(117 + x, 15 + y, 2, 1);
            g2d.fillRect(111 + x, 15 + y, 4, 1);
            g2d.fillRect(106 + x, 15 + y, 1, 3);
            g2d.fillRect(103 + x, 15 + y, 1, 1);
            g2d.fillRect(97 + x, 15 + y, 1, 2);
            g2d.fillRect(96 + x, 15 + y, 1, 2);
            g2d.fillRect(117 + x, 16 + y, 1, 4);
            g2d.fillRect(113 + x, 16 + y, 1, 3);
            g2d.fillRect(112 + x, 16 + y, 1, 2);
            g2d.fillRect(111 + x, 16 + y, 1, 1);
            g2d.fillRect(107 + x, 16 + y, 1, 2);
            g2d.fillRect(105 + x, 16 + y, 1, 2);
            g2d.fillRect(104 + x, 16 + y, 1, 5);
            g2d.fillRect(98 + x, 16 + y, 3, 1);
            g2d.fillRect(119 + x, 17 + y, 1, 11);
            g2d.fillRect(103 + x, 17 + y, 1, 3);
            g2d.fillRect(102 + x, 17 + y, 1, 3);
            g2d.fillRect(101 + x, 17 + y, 1, 3);
            g2d.fillRect(95 + x, 17 + y, 1, 4);
            g2d.fillRect(118 + x, 18 + y, 1, 4);
            g2d.fillRect(114 + x, 18 + y, 1, 2);
            g2d.fillRect(109 + x, 18 + y, 1, 2);
            g2d.fillRect(100 + x, 18 + y, 1, 3);
            g2d.fillRect(96 + x, 18 + y, 4, 1);
            g2d.fillRect(115 + x, 19 + y, 1, 3);
            g2d.fillRect(110 + x, 19 + y, 1, 2);
            g2d.fillRect(96 + x, 19 + y, 1, 1);
            g2d.fillRect(94 + x, 19 + y, 1, 5);
            g2d.fillRect(111 + x, 20 + y, 1, 2);
            g2d.fillRect(105 + x, 20 + y, 2, 1);
            g2d.fillRect(98 + x, 20 + y, 2, 1);
            g2d.fillRect(112 + x, 21 + y, 1, 3);
            g2d.fillRect(107 + x, 21 + y, 1, 2);
            g2d.fillRect(97 + x, 21 + y, 2, 1);
            g2d.fillRect(93 + x, 21 + y, 1, 1);
            g2d.fillRect(120 + x, 22 + y, 1, 4);
            g2d.fillRect(116 + x, 22 + y, 1, 3);
            g2d.fillRect(108 + x, 22 + y, 1, 2);
            g2d.fillRect(97 + x, 22 + y, 1, 1);
            g2d.fillRect(95 + x, 22 + y, 1, 3);
            g2d.fillRect(92 + x, 22 + y, 1, 3);
            g2d.fillRect(121 + x, 23 + y, 1, 5);
            g2d.fillRect(113 + x, 23 + y, 1, 5);
            g2d.fillRect(109 + x, 23 + y, 1, 2);
            g2d.fillRect(117 + x, 24 + y, 1, 1);
            g2d.fillRect(115 + x, 24 + y, 1, 9);
            g2d.fillRect(111 + x, 24 + y, 1, 2);
            g2d.fillRect(110 + x, 24 + y, 1, 1);
            g2d.fillRect(96 + x, 24 + y, 1, 10);
            g2d.fillRect(93 + x, 24 + y, 1, 10);
            g2d.fillRect(122 + x, 25 + y, 1, 3);
            g2d.fillRect(114 + x, 25 + y, 1, 4);
            g2d.fillRect(112 + x, 25 + y, 1, 2);
            g2d.fillRect(94 + x, 26 + y, 1, 5);
            g2d.fillRect(120 + x, 28 + y, 1, 5);
            g2d.fillRect(116 + x, 28 + y, 1, 5);
            g2d.fillRect(95 + x, 28 + y, 1, 6);
            g2d.fillRect(121 + x, 29 + y, 1, 1);
            g2d.fillRect(117 + x, 29 + y, 1, 3);
            g2d.fillRect(113 + x, 29 + y, 1, 4);
            g2d.fillRect(112 + x, 29 + y, 1, 4);
            g2d.fillRect(114 + x, 30 + y, 1, 3);
            g2d.fillRect(92 + x, 31 + y, 1, 3);
            g2d.fillRect(111 + x, 33 + y, 1, 6);
            g2d.fillRect(97 + x, 33 + y, 1, 2);
            g2d.fillRect(94 + x, 33 + y, 1, 1);
            g2d.fillRect(98 + x, 34 + y, 1, 5);
            g2d.fillRect(110 + x, 35 + y, 1, 5);
            g2d.fillRect(99 + x, 35 + y, 1, 5);
            g2d.fillRect(100 + x, 36 + y, 1, 4);
            g2d.fillRect(101 + x, 37 + y, 1, 3);
            g2d.fillRect(102 + x, 38 + y, 1, 2);
            g2d.fillRect(97 + x, 38 + y, 1, 1);
            g2d.fillRect(103 + x, 39 + y, 2, 1);
            g2d.fillRect(101 + x, 40 + y, 2, 1);
            g2d.fillRect(111 + x, 39 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(111 + x, 12 + y, 1, 2);
            g2d.fillRect(109 + x, 12 + y, 2, 1);
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(112 + x, 13 + y, 1, 2);
            g2d.fillRect(108 + x, 13 + y, 1, 1);
            g2d.fillRect(106 + x, 13 + y, 1, 2);
            g2d.fillRect(113 + x, 14 + y, 2, 1);
            g2d.fillRect(105 + x, 14 + y, 1, 2);
            g2d.fillRect(104 + x, 15 + y, 1, 1);
            g2d.fillRect(103 + x, 16 + y, 1, 1);
            g2d.fillRect(109 + x, 17 + y, 2, 1);
            g2d.fillRect(98 + x, 17 + y, 3, 1);
            g2d.fillRect(116 + x, 18 + y, 1, 1);
            g2d.fillRect(107 + x, 18 + y, 1, 3);
            g2d.fillRect(106 + x, 18 + y, 1, 2);
            g2d.fillRect(105 + x, 18 + y, 1, 2);
            g2d.fillRect(97 + x, 19 + y, 3, 1);
            g2d.fillRect(97 + x, 20 + y, 1, 1);
            g2d.fillRect(114 + x, 21 + y, 1, 4);
            g2d.fillRect(108 + x, 21 + y, 1, 1);
            g2d.fillRect(117 + x, 22 + y, 1, 1);
            g2d.fillRect(115 + x, 22 + y, 1, 2);
            g2d.fillRect(113 + x, 22 + y, 1, 1);
            g2d.fillRect(109 + x, 22 + y, 1, 1);
            g2d.fillRect(96 + x, 22 + y, 1, 2);
            g2d.fillRect(93 + x, 22 + y, 1, 2);
            g2d.fillRect(110 + x, 23 + y, 2, 1);
            g2d.fillRect(112 + x, 24 + y, 1, 1);
            g2d.fillRect(116 + x, 25 + y, 1, 3);
            g2d.fillRect(118 + x, 26 + y, 1, 4);
            g2d.fillRect(119 + x, 28 + y, 1, 5);
            g2d.fillRect(112 + x, 28 + y, 2, 1);
            g2d.fillRect(114 + x, 29 + y, 1, 1);
            g2d.fillRect(97 + x, 35 + y, 1, 3);
            g2d.fillRect(97 + x, 39 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(103 + x, 12 + y, 1, 1);
            g2d.fillRect(119 + x, 16 + y, 1, 1);
            g2d.fillRect(92 + x, 25 + y, 1, 1);
            g2d.fillRect(121 + x, 28 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(105 + x, 11 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(104 + x, 12 + y, 2, 1);
            g2d.fillRect(109 + x, 13 + y, 2, 1);
            g2d.fillRect(103 + x, 13 + y, 2, 1);
            g2d.fillRect(111 + x, 14 + y, 1, 1);
            g2d.fillRect(99 + x, 14 + y, 1, 2);
            g2d.fillRect(107 + x, 15 + y, 1, 1);
            g2d.fillRect(102 + x, 15 + y, 1, 2);
            g2d.fillRect(101 + x, 15 + y, 1, 2);
            g2d.fillRect(100 + x, 15 + y, 1, 1);
            g2d.fillRect(98 + x, 15 + y, 1, 1);
            g2d.fillRect(115 + x, 16 + y, 1, 2);
            g2d.fillRect(114 + x, 16 + y, 1, 2);
            g2d.fillRect(111 + x, 17 + y, 1, 2);
            g2d.fillRect(96 + x, 17 + y, 2, 1);
            g2d.fillRect(112 + x, 18 + y, 1, 1);
            g2d.fillRect(110 + x, 18 + y, 1, 1);
            g2d.fillRect(116 + x, 19 + y, 1, 3);
            g2d.fillRect(108 + x, 19 + y, 1, 2);
            g2d.fillRect(117 + x, 20 + y, 1, 2);
            g2d.fillRect(112 + x, 20 + y, 3, 1);
            g2d.fillRect(96 + x, 20 + y, 1, 2);
            g2d.fillRect(113 + x, 21 + y, 1, 1);
            g2d.fillRect(110 + x, 21 + y, 1, 2);
            g2d.fillRect(109 + x, 21 + y, 1, 1);
            g2d.fillRect(95 + x, 21 + y, 1, 1);
            g2d.fillRect(118 + x, 22 + y, 1, 4);
            g2d.fillRect(111 + x, 22 + y, 1, 1);
            g2d.fillRect(117 + x, 23 + y, 1, 1);
            g2d.fillRect(94 + x, 24 + y, 1, 2);
            g2d.fillRect(117 + x, 25 + y, 1, 4);
            g2d.fillRect(95 + x, 25 + y, 1, 3);
            g2d.fillRect(112 + x, 27 + y, 1, 1);
            g2d.fillRect(118 + x, 30 + y, 1, 3);
            g2d.fillRect(94 + x, 31 + y, 1, 2);
            g2d.fillRect(117 + x, 32 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(115 + x, 18 + y, 1, 1);
            g2d.fillRect(111 + x, 19 + y, 3, 1);
            g2d.fillRect(109 + x, 20 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(103 + x, 11 + y, 1, 2);
            g2d.fillRect(104 + x, 11 + y, 6, 1);
            g2d.fillRect(111 + x, 11 + y, 2, 1);
            g2d.fillRect(101 + x, 12 + y, 1, 2);
            g2d.fillRect(102 + x, 12 + y, 1, 2);
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(109 + x, 12 + y, 1, 1);
            g2d.fillRect(113 + x, 12 + y, 1, 3);
            g2d.fillRect(114 + x, 12 + y, 1, 3);
            g2d.fillRect(115 + x, 12 + y, 1, 3);
            g2d.fillRect(100 + x, 13 + y, 1, 3);
            g2d.fillRect(108 + x, 13 + y, 1, 2);
            g2d.fillRect(110 + x, 13 + y, 1, 1);
            g2d.fillRect(116 + x, 13 + y, 2, 1);
            g2d.fillRect(99 + x, 14 + y, 1, 4);
            g2d.fillRect(105 + x, 14 + y, 1, 3);
            g2d.fillRect(106 + x, 14 + y, 1, 3);
            g2d.fillRect(107 + x, 14 + y, 1, 5);
            g2d.fillRect(111 + x, 14 + y, 2, 1);
            g2d.fillRect(117 + x, 14 + y, 2, 1);
            g2d.fillRect(97 + x, 15 + y, 2, 1);
            g2d.fillRect(101 + x, 15 + y, 4, 1);
            g2d.fillRect(109 + x, 15 + y, 1, 3);
            g2d.fillRect(112 + x, 15 + y, 1, 1);
            g2d.fillRect(118 + x, 15 + y, 1, 2);
            g2d.fillRect(119 + x, 15 + y, 1, 2);
            g2d.fillRect(98 + x, 16 + y, 1, 4);
            g2d.fillRect(102 + x, 16 + y, 1, 3);
            g2d.fillRect(103 + x, 16 + y, 1, 2);
            g2d.fillRect(104 + x, 16 + y, 1, 1);
            g2d.fillRect(108 + x, 16 + y, 1, 2);
            g2d.fillRect(110 + x, 16 + y, 1, 2);
            g2d.fillRect(111 + x, 16 + y, 1, 5);
            g2d.fillRect(115 + x, 16 + y, 3, 1);
            g2d.fillRect(96 + x, 17 + y, 1, 11);
            g2d.fillRect(112 + x, 17 + y, 1, 3);
            g2d.fillRect(113 + x, 17 + y, 1, 3);
            g2d.fillRect(114 + x, 17 + y, 1, 3);
            g2d.fillRect(120 + x, 17 + y, 1, 4);
            g2d.fillRect(97 + x, 18 + y, 1, 4);
            g2d.fillRect(101 + x, 18 + y, 1, 2);
            g2d.fillRect(106 + x, 18 + y, 1, 2);
            g2d.fillRect(115 + x, 18 + y, 1, 3);
            g2d.fillRect(116 + x, 18 + y, 4, 1);
            g2d.fillRect(100 + x, 19 + y, 1, 3);
            g2d.fillRect(105 + x, 19 + y, 1, 2);
            g2d.fillRect(119 + x, 19 + y, 1, 1);
            g2d.fillRect(121 + x, 19 + y, 1, 5);
            g2d.fillRect(104 + x, 20 + y, 1, 2);
            g2d.fillRect(109 + x, 20 + y, 2, 1);
            g2d.fillRect(116 + x, 20 + y, 2, 1);
            g2d.fillRect(103 + x, 21 + y, 1, 3);
            g2d.fillRect(108 + x, 21 + y, 1, 2);
            g2d.fillRect(117 + x, 21 + y, 2, 1);
            g2d.fillRect(122 + x, 21 + y, 1, 1);
            g2d.fillRect(95 + x, 22 + y, 1, 4);
            g2d.fillRect(99 + x, 22 + y, 1, 3);
            g2d.fillRect(107 + x, 22 + y, 1, 2);
            g2d.fillRect(118 + x, 22 + y, 1, 1);
            g2d.fillRect(120 + x, 22 + y, 1, 3);
            g2d.fillRect(123 + x, 22 + y, 1, 3);
            g2d.fillRect(94 + x, 23 + y, 1, 5);
            g2d.fillRect(102 + x, 23 + y, 1, 5);
            g2d.fillRect(106 + x, 23 + y, 1, 2);
            g2d.fillRect(98 + x, 24 + y, 1, 1);
            g2d.fillRect(100 + x, 24 + y, 1, 9);
            g2d.fillRect(104 + x, 24 + y, 1, 2);
            g2d.fillRect(105 + x, 24 + y, 1, 1);
            g2d.fillRect(119 + x, 24 + y, 1, 10);
            g2d.fillRect(122 + x, 24 + y, 1, 10);
            g2d.fillRect(93 + x, 25 + y, 1, 3);
            g2d.fillRect(101 + x, 25 + y, 1, 4);
            g2d.fillRect(103 + x, 25 + y, 1, 2);
            g2d.fillRect(121 + x, 26 + y, 1, 5);
            g2d.fillRect(95 + x, 28 + y, 1, 5);
            g2d.fillRect(99 + x, 28 + y, 1, 5);
            g2d.fillRect(120 + x, 28 + y, 1, 6);
            g2d.fillRect(94 + x, 29 + y, 1, 1);
            g2d.fillRect(98 + x, 29 + y, 1, 3);
            g2d.fillRect(102 + x, 29 + y, 1, 4);
            g2d.fillRect(103 + x, 29 + y, 1, 4);
            g2d.fillRect(101 + x, 30 + y, 1, 3);
            g2d.fillRect(123 + x, 31 + y, 1, 3);
            g2d.fillRect(104 + x, 33 + y, 1, 6);
            g2d.fillRect(118 + x, 33 + y, 1, 2);
            g2d.fillRect(121 + x, 33 + y, 1, 1);
            g2d.fillRect(117 + x, 34 + y, 1, 5);
            g2d.fillRect(105 + x, 35 + y, 1, 5);
            g2d.fillRect(116 + x, 35 + y, 1, 5);
            g2d.fillRect(115 + x, 36 + y, 1, 4);
            g2d.fillRect(114 + x, 37 + y, 1, 3);
            g2d.fillRect(113 + x, 38 + y, 1, 2);
            g2d.fillRect(118 + x, 38 + y, 1, 1);
            g2d.fillRect(111 + x, 39 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(104 + x, 12 + y, 1, 2);
            g2d.fillRect(105 + x, 12 + y, 2, 1);
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(103 + x, 13 + y, 1, 2);
            g2d.fillRect(107 + x, 13 + y, 1, 1);
            g2d.fillRect(109 + x, 13 + y, 1, 2);
            g2d.fillRect(101 + x, 14 + y, 2, 1);
            g2d.fillRect(110 + x, 14 + y, 1, 2);
            g2d.fillRect(111 + x, 15 + y, 1, 1);
            g2d.fillRect(112 + x, 16 + y, 1, 1);
            g2d.fillRect(105 + x, 17 + y, 2, 1);
            g2d.fillRect(115 + x, 17 + y, 3, 1);
            g2d.fillRect(99 + x, 18 + y, 1, 1);
            g2d.fillRect(108 + x, 18 + y, 1, 3);
            g2d.fillRect(109 + x, 18 + y, 1, 2);
            g2d.fillRect(110 + x, 18 + y, 1, 2);
            g2d.fillRect(116 + x, 19 + y, 3, 1);
            g2d.fillRect(118 + x, 20 + y, 1, 1);
            g2d.fillRect(101 + x, 21 + y, 1, 4);
            g2d.fillRect(107 + x, 21 + y, 1, 1);
            g2d.fillRect(98 + x, 22 + y, 1, 1);
            g2d.fillRect(100 + x, 22 + y, 1, 2);
            g2d.fillRect(102 + x, 22 + y, 1, 1);
            g2d.fillRect(106 + x, 22 + y, 1, 1);
            g2d.fillRect(119 + x, 22 + y, 1, 2);
            g2d.fillRect(122 + x, 22 + y, 1, 2);
            g2d.fillRect(104 + x, 23 + y, 2, 1);
            g2d.fillRect(103 + x, 24 + y, 1, 1);
            g2d.fillRect(99 + x, 25 + y, 1, 3);
            g2d.fillRect(97 + x, 26 + y, 1, 4);
            g2d.fillRect(96 + x, 28 + y, 1, 5);
            g2d.fillRect(102 + x, 28 + y, 2, 1);
            g2d.fillRect(101 + x, 29 + y, 1, 1);
            g2d.fillRect(118 + x, 35 + y, 1, 3);
            g2d.fillRect(117 + x, 39 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(112 + x, 12 + y, 1, 1);
            g2d.fillRect(96 + x, 16 + y, 1, 1);
            g2d.fillRect(123 + x, 25 + y, 1, 1);
            g2d.fillRect(94 + x, 28 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(110 + x, 11 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(110 + x, 12 + y, 2, 1);
            g2d.fillRect(105 + x, 13 + y, 2, 1);
            g2d.fillRect(111 + x, 13 + y, 2, 1);
            g2d.fillRect(104 + x, 14 + y, 1, 1);
            g2d.fillRect(116 + x, 14 + y, 1, 2);
            g2d.fillRect(108 + x, 15 + y, 1, 1);
            g2d.fillRect(113 + x, 15 + y, 1, 2);
            g2d.fillRect(114 + x, 15 + y, 1, 2);
            g2d.fillRect(115 + x, 15 + y, 1, 1);
            g2d.fillRect(117 + x, 15 + y, 1, 1);
            g2d.fillRect(100 + x, 16 + y, 1, 2);
            g2d.fillRect(101 + x, 16 + y, 1, 2);
            g2d.fillRect(104 + x, 17 + y, 1, 2);
            g2d.fillRect(118 + x, 17 + y, 2, 1);
            g2d.fillRect(103 + x, 18 + y, 1, 1);
            g2d.fillRect(105 + x, 18 + y, 1, 1);
            g2d.fillRect(99 + x, 19 + y, 1, 3);
            g2d.fillRect(107 + x, 19 + y, 1, 2);
            g2d.fillRect(98 + x, 20 + y, 1, 2);
            g2d.fillRect(101 + x, 20 + y, 3, 1);
            g2d.fillRect(119 + x, 20 + y, 1, 2);
            g2d.fillRect(102 + x, 21 + y, 1, 1);
            g2d.fillRect(105 + x, 21 + y, 1, 2);
            g2d.fillRect(106 + x, 21 + y, 1, 1);
            g2d.fillRect(120 + x, 21 + y, 1, 1);
            g2d.fillRect(97 + x, 22 + y, 1, 4);
            g2d.fillRect(104 + x, 22 + y, 1, 1);
            g2d.fillRect(98 + x, 23 + y, 1, 1);
            g2d.fillRect(121 + x, 24 + y, 1, 2);
            g2d.fillRect(98 + x, 25 + y, 1, 4);
            g2d.fillRect(120 + x, 25 + y, 1, 3);
            g2d.fillRect(103 + x, 27 + y, 1, 1);
            g2d.fillRect(97 + x, 30 + y, 1, 3);
            g2d.fillRect(121 + x, 31 + y, 1, 2);
            g2d.fillRect(98 + x, 32 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(100 + x, 18 + y, 1, 1);
            g2d.fillRect(102 + x, 19 + y, 3, 1);
            g2d.fillRect(106 + x, 20 + y, 1, 1);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(0, 0, 0,0,0);
        if(y == 1)
            y = 0;

        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(121 + x, 33 + y, 1, 14);
            g2d.fillRect(120 + x, 33 + y, 1, 11);
            g2d.fillRect(117 + x, 33 + y, 1, 4);
            g2d.fillRect(116 + x, 33 + y, 1, 2);
            g2d.fillRect(115 + x, 33 + y, 1, 26);
            g2d.fillRect(114 + x, 33 + y, 1, 5);
            g2d.fillRect(113 + x, 33 + y, 1, 5);
            g2d.fillRect(112 + x, 33 + y, 1, 12);
            g2d.fillRect(96 + x, 34 + y, 1, 2);
            g2d.fillRect(95 + x, 34 + y, 1, 2);
            g2d.fillRect(92 + x, 34 + y, 3, 1);
            g2d.fillRect(118 + x, 35 + y, 1, 5);
            g2d.fillRect(93 + x, 35 + y, 1, 34);
            g2d.fillRect(119 + x, 36 + y, 1, 10);
            g2d.fillRect(116 + x, 36 + y, 1, 1);
            g2d.fillRect(92 + x, 36 + y, 1, 2);
            g2d.fillRect(94 + x, 37 + y, 1, 3);
            g2d.fillRect(96 + x, 39 + y, 1, 2);
            g2d.fillRect(116 + x, 40 + y, 1, 3);
            g2d.fillRect(99 + x, 40 + y, 1, 8);
            g2d.fillRect(95 + x, 40 + y, 1, 4);
            g2d.fillRect(113 + x, 41 + y, 1, 2);
            g2d.fillRect(110 + x, 41 + y, 1, 1);
            g2d.fillRect(101 + x, 41 + y, 1, 3);
            g2d.fillRect(100 + x, 41 + y, 1, 3);
            g2d.fillRect(98 + x, 41 + y, 1, 2);
            g2d.fillRect(117 + x, 42 + y, 1, 1);
            g2d.fillRect(114 + x, 42 + y, 1, 1);
            g2d.fillRect(111 + x, 42 + y, 1, 4);
            g2d.fillRect(102 + x, 42 + y, 1, 1);
            g2d.fillRect(122 + x, 43 + y, 1, 2);
            g2d.fillRect(113 + x, 44 + y, 1, 5);
            g2d.fillRect(103 + x, 44 + y, 1, 1);
            g2d.fillRect(98 + x, 44 + y, 1, 3);
            g2d.fillRect(94 + x, 44 + y, 1, 5);
            g2d.fillRect(92 + x, 44 + y, 1, 2);
            g2d.fillRect(110 + x, 45 + y, 1, 1);
            g2d.fillRect(120 + x, 46 + y, 1, 13);
            g2d.fillRect(116 + x, 46 + y, 1, 7);
            g2d.fillRect(114 + x, 46 + y, 1, 10);
            g2d.fillRect(95 + x, 46 + y, 1, 8);
            g2d.fillRect(117 + x, 47 + y, 1, 3);
            g2d.fillRect(96 + x, 47 + y, 1, 7);
            g2d.fillRect(92 + x, 47 + y, 1, 1);
            g2d.fillRect(112 + x, 48 + y, 1, 2);
            g2d.fillRect(100 + x, 48 + y, 1, 2);
            g2d.fillRect(101 + x, 49 + y, 1, 1);
            g2d.fillRect(98 + x, 49 + y, 1, 2);
            g2d.fillRect(92 + x, 49 + y, 1, 5);
            g2d.fillRect(111 + x, 50 + y, 1, 2);
            g2d.fillRect(99 + x, 50 + y, 1, 2);
            g2d.fillRect(121 + x, 51 + y, 1, 6);
            g2d.fillRect(117 + x, 51 + y, 1, 15);
            g2d.fillRect(112 + x, 51 + y, 1, 2);
            g2d.fillRect(110 + x, 51 + y, 1, 1);
            g2d.fillRect(97 + x, 51 + y, 1, 2);
            g2d.fillRect(94 + x, 51 + y, 1, 2);
            g2d.fillRect(98 + x, 52 + y, 1, 5);
            g2d.fillRect(119 + x, 54 + y, 1, 2);
            g2d.fillRect(118 + x, 54 + y, 1, 1);
            g2d.fillRect(116 + x, 54 + y, 1, 1);
            g2d.fillRect(108 + x, 54 + y, 1, 1);
            g2d.fillRect(113 + x, 55 + y, 1, 1);
            g2d.fillRect(107 + x, 55 + y, 1, 1);
            g2d.fillRect(99 + x, 55 + y, 1, 10);
            g2d.fillRect(94 + x, 55 + y, 1, 2);
            g2d.fillRect(97 + x, 56 + y, 1, 1);
            g2d.fillRect(118 + x, 57 + y, 1, 1);
            g2d.fillRect(96 + x, 57 + y, 1, 2);
            g2d.fillRect(95 + x, 57 + y, 1, 4);
            g2d.fillRect(116 + x, 58 + y, 1, 2);
            g2d.fillRect(113 + x, 58 + y, 1, 2);
            g2d.fillRect(112 + x, 58 + y, 1, 4);
            g2d.fillRect(119 + x, 59 + y, 1, 2);
            g2d.fillRect(114 + x, 59 + y, 1, 1);
            g2d.fillRect(111 + x, 59 + y, 1, 4);
            g2d.fillRect(98 + x, 59 + y, 1, 2);
            g2d.fillRect(118 + x, 60 + y, 1, 2);
            g2d.fillRect(116 + x, 61 + y, 1, 3);
            g2d.fillRect(113 + x, 61 + y, 1, 5);
            g2d.fillRect(94 + x, 61 + y, 1, 2);
            g2d.fillRect(92 + x, 61 + y, 1, 3);
            g2d.fillRect(119 + x, 62 + y, 1, 7);
            g2d.fillRect(115 + x, 62 + y, 1, 2);
            g2d.fillRect(110 + x, 62 + y, 1, 1);
            g2d.fillRect(98 + x, 62 + y, 1, 2);
            g2d.fillRect(118 + x, 63 + y, 1, 3);
            g2d.fillRect(114 + x, 63 + y, 1, 3);
            g2d.fillRect(95 + x, 63 + y, 1, 1);
            g2d.fillRect(100 + x, 64 + y, 1, 3);
            g2d.fillRect(96 + x, 64 + y, 1, 4);
            g2d.fillRect(94 + x, 64 + y, 1, 2);
            g2d.fillRect(120 + x, 65 + y, 1, 2);
            g2d.fillRect(112 + x, 65 + y, 1, 2);
            g2d.fillRect(116 + x, 66 + y, 1, 2);
            g2d.fillRect(115 + x, 66 + y, 1, 4);
            g2d.fillRect(101 + x, 66 + y, 1, 1);
            g2d.fillRect(98 + x, 66 + y, 1, 2);
            g2d.fillRect(117 + x, 67 + y, 1, 4);
            g2d.fillRect(111 + x, 67 + y, 1, 2);
            g2d.fillRect(99 + x, 67 + y, 1, 2);
            g2d.fillRect(95 + x, 67 + y, 1, 3);
            g2d.fillRect(118 + x, 68 + y, 1, 3);
            g2d.fillRect(112 + x, 68 + y, 1, 2);
            g2d.fillRect(110 + x, 68 + y, 1, 1);
            g2d.fillRect(100 + x, 68 + y, 1, 1);
            g2d.fillRect(114 + x, 69 + y, 1, 1);
            g2d.fillRect(109 + x, 69 + y, 1, 1);
            g2d.fillRect(92 + x, 69 + y, 1, 1);
            g2d.fillRect(116 + x, 70 + y, 1, 2);
            g2d.fillRect(96 + x, 70 + y, 1, 2);
            g2d.fillRect(115 + x, 71 + y, 1, 2);
            g2d.fillRect(111 + x, 71 + y, 1, 1);
            g2d.fillRect(108 + x, 71 + y, 1, 2);
            g2d.fillRect(97 + x, 71 + y, 1, 1);
            g2d.fillRect(92 + x, 71 + y, 2, 1);
            g2d.fillRect(118 + x, 72 + y, 1, 1);
            g2d.fillRect(94 + x, 72 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(109 + x, 53 + y, 1, 1);
            g2d.fillRect(109 + x, 68 + y, 1, 1);
            g2d.fillRect(109 + x, 71 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(119 + x, 33 + y, 1, 2);
            g2d.fillRect(116 + x, 35 + y, 1, 1);
            g2d.fillRect(96 + x, 36 + y, 1, 3);
            g2d.fillRect(114 + x, 38 + y, 1, 3);
            g2d.fillRect(113 + x, 38 + y, 1, 3);
            g2d.fillRect(117 + x, 40 + y, 1, 1);
            g2d.fillRect(111 + x, 40 + y, 1, 2);
            g2d.fillRect(100 + x, 40 + y, 1, 1);
            g2d.fillRect(97 + x, 40 + y, 2, 1);
            g2d.fillRect(97 + x, 41 + y, 1, 1);
            g2d.fillRect(116 + x, 43 + y, 1, 3);
            g2d.fillRect(118 + x, 44 + y, 1, 4);
            g2d.fillRect(114 + x, 44 + y, 1, 2);
            g2d.fillRect(95 + x, 44 + y, 1, 2);
            g2d.fillRect(119 + x, 46 + y, 1, 7);
            g2d.fillRect(97 + x, 46 + y, 1, 1);
            g2d.fillRect(98 + x, 47 + y, 1, 1);
            g2d.fillRect(97 + x, 50 + y, 1, 1);
            g2d.fillRect(98 + x, 51 + y, 1, 1);
            g2d.fillRect(111 + x, 52 + y, 1, 2);
            g2d.fillRect(116 + x, 53 + y, 1, 1);
            g2d.fillRect(97 + x, 53 + y, 1, 3);
            g2d.fillRect(96 + x, 54 + y, 1, 3);
            g2d.fillRect(116 + x, 55 + y, 1, 3);
            g2d.fillRect(119 + x, 56 + y, 1, 2);
            g2d.fillRect(114 + x, 56 + y, 1, 2);
            g2d.fillRect(113 + x, 56 + y, 1, 2);
            g2d.fillRect(98 + x, 57 + y, 1, 2);
            g2d.fillRect(97 + x, 57 + y, 1, 3);
            g2d.fillRect(118 + x, 59 + y, 1, 1);
            g2d.fillRect(115 + x, 59 + y, 1, 1);
            g2d.fillRect(114 + x, 61 + y, 1, 2);
            g2d.fillRect(95 + x, 61 + y, 1, 2);
            g2d.fillRect(97 + x, 63 + y, 1, 1);
            g2d.fillRect(98 + x, 64 + y, 1, 1);
            g2d.fillRect(95 + x, 64 + y, 1, 1);
            g2d.fillRect(114 + x, 66 + y, 1, 3);
            g2d.fillRect(97 + x, 67 + y, 1, 2);
            g2d.fillRect(98 + x, 68 + y, 1, 1);
            g2d.fillRect(111 + x, 69 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(92 + x, 35 + y, 1, 1);
            g2d.fillRect(110 + x, 42 + y, 1, 1);
            g2d.fillRect(102 + x, 43 + y, 1, 2);
            g2d.fillRect(122 + x, 45 + y, 1, 1);
            g2d.fillRect(110 + x, 46 + y, 1, 1);
            g2d.fillRect(92 + x, 46 + y, 1, 1);
            g2d.fillRect(121 + x, 47 + y, 1, 1);
            g2d.fillRect(100 + x, 47 + y, 1, 1);
            g2d.fillRect(111 + x, 49 + y, 1, 1);
            g2d.fillRect(110 + x, 50 + y, 1, 1);
            g2d.fillRect(101 + x, 50 + y, 1, 1);
            g2d.fillRect(109 + x, 51 + y, 1, 2);
            g2d.fillRect(100 + x, 51 + y, 1, 1);
            g2d.fillRect(113 + x, 52 + y, 1, 1);
            g2d.fillRect(111 + x, 54 + y, 1, 1);
            g2d.fillRect(109 + x, 54 + y, 1, 1);
            g2d.fillRect(92 + x, 54 + y, 1, 1);
            g2d.fillRect(110 + x, 55 + y, 1, 1);
            g2d.fillRect(108 + x, 55 + y, 1, 1);
            g2d.fillRect(121 + x, 57 + y, 1, 1);
            g2d.fillRect(119 + x, 61 + y, 1, 1);
            g2d.fillRect(110 + x, 63 + y, 1, 1);
            g2d.fillRect(92 + x, 64 + y, 1, 1);
            g2d.fillRect(111 + x, 66 + y, 1, 1);
            g2d.fillRect(120 + x, 67 + y, 1, 1);
            g2d.fillRect(110 + x, 67 + y, 1, 1);
            g2d.fillRect(101 + x, 67 + y, 1, 1);
            g2d.fillRect(92 + x, 68 + y, 1, 1);
            g2d.fillRect(113 + x, 69 + y, 1, 1);
            g2d.fillRect(98 + x, 69 + y, 1, 1);
            g2d.fillRect(109 + x, 70 + y, 1, 1);
            g2d.fillRect(95 + x, 70 + y, 1, 1);
            g2d.fillRect(92 + x, 70 + y, 1, 1);
            g2d.fillRect(118 + x, 71 + y, 1, 1);
            g2d.fillRect(117 + x, 72 + y, 1, 1);
            g2d.fillRect(114 + x, 72 + y, 1, 1);
            g2d.fillRect(110 + x, 72 + y, 1, 1);
            g2d.fillRect(107 + x, 72 + y, 1, 1);
            g2d.fillRect(97 + x, 72 + y, 1, 1);
            g2d.fillRect(93 + x, 72 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(118 + x, 33 + y, 1, 2);
            g2d.fillRect(119 + x, 35 + y, 1, 1);
            g2d.fillRect(94 + x, 35 + y, 1, 2);
            g2d.fillRect(95 + x, 36 + y, 1, 4);
            g2d.fillRect(117 + x, 37 + y, 1, 3);
            g2d.fillRect(116 + x, 37 + y, 1, 3);
            g2d.fillRect(118 + x, 40 + y, 1, 4);
            g2d.fillRect(94 + x, 40 + y, 1, 4);
            g2d.fillRect(117 + x, 41 + y, 1, 1);
            g2d.fillRect(114 + x, 41 + y, 1, 1);
            g2d.fillRect(96 + x, 41 + y, 1, 6);
            g2d.fillRect(97 + x, 42 + y, 1, 4);
            g2d.fillRect(117 + x, 43 + y, 1, 4);
            g2d.fillRect(113 + x, 43 + y, 2, 1);
            g2d.fillRect(98 + x, 43 + y, 1, 1);
            g2d.fillRect(112 + x, 45 + y, 1, 3);
            g2d.fillRect(97 + x, 47 + y, 1, 3);
            g2d.fillRect(118 + x, 48 + y, 1, 6);
            g2d.fillRect(98 + x, 48 + y, 1, 1);
            g2d.fillRect(113 + x, 49 + y, 1, 3);
            g2d.fillRect(94 + x, 49 + y, 1, 2);
            g2d.fillRect(117 + x, 50 + y, 1, 1);
            g2d.fillRect(112 + x, 50 + y, 1, 1);
            g2d.fillRect(119 + x, 53 + y, 1, 1);
            g2d.fillRect(112 + x, 53 + y, 2, 1);
            g2d.fillRect(94 + x, 53 + y, 1, 2);
            g2d.fillRect(112 + x, 54 + y, 1, 1);
            g2d.fillRect(95 + x, 54 + y, 1, 3);
            g2d.fillRect(118 + x, 55 + y, 1, 2);
            g2d.fillRect(94 + x, 57 + y, 1, 4);
            g2d.fillRect(118 + x, 58 + y, 2, 1);
            g2d.fillRect(114 + x, 58 + y, 1, 1);
            g2d.fillRect(96 + x, 59 + y, 1, 5);
            g2d.fillRect(113 + x, 60 + y, 4, 1);
            g2d.fillRect(97 + x, 60 + y, 1, 3);
            g2d.fillRect(115 + x, 61 + y, 1, 1);
            g2d.fillRect(98 + x, 61 + y, 1, 1);
            g2d.fillRect(112 + x, 62 + y, 1, 3);
            g2d.fillRect(94 + x, 63 + y, 1, 1);
            g2d.fillRect(116 + x, 64 + y, 1, 2);
            g2d.fillRect(115 + x, 64 + y, 1, 2);
            g2d.fillRect(97 + x, 64 + y, 1, 3);
            g2d.fillRect(98 + x, 65 + y, 1, 1);
            g2d.fillRect(95 + x, 65 + y, 1, 2);
            g2d.fillRect(113 + x, 66 + y, 1, 3);
            g2d.fillRect(94 + x, 66 + y, 1, 4);
            g2d.fillRect(112 + x, 67 + y, 1, 1);
            g2d.fillRect(116 + x, 68 + y, 1, 2);
            g2d.fillRect(96 + x, 68 + y, 1, 1);
            g2d.fillRect(97 + x, 69 + y, 1, 1);
            g2d.fillRect(115 + x, 70 + y, 1, 1);
            g2d.fillRect(112 + x, 70 + y, 2, 1);
            g2d.fillRect(114 + x, 71 + y, 1, 1);
            g2d.fillRect(112 + x, 71 + y, 1, 1);
            g2d.fillRect(98 + x, 71 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(94 + x, 33 + y, 1, 14);
            g2d.fillRect(95 + x, 33 + y, 1, 11);
            g2d.fillRect(98 + x, 33 + y, 1, 4);
            g2d.fillRect(99 + x, 33 + y, 1, 2);
            g2d.fillRect(100 + x, 33 + y, 1, 26);
            g2d.fillRect(101 + x, 33 + y, 1, 5);
            g2d.fillRect(102 + x, 33 + y, 1, 5);
            g2d.fillRect(103 + x, 33 + y, 1, 12);
            g2d.fillRect(119 + x, 34 + y, 1, 2);
            g2d.fillRect(120 + x, 34 + y, 1, 2);
            g2d.fillRect(121 + x, 34 + y, 3, 1);
            g2d.fillRect(97 + x, 35 + y, 1, 5);
            g2d.fillRect(122 + x, 35 + y, 1, 34);
            g2d.fillRect(96 + x, 36 + y, 1, 10);
            g2d.fillRect(99 + x, 36 + y, 1, 1);
            g2d.fillRect(123 + x, 36 + y, 1, 2);
            g2d.fillRect(121 + x, 37 + y, 1, 3);
            g2d.fillRect(119 + x, 39 + y, 1, 2);
            g2d.fillRect(99 + x, 40 + y, 1, 3);
            g2d.fillRect(116 + x, 40 + y, 1, 8);
            g2d.fillRect(120 + x, 40 + y, 1, 4);
            g2d.fillRect(102 + x, 41 + y, 1, 2);
            g2d.fillRect(105 + x, 41 + y, 1, 1);
            g2d.fillRect(114 + x, 41 + y, 1, 3);
            g2d.fillRect(115 + x, 41 + y, 1, 3);
            g2d.fillRect(117 + x, 41 + y, 1, 2);
            g2d.fillRect(98 + x, 42 + y, 1, 1);
            g2d.fillRect(101 + x, 42 + y, 1, 1);
            g2d.fillRect(104 + x, 42 + y, 1, 4);
            g2d.fillRect(113 + x, 42 + y, 1, 1);
            g2d.fillRect(93 + x, 43 + y, 1, 2);
            g2d.fillRect(102 + x, 44 + y, 1, 5);
            g2d.fillRect(112 + x, 44 + y, 1, 1);
            g2d.fillRect(117 + x, 44 + y, 1, 3);
            g2d.fillRect(121 + x, 44 + y, 1, 5);
            g2d.fillRect(123 + x, 44 + y, 1, 2);
            g2d.fillRect(105 + x, 45 + y, 1, 1);
            g2d.fillRect(95 + x, 46 + y, 1, 13);
            g2d.fillRect(99 + x, 46 + y, 1, 7);
            g2d.fillRect(101 + x, 46 + y, 1, 10);
            g2d.fillRect(120 + x, 46 + y, 1, 8);
            g2d.fillRect(98 + x, 47 + y, 1, 3);
            g2d.fillRect(119 + x, 47 + y, 1, 7);
            g2d.fillRect(123 + x, 47 + y, 1, 1);
            g2d.fillRect(103 + x, 48 + y, 1, 2);
            g2d.fillRect(115 + x, 48 + y, 1, 2);
            g2d.fillRect(114 + x, 49 + y, 1, 1);
            g2d.fillRect(117 + x, 49 + y, 1, 2);
            g2d.fillRect(123 + x, 49 + y, 1, 5);
            g2d.fillRect(104 + x, 50 + y, 1, 2);
            g2d.fillRect(116 + x, 50 + y, 1, 2);
            g2d.fillRect(94 + x, 51 + y, 1, 6);
            g2d.fillRect(98 + x, 51 + y, 1, 15);
            g2d.fillRect(103 + x, 51 + y, 1, 2);
            g2d.fillRect(105 + x, 51 + y, 1, 1);
            g2d.fillRect(118 + x, 51 + y, 1, 2);
            g2d.fillRect(121 + x, 51 + y, 1, 2);
            g2d.fillRect(117 + x, 52 + y, 1, 5);
            g2d.fillRect(96 + x, 54 + y, 1, 2);
            g2d.fillRect(97 + x, 54 + y, 1, 1);
            g2d.fillRect(99 + x, 54 + y, 1, 1);
            g2d.fillRect(107 + x, 54 + y, 1, 1);
            g2d.fillRect(102 + x, 55 + y, 1, 1);
            g2d.fillRect(108 + x, 55 + y, 1, 1);
            g2d.fillRect(116 + x, 55 + y, 1, 10);
            g2d.fillRect(121 + x, 55 + y, 1, 2);
            g2d.fillRect(118 + x, 56 + y, 1, 1);
            g2d.fillRect(97 + x, 57 + y, 1, 1);
            g2d.fillRect(119 + x, 57 + y, 1, 2);
            g2d.fillRect(120 + x, 57 + y, 1, 4);
            g2d.fillRect(99 + x, 58 + y, 1, 2);
            g2d.fillRect(102 + x, 58 + y, 1, 2);
            g2d.fillRect(103 + x, 58 + y, 1, 4);
            g2d.fillRect(96 + x, 59 + y, 1, 2);
            g2d.fillRect(101 + x, 59 + y, 1, 1);
            g2d.fillRect(104 + x, 59 + y, 1, 4);
            g2d.fillRect(117 + x, 59 + y, 1, 2);
            g2d.fillRect(97 + x, 60 + y, 1, 2);
            g2d.fillRect(99 + x, 61 + y, 1, 3);
            g2d.fillRect(102 + x, 61 + y, 1, 5);
            g2d.fillRect(121 + x, 61 + y, 1, 2);
            g2d.fillRect(123 + x, 61 + y, 1, 3);
            g2d.fillRect(96 + x, 62 + y, 1, 7);
            g2d.fillRect(100 + x, 62 + y, 1, 2);
            g2d.fillRect(105 + x, 62 + y, 1, 1);
            g2d.fillRect(117 + x, 62 + y, 1, 2);
            g2d.fillRect(97 + x, 63 + y, 1, 3);
            g2d.fillRect(101 + x, 63 + y, 1, 3);
            g2d.fillRect(120 + x, 63 + y, 1, 1);
            g2d.fillRect(115 + x, 64 + y, 1, 3);
            g2d.fillRect(119 + x, 64 + y, 1, 4);
            g2d.fillRect(121 + x, 64 + y, 1, 2);
            g2d.fillRect(95 + x, 65 + y, 1, 2);
            g2d.fillRect(103 + x, 65 + y, 1, 2);
            g2d.fillRect(99 + x, 66 + y, 1, 2);
            g2d.fillRect(100 + x, 66 + y, 1, 4);
            g2d.fillRect(114 + x, 66 + y, 1, 1);
            g2d.fillRect(117 + x, 66 + y, 1, 2);
            g2d.fillRect(98 + x, 67 + y, 1, 4);
            g2d.fillRect(104 + x, 67 + y, 1, 2);
            g2d.fillRect(116 + x, 67 + y, 1, 2);
            g2d.fillRect(120 + x, 67 + y, 1, 3);
            g2d.fillRect(97 + x, 68 + y, 1, 3);
            g2d.fillRect(103 + x, 68 + y, 1, 2);
            g2d.fillRect(105 + x, 68 + y, 1, 1);
            g2d.fillRect(115 + x, 68 + y, 1, 1);
            g2d.fillRect(101 + x, 69 + y, 1, 1);
            g2d.fillRect(106 + x, 69 + y, 1, 1);
            g2d.fillRect(123 + x, 69 + y, 1, 1);
            g2d.fillRect(99 + x, 70 + y, 1, 2);
            g2d.fillRect(119 + x, 70 + y, 1, 2);
            g2d.fillRect(100 + x, 71 + y, 1, 2);
            g2d.fillRect(104 + x, 71 + y, 1, 1);
            g2d.fillRect(107 + x, 71 + y, 1, 2);
            g2d.fillRect(118 + x, 71 + y, 1, 1);
            g2d.fillRect(122 + x, 71 + y, 2, 1);
            g2d.fillRect(97 + x, 72 + y, 1, 1);
            g2d.fillRect(121 + x, 72 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(106 + x, 53 + y, 1, 1);
            g2d.fillRect(106 + x, 68 + y, 1, 1);
            g2d.fillRect(106 + x, 71 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(96 + x, 33 + y, 1, 2);
            g2d.fillRect(99 + x, 35 + y, 1, 1);
            g2d.fillRect(119 + x, 36 + y, 1, 3);
            g2d.fillRect(101 + x, 38 + y, 1, 3);
            g2d.fillRect(102 + x, 38 + y, 1, 3);
            g2d.fillRect(98 + x, 40 + y, 1, 1);
            g2d.fillRect(104 + x, 40 + y, 1, 2);
            g2d.fillRect(115 + x, 40 + y, 1, 1);
            g2d.fillRect(117 + x, 40 + y, 2, 1);
            g2d.fillRect(118 + x, 41 + y, 1, 1);
            g2d.fillRect(99 + x, 43 + y, 1, 3);
            g2d.fillRect(97 + x, 44 + y, 1, 4);
            g2d.fillRect(101 + x, 44 + y, 1, 2);
            g2d.fillRect(120 + x, 44 + y, 1, 2);
            g2d.fillRect(96 + x, 46 + y, 1, 7);
            g2d.fillRect(118 + x, 46 + y, 1, 1);
            g2d.fillRect(117 + x, 47 + y, 1, 1);
            g2d.fillRect(118 + x, 50 + y, 1, 1);
            g2d.fillRect(117 + x, 51 + y, 1, 1);
            g2d.fillRect(104 + x, 52 + y, 1, 2);
            g2d.fillRect(99 + x, 53 + y, 1, 1);
            g2d.fillRect(118 + x, 53 + y, 1, 3);
            g2d.fillRect(119 + x, 54 + y, 1, 3);
            g2d.fillRect(99 + x, 55 + y, 1, 3);
            g2d.fillRect(96 + x, 56 + y, 1, 2);
            g2d.fillRect(101 + x, 56 + y, 1, 2);
            g2d.fillRect(102 + x, 56 + y, 1, 2);
            g2d.fillRect(117 + x, 57 + y, 1, 2);
            g2d.fillRect(118 + x, 57 + y, 1, 3);
            g2d.fillRect(97 + x, 59 + y, 1, 1);
            g2d.fillRect(100 + x, 59 + y, 1, 1);
            g2d.fillRect(101 + x, 61 + y, 1, 2);
            g2d.fillRect(120 + x, 61 + y, 1, 2);
            g2d.fillRect(118 + x, 63 + y, 1, 1);
            g2d.fillRect(117 + x, 64 + y, 1, 1);
            g2d.fillRect(120 + x, 64 + y, 1, 1);
            g2d.fillRect(101 + x, 66 + y, 1, 3);
            g2d.fillRect(118 + x, 67 + y, 1, 2);
            g2d.fillRect(117 + x, 68 + y, 1, 1);
            g2d.fillRect(104 + x, 69 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(123 + x, 35 + y, 1, 1);
            g2d.fillRect(105 + x, 42 + y, 1, 1);
            g2d.fillRect(113 + x, 43 + y, 1, 2);
            g2d.fillRect(93 + x, 45 + y, 1, 1);
            g2d.fillRect(105 + x, 46 + y, 1, 1);
            g2d.fillRect(123 + x, 46 + y, 1, 1);
            g2d.fillRect(94 + x, 47 + y, 1, 1);
            g2d.fillRect(115 + x, 47 + y, 1, 1);
            g2d.fillRect(104 + x, 49 + y, 1, 1);
            g2d.fillRect(105 + x, 50 + y, 1, 1);
            g2d.fillRect(114 + x, 50 + y, 1, 1);
            g2d.fillRect(106 + x, 51 + y, 1, 2);
            g2d.fillRect(115 + x, 51 + y, 1, 1);
            g2d.fillRect(102 + x, 52 + y, 1, 1);
            g2d.fillRect(104 + x, 54 + y, 1, 1);
            g2d.fillRect(106 + x, 54 + y, 1, 1);
            g2d.fillRect(123 + x, 54 + y, 1, 1);
            g2d.fillRect(105 + x, 55 + y, 1, 1);
            g2d.fillRect(107 + x, 55 + y, 1, 1);
            g2d.fillRect(94 + x, 57 + y, 1, 1);
            g2d.fillRect(96 + x, 61 + y, 1, 1);
            g2d.fillRect(105 + x, 63 + y, 1, 1);
            g2d.fillRect(123 + x, 64 + y, 1, 1);
            g2d.fillRect(104 + x, 66 + y, 1, 1);
            g2d.fillRect(95 + x, 67 + y, 1, 1);
            g2d.fillRect(105 + x, 67 + y, 1, 1);
            g2d.fillRect(114 + x, 67 + y, 1, 1);
            g2d.fillRect(123 + x, 68 + y, 1, 1);
            g2d.fillRect(102 + x, 69 + y, 1, 1);
            g2d.fillRect(117 + x, 69 + y, 1, 1);
            g2d.fillRect(106 + x, 70 + y, 1, 1);
            g2d.fillRect(120 + x, 70 + y, 1, 1);
            g2d.fillRect(123 + x, 70 + y, 1, 1);
            g2d.fillRect(97 + x, 71 + y, 1, 1);
            g2d.fillRect(98 + x, 72 + y, 1, 1);
            g2d.fillRect(101 + x, 72 + y, 1, 1);
            g2d.fillRect(105 + x, 72 + y, 1, 1);
            g2d.fillRect(108 + x, 72 + y, 1, 1);
            g2d.fillRect(118 + x, 72 + y, 1, 1);
            g2d.fillRect(122 + x, 72 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(97 + x, 33 + y, 1, 2);
            g2d.fillRect(96 + x, 35 + y, 1, 1);
            g2d.fillRect(121 + x, 35 + y, 1, 2);
            g2d.fillRect(120 + x, 36 + y, 1, 4);
            g2d.fillRect(98 + x, 37 + y, 1, 3);
            g2d.fillRect(99 + x, 37 + y, 1, 3);
            g2d.fillRect(97 + x, 40 + y, 1, 4);
            g2d.fillRect(121 + x, 40 + y, 1, 4);
            g2d.fillRect(98 + x, 41 + y, 1, 1);
            g2d.fillRect(101 + x, 41 + y, 1, 1);
            g2d.fillRect(119 + x, 41 + y, 1, 6);
            g2d.fillRect(118 + x, 42 + y, 1, 4);
            g2d.fillRect(98 + x, 43 + y, 1, 4);
            g2d.fillRect(101 + x, 43 + y, 2, 1);
            g2d.fillRect(117 + x, 43 + y, 1, 1);
            g2d.fillRect(103 + x, 45 + y, 1, 3);
            g2d.fillRect(118 + x, 47 + y, 1, 3);
            g2d.fillRect(97 + x, 48 + y, 1, 6);
            g2d.fillRect(117 + x, 48 + y, 1, 1);
            g2d.fillRect(102 + x, 49 + y, 1, 3);
            g2d.fillRect(121 + x, 49 + y, 1, 2);
            g2d.fillRect(98 + x, 50 + y, 1, 1);
            g2d.fillRect(103 + x, 50 + y, 1, 1);
            g2d.fillRect(96 + x, 53 + y, 1, 1);
            g2d.fillRect(102 + x, 53 + y, 2, 1);
            g2d.fillRect(121 + x, 53 + y, 1, 2);
            g2d.fillRect(103 + x, 54 + y, 1, 1);
            g2d.fillRect(120 + x, 54 + y, 1, 3);
            g2d.fillRect(97 + x, 55 + y, 1, 2);
            g2d.fillRect(121 + x, 57 + y, 1, 4);
            g2d.fillRect(96 + x, 58 + y, 2, 1);
            g2d.fillRect(101 + x, 58 + y, 1, 1);
            g2d.fillRect(119 + x, 59 + y, 1, 5);
            g2d.fillRect(99 + x, 60 + y, 4, 1);
            g2d.fillRect(118 + x, 60 + y, 1, 3);
            g2d.fillRect(100 + x, 61 + y, 1, 1);
            g2d.fillRect(117 + x, 61 + y, 1, 1);
            g2d.fillRect(103 + x, 62 + y, 1, 3);
            g2d.fillRect(121 + x, 63 + y, 1, 1);
            g2d.fillRect(99 + x, 64 + y, 1, 2);
            g2d.fillRect(100 + x, 64 + y, 1, 2);
            g2d.fillRect(118 + x, 64 + y, 1, 3);
            g2d.fillRect(117 + x, 65 + y, 1, 1);
            g2d.fillRect(120 + x, 65 + y, 1, 2);
            g2d.fillRect(102 + x, 66 + y, 1, 3);
            g2d.fillRect(121 + x, 66 + y, 1, 4);
            g2d.fillRect(103 + x, 67 + y, 1, 1);
            g2d.fillRect(99 + x, 68 + y, 1, 2);
            g2d.fillRect(119 + x, 68 + y, 1, 1);
            g2d.fillRect(118 + x, 69 + y, 1, 1);
            g2d.fillRect(100 + x, 70 + y, 1, 1);
            g2d.fillRect(102 + x, 70 + y, 2, 1);
            g2d.fillRect(101 + x, 71 + y, 1, 1);
            g2d.fillRect(103 + x, 71 + y, 1, 1);
            g2d.fillRect(117 + x, 71 + y, 1, 1);
        }
    }


}
