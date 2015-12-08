/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperTL;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Stick0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Stick0()
    {
        super(2);
    }

    public Stick0(int layer)
    {
        super(layer);
    }

    public Stick0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Stick0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 81 + y, 1, 4);
        g2d.fillRect(94 + x, 81 + y, 1, 5);
        g2d.fillRect(95 + x, 85 + y, 1, 1);
        g2d.fillRect(95 + x, 90 + y, 1, 5);
        g2d.fillRect(96 + x, 90 + y, 1, 10);
        g2d.fillRect(97 + x, 95 + y, 1, 10);
        g2d.fillRect(98 + x, 100 + y, 1, 10);
        g2d.fillRect(99 + x, 105 + y, 1, 10);
        g2d.fillRect(100 + x, 110 + y, 1, 10);
        g2d.fillRect(101 + x, 115 + y, 1, 8);
        g2d.fillRect(102 + x, 120 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 86 + y, 1, 4);
        g2d.fillRect(94 + x, 88 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(94 + x, 86 + y, 1, 1);
    }
}
