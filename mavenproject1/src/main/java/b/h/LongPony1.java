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
public class LongPony1 extends SuperH
{
    public LongPony1()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongPony1(int step, int dir)
    {
        super(step, dir);
    }

    public LongPony1(int step, int dir, ColorArray colorSwitch)
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

    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 11 + y, 9, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 2, 1);
        g2d.fillRect(111 + x, 14 + y, 5, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 2, 1);
        g2d.fillRect(112 + x, 17 + y, 2, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 11 + y, 5, 1);
        g2d.fillRect(96 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 3, 1);
        g2d.fillRect(110 + x, 12 + y, 3, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 2);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 2);
        g2d.fillRect(97 + x, 14 + y, 1, 9);
        g2d.fillRect(98 + x, 14 + y, 1, 4);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(103 + x, 14 + y, 1, 3);
        g2d.fillRect(117 + x, 14 + y, 1, 4);
        g2d.fillRect(99 + x, 15 + y, 1, 3);
        g2d.fillRect(107 + x, 15 + y, 2, 1);
        g2d.fillRect(113 + x, 15 + y, 3, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 3);
        g2d.fillRect(93 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 3);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 3, 1);
        g2d.fillRect(92 + x, 18 + y, 1, 15);
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(110 + x, 18 + y, 4, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 4);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 12);
        g2d.fillRect(98 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(108 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 3);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 3);
        g2d.fillRect(100 + x, 21 + y, 1, 3);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 2, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 3);
        g2d.fillRect(105 + x, 22 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 2);
        g2d.fillRect(98 + x, 23 + y, 1, 8);
        g2d.fillRect(101 + x, 23 + y, 1, 3);
        g2d.fillRect(102 + x, 23 + y, 1, 5);
        g2d.fillRect(107 + x, 23 + y, 2, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 3);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 2);
        g2d.fillRect(101 + x, 28 + y, 1, 4);
        g2d.fillRect(103 + x, 28 + y, 1, 6);
        g2d.fillRect(97 + x, 31 + y, 1, 7);
        g2d.fillRect(99 + x, 31 + y, 1, 4);
        g2d.fillRect(102 + x, 32 + y, 1, 6);
        g2d.fillRect(93 + x, 33 + y, 1, 4);
        g2d.fillRect(98 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 2);
        g2d.fillRect(94 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 12 + y, 3, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 21);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 23 + y, 1, 8);
        g2d.fillRect(93 + x, 28 + y, 1, 5);
        g2d.fillRect(98 + x, 31 + y, 1, 4);
        g2d.fillRect(101 + x, 34 + y, 1, 4);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 13 + y, 2, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 5);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 3, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 17);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 2, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(100 + x, 25 + y, 1, 2);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 2);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 3);
        g2d.fillRect(102 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 9);
        g2d.fillRect(96 + x, 31 + y, 1, 7);
        g2d.fillRect(103 + x, 34 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 3);
        g2d.fillRect(104 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(94 + x, 16 + y, 1, 4);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(93 + x, 18 + y, 1, 10);
        g2d.fillRect(103 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 2, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 3);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 2, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 3);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 19 + y, 3, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 3);
        g2d.fillRect(120 + x, 21 + y, 1, 5);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 37 + y, 1, 3);
        g2d.fillRect(98 + x, 37 + y, 1, 2);
        g2d.fillRect(99 + x, 37 + y, 1, 5);
        g2d.fillRect(102 + x, 37 + y, 1, 10);
        g2d.fillRect(97 + x, 38 + y, 1, 3);
        g2d.fillRect(96 + x, 40 + y, 1, 7);
        g2d.fillRect(93 + x, 41 + y, 1, 10);
        g2d.fillRect(98 + x, 41 + y, 1, 4);
        g2d.fillRect(101 + x, 41 + y, 1, 17);
        g2d.fillRect(92 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 5);
        g2d.fillRect(103 + x, 45 + y, 1, 2);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(98 + x, 47 + y, 1, 17);
        g2d.fillRect(99 + x, 47 + y, 1, 2);
        g2d.fillRect(96 + x, 48 + y, 1, 7);
        g2d.fillRect(97 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 4);
        g2d.fillRect(105 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 2);
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 2);
        g2d.fillRect(93 + x, 54 + y, 1, 3);
        g2d.fillRect(92 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 6);
        g2d.fillRect(91 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(97 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(95 + x, 59 + y, 1, 2);
        g2d.fillRect(96 + x, 59 + y, 1, 1);
        g2d.fillRect(100 + x, 60 + y, 1, 4);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(97 + x, 62 + y, 1, 1);
        g2d.fillRect(95 + x, 63 + y, 2, 1);
        g2d.fillRect(101 + x, 63 + y, 1, 2);
        g2d.fillRect(91 + x, 64 + y, 4, 1);
        g2d.fillRect(97 + x, 64 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 3, 1);
        g2d.fillRect(98 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 40 + y, 1, 1);
        g2d.fillRect(94 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 37 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 4);
        g2d.fillRect(96 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 39 + y, 1, 2);
        g2d.fillRect(94 + x, 41 + y, 1, 9);
        g2d.fillRect(92 + x, 43 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 4);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 8);
        g2d.fillRect(92 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(93 + x, 52 + y, 1, 2);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(92 + x, 54 + y, 1, 1);
        g2d.fillRect(94 + x, 54 + y, 1, 4);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(91 + x, 55 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(93 + x, 59 + y, 2, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 3);
        g2d.fillRect(100 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 2);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(91 + x, 63 + y, 4, 1);
        g2d.fillRect(102 + x, 63 + y, 3, 1);
        g2d.fillRect(98 + x, 64 + y, 1, 1);
        g2d.fillRect(99 + x, 65 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 37 + y, 1, 2);
        g2d.fillRect(97 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 2);
        g2d.fillRect(94 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 5);
        g2d.fillRect(103 + x, 42 + y, 1, 3);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(95 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 3);
        g2d.fillRect(102 + x, 54 + y, 1, 3);
        g2d.fillRect(96 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(96 + x, 60 + y, 1, 1);
        g2d.fillRect(95 + x, 61 + y, 1, 1);
        g2d.fillRect(94 + x, 62 + y, 1, 1);
        g2d.fillRect(97 + x, 63 + y, 1, 1);
        g2d.fillRect(99 + x, 64 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 37 + y, 1, 5);
        g2d.fillRect(95 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 2);
        g2d.fillRect(95 + x, 41 + y, 1, 8);
        g2d.fillRect(92 + x, 42 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 2, 1);
        g2d.fillRect(97 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 7);
        g2d.fillRect(92 + x, 50 + y, 1, 1);
        g2d.fillRect(94 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(92 + x, 53 + y, 1, 1);
        g2d.fillRect(91 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 4);
        g2d.fillRect(95 + x, 56 + y, 1, 2);
        g2d.fillRect(93 + x, 58 + y, 2, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(91 + x, 62 + y, 3, 1);
        g2d.fillRect(99 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(100 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 4);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 2);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 1);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 2, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 8);
        g2d.fillRect(103 + x, 26 + y, 1, 3);
        g2d.fillRect(102 + x, 28 + y, 1, 4);
        g2d.fillRect(101 + x, 31 + y, 1, 4);
        g2d.fillRect(119 + x, 33 + y, 1, 2);
        g2d.fillRect(100 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(118 + x, 35 + y, 1, 2);
        g2d.fillRect(98 + x, 36 + y, 1, 1);
        g2d.fillRect(117 + x, 37 + y, 1, 2);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 11 + y, 9, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 2, 1);
        g2d.fillRect(100 + x, 14 + y, 5, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 2, 1);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 11 + y, 5, 1);
        g2d.fillRect(119 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 3, 1);
        g2d.fillRect(103 + x, 12 + y, 3, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 2);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 2);
        g2d.fillRect(118 + x, 14 + y, 1, 9);
        g2d.fillRect(117 + x, 14 + y, 1, 4);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(112 + x, 14 + y, 1, 3);
        g2d.fillRect(98 + x, 14 + y, 1, 4);
        g2d.fillRect(116 + x, 15 + y, 1, 3);
        g2d.fillRect(107 + x, 15 + y, 2, 1);
        g2d.fillRect(100 + x, 15 + y, 3, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 3);
        g2d.fillRect(122 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 3);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 3, 1);
        g2d.fillRect(123 + x, 18 + y, 1, 15);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(102 + x, 18 + y, 4, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 4);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 12);
        g2d.fillRect(117 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 3);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 1, 3);
        g2d.fillRect(115 + x, 21 + y, 1, 3);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 2, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 3);
        g2d.fillRect(110 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 2);
        g2d.fillRect(117 + x, 23 + y, 1, 8);
        g2d.fillRect(114 + x, 23 + y, 1, 3);
        g2d.fillRect(113 + x, 23 + y, 1, 5);
        g2d.fillRect(107 + x, 23 + y, 2, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 3);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 2);
        g2d.fillRect(114 + x, 28 + y, 1, 4);
        g2d.fillRect(112 + x, 28 + y, 1, 6);
        g2d.fillRect(118 + x, 31 + y, 1, 7);
        g2d.fillRect(116 + x, 31 + y, 1, 4);
        g2d.fillRect(113 + x, 32 + y, 1, 6);
        g2d.fillRect(122 + x, 33 + y, 1, 4);
        g2d.fillRect(117 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 2);
        g2d.fillRect(121 + x, 37 + y, 1, 1);
        g2d.fillRect(117 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 12 + y, 3, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 21);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 23 + y, 1, 8);
        g2d.fillRect(122 + x, 28 + y, 1, 5);
        g2d.fillRect(117 + x, 31 + y, 1, 4);
        g2d.fillRect(114 + x, 34 + y, 1, 4);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 13 + y, 2, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 5);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(99 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 3, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 17);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 2);
        g2d.fillRect(111 + x, 23 + y, 2, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 25 + y, 1, 2);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 2);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 3);
        g2d.fillRect(113 + x, 28 + y, 1, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 9);
        g2d.fillRect(119 + x, 31 + y, 1, 7);
        g2d.fillRect(112 + x, 34 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 3);
        g2d.fillRect(110 + x, 14 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(121 + x, 16 + y, 1, 4);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(122 + x, 18 + y, 1, 10);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 2, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 3);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 2, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 3);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 3, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 3);
        g2d.fillRect(95 + x, 21 + y, 1, 5);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 37 + y, 1, 3);
        g2d.fillRect(117 + x, 37 + y, 1, 2);
        g2d.fillRect(116 + x, 37 + y, 1, 5);
        g2d.fillRect(113 + x, 37 + y, 1, 10);
        g2d.fillRect(118 + x, 38 + y, 1, 3);
        g2d.fillRect(119 + x, 40 + y, 1, 7);
        g2d.fillRect(122 + x, 41 + y, 1, 10);
        g2d.fillRect(117 + x, 41 + y, 1, 4);
        g2d.fillRect(114 + x, 41 + y, 1, 17);
        g2d.fillRect(123 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 5);
        g2d.fillRect(112 + x, 45 + y, 1, 2);
        g2d.fillRect(111 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 17);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 7);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(112 + x, 48 + y, 1, 4);
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(122 + x, 54 + y, 1, 3);
        g2d.fillRect(123 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 6);
        g2d.fillRect(124 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(120 + x, 59 + y, 1, 2);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 4);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 62 + y, 1, 1);
        g2d.fillRect(119 + x, 63 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(121 + x, 64 + y, 4, 1);
        g2d.fillRect(118 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 3, 1);
        g2d.fillRect(117 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 37 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 4);
        g2d.fillRect(119 + x, 39 + y, 1, 1);
        g2d.fillRect(117 + x, 39 + y, 1, 2);
        g2d.fillRect(121 + x, 41 + y, 1, 9);
        g2d.fillRect(123 + x, 43 + y, 1, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 4);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 8);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(122 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 2);
        g2d.fillRect(123 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 4);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(124 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 3);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 3);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 2);
        g2d.fillRect(120 + x, 62 + y, 1, 1);
        g2d.fillRect(121 + x, 63 + y, 4, 1);
        g2d.fillRect(111 + x, 63 + y, 3, 1);
        g2d.fillRect(117 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 37 + y, 1, 2);
        g2d.fillRect(118 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 2);
        g2d.fillRect(121 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 5);
        g2d.fillRect(112 + x, 42 + y, 1, 3);
        g2d.fillRect(111 + x, 45 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(122 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(113 + x, 54 + y, 1, 3);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(121 + x, 62 + y, 1, 1);
        g2d.fillRect(118 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 37 + y, 1, 5);
        g2d.fillRect(120 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 2);
        g2d.fillRect(120 + x, 41 + y, 1, 8);
        g2d.fillRect(123 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 2, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 7);
        g2d.fillRect(123 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(123 + x, 53 + y, 1, 1);
        g2d.fillRect(124 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(121 + x, 58 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(122 + x, 62 + y, 3, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(115 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 4);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 1, 2);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 1);
        g2d.fillRect(115 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 2, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 8);
        g2d.fillRect(112 + x, 26 + y, 1, 3);
        g2d.fillRect(113 + x, 28 + y, 1, 4);
        g2d.fillRect(114 + x, 31 + y, 1, 4);
        g2d.fillRect(96 + x, 33 + y, 1, 2);
        g2d.fillRect(115 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(97 + x, 35 + y, 1, 2);
        g2d.fillRect(117 + x, 36 + y, 1, 1);
        g2d.fillRect(98 + x, 37 + y, 1, 2);
    }
}
