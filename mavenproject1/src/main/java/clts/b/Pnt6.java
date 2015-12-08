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
public class Pnt6 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt6()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt6(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt6(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt6(int layer, ColorArray colorSwitch)
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
        paintP(x,y,g2d);
    }

    public void paintP(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 131 + y, 1, 3);
        g2d.fillRect(113 + x, 133 + y, 1, 2);
        g2d.fillRect(100 + x, 134 + y, 1, 1);
        g2d.fillRect(99 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 1, 1);
        g2d.fillRect(114 + x, 136 + y, 1, 2);
        g2d.fillRect(115 + x, 138 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 82 + y, 1, 9);
        g2d.fillRect(101 + x, 82 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 17);
        g2d.fillRect(103 + x, 83 + y, 4, 1);
        g2d.fillRect(115 + x, 83 + y, 4, 1);
        g2d.fillRect(107 + x, 84 + y, 8, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 4);
        g2d.fillRect(110 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 4);
        g2d.fillRect(99 + x, 91 + y, 1, 9);
        g2d.fillRect(109 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 8);
        g2d.fillRect(107 + x, 96 + y, 1, 4);
        g2d.fillRect(120 + x, 97 + y, 1, 23);
        g2d.fillRect(98 + x, 100 + y, 1, 7);
        g2d.fillRect(106 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 5);
        g2d.fillRect(114 + x, 102 + y, 1, 15);
        g2d.fillRect(97 + x, 107 + y, 1, 5);
        g2d.fillRect(104 + x, 107 + y, 1, 5);
        g2d.fillRect(96 + x, 112 + y, 1, 3);
        g2d.fillRect(103 + x, 112 + y, 1, 4);
        g2d.fillRect(95 + x, 115 + y, 1, 4);
        g2d.fillRect(102 + x, 116 + y, 1, 5);
        g2d.fillRect(113 + x, 118 + y, 1, 10);
        g2d.fillRect(94 + x, 119 + y, 1, 5);
        g2d.fillRect(121 + x, 120 + y, 1, 9);
        g2d.fillRect(101 + x, 121 + y, 1, 7);
        g2d.fillRect(93 + x, 124 + y, 1, 5);
        g2d.fillRect(100 + x, 128 + y, 1, 6);
        g2d.fillRect(112 + x, 128 + y, 1, 3);
        g2d.fillRect(92 + x, 129 + y, 1, 6);
        g2d.fillRect(122 + x, 129 + y, 1, 10);
        g2d.fillRect(113 + x, 130 + y, 1, 3);
        g2d.fillRect(99 + x, 134 + y, 1, 1);
        g2d.fillRect(112 + x, 134 + y, 1, 1);
        g2d.fillRect(91 + x, 135 + y, 1, 4);
        g2d.fillRect(100 + x, 135 + y, 1, 3);
        g2d.fillRect(113 + x, 135 + y, 1, 3);
        g2d.fillRect(114 + x, 135 + y, 1, 1);
        g2d.fillRect(99 + x, 136 + y, 1, 2);
        g2d.fillRect(112 + x, 136 + y, 1, 8);
        g2d.fillRect(98 + x, 138 + y, 1, 2);
        g2d.fillRect(101 + x, 138 + y, 1, 21);
        g2d.fillRect(114 + x, 138 + y, 1, 1);
        g2d.fillRect(90 + x, 139 + y, 1, 5);
        g2d.fillRect(115 + x, 139 + y, 1, 1);
        g2d.fillRect(123 + x, 139 + y, 1, 11);
        g2d.fillRect(89 + x, 144 + y, 1, 5);
        g2d.fillRect(111 + x, 144 + y, 1, 9);
        g2d.fillRect(88 + x, 149 + y, 1, 5);
        g2d.fillRect(124 + x, 149 + y, 1, 10);
        g2d.fillRect(110 + x, 153 + y, 1, 6);
        g2d.fillRect(87 + x, 154 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 83 + y, 1, 5);
        g2d.fillRect(102 + x, 83 + y, 1, 3);
        g2d.fillRect(119 + x, 83 + y, 1, 3);
        g2d.fillRect(120 + x, 83 + y, 1, 5);
        g2d.fillRect(103 + x, 84 + y, 4, 1);
        g2d.fillRect(115 + x, 84 + y, 4, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 3, 1);
        g2d.fillRect(112 + x, 89 + y, 2, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 8);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 6);
        g2d.fillRect(107 + x, 91 + y, 1, 5);
        g2d.fillRect(108 + x, 91 + y, 1, 3);
        g2d.fillRect(113 + x, 91 + y, 1, 3);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 96 + y, 1, 6);
        g2d.fillRect(106 + x, 97 + y, 1, 3);
        g2d.fillRect(99 + x, 100 + y, 1, 4);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 105 + y, 1, 7);
        g2d.fillRect(98 + x, 107 + y, 1, 3);
        g2d.fillRect(103 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 112 + y, 1, 4);
        g2d.fillRect(119 + x, 112 + y, 1, 9);
        g2d.fillRect(118 + x, 114 + y, 1, 1);
        g2d.fillRect(100 + x, 115 + y, 2, 1);
        g2d.fillRect(101 + x, 116 + y, 1, 5);
        g2d.fillRect(114 + x, 117 + y, 1, 7);
        g2d.fillRect(120 + x, 120 + y, 1, 13);
        g2d.fillRect(94 + x, 124 + y, 1, 4);
        g2d.fillRect(100 + x, 124 + y, 1, 4);
        g2d.fillRect(113 + x, 128 + y, 1, 2);
        g2d.fillRect(93 + x, 129 + y, 1, 5);
        g2d.fillRect(121 + x, 129 + y, 1, 11);
        g2d.fillRect(99 + x, 130 + y, 1, 4);
        g2d.fillRect(119 + x, 130 + y, 1, 8);
        g2d.fillRect(114 + x, 131 + y, 1, 4);
        g2d.fillRect(98 + x, 134 + y, 1, 4);
        g2d.fillRect(92 + x, 135 + y, 1, 4);
        g2d.fillRect(115 + x, 135 + y, 1, 3);
        g2d.fillRect(99 + x, 138 + y, 2, 1);
        g2d.fillRect(113 + x, 138 + y, 1, 7);
        g2d.fillRect(91 + x, 139 + y, 1, 4);
        g2d.fillRect(100 + x, 139 + y, 1, 18);
        g2d.fillRect(114 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 1);
        g2d.fillRect(122 + x, 139 + y, 1, 16);
        g2d.fillRect(98 + x, 140 + y, 1, 3);
        g2d.fillRect(115 + x, 140 + y, 1, 4);
        g2d.fillRect(116 + x, 140 + y, 1, 7);
        g2d.fillRect(97 + x, 141 + y, 1, 4);
        g2d.fillRect(99 + x, 143 + y, 1, 6);
        g2d.fillRect(90 + x, 144 + y, 1, 5);
        g2d.fillRect(112 + x, 144 + y, 1, 10);
        g2d.fillRect(96 + x, 145 + y, 1, 3);
        g2d.fillRect(117 + x, 147 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 2);
        g2d.fillRect(98 + x, 148 + y, 1, 4);
        g2d.fillRect(89 + x, 149 + y, 1, 5);
        g2d.fillRect(94 + x, 150 + y, 1, 2);
        g2d.fillRect(123 + x, 150 + y, 1, 10);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 7);
        g2d.fillRect(88 + x, 154 + y, 1, 5);
        g2d.fillRect(92 + x, 154 + y, 1, 1);
        g2d.fillRect(90 + x, 155 + y, 1, 3);
        g2d.fillRect(91 + x, 155 + y, 1, 2);
        g2d.fillRect(89 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 3);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 1, 4);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 85 + y, 6, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 3, 1);
        g2d.fillRect(113 + x, 87 + y, 3, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 3, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 22);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 4, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 8);
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 4);
        g2d.fillRect(105 + x, 94 + y, 1, 7);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 2, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 8);
        g2d.fillRect(104 + x, 97 + y, 1, 8);
        g2d.fillRect(115 + x, 97 + y, 1, 8);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 8);
        g2d.fillRect(99 + x, 104 + y, 1, 3);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 5);
        g2d.fillRect(98 + x, 110 + y, 1, 13);
        g2d.fillRect(116 + x, 110 + y, 1, 11);
        g2d.fillRect(101 + x, 111 + y, 1, 1);
        g2d.fillRect(97 + x, 112 + y, 1, 14);
        g2d.fillRect(115 + x, 112 + y, 1, 3);
        g2d.fillRect(99 + x, 114 + y, 1, 5);
        g2d.fillRect(100 + x, 114 + y, 2, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 3);
        g2d.fillRect(96 + x, 115 + y, 1, 1);
        g2d.fillRect(118 + x, 115 + y, 1, 9);
        g2d.fillRect(100 + x, 116 + y, 1, 8);
        g2d.fillRect(95 + x, 119 + y, 1, 4);
        g2d.fillRect(119 + x, 121 + y, 1, 9);
        g2d.fillRect(96 + x, 124 + y, 1, 1);
        g2d.fillRect(114 + x, 124 + y, 1, 7);
        g2d.fillRect(99 + x, 126 + y, 1, 4);
        g2d.fillRect(94 + x, 128 + y, 1, 1);
        g2d.fillRect(118 + x, 128 + y, 1, 7);
        g2d.fillRect(95 + x, 129 + y, 1, 1);
        g2d.fillRect(115 + x, 130 + y, 1, 5);
        g2d.fillRect(98 + x, 133 + y, 1, 1);
        g2d.fillRect(120 + x, 133 + y, 1, 6);
        g2d.fillRect(93 + x, 134 + y, 1, 2);
        g2d.fillRect(95 + x, 136 + y, 1, 2);
        g2d.fillRect(116 + x, 136 + y, 1, 4);
        g2d.fillRect(97 + x, 138 + y, 1, 3);
        g2d.fillRect(119 + x, 138 + y, 1, 1);
        g2d.fillRect(92 + x, 139 + y, 1, 1);
        g2d.fillRect(94 + x, 139 + y, 1, 1);
        g2d.fillRect(99 + x, 139 + y, 1, 4);
        g2d.fillRect(93 + x, 140 + y, 1, 3);
        g2d.fillRect(96 + x, 140 + y, 1, 5);
        g2d.fillRect(114 + x, 140 + y, 1, 9);
        g2d.fillRect(119 + x, 140 + y, 1, 3);
        g2d.fillRect(121 + x, 140 + y, 1, 4);
        g2d.fillRect(92 + x, 141 + y, 1, 2);
        g2d.fillRect(117 + x, 141 + y, 1, 6);
        g2d.fillRect(91 + x, 143 + y, 1, 2);
        g2d.fillRect(98 + x, 143 + y, 1, 4);
        g2d.fillRect(120 + x, 143 + y, 1, 7);
        g2d.fillRect(92 + x, 144 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 1, 4);
        g2d.fillRect(115 + x, 144 + y, 1, 1);
        g2d.fillRect(97 + x, 145 + y, 1, 2);
        g2d.fillRect(113 + x, 145 + y, 1, 17);
        g2d.fillRect(91 + x, 147 + y, 1, 1);
        g2d.fillRect(94 + x, 147 + y, 1, 3);
        g2d.fillRect(116 + x, 147 + y, 1, 6);
        g2d.fillRect(93 + x, 148 + y, 1, 4);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 10);
        g2d.fillRect(118 + x, 148 + y, 1, 11);
        g2d.fillRect(90 + x, 149 + y, 1, 1);
        g2d.fillRect(99 + x, 149 + y, 1, 11);
        g2d.fillRect(121 + x, 149 + y, 1, 13);
        g2d.fillRect(92 + x, 150 + y, 1, 4);
        g2d.fillRect(95 + x, 150 + y, 1, 2);
        g2d.fillRect(97 + x, 150 + y, 1, 2);
        g2d.fillRect(91 + x, 152 + y, 1, 3);
        g2d.fillRect(94 + x, 152 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(93 + x, 153 + y, 1, 2);
        g2d.fillRect(97 + x, 153 + y, 1, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 6);
        g2d.fillRect(89 + x, 154 + y, 1, 3);
        g2d.fillRect(90 + x, 154 + y, 1, 1);
        g2d.fillRect(96 + x, 154 + y, 1, 3);
        g2d.fillRect(98 + x, 154 + y, 1, 5);
        g2d.fillRect(112 + x, 154 + y, 1, 6);
        g2d.fillRect(92 + x, 155 + y, 1, 2);
        g2d.fillRect(95 + x, 155 + y, 1, 2);
        g2d.fillRect(122 + x, 155 + y, 1, 5);
        g2d.fillRect(91 + x, 157 + y, 1, 1);
        g2d.fillRect(94 + x, 157 + y, 1, 1);
        g2d.fillRect(97 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(89 + x, 158 + y, 2, 1);
        g2d.fillRect(93 + x, 158 + y, 1, 1);
        g2d.fillRect(96 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 158 + y, 1, 4);
        g2d.fillRect(120 + x, 158 + y, 1, 4);
        g2d.fillRect(88 + x, 159 + y, 1, 1);
        g2d.fillRect(91 + x, 159 + y, 2, 1);
        g2d.fillRect(93 + x, 160 + y, 1, 2);
        g2d.fillRect(94 + x, 160 + y, 1, 2);
        g2d.fillRect(95 + x, 160 + y, 1, 2);
        g2d.fillRect(96 + x, 160 + y, 1, 2);
        g2d.fillRect(97 + x, 160 + y, 1, 2);
        g2d.fillRect(115 + x, 160 + y, 1, 2);
        g2d.fillRect(119 + x, 160 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 3, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 5, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 1, 4);
        g2d.fillRect(118 + x, 92 + y, 1, 4);
        g2d.fillRect(102 + x, 94 + y, 3, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 95 + y, 1, 6);
        g2d.fillRect(102 + x, 96 + y, 2, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 17);
        g2d.fillRect(103 + x, 99 + y, 1, 3);
        g2d.fillRect(101 + x, 100 + y, 1, 2);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 5);
        g2d.fillRect(116 + x, 102 + y, 1, 2);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 10);
        g2d.fillRect(100 + x, 105 + y, 1, 4);
        g2d.fillRect(116 + x, 105 + y, 1, 5);
        g2d.fillRect(99 + x, 107 + y, 1, 7);
        g2d.fillRect(101 + x, 107 + y, 1, 4);
        g2d.fillRect(100 + x, 111 + y, 1, 3);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 115 + y, 1, 4);
        g2d.fillRect(96 + x, 116 + y, 1, 8);
        g2d.fillRect(117 + x, 117 + y, 1, 7);
        g2d.fillRect(99 + x, 119 + y, 1, 7);
        g2d.fillRect(116 + x, 121 + y, 1, 8);
        g2d.fillRect(95 + x, 123 + y, 1, 6);
        g2d.fillRect(98 + x, 123 + y, 1, 10);
        g2d.fillRect(115 + x, 124 + y, 1, 1);
        g2d.fillRect(118 + x, 124 + y, 1, 4);
        g2d.fillRect(96 + x, 125 + y, 1, 3);
        g2d.fillRect(97 + x, 126 + y, 1, 12);
        g2d.fillRect(117 + x, 126 + y, 1, 12);
        g2d.fillRect(94 + x, 129 + y, 1, 6);
        g2d.fillRect(115 + x, 129 + y, 1, 1);
        g2d.fillRect(95 + x, 130 + y, 1, 1);
        g2d.fillRect(96 + x, 133 + y, 1, 5);
        g2d.fillRect(95 + x, 134 + y, 1, 2);
        g2d.fillRect(118 + x, 136 + y, 1, 7);
        g2d.fillRect(94 + x, 138 + y, 2, 1);
        g2d.fillRect(93 + x, 139 + y, 1, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 1);
        g2d.fillRect(120 + x, 139 + y, 1, 2);
        g2d.fillRect(92 + x, 140 + y, 1, 1);
        g2d.fillRect(94 + x, 140 + y, 1, 3);
        g2d.fillRect(92 + x, 143 + y, 2, 1);
        g2d.fillRect(95 + x, 143 + y, 1, 1);
        g2d.fillRect(119 + x, 143 + y, 1, 2);
        g2d.fillRect(93 + x, 144 + y, 1, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 5);
        g2d.fillRect(91 + x, 145 + y, 1, 2);
        g2d.fillRect(92 + x, 145 + y, 1, 3);
        g2d.fillRect(94 + x, 145 + y, 1, 2);
        g2d.fillRect(115 + x, 145 + y, 1, 5);
        g2d.fillRect(97 + x, 147 + y, 1, 3);
        g2d.fillRect(98 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 1);
        g2d.fillRect(91 + x, 149 + y, 1, 3);
        g2d.fillRect(92 + x, 149 + y, 1, 1);
        g2d.fillRect(96 + x, 149 + y, 1, 1);
        g2d.fillRect(114 + x, 149 + y, 1, 9);
        g2d.fillRect(90 + x, 150 + y, 1, 4);
        g2d.fillRect(119 + x, 150 + y, 1, 3);
        g2d.fillRect(120 + x, 150 + y, 1, 3);
        g2d.fillRect(96 + x, 152 + y, 1, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 1);
        g2d.fillRect(116 + x, 153 + y, 1, 5);
        g2d.fillRect(95 + x, 154 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 3);
        g2d.fillRect(92 + x, 157 + y, 1, 2);
        g2d.fillRect(95 + x, 157 + y, 1, 3);
        g2d.fillRect(96 + x, 157 + y, 1, 1);
        g2d.fillRect(120 + x, 157 + y, 1, 1);
        g2d.fillRect(91 + x, 158 + y, 1, 1);
        g2d.fillRect(94 + x, 158 + y, 1, 2);
        g2d.fillRect(117 + x, 158 + y, 1, 4);
        g2d.fillRect(89 + x, 159 + y, 2, 1);
        g2d.fillRect(93 + x, 159 + y, 1, 1);
        g2d.fillRect(96 + x, 159 + y, 3, 1);
        g2d.fillRect(115 + x, 159 + y, 2, 1);
        g2d.fillRect(118 + x, 159 + y, 1, 3);
        g2d.fillRect(119 + x, 159 + y, 1, 1);
        g2d.fillRect(90 + x, 160 + y, 1, 2);
        g2d.fillRect(91 + x, 160 + y, 1, 2);
        g2d.fillRect(92 + x, 160 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 2, 1);
        g2d.fillRect(103 + x, 90 + y, 4, 1);
        g2d.fillRect(114 + x, 90 + y, 3, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 2, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 5);
        g2d.fillRect(103 + x, 97 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 3);
        g2d.fillRect(118 + x, 101 + y, 1, 3);
        g2d.fillRect(101 + x, 102 + y, 1, 2);
        g2d.fillRect(101 + x, 105 + y, 1, 2);
        g2d.fillRect(100 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 119 + y, 1, 5);
        g2d.fillRect(117 + x, 124 + y, 1, 2);
        g2d.fillRect(115 + x, 125 + y, 1, 4);
        g2d.fillRect(96 + x, 128 + y, 1, 5);
        g2d.fillRect(116 + x, 129 + y, 1, 7);
        g2d.fillRect(95 + x, 131 + y, 1, 3);
        g2d.fillRect(94 + x, 135 + y, 1, 3);
        g2d.fillRect(118 + x, 135 + y, 1, 1);
        g2d.fillRect(93 + x, 136 + y, 1, 3);
        g2d.fillRect(96 + x, 138 + y, 1, 2);
        g2d.fillRect(117 + x, 138 + y, 1, 1);
        g2d.fillRect(95 + x, 139 + y, 1, 4);
        g2d.fillRect(117 + x, 140 + y, 1, 1);
        g2d.fillRect(120 + x, 141 + y, 1, 2);
        g2d.fillRect(94 + x, 143 + y, 1, 2);
        g2d.fillRect(118 + x, 143 + y, 1, 4);
        g2d.fillRect(93 + x, 145 + y, 1, 3);
        g2d.fillRect(119 + x, 145 + y, 1, 5);
        g2d.fillRect(91 + x, 148 + y, 2, 1);
        g2d.fillRect(96 + x, 150 + y, 1, 2);
        g2d.fillRect(115 + x, 150 + y, 1, 9);
        g2d.fillRect(95 + x, 152 + y, 1, 2);
        g2d.fillRect(120 + x, 153 + y, 1, 4);
        g2d.fillRect(94 + x, 154 + y, 1, 3);
        g2d.fillRect(93 + x, 155 + y, 1, 3);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(116 + x, 160 + y, 1, 2);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
