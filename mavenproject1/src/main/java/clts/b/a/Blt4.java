/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b.a;

import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Blt4 extends SuperB {

    int prevX = 0;

    /** Creates a new instance of GenericClothes */
    public Blt4() {
        super();
    }

    public Blt4(int layer) {
        super(layer);
    }

    public Blt4(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Blt4(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        int changeInX = prevX - x;
        y += shiftY;

        if (changeInX == 1) {
            paintBel2(x, y, g2d);
        } else if (changeInX == -1) {
            paintBel3(x, y, g2d);
        } else {
            paintBel1(x, y, g2d);
        }

        prevX = x;
    }

    public void paintBel3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 1, 4);
        g2d.fillRect(119 + x, 80 + y, 1, 5);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 3);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 3);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 4);
        g2d.fillRect(109 + x, 83 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 2);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 2);
        g2d.fillRect(101 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 2, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 82 + y, 2, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 6);
        g2d.fillRect(120 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
    }

    public void paintBel1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 1, 4);
        g2d.fillRect(119 + x, 80 + y, 1, 5);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 3);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 3);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 4);
        g2d.fillRect(109 + x, 83 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 2);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 2);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 2, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 3);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(100 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 82 + y, 2, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 6);
        g2d.fillRect(120 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
    }

    public void paintBel2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 1, 4);
        g2d.fillRect(119 + x, 80 + y, 1, 5);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 3);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 3);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 4);
        g2d.fillRect(109 + x, 83 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 2);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 2);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 2, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 3);
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 82 + y, 2, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 6);
        g2d.fillRect(120 + x, 82 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
    }
}
