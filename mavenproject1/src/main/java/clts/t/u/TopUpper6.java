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
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopUpper6 extends TopUpper5
{
    public TopUpper6()
    {
        super();
        sch = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper6(String middle)
    {
        super(middle, 3);
        sch = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper6(String middle, int layer)
    {
        super(middle, layer);
        sch = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper6(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        sch = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper6(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        sch = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        super.draw(x, y, g2d);
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        ImageUtilities.drawLine(100 + x, 47 + y, 102 + x, 41, g2d);
        ImageUtilities.drawLine(112 + x, 40, 120 + x, 47 + y, g2d);

    }
}
