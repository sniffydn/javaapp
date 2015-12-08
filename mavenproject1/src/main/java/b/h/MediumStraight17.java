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
public class MediumStraight17 extends SuperH
{
    public MediumStraight17()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumStraight17(int step, int dir)
    {
        super(step, dir);
    }

    public MediumStraight17(int step, int dir, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 34 + y, 1, 4);
        g2d.fillRect(104 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 3);
        g2d.fillRect(103 + x, 36 + y, 1, 1);
        g2d.fillRect(104 + x, 37 + y, 1, 2);
        g2d.fillRect(106 + x, 37 + y, 1, 2);
        g2d.fillRect(100 + x, 38 + y, 1, 2);
        g2d.fillRect(103 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 2, 1);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
        g2d.fillRect(104 + x, 40 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 2, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(105 + x, 44 + y, 1, 2);
        g2d.fillRect(106 + x, 47 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 28 + y, 1, 7);
        g2d.fillRect(102 + x, 29 + y, 1, 8);
        g2d.fillRect(98 + x, 32 + y, 1, 1);
        g2d.fillRect(103 + x, 32 + y, 1, 4);
        g2d.fillRect(99 + x, 33 + y, 1, 3);
        g2d.fillRect(100 + x, 35 + y, 1, 2);
        g2d.fillRect(101 + x, 36 + y, 1, 1);
        g2d.fillRect(107 + x, 39 + y, 1, 2);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 3);
        g2d.fillRect(108 + x, 42 + y, 1, 2);
        g2d.fillRect(104 + x, 43 + y, 1, 2);
        g2d.fillRect(105 + x, 46 + y, 2, 1);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 28 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 3);
        g2d.fillRect(96 + x, 31 + y, 1, 2);
        g2d.fillRect(97 + x, 31 + y, 1, 4);
        g2d.fillRect(99 + x, 31 + y, 1, 2);
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(100 + x, 33 + y, 1, 2);
        g2d.fillRect(101 + x, 34 + y, 1, 2);
        g2d.fillRect(98 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(103 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 2, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 1);
        g2d.fillRect(106 + x, 39 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 1);
        g2d.fillRect(105 + x, 40 + y, 1, 1);
        g2d.fillRect(107 + x, 41 + y, 1, 1);
        g2d.fillRect(105 + x, 43 + y, 1, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 2);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 2);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 5);
        g2d.fillRect(103 + x, 29 + y, 1, 2);
        g2d.fillRect(99 + x, 30 + y, 1, 1);
        g2d.fillRect(101 + x, 32 + y, 1, 2);
        g2d.fillRect(104 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 2, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(106 + x, 40 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(105 + x, 41 + y, 1, 2);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(96 + x, 28 + y, 1, 3);
        g2d.fillRect(99 + x, 28 + y, 1, 2);
        g2d.fillRect(101 + x, 28 + y, 1, 4);
        g2d.fillRect(103 + x, 28 + y, 1, 1);
        g2d.fillRect(104 + x, 39 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 2, 1);
        g2d.fillRect(106 + x, 41 + y, 1, 3);
        g2d.fillRect(107 + x, 42 + y, 1, 8);
        g2d.fillRect(108 + x, 44 + y, 1, 3);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(122 + x, 24 + y, 1, 2);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 3);
        g2d.fillRect(118 + x, 28 + y, 1, 2);
        g2d.fillRect(119 + x, 32 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 2);
        g2d.fillRect(122 + x, 26 + y, 1, 5);
        g2d.fillRect(118 + x, 35 + y, 1, 4);
        g2d.fillRect(119 + x, 38 + y, 1, 5);
        g2d.fillRect(121 + x, 38 + y, 1, 1);
        g2d.fillRect(120 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 22 + y, 2, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(120 + x, 25 + y, 1, 2);
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 2);
        g2d.fillRect(122 + x, 31 + y, 1, 4);
        g2d.fillRect(121 + x, 36 + y, 1, 2);
        g2d.fillRect(120 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(116 + x, 24 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 25 + y, 1, 1);
        g2d.fillRect(118 + x, 26 + y, 1, 1);
        g2d.fillRect(120 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 29 + y, 1, 1);
        g2d.fillRect(121 + x, 34 + y, 1, 2);
        g2d.fillRect(120 + x, 37 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 2);
        g2d.fillRect(119 + x, 26 + y, 1, 3);
        g2d.fillRect(121 + x, 26 + y, 1, 8);
        g2d.fillRect(120 + x, 28 + y, 1, 9);
    }





    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 11 + y, 1, 3);
        g2d.fillRect(105 + x, 11 + y, 1, 3);
        g2d.fillRect(106 + x, 11 + y, 1, 5);
        g2d.fillRect(107 + x, 11 + y, 1, 6);
        g2d.fillRect(108 + x, 11 + y, 1, 10);
        g2d.fillRect(109 + x, 11 + y, 2, 1);
        g2d.fillRect(101 + x, 12 + y, 2, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(109 + x, 13 + y, 1, 8);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 3);
        g2d.fillRect(111 + x, 16 + y, 1, 3);
        g2d.fillRect(112 + x, 16 + y, 3, 1);
        g2d.fillRect(115 + x, 17 + y, 2, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 3, 1);
        g2d.fillRect(117 + x, 18 + y, 2, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 2, 1);
        g2d.fillRect(118 + x, 19 + y, 2, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 3, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 2, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(120 + x, 21 + y, 2, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 4);
        g2d.fillRect(121 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 27 + y, 1, 1);
        g2d.fillRect(118 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 11 + y, 3, 1);
        g2d.fillRect(103 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(101 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 13 + y, 2, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 2, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 3, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 2, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 3);
        g2d.fillRect(115 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 3, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 2, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 2, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 3);
        g2d.fillRect(101 + x, 21 + y, 1, 2);
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 3, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 22 + y, 1, 5);
        g2d.fillRect(113 + x, 22 + y, 2, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 2);
        g2d.fillRect(104 + x, 27 + y, 1, 2);
        g2d.fillRect(118 + x, 34 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 12 + y, 2, 1);
        g2d.fillRect(116 + x, 13 + y, 2, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(118 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 2, 1);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 2, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(112 + x, 19 + y, 2, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(113 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(102 + x, 27 + y, 1, 2);
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 35 + y, 1, 2);
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 12 + y, 3, 1);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 3);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 2);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 1, 2);
        g2d.fillRect(100 + x, 27 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 3);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 7);
        g2d.fillRect(102 + x, 22 + y, 1, 4);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 4);
        g2d.fillRect(96 + x, 24 + y, 1, 5);
        g2d.fillRect(101 + x, 24 + y, 1, 5);
        g2d.fillRect(104 + x, 25 + y, 1, 2);
        g2d.fillRect(103 + x, 26 + y, 1, 3);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(8 + x, 34 + y, 1, 4);
        g2d.fillRect(9 + x, 35 + y, 1, 1);
        g2d.fillRect(14 + x, 36 + y, 1, 3);
        g2d.fillRect(10 + x, 36 + y, 1, 1);
        g2d.fillRect(9 + x, 37 + y, 1, 2);
        g2d.fillRect(7 + x, 37 + y, 1, 2);
        g2d.fillRect(13 + x, 38 + y, 1, 2);
        g2d.fillRect(10 + x, 38 + y, 1, 2);
        g2d.fillRect(11 + x, 39 + y, 2, 1);
        g2d.fillRect(8 + x, 39 + y, 1, 1);
        g2d.fillRect(9 + x, 40 + y, 1, 1);
        g2d.fillRect(10 + x, 41 + y, 1, 1);
        g2d.fillRect(11 + x, 42 + y, 2, 1);
        g2d.fillRect(9 + x, 42 + y, 1, 1);
        g2d.fillRect(8 + x, 44 + y, 1, 2);
        g2d.fillRect(7 + x, 47 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(9 + x, 28 + y, 1, 7);
        g2d.fillRect(11 + x, 29 + y, 1, 8);
        g2d.fillRect(15 + x, 32 + y, 1, 1);
        g2d.fillRect(10 + x, 32 + y, 1, 4);
        g2d.fillRect(14 + x, 33 + y, 1, 3);
        g2d.fillRect(13 + x, 35 + y, 1, 2);
        g2d.fillRect(12 + x, 36 + y, 1, 1);
        g2d.fillRect(6 + x, 39 + y, 1, 2);
        g2d.fillRect(9 + x, 41 + y, 1, 1);
        g2d.fillRect(10 + x, 42 + y, 1, 3);
        g2d.fillRect(5 + x, 42 + y, 1, 2);
        g2d.fillRect(9 + x, 43 + y, 1, 2);
        g2d.fillRect(7 + x, 46 + y, 2, 1);
        g2d.fillRect(9 + x, 47 + y, 1, 1);
        g2d.fillRect(8 + x, 49 + y, 1, 2);
        g2d.fillRect(7 + x, 51 + y, 1, 3);
        g2d.fillRect(8 + x, 53 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(11 + x, 28 + y, 1, 1);
        g2d.fillRect(15 + x, 29 + y, 1, 3);
        g2d.fillRect(17 + x, 31 + y, 1, 2);
        g2d.fillRect(16 + x, 31 + y, 1, 4);
        g2d.fillRect(14 + x, 31 + y, 1, 2);
        g2d.fillRect(10 + x, 31 + y, 1, 1);
        g2d.fillRect(13 + x, 33 + y, 1, 2);
        g2d.fillRect(12 + x, 34 + y, 1, 2);
        g2d.fillRect(15 + x, 35 + y, 1, 1);
        g2d.fillRect(13 + x, 37 + y, 1, 1);
        g2d.fillRect(10 + x, 37 + y, 1, 1);
        g2d.fillRect(11 + x, 38 + y, 2, 1);
        g2d.fillRect(8 + x, 38 + y, 1, 1);
        g2d.fillRect(7 + x, 39 + y, 1, 1);
        g2d.fillRect(11 + x, 40 + y, 1, 1);
        g2d.fillRect(8 + x, 40 + y, 1, 1);
        g2d.fillRect(6 + x, 41 + y, 1, 1);
        g2d.fillRect(8 + x, 43 + y, 1, 1);
        g2d.fillRect(9 + x, 45 + y, 1, 2);
        g2d.fillRect(7 + x, 45 + y, 1, 1);
        g2d.fillRect(8 + x, 47 + y, 1, 2);
        g2d.fillRect(5 + x, 48 + y, 1, 1);
        g2d.fillRect(6 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(15 + x, 28 + y, 1, 1);
        g2d.fillRect(13 + x, 28 + y, 1, 5);
        g2d.fillRect(10 + x, 29 + y, 1, 2);
        g2d.fillRect(14 + x, 30 + y, 1, 1);
        g2d.fillRect(12 + x, 32 + y, 1, 2);
        g2d.fillRect(9 + x, 36 + y, 1, 1);
        g2d.fillRect(11 + x, 37 + y, 2, 1);
        g2d.fillRect(14 + x, 40 + y, 1, 1);
        g2d.fillRect(7 + x, 40 + y, 1, 1);
        g2d.fillRect(13 + x, 41 + y, 1, 1);
        g2d.fillRect(8 + x, 41 + y, 1, 2);
        g2d.fillRect(7 + x, 44 + y, 1, 1);
        g2d.fillRect(5 + x, 47 + y, 1, 1);
        g2d.fillRect(6 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(17 + x, 28 + y, 1, 3);
        g2d.fillRect(14 + x, 28 + y, 1, 2);
        g2d.fillRect(12 + x, 28 + y, 1, 4);
        g2d.fillRect(10 + x, 28 + y, 1, 1);
        g2d.fillRect(9 + x, 39 + y, 1, 1);
        g2d.fillRect(10 + x, 40 + y, 1, 1);
        g2d.fillRect(11 + x, 41 + y, 2, 1);
        g2d.fillRect(7 + x, 41 + y, 1, 3);
        g2d.fillRect(6 + x, 42 + y, 1, 8);
        g2d.fillRect(5 + x, 44 + y, 1, 3);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-8 + x, 22 + y, 1, 1);
        g2d.fillRect(-2 + x, 24 + y, 1, 1);
        g2d.fillRect(-9 + x, 24 + y, 1, 2);
        g2d.fillRect(-3 + x, 25 + y, 1, 1);
        g2d.fillRect(-4 + x, 26 + y, 1, 3);
        g2d.fillRect(-5 + x, 28 + y, 1, 2);
        g2d.fillRect(-6 + x, 32 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-2 + x, 22 + y, 1, 1);
        g2d.fillRect(-5 + x, 22 + y, 1, 1);
        g2d.fillRect(-7 + x, 22 + y, 1, 1);
        g2d.fillRect(-6 + x, 23 + y, 1, 1);
        g2d.fillRect(-8 + x, 23 + y, 1, 2);
        g2d.fillRect(-9 + x, 26 + y, 1, 5);
        g2d.fillRect(-5 + x, 35 + y, 1, 4);
        g2d.fillRect(-6 + x, 38 + y, 1, 5);
        g2d.fillRect(-8 + x, 38 + y, 1, 1);
        g2d.fillRect(-7 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-1 + x, 22 + y, 2, 1);
        g2d.fillRect(-4 + x, 22 + y, 1, 1);
        g2d.fillRect(-6 + x, 22 + y, 1, 1);
        g2d.fillRect(-1 + x, 23 + y, 1, 1);
        g2d.fillRect(-3 + x, 23 + y, 1, 1);
        g2d.fillRect(-5 + x, 23 + y, 1, 1);
        g2d.fillRect(-4 + x, 24 + y, 1, 1);
        g2d.fillRect(-6 + x, 24 + y, 1, 1);
        g2d.fillRect(-7 + x, 25 + y, 1, 2);
        g2d.fillRect(-5 + x, 27 + y, 1, 1);
        g2d.fillRect(-6 + x, 30 + y, 1, 2);
        g2d.fillRect(-9 + x, 31 + y, 1, 4);
        g2d.fillRect(-8 + x, 36 + y, 1, 2);
        g2d.fillRect(-7 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-2 + x, 23 + y, 1, 1);
        g2d.fillRect(-7 + x, 23 + y, 1, 2);
        g2d.fillRect(-3 + x, 24 + y, 1, 1);
        g2d.fillRect(-4 + x, 25 + y, 1, 1);
        g2d.fillRect(-6 + x, 25 + y, 1, 1);
        g2d.fillRect(-8 + x, 25 + y, 1, 1);
        g2d.fillRect(-5 + x, 26 + y, 1, 1);
        g2d.fillRect(-7 + x, 27 + y, 1, 1);
        g2d.fillRect(-6 + x, 29 + y, 1, 1);
        g2d.fillRect(-8 + x, 34 + y, 1, 2);
        g2d.fillRect(-7 + x, 37 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(-3 + x, 22 + y, 1, 1);
        g2d.fillRect(-4 + x, 23 + y, 1, 1);
        g2d.fillRect(-5 + x, 24 + y, 1, 2);
        g2d.fillRect(-6 + x, 26 + y, 1, 3);
        g2d.fillRect(-8 + x, 26 + y, 1, 8);
        g2d.fillRect(-7 + x, 28 + y, 1, 9);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {
        x += 102;


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(9 + x, 11 + y, 1, 3);
        g2d.fillRect(8 + x, 11 + y, 1, 3);
        g2d.fillRect(7 + x, 11 + y, 1, 5);
        g2d.fillRect(6 + x, 11 + y, 1, 6);
        g2d.fillRect(5 + x, 11 + y, 1, 10);
        g2d.fillRect(3 + x, 11 + y, 2, 1);
        g2d.fillRect(11 + x, 12 + y, 2, 1);
        g2d.fillRect(13 + x, 13 + y, 1, 1);
        g2d.fillRect(10 + x, 13 + y, 1, 2);
        g2d.fillRect(4 + x, 13 + y, 1, 8);
        g2d.fillRect(3 + x, 13 + y, 1, 2);
        g2d.fillRect(2 + x, 13 + y, 1, 2);
        g2d.fillRect(1 + x, 13 + y, 1, 1);
        g2d.fillRect(14 + x, 14 + y, 1, 1);
        g2d.fillRect(11 + x, 14 + y, 1, 1);
        g2d.fillRect(12 + x, 15 + y, 1, 1);
        g2d.fillRect(8 + x, 15 + y, 1, 2);
        g2d.fillRect(9 + x, 16 + y, 1, 2);
        g2d.fillRect(3 + x, 16 + y, 1, 3);
        g2d.fillRect(2 + x, 16 + y, 1, 3);
        g2d.fillRect(-1 + x, 16 + y, 3, 1);
        g2d.fillRect(-3 + x, 17 + y, 2, 1);
        g2d.fillRect(10 + x, 18 + y, 1, 1);
        g2d.fillRect(6 + x, 18 + y, 1, 2);
        g2d.fillRect(-1 + x, 18 + y, 3, 1);
        g2d.fillRect(-5 + x, 18 + y, 2, 1);
        g2d.fillRect(7 + x, 19 + y, 1, 1);
        g2d.fillRect(-2 + x, 19 + y, 2, 1);
        g2d.fillRect(-6 + x, 19 + y, 2, 1);
        g2d.fillRect(8 + x, 20 + y, 1, 1);
        g2d.fillRect(1 + x, 20 + y, 3, 1);
        g2d.fillRect(-3 + x, 20 + y, 1, 1);
        g2d.fillRect(-7 + x, 20 + y, 2, 1);
        g2d.fillRect(6 + x, 21 + y, 1, 2);
        g2d.fillRect(-8 + x, 21 + y, 2, 1);
        g2d.fillRect(7 + x, 22 + y, 1, 4);
        g2d.fillRect(-8 + x, 22 + y, 1, 1);
        g2d.fillRect(8 + x, 27 + y, 1, 1);
        g2d.fillRect(-5 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(0 + x, 11 + y, 3, 1);
        g2d.fillRect(10 + x, 12 + y, 1, 1);
        g2d.fillRect(3 + x, 12 + y, 2, 1);
        g2d.fillRect(11 + x, 13 + y, 2, 1);
        g2d.fillRect(0 + x, 13 + y, 1, 3);
        g2d.fillRect(-2 + x, 13 + y, 2, 1);
        g2d.fillRect(13 + x, 14 + y, 1, 1);
        g2d.fillRect(8 + x, 14 + y, 2, 1);
        g2d.fillRect(1 + x, 14 + y, 1, 2);
        g2d.fillRect(-4 + x, 14 + y, 3, 1);
        g2d.fillRect(14 + x, 15 + y, 1, 1);
        g2d.fillRect(11 + x, 15 + y, 1, 1);
        g2d.fillRect(2 + x, 15 + y, 2, 1);
        g2d.fillRect(-1 + x, 15 + y, 1, 1);
        g2d.fillRect(-5 + x, 15 + y, 1, 1);
        g2d.fillRect(15 + x, 16 + y, 1, 1);
        g2d.fillRect(13 + x, 16 + y, 1, 2);
        g2d.fillRect(12 + x, 16 + y, 1, 1);
        g2d.fillRect(7 + x, 16 + y, 1, 3);
        g2d.fillRect(-3 + x, 16 + y, 2, 1);
        g2d.fillRect(10 + x, 17 + y, 1, 1);
        g2d.fillRect(8 + x, 17 + y, 1, 1);
        g2d.fillRect(6 + x, 17 + y, 1, 1);
        g2d.fillRect(-1 + x, 17 + y, 3, 1);
        g2d.fillRect(-4 + x, 17 + y, 1, 1);
        g2d.fillRect(14 + x, 18 + y, 1, 2);
        g2d.fillRect(9 + x, 18 + y, 1, 1);
        g2d.fillRect(-2 + x, 18 + y, 1, 1);
        g2d.fillRect(11 + x, 19 + y, 1, 2);
        g2d.fillRect(10 + x, 19 + y, 1, 1);
        g2d.fillRect(8 + x, 19 + y, 1, 1);
        g2d.fillRect(2 + x, 19 + y, 2, 1);
        g2d.fillRect(-3 + x, 19 + y, 1, 1);
        g2d.fillRect(15 + x, 20 + y, 1, 3);
        g2d.fillRect(6 + x, 20 + y, 2, 1);
        g2d.fillRect(-4 + x, 20 + y, 1, 3);
        g2d.fillRect(12 + x, 21 + y, 1, 2);
        g2d.fillRect(9 + x, 21 + y, 1, 2);
        g2d.fillRect(8 + x, 21 + y, 1, 1);
        g2d.fillRect(-1 + x, 21 + y, 3, 1);
        g2d.fillRect(-5 + x, 21 + y, 1, 2);
        g2d.fillRect(16 + x, 22 + y, 1, 5);
        g2d.fillRect(-1 + x, 22 + y, 2, 1);
        g2d.fillRect(-6 + x, 22 + y, 1, 1);
        g2d.fillRect(10 + x, 23 + y, 1, 2);
        g2d.fillRect(13 + x, 25 + y, 1, 1);
        g2d.fillRect(8 + x, 25 + y, 1, 2);
        g2d.fillRect(9 + x, 27 + y, 1, 2);
        g2d.fillRect(-5 + x, 34 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(1 + x, 12 + y, 2, 1);
        g2d.fillRect(-4 + x, 13 + y, 2, 1);
        g2d.fillRect(12 + x, 14 + y, 1, 1);
        g2d.fillRect(-1 + x, 14 + y, 1, 1);
        g2d.fillRect(-5 + x, 14 + y, 1, 1);
        g2d.fillRect(13 + x, 15 + y, 1, 1);
        g2d.fillRect(9 + x, 15 + y, 2, 1);
        g2d.fillRect(-2 + x, 15 + y, 1, 1);
        g2d.fillRect(11 + x, 16 + y, 1, 1);
        g2d.fillRect(-6 + x, 16 + y, 1, 1);
        g2d.fillRect(14 + x, 17 + y, 2, 1);
        g2d.fillRect(13 + x, 18 + y, 1, 1);
        g2d.fillRect(8 + x, 18 + y, 1, 1);
        g2d.fillRect(-3 + x, 18 + y, 1, 1);
        g2d.fillRect(15 + x, 19 + y, 2, 1);
        g2d.fillRect(0 + x, 19 + y, 2, 1);
        g2d.fillRect(-4 + x, 19 + y, 1, 1);
        g2d.fillRect(14 + x, 20 + y, 1, 2);
        g2d.fillRect(12 + x, 20 + y, 1, 1);
        g2d.fillRect(10 + x, 20 + y, 1, 1);
        g2d.fillRect(0 + x, 20 + y, 1, 1);
        g2d.fillRect(-2 + x, 20 + y, 1, 1);
        g2d.fillRect(11 + x, 21 + y, 1, 1);
        g2d.fillRect(7 + x, 21 + y, 1, 1);
        g2d.fillRect(-3 + x, 21 + y, 1, 1);
        g2d.fillRect(8 + x, 22 + y, 1, 1);
        g2d.fillRect(12 + x, 23 + y, 1, 1);
        g2d.fillRect(9 + x, 23 + y, 1, 1);
        g2d.fillRect(13 + x, 24 + y, 1, 1);
        g2d.fillRect(10 + x, 25 + y, 1, 1);
        g2d.fillRect(13 + x, 26 + y, 1, 1);
        g2d.fillRect(11 + x, 27 + y, 1, 2);
        g2d.fillRect(-4 + x, 34 + y, 1, 2);
        g2d.fillRect(-3 + x, 35 + y, 1, 2);
        g2d.fillRect(-2 + x, 36 + y, 1, 1);
        g2d.fillRect(-1 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-2 + x, 12 + y, 3, 1);
        g2d.fillRect(-4 + x, 15 + y, 2, 1);
        g2d.fillRect(14 + x, 16 + y, 1, 1);
        g2d.fillRect(10 + x, 16 + y, 1, 1);
        g2d.fillRect(-5 + x, 16 + y, 2, 1);
        g2d.fillRect(12 + x, 17 + y, 1, 1);
        g2d.fillRect(-6 + x, 17 + y, 1, 1);
        g2d.fillRect(15 + x, 18 + y, 1, 1);
        g2d.fillRect(11 + x, 18 + y, 1, 1);
        g2d.fillRect(-7 + x, 18 + y, 1, 1);
        g2d.fillRect(13 + x, 19 + y, 1, 1);
        g2d.fillRect(9 + x, 19 + y, 1, 1);
        g2d.fillRect(16 + x, 20 + y, 1, 2);
        g2d.fillRect(-1 + x, 20 + y, 1, 1);
        g2d.fillRect(-5 + x, 20 + y, 1, 1);
        g2d.fillRect(17 + x, 21 + y, 1, 3);
        g2d.fillRect(-2 + x, 21 + y, 1, 1);
        g2d.fillRect(-6 + x, 21 + y, 1, 1);
        g2d.fillRect(10 + x, 22 + y, 1, 1);
        g2d.fillRect(-3 + x, 22 + y, 1, 1);
        g2d.fillRect(-7 + x, 22 + y, 1, 1);
        g2d.fillRect(13 + x, 23 + y, 1, 1);
        g2d.fillRect(8 + x, 23 + y, 1, 2);
        g2d.fillRect(9 + x, 24 + y, 1, 1);
        g2d.fillRect(11 + x, 26 + y, 1, 1);
        g2d.fillRect(15 + x, 27 + y, 1, 2);
        g2d.fillRect(13 + x, 27 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(11 + x, 17 + y, 1, 1);
        g2d.fillRect(-5 + x, 17 + y, 1, 1);
        g2d.fillRect(12 + x, 18 + y, 1, 2);
        g2d.fillRect(-6 + x, 18 + y, 1, 1);
        g2d.fillRect(-7 + x, 19 + y, 1, 1);
        g2d.fillRect(13 + x, 20 + y, 1, 3);
        g2d.fillRect(9 + x, 20 + y, 1, 1);
        g2d.fillRect(10 + x, 21 + y, 1, 1);
        g2d.fillRect(14 + x, 22 + y, 1, 7);
        g2d.fillRect(11 + x, 22 + y, 1, 4);
        g2d.fillRect(-2 + x, 22 + y, 1, 1);
        g2d.fillRect(15 + x, 23 + y, 1, 4);
        g2d.fillRect(17 + x, 24 + y, 1, 5);
        g2d.fillRect(12 + x, 24 + y, 1, 5);
        g2d.fillRect(9 + x, 25 + y, 1, 2);
        g2d.fillRect(10 + x, 26 + y, 1, 3);
    }
}
