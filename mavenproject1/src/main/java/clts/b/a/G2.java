/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b.a;

import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class G2 extends G1
{
    /** Creates a new instance of GenericClothes */
    public G2()
    {
        super();
    }

    public G2(int layer)
    {
        super(layer);
    }

    public G2(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public G2(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    protected void paintRight(int x, int y, GraphicsMap g2d)
    {
    }
    
    protected void paintLeft(int x, int y, GraphicsMap g2d)
    {
        x+=7;
        if(step == 0 || step == 1 || step == 7 || step == 8)
        {
            paintBackG1(x,y,g2d);
        }else if(step == 3 || step == 4 || step == 5)
        {
            paintBackG3(x,y,g2d);
        }else if(step == 2 || step == 6)
        {
            paintBackG2(x,y,g2d);
        }else if(step == 9 || step == 15)
        {
            paintBackG4(x,y,g2d);
        }else if(step == 10 || step == 14)
        {
            paintBackG5(x,y,g2d);
        }else if(step == 11 || step == 13 || step == 12)
        {
            paintBackG7(x,y,g2d);
        }
    }
    
}
