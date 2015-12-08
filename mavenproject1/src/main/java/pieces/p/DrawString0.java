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
public class DrawString0 extends Piece
{
    int prevY = -1;
    int prevDiffY = 0;
    int prevprevDiffY = 0;
    int prevprevprevDiffY = 0;

    /** Creates a new instance of DrawString0 */

    public DrawString0()
    {
    }

    public DrawString0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        if(prevY == -1)
        {
            prevY = y;
        }

        int diffY = prevY - y;
        g2d.fillRect(x, y, 2, 1);

        int offsetY = 1;
        if(diffY != 0 || prevprevprevDiffY != 0)
            offsetY = 0;
        g2d.fillRect(x - 1, y + offsetY, 1, 1);
        g2d.fillRect(x + 2, y + offsetY, 1, 1);

        prevprevprevDiffY = prevprevDiffY;
        prevprevDiffY = prevDiffY;
        prevDiffY = diffY;
        prevY = y;
    }

    public String toString()
    {
        return "DrawString0";
    }
}
