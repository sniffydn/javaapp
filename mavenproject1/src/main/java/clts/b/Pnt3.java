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
public class Pnt3 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt3()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt3(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt3(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt3(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintP1(x,y,g2d);
    }

    public void paintP1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 84 + y, 3, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 2, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 14);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 2, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 13);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 1, 4);
        g2d.fillRect(109 + x, 90 + y, 6, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 12);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 5);
        g2d.fillRect(106 + x, 98 + y, 1, 4);
        g2d.fillRect(98 + x, 102 + y, 1, 6);
        g2d.fillRect(105 + x, 102 + y, 1, 5);
        g2d.fillRect(120 + x, 102 + y, 1, 17);
        g2d.fillRect(114 + x, 103 + y, 1, 14);
        g2d.fillRect(104 + x, 107 + y, 1, 2);
        g2d.fillRect(97 + x, 108 + y, 1, 6);
        g2d.fillRect(103 + x, 109 + y, 1, 5);
        g2d.fillRect(96 + x, 114 + y, 1, 1);
        g2d.fillRect(102 + x, 115 + y, 1, 4);
        g2d.fillRect(95 + x, 117 + y, 1, 2);
        g2d.fillRect(113 + x, 117 + y, 1, 8);
        g2d.fillRect(101 + x, 118 + y, 1, 9);
        g2d.fillRect(94 + x, 119 + y, 1, 5);
        g2d.fillRect(121 + x, 120 + y, 1, 9);
        g2d.fillRect(93 + x, 124 + y, 1, 4);
        g2d.fillRect(100 + x, 127 + y, 1, 11);
        g2d.fillRect(92 + x, 128 + y, 1, 5);
        g2d.fillRect(112 + x, 128 + y, 1, 11);
        g2d.fillRect(122 + x, 129 + y, 1, 9);
        g2d.fillRect(91 + x, 133 + y, 1, 5);
        g2d.fillRect(90 + x, 138 + y, 1, 3);
        g2d.fillRect(101 + x, 138 + y, 1, 16);
        g2d.fillRect(123 + x, 138 + y, 1, 7);
        g2d.fillRect(111 + x, 139 + y, 1, 6);
        g2d.fillRect(89 + x, 141 + y, 1, 5);
        g2d.fillRect(110 + x, 145 + y, 1, 8);
        g2d.fillRect(124 + x, 145 + y, 1, 5);
        g2d.fillRect(88 + x, 146 + y, 1, 3);
        g2d.fillRect(87 + x, 150 + y, 1, 4);
        g2d.fillRect(125 + x, 150 + y, 1, 9);
        g2d.fillRect(109 + x, 153 + y, 1, 3);
        g2d.fillRect(86 + x, 154 + y, 1, 5);
        g2d.fillRect(102 + x, 154 + y, 1, 6);
        g2d.fillRect(124 + x, 155 + y, 1, 4);
        g2d.fillRect(103 + x, 156 + y, 1, 3);
        g2d.fillRect(108 + x, 156 + y, 1, 1);
        g2d.fillRect(123 + x, 156 + y, 1, 3);
        g2d.fillRect(126 + x, 156 + y, 1, 1);
        g2d.fillRect(109 + x, 157 + y, 1, 2);
        g2d.fillRect(110 + x, 157 + y, 1, 2);
        g2d.fillRect(122 + x, 157 + y, 1, 3);
        g2d.fillRect(87 + x, 158 + y, 1, 1);
        g2d.fillRect(120 + x, 158 + y, 1, 2);
        g2d.fillRect(121 + x, 158 + y, 1, 2);
        g2d.fillRect(88 + x, 159 + y, 6, 1);
        g2d.fillRect(98 + x, 159 + y, 1, 2);
        g2d.fillRect(99 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 2, 1);
        g2d.fillRect(111 + x, 159 + y, 9, 1);
        g2d.fillRect(91 + x, 160 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 19);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 46);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(120 + x, 89 + y, 1, 13);
        g2d.fillRect(101 + x, 90 + y, 1, 9);
        g2d.fillRect(115 + x, 90 + y, 1, 4);
        g2d.fillRect(106 + x, 91 + y, 1, 7);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 11);
        g2d.fillRect(105 + x, 96 + y, 1, 6);
        g2d.fillRect(115 + x, 98 + y, 1, 40);
        g2d.fillRect(104 + x, 101 + y, 1, 6);
        g2d.fillRect(99 + x, 102 + y, 1, 7);
        g2d.fillRect(103 + x, 106 + y, 1, 3);
        g2d.fillRect(98 + x, 108 + y, 1, 7);
        g2d.fillRect(102 + x, 109 + y, 1, 6);
        g2d.fillRect(116 + x, 109 + y, 1, 10);
        g2d.fillRect(101 + x, 111 + y, 1, 7);
        g2d.fillRect(118 + x, 111 + y, 1, 9);
        g2d.fillRect(97 + x, 114 + y, 1, 9);
        g2d.fillRect(100 + x, 114 + y, 1, 13);
        g2d.fillRect(96 + x, 115 + y, 1, 13);
        g2d.fillRect(114 + x, 117 + y, 1, 27);
        g2d.fillRect(95 + x, 119 + y, 1, 15);
        g2d.fillRect(120 + x, 119 + y, 1, 19);
        g2d.fillRect(99 + x, 120 + y, 1, 39);
        g2d.fillRect(94 + x, 124 + y, 1, 15);
        g2d.fillRect(113 + x, 125 + y, 1, 34);
        g2d.fillRect(98 + x, 127 + y, 1, 32);
        g2d.fillRect(93 + x, 128 + y, 1, 16);
        g2d.fillRect(121 + x, 129 + y, 1, 16);
        g2d.fillRect(97 + x, 130 + y, 1, 6);
        g2d.fillRect(92 + x, 133 + y, 1, 15);
        g2d.fillRect(91 + x, 138 + y, 1, 12);
        g2d.fillRect(100 + x, 138 + y, 1, 21);
        g2d.fillRect(122 + x, 138 + y, 1, 12);
        g2d.fillRect(112 + x, 139 + y, 1, 20);
        g2d.fillRect(90 + x, 141 + y, 1, 13);
        g2d.fillRect(111 + x, 145 + y, 1, 14);
        g2d.fillRect(123 + x, 145 + y, 1, 11);
        g2d.fillRect(89 + x, 146 + y, 1, 13);
        g2d.fillRect(88 + x, 149 + y, 1, 10);
        g2d.fillRect(114 + x, 149 + y, 1, 10);
        g2d.fillRect(124 + x, 150 + y, 1, 5);
        g2d.fillRect(97 + x, 153 + y, 1, 7);
        g2d.fillRect(110 + x, 153 + y, 1, 4);
        g2d.fillRect(115 + x, 153 + y, 1, 6);
        g2d.fillRect(87 + x, 154 + y, 1, 4);
        g2d.fillRect(96 + x, 154 + y, 1, 6);
        g2d.fillRect(101 + x, 154 + y, 1, 5);
        g2d.fillRect(116 + x, 154 + y, 1, 5);
        g2d.fillRect(122 + x, 154 + y, 1, 3);
        g2d.fillRect(90 + x, 155 + y, 1, 4);
        g2d.fillRect(94 + x, 155 + y, 1, 5);
        g2d.fillRect(95 + x, 155 + y, 1, 5);
        g2d.fillRect(117 + x, 155 + y, 1, 4);
        g2d.fillRect(118 + x, 155 + y, 1, 4);
        g2d.fillRect(119 + x, 155 + y, 1, 4);
        g2d.fillRect(120 + x, 155 + y, 1, 3);
        g2d.fillRect(121 + x, 155 + y, 1, 3);
        g2d.fillRect(91 + x, 156 + y, 1, 3);
        g2d.fillRect(92 + x, 156 + y, 1, 3);
        g2d.fillRect(93 + x, 156 + y, 1, 3);
        g2d.fillRect(109 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 82 + y, 1, 6);
        g2d.fillRect(101 + x, 82 + y, 3, 1);
        g2d.fillRect(103 + x, 83 + y, 10, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 2, 1);
        g2d.fillRect(112 + x, 84 + y, 6, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 3);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(119 + x, 86 + y, 1, 2);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 8, 1);
        g2d.fillRect(117 + x, 87 + y, 2, 1);
        g2d.fillRect(107 + x, 88 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 88 + y, 1, 8);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(116 + x, 88 + y, 1, 21);
        g2d.fillRect(117 + x, 88 + y, 1, 67);
        g2d.fillRect(118 + x, 88 + y, 1, 23);
        g2d.fillRect(103 + x, 89 + y, 1, 17);
        g2d.fillRect(104 + x, 89 + y, 1, 12);
        g2d.fillRect(107 + x, 89 + y, 9, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 18);
        g2d.fillRect(115 + x, 94 + y, 1, 4);
        g2d.fillRect(101 + x, 99 + y, 1, 12);
        g2d.fillRect(100 + x, 107 + y, 1, 7);
        g2d.fillRect(99 + x, 109 + y, 1, 11);
        g2d.fillRect(98 + x, 115 + y, 1, 12);
        g2d.fillRect(116 + x, 119 + y, 1, 35);
        g2d.fillRect(118 + x, 120 + y, 1, 35);
        g2d.fillRect(97 + x, 123 + y, 1, 7);
        g2d.fillRect(96 + x, 128 + y, 1, 26);
        g2d.fillRect(95 + x, 134 + y, 1, 21);
        g2d.fillRect(119 + x, 134 + y, 1, 21);
        g2d.fillRect(97 + x, 136 + y, 1, 17);
        g2d.fillRect(115 + x, 138 + y, 1, 15);
        g2d.fillRect(120 + x, 138 + y, 1, 17);
        g2d.fillRect(94 + x, 139 + y, 1, 16);
        g2d.fillRect(93 + x, 144 + y, 1, 12);
        g2d.fillRect(114 + x, 144 + y, 1, 5);
        g2d.fillRect(121 + x, 145 + y, 1, 10);
        g2d.fillRect(92 + x, 148 + y, 1, 8);
        g2d.fillRect(91 + x, 150 + y, 1, 6);
        g2d.fillRect(122 + x, 150 + y, 1, 4);
        g2d.fillRect(90 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 83 + y, 1, 4);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 5, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 84 + y, 1, 3);
        g2d.fillRect(105 + x, 84 + y, 4, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 2, 1);
        g2d.fillRect(112 + x, 87 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 6, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 85 + y, 1, 2);
        g2d.fillRect(114 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 4, 1);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
