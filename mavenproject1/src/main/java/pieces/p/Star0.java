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
import util.ColorArray;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Star0 extends Piece
{
    int prevX = -1;
    int prevY = -1;


    /** Creates a new instance of LittleBow1 */

    public Star0()
    {
        super();
    }


    public Star0(ColorArray colorSwitch)
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

        if(Math.random() < .5)
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(0 + x, -1 + y, 1, 3);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(-2 + x, 0 + y, 1, 1);
            g2d.fillRect(2 + x, 0 + y, 1, 1);
            g2d.fillRect(-1 + x, 0 + y, 1, 3);
            g2d.fillRect(1 + x, 0 + y, 1, 3);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x, 0 + y, 3, 1);
            g2d.fillRect(-1 + x, 1 + y, 3, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(0 + x, -1 + y, 1, 1);
            g2d.fillRect(-2 + x, 0 + y, 1, 1);
            g2d.fillRect(-1 + x, 2 + y, 1, 1);
            g2d.fillRect(1 + x, 2 + y, 1, 1);
            g2d.fillRect(2 + x, 0 + y, 1, 1);

        }

        prevX = x;
        prevY = y;
    }
}
