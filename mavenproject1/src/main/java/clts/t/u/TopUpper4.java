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
public class TopUpper4 extends TopUpper3
{
    public TopUpper4()
    {
        super();
        prep = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper4(String middle)
    {
        super(middle, 3);
        prep = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper4(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper4(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public TopUpper4(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }
    public TopUpper4(String middle, Piece p)
    {
        super(middle, 3);
        prep = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        super.drawC(x,y,g2d);
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        ImageUtilities.drawLine(97 + x, 49 + y, 102 + x, 41, g2d);
        ImageUtilities.drawLine(112 + x, 40, 122 + x, 49 + y, g2d);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        super.drawD(x,y,g2d);
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        ImageUtilities.drawLine(95 + x, 49 + y, 102 + x, 41, g2d);
        ImageUtilities.drawLine(112 + x, 40, 123 + x, 49 + y, g2d);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        super.draw(x, y, g2d);
        if(middle.equalsIgnoreCase("c"))
        {
            drawC(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("d"))
        {
            drawD(x,y,g2d);
        }

    }
}
