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
public class Bot2 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot2()
    {
        super();
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot2(int layer)
    {
        super(layer);
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot2(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public Bot2(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        x = x + 84;
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(29 + x, 88 + y, 1, 2);
        g2d.fillRect(25 + x, 88 + y, 1, 1);
        g2d.fillRect(30 + x, 87 + y, 1, 1);
        g2d.fillRect(24 + x, 87 + y, 1, 1);
        g2d.fillRect(31 + x, 86 + y, 1, 1);
        g2d.fillRect(23 + x, 86 + y, 1, 1);
        g2d.fillRect(24 + x, 85 + y, 6, 1);
        g2d.fillRect(22 + x, 84 + y, 2, 1);
        g2d.fillRect(32 + x, 83 + y, 1, 2);
        g2d.fillRect(30 + x, 84 + y, 2, 1);
        g2d.fillRect(26 + x, 89 + y, 3, 1);
        g2d.fillRect(18 + x, 82 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(26 + x, 90 + y, 4, 1);
        g2d.fillRect(25 + x, 89 + y, 1, 1);
        g2d.fillRect(30 + x, 88 + y, 1, 2);
        g2d.fillRect(24 + x, 88 + y, 1, 1);
        g2d.fillRect(31 + x, 87 + y, 1, 1);
        g2d.fillRect(23 + x, 87 + y, 1, 1);
        g2d.fillRect(32 + x, 85 + y, 1, 2);
        g2d.fillRect(22 + x, 85 + y, 1, 2);
        g2d.fillRect(24 + x, 84 + y, 6, 1);
        g2d.fillRect(30 + x, 83 + y, 2, 1);
        g2d.fillRect(35 + x, 79 + y, 1, 2);
        g2d.fillRect(16 + x, 79 + y, 2, 1);
        g2d.fillRect(18 + x, 81 + y, 2, 1);
        g2d.fillRect(32 + x, 82 + y, 3, 1);
        g2d.fillRect(17 + x, 80 + y, 1, 1);
        g2d.fillRect(19 + x, 82 + y, 3, 1);
        g2d.fillRect(20 + x, 83 + y, 4, 1);
        g2d.fillRect(21 + x, 84 + y, 1, 1);
        g2d.fillRect(33 + x, 81 + y, 2, 1);
        g2d.fillRect(33 + x, 83 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(26 + x, 88 + y, 3, 1);
        g2d.fillRect(29 + x, 87 + y, 1, 1);
        g2d.fillRect(25 + x, 87 + y, 1, 1);
        g2d.fillRect(26 + x, 86 + y, 3, 1);
        g2d.fillRect(24 + x, 86 + y, 1, 1);
        g2d.fillRect(23 + x, 85 + y, 1, 1);
        g2d.fillRect(34 + x, 80 + y, 1, 1);
        g2d.fillRect(18 + x, 80 + y, 1, 1);
        g2d.fillRect(31 + x, 85 + y, 1, 1);
        g2d.fillRect(30 + x, 85 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(26 + x, 87 + y, 3, 1);
        g2d.fillRect(29 + x, 86 + y, 1, 1);
        g2d.fillRect(25 + x, 86 + y, 1, 1);
    }



}
