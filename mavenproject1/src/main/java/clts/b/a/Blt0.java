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
public class Blt0 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Blt0() {
        super();
    }

    public Blt0(int layer) {
        super(layer);
    }

    public Blt0(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Blt0(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        y += shiftY;
        if (step < 6 || step > 13) {
            paintbelt31(x, y, g2d);
        } else {
            paintbelt32(x, y, g2d);
        }
    }

    public void paintbelt32(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 3);
        g2d.fillRect(100 + x, 79 + y, 1, 2);
        g2d.fillRect(108 + x, 79 + y, 1, 3);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 2, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 2, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 3);
        g2d.fillRect(111 + x, 82 + y, 2, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 3, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 2, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 3);
        g2d.fillRect(121 + x, 84 + y, 1, 4);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 2, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 78 + y, 2, 1);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 3, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 2, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 2, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(119 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 3);
        g2d.fillRect(116 + x, 86 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 77 + y, 1, 2);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(103 + x, 79 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 3, 1);
        g2d.fillRect(117 + x, 85 + y, 2, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 78 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 2, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 4);
        g2d.fillRect(114 + x, 81 + y, 1, 3);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 3, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(110 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
    }

    public void paintbelt31(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 3);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 2, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 2, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 4, 1);
        g2d.fillRect(108 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 3);
        g2d.fillRect(116 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 4);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 2, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(100 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 79 + y, 2, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(108 + x, 82 + y, 3, 1);
        g2d.fillRect(116 + x, 82 + y, 3, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 4);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 78 + y, 2, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 79 + y, 2, 1);
        g2d.fillRect(109 + x, 80 + y, 2, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 2, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 4);
        g2d.fillRect(106 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 3);
        g2d.fillRect(108 + x, 84 + y, 1, 4);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 3, 1);
        g2d.fillRect(109 + x, 87 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(121 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
    }
}
