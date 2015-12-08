/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.h;

import clts.*;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import clts.t.u.a.T0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class E6 extends SuperTL
{
    int direction = 0;
    public E6()
    {
        super();
    }

    public E6(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            if(offsetX == 1 || prevX == 1)
            {
                paintAr(offsetX, 0, g2d);
            }
            else if(offsetX == -1 || prevX == -1)
            {
                paintBr(offsetX, 0, g2d);
            }
            else
            {
                paintCr(offsetX, 0, g2d);
            }
        }
        else
        {
            if(offsetX == -1 || prevX == -1)
            {
                paintBackAr(offsetX, 0, g2d);
            }
            else if(offsetX == 1 || prevX == 1)
            {
                paintBackBr(offsetX, 0, g2d);
            }
            else
            {
                paintBackCr(offsetX, 0, g2d);
            }
        }
    }

    int prevX = 0;

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            if(offsetX == 1 || prevX == 1)
            {
                paintAl(offsetX, 0, g2d);
            }
            else if(offsetX == -1 || prevX == -1)
            {
                paintBl(offsetX, 0, g2d);
            }
            else
            {
                paintCl(offsetX, 0, g2d);
            }
        }
        else
        {
            if(offsetX == -1 || prevX == -1)
            {
                paintBackAl(offsetX, 0, g2d);
            }
            else if(offsetX == 1 || prevX == 1)
            {
                paintBackBl(offsetX, 0, g2d);
            }
            else
            {
                paintBackCl(offsetX, 0, g2d);
            }
        }
        prevX = offsetX;
    }

    public void paintCr(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(117 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 2);
        g2d.fillRect(118 + x, 38 + y, 1, 2);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
    }





    public void paintCl(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 32 + y, 1, 1);
        g2d.fillRect(103 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(105 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 33 + y, 1, 1);
        g2d.fillRect(103 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(105 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 33 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 1);
        g2d.fillRect(103 + x, 34 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(104 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(104 + x, 32 + y, 1, 2);
        g2d.fillRect(104 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 36 + y, 1, 2);
        g2d.fillRect(105 + x, 36 + y, 1, 2);
        g2d.fillRect(104 + x, 40 + y, 1, 1);
    }





    public void paintBl(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 32 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 33 + y, 1, 1);
        g2d.fillRect(102 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 33 + y, 1, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 1);
        g2d.fillRect(103 + x, 34 + y, 1, 1);
        g2d.fillRect(101 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(104 + x, 32 + y, 1, 2);
        g2d.fillRect(103 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 2);
        g2d.fillRect(104 + x, 36 + y, 1, 2);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
    }





    public void paintBr(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(116 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(117 + x, 38 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
    }





    public void paintAr(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(117 + x, 38 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 36 + y, 1, 2);
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(118 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 34 + y, 1, 2);
        g2d.fillRect(118 + x, 37 + y, 1, 1);
        g2d.fillRect(115 + x, 38 + y, 1, 2);
        g2d.fillRect(119 + x, 38 + y, 1, 2);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
    }





    public void paintAl(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 32 + y, 1, 1);
        g2d.fillRect(104 + x, 35 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(106 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 33 + y, 1, 1);
        g2d.fillRect(104 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(106 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 33 + y, 1, 1);
        g2d.fillRect(104 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 32 + y, 1, 1);
        g2d.fillRect(103 + x, 34 + y, 1, 2);
        g2d.fillRect(103 + x, 38 + y, 1, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(104 + x, 32 + y, 1, 2);
        g2d.fillRect(105 + x, 35 + y, 1, 1);
        g2d.fillRect(102 + x, 36 + y, 1, 2);
        g2d.fillRect(106 + x, 36 + y, 1, 2);
        g2d.fillRect(105 + x, 40 + y, 1, 1);
    }





    public void paintBackCr(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 38 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(98 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 2);
        g2d.fillRect(97 + x, 38 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 1);
    }





    public void paintBackCl(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 32 + y, 1, 1);
        g2d.fillRect(112 + x, 35 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(110 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 33 + y, 1, 1);
        g2d.fillRect(112 + x, 36 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(110 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 33 + y, 1, 1);
        g2d.fillRect(112 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 1);
        g2d.fillRect(112 + x, 34 + y, 1, 1);
        g2d.fillRect(113 + x, 35 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 31 + y, 1, 1);
        g2d.fillRect(111 + x, 32 + y, 1, 2);
        g2d.fillRect(111 + x, 35 + y, 1, 1);
        g2d.fillRect(114 + x, 36 + y, 1, 2);
        g2d.fillRect(110 + x, 36 + y, 1, 2);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
    }





    public void paintBackBl(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 32 + y, 1, 1);
        g2d.fillRect(113 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(111 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 33 + y, 1, 1);
        g2d.fillRect(113 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 33 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 1);
        g2d.fillRect(112 + x, 34 + y, 1, 1);
        g2d.fillRect(114 + x, 35 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(112 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 31 + y, 1, 1);
        g2d.fillRect(111 + x, 32 + y, 1, 2);
        g2d.fillRect(112 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 2);
        g2d.fillRect(111 + x, 36 + y, 1, 2);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
    }





    public void paintBackBr(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 36 + y, 1, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(99 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(98 + x, 38 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
    }





    public void paintBackAr(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(98 + x, 38 + y, 1, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 36 + y, 1, 2);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 34 + y, 1, 2);
        g2d.fillRect(97 + x, 37 + y, 1, 1);
        g2d.fillRect(100 + x, 38 + y, 1, 2);
        g2d.fillRect(96 + x, 38 + y, 1, 2);
        g2d.fillRect(97 + x, 42 + y, 1, 1);
    }





    public void paintBackAl(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 32 + y, 1, 1);
        g2d.fillRect(111 + x, 35 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(111 + x, 41 + y, 1, 1);
        g2d.fillRect(109 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 33 + y, 1, 1);
        g2d.fillRect(111 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 1, 1);
        g2d.fillRect(109 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 33 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 32 + y, 1, 1);
        g2d.fillRect(112 + x, 34 + y, 1, 2);
        g2d.fillRect(112 + x, 38 + y, 1, 1);
        g2d.fillRect(110 + x, 38 + y, 1, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 31 + y, 1, 1);
        g2d.fillRect(111 + x, 32 + y, 1, 2);
        g2d.fillRect(110 + x, 35 + y, 1, 1);
        g2d.fillRect(113 + x, 36 + y, 1, 2);
        g2d.fillRect(109 + x, 36 + y, 1, 2);
        g2d.fillRect(110 + x, 40 + y, 1, 1);
    }
}
