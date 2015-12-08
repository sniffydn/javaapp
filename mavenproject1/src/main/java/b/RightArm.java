/*
 * RightArm.java
 *
 */
package b;

import util.GraphicsMap;

/**
 *
 * @author doubleD
 */
public class RightArm {

    int step = 0;
    Bd b = null;
    public static int[] choices = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    /** Creates a new instance of RightLeg */
    public RightArm(Bd b) {
        this.b = b;
    }

    public void paintBack(int x, int y, GraphicsMap g2d) {
        if (step == 0) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(117 + x, 41 + y, 1, 1);
            g2d.fillRect(118 + x, 42 + y, 1, 1);
            g2d.fillRect(119 + x, 43 + y, 1, 3);
            g2d.fillRect(120 + x, 46 + y, 1, 9);
            g2d.fillRect(121 + x, 55 + y, 1, 7);
            g2d.fillRect(122 + x, 61 + y, 1, 6);
            g2d.fillRect(123 + x, 67 + y, 1, 7);
            g2d.fillRect(124 + x, 74 + y, 1, 9);
            g2d.fillRect(123 + x, 83 + y, 1, 1);
            g2d.fillRect(122 + x, 84 + y, 1, 1);
            g2d.fillRect(118 + x, 62 + y, 1, 4);
            g2d.fillRect(119 + x, 66 + y, 1, 5);
            g2d.fillRect(120 + x, 71 + y, 1, 3);
            g2d.fillRect(121 + x, 74 + y, 1, 7);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(117 + x, 42 + y, 1, 2);
            g2d.fillRect(118 + x, 43 + y, 1, 3);
            g2d.fillRect(119 + x, 46 + y, 1, 9);
            g2d.fillRect(120 + x, 55 + y, 1, 3);
            g2d.fillRect(118 + x, 58 + y, 3, 4);
            g2d.fillRect(119 + x, 62 + y, 3, 3);
            g2d.fillRect(121 + x, 65 + y, 1, 1);
            g2d.fillRect(119 + x, 65 + y, 1, 1);
            g2d.fillRect(120 + x, 66 + y, 1, 5);
            g2d.fillRect(122 + x, 67 + y, 1, 7);
            g2d.fillRect(123 + x, 74 + y, 1, 9);
            g2d.fillRect(122 + x, 78 + y, 1, 6);
            g2d.fillRect(121 + x, 81 + y, 1, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(117 + x, 44 + y, 1, 12);
            g2d.fillRect(118 + x, 46 + y, 1, 12);
            g2d.fillRect(119 + x, 55 + y, 1, 3);
            g2d.fillRect(120 + x, 65 + y, 1, 1);
            g2d.fillRect(121 + x, 66 + y, 1, 8);
            g2d.fillRect(122 + x, 74 + y, 1, 4);
        } else if (step == 2) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(117 + x, 42 + y, 1, 1);
            g2d.fillRect(118 + x, 43 + y, 1, 1);
            g2d.fillRect(119 + x, 44 + y, 1, 2);
            g2d.fillRect(120 + x, 46 + y, 1, 1);
            g2d.fillRect(121 + x, 47 + y, 1, 2);
            g2d.fillRect(122 + x, 49 + y, 1, 2);
            g2d.fillRect(123 + x, 51 + y, 1, 2);
            g2d.fillRect(124 + x, 53 + y, 1, 2);
            g2d.fillRect(118 + x, 55 + y, 1, 1);
            g2d.fillRect(125 + x, 55 + y, 1, 2);
            g2d.fillRect(119 + x, 56 + y, 1, 1);
            g2d.fillRect(120 + x, 57 + y, 1, 1);
            g2d.fillRect(126 + x, 57 + y, 1, 2);
            g2d.fillRect(121 + x, 58 + y, 1, 1);
            g2d.fillRect(122 + x, 59 + y, 1, 2);
            g2d.fillRect(127 + x, 59 + y, 1, 2);
            g2d.fillRect(123 + x, 61 + y, 1, 2);
            g2d.fillRect(128 + x, 61 + y, 1, 3);
            g2d.fillRect(122 + x, 63 + y, 1, 1);
            g2d.fillRect(121 + x, 64 + y, 1, 1);
            g2d.fillRect(127 + x, 64 + y, 1, 1);
            g2d.fillRect(120 + x, 65 + y, 1, 1);
            g2d.fillRect(126 + x, 65 + y, 1, 1);
            g2d.fillRect(119 + x, 66 + y, 1, 1);
            g2d.fillRect(125 + x, 66 + y, 1, 1);
            g2d.fillRect(118 + x, 67 + y, 1, 1);
            g2d.fillRect(124 + x, 67 + y, 1, 1);
            g2d.fillRect(123 + x, 68 + y, 1, 1);
            g2d.fillRect(122 + x, 69 + y, 1, 1);
            g2d.fillRect(121 + x, 70 + y, 1, 1);
            g2d.fillRect(120 + x, 71 + y, 1, 3);


            g2d.setColor(b.highlightColor);
            g2d.fillRect(118 + x, 44 + y, 1, 1);
            g2d.fillRect(119 + x, 46 + y, 1, 1);
            g2d.fillRect(120 + x, 47 + y, 1, 2);
            g2d.fillRect(121 + x, 49 + y, 1, 1);
            g2d.fillRect(122 + x, 51 + y, 1, 2);
            g2d.fillRect(118 + x, 53 + y, 1, 2);
            g2d.fillRect(119 + x, 54 + y, 1, 2);
            g2d.fillRect(123 + x, 54 + y, 1, 1);
            g2d.fillRect(120 + x, 55 + y, 1, 2);
            g2d.fillRect(124 + x, 55 + y, 1, 1);
            g2d.fillRect(121 + x, 56 + y, 1, 2);
            g2d.fillRect(122 + x, 57 + y, 1, 2);
            g2d.fillRect(125 + x, 57 + y, 1, 1);
            g2d.fillRect(123 + x, 58 + y, 1, 3);
            g2d.fillRect(126 + x, 59 + y, 1, 1);
            g2d.fillRect(124 + x, 60 + y, 1, 3);
            g2d.fillRect(127 + x, 61 + y, 1, 3);
            g2d.fillRect(123 + x, 63 + y, 1, 1);
            g2d.fillRect(122 + x, 64 + y, 1, 1);
            g2d.fillRect(121 + x, 65 + y, 1, 1);
            g2d.fillRect(125 + x, 65 + y, 1, 1);
            g2d.fillRect(120 + x, 66 + y, 1, 1);
            g2d.fillRect(124 + x, 66 + y, 1, 1);
            g2d.fillRect(119 + x, 67 + y, 1, 1);
            g2d.fillRect(123 + x, 67 + y, 1, 1);
            g2d.fillRect(118 + x, 68 + y, 1, 2);
            g2d.fillRect(122 + x, 68 + y, 1, 1);
            g2d.fillRect(121 + x, 69 + y, 1, 1);
            g2d.fillRect(120 + x, 70 + y, 1, 1);
            g2d.fillRect(119 + x, 71 + y, 1, 2);

            g2d.setColor(b.fillColor);
            g2d.fillRect(117 + x, 43 + y, 1, 13);
            g2d.fillRect(118 + x, 45 + y, 1, 8);
            g2d.fillRect(119 + x, 47 + y, 1, 7);
            g2d.fillRect(120 + x, 49 + y, 1, 6);
            g2d.fillRect(121 + x, 50 + y, 1, 6);
            g2d.fillRect(122 + x, 53 + y, 1, 4);
            g2d.fillRect(123 + x, 53 + y, 1, 1);
            g2d.fillRect(123 + x, 55 + y, 1, 3);
            g2d.fillRect(124 + x, 56 + y, 1, 4);
            g2d.fillRect(125 + x, 58 + y, 1, 7);
            g2d.fillRect(126 + x, 60 + y, 1, 5);
            g2d.fillRect(124 + x, 63 + y, 1, 3);
            g2d.fillRect(123 + x, 64 + y, 1, 3);
            g2d.fillRect(122 + x, 65 + y, 1, 3);
            g2d.fillRect(121 + x, 66 + y, 1, 3);
            g2d.fillRect(120 + x, 67 + y, 1, 3);
            g2d.fillRect(119 + x, 68 + y, 1, 3);
        } else if (step == 3) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(117 + x, 41 + y, 1, 1);
            g2d.fillRect(118 + x, 42 + y, 1, 1);
            g2d.fillRect(119 + x, 43 + y, 1, 3);
            g2d.fillRect(120 + x, 46 + y, 1, 4);
            g2d.fillRect(121 + x, 50 + y, 1, 10);
            g2d.fillRect(133 + x, 50 + y, 1, 2);
            g2d.fillRect(134 + x, 50 + y, 1, 2);
            g2d.fillRect(135 + x, 50 + y, 1, 2);
            g2d.fillRect(136 + x, 50 + y, 1, 2);
            g2d.fillRect(137 + x, 50 + y, 1, 2);
            g2d.fillRect(138 + x, 50 + y, 1, 2);
            g2d.fillRect(127 + x, 51 + y, 6, 1);
            g2d.fillRect(139 + x, 51 + y, 3, 1);
            g2d.fillRect(126 + x, 52 + y, 1, 2);
            g2d.fillRect(131 + x, 52 + y, 1, 1);
            g2d.fillRect(142 + x, 52 + y, 1, 1);
            g2d.fillRect(137 + x, 53 + y, 5, 1);
            g2d.fillRect(125 + x, 54 + y, 1, 2);
            g2d.fillRect(133 + x, 54 + y, 4, 1);
            g2d.fillRect(117 + x, 55 + y, 1, 9);
            g2d.fillRect(129 + x, 55 + y, 1, 1);
            g2d.fillRect(124 + x, 56 + y, 1, 2);
            g2d.fillRect(128 + x, 56 + y, 1, 2);
            g2d.fillRect(123 + x, 58 + y, 1, 1);
            g2d.fillRect(127 + x, 58 + y, 1, 2);
            g2d.fillRect(122 + x, 59 + y, 1, 1);
            g2d.fillRect(126 + x, 60 + y, 1, 1);
            g2d.fillRect(125 + x, 61 + y, 1, 1);
            g2d.fillRect(124 + x, 62 + y, 1, 1);
            g2d.fillRect(123 + x, 63 + y, 1, 1);
            g2d.fillRect(118 + x, 64 + y, 1, 1);
            g2d.fillRect(122 + x, 64 + y, 1, 1);
            g2d.fillRect(119 + x, 65 + y, 1, 1);
            g2d.fillRect(121 + x, 65 + y, 1, 1);
            g2d.fillRect(120 + x, 66 + y, 1, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(117 + x, 42 + y, 1, 2);
            g2d.fillRect(118 + x, 43 + y, 1, 6);
            g2d.fillRect(119 + x, 46 + y, 1, 14);
            g2d.fillRect(120 + x, 50 + y, 1, 11);
            g2d.fillRect(127 + x, 52 + y, 1, 2);
            g2d.fillRect(128 + x, 52 + y, 3, 1);
            g2d.fillRect(137 + x, 52 + y, 5, 1);
            g2d.fillRect(133 + x, 53 + y, 4, 1);
            g2d.fillRect(126 + x, 54 + y, 1, 2);
            g2d.fillRect(129 + x, 54 + y, 4, 1);
            g2d.fillRect(118 + x, 55 + y, 1, 9);
            g2d.fillRect(128 + x, 55 + y, 1, 1);
            g2d.fillRect(125 + x, 56 + y, 1, 2);
            g2d.fillRect(127 + x, 56 + y, 1, 2);
            g2d.fillRect(124 + x, 58 + y, 1, 1);
            g2d.fillRect(123 + x, 59 + y, 1, 1);
            g2d.fillRect(126 + x, 59 + y, 1, 1);
            g2d.fillRect(121 + x, 60 + y, 2, 1);
            g2d.fillRect(125 + x, 60 + y, 1, 1);
            g2d.fillRect(124 + x, 61 + y, 1, 1);
            g2d.fillRect(119 + x, 64 + y, 1, 1);
            g2d.fillRect(121 + x, 64 + y, 1, 1);
            g2d.fillRect(120 + x, 65 + y, 1, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(117 + x, 44 + y, 1, 11);
            g2d.fillRect(118 + x, 49 + y, 1, 6);
            g2d.fillRect(132 + x, 52 + y, 1, 2);
            g2d.fillRect(133 + x, 52 + y, 4, 1);
            g2d.fillRect(128 + x, 53 + y, 1, 2);
            g2d.fillRect(129 + x, 53 + y, 3, 1);
            g2d.fillRect(127 + x, 54 + y, 1, 2);
            g2d.fillRect(126 + x, 56 + y, 1, 3);
            g2d.fillRect(125 + x, 58 + y, 1, 2);
            g2d.fillRect(124 + x, 59 + y, 1, 2);
            g2d.fillRect(119 + x, 60 + y, 1, 4);
            g2d.fillRect(123 + x, 60 + y, 1, 3);
            g2d.fillRect(120 + x, 61 + y, 1, 4);
            g2d.fillRect(121 + x, 61 + y, 1, 3);
            g2d.fillRect(122 + x, 61 + y, 1, 3);
        } else if (step == 4) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(117 + x, 41 + y, 2, 1);
            g2d.fillRect(119 + x, 42 + y, 2, 1);
            g2d.fillRect(121 + x, 43 + y, 1, 2);
            g2d.fillRect(122 + x, 45 + y, 1, 2);
            g2d.fillRect(123 + x, 47 + y, 1, 2);
            g2d.fillRect(117 + x, 49 + y, 1, 7);
            g2d.fillRect(124 + x, 49 + y, 1, 2);
            g2d.fillRect(118 + x, 50 + y, 1, 1);
            g2d.fillRect(119 + x, 51 + y, 1, 1);
            g2d.fillRect(125 + x, 51 + y, 1, 3);
            g2d.fillRect(120 + x, 52 + y, 1, 4);
            g2d.fillRect(126 + x, 54 + y, 1, 2);
            g2d.fillRect(121 + x, 56 + y, 1, 3);
            g2d.fillRect(127 + x, 56 + y, 1, 3);
            g2d.fillRect(122 + x, 59 + y, 1, 2);
            g2d.fillRect(128 + x, 59 + y, 1, 4);
            g2d.fillRect(123 + x, 61 + y, 1, 2);
            g2d.fillRect(124 + x, 63 + y, 1, 5);
            g2d.fillRect(129 + x, 63 + y, 1, 5);
            g2d.fillRect(123 + x, 68 + y, 1, 2);
            g2d.fillRect(128 + x, 68 + y, 1, 2);
            g2d.fillRect(122 + x, 70 + y, 1, 3);
            g2d.fillRect(127 + x, 70 + y, 1, 2);
            g2d.fillRect(126 + x, 72 + y, 1, 3);
            g2d.fillRect(121 + x, 73 + y, 1, 2);
            g2d.fillRect(120 + x, 75 + y, 1, 1);
            g2d.fillRect(125 + x, 75 + y, 1, 1);
            g2d.fillRect(115 + x, 76 + y, 5, 1);
            g2d.fillRect(124 + x, 76 + y, 1, 2);
            g2d.fillRect(114 + x, 77 + y, 1, 2);
            g2d.fillRect(123 + x, 78 + y, 1, 1);
            g2d.fillRect(115 + x, 79 + y, 1, 2);
            g2d.fillRect(122 + x, 79 + y, 1, 1);
            g2d.fillRect(116 + x, 80 + y, 6, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(117 + x, 42 + y, 2, 1);
            g2d.fillRect(119 + x, 43 + y, 2, 1);
            g2d.fillRect(120 + x, 44 + y, 1, 1);
            g2d.fillRect(121 + x, 45 + y, 1, 2);
            g2d.fillRect(122 + x, 47 + y, 1, 2);
            g2d.fillRect(118 + x, 49 + y, 1, 1);
            g2d.fillRect(123 + x, 49 + y, 1, 2);
            g2d.fillRect(119 + x, 50 + y, 1, 1);
            g2d.fillRect(120 + x, 51 + y, 1, 1);
            g2d.fillRect(124 + x, 51 + y, 1, 3);
            g2d.fillRect(121 + x, 52 + y, 1, 4);
            g2d.fillRect(125 + x, 54 + y, 1, 2);
            g2d.fillRect(122 + x, 56 + y, 1, 3);
            g2d.fillRect(126 + x, 56 + y, 1, 3);
            g2d.fillRect(123 + x, 59 + y, 1, 2);
            g2d.fillRect(127 + x, 59 + y, 1, 4);
            g2d.fillRect(124 + x, 60 + y, 1, 3);
            g2d.fillRect(125 + x, 63 + y, 1, 5);
            g2d.fillRect(128 + x, 63 + y, 1, 5);
            g2d.fillRect(124 + x, 68 + y, 1, 2);
            g2d.fillRect(127 + x, 68 + y, 1, 2);
            g2d.fillRect(123 + x, 70 + y, 1, 3);
            g2d.fillRect(126 + x, 70 + y, 1, 2);
            g2d.fillRect(125 + x, 72 + y, 1, 3);
            g2d.fillRect(122 + x, 73 + y, 1, 2);
            g2d.fillRect(121 + x, 75 + y, 1, 1);
            g2d.fillRect(124 + x, 75 + y, 1, 1);
            g2d.fillRect(120 + x, 76 + y, 1, 2);
            g2d.fillRect(123 + x, 76 + y, 1, 2);
            g2d.fillRect(115 + x, 77 + y, 1, 2);
            g2d.fillRect(117 + x, 77 + y, 3, 1);
            g2d.fillRect(116 + x, 78 + y, 1, 2);
            g2d.fillRect(122 + x, 78 + y, 1, 1);
            g2d.fillRect(117 + x, 79 + y, 5, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(117 + x, 43 + y, 1, 6);
            g2d.fillRect(118 + x, 43 + y, 1, 6);
            g2d.fillRect(119 + x, 44 + y, 1, 6);
            g2d.fillRect(120 + x, 45 + y, 1, 6);
            g2d.fillRect(121 + x, 47 + y, 1, 5);
            g2d.fillRect(122 + x, 49 + y, 1, 7);
            g2d.fillRect(123 + x, 51 + y, 1, 8);
            g2d.fillRect(124 + x, 54 + y, 1, 6);
            g2d.fillRect(125 + x, 56 + y, 1, 7);
            g2d.fillRect(126 + x, 59 + y, 1, 11);
            g2d.fillRect(127 + x, 63 + y, 1, 5);
            g2d.fillRect(125 + x, 68 + y, 1, 4);
            g2d.fillRect(124 + x, 70 + y, 1, 5);
            g2d.fillRect(123 + x, 73 + y, 1, 3);
            g2d.fillRect(122 + x, 75 + y, 1, 3);
            g2d.fillRect(121 + x, 76 + y, 1, 3);
            g2d.fillRect(116 + x, 77 + y, 1, 1);
            g2d.fillRect(117 + x, 78 + y, 4, 1);
        } else if (step == 6) {
            paintRightA1(x, y, g2d);
        } else if (step == 7) {
            paintRightB1B(x, y, g2d);
        } else if (step == 8) {
            paintR(x, y, g2d);
        } else if (step == 9) {
            paintR1(x, y, g2d);
        } else if (step == 10) {
            paintR3(x, y, g2d);
        } else if (step == 11) {
            paint11B(x, y, g2d);
        }
    }

    public void paintFront(int x, int y, GraphicsMap g2d) {
        if (step == 1) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(114 + x, 35 + y, 2, 1);
            g2d.fillRect(115 + x, 36 + y, 2, 1);
            g2d.fillRect(113 + x, 37 + y, 1, 1);
            g2d.fillRect(116 + x, 37 + y, 1, 1);
            g2d.fillRect(114 + x, 38 + y, 1, 1);
            g2d.fillRect(117 + x, 38 + y, 1, 1);
            g2d.fillRect(115 + x, 39 + y, 1, 1);
            g2d.fillRect(118 + x, 39 + y, 1, 1);
            g2d.fillRect(119 + x, 40 + y, 1, 3);
            g2d.fillRect(113 + x, 41 + y, 1, 5);
            g2d.fillRect(120 + x, 43 + y, 1, 5);
            g2d.fillRect(114 + x, 46 + y, 1, 1);
            g2d.fillRect(116 + x, 46 + y, 1, 2);
            g2d.fillRect(115 + x, 47 + y, 1, 1);
            g2d.fillRect(117 + x, 48 + y, 1, 1);
            g2d.fillRect(121 + x, 48 + y, 1, 5);
            g2d.fillRect(118 + x, 49 + y, 1, 14);
            g2d.fillRect(122 + x, 52 + y, 1, 3);
            g2d.fillRect(123 + x, 55 + y, 1, 2);
            g2d.fillRect(124 + x, 57 + y, 1, 1);
            g2d.fillRect(125 + x, 58 + y, 1, 5);
            g2d.fillRect(119 + x, 62 + y, 1, 1);
            g2d.fillRect(120 + x, 63 + y, 1, 1);
            g2d.fillRect(124 + x, 63 + y, 1, 2);
            g2d.fillRect(121 + x, 64 + y, 1, 1);
            g2d.fillRect(123 + x, 64 + y, 1, 2);
            g2d.fillRect(122 + x, 65 + y, 1, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(113 + x, 35 + y, 1, 1);
            g2d.fillRect(114 + x, 36 + y, 1, 1);
            g2d.fillRect(115 + x, 37 + y, 1, 1);
            g2d.fillRect(116 + x, 38 + y, 1, 1);
            g2d.fillRect(117 + x, 39 + y, 1, 1);
            g2d.fillRect(114 + x, 40 + y, 1, 6);
            g2d.fillRect(115 + x, 40 + y, 1, 1);
            g2d.fillRect(118 + x, 40 + y, 1, 3);
            g2d.fillRect(119 + x, 43 + y, 1, 5);
            g2d.fillRect(116 + x, 45 + y, 1, 1);
            g2d.fillRect(115 + x, 46 + y, 1, 1);
            g2d.fillRect(117 + x, 46 + y, 1, 2);
            g2d.fillRect(118 + x, 48 + y, 1, 1);
            g2d.fillRect(120 + x, 48 + y, 1, 1);
            g2d.fillRect(119 + x, 49 + y, 1, 13);
            g2d.fillRect(121 + x, 53 + y, 1, 2);
            g2d.fillRect(122 + x, 55 + y, 1, 2);
            g2d.fillRect(123 + x, 57 + y, 1, 1);
            g2d.fillRect(124 + x, 58 + y, 1, 5);
            g2d.fillRect(120 + x, 62 + y, 1, 1);
            g2d.fillRect(121 + x, 63 + y, 1, 1);
            g2d.fillRect(123 + x, 63 + y, 1, 1);
            g2d.fillRect(122 + x, 64 + y, 1, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(113 + x, 36 + y, 1, 1);
            g2d.fillRect(114 + x, 37 + y, 1, 1);
            g2d.fillRect(115 + x, 38 + y, 1, 1);
            g2d.fillRect(116 + x, 39 + y, 1, 6);
            g2d.fillRect(117 + x, 40 + y, 1, 6);
            g2d.fillRect(115 + x, 41 + y, 1, 5);
            g2d.fillRect(118 + x, 43 + y, 1, 5);
            g2d.fillRect(119 + x, 48 + y, 1, 1);
            g2d.fillRect(120 + x, 49 + y, 1, 13);
            g2d.fillRect(121 + x, 55 + y, 1, 8);
            g2d.fillRect(122 + x, 57 + y, 1, 7);
            g2d.fillRect(123 + x, 58 + y, 1, 5);
        } else if (step == 4) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(123 + x, 68 + y, 1, 2);
            g2d.fillRect(128 + x, 68 + y, 1, 2);
            g2d.fillRect(122 + x, 70 + y, 1, 3);
            g2d.fillRect(127 + x, 70 + y, 1, 2);
            g2d.fillRect(126 + x, 72 + y, 1, 3);
            g2d.fillRect(121 + x, 73 + y, 1, 2);
            g2d.fillRect(120 + x, 75 + y, 1, 1);
            g2d.fillRect(125 + x, 75 + y, 1, 1);
            g2d.fillRect(115 + x, 76 + y, 5, 1);
            g2d.fillRect(124 + x, 76 + y, 1, 2);
            g2d.fillRect(114 + x, 77 + y, 1, 2);
            g2d.fillRect(123 + x, 78 + y, 1, 1);
            g2d.fillRect(115 + x, 79 + y, 1, 2);
            g2d.fillRect(122 + x, 79 + y, 1, 1);
            g2d.fillRect(116 + x, 80 + y, 6, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(124 + x, 68 + y, 1, 2);
            g2d.fillRect(127 + x, 68 + y, 1, 2);
            g2d.fillRect(123 + x, 70 + y, 1, 3);
            g2d.fillRect(126 + x, 70 + y, 1, 2);
            g2d.fillRect(125 + x, 72 + y, 1, 3);
            g2d.fillRect(122 + x, 73 + y, 1, 2);
            g2d.fillRect(121 + x, 75 + y, 1, 1);
            g2d.fillRect(124 + x, 75 + y, 1, 1);
            g2d.fillRect(120 + x, 76 + y, 1, 2);
            g2d.fillRect(123 + x, 76 + y, 1, 2);
            g2d.fillRect(115 + x, 77 + y, 1, 2);
            g2d.fillRect(117 + x, 77 + y, 3, 1);
            g2d.fillRect(116 + x, 78 + y, 1, 2);
            g2d.fillRect(122 + x, 78 + y, 1, 1);
            g2d.fillRect(117 + x, 79 + y, 5, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(125 + x, 68 + y, 1, 4);
            g2d.fillRect(124 + x, 70 + y, 1, 5);
            g2d.fillRect(123 + x, 73 + y, 1, 3);
            g2d.fillRect(122 + x, 75 + y, 1, 3);
            g2d.fillRect(121 + x, 76 + y, 1, 3);
            g2d.fillRect(116 + x, 77 + y, 1, 1);
            g2d.fillRect(117 + x, 78 + y, 4, 1);
        } else if (step == 7) {
            paintRightB1F(x, y, g2d);
        } else if (step == 10) {
            paintR3F(x, y, g2d);
        } else if (step == 11) {
            paint11F(x, y, g2d);
        }
    }

    void setStep(int step) {
        this.step = step;
    }

    public void paintRightA1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(126 + x, 9 + y, 5, 1);
        g2d.fillRect(125 + x, 10 + y, 1, 2);
        g2d.fillRect(130 + x, 10 + y, 1, 3);
        g2d.fillRect(124 + x, 11 + y, 1, 1);
        g2d.fillRect(122 + x, 12 + y, 1, 2);
        g2d.fillRect(123 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 2, 1);
        g2d.fillRect(131 + x, 13 + y, 1, 10);
        g2d.fillRect(118 + x, 14 + y, 2, 1);
        g2d.fillRect(116 + x, 15 + y, 2, 1);
        g2d.fillRect(126 + x, 15 + y, 1, 7);
        g2d.fillRect(114 + x, 16 + y, 2, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(124 + x, 18 + y, 1, 2);
        g2d.fillRect(125 + x, 18 + y, 1, 2);
        g2d.fillRect(123 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 3, 1);
        g2d.fillRect(118 + x, 21 + y, 2, 1);
        g2d.fillRect(115 + x, 22 + y, 3, 1);
        g2d.fillRect(125 + x, 22 + y, 1, 2);
        g2d.fillRect(130 + x, 23 + y, 1, 5);
        g2d.fillRect(124 + x, 24 + y, 1, 4);
        g2d.fillRect(123 + x, 28 + y, 1, 3);
        g2d.fillRect(129 + x, 28 + y, 1, 4);
        g2d.fillRect(122 + x, 31 + y, 1, 5);
        g2d.fillRect(128 + x, 32 + y, 1, 3);
        g2d.fillRect(127 + x, 35 + y, 1, 4);
        g2d.fillRect(121 + x, 36 + y, 1, 2);
        g2d.fillRect(120 + x, 38 + y, 1, 2);
        g2d.fillRect(126 + x, 39 + y, 1, 4);
        g2d.fillRect(119 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 41 + y, 2, 1);
        g2d.fillRect(125 + x, 43 + y, 1, 3);
        g2d.fillRect(124 + x, 46 + y, 1, 1);
        g2d.fillRect(123 + x, 47 + y, 1, 2);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 2);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(126 + x, 10 + y, 1, 3);
        g2d.fillRect(127 + x, 10 + y, 3, 1);
        g2d.fillRect(129 + x, 11 + y, 1, 2);
        g2d.fillRect(124 + x, 12 + y, 1, 2);
        g2d.fillRect(125 + x, 12 + y, 1, 1);
        g2d.fillRect(123 + x, 13 + y, 1, 3);
        g2d.fillRect(130 + x, 13 + y, 1, 10);
        g2d.fillRect(120 + x, 14 + y, 1, 2);
        g2d.fillRect(121 + x, 14 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 1, 2);
        g2d.fillRect(119 + x, 15 + y, 1, 1);
        g2d.fillRect(127 + x, 15 + y, 1, 7);
        g2d.fillRect(116 + x, 16 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 2, 1);
        g2d.fillRect(122 + x, 17 + y, 1, 3);
        g2d.fillRect(123 + x, 17 + y, 1, 2);
        g2d.fillRect(124 + x, 17 + y, 2, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 2);
        g2d.fillRect(120 + x, 19 + y, 2, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(115 + x, 21 + y, 1, 1);
        g2d.fillRect(126 + x, 22 + y, 1, 2);
        g2d.fillRect(129 + x, 23 + y, 1, 5);
        g2d.fillRect(125 + x, 24 + y, 1, 4);
        g2d.fillRect(124 + x, 28 + y, 1, 3);
        g2d.fillRect(128 + x, 28 + y, 1, 4);
        g2d.fillRect(123 + x, 31 + y, 1, 5);
        g2d.fillRect(127 + x, 32 + y, 1, 3);
        g2d.fillRect(126 + x, 35 + y, 1, 4);
        g2d.fillRect(122 + x, 36 + y, 1, 2);
        g2d.fillRect(121 + x, 38 + y, 1, 2);
        g2d.fillRect(125 + x, 39 + y, 1, 4);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 2, 1);
        g2d.fillRect(124 + x, 43 + y, 1, 3);
        g2d.fillRect(123 + x, 46 + y, 1, 1);
        g2d.fillRect(122 + x, 47 + y, 1, 2);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 2);


        g2d.setColor(b.fillColor);
        g2d.fillRect(127 + x, 11 + y, 1, 4);
        g2d.fillRect(128 + x, 11 + y, 1, 17);
        g2d.fillRect(125 + x, 13 + y, 1, 4);
        g2d.fillRect(126 + x, 13 + y, 1, 2);
        g2d.fillRect(129 + x, 13 + y, 1, 10);
        g2d.fillRect(122 + x, 14 + y, 1, 3);
        g2d.fillRect(124 + x, 14 + y, 1, 3);
        g2d.fillRect(119 + x, 16 + y, 1, 3);
        g2d.fillRect(120 + x, 16 + y, 1, 3);
        g2d.fillRect(121 + x, 16 + y, 1, 3);
        g2d.fillRect(123 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 3);
        g2d.fillRect(118 + x, 17 + y, 1, 3);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(115 + x, 18 + y, 1, 3);
        g2d.fillRect(116 + x, 18 + y, 1, 2);
        g2d.fillRect(127 + x, 22 + y, 1, 10);
        g2d.fillRect(126 + x, 24 + y, 1, 11);
        g2d.fillRect(125 + x, 28 + y, 1, 11);
        g2d.fillRect(124 + x, 31 + y, 1, 12);
        g2d.fillRect(123 + x, 36 + y, 1, 10);
        g2d.fillRect(122 + x, 38 + y, 1, 9);
        g2d.fillRect(121 + x, 40 + y, 1, 9);
        g2d.fillRect(120 + x, 41 + y, 1, 9);
        g2d.fillRect(119 + x, 42 + y, 1, 9);
        g2d.fillRect(117 + x, 43 + y, 1, 11);
        g2d.fillRect(118 + x, 43 + y, 1, 9);
    }

    public void paintRightB1B(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(120 + x, 46 + y, 1, 3);
        g2d.fillRect(121 + x, 51 + y, 1, 6);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(124 + x, 52 + y, 1, 8);
        g2d.fillRect(120 + x, 56 + y, 1, 3);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 5);
        g2d.fillRect(123 + x, 60 + y, 1, 5);
        g2d.fillRect(119 + x, 65 + y, 1, 2);
        g2d.fillRect(122 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 66 + y, 2, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(123 + x, 52 + y, 1, 8);
        g2d.fillRect(121 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 59 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 6);
        g2d.fillRect(119 + x, 60 + y, 1, 5);
        g2d.fillRect(120 + x, 65 + y, 2, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 43 + y, 1, 3);
        g2d.fillRect(119 + x, 46 + y, 1, 2);


        g2d.setColor(b.fillColor);
        g2d.fillRect(117 + x, 44 + y, 1, 5);
        g2d.fillRect(118 + x, 46 + y, 1, 3);
        g2d.fillRect(122 + x, 51 + y, 1, 8);
        g2d.fillRect(121 + x, 59 + y, 1, 6);
        g2d.fillRect(120 + x, 60 + y, 1, 5);
    }

    public void paintRightB1F(int x, int y, GraphicsMap g2d) {
        g2d.setColor(b.outlineColor);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 2, 1);
        g2d.fillRect(120 + x, 49 + y, 2, 1);
        g2d.fillRect(115 + x, 50 + y, 2, 1);
        g2d.fillRect(122 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(123 + x, 53 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(122 + x, 54 + y, 1, 3);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(121 + x, 50 + y, 1, 5);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(122 + x, 51 + y, 1, 3);
        g2d.fillRect(114 + x, 52 + y, 1, 2);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 2, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(117 + x, 50 + y, 1, 5);
        g2d.fillRect(118 + x, 50 + y, 1, 6);
        g2d.fillRect(119 + x, 50 + y, 1, 5);
        g2d.fillRect(116 + x, 51 + y, 1, 4);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
    }

    public void paintR(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(115 + x, 40 + y, 5, 1);
        g2d.fillRect(120 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 42 + y, 2, 1);
        g2d.fillRect(154 + x, 42 + y, 7, 1);
        g2d.fillRect(123 + x, 43 + y, 2, 1);
        g2d.fillRect(152 + x, 43 + y, 2, 1);
        g2d.fillRect(160 + x, 43 + y, 1, 1);
        g2d.fillRect(125 + x, 44 + y, 2, 1);
        g2d.fillRect(149 + x, 44 + y, 3, 1);
        g2d.fillRect(156 + x, 44 + y, 1, 2);
        g2d.fillRect(161 + x, 44 + y, 1, 1);
        g2d.fillRect(127 + x, 45 + y, 2, 1);
        g2d.fillRect(146 + x, 45 + y, 3, 1);
        g2d.fillRect(155 + x, 45 + y, 1, 3);
        g2d.fillRect(157 + x, 45 + y, 1, 2);
        g2d.fillRect(160 + x, 45 + y, 1, 2);
        g2d.fillRect(129 + x, 46 + y, 1, 1);
        g2d.fillRect(144 + x, 46 + y, 2, 1);
        g2d.fillRect(151 + x, 46 + y, 2, 1);
        g2d.fillRect(158 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 2);
        g2d.fillRect(130 + x, 47 + y, 2, 1);
        g2d.fillRect(141 + x, 47 + y, 3, 1);
        g2d.fillRect(149 + x, 47 + y, 2, 1);
        g2d.fillRect(153 + x, 47 + y, 1, 1);
        g2d.fillRect(159 + x, 47 + y, 1, 1);
        g2d.fillRect(121 + x, 48 + y, 2, 1);
        g2d.fillRect(132 + x, 48 + y, 1, 1);
        g2d.fillRect(139 + x, 48 + y, 2, 1);
        g2d.fillRect(147 + x, 48 + y, 2, 1);
        g2d.fillRect(154 + x, 48 + y, 1, 1);
        g2d.fillRect(123 + x, 49 + y, 2, 1);
        g2d.fillRect(133 + x, 49 + y, 2, 1);
        g2d.fillRect(137 + x, 49 + y, 2, 1);
        g2d.fillRect(145 + x, 49 + y, 2, 1);
        g2d.fillRect(125 + x, 50 + y, 2, 1);
        g2d.fillRect(135 + x, 50 + y, 2, 1);
        g2d.fillRect(144 + x, 50 + y, 1, 1);
        g2d.fillRect(127 + x, 51 + y, 2, 1);
        g2d.fillRect(142 + x, 51 + y, 2, 1);
        g2d.fillRect(129 + x, 52 + y, 1, 1);
        g2d.fillRect(140 + x, 52 + y, 2, 1);
        g2d.fillRect(130 + x, 53 + y, 2, 1);
        g2d.fillRect(139 + x, 53 + y, 1, 1);
        g2d.fillRect(132 + x, 54 + y, 1, 1);
        g2d.fillRect(137 + x, 54 + y, 2, 1);
        g2d.fillRect(133 + x, 55 + y, 4, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(117 + x, 41 + y, 1, 3);
        g2d.fillRect(118 + x, 41 + y, 1, 3);
        g2d.fillRect(119 + x, 41 + y, 1, 3);
        g2d.fillRect(120 + x, 42 + y, 1, 1);
        g2d.fillRect(122 + x, 43 + y, 1, 1);
        g2d.fillRect(158 + x, 43 + y, 1, 3);
        g2d.fillRect(124 + x, 44 + y, 1, 1);
        g2d.fillRect(155 + x, 44 + y, 1, 1);
        g2d.fillRect(157 + x, 44 + y, 1, 1);
        g2d.fillRect(159 + x, 44 + y, 2, 1);
        g2d.fillRect(126 + x, 45 + y, 1, 1);
        g2d.fillRect(154 + x, 45 + y, 1, 3);
        g2d.fillRect(118 + x, 46 + y, 1, 3);
        g2d.fillRect(119 + x, 46 + y, 2, 1);
        g2d.fillRect(128 + x, 46 + y, 1, 1);
        g2d.fillRect(146 + x, 46 + y, 1, 1);
        g2d.fillRect(150 + x, 46 + y, 1, 1);
        g2d.fillRect(153 + x, 46 + y, 1, 1);
        g2d.fillRect(159 + x, 46 + y, 1, 1);
        g2d.fillRect(121 + x, 47 + y, 2, 1);
        g2d.fillRect(144 + x, 47 + y, 2, 1);
        g2d.fillRect(148 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(123 + x, 48 + y, 2, 1);
        g2d.fillRect(131 + x, 48 + y, 1, 1);
        g2d.fillRect(141 + x, 48 + y, 1, 1);
        g2d.fillRect(146 + x, 48 + y, 1, 1);
        g2d.fillRect(125 + x, 49 + y, 2, 1);
        g2d.fillRect(132 + x, 49 + y, 1, 1);
        g2d.fillRect(144 + x, 49 + y, 1, 1);
        g2d.fillRect(127 + x, 50 + y, 2, 1);
        g2d.fillRect(133 + x, 50 + y, 2, 1);
        g2d.fillRect(143 + x, 50 + y, 1, 1);
        g2d.fillRect(129 + x, 51 + y, 1, 1);
        g2d.fillRect(141 + x, 51 + y, 1, 1);
        g2d.fillRect(130 + x, 52 + y, 1, 1);
        g2d.fillRect(139 + x, 52 + y, 1, 1);
        g2d.fillRect(137 + x, 53 + y, 2, 1);
        g2d.fillRect(133 + x, 54 + y, 4, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(120 + x, 43 + y, 1, 3);
        g2d.fillRect(121 + x, 43 + y, 1, 4);
        g2d.fillRect(154 + x, 43 + y, 1, 2);
        g2d.fillRect(155 + x, 43 + y, 3, 1);
        g2d.fillRect(159 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 4);
        g2d.fillRect(118 + x, 44 + y, 1, 2);
        g2d.fillRect(119 + x, 44 + y, 1, 2);
        g2d.fillRect(122 + x, 44 + y, 1, 3);
        g2d.fillRect(123 + x, 44 + y, 1, 4);
        g2d.fillRect(152 + x, 44 + y, 1, 2);
        g2d.fillRect(153 + x, 44 + y, 1, 2);
        g2d.fillRect(124 + x, 45 + y, 1, 3);
        g2d.fillRect(125 + x, 45 + y, 1, 4);
        g2d.fillRect(149 + x, 45 + y, 1, 2);
        g2d.fillRect(150 + x, 45 + y, 2, 1);
        g2d.fillRect(159 + x, 45 + y, 1, 1);
        g2d.fillRect(126 + x, 46 + y, 1, 3);
        g2d.fillRect(127 + x, 46 + y, 1, 4);
        g2d.fillRect(147 + x, 46 + y, 1, 2);
        g2d.fillRect(148 + x, 46 + y, 1, 1);
        g2d.fillRect(128 + x, 47 + y, 1, 3);
        g2d.fillRect(129 + x, 47 + y, 1, 4);
        g2d.fillRect(146 + x, 47 + y, 1, 1);
        g2d.fillRect(130 + x, 48 + y, 1, 4);
        g2d.fillRect(142 + x, 48 + y, 1, 3);
        g2d.fillRect(143 + x, 48 + y, 1, 2);
        g2d.fillRect(144 + x, 48 + y, 2, 1);
        g2d.fillRect(131 + x, 49 + y, 1, 4);
        g2d.fillRect(139 + x, 49 + y, 1, 3);
        g2d.fillRect(140 + x, 49 + y, 1, 3);
        g2d.fillRect(141 + x, 49 + y, 1, 2);
        g2d.fillRect(132 + x, 50 + y, 1, 4);
        g2d.fillRect(137 + x, 50 + y, 1, 3);
        g2d.fillRect(138 + x, 50 + y, 1, 3);
        g2d.fillRect(133 + x, 51 + y, 1, 3);
        g2d.fillRect(134 + x, 51 + y, 1, 3);
        g2d.fillRect(135 + x, 51 + y, 1, 3);
        g2d.fillRect(136 + x, 51 + y, 1, 3);
    }

    public void paintR1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(133 + x, 11 + y, 7, 1);
        g2d.fillRect(132 + x, 12 + y, 1, 1);
        g2d.fillRect(140 + x, 12 + y, 1, 1);
        g2d.fillRect(131 + x, 13 + y, 1, 3);
        g2d.fillRect(141 + x, 13 + y, 1, 1);
        g2d.fillRect(137 + x, 14 + y, 2, 1);
        g2d.fillRect(142 + x, 14 + y, 1, 1);
        g2d.fillRect(139 + x, 15 + y, 1, 1);
        g2d.fillRect(143 + x, 15 + y, 1, 1);
        g2d.fillRect(130 + x, 16 + y, 1, 2);
        g2d.fillRect(140 + x, 16 + y, 1, 1);
        g2d.fillRect(144 + x, 16 + y, 1, 3);
        g2d.fillRect(134 + x, 17 + y, 5, 1);
        g2d.fillRect(141 + x, 17 + y, 1, 1);
        g2d.fillRect(129 + x, 18 + y, 1, 3);
        g2d.fillRect(133 + x, 18 + y, 1, 1);
        g2d.fillRect(139 + x, 18 + y, 2, 1);
        g2d.fillRect(142 + x, 18 + y, 2, 1);
        g2d.fillRect(132 + x, 19 + y, 1, 5);
        g2d.fillRect(128 + x, 21 + y, 1, 2);
        g2d.fillRect(127 + x, 23 + y, 1, 3);
        g2d.fillRect(131 + x, 24 + y, 1, 8);
        g2d.fillRect(126 + x, 26 + y, 1, 2);
        g2d.fillRect(125 + x, 28 + y, 1, 3);
        g2d.fillRect(124 + x, 31 + y, 1, 2);
        g2d.fillRect(130 + x, 32 + y, 1, 2);
        g2d.fillRect(123 + x, 33 + y, 1, 3);
        g2d.fillRect(129 + x, 34 + y, 1, 2);
        g2d.fillRect(122 + x, 36 + y, 1, 2);
        g2d.fillRect(128 + x, 36 + y, 1, 2);
        g2d.fillRect(121 + x, 38 + y, 1, 1);
        g2d.fillRect(127 + x, 38 + y, 1, 2);
        g2d.fillRect(120 + x, 39 + y, 1, 1);
        g2d.fillRect(119 + x, 40 + y, 1, 2);
        g2d.fillRect(126 + x, 40 + y, 1, 2);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 2);
        g2d.fillRect(125 + x, 42 + y, 1, 2);
        g2d.fillRect(124 + x, 44 + y, 1, 1);
        g2d.fillRect(123 + x, 45 + y, 1, 2);
        g2d.fillRect(122 + x, 47 + y, 1, 2);
        g2d.fillRect(121 + x, 49 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(133 + x, 12 + y, 1, 2);
        g2d.fillRect(134 + x, 12 + y, 1, 1);
        g2d.fillRect(138 + x, 12 + y, 1, 2);
        g2d.fillRect(132 + x, 13 + y, 1, 6);
        g2d.fillRect(137 + x, 13 + y, 1, 1);
        g2d.fillRect(140 + x, 13 + y, 1, 1);
        g2d.fillRect(136 + x, 14 + y, 1, 1);
        g2d.fillRect(139 + x, 14 + y, 1, 1);
        g2d.fillRect(141 + x, 14 + y, 1, 1);
        g2d.fillRect(133 + x, 15 + y, 1, 3);
        g2d.fillRect(140 + x, 15 + y, 1, 1);
        g2d.fillRect(142 + x, 15 + y, 1, 1);
        g2d.fillRect(131 + x, 16 + y, 1, 3);
        g2d.fillRect(134 + x, 16 + y, 3, 1);
        g2d.fillRect(141 + x, 16 + y, 1, 1);
        g2d.fillRect(143 + x, 16 + y, 1, 1);
        g2d.fillRect(140 + x, 17 + y, 1, 1);
        g2d.fillRect(142 + x, 17 + y, 1, 1);
        g2d.fillRect(130 + x, 18 + y, 1, 14);
        g2d.fillRect(131 + x, 20 + y, 1, 1);
        g2d.fillRect(129 + x, 21 + y, 1, 5);
        g2d.fillRect(128 + x, 23 + y, 1, 4);
        g2d.fillRect(127 + x, 26 + y, 1, 3);
        g2d.fillRect(126 + x, 28 + y, 1, 4);
        g2d.fillRect(125 + x, 31 + y, 1, 3);
        g2d.fillRect(129 + x, 32 + y, 1, 2);
        g2d.fillRect(124 + x, 33 + y, 1, 6);
        g2d.fillRect(128 + x, 35 + y, 1, 1);
        g2d.fillRect(123 + x, 36 + y, 1, 4);
        g2d.fillRect(125 + x, 37 + y, 1, 3);
        g2d.fillRect(127 + x, 37 + y, 1, 1);
        g2d.fillRect(122 + x, 38 + y, 1, 2);
        g2d.fillRect(126 + x, 38 + y, 1, 2);
        g2d.fillRect(121 + x, 39 + y, 1, 2);
        g2d.fillRect(120 + x, 40 + y, 1, 3);
        g2d.fillRect(125 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(119 + x, 42 + y, 1, 2);
        g2d.fillRect(124 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 1);
        g2d.fillRect(123 + x, 44 + y, 1, 1);
        g2d.fillRect(122 + x, 45 + y, 1, 2);
        g2d.fillRect(121 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 3);


        g2d.setColor(b.fillColor);
        g2d.fillRect(135 + x, 12 + y, 1, 4);
        g2d.fillRect(136 + x, 12 + y, 1, 2);
        g2d.fillRect(137 + x, 12 + y, 1, 1);
        g2d.fillRect(139 + x, 12 + y, 1, 2);
        g2d.fillRect(134 + x, 13 + y, 1, 3);
        g2d.fillRect(133 + x, 14 + y, 1, 1);
        g2d.fillRect(140 + x, 14 + y, 1, 1);
        g2d.fillRect(136 + x, 15 + y, 3, 1);
        g2d.fillRect(141 + x, 15 + y, 1, 1);
        g2d.fillRect(137 + x, 16 + y, 3, 1);
        g2d.fillRect(142 + x, 16 + y, 1, 1);
        g2d.fillRect(139 + x, 17 + y, 1, 1);
        g2d.fillRect(143 + x, 17 + y, 1, 1);
        g2d.fillRect(131 + x, 19 + y, 1, 1);
        g2d.fillRect(131 + x, 21 + y, 1, 3);
        g2d.fillRect(129 + x, 26 + y, 1, 6);
        g2d.fillRect(128 + x, 27 + y, 1, 8);
        g2d.fillRect(127 + x, 29 + y, 1, 8);
        g2d.fillRect(126 + x, 32 + y, 1, 6);
        g2d.fillRect(125 + x, 34 + y, 1, 3);
        g2d.fillRect(124 + x, 39 + y, 1, 4);
        g2d.fillRect(122 + x, 40 + y, 1, 5);
        g2d.fillRect(123 + x, 40 + y, 1, 4);
        g2d.fillRect(125 + x, 40 + y, 1, 1);
        g2d.fillRect(121 + x, 41 + y, 1, 6);
        g2d.fillRect(120 + x, 43 + y, 1, 5);
        g2d.fillRect(117 + x, 44 + y, 1, 4);
        g2d.fillRect(119 + x, 44 + y, 1, 5);
        g2d.fillRect(118 + x, 45 + y, 1, 3);
    }

    public void paintR3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(120 + x, 46 + y, 1, 6);
        g2d.fillRect(121 + x, 52 + y, 1, 10);
        g2d.fillRect(117 + x, 62 + y, 1, 2);
        g2d.fillRect(122 + x, 62 + y, 1, 4);
        g2d.fillRect(118 + x, 64 + y, 1, 2);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 43 + y, 1, 8);
        g2d.fillRect(119 + x, 46 + y, 1, 8);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 10);
        g2d.fillRect(118 + x, 56 + y, 1, 8);
        g2d.fillRect(121 + x, 62 + y, 1, 4);
        g2d.fillRect(119 + x, 63 + y, 1, 3);


        g2d.setColor(b.fillColor);
        g2d.fillRect(117 + x, 44 + y, 1, 4);
        g2d.fillRect(117 + x, 50 + y, 1, 6);
        g2d.fillRect(118 + x, 51 + y, 1, 5);
        g2d.fillRect(119 + x, 54 + y, 1, 9);
        g2d.fillRect(120 + x, 62 + y, 1, 4);
    }

    public void paintR3F(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(119 + x, 66 + y, 1, 5);
        g2d.fillRect(122 + x, 66 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 7);
        g2d.fillRect(120 + x, 71 + y, 1, 3);
        g2d.fillRect(121 + x, 74 + y, 1, 5);
        g2d.fillRect(124 + x, 74 + y, 1, 9);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(123 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 3, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(120 + x, 66 + y, 1, 5);
        g2d.fillRect(122 + x, 67 + y, 1, 7);
        g2d.fillRect(123 + x, 74 + y, 1, 9);
        g2d.fillRect(121 + x, 79 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 3, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(121 + x, 66 + y, 1, 8);
        g2d.fillRect(122 + x, 74 + y, 1, 9);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
    }

    public void paint11B(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(120 + x, 46 + y, 1, 6);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 2, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 43 + y, 1, 2);
        g2d.fillRect(119 + x, 46 + y, 1, 5);
        g2d.fillRect(117 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(117 + x, 44 + y, 1, 4);
        g2d.fillRect(118 + x, 45 + y, 1, 3);
    }

    public void paint11F(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(120 + x, 72 + y, 2, 1);
        g2d.fillRect(122 + x, 73 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(124 + x, 75 + y, 1, 4);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(123 + x, 79 + y, 1, 1);
        g2d.fillRect(121 + x, 80 + y, 2, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(120 + x, 73 + y, 1, 5);
        g2d.fillRect(121 + x, 73 + y, 1, 1);
        g2d.fillRect(122 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 75 + y, 1, 4);
        g2d.fillRect(121 + x, 78 + y, 1, 2);
        g2d.fillRect(122 + x, 79 + y, 1, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(121 + x, 74 + y, 1, 4);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(122 + x, 78 + y, 1, 1);


        g2d.fillRect(122 + x, 76 + y, 1, 2);
    }
}
