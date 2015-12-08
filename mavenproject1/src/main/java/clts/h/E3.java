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
public class E3 extends SuperTL
{
    int direction = 0;
    public E3()
    {
        super();
    }

    public E3(ColorArray colorSwitch)
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
            paintER1f(offsetX, 0, g2d);
        }
        else
        {
            paintBackER1f(offsetX, 0, g2d);
        }
    }
        
    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            paintER1b(offsetX, 0, g2d);
        }
        else
        {
            paintBackER1b(offsetX, 0, g2d);
        }
    }
    
    public void paintER1b(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 32 + y, 1, 1);
        g2d.fillRect(103 + x, 33 + y, 1, 1);
        g2d.fillRect(105 + x, 33 + y, 1, 1);
        g2d.fillRect(102 + x, 34 + y, 1, 1);
        g2d.fillRect(106 + x, 34 + y, 1, 1);
        g2d.fillRect(101 + x, 35 + y, 1, 5);
        g2d.fillRect(107 + x, 35 + y, 1, 5);
        g2d.fillRect(102 + x, 38 + y, 1, 3);
        g2d.fillRect(106 + x, 38 + y, 1, 3);
        g2d.fillRect(103 + x, 39 + y, 1, 2);
        g2d.fillRect(104 + x, 39 + y, 1, 3);
        g2d.fillRect(105 + x, 39 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 41 + y, 1, 1);
    }





    public void paintER1f(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 34 + y, 1, 1);
        g2d.fillRect(118 + x, 35 + y, 1, 1);
        g2d.fillRect(119 + x, 36 + y, 1, 5);
        g2d.fillRect(113 + x, 38 + y, 1, 3);
        g2d.fillRect(114 + x, 39 + y, 1, 3);
        g2d.fillRect(118 + x, 39 + y, 1, 3);
        g2d.fillRect(115 + x, 40 + y, 1, 3);
        g2d.fillRect(116 + x, 40 + y, 1, 3);
        g2d.fillRect(117 + x, 40 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
    }





    public void paintBackER1b(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 32 + y, 1, 1);
        g2d.fillRect(112 + x, 33 + y, 1, 1);
        g2d.fillRect(110 + x, 33 + y, 1, 1);
        g2d.fillRect(113 + x, 34 + y, 1, 1);
        g2d.fillRect(109 + x, 34 + y, 1, 1);
        g2d.fillRect(114 + x, 35 + y, 1, 5);
        g2d.fillRect(108 + x, 35 + y, 1, 5);
        g2d.fillRect(113 + x, 38 + y, 1, 3);
        g2d.fillRect(109 + x, 38 + y, 1, 3);
        g2d.fillRect(112 + x, 39 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 1, 3);
        g2d.fillRect(110 + x, 39 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 41 + y, 1, 1);
    }





    public void paintBackER1f(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 34 + y, 1, 1);
        g2d.fillRect(97 + x, 35 + y, 1, 1);
        g2d.fillRect(96 + x, 36 + y, 1, 5);
        g2d.fillRect(102 + x, 38 + y, 1, 3);
        g2d.fillRect(101 + x, 39 + y, 1, 3);
        g2d.fillRect(97 + x, 39 + y, 1, 3);
        g2d.fillRect(100 + x, 40 + y, 1, 3);
        g2d.fillRect(99 + x, 40 + y, 1, 3);
        g2d.fillRect(98 + x, 40 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
    }


}
