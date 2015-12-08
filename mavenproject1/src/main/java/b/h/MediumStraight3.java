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
public class MediumStraight3 extends SuperH
{
    public MediumStraight3()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumStraight3(int step, int dir)
    {
        super(step, dir);
    }

    public MediumStraight3(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d)
    {
        super.drawFront(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(117 + x, 24 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(94 + x, 27 + y, 1, 1);
            g2d.fillRect(93 + x, 26 + y, 1, 1);
            g2d.fillRect(117 + x, 26 + y, 1, 2);
            g2d.fillRect(109 + x, 22 + y, 1, 1);
            g2d.fillRect(108 + x, 21 + y, 1, 1);
            g2d.fillRect(107 + x, 20 + y, 1, 1);
            g2d.fillRect(100 + x, 19 + y, 1, 1);
            g2d.fillRect(106 + x, 19 + y, 1, 1);
            g2d.fillRect(117 + x, 19 + y, 1, 1);
            g2d.fillRect(118 + x, 18 + y, 1, 1);
            g2d.fillRect(117 + x, 16 + y, 1, 2);
            g2d.fillRect(107 + x, 15 + y, 3, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(92 + x, 29 + y, 2, 1);
            g2d.fillRect(118 + x, 26 + y, 1, 1);
            g2d.fillRect(117 + x, 25 + y, 1, 1);
            g2d.fillRect(93 + x, 24 + y, 1, 2);
            g2d.fillRect(94 + x, 22 + y, 1, 2);
            g2d.fillRect(97 + x, 21 + y, 1, 3);
            g2d.fillRect(96 + x, 18 + y, 1, 2);
            g2d.fillRect(116 + x, 17 + y, 1, 1);
            g2d.fillRect(103 + x, 17 + y, 3, 1);
            g2d.fillRect(115 + x, 18 + y, 3, 1);
            g2d.fillRect(115 + x, 24 + y, 2, 1);
            g2d.fillRect(115 + x, 27 + y, 2, 1);
            g2d.fillRect(92 + x, 25 + y, 1, 3);
            g2d.fillRect(95 + x, 19 + y, 1, 3);
            g2d.fillRect(96 + x, 23 + y, 1, 3);
            g2d.fillRect(95 + x, 25 + y, 1, 4);
            g2d.fillRect(94 + x, 28 + y, 1, 1);
            g2d.fillRect(114 + x, 26 + y, 2, 1);
            g2d.fillRect(111 + x, 25 + y, 4, 1);
            g2d.fillRect(110 + x, 23 + y, 6, 1);
            g2d.fillRect(111 + x, 22 + y, 5, 1);
            g2d.fillRect(112 + x, 19 + y, 4, 1);
            g2d.fillRect(111 + x, 18 + y, 2, 1);
            g2d.fillRect(109 + x, 17 + y, 3, 1);
            g2d.fillRect(106 + x, 16 + y, 4, 1);
            g2d.fillRect(102 + x, 18 + y, 2, 1);
            g2d.fillRect(101 + x, 19 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(94 + x, 24 + y, 1, 1);
            g2d.fillRect(110 + x, 22 + y, 1, 1);
            g2d.fillRect(107 + x, 21 + y, 1, 1);
            g2d.fillRect(109 + x, 21 + y, 1, 1);
            g2d.fillRect(106 + x, 20 + y, 1, 1);
            g2d.fillRect(108 + x, 20 + y, 1, 1);
            g2d.fillRect(107 + x, 19 + y, 1, 1);
            g2d.fillRect(97 + x, 18 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(110 + x, 25 + y, 1, 1);
            g2d.fillRect(109 + x, 24 + y, 1, 1);
            g2d.fillRect(108 + x, 23 + y, 1, 1);
            g2d.fillRect(106 + x, 22 + y, 1, 1);
            g2d.fillRect(105 + x, 21 + y, 1, 1);
            g2d.fillRect(97 + x, 20 + y, 1, 1);
            g2d.fillRect(101 + x, 20 + y, 1, 1);
            g2d.fillRect(109 + x, 20 + y, 1, 1);
            g2d.fillRect(116 + x, 20 + y, 1, 2);
            g2d.fillRect(99 + x, 19 + y, 1, 1);
            g2d.fillRect(103 + x, 19 + y, 1, 1);
            g2d.fillRect(108 + x, 19 + y, 1, 1);
            g2d.fillRect(111 + x, 19 + y, 1, 1);
            g2d.fillRect(110 + x, 18 + y, 1, 1);
            g2d.fillRect(106 + x, 17 + y, 3, 1);
            g2d.fillRect(104 + x, 18 + y, 3, 1);
            g2d.fillRect(110 + x, 21 + y, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(93 + x, 27 + y, 1, 2);
            g2d.fillRect(94 + x, 25 + y, 1, 2);
            g2d.fillRect(110 + x, 24 + y, 5, 1);
            g2d.fillRect(109 + x, 23 + y, 1, 1);
            g2d.fillRect(107 + x, 22 + y, 2, 1);
            g2d.fillRect(106 + x, 21 + y, 1, 1);
            g2d.fillRect(96 + x, 20 + y, 1, 3);
            g2d.fillRect(97 + x, 19 + y, 2, 1);
            g2d.fillRect(116 + x, 19 + y, 1, 1);
            g2d.fillRect(110 + x, 20 + y, 6, 1);
            g2d.fillRect(109 + x, 19 + y, 2, 1);
            g2d.fillRect(107 + x, 18 + y, 3, 1);
            g2d.fillRect(104 + x, 19 + y, 2, 1);
            g2d.fillRect(102 + x, 20 + y, 4, 1);
            g2d.fillRect(115 + x, 25 + y, 1, 1);
            g2d.fillRect(116 + x, 25 + y, 1, 2);
            g2d.fillRect(95 + x, 22 + y, 1, 3);
            g2d.fillRect(92 + x, 28 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(98 + x, 24 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(121 + x, 27 + y, 1, 1);
            g2d.fillRect(122 + x, 26 + y, 1, 1);
            g2d.fillRect(98 + x, 26 + y, 1, 2);
            g2d.fillRect(106 + x, 22 + y, 1, 1);
            g2d.fillRect(107 + x, 21 + y, 1, 1);
            g2d.fillRect(108 + x, 20 + y, 1, 1);
            g2d.fillRect(115 + x, 19 + y, 1, 1);
            g2d.fillRect(109 + x, 19 + y, 1, 1);
            g2d.fillRect(98 + x, 19 + y, 1, 1);
            g2d.fillRect(97 + x, 18 + y, 1, 1);
            g2d.fillRect(98 + x, 16 + y, 1, 2);
            g2d.fillRect(106 + x, 15 + y, 3, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(122 + x, 29 + y, 2, 1);
            g2d.fillRect(97 + x, 26 + y, 1, 1);
            g2d.fillRect(98 + x, 25 + y, 1, 1);
            g2d.fillRect(122 + x, 24 + y, 1, 2);
            g2d.fillRect(121 + x, 22 + y, 1, 2);
            g2d.fillRect(118 + x, 21 + y, 1, 3);
            g2d.fillRect(119 + x, 18 + y, 1, 2);
            g2d.fillRect(99 + x, 17 + y, 1, 1);
            g2d.fillRect(110 + x, 17 + y, 3, 1);
            g2d.fillRect(98 + x, 18 + y, 3, 1);
            g2d.fillRect(99 + x, 24 + y, 2, 1);
            g2d.fillRect(99 + x, 27 + y, 2, 1);
            g2d.fillRect(123 + x, 25 + y, 1, 3);
            g2d.fillRect(120 + x, 19 + y, 1, 3);
            g2d.fillRect(119 + x, 23 + y, 1, 3);
            g2d.fillRect(120 + x, 25 + y, 1, 4);
            g2d.fillRect(121 + x, 28 + y, 1, 1);
            g2d.fillRect(100 + x, 26 + y, 2, 1);
            g2d.fillRect(101 + x, 25 + y, 4, 1);
            g2d.fillRect(100 + x, 23 + y, 6, 1);
            g2d.fillRect(100 + x, 22 + y, 5, 1);
            g2d.fillRect(100 + x, 19 + y, 4, 1);
            g2d.fillRect(103 + x, 18 + y, 2, 1);
            g2d.fillRect(104 + x, 17 + y, 3, 1);
            g2d.fillRect(106 + x, 16 + y, 4, 1);
            g2d.fillRect(112 + x, 18 + y, 2, 1);
            g2d.fillRect(113 + x, 19 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(121 + x, 24 + y, 1, 1);
            g2d.fillRect(105 + x, 22 + y, 1, 1);
            g2d.fillRect(108 + x, 21 + y, 1, 1);
            g2d.fillRect(106 + x, 21 + y, 1, 1);
            g2d.fillRect(109 + x, 20 + y, 1, 1);
            g2d.fillRect(107 + x, 20 + y, 1, 1);
            g2d.fillRect(108 + x, 19 + y, 1, 1);
            g2d.fillRect(117 + x, 18 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(105 + x, 25 + y, 1, 1);
            g2d.fillRect(106 + x, 24 + y, 1, 1);
            g2d.fillRect(107 + x, 23 + y, 1, 1);
            g2d.fillRect(109 + x, 22 + y, 1, 1);
            g2d.fillRect(110 + x, 21 + y, 1, 1);
            g2d.fillRect(118 + x, 20 + y, 1, 1);
            g2d.fillRect(114 + x, 20 + y, 1, 1);
            g2d.fillRect(106 + x, 20 + y, 1, 1);
            g2d.fillRect(99 + x, 20 + y, 1, 2);
            g2d.fillRect(116 + x, 19 + y, 1, 1);
            g2d.fillRect(112 + x, 19 + y, 1, 1);
            g2d.fillRect(107 + x, 19 + y, 1, 1);
            g2d.fillRect(104 + x, 19 + y, 1, 1);
            g2d.fillRect(105 + x, 18 + y, 1, 1);
            g2d.fillRect(107 + x, 17 + y, 3, 1);
            g2d.fillRect(109 + x, 18 + y, 3, 1);
            g2d.fillRect(100 + x, 21 + y, 6, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(122 + x, 27 + y, 1, 2);
            g2d.fillRect(121 + x, 25 + y, 1, 2);
            g2d.fillRect(101 + x, 24 + y, 5, 1);
            g2d.fillRect(106 + x, 23 + y, 1, 1);
            g2d.fillRect(107 + x, 22 + y, 2, 1);
            g2d.fillRect(109 + x, 21 + y, 1, 1);
            g2d.fillRect(119 + x, 20 + y, 1, 3);
            g2d.fillRect(117 + x, 19 + y, 2, 1);
            g2d.fillRect(99 + x, 19 + y, 1, 1);
            g2d.fillRect(100 + x, 20 + y, 6, 1);
            g2d.fillRect(105 + x, 19 + y, 2, 1);
            g2d.fillRect(106 + x, 18 + y, 3, 1);
            g2d.fillRect(110 + x, 19 + y, 2, 1);
            g2d.fillRect(110 + x, 20 + y, 4, 1);
            g2d.fillRect(100 + x, 25 + y, 1, 1);
            g2d.fillRect(99 + x, 25 + y, 1, 2);
            g2d.fillRect(120 + x, 22 + y, 1, 3);
            g2d.fillRect(123 + x, 28 + y, 1, 1);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        super.drawMiddle(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(102 + x, 16 + y, 2, 1);
            g2d.fillRect(106 + x, 13 + y, 1, 2);
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(105 + x, 14 + y, 1, 1);
            g2d.fillRect(104 + x, 15 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(119 + x, 26 + y, 2, 1);
            g2d.fillRect(118 + x, 25 + y, 1, 1);
            g2d.fillRect(116 + x, 22 + y, 1, 1);
            g2d.fillRect(119 + x, 22 + y, 1, 2);
            g2d.fillRect(118 + x, 19 + y, 1, 2);
            g2d.fillRect(102 + x, 17 + y, 1, 1);
            g2d.fillRect(104 + x, 16 + y, 2, 1);
            g2d.fillRect(99 + x, 15 + y, 1, 1);
            g2d.fillRect(103 + x, 15 + y, 1, 1);
            g2d.fillRect(106 + x, 15 + y, 1, 1);
            g2d.fillRect(105 + x, 13 + y, 1, 1);
            g2d.fillRect(107 + x, 13 + y, 1, 2);
            g2d.fillRect(102 + x, 12 + y, 1, 1);
            g2d.fillRect(106 + x, 12 + y, 1, 1);
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(112 + x, 12 + y, 1, 1);
            g2d.fillRect(103 + x, 11 + y, 9, 1);
            g2d.fillRect(100 + x, 14 + y, 5, 1);
            g2d.fillRect(110 + x, 15 + y, 2, 1);
            g2d.fillRect(108 + x, 14 + y, 3, 1);
            g2d.fillRect(117 + x, 20 + y, 1, 5);
            g2d.fillRect(118 + x, 23 + y, 1, 1);
            g2d.fillRect(101 + x, 40 + y, 2, 1);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(121 + x, 28 + y, 1, 1);
            g2d.fillRect(120 + x, 27 + y, 1, 1);
            g2d.fillRect(117 + x, 26 + y, 1, 3);
            g2d.fillRect(116 + x, 23 + y, 1, 1);
            g2d.fillRect(117 + x, 19 + y, 1, 1);
            g2d.fillRect(119 + x, 19 + y, 1, 3);
            g2d.fillRect(118 + x, 18 + y, 1, 1);
            g2d.fillRect(95 + x, 16 + y, 1, 1);
            g2d.fillRect(98 + x, 15 + y, 1, 3);
            g2d.fillRect(107 + x, 15 + y, 3, 1);
            g2d.fillRect(97 + x, 14 + y, 1, 1);
            g2d.fillRect(98 + x, 13 + y, 2, 1);
            g2d.fillRect(104 + x, 13 + y, 1, 1);
            g2d.fillRect(108 + x, 13 + y, 1, 1);
            g2d.fillRect(109 + x, 12 + y, 3, 1);
            g2d.fillRect(103 + x, 12 + y, 3, 1);
            g2d.fillRect(112 + x, 15 + y, 1, 1);
            g2d.fillRect(100 + x, 15 + y, 3, 1);
            g2d.fillRect(96 + x, 15 + y, 1, 1);
            g2d.fillRect(94 + x, 18 + y, 2, 1);
            g2d.fillRect(108 + x, 25 + y, 3, 1);
            g2d.fillRect(113 + x, 12 + y, 1, 1);
            g2d.fillRect(114 + x, 12 + y, 1, 2);
            g2d.fillRect(115 + x, 13 + y, 1, 2);
            g2d.fillRect(116 + x, 15 + y, 1, 1);
            g2d.fillRect(117 + x, 15 + y, 1, 2);
            g2d.fillRect(111 + x, 16 + y, 3, 1);
            g2d.fillRect(113 + x, 17 + y, 2, 1);
            g2d.fillRect(114 + x, 18 + y, 1, 1);
            g2d.fillRect(100 + x, 12 + y, 1, 1);
            g2d.fillRect(101 + x, 12 + y, 1, 2);
            g2d.fillRect(96 + x, 16 + y, 2, 2);
            g2d.fillRect(94 + x, 19 + y, 1, 4);
            g2d.fillRect(101 + x, 16 + y, 1, 3);
            g2d.fillRect(99 + x, 18 + y, 1, 1);
            g2d.fillRect(100 + x, 18 + y, 1, 3);
            g2d.fillRect(98 + x, 20 + y, 2, 1);
            g2d.fillRect(98 + x, 22 + y, 1, 1);
            g2d.fillRect(98 + x, 21 + y, 8, 1);
            g2d.fillRect(104 + x, 22 + y, 4, 1);
            g2d.fillRect(106 + x, 23 + y, 3, 1);
            g2d.fillRect(108 + x, 24 + y, 2, 1);
            g2d.fillRect(118 + x, 21 + y, 1, 1);
            g2d.fillRect(120 + x, 20 + y, 1, 1);
            g2d.fillRect(121 + x, 20 + y, 1, 4);
            g2d.fillRect(120 + x, 23 + y, 1, 3);
            g2d.fillRect(119 + x, 24 + y, 1, 2);

            g2d.fillRect(103 + x, 39 + y, 2, 1);
            g2d.fillRect(102 + x, 38 + y, 1, 1);
            g2d.fillRect(101 + x, 37 + y, 1, 1);
            g2d.fillRect(100 + x, 36 + y, 1, 1);
            g2d.fillRect(99 + x, 35 + y, 1, 1);
            g2d.fillRect(98 + x, 34 + y, 1, 1);
            g2d.fillRect(97 + x, 33 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(114 + x, 26 + y, 1, 1);
            g2d.fillRect(118 + x, 26 + y, 1, 2);
            g2d.fillRect(92 + x, 25 + y, 1, 1);
            g2d.fillRect(111 + x, 25 + y, 3, 1);
            g2d.fillRect(93 + x, 24 + y, 1, 1);
            g2d.fillRect(116 + x, 24 + y, 1, 1);
            g2d.fillRect(118 + x, 24 + y, 1, 1);
            g2d.fillRect(118 + x, 22 + y, 1, 1);
            g2d.fillRect(95 + x, 19 + y, 1, 1);
            g2d.fillRect(101 + x, 19 + y, 1, 1);
            g2d.fillRect(113 + x, 19 + y, 2, 1);
            g2d.fillRect(96 + x, 18 + y, 1, 1);
            g2d.fillRect(102 + x, 18 + y, 1, 1);
            g2d.fillRect(112 + x, 18 + y, 1, 1);
            g2d.fillRect(115 + x, 18 + y, 1, 1);
            g2d.fillRect(103 + x, 17 + y, 3, 1);
            g2d.fillRect(110 + x, 17 + y, 2, 1);
            g2d.fillRect(106 + x, 16 + y, 1, 1);
            g2d.fillRect(116 + x, 16 + y, 1, 2);
            g2d.fillRect(114 + x, 14 + y, 1, 1);
            g2d.fillRect(112 + x, 13 + y, 2, 1);
            g2d.fillRect(119 + x, 28 + y, 2, 1);
            g2d.fillRect(119 + x, 27 + y, 1, 1);
            g2d.fillRect(115 + x, 27 + y, 1, 1);
            g2d.fillRect(116 + x, 27 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(118 + x, 28 + y, 1, 1);
            g2d.fillRect(97 + x, 18 + y, 2, 1);
            g2d.fillRect(113 + x, 18 + y, 1, 1);
            g2d.fillRect(95 + x, 17 + y, 1, 1);
            g2d.fillRect(112 + x, 17 + y, 1, 1);
            g2d.fillRect(110 + x, 16 + y, 1, 1);
            g2d.fillRect(115 + x, 15 + y, 1, 1);
            g2d.fillRect(100 + x, 13 + y, 1, 1);
            g2d.fillRect(102 + x, 13 + y, 1, 1);
            g2d.fillRect(111 + x, 13 + y, 1, 2);
            g2d.fillRect(112 + x, 14 + y, 2, 1);
            g2d.fillRect(99 + x, 16 + y, 2, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(116 + x, 21 + y, 1, 1);
            g2d.fillRect(101 + x, 20 + y, 4, 1);
            g2d.fillRect(98 + x, 19 + y, 2, 1);
            g2d.fillRect(98 + x, 14 + y, 2, 1);
            g2d.fillRect(103 + x, 13 + y, 1, 1);
            g2d.fillRect(109 + x, 13 + y, 2, 1);
            g2d.fillRect(113 + x, 15 + y, 1, 1);
            g2d.fillRect(114 + x, 15 + y, 1, 2);
            g2d.fillRect(115 + x, 16 + y, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(97 + x, 15 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(112 + x, 16 + y, 2, 1);
            g2d.fillRect(109 + x, 13 + y, 1, 2);
            g2d.fillRect(108 + x, 12 + y, 1, 1);
            g2d.fillRect(110 + x, 14 + y, 1, 1);
            g2d.fillRect(110 + x, 15 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(95 + x, 26 + y, 2, 1);
            g2d.fillRect(97 + x, 25 + y, 1, 1);
            g2d.fillRect(99 + x, 22 + y, 1, 1);
            g2d.fillRect(96 + x, 22 + y, 1, 2);
            g2d.fillRect(97 + x, 19 + y, 1, 2);
            g2d.fillRect(113 + x, 17 + y, 1, 1);
            g2d.fillRect(110 + x, 16 + y, 2, 1);
            g2d.fillRect(116 + x, 15 + y, 1, 1);
            g2d.fillRect(112 + x, 15 + y, 1, 1);
            g2d.fillRect(109 + x, 15 + y, 1, 1);
            g2d.fillRect(110 + x, 13 + y, 1, 1);
            g2d.fillRect(108 + x, 13 + y, 1, 2);
            g2d.fillRect(113 + x, 12 + y, 1, 1);
            g2d.fillRect(109 + x, 12 + y, 1, 1);
            g2d.fillRect(107 + x, 12 + y, 1, 1);
            g2d.fillRect(103 + x, 12 + y, 1, 1);
            g2d.fillRect(104 + x, 11 + y, 9, 1);
            g2d.fillRect(111 + x, 14 + y, 5, 1);
            g2d.fillRect(104 + x, 15 + y, 2, 1);
            g2d.fillRect(105 + x, 14 + y, 3, 1);
            g2d.fillRect(98 + x, 20 + y, 1, 5);
            g2d.fillRect(97 + x, 23 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(94 + x, 28 + y, 1, 1);
            g2d.fillRect(95 + x, 27 + y, 1, 1);
            g2d.fillRect(98 + x, 26 + y, 1, 3);
            g2d.fillRect(99 + x, 23 + y, 1, 1);
            g2d.fillRect(98 + x, 19 + y, 1, 1);
            g2d.fillRect(96 + x, 19 + y, 1, 3);
            g2d.fillRect(97 + x, 18 + y, 1, 1);
            g2d.fillRect(120 + x, 16 + y, 1, 1);
            g2d.fillRect(117 + x, 15 + y, 1, 3);
            g2d.fillRect(106 + x, 15 + y, 3, 1);
            g2d.fillRect(118 + x, 14 + y, 1, 1);
            g2d.fillRect(116 + x, 13 + y, 2, 1);
            g2d.fillRect(111 + x, 13 + y, 1, 1);
            g2d.fillRect(107 + x, 13 + y, 1, 1);
            g2d.fillRect(104 + x, 12 + y, 3, 1);
            g2d.fillRect(110 + x, 12 + y, 3, 1);
            g2d.fillRect(103 + x, 15 + y, 1, 1);
            g2d.fillRect(113 + x, 15 + y, 3, 1);
            g2d.fillRect(119 + x, 15 + y, 1, 1);
            g2d.fillRect(120 + x, 18 + y, 2, 1);
            g2d.fillRect(105 + x, 25 + y, 3, 1);
            g2d.fillRect(102 + x, 12 + y, 1, 1);
            g2d.fillRect(101 + x, 12 + y, 1, 2);
            g2d.fillRect(100 + x, 13 + y, 1, 2);
            g2d.fillRect(99 + x, 15 + y, 1, 1);
            g2d.fillRect(98 + x, 15 + y, 1, 2);
            g2d.fillRect(102 + x, 16 + y, 3, 1);
            g2d.fillRect(101 + x, 17 + y, 2, 1);
            g2d.fillRect(101 + x, 18 + y, 1, 1);
            g2d.fillRect(115 + x, 12 + y, 1, 1);
            g2d.fillRect(114 + x, 12 + y, 1, 2);
            g2d.fillRect(118 + x, 16 + y, 2, 2);
            g2d.fillRect(121 + x, 19 + y, 1, 4);
            g2d.fillRect(114 + x, 16 + y, 1, 3);
            g2d.fillRect(116 + x, 18 + y, 1, 1);
            g2d.fillRect(115 + x, 18 + y, 1, 3);
            g2d.fillRect(116 + x, 20 + y, 2, 1);
            g2d.fillRect(117 + x, 22 + y, 1, 1);
            g2d.fillRect(110 + x, 21 + y, 8, 1);
            g2d.fillRect(108 + x, 22 + y, 4, 1);
            g2d.fillRect(107 + x, 23 + y, 3, 1);
            g2d.fillRect(106 + x, 24 + y, 2, 1);
            g2d.fillRect(97 + x, 21 + y, 1, 1);
            g2d.fillRect(95 + x, 20 + y, 1, 1);
            g2d.fillRect(94 + x, 20 + y, 1, 4);
            g2d.fillRect(95 + x, 23 + y, 1, 3);
            g2d.fillRect(96 + x, 24 + y, 1, 2);

            g2d.fillRect(111 + x, 39 + y, 2, 1);
            g2d.fillRect(113 + x, 38 + y, 1, 1);
            g2d.fillRect(114 + x, 37 + y, 1, 1);
            g2d.fillRect(115 + x, 36 + y, 1, 1);
            g2d.fillRect(116 + x, 35 + y, 1, 1);
            g2d.fillRect(117 + x, 34 + y, 1, 1);
            g2d.fillRect(118 + x, 33 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(101 + x, 26 + y, 1, 1);
            g2d.fillRect(97 + x, 26 + y, 1, 2);
            g2d.fillRect(123 + x, 25 + y, 1, 1);
            g2d.fillRect(102 + x, 25 + y, 3, 1);
            g2d.fillRect(122 + x, 24 + y, 1, 1);
            g2d.fillRect(99 + x, 24 + y, 1, 1);
            g2d.fillRect(97 + x, 24 + y, 1, 1);
            g2d.fillRect(97 + x, 22 + y, 1, 1);
            g2d.fillRect(120 + x, 19 + y, 1, 1);
            g2d.fillRect(114 + x, 19 + y, 1, 1);
            g2d.fillRect(101 + x, 19 + y, 2, 1);
            g2d.fillRect(119 + x, 18 + y, 1, 1);
            g2d.fillRect(113 + x, 18 + y, 1, 1);
            g2d.fillRect(103 + x, 18 + y, 1, 1);
            g2d.fillRect(100 + x, 18 + y, 1, 1);
            g2d.fillRect(110 + x, 17 + y, 3, 1);
            g2d.fillRect(104 + x, 17 + y, 2, 1);
            g2d.fillRect(109 + x, 16 + y, 1, 1);
            g2d.fillRect(99 + x, 16 + y, 1, 2);
            g2d.fillRect(101 + x, 14 + y, 1, 1);
            g2d.fillRect(102 + x, 13 + y, 2, 1);
            g2d.fillRect(95 + x, 28 + y, 2, 1);
            g2d.fillRect(96 + x, 27 + y, 1, 1);
            g2d.fillRect(100 + x, 27 + y, 1, 1);
            g2d.fillRect(99 + x, 27 + y, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(97 + x, 28 + y, 1, 1);
            g2d.fillRect(117 + x, 18 + y, 2, 1);
            g2d.fillRect(102 + x, 18 + y, 1, 1);
            g2d.fillRect(120 + x, 17 + y, 1, 1);
            g2d.fillRect(103 + x, 17 + y, 1, 1);
            g2d.fillRect(105 + x, 16 + y, 1, 1);
            g2d.fillRect(100 + x, 15 + y, 1, 1);
            g2d.fillRect(115 + x, 13 + y, 1, 1);
            g2d.fillRect(113 + x, 13 + y, 1, 1);
            g2d.fillRect(104 + x, 13 + y, 1, 2);
            g2d.fillRect(102 + x, 14 + y, 2, 1);
            g2d.fillRect(115 + x, 16 + y, 2, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(99 + x, 21 + y, 1, 1);
            g2d.fillRect(111 + x, 20 + y, 4, 1);
            g2d.fillRect(116 + x, 19 + y, 2, 1);
            g2d.fillRect(116 + x, 14 + y, 2, 1);
            g2d.fillRect(112 + x, 13 + y, 1, 1);
            g2d.fillRect(105 + x, 13 + y, 2, 1);
            g2d.fillRect(102 + x, 15 + y, 1, 1);
            g2d.fillRect(101 + x, 15 + y, 1, 2);
            g2d.fillRect(100 + x, 16 + y, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(118 + x, 15 + y, 1, 1);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d)
    {
        super.drawBack(x,y,g2d);
        if(y == -1)
            y = 0;

        if(direction.equalsIgnoreCase("left"))
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(96 + x, 43 + y, 1, 1);
            g2d.fillRect(114 + x, 43 + y, 1, 1);
            g2d.fillRect(97 + x, 42 + y, 1, 1);
            g2d.fillRect(99 + x, 41 + y, 1, 1);
            g2d.fillRect(100 + x, 40 + y, 1, 1);
            g2d.fillRect(100 + x, 37 + y, 1, 1);
            g2d.fillRect(114 + x, 37 + y, 1, 3);
            g2d.fillRect(111 + x, 36 + y, 1, 5);
            g2d.fillRect(113 + x, 36 + y, 1, 1);
            g2d.fillRect(97 + x, 35 + y, 1, 2);
            g2d.fillRect(98 + x, 34 + y, 1, 1);
            g2d.fillRect(112 + x, 34 + y, 1, 1);
            g2d.fillRect(111 + x, 33 + y, 1, 1);
            g2d.fillRect(111 + x, 28 + y, 1, 4);
            g2d.fillRect(102 + x, 38 + y, 1, 1);
            g2d.fillRect(101 + x, 39 + y, 4, 1);
            g2d.fillRect(96 + x, 36 + y, 1, 3);
            g2d.fillRect(95 + x, 38 + y, 1, 2);
            g2d.fillRect(94 + x, 39 + y, 1, 1);
            g2d.fillRect(92 + x, 40 + y, 3, 1);
            g2d.fillRect(95 + x, 44 + y, 1, 2);
            g2d.fillRect(94 + x, 44 + y, 1, 3);
            g2d.fillRect(112 + x, 38 + y, 1, 4);
            g2d.fillRect(113 + x, 40 + y, 1, 3);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(93 + x, 54 + y, 1, 1);
            g2d.fillRect(119 + x, 53 + y, 4, 1);
            g2d.fillRect(117 + x, 52 + y, 2, 1);
            g2d.fillRect(93 + x, 51 + y, 1, 2);
            g2d.fillRect(116 + x, 51 + y, 1, 1);
            g2d.fillRect(94 + x, 50 + y, 1, 1);
            g2d.fillRect(122 + x, 45 + y, 1, 1);
            g2d.fillRect(96 + x, 44 + y, 1, 9);
            g2d.fillRect(114 + x, 44 + y, 1, 1);
            g2d.fillRect(97 + x, 43 + y, 1, 1);
            g2d.fillRect(113 + x, 43 + y, 1, 1);
            g2d.fillRect(120 + x, 43 + y, 1, 3);
            g2d.fillRect(98 + x, 42 + y, 1, 1);
            g2d.fillRect(119 + x, 42 + y, 1, 1);
            g2d.fillRect(93 + x, 41 + y, 1, 1);
            g2d.fillRect(95 + x, 40 + y, 1, 2);
            g2d.fillRect(120 + x, 39 + y, 1, 1);
            g2d.fillRect(121 + x, 38 + y, 1, 1);
            g2d.fillRect(115 + x, 37 + y, 1, 14);
            g2d.fillRect(113 + x, 35 + y, 1, 1);
            g2d.fillRect(111 + x, 32 + y, 1, 1);
            g2d.fillRect(117 + x, 31 + y, 1, 3);
            g2d.fillRect(120 + x, 31 + y, 1, 5);
            g2d.fillRect(112 + x, 30 + y, 1, 2);
            g2d.fillRect(114 + x, 30 + y, 1, 1);
            g2d.fillRect(111 + x, 27 + y, 1, 1);
            g2d.fillRect(114 + x, 26 + y, 1, 2);
            g2d.fillRect(96 + x, 25 + y, 1, 3);
            g2d.fillRect(121 + x, 44 + y, 1, 1);
            g2d.fillRect(116 + x, 47 + y, 1, 1);
            g2d.fillRect(115 + x, 27 + y, 1, 3);
            g2d.fillRect(95 + x, 28 + y, 1, 3);
            g2d.fillRect(94 + x, 28 + y, 1, 2);
            g2d.fillRect(93 + x, 29 + y, 1, 6);
            g2d.fillRect(92 + x, 29 + y, 1, 2);
            g2d.fillRect(121 + x, 33 + y, 1, 2);
            g2d.fillRect(122 + x, 34 + y, 1, 4);
            g2d.fillRect(120 + x, 37 + y, 2, 1);
            g2d.fillRect(116 + x, 38 + y, 1, 1);
            g2d.fillRect(117 + x, 38 + y, 1, 6);
            g2d.fillRect(118 + x, 40 + y, 1, 2);
            g2d.fillRect(121 + x, 42 + y, 2, 1);
            g2d.fillRect(122 + x, 43 + y, 2, 1);
            g2d.fillRect(123 + x, 44 + y, 2, 1);
            g2d.fillRect(124 + x, 45 + y, 1, 2);
            g2d.fillRect(123 + x, 46 + y, 1, 3);
            g2d.fillRect(117 + x, 48 + y, 1, 1);
            g2d.fillRect(118 + x, 48 + y, 1, 2);
            g2d.fillRect(92 + x, 45 + y, 1, 1);
            g2d.fillRect(93 + x, 45 + y, 1, 3);
            g2d.fillRect(95 + x, 46 + y, 1, 4);
            g2d.fillRect(92 + x, 52 + y, 1, 1);
            g2d.fillRect(95 + x, 51 + y, 1, 3);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(119 + x, 52 + y, 3, 1);
            g2d.fillRect(116 + x, 48 + y, 1, 3);
            g2d.fillRect(119 + x, 48 + y, 2, 1);
            g2d.fillRect(93 + x, 44 + y, 1, 1);
            g2d.fillRect(122 + x, 44 + y, 1, 1);
            g2d.fillRect(116 + x, 43 + y, 1, 4);
            g2d.fillRect(119 + x, 43 + y, 1, 4);
            g2d.fillRect(121 + x, 43 + y, 1, 1);
            g2d.fillRect(93 + x, 42 + y, 1, 1);
            g2d.fillRect(114 + x, 40 + y, 1, 3);
            g2d.fillRect(92 + x, 39 + y, 2, 1);
            g2d.fillRect(96 + x, 39 + y, 1, 1);
            g2d.fillRect(118 + x, 39 + y, 1, 1);
            g2d.fillRect(94 + x, 38 + y, 1, 1);
            g2d.fillRect(95 + x, 37 + y, 1, 1);
            g2d.fillRect(101 + x, 37 + y, 1, 2);
            g2d.fillRect(96 + x, 35 + y, 1, 1);
            g2d.fillRect(114 + x, 35 + y, 1, 2);
            g2d.fillRect(111 + x, 34 + y, 1, 2);
            g2d.fillRect(97 + x, 33 + y, 1, 2);
            g2d.fillRect(112 + x, 32 + y, 1, 2);
            g2d.fillRect(95 + x, 31 + y, 1, 3);
            g2d.fillRect(115 + x, 30 + y, 1, 4);
            g2d.fillRect(96 + x, 28 + y, 1, 3);
            g2d.fillRect(114 + x, 28 + y, 1, 2);
            g2d.fillRect(117 + x, 28 + y, 1, 3);
            g2d.fillRect(113 + x, 25 + y, 1, 3);
            g2d.fillRect(98 + x, 35 + y, 2, 1);
            g2d.fillRect(120 + x, 36 + y, 1, 1);
            g2d.fillRect(119 + x, 38 + y, 2, 1);
            g2d.fillRect(117 + x, 47 + y, 2, 1);
            g2d.fillRect(117 + x, 51 + y, 2, 1);
            g2d.fillRect(119 + x, 28 + y, 3, 2);
            g2d.fillRect(118 + x, 30 + y, 3, 1);
            g2d.fillRect(119 + x, 31 + y, 1, 7);
            g2d.fillRect(117 + x, 35 + y, 2, 1);
            g2d.fillRect(116 + x, 34 + y, 2, 1);
            g2d.fillRect(116 + x, 33 + y, 1, 1);
            g2d.fillRect(116 + x, 37 + y, 3, 1);
            g2d.fillRect(115 + x, 36 + y, 2, 1);
            g2d.fillRect(113 + x, 33 + y, 1, 2);
            g2d.fillRect(112 + x, 35 + y, 1, 3);
            g2d.fillRect(113 + x, 37 + y, 1, 3);
            g2d.fillRect(119 + x, 41 + y, 1, 1);
            g2d.fillRect(120 + x, 41 + y, 1, 2);
            g2d.fillRect(117 + x, 46 + y, 1, 1);
            g2d.fillRect(117 + x, 50 + y, 1, 1);
            g2d.fillRect(94 + x, 33 + y, 1, 3);
            g2d.fillRect(93 + x, 35 + y, 1, 2);
            g2d.fillRect(92 + x, 36 + y, 1, 2);
            g2d.fillRect(98 + x, 36 + y, 1, 2);
            g2d.fillRect(97 + x, 37 + y, 1, 2);
            g2d.fillRect(100 + x, 38 + y, 1, 2);
            g2d.fillRect(99 + x, 39 + y, 1, 2);
            g2d.fillRect(98 + x, 40 + y, 1, 1);
            g2d.fillRect(96 + x, 41 + y, 3, 1);
            g2d.fillRect(95 + x, 42 + y, 2, 1);
            g2d.fillRect(94 + x, 43 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(118 + x, 42 + y, 1, 3);
            g2d.fillRect(120 + x, 40 + y, 1, 1);
            g2d.fillRect(118 + x, 38 + y, 1, 1);
            g2d.fillRect(116 + x, 31 + y, 1, 2);
            g2d.fillRect(118 + x, 28 + y, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(94 + x, 53 + y, 1, 2);
            g2d.fillRect(92 + x, 51 + y, 1, 1);
            g2d.fillRect(120 + x, 51 + y, 1, 1);
            g2d.fillRect(93 + x, 50 + y, 1, 1);
            g2d.fillRect(119 + x, 50 + y, 1, 1);
            g2d.fillRect(94 + x, 47 + y, 1, 3);
            g2d.fillRect(120 + x, 47 + y, 1, 1);
            g2d.fillRect(92 + x, 44 + y, 1, 1);
            g2d.fillRect(119 + x, 39 + y, 1, 2);
            g2d.fillRect(118 + x, 36 + y, 1, 1);
            g2d.fillRect(115 + x, 35 + y, 1, 1);
            g2d.fillRect(113 + x, 32 + y, 1, 1);
            g2d.fillRect(118 + x, 31 + y, 1, 4);
            g2d.fillRect(112 + x, 29 + y, 1, 1);
            g2d.fillRect(111 + x, 25 + y, 1, 2);
            g2d.fillRect(99 + x, 36 + y, 2, 1);
            g2d.fillRect(99 + x, 37 + y, 1, 2);
            g2d.fillRect(98 + x, 38 + y, 1, 2);
            g2d.fillRect(97 + x, 39 + y, 1, 2);
            g2d.fillRect(96 + x, 40 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(93 + x, 53 + y, 1, 1);
            g2d.fillRect(94 + x, 51 + y, 1, 2);
            g2d.fillRect(119 + x, 51 + y, 1, 1);
            g2d.fillRect(95 + x, 50 + y, 1, 1);
            g2d.fillRect(118 + x, 50 + y, 1, 1);
            g2d.fillRect(117 + x, 49 + y, 1, 1);
            g2d.fillRect(119 + x, 47 + y, 1, 1);
            g2d.fillRect(117 + x, 44 + y, 1, 2);
            g2d.fillRect(93 + x, 43 + y, 1, 1);
            g2d.fillRect(94 + x, 41 + y, 1, 2);
            g2d.fillRect(116 + x, 39 + y, 1, 4);
            g2d.fillRect(117 + x, 36 + y, 1, 1);
            g2d.fillRect(116 + x, 35 + y, 1, 1);
            g2d.fillRect(96 + x, 31 + y, 1, 4);
            g2d.fillRect(94 + x, 30 + y, 1, 3);
            g2d.fillRect(116 + x, 28 + y, 1, 3);
            g2d.fillRect(112 + x, 25 + y, 1, 4);
            g2d.fillRect(114 + x, 34 + y, 2, 1);
            g2d.fillRect(118 + x, 45 + y, 1, 2);
            g2d.fillRect(114 + x, 31 + y, 1, 3);
            g2d.fillRect(113 + x, 28 + y, 1, 4);
            g2d.fillRect(95 + x, 34 + y, 1, 3);
            g2d.fillRect(94 + x, 36 + y, 1, 2);
            g2d.fillRect(93 + x, 37 + y, 1, 2);
            g2d.fillRect(92 + x, 38 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(119 + x, 43 + y, 1, 1);
            g2d.fillRect(101 + x, 43 + y, 1, 1);
            g2d.fillRect(118 + x, 42 + y, 1, 1);
            g2d.fillRect(116 + x, 41 + y, 1, 1);
            g2d.fillRect(115 + x, 40 + y, 1, 1);
            g2d.fillRect(115 + x, 37 + y, 1, 1);
            g2d.fillRect(101 + x, 37 + y, 1, 3);
            g2d.fillRect(104 + x, 36 + y, 1, 5);
            g2d.fillRect(102 + x, 36 + y, 1, 1);
            g2d.fillRect(118 + x, 35 + y, 1, 2);
            g2d.fillRect(117 + x, 34 + y, 1, 1);
            g2d.fillRect(103 + x, 34 + y, 1, 1);
            g2d.fillRect(104 + x, 33 + y, 1, 1);
            g2d.fillRect(104 + x, 28 + y, 1, 4);
            g2d.fillRect(113 + x, 38 + y, 1, 1);
            g2d.fillRect(111 + x, 39 + y, 4, 1);
            g2d.fillRect(119 + x, 36 + y, 1, 3);
            g2d.fillRect(120 + x, 38 + y, 1, 2);
            g2d.fillRect(121 + x, 39 + y, 1, 1);
            g2d.fillRect(121 + x, 40 + y, 3, 1);
            g2d.fillRect(120 + x, 44 + y, 1, 2);
            g2d.fillRect(121 + x, 44 + y, 1, 3);
            g2d.fillRect(103 + x, 38 + y, 1, 4);
            g2d.fillRect(102 + x, 40 + y, 1, 3);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(122 + x, 54 + y, 1, 1);
            g2d.fillRect(93 + x, 53 + y, 4, 1);
            g2d.fillRect(97 + x, 52 + y, 2, 1);
            g2d.fillRect(122 + x, 51 + y, 1, 2);
            g2d.fillRect(99 + x, 51 + y, 1, 1);
            g2d.fillRect(121 + x, 50 + y, 1, 1);
            g2d.fillRect(93 + x, 45 + y, 1, 1);
            g2d.fillRect(119 + x, 44 + y, 1, 9);
            g2d.fillRect(101 + x, 44 + y, 1, 1);
            g2d.fillRect(118 + x, 43 + y, 1, 1);
            g2d.fillRect(102 + x, 43 + y, 1, 1);
            g2d.fillRect(95 + x, 43 + y, 1, 3);
            g2d.fillRect(117 + x, 42 + y, 1, 1);
            g2d.fillRect(96 + x, 42 + y, 1, 1);
            g2d.fillRect(122 + x, 41 + y, 1, 1);
            g2d.fillRect(120 + x, 40 + y, 1, 2);
            g2d.fillRect(95 + x, 39 + y, 1, 1);
            g2d.fillRect(94 + x, 38 + y, 1, 1);
            g2d.fillRect(100 + x, 37 + y, 1, 14);
            g2d.fillRect(102 + x, 35 + y, 1, 1);
            g2d.fillRect(104 + x, 32 + y, 1, 1);
            g2d.fillRect(98 + x, 31 + y, 1, 3);
            g2d.fillRect(95 + x, 31 + y, 1, 5);
            g2d.fillRect(103 + x, 30 + y, 1, 2);
            g2d.fillRect(101 + x, 30 + y, 1, 1);
            g2d.fillRect(104 + x, 27 + y, 1, 1);
            g2d.fillRect(101 + x, 26 + y, 1, 2);
            g2d.fillRect(119 + x, 25 + y, 1, 3);
            g2d.fillRect(94 + x, 44 + y, 1, 1);
            g2d.fillRect(99 + x, 47 + y, 1, 1);
            g2d.fillRect(100 + x, 27 + y, 1, 3);
            g2d.fillRect(120 + x, 28 + y, 1, 3);
            g2d.fillRect(121 + x, 28 + y, 1, 2);
            g2d.fillRect(122 + x, 29 + y, 1, 6);
            g2d.fillRect(123 + x, 29 + y, 1, 2);
            g2d.fillRect(94 + x, 33 + y, 1, 2);
            g2d.fillRect(93 + x, 34 + y, 1, 4);
            g2d.fillRect(94 + x, 37 + y, 2, 1);
            g2d.fillRect(99 + x, 38 + y, 1, 1);
            g2d.fillRect(98 + x, 38 + y, 1, 6);
            g2d.fillRect(97 + x, 40 + y, 1, 2);
            g2d.fillRect(93 + x, 42 + y, 2, 1);
            g2d.fillRect(92 + x, 43 + y, 2, 1);
            g2d.fillRect(91 + x, 44 + y, 2, 1);
            g2d.fillRect(91 + x, 45 + y, 1, 2);
            g2d.fillRect(92 + x, 46 + y, 1, 3);
            g2d.fillRect(98 + x, 48 + y, 1, 1);
            g2d.fillRect(97 + x, 48 + y, 1, 2);
            g2d.fillRect(123 + x, 45 + y, 1, 1);
            g2d.fillRect(122 + x, 45 + y, 1, 3);
            g2d.fillRect(120 + x, 46 + y, 1, 4);
            g2d.fillRect(123 + x, 52 + y, 1, 1);
            g2d.fillRect(120 + x, 51 + y, 1, 3);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(94 + x, 52 + y, 3, 1);
            g2d.fillRect(99 + x, 48 + y, 1, 3);
            g2d.fillRect(95 + x, 48 + y, 2, 1);
            g2d.fillRect(122 + x, 44 + y, 1, 1);
            g2d.fillRect(93 + x, 44 + y, 1, 1);
            g2d.fillRect(99 + x, 43 + y, 1, 4);
            g2d.fillRect(96 + x, 43 + y, 1, 4);
            g2d.fillRect(94 + x, 43 + y, 1, 1);
            g2d.fillRect(122 + x, 42 + y, 1, 1);
            g2d.fillRect(101 + x, 40 + y, 1, 3);
            g2d.fillRect(122 + x, 39 + y, 2, 1);
            g2d.fillRect(119 + x, 39 + y, 1, 1);
            g2d.fillRect(97 + x, 39 + y, 1, 1);
            g2d.fillRect(121 + x, 38 + y, 1, 1);
            g2d.fillRect(120 + x, 37 + y, 1, 1);
            g2d.fillRect(114 + x, 37 + y, 1, 2);
            g2d.fillRect(119 + x, 35 + y, 1, 1);
            g2d.fillRect(101 + x, 35 + y, 1, 2);
            g2d.fillRect(104 + x, 34 + y, 1, 2);
            g2d.fillRect(118 + x, 33 + y, 1, 2);
            g2d.fillRect(103 + x, 32 + y, 1, 2);
            g2d.fillRect(120 + x, 31 + y, 1, 3);
            g2d.fillRect(100 + x, 30 + y, 1, 4);
            g2d.fillRect(119 + x, 28 + y, 1, 3);
            g2d.fillRect(101 + x, 28 + y, 1, 2);
            g2d.fillRect(98 + x, 28 + y, 1, 3);
            g2d.fillRect(102 + x, 25 + y, 1, 3);
            g2d.fillRect(116 + x, 35 + y, 2, 1);
            g2d.fillRect(95 + x, 36 + y, 1, 1);
            g2d.fillRect(95 + x, 38 + y, 2, 1);
            g2d.fillRect(97 + x, 47 + y, 2, 1);
            g2d.fillRect(97 + x, 51 + y, 2, 1);
            g2d.fillRect(94 + x, 28 + y, 3, 2);
            g2d.fillRect(95 + x, 30 + y, 3, 1);
            g2d.fillRect(96 + x, 31 + y, 1, 7);
            g2d.fillRect(97 + x, 35 + y, 2, 1);
            g2d.fillRect(98 + x, 34 + y, 2, 1);
            g2d.fillRect(99 + x, 33 + y, 1, 1);
            g2d.fillRect(97 + x, 37 + y, 3, 1);
            g2d.fillRect(99 + x, 36 + y, 2, 1);
            g2d.fillRect(102 + x, 33 + y, 1, 2);
            g2d.fillRect(103 + x, 35 + y, 1, 3);
            g2d.fillRect(102 + x, 37 + y, 1, 3);
            g2d.fillRect(96 + x, 41 + y, 1, 1);
            g2d.fillRect(95 + x, 41 + y, 1, 2);
            g2d.fillRect(98 + x, 46 + y, 1, 1);
            g2d.fillRect(98 + x, 50 + y, 1, 1);
            g2d.fillRect(121 + x, 33 + y, 1, 3);
            g2d.fillRect(122 + x, 35 + y, 1, 2);
            g2d.fillRect(123 + x, 36 + y, 1, 2);
            g2d.fillRect(117 + x, 36 + y, 1, 2);
            g2d.fillRect(118 + x, 37 + y, 1, 2);
            g2d.fillRect(115 + x, 38 + y, 1, 2);
            g2d.fillRect(116 + x, 39 + y, 1, 2);
            g2d.fillRect(117 + x, 40 + y, 1, 1);
            g2d.fillRect(117 + x, 41 + y, 3, 1);
            g2d.fillRect(119 + x, 42 + y, 2, 1);
            g2d.fillRect(120 + x, 43 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(97 + x, 42 + y, 1, 3);
            g2d.fillRect(95 + x, 40 + y, 1, 1);
            g2d.fillRect(97 + x, 38 + y, 1, 1);
            g2d.fillRect(99 + x, 31 + y, 1, 2);
            g2d.fillRect(97 + x, 28 + y, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(121 + x, 53 + y, 1, 2);
            g2d.fillRect(123 + x, 51 + y, 1, 1);
            g2d.fillRect(95 + x, 51 + y, 1, 1);
            g2d.fillRect(122 + x, 50 + y, 1, 1);
            g2d.fillRect(96 + x, 50 + y, 1, 1);
            g2d.fillRect(121 + x, 47 + y, 1, 3);
            g2d.fillRect(95 + x, 47 + y, 1, 1);
            g2d.fillRect(123 + x, 44 + y, 1, 1);
            g2d.fillRect(96 + x, 39 + y, 1, 2);
            g2d.fillRect(97 + x, 36 + y, 1, 1);
            g2d.fillRect(100 + x, 35 + y, 1, 1);
            g2d.fillRect(102 + x, 32 + y, 1, 1);
            g2d.fillRect(97 + x, 31 + y, 1, 4);
            g2d.fillRect(103 + x, 29 + y, 1, 1);
            g2d.fillRect(104 + x, 25 + y, 1, 2);
            g2d.fillRect(115 + x, 36 + y, 2, 1);
            g2d.fillRect(116 + x, 37 + y, 1, 2);
            g2d.fillRect(117 + x, 38 + y, 1, 2);
            g2d.fillRect(118 + x, 39 + y, 1, 2);
            g2d.fillRect(119 + x, 40 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(122 + x, 53 + y, 1, 1);
            g2d.fillRect(121 + x, 51 + y, 1, 2);
            g2d.fillRect(96 + x, 51 + y, 1, 1);
            g2d.fillRect(120 + x, 50 + y, 1, 1);
            g2d.fillRect(97 + x, 50 + y, 1, 1);
            g2d.fillRect(98 + x, 49 + y, 1, 1);
            g2d.fillRect(96 + x, 47 + y, 1, 1);
            g2d.fillRect(98 + x, 44 + y, 1, 2);
            g2d.fillRect(122 + x, 43 + y, 1, 1);
            g2d.fillRect(121 + x, 41 + y, 1, 2);
            g2d.fillRect(99 + x, 39 + y, 1, 4);
            g2d.fillRect(98 + x, 36 + y, 1, 1);
            g2d.fillRect(99 + x, 35 + y, 1, 1);
            g2d.fillRect(119 + x, 31 + y, 1, 4);
            g2d.fillRect(121 + x, 30 + y, 1, 3);
            g2d.fillRect(99 + x, 28 + y, 1, 3);
            g2d.fillRect(103 + x, 25 + y, 1, 4);
            g2d.fillRect(100 + x, 34 + y, 2, 1);
            g2d.fillRect(97 + x, 45 + y, 1, 2);
            g2d.fillRect(101 + x, 31 + y, 1, 3);
            g2d.fillRect(102 + x, 28 + y, 1, 4);
            g2d.fillRect(120 + x, 34 + y, 1, 3);
            g2d.fillRect(121 + x, 36 + y, 1, 2);
            g2d.fillRect(122 + x, 37 + y, 1, 2);
            g2d.fillRect(123 + x, 38 + y, 1, 1);
        }
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d)
    {
    }

}
