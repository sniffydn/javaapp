/*
 * Shoes0.java
 *
 * Created on March 6, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.as;

import clts.SuperS;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class AS3 extends SuperS
{
    int prevY = -9999;
    int prevYback = -9999;

    /** Creates a new instance of Shoes0 */
    public AS3()
    {
        super();
        drs = true;
        strap = true;
    }

    public AS3(ColorArray colorSwitch)
    {
        super(colorSwitch);
        drs = true;
        strap = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;

        paintForwards(x + tempXpos, tempYpos, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {

        int tempXpos = leftXpos;
        int tempYpos = leftYpos;

        paintBackwards(x + tempXpos, tempYpos, g2d);
    }

    public void paintForwards(int x, int y, GraphicsMap g2d)
    {
        if(prevY == -9999)
        {
            prevY = y;
        }

        int extra = 0;
        if(prevY < y)
        {
            extra = -1;
        }

g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
g2d.fillRect(-3 + x, -15 + y, 2, 1);
g2d.fillRect(1 + x, -14 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY));
g2d.fillRect(-5 + x, -15 + y, 2, 1);
g2d.fillRect(-1 + x, -15 + y, 2, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
g2d.fillRect(2 + x, -13 + y + extra, 2, 1);

prevY = y;
    }

    public void paintBackwards(int x, int y, GraphicsMap g2d)
    {
        if(prevYback == -9999)
        {
            prevYback = y;
        }

        int extra = 0;
        if(prevYback < y)
        {
            extra = -1;
        }

g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
g2d.fillRect(2 + x, -15 + y, 2, 1);
g2d.fillRect(-1 + x, -14 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY));
g2d.fillRect(4 + x, -15 + y, 2, 1);
g2d.fillRect(0 + x, -15 + y, 2, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
g2d.fillRect(-3 + x, -13 + y + extra, 2, 1);

prevYback = y;
    }
}
