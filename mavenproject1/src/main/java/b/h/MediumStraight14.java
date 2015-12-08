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
public class MediumStraight14 extends SuperH
{
    int prevY = 0;

    public MediumStraight14()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumStraight14(int step, int dir)
    {
        super(step, dir);
    }

    public MediumStraight14(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d)
    {
        super.drawFront(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            paintBackF(x,y,g2d);
        }
        else
        {
            paintF(x,y,g2d);
        }
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        super.drawMiddle(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            paintBackM(x,y,g2d);
        }
        else
        {
            paintM(x,y,g2d);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d)
    {
        super.drawBack(x,y,g2d);

        if(direction.equalsIgnoreCase("left"))
        {
            paintBackB(x,prevY,g2d);
        }
        else
        {
            paintB(x,prevY,g2d);
        }
        prevY = y;
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 36 + y, 1, 4);
        g2d.fillRect(111 + x, 34 + y, 1, 6);
        g2d.fillRect(112 + x, 28 + y, 1, 12);
        g2d.fillRect(102 + x, 37 + y, 1, 4);
    }

    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 11 + y, 5, 1);
        g2d.fillRect(102 + x, 12 + y, 3, 1);
        g2d.fillRect(109 + x, 12 + y, 3, 1);
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 4, 1);
        g2d.fillRect(116 + x, 13 + y, 2, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 2, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 1, 2);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 4, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 2);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 3);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 2, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 2);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 25 + y, 1, 2);
        g2d.fillRect(122 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 2);
        g2d.fillRect(100 + x, 27 + y, 1, 1);
        g2d.fillRect(122 + x, 27 + y, 1, 4);
        g2d.fillRect(99 + x, 28 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 2, 1);
        g2d.fillRect(103 + x, 30 + y, 1, 4);
        g2d.fillRect(102 + x, 31 + y, 1, 3);
        g2d.fillRect(119 + x, 31 + y, 1, 2);
        g2d.fillRect(101 + x, 32 + y, 1, 3);
        g2d.fillRect(120 + x, 32 + y, 1, 2);
        g2d.fillRect(100 + x, 33 + y, 1, 3);
        g2d.fillRect(118 + x, 33 + y, 1, 2);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(99 + x, 34 + y, 1, 3);
        g2d.fillRect(117 + x, 34 + y, 1, 1);
        g2d.fillRect(97 + x, 35 + y, 1, 2);
        g2d.fillRect(98 + x, 35 + y, 1, 2);
        g2d.fillRect(105 + x, 35 + y, 1, 3);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(94 + x, 36 + y, 3, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 11 + y, 3, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 3);
        g2d.fillRect(107 + x, 12 + y, 1, 5);
        g2d.fillRect(108 + x, 12 + y, 1, 4);
        g2d.fillRect(109 + x, 13 + y, 1, 4);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 4);
        g2d.fillRect(111 + x, 14 + y, 1, 6);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 3);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 2, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(102 + x, 13 + y, 3, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 3);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 7);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 2, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 3);
        g2d.fillRect(114 + x, 17 + y, 2, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 4);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 3);
        g2d.fillRect(109 + x, 18 + y, 1, 3);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 4);
        g2d.fillRect(114 + x, 19 + y, 1, 2);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 5);
        g2d.fillRect(102 + x, 21 + y, 1, 3);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(120 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 22 + y, 1, 2);
        g2d.fillRect(117 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 4);
        g2d.fillRect(104 + x, 23 + y, 1, 2);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 3);
        g2d.fillRect(100 + x, 24 + y, 1, 3);
        g2d.fillRect(119 + x, 24 + y, 1, 3);
        g2d.fillRect(122 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 4);
        g2d.fillRect(94 + x, 26 + y, 1, 3);
        g2d.fillRect(99 + x, 26 + y, 1, 2);
        g2d.fillRect(120 + x, 26 + y, 1, 2);
        g2d.fillRect(122 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 1, 2);
        g2d.fillRect(101 + x, 27 + y, 1, 3);
        g2d.fillRect(95 + x, 28 + y, 1, 2);
        g2d.fillRect(100 + x, 28 + y, 1, 3);
        g2d.fillRect(121 + x, 28 + y, 1, 3);
        g2d.fillRect(96 + x, 29 + y, 2, 1);
        g2d.fillRect(99 + x, 29 + y, 1, 3);
        g2d.fillRect(98 + x, 30 + y, 1, 3);
        g2d.fillRect(97 + x, 31 + y, 1, 2);
        g2d.fillRect(122 + x, 31 + y, 1, 2);
        g2d.fillRect(96 + x, 32 + y, 1, 1);
        g2d.fillRect(123 + x, 32 + y, 1, 1);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(102 + x, 34 + y, 3, 1);
        g2d.fillRect(120 + x, 34 + y, 1, 2);
        g2d.fillRect(91 + x, 35 + y, 1, 2);
        g2d.fillRect(101 + x, 35 + y, 1, 1);
        g2d.fillRect(104 + x, 35 + y, 1, 3);
        g2d.fillRect(117 + x, 35 + y, 1, 1);
        g2d.fillRect(92 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 36 + y, 1, 2);
        g2d.fillRect(103 + x, 36 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 3);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 22 + y, 2, 1);
        g2d.fillRect(122 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 26 + y, 1, 3);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 27 + y, 2, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 2, 1);
        g2d.fillRect(118 + x, 35 + y, 1, 2);
        g2d.fillRect(93 + x, 36 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(101 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 2);
        g2d.fillRect(117 + x, 36 + y, 1, 1);
        g2d.fillRect(94 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(119 + x, 17 + y, 1, 2);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(121 + x, 19 + y, 1, 3);
        g2d.fillRect(100 + x, 22 + y, 1, 2);
        g2d.fillRect(99 + x, 23 + y, 1, 3);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 37 + y, 3, 1);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 36 + y, 2, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 2);
        g2d.fillRect(117 + x, 38 + y, 1, 1);
        g2d.fillRect(104 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(96 + x, 37 + y, 2, 1);
        g2d.fillRect(105 + x, 37 + y, 1, 1);
        g2d.fillRect(95 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 39 + y, 1, 3);
        g2d.fillRect(115 + x, 39 + y, 1, 3);
        g2d.fillRect(117 + x, 39 + y, 1, 4);
        g2d.fillRect(122 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 2);
        g2d.fillRect(102 + x, 42 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 38 + y, 1, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 3);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 1, 3);
        g2d.fillRect(119 + x, 39 + y, 1, 16);
        g2d.fillRect(98 + x, 40 + y, 1, 3);
        g2d.fillRect(97 + x, 41 + y, 1, 4);
        g2d.fillRect(96 + x, 42 + y, 1, 5);
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(117 + x, 43 + y, 1, 2);
        g2d.fillRect(94 + x, 44 + y, 1, 2);
        g2d.fillRect(100 + x, 44 + y, 1, 4);
        g2d.fillRect(118 + x, 44 + y, 1, 2);
        g2d.fillRect(120 + x, 46 + y, 2, 1);
        g2d.fillRect(99 + x, 47 + y, 1, 2);
        g2d.fillRect(121 + x, 47 + y, 4, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 49 + y, 3, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(95 + x, 52 + y, 2, 1);
        g2d.fillRect(121 + x, 52 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 2);
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(123 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 5, 1);
        g2d.fillRect(120 + x, 37 + y, 2, 1);
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 3, 1);
        g2d.fillRect(114 + x, 38 + y, 2, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 6);
        g2d.fillRect(98 + x, 39 + y, 1, 1);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 1, 2);
        g2d.fillRect(104 + x, 39 + y, 1, 1);
        g2d.fillRect(112 + x, 39 + y, 1, 2);
        g2d.fillRect(113 + x, 39 + y, 1, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 2);
        g2d.fillRect(120 + x, 39 + y, 1, 7);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(93 + x, 43 + y, 2, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 3);
        g2d.fillRect(101 + x, 43 + y, 1, 2);
        g2d.fillRect(121 + x, 43 + y, 1, 3);
        g2d.fillRect(97 + x, 45 + y, 1, 1);
        g2d.fillRect(122 + x, 45 + y, 1, 2);
        g2d.fillRect(93 + x, 46 + y, 2, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(123 + x, 46 + y, 2, 1);
        g2d.fillRect(97 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 47 + y, 1, 1);
        g2d.fillRect(120 + x, 47 + y, 1, 4);
        g2d.fillRect(93 + x, 48 + y, 4, 1);
        g2d.fillRect(121 + x, 48 + y, 4, 1);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(121 + x, 50 + y, 3, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 2);
        g2d.fillRect(97 + x, 52 + y, 1, 1);
        g2d.fillRect(93 + x, 53 + y, 4, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 36 + y, 1, 2);
        g2d.fillRect(98 + x, 37 + y, 1, 2);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 2, 1);
        g2d.fillRect(119 + x, 37 + y, 1, 2);
        g2d.fillRect(122 + x, 37 + y, 1, 2);
        g2d.fillRect(123 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 2);
        g2d.fillRect(116 + x, 38 + y, 1, 1);
        g2d.fillRect(120 + x, 38 + y, 2, 1);
        g2d.fillRect(96 + x, 39 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(95 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 2);
        g2d.fillRect(93 + x, 42 + y, 1, 1);
        g2d.fillRect(91 + x, 43 + y, 2, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 2);
        g2d.fillRect(122 + x, 44 + y, 2, 1);
        g2d.fillRect(123 + x, 45 + y, 3, 1);
        g2d.fillRect(97 + x, 46 + y, 2, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 2, 1);
        g2d.fillRect(121 + x, 49 + y, 3, 1);
        g2d.fillRect(92 + x, 51 + y, 4, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 1);
        g2d.fillRect(124 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(121 + x, 39 + y, 1, 2);
        g2d.fillRect(96 + x, 40 + y, 1, 2);
        g2d.fillRect(122 + x, 40 + y, 1, 4);
        g2d.fillRect(95 + x, 41 + y, 1, 2);
        g2d.fillRect(101 + x, 41 + y, 1, 2);
        g2d.fillRect(94 + x, 42 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(92 + x, 47 + y, 4, 1);
        g2d.fillRect(96 + x, 50 + y, 3, 1);
        g2d.fillRect(122 + x, 51 + y, 2, 1);
        g2d.fillRect(93 + x, 52 + y, 2, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 2);
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 1);
        g2d.fillRect(107 + x, 25 + y, 1, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(106 + x, 26 + y, 1, 2);
        g2d.fillRect(117 + x, 26 + y, 1, 2);
        g2d.fillRect(105 + x, 28 + y, 1, 2);
        g2d.fillRect(118 + x, 28 + y, 1, 1);
        g2d.fillRect(101 + x, 29 + y, 1, 1);
        g2d.fillRect(100 + x, 30 + y, 1, 1);
        g2d.fillRect(104 + x, 30 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 2);
        g2d.fillRect(95 + x, 32 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 20 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 2);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 2);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 2);
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(102 + x, 28 + y, 1, 1);
        g2d.fillRect(104 + x, 29 + y, 1, 1);
        g2d.fillRect(103 + x, 30 + y, 1, 1);
        g2d.fillRect(92 + x, 31 + y, 2, 1);
        g2d.fillRect(99 + x, 31 + y, 1, 1);
        g2d.fillRect(102 + x, 31 + y, 1, 1);
        g2d.fillRect(120 + x, 31 + y, 1, 2);
        g2d.fillRect(98 + x, 32 + y, 1, 1);
        g2d.fillRect(101 + x, 32 + y, 1, 1);
        g2d.fillRect(123 + x, 32 + y, 2, 1);
        g2d.fillRect(100 + x, 33 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(124 + x, 33 + y, 1, 1);
        g2d.fillRect(95 + x, 34 + y, 2, 1);
        g2d.fillRect(99 + x, 34 + y, 1, 1);
        g2d.fillRect(96 + x, 35 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 21 + y, 2, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 2);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 2);
        g2d.fillRect(117 + x, 23 + y, 1, 2);
        g2d.fillRect(118 + x, 24 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(103 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 2);
        g2d.fillRect(101 + x, 30 + y, 1, 1);
        g2d.fillRect(121 + x, 30 + y, 1, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 1);
        g2d.fillRect(93 + x, 32 + y, 2, 1);
        g2d.fillRect(99 + x, 32 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 1, 1);
        g2d.fillRect(97 + x, 33 + y, 1, 1);
        g2d.fillRect(122 + x, 33 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 25 + y, 1, 2);
        g2d.fillRect(119 + x, 26 + y, 1, 2);
        g2d.fillRect(104 + x, 27 + y, 1, 2);
        g2d.fillRect(120 + x, 27 + y, 1, 4);
        g2d.fillRect(103 + x, 28 + y, 1, 2);
        g2d.fillRect(102 + x, 29 + y, 1, 2);
        g2d.fillRect(101 + x, 31 + y, 1, 1);
        g2d.fillRect(121 + x, 31 + y, 1, 2);
        g2d.fillRect(100 + x, 32 + y, 1, 1);
        g2d.fillRect(122 + x, 32 + y, 1, 1);
        g2d.fillRect(95 + x, 33 + y, 2, 1);
        g2d.fillRect(98 + x, 33 + y, 1, 2);
        g2d.fillRect(99 + x, 33 + y, 1, 1);
        g2d.fillRect(97 + x, 34 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 11 + y, 5, 1);
        g2d.fillRect(111 + x, 12 + y, 3, 1);
        g2d.fillRect(104 + x, 12 + y, 3, 1);
        g2d.fillRect(100 + x, 12 + y, 2, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 4, 1);
        g2d.fillRect(98 + x, 13 + y, 2, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(113 + x, 15 + y, 1, 2);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 16 + y, 4, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 3);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 2, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 2);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 2);
        g2d.fillRect(114 + x, 25 + y, 1, 2);
        g2d.fillRect(93 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(94 + x, 26 + y, 1, 2);
        g2d.fillRect(115 + x, 27 + y, 1, 1);
        g2d.fillRect(93 + x, 27 + y, 1, 4);
        g2d.fillRect(116 + x, 28 + y, 1, 1);
        g2d.fillRect(117 + x, 29 + y, 1, 1);
        g2d.fillRect(118 + x, 30 + y, 2, 1);
        g2d.fillRect(112 + x, 30 + y, 1, 4);
        g2d.fillRect(113 + x, 31 + y, 1, 3);
        g2d.fillRect(96 + x, 31 + y, 1, 2);
        g2d.fillRect(114 + x, 32 + y, 1, 3);
        g2d.fillRect(95 + x, 32 + y, 1, 2);
        g2d.fillRect(115 + x, 33 + y, 1, 3);
        g2d.fillRect(97 + x, 33 + y, 1, 2);
        g2d.fillRect(94 + x, 33 + y, 1, 1);
        g2d.fillRect(116 + x, 34 + y, 1, 3);
        g2d.fillRect(98 + x, 34 + y, 1, 1);
        g2d.fillRect(118 + x, 35 + y, 1, 2);
        g2d.fillRect(117 + x, 35 + y, 1, 2);
        g2d.fillRect(110 + x, 35 + y, 1, 3);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 36 + y, 3, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 11 + y, 3, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 3);
        g2d.fillRect(108 + x, 12 + y, 1, 5);
        g2d.fillRect(107 + x, 12 + y, 1, 4);
        g2d.fillRect(106 + x, 13 + y, 1, 4);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 4);
        g2d.fillRect(104 + x, 14 + y, 1, 6);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 3);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(100 + x, 18 + y, 2, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(111 + x, 13 + y, 3, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 3);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 7);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 15 + y, 2, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 3);
        g2d.fillRect(100 + x, 17 + y, 2, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 4);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 3);
        g2d.fillRect(106 + x, 18 + y, 1, 3);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 2);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 4);
        g2d.fillRect(101 + x, 19 + y, 1, 2);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 5);
        g2d.fillRect(113 + x, 21 + y, 1, 3);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(95 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 1, 2);
        g2d.fillRect(98 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 4);
        g2d.fillRect(111 + x, 23 + y, 1, 2);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 3);
        g2d.fillRect(115 + x, 24 + y, 1, 3);
        g2d.fillRect(96 + x, 24 + y, 1, 3);
        g2d.fillRect(93 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 4);
        g2d.fillRect(121 + x, 26 + y, 1, 3);
        g2d.fillRect(116 + x, 26 + y, 1, 2);
        g2d.fillRect(95 + x, 26 + y, 1, 2);
        g2d.fillRect(93 + x, 26 + y, 1, 1);
        g2d.fillRect(117 + x, 27 + y, 1, 2);
        g2d.fillRect(114 + x, 27 + y, 1, 3);
        g2d.fillRect(120 + x, 28 + y, 1, 2);
        g2d.fillRect(115 + x, 28 + y, 1, 3);
        g2d.fillRect(94 + x, 28 + y, 1, 3);
        g2d.fillRect(118 + x, 29 + y, 2, 1);
        g2d.fillRect(116 + x, 29 + y, 1, 3);
        g2d.fillRect(117 + x, 30 + y, 1, 3);
        g2d.fillRect(118 + x, 31 + y, 1, 2);
        g2d.fillRect(93 + x, 31 + y, 1, 2);
        g2d.fillRect(119 + x, 32 + y, 1, 1);
        g2d.fillRect(92 + x, 32 + y, 1, 1);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(111 + x, 34 + y, 3, 1);
        g2d.fillRect(95 + x, 34 + y, 1, 2);
        g2d.fillRect(124 + x, 35 + y, 1, 2);
        g2d.fillRect(114 + x, 35 + y, 1, 1);
        g2d.fillRect(111 + x, 35 + y, 1, 3);
        g2d.fillRect(98 + x, 35 + y, 1, 1);
        g2d.fillRect(123 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 36 + y, 1, 2);
        g2d.fillRect(112 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 2, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 3);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(93 + x, 22 + y, 2, 1);
        g2d.fillRect(93 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(118 + x, 26 + y, 1, 3);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 2, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(112 + x, 35 + y, 2, 1);
        g2d.fillRect(97 + x, 35 + y, 1, 2);
        g2d.fillRect(122 + x, 36 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 2);
        g2d.fillRect(98 + x, 36 + y, 1, 1);
        g2d.fillRect(121 + x, 37 + y, 1, 1);
        g2d.fillRect(116 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(95 + x, 18 + y, 1, 2);
        g2d.fillRect(94 + x, 19 + y, 1, 3);
        g2d.fillRect(115 + x, 22 + y, 1, 2);
        g2d.fillRect(116 + x, 23 + y, 1, 3);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(118 + x, 37 + y, 3, 1);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 36 + y, 2, 1);
        g2d.fillRect(110 + x, 38 + y, 1, 2);
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(118 + x, 37 + y, 2, 1);
        g2d.fillRect(110 + x, 37 + y, 1, 1);
        g2d.fillRect(120 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 1, 3);
        g2d.fillRect(100 + x, 39 + y, 1, 3);
        g2d.fillRect(98 + x, 39 + y, 1, 4);
        g2d.fillRect(93 + x, 39 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 42 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 38 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 1, 3);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 3);
        g2d.fillRect(96 + x, 39 + y, 1, 16);
        g2d.fillRect(117 + x, 40 + y, 1, 3);
        g2d.fillRect(118 + x, 41 + y, 1, 4);
        g2d.fillRect(119 + x, 42 + y, 1, 5);
        g2d.fillRect(120 + x, 43 + y, 1, 4);
        g2d.fillRect(98 + x, 43 + y, 1, 2);
        g2d.fillRect(121 + x, 44 + y, 1, 2);
        g2d.fillRect(115 + x, 44 + y, 1, 4);
        g2d.fillRect(97 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 46 + y, 2, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(91 + x, 47 + y, 4, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 3, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 2, 1);
        g2d.fillRect(92 + x, 52 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 2);
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(92 + x, 36 + y, 1, 1);
        g2d.fillRect(111 + x, 37 + y, 5, 1);
        g2d.fillRect(94 + x, 37 + y, 2, 1);
        g2d.fillRect(116 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 38 + y, 3, 1);
        g2d.fillRect(100 + x, 38 + y, 2, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 6);
        g2d.fillRect(117 + x, 39 + y, 1, 1);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(112 + x, 39 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 1, 2);
        g2d.fillRect(102 + x, 39 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 1, 2);
        g2d.fillRect(95 + x, 39 + y, 1, 7);
        g2d.fillRect(118 + x, 40 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(121 + x, 43 + y, 2, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 3);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(94 + x, 43 + y, 1, 3);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 2);
        g2d.fillRect(121 + x, 46 + y, 2, 1);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(91 + x, 46 + y, 2, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 4);
        g2d.fillRect(119 + x, 48 + y, 4, 1);
        g2d.fillRect(91 + x, 48 + y, 4, 1);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 2);
        g2d.fillRect(92 + x, 50 + y, 3, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 4, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 2);
        g2d.fillRect(92 + x, 53 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 36 + y, 1, 2);
        g2d.fillRect(117 + x, 37 + y, 1, 2);
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 2, 1);
        g2d.fillRect(96 + x, 37 + y, 1, 2);
        g2d.fillRect(93 + x, 37 + y, 1, 2);
        g2d.fillRect(92 + x, 37 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 2);
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(94 + x, 38 + y, 2, 1);
        g2d.fillRect(119 + x, 39 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 2);
        g2d.fillRect(122 + x, 42 + y, 1, 1);
        g2d.fillRect(123 + x, 43 + y, 2, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(92 + x, 44 + y, 2, 1);
        g2d.fillRect(90 + x, 45 + y, 3, 1);
        g2d.fillRect(117 + x, 46 + y, 2, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 2, 1);
        g2d.fillRect(92 + x, 49 + y, 3, 1);
        g2d.fillRect(120 + x, 51 + y, 4, 1);
        g2d.fillRect(94 + x, 51 + y, 1, 1);
        g2d.fillRect(91 + x, 51 + y, 1, 1);
        g2d.fillRect(92 + x, 54 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(94 + x, 39 + y, 1, 2);
        g2d.fillRect(119 + x, 40 + y, 1, 2);
        g2d.fillRect(93 + x, 40 + y, 1, 4);
        g2d.fillRect(120 + x, 41 + y, 1, 2);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(121 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(120 + x, 47 + y, 4, 1);
        g2d.fillRect(117 + x, 50 + y, 3, 1);
        g2d.fillRect(92 + x, 51 + y, 2, 1);
        g2d.fillRect(121 + x, 52 + y, 2, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 1);
        g2d.fillRect(108 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(109 + x, 26 + y, 1, 2);
        g2d.fillRect(98 + x, 26 + y, 1, 2);
        g2d.fillRect(110 + x, 28 + y, 1, 2);
        g2d.fillRect(97 + x, 28 + y, 1, 1);
        g2d.fillRect(114 + x, 29 + y, 1, 1);
        g2d.fillRect(115 + x, 30 + y, 1, 1);
        g2d.fillRect(111 + x, 30 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 2);
        g2d.fillRect(118 + x, 32 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 2);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 2);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 2);
        g2d.fillRect(97 + x, 27 + y, 1, 1);
        g2d.fillRect(113 + x, 28 + y, 1, 1);
        g2d.fillRect(111 + x, 29 + y, 1, 1);
        g2d.fillRect(112 + x, 30 + y, 1, 1);
        g2d.fillRect(122 + x, 31 + y, 2, 1);
        g2d.fillRect(116 + x, 31 + y, 1, 1);
        g2d.fillRect(113 + x, 31 + y, 1, 1);
        g2d.fillRect(95 + x, 31 + y, 1, 2);
        g2d.fillRect(117 + x, 32 + y, 1, 1);
        g2d.fillRect(114 + x, 32 + y, 1, 1);
        g2d.fillRect(91 + x, 32 + y, 2, 1);
        g2d.fillRect(115 + x, 33 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 1, 1);
        g2d.fillRect(91 + x, 33 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 2, 1);
        g2d.fillRect(116 + x, 34 + y, 1, 1);
        g2d.fillRect(117 + x, 35 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 21 + y, 2, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 2);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 2);
        g2d.fillRect(98 + x, 23 + y, 1, 2);
        g2d.fillRect(97 + x, 24 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(112 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 2);
        g2d.fillRect(114 + x, 30 + y, 1, 1);
        g2d.fillRect(94 + x, 30 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 1);
        g2d.fillRect(121 + x, 32 + y, 2, 1);
        g2d.fillRect(116 + x, 32 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 1);
        g2d.fillRect(118 + x, 33 + y, 1, 1);
        g2d.fillRect(92 + x, 33 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 25 + y, 1, 2);
        g2d.fillRect(96 + x, 26 + y, 1, 2);
        g2d.fillRect(111 + x, 27 + y, 1, 2);
        g2d.fillRect(95 + x, 27 + y, 1, 4);
        g2d.fillRect(112 + x, 28 + y, 1, 2);
        g2d.fillRect(113 + x, 29 + y, 1, 2);
        g2d.fillRect(114 + x, 31 + y, 1, 1);
        g2d.fillRect(94 + x, 31 + y, 1, 2);
        g2d.fillRect(115 + x, 32 + y, 1, 1);
        g2d.fillRect(93 + x, 32 + y, 1, 1);
        g2d.fillRect(119 + x, 33 + y, 2, 1);
        g2d.fillRect(117 + x, 33 + y, 1, 2);
        g2d.fillRect(116 + x, 33 + y, 1, 1);
        g2d.fillRect(118 + x, 34 + y, 1, 1);
    }
}
