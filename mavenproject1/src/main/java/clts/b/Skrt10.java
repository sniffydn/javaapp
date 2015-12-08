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
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Skrt10 extends SuperB {

    {
        includeY = true;
        skt = true;
        shrt = true;
    }

    public Skrt10() {
        super();
    }

    public Skrt10(int layer) {
        super(layer);
    }

    public Skrt10(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Skrt10(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
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
        paintB(x, 0, g2d);
        paintBL(x, y, g2d);
    }

    public void paintBL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(97 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 1, 1);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(96 + x, 93 + y, 1, 2);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(126 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(122 + x, 94 + y, 3, 1);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 2, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(121 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(95 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 95 + y, 2, 1);
        g2d.fillRect(123 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(123 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 2, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(99 + x, 86 + y, 1, 4);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 6);
        g2d.fillRect(122 + x, 86 + y, 1, 2);
        g2d.fillRect(123 + x, 86 + y, 1, 4);
        g2d.fillRect(98 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 3);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(124 + x, 89 + y, 1, 3);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 91 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(125 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 85 + y, 3, 1);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 3, 1);
        g2d.fillRect(112 + x, 87 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 3, 1);
        g2d.fillRect(119 + x, 87 + y, 2, 1);
        g2d.fillRect(96 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 2, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 1);
        g2d.fillRect(123 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 3);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 3);
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(122 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 2, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 2, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 2, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(123 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 2, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 4, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 81 + y, 2, 1);
        g2d.fillRect(119 + x, 81 + y, 2, 1);
        g2d.fillRect(106 + x, 82 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 84 + y, 2, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 3, 1);
        g2d.fillRect(119 + x, 86 + y, 3, 1);
        g2d.fillRect(109 + x, 87 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 78 + y, 8, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 10, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 2, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 9, 1);
        g2d.fillRect(106 + x, 86 + y, 4, 1);
        g2d.fillRect(122 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 85 + y, 3, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 3, 1);
        g2d.fillRect(113 + x, 87 + y, 4, 1);
        g2d.fillRect(119 + x, 87 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 79 + y, 3, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 3);
        g2d.fillRect(107 + x, 79 + y, 2, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 80 + y, 2, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 2, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 4, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 2);
        g2d.fillRect(117 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(108 + x, 84 + y, 8, 1);
        g2d.fillRect(103 + x, 85 + y, 4, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 3, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 2, 1);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 4, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 2, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 4, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 3, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(99, 156, 173));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(206, 123, 173));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(206, 156, 173));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(99, 189, 255));
        COLORS.set(ImageUtilities.GREY, new Color(206, 206, 206));
        COLORS.set(ImageUtilities.GREY_1, new Color(156, 222, 255));
        COLORS.set(ImageUtilities.GREY_2, new Color(222, 222, 222));
        COLORS.set(ImageUtilities.GREY_3, new Color(239, 239, 239));
        COLORS.set(ImageUtilities.GREY_4, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
