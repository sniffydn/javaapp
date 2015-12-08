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
public class E5 extends SuperTL
{
    int direction = 0;
    public E5()
    {
        super();
    }

    public E5(ColorArray colorSwitch)
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
            paintE1(offsetX, 0, g2d);
        }
        else
        {
            paintBackE1(offsetX, 0, g2d);
        }
    }
        
    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            paintE2(offsetX, 0, g2d);
        }
        else
        {
            paintBackE2(offsetX, 0, g2d);
        }
    }
    
    public void paintE1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 33 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(115 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 37 + y, 1, 1);
        g2d.fillRect(118 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 36 + y, 1, 1);
        g2d.fillRect(119 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 33 + y, 1, 1);
        g2d.fillRect(119 + x, 37 + y, 1, 2);
        g2d.fillRect(116 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 36 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 1);
    }





    public void paintE2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 31 + y, 1, 1);
        g2d.fillRect(102 + x, 34 + y, 1, 1);
        g2d.fillRect(106 + x, 35 + y, 1, 1);
        g2d.fillRect(106 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 31 + y, 1, 3);
        g2d.fillRect(103 + x, 31 + y, 1, 1);
        g2d.fillRect(106 + x, 32 + y, 1, 1);
        g2d.fillRect(106 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 31 + y, 1, 1);
        g2d.fillRect(106 + x, 34 + y, 1, 1);
        g2d.fillRect(102 + x, 35 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 37 + y, 1, 1);
        g2d.fillRect(103 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 31 + y, 1, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 38 + y, 1, 1);
    }





    public void paintBackE1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(98 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 33 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(100 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 36 + y, 1, 1);
        g2d.fillRect(96 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 33 + y, 1, 1);
        g2d.fillRect(96 + x, 37 + y, 1, 2);
        g2d.fillRect(99 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 36 + y, 1, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 1);
    }





    public void paintBackE2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(109 + x, 31 + y, 1, 1);
        g2d.fillRect(113 + x, 34 + y, 1, 1);
        g2d.fillRect(109 + x, 35 + y, 1, 1);
        g2d.fillRect(109 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 31 + y, 1, 3);
        g2d.fillRect(112 + x, 31 + y, 1, 1);
        g2d.fillRect(109 + x, 32 + y, 1, 1);
        g2d.fillRect(109 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 31 + y, 1, 1);
        g2d.fillRect(109 + x, 34 + y, 1, 1);
        g2d.fillRect(113 + x, 35 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 37 + y, 1, 1);
        g2d.fillRect(112 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 31 + y, 1, 1);
        g2d.fillRect(110 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 38 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 38 + y, 1, 1);
    }

}
