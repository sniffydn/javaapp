/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clts.h.mu;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;

/**
 *
 * @author nyffeldd
 */
public class Make0 extends SuperMU {

    public Make0() {
        super();
    }

    public Make0(ColorArray colorSwitch) {
        super();
        COLORS = colorSwitch;
    }
    
    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        if(Math.random() < .3)
            return new clts.Blank();
        else
            return new MakeUnder();
    }

    public void draw(int x, int y, GraphicsMap g2d) {
    }
}
