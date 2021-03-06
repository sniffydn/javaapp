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
public class TopUpper17 extends clts.SuperTU
{
    public TopUpper17()
    {
        super();
        prep = true;
        containsTL = true;
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper17(String middle)
    {
        super(middle, 3);
        prep = true;
        containsTL = true;
        swim = true;
    }

    public TopUpper17(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        containsTL = true;
        swim = true;
    }

    public TopUpper17(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        containsTL = true;
        swim = true;
    }

    public TopUpper17(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        containsTL = true;
        swim = true;
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 47 + y, 1, 3);
        g2d.fillRect(117 + x, 47 + y, 1, 3);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 2, 1);
        g2d.fillRect(106 + x, 52 + y, 2, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 3);
        g2d.fillRect(98 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 3);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 3);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 3);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 52 + y, 1, 3);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 6);
        g2d.fillRect(104 + x, 53 + y, 2, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 5);
        g2d.fillRect(115 + x, 54 + y, 2, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 3);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 49 + y, 1, 3);
        g2d.fillRect(99 + x, 50 + y, 2, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 3);
        g2d.fillRect(100 + x, 51 + y, 1, 2);
        g2d.fillRect(115 + x, 51 + y, 2, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 3);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(106 + x, 53 + y, 1, 3);
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 2, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 3);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 3);
        g2d.fillRect(120 + x, 54 + y, 1, 3);
        g2d.fillRect(98 + x, 55 + y, 2, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 2, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 3);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 2, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 2, 1);
        g2d.fillRect(104 + x, 52 + y, 2, 1);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 4);
        g2d.fillRect(105 + x, 53 + y, 2, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(123 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(124 + x, 54 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 3);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 1, 3);
        g2d.fillRect(123 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 3, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 2, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 3);
        g2d.fillRect(97 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 2);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(122 + x, 53 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(123 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 2);
        g2d.fillRect(99 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 3);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 2);
        g2d.fillRect(100 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(120 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 53 + y, 1, 3);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 1, 6);
        g2d.fillRect(103 + x, 54 + y, 2, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 6);
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 2, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 3);
        g2d.fillRect(117 + x, 57 + y, 1, 4);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 50 + y, 1, 3);
        g2d.fillRect(98 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 3);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 3);
        g2d.fillRect(99 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 3);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 3);
        g2d.fillRect(99 + x, 55 + y, 1, 3);
        g2d.fillRect(103 + x, 55 + y, 2, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 3);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 3);
        g2d.fillRect(121 + x, 55 + y, 1, 3);
        g2d.fillRect(97 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 56 + y, 2, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 2, 1);
        g2d.fillRect(122 + x, 56 + y, 1, 3);
        g2d.fillRect(123 + x, 56 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 3);
        g2d.fillRect(101 + x, 60 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 3);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 2, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(118 + x, 62 + y, 1, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 2);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 2, 1);
        g2d.fillRect(103 + x, 52 + y, 2, 1);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 4);
        g2d.fillRect(104 + x, 53 + y, 2, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(124 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(125 + x, 54 + y, 1, 3);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 4);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 4, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 2, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 2, 1);
        g2d.fillRect(116 + x, 62 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 4);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(122 + x, 52 + y, 1, 3);
        g2d.fillRect(96 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(123 + x, 53 + y, 1, 3);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(124 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 4);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(98 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 4);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(122 + x, 58 + y, 1, 2);
        g2d.fillRect(99 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(120 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 53 + y, 1, 3);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 54 + y, 1, 6);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 6);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 2, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 3);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 4);
        g2d.fillRect(120 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 50 + y, 1, 3);
        g2d.fillRect(97 + x, 51 + y, 2, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 3);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 54 + y, 1, 3);
        g2d.fillRect(98 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 55 + y, 2, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 3);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 3);
        g2d.fillRect(122 + x, 55 + y, 1, 3);
        g2d.fillRect(96 + x, 56 + y, 2, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 3);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 2, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 2, 1);
        g2d.fillRect(123 + x, 56 + y, 1, 3);
        g2d.fillRect(124 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(121 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 3);
        g2d.fillRect(100 + x, 60 + y, 2, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 3);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(120 + x, 60 + y, 1, 3);
        g2d.fillRect(101 + x, 61 + y, 1, 2);
        g2d.fillRect(118 + x, 61 + y, 2, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 1);
        g2d.fillRect(119 + x, 62 + y, 1, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 41, 1, 7);
        g2d.fillRect(116 + x, 41, 1, 5);
        g2d.fillRect(117 + x, 46, 1, 2);

        if(middle.equals("c"))
        {
            drawC(x,y,g2d);
        }
        else if(middle.equals("d"))
        {
            drawD(x,y,g2d);
        }
        else if(middle.equals("b"))
        {
            drawB(x,y,g2d);
        }
    }
}
