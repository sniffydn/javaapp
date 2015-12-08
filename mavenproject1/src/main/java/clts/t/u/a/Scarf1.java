/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperTL;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Scarf1 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Scarf1()
    {
        super(2);
    }

    public Scarf1(int layer)
    {
        super(layer);
    }

    public Scarf1(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Scarf1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        if(offsetY != -1)
        {
            paint1S1(offsetX, 0, g2d);
        }
        else
        {
            paint1S(offsetX, 0, g2d);
        }
    }
    
    public void paint1S(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 39 + y, 1, 3);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
        g2d.fillRect(110 + x, 39 + y, 2, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(106 + x, 40 + y, 4, 1);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(105 + x, 41 + y, 1, 14);
        g2d.fillRect(109 + x, 41 + y, 1, 3);
        g2d.fillRect(110 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 2);
        g2d.fillRect(106 + x, 42 + y, 3, 1);
        g2d.fillRect(108 + x, 43 + y, 1, 20);
        g2d.fillRect(110 + x, 43 + y, 1, 6);
        g2d.fillRect(102 + x, 44 + y, 1, 9);
        g2d.fillRect(111 + x, 48 + y, 1, 12);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 3);
        g2d.fillRect(109 + x, 60 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 40 + y, 1, 1);
        g2d.fillRect(110 + x, 40 + y, 1, 1);
        g2d.fillRect(106 + x, 41 + y, 3, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 9);
        g2d.fillRect(110 + x, 49 + y, 1, 10);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 42 + y, 1, 12);
        g2d.fillRect(109 + x, 44 + y, 1, 16);
    }





    public void paint1S1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 39 + y, 1, 3);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
        g2d.fillRect(110 + x, 39 + y, 2, 1);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(106 + x, 40 + y, 4, 1);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(105 + x, 41 + y, 1, 15);
        g2d.fillRect(109 + x, 41 + y, 2, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 2);
        g2d.fillRect(106 + x, 42 + y, 3, 1);
        g2d.fillRect(107 + x, 43 + y, 1, 21);
        g2d.fillRect(108 + x, 43 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 10);
        g2d.fillRect(109 + x, 44 + y, 1, 6);
        g2d.fillRect(110 + x, 49 + y, 1, 12);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(108 + x, 61 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 40 + y, 1, 1);
        g2d.fillRect(110 + x, 40 + y, 1, 1);
        g2d.fillRect(106 + x, 41 + y, 3, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 10);
        g2d.fillRect(109 + x, 50 + y, 1, 10);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 42 + y, 1, 13);
        g2d.fillRect(108 + x, 45 + y, 1, 16);
    }
}
