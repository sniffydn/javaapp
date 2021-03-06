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
public class Pnt1 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt1()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt1(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt1(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt1(int layer, ColorArray colorSwitch)
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
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 2);
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 4, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 12, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 4);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 4, 1);
        g2d.fillRect(118 + x, 88 + y, 2, 1);
        g2d.fillRect(106 + x, 89 + y, 12, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 106 + y, 1, 2);
        g2d.fillRect(119 + x, 107 + y, 1, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 1);
        g2d.fillRect(101 + x, 110 + y, 1, 1);
        g2d.fillRect(97 + x, 111 + y, 1, 3);
        g2d.fillRect(102 + x, 112 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 2, 1);
        g2d.fillRect(102 + x, 115 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 128 + y, 1, 1);
        g2d.fillRect(100 + x, 136 + y, 1, 2);
        g2d.fillRect(89 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 2);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(95 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 84 + y, 1, 3);
        g2d.fillRect(120 + x, 84 + y, 1, 3);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 3);
        g2d.fillRect(115 + x, 86 + y, 1, 3);
        g2d.fillRect(99 + x, 87 + y, 1, 19);
        g2d.fillRect(100 + x, 87 + y, 1, 7);
        g2d.fillRect(102 + x, 87 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(106 + x, 88 + y, 6, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 2, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 17);
        g2d.fillRect(108 + x, 90 + y, 1, 4);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 3);
        g2d.fillRect(113 + x, 91 + y, 1, 17);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 10);
        g2d.fillRect(120 + x, 92 + y, 1, 5);
        g2d.fillRect(101 + x, 94 + y, 2, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(120 + x, 98 + y, 1, 3);
        g2d.fillRect(119 + x, 99 + y, 1, 1);
        g2d.fillRect(100 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 2, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 2);
        g2d.fillRect(100 + x, 103 + y, 1, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 3);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(119 + x, 105 + y, 2, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 16);
        g2d.fillRect(120 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 3);
        g2d.fillRect(104 + x, 107 + y, 1, 6);
        g2d.fillRect(105 + x, 107 + y, 1, 3);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 5);
        g2d.fillRect(99 + x, 110 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 2);
        g2d.fillRect(119 + x, 110 + y, 1, 1);
        g2d.fillRect(98 + x, 111 + y, 1, 5);
        g2d.fillRect(103 + x, 111 + y, 1, 8);
        g2d.fillRect(119 + x, 112 + y, 1, 3);
        g2d.fillRect(115 + x, 113 + y, 1, 2);
        g2d.fillRect(97 + x, 114 + y, 1, 6);
        g2d.fillRect(102 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 1);
        g2d.fillRect(120 + x, 114 + y, 1, 13);
        g2d.fillRect(102 + x, 118 + y, 1, 4);
        g2d.fillRect(96 + x, 119 + y, 1, 4);
        g2d.fillRect(119 + x, 119 + y, 1, 1);
        g2d.fillRect(95 + x, 121 + y, 1, 2);
        g2d.fillRect(113 + x, 121 + y, 1, 13);
        g2d.fillRect(101 + x, 122 + y, 1, 7);
        g2d.fillRect(94 + x, 123 + y, 1, 7);
        g2d.fillRect(114 + x, 123 + y, 1, 2);
        g2d.fillRect(93 + x, 124 + y, 1, 9);
        g2d.fillRect(121 + x, 124 + y, 1, 8);
        g2d.fillRect(120 + x, 128 + y, 1, 1);
        g2d.fillRect(92 + x, 130 + y, 1, 8);
        g2d.fillRect(112 + x, 130 + y, 1, 17);
        g2d.fillRect(100 + x, 131 + y, 1, 5);
        g2d.fillRect(122 + x, 131 + y, 1, 7);
        g2d.fillRect(120 + x, 132 + y, 1, 1);
        g2d.fillRect(91 + x, 134 + y, 1, 10);
        g2d.fillRect(93 + x, 136 + y, 1, 4);
        g2d.fillRect(100 + x, 138 + y, 1, 6);
        g2d.fillRect(121 + x, 140 + y, 1, 4);
        g2d.fillRect(90 + x, 142 + y, 1, 5);
        g2d.fillRect(101 + x, 142 + y, 1, 14);
        g2d.fillRect(123 + x, 142 + y, 1, 9);
        g2d.fillRect(111 + x, 143 + y, 1, 8);
        g2d.fillRect(89 + x, 145 + y, 1, 6);
        g2d.fillRect(110 + x, 148 + y, 1, 11);
        g2d.fillRect(124 + x, 148 + y, 1, 11);
        g2d.fillRect(88 + x, 149 + y, 1, 4);
        g2d.fillRect(100 + x, 150 + y, 1, 1);
        g2d.fillRect(87 + x, 152 + y, 1, 7);
        g2d.fillRect(111 + x, 153 + y, 1, 3);
        g2d.fillRect(125 + x, 153 + y, 1, 6);
        g2d.fillRect(109 + x, 154 + y, 1, 3);
        g2d.fillRect(86 + x, 155 + y, 1, 4);
        g2d.fillRect(102 + x, 155 + y, 1, 2);
        g2d.fillRect(113 + x, 156 + y, 1, 4);
        g2d.fillRect(88 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 157 + y, 1, 1);
        g2d.fillRect(103 + x, 157 + y, 1, 2);
        g2d.fillRect(108 + x, 157 + y, 1, 1);
        g2d.fillRect(111 + x, 157 + y, 1, 3);
        g2d.fillRect(112 + x, 157 + y, 1, 3);
        g2d.fillRect(123 + x, 157 + y, 1, 3);
        g2d.fillRect(126 + x, 157 + y, 1, 1);
        g2d.fillRect(89 + x, 158 + y, 1, 2);
        g2d.fillRect(97 + x, 158 + y, 2, 1);
        g2d.fillRect(102 + x, 158 + y, 1, 2);
        g2d.fillRect(109 + x, 158 + y, 1, 1);
        g2d.fillRect(88 + x, 159 + y, 1, 1);
        g2d.fillRect(90 + x, 159 + y, 5, 1);
        g2d.fillRect(98 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 159 + y, 2, 1);
        g2d.fillRect(114 + x, 159 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(106 + x, 96 + y, 1, 3);
        g2d.fillRect(100 + x, 97 + y, 2, 1);
        g2d.fillRect(119 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 2);
        g2d.fillRect(106 + x, 102 + y, 1, 1);
        g2d.fillRect(105 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(104 + x, 106 + y, 2, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(119 + x, 108 + y, 1, 1);
        g2d.fillRect(100 + x, 109 + y, 1, 3);
        g2d.fillRect(103 + x, 109 + y, 1, 1);
        g2d.fillRect(102 + x, 110 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 1, 3);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(100 + x, 113 + y, 1, 3);
        g2d.fillRect(120 + x, 113 + y, 1, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(101 + x, 115 + y, 1, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 6);
        g2d.fillRect(119 + x, 115 + y, 1, 4);
        g2d.fillRect(98 + x, 116 + y, 1, 4);
        g2d.fillRect(102 + x, 116 + y, 1, 2);
        g2d.fillRect(119 + x, 120 + y, 1, 5);
        g2d.fillRect(102 + x, 122 + y, 1, 2);
        g2d.fillRect(114 + x, 122 + y, 2, 1);
        g2d.fillRect(95 + x, 123 + y, 2, 1);
        g2d.fillRect(100 + x, 124 + y, 1, 7);
        g2d.fillRect(114 + x, 125 + y, 1, 18);
        g2d.fillRect(119 + x, 127 + y, 1, 1);
        g2d.fillRect(99 + x, 129 + y, 1, 1);
        g2d.fillRect(116 + x, 130 + y, 1, 1);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(121 + x, 132 + y, 1, 8);
        g2d.fillRect(93 + x, 133 + y, 1, 3);
        g2d.fillRect(113 + x, 134 + y, 1, 13);
        g2d.fillRect(120 + x, 136 + y, 1, 2);
        g2d.fillRect(92 + x, 138 + y, 1, 7);
        g2d.fillRect(122 + x, 138 + y, 1, 13);
        g2d.fillRect(99 + x, 142 + y, 1, 4);
        g2d.fillRect(91 + x, 144 + y, 1, 5);
        g2d.fillRect(100 + x, 144 + y, 1, 6);
        g2d.fillRect(114 + x, 144 + y, 1, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 4);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(90 + x, 147 + y, 1, 3);
        g2d.fillRect(99 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 147 + y, 1, 10);
        g2d.fillRect(114 + x, 147 + y, 1, 1);
        g2d.fillRect(113 + x, 148 + y, 1, 1);
        g2d.fillRect(99 + x, 149 + y, 1, 1);
        g2d.fillRect(114 + x, 150 + y, 1, 1);
        g2d.fillRect(89 + x, 151 + y, 1, 4);
        g2d.fillRect(90 + x, 151 + y, 1, 1);
        g2d.fillRect(92 + x, 151 + y, 1, 1);
        g2d.fillRect(99 + x, 151 + y, 2, 1);
        g2d.fillRect(111 + x, 151 + y, 1, 2);
        g2d.fillRect(113 + x, 151 + y, 1, 1);
        g2d.fillRect(123 + x, 151 + y, 1, 6);
        g2d.fillRect(100 + x, 152 + y, 1, 5);
        g2d.fillRect(122 + x, 152 + y, 1, 1);
        g2d.fillRect(88 + x, 153 + y, 1, 4);
        g2d.fillRect(113 + x, 153 + y, 1, 1);
        g2d.fillRect(121 + x, 153 + y, 1, 1);
        g2d.fillRect(122 + x, 154 + y, 1, 3);
        g2d.fillRect(113 + x, 155 + y, 1, 1);
        g2d.fillRect(120 + x, 155 + y, 1, 4);
        g2d.fillRect(121 + x, 155 + y, 1, 4);
        g2d.fillRect(89 + x, 156 + y, 1, 2);
        g2d.fillRect(101 + x, 156 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 1);
        g2d.fillRect(114 + x, 156 + y, 1, 3);
        g2d.fillRect(115 + x, 156 + y, 1, 3);
        g2d.fillRect(116 + x, 156 + y, 1, 2);
        g2d.fillRect(117 + x, 156 + y, 1, 3);
        g2d.fillRect(118 + x, 156 + y, 1, 3);
        g2d.fillRect(119 + x, 156 + y, 1, 3);
        g2d.fillRect(92 + x, 157 + y, 1, 2);
        g2d.fillRect(94 + x, 157 + y, 1, 2);
        g2d.fillRect(97 + x, 157 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 3);
        g2d.fillRect(102 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 157 + y, 1, 1);
        g2d.fillRect(88 + x, 158 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 2, 1);
        g2d.fillRect(95 + x, 158 + y, 2, 1);
        g2d.fillRect(100 + x, 158 + y, 1, 1);
        g2d.fillRect(96 + x, 159 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 84 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 84 + y, 1, 3);
        g2d.fillRect(105 + x, 84 + y, 1, 3);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 84 + y, 1, 3);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 1, 3);
        g2d.fillRect(109 + x, 85 + y, 1, 3);
        g2d.fillRect(110 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 85 + y, 1, 3);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 4);
        g2d.fillRect(117 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 89 + y, 4, 1);
        g2d.fillRect(118 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 3);
        g2d.fillRect(119 + x, 91 + y, 2, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 2);
        g2d.fillRect(118 + x, 94 + y, 1, 3);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 2, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 3);
        g2d.fillRect(116 + x, 96 + y, 2, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 4);
        g2d.fillRect(119 + x, 97 + y, 2, 1);
        g2d.fillRect(101 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 2, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(114 + x, 100 + y, 1, 2);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 2);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 2);
        g2d.fillRect(104 + x, 102 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 3);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 104 + y, 1, 3);
        g2d.fillRect(114 + x, 104 + y, 1, 2);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 3, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(120 + x, 107 + y, 1, 1);
        g2d.fillRect(100 + x, 108 + y, 2, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(101 + x, 109 + y, 2, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 2);
        g2d.fillRect(119 + x, 109 + y, 1, 1);
        g2d.fillRect(103 + x, 110 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(101 + x, 111 + y, 2, 1);
        g2d.fillRect(119 + x, 111 + y, 1, 1);
        g2d.fillRect(100 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 1);
        g2d.fillRect(118 + x, 112 + y, 1, 2);
        g2d.fillRect(102 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(99 + x, 114 + y, 1, 1);
        g2d.fillRect(101 + x, 114 + y, 1, 1);
        g2d.fillRect(117 + x, 116 + y, 1, 2);
        g2d.fillRect(100 + x, 117 + y, 1, 2);
        g2d.fillRect(116 + x, 117 + y, 1, 1);
        g2d.fillRect(118 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 118 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(118 + x, 119 + y, 1, 3);
        g2d.fillRect(101 + x, 120 + y, 1, 2);
        g2d.fillRect(116 + x, 120 + y, 1, 2);
        g2d.fillRect(99 + x, 121 + y, 1, 2);
        g2d.fillRect(117 + x, 121 + y, 1, 1);
        g2d.fillRect(97 + x, 122 + y, 1, 1);
        g2d.fillRect(100 + x, 123 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 3);
        g2d.fillRect(99 + x, 124 + y, 1, 1);
        g2d.fillRect(116 + x, 124 + y, 1, 1);
        g2d.fillRect(96 + x, 125 + y, 2, 1);
        g2d.fillRect(95 + x, 126 + y, 1, 1);
        g2d.fillRect(97 + x, 126 + y, 1, 1);
        g2d.fillRect(99 + x, 126 + y, 1, 1);
        g2d.fillRect(116 + x, 126 + y, 2, 1);
        g2d.fillRect(119 + x, 126 + y, 1, 1);
        g2d.fillRect(98 + x, 127 + y, 1, 1);
        g2d.fillRect(120 + x, 127 + y, 1, 1);
        g2d.fillRect(97 + x, 128 + y, 1, 2);
        g2d.fillRect(99 + x, 128 + y, 1, 1);
        g2d.fillRect(117 + x, 128 + y, 1, 2);
        g2d.fillRect(119 + x, 128 + y, 1, 1);
        g2d.fillRect(95 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 129 + y, 1, 3);
        g2d.fillRect(115 + x, 129 + y, 1, 1);
        g2d.fillRect(120 + x, 129 + y, 1, 1);
        g2d.fillRect(94 + x, 130 + y, 1, 1);
        g2d.fillRect(96 + x, 130 + y, 1, 2);
        g2d.fillRect(99 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 130 + y, 1, 2);
        g2d.fillRect(95 + x, 131 + y, 1, 2);
        g2d.fillRect(97 + x, 131 + y, 1, 1);
        g2d.fillRect(117 + x, 131 + y, 1, 1);
        g2d.fillRect(119 + x, 131 + y, 2, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 2);
        g2d.fillRect(94 + x, 133 + y, 1, 3);
        g2d.fillRect(98 + x, 133 + y, 1, 3);
        g2d.fillRect(99 + x, 133 + y, 1, 1);
        g2d.fillRect(115 + x, 133 + y, 1, 1);
        g2d.fillRect(119 + x, 133 + y, 1, 3);
        g2d.fillRect(96 + x, 134 + y, 1, 2);
        g2d.fillRect(117 + x, 134 + y, 1, 8);
        g2d.fillRect(95 + x, 136 + y, 1, 2);
        g2d.fillRect(94 + x, 138 + y, 1, 6);
        g2d.fillRect(98 + x, 138 + y, 1, 4);
        g2d.fillRect(99 + x, 138 + y, 1, 2);
        g2d.fillRect(115 + x, 138 + y, 1, 2);
        g2d.fillRect(118 + x, 138 + y, 1, 4);
        g2d.fillRect(119 + x, 138 + y, 1, 4);
        g2d.fillRect(120 + x, 138 + y, 1, 2);
        g2d.fillRect(93 + x, 140 + y, 1, 2);
        g2d.fillRect(96 + x, 140 + y, 1, 3);
        g2d.fillRect(116 + x, 140 + y, 1, 3);
        g2d.fillRect(95 + x, 142 + y, 1, 1);
        g2d.fillRect(97 + x, 142 + y, 1, 1);
        g2d.fillRect(115 + x, 143 + y, 1, 2);
        g2d.fillRect(119 + x, 143 + y, 1, 3);
        g2d.fillRect(120 + x, 143 + y, 1, 1);
        g2d.fillRect(93 + x, 144 + y, 1, 4);
        g2d.fillRect(97 + x, 144 + y, 1, 2);
        g2d.fillRect(98 + x, 144 + y, 1, 1);
        g2d.fillRect(117 + x, 144 + y, 1, 2);
        g2d.fillRect(92 + x, 145 + y, 1, 1);
        g2d.fillRect(95 + x, 145 + y, 1, 2);
        g2d.fillRect(116 + x, 145 + y, 1, 2);
        g2d.fillRect(118 + x, 145 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 146 + y, 1, 1);
        g2d.fillRect(115 + x, 147 + y, 1, 2);
        g2d.fillRect(119 + x, 147 + y, 1, 3);
        g2d.fillRect(120 + x, 147 + y, 1, 1);
        g2d.fillRect(92 + x, 148 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 2);
        g2d.fillRect(97 + x, 148 + y, 2, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 3);
        g2d.fillRect(121 + x, 148 + y, 1, 1);
        g2d.fillRect(91 + x, 149 + y, 1, 1);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(118 + x, 149 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(90 + x, 150 + y, 1, 1);
        g2d.fillRect(92 + x, 150 + y, 1, 1);
        g2d.fillRect(115 + x, 150 + y, 1, 1);
        g2d.fillRect(93 + x, 151 + y, 1, 1);
        g2d.fillRect(97 + x, 151 + y, 2, 1);
        g2d.fillRect(114 + x, 151 + y, 1, 1);
        g2d.fillRect(116 + x, 151 + y, 1, 2);
        g2d.fillRect(120 + x, 151 + y, 1, 2);
        g2d.fillRect(121 + x, 151 + y, 1, 1);
        g2d.fillRect(90 + x, 152 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 2);
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 152 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 2);
        g2d.fillRect(99 + x, 152 + y, 1, 1);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(118 + x, 152 + y, 1, 1);
        g2d.fillRect(91 + x, 153 + y, 1, 2);
        g2d.fillRect(93 + x, 153 + y, 1, 1);
        g2d.fillRect(95 + x, 153 + y, 1, 2);
        g2d.fillRect(97 + x, 153 + y, 1, 1);
        g2d.fillRect(114 + x, 154 + y, 1, 2);
        g2d.fillRect(118 + x, 154 + y, 1, 2);
        g2d.fillRect(119 + x, 154 + y, 2, 1);
        g2d.fillRect(90 + x, 155 + y, 1, 2);
        g2d.fillRect(94 + x, 155 + y, 1, 2);
        g2d.fillRect(98 + x, 155 + y, 1, 2);
        g2d.fillRect(99 + x, 155 + y, 1, 1);
        g2d.fillRect(116 + x, 155 + y, 1, 1);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 86 + y, 1, 3);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 4);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 5);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 6);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 5);
        g2d.fillRect(117 + x, 100 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 3);
        g2d.fillRect(103 + x, 101 + y, 1, 4);
        g2d.fillRect(118 + x, 101 + y, 1, 3);
        g2d.fillRect(100 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 106 + y, 1, 3);
        g2d.fillRect(117 + x, 106 + y, 1, 3);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 3);
        g2d.fillRect(116 + x, 115 + y, 1, 2);
        g2d.fillRect(118 + x, 115 + y, 1, 2);
        g2d.fillRect(99 + x, 116 + y, 1, 2);
        g2d.fillRect(101 + x, 116 + y, 1, 2);
        g2d.fillRect(117 + x, 118 + y, 1, 3);
        g2d.fillRect(100 + x, 119 + y, 1, 4);
        g2d.fillRect(97 + x, 120 + y, 1, 2);
        g2d.fillRect(98 + x, 121 + y, 1, 6);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 4);
        g2d.fillRect(115 + x, 123 + y, 1, 4);
        g2d.fillRect(95 + x, 124 + y, 1, 2);
        g2d.fillRect(99 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 125 + y, 1, 1);
        g2d.fillRect(96 + x, 126 + y, 1, 4);
        g2d.fillRect(118 + x, 126 + y, 1, 2);
        g2d.fillRect(99 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 3);
        g2d.fillRect(98 + x, 128 + y, 1, 1);
        g2d.fillRect(119 + x, 129 + y, 1, 2);
        g2d.fillRect(95 + x, 130 + y, 1, 1);
        g2d.fillRect(97 + x, 130 + y, 1, 1);
        g2d.fillRect(115 + x, 130 + y, 1, 3);
        g2d.fillRect(117 + x, 130 + y, 1, 1);
        g2d.fillRect(94 + x, 131 + y, 1, 2);
        g2d.fillRect(99 + x, 131 + y, 1, 2);
        g2d.fillRect(97 + x, 132 + y, 1, 10);
        g2d.fillRect(118 + x, 132 + y, 1, 6);
        g2d.fillRect(95 + x, 133 + y, 1, 3);
        g2d.fillRect(120 + x, 133 + y, 1, 3);
        g2d.fillRect(99 + x, 134 + y, 1, 4);
        g2d.fillRect(116 + x, 134 + y, 1, 6);
        g2d.fillRect(94 + x, 136 + y, 1, 2);
        g2d.fillRect(119 + x, 136 + y, 1, 2);
        g2d.fillRect(95 + x, 138 + y, 1, 4);
        g2d.fillRect(99 + x, 140 + y, 1, 2);
        g2d.fillRect(115 + x, 140 + y, 1, 3);
        g2d.fillRect(120 + x, 140 + y, 1, 3);
        g2d.fillRect(93 + x, 142 + y, 1, 2);
        g2d.fillRect(98 + x, 142 + y, 1, 2);
        g2d.fillRect(118 + x, 142 + y, 1, 3);
        g2d.fillRect(96 + x, 143 + y, 1, 3);
        g2d.fillRect(114 + x, 143 + y, 1, 1);
        g2d.fillRect(116 + x, 143 + y, 1, 2);
        g2d.fillRect(94 + x, 144 + y, 1, 2);
        g2d.fillRect(120 + x, 144 + y, 1, 3);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(114 + x, 145 + y, 1, 2);
        g2d.fillRect(115 + x, 145 + y, 1, 2);
        g2d.fillRect(92 + x, 146 + y, 1, 2);
        g2d.fillRect(97 + x, 146 + y, 1, 2);
        g2d.fillRect(99 + x, 146 + y, 1, 1);
        g2d.fillRect(118 + x, 146 + y, 1, 3);
        g2d.fillRect(95 + x, 147 + y, 1, 3);
        g2d.fillRect(98 + x, 147 + y, 1, 1);
        g2d.fillRect(113 + x, 147 + y, 1, 1);
        g2d.fillRect(116 + x, 147 + y, 1, 4);
        g2d.fillRect(93 + x, 148 + y, 1, 3);
        g2d.fillRect(99 + x, 148 + y, 1, 1);
        g2d.fillRect(114 + x, 148 + y, 1, 2);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(92 + x, 149 + y, 1, 1);
        g2d.fillRect(97 + x, 149 + y, 2, 1);
        g2d.fillRect(113 + x, 149 + y, 1, 2);
        g2d.fillRect(115 + x, 149 + y, 1, 1);
        g2d.fillRect(121 + x, 149 + y, 1, 2);
        g2d.fillRect(91 + x, 150 + y, 1, 3);
        g2d.fillRect(94 + x, 150 + y, 1, 2);
        g2d.fillRect(96 + x, 150 + y, 1, 2);
        g2d.fillRect(98 + x, 150 + y, 2, 1);
        g2d.fillRect(119 + x, 150 + y, 1, 4);
        g2d.fillRect(115 + x, 151 + y, 1, 1);
        g2d.fillRect(117 + x, 151 + y, 1, 5);
        g2d.fillRect(122 + x, 151 + y, 1, 1);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(95 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(113 + x, 152 + y, 2, 1);
        g2d.fillRect(121 + x, 152 + y, 1, 1);
        g2d.fillRect(90 + x, 153 + y, 1, 2);
        g2d.fillRect(94 + x, 153 + y, 1, 2);
        g2d.fillRect(99 + x, 153 + y, 1, 2);
        g2d.fillRect(114 + x, 153 + y, 1, 1);
        g2d.fillRect(120 + x, 153 + y, 1, 1);
        g2d.fillRect(122 + x, 153 + y, 1, 1);
        g2d.fillRect(93 + x, 154 + y, 1, 5);
        g2d.fillRect(97 + x, 154 + y, 1, 3);
        g2d.fillRect(113 + x, 154 + y, 1, 1);
        g2d.fillRect(115 + x, 154 + y, 1, 2);
        g2d.fillRect(121 + x, 154 + y, 1, 1);
        g2d.fillRect(91 + x, 155 + y, 1, 3);
        g2d.fillRect(95 + x, 155 + y, 1, 3);
        g2d.fillRect(119 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(96 + x, 157 + y, 1, 1);
        g2d.fillRect(98 + x, 157 + y, 1, 1);
        g2d.fillRect(100 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 4);
        g2d.fillRect(116 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(104 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 1, 2);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(101 + x, 107 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 2);
        g2d.fillRect(118 + x, 111 + y, 1, 1);
        g2d.fillRect(117 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 116 + y, 1, 1);
        g2d.fillRect(116 + x, 118 + y, 1, 2);
        g2d.fillRect(118 + x, 118 + y, 1, 1);
        g2d.fillRect(99 + x, 119 + y, 1, 2);
        g2d.fillRect(101 + x, 119 + y, 1, 1);
        g2d.fillRect(98 + x, 120 + y, 1, 1);
        g2d.fillRect(116 + x, 122 + y, 1, 2);
        g2d.fillRect(118 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 123 + y, 1, 2);
        g2d.fillRect(99 + x, 123 + y, 1, 1);
        g2d.fillRect(96 + x, 124 + y, 1, 1);
        g2d.fillRect(95 + x, 127 + y, 1, 2);
        g2d.fillRect(97 + x, 127 + y, 1, 1);
        g2d.fillRect(115 + x, 127 + y, 1, 2);
        g2d.fillRect(117 + x, 127 + y, 1, 1);
        g2d.fillRect(118 + x, 129 + y, 1, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(96 + x, 132 + y, 1, 2);
        g2d.fillRect(98 + x, 132 + y, 1, 1);
        g2d.fillRect(117 + x, 132 + y, 1, 2);
        g2d.fillRect(119 + x, 132 + y, 1, 1);
        g2d.fillRect(115 + x, 134 + y, 1, 4);
        g2d.fillRect(96 + x, 136 + y, 1, 4);
        g2d.fillRect(98 + x, 136 + y, 1, 2);
        g2d.fillRect(117 + x, 142 + y, 1, 2);
        g2d.fillRect(119 + x, 142 + y, 1, 1);
        g2d.fillRect(95 + x, 143 + y, 1, 2);
        g2d.fillRect(97 + x, 143 + y, 1, 1);
        g2d.fillRect(117 + x, 146 + y, 1, 2);
        g2d.fillRect(119 + x, 146 + y, 1, 1);
        g2d.fillRect(94 + x, 147 + y, 1, 2);
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(95 + x, 150 + y, 1, 2);
        g2d.fillRect(97 + x, 150 + y, 1, 1);
        g2d.fillRect(118 + x, 150 + y, 1, 2);
        g2d.fillRect(120 + x, 150 + y, 1, 1);
        g2d.fillRect(116 + x, 153 + y, 1, 2);
        g2d.fillRect(118 + x, 153 + y, 1, 1);
        g2d.fillRect(92 + x, 154 + y, 1, 2);
        g2d.fillRect(96 + x, 154 + y, 1, 2);
        g2d.fillRect(98 + x, 154 + y, 1, 1);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
