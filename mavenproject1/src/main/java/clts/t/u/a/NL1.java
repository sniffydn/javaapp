/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.GenericC;
import clts.Piece;
import clts.SuperTL;
import util.ColorArray;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class NL1 extends SuperTL
{
    public NL1()
    {
        super();
    }

    public NL1(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 1, 2);
        g2d.fillRect(105 + x, 42 + y, 1, 2);
        g2d.fillRect(106 + x, 42 + y, 1, 1);
        g2d.fillRect(111 + x, 42 + y, 2, 1);
        g2d.fillRect(112 + x, 43 + y, 1, 1);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(111 + x, 44 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 43 + y, 1, 1);
        g2d.fillRect(110 + x, 43 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(111 + x, 45 + y, 1, 1);
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 43 + y, 2, 1);
        g2d.fillRect(108 + x, 47 + y, 2, 1);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        draw(offsetX, 0, g2d);
    }
}
