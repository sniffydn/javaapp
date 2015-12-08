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
public class Bot0 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot0()
    {
        super();
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot0(int layer)
    {
        super(layer);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot0(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        x = x + 84;
        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(26 + x,87 + y, 3, 1);
        g2d.fillRect(27 + x,88 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(26 + x,89 + y, 3, 1);
        g2d.fillRect(26 + x,88 + y, 1, 1);
        g2d.fillRect(28 + x,88 + y, 1, 1);
        g2d.fillRect(25 + x,87 + y, 1, 1);
        g2d.fillRect(29 + x,87 + y, 1, 1);
        g2d.fillRect(25 + x,86 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(26 + x,90 + y, 3, 1);
        g2d.fillRect(25 + x,89 + y, 1, 1);
        g2d.fillRect(29 + x,89 + y, 1, 1);
        g2d.fillRect(25 + x,88 + y, 1, 1);
        g2d.fillRect(29 + x,88 + y, 1, 1);
        g2d.fillRect(24 + x,87 + y, 1, 1);
        g2d.fillRect(30 + x,87 + y, 1, 1);
        g2d.fillRect(24 + x,86 + y, 1, 1);
        g2d.fillRect(30 + x,86 + y, 1, 1);
        g2d.fillRect(23 + x,85 + y, 9, 1);

        if(step == 0 || step == 1 || step == 7 || step == 8 || step == 9 || step == 15)
        {
            g2d.fillRect(22 + x,84 + y, 1, 1);
            g2d.fillRect(32 + x,84 + y, 1, 1);
            g2d.fillRect(21 + x,83 + y, 1, 1);
            g2d.fillRect(33 + x,83 + y, 1, 1);
            g2d.fillRect(20 + x,82 + y, 1, 1);
            g2d.fillRect(34 + x,82 + y, 1, 1);
            g2d.fillRect(19 + x,81 + y, 1, 1);
            g2d.fillRect(35 + x,81 + y, 1, 1);
            g2d.fillRect(18 + x,80 + y, 1, 1);
            g2d.fillRect(17 + x,80 + y, 1, 1);
        }else if(step == 2 || step == 3 || step == 5 || step == 6)
        {
            g2d.fillRect(22 + x,84 + y, 1, 1);
            g2d.fillRect(32 + x,83 + y, 1, 2);
            g2d.fillRect(21 + x,83 + y, 1, 1);
            g2d.fillRect(33 + x,82 + y, 1, 1);
            g2d.fillRect(20 + x,82 + y, 1, 1);
            g2d.fillRect(34 + x,81 + y, 1, 1);
            g2d.fillRect(19 + x,81 + y, 1, 1);
            g2d.fillRect(35 + x,80 + y, 1, 1);
            g2d.fillRect(18 + x,80 + y, 1, 1);
            g2d.fillRect(17 + x,80 + y, 1, 1);
        }else if(step == 10 || step == 11 || step == 13 || step == 14)
        {
            g2d.fillRect(22 + x,83 + y, 1, 2);
            g2d.fillRect(32 + x,84 + y, 1, 1);
            g2d.fillRect(21 + x,82 + y, 1, 1);
            g2d.fillRect(33 + x,83 + y, 1, 1);
            g2d.fillRect(20 + x,81 + y, 1, 1);
            g2d.fillRect(34 + x,82 + y, 1, 1);
            g2d.fillRect(19 + x,80 + y, 1, 1);
            g2d.fillRect(35 + x,81 + y, 1, 1);
            g2d.fillRect(18 + x,79 + y, 1, 1);
            g2d.fillRect(17 + x,79 + y, 1, 1);
        }else if(step == 4)
        {
            g2d.fillRect(22 + x,84 + y, 1, 1);
            g2d.fillRect(31 + x,83 + y, 1, 2);
            g2d.fillRect(21 + x,83 + y, 1, 1);
            g2d.fillRect(32 + x,81 + y, 1, 2);
            g2d.fillRect(20 + x,82 + y, 1, 1);
            g2d.fillRect(33 + x,80 + y, 1, 1);
            g2d.fillRect(19 + x,81 + y, 1, 1);
            g2d.fillRect(34 + x,80 + y, 2, 1);
            g2d.fillRect(18 + x,80 + y, 1, 1);
            g2d.fillRect(17 + x,80 + y, 1, 1);
        }else if(step == 12)
        {
            g2d.fillRect(23 + x,83 + y, 1, 2);
            g2d.fillRect(32 + x,84 + y, 1, 1);
            g2d.fillRect(22 + x,81 + y, 1, 2);
            g2d.fillRect(33 + x,83 + y, 1, 1);
            g2d.fillRect(20 + x,80 + y, 2, 1);
            g2d.fillRect(34 + x,82 + y, 1, 1);
            g2d.fillRect(35 + x,81 + y, 1, 1);
            g2d.fillRect(17 + x,79 + y, 3, 1);
        }
    }



}
