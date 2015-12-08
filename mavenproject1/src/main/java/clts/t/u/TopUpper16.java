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
public class TopUpper16 extends clts.SuperTU
{
    public TopUpper16()
    {
        super();
        prep = true;
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper16(String middle)
    {
        super(middle, 3);
        prep = true;
        containsTL = true;
    }

    public TopUpper16(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        containsTL = true;
    }

    public TopUpper16(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        containsTL = true;
    }

    public TopUpper16(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        containsTL = true;
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 3);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(115 + x, 48 + y, 1, 4);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 4);
        g2d.fillRect(106 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 4);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 3);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 8, 1);
        g2d.fillRect(112 + x, 59 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 46 + y, 1, 4);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 4);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 3);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 51 + y, 1, 4);
        g2d.fillRect(105 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(100 + x, 53 + y, 1, 4);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 4, 1);
        g2d.fillRect(114 + x, 58 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 48 + y, 1, 8);
        g2d.fillRect(117 + x, 49 + y, 1, 3);
        g2d.fillRect(100 + x, 50 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 3);
        g2d.fillRect(118 + x, 51 + y, 1, 4);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 3);
        g2d.fillRect(117 + x, 55 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 2, 1);
        g2d.fillRect(115 + x, 57 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 51 + y, 1, 4);
        g2d.fillRect(117 + x, 52 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 56 + y, 1, 3);
        g2d.fillRect(108 + x, 56 + y, 2, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 2, 1);
        g2d.fillRect(109 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 4);
        g2d.fillRect(111 + x, 59 + y, 1, 3);
        g2d.fillRect(112 + x, 62 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 40, 1, 2);
        g2d.fillRect(113 + x, 40, 1, 3);
        g2d.fillRect(103 + x, 41, 1, 3);
        g2d.fillRect(114 + x, 41, 1, 4);
        g2d.fillRect(102 + x, 43, 1, 4);
        g2d.fillRect(115 + x, 43, 1, 3);
        g2d.fillRect(101 + x, 44, 1, 3);
        g2d.fillRect(116 + x, 45, 1, 2);
        g2d.fillRect(117 + x, 46, 1, 1);

        if(middle.equals("b"))
        {
            drawB(x,y,g2d);
        }
    }
}
