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
import util.ColorArray;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower21 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower21()
    {
        super(2);
        slenderB = true;
        shuni = true;
        containsB = Math.random() < .5;
    }

    public TopLower21(int layer)
    {
        super(layer);
        slenderB = true;
        shuni = true;
        containsB = Math.random() < .5;
    }

    public TopLower21(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        slenderB = true;
        shuni = true;
        containsB = Math.random() < .5;
    }

    public TopLower21(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        shuni = true;
        containsB = Math.random() < .5;
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 60 + y, 1, 4);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 61 + y, 1, 3);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(117 + x, 64 + y, 1, 6);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 3);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 9);
        g2d.fillRect(115 + x, 74 + y, 2, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 2, 1);
        g2d.fillRect(116 + x, 79 + y, 2, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 4);
        g2d.fillRect(100 + x, 83 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 4);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 13);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 7);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 7);
        g2d.fillRect(112 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 72 + y, 2, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(104 + x, 74 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 4, 1);
        g2d.fillRect(117 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 2, 1);
        g2d.fillRect(114 + x, 75 + y, 3, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 4, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 3, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 5);
        g2d.fillRect(102 + x, 79 + y, 1, 3);
        g2d.fillRect(105 + x, 79 + y, 1, 2);
        g2d.fillRect(106 + x, 79 + y, 2, 1);
        g2d.fillRect(112 + x, 79 + y, 4, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 2, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 3);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 2, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 4);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 2, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 2, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(103 + x, 87 + y, 5, 1);
        g2d.fillRect(112 + x, 87 + y, 4, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 3, 1);
        g2d.fillRect(117 + x, 89 + y, 3, 1);
        g2d.fillRect(105 + x, 90 + y, 12, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 60 + y, 1, 3);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 3);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 3);
        g2d.fillRect(108 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 9);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 4);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 3, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 5, 1);
        g2d.fillRect(107 + x, 75 + y, 7, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 2);
        g2d.fillRect(110 + x, 76 + y, 4, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 3);
        g2d.fillRect(118 + x, 76 + y, 1, 2);
        g2d.fillRect(111 + x, 77 + y, 2, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 2, 1);
        g2d.fillRect(108 + x, 79 + y, 4, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 82 + y, 1, 3);
        g2d.fillRect(107 + x, 82 + y, 1, 3);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 4, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 2, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 2, 1);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 3, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 2);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 7);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(109 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 68 + y, 1, 3);
        g2d.fillRect(107 + x, 69 + y, 1, 5);
        g2d.fillRect(111 + x, 69 + y, 1, 2);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 4);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 7, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 76 + y, 1, 3);
        g2d.fillRect(115 + x, 76 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 5, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(109 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 80 + y, 2, 1);
        g2d.fillRect(104 + x, 81 + y, 3, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 4);
        g2d.fillRect(112 + x, 83 + y, 1, 4);
        g2d.fillRect(113 + x, 83 + y, 1, 4);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 83 + y, 1, 3);
        g2d.fillRect(116 + x, 83 + y, 1, 3);
        g2d.fillRect(108 + x, 84 + y, 1, 3);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 5, 1);
        g2d.fillRect(105 + x, 86 + y, 3, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 3, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 3, 1);
        g2d.fillRect(106 + x, 89 + y, 9, 1);
    }
}
