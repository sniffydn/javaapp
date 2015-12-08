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
public class MediumPony8 extends SuperH
{
    public MediumPony8()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumPony8(int step, int dir)
    {
        super(step, dir);
    }

    public MediumPony8(int step, int dir, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 36 + y, 1, 2);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(99 + x, 40 + y, 1, 3);
        g2d.fillRect(103 + x, 40 + y, 1, 3);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 2);
        g2d.fillRect(105 + x, 43 + y, 1, 2);
        g2d.fillRect(100 + x, 44 + y, 1, 2);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 38 + y, 1, 2);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 2, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 3, 1);
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(104 + x, 47 + y, 3, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 37 + y, 1, 2);
        g2d.fillRect(100 + x, 38 + y, 1, 5);
        g2d.fillRect(101 + x, 41 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 1);
        g2d.fillRect(105 + x, 42 + y, 1, 1);
        g2d.fillRect(99 + x, 43 + y, 1, 2);
        g2d.fillRect(106 + x, 43 + y, 1, 3);
        g2d.fillRect(98 + x, 44 + y, 1, 2);
        g2d.fillRect(107 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 3, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 43 + y, 2, 1);
        g2d.fillRect(103 + x, 44 + y, 2, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 18 + y, 2, 1);
        g2d.fillRect(115 + x, 18 + y, 2, 1);
        g2d.fillRect(109 + x, 19 + y, 2, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 18 + y, 1, 4);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(115 + x, 21 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 2);
        g2d.fillRect(113 + x, 24 + y, 1, 2);
        g2d.fillRect(111 + x, 25 + y, 1, 2);
        g2d.fillRect(112 + x, 25 + y, 1, 2);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 2);
        g2d.fillRect(109 + x, 26 + y, 1, 2);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 3);
        g2d.fillRect(107 + x, 27 + y, 1, 2);
        g2d.fillRect(108 + x, 27 + y, 1, 1);
        g2d.fillRect(121 + x, 27 + y, 1, 1);
        g2d.fillRect(105 + x, 28 + y, 1, 2);
        g2d.fillRect(106 + x, 28 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 2);
        g2d.fillRect(102 + x, 29 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(109 + x, 20 + y, 2, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 22 + y, 1, 3);
        g2d.fillRect(108 + x, 23 + y, 2, 1);
        g2d.fillRect(112 + x, 23 + y, 1, 2);
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 2, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 2);
        g2d.fillRect(105 + x, 25 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 2, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(108 + x, 26 + y, 1, 1);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(106 + x, 27 + y, 1, 1);
        g2d.fillRect(102 + x, 28 + y, 3, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 29 + y, 1, 2);
        g2d.fillRect(101 + x, 30 + y, 1, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 19 + y, 1, 2);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 2);
        g2d.fillRect(120 + x, 23 + y, 1, 3);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(122 + x, 24 + y, 1, 6);
        g2d.fillRect(103 + x, 27 + y, 3, 1);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(119 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 2, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(120 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 25 + y, 1, 2);
        g2d.fillRect(108 + x, 25 + y, 1, 1);
        g2d.fillRect(106 + x, 26 + y, 1, 1);
    }





    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 11 + y, 1, 3);
        g2d.fillRect(105 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 1, 2);
        g2d.fillRect(107 + x, 11 + y, 1, 5);
        g2d.fillRect(108 + x, 11 + y, 5, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 3);
        g2d.fillRect(103 + x, 12 + y, 1, 2);
        g2d.fillRect(109 + x, 12 + y, 7, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 1, 5);
        g2d.fillRect(110 + x, 13 + y, 8, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 14 + y, 4, 1);
        g2d.fillRect(116 + x, 14 + y, 3, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 1, 2);
        g2d.fillRect(109 + x, 15 + y, 1, 4);
        g2d.fillRect(112 + x, 15 + y, 3, 1);
        g2d.fillRect(118 + x, 15 + y, 2, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 4);
        g2d.fillRect(113 + x, 16 + y, 3, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 17 + y, 3, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 2, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 13 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 5);
        g2d.fillRect(104 + x, 14 + y, 1, 5);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 15 + y, 1, 5);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(117 + x, 15 + y, 1, 4);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 3);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 5);
        g2d.fillRect(98 + x, 18 + y, 1, 4);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(118 + x, 18 + y, 1, 2);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 3);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 4);
        g2d.fillRect(105 + x, 20 + y, 1, 4);
        g2d.fillRect(122 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 4);
        g2d.fillRect(100 + x, 21 + y, 1, 3);
        g2d.fillRect(103 + x, 21 + y, 2, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 2);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 4);
        g2d.fillRect(103 + x, 24 + y, 1, 3);
        g2d.fillRect(97 + x, 29 + y, 1, 1);
        g2d.fillRect(103 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 17 + y, 1, 3);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 3);
        g2d.fillRect(119 + x, 18 + y, 2, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 4);
        g2d.fillRect(102 + x, 23 + y, 1, 4);
        g2d.fillRect(101 + x, 24 + y, 1, 3);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 2);
        g2d.fillRect(101 + x, 30 + y, 1, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 1);
        g2d.fillRect(103 + x, 31 + y, 1, 5);
        g2d.fillRect(102 + x, 34 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 22 + y, 1, 5);
        g2d.fillRect(97 + x, 24 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 4);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 6);
        g2d.fillRect(102 + x, 29 + y, 1, 5);
        g2d.fillRect(103 + x, 29 + y, 1, 2);
        g2d.fillRect(101 + x, 31 + y, 1, 1);
        g2d.fillRect(100 + x, 32 + y, 1, 2);
        g2d.fillRect(101 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 25 + y, 1, 2);
        g2d.fillRect(98 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 2, 1);
        g2d.fillRect(101 + x, 32 + y, 1, 3);
        g2d.fillRect(102 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 27 + y, 1, 1);
        g2d.fillRect(98 + x, 28 + y, 1, 3);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 36 + y, 1, 2);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 2);
        g2d.fillRect(116 + x, 40 + y, 1, 3);
        g2d.fillRect(112 + x, 40 + y, 1, 3);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 2);
        g2d.fillRect(110 + x, 43 + y, 1, 2);
        g2d.fillRect(115 + x, 44 + y, 1, 2);
        g2d.fillRect(114 + x, 45 + y, 1, 2);
        g2d.fillRect(113 + x, 46 + y, 1, 2);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 38 + y, 1, 2);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 2, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 3, 1);
        g2d.fillRect(108 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(109 + x, 47 + y, 3, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 37 + y, 1, 2);
        g2d.fillRect(115 + x, 38 + y, 1, 5);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(110 + x, 42 + y, 1, 1);
        g2d.fillRect(116 + x, 43 + y, 1, 2);
        g2d.fillRect(109 + x, 43 + y, 1, 3);
        g2d.fillRect(117 + x, 44 + y, 1, 2);
        g2d.fillRect(108 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(110 + x, 45 + y, 3, 1);
        g2d.fillRect(109 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 43 + y, 2, 1);
        g2d.fillRect(111 + x, 44 + y, 2, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(99 + x, 18 + y, 2, 1);
        g2d.fillRect(105 + x, 19 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 18 + y, 1, 4);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(100 + x, 21 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 2);
        g2d.fillRect(102 + x, 24 + y, 1, 2);
        g2d.fillRect(104 + x, 25 + y, 1, 2);
        g2d.fillRect(103 + x, 25 + y, 1, 2);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 1, 2);
        g2d.fillRect(106 + x, 26 + y, 1, 2);
        g2d.fillRect(105 + x, 26 + y, 1, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 3);
        g2d.fillRect(108 + x, 27 + y, 1, 2);
        g2d.fillRect(107 + x, 27 + y, 1, 1);
        g2d.fillRect(94 + x, 27 + y, 1, 1);
        g2d.fillRect(110 + x, 28 + y, 1, 2);
        g2d.fillRect(109 + x, 28 + y, 1, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 2);
        g2d.fillRect(111 + x, 29 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 20 + y, 2, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 22 + y, 1, 3);
        g2d.fillRect(106 + x, 23 + y, 2, 1);
        g2d.fillRect(103 + x, 23 + y, 1, 2);
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 2, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 2);
        g2d.fillRect(110 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 2, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(107 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(109 + x, 27 + y, 1, 1);
        g2d.fillRect(111 + x, 28 + y, 3, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 29 + y, 1, 2);
        g2d.fillRect(114 + x, 30 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 19 + y, 1, 2);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 2);
        g2d.fillRect(95 + x, 23 + y, 1, 3);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 1);
        g2d.fillRect(93 + x, 24 + y, 1, 6);
        g2d.fillRect(110 + x, 27 + y, 3, 1);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 31 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(106 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 2, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 25 + y, 1, 2);
        g2d.fillRect(107 + x, 25 + y, 1, 1);
        g2d.fillRect(109 + x, 26 + y, 1, 1);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 11 + y, 1, 3);
        g2d.fillRect(110 + x, 11 + y, 1, 2);
        g2d.fillRect(109 + x, 11 + y, 1, 2);
        g2d.fillRect(108 + x, 11 + y, 1, 5);
        g2d.fillRect(103 + x, 11 + y, 5, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 3);
        g2d.fillRect(112 + x, 12 + y, 1, 2);
        g2d.fillRect(100 + x, 12 + y, 7, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(107 + x, 13 + y, 1, 5);
        g2d.fillRect(98 + x, 13 + y, 8, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 4, 1);
        g2d.fillRect(97 + x, 14 + y, 3, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 1, 2);
        g2d.fillRect(106 + x, 15 + y, 1, 4);
        g2d.fillRect(101 + x, 15 + y, 3, 1);
        g2d.fillRect(96 + x, 15 + y, 2, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 4);
        g2d.fillRect(100 + x, 16 + y, 3, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 3, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 2, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(96 + x, 19 + y, 1, 2);
        g2d.fillRect(113 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 5);
        g2d.fillRect(111 + x, 14 + y, 1, 5);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 15 + y, 1, 2);
        g2d.fillRect(113 + x, 15 + y, 1, 5);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(98 + x, 15 + y, 1, 4);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 3);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 5);
        g2d.fillRect(117 + x, 18 + y, 1, 4);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(97 + x, 18 + y, 1, 2);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 3);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 4);
        g2d.fillRect(110 + x, 20 + y, 1, 4);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 4);
        g2d.fillRect(115 + x, 21 + y, 1, 3);
        g2d.fillRect(111 + x, 21 + y, 2, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 2);
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 4);
        g2d.fillRect(112 + x, 24 + y, 1, 3);
        g2d.fillRect(118 + x, 29 + y, 1, 1);
        g2d.fillRect(112 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 17 + y, 1, 3);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 3);
        g2d.fillRect(95 + x, 18 + y, 2, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 4);
        g2d.fillRect(113 + x, 23 + y, 1, 4);
        g2d.fillRect(114 + x, 24 + y, 1, 3);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 2);
        g2d.fillRect(114 + x, 30 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 1);
        g2d.fillRect(112 + x, 31 + y, 1, 5);
        g2d.fillRect(113 + x, 34 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 21 + y, 1, 2);
        g2d.fillRect(117 + x, 22 + y, 1, 5);
        g2d.fillRect(118 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 4);
        g2d.fillRect(110 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 6);
        g2d.fillRect(113 + x, 29 + y, 1, 5);
        g2d.fillRect(112 + x, 29 + y, 1, 2);
        g2d.fillRect(114 + x, 31 + y, 1, 1);
        g2d.fillRect(115 + x, 32 + y, 1, 2);
        g2d.fillRect(114 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 25 + y, 1, 2);
        g2d.fillRect(117 + x, 27 + y, 1, 1);
        g2d.fillRect(118 + x, 28 + y, 2, 1);
        g2d.fillRect(114 + x, 32 + y, 1, 3);
        g2d.fillRect(113 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(117 + x, 28 + y, 1, 3);
    }
}
