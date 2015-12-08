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
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopLower0 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower0()
    {
        super(2);
        slenderB = true;
    }

    public TopLower0(int layer)
    {
        super(layer);
        slenderB = true;
    }

    public TopLower0(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        slenderB = true;
    }

    public TopLower0(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
    }
    
    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        
        if (!containsB || Math.random() < .3) {
            return new clts.Blank();
        } else if (Math.random() < .5) {
            return new clts.b.a.Pose2(c);
        } else {
            return new clts.b.a.Pose3(c);
        }
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 65 + y, 1, 3);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 86 + y, 1, 3);
        g2d.fillRect(114 + x, 86 + y, 1, 8);
        g2d.fillRect(105 + x, 84 + y, 1, 12);
        g2d.fillRect(97 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 78 + y, 1, 4);
        g2d.fillRect(99 + x, 78 + y, 1, 5);
        g2d.fillRect(113 + x, 77 + y, 1, 6);
        g2d.fillRect(100 + x, 76 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(101 + x, 73 + y, 1, 3);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 70 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 6);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(113 + x, 83 + y, 1, 5);
        g2d.fillRect(100 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 7);
        g2d.fillRect(103 + x, 65 + y, 1, 3);
        g2d.fillRect(111 + x, 64 + y, 1, 5);
        g2d.fillRect(106 + x, 63 + y, 1, 16);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 4);
        g2d.fillRect(105 + x, 71 + y, 1, 13);
        g2d.fillRect(115 + x, 56 + y, 1, 12);
        g2d.fillRect(116 + x, 56 + y, 1, 6);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 8);
        g2d.fillRect(115 + x, 87 + y, 1, 8);
        g2d.fillRect(123 + x, 86 + y, 1, 4);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(97 + x, 83 + y, 1, 3);
        g2d.fillRect(104 + x, 82 + y, 1, 7);
        g2d.fillRect(114 + x, 80 + y, 1, 6);
        g2d.fillRect(120 + x, 79 + y, 1, 4);
        g2d.fillRect(106 + x, 79 + y, 1, 13);
        g2d.fillRect(100 + x, 79 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 4);
        g2d.fillRect(112 + x, 78 + y, 1, 5);
        g2d.fillRect(99 + x, 76 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 3);
        g2d.fillRect(100 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 4);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(101 + x, 71 + y, 1, 2);
        g2d.fillRect(118 + x, 69 + y, 1, 4);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(102 + x, 67 + y, 1, 3);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 7);
        g2d.fillRect(105 + x, 64 + y, 1, 7);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 8);
        g2d.fillRect(121 + x, 90 + y, 2, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 3);
        g2d.fillRect(111 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 94 + y, 2, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 2, 1);
        g2d.fillRect(123 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 5);
        g2d.fillRect(124 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 3);
        g2d.fillRect(112 + x, 83 + y, 1, 6);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(111 + x, 72 + y, 1, 6);
        g2d.fillRect(113 + x, 69 + y, 1, 4);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(112 + x, 63 + y, 2, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 8);
        g2d.fillRect(106 + x, 56 + y, 8, 6);
        g2d.fillRect(110 + x, 62 + y, 2, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 4, 1);
        g2d.fillRect(117 + x, 93 + y, 3, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 86 + y, 1, 2);
        g2d.fillRect(97 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 79 + y, 1, 4);
        g2d.fillRect(120 + x, 76 + y, 1, 3);
        g2d.fillRect(98 + x, 76 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(100 + x, 72 + y, 1, 3);
        g2d.fillRect(113 + x, 64 + y, 1, 5);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(99 + x, 74 + y, 1, 2);
        g2d.fillRect(97 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 4);
        g2d.fillRect(104 + x, 56 + y, 1, 26);
        g2d.fillRect(103 + x, 71 + y, 1, 18);
        g2d.fillRect(102 + x, 75 + y, 1, 17);
        g2d.fillRect(101 + x, 76 + y, 1, 17);
        g2d.fillRect(100 + x, 83 + y, 1, 9);
        g2d.fillRect(99 + x, 87 + y, 1, 4);
        g2d.fillRect(107 + x, 62 + y, 3, 34);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 33);
        g2d.fillRect(108 + x, 96 + y, 3, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 18);
        g2d.fillRect(112 + x, 89 + y, 1, 5);
        g2d.fillRect(114 + x, 66 + y, 1, 14);
        g2d.fillRect(115 + x, 68 + y, 1, 19);
        g2d.fillRect(116 + x, 69 + y, 1, 20);
        g2d.fillRect(117 + x, 73 + y, 1, 19);
        g2d.fillRect(118 + x, 77 + y, 1, 15);
        g2d.fillRect(119 + x, 82 + y, 1, 10);
        g2d.fillRect(120 + x, 86 + y, 1, 6);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 82 + y, 1, 3);
        g2d.fillRect(123 + x, 84 + y, 1, 2);
    }
}
