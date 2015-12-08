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
public class Pnt15 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt15()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt15(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt15(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt15(int layer, ColorArray colorSwitch)
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
    
    
    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        return new obsolete.Pnt15_1(c);
    }



    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 84 + y, 1, 13);
        g2d.fillRect(107 + x, 89 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 5);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 3, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 7);
        g2d.fillRect(115 + x, 92 + y, 1, 4);
        g2d.fillRect(116 + x, 95 + y, 1, 7);
        g2d.fillRect(106 + x, 96 + y, 1, 5);
        g2d.fillRect(121 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 4);
        g2d.fillRect(121 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(104 + x, 106 + y, 1, 2);
        g2d.fillRect(116 + x, 106 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 1, 2);
        g2d.fillRect(103 + x, 112 + y, 1, 1);
        g2d.fillRect(116 + x, 117 + y, 1, 35);
        g2d.fillRect(117 + x, 122 + y, 1, 5);
        g2d.fillRect(118 + x, 129 + y, 1, 2);
        g2d.fillRect(102 + x, 146 + y, 1, 4);
        g2d.fillRect(114 + x, 146 + y, 1, 5);
        g2d.fillRect(117 + x, 150 + y, 1, 6);
        g2d.fillRect(102 + x, 151 + y, 1, 9);
        g2d.fillRect(113 + x, 151 + y, 1, 5);
        g2d.fillRect(89 + x, 154 + y, 1, 2);
        g2d.fillRect(90 + x, 154 + y, 1, 4);
        g2d.fillRect(91 + x, 156 + y, 1, 3);
        g2d.fillRect(118 + x, 156 + y, 1, 2);
        g2d.fillRect(92 + x, 158 + y, 1, 1);
        g2d.fillRect(93 + x, 159 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 2, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 5);
        g2d.fillRect(106 + x, 87 + y, 4, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 4);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 2, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(100 + x, 92 + y, 1, 4);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 4);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(115 + x, 96 + y, 1, 3);
        g2d.fillRect(117 + x, 97 + y, 1, 25);
        g2d.fillRect(121 + x, 97 + y, 1, 2);
        g2d.fillRect(105 + x, 99 + y, 1, 2);
        g2d.fillRect(107 + x, 99 + y, 1, 2);
        g2d.fillRect(99 + x, 100 + y, 1, 2);
        g2d.fillRect(121 + x, 100 + y, 1, 1);
        g2d.fillRect(106 + x, 101 + y, 1, 4);
        g2d.fillRect(116 + x, 102 + y, 1, 2);
        g2d.fillRect(121 + x, 102 + y, 1, 21);
        g2d.fillRect(104 + x, 104 + y, 1, 2);
        g2d.fillRect(105 + x, 105 + y, 1, 4);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(104 + x, 108 + y, 1, 6);
        g2d.fillRect(116 + x, 108 + y, 1, 2);
        g2d.fillRect(103 + x, 109 + y, 1, 3);
        g2d.fillRect(116 + x, 112 + y, 1, 5);
        g2d.fillRect(102 + x, 113 + y, 1, 33);
        g2d.fillRect(103 + x, 113 + y, 1, 8);
        g2d.fillRect(98 + x, 114 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 1, 2);
        g2d.fillRect(99 + x, 116 + y, 1, 1);
        g2d.fillRect(118 + x, 116 + y, 1, 1);
        g2d.fillRect(98 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 118 + y, 1, 2);
        g2d.fillRect(98 + x, 120 + y, 1, 2);
        g2d.fillRect(122 + x, 124 + y, 1, 10);
        g2d.fillRect(115 + x, 125 + y, 1, 19);
        g2d.fillRect(118 + x, 126 + y, 1, 3);
        g2d.fillRect(117 + x, 127 + y, 1, 2);
        g2d.fillRect(118 + x, 131 + y, 1, 4);
        g2d.fillRect(123 + x, 134 + y, 1, 9);
        g2d.fillRect(119 + x, 135 + y, 1, 4);
        g2d.fillRect(96 + x, 138 + y, 1, 1);
        g2d.fillRect(100 + x, 141 + y, 1, 10);
        g2d.fillRect(114 + x, 141 + y, 1, 5);
        g2d.fillRect(95 + x, 142 + y, 1, 2);
        g2d.fillRect(124 + x, 143 + y, 1, 9);
        g2d.fillRect(117 + x, 147 + y, 1, 3);
        g2d.fillRect(94 + x, 148 + y, 1, 3);
        g2d.fillRect(90 + x, 150 + y, 1, 4);
        g2d.fillRect(99 + x, 150 + y, 1, 5);
        g2d.fillRect(102 + x, 150 + y, 1, 1);
        g2d.fillRect(113 + x, 150 + y, 1, 1);
        g2d.fillRect(114 + x, 151 + y, 1, 1);
        g2d.fillRect(89 + x, 152 + y, 1, 2);
        g2d.fillRect(116 + x, 152 + y, 1, 3);
        g2d.fillRect(125 + x, 152 + y, 1, 7);
        g2d.fillRect(98 + x, 154 + y, 1, 2);
        g2d.fillRect(91 + x, 155 + y, 1, 1);
        g2d.fillRect(93 + x, 155 + y, 1, 4);
        g2d.fillRect(89 + x, 156 + y, 1, 2);
        g2d.fillRect(92 + x, 156 + y, 1, 2);
        g2d.fillRect(96 + x, 156 + y, 1, 2);
        g2d.fillRect(97 + x, 156 + y, 1, 2);
        g2d.fillRect(113 + x, 156 + y, 1, 3);
        g2d.fillRect(117 + x, 156 + y, 1, 2);
        g2d.fillRect(90 + x, 158 + y, 1, 1);
        g2d.fillRect(118 + x, 158 + y, 2, 1);
        g2d.fillRect(92 + x, 159 + y, 1, 1);
        g2d.fillRect(96 + x, 159 + y, 3, 1);
        g2d.fillRect(112 + x, 159 + y, 1, 2);
        g2d.fillRect(124 + x, 159 + y, 1, 1);
        g2d.fillRect(93 + x, 160 + y, 3, 1);
        g2d.fillRect(118 + x, 160 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 83 + y, 4, 1);
        g2d.fillRect(101 + x, 84 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 3);
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 3);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 2, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 4);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 2);
        g2d.fillRect(99 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 5);
        g2d.fillRect(99 + x, 102 + y, 1, 3);
        g2d.fillRect(104 + x, 102 + y, 1, 2);
        g2d.fillRect(103 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 4);
        g2d.fillRect(97 + x, 112 + y, 1, 4);
        g2d.fillRect(102 + x, 112 + y, 1, 1);
        g2d.fillRect(96 + x, 114 + y, 1, 6);
        g2d.fillRect(99 + x, 114 + y, 1, 2);
        g2d.fillRect(101 + x, 114 + y, 1, 16);
        g2d.fillRect(118 + x, 114 + y, 1, 2);
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(100 + x, 116 + y, 1, 1);
        g2d.fillRect(119 + x, 116 + y, 1, 2);
        g2d.fillRect(120 + x, 116 + y, 1, 7);
        g2d.fillRect(99 + x, 117 + y, 1, 1);
        g2d.fillRect(118 + x, 117 + y, 1, 9);
        g2d.fillRect(98 + x, 118 + y, 1, 2);
        g2d.fillRect(100 + x, 118 + y, 1, 3);
        g2d.fillRect(95 + x, 120 + y, 1, 2);
        g2d.fillRect(99 + x, 120 + y, 1, 2);
        g2d.fillRect(98 + x, 122 + y, 1, 7);
        g2d.fillRect(121 + x, 123 + y, 1, 6);
        g2d.fillRect(94 + x, 124 + y, 1, 3);
        g2d.fillRect(93 + x, 129 + y, 1, 4);
        g2d.fillRect(117 + x, 129 + y, 1, 2);
        g2d.fillRect(97 + x, 130 + y, 1, 1);
        g2d.fillRect(92 + x, 134 + y, 1, 4);
        g2d.fillRect(100 + x, 135 + y, 1, 6);
        g2d.fillRect(113 + x, 135 + y, 1, 2);
        g2d.fillRect(118 + x, 135 + y, 1, 2);
        g2d.fillRect(96 + x, 137 + y, 1, 1);
        g2d.fillRect(117 + x, 138 + y, 1, 9);
        g2d.fillRect(114 + x, 139 + y, 1, 2);
        g2d.fillRect(119 + x, 139 + y, 1, 4);
        g2d.fillRect(91 + x, 141 + y, 1, 3);
        g2d.fillRect(95 + x, 141 + y, 1, 1);
        g2d.fillRect(120 + x, 142 + y, 1, 6);
        g2d.fillRect(95 + x, 144 + y, 1, 3);
        g2d.fillRect(90 + x, 147 + y, 1, 3);
        g2d.fillRect(94 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 147 + y, 1, 3);
        g2d.fillRect(113 + x, 148 + y, 1, 2);
        g2d.fillRect(100 + x, 151 + y, 1, 1);
        g2d.fillRect(91 + x, 152 + y, 1, 3);
        g2d.fillRect(93 + x, 152 + y, 1, 3);
        g2d.fillRect(98 + x, 152 + y, 1, 2);
        g2d.fillRect(114 + x, 152 + y, 1, 3);
        g2d.fillRect(124 + x, 152 + y, 1, 3);
        g2d.fillRect(92 + x, 155 + y, 1, 1);
        g2d.fillRect(97 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 155 + y, 1, 1);
        g2d.fillRect(116 + x, 155 + y, 1, 1);
        g2d.fillRect(118 + x, 155 + y, 1, 1);
        g2d.fillRect(95 + x, 156 + y, 1, 2);
        g2d.fillRect(98 + x, 156 + y, 1, 2);
        g2d.fillRect(119 + x, 156 + y, 1, 2);
        g2d.fillRect(89 + x, 158 + y, 1, 2);
        g2d.fillRect(117 + x, 158 + y, 1, 1);
        g2d.fillRect(120 + x, 158 + y, 2, 1);
        g2d.fillRect(90 + x, 159 + y, 2, 1);
        g2d.fillRect(99 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 159 + y, 1, 2);
        g2d.fillRect(125 + x, 159 + y, 1, 1);
        g2d.fillRect(96 + x, 160 + y, 1, 1);
        g2d.fillRect(116 + x, 160 + y, 2, 1);
        g2d.fillRect(124 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(117 + x, 84 + y, 2, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 1, 4);
        g2d.fillRect(114 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(120 + x, 86 + y, 1, 4);
        g2d.fillRect(119 + x, 87 + y, 1, 5);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 6);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 6);
        g2d.fillRect(118 + x, 93 + y, 1, 6);
        g2d.fillRect(101 + x, 96 + y, 1, 5);
        g2d.fillRect(114 + x, 96 + y, 1, 8);
        g2d.fillRect(120 + x, 96 + y, 1, 3);
        g2d.fillRect(103 + x, 99 + y, 1, 2);
        g2d.fillRect(120 + x, 100 + y, 1, 2);
        g2d.fillRect(100 + x, 102 + y, 1, 4);
        g2d.fillRect(102 + x, 104 + y, 1, 4);
        g2d.fillRect(115 + x, 104 + y, 1, 6);
        g2d.fillRect(118 + x, 105 + y, 1, 5);
        g2d.fillRect(101 + x, 109 + y, 1, 3);
        g2d.fillRect(120 + x, 110 + y, 1, 4);
        g2d.fillRect(100 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 2);
        g2d.fillRect(97 + x, 118 + y, 1, 3);
        g2d.fillRect(96 + x, 121 + y, 1, 2);
        g2d.fillRect(114 + x, 121 + y, 1, 2);
        g2d.fillRect(119 + x, 122 + y, 1, 4);
        g2d.fillRect(115 + x, 123 + y, 1, 2);
        g2d.fillRect(97 + x, 125 + y, 1, 2);
        g2d.fillRect(99 + x, 125 + y, 1, 4);
        g2d.fillRect(95 + x, 126 + y, 1, 1);
        g2d.fillRect(96 + x, 129 + y, 1, 4);
        g2d.fillRect(94 + x, 130 + y, 1, 3);
        g2d.fillRect(98 + x, 130 + y, 1, 5);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(119 + x, 131 + y, 1, 2);
        g2d.fillRect(119 + x, 134 + y, 1, 1);
        g2d.fillRect(121 + x, 134 + y, 1, 1);
        g2d.fillRect(93 + x, 135 + y, 1, 3);
        g2d.fillRect(95 + x, 135 + y, 1, 4);
        g2d.fillRect(113 + x, 137 + y, 2, 1);
        g2d.fillRect(97 + x, 138 + y, 1, 3);
        g2d.fillRect(120 + x, 138 + y, 1, 3);
        g2d.fillRect(96 + x, 139 + y, 1, 2);
        g2d.fillRect(99 + x, 139 + y, 1, 4);
        g2d.fillRect(118 + x, 139 + y, 1, 5);
        g2d.fillRect(92 + x, 142 + y, 1, 2);
        g2d.fillRect(94 + x, 142 + y, 1, 4);
        g2d.fillRect(96 + x, 142 + y, 1, 2);
        g2d.fillRect(98 + x, 143 + y, 1, 4);
        g2d.fillRect(101 + x, 144 + y, 1, 7);
        g2d.fillRect(119 + x, 144 + y, 1, 4);
        g2d.fillRect(122 + x, 144 + y, 1, 2);
        g2d.fillRect(112 + x, 146 + y, 1, 2);
        g2d.fillRect(91 + x, 147 + y, 1, 5);
        g2d.fillRect(93 + x, 147 + y, 1, 4);
        g2d.fillRect(97 + x, 147 + y, 1, 3);
        g2d.fillRect(113 + x, 147 + y, 1, 1);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 2);
        g2d.fillRect(92 + x, 150 + y, 1, 4);
        g2d.fillRect(96 + x, 150 + y, 1, 2);
        g2d.fillRect(118 + x, 150 + y, 1, 2);
        g2d.fillRect(122 + x, 150 + y, 1, 2);
        g2d.fillRect(94 + x, 151 + y, 1, 5);
        g2d.fillRect(120 + x, 151 + y, 1, 1);
        g2d.fillRect(123 + x, 151 + y, 1, 1);
        g2d.fillRect(95 + x, 152 + y, 1, 3);
        g2d.fillRect(111 + x, 152 + y, 1, 9);
        g2d.fillRect(115 + x, 152 + y, 1, 4);
        g2d.fillRect(119 + x, 152 + y, 1, 3);
        g2d.fillRect(121 + x, 154 + y, 1, 1);
        g2d.fillRect(110 + x, 155 + y, 1, 6);
        g2d.fillRect(120 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 155 + y, 1, 3);
        g2d.fillRect(101 + x, 156 + y, 1, 2);
        g2d.fillRect(112 + x, 156 + y, 1, 3);
        g2d.fillRect(114 + x, 156 + y, 1, 2);
        g2d.fillRect(121 + x, 156 + y, 1, 2);
        g2d.fillRect(123 + x, 156 + y, 1, 2);
        g2d.fillRect(97 + x, 158 + y, 1, 1);
        g2d.fillRect(100 + x, 158 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 1);
        g2d.fillRect(115 + x, 159 + y, 1, 1);
        g2d.fillRect(119 + x, 159 + y, 3, 1);
        g2d.fillRect(123 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 4, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 6);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 6);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(101 + x, 92 + y, 1, 4);
        g2d.fillRect(117 + x, 92 + y, 1, 3);
        g2d.fillRect(100 + x, 97 + y, 1, 5);
        g2d.fillRect(103 + x, 101 + y, 1, 7);
        g2d.fillRect(98 + x, 104 + y, 1, 4);
        g2d.fillRect(99 + x, 105 + y, 1, 7);
        g2d.fillRect(97 + x, 109 + y, 1, 3);
        g2d.fillRect(98 + x, 110 + y, 1, 4);
        g2d.fillRect(118 + x, 110 + y, 1, 4);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(99 + x, 113 + y, 2, 1);
        g2d.fillRect(119 + x, 114 + y, 1, 2);
        g2d.fillRect(120 + x, 114 + y, 1, 2);
        g2d.fillRect(97 + x, 116 + y, 1, 2);
        g2d.fillRect(119 + x, 118 + y, 1, 4);
        g2d.fillRect(96 + x, 120 + y, 1, 1);
        g2d.fillRect(100 + x, 121 + y, 1, 14);
        g2d.fillRect(95 + x, 122 + y, 1, 4);
        g2d.fillRect(99 + x, 122 + y, 1, 3);
        g2d.fillRect(120 + x, 123 + y, 1, 7);
        g2d.fillRect(94 + x, 127 + y, 1, 3);
        g2d.fillRect(97 + x, 127 + y, 1, 3);
        g2d.fillRect(98 + x, 129 + y, 1, 1);
        g2d.fillRect(121 + x, 129 + y, 1, 5);
        g2d.fillRect(101 + x, 130 + y, 1, 14);
        g2d.fillRect(97 + x, 131 + y, 1, 7);
        g2d.fillRect(117 + x, 131 + y, 1, 7);
        g2d.fillRect(93 + x, 133 + y, 1, 2);
        g2d.fillRect(96 + x, 133 + y, 1, 4);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(122 + x, 134 + y, 1, 10);
        g2d.fillRect(118 + x, 137 + y, 1, 2);
        g2d.fillRect(92 + x, 138 + y, 1, 4);
        g2d.fillRect(95 + x, 139 + y, 1, 2);
        g2d.fillRect(96 + x, 141 + y, 1, 1);
        g2d.fillRect(120 + x, 141 + y, 1, 1);
        g2d.fillRect(99 + x, 143 + y, 1, 4);
        g2d.fillRect(123 + x, 143 + y, 1, 8);
        g2d.fillRect(115 + x, 144 + y, 1, 8);
        g2d.fillRect(98 + x, 147 + y, 1, 5);
        g2d.fillRect(120 + x, 148 + y, 1, 3);
        g2d.fillRect(121 + x, 148 + y, 1, 2);
        g2d.fillRect(97 + x, 150 + y, 1, 5);
        g2d.fillRect(121 + x, 151 + y, 1, 3);
        g2d.fillRect(96 + x, 152 + y, 1, 4);
        g2d.fillRect(100 + x, 152 + y, 1, 3);
        g2d.fillRect(118 + x, 152 + y, 1, 3);
        g2d.fillRect(122 + x, 152 + y, 1, 3);
        g2d.fillRect(123 + x, 152 + y, 1, 4);
        g2d.fillRect(95 + x, 155 + y, 1, 1);
        g2d.fillRect(114 + x, 155 + y, 1, 1);
        g2d.fillRect(119 + x, 155 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 3);
        g2d.fillRect(94 + x, 156 + y, 1, 3);
        g2d.fillRect(99 + x, 156 + y, 1, 2);
        g2d.fillRect(116 + x, 156 + y, 1, 2);
        g2d.fillRect(120 + x, 156 + y, 1, 2);
        g2d.fillRect(95 + x, 158 + y, 2, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 3);
        g2d.fillRect(114 + x, 158 + y, 1, 3);
        g2d.fillRect(122 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 158 + y, 1, 1);
        g2d.fillRect(100 + x, 159 + y, 1, 1);
        g2d.fillRect(90 + x, 160 + y, 3, 1);
        g2d.fillRect(97 + x, 160 + y, 1, 1);
        g2d.fillRect(115 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 85 + y, 4, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 3);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 3, 1);
        g2d.fillRect(114 + x, 86 + y, 2, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 5, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 4, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 3, 1);
        g2d.fillRect(116 + x, 90 + y, 3, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 7);
        g2d.fillRect(103 + x, 92 + y, 1, 7);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 22);
        g2d.fillRect(102 + x, 95 + y, 1, 9);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 3);
        g2d.fillRect(118 + x, 99 + y, 1, 6);
        g2d.fillRect(120 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 100 + y, 1, 4);
        g2d.fillRect(101 + x, 101 + y, 1, 8);
        g2d.fillRect(120 + x, 102 + y, 1, 8);
        g2d.fillRect(100 + x, 106 + y, 1, 6);
        g2d.fillRect(102 + x, 108 + y, 1, 4);
        g2d.fillRect(99 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 7);
        g2d.fillRect(97 + x, 121 + y, 1, 4);
        g2d.fillRect(96 + x, 123 + y, 1, 6);
        g2d.fillRect(114 + x, 123 + y, 1, 14);
        g2d.fillRect(119 + x, 126 + y, 1, 5);
        g2d.fillRect(95 + x, 127 + y, 1, 8);
        g2d.fillRect(99 + x, 129 + y, 1, 10);
        g2d.fillRect(120 + x, 131 + y, 1, 7);
        g2d.fillRect(94 + x, 133 + y, 1, 9);
        g2d.fillRect(98 + x, 135 + y, 1, 8);
        g2d.fillRect(121 + x, 135 + y, 1, 12);
        g2d.fillRect(93 + x, 138 + y, 1, 9);
        g2d.fillRect(113 + x, 138 + y, 1, 9);
        g2d.fillRect(114 + x, 138 + y, 1, 1);
        g2d.fillRect(97 + x, 141 + y, 1, 6);
        g2d.fillRect(119 + x, 143 + y, 1, 1);
        g2d.fillRect(91 + x, 144 + y, 1, 3);
        g2d.fillRect(92 + x, 144 + y, 1, 6);
        g2d.fillRect(96 + x, 144 + y, 1, 6);
        g2d.fillRect(118 + x, 144 + y, 1, 6);
        g2d.fillRect(94 + x, 146 + y, 1, 1);
        g2d.fillRect(122 + x, 146 + y, 1, 4);
        g2d.fillRect(95 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 148 + y, 1, 8);
        g2d.fillRect(119 + x, 148 + y, 1, 4);
        g2d.fillRect(95 + x, 150 + y, 1, 2);
        g2d.fillRect(121 + x, 150 + y, 1, 1);
        g2d.fillRect(93 + x, 151 + y, 1, 1);
        g2d.fillRect(101 + x, 151 + y, 1, 5);
        g2d.fillRect(120 + x, 152 + y, 1, 3);
        g2d.fillRect(92 + x, 154 + y, 1, 1);
        g2d.fillRect(100 + x, 155 + y, 1, 3);
        g2d.fillRect(121 + x, 155 + y, 1, 1);
        g2d.fillRect(115 + x, 156 + y, 1, 3);
        g2d.fillRect(98 + x, 158 + y, 2, 1);
        g2d.fillRect(116 + x, 158 + y, 1, 2);
        g2d.fillRect(117 + x, 159 + y, 2, 1);
        g2d.fillRect(98 + x, 160 + y, 2, 1);
    }

}
