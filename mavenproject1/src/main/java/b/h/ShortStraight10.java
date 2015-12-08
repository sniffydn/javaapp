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
public class ShortStraight10 extends SuperH
{
    public ShortStraight10()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public ShortStraight10(int step, int dir)
    {
        super(step, dir);
    }

    public ShortStraight10(int step, int dir, ColorArray colorSwitch)
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
            paintBackB(x,y,g2d);
        }
        else
        {
            paintB(x,y,g2d);
        }
    }

    public void drawVeryBack(int x, int y, GraphicsMap g2d)
    {
    }

    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(93 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 36 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 26 + y, 1, 7);
        g2d.fillRect(103 + x, 34 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 22 + y, 1, 2);
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(93 + x, 25 + y, 1, 2);
        g2d.fillRect(94 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 31 + y, 1, 5);
        g2d.fillRect(100 + x, 34 + y, 1, 9);
        g2d.fillRect(101 + x, 34 + y, 1, 2);
        g2d.fillRect(103 + x, 40 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(92 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 4);
        g2d.fillRect(95 + x, 30 + y, 1, 2);
        g2d.fillRect(95 + x, 33 + y, 1, 3);
        g2d.fillRect(97 + x, 34 + y, 1, 6);
        g2d.fillRect(98 + x, 34 + y, 1, 5);
        g2d.fillRect(102 + x, 34 + y, 1, 11);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(104 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(104 + x, 38 + y, 1, 3);
        g2d.fillRect(101 + x, 39 + y, 1, 3);
        g2d.fillRect(99 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(92 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 1, 2);
        g2d.fillRect(95 + x, 26 + y, 1, 4);
        g2d.fillRect(95 + x, 32 + y, 1, 1);
        g2d.fillRect(104 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(104 + x, 37 + y, 1, 1);
        g2d.fillRect(99 + x, 38 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(93 + x, 24 + y, 2, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 34 + y, 1, 1);
        g2d.fillRect(98 + x, 39 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(116 + x, 32 + y, 1, 7);
        g2d.fillRect(116 + x, 40 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 2);
        g2d.fillRect(114 + x, 27 + y, 1, 2);
        g2d.fillRect(115 + x, 29 + y, 1, 1);
        g2d.fillRect(116 + x, 31 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 3, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);
        g2d.fillRect(116 + x, 30 + y, 1, 1);
        g2d.fillRect(118 + x, 33 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 27 + y, 2, 1);
        g2d.fillRect(113 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 2, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(112 + x, 25 + y, 1, 2);
        g2d.fillRect(116 + x, 25 + y, 1, 2);
        g2d.fillRect(120 + x, 25 + y, 1, 5);
        g2d.fillRect(118 + x, 26 + y, 1, 5);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 8);
        g2d.fillRect(122 + x, 26 + y, 1, 5);
        g2d.fillRect(117 + x, 27 + y, 1, 2);
        g2d.fillRect(119 + x, 29 + y, 1, 6);
        g2d.fillRect(117 + x, 30 + y, 1, 2);
        g2d.fillRect(117 + x, 37 + y, 1, 5);
        g2d.fillRect(117 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 3);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 2, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 2);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 2);
        g2d.fillRect(116 + x, 28 + y, 1, 2);
        g2d.fillRect(117 + x, 32 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 24 + y, 1, 2);
        g2d.fillRect(115 + x, 25 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 2);
        g2d.fillRect(117 + x, 29 + y, 1, 1);
        g2d.fillRect(120 + x, 30 + y, 1, 6);
        g2d.fillRect(118 + x, 31 + y, 1, 2);
        g2d.fillRect(119 + x, 35 + y, 1, 3);
        g2d.fillRect(115 + x, 36 + y, 1, 4);
        g2d.fillRect(114 + x, 38 + y, 1, 3);
        g2d.fillRect(118 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(117 + x, 42 + y, 1, 1);
    }





    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 3);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 2, 1);
        g2d.fillRect(122 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 27 + y, 1, 3);
        g2d.fillRect(98 + x, 31 + y, 1, 1);
        g2d.fillRect(101 + x, 31 + y, 1, 3);
        g2d.fillRect(99 + x, 32 + y, 2, 1);
        g2d.fillRect(100 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 1, 2);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 4);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 2);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 2);
        g2d.fillRect(99 + x, 29 + y, 1, 1);
        g2d.fillRect(101 + x, 29 + y, 1, 2);
        g2d.fillRect(97 + x, 30 + y, 2, 1);
        g2d.fillRect(99 + x, 31 + y, 2, 1);
        g2d.fillRect(103 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 2, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 3);
        g2d.fillRect(114 + x, 14 + y, 1, 3);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 4);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 3, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 3, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 3, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(94 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 2);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 2);
        g2d.fillRect(101 + x, 24 + y, 2, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 3);
        g2d.fillRect(100 + x, 25 + y, 1, 4);
        g2d.fillRect(102 + x, 25 + y, 2, 1);
        g2d.fillRect(122 + x, 25 + y, 1, 1);
        g2d.fillRect(97 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 3);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 28 + y, 1, 2);
        g2d.fillRect(102 + x, 28 + y, 1, 4);
        g2d.fillRect(99 + x, 30 + y, 1, 1);
        g2d.fillRect(97 + x, 31 + y, 1, 1);
        g2d.fillRect(99 + x, 33 + y, 1, 1);
        g2d.fillRect(100 + x, 34 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 12 + y, 1, 3);
        g2d.fillRect(107 + x, 12 + y, 1, 2);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 2, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(94 + x, 17 + y, 2, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(93 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 3);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(95 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 2, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 2);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 3);
        g2d.fillRect(113 + x, 21 + y, 1, 2);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 2);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 2);
        g2d.fillRect(122 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 1);
        g2d.fillRect(103 + x, 29 + y, 1, 5);
        g2d.fillRect(102 + x, 32 + y, 1, 3);
        g2d.fillRect(97 + x, 33 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 2, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 2, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 1);
        g2d.fillRect(92 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 3, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 3);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 1, 3);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 28 + y, 1, 7);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(96 + x, 15 + y, 2, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 3);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 23 + y, 2, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 1);
        g2d.fillRect(94 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 25 + y, 1, 1);
        g2d.fillRect(101 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 2);
        g2d.fillRect(103 + x, 27 + y, 1, 2);
        g2d.fillRect(100 + x, 29 + y, 1, 2);
        g2d.fillRect(97 + x, 32 + y, 2, 1);
        g2d.fillRect(98 + x, 33 + y, 1, 2);
        g2d.fillRect(99 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(20 + x, 20 + y, 1, 2);
        g2d.fillRect(12 + x, 36 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(19 + x, 26 + y, 1, 7);
        g2d.fillRect(10 + x, 34 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(20 + x, 22 + y, 1, 2);
        g2d.fillRect(18 + x, 24 + y, 1, 1);
        g2d.fillRect(20 + x, 25 + y, 1, 2);
        g2d.fillRect(19 + x, 25 + y, 1, 1);
        g2d.fillRect(17 + x, 31 + y, 1, 5);
        g2d.fillRect(13 + x, 34 + y, 1, 9);
        g2d.fillRect(12 + x, 34 + y, 1, 2);
        g2d.fillRect(10 + x, 40 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(21 + x, 21 + y, 1, 1);
        g2d.fillRect(18 + x, 25 + y, 1, 1);
        g2d.fillRect(17 + x, 27 + y, 1, 4);
        g2d.fillRect(18 + x, 30 + y, 1, 2);
        g2d.fillRect(18 + x, 33 + y, 1, 3);
        g2d.fillRect(16 + x, 34 + y, 1, 6);
        g2d.fillRect(15 + x, 34 + y, 1, 5);
        g2d.fillRect(11 + x, 34 + y, 1, 11);
        g2d.fillRect(14 + x, 35 + y, 1, 1);
        g2d.fillRect(9 + x, 36 + y, 1, 1);
        g2d.fillRect(14 + x, 37 + y, 1, 1);
        g2d.fillRect(9 + x, 38 + y, 1, 3);
        g2d.fillRect(12 + x, 39 + y, 1, 3);
        g2d.fillRect(14 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(21 + x, 20 + y, 1, 1);
        g2d.fillRect(17 + x, 25 + y, 1, 2);
        g2d.fillRect(18 + x, 26 + y, 1, 4);
        g2d.fillRect(18 + x, 32 + y, 1, 1);
        g2d.fillRect(9 + x, 34 + y, 1, 2);
        g2d.fillRect(14 + x, 36 + y, 1, 1);
        g2d.fillRect(9 + x, 37 + y, 1, 1);
        g2d.fillRect(14 + x, 38 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(19 + x, 24 + y, 2, 1);
        g2d.fillRect(17 + x, 24 + y, 1, 1);
        g2d.fillRect(14 + x, 34 + y, 1, 1);
        g2d.fillRect(15 + x, 39 + y, 1, 2);
        g2d.fillRect(10 + x, 39 + y, 1, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(-3 + x, 32 + y, 1, 7);
        g2d.fillRect(-3 + x, 40 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(1 + x, 24 + y, 1, 1);
        g2d.fillRect(0 + x, 25 + y, 1, 2);
        g2d.fillRect(-1 + x, 27 + y, 1, 2);
        g2d.fillRect(-2 + x, 29 + y, 1, 1);
        g2d.fillRect(-3 + x, 31 + y, 1, 1);
        g2d.fillRect(-1 + x, 37 + y, 1, 1);
        g2d.fillRect(-3 + x, 39 + y, 1, 1);
        g2d.fillRect(-3 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(5 + x, 22 + y, 1, 2);
        g2d.fillRect(2 + x, 22 + y, 3, 1);
        g2d.fillRect(2 + x, 23 + y, 1, 1);
        g2d.fillRect(-1 + x, 26 + y, 1, 1);
        g2d.fillRect(-2 + x, 28 + y, 1, 1);
        g2d.fillRect(-3 + x, 30 + y, 1, 1);
        g2d.fillRect(-5 + x, 33 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(4 + x, 23 + y, 1, 2);
        g2d.fillRect(3 + x, 23 + y, 1, 1);
        g2d.fillRect(2 + x, 25 + y, 1, 1);
        g2d.fillRect(0 + x, 27 + y, 2, 1);
        g2d.fillRect(0 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(0 + x, 23 + y, 1, 1);
        g2d.fillRect(2 + x, 24 + y, 2, 1);
        g2d.fillRect(-4 + x, 24 + y, 1, 1);
        g2d.fillRect(1 + x, 25 + y, 1, 2);
        g2d.fillRect(-3 + x, 25 + y, 1, 2);
        g2d.fillRect(-7 + x, 25 + y, 1, 5);
        g2d.fillRect(-5 + x, 26 + y, 1, 5);
        g2d.fillRect(-6 + x, 26 + y, 1, 1);
        g2d.fillRect(-8 + x, 26 + y, 1, 8);
        g2d.fillRect(-9 + x, 26 + y, 1, 5);
        g2d.fillRect(-4 + x, 27 + y, 1, 2);
        g2d.fillRect(-6 + x, 29 + y, 1, 6);
        g2d.fillRect(-4 + x, 30 + y, 1, 2);
        g2d.fillRect(-4 + x, 37 + y, 1, 5);
        g2d.fillRect(-4 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(1 + x, 23 + y, 1, 1);
        g2d.fillRect(-1 + x, 23 + y, 1, 3);
        g2d.fillRect(0 + x, 24 + y, 1, 1);
        g2d.fillRect(-3 + x, 24 + y, 2, 1);
        g2d.fillRect(-4 + x, 25 + y, 1, 2);
        g2d.fillRect(-6 + x, 25 + y, 1, 1);
        g2d.fillRect(-8 + x, 25 + y, 1, 1);
        g2d.fillRect(-2 + x, 26 + y, 1, 2);
        g2d.fillRect(-3 + x, 28 + y, 1, 2);
        g2d.fillRect(-4 + x, 32 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-5 + x, 24 + y, 1, 2);
        g2d.fillRect(-2 + x, 25 + y, 1, 1);
        g2d.fillRect(-3 + x, 27 + y, 1, 1);
        g2d.fillRect(-6 + x, 27 + y, 1, 2);
        g2d.fillRect(-4 + x, 29 + y, 1, 1);
        g2d.fillRect(-7 + x, 30 + y, 1, 6);
        g2d.fillRect(-5 + x, 31 + y, 1, 2);
        g2d.fillRect(-6 + x, 35 + y, 1, 3);
        g2d.fillRect(-2 + x, 36 + y, 1, 4);
        g2d.fillRect(-1 + x, 38 + y, 1, 3);
        g2d.fillRect(-5 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(-4 + x, 42 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(5 + x, 18 + y, 1, 1);
        g2d.fillRect(-6 + x, 18 + y, 1, 1);
        g2d.fillRect(4 + x, 19 + y, 1, 2);
        g2d.fillRect(-4 + x, 19 + y, 1, 1);
        g2d.fillRect(5 + x, 20 + y, 1, 1);
        g2d.fillRect(-5 + x, 20 + y, 1, 1);
        g2d.fillRect(-8 + x, 20 + y, 1, 3);
        g2d.fillRect(6 + x, 21 + y, 1, 1);
        g2d.fillRect(-7 + x, 21 + y, 2, 1);
        g2d.fillRect(-9 + x, 22 + y, 1, 3);
        g2d.fillRect(16 + x, 27 + y, 1, 3);
        g2d.fillRect(15 + x, 31 + y, 1, 1);
        g2d.fillRect(12 + x, 31 + y, 1, 3);
        g2d.fillRect(13 + x, 32 + y, 2, 1);
        g2d.fillRect(13 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(1 + x, 13 + y, 1, 2);
        g2d.fillRect(11 + x, 15 + y, 1, 2);
        g2d.fillRect(14 + x, 16 + y, 1, 1);
        g2d.fillRect(12 + x, 16 + y, 1, 1);
        g2d.fillRect(10 + x, 16 + y, 1, 1);
        g2d.fillRect(-5 + x, 16 + y, 1, 4);
        g2d.fillRect(13 + x, 17 + y, 1, 1);
        g2d.fillRect(9 + x, 17 + y, 1, 1);
        g2d.fillRect(0 + x, 17 + y, 1, 2);
        g2d.fillRect(-6 + x, 17 + y, 1, 1);
        g2d.fillRect(8 + x, 18 + y, 1, 1);
        g2d.fillRect(-2 + x, 18 + y, 1, 1);
        g2d.fillRect(3 + x, 19 + y, 1, 2);
        g2d.fillRect(2 + x, 19 + y, 1, 1);
        g2d.fillRect(18 + x, 20 + y, 1, 1);
        g2d.fillRect(-7 + x, 20 + y, 1, 1);
        g2d.fillRect(19 + x, 21 + y, 1, 1);
        g2d.fillRect(12 + x, 22 + y, 1, 1);
        g2d.fillRect(16 + x, 23 + y, 1, 2);
        g2d.fillRect(15 + x, 23 + y, 1, 1);
        g2d.fillRect(11 + x, 23 + y, 1, 1);
        g2d.fillRect(10 + x, 24 + y, 1, 1);
        g2d.fillRect(11 + x, 26 + y, 1, 2);
        g2d.fillRect(14 + x, 29 + y, 1, 1);
        g2d.fillRect(12 + x, 29 + y, 1, 2);
        g2d.fillRect(15 + x, 30 + y, 2, 1);
        g2d.fillRect(13 + x, 31 + y, 2, 1);
        g2d.fillRect(10 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(10 + x, 13 + y, 1, 1);
        g2d.fillRect(2 + x, 13 + y, 1, 1);
        g2d.fillRect(-2 + x, 13 + y, 1, 1);
        g2d.fillRect(13 + x, 14 + y, 2, 1);
        g2d.fillRect(11 + x, 14 + y, 1, 1);
        g2d.fillRect(0 + x, 14 + y, 1, 3);
        g2d.fillRect(-1 + x, 14 + y, 1, 3);
        g2d.fillRect(-3 + x, 14 + y, 1, 1);
        g2d.fillRect(15 + x, 15 + y, 1, 1);
        g2d.fillRect(13 + x, 15 + y, 1, 2);
        g2d.fillRect(12 + x, 15 + y, 1, 1);
        g2d.fillRect(1 + x, 15 + y, 1, 1);
        g2d.fillRect(-4 + x, 15 + y, 1, 4);
        g2d.fillRect(7 + x, 16 + y, 1, 1);
        g2d.fillRect(-2 + x, 16 + y, 1, 2);
        g2d.fillRect(15 + x, 17 + y, 1, 2);
        g2d.fillRect(14 + x, 17 + y, 1, 2);
        g2d.fillRect(10 + x, 17 + y, 2, 1);
        g2d.fillRect(6 + x, 17 + y, 1, 1);
        g2d.fillRect(12 + x, 18 + y, 1, 1);
        g2d.fillRect(9 + x, 18 + y, 2, 1);
        g2d.fillRect(1 + x, 18 + y, 1, 2);
        g2d.fillRect(-1 + x, 18 + y, 1, 1);
        g2d.fillRect(-3 + x, 18 + y, 1, 2);
        g2d.fillRect(-7 + x, 18 + y, 1, 2);
        g2d.fillRect(16 + x, 19 + y, 3, 1);
        g2d.fillRect(11 + x, 19 + y, 1, 1);
        g2d.fillRect(7 + x, 19 + y, 3, 1);
        g2d.fillRect(5 + x, 19 + y, 1, 1);
        g2d.fillRect(19 + x, 20 + y, 1, 1);
        g2d.fillRect(17 + x, 20 + y, 1, 1);
        g2d.fillRect(10 + x, 20 + y, 1, 1);
        g2d.fillRect(6 + x, 20 + y, 3, 1);
        g2d.fillRect(2 + x, 20 + y, 1, 1);
        g2d.fillRect(13 + x, 21 + y, 1, 1);
        g2d.fillRect(7 + x, 21 + y, 1, 2);
        g2d.fillRect(4 + x, 21 + y, 1, 2);
        g2d.fillRect(3 + x, 21 + y, 1, 2);
        g2d.fillRect(19 + x, 22 + y, 1, 1);
        g2d.fillRect(16 + x, 22 + y, 1, 1);
        g2d.fillRect(5 + x, 22 + y, 1, 1);
        g2d.fillRect(-7 + x, 22 + y, 1, 1);
        g2d.fillRect(8 + x, 23 + y, 1, 2);
        g2d.fillRect(-8 + x, 23 + y, 1, 1);
        g2d.fillRect(15 + x, 24 + y, 1, 2);
        g2d.fillRect(11 + x, 24 + y, 2, 1);
        g2d.fillRect(9 + x, 24 + y, 1, 1);
        g2d.fillRect(14 + x, 25 + y, 1, 3);
        g2d.fillRect(13 + x, 25 + y, 1, 4);
        g2d.fillRect(10 + x, 25 + y, 2, 1);
        g2d.fillRect(-9 + x, 25 + y, 1, 1);
        g2d.fillRect(16 + x, 26 + y, 1, 1);
        g2d.fillRect(12 + x, 26 + y, 1, 3);
        g2d.fillRect(10 + x, 26 + y, 1, 1);
        g2d.fillRect(15 + x, 28 + y, 1, 2);
        g2d.fillRect(11 + x, 28 + y, 1, 4);
        g2d.fillRect(14 + x, 30 + y, 1, 1);
        g2d.fillRect(16 + x, 31 + y, 1, 1);
        g2d.fillRect(14 + x, 33 + y, 1, 1);
        g2d.fillRect(12 + x, 34 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(7 + x, 12 + y, 1, 3);
        g2d.fillRect(6 + x, 12 + y, 1, 2);
        g2d.fillRect(5 + x, 12 + y, 1, 1);
        g2d.fillRect(8 + x, 13 + y, 1, 1);
        g2d.fillRect(3 + x, 13 + y, 2, 1);
        g2d.fillRect(18 + x, 14 + y, 1, 1);
        g2d.fillRect(10 + x, 14 + y, 1, 2);
        g2d.fillRect(9 + x, 14 + y, 1, 2);
        g2d.fillRect(5 + x, 14 + y, 1, 1);
        g2d.fillRect(3 + x, 14 + y, 1, 1);
        g2d.fillRect(8 + x, 15 + y, 1, 1);
        g2d.fillRect(4 + x, 15 + y, 1, 1);
        g2d.fillRect(2 + x, 15 + y, 1, 3);
        g2d.fillRect(-3 + x, 15 + y, 1, 2);
        g2d.fillRect(16 + x, 16 + y, 1, 1);
        g2d.fillRect(5 + x, 16 + y, 1, 1);
        g2d.fillRect(3 + x, 16 + y, 1, 1);
        g2d.fillRect(18 + x, 17 + y, 2, 1);
        g2d.fillRect(4 + x, 17 + y, 1, 2);
        g2d.fillRect(20 + x, 18 + y, 1, 1);
        g2d.fillRect(7 + x, 18 + y, 1, 1);
        g2d.fillRect(15 + x, 19 + y, 1, 1);
        g2d.fillRect(13 + x, 19 + y, 1, 2);
        g2d.fillRect(10 + x, 19 + y, 1, 1);
        g2d.fillRect(11 + x, 20 + y, 1, 2);
        g2d.fillRect(9 + x, 20 + y, 1, 1);
        g2d.fillRect(-3 + x, 20 + y, 1, 3);
        g2d.fillRect(-4 + x, 20 + y, 1, 2);
        g2d.fillRect(18 + x, 21 + y, 1, 2);
        g2d.fillRect(16 + x, 21 + y, 2, 1);
        g2d.fillRect(10 + x, 21 + y, 1, 2);
        g2d.fillRect(8 + x, 21 + y, 1, 1);
        g2d.fillRect(5 + x, 21 + y, 1, 1);
        g2d.fillRect(1 + x, 21 + y, 1, 3);
        g2d.fillRect(0 + x, 21 + y, 1, 2);
        g2d.fillRect(-2 + x, 21 + y, 1, 1);
        g2d.fillRect(-5 + x, 21 + y, 1, 1);
        g2d.fillRect(14 + x, 22 + y, 1, 2);
        g2d.fillRect(13 + x, 22 + y, 1, 1);
        g2d.fillRect(9 + x, 22 + y, 1, 1);
        g2d.fillRect(6 + x, 22 + y, 1, 2);
        g2d.fillRect(2 + x, 22 + y, 1, 1);
        g2d.fillRect(-6 + x, 22 + y, 1, 1);
        g2d.fillRect(19 + x, 23 + y, 1, 1);
        g2d.fillRect(7 + x, 23 + y, 1, 1);
        g2d.fillRect(-1 + x, 23 + y, 1, 1);
        g2d.fillRect(-7 + x, 23 + y, 1, 1);
        g2d.fillRect(13 + x, 24 + y, 1, 1);
        g2d.fillRect(-2 + x, 24 + y, 1, 1);
        g2d.fillRect(-6 + x, 24 + y, 1, 1);
        g2d.fillRect(-8 + x, 24 + y, 1, 1);
        g2d.fillRect(-7 + x, 25 + y, 1, 1);
        g2d.fillRect(9 + x, 26 + y, 1, 2);
        g2d.fillRect(-9 + x, 26 + y, 1, 1);
        g2d.fillRect(14 + x, 28 + y, 1, 1);
        g2d.fillRect(10 + x, 29 + y, 1, 5);
        g2d.fillRect(11 + x, 32 + y, 1, 3);
        g2d.fillRect(16 + x, 33 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(5 + x, 13 + y, 1, 1);
        g2d.fillRect(6 + x, 14 + y, 1, 2);
        g2d.fillRect(4 + x, 14 + y, 1, 1);
        g2d.fillRect(5 + x, 15 + y, 1, 1);
        g2d.fillRect(3 + x, 15 + y, 1, 1);
        g2d.fillRect(17 + x, 16 + y, 2, 1);
        g2d.fillRect(9 + x, 16 + y, 1, 1);
        g2d.fillRect(4 + x, 16 + y, 1, 1);
        g2d.fillRect(17 + x, 17 + y, 1, 2);
        g2d.fillRect(8 + x, 17 + y, 1, 1);
        g2d.fillRect(18 + x, 18 + y, 2, 1);
        g2d.fillRect(20 + x, 19 + y, 1, 1);
        g2d.fillRect(21 + x, 20 + y, 1, 1);
        g2d.fillRect(14 + x, 20 + y, 3, 1);
        g2d.fillRect(15 + x, 21 + y, 1, 1);
        g2d.fillRect(12 + x, 21 + y, 1, 1);
        g2d.fillRect(17 + x, 22 + y, 1, 3);
        g2d.fillRect(11 + x, 22 + y, 1, 1);
        g2d.fillRect(-1 + x, 22 + y, 1, 1);
        g2d.fillRect(-4 + x, 22 + y, 1, 2);
        g2d.fillRect(-5 + x, 22 + y, 1, 3);
        g2d.fillRect(10 + x, 23 + y, 1, 1);
        g2d.fillRect(0 + x, 23 + y, 1, 1);
        g2d.fillRect(-2 + x, 23 + y, 1, 1);
        g2d.fillRect(-6 + x, 23 + y, 1, 1);
        g2d.fillRect(-3 + x, 24 + y, 1, 1);
        g2d.fillRect(-7 + x, 24 + y, 1, 1);
        g2d.fillRect(-6 + x, 25 + y, 1, 1);
        g2d.fillRect(-8 + x, 25 + y, 1, 1);
        g2d.fillRect(9 + x, 28 + y, 1, 7);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(4 + x, 12 + y, 1, 1);
        g2d.fillRect(9 + x, 13 + y, 1, 1);
        g2d.fillRect(-1 + x, 13 + y, 2, 1);
        g2d.fillRect(15 + x, 14 + y, 1, 1);
        g2d.fillRect(8 + x, 14 + y, 1, 1);
        g2d.fillRect(2 + x, 14 + y, 1, 1);
        g2d.fillRect(-2 + x, 14 + y, 1, 2);
        g2d.fillRect(16 + x, 15 + y, 2, 1);
        g2d.fillRect(14 + x, 15 + y, 1, 1);
        g2d.fillRect(7 + x, 15 + y, 1, 1);
        g2d.fillRect(15 + x, 16 + y, 1, 1);
        g2d.fillRect(8 + x, 16 + y, 1, 1);
        g2d.fillRect(6 + x, 16 + y, 1, 1);
        g2d.fillRect(1 + x, 16 + y, 1, 2);
        g2d.fillRect(16 + x, 17 + y, 1, 2);
        g2d.fillRect(12 + x, 17 + y, 1, 1);
        g2d.fillRect(7 + x, 17 + y, 1, 1);
        g2d.fillRect(5 + x, 17 + y, 1, 1);
        g2d.fillRect(3 + x, 17 + y, 1, 2);
        g2d.fillRect(-1 + x, 17 + y, 1, 1);
        g2d.fillRect(-3 + x, 17 + y, 1, 1);
        g2d.fillRect(13 + x, 18 + y, 1, 1);
        g2d.fillRect(11 + x, 18 + y, 1, 1);
        g2d.fillRect(6 + x, 18 + y, 1, 2);
        g2d.fillRect(2 + x, 18 + y, 1, 1);
        g2d.fillRect(14 + x, 19 + y, 1, 1);
        g2d.fillRect(12 + x, 19 + y, 1, 2);
        g2d.fillRect(0 + x, 19 + y, 1, 2);
        g2d.fillRect(-1 + x, 19 + y, 1, 3);
        g2d.fillRect(-2 + x, 19 + y, 1, 2);
        g2d.fillRect(-6 + x, 19 + y, 1, 2);
        g2d.fillRect(1 + x, 20 + y, 1, 1);
        g2d.fillRect(14 + x, 21 + y, 1, 1);
        g2d.fillRect(9 + x, 21 + y, 1, 1);
        g2d.fillRect(2 + x, 21 + y, 1, 1);
        g2d.fillRect(15 + x, 22 + y, 1, 1);
        g2d.fillRect(8 + x, 22 + y, 1, 1);
        g2d.fillRect(-2 + x, 22 + y, 1, 1);
        g2d.fillRect(18 + x, 23 + y, 1, 2);
        g2d.fillRect(12 + x, 23 + y, 2, 1);
        g2d.fillRect(9 + x, 23 + y, 1, 1);
        g2d.fillRect(-3 + x, 23 + y, 1, 1);
        g2d.fillRect(19 + x, 24 + y, 1, 1);
        g2d.fillRect(14 + x, 24 + y, 1, 1);
        g2d.fillRect(-4 + x, 24 + y, 1, 1);
        g2d.fillRect(16 + x, 25 + y, 1, 1);
        g2d.fillRect(12 + x, 25 + y, 1, 1);
        g2d.fillRect(9 + x, 25 + y, 1, 1);
        g2d.fillRect(15 + x, 26 + y, 1, 2);
        g2d.fillRect(10 + x, 27 + y, 1, 2);
        g2d.fillRect(13 + x, 29 + y, 1, 2);
        g2d.fillRect(15 + x, 32 + y, 2, 1);
        g2d.fillRect(15 + x, 33 + y, 1, 2);
        g2d.fillRect(14 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(19 + x, 19 + y, 1, 1);
        g2d.fillRect(20 + x, 20 + y, 1, 1);
    }
}
