/*
 * Shoes0.java
 *
 * Created on March 6, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import clts.SuperS;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class S41 extends SuperS
{

    /** Creates a new instance of Shoes0 */
    public S41()
    {
        super();
        platzHeight = 0;
    }

    public S41(ColorArray colorSwitch)
    {
        super(colorSwitch);
        platzHeight = 0;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        
        paintH(x + tempXpos, tempYpos, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;
        
        paintBackH(x + tempXpos, tempYpos, g2d);
    }
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(-3 + x, -5 + y, 2, 1);
        g2d.fillRect(-5 + x, -4 + y, 2, 1);
        g2d.fillRect(-1 + x, -4 + y, 2, 1);
        g2d.fillRect(-7 + x, -3 + y, 2, 1);
        g2d.fillRect(-7 + x, -1 + y, 1, 2);
        g2d.fillRect(0 + x, -1 + y, 1, 2);
        g2d.fillRect(-6 + x, 0 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, -6 + y, 3, 1);
        g2d.fillRect(-1 + x, -6 + y, 2, 1);
    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(2 + x, -5 + y, 2, 1);
        g2d.fillRect(4 + x, -4 + y, 2, 1);
        g2d.fillRect(0 + x, -4 + y, 2, 1);
        g2d.fillRect(6 + x, -3 + y, 2, 1);
        g2d.fillRect(7 + x, -1 + y, 1, 2);
        g2d.fillRect(0 + x, -1 + y, 1, 2);
        g2d.fillRect(1 + x, 0 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(4 + x, -6 + y, 3, 1);
        g2d.fillRect(0 + x, -6 + y, 2, 1);
    }
}
