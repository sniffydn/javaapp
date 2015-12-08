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
public class TopLower12 extends SuperTL
{
    /** Creates a new instance of GenericClothes */
    public TopLower12()
    {
        super(2);
        slenderB = true;
        prep = true;
    }

    public TopLower12(int layer)
    {
        super(layer);
        slenderB = true;
        prep = true;
    }

    public TopLower12(ColorArray colorSwitch)
    {
        super(2, colorSwitch);
        slenderB = true;
        prep = true;
    }

    public TopLower12(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        slenderB = true;
        prep = true;
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
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(100 + x, 77 + y, 1, 3);
        g2d.fillRect(120 + x, 77 + y, 1, 4);
        g2d.fillRect(99 + x, 80 + y, 1, 9);
        g2d.fillRect(121 + x, 81 + y, 1, 4);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 2, 1);
        g2d.fillRect(118 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 90 + y, 15, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 56 + y, 1, 4);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(104 + x, 56 + y, 1, 5);
        g2d.fillRect(105 + x, 56 + y, 1, 9);
        g2d.fillRect(106 + x, 56 + y, 1, 33);
        g2d.fillRect(107 + x, 56 + y, 1, 33);
        g2d.fillRect(108 + x, 56 + y, 1, 33);
        g2d.fillRect(109 + x, 56 + y, 1, 33);
        g2d.fillRect(110 + x, 56 + y, 1, 33);
        g2d.fillRect(111 + x, 56 + y, 1, 33);
        g2d.fillRect(112 + x, 56 + y, 1, 33);
        g2d.fillRect(113 + x, 56 + y, 1, 33);
        g2d.fillRect(114 + x, 56 + y, 1, 6);
        g2d.fillRect(116 + x, 56 + y, 1, 6);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(115 + x, 62 + y, 1, 6);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(114 + x, 68 + y, 1, 21);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 19);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(105 + x, 73 + y, 1, 16);
        g2d.fillRect(116 + x, 73 + y, 1, 16);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(102 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 75 + y, 1, 14);
        g2d.fillRect(101 + x, 77 + y, 1, 4);
        g2d.fillRect(117 + x, 77 + y, 1, 13);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 12);
        g2d.fillRect(118 + x, 78 + y, 1, 10);
        g2d.fillRect(100 + x, 80 + y, 1, 8);
        g2d.fillRect(102 + x, 81 + y, 1, 8);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 5);
        g2d.fillRect(120 + x, 85 + y, 2, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 56 + y, 1, 6);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 4);
        g2d.fillRect(114 + x, 62 + y, 1, 6);
        g2d.fillRect(105 + x, 65 + y, 1, 8);
        g2d.fillRect(115 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 3);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 4);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 3);
        g2d.fillRect(119 + x, 78 + y, 1, 4);
        g2d.fillRect(101 + x, 81 + y, 1, 6);
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 13, 1);
    }
}
