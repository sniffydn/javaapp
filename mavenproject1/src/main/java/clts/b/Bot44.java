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
public class Bot44 extends Bot36
{
    /** Creates a new instance of GenericClothes */
    public Bot44()
    {
        super();
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot44(int layer)
    {
        super(layer);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot44(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public Bot44(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        shrt = true;
        under = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        super.draw(x,y,g2d);

        g2d.setLeftStrap(105 + x, 88 + y);
        g2d.setRightStrap(117 + x, 88 + y);
    }
}
