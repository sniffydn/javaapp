/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u;

import clts.SuperTU;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.t.u.a.NB0;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class TopUpper0 extends SuperTU
{
    public TopUpper0()
    {
        super();
        prep = true;
        ling = true;
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper0(String middle)
    {
        super(middle, 3);
        prep = true;
        ling = true;
        swim = true;
    }

    public TopUpper0(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        ling = true;
        swim = true;
    }

    public TopUpper0(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        ling = true;
        swim = true;
    }

    public TopUpper0(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        ling = true;
        swim = true;
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 62 + y, 2, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 2, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 3, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(124 + x, 52 + y, 1, 5);
        g2d.fillRect(115 + x, 52 + y, 4, 1);
        g2d.fillRect(102 + x, 52 + y, 4, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 51 + y, 5, 1);
        g2d.fillRect(97 + x, 51 + y, 5, 1);
        g2d.fillRect(106 + x, 53 + y, 9, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 3);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 52 + y, 5, 1);
        g2d.fillRect(101 + x, 53 + y, 5, 1);
        g2d.fillRect(97 + x, 53 + y, 1, 4);
        g2d.fillRect(98 + x, 55 + y, 1, 4);
        g2d.fillRect(99 + x, 57 + y, 1, 3);
        g2d.fillRect(100 + x, 59 + y, 1, 2);
        g2d.fillRect(101 + x, 60 + y, 2, 1);
        g2d.fillRect(102 + x, 61 + y, 2, 1);
        g2d.fillRect(103 + x, 62 + y, 4, 1);
        g2d.fillRect(106 + x, 61 + y, 2, 1);
        g2d.fillRect(107 + x, 60 + y, 2, 1);
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(108 + x, 58 + y, 8, 1);
        g2d.fillRect(107 + x, 57 + y, 2, 1);
        g2d.fillRect(106 + x, 56 + y, 2, 1);
        g2d.fillRect(105 + x, 55 + y, 3, 1);
        g2d.fillRect(104 + x, 54 + y, 4, 1);
        g2d.fillRect(119 + x, 52 + y, 5, 1);
        g2d.fillRect(115 + x, 53 + y, 5, 1);
        g2d.fillRect(113 + x, 54 + y, 3, 1);
        g2d.fillRect(113 + x, 55 + y, 2, 1);
        g2d.fillRect(113 + x, 56 + y, 3, 1);
        g2d.fillRect(112 + x, 57 + y, 4, 1);
        g2d.fillRect(111 + x, 59 + y, 5, 1);
        g2d.fillRect(112 + x, 60 + y, 5, 1);
        g2d.fillRect(113 + x, 61 + y, 7, 1);
        g2d.fillRect(115 + x, 62 + y, 3, 1);
        g2d.fillRect(119 + x, 60 + y, 2, 1);
        g2d.fillRect(120 + x, 58 + y, 2, 2);
        g2d.fillRect(121 + x, 56 + y, 1, 2);
        g2d.fillRect(122 + x, 53 + y, 1, 6);
        g2d.fillRect(123 + x, 53 + y, 1, 4);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 53 + y, 3, 1);
        g2d.fillRect(98 + x, 54 + y, 6, 1);
        g2d.fillRect(99 + x, 55 + y, 6, 1);
        g2d.fillRect(99 + x, 56 + y, 7, 1);
        g2d.fillRect(100 + x, 57 + y, 7, 1);
        g2d.fillRect(100 + x, 58 + y, 8, 1);
        g2d.fillRect(101 + x, 59 + y, 7, 1);
        g2d.fillRect(103 + x, 60 + y, 4, 1);
        g2d.fillRect(104 + x, 61 + y, 2, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 4, 6);
        g2d.fillRect(120 + x, 53 + y, 2, 3);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 2, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 62 + y, 3, 1);
        g2d.fillRect(101 + x, 62 + y, 2, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 2, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 3, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(125 + x, 52 + y, 1, 5);
        g2d.fillRect(115 + x, 52 + y, 4, 1);
        g2d.fillRect(102 + x, 52 + y, 4, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 51 + y, 6, 1);
        g2d.fillRect(96 + x, 51 + y, 6, 1);
        g2d.fillRect(106 + x, 53 + y, 9, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 3);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 62 + y, 4, 1);
        g2d.fillRect(96 + x, 52 + y, 6, 1);
        g2d.fillRect(101 + x, 53 + y, 5, 1);
        g2d.fillRect(104 + x, 54 + y, 4, 1);
        g2d.fillRect(105 + x, 55 + y, 3, 1);
        g2d.fillRect(106 + x, 56 + y, 2, 1);
        g2d.fillRect(107 + x, 57 + y, 2, 1);
        g2d.fillRect(108 + x, 58 + y, 8, 1);
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 60 + y, 2, 1);
        g2d.fillRect(106 + x, 61 + y, 2, 1);
        g2d.fillRect(101 + x, 61 + y, 2, 1);
        g2d.fillRect(99 + x, 60 + y, 3, 1);
        g2d.fillRect(98 + x, 59 + y, 2, 1);
        g2d.fillRect(97 + x, 57 + y, 2, 2);
        g2d.fillRect(96 + x, 55 + y, 2, 2);
        g2d.fillRect(96 + x, 53 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 4, 1);
        g2d.fillRect(113 + x, 56 + y, 3, 1);
        g2d.fillRect(113 + x, 55 + y, 2, 1);
        g2d.fillRect(113 + x, 54 + y, 3, 1);
        g2d.fillRect(115 + x, 53 + y, 5, 1);
        g2d.fillRect(119 + x, 52 + y, 6, 1);
        g2d.fillRect(123 + x, 53 + y, 2, 3);
        g2d.fillRect(122 + x, 56 + y, 3, 1);
        g2d.fillRect(122 + x, 57 + y, 2, 1);
        g2d.fillRect(121 + x, 58 + y, 3, 1);
        g2d.fillRect(121 + x, 59 + y, 2, 1);
        g2d.fillRect(120 + x, 60 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 8, 1);
        g2d.fillRect(115 + x, 62 + y, 3, 1);
        g2d.fillRect(111 + x, 59 + y, 5, 1);
        g2d.fillRect(112 + x, 60 + y, 5, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 53 + y, 4, 2);
        g2d.fillRect(98 + x, 55 + y, 7, 2);
        g2d.fillRect(101 + x, 54 + y, 3, 1);
        g2d.fillRect(99 + x, 57 + y, 8, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 8, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 5, 1);
        g2d.fillRect(103 + x, 61 + y, 3, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 4, 6);
        g2d.fillRect(120 + x, 53 + y, 2, 5);
        g2d.fillRect(122 + x, 53 + y, 1, 3);
        g2d.fillRect(120 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 3, 1);
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

    }
}
