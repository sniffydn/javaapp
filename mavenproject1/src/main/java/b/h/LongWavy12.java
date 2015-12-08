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
public class LongWavy12 extends SuperH
{
    int prevY = 0;

    public LongWavy12()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongWavy12(int step, int dir)
    {
        super(step, dir);
    }

    public LongWavy12(int step, int dir, ColorArray colorSwitch)
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
        if(y == 1 && Math.random() < .5)
            y = 0;
        if(y == -1 && Math.random() < .5)
            y = 0;
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 11 + y, 1, 4);
        g2d.fillRect(104 + x, 11 + y, 1, 5);
        g2d.fillRect(105 + x, 11 + y, 1, 11);
        g2d.fillRect(106 + x, 11 + y, 1, 6);
        g2d.fillRect(107 + x, 11 + y, 1, 6);
        g2d.fillRect(108 + x, 11 + y, 1, 6);
        g2d.fillRect(109 + x, 11 + y, 1, 3);
        g2d.fillRect(110 + x, 11 + y, 1, 3);
        g2d.fillRect(111 + x, 11 + y, 1, 3);
        g2d.fillRect(112 + x, 11 + y, 1, 4);
        g2d.fillRect(113 + x, 11 + y, 1, 4);
        g2d.fillRect(101 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 12 + y, 1, 3);
        g2d.fillRect(114 + x, 12 + y, 1, 5);
        g2d.fillRect(115 + x, 12 + y, 1, 6);
        g2d.fillRect(99 + x, 13 + y, 2, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 5);
        g2d.fillRect(117 + x, 13 + y, 1, 6);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 6);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 7);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 10);
        g2d.fillRect(110 + x, 16 + y, 4, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 6);
        g2d.fillRect(120 + x, 17 + y, 1, 7);
        g2d.fillRect(95 + x, 18 + y, 1, 8);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 7);
        g2d.fillRect(96 + x, 20 + y, 2, 1);
        g2d.fillRect(97 + x, 21 + y, 6, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 5);
        g2d.fillRect(99 + x, 22 + y, 4, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 7);
        g2d.fillRect(101 + x, 23 + y, 2, 1);
        g2d.fillRect(123 + x, 23 + y, 1, 3);
        g2d.fillRect(96 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 25 + y, 1, 2);
        g2d.fillRect(100 + x, 25 + y, 3, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 5);
        g2d.fillRect(96 + x, 27 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 2, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 12);
        g2d.fillRect(97 + x, 28 + y, 2, 1);
        g2d.fillRect(96 + x, 29 + y, 1, 5);
        g2d.fillRect(98 + x, 29 + y, 3, 1);
        g2d.fillRect(118 + x, 29 + y, 1, 7);
        g2d.fillRect(119 + x, 29 + y, 1, 7);
        g2d.fillRect(120 + x, 29 + y, 1, 3);
        g2d.fillRect(121 + x, 29 + y, 1, 7);
        g2d.fillRect(122 + x, 29 + y, 1, 7);
        g2d.fillRect(97 + x, 30 + y, 1, 14);
        g2d.fillRect(100 + x, 30 + y, 1, 1);
        g2d.fillRect(98 + x, 31 + y, 1, 1);
        g2d.fillRect(123 + x, 31 + y, 1, 5);
        g2d.fillRect(100 + x, 32 + y, 1, 3);
        g2d.fillRect(101 + x, 32 + y, 1, 9);
        g2d.fillRect(94 + x, 33 + y, 1, 7);
        g2d.fillRect(98 + x, 33 + y, 1, 5);
        g2d.fillRect(99 + x, 33 + y, 1, 1);
        g2d.fillRect(120 + x, 33 + y, 1, 3);
        g2d.fillRect(117 + x, 34 + y, 1, 3);
        g2d.fillRect(96 + x, 36 + y, 1, 4);
        g2d.fillRect(115 + x, 37 + y, 2, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 1, 3);
        g2d.fillRect(100 + x, 39 + y, 1, 5);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 2, 1);
        g2d.fillRect(122 + x, 43 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 3);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 14 + y, 1, 2);
        g2d.fillRect(98 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 3);
        g2d.fillRect(112 + x, 17 + y, 2, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 3);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 2, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 2);
        g2d.fillRect(98 + x, 24 + y, 2, 1);
        g2d.fillRect(101 + x, 24 + y, 2, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(97 + x, 29 + y, 1, 1);
        g2d.fillRect(98 + x, 30 + y, 2, 1);
        g2d.fillRect(99 + x, 31 + y, 1, 2);
        g2d.fillRect(100 + x, 31 + y, 2, 1);
        g2d.fillRect(98 + x, 32 + y, 1, 1);
        g2d.fillRect(120 + x, 32 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 38 + y, 1, 2);
        g2d.fillRect(115 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 3);
        g2d.fillRect(98 + x, 17 + y, 1, 3);
        g2d.fillRect(99 + x, 18 + y, 2, 1);
        g2d.fillRect(99 + x, 20 + y, 2, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 2);
        g2d.fillRect(97 + x, 22 + y, 1, 3);
        g2d.fillRect(98 + x, 23 + y, 2, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 2, 1);
        g2d.fillRect(97 + x, 27 + y, 2, 1);
        g2d.fillRect(99 + x, 28 + y, 2, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 4);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 42 + y, 1, 2);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 35 + y, 6, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 4);
        g2d.fillRect(119 + x, 36 + y, 5, 1);
        g2d.fillRect(116 + x, 37 + y, 1, 10);
        g2d.fillRect(118 + x, 37 + y, 1, 5);
        g2d.fillRect(121 + x, 37 + y, 1, 8);
        g2d.fillRect(122 + x, 37 + y, 1, 6);
        g2d.fillRect(123 + x, 37 + y, 1, 2);
        g2d.fillRect(114 + x, 38 + y, 1, 5);
        g2d.fillRect(115 + x, 38 + y, 1, 11);
        g2d.fillRect(120 + x, 38 + y, 1, 8);
        g2d.fillRect(112 + x, 39 + y, 1, 2);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(95 + x, 40 + y, 1, 4);
        g2d.fillRect(96 + x, 40 + y, 1, 21);
        g2d.fillRect(119 + x, 41 + y, 1, 3);
        g2d.fillRect(97 + x, 42 + y, 1, 13);
        g2d.fillRect(113 + x, 42 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 2, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 1, 13);
        g2d.fillRect(103 + x, 43 + y, 1, 9);
        g2d.fillRect(112 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 10);
        g2d.fillRect(122 + x, 44 + y, 1, 13);
        g2d.fillRect(123 + x, 44 + y, 1, 10);
        g2d.fillRect(124 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 6);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 3);
        g2d.fillRect(121 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 7);
        g2d.fillRect(100 + x, 47 + y, 1, 5);
        g2d.fillRect(101 + x, 47 + y, 1, 6);
        g2d.fillRect(93 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 3);
        g2d.fillRect(104 + x, 48 + y, 1, 6);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 2);
        g2d.fillRect(124 + x, 48 + y, 1, 5);
        g2d.fillRect(98 + x, 49 + y, 1, 6);
        g2d.fillRect(105 + x, 49 + y, 1, 6);
        g2d.fillRect(116 + x, 49 + y, 1, 2);
        g2d.fillRect(121 + x, 49 + y, 1, 6);
        g2d.fillRect(94 + x, 50 + y, 1, 3);
        g2d.fillRect(106 + x, 50 + y, 1, 7);
        g2d.fillRect(115 + x, 50 + y, 1, 3);
        g2d.fillRect(119 + x, 50 + y, 1, 4);
        g2d.fillRect(114 + x, 51 + y, 1, 6);
        g2d.fillRect(93 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(100 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 3);
        g2d.fillRect(98 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 56 + y, 1, 4);
        g2d.fillRect(104 + x, 56 + y, 1, 6);
        g2d.fillRect(115 + x, 56 + y, 1, 4);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 2);
        g2d.fillRect(97 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 5);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(119 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 3);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(122 + x, 59 + y, 1, 3);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(120 + x, 60 + y, 2, 1);
        g2d.fillRect(98 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 61 + y, 1, 5);
        g2d.fillRect(121 + x, 61 + y, 1, 7);
        g2d.fillRect(117 + x, 62 + y, 1, 3);
        g2d.fillRect(118 + x, 62 + y, 2, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 2);
        g2d.fillRect(119 + x, 63 + y, 1, 2);
        g2d.fillRect(99 + x, 64 + y, 1, 6);
        g2d.fillRect(105 + x, 64 + y, 1, 3);
        g2d.fillRect(116 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 65 + y, 1, 3);
        g2d.fillRect(101 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 66 + y, 1, 2);
        g2d.fillRect(118 + x, 66 + y, 1, 1);
        g2d.fillRect(103 + x, 67 + y, 1, 2);
        g2d.fillRect(116 + x, 67 + y, 1, 5);
        g2d.fillRect(102 + x, 68 + y, 1, 1);
        g2d.fillRect(98 + x, 69 + y, 1, 2);
        g2d.fillRect(101 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(118 + x, 69 + y, 1, 1);
        g2d.fillRect(100 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 36 + y, 1, 1);
        g2d.fillRect(120 + x, 37 + y, 1, 1);
        g2d.fillRect(119 + x, 38 + y, 1, 3);
        g2d.fillRect(98 + x, 43 + y, 1, 2);
        g2d.fillRect(118 + x, 44 + y, 2, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 2);
        g2d.fillRect(121 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(102 + x, 59 + y, 1, 3);
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 3);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 4);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(100 + x, 63 + y, 1, 7);
        g2d.fillRect(116 + x, 65 + y, 1, 2);
        g2d.fillRect(118 + x, 65 + y, 2, 1);
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(119 + x, 66 + y, 1, 2);
        g2d.fillRect(101 + x, 67 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 2, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 37 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 1, 3);
        g2d.fillRect(118 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 43 + y, 1, 3);
        g2d.fillRect(101 + x, 43 + y, 1, 2);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 2);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 2, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(99 + x, 56 + y, 1, 4);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 1, 4);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 66 + y, 1, 2);
        g2d.fillRect(103 + x, 66 + y, 2, 1);
        g2d.fillRect(118 + x, 67 + y, 1, 1);
        g2d.fillRect(99 + x, 70 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 16 + y, 1, 9);
        g2d.fillRect(107 + x, 16 + y, 1, 3);
        g2d.fillRect(108 + x, 16 + y, 1, 3);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 4, 1);
        g2d.fillRect(115 + x, 17 + y, 3, 1);
        g2d.fillRect(117 + x, 18 + y, 2, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 4);
        g2d.fillRect(108 + x, 20 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 4);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 2, 1);
        g2d.fillRect(118 + x, 21 + y, 2, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 3);
        g2d.fillRect(112 + x, 22 + y, 3, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 2);
        g2d.fillRect(114 + x, 23 + y, 2, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 19);
        g2d.fillRect(103 + x, 25 + y, 1, 2);
        g2d.fillRect(113 + x, 25 + y, 2, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 3, 1);
        g2d.fillRect(115 + x, 26 + y, 2, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 3);
        g2d.fillRect(119 + x, 28 + y, 1, 2);
        g2d.fillRect(120 + x, 28 + y, 1, 2);
        g2d.fillRect(122 + x, 28 + y, 1, 2);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 1);
        g2d.fillRect(104 + x, 37 + y, 1, 7);
        g2d.fillRect(105 + x, 41 + y, 1, 1);
        g2d.fillRect(105 + x, 44 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 17 + y, 4, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 2, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 2, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 3);
        g2d.fillRect(117 + x, 22 + y, 1, 3);
        g2d.fillRect(118 + x, 22 + y, 1, 4);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 3);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 2);
        g2d.fillRect(119 + x, 27 + y, 5, 1);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(104 + x, 34 + y, 1, 3);
        g2d.fillRect(103 + x, 43 + y, 1, 1);
        g2d.fillRect(104 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(113 + x, 18 + y, 1, 3);
        g2d.fillRect(114 + x, 18 + y, 1, 4);
        g2d.fillRect(108 + x, 19 + y, 2, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 2);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 2);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 2, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 10);
        g2d.fillRect(113 + x, 24 + y, 3, 1);
        g2d.fillRect(115 + x, 25 + y, 2, 1);
        g2d.fillRect(117 + x, 26 + y, 6, 1);
        g2d.fillRect(103 + x, 27 + y, 1, 16);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 11 + y, 1, 4);
        g2d.fillRect(111 + x, 11 + y, 1, 5);
        g2d.fillRect(110 + x, 11 + y, 1, 11);
        g2d.fillRect(109 + x, 11 + y, 1, 6);
        g2d.fillRect(108 + x, 11 + y, 1, 6);
        g2d.fillRect(107 + x, 11 + y, 1, 6);
        g2d.fillRect(106 + x, 11 + y, 1, 3);
        g2d.fillRect(105 + x, 11 + y, 1, 3);
        g2d.fillRect(104 + x, 11 + y, 1, 3);
        g2d.fillRect(103 + x, 11 + y, 1, 4);
        g2d.fillRect(102 + x, 11 + y, 1, 4);
        g2d.fillRect(114 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 12 + y, 1, 3);
        g2d.fillRect(101 + x, 12 + y, 1, 5);
        g2d.fillRect(100 + x, 12 + y, 1, 6);
        g2d.fillRect(115 + x, 13 + y, 2, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 5);
        g2d.fillRect(98 + x, 13 + y, 1, 6);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 6);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 7);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 10);
        g2d.fillRect(102 + x, 16 + y, 4, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 6);
        g2d.fillRect(95 + x, 17 + y, 1, 7);
        g2d.fillRect(120 + x, 18 + y, 1, 8);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 7);
        g2d.fillRect(118 + x, 20 + y, 2, 1);
        g2d.fillRect(113 + x, 21 + y, 6, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 5);
        g2d.fillRect(113 + x, 22 + y, 4, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 7);
        g2d.fillRect(113 + x, 23 + y, 2, 1);
        g2d.fillRect(92 + x, 23 + y, 1, 3);
        g2d.fillRect(119 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 25 + y, 1, 2);
        g2d.fillRect(113 + x, 25 + y, 3, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 5);
        g2d.fillRect(119 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 2, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 12);
        g2d.fillRect(117 + x, 28 + y, 2, 1);
        g2d.fillRect(119 + x, 29 + y, 1, 5);
        g2d.fillRect(115 + x, 29 + y, 3, 1);
        g2d.fillRect(97 + x, 29 + y, 1, 7);
        g2d.fillRect(96 + x, 29 + y, 1, 7);
        g2d.fillRect(95 + x, 29 + y, 1, 3);
        g2d.fillRect(94 + x, 29 + y, 1, 7);
        g2d.fillRect(93 + x, 29 + y, 1, 7);
        g2d.fillRect(118 + x, 30 + y, 1, 14);
        g2d.fillRect(115 + x, 30 + y, 1, 1);
        g2d.fillRect(117 + x, 31 + y, 1, 1);
        g2d.fillRect(92 + x, 31 + y, 1, 5);
        g2d.fillRect(115 + x, 32 + y, 1, 3);
        g2d.fillRect(114 + x, 32 + y, 1, 9);
        g2d.fillRect(121 + x, 33 + y, 1, 7);
        g2d.fillRect(117 + x, 33 + y, 1, 5);
        g2d.fillRect(116 + x, 33 + y, 1, 1);
        g2d.fillRect(95 + x, 33 + y, 1, 3);
        g2d.fillRect(98 + x, 34 + y, 1, 3);
        g2d.fillRect(119 + x, 36 + y, 1, 4);
        g2d.fillRect(99 + x, 37 + y, 2, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 3);
        g2d.fillRect(115 + x, 39 + y, 1, 5);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(117 + x, 40 + y, 1, 2);
        g2d.fillRect(112 + x, 43 + y, 2, 1);
        g2d.fillRect(91 + x, 43 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 3);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 3);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 3);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 2, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 2);
        g2d.fillRect(116 + x, 24 + y, 2, 1);
        g2d.fillRect(113 + x, 24 + y, 2, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(118 + x, 29 + y, 1, 1);
        g2d.fillRect(116 + x, 30 + y, 2, 1);
        g2d.fillRect(116 + x, 31 + y, 1, 2);
        g2d.fillRect(114 + x, 31 + y, 2, 1);
        g2d.fillRect(117 + x, 32 + y, 1, 1);
        g2d.fillRect(95 + x, 32 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(117 + x, 38 + y, 1, 2);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 3);
        g2d.fillRect(117 + x, 17 + y, 1, 3);
        g2d.fillRect(115 + x, 18 + y, 2, 1);
        g2d.fillRect(115 + x, 20 + y, 2, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 1, 3);
        g2d.fillRect(116 + x, 23 + y, 2, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 2, 1);
        g2d.fillRect(117 + x, 27 + y, 2, 1);
        g2d.fillRect(115 + x, 28 + y, 2, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 4);
        g2d.fillRect(115 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(114 + x, 42 + y, 1, 2);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(92 + x, 35 + y, 6, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 4);
        g2d.fillRect(92 + x, 36 + y, 5, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 10);
        g2d.fillRect(97 + x, 37 + y, 1, 5);
        g2d.fillRect(94 + x, 37 + y, 1, 8);
        g2d.fillRect(93 + x, 37 + y, 1, 6);
        g2d.fillRect(92 + x, 37 + y, 1, 2);
        g2d.fillRect(101 + x, 38 + y, 1, 5);
        g2d.fillRect(100 + x, 38 + y, 1, 11);
        g2d.fillRect(95 + x, 38 + y, 1, 8);
        g2d.fillRect(103 + x, 39 + y, 1, 2);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(120 + x, 40 + y, 1, 4);
        g2d.fillRect(119 + x, 40 + y, 1, 21);
        g2d.fillRect(96 + x, 41 + y, 1, 3);
        g2d.fillRect(118 + x, 42 + y, 1, 13);
        g2d.fillRect(102 + x, 42 + y, 1, 2);
        g2d.fillRect(91 + x, 42 + y, 2, 1);
        g2d.fillRect(121 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 2);
        g2d.fillRect(113 + x, 43 + y, 1, 13);
        g2d.fillRect(112 + x, 43 + y, 1, 9);
        g2d.fillRect(103 + x, 43 + y, 1, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 10);
        g2d.fillRect(93 + x, 44 + y, 1, 13);
        g2d.fillRect(92 + x, 44 + y, 1, 10);
        g2d.fillRect(91 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 1, 6);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 3);
        g2d.fillRect(94 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 7);
        g2d.fillRect(115 + x, 47 + y, 1, 5);
        g2d.fillRect(114 + x, 47 + y, 1, 6);
        g2d.fillRect(121 + x, 48 + y, 2, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 3);
        g2d.fillRect(111 + x, 48 + y, 1, 6);
        g2d.fillRect(101 + x, 48 + y, 1, 2);
        g2d.fillRect(95 + x, 48 + y, 1, 2);
        g2d.fillRect(91 + x, 48 + y, 1, 5);
        g2d.fillRect(117 + x, 49 + y, 1, 6);
        g2d.fillRect(110 + x, 49 + y, 1, 6);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(94 + x, 49 + y, 1, 6);
        g2d.fillRect(121 + x, 50 + y, 1, 3);
        g2d.fillRect(109 + x, 50 + y, 1, 7);
        g2d.fillRect(100 + x, 50 + y, 1, 3);
        g2d.fillRect(96 + x, 50 + y, 1, 4);
        g2d.fillRect(101 + x, 51 + y, 1, 6);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 4);
        g2d.fillRect(97 + x, 52 + y, 1, 4);
        g2d.fillRect(95 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(99 + x, 54 + y, 1, 2);
        g2d.fillRect(98 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 1, 4);
        g2d.fillRect(111 + x, 56 + y, 1, 6);
        g2d.fillRect(100 + x, 56 + y, 1, 4);
        g2d.fillRect(96 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(110 + x, 57 + y, 1, 5);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 3);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(99 + x, 58 + y, 1, 3);
        g2d.fillRect(96 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(98 + x, 59 + y, 1, 2);
        g2d.fillRect(93 + x, 59 + y, 1, 3);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(94 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(100 + x, 61 + y, 1, 5);
        g2d.fillRect(94 + x, 61 + y, 1, 7);
        g2d.fillRect(98 + x, 62 + y, 1, 3);
        g2d.fillRect(96 + x, 62 + y, 2, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(96 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 64 + y, 1, 6);
        g2d.fillRect(110 + x, 64 + y, 1, 3);
        g2d.fillRect(99 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(95 + x, 65 + y, 1, 3);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(98 + x, 66 + y, 1, 2);
        g2d.fillRect(97 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(99 + x, 67 + y, 1, 5);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(98 + x, 69 + y, 1, 2);
        g2d.fillRect(97 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(100 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 36 + y, 1, 1);
        g2d.fillRect(95 + x, 37 + y, 1, 1);
        g2d.fillRect(96 + x, 38 + y, 1, 3);
        g2d.fillRect(117 + x, 43 + y, 1, 2);
        g2d.fillRect(96 + x, 44 + y, 2, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 2);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(95 + x, 46 + y, 1, 2);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 2);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 3);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(94 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 3);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(95 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 3);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(97 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 3);
        g2d.fillRect(98 + x, 61 + y, 1, 1);
        g2d.fillRect(95 + x, 61 + y, 1, 4);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 7);
        g2d.fillRect(99 + x, 65 + y, 1, 2);
        g2d.fillRect(96 + x, 65 + y, 2, 1);
        g2d.fillRect(100 + x, 66 + y, 1, 2);
        g2d.fillRect(96 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(97 + x, 68 + y, 2, 1);
        g2d.fillRect(97 + x, 70 + y, 1, 1);
        g2d.fillRect(98 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 37 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 3);
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 43 + y, 1, 3);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 2, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 55 + y, 2, 1);
        g2d.fillRect(95 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 4);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 3);
        g2d.fillRect(97 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 4);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 2, 1);
        g2d.fillRect(97 + x, 67 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 16 + y, 1, 9);
        g2d.fillRect(108 + x, 16 + y, 1, 3);
        g2d.fillRect(107 + x, 16 + y, 1, 3);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 4, 1);
        g2d.fillRect(98 + x, 17 + y, 3, 1);
        g2d.fillRect(97 + x, 18 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 4);
        g2d.fillRect(107 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 4);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 2, 1);
        g2d.fillRect(96 + x, 21 + y, 2, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 3);
        g2d.fillRect(101 + x, 22 + y, 3, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 23 + y, 2, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 19);
        g2d.fillRect(112 + x, 25 + y, 1, 2);
        g2d.fillRect(101 + x, 25 + y, 2, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(92 + x, 25 + y, 3, 1);
        g2d.fillRect(99 + x, 26 + y, 2, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 3);
        g2d.fillRect(96 + x, 28 + y, 1, 2);
        g2d.fillRect(95 + x, 28 + y, 1, 2);
        g2d.fillRect(93 + x, 28 + y, 1, 2);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 1);
        g2d.fillRect(111 + x, 37 + y, 1, 7);
        g2d.fillRect(110 + x, 41 + y, 1, 1);
        g2d.fillRect(110 + x, 44 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 17 + y, 4, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 2, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 2, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 3);
        g2d.fillRect(98 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 22 + y, 1, 4);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 3);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 2);
        g2d.fillRect(92 + x, 27 + y, 5, 1);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(111 + x, 34 + y, 1, 3);
        g2d.fillRect(112 + x, 43 + y, 1, 1);
        g2d.fillRect(111 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(102 + x, 18 + y, 1, 3);
        g2d.fillRect(101 + x, 18 + y, 1, 4);
        g2d.fillRect(106 + x, 19 + y, 2, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 2);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 2, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 10);
        g2d.fillRect(100 + x, 24 + y, 3, 1);
        g2d.fillRect(99 + x, 25 + y, 2, 1);
        g2d.fillRect(93 + x, 26 + y, 6, 1);
        g2d.fillRect(112 + x, 27 + y, 1, 16);
    }
}
