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
import util.Color;
import util.GraphicsMap;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Camera extends SuperB {

    /** Creates a new instance of GenericClothes */
    public Camera() {
        super();
    }

    public Camera(int layer) {
        super(layer);
    }

    public Camera(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Camera(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        paintCamera(offsetX + shiftX, shiftY, g2d);
    }

    public void paintCamera(int x, int y, GraphicsMap g2d) {


        g2d.setColor(new Color(61, 61, 61, 255));
        g2d.fillRect(115 + x, 41 + y, 2, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 5);
        g2d.fillRect(135 + x, 45 + y, 1, 2);
        g2d.fillRect(136 + x, 45 + y, 5, 1);
        g2d.fillRect(140 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(136 + x, 47 + y, 4, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(142 + x, 52 + y, 7, 1);
        g2d.fillRect(141 + x, 53 + y, 1, 1);
        g2d.fillRect(144 + x, 53 + y, 4, 1);
        g2d.fillRect(149 + x, 53 + y, 1, 1);
        g2d.fillRect(140 + x, 54 + y, 1, 2);
        g2d.fillRect(143 + x, 54 + y, 1, 1);
        g2d.fillRect(148 + x, 54 + y, 1, 1);
        g2d.fillRect(150 + x, 54 + y, 1, 1);
        g2d.fillRect(142 + x, 55 + y, 1, 5);
        g2d.fillRect(149 + x, 55 + y, 1, 5);
        g2d.fillRect(151 + x, 55 + y, 1, 6);
        g2d.fillRect(139 + x, 56 + y, 1, 6);
        g2d.fillRect(143 + x, 60 + y, 1, 1);
        g2d.fillRect(148 + x, 60 + y, 1, 1);
        g2d.fillRect(144 + x, 61 + y, 4, 1);
        g2d.fillRect(150 + x, 61 + y, 1, 1);
        g2d.fillRect(140 + x, 62 + y, 1, 1);
        g2d.fillRect(145 + x, 62 + y, 1, 1);
        g2d.fillRect(149 + x, 62 + y, 1, 2);
        g2d.fillRect(141 + x, 63 + y, 1, 1);
        g2d.fillRect(146 + x, 63 + y, 1, 2);
        g2d.fillRect(147 + x, 63 + y, 1, 5);
        g2d.fillRect(148 + x, 63 + y, 1, 1);
        g2d.fillRect(142 + x, 64 + y, 4, 1);
        g2d.fillRect(146 + x, 67 + y, 1, 1);
        g2d.fillRect(144 + x, 68 + y, 2, 1);
        g2d.fillRect(132 + x, 69 + y, 3, 1);
        g2d.fillRect(141 + x, 69 + y, 3, 1);
        g2d.fillRect(135 + x, 70 + y, 6, 1);
        g2d.fillRect(128 + x, 87 + y, 6, 1);
        g2d.fillRect(138 + x, 87 + y, 6, 1);
        g2d.fillRect(127 + x, 88 + y, 1, 2);
        g2d.fillRect(134 + x, 88 + y, 1, 2);
        g2d.fillRect(135 + x, 88 + y, 1, 2);
        g2d.fillRect(136 + x, 88 + y, 1, 2);
        g2d.fillRect(137 + x, 88 + y, 1, 2);
        g2d.fillRect(144 + x, 88 + y, 1, 2);
        g2d.fillRect(128 + x, 90 + y, 6, 1);
        g2d.fillRect(138 + x, 90 + y, 6, 1);


        g2d.setColor(new Color(67, 68, 69, 255));
        g2d.fillRect(109 + x, 167 + y, 1, 2);
        g2d.fillRect(111 + x, 167 + y, 1, 3);
        g2d.fillRect(112 + x, 167 + y, 1, 2);
        g2d.fillRect(149 + x, 167 + y, 1, 2);
        g2d.fillRect(150 + x, 167 + y, 1, 3);
        g2d.fillRect(152 + x, 167 + y, 1, 2);
        g2d.fillRect(110 + x, 169 + y, 1, 1);
        g2d.fillRect(151 + x, 169 + y, 1, 1);
        g2d.fillRect(131 + x, 172 + y, 1, 4);
        g2d.fillRect(132 + x, 172 + y, 1, 3);
        g2d.fillRect(130 + x, 175 + y, 1, 1);


        g2d.setColor(new Color(75, 75, 75, 255));
        g2d.fillRect(115 + x, 46 + y, 2, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);


        g2d.setColor(new Color(78, 79, 79, 255));
        g2d.fillRect(145 + x, 65 + y, 1, 3);
        g2d.fillRect(146 + x, 65 + y, 1, 2);
        g2d.fillRect(129 + x, 88 + y, 1, 2);
        g2d.fillRect(131 + x, 88 + y, 1, 2);
        g2d.fillRect(133 + x, 88 + y, 1, 2);
        g2d.fillRect(143 + x, 88 + y, 1, 2);
        g2d.fillRect(138 + x, 89 + y, 5, 1);


        g2d.setColor(new Color(81, 82, 82, 255));
        g2d.fillRect(116 + x, 42 + y, 1, 4);
        g2d.fillRect(115 + x, 45 + y, 1, 1);


        g2d.setColor(new Color(89, 89, 89, 255));
        g2d.fillRect(126 + x, 45 + y, 1, 1);
        g2d.fillRect(129 + x, 46 + y, 1, 1);
        g2d.fillRect(138 + x, 46 + y, 2, 1);
        g2d.fillRect(132 + x, 47 + y, 1, 1);
        g2d.fillRect(137 + x, 53 + y, 1, 2);
        g2d.fillRect(138 + x, 53 + y, 1, 1);
        g2d.fillRect(148 + x, 53 + y, 1, 1);
        g2d.fillRect(149 + x, 54 + y, 1, 1);
        g2d.fillRect(150 + x, 55 + y, 1, 6);
        g2d.fillRect(127 + x, 59 + y, 3, 1);
        g2d.fillRect(123 + x, 60 + y, 4, 1);
        g2d.fillRect(129 + x, 60 + y, 1, 7);
        g2d.fillRect(149 + x, 60 + y, 1, 2);
        g2d.fillRect(119 + x, 61 + y, 4, 1);
        g2d.fillRect(148 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 8);
        g2d.fillRect(117 + x, 62 + y, 2, 1);
        g2d.fillRect(137 + x, 62 + y, 1, 2);
        g2d.fillRect(138 + x, 62 + y, 1, 1);
        g2d.fillRect(141 + x, 62 + y, 4, 1);
        g2d.fillRect(146 + x, 62 + y, 2, 1);
        g2d.fillRect(142 + x, 63 + y, 4, 1);
        g2d.fillRect(132 + x, 64 + y, 1, 5);
        g2d.fillRect(133 + x, 65 + y, 2, 1);
        g2d.fillRect(140 + x, 65 + y, 2, 1);
        g2d.fillRect(143 + x, 65 + y, 1, 4);
        g2d.fillRect(144 + x, 65 + y, 1, 3);
        g2d.fillRect(128 + x, 66 + y, 1, 1);
        g2d.fillRect(136 + x, 66 + y, 4, 1);
        g2d.fillRect(124 + x, 67 + y, 4, 1);
        g2d.fillRect(120 + x, 68 + y, 4, 1);
        g2d.fillRect(117 + x, 69 + y, 3, 1);
        g2d.fillRect(110 + x, 167 + y, 1, 2);
        g2d.fillRect(151 + x, 167 + y, 1, 2);
        g2d.fillRect(129 + x, 172 + y, 1, 3);
        g2d.fillRect(130 + x, 172 + y, 1, 3);


        g2d.setColor(new Color(91, 91, 91, 255));
        g2d.fillRect(129 + x, 52 + y, 3, 1);
        g2d.fillRect(125 + x, 53 + y, 4, 1);
        g2d.fillRect(121 + x, 54 + y, 4, 1);
        g2d.fillRect(117 + x, 55 + y, 4, 1);
        g2d.fillRect(114 + x, 56 + y, 3, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 16);


        g2d.setColor(new Color(99, 100, 99, 255));
        g2d.fillRect(115 + x, 42 + y, 1, 3);


        g2d.setColor(new Color(102, 101, 102, 255));
        g2d.fillRect(142 + x, 60 + y, 1, 2);
        g2d.fillRect(140 + x, 61 + y, 2, 1);
        g2d.fillRect(143 + x, 61 + y, 1, 1);


        g2d.setColor(new Color(105, 105, 105, 255));
        g2d.fillRect(142 + x, 65 + y, 1, 4);
        g2d.fillRect(141 + x, 66 + y, 1, 3);
        g2d.fillRect(128 + x, 88 + y, 1, 2);
        g2d.fillRect(130 + x, 88 + y, 1, 2);
        g2d.fillRect(132 + x, 88 + y, 1, 2);
        g2d.fillRect(138 + x, 88 + y, 5, 1);


        g2d.setColor(new Color(111, 110, 111, 255));
        g2d.fillRect(126 + x, 44 + y, 2, 1);
        g2d.fillRect(129 + x, 45 + y, 2, 1);
        g2d.fillRect(132 + x, 46 + y, 2, 1);
        g2d.fillRect(136 + x, 46 + y, 2, 1);
        g2d.fillRect(142 + x, 53 + y, 2, 1);
        g2d.fillRect(140 + x, 56 + y, 2, 1);
        g2d.fillRect(140 + x, 60 + y, 2, 1);
        g2d.fillRect(109 + x, 164 + y, 1, 3);
        g2d.fillRect(113 + x, 164 + y, 1, 2);


        g2d.setColor(new Color(111, 112, 111, 255));
        g2d.fillRect(133 + x, 66 + y, 1, 3);
        g2d.fillRect(134 + x, 66 + y, 1, 3);
        g2d.fillRect(136 + x, 67 + y, 1, 3);
        g2d.fillRect(137 + x, 67 + y, 1, 3);
        g2d.fillRect(138 + x, 69 + y, 3, 1);


        g2d.setColor(new Color(113, 113, 113, 255));
        g2d.fillRect(136 + x, 38 + y, 4, 1);
        g2d.fillRect(135 + x, 39 + y, 1, 6);
        g2d.fillRect(140 + x, 39 + y, 3, 1);
        g2d.fillRect(118 + x, 40 + y, 6, 1);
        g2d.fillRect(139 + x, 40 + y, 1, 1);
        g2d.fillRect(143 + x, 40 + y, 3, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 9);
        g2d.fillRect(124 + x, 41 + y, 3, 1);
        g2d.fillRect(138 + x, 41 + y, 1, 3);
        g2d.fillRect(146 + x, 41 + y, 3, 1);
        g2d.fillRect(127 + x, 42 + y, 3, 1);
        g2d.fillRect(145 + x, 42 + y, 1, 1);
        g2d.fillRect(149 + x, 42 + y, 1, 1);
        g2d.fillRect(130 + x, 43 + y, 3, 1);
        g2d.fillRect(136 + x, 43 + y, 2, 1);
        g2d.fillRect(144 + x, 43 + y, 1, 3);
        g2d.fillRect(150 + x, 43 + y, 1, 3);
        g2d.fillRect(133 + x, 44 + y, 2, 1);
        g2d.fillRect(139 + x, 44 + y, 3, 1);
        g2d.fillRect(142 + x, 45 + y, 1, 2);
        g2d.fillRect(143 + x, 45 + y, 1, 1);
        g2d.fillRect(141 + x, 46 + y, 1, 1);
        g2d.fillRect(145 + x, 46 + y, 1, 2);
        g2d.fillRect(146 + x, 46 + y, 4, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 8);
        g2d.fillRect(120 + x, 47 + y, 2, 1);
        g2d.fillRect(143 + x, 47 + y, 2, 1);
        g2d.fillRect(122 + x, 48 + y, 2, 1);
        g2d.fillRect(146 + x, 48 + y, 1, 1);
        g2d.fillRect(124 + x, 49 + y, 2, 1);
        g2d.fillRect(147 + x, 49 + y, 1, 3);
        g2d.fillRect(116 + x, 50 + y, 1, 6);
        g2d.fillRect(126 + x, 50 + y, 2, 1);
        g2d.fillRect(128 + x, 51 + y, 2, 1);
        g2d.fillRect(129 + x, 53 + y, 3, 1);
        g2d.fillRect(125 + x, 54 + y, 4, 1);
        g2d.fillRect(131 + x, 54 + y, 1, 15);
        g2d.fillRect(138 + x, 54 + y, 1, 1);
        g2d.fillRect(141 + x, 54 + y, 1, 2);
        g2d.fillRect(142 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 4, 1);
        g2d.fillRect(117 + x, 56 + y, 4, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 16);
        g2d.fillRect(115 + x, 57 + y, 2, 1);
        g2d.fillRect(140 + x, 57 + y, 1, 3);
        g2d.fillRect(141 + x, 57 + y, 1, 3);
        g2d.fillRect(138 + x, 63 + y, 1, 1);
        g2d.fillRect(129 + x, 68 + y, 2, 1);
        g2d.fillRect(125 + x, 69 + y, 4, 1);
        g2d.fillRect(121 + x, 70 + y, 4, 1);
        g2d.fillRect(117 + x, 71 + y, 4, 1);
        g2d.fillRect(115 + x, 72 + y, 2, 1);


        g2d.setColor(new Color(129, 129, 129, 255));
        g2d.fillRect(135 + x, 66 + y, 1, 4);
        g2d.fillRect(140 + x, 66 + y, 1, 3);
        g2d.fillRect(138 + x, 67 + y, 1, 2);
        g2d.fillRect(139 + x, 67 + y, 1, 2);
        g2d.fillRect(129 + x, 69 + y, 1, 18);
        g2d.fillRect(132 + x, 70 + y, 1, 17);
        g2d.fillRect(127 + x, 90 + y, 1, 3);
        g2d.fillRect(134 + x, 90 + y, 1, 3);
        g2d.fillRect(129 + x, 91 + y, 1, 81);
        g2d.fillRect(132 + x, 91 + y, 1, 81);
        g2d.fillRect(126 + x, 93 + y, 1, 5);
        g2d.fillRect(135 + x, 93 + y, 1, 5);
        g2d.fillRect(125 + x, 98 + y, 1, 3);
        g2d.fillRect(128 + x, 98 + y, 1, 3);
        g2d.fillRect(133 + x, 98 + y, 1, 3);
        g2d.fillRect(136 + x, 98 + y, 1, 3);
        g2d.fillRect(127 + x, 101 + y, 1, 5);
        g2d.fillRect(134 + x, 101 + y, 1, 5);
        g2d.fillRect(124 + x, 102 + y, 1, 4);
        g2d.fillRect(137 + x, 102 + y, 1, 4);
        g2d.fillRect(123 + x, 106 + y, 1, 4);
        g2d.fillRect(126 + x, 106 + y, 1, 4);
        g2d.fillRect(135 + x, 106 + y, 1, 4);
        g2d.fillRect(138 + x, 106 + y, 1, 4);
        g2d.fillRect(122 + x, 110 + y, 1, 5);
        g2d.fillRect(125 + x, 110 + y, 1, 5);
        g2d.fillRect(136 + x, 110 + y, 1, 5);
        g2d.fillRect(139 + x, 111 + y, 1, 4);
        g2d.fillRect(121 + x, 115 + y, 1, 4);
        g2d.fillRect(124 + x, 115 + y, 1, 4);
        g2d.fillRect(137 + x, 115 + y, 1, 4);
        g2d.fillRect(140 + x, 115 + y, 1, 4);
        g2d.fillRect(120 + x, 119 + y, 1, 4);
        g2d.fillRect(123 + x, 119 + y, 1, 4);
        g2d.fillRect(138 + x, 119 + y, 1, 4);
        g2d.fillRect(141 + x, 119 + y, 1, 4);
        g2d.fillRect(119 + x, 123 + y, 1, 5);
        g2d.fillRect(122 + x, 123 + y, 1, 5);
        g2d.fillRect(139 + x, 123 + y, 1, 5);
        g2d.fillRect(142 + x, 123 + y, 1, 5);
        g2d.fillRect(118 + x, 128 + y, 1, 3);
        g2d.fillRect(121 + x, 128 + y, 1, 3);
        g2d.fillRect(140 + x, 128 + y, 1, 3);
        g2d.fillRect(143 + x, 128 + y, 1, 3);
        g2d.fillRect(117 + x, 131 + y, 1, 5);
        g2d.fillRect(120 + x, 131 + y, 1, 5);
        g2d.fillRect(141 + x, 131 + y, 1, 5);
        g2d.fillRect(144 + x, 131 + y, 1, 5);
        g2d.fillRect(116 + x, 136 + y, 1, 3);
        g2d.fillRect(119 + x, 136 + y, 1, 3);
        g2d.fillRect(142 + x, 136 + y, 1, 3);
        g2d.fillRect(145 + x, 136 + y, 1, 3);
        g2d.fillRect(118 + x, 139 + y, 1, 5);
        g2d.fillRect(143 + x, 139 + y, 1, 5);
        g2d.fillRect(115 + x, 140 + y, 1, 4);
        g2d.fillRect(146 + x, 140 + y, 1, 4);
        g2d.fillRect(114 + x, 144 + y, 1, 4);
        g2d.fillRect(117 + x, 144 + y, 1, 4);
        g2d.fillRect(144 + x, 144 + y, 1, 4);
        g2d.fillRect(147 + x, 144 + y, 1, 4);
        g2d.fillRect(113 + x, 148 + y, 1, 5);
        g2d.fillRect(116 + x, 148 + y, 1, 5);
        g2d.fillRect(145 + x, 148 + y, 1, 5);
        g2d.fillRect(148 + x, 148 + y, 1, 5);
        g2d.fillRect(112 + x, 153 + y, 1, 3);
        g2d.fillRect(115 + x, 153 + y, 1, 3);
        g2d.fillRect(146 + x, 153 + y, 1, 3);
        g2d.fillRect(149 + x, 153 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 5);
        g2d.fillRect(114 + x, 156 + y, 1, 5);
        g2d.fillRect(147 + x, 156 + y, 1, 5);
        g2d.fillRect(150 + x, 156 + y, 1, 5);
        g2d.fillRect(110 + x, 161 + y, 1, 6);
        g2d.fillRect(113 + x, 161 + y, 1, 3);
        g2d.fillRect(148 + x, 161 + y, 1, 3);
        g2d.fillRect(151 + x, 161 + y, 1, 3);
        g2d.fillRect(112 + x, 164 + y, 1, 3);
        g2d.fillRect(149 + x, 164 + y, 1, 3);
        g2d.fillRect(152 + x, 166 + y, 1, 1);


        g2d.setColor(new Color(132, 133, 132, 255));
        g2d.fillRect(146 + x, 44 + y, 1, 1);
        g2d.fillRect(148 + x, 44 + y, 1, 1);
        g2d.fillRect(145 + x, 45 + y, 1, 1);
        g2d.fillRect(147 + x, 45 + y, 1, 1);
        g2d.fillRect(149 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 48 + y, 1, 7);
        g2d.fillRect(121 + x, 48 + y, 1, 1);
        g2d.fillRect(122 + x, 49 + y, 2, 1);
        g2d.fillRect(124 + x, 50 + y, 2, 1);
        g2d.fillRect(126 + x, 51 + y, 2, 1);
        g2d.fillRect(128 + x, 52 + y, 1, 1);
        g2d.fillRect(144 + x, 55 + y, 3, 1);
        g2d.fillRect(143 + x, 56 + y, 1, 3);
        g2d.fillRect(147 + x, 56 + y, 1, 3);
        g2d.fillRect(144 + x, 59 + y, 3, 1);


        g2d.setColor(new Color(108, 134, 167, 255));
        g2d.fillRect(121 + x, 57 + y, 1, 2);
        g2d.fillRect(122 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);


        g2d.setColor(new Color(167, 108, 137, 255));
        g2d.fillRect(125 + x, 56 + y, 1, 2);
        g2d.fillRect(126 + x, 56 + y, 1, 2);


        g2d.setColor(new Color(154, 154, 154, 255));
        g2d.fillRect(121 + x, 120 + y, 1, 2);
        g2d.fillRect(122 + x, 120 + y, 1, 2);
        g2d.fillRect(139 + x, 120 + y, 1, 2);
        g2d.fillRect(140 + x, 120 + y, 1, 2);
        g2d.fillRect(130 + x, 125 + y, 1, 3);
        g2d.fillRect(131 + x, 125 + y, 1, 3);
        g2d.fillRect(119 + x, 129 + y, 2, 1);
        g2d.fillRect(141 + x, 129 + y, 2, 1);
        g2d.fillRect(130 + x, 136 + y, 2, 1);


        g2d.setColor(new Color(162, 161, 161, 255));
        g2d.fillRect(146 + x, 42 + y, 1, 1);
        g2d.fillRect(148 + x, 42 + y, 1, 1);
        g2d.fillRect(145 + x, 43 + y, 1, 1);
        g2d.fillRect(147 + x, 43 + y, 1, 1);
        g2d.fillRect(149 + x, 43 + y, 1, 1);
        g2d.fillRect(146 + x, 49 + y, 1, 3);
        g2d.fillRect(132 + x, 50 + y, 2, 1);
        g2d.fillRect(143 + x, 50 + y, 3, 1);
        g2d.fillRect(124 + x, 51 + y, 1, 3);
        g2d.fillRect(125 + x, 51 + y, 1, 2);
        g2d.fillRect(133 + x, 51 + y, 2, 1);
        g2d.fillRect(136 + x, 51 + y, 1, 3);
        g2d.fillRect(137 + x, 51 + y, 1, 2);
        g2d.fillRect(138 + x, 51 + y, 1, 1);
        g2d.fillRect(123 + x, 52 + y, 1, 2);
        g2d.fillRect(126 + x, 52 + y, 2, 1);
        g2d.fillRect(134 + x, 52 + y, 1, 3);
        g2d.fillRect(121 + x, 53 + y, 2, 1);
        g2d.fillRect(144 + x, 57 + y, 1, 2);
        g2d.fillRect(145 + x, 58 + y, 2, 1);
        g2d.fillRect(140 + x, 63 + y, 1, 2);
        g2d.fillRect(139 + x, 64 + y, 1, 2);
        g2d.fillRect(141 + x, 64 + y, 1, 1);
        g2d.fillRect(136 + x, 65 + y, 3, 1);


        g2d.setColor(new Color(167, 167, 167, 255));
        g2d.fillRect(121 + x, 49 + y, 1, 4);
        g2d.fillRect(122 + x, 50 + y, 1, 3);
        g2d.fillRect(123 + x, 50 + y, 1, 2);


        g2d.setColor(new Color(178, 179, 179, 255));
        g2d.fillRect(148 + x, 55 + y, 1, 5);
        g2d.fillRect(144 + x, 56 + y, 3, 1);
        g2d.fillRect(146 + x, 57 + y, 1, 1);
        g2d.fillRect(147 + x, 59 + y, 1, 2);
        g2d.fillRect(145 + x, 60 + y, 2, 1);


        g2d.setColor(new Color(184, 183, 184, 255));
        g2d.fillRect(136 + x, 42 + y, 2, 1);
        g2d.fillRect(139 + x, 43 + y, 3, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 2);
        g2d.fillRect(138 + x, 44 + y, 1, 1);
        g2d.fillRect(142 + x, 44 + y, 2, 1);
        g2d.fillRect(145 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 3, 1);
        g2d.fillRect(146 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 3, 1);
        g2d.fillRect(123 + x, 47 + y, 4, 1);
        g2d.fillRect(126 + x, 48 + y, 3, 1);
        g2d.fillRect(128 + x, 49 + y, 4, 1);
        g2d.fillRect(131 + x, 50 + y, 1, 1);
        g2d.fillRect(132 + x, 51 + y, 1, 1);
        g2d.fillRect(139 + x, 51 + y, 7, 1);
        g2d.fillRect(133 + x, 52 + y, 1, 3);
        g2d.fillRect(138 + x, 52 + y, 1, 1);
        g2d.fillRect(130 + x, 54 + y, 1, 14);
        g2d.fillRect(136 + x, 54 + y, 1, 11);
        g2d.fillRect(134 + x, 55 + y, 1, 10);
        g2d.fillRect(138 + x, 56 + y, 1, 6);
        g2d.fillRect(139 + x, 62 + y, 1, 2);
        g2d.fillRect(132 + x, 63 + y, 2, 1);
        g2d.fillRect(133 + x, 64 + y, 1, 1);
        g2d.fillRect(137 + x, 64 + y, 2, 1);
        g2d.fillRect(128 + x, 67 + y, 1, 2);
        g2d.fillRect(129 + x, 67 + y, 1, 1);
        g2d.fillRect(124 + x, 68 + y, 1, 2);
        g2d.fillRect(125 + x, 68 + y, 3, 1);
        g2d.fillRect(120 + x, 69 + y, 1, 2);
        g2d.fillRect(121 + x, 69 + y, 3, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 3, 1);


        g2d.setColor(new Color(193, 193, 193, 255));
        g2d.fillRect(131 + x, 69 + y, 1, 18);
        g2d.fillRect(128 + x, 91 + y, 1, 7);
        g2d.fillRect(131 + x, 91 + y, 1, 34);
        g2d.fillRect(133 + x, 91 + y, 1, 7);
        g2d.fillRect(127 + x, 98 + y, 1, 3);
        g2d.fillRect(134 + x, 98 + y, 1, 3);
        g2d.fillRect(126 + x, 101 + y, 1, 5);
        g2d.fillRect(135 + x, 101 + y, 1, 5);
        g2d.fillRect(125 + x, 106 + y, 1, 4);
        g2d.fillRect(136 + x, 106 + y, 1, 4);
        g2d.fillRect(124 + x, 110 + y, 1, 5);
        g2d.fillRect(137 + x, 110 + y, 1, 5);
        g2d.fillRect(123 + x, 115 + y, 1, 4);
        g2d.fillRect(138 + x, 115 + y, 1, 4);
        g2d.fillRect(122 + x, 119 + y, 1, 1);
        g2d.fillRect(139 + x, 119 + y, 1, 1);
        g2d.fillRect(122 + x, 122 + y, 1, 1);
        g2d.fillRect(139 + x, 122 + y, 1, 1);
        g2d.fillRect(121 + x, 123 + y, 1, 5);
        g2d.fillRect(140 + x, 123 + y, 1, 5);
        g2d.fillRect(120 + x, 128 + y, 1, 1);
        g2d.fillRect(131 + x, 128 + y, 1, 8);
        g2d.fillRect(141 + x, 128 + y, 1, 1);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(141 + x, 130 + y, 1, 1);
        g2d.fillRect(119 + x, 131 + y, 1, 5);
        g2d.fillRect(142 + x, 131 + y, 1, 5);
        g2d.fillRect(118 + x, 136 + y, 1, 3);
        g2d.fillRect(143 + x, 136 + y, 1, 3);
        g2d.fillRect(131 + x, 137 + y, 1, 35);
        g2d.fillRect(117 + x, 139 + y, 1, 5);
        g2d.fillRect(144 + x, 139 + y, 1, 5);
        g2d.fillRect(116 + x, 144 + y, 1, 4);
        g2d.fillRect(145 + x, 144 + y, 1, 4);
        g2d.fillRect(115 + x, 148 + y, 1, 5);
        g2d.fillRect(146 + x, 148 + y, 1, 5);
        g2d.fillRect(114 + x, 153 + y, 1, 3);
        g2d.fillRect(147 + x, 153 + y, 1, 3);
        g2d.fillRect(113 + x, 156 + y, 1, 5);
        g2d.fillRect(148 + x, 156 + y, 1, 5);
        g2d.fillRect(112 + x, 161 + y, 1, 3);
        g2d.fillRect(149 + x, 161 + y, 1, 3);
        g2d.fillRect(111 + x, 164 + y, 1, 3);
        g2d.fillRect(150 + x, 164 + y, 1, 3);


        g2d.setColor(new Color(204, 205, 204, 255));
        g2d.fillRect(144 + x, 54 + y, 4, 1);
        g2d.fillRect(143 + x, 55 + y, 1, 1);
        g2d.fillRect(147 + x, 55 + y, 1, 1);
        g2d.fillRect(145 + x, 57 + y, 1, 1);
        g2d.fillRect(143 + x, 59 + y, 1, 1);
        g2d.fillRect(144 + x, 60 + y, 1, 1);


        g2d.setColor(new Color(205, 204, 205, 255));
        g2d.fillRect(136 + x, 39 + y, 1, 3);
        g2d.fillRect(137 + x, 39 + y, 1, 1);
        g2d.fillRect(140 + x, 40 + y, 1, 3);
        g2d.fillRect(141 + x, 40 + y, 2, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 2);
        g2d.fillRect(119 + x, 41 + y, 5, 1);
        g2d.fillRect(137 + x, 41 + y, 1, 1);
        g2d.fillRect(139 + x, 41 + y, 1, 2);
        g2d.fillRect(124 + x, 42 + y, 3, 1);
        g2d.fillRect(141 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 3, 1);
        g2d.fillRect(127 + x, 43 + y, 3, 1);
        g2d.fillRect(142 + x, 43 + y, 2, 1);
        g2d.fillRect(146 + x, 43 + y, 1, 1);
        g2d.fillRect(122 + x, 44 + y, 2, 1);
        g2d.fillRect(130 + x, 44 + y, 3, 1);
        g2d.fillRect(136 + x, 44 + y, 2, 1);
        g2d.fillRect(147 + x, 44 + y, 1, 1);
        g2d.fillRect(124 + x, 45 + y, 2, 1);
        g2d.fillRect(133 + x, 45 + y, 2, 1);
        g2d.fillRect(148 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 9);
        g2d.fillRect(119 + x, 46 + y, 2, 1);
        g2d.fillRect(127 + x, 46 + y, 2, 1);
        g2d.fillRect(134 + x, 46 + y, 1, 4);
        g2d.fillRect(122 + x, 47 + y, 1, 1);
        g2d.fillRect(129 + x, 47 + y, 3, 1);
        g2d.fillRect(133 + x, 47 + y, 1, 2);
        g2d.fillRect(135 + x, 47 + y, 1, 3);
        g2d.fillRect(140 + x, 47 + y, 1, 3);
        g2d.fillRect(141 + x, 47 + y, 1, 3);
        g2d.fillRect(142 + x, 47 + y, 1, 3);
        g2d.fillRect(124 + x, 48 + y, 2, 1);
        g2d.fillRect(132 + x, 48 + y, 1, 1);
        g2d.fillRect(136 + x, 48 + y, 1, 2);
        g2d.fillRect(137 + x, 48 + y, 1, 2);
        g2d.fillRect(138 + x, 48 + y, 1, 2);
        g2d.fillRect(139 + x, 48 + y, 1, 2);
        g2d.fillRect(143 + x, 48 + y, 3, 1);
        g2d.fillRect(126 + x, 49 + y, 2, 1);
        g2d.fillRect(128 + x, 50 + y, 3, 1);
        g2d.fillRect(130 + x, 51 + y, 2, 1);
        g2d.fillRect(132 + x, 52 + y, 1, 11);
        g2d.fillRect(139 + x, 52 + y, 1, 2);
        g2d.fillRect(140 + x, 52 + y, 2, 1);
        g2d.fillRect(129 + x, 54 + y, 1, 5);
        g2d.fillRect(125 + x, 55 + y, 2, 1);
        g2d.fillRect(128 + x, 55 + y, 1, 4);
        g2d.fillRect(133 + x, 55 + y, 1, 8);
        g2d.fillRect(137 + x, 55 + y, 1, 7);
        g2d.fillRect(139 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 12);
        g2d.fillRect(125 + x, 58 + y, 1, 2);
        g2d.fillRect(126 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 2);


        g2d.setColor(new Color(230, 230, 230, 255));
        g2d.fillRect(138 + x, 39 + y, 1, 2);
        g2d.fillRect(139 + x, 39 + y, 1, 1);
        g2d.fillRect(137 + x, 40 + y, 1, 1);
        g2d.fillRect(141 + x, 41 + y, 5, 1);
        g2d.fillRect(119 + x, 42 + y, 5, 1);
        g2d.fillRect(142 + x, 42 + y, 3, 1);
        g2d.fillRect(147 + x, 42 + y, 1, 1);
        g2d.fillRect(122 + x, 43 + y, 5, 1);
        g2d.fillRect(148 + x, 43 + y, 1, 1);
        g2d.fillRect(124 + x, 44 + y, 2, 1);
        g2d.fillRect(128 + x, 44 + y, 1, 2);
        g2d.fillRect(129 + x, 44 + y, 1, 1);
        g2d.fillRect(149 + x, 44 + y, 1, 1);
        g2d.fillRect(127 + x, 45 + y, 1, 1);
        g2d.fillRect(131 + x, 45 + y, 1, 2);
        g2d.fillRect(132 + x, 45 + y, 1, 1);
        g2d.fillRect(130 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 5);
        g2d.fillRect(140 + x, 53 + y, 1, 1);
        g2d.fillRect(139 + x, 54 + y, 1, 1);
        g2d.fillRect(127 + x, 55 + y, 1, 4);
        g2d.fillRect(138 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 4, 1);
        g2d.fillRect(118 + x, 57 + y, 3, 1);
        g2d.fillRect(123 + x, 57 + y, 1, 3);
        g2d.fillRect(124 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 4);
        g2d.fillRect(119 + x, 58 + y, 1, 3);
        g2d.fillRect(120 + x, 58 + y, 1, 3);
        g2d.fillRect(121 + x, 59 + y, 1, 2);
        g2d.fillRect(122 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 60 + y, 1, 2);
        g2d.fillRect(124 + x, 61 + y, 1, 6);
        g2d.fillRect(125 + x, 61 + y, 1, 3);
        g2d.fillRect(126 + x, 61 + y, 1, 2);
        g2d.fillRect(128 + x, 61 + y, 1, 5);
        g2d.fillRect(121 + x, 62 + y, 1, 3);
        g2d.fillRect(122 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 6);
        g2d.fillRect(118 + x, 63 + y, 1, 2);
        g2d.fillRect(120 + x, 63 + y, 1, 5);
        g2d.fillRect(123 + x, 63 + y, 1, 5);
        g2d.fillRect(127 + x, 63 + y, 1, 4);
        g2d.fillRect(126 + x, 64 + y, 1, 3);
        g2d.fillRect(119 + x, 65 + y, 1, 4);
        g2d.fillRect(122 + x, 65 + y, 1, 3);
        g2d.fillRect(130 + x, 69 + y, 1, 18);
        g2d.fillRect(130 + x, 91 + y, 1, 34);
        g2d.fillRect(127 + x, 93 + y, 1, 5);
        g2d.fillRect(134 + x, 93 + y, 1, 5);
        g2d.fillRect(126 + x, 98 + y, 1, 3);
        g2d.fillRect(135 + x, 98 + y, 1, 3);
        g2d.fillRect(125 + x, 101 + y, 1, 5);
        g2d.fillRect(136 + x, 101 + y, 1, 5);
        g2d.fillRect(124 + x, 106 + y, 1, 4);
        g2d.fillRect(137 + x, 106 + y, 1, 4);
        g2d.fillRect(123 + x, 110 + y, 1, 5);
        g2d.fillRect(138 + x, 110 + y, 1, 5);
        g2d.fillRect(122 + x, 115 + y, 1, 4);
        g2d.fillRect(139 + x, 115 + y, 1, 4);
        g2d.fillRect(121 + x, 119 + y, 1, 1);
        g2d.fillRect(140 + x, 119 + y, 1, 1);
        g2d.fillRect(121 + x, 122 + y, 1, 1);
        g2d.fillRect(140 + x, 122 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 5);
        g2d.fillRect(141 + x, 123 + y, 1, 5);
        g2d.fillRect(119 + x, 128 + y, 1, 1);
        g2d.fillRect(130 + x, 128 + y, 1, 8);
        g2d.fillRect(142 + x, 128 + y, 1, 1);
        g2d.fillRect(119 + x, 130 + y, 1, 1);
        g2d.fillRect(142 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 131 + y, 1, 5);
        g2d.fillRect(143 + x, 131 + y, 1, 5);
        g2d.fillRect(117 + x, 136 + y, 1, 3);
        g2d.fillRect(144 + x, 136 + y, 1, 3);
        g2d.fillRect(130 + x, 137 + y, 1, 35);
        g2d.fillRect(116 + x, 139 + y, 1, 5);
        g2d.fillRect(145 + x, 139 + y, 1, 5);
        g2d.fillRect(115 + x, 144 + y, 1, 4);
        g2d.fillRect(146 + x, 144 + y, 1, 4);
        g2d.fillRect(114 + x, 148 + y, 1, 5);
        g2d.fillRect(147 + x, 148 + y, 1, 5);
        g2d.fillRect(113 + x, 153 + y, 1, 3);
        g2d.fillRect(148 + x, 153 + y, 1, 3);
        g2d.fillRect(112 + x, 156 + y, 1, 5);
        g2d.fillRect(149 + x, 156 + y, 1, 5);
        g2d.fillRect(111 + x, 161 + y, 1, 3);
        g2d.fillRect(150 + x, 161 + y, 1, 3);
        g2d.fillRect(151 + x, 164 + y, 1, 3);


        g2d.setColor(new Color(255, 255, 255, 255));
        g2d.fillRect(118 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 3, 1);
        g2d.fillRect(122 + x, 45 + y, 2, 1);
        g2d.fillRect(124 + x, 46 + y, 3, 1);
        g2d.fillRect(127 + x, 47 + y, 2, 1);
        g2d.fillRect(129 + x, 48 + y, 3, 1);
        g2d.fillRect(132 + x, 49 + y, 2, 1);
        g2d.fillRect(143 + x, 49 + y, 3, 1);
        g2d.fillRect(134 + x, 50 + y, 9, 1);
        g2d.fillRect(135 + x, 51 + y, 1, 15);
        g2d.fillRect(127 + x, 60 + y, 1, 3);
        g2d.fillRect(128 + x, 60 + y, 1, 1);
        g2d.fillRect(123 + x, 61 + y, 1, 2);
        g2d.fillRect(119 + x, 62 + y, 1, 3);
        g2d.fillRect(120 + x, 62 + y, 1, 1);
        g2d.fillRect(122 + x, 63 + y, 1, 2);
        g2d.fillRect(126 + x, 63 + y, 1, 1);
        g2d.fillRect(125 + x, 64 + y, 1, 3);
        g2d.fillRect(118 + x, 65 + y, 1, 4);
        g2d.fillRect(121 + x, 65 + y, 1, 3);
    }
}
