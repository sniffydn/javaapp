/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.h.mu;

import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Make3 extends Make
{
    public Make3()
    {
        super();
    }

    public Make3(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }
    
    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        if(Math.random() < .3)
            return new clts.Blank();
        else
            return new MakeUnder();
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
        g2d.fillRect(107 + x, 25 + y, 2, 1);
        g2d.fillRect(109 + x, 26 + y, 2, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);
        g2d.fillRect(111 + x, 27 + y, 1, 1);
        g2d.fillRect(116 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(118 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 24 + y, 3, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);
        g2d.fillRect(110 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 25 + y, 2, 1);
        g2d.fillRect(105 + x, 26 + y, 2, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);
        g2d.fillRect(104 + x, 27 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 25 + y, 1, 1);
        g2d.fillRect(106 + x, 25 + y, 1, 1);
        g2d.fillRect(97 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 24 + y, 3, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);
        g2d.fillRect(105 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
    }


}
