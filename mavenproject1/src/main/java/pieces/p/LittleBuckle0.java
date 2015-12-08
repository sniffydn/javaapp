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
public class LittleBuckle0 extends Piece
{
    /** Creates a new instance of LittleBow1 */

    boolean right = true;
    public LittleBuckle0()
    {
        super();
    }

    public LittleBuckle0(boolean isRight)
    {
        super();
        right = isRight;
    }

    public LittleBuckle0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public LittleBuckle0(ColorArray colorSwitch, boolean isRight)
    {
        super(colorSwitch);
        right = isRight;
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        if(right)
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(1 + x, -1 + y, 2, 1);
            g2d.fillRect(3 + x, 0 + y, 1, 1);
            g2d.fillRect(0 + x, 0 + y, 1, 2);
            g2d.fillRect(1 + x, 2 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(4 + x, 0 + y, 2, 1);
            g2d.fillRect(6 + x, 1 + y, 1, 1);
            g2d.fillRect(3 + x, 1 + y, 1, 2);
            g2d.fillRect(4 + x, 3 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(6 + x, 2 + y, 1, 1);
            g2d.fillRect(5 + x, 3 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-1 + x, -1 + y, 2, 1);
            g2d.fillRect(-2 + x, 0 + y, 1, 1);
            g2d.fillRect(1 + x, 0 + y, 1, 2);
            g2d.fillRect(-1 + x, 2 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-5 + x, 1 + y, 1, 1);
            g2d.fillRect(-4 + x, 0 + y, 2, 1);
            g2d.fillRect(-2 + x, 1 + y, 1, 2);
            g2d.fillRect(-3 + x, 3 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(-5 + x, 2 + y, 1, 1);
            g2d.fillRect(-4 + x, 3 + y, 1, 1);
        }

    }
}
