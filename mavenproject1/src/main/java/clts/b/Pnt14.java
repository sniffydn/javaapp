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
public class Pnt14 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt14()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt14(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt14(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt14(int layer, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 83 + y, 1, 7);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(100 + x, 84 + y, 1, 3);
        g2d.fillRect(109 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 84 + y, 3, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 4);
        g2d.fillRect(121 + x, 84 + y, 1, 17);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 13);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 4, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 10);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 91 + y, 1, 3);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 97 + y, 1, 1);
        g2d.fillRect(106 + x, 99 + y, 1, 2);
        g2d.fillRect(98 + x, 102 + y, 1, 4);
        g2d.fillRect(105 + x, 103 + y, 1, 3);
        g2d.fillRect(120 + x, 103 + y, 1, 10);
        g2d.fillRect(114 + x, 104 + y, 1, 14);
        g2d.fillRect(104 + x, 108 + y, 1, 2);
        g2d.fillRect(97 + x, 111 + y, 1, 4);
        g2d.fillRect(118 + x, 111 + y, 1, 1);
        g2d.fillRect(103 + x, 112 + y, 1, 3);
        g2d.fillRect(96 + x, 115 + y, 1, 1);
        g2d.fillRect(120 + x, 116 + y, 1, 4);
        g2d.fillRect(102 + x, 117 + y, 1, 5);
        g2d.fillRect(95 + x, 118 + y, 1, 2);
        g2d.fillRect(113 + x, 118 + y, 1, 9);
        g2d.fillRect(101 + x, 119 + y, 1, 9);
        g2d.fillRect(94 + x, 121 + y, 1, 4);
        g2d.fillRect(121 + x, 122 + y, 1, 9);
        g2d.fillRect(93 + x, 124 + y, 1, 5);
        g2d.fillRect(100 + x, 129 + y, 1, 10);
        g2d.fillRect(92 + x, 130 + y, 1, 5);
        g2d.fillRect(112 + x, 130 + y, 1, 11);
        g2d.fillRect(122 + x, 131 + y, 1, 9);
        g2d.fillRect(91 + x, 135 + y, 1, 5);
        g2d.fillRect(90 + x, 140 + y, 1, 4);
        g2d.fillRect(101 + x, 140 + y, 1, 17);
        g2d.fillRect(123 + x, 140 + y, 1, 8);
        g2d.fillRect(111 + x, 141 + y, 1, 7);
        g2d.fillRect(89 + x, 144 + y, 1, 5);
        g2d.fillRect(88 + x, 148 + y, 1, 4);
        g2d.fillRect(110 + x, 148 + y, 1, 8);
        g2d.fillRect(124 + x, 148 + y, 1, 5);
        g2d.fillRect(87 + x, 153 + y, 1, 1);
        g2d.fillRect(125 + x, 154 + y, 1, 8);
        g2d.fillRect(109 + x, 156 + y, 1, 3);
        g2d.fillRect(86 + x, 157 + y, 1, 6);
        g2d.fillRect(102 + x, 158 + y, 1, 6);
        g2d.fillRect(124 + x, 159 + y, 1, 4);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(108 + x, 160 + y, 1, 2);
        g2d.fillRect(123 + x, 160 + y, 1, 3);
        g2d.fillRect(126 + x, 160 + y, 1, 1);
        g2d.fillRect(122 + x, 161 + y, 1, 3);
        g2d.fillRect(87 + x, 162 + y, 4, 1);
        g2d.fillRect(109 + x, 162 + y, 2, 1);
        g2d.fillRect(119 + x, 162 + y, 1, 2);
        g2d.fillRect(120 + x, 162 + y, 1, 2);
        g2d.fillRect(121 + x, 162 + y, 1, 2);
        g2d.fillRect(88 + x, 163 + y, 7, 1);
        g2d.fillRect(97 + x, 163 + y, 1, 2);
        g2d.fillRect(100 + x, 163 + y, 2, 1);
        g2d.fillRect(111 + x, 163 + y, 8, 1);
        g2d.fillRect(91 + x, 164 + y, 6, 1);
        g2d.fillRect(98 + x, 164 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 84 + y, 3, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 2, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(103 + x, 93 + y, 1, 6);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 4);
        g2d.fillRect(113 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(100 + x, 109 + y, 1, 4);
        g2d.fillRect(97 + x, 110 + y, 1, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 1);
        g2d.fillRect(120 + x, 115 + y, 1, 1);
        g2d.fillRect(96 + x, 116 + y, 1, 1);
        g2d.fillRect(102 + x, 116 + y, 1, 1);
        g2d.fillRect(95 + x, 120 + y, 1, 1);
        g2d.fillRect(100 + x, 120 + y, 1, 1);
        g2d.fillRect(120 + x, 120 + y, 1, 1);
        g2d.fillRect(94 + x, 125 + y, 1, 1);
        g2d.fillRect(100 + x, 128 + y, 1, 1);
        g2d.fillRect(93 + x, 129 + y, 1, 1);
        g2d.fillRect(99 + x, 129 + y, 1, 1);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(121 + x, 131 + y, 1, 1);
        g2d.fillRect(99 + x, 137 + y, 1, 2);
        g2d.fillRect(121 + x, 137 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 1);
        g2d.fillRect(122 + x, 140 + y, 1, 1);
        g2d.fillRect(112 + x, 141 + y, 1, 1);
        g2d.fillRect(100 + x, 142 + y, 1, 4);
        g2d.fillRect(122 + x, 142 + y, 1, 6);
        g2d.fillRect(100 + x, 147 + y, 1, 11);
        g2d.fillRect(123 + x, 148 + y, 1, 5);
        g2d.fillRect(95 + x, 150 + y, 1, 1);
        g2d.fillRect(124 + x, 153 + y, 1, 1);
        g2d.fillRect(87 + x, 154 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(95 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 157 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 1, 4);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(123 + x, 159 + y, 1, 1);
        g2d.fillRect(87 + x, 161 + y, 3, 1);
        g2d.fillRect(109 + x, 161 + y, 2, 1);
        g2d.fillRect(120 + x, 161 + y, 2, 1);
        g2d.fillRect(97 + x, 162 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 8, 1);
        g2d.fillRect(96 + x, 163 + y, 1, 1);
        g2d.fillRect(98 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(102 + x, 113 + y, 1, 2);
        g2d.fillRect(119 + x, 113 + y, 1, 1);
        g2d.fillRect(97 + x, 115 + y, 1, 1);
        g2d.fillRect(119 + x, 115 + y, 1, 7);
        g2d.fillRect(101 + x, 116 + y, 1, 2);
        g2d.fillRect(99 + x, 119 + y, 1, 1);
        g2d.fillRect(100 + x, 121 + y, 1, 7);
        g2d.fillRect(120 + x, 122 + y, 1, 8);
        g2d.fillRect(118 + x, 123 + y, 2, 1);
        g2d.fillRect(98 + x, 125 + y, 1, 1);
        g2d.fillRect(99 + x, 126 + y, 1, 1);
        g2d.fillRect(113 + x, 127 + y, 1, 1);
        g2d.fillRect(99 + x, 128 + y, 1, 1);
        g2d.fillRect(99 + x, 130 + y, 1, 7);
        g2d.fillRect(120 + x, 131 + y, 1, 1);
        g2d.fillRect(98 + x, 132 + y, 1, 1);
        g2d.fillRect(121 + x, 133 + y, 1, 4);
        g2d.fillRect(98 + x, 134 + y, 1, 2);
        g2d.fillRect(120 + x, 134 + y, 1, 2);
        g2d.fillRect(91 + x, 140 + y, 1, 1);
        g2d.fillRect(99 + x, 140 + y, 2, 1);
        g2d.fillRect(100 + x, 141 + y, 1, 1);
        g2d.fillRect(122 + x, 141 + y, 1, 1);
        g2d.fillRect(90 + x, 144 + y, 1, 1);
        g2d.fillRect(100 + x, 146 + y, 1, 1);
        g2d.fillRect(111 + x, 148 + y, 1, 1);
        g2d.fillRect(122 + x, 148 + y, 1, 1);
        g2d.fillRect(89 + x, 149 + y, 1, 1);
        g2d.fillRect(95 + x, 151 + y, 1, 2);
        g2d.fillRect(88 + x, 152 + y, 1, 1);
        g2d.fillRect(124 + x, 154 + y, 1, 1);
        g2d.fillRect(95 + x, 155 + y, 1, 2);
        g2d.fillRect(124 + x, 156 + y, 1, 2);
        g2d.fillRect(122 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 1);
        g2d.fillRect(123 + x, 158 + y, 1, 1);
        g2d.fillRect(96 + x, 159 + y, 1, 2);
        g2d.fillRect(121 + x, 159 + y, 1, 1);
        g2d.fillRect(122 + x, 160 + y, 1, 1);
        g2d.fillRect(119 + x, 161 + y, 1, 1);
        g2d.fillRect(93 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 106 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(102 + x, 112 + y, 1, 1);
        g2d.fillRect(118 + x, 112 + y, 1, 1);
        g2d.fillRect(98 + x, 113 + y, 1, 1);
        g2d.fillRect(100 + x, 113 + y, 1, 1);
        g2d.fillRect(115 + x, 113 + y, 1, 8);
        g2d.fillRect(117 + x, 113 + y, 1, 9);
        g2d.fillRect(120 + x, 113 + y, 1, 2);
        g2d.fillRect(119 + x, 114 + y, 1, 1);
        g2d.fillRect(102 + x, 115 + y, 1, 1);
        g2d.fillRect(97 + x, 116 + y, 1, 2);
        g2d.fillRect(96 + x, 117 + y, 1, 5);
        g2d.fillRect(99 + x, 118 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 118 + y, 1, 6);
        g2d.fillRect(95 + x, 121 + y, 1, 3);
        g2d.fillRect(120 + x, 121 + y, 1, 1);
        g2d.fillRect(98 + x, 122 + y, 1, 3);
        g2d.fillRect(99 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 122 + y, 2, 1);
        g2d.fillRect(118 + x, 124 + y, 1, 15);
        g2d.fillRect(99 + x, 125 + y, 1, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 15);
        g2d.fillRect(94 + x, 126 + y, 1, 5);
        g2d.fillRect(98 + x, 126 + y, 1, 1);
        g2d.fillRect(99 + x, 127 + y, 1, 1);
        g2d.fillRect(113 + x, 128 + y, 1, 12);
        g2d.fillRect(93 + x, 130 + y, 1, 2);
        g2d.fillRect(98 + x, 131 + y, 1, 1);
        g2d.fillRect(120 + x, 132 + y, 1, 2);
        g2d.fillRect(121 + x, 132 + y, 1, 1);
        g2d.fillRect(93 + x, 133 + y, 1, 3);
        g2d.fillRect(96 + x, 133 + y, 1, 23);
        g2d.fillRect(98 + x, 133 + y, 1, 1);
        g2d.fillRect(92 + x, 135 + y, 1, 1);
        g2d.fillRect(92 + x, 137 + y, 1, 2);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 8);
        g2d.fillRect(92 + x, 140 + y, 1, 1);
        g2d.fillRect(91 + x, 141 + y, 1, 1);
        g2d.fillRect(113 + x, 141 + y, 1, 5);
        g2d.fillRect(112 + x, 142 + y, 1, 5);
        g2d.fillRect(91 + x, 144 + y, 1, 2);
        g2d.fillRect(90 + x, 145 + y, 1, 2);
        g2d.fillRect(99 + x, 146 + y, 1, 1);
        g2d.fillRect(93 + x, 147 + y, 1, 1);
        g2d.fillRect(120 + x, 147 + y, 1, 6);
        g2d.fillRect(90 + x, 148 + y, 1, 3);
        g2d.fillRect(91 + x, 148 + y, 1, 5);
        g2d.fillRect(94 + x, 148 + y, 1, 1);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(111 + x, 149 + y, 1, 6);
        g2d.fillRect(93 + x, 150 + y, 1, 3);
        g2d.fillRect(112 + x, 150 + y, 1, 4);
        g2d.fillRect(89 + x, 152 + y, 2, 1);
        g2d.fillRect(92 + x, 154 + y, 1, 1);
        g2d.fillRect(121 + x, 154 + y, 1, 2);
        g2d.fillRect(87 + x, 155 + y, 1, 2);
        g2d.fillRect(88 + x, 155 + y, 1, 2);
        g2d.fillRect(91 + x, 155 + y, 1, 1);
        g2d.fillRect(93 + x, 155 + y, 1, 3);
        g2d.fillRect(89 + x, 156 + y, 2, 1);
        g2d.fillRect(110 + x, 156 + y, 1, 3);
        g2d.fillRect(122 + x, 156 + y, 2, 1);
        g2d.fillRect(91 + x, 157 + y, 1, 1);
        g2d.fillRect(111 + x, 157 + y, 1, 1);
        g2d.fillRect(123 + x, 157 + y, 1, 1);
        g2d.fillRect(95 + x, 158 + y, 2, 1);
        g2d.fillRect(100 + x, 158 + y, 1, 1);
        g2d.fillRect(122 + x, 158 + y, 1, 2);
        g2d.fillRect(92 + x, 159 + y, 1, 1);
        g2d.fillRect(94 + x, 159 + y, 1, 1);
        g2d.fillRect(97 + x, 159 + y, 1, 1);
        g2d.fillRect(93 + x, 160 + y, 1, 2);
        g2d.fillRect(109 + x, 160 + y, 3, 1);
        g2d.fillRect(121 + x, 160 + y, 1, 1);
        g2d.fillRect(90 + x, 161 + y, 1, 1);
        g2d.fillRect(95 + x, 161 + y, 1, 3);
        g2d.fillRect(96 + x, 161 + y, 1, 2);
        g2d.fillRect(97 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 161 + y, 2, 1);
        g2d.fillRect(117 + x, 161 + y, 1, 1);
        g2d.fillRect(92 + x, 162 + y, 1, 1);
        g2d.fillRect(94 + x, 162 + y, 1, 1);
        g2d.fillRect(100 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 83 + y, 1, 3);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(119 + x, 83 + y, 1, 5);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 2);
        g2d.fillRect(100 + x, 89 + y, 1, 10);
        g2d.fillRect(115 + x, 89 + y, 1, 6);
        g2d.fillRect(118 + x, 89 + y, 1, 15);
        g2d.fillRect(120 + x, 89 + y, 1, 13);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 7);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 10);
        g2d.fillRect(105 + x, 96 + y, 1, 6);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 7);
        g2d.fillRect(104 + x, 101 + y, 1, 5);
        g2d.fillRect(113 + x, 101 + y, 1, 2);
        g2d.fillRect(99 + x, 103 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 4);
        g2d.fillRect(98 + x, 108 + y, 1, 2);
        g2d.fillRect(100 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(102 + x, 111 + y, 1, 1);
        g2d.fillRect(98 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 1);
        g2d.fillRect(101 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 119 + y, 1, 1);
        g2d.fillRect(99 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(119 + x, 124 + y, 1, 1);
        g2d.fillRect(93 + x, 132 + y, 1, 1);
        g2d.fillRect(96 + x, 132 + y, 1, 1);
        g2d.fillRect(92 + x, 136 + y, 1, 1);
        g2d.fillRect(98 + x, 136 + y, 1, 1);
        g2d.fillRect(120 + x, 136 + y, 1, 1);
        g2d.fillRect(92 + x, 139 + y, 1, 1);
        g2d.fillRect(113 + x, 140 + y, 1, 1);
        g2d.fillRect(121 + x, 140 + y, 1, 1);
        g2d.fillRect(92 + x, 141 + y, 1, 1);
        g2d.fillRect(99 + x, 141 + y, 1, 1);
        g2d.fillRect(91 + x, 142 + y, 1, 2);
        g2d.fillRect(99 + x, 145 + y, 1, 1);
        g2d.fillRect(91 + x, 146 + y, 1, 1);
        g2d.fillRect(113 + x, 146 + y, 1, 1);
        g2d.fillRect(90 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 147 + y, 1, 1);
        g2d.fillRect(92 + x, 148 + y, 1, 2);
        g2d.fillRect(93 + x, 149 + y, 3, 1);
        g2d.fillRect(112 + x, 149 + y, 1, 1);
        g2d.fillRect(122 + x, 149 + y, 1, 1);
        g2d.fillRect(89 + x, 150 + y, 1, 2);
        g2d.fillRect(88 + x, 153 + y, 1, 2);
        g2d.fillRect(90 + x, 153 + y, 1, 1);
        g2d.fillRect(92 + x, 153 + y, 1, 1);
        g2d.fillRect(94 + x, 153 + y, 1, 2);
        g2d.fillRect(95 + x, 153 + y, 1, 1);
        g2d.fillRect(120 + x, 153 + y, 2, 1);
        g2d.fillRect(123 + x, 153 + y, 1, 1);
        g2d.fillRect(112 + x, 154 + y, 1, 1);
        g2d.fillRect(111 + x, 155 + y, 1, 2);
        g2d.fillRect(91 + x, 156 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 2);
        g2d.fillRect(87 + x, 157 + y, 1, 4);
        g2d.fillRect(89 + x, 157 + y, 2, 1);
        g2d.fillRect(91 + x, 158 + y, 4, 1);
        g2d.fillRect(121 + x, 158 + y, 1, 1);
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(97 + x, 160 + y, 1, 1);
        g2d.fillRect(112 + x, 160 + y, 1, 1);
        g2d.fillRect(117 + x, 160 + y, 1, 1);
        g2d.fillRect(119 + x, 160 + y, 1, 1);
        g2d.fillRect(113 + x, 161 + y, 4, 1);
        g2d.fillRect(118 + x, 161 + y, 1, 1);
        g2d.fillRect(91 + x, 162 + y, 1, 1);
        g2d.fillRect(99 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(99 + x, 106 + y, 1, 1);
        g2d.fillRect(103 + x, 106 + y, 2, 1);
        g2d.fillRect(97 + x, 107 + y, 1, 2);
        g2d.fillRect(98 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 3);
        g2d.fillRect(98 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 112 + y, 1, 1);
        g2d.fillRect(119 + x, 112 + y, 1, 1);
        g2d.fillRect(95 + x, 124 + y, 1, 1);
        g2d.fillRect(99 + x, 124 + y, 1, 1);
        g2d.fillRect(98 + x, 127 + y, 1, 1);
        g2d.fillRect(93 + x, 136 + y, 1, 1);
        g2d.fillRect(93 + x, 148 + y, 1, 1);
        g2d.fillRect(119 + x, 150 + y, 1, 1);
        g2d.fillRect(89 + x, 153 + y, 1, 1);
        g2d.fillRect(91 + x, 153 + y, 1, 2);
        g2d.fillRect(93 + x, 153 + y, 1, 2);
        g2d.fillRect(95 + x, 154 + y, 1, 1);
        g2d.fillRect(120 + x, 154 + y, 1, 1);
        g2d.fillRect(123 + x, 154 + y, 1, 1);
        g2d.fillRect(90 + x, 155 + y, 1, 1);
        g2d.fillRect(121 + x, 156 + y, 1, 1);
        g2d.fillRect(88 + x, 157 + y, 1, 1);
        g2d.fillRect(111 + x, 158 + y, 1, 1);
        g2d.fillRect(91 + x, 159 + y, 1, 1);
        g2d.fillRect(92 + x, 160 + y, 1, 1);
        g2d.fillRect(98 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 107 + y, 1, 1);
        g2d.fillRect(99 + x, 117 + y, 1, 1);
        g2d.fillRect(98 + x, 119 + y, 1, 1);
        g2d.fillRect(98 + x, 121 + y, 2, 1);
        g2d.fillRect(118 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 17);
        g2d.fillRect(97 + x, 123 + y, 1, 3);
        g2d.fillRect(99 + x, 123 + y, 1, 1);
        g2d.fillRect(98 + x, 128 + y, 1, 3);
        g2d.fillRect(97 + x, 131 + y, 1, 1);
        g2d.fillRect(95 + x, 133 + y, 1, 16);
        g2d.fillRect(98 + x, 137 + y, 1, 4);
        g2d.fillRect(120 + x, 137 + y, 1, 2);
        g2d.fillRect(118 + x, 139 + y, 1, 8);
        g2d.fillRect(114 + x, 140 + y, 1, 1);
        g2d.fillRect(121 + x, 141 + y, 1, 5);
        g2d.fillRect(99 + x, 142 + y, 1, 3);
        g2d.fillRect(93 + x, 146 + y, 1, 1);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(92 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 147 + y, 1, 3);
        g2d.fillRect(119 + x, 147 + y, 1, 3);
        g2d.fillRect(121 + x, 148 + y, 1, 1);
        g2d.fillRect(92 + x, 150 + y, 1, 1);
        g2d.fillRect(94 + x, 150 + y, 1, 3);
        g2d.fillRect(90 + x, 151 + y, 1, 1);
        g2d.fillRect(99 + x, 151 + y, 1, 3);
        g2d.fillRect(119 + x, 151 + y, 1, 2);
        g2d.fillRect(122 + x, 151 + y, 1, 2);
        g2d.fillRect(92 + x, 152 + y, 1, 1);
        g2d.fillRect(94 + x, 155 + y, 1, 3);
        g2d.fillRect(99 + x, 155 + y, 1, 3);
        g2d.fillRect(120 + x, 155 + y, 1, 1);
        g2d.fillRect(123 + x, 155 + y, 1, 1);
        g2d.fillRect(92 + x, 156 + y, 1, 2);
        g2d.fillRect(121 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 1, 1);
        g2d.fillRect(97 + x, 158 + y, 1, 1);
        g2d.fillRect(93 + x, 159 + y, 1, 1);
        g2d.fillRect(95 + x, 159 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 1, 3);
        g2d.fillRect(120 + x, 159 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 160 + y, 1, 1);
        g2d.fillRect(92 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 2, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 3);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(99 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 7);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(102 + x, 107 + y, 1, 3);
        g2d.fillRect(99 + x, 109 + y, 1, 3);
        g2d.fillRect(101 + x, 109 + y, 1, 1);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 113 + y, 1, 1);
        g2d.fillRect(100 + x, 114 + y, 1, 5);
        g2d.fillRect(101 + x, 114 + y, 1, 1);
        g2d.fillRect(98 + x, 118 + y, 1, 1);
        g2d.fillRect(116 + x, 120 + y, 1, 2);
        g2d.fillRect(97 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 1, 4);
        g2d.fillRect(97 + x, 126 + y, 1, 1);
        g2d.fillRect(94 + x, 131 + y, 1, 1);
        g2d.fillRect(119 + x, 131 + y, 1, 5);
        g2d.fillRect(95 + x, 132 + y, 1, 1);
        g2d.fillRect(97 + x, 132 + y, 1, 4);
        g2d.fillRect(120 + x, 139 + y, 1, 1);
        g2d.fillRect(98 + x, 141 + y, 1, 1);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(120 + x, 146 + y, 2, 1);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 150 + y, 1, 1);
        g2d.fillRect(122 + x, 150 + y, 1, 1);
        g2d.fillRect(92 + x, 151 + y, 1, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(99 + x, 154 + y, 1, 1);
        g2d.fillRect(92 + x, 155 + y, 1, 1);
        g2d.fillRect(112 + x, 156 + y, 1, 1);
        g2d.fillRect(97 + x, 157 + y, 1, 1);
        g2d.fillRect(89 + x, 158 + y, 1, 1);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(120 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 159 + y, 1, 1);
        g2d.fillRect(94 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 103 + y, 1, 3);
        g2d.fillRect(103 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 112 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 6);
        g2d.fillRect(118 + x, 114 + y, 1, 2);
        g2d.fillRect(97 + x, 118 + y, 1, 1);
        g2d.fillRect(118 + x, 118 + y, 1, 3);
        g2d.fillRect(98 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 125 + y, 1, 1);
        g2d.fillRect(119 + x, 129 + y, 1, 2);
        g2d.fillRect(93 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 147 + y, 1, 1);
        g2d.fillRect(113 + x, 149 + y, 1, 1);
        g2d.fillRect(121 + x, 150 + y, 1, 1);
        g2d.fillRect(89 + x, 154 + y, 1, 2);
        g2d.fillRect(90 + x, 154 + y, 1, 1);
        g2d.fillRect(98 + x, 158 + y, 1, 1);
        g2d.fillRect(88 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 159 + y, 1, 1);
        g2d.fillRect(118 + x, 159 + y, 2, 1);
        g2d.fillRect(113 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 84 + y, 1, 4);
        g2d.fillRect(117 + x, 84 + y, 1, 4);
        g2d.fillRect(109 + x, 85 + y, 1, 5);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 3, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 1, 5);
        g2d.fillRect(107 + x, 86 + y, 1, 3);
        g2d.fillRect(108 + x, 86 + y, 1, 4);
        g2d.fillRect(113 + x, 86 + y, 1, 4);
        g2d.fillRect(114 + x, 86 + y, 1, 4);
        g2d.fillRect(115 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(116 + x, 88 + y, 1, 26);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 4);
        g2d.fillRect(103 + x, 90 + y, 1, 3);
        g2d.fillRect(105 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 20);
        g2d.fillRect(101 + x, 91 + y, 1, 8);
        g2d.fillRect(119 + x, 91 + y, 1, 11);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 1, 3);
        g2d.fillRect(115 + x, 96 + y, 1, 3);
        g2d.fillRect(104 + x, 97 + y, 1, 3);
        g2d.fillRect(100 + x, 100 + y, 1, 3);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 1, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 4);
        g2d.fillRect(102 + x, 106 + y, 1, 1);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(101 + x, 110 + y, 1, 2);
        g2d.fillRect(99 + x, 113 + y, 1, 4);
        g2d.fillRect(101 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 114 + y, 1, 4);
        g2d.fillRect(118 + x, 116 + y, 1, 2);
        g2d.fillRect(97 + x, 119 + y, 1, 3);
        g2d.fillRect(96 + x, 122 + y, 1, 10);
        g2d.fillRect(116 + x, 122 + y, 1, 37);
        g2d.fillRect(115 + x, 123 + y, 1, 38);
        g2d.fillRect(95 + x, 126 + y, 1, 6);
        g2d.fillRect(97 + x, 127 + y, 1, 4);
        g2d.fillRect(94 + x, 132 + y, 1, 16);
        g2d.fillRect(97 + x, 136 + y, 1, 21);
        g2d.fillRect(119 + x, 136 + y, 1, 3);
        g2d.fillRect(93 + x, 137 + y, 1, 3);
        g2d.fillRect(117 + x, 139 + y, 1, 20);
        g2d.fillRect(120 + x, 140 + y, 1, 6);
        g2d.fillRect(93 + x, 141 + y, 1, 5);
        g2d.fillRect(114 + x, 141 + y, 1, 20);
        g2d.fillRect(92 + x, 142 + y, 1, 5);
        g2d.fillRect(98 + x, 142 + y, 1, 3);
        g2d.fillRect(91 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 11);
        g2d.fillRect(118 + x, 147 + y, 1, 12);
        g2d.fillRect(113 + x, 148 + y, 1, 1);
        g2d.fillRect(121 + x, 149 + y, 1, 1);
        g2d.fillRect(113 + x, 150 + y, 1, 10);
        g2d.fillRect(121 + x, 151 + y, 1, 2);
        g2d.fillRect(122 + x, 153 + y, 1, 3);
        g2d.fillRect(119 + x, 154 + y, 1, 5);
        g2d.fillRect(112 + x, 155 + y, 1, 1);
        g2d.fillRect(120 + x, 156 + y, 1, 2);
        g2d.fillRect(112 + x, 157 + y, 1, 2);
        g2d.fillRect(88 + x, 158 + y, 1, 1);
        g2d.fillRect(89 + x, 159 + y, 1, 2);
        g2d.fillRect(90 + x, 159 + y, 1, 2);
        g2d.fillRect(98 + x, 159 + y, 1, 2);
        g2d.fillRect(99 + x, 159 + y, 1, 4);
        g2d.fillRect(111 + x, 159 + y, 1, 1);
        g2d.fillRect(88 + x, 160 + y, 1, 1);
        g2d.fillRect(91 + x, 160 + y, 1, 2);
        g2d.fillRect(94 + x, 160 + y, 1, 1);
    }
}