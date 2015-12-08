/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pieces.p;

import util.Color;
import util.GraphicsMap;
import java.awt.Point;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Frilly4 extends Frilly3
{
    Point pointThree = null;
    public Frilly4()
    {
        super();
        reset();
    }


    public Frilly4(ColorArray colorSwitch)
    {
        super(colorSwitch);
        reset();
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        super.paint(x, y, g2d);
        g2d.fillRect((int) pointThree.getX() + x, (int) pointThree.getY() + y, 1, 1);
        reset();
    }


    public void reset()
    {
        super.reset();
        pointThree = ImageUtilities.drawRandomPointAround((int) pointTwo.getX(), (int) pointTwo.getY(), null);
    }
}
