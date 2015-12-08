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
public class TopUpper22 extends clts.SuperTU
{
    public TopUpper22()
    {
        super();
        prep = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper22(String middle)
    {
        super(middle, 3);
        prep = true;
    }

    public TopUpper22(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
    }

    public TopUpper22(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
    }

    public TopUpper22(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
    }
    public TopUpper22(String middle, Piece p)
    {
        super(middle, 3);
        prep = true;
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 5, 1);
        g2d.fillRect(105 + x, 51 + y, 5, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(110 + x, 52 + y, 5, 1);
        g2d.fillRect(115 + x, 53 + y, 5, 1);
        g2d.fillRect(120 + x, 54 + y, 2, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 54 + y, 1, 4);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(117 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
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
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 8, 1);
        g2d.fillRect(111 + x, 57 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 51 + y, 1, 4);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 3);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 1, 2);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 51 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 4);
        g2d.fillRect(104 + x, 51 + y, 1, 4);
        g2d.fillRect(105 + x, 52 + y, 1, 3);
        g2d.fillRect(106 + x, 52 + y, 1, 3);
        g2d.fillRect(108 + x, 52 + y, 1, 3);
        g2d.fillRect(109 + x, 52 + y, 1, 3);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(113 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 2, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
        }
    }


}
