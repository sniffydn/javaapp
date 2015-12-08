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
import util.ColorArray;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Flower2 extends Piece
{
    public Flower2()
    {
        super();
    }


    public Flower2(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(33 + x, 3 + y, 1, 1);
        g2d.fillRect(34 + x, 2 + y, 1, 1);
        g2d.fillRect(28 + x, 2 + y, 1, 1);
        g2d.fillRect(27 + x, 1 + y, 1, 1);
        g2d.fillRect(33 + x, -2 + y, 1, 2);
        g2d.fillRect(26 + x, -3 + y, 1, 2);
        g2d.fillRect(38 + x, -4 + y, 1, 1);
        g2d.fillRect(31 + x, -6 + y, 1, 1);
        g2d.fillRect(34 + x, -8 + y, 1, 1);
        g2d.fillRect(33 + x, -9 + y, 1, 1);
        g2d.fillRect(32 + x, -5 + y, 2, 1);
        g2d.fillRect(30 + x, 1 + y, 2, 1);
        g2d.fillRect(25 + x, 4 + y, 2, 1);
        g2d.fillRect(26 + x, 5 + y, 1, 1);
        g2d.fillRect(23 + x, -1 + y, 1, 1);
        g2d.fillRect(23 + x, -2 + y, 3, 1);
        g2d.fillRect(27 + x, -5 + y, 1, 2);
        g2d.fillRect(28 + x, -5 + y, 1, 3);
        g2d.fillRect(29 + x, -4 + y, 2, 3);
        g2d.fillRect(31 + x, 0 + y, 1, 1);
        g2d.fillRect(32 + x, -1 + y, 1, 2);
        g2d.fillRect(36 + x, -2 + y, 1, 2);
        g2d.fillRect(37 + x, -5 + y, 1, 1);
        g2d.fillRect(36 + x, -6 + y, 1, 2);
        g2d.fillRect(35 + x, -6 + y, 1, 5);
        g2d.fillRect(33 + x, -4 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(27 + x, 7 + y, 4, 1);
        g2d.fillRect(26 + x, 6 + y, 1, 1);
        g2d.fillRect(36 + x, 5 + y, 1, 1);
        g2d.fillRect(24 + x, 4 + y, 1, 1);
        g2d.fillRect(32 + x, 3 + y, 1, 2);
        g2d.fillRect(23 + x, 3 + y, 1, 1);
        g2d.fillRect(37 + x, 2 + y, 1, 3);
        g2d.fillRect(24 + x, 2 + y, 1, 1);
        g2d.fillRect(38 + x, 1 + y, 1, 1);
        g2d.fillRect(23 + x, y, 1, 2);
        g2d.fillRect(35 + x, -1 + y, 1, 5);
        g2d.fillRect(26 + x, -1 + y, 1, 4);
        g2d.fillRect(24 + x, -1 + y, 1, 1);
        g2d.fillRect(37 + x, -2 + y, 1, 2);
        g2d.fillRect(28 + x, -2 + y, 1, 1);
        g2d.fillRect(39 + x, -3 + y, 1, 4);
        g2d.fillRect(36 + x, -3 + y, 1, 1);
        g2d.fillRect(33 + x, -3 + y, 2, 1);
        g2d.fillRect(31 + x, -4 + y, 1, 3);
        g2d.fillRect(34 + x, -5 + y, 1, 1);
        g2d.fillRect(23 + x, -6 + y, 1, 4);
        g2d.fillRect(35 + x, -7 + y, 1, 1);
        g2d.fillRect(24 + x, -7 + y, 2, 1);
        g2d.fillRect(26 + x, -8 + y, 5, 1);
        g2d.fillRect(32 + x, -9 + y, 1, 1);
        g2d.fillRect(31 + x, -9 + y, 1, 3);
        g2d.fillRect(32 + x, -7 + y, 1, 2);
        g2d.fillRect(33 + x, -6 + y, 1, 1);
        g2d.fillRect(28 + x, -7 + y, 2, 1);
        g2d.fillRect(26 + x, -6 + y, 5, 1);
        g2d.fillRect(25 + x, -5 + y, 2, 2);
        g2d.fillRect(25 + x, 0 + y, 1, 2);
        g2d.fillRect(27 + x, 0 + y, 4, 1);
        g2d.fillRect(29 + x, 1 + y, 1, 4);
        g2d.fillRect(28 + x, 3 + y, 1, 2);
        g2d.fillRect(27 + x, 2 + y, 1, 2);
        g2d.fillRect(30 + x, 4 + y, 2, 1);
        g2d.fillRect(31 + x, 5 + y, 1, 1);
        g2d.fillRect(31 + x, 6 + y, 5, 1);
        g2d.fillRect(33 + x, 4 + y, 2, 1);
        g2d.fillRect(34 + x, 3 + y, 1, 1);
        g2d.fillRect(36 + x, 0 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(28 + x, 5 + y, 3, 1);
        g2d.fillRect(35 + x, 4 + y, 1, 1);
        g2d.fillRect(27 + x, 4 + y, 1, 1);
        g2d.fillRect(26 + x, 3 + y, 1, 1);
        g2d.fillRect(36 + x, 1 + y, 1, 2);
        g2d.fillRect(28 + x, 1 + y, 1, 1);
        g2d.fillRect(37 + x, y, 1, 1);
        g2d.fillRect(33 + x, y, 1, 2);
        g2d.fillRect(25 + x, -1 + y, 1, 1);
        g2d.fillRect(34 + x, -2 + y, 1, 2);
        g2d.fillRect(37 + x, -3 + y, 1, 1);
        g2d.fillRect(27 + x, -3 + y, 1, 3);
        g2d.fillRect(25 + x, -3 + y, 1, 1);
        g2d.fillRect(36 + x, -4 + y, 1, 1);
        g2d.fillRect(32 + x, -4 + y, 1, 3);
        g2d.fillRect(24 + x, -4 + y, 1, 1);
        g2d.fillRect(29 + x, -5 + y, 3, 1);
        g2d.fillRect(34 + x, -6 + y, 1, 1);
        g2d.fillRect(25 + x, -6 + y, 1, 1);
        g2d.fillRect(33 + x, -7 + y, 1, 1);
        g2d.fillRect(30 + x, -7 + y, 1, 1);
        g2d.fillRect(27 + x, -7 + y, 1, 1);
        g2d.fillRect(32 + x, -8 + y, 1, 1);
        g2d.fillRect(30 + x, 2 + y, 3, 1);
        g2d.fillRect(28 + x, -1 + y, 4, 1);
        g2d.fillRect(32 + x, 1 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(35 + x, 5 + y, 1, 1);
        g2d.fillRect(36 + x, 4 + y, 1, 1);
        g2d.fillRect(38 + x, -2 + y, 1, 3);
        g2d.fillRect(24 + x, -5 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(32 + x, 5 + y, 3, 1);
        g2d.fillRect(27 + x, 5 + y, 1, 2);
        g2d.fillRect(36 + x, 3 + y, 1, 1);
        g2d.fillRect(30 + x, 3 + y, 2, 1);
        g2d.fillRect(33 + x, 2 + y, 1, 1);
        g2d.fillRect(25 + x, 2 + y, 1, 2);
        g2d.fillRect(37 + x, 1 + y, 1, 1);
        g2d.fillRect(34 + x, y, 1, 2);
        g2d.fillRect(24 + x, y, 1, 2);
        g2d.fillRect(38 + x, -3 + y, 1, 1);
        g2d.fillRect(24 + x, -3 + y, 1, 1);
        g2d.fillRect(37 + x, -4 + y, 1, 1);
        g2d.fillRect(24 + x, -6 + y, 1, 1);
        g2d.fillRect(34 + x, -7 + y, 1, 1);
        g2d.fillRect(26 + x, -7 + y, 1, 1);
        g2d.fillRect(33 + x, -8 + y, 1, 1);
        g2d.fillRect(24 + x, 3 + y, 1, 1);
        g2d.fillRect(28 + x, 6 + y, 3, 1);
    }
}
