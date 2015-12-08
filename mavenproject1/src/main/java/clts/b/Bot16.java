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
public class Bot16 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot16()
    {
        super();
        jean = true;
        skt = true;
    }

    public Bot16(int layer)
    {
        super(layer);
        jean = true;
        skt = true;
    }

    public Bot16(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        skt = true;
    }

    public Bot16(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 78 + y, 1, 3);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(118 + x, 79 + y, 1, 3);
        g2d.fillRect(120 + x, 79 + y, 1, 8);
        g2d.fillRect(100 + x, 80 + y, 1, 6);
        g2d.fillRect(103 + x, 80 + y, 3, 1);
        g2d.fillRect(116 + x, 80 + y, 2, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 12, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 4);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 4, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 4, 1);
        g2d.fillRect(111 + x, 86 + y, 8, 1);
        g2d.fillRect(105 + x, 87 + y, 13, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 1, 6);
        g2d.fillRect(104 + x, 87 + y, 1, 4);
        g2d.fillRect(122 + x, 87 + y, 1, 5);
        g2d.fillRect(111 + x, 88 + y, 1, 8);
        g2d.fillRect(117 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 91 + y, 1, 4);
        g2d.fillRect(118 + x, 91 + y, 1, 3);
        g2d.fillRect(100 + x, 93 + y, 3, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 4, 1);
        g2d.fillRect(104 + x, 94 + y, 2, 1);
        g2d.fillRect(113 + x, 94 + y, 4, 1);
        g2d.fillRect(106 + x, 95 + y, 5, 1);
        g2d.fillRect(112 + x, 95 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 81 + y, 1, 3);
        g2d.fillRect(102 + x, 82 + y, 4, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 3, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 6, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 2, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 3, 1);
        g2d.fillRect(108 + x, 86 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 86 + y, 2, 1);
        g2d.fillRect(100 + x, 87 + y, 4, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 4);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 88 + y, 1, 3);
        g2d.fillRect(105 + x, 88 + y, 6, 1);
        g2d.fillRect(112 + x, 88 + y, 5, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 5);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 6);
        g2d.fillRect(115 + x, 89 + y, 2, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 4);
        g2d.fillRect(104 + x, 91 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 3);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(122 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 83 + y, 4, 1);
        g2d.fillRect(106 + x, 84 + y, 3, 1);
        g2d.fillRect(110 + x, 84 + y, 2, 1);
        g2d.fillRect(113 + x, 84 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 4, 1);
        g2d.fillRect(112 + x, 89 + y, 3, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 4);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 2, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 2, 1);
        g2d.fillRect(106 + x, 92 + y, 2, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 3);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 4);
        g2d.fillRect(113 + x, 90 + y, 2, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(112 + x, 82 + y, 2, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 4, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
    }
}
