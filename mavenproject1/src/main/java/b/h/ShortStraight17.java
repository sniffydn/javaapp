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
public class ShortStraight17 extends SuperH
{
    public ShortStraight17()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public ShortStraight17(int step, int dir)
    {
        super(step, dir);
    }

    public ShortStraight17(int step, int dir, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 2);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 4);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 5);
        g2d.fillRect(95 + x, 29 + y, 1, 5);
        g2d.fillRect(102 + x, 33 + y, 1, 3);
        g2d.fillRect(96 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 1);
        g2d.fillRect(103 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 2, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 12 + y, 3, 1);
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 5);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 14 + y, 2, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 3);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(111 + x, 17 + y, 1, 3);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 4);
        g2d.fillRect(113 + x, 18 + y, 2, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 6);
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(110 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 2);
        g2d.fillRect(116 + x, 21 + y, 1, 3);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 2);
        g2d.fillRect(107 + x, 22 + y, 1, 2);
        g2d.fillRect(120 + x, 22 + y, 1, 2);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 24 + y, 1, 4);
        g2d.fillRect(121 + x, 24 + y, 1, 8);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 5);
        g2d.fillRect(119 + x, 28 + y, 1, 2);
        g2d.fillRect(99 + x, 30 + y, 1, 8);
        g2d.fillRect(102 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 2, 1);
        g2d.fillRect(122 + x, 32 + y, 1, 4);
        g2d.fillRect(103 + x, 33 + y, 1, 4);
        g2d.fillRect(118 + x, 33 + y, 1, 2);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(120 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 36 + y, 1, 2);
        g2d.fillRect(104 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 3);
        g2d.fillRect(112 + x, 15 + y, 2, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 4);
        g2d.fillRect(104 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 2);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 3);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 22 + y, 1, 2);
        g2d.fillRect(97 + x, 23 + y, 1, 3);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 3);
        g2d.fillRect(105 + x, 24 + y, 1, 2);
        g2d.fillRect(120 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 25 + y, 1, 4);
        g2d.fillRect(100 + x, 26 + y, 1, 3);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 2);
        g2d.fillRect(122 + x, 27 + y, 1, 5);
        g2d.fillRect(99 + x, 29 + y, 1, 1);
        g2d.fillRect(121 + x, 32 + y, 1, 4);
        g2d.fillRect(96 + x, 33 + y, 2, 1);
        g2d.fillRect(120 + x, 33 + y, 1, 2);
        g2d.fillRect(95 + x, 34 + y, 1, 1);
        g2d.fillRect(97 + x, 34 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 1);
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 1);
        g2d.fillRect(104 + x, 35 + y, 1, 2);
        g2d.fillRect(102 + x, 36 + y, 1, 2);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 11 + y, 3, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 4);
        g2d.fillRect(106 + x, 13 + y, 2, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 3);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 3);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 19 + y, 1, 4);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 2);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(115 + x, 20 + y, 1, 3);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 15);
        g2d.fillRect(118 + x, 21 + y, 1, 2);
        g2d.fillRect(99 + x, 22 + y, 1, 7);
        g2d.fillRect(105 + x, 22 + y, 1, 2);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(104 + x, 24 + y, 1, 2);
        g2d.fillRect(120 + x, 25 + y, 1, 2);
        g2d.fillRect(97 + x, 26 + y, 1, 7);
        g2d.fillRect(103 + x, 28 + y, 1, 3);
        g2d.fillRect(100 + x, 29 + y, 1, 9);
        g2d.fillRect(102 + x, 29 + y, 1, 1);
        g2d.fillRect(120 + x, 29 + y, 1, 4);
        g2d.fillRect(119 + x, 30 + y, 1, 6);
        g2d.fillRect(102 + x, 31 + y, 1, 1);
        g2d.fillRect(98 + x, 32 + y, 1, 6);
        g2d.fillRect(118 + x, 35 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 8);
        g2d.fillRect(103 + x, 27 + y, 1, 1);
        g2d.fillRect(120 + x, 27 + y, 1, 2);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 1);
        g2d.fillRect(108 + x, 26 + y, 1, 1);
        g2d.fillRect(107 + x, 27 + y, 1, 1);
        g2d.fillRect(106 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(114 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 29 + y, 1, 1);
        g2d.fillRect(104 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 2);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(107 + x, 25 + y, 1, 2);
        g2d.fillRect(106 + x, 26 + y, 1, 2);
        g2d.fillRect(105 + x, 27 + y, 1, 2);
        g2d.fillRect(104 + x, 28 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 27 + y, 1, 1);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(96 + x, 35 + y, 1, 3);
        g2d.fillRect(117 + x, 36 + y, 1, 2);
        g2d.fillRect(95 + x, 38 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 6);
        g2d.fillRect(104 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 2);
        g2d.fillRect(116 + x, 38 + y, 1, 4);
        g2d.fillRect(119 + x, 38 + y, 1, 3);
        g2d.fillRect(103 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 4);
        g2d.fillRect(104 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(104 + x, 42 + y, 1, 3);
        g2d.fillRect(113 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 44 + y, 1, 2);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 35 + y, 1, 6);
        g2d.fillRect(122 + x, 35 + y, 1, 2);
        g2d.fillRect(116 + x, 36 + y, 1, 2);
        g2d.fillRect(99 + x, 37 + y, 1, 7);
        g2d.fillRect(101 + x, 37 + y, 2, 1);
        g2d.fillRect(104 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 9);
        g2d.fillRect(117 + x, 38 + y, 1, 3);
        g2d.fillRect(103 + x, 42 + y, 1, 3);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(120 + x, 42 + y, 1, 2);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 35 + y, 1, 6);
        g2d.fillRect(97 + x, 37 + y, 1, 1);
        g2d.fillRect(119 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 5);
        g2d.fillRect(98 + x, 40 + y, 1, 4);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(120 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 3);
        g2d.fillRect(97 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 37 + y, 1, 2);
        g2d.fillRect(115 + x, 38 + y, 1, 1);
        g2d.fillRect(104 + x, 39 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 35 + y, 1, 2);
        g2d.fillRect(118 + x, 36 + y, 1, 6);
        g2d.fillRect(98 + x, 37 + y, 1, 3);
        g2d.fillRect(100 + x, 37 + y, 1, 6);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 5);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 2);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 4);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 5);
        g2d.fillRect(120 + x, 29 + y, 1, 5);
        g2d.fillRect(113 + x, 33 + y, 1, 3);
        g2d.fillRect(119 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 1);
        g2d.fillRect(112 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 2, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 12 + y, 3, 1);
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 5);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 2, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 2);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 3);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 1, 3);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 4);
        g2d.fillRect(101 + x, 18 + y, 2, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 6);
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 2);
        g2d.fillRect(99 + x, 21 + y, 1, 3);
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 2);
        g2d.fillRect(108 + x, 22 + y, 1, 2);
        g2d.fillRect(95 + x, 22 + y, 1, 2);
        g2d.fillRect(113 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(98 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 24 + y, 1, 4);
        g2d.fillRect(94 + x, 24 + y, 1, 8);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 5);
        g2d.fillRect(96 + x, 28 + y, 1, 2);
        g2d.fillRect(116 + x, 30 + y, 1, 8);
        g2d.fillRect(113 + x, 30 + y, 1, 1);
        g2d.fillRect(112 + x, 32 + y, 2, 1);
        g2d.fillRect(93 + x, 32 + y, 1, 4);
        g2d.fillRect(112 + x, 33 + y, 1, 4);
        g2d.fillRect(97 + x, 33 + y, 1, 2);
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 35 + y, 1, 2);
        g2d.fillRect(95 + x, 35 + y, 1, 1);
        g2d.fillRect(114 + x, 36 + y, 1, 2);
        g2d.fillRect(111 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 3);
        g2d.fillRect(102 + x, 15 + y, 2, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(110 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 4);
        g2d.fillRect(111 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 3);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 22 + y, 1, 2);
        g2d.fillRect(118 + x, 23 + y, 1, 3);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 3);
        g2d.fillRect(110 + x, 24 + y, 1, 2);
        g2d.fillRect(95 + x, 24 + y, 1, 1);
        g2d.fillRect(113 + x, 25 + y, 1, 4);
        g2d.fillRect(115 + x, 26 + y, 1, 3);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 2);
        g2d.fillRect(93 + x, 27 + y, 1, 5);
        g2d.fillRect(116 + x, 29 + y, 1, 1);
        g2d.fillRect(94 + x, 32 + y, 1, 4);
        g2d.fillRect(118 + x, 33 + y, 2, 1);
        g2d.fillRect(95 + x, 33 + y, 1, 2);
        g2d.fillRect(120 + x, 34 + y, 1, 1);
        g2d.fillRect(118 + x, 34 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 1);
        g2d.fillRect(112 + x, 31 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 1);
        g2d.fillRect(111 + x, 35 + y, 1, 2);
        g2d.fillRect(113 + x, 36 + y, 1, 2);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 11 + y, 3, 1);
        g2d.fillRect(112 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 4);
        g2d.fillRect(108 + x, 13 + y, 2, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(113 + x, 15 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(114 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 3);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 3);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 19 + y, 1, 4);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(100 + x, 20 + y, 1, 3);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 15);
        g2d.fillRect(97 + x, 21 + y, 1, 2);
        g2d.fillRect(116 + x, 22 + y, 1, 7);
        g2d.fillRect(110 + x, 22 + y, 1, 2);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(111 + x, 24 + y, 1, 2);
        g2d.fillRect(95 + x, 25 + y, 1, 2);
        g2d.fillRect(118 + x, 26 + y, 1, 7);
        g2d.fillRect(112 + x, 28 + y, 1, 3);
        g2d.fillRect(115 + x, 29 + y, 1, 9);
        g2d.fillRect(113 + x, 29 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 1, 4);
        g2d.fillRect(96 + x, 30 + y, 1, 6);
        g2d.fillRect(113 + x, 31 + y, 1, 1);
        g2d.fillRect(117 + x, 32 + y, 1, 6);
        g2d.fillRect(97 + x, 35 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 8);
        g2d.fillRect(112 + x, 27 + y, 1, 1);
        g2d.fillRect(95 + x, 27 + y, 1, 2);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 1);
        g2d.fillRect(107 + x, 26 + y, 1, 1);
        g2d.fillRect(108 + x, 27 + y, 1, 1);
        g2d.fillRect(109 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(101 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 29 + y, 1, 1);
        g2d.fillRect(111 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 2);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 2);
        g2d.fillRect(102 + x, 24 + y, 1, 1);
        g2d.fillRect(108 + x, 25 + y, 1, 2);
        g2d.fillRect(109 + x, 26 + y, 1, 2);
        g2d.fillRect(110 + x, 27 + y, 1, 2);
        g2d.fillRect(111 + x, 28 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 27 + y, 1, 1);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 35 + y, 1, 3);
        g2d.fillRect(98 + x, 36 + y, 1, 2);
        g2d.fillRect(120 + x, 38 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 6);
        g2d.fillRect(111 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 2);
        g2d.fillRect(99 + x, 38 + y, 1, 4);
        g2d.fillRect(96 + x, 38 + y, 1, 3);
        g2d.fillRect(112 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 4);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 2);
        g2d.fillRect(111 + x, 42 + y, 1, 3);
        g2d.fillRect(102 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(95 + x, 35 + y, 1, 6);
        g2d.fillRect(93 + x, 35 + y, 1, 2);
        g2d.fillRect(99 + x, 36 + y, 1, 2);
        g2d.fillRect(116 + x, 37 + y, 1, 7);
        g2d.fillRect(113 + x, 37 + y, 2, 1);
        g2d.fillRect(111 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 9);
        g2d.fillRect(98 + x, 38 + y, 1, 3);
        g2d.fillRect(112 + x, 42 + y, 1, 3);
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(95 + x, 42 + y, 1, 2);
        g2d.fillRect(100 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(111 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 35 + y, 1, 6);
        g2d.fillRect(118 + x, 37 + y, 1, 1);
        g2d.fillRect(96 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 5);
        g2d.fillRect(117 + x, 40 + y, 1, 4);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 3);
        g2d.fillRect(118 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 37 + y, 1, 2);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(111 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 35 + y, 1, 2);
        g2d.fillRect(97 + x, 36 + y, 1, 6);
        g2d.fillRect(117 + x, 37 + y, 1, 3);
        g2d.fillRect(115 + x, 37 + y, 1, 6);
        g2d.fillRect(98 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 5);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
    }
}
