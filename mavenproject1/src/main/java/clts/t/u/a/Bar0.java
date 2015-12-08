/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperTL;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Bar0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Bar0()
    {
        super(2);
    }

    public Bar0(int layer)
    {
        super(layer);
    }

    public Bar0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Bar0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintbar(x,y,g2d);
    }

    public void paintbar(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(68 + x, 63 + y, 4, 1);
        g2d.fillRect(73 + x, 63 + y, 4, 1);
        g2d.fillRect(78 + x, 63 + y, 4, 1);
        g2d.fillRect(133 + x, 63 + y, 4, 1);
        g2d.fillRect(138 + x, 63 + y, 4, 1);
        g2d.fillRect(143 + x, 63 + y, 4, 1);
        g2d.fillRect(67 + x, 64 + y, 1, 34);
        g2d.fillRect(72 + x, 64 + y, 1, 34);
        g2d.fillRect(77 + x, 64 + y, 1, 34);
        g2d.fillRect(82 + x, 64 + y, 1, 34);
        g2d.fillRect(132 + x, 64 + y, 1, 34);
        g2d.fillRect(137 + x, 64 + y, 1, 34);
        g2d.fillRect(142 + x, 64 + y, 1, 34);
        g2d.fillRect(147 + x, 64 + y, 1, 34);
        g2d.fillRect(63 + x, 68 + y, 4, 1);
        g2d.fillRect(148 + x, 68 + y, 4, 1);
        g2d.fillRect(62 + x, 69 + y, 1, 25);
        g2d.fillRect(152 + x, 69 + y, 1, 25);
        g2d.fillRect(60 + x, 79 + y, 1, 5);
        g2d.fillRect(61 + x, 79 + y, 1, 1);
        g2d.fillRect(83 + x, 79 + y, 1, 1);
        g2d.fillRect(131 + x, 79 + y, 1, 1);
        g2d.fillRect(153 + x, 79 + y, 2, 1);
        g2d.fillRect(84 + x, 80 + y, 1, 3);
        g2d.fillRect(85 + x, 80 + y, 6, 1);
        g2d.fillRect(95 + x, 80 + y, 27, 1);
        g2d.fillRect(124 + x, 80 + y, 7, 1);
        g2d.fillRect(154 + x, 80 + y, 1, 4);
        g2d.fillRect(58 + x, 81 + y, 2, 1);
        g2d.fillRect(130 + x, 81 + y, 1, 2);
        g2d.fillRect(155 + x, 81 + y, 2, 1);
        g2d.fillRect(85 + x, 82 + y, 6, 1);
        g2d.fillRect(96 + x, 82 + y, 25, 1);
        g2d.fillRect(124 + x, 82 + y, 6, 1);
        g2d.fillRect(61 + x, 83 + y, 1, 1);
        g2d.fillRect(83 + x, 83 + y, 1, 1);
        g2d.fillRect(131 + x, 83 + y, 1, 1);
        g2d.fillRect(153 + x, 83 + y, 1, 1);
        g2d.fillRect(63 + x, 94 + y, 4, 1);
        g2d.fillRect(148 + x, 94 + y, 4, 1);
        g2d.fillRect(68 + x, 98 + y, 4, 1);
        g2d.fillRect(73 + x, 98 + y, 4, 1);
        g2d.fillRect(78 + x, 98 + y, 4, 1);
        g2d.fillRect(133 + x, 98 + y, 4, 1);
        g2d.fillRect(138 + x, 98 + y, 4, 1);
        g2d.fillRect(143 + x, 98 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(69 + x, 65 + y, 1, 32);
        g2d.fillRect(74 + x, 65 + y, 1, 32);
        g2d.fillRect(79 + x, 65 + y, 1, 32);
        g2d.fillRect(135 + x, 65 + y, 1, 32);
        g2d.fillRect(140 + x, 65 + y, 1, 32);
        g2d.fillRect(145 + x, 65 + y, 1, 32);
        g2d.fillRect(64 + x, 70 + y, 1, 23);
        g2d.fillRect(150 + x, 70 + y, 1, 23);
        g2d.fillRect(65 + x, 85 + y, 1, 1);
        g2d.fillRect(149 + x, 85 + y, 1, 1);
        g2d.fillRect(70 + x, 86 + y, 1, 1);
        g2d.fillRect(75 + x, 86 + y, 1, 1);
        g2d.fillRect(80 + x, 86 + y, 1, 1);
        g2d.fillRect(134 + x, 86 + y, 1, 1);
        g2d.fillRect(139 + x, 86 + y, 1, 1);
        g2d.fillRect(144 + x, 86 + y, 1, 1);
        g2d.fillRect(65 + x, 87 + y, 1, 2);
        g2d.fillRect(149 + x, 87 + y, 1, 2);
        g2d.fillRect(70 + x, 88 + y, 1, 1);
        g2d.fillRect(75 + x, 88 + y, 1, 1);
        g2d.fillRect(80 + x, 88 + y, 1, 1);
        g2d.fillRect(134 + x, 88 + y, 1, 1);
        g2d.fillRect(139 + x, 88 + y, 1, 1);
        g2d.fillRect(144 + x, 88 + y, 1, 1);
        g2d.fillRect(70 + x, 90 + y, 1, 2);
        g2d.fillRect(75 + x, 90 + y, 1, 2);
        g2d.fillRect(80 + x, 90 + y, 1, 2);
        g2d.fillRect(134 + x, 90 + y, 1, 2);
        g2d.fillRect(139 + x, 90 + y, 1, 2);
        g2d.fillRect(144 + x, 90 + y, 1, 2);
        g2d.fillRect(65 + x, 91 + y, 1, 2);
        g2d.fillRect(149 + x, 91 + y, 1, 2);
        g2d.fillRect(70 + x, 94 + y, 1, 3);
        g2d.fillRect(75 + x, 94 + y, 1, 3);
        g2d.fillRect(80 + x, 94 + y, 1, 3);
        g2d.fillRect(134 + x, 94 + y, 1, 3);
        g2d.fillRect(139 + x, 94 + y, 1, 3);
        g2d.fillRect(144 + x, 94 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(68 + x, 64 + y, 1, 34);
        g2d.fillRect(69 + x, 64 + y, 1, 1);
        g2d.fillRect(73 + x, 64 + y, 1, 34);
        g2d.fillRect(74 + x, 64 + y, 1, 1);
        g2d.fillRect(78 + x, 64 + y, 1, 34);
        g2d.fillRect(79 + x, 64 + y, 1, 1);
        g2d.fillRect(135 + x, 64 + y, 2, 1);
        g2d.fillRect(140 + x, 64 + y, 2, 1);
        g2d.fillRect(145 + x, 64 + y, 2, 1);
        g2d.fillRect(70 + x, 65 + y, 1, 2);
        g2d.fillRect(71 + x, 65 + y, 1, 33);
        g2d.fillRect(75 + x, 65 + y, 1, 2);
        g2d.fillRect(76 + x, 65 + y, 1, 33);
        g2d.fillRect(80 + x, 65 + y, 1, 2);
        g2d.fillRect(81 + x, 65 + y, 1, 33);
        g2d.fillRect(133 + x, 65 + y, 1, 33);
        g2d.fillRect(134 + x, 65 + y, 1, 2);
        g2d.fillRect(136 + x, 65 + y, 1, 33);
        g2d.fillRect(138 + x, 65 + y, 1, 33);
        g2d.fillRect(139 + x, 65 + y, 1, 2);
        g2d.fillRect(141 + x, 65 + y, 1, 33);
        g2d.fillRect(143 + x, 65 + y, 1, 33);
        g2d.fillRect(144 + x, 65 + y, 1, 2);
        g2d.fillRect(146 + x, 65 + y, 1, 33);
        g2d.fillRect(70 + x, 68 + y, 1, 2);
        g2d.fillRect(75 + x, 68 + y, 1, 2);
        g2d.fillRect(80 + x, 68 + y, 1, 2);
        g2d.fillRect(134 + x, 68 + y, 1, 2);
        g2d.fillRect(139 + x, 68 + y, 1, 2);
        g2d.fillRect(144 + x, 68 + y, 1, 2);
        g2d.fillRect(63 + x, 69 + y, 1, 25);
        g2d.fillRect(64 + x, 69 + y, 1, 1);
        g2d.fillRect(150 + x, 69 + y, 2, 1);
        g2d.fillRect(65 + x, 70 + y, 1, 2);
        g2d.fillRect(66 + x, 70 + y, 1, 24);
        g2d.fillRect(148 + x, 70 + y, 1, 24);
        g2d.fillRect(149 + x, 70 + y, 1, 2);
        g2d.fillRect(151 + x, 70 + y, 1, 24);
        g2d.fillRect(70 + x, 71 + y, 1, 2);
        g2d.fillRect(75 + x, 71 + y, 1, 2);
        g2d.fillRect(80 + x, 71 + y, 1, 2);
        g2d.fillRect(134 + x, 71 + y, 1, 2);
        g2d.fillRect(139 + x, 71 + y, 1, 2);
        g2d.fillRect(144 + x, 71 + y, 1, 2);
        g2d.fillRect(65 + x, 73 + y, 1, 2);
        g2d.fillRect(149 + x, 73 + y, 1, 2);
        g2d.fillRect(70 + x, 75 + y, 1, 2);
        g2d.fillRect(75 + x, 75 + y, 1, 2);
        g2d.fillRect(80 + x, 75 + y, 1, 2);
        g2d.fillRect(134 + x, 75 + y, 1, 2);
        g2d.fillRect(139 + x, 75 + y, 1, 2);
        g2d.fillRect(144 + x, 75 + y, 1, 2);
        g2d.fillRect(65 + x, 76 + y, 1, 2);
        g2d.fillRect(149 + x, 76 + y, 1, 2);
        g2d.fillRect(65 + x, 80 + y, 1, 5);
        g2d.fillRect(70 + x, 80 + y, 1, 6);
        g2d.fillRect(75 + x, 80 + y, 1, 6);
        g2d.fillRect(80 + x, 80 + y, 1, 6);
        g2d.fillRect(134 + x, 80 + y, 1, 6);
        g2d.fillRect(139 + x, 80 + y, 1, 6);
        g2d.fillRect(144 + x, 80 + y, 1, 6);
        g2d.fillRect(149 + x, 80 + y, 1, 5);
        g2d.fillRect(61 + x, 81 + y, 1, 2);
        g2d.fillRect(83 + x, 81 + y, 1, 2);
        g2d.fillRect(85 + x, 81 + y, 6, 1);
        g2d.fillRect(96 + x, 81 + y, 26, 1);
        g2d.fillRect(124 + x, 81 + y, 6, 1);
        g2d.fillRect(131 + x, 81 + y, 1, 2);
        g2d.fillRect(153 + x, 81 + y, 1, 2);
        g2d.fillRect(65 + x, 86 + y, 1, 1);
        g2d.fillRect(149 + x, 86 + y, 1, 1);
        g2d.fillRect(70 + x, 87 + y, 1, 1);
        g2d.fillRect(75 + x, 87 + y, 1, 1);
        g2d.fillRect(80 + x, 87 + y, 1, 1);
        g2d.fillRect(134 + x, 87 + y, 1, 1);
        g2d.fillRect(139 + x, 87 + y, 1, 1);
        g2d.fillRect(144 + x, 87 + y, 1, 1);
        g2d.fillRect(65 + x, 89 + y, 1, 2);
        g2d.fillRect(70 + x, 89 + y, 1, 1);
        g2d.fillRect(75 + x, 89 + y, 1, 1);
        g2d.fillRect(80 + x, 89 + y, 1, 1);
        g2d.fillRect(134 + x, 89 + y, 1, 1);
        g2d.fillRect(139 + x, 89 + y, 1, 1);
        g2d.fillRect(144 + x, 89 + y, 1, 1);
        g2d.fillRect(149 + x, 89 + y, 1, 2);
        g2d.fillRect(70 + x, 92 + y, 1, 2);
        g2d.fillRect(75 + x, 92 + y, 1, 2);
        g2d.fillRect(80 + x, 92 + y, 1, 2);
        g2d.fillRect(134 + x, 92 + y, 1, 2);
        g2d.fillRect(139 + x, 92 + y, 1, 2);
        g2d.fillRect(144 + x, 92 + y, 1, 2);
        g2d.fillRect(64 + x, 93 + y, 2, 1);
        g2d.fillRect(149 + x, 93 + y, 2, 1);
        g2d.fillRect(69 + x, 97 + y, 2, 1);
        g2d.fillRect(74 + x, 97 + y, 2, 1);
        g2d.fillRect(79 + x, 97 + y, 2, 1);
        g2d.fillRect(134 + x, 97 + y, 2, 1);
        g2d.fillRect(139 + x, 97 + y, 2, 1);
        g2d.fillRect(144 + x, 97 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(70 + x, 64 + y, 2, 1);
        g2d.fillRect(75 + x, 64 + y, 2, 1);
        g2d.fillRect(80 + x, 64 + y, 2, 1);
        g2d.fillRect(133 + x, 64 + y, 2, 1);
        g2d.fillRect(138 + x, 64 + y, 2, 1);
        g2d.fillRect(143 + x, 64 + y, 2, 1);
        g2d.fillRect(70 + x, 67 + y, 1, 1);
        g2d.fillRect(75 + x, 67 + y, 1, 1);
        g2d.fillRect(80 + x, 67 + y, 1, 1);
        g2d.fillRect(134 + x, 67 + y, 1, 1);
        g2d.fillRect(139 + x, 67 + y, 1, 1);
        g2d.fillRect(144 + x, 67 + y, 1, 1);
        g2d.fillRect(65 + x, 69 + y, 2, 1);
        g2d.fillRect(148 + x, 69 + y, 2, 1);
        g2d.fillRect(70 + x, 70 + y, 1, 1);
        g2d.fillRect(75 + x, 70 + y, 1, 1);
        g2d.fillRect(80 + x, 70 + y, 1, 1);
        g2d.fillRect(134 + x, 70 + y, 1, 1);
        g2d.fillRect(139 + x, 70 + y, 1, 1);
        g2d.fillRect(144 + x, 70 + y, 1, 1);
        g2d.fillRect(65 + x, 72 + y, 1, 1);
        g2d.fillRect(149 + x, 72 + y, 1, 1);
        g2d.fillRect(70 + x, 73 + y, 1, 2);
        g2d.fillRect(75 + x, 73 + y, 1, 2);
        g2d.fillRect(80 + x, 73 + y, 1, 2);
        g2d.fillRect(134 + x, 73 + y, 1, 2);
        g2d.fillRect(139 + x, 73 + y, 1, 2);
        g2d.fillRect(144 + x, 73 + y, 1, 2);
        g2d.fillRect(65 + x, 75 + y, 1, 1);
        g2d.fillRect(149 + x, 75 + y, 1, 1);
        g2d.fillRect(70 + x, 77 + y, 1, 3);
        g2d.fillRect(75 + x, 77 + y, 1, 3);
        g2d.fillRect(80 + x, 77 + y, 1, 3);
        g2d.fillRect(134 + x, 77 + y, 1, 3);
        g2d.fillRect(139 + x, 77 + y, 1, 3);
        g2d.fillRect(144 + x, 77 + y, 1, 3);
        g2d.fillRect(65 + x, 78 + y, 1, 2);
        g2d.fillRect(149 + x, 78 + y, 1, 2);
        g2d.fillRect(61 + x, 80 + y, 1, 1);
        g2d.fillRect(83 + x, 80 + y, 1, 1);
        g2d.fillRect(131 + x, 80 + y, 1, 1);
        g2d.fillRect(153 + x, 80 + y, 1, 1);
    }
}
