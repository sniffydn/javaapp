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
 */
public class MediumStraight7 extends SuperH
{
    int prevY = -1;

    public MediumStraight7()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumStraight7(int step, int dir)
    {
        super(step, dir);
    }

    public MediumStraight7(int step, int dir, ColorArray colorSwitch)
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
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
            g2d.fillRect(104 + x, 12 + y, 4, 1);
            g2d.fillRect(108 + x, 13 + y, 4, 1);
            g2d.fillRect(102 + x, 13 + y, 2, 1);
            g2d.fillRect(112 + x, 14 + y, 2, 1);
            g2d.fillRect(100 + x, 14 + y, 2, 1);
            g2d.fillRect(114 + x, 15 + y, 1, 1);
            g2d.fillRect(99 + x, 15 + y, 2, 1);
            g2d.fillRect(115 + x, 16 + y, 1, 1);
            g2d.fillRect(97 + x, 16 + y, 2, 1);
            g2d.fillRect(116 + x, 17 + y, 1, 2);
            g2d.fillRect(108 + x, 17 + y, 1, 2);
            g2d.fillRect(105 + x, 17 + y, 3, 1);
            g2d.fillRect(96 + x, 17 + y, 2, 1);
            g2d.fillRect(109 + x, 18 + y, 1, 2);
            g2d.fillRect(95 + x, 18 + y, 2, 1);
            g2d.fillRect(117 + x, 19 + y, 1, 3);
            g2d.fillRect(110 + x, 19 + y, 1, 2);
            g2d.fillRect(94 + x, 19 + y, 2, 1);
            g2d.fillRect(111 + x, 20 + y, 1, 2);
            g2d.fillRect(94 + x, 20 + y, 1, 1);
            g2d.fillRect(93 + x, 21 + y, 1, 15);
            g2d.fillRect(118 + x, 22 + y, 1, 4);
            g2d.fillRect(112 + x, 22 + y, 1, 2);
            g2d.fillRect(113 + x, 24 + y, 1, 5);
            g2d.fillRect(119 + x, 25 + y, 1, 7);
            g2d.fillRect(114 + x, 28 + y, 1, 4);
            g2d.fillRect(111 + x, 30 + y, 1, 6);
            g2d.fillRect(99 + x, 35 + y, 1, 9);
            g2d.fillRect(96 + x, 35 + y, 1, 1);
            g2d.fillRect(97 + x, 42 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(102 + x, 11 + y, 10, 1);
            g2d.fillRect(112 + x, 12 + y, 3, 1);
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(100 + x, 12 + y, 2, 1);
            g2d.fillRect(112 + x, 13 + y, 1, 1);
            g2d.fillRect(107 + x, 13 + y, 1, 2);
            g2d.fillRect(104 + x, 13 + y, 2, 1);
            g2d.fillRect(98 + x, 13 + y, 1, 1);
            g2d.fillRect(116 + x, 14 + y, 1, 1);
            g2d.fillRect(114 + x, 14 + y, 1, 1);
            g2d.fillRect(108 + x, 14 + y, 2, 1);
            g2d.fillRect(103 + x, 14 + y, 1, 2);
            g2d.fillRect(102 + x, 14 + y, 1, 1);
            g2d.fillRect(97 + x, 14 + y, 1, 1);
            g2d.fillRect(117 + x, 15 + y, 1, 1);
            g2d.fillRect(110 + x, 15 + y, 2, 1);
            g2d.fillRect(106 + x, 15 + y, 1, 2);
            g2d.fillRect(101 + x, 15 + y, 1, 1);
            g2d.fillRect(96 + x, 15 + y, 1, 2);
            g2d.fillRect(118 + x, 16 + y, 1, 4);
            g2d.fillRect(112 + x, 16 + y, 1, 1);
            g2d.fillRect(107 + x, 16 + y, 2, 1);
            g2d.fillRect(104 + x, 16 + y, 2, 1);
            g2d.fillRect(95 + x, 16 + y, 1, 1);
            g2d.fillRect(113 + x, 17 + y, 1, 1);
            g2d.fillRect(110 + x, 17 + y, 1, 2);
            g2d.fillRect(109 + x, 17 + y, 1, 1);
            g2d.fillRect(102 + x, 17 + y, 3, 1);
            g2d.fillRect(117 + x, 18 + y, 1, 1);
            g2d.fillRect(114 + x, 18 + y, 1, 2);
            g2d.fillRect(102 + x, 18 + y, 1, 2);
            g2d.fillRect(101 + x, 18 + y, 1, 2);
            g2d.fillRect(97 + x, 18 + y, 1, 1);
            g2d.fillRect(94 + x, 18 + y, 1, 1);
            g2d.fillRect(111 + x, 19 + y, 1, 1);
            g2d.fillRect(100 + x, 19 + y, 1, 2);
            g2d.fillRect(119 + x, 20 + y, 1, 5);
            g2d.fillRect(115 + x, 20 + y, 1, 2);
            g2d.fillRect(112 + x, 20 + y, 1, 2);
            g2d.fillRect(106 + x, 20 + y, 1, 2);
            g2d.fillRect(103 + x, 20 + y, 3, 1);
            g2d.fillRect(99 + x, 20 + y, 1, 1);
            g2d.fillRect(96 + x, 20 + y, 1, 1);
            g2d.fillRect(113 + x, 21 + y, 1, 3);
            g2d.fillRect(107 + x, 21 + y, 1, 1);
            g2d.fillRect(98 + x, 21 + y, 1, 1);
            g2d.fillRect(108 + x, 22 + y, 1, 1);
            g2d.fillRect(97 + x, 22 + y, 1, 3);
            g2d.fillRect(116 + x, 23 + y, 1, 3);
            g2d.fillRect(109 + x, 23 + y, 1, 2);
            g2d.fillRect(114 + x, 24 + y, 1, 4);
            g2d.fillRect(110 + x, 25 + y, 1, 1);
            g2d.fillRect(96 + x, 25 + y, 1, 10);
            g2d.fillRect(94 + x, 25 + y, 1, 11);
            g2d.fillRect(117 + x, 26 + y, 1, 6);
            g2d.fillRect(115 + x, 27 + y, 1, 5);
            g2d.fillRect(110 + x, 27 + y, 1, 4);
            g2d.fillRect(111 + x, 29 + y, 1, 1);
            g2d.fillRect(116 + x, 31 + y, 1, 1);
            g2d.fillRect(112 + x, 33 + y, 1, 3);
            g2d.fillRect(98 + x, 34 + y, 1, 9);
            g2d.fillRect(110 + x, 35 + y, 1, 4);
            g2d.fillRect(109 + x, 35 + y, 1, 1);
            g2d.fillRect(100 + x, 36 + y, 1, 5);
            g2d.fillRect(101 + x, 37 + y, 1, 1);
            g2d.fillRect(102 + x, 38 + y, 1, 1);
            g2d.fillRect(103 + x, 39 + y, 2, 1);
            g2d.fillRect(101 + x, 40 + y, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(102 + x, 12 + y, 2, 1);
            g2d.fillRect(99 + x, 13 + y, 1, 2);
            g2d.fillRect(98 + x, 14 + y, 1, 2);
            g2d.fillRect(107 + x, 15 + y, 2, 1);
            g2d.fillRect(97 + x, 15 + y, 1, 1);
            g2d.fillRect(117 + x, 16 + y, 1, 1);
            g2d.fillRect(109 + x, 16 + y, 1, 1);
            g2d.fillRect(111 + x, 18 + y, 1, 1);
            g2d.fillRect(112 + x, 19 + y, 1, 1);
            g2d.fillRect(96 + x, 19 + y, 1, 1);
            g2d.fillRect(113 + x, 20 + y, 1, 1);
            g2d.fillRect(95 + x, 20 + y, 1, 3);
            g2d.fillRect(114 + x, 21 + y, 1, 3);
            g2d.fillRect(94 + x, 23 + y, 1, 2);
            g2d.fillRect(115 + x, 24 + y, 1, 3);
            g2d.fillRect(116 + x, 28 + y, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(115 + x, 13 + y, 1, 3);
            g2d.fillRect(114 + x, 13 + y, 1, 1);
            g2d.fillRect(100 + x, 13 + y, 2, 1);
            g2d.fillRect(116 + x, 15 + y, 1, 2);
            g2d.fillRect(95 + x, 17 + y, 1, 1);
            g2d.fillRect(94 + x, 21 + y, 1, 2);
            g2d.fillRect(97 + x, 36 + y, 1, 6);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(109 + x, 12 + y, 3, 1);
            g2d.fillRect(113 + x, 13 + y, 1, 1);
            g2d.fillRect(106 + x, 13 + y, 1, 2);
            g2d.fillRect(105 + x, 14 + y, 1, 2);
            g2d.fillRect(104 + x, 14 + y, 1, 2);
            g2d.fillRect(109 + x, 15 + y, 1, 1);
            g2d.fillRect(102 + x, 15 + y, 1, 1);
            g2d.fillRect(111 + x, 16 + y, 1, 2);
            g2d.fillRect(110 + x, 16 + y, 1, 1);
            g2d.fillRect(99 + x, 16 + y, 2, 1);
            g2d.fillRect(117 + x, 17 + y, 1, 1);
            g2d.fillRect(112 + x, 17 + y, 1, 2);
            g2d.fillRect(101 + x, 17 + y, 1, 1);
            g2d.fillRect(98 + x, 17 + y, 1, 1);
            g2d.fillRect(113 + x, 18 + y, 1, 2);
            g2d.fillRect(100 + x, 18 + y, 1, 1);
            g2d.fillRect(107 + x, 19 + y, 1, 2);
            g2d.fillRect(103 + x, 19 + y, 4, 1);
            g2d.fillRect(99 + x, 19 + y, 1, 1);
            g2d.fillRect(97 + x, 19 + y, 1, 1);
            g2d.fillRect(118 + x, 20 + y, 1, 2);
            g2d.fillRect(114 + x, 20 + y, 1, 1);
            g2d.fillRect(108 + x, 20 + y, 1, 2);
            g2d.fillRect(98 + x, 20 + y, 1, 1);
            g2d.fillRect(104 + x, 21 + y, 2, 1);
            g2d.fillRect(96 + x, 21 + y, 1, 1);
            g2d.fillRect(115 + x, 22 + y, 1, 2);
            g2d.fillRect(109 + x, 22 + y, 1, 1);
            g2d.fillRect(107 + x, 22 + y, 1, 2);
            g2d.fillRect(106 + x, 22 + y, 1, 1);
            g2d.fillRect(110 + x, 23 + y, 1, 1);
            g2d.fillRect(108 + x, 23 + y, 1, 3);
            g2d.fillRect(95 + x, 23 + y, 1, 2);
            g2d.fillRect(111 + x, 24 + y, 1, 5);
            g2d.fillRect(109 + x, 25 + y, 1, 1);
            g2d.fillRect(116 + x, 26 + y, 1, 2);
            g2d.fillRect(112 + x, 29 + y, 1, 4);
            g2d.fillRect(97 + x, 33 + y, 1, 3);
            g2d.fillRect(101 + x, 38 + y, 1, 2);
            g2d.fillRect(102 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(110 + x, 14 + y, 2, 1);
            g2d.fillRect(112 + x, 15 + y, 2, 1);
            g2d.fillRect(114 + x, 16 + y, 1, 1);
            g2d.fillRect(115 + x, 17 + y, 1, 1);
            g2d.fillRect(109 + x, 21 + y, 1, 1);
            g2d.fillRect(110 + x, 22 + y, 1, 1);
            g2d.fillRect(110 + x, 24 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(103 + x, 18 + y, 1, 1);
            g2d.fillRect(115 + x, 19 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(113 + x, 16 + y, 1, 1);
            g2d.fillRect(101 + x, 16 + y, 3, 1);
            g2d.fillRect(114 + x, 17 + y, 1, 1);
            g2d.fillRect(99 + x, 17 + y, 2, 1);
            g2d.fillRect(115 + x, 18 + y, 1, 1);
            g2d.fillRect(104 + x, 18 + y, 4, 1);
            g2d.fillRect(98 + x, 18 + y, 2, 1);
            g2d.fillRect(116 + x, 19 + y, 1, 4);
            g2d.fillRect(108 + x, 19 + y, 1, 1);
            g2d.fillRect(98 + x, 19 + y, 1, 1);
            g2d.fillRect(109 + x, 20 + y, 1, 1);
            g2d.fillRect(97 + x, 20 + y, 1, 2);
            g2d.fillRect(110 + x, 21 + y, 1, 1);
            g2d.fillRect(117 + x, 22 + y, 1, 4);
            g2d.fillRect(111 + x, 22 + y, 1, 2);
            g2d.fillRect(96 + x, 22 + y, 1, 3);
            g2d.fillRect(112 + x, 24 + y, 1, 5);
            g2d.fillRect(95 + x, 25 + y, 1, 11);
            g2d.fillRect(118 + x, 26 + y, 1, 6);
            g2d.fillRect(113 + x, 29 + y, 1, 3);
            g2d.fillRect(113 + x, 33 + y, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(113 + x, 32 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
            g2d.fillRect(108 + x, 12 + y, 4, 1);
            g2d.fillRect(104 + x, 13 + y, 4, 1);
            g2d.fillRect(112 + x, 13 + y, 2, 1);
            g2d.fillRect(102 + x, 14 + y, 2, 1);
            g2d.fillRect(114 + x, 14 + y, 2, 1);
            g2d.fillRect(101 + x, 15 + y, 1, 1);
            g2d.fillRect(115 + x, 15 + y, 2, 1);
            g2d.fillRect(100 + x, 16 + y, 1, 1);
            g2d.fillRect(117 + x, 16 + y, 2, 1);
            g2d.fillRect(99 + x, 17 + y, 1, 2);
            g2d.fillRect(107 + x, 17 + y, 1, 2);
            g2d.fillRect(108 + x, 17 + y, 3, 1);
            g2d.fillRect(118 + x, 17 + y, 2, 1);
            g2d.fillRect(106 + x, 18 + y, 1, 2);
            g2d.fillRect(119 + x, 18 + y, 2, 1);
            g2d.fillRect(98 + x, 19 + y, 1, 3);
            g2d.fillRect(105 + x, 19 + y, 1, 2);
            g2d.fillRect(120 + x, 19 + y, 2, 1);
            g2d.fillRect(104 + x, 20 + y, 1, 2);
            g2d.fillRect(121 + x, 20 + y, 1, 1);
            g2d.fillRect(122 + x, 21 + y, 1, 15);
            g2d.fillRect(97 + x, 22 + y, 1, 4);
            g2d.fillRect(103 + x, 22 + y, 1, 2);
            g2d.fillRect(102 + x, 24 + y, 1, 5);
            g2d.fillRect(96 + x, 25 + y, 1, 7);
            g2d.fillRect(101 + x, 28 + y, 1, 4);
            g2d.fillRect(104 + x, 30 + y, 1, 6);
            g2d.fillRect(116 + x, 35 + y, 1, 9);
            g2d.fillRect(119 + x, 35 + y, 1, 1);
            g2d.fillRect(118 + x, 42 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(104 + x, 11 + y, 10, 1);
            g2d.fillRect(101 + x, 12 + y, 3, 1);
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(114 + x, 12 + y, 2, 1);
            g2d.fillRect(103 + x, 13 + y, 1, 1);
            g2d.fillRect(108 + x, 13 + y, 1, 2);
            g2d.fillRect(110 + x, 13 + y, 2, 1);
            g2d.fillRect(117 + x, 13 + y, 1, 1);
            g2d.fillRect(99 + x, 14 + y, 1, 1);
            g2d.fillRect(101 + x, 14 + y, 1, 1);
            g2d.fillRect(106 + x, 14 + y, 2, 1);
            g2d.fillRect(112 + x, 14 + y, 1, 2);
            g2d.fillRect(113 + x, 14 + y, 1, 1);
            g2d.fillRect(118 + x, 14 + y, 1, 1);
            g2d.fillRect(98 + x, 15 + y, 1, 1);
            g2d.fillRect(104 + x, 15 + y, 2, 1);
            g2d.fillRect(109 + x, 15 + y, 1, 2);
            g2d.fillRect(114 + x, 15 + y, 1, 1);
            g2d.fillRect(119 + x, 15 + y, 1, 2);
            g2d.fillRect(97 + x, 16 + y, 1, 4);
            g2d.fillRect(103 + x, 16 + y, 1, 1);
            g2d.fillRect(107 + x, 16 + y, 2, 1);
            g2d.fillRect(110 + x, 16 + y, 2, 1);
            g2d.fillRect(120 + x, 16 + y, 1, 1);
            g2d.fillRect(102 + x, 17 + y, 1, 1);
            g2d.fillRect(105 + x, 17 + y, 1, 2);
            g2d.fillRect(106 + x, 17 + y, 1, 1);
            g2d.fillRect(111 + x, 17 + y, 3, 1);
            g2d.fillRect(98 + x, 18 + y, 1, 1);
            g2d.fillRect(101 + x, 18 + y, 1, 2);
            g2d.fillRect(113 + x, 18 + y, 1, 2);
            g2d.fillRect(114 + x, 18 + y, 1, 2);
            g2d.fillRect(118 + x, 18 + y, 1, 1);
            g2d.fillRect(121 + x, 18 + y, 1, 1);
            g2d.fillRect(104 + x, 19 + y, 1, 1);
            g2d.fillRect(115 + x, 19 + y, 1, 2);
            g2d.fillRect(96 + x, 20 + y, 1, 5);
            g2d.fillRect(100 + x, 20 + y, 1, 2);
            g2d.fillRect(103 + x, 20 + y, 1, 2);
            g2d.fillRect(109 + x, 20 + y, 1, 2);
            g2d.fillRect(110 + x, 20 + y, 3, 1);
            g2d.fillRect(116 + x, 20 + y, 1, 1);
            g2d.fillRect(119 + x, 20 + y, 1, 1);
            g2d.fillRect(102 + x, 21 + y, 1, 3);
            g2d.fillRect(108 + x, 21 + y, 1, 1);
            g2d.fillRect(117 + x, 21 + y, 1, 1);
            g2d.fillRect(107 + x, 22 + y, 1, 1);
            g2d.fillRect(118 + x, 22 + y, 1, 3);
            g2d.fillRect(99 + x, 23 + y, 1, 3);
            g2d.fillRect(106 + x, 23 + y, 1, 2);
            g2d.fillRect(101 + x, 24 + y, 1, 4);
            g2d.fillRect(105 + x, 25 + y, 1, 1);
            g2d.fillRect(119 + x, 25 + y, 1, 10);
            g2d.fillRect(121 + x, 25 + y, 1, 11);
            g2d.fillRect(98 + x, 26 + y, 1, 6);
            g2d.fillRect(100 + x, 27 + y, 1, 5);
            g2d.fillRect(105 + x, 27 + y, 1, 4);
            g2d.fillRect(104 + x, 29 + y, 1, 1);
            g2d.fillRect(99 + x, 31 + y, 1, 1);
            g2d.fillRect(103 + x, 33 + y, 1, 3);
            g2d.fillRect(117 + x, 34 + y, 1, 9);
            g2d.fillRect(105 + x, 35 + y, 1, 4);
            g2d.fillRect(106 + x, 35 + y, 1, 1);
            g2d.fillRect(115 + x, 36 + y, 1, 5);
            g2d.fillRect(114 + x, 37 + y, 1, 1);
            g2d.fillRect(113 + x, 38 + y, 1, 1);
            g2d.fillRect(111 + x, 39 + y, 2, 1);
            g2d.fillRect(112 + x, 40 + y, 3, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(112 + x, 12 + y, 2, 1);
            g2d.fillRect(116 + x, 13 + y, 1, 2);
            g2d.fillRect(117 + x, 14 + y, 1, 2);
            g2d.fillRect(107 + x, 15 + y, 2, 1);
            g2d.fillRect(118 + x, 15 + y, 1, 1);
            g2d.fillRect(98 + x, 16 + y, 1, 1);
            g2d.fillRect(106 + x, 16 + y, 1, 1);
            g2d.fillRect(104 + x, 18 + y, 1, 1);
            g2d.fillRect(103 + x, 19 + y, 1, 1);
            g2d.fillRect(119 + x, 19 + y, 1, 1);
            g2d.fillRect(102 + x, 20 + y, 1, 1);
            g2d.fillRect(120 + x, 20 + y, 1, 3);
            g2d.fillRect(101 + x, 21 + y, 1, 3);
            g2d.fillRect(121 + x, 23 + y, 1, 2);
            g2d.fillRect(100 + x, 24 + y, 1, 3);
            g2d.fillRect(99 + x, 28 + y, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(100 + x, 13 + y, 1, 3);
            g2d.fillRect(101 + x, 13 + y, 1, 1);
            g2d.fillRect(114 + x, 13 + y, 2, 1);
            g2d.fillRect(99 + x, 15 + y, 1, 2);
            g2d.fillRect(120 + x, 17 + y, 1, 1);
            g2d.fillRect(121 + x, 21 + y, 1, 2);
            g2d.fillRect(118 + x, 36 + y, 1, 6);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(104 + x, 12 + y, 3, 1);
            g2d.fillRect(102 + x, 13 + y, 1, 1);
            g2d.fillRect(109 + x, 13 + y, 1, 2);
            g2d.fillRect(110 + x, 14 + y, 1, 2);
            g2d.fillRect(111 + x, 14 + y, 1, 2);
            g2d.fillRect(106 + x, 15 + y, 1, 1);
            g2d.fillRect(113 + x, 15 + y, 1, 1);
            g2d.fillRect(104 + x, 16 + y, 1, 2);
            g2d.fillRect(105 + x, 16 + y, 1, 1);
            g2d.fillRect(115 + x, 16 + y, 2, 1);
            g2d.fillRect(98 + x, 17 + y, 1, 1);
            g2d.fillRect(103 + x, 17 + y, 1, 2);
            g2d.fillRect(114 + x, 17 + y, 1, 1);
            g2d.fillRect(117 + x, 17 + y, 1, 1);
            g2d.fillRect(102 + x, 18 + y, 1, 2);
            g2d.fillRect(115 + x, 18 + y, 1, 1);
            g2d.fillRect(108 + x, 19 + y, 1, 2);
            g2d.fillRect(109 + x, 19 + y, 4, 1);
            g2d.fillRect(116 + x, 19 + y, 1, 1);
            g2d.fillRect(118 + x, 19 + y, 1, 1);
            g2d.fillRect(97 + x, 20 + y, 1, 2);
            g2d.fillRect(101 + x, 20 + y, 1, 1);
            g2d.fillRect(107 + x, 20 + y, 1, 2);
            g2d.fillRect(117 + x, 20 + y, 1, 1);
            g2d.fillRect(110 + x, 21 + y, 2, 1);
            g2d.fillRect(119 + x, 21 + y, 1, 1);
            g2d.fillRect(100 + x, 22 + y, 1, 2);
            g2d.fillRect(106 + x, 22 + y, 1, 1);
            g2d.fillRect(108 + x, 22 + y, 1, 2);
            g2d.fillRect(109 + x, 22 + y, 1, 1);
            g2d.fillRect(105 + x, 23 + y, 1, 1);
            g2d.fillRect(107 + x, 23 + y, 1, 3);
            g2d.fillRect(120 + x, 23 + y, 1, 2);
            g2d.fillRect(104 + x, 24 + y, 1, 5);
            g2d.fillRect(106 + x, 25 + y, 1, 1);
            g2d.fillRect(99 + x, 26 + y, 1, 2);
            g2d.fillRect(103 + x, 29 + y, 1, 4);
            g2d.fillRect(118 + x, 33 + y, 1, 3);
            g2d.fillRect(114 + x, 38 + y, 1, 2);
            g2d.fillRect(113 + x, 39 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(104 + x, 14 + y, 2, 1);
            g2d.fillRect(102 + x, 15 + y, 2, 1);
            g2d.fillRect(101 + x, 16 + y, 1, 1);
            g2d.fillRect(100 + x, 17 + y, 1, 1);
            g2d.fillRect(106 + x, 21 + y, 1, 1);
            g2d.fillRect(105 + x, 22 + y, 1, 1);
            g2d.fillRect(105 + x, 24 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(112 + x, 18 + y, 1, 1);
            g2d.fillRect(100 + x, 19 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(102 + x, 16 + y, 1, 1);
            g2d.fillRect(112 + x, 16 + y, 3, 1);
            g2d.fillRect(101 + x, 17 + y, 1, 1);
            g2d.fillRect(115 + x, 17 + y, 2, 1);
            g2d.fillRect(100 + x, 18 + y, 1, 1);
            g2d.fillRect(108 + x, 18 + y, 4, 1);
            g2d.fillRect(116 + x, 18 + y, 2, 1);
            g2d.fillRect(99 + x, 19 + y, 1, 4);
            g2d.fillRect(107 + x, 19 + y, 1, 1);
            g2d.fillRect(117 + x, 19 + y, 1, 1);
            g2d.fillRect(106 + x, 20 + y, 1, 1);
            g2d.fillRect(118 + x, 20 + y, 1, 2);
            g2d.fillRect(105 + x, 21 + y, 1, 1);
            g2d.fillRect(98 + x, 22 + y, 1, 4);
            g2d.fillRect(104 + x, 22 + y, 1, 2);
            g2d.fillRect(119 + x, 22 + y, 1, 3);
            g2d.fillRect(103 + x, 24 + y, 1, 5);
            g2d.fillRect(120 + x, 25 + y, 1, 11);
            g2d.fillRect(97 + x, 26 + y, 1, 6);
            g2d.fillRect(102 + x, 29 + y, 1, 3);
            g2d.fillRect(102 + x, 33 + y, 1, 3);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
            g2d.fillRect(102 + x, 32 + y, 1, 1);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d)
    {
        super.drawBack(x,y,g2d);
        if(y == -1)
            y = 0;

        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
            g2d.fillRect(119 + x, 31 + y, 1, 10);
            g2d.fillRect(114 + x, 31 + y, 1, 22);
            g2d.fillRect(120 + x, 35 + y, 1, 11);
            g2d.fillRect(111 + x, 35 + y, 1, 13);
            g2d.fillRect(96 + x, 35 + y, 1, 2);
            g2d.fillRect(93 + x, 35 + y, 1, 18);
            g2d.fillRect(96 + x, 39 + y, 1, 4);
            g2d.fillRect(99 + x, 43 + y, 1, 3);
            g2d.fillRect(97 + x, 43 + y, 1, 3);
            g2d.fillRect(95 + x, 43 + y, 1, 3);
            g2d.fillRect(96 + x, 44 + y, 1, 6);
            g2d.fillRect(94 + x, 44 + y, 1, 3);
            g2d.fillRect(100 + x, 45 + y, 1, 12);
            g2d.fillRect(112 + x, 47 + y, 1, 3);
            g2d.fillRect(95 + x, 47 + y, 1, 6);
            g2d.fillRect(99 + x, 48 + y, 1, 1);
            g2d.fillRect(113 + x, 49 + y, 1, 2);
            g2d.fillRect(98 + x, 49 + y, 1, 1);
            g2d.fillRect(97 + x, 50 + y, 1, 2);
            g2d.fillRect(96 + x, 51 + y, 1, 2);
            g2d.fillRect(119 + x, 54 + y, 1, 3);
            g2d.fillRect(115 + x, 54 + y, 1, 7);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(110 + x, 25 + y, 1, 3);
            g2d.fillRect(117 + x, 31 + y, 1, 6);
            g2d.fillRect(116 + x, 31 + y, 1, 23);
            g2d.fillRect(115 + x, 31 + y, 1, 4);
            g2d.fillRect(112 + x, 35 + y, 1, 9);
            g2d.fillRect(94 + x, 35 + y, 1, 6);
            g2d.fillRect(119 + x, 41 + y, 1, 3);
            g2d.fillRect(110 + x, 43 + y, 1, 3);
            g2d.fillRect(109 + x, 43 + y, 1, 2);
            g2d.fillRect(113 + x, 45 + y, 1, 1);
            g2d.fillRect(99 + x, 46 + y, 1, 2);
            g2d.fillRect(95 + x, 46 + y, 1, 1);
            g2d.fillRect(110 + x, 47 + y, 1, 2);
            g2d.fillRect(98 + x, 47 + y, 1, 2);
            g2d.fillRect(109 + x, 48 + y, 1, 3);
            g2d.fillRect(99 + x, 49 + y, 1, 5);
            g2d.fillRect(97 + x, 49 + y, 1, 1);
            g2d.fillRect(112 + x, 50 + y, 1, 12);
            g2d.fillRect(111 + x, 50 + y, 1, 1);
            g2d.fillRect(98 + x, 50 + y, 1, 11);
            g2d.fillRect(96 + x, 50 + y, 1, 1);
            g2d.fillRect(113 + x, 51 + y, 1, 2);
            g2d.fillRect(114 + x, 53 + y, 1, 4);
            g2d.fillRect(96 + x, 53 + y, 1, 10);
            g2d.fillRect(95 + x, 53 + y, 1, 6);
            g2d.fillRect(118 + x, 54 + y, 1, 9);
            g2d.fillRect(117 + x, 54 + y, 1, 7);
            g2d.fillRect(97 + x, 55 + y, 1, 2);
            g2d.fillRect(113 + x, 57 + y, 1, 2);
            g2d.fillRect(116 + x, 60 + y, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(117 + x, 37 + y, 1, 17);
            g2d.fillRect(96 + x, 37 + y, 1, 2);
            g2d.fillRect(94 + x, 41 + y, 1, 1);
            g2d.fillRect(98 + x, 43 + y, 1, 4);
            g2d.fillRect(96 + x, 43 + y, 1, 1);
            g2d.fillRect(112 + x, 44 + y, 1, 3);
            g2d.fillRect(113 + x, 46 + y, 1, 3);
            g2d.fillRect(97 + x, 47 + y, 1, 2);
            g2d.fillRect(94 + x, 47 + y, 1, 4);
            g2d.fillRect(94 + x, 52 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(119 + x, 44 + y, 1, 10);
            g2d.fillRect(97 + x, 46 + y, 1, 1);
            g2d.fillRect(111 + x, 48 + y, 1, 2);
            g2d.fillRect(110 + x, 49 + y, 1, 2);
            g2d.fillRect(94 + x, 51 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(115 + x, 35 + y, 1, 19);
            g2d.fillRect(97 + x, 53 + y, 1, 2);
            g2d.fillRect(116 + x, 54 + y, 1, 6);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(118 + x, 33 + y, 1, 1);
            g2d.fillRect(97 + x, 52 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(118 + x, 31 + y, 1, 2);
            g2d.fillRect(118 + x, 34 + y, 1, 20);
            g2d.fillRect(113 + x, 35 + y, 1, 10);
            g2d.fillRect(95 + x, 35 + y, 1, 8);
            g2d.fillRect(94 + x, 42 + y, 1, 2);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
            g2d.fillRect(96 + x, 31 + y, 1, 10);
            g2d.fillRect(101 + x, 31 + y, 1, 22);
            g2d.fillRect(95 + x, 35 + y, 1, 11);
            g2d.fillRect(104 + x, 35 + y, 1, 13);
            g2d.fillRect(119 + x, 35 + y, 1, 2);
            g2d.fillRect(122 + x, 35 + y, 1, 18);
            g2d.fillRect(119 + x, 39 + y, 1, 4);
            g2d.fillRect(116 + x, 43 + y, 1, 3);
            g2d.fillRect(118 + x, 43 + y, 1, 3);
            g2d.fillRect(120 + x, 43 + y, 1, 3);
            g2d.fillRect(119 + x, 44 + y, 1, 6);
            g2d.fillRect(121 + x, 44 + y, 1, 3);
            g2d.fillRect(115 + x, 45 + y, 1, 12);
            g2d.fillRect(103 + x, 47 + y, 1, 3);
            g2d.fillRect(120 + x, 47 + y, 1, 6);
            g2d.fillRect(116 + x, 48 + y, 1, 1);
            g2d.fillRect(102 + x, 49 + y, 1, 2);
            g2d.fillRect(117 + x, 49 + y, 1, 1);
            g2d.fillRect(118 + x, 50 + y, 1, 2);
            g2d.fillRect(119 + x, 51 + y, 1, 2);
            g2d.fillRect(96 + x, 54 + y, 1, 3);
            g2d.fillRect(100 + x, 54 + y, 1, 7);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
            g2d.fillRect(105 + x, 25 + y, 1, 3);
            g2d.fillRect(98 + x, 31 + y, 1, 6);
            g2d.fillRect(99 + x, 31 + y, 1, 23);
            g2d.fillRect(100 + x, 31 + y, 1, 4);
            g2d.fillRect(103 + x, 35 + y, 1, 9);
            g2d.fillRect(121 + x, 35 + y, 1, 6);
            g2d.fillRect(96 + x, 41 + y, 1, 3);
            g2d.fillRect(105 + x, 43 + y, 1, 3);
            g2d.fillRect(106 + x, 43 + y, 1, 2);
            g2d.fillRect(102 + x, 45 + y, 1, 1);
            g2d.fillRect(116 + x, 46 + y, 1, 2);
            g2d.fillRect(120 + x, 46 + y, 1, 1);
            g2d.fillRect(105 + x, 47 + y, 1, 2);
            g2d.fillRect(117 + x, 47 + y, 1, 2);
            g2d.fillRect(106 + x, 48 + y, 1, 3);
            g2d.fillRect(116 + x, 49 + y, 1, 5);
            g2d.fillRect(118 + x, 49 + y, 1, 1);
            g2d.fillRect(103 + x, 50 + y, 1, 12);
            g2d.fillRect(104 + x, 50 + y, 1, 1);
            g2d.fillRect(117 + x, 50 + y, 1, 11);
            g2d.fillRect(119 + x, 50 + y, 1, 1);
            g2d.fillRect(102 + x, 51 + y, 1, 2);
            g2d.fillRect(101 + x, 53 + y, 1, 4);
            g2d.fillRect(119 + x, 53 + y, 1, 10);
            g2d.fillRect(120 + x, 53 + y, 1, 6);
            g2d.fillRect(97 + x, 54 + y, 1, 9);
            g2d.fillRect(98 + x, 54 + y, 1, 7);
            g2d.fillRect(118 + x, 55 + y, 1, 2);
            g2d.fillRect(102 + x, 57 + y, 1, 2);
            g2d.fillRect(99 + x, 60 + y, 1, 5);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(98 + x, 37 + y, 1, 17);
            g2d.fillRect(119 + x, 37 + y, 1, 2);
            g2d.fillRect(121 + x, 41 + y, 1, 1);
            g2d.fillRect(117 + x, 43 + y, 1, 4);
            g2d.fillRect(119 + x, 43 + y, 1, 1);
            g2d.fillRect(103 + x, 44 + y, 1, 3);
            g2d.fillRect(102 + x, 46 + y, 1, 3);
            g2d.fillRect(118 + x, 47 + y, 1, 2);
            g2d.fillRect(121 + x, 47 + y, 1, 4);
            g2d.fillRect(121 + x, 52 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(96 + x, 44 + y, 1, 10);
            g2d.fillRect(118 + x, 46 + y, 1, 1);
            g2d.fillRect(104 + x, 48 + y, 1, 2);
            g2d.fillRect(105 + x, 49 + y, 1, 2);
            g2d.fillRect(121 + x, 51 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(100 + x, 35 + y, 1, 19);
            g2d.fillRect(118 + x, 53 + y, 1, 2);
            g2d.fillRect(99 + x, 54 + y, 1, 6);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(97 + x, 33 + y, 1, 1);
            g2d.fillRect(118 + x, 52 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(97 + x, 31 + y, 1, 2);
            g2d.fillRect(97 + x, 34 + y, 1, 20);
            g2d.fillRect(102 + x, 35 + y, 1, 10);
            g2d.fillRect(120 + x, 35 + y, 1, 8);
            g2d.fillRect(121 + x, 42 + y, 1, 2);
        }
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d)
    {
    }

}
