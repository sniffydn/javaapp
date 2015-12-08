/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.l;

import clts.SuperTL;
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
public class TopLower9 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower9()
    {
        super(2);
        slenderB = true;
        shuni = true;
    }

    public TopLower9(int layer)
    {
        super(layer);
        slenderB = true;
        shuni = true;
    }

    public TopLower9(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        slenderB = true;
        shuni = true;
    }

    public TopLower9(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        shuni = true;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 7);
        g2d.fillRect(103 + x, 59 + y, 1, 10);
        g2d.fillRect(106 + x, 59 + y, 1, 5);
        g2d.fillRect(107 + x, 59 + y, 1, 10);
        g2d.fillRect(109 + x, 59 + y, 1, 9);
        g2d.fillRect(110 + x, 59 + y, 1, 6);
        g2d.fillRect(111 + x, 59 + y, 1, 22);
        g2d.fillRect(112 + x, 59 + y, 1, 6);
        g2d.fillRect(113 + x, 59 + y, 1, 10);
        g2d.fillRect(114 + x, 59 + y, 1, 6);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 8);
        g2d.fillRect(100 + x, 80 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 1, 7);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 59 + y, 1, 6);
        g2d.fillRect(105 + x, 59 + y, 1, 7);
        g2d.fillRect(108 + x, 59 + y, 1, 4);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 26);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 6);
        g2d.fillRect(103 + x, 70 + y, 1, 2);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 4);
        g2d.fillRect(101 + x, 77 + y, 1, 8);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 63 + y, 1, 6);
        g2d.fillRect(116 + x, 63 + y, 1, 3);
        g2d.fillRect(106 + x, 64 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 1, 4);
        g2d.fillRect(112 + x, 65 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 9);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 68 + y, 1, 2);
        g2d.fillRect(103 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 4);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 22);
        g2d.fillRect(112 + x, 71 + y, 1, 3);
        g2d.fillRect(118 + x, 71 + y, 1, 10);
        g2d.fillRect(103 + x, 72 + y, 1, 18);
        g2d.fillRect(106 + x, 72 + y, 1, 19);
        g2d.fillRect(116 + x, 73 + y, 1, 14);
        g2d.fillRect(107 + x, 75 + y, 1, 15);
        g2d.fillRect(113 + x, 75 + y, 1, 15);
        g2d.fillRect(120 + x, 79 + y, 1, 11);
        g2d.fillRect(121 + x, 82 + y, 1, 7);
        g2d.fillRect(100 + x, 84 + y, 1, 3);
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(117 + x, 85 + y, 1, 5);
        g2d.fillRect(102 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 3);
        g2d.fillRect(105 + x, 87 + y, 1, 3);
        g2d.fillRect(108 + x, 89 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 5);
        g2d.fillRect(117 + x, 69 + y, 1, 6);
        g2d.fillRect(104 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 4);
        g2d.fillRect(119 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 77 + y, 1, 2);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 4);
        g2d.fillRect(118 + x, 81 + y, 1, 4);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 4);
        g2d.fillRect(112 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 2);
        g2d.fillRect(108 + x, 72 + y, 1, 5);
        g2d.fillRect(105 + x, 75 + y, 1, 10);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 75 + y, 1, 6);
        g2d.fillRect(119 + x, 77 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 1, 6);
        g2d.fillRect(108 + x, 79 + y, 1, 2);
        g2d.fillRect(112 + x, 79 + y, 1, 4);
        g2d.fillRect(115 + x, 79 + y, 1, 10);
        g2d.fillRect(114 + x, 81 + y, 1, 6);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 6);
        g2d.fillRect(119 + x, 87 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 74 + y, 1, 5);
        g2d.fillRect(114 + x, 74 + y, 1, 7);
        g2d.fillRect(119 + x, 79 + y, 1, 8);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
    }
}
