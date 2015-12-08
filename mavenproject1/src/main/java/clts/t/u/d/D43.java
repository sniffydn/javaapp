/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.d;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D43 extends D44
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D43()
    {
        super();
    }

    public D43(String middle)
    {
        super(middle);
    }

    public D43(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        super.drawUpper(x, y, g2d);
        paintTL1(x, 0, g2d);
    }


}
