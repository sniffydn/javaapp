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
import pieces.clts.*;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot13 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot13()
    {
        super();
        skt = true;
        shrt = true;
    }

    public Bot13(int layer)
    {
        super(layer);
        skt = true;
        shrt = true;
    }

    public Bot13(ColorArray colorSwitch)
    {
        super(colorSwitch);
        skt = true;
        shrt = true;
    }

    public Bot13(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        skt = true;
        shrt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(step < 8)
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(101 + x, 90 + y, 1, 2);
            g2d.fillRect(117 + x, 89 + y, 1, 1);
            g2d.fillRect(109 + x, 89 + y, 1, 3);
            g2d.fillRect(121 + x, 88 + y, 1, 2);
            g2d.fillRect(102 + x, 88 + y, 1, 2);
            g2d.fillRect(119 + x, 87 + y, 1, 1);
            g2d.fillRect(115 + x, 87 + y, 1, 2);
            g2d.fillRect(118 + x, 85 + y, 1, 2);
            g2d.fillRect(121 + x, 83 + y, 1, 1);
            g2d.fillRect(118 + x, 83 + y, 1, 1);
            g2d.fillRect(101 + x, 83 + y, 1, 1);
            g2d.fillRect(105 + x, 82 + y, 1, 2);
            g2d.fillRect(117 + x, 81 + y, 1, 1);
            g2d.fillRect(120 + x, 80 + y, 1, 3);
            g2d.fillRect(116 + x, 80 + y, 1, 1);
            g2d.fillRect(113 + x, 80 + y, 1, 2);
            g2d.fillRect(103 + x, 80 + y, 2, 1);
            g2d.fillRect(101 + x, 80 + y, 1, 1);
            g2d.fillRect(114 + x, 79 + y, 2, 1);
            g2d.fillRect(117 + x, 79 + y, 3, 1);
            g2d.fillRect(118 + x, 78 + y, 2, 1);
            g2d.fillRect(106 + x, 80 + y, 1, 2);
            g2d.fillRect(107 + x, 80 + y, 1, 1);
            g2d.fillRect(110 + x, 80 + y, 1, 3);
            g2d.fillRect(111 + x, 80 + y, 1, 1);
            g2d.fillRect(114 + x, 81 + y, 1, 2);
            g2d.fillRect(120 + x, 89 + y, 1, 1);
            g2d.fillRect(113 + x, 90 + y, 2, 1);
            g2d.fillRect(112 + x, 91 + y, 5, 1);
            g2d.fillRect(107 + x, 91 + y, 2, 1);
            g2d.fillRect(102 + x, 91 + y, 3, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(110 + x, 91 + y, 2, 1);
            g2d.fillRect(117 + x, 90 + y, 1, 1);
            g2d.fillRect(107 + x, 90 + y, 1, 1);
            g2d.fillRect(115 + x, 89 + y, 1, 1);
            g2d.fillRect(116 + x, 87 + y, 1, 2);
            g2d.fillRect(119 + x, 85 + y, 1, 2);
            g2d.fillRect(114 + x, 84 + y, 1, 2);
            g2d.fillRect(110 + x, 84 + y, 1, 6);
            g2d.fillRect(117 + x, 83 + y, 1, 2);
            g2d.fillRect(104 + x, 83 + y, 1, 5);
            g2d.fillRect(116 + x, 82 + y, 1, 1);
            g2d.fillRect(108 + x, 88 + y, 2, 1);
            g2d.fillRect(118 + x, 84 + y, 1, 1);
            g2d.fillRect(115 + x, 85 + y, 1, 2);
            g2d.fillRect(109 + x, 85 + y, 1, 3);
            g2d.fillRect(103 + x, 84 + y, 1, 5);
            g2d.fillRect(101 + x, 81 + y, 1, 2);
            g2d.fillRect(100 + x, 81 + y, 1, 5);
            g2d.fillRect(99 + x, 82 + y, 1, 6);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(111 + x, 90 + y, 1, 1);
            g2d.fillRect(103 + x, 90 + y, 1, 1);
            g2d.fillRect(100 + x, 90 + y, 1, 1);
            g2d.fillRect(98 + x, 90 + y, 1, 1);
            g2d.fillRect(118 + x, 89 + y, 1, 2);
            g2d.fillRect(108 + x, 89 + y, 1, 1);
            g2d.fillRect(104 + x, 88 + y, 1, 1);
            g2d.fillRect(122 + x, 87 + y, 1, 2);
            g2d.fillRect(117 + x, 87 + y, 1, 1);
            g2d.fillRect(122 + x, 85 + y, 1, 1);
            g2d.fillRect(120 + x, 85 + y, 1, 2);
            g2d.fillRect(121 + x, 84 + y, 1, 1);
            g2d.fillRect(115 + x, 84 + y, 1, 1);
            g2d.fillRect(119 + x, 83 + y, 1, 2);
            g2d.fillRect(114 + x, 80 + y, 2, 1);
            g2d.fillRect(117 + x, 80 + y, 3, 1);
            g2d.fillRect(101 + x, 86 + y, 1, 3);
            g2d.fillRect(102 + x, 81 + y, 1, 7);
            g2d.fillRect(103 + x, 81 + y, 1, 3);
            g2d.fillRect(104 + x, 81 + y, 1, 2);
            g2d.fillRect(105 + x, 81 + y, 1, 1);
            g2d.fillRect(105 + x, 84 + y, 1, 4);
            g2d.fillRect(106 + x, 82 + y, 1, 4);
            g2d.fillRect(107 + x, 86 + y, 1, 3);
            g2d.fillRect(107 + x, 81 + y, 1, 2);
            g2d.fillRect(108 + x, 81 + y, 1, 7);
            g2d.fillRect(109 + x, 81 + y, 1, 4);
            g2d.fillRect(110 + x, 83 + y, 1, 1);
            g2d.fillRect(111 + x, 81 + y, 1, 8);
            g2d.fillRect(112 + x, 81 + y, 1, 2);
            g2d.fillRect(113 + x, 82 + y, 1, 5);
            g2d.fillRect(114 + x, 86 + y, 1, 3);
            g2d.fillRect(114 + x, 83 + y, 3, 1);
            g2d.fillRect(115 + x, 81 + y, 2, 1);
            g2d.fillRect(117 + x, 82 + y, 2, 1);
            g2d.fillRect(118 + x, 81 + y, 1, 1);
            g2d.fillRect(116 + x, 85 + y, 1, 2);
            g2d.fillRect(117 + x, 85 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(112 + x, 90 + y, 1, 1);
            g2d.fillRect(119 + x, 89 + y, 1, 2);
            g2d.fillRect(99 + x, 89 + y, 1, 2);
            g2d.fillRect(123 + x, 87 + y, 1, 1);
            g2d.fillRect(118 + x, 87 + y, 1, 1);
            g2d.fillRect(117 + x, 86 + y, 1, 1);
            g2d.fillRect(106 + x, 86 + y, 1, 3);
            g2d.fillRect(100 + x, 86 + y, 1, 2);
            g2d.fillRect(121 + x, 85 + y, 1, 1);
            g2d.fillRect(116 + x, 84 + y, 1, 1);
            g2d.fillRect(101 + x, 84 + y, 1, 2);
            g2d.fillRect(120 + x, 83 + y, 1, 2);
            g2d.fillRect(112 + x, 83 + y, 1, 6);
            g2d.fillRect(107 + x, 83 + y, 1, 3);
            g2d.fillRect(115 + x, 82 + y, 1, 1);
            g2d.fillRect(119 + x, 81 + y, 1, 2);
            g2d.fillRect(105 + x, 88 + y, 1, 1);
            g2d.fillRect(104 + x, 90 + y, 3, 1);
            g2d.fillRect(105 + x, 91 + y, 2, 1);
            g2d.fillRect(113 + x, 87 + y, 1, 2);
            g2d.fillRect(120 + x, 90 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(102 + x, 90 + y, 1, 1);
            g2d.fillRect(111 + x, 89 + y, 1, 1);
            g2d.fillRect(107 + x, 89 + y, 1, 1);
            g2d.fillRect(105 + x, 89 + y, 1, 1);
            g2d.fillRect(101 + x, 89 + y, 1, 1);
            g2d.fillRect(100 + x, 88 + y, 1, 1);
            g2d.fillRect(120 + x, 87 + y, 1, 2);
            g2d.fillRect(119 + x, 88 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(116 + x, 89 + y, 1, 1);
            g2d.fillRect(112 + x, 89 + y, 2, 1);
            g2d.fillRect(103 + x, 89 + y, 2, 1);
            g2d.fillRect(117 + x, 88 + y, 2, 1);
            g2d.fillRect(99 + x, 88 + y, 1, 1);
            g2d.fillRect(121 + x, 86 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(115 + x, 90 + y, 2, 1);
            g2d.fillRect(110 + x, 90 + y, 1, 1);
            g2d.fillRect(108 + x, 90 + y, 1, 1);
            g2d.fillRect(114 + x, 89 + y, 1, 1);
            g2d.fillRect(106 + x, 89 + y, 1, 1);
            g2d.fillRect(100 + x, 89 + y, 1, 1);
            g2d.fillRect(121 + x, 87 + y, 1, 1);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
            g2d.fillRect(119 + x, 90 + y, 1, 2);
            g2d.fillRect(111 + x, 89 + y, 1, 3);
            g2d.fillRect(103 + x, 89 + y, 1, 1);
            g2d.fillRect(118 + x, 88 + y, 1, 2);
            g2d.fillRect(99 + x, 88 + y, 1, 2);
            g2d.fillRect(105 + x, 87 + y, 1, 2);
            g2d.fillRect(101 + x, 87 + y, 1, 1);
            g2d.fillRect(102 + x, 85 + y, 1, 2);
            g2d.fillRect(119 + x, 83 + y, 1, 1);
            g2d.fillRect(102 + x, 83 + y, 1, 1);
            g2d.fillRect(99 + x, 83 + y, 1, 1);
            g2d.fillRect(115 + x, 82 + y, 1, 2);
            g2d.fillRect(103 + x, 81 + y, 1, 1);
            g2d.fillRect(119 + x, 80 + y, 1, 1);
            g2d.fillRect(116 + x, 80 + y, 2, 1);
            g2d.fillRect(107 + x, 80 + y, 1, 2);
            g2d.fillRect(104 + x, 80 + y, 1, 1);
            g2d.fillRect(100 + x, 80 + y, 1, 3);
            g2d.fillRect(105 + x, 79 + y, 2, 1);
            g2d.fillRect(109 + x, 80 + y, 2, 1);
            g2d.fillRect(113 + x, 80 + y, 2, 1);
            g2d.fillRect(104 + x, 91 + y, 5, 1);
            g2d.fillRect(101 + x, 78 + y, 2, 1);
            g2d.fillRect(101 + x, 79 + y, 3, 1);
            g2d.fillRect(106 + x, 81 + y, 1, 2);
            g2d.fillRect(110 + x, 81 + y, 1, 2);
            g2d.fillRect(114 + x, 81 + y, 1, 1);
            g2d.fillRect(116 + x, 91 + y, 3, 1);
            g2d.fillRect(112 + x, 91 + y, 2, 1);
            g2d.fillRect(106 + x, 90 + y, 2, 1);
            g2d.fillRect(100 + x, 89 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(109 + x, 91 + y, 2, 1);
            g2d.fillRect(113 + x, 90 + y, 1, 1);
            g2d.fillRect(103 + x, 90 + y, 1, 1);
            g2d.fillRect(105 + x, 89 + y, 1, 1);
            g2d.fillRect(104 + x, 87 + y, 1, 2);
            g2d.fillRect(101 + x, 85 + y, 1, 2);
            g2d.fillRect(110 + x, 84 + y, 1, 6);
            g2d.fillRect(106 + x, 84 + y, 1, 2);
            g2d.fillRect(116 + x, 83 + y, 1, 5);
            g2d.fillRect(103 + x, 83 + y, 1, 2);
            g2d.fillRect(104 + x, 82 + y, 1, 1);
            g2d.fillRect(102 + x, 84 + y, 1, 1);
            g2d.fillRect(105 + x, 85 + y, 1, 2);
            g2d.fillRect(111 + x, 85 + y, 1, 4);
            g2d.fillRect(112 + x, 88 + y, 1, 1);
            g2d.fillRect(117 + x, 84 + y, 1, 5);
            g2d.fillRect(119 + x, 81 + y, 1, 2);
            g2d.fillRect(120 + x, 81 + y, 1, 5);
            g2d.fillRect(121 + x, 82 + y, 1, 6);

            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(122 + x, 90 + y, 1, 1);
            g2d.fillRect(120 + x, 90 + y, 1, 1);
            g2d.fillRect(117 + x, 90 + y, 1, 1);
            g2d.fillRect(109 + x, 90 + y, 1, 1);
            g2d.fillRect(112 + x, 89 + y, 1, 1);
            g2d.fillRect(102 + x, 89 + y, 1, 2);
            g2d.fillRect(116 + x, 88 + y, 1, 1);
            g2d.fillRect(103 + x, 87 + y, 1, 1);
            g2d.fillRect(98 + x, 87 + y, 1, 2);
            g2d.fillRect(100 + x, 85 + y, 1, 2);
            g2d.fillRect(98 + x, 85 + y, 1, 1);
            g2d.fillRect(105 + x, 84 + y, 1, 1);
            g2d.fillRect(99 + x, 84 + y, 1, 1);
            g2d.fillRect(101 + x, 83 + y, 1, 2);
            g2d.fillRect(101 + x, 80 + y, 3, 1);
            g2d.fillRect(104 + x, 81 + y, 2, 1);
            g2d.fillRect(115 + x, 81 + y, 4, 1);
            g2d.fillRect(104 + x, 83 + y, 3, 1);
            g2d.fillRect(103 + x, 85 + y, 2, 1);
            g2d.fillRect(105 + x, 80 + y, 2, 1);
            g2d.fillRect(102 + x, 81 + y, 1, 1);
            g2d.fillRect(102 + x, 82 + y, 2, 1);
            g2d.fillRect(104 + x, 86 + y, 1, 1);
            g2d.fillRect(106 + x, 86 + y, 1, 3);
            g2d.fillRect(107 + x, 82 + y, 1, 5);
            g2d.fillRect(108 + x, 81 + y, 1, 2);
            g2d.fillRect(109 + x, 81 + y, 1, 8);
            g2d.fillRect(110 + x, 83 + y, 1, 1);
            g2d.fillRect(111 + x, 81 + y, 1, 4);
            g2d.fillRect(112 + x, 81 + y, 1, 7);
            g2d.fillRect(113 + x, 81 + y, 1, 2);
            g2d.fillRect(114 + x, 82 + y, 1, 4);
            g2d.fillRect(115 + x, 84 + y, 1, 4);
            g2d.fillRect(113 + x, 86 + y, 1, 3);
            g2d.fillRect(116 + x, 82 + y, 3, 1);
            g2d.fillRect(117 + x, 83 + y, 2, 1);
            g2d.fillRect(118 + x, 84 + y, 1, 4);
            g2d.fillRect(119 + x, 86 + y, 1, 3);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(108 + x, 90 + y, 1, 1);
            g2d.fillRect(121 + x, 89 + y, 1, 2);
            g2d.fillRect(101 + x, 89 + y, 1, 2);
            g2d.fillRect(102 + x, 87 + y, 1, 1);
            g2d.fillRect(97 + x, 87 + y, 1, 1);
            g2d.fillRect(120 + x, 86 + y, 1, 2);
            g2d.fillRect(114 + x, 86 + y, 1, 3);
            g2d.fillRect(103 + x, 86 + y, 1, 1);
            g2d.fillRect(99 + x, 85 + y, 1, 1);
            g2d.fillRect(119 + x, 84 + y, 1, 2);
            g2d.fillRect(104 + x, 84 + y, 1, 1);
            g2d.fillRect(113 + x, 83 + y, 1, 3);
            g2d.fillRect(108 + x, 83 + y, 1, 6);
            g2d.fillRect(100 + x, 83 + y, 1, 2);
            g2d.fillRect(105 + x, 82 + y, 1, 1);
            g2d.fillRect(101 + x, 81 + y, 1, 2);
            g2d.fillRect(100 + x, 90 + y, 1, 1);
            g2d.fillRect(107 + x, 87 + y, 1, 2);
            g2d.fillRect(115 + x, 88 + y, 1, 1);
            g2d.fillRect(114 + x, 90 + y, 3, 1);
            g2d.fillRect(114 + x, 91 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(118 + x, 90 + y, 1, 1);
            g2d.fillRect(119 + x, 89 + y, 1, 1);
            g2d.fillRect(115 + x, 89 + y, 1, 1);
            g2d.fillRect(113 + x, 89 + y, 1, 1);
            g2d.fillRect(109 + x, 89 + y, 1, 1);
            g2d.fillRect(120 + x, 88 + y, 1, 1);
            g2d.fillRect(100 + x, 87 + y, 1, 2);
            g2d.fillRect(101 + x, 88 + y, 1, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
            g2d.fillRect(116 + x, 89 + y, 2, 1);
            g2d.fillRect(107 + x, 89 + y, 2, 1);
            g2d.fillRect(104 + x, 89 + y, 1, 1);
            g2d.fillRect(121 + x, 88 + y, 1, 1);
            g2d.fillRect(102 + x, 88 + y, 2, 1);
            g2d.fillRect(98 + x, 86 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(112 + x, 90 + y, 1, 1);
            g2d.fillRect(110 + x, 90 + y, 1, 1);
            g2d.fillRect(104 + x, 90 + y, 2, 1);
            g2d.fillRect(120 + x, 89 + y, 1, 1);
            g2d.fillRect(114 + x, 89 + y, 1, 1);
            g2d.fillRect(106 + x, 89 + y, 1, 1);
            g2d.fillRect(99 + x, 87 + y, 1, 1);
        }
    }
}
