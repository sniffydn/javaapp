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
public class Float0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Float0()
    {
        super(2);
    }

    public Float0(int layer)
    {
        super(layer);
    }

    public Float0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Float0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }



    public void draw(int x, int y, GraphicsMap g2d)
    {
        x+=shiftX;
        y+=shiftY;
        paintFloat(x + 17,-25,g2d);
    }

    public void paintFloat(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(new Color(0,0,0,255));
        g2d.fillRect(71 + x, 132 + y, 1, 2);
        g2d.fillRect(72 + x, 132 + y, 1, 2);
        g2d.fillRect(73 + x, 132 + y, 1, 2);
        g2d.fillRect(74 + x, 132 + y, 1, 2);
        g2d.fillRect(75 + x, 132 + y, 1, 2);
        g2d.fillRect(76 + x, 132 + y, 1, 2);
        g2d.fillRect(77 + x, 132 + y, 1, 2);
        g2d.fillRect(78 + x, 132 + y, 1, 2);
        g2d.fillRect(79 + x, 132 + y, 1, 2);
        g2d.fillRect(80 + x, 132 + y, 1, 2);
        g2d.fillRect(81 + x, 132 + y, 1, 2);
        g2d.fillRect(82 + x, 132 + y, 1, 2);
        g2d.fillRect(83 + x, 132 + y, 1, 2);


        g2d.setColor(new Color(153,0,0,255));
        g2d.fillRect(77 + x, 108 + y, 1, 1);
        g2d.fillRect(76 + x, 109 + y, 1, 1);
        g2d.fillRect(78 + x, 109 + y, 1, 1);
        g2d.fillRect(75 + x, 110 + y, 1, 1);
        g2d.fillRect(79 + x, 110 + y, 1, 1);
        g2d.fillRect(74 + x, 111 + y, 1, 1);
        g2d.fillRect(80 + x, 111 + y, 1, 1);
        g2d.fillRect(73 + x, 112 + y, 1, 1);
        g2d.fillRect(81 + x, 112 + y, 1, 1);
        g2d.fillRect(72 + x, 113 + y, 1, 2);
        g2d.fillRect(82 + x, 113 + y, 1, 2);
        g2d.fillRect(71 + x, 115 + y, 1, 17);
        g2d.fillRect(83 + x, 115 + y, 1, 17);
        g2d.fillRect(71 + x, 134 + y, 1, 2);
        g2d.fillRect(83 + x, 134 + y, 1, 2);
        g2d.fillRect(72 + x, 136 + y, 1, 2);
        g2d.fillRect(82 + x, 136 + y, 1, 2);
        g2d.fillRect(73 + x, 138 + y, 9, 1);


        g2d.setColor(new Color(204,0,0,255));
        g2d.fillRect(77 + x, 109 + y, 1, 1);
        g2d.fillRect(76 + x, 110 + y, 1, 1);
        g2d.fillRect(78 + x, 110 + y, 1, 1);
        g2d.fillRect(75 + x, 111 + y, 1, 2);
        g2d.fillRect(79 + x, 111 + y, 1, 1);
        g2d.fillRect(74 + x, 112 + y, 1, 1);
        g2d.fillRect(80 + x, 112 + y, 1, 1);
        g2d.fillRect(73 + x, 113 + y, 1, 2);
        g2d.fillRect(81 + x, 113 + y, 1, 2);
        g2d.fillRect(72 + x, 115 + y, 1, 17);
        g2d.fillRect(82 + x, 115 + y, 1, 17);
        g2d.fillRect(72 + x, 134 + y, 1, 2);
        g2d.fillRect(82 + x, 134 + y, 1, 2);
        g2d.fillRect(73 + x, 136 + y, 1, 2);
        g2d.fillRect(74 + x, 136 + y, 1, 2);
        g2d.fillRect(80 + x, 136 + y, 1, 2);
        g2d.fillRect(81 + x, 136 + y, 1, 2);
        g2d.fillRect(75 + x, 137 + y, 5, 1);


        g2d.setColor(new Color(255,0,0,255));
        g2d.fillRect(77 + x, 110 + y, 1, 22);
        g2d.fillRect(76 + x, 111 + y, 1, 21);
        g2d.fillRect(78 + x, 111 + y, 1, 21);
        g2d.fillRect(79 + x, 112 + y, 1, 20);
        g2d.fillRect(74 + x, 113 + y, 1, 19);
        g2d.fillRect(75 + x, 113 + y, 1, 19);
        g2d.fillRect(80 + x, 113 + y, 1, 19);
        g2d.fillRect(73 + x, 115 + y, 1, 3);
        g2d.fillRect(81 + x, 115 + y, 1, 3);
        g2d.fillRect(73 + x, 123 + y, 1, 9);
        g2d.fillRect(81 + x, 123 + y, 1, 9);
        g2d.fillRect(73 + x, 134 + y, 1, 2);
        g2d.fillRect(74 + x, 134 + y, 1, 2);
        g2d.fillRect(75 + x, 134 + y, 1, 3);
        g2d.fillRect(76 + x, 134 + y, 1, 3);
        g2d.fillRect(77 + x, 134 + y, 1, 3);
        g2d.fillRect(78 + x, 134 + y, 1, 3);
        g2d.fillRect(79 + x, 134 + y, 1, 3);
        g2d.fillRect(80 + x, 134 + y, 1, 2);
        g2d.fillRect(81 + x, 134 + y, 1, 2);
    }
}
