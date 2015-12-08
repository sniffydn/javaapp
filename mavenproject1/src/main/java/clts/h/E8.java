/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.h;

import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class E8 extends SuperTL
{
    int direction = 0;
    public E8()
    {
        super();
    }

    public E8(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }

     public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            paintR(offsetX, 0, g2d);
        }
        else
        {
            paintBackR(offsetX, 0, g2d);
        }
    }
        
    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            paintL(offsetX, 0, g2d);
        }
        else
        {
            paintBackL(offsetX, 0, g2d);
        }
    }
    
    public void paintR(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 34 + y, 1, 1);
        g2d.fillRect(118 + x, 35 + y, 1, 2);
        g2d.fillRect(118 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 37 + y, 1, 1);
        g2d.fillRect(118 + x, 39 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 1);
    }





    public void paintL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 31 + y, 1, 1);
        g2d.fillRect(105 + x, 32 + y, 1, 1);
        g2d.fillRect(106 + x, 33 + y, 1, 1);
        g2d.fillRect(106 + x, 35 + y, 1, 1);
        g2d.fillRect(106 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 34 + y, 1, 1);
        g2d.fillRect(106 + x, 36 + y, 1, 1);
        g2d.fillRect(106 + x, 38 + y, 1, 1);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
    }





    public void paintBackR(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 34 + y, 1, 1);
        g2d.fillRect(97 + x, 35 + y, 1, 2);
        g2d.fillRect(97 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
    }





    public void paintBackL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 31 + y, 1, 1);
        g2d.fillRect(110 + x, 32 + y, 1, 1);
        g2d.fillRect(109 + x, 33 + y, 1, 1);
        g2d.fillRect(109 + x, 35 + y, 1, 1);
        g2d.fillRect(109 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(111 + x, 40 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 34 + y, 1, 1);
        g2d.fillRect(109 + x, 36 + y, 1, 1);
        g2d.fillRect(109 + x, 38 + y, 1, 1);
        g2d.fillRect(110 + x, 39 + y, 1, 1);
    }

}
