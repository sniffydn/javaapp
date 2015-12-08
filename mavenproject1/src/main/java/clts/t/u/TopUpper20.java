/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u;

import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class TopUpper20 extends clts.SuperTU
{
    public TopUpper20()
    {
        super();
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper20(String middle)
    {
        super(middle, 3);
        swim = true;
    }

    public TopUpper20(String middle, int layer)
    {
        super(middle, layer);
        swim = true;
    }

    public TopUpper20(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        swim = true;
    }

    public TopUpper20(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        swim = true;
    }
    public TopUpper20(String middle, Piece p)
    {
        super(middle, 3);
        swim = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 12);
        g2d.fillRect(112 + x, 40 + y, 3, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 2, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 41 + y, 1, 7);
        g2d.fillRect(104 + x, 41 + y, 1, 13);
        g2d.fillRect(113 + x, 41 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 5);
        g2d.fillRect(115 + x, 41 + y, 1, 14);
        g2d.fillRect(116 + x, 42 + y, 1, 10);
        g2d.fillRect(101 + x, 43 + y, 1, 6);
        g2d.fillRect(105 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 6);
        g2d.fillRect(118 + x, 44 + y, 1, 6);
        g2d.fillRect(100 + x, 45 + y, 1, 7);
        g2d.fillRect(119 + x, 45 + y, 1, 7);
        g2d.fillRect(99 + x, 46 + y, 1, 16);
        g2d.fillRect(120 + x, 46 + y, 1, 17);
        g2d.fillRect(121 + x, 46 + y, 1, 16);
        g2d.fillRect(98 + x, 47 + y, 1, 14);
        g2d.fillRect(122 + x, 47 + y, 1, 14);
        g2d.fillRect(97 + x, 48 + y, 1, 12);
        g2d.fillRect(123 + x, 48 + y, 1, 12);
        g2d.fillRect(96 + x, 49 + y, 1, 10);
        g2d.fillRect(124 + x, 49 + y, 1, 10);
        g2d.fillRect(95 + x, 50 + y, 1, 7);
        g2d.fillRect(105 + x, 51 + y, 1, 5);
        g2d.fillRect(125 + x, 51 + y, 1, 6);
        g2d.fillRect(114 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 54 + y, 1, 9);
        g2d.fillRect(113 + x, 55 + y, 1, 7);
        g2d.fillRect(107 + x, 56 + y, 1, 6);
        g2d.fillRect(112 + x, 56 + y, 1, 5);
        g2d.fillRect(119 + x, 56 + y, 1, 7);
        g2d.fillRect(100 + x, 57 + y, 1, 5);
        g2d.fillRect(101 + x, 58 + y, 1, 5);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 4);
        g2d.fillRect(118 + x, 58 + y, 1, 5);
        g2d.fillRect(102 + x, 59 + y, 1, 4);
        g2d.fillRect(103 + x, 59 + y, 1, 4);
        g2d.fillRect(104 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 59 + y, 1, 4);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 4);
        g2d.fillRect(116 + x, 59 + y, 1, 4);
        g2d.fillRect(117 + x, 59 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 48 + y, 1, 11);
        g2d.fillRect(101 + x, 49 + y, 1, 9);
        g2d.fillRect(117 + x, 49 + y, 1, 10);
        g2d.fillRect(118 + x, 50 + y, 1, 8);
        g2d.fillRect(103 + x, 51 + y, 1, 8);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(116 + x, 52 + y, 1, 7);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 54 + y, 1, 5);
        g2d.fillRect(115 + x, 55 + y, 1, 4);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(107 + x, 45 + y, 5, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(108 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
    }





    public void drawB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 41 + y, 1, 7);
        g2d.fillRect(104 + x, 41 + y, 1, 13);
        g2d.fillRect(113 + x, 41 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 5);
        g2d.fillRect(115 + x, 41 + y, 1, 14);
        g2d.fillRect(105 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 5);
        g2d.fillRect(116 + x, 44 + y, 1, 8);
        g2d.fillRect(100 + x, 46 + y, 1, 6);
        g2d.fillRect(117 + x, 46 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 9);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(105 + x, 51 + y, 1, 5);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(114 + x, 52 + y, 1, 4);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 54 + y, 1, 6);
        g2d.fillRect(113 + x, 55 + y, 1, 5);
        g2d.fillRect(107 + x, 56 + y, 1, 4);
        g2d.fillRect(112 + x, 56 + y, 1, 4);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 48 + y, 1, 11);
        g2d.fillRect(101 + x, 49 + y, 1, 9);
        g2d.fillRect(117 + x, 49 + y, 1, 10);
        g2d.fillRect(118 + x, 50 + y, 1, 8);
        g2d.fillRect(103 + x, 51 + y, 1, 8);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(116 + x, 52 + y, 1, 7);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 54 + y, 1, 5);
        g2d.fillRect(115 + x, 55 + y, 1, 4);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(107 + x, 45 + y, 5, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(108 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
    }





    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 41 + y, 1, 7);
        g2d.fillRect(104 + x, 41 + y, 1, 13);
        g2d.fillRect(113 + x, 41 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 5);
        g2d.fillRect(115 + x, 41 + y, 1, 14);
        g2d.fillRect(105 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 5);
        g2d.fillRect(116 + x, 44 + y, 1, 8);
        g2d.fillRect(117 + x, 45 + y, 1, 4);
        g2d.fillRect(100 + x, 46 + y, 1, 6);
        g2d.fillRect(118 + x, 46 + y, 1, 4);
        g2d.fillRect(119 + x, 47 + y, 1, 5);
        g2d.fillRect(99 + x, 48 + y, 1, 13);
        g2d.fillRect(120 + x, 48 + y, 1, 14);
        g2d.fillRect(121 + x, 48 + y, 1, 13);
        g2d.fillRect(98 + x, 49 + y, 1, 11);
        g2d.fillRect(122 + x, 49 + y, 1, 11);
        g2d.fillRect(97 + x, 50 + y, 1, 9);
        g2d.fillRect(123 + x, 50 + y, 1, 9);
        g2d.fillRect(96 + x, 51 + y, 1, 6);
        g2d.fillRect(105 + x, 51 + y, 1, 5);
        g2d.fillRect(114 + x, 52 + y, 1, 4);
        g2d.fillRect(124 + x, 52 + y, 1, 5);
        g2d.fillRect(106 + x, 54 + y, 1, 9);
        g2d.fillRect(113 + x, 55 + y, 1, 7);
        g2d.fillRect(107 + x, 56 + y, 1, 6);
        g2d.fillRect(112 + x, 56 + y, 1, 5);
        g2d.fillRect(119 + x, 56 + y, 1, 7);
        g2d.fillRect(100 + x, 57 + y, 1, 5);
        g2d.fillRect(101 + x, 58 + y, 1, 4);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 4);
        g2d.fillRect(118 + x, 58 + y, 1, 5);
        g2d.fillRect(102 + x, 59 + y, 1, 4);
        g2d.fillRect(103 + x, 59 + y, 1, 4);
        g2d.fillRect(104 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 59 + y, 1, 4);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 4);
        g2d.fillRect(116 + x, 59 + y, 1, 4);
        g2d.fillRect(117 + x, 59 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 48 + y, 1, 11);
        g2d.fillRect(101 + x, 49 + y, 1, 9);
        g2d.fillRect(117 + x, 49 + y, 1, 10);
        g2d.fillRect(118 + x, 50 + y, 1, 8);
        g2d.fillRect(103 + x, 51 + y, 1, 8);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(116 + x, 52 + y, 1, 7);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 54 + y, 1, 5);
        g2d.fillRect(115 + x, 55 + y, 1, 4);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(107 + x, 45 + y, 5, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(108 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        drawLower(x,0,g2d);

        if(middle.equalsIgnoreCase("c"))
        {
            drawC(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("d"))
        {
            drawD(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
        }
    }
}
