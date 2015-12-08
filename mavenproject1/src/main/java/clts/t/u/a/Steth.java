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
public class Steth extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Steth()
    {
        super(2);
    }

    public Steth(int layer)
    {
        super(layer);
    }

    public Steth(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Steth(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        int x = offsetX + shiftX;
        paintH(x,shiftY,g2d);
    }

    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 40 + y, 1, 5);
        g2d.fillRect(102 + x, 41 + y, 1, 3);
        g2d.fillRect(103 + x, 41 + y, 1, 5);
        g2d.fillRect(114 + x, 42 + y, 1, 15);
        g2d.fillRect(104 + x, 44 + y, 1, 4);
        g2d.fillRect(115 + x, 45 + y, 1, 10);
        g2d.fillRect(105 + x, 46 + y, 1, 3);
        g2d.fillRect(106 + x, 47 + y, 1, 3);
        g2d.fillRect(107 + x, 48 + y, 1, 3);
        g2d.fillRect(108 + x, 49 + y, 1, 4);
        g2d.fillRect(109 + x, 51 + y, 1, 3);
        g2d.fillRect(110 + x, 52 + y, 1, 4);
        g2d.fillRect(111 + x, 54 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 57 + y, 1, 3);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(112 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 71 + y, 1, 3);
        g2d.fillRect(111 + x, 71 + y, 1, 3);
        g2d.fillRect(112 + x, 71 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
    }
}
