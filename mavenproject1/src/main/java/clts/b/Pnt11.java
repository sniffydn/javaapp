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
public class Pnt11 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt11()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt11(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt11(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt11(int layer, ColorArray colorSwitch)
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
        paintH(x,y,g2d);
    }
    
    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 2);
        g2d.fillRect(114 + x, 121 + y, 1, 1);
        g2d.fillRect(113 + x, 132 + y, 1, 2);
        g2d.fillRect(113 + x, 135 + y, 1, 1);
        g2d.fillRect(113 + x, 138 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 83 + y, 7, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 3, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 2, 1);
        g2d.fillRect(100 + x, 85 + y, 5, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(122 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 2, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(122 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 5);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 2);
        g2d.fillRect(107 + x, 91 + y, 2, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 4);
        g2d.fillRect(114 + x, 91 + y, 1, 10);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 4);
        g2d.fillRect(115 + x, 97 + y, 1, 30);
        g2d.fillRect(107 + x, 99 + y, 1, 2);
        g2d.fillRect(106 + x, 101 + y, 1, 6);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 2);
        g2d.fillRect(104 + x, 113 + y, 1, 4);
        g2d.fillRect(103 + x, 118 + y, 1, 4);
        g2d.fillRect(102 + x, 122 + y, 1, 9);
        g2d.fillRect(114 + x, 122 + y, 1, 16);
        g2d.fillRect(95 + x, 123 + y, 1, 4);
        g2d.fillRect(101 + x, 123 + y, 1, 2);
        g2d.fillRect(103 + x, 123 + y, 1, 2);
        g2d.fillRect(121 + x, 123 + y, 1, 2);
        g2d.fillRect(100 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 125 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 2, 1);
        g2d.fillRect(122 + x, 125 + y, 1, 2);
        g2d.fillRect(101 + x, 126 + y, 1, 1);
        g2d.fillRect(121 + x, 126 + y, 1, 1);
        g2d.fillRect(122 + x, 128 + y, 1, 4);
        g2d.fillRect(101 + x, 132 + y, 1, 6);
        g2d.fillRect(113 + x, 134 + y, 1, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 2);
        g2d.fillRect(101 + x, 139 + y, 1, 8);
        g2d.fillRect(113 + x, 139 + y, 1, 5);
        g2d.fillRect(102 + x, 143 + y, 1, 9);
        g2d.fillRect(112 + x, 144 + y, 1, 6);
        g2d.fillRect(101 + x, 148 + y, 1, 1);
        g2d.fillRect(111 + x, 151 + y, 1, 7);
        g2d.fillRect(100 + x, 152 + y, 1, 2);
        g2d.fillRect(101 + x, 153 + y, 2, 1);
        g2d.fillRect(102 + x, 154 + y, 1, 6);
        g2d.fillRect(101 + x, 156 + y, 1, 1);
        g2d.fillRect(110 + x, 158 + y, 1, 4);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(118 + x, 161 + y, 1, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 3);
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(117 + x, 162 + y, 1, 1);
        g2d.fillRect(110 + x, 163 + y, 1, 2);
        g2d.fillRect(116 + x, 163 + y, 1, 3);
        g2d.fillRect(101 + x, 165 + y, 2, 1);
        g2d.fillRect(112 + x, 165 + y, 4, 1);
        g2d.fillRect(117 + x, 165 + y, 2, 1);
        g2d.fillRect(98 + x, 166 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 83 + y, 2, 1);
        g2d.fillRect(109 + x, 84 + y, 6, 1);
        g2d.fillRect(105 + x, 85 + y, 3, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 2, 1);
        g2d.fillRect(106 + x, 88 + y, 3, 1);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(109 + x, 89 + y, 2, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 5, 1);
        g2d.fillRect(113 + x, 90 + y, 6, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 3);
        g2d.fillRect(122 + x, 91 + y, 1, 10);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(115 + x, 92 + y, 1, 5);
        g2d.fillRect(107 + x, 95 + y, 1, 4);
        g2d.fillRect(106 + x, 99 + y, 1, 2);
        g2d.fillRect(116 + x, 99 + y, 1, 26);
        g2d.fillRect(105 + x, 101 + y, 1, 6);
        g2d.fillRect(121 + x, 103 + y, 1, 20);
        g2d.fillRect(104 + x, 108 + y, 1, 5);
        g2d.fillRect(105 + x, 109 + y, 1, 1);
        g2d.fillRect(103 + x, 112 + y, 1, 6);
        g2d.fillRect(102 + x, 118 + y, 1, 4);
        g2d.fillRect(101 + x, 122 + y, 1, 1);
        g2d.fillRect(120 + x, 122 + y, 1, 3);
        g2d.fillRect(96 + x, 123 + y, 1, 3);
        g2d.fillRect(99 + x, 123 + y, 1, 3);
        g2d.fillRect(100 + x, 123 + y, 1, 2);
        g2d.fillRect(117 + x, 123 + y, 1, 4);
        g2d.fillRect(119 + x, 123 + y, 1, 2);
        g2d.fillRect(97 + x, 125 + y, 2, 1);
        g2d.fillRect(118 + x, 125 + y, 1, 1);
        g2d.fillRect(100 + x, 126 + y, 1, 1);
        g2d.fillRect(116 + x, 126 + y, 1, 2);
        g2d.fillRect(119 + x, 126 + y, 2, 1);
        g2d.fillRect(101 + x, 127 + y, 1, 5);
        g2d.fillRect(115 + x, 127 + y, 1, 12);
        g2d.fillRect(120 + x, 127 + y, 2, 1);
        g2d.fillRect(121 + x, 128 + y, 1, 11);
        g2d.fillRect(100 + x, 131 + y, 1, 21);
        g2d.fillRect(122 + x, 132 + y, 1, 2);
        g2d.fillRect(123 + x, 134 + y, 1, 9);
        g2d.fillRect(114 + x, 138 + y, 1, 6);
        g2d.fillRect(120 + x, 139 + y, 1, 5);
        g2d.fillRect(96 + x, 143 + y, 1, 1);
        g2d.fillRect(124 + x, 143 + y, 1, 7);
        g2d.fillRect(113 + x, 144 + y, 1, 8);
        g2d.fillRect(97 + x, 145 + y, 1, 3);
        g2d.fillRect(120 + x, 145 + y, 1, 2);
        g2d.fillRect(98 + x, 148 + y, 1, 2);
        g2d.fillRect(101 + x, 149 + y, 1, 4);
        g2d.fillRect(99 + x, 150 + y, 1, 7);
        g2d.fillRect(112 + x, 150 + y, 1, 8);
        g2d.fillRect(125 + x, 151 + y, 1, 3);
        g2d.fillRect(119 + x, 152 + y, 1, 1);
        g2d.fillRect(100 + x, 154 + y, 1, 7);
        g2d.fillRect(118 + x, 154 + y, 1, 7);
        g2d.fillRect(126 + x, 156 + y, 1, 9);
        g2d.fillRect(101 + x, 157 + y, 1, 8);
        g2d.fillRect(111 + x, 158 + y, 1, 7);
        g2d.fillRect(102 + x, 160 + y, 1, 5);
        g2d.fillRect(117 + x, 160 + y, 1, 2);
        g2d.fillRect(125 + x, 161 + y, 1, 4);
        g2d.fillRect(103 + x, 162 + y, 1, 3);
        g2d.fillRect(110 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 3);
        g2d.fillRect(116 + x, 162 + y, 1, 1);
        g2d.fillRect(118 + x, 162 + y, 1, 3);
        g2d.fillRect(127 + x, 162 + y, 1, 1);
        g2d.fillRect(87 + x, 163 + y, 1, 2);
        g2d.fillRect(88 + x, 163 + y, 1, 2);
        g2d.fillRect(100 + x, 163 + y, 1, 3);
        g2d.fillRect(113 + x, 163 + y, 1, 2);
        g2d.fillRect(114 + x, 163 + y, 1, 2);
        g2d.fillRect(115 + x, 163 + y, 1, 2);
        g2d.fillRect(119 + x, 163 + y, 1, 3);
        g2d.fillRect(120 + x, 163 + y, 1, 3);
        g2d.fillRect(121 + x, 163 + y, 1, 3);
        g2d.fillRect(122 + x, 163 + y, 1, 3);
        g2d.fillRect(123 + x, 163 + y, 1, 3);
        g2d.fillRect(124 + x, 163 + y, 1, 2);
        g2d.fillRect(89 + x, 165 + y, 3, 1);
        g2d.fillRect(98 + x, 165 + y, 2, 1);
        g2d.fillRect(92 + x, 166 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 3, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 3);
        g2d.fillRect(117 + x, 99 + y, 1, 2);
        g2d.fillRect(121 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 4);
        g2d.fillRect(120 + x, 101 + y, 1, 2);
        g2d.fillRect(121 + x, 101 + y, 1, 2);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 2);
        g2d.fillRect(103 + x, 107 + y, 1, 1);
        g2d.fillRect(120 + x, 107 + y, 1, 2);
        g2d.fillRect(98 + x, 109 + y, 1, 3);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 112 + y, 1, 1);
        g2d.fillRect(120 + x, 112 + y, 1, 1);
        g2d.fillRect(101 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 114 + y, 1, 2);
        g2d.fillRect(117 + x, 114 + y, 1, 2);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(104 + x, 117 + y, 1, 1);
        g2d.fillRect(120 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 118 + y, 1, 1);
        g2d.fillRect(118 + x, 118 + y, 1, 3);
        g2d.fillRect(97 + x, 119 + y, 1, 2);
        g2d.fillRect(99 + x, 119 + y, 1, 2);
        g2d.fillRect(98 + x, 121 + y, 1, 1);
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(101 + x, 125 + y, 1, 1);
        g2d.fillRect(121 + x, 125 + y, 1, 1);
        g2d.fillRect(122 + x, 127 + y, 1, 1);
        g2d.fillRect(99 + x, 132 + y, 1, 2);
        g2d.fillRect(119 + x, 132 + y, 1, 2);
        g2d.fillRect(96 + x, 135 + y, 1, 1);
        g2d.fillRect(117 + x, 135 + y, 1, 1);
        g2d.fillRect(99 + x, 138 + y, 1, 1);
        g2d.fillRect(101 + x, 138 + y, 1, 1);
        g2d.fillRect(119 + x, 138 + y, 1, 1);
        g2d.fillRect(97 + x, 140 + y, 1, 3);
        g2d.fillRect(116 + x, 140 + y, 1, 1);
        g2d.fillRect(94 + x, 143 + y, 1, 1);
        g2d.fillRect(99 + x, 143 + y, 1, 1);
        g2d.fillRect(119 + x, 143 + y, 1, 1);
        g2d.fillRect(91 + x, 145 + y, 1, 2);
        g2d.fillRect(115 + x, 145 + y, 1, 2);
        g2d.fillRect(92 + x, 147 + y, 1, 1);
        g2d.fillRect(101 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 2);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(123 + x, 148 + y, 1, 1);
        g2d.fillRect(92 + x, 149 + y, 2, 1);
        g2d.fillRect(114 + x, 150 + y, 1, 2);
        g2d.fillRect(90 + x, 152 + y, 1, 1);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(102 + x, 152 + y, 1, 1);
        g2d.fillRect(120 + x, 152 + y, 1, 1);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(117 + x, 153 + y, 1, 1);
        g2d.fillRect(123 + x, 153 + y, 1, 1);
        g2d.fillRect(101 + x, 154 + y, 1, 2);
        g2d.fillRect(116 + x, 154 + y, 1, 2);
        g2d.fillRect(94 + x, 156 + y, 1, 1);
        g2d.fillRect(122 + x, 156 + y, 1, 1);
        g2d.fillRect(92 + x, 157 + y, 1, 1);
        g2d.fillRect(95 + x, 157 + y, 1, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 1);
        g2d.fillRect(94 + x, 158 + y, 1, 2);
        g2d.fillRect(97 + x, 158 + y, 1, 2);
        g2d.fillRect(115 + x, 158 + y, 1, 3);
        g2d.fillRect(121 + x, 158 + y, 1, 2);
        g2d.fillRect(88 + x, 160 + y, 1, 1);
        g2d.fillRect(121 + x, 161 + y, 1, 1);
        g2d.fillRect(117 + x, 163 + y, 1, 2);
        g2d.fillRect(103 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 3, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 2, 1);
        g2d.fillRect(108 + x, 85 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 3, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 3);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 86 + y, 3, 1);
        g2d.fillRect(117 + x, 86 + y, 2, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 4, 1);
        g2d.fillRect(113 + x, 87 + y, 4, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 5);
        g2d.fillRect(101 + x, 89 + y, 1, 3);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 3, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 3);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(117 + x, 91 + y, 1, 3);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 7);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 5);
        g2d.fillRect(117 + x, 95 + y, 1, 4);
        g2d.fillRect(105 + x, 99 + y, 1, 2);
        g2d.fillRect(121 + x, 100 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 3);
        g2d.fillRect(120 + x, 103 + y, 1, 4);
        g2d.fillRect(104 + x, 104 + y, 1, 4);
        g2d.fillRect(103 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 4);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(103 + x, 108 + y, 1, 4);
        g2d.fillRect(102 + x, 109 + y, 1, 3);
        g2d.fillRect(120 + x, 109 + y, 1, 3);
        g2d.fillRect(117 + x, 110 + y, 1, 4);
        g2d.fillRect(98 + x, 112 + y, 1, 2);
        g2d.fillRect(118 + x, 112 + y, 1, 1);
        g2d.fillRect(102 + x, 113 + y, 1, 5);
        g2d.fillRect(120 + x, 113 + y, 1, 4);
        g2d.fillRect(101 + x, 114 + y, 1, 3);
        g2d.fillRect(117 + x, 116 + y, 1, 7);
        g2d.fillRect(97 + x, 118 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 4);
        g2d.fillRect(120 + x, 118 + y, 1, 4);
        g2d.fillRect(100 + x, 119 + y, 1, 4);
        g2d.fillRect(96 + x, 121 + y, 1, 2);
        g2d.fillRect(97 + x, 121 + y, 1, 4);
        g2d.fillRect(99 + x, 121 + y, 1, 2);
        g2d.fillRect(118 + x, 121 + y, 1, 4);
        g2d.fillRect(119 + x, 121 + y, 1, 2);
        g2d.fillRect(98 + x, 123 + y, 1, 2);
        g2d.fillRect(96 + x, 126 + y, 1, 2);
        g2d.fillRect(97 + x, 126 + y, 3, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 4);
        g2d.fillRect(94 + x, 127 + y, 1, 16);
        g2d.fillRect(95 + x, 127 + y, 1, 21);
        g2d.fillRect(98 + x, 127 + y, 1, 5);
        g2d.fillRect(99 + x, 127 + y, 1, 5);
        g2d.fillRect(100 + x, 127 + y, 1, 4);
        g2d.fillRect(117 + x, 127 + y, 1, 8);
        g2d.fillRect(119 + x, 127 + y, 1, 5);
        g2d.fillRect(116 + x, 128 + y, 1, 12);
        g2d.fillRect(120 + x, 128 + y, 1, 11);
        g2d.fillRect(93 + x, 132 + y, 1, 7);
        g2d.fillRect(99 + x, 134 + y, 1, 4);
        g2d.fillRect(119 + x, 134 + y, 1, 4);
        g2d.fillRect(122 + x, 134 + y, 1, 13);
        g2d.fillRect(96 + x, 136 + y, 1, 7);
        g2d.fillRect(99 + x, 139 + y, 1, 4);
        g2d.fillRect(115 + x, 139 + y, 1, 6);
        g2d.fillRect(119 + x, 139 + y, 1, 4);
        g2d.fillRect(121 + x, 139 + y, 1, 11);
        g2d.fillRect(116 + x, 141 + y, 1, 3);
        g2d.fillRect(91 + x, 143 + y, 1, 2);
        g2d.fillRect(97 + x, 143 + y, 1, 2);
        g2d.fillRect(123 + x, 143 + y, 1, 5);
        g2d.fillRect(96 + x, 144 + y, 1, 9);
        g2d.fillRect(98 + x, 144 + y, 1, 4);
        g2d.fillRect(99 + x, 144 + y, 1, 6);
        g2d.fillRect(114 + x, 144 + y, 1, 6);
        g2d.fillRect(119 + x, 144 + y, 1, 8);
        g2d.fillRect(120 + x, 144 + y, 1, 1);
        g2d.fillRect(91 + x, 147 + y, 1, 1);
        g2d.fillRect(115 + x, 147 + y, 1, 2);
        g2d.fillRect(120 + x, 147 + y, 1, 5);
        g2d.fillRect(92 + x, 148 + y, 1, 1);
        g2d.fillRect(97 + x, 148 + y, 1, 10);
        g2d.fillRect(95 + x, 149 + y, 1, 1);
        g2d.fillRect(118 + x, 149 + y, 1, 5);
        g2d.fillRect(123 + x, 149 + y, 1, 4);
        g2d.fillRect(92 + x, 150 + y, 1, 4);
        g2d.fillRect(93 + x, 150 + y, 1, 2);
        g2d.fillRect(98 + x, 150 + y, 1, 15);
        g2d.fillRect(117 + x, 150 + y, 1, 3);
        g2d.fillRect(124 + x, 150 + y, 1, 3);
        g2d.fillRect(89 + x, 152 + y, 1, 6);
        g2d.fillRect(113 + x, 152 + y, 1, 5);
        g2d.fillRect(114 + x, 152 + y, 1, 4);
        g2d.fillRect(90 + x, 153 + y, 1, 9);
        g2d.fillRect(93 + x, 153 + y, 1, 4);
        g2d.fillRect(94 + x, 153 + y, 1, 3);
        g2d.fillRect(119 + x, 153 + y, 1, 10);
        g2d.fillRect(120 + x, 153 + y, 1, 4);
        g2d.fillRect(91 + x, 154 + y, 1, 11);
        g2d.fillRect(96 + x, 154 + y, 1, 2);
        g2d.fillRect(117 + x, 154 + y, 1, 6);
        g2d.fillRect(122 + x, 154 + y, 1, 2);
        g2d.fillRect(123 + x, 154 + y, 1, 2);
        g2d.fillRect(124 + x, 154 + y, 1, 9);
        g2d.fillRect(125 + x, 154 + y, 1, 7);
        g2d.fillRect(116 + x, 156 + y, 1, 6);
        g2d.fillRect(94 + x, 157 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 8);
        g2d.fillRect(122 + x, 157 + y, 1, 4);
        g2d.fillRect(92 + x, 158 + y, 1, 8);
        g2d.fillRect(95 + x, 158 + y, 1, 8);
        g2d.fillRect(112 + x, 158 + y, 1, 4);
        g2d.fillRect(113 + x, 158 + y, 1, 5);
        g2d.fillRect(87 + x, 160 + y, 1, 3);
        g2d.fillRect(93 + x, 160 + y, 1, 6);
        g2d.fillRect(94 + x, 160 + y, 1, 1);
        g2d.fillRect(96 + x, 160 + y, 1, 6);
        g2d.fillRect(121 + x, 160 + y, 1, 1);
        g2d.fillRect(88 + x, 161 + y, 1, 2);
        g2d.fillRect(89 + x, 161 + y, 1, 4);
        g2d.fillRect(97 + x, 161 + y, 1, 5);
        g2d.fillRect(100 + x, 161 + y, 1, 2);
        g2d.fillRect(114 + x, 161 + y, 1, 2);
        g2d.fillRect(115 + x, 161 + y, 1, 2);
        g2d.fillRect(120 + x, 161 + y, 1, 2);
        g2d.fillRect(123 + x, 161 + y, 1, 2);
        g2d.fillRect(94 + x, 162 + y, 1, 4);
        g2d.fillRect(121 + x, 162 + y, 2, 1);
        g2d.fillRect(90 + x, 163 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 84 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 2, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 89 + y, 3, 1);
        g2d.fillRect(118 + x, 89 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 5);
        g2d.fillRect(103 + x, 91 + y, 1, 3);
        g2d.fillRect(119 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 1, 10);
        g2d.fillRect(101 + x, 92 + y, 1, 7);
        g2d.fillRect(104 + x, 92 + y, 1, 8);
        g2d.fillRect(118 + x, 92 + y, 1, 18);
        g2d.fillRect(121 + x, 92 + y, 1, 7);
        g2d.fillRect(100 + x, 94 + y, 1, 9);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(103 + x, 95 + y, 1, 9);
        g2d.fillRect(102 + x, 99 + y, 1, 8);
        g2d.fillRect(119 + x, 100 + y, 1, 3);
        g2d.fillRect(99 + x, 101 + y, 1, 18);
        g2d.fillRect(101 + x, 104 + y, 1, 9);
        g2d.fillRect(119 + x, 104 + y, 1, 17);
        g2d.fillRect(100 + x, 108 + y, 1, 1);
        g2d.fillRect(100 + x, 110 + y, 1, 8);
        g2d.fillRect(118 + x, 113 + y, 1, 5);
        g2d.fillRect(98 + x, 116 + y, 1, 5);
        g2d.fillRect(98 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 127 + y, 1, 7);
        g2d.fillRect(96 + x, 128 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 1, 17);
        g2d.fillRect(96 + x, 132 + y, 1, 3);
        g2d.fillRect(98 + x, 132 + y, 1, 12);
        g2d.fillRect(117 + x, 136 + y, 1, 7);
        g2d.fillRect(92 + x, 138 + y, 1, 2);
        g2d.fillRect(97 + x, 138 + y, 1, 2);
        g2d.fillRect(93 + x, 139 + y, 1, 5);
        g2d.fillRect(92 + x, 141 + y, 1, 6);
        g2d.fillRect(94 + x, 144 + y, 1, 5);
        g2d.fillRect(116 + x, 144 + y, 1, 4);
        g2d.fillRect(90 + x, 147 + y, 1, 2);
        g2d.fillRect(93 + x, 147 + y, 1, 2);
        g2d.fillRect(117 + x, 147 + y, 1, 3);
        g2d.fillRect(122 + x, 147 + y, 1, 3);
        g2d.fillRect(91 + x, 148 + y, 1, 4);
        g2d.fillRect(115 + x, 149 + y, 1, 3);
        g2d.fillRect(90 + x, 150 + y, 1, 2);
        g2d.fillRect(94 + x, 150 + y, 1, 3);
        g2d.fillRect(95 + x, 150 + y, 1, 7);
        g2d.fillRect(116 + x, 150 + y, 1, 4);
        g2d.fillRect(121 + x, 150 + y, 1, 3);
        g2d.fillRect(122 + x, 152 + y, 1, 2);
        g2d.fillRect(91 + x, 153 + y, 1, 1);
        g2d.fillRect(115 + x, 153 + y, 1, 5);
        g2d.fillRect(124 + x, 153 + y, 1, 1);
        g2d.fillRect(88 + x, 156 + y, 1, 4);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 4);
        g2d.fillRect(114 + x, 156 + y, 1, 5);
        g2d.fillRect(121 + x, 156 + y, 1, 2);
        g2d.fillRect(123 + x, 156 + y, 1, 2);
        g2d.fillRect(93 + x, 157 + y, 1, 3);
        g2d.fillRect(120 + x, 157 + y, 1, 4);
        g2d.fillRect(89 + x, 160 + y, 1, 1);
        g2d.fillRect(97 + x, 160 + y, 1, 1);
        g2d.fillRect(123 + x, 160 + y, 1, 1);
        g2d.fillRect(94 + x, 161 + y, 1, 1);
        g2d.fillRect(122 + x, 161 + y, 1, 1);
        g2d.fillRect(90 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 6);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(101 + x, 99 + y, 1, 5);
        g2d.fillRect(100 + x, 103 + y, 1, 5);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(96 + x, 130 + y, 1, 2);
        g2d.fillRect(97 + x, 134 + y, 1, 4);
        g2d.fillRect(92 + x, 140 + y, 1, 1);
        g2d.fillRect(117 + x, 143 + y, 1, 4);
        g2d.fillRect(93 + x, 144 + y, 1, 3);
        g2d.fillRect(116 + x, 148 + y, 1, 2);
        g2d.fillRect(90 + x, 149 + y, 1, 1);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(122 + x, 150 + y, 1, 2);
        g2d.fillRect(91 + x, 152 + y, 1, 1);
        g2d.fillRect(115 + x, 152 + y, 1, 1);
        g2d.fillRect(121 + x, 153 + y, 1, 3);
        g2d.fillRect(92 + x, 154 + y, 1, 2);
        g2d.fillRect(89 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 158 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 96 + y, 1, 1);

    }

}
