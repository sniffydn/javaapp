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
public class S25 extends S11
{
    /** Creates a new instance of Shoes1 */
    public S25()
    {
        super();
        strapAllowed = false;
        notSlenderS = true;
    }

    public S25(ColorArray colorSwitch)
    {
        super(colorSwitch);
        strapAllowed = false;
        notSlenderS = true;
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        super.paintRight(x,g2d);
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
            paintr(x + tempXpos, tempYpos, g2d);
        }
        else if(step == 1 || step == 7)
        {
            paintr(x + tempXpos, tempYpos + 1, g2d);
        }
        else if(step == 2 || step == 6)
        {
            paintr(x + tempXpos, tempYpos + 3, g2d);
        }
        else if(step == 3 || step == 4 || step == 5)
        {
            paintr(x + tempXpos, tempYpos + 6, g2d);
        }
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        super.paintLeft(x,g2d);
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;


        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
            paintl(x + tempXpos, tempYpos, g2d);
        }
        else if(step == 9 || step == 15)
        {
            paintl(x + tempXpos, tempYpos + 1, g2d);
        }
        else if(step == 10 || step == 14)
        {
            paintl(x + tempXpos, tempYpos + 3, g2d);
        }
        else if(step == 11 || step == 12 || step == 13)
        {
            paintl(x + tempXpos, tempYpos + 6, g2d);
        }
    }
    
    public void paintl(int x, int y, GraphicsMap g2d)
    {
        y = y + 1;
        if(prevYl == -9999)
            prevYl = y;
        
        if(prevYl == y)
        {
            paintln(x,y,g2d);
        }else if(prevYl < y)
        {
            paintll(x,y,g2d);
        }else
        {
            paintlu(x,y,g2d);
        }
        
        prevYl = y;
    }
    
    int prevYl = -9999;
    
    public void paintr(int x, int y, GraphicsMap g2d)
    {
        x = x - 4;
        y = y + 1;

        if(prevYr == -9999)
            prevYr = y;
        
        if(prevYr == y)
        {
            paintrn(x,y,g2d);
        }else if(prevYr < y)
        {
            paintrl(x,y,g2d);
        }else
        {
            paintru(x,y,g2d);
        }
        
        prevYr = y;
    }
    
    int prevYr = -9999;

    public void paintll(int x, int y, GraphicsMap g2d)
    {
        g2d.fillRect(-5 + x, -46 + y, 1, 1);
        g2d.fillRect(-6 + x, -45 + y, 1, 1);
        g2d.fillRect(-7 + x, -44 + y, 1, 2);
        g2d.fillRect(-6 + x, -42 + y, 1, 1);
        g2d.fillRect(-9 + x, -42 + y, 1, 1);
        g2d.fillRect(-8 + x, -41 + y, 2, 1);
    }
    
    public void paintrl(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(9 + x, -47 + y, 2, 1);
        g2d.fillRect(11 + x, -46 + y, 1, 1);
        g2d.fillRect(12 + x, -45 + y, 1, 2);
        g2d.fillRect(10 + x, -44 + y, 1, 2);
        g2d.fillRect(11 + x, -43 + y, 1, 1);
        g2d.fillRect(12 + x, -42 + y, 1, 1);
        g2d.fillRect(13 + x, -41 + y, 1, 2);
        g2d.fillRect(12 + x, -39 + y, 1, 1);
        g2d.fillRect(11 + x, -38 + y, 1, 1);
        g2d.fillRect(10 + x, -37 + y, 1, 1);
        g2d.fillRect(14 + x, -37 + y, 1, 1);
        g2d.fillRect(11 + x, -36 + y, 3, 1);
    }
    
    public void paintln(int x, int y, GraphicsMap g2d)
    {
        g2d.fillRect(-5 + x, -46 + y, 1, 1);
        g2d.fillRect(-6 + x, -45 + y, 1, 2);
        g2d.fillRect(-7 + x, -43 + y, 1, 2);
        g2d.fillRect(-6 + x, -41 + y, 1, 2);
        g2d.fillRect(-9 + x, -40 + y, 1, 1);
        g2d.fillRect(-8 + x, -39 + y, 2, 1);
    }
    
    public void paintrn(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(9 + x, -47 + y, 2, 1);
        g2d.fillRect(11 + x, -46 + y, 1, 1);
        g2d.fillRect(12 + x, -45 + y, 1, 3);
        g2d.fillRect(10 + x, -43 + y, 1, 2);
        g2d.fillRect(11 + x, -42 + y, 1, 1);
        g2d.fillRect(12 + x, -41 + y, 1, 1);
        g2d.fillRect(13 + x, -40 + y, 1, 3);
        g2d.fillRect(12 + x, -37 + y, 1, 1);
        g2d.fillRect(11 + x, -36 + y, 1, 1);
        g2d.fillRect(10 + x, -35 + y, 1, 2);
        g2d.fillRect(14 + x, -34 + y, 1, 1);
        g2d.fillRect(11 + x, -33 + y, 3, 1);
    }
   
    public void paintlu(int x, int y, GraphicsMap g2d)
    {
        g2d.fillRect(-5 + x, -46 + y, 1, 1);
        g2d.fillRect(-6 + x, -45 + y, 1, 2);
        g2d.fillRect(-7 + x, -43 + y, 1, 3);
        g2d.fillRect(-6 + x, -40 + y, 1, 3);
        g2d.fillRect(-9 + x, -38 + y, 1, 1);
        g2d.fillRect(-8 + x, -37 + y, 2, 1);
    }
    
    public void paintru(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(9 + x, -47 + y, 2, 1);
        g2d.fillRect(11 + x, -46 + y, 1, 1);
        g2d.fillRect(12 + x, -45 + y, 1, 4);
        g2d.fillRect(10 + x, -42 + y, 1, 2);
        g2d.fillRect(11 + x, -41 + y, 1, 1);
        g2d.fillRect(12 + x, -40 + y, 1, 1);
        g2d.fillRect(13 + x, -39 + y, 1, 4);
        g2d.fillRect(12 + x, -35 + y, 1, 1);
        g2d.fillRect(11 + x, -34 + y, 1, 1);
        g2d.fillRect(10 + x, -33 + y, 1, 3);
        g2d.fillRect(14 + x, -31 + y, 1, 1);
        g2d.fillRect(11 + x, -30 + y, 3, 1);
    }
}
