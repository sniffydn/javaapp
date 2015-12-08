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
public class TopUpper15 extends clts.SuperTU
{
    public TopUpper15()
    {
        super();
        prep = true;
        drs = true;
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper15(String middle)
    {
        super(middle, 3);
        prep = true;
        drs = true;
        swim = true;
    }

    public TopUpper15(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        drs = true;
        swim = true;
    }

    public TopUpper15(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        drs = true;
        swim = true;
    }

    public TopUpper15(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        drs = true;
        swim = true;
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 48 + y, 16, 1);
        g2d.fillRect(101 + x, 49 + y, 2, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 16, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 52 + y, 1, 6);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 53 + y, 1, 5);
        g2d.fillRect(118 + x, 54 + y, 1, 5);
        g2d.fillRect(101 + x, 55 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 4);
        g2d.fillRect(102 + x, 57 + y, 1, 3);
        g2d.fillRect(103 + x, 57 + y, 1, 3);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 3);
        g2d.fillRect(106 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 2, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 3);
        g2d.fillRect(114 + x, 58 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 49 + y, 1, 8);
        g2d.fillRect(104 + x, 49 + y, 1, 8);
        g2d.fillRect(105 + x, 49 + y, 1, 8);
        g2d.fillRect(106 + x, 49 + y, 1, 8);
        g2d.fillRect(107 + x, 49 + y, 1, 8);
        g2d.fillRect(108 + x, 49 + y, 1, 8);
        g2d.fillRect(109 + x, 49 + y, 1, 8);
        g2d.fillRect(110 + x, 49 + y, 1, 11);
        g2d.fillRect(111 + x, 49 + y, 1, 11);
        g2d.fillRect(112 + x, 49 + y, 1, 8);
        g2d.fillRect(113 + x, 49 + y, 1, 8);
        g2d.fillRect(114 + x, 49 + y, 1, 9);
        g2d.fillRect(115 + x, 49 + y, 1, 9);
        g2d.fillRect(116 + x, 49 + y, 1, 8);
        g2d.fillRect(117 + x, 49 + y, 1, 7);
        g2d.fillRect(118 + x, 49 + y, 1, 5);
        g2d.fillRect(101 + x, 50 + y, 1, 5);
        g2d.fillRect(102 + x, 50 + y, 1, 7);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 3, 1);
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 48 + y, 21, 1);
        g2d.fillRect(99 + x, 49 + y, 2, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 1);
        g2d.fillRect(123 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 5);
        g2d.fillRect(124 + x, 52 + y, 1, 5);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(123 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 1, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 18, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 52 + y, 1, 5);
        g2d.fillRect(122 + x, 52 + y, 1, 7);
        g2d.fillRect(123 + x, 52 + y, 1, 5);
        g2d.fillRect(98 + x, 55 + y, 1, 4);
        g2d.fillRect(121 + x, 56 + y, 1, 4);
        g2d.fillRect(99 + x, 57 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 4);
        g2d.fillRect(120 + x, 57 + y, 1, 4);
        g2d.fillRect(119 + x, 58 + y, 1, 4);
        g2d.fillRect(101 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 59 + y, 1, 3);
        g2d.fillRect(103 + x, 59 + y, 1, 3);
        g2d.fillRect(104 + x, 59 + y, 1, 3);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 4, 1);
        g2d.fillRect(116 + x, 61 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 49 + y, 1, 10);
        g2d.fillRect(102 + x, 49 + y, 1, 10);
        g2d.fillRect(103 + x, 49 + y, 1, 10);
        g2d.fillRect(104 + x, 49 + y, 1, 10);
        g2d.fillRect(105 + x, 49 + y, 1, 10);
        g2d.fillRect(106 + x, 49 + y, 1, 10);
        g2d.fillRect(107 + x, 49 + y, 1, 10);
        g2d.fillRect(108 + x, 49 + y, 1, 10);
        g2d.fillRect(109 + x, 49 + y, 1, 10);
        g2d.fillRect(110 + x, 49 + y, 1, 13);
        g2d.fillRect(111 + x, 49 + y, 1, 13);
        g2d.fillRect(112 + x, 49 + y, 1, 10);
        g2d.fillRect(113 + x, 49 + y, 1, 10);
        g2d.fillRect(114 + x, 49 + y, 1, 11);
        g2d.fillRect(115 + x, 49 + y, 1, 11);
        g2d.fillRect(116 + x, 49 + y, 1, 11);
        g2d.fillRect(117 + x, 49 + y, 1, 11);
        g2d.fillRect(118 + x, 49 + y, 1, 10);
        g2d.fillRect(119 + x, 49 + y, 1, 9);
        g2d.fillRect(120 + x, 49 + y, 1, 8);
        g2d.fillRect(121 + x, 49 + y, 1, 7);
        g2d.fillRect(99 + x, 50 + y, 1, 7);
        g2d.fillRect(100 + x, 50 + y, 1, 7);
        g2d.fillRect(122 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 51 + y, 1, 4);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 3, 1);
        g2d.fillRect(112 + x, 61 + y, 4, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 48 + y, 23, 1);
        g2d.fillRect(98 + x, 49 + y, 2, 1);
        g2d.fillRect(123 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(124 + x, 50 + y, 1, 2);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 5);
        g2d.fillRect(125 + x, 52 + y, 1, 5);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 1, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 20, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(124 + x, 49 + y, 1, 1);
        g2d.fillRect(125 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 5);
        g2d.fillRect(123 + x, 52 + y, 1, 7);
        g2d.fillRect(124 + x, 52 + y, 1, 5);
        g2d.fillRect(97 + x, 55 + y, 1, 4);
        g2d.fillRect(122 + x, 56 + y, 1, 4);
        g2d.fillRect(98 + x, 57 + y, 1, 3);
        g2d.fillRect(99 + x, 57 + y, 1, 4);
        g2d.fillRect(121 + x, 57 + y, 1, 4);
        g2d.fillRect(120 + x, 58 + y, 1, 4);
        g2d.fillRect(100 + x, 59 + y, 1, 3);
        g2d.fillRect(101 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 59 + y, 1, 3);
        g2d.fillRect(103 + x, 59 + y, 1, 3);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(119 + x, 59 + y, 1, 3);
        g2d.fillRect(115 + x, 60 + y, 4, 1);
        g2d.fillRect(117 + x, 61 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 49 + y, 1, 10);
        g2d.fillRect(101 + x, 49 + y, 1, 10);
        g2d.fillRect(102 + x, 49 + y, 1, 10);
        g2d.fillRect(103 + x, 49 + y, 1, 10);
        g2d.fillRect(104 + x, 49 + y, 1, 10);
        g2d.fillRect(105 + x, 49 + y, 1, 10);
        g2d.fillRect(106 + x, 49 + y, 1, 10);
        g2d.fillRect(107 + x, 49 + y, 1, 10);
        g2d.fillRect(108 + x, 49 + y, 1, 10);
        g2d.fillRect(109 + x, 49 + y, 1, 13);
        g2d.fillRect(110 + x, 49 + y, 1, 13);
        g2d.fillRect(111 + x, 49 + y, 1, 13);
        g2d.fillRect(112 + x, 49 + y, 1, 13);
        g2d.fillRect(113 + x, 49 + y, 1, 10);
        g2d.fillRect(114 + x, 49 + y, 1, 10);
        g2d.fillRect(115 + x, 49 + y, 1, 11);
        g2d.fillRect(116 + x, 49 + y, 1, 11);
        g2d.fillRect(117 + x, 49 + y, 1, 11);
        g2d.fillRect(118 + x, 49 + y, 1, 11);
        g2d.fillRect(119 + x, 49 + y, 1, 10);
        g2d.fillRect(120 + x, 49 + y, 1, 9);
        g2d.fillRect(121 + x, 49 + y, 1, 8);
        g2d.fillRect(122 + x, 49 + y, 1, 7);
        g2d.fillRect(98 + x, 50 + y, 1, 7);
        g2d.fillRect(99 + x, 50 + y, 1, 7);
        g2d.fillRect(123 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 4);
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 3, 1);
        g2d.fillRect(113 + x, 61 + y, 4, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
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
