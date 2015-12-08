/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b;

import clts.SuperB;
import clts.SuperC;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot36 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot36()
    {
        super();
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot36(int layer)
    {
        super(layer);
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot36(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot36(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 84, 1, 2);
        g2d.fillRect(102 + x, 84, 1, 1);
        g2d.fillRect(121 + x, 84, 1, 2);
        g2d.fillRect(104 + x, 85, 3, 1);
        g2d.fillRect(117 + x, 85, 1, 1);
        g2d.fillRect(108 + x, 86, 7, 1);
        g2d.fillRect(112 + x, 87, 1, 1);
        g2d.fillRect(108 + x, 89, 4, 1);
        g2d.fillRect(113 + x, 89, 2, 1);
        g2d.fillRect(121 + x, 89, 1, 1);
        g2d.fillRect(110 + x, 90, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 84, 1, 3);
        g2d.fillRect(119 + x, 84, 1, 5);
        g2d.fillRect(120 + x, 84, 1, 6);
        g2d.fillRect(102 + x, 85, 2, 1);
        g2d.fillRect(116 + x, 85, 1, 4);
        g2d.fillRect(118 + x, 85, 1, 2);
        g2d.fillRect(101 + x, 86, 1, 4);
        g2d.fillRect(103 + x, 86, 1, 3);
        g2d.fillRect(104 + x, 86, 1, 3);
        g2d.fillRect(105 + x, 86, 1, 3);
        g2d.fillRect(106 + x, 86, 2, 1);
        g2d.fillRect(115 + x, 86, 1, 1);
        g2d.fillRect(117 + x, 86, 1, 3);
        g2d.fillRect(102 + x, 87, 1, 3);
        g2d.fillRect(107 + x, 87, 1, 2);
        g2d.fillRect(108 + x, 87, 1, 2);
        g2d.fillRect(109 + x, 87, 1, 2);
        g2d.fillRect(111 + x, 87, 1, 2);
        g2d.fillRect(113 + x, 87, 1, 2);
        g2d.fillRect(114 + x, 87, 1, 2);
        g2d.fillRect(121 + x, 87, 1, 2);
        g2d.fillRect(106 + x, 88, 1, 1);
        g2d.fillRect(110 + x, 88, 1, 1);
        g2d.fillRect(112 + x, 88, 1, 2);
        g2d.fillRect(115 + x, 88, 1, 1);
        g2d.fillRect(118 + x, 88, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 86, 1, 1);
        g2d.fillRect(121 + x, 86, 1, 1);
        g2d.fillRect(106 + x, 87, 1, 1);
        g2d.fillRect(110 + x, 87, 1, 1);
        g2d.fillRect(115 + x, 87, 1, 1);
        g2d.fillRect(118 + x, 87, 1, 1);
    }
}
