/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

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
public class Pnt5 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Pnt5()
    {
        super();
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt5(int layer)
    {
        super(layer);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt5(ColorArray colorSwitch)
    {
        super(colorSwitch);
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt5(int layer, ColorArray colorSwitch)
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

    public void paintP(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 4);
        g2d.fillRect(112 + x, 84 + y, 2, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 4);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 96 + y, 1, 2);
        g2d.fillRect(128 + x, 129 + y, 1, 3);
        g2d.fillRect(129 + x, 135 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 3);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 3, 1);
        g2d.fillRect(114 + x, 84 + y, 5, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 2, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 4);
        g2d.fillRect(121 + x, 90 + y, 1, 4);
        g2d.fillRect(108 + x, 91 + y, 2, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 5);
        g2d.fillRect(109 + x, 98 + y, 1, 9);
        g2d.fillRect(122 + x, 103 + y, 1, 1);
        g2d.fillRect(122 + x, 107 + y, 1, 1);
        g2d.fillRect(108 + x, 108 + y, 1, 5);
        g2d.fillRect(123 + x, 108 + y, 1, 4);
        g2d.fillRect(118 + x, 113 + y, 1, 2);
        g2d.fillRect(119 + x, 115 + y, 1, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 11);
        g2d.fillRect(127 + x, 123 + y, 1, 4);
        g2d.fillRect(108 + x, 124 + y, 1, 1);
        g2d.fillRect(106 + x, 125 + y, 1, 2);
        g2d.fillRect(128 + x, 128 + y, 1, 1);
        g2d.fillRect(128 + x, 132 + y, 1, 1);
        g2d.fillRect(129 + x, 133 + y, 1, 2);
        g2d.fillRect(129 + x, 138 + y, 1, 2);
        g2d.fillRect(109 + x, 140 + y, 1, 10);
        g2d.fillRect(130 + x, 140 + y, 1, 4);
        g2d.fillRect(110 + x, 150 + y, 1, 8);
        g2d.fillRect(128 + x, 154 + y, 1, 3);
        g2d.fillRect(129 + x, 156 + y, 1, 2);
        g2d.fillRect(132 + x, 157 + y, 1, 3);
        g2d.fillRect(108 + x, 158 + y, 1, 2);
        g2d.fillRect(109 + x, 158 + y, 1, 2);
        g2d.fillRect(130 + x, 158 + y, 1, 2);
        g2d.fillRect(131 + x, 160 + y, 1, 1);
        g2d.fillRect(130 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 158 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 5, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 13);
        g2d.fillRect(107 + x, 82 + y, 12, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 5, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 4);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 10);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 4);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 1, 4);
        g2d.fillRect(121 + x, 94 + y, 1, 5);
        g2d.fillRect(101 + x, 95 + y, 1, 7);
        g2d.fillRect(114 + x, 98 + y, 1, 2);
        g2d.fillRect(108 + x, 99 + y, 1, 9);
        g2d.fillRect(115 + x, 100 + y, 1, 5);
        g2d.fillRect(122 + x, 100 + y, 1, 3);
        g2d.fillRect(102 + x, 102 + y, 1, 7);
        g2d.fillRect(122 + x, 104 + y, 1, 3);
        g2d.fillRect(116 + x, 105 + y, 1, 3);
        g2d.fillRect(107 + x, 108 + y, 1, 5);
        g2d.fillRect(101 + x, 109 + y, 1, 12);
        g2d.fillRect(117 + x, 109 + y, 1, 2);
        g2d.fillRect(118 + x, 112 + y, 1, 1);
        g2d.fillRect(123 + x, 112 + y, 1, 3);
        g2d.fillRect(108 + x, 113 + y, 1, 11);
        g2d.fillRect(124 + x, 115 + y, 1, 2);
        g2d.fillRect(119 + x, 116 + y, 1, 12);
        g2d.fillRect(125 + x, 117 + y, 1, 3);
        g2d.fillRect(126 + x, 120 + y, 1, 7);
        g2d.fillRect(100 + x, 121 + y, 1, 16);
        g2d.fillRect(107 + x, 124 + y, 1, 5);
        g2d.fillRect(108 + x, 125 + y, 1, 11);
        g2d.fillRect(127 + x, 127 + y, 1, 5);
        g2d.fillRect(106 + x, 128 + y, 1, 3);
        g2d.fillRect(120 + x, 128 + y, 1, 12);
        g2d.fillRect(105 + x, 132 + y, 1, 1);
        g2d.fillRect(109 + x, 132 + y, 1, 8);
        g2d.fillRect(99 + x, 133 + y, 1, 12);
        g2d.fillRect(128 + x, 133 + y, 1, 7);
        g2d.fillRect(104 + x, 137 + y, 1, 1);
        g2d.fillRect(108 + x, 140 + y, 1, 12);
        g2d.fillRect(121 + x, 140 + y, 1, 20);
        g2d.fillRect(129 + x, 140 + y, 1, 4);
        g2d.fillRect(130 + x, 144 + y, 1, 4);
        g2d.fillRect(131 + x, 144 + y, 1, 8);
        g2d.fillRect(98 + x, 145 + y, 1, 7);
        g2d.fillRect(109 + x, 150 + y, 1, 8);
        g2d.fillRect(127 + x, 152 + y, 1, 1);
        g2d.fillRect(132 + x, 152 + y, 1, 5);
        g2d.fillRect(98 + x, 153 + y, 1, 3);
        g2d.fillRect(108 + x, 153 + y, 1, 5);
        g2d.fillRect(128 + x, 153 + y, 1, 1);
        g2d.fillRect(97 + x, 156 + y, 1, 2);
        g2d.fillRect(107 + x, 156 + y, 1, 5);
        g2d.fillRect(98 + x, 157 + y, 1, 1);
        g2d.fillRect(106 + x, 157 + y, 1, 4);
        g2d.fillRect(130 + x, 157 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 1, 3);
        g2d.fillRect(105 + x, 158 + y, 1, 3);
        g2d.fillRect(129 + x, 158 + y, 1, 2);
        g2d.fillRect(131 + x, 158 + y, 1, 2);
        g2d.fillRect(101 + x, 160 + y, 3, 1);
        g2d.fillRect(122 + x, 160 + y, 1, 2);
        g2d.fillRect(130 + x, 160 + y, 1, 1);
        g2d.fillRect(123 + x, 161 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 9, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(119 + x, 84 + y, 2, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 3);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 4);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 3, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 4);
        g2d.fillRect(101 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 91 + y, 4, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 6);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 6);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 6);
        g2d.fillRect(103 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 96 + y, 1, 3);
        g2d.fillRect(107 + x, 98 + y, 1, 10);
        g2d.fillRect(115 + x, 98 + y, 1, 2);
        g2d.fillRect(121 + x, 99 + y, 1, 5);
        g2d.fillRect(116 + x, 100 + y, 1, 5);
        g2d.fillRect(117 + x, 104 + y, 1, 5);
        g2d.fillRect(106 + x, 105 + y, 1, 11);
        g2d.fillRect(118 + x, 108 + y, 1, 4);
        g2d.fillRect(122 + x, 108 + y, 1, 8);
        g2d.fillRect(102 + x, 109 + y, 1, 19);
        g2d.fillRect(119 + x, 112 + y, 1, 3);
        g2d.fillRect(107 + x, 113 + y, 1, 11);
        g2d.fillRect(123 + x, 115 + y, 1, 4);
        g2d.fillRect(120 + x, 117 + y, 1, 8);
        g2d.fillRect(124 + x, 117 + y, 1, 6);
        g2d.fillRect(125 + x, 120 + y, 1, 11);
        g2d.fillRect(101 + x, 121 + y, 1, 6);
        g2d.fillRect(121 + x, 123 + y, 1, 8);
        g2d.fillRect(106 + x, 124 + y, 1, 1);
        g2d.fillRect(124 + x, 124 + y, 1, 3);
        g2d.fillRect(106 + x, 127 + y, 1, 1);
        g2d.fillRect(126 + x, 127 + y, 1, 8);
        g2d.fillRect(101 + x, 128 + y, 1, 1);
        g2d.fillRect(105 + x, 128 + y, 1, 4);
        g2d.fillRect(122 + x, 128 + y, 1, 7);
        g2d.fillRect(102 + x, 129 + y, 1, 4);
        g2d.fillRect(107 + x, 129 + y, 1, 27);
        g2d.fillRect(106 + x, 131 + y, 1, 4);
        g2d.fillRect(104 + x, 132 + y, 1, 5);
        g2d.fillRect(127 + x, 132 + y, 1, 13);
        g2d.fillRect(105 + x, 133 + y, 1, 4);
        g2d.fillRect(102 + x, 135 + y, 1, 1);
        g2d.fillRect(121 + x, 135 + y, 1, 5);
        g2d.fillRect(123 + x, 135 + y, 1, 1);
        g2d.fillRect(108 + x, 136 + y, 1, 4);
        g2d.fillRect(100 + x, 137 + y, 1, 3);
        g2d.fillRect(123 + x, 137 + y, 1, 1);
        g2d.fillRect(103 + x, 138 + y, 1, 8);
        g2d.fillRect(104 + x, 138 + y, 1, 3);
        g2d.fillRect(122 + x, 138 + y, 1, 19);
        g2d.fillRect(123 + x, 140 + y, 1, 8);
        g2d.fillRect(128 + x, 140 + y, 1, 8);
        g2d.fillRect(124 + x, 142 + y, 1, 7);
        g2d.fillRect(129 + x, 144 + y, 1, 8);
        g2d.fillRect(125 + x, 145 + y, 1, 7);
        g2d.fillRect(106 + x, 148 + y, 1, 9);
        g2d.fillRect(130 + x, 148 + y, 1, 9);
        g2d.fillRect(126 + x, 149 + y, 1, 4);
        g2d.fillRect(127 + x, 150 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(128 + x, 152 + y, 1, 1);
        g2d.fillRect(131 + x, 152 + y, 1, 6);
        g2d.fillRect(127 + x, 153 + y, 1, 1);
        g2d.fillRect(129 + x, 153 + y, 1, 3);
        g2d.fillRect(98 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(105 + x, 157 + y, 1, 1);
        g2d.fillRect(128 + x, 157 + y, 1, 4);
        g2d.fillRect(101 + x, 158 + y, 1, 2);
        g2d.fillRect(127 + x, 160 + y, 1, 1);
        g2d.fillRect(129 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 82 + y, 5, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 3, 1);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 4);
        g2d.fillRect(114 + x, 85 + y, 2, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 87 + y, 2, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 88 + y, 2, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 5);
        g2d.fillRect(115 + x, 91 + y, 3, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 4);
        g2d.fillRect(119 + x, 94 + y, 1, 6);
        g2d.fillRect(102 + x, 95 + y, 2, 1);
        g2d.fillRect(106 + x, 95 + y, 3, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(107 + x, 96 + y, 1, 2);
        g2d.fillRect(116 + x, 96 + y, 1, 4);
        g2d.fillRect(103 + x, 98 + y, 1, 34);
        g2d.fillRect(106 + x, 98 + y, 1, 7);
        g2d.fillRect(117 + x, 99 + y, 1, 5);
        g2d.fillRect(120 + x, 100 + y, 1, 8);
        g2d.fillRect(118 + x, 102 + y, 1, 6);
        g2d.fillRect(105 + x, 104 + y, 1, 19);
        g2d.fillRect(121 + x, 104 + y, 1, 8);
        g2d.fillRect(119 + x, 107 + y, 1, 5);
        g2d.fillRect(120 + x, 112 + y, 1, 5);
        g2d.fillRect(104 + x, 113 + y, 1, 3);
        g2d.fillRect(121 + x, 115 + y, 1, 8);
        g2d.fillRect(106 + x, 116 + y, 1, 5);
        g2d.fillRect(122 + x, 116 + y, 1, 4);
        g2d.fillRect(123 + x, 119 + y, 1, 8);
        g2d.fillRect(122 + x, 121 + y, 1, 7);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(124 + x, 123 + y, 1, 1);
        g2d.fillRect(120 + x, 125 + y, 1, 3);
        g2d.fillRect(101 + x, 127 + y, 1, 1);
        g2d.fillRect(105 + x, 127 + y, 1, 1);
        g2d.fillRect(124 + x, 127 + y, 1, 4);
        g2d.fillRect(102 + x, 128 + y, 1, 1);
        g2d.fillRect(101 + x, 129 + y, 1, 13);
        g2d.fillRect(104 + x, 131 + y, 1, 1);
        g2d.fillRect(121 + x, 131 + y, 1, 4);
        g2d.fillRect(123 + x, 131 + y, 1, 4);
        g2d.fillRect(125 + x, 131 + y, 1, 5);
        g2d.fillRect(102 + x, 133 + y, 1, 2);
        g2d.fillRect(103 + x, 133 + y, 1, 2);
        g2d.fillRect(106 + x, 135 + y, 1, 13);
        g2d.fillRect(122 + x, 135 + y, 1, 3);
        g2d.fillRect(126 + x, 135 + y, 1, 14);
        g2d.fillRect(102 + x, 136 + y, 1, 18);
        g2d.fillRect(103 + x, 136 + y, 1, 2);
        g2d.fillRect(123 + x, 136 + y, 2, 1);
        g2d.fillRect(105 + x, 137 + y, 1, 7);
        g2d.fillRect(124 + x, 137 + y, 1, 5);
        g2d.fillRect(125 + x, 137 + y, 1, 8);
        g2d.fillRect(123 + x, 138 + y, 1, 2);
        g2d.fillRect(100 + x, 140 + y, 1, 9);
        g2d.fillRect(104 + x, 141 + y, 1, 12);
        g2d.fillRect(99 + x, 145 + y, 1, 9);
        g2d.fillRect(127 + x, 145 + y, 1, 5);
        g2d.fillRect(103 + x, 146 + y, 1, 14);
        g2d.fillRect(123 + x, 148 + y, 1, 13);
        g2d.fillRect(128 + x, 148 + y, 1, 4);
        g2d.fillRect(105 + x, 149 + y, 1, 8);
        g2d.fillRect(124 + x, 149 + y, 1, 7);
        g2d.fillRect(125 + x, 152 + y, 1, 1);
        g2d.fillRect(129 + x, 152 + y, 1, 1);
        g2d.fillRect(126 + x, 153 + y, 1, 8);
        g2d.fillRect(104 + x, 154 + y, 1, 4);
        g2d.fillRect(127 + x, 154 + y, 1, 6);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(125 + x, 156 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(122 + x, 157 + y, 1, 3);
        g2d.fillRect(124 + x, 160 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 2);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 2, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 4);
        g2d.fillRect(117 + x, 92 + y, 1, 2);
        g2d.fillRect(102 + x, 94 + y, 2, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 3);
        g2d.fillRect(106 + x, 96 + y, 1, 2);
        g2d.fillRect(104 + x, 98 + y, 1, 2);
        g2d.fillRect(105 + x, 98 + y, 1, 6);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 7);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 4);
        g2d.fillRect(104 + x, 111 + y, 1, 2);
        g2d.fillRect(121 + x, 112 + y, 1, 3);
        g2d.fillRect(104 + x, 116 + y, 1, 15);
        g2d.fillRect(122 + x, 120 + y, 1, 1);
        g2d.fillRect(106 + x, 121 + y, 1, 2);
        g2d.fillRect(105 + x, 125 + y, 1, 2);
        g2d.fillRect(123 + x, 127 + y, 1, 4);
        g2d.fillRect(124 + x, 131 + y, 1, 5);
        g2d.fillRect(103 + x, 132 + y, 1, 1);
        g2d.fillRect(103 + x, 135 + y, 1, 1);
        g2d.fillRect(125 + x, 136 + y, 1, 1);
        g2d.fillRect(101 + x, 142 + y, 1, 16);
        g2d.fillRect(105 + x, 144 + y, 1, 5);
        g2d.fillRect(100 + x, 149 + y, 1, 8);
        g2d.fillRect(104 + x, 153 + y, 1, 1);
        g2d.fillRect(125 + x, 153 + y, 1, 3);
        g2d.fillRect(99 + x, 154 + y, 1, 2);
        g2d.fillRect(102 + x, 154 + y, 1, 6);
        g2d.fillRect(124 + x, 156 + y, 1, 4);
        g2d.fillRect(125 + x, 158 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 4);
        g2d.fillRect(118 + x, 98 + y, 1, 4);
        g2d.fillRect(104 + x, 100 + y, 1, 7);
        g2d.fillRect(104 + x, 108 + y, 1, 3);
        g2d.fillRect(105 + x, 123 + y, 1, 2);
    }







    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
