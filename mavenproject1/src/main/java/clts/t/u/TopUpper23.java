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
public class TopUpper23 extends clts.SuperTU
{
    public TopUpper23()
    {
        super();
        prep = true;
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper23(String middle)
    {
        super(middle, 3);
        prep = true;
        swim = true;
    }

    public TopUpper23(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        swim = true;
    }

    public TopUpper23(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        swim = true;
    }

    public TopUpper23(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        swim = true;
    }
    public TopUpper23(String middle, Piece p)
    {
        super(middle, 3);
        prep = true;
        swim = true;
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(96 + x, 49 + y, 1, 4);
        g2d.fillRect(97 + x, 49 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 5, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 7);
        g2d.fillRect(103 + x, 50 + y, 4, 1);
        g2d.fillRect(107 + x, 51 + y, 4, 1);
        g2d.fillRect(111 + x, 52 + y, 4, 1);
        g2d.fillRect(115 + x, 53 + y, 4, 1);
        g2d.fillRect(119 + x, 54 + y, 3, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 4);
        g2d.fillRect(121 + x, 55 + y, 5, 1);
        g2d.fillRect(124 + x, 56 + y, 1, 3);
        g2d.fillRect(125 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 3);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(123 + x, 57 + y, 1, 3);
        g2d.fillRect(98 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(99 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(121 + x, 59 + y, 1, 3);
        g2d.fillRect(122 + x, 59 + y, 1, 2);
        g2d.fillRect(100 + x, 60 + y, 1, 2);
        g2d.fillRect(101 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 3);
        g2d.fillRect(119 + x, 60 + y, 1, 3);
        g2d.fillRect(120 + x, 60 + y, 1, 3);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 1, 2);
        g2d.fillRect(118 + x, 61 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 2);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 56 + y, 1, 2);
        g2d.fillRect(122 + x, 56 + y, 1, 3);
        g2d.fillRect(123 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 3);
        g2d.fillRect(121 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 2, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 6, 1);
        g2d.fillRect(116 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 50 + y, 1, 3);
        g2d.fillRect(101 + x, 50 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 3);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(97 + x, 52 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 4);
        g2d.fillRect(107 + x, 52 + y, 4, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 5);
        g2d.fillRect(109 + x, 53 + y, 1, 5);
        g2d.fillRect(110 + x, 53 + y, 1, 4);
        g2d.fillRect(111 + x, 53 + y, 1, 5);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(113 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(107 + x, 54 + y, 1, 4);
        g2d.fillRect(115 + x, 54 + y, 4, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 3);
        g2d.fillRect(106 + x, 55 + y, 1, 4);
        g2d.fillRect(119 + x, 55 + y, 1, 3);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 2, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 53 + y, 9, 1);
        g2d.fillRect(100 + x, 54 + y, 7, 1);
        g2d.fillRect(101 + x, 55 + y, 5, 1);
        g2d.fillRect(112 + x, 55 + y, 7, 1);
        g2d.fillRect(102 + x, 56 + y, 3, 1);
        g2d.fillRect(113 + x, 56 + y, 5, 1);
        g2d.fillRect(115 + x, 57 + y, 2, 1);
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(100 + x, 49 + y, 3, 1);
        g2d.fillRect(103 + x, 50 + y, 4, 1);
        g2d.fillRect(107 + x, 51 + y, 4, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(111 + x, 52 + y, 4, 1);
        g2d.fillRect(115 + x, 53 + y, 4, 1);
        g2d.fillRect(119 + x, 54 + y, 3, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 55 + y, 1, 3);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(117 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 5, 1);
        g2d.fillRect(113 + x, 59 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 50 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(107 + x, 52 + y, 4, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 5);
        g2d.fillRect(109 + x, 53 + y, 1, 5);
        g2d.fillRect(110 + x, 53 + y, 1, 4);
        g2d.fillRect(111 + x, 53 + y, 1, 5);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(113 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 4);
        g2d.fillRect(106 + x, 54 + y, 1, 4);
        g2d.fillRect(107 + x, 54 + y, 1, 4);
        g2d.fillRect(115 + x, 54 + y, 4, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 3, 1);
        g2d.fillRect(112 + x, 55 + y, 5, 1);
        g2d.fillRect(113 + x, 56 + y, 3, 1);
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 49 + y, 3, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 50 + y, 4, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 6);
        g2d.fillRect(107 + x, 51 + y, 4, 1);
        g2d.fillRect(111 + x, 52 + y, 4, 1);
        g2d.fillRect(115 + x, 53 + y, 4, 1);
        g2d.fillRect(119 + x, 54 + y, 3, 1);
        g2d.fillRect(121 + x, 55 + y, 4, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 3);
        g2d.fillRect(123 + x, 56 + y, 1, 3);
        g2d.fillRect(124 + x, 56 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 3);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(122 + x, 57 + y, 1, 3);
        g2d.fillRect(99 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(120 + x, 58 + y, 1, 4);
        g2d.fillRect(100 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(119 + x, 59 + y, 1, 4);
        g2d.fillRect(121 + x, 59 + y, 1, 2);
        g2d.fillRect(101 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 3);
        g2d.fillRect(118 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 51 + y, 1, 6);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(97 + x, 53 + y, 1, 3);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(121 + x, 56 + y, 1, 3);
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 2, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(102 + x, 59 + y, 5, 1);
        g2d.fillRect(113 + x, 59 + y, 4, 1);
        g2d.fillRect(103 + x, 60 + y, 3, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 50 + y, 1, 7);
        g2d.fillRect(101 + x, 50 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(107 + x, 52 + y, 4, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 3);
        g2d.fillRect(108 + x, 53 + y, 1, 5);
        g2d.fillRect(109 + x, 53 + y, 1, 5);
        g2d.fillRect(110 + x, 53 + y, 1, 4);
        g2d.fillRect(111 + x, 53 + y, 1, 5);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(113 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 5);
        g2d.fillRect(106 + x, 54 + y, 1, 5);
        g2d.fillRect(107 + x, 54 + y, 1, 4);
        g2d.fillRect(115 + x, 54 + y, 4, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 3);
        g2d.fillRect(117 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(104 + x, 56 + y, 1, 3);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 3);
        g2d.fillRect(113 + x, 57 + y, 3, 1);
        g2d.fillRect(114 + x, 58 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 3, 1);
        g2d.fillRect(112 + x, 55 + y, 5, 1);
        g2d.fillRect(113 + x, 56 + y, 3, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
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
