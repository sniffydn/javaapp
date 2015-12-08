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
public class GlareStrips extends SuperTL
{
    protected int direction = 0;
    protected int eye = 0;
    public GlareStrips()
    {
        super();
    }

    public GlareStrips(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }
    
    public void paintFront(int offsetX,  int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX,  offsetY, g2d);
        draw(offsetX, offsetY, g2d);
    }
    
    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
        this.eye = eye;
    }
    
    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(direction == 1)
        {            
            paintH(x,0,g2d);
        }
        else
        {
            paintBackH(x,0,g2d);
        }
    }
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 31 + y, 4, 1);
        g2d.fillRect(116 + x, 31 + y, 2, 1);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 30 + y, 2, 1);

    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 31 + y, 4, 1);
        g2d.fillRect(98 + x, 31 + y, 2, 1);
        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 30 + y, 2, 1);

    }

}
