/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b;

import clts.SuperB;
import clts.SuperC;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import pieces.p.DrawString0;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot7 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot7()
    {
        super();
        skt = true;
    }

    public Bot7(int layer)
    {
        super(layer);
        skt = true;
    }

    public Bot7(ColorArray colorSwitch)
    {
        super(colorSwitch);
        skt = true;
    }

    public Bot7(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 101 + y, 1, 2);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 5);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 97 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 4);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 3);
        g2d.fillRect(116 + x, 85 + y, 1, 3);
        g2d.fillRect(99 + x, 84 + y, 1, 12);
        g2d.fillRect(117 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 2, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 4);
        g2d.fillRect(119 + x, 79 + y, 1, 3);
        g2d.fillRect(101 + x, 81 + y, 3, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 2);
        g2d.fillRect(118 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 6);
        g2d.fillRect(121 + x, 85 + y, 1, 7);
        g2d.fillRect(122 + x, 90 + y, 1, 4);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 10, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 3);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 12);
        g2d.fillRect(101 + x, 95 + y, 1, 5);
        g2d.fillRect(102 + x, 98 + y, 1, 5);
        g2d.fillRect(101 + x, 82 + y, 1, 3);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 2, 1);
        g2d.fillRect(105 + x, 84 + y, 10, 1);
        g2d.fillRect(114 + x, 85 + y, 2, 3);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(112 + x, 89 + y, 2, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 95 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 3);
        g2d.fillRect(103 + x, 99 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 1, 15);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 10);
        g2d.fillRect(103 + x, 84 + y, 1, 15);
        g2d.fillRect(104 + x, 84 + y, 1, 13);
        g2d.fillRect(105 + x, 85 + y, 9, 3);
        g2d.fillRect(105 + x, 88 + y, 8, 1);
        g2d.fillRect(105 + x, 89 + y, 7, 1);
        g2d.fillRect(105 + x, 90 + y, 6, 1);
        g2d.fillRect(105 + x, 91 + y, 5, 1);
        g2d.fillRect(105 + x, 92 + y, 4, 1);
        g2d.fillRect(105 + x, 93 + y, 3, 1);
        g2d.fillRect(105 + x, 94 + y, 2, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);

//        piece.paint(116 + x, 84 + y,g2d);
    }
}
