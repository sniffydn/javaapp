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
public class Pnt9 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt9()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt9(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt9(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt9(int layer, ColorArray colorSwitch)
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
        g2d.fillRect(100 + x, 82 + y, 1, 4);
        g2d.fillRect(101 + x, 82 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 4, 1);
        g2d.fillRect(104 + x, 83 + y, 6, 1);
        g2d.fillRect(112 + x, 83 + y, 6, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 17);
        g2d.fillRect(101 + x, 84 + y, 3, 1);
        g2d.fillRect(118 + x, 84 + y, 3, 1);
        g2d.fillRect(104 + x, 85 + y, 2, 1);
        g2d.fillRect(107 + x, 85 + y, 8, 1);
        g2d.fillRect(116 + x, 85 + y, 2, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 16);
        g2d.fillRect(110 + x, 86 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 3, 1);
        g2d.fillRect(107 + x, 91 + y, 2, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 11);
        g2d.fillRect(107 + x, 94 + y, 1, 4);
        g2d.fillRect(106 + x, 98 + y, 1, 2);
        g2d.fillRect(105 + x, 100 + y, 1, 5);
        g2d.fillRect(114 + x, 100 + y, 1, 17);
        g2d.fillRect(120 + x, 100 + y, 1, 21);
        g2d.fillRect(98 + x, 102 + y, 1, 6);
        g2d.fillRect(104 + x, 105 + y, 1, 4);
        g2d.fillRect(97 + x, 108 + y, 1, 4);
        g2d.fillRect(103 + x, 109 + y, 1, 6);
        g2d.fillRect(96 + x, 112 + y, 1, 7);
        g2d.fillRect(102 + x, 115 + y, 1, 6);
        g2d.fillRect(95 + x, 117 + y, 1, 4);
        g2d.fillRect(113 + x, 117 + y, 1, 16);
        g2d.fillRect(94 + x, 121 + y, 1, 6);
        g2d.fillRect(101 + x, 121 + y, 1, 7);
        g2d.fillRect(121 + x, 121 + y, 1, 11);
        g2d.fillRect(93 + x, 127 + y, 1, 3);
        g2d.fillRect(100 + x, 128 + y, 1, 10);
        g2d.fillRect(92 + x, 130 + y, 1, 6);
        g2d.fillRect(122 + x, 132 + y, 1, 9);
        g2d.fillRect(112 + x, 133 + y, 1, 11);
        g2d.fillRect(91 + x, 136 + y, 1, 8);
        g2d.fillRect(101 + x, 138 + y, 1, 12);
        g2d.fillRect(123 + x, 141 + y, 1, 9);
        g2d.fillRect(90 + x, 144 + y, 1, 6);
        g2d.fillRect(111 + x, 144 + y, 1, 9);
        g2d.fillRect(89 + x, 150 + y, 1, 9);
        g2d.fillRect(102 + x, 150 + y, 1, 9);
        g2d.fillRect(124 + x, 150 + y, 1, 8);
        g2d.fillRect(110 + x, 153 + y, 1, 6);
        g2d.fillRect(123 + x, 157 + y, 1, 4);
        g2d.fillRect(90 + x, 159 + y, 1, 2);
        g2d.fillRect(101 + x, 159 + y, 1, 2);
        g2d.fillRect(111 + x, 159 + y, 1, 2);
        g2d.fillRect(91 + x, 161 + y, 10, 1);
        g2d.fillRect(112 + x, 161 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 83 + y, 2, 1);
        g2d.fillRect(118 + x, 83 + y, 3, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 4);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 4, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 12);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 3, 1);
        g2d.fillRect(107 + x, 90 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 3, 1);
        g2d.fillRect(117 + x, 90 + y, 4, 1);
        g2d.fillRect(104 + x, 91 + y, 3, 1);
        g2d.fillRect(113 + x, 91 + y, 3, 1);
        g2d.fillRect(119 + x, 91 + y, 2, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 6);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 8);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(120 + x, 92 + y, 1, 8);
        g2d.fillRect(105 + x, 94 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(104 + x, 100 + y, 1, 5);
        g2d.fillRect(119 + x, 100 + y, 1, 21);
        g2d.fillRect(99 + x, 102 + y, 1, 6);
        g2d.fillRect(115 + x, 103 + y, 1, 14);
        g2d.fillRect(103 + x, 105 + y, 1, 4);
        g2d.fillRect(98 + x, 108 + y, 1, 4);
        g2d.fillRect(102 + x, 109 + y, 1, 6);
        g2d.fillRect(97 + x, 112 + y, 1, 7);
        g2d.fillRect(101 + x, 115 + y, 1, 6);
        g2d.fillRect(114 + x, 117 + y, 1, 16);
        g2d.fillRect(96 + x, 119 + y, 1, 4);
        g2d.fillRect(95 + x, 121 + y, 1, 6);
        g2d.fillRect(100 + x, 121 + y, 1, 7);
        g2d.fillRect(120 + x, 121 + y, 1, 7);
        g2d.fillRect(94 + x, 127 + y, 1, 5);
        g2d.fillRect(99 + x, 129 + y, 1, 21);
        g2d.fillRect(120 + x, 129 + y, 1, 3);
        g2d.fillRect(93 + x, 130 + y, 1, 6);
        g2d.fillRect(121 + x, 132 + y, 1, 9);
        g2d.fillRect(113 + x, 133 + y, 1, 11);
        g2d.fillRect(92 + x, 136 + y, 1, 8);
        g2d.fillRect(98 + x, 136 + y, 1, 9);
        g2d.fillRect(100 + x, 138 + y, 1, 12);
        g2d.fillRect(97 + x, 141 + y, 1, 4);
        g2d.fillRect(122 + x, 141 + y, 1, 20);
        g2d.fillRect(91 + x, 144 + y, 1, 8);
        g2d.fillRect(96 + x, 144 + y, 1, 2);
        g2d.fillRect(112 + x, 144 + y, 1, 17);
        g2d.fillRect(95 + x, 145 + y, 1, 3);
        g2d.fillRect(93 + x, 146 + y, 1, 2);
        g2d.fillRect(94 + x, 146 + y, 1, 2);
        g2d.fillRect(98 + x, 146 + y, 1, 6);
        g2d.fillRect(118 + x, 148 + y, 1, 2);
        g2d.fillRect(119 + x, 148 + y, 1, 2);
        g2d.fillRect(96 + x, 149 + y, 1, 4);
        g2d.fillRect(97 + x, 149 + y, 1, 3);
        g2d.fillRect(116 + x, 149 + y, 2, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 3);
        g2d.fillRect(121 + x, 149 + y, 1, 4);
        g2d.fillRect(90 + x, 150 + y, 1, 9);
        g2d.fillRect(95 + x, 150 + y, 1, 3);
        g2d.fillRect(101 + x, 150 + y, 1, 9);
        g2d.fillRect(123 + x, 150 + y, 1, 7);
        g2d.fillRect(93 + x, 152 + y, 2, 1);
        g2d.fillRect(99 + x, 153 + y, 1, 2);
        g2d.fillRect(111 + x, 153 + y, 1, 6);
        g2d.fillRect(113 + x, 153 + y, 1, 4);
        g2d.fillRect(114 + x, 153 + y, 1, 4);
        g2d.fillRect(115 + x, 153 + y, 1, 2);
        g2d.fillRect(116 + x, 153 + y, 1, 2);
        g2d.fillRect(91 + x, 154 + y, 1, 7);
        g2d.fillRect(92 + x, 154 + y, 1, 3);
        g2d.fillRect(93 + x, 154 + y, 1, 3);
        g2d.fillRect(94 + x, 154 + y, 1, 3);
        g2d.fillRect(95 + x, 154 + y, 1, 3);
        g2d.fillRect(96 + x, 154 + y, 1, 3);
        g2d.fillRect(97 + x, 154 + y, 1, 3);
        g2d.fillRect(98 + x, 154 + y, 1, 3);
        g2d.fillRect(117 + x, 154 + y, 2, 1);
        g2d.fillRect(118 + x, 155 + y, 1, 2);
        g2d.fillRect(92 + x, 159 + y, 1, 2);
        g2d.fillRect(93 + x, 159 + y, 1, 2);
        g2d.fillRect(94 + x, 159 + y, 1, 2);
        g2d.fillRect(95 + x, 159 + y, 1, 2);
        g2d.fillRect(96 + x, 159 + y, 1, 2);
        g2d.fillRect(97 + x, 159 + y, 1, 2);
        g2d.fillRect(98 + x, 159 + y, 1, 2);
        g2d.fillRect(99 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 1, 2);
        g2d.fillRect(113 + x, 159 + y, 1, 2);
        g2d.fillRect(114 + x, 159 + y, 1, 2);
        g2d.fillRect(115 + x, 159 + y, 1, 2);
        g2d.fillRect(116 + x, 159 + y, 1, 2);
        g2d.fillRect(117 + x, 159 + y, 1, 2);
        g2d.fillRect(118 + x, 159 + y, 1, 2);
        g2d.fillRect(119 + x, 159 + y, 1, 2);
        g2d.fillRect(120 + x, 159 + y, 1, 2);
        g2d.fillRect(121 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 128 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 4, 1);
        g2d.fillRect(114 + x, 84 + y, 4, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 3);
        g2d.fillRect(112 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 86 + y, 1, 4);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 3);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 91 + y, 1, 3);
        g2d.fillRect(117 + x, 91 + y, 2, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 6);
        g2d.fillRect(104 + x, 92 + y, 1, 8);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 8);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 3);
        g2d.fillRect(115 + x, 97 + y, 1, 6);
        g2d.fillRect(116 + x, 98 + y, 1, 7);
        g2d.fillRect(101 + x, 99 + y, 1, 3);
        g2d.fillRect(103 + x, 100 + y, 1, 5);
        g2d.fillRect(118 + x, 100 + y, 1, 27);
        g2d.fillRect(100 + x, 102 + y, 1, 6);
        g2d.fillRect(102 + x, 103 + y, 1, 6);
        g2d.fillRect(99 + x, 108 + y, 1, 4);
        g2d.fillRect(101 + x, 109 + y, 1, 6);
        g2d.fillRect(116 + x, 109 + y, 1, 6);
        g2d.fillRect(98 + x, 112 + y, 1, 8);
        g2d.fillRect(100 + x, 113 + y, 1, 8);
        g2d.fillRect(115 + x, 117 + y, 1, 21);
        g2d.fillRect(97 + x, 119 + y, 1, 5);
        g2d.fillRect(99 + x, 121 + y, 1, 8);
        g2d.fillRect(119 + x, 121 + y, 1, 7);
        g2d.fillRect(96 + x, 123 + y, 1, 2);
        g2d.fillRect(95 + x, 127 + y, 1, 7);
        g2d.fillRect(117 + x, 127 + y, 1, 1);
        g2d.fillRect(98 + x, 128 + y, 1, 8);
        g2d.fillRect(116 + x, 129 + y, 1, 7);
        g2d.fillRect(119 + x, 129 + y, 1, 11);
        g2d.fillRect(118 + x, 130 + y, 1, 8);
        g2d.fillRect(94 + x, 132 + y, 1, 9);
        g2d.fillRect(120 + x, 132 + y, 1, 17);
        g2d.fillRect(97 + x, 133 + y, 1, 8);
        g2d.fillRect(114 + x, 133 + y, 1, 5);
        g2d.fillRect(96 + x, 134 + y, 1, 10);
        g2d.fillRect(93 + x, 136 + y, 1, 10);
        g2d.fillRect(114 + x, 140 + y, 1, 13);
        g2d.fillRect(95 + x, 141 + y, 1, 4);
        g2d.fillRect(115 + x, 141 + y, 1, 4);
        g2d.fillRect(119 + x, 141 + y, 1, 7);
        g2d.fillRect(121 + x, 141 + y, 1, 8);
        g2d.fillRect(94 + x, 142 + y, 1, 4);
        g2d.fillRect(92 + x, 144 + y, 1, 5);
        g2d.fillRect(113 + x, 144 + y, 1, 9);
        g2d.fillRect(97 + x, 145 + y, 1, 4);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(117 + x, 145 + y, 1, 4);
        g2d.fillRect(118 + x, 145 + y, 1, 3);
        g2d.fillRect(96 + x, 146 + y, 1, 3);
        g2d.fillRect(116 + x, 146 + y, 1, 3);
        g2d.fillRect(93 + x, 148 + y, 2, 1);
        g2d.fillRect(95 + x, 149 + y, 1, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 4);
        g2d.fillRect(92 + x, 150 + y, 1, 4);
        g2d.fillRect(93 + x, 150 + y, 1, 2);
        g2d.fillRect(94 + x, 150 + y, 1, 2);
        g2d.fillRect(99 + x, 150 + y, 1, 3);
        g2d.fillRect(100 + x, 150 + y, 1, 5);
        g2d.fillRect(116 + x, 150 + y, 1, 3);
        g2d.fillRect(117 + x, 150 + y, 1, 2);
        g2d.fillRect(118 + x, 150 + y, 1, 2);
        g2d.fillRect(119 + x, 150 + y, 1, 3);
        g2d.fillRect(91 + x, 152 + y, 1, 2);
        g2d.fillRect(97 + x, 152 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 2);
        g2d.fillRect(120 + x, 152 + y, 1, 3);
        g2d.fillRect(93 + x, 153 + y, 4, 1);
        g2d.fillRect(121 + x, 153 + y, 1, 6);
        g2d.fillRect(115 + x, 155 + y, 1, 4);
        g2d.fillRect(116 + x, 155 + y, 1, 2);
        g2d.fillRect(117 + x, 155 + y, 1, 3);
        g2d.fillRect(119 + x, 155 + y, 1, 3);
        g2d.fillRect(92 + x, 157 + y, 1, 2);
        g2d.fillRect(97 + x, 157 + y, 1, 2);
        g2d.fillRect(113 + x, 157 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(93 + x, 158 + y, 4, 1);
        g2d.fillRect(98 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 98 + y, 3, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(93 + x, 162 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 1, 1);
        g2d.fillRect(94 + x, 163 + y, 1, 1);
        g2d.fillRect(117 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 84 + y, 2, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 2, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 4);
        g2d.fillRect(118 + x, 92 + y, 1, 8);
        g2d.fillRect(103 + x, 94 + y, 1, 4);
        g2d.fillRect(102 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 30);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 2);
        g2d.fillRect(101 + x, 102 + y, 1, 7);
        g2d.fillRect(116 + x, 105 + y, 1, 4);
        g2d.fillRect(100 + x, 108 + y, 1, 5);
        g2d.fillRect(99 + x, 112 + y, 1, 9);
        g2d.fillRect(116 + x, 115 + y, 1, 13);
        g2d.fillRect(98 + x, 120 + y, 1, 8);
        g2d.fillRect(97 + x, 124 + y, 1, 9);
        g2d.fillRect(96 + x, 125 + y, 1, 9);
        g2d.fillRect(117 + x, 129 + y, 1, 16);
        g2d.fillRect(95 + x, 134 + y, 1, 7);
        g2d.fillRect(116 + x, 136 + y, 1, 10);
        g2d.fillRect(114 + x, 138 + y, 1, 2);
        g2d.fillRect(115 + x, 138 + y, 1, 3);
        g2d.fillRect(118 + x, 138 + y, 1, 7);
        g2d.fillRect(119 + x, 140 + y, 1, 1);
        g2d.fillRect(94 + x, 141 + y, 1, 1);
        g2d.fillRect(115 + x, 145 + y, 1, 4);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(92 + x, 149 + y, 3, 1);
        g2d.fillRect(117 + x, 152 + y, 1, 2);
        g2d.fillRect(118 + x, 152 + y, 1, 2);
        g2d.fillRect(119 + x, 153 + y, 1, 2);
        g2d.fillRect(99 + x, 155 + y, 1, 4);
        g2d.fillRect(100 + x, 155 + y, 1, 4);
        g2d.fillRect(120 + x, 155 + y, 1, 4);
        g2d.fillRect(93 + x, 157 + y, 4, 1);
        g2d.fillRect(98 + x, 157 + y, 1, 1);
        g2d.fillRect(116 + x, 157 + y, 1, 2);
        g2d.fillRect(117 + x, 158 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 128 + y, 2, 1);
        g2d.fillRect(119 + x, 128 + y, 2, 1);
        g2d.fillRect(118 + x, 129 + y, 1, 1);
        g2d.fillRect(92 + x, 162 + y, 1, 1);
        g2d.fillRect(94 + x, 162 + y, 4, 1);
        g2d.fillRect(115 + x, 162 + y, 1, 1);
        g2d.fillRect(117 + x, 162 + y, 4, 1);
        g2d.fillRect(93 + x, 163 + y, 1, 1);
        g2d.fillRect(95 + x, 163 + y, 1, 2);
        g2d.fillRect(96 + x, 163 + y, 1, 1);
        g2d.fillRect(116 + x, 163 + y, 1, 1);
        g2d.fillRect(118 + x, 163 + y, 1, 2);
        g2d.fillRect(119 + x, 163 + y, 1, 1);
        g2d.fillRect(94 + x, 164 + y, 1, 1);
        g2d.fillRect(117 + x, 164 + y, 1, 1);
    }

}
