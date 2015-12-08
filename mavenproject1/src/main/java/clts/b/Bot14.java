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
public class Bot14 extends Bot11 {

    /** Creates a new instance of GenericClothes */
    public Bot14() {
        super();
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot14(int layer) {
        super(layer);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot14(ColorArray colorSwitch) {
        super(colorSwitch);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot14(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
        jean = true;
        skt = true;
        shrt = true;
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        if (Math.random() < .3) {
            return new clts.Blank();
        } else if (Math.random() < .5) {
            return new clts.b.a.Pose2(c);
        } else {
            return new clts.b.a.Pose3(c);
        }
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (step < 6 || step > 13) {
            x++;
            y--;
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(112 + x, 88 + y, 1, 1);
            g2d.fillRect(124 + x, 85 + y, 1, 2);
            g2d.fillRect(122 + x, 84 + y, 2, 1);
            g2d.fillRect(121 + x, 83 + y, 1, 1);
            g2d.fillRect(104 + x, 82 + y, 7, 1);
            g2d.fillRect(96 + x, 86 + y, 2, 1);
            g2d.fillRect(100 + x, 86 + y, 1, 1);
            g2d.fillRect(106 + x, 91 + y, 1, 1);
            g2d.fillRect(117 + x, 79 + y, 3, 1);
            g2d.fillRect(114 + x, 80 + y, 7, 1);
            g2d.fillRect(109 + x, 81 + y, 6, 1);
            g2d.fillRect(100 + x, 81 + y, 4, 1);
            g2d.fillRect(99 + x, 82 + y, 2, 3);
            g2d.fillRect(97 + x, 85 + y, 3, 1);
            g2d.fillRect(95 + x, 87 + y, 1, 1);
            g2d.fillRect(94 + x, 87 + y, 1, 2);
            g2d.fillRect(94 + x, 89 + y, 4, 1);
            g2d.fillRect(97 + x, 88 + y, 2, 1);
            g2d.fillRect(98 + x, 87 + y, 5, 1);
            g2d.fillRect(96 + x, 90 + y, 1, 1);
            g2d.fillRect(96 + x, 91 + y, 4, 1);
            g2d.fillRect(100 + x, 90 + y, 1, 3);
            g2d.fillRect(101 + x, 89 + y, 1, 2);
            g2d.fillRect(102 + x, 88 + y, 9, 1);
            g2d.fillRect(108 + x, 87 + y, 8, 1);
            g2d.fillRect(111 + x, 86 + y, 7, 1);
            g2d.fillRect(113 + x, 85 + y, 2, 1);
            g2d.fillRect(119 + x, 81 + y, 1, 1);
            g2d.fillRect(120 + x, 81 + y, 1, 3);
            g2d.fillRect(119 + x, 83 + y, 1, 1);
            g2d.fillRect(116 + x, 84 + y, 5, 2);
            g2d.fillRect(121 + x, 85 + y, 1, 2);
            g2d.fillRect(122 + x, 86 + y, 2, 2);
            g2d.fillRect(117 + x, 87 + y, 1, 1);
            g2d.fillRect(118 + x, 86 + y, 1, 2);
            g2d.fillRect(118 + x, 88 + y, 5, 1);
            g2d.fillRect(117 + x, 89 + y, 3, 1);
            g2d.fillRect(111 + x, 90 + y, 8, 1);
            g2d.fillRect(110 + x, 89 + y, 1, 4);
            g2d.fillRect(111 + x, 91 + y, 3, 1);
            g2d.fillRect(102 + x, 89 + y, 2, 1);
            g2d.fillRect(105 + x, 89 + y, 3, 1);
            g2d.fillRect(107 + x, 90 + y, 1, 1);
            g2d.fillRect(103 + x, 90 + y, 3, 1);
            g2d.fillRect(102 + x, 91 + y, 2, 1);
            g2d.fillRect(101 + x, 92 + y, 9, 1);
            g2d.fillRect(114 + x, 88 + y, 1, 1);
            g2d.fillRect(114 + x, 89 + y, 2, 1);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(95 + x, 88 + y, 1, 1);
            g2d.fillRect(96 + x, 87 + y, 2, 1);
            g2d.fillRect(98 + x, 86 + y, 2, 1);
            g2d.fillRect(122 + x, 85 + y, 2, 1);
            g2d.fillRect(100 + x, 85 + y, 1, 1);
            g2d.fillRect(121 + x, 84 + y, 1, 1);
            g2d.fillRect(105 + x, 84 + y, 1, 1);
            g2d.fillRect(118 + x, 83 + y, 1, 1);
            g2d.fillRect(119 + x, 82 + y, 1, 1);
            g2d.fillRect(117 + x, 82 + y, 1, 1);
            g2d.fillRect(111 + x, 82 + y, 3, 1);
            g2d.fillRect(120 + x, 86 + y, 1, 1);
            g2d.fillRect(119 + x, 87 + y, 3, 1);
            g2d.fillRect(97 + x, 90 + y, 2, 1);
            g2d.fillRect(101 + x, 83 + y, 1, 1);
            g2d.fillRect(101 + x, 82 + y, 3, 1);
            g2d.fillRect(103 + x, 83 + y, 6, 1);
            g2d.fillRect(113 + x, 83 + y, 1, 1);
            g2d.fillRect(115 + x, 82 + y, 1, 1);
            g2d.fillRect(115 + x, 81 + y, 4, 1);
            g2d.fillRect(98 + x, 89 + y, 3, 1);
            g2d.fillRect(99 + x, 88 + y, 3, 1);
            g2d.fillRect(108 + x, 89 + y, 1, 2);
            g2d.fillRect(109 + x, 89 + y, 1, 3);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(107 + x, 91 + y, 2, 1);
            g2d.fillRect(104 + x, 91 + y, 2, 1);
            g2d.fillRect(101 + x, 91 + y, 1, 1);
            g2d.fillRect(106 + x, 90 + y, 1, 1);
            g2d.fillRect(102 + x, 90 + y, 1, 1);
            g2d.fillRect(99 + x, 90 + y, 1, 1);
            g2d.fillRect(116 + x, 89 + y, 1, 1);
            g2d.fillRect(104 + x, 89 + y, 1, 1);
            g2d.fillRect(117 + x, 88 + y, 1, 1);
            g2d.fillRect(113 + x, 88 + y, 1, 2);
            g2d.fillRect(111 + x, 88 + y, 1, 2);
            g2d.fillRect(96 + x, 88 + y, 1, 1);
            g2d.fillRect(119 + x, 86 + y, 1, 1);
            g2d.fillRect(118 + x, 82 + y, 1, 1);
            g2d.fillRect(114 + x, 82 + y, 1, 3);
            g2d.fillRect(116 + x, 82 + y, 1, 1);
            g2d.fillRect(102 + x, 83 + y, 1, 1);
            g2d.fillRect(116 + x, 87 + y, 1, 1);
            g2d.fillRect(115 + x, 88 + y, 1, 1);
            g2d.fillRect(116 + x, 88 + y, 1, 1);
            g2d.fillRect(112 + x, 89 + y, 1, 1);
            g2d.fillRect(115 + x, 83 + y, 1, 3);
            g2d.fillRect(116 + x, 83 + y, 2, 1);
            g2d.fillRect(101 + x, 84 + y, 2, 3);
            g2d.fillRect(103 + x, 84 + y, 2, 4);
            g2d.fillRect(105 + x, 85 + y, 1, 3);
            g2d.fillRect(106 + x, 84 + y, 2, 4);
            g2d.fillRect(108 + x, 84 + y, 3, 3);
            g2d.fillRect(109 + x, 83 + y, 4, 1);
            g2d.fillRect(111 + x, 84 + y, 3, 1);
            g2d.fillRect(111 + x, 85 + y, 2, 1);
        } else {
            super.draw(x, y, g2d);
        }
    }
}
