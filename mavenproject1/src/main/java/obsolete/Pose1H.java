/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package obsolete;

import clts.b.a.*;
import clts.SuperB;
import clts.SuperC;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Pose1H extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Pose1H() {
        super();
    }

    public Pose1H(int layer) {
        super(layer);
    }

    public Pose1H(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Pose1H(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void paintFront(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 38 + y, 1, 1);
        g2d.fillRect(108 + x, 39 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 46 + y, 1, 2);
        g2d.fillRect(112 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(120 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(118 + x, 64 + y, 2, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 41 + y, 1, 4);
        g2d.fillRect(106 + x, 41 + y, 1, 4);
        g2d.fillRect(102 + x, 42 + y, 1, 2);
        g2d.fillRect(103 + x, 42 + y, 2, 1);
        g2d.fillRect(114 + x, 42 + y, 3, 1);
        g2d.fillRect(104 + x, 43 + y, 1, 3);
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 2);
        g2d.fillRect(112 + x, 44 + y, 1, 2);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(122 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 62 + y, 1, 1);
        g2d.fillRect(97 + x, 65 + y, 1, 1);
        g2d.fillRect(127 + x, 70 + y, 1, 1);
        g2d.fillRect(126 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 56 + y, 1, 9);
        g2d.fillRect(102 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(104 + x, 67 + y, 1, 2);
        g2d.fillRect(98 + x, 70 + y, 1, 13);
        g2d.fillRect(100 + x, 72 + y, 1, 9);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 12);
        g2d.fillRect(97 + x, 107 + y, 1, 7);
        g2d.fillRect(96 + x, 120 + y, 1, 6);
        g2d.fillRect(95 + x, 129 + y, 1, 3);
        g2d.fillRect(94 + x, 134 + y, 1, 3);
        g2d.fillRect(93 + x, 137 + y, 1, 14);
        g2d.fillRect(92 + x, 143 + y, 1, 12);
        g2d.fillRect(94 + x, 144 + y, 1, 1);
        g2d.fillRect(91 + x, 146 + y, 1, 10);
        g2d.fillRect(90 + x, 150 + y, 1, 8);
        g2d.fillRect(89 + x, 153 + y, 1, 6);
        g2d.fillRect(88 + x, 155 + y, 1, 6);
        g2d.fillRect(87 + x, 156 + y, 1, 1);
        g2d.fillRect(87 + x, 158 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 42 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(106 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(120 + x, 58 + y, 2, 1);
        g2d.fillRect(96 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(122 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(99 + x, 64 + y, 1, 1);
        g2d.fillRect(95 + x, 65 + y, 2, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(127 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(153, 95, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(206, 123, 82));
        COLORS.set(ImageUtilities.GREY, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 156, 82));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(204, 159, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(204, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.GREY, new Color(255, 191, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(153, 191, 255));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 223, 170));
    }

     {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(153, 95, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(206, 123, 82));
        COLORS.set(ImageUtilities.GREY, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 156, 82));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(204, 159, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(204, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.GREY, new Color(255, 191, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(153, 191, 255));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 223, 170));
    }

    public boolean getOriginalCA() {
        return false;
    }

    public void drawBody(b.Bd bd, int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void drawBody(b.Bd bd) {
        bd.paintCore = false;
        bd.paintLegs = false;
    }
}
