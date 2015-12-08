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
public class Bot23 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot23()
    {
        super();
        jean = true;
        skt = true;
    }

    public Bot23(int layer)
    {
        super(layer);
        jean = true;
        skt = true;
    }

    public Bot23(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        skt = true;
    }

    public Bot23(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        skt = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 4);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 3, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 4);
        g2d.fillRect(101 + x, 82 + y, 1, 5);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(117 + x, 82 + y, 3, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 3);
        g2d.fillRect(104 + x, 83 + y, 1, 3);
        g2d.fillRect(107 + x, 83 + y, 3, 1);
        g2d.fillRect(113 + x, 83 + y, 2, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 3);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(111 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 4, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 5, 1);
        g2d.fillRect(102 + x, 86 + y, 2, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 3);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 2, 1);
        g2d.fillRect(120 + x, 91 + y, 2, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 4, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 6);
        g2d.fillRect(113 + x, 86 + y, 1, 3);
        g2d.fillRect(114 + x, 86 + y, 3, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 5);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 3);
        g2d.fillRect(109 + x, 88 + y, 1, 4);
        g2d.fillRect(114 + x, 88 + y, 2, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 3);
        g2d.fillRect(100 + x, 90 + y, 4, 1);
        g2d.fillRect(105 + x, 90 + y, 2, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 2, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 3);
        g2d.fillRect(102 + x, 87 + y, 1, 3);
        g2d.fillRect(103 + x, 87 + y, 1, 3);
        g2d.fillRect(105 + x, 87 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 3, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(120 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 4, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 4, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(123 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 91 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 91 + y, 2, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 4);
        g2d.fillRect(119 + x, 91 + y, 1, 3);
        g2d.fillRect(122 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 2, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 4);
        g2d.fillRect(115 + x, 92 + y, 3, 1);
        g2d.fillRect(120 + x, 92 + y, 2, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(122 + x, 94 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 2);
        g2d.fillRect(123 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 3);
        g2d.fillRect(103 + x, 98 + y, 1, 1);
        g2d.fillRect(109 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 2);
        g2d.fillRect(124 + x, 98 + y, 1, 2);
        g2d.fillRect(97 + x, 99 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 1);
        g2d.fillRect(110 + x, 99 + y, 1, 2);
        g2d.fillRect(114 + x, 99 + y, 1, 1);
        g2d.fillRect(100 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 2);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(113 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 1);
        g2d.fillRect(121 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
        g2d.fillRect(106 + x, 101 + y, 2, 1);
        g2d.fillRect(112 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(99 + x, 92 + y, 1, 3);
        g2d.fillRect(122 + x, 92 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 4);
        g2d.fillRect(101 + x, 93 + y, 1, 6);
        g2d.fillRect(105 + x, 93 + y, 1, 7);
        g2d.fillRect(108 + x, 93 + y, 1, 5);
        g2d.fillRect(115 + x, 93 + y, 1, 5);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 4);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(124 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 1, 4);
        g2d.fillRect(106 + x, 95 + y, 1, 6);
        g2d.fillRect(109 + x, 95 + y, 1, 3);
        g2d.fillRect(112 + x, 95 + y, 2, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 6);
        g2d.fillRect(110 + x, 96 + y, 1, 3);
        g2d.fillRect(113 + x, 96 + y, 1, 4);
        g2d.fillRect(114 + x, 96 + y, 1, 3);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(122 + x, 96 + y, 1, 4);
        g2d.fillRect(123 + x, 96 + y, 1, 1);
        g2d.fillRect(125 + x, 96 + y, 1, 2);
        g2d.fillRect(96 + x, 97 + y, 1, 3);
        g2d.fillRect(100 + x, 97 + y, 1, 3);
        g2d.fillRect(116 + x, 97 + y, 1, 3);
        g2d.fillRect(126 + x, 97 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 3);
        g2d.fillRect(104 + x, 98 + y, 1, 3);
        g2d.fillRect(111 + x, 98 + y, 1, 3);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 3);
        g2d.fillRect(109 + x, 99 + y, 1, 2);
        g2d.fillRect(112 + x, 99 + y, 1, 2);
        g2d.fillRect(120 + x, 99 + y, 2, 1);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(100 + x, 93 + y, 1, 4);
        g2d.fillRect(103 + x, 93 + y, 1, 5);
        g2d.fillRect(104 + x, 93 + y, 1, 5);
        g2d.fillRect(123 + x, 93 + y, 1, 3);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(119 + x, 94 + y, 1, 2);
        g2d.fillRect(120 + x, 94 + y, 1, 5);
        g2d.fillRect(99 + x, 95 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 5);
        g2d.fillRect(111 + x, 95 + y, 1, 3);
        g2d.fillRect(117 + x, 95 + y, 1, 3);
        g2d.fillRect(121 + x, 95 + y, 1, 4);
        g2d.fillRect(122 + x, 95 + y, 1, 1);
        g2d.fillRect(124 + x, 95 + y, 1, 3);
        g2d.fillRect(112 + x, 96 + y, 1, 3);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(117 + x, 99 + y, 1, 1);
        g2d.fillRect(123 + x, 99 + y, 1, 1);
    }
}
