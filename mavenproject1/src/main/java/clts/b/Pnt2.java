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
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Pnt2 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt2()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt2(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt2(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt2(int layer, ColorArray colorSwitch)
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
        g2d.fillRect(100 + x, 86 + y, 2, 1);
        g2d.fillRect(120 + x, 86 + y, 2, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 2, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 3);
        g2d.fillRect(114 + x, 113 + y, 1, 2);
        g2d.fillRect(102 + x, 115 + y, 1, 2);
        g2d.fillRect(114 + x, 117 + y, 1, 1);
        g2d.fillRect(88 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 3);
        g2d.fillRect(88 + x, 159 + y, 1, 3);
        g2d.fillRect(110 + x, 159 + y, 1, 2);
        g2d.fillRect(111 + x, 159 + y, 1, 2);
        g2d.fillRect(89 + x, 161 + y, 1, 1);
        g2d.fillRect(113 + x, 161 + y, 1, 1);
        g2d.fillRect(91 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 81 + y, 1, 5);
        g2d.fillRect(101 + x, 81 + y, 2, 1);
        g2d.fillRect(118 + x, 81 + y, 3, 1);
        g2d.fillRect(103 + x, 82 + y, 4, 1);
        g2d.fillRect(114 + x, 82 + y, 4, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 3);
        g2d.fillRect(99 + x, 86 + y, 1, 15);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 4, 1);
        g2d.fillRect(114 + x, 87 + y, 4, 1);
        g2d.fillRect(107 + x, 88 + y, 7, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 2, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 10);
        g2d.fillRect(109 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 10);
        g2d.fillRect(108 + x, 93 + y, 1, 3);
        g2d.fillRect(107 + x, 96 + y, 1, 4);
        g2d.fillRect(106 + x, 100 + y, 1, 5);
        g2d.fillRect(120 + x, 100 + y, 1, 22);
        g2d.fillRect(98 + x, 101 + y, 1, 5);
        g2d.fillRect(113 + x, 102 + y, 1, 15);
        g2d.fillRect(105 + x, 105 + y, 1, 4);
        g2d.fillRect(97 + x, 106 + y, 1, 5);
        g2d.fillRect(104 + x, 109 + y, 1, 5);
        g2d.fillRect(96 + x, 111 + y, 1, 6);
        g2d.fillRect(103 + x, 114 + y, 1, 5);
        g2d.fillRect(95 + x, 117 + y, 1, 4);
        g2d.fillRect(112 + x, 117 + y, 1, 11);
        g2d.fillRect(102 + x, 119 + y, 1, 8);
        g2d.fillRect(94 + x, 121 + y, 1, 3);
        g2d.fillRect(121 + x, 121 + y, 1, 3);
        g2d.fillRect(93 + x, 124 + y, 1, 6);
        g2d.fillRect(101 + x, 127 + y, 1, 12);
        g2d.fillRect(121 + x, 127 + y, 1, 3);
        g2d.fillRect(92 + x, 128 + y, 1, 5);
        g2d.fillRect(111 + x, 128 + y, 1, 12);
        g2d.fillRect(122 + x, 130 + y, 1, 10);
        g2d.fillRect(91 + x, 134 + y, 1, 6);
        g2d.fillRect(90 + x, 139 + y, 1, 6);
        g2d.fillRect(102 + x, 139 + y, 1, 18);
        g2d.fillRect(110 + x, 140 + y, 1, 8);
        g2d.fillRect(123 + x, 140 + y, 1, 10);
        g2d.fillRect(89 + x, 145 + y, 1, 8);
        g2d.fillRect(109 + x, 148 + y, 1, 6);
        g2d.fillRect(124 + x, 150 + y, 1, 11);
        g2d.fillRect(88 + x, 153 + y, 1, 4);
        g2d.fillRect(108 + x, 154 + y, 1, 7);
        g2d.fillRect(103 + x, 156 + y, 1, 5);
        g2d.fillRect(88 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 158 + y, 1, 1);
        g2d.fillRect(121 + x, 158 + y, 1, 4);
        g2d.fillRect(89 + x, 159 + y, 1, 2);
        g2d.fillRect(98 + x, 159 + y, 1, 4);
        g2d.fillRect(102 + x, 159 + y, 1, 3);
        g2d.fillRect(112 + x, 159 + y, 1, 3);
        g2d.fillRect(113 + x, 159 + y, 1, 2);
        g2d.fillRect(122 + x, 159 + y, 1, 3);
        g2d.fillRect(123 + x, 159 + y, 1, 2);
        g2d.fillRect(90 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 161 + y, 1, 2);
        g2d.fillRect(100 + x, 161 + y, 2, 1);
        g2d.fillRect(114 + x, 161 + y, 7, 1);
        g2d.fillRect(92 + x, 162 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 82 + y, 1, 4);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 83 + y, 2, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 3, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 11);
        g2d.fillRect(101 + x, 87 + y, 2, 1);
        g2d.fillRect(107 + x, 87 + y, 2, 1);
        g2d.fillRect(112 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 3, 1);
        g2d.fillRect(105 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 25);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 12);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 90 + y, 3, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 4);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 9);
        g2d.fillRect(106 + x, 95 + y, 1, 5);
        g2d.fillRect(105 + x, 98 + y, 1, 7);
        g2d.fillRect(99 + x, 101 + y, 1, 4);
        g2d.fillRect(104 + x, 101 + y, 1, 8);
        g2d.fillRect(119 + x, 102 + y, 1, 11);
        g2d.fillRect(115 + x, 104 + y, 1, 22);
        g2d.fillRect(103 + x, 105 + y, 1, 6);
        g2d.fillRect(98 + x, 106 + y, 1, 5);
        g2d.fillRect(102 + x, 109 + y, 1, 6);
        g2d.fillRect(97 + x, 111 + y, 1, 8);
        g2d.fillRect(101 + x, 113 + y, 1, 14);
        g2d.fillRect(99 + x, 114 + y, 2, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 5);
        g2d.fillRect(100 + x, 115 + y, 1, 46);
        g2d.fillRect(114 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(118 + x, 115 + y, 1, 2);
        g2d.fillRect(119 + x, 115 + y, 1, 9);
        g2d.fillRect(96 + x, 117 + y, 1, 5);
        g2d.fillRect(102 + x, 117 + y, 1, 2);
        g2d.fillRect(113 + x, 117 + y, 1, 20);
        g2d.fillRect(114 + x, 118 + y, 1, 14);
        g2d.fillRect(95 + x, 121 + y, 1, 7);
        g2d.fillRect(120 + x, 122 + y, 1, 5);
        g2d.fillRect(94 + x, 124 + y, 1, 13);
        g2d.fillRect(121 + x, 124 + y, 1, 3);
        g2d.fillRect(99 + x, 127 + y, 1, 14);
        g2d.fillRect(112 + x, 128 + y, 1, 18);
        g2d.fillRect(93 + x, 130 + y, 1, 3);
        g2d.fillRect(120 + x, 130 + y, 1, 3);
        g2d.fillRect(121 + x, 130 + y, 1, 7);
        g2d.fillRect(92 + x, 133 + y, 1, 17);
        g2d.fillRect(119 + x, 133 + y, 1, 3);
        g2d.fillRect(118 + x, 137 + y, 1, 2);
        g2d.fillRect(95 + x, 139 + y, 1, 1);
        g2d.fillRect(101 + x, 139 + y, 1, 22);
        g2d.fillRect(91 + x, 140 + y, 1, 5);
        g2d.fillRect(111 + x, 140 + y, 1, 14);
        g2d.fillRect(122 + x, 140 + y, 1, 8);
        g2d.fillRect(117 + x, 144 + y, 1, 1);
        g2d.fillRect(90 + x, 145 + y, 1, 16);
        g2d.fillRect(116 + x, 146 + y, 1, 4);
        g2d.fillRect(110 + x, 148 + y, 1, 11);
        g2d.fillRect(97 + x, 149 + y, 1, 1);
        g2d.fillRect(93 + x, 150 + y, 1, 4);
        g2d.fillRect(115 + x, 150 + y, 1, 11);
        g2d.fillRect(123 + x, 150 + y, 1, 9);
        g2d.fillRect(97 + x, 152 + y, 1, 10);
        g2d.fillRect(121 + x, 152 + y, 1, 6);
        g2d.fillRect(89 + x, 153 + y, 1, 6);
        g2d.fillRect(109 + x, 154 + y, 1, 4);
        g2d.fillRect(114 + x, 154 + y, 1, 4);
        g2d.fillRect(94 + x, 156 + y, 1, 1);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(102 + x, 157 + y, 1, 2);
        g2d.fillRect(91 + x, 158 + y, 1, 3);
        g2d.fillRect(111 + x, 158 + y, 3, 1);
        g2d.fillRect(122 + x, 158 + y, 1, 1);
        g2d.fillRect(92 + x, 159 + y, 1, 2);
        g2d.fillRect(93 + x, 159 + y, 1, 2);
        g2d.fillRect(99 + x, 159 + y, 1, 2);
        g2d.fillRect(114 + x, 159 + y, 1, 2);
        g2d.fillRect(116 + x, 159 + y, 1, 2);
        g2d.fillRect(117 + x, 159 + y, 1, 2);
        g2d.fillRect(118 + x, 159 + y, 1, 2);
        g2d.fillRect(94 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 3, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 3);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 2, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 13);
        g2d.fillRect(102 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 88 + y, 4, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 13);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 6);
        g2d.fillRect(116 + x, 92 + y, 1, 22);
        g2d.fillRect(117 + x, 92 + y, 1, 3);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 93 + y, 1, 11);
        g2d.fillRect(104 + x, 96 + y, 1, 5);
        g2d.fillRect(100 + x, 98 + y, 1, 8);
        g2d.fillRect(118 + x, 98 + y, 1, 17);
        g2d.fillRect(103 + x, 100 + y, 1, 5);
        g2d.fillRect(102 + x, 102 + y, 1, 7);
        g2d.fillRect(99 + x, 105 + y, 1, 9);
        g2d.fillRect(101 + x, 105 + y, 1, 8);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 108 + y, 1, 6);
        g2d.fillRect(117 + x, 108 + y, 1, 7);
        g2d.fillRect(98 + x, 111 + y, 1, 28);
        g2d.fillRect(119 + x, 113 + y, 1, 2);
        g2d.fillRect(99 + x, 115 + y, 1, 12);
        g2d.fillRect(117 + x, 117 + y, 1, 27);
        g2d.fillRect(118 + x, 117 + y, 1, 15);
        g2d.fillRect(97 + x, 119 + y, 1, 24);
        g2d.fillRect(116 + x, 119 + y, 1, 27);
        g2d.fillRect(96 + x, 122 + y, 1, 14);
        g2d.fillRect(119 + x, 124 + y, 1, 6);
        g2d.fillRect(115 + x, 126 + y, 1, 15);
        g2d.fillRect(120 + x, 127 + y, 1, 3);
        g2d.fillRect(95 + x, 128 + y, 1, 3);
        g2d.fillRect(114 + x, 132 + y, 1, 12);
        g2d.fillRect(119 + x, 132 + y, 1, 1);
        g2d.fillRect(93 + x, 133 + y, 1, 17);
        g2d.fillRect(120 + x, 133 + y, 1, 7);
        g2d.fillRect(118 + x, 135 + y, 1, 2);
        g2d.fillRect(119 + x, 136 + y, 1, 25);
        g2d.fillRect(94 + x, 137 + y, 1, 3);
        g2d.fillRect(95 + x, 137 + y, 1, 2);
        g2d.fillRect(113 + x, 137 + y, 1, 11);
        g2d.fillRect(121 + x, 137 + y, 1, 11);
        g2d.fillRect(118 + x, 139 + y, 1, 7);
        g2d.fillRect(95 + x, 140 + y, 1, 4);
        g2d.fillRect(96 + x, 141 + y, 1, 5);
        g2d.fillRect(99 + x, 141 + y, 1, 18);
        g2d.fillRect(115 + x, 143 + y, 1, 7);
        g2d.fillRect(97 + x, 144 + y, 1, 5);
        g2d.fillRect(91 + x, 145 + y, 1, 13);
        g2d.fillRect(117 + x, 145 + y, 1, 9);
        g2d.fillRect(112 + x, 146 + y, 1, 6);
        g2d.fillRect(95 + x, 148 + y, 1, 4);
        g2d.fillRect(96 + x, 148 + y, 1, 8);
        g2d.fillRect(122 + x, 148 + y, 1, 10);
        g2d.fillRect(114 + x, 149 + y, 1, 5);
        g2d.fillRect(92 + x, 150 + y, 1, 9);
        g2d.fillRect(97 + x, 150 + y, 1, 2);
        g2d.fillRect(116 + x, 150 + y, 1, 6);
        g2d.fillRect(121 + x, 150 + y, 1, 2);
        g2d.fillRect(94 + x, 152 + y, 1, 4);
        g2d.fillRect(98 + x, 152 + y, 1, 5);
        g2d.fillRect(93 + x, 154 + y, 1, 5);
        g2d.fillRect(95 + x, 154 + y, 1, 7);
        g2d.fillRect(111 + x, 154 + y, 1, 4);
        g2d.fillRect(113 + x, 154 + y, 1, 4);
        g2d.fillRect(120 + x, 154 + y, 1, 7);
        g2d.fillRect(94 + x, 157 + y, 1, 4);
        g2d.fillRect(96 + x, 157 + y, 1, 4);
        g2d.fillRect(112 + x, 157 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 2);
        g2d.fillRect(117 + x, 157 + y, 1, 2);
        g2d.fillRect(118 + x, 158 + y, 1, 1);
        g2d.fillRect(91 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 3, 1);
        g2d.fillRect(115 + x, 85 + y, 2, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 3);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 11);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 6);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 4);
        g2d.fillRect(117 + x, 98 + y, 1, 7);
        g2d.fillRect(101 + x, 101 + y, 1, 4);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(117 + x, 106 + y, 1, 2);
        g2d.fillRect(119 + x, 130 + y, 1, 2);
        g2d.fillRect(95 + x, 131 + y, 1, 2);
        g2d.fillRect(118 + x, 132 + y, 1, 3);
        g2d.fillRect(95 + x, 135 + y, 1, 2);
        g2d.fillRect(96 + x, 137 + y, 1, 4);
        g2d.fillRect(98 + x, 139 + y, 1, 13);
        g2d.fillRect(94 + x, 140 + y, 1, 5);
        g2d.fillRect(120 + x, 140 + y, 1, 4);
        g2d.fillRect(115 + x, 141 + y, 1, 2);
        g2d.fillRect(97 + x, 143 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 1, 4);
        g2d.fillRect(114 + x, 144 + y, 1, 5);
        g2d.fillRect(96 + x, 146 + y, 1, 2);
        g2d.fillRect(118 + x, 146 + y, 1, 4);
        g2d.fillRect(113 + x, 148 + y, 1, 6);
        g2d.fillRect(121 + x, 148 + y, 1, 2);
        g2d.fillRect(94 + x, 149 + y, 1, 3);
        g2d.fillRect(120 + x, 149 + y, 1, 5);
        g2d.fillRect(95 + x, 152 + y, 1, 2);
        g2d.fillRect(112 + x, 152 + y, 1, 5);
        g2d.fillRect(117 + x, 154 + y, 1, 3);
        g2d.fillRect(118 + x, 154 + y, 1, 4);
        g2d.fillRect(96 + x, 156 + y, 1, 1);
        g2d.fillRect(116 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 82 + y, 2, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 2, 1);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 4);
        g2d.fillRect(117 + x, 96 + y, 1, 2);
        g2d.fillRect(95 + x, 133 + y, 1, 2);
        g2d.fillRect(96 + x, 136 + y, 1, 1);
        g2d.fillRect(120 + x, 144 + y, 1, 5);
        g2d.fillRect(94 + x, 145 + y, 1, 4);
        g2d.fillRect(118 + x, 150 + y, 1, 4);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
