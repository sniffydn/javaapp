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
public class MediumPony5 extends SuperH
{
    public MediumPony5()
    {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public MediumPony5(int step, int dir)
    {
        super(step, dir);
    }

    public MediumPony5(int step, int dir, ColorArray colorSwitch)
    {
        super(step, dir, colorSwitch);
    }

    public void drawFront(int x, int y, GraphicsMap g2d)
    {
    }

    public void drawMiddle(int x, int y, GraphicsMap g2d)
    {
        super.drawMiddle(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            paintBack2M(x,y,g2d);
        }
        else
        {
            paint2M(x,y,g2d);
        }
    }

    public void drawBack(int x, int y, GraphicsMap g2d)
    {
        super.drawBack(x,y,g2d);
        if(direction.equalsIgnoreCase("left"))
        {
            paintBack2F(x,y,g2d);
        }
        else
        {
            paint2F(x,y,g2d);
        }
    }

    public void paint2F(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(122 + x, 12 + y, 2, 1);
        g2d.fillRect(96 + x, 13 + y, 2, 1);
        g2d.fillRect(121 + x, 13 + y, 1, 1);
        g2d.fillRect(90 + x, 14 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 2, 1);
        g2d.fillRect(89 + x, 15 + y, 1, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(126 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 2, 1);
        g2d.fillRect(123 + x, 16 + y, 1, 1);
        g2d.fillRect(127 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(124 + x, 17 + y, 1, 2);
        g2d.fillRect(95 + x, 18 + y, 1, 2);
        g2d.fillRect(125 + x, 19 + y, 1, 3);
        g2d.fillRect(94 + x, 20 + y, 1, 3);
        g2d.fillRect(125 + x, 23 + y, 1, 1);
        g2d.fillRect(94 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 11 + y, 1, 2);
        g2d.fillRect(94 + x, 11 + y, 2, 1);
        g2d.fillRect(122 + x, 11 + y, 3, 1);
        g2d.fillRect(91 + x, 12 + y, 1, 4);
        g2d.fillRect(92 + x, 12 + y, 1, 2);
        g2d.fillRect(120 + x, 12 + y, 1, 2);
        g2d.fillRect(121 + x, 12 + y, 1, 1);
        g2d.fillRect(124 + x, 12 + y, 3, 1);
        g2d.fillRect(90 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 3, 1);
        g2d.fillRect(122 + x, 13 + y, 1, 1);
        g2d.fillRect(126 + x, 13 + y, 1, 2);
        g2d.fillRect(127 + x, 13 + y, 2, 1);
        g2d.fillRect(88 + x, 14 + y, 1, 2);
        g2d.fillRect(89 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 2);
        g2d.fillRect(123 + x, 14 + y, 1, 2);
        g2d.fillRect(124 + x, 14 + y, 2, 1);
        g2d.fillRect(128 + x, 14 + y, 1, 1);
        g2d.fillRect(93 + x, 15 + y, 1, 3);
        g2d.fillRect(97 + x, 15 + y, 2, 1);
        g2d.fillRect(122 + x, 15 + y, 1, 4);
        g2d.fillRect(125 + x, 15 + y, 1, 1);
        g2d.fillRect(127 + x, 15 + y, 1, 1);
        g2d.fillRect(90 + x, 16 + y, 1, 9);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(124 + x, 16 + y, 1, 1);
        g2d.fillRect(126 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(123 + x, 17 + y, 1, 8);
        g2d.fillRect(125 + x, 17 + y, 1, 2);
        g2d.fillRect(127 + x, 17 + y, 2, 1);
        g2d.fillRect(89 + x, 18 + y, 1, 5);
        g2d.fillRect(92 + x, 18 + y, 1, 6);
        g2d.fillRect(96 + x, 18 + y, 1, 5);
        g2d.fillRect(128 + x, 18 + y, 1, 6);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(124 + x, 19 + y, 1, 11);
        g2d.fillRect(126 + x, 19 + y, 1, 4);
        g2d.fillRect(129 + x, 19 + y, 1, 2);
        g2d.fillRect(95 + x, 20 + y, 1, 7);
        g2d.fillRect(93 + x, 22 + y, 1, 4);
        g2d.fillRect(125 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(127 + x, 23 + y, 1, 4);
        g2d.fillRect(125 + x, 24 + y, 1, 1);
        g2d.fillRect(91 + x, 25 + y, 1, 4);
        g2d.fillRect(94 + x, 25 + y, 1, 5);
        g2d.fillRect(126 + x, 26 + y, 1, 2);
        g2d.fillRect(92 + x, 27 + y, 1, 2);
        g2d.fillRect(125 + x, 28 + y, 1, 4);
        g2d.fillRect(93 + x, 30 + y, 1, 2);
        g2d.fillRect(92 + x, 31 + y, 1, 2);
        g2d.fillRect(126 + x, 31 + y, 1, 1);
        g2d.fillRect(91 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(91 + x, 11 + y, 1, 1);
        g2d.fillRect(96 + x, 11 + y, 5, 1);
        g2d.fillRect(121 + x, 11 + y, 1, 1);
        g2d.fillRect(125 + x, 11 + y, 1, 1);
        g2d.fillRect(90 + x, 12 + y, 1, 1);
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 3, 1);
        g2d.fillRect(127 + x, 12 + y, 1, 1);
        g2d.fillRect(89 + x, 13 + y, 1, 1);
        g2d.fillRect(93 + x, 13 + y, 1, 2);
        g2d.fillRect(101 + x, 13 + y, 2, 1);
        g2d.fillRect(123 + x, 13 + y, 3, 1);
        g2d.fillRect(92 + x, 14 + y, 1, 4);
        g2d.fillRect(97 + x, 14 + y, 2, 1);
        g2d.fillRect(122 + x, 14 + y, 1, 1);
        g2d.fillRect(127 + x, 14 + y, 1, 1);
        g2d.fillRect(90 + x, 15 + y, 1, 1);
        g2d.fillRect(95 + x, 15 + y, 2, 1);
        g2d.fillRect(124 + x, 15 + y, 1, 1);
        g2d.fillRect(129 + x, 15 + y, 1, 1);
        g2d.fillRect(91 + x, 16 + y, 1, 4);
        g2d.fillRect(94 + x, 16 + y, 1, 1);
        g2d.fillRect(125 + x, 16 + y, 1, 1);
        g2d.fillRect(89 + x, 17 + y, 1, 1);
        g2d.fillRect(88 + x, 18 + y, 1, 3);
        g2d.fillRect(93 + x, 18 + y, 1, 4);
        g2d.fillRect(126 + x, 18 + y, 1, 1);
        g2d.fillRect(127 + x, 20 + y, 1, 3);
        g2d.fillRect(91 + x, 21 + y, 1, 1);
        g2d.fillRect(129 + x, 21 + y, 1, 2);
        g2d.fillRect(126 + x, 23 + y, 1, 2);
        g2d.fillRect(92 + x, 24 + y, 1, 1);
        g2d.fillRect(128 + x, 24 + y, 1, 1);
        g2d.fillRect(90 + x, 25 + y, 1, 1);
        g2d.fillRect(125 + x, 25 + y, 1, 1);
        g2d.fillRect(93 + x, 26 + y, 1, 2);
        g2d.fillRect(89 + x, 27 + y, 2, 1);
        g2d.fillRect(128 + x, 27 + y, 1, 1);
        g2d.fillRect(90 + x, 29 + y, 1, 1);
        g2d.fillRect(92 + x, 29 + y, 1, 2);
        g2d.fillRect(93 + x, 29 + y, 1, 1);
        g2d.fillRect(91 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(92 + x, 11 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(94 + x, 13 + y, 1, 1);
        g2d.fillRect(128 + x, 15 + y, 1, 1);
        g2d.fillRect(89 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(88 + x, 17 + y, 1, 1);
        g2d.fillRect(126 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);
        g2d.fillRect(127 + x, 19 + y, 1, 1);
        g2d.fillRect(91 + x, 20 + y, 1, 1);
        g2d.fillRect(88 + x, 21 + y, 1, 1);
        g2d.fillRect(91 + x, 22 + y, 1, 1);
        g2d.fillRect(89 + x, 24 + y, 1, 1);
        g2d.fillRect(126 + x, 25 + y, 1, 1);
        g2d.fillRect(90 + x, 26 + y, 1, 1);
        g2d.fillRect(92 + x, 26 + y, 1, 1);
        g2d.fillRect(125 + x, 26 + y, 1, 1);
        g2d.fillRect(93 + x, 28 + y, 1, 1);
        g2d.fillRect(127 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(126 + x, 11 + y, 1, 1);
        g2d.fillRect(96 + x, 12 + y, 2, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 1);
        g2d.fillRect(127 + x, 18 + y, 1, 1);
        g2d.fillRect(88 + x, 22 + y, 1, 1);
        g2d.fillRect(89 + x, 23 + y, 1, 1);
        g2d.fillRect(91 + x, 23 + y, 1, 2);
        g2d.fillRect(92 + x, 25 + y, 1, 1);
        g2d.fillRect(125 + x, 27 + y, 1, 1);
        g2d.fillRect(126 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(91 + x, 29 + y, 1, 1);
    }





    public void paint2M(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 12 + y, 1, 3);
        g2d.fillRect(104 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(120 + x, 14 + y, 1, 3);
        g2d.fillRect(121 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 11 + y, 1, 2);
        g2d.fillRect(106 + x, 11 + y, 1, 7);
        g2d.fillRect(107 + x, 11 + y, 1, 2);
        g2d.fillRect(108 + x, 11 + y, 9, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 8);
        g2d.fillRect(110 + x, 12 + y, 4, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 3);
        g2d.fillRect(117 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 13 + y, 2, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 2);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 15 + y, 1, 5);
        g2d.fillRect(117 + x, 15 + y, 1, 2);
        g2d.fillRect(121 + x, 15 + y, 1, 1);
        g2d.fillRect(118 + x, 16 + y, 1, 6);
        g2d.fillRect(107 + x, 17 + y, 1, 3);
        g2d.fillRect(110 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 2);
        g2d.fillRect(109 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 7);
        g2d.fillRect(121 + x, 19 + y, 1, 6);
        g2d.fillRect(110 + x, 20 + y, 5, 1);
        g2d.fillRect(114 + x, 21 + y, 3, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 3);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(116 + x, 22 + y, 3, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 4);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 2, 1);
        g2d.fillRect(106 + x, 24 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 3);
        g2d.fillRect(102 + x, 25 + y, 1, 5);
        g2d.fillRect(101 + x, 26 + y, 1, 2);
        g2d.fillRect(104 + x, 27 + y, 1, 4);
        g2d.fillRect(105 + x, 28 + y, 1, 5);
        g2d.fillRect(119 + x, 28 + y, 1, 4);
        g2d.fillRect(103 + x, 29 + y, 1, 2);
        g2d.fillRect(120 + x, 29 + y, 1, 1);
        g2d.fillRect(118 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 12 + y, 1, 2);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 2, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 2);
        g2d.fillRect(110 + x, 13 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 1, 3);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 2);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 2, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 1, 3);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(120 + x, 17 + y, 1, 5);
        g2d.fillRect(105 + x, 18 + y, 1, 3);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 4);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 7);
        g2d.fillRect(111 + x, 19 + y, 2, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 7);
        g2d.fillRect(102 + x, 23 + y, 1, 2);
        g2d.fillRect(119 + x, 24 + y, 1, 1);
        g2d.fillRect(104 + x, 25 + y, 1, 2);
        g2d.fillRect(120 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 1, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 4);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(104 + x, 22 + y, 1, 3);
        g2d.fillRect(119 + x, 25 + y, 1, 2);
        g2d.fillRect(120 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 1, 3);
        g2d.fillRect(105 + x, 15 + y, 1, 3);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 2);
        g2d.fillRect(111 + x, 16 + y, 1, 3);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(106 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 3);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 2);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(105 + x, 21 + y, 1, 3);
        g2d.fillRect(106 + x, 21 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 21 + y, 1, 2);
        g2d.fillRect(106 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
    }





    public void paintBack2F(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(92 + x, 12 + y, 2, 1);
        g2d.fillRect(118 + x, 13 + y, 2, 1);
        g2d.fillRect(94 + x, 13 + y, 1, 1);
        g2d.fillRect(125 + x, 14 + y, 1, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 2, 1);
        g2d.fillRect(126 + x, 15 + y, 1, 1);
        g2d.fillRect(121 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(89 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(92 + x, 16 + y, 1, 1);
        g2d.fillRect(88 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 1);
        g2d.fillRect(91 + x, 17 + y, 1, 2);
        g2d.fillRect(120 + x, 18 + y, 1, 2);
        g2d.fillRect(90 + x, 19 + y, 1, 3);
        g2d.fillRect(121 + x, 20 + y, 1, 3);
        g2d.fillRect(90 + x, 23 + y, 1, 1);
        g2d.fillRect(121 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 11 + y, 1, 2);
        g2d.fillRect(120 + x, 11 + y, 2, 1);
        g2d.fillRect(91 + x, 11 + y, 3, 1);
        g2d.fillRect(124 + x, 12 + y, 1, 4);
        g2d.fillRect(123 + x, 12 + y, 1, 2);
        g2d.fillRect(95 + x, 12 + y, 1, 2);
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(89 + x, 12 + y, 3, 1);
        g2d.fillRect(125 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 3, 1);
        g2d.fillRect(93 + x, 13 + y, 1, 1);
        g2d.fillRect(89 + x, 13 + y, 1, 2);
        g2d.fillRect(87 + x, 13 + y, 2, 1);
        g2d.fillRect(127 + x, 14 + y, 1, 2);
        g2d.fillRect(126 + x, 14 + y, 1, 1);
        g2d.fillRect(121 + x, 14 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 14 + y, 1, 1);
        g2d.fillRect(94 + x, 14 + y, 1, 2);
        g2d.fillRect(92 + x, 14 + y, 1, 2);
        g2d.fillRect(90 + x, 14 + y, 2, 1);
        g2d.fillRect(87 + x, 14 + y, 1, 1);
        g2d.fillRect(122 + x, 15 + y, 1, 3);
        g2d.fillRect(117 + x, 15 + y, 2, 1);
        g2d.fillRect(93 + x, 15 + y, 1, 4);
        g2d.fillRect(90 + x, 15 + y, 1, 1);
        g2d.fillRect(88 + x, 15 + y, 1, 1);
        g2d.fillRect(125 + x, 16 + y, 1, 9);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(91 + x, 16 + y, 1, 1);
        g2d.fillRect(89 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 1);
        g2d.fillRect(118 + x, 17 + y, 1, 2);
        g2d.fillRect(92 + x, 17 + y, 1, 8);
        g2d.fillRect(90 + x, 17 + y, 1, 2);
        g2d.fillRect(87 + x, 17 + y, 2, 1);
        g2d.fillRect(126 + x, 18 + y, 1, 5);
        g2d.fillRect(123 + x, 18 + y, 1, 6);
        g2d.fillRect(119 + x, 18 + y, 1, 5);
        g2d.fillRect(87 + x, 18 + y, 1, 6);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(91 + x, 19 + y, 1, 11);
        g2d.fillRect(89 + x, 19 + y, 1, 4);
        g2d.fillRect(86 + x, 19 + y, 1, 2);
        g2d.fillRect(120 + x, 20 + y, 1, 7);
        g2d.fillRect(122 + x, 22 + y, 1, 4);
        g2d.fillRect(90 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(88 + x, 23 + y, 1, 4);
        g2d.fillRect(90 + x, 24 + y, 1, 1);
        g2d.fillRect(124 + x, 25 + y, 1, 4);
        g2d.fillRect(121 + x, 25 + y, 1, 5);
        g2d.fillRect(89 + x, 26 + y, 1, 2);
        g2d.fillRect(123 + x, 27 + y, 1, 2);
        g2d.fillRect(90 + x, 28 + y, 1, 4);
        g2d.fillRect(122 + x, 30 + y, 1, 2);
        g2d.fillRect(123 + x, 31 + y, 1, 2);
        g2d.fillRect(89 + x, 31 + y, 1, 1);
        g2d.fillRect(124 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(124 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 11 + y, 5, 1);
        g2d.fillRect(94 + x, 11 + y, 1, 1);
        g2d.fillRect(90 + x, 11 + y, 1, 1);
        g2d.fillRect(125 + x, 12 + y, 1, 1);
        g2d.fillRect(121 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 3, 1);
        g2d.fillRect(88 + x, 12 + y, 1, 1);
        g2d.fillRect(126 + x, 13 + y, 1, 1);
        g2d.fillRect(122 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 2, 1);
        g2d.fillRect(90 + x, 13 + y, 3, 1);
        g2d.fillRect(123 + x, 14 + y, 1, 4);
        g2d.fillRect(117 + x, 14 + y, 2, 1);
        g2d.fillRect(93 + x, 14 + y, 1, 1);
        g2d.fillRect(88 + x, 14 + y, 1, 1);
        g2d.fillRect(125 + x, 15 + y, 1, 1);
        g2d.fillRect(119 + x, 15 + y, 2, 1);
        g2d.fillRect(91 + x, 15 + y, 1, 1);
        g2d.fillRect(86 + x, 15 + y, 1, 1);
        g2d.fillRect(124 + x, 16 + y, 1, 4);
        g2d.fillRect(121 + x, 16 + y, 1, 1);
        g2d.fillRect(90 + x, 16 + y, 1, 1);
        g2d.fillRect(126 + x, 17 + y, 1, 1);
        g2d.fillRect(127 + x, 18 + y, 1, 3);
        g2d.fillRect(122 + x, 18 + y, 1, 4);
        g2d.fillRect(89 + x, 18 + y, 1, 1);
        g2d.fillRect(88 + x, 20 + y, 1, 3);
        g2d.fillRect(124 + x, 21 + y, 1, 1);
        g2d.fillRect(86 + x, 21 + y, 1, 2);
        g2d.fillRect(89 + x, 23 + y, 1, 2);
        g2d.fillRect(123 + x, 24 + y, 1, 1);
        g2d.fillRect(87 + x, 24 + y, 1, 1);
        g2d.fillRect(125 + x, 25 + y, 1, 1);
        g2d.fillRect(90 + x, 25 + y, 1, 1);
        g2d.fillRect(122 + x, 26 + y, 1, 2);
        g2d.fillRect(125 + x, 27 + y, 2, 1);
        g2d.fillRect(87 + x, 27 + y, 1, 1);
        g2d.fillRect(125 + x, 29 + y, 1, 1);
        g2d.fillRect(123 + x, 29 + y, 1, 2);
        g2d.fillRect(122 + x, 29 + y, 1, 1);
        g2d.fillRect(124 + x, 30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(123 + x, 11 + y, 1, 1);
        g2d.fillRect(120 + x, 12 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(121 + x, 13 + y, 1, 1);
        g2d.fillRect(87 + x, 15 + y, 1, 1);
        g2d.fillRect(126 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(127 + x, 17 + y, 1, 1);
        g2d.fillRect(89 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);
        g2d.fillRect(88 + x, 19 + y, 1, 1);
        g2d.fillRect(124 + x, 20 + y, 1, 1);
        g2d.fillRect(127 + x, 21 + y, 1, 1);
        g2d.fillRect(124 + x, 22 + y, 1, 1);
        g2d.fillRect(126 + x, 24 + y, 1, 1);
        g2d.fillRect(89 + x, 25 + y, 1, 1);
        g2d.fillRect(125 + x, 26 + y, 1, 1);
        g2d.fillRect(123 + x, 26 + y, 1, 1);
        g2d.fillRect(90 + x, 26 + y, 1, 1);
        g2d.fillRect(122 + x, 28 + y, 1, 1);
        g2d.fillRect(88 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(89 + x, 11 + y, 1, 1);
        g2d.fillRect(118 + x, 12 + y, 2, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
        g2d.fillRect(88 + x, 18 + y, 1, 1);
        g2d.fillRect(127 + x, 22 + y, 1, 1);
        g2d.fillRect(126 + x, 23 + y, 1, 1);
        g2d.fillRect(124 + x, 23 + y, 1, 2);
        g2d.fillRect(123 + x, 25 + y, 1, 1);
        g2d.fillRect(90 + x, 27 + y, 1, 1);
        g2d.fillRect(89 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(124 + x, 29 + y, 1, 1);
    }





    public void paintBack2M(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(112 + x, 12 + y, 1, 3);
        g2d.fillRect(111 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 2);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(95 + x, 14 + y, 1, 3);
        g2d.fillRect(94 + x, 16 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 11 + y, 1, 2);
        g2d.fillRect(109 + x, 11 + y, 1, 7);
        g2d.fillRect(108 + x, 11 + y, 1, 2);
        g2d.fillRect(99 + x, 11 + y, 9, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 8);
        g2d.fillRect(102 + x, 12 + y, 4, 1);
        g2d.fillRect(99 + x, 12 + y, 1, 3);
        g2d.fillRect(98 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 1, 3);
        g2d.fillRect(100 + x, 13 + y, 2, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 2);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 15 + y, 1, 5);
        g2d.fillRect(98 + x, 15 + y, 1, 2);
        g2d.fillRect(94 + x, 15 + y, 1, 1);
        g2d.fillRect(97 + x, 16 + y, 1, 6);
        g2d.fillRect(108 + x, 17 + y, 1, 3);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(107 + x, 20 + y, 1, 2);
        g2d.fillRect(106 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 3);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 7);
        g2d.fillRect(94 + x, 19 + y, 1, 6);
        g2d.fillRect(101 + x, 20 + y, 5, 1);
        g2d.fillRect(99 + x, 21 + y, 3, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 3);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 3, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 4);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 2, 1);
        g2d.fillRect(109 + x, 24 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 3);
        g2d.fillRect(113 + x, 25 + y, 1, 5);
        g2d.fillRect(114 + x, 26 + y, 1, 2);
        g2d.fillRect(111 + x, 27 + y, 1, 4);
        g2d.fillRect(110 + x, 28 + y, 1, 5);
        g2d.fillRect(96 + x, 28 + y, 1, 4);
        g2d.fillRect(112 + x, 29 + y, 1, 2);
        g2d.fillRect(95 + x, 29 + y, 1, 1);
        g2d.fillRect(97 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 12 + y, 1, 2);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 2, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 2);
        g2d.fillRect(105 + x, 13 + y, 1, 2);
        g2d.fillRect(104 + x, 13 + y, 1, 3);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 2);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(96 + x, 15 + y, 2, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 3);
        g2d.fillRect(102 + x, 16 + y, 1, 3);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(95 + x, 17 + y, 1, 5);
        g2d.fillRect(110 + x, 18 + y, 1, 3);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 4);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 7);
        g2d.fillRect(103 + x, 19 + y, 2, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 7);
        g2d.fillRect(113 + x, 23 + y, 1, 2);
        g2d.fillRect(96 + x, 24 + y, 1, 1);
        g2d.fillRect(111 + x, 25 + y, 1, 2);
        g2d.fillRect(95 + x, 26 + y, 1, 1);
        g2d.fillRect(96 + x, 27 + y, 1, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 16 + y, 1, 1);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 4);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(111 + x, 22 + y, 1, 3);
        g2d.fillRect(96 + x, 25 + y, 1, 2);
        g2d.fillRect(95 + x, 27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(107 + x, 14 + y, 1, 3);
        g2d.fillRect(110 + x, 15 + y, 1, 3);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 2);
        g2d.fillRect(104 + x, 16 + y, 1, 3);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(109 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 3);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(110 + x, 21 + y, 1, 3);
        g2d.fillRect(109 + x, 21 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 21 + y, 1, 2);
        g2d.fillRect(109 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
    }
}
