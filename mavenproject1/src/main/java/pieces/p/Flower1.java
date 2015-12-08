/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pieces.p;

import clts.Piece;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Flower1 extends Piece
{
    public Flower1()
    {
        super();
    }


    public Flower1(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(29 + x, 6 + y, 1, 1);
        g2d.fillRect(31 + x, -3 + y, 1, 1);//26
        g2d.fillRect(26 + x, 1 + y, 1, 2);
        g2d.fillRect(26 + x, 0 + y, 4, 1);
        g2d.fillRect(30 + x, 1 + y, 2, 1);
        g2d.fillRect(29 + x, 2 + y, 4, 1);
        g2d.fillRect(29 + x, 3 + y, 3, 1);
        g2d.fillRect(29 + x, 4 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(33 + x, -1 + y, 3, 1);
        g2d.fillRect(32 + x, 0 + y, 3, 1);
        g2d.fillRect(32 + x, 1 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(25 + x, -2 + y, 1, 2);
        g2d.fillRect(34 + x, -6 + y, 1, 2);
        g2d.fillRect(29 + x, -7 + y, 1, 4);
        g2d.fillRect(24 + x, -1 + y, 1, 1);
        g2d.fillRect(26 + x, -1 + y, 4, 1);
        g2d.fillRect(30 + x, -6 + y, 1, 7);
        g2d.fillRect(31 + x, -2 + y, 1, 3);
        g2d.fillRect(32 + x, -1 + y, 1, 1);
        g2d.fillRect(29 + x, 1 + y, 1, 1);
        g2d.fillRect(28 + x, 1 + y, 1, 4);
        g2d.fillRect(27 + x, 3 + y, 1, 3);
        g2d.fillRect(31 + x, -6 + y, 2, 1);
        g2d.fillRect(32 + x, -7 + y, 2, 1);
        g2d.fillRect(35 + x, -5 + y, 1, 3);
        g2d.fillRect(36 + x, -2 + y, 2, 2);
        g2d.fillRect(38 + x, -1 + y, 1, 2);
        g2d.fillRect(39 + x, 0 + y, 1, 5);
        g2d.fillRect(34 + x, 2 + y, 1, 1);
        g2d.fillRect(35 + x, 2 + y, 1, 6);
        g2d.fillRect(36 + x, 4 + y, 3, 1);
        g2d.fillRect(33 + x, 7 + y, 2, 1);
        g2d.fillRect(30 + x, 8 + y, 4, 1);
        g2d.fillRect(32 + x, 9 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(26 + x, 3 + y, 1, 1);
        g2d.fillRect(33 + x, 2 + y, 1, 5);
        g2d.fillRect(27 + x, 1 + y, 1, 2);
        g2d.fillRect(38 + x, -2 + y, 1, 1);
        g2d.fillRect(36 + x, -5 + y, 1, 3);
        g2d.fillRect(35 + x, -6 + y, 1, 1);
        g2d.fillRect(33 + x, -6 + y, 1, 5);
        g2d.fillRect(34 + x, -7 + y, 1, 1);
        g2d.fillRect(34 + x, 1 + y, 2, 1);
        g2d.fillRect(31 + x, -5 + y, 1, 2);
        g2d.fillRect(32 + x, -5 + y, 1, 4);
        g2d.fillRect(34 + x, -4 + y, 1, 3);
        g2d.fillRect(35 + x, -2 + y, 1, 1);
        g2d.fillRect(35 + x, 0 + y, 3, 1);
        g2d.fillRect(36 + x, 1 + y, 3, 3);
        g2d.fillRect(34 + x, 3 + y, 1, 4);
        g2d.fillRect(32 + x, 3 + y, 1, 2);
        g2d.fillRect(31 + x, 4 + y, 1, 1);
        g2d.fillRect(30 + x, 5 + y, 3, 3);
    }
}
