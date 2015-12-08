/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperTL;
import clts.Piece;
import util.ColorArray;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class T0 extends SuperTL
{
    public T0()
    {
        super();
    }

    public T0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
//        piece.paint(108 + x, 48 + y, g2d);
//        x -= 108;
//        y -= 48;
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(109 + x, 48 + y, 2, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 2, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 3);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 49 + y, 3, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 3);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 47 + y, 3, 1);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        draw(offsetX, offsetY, g2d);
    }
}
