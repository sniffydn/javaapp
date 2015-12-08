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
public class TopUpper5 extends clts.SuperTU
{
    public TopUpper5()
    {
        super();
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper5(String middle)
    {
        super(middle, 3);
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper5(String middle, int layer)
    {
        super(middle, layer);
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper5(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper5(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }
    public TopUpper5(String middle, Piece p)
    {
        super(middle, 3);
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 62 + y, 5, 1);
        g2d.fillRect(101 + x, 62 + y, 5, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 5, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(124 + x, 52 + y, 1, 5);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 6);
        g2d.fillRect(123 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 2, 1);
        g2d.fillRect(98 + x, 59 + y, 2, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 48 + y, 2, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 3);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(123 + x, 56 + y, 1, 3);
        g2d.fillRect(121 + x, 59 + y, 2, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 59 + y, 1, 2);
        g2d.fillRect(100 + x, 59 + y, 1, 2);
        g2d.fillRect(122 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 2, 1);
        g2d.fillRect(102 + x, 52 + y, 2, 1);
        g2d.fillRect(115 + x, 61 + y, 5, 1);
        g2d.fillRect(98 + x, 50 + y, 3, 1);
        g2d.fillRect(100 + x, 51 + y, 2, 1);
        g2d.fillRect(120 + x, 50 + y, 3, 1);
        g2d.fillRect(122 + x, 51 + y, 1, 2);
        g2d.fillRect(123 + x, 52 + y, 1, 4);
        g2d.fillRect(97 + x, 51 + y, 1, 5);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 2, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 4, 1);
        g2d.fillRect(101 + x, 60 + y, 4, 1);
        g2d.fillRect(101 + x, 61 + y, 5, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 2, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 8);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 7, 1);
        g2d.fillRect(116 + x, 59 + y, 4, 1);
        g2d.fillRect(105 + x, 60 + y, 4, 1);
        g2d.fillRect(98 + x, 52 + y, 4, 1);
        g2d.fillRect(98 + x, 53 + y, 2, 4);
        g2d.fillRect(99 + x, 57 + y, 2, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 4, 1);
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(111 + x, 59 + y, 2, 1);
        g2d.fillRect(112 + x, 60 + y, 4, 1);
        g2d.fillRect(113 + x, 61 + y, 2, 1);
        g2d.fillRect(106 + x, 61 + y, 2, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 2, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(122 + x, 53 + y, 1, 4);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 4);
        g2d.fillRect(100 + x, 53 + y, 1, 4);
        g2d.fillRect(102 + x, 58 + y, 4, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 4, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(119 + x, 53 + y, 1, 4);
        g2d.fillRect(101 + x, 53 + y, 1, 4);
        g2d.fillRect(115 + x, 57 + y, 4, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 4);
        g2d.fillRect(103 + x, 55 + y, 1, 3);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 3, 1);
        g2d.fillRect(117 + x, 55 + y, 2, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
    }
}
