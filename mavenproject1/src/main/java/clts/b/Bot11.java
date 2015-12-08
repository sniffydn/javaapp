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
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot11 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot11()
    {
        super();
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot11(int layer)
    {
        super(layer);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot11(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot11(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        skt = true;
        shrt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 83 + y, 1, 2);
        g2d.fillRect(97 + x, 82 + y, 2, 1);
        g2d.fillRect(117 + x, 79 + y, 3, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 3, 1);
        g2d.fillRect(101 + x, 78 + y, 6, 1);
        g2d.fillRect(106 + x, 79 + y, 6, 1);
        g2d.fillRect(110 + x, 80 + y, 7, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(99 + x, 81 + y, 3, 1);
        g2d.fillRect(100 + x, 82 + y, 5, 1);
        g2d.fillRect(99 + x, 83 + y, 6, 1);
        g2d.fillRect(97 + x, 84 + y, 3, 1);
        g2d.fillRect(97 + x, 85 + y, 2, 1);
        g2d.fillRect(98 + x, 86 + y, 4, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 5);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 2, 1);
        g2d.fillRect(104 + x, 84 + y, 6, 1);
        g2d.fillRect(105 + x, 85 + y, 8, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 7, 1);
        g2d.fillRect(107 + x, 89 + y, 3, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 5);
        g2d.fillRect(111 + x, 90 + y, 10, 1);
        g2d.fillRect(111 + x, 86 + y, 7, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 3, 1);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 3);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 3);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 89 + y, 4, 1);
        g2d.fillRect(124 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 4, 1);
        g2d.fillRect(122 + x, 86 + y, 2, 1);
        g2d.fillRect(123 + x, 87 + y, 4, 1);
        g2d.fillRect(126 + x, 86 + y, 1, 1);
        g2d.fillRect(125 + x, 85 + y, 2, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(122 + x, 83 + y, 2, 1);
        g2d.fillRect(123 + x, 84 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(125 + x, 86 + y, 1, 1);
        g2d.fillRect(123 + x, 85 + y, 2, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 2, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(97 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 4, 1);
        g2d.fillRect(112 + x, 81 + y, 7, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 3, 1);
        g2d.fillRect(119 + x, 86 + y, 3, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 2, 1);
        g2d.fillRect(120 + x, 87 + y, 3, 1);
        g2d.fillRect(122 + x, 88 + y, 2, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 80 + y, 3, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 2, 1);
        g2d.fillRect(112 + x, 89 + y, 2, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 3, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 4, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 10, 1);
        g2d.fillRect(108 + x, 81 + y, 4, 1);
        g2d.fillRect(109 + x, 83 + y, 11, 1);
        g2d.fillRect(116 + x, 82 + y, 3, 1);
        g2d.fillRect(111 + x, 84 + y, 9, 1);
        g2d.fillRect(114 + x, 85 + y, 3, 1);
    }
}
