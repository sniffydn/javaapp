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

public class Skrt12 extends SuperB {

    {
        includeY = true;
        skt = true;
        shrt = true;
    }

    public Skrt12() {
        super();
    }

    public Skrt12(int layer) {
        super(layer);
    }

    public Skrt12(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Skrt12(int layer, ColorArray colorSwitch) {
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
        paintS(x, 0, g2d);

        if (y > 0) {
            y = 0;
        }
        paintSB(x, y, g2d);
    }

    public void paintSB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 89 + y, 1, 6);
        g2d.fillRect(99 + x, 89 + y, 1, 3);
        g2d.fillRect(100 + x, 89 + y, 1, 2);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(122 + x, 90 + y, 1, 3);
        g2d.fillRect(123 + x, 91 + y, 1, 4);
        g2d.fillRect(97 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 2);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 93 + y, 1, 2);
        g2d.fillRect(125 + x, 93 + y, 1, 1);
        g2d.fillRect(122 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 6);
        g2d.fillRect(121 + x, 90 + y, 1, 2);
        g2d.fillRect(100 + x, 91 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 5);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 3, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 3);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 2, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(111 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 91 + y, 1, 3);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 91 + y, 1, 5);
        g2d.fillRect(109 + x, 91 + y, 1, 5);
        g2d.fillRect(110 + x, 91 + y, 1, 5);
        g2d.fillRect(101 + x, 92 + y, 3, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(112 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 93 + y, 1, 2);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 2, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
    }

    public void paintS(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(101 + x, 80 + y, 19, 1);
        g2d.fillRect(118 + x, 81 + y, 3, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(120 + x, 82 + y, 1, 5);
        g2d.fillRect(121 + x, 82 + y, 1, 9);
        g2d.fillRect(101 + x, 83 + y, 2, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 4);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 2, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 2);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 86 + y, 1, 5);
        g2d.fillRect(97 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(123 + x, 88 + y, 1, 2);
        g2d.fillRect(96 + x, 89 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 5, 1);
        g2d.fillRect(124 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 8, 1);
        g2d.fillRect(117 + x, 91 + y, 3, 1);
        g2d.fillRect(112 + x, 92 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 16, 1);
        g2d.fillRect(104 + x, 82 + y, 2, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 4, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 3);
        g2d.fillRect(112 + x, 86 + y, 2, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 3, 1);
        g2d.fillRect(117 + x, 88 + y, 2, 1);
        g2d.fillRect(103 + x, 89 + y, 3, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 5, 1);
        g2d.fillRect(117 + x, 90 + y, 2, 1);
        g2d.fillRect(112 + x, 91 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 82 + y, 2, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 3, 1);
        g2d.fillRect(103 + x, 83 + y, 2, 1);
        g2d.fillRect(108 + x, 83 + y, 2, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 84 + y, 5, 1);
        g2d.fillRect(101 + x, 85 + y, 2, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 85 + y, 2, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 3);
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 5, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 90 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 82 + y, 5, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 84 + y, 3, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 5);
        g2d.fillRect(109 + x, 85 + y, 1, 6);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(102, 127, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(102, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(170, 170, 170));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(153, 223, 170));
        COLORS.set(ImageUtilities.GREY, new Color(204, 223, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(204, 204, 204));
        COLORS.set(ImageUtilities.GREY_2, new Color(238, 238, 238));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
