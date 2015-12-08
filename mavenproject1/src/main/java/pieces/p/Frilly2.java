/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pieces.p;

import clts.Piece;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import java.awt.Point;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Frilly2 extends Piece
{
    Point pointOne = null;
    public Frilly2()
    {
        super();
        reset();
    }


    public Frilly2(ColorArray colorSwitch)
    {
        super(colorSwitch);
        reset();
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        g2d.fillRect(x, y, 1, 1);
        g2d.fillRect((int) pointOne.getX() + x, (int) pointOne.getY() + y, 1, 1);
        reset();
    }

    public void reset()
    {
        pointOne = ImageUtilities.drawRandomPointAround(0,0,null);
    }

    public static void paintStatic(int x, int y, GraphicsMap g2d)
    {
        g2d.fillRect(x, y, 1, 1);
        Point pointOne = ImageUtilities.drawRandomPointAround(0,0,null);
        g2d.fillRect((int) pointOne.getX() + x, (int) pointOne.getY() + y, 1, 1);
    }
}
