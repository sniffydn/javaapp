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
public class TopUpper19 extends TopUpper18
{
    public TopUpper19()
    {
        super();
        swim = true;
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper19(String middle)
    {
        super(middle, 3);
        swim = true;
    }

    public TopUpper19(String middle, int layer)
    {
        super(middle, layer);
        swim = true;
    }

    public TopUpper19(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        swim = true;
    }

    public TopUpper19(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        swim = true;
    }
    public TopUpper19(String middle, Piece p)
    {
        super(middle, 3);
        swim = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(middle.equalsIgnoreCase("c"))
        {
            drawC(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("d"))
        {
            drawD(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
        }
    }
}
