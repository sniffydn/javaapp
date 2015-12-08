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
public class Pose0H extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Pose0H() {
        super();
    }

    public Pose0H(int layer) {
        super(layer);
    }

    public Pose0H(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Pose0H(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void paintFront(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(87 + x, 159 + y, 1, 4);
        g2d.fillRect(85 + x, 160 + y, 1, 1);
        g2d.fillRect(86 + x, 161 + y, 1, 1);
        g2d.fillRect(88 + x, 161 + y, 1, 2);
        g2d.fillRect(91 + x, 161 + y, 1, 2);
        g2d.fillRect(92 + x, 161 + y, 1, 2);
        g2d.fillRect(94 + x, 161 + y, 1, 1);
        g2d.fillRect(89 + x, 162 + y, 2, 1);
        g2d.fillRect(93 + x, 162 + y, 1, 1);
        g2d.fillRect(117 + x, 162 + y, 1, 2);
        g2d.fillRect(113 + x, 163 + y, 1, 2);
        g2d.fillRect(114 + x, 163 + y, 1, 2);
        g2d.fillRect(115 + x, 163 + y, 1, 2);
        g2d.fillRect(116 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 164 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 39 + y, 1, 1);
        g2d.fillRect(113 + x, 39 + y, 1, 1);
        g2d.fillRect(110 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(109 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 3);
        g2d.fillRect(108 + x, 42 + y, 1, 7);
        g2d.fillRect(104 + x, 43 + y, 4, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 3);
        g2d.fillRect(109 + x, 44 + y, 1, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(109 + x, 46 + y, 1, 3);
        g2d.fillRect(113 + x, 46 + y, 2, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 3);
        g2d.fillRect(110 + x, 47 + y, 1, 2);
        g2d.fillRect(111 + x, 47 + y, 2, 1);
        g2d.fillRect(115 + x, 47 + y, 2, 1);
        g2d.fillRect(107 + x, 48 + y, 1, 3);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 4);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 2, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 3, 1);
        g2d.fillRect(112 + x, 71 + y, 2, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 39 + y, 3, 1);
        g2d.fillRect(108 + x, 40 + y, 2, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(105 + x, 41 + y, 3, 1);
        g2d.fillRect(110 + x, 41 + y, 1, 6);
        g2d.fillRect(114 + x, 41 + y, 1, 3);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(107 + x, 42 + y, 1, 1);
        g2d.fillRect(109 + x, 42 + y, 1, 2);
        g2d.fillRect(104 + x, 44 + y, 1, 1);
        g2d.fillRect(107 + x, 44 + y, 1, 2);
        g2d.fillRect(111 + x, 44 + y, 1, 3);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 1, 6);
        g2d.fillRect(109 + x, 45 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);
        g2d.fillRect(104 + x, 46 + y, 2, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 2, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 2);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 3);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 3, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 8);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 3);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(122 + x, 52 + y, 1, 5);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(110 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 54 + y, 1, 3);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 4);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 2);
        g2d.fillRect(121 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 3);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 8);
        g2d.fillRect(109 + x, 62 + y, 1, 3);
        g2d.fillRect(114 + x, 63 + y, 1, 3);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 3);
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 67 + y, 1, 3);
        g2d.fillRect(111 + x, 68 + y, 2, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 2);
        g2d.fillRect(107 + x, 72 + y, 3, 1);
        g2d.fillRect(115 + x, 72 + y, 2, 1);
        g2d.fillRect(110 + x, 73 + y, 2, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 3);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 3, 1);
        g2d.fillRect(113 + x, 75 + y, 2, 1);
        g2d.fillRect(115 + x, 76 + y, 2, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 40 + y, 1, 4);
        g2d.fillRect(108 + x, 41 + y, 1, 1);
        g2d.fillRect(105 + x, 42 + y, 2, 1);
        g2d.fillRect(112 + x, 43 + y, 1, 3);
        g2d.fillRect(105 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 47 + y, 1, 3);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 3);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 3, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 2, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 4);
        g2d.fillRect(110 + x, 62 + y, 1, 5);
        g2d.fillRect(112 + x, 62 + y, 2, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 2, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 2, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 3);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 3, 1);
        g2d.fillRect(121 + x, 75 + y, 3, 1);
        g2d.fillRect(92 + x, 76 + y, 1, 2);
        g2d.fillRect(124 + x, 76 + y, 2, 1);
        g2d.fillRect(126 + x, 77 + y, 1, 1);
        g2d.fillRect(93 + x, 78 + y, 2, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(95 + x, 79 + y, 1, 1);
        g2d.fillRect(91 + x, 160 + y, 2, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 1);
        g2d.fillRect(113 + x, 162 + y, 3, 1);
        g2d.fillRect(110 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 44 + y, 1, 2);
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 2, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 2, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 67 + y, 2, 1);
        g2d.fillRect(110 + x, 69 + y, 2, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 2, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 79 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(112 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 48 + y, 3, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(112 + x, 73 + y, 2, 1);
        g2d.fillRect(114 + x, 74 + y, 2, 1);
    }

    public void setOriginalCA(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(153, 95, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(206, 123, 82));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.GREY, new Color(255, 127, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 156, 82));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(102, 63, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(102, 95, 0));
        COLORS.set(ImageUtilities.GREY, new Color(153, 127, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(153, 127, 85));
        COLORS.set(ImageUtilities.GREY_2, new Color(204, 159, 85));
    }

     {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(153, 95, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(206, 123, 82));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(204, 127, 85));
        COLORS.set(ImageUtilities.GREY, new Color(255, 127, 85));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 156, 82));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 159, 85));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(0, 0, 0));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(102, 63, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(102, 95, 0));
        COLORS.set(ImageUtilities.GREY, new Color(153, 127, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(153, 127, 85));
        COLORS.set(ImageUtilities.GREY_2, new Color(204, 159, 85));
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
