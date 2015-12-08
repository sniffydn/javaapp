/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.t.u.a;

import clts.SuperTL;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Platter0 extends SuperTL {

    /** Creates a new instance of GenericClothes */
    public Platter0() {
        super(2);
    }

    public Platter0(int layer) {
        super(layer);
    }

    public Platter0(ColorArray colorSwitch) {
        super(2, colorSwitch);
    }

    public Platter0(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft3(int x, int y, GraphicsMap g2d) {
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        paintPlatter(offsetX + shiftX - 15, shiftY - 56, g2d);
    }

    public void paintPlatter(int x, int y, GraphicsMap g2d) {
        g2d.setColor(new Color(0, 0, 0, 255));
        g2d.fillRect(105 + x, 108 + y, 1, 1);


        g2d.setColor(new Color(17, 17, 17, 255));
        g2d.fillRect(112 + x, 104 + y, 1, 2);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(104 + x, 108 + y, 1, 1);
        g2d.fillRect(106 + x, 108 + y, 3, 1);


        g2d.setColor(new Color(34, 34, 34, 255));
        g2d.fillRect(109 + x, 107 + y, 1, 1);
        g2d.fillRect(103 + x, 108 + y, 1, 1);


        g2d.setColor(new Color(51, 63, 0, 255));
        g2d.fillRect(111 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(102, 31, 0, 255));
        g2d.fillRect(111 + x, 103 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(109 + x, 108 + y, 2, 1);


        g2d.setColor(new Color(51, 95, 0, 255));
        g2d.fillRect(108 + x, 105 + y, 1, 1);


        g2d.setColor(new Color(153, 0, 0, 255));
        g2d.fillRect(87 + x, 106 + y, 2, 1);


        g2d.setColor(new Color(0, 159, 0, 255));
        g2d.fillRect(108 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(102, 63, 0, 255));
        g2d.fillRect(110 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 105 + y, 2, 1);
        g2d.fillRect(100 + x, 107 + y, 1, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 1);


        g2d.setColor(new Color(153, 31, 0, 255));
        g2d.fillRect(98 + x, 103 + y, 1, 1);
        g2d.fillRect(96 + x, 104 + y, 2, 1);
        g2d.fillRect(88 + x, 105 + y, 1, 1);
        g2d.fillRect(93 + x, 105 + y, 1, 1);
        g2d.fillRect(91 + x, 106 + y, 2, 1);


        g2d.setColor(new Color(102, 95, 0, 255));
        g2d.fillRect(112 + x, 103 + y, 1, 1);


        g2d.setColor(new Color(204, 0, 0, 255));
        g2d.fillRect(87 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(68, 68, 68, 255));
        g2d.fillRect(112 + x, 106 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(51, 159, 0, 255));
        g2d.fillRect(109 + x, 105 + y, 1, 1);
        g2d.fillRect(107 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(153, 63, 0, 255));
        g2d.fillRect(111 + x, 102 + y, 1, 1);
        g2d.fillRect(109 + x, 104 + y, 1, 1);
        g2d.fillRect(95 + x, 105 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 108 + y, 1, 2);
        g2d.fillRect(104 + x, 109 + y, 1, 2);
        g2d.fillRect(107 + x, 109 + y, 1, 1);
        g2d.fillRect(108 + x, 110 + y, 1, 1);


        g2d.setColor(new Color(102, 127, 0, 255));
        g2d.fillRect(101 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(204, 31, 0, 255));
        g2d.fillRect(97 + x, 103 + y, 1, 1);


        g2d.setColor(new Color(153, 95, 0, 255));
        g2d.fillRect(107 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 1);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(111 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 2);
        g2d.fillRect(108 + x, 109 + y, 2, 1);
        g2d.fillRect(102 + x, 110 + y, 1, 1);
        g2d.fillRect(105 + x, 110 + y, 3, 1);


        g2d.setColor(new Color(85, 85, 85, 255));
        g2d.fillRect(106 + x, 107 + y, 2, 1);


        g2d.setColor(new Color(204, 63, 0, 255));
        g2d.fillRect(87 + x, 105 + y, 1, 1);
        g2d.fillRect(94 + x, 105 + y, 1, 1);


        g2d.setColor(new Color(153, 127, 0, 255));
        g2d.fillRect(102 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(51, 159, 85, 255));
        g2d.fillRect(106 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(204, 95, 0, 255));
        g2d.fillRect(105 + x, 98 + y, 1, 3);
        g2d.fillRect(106 + x, 98 + y, 1, 3);
        g2d.fillRect(102 + x, 99 + y, 2, 1);
        g2d.fillRect(107 + x, 99 + y, 3, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(104 + x, 101 + y, 1, 1);
        g2d.fillRect(109 + x, 101 + y, 1, 3);
        g2d.fillRect(110 + x, 101 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 2);
        g2d.fillRect(110 + x, 103 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 2, 1);
        g2d.fillRect(107 + x, 104 + y, 2, 1);
        g2d.fillRect(89 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 105 + y, 1, 1);


        g2d.setColor(new Color(153, 63, 85, 255));
        g2d.fillRect(96 + x, 105 + y, 1, 1);
        g2d.fillRect(88 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(204, 127, 0, 255));
        g2d.fillRect(104 + x, 99 + y, 1, 2);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(107 + x, 100 + y, 1, 2);
        g2d.fillRect(109 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 2, 1);
        g2d.fillRect(110 + x, 102 + y, 1, 1);
        g2d.fillRect(96 + x, 103 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 1);
        g2d.fillRect(104 + x, 104 + y, 2, 1);


        g2d.setColor(new Color(153, 95, 85, 255));
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(97 + x, 102 + y, 2, 1);
        g2d.fillRect(100 + x, 103 + y, 1, 2);
        g2d.fillRect(98 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(204, 63, 85, 255));
        g2d.fillRect(93 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(119, 119, 119, 255));
        g2d.fillRect(109 + x, 106 + y, 2, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(204, 159, 0, 255));
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(103 + x, 103 + y, 1, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 1);


        g2d.setColor(new Color(153, 127, 85, 255));
        g2d.fillRect(89 + x, 104 + y, 1, 1);
        g2d.fillRect(94 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(255, 127, 0, 255));
        g2d.fillRect(105 + x, 102 + y, 2, 1);
        g2d.fillRect(108 + x, 102 + y, 1, 1);
        g2d.fillRect(106 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 109 + y, 1, 1);


        g2d.setColor(new Color(204, 95, 85, 255));
        g2d.fillRect(102 + x, 105 + y, 2, 1);
        g2d.fillRect(86 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(204, 191, 0, 255));
        g2d.fillRect(111 + x, 104 + y, 1, 2);


        g2d.setColor(new Color(153, 159, 85, 255));
        g2d.fillRect(100 + x, 106 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 1);


        g2d.setColor(new Color(136, 136, 136, 255));
        g2d.fillRect(99 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 1);


        g2d.setColor(new Color(255, 159, 0, 255));
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 1);
        g2d.fillRect(107 + x, 102 + y, 1, 2);
        g2d.fillRect(105 + x, 103 + y, 1, 1);
        g2d.fillRect(103 + x, 106 + y, 2, 1);
        g2d.fillRect(105 + x, 109 + y, 2, 1);


        g2d.setColor(new Color(204, 127, 85, 255));
        g2d.fillRect(96 + x, 102 + y, 1, 1);
        g2d.fillRect(91 + x, 104 + y, 1, 1);
        g2d.fillRect(95 + x, 106 + y, 2, 1);
        g2d.fillRect(86 + x, 107 + y, 1, 1);
        g2d.fillRect(89 + x, 107 + y, 1, 2);
        g2d.fillRect(90 + x, 107 + y, 1, 2);
        g2d.fillRect(91 + x, 107 + y, 1, 2);
        g2d.fillRect(92 + x, 107 + y, 1, 2);
        g2d.fillRect(93 + x, 107 + y, 1, 2);
        g2d.fillRect(94 + x, 107 + y, 1, 2);
        g2d.fillRect(87 + x, 108 + y, 1, 1);


        g2d.setColor(new Color(255, 95, 85, 255));
        g2d.fillRect(101 + x, 105 + y, 1, 1);


        g2d.setColor(new Color(255, 191, 0, 255));
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(95 + x, 103 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 1, 1);
        g2d.fillRect(92 + x, 104 + y, 1, 2);
        g2d.fillRect(93 + x, 104 + y, 2, 1);
        g2d.fillRect(90 + x, 105 + y, 1, 2);
        g2d.fillRect(91 + x, 105 + y, 1, 1);
        g2d.fillRect(89 + x, 106 + y, 1, 1);
        g2d.fillRect(101 + x, 106 + y, 2, 1);


        g2d.setColor(new Color(204, 159, 85, 255));
        g2d.fillRect(94 + x, 103 + y, 1, 1);
        g2d.fillRect(90 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 3);
        g2d.fillRect(98 + x, 105 + y, 1, 2);
        g2d.fillRect(95 + x, 107 + y, 1, 2);
        g2d.fillRect(96 + x, 107 + y, 1, 2);
        g2d.fillRect(88 + x, 108 + y, 1, 1);
        g2d.fillRect(87 + x, 109 + y, 1, 1);
        g2d.fillRect(89 + x, 109 + y, 6, 1);


        g2d.setColor(new Color(153, 153, 153, 255));
        g2d.fillRect(113 + x, 105 + y, 1, 3);
        g2d.fillRect(84 + x, 106 + y, 2, 1);
        g2d.fillRect(99 + x, 106 + y, 1, 2);
        g2d.fillRect(82 + x, 107 + y, 1, 3);
        g2d.fillRect(83 + x, 107 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 1);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(81 + x, 108 + y, 1, 1);
        g2d.fillRect(84 + x, 108 + y, 1, 1);
        g2d.fillRect(86 + x, 108 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 3);
        g2d.fillRect(112 + x, 108 + y, 1, 1);
        g2d.fillRect(95 + x, 109 + y, 1, 2);
        g2d.fillRect(96 + x, 109 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 2, 1);
        g2d.fillRect(85 + x, 110 + y, 2, 1);
        g2d.fillRect(88 + x, 110 + y, 7, 1);
        g2d.fillRect(97 + x, 110 + y, 2, 1);
        g2d.fillRect(101 + x, 110 + y, 1, 1);
        g2d.fillRect(109 + x, 110 + y, 1, 3);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(113 + x, 110 + y, 1, 1);
        g2d.fillRect(81 + x, 111 + y, 3, 1);
        g2d.fillRect(100 + x, 111 + y, 1, 2);
        g2d.fillRect(104 + x, 111 + y, 5, 1);
        g2d.fillRect(83 + x, 112 + y, 6, 1);
        g2d.fillRect(91 + x, 112 + y, 2, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 1);
        g2d.fillRect(108 + x, 112 + y, 1, 1);
        g2d.fillRect(110 + x, 112 + y, 1, 1);


        g2d.setColor(new Color(255, 127, 85, 255));
        g2d.fillRect(101 + x, 101 + y, 1, 1);


        g2d.setColor(new Color(255, 223, 0, 255));
        g2d.fillRect(105 + x, 106 + y, 1, 1);


        g2d.setColor(new Color(255, 159, 85, 255));
        g2d.fillRect(103 + x, 101 + y, 1, 1);


        g2d.setColor(new Color(204, 127, 170, 255));
        g2d.fillRect(86 + x, 105 + y, 1, 1);


        g2d.setColor(new Color(170, 170, 170, 255));
        g2d.fillRect(84 + x, 107 + y, 2, 1);
        g2d.fillRect(85 + x, 108 + y, 1, 2);
        g2d.fillRect(98 + x, 108 + y, 1, 2);
        g2d.fillRect(99 + x, 108 + y, 2, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 2);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(81 + x, 109 + y, 1, 2);
        g2d.fillRect(86 + x, 109 + y, 1, 1);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(82 + x, 110 + y, 1, 1);
        g2d.fillRect(87 + x, 110 + y, 1, 2);
        g2d.fillRect(99 + x, 110 + y, 2, 1);
        g2d.fillRect(86 + x, 111 + y, 1, 1);
        g2d.fillRect(88 + x, 111 + y, 4, 1);
        g2d.fillRect(101 + x, 111 + y, 3, 1);
        g2d.fillRect(89 + x, 112 + y, 2, 1);
        g2d.fillRect(102 + x, 112 + y, 6, 1);


        g2d.setColor(new Color(255, 255, 0, 255));
        g2d.fillRect(110 + x, 105 + y, 1, 1);


        g2d.setColor(new Color(204, 159, 170, 255));
        g2d.fillRect(99 + x, 105 + y, 1, 1);


        g2d.setColor(new Color(187, 187, 187, 255));
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(83 + x, 108 + y, 1, 1);
        g2d.fillRect(84 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(92 + x, 111 + y, 2, 1);
        g2d.fillRect(95 + x, 111 + y, 1, 2);
        g2d.fillRect(96 + x, 111 + y, 1, 2);
        g2d.fillRect(97 + x, 111 + y, 1, 2);
        g2d.fillRect(110 + x, 111 + y, 2, 1);
        g2d.fillRect(94 + x, 112 + y, 1, 1);
        g2d.fillRect(98 + x, 112 + y, 2, 1);


        g2d.setColor(new Color(221, 221, 221, 255));
        g2d.fillRect(114 + x, 105 + y, 1, 2);
        g2d.fillRect(83 + x, 109 + y, 1, 2);
        g2d.fillRect(84 + x, 110 + y, 1, 2);
        g2d.fillRect(85 + x, 111 + y, 1, 1);
        g2d.fillRect(98 + x, 111 + y, 2, 1);
        g2d.fillRect(112 + x, 111 + y, 2, 1);
        g2d.fillRect(93 + x, 112 + y, 1, 1);


        g2d.setColor(new Color(255, 255, 255, 255));
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(112 + x, 102 + y, 1, 1);
        g2d.fillRect(93 + x, 103 + y, 1, 1);
        g2d.fillRect(88 + x, 109 + y, 1, 1);
        g2d.fillRect(103 + x, 110 + y, 1, 1);
        g2d.fillRect(94 + x, 111 + y, 1, 1);
    }
}
