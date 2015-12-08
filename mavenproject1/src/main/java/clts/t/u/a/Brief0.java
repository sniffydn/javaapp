/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperTL;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Brief0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public Brief0()
    {
        super(2);
    }

    public Brief0(int layer)
    {
        super(layer);
    }

    public Brief0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
    }

    public Brief0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        return new obsolete.Brief0_1(c);
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {

    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintbreif1(x,y,g2d);
    }

    public void paintbreif1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(132 + x, 80 + y, 2, 1);
        g2d.fillRect(129 + x, 81 + y, 3, 1);
        g2d.fillRect(134 + x, 81 + y, 1, 1);
        g2d.fillRect(126 + x, 82 + y, 3, 1);
        g2d.fillRect(135 + x, 82 + y, 1, 1);
        g2d.fillRect(125 + x, 83 + y, 1, 1);
        g2d.fillRect(136 + x, 83 + y, 1, 2);
        g2d.fillRect(123 + x, 84 + y, 2, 1);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(137 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 86 + y, 2, 1);
        g2d.fillRect(135 + x, 86 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(134 + x, 87 + y, 1, 1);
        g2d.fillRect(138 + x, 87 + y, 1, 3);
        g2d.fillRect(117 + x, 88 + y, 1, 2);
        g2d.fillRect(131 + x, 88 + y, 1, 2);
        g2d.fillRect(132 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(130 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 4);
        g2d.fillRect(129 + x, 90 + y, 1, 2);
        g2d.fillRect(139 + x, 90 + y, 1, 3);
        g2d.fillRect(128 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 2);
        g2d.fillRect(126 + x, 92 + y, 2, 1);
        g2d.fillRect(125 + x, 93 + y, 1, 1);
        g2d.fillRect(140 + x, 93 + y, 1, 5);
        g2d.fillRect(116 + x, 94 + y, 1, 4);
        g2d.fillRect(120 + x, 94 + y, 1, 4);
        g2d.fillRect(123 + x, 94 + y, 2, 1);
        g2d.fillRect(121 + x, 95 + y, 2, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 4);
        g2d.fillRect(121 + x, 98 + y, 1, 2);
        g2d.fillRect(139 + x, 98 + y, 1, 1);
        g2d.fillRect(138 + x, 99 + y, 1, 1);
        g2d.fillRect(122 + x, 100 + y, 1, 3);
        g2d.fillRect(137 + x, 100 + y, 1, 1);
        g2d.fillRect(136 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 3);
        g2d.fillRect(134 + x, 102 + y, 2, 1);
        g2d.fillRect(123 + x, 103 + y, 1, 2);
        g2d.fillRect(132 + x, 103 + y, 2, 1);
        g2d.fillRect(130 + x, 104 + y, 2, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 2);
        g2d.fillRect(124 + x, 105 + y, 1, 1);
        g2d.fillRect(127 + x, 105 + y, 3, 1);
        g2d.fillRect(120 + x, 106 + y, 4, 1);
        g2d.fillRect(125 + x, 106 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(133 + x, 82 + y, 1, 6);
        g2d.fillRect(134 + x, 83 + y, 1, 4);
        g2d.fillRect(132 + x, 84 + y, 1, 4);
        g2d.fillRect(135 + x, 84 + y, 1, 2);
        g2d.fillRect(130 + x, 85 + y, 1, 4);
        g2d.fillRect(131 + x, 85 + y, 1, 3);
        g2d.fillRect(128 + x, 86 + y, 1, 3);
        g2d.fillRect(129 + x, 86 + y, 1, 3);
        g2d.fillRect(127 + x, 87 + y, 1, 2);
        g2d.fillRect(135 + x, 87 + y, 1, 11);
        g2d.fillRect(136 + x, 87 + y, 1, 10);
        g2d.fillRect(126 + x, 88 + y, 1, 2);
        g2d.fillRect(134 + x, 88 + y, 1, 10);
        g2d.fillRect(132 + x, 89 + y, 1, 10);
        g2d.fillRect(133 + x, 89 + y, 1, 10);
        g2d.fillRect(131 + x, 90 + y, 1, 9);
        g2d.fillRect(130 + x, 91 + y, 1, 9);
        g2d.fillRect(137 + x, 91 + y, 1, 5);
        g2d.fillRect(129 + x, 92 + y, 1, 3);
        g2d.fillRect(126 + x, 93 + y, 1, 2);
        g2d.fillRect(127 + x, 93 + y, 2, 1);
        g2d.fillRect(125 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(132 + x, 81 + y, 1, 3);
        g2d.fillRect(131 + x, 83 + y, 1, 2);
        g2d.fillRect(129 + x, 84 + y, 1, 2);
        g2d.fillRect(130 + x, 84 + y, 1, 1);
        g2d.fillRect(128 + x, 85 + y, 1, 1);
        g2d.fillRect(126 + x, 86 + y, 1, 2);
        g2d.fillRect(127 + x, 86 + y, 1, 1);
        g2d.fillRect(125 + x, 87 + y, 1, 3);
        g2d.fillRect(124 + x, 88 + y, 1, 2);
        g2d.fillRect(123 + x, 89 + y, 1, 2);
        g2d.fillRect(127 + x, 89 + y, 2, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 3);
        g2d.fillRect(119 + x, 94 + y, 1, 5);
        g2d.fillRect(127 + x, 94 + y, 1, 3);
        g2d.fillRect(128 + x, 94 + y, 1, 8);
        g2d.fillRect(138 + x, 94 + y, 1, 3);
        g2d.fillRect(123 + x, 95 + y, 1, 3);
        g2d.fillRect(124 + x, 95 + y, 1, 4);
        g2d.fillRect(125 + x, 95 + y, 1, 1);
        g2d.fillRect(129 + x, 95 + y, 1, 7);
        g2d.fillRect(137 + x, 96 + y, 1, 2);
        g2d.fillRect(139 + x, 96 + y, 1, 1);
        g2d.fillRect(136 + x, 97 + y, 1, 2);
        g2d.fillRect(120 + x, 98 + y, 1, 5);
        g2d.fillRect(134 + x, 98 + y, 2, 1);
        g2d.fillRect(131 + x, 99 + y, 1, 2);
        g2d.fillRect(132 + x, 99 + y, 2, 1);
        g2d.fillRect(121 + x, 100 + y, 1, 5);
        g2d.fillRect(130 + x, 100 + y, 1, 2);
        g2d.fillRect(122 + x, 103 + y, 1, 3);
        g2d.fillRect(123 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(133 + x, 81 + y, 1, 1);
        g2d.fillRect(129 + x, 82 + y, 1, 2);
        g2d.fillRect(130 + x, 82 + y, 1, 2);
        g2d.fillRect(131 + x, 82 + y, 1, 1);
        g2d.fillRect(134 + x, 82 + y, 1, 1);
        g2d.fillRect(128 + x, 83 + y, 1, 2);
        g2d.fillRect(135 + x, 83 + y, 1, 1);
        g2d.fillRect(127 + x, 84 + y, 1, 2);
        g2d.fillRect(125 + x, 85 + y, 1, 2);
        g2d.fillRect(126 + x, 85 + y, 1, 1);
        g2d.fillRect(136 + x, 85 + y, 1, 1);
        g2d.fillRect(124 + x, 86 + y, 1, 2);
        g2d.fillRect(123 + x, 87 + y, 1, 2);
        g2d.fillRect(137 + x, 87 + y, 1, 4);
        g2d.fillRect(122 + x, 88 + y, 1, 4);
        g2d.fillRect(121 + x, 89 + y, 1, 2);
        g2d.fillRect(129 + x, 89 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 1, 2);
        g2d.fillRect(125 + x, 90 + y, 1, 2);
        g2d.fillRect(126 + x, 90 + y, 1, 2);
        g2d.fillRect(127 + x, 90 + y, 1, 2);
        g2d.fillRect(128 + x, 90 + y, 1, 1);
        g2d.fillRect(138 + x, 90 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 2);
        g2d.fillRect(123 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(139 + x, 93 + y, 1, 3);
        g2d.fillRect(118 + x, 95 + y, 1, 3);
        g2d.fillRect(126 + x, 95 + y, 1, 6);
        g2d.fillRect(121 + x, 96 + y, 2, 1);
        g2d.fillRect(125 + x, 96 + y, 1, 7);
        g2d.fillRect(122 + x, 97 + y, 1, 1);
        g2d.fillRect(127 + x, 97 + y, 1, 6);
        g2d.fillRect(138 + x, 97 + y, 1, 2);
        g2d.fillRect(139 + x, 97 + y, 1, 1);
        g2d.fillRect(123 + x, 98 + y, 1, 2);
        g2d.fillRect(137 + x, 98 + y, 1, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 3);
        g2d.fillRect(124 + x, 99 + y, 1, 3);
        g2d.fillRect(134 + x, 99 + y, 1, 2);
        g2d.fillRect(135 + x, 99 + y, 1, 2);
        g2d.fillRect(136 + x, 99 + y, 1, 1);
        g2d.fillRect(132 + x, 100 + y, 1, 2);
        g2d.fillRect(133 + x, 100 + y, 1, 1);
        g2d.fillRect(131 + x, 101 + y, 1, 1);
        g2d.fillRect(128 + x, 102 + y, 3, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 2);
        g2d.fillRect(121 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(126 + x, 83 + y, 1, 2);
        g2d.fillRect(127 + x, 83 + y, 1, 1);
        g2d.fillRect(125 + x, 84 + y, 1, 1);
        g2d.fillRect(123 + x, 85 + y, 1, 2);
        g2d.fillRect(124 + x, 85 + y, 1, 1);
        g2d.fillRect(122 + x, 86 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 7);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 88 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 90 + y, 1, 3);
        g2d.fillRect(121 + x, 91 + y, 1, 4);
        g2d.fillRect(122 + x, 92 + y, 1, 3);
        g2d.fillRect(123 + x, 92 + y, 1, 2);
        g2d.fillRect(124 + x, 92 + y, 1, 2);
        g2d.fillRect(125 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 5);
        g2d.fillRect(121 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 4);
        g2d.fillRect(122 + x, 98 + y, 1, 2);
        g2d.fillRect(137 + x, 99 + y, 1, 1);
        g2d.fillRect(123 + x, 100 + y, 1, 3);
        g2d.fillRect(136 + x, 100 + y, 1, 1);
        g2d.fillRect(126 + x, 101 + y, 1, 5);
        g2d.fillRect(133 + x, 101 + y, 1, 2);
        g2d.fillRect(134 + x, 101 + y, 2, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 3);
        g2d.fillRect(124 + x, 102 + y, 1, 3);
        g2d.fillRect(131 + x, 102 + y, 1, 2);
        g2d.fillRect(132 + x, 102 + y, 1, 1);
        g2d.fillRect(125 + x, 103 + y, 1, 3);
        g2d.fillRect(127 + x, 103 + y, 1, 2);
        g2d.fillRect(128 + x, 103 + y, 1, 2);
        g2d.fillRect(129 + x, 103 + y, 1, 2);
        g2d.fillRect(130 + x, 103 + y, 1, 1);
        g2d.fillRect(120 + x, 105 + y, 1, 1);
    }





    public void paintbreif2(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(127 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(126 + x, 80 + y, 1, 2);
        g2d.fillRect(127 + x, 80 + y, 1, 1);
        g2d.fillRect(124 + x, 81 + y, 1, 2);
        g2d.fillRect(125 + x, 81 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(122 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(124 + x, 80 + y, 2, 1);
        g2d.fillRect(122 + x, 81 + y, 1, 2);
        g2d.fillRect(123 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryBack(offsetX,offsetY,g2d);
        paintbreif2(offsetX,0,g2d);
    }
}
