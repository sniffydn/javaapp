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
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower23 extends SuperTL
{
    public TopLower23()
    {
        super();
    }

    public TopLower23(int layer)
    {
        super(layer);
    }

    public TopLower23(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public TopLower23(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        paintTL(x,0,g2d);
    }
    
    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 54 + y, 1, 5);
        g2d.fillRect(101 + x, 54 + y, 1, 6);
        g2d.fillRect(102 + x, 54 + y, 1, 11);
        g2d.fillRect(103 + x, 54 + y, 1, 12);
        g2d.fillRect(104 + x, 54 + y, 1, 7);
        g2d.fillRect(105 + x, 54 + y, 1, 8);
        g2d.fillRect(106 + x, 54 + y, 1, 5);
        g2d.fillRect(107 + x, 54 + y, 1, 4);
        g2d.fillRect(108 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 4);
        g2d.fillRect(113 + x, 54 + y, 1, 5);
        g2d.fillRect(114 + x, 54 + y, 1, 5);
        g2d.fillRect(115 + x, 54 + y, 1, 5);
        g2d.fillRect(116 + x, 54 + y, 1, 6);
        g2d.fillRect(117 + x, 54 + y, 1, 10);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 2, 1);
        g2d.fillRect(113 + x, 75 + y, 2, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 56 + y, 1, 6);
        g2d.fillRect(108 + x, 57 + y, 1, 4);
        g2d.fillRect(110 + x, 57 + y, 1, 6);
        g2d.fillRect(111 + x, 57 + y, 1, 3);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 4);
        g2d.fillRect(114 + x, 59 + y, 1, 6);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 11);
        g2d.fillRect(104 + x, 61 + y, 1, 4);
        g2d.fillRect(111 + x, 61 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 5);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(103 + x, 66 + y, 1, 4);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 3);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 2, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(102 + x, 70 + y, 1, 5);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 2, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 2);
        g2d.fillRect(112 + x, 73 + y, 2, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 2, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 3);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(118 + x, 74 + y, 1, 2);
        g2d.fillRect(120 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 3);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 75 + y, 1, 3);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 2);
        g2d.fillRect(112 + x, 77 + y, 1, 3);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(115 + x, 77 + y, 1, 2);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 4);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(116 + x, 79 + y, 2, 1);
        g2d.fillRect(113 + x, 80 + y, 3, 1);
        g2d.fillRect(104 + x, 81 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 3);
        g2d.fillRect(109 + x, 63 + y, 1, 2);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 2, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 2);
        g2d.fillRect(111 + x, 69 + y, 1, 3);
        g2d.fillRect(106 + x, 70 + y, 1, 2);
        g2d.fillRect(112 + x, 70 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 3);
        g2d.fillRect(103 + x, 71 + y, 1, 4);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 2);
        g2d.fillRect(115 + x, 71 + y, 1, 2);
        g2d.fillRect(116 + x, 71 + y, 3, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 4);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 3);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(107 + x, 67 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 3);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 3);
        g2d.fillRect(113 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 69 + y, 1, 4);
        g2d.fillRect(109 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 3);
        g2d.fillRect(111 + x, 72 + y, 2, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 3);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 3);
        g2d.fillRect(115 + x, 74 + y, 1, 3);
        g2d.fillRect(117 + x, 74 + y, 1, 2);
        g2d.fillRect(119 + x, 74 + y, 1, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 6);
        g2d.fillRect(102 + x, 75 + y, 1, 4);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 75 + y, 1, 6);
        g2d.fillRect(108 + x, 75 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 5);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 3);
        g2d.fillRect(118 + x, 76 + y, 1, 2);
        g2d.fillRect(120 + x, 76 + y, 1, 1);
        g2d.fillRect(100 + x, 77 + y, 1, 4);
        g2d.fillRect(111 + x, 77 + y, 1, 4);
        g2d.fillRect(113 + x, 77 + y, 1, 3);
        g2d.fillRect(105 + x, 78 + y, 1, 3);
        g2d.fillRect(107 + x, 78 + y, 1, 3);
        g2d.fillRect(109 + x, 78 + y, 1, 3);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
    }
}
