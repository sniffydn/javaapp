/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

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
public class Brief0_1 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Brief0_1()
    {
        super(2);
    }

    public Brief0_1(int layer)
    {
        super(layer);
    }

    public Brief0_1(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Brief0_1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintbreif3(x,y,g2d);
    }

    public void paintbreif3(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(128 + x, 89 + y, 4, 1);
        g2d.fillRect(127 + x, 90 + y, 1, 2);
        g2d.fillRect(131 + x, 90 + y, 1, 2);
        g2d.fillRect(130 + x, 91 + y, 1, 1);
        g2d.fillRect(132 + x, 91 + y, 1, 2);
        g2d.fillRect(128 + x, 92 + y, 1, 2);
        g2d.fillRect(129 + x, 92 + y, 1, 1);
        g2d.fillRect(131 + x, 93 + y, 1, 1);
        g2d.fillRect(129 + x, 94 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(130 + x, 90 + y, 1, 1);
        g2d.fillRect(130 + x, 92 + y, 1, 2);
        g2d.fillRect(129 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(128 + x, 90 + y, 1, 2);
        g2d.fillRect(129 + x, 90 + y, 1, 2);
        g2d.fillRect(131 + x, 92 + y, 1, 1);
    }
}
