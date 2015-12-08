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
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot51 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Bot51() {
        super();
        skt = true;
    }

    public Bot51(int layer) {
        super(layer);
        skt = true;
    }

    public Bot51(ColorArray colorSwitch) {
        super(colorSwitch);
        skt = true;
    }

    public Bot51(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
        skt = true;
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

    public void paintBack(int offsetX, int y, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        int x = offsetX;
        y = 0;
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 4);
        g2d.fillRect(122 + x, 85 + y, 1, 3);
        g2d.fillRect(114 + x, 86 + y, 1, 4);
        g2d.fillRect(98 + x, 87 + y, 1, 4);
        g2d.fillRect(123 + x, 88 + y, 1, 3);
        g2d.fillRect(104 + x, 89 + y, 1, 5);
        g2d.fillRect(113 + x, 90 + y, 1, 4);
        g2d.fillRect(97 + x, 91 + y, 1, 3);
        g2d.fillRect(124 + x, 91 + y, 1, 3);
        g2d.fillRect(96 + x, 94 + y, 1, 3);
        g2d.fillRect(103 + x, 94 + y, 1, 4);
        g2d.fillRect(112 + x, 94 + y, 1, 3);
        g2d.fillRect(125 + x, 94 + y, 1, 2);
        g2d.fillRect(126 + x, 96 + y, 1, 2);
        g2d.fillRect(95 + x, 97 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 5);
        g2d.fillRect(102 + x, 98 + y, 1, 4);
        g2d.fillRect(127 + x, 98 + y, 1, 2);
        g2d.fillRect(94 + x, 99 + y, 1, 2);
        g2d.fillRect(95 + x, 100 + y, 1, 1);
        g2d.fillRect(100 + x, 100 + y, 2, 1);
        g2d.fillRect(114 + x, 100 + y, 4, 1);
        g2d.fillRect(128 + x, 100 + y, 1, 1);
        g2d.fillRect(96 + x, 101 + y, 4, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 4);
        g2d.fillRect(112 + x, 101 + y, 2, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(125 + x, 101 + y, 3, 1);
        g2d.fillRect(103 + x, 102 + y, 2, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(122 + x, 102 + y, 3, 1);
        g2d.fillRect(105 + x, 103 + y, 3, 1);
        g2d.fillRect(120 + x, 103 + y, 2, 1);
        g2d.fillRect(108 + x, 104 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 4);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 12, 1);
        g2d.fillRect(100 + x, 85 + y, 5, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 5);
        g2d.fillRect(108 + x, 85 + y, 1, 3);
        g2d.fillRect(110 + x, 85 + y, 7, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 5);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 1, 4);
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 4);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(122 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 90 + y, 1, 4);
        g2d.fillRect(110 + x, 90 + y, 1, 3);
        g2d.fillRect(114 + x, 90 + y, 1, 5);
        g2d.fillRect(98 + x, 91 + y, 1, 7);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(123 + x, 91 + y, 1, 4);
        g2d.fillRect(109 + x, 92 + y, 1, 3);
        g2d.fillRect(97 + x, 94 + y, 1, 5);
        g2d.fillRect(104 + x, 94 + y, 1, 4);
        g2d.fillRect(113 + x, 94 + y, 1, 7);
        g2d.fillRect(124 + x, 94 + y, 1, 4);
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 3);
        g2d.fillRect(117 + x, 96 + y, 1, 4);
        g2d.fillRect(125 + x, 96 + y, 1, 4);
        g2d.fillRect(96 + x, 97 + y, 1, 4);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(112 + x, 97 + y, 1, 4);
        g2d.fillRect(114 + x, 97 + y, 1, 3);
        g2d.fillRect(101 + x, 98 + y, 1, 2);
        g2d.fillRect(103 + x, 98 + y, 1, 3);
        g2d.fillRect(107 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 2);
        g2d.fillRect(121 + x, 98 + y, 1, 5);
        g2d.fillRect(126 + x, 98 + y, 1, 3);
        g2d.fillRect(95 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(122 + x, 99 + y, 1, 3);
        g2d.fillRect(97 + x, 100 + y, 2, 1);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(127 + x, 100 + y, 1, 1);
        g2d.fillRect(109 + x, 101 + y, 1, 3);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(123 + x, 101 + y, 1, 1);
        g2d.fillRect(108 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 102 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 82 + y, 1, 3);
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(120 + x, 82 + y, 1, 5);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 1, 4);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 12, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(100 + x, 86 + y, 1, 4);
        g2d.fillRect(110 + x, 86 + y, 1, 4);
        g2d.fillRect(116 + x, 86 + y, 1, 5);
        g2d.fillRect(119 + x, 86 + y, 1, 10);
        g2d.fillRect(121 + x, 86 + y, 1, 6);
        g2d.fillRect(103 + x, 87 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 7);
        g2d.fillRect(112 + x, 87 + y, 1, 7);
        g2d.fillRect(108 + x, 88 + y, 1, 3);
        g2d.fillRect(111 + x, 88 + y, 1, 6);
        g2d.fillRect(99 + x, 89 + y, 1, 6);
        g2d.fillRect(101 + x, 89 + y, 1, 4);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 3);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 13);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 9);
        g2d.fillRect(117 + x, 90 + y, 1, 6);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(122 + x, 91 + y, 1, 4);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(102 + x, 93 + y, 1, 4);
        g2d.fillRect(105 + x, 93 + y, 1, 10);
        g2d.fillRect(110 + x, 93 + y, 1, 3);
        g2d.fillRect(100 + x, 94 + y, 1, 5);
        g2d.fillRect(107 + x, 94 + y, 1, 4);
        g2d.fillRect(121 + x, 94 + y, 1, 4);
        g2d.fillRect(109 + x, 95 + y, 1, 3);
        g2d.fillRect(114 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(118 + x, 95 + y, 1, 5);
        g2d.fillRect(123 + x, 95 + y, 1, 6);
        g2d.fillRect(99 + x, 96 + y, 1, 3);
        g2d.fillRect(101 + x, 96 + y, 1, 2);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(122 + x, 97 + y, 1, 2);
        g2d.fillRect(98 + x, 98 + y, 1, 2);
        g2d.fillRect(104 + x, 98 + y, 1, 4);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(110 + x, 98 + y, 1, 2);
        g2d.fillRect(124 + x, 98 + y, 1, 4);
        g2d.fillRect(97 + x, 99 + y, 1, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 4);
        g2d.fillRect(109 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(106 + x, 100 + y, 1, 3);
        g2d.fillRect(125 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 3);
        g2d.fillRect(120 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 90 + y, 1, 4);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(118 + x, 92 + y, 1, 3);
        g2d.fillRect(121 + x, 92 + y, 1, 2);
        g2d.fillRect(101 + x, 93 + y, 1, 3);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(111 + x, 94 + y, 1, 2);
        g2d.fillRect(122 + x, 95 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 2);
        g2d.fillRect(119 + x, 96 + y, 1, 3);
        g2d.fillRect(109 + x, 98 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
    }
}
