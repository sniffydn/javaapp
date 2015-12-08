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
public class Butter0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Butter0()
    {
        super(2);
    }

    public Butter0(int layer)
    {
        super(layer);
    }

    public Butter0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Butter0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        switcher = !switcher;
        
        if(switcher)
        {
            paintB2(shiftX, shiftY,g2d);
        }
        else
        {
            paintB1(shiftX, shiftY,g2d);
        }
    }
    
    boolean switcher = true;
    
    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(74 + x, 27 + y, 2, 1);
        g2d.fillRect(73 + x, 28 + y, 1, 2);
        g2d.fillRect(74 + x, 30 + y, 1, 1);
        g2d.fillRect(70 + x, 31 + y, 2, 1);
        g2d.fillRect(69 + x, 32 + y, 1, 2);
        g2d.fillRect(72 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(82 + x, 37 + y, 1, 1);
        g2d.fillRect(78 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(79 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(77 + x, 33 + y, 1, 2);
        g2d.fillRect(78 + x, 35 + y, 1, 1);
        g2d.fillRect(79 + x, 36 + y, 1, 1);
        g2d.fillRect(80 + x, 37 + y, 1, 1);
        g2d.fillRect(81 + x, 38 + y, 1, 1);
        g2d.fillRect(82 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(79 + x, 32 + y, 1, 1);
        g2d.fillRect(73 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(74 + x, 31 + y, 3, 1);
        g2d.fillRect(73 + x, 32 + y, 1, 3);
        g2d.fillRect(74 + x, 35 + y, 3, 1);
        g2d.fillRect(77 + x, 36 + y, 1, 1);
        g2d.fillRect(78 + x, 37 + y, 1, 1);
        g2d.fillRect(79 + x, 38 + y, 1, 1);
        g2d.fillRect(80 + x, 39 + y, 1, 1);
        g2d.fillRect(81 + x, 40 + y, 1, 1);
        g2d.fillRect(83 + x, 40 + y, 1, 2);
        g2d.fillRect(82 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(74 + x, 32 + y, 1, 3);
        g2d.fillRect(75 + x, 32 + y, 2, 1);
        g2d.fillRect(76 + x, 33 + y, 1, 2);
        g2d.fillRect(75 + x, 34 + y, 1, 1);
        g2d.fillRect(77 + x, 35 + y, 1, 1);
        g2d.fillRect(78 + x, 36 + y, 1, 1);
        g2d.fillRect(79 + x, 37 + y, 1, 1);
        g2d.fillRect(80 + x, 38 + y, 1, 1);
        g2d.fillRect(81 + x, 39 + y, 1, 1);
        g2d.fillRect(82 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(75 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(80 + x, 31 + y, 1, 2);
        g2d.fillRect(79 + x, 33 + y, 1, 1);
        g2d.fillRect(75 + x, 37 + y, 2, 1);
        g2d.fillRect(72 + x, 38 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(79 + x, 30 + y, 3, 1);
        g2d.fillRect(78 + x, 31 + y, 1, 1);
        g2d.fillRect(82 + x, 31 + y, 1, 2);
        g2d.fillRect(77 + x, 32 + y, 1, 1);
        g2d.fillRect(81 + x, 33 + y, 1, 1);
        g2d.fillRect(80 + x, 34 + y, 1, 3);
        g2d.fillRect(72 + x, 35 + y, 1, 2);
        g2d.fillRect(73 + x, 35 + y, 1, 1);
        g2d.fillRect(81 + x, 35 + y, 2, 1);
        g2d.fillRect(71 + x, 36 + y, 1, 1);
        g2d.fillRect(83 + x, 36 + y, 1, 1);
        g2d.fillRect(70 + x, 37 + y, 1, 2);
        g2d.fillRect(84 + x, 37 + y, 1, 1);
        g2d.fillRect(77 + x, 38 + y, 1, 2);
        g2d.fillRect(78 + x, 38 + y, 1, 1);
        g2d.fillRect(83 + x, 38 + y, 1, 2);
        g2d.fillRect(71 + x, 39 + y, 1, 1);
        g2d.fillRect(75 + x, 39 + y, 2, 1);
        g2d.fillRect(72 + x, 40 + y, 3, 1);
        g2d.fillRect(76 + x, 40 + y, 1, 2);
        g2d.fillRect(80 + x, 41 + y, 2, 1);
        g2d.fillRect(77 + x, 42 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(79 + x, 31 + y, 1, 1);
        g2d.fillRect(81 + x, 31 + y, 1, 2);
        g2d.fillRect(78 + x, 32 + y, 1, 3);
        g2d.fillRect(80 + x, 33 + y, 1, 1);
        g2d.fillRect(79 + x, 34 + y, 1, 2);
        g2d.fillRect(73 + x, 36 + y, 4, 1);
        g2d.fillRect(81 + x, 36 + y, 1, 2);
        g2d.fillRect(82 + x, 36 + y, 1, 1);
        g2d.fillRect(71 + x, 37 + y, 1, 2);
        g2d.fillRect(72 + x, 37 + y, 1, 1);
        g2d.fillRect(77 + x, 37 + y, 1, 1);
        g2d.fillRect(83 + x, 37 + y, 1, 1);
        g2d.fillRect(75 + x, 38 + y, 2, 1);
        g2d.fillRect(82 + x, 38 + y, 1, 1);
        g2d.fillRect(72 + x, 39 + y, 3, 1);
        g2d.fillRect(78 + x, 39 + y, 2, 1);
        g2d.fillRect(77 + x, 40 + y, 1, 2);
        g2d.fillRect(80 + x, 40 + y, 1, 1);
        g2d.fillRect(78 + x, 41 + y, 2, 1);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(74 + x, 28 + y, 2, 1);
        g2d.fillRect(73 + x, 29 + y, 1, 2);
        g2d.fillRect(74 + x, 31 + y, 1, 1);
        g2d.fillRect(70 + x, 32 + y, 2, 1);
        g2d.fillRect(69 + x, 33 + y, 1, 2);
        g2d.fillRect(72 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(82 + x, 37 + y, 1, 2);
        g2d.fillRect(78 + x, 41 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(83 + x, 37 + y, 1, 2);
        g2d.fillRect(79 + x, 41 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(77 + x, 33 + y, 1, 3);
        g2d.fillRect(78 + x, 36 + y, 1, 1);
        g2d.fillRect(79 + x, 37 + y, 1, 1);
        g2d.fillRect(80 + x, 38 + y, 1, 1);
        g2d.fillRect(81 + x, 39 + y, 1, 1);
        g2d.fillRect(82 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(79 + x, 31 + y, 1, 2);
        g2d.fillRect(72 + x, 38 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(74 + x, 32 + y, 3, 1);
        g2d.fillRect(73 + x, 33 + y, 1, 3);
        g2d.fillRect(74 + x, 36 + y, 3, 1);
        g2d.fillRect(77 + x, 37 + y, 1, 1);
        g2d.fillRect(78 + x, 38 + y, 1, 1);
        g2d.fillRect(79 + x, 39 + y, 1, 1);
        g2d.fillRect(80 + x, 40 + y, 1, 1);
        g2d.fillRect(81 + x, 41 + y, 1, 1);
        g2d.fillRect(83 + x, 41 + y, 1, 2);
        g2d.fillRect(82 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(74 + x, 33 + y, 1, 3);
        g2d.fillRect(75 + x, 33 + y, 2, 1);
        g2d.fillRect(76 + x, 34 + y, 1, 2);
        g2d.fillRect(75 + x, 35 + y, 1, 1);
        g2d.fillRect(77 + x, 36 + y, 1, 1);
        g2d.fillRect(78 + x, 37 + y, 1, 1);
        g2d.fillRect(79 + x, 38 + y, 1, 1);
        g2d.fillRect(80 + x, 39 + y, 1, 1);
        g2d.fillRect(81 + x, 40 + y, 1, 1);
        g2d.fillRect(82 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(75 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(80 + x, 30 + y, 1, 3);
        g2d.fillRect(79 + x, 33 + y, 1, 2);
        g2d.fillRect(75 + x, 38 + y, 2, 1);
        g2d.fillRect(71 + x, 39 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(79 + x, 28 + y, 3, 1);
        g2d.fillRect(78 + x, 29 + y, 1, 2);
        g2d.fillRect(82 + x, 29 + y, 1, 4);
        g2d.fillRect(77 + x, 31 + y, 1, 2);
        g2d.fillRect(81 + x, 33 + y, 1, 4);
        g2d.fillRect(80 + x, 35 + y, 1, 3);
        g2d.fillRect(82 + x, 35 + y, 2, 1);
        g2d.fillRect(72 + x, 36 + y, 2, 1);
        g2d.fillRect(84 + x, 36 + y, 1, 1);
        g2d.fillRect(70 + x, 37 + y, 2, 1);
        g2d.fillRect(85 + x, 37 + y, 1, 2);
        g2d.fillRect(69 + x, 38 + y, 1, 2);
        g2d.fillRect(77 + x, 39 + y, 1, 2);
        g2d.fillRect(78 + x, 39 + y, 1, 1);
        g2d.fillRect(84 + x, 39 + y, 1, 1);
        g2d.fillRect(70 + x, 40 + y, 1, 1);
        g2d.fillRect(75 + x, 40 + y, 2, 1);
        g2d.fillRect(83 + x, 40 + y, 1, 1);
        g2d.fillRect(71 + x, 41 + y, 4, 1);
        g2d.fillRect(76 + x, 41 + y, 1, 3);
        g2d.fillRect(81 + x, 42 + y, 1, 1);
        g2d.fillRect(80 + x, 43 + y, 1, 1);
        g2d.fillRect(77 + x, 44 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(79 + x, 29 + y, 1, 2);
        g2d.fillRect(80 + x, 29 + y, 2, 1);
        g2d.fillRect(81 + x, 30 + y, 1, 3);
        g2d.fillRect(78 + x, 31 + y, 1, 5);
        g2d.fillRect(80 + x, 33 + y, 1, 2);
        g2d.fillRect(79 + x, 35 + y, 1, 2);
        g2d.fillRect(82 + x, 36 + y, 2, 1);
        g2d.fillRect(72 + x, 37 + y, 5, 1);
        g2d.fillRect(81 + x, 37 + y, 1, 2);
        g2d.fillRect(84 + x, 37 + y, 1, 2);
        g2d.fillRect(70 + x, 38 + y, 1, 2);
        g2d.fillRect(71 + x, 38 + y, 1, 1);
        g2d.fillRect(77 + x, 38 + y, 1, 1);
        g2d.fillRect(75 + x, 39 + y, 2, 1);
        g2d.fillRect(82 + x, 39 + y, 2, 1);
        g2d.fillRect(71 + x, 40 + y, 4, 1);
        g2d.fillRect(78 + x, 40 + y, 2, 1);
        g2d.fillRect(77 + x, 41 + y, 1, 3);
        g2d.fillRect(80 + x, 41 + y, 1, 2);
        g2d.fillRect(78 + x, 43 + y, 2, 1);
    }
}
