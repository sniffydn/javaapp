/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.SuperS;
import obsolete.B;
import clts.s.s.S11;
import util.ColorArrayFactory;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class SK7 extends S11
{
    B b = null;
    /** Creates a new instance of Shoes1 */
    public SK7()
    {
        super();
        b = new B(ColorArrayFactory.getArray("m,232,231,231,255"));
        sch = true;
    }

    public SK7(ColorArray colorSwitch)
    {
        super(colorSwitch);
        b = new B(ColorArrayFactory.getArray("m,232,231,231,255"));
        sch = true;
    }

    public void setColors(ColorArray COLORS)
    {
        super.setColors(COLORS);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        b.setStep(step, 0, 0, 0,0);
        super.paintRight(x, g2d);
        b.paintRight(x, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        b.setStep(step, 0, 0, 0,0);
        super.paintLeft(x, g2d);
        b.paintLeft(x, g2d);
    }
}
