/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import b.Bd;
import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Gun0 extends SuperTL
{
    int leftA = 0;
    int rightA = 0;

    public Gun0()
    {
        super();
    }

    public Gun0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }
    
    public void drawSleevesRight5(int x, int y, GraphicsMap g2d)
    {}
    
    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
        paintGun(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
    }
    
    public void paintGun(int x, int y, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(129 + x, 38 + y, 1, 2);
        g2d.fillRect(128 + x, 39 + y, 1, 6);
        g2d.fillRect(130 + x, 39 + y, 2, 1);
        g2d.fillRect(131 + x, 40 + y, 2, 1);
        g2d.fillRect(132 + x, 41 + y, 1, 2);
        g2d.fillRect(129 + x, 42 + y, 1, 6);
        g2d.fillRect(130 + x, 43 + y, 1, 4);
        g2d.fillRect(131 + x, 43 + y, 1, 2);
        g2d.fillRect(132 + x, 46 + y, 1, 2);
        g2d.fillRect(131 + x, 47 + y, 1, 3);
        g2d.fillRect(130 + x, 48 + y, 1, 1);
        g2d.fillRect(134 + x, 48 + y, 1, 4);
        g2d.fillRect(133 + x, 49 + y, 1, 3);
        g2d.fillRect(135 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(128 + x, 26 + y, 1, 13);
        g2d.fillRect(129 + x, 26 + y, 1, 12);
        g2d.fillRect(130 + x, 26 + y, 1, 9);
        g2d.fillRect(131 + x, 27 + y, 1, 4);
        g2d.fillRect(127 + x, 28 + y, 1, 15);
        g2d.fillRect(126 + x, 32 + y, 1, 1);
        g2d.fillRect(126 + x, 34 + y, 1, 12);
        g2d.fillRect(125 + x, 36 + y, 1, 9);
        g2d.fillRect(124 + x, 41 + y, 1, 4);
        g2d.fillRect(131 + x, 41 + y, 1, 2);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(131 + x, 38 + y, 1, 1);
        g2d.fillRect(130 + x, 41 + y, 1, 2);
        g2d.fillRect(128 + x, 45 + y, 1, 3);
        g2d.fillRect(132 + x, 45 + y, 2, 1);
        g2d.fillRect(134 + x, 46 + y, 1, 2);
        g2d.fillRect(129 + x, 48 + y, 1, 1);
        g2d.fillRect(135 + x, 48 + y, 1, 2);
        g2d.fillRect(130 + x, 49 + y, 1, 1);
        g2d.fillRect(131 + x, 50 + y, 1, 2);
        g2d.fillRect(130 + x, 52 + y, 1, 2);
        g2d.fillRect(129 + x, 55 + y, 1, 1);
        g2d.fillRect(128 + x, 56 + y, 1, 2);
        g2d.fillRect(127 + x, 58 + y, 1, 3);
        g2d.fillRect(126 + x, 60 + y, 1, 3);
        g2d.fillRect(125 + x, 62 + y, 1, 3);
        g2d.fillRect(124 + x, 64 + y, 1, 3);
        g2d.fillRect(123 + x, 66 + y, 1, 1);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(120 + x, 47 + y, 1, 8);
        g2d.fillRect(127 + x, 48 + y, 1, 5);
        g2d.fillRect(126 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 5);
        g2d.fillRect(125 + x, 55 + y, 1, 1);
        g2d.fillRect(124 + x, 56 + y, 1, 2);
        g2d.fillRect(123 + x, 58 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 61 + y, 1, 5);
        g2d.fillRect(119 + x, 66 + y, 1, 2);
        g2d.fillRect(120 + x, 67 + y, 1, 2);
        g2d.fillRect(122 + x, 67 + y, 1, 2);
        g2d.fillRect(123 + x, 67 + y, 1, 1);
        g2d.fillRect(121 + x, 68 + y, 1, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(131 + x, 37 + y, 1, 1);
        g2d.fillRect(130 + x, 38 + y, 1, 1);
        g2d.fillRect(130 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 43 + y, 1, 3);
        g2d.fillRect(127 + x, 43 + y, 1, 5);
        g2d.fillRect(132 + x, 44 + y, 1, 1);
        g2d.fillRect(131 + x, 45 + y, 1, 2);
        g2d.fillRect(119 + x, 46 + y, 1, 9);
        g2d.fillRect(133 + x, 46 + y, 1, 3);
        g2d.fillRect(130 + x, 47 + y, 1, 1);
        g2d.fillRect(132 + x, 48 + y, 1, 4);
        g2d.fillRect(128 + x, 49 + y, 1, 2);
        g2d.fillRect(130 + x, 51 + y, 1, 1);
        g2d.fillRect(129 + x, 52 + y, 1, 3);
        g2d.fillRect(127 + x, 53 + y, 1, 1);
        g2d.fillRect(126 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 5);
        g2d.fillRect(128 + x, 55 + y, 1, 1);
        g2d.fillRect(125 + x, 56 + y, 1, 1);
        g2d.fillRect(127 + x, 56 + y, 1, 2);
        g2d.fillRect(124 + x, 58 + y, 1, 1);
        g2d.fillRect(126 + x, 58 + y, 1, 2);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 2, 1);
        g2d.fillRect(125 + x, 60 + y, 1, 2);
        g2d.fillRect(119 + x, 61 + y, 1, 5);
        g2d.fillRect(124 + x, 62 + y, 1, 2);
        g2d.fillRect(123 + x, 63 + y, 1, 3);
        g2d.fillRect(120 + x, 65 + y, 1, 2);
        g2d.fillRect(122 + x, 65 + y, 1, 2);
        g2d.fillRect(121 + x, 67 + y, 1, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(117 + x, 44 + y, 1, 12);
        g2d.fillRect(118 + x, 46 + y, 1, 14);
        g2d.fillRect(128 + x, 48 + y, 1, 1);
        g2d.fillRect(129 + x, 49 + y, 1, 3);
        g2d.fillRect(130 + x, 50 + y, 1, 1);
        g2d.fillRect(128 + x, 51 + y, 1, 4);
        g2d.fillRect(127 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 6);
        g2d.fillRect(126 + x, 55 + y, 1, 3);
        g2d.fillRect(125 + x, 57 + y, 1, 3);
        g2d.fillRect(124 + x, 59 + y, 1, 3);
        g2d.fillRect(120 + x, 60 + y, 1, 5);
        g2d.fillRect(123 + x, 60 + y, 1, 3);
        g2d.fillRect(121 + x, 61 + y, 1, 6);
        g2d.fillRect(122 + x, 61 + y, 1, 4);
    }
    
    public void drawBody(Bd bd)
    {
        b = bd;
    }
    Bd b = new Bd();
}
