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
public class Broom0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Broom0()
    {
        super(2);
    }

    public Broom0(int layer)
    {
        super(layer);
    }

    public Broom0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Broom0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        x+=shiftX;
        y+=shiftY;
        paintBROOM1(x,y,g2d);
    }

    public void paintBROOM1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(62 + x, 121 + y, 1, 1);
        g2d.fillRect(65 + x, 122 + y, 1, 1);
        g2d.fillRect(67 + x, 122 + y, 1, 1);
        g2d.fillRect(61 + x, 124 + y, 1, 2);
        g2d.fillRect(64 + x, 124 + y, 1, 1);
        g2d.fillRect(62 + x, 125 + y, 1, 2);
        g2d.fillRect(60 + x, 130 + y, 1, 1);
        g2d.fillRect(59 + x, 132 + y, 1, 2);
        g2d.fillRect(58 + x, 134 + y, 1, 2);
        g2d.fillRect(57 + x, 136 + y, 1, 2);
        g2d.fillRect(56 + x, 138 + y, 1, 2);
        g2d.fillRect(55 + x, 141 + y, 1, 1);
        g2d.fillRect(54 + x, 142 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(62 + x, 115 + y, 1, 1);
        g2d.fillRect(63 + x, 118 + y, 1, 2);
        g2d.fillRect(65 + x, 118 + y, 1, 2);
        g2d.fillRect(68 + x, 118 + y, 1, 1);
        g2d.fillRect(62 + x, 119 + y, 1, 2);
        g2d.fillRect(67 + x, 119 + y, 1, 1);
        g2d.fillRect(61 + x, 120 + y, 1, 2);
        g2d.fillRect(64 + x, 120 + y, 1, 1);
        g2d.fillRect(68 + x, 120 + y, 1, 3);
        g2d.fillRect(63 + x, 121 + y, 1, 1);
        g2d.fillRect(66 + x, 121 + y, 1, 2);
        g2d.fillRect(67 + x, 121 + y, 1, 1);
        g2d.fillRect(69 + x, 121 + y, 3, 1);
        g2d.fillRect(62 + x, 122 + y, 1, 1);
        g2d.fillRect(61 + x, 123 + y, 1, 1);
        g2d.fillRect(64 + x, 123 + y, 2, 1);
        g2d.fillRect(60 + x, 124 + y, 1, 1);
        g2d.fillRect(62 + x, 124 + y, 2, 1);
        g2d.fillRect(59 + x, 125 + y, 1, 1);
        g2d.fillRect(60 + x, 126 + y, 2, 1);
        g2d.fillRect(61 + x, 127 + y, 1, 6);
        g2d.fillRect(62 + x, 127 + y, 1, 4);
        g2d.fillRect(57 + x, 128 + y, 2, 1);
        g2d.fillRect(60 + x, 129 + y, 1, 1);
        g2d.fillRect(56 + x, 130 + y, 1, 1);
        g2d.fillRect(59 + x, 130 + y, 1, 2);
        g2d.fillRect(60 + x, 131 + y, 1, 1);
        g2d.fillRect(53 + x, 132 + y, 1, 1);
        g2d.fillRect(55 + x, 132 + y, 1, 1);
        g2d.fillRect(58 + x, 132 + y, 1, 2);
        g2d.fillRect(52 + x, 134 + y, 1, 1);
        g2d.fillRect(54 + x, 134 + y, 1, 3);
        g2d.fillRect(57 + x, 134 + y, 1, 2);
        g2d.fillRect(59 + x, 134 + y, 1, 1);
        g2d.fillRect(51 + x, 135 + y, 1, 1);
        g2d.fillRect(60 + x, 135 + y, 1, 2);
        g2d.fillRect(50 + x, 136 + y, 1, 1);
        g2d.fillRect(53 + x, 136 + y, 1, 1);
        g2d.fillRect(56 + x, 136 + y, 1, 2);
        g2d.fillRect(58 + x, 136 + y, 1, 3);
        g2d.fillRect(59 + x, 136 + y, 1, 4);
        g2d.fillRect(49 + x, 137 + y, 1, 1);
        g2d.fillRect(51 + x, 137 + y, 1, 2);
        g2d.fillRect(52 + x, 137 + y, 1, 3);
        g2d.fillRect(55 + x, 137 + y, 1, 4);
        g2d.fillRect(54 + x, 138 + y, 1, 4);
        g2d.fillRect(57 + x, 138 + y, 1, 3);
        g2d.fillRect(50 + x, 140 + y, 1, 4);
        g2d.fillRect(56 + x, 140 + y, 1, 4);
        g2d.fillRect(53 + x, 141 + y, 1, 3);
        g2d.fillRect(52 + x, 143 + y, 1, 5);
        g2d.fillRect(51 + x, 145 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 77 + y, 1, 1);
        g2d.fillRect(99 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 1);
        g2d.fillRect(97 + x, 80 + y, 1, 1);
        g2d.fillRect(91 + x, 85 + y, 3, 1);
        g2d.fillRect(92 + x, 86 + y, 1, 1);
        g2d.fillRect(91 + x, 87 + y, 1, 1);
        g2d.fillRect(90 + x, 88 + y, 1, 1);
        g2d.fillRect(89 + x, 90 + y, 1, 1);
        g2d.fillRect(88 + x, 91 + y, 1, 2);
        g2d.fillRect(87 + x, 93 + y, 1, 1);
        g2d.fillRect(86 + x, 94 + y, 1, 1);
        g2d.fillRect(85 + x, 95 + y, 1, 1);
        g2d.fillRect(84 + x, 96 + y, 1, 1);
        g2d.fillRect(83 + x, 97 + y, 1, 2);
        g2d.fillRect(82 + x, 99 + y, 1, 2);
        g2d.fillRect(81 + x, 101 + y, 1, 1);
        g2d.fillRect(80 + x, 102 + y, 1, 1);
        g2d.fillRect(79 + x, 103 + y, 1, 1);
        g2d.fillRect(78 + x, 104 + y, 1, 1);
        g2d.fillRect(77 + x, 105 + y, 1, 1);
        g2d.fillRect(76 + x, 106 + y, 1, 2);
        g2d.fillRect(75 + x, 108 + y, 1, 2);
        g2d.fillRect(74 + x, 110 + y, 1, 1);
        g2d.fillRect(73 + x, 111 + y, 1, 1);
        g2d.fillRect(72 + x, 112 + y, 1, 1);
        g2d.fillRect(71 + x, 113 + y, 1, 2);
        g2d.fillRect(70 + x, 115 + y, 1, 2);
        g2d.fillRect(69 + x, 117 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(62 + x, 116 + y, 1, 3);
        g2d.fillRect(59 + x, 117 + y, 1, 1);
        g2d.fillRect(60 + x, 118 + y, 1, 5);
        g2d.fillRect(64 + x, 119 + y, 1, 1);
        g2d.fillRect(66 + x, 119 + y, 1, 2);
        g2d.fillRect(63 + x, 120 + y, 1, 1);
        g2d.fillRect(65 + x, 120 + y, 1, 2);
        g2d.fillRect(64 + x, 121 + y, 1, 2);
        g2d.fillRect(61 + x, 122 + y, 1, 1);
        g2d.fillRect(63 + x, 122 + y, 1, 2);
        g2d.fillRect(62 + x, 123 + y, 1, 1);
        g2d.fillRect(60 + x, 125 + y, 1, 1);
        g2d.fillRect(58 + x, 126 + y, 1, 2);
        g2d.fillRect(59 + x, 126 + y, 1, 4);
        g2d.fillRect(60 + x, 127 + y, 1, 2);
        g2d.fillRect(56 + x, 129 + y, 3, 1);
        g2d.fillRect(55 + x, 130 + y, 1, 2);
        g2d.fillRect(57 + x, 130 + y, 1, 4);
        g2d.fillRect(58 + x, 130 + y, 1, 2);
        g2d.fillRect(54 + x, 131 + y, 1, 3);
        g2d.fillRect(56 + x, 131 + y, 1, 5);
        g2d.fillRect(60 + x, 132 + y, 1, 3);
        g2d.fillRect(53 + x, 133 + y, 1, 3);
        g2d.fillRect(55 + x, 133 + y, 1, 4);
        g2d.fillRect(52 + x, 135 + y, 1, 2);
        g2d.fillRect(59 + x, 135 + y, 1, 1);
        g2d.fillRect(51 + x, 136 + y, 1, 1);
        g2d.fillRect(53 + x, 137 + y, 1, 4);
        g2d.fillRect(54 + x, 137 + y, 1, 1);
        g2d.fillRect(51 + x, 139 + y, 1, 6);
        g2d.fillRect(52 + x, 140 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 76 + y, 1, 2);
        g2d.fillRect(100 + x, 76 + y, 1, 1);
        g2d.fillRect(98 + x, 77 + y, 1, 2);
        g2d.fillRect(97 + x, 78 + y, 1, 2);
        g2d.fillRect(96 + x, 79 + y, 1, 2);
        g2d.fillRect(95 + x, 80 + y, 1, 2);
        g2d.fillRect(90 + x, 86 + y, 1, 2);
        g2d.fillRect(91 + x, 86 + y, 1, 1);
        g2d.fillRect(89 + x, 87 + y, 1, 3);
        g2d.fillRect(88 + x, 89 + y, 1, 2);
        g2d.fillRect(87 + x, 90 + y, 1, 3);
        g2d.fillRect(86 + x, 92 + y, 1, 2);
        g2d.fillRect(85 + x, 93 + y, 1, 2);
        g2d.fillRect(83 + x, 94 + y, 1, 3);
        g2d.fillRect(84 + x, 94 + y, 1, 2);
        g2d.fillRect(82 + x, 96 + y, 1, 3);
        g2d.fillRect(81 + x, 97 + y, 1, 4);
        g2d.fillRect(80 + x, 99 + y, 1, 3);
        g2d.fillRect(79 + x, 100 + y, 1, 3);
        g2d.fillRect(78 + x, 101 + y, 1, 3);
        g2d.fillRect(76 + x, 103 + y, 1, 3);
        g2d.fillRect(77 + x, 103 + y, 1, 2);
        g2d.fillRect(75 + x, 105 + y, 1, 3);
        g2d.fillRect(74 + x, 106 + y, 1, 4);
        g2d.fillRect(73 + x, 108 + y, 1, 3);
        g2d.fillRect(72 + x, 109 + y, 1, 3);
        g2d.fillRect(71 + x, 110 + y, 1, 3);
        g2d.fillRect(70 + x, 112 + y, 1, 3);
        g2d.fillRect(69 + x, 113 + y, 1, 4);
        g2d.fillRect(68 + x, 115 + y, 1, 3);
        g2d.fillRect(67 + x, 116 + y, 1, 3);
        g2d.fillRect(66 + x, 117 + y, 1, 2);
    }
}
