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
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class MediumWavy9 extends SuperH
{
    public MediumWavy9()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumWavy9(int step, int dir)
    {
        super(step, dir);
    }

    public MediumWavy9(int step, int dir, ColorArray colorSwitch)
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
    int prevY = 0;

    public void drawVeryBack(int x, int y, GraphicsMap g2d)
    {
        super.drawVeryBack(x, y, g2d);
    }

    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 2);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 11 + y, 2, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 2, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(118 + x, 16 + y, 1, 2);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 2, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(123 + x, 23 + y, 1, 3);
        g2d.fillRect(99 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 3);
        g2d.fillRect(122 + x, 26 + y, 1, 2);
        g2d.fillRect(120 + x, 27 + y, 1, 2);
        g2d.fillRect(95 + x, 28 + y, 1, 1);
        g2d.fillRect(101 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 2);
        g2d.fillRect(119 + x, 29 + y, 1, 1);
        g2d.fillRect(104 + x, 32 + y, 1, 1);
        g2d.fillRect(120 + x, 32 + y, 1, 2);
        g2d.fillRect(98 + x, 33 + y, 1, 1);
        g2d.fillRect(103 + x, 33 + y, 1, 2);
        g2d.fillRect(105 + x, 35 + y, 1, 2);
        g2d.fillRect(106 + x, 36 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 11 + y, 1, 2);
        g2d.fillRect(103 + x, 12 + y, 1, 2);
        g2d.fillRect(104 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 3);
        g2d.fillRect(100 + x, 14 + y, 2, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(105 + x, 15 + y, 3, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 4);
        g2d.fillRect(100 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 4, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 3, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 2, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 2, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(122 + x, 20 + y, 1, 2);
        g2d.fillRect(100 + x, 21 + y, 2, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 4);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 2);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 3);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 23 + y, 1, 4);
        g2d.fillRect(98 + x, 23 + y, 1, 2);
        g2d.fillRect(101 + x, 23 + y, 1, 2);
        g2d.fillRect(104 + x, 23 + y, 1, 2);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 2, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);
        g2d.fillRect(122 + x, 24 + y, 1, 2);
        g2d.fillRect(95 + x, 25 + y, 1, 3);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 5);
        g2d.fillRect(103 + x, 25 + y, 1, 4);
        g2d.fillRect(105 + x, 25 + y, 1, 2);
        g2d.fillRect(107 + x, 25 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 2);
        g2d.fillRect(99 + x, 26 + y, 1, 3);
        g2d.fillRect(106 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 2);
        g2d.fillRect(121 + x, 26 + y, 1, 3);
        g2d.fillRect(123 + x, 26 + y, 1, 3);
        g2d.fillRect(98 + x, 28 + y, 1, 2);
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(105 + x, 28 + y, 1, 2);
        g2d.fillRect(96 + x, 29 + y, 1, 3);
        g2d.fillRect(97 + x, 29 + y, 1, 2);
        g2d.fillRect(101 + x, 29 + y, 1, 1);
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 6);
        g2d.fillRect(122 + x, 30 + y, 1, 2);
        g2d.fillRect(100 + x, 31 + y, 1, 2);
        g2d.fillRect(101 + x, 31 + y, 1, 1);
        g2d.fillRect(120 + x, 31 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 1);
        g2d.fillRect(121 + x, 32 + y, 1, 1);
        g2d.fillRect(104 + x, 33 + y, 1, 3);
        g2d.fillRect(118 + x, 33 + y, 1, 1);
        g2d.fillRect(123 + x, 33 + y, 1, 1);
        g2d.fillRect(99 + x, 34 + y, 3, 1);
        g2d.fillRect(117 + x, 34 + y, 1, 3);
        g2d.fillRect(122 + x, 34 + y, 1, 1);
        g2d.fillRect(101 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(118 + x, 35 + y, 1, 1);
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(103 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 2, 1);
        g2d.fillRect(105 + x, 14 + y, 3, 1);
        g2d.fillRect(109 + x, 14 + y, 2, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 2, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 4, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 3);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 3);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 19 + y, 1, 3);
        g2d.fillRect(114 + x, 19 + y, 2, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 2, 1);
        g2d.fillRect(100 + x, 20 + y, 2, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 3);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 2, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 2);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 3);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 3);
        g2d.fillRect(109 + x, 22 + y, 1, 4);
        g2d.fillRect(111 + x, 22 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(122 + x, 22 + y, 1, 2);
        g2d.fillRect(120 + x, 23 + y, 2, 1);
        g2d.fillRect(102 + x, 24 + y, 2, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(121 + x, 24 + y, 1, 2);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(101 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 1);
        g2d.fillRect(105 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(122 + x, 28 + y, 1, 2);
        g2d.fillRect(99 + x, 29 + y, 1, 5);
        g2d.fillRect(104 + x, 29 + y, 1, 3);
        g2d.fillRect(98 + x, 30 + y, 1, 3);
        g2d.fillRect(101 + x, 30 + y, 1, 1);
        g2d.fillRect(103 + x, 30 + y, 1, 2);
        g2d.fillRect(120 + x, 30 + y, 1, 1);
        g2d.fillRect(121 + x, 31 + y, 1, 1);
        g2d.fillRect(123 + x, 31 + y, 1, 2);
        g2d.fillRect(101 + x, 32 + y, 1, 1);
        g2d.fillRect(100 + x, 33 + y, 1, 1);
        g2d.fillRect(121 + x, 33 + y, 1, 2);
        g2d.fillRect(102 + x, 34 + y, 1, 2);
        g2d.fillRect(118 + x, 34 + y, 1, 1);
        g2d.fillRect(120 + x, 34 + y, 1, 1);
        g2d.fillRect(103 + x, 35 + y, 1, 1);
        g2d.fillRect(104 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 2, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 2, 1);
        g2d.fillRect(97 + x, 22 + y, 2, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 2, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 1);
        g2d.fillRect(104 + x, 28 + y, 1, 1);
        g2d.fillRect(103 + x, 29 + y, 1, 1);
        g2d.fillRect(102 + x, 30 + y, 1, 1);
        g2d.fillRect(121 + x, 30 + y, 1, 1);
        g2d.fillRect(97 + x, 31 + y, 1, 1);
        g2d.fillRect(103 + x, 32 + y, 1, 1);
        g2d.fillRect(102 + x, 33 + y, 1, 1);
        g2d.fillRect(122 + x, 33 + y, 1, 1);
        g2d.fillRect(118 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 27 + y, 1, 1);
        g2d.fillRect(97 + x, 28 + y, 1, 1);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(102 + x, 31 + y, 1, 1);
        g2d.fillRect(122 + x, 32 + y, 1, 1);
        g2d.fillRect(101 + x, 33 + y, 1, 1);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(95 + x, 35 + y, 1, 4);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(103 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(105 + x, 37 + y, 2, 1);
        g2d.fillRect(120 + x, 37 + y, 1, 2);
        g2d.fillRect(124 + x, 37 + y, 1, 4);
        g2d.fillRect(94 + x, 38 + y, 1, 3);
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(106 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 2);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(120 + x, 41 + y, 1, 2);
        g2d.fillRect(95 + x, 42 + y, 1, 2);
        g2d.fillRect(119 + x, 42 + y, 1, 6);
        g2d.fillRect(118 + x, 43 + y, 1, 1);
        g2d.fillRect(98 + x, 44 + y, 1, 1);
        g2d.fillRect(123 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 2);
        g2d.fillRect(95 + x, 48 + y, 1, 2);
        g2d.fillRect(123 + x, 49 + y, 1, 3);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 4);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(123 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 30 + y, 1, 3);
        g2d.fillRect(96 + x, 32 + y, 1, 1);
        g2d.fillRect(95 + x, 34 + y, 1, 1);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(121 + x, 34 + y, 1, 3);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 35 + y, 2, 1);
        g2d.fillRect(120 + x, 35 + y, 1, 2);
        g2d.fillRect(122 + x, 35 + y, 2, 1);
        g2d.fillRect(96 + x, 36 + y, 1, 3);
        g2d.fillRect(97 + x, 36 + y, 1, 2);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(104 + x, 36 + y, 2, 1);
        g2d.fillRect(123 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 3);
        g2d.fillRect(103 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 6);
        g2d.fillRect(116 + x, 37 + y, 2, 1);
        g2d.fillRect(119 + x, 37 + y, 1, 2);
        g2d.fillRect(104 + x, 38 + y, 1, 3);
        g2d.fillRect(105 + x, 38 + y, 1, 3);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 1);
        g2d.fillRect(121 + x, 38 + y, 1, 3);
        g2d.fillRect(97 + x, 39 + y, 4, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(116 + x, 39 + y, 2, 1);
        g2d.fillRect(120 + x, 39 + y, 1, 2);
        g2d.fillRect(123 + x, 39 + y, 1, 2);
        g2d.fillRect(99 + x, 40 + y, 1, 6);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(122 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 42 + y, 1, 5);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(101 + x, 42 + y, 1, 2);
        g2d.fillRect(104 + x, 42 + y, 1, 3);
        g2d.fillRect(114 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(121 + x, 42 + y, 1, 4);
        g2d.fillRect(123 + x, 42 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 1, 2);
        g2d.fillRect(103 + x, 43 + y, 1, 4);
        g2d.fillRect(105 + x, 43 + y, 1, 2);
        g2d.fillRect(117 + x, 43 + y, 1, 4);
        g2d.fillRect(120 + x, 43 + y, 1, 2);
        g2d.fillRect(118 + x, 44 + y, 1, 1);
        g2d.fillRect(122 + x, 44 + y, 1, 1);
        g2d.fillRect(123 + x, 45 + y, 1, 2);
        g2d.fillRect(97 + x, 46 + y, 1, 3);
        g2d.fillRect(100 + x, 46 + y, 1, 3);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(120 + x, 47 + y, 1, 3);
        g2d.fillRect(98 + x, 48 + y, 1, 3);
        g2d.fillRect(102 + x, 48 + y, 3, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(121 + x, 48 + y, 1, 3);
        g2d.fillRect(122 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 2, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 2, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 31 + y, 2, 1);
        g2d.fillRect(95 + x, 33 + y, 2, 1);
        g2d.fillRect(98 + x, 33 + y, 1, 1);
        g2d.fillRect(123 + x, 33 + y, 1, 1);
        g2d.fillRect(97 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 34 + y, 2, 1);
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 1, 2);
        g2d.fillRect(98 + x, 36 + y, 1, 2);
        g2d.fillRect(101 + x, 36 + y, 1, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 1);
        g2d.fillRect(122 + x, 36 + y, 1, 1);
        g2d.fillRect(104 + x, 37 + y, 1, 1);
        g2d.fillRect(118 + x, 37 + y, 1, 1);
        g2d.fillRect(121 + x, 37 + y, 1, 1);
        g2d.fillRect(123 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 38 + y, 2, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(116 + x, 38 + y, 2, 1);
        g2d.fillRect(95 + x, 39 + y, 1, 3);
        g2d.fillRect(103 + x, 39 + y, 1, 1);
        g2d.fillRect(118 + x, 39 + y, 2, 1);
        g2d.fillRect(122 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 2);
        g2d.fillRect(101 + x, 40 + y, 1, 2);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 1);
        g2d.fillRect(123 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 2, 1);
        g2d.fillRect(97 + x, 43 + y, 1, 2);
        g2d.fillRect(122 + x, 43 + y, 1, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 2);
        g2d.fillRect(122 + x, 45 + y, 1, 1);
        g2d.fillRect(95 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 3, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 2, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(122 + x, 50 + y, 1, 2);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 33 + y, 1, 1);
        g2d.fillRect(123 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(118 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 37 + y, 1, 1);
        g2d.fillRect(122 + x, 37 + y, 1, 1);
        g2d.fillRect(103 + x, 38 + y, 1, 1);
        g2d.fillRect(123 + x, 38 + y, 1, 1);
        g2d.fillRect(96 + x, 39 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 2);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(122 + x, 42 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 2, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 2);
        g2d.fillRect(122 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(101 + x, 49 + y, 2, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 32 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 1);
        g2d.fillRect(122 + x, 34 + y, 1, 1);
        g2d.fillRect(102 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(122 + x, 38 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(122 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 1);
        g2d.fillRect(122 + x, 47 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 22 + y, 2, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 2, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 22 + y, 1, 2);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 3);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(107 + x, 27 + y, 1, 2);
        g2d.fillRect(108 + x, 27 + y, 1, 1);
        g2d.fillRect(106 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(114 + x, 24 + y, 1, 1);
        g2d.fillRect(107 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 25 + y, 2, 1);
        g2d.fillRect(106 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 2);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 11 + y, 2, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 2, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(97 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 1, 2);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 2, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(92 + x, 23 + y, 1, 3);
        g2d.fillRect(116 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 3);
        g2d.fillRect(93 + x, 26 + y, 1, 2);
        g2d.fillRect(95 + x, 27 + y, 1, 2);
        g2d.fillRect(120 + x, 28 + y, 1, 1);
        g2d.fillRect(114 + x, 28 + y, 1, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 2);
        g2d.fillRect(96 + x, 29 + y, 1, 1);
        g2d.fillRect(111 + x, 32 + y, 1, 1);
        g2d.fillRect(95 + x, 32 + y, 1, 2);
        g2d.fillRect(117 + x, 33 + y, 1, 1);
        g2d.fillRect(112 + x, 33 + y, 1, 2);
        g2d.fillRect(110 + x, 35 + y, 1, 2);
        g2d.fillRect(109 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 11 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 1, 2);
        g2d.fillRect(110 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 14 + y, 2, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(108 + x, 15 + y, 3, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 4);
        g2d.fillRect(115 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 4, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 3, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 2, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 2, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(93 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 21 + y, 2, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 4);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 2);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 3);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 3);
        g2d.fillRect(118 + x, 23 + y, 1, 4);
        g2d.fillRect(117 + x, 23 + y, 1, 2);
        g2d.fillRect(114 + x, 23 + y, 1, 2);
        g2d.fillRect(111 + x, 23 + y, 1, 2);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 2, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);
        g2d.fillRect(93 + x, 24 + y, 1, 2);
        g2d.fillRect(120 + x, 25 + y, 1, 3);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 5);
        g2d.fillRect(112 + x, 25 + y, 1, 4);
        g2d.fillRect(110 + x, 25 + y, 1, 2);
        g2d.fillRect(108 + x, 25 + y, 1, 1);
        g2d.fillRect(95 + x, 25 + y, 1, 2);
        g2d.fillRect(116 + x, 26 + y, 1, 3);
        g2d.fillRect(109 + x, 26 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 2);
        g2d.fillRect(94 + x, 26 + y, 1, 3);
        g2d.fillRect(92 + x, 26 + y, 1, 3);
        g2d.fillRect(117 + x, 28 + y, 1, 2);
        g2d.fillRect(115 + x, 28 + y, 1, 1);
        g2d.fillRect(110 + x, 28 + y, 1, 2);
        g2d.fillRect(119 + x, 29 + y, 1, 3);
        g2d.fillRect(118 + x, 29 + y, 1, 2);
        g2d.fillRect(114 + x, 29 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 6);
        g2d.fillRect(93 + x, 30 + y, 1, 2);
        g2d.fillRect(115 + x, 31 + y, 1, 2);
        g2d.fillRect(114 + x, 31 + y, 1, 1);
        g2d.fillRect(95 + x, 31 + y, 1, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 1);
        g2d.fillRect(94 + x, 32 + y, 1, 1);
        g2d.fillRect(111 + x, 33 + y, 1, 3);
        g2d.fillRect(97 + x, 33 + y, 1, 1);
        g2d.fillRect(92 + x, 33 + y, 1, 1);
        g2d.fillRect(114 + x, 34 + y, 3, 1);
        g2d.fillRect(98 + x, 34 + y, 1, 3);
        g2d.fillRect(93 + x, 34 + y, 1, 1);
        g2d.fillRect(114 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(97 + x, 35 + y, 1, 1);
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(112 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 2, 1);
        g2d.fillRect(108 + x, 14 + y, 3, 1);
        g2d.fillRect(105 + x, 14 + y, 2, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 2, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 4, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 3);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 3);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 3);
        g2d.fillRect(100 + x, 19 + y, 2, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 2, 1);
        g2d.fillRect(114 + x, 20 + y, 2, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 3);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 2, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 3);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 3);
        g2d.fillRect(106 + x, 22 + y, 1, 4);
        g2d.fillRect(104 + x, 22 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
        g2d.fillRect(93 + x, 22 + y, 1, 2);
        g2d.fillRect(94 + x, 23 + y, 2, 1);
        g2d.fillRect(112 + x, 24 + y, 2, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(94 + x, 24 + y, 1, 2);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(114 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 1);
        g2d.fillRect(110 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 1);
        g2d.fillRect(93 + x, 28 + y, 1, 2);
        g2d.fillRect(116 + x, 29 + y, 1, 5);
        g2d.fillRect(111 + x, 29 + y, 1, 3);
        g2d.fillRect(117 + x, 30 + y, 1, 3);
        g2d.fillRect(114 + x, 30 + y, 1, 1);
        g2d.fillRect(112 + x, 30 + y, 1, 2);
        g2d.fillRect(95 + x, 30 + y, 1, 1);
        g2d.fillRect(94 + x, 31 + y, 1, 1);
        g2d.fillRect(92 + x, 31 + y, 1, 2);
        g2d.fillRect(114 + x, 32 + y, 1, 1);
        g2d.fillRect(115 + x, 33 + y, 1, 1);
        g2d.fillRect(94 + x, 33 + y, 1, 2);
        g2d.fillRect(113 + x, 34 + y, 1, 2);
        g2d.fillRect(97 + x, 34 + y, 1, 1);
        g2d.fillRect(95 + x, 34 + y, 1, 1);
        g2d.fillRect(112 + x, 35 + y, 1, 1);
        g2d.fillRect(111 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 2, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 2, 1);
        g2d.fillRect(117 + x, 22 + y, 2, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 23 + y, 2, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 1);
        g2d.fillRect(111 + x, 28 + y, 1, 1);
        g2d.fillRect(112 + x, 29 + y, 1, 1);
        g2d.fillRect(113 + x, 30 + y, 1, 1);
        g2d.fillRect(94 + x, 30 + y, 1, 1);
        g2d.fillRect(118 + x, 31 + y, 1, 1);
        g2d.fillRect(112 + x, 32 + y, 1, 1);
        g2d.fillRect(113 + x, 33 + y, 1, 1);
        g2d.fillRect(93 + x, 33 + y, 1, 1);
        g2d.fillRect(97 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 27 + y, 1, 1);
        g2d.fillRect(118 + x, 28 + y, 1, 1);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(113 + x, 31 + y, 1, 1);
        g2d.fillRect(93 + x, 32 + y, 1, 1);
        g2d.fillRect(114 + x, 33 + y, 1, 1);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 35 + y, 1, 4);
        g2d.fillRect(115 + x, 35 + y, 1, 1);
        g2d.fillRect(112 + x, 36 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(109 + x, 37 + y, 2, 1);
        g2d.fillRect(95 + x, 37 + y, 1, 2);
        g2d.fillRect(91 + x, 37 + y, 1, 4);
        g2d.fillRect(121 + x, 38 + y, 1, 3);
        g2d.fillRect(117 + x, 38 + y, 1, 1);
        g2d.fillRect(109 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 2);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 1, 2);
        g2d.fillRect(120 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 42 + y, 1, 6);
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(92 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 2);
        g2d.fillRect(92 + x, 49 + y, 1, 3);
        g2d.fillRect(115 + x, 50 + y, 1, 2);
        g2d.fillRect(112 + x, 50 + y, 1, 2);
        g2d.fillRect(96 + x, 50 + y, 1, 4);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(92 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 54 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 28 + y, 1, 1);
        g2d.fillRect(120 + x, 30 + y, 1, 3);
        g2d.fillRect(119 + x, 32 + y, 1, 1);
        g2d.fillRect(120 + x, 34 + y, 1, 1);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(94 + x, 34 + y, 1, 3);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(113 + x, 35 + y, 2, 1);
        g2d.fillRect(95 + x, 35 + y, 1, 2);
        g2d.fillRect(92 + x, 35 + y, 2, 1);
        g2d.fillRect(119 + x, 36 + y, 1, 3);
        g2d.fillRect(118 + x, 36 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(110 + x, 36 + y, 2, 1);
        g2d.fillRect(92 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 3);
        g2d.fillRect(112 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 6);
        g2d.fillRect(98 + x, 37 + y, 2, 1);
        g2d.fillRect(96 + x, 37 + y, 1, 2);
        g2d.fillRect(111 + x, 38 + y, 1, 3);
        g2d.fillRect(110 + x, 38 + y, 1, 3);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 1);
        g2d.fillRect(94 + x, 38 + y, 1, 3);
        g2d.fillRect(115 + x, 39 + y, 4, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(98 + x, 39 + y, 2, 1);
        g2d.fillRect(95 + x, 39 + y, 1, 2);
        g2d.fillRect(92 + x, 39 + y, 1, 2);
        g2d.fillRect(116 + x, 40 + y, 1, 6);
        g2d.fillRect(115 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(93 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 2);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 41 + y, 1, 1);
        g2d.fillRect(119 + x, 42 + y, 1, 5);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(115 + x, 42 + y, 1, 3);
        g2d.fillRect(114 + x, 42 + y, 1, 2);
        g2d.fillRect(111 + x, 42 + y, 1, 3);
        g2d.fillRect(101 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 42 + y, 1, 4);
        g2d.fillRect(92 + x, 42 + y, 1, 2);
        g2d.fillRect(113 + x, 43 + y, 1, 2);
        g2d.fillRect(112 + x, 43 + y, 1, 4);
        g2d.fillRect(110 + x, 43 + y, 1, 2);
        g2d.fillRect(98 + x, 43 + y, 1, 4);
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 44 + y, 1, 1);
        g2d.fillRect(92 + x, 45 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 3);
        g2d.fillRect(115 + x, 46 + y, 1, 3);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 3);
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(111 + x, 48 + y, 3, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 2);
        g2d.fillRect(94 + x, 48 + y, 1, 3);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(111 + x, 49 + y, 2, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 2);
        g2d.fillRect(95 + x, 51 + y, 1, 3);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 2, 1);
        g2d.fillRect(94 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(118 + x, 31 + y, 2, 1);
        g2d.fillRect(119 + x, 33 + y, 2, 1);
        g2d.fillRect(117 + x, 33 + y, 1, 1);
        g2d.fillRect(92 + x, 33 + y, 1, 1);
        g2d.fillRect(118 + x, 34 + y, 1, 2);
        g2d.fillRect(115 + x, 34 + y, 2, 1);
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(96 + x, 35 + y, 1, 2);
        g2d.fillRect(117 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 36 + y, 1, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 1);
        g2d.fillRect(93 + x, 36 + y, 1, 1);
        g2d.fillRect(111 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 37 + y, 1, 1);
        g2d.fillRect(94 + x, 37 + y, 1, 1);
        g2d.fillRect(92 + x, 37 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 2, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(98 + x, 38 + y, 2, 1);
        g2d.fillRect(120 + x, 39 + y, 1, 3);
        g2d.fillRect(112 + x, 39 + y, 1, 1);
        g2d.fillRect(96 + x, 39 + y, 2, 1);
        g2d.fillRect(93 + x, 39 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 1, 2);
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 1);
        g2d.fillRect(92 + x, 41 + y, 1, 1);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(97 + x, 42 + y, 2, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 43 + y, 1, 1);
        g2d.fillRect(120 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 1);
        g2d.fillRect(94 + x, 46 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 3, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 2, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(94 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 33 + y, 1, 1);
        g2d.fillRect(92 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(97 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 37 + y, 1, 1);
        g2d.fillRect(93 + x, 37 + y, 1, 1);
        g2d.fillRect(112 + x, 38 + y, 1, 1);
        g2d.fillRect(92 + x, 38 + y, 1, 1);
        g2d.fillRect(119 + x, 39 + y, 1, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 1, 2);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(93 + x, 42 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 2, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(93 + x, 46 + y, 1, 1);
        g2d.fillRect(94 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 2, 1);
        g2d.fillRect(93 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 32 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 1);
        g2d.fillRect(93 + x, 34 + y, 1, 1);
        g2d.fillRect(113 + x, 36 + y, 1, 1);
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(93 + x, 38 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(93 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(113 + x, 46 + y, 1, 1);
        g2d.fillRect(93 + x, 47 + y, 1, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 22 + y, 2, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 2, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 22 + y, 1, 2);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 3);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(108 + x, 27 + y, 1, 2);
        g2d.fillRect(107 + x, 27 + y, 1, 1);
        g2d.fillRect(109 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 1, 1);
        g2d.fillRect(108 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 2, 1);
        g2d.fillRect(109 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
    }

}
