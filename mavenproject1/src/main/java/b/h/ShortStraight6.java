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
public class ShortStraight6 extends SuperH
{
    public ShortStraight6()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public ShortStraight6(int step, int dir)
    {
        super(step, dir);
    }

    public ShortStraight6(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d)
    {
        if(y == -1)
            y = 0;
        super.drawFront(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(96 + x, 19 + y, 1, 1);
            g2d.fillRect(94 + x, 20 + y, 2, 1);
            g2d.fillRect(94 + x, 21 + y, 1, 2);
            g2d.fillRect(113 + x, 22 + y, 1, 2);
            g2d.fillRect(93 + x, 23 + y, 1, 6);
            g2d.fillRect(115 + x, 24 + y, 1, 3);
            g2d.fillRect(114 + x, 24 + y, 1, 1);
            g2d.fillRect(111 + x, 26 + y, 1, 1);
            g2d.fillRect(112 + x, 27 + y, 1, 4);
            g2d.fillRect(96 + x, 28 + y, 1, 7);
            g2d.fillRect(94 + x, 29 + y, 1, 3);
            g2d.fillRect(113 + x, 31 + y, 1, 6);
            g2d.fillRect(95 + x, 31 + y, 1, 3);
            g2d.fillRect(115 + x, 32 + y, 1, 1);
            g2d.fillRect(97 + x, 32 + y, 1, 5);
            g2d.fillRect(114 + x, 34 + y, 1, 1);
            g2d.fillRect(112 + x, 36 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(96 + x, 24 + y, 1, 4);
            g2d.fillRect(112 + x, 31 + y, 1, 1);
            g2d.fillRect(111 + x, 32 + y, 1, 1);
            g2d.fillRect(112 + x, 34 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(109 + x, 20 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(106 + x, 17 + y, 1, 2);
            g2d.fillRect(100 + x, 17 + y, 6, 1);
            g2d.fillRect(108 + x, 18 + y, 1, 2);
            g2d.fillRect(107 + x, 18 + y, 1, 1);
            g2d.fillRect(98 + x, 18 + y, 1, 2);
            g2d.fillRect(97 + x, 18 + y, 1, 2);
            g2d.fillRect(109 + x, 19 + y, 1, 1);
            g2d.fillRect(99 + x, 19 + y, 3, 1);
            g2d.fillRect(110 + x, 20 + y, 1, 1);
            g2d.fillRect(102 + x, 20 + y, 2, 1);
            g2d.fillRect(96 + x, 20 + y, 1, 4);
            g2d.fillRect(111 + x, 21 + y, 1, 1);
            g2d.fillRect(104 + x, 21 + y, 3, 1);
            g2d.fillRect(95 + x, 21 + y, 1, 1);
            g2d.fillRect(112 + x, 22 + y, 1, 1);
            g2d.fillRect(107 + x, 22 + y, 2, 1);
            g2d.fillRect(109 + x, 23 + y, 1, 1);
            g2d.fillRect(94 + x, 23 + y, 1, 6);
            g2d.fillRect(110 + x, 24 + y, 1, 1);
            g2d.fillRect(114 + x, 25 + y, 1, 1);
            g2d.fillRect(111 + x, 25 + y, 1, 1);
            g2d.fillRect(112 + x, 26 + y, 1, 1);
            g2d.fillRect(115 + x, 27 + y, 1, 5);
            g2d.fillRect(113 + x, 27 + y, 1, 4);
            g2d.fillRect(111 + x, 27 + y, 1, 5);
            g2d.fillRect(95 + x, 29 + y, 1, 2);
            g2d.fillRect(114 + x, 31 + y, 1, 1);
            g2d.fillRect(114 + x, 33 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(99 + x, 18 + y, 2, 1);
            g2d.fillRect(102 + x, 19 + y, 2, 1);
            g2d.fillRect(104 + x, 20 + y, 2, 1);
            g2d.fillRect(95 + x, 22 + y, 1, 7);
            g2d.fillRect(114 + x, 29 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(105 + x, 18 + y, 1, 2);
            g2d.fillRect(104 + x, 18 + y, 1, 2);
            g2d.fillRect(101 + x, 18 + y, 3, 1);
            g2d.fillRect(106 + x, 19 + y, 2, 1);
            g2d.fillRect(106 + x, 20 + y, 1, 1);
            g2d.fillRect(110 + x, 21 + y, 1, 1);
            g2d.fillRect(107 + x, 21 + y, 1, 1);
            g2d.fillRect(111 + x, 22 + y, 1, 1);
            g2d.fillRect(110 + x, 23 + y, 1, 1);
            g2d.fillRect(113 + x, 24 + y, 1, 3);
            g2d.fillRect(111 + x, 24 + y, 1, 1);
            g2d.fillRect(112 + x, 25 + y, 1, 1);
            g2d.fillRect(114 + x, 26 + y, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(108 + x, 20 + y, 1, 2);
            g2d.fillRect(107 + x, 20 + y, 1, 1);
            g2d.fillRect(109 + x, 21 + y, 1, 2);
            g2d.fillRect(110 + x, 22 + y, 1, 1);
            g2d.fillRect(112 + x, 23 + y, 1, 2);
            g2d.fillRect(111 + x, 23 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(119 + x, 19 + y, 1, 1);
            g2d.fillRect(120 + x, 20 + y, 2, 1);
            g2d.fillRect(121 + x, 21 + y, 1, 2);
            g2d.fillRect(102 + x, 22 + y, 1, 2);
            g2d.fillRect(122 + x, 23 + y, 1, 6);
            g2d.fillRect(100 + x, 24 + y, 1, 3);
            g2d.fillRect(101 + x, 24 + y, 1, 1);
            g2d.fillRect(104 + x, 26 + y, 1, 1);
            g2d.fillRect(103 + x, 27 + y, 1, 4);
            g2d.fillRect(119 + x, 28 + y, 1, 7);
            g2d.fillRect(121 + x, 29 + y, 1, 3);
            g2d.fillRect(102 + x, 31 + y, 1, 6);
            g2d.fillRect(120 + x, 31 + y, 1, 3);
            g2d.fillRect(100 + x, 32 + y, 1, 1);
            g2d.fillRect(118 + x, 32 + y, 1, 5);
            g2d.fillRect(101 + x, 34 + y, 1, 1);
            g2d.fillRect(103 + x, 36 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(119 + x, 24 + y, 1, 4);
            g2d.fillRect(103 + x, 31 + y, 1, 1);
            g2d.fillRect(104 + x, 32 + y, 1, 1);
            g2d.fillRect(103 + x, 34 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(106 + x, 20 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(109 + x, 17 + y, 1, 2);
            g2d.fillRect(110 + x, 17 + y, 6, 1);
            g2d.fillRect(107 + x, 18 + y, 1, 2);
            g2d.fillRect(108 + x, 18 + y, 1, 1);
            g2d.fillRect(117 + x, 18 + y, 1, 2);
            g2d.fillRect(118 + x, 18 + y, 1, 2);
            g2d.fillRect(106 + x, 19 + y, 1, 1);
            g2d.fillRect(114 + x, 19 + y, 3, 1);
            g2d.fillRect(105 + x, 20 + y, 1, 1);
            g2d.fillRect(112 + x, 20 + y, 2, 1);
            g2d.fillRect(119 + x, 20 + y, 1, 4);
            g2d.fillRect(104 + x, 21 + y, 1, 1);
            g2d.fillRect(109 + x, 21 + y, 3, 1);
            g2d.fillRect(120 + x, 21 + y, 1, 1);
            g2d.fillRect(103 + x, 22 + y, 1, 1);
            g2d.fillRect(107 + x, 22 + y, 2, 1);
            g2d.fillRect(106 + x, 23 + y, 1, 1);
            g2d.fillRect(121 + x, 23 + y, 1, 6);
            g2d.fillRect(105 + x, 24 + y, 1, 1);
            g2d.fillRect(101 + x, 25 + y, 1, 1);
            g2d.fillRect(104 + x, 25 + y, 1, 1);
            g2d.fillRect(103 + x, 26 + y, 1, 1);
            g2d.fillRect(100 + x, 27 + y, 1, 5);
            g2d.fillRect(102 + x, 27 + y, 1, 4);
            g2d.fillRect(104 + x, 27 + y, 1, 5);
            g2d.fillRect(120 + x, 29 + y, 1, 2);
            g2d.fillRect(101 + x, 31 + y, 1, 1);
            g2d.fillRect(101 + x, 33 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(115 + x, 18 + y, 2, 1);
            g2d.fillRect(112 + x, 19 + y, 2, 1);
            g2d.fillRect(110 + x, 20 + y, 2, 1);
            g2d.fillRect(120 + x, 22 + y, 1, 7);
            g2d.fillRect(101 + x, 29 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(110 + x, 18 + y, 1, 2);
            g2d.fillRect(111 + x, 18 + y, 1, 2);
            g2d.fillRect(112 + x, 18 + y, 3, 1);
            g2d.fillRect(108 + x, 19 + y, 2, 1);
            g2d.fillRect(109 + x, 20 + y, 1, 1);
            g2d.fillRect(105 + x, 21 + y, 1, 1);
            g2d.fillRect(108 + x, 21 + y, 1, 1);
            g2d.fillRect(104 + x, 22 + y, 1, 1);
            g2d.fillRect(105 + x, 23 + y, 1, 1);
            g2d.fillRect(102 + x, 24 + y, 1, 3);
            g2d.fillRect(104 + x, 24 + y, 1, 1);
            g2d.fillRect(103 + x, 25 + y, 1, 1);
            g2d.fillRect(101 + x, 26 + y, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(107 + x, 20 + y, 1, 2);
            g2d.fillRect(108 + x, 20 + y, 1, 1);
            g2d.fillRect(106 + x, 21 + y, 1, 2);
            g2d.fillRect(105 + x, 22 + y, 1, 1);
            g2d.fillRect(103 + x, 23 + y, 1, 2);
            g2d.fillRect(104 + x, 23 + y, 1, 1);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        super.drawMiddle(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(101 + x, 13 + y, 1, 1);
            g2d.fillRect(100 + x, 15 + y, 1, 2);
            g2d.fillRect(99 + x, 17 + y, 1, 1);
            g2d.fillRect(117 + x, 18 + y, 1, 2);
            g2d.fillRect(98 + x, 18 + y, 1, 1);
            g2d.fillRect(93 + x, 18 + y, 1, 2);
            g2d.fillRect(116 + x, 22 + y, 1, 1);
            g2d.fillRect(116 + x, 24 + y, 1, 3);
            g2d.fillRect(117 + x, 25 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(112 + x, 11 + y, 1, 2);
            g2d.fillRect(111 + x, 11 + y, 1, 2);
            g2d.fillRect(109 + x, 11 + y, 2, 1);
            g2d.fillRect(101 + x, 11 + y, 5, 1);
            g2d.fillRect(113 + x, 12 + y, 1, 2);
            g2d.fillRect(102 + x, 12 + y, 1, 2);
            g2d.fillRect(100 + x, 12 + y, 1, 3);
            g2d.fillRect(99 + x, 12 + y, 1, 2);
            g2d.fillRect(98 + x, 12 + y, 1, 2);
            g2d.fillRect(114 + x, 13 + y, 1, 1);
            g2d.fillRect(103 + x, 13 + y, 2, 1);
            g2d.fillRect(97 + x, 13 + y, 1, 2);
            g2d.fillRect(95 + x, 13 + y, 2, 1);
            g2d.fillRect(115 + x, 14 + y, 1, 1);
            g2d.fillRect(95 + x, 14 + y, 1, 1);
            g2d.fillRect(116 + x, 15 + y, 1, 2);
            g2d.fillRect(101 + x, 15 + y, 1, 3);
            g2d.fillRect(99 + x, 15 + y, 1, 2);
            g2d.fillRect(96 + x, 15 + y, 1, 2);
            g2d.fillRect(94 + x, 15 + y, 1, 2);
            g2d.fillRect(117 + x, 16 + y, 1, 2);
            g2d.fillRect(102 + x, 16 + y, 1, 2);
            g2d.fillRect(98 + x, 16 + y, 1, 2);
            g2d.fillRect(103 + x, 17 + y, 1, 1);
            g2d.fillRect(100 + x, 17 + y, 1, 1);
            g2d.fillRect(97 + x, 17 + y, 1, 2);
            g2d.fillRect(95 + x, 17 + y, 1, 4);
            g2d.fillRect(93 + x, 17 + y, 1, 1);
            g2d.fillRect(99 + x, 18 + y, 1, 1);
            g2d.fillRect(116 + x, 19 + y, 1, 2);
            g2d.fillRect(96 + x, 19 + y, 1, 1);
            g2d.fillRect(94 + x, 19 + y, 1, 2);
            g2d.fillRect(117 + x, 20 + y, 1, 5);
            g2d.fillRect(114 + x, 20 + y, 1, 1);
            g2d.fillRect(93 + x, 20 + y, 1, 4);
            g2d.fillRect(115 + x, 21 + y, 1, 1);
            g2d.fillRect(112 + x, 21 + y, 1, 2);
            g2d.fillRect(114 + x, 22 + y, 1, 1);
            g2d.fillRect(115 + x, 23 + y, 2, 1);
            g2d.fillRect(114 + x, 24 + y, 2, 1);
            g2d.fillRect(117 + x, 27 + y, 1, 2);
            g2d.fillRect(116 + x, 27 + y, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(106 + x, 11 + y, 3, 1);
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(103 + x, 12 + y, 1, 1);
            g2d.fillRect(101 + x, 12 + y, 1, 1);
            g2d.fillRect(111 + x, 13 + y, 2, 1);
            g2d.fillRect(105 + x, 13 + y, 1, 1);
            g2d.fillRect(113 + x, 14 + y, 2, 1);
            g2d.fillRect(110 + x, 14 + y, 1, 1);
            g2d.fillRect(106 + x, 14 + y, 1, 1);
            g2d.fillRect(102 + x, 14 + y, 1, 2);
            g2d.fillRect(101 + x, 14 + y, 1, 1);
            g2d.fillRect(98 + x, 14 + y, 2, 1);
            g2d.fillRect(96 + x, 14 + y, 1, 1);
            g2d.fillRect(115 + x, 15 + y, 1, 2);
            g2d.fillRect(108 + x, 15 + y, 1, 1);
            g2d.fillRect(103 + x, 15 + y, 1, 2);
            g2d.fillRect(97 + x, 15 + y, 2, 1);
            g2d.fillRect(95 + x, 15 + y, 1, 2);
            g2d.fillRect(105 + x, 16 + y, 1, 2);
            g2d.fillRect(104 + x, 16 + y, 1, 2);
            g2d.fillRect(97 + x, 16 + y, 1, 1);
            g2d.fillRect(116 + x, 17 + y, 1, 2);
            g2d.fillRect(114 + x, 17 + y, 1, 1);
            g2d.fillRect(112 + x, 17 + y, 1, 4);
            g2d.fillRect(109 + x, 17 + y, 1, 1);
            g2d.fillRect(106 + x, 17 + y, 1, 1);
            g2d.fillRect(96 + x, 17 + y, 1, 2);
            g2d.fillRect(94 + x, 17 + y, 1, 2);
            g2d.fillRect(115 + x, 18 + y, 1, 3);
            g2d.fillRect(113 + x, 18 + y, 1, 5);
            g2d.fillRect(110 + x, 18 + y, 1, 1);
            g2d.fillRect(114 + x, 19 + y, 1, 1);
            g2d.fillRect(111 + x, 19 + y, 1, 3);
            g2d.fillRect(109 + x, 19 + y, 1, 1);
            g2d.fillRect(110 + x, 20 + y, 1, 1);
            g2d.fillRect(116 + x, 21 + y, 1, 1);
            g2d.fillRect(114 + x, 21 + y, 1, 1);
            g2d.fillRect(115 + x, 22 + y, 1, 1);
            g2d.fillRect(114 + x, 23 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(109 + x, 12 + y, 2, 1);
            g2d.fillRect(104 + x, 12 + y, 2, 1);
            g2d.fillRect(106 + x, 13 + y, 2, 1);
            g2d.fillRect(103 + x, 14 + y, 3, 1);
            g2d.fillRect(114 + x, 15 + y, 1, 2);
            g2d.fillRect(112 + x, 15 + y, 1, 1);
            g2d.fillRect(104 + x, 15 + y, 1, 1);
            g2d.fillRect(110 + x, 16 + y, 1, 1);
            g2d.fillRect(108 + x, 16 + y, 1, 3);
            g2d.fillRect(107 + x, 16 + y, 1, 3);
            g2d.fillRect(106 + x, 16 + y, 1, 1);
            g2d.fillRect(115 + x, 17 + y, 1, 1);
            g2d.fillRect(114 + x, 18 + y, 1, 1);
            g2d.fillRect(111 + x, 18 + y, 1, 1);
            g2d.fillRect(109 + x, 18 + y, 1, 1);
            g2d.fillRect(110 + x, 19 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(106 + x, 12 + y, 1, 1);
            g2d.fillRect(109 + x, 13 + y, 2, 1);
            g2d.fillRect(111 + x, 14 + y, 2, 1);
            g2d.fillRect(107 + x, 14 + y, 2, 1);
            g2d.fillRect(113 + x, 15 + y, 1, 3);
            g2d.fillRect(111 + x, 15 + y, 1, 1);
            g2d.fillRect(109 + x, 15 + y, 1, 2);
            g2d.fillRect(105 + x, 15 + y, 2, 1);
            g2d.fillRect(112 + x, 16 + y, 1, 1);
            g2d.fillRect(110 + x, 17 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(108 + x, 13 + y, 1, 1);
            g2d.fillRect(109 + x, 14 + y, 1, 1);
            g2d.fillRect(110 + x, 15 + y, 1, 1);
            g2d.fillRect(107 + x, 15 + y, 1, 1);
            g2d.fillRect(111 + x, 16 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(114 + x, 13 + y, 1, 1);
            g2d.fillRect(115 + x, 15 + y, 1, 2);
            g2d.fillRect(116 + x, 17 + y, 1, 1);
            g2d.fillRect(98 + x, 18 + y, 1, 2);
            g2d.fillRect(117 + x, 18 + y, 1, 1);
            g2d.fillRect(122 + x, 18 + y, 1, 2);
            g2d.fillRect(99 + x, 22 + y, 1, 1);
            g2d.fillRect(99 + x, 24 + y, 1, 3);
            g2d.fillRect(98 + x, 25 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(103 + x, 11 + y, 1, 2);
            g2d.fillRect(104 + x, 11 + y, 1, 2);
            g2d.fillRect(105 + x, 11 + y, 2, 1);
            g2d.fillRect(110 + x, 11 + y, 5, 1);
            g2d.fillRect(102 + x, 12 + y, 1, 2);
            g2d.fillRect(113 + x, 12 + y, 1, 2);
            g2d.fillRect(115 + x, 12 + y, 1, 3);
            g2d.fillRect(116 + x, 12 + y, 1, 2);
            g2d.fillRect(117 + x, 12 + y, 1, 2);
            g2d.fillRect(101 + x, 13 + y, 1, 1);
            g2d.fillRect(111 + x, 13 + y, 2, 1);
            g2d.fillRect(118 + x, 13 + y, 1, 2);
            g2d.fillRect(119 + x, 13 + y, 2, 1);
            g2d.fillRect(100 + x, 14 + y, 1, 1);
            g2d.fillRect(120 + x, 14 + y, 1, 1);
            g2d.fillRect(99 + x, 15 + y, 1, 2);
            g2d.fillRect(114 + x, 15 + y, 1, 3);
            g2d.fillRect(116 + x, 15 + y, 1, 2);
            g2d.fillRect(119 + x, 15 + y, 1, 2);
            g2d.fillRect(121 + x, 15 + y, 1, 2);
            g2d.fillRect(98 + x, 16 + y, 1, 2);
            g2d.fillRect(113 + x, 16 + y, 1, 2);
            g2d.fillRect(117 + x, 16 + y, 1, 2);
            g2d.fillRect(112 + x, 17 + y, 1, 1);
            g2d.fillRect(115 + x, 17 + y, 1, 1);
            g2d.fillRect(118 + x, 17 + y, 1, 2);
            g2d.fillRect(120 + x, 17 + y, 1, 4);
            g2d.fillRect(122 + x, 17 + y, 1, 1);
            g2d.fillRect(116 + x, 18 + y, 1, 1);
            g2d.fillRect(99 + x, 19 + y, 1, 2);
            g2d.fillRect(119 + x, 19 + y, 1, 1);
            g2d.fillRect(121 + x, 19 + y, 1, 2);
            g2d.fillRect(98 + x, 20 + y, 1, 5);
            g2d.fillRect(101 + x, 20 + y, 1, 1);
            g2d.fillRect(122 + x, 20 + y, 1, 4);
            g2d.fillRect(100 + x, 21 + y, 1, 1);
            g2d.fillRect(103 + x, 21 + y, 1, 2);
            g2d.fillRect(101 + x, 22 + y, 1, 1);
            g2d.fillRect(99 + x, 23 + y, 2, 1);
            g2d.fillRect(100 + x, 24 + y, 2, 1);
            g2d.fillRect(98 + x, 27 + y, 1, 2);
            g2d.fillRect(99 + x, 27 + y, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(107 + x, 11 + y, 3, 1);
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(112 + x, 12 + y, 1, 1);
            g2d.fillRect(114 + x, 12 + y, 1, 1);
            g2d.fillRect(103 + x, 13 + y, 2, 1);
            g2d.fillRect(110 + x, 13 + y, 1, 1);
            g2d.fillRect(101 + x, 14 + y, 2, 1);
            g2d.fillRect(105 + x, 14 + y, 1, 1);
            g2d.fillRect(109 + x, 14 + y, 1, 1);
            g2d.fillRect(113 + x, 14 + y, 1, 2);
            g2d.fillRect(114 + x, 14 + y, 1, 1);
            g2d.fillRect(116 + x, 14 + y, 2, 1);
            g2d.fillRect(119 + x, 14 + y, 1, 1);
            g2d.fillRect(100 + x, 15 + y, 1, 2);
            g2d.fillRect(107 + x, 15 + y, 1, 1);
            g2d.fillRect(112 + x, 15 + y, 1, 2);
            g2d.fillRect(117 + x, 15 + y, 2, 1);
            g2d.fillRect(120 + x, 15 + y, 1, 2);
            g2d.fillRect(110 + x, 16 + y, 1, 2);
            g2d.fillRect(111 + x, 16 + y, 1, 2);
            g2d.fillRect(118 + x, 16 + y, 1, 1);
            g2d.fillRect(99 + x, 17 + y, 1, 2);
            g2d.fillRect(101 + x, 17 + y, 1, 1);
            g2d.fillRect(103 + x, 17 + y, 1, 4);
            g2d.fillRect(106 + x, 17 + y, 1, 1);
            g2d.fillRect(109 + x, 17 + y, 1, 1);
            g2d.fillRect(119 + x, 17 + y, 1, 2);
            g2d.fillRect(121 + x, 17 + y, 1, 2);
            g2d.fillRect(100 + x, 18 + y, 1, 3);
            g2d.fillRect(102 + x, 18 + y, 1, 5);
            g2d.fillRect(105 + x, 18 + y, 1, 1);
            g2d.fillRect(101 + x, 19 + y, 1, 1);
            g2d.fillRect(104 + x, 19 + y, 1, 3);
            g2d.fillRect(106 + x, 19 + y, 1, 1);
            g2d.fillRect(105 + x, 20 + y, 1, 1);
            g2d.fillRect(99 + x, 21 + y, 1, 1);
            g2d.fillRect(101 + x, 21 + y, 1, 1);
            g2d.fillRect(100 + x, 22 + y, 1, 1);
            g2d.fillRect(101 + x, 23 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(105 + x, 12 + y, 2, 1);
            g2d.fillRect(110 + x, 12 + y, 2, 1);
            g2d.fillRect(108 + x, 13 + y, 2, 1);
            g2d.fillRect(110 + x, 14 + y, 3, 1);
            g2d.fillRect(101 + x, 15 + y, 1, 2);
            g2d.fillRect(103 + x, 15 + y, 1, 1);
            g2d.fillRect(111 + x, 15 + y, 1, 1);
            g2d.fillRect(105 + x, 16 + y, 1, 1);
            g2d.fillRect(107 + x, 16 + y, 1, 3);
            g2d.fillRect(108 + x, 16 + y, 1, 3);
            g2d.fillRect(109 + x, 16 + y, 1, 1);
            g2d.fillRect(100 + x, 17 + y, 1, 1);
            g2d.fillRect(101 + x, 18 + y, 1, 1);
            g2d.fillRect(104 + x, 18 + y, 1, 1);
            g2d.fillRect(106 + x, 18 + y, 1, 1);
            g2d.fillRect(105 + x, 19 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(109 + x, 12 + y, 1, 1);
            g2d.fillRect(105 + x, 13 + y, 2, 1);
            g2d.fillRect(103 + x, 14 + y, 2, 1);
            g2d.fillRect(107 + x, 14 + y, 2, 1);
            g2d.fillRect(102 + x, 15 + y, 1, 3);
            g2d.fillRect(104 + x, 15 + y, 1, 1);
            g2d.fillRect(106 + x, 15 + y, 1, 2);
            g2d.fillRect(109 + x, 15 + y, 2, 1);
            g2d.fillRect(103 + x, 16 + y, 1, 1);
            g2d.fillRect(104 + x, 17 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(107 + x, 13 + y, 1, 1);
            g2d.fillRect(106 + x, 14 + y, 1, 1);
            g2d.fillRect(105 + x, 15 + y, 1, 1);
            g2d.fillRect(108 + x, 15 + y, 1, 1);
            g2d.fillRect(104 + x, 16 + y, 1, 1);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d)
    {
        super.drawBack(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(123 + x, 18 + y, 1, 1);
            g2d.fillRect(124 + x, 20 + y, 1, 1);
            g2d.fillRect(118 + x, 20 + y, 1, 1);
            g2d.fillRect(92 + x, 20 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(109 + x, 10 + y, 8, 1);
            g2d.fillRect(106 + x, 10 + y, 1, 2);
            g2d.fillRect(105 + x, 10 + y, 1, 2);
            g2d.fillRect(104 + x, 10 + y, 1, 2);
            g2d.fillRect(103 + x, 10 + y, 1, 2);
            g2d.fillRect(102 + x, 10 + y, 1, 2);
            g2d.fillRect(101 + x, 10 + y, 1, 2);
            g2d.fillRect(100 + x, 10 + y, 1, 3);
            g2d.fillRect(117 + x, 11 + y, 2, 1);
            g2d.fillRect(107 + x, 11 + y, 6, 1);
            g2d.fillRect(99 + x, 11 + y, 1, 2);
            g2d.fillRect(98 + x, 11 + y, 1, 2);
            g2d.fillRect(97 + x, 12 + y, 1, 2);
            g2d.fillRect(115 + x, 13 + y, 1, 2);
            g2d.fillRect(96 + x, 13 + y, 1, 1);
            g2d.fillRect(126 + x, 14 + y, 1, 3);
            g2d.fillRect(125 + x, 14 + y, 1, 2);
            g2d.fillRect(124 + x, 14 + y, 1, 1);
            g2d.fillRect(120 + x, 14 + y, 1, 3);
            g2d.fillRect(119 + x, 14 + y, 1, 2);
            g2d.fillRect(118 + x, 14 + y, 1, 2);
            g2d.fillRect(116 + x, 14 + y, 2, 1);
            g2d.fillRect(94 + x, 14 + y, 1, 2);
            g2d.fillRect(90 + x, 14 + y, 4, 1);
            g2d.fillRect(127 + x, 15 + y, 2, 1);
            g2d.fillRect(122 + x, 15 + y, 1, 4);
            g2d.fillRect(121 + x, 15 + y, 1, 2);
            g2d.fillRect(116 + x, 15 + y, 1, 1);
            g2d.fillRect(88 + x, 15 + y, 5, 1);
            g2d.fillRect(129 + x, 16 + y, 1, 1);
            g2d.fillRect(127 + x, 16 + y, 1, 1);
            g2d.fillRect(123 + x, 16 + y, 1, 2);
            g2d.fillRect(93 + x, 16 + y, 1, 2);
            g2d.fillRect(89 + x, 16 + y, 2, 1);
            g2d.fillRect(87 + x, 16 + y, 1, 1);
            g2d.fillRect(130 + x, 17 + y, 1, 1);
            g2d.fillRect(128 + x, 17 + y, 1, 2);
            g2d.fillRect(124 + x, 17 + y, 1, 3);
            g2d.fillRect(88 + x, 17 + y, 1, 2);
            g2d.fillRect(86 + x, 17 + y, 1, 1);
            g2d.fillRect(131 + x, 18 + y, 1, 2);
            g2d.fillRect(125 + x, 18 + y, 1, 4);
            g2d.fillRect(118 + x, 18 + y, 1, 2);
            g2d.fillRect(92 + x, 18 + y, 1, 2);
            g2d.fillRect(85 + x, 18 + y, 1, 2);
            g2d.fillRect(129 + x, 19 + y, 1, 3);
            g2d.fillRect(123 + x, 19 + y, 1, 3);
            g2d.fillRect(119 + x, 19 + y, 1, 3);
            g2d.fillRect(91 + x, 19 + y, 1, 3);
            g2d.fillRect(87 + x, 19 + y, 1, 3);
            g2d.fillRect(126 + x, 21 + y, 1, 5);
            g2d.fillRect(124 + x, 21 + y, 1, 10);
            g2d.fillRect(120 + x, 21 + y, 1, 5);
            g2d.fillRect(118 + x, 21 + y, 1, 1);
            g2d.fillRect(92 + x, 21 + y, 1, 1);
            g2d.fillRect(90 + x, 21 + y, 1, 5);
            g2d.fillRect(130 + x, 22 + y, 1, 9);
            g2d.fillRect(86 + x, 22 + y, 1, 9);
            g2d.fillRect(127 + x, 23 + y, 1, 8);
            g2d.fillRect(121 + x, 23 + y, 1, 8);
            g2d.fillRect(89 + x, 23 + y, 1, 8);
            g2d.fillRect(128 + x, 24 + y, 1, 3);
            g2d.fillRect(122 + x, 24 + y, 1, 8);
            g2d.fillRect(88 + x, 24 + y, 1, 3);
            g2d.fillRect(129 + x, 25 + y, 1, 3);
            g2d.fillRect(123 + x, 25 + y, 1, 3);
            g2d.fillRect(118 + x, 25 + y, 1, 6);
            g2d.fillRect(92 + x, 25 + y, 1, 5);
            g2d.fillRect(87 + x, 25 + y, 1, 3);
            g2d.fillRect(126 + x, 29 + y, 1, 6);
            g2d.fillRect(120 + x, 29 + y, 1, 6);
            g2d.fillRect(90 + x, 29 + y, 1, 6);
            g2d.fillRect(125 + x, 30 + y, 1, 7);
            g2d.fillRect(119 + x, 30 + y, 1, 7);
            g2d.fillRect(91 + x, 30 + y, 1, 7);
            g2d.fillRect(121 + x, 32 + y, 1, 2);
            g2d.fillRect(124 + x, 37 + y, 1, 1);
            g2d.fillRect(118 + x, 37 + y, 1, 1);
            g2d.fillRect(92 + x, 37 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(118 + x, 32 + y, 1, 4);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(118 + x, 31 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(119 + x, 11 + y, 1, 1);
            g2d.fillRect(113 + x, 11 + y, 1, 2);
            g2d.fillRect(97 + x, 11 + y, 1, 1);
            g2d.fillRect(121 + x, 12 + y, 1, 1);
            g2d.fillRect(114 + x, 12 + y, 2, 1);
            g2d.fillRect(95 + x, 12 + y, 2, 1);
            g2d.fillRect(123 + x, 13 + y, 4, 1);
            g2d.fillRect(116 + x, 13 + y, 5, 1);
            g2d.fillRect(114 + x, 13 + y, 1, 2);
            g2d.fillRect(90 + x, 13 + y, 6, 1);
            g2d.fillRect(127 + x, 14 + y, 2, 1);
            g2d.fillRect(121 + x, 14 + y, 2, 1);
            g2d.fillRect(88 + x, 14 + y, 2, 1);
            g2d.fillRect(129 + x, 15 + y, 1, 1);
            g2d.fillRect(123 + x, 15 + y, 1, 1);
            g2d.fillRect(117 + x, 15 + y, 1, 2);
            g2d.fillRect(93 + x, 15 + y, 1, 1);
            g2d.fillRect(87 + x, 15 + y, 1, 1);
            g2d.fillRect(130 + x, 16 + y, 1, 1);
            g2d.fillRect(125 + x, 16 + y, 1, 2);
            g2d.fillRect(124 + x, 16 + y, 1, 1);
            g2d.fillRect(119 + x, 16 + y, 1, 3);
            g2d.fillRect(118 + x, 16 + y, 1, 2);
            g2d.fillRect(92 + x, 16 + y, 1, 2);
            g2d.fillRect(91 + x, 16 + y, 1, 3);
            g2d.fillRect(86 + x, 16 + y, 1, 1);
            g2d.fillRect(131 + x, 17 + y, 1, 1);
            g2d.fillRect(127 + x, 17 + y, 1, 1);
            g2d.fillRect(121 + x, 17 + y, 1, 1);
            g2d.fillRect(89 + x, 17 + y, 1, 1);
            g2d.fillRect(85 + x, 17 + y, 1, 1);
            g2d.fillRect(128 + x, 19 + y, 1, 1);
            g2d.fillRect(126 + x, 19 + y, 1, 2);
            g2d.fillRect(122 + x, 19 + y, 1, 1);
            g2d.fillRect(120 + x, 19 + y, 1, 2);
            g2d.fillRect(90 + x, 19 + y, 1, 2);
            g2d.fillRect(88 + x, 19 + y, 1, 1);
            g2d.fillRect(127 + x, 21 + y, 1, 2);
            g2d.fillRect(121 + x, 21 + y, 1, 2);
            g2d.fillRect(89 + x, 21 + y, 1, 2);
            g2d.fillRect(129 + x, 22 + y, 1, 3);
            g2d.fillRect(125 + x, 22 + y, 1, 2);
            g2d.fillRect(123 + x, 22 + y, 1, 3);
            g2d.fillRect(119 + x, 22 + y, 1, 2);
            g2d.fillRect(118 + x, 22 + y, 1, 3);
            g2d.fillRect(92 + x, 22 + y, 1, 3);
            g2d.fillRect(91 + x, 22 + y, 1, 2);
            g2d.fillRect(87 + x, 22 + y, 1, 3);
            g2d.fillRect(128 + x, 23 + y, 1, 1);
            g2d.fillRect(122 + x, 23 + y, 1, 1);
            g2d.fillRect(88 + x, 23 + y, 1, 1);
            g2d.fillRect(126 + x, 26 + y, 1, 3);
            g2d.fillRect(120 + x, 26 + y, 1, 3);
            g2d.fillRect(90 + x, 26 + y, 1, 3);
            g2d.fillRect(125 + x, 28 + y, 1, 2);
            g2d.fillRect(119 + x, 28 + y, 1, 2);
            g2d.fillRect(91 + x, 28 + y, 1, 2);
            g2d.fillRect(121 + x, 31 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(120 + x, 11 + y, 2, 1);
            g2d.fillRect(114 + x, 11 + y, 2, 1);
            g2d.fillRect(95 + x, 11 + y, 2, 1);
            g2d.fillRect(122 + x, 12 + y, 1, 1);
            g2d.fillRect(116 + x, 12 + y, 1, 1);
            g2d.fillRect(94 + x, 12 + y, 1, 1);
            g2d.fillRect(130 + x, 15 + y, 1, 1);
            g2d.fillRect(124 + x, 15 + y, 1, 1);
            g2d.fillRect(86 + x, 15 + y, 1, 1);
            g2d.fillRect(126 + x, 18 + y, 1, 1);
            g2d.fillRect(120 + x, 18 + y, 1, 1);
            g2d.fillRect(90 + x, 18 + y, 1, 1);
            g2d.fillRect(127 + x, 20 + y, 1, 1);
            g2d.fillRect(121 + x, 20 + y, 1, 1);
            g2d.fillRect(89 + x, 20 + y, 1, 1);
            g2d.fillRect(128 + x, 21 + y, 1, 2);
            g2d.fillRect(122 + x, 21 + y, 1, 2);
            g2d.fillRect(88 + x, 21 + y, 1, 2);
            g2d.fillRect(125 + x, 24 + y, 1, 1);
            g2d.fillRect(119 + x, 24 + y, 1, 1);
            g2d.fillRect(91 + x, 24 + y, 1, 1);
            g2d.fillRect(125 + x, 26 + y, 1, 2);
            g2d.fillRect(119 + x, 26 + y, 1, 2);
            g2d.fillRect(91 + x, 26 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(122 + x, 11 + y, 1, 1);
            g2d.fillRect(116 + x, 11 + y, 1, 1);
            g2d.fillRect(94 + x, 11 + y, 1, 1);
            g2d.fillRect(126 + x, 12 + y, 1, 1);
            g2d.fillRect(123 + x, 12 + y, 1, 1);
            g2d.fillRect(120 + x, 12 + y, 1, 1);
            g2d.fillRect(117 + x, 12 + y, 1, 1);
            g2d.fillRect(93 + x, 12 + y, 1, 1);
            g2d.fillRect(90 + x, 12 + y, 1, 1);
            g2d.fillRect(127 + x, 13 + y, 1, 1);
            g2d.fillRect(121 + x, 13 + y, 1, 1);
            g2d.fillRect(89 + x, 13 + y, 1, 1);
            g2d.fillRect(129 + x, 14 + y, 1, 1);
            g2d.fillRect(123 + x, 14 + y, 1, 1);
            g2d.fillRect(87 + x, 14 + y, 1, 1);
            g2d.fillRect(126 + x, 17 + y, 1, 1);
            g2d.fillRect(120 + x, 17 + y, 1, 1);
            g2d.fillRect(90 + x, 17 + y, 1, 1);
            g2d.fillRect(127 + x, 18 + y, 1, 2);
            g2d.fillRect(121 + x, 18 + y, 1, 2);
            g2d.fillRect(89 + x, 18 + y, 1, 2);
            g2d.fillRect(128 + x, 20 + y, 1, 1);
            g2d.fillRect(122 + x, 20 + y, 1, 1);
            g2d.fillRect(88 + x, 20 + y, 1, 1);
            g2d.fillRect(125 + x, 25 + y, 1, 1);
            g2d.fillRect(119 + x, 25 + y, 1, 1);
            g2d.fillRect(91 + x, 25 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(124 + x, 12 + y, 2, 1);
            g2d.fillRect(118 + x, 12 + y, 2, 1);
            g2d.fillRect(91 + x, 12 + y, 2, 1);
            g2d.fillRect(128 + x, 13 + y, 1, 1);
            g2d.fillRect(122 + x, 13 + y, 1, 1);
            g2d.fillRect(88 + x, 13 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(92 + x, 18 + y, 1, 1);
            g2d.fillRect(91 + x, 20 + y, 1, 1);
            g2d.fillRect(97 + x, 20 + y, 1, 1);
            g2d.fillRect(123 + x, 20 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(99 + x, 10 + y, 8, 1);
            g2d.fillRect(109 + x, 10 + y, 1, 2);
            g2d.fillRect(110 + x, 10 + y, 1, 2);
            g2d.fillRect(111 + x, 10 + y, 1, 2);
            g2d.fillRect(112 + x, 10 + y, 1, 2);
            g2d.fillRect(113 + x, 10 + y, 1, 2);
            g2d.fillRect(114 + x, 10 + y, 1, 2);
            g2d.fillRect(115 + x, 10 + y, 1, 3);
            g2d.fillRect(97 + x, 11 + y, 2, 1);
            g2d.fillRect(103 + x, 11 + y, 6, 1);
            g2d.fillRect(116 + x, 11 + y, 1, 2);
            g2d.fillRect(117 + x, 11 + y, 1, 2);
            g2d.fillRect(118 + x, 12 + y, 1, 2);
            g2d.fillRect(100 + x, 13 + y, 1, 2);
            g2d.fillRect(119 + x, 13 + y, 1, 1);
            g2d.fillRect(89 + x, 14 + y, 1, 3);
            g2d.fillRect(90 + x, 14 + y, 1, 2);
            g2d.fillRect(91 + x, 14 + y, 1, 1);
            g2d.fillRect(95 + x, 14 + y, 1, 3);
            g2d.fillRect(96 + x, 14 + y, 1, 2);
            g2d.fillRect(97 + x, 14 + y, 1, 2);
            g2d.fillRect(98 + x, 14 + y, 2, 1);
            g2d.fillRect(121 + x, 14 + y, 1, 2);
            g2d.fillRect(122 + x, 14 + y, 4, 1);
            g2d.fillRect(87 + x, 15 + y, 2, 1);
            g2d.fillRect(93 + x, 15 + y, 1, 4);
            g2d.fillRect(94 + x, 15 + y, 1, 2);
            g2d.fillRect(99 + x, 15 + y, 1, 1);
            g2d.fillRect(123 + x, 15 + y, 5, 1);
            g2d.fillRect(86 + x, 16 + y, 1, 1);
            g2d.fillRect(88 + x, 16 + y, 1, 1);
            g2d.fillRect(92 + x, 16 + y, 1, 2);
            g2d.fillRect(122 + x, 16 + y, 1, 2);
            g2d.fillRect(125 + x, 16 + y, 2, 1);
            g2d.fillRect(128 + x, 16 + y, 1, 1);
            g2d.fillRect(85 + x, 17 + y, 1, 1);
            g2d.fillRect(87 + x, 17 + y, 1, 2);
            g2d.fillRect(91 + x, 17 + y, 1, 3);
            g2d.fillRect(127 + x, 17 + y, 1, 2);
            g2d.fillRect(129 + x, 17 + y, 1, 1);
            g2d.fillRect(84 + x, 18 + y, 1, 2);
            g2d.fillRect(90 + x, 18 + y, 1, 4);
            g2d.fillRect(97 + x, 18 + y, 1, 2);
            g2d.fillRect(123 + x, 18 + y, 1, 2);
            g2d.fillRect(130 + x, 18 + y, 1, 2);
            g2d.fillRect(86 + x, 19 + y, 1, 3);
            g2d.fillRect(92 + x, 19 + y, 1, 3);
            g2d.fillRect(96 + x, 19 + y, 1, 3);
            g2d.fillRect(124 + x, 19 + y, 1, 3);
            g2d.fillRect(128 + x, 19 + y, 1, 3);
            g2d.fillRect(89 + x, 21 + y, 1, 5);
            g2d.fillRect(91 + x, 21 + y, 1, 10);
            g2d.fillRect(95 + x, 21 + y, 1, 5);
            g2d.fillRect(97 + x, 21 + y, 1, 1);
            g2d.fillRect(123 + x, 21 + y, 1, 1);
            g2d.fillRect(125 + x, 21 + y, 1, 5);
            g2d.fillRect(85 + x, 22 + y, 1, 9);
            g2d.fillRect(129 + x, 22 + y, 1, 9);
            g2d.fillRect(88 + x, 23 + y, 1, 8);
            g2d.fillRect(94 + x, 23 + y, 1, 8);
            g2d.fillRect(126 + x, 23 + y, 1, 8);
            g2d.fillRect(87 + x, 24 + y, 1, 3);
            g2d.fillRect(93 + x, 24 + y, 1, 8);
            g2d.fillRect(127 + x, 24 + y, 1, 3);
            g2d.fillRect(86 + x, 25 + y, 1, 3);
            g2d.fillRect(92 + x, 25 + y, 1, 3);
            g2d.fillRect(97 + x, 25 + y, 1, 6);
            g2d.fillRect(123 + x, 25 + y, 1, 5);
            g2d.fillRect(128 + x, 25 + y, 1, 3);
            g2d.fillRect(89 + x, 29 + y, 1, 6);
            g2d.fillRect(95 + x, 29 + y, 1, 6);
            g2d.fillRect(125 + x, 29 + y, 1, 6);
            g2d.fillRect(90 + x, 30 + y, 1, 7);
            g2d.fillRect(96 + x, 30 + y, 1, 7);
            g2d.fillRect(124 + x, 30 + y, 1, 7);
            g2d.fillRect(94 + x, 32 + y, 1, 2);
            g2d.fillRect(91 + x, 37 + y, 1, 1);
            g2d.fillRect(97 + x, 37 + y, 1, 1);
            g2d.fillRect(123 + x, 37 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(97 + x, 32 + y, 1, 4);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(97 + x, 31 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(96 + x, 11 + y, 1, 1);
            g2d.fillRect(102 + x, 11 + y, 1, 2);
            g2d.fillRect(118 + x, 11 + y, 1, 1);
            g2d.fillRect(94 + x, 12 + y, 1, 1);
            g2d.fillRect(100 + x, 12 + y, 2, 1);
            g2d.fillRect(119 + x, 12 + y, 2, 1);
            g2d.fillRect(89 + x, 13 + y, 4, 1);
            g2d.fillRect(95 + x, 13 + y, 5, 1);
            g2d.fillRect(101 + x, 13 + y, 1, 2);
            g2d.fillRect(120 + x, 13 + y, 6, 1);
            g2d.fillRect(87 + x, 14 + y, 2, 1);
            g2d.fillRect(93 + x, 14 + y, 2, 1);
            g2d.fillRect(126 + x, 14 + y, 2, 1);
            g2d.fillRect(86 + x, 15 + y, 1, 1);
            g2d.fillRect(92 + x, 15 + y, 1, 1);
            g2d.fillRect(98 + x, 15 + y, 1, 2);
            g2d.fillRect(122 + x, 15 + y, 1, 1);
            g2d.fillRect(128 + x, 15 + y, 1, 1);
            g2d.fillRect(85 + x, 16 + y, 1, 1);
            g2d.fillRect(90 + x, 16 + y, 1, 2);
            g2d.fillRect(91 + x, 16 + y, 1, 1);
            g2d.fillRect(96 + x, 16 + y, 1, 3);
            g2d.fillRect(97 + x, 16 + y, 1, 2);
            g2d.fillRect(123 + x, 16 + y, 1, 2);
            g2d.fillRect(124 + x, 16 + y, 1, 3);
            g2d.fillRect(129 + x, 16 + y, 1, 1);
            g2d.fillRect(84 + x, 17 + y, 1, 1);
            g2d.fillRect(88 + x, 17 + y, 1, 1);
            g2d.fillRect(94 + x, 17 + y, 1, 1);
            g2d.fillRect(126 + x, 17 + y, 1, 1);
            g2d.fillRect(130 + x, 17 + y, 1, 1);
            g2d.fillRect(87 + x, 19 + y, 1, 1);
            g2d.fillRect(89 + x, 19 + y, 1, 2);
            g2d.fillRect(93 + x, 19 + y, 1, 1);
            g2d.fillRect(95 + x, 19 + y, 1, 2);
            g2d.fillRect(125 + x, 19 + y, 1, 2);
            g2d.fillRect(127 + x, 19 + y, 1, 1);
            g2d.fillRect(88 + x, 21 + y, 1, 2);
            g2d.fillRect(94 + x, 21 + y, 1, 2);
            g2d.fillRect(126 + x, 21 + y, 1, 2);
            g2d.fillRect(86 + x, 22 + y, 1, 3);
            g2d.fillRect(90 + x, 22 + y, 1, 2);
            g2d.fillRect(92 + x, 22 + y, 1, 3);
            g2d.fillRect(96 + x, 22 + y, 1, 2);
            g2d.fillRect(97 + x, 22 + y, 1, 3);
            g2d.fillRect(123 + x, 22 + y, 1, 3);
            g2d.fillRect(124 + x, 22 + y, 1, 2);
            g2d.fillRect(128 + x, 22 + y, 1, 3);
            g2d.fillRect(87 + x, 23 + y, 1, 1);
            g2d.fillRect(93 + x, 23 + y, 1, 1);
            g2d.fillRect(127 + x, 23 + y, 1, 1);
            g2d.fillRect(89 + x, 26 + y, 1, 3);
            g2d.fillRect(95 + x, 26 + y, 1, 3);
            g2d.fillRect(125 + x, 26 + y, 1, 3);
            g2d.fillRect(90 + x, 28 + y, 1, 2);
            g2d.fillRect(96 + x, 28 + y, 1, 2);
            g2d.fillRect(124 + x, 28 + y, 1, 2);
            g2d.fillRect(94 + x, 31 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(94 + x, 11 + y, 2, 1);
            g2d.fillRect(100 + x, 11 + y, 2, 1);
            g2d.fillRect(119 + x, 11 + y, 2, 1);
            g2d.fillRect(93 + x, 12 + y, 1, 1);
            g2d.fillRect(99 + x, 12 + y, 1, 1);
            g2d.fillRect(121 + x, 12 + y, 1, 1);
            g2d.fillRect(85 + x, 15 + y, 1, 1);
            g2d.fillRect(91 + x, 15 + y, 1, 1);
            g2d.fillRect(129 + x, 15 + y, 1, 1);
            g2d.fillRect(89 + x, 18 + y, 1, 1);
            g2d.fillRect(95 + x, 18 + y, 1, 1);
            g2d.fillRect(125 + x, 18 + y, 1, 1);
            g2d.fillRect(88 + x, 20 + y, 1, 1);
            g2d.fillRect(94 + x, 20 + y, 1, 1);
            g2d.fillRect(126 + x, 20 + y, 1, 1);
            g2d.fillRect(87 + x, 21 + y, 1, 2);
            g2d.fillRect(93 + x, 21 + y, 1, 2);
            g2d.fillRect(127 + x, 21 + y, 1, 2);
            g2d.fillRect(90 + x, 24 + y, 1, 1);
            g2d.fillRect(96 + x, 24 + y, 1, 1);
            g2d.fillRect(124 + x, 24 + y, 1, 1);
            g2d.fillRect(90 + x, 26 + y, 1, 2);
            g2d.fillRect(96 + x, 26 + y, 1, 2);
            g2d.fillRect(124 + x, 26 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(93 + x, 11 + y, 1, 1);
            g2d.fillRect(99 + x, 11 + y, 1, 1);
            g2d.fillRect(121 + x, 11 + y, 1, 1);
            g2d.fillRect(89 + x, 12 + y, 1, 1);
            g2d.fillRect(92 + x, 12 + y, 1, 1);
            g2d.fillRect(95 + x, 12 + y, 1, 1);
            g2d.fillRect(98 + x, 12 + y, 1, 1);
            g2d.fillRect(122 + x, 12 + y, 1, 1);
            g2d.fillRect(125 + x, 12 + y, 1, 1);
            g2d.fillRect(88 + x, 13 + y, 1, 1);
            g2d.fillRect(94 + x, 13 + y, 1, 1);
            g2d.fillRect(126 + x, 13 + y, 1, 1);
            g2d.fillRect(86 + x, 14 + y, 1, 1);
            g2d.fillRect(92 + x, 14 + y, 1, 1);
            g2d.fillRect(128 + x, 14 + y, 1, 1);
            g2d.fillRect(89 + x, 17 + y, 1, 1);
            g2d.fillRect(95 + x, 17 + y, 1, 1);
            g2d.fillRect(125 + x, 17 + y, 1, 1);
            g2d.fillRect(88 + x, 18 + y, 1, 2);
            g2d.fillRect(94 + x, 18 + y, 1, 2);
            g2d.fillRect(126 + x, 18 + y, 1, 2);
            g2d.fillRect(87 + x, 20 + y, 1, 1);
            g2d.fillRect(93 + x, 20 + y, 1, 1);
            g2d.fillRect(127 + x, 20 + y, 1, 1);
            g2d.fillRect(90 + x, 25 + y, 1, 1);
            g2d.fillRect(96 + x, 25 + y, 1, 1);
            g2d.fillRect(124 + x, 25 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(90 + x, 12 + y, 2, 1);
            g2d.fillRect(96 + x, 12 + y, 2, 1);
            g2d.fillRect(123 + x, 12 + y, 2, 1);
            g2d.fillRect(87 + x, 13 + y, 1, 1);
            g2d.fillRect(93 + x, 13 + y, 1, 1);
            g2d.fillRect(127 + x, 13 + y, 1, 1);
        }
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d)
    {
    }

}
