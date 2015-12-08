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
public class Pnt7 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt7()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt7(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt7(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt7(int layer, ColorArray colorSwitch)
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

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }

    public void paintP(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(120 + x, 81 + y, 1, 5);
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 4);
        g2d.fillRect(116 + x, 83 + y, 3, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 81 + y, 1, 4);
        g2d.fillRect(102 + x, 83 + y, 5, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 4);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 3);
        g2d.fillRect(109 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 3);
        g2d.fillRect(114 + x, 84 + y, 1, 3);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 3, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 82 + y, 1, 3);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 4, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 90 + y, 2, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 2);
        g2d.fillRect(101 + x, 146 + y, 1, 14);
        g2d.fillRect(110 + x, 153 + y, 1, 7);
        g2d.fillRect(88 + x, 154 + y, 1, 6);
        g2d.fillRect(123 + x, 155 + y, 1, 5);
        g2d.fillRect(89 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 1, 2);
        g2d.fillRect(111 + x, 159 + y, 1, 2);
        g2d.fillRect(122 + x, 159 + y, 1, 2);
        g2d.fillRect(90 + x, 160 + y, 2, 1);
        g2d.fillRect(98 + x, 160 + y, 1, 2);
        g2d.fillRect(99 + x, 160 + y, 1, 1);
        g2d.fillRect(112 + x, 160 + y, 2, 1);
        g2d.fillRect(120 + x, 160 + y, 1, 2);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(91 + x, 161 + y, 7, 1);
        g2d.fillRect(113 + x, 161 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 3, 1);
        g2d.fillRect(116 + x, 86 + y, 4, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 11);
        g2d.fillRect(100 + x, 87 + y, 1, 4);
        g2d.fillRect(107 + x, 87 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 5, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 3);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 7);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 3);
        g2d.fillRect(113 + x, 90 + y, 1, 12);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 2, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 3);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(107 + x, 97 + y, 1, 3);
        g2d.fillRect(106 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 5);
        g2d.fillRect(114 + x, 103 + y, 1, 9);
        g2d.fillRect(104 + x, 107 + y, 1, 13);
        g2d.fillRect(113 + x, 109 + y, 1, 16);
        g2d.fillRect(97 + x, 110 + y, 1, 5);
        g2d.fillRect(118 + x, 111 + y, 1, 2);
        g2d.fillRect(98 + x, 112 + y, 1, 1);
        g2d.fillRect(120 + x, 112 + y, 1, 6);
        g2d.fillRect(99 + x, 113 + y, 1, 3);
        g2d.fillRect(96 + x, 115 + y, 1, 8);
        g2d.fillRect(95 + x, 119 + y, 1, 3);
        g2d.fillRect(121 + x, 119 + y, 1, 14);
        g2d.fillRect(103 + x, 120 + y, 1, 8);
        g2d.fillRect(94 + x, 122 + y, 1, 4);
        g2d.fillRect(96 + x, 125 + y, 1, 1);
        g2d.fillRect(112 + x, 125 + y, 1, 10);
        g2d.fillRect(93 + x, 126 + y, 1, 6);
        g2d.fillRect(96 + x, 127 + y, 1, 1);
        g2d.fillRect(102 + x, 128 + y, 1, 10);
        g2d.fillRect(92 + x, 132 + y, 1, 6);
        g2d.fillRect(122 + x, 134 + y, 1, 16);
        g2d.fillRect(111 + x, 135 + y, 1, 12);
        g2d.fillRect(101 + x, 138 + y, 1, 8);
        g2d.fillRect(91 + x, 139 + y, 1, 4);
        g2d.fillRect(90 + x, 144 + y, 1, 6);
        g2d.fillRect(110 + x, 147 + y, 1, 6);
        g2d.fillRect(89 + x, 150 + y, 1, 3);
        g2d.fillRect(100 + x, 150 + y, 1, 9);
        g2d.fillRect(123 + x, 150 + y, 1, 5);
        g2d.fillRect(99 + x, 151 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 6);
        g2d.fillRect(112 + x, 156 + y, 1, 4);
        g2d.fillRect(89 + x, 158 + y, 1, 1);
        g2d.fillRect(99 + x, 158 + y, 1, 2);
        g2d.fillRect(113 + x, 158 + y, 1, 2);
        g2d.fillRect(114 + x, 158 + y, 1, 3);
        g2d.fillRect(122 + x, 158 + y, 1, 1);
        g2d.fillRect(97 + x, 159 + y, 1, 2);
        g2d.fillRect(98 + x, 159 + y, 1, 1);
        g2d.fillRect(115 + x, 159 + y, 1, 2);
        g2d.fillRect(93 + x, 160 + y, 4, 1);
        g2d.fillRect(116 + x, 160 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(116 + x, 87 + y, 2, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 3);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 4, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 9);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 4);
        g2d.fillRect(116 + x, 92 + y, 3, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 20);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 96 + y, 1, 7);
        g2d.fillRect(104 + x, 98 + y, 1, 3);
        g2d.fillRect(116 + x, 98 + y, 1, 3);
        g2d.fillRect(98 + x, 100 + y, 1, 7);
        g2d.fillRect(117 + x, 101 + y, 1, 2);
        g2d.fillRect(97 + x, 107 + y, 1, 3);
        g2d.fillRect(119 + x, 108 + y, 1, 8);
        g2d.fillRect(99 + x, 112 + y, 1, 1);
        g2d.fillRect(103 + x, 113 + y, 1, 7);
        g2d.fillRect(117 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 116 + y, 1, 1);
        g2d.fillRect(120 + x, 118 + y, 1, 15);
        g2d.fillRect(102 + x, 120 + y, 1, 8);
        g2d.fillRect(119 + x, 120 + y, 1, 1);
        g2d.fillRect(119 + x, 122 + y, 1, 3);
        g2d.fillRect(96 + x, 123 + y, 1, 2);
        g2d.fillRect(113 + x, 125 + y, 1, 7);
        g2d.fillRect(94 + x, 126 + y, 1, 5);
        g2d.fillRect(96 + x, 126 + y, 1, 1);
        g2d.fillRect(119 + x, 126 + y, 1, 1);
        g2d.fillRect(96 + x, 128 + y, 1, 8);
        g2d.fillRect(101 + x, 128 + y, 1, 10);
        g2d.fillRect(93 + x, 132 + y, 1, 5);
        g2d.fillRect(114 + x, 132 + y, 1, 4);
        g2d.fillRect(121 + x, 133 + y, 1, 17);
        g2d.fillRect(112 + x, 135 + y, 1, 12);
        g2d.fillRect(119 + x, 135 + y, 1, 1);
        g2d.fillRect(96 + x, 137 + y, 1, 3);
        g2d.fillRect(92 + x, 138 + y, 1, 5);
        g2d.fillRect(100 + x, 138 + y, 1, 12);
        g2d.fillRect(119 + x, 138 + y, 1, 5);
        g2d.fillRect(96 + x, 141 + y, 1, 1);
        g2d.fillRect(91 + x, 143 + y, 1, 7);
        g2d.fillRect(119 + x, 145 + y, 1, 5);
        g2d.fillRect(111 + x, 147 + y, 1, 6);
        g2d.fillRect(90 + x, 150 + y, 1, 1);
        g2d.fillRect(99 + x, 150 + y, 1, 1);
        g2d.fillRect(122 + x, 150 + y, 1, 8);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(112 + x, 152 + y, 1, 4);
        g2d.fillRect(89 + x, 153 + y, 1, 5);
        g2d.fillRect(97 + x, 153 + y, 1, 2);
        g2d.fillRect(99 + x, 153 + y, 1, 5);
        g2d.fillRect(113 + x, 155 + y, 2, 1);
        g2d.fillRect(98 + x, 156 + y, 1, 3);
        g2d.fillRect(97 + x, 157 + y, 1, 2);
        g2d.fillRect(121 + x, 157 + y, 1, 3);
        g2d.fillRect(90 + x, 158 + y, 1, 2);
        g2d.fillRect(95 + x, 158 + y, 1, 2);
        g2d.fillRect(96 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 1, 2);
        g2d.fillRect(120 + x, 158 + y, 1, 2);
        g2d.fillRect(91 + x, 159 + y, 1, 1);
        g2d.fillRect(93 + x, 159 + y, 2, 1);
        g2d.fillRect(117 + x, 159 + y, 2, 1);
        g2d.fillRect(92 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 86 + y, 1, 3);
        g2d.fillRect(101 + x, 87 + y, 1, 3);
        g2d.fillRect(104 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 3);
        g2d.fillRect(120 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 89 + y, 5, 1);
        g2d.fillRect(112 + x, 89 + y, 4, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 16);
        g2d.fillRect(101 + x, 91 + y, 1, 12);
        g2d.fillRect(106 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 17);
        g2d.fillRect(102 + x, 92 + y, 1, 9);
        g2d.fillRect(103 + x, 92 + y, 1, 6);
        g2d.fillRect(104 + x, 92 + y, 1, 4);
        g2d.fillRect(116 + x, 93 + y, 1, 3);
        g2d.fillRect(117 + x, 93 + y, 1, 5);
        g2d.fillRect(118 + x, 93 + y, 1, 8);
        g2d.fillRect(106 + x, 96 + y, 1, 4);
        g2d.fillRect(105 + x, 98 + y, 1, 4);
        g2d.fillRect(115 + x, 98 + y, 1, 20);
        g2d.fillRect(99 + x, 100 + y, 1, 12);
        g2d.fillRect(103 + x, 101 + y, 1, 12);
        g2d.fillRect(104 + x, 101 + y, 1, 6);
        g2d.fillRect(116 + x, 101 + y, 1, 5);
        g2d.fillRect(102 + x, 102 + y, 1, 6);
        g2d.fillRect(117 + x, 103 + y, 1, 5);
        g2d.fillRect(118 + x, 103 + y, 1, 7);
        g2d.fillRect(98 + x, 107 + y, 1, 5);
        g2d.fillRect(102 + x, 110 + y, 1, 5);
        g2d.fillRect(100 + x, 112 + y, 1, 4);
        g2d.fillRect(114 + x, 112 + y, 1, 20);
        g2d.fillRect(98 + x, 113 + y, 1, 37);
        g2d.fillRect(118 + x, 113 + y, 1, 5);
        g2d.fillRect(97 + x, 115 + y, 1, 7);
        g2d.fillRect(101 + x, 115 + y, 1, 3);
        g2d.fillRect(117 + x, 115 + y, 1, 40);
        g2d.fillRect(99 + x, 116 + y, 1, 14);
        g2d.fillRect(116 + x, 116 + y, 1, 1);
        g2d.fillRect(119 + x, 116 + y, 1, 4);
        g2d.fillRect(100 + x, 117 + y, 1, 3);
        g2d.fillRect(102 + x, 117 + y, 1, 3);
        g2d.fillRect(119 + x, 121 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 1, 30);
        g2d.fillRect(101 + x, 125 + y, 1, 3);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(119 + x, 127 + y, 1, 8);
        g2d.fillRect(115 + x, 128 + y, 1, 17);
        g2d.fillRect(94 + x, 131 + y, 1, 5);
        g2d.fillRect(97 + x, 132 + y, 1, 3);
        g2d.fillRect(113 + x, 132 + y, 1, 18);
        g2d.fillRect(120 + x, 133 + y, 1, 22);
        g2d.fillRect(96 + x, 136 + y, 1, 1);
        g2d.fillRect(114 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 14);
        g2d.fillRect(119 + x, 136 + y, 1, 2);
        g2d.fillRect(93 + x, 137 + y, 1, 11);
        g2d.fillRect(100 + x, 137 + y, 1, 1);
        g2d.fillRect(97 + x, 138 + y, 1, 2);
        g2d.fillRect(99 + x, 138 + y, 1, 3);
        g2d.fillRect(96 + x, 140 + y, 1, 1);
        g2d.fillRect(96 + x, 142 + y, 1, 10);
        g2d.fillRect(119 + x, 143 + y, 1, 2);
        g2d.fillRect(97 + x, 145 + y, 1, 6);
        g2d.fillRect(94 + x, 146 + y, 1, 1);
        g2d.fillRect(99 + x, 146 + y, 1, 2);
        g2d.fillRect(112 + x, 147 + y, 1, 5);
        g2d.fillRect(114 + x, 147 + y, 1, 5);
        g2d.fillRect(118 + x, 147 + y, 1, 8);
        g2d.fillRect(92 + x, 148 + y, 1, 7);
        g2d.fillRect(94 + x, 148 + y, 1, 3);
        g2d.fillRect(91 + x, 150 + y, 1, 3);
        g2d.fillRect(115 + x, 150 + y, 1, 3);
        g2d.fillRect(119 + x, 150 + y, 1, 5);
        g2d.fillRect(121 + x, 150 + y, 1, 5);
        g2d.fillRect(90 + x, 151 + y, 1, 7);
        g2d.fillRect(93 + x, 151 + y, 1, 5);
        g2d.fillRect(94 + x, 152 + y, 1, 3);
        g2d.fillRect(99 + x, 152 + y, 1, 1);
        g2d.fillRect(113 + x, 152 + y, 1, 3);
        g2d.fillRect(116 + x, 152 + y, 1, 4);
        g2d.fillRect(95 + x, 153 + y, 1, 3);
        g2d.fillRect(96 + x, 153 + y, 1, 3);
        g2d.fillRect(98 + x, 153 + y, 1, 3);
        g2d.fillRect(114 + x, 153 + y, 1, 2);
        g2d.fillRect(91 + x, 155 + y, 1, 1);
        g2d.fillRect(97 + x, 155 + y, 1, 2);
        g2d.fillRect(115 + x, 155 + y, 1, 3);
        g2d.fillRect(113 + x, 156 + y, 2, 1);
        g2d.fillRect(120 + x, 156 + y, 1, 2);
        g2d.fillRect(121 + x, 156 + y, 1, 1);
        g2d.fillRect(91 + x, 157 + y, 1, 2);
        g2d.fillRect(94 + x, 157 + y, 1, 2);
        g2d.fillRect(95 + x, 157 + y, 2, 1);
        g2d.fillRect(114 + x, 157 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 3);
        g2d.fillRect(117 + x, 157 + y, 1, 2);
        g2d.fillRect(118 + x, 157 + y, 1, 2);
        g2d.fillRect(119 + x, 157 + y, 1, 1);
        g2d.fillRect(92 + x, 158 + y, 1, 2);
        g2d.fillRect(93 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 88 + y, 5, 1);
        g2d.fillRect(112 + x, 88 + y, 4, 1);
        g2d.fillRect(102 + x, 91 + y, 4, 1);
        g2d.fillRect(116 + x, 91 + y, 3, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(116 + x, 96 + y, 1, 2);
        g2d.fillRect(103 + x, 98 + y, 1, 3);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 2);
        g2d.fillRect(101 + x, 103 + y, 1, 12);
        g2d.fillRect(116 + x, 106 + y, 1, 9);
        g2d.fillRect(100 + x, 107 + y, 1, 5);
        g2d.fillRect(102 + x, 108 + y, 1, 2);
        g2d.fillRect(117 + x, 108 + y, 1, 5);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(102 + x, 115 + y, 1, 2);
        g2d.fillRect(116 + x, 117 + y, 1, 19);
        g2d.fillRect(101 + x, 118 + y, 1, 7);
        g2d.fillRect(118 + x, 118 + y, 1, 8);
        g2d.fillRect(100 + x, 120 + y, 1, 17);
        g2d.fillRect(97 + x, 122 + y, 1, 10);
        g2d.fillRect(115 + x, 123 + y, 1, 5);
        g2d.fillRect(118 + x, 127 + y, 1, 3);
        g2d.fillRect(99 + x, 130 + y, 1, 8);
        g2d.fillRect(118 + x, 131 + y, 1, 2);
        g2d.fillRect(97 + x, 135 + y, 1, 3);
        g2d.fillRect(94 + x, 136 + y, 1, 10);
        g2d.fillRect(118 + x, 136 + y, 1, 11);
        g2d.fillRect(114 + x, 137 + y, 1, 10);
        g2d.fillRect(97 + x, 140 + y, 1, 5);
        g2d.fillRect(99 + x, 141 + y, 1, 5);
        g2d.fillRect(92 + x, 143 + y, 1, 5);
        g2d.fillRect(115 + x, 145 + y, 1, 5);
        g2d.fillRect(94 + x, 147 + y, 1, 1);
        g2d.fillRect(93 + x, 148 + y, 1, 3);
        g2d.fillRect(99 + x, 148 + y, 1, 2);
        g2d.fillRect(98 + x, 150 + y, 1, 2);
        g2d.fillRect(113 + x, 150 + y, 1, 2);
        g2d.fillRect(116 + x, 150 + y, 1, 2);
        g2d.fillRect(94 + x, 151 + y, 1, 1);
        g2d.fillRect(97 + x, 151 + y, 1, 2);
        g2d.fillRect(95 + x, 152 + y, 2, 1);
        g2d.fillRect(114 + x, 152 + y, 1, 1);
        g2d.fillRect(91 + x, 153 + y, 1, 2);
        g2d.fillRect(115 + x, 153 + y, 1, 2);
        g2d.fillRect(92 + x, 155 + y, 1, 3);
        g2d.fillRect(94 + x, 155 + y, 1, 2);
        g2d.fillRect(120 + x, 155 + y, 2, 1);
        g2d.fillRect(91 + x, 156 + y, 1, 1);
        g2d.fillRect(93 + x, 156 + y, 1, 2);
        g2d.fillRect(95 + x, 156 + y, 2, 1);
        g2d.fillRect(116 + x, 156 + y, 4, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 1);
        g2d.fillRect(115 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(115 + x, 118 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 1);
        g2d.fillRect(118 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 133 + y, 1, 3);
        g2d.fillRect(117 + x, 155 + y, 3, 1);
    }
}
