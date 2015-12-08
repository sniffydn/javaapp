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
public class Torch0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Torch0()
    {
        super(2);
    }

    public Torch0(int layer)
    {
        super(layer);
    }

    public Torch0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Torch0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintTorch(x + shiftX, shiftY, g2d);
    }

    public void paintTorch(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(new Color(112,148,134,255));
        g2d.fillRect(82 + x, 48 + y, 1, 2);
        g2d.fillRect(84 + x, 48 + y, 1, 2);
        g2d.fillRect(86 + x, 48 + y, 1, 2);
        g2d.fillRect(88 + x, 48 + y, 1, 2);
        g2d.fillRect(90 + x, 48 + y, 1, 2);
        g2d.fillRect(81 + x, 49 + y, 1, 3);
        g2d.fillRect(83 + x, 49 + y, 1, 1);
        g2d.fillRect(85 + x, 49 + y, 1, 1);
        g2d.fillRect(87 + x, 49 + y, 1, 1);
        g2d.fillRect(89 + x, 49 + y, 1, 1);
        g2d.fillRect(91 + x, 49 + y, 1, 3);
        g2d.fillRect(82 + x, 51 + y, 9, 1);
        g2d.fillRect(83 + x, 52 + y, 1, 3);
        g2d.fillRect(89 + x, 52 + y, 1, 3);
        g2d.fillRect(84 + x, 55 + y, 1, 7);
        g2d.fillRect(88 + x, 55 + y, 1, 7);
        g2d.fillRect(85 + x, 62 + y, 1, 5);
        g2d.fillRect(87 + x, 62 + y, 1, 5);
        g2d.fillRect(86 + x, 67 + y, 1, 1);


        g2d.setColor(new Color(148,188,160,255));
        g2d.fillRect(82 + x, 50 + y, 2, 1);
        g2d.fillRect(89 + x, 50 + y, 2, 1);
        g2d.fillRect(84 + x, 52 + y, 1, 3);
        g2d.fillRect(88 + x, 52 + y, 1, 3);
        g2d.fillRect(85 + x, 55 + y, 1, 7);
        g2d.fillRect(87 + x, 55 + y, 1, 7);
        g2d.fillRect(86 + x, 62 + y, 1, 5);


        g2d.setColor(new Color(156,204,171,255));
        g2d.fillRect(86 + x, 33 + y, 1, 6);
        g2d.fillRect(87 + x, 34 + y, 1, 4);
        g2d.fillRect(85 + x, 36 + y, 1, 5);
        g2d.fillRect(88 + x, 36 + y, 1, 7);
        g2d.fillRect(90 + x, 38 + y, 1, 10);
        g2d.fillRect(83 + x, 39 + y, 1, 6);
        g2d.fillRect(84 + x, 40 + y, 1, 3);
        g2d.fillRect(91 + x, 40 + y, 1, 6);
        g2d.fillRect(89 + x, 41 + y, 1, 1);
        g2d.fillRect(82 + x, 43 + y, 1, 5);
        g2d.fillRect(81 + x, 45 + y, 1, 2);
        g2d.fillRect(83 + x, 46 + y, 1, 3);
        g2d.fillRect(89 + x, 46 + y, 1, 3);
        g2d.fillRect(84 + x, 50 + y, 5, 1);
        g2d.fillRect(85 + x, 52 + y, 1, 3);
        g2d.fillRect(86 + x, 52 + y, 1, 10);
        g2d.fillRect(87 + x, 52 + y, 1, 3);


        g2d.setColor(new Color(172,212,183,255));
        g2d.fillRect(87 + x, 38 + y, 1, 6);
        g2d.fillRect(86 + x, 39 + y, 1, 4);
        g2d.fillRect(85 + x, 41 + y, 1, 3);
        g2d.fillRect(89 + x, 42 + y, 1, 4);
        g2d.fillRect(84 + x, 43 + y, 1, 5);
        g2d.fillRect(88 + x, 43 + y, 1, 1);
        g2d.fillRect(83 + x, 45 + y, 1, 1);
        g2d.fillRect(88 + x, 46 + y, 1, 2);
        g2d.fillRect(87 + x, 47 + y, 1, 2);


        g2d.setColor(new Color(184,220,193,255));
        g2d.fillRect(86 + x, 43 + y, 1, 5);
        g2d.fillRect(85 + x, 44 + y, 1, 5);
        g2d.fillRect(87 + x, 44 + y, 1, 3);
        g2d.fillRect(88 + x, 44 + y, 1, 2);
    }
}
