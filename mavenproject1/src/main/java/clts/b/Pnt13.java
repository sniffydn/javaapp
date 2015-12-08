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
public class Pnt13 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt13()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt13(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt13(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt13(int layer, ColorArray colorSwitch)
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
        g2d.fillRect(100 + x, 82 + y, 2, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 7);
        g2d.fillRect(117 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 6);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 1, 2);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 6);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(106 + x, 84 + y, 6, 1);
        g2d.fillRect(107 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 4, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 2, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 101 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 104 + y, 1, 4);
        g2d.fillRect(121 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 7);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(116 + x, 105 + y, 1, 4);
        g2d.fillRect(117 + x, 105 + y, 1, 2);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(96 + x, 107 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(96 + x, 109 + y, 1, 3);
        g2d.fillRect(99 + x, 109 + y, 1, 3);
        g2d.fillRect(100 + x, 111 + y, 1, 3);
        g2d.fillRect(102 + x, 111 + y, 1, 4);
        g2d.fillRect(120 + x, 114 + y, 2, 1);
        g2d.fillRect(113 + x, 115 + y, 2, 1);
        g2d.fillRect(121 + x, 115 + y, 1, 2);
        g2d.fillRect(122 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 6);
        g2d.fillRect(115 + x, 116 + y, 1, 2);
        g2d.fillRect(116 + x, 116 + y, 1, 6);
        g2d.fillRect(118 + x, 116 + y, 1, 4);
        g2d.fillRect(119 + x, 116 + y, 1, 3);
        g2d.fillRect(113 + x, 119 + y, 1, 1);
        g2d.fillRect(115 + x, 120 + y, 1, 2);
        g2d.fillRect(93 + x, 124 + y, 1, 2);
        g2d.fillRect(94 + x, 126 + y, 1, 4);
        g2d.fillRect(101 + x, 126 + y, 2, 1);
        g2d.fillRect(93 + x, 127 + y, 1, 1);
        g2d.fillRect(100 + x, 127 + y, 1, 4);
        g2d.fillRect(102 + x, 127 + y, 1, 1);
        g2d.fillRect(96 + x, 128 + y, 1, 3);
        g2d.fillRect(97 + x, 128 + y, 1, 3);
        g2d.fillRect(98 + x, 128 + y, 1, 3);
        g2d.fillRect(101 + x, 128 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(110 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(119 + x, 81 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 2, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 2, 1);
        g2d.fillRect(108 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 3, 1);
        g2d.fillRect(107 + x, 92 + y, 3, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 3);
        g2d.fillRect(113 + x, 92 + y, 2, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 3);
        g2d.fillRect(105 + x, 95 + y, 3, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 10);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 4);
        g2d.fillRect(106 + x, 100 + y, 1, 3);
        g2d.fillRect(105 + x, 103 + y, 1, 5);
        g2d.fillRect(104 + x, 108 + y, 1, 4);
        g2d.fillRect(114 + x, 108 + y, 1, 7);
        g2d.fillRect(103 + x, 109 + y, 1, 8);
        g2d.fillRect(120 + x, 109 + y, 1, 3);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(102 + x, 118 + y, 1, 6);
        g2d.fillRect(113 + x, 120 + y, 1, 16);
        g2d.fillRect(101 + x, 124 + y, 1, 2);
        g2d.fillRect(101 + x, 130 + y, 1, 1);
        g2d.fillRect(100 + x, 131 + y, 1, 11);
        g2d.fillRect(112 + x, 136 + y, 1, 11);
        g2d.fillRect(99 + x, 139 + y, 1, 3);
        g2d.fillRect(101 + x, 142 + y, 1, 16);
        g2d.fillRect(111 + x, 147 + y, 1, 11);
        g2d.fillRect(102 + x, 154 + y, 1, 8);
        g2d.fillRect(117 + x, 154 + y, 1, 5);
        g2d.fillRect(98 + x, 155 + y, 1, 4);
        g2d.fillRect(97 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 1);
        g2d.fillRect(110 + x, 157 + y, 1, 5);
        g2d.fillRect(112 + x, 157 + y, 3, 1);
        g2d.fillRect(118 + x, 157 + y, 1, 2);
        g2d.fillRect(93 + x, 158 + y, 4, 1);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 158 + y, 3, 1);
        g2d.fillRect(101 + x, 162 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(92 + x, 163 + y, 1, 2);
        g2d.fillRect(93 + x, 163 + y, 1, 2);
        g2d.fillRect(94 + x, 163 + y, 1, 2);
        g2d.fillRect(95 + x, 163 + y, 1, 2);
        g2d.fillRect(96 + x, 163 + y, 1, 2);
        g2d.fillRect(97 + x, 163 + y, 1, 2);
        g2d.fillRect(115 + x, 163 + y, 1, 2);
        g2d.fillRect(116 + x, 163 + y, 1, 2);
        g2d.fillRect(117 + x, 163 + y, 1, 2);
        g2d.fillRect(118 + x, 163 + y, 1, 2);
        g2d.fillRect(119 + x, 163 + y, 1, 2);
        g2d.fillRect(121 + x, 163 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 5, 1);
        g2d.fillRect(107 + x, 91 + y, 3, 1);
        g2d.fillRect(113 + x, 91 + y, 2, 1);
        g2d.fillRect(105 + x, 92 + y, 2, 1);
        g2d.fillRect(115 + x, 92 + y, 3, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 3, 1);
        g2d.fillRect(115 + x, 95 + y, 2, 1);
        g2d.fillRect(105 + x, 96 + y, 2, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 8);
        g2d.fillRect(106 + x, 97 + y, 1, 3);
        g2d.fillRect(105 + x, 100 + y, 1, 3);
        g2d.fillRect(104 + x, 103 + y, 1, 5);
        g2d.fillRect(103 + x, 108 + y, 1, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 1);
        g2d.fillRect(102 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(119 + x, 109 + y, 1, 3);
        g2d.fillRect(97 + x, 112 + y, 1, 3);
        g2d.fillRect(115 + x, 112 + y, 1, 4);
        g2d.fillRect(116 + x, 112 + y, 1, 2);
        g2d.fillRect(120 + x, 112 + y, 1, 2);
        g2d.fillRect(102 + x, 115 + y, 1, 3);
        g2d.fillRect(101 + x, 118 + y, 1, 6);
        g2d.fillRect(114 + x, 122 + y, 1, 18);
        g2d.fillRect(100 + x, 124 + y, 1, 3);
        g2d.fillRect(99 + x, 132 + y, 1, 7);
        g2d.fillRect(113 + x, 136 + y, 1, 11);
        g2d.fillRect(98 + x, 138 + y, 1, 9);
        g2d.fillRect(115 + x, 139 + y, 1, 7);
        g2d.fillRect(100 + x, 142 + y, 1, 15);
        g2d.fillRect(112 + x, 147 + y, 1, 10);
        g2d.fillRect(117 + x, 149 + y, 1, 5);
        g2d.fillRect(98 + x, 150 + y, 1, 5);
        g2d.fillRect(116 + x, 153 + y, 1, 5);
        g2d.fillRect(89 + x, 155 + y, 1, 7);
        g2d.fillRect(97 + x, 155 + y, 1, 2);
        g2d.fillRect(113 + x, 155 + y, 1, 2);
        g2d.fillRect(114 + x, 155 + y, 1, 2);
        g2d.fillRect(118 + x, 155 + y, 1, 2);
        g2d.fillRect(124 + x, 155 + y, 1, 7);
        g2d.fillRect(94 + x, 157 + y, 3, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(115 + x, 157 + y, 1, 1);
        g2d.fillRect(119 + x, 157 + y, 1, 2);
        g2d.fillRect(90 + x, 158 + y, 3, 1);
        g2d.fillRect(100 + x, 158 + y, 1, 3);
        g2d.fillRect(101 + x, 158 + y, 1, 4);
        g2d.fillRect(111 + x, 158 + y, 1, 4);
        g2d.fillRect(112 + x, 158 + y, 2, 1);
        g2d.fillRect(120 + x, 158 + y, 4, 1);
        g2d.fillRect(90 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 1, 3);
        g2d.fillRect(99 + x, 162 + y, 1, 3);
        g2d.fillRect(100 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 2, 1);
        g2d.fillRect(123 + x, 162 + y, 1, 1);
        g2d.fillRect(120 + x, 163 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 2, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 3);
        g2d.fillRect(107 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 1, 12);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 5, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 4);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 4, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 93 + y, 1, 2);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(121 + x, 93 + y, 1, 3);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 4, 1);
        g2d.fillRect(103 + x, 96 + y, 2, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 9);
        g2d.fillRect(116 + x, 96 + y, 1, 9);
        g2d.fillRect(100 + x, 97 + y, 1, 3);
        g2d.fillRect(101 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 97 + y, 1, 3);
        g2d.fillRect(104 + x, 97 + y, 1, 6);
        g2d.fillRect(105 + x, 97 + y, 1, 3);
        g2d.fillRect(117 + x, 97 + y, 1, 3);
        g2d.fillRect(118 + x, 97 + y, 1, 3);
        g2d.fillRect(119 + x, 97 + y, 1, 2);
        g2d.fillRect(120 + x, 97 + y, 1, 2);
        g2d.fillRect(121 + x, 97 + y, 1, 4);
        g2d.fillRect(98 + x, 101 + y, 1, 6);
        g2d.fillRect(103 + x, 101 + y, 1, 7);
        g2d.fillRect(102 + x, 105 + y, 1, 4);
        g2d.fillRect(99 + x, 107 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 3);
        g2d.fillRect(117 + x, 111 + y, 1, 5);
        g2d.fillRect(118 + x, 111 + y, 1, 4);
        g2d.fillRect(119 + x, 112 + y, 1, 3);
        g2d.fillRect(98 + x, 114 + y, 1, 2);
        g2d.fillRect(116 + x, 114 + y, 1, 2);
        g2d.fillRect(96 + x, 115 + y, 1, 7);
        g2d.fillRect(97 + x, 115 + y, 1, 4);
        g2d.fillRect(100 + x, 115 + y, 1, 9);
        g2d.fillRect(101 + x, 115 + y, 1, 3);
        g2d.fillRect(99 + x, 119 + y, 1, 8);
        g2d.fillRect(95 + x, 120 + y, 1, 7);
        g2d.fillRect(120 + x, 120 + y, 1, 11);
        g2d.fillRect(115 + x, 122 + y, 1, 17);
        g2d.fillRect(116 + x, 122 + y, 1, 31);
        g2d.fillRect(98 + x, 123 + y, 1, 4);
        g2d.fillRect(94 + x, 124 + y, 1, 2);
        g2d.fillRect(121 + x, 124 + y, 1, 18);
        g2d.fillRect(93 + x, 130 + y, 1, 5);
        g2d.fillRect(94 + x, 130 + y, 1, 1);
        g2d.fillRect(97 + x, 132 + y, 1, 23);
        g2d.fillRect(98 + x, 132 + y, 1, 6);
        g2d.fillRect(92 + x, 135 + y, 1, 7);
        g2d.fillRect(118 + x, 138 + y, 1, 17);
        g2d.fillRect(91 + x, 139 + y, 1, 14);
        g2d.fillRect(122 + x, 139 + y, 1, 14);
        g2d.fillRect(114 + x, 140 + y, 1, 15);
        g2d.fillRect(117 + x, 140 + y, 1, 9);
        g2d.fillRect(96 + x, 142 + y, 1, 15);
        g2d.fillRect(99 + x, 142 + y, 1, 5);
        g2d.fillRect(123 + x, 145 + y, 1, 13);
        g2d.fillRect(90 + x, 147 + y, 1, 11);
        g2d.fillRect(98 + x, 147 + y, 1, 3);
        g2d.fillRect(113 + x, 147 + y, 1, 8);
        g2d.fillRect(94 + x, 149 + y, 1, 8);
        g2d.fillRect(120 + x, 149 + y, 1, 9);
        g2d.fillRect(93 + x, 151 + y, 1, 7);
        g2d.fillRect(99 + x, 153 + y, 1, 4);
        g2d.fillRect(115 + x, 153 + y, 1, 4);
        g2d.fillRect(92 + x, 154 + y, 1, 4);
        g2d.fillRect(119 + x, 154 + y, 1, 3);
        g2d.fillRect(121 + x, 154 + y, 1, 4);
        g2d.fillRect(90 + x, 159 + y, 1, 3);
        g2d.fillRect(91 + x, 159 + y, 1, 4);
        g2d.fillRect(92 + x, 159 + y, 1, 4);
        g2d.fillRect(93 + x, 159 + y, 1, 2);
        g2d.fillRect(94 + x, 159 + y, 1, 2);
        g2d.fillRect(95 + x, 159 + y, 1, 2);
        g2d.fillRect(96 + x, 159 + y, 1, 2);
        g2d.fillRect(97 + x, 159 + y, 1, 3);
        g2d.fillRect(98 + x, 159 + y, 1, 3);
        g2d.fillRect(99 + x, 159 + y, 1, 3);
        g2d.fillRect(112 + x, 159 + y, 1, 3);
        g2d.fillRect(113 + x, 159 + y, 1, 3);
        g2d.fillRect(114 + x, 159 + y, 1, 6);
        g2d.fillRect(115 + x, 159 + y, 1, 2);
        g2d.fillRect(116 + x, 159 + y, 1, 2);
        g2d.fillRect(117 + x, 159 + y, 1, 2);
        g2d.fillRect(118 + x, 159 + y, 1, 2);
        g2d.fillRect(119 + x, 159 + y, 1, 3);
        g2d.fillRect(121 + x, 159 + y, 1, 4);
        g2d.fillRect(122 + x, 159 + y, 1, 4);
        g2d.fillRect(123 + x, 159 + y, 1, 3);
        g2d.fillRect(100 + x, 161 + y, 1, 1);
        g2d.fillRect(120 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 2, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 2, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 4);
        g2d.fillRect(101 + x, 99 + y, 1, 1);
        g2d.fillRect(100 + x, 100 + y, 1, 4);
        g2d.fillRect(102 + x, 100 + y, 1, 5);
        g2d.fillRect(117 + x, 100 + y, 1, 5);
        g2d.fillRect(118 + x, 100 + y, 1, 3);
        g2d.fillRect(120 + x, 100 + y, 1, 3);
        g2d.fillRect(99 + x, 103 + y, 1, 4);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 105 + y, 1, 3);
        g2d.fillRect(100 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 114 + y, 1, 5);
        g2d.fillRect(98 + x, 116 + y, 1, 4);
        g2d.fillRect(97 + x, 119 + y, 1, 3);
        g2d.fillRect(119 + x, 120 + y, 1, 14);
        g2d.fillRect(96 + x, 122 + y, 1, 4);
        g2d.fillRect(117 + x, 122 + y, 2, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 1);
        g2d.fillRect(117 + x, 124 + y, 1, 16);
        g2d.fillRect(94 + x, 131 + y, 1, 3);
        g2d.fillRect(120 + x, 131 + y, 1, 18);
        g2d.fillRect(96 + x, 132 + y, 1, 10);
        g2d.fillRect(93 + x, 135 + y, 1, 8);
        g2d.fillRect(118 + x, 135 + y, 1, 3);
        g2d.fillRect(92 + x, 142 + y, 1, 4);
        g2d.fillRect(121 + x, 142 + y, 1, 4);
        g2d.fillRect(94 + x, 143 + y, 1, 6);
        g2d.fillRect(93 + x, 146 + y, 1, 5);
        g2d.fillRect(115 + x, 146 + y, 1, 1);
        g2d.fillRect(99 + x, 147 + y, 1, 2);
        g2d.fillRect(119 + x, 149 + y, 1, 5);
        g2d.fillRect(92 + x, 150 + y, 1, 4);
        g2d.fillRect(115 + x, 150 + y, 1, 3);
        g2d.fillRect(121 + x, 150 + y, 1, 4);
        g2d.fillRect(99 + x, 151 + y, 1, 2);
        g2d.fillRect(91 + x, 153 + y, 1, 5);
        g2d.fillRect(122 + x, 153 + y, 1, 5);
        g2d.fillRect(95 + x, 154 + y, 1, 3);
        g2d.fillRect(120 + x, 159 + y, 1, 3);
        g2d.fillRect(93 + x, 161 + y, 2, 1);
        g2d.fillRect(96 + x, 161 + y, 1, 2);
        g2d.fillRect(115 + x, 161 + y, 1, 2);
        g2d.fillRect(117 + x, 161 + y, 2, 1);
        g2d.fillRect(97 + x, 162 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 1, 3);
        g2d.fillRect(118 + x, 162 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(104 + x, 86 + y, 1, 4);
        g2d.fillRect(105 + x, 86 + y, 3, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 2, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(118 + x, 105 + y, 1, 2);
        g2d.fillRect(120 + x, 105 + y, 1, 3);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 4);
        g2d.fillRect(96 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 6);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(119 + x, 108 + y, 1, 1);
        g2d.fillRect(100 + x, 109 + y, 1, 2);
        g2d.fillRect(101 + x, 109 + y, 1, 6);
        g2d.fillRect(118 + x, 109 + y, 1, 2);
        g2d.fillRect(99 + x, 112 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 1, 1);
        g2d.fillRect(122 + x, 114 + y, 1, 1);
        g2d.fillRect(118 + x, 115 + y, 3, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 3);
        g2d.fillRect(117 + x, 116 + y, 1, 6);
        g2d.fillRect(120 + x, 116 + y, 1, 4);
        g2d.fillRect(115 + x, 118 + y, 1, 2);
        g2d.fillRect(119 + x, 119 + y, 1, 1);
        g2d.fillRect(118 + x, 120 + y, 1, 2);
        g2d.fillRect(93 + x, 126 + y, 1, 1);
        g2d.fillRect(95 + x, 127 + y, 1, 5);
        g2d.fillRect(96 + x, 127 + y, 4, 1);
        g2d.fillRect(101 + x, 127 + y, 1, 1);
        g2d.fillRect(99 + x, 128 + y, 1, 4);
        g2d.fillRect(96 + x, 131 + y, 3, 1);
        g2d.fillRect(111 + x, 163 + y, 1, 2);
        g2d.fillRect(112 + x, 163 + y, 1, 2);
        g2d.fillRect(113 + x, 163 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 2);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 2, 1);
        g2d.fillRect(119 + x, 99 + y, 2, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 2);
        g2d.fillRect(100 + x, 104 + y, 1, 4);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(98 + x, 120 + y, 1, 3);
        g2d.fillRect(97 + x, 122 + y, 1, 5);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(118 + x, 124 + y, 1, 6);
        g2d.fillRect(96 + x, 126 + y, 1, 1);
        g2d.fillRect(118 + x, 134 + y, 2, 1);
        g2d.fillRect(95 + x, 135 + y, 1, 11);
        g2d.fillRect(119 + x, 135 + y, 1, 14);
        g2d.fillRect(94 + x, 138 + y, 1, 5);
        g2d.fillRect(93 + x, 143 + y, 1, 3);
        g2d.fillRect(92 + x, 146 + y, 1, 4);
        g2d.fillRect(121 + x, 146 + y, 1, 4);
        g2d.fillRect(115 + x, 147 + y, 1, 3);
        g2d.fillRect(95 + x, 149 + y, 1, 5);
        g2d.fillRect(99 + x, 149 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 3);
        g2d.fillRect(118 + x, 103 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 1, 4);
        g2d.fillRect(95 + x, 132 + y, 1, 3);
        g2d.fillRect(94 + x, 134 + y, 1, 4);
        g2d.fillRect(95 + x, 146 + y, 1, 3);
        g2d.fillRect(99 + x, 150 + y, 1, 1);
        g2d.fillRect(95 + x, 161 + y, 1, 2);
        g2d.fillRect(116 + x, 161 + y, 1, 2);
        g2d.fillRect(93 + x, 162 + y, 2, 1);
        g2d.fillRect(117 + x, 162 + y, 1, 1);
    }
}
