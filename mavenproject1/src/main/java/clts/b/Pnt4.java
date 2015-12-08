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
public class Pnt4 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt4()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt4(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt4(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt4(int layer, ColorArray colorSwitch)
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
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(110 + x, 144 + y, 2, 1);
        g2d.fillRect(112 + x, 145 + y, 1, 1);
        g2d.fillRect(122 + x, 151 + y, 1, 1);
        g2d.fillRect(123 + x, 152 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(98 + x, 91 + y, 1, 2);
        g2d.fillRect(97 + x, 92 + y, 1, 2);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 119 + y, 1, 1);
        g2d.fillRect(93 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(113 + x, 122 + y, 2, 1);
        g2d.fillRect(99 + x, 123 + y, 2, 1);
        g2d.fillRect(113 + x, 124 + y, 2, 1);
        g2d.fillRect(99 + x, 125 + y, 2, 1);
        g2d.fillRect(121 + x, 128 + y, 2, 1);
        g2d.fillRect(91 + x, 129 + y, 2, 1);
        g2d.fillRect(122 + x, 136 + y, 2, 1);
        g2d.fillRect(90 + x, 137 + y, 2, 1);
        g2d.fillRect(121 + x, 137 + y, 1, 1);
        g2d.fillRect(92 + x, 138 + y, 1, 1);
        g2d.fillRect(112 + x, 141 + y, 2, 1);
        g2d.fillRect(100 + x, 142 + y, 2, 1);
        g2d.fillRect(110 + x, 142 + y, 2, 1);
        g2d.fillRect(100 + x, 144 + y, 2, 1);
        g2d.fillRect(99 + x, 145 + y, 1, 1);
        g2d.fillRect(89 + x, 151 + y, 1, 1);
        g2d.fillRect(86 + x, 152 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(116 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 2, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(99 + x, 90 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(113 + x, 85 + y, 3, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 119 + y, 1, 1);
        g2d.fillRect(94 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 121 + y, 1, 1);
        g2d.fillRect(116 + x, 121 + y, 1, 1);
        g2d.fillRect(98 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 1, 1);
        g2d.fillRect(98 + x, 126 + y, 1, 1);
        g2d.fillRect(120 + x, 127 + y, 1, 1);
        g2d.fillRect(93 + x, 128 + y, 1, 1);
        g2d.fillRect(120 + x, 137 + y, 1, 1);
        g2d.fillRect(93 + x, 138 + y, 1, 1);
        g2d.fillRect(114 + x, 140 + y, 1, 1);
        g2d.fillRect(98 + x, 141 + y, 2, 1);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(113 + x, 145 + y, 1, 1);
        g2d.fillRect(97 + x, 146 + y, 1, 1);
        g2d.fillRect(114 + x, 146 + y, 1, 1);
        g2d.fillRect(92 + x, 149 + y, 1, 1);
        g2d.fillRect(91 + x, 150 + y, 1, 1);
        g2d.fillRect(120 + x, 150 + y, 1, 1);
        g2d.fillRect(90 + x, 151 + y, 1, 1);
        g2d.fillRect(121 + x, 151 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 151 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 85 + y, 2, 1);
        g2d.fillRect(112 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 14, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 85 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 5);
        g2d.fillRect(99 + x, 87 + y, 1, 3);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 3, 1);
        g2d.fillRect(110 + x, 90 + y, 2, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(121 + x, 91 + y, 1, 8);
        g2d.fillRect(99 + x, 92 + y, 1, 10);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 10);
        g2d.fillRect(107 + x, 94 + y, 1, 3);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(105 + x, 99 + y, 1, 6);
        g2d.fillRect(120 + x, 99 + y, 1, 20);
        g2d.fillRect(98 + x, 102 + y, 1, 4);
        g2d.fillRect(114 + x, 103 + y, 1, 11);
        g2d.fillRect(104 + x, 105 + y, 1, 3);
        g2d.fillRect(97 + x, 106 + y, 1, 6);
        g2d.fillRect(103 + x, 108 + y, 1, 4);
        g2d.fillRect(96 + x, 112 + y, 1, 2);
        g2d.fillRect(102 + x, 112 + y, 1, 6);
        g2d.fillRect(95 + x, 114 + y, 1, 4);
        g2d.fillRect(113 + x, 114 + y, 1, 8);
        g2d.fillRect(94 + x, 118 + y, 1, 2);
        g2d.fillRect(101 + x, 119 + y, 1, 5);
        g2d.fillRect(121 + x, 119 + y, 1, 7);
        g2d.fillRect(93 + x, 121 + y, 1, 4);
        g2d.fillRect(113 + x, 123 + y, 1, 1);
        g2d.fillRect(100 + x, 124 + y, 1, 1);
        g2d.fillRect(92 + x, 125 + y, 1, 4);
        g2d.fillRect(112 + x, 125 + y, 1, 11);
        g2d.fillRect(100 + x, 126 + y, 1, 9);
        g2d.fillRect(122 + x, 126 + y, 1, 2);
        g2d.fillRect(122 + x, 129 + y, 1, 6);
        g2d.fillRect(91 + x, 130 + y, 1, 5);
        g2d.fillRect(90 + x, 135 + y, 1, 2);
        g2d.fillRect(101 + x, 135 + y, 1, 7);
        g2d.fillRect(123 + x, 135 + y, 1, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 5);
        g2d.fillRect(123 + x, 137 + y, 1, 4);
        g2d.fillRect(89 + x, 138 + y, 1, 4);
        g2d.fillRect(110 + x, 141 + y, 1, 1);
        g2d.fillRect(124 + x, 141 + y, 1, 5);
        g2d.fillRect(88 + x, 142 + y, 1, 3);
        g2d.fillRect(101 + x, 143 + y, 1, 1);
        g2d.fillRect(110 + x, 143 + y, 1, 1);
        g2d.fillRect(87 + x, 145 + y, 1, 4);
        g2d.fillRect(101 + x, 145 + y, 1, 4);
        g2d.fillRect(110 + x, 145 + y, 1, 2);
        g2d.fillRect(109 + x, 147 + y, 1, 5);
        g2d.fillRect(125 + x, 147 + y, 1, 5);
        g2d.fillRect(86 + x, 149 + y, 1, 3);
        g2d.fillRect(102 + x, 149 + y, 1, 4);
        g2d.fillRect(87 + x, 151 + y, 1, 1);
        g2d.fillRect(110 + x, 151 + y, 1, 1);
        g2d.fillRect(117 + x, 151 + y, 1, 2);
        g2d.fillRect(123 + x, 151 + y, 2, 1);
        g2d.fillRect(89 + x, 152 + y, 2, 1);
        g2d.fillRect(100 + x, 152 + y, 2, 1);
        g2d.fillRect(103 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(111 + x, 152 + y, 6, 1);
        g2d.fillRect(118 + x, 152 + y, 5, 1);
        g2d.fillRect(86 + x, 153 + y, 2, 1);
        g2d.fillRect(91 + x, 153 + y, 9, 1);
        g2d.fillRect(109 + x, 153 + y, 2, 1);
        g2d.fillRect(123 + x, 153 + y, 2, 1);
        g2d.fillRect(88 + x, 154 + y, 3, 1);
        g2d.fillRect(100 + x, 154 + y, 3, 1);
        g2d.fillRect(111 + x, 154 + y, 12, 1);
        g2d.fillRect(91 + x, 155 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 138 + y, 1, 1);
        g2d.fillRect(118 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 84 + y, 3, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 4);
        g2d.fillRect(101 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 3);
        g2d.fillRect(100 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 3);
        g2d.fillRect(112 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 88 + y, 1, 3);
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 2, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 3);
        g2d.fillRect(111 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 5);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 3);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(107 + x, 90 + y, 1, 4);
        g2d.fillRect(117 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(100 + x, 91 + y, 2, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 12);
        g2d.fillRect(119 + x, 91 + y, 1, 11);
        g2d.fillRect(101 + x, 92 + y, 1, 10);
        g2d.fillRect(106 + x, 92 + y, 1, 5);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 28);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 5);
        g2d.fillRect(100 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 1);
        g2d.fillRect(104 + x, 97 + y, 1, 8);
        g2d.fillRect(120 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 7);
        g2d.fillRect(103 + x, 99 + y, 1, 9);
        g2d.fillRect(118 + x, 99 + y, 1, 20);
        g2d.fillRect(99 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 11);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 1, 7);
        g2d.fillRect(102 + x, 105 + y, 1, 7);
        g2d.fillRect(119 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 11);
        g2d.fillRect(98 + x, 109 + y, 1, 1);
        g2d.fillRect(119 + x, 109 + y, 1, 1);
        g2d.fillRect(98 + x, 111 + y, 1, 3);
        g2d.fillRect(119 + x, 111 + y, 1, 1);
        g2d.fillRect(100 + x, 112 + y, 1, 11);
        g2d.fillRect(97 + x, 113 + y, 1, 5);
        g2d.fillRect(119 + x, 113 + y, 1, 1);
        g2d.fillRect(114 + x, 114 + y, 1, 8);
        g2d.fillRect(96 + x, 115 + y, 1, 5);
        g2d.fillRect(119 + x, 115 + y, 1, 3);
        g2d.fillRect(95 + x, 119 + y, 1, 2);
        g2d.fillRect(99 + x, 119 + y, 1, 4);
        g2d.fillRect(119 + x, 120 + y, 1, 6);
        g2d.fillRect(94 + x, 121 + y, 1, 1);
        g2d.fillRect(120 + x, 121 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 1, 3);
        g2d.fillRect(115 + x, 122 + y, 1, 3);
        g2d.fillRect(94 + x, 123 + y, 1, 1);
        g2d.fillRect(114 + x, 123 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 1);
        g2d.fillRect(98 + x, 124 + y, 1, 2);
        g2d.fillRect(99 + x, 124 + y, 1, 1);
        g2d.fillRect(93 + x, 125 + y, 2, 1);
        g2d.fillRect(113 + x, 125 + y, 1, 16);
        g2d.fillRect(114 + x, 125 + y, 1, 11);
        g2d.fillRect(120 + x, 125 + y, 1, 2);
        g2d.fillRect(94 + x, 126 + y, 1, 2);
        g2d.fillRect(99 + x, 126 + y, 1, 15);
        g2d.fillRect(93 + x, 127 + y, 1, 1);
        g2d.fillRect(97 + x, 127 + y, 2, 1);
        g2d.fillRect(121 + x, 127 + y, 1, 1);
        g2d.fillRect(98 + x, 128 + y, 1, 7);
        g2d.fillRect(120 + x, 128 + y, 1, 7);
        g2d.fillRect(93 + x, 129 + y, 1, 6);
        g2d.fillRect(121 + x, 129 + y, 1, 1);
        g2d.fillRect(92 + x, 131 + y, 1, 2);
        g2d.fillRect(121 + x, 131 + y, 1, 2);
        g2d.fillRect(91 + x, 135 + y, 2, 1);
        g2d.fillRect(100 + x, 135 + y, 1, 7);
        g2d.fillRect(121 + x, 135 + y, 1, 2);
        g2d.fillRect(122 + x, 135 + y, 1, 1);
        g2d.fillRect(92 + x, 136 + y, 1, 2);
        g2d.fillRect(112 + x, 136 + y, 1, 5);
        g2d.fillRect(122 + x, 137 + y, 1, 1);
        g2d.fillRect(91 + x, 138 + y, 1, 4);
        g2d.fillRect(121 + x, 138 + y, 1, 3);
        g2d.fillRect(90 + x, 139 + y, 1, 1);
        g2d.fillRect(122 + x, 139 + y, 1, 1);
        g2d.fillRect(90 + x, 141 + y, 1, 4);
        g2d.fillRect(111 + x, 141 + y, 1, 1);
        g2d.fillRect(122 + x, 141 + y, 1, 5);
        g2d.fillRect(123 + x, 141 + y, 1, 1);
        g2d.fillRect(99 + x, 142 + y, 1, 3);
        g2d.fillRect(112 + x, 142 + y, 1, 3);
        g2d.fillRect(89 + x, 143 + y, 1, 1);
        g2d.fillRect(100 + x, 143 + y, 1, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 1);
        g2d.fillRect(123 + x, 143 + y, 1, 1);
        g2d.fillRect(88 + x, 145 + y, 2, 1);
        g2d.fillRect(100 + x, 145 + y, 1, 7);
        g2d.fillRect(111 + x, 145 + y, 1, 7);
        g2d.fillRect(123 + x, 145 + y, 1, 6);
        g2d.fillRect(89 + x, 146 + y, 1, 5);
        g2d.fillRect(99 + x, 146 + y, 1, 6);
        g2d.fillRect(112 + x, 146 + y, 1, 5);
        g2d.fillRect(88 + x, 147 + y, 1, 5);
        g2d.fillRect(110 + x, 147 + y, 1, 2);
        g2d.fillRect(113 + x, 147 + y, 1, 5);
        g2d.fillRect(122 + x, 147 + y, 1, 4);
        g2d.fillRect(124 + x, 147 + y, 1, 2);
        g2d.fillRect(90 + x, 149 + y, 1, 2);
        g2d.fillRect(98 + x, 149 + y, 1, 4);
        g2d.fillRect(101 + x, 149 + y, 1, 2);
        g2d.fillRect(114 + x, 149 + y, 1, 2);
        g2d.fillRect(115 + x, 149 + y, 1, 3);
        g2d.fillRect(116 + x, 149 + y, 1, 2);
        g2d.fillRect(117 + x, 149 + y, 1, 2);
        g2d.fillRect(121 + x, 149 + y, 1, 2);
        g2d.fillRect(118 + x, 150 + y, 1, 1);
        g2d.fillRect(91 + x, 151 + y, 7, 1);
        g2d.fillRect(119 + x, 151 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 1);
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 152 + y, 1, 1);
        g2d.fillRect(109 + x, 152 + y, 1, 1);
        g2d.fillRect(88 + x, 153 + y, 1, 1);
        g2d.fillRect(90 + x, 153 + y, 1, 1);
        g2d.fillRect(100 + x, 153 + y, 1, 1);
        g2d.fillRect(102 + x, 153 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(113 + x, 153 + y, 1, 1);
        g2d.fillRect(115 + x, 153 + y, 1, 1);
        g2d.fillRect(117 + x, 153 + y, 1, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(121 + x, 153 + y, 1, 1);
        g2d.fillRect(92 + x, 154 + y, 1, 1);
        g2d.fillRect(94 + x, 154 + y, 1, 1);
        g2d.fillRect(96 + x, 154 + y, 1, 1);
        g2d.fillRect(98 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(120 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(98 + x, 106 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(119 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 1);
        g2d.fillRect(119 + x, 110 + y, 1, 1);
        g2d.fillRect(97 + x, 112 + y, 1, 1);
        g2d.fillRect(119 + x, 112 + y, 1, 1);
        g2d.fillRect(96 + x, 114 + y, 1, 1);
        g2d.fillRect(119 + x, 114 + y, 1, 1);
        g2d.fillRect(95 + x, 118 + y, 1, 1);
        g2d.fillRect(119 + x, 118 + y, 1, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 1);
        g2d.fillRect(120 + x, 120 + y, 1, 1);
        g2d.fillRect(96 + x, 121 + y, 1, 1);
        g2d.fillRect(94 + x, 122 + y, 1, 1);
        g2d.fillRect(120 + x, 122 + y, 1, 1);
        g2d.fillRect(94 + x, 124 + y, 1, 1);
        g2d.fillRect(120 + x, 124 + y, 1, 1);
        g2d.fillRect(116 + x, 125 + y, 1, 1);
        g2d.fillRect(93 + x, 126 + y, 1, 1);
        g2d.fillRect(97 + x, 126 + y, 1, 1);
        g2d.fillRect(121 + x, 126 + y, 1, 1);
        g2d.fillRect(119 + x, 127 + y, 1, 1);
        g2d.fillRect(94 + x, 128 + y, 1, 1);
        g2d.fillRect(92 + x, 130 + y, 1, 1);
        g2d.fillRect(121 + x, 130 + y, 1, 1);
        g2d.fillRect(92 + x, 133 + y, 1, 2);
        g2d.fillRect(121 + x, 133 + y, 1, 2);
        g2d.fillRect(91 + x, 136 + y, 1, 1);
        g2d.fillRect(90 + x, 138 + y, 1, 1);
        g2d.fillRect(118 + x, 138 + y, 2, 1);
        g2d.fillRect(122 + x, 138 + y, 1, 1);
        g2d.fillRect(94 + x, 139 + y, 2, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 1);
        g2d.fillRect(90 + x, 140 + y, 1, 1);
        g2d.fillRect(97 + x, 140 + y, 1, 1);
        g2d.fillRect(115 + x, 140 + y, 1, 1);
        g2d.fillRect(122 + x, 140 + y, 1, 1);
        g2d.fillRect(89 + x, 142 + y, 1, 1);
        g2d.fillRect(123 + x, 142 + y, 1, 1);
        g2d.fillRect(89 + x, 144 + y, 1, 1);
        g2d.fillRect(123 + x, 144 + y, 1, 1);
        g2d.fillRect(88 + x, 146 + y, 1, 1);
        g2d.fillRect(115 + x, 146 + y, 1, 1);
        g2d.fillRect(124 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(116 + x, 147 + y, 1, 1);
        g2d.fillRect(87 + x, 149 + y, 1, 2);
        g2d.fillRect(93 + x, 149 + y, 1, 1);
        g2d.fillRect(110 + x, 149 + y, 1, 2);
        g2d.fillRect(124 + x, 149 + y, 1, 2);
        g2d.fillRect(119 + x, 150 + y, 1, 1);
        g2d.fillRect(101 + x, 151 + y, 1, 1);
        g2d.fillRect(112 + x, 151 + y, 1, 1);
        g2d.fillRect(114 + x, 151 + y, 1, 1);
        g2d.fillRect(116 + x, 151 + y, 1, 1);
        g2d.fillRect(120 + x, 151 + y, 1, 1);
        g2d.fillRect(91 + x, 152 + y, 1, 1);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(95 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(99 + x, 152 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 1);
        g2d.fillRect(89 + x, 153 + y, 1, 1);
        g2d.fillRect(101 + x, 153 + y, 1, 1);
        g2d.fillRect(112 + x, 153 + y, 1, 1);
        g2d.fillRect(114 + x, 153 + y, 1, 1);
        g2d.fillRect(116 + x, 153 + y, 1, 1);
        g2d.fillRect(118 + x, 153 + y, 1, 1);
        g2d.fillRect(120 + x, 153 + y, 1, 1);
        g2d.fillRect(122 + x, 153 + y, 1, 1);
        g2d.fillRect(91 + x, 154 + y, 1, 1);
        g2d.fillRect(93 + x, 154 + y, 1, 1);
        g2d.fillRect(95 + x, 154 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 1);
        g2d.fillRect(99 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 92 + y, 1, 10);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 10);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(101 + x, 102 + y, 1, 3);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(99 + x, 112 + y, 1, 3);
        g2d.fillRect(98 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 7);
        g2d.fillRect(97 + x, 118 + y, 1, 1);
        g2d.fillRect(99 + x, 118 + y, 1, 1);
        g2d.fillRect(98 + x, 119 + y, 1, 3);
        g2d.fillRect(118 + x, 119 + y, 1, 1);
        g2d.fillRect(96 + x, 120 + y, 1, 1);
        g2d.fillRect(118 + x, 121 + y, 1, 1);
        g2d.fillRect(96 + x, 122 + y, 1, 2);
        g2d.fillRect(116 + x, 122 + y, 1, 3);
        g2d.fillRect(98 + x, 123 + y, 1, 1);
        g2d.fillRect(97 + x, 124 + y, 1, 2);
        g2d.fillRect(95 + x, 125 + y, 1, 2);
        g2d.fillRect(115 + x, 126 + y, 1, 11);
        g2d.fillRect(119 + x, 126 + y, 1, 1);
        g2d.fillRect(95 + x, 128 + y, 1, 5);
        g2d.fillRect(97 + x, 128 + y, 1, 8);
        g2d.fillRect(119 + x, 128 + y, 1, 10);
        g2d.fillRect(94 + x, 129 + y, 1, 7);
        g2d.fillRect(93 + x, 135 + y, 1, 3);
        g2d.fillRect(98 + x, 135 + y, 1, 6);
        g2d.fillRect(120 + x, 135 + y, 1, 2);
        g2d.fillRect(114 + x, 136 + y, 1, 4);
        g2d.fillRect(92 + x, 139 + y, 1, 5);
        g2d.fillRect(120 + x, 139 + y, 1, 5);
        g2d.fillRect(114 + x, 141 + y, 1, 1);
        g2d.fillRect(121 + x, 141 + y, 1, 5);
        g2d.fillRect(91 + x, 142 + y, 1, 4);
        g2d.fillRect(98 + x, 142 + y, 1, 3);
        g2d.fillRect(113 + x, 142 + y, 1, 3);
        g2d.fillRect(90 + x, 145 + y, 1, 4);
        g2d.fillRect(98 + x, 146 + y, 1, 3);
        g2d.fillRect(113 + x, 146 + y, 1, 1);
        g2d.fillRect(122 + x, 146 + y, 1, 1);
        g2d.fillRect(91 + x, 147 + y, 1, 3);
        g2d.fillRect(97 + x, 147 + y, 1, 4);
        g2d.fillRect(114 + x, 147 + y, 1, 2);
        g2d.fillRect(115 + x, 147 + y, 1, 2);
        g2d.fillRect(118 + x, 147 + y, 1, 2);
        g2d.fillRect(119 + x, 147 + y, 1, 3);
        g2d.fillRect(120 + x, 147 + y, 1, 3);
        g2d.fillRect(121 + x, 147 + y, 1, 2);
        g2d.fillRect(116 + x, 148 + y, 1, 1);
        g2d.fillRect(94 + x, 149 + y, 1, 2);
        g2d.fillRect(95 + x, 149 + y, 1, 2);
        g2d.fillRect(96 + x, 149 + y, 1, 2);
        g2d.fillRect(92 + x, 150 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(97 + x, 122 + y, 1, 1);
        g2d.fillRect(117 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 1);
        g2d.fillRect(95 + x, 127 + y, 2, 1);
        g2d.fillRect(116 + x, 140 + y, 1, 1);
        g2d.fillRect(94 + x, 148 + y, 2, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 149 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(117 + x, 94 + y, 1, 5);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 2);
        g2d.fillRect(101 + x, 107 + y, 1, 1);
        g2d.fillRect(100 + x, 108 + y, 1, 2);
        g2d.fillRect(100 + x, 111 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 4);
        g2d.fillRect(98 + x, 115 + y, 1, 4);
        g2d.fillRect(99 + x, 115 + y, 1, 3);
        g2d.fillRect(97 + x, 119 + y, 1, 1);
        g2d.fillRect(118 + x, 122 + y, 1, 4);
        g2d.fillRect(116 + x, 126 + y, 1, 12);
        g2d.fillRect(118 + x, 127 + y, 1, 11);
        g2d.fillRect(95 + x, 133 + y, 1, 6);
        g2d.fillRect(96 + x, 133 + y, 1, 2);
        g2d.fillRect(94 + x, 136 + y, 1, 3);
        g2d.fillRect(97 + x, 136 + y, 1, 4);
        g2d.fillRect(115 + x, 137 + y, 1, 3);
        g2d.fillRect(93 + x, 139 + y, 1, 6);
        g2d.fillRect(119 + x, 139 + y, 1, 5);
        g2d.fillRect(94 + x, 140 + y, 1, 2);
        g2d.fillRect(97 + x, 141 + y, 1, 5);
        g2d.fillRect(115 + x, 141 + y, 1, 2);
        g2d.fillRect(114 + x, 142 + y, 1, 4);
        g2d.fillRect(92 + x, 144 + y, 1, 2);
        g2d.fillRect(96 + x, 144 + y, 1, 3);
        g2d.fillRect(120 + x, 144 + y, 1, 1);
        g2d.fillRect(91 + x, 146 + y, 1, 1);
        g2d.fillRect(116 + x, 146 + y, 6, 1);
        g2d.fillRect(92 + x, 147 + y, 1, 2);
        g2d.fillRect(93 + x, 147 + y, 1, 2);
        g2d.fillRect(117 + x, 147 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(109 + x, 86 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 3);
        g2d.fillRect(118 + x, 96 + y, 1, 3);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 5);
        g2d.fillRect(102 + x, 103 + y, 1, 2);
        g2d.fillRect(101 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 106 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(100 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 3);
        g2d.fillRect(117 + x, 118 + y, 1, 2);
        g2d.fillRect(97 + x, 120 + y, 1, 2);
        g2d.fillRect(118 + x, 120 + y, 1, 1);
        g2d.fillRect(117 + x, 121 + y, 1, 4);
        g2d.fillRect(97 + x, 123 + y, 1, 1);
        g2d.fillRect(96 + x, 124 + y, 1, 3);
        g2d.fillRect(117 + x, 126 + y, 1, 13);
        g2d.fillRect(96 + x, 128 + y, 1, 5);
        g2d.fillRect(96 + x, 135 + y, 1, 9);
        g2d.fillRect(116 + x, 138 + y, 1, 2);
        g2d.fillRect(95 + x, 140 + y, 1, 8);
        g2d.fillRect(117 + x, 140 + y, 1, 6);
        g2d.fillRect(118 + x, 140 + y, 1, 6);
        g2d.fillRect(116 + x, 141 + y, 1, 5);
        g2d.fillRect(94 + x, 142 + y, 1, 6);
        g2d.fillRect(115 + x, 143 + y, 1, 3);
        g2d.fillRect(119 + x, 144 + y, 1, 2);
        g2d.fillRect(93 + x, 145 + y, 1, 2);
        g2d.fillRect(120 + x, 145 + y, 1, 1);
        g2d.fillRect(92 + x, 146 + y, 1, 1);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
