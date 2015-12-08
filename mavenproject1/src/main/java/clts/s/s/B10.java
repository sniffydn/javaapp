/*
 * Shoes1.java
 *
 * Created on March 5, 2007, 4:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.s.s;

import obsolete.*;
import clts.SuperS;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class B10 extends B9
{
    /** Creates a new instance of Shoes1 */
    public B10()
    {
        super();
    }

    public B10(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paintRight(int x, GraphicsMap g2d)
    {
        int tempXpos = rightXpos;
        int tempYpos = rightYpos;
        int additionalY = 0;

        if(step == 0 || step == 8 || step == 9 || step == 10 || step == 11 || step == 12 || step == 13 || step == 14 || step == 15 || step == 16)
        {
//            right.paint(4 + tempXpos + x, -42 + tempYpos, g2d);
        }
        else if(step == 1 || step == 7)
        {
//            right.paint(4 + tempXpos + x, -41 + tempYpos, g2d);
            additionalY = 1;
        }
        else if(step == 2 || step == 6)
        {
//            right.paint(4 + tempXpos + x, -40 + tempYpos, g2d);
            additionalY = 2;
        }
        else if(step == 3 || step == 4 || step == 5)
        {
//            right.paint(4 + tempXpos + x, -38 + tempYpos, g2d);
            additionalY = 4;
        }
        super.paintRight(x, g2d);
        
        int totalY = tempYpos + additionalY;
        
        if(prevRight < totalY)
        {
            paintB1(tempXpos + x, totalY, g2d);
        }
        else if(prevRight > totalY)
        {
            paintB3(tempXpos + x, totalY, g2d);
        }
        else
        {
            paintB2(tempXpos + x, totalY, g2d);
        }
        
        prevRight = totalY;
    }
    int prevRight = 0;

    public void paintLeft(int x, GraphicsMap g2d)
    {
        int tempXpos = leftXpos;
        int tempYpos = leftYpos;
        int additionalY = 0;

        if(step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5 || step == 6 || step == 7 || step == 8)
        {
//            left.paint(-4 + tempXpos + x, -42 + tempYpos, g2d);
        }
        else if(step == 9 || step == 15)
        {
//            left.paint(-4 + tempXpos + x, -41 + tempYpos, g2d);
            additionalY = 1;
        }
        else if(step == 10 || step == 14)
        {
//            left.paint(-4 + tempXpos + x, -40 + tempYpos, g2d);
            additionalY = 2;
        }
        else if(step == 11 || step == 12 || step == 13)
        {
//            left.paint(-4 + tempXpos + x, -38 + tempYpos, g2d);
            additionalY = 4;
        }
        super.paintLeft(x, g2d);
        
        int totalY = tempYpos + additionalY;
        
        
        if(prevLeft < totalY)
        {
            paintBackB1(tempXpos + x, totalY, g2d);
        }
        else if(prevLeft > totalY)
        {
            paintBackB3(tempXpos + x, totalY, g2d);
        }
        else
        {
            paintBackB2(tempXpos + x, totalY, g2d);
        }
        
        
        prevLeft = totalY;
    }
    int prevLeft = 0;
    
    public void paintB1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(4 + x, -40 + y, 1, 3);
        g2d.fillRect(5 + x, -39 + y, 1, 1);
        g2d.fillRect(6 + x, -37 + y, 2, 1);
        g2d.fillRect(4 + x, -36 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 1);
        g2d.fillRect(6 + x, -35 + y, 1, 2);
        g2d.fillRect(5 + x, -34 + y, 1, 1);
        g2d.fillRect(7 + x, -34 + y, 1, 1);
        g2d.fillRect(8 + x, -33 + y, 1, 1);
        g2d.fillRect(7 + x, -32 + y, 1, 1);
        g2d.fillRect(6 + x, -30 + y, 2, 1);
        g2d.fillRect(7 + x, -29 + y, 1, 1);
        g2d.fillRect(8 + x, -28 + y, 1, 1);
        g2d.fillRect(7 + x, -27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(6 + x, -39 + y, 1, 1);
        g2d.fillRect(7 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 2, 1);
        g2d.fillRect(6 + x, -36 + y, 1, 1);
        g2d.fillRect(6 + x, -32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(6 + x, -31 + y, 1, 1);
    }


    public void paintB2(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(4 + x, -40 + y, 1, 3);
        g2d.fillRect(5 + x, -39 + y, 1, 1);
        g2d.fillRect(6 + x, -37 + y, 2, 1);
        g2d.fillRect(4 + x, -36 + y, 1, 2);
        g2d.fillRect(7 + x, -36 + y, 1, 1);
        g2d.fillRect(6 + x, -35 + y, 1, 2);
        g2d.fillRect(5 + x, -34 + y, 1, 1);
        g2d.fillRect(7 + x, -34 + y, 1, 1);
        g2d.fillRect(8 + x, -33 + y, 1, 2);
        g2d.fillRect(7 + x, -32 + y, 1, 2);
        g2d.fillRect(6 + x, -29 + y, 2, 1);
        g2d.fillRect(7 + x, -28 + y, 1, 1);
        g2d.fillRect(8 + x, -27 + y, 1, 1);
        g2d.fillRect(7 + x, -26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(6 + x, -39 + y, 1, 1);
        g2d.fillRect(7 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 2, 1);
        g2d.fillRect(6 + x, -36 + y, 1, 1);
        g2d.fillRect(6 + x, -31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(6 + x, -30 + y, 1, 1);
    }


    public void paintB3(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(4 + x, -40 + y, 1, 3);
        g2d.fillRect(5 + x, -39 + y, 1, 1);
        g2d.fillRect(6 + x, -37 + y, 2, 1);
        g2d.fillRect(4 + x, -36 + y, 1, 3);
        g2d.fillRect(7 + x, -36 + y, 1, 1);
        g2d.fillRect(6 + x, -35 + y, 1, 2);
        g2d.fillRect(5 + x, -34 + y, 1, 1);
        g2d.fillRect(7 + x, -34 + y, 1, 1);
        g2d.fillRect(8 + x, -33 + y, 1, 3);
        g2d.fillRect(7 + x, -31 + y, 1, 2);
        g2d.fillRect(6 + x, -28 + y, 2, 1);
        g2d.fillRect(7 + x, -27 + y, 1, 1);
        g2d.fillRect(8 + x, -26 + y, 1, 1);
        g2d.fillRect(7 + x, -25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(6 + x, -39 + y, 1, 1);
        g2d.fillRect(7 + x, -38 + y, 1, 1);
        g2d.fillRect(4 + x, -37 + y, 2, 1);
        g2d.fillRect(6 + x, -36 + y, 1, 1);
        g2d.fillRect(6 + x, -30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(6 + x, -29 + y, 1, 1);
    }


    public void paintBackB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-4 + x, -40 + y, 1, 3);
        g2d.fillRect(-5 + x, -39 + y, 1, 1);
        g2d.fillRect(-7 + x, -37 + y, 2, 1);
        g2d.fillRect(-4 + x, -36 + y, 1, 2);
        g2d.fillRect(-7 + x, -36 + y, 1, 1);
        g2d.fillRect(-6 + x, -35 + y, 1, 2);
        g2d.fillRect(-5 + x, -34 + y, 1, 1);
        g2d.fillRect(-7 + x, -34 + y, 1, 1);
        g2d.fillRect(-8 + x, -33 + y, 1, 1);
        g2d.fillRect(-7 + x, -32 + y, 1, 1);
        g2d.fillRect(-7 + x, -30 + y, 2, 1);
        g2d.fillRect(-7 + x, -29 + y, 1, 1);
        g2d.fillRect(-8 + x, -28 + y, 1, 1);
        g2d.fillRect(-7 + x, -27 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, -39 + y, 1, 1);
        g2d.fillRect(-7 + x, -38 + y, 1, 1);
        g2d.fillRect(-5 + x, -37 + y, 2, 1);
        g2d.fillRect(-6 + x, -36 + y, 1, 1);
        g2d.fillRect(-6 + x, -32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-6 + x, -31 + y, 1, 1);
    }


    public void paintBackB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-4 + x, -40 + y, 1, 3);
        g2d.fillRect(-5 + x, -39 + y, 1, 1);
        g2d.fillRect(-7 + x, -37 + y, 2, 1);
        g2d.fillRect(-4 + x, -36 + y, 1, 2);
        g2d.fillRect(-7 + x, -36 + y, 1, 1);
        g2d.fillRect(-6 + x, -35 + y, 1, 2);
        g2d.fillRect(-5 + x, -34 + y, 1, 1);
        g2d.fillRect(-7 + x, -34 + y, 1, 1);
        g2d.fillRect(-8 + x, -33 + y, 1, 2);
        g2d.fillRect(-7 + x, -32 + y, 1, 2);
        g2d.fillRect(-7 + x, -29 + y, 2, 1);
        g2d.fillRect(-7 + x, -28 + y, 1, 1);
        g2d.fillRect(-8 + x, -27 + y, 1, 1);
        g2d.fillRect(-7 + x, -26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, -39 + y, 1, 1);
        g2d.fillRect(-7 + x, -38 + y, 1, 1);
        g2d.fillRect(-5 + x, -37 + y, 2, 1);
        g2d.fillRect(-6 + x, -36 + y, 1, 1);
        g2d.fillRect(-6 + x, -31 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-6 + x, -30 + y, 1, 1);
    }


    public void paintBackB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(-4 + x, -40 + y, 1, 3);
        g2d.fillRect(-5 + x, -39 + y, 1, 1);
        g2d.fillRect(-7 + x, -37 + y, 2, 1);
        g2d.fillRect(-4 + x, -36 + y, 1, 3);
        g2d.fillRect(-7 + x, -36 + y, 1, 1);
        g2d.fillRect(-6 + x, -35 + y, 1, 2);
        g2d.fillRect(-5 + x, -34 + y, 1, 1);
        g2d.fillRect(-7 + x, -34 + y, 1, 1);
        g2d.fillRect(-8 + x, -33 + y, 1, 3);
        g2d.fillRect(-7 + x, -31 + y, 1, 2);
        g2d.fillRect(-7 + x, -28 + y, 2, 1);
        g2d.fillRect(-7 + x, -27 + y, 1, 1);
        g2d.fillRect(-8 + x, -26 + y, 1, 1);
        g2d.fillRect(-7 + x, -25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-6 + x, -39 + y, 1, 1);
        g2d.fillRect(-7 + x, -38 + y, 1, 1);
        g2d.fillRect(-5 + x, -37 + y, 2, 1);
        g2d.fillRect(-6 + x, -36 + y, 1, 1);
        g2d.fillRect(-6 + x, -30 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(-6 + x, -29 + y, 1, 1);
    }
}
