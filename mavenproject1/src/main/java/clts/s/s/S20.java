/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import clts.SuperS;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;
/**
 *
 * @author doubleD
 */
public class S20 extends S11
{
    /** Creates a new instance of Shoes1 */
    public S20()
    {
        super();
        strapAllowed = false;
        notSlenderS = true;
    }

    public S20(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        notSlenderS = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        super.paintRight(x, g2d);
        x = rightXpos + x;
        int y = rightYpos;

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        if(step % 3 == 0)
        {
            g2d.fillRect(5 + x, -46 + y, 1, 1);
            g2d.fillRect(6 + x, -47 + y, 2, 1);
            g2d.fillRect(8 + x, -46 + y, 1, 1);
            g2d.fillRect(7 + x, -45 + y, 1, 2);
            g2d.fillRect(8 + x, -43 + y, 1, 2);
            g2d.fillRect(9 + x, -41 + y, 1, 1);
            g2d.fillRect(6 + x, -45 + y, 1, 1);
            g2d.fillRect(5 + x, -44 + y, 1, 2);
            g2d.fillRect(6 + x, -42 + y, 1, 2);
            g2d.fillRect(7 + x, -40 + y, 1, 1);
        }
        else if(step % 3 == 1)
        {
            g2d.fillRect(5 + x, -46 + y, 1, 1);
            g2d.fillRect(8 + x, -46 + y, 1, 1);
            g2d.fillRect(7 + x, -45 + y, 1, 2);
            g2d.fillRect(8 + x, -43 + y, 1, 3);
            g2d.fillRect(6 + x, -45 + y, 1, 1);
            g2d.fillRect(5 + x, -44 + y, 1, 2);
            g2d.fillRect(6 + x, -42 + y, 1, 3);
            g2d.fillRect(5 + x, -47 + y, 1, 1);
            g2d.fillRect(8 + x, -47 + y, 1, 1);
            g2d.fillRect(6 + x, -48 + y, 2, 1);
        }
        else
        {
            g2d.fillRect(5 + x, -45 + y, 1, 1);
            g2d.fillRect(8 + x, -45 + y, 1, 1);
            g2d.fillRect(6 + x, -44 + y, 2, 1);
            g2d.fillRect(8 + x, -43 + y, 1, 3);
            g2d.fillRect(9 + x, -40 + y, 1, 2);
            g2d.fillRect(5 + x, -43 + y, 1, 2);
            g2d.fillRect(6 + x, -41 + y, 1, 2);
            g2d.fillRect(6 + x, -46 + y, 2, 1);
            g2d.fillRect(7 + x, -39 + y, 1, 2);
        }

    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        super.paintLeft(x, g2d);
        x = leftXpos + x;
        int y = leftYpos;

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));

        if(step % 3 == 0)
        {
            g2d.fillRect(-5 + x, -46 + y, 1, 1);
            g2d.fillRect(-7 + x, -47 + y, 2, 1);
            g2d.fillRect(-8 + x, -46 + y, 1, 1);
            g2d.fillRect(-7 + x, -45 + y, 1, 2);
            g2d.fillRect(-8 + x, -43 + y, 1, 2);
            g2d.fillRect(-9 + x, -41 + y, 1, 1);
            g2d.fillRect(-6 + x, -45 + y, 1, 1);
            g2d.fillRect(-5 + x, -44 + y, 1, 2);
            g2d.fillRect(-6 + x, -42 + y, 1, 2);
            g2d.fillRect(-7 + x, -40 + y, 1, 1);
        }
        else if(step % 3 == 1)
        {
            g2d.fillRect(-5 + x, -46 + y, 1, 1);
            g2d.fillRect(-8 + x, -46 + y, 1, 1);
            g2d.fillRect(-7 + x, -45 + y, 1, 2);
            g2d.fillRect(-8 + x, -43 + y, 1, 3);
            g2d.fillRect(-6 + x, -45 + y, 1, 1);
            g2d.fillRect(-5 + x, -44 + y, 1, 2);
            g2d.fillRect(-6 + x, -42 + y, 1, 3);
            g2d.fillRect(-5 + x, -47 + y, 1, 1);
            g2d.fillRect(-8 + x, -47 + y, 1, 1);
            g2d.fillRect(-7 + x, -48 + y, 2, 1);
        }
        else
        {
            g2d.fillRect(-5 + x, -45 + y, 1, 1);
            g2d.fillRect(-8 + x, -45 + y, 1, 1);
            g2d.fillRect(-7 + x, -44 + y, 2, 1);
            g2d.fillRect(-8 + x, -43 + y, 1, 3);
            g2d.fillRect(-9 + x, -40 + y, 1, 2);
            g2d.fillRect(-5 + x, -43 + y, 1, 2);
            g2d.fillRect(-6 + x, -41 + y, 1, 2);
            g2d.fillRect(-7 + x, -46 + y, 2, 1);
            g2d.fillRect(-7 + x, -39 + y, 1, 2);
        }

    }
}
