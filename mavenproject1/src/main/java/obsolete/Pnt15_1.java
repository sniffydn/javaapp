/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.b.*;
import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Pnt15_1 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt15_1()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt15_1(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt15_1(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt15_1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintS(x,y,g2d);
    }
    
    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
    
    public void paintS(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 161 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(93 + x, 161 + y, 3, 1);
        g2d.fillRect(98 + x, 161 + y, 2, 1);
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(121 + x, 161 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(116 + x, 161 + y, 1, 2);
        g2d.fillRect(117 + x, 161 + y, 1, 3);
        g2d.fillRect(118 + x, 161 + y, 1, 4);
        g2d.fillRect(119 + x, 161 + y, 1, 4);
        g2d.fillRect(120 + x, 161 + y, 1, 3);
        g2d.fillRect(93 + x, 162 + y, 6, 1);
        g2d.fillRect(121 + x, 162 + y, 1, 1);
        g2d.fillRect(94 + x, 163 + y, 4, 1);
        g2d.fillRect(95 + x, 164 + y, 2, 1);
    }

}
