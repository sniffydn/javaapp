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
public class Bot9 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Bot9() {
        super();
        skt = true;
    }

    public Bot9(int layer) {
        super(layer);
        skt = true;
    }

    public Bot9(ColorArray colorSwitch) {
        super(colorSwitch);
        skt = true;
    }

    public Bot9(int layer, ColorArray colorSwitch) {
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

    public void draw(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(113 + x, 100 + y, 1, 1);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
        g2d.fillRect(120 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(114 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 99 + y, 1, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(123 + x, 98 + y, 1, 1);
        g2d.fillRect(121 + x, 98 + y, 1, 1);
        g2d.fillRect(119 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(111 + x, 98 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(126 + x, 97 + y, 1, 1);
        g2d.fillRect(124 + x, 97 + y, 1, 1);
        g2d.fillRect(122 + x, 97 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(112 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 97 + y, 1, 1);
        g2d.fillRect(127 + x, 96 + y, 1, 1);
        g2d.fillRect(125 + x, 96 + y, 1, 1);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 1);
        g2d.fillRect(130 + x, 95 + y, 1, 1);
        g2d.fillRect(128 + x, 95 + y, 1, 1);
        g2d.fillRect(126 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 4);
        g2d.fillRect(97 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
        g2d.fillRect(93 + x, 95 + y, 1, 1);
        g2d.fillRect(131 + x, 94 + y, 1, 1);
        g2d.fillRect(129 + x, 94 + y, 1, 1);
        g2d.fillRect(127 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(94 + x, 94 + y, 1, 1);
        g2d.fillRect(92 + x, 94 + y, 1, 1);
        g2d.fillRect(130 + x, 93 + y, 1, 1);
        g2d.fillRect(128 + x, 93 + y, 1, 1);
        g2d.fillRect(126 + x, 93 + y, 1, 1);
        g2d.fillRect(93 + x, 93 + y, 1, 1);
        g2d.fillRect(93 + x, 91 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 4);
        g2d.fillRect(94 + x, 90 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 8, 1);
        g2d.fillRect(115 + x, 84 + y, 2, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 3, 1);
        g2d.fillRect(94 + x, 92 + y, 3, 1);
        g2d.fillRect(95 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 10);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(98 + x, 91 + y, 1, 2);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 5);
        g2d.fillRect(101 + x, 92 + y, 1, 4);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 92 + y, 1, 4);
        g2d.fillRect(104 + x, 95 + y, 1, 4);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 97 + y, 1, 2);
        g2d.fillRect(109 + x, 98 + y, 1, 2);
        g2d.fillRect(110 + x, 99 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 2, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(109 + x, 97 + y, 2, 1);
        g2d.fillRect(123 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 96 + y, 4, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(125 + x, 93 + y, 1, 3);
        g2d.fillRect(106 + x, 92 + y, 1, 3);
        g2d.fillRect(128 + x, 91 + y, 1, 2);
        g2d.fillRect(127 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 3);
        g2d.fillRect(125 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(124 + x, 87 + y, 1, 1);
        g2d.fillRect(123 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 3);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 80 + y, 1, 3);
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(122 + x, 81 + y, 2, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 3);
        g2d.fillRect(124 + x, 82 + y, 1, 4);
        g2d.fillRect(125 + x, 83 + y, 1, 4);
        g2d.fillRect(126 + x, 84 + y, 1, 1);
        g2d.fillRect(126 + x, 86 + y, 1, 2);
        g2d.fillRect(127 + x, 85 + y, 1, 4);
        g2d.fillRect(128 + x, 85 + y, 1, 5);
        g2d.fillRect(129 + x, 86 + y, 1, 5);
        g2d.fillRect(130 + x, 87 + y, 1, 5);
        g2d.fillRect(131 + x, 88 + y, 1, 2);
        g2d.fillRect(129 + x, 92 + y, 1, 1);
        g2d.fillRect(126 + x, 92 + y, 2, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 4);
        g2d.fillRect(121 + x, 89 + y, 1, 2);
        g2d.fillRect(124 + x, 95 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 3, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 3);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 4, 1);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 2, 2);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(101 + x, 91 + y, 5, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 81 + y, 1, 4);
        g2d.fillRect(98 + x, 81 + y, 1, 2);
        g2d.fillRect(98 + x, 84 + y, 1, 1);
        g2d.fillRect(97 + x, 82 + y, 1, 4);
        g2d.fillRect(96 + x, 83 + y, 1, 3);
        g2d.fillRect(95 + x, 84 + y, 1, 2);
        g2d.fillRect(96 + x, 86 + y, 3, 2);
        g2d.fillRect(95 + x, 87 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 2);
        g2d.fillRect(105 + x, 95 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 2, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 3, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(126 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 2, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 83 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 1);
        g2d.fillRect(122 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 85 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 6, 1);
        g2d.fillRect(107 + x, 90 + y, 2, 1);
        g2d.fillRect(94 + x, 91 + y, 2, 1);
        g2d.fillRect(99 + x, 86 + y, 2, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 2, 1);
        g2d.fillRect(95 + x, 90 + y, 2, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 3);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 4);
        g2d.fillRect(116 + x, 87 + y, 2, 1);
        g2d.fillRect(123 + x, 87 + y, 1, 2);
        g2d.fillRect(124 + x, 88 + y, 1, 3);
        g2d.fillRect(125 + x, 89 + y, 2, 2);
        g2d.fillRect(127 + x, 89 + y, 1, 1);
        g2d.fillRect(123 + x, 91 + y, 5, 1);
        g2d.fillRect(125 + x, 92 + y, 1, 1);
        g2d.fillRect(123 + x, 92 + y, 1, 4);
        g2d.fillRect(124 + x, 93 + y, 1, 2);
        g2d.fillRect(120 + x, 91 + y, 2, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 3, 1);
        g2d.fillRect(115 + x, 94 + y, 2, 1);
        g2d.fillRect(112 + x, 93 + y, 3, 3);
        g2d.fillRect(112 + x, 92 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 3, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 94 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 1);
        g2d.fillRect(129 + x, 91 + y, 1, 1);
        g2d.fillRect(128 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(126 + x, 88 + y, 1, 1);
        g2d.fillRect(125 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 86 + y, 3, 1);
        g2d.fillRect(123 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 3);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 2, 1);
        g2d.fillRect(105 + x, 88 + y, 4, 1);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 88 + y, 2, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 4, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 3);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 2, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 95 + y, 1, 2);
        g2d.fillRect(111 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 2, 2);
        g2d.fillRect(117 + x, 90 + y, 2, 2);
        g2d.fillRect(122 + x, 88 + y, 1, 2);
        g2d.fillRect(123 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 4, 2);
        g2d.fillRect(119 + x, 94 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 3, 1);
    }
}
