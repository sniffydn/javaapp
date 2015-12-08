/*
 * LongWavy1.java
 *
 * Created on March 30, 2007, 9:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package b.h;

import clts.SuperH;
import util.Color;
import util.GraphicsMap;
import clts.Piece;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class MediumPony2 extends SuperH
{
    public MediumPony2()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumPony2(int step, int dir)
    {
        super(step, dir);
    }

    public MediumPony2(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d)
    {
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        super.drawMiddle(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(111 + x, 34 + y, 1, 6);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(110 + x, 12 + y, 1, 1);
            g2d.fillRect(110 + x, 14 + y, 1, 2);
            g2d.fillRect(109 + x, 16 + y, 1, 1);
            g2d.fillRect(108 + x, 17 + y, 1, 1);
            g2d.fillRect(101 + x, 40 + y, 2, 1);



            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(111 + x, 11 + y, 1, 6);
            g2d.fillRect(106 + x, 11 + y, 5, 1);
            g2d.fillRect(112 + x, 12 + y, 2, 1);
            g2d.fillRect(109 + x, 12 + y, 1, 4);
            g2d.fillRect(114 + x, 13 + y, 1, 1);
            g2d.fillRect(110 + x, 13 + y, 1, 1);
            g2d.fillRect(108 + x, 14 + y, 1, 3);
            g2d.fillRect(107 + x, 14 + y, 1, 1);
            g2d.fillRect(112 + x, 15 + y, 1, 1);
            g2d.fillRect(110 + x, 16 + y, 1, 1);
            g2d.fillRect(107 + x, 16 + y, 1, 4);
            g2d.fillRect(105 + x, 16 + y, 2, 1);
            g2d.fillRect(109 + x, 17 + y, 1, 2);
            g2d.fillRect(110 + x, 18 + y, 1, 1);
            g2d.fillRect(108 + x, 18 + y, 1, 2);
            g2d.fillRect(106 + x, 18 + y, 1, 2);
            g2d.fillRect(105 + x, 18 + y, 1, 1);
            g2d.fillRect(112 + x, 28 + y, 1, 12);
            g2d.fillRect(114 + x, 29 + y, 1, 2);
            g2d.fillRect(113 + x, 30 + y, 1, 3);
            g2d.fillRect(116 + x, 32 + y, 1, 2);
            g2d.fillRect(115 + x, 34 + y, 1, 2);
            g2d.fillRect(113 + x, 35 + y, 1, 4);
            g2d.fillRect(114 + x, 36 + y, 1, 2);
            g2d.fillRect(102 + x, 39 + y, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(103 + x, 11 + y, 3, 1);
            g2d.fillRect(108 + x, 12 + y, 1, 2);
            g2d.fillRect(107 + x, 12 + y, 1, 2);
            g2d.fillRect(100 + x, 12 + y, 3, 1);
            g2d.fillRect(112 + x, 13 + y, 2, 1);
            g2d.fillRect(106 + x, 13 + y, 1, 3);
            g2d.fillRect(98 + x, 13 + y, 2, 1);
            g2d.fillRect(114 + x, 14 + y, 2, 1);
            g2d.fillRect(105 + x, 14 + y, 1, 2);
            g2d.fillRect(97 + x, 14 + y, 1, 1);
            g2d.fillRect(116 + x, 15 + y, 1, 1);
            g2d.fillRect(107 + x, 15 + y, 1, 1);
            g2d.fillRect(104 + x, 15 + y, 1, 5);
            g2d.fillRect(96 + x, 15 + y, 1, 1);
            g2d.fillRect(112 + x, 16 + y, 1, 1);
            g2d.fillRect(95 + x, 16 + y, 1, 2);
            g2d.fillRect(117 + x, 17 + y, 1, 1);
            g2d.fillRect(110 + x, 17 + y, 2, 1);
            g2d.fillRect(105 + x, 17 + y, 2, 1);
            g2d.fillRect(103 + x, 17 + y, 1, 2);
            g2d.fillRect(102 + x, 17 + y, 1, 2);
            g2d.fillRect(101 + x, 17 + y, 1, 2);
            g2d.fillRect(99 + x, 18 + y, 2, 1);
            g2d.fillRect(94 + x, 18 + y, 1, 6);
            g2d.fillRect(118 + x, 19 + y, 1, 3);
            g2d.fillRect(109 + x, 19 + y, 1, 1);
            g2d.fillRect(105 + x, 19 + y, 1, 1);
            g2d.fillRect(106 + x, 20 + y, 2, 1);
            g2d.fillRect(99 + x, 20 + y, 3, 1);
            g2d.fillRect(109 + x, 21 + y, 1, 2);
            g2d.fillRect(108 + x, 21 + y, 1, 1);
            g2d.fillRect(98 + x, 21 + y, 2, 1);
            g2d.fillRect(116 + x, 22 + y, 1, 3);
            g2d.fillRect(110 + x, 22 + y, 1, 2);
            g2d.fillRect(97 + x, 22 + y, 2, 1);
            g2d.fillRect(113 + x, 23 + y, 1, 2);
            g2d.fillRect(111 + x, 23 + y, 1, 2);
            g2d.fillRect(97 + x, 23 + y, 1, 1);
            g2d.fillRect(117 + x, 24 + y, 1, 4);
            g2d.fillRect(114 + x, 24 + y, 1, 1);
            g2d.fillRect(93 + x, 24 + y, 1, 3);
            g2d.fillRect(115 + x, 25 + y, 1, 9);
            g2d.fillRect(112 + x, 25 + y, 1, 1);
            g2d.fillRect(96 + x, 25 + y, 1, 6);
            g2d.fillRect(114 + x, 27 + y, 1, 2);
            g2d.fillRect(112 + x, 27 + y, 1, 1);
            g2d.fillRect(95 + x, 27 + y, 1, 1);
            g2d.fillRect(116 + x, 29 + y, 1, 3);
            g2d.fillRect(113 + x, 29 + y, 1, 1);
            g2d.fillRect(95 + x, 30 + y, 1, 10);
            g2d.fillRect(114 + x, 31 + y, 1, 5);
            g2d.fillRect(113 + x, 33 + y, 1, 2);
            g2d.fillRect(97 + x, 33 + y, 1, 2);
            g2d.fillRect(98 + x, 34 + y, 1, 5);
            g2d.fillRect(93 + x, 34 + y, 1, 6);
            g2d.fillRect(99 + x, 35 + y, 1, 1);
            g2d.fillRect(100 + x, 36 + y, 1, 1);
            g2d.fillRect(101 + x, 37 + y, 1, 3);
            g2d.fillRect(102 + x, 38 + y, 1, 1);
            g2d.fillRect(96 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(103 + x, 12 + y, 4, 1);
            g2d.fillRect(112 + x, 14 + y, 1, 1);
            g2d.fillRect(101 + x, 14 + y, 4, 1);
            g2d.fillRect(103 + x, 15 + y, 1, 2);
            g2d.fillRect(98 + x, 15 + y, 2, 1);
            g2d.fillRect(116 + x, 16 + y, 1, 2);
            g2d.fillRect(113 + x, 16 + y, 1, 2);
            g2d.fillRect(102 + x, 16 + y, 1, 1);
            g2d.fillRect(98 + x, 16 + y, 1, 2);
            g2d.fillRect(97 + x, 16 + y, 1, 2);
            g2d.fillRect(96 + x, 16 + y, 1, 3);
            g2d.fillRect(114 + x, 17 + y, 1, 2);
            g2d.fillRect(112 + x, 17 + y, 1, 1);
            g2d.fillRect(99 + x, 17 + y, 2, 1);
            g2d.fillRect(117 + x, 18 + y, 1, 6);
            g2d.fillRect(111 + x, 18 + y, 1, 3);
            g2d.fillRect(95 + x, 18 + y, 1, 2);
            g2d.fillRect(110 + x, 19 + y, 1, 1);
            g2d.fillRect(103 + x, 19 + y, 1, 1);
            g2d.fillRect(108 + x, 20 + y, 1, 1);
            g2d.fillRect(115 + x, 21 + y, 1, 1);
            g2d.fillRect(113 + x, 22 + y, 1, 1);
            g2d.fillRect(112 + x, 23 + y, 1, 2);
            g2d.fillRect(114 + x, 25 + y, 1, 2);
            g2d.fillRect(113 + x, 25 + y, 1, 4);
            g2d.fillRect(112 + x, 26 + y, 1, 1);
            g2d.fillRect(116 + x, 27 + y, 1, 2);
            g2d.fillRect(93 + x, 27 + y, 1, 7);
            g2d.fillRect(96 + x, 31 + y, 1, 8);
            g2d.fillRect(97 + x, 35 + y, 1, 5);
            g2d.fillRect(99 + x, 36 + y, 1, 3);
            g2d.fillRect(100 + x, 37 + y, 1, 1);
            g2d.fillRect(100 + x, 39 + y, 1, 1);
            g2d.fillRect(98 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(104 + x, 13 + y, 2, 1);
            g2d.fillRect(100 + x, 13 + y, 1, 1);
            g2d.fillRect(113 + x, 14 + y, 1, 1);
            g2d.fillRect(98 + x, 14 + y, 2, 1);
            g2d.fillRect(115 + x, 15 + y, 1, 1);
            g2d.fillRect(102 + x, 15 + y, 1, 1);
            g2d.fillRect(100 + x, 15 + y, 1, 2);
            g2d.fillRect(97 + x, 15 + y, 1, 1);
            g2d.fillRect(101 + x, 16 + y, 1, 1);
            g2d.fillRect(99 + x, 16 + y, 1, 1);
            g2d.fillRect(116 + x, 18 + y, 1, 1);
            g2d.fillRect(113 + x, 18 + y, 1, 1);
            g2d.fillRect(97 + x, 18 + y, 2, 1);
            g2d.fillRect(115 + x, 19 + y, 1, 2);
            g2d.fillRect(114 + x, 19 + y, 1, 3);
            g2d.fillRect(101 + x, 19 + y, 2, 1);
            g2d.fillRect(96 + x, 19 + y, 1, 1);
            g2d.fillRect(112 + x, 20 + y, 1, 3);
            g2d.fillRect(109 + x, 20 + y, 2, 1);
            g2d.fillRect(98 + x, 20 + y, 1, 1);
            g2d.fillRect(95 + x, 20 + y, 1, 1);
            g2d.fillRect(116 + x, 21 + y, 1, 1);
            g2d.fillRect(111 + x, 21 + y, 1, 1);
            g2d.fillRect(97 + x, 21 + y, 1, 1);
            g2d.fillRect(115 + x, 22 + y, 1, 2);
            g2d.fillRect(96 + x, 24 + y, 1, 1);
            g2d.fillRect(94 + x, 24 + y, 1, 1);
            g2d.fillRect(116 + x, 25 + y, 1, 2);
            g2d.fillRect(100 + x, 38 + y, 1, 1);
            g2d.fillRect(99 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(101 + x, 13 + y, 3, 1);
            g2d.fillRect(100 + x, 14 + y, 1, 1);
            g2d.fillRect(114 + x, 15 + y, 1, 2);
            g2d.fillRect(113 + x, 15 + y, 1, 1);
            g2d.fillRect(101 + x, 15 + y, 1, 1);
            g2d.fillRect(115 + x, 16 + y, 1, 3);
            g2d.fillRect(112 + x, 18 + y, 1, 2);
            g2d.fillRect(116 + x, 19 + y, 1, 2);
            g2d.fillRect(113 + x, 19 + y, 1, 3);
            g2d.fillRect(99 + x, 19 + y, 2, 1);
            g2d.fillRect(97 + x, 20 + y, 1, 1);
            g2d.fillRect(110 + x, 21 + y, 1, 1);
            g2d.fillRect(114 + x, 22 + y, 1, 2);
            g2d.fillRect(111 + x, 22 + y, 1, 1);
            g2d.fillRect(96 + x, 23 + y, 1, 1);
            g2d.fillRect(115 + x, 24 + y, 1, 1);
            g2d.fillRect(95 + x, 25 + y, 1, 2);
            g2d.fillRect(95 + x, 28 + y, 1, 2);
            g2d.fillRect(94 + x, 36 + y, 1, 4);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(97 + x, 19 + y, 2, 1);
            g2d.fillRect(96 + x, 20 + y, 1, 3);
            g2d.fillRect(95 + x, 21 + y, 1, 4);
            g2d.fillRect(94 + x, 25 + y, 1, 11);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(105 + x, 12 + y, 1, 1);
            g2d.fillRect(105 + x, 14 + y, 1, 2);
            g2d.fillRect(106 + x, 16 + y, 1, 1);
            g2d.fillRect(107 + x, 17 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(104 + x, 11 + y, 1, 6);
            g2d.fillRect(105 + x, 11 + y, 5, 1);
            g2d.fillRect(102 + x, 12 + y, 2, 1);
            g2d.fillRect(106 + x, 12 + y, 1, 4);
            g2d.fillRect(101 + x, 13 + y, 1, 1);
            g2d.fillRect(105 + x, 13 + y, 1, 1);
            g2d.fillRect(107 + x, 14 + y, 1, 3);
            g2d.fillRect(108 + x, 14 + y, 1, 1);
            g2d.fillRect(103 + x, 15 + y, 1, 1);
            g2d.fillRect(105 + x, 16 + y, 1, 1);
            g2d.fillRect(108 + x, 16 + y, 1, 4);
            g2d.fillRect(109 + x, 16 + y, 2, 1);
            g2d.fillRect(106 + x, 17 + y, 1, 2);
            g2d.fillRect(105 + x, 18 + y, 1, 1);
            g2d.fillRect(107 + x, 18 + y, 1, 2);
            g2d.fillRect(109 + x, 18 + y, 1, 2);
            g2d.fillRect(110 + x, 18 + y, 1, 1);
            g2d.fillRect(103 + x, 28 + y, 1, 12);
            g2d.fillRect(101 + x, 29 + y, 1, 2);
            g2d.fillRect(102 + x, 30 + y, 1, 3);
            g2d.fillRect(99 + x, 32 + y, 1, 2);
            g2d.fillRect(100 + x, 34 + y, 1, 2);
            g2d.fillRect(102 + x, 35 + y, 1, 4);
            g2d.fillRect(101 + x, 36 + y, 1, 2);
            g2d.fillRect(111 + x, 39 + y, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(110 + x, 11 + y, 3, 1);
            g2d.fillRect(107 + x, 12 + y, 1, 2);
            g2d.fillRect(108 + x, 12 + y, 1, 2);
            g2d.fillRect(113 + x, 12 + y, 3, 1);
            g2d.fillRect(102 + x, 13 + y, 2, 1);
            g2d.fillRect(109 + x, 13 + y, 1, 3);
            g2d.fillRect(116 + x, 13 + y, 2, 1);
            g2d.fillRect(100 + x, 14 + y, 2, 1);
            g2d.fillRect(110 + x, 14 + y, 1, 2);
            g2d.fillRect(118 + x, 14 + y, 1, 1);
            g2d.fillRect(99 + x, 15 + y, 1, 1);
            g2d.fillRect(108 + x, 15 + y, 1, 1);
            g2d.fillRect(111 + x, 15 + y, 1, 5);
            g2d.fillRect(119 + x, 15 + y, 1, 1);
            g2d.fillRect(103 + x, 16 + y, 1, 1);
            g2d.fillRect(120 + x, 16 + y, 1, 2);
            g2d.fillRect(98 + x, 17 + y, 1, 1);
            g2d.fillRect(104 + x, 17 + y, 2, 1);
            g2d.fillRect(109 + x, 17 + y, 2, 1);
            g2d.fillRect(112 + x, 17 + y, 1, 2);
            g2d.fillRect(113 + x, 17 + y, 1, 2);
            g2d.fillRect(114 + x, 17 + y, 1, 2);
            g2d.fillRect(115 + x, 18 + y, 2, 1);
            g2d.fillRect(121 + x, 18 + y, 1, 6);
            g2d.fillRect(97 + x, 19 + y, 1, 3);
            g2d.fillRect(106 + x, 19 + y, 1, 1);
            g2d.fillRect(110 + x, 19 + y, 1, 1);
            g2d.fillRect(108 + x, 20 + y, 2, 1);
            g2d.fillRect(114 + x, 20 + y, 3, 1);
            g2d.fillRect(106 + x, 21 + y, 1, 2);
            g2d.fillRect(107 + x, 21 + y, 1, 1);
            g2d.fillRect(116 + x, 21 + y, 2, 1);
            g2d.fillRect(99 + x, 22 + y, 1, 3);
            g2d.fillRect(105 + x, 22 + y, 1, 2);
            g2d.fillRect(117 + x, 22 + y, 2, 1);
            g2d.fillRect(102 + x, 23 + y, 1, 2);
            g2d.fillRect(104 + x, 23 + y, 1, 2);
            g2d.fillRect(118 + x, 23 + y, 1, 1);
            g2d.fillRect(98 + x, 24 + y, 1, 4);
            g2d.fillRect(101 + x, 24 + y, 1, 1);
            g2d.fillRect(122 + x, 24 + y, 1, 3);
            g2d.fillRect(100 + x, 25 + y, 1, 9);
            g2d.fillRect(103 + x, 25 + y, 1, 1);
            g2d.fillRect(119 + x, 25 + y, 1, 6);
            g2d.fillRect(101 + x, 27 + y, 1, 2);
            g2d.fillRect(103 + x, 27 + y, 1, 1);
            g2d.fillRect(120 + x, 27 + y, 1, 1);
            g2d.fillRect(99 + x, 29 + y, 1, 3);
            g2d.fillRect(102 + x, 29 + y, 1, 1);
            g2d.fillRect(120 + x, 30 + y, 1, 10);
            g2d.fillRect(101 + x, 31 + y, 1, 5);
            g2d.fillRect(102 + x, 33 + y, 1, 2);
            g2d.fillRect(118 + x, 33 + y, 1, 2);
            g2d.fillRect(117 + x, 34 + y, 1, 5);
            g2d.fillRect(122 + x, 34 + y, 1, 6);
            g2d.fillRect(116 + x, 35 + y, 1, 1);
            g2d.fillRect(115 + x, 36 + y, 1, 1);
            g2d.fillRect(114 + x, 37 + y, 1, 3);
            g2d.fillRect(113 + x, 38 + y, 1, 1);
            g2d.fillRect(119 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(109 + x, 12 + y, 4, 1);
            g2d.fillRect(103 + x, 14 + y, 1, 1);
            g2d.fillRect(111 + x, 14 + y, 4, 1);
            g2d.fillRect(112 + x, 15 + y, 1, 2);
            g2d.fillRect(116 + x, 15 + y, 2, 1);
            g2d.fillRect(99 + x, 16 + y, 1, 2);
            g2d.fillRect(102 + x, 16 + y, 1, 2);
            g2d.fillRect(113 + x, 16 + y, 1, 1);
            g2d.fillRect(117 + x, 16 + y, 1, 2);
            g2d.fillRect(118 + x, 16 + y, 1, 2);
            g2d.fillRect(119 + x, 16 + y, 1, 3);
            g2d.fillRect(101 + x, 17 + y, 1, 2);
            g2d.fillRect(103 + x, 17 + y, 1, 1);
            g2d.fillRect(115 + x, 17 + y, 2, 1);
            g2d.fillRect(98 + x, 18 + y, 1, 6);
            g2d.fillRect(104 + x, 18 + y, 1, 3);
            g2d.fillRect(120 + x, 18 + y, 1, 2);
            g2d.fillRect(105 + x, 19 + y, 1, 1);
            g2d.fillRect(112 + x, 19 + y, 1, 1);
            g2d.fillRect(107 + x, 20 + y, 1, 1);
            g2d.fillRect(100 + x, 21 + y, 1, 1);
            g2d.fillRect(102 + x, 22 + y, 1, 1);
            g2d.fillRect(103 + x, 23 + y, 1, 2);
            g2d.fillRect(101 + x, 25 + y, 1, 2);
            g2d.fillRect(102 + x, 25 + y, 1, 4);
            g2d.fillRect(103 + x, 26 + y, 1, 1);
            g2d.fillRect(99 + x, 27 + y, 1, 2);
            g2d.fillRect(122 + x, 27 + y, 1, 7);
            g2d.fillRect(119 + x, 31 + y, 1, 8);
            g2d.fillRect(118 + x, 35 + y, 1, 5);
            g2d.fillRect(116 + x, 36 + y, 1, 3);
            g2d.fillRect(115 + x, 37 + y, 1, 1);
            g2d.fillRect(115 + x, 39 + y, 1, 1);
            g2d.fillRect(117 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(110 + x, 13 + y, 2, 1);
            g2d.fillRect(115 + x, 13 + y, 1, 1);
            g2d.fillRect(102 + x, 14 + y, 1, 1);
            g2d.fillRect(116 + x, 14 + y, 2, 1);
            g2d.fillRect(100 + x, 15 + y, 1, 1);
            g2d.fillRect(113 + x, 15 + y, 1, 1);
            g2d.fillRect(115 + x, 15 + y, 1, 2);
            g2d.fillRect(118 + x, 15 + y, 1, 1);
            g2d.fillRect(114 + x, 16 + y, 1, 1);
            g2d.fillRect(116 + x, 16 + y, 1, 1);
            g2d.fillRect(99 + x, 18 + y, 1, 1);
            g2d.fillRect(102 + x, 18 + y, 1, 1);
            g2d.fillRect(117 + x, 18 + y, 2, 1);
            g2d.fillRect(100 + x, 19 + y, 1, 2);
            g2d.fillRect(101 + x, 19 + y, 1, 3);
            g2d.fillRect(113 + x, 19 + y, 2, 1);
            g2d.fillRect(119 + x, 19 + y, 1, 1);
            g2d.fillRect(103 + x, 20 + y, 1, 3);
            g2d.fillRect(105 + x, 20 + y, 2, 1);
            g2d.fillRect(117 + x, 20 + y, 1, 1);
            g2d.fillRect(120 + x, 20 + y, 1, 1);
            g2d.fillRect(99 + x, 21 + y, 1, 1);
            g2d.fillRect(104 + x, 21 + y, 1, 1);
            g2d.fillRect(118 + x, 21 + y, 1, 1);
            g2d.fillRect(100 + x, 22 + y, 1, 2);
            g2d.fillRect(119 + x, 24 + y, 1, 1);
            g2d.fillRect(121 + x, 24 + y, 1, 1);
            g2d.fillRect(99 + x, 25 + y, 1, 2);
            g2d.fillRect(115 + x, 38 + y, 1, 1);
            g2d.fillRect(116 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(112 + x, 13 + y, 3, 1);
            g2d.fillRect(115 + x, 14 + y, 1, 1);
            g2d.fillRect(101 + x, 15 + y, 1, 2);
            g2d.fillRect(102 + x, 15 + y, 1, 1);
            g2d.fillRect(114 + x, 15 + y, 1, 1);
            g2d.fillRect(100 + x, 16 + y, 1, 3);
            g2d.fillRect(103 + x, 18 + y, 1, 2);
            g2d.fillRect(99 + x, 19 + y, 1, 2);
            g2d.fillRect(102 + x, 19 + y, 1, 3);
            g2d.fillRect(115 + x, 19 + y, 2, 1);
            g2d.fillRect(118 + x, 20 + y, 1, 1);
            g2d.fillRect(105 + x, 21 + y, 1, 1);
            g2d.fillRect(101 + x, 22 + y, 1, 2);
            g2d.fillRect(104 + x, 22 + y, 1, 1);
            g2d.fillRect(119 + x, 23 + y, 1, 1);
            g2d.fillRect(100 + x, 24 + y, 1, 1);
            g2d.fillRect(120 + x, 25 + y, 1, 2);
            g2d.fillRect(120 + x, 28 + y, 1, 2);
            g2d.fillRect(121 + x, 36 + y, 1, 4);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(117 + x, 19 + y, 2, 1);
            g2d.fillRect(119 + x, 20 + y, 1, 3);
            g2d.fillRect(120 + x, 21 + y, 1, 4);
            g2d.fillRect(121 + x, 25 + y, 1, 11);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d)
    {
        super.drawBack(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(96 + x, 39 + y, 1, 3);
            g2d.fillRect(95 + x, 39 + y, 1, 14);
            g2d.fillRect(93 + x, 39 + y, 1, 3);
            g2d.fillRect(100 + x, 41 + y, 1, 6);
            g2d.fillRect(97 + x, 42 + y, 1, 3);
            g2d.fillRect(98 + x, 43 + y, 1, 8);
            g2d.fillRect(94 + x, 44 + y, 1, 1);
            g2d.fillRect(93 + x, 45 + y, 1, 3);
            g2d.fillRect(92 + x, 45 + y, 1, 1);
            g2d.fillRect(101 + x, 47 + y, 1, 1);
            g2d.fillRect(96 + x, 48 + y, 1, 4);
            g2d.fillRect(97 + x, 49 + y, 1, 1);
            g2d.fillRect(99 + x, 50 + y, 1, 2);
            g2d.fillRect(94 + x, 50 + y, 1, 1);
            g2d.fillRect(100 + x, 51 + y, 1, 2);
            g2d.fillRect(97 + x, 51 + y, 1, 3);
            g2d.fillRect(93 + x, 51 + y, 1, 4);
            g2d.fillRect(101 + x, 52 + y, 1, 2);
            g2d.fillRect(92 + x, 52 + y, 1, 1);
            g2d.fillRect(102 + x, 53 + y, 1, 1);
            g2d.fillRect(96 + x, 53 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(100 + x, 39 + y, 1, 2);
            g2d.fillRect(98 + x, 39 + y, 1, 2);
            g2d.fillRect(97 + x, 39 + y, 1, 3);
            g2d.fillRect(96 + x, 42 + y, 1, 2);
            g2d.fillRect(93 + x, 42 + y, 1, 1);
            g2d.fillRect(94 + x, 43 + y, 1, 1);
            g2d.fillRect(93 + x, 44 + y, 1, 1);
            g2d.fillRect(97 + x, 45 + y, 1, 3);
            g2d.fillRect(94 + x, 45 + y, 1, 2);
            g2d.fillRect(97 + x, 50 + y, 1, 1);
            g2d.fillRect(98 + x, 51 + y, 1, 2);
            g2d.fillRect(94 + x, 51 + y, 1, 1);
            g2d.fillRect(99 + x, 52 + y, 1, 1);
            g2d.fillRect(100 + x, 53 + y, 1, 1);
            g2d.fillRect(101 + x, 54 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(99 + x, 39 + y, 1, 11);
            g2d.fillRect(94 + x, 40 + y, 1, 3);
            g2d.fillRect(98 + x, 41 + y, 1, 2);
            g2d.fillRect(100 + x, 50 + y, 1, 1);
            g2d.fillRect(101 + x, 51 + y, 2, 1);
            g2d.fillRect(103 + x, 52 + y, 1, 1);
            g2d.fillRect(94 + x, 52 + y, 1, 1);
            g2d.fillRect(104 + x, 53 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(94 + x, 39 + y, 1, 1);
            g2d.fillRect(93 + x, 43 + y, 1, 1);
            g2d.fillRect(96 + x, 44 + y, 1, 4);
            g2d.fillRect(94 + x, 47 + y, 1, 3);
            g2d.fillRect(100 + x, 48 + y, 1, 2);
            g2d.fillRect(97 + x, 48 + y, 1, 1);
            g2d.fillRect(101 + x, 50 + y, 1, 1);
            g2d.fillRect(93 + x, 50 + y, 1, 1);
            g2d.fillRect(92 + x, 51 + y, 1, 1);
            g2d.fillRect(102 + x, 52 + y, 1, 1);
            g2d.fillRect(103 + x, 53 + y, 1, 1);
            g2d.fillRect(94 + x, 53 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(92 + x, 44 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(119 + x, 39 + y, 1, 3);
            g2d.fillRect(120 + x, 39 + y, 1, 14);
            g2d.fillRect(122 + x, 39 + y, 1, 3);
            g2d.fillRect(115 + x, 41 + y, 1, 6);
            g2d.fillRect(118 + x, 42 + y, 1, 3);
            g2d.fillRect(117 + x, 43 + y, 1, 8);
            g2d.fillRect(121 + x, 44 + y, 1, 1);
            g2d.fillRect(122 + x, 45 + y, 1, 3);
            g2d.fillRect(123 + x, 45 + y, 1, 1);
            g2d.fillRect(114 + x, 47 + y, 1, 1);
            g2d.fillRect(119 + x, 48 + y, 1, 4);
            g2d.fillRect(118 + x, 49 + y, 1, 1);
            g2d.fillRect(116 + x, 50 + y, 1, 2);
            g2d.fillRect(121 + x, 50 + y, 1, 1);
            g2d.fillRect(115 + x, 51 + y, 1, 2);
            g2d.fillRect(118 + x, 51 + y, 1, 3);
            g2d.fillRect(122 + x, 51 + y, 1, 4);
            g2d.fillRect(114 + x, 52 + y, 1, 2);
            g2d.fillRect(123 + x, 52 + y, 1, 1);
            g2d.fillRect(113 + x, 53 + y, 1, 1);
            g2d.fillRect(119 + x, 53 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(115 + x, 39 + y, 1, 2);
            g2d.fillRect(117 + x, 39 + y, 1, 2);
            g2d.fillRect(118 + x, 39 + y, 1, 3);
            g2d.fillRect(119 + x, 42 + y, 1, 2);
            g2d.fillRect(122 + x, 42 + y, 1, 1);
            g2d.fillRect(121 + x, 43 + y, 1, 1);
            g2d.fillRect(122 + x, 44 + y, 1, 1);
            g2d.fillRect(118 + x, 45 + y, 1, 3);
            g2d.fillRect(121 + x, 45 + y, 1, 2);
            g2d.fillRect(118 + x, 50 + y, 1, 1);
            g2d.fillRect(117 + x, 51 + y, 1, 2);
            g2d.fillRect(121 + x, 51 + y, 1, 1);
            g2d.fillRect(116 + x, 52 + y, 1, 1);
            g2d.fillRect(115 + x, 53 + y, 1, 1);
            g2d.fillRect(113 + x, 54 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(116 + x, 39 + y, 1, 11);
            g2d.fillRect(121 + x, 40 + y, 1, 3);
            g2d.fillRect(117 + x, 41 + y, 1, 2);
            g2d.fillRect(115 + x, 50 + y, 1, 1);
            g2d.fillRect(113 + x, 51 + y, 2, 1);
            g2d.fillRect(112 + x, 52 + y, 1, 1);
            g2d.fillRect(121 + x, 52 + y, 1, 1);
            g2d.fillRect(111 + x, 53 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(121 + x, 39 + y, 1, 1);
            g2d.fillRect(122 + x, 43 + y, 1, 1);
            g2d.fillRect(119 + x, 44 + y, 1, 4);
            g2d.fillRect(121 + x, 47 + y, 1, 3);
            g2d.fillRect(115 + x, 48 + y, 1, 2);
            g2d.fillRect(118 + x, 48 + y, 1, 1);
            g2d.fillRect(114 + x, 50 + y, 1, 1);
            g2d.fillRect(122 + x, 50 + y, 1, 1);
            g2d.fillRect(123 + x, 51 + y, 1, 1);
            g2d.fillRect(113 + x, 52 + y, 1, 1);
            g2d.fillRect(112 + x, 53 + y, 1, 1);
            g2d.fillRect(121 + x, 53 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(123 + x, 44 + y, 1, 1);
        }
    }
}
