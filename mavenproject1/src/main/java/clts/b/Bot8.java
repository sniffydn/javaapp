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
import java.awt.Point;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot8 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Bot8() {
        super();
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot8(int layer) {
        super(layer);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot8(ColorArray colorSwitch) {
        super(colorSwitch);
        jean = true;
        skt = true;
        shrt = true;
    }

    public Bot8(int layer, ColorArray colorSwitch) {
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
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(100 + x, 80 + y, 6, 1);
        g2d.fillRect(105 + x, 81 + y, 13, 1);
        g2d.fillRect(118 + x, 80 + y, 6, 1);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(122 + x, 82 + y, 3, 1);

        Point point1 = ImageUtilities.drawRandomPointAround(128 + x, 87 + y, null);
        ImageUtilities.drawLine(124 + x, 81 + y, (int) point1.getX(), (int) point1.getY(), g2d);
        Point point2 = ImageUtilities.drawRandomPointAround(129 + x, 83 + y, null);
        ImageUtilities.drawLine(125 + x, 82 + y, (int) point2.getX(), (int) point2.getY(), g2d);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(125 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 3, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 86 + y, 1, 2);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 2, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 3);
        g2d.fillRect(97 + x, 84 + y, 2, 1);
        g2d.fillRect(96 + x, 85 + y, 2, 1);
        g2d.fillRect(97 + x, 86 + y, 2, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 91 + y, 3, 1);
        g2d.fillRect(100 + x, 92 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 92 + y, 2, 1);
        g2d.fillRect(124 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 2);
        g2d.fillRect(125 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 1, 6);
        g2d.fillRect(124 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 87 + y, 1, 4);
        g2d.fillRect(97 + x, 87 + y, 1, 1);
        g2d.fillRect(123 + x, 86 + y, 1, 2);
        g2d.fillRect(96 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 2, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(95 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(96 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 4);
        g2d.fillRect(98 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(99 + x, 81 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 4);
        g2d.fillRect(99 + x, 87 + y, 1, 3);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 7);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 1, 3);
        g2d.fillRect(118 + x, 85 + y, 1, 4);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 2, 1);
        g2d.fillRect(122 + x, 90 + y, 2, 1);
        g2d.fillRect(126 + x, 90 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 3, 1);
        g2d.fillRect(123 + x, 93 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 3);
        g2d.fillRect(117 + x, 93 + y, 3, 2);
        g2d.fillRect(112 + x, 92 + y, 5, 2);
        g2d.fillRect(112 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 91 + y, 1, 4);
        g2d.fillRect(109 + x, 93 + y, 1, 3);
        g2d.fillRect(110 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 2, 1);
        g2d.fillRect(105 + x, 88 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 3, 4);
        g2d.fillRect(102 + x, 92 + y, 2, 3);
        g2d.fillRect(101 + x, 93 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(124 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 5);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 2);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 5);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 4);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 5);
        g2d.fillRect(102 + x, 81 + y, 2, 1);
        g2d.fillRect(115 + x, 80 + y, 2, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 91 + y, 2, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(123 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 85 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 82 + y, 2, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 2, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(123 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 2, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
    }
}
