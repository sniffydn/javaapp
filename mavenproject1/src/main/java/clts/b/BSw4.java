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
public class BSw4 extends SuperB {

    /** Creates a new instance of GenericClothes */
    public BSw4() {
        super();
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public BSw4(int layer) {
        super(layer);
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public BSw4(ColorArray colorSwitch) {
        super(colorSwitch);
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public BSw4(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
        includeY = true;
        shrt = true;
        under = true;
        swim = true;
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        paintB(x, 0, g2d);

    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 2, 1);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 3, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 84 + y, 13, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(117 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 87 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 4, 1);
        g2d.fillRect(105 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 85 + y, 4, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 2, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 85 + y, 5, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 2, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(111 + x, 86 + y, 2, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_5, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(51, 51, 51));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(245, 19, 173));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(254, 54, 195));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(252, 104, 209));
        COLORS.set(ImageUtilities.GREY, new Color(252, 132, 208));
        COLORS.set(ImageUtilities.GREY_1, new Color(248, 146, 211));
        COLORS.set(ImageUtilities.GREY_2, new Color(254, 136, 219));
        COLORS.set(ImageUtilities.GREY_3, new Color(251, 173, 223));
        COLORS.set(ImageUtilities.GREY_4, new Color(252, 200, 233));
        COLORS.set(ImageUtilities.GREY_5, new Color(254, 236, 247));
    }

    public boolean getOriginalCA() {
        return false;
    }
}
