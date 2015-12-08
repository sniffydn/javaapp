/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u;

import clts.SuperTU;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class TopUpper28 extends SuperTU {

    public TopUpper28() {
        super();
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper28(String middle) {
        super(middle, 3);
    }

    public TopUpper28(String middle, int layer) {
        super(middle, layer);
    }

    public TopUpper28(String middle, ColorArray colorSwitch) {
        super(middle, 3, colorSwitch);
    }

    public TopUpper28(String middle, int layer, ColorArray colorSwitch) {
        super(middle, layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (middle.equalsIgnoreCase("b")) {
            drawB(x, y, g2d);
        }
    }

    public void drawB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 51 + y, 1, 10);
        g2d.fillRect(109 + x, 51 + y, 3, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 49 + y, 2, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 5, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(99 + x, 53 + y, 2, 1);
        g2d.fillRect(103 + x, 53 + y, 5, 1);
        g2d.fillRect(100 + x, 54 + y, 3, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 8, 1);
        g2d.fillRect(105 + x, 59 + y, 3, 1);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(101 + x, 60 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 50 + y, 1, 7);
        g2d.fillRect(118 + x, 51 + y, 1, 3);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(110 + x, 52 + y, 1, 2);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 2, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(111 + x, 57 + y, 7, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 3, 1);
        g2d.fillRect(109 + x, 58 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 54 + y, 1, 4);
        g2d.fillRect(110 + x, 54 + y, 9, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 5, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 2, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(68, 68, 68));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(153, 127, 85));
        COLORS.set(ImageUtilities.GREY, new Color(204, 191, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(204, 223, 85));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
