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

public class MediumPony9 extends SuperH
{
    public MediumPony9()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumPony9(int step, int dir)
    {
        super(step, dir);
    }

    public MediumPony9(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d)
    {
        if(y == 1)
            y = 0;
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(99 + x, 11 + y, 1, 2);
        g2d.fillRect(100 + x, 11 + y, 2, 1);
        g2d.fillRect(97 + x, 12 + y, 1, 3);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 2);
        g2d.fillRect(93 + x, 14 + y, 3, 1);
        g2d.fillRect(92 + x, 15 + y, 1, 3);
        g2d.fillRect(95 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(94 + x, 16 + y, 1, 3);
        g2d.fillRect(97 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(93 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(91 + x, 18 + y, 1, 3);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 18 + y, 1, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 3);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(92 + x, 20 + y, 1, 1);
        g2d.fillRect(90 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(94 + x, 22 + y, 2, 1);
        g2d.fillRect(99 + x, 22 + y, 1, 1);
        g2d.fillRect(91 + x, 23 + y, 3, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(97 + x, 23 + y, 2, 1);
        g2d.fillRect(100 + x, 23 + y, 1, 3);
        g2d.fillRect(90 + x, 24 + y, 1, 3);
        g2d.fillRect(93 + x, 24 + y, 1, 2);
        g2d.fillRect(99 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 1, 3);
        g2d.fillRect(97 + x, 25 + y, 2, 1);
        g2d.fillRect(94 + x, 26 + y, 2, 1);
        g2d.fillRect(91 + x, 27 + y, 3, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);
        g2d.fillRect(90 + x, 28 + y, 1, 2);
        g2d.fillRect(93 + x, 28 + y, 1, 2);
        g2d.fillRect(95 + x, 28 + y, 1, 3);
        g2d.fillRect(97 + x, 28 + y, 2, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 3);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(91 + x, 30 + y, 2, 1);
        g2d.fillRect(90 + x, 31 + y, 1, 3);
        g2d.fillRect(92 + x, 31 + y, 1, 1);
        g2d.fillRect(96 + x, 31 + y, 1, 1);
        g2d.fillRect(99 + x, 31 + y, 1, 1);
        g2d.fillRect(102 + x, 31 + y, 1, 3);
        g2d.fillRect(93 + x, 32 + y, 1, 1);
        g2d.fillRect(97 + x, 32 + y, 2, 1);
        g2d.fillRect(100 + x, 32 + y, 1, 2);
        g2d.fillRect(103 + x, 32 + y, 1, 1);
        g2d.fillRect(92 + x, 33 + y, 1, 2);
        g2d.fillRect(94 + x, 33 + y, 3, 1);
        g2d.fillRect(91 + x, 34 + y, 1, 3);
        g2d.fillRect(96 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 34 + y, 1, 1);
        g2d.fillRect(101 + x, 34 + y, 1, 1);
        g2d.fillRect(93 + x, 35 + y, 2, 1);
        g2d.fillRect(97 + x, 35 + y, 2, 1);
        g2d.fillRect(100 + x, 35 + y, 1, 2);
        g2d.fillRect(102 + x, 35 + y, 1, 2);
        g2d.fillRect(92 + x, 36 + y, 1, 3);
        g2d.fillRect(95 + x, 36 + y, 2, 1);
        g2d.fillRect(96 + x, 37 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 2, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 6);
        g2d.fillRect(93 + x, 39 + y, 4, 1);
        g2d.fillRect(92 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(93 + x, 41 + y, 2, 1);
        g2d.fillRect(97 + x, 41 + y, 2, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 2);
        g2d.fillRect(92 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(97 + x, 43 + y, 3, 1);
        g2d.fillRect(93 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 3);
        g2d.fillRect(96 + x, 44 + y, 1, 2);
        g2d.fillRect(100 + x, 44 + y, 2, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 2);
        g2d.fillRect(98 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 2);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 2);
        g2d.fillRect(92 + x, 22 + y, 2, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 2, 1);
        g2d.fillRect(92 + x, 25 + y, 1, 2);
        g2d.fillRect(94 + x, 25 + y, 2, 1);
        g2d.fillRect(93 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);
        g2d.fillRect(97 + x, 27 + y, 2, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 1);
        g2d.fillRect(94 + x, 28 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 1);
        g2d.fillRect(99 + x, 30 + y, 1, 1);
        g2d.fillRect(101 + x, 30 + y, 1, 4);
        g2d.fillRect(102 + x, 30 + y, 2, 1);
        g2d.fillRect(94 + x, 31 + y, 1, 2);
        g2d.fillRect(95 + x, 31 + y, 1, 2);
        g2d.fillRect(97 + x, 31 + y, 2, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 1);
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(92 + x, 32 + y, 1, 1);
        g2d.fillRect(96 + x, 32 + y, 1, 1);
        g2d.fillRect(99 + x, 33 + y, 1, 1);
        g2d.fillRect(97 + x, 34 + y, 2, 1);
        g2d.fillRect(100 + x, 34 + y, 1, 1);
        g2d.fillRect(92 + x, 35 + y, 1, 1);
        g2d.fillRect(95 + x, 35 + y, 2, 1);
        g2d.fillRect(101 + x, 35 + y, 1, 2);
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(94 + x, 37 + y, 2, 1);
        g2d.fillRect(97 + x, 37 + y, 2, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(96 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 2);
        g2d.fillRect(99 + x, 39 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 2, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(95 + x, 41 + y, 2, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 3);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(93 + x, 15 + y, 1, 2);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 1);
        g2d.fillRect(92 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(91 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(91 + x, 26 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(94 + x, 27 + y, 1, 1);
        g2d.fillRect(92 + x, 28 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 2);
        g2d.fillRect(91 + x, 29 + y, 1, 1);
        g2d.fillRect(97 + x, 30 + y, 2, 1);
        g2d.fillRect(93 + x, 31 + y, 1, 1);
        g2d.fillRect(99 + x, 32 + y, 1, 1);
        g2d.fillRect(91 + x, 33 + y, 1, 1);
        g2d.fillRect(93 + x, 33 + y, 1, 1);
        g2d.fillRect(95 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(93 + x, 37 + y, 1, 1);
        g2d.fillRect(95 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(95 + x, 40 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(93 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 2, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 1);
        g2d.fillRect(96 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 1);
        g2d.fillRect(92 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 2, 1);
        g2d.fillRect(97 + x, 20 + y, 2, 1);
        g2d.fillRect(92 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 2);
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(91 + x, 24 + y, 1, 2);
        g2d.fillRect(92 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(97 + x, 26 + y, 2, 1);
        g2d.fillRect(95 + x, 27 + y, 1, 1);
        g2d.fillRect(91 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 2);
        g2d.fillRect(97 + x, 29 + y, 2, 1);
        g2d.fillRect(93 + x, 30 + y, 2, 1);
        g2d.fillRect(91 + x, 31 + y, 1, 2);
        g2d.fillRect(97 + x, 33 + y, 2, 1);
        g2d.fillRect(93 + x, 34 + y, 2, 1);
        g2d.fillRect(93 + x, 36 + y, 2, 1);
        g2d.fillRect(97 + x, 36 + y, 2, 1);
        g2d.fillRect(93 + x, 38 + y, 2, 1);
        g2d.fillRect(97 + x, 39 + y, 2, 1);
        g2d.fillRect(93 + x, 40 + y, 2, 1);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
        g2d.fillRect(93 + x, 42 + y, 2, 1);
        g2d.fillRect(97 + x, 42 + y, 2, 1);
        g2d.fillRect(97 + x, 44 + y, 2, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(119 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 2);
        g2d.fillRect(109 + x, 24 + y, 4, 1);
        g2d.fillRect(114 + x, 24 + y, 2, 1);
        g2d.fillRect(106 + x, 25 + y, 2, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 2);
        g2d.fillRect(118 + x, 25 + y, 1, 2);
        g2d.fillRect(119 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 21 + y, 1, 2);
        g2d.fillRect(104 + x, 22 + y, 1, 4);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(109 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 22 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 2);
        g2d.fillRect(121 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 23 + y, 1, 1);
        g2d.fillRect(106 + x, 23 + y, 1, 2);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(117 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 21 + y, 1, 3);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 2);
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(108 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 21 + y, 1, 2);
        g2d.fillRect(114 + x, 21 + y, 1, 2);
        g2d.fillRect(117 + x, 21 + y, 1, 2);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 2);
        g2d.fillRect(105 + x, 23 + y, 1, 2);
    }





    public void paintM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 11 + y, 9, 1);
        g2d.fillRect(102 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 13 + y, 2, 1);
        g2d.fillRect(110 + x, 14 + y, 2, 1);
        g2d.fillRect(111 + x, 15 + y, 2, 1);
        g2d.fillRect(112 + x, 16 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 12 + y, 4, 1);
        g2d.fillRect(109 + x, 12 + y, 4, 1);
        g2d.fillRect(114 + x, 12 + y, 2, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 2, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 2, 1);
        g2d.fillRect(113 + x, 15 + y, 2, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 3);
        g2d.fillRect(119 + x, 16 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 2, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 24 + y, 1, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 5);
        g2d.fillRect(102 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 3);
        g2d.fillRect(103 + x, 27 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 27 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 13 + y, 1, 3);
        g2d.fillRect(107 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 3);
        g2d.fillRect(108 + x, 14 + y, 2, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(110 + x, 15 + y, 1, 3);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 1, 2);
        g2d.fillRect(118 + x, 16 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(111 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 4);
        g2d.fillRect(121 + x, 20 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 1, 3);
        g2d.fillRect(101 + x, 23 + y, 1, 3);
        g2d.fillRect(102 + x, 23 + y, 1, 3);
        g2d.fillRect(103 + x, 25 + y, 1, 2);
        g2d.fillRect(103 + x, 29 + y, 1, 2);
        g2d.fillRect(102 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 2, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 3);
        g2d.fillRect(116 + x, 16 + y, 1, 6);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 5);
        g2d.fillRect(113 + x, 18 + y, 1, 4);
        g2d.fillRect(117 + x, 18 + y, 3, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 19 + y, 4, 1);
        g2d.fillRect(110 + x, 19 + y, 2, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 3);
        g2d.fillRect(107 + x, 20 + y, 1, 3);
        g2d.fillRect(120 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 21 + y, 1, 2);
        g2d.fillRect(121 + x, 21 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 16 + y, 1, 2);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 18 + y, 1, 2);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 4);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 2);
        g2d.fillRect(115 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 3);
        g2d.fillRect(111 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 20 + y, 1, 2);
        g2d.fillRect(119 + x, 20 + y, 1, 2);
        g2d.fillRect(106 + x, 21 + y, 1, 2);
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(115 + x, 22 + y, 1, 1);
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 11 + y, 1, 2);
        g2d.fillRect(114 + x, 11 + y, 2, 1);
        g2d.fillRect(118 + x, 12 + y, 1, 3);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 2);
        g2d.fillRect(120 + x, 14 + y, 3, 1);
        g2d.fillRect(123 + x, 15 + y, 1, 3);
        g2d.fillRect(120 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(121 + x, 16 + y, 1, 3);
        g2d.fillRect(118 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(122 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 2);
        g2d.fillRect(124 + x, 18 + y, 1, 3);
        g2d.fillRect(120 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 1, 1);
        g2d.fillRect(122 + x, 19 + y, 1, 3);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(123 + x, 20 + y, 1, 1);
        g2d.fillRect(125 + x, 21 + y, 1, 2);
        g2d.fillRect(119 + x, 21 + y, 1, 2);
        g2d.fillRect(120 + x, 22 + y, 2, 1);
        g2d.fillRect(116 + x, 22 + y, 1, 1);
        g2d.fillRect(122 + x, 23 + y, 3, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(117 + x, 23 + y, 2, 1);
        g2d.fillRect(115 + x, 23 + y, 1, 3);
        g2d.fillRect(125 + x, 24 + y, 1, 3);
        g2d.fillRect(122 + x, 24 + y, 1, 2);
        g2d.fillRect(116 + x, 24 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 3);
        g2d.fillRect(117 + x, 25 + y, 2, 1);
        g2d.fillRect(120 + x, 26 + y, 2, 1);
        g2d.fillRect(122 + x, 27 + y, 3, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(125 + x, 28 + y, 1, 2);
        g2d.fillRect(122 + x, 28 + y, 1, 2);
        g2d.fillRect(120 + x, 28 + y, 1, 3);
        g2d.fillRect(117 + x, 28 + y, 2, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 3);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(123 + x, 30 + y, 2, 1);
        g2d.fillRect(125 + x, 31 + y, 1, 3);
        g2d.fillRect(123 + x, 31 + y, 1, 1);
        g2d.fillRect(119 + x, 31 + y, 1, 1);
        g2d.fillRect(116 + x, 31 + y, 1, 1);
        g2d.fillRect(113 + x, 31 + y, 1, 3);
        g2d.fillRect(122 + x, 32 + y, 1, 1);
        g2d.fillRect(117 + x, 32 + y, 2, 1);
        g2d.fillRect(115 + x, 32 + y, 1, 2);
        g2d.fillRect(112 + x, 32 + y, 1, 1);
        g2d.fillRect(123 + x, 33 + y, 1, 2);
        g2d.fillRect(119 + x, 33 + y, 3, 1);
        g2d.fillRect(124 + x, 34 + y, 1, 3);
        g2d.fillRect(119 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 34 + y, 1, 1);
        g2d.fillRect(114 + x, 34 + y, 1, 1);
        g2d.fillRect(121 + x, 35 + y, 2, 1);
        g2d.fillRect(117 + x, 35 + y, 2, 1);
        g2d.fillRect(115 + x, 35 + y, 1, 2);
        g2d.fillRect(113 + x, 35 + y, 1, 2);
        g2d.fillRect(123 + x, 36 + y, 1, 3);
        g2d.fillRect(119 + x, 36 + y, 2, 1);
        g2d.fillRect(119 + x, 37 + y, 1, 1);
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(117 + x, 38 + y, 2, 1);
        g2d.fillRect(115 + x, 38 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 6);
        g2d.fillRect(119 + x, 39 + y, 4, 1);
        g2d.fillRect(123 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 2, 1);
        g2d.fillRect(117 + x, 41 + y, 2, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 1, 2);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(116 + x, 43 + y, 3, 1);
        g2d.fillRect(122 + x, 44 + y, 1, 1);
        g2d.fillRect(120 + x, 44 + y, 1, 3);
        g2d.fillRect(119 + x, 44 + y, 1, 2);
        g2d.fillRect(114 + x, 44 + y, 2, 1);
        g2d.fillRect(121 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 2);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(121 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 2);
        g2d.fillRect(122 + x, 22 + y, 2, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 24 + y, 2, 1);
        g2d.fillRect(123 + x, 25 + y, 1, 2);
        g2d.fillRect(120 + x, 25 + y, 2, 1);
        g2d.fillRect(122 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);
        g2d.fillRect(117 + x, 27 + y, 2, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 1);
        g2d.fillRect(121 + x, 28 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 1);
        g2d.fillRect(116 + x, 30 + y, 1, 1);
        g2d.fillRect(114 + x, 30 + y, 1, 4);
        g2d.fillRect(112 + x, 30 + y, 2, 1);
        g2d.fillRect(121 + x, 31 + y, 1, 2);
        g2d.fillRect(120 + x, 31 + y, 1, 2);
        g2d.fillRect(117 + x, 31 + y, 2, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 1);
        g2d.fillRect(112 + x, 31 + y, 1, 1);
        g2d.fillRect(123 + x, 32 + y, 1, 1);
        g2d.fillRect(119 + x, 32 + y, 1, 1);
        g2d.fillRect(116 + x, 33 + y, 1, 1);
        g2d.fillRect(117 + x, 34 + y, 2, 1);
        g2d.fillRect(115 + x, 34 + y, 1, 1);
        g2d.fillRect(123 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 35 + y, 2, 1);
        g2d.fillRect(114 + x, 35 + y, 1, 2);
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(120 + x, 37 + y, 2, 1);
        g2d.fillRect(117 + x, 37 + y, 2, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(119 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 2);
        g2d.fillRect(116 + x, 39 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 2, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 2, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 3);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(121 + x, 43 + y, 1, 2);
        g2d.fillRect(120 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(122 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 1);
        g2d.fillRect(123 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 1);
        g2d.fillRect(124 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(124 + x, 26 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(121 + x, 27 + y, 1, 1);
        g2d.fillRect(123 + x, 28 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 2);
        g2d.fillRect(124 + x, 29 + y, 1, 1);
        g2d.fillRect(117 + x, 30 + y, 2, 1);
        g2d.fillRect(122 + x, 31 + y, 1, 1);
        g2d.fillRect(116 + x, 32 + y, 1, 1);
        g2d.fillRect(124 + x, 33 + y, 1, 1);
        g2d.fillRect(122 + x, 33 + y, 1, 1);
        g2d.fillRect(120 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(122 + x, 37 + y, 1, 1);
        g2d.fillRect(120 + x, 38 + y, 1, 1);
        g2d.fillRect(116 + x, 38 + y, 1, 1);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(120 + x, 42 + y, 1, 1);
        g2d.fillRect(122 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(116 + x, 13 + y, 2, 1);
        g2d.fillRect(121 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 1);
        g2d.fillRect(123 + x, 18 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 2, 1);
        g2d.fillRect(117 + x, 20 + y, 2, 1);
        g2d.fillRect(123 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 2);
        g2d.fillRect(119 + x, 23 + y, 1, 1);
        g2d.fillRect(124 + x, 24 + y, 1, 2);
        g2d.fillRect(123 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 2, 1);
        g2d.fillRect(120 + x, 27 + y, 1, 1);
        g2d.fillRect(124 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 2);
        g2d.fillRect(117 + x, 29 + y, 2, 1);
        g2d.fillRect(121 + x, 30 + y, 2, 1);
        g2d.fillRect(124 + x, 31 + y, 1, 2);
        g2d.fillRect(117 + x, 33 + y, 2, 1);
        g2d.fillRect(121 + x, 34 + y, 2, 1);
        g2d.fillRect(121 + x, 36 + y, 2, 1);
        g2d.fillRect(117 + x, 36 + y, 2, 1);
        g2d.fillRect(121 + x, 38 + y, 2, 1);
        g2d.fillRect(117 + x, 39 + y, 2, 1);
        g2d.fillRect(121 + x, 40 + y, 2, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 42 + y, 2, 1);
        g2d.fillRect(117 + x, 42 + y, 2, 1);
        g2d.fillRect(117 + x, 44 + y, 2, 1);
    }





    public void paintBackF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(96 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 23 + y, 1, 2);
        g2d.fillRect(103 + x, 24 + y, 4, 1);
        g2d.fillRect(100 + x, 24 + y, 2, 1);
        g2d.fillRect(108 + x, 25 + y, 2, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 2);
        g2d.fillRect(97 + x, 25 + y, 1, 2);
        g2d.fillRect(96 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 21 + y, 1, 2);
        g2d.fillRect(111 + x, 22 + y, 1, 4);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(106 + x, 22 + y, 1, 2);
        g2d.fillRect(103 + x, 22 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 2);
        g2d.fillRect(94 + x, 22 + y, 1, 2);
        g2d.fillRect(112 + x, 23 + y, 1, 1);
        g2d.fillRect(109 + x, 23 + y, 1, 2);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(98 + x, 24 + y, 1, 1);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 21 + y, 1, 3);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 2);
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(107 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 21 + y, 1, 2);
        g2d.fillRect(101 + x, 21 + y, 1, 2);
        g2d.fillRect(98 + x, 21 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(107 + x, 22 + y, 1, 2);
        g2d.fillRect(110 + x, 23 + y, 1, 2);
    }





    public void paintBackM(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 11 + y, 9, 1);
        g2d.fillRect(112 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 2, 1);
        g2d.fillRect(104 + x, 14 + y, 2, 1);
        g2d.fillRect(103 + x, 15 + y, 2, 1);
        g2d.fillRect(102 + x, 16 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 4, 1);
        g2d.fillRect(103 + x, 12 + y, 4, 1);
        g2d.fillRect(100 + x, 12 + y, 2, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 1);
        g2d.fillRect(102 + x, 14 + y, 2, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 2, 1);
        g2d.fillRect(101 + x, 15 + y, 2, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 3);
        g2d.fillRect(96 + x, 16 + y, 1, 2);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 2, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(95 + x, 18 + y, 1, 1);
        g2d.fillRect(112 + x, 24 + y, 1, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 5);
        g2d.fillRect(113 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 3);
        g2d.fillRect(112 + x, 27 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 27 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 13 + y, 1, 3);
        g2d.fillRect(108 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 3);
        g2d.fillRect(106 + x, 14 + y, 2, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 2);
        g2d.fillRect(106 + x, 15 + y, 1, 2);
        g2d.fillRect(105 + x, 15 + y, 1, 3);
        g2d.fillRect(98 + x, 15 + y, 2, 1);
        g2d.fillRect(111 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(98 + x, 16 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 4);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 3);
        g2d.fillRect(114 + x, 23 + y, 1, 3);
        g2d.fillRect(113 + x, 23 + y, 1, 3);
        g2d.fillRect(112 + x, 25 + y, 1, 2);
        g2d.fillRect(112 + x, 29 + y, 1, 2);
        g2d.fillRect(113 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 2, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 3);
        g2d.fillRect(99 + x, 16 + y, 1, 6);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 5);
        g2d.fillRect(102 + x, 18 + y, 1, 4);
        g2d.fillRect(96 + x, 18 + y, 3, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(107 + x, 19 + y, 4, 1);
        g2d.fillRect(104 + x, 19 + y, 2, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 3);
        g2d.fillRect(108 + x, 20 + y, 1, 3);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(114 + x, 21 + y, 1, 2);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 2, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 2);
        g2d.fillRect(113 + x, 16 + y, 1, 2);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 18 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 4);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(100 + x, 20 + y, 1, 2);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 22 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 3);
        g2d.fillRect(104 + x, 20 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(96 + x, 20 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 2);
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(100 + x, 22 + y, 1, 1);
    }
}
