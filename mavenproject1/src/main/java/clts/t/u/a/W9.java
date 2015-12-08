/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class W9 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public W9()
    {
        super();
        includeY = true;
    }

    public W9(int layer)
    {
        super(layer);
        includeY = true;
    }

    public W9(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public W9(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryBack(offsetX, offsetY, g2d);
        if(!isIncludeY())
            offsetY = 0;
        offsetX = offsetX + shiftX;
        offsetY = offsetY + shiftY;
        paintW(offsetX + 66, offsetY + 23, g2d);
    }

    public void paintW(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(76 + x, 14 + y, 1, 1);
        g2d.fillRect(66 + x, 15 + y, 1, 1);
        g2d.fillRect(75 + x, 15 + y, 1, 1);
        g2d.fillRect(64 + x, 16 + y, 1, 1);
        g2d.fillRect(74 + x, 16 + y, 1, 2);
        g2d.fillRect(62 + x, 17 + y, 2, 1);
        g2d.fillRect(73 + x, 17 + y, 1, 1);
        g2d.fillRect(59 + x, 18 + y, 2, 1);
        g2d.fillRect(71 + x, 18 + y, 1, 1);
        g2d.fillRect(58 + x, 19 + y, 1, 1);
        g2d.fillRect(69 + x, 19 + y, 1, 1);
        g2d.fillRect(60 + x, 21 + y, 1, 1);
        g2d.fillRect(58 + x, 22 + y, 2, 1);
        g2d.fillRect(57 + x, 23 + y, 1, 1);
        g2d.fillRect(72 + x, 23 + y, 1, 1);
        g2d.fillRect(70 + x, 24 + y, 2, 1);
        g2d.fillRect(62 + x, 25 + y, 1, 1);
        g2d.fillRect(71 + x, 25 + y, 1, 1);
        g2d.fillRect(70 + x, 27 + y, 1, 1);
        g2d.fillRect(58 + x, 28 + y, 1, 1);
        g2d.fillRect(65 + x, 28 + y, 5, 1);
        g2d.fillRect(64 + x, 29 + y, 1, 1);
        g2d.fillRect(68 + x, 29 + y, 1, 2);
        g2d.fillRect(62 + x, 32 + y, 1, 1);
        g2d.fillRect(64 + x, 33 + y, 1, 2);
        g2d.fillRect(65 + x, 33 + y, 2, 1);
        g2d.fillRect(63 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(3 + x, 17 + y, 1, 2);
        g2d.fillRect(4 + x, 17 + y, 1, 1);
        g2d.fillRect(2 + x, 18 + y, 1, 1);
        g2d.fillRect(5 + x, 18 + y, 2, 1);
        g2d.fillRect(27 + x, 22 + y, 1, 1);
        g2d.fillRect(28 + x, 23 + y, 3, 1);
        g2d.fillRect(58 + x, 23 + y, 2, 1);
        g2d.fillRect(5 + x, 24 + y, 1, 2);
        g2d.fillRect(6 + x, 24 + y, 3, 1);
        g2d.fillRect(16 + x, 24 + y, 1, 1);
        g2d.fillRect(29 + x, 24 + y, 1, 1);
        g2d.fillRect(56 + x, 24 + y, 1, 2);
        g2d.fillRect(57 + x, 24 + y, 1, 1);
        g2d.fillRect(15 + x, 29 + y, 3, 1);
        g2d.fillRect(57 + x, 29 + y, 2, 1);
        g2d.fillRect(9 + x, 30 + y, 1, 2);
        g2d.fillRect(10 + x, 30 + y, 2, 1);
        g2d.fillRect(58 + x, 32 + y, 1, 1);
        g2d.fillRect(20 + x, 33 + y, 1, 1);
        g2d.fillRect(59 + x, 33 + y, 1, 1);
        g2d.fillRect(18 + x, 34 + y, 1, 1);
        g2d.fillRect(57 + x, 34 + y, 1, 1);
        g2d.fillRect(14 + x, 36 + y, 2, 1);
        g2d.fillRect(13 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(75 + x, 0 + y, 1, 1);
        g2d.fillRect(77 + x, 2 + y, 1, 1);
        g2d.fillRect(73 + x, 3 + y, 1, 3);
        g2d.fillRect(78 + x, 3 + y, 1, 2);
        g2d.fillRect(1 + x, 5 + y, 1, 1);
        g2d.fillRect(4 + x, 5 + y, 1, 1);
        g2d.fillRect(79 + x, 5 + y, 1, 5);
        g2d.fillRect(72 + x, 6 + y, 1, 2);
        g2d.fillRect(0 + x, 7 + y, 1, 2);
        g2d.fillRect(5 + x, 7 + y, 1, 1);
        g2d.fillRect(71 + x, 8 + y, 1, 2);
        g2d.fillRect(8 + x, 10 + y, 1, 1);
        g2d.fillRect(70 + x, 10 + y, 1, 2);
        g2d.fillRect(78 + x, 10 + y, 1, 2);
        g2d.fillRect(9 + x, 11 + y, 1, 1);
        g2d.fillRect(10 + x, 12 + y, 2, 1);
        g2d.fillRect(69 + x, 12 + y, 1, 1);
        g2d.fillRect(77 + x, 12 + y, 1, 1);
        g2d.fillRect(1 + x, 13 + y, 1, 1);
        g2d.fillRect(12 + x, 13 + y, 2, 1);
        g2d.fillRect(68 + x, 13 + y, 1, 1);
        g2d.fillRect(2 + x, 14 + y, 1, 1);
        g2d.fillRect(14 + x, 14 + y, 2, 1);
        g2d.fillRect(67 + x, 14 + y, 1, 1);
        g2d.fillRect(16 + x, 15 + y, 3, 1);
        g2d.fillRect(19 + x, 16 + y, 5, 1);
        g2d.fillRect(65 + x, 16 + y, 1, 1);
        g2d.fillRect(6 + x, 17 + y, 1, 1);
        g2d.fillRect(24 + x, 17 + y, 1, 1);
        g2d.fillRect(8 + x, 18 + y, 2, 1);
        g2d.fillRect(61 + x, 18 + y, 1, 1);
        g2d.fillRect(57 + x, 19 + y, 1, 1);
        g2d.fillRect(74 + x, 19 + y, 1, 2);
        g2d.fillRect(1 + x, 20 + y, 1, 1);
        g2d.fillRect(53 + x, 20 + y, 1, 1);
        g2d.fillRect(65 + x, 20 + y, 2, 1);
        g2d.fillRect(2 + x, 21 + y, 1, 2);
        g2d.fillRect(51 + x, 21 + y, 2, 1);
        g2d.fillRect(73 + x, 21 + y, 1, 2);
        g2d.fillRect(3 + x, 22 + y, 1, 1);
        g2d.fillRect(50 + x, 22 + y, 1, 1);
        g2d.fillRect(4 + x, 23 + y, 1, 1);
        g2d.fillRect(49 + x, 23 + y, 1, 1);
        g2d.fillRect(20 + x, 24 + y, 3, 1);
        g2d.fillRect(48 + x, 24 + y, 1, 2);
        g2d.fillRect(55 + x, 24 + y, 1, 1);
        g2d.fillRect(68 + x, 24 + y, 1, 2);
        g2d.fillRect(4 + x, 25 + y, 1, 2);
        g2d.fillRect(65 + x, 25 + y, 3, 1);
        g2d.fillRect(47 + x, 26 + y, 1, 6);
        g2d.fillRect(71 + x, 26 + y, 1, 1);
        g2d.fillRect(6 + x, 28 + y, 1, 1);
        g2d.fillRect(22 + x, 28 + y, 3, 1);
        g2d.fillRect(37 + x, 28 + y, 1, 6);
        g2d.fillRect(60 + x, 28 + y, 1, 1);
        g2d.fillRect(10 + x, 29 + y, 1, 1);
        g2d.fillRect(61 + x, 29 + y, 1, 1);
        g2d.fillRect(8 + x, 31 + y, 1, 2);
        g2d.fillRect(23 + x, 31 + y, 1, 1);
        g2d.fillRect(25 + x, 31 + y, 1, 1);
        g2d.fillRect(20 + x, 32 + y, 1, 1);
        g2d.fillRect(48 + x, 32 + y, 1, 2);
        g2d.fillRect(59 + x, 32 + y, 1, 1);
        g2d.fillRect(9 + x, 33 + y, 1, 1);
        g2d.fillRect(18 + x, 33 + y, 2, 1);
        g2d.fillRect(10 + x, 34 + y, 2, 1);
        g2d.fillRect(17 + x, 34 + y, 1, 1);
        g2d.fillRect(36 + x, 34 + y, 1, 2);
        g2d.fillRect(49 + x, 34 + y, 1, 1);
        g2d.fillRect(55 + x, 34 + y, 1, 1);
        g2d.fillRect(25 + x, 35 + y, 1, 2);
        g2d.fillRect(50 + x, 35 + y, 1, 1);
        g2d.fillRect(57 + x, 35 + y, 1, 1);
        g2d.fillRect(61 + x, 35 + y, 1, 1);
        g2d.fillRect(23 + x, 36 + y, 1, 1);
        g2d.fillRect(35 + x, 36 + y, 1, 1);
        g2d.fillRect(51 + x, 36 + y, 2, 1);
        g2d.fillRect(60 + x, 36 + y, 1, 1);
        g2d.fillRect(12 + x, 37 + y, 1, 3);
        g2d.fillRect(34 + x, 37 + y, 1, 1);
        g2d.fillRect(53 + x, 37 + y, 6, 1);
        g2d.fillRect(33 + x, 38 + y, 1, 1);
        g2d.fillRect(30 + x, 39 + y, 3, 1);
        g2d.fillRect(13 + x, 40 + y, 2, 1);
        g2d.fillRect(18 + x, 40 + y, 1, 1);
        g2d.fillRect(15 + x, 41 + y, 3, 1);
        g2d.fillRect(20 + x, 42 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_5));
        g2d.fillRect(3 + x, 16 + y, 1, 1);
        g2d.fillRect(5 + x, 17 + y, 1, 1);
        g2d.fillRect(7 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(74 + x, 0 + y, 1, 3);
        g2d.fillRect(76 + x, 1 + y, 1, 1);
        g2d.fillRect(3 + x, 3 + y, 2, 1);
        g2d.fillRect(1 + x, 4 + y, 2, 1);
        g2d.fillRect(4 + x, 4 + y, 1, 1);
        g2d.fillRect(0 + x, 6 + y, 1, 1);
        g2d.fillRect(5 + x, 6 + y, 1, 1);
        g2d.fillRect(6 + x, 8 + y, 1, 1);
        g2d.fillRect(0 + x, 9 + y, 1, 2);
        g2d.fillRect(7 + x, 9 + y, 1, 1);
        g2d.fillRect(1 + x, 11 + y, 1, 2);
        g2d.fillRect(77 + x, 13 + y, 1, 1);
        g2d.fillRect(2 + x, 17 + y, 1, 1);
        g2d.fillRect(25 + x, 17 + y, 1, 1);
        g2d.fillRect(72 + x, 17 + y, 1, 1);
        g2d.fillRect(1 + x, 18 + y, 1, 2);
        g2d.fillRect(26 + x, 18 + y, 2, 1);
        g2d.fillRect(70 + x, 18 + y, 1, 1);
        g2d.fillRect(74 + x, 18 + y, 1, 1);
        g2d.fillRect(14 + x, 19 + y, 2, 1);
        g2d.fillRect(28 + x, 19 + y, 2, 1);
        g2d.fillRect(67 + x, 19 + y, 2, 1);
        g2d.fillRect(19 + x, 20 + y, 3, 1);
        g2d.fillRect(30 + x, 20 + y, 2, 1);
        g2d.fillRect(63 + x, 20 + y, 2, 1);
        g2d.fillRect(22 + x, 21 + y, 3, 1);
        g2d.fillRect(32 + x, 21 + y, 1, 1);
        g2d.fillRect(61 + x, 21 + y, 2, 1);
        g2d.fillRect(25 + x, 22 + y, 2, 1);
        g2d.fillRect(33 + x, 22 + y, 1, 1);
        g2d.fillRect(5 + x, 23 + y, 12, 1);
        g2d.fillRect(27 + x, 23 + y, 1, 1);
        g2d.fillRect(34 + x, 23 + y, 1, 1);
        g2d.fillRect(55 + x, 23 + y, 2, 1);
        g2d.fillRect(17 + x, 24 + y, 3, 1);
        g2d.fillRect(28 + x, 24 + y, 1, 1);
        g2d.fillRect(35 + x, 24 + y, 1, 2);
        g2d.fillRect(53 + x, 24 + y, 2, 1);
        g2d.fillRect(69 + x, 24 + y, 1, 1);
        g2d.fillRect(31 + x, 25 + y, 1, 1);
        g2d.fillRect(51 + x, 25 + y, 2, 1);
        g2d.fillRect(63 + x, 25 + y, 2, 1);
        g2d.fillRect(32 + x, 26 + y, 1, 1);
        g2d.fillRect(36 + x, 26 + y, 1, 2);
        g2d.fillRect(50 + x, 26 + y, 1, 1);
        g2d.fillRect(5 + x, 27 + y, 1, 1);
        g2d.fillRect(33 + x, 27 + y, 1, 1);
        g2d.fillRect(49 + x, 27 + y, 1, 4);
        g2d.fillRect(7 + x, 28 + y, 1, 1);
        g2d.fillRect(15 + x, 28 + y, 7, 1);
        g2d.fillRect(34 + x, 28 + y, 1, 2);
        g2d.fillRect(59 + x, 28 + y, 1, 1);
        g2d.fillRect(8 + x, 29 + y, 2, 1);
        g2d.fillRect(11 + x, 29 + y, 4, 1);
        g2d.fillRect(62 + x, 29 + y, 2, 1);
        g2d.fillRect(35 + x, 30 + y, 1, 3);
        g2d.fillRect(24 + x, 31 + y, 1, 1);
        g2d.fillRect(68 + x, 31 + y, 1, 1);
        g2d.fillRect(21 + x, 32 + y, 2, 1);
        g2d.fillRect(60 + x, 32 + y, 2, 1);
        g2d.fillRect(67 + x, 32 + y, 1, 1);
        g2d.fillRect(63 + x, 33 + y, 1, 1);
        g2d.fillRect(16 + x, 34 + y, 1, 1);
        g2d.fillRect(12 + x, 35 + y, 4, 1);
        g2d.fillRect(26 + x, 35 + y, 1, 1);
        g2d.fillRect(62 + x, 35 + y, 1, 1);
        g2d.fillRect(13 + x, 36 + y, 1, 1);
        g2d.fillRect(24 + x, 36 + y, 1, 1);
        g2d.fillRect(58 + x, 36 + y, 2, 1);
        g2d.fillRect(21 + x, 37 + y, 2, 1);
        g2d.fillRect(20 + x, 38 + y, 1, 1);
        g2d.fillRect(19 + x, 39 + y, 1, 2);
        g2d.fillRect(26 + x, 40 + y, 4, 1);
        g2d.fillRect(20 + x, 41 + y, 1, 1);
        g2d.fillRect(23 + x, 41 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(4 + x, 16 + y, 1, 1);
        g2d.fillRect(10 + x, 19 + y, 4, 1);
        g2d.fillRect(16 + x, 20 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(75 + x, 1 + y, 1, 1);
        g2d.fillRect(76 + x, 2 + y, 1, 1);
        g2d.fillRect(77 + x, 3 + y, 1, 1);
        g2d.fillRect(78 + x, 5 + y, 1, 5);
        g2d.fillRect(77 + x, 10 + y, 1, 2);
        g2d.fillRect(76 + x, 12 + y, 1, 2);
        g2d.fillRect(75 + x, 13 + y, 1, 2);
        g2d.fillRect(74 + x, 14 + y, 1, 2);
        g2d.fillRect(73 + x, 15 + y, 1, 2);
        g2d.fillRect(66 + x, 16 + y, 1, 1);
        g2d.fillRect(72 + x, 16 + y, 1, 1);
        g2d.fillRect(64 + x, 17 + y, 1, 1);
        g2d.fillRect(70 + x, 17 + y, 2, 1);
        g2d.fillRect(4 + x, 18 + y, 1, 1);
        g2d.fillRect(62 + x, 18 + y, 1, 1);
        g2d.fillRect(67 + x, 18 + y, 3, 1);
        g2d.fillRect(72 + x, 18 + y, 2, 1);
        g2d.fillRect(2 + x, 19 + y, 1, 1);
        g2d.fillRect(6 + x, 19 + y, 4, 1);
        g2d.fillRect(56 + x, 19 + y, 1, 2);
        g2d.fillRect(59 + x, 19 + y, 1, 2);
        g2d.fillRect(60 + x, 19 + y, 1, 2);
        g2d.fillRect(63 + x, 19 + y, 4, 1);
        g2d.fillRect(70 + x, 19 + y, 2, 1);
        g2d.fillRect(73 + x, 19 + y, 1, 2);
        g2d.fillRect(11 + x, 20 + y, 5, 1);
        g2d.fillRect(54 + x, 20 + y, 2, 1);
        g2d.fillRect(57 + x, 20 + y, 1, 3);
        g2d.fillRect(61 + x, 20 + y, 2, 1);
        g2d.fillRect(67 + x, 20 + y, 3, 1);
        g2d.fillRect(18 + x, 21 + y, 4, 1);
        g2d.fillRect(53 + x, 21 + y, 1, 3);
        g2d.fillRect(58 + x, 21 + y, 1, 1);
        g2d.fillRect(63 + x, 21 + y, 3, 1);
        g2d.fillRect(23 + x, 22 + y, 2, 1);
        g2d.fillRect(51 + x, 22 + y, 1, 3);
        g2d.fillRect(52 + x, 22 + y, 1, 3);
        g2d.fillRect(54 + x, 22 + y, 1, 2);
        g2d.fillRect(56 + x, 22 + y, 1, 1);
        g2d.fillRect(60 + x, 22 + y, 2, 1);
        g2d.fillRect(72 + x, 22 + y, 1, 1);
        g2d.fillRect(25 + x, 23 + y, 2, 1);
        g2d.fillRect(50 + x, 23 + y, 1, 3);
        g2d.fillRect(9 + x, 24 + y, 7, 1);
        g2d.fillRect(27 + x, 24 + y, 1, 1);
        g2d.fillRect(31 + x, 24 + y, 1, 1);
        g2d.fillRect(49 + x, 24 + y, 1, 3);
        g2d.fillRect(6 + x, 25 + y, 1, 1);
        g2d.fillRect(12 + x, 25 + y, 11, 1);
        g2d.fillRect(29 + x, 25 + y, 1, 2);
        g2d.fillRect(30 + x, 25 + y, 1, 4);
        g2d.fillRect(32 + x, 25 + y, 1, 1);
        g2d.fillRect(53 + x, 25 + y, 1, 12);
        g2d.fillRect(54 + x, 25 + y, 1, 12);
        g2d.fillRect(55 + x, 25 + y, 1, 1);
        g2d.fillRect(57 + x, 25 + y, 1, 2);
        g2d.fillRect(58 + x, 25 + y, 3, 1);
        g2d.fillRect(69 + x, 25 + y, 2, 1);
        g2d.fillRect(5 + x, 26 + y, 1, 1);
        g2d.fillRect(31 + x, 26 + y, 1, 13);
        g2d.fillRect(33 + x, 26 + y, 1, 1);
        g2d.fillRect(48 + x, 26 + y, 1, 6);
        g2d.fillRect(51 + x, 26 + y, 1, 10);
        g2d.fillRect(52 + x, 26 + y, 1, 10);
        g2d.fillRect(56 + x, 26 + y, 1, 1);
        g2d.fillRect(61 + x, 26 + y, 8, 1);
        g2d.fillRect(6 + x, 27 + y, 1, 1);
        g2d.fillRect(32 + x, 27 + y, 1, 12);
        g2d.fillRect(34 + x, 27 + y, 1, 1);
        g2d.fillRect(50 + x, 27 + y, 1, 8);
        g2d.fillRect(55 + x, 27 + y, 1, 7);
        g2d.fillRect(33 + x, 28 + y, 1, 10);
        g2d.fillRect(35 + x, 28 + y, 1, 2);
        g2d.fillRect(36 + x, 28 + y, 1, 6);
        g2d.fillRect(18 + x, 29 + y, 1, 1);
        g2d.fillRect(56 + x, 29 + y, 1, 4);
        g2d.fillRect(59 + x, 29 + y, 2, 1);
        g2d.fillRect(65 + x, 29 + y, 1, 2);
        g2d.fillRect(66 + x, 29 + y, 1, 2);
        g2d.fillRect(67 + x, 29 + y, 1, 3);
        g2d.fillRect(12 + x, 30 + y, 3, 1);
        g2d.fillRect(34 + x, 30 + y, 1, 7);
        g2d.fillRect(57 + x, 30 + y, 1, 2);
        g2d.fillRect(62 + x, 30 + y, 3, 1);
        g2d.fillRect(10 + x, 31 + y, 1, 1);
        g2d.fillRect(49 + x, 31 + y, 1, 3);
        g2d.fillRect(58 + x, 31 + y, 2, 1);
        g2d.fillRect(30 + x, 33 + y, 1, 6);
        g2d.fillRect(35 + x, 33 + y, 1, 3);
        g2d.fillRect(58 + x, 33 + y, 1, 3);
        g2d.fillRect(60 + x, 33 + y, 3, 1);
        g2d.fillRect(62 + x, 34 + y, 2, 1);
        g2d.fillRect(27 + x, 35 + y, 1, 5);
        g2d.fillRect(29 + x, 35 + y, 1, 5);
        g2d.fillRect(55 + x, 35 + y, 1, 2);
        g2d.fillRect(56 + x, 35 + y, 1, 2);
        g2d.fillRect(26 + x, 36 + y, 1, 4);
        g2d.fillRect(28 + x, 36 + y, 1, 4);
        g2d.fillRect(14 + x, 37 + y, 1, 1);
        g2d.fillRect(23 + x, 37 + y, 3, 1);
        g2d.fillRect(24 + x, 38 + y, 1, 3);
        g2d.fillRect(25 + x, 38 + y, 1, 3);
        g2d.fillRect(23 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(3 + x, 4 + y, 1, 1);
        g2d.fillRect(2 + x, 5 + y, 1, 1);
        g2d.fillRect(1 + x, 6 + y, 1, 5);
        g2d.fillRect(2 + x, 12 + y, 1, 2);
        g2d.fillRect(9 + x, 12 + y, 1, 1);
        g2d.fillRect(11 + x, 13 + y, 1, 1);
        g2d.fillRect(3 + x, 14 + y, 1, 2);
        g2d.fillRect(13 + x, 14 + y, 1, 1);
        g2d.fillRect(4 + x, 15 + y, 1, 1);
        g2d.fillRect(15 + x, 15 + y, 1, 1);
        g2d.fillRect(5 + x, 16 + y, 2, 1);
        g2d.fillRect(18 + x, 16 + y, 1, 1);
        g2d.fillRect(7 + x, 17 + y, 3, 1);
        g2d.fillRect(22 + x, 17 + y, 2, 1);
        g2d.fillRect(10 + x, 18 + y, 6, 1);
        g2d.fillRect(25 + x, 18 + y, 1, 1);
        g2d.fillRect(16 + x, 19 + y, 6, 1);
        g2d.fillRect(27 + x, 19 + y, 1, 1);
        g2d.fillRect(22 + x, 20 + y, 1, 1);
        g2d.fillRect(29 + x, 20 + y, 1, 1);
        g2d.fillRect(25 + x, 21 + y, 1, 1);
        g2d.fillRect(31 + x, 21 + y, 1, 1);
        g2d.fillRect(30 + x, 24 + y, 1, 1);
        g2d.fillRect(23 + x, 32 + y, 1, 1);
        g2d.fillRect(21 + x, 33 + y, 2, 1);
        g2d.fillRect(19 + x, 34 + y, 2, 1);
        g2d.fillRect(16 + x, 35 + y, 3, 1);
        g2d.fillRect(13 + x, 38 + y, 1, 2);
        g2d.fillRect(21 + x, 38 + y, 3, 1);
        g2d.fillRect(20 + x, 39 + y, 1, 1);
        g2d.fillRect(23 + x, 39 + y, 1, 1);
        g2d.fillRect(15 + x, 40 + y, 2, 1);
        g2d.fillRect(22 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(75 + x, 2 + y, 1, 2);
        g2d.fillRect(74 + x, 3 + y, 1, 3);
        g2d.fillRect(76 + x, 3 + y, 1, 1);
        g2d.fillRect(77 + x, 4 + y, 1, 1);
        g2d.fillRect(73 + x, 6 + y, 1, 2);
        g2d.fillRect(72 + x, 8 + y, 1, 1);
        g2d.fillRect(71 + x, 10 + y, 1, 1);
        g2d.fillRect(70 + x, 12 + y, 1, 1);
        g2d.fillRect(69 + x, 13 + y, 1, 1);
        g2d.fillRect(68 + x, 14 + y, 1, 1);
        g2d.fillRect(67 + x, 15 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(54 + x, 21 + y, 3, 1);
        g2d.fillRect(55 + x, 22 + y, 1, 1);
        g2d.fillRect(55 + x, 26 + y, 1, 1);
        g2d.fillRect(56 + x, 27 + y, 1, 2);
        g2d.fillRect(57 + x, 32 + y, 1, 2);
        g2d.fillRect(56 + x, 33 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(2 + x, 15 + y, 1, 1);
        g2d.fillRect(25 + x, 28 + y, 2, 1);
        g2d.fillRect(22 + x, 29 + y, 3, 1);
        g2d.fillRect(27 + x, 29 + y, 2, 1);
        g2d.fillRect(26 + x, 30 + y, 1, 5);
        g2d.fillRect(28 + x, 30 + y, 1, 1);
        g2d.fillRect(27 + x, 31 + y, 1, 3);
        g2d.fillRect(25 + x, 32 + y, 1, 1);
        g2d.fillRect(25 + x, 34 + y, 1, 1);
        g2d.fillRect(57 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(76 + x, 4 + y, 1, 1);
        g2d.fillRect(3 + x, 5 + y, 1, 4);
        g2d.fillRect(77 + x, 5 + y, 1, 5);
        g2d.fillRect(2 + x, 6 + y, 1, 6);
        g2d.fillRect(4 + x, 6 + y, 1, 2);
        g2d.fillRect(74 + x, 6 + y, 1, 1);
        g2d.fillRect(5 + x, 8 + y, 1, 1);
        g2d.fillRect(73 + x, 8 + y, 1, 1);
        g2d.fillRect(6 + x, 9 + y, 1, 1);
        g2d.fillRect(72 + x, 9 + y, 1, 1);
        g2d.fillRect(7 + x, 10 + y, 1, 1);
        g2d.fillRect(76 + x, 10 + y, 1, 2);
        g2d.fillRect(3 + x, 11 + y, 1, 3);
        g2d.fillRect(8 + x, 11 + y, 1, 1);
        g2d.fillRect(71 + x, 11 + y, 1, 1);
        g2d.fillRect(75 + x, 12 + y, 1, 1);
        g2d.fillRect(4 + x, 13 + y, 1, 2);
        g2d.fillRect(10 + x, 13 + y, 1, 1);
        g2d.fillRect(74 + x, 13 + y, 1, 1);
        g2d.fillRect(5 + x, 14 + y, 1, 2);
        g2d.fillRect(12 + x, 14 + y, 1, 1);
        g2d.fillRect(72 + x, 14 + y, 1, 2);
        g2d.fillRect(73 + x, 14 + y, 1, 1);
        g2d.fillRect(6 + x, 15 + y, 1, 1);
        g2d.fillRect(14 + x, 15 + y, 1, 1);
        g2d.fillRect(70 + x, 15 + y, 1, 2);
        g2d.fillRect(71 + x, 15 + y, 1, 2);
        g2d.fillRect(7 + x, 16 + y, 3, 1);
        g2d.fillRect(16 + x, 16 + y, 2, 1);
        g2d.fillRect(68 + x, 16 + y, 1, 2);
        g2d.fillRect(69 + x, 16 + y, 1, 2);
        g2d.fillRect(10 + x, 17 + y, 6, 1);
        g2d.fillRect(19 + x, 17 + y, 3, 1);
        g2d.fillRect(65 + x, 17 + y, 1, 2);
        g2d.fillRect(66 + x, 17 + y, 1, 2);
        g2d.fillRect(67 + x, 17 + y, 1, 1);
        g2d.fillRect(16 + x, 18 + y, 3, 1);
        g2d.fillRect(24 + x, 18 + y, 1, 1);
        g2d.fillRect(63 + x, 18 + y, 2, 1);
        g2d.fillRect(3 + x, 19 + y, 3, 1);
        g2d.fillRect(22 + x, 19 + y, 1, 1);
        g2d.fillRect(26 + x, 19 + y, 1, 1);
        g2d.fillRect(61 + x, 19 + y, 2, 1);
        g2d.fillRect(72 + x, 19 + y, 1, 3);
        g2d.fillRect(2 + x, 20 + y, 1, 1);
        g2d.fillRect(6 + x, 20 + y, 5, 1);
        g2d.fillRect(23 + x, 20 + y, 3, 1);
        g2d.fillRect(28 + x, 20 + y, 1, 1);
        g2d.fillRect(58 + x, 20 + y, 1, 1);
        g2d.fillRect(70 + x, 20 + y, 1, 2);
        g2d.fillRect(71 + x, 20 + y, 1, 4);
        g2d.fillRect(3 + x, 21 + y, 1, 1);
        g2d.fillRect(17 + x, 21 + y, 1, 1);
        g2d.fillRect(26 + x, 21 + y, 2, 1);
        g2d.fillRect(59 + x, 21 + y, 1, 1);
        g2d.fillRect(66 + x, 21 + y, 1, 2);
        g2d.fillRect(67 + x, 21 + y, 3, 1);
        g2d.fillRect(4 + x, 22 + y, 13, 1);
        g2d.fillRect(28 + x, 22 + y, 3, 1);
        g2d.fillRect(32 + x, 22 + y, 1, 1);
        g2d.fillRect(62 + x, 22 + y, 1, 2);
        g2d.fillRect(63 + x, 22 + y, 3, 1);
        g2d.fillRect(17 + x, 23 + y, 6, 1);
        g2d.fillRect(24 + x, 23 + y, 1, 1);
        g2d.fillRect(31 + x, 23 + y, 1, 1);
        g2d.fillRect(33 + x, 23 + y, 1, 1);
        g2d.fillRect(60 + x, 23 + y, 2, 1);
        g2d.fillRect(69 + x, 23 + y, 2, 1);
        g2d.fillRect(23 + x, 24 + y, 1, 2);
        g2d.fillRect(26 + x, 24 + y, 1, 1);
        g2d.fillRect(32 + x, 24 + y, 1, 1);
        g2d.fillRect(34 + x, 24 + y, 1, 1);
        g2d.fillRect(58 + x, 24 + y, 1, 1);
        g2d.fillRect(7 + x, 25 + y, 5, 1);
        g2d.fillRect(28 + x, 25 + y, 1, 2);
        g2d.fillRect(33 + x, 25 + y, 1, 1);
        g2d.fillRect(61 + x, 25 + y, 1, 1);
        g2d.fillRect(34 + x, 26 + y, 1, 1);
        g2d.fillRect(58 + x, 26 + y, 1, 2);
        g2d.fillRect(59 + x, 26 + y, 2, 1);
        g2d.fillRect(69 + x, 26 + y, 1, 1);
        g2d.fillRect(7 + x, 27 + y, 2, 1);
        g2d.fillRect(14 + x, 27 + y, 1, 2);
        g2d.fillRect(15 + x, 27 + y, 11, 1);
        g2d.fillRect(29 + x, 27 + y, 1, 8);
        g2d.fillRect(35 + x, 27 + y, 1, 1);
        g2d.fillRect(57 + x, 27 + y, 1, 1);
        g2d.fillRect(8 + x, 28 + y, 6, 1);
        g2d.fillRect(27 + x, 28 + y, 2, 1);
        g2d.fillRect(61 + x, 28 + y, 4, 1);
        g2d.fillRect(19 + x, 29 + y, 1, 2);
        g2d.fillRect(20 + x, 29 + y, 2, 1);
        g2d.fillRect(25 + x, 29 + y, 2, 1);
        g2d.fillRect(30 + x, 29 + y, 1, 4);
        g2d.fillRect(15 + x, 30 + y, 4, 1);
        g2d.fillRect(27 + x, 30 + y, 1, 1);
        g2d.fillRect(61 + x, 30 + y, 1, 1);
        g2d.fillRect(11 + x, 31 + y, 3, 1);
        g2d.fillRect(20 + x, 31 + y, 3, 1);
        g2d.fillRect(28 + x, 31 + y, 1, 5);
        g2d.fillRect(65 + x, 31 + y, 2, 1);
        g2d.fillRect(9 + x, 32 + y, 1, 1);
        g2d.fillRect(18 + x, 32 + y, 2, 1);
        g2d.fillRect(24 + x, 32 + y, 1, 4);
        g2d.fillRect(66 + x, 32 + y, 1, 1);
        g2d.fillRect(10 + x, 33 + y, 2, 1);
        g2d.fillRect(16 + x, 33 + y, 2, 1);
        g2d.fillRect(23 + x, 33 + y, 1, 1);
        g2d.fillRect(25 + x, 33 + y, 1, 1);
        g2d.fillRect(12 + x, 34 + y, 4, 1);
        g2d.fillRect(21 + x, 34 + y, 1, 1);
        g2d.fillRect(27 + x, 34 + y, 1, 1);
        g2d.fillRect(61 + x, 34 + y, 1, 1);
        g2d.fillRect(19 + x, 35 + y, 1, 1);
        g2d.fillRect(23 + x, 35 + y, 1, 1);
        g2d.fillRect(59 + x, 35 + y, 1, 1);
        g2d.fillRect(16 + x, 36 + y, 2, 1);
        g2d.fillRect(21 + x, 36 + y, 2, 1);
        g2d.fillRect(15 + x, 37 + y, 1, 1);
        g2d.fillRect(19 + x, 37 + y, 1, 2);
        g2d.fillRect(20 + x, 37 + y, 1, 1);
        g2d.fillRect(14 + x, 38 + y, 1, 2);
        g2d.fillRect(18 + x, 38 + y, 1, 2);
        g2d.fillRect(15 + x, 39 + y, 3, 1);
        g2d.fillRect(21 + x, 39 + y, 1, 1);
        g2d.fillRect(17 + x, 40 + y, 1, 1);
        g2d.fillRect(20 + x, 40 + y, 1, 1);
        g2d.fillRect(21 + x, 41 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(4 + x, 8 + y, 1, 5);
        g2d.fillRect(3 + x, 9 + y, 1, 2);
        g2d.fillRect(5 + x, 13 + y, 1, 1);
        g2d.fillRect(6 + x, 14 + y, 1, 1);
        g2d.fillRect(7 + x, 15 + y, 3, 1);
        g2d.fillRect(10 + x, 16 + y, 4, 1);
        g2d.fillRect(25 + x, 24 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(75 + x, 4 + y, 1, 2);
        g2d.fillRect(76 + x, 5 + y, 1, 2);
        g2d.fillRect(74 + x, 7 + y, 1, 2);
        g2d.fillRect(76 + x, 8 + y, 1, 2);
        g2d.fillRect(73 + x, 9 + y, 1, 1);
        g2d.fillRect(72 + x, 10 + y, 1, 1);
        g2d.fillRect(75 + x, 10 + y, 1, 2);
        g2d.fillRect(71 + x, 12 + y, 1, 1);
        g2d.fillRect(74 + x, 12 + y, 1, 1);
        g2d.fillRect(70 + x, 13 + y, 1, 1);
        g2d.fillRect(73 + x, 13 + y, 1, 1);
        g2d.fillRect(69 + x, 14 + y, 1, 2);
        g2d.fillRect(71 + x, 14 + y, 1, 1);
        g2d.fillRect(68 + x, 15 + y, 1, 1);
        g2d.fillRect(67 + x, 16 + y, 1, 1);
        g2d.fillRect(67 + x, 22 + y, 1, 3);
        g2d.fillRect(68 + x, 22 + y, 1, 1);
        g2d.fillRect(63 + x, 23 + y, 4, 1);
        g2d.fillRect(59 + x, 24 + y, 2, 1);
        g2d.fillRect(66 + x, 24 + y, 1, 1);
        g2d.fillRect(70 + x, 26 + y, 1, 1);
        g2d.fillRect(59 + x, 27 + y, 4, 1);
        g2d.fillRect(69 + x, 27 + y, 1, 1);
        g2d.fillRect(57 + x, 28 + y, 1, 1);
        g2d.fillRect(60 + x, 30 + y, 1, 1);
        g2d.fillRect(64 + x, 31 + y, 1, 2);
        g2d.fillRect(63 + x, 32 + y, 1, 1);
        g2d.fillRect(65 + x, 32 + y, 1, 1);
        g2d.fillRect(59 + x, 34 + y, 2, 1);
        g2d.fillRect(60 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(5 + x, 9 + y, 1, 1);
        g2d.fillRect(6 + x, 10 + y, 1, 1);
        g2d.fillRect(7 + x, 11 + y, 1, 1);
        g2d.fillRect(5 + x, 12 + y, 1, 1);
        g2d.fillRect(8 + x, 12 + y, 1, 1);
        g2d.fillRect(6 + x, 13 + y, 1, 1);
        g2d.fillRect(7 + x, 14 + y, 2, 1);
        g2d.fillRect(10 + x, 15 + y, 1, 1);
        g2d.fillRect(13 + x, 15 + y, 1, 1);
        g2d.fillRect(15 + x, 16 + y, 1, 1);
        g2d.fillRect(17 + x, 17 + y, 2, 1);
        g2d.fillRect(23 + x, 19 + y, 1, 1);
        g2d.fillRect(3 + x, 20 + y, 1, 1);
        g2d.fillRect(5 + x, 20 + y, 1, 1);
        g2d.fillRect(26 + x, 20 + y, 2, 1);
        g2d.fillRect(4 + x, 21 + y, 1, 1);
        g2d.fillRect(11 + x, 21 + y, 6, 1);
        g2d.fillRect(28 + x, 21 + y, 3, 1);
        g2d.fillRect(17 + x, 22 + y, 1, 1);
        g2d.fillRect(31 + x, 22 + y, 1, 1);
        g2d.fillRect(23 + x, 23 + y, 1, 1);
        g2d.fillRect(24 + x, 24 + y, 1, 2);
        g2d.fillRect(25 + x, 25 + y, 3, 1);
        g2d.fillRect(6 + x, 26 + y, 1, 1);
        g2d.fillRect(9 + x, 26 + y, 3, 1);
        g2d.fillRect(13 + x, 26 + y, 1, 2);
        g2d.fillRect(14 + x, 26 + y, 7, 1);
        g2d.fillRect(26 + x, 26 + y, 1, 2);
        g2d.fillRect(27 + x, 26 + y, 1, 2);
        g2d.fillRect(12 + x, 27 + y, 1, 1);
        g2d.fillRect(28 + x, 27 + y, 1, 1);
        g2d.fillRect(20 + x, 30 + y, 5, 1);
        g2d.fillRect(14 + x, 31 + y, 1, 2);
        g2d.fillRect(15 + x, 31 + y, 5, 1);
        g2d.fillRect(10 + x, 32 + y, 2, 1);
        g2d.fillRect(13 + x, 32 + y, 1, 2);
        g2d.fillRect(17 + x, 32 + y, 1, 1);
        g2d.fillRect(12 + x, 33 + y, 1, 1);
        g2d.fillRect(15 + x, 33 + y, 1, 1);
        g2d.fillRect(22 + x, 34 + y, 1, 2);
        g2d.fillRect(23 + x, 34 + y, 1, 1);
        g2d.fillRect(20 + x, 35 + y, 1, 2);
        g2d.fillRect(21 + x, 35 + y, 1, 1);
        g2d.fillRect(18 + x, 36 + y, 1, 2);
        g2d.fillRect(19 + x, 36 + y, 1, 1);
        g2d.fillRect(16 + x, 37 + y, 1, 2);
        g2d.fillRect(17 + x, 37 + y, 1, 2);
        g2d.fillRect(15 + x, 38 + y, 1, 1);
        g2d.fillRect(22 + x, 39 + y, 1, 1);
        g2d.fillRect(21 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(32 + x, 23 + y, 1, 1);
        g2d.fillRect(33 + x, 24 + y, 1, 1);
        g2d.fillRect(34 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(76 + x, 7 + y, 1, 1);
        g2d.fillRect(74 + x, 11 + y, 1, 1);
        g2d.fillRect(73 + x, 12 + y, 1, 1);
        g2d.fillRect(72 + x, 13 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(75 + x, 6 + y, 1, 4);
        g2d.fillRect(74 + x, 9 + y, 1, 2);
        g2d.fillRect(5 + x, 10 + y, 1, 2);
        g2d.fillRect(73 + x, 10 + y, 1, 2);
        g2d.fillRect(6 + x, 11 + y, 1, 2);
        g2d.fillRect(72 + x, 11 + y, 1, 2);
        g2d.fillRect(7 + x, 12 + y, 1, 2);
        g2d.fillRect(8 + x, 13 + y, 2, 1);
        g2d.fillRect(71 + x, 13 + y, 1, 1);
        g2d.fillRect(9 + x, 14 + y, 3, 1);
        g2d.fillRect(70 + x, 14 + y, 1, 1);
        g2d.fillRect(11 + x, 15 + y, 2, 1);
        g2d.fillRect(14 + x, 16 + y, 1, 1);
        g2d.fillRect(16 + x, 17 + y, 1, 1);
        g2d.fillRect(19 + x, 18 + y, 5, 1);
        g2d.fillRect(24 + x, 19 + y, 2, 1);
        g2d.fillRect(4 + x, 20 + y, 1, 1);
        g2d.fillRect(5 + x, 21 + y, 6, 1);
        g2d.fillRect(18 + x, 22 + y, 5, 1);
        g2d.fillRect(69 + x, 22 + y, 2, 1);
        g2d.fillRect(68 + x, 23 + y, 1, 1);
        g2d.fillRect(61 + x, 24 + y, 5, 1);
        g2d.fillRect(7 + x, 26 + y, 2, 1);
        g2d.fillRect(12 + x, 26 + y, 1, 1);
        g2d.fillRect(21 + x, 26 + y, 5, 1);
        g2d.fillRect(35 + x, 26 + y, 1, 1);
        g2d.fillRect(9 + x, 27 + y, 3, 1);
        g2d.fillRect(63 + x, 27 + y, 6, 1);
        g2d.fillRect(25 + x, 30 + y, 1, 1);
        g2d.fillRect(58 + x, 30 + y, 2, 1);
        g2d.fillRect(60 + x, 31 + y, 4, 1);
        g2d.fillRect(12 + x, 32 + y, 1, 1);
        g2d.fillRect(15 + x, 32 + y, 2, 1);
        g2d.fillRect(14 + x, 33 + y, 1, 1);
    }
}
