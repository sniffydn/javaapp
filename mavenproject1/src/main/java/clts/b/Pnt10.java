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
public class Pnt10 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt10()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt10(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt10(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt10(int layer, ColorArray colorSwitch)
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
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 2, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 3);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 114 + y, 1, 3);
        g2d.fillRect(114 + x, 114 + y, 1, 4);
        g2d.fillRect(96 + x, 115 + y, 1, 3);
        g2d.fillRect(120 + x, 115 + y, 1, 3);
        g2d.fillRect(102 + x, 117 + y, 1, 1);
        g2d.fillRect(95 + x, 120 + y, 1, 1);
        g2d.fillRect(102 + x, 120 + y, 1, 1);
        g2d.fillRect(113 + x, 120 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 2, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 11, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 5);
        g2d.fillRect(111 + x, 85 + y, 1, 4);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 16);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 3, 1);
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 13);
        g2d.fillRect(112 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 3);
        g2d.fillRect(113 + x, 96 + y, 1, 2);
        g2d.fillRect(106 + x, 99 + y, 1, 3);
        g2d.fillRect(113 + x, 99 + y, 1, 6);
        g2d.fillRect(105 + x, 102 + y, 1, 5);
        g2d.fillRect(120 + x, 102 + y, 1, 13);
        g2d.fillRect(98 + x, 103 + y, 1, 6);
        g2d.fillRect(114 + x, 105 + y, 1, 9);
        g2d.fillRect(104 + x, 107 + y, 1, 4);
        g2d.fillRect(97 + x, 109 + y, 1, 6);
        g2d.fillRect(103 + x, 111 + y, 1, 3);
        g2d.fillRect(96 + x, 114 + y, 1, 1);
        g2d.fillRect(101 + x, 115 + y, 1, 2);
        g2d.fillRect(102 + x, 115 + y, 1, 2);
        g2d.fillRect(115 + x, 115 + y, 1, 2);
        g2d.fillRect(100 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 117 + y, 1, 1);
        g2d.fillRect(96 + x, 118 + y, 1, 2);
        g2d.fillRect(101 + x, 118 + y, 1, 2);
        g2d.fillRect(102 + x, 118 + y, 1, 2);
        g2d.fillRect(114 + x, 118 + y, 1, 3);
        g2d.fillRect(115 + x, 118 + y, 1, 2);
        g2d.fillRect(120 + x, 118 + y, 1, 6);
        g2d.fillRect(95 + x, 121 + y, 1, 1);
        g2d.fillRect(101 + x, 121 + y, 2, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(94 + x, 122 + y, 1, 4);
        g2d.fillRect(100 + x, 122 + y, 1, 2);
        g2d.fillRect(102 + x, 122 + y, 1, 2);
        g2d.fillRect(113 + x, 122 + y, 1, 11);
        g2d.fillRect(114 + x, 122 + y, 1, 2);
        g2d.fillRect(101 + x, 124 + y, 1, 6);
        g2d.fillRect(121 + x, 124 + y, 1, 9);
        g2d.fillRect(114 + x, 125 + y, 1, 1);
        g2d.fillRect(93 + x, 126 + y, 1, 7);
        g2d.fillRect(100 + x, 126 + y, 1, 2);
        g2d.fillRect(100 + x, 129 + y, 1, 12);
        g2d.fillRect(92 + x, 132 + y, 1, 7);
        g2d.fillRect(112 + x, 132 + y, 1, 15);
        g2d.fillRect(122 + x, 133 + y, 1, 11);
        g2d.fillRect(91 + x, 139 + y, 1, 8);
        g2d.fillRect(101 + x, 141 + y, 1, 13);
        g2d.fillRect(123 + x, 144 + y, 1, 10);
        g2d.fillRect(90 + x, 147 + y, 1, 7);
        g2d.fillRect(111 + x, 147 + y, 1, 9);
        g2d.fillRect(89 + x, 154 + y, 1, 8);
        g2d.fillRect(102 + x, 154 + y, 1, 8);
        g2d.fillRect(124 + x, 154 + y, 1, 8);
        g2d.fillRect(110 + x, 156 + y, 1, 6);
        g2d.fillRect(123 + x, 160 + y, 1, 3);
        g2d.fillRect(100 + x, 162 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 130 + y, 1, 3);
        g2d.fillRect(94 + x, 132 + y, 1, 1);
        g2d.fillRect(99 + x, 132 + y, 1, 1);
        g2d.fillRect(114 + x, 132 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 83 + y, 1, 3);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 3, 1);
        g2d.fillRect(116 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(112 + x, 85 + y, 1, 5);
        g2d.fillRect(100 + x, 87 + y, 1, 13);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 3, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 13);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 3, 1);
        g2d.fillRect(114 + x, 90 + y, 2, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 10);
        g2d.fillRect(106 + x, 96 + y, 1, 3);
        g2d.fillRect(105 + x, 99 + y, 1, 3);
        g2d.fillRect(99 + x, 103 + y, 1, 6);
        g2d.fillRect(104 + x, 103 + y, 1, 4);
        g2d.fillRect(119 + x, 105 + y, 1, 19);
        g2d.fillRect(115 + x, 106 + y, 1, 9);
        g2d.fillRect(103 + x, 107 + y, 1, 4);
        g2d.fillRect(98 + x, 109 + y, 1, 6);
        g2d.fillRect(102 + x, 113 + y, 1, 2);
        g2d.fillRect(97 + x, 115 + y, 1, 5);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(115 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 118 + y, 1, 4);
        g2d.fillRect(116 + x, 118 + y, 1, 6);
        g2d.fillRect(96 + x, 120 + y, 1, 4);
        g2d.fillRect(101 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 120 + y, 1, 1);
        g2d.fillRect(114 + x, 121 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 1, 6);
        g2d.fillRect(101 + x, 122 + y, 1, 2);
        g2d.fillRect(115 + x, 122 + y, 1, 10);
        g2d.fillRect(100 + x, 124 + y, 1, 2);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(120 + x, 124 + y, 1, 6);
        g2d.fillRect(99 + x, 125 + y, 1, 7);
        g2d.fillRect(94 + x, 126 + y, 1, 6);
        g2d.fillRect(114 + x, 126 + y, 1, 6);
        g2d.fillRect(100 + x, 128 + y, 1, 1);
        g2d.fillRect(93 + x, 133 + y, 1, 6);
        g2d.fillRect(99 + x, 133 + y, 1, 21);
        g2d.fillRect(113 + x, 133 + y, 1, 14);
        g2d.fillRect(114 + x, 133 + y, 1, 3);
        g2d.fillRect(121 + x, 133 + y, 1, 11);
        g2d.fillRect(92 + x, 139 + y, 1, 8);
        g2d.fillRect(98 + x, 139 + y, 1, 9);
        g2d.fillRect(100 + x, 141 + y, 1, 13);
        g2d.fillRect(97 + x, 144 + y, 1, 4);
        g2d.fillRect(122 + x, 144 + y, 1, 16);
        g2d.fillRect(91 + x, 147 + y, 1, 8);
        g2d.fillRect(96 + x, 147 + y, 1, 2);
        g2d.fillRect(112 + x, 147 + y, 1, 16);
        g2d.fillRect(95 + x, 148 + y, 1, 3);
        g2d.fillRect(93 + x, 149 + y, 1, 2);
        g2d.fillRect(94 + x, 149 + y, 1, 2);
        g2d.fillRect(98 + x, 149 + y, 1, 6);
        g2d.fillRect(118 + x, 151 + y, 1, 3);
        g2d.fillRect(119 + x, 151 + y, 1, 3);
        g2d.fillRect(96 + x, 152 + y, 1, 4);
        g2d.fillRect(97 + x, 152 + y, 1, 3);
        g2d.fillRect(116 + x, 152 + y, 1, 2);
        g2d.fillRect(117 + x, 152 + y, 1, 2);
        g2d.fillRect(120 + x, 152 + y, 1, 3);
        g2d.fillRect(121 + x, 152 + y, 1, 4);
        g2d.fillRect(90 + x, 154 + y, 1, 9);
        g2d.fillRect(95 + x, 154 + y, 1, 2);
        g2d.fillRect(101 + x, 154 + y, 1, 8);
        g2d.fillRect(123 + x, 154 + y, 1, 6);
        g2d.fillRect(93 + x, 155 + y, 2, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 7);
        g2d.fillRect(113 + x, 156 + y, 1, 4);
        g2d.fillRect(114 + x, 156 + y, 1, 4);
        g2d.fillRect(115 + x, 156 + y, 1, 3);
        g2d.fillRect(116 + x, 156 + y, 1, 3);
        g2d.fillRect(117 + x, 156 + y, 1, 3);
        g2d.fillRect(91 + x, 158 + y, 1, 4);
        g2d.fillRect(92 + x, 158 + y, 1, 2);
        g2d.fillRect(93 + x, 158 + y, 1, 2);
        g2d.fillRect(94 + x, 158 + y, 1, 2);
        g2d.fillRect(95 + x, 158 + y, 1, 2);
        g2d.fillRect(96 + x, 158 + y, 1, 2);
        g2d.fillRect(97 + x, 158 + y, 1, 2);
        g2d.fillRect(98 + x, 158 + y, 1, 2);
        g2d.fillRect(118 + x, 158 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(92 + x, 163 + y, 1, 1);
        g2d.fillRect(93 + x, 164 + y, 6, 1);
        g2d.fillRect(115 + x, 164 + y, 6, 1);
        g2d.fillRect(94 + x, 165 + y, 4, 1);
        g2d.fillRect(116 + x, 165 + y, 4, 1);
        g2d.fillRect(95 + x, 166 + y, 2, 1);
        g2d.fillRect(117 + x, 166 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 84 + y, 1, 4);
        g2d.fillRect(119 + x, 84 + y, 1, 4);
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 3, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 4);
        g2d.fillRect(114 + x, 85 + y, 1, 3);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 6);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 3);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 2);
        g2d.fillRect(101 + x, 89 + y, 3, 1);
        g2d.fillRect(114 + x, 89 + y, 2, 1);
        g2d.fillRect(118 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 13);
        g2d.fillRect(104 + x, 92 + y, 1, 3);
        g2d.fillRect(117 + x, 92 + y, 1, 3);
        g2d.fillRect(119 + x, 92 + y, 1, 13);
        g2d.fillRect(105 + x, 94 + y, 1, 5);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(114 + x, 94 + y, 3, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 11);
        g2d.fillRect(104 + x, 96 + y, 1, 7);
        g2d.fillRect(116 + x, 96 + y, 1, 9);
        g2d.fillRect(103 + x, 99 + y, 1, 8);
        g2d.fillRect(117 + x, 99 + y, 1, 7);
        g2d.fillRect(100 + x, 100 + y, 1, 9);
        g2d.fillRect(102 + x, 102 + y, 1, 3);
        g2d.fillRect(118 + x, 103 + y, 1, 10);
        g2d.fillRect(102 + x, 106 + y, 1, 7);
        g2d.fillRect(101 + x, 107 + y, 1, 8);
        g2d.fillRect(116 + x, 107 + y, 1, 10);
        g2d.fillRect(117 + x, 107 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 1, 4);
        g2d.fillRect(100 + x, 110 + y, 1, 4);
        g2d.fillRect(117 + x, 110 + y, 1, 4);
        g2d.fillRect(98 + x, 115 + y, 1, 24);
        g2d.fillRect(99 + x, 115 + y, 1, 10);
        g2d.fillRect(100 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 115 + y, 1, 21);
        g2d.fillRect(118 + x, 115 + y, 1, 18);
        g2d.fillRect(97 + x, 120 + y, 1, 24);
        g2d.fillRect(96 + x, 124 + y, 1, 12);
        g2d.fillRect(116 + x, 124 + y, 1, 17);
        g2d.fillRect(119 + x, 124 + y, 1, 10);
        g2d.fillRect(95 + x, 128 + y, 1, 9);
        g2d.fillRect(94 + x, 133 + y, 1, 11);
        g2d.fillRect(115 + x, 133 + y, 1, 15);
        g2d.fillRect(120 + x, 133 + y, 1, 19);
        g2d.fillRect(114 + x, 136 + y, 1, 20);
        g2d.fillRect(118 + x, 136 + y, 1, 5);
        g2d.fillRect(119 + x, 136 + y, 1, 7);
        g2d.fillRect(96 + x, 137 + y, 1, 10);
        g2d.fillRect(93 + x, 139 + y, 1, 10);
        g2d.fillRect(95 + x, 144 + y, 1, 4);
        g2d.fillRect(119 + x, 144 + y, 1, 7);
        g2d.fillRect(121 + x, 144 + y, 1, 8);
        g2d.fillRect(94 + x, 145 + y, 1, 4);
        g2d.fillRect(92 + x, 147 + y, 1, 5);
        g2d.fillRect(113 + x, 147 + y, 1, 9);
        g2d.fillRect(97 + x, 148 + y, 1, 4);
        g2d.fillRect(98 + x, 148 + y, 1, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 4);
        g2d.fillRect(118 + x, 148 + y, 1, 3);
        g2d.fillRect(96 + x, 149 + y, 1, 3);
        g2d.fillRect(116 + x, 149 + y, 1, 3);
        g2d.fillRect(93 + x, 151 + y, 2, 1);
        g2d.fillRect(95 + x, 152 + y, 1, 2);
        g2d.fillRect(115 + x, 152 + y, 1, 4);
        g2d.fillRect(92 + x, 154 + y, 1, 4);
        g2d.fillRect(93 + x, 154 + y, 2, 1);
        g2d.fillRect(99 + x, 154 + y, 1, 2);
        g2d.fillRect(100 + x, 154 + y, 1, 5);
        g2d.fillRect(116 + x, 154 + y, 1, 2);
        g2d.fillRect(117 + x, 154 + y, 3, 1);
        g2d.fillRect(91 + x, 155 + y, 1, 3);
        g2d.fillRect(97 + x, 155 + y, 1, 3);
        g2d.fillRect(98 + x, 155 + y, 1, 3);
        g2d.fillRect(119 + x, 155 + y, 2, 1);
        g2d.fillRect(93 + x, 156 + y, 1, 2);
        g2d.fillRect(94 + x, 156 + y, 1, 2);
        g2d.fillRect(95 + x, 156 + y, 1, 2);
        g2d.fillRect(96 + x, 156 + y, 1, 2);
        g2d.fillRect(120 + x, 156 + y, 1, 3);
        g2d.fillRect(121 + x, 156 + y, 1, 9);
        g2d.fillRect(115 + x, 159 + y, 1, 5);
        g2d.fillRect(116 + x, 159 + y, 2, 1);
        g2d.fillRect(119 + x, 159 + y, 1, 3);
        g2d.fillRect(92 + x, 160 + y, 1, 3);
        g2d.fillRect(93 + x, 160 + y, 1, 4);
        g2d.fillRect(94 + x, 160 + y, 1, 2);
        g2d.fillRect(95 + x, 160 + y, 1, 2);
        g2d.fillRect(96 + x, 160 + y, 1, 2);
        g2d.fillRect(97 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 1, 2);
        g2d.fillRect(113 + x, 160 + y, 1, 3);
        g2d.fillRect(114 + x, 160 + y, 1, 4);
        g2d.fillRect(117 + x, 160 + y, 1, 2);
        g2d.fillRect(118 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 160 + y, 1, 3);
        g2d.fillRect(91 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 1, 2);
        g2d.fillRect(99 + x, 162 + y, 1, 2);
        g2d.fillRect(94 + x, 163 + y, 4, 1);
        g2d.fillRect(116 + x, 163 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 3, 1);
        g2d.fillRect(115 + x, 91 + y, 2, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 7);
        g2d.fillRect(118 + x, 92 + y, 1, 11);
        g2d.fillRect(102 + x, 95 + y, 1, 7);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 2, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 3);
        g2d.fillRect(101 + x, 105 + y, 1, 2);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 113 + y, 1, 2);
        g2d.fillRect(118 + x, 113 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 1);
        g2d.fillRect(118 + x, 133 + y, 1, 3);
        g2d.fillRect(119 + x, 134 + y, 1, 2);
        g2d.fillRect(96 + x, 136 + y, 1, 1);
        g2d.fillRect(117 + x, 136 + y, 1, 12);
        g2d.fillRect(95 + x, 137 + y, 1, 7);
        g2d.fillRect(116 + x, 141 + y, 1, 8);
        g2d.fillRect(118 + x, 141 + y, 1, 7);
        g2d.fillRect(119 + x, 143 + y, 1, 1);
        g2d.fillRect(94 + x, 144 + y, 1, 1);
        g2d.fillRect(115 + x, 148 + y, 1, 4);
        g2d.fillRect(95 + x, 151 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 2);
        g2d.fillRect(93 + x, 152 + y, 1, 2);
        g2d.fillRect(94 + x, 152 + y, 1, 2);
        g2d.fillRect(117 + x, 155 + y, 2, 1);
        g2d.fillRect(118 + x, 156 + y, 1, 2);
        g2d.fillRect(119 + x, 156 + y, 1, 3);
        g2d.fillRect(99 + x, 159 + y, 1, 3);
        g2d.fillRect(100 + x, 159 + y, 1, 1);
        g2d.fillRect(120 + x, 159 + y, 1, 4);
        g2d.fillRect(98 + x, 160 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 3);
        g2d.fillRect(94 + x, 162 + y, 4, 1);
        g2d.fillRect(117 + x, 162 + y, 3, 1);
    }

}
