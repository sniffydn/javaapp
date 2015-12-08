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
public class Frilly3 extends Frilly2
{
    Point pointTwo = null;
    public Frilly3()
    {
        super();
        reset();
    }


    public Frilly3(ColorArray colorSwitch)
    {
        super(colorSwitch);
        reset();
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        super.paint(x, y, g2d);
        g2d.fillRect((int) pointTwo.getX() + x, (int) pointTwo.getY() + y, 1, 1);
        reset();
    }


    public void reset()
    {
        super.reset();
        pointTwo = ImageUtilities.drawRandomPointAround((int) pointOne.getX(), (int) pointOne.getY(), null);
    }


    public static void paintStatic(int x, int y, GraphicsMap g2d)
    {
        g2d.fillRect(x, y, 1, 1);
        Point pointOne = ImageUtilities.drawRandomPointAround(0,0,null);
        Point pointTwo = ImageUtilities.drawRandomPointAround((int) pointOne.getX(), (int) pointOne.getY(), null);
        g2d.fillRect((int) pointOne.getX() + x, (int) pointOne.getY() + y, 1, 1);
        g2d.fillRect((int) pointTwo.getX() + x, (int) pointTwo.getY() + y, 1, 1);
    }
}
