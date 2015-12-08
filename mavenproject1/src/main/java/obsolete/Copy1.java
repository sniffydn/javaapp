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
public class Copy1 extends SuperTL
{
    int y = 100;
    int alpha = 0;
    int count = 0;
    int increment = 0;
    int length = 0;

    public Copy1()
    {
        super();
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public Copy1(ColorArray colorSwitch)
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
            y = 100;
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

    public void paintTam(int x, int y, GraphicsMap g2d)
    {
        x = x + 100;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(11 + x, 0 + y, 1, 4);
        g2d.fillRect(2 + x, 1 + y, 1, 4);
        g2d.fillRect(3 + x, 1 + y, 1, 2);
        g2d.fillRect(4 + x, 1 + y, 1, 2);
        g2d.fillRect(5 + x, 1 + y, 1, 2);
        g2d.fillRect(6 + x, 1 + y, 1, 14);
        g2d.fillRect(7 + x, 1 + y, 1, 20);
        g2d.fillRect(8 + x, 1 + y, 1, 2);
        g2d.fillRect(9 + x, 1 + y, 1, 2);
        g2d.fillRect(10 + x, 1 + y, 1, 2);
        g2d.fillRect(1 + x, 2 + y, 1, 3);
        g2d.fillRect(12 + x, 3 + y, 1, 1);
        g2d.fillRect(16 + x, 10 + y, 3, 1);
        g2d.fillRect(22 + x, 10 + y, 3, 1);
        g2d.fillRect(35 + x, 10 + y, 3, 1);
        g2d.fillRect(15 + x, 11 + y, 1, 1);
        g2d.fillRect(19 + x, 11 + y, 1, 9);
        g2d.fillRect(23 + x, 11 + y, 1, 9);
        g2d.fillRect(24 + x, 11 + y, 1, 5);
        g2d.fillRect(25 + x, 11 + y, 3, 1);
        g2d.fillRect(29 + x, 11 + y, 2, 1);
        g2d.fillRect(36 + x, 11 + y, 1, 2);
        g2d.fillRect(37 + x, 11 + y, 1, 9);
        g2d.fillRect(38 + x, 11 + y, 1, 2);
        g2d.fillRect(39 + x, 11 + y, 3, 1);
        g2d.fillRect(43 + x, 11 + y, 2, 1);
        g2d.fillRect(56 + x, 11 + y, 1, 1);
        g2d.fillRect(13 + x, 12 + y, 2, 1);
        g2d.fillRect(27 + x, 12 + y, 1, 2);
        g2d.fillRect(28 + x, 12 + y, 1, 9);
        g2d.fillRect(31 + x, 12 + y, 1, 2);
        g2d.fillRect(41 + x, 12 + y, 1, 6);
        g2d.fillRect(42 + x, 12 + y, 1, 1);
        g2d.fillRect(44 + x, 12 + y, 2, 1);
        g2d.fillRect(57 + x, 12 + y, 1, 5);
        g2d.fillRect(58 + x, 12 + y, 1, 1);
        g2d.fillRect(14 + x, 13 + y, 2, 1);
        g2d.fillRect(45 + x, 13 + y, 1, 3);
        g2d.fillRect(50 + x, 13 + y, 3, 1);
        g2d.fillRect(20 + x, 14 + y, 1, 2);
        g2d.fillRect(32 + x, 14 + y, 1, 4);
        g2d.fillRect(53 + x, 14 + y, 1, 1);
        g2d.fillRect(16 + x, 15 + y, 1, 2);
        g2d.fillRect(17 + x, 15 + y, 2, 1);
        g2d.fillRect(46 + x, 15 + y, 1, 4);
        g2d.fillRect(54 + x, 15 + y, 1, 1);
        g2d.fillRect(8 + x, 16 + y, 1, 5);
        g2d.fillRect(14 + x, 16 + y, 1, 2);
        g2d.fillRect(15 + x, 16 + y, 1, 1);
        g2d.fillRect(55 + x, 16 + y, 2, 1);
        g2d.fillRect(13 + x, 17 + y, 1, 2);
        g2d.fillRect(33 + x, 17 + y, 1, 4);
        g2d.fillRect(42 + x, 17 + y, 1, 4);
        g2d.fillRect(56 + x, 17 + y, 1, 2);
        g2d.fillRect(18 + x, 18 + y, 1, 2);
        g2d.fillRect(50 + x, 18 + y, 1, 4);
        g2d.fillRect(51 + x, 18 + y, 2, 1);
        g2d.fillRect(9 + x, 19 + y, 1, 2);
        g2d.fillRect(10 + x, 19 + y, 1, 1);
        g2d.fillRect(14 + x, 19 + y, 1, 1);
        g2d.fillRect(17 + x, 19 + y, 1, 1);
        g2d.fillRect(22 + x, 19 + y, 1, 1);
        g2d.fillRect(24 + x, 19 + y, 1, 1);
        g2d.fillRect(34 + x, 19 + y, 3, 1);
        g2d.fillRect(38 + x, 19 + y, 1, 1);
        g2d.fillRect(47 + x, 19 + y, 3, 1);
        g2d.fillRect(55 + x, 19 + y, 1, 2);
        g2d.fillRect(6 + x, 20 + y, 1, 1);
        g2d.fillRect(15 + x, 20 + y, 1, 1);
        g2d.fillRect(27 + x, 20 + y, 1, 1);
        g2d.fillRect(29 + x, 20 + y, 1, 1);
        g2d.fillRect(41 + x, 20 + y, 1, 1);
        g2d.fillRect(43 + x, 20 + y, 1, 1);
        g2d.fillRect(46 + x, 20 + y, 1, 1);
        g2d.fillRect(49 + x, 20 + y, 1, 1);
        g2d.fillRect(54 + x, 21 + y, 1, 1);
        g2d.fillRect(51 + x, 22 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(15 + x, 10 + y, 1, 1);
        g2d.fillRect(14 + x, 11 + y, 1, 1);
        g2d.fillRect(28 + x, 11 + y, 1, 1);
        g2d.fillRect(31 + x, 11 + y, 1, 1);
        g2d.fillRect(42 + x, 11 + y, 1, 1);
        g2d.fillRect(57 + x, 11 + y, 1, 1);
        g2d.fillRect(15 + x, 12 + y, 1, 1);
        g2d.fillRect(25 + x, 12 + y, 1, 1);
        g2d.fillRect(29 + x, 12 + y, 1, 1);
        g2d.fillRect(32 + x, 13 + y, 1, 1);
        g2d.fillRect(38 + x, 13 + y, 1, 1);
        g2d.fillRect(42 + x, 13 + y, 1, 1);
        g2d.fillRect(18 + x, 14 + y, 1, 1);
        g2d.fillRect(52 + x, 14 + y, 1, 1);
        g2d.fillRect(54 + x, 14 + y, 1, 1);
        g2d.fillRect(49 + x, 17 + y, 1, 1);
        g2d.fillRect(13 + x, 19 + y, 1, 1);
        g2d.fillRect(16 + x, 19 + y, 1, 1);
        g2d.fillRect(46 + x, 19 + y, 1, 1);
        g2d.fillRect(56 + x, 19 + y, 1, 1);
        g2d.fillRect(47 + x, 20 + y, 1, 1);
        g2d.fillRect(54 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(12 + x, 2 + y, 1, 1);
        g2d.fillRect(56 + x, 12 + y, 1, 1);
        g2d.fillRect(59 + x, 12 + y, 1, 1);
        g2d.fillRect(31 + x, 14 + y, 1, 1);
        g2d.fillRect(50 + x, 14 + y, 1, 1);
        g2d.fillRect(8 + x, 15 + y, 1, 1);
        g2d.fillRect(15 + x, 15 + y, 1, 1);
        g2d.fillRect(56 + x, 15 + y, 1, 1);
        g2d.fillRect(45 + x, 16 + y, 1, 1);
        g2d.fillRect(20 + x, 17 + y, 1, 1);
        g2d.fillRect(36 + x, 18 + y, 1, 1);
        g2d.fillRect(41 + x, 19 + y, 1, 1);
        g2d.fillRect(14 + x, 20 + y, 1, 1);
        g2d.fillRect(16 + x, 20 + y, 1, 1);
        g2d.fillRect(19 + x, 20 + y, 1, 1);
        g2d.fillRect(32 + x, 20 + y, 1, 1);
        g2d.fillRect(36 + x, 20 + y, 1, 1);
        g2d.fillRect(38 + x, 20 + y, 1, 1);
        g2d.fillRect(7 + x, 21 + y, 1, 1);
        g2d.fillRect(55 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(11 + x, 4 + y, 1, 1);
        g2d.fillRect(21 + x, 10 + y, 1, 1);
        g2d.fillRect(18 + x, 11 + y, 1, 1);
        g2d.fillRect(22 + x, 11 + y, 1, 1);
        g2d.fillRect(51 + x, 12 + y, 1, 1);
        g2d.fillRect(13 + x, 13 + y, 1, 1);
        g2d.fillRect(20 + x, 13 + y, 1, 1);
        g2d.fillRect(6 + x, 15 + y, 1, 1);
        g2d.fillRect(53 + x, 15 + y, 1, 1);
        g2d.fillRect(55 + x, 15 + y, 1, 1);
        g2d.fillRect(54 + x, 16 + y, 1, 1);
        g2d.fillRect(50 + x, 17 + y, 1, 1);
        g2d.fillRect(55 + x, 17 + y, 1, 2);
        g2d.fillRect(24 + x, 18 + y, 1, 1);
        g2d.fillRect(32 + x, 18 + y, 1, 1);
        g2d.fillRect(41 + x, 18 + y, 1, 1);
        g2d.fillRect(47 + x, 18 + y, 1, 1);
        g2d.fillRect(49 + x, 18 + y, 1, 1);
        g2d.fillRect(25 + x, 19 + y, 1, 1);
        g2d.fillRect(29 + x, 19 + y, 1, 1);
        g2d.fillRect(34 + x, 20 + y, 1, 1);
        g2d.fillRect(50 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(5 + x, 3 + y, 1, 1);
        g2d.fillRect(47 + x, 9 + y, 1, 1);
        g2d.fillRect(26 + x, 10 + y, 1, 1);
        g2d.fillRect(40 + x, 10 + y, 1, 1);
        g2d.fillRect(58 + x, 11 + y, 1, 1);
        g2d.fillRect(12 + x, 12 + y, 1, 1);
        g2d.fillRect(30 + x, 12 + y, 1, 1);
        g2d.fillRect(8 + x, 13 + y, 1, 2);
        g2d.fillRect(36 + x, 13 + y, 1, 1);
        g2d.fillRect(53 + x, 13 + y, 1, 1);
        g2d.fillRect(27 + x, 14 + y, 1, 2);
        g2d.fillRect(42 + x, 14 + y, 1, 3);
        g2d.fillRect(46 + x, 14 + y, 1, 1);
        g2d.fillRect(51 + x, 14 + y, 1, 1);
        g2d.fillRect(56 + x, 14 + y, 1, 1);
        g2d.fillRect(6 + x, 16 + y, 1, 1);
        g2d.fillRect(20 + x, 16 + y, 1, 1);
        g2d.fillRect(24 + x, 16 + y, 1, 2);
        g2d.fillRect(33 + x, 16 + y, 1, 1);
        g2d.fillRect(57 + x, 17 + y, 1, 1);
        g2d.fillRect(14 + x, 18 + y, 1, 1);
        g2d.fillRect(15 + x, 19 + y, 1, 1);
        g2d.fillRect(35 + x, 20 + y, 1, 1);
        g2d.fillRect(40 + x, 20 + y, 1, 1);
        g2d.fillRect(48 + x, 20 + y, 1, 1);
        g2d.fillRect(6 + x, 21 + y, 1, 1);
        g2d.fillRect(52 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(10 + x, 0 + y, 1, 1);
        g2d.fillRect(13 + x, 9 + y, 1, 1);
        g2d.fillRect(33 + x, 9 + y, 1, 1);
        g2d.fillRect(46 + x, 9 + y, 1, 1);
        g2d.fillRect(38 + x, 10 + y, 1, 1);
        g2d.fillRect(43 + x, 12 + y, 1, 1);
        g2d.fillRect(44 + x, 13 + y, 1, 1);
        g2d.fillRect(36 + x, 17 + y, 1, 1);
        g2d.fillRect(10 + x, 18 + y, 1, 1);
        g2d.fillRect(18 + x, 20 + y, 1, 1);
        g2d.fillRect(22 + x, 20 + y, 1, 1);
        g2d.fillRect(24 + x, 20 + y, 1, 1);
        g2d.fillRect(51 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(1 + x, 1 + y, 1, 1);
        g2d.fillRect(32 + x, 9 + y, 1, 1);
        g2d.fillRect(27 + x, 10 + y, 1, 1);
        g2d.fillRect(39 + x, 10 + y, 1, 1);
        g2d.fillRect(13 + x, 11 + y, 1, 1);
        g2d.fillRect(20 + x, 12 + y, 1, 1);
        g2d.fillRect(32 + x, 12 + y, 1, 1);
        g2d.fillRect(39 + x, 12 + y, 2, 1);
        g2d.fillRect(52 + x, 12 + y, 1, 1);
        g2d.fillRect(56 + x, 13 + y, 1, 1);
        g2d.fillRect(36 + x, 14 + y, 1, 1);
        g2d.fillRect(38 + x, 14 + y, 1, 1);
        g2d.fillRect(31 + x, 15 + y, 1, 1);
        g2d.fillRect(13 + x, 16 + y, 1, 1);
        g2d.fillRect(17 + x, 16 + y, 1, 1);
        g2d.fillRect(45 + x, 17 + y, 1, 1);
        g2d.fillRect(27 + x, 19 + y, 1, 1);
        g2d.fillRect(51 + x, 19 + y, 1, 1);
        g2d.fillRect(10 + x, 20 + y, 1, 1);
        g2d.fillRect(23 + x, 20 + y, 1, 1);
        g2d.fillRect(54 + x, 20 + y, 1, 1);
        g2d.fillRect(53 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(12 + x, 1 + y, 1, 1);
        g2d.fillRect(19 + x, 10 + y, 1, 1);
        g2d.fillRect(35 + x, 11 + y, 1, 1);
        g2d.fillRect(45 + x, 11 + y, 1, 1);
        g2d.fillRect(53 + x, 11 + y, 1, 1);
        g2d.fillRect(59 + x, 11 + y, 1, 1);
        g2d.fillRect(17 + x, 14 + y, 1, 1);
        g2d.fillRect(15 + x, 17 + y, 1, 1);
        g2d.fillRect(9 + x, 18 + y, 1, 1);
        g2d.fillRect(29 + x, 18 + y, 1, 1);
        g2d.fillRect(37 + x, 20 + y, 1, 1);
        g2d.fillRect(51 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(0 + x, 2 + y, 1, 2);
        g2d.fillRect(4 + x, 3 + y, 1, 1);
        g2d.fillRect(5 + x, 4 + y, 1, 2);
        g2d.fillRect(14 + x, 9 + y, 1, 1);
        g2d.fillRect(17 + x, 9 + y, 1, 1);
        g2d.fillRect(24 + x, 9 + y, 1, 1);
        g2d.fillRect(34 + x, 9 + y, 1, 2);
        g2d.fillRect(37 + x, 9 + y, 1, 1);
        g2d.fillRect(13 + x, 10 + y, 1, 1);
        g2d.fillRect(25 + x, 10 + y, 1, 1);
        g2d.fillRect(30 + x, 10 + y, 1, 1);
        g2d.fillRect(43 + x, 10 + y, 2, 1);
        g2d.fillRect(47 + x, 10 + y, 1, 1);
        g2d.fillRect(8 + x, 11 + y, 1, 2);
        g2d.fillRect(16 + x, 11 + y, 1, 1);
        g2d.fillRect(21 + x, 11 + y, 1, 1);
        g2d.fillRect(54 + x, 11 + y, 1, 1);
        g2d.fillRect(22 + x, 12 + y, 1, 1);
        g2d.fillRect(25 + x, 13 + y, 1, 1);
        g2d.fillRect(29 + x, 13 + y, 1, 1);
        g2d.fillRect(40 + x, 13 + y, 1, 1);
        g2d.fillRect(46 + x, 13 + y, 1, 1);
        g2d.fillRect(49 + x, 13 + y, 1, 1);
        g2d.fillRect(58 + x, 13 + y, 1, 1);
        g2d.fillRect(15 + x, 14 + y, 1, 1);
        g2d.fillRect(14 + x, 15 + y, 1, 1);
        g2d.fillRect(33 + x, 15 + y, 1, 1);
        g2d.fillRect(36 + x, 15 + y, 1, 2);
        g2d.fillRect(38 + x, 15 + y, 1, 1);
        g2d.fillRect(18 + x, 16 + y, 1, 2);
        g2d.fillRect(27 + x, 16 + y, 1, 2);
        g2d.fillRect(6 + x, 17 + y, 1, 1);
        g2d.fillRect(29 + x, 17 + y, 1, 1);
        g2d.fillRect(47 + x, 17 + y, 1, 1);
        g2d.fillRect(51 + x, 17 + y, 2, 1);
        g2d.fillRect(17 + x, 18 + y, 1, 1);
        g2d.fillRect(22 + x, 18 + y, 1, 1);
        g2d.fillRect(57 + x, 18 + y, 1, 1);
        g2d.fillRect(32 + x, 19 + y, 1, 1);
        g2d.fillRect(43 + x, 19 + y, 1, 1);
        g2d.fillRect(52 + x, 19 + y, 1, 1);
        g2d.fillRect(17 + x, 20 + y, 1, 1);
        g2d.fillRect(25 + x, 20 + y, 1, 1);
        g2d.fillRect(30 + x, 20 + y, 1, 1);
        g2d.fillRect(56 + x, 20 + y, 1, 1);
        g2d.fillRect(8 + x, 21 + y, 1, 1);
        g2d.fillRect(27 + x, 21 + y, 3, 1);
        g2d.fillRect(33 + x, 21 + y, 1, 1);
        g2d.fillRect(41 + x, 21 + y, 3, 1);
        g2d.fillRect(49 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(10 + x, 3 + y, 1, 1);
        g2d.fillRect(12 + x, 4 + y, 1, 1);
        g2d.fillRect(13 + x, 8 + y, 1, 1);
        g2d.fillRect(16 + x, 9 + y, 1, 1);
        g2d.fillRect(21 + x, 9 + y, 1, 1);
        g2d.fillRect(35 + x, 9 + y, 1, 1);
        g2d.fillRect(8 + x, 10 + y, 1, 1);
        g2d.fillRect(33 + x, 10 + y, 1, 1);
        g2d.fillRect(46 + x, 10 + y, 1, 1);
        g2d.fillRect(59 + x, 13 + y, 1, 1);
        g2d.fillRect(44 + x, 14 + y, 1, 1);
        g2d.fillRect(31 + x, 16 + y, 1, 1);
        g2d.fillRect(20 + x, 18 + y, 1, 1);
        g2d.fillRect(38 + x, 18 + y, 1, 1);
        g2d.fillRect(21 + x, 19 + y, 1, 1);
        g2d.fillRect(40 + x, 19 + y, 1, 1);
        g2d.fillRect(45 + x, 20 + y, 1, 1);
        g2d.fillRect(53 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(9 + x, 0 + y, 1, 1);
        g2d.fillRect(12 + x, 0 + y, 1, 1);
        g2d.fillRect(3 + x, 3 + y, 1, 1);
        g2d.fillRect(0 + x, 4 + y, 1, 1);
        g2d.fillRect(1 + x, 5 + y, 1, 1);
        g2d.fillRect(5 + x, 6 + y, 1, 1);
        g2d.fillRect(23 + x, 9 + y, 1, 1);
        g2d.fillRect(14 + x, 10 + y, 1, 1);
        g2d.fillRect(41 + x, 10 + y, 1, 1);
        g2d.fillRect(56 + x, 10 + y, 1, 1);
        g2d.fillRect(18 + x, 12 + y, 1, 1);
        g2d.fillRect(26 + x, 12 + y, 1, 1);
        g2d.fillRect(54 + x, 12 + y, 1, 1);
        g2d.fillRect(6 + x, 18 + y, 1, 1);
        g2d.fillRect(27 + x, 18 + y, 1, 1);
        g2d.fillRect(34 + x, 18 + y, 1, 1);
        g2d.fillRect(45 + x, 18 + y, 1, 1);
        g2d.fillRect(11 + x, 19 + y, 1, 1);
        g2d.fillRect(39 + x, 19 + y, 1, 1);
        g2d.fillRect(40 + x, 21 + y, 1, 1);
        g2d.fillRect(46 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(8 + x, 0 + y, 1, 1);
        g2d.fillRect(8 + x, 3 + y, 1, 1);
        g2d.fillRect(13 + x, 3 + y, 1, 1);
        g2d.fillRect(5 + x, 7 + y, 1, 5);
        g2d.fillRect(8 + x, 8 + y, 1, 2);
        g2d.fillRect(33 + x, 8 + y, 1, 1);
        g2d.fillRect(46 + x, 8 + y, 1, 1);
        g2d.fillRect(12 + x, 9 + y, 1, 1);
        g2d.fillRect(18 + x, 9 + y, 1, 1);
        g2d.fillRect(22 + x, 9 + y, 1, 1);
        g2d.fillRect(36 + x, 9 + y, 1, 1);
        g2d.fillRect(38 + x, 9 + y, 1, 1);
        g2d.fillRect(45 + x, 9 + y, 1, 1);
        g2d.fillRect(29 + x, 10 + y, 1, 1);
        g2d.fillRect(17 + x, 11 + y, 1, 1);
        g2d.fillRect(20 + x, 11 + y, 1, 1);
        g2d.fillRect(34 + x, 11 + y, 1, 1);
        g2d.fillRect(22 + x, 13 + y, 1, 1);
        g2d.fillRect(14 + x, 14 + y, 1, 1);
        g2d.fillRect(29 + x, 14 + y, 1, 3);
        g2d.fillRect(33 + x, 14 + y, 1, 1);
        g2d.fillRect(40 + x, 14 + y, 1, 2);
        g2d.fillRect(49 + x, 14 + y, 1, 1);
        g2d.fillRect(58 + x, 14 + y, 1, 2);
        g2d.fillRect(38 + x, 16 + y, 1, 2);
        g2d.fillRect(47 + x, 16 + y, 1, 1);
        g2d.fillRect(12 + x, 18 + y, 1, 1);
        g2d.fillRect(53 + x, 18 + y, 1, 1);
        g2d.fillRect(26 + x, 20 + y, 1, 1);
        g2d.fillRect(51 + x, 20 + y, 1, 1);
        g2d.fillRect(30 + x, 21 + y, 1, 1);
        g2d.fillRect(47 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(8 + x, 7 + y, 1, 1);
        g2d.fillRect(31 + x, 10 + y, 2, 1);
        g2d.fillRect(55 + x, 11 + y, 1, 2);
        g2d.fillRect(5 + x, 12 + y, 1, 1);
        g2d.fillRect(50 + x, 12 + y, 1, 1);
        g2d.fillRect(53 + x, 12 + y, 1, 1);
        g2d.fillRect(30 + x, 13 + y, 1, 1);
        g2d.fillRect(16 + x, 14 + y, 1, 1);
        g2d.fillRect(49 + x, 16 + y, 1, 1);
        g2d.fillRect(12 + x, 17 + y, 1, 1);
        g2d.fillRect(22 + x, 17 + y, 1, 1);
        g2d.fillRect(48 + x, 17 + y, 1, 1);
        g2d.fillRect(6 + x, 19 + y, 1, 1);
        g2d.fillRect(54 + x, 19 + y, 1, 1);
        g2d.fillRect(11 + x, 20 + y, 1, 1);
        g2d.fillRect(13 + x, 20 + y, 1, 1);
        g2d.fillRect(55 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(9 + x, 3 + y, 1, 1);
        g2d.fillRect(3 + x, 4 + y, 1, 1);
        g2d.fillRect(32 + x, 8 + y, 1, 1);
        g2d.fillRect(47 + x, 8 + y, 1, 1);
        g2d.fillRect(48 + x, 9 + y, 1, 1);
        g2d.fillRect(12 + x, 10 + y, 1, 1);
        g2d.fillRect(32 + x, 11 + y, 1, 1);
        g2d.fillRect(51 + x, 11 + y, 1, 1);
        g2d.fillRect(16 + x, 12 + y, 1, 1);
        g2d.fillRect(46 + x, 12 + y, 1, 1);
        g2d.fillRect(22 + x, 14 + y, 1, 1);
        g2d.fillRect(25 + x, 14 + y, 1, 1);
        g2d.fillRect(55 + x, 14 + y, 1, 1);
        g2d.fillRect(44 + x, 15 + y, 1, 1);
        g2d.fillRect(31 + x, 17 + y, 1, 1);
        g2d.fillRect(20 + x, 19 + y, 1, 1);
        g2d.fillRect(26 + x, 19 + y, 1, 1);
        g2d.fillRect(30 + x, 19 + y, 1, 1);
        g2d.fillRect(53 + x, 19 + y, 1, 1);
        g2d.fillRect(5 + x, 20 + y, 1, 1);
        g2d.fillRect(54 + x, 23 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(0 + x, 1 + y, 1, 1);
        g2d.fillRect(0 + x, 5 + y, 1, 1);
        g2d.fillRect(14 + x, 8 + y, 1, 1);
        g2d.fillRect(15 + x, 9 + y, 1, 1);
        g2d.fillRect(28 + x, 10 + y, 1, 1);
        g2d.fillRect(42 + x, 10 + y, 1, 1);
        g2d.fillRect(48 + x, 10 + y, 1, 1);
        g2d.fillRect(54 + x, 10 + y, 1, 1);
        g2d.fillRect(12 + x, 11 + y, 1, 1);
        g2d.fillRect(12 + x, 13 + y, 1, 1);
        g2d.fillRect(16 + x, 13 + y, 1, 1);
        g2d.fillRect(18 + x, 13 + y, 1, 1);
        g2d.fillRect(39 + x, 13 + y, 1, 1);
        g2d.fillRect(43 + x, 13 + y, 1, 1);
        g2d.fillRect(54 + x, 13 + y, 1, 1);
        g2d.fillRect(52 + x, 15 + y, 1, 1);
        g2d.fillRect(50 + x, 16 + y, 1, 1);
        g2d.fillRect(53 + x, 16 + y, 1, 1);
        g2d.fillRect(9 + x, 17 + y, 1, 1);
        g2d.fillRect(16 + x, 17 + y, 1, 2);
        g2d.fillRect(54 + x, 17 + y, 1, 1);
        g2d.fillRect(25 + x, 18 + y, 1, 1);
        g2d.fillRect(35 + x, 18 + y, 1, 1);
        g2d.fillRect(43 + x, 18 + y, 1, 1);
        g2d.fillRect(48 + x, 18 + y, 1, 1);
        g2d.fillRect(12 + x, 19 + y, 1, 1);
        g2d.fillRect(57 + x, 19 + y, 1, 1);
        g2d.fillRect(9 + x, 21 + y, 1, 1);
        g2d.fillRect(26 + x, 21 + y, 1, 1);
        g2d.fillRect(32 + x, 21 + y, 1, 1);
        g2d.fillRect(56 + x, 21 + y, 1, 1);
        g2d.fillRect(6 + x, 22 + y, 1, 1);
        g2d.fillRect(49 + x, 22 + y, 1, 1);
        g2d.fillRect(50 + x, 23 + y, 1, 1);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintTam(0 + shiftX, y + shiftY, g2d);
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
