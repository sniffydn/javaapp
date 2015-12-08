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
import util.GraphicsMap;
import pieces.p.Frilly2;
import pieces.p.Frilly3;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class TopUpper3 extends SuperTU {

    Frilly2[] frillyTwos = new Frilly2[7];
    Frilly3[] frillyThrees = new Frilly3[9];

    private void initFrillys() {
        prep = true;
        containsTL = Math.random() < .5;
        ling = true;
        swim = true;
        for (int i = 0; i < frillyTwos.length; i++) {
            frillyTwos[i] = new Frilly2();
        }
        for (int i = 0; i < frillyThrees.length; i++) {
            frillyThrees[i] = new Frilly3();
        }
    }

    public TopUpper3() {
        super();
        initFrillys();
    }

    /** Creates a new instance of GenericClothes */
    public TopUpper3(String middle) {
        super(middle, 3);
        initFrillys();
    }

    public TopUpper3(String middle, int layer) {
        super(middle, layer);
        initFrillys();
    }

    public TopUpper3(String middle, ColorArray colorSwitch) {
        super(middle, 3, colorSwitch);
        initFrillys();
    }

    public TopUpper3(String middle, int layer, ColorArray colorSwitch) {
        super(middle, layer, colorSwitch);
        initFrillys();
    }

    public TopUpper3(String middle, Piece p) {
        super(middle, 3);
        initFrillys();
    }

    public void drawB(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 50 + y, 2, 1);
        g2d.fillRect(101 + x, 51 + y, 2, 1);
        g2d.fillRect(103 + x, 52 + y, 4, 1);
        g2d.fillRect(106 + x, 53 + y, 4, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 3);
        g2d.fillRect(110 + x, 54 + y, 2, 1);
        g2d.fillRect(111 + x, 53 + y, 4, 1);
        g2d.fillRect(114 + x, 52 + y, 4, 1);
        g2d.fillRect(118 + x, 51 + y, 2, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 4);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(111 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 4);
        g2d.fillRect(113 + x, 56 + y, 1, 4);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(99 + x, 52 + y, 1, 6);
        g2d.fillRect(100 + x, 54 + y, 1, 5);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(102 + x, 57 + y, 1, 4);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 1, 4);
        g2d.fillRect(108 + x, 55 + y, 1, 4);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 53 + y, 3, 1);
        g2d.fillRect(106 + x, 54 + y, 3, 1);
        g2d.fillRect(115 + x, 53 + y, 3, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 2, 1);
        g2d.fillRect(99 + x, 51 + y, 2, 1);
        g2d.fillRect(118 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(118 + x, 53 + y, 1, 4);
        g2d.fillRect(119 + x, 53 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 4);
        g2d.fillRect(116 + x, 54 + y, 1, 4);
        g2d.fillRect(117 + x, 54 + y, 1, 4);
        g2d.fillRect(113 + x, 55 + y, 2, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(102 + x, 53 + y, 1, 4);
        g2d.fillRect(103 + x, 54 + y, 1, 4);
        g2d.fillRect(104 + x, 54 + y, 1, 4);
        g2d.fillRect(105 + x, 54 + y, 1, 4);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
    }

    public void drawC(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 2, 1);
        g2d.fillRect(114 + x, 55 + y, 3, 1);
        g2d.fillRect(104 + x, 55 + y, 3, 1);
        g2d.fillRect(117 + x, 54 + y, 3, 1);
        g2d.fillRect(101 + x, 54 + y, 3, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 2, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 2, 1);
        g2d.fillRect(98 + x, 51 + y, 2, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 6);
        g2d.fillRect(123 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 4, 1);
        g2d.fillRect(114 + x, 54 + y, 3, 1);
        g2d.fillRect(107 + x, 55 + y, 3, 1);
        g2d.fillRect(116 + x, 53 + y, 4, 1);
        g2d.fillRect(104 + x, 54 + y, 3, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 7);
        g2d.fillRect(98 + x, 56 + y, 1, 4);
        g2d.fillRect(99 + x, 57 + y, 1, 4);
        g2d.fillRect(100 + x, 58 + y, 1, 4);
        g2d.fillRect(101 + x, 59 + y, 7, 3);
        g2d.fillRect(102 + x, 62 + y, 5, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 4, 1);
        g2d.fillRect(107 + x, 57 + y, 3, 1);
        g2d.fillRect(109 + x, 56 + y, 3, 1);
        g2d.fillRect(111 + x, 55 + y, 3, 1);
        g2d.fillRect(111 + x, 57 + y, 3, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 10, 2);
        g2d.fillRect(113 + x, 61 + y, 8, 1);
        g2d.fillRect(114 + x, 62 + y, 6, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(120 + x, 58 + y, 4, 1);
        g2d.fillRect(121 + x, 57 + y, 3, 1);
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(123 + x, 52 + y, 2, 5);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(99 + x, 53 + y, 1, 4);
        g2d.fillRect(100 + x, 54 + y, 1, 4);
        g2d.fillRect(101 + x, 55 + y, 3, 4);
        g2d.fillRect(104 + x, 56 + y, 2, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 5, 3);
        g2d.fillRect(120 + x, 54 + y, 1, 4);
        g2d.fillRect(117 + x, 55 + y, 3, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 2, 3);
    }

    public void drawD(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 2, 1);
        g2d.fillRect(114 + x, 55 + y, 3, 1);
        g2d.fillRect(104 + x, 55 + y, 3, 1);
        g2d.fillRect(117 + x, 54 + y, 3, 1);
        g2d.fillRect(101 + x, 54 + y, 3, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 2, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(124 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 50 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 2, 1);
        g2d.fillRect(98 + x, 51 + y, 2, 1);
        g2d.fillRect(123 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 7);
        g2d.fillRect(101 + x, 53 + y, 4, 1);
        g2d.fillRect(114 + x, 54 + y, 3, 1);
        g2d.fillRect(107 + x, 55 + y, 3, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 8);
        g2d.fillRect(104 + x, 54 + y, 3, 1);
        g2d.fillRect(116 + x, 53 + y, 4, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 4);
        g2d.fillRect(98 + x, 57 + y, 1, 4);
        g2d.fillRect(99 + x, 58 + y, 1, 4);
        g2d.fillRect(100 + x, 59 + y, 8, 3);
        g2d.fillRect(101 + x, 62 + y, 6, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 4, 1);
        g2d.fillRect(107 + x, 57 + y, 3, 1);
        g2d.fillRect(109 + x, 56 + y, 3, 1);
        g2d.fillRect(111 + x, 55 + y, 3, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 4);
        g2d.fillRect(113 + x, 57 + y, 1, 5);
        g2d.fillRect(114 + x, 58 + y, 1, 5);
        g2d.fillRect(115 + x, 59 + y, 6, 4);
        g2d.fillRect(121 + x, 58 + y, 1, 4);
        g2d.fillRect(122 + x, 57 + y, 1, 4);
        g2d.fillRect(123 + x, 56 + y, 1, 4);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(124 + x, 51 + y, 2, 6);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(123 + x, 52 + y, 1, 4);
        g2d.fillRect(97 + x, 52 + y, 1, 4);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(99 + x, 53 + y, 1, 5);
        g2d.fillRect(100 + x, 54 + y, 1, 5);
        g2d.fillRect(101 + x, 55 + y, 3, 4);
        g2d.fillRect(104 + x, 56 + y, 2, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 2, 3);
        g2d.fillRect(117 + x, 55 + y, 4, 4);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 5);
        g2d.fillRect(122 + x, 53 + y, 1, 4);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (middle.equalsIgnoreCase("b")) {
            drawB(x, y, g2d);
        } else if (middle.equalsIgnoreCase("c")) {
            drawC(x, y, g2d);
        } else if (middle.equalsIgnoreCase("d")) {
            drawD(x, y, g2d);
        }
    }
}
