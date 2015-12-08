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
public class Pnt0 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt0()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt0(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt0(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt0(int layer, ColorArray colorSwitch)
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
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 86 + y, 1, 4);
        g2d.fillRect(121 + x, 86 + y, 1, 19);
        g2d.fillRect(99 + x, 87 + y, 1, 19);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 4, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 3);
        g2d.fillRect(113 + x, 90 + y, 1, 17);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 4);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 8);
        g2d.fillRect(106 + x, 101 + y, 1, 5);
        g2d.fillRect(98 + x, 106 + y, 1, 5);
        g2d.fillRect(105 + x, 106 + y, 1, 4);
        g2d.fillRect(120 + x, 106 + y, 1, 17);
        g2d.fillRect(114 + x, 107 + y, 1, 13);
        g2d.fillRect(104 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 111 + y, 1, 7);
        g2d.fillRect(103 + x, 112 + y, 1, 6);
        g2d.fillRect(102 + x, 118 + y, 1, 5);
        g2d.fillRect(95 + x, 120 + y, 1, 3);
        g2d.fillRect(113 + x, 120 + y, 1, 8);
        g2d.fillRect(101 + x, 122 + y, 1, 7);
        g2d.fillRect(94 + x, 123 + y, 1, 4);
        g2d.fillRect(121 + x, 124 + y, 1, 7);
        g2d.fillRect(93 + x, 127 + y, 1, 3);
        g2d.fillRect(100 + x, 128 + y, 1, 12);
        g2d.fillRect(92 + x, 130 + y, 1, 6);
        g2d.fillRect(112 + x, 130 + y, 1, 11);
        g2d.fillRect(122 + x, 131 + y, 1, 9);
        g2d.fillRect(91 + x, 136 + y, 1, 4);
        g2d.fillRect(90 + x, 140 + y, 1, 3);
        g2d.fillRect(101 + x, 140 + y, 1, 13);
        g2d.fillRect(123 + x, 140 + y, 1, 6);
        g2d.fillRect(111 + x, 141 + y, 1, 5);
        g2d.fillRect(89 + x, 143 + y, 1, 4);
        g2d.fillRect(110 + x, 146 + y, 1, 6);
        g2d.fillRect(124 + x, 146 + y, 1, 4);
        g2d.fillRect(88 + x, 147 + y, 1, 2);
        g2d.fillRect(87 + x, 150 + y, 1, 3);
        g2d.fillRect(125 + x, 150 + y, 1, 7);
        g2d.fillRect(109 + x, 152 + y, 1, 3);
        g2d.fillRect(86 + x, 153 + y, 1, 4);
        g2d.fillRect(102 + x, 153 + y, 1, 5);
        g2d.fillRect(124 + x, 154 + y, 1, 3);
        g2d.fillRect(103 + x, 155 + y, 1, 2);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(123 + x, 155 + y, 1, 2);
        g2d.fillRect(126 + x, 155 + y, 1, 1);
        g2d.fillRect(87 + x, 156 + y, 1, 1);
        g2d.fillRect(109 + x, 156 + y, 2, 1);
        g2d.fillRect(120 + x, 156 + y, 1, 2);
        g2d.fillRect(121 + x, 156 + y, 1, 2);
        g2d.fillRect(122 + x, 156 + y, 1, 2);
        g2d.fillRect(88 + x, 157 + y, 7, 1);
        g2d.fillRect(97 + x, 157 + y, 1, 2);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(99 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 2, 1);
        g2d.fillRect(111 + x, 157 + y, 9, 1);
        g2d.fillRect(91 + x, 158 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 19);
        g2d.fillRect(103 + x, 88 + y, 2, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 4, 1);
        g2d.fillRect(112 + x, 89 + y, 3, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 17);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 7);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 10);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 16);
        g2d.fillRect(101 + x, 93 + y, 1, 10);
        g2d.fillRect(119 + x, 93 + y, 1, 3);
        g2d.fillRect(105 + x, 97 + y, 1, 9);
        g2d.fillRect(119 + x, 97 + y, 1, 31);
        g2d.fillRect(115 + x, 103 + y, 1, 23);
        g2d.fillRect(104 + x, 105 + y, 1, 5);
        g2d.fillRect(99 + x, 106 + y, 1, 6);
        g2d.fillRect(103 + x, 109 + y, 1, 3);
        g2d.fillRect(98 + x, 111 + y, 1, 7);
        g2d.fillRect(99 + x, 113 + y, 1, 1);
        g2d.fillRect(102 + x, 114 + y, 1, 4);
        g2d.fillRect(116 + x, 114 + y, 1, 9);
        g2d.fillRect(101 + x, 115 + y, 1, 7);
        g2d.fillRect(118 + x, 115 + y, 1, 9);
        g2d.fillRect(96 + x, 118 + y, 1, 9);
        g2d.fillRect(97 + x, 118 + y, 1, 5);
        g2d.fillRect(100 + x, 118 + y, 1, 10);
        g2d.fillRect(114 + x, 120 + y, 1, 16);
        g2d.fillRect(95 + x, 123 + y, 1, 7);
        g2d.fillRect(120 + x, 123 + y, 1, 15);
        g2d.fillRect(99 + x, 124 + y, 1, 1);
        g2d.fillRect(94 + x, 127 + y, 1, 6);
        g2d.fillRect(113 + x, 128 + y, 1, 18);
        g2d.fillRect(93 + x, 130 + y, 1, 7);
        g2d.fillRect(99 + x, 130 + y, 1, 12);
        g2d.fillRect(121 + x, 131 + y, 1, 13);
        g2d.fillRect(94 + x, 135 + y, 1, 1);
        g2d.fillRect(92 + x, 136 + y, 1, 7);
        g2d.fillRect(98 + x, 136 + y, 1, 2);
        g2d.fillRect(119 + x, 138 + y, 1, 1);
        g2d.fillRect(91 + x, 140 + y, 1, 8);
        g2d.fillRect(100 + x, 140 + y, 1, 15);
        g2d.fillRect(122 + x, 140 + y, 1, 10);
        g2d.fillRect(112 + x, 141 + y, 1, 9);
        g2d.fillRect(90 + x, 143 + y, 1, 7);
        g2d.fillRect(93 + x, 143 + y, 1, 1);
        g2d.fillRect(99 + x, 144 + y, 1, 1);
        g2d.fillRect(120 + x, 144 + y, 1, 1);
        g2d.fillRect(111 + x, 146 + y, 1, 11);
        g2d.fillRect(123 + x, 146 + y, 1, 9);
        g2d.fillRect(89 + x, 147 + y, 1, 5);
        g2d.fillRect(88 + x, 149 + y, 1, 4);
        g2d.fillRect(99 + x, 149 + y, 1, 3);
        g2d.fillRect(113 + x, 149 + y, 1, 1);
        g2d.fillRect(91 + x, 150 + y, 1, 1);
        g2d.fillRect(114 + x, 150 + y, 1, 1);
        g2d.fillRect(121 + x, 150 + y, 1, 1);
        g2d.fillRect(124 + x, 150 + y, 1, 4);
        g2d.fillRect(98 + x, 151 + y, 1, 1);
        g2d.fillRect(112 + x, 151 + y, 1, 6);
        g2d.fillRect(113 + x, 151 + y, 1, 3);
        g2d.fillRect(90 + x, 152 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 4);
        g2d.fillRect(87 + x, 153 + y, 1, 3);
        g2d.fillRect(101 + x, 153 + y, 1, 4);
        g2d.fillRect(121 + x, 153 + y, 1, 1);
        g2d.fillRect(89 + x, 154 + y, 1, 1);
        g2d.fillRect(98 + x, 154 + y, 1, 1);
        g2d.fillRect(114 + x, 154 + y, 1, 1);
        g2d.fillRect(117 + x, 154 + y, 1, 1);
        g2d.fillRect(122 + x, 154 + y, 1, 2);
        g2d.fillRect(88 + x, 155 + y, 1, 2);
        g2d.fillRect(93 + x, 155 + y, 1, 2);
        g2d.fillRect(99 + x, 155 + y, 1, 2);
        g2d.fillRect(109 + x, 155 + y, 1, 1);
        g2d.fillRect(115 + x, 155 + y, 1, 2);
        g2d.fillRect(118 + x, 155 + y, 1, 2);
        g2d.fillRect(119 + x, 155 + y, 1, 2);
        g2d.fillRect(120 + x, 155 + y, 2, 1);
        g2d.fillRect(89 + x, 156 + y, 4, 1);
        g2d.fillRect(94 + x, 156 + y, 5, 1);
        g2d.fillRect(100 + x, 156 + y, 1, 1);
        g2d.fillRect(113 + x, 156 + y, 2, 1);
        g2d.fillRect(116 + x, 156 + y, 2, 1);
        g2d.fillRect(95 + x, 157 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(110 + x, 84 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(107 + x, 88 + y, 4, 1);
        g2d.fillRect(112 + x, 88 + y, 5, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 3);
        g2d.fillRect(115 + x, 89 + y, 3, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 3);
        g2d.fillRect(103 + x, 93 + y, 1, 3);
        g2d.fillRect(104 + x, 93 + y, 1, 3);
        g2d.fillRect(105 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 93 + y, 1, 21);
        g2d.fillRect(117 + x, 93 + y, 1, 3);
        g2d.fillRect(118 + x, 93 + y, 1, 3);
        g2d.fillRect(102 + x, 97 + y, 1, 8);
        g2d.fillRect(103 + x, 97 + y, 1, 4);
        g2d.fillRect(104 + x, 97 + y, 1, 8);
        g2d.fillRect(115 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 6);
        g2d.fillRect(118 + x, 97 + y, 1, 18);
        g2d.fillRect(115 + x, 101 + y, 1, 2);
        g2d.fillRect(101 + x, 103 + y, 1, 6);
        g2d.fillRect(103 + x, 105 + y, 1, 4);
        g2d.fillRect(100 + x, 107 + y, 1, 7);
        g2d.fillRect(102 + x, 110 + y, 1, 1);
        g2d.fillRect(99 + x, 112 + y, 1, 1);
        g2d.fillRect(102 + x, 112 + y, 1, 2);
        g2d.fillRect(117 + x, 113 + y, 1, 4);
        g2d.fillRect(99 + x, 114 + y, 1, 4);
        g2d.fillRect(101 + x, 114 + y, 1, 1);
        g2d.fillRect(100 + x, 116 + y, 1, 2);
        g2d.fillRect(98 + x, 118 + y, 1, 5);
        g2d.fillRect(117 + x, 118 + y, 1, 6);
        g2d.fillRect(97 + x, 123 + y, 1, 4);
        g2d.fillRect(116 + x, 123 + y, 1, 5);
        g2d.fillRect(118 + x, 124 + y, 1, 4);
        g2d.fillRect(99 + x, 125 + y, 1, 5);
        g2d.fillRect(115 + x, 126 + y, 1, 14);
        g2d.fillRect(96 + x, 127 + y, 1, 4);
        g2d.fillRect(98 + x, 128 + y, 1, 8);
        g2d.fillRect(119 + x, 128 + y, 1, 10);
        g2d.fillRect(95 + x, 130 + y, 1, 7);
        g2d.fillRect(94 + x, 133 + y, 1, 2);
        g2d.fillRect(97 + x, 133 + y, 1, 2);
        g2d.fillRect(94 + x, 136 + y, 1, 4);
        g2d.fillRect(114 + x, 136 + y, 1, 12);
        g2d.fillRect(93 + x, 137 + y, 1, 2);
        g2d.fillRect(120 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 139 + y, 1, 1);
        g2d.fillRect(93 + x, 140 + y, 1, 3);
        g2d.fillRect(98 + x, 140 + y, 1, 11);
        g2d.fillRect(120 + x, 141 + y, 1, 3);
        g2d.fillRect(99 + x, 142 + y, 1, 2);
        g2d.fillRect(116 + x, 142 + y, 1, 1);
        g2d.fillRect(92 + x, 143 + y, 1, 5);
        g2d.fillRect(93 + x, 144 + y, 1, 2);
        g2d.fillRect(121 + x, 144 + y, 1, 6);
        g2d.fillRect(94 + x, 145 + y, 1, 2);
        g2d.fillRect(99 + x, 145 + y, 1, 4);
        g2d.fillRect(115 + x, 145 + y, 1, 1);
        g2d.fillRect(120 + x, 145 + y, 1, 2);
        g2d.fillRect(113 + x, 146 + y, 1, 3);
        g2d.fillRect(91 + x, 148 + y, 1, 2);
        g2d.fillRect(92 + x, 149 + y, 1, 3);
        g2d.fillRect(97 + x, 149 + y, 1, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 1);
        g2d.fillRect(90 + x, 150 + y, 1, 2);
        g2d.fillRect(112 + x, 150 + y, 2, 1);
        g2d.fillRect(122 + x, 150 + y, 1, 4);
        g2d.fillRect(91 + x, 151 + y, 1, 3);
        g2d.fillRect(97 + x, 151 + y, 1, 5);
        g2d.fillRect(114 + x, 151 + y, 1, 3);
        g2d.fillRect(121 + x, 151 + y, 1, 1);
        g2d.fillRect(89 + x, 152 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 2);
        g2d.fillRect(99 + x, 152 + y, 1, 3);
        g2d.fillRect(88 + x, 153 + y, 1, 2);
        g2d.fillRect(90 + x, 153 + y, 1, 1);
        g2d.fillRect(115 + x, 153 + y, 1, 2);
        g2d.fillRect(120 + x, 153 + y, 1, 2);
        g2d.fillRect(113 + x, 154 + y, 1, 2);
        g2d.fillRect(116 + x, 154 + y, 1, 2);
        g2d.fillRect(118 + x, 154 + y, 2, 1);
        g2d.fillRect(121 + x, 154 + y, 1, 1);
        g2d.fillRect(89 + x, 155 + y, 4, 1);
        g2d.fillRect(94 + x, 155 + y, 3, 1);
        g2d.fillRect(98 + x, 155 + y, 1, 1);
        g2d.fillRect(100 + x, 155 + y, 1, 1);
        g2d.fillRect(114 + x, 155 + y, 1, 1);
        g2d.fillRect(117 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 2);
        g2d.fillRect(103 + x, 101 + y, 1, 4);
        g2d.fillRect(117 + x, 103 + y, 1, 4);
        g2d.fillRect(102 + x, 105 + y, 1, 3);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(101 + x, 109 + y, 1, 2);
        g2d.fillRect(102 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 3);
        g2d.fillRect(102 + x, 111 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 1, 2);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 118 + y, 1, 4);
        g2d.fillRect(98 + x, 123 + y, 1, 2);
        g2d.fillRect(117 + x, 124 + y, 1, 3);
        g2d.fillRect(97 + x, 127 + y, 1, 3);
        g2d.fillRect(98 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 128 + y, 1, 14);
        g2d.fillRect(117 + x, 128 + y, 1, 8);
        g2d.fillRect(118 + x, 128 + y, 1, 13);
        g2d.fillRect(96 + x, 131 + y, 1, 4);
        g2d.fillRect(97 + x, 131 + y, 1, 2);
        g2d.fillRect(97 + x, 135 + y, 1, 4);
        g2d.fillRect(95 + x, 137 + y, 1, 9);
        g2d.fillRect(98 + x, 138 + y, 1, 2);
        g2d.fillRect(93 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 10);
        g2d.fillRect(94 + x, 140 + y, 1, 5);
        g2d.fillRect(97 + x, 140 + y, 1, 9);
        g2d.fillRect(115 + x, 140 + y, 1, 5);
        g2d.fillRect(120 + x, 140 + y, 1, 1);
        g2d.fillRect(116 + x, 143 + y, 1, 3);
        g2d.fillRect(118 + x, 144 + y, 1, 4);
        g2d.fillRect(93 + x, 146 + y, 1, 5);
        g2d.fillRect(115 + x, 146 + y, 1, 3);
        g2d.fillRect(94 + x, 147 + y, 1, 3);
        g2d.fillRect(120 + x, 147 + y, 1, 1);
        g2d.fillRect(92 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 7);
        g2d.fillRect(114 + x, 148 + y, 1, 2);
        g2d.fillRect(120 + x, 149 + y, 1, 2);
        g2d.fillRect(97 + x, 150 + y, 1, 1);
        g2d.fillRect(115 + x, 150 + y, 1, 3);
        g2d.fillRect(116 + x, 151 + y, 1, 3);
        g2d.fillRect(119 + x, 151 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 3);
        g2d.fillRect(95 + x, 152 + y, 1, 3);
        g2d.fillRect(118 + x, 152 + y, 1, 2);
        g2d.fillRect(120 + x, 152 + y, 2, 1);
        g2d.fillRect(117 + x, 153 + y, 1, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(90 + x, 154 + y, 2, 1);
        g2d.fillRect(94 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 3, 1);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(102 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(101 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 122 + y, 1, 2);
        g2d.fillRect(98 + x, 125 + y, 1, 2);
        g2d.fillRect(117 + x, 127 + y, 1, 1);
        g2d.fillRect(97 + x, 130 + y, 1, 1);
        g2d.fillRect(96 + x, 135 + y, 1, 13);
        g2d.fillRect(117 + x, 136 + y, 1, 17);
        g2d.fillRect(118 + x, 141 + y, 1, 3);
        g2d.fillRect(95 + x, 146 + y, 1, 6);
        g2d.fillRect(116 + x, 146 + y, 1, 5);
        g2d.fillRect(118 + x, 148 + y, 1, 4);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(119 + x, 149 + y, 1, 2);
        g2d.fillRect(94 + x, 150 + y, 1, 4);
        g2d.fillRect(93 + x, 151 + y, 1, 4);
        g2d.fillRect(120 + x, 151 + y, 1, 1);
        g2d.fillRect(119 + x, 152 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
