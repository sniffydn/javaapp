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
public class GL0 extends SuperTL
{
    int direction = 0;
    public GL0()
    {
        super();
    }

    public GL0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }


    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintGlasses1(offsetX, 0,g2d);
        else
            paintBackGlasses1(offsetX , 0,g2d);
    }

    public void paintGlasses1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 26 + y, 6, 1);
        g2d.fillRect(104 + x, 27 + y, 1, 1);
        g2d.fillRect(110 + x, 27 + y, 2, 1);
        g2d.fillRect(116 + x, 27 + y, 4, 1);
        g2d.fillRect(105 + x, 28 + y, 1, 1);
        g2d.fillRect(111 + x, 28 + y, 2, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 3);
        g2d.fillRect(106 + x, 29 + y, 1, 1);
        g2d.fillRect(112 + x, 29 + y, 3, 1);
        g2d.fillRect(107 + x, 30 + y, 5, 1);
        g2d.fillRect(114 + x, 30 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 4, 1);
    }





    public void paintBackGlasses1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 26 + y, 6, 1);
        g2d.fillRect(111 + x, 27 + y, 1, 1);
        g2d.fillRect(104 + x, 27 + y, 2, 1);
        g2d.fillRect(96 + x, 27 + y, 4, 1);
        g2d.fillRect(110 + x, 28 + y, 1, 1);
        g2d.fillRect(103 + x, 28 + y, 2, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 3);
        g2d.fillRect(109 + x, 29 + y, 1, 1);
        g2d.fillRect(101 + x, 29 + y, 3, 1);
        g2d.fillRect(104 + x, 30 + y, 5, 1);
        g2d.fillRect(101 + x, 30 + y, 1, 1);
        g2d.fillRect(97 + x, 31 + y, 4, 1);
    }

}
