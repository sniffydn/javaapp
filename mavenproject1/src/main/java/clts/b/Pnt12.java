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
public class Pnt12 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt12()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt12(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt12(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt12(int layer, ColorArray colorSwitch)
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

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(121 + x, 156 + y, 2, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 2);
        g2d.fillRect(99 + x, 158 + y, 1, 2);
        g2d.fillRect(100 + x, 158 + y, 1, 1);
        g2d.fillRect(121 + x, 158 + y, 1, 1);
        g2d.fillRect(97 + x, 159 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 153 + y, 1, 1);
        g2d.fillRect(118 + x, 153 + y, 1, 4);
        g2d.fillRect(94 + x, 154 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 1);
        g2d.fillRect(115 + x, 154 + y, 1, 1);
        g2d.fillRect(93 + x, 155 + y, 1, 1);
        g2d.fillRect(96 + x, 155 + y, 1, 3);
        g2d.fillRect(98 + x, 155 + y, 1, 2);
        g2d.fillRect(114 + x, 155 + y, 1, 1);
        g2d.fillRect(120 + x, 155 + y, 1, 4);
        g2d.fillRect(121 + x, 155 + y, 1, 1);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 2);
        g2d.fillRect(115 + x, 156 + y, 3, 1);
        g2d.fillRect(119 + x, 156 + y, 1, 1);
        g2d.fillRect(94 + x, 157 + y, 2, 1);
        g2d.fillRect(97 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 2);
        g2d.fillRect(121 + x, 157 + y, 1, 1);
        g2d.fillRect(91 + x, 158 + y, 1, 2);
        g2d.fillRect(98 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 158 + y, 6, 1);
        g2d.fillRect(92 + x, 159 + y, 5, 1);
        g2d.fillRect(100 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 2, 1);
        g2d.fillRect(115 + x, 82 + y, 3, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 5);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 3);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 3);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 153 + y, 1, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(95 + x, 154 + y, 2, 1);
        g2d.fillRect(116 + x, 154 + y, 1, 1);
        g2d.fillRect(120 + x, 154 + y, 1, 1);
        g2d.fillRect(94 + x, 155 + y, 1, 1);
        g2d.fillRect(97 + x, 155 + y, 1, 1);
        g2d.fillRect(115 + x, 155 + y, 1, 1);
        g2d.fillRect(117 + x, 155 + y, 1, 1);
        g2d.fillRect(119 + x, 155 + y, 1, 1);
        g2d.fillRect(93 + x, 156 + y, 1, 2);
        g2d.fillRect(113 + x, 156 + y, 2, 1);
        g2d.fillRect(91 + x, 157 + y, 2, 1);
        g2d.fillRect(98 + x, 157 + y, 1, 1);
        g2d.fillRect(114 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 157 + y, 3, 1);
        g2d.fillRect(92 + x, 158 + y, 1, 1);
        g2d.fillRect(95 + x, 158 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 3);
        g2d.fillRect(104 + x, 82 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 5, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 4, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 6);
        g2d.fillRect(100 + x, 86 + y, 2, 1);
        g2d.fillRect(106 + x, 86 + y, 3, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 3, 1);
        g2d.fillRect(108 + x, 87 + y, 2, 1);
        g2d.fillRect(116 + x, 87 + y, 2, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 10);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 89 + y, 1, 3);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 16);
        g2d.fillRect(121 + x, 91 + y, 1, 5);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 2, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 3);
        g2d.fillRect(105 + x, 100 + y, 1, 5);
        g2d.fillRect(104 + x, 106 + y, 1, 3);
        g2d.fillRect(103 + x, 109 + y, 1, 5);
        g2d.fillRect(120 + x, 111 + y, 1, 13);
        g2d.fillRect(102 + x, 114 + y, 1, 7);
        g2d.fillRect(101 + x, 115 + y, 1, 13);
        g2d.fillRect(119 + x, 117 + y, 1, 8);
        g2d.fillRect(100 + x, 118 + y, 1, 18);
        g2d.fillRect(117 + x, 118 + y, 1, 12);
        g2d.fillRect(118 + x, 118 + y, 1, 6);
        g2d.fillRect(121 + x, 120 + y, 1, 6);
        g2d.fillRect(98 + x, 121 + y, 1, 3);
        g2d.fillRect(99 + x, 121 + y, 1, 7);
        g2d.fillRect(96 + x, 122 + y, 1, 2);
        g2d.fillRect(97 + x, 122 + y, 1, 2);
        g2d.fillRect(98 + x, 125 + y, 1, 5);
        g2d.fillRect(116 + x, 125 + y, 1, 11);
        g2d.fillRect(118 + x, 125 + y, 1, 3);
        g2d.fillRect(120 + x, 125 + y, 1, 3);
        g2d.fillRect(97 + x, 128 + y, 1, 9);
        g2d.fillRect(121 + x, 128 + y, 1, 1);
        g2d.fillRect(120 + x, 129 + y, 1, 1);
        g2d.fillRect(122 + x, 129 + y, 1, 14);
        g2d.fillRect(121 + x, 130 + y, 1, 11);
        g2d.fillRect(101 + x, 134 + y, 1, 7);
        g2d.fillRect(123 + x, 134 + y, 1, 17);
        g2d.fillRect(96 + x, 136 + y, 1, 5);
        g2d.fillRect(115 + x, 136 + y, 1, 2);
        g2d.fillRect(119 + x, 138 + y, 1, 3);
        g2d.fillRect(95 + x, 140 + y, 1, 4);
        g2d.fillRect(118 + x, 140 + y, 1, 4);
        g2d.fillRect(102 + x, 142 + y, 1, 8);
        g2d.fillRect(94 + x, 143 + y, 1, 4);
        g2d.fillRect(117 + x, 143 + y, 1, 4);
        g2d.fillRect(99 + x, 144 + y, 1, 3);
        g2d.fillRect(101 + x, 144 + y, 1, 6);
        g2d.fillRect(116 + x, 144 + y, 1, 3);
        g2d.fillRect(122 + x, 144 + y, 1, 6);
        g2d.fillRect(115 + x, 145 + y, 1, 2);
        g2d.fillRect(124 + x, 146 + y, 1, 12);
        g2d.fillRect(97 + x, 147 + y, 2, 1);
        g2d.fillRect(112 + x, 147 + y, 1, 2);
        g2d.fillRect(113 + x, 147 + y, 1, 2);
        g2d.fillRect(121 + x, 147 + y, 1, 2);
        g2d.fillRect(92 + x, 148 + y, 1, 4);
        g2d.fillRect(93 + x, 148 + y, 1, 3);
        g2d.fillRect(95 + x, 148 + y, 1, 2);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(90 + x, 149 + y, 1, 5);
        g2d.fillRect(91 + x, 149 + y, 1, 4);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 149 + y, 1, 1);
        g2d.fillRect(103 + x, 149 + y, 1, 11);
        g2d.fillRect(116 + x, 149 + y, 1, 1);
        g2d.fillRect(114 + x, 150 + y, 2, 1);
        g2d.fillRect(125 + x, 150 + y, 1, 6);
        g2d.fillRect(89 + x, 151 + y, 1, 1);
        g2d.fillRect(111 + x, 151 + y, 1, 3);
        g2d.fillRect(112 + x, 151 + y, 1, 2);
        g2d.fillRect(113 + x, 151 + y, 1, 1);
        g2d.fillRect(96 + x, 152 + y, 5, 1);
        g2d.fillRect(118 + x, 152 + y, 3, 1);
        g2d.fillRect(89 + x, 153 + y, 1, 2);
        g2d.fillRect(99 + x, 153 + y, 3, 1);
        g2d.fillRect(120 + x, 153 + y, 2, 1);
        g2d.fillRect(100 + x, 154 + y, 3, 1);
        g2d.fillRect(104 + x, 154 + y, 1, 3);
        g2d.fillRect(121 + x, 154 + y, 2, 1);
        g2d.fillRect(88 + x, 155 + y, 1, 1);
        g2d.fillRect(101 + x, 155 + y, 2, 1);
        g2d.fillRect(122 + x, 155 + y, 2, 1);
        g2d.fillRect(102 + x, 156 + y, 1, 4);
        g2d.fillRect(123 + x, 156 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 154 + y, 1, 1);
        g2d.fillRect(119 + x, 154 + y, 1, 1);
        g2d.fillRect(95 + x, 155 + y, 1, 2);
        g2d.fillRect(116 + x, 155 + y, 1, 1);
        g2d.fillRect(94 + x, 156 + y, 1, 1);
        g2d.fillRect(97 + x, 156 + y, 1, 1);
        g2d.fillRect(115 + x, 157 + y, 2, 1);
        g2d.fillRect(93 + x, 158 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 2, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 88 + y, 2, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 3);
        g2d.fillRect(116 + x, 88 + y, 2, 1);
        g2d.fillRect(100 + x, 89 + y, 3, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 7);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 5);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 3);
        g2d.fillRect(104 + x, 92 + y, 1, 3);
        g2d.fillRect(114 + x, 92 + y, 1, 10);
        g2d.fillRect(115 + x, 92 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 4);
        g2d.fillRect(117 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 94 + y, 1, 6);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 3);
        g2d.fillRect(118 + x, 95 + y, 1, 4);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(119 + x, 98 + y, 1, 19);
        g2d.fillRect(104 + x, 99 + y, 1, 7);
        g2d.fillRect(103 + x, 100 + y, 1, 9);
        g2d.fillRect(115 + x, 100 + y, 1, 11);
        g2d.fillRect(102 + x, 105 + y, 1, 9);
        g2d.fillRect(120 + x, 107 + y, 1, 4);
        g2d.fillRect(101 + x, 109 + y, 1, 6);
        g2d.fillRect(116 + x, 109 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 1, 4);
        g2d.fillRect(116 + x, 115 + y, 1, 3);
        g2d.fillRect(117 + x, 115 + y, 1, 3);
        g2d.fillRect(118 + x, 115 + y, 1, 3);
        g2d.fillRect(99 + x, 117 + y, 1, 4);
        g2d.fillRect(98 + x, 118 + y, 1, 3);
        g2d.fillRect(97 + x, 121 + y, 1, 1);
        g2d.fillRect(116 + x, 121 + y, 1, 4);
        g2d.fillRect(96 + x, 124 + y, 3, 1);
        g2d.fillRect(118 + x, 124 + y, 1, 1);
        g2d.fillRect(120 + x, 124 + y, 1, 1);
        g2d.fillRect(97 + x, 125 + y, 1, 3);
        g2d.fillRect(119 + x, 125 + y, 1, 3);
        g2d.fillRect(121 + x, 126 + y, 1, 2);
        g2d.fillRect(99 + x, 128 + y, 1, 5);
        g2d.fillRect(118 + x, 128 + y, 1, 5);
        g2d.fillRect(96 + x, 129 + y, 1, 7);
        g2d.fillRect(121 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 130 + y, 1, 7);
        g2d.fillRect(117 + x, 130 + y, 1, 8);
        g2d.fillRect(95 + x, 133 + y, 1, 7);
        g2d.fillRect(120 + x, 134 + y, 1, 4);
        g2d.fillRect(100 + x, 136 + y, 1, 13);
        g2d.fillRect(116 + x, 136 + y, 1, 5);
        g2d.fillRect(118 + x, 136 + y, 1, 1);
        g2d.fillRect(97 + x, 137 + y, 1, 4);
        g2d.fillRect(119 + x, 137 + y, 1, 1);
        g2d.fillRect(94 + x, 138 + y, 1, 5);
        g2d.fillRect(115 + x, 138 + y, 1, 7);
        g2d.fillRect(96 + x, 141 + y, 1, 3);
        g2d.fillRect(101 + x, 141 + y, 1, 3);
        g2d.fillRect(114 + x, 141 + y, 1, 4);
        g2d.fillRect(119 + x, 141 + y, 1, 3);
        g2d.fillRect(121 + x, 141 + y, 1, 6);
        g2d.fillRect(99 + x, 143 + y, 1, 1);
        g2d.fillRect(120 + x, 143 + y, 1, 1);
        g2d.fillRect(122 + x, 143 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 1, 1);
        g2d.fillRect(98 + x, 144 + y, 1, 3);
        g2d.fillRect(113 + x, 144 + y, 1, 3);
        g2d.fillRect(118 + x, 144 + y, 1, 3);
        g2d.fillRect(93 + x, 145 + y, 1, 3);
        g2d.fillRect(97 + x, 145 + y, 1, 2);
        g2d.fillRect(92 + x, 147 + y, 1, 1);
        g2d.fillRect(95 + x, 147 + y, 2, 1);
        g2d.fillRect(114 + x, 147 + y, 1, 2);
        g2d.fillRect(115 + x, 147 + y, 1, 1);
        g2d.fillRect(120 + x, 147 + y, 1, 2);
        g2d.fillRect(90 + x, 148 + y, 2, 1);
        g2d.fillRect(94 + x, 148 + y, 1, 1);
        g2d.fillRect(97 + x, 148 + y, 1, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 1);
        g2d.fillRect(99 + x, 149 + y, 1, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 1);
        g2d.fillRect(117 + x, 149 + y, 1, 1);
        g2d.fillRect(121 + x, 149 + y, 1, 1);
        g2d.fillRect(94 + x, 150 + y, 1, 2);
        g2d.fillRect(95 + x, 150 + y, 1, 1);
        g2d.fillRect(101 + x, 150 + y, 2, 1);
        g2d.fillRect(119 + x, 150 + y, 1, 2);
        g2d.fillRect(93 + x, 151 + y, 1, 1);
        g2d.fillRect(97 + x, 151 + y, 3, 1);
        g2d.fillRect(102 + x, 151 + y, 1, 3);
        g2d.fillRect(117 + x, 151 + y, 1, 2);
        g2d.fillRect(118 + x, 151 + y, 1, 1);
        g2d.fillRect(120 + x, 151 + y, 2, 1);
        g2d.fillRect(123 + x, 151 + y, 1, 1);
        g2d.fillRect(89 + x, 152 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 1);
        g2d.fillRect(101 + x, 152 + y, 1, 1);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(116 + x, 152 + y, 1, 1);
        g2d.fillRect(121 + x, 152 + y, 2, 1);
        g2d.fillRect(88 + x, 153 + y, 1, 2);
        g2d.fillRect(91 + x, 153 + y, 1, 1);
        g2d.fillRect(94 + x, 153 + y, 5, 1);
        g2d.fillRect(114 + x, 153 + y, 1, 2);
        g2d.fillRect(122 + x, 153 + y, 1, 1);
        g2d.fillRect(90 + x, 154 + y, 1, 1);
        g2d.fillRect(93 + x, 154 + y, 1, 1);
        g2d.fillRect(98 + x, 154 + y, 2, 1);
        g2d.fillRect(123 + x, 154 + y, 1, 1);
        g2d.fillRect(89 + x, 155 + y, 1, 1);
        g2d.fillRect(92 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 155 + y, 2, 1);
        g2d.fillRect(113 + x, 155 + y, 1, 1);
        g2d.fillRect(88 + x, 156 + y, 1, 2);
        g2d.fillRect(91 + x, 156 + y, 1, 1);
        g2d.fillRect(100 + x, 156 + y, 2, 1);
        g2d.fillRect(89 + x, 157 + y, 1, 2);
        g2d.fillRect(90 + x, 157 + y, 1, 3);
        g2d.fillRect(101 + x, 157 + y, 1, 3);
        g2d.fillRect(104 + x, 157 + y, 1, 1);
        g2d.fillRect(112 + x, 157 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 111 + y, 1, 3);
        g2d.fillRect(111 + x, 155 + y, 1, 2);
        g2d.fillRect(112 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 3, 1);
        g2d.fillRect(114 + x, 85 + y, 2, 1);
        g2d.fillRect(103 + x, 86 + y, 3, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 2, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 2, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 3, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 91 + y, 1, 9);
        g2d.fillRect(104 + x, 91 + y, 3, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 6);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 5);
        g2d.fillRect(116 + x, 96 + y, 1, 13);
        g2d.fillRect(102 + x, 98 + y, 1, 7);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 2);
        g2d.fillRect(101 + x, 99 + y, 1, 10);
        g2d.fillRect(118 + x, 99 + y, 1, 16);
        g2d.fillRect(99 + x, 100 + y, 1, 5);
        g2d.fillRect(98 + x, 106 + y, 1, 8);
        g2d.fillRect(100 + x, 106 + y, 1, 8);
        g2d.fillRect(117 + x, 109 + y, 1, 4);
        g2d.fillRect(116 + x, 111 + y, 1, 4);
        g2d.fillRect(99 + x, 113 + y, 1, 4);
        g2d.fillRect(97 + x, 114 + y, 1, 7);
        g2d.fillRect(115 + x, 114 + y, 1, 7);
        g2d.fillRect(117 + x, 114 + y, 1, 1);
        g2d.fillRect(96 + x, 117 + y, 1, 5);
        g2d.fillRect(98 + x, 117 + y, 1, 1);
        g2d.fillRect(114 + x, 117 + y, 1, 12);
        g2d.fillRect(116 + x, 118 + y, 1, 3);
        g2d.fillRect(95 + x, 119 + y, 1, 14);
        g2d.fillRect(94 + x, 122 + y, 1, 7);
        g2d.fillRect(96 + x, 125 + y, 1, 4);
        g2d.fillRect(115 + x, 125 + y, 1, 11);
        g2d.fillRect(119 + x, 128 + y, 1, 5);
        g2d.fillRect(120 + x, 128 + y, 1, 1);
        g2d.fillRect(93 + x, 129 + y, 1, 5);
        g2d.fillRect(113 + x, 129 + y, 1, 7);
        g2d.fillRect(120 + x, 130 + y, 1, 4);
        g2d.fillRect(94 + x, 133 + y, 1, 5);
        g2d.fillRect(99 + x, 133 + y, 1, 5);
        g2d.fillRect(118 + x, 133 + y, 1, 3);
        g2d.fillRect(114 + x, 134 + y, 1, 7);
        g2d.fillRect(119 + x, 134 + y, 1, 3);
        g2d.fillRect(92 + x, 136 + y, 1, 4);
        g2d.fillRect(98 + x, 137 + y, 1, 7);
        g2d.fillRect(118 + x, 137 + y, 1, 3);
        g2d.fillRect(93 + x, 138 + y, 1, 7);
        g2d.fillRect(113 + x, 138 + y, 1, 6);
        g2d.fillRect(117 + x, 138 + y, 1, 5);
        g2d.fillRect(120 + x, 138 + y, 1, 5);
        g2d.fillRect(91 + x, 141 + y, 1, 7);
        g2d.fillRect(97 + x, 141 + y, 1, 2);
        g2d.fillRect(112 + x, 141 + y, 1, 6);
        g2d.fillRect(116 + x, 141 + y, 1, 3);
        g2d.fillRect(92 + x, 144 + y, 1, 3);
        g2d.fillRect(96 + x, 144 + y, 1, 3);
        g2d.fillRect(97 + x, 144 + y, 1, 1);
        g2d.fillRect(119 + x, 144 + y, 1, 4);
        g2d.fillRect(120 + x, 144 + y, 1, 3);
        g2d.fillRect(95 + x, 145 + y, 1, 2);
        g2d.fillRect(114 + x, 145 + y, 1, 2);
        g2d.fillRect(90 + x, 147 + y, 1, 1);
        g2d.fillRect(94 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 147 + y, 1, 2);
        g2d.fillRect(116 + x, 147 + y, 1, 2);
        g2d.fillRect(98 + x, 148 + y, 1, 1);
        g2d.fillRect(115 + x, 148 + y, 1, 2);
        g2d.fillRect(117 + x, 148 + y, 2, 1);
        g2d.fillRect(96 + x, 149 + y, 1, 3);
        g2d.fillRect(113 + x, 149 + y, 1, 2);
        g2d.fillRect(114 + x, 149 + y, 1, 1);
        g2d.fillRect(118 + x, 149 + y, 1, 2);
        g2d.fillRect(119 + x, 149 + y, 2, 1);
        g2d.fillRect(97 + x, 150 + y, 3, 1);
        g2d.fillRect(111 + x, 150 + y, 2, 1);
        g2d.fillRect(116 + x, 150 + y, 2, 1);
        g2d.fillRect(120 + x, 150 + y, 3, 1);
        g2d.fillRect(95 + x, 151 + y, 1, 2);
        g2d.fillRect(100 + x, 151 + y, 2, 1);
        g2d.fillRect(114 + x, 151 + y, 2, 1);
        g2d.fillRect(122 + x, 151 + y, 1, 1);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(113 + x, 152 + y, 1, 3);
        g2d.fillRect(123 + x, 152 + y, 1, 2);
        g2d.fillRect(112 + x, 153 + y, 1, 3);
        g2d.fillRect(91 + x, 154 + y, 1, 2);
        g2d.fillRect(92 + x, 154 + y, 1, 1);
        g2d.fillRect(111 + x, 154 + y, 1, 1);
        g2d.fillRect(90 + x, 155 + y, 1, 2);
        g2d.fillRect(89 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(99 + x, 111 + y, 1, 2);
        g2d.fillRect(117 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 114 + y, 1, 3);
        g2d.fillRect(115 + x, 121 + y, 1, 4);
        g2d.fillRect(94 + x, 129 + y, 1, 4);
        g2d.fillRect(114 + x, 129 + y, 1, 5);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(93 + x, 134 + y, 1, 4);
        g2d.fillRect(113 + x, 136 + y, 1, 2);
        g2d.fillRect(99 + x, 138 + y, 1, 5);
        g2d.fillRect(92 + x, 140 + y, 1, 4);
        g2d.fillRect(97 + x, 143 + y, 1, 1);
        g2d.fillRect(117 + x, 147 + y, 2, 1);
        g2d.fillRect(97 + x, 149 + y, 2, 1);
        g2d.fillRect(100 + x, 150 + y, 1, 1);
        g2d.fillRect(116 + x, 151 + y, 1, 1);
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(114 + x, 152 + y, 1, 1);
        g2d.fillRect(92 + x, 153 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 95 + y, 1, 3);
        g2d.fillRect(101 + x, 96 + y, 1, 3);
        g2d.fillRect(100 + x, 98 + y, 1, 8);
        g2d.fillRect(117 + x, 100 + y, 1, 9);
        g2d.fillRect(99 + x, 105 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
    }

}
