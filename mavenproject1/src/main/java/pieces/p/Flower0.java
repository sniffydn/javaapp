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
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Flower0 extends Piece
{
    int prevX = -1;
    int prevY = -1;


    /** Creates a new instance of LittleBow1 */

    public Flower0()
    {
        super();
    }


    public Flower0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        if(prevX == -1 && prevY == -1)
        {
            prevX = x;
            prevY = y;
        }

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-1 + x, -5 + y, 3, 3);
        g2d.fillRect(0 + x, -2 + y, 1, 1);
        g2d.fillRect(4 + x, -3 + y, 2, 3);
        g2d.fillRect(3 + x, -2 + y, 1, 2);
        g2d.fillRect(4 + x, 1 + y, 2, 3);
        g2d.fillRect(3 + x, 2 + y, 1, 2);
        g2d.fillRect(0 + x, 3 + y, 2, 2);
        g2d.fillRect(2 + x, 4 + y, 1, 3);
        g2d.fillRect(1 + x, 5 + y, 1, 2);
        g2d.fillRect(-5 + x, -2 + y, 3, 2);
        g2d.fillRect(-4 + x, 0 + y, 2, 1);
        g2d.fillRect(-3 + x, 2 + y, 1, 1);
        g2d.fillRect(-4 + x, 3 + y, 3, 2);
        g2d.fillRect(-5 + x, 4 + y, 1, 2);
        g2d.fillRect(-4 + x, 5 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-1 + x, -6 + y, 3, 1);
        g2d.fillRect(-2 + x, -5 + y, 1, 4);
        g2d.fillRect(-1 + x, -2 + y, 1, 2);
        g2d.fillRect(1 + x, -2 + y, 1, 2);
        g2d.fillRect(2 + x, -5 + y, 1, 4);
        g2d.fillRect(3 + x, -3 + y, 1, 1);
        g2d.fillRect(4 + x, -4 + y, 2, 1);
        g2d.fillRect(6 + x, -3 + y, 1, 3);
        g2d.fillRect(2 + x, 0 + y, 4, 1);
        g2d.fillRect(2 + x, 1 + y, 2, 1);
        g2d.fillRect(6 + x, 1 + y, 1, 3);
        g2d.fillRect(2 + x, 3 + y, 1, 1);
        g2d.fillRect(3 + x, 4 + y, 3, 1);
        g2d.fillRect(3 + x, 5 + y, 1, 2);
        g2d.fillRect(1 + x, 7 + y, 2, 1);
        g2d.fillRect(0 + x, 5 + y, 1, 2);
        g2d.fillRect(-1 + x, 2 + y, 1, 3);
        g2d.fillRect(1 + x, 2 + y, 1, 1);
        g2d.fillRect(-2 + x, 5 + y, 1, 1);
        g2d.fillRect(-5 + x, -3 + y, 3, 1);
        g2d.fillRect(-6 + x, -2 + y, 1, 3);
        g2d.fillRect(-5 + x, 0 + y, 1, 2);
        g2d.fillRect(-4 + x, 1 + y, 3, 1);
        g2d.fillRect(-2 + x, 0 + y, 1, 1);
        g2d.fillRect(-4 + x, 2 + y, 1, 1);
        g2d.fillRect(-5 + x, 3 + y, 1, 1);
        g2d.fillRect(-6 + x, 4 + y, 1, 2);
        g2d.fillRect(-5 + x, 6 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-2 + x, -1 + y, 1, 1);
        g2d.fillRect(-2 + x, 2 + y, 1, 1);
        g2d.fillRect(2 + x, -1 + y, 1, 1);
        g2d.fillRect(2 + x, 2 + y, 1, 1);
        g2d.fillRect(-1 + x, 0 + y, 1, 2);
        g2d.fillRect(0 + x, -1 + y, 1, 4);
        g2d.fillRect(1 + x, 0 + y, 1, 2);


        prevX = x;
        prevY = y;
    }
}
