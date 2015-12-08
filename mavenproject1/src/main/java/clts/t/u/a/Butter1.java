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
public class Butter1 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Butter1()
    {
        super(2);
    }

    public Butter1(int layer)
    {
        super(layer);
    }

    public Butter1(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Butter1(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        switcher = !switcher;
        
        if(switcher)
        {
            paintBackB2(shiftX - 10, shiftY - 10,g2d);
        }
        else
        {
            paintBackB1(shiftX - 10, shiftY - 10,g2d);
        }
    }
    
    boolean switcher = true;
    
    
    public void paintBackB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(140 + x, 27 + y, 2, 1);
        g2d.fillRect(142 + x, 28 + y, 1, 2);
        g2d.fillRect(141 + x, 30 + y, 1, 1);
        g2d.fillRect(144 + x, 31 + y, 2, 1);
        g2d.fillRect(146 + x, 32 + y, 1, 2);
        g2d.fillRect(143 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(133 + x, 37 + y, 1, 1);
        g2d.fillRect(137 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(136 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(138 + x, 33 + y, 1, 2);
        g2d.fillRect(137 + x, 35 + y, 1, 1);
        g2d.fillRect(136 + x, 36 + y, 1, 1);
        g2d.fillRect(135 + x, 37 + y, 1, 1);
        g2d.fillRect(134 + x, 38 + y, 1, 1);
        g2d.fillRect(133 + x, 39 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(136 + x, 32 + y, 1, 1);
        g2d.fillRect(141 + x, 37 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(139 + x, 31 + y, 3, 1);
        g2d.fillRect(142 + x, 32 + y, 1, 3);
        g2d.fillRect(139 + x, 35 + y, 3, 1);
        g2d.fillRect(138 + x, 36 + y, 1, 1);
        g2d.fillRect(137 + x, 37 + y, 1, 1);
        g2d.fillRect(136 + x, 38 + y, 1, 1);
        g2d.fillRect(135 + x, 39 + y, 1, 1);
        g2d.fillRect(134 + x, 40 + y, 1, 1);
        g2d.fillRect(132 + x, 40 + y, 1, 2);
        g2d.fillRect(133 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(141 + x, 32 + y, 1, 3);
        g2d.fillRect(139 + x, 32 + y, 2, 1);
        g2d.fillRect(139 + x, 33 + y, 1, 2);
        g2d.fillRect(140 + x, 34 + y, 1, 1);
        g2d.fillRect(138 + x, 35 + y, 1, 1);
        g2d.fillRect(137 + x, 36 + y, 1, 1);
        g2d.fillRect(136 + x, 37 + y, 1, 1);
        g2d.fillRect(135 + x, 38 + y, 1, 1);
        g2d.fillRect(134 + x, 39 + y, 1, 1);
        g2d.fillRect(133 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(140 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(135 + x, 31 + y, 1, 2);
        g2d.fillRect(136 + x, 33 + y, 1, 1);
        g2d.fillRect(139 + x, 37 + y, 2, 1);
        g2d.fillRect(141 + x, 38 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(134 + x, 30 + y, 3, 1);
        g2d.fillRect(137 + x, 31 + y, 1, 1);
        g2d.fillRect(133 + x, 31 + y, 1, 2);
        g2d.fillRect(138 + x, 32 + y, 1, 1);
        g2d.fillRect(134 + x, 33 + y, 1, 1);
        g2d.fillRect(135 + x, 34 + y, 1, 3);
        g2d.fillRect(143 + x, 35 + y, 1, 2);
        g2d.fillRect(142 + x, 35 + y, 1, 1);
        g2d.fillRect(133 + x, 35 + y, 2, 1);
        g2d.fillRect(144 + x, 36 + y, 1, 1);
        g2d.fillRect(132 + x, 36 + y, 1, 1);
        g2d.fillRect(145 + x, 37 + y, 1, 2);
        g2d.fillRect(131 + x, 37 + y, 1, 1);
        g2d.fillRect(138 + x, 38 + y, 1, 2);
        g2d.fillRect(137 + x, 38 + y, 1, 1);
        g2d.fillRect(132 + x, 38 + y, 1, 2);
        g2d.fillRect(144 + x, 39 + y, 1, 1);
        g2d.fillRect(139 + x, 39 + y, 2, 1);
        g2d.fillRect(141 + x, 40 + y, 3, 1);
        g2d.fillRect(139 + x, 40 + y, 1, 2);
        g2d.fillRect(134 + x, 41 + y, 2, 1);
        g2d.fillRect(136 + x, 42 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(136 + x, 31 + y, 1, 1);
        g2d.fillRect(134 + x, 31 + y, 1, 2);
        g2d.fillRect(137 + x, 32 + y, 1, 3);
        g2d.fillRect(135 + x, 33 + y, 1, 1);
        g2d.fillRect(136 + x, 34 + y, 1, 2);
        g2d.fillRect(139 + x, 36 + y, 4, 1);
        g2d.fillRect(134 + x, 36 + y, 1, 2);
        g2d.fillRect(133 + x, 36 + y, 1, 1);
        g2d.fillRect(144 + x, 37 + y, 1, 2);
        g2d.fillRect(143 + x, 37 + y, 1, 1);
        g2d.fillRect(138 + x, 37 + y, 1, 1);
        g2d.fillRect(132 + x, 37 + y, 1, 1);
        g2d.fillRect(139 + x, 38 + y, 2, 1);
        g2d.fillRect(133 + x, 38 + y, 1, 1);
        g2d.fillRect(141 + x, 39 + y, 3, 1);
        g2d.fillRect(136 + x, 39 + y, 2, 1);
        g2d.fillRect(138 + x, 40 + y, 1, 2);
        g2d.fillRect(135 + x, 40 + y, 1, 1);
        g2d.fillRect(136 + x, 41 + y, 2, 1);
    }





    public void paintBackB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(140 + x, 28 + y, 2, 1);
        g2d.fillRect(142 + x, 29 + y, 1, 2);
        g2d.fillRect(141 + x, 31 + y, 1, 1);
        g2d.fillRect(144 + x, 32 + y, 2, 1);
        g2d.fillRect(146 + x, 33 + y, 1, 2);
        g2d.fillRect(143 + x, 33 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(133 + x, 37 + y, 1, 2);
        g2d.fillRect(137 + x, 41 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(132 + x, 37 + y, 1, 2);
        g2d.fillRect(136 + x, 41 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(138 + x, 33 + y, 1, 3);
        g2d.fillRect(137 + x, 36 + y, 1, 1);
        g2d.fillRect(136 + x, 37 + y, 1, 1);
        g2d.fillRect(135 + x, 38 + y, 1, 1);
        g2d.fillRect(134 + x, 39 + y, 1, 1);
        g2d.fillRect(133 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(136 + x, 31 + y, 1, 2);
        g2d.fillRect(141 + x, 38 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(139 + x, 32 + y, 3, 1);
        g2d.fillRect(142 + x, 33 + y, 1, 3);
        g2d.fillRect(139 + x, 36 + y, 3, 1);
        g2d.fillRect(138 + x, 37 + y, 1, 1);
        g2d.fillRect(137 + x, 38 + y, 1, 1);
        g2d.fillRect(136 + x, 39 + y, 1, 1);
        g2d.fillRect(135 + x, 40 + y, 1, 1);
        g2d.fillRect(134 + x, 41 + y, 1, 1);
        g2d.fillRect(132 + x, 41 + y, 1, 2);
        g2d.fillRect(133 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(141 + x, 33 + y, 1, 3);
        g2d.fillRect(139 + x, 33 + y, 2, 1);
        g2d.fillRect(139 + x, 34 + y, 1, 2);
        g2d.fillRect(140 + x, 35 + y, 1, 1);
        g2d.fillRect(138 + x, 36 + y, 1, 1);
        g2d.fillRect(137 + x, 37 + y, 1, 1);
        g2d.fillRect(136 + x, 38 + y, 1, 1);
        g2d.fillRect(135 + x, 39 + y, 1, 1);
        g2d.fillRect(134 + x, 40 + y, 1, 1);
        g2d.fillRect(133 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(140 + x, 34 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(135 + x, 30 + y, 1, 3);
        g2d.fillRect(136 + x, 33 + y, 1, 2);
        g2d.fillRect(139 + x, 38 + y, 2, 1);
        g2d.fillRect(141 + x, 39 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(134 + x, 28 + y, 3, 1);
        g2d.fillRect(137 + x, 29 + y, 1, 2);
        g2d.fillRect(133 + x, 29 + y, 1, 4);
        g2d.fillRect(138 + x, 31 + y, 1, 2);
        g2d.fillRect(134 + x, 33 + y, 1, 4);
        g2d.fillRect(135 + x, 35 + y, 1, 3);
        g2d.fillRect(132 + x, 35 + y, 2, 1);
        g2d.fillRect(142 + x, 36 + y, 2, 1);
        g2d.fillRect(131 + x, 36 + y, 1, 1);
        g2d.fillRect(144 + x, 37 + y, 2, 1);
        g2d.fillRect(130 + x, 37 + y, 1, 2);
        g2d.fillRect(146 + x, 38 + y, 1, 2);
        g2d.fillRect(138 + x, 39 + y, 1, 2);
        g2d.fillRect(137 + x, 39 + y, 1, 1);
        g2d.fillRect(131 + x, 39 + y, 1, 1);
        g2d.fillRect(145 + x, 40 + y, 1, 1);
        g2d.fillRect(139 + x, 40 + y, 2, 1);
        g2d.fillRect(132 + x, 40 + y, 1, 1);
        g2d.fillRect(141 + x, 41 + y, 4, 1);
        g2d.fillRect(139 + x, 41 + y, 1, 3);
        g2d.fillRect(134 + x, 42 + y, 1, 1);
        g2d.fillRect(135 + x, 43 + y, 1, 1);
        g2d.fillRect(136 + x, 44 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(136 + x, 29 + y, 1, 2);
        g2d.fillRect(134 + x, 29 + y, 2, 1);
        g2d.fillRect(134 + x, 30 + y, 1, 3);
        g2d.fillRect(137 + x, 31 + y, 1, 5);
        g2d.fillRect(135 + x, 33 + y, 1, 2);
        g2d.fillRect(136 + x, 35 + y, 1, 2);
        g2d.fillRect(132 + x, 36 + y, 2, 1);
        g2d.fillRect(139 + x, 37 + y, 5, 1);
        g2d.fillRect(134 + x, 37 + y, 1, 2);
        g2d.fillRect(131 + x, 37 + y, 1, 2);
        g2d.fillRect(145 + x, 38 + y, 1, 2);
        g2d.fillRect(144 + x, 38 + y, 1, 1);
        g2d.fillRect(138 + x, 38 + y, 1, 1);
        g2d.fillRect(139 + x, 39 + y, 2, 1);
        g2d.fillRect(132 + x, 39 + y, 2, 1);
        g2d.fillRect(141 + x, 40 + y, 4, 1);
        g2d.fillRect(136 + x, 40 + y, 2, 1);
        g2d.fillRect(138 + x, 41 + y, 1, 3);
        g2d.fillRect(135 + x, 41 + y, 1, 2);
        g2d.fillRect(136 + x, 43 + y, 2, 1);
    }
}
