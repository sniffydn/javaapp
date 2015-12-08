/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b;

import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot43 extends Bot42 {

    /** Creates a new instance of GenericClothes */
    public Bot43() {
        super();
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot43(int layer) {
        super(layer);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot43(ColorArray colorSwitch) {
        super(colorSwitch);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot43(int layer, ColorArray colorSwitch) {
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
            x += 5;
            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
            g2d.fillRect(95 + x, 81 + y, 1, 1);
            g2d.fillRect(97 + x, 82 + y, 1, 5);
            g2d.fillRect(96 + x, 82 + y, 1, 1);
            g2d.fillRect(94 + x, 82 + y, 1, 3);
            g2d.fillRect(98 + x, 83 + y, 3, 1);
            g2d.fillRect(98 + x, 84 + y, 1, 6);
            g2d.fillRect(96 + x, 84 + y, 1, 3);
            g2d.fillRect(100 + x, 85 + y, 1, 2);
            g2d.fillRect(101 + x, 86 + y, 2, 1);
            g2d.fillRect(99 + x, 86 + y, 1, 3);
            g2d.fillRect(95 + x, 86 + y, 1, 2);
            g2d.fillRect(110 + x, 87 + y, 2, 1);
            g2d.fillRect(110 + x, 88 + y, 1, 2);
            g2d.fillRect(94 + x, 88 + y, 1, 1);
            g2d.fillRect(101 + x, 89 + y, 1, 4);
            g2d.fillRect(106 + x, 90 + y, 1, 3);
            g2d.fillRect(103 + x, 91 + y, 1, 2);


            g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
            g2d.fillRect(115 + x, 80 + y, 1, 1);
            g2d.fillRect(96 + x, 81 + y, 2, 1);
            g2d.fillRect(116 + x, 82 + y, 1, 3);
            g2d.fillRect(112 + x, 82 + y, 1, 1);
            g2d.fillRect(109 + x, 82 + y, 1, 1);
            g2d.fillRect(106 + x, 82 + y, 2, 1);
            g2d.fillRect(102 + x, 82 + y, 1, 2);
            g2d.fillRect(98 + x, 82 + y, 1, 1);
            g2d.fillRect(95 + x, 82 + y, 1, 4);
            g2d.fillRect(117 + x, 83 + y, 1, 1);
            g2d.fillRect(113 + x, 83 + y, 1, 1);
            g2d.fillRect(108 + x, 83 + y, 1, 1);
            g2d.fillRect(105 + x, 83 + y, 1, 2);
            g2d.fillRect(103 + x, 83 + y, 2, 1);
            g2d.fillRect(101 + x, 83 + y, 1, 3);
            g2d.fillRect(96 + x, 83 + y, 1, 1);
            g2d.fillRect(115 + x, 84 + y, 1, 3);
            g2d.fillRect(110 + x, 84 + y, 1, 1);
            g2d.fillRect(103 + x, 84 + y, 1, 1);
            g2d.fillRect(99 + x, 84 + y, 1, 2);
            g2d.fillRect(117 + x, 85 + y, 1, 4);
            g2d.fillRect(111 + x, 85 + y, 1, 1);
            g2d.fillRect(104 + x, 85 + y, 1, 2);
            g2d.fillRect(102 + x, 85 + y, 1, 1);
            g2d.fillRect(93 + x, 85 + y, 2, 1);
            g2d.fillRect(118 + x, 86 + y, 1, 2);
            g2d.fillRect(116 + x, 86 + y, 1, 1);
            g2d.fillRect(113 + x, 86 + y, 1, 2);
            g2d.fillRect(105 + x, 86 + y, 2, 1);
            g2d.fillRect(103 + x, 86 + y, 1, 1);
            g2d.fillRect(91 + x, 86 + y, 3, 1);
            g2d.fillRect(114 + x, 87 + y, 1, 3);
            g2d.fillRect(100 + x, 87 + y, 1, 2);
            g2d.fillRect(96 + x, 87 + y, 2, 1);
            g2d.fillRect(94 + x, 87 + y, 1, 1);
            g2d.fillRect(90 + x, 87 + y, 3, 1);
            g2d.fillRect(111 + x, 88 + y, 1, 2);
            g2d.fillRect(107 + x, 88 + y, 1, 1);
            g2d.fillRect(104 + x, 88 + y, 1, 2);
            g2d.fillRect(101 + x, 88 + y, 1, 1);
            g2d.fillRect(95 + x, 88 + y, 1, 1);
            g2d.fillRect(93 + x, 88 + y, 1, 4);
            g2d.fillRect(90 + x, 88 + y, 1, 1);
            g2d.fillRect(115 + x, 89 + y, 1, 1);
            g2d.fillRect(106 + x, 89 + y, 1, 1);
            g2d.fillRect(103 + x, 89 + y, 1, 2);
            g2d.fillRect(99 + x, 89 + y, 1, 1);
            g2d.fillRect(94 + x, 89 + y, 1, 1);
            g2d.fillRect(110 + x, 90 + y, 1, 1);
            g2d.fillRect(98 + x, 90 + y, 1, 2);
            g2d.fillRect(92 + x, 90 + y, 1, 2);
            g2d.fillRect(105 + x, 91 + y, 1, 2);
            g2d.fillRect(102 + x, 91 + y, 1, 2);
            g2d.fillRect(97 + x, 91 + y, 1, 2);
            g2d.fillRect(104 + x, 92 + y, 1, 1);
            g2d.fillRect(96 + x, 92 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(114 + x, 79 + y, 1, 2);
            g2d.fillRect(113 + x, 80 + y, 1, 1);
            g2d.fillRect(115 + x, 81 + y, 1, 3);
            g2d.fillRect(112 + x, 81 + y, 1, 1);
            g2d.fillRect(114 + x, 82 + y, 1, 1);
            g2d.fillRect(111 + x, 82 + y, 1, 2);
            g2d.fillRect(110 + x, 82 + y, 1, 1);
            g2d.fillRect(103 + x, 82 + y, 2, 1);
            g2d.fillRect(101 + x, 82 + y, 1, 1);
            g2d.fillRect(109 + x, 83 + y, 1, 1);
            g2d.fillRect(107 + x, 83 + y, 1, 2);
            g2d.fillRect(106 + x, 83 + y, 1, 1);
            g2d.fillRect(117 + x, 84 + y, 1, 1);
            g2d.fillRect(114 + x, 84 + y, 1, 3);
            g2d.fillRect(113 + x, 84 + y, 1, 2);
            g2d.fillRect(112 + x, 84 + y, 1, 1);
            g2d.fillRect(100 + x, 84 + y, 1, 1);
            g2d.fillRect(116 + x, 85 + y, 1, 1);
            g2d.fillRect(108 + x, 85 + y, 1, 3);
            g2d.fillRect(105 + x, 85 + y, 2, 1);
            g2d.fillRect(103 + x, 85 + y, 1, 1);
            g2d.fillRect(109 + x, 86 + y, 4, 1);
            g2d.fillRect(107 + x, 86 + y, 1, 2);
            g2d.fillRect(94 + x, 86 + y, 1, 1);
            g2d.fillRect(115 + x, 87 + y, 1, 2);
            g2d.fillRect(109 + x, 87 + y, 1, 1);
            g2d.fillRect(103 + x, 87 + y, 1, 2);
            g2d.fillRect(101 + x, 87 + y, 1, 1);
            g2d.fillRect(118 + x, 88 + y, 1, 1);
            g2d.fillRect(113 + x, 88 + y, 1, 1);
            g2d.fillRect(105 + x, 88 + y, 2, 1);
            g2d.fillRect(97 + x, 88 + y, 1, 3);
            g2d.fillRect(96 + x, 88 + y, 1, 1);
            g2d.fillRect(91 + x, 88 + y, 1, 2);
            g2d.fillRect(116 + x, 89 + y, 1, 1);
            g2d.fillRect(107 + x, 89 + y, 1, 3);
            g2d.fillRect(105 + x, 89 + y, 1, 2);
            g2d.fillRect(95 + x, 89 + y, 1, 1);
            g2d.fillRect(92 + x, 89 + y, 1, 1);
            g2d.fillRect(90 + x, 89 + y, 1, 1);
            g2d.fillRect(102 + x, 90 + y, 1, 1);
            g2d.fillRect(99 + x, 90 + y, 1, 3);
            g2d.fillRect(96 + x, 90 + y, 1, 2);
            g2d.fillRect(94 + x, 90 + y, 1, 2);
            g2d.fillRect(104 + x, 91 + y, 1, 1);
            g2d.fillRect(100 + x, 92 + y, 1, 1);
            g2d.fillRect(98 + x, 92 + y, 1, 1);


            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(96 + x, 80 + y, 1, 1);
            g2d.fillRect(113 + x, 81 + y, 2, 1);
            g2d.fillRect(113 + x, 82 + y, 1, 1);
            g2d.fillRect(108 + x, 82 + y, 1, 1);
            g2d.fillRect(99 + x, 82 + y, 2, 1);
            g2d.fillRect(114 + x, 83 + y, 1, 1);
            g2d.fillRect(112 + x, 83 + y, 1, 1);
            g2d.fillRect(110 + x, 83 + y, 1, 1);
            g2d.fillRect(118 + x, 84 + y, 1, 2);
            g2d.fillRect(111 + x, 84 + y, 1, 1);
            g2d.fillRect(109 + x, 84 + y, 1, 2);
            g2d.fillRect(108 + x, 84 + y, 1, 1);
            g2d.fillRect(106 + x, 84 + y, 1, 1);
            g2d.fillRect(104 + x, 84 + y, 1, 1);
            g2d.fillRect(102 + x, 84 + y, 1, 1);
            g2d.fillRect(112 + x, 85 + y, 1, 1);
            g2d.fillRect(110 + x, 85 + y, 1, 1);
            g2d.fillRect(107 + x, 85 + y, 1, 1);
            g2d.fillRect(119 + x, 86 + y, 1, 2);
            g2d.fillRect(116 + x, 87 + y, 1, 2);
            g2d.fillRect(112 + x, 87 + y, 1, 3);
            g2d.fillRect(104 + x, 87 + y, 3, 1);
            g2d.fillRect(102 + x, 87 + y, 1, 3);
            g2d.fillRect(93 + x, 87 + y, 1, 1);
            g2d.fillRect(109 + x, 88 + y, 1, 3);
            g2d.fillRect(108 + x, 88 + y, 1, 4);
            g2d.fillRect(92 + x, 88 + y, 1, 1);
            g2d.fillRect(113 + x, 89 + y, 1, 2);
            g2d.fillRect(100 + x, 89 + y, 1, 3);
            g2d.fillRect(96 + x, 89 + y, 1, 1);
            g2d.fillRect(104 + x, 90 + y, 1, 1);
            g2d.fillRect(95 + x, 90 + y, 1, 2);
        } else {
            super.draw(x, y, g2d);
        }
    }
}
