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
public class Blt14 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Blt14() {
        super();
    }

    public Blt14(int layer) {
        super(layer);
    }

    public Blt14(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Blt14(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (x == -1 || prevX == -1) {
            paintB3(x, shiftY, g2d);
        } else if (x == 1 || prevX == 1) {
            paintB1(x, shiftY, g2d);
        } else {
            paintB2(x, shiftY, g2d);
        }
        prevX = x;
    }
    int prevX = 0;

    public void paintB3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 81 + y, 5, 1);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 6);
        g2d.fillRect(112 + x, 83 + y, 1, 5);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 83 + y, 4, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 80 + y, 5, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 5);
        g2d.fillRect(113 + x, 83 + y, 1, 5);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(112 + x, 82 + y, 4, 1);
        g2d.fillRect(118 + x, 82 + y, 4, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(102 + x, 82 + y, 1, 4);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 4);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 2);
        g2d.fillRect(122 + x, 93 + y, 1, 2);
    }

    public void paintB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 81 + y, 5, 1);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 6);
        g2d.fillRect(112 + x, 83 + y, 1, 5);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 83 + y, 4, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 80 + y, 5, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 5);
        g2d.fillRect(113 + x, 83 + y, 1, 5);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(112 + x, 82 + y, 4, 1);
        g2d.fillRect(118 + x, 82 + y, 4, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(102 + x, 82 + y, 1, 4);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 4);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
    }

    public void paintB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 81 + y, 5, 1);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 6);
        g2d.fillRect(112 + x, 83 + y, 1, 5);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 83 + y, 4, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 80 + y, 5, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 5);
        g2d.fillRect(113 + x, 83 + y, 1, 5);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(112 + x, 82 + y, 4, 1);
        g2d.fillRect(118 + x, 82 + y, 4, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(102 + x, 82 + y, 1, 4);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 4);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 4);
    }
}
