/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.*;
import draw.Panel;
import util.Color;
import util.DFactory;
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
public class Copy3 extends SuperTL
{
    int y = -50;
    int alpha = 0;
    int count = 0;
    int increment = 0;
    int length = 0;

    public Copy3()
    {
        super();
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public Copy3(ColorArray colorSwitch)
    {
        super(colorSwitch);
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;

        count++;
        if(count > DFactory.ARRAY_SIZE)
        {
            count = 0;
            alpha = 0;
            y = -50;
        }

        if(count > (length - 3))
        {
            if((count - (length - 3)) < (length / 2))
            {
                alpha += increment;
                if(alpha > 255)
                    alpha = 255;
            }
            else
            {
                alpha -= increment;
                if(alpha < 0)
                    alpha = 0;
            }

            if(alpha != 255)
                y-=4;
        }

        COLORS.setAlpha(alpha);
    }


    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintSha(offsetX + 125 + shiftX, y + 125 + shiftY,g2d);
    }

     public void paintSha(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(23 + x, 20 + y, 1, 19);
        g2d.fillRect(24 + x, 20 + y, 1, 19);
        g2d.fillRect(44 + x, 20 + y, 1, 19);
        g2d.fillRect(45 + x, 20 + y, 1, 19);
        g2d.fillRect(9 + x, 21 + y, 1, 12);
        g2d.fillRect(10 + x, 21 + y, 1, 7);
        g2d.fillRect(11 + x, 21 + y, 1, 7);
        g2d.fillRect(12 + x, 21 + y, 1, 7);
        g2d.fillRect(13 + x, 21 + y, 1, 7);
        g2d.fillRect(14 + x, 21 + y, 1, 7);
        g2d.fillRect(15 + x, 21 + y, 1, 7);
        g2d.fillRect(16 + x, 21 + y, 1, 7);
        g2d.fillRect(17 + x, 21 + y, 1, 7);
        g2d.fillRect(18 + x, 21 + y, 1, 7);
        g2d.fillRect(25 + x, 21 + y, 1, 18);
        g2d.fillRect(46 + x, 21 + y, 1, 18);
        g2d.fillRect(47 + x, 21 + y, 1, 18);
        g2d.fillRect(8 + x, 22 + y, 1, 11);
        g2d.fillRect(19 + x, 22 + y, 1, 6);
        g2d.fillRect(26 + x, 22 + y, 1, 17);
        g2d.fillRect(7 + x, 23 + y, 1, 9);
        g2d.fillRect(20 + x, 23 + y, 1, 5);
        g2d.fillRect(27 + x, 27 + y, 1, 4);
        g2d.fillRect(28 + x, 27 + y, 1, 5);
        g2d.fillRect(29 + x, 27 + y, 1, 12);
        g2d.fillRect(30 + x, 27 + y, 1, 12);
        g2d.fillRect(37 + x, 27 + y, 1, 5);
        g2d.fillRect(38 + x, 27 + y, 1, 5);
        g2d.fillRect(39 + x, 27 + y, 1, 4);
        g2d.fillRect(40 + x, 27 + y, 1, 5);
        g2d.fillRect(41 + x, 27 + y, 1, 6);
        g2d.fillRect(42 + x, 27 + y, 1, 12);
        g2d.fillRect(53 + x, 27 + y, 1, 5);
        g2d.fillRect(54 + x, 27 + y, 1, 4);
        g2d.fillRect(55 + x, 27 + y, 1, 4);
        g2d.fillRect(62 + x, 27 + y, 1, 12);
        g2d.fillRect(63 + x, 27 + y, 1, 12);
        g2d.fillRect(64 + x, 27 + y, 1, 12);
        g2d.fillRect(65 + x, 27 + y, 1, 12);
        g2d.fillRect(66 + x, 27 + y, 1, 4);
        g2d.fillRect(67 + x, 27 + y, 1, 5);
        g2d.fillRect(68 + x, 27 + y, 1, 12);
        g2d.fillRect(69 + x, 27 + y, 1, 12);
        g2d.fillRect(31 + x, 28 + y, 1, 11);
        g2d.fillRect(36 + x, 28 + y, 1, 10);
        g2d.fillRect(51 + x, 28 + y, 1, 10);
        g2d.fillRect(52 + x, 28 + y, 1, 4);
        g2d.fillRect(56 + x, 28 + y, 1, 4);
        g2d.fillRect(57 + x, 28 + y, 1, 10);
        g2d.fillRect(70 + x, 28 + y, 1, 11);
        g2d.fillRect(10 + x, 29 + y, 1, 4);
        g2d.fillRect(32 + x, 29 + y, 1, 10);
        g2d.fillRect(35 + x, 29 + y, 1, 8);
        g2d.fillRect(50 + x, 29 + y, 1, 8);
        g2d.fillRect(58 + x, 29 + y, 1, 8);
        g2d.fillRect(71 + x, 29 + y, 1, 10);
        g2d.fillRect(11 + x, 30 + y, 1, 3);
        g2d.fillRect(12 + x, 30 + y, 1, 3);
        g2d.fillRect(13 + x, 30 + y, 1, 9);
        g2d.fillRect(14 + x, 30 + y, 1, 9);
        g2d.fillRect(15 + x, 30 + y, 1, 8);
        g2d.fillRect(16 + x, 30 + y, 1, 8);
        g2d.fillRect(17 + x, 30 + y, 1, 7);
        g2d.fillRect(18 + x, 30 + y, 1, 6);
        g2d.fillRect(19 + x, 30 + y, 1, 5);
        g2d.fillRect(20 + x, 30 + y, 1, 4);
        g2d.fillRect(34 + x, 30 + y, 1, 6);
        g2d.fillRect(59 + x, 30 + y, 1, 6);
        g2d.fillRect(49 + x, 31 + y, 1, 4);
        g2d.fillRect(41 + x, 35 + y, 1, 4);
        g2d.fillRect(52 + x, 35 + y, 1, 3);
        g2d.fillRect(10 + x, 36 + y, 1, 3);
        g2d.fillRect(11 + x, 36 + y, 1, 3);
        g2d.fillRect(12 + x, 36 + y, 1, 3);
        g2d.fillRect(37 + x, 36 + y, 1, 2);
        g2d.fillRect(56 + x, 36 + y, 1, 2);
        g2d.fillRect(38 + x, 37 + y, 1, 2);
        g2d.fillRect(39 + x, 37 + y, 1, 2);
        g2d.fillRect(40 + x, 37 + y, 1, 2);
        g2d.fillRect(53 + x, 37 + y, 1, 2);
        g2d.fillRect(54 + x, 37 + y, 1, 2);
        g2d.fillRect(55 + x, 37 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(56 + x, 27 + y, 1, 1);
        g2d.fillRect(55 + x, 31 + y, 1, 1);
        g2d.fillRect(52 + x, 32 + y, 1, 1);
        g2d.fillRect(18 + x, 36 + y, 1, 1);
        g2d.fillRect(39 + x, 36 + y, 1, 1);
        g2d.fillRect(54 + x, 36 + y, 1, 1);
        g2d.fillRect(37 + x, 38 + y, 1, 1);
        g2d.fillRect(56 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(46 + x, 20 + y, 1, 1);
        g2d.fillRect(37 + x, 32 + y, 1, 1);
        g2d.fillRect(56 + x, 32 + y, 1, 1);
        g2d.fillRect(19 + x, 35 + y, 1, 1);
        g2d.fillRect(40 + x, 36 + y, 1, 1);
        g2d.fillRect(53 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(7 + x, 22 + y, 1, 1);
        g2d.fillRect(20 + x, 22 + y, 1, 1);
        g2d.fillRect(31 + x, 27 + y, 1, 1);
        g2d.fillRect(52 + x, 27 + y, 1, 1);
        g2d.fillRect(70 + x, 27 + y, 1, 1);
        g2d.fillRect(10 + x, 28 + y, 1, 1);
        g2d.fillRect(35 + x, 28 + y, 1, 1);
        g2d.fillRect(58 + x, 28 + y, 1, 1);
        g2d.fillRect(11 + x, 29 + y, 1, 1);
        g2d.fillRect(27 + x, 31 + y, 1, 1);
        g2d.fillRect(39 + x, 31 + y, 1, 1);
        g2d.fillRect(54 + x, 31 + y, 1, 1);
        g2d.fillRect(66 + x, 31 + y, 1, 1);
        g2d.fillRect(53 + x, 32 + y, 1, 1);
        g2d.fillRect(12 + x, 33 + y, 1, 1);
        g2d.fillRect(41 + x, 34 + y, 1, 1);
        g2d.fillRect(52 + x, 34 + y, 1, 1);
        g2d.fillRect(38 + x, 36 + y, 1, 1);
        g2d.fillRect(55 + x, 36 + y, 1, 1);
        g2d.fillRect(17 + x, 37 + y, 1, 1);
        g2d.fillRect(35 + x, 37 + y, 1, 1);
        g2d.fillRect(58 + x, 37 + y, 1, 1);
        g2d.fillRect(15 + x, 38 + y, 1, 1);
        g2d.fillRect(52 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(22 + x, 20 + y, 1, 19);
        g2d.fillRect(8 + x, 21 + y, 1, 1);
        g2d.fillRect(19 + x, 21 + y, 1, 1);
        g2d.fillRect(26 + x, 21 + y, 1, 1);
        g2d.fillRect(6 + x, 24 + y, 1, 6);
        g2d.fillRect(21 + x, 25 + y, 1, 3);
        g2d.fillRect(61 + x, 27 + y, 1, 12);
        g2d.fillRect(12 + x, 29 + y, 9, 1);
        g2d.fillRect(34 + x, 29 + y, 1, 1);
        g2d.fillRect(59 + x, 29 + y, 1, 1);
        g2d.fillRect(21 + x, 30 + y, 1, 1);
        g2d.fillRect(49 + x, 30 + y, 1, 1);
        g2d.fillRect(28 + x, 32 + y, 1, 7);
        g2d.fillRect(33 + x, 32 + y, 1, 2);
        g2d.fillRect(60 + x, 32 + y, 1, 2);
        g2d.fillRect(67 + x, 32 + y, 1, 7);
        g2d.fillRect(10 + x, 33 + y, 2, 1);
        g2d.fillRect(49 + x, 35 + y, 1, 1);
        g2d.fillRect(9 + x, 36 + y, 1, 2);
        g2d.fillRect(34 + x, 36 + y, 1, 1);
        g2d.fillRect(59 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(21 + x, 24 + y, 1, 1);
        g2d.fillRect(32 + x, 28 + y, 1, 1);
        g2d.fillRect(71 + x, 28 + y, 1, 1);
        g2d.fillRect(40 + x, 32 + y, 1, 1);
        g2d.fillRect(12 + x, 35 + y, 1, 1);
        g2d.fillRect(9 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(25 + x, 20 + y, 1, 1);
        g2d.fillRect(36 + x, 27 + y, 1, 1);
        g2d.fillRect(6 + x, 30 + y, 1, 1);
        g2d.fillRect(21 + x, 31 + y, 1, 1);
        g2d.fillRect(37 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(57 + x, 27 + y, 1, 1);
        g2d.fillRect(33 + x, 31 + y, 1, 1);
        g2d.fillRect(60 + x, 31 + y, 1, 1);
        g2d.fillRect(9 + x, 33 + y, 1, 1);
        g2d.fillRect(20 + x, 34 + y, 1, 1);
        g2d.fillRect(33 + x, 34 + y, 1, 1);
        g2d.fillRect(60 + x, 34 + y, 1, 1);
        g2d.fillRect(37 + x, 35 + y, 1, 1);
        g2d.fillRect(56 + x, 35 + y, 1, 1);
        g2d.fillRect(36 + x, 38 + y, 1, 1);
        g2d.fillRect(57 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(48 + x, 22 + y, 1, 17);
        g2d.fillRect(6 + x, 23 + y, 1, 1);
        g2d.fillRect(43 + x, 27 + y, 1, 12);
        g2d.fillRect(21 + x, 29 + y, 1, 1);
        g2d.fillRect(38 + x, 32 + y, 1, 1);
        g2d.fillRect(41 + x, 33 + y, 1, 1);
        g2d.fillRect(52 + x, 33 + y, 1, 1);
        g2d.fillRect(56 + x, 34 + y, 1, 1);
        g2d.fillRect(10 + x, 35 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(21 + x, 23 + y, 1, 1);
        g2d.fillRect(50 + x, 28 + y, 1, 1);
        g2d.fillRect(7 + x, 32 + y, 1, 1);
        g2d.fillRect(21 + x, 32 + y, 1, 1);
        g2d.fillRect(55 + x, 32 + y, 1, 1);
        g2d.fillRect(50 + x, 37 + y, 1, 1);
        g2d.fillRect(16 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(47 + x, 20 + y, 1, 1);
        g2d.fillRect(43 + x, 26 + y, 1, 1);
        g2d.fillRect(9 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(10 + x, 20 + y, 8, 1);
        g2d.fillRect(43 + x, 20 + y, 1, 6);
        g2d.fillRect(27 + x, 26 + y, 4, 1);
        g2d.fillRect(38 + x, 26 + y, 5, 1);
        g2d.fillRect(54 + x, 26 + y, 2, 1);
        g2d.fillRect(62 + x, 26 + y, 8, 1);
        g2d.fillRect(51 + x, 27 + y, 1, 1);
        g2d.fillRect(11 + x, 28 + y, 10, 1);
        g2d.fillRect(49 + x, 29 + y, 1, 1);
        g2d.fillRect(33 + x, 30 + y, 1, 1);
        g2d.fillRect(60 + x, 30 + y, 1, 1);
        g2d.fillRect(33 + x, 35 + y, 1, 1);
        g2d.fillRect(39 + x, 35 + y, 1, 1);
        g2d.fillRect(54 + x, 35 + y, 1, 1);
        g2d.fillRect(60 + x, 35 + y, 1, 1);
        g2d.fillRect(49 + x, 36 + y, 1, 1);
        g2d.fillRect(51 + x, 38 + y, 1, 1);
        g2d.fillRect(10 + x, 39 + y, 4, 1);
        g2d.fillRect(23 + x, 39 + y, 4, 1);
        g2d.fillRect(29 + x, 39 + y, 3, 1);
        g2d.fillRect(38 + x, 39 + y, 5, 1);
        g2d.fillRect(44 + x, 39 + y, 4, 1);
        g2d.fillRect(54 + x, 39 + y, 2, 1);
        g2d.fillRect(62 + x, 39 + y, 4, 1);
        g2d.fillRect(68 + x, 39 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(61 + x, 26 + y, 1, 1);
        g2d.fillRect(6 + x, 31 + y, 1, 1);
        g2d.fillRect(53 + x, 34 + y, 1, 1);
        g2d.fillRect(19 + x, 36 + y, 1, 1);
        g2d.fillRect(18 + x, 37 + y, 1, 1);
        g2d.fillRect(22 + x, 39 + y, 1, 1);
        g2d.fillRect(28 + x, 39 + y, 1, 1);
        g2d.fillRect(32 + x, 39 + y, 1, 1);
        g2d.fillRect(43 + x, 39 + y, 1, 1);
        g2d.fillRect(61 + x, 39 + y, 1, 1);
        g2d.fillRect(67 + x, 39 + y, 1, 1);
        g2d.fillRect(71 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(9 + x, 20 + y, 1, 1);
        g2d.fillRect(18 + x, 20 + y, 1, 1);
        g2d.fillRect(48 + x, 21 + y, 1, 1);
        g2d.fillRect(53 + x, 26 + y, 1, 1);
        g2d.fillRect(8 + x, 33 + y, 1, 1);
        g2d.fillRect(40 + x, 34 + y, 1, 1);
        g2d.fillRect(9 + x, 39 + y, 1, 1);
        g2d.fillRect(48 + x, 39 + y, 1, 1);
        g2d.fillRect(53 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(26 + x, 20 + y, 1, 1);
        g2d.fillRect(7 + x, 21 + y, 1, 1);
        g2d.fillRect(20 + x, 21 + y, 1, 1);
        g2d.fillRect(6 + x, 22 + y, 1, 1);
        g2d.fillRect(32 + x, 27 + y, 1, 1);
        g2d.fillRect(35 + x, 27 + y, 1, 1);
        g2d.fillRect(58 + x, 27 + y, 1, 1);
        g2d.fillRect(71 + x, 27 + y, 1, 1);
        g2d.fillRect(21 + x, 28 + y, 1, 1);
        g2d.fillRect(34 + x, 28 + y, 1, 1);
        g2d.fillRect(59 + x, 28 + y, 1, 1);
        g2d.fillRect(21 + x, 33 + y, 1, 1);
        g2d.fillRect(37 + x, 33 + y, 3, 1);
        g2d.fillRect(53 + x, 33 + y, 1, 1);
        g2d.fillRect(55 + x, 33 + y, 1, 1);
        g2d.fillRect(38 + x, 34 + y, 1, 1);
        g2d.fillRect(20 + x, 35 + y, 1, 1);
        g2d.fillRect(40 + x, 35 + y, 1, 1);
        g2d.fillRect(53 + x, 35 + y, 1, 1);
        g2d.fillRect(34 + x, 37 + y, 1, 1);
        g2d.fillRect(59 + x, 37 + y, 1, 1);
        g2d.fillRect(35 + x, 38 + y, 1, 1);
        g2d.fillRect(58 + x, 38 + y, 1, 1);
        g2d.fillRect(14 + x, 39 + y, 1, 1);
    }

    public void attributesSetUpDecreaseShiftX()
    {
        shiftX--;
    }

    public void attributesSetUpIncreaseShiftX()
    {
        shiftX++;
    }

    public int getShiftX()
    {
        return shiftX;
    }

    public void attributesSetUpDecreaseShiftY()
    {
        shiftY--;
    }

    public void attributesSetUpIncreaseShiftY()
    {
        shiftY++;
    }

    public int getShiftY()
    {
        return shiftY;
    }

    int shiftX = 0;
    int shiftY = 0;

}
