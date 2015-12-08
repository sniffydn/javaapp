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
public class Make4 extends Make
{
    {
        includeInAutoPick = false;
    }
    public Make4()
    {
        super();
    }

    public Make4(ColorArray colorSwitch)
    {
        super(colorSwitch);
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
        g2d.fillRect(118 + x, 22 + y, 1, 3);
        g2d.fillRect(105 + x, 23 + y, 1, 11);
        g2d.fillRect(104 + x, 24 + y, 1, 5);
        g2d.fillRect(117 + x, 31 + y, 1, 2);
        g2d.fillRect(116 + x, 33 + y, 1, 1);
        g2d.fillRect(106 + x, 34 + y, 1, 1);
        g2d.fillRect(115 + x, 34 + y, 1, 1);
        g2d.fillRect(107 + x, 35 + y, 1, 1);
        g2d.fillRect(114 + x, 35 + y, 1, 1);
        g2d.fillRect(106 + x, 36 + y, 1, 2);
        g2d.fillRect(108 + x, 36 + y, 1, 1);
        g2d.fillRect(113 + x, 36 + y, 1, 1);
        g2d.fillRect(107 + x, 37 + y, 1, 2);
        g2d.fillRect(109 + x, 37 + y, 4, 1);
        g2d.fillRect(108 + x, 38 + y, 1, 2);
        g2d.fillRect(109 + x, 39 + y, 1, 1);
    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 22 + y, 1, 3);
        g2d.fillRect(110 + x, 23 + y, 1, 11);
        g2d.fillRect(111 + x, 24 + y, 1, 5);
        g2d.fillRect(98 + x, 31 + y, 1, 2);
        g2d.fillRect(99 + x, 33 + y, 1, 1);
        g2d.fillRect(109 + x, 34 + y, 1, 1);
        g2d.fillRect(100 + x, 34 + y, 1, 1);
        g2d.fillRect(108 + x, 35 + y, 1, 1);
        g2d.fillRect(101 + x, 35 + y, 1, 1);
        g2d.fillRect(109 + x, 36 + y, 1, 2);
        g2d.fillRect(107 + x, 36 + y, 1, 1);
        g2d.fillRect(102 + x, 36 + y, 1, 1);
        g2d.fillRect(108 + x, 37 + y, 1, 2);
        g2d.fillRect(103 + x, 37 + y, 4, 1);
        g2d.fillRect(107 + x, 38 + y, 1, 2);
        g2d.fillRect(106 + x, 39 + y, 1, 1);
    }

}
