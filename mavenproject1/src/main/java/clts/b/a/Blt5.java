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
public class Blt5 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Blt5() {
        super();
        includeY = true;
    }

    public Blt5(int layer) {
        super(layer);
        includeY = true;
    }

    public Blt5(ColorArray colorSwitch) {
        super(colorSwitch);
        includeY = true;
    }

    public Blt5(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
        includeY = true;
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (y == 1) {
            paintA(x, shiftY, g2d);
        } else if (y == -1) {
            paintC(x, shiftY, g2d);
        } else {
            paintB(x, shiftY, g2d);
        }
    }

    public void paintC(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 77 + y, 3, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 2, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 83 + y, 3, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 3);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 7);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 3);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 7);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 4);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 2, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 3);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 80 + y, 3, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 3, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 9);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(113 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 3);
        g2d.fillRect(104 + x, 87 + y, 1, 5);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 7);
        g2d.fillRect(99 + x, 90 + y, 1, 4);
        g2d.fillRect(103 + x, 92 + y, 1, 3);
        g2d.fillRect(100 + x, 93 + y, 1, 5);
        g2d.fillRect(98 + x, 94 + y, 1, 2);
        g2d.fillRect(99 + x, 95 + y, 1, 4);
        g2d.fillRect(102 + x, 95 + y, 1, 6);
        g2d.fillRect(97 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(95 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 3);
        g2d.fillRect(97 + x, 100 + y, 1, 1);
        g2d.fillRect(96 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 76 + y, 2, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 4, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 4);
        g2d.fillRect(102 + x, 92 + y, 1, 3);
        g2d.fillRect(101 + x, 95 + y, 1, 3);
        g2d.fillRect(100 + x, 98 + y, 1, 2);
        g2d.fillRect(99 + x, 100 + y, 1, 1);
    }

    public void paintA(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 77 + y, 3, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 2, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 83 + y, 3, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 3);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(98 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(97 + x, 87 + y, 1, 4);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 3);
        g2d.fillRect(95 + x, 93 + y, 1, 3);
        g2d.fillRect(94 + x, 95 + y, 1, 1);
        g2d.fillRect(93 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 7);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 4);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 2, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 3);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 80 + y, 3, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 3, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 5);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(113 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 6);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 2);
        g2d.fillRect(99 + x, 86 + y, 1, 4);
        g2d.fillRect(101 + x, 86 + y, 1, 5);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 2, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 3);
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 3);
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 3);
        g2d.fillRect(98 + x, 93 + y, 1, 5);
        g2d.fillRect(96 + x, 94 + y, 1, 2);
        g2d.fillRect(97 + x, 95 + y, 1, 4);
        g2d.fillRect(100 + x, 95 + y, 1, 6);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
        g2d.fillRect(96 + x, 97 + y, 1, 1);
        g2d.fillRect(93 + x, 98 + y, 1, 1);
        g2d.fillRect(95 + x, 98 + y, 1, 1);
        g2d.fillRect(94 + x, 99 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 99 + y, 1, 3);
        g2d.fillRect(95 + x, 100 + y, 1, 1);
        g2d.fillRect(94 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 76 + y, 2, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 4, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 3);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 3);
        g2d.fillRect(99 + x, 95 + y, 1, 3);
        g2d.fillRect(98 + x, 98 + y, 1, 2);
        g2d.fillRect(97 + x, 100 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 77 + y, 3, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 2, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 83 + y, 3, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 3);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(98 + x, 85 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 2, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(97 + x, 88 + y, 1, 7);
        g2d.fillRect(96 + x, 94 + y, 1, 3);
        g2d.fillRect(95 + x, 96 + y, 1, 1);
        g2d.fillRect(94 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 7);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 4);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 2, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 3);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 80 + y, 3, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 3, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(99 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 6);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(113 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 8);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 5);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 2, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 5);
        g2d.fillRect(100 + x, 90 + y, 1, 6);
        g2d.fillRect(98 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 93 + y, 1, 3);
        g2d.fillRect(99 + x, 94 + y, 1, 5);
        g2d.fillRect(97 + x, 95 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 4);
        g2d.fillRect(101 + x, 96 + y, 1, 6);
        g2d.fillRect(96 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(94 + x, 99 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(95 + x, 100 + y, 1, 1);
        g2d.fillRect(97 + x, 100 + y, 1, 1);
        g2d.fillRect(100 + x, 100 + y, 1, 3);
        g2d.fillRect(96 + x, 101 + y, 1, 1);
        g2d.fillRect(95 + x, 102 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 76 + y, 2, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 4, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 2, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 4);
        g2d.fillRect(101 + x, 93 + y, 1, 3);
        g2d.fillRect(100 + x, 96 + y, 1, 3);
        g2d.fillRect(99 + x, 99 + y, 1, 2);
        g2d.fillRect(98 + x, 101 + y, 1, 1);
    }
}
