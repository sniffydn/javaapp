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
public class Pnt8 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt8()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt8(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt8(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt8(int layer, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(89 + x, 160 + y, 1, 3);
        g2d.fillRect(90 + x, 160 + y, 1, 3);
        g2d.fillRect(91 + x, 160 + y, 1, 3);
        g2d.fillRect(92 + x, 160 + y, 1, 3);
        g2d.fillRect(115 + x, 160 + y, 1, 3);
        g2d.fillRect(116 + x, 160 + y, 1, 3);
        g2d.fillRect(117 + x, 160 + y, 1, 3);
        g2d.fillRect(118 + x, 160 + y, 1, 3);
        g2d.fillRect(119 + x, 160 + y, 1, 3);
        g2d.fillRect(88 + x, 161 + y, 1, 2);
        g2d.fillRect(93 + x, 161 + y, 1, 2);
        g2d.fillRect(94 + x, 161 + y, 1, 2);
        g2d.fillRect(95 + x, 161 + y, 1, 2);
        g2d.fillRect(96 + x, 161 + y, 1, 2);
        g2d.fillRect(113 + x, 161 + y, 1, 2);
        g2d.fillRect(114 + x, 161 + y, 1, 2);
        g2d.fillRect(120 + x, 161 + y, 1, 2);
        g2d.fillRect(121 + x, 161 + y, 1, 2);
        g2d.fillRect(97 + x, 162 + y, 2, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(122 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(103 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 2);
        g2d.fillRect(102 + x, 116 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 83 + y, 1, 7);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(117 + x, 83 + y, 5, 1);
        g2d.fillRect(104 + x, 84 + y, 13, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 17);
        g2d.fillRect(109 + x, 85 + y, 1, 6);
        g2d.fillRect(111 + x, 85 + y, 1, 4);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 14);
        g2d.fillRect(101 + x, 88 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 90 + y, 2, 1);
        g2d.fillRect(106 + x, 91 + y, 3, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 93 + y, 1, 5);
        g2d.fillRect(113 + x, 96 + y, 1, 7);
        g2d.fillRect(106 + x, 97 + y, 1, 5);
        g2d.fillRect(120 + x, 100 + y, 1, 23);
        g2d.fillRect(105 + x, 101 + y, 1, 5);
        g2d.fillRect(98 + x, 102 + y, 1, 5);
        g2d.fillRect(114 + x, 102 + y, 1, 10);
        g2d.fillRect(104 + x, 106 + y, 1, 4);
        g2d.fillRect(97 + x, 107 + y, 1, 5);
        g2d.fillRect(103 + x, 110 + y, 1, 4);
        g2d.fillRect(96 + x, 112 + y, 1, 4);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(102 + x, 115 + y, 1, 1);
        g2d.fillRect(95 + x, 116 + y, 1, 5);
        g2d.fillRect(114 + x, 117 + y, 1, 2);
        g2d.fillRect(113 + x, 118 + y, 1, 12);
        g2d.fillRect(102 + x, 119 + y, 1, 2);
        g2d.fillRect(94 + x, 121 + y, 1, 4);
        g2d.fillRect(101 + x, 121 + y, 1, 7);
        g2d.fillRect(121 + x, 121 + y, 1, 11);
        g2d.fillRect(93 + x, 125 + y, 1, 4);
        g2d.fillRect(100 + x, 128 + y, 1, 11);
        g2d.fillRect(92 + x, 129 + y, 1, 5);
        g2d.fillRect(112 + x, 129 + y, 1, 13);
        g2d.fillRect(122 + x, 130 + y, 1, 10);
        g2d.fillRect(91 + x, 134 + y, 1, 5);
        g2d.fillRect(90 + x, 139 + y, 1, 4);
        g2d.fillRect(123 + x, 139 + y, 1, 9);
        g2d.fillRect(101 + x, 140 + y, 1, 2);
        g2d.fillRect(111 + x, 141 + y, 1, 7);
        g2d.fillRect(89 + x, 143 + y, 1, 5);
        g2d.fillRect(110 + x, 147 + y, 1, 9);
        g2d.fillRect(124 + x, 147 + y, 1, 6);
        g2d.fillRect(88 + x, 148 + y, 1, 4);
        g2d.fillRect(87 + x, 152 + y, 1, 5);
        g2d.fillRect(125 + x, 152 + y, 1, 8);
        g2d.fillRect(101 + x, 155 + y, 1, 1);
        g2d.fillRect(109 + x, 155 + y, 1, 6);
        g2d.fillRect(102 + x, 156 + y, 1, 4);
        g2d.fillRect(86 + x, 157 + y, 1, 5);
        g2d.fillRect(126 + x, 158 + y, 1, 5);
        g2d.fillRect(88 + x, 160 + y, 1, 1);
        g2d.fillRect(103 + x, 160 + y, 1, 3);
        g2d.fillRect(108 + x, 160 + y, 1, 3);
        g2d.fillRect(87 + x, 161 + y, 1, 1);
        g2d.fillRect(112 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 162 + y, 4, 1);
        g2d.fillRect(104 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 3, 1);
        g2d.fillRect(123 + x, 162 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 98 + y, 1, 2);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 1);
        g2d.fillRect(104 + x, 103 + y, 1, 3);
        g2d.fillRect(103 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 1);
        g2d.fillRect(94 + x, 125 + y, 1, 1);
        g2d.fillRect(113 + x, 130 + y, 1, 4);
        g2d.fillRect(92 + x, 134 + y, 1, 3);
        g2d.fillRect(91 + x, 139 + y, 1, 1);
        g2d.fillRect(94 + x, 148 + y, 1, 1);
        g2d.fillRect(95 + x, 151 + y, 1, 2);
        g2d.fillRect(96 + x, 153 + y, 1, 4);
        g2d.fillRect(124 + x, 153 + y, 1, 3);
        g2d.fillRect(115 + x, 155 + y, 1, 3);
        g2d.fillRect(95 + x, 156 + y, 1, 1);
        g2d.fillRect(116 + x, 156 + y, 1, 2);
        g2d.fillRect(117 + x, 156 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 1);
        g2d.fillRect(118 + x, 157 + y, 2, 1);
        g2d.fillRect(96 + x, 160 + y, 4, 1);
        g2d.fillRect(125 + x, 160 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 3);
        g2d.fillRect(113 + x, 85 + y, 2, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 9);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 6);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 4);
        g2d.fillRect(114 + x, 96 + y, 1, 5);
        g2d.fillRect(105 + x, 97 + y, 1, 3);
        g2d.fillRect(104 + x, 101 + y, 1, 2);
        g2d.fillRect(99 + x, 102 + y, 1, 5);
        g2d.fillRect(119 + x, 102 + y, 1, 21);
        g2d.fillRect(115 + x, 103 + y, 1, 20);
        g2d.fillRect(103 + x, 105 + y, 1, 4);
        g2d.fillRect(98 + x, 107 + y, 1, 5);
        g2d.fillRect(102 + x, 110 + y, 1, 5);
        g2d.fillRect(97 + x, 112 + y, 1, 3);
        g2d.fillRect(96 + x, 116 + y, 1, 4);
        g2d.fillRect(101 + x, 117 + y, 1, 4);
        g2d.fillRect(114 + x, 120 + y, 1, 23);
        g2d.fillRect(95 + x, 121 + y, 1, 9);
        g2d.fillRect(100 + x, 123 + y, 1, 5);
        g2d.fillRect(120 + x, 124 + y, 1, 9);
        g2d.fillRect(94 + x, 126 + y, 1, 3);
        g2d.fillRect(93 + x, 129 + y, 1, 4);
        g2d.fillRect(96 + x, 130 + y, 1, 3);
        g2d.fillRect(121 + x, 132 + y, 1, 10);
        g2d.fillRect(113 + x, 134 + y, 1, 12);
        g2d.fillRect(92 + x, 137 + y, 1, 18);
        g2d.fillRect(101 + x, 139 + y, 1, 1);
        g2d.fillRect(91 + x, 140 + y, 1, 8);
        g2d.fillRect(122 + x, 140 + y, 1, 8);
        g2d.fillRect(93 + x, 142 + y, 1, 16);
        g2d.fillRect(101 + x, 142 + y, 1, 4);
        g2d.fillRect(112 + x, 142 + y, 1, 6);
        g2d.fillRect(114 + x, 144 + y, 1, 8);
        g2d.fillRect(95 + x, 147 + y, 1, 4);
        g2d.fillRect(89 + x, 148 + y, 1, 3);
        g2d.fillRect(111 + x, 148 + y, 1, 4);
        g2d.fillRect(113 + x, 148 + y, 1, 9);
        g2d.fillRect(123 + x, 148 + y, 1, 7);
        g2d.fillRect(94 + x, 149 + y, 1, 12);
        g2d.fillRect(101 + x, 149 + y, 1, 2);
        g2d.fillRect(88 + x, 152 + y, 1, 4);
        g2d.fillRect(96 + x, 152 + y, 1, 1);
        g2d.fillRect(101 + x, 152 + y, 1, 3);
        g2d.fillRect(95 + x, 153 + y, 1, 3);
        g2d.fillRect(114 + x, 153 + y, 1, 4);
        g2d.fillRect(115 + x, 153 + y, 1, 2);
        g2d.fillRect(116 + x, 153 + y, 1, 3);
        g2d.fillRect(97 + x, 155 + y, 1, 2);
        g2d.fillRect(100 + x, 155 + y, 1, 2);
        g2d.fillRect(117 + x, 155 + y, 3, 1);
        g2d.fillRect(110 + x, 156 + y, 1, 6);
        g2d.fillRect(118 + x, 156 + y, 2, 1);
        g2d.fillRect(124 + x, 156 + y, 1, 6);
        g2d.fillRect(87 + x, 157 + y, 1, 3);
        g2d.fillRect(99 + x, 157 + y, 1, 3);
        g2d.fillRect(120 + x, 157 + y, 2, 1);
        g2d.fillRect(95 + x, 158 + y, 1, 3);
        g2d.fillRect(96 + x, 158 + y, 1, 2);
        g2d.fillRect(97 + x, 158 + y, 1, 2);
        g2d.fillRect(98 + x, 158 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 2, 1);
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(109 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 4, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 4, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 86 + y, 2, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 3);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 3);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 3);
        g2d.fillRect(114 + x, 93 + y, 1, 3);
        g2d.fillRect(105 + x, 95 + y, 1, 2);
        g2d.fillRect(104 + x, 98 + y, 1, 3);
        g2d.fillRect(115 + x, 98 + y, 1, 5);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 3);
        g2d.fillRect(116 + x, 106 + y, 1, 8);
        g2d.fillRect(99 + x, 107 + y, 1, 5);
        g2d.fillRect(102 + x, 107 + y, 1, 3);
        g2d.fillRect(101 + x, 112 + y, 1, 5);
        g2d.fillRect(118 + x, 112 + y, 1, 9);
        g2d.fillRect(97 + x, 115 + y, 1, 14);
        g2d.fillRect(100 + x, 115 + y, 1, 8);
        g2d.fillRect(116 + x, 115 + y, 1, 15);
        g2d.fillRect(99 + x, 116 + y, 1, 10);
        g2d.fillRect(98 + x, 119 + y, 1, 20);
        g2d.fillRect(96 + x, 120 + y, 1, 4);
        g2d.fillRect(117 + x, 121 + y, 1, 2);
        g2d.fillRect(115 + x, 123 + y, 1, 15);
        g2d.fillRect(119 + x, 123 + y, 1, 9);
        g2d.fillRect(117 + x, 124 + y, 1, 1);
        g2d.fillRect(117 + x, 126 + y, 1, 2);
        g2d.fillRect(99 + x, 128 + y, 1, 1);
        g2d.fillRect(94 + x, 129 + y, 1, 1);
        g2d.fillRect(95 + x, 130 + y, 1, 3);
        g2d.fillRect(116 + x, 132 + y, 1, 1);
        g2d.fillRect(93 + x, 133 + y, 1, 9);
        g2d.fillRect(96 + x, 133 + y, 1, 2);
        g2d.fillRect(97 + x, 133 + y, 1, 5);
        g2d.fillRect(119 + x, 133 + y, 2, 1);
        g2d.fillRect(120 + x, 134 + y, 1, 4);
        g2d.fillRect(119 + x, 135 + y, 1, 5);
        g2d.fillRect(94 + x, 137 + y, 1, 11);
        g2d.fillRect(100 + x, 139 + y, 1, 4);
        g2d.fillRect(118 + x, 140 + y, 1, 3);
        g2d.fillRect(98 + x, 142 + y, 1, 1);
        g2d.fillRect(121 + x, 142 + y, 1, 15);
        g2d.fillRect(90 + x, 143 + y, 1, 6);
        g2d.fillRect(117 + x, 143 + y, 1, 3);
        g2d.fillRect(95 + x, 144 + y, 1, 3);
        g2d.fillRect(98 + x, 144 + y, 1, 7);
        g2d.fillRect(101 + x, 146 + y, 1, 3);
        g2d.fillRect(116 + x, 146 + y, 1, 2);
        g2d.fillRect(99 + x, 147 + y, 1, 6);
        g2d.fillRect(91 + x, 148 + y, 1, 12);
        g2d.fillRect(100 + x, 148 + y, 1, 3);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(115 + x, 148 + y, 1, 1);
        g2d.fillRect(122 + x, 148 + y, 1, 12);
        g2d.fillRect(96 + x, 149 + y, 1, 3);
        g2d.fillRect(101 + x, 151 + y, 1, 1);
        g2d.fillRect(116 + x, 152 + y, 1, 1);
        g2d.fillRect(120 + x, 152 + y, 1, 5);
        g2d.fillRect(97 + x, 153 + y, 1, 2);
        g2d.fillRect(100 + x, 153 + y, 1, 2);
        g2d.fillRect(112 + x, 153 + y, 1, 5);
        g2d.fillRect(117 + x, 153 + y, 1, 2);
        g2d.fillRect(118 + x, 153 + y, 1, 2);
        g2d.fillRect(119 + x, 153 + y, 1, 2);
        g2d.fillRect(92 + x, 155 + y, 1, 5);
        g2d.fillRect(123 + x, 155 + y, 1, 7);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(95 + x, 157 + y, 1, 1);
        g2d.fillRect(98 + x, 157 + y, 1, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 1);
        g2d.fillRect(93 + x, 158 + y, 1, 3);
        g2d.fillRect(119 + x, 158 + y, 1, 2);
        g2d.fillRect(120 + x, 158 + y, 1, 2);
        g2d.fillRect(121 + x, 158 + y, 1, 2);
        g2d.fillRect(111 + x, 160 + y, 3, 1);
        g2d.fillRect(97 + x, 161 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 4);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 4);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 5);
        g2d.fillRect(105 + x, 92 + y, 1, 3);
        g2d.fillRect(119 + x, 92 + y, 1, 9);
        g2d.fillRect(104 + x, 93 + y, 1, 5);
        g2d.fillRect(115 + x, 95 + y, 1, 3);
        g2d.fillRect(116 + x, 95 + y, 1, 11);
        g2d.fillRect(100 + x, 98 + y, 1, 17);
        g2d.fillRect(103 + x, 98 + y, 1, 4);
        g2d.fillRect(118 + x, 98 + y, 1, 14);
        g2d.fillRect(102 + x, 102 + y, 1, 5);
        g2d.fillRect(117 + x, 103 + y, 1, 2);
        g2d.fillRect(101 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 15);
        g2d.fillRect(101 + x, 107 + y, 1, 5);
        g2d.fillRect(98 + x, 112 + y, 1, 7);
        g2d.fillRect(99 + x, 112 + y, 1, 4);
        g2d.fillRect(116 + x, 114 + y, 1, 1);
        g2d.fillRect(118 + x, 121 + y, 1, 19);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(96 + x, 124 + y, 1, 6);
        g2d.fillRect(117 + x, 125 + y, 1, 1);
        g2d.fillRect(99 + x, 126 + y, 1, 2);
        g2d.fillRect(117 + x, 128 + y, 1, 15);
        g2d.fillRect(97 + x, 129 + y, 1, 4);
        g2d.fillRect(99 + x, 129 + y, 1, 18);
        g2d.fillRect(94 + x, 130 + y, 1, 7);
        g2d.fillRect(116 + x, 130 + y, 1, 2);
        g2d.fillRect(119 + x, 132 + y, 1, 1);
        g2d.fillRect(95 + x, 133 + y, 1, 11);
        g2d.fillRect(116 + x, 133 + y, 1, 13);
        g2d.fillRect(119 + x, 134 + y, 1, 1);
        g2d.fillRect(96 + x, 135 + y, 1, 5);
        g2d.fillRect(97 + x, 138 + y, 1, 8);
        g2d.fillRect(115 + x, 138 + y, 1, 10);
        g2d.fillRect(120 + x, 138 + y, 1, 1);
        g2d.fillRect(98 + x, 139 + y, 1, 3);
        g2d.fillRect(119 + x, 140 + y, 1, 2);
        g2d.fillRect(98 + x, 143 + y, 1, 1);
        g2d.fillRect(100 + x, 143 + y, 1, 5);
        g2d.fillRect(114 + x, 143 + y, 1, 1);
        g2d.fillRect(118 + x, 143 + y, 1, 3);
        g2d.fillRect(120 + x, 143 + y, 1, 6);
        g2d.fillRect(113 + x, 146 + y, 1, 2);
        g2d.fillRect(117 + x, 146 + y, 1, 2);
        g2d.fillRect(96 + x, 147 + y, 1, 2);
        g2d.fillRect(119 + x, 147 + y, 1, 4);
        g2d.fillRect(116 + x, 148 + y, 1, 3);
        g2d.fillRect(90 + x, 149 + y, 1, 11);
        g2d.fillRect(97 + x, 149 + y, 1, 4);
        g2d.fillRect(112 + x, 149 + y, 1, 4);
        g2d.fillRect(115 + x, 149 + y, 1, 4);
        g2d.fillRect(118 + x, 149 + y, 1, 3);
        g2d.fillRect(89 + x, 151 + y, 1, 4);
        g2d.fillRect(100 + x, 151 + y, 1, 2);
        g2d.fillRect(117 + x, 151 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 5);
        g2d.fillRect(111 + x, 152 + y, 1, 8);
        g2d.fillRect(114 + x, 152 + y, 1, 1);
        g2d.fillRect(99 + x, 153 + y, 1, 3);
        g2d.fillRect(88 + x, 156 + y, 1, 4);
        g2d.fillRect(101 + x, 156 + y, 1, 4);
        g2d.fillRect(96 + x, 157 + y, 2, 1);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(89 + x, 158 + y, 1, 2);
        g2d.fillRect(112 + x, 158 + y, 1, 2);
        g2d.fillRect(113 + x, 158 + y, 1, 2);
        g2d.fillRect(116 + x, 158 + y, 1, 2);
        g2d.fillRect(118 + x, 158 + y, 1, 2);
        g2d.fillRect(87 + x, 160 + y, 1, 1);
        g2d.fillRect(102 + x, 160 + y, 1, 1);
        g2d.fillRect(120 + x, 160 + y, 3, 1);
        g2d.fillRect(122 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 87 + y, 2, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 2, 1);
        g2d.fillRect(115 + x, 89 + y, 3, 1);
        g2d.fillRect(105 + x, 90 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 11);
        g2d.fillRect(115 + x, 91 + y, 3, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 6);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 3);
        g2d.fillRect(117 + x, 92 + y, 1, 11);
        g2d.fillRect(118 + x, 92 + y, 1, 6);
        g2d.fillRect(101 + x, 97 + y, 1, 8);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(101 + x, 106 + y, 1, 1);
        g2d.fillRect(120 + x, 139 + y, 1, 4);
        g2d.fillRect(96 + x, 140 + y, 1, 7);
        g2d.fillRect(119 + x, 142 + y, 1, 5);
        g2d.fillRect(97 + x, 146 + y, 1, 3);
        g2d.fillRect(118 + x, 146 + y, 1, 3);
        g2d.fillRect(117 + x, 148 + y, 1, 3);
        g2d.fillRect(120 + x, 149 + y, 1, 3);
        g2d.fillRect(98 + x, 151 + y, 1, 1);
        g2d.fillRect(116 + x, 151 + y, 1, 1);
        g2d.fillRect(119 + x, 151 + y, 1, 2);
        g2d.fillRect(118 + x, 152 + y, 1, 1);
        g2d.fillRect(89 + x, 155 + y, 1, 3);
        g2d.fillRect(114 + x, 158 + y, 1, 2);
        g2d.fillRect(115 + x, 158 + y, 1, 2);
        g2d.fillRect(117 + x, 158 + y, 1, 2);
    }

}
