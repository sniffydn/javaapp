/*
 * LeftArm.java
 */
package b;

import util.GraphicsMap;

/**
 *
 * @author doubleD
 */
public class LeftArm {

    int step = 0;
    Bd b = null;
    public static int[] choices = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    /** Creates a new instance of LeftLeg */
    public LeftArm(Bd b) {
        this.b = b;
    }

    public void paintBack(int x, int y, GraphicsMap g2d) {
        if (step == 0) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(97 + x, 41 + y, 2, 1);
            g2d.fillRect(95 + x, 42 + y, 2, 1);
            g2d.fillRect(94 + x, 43 + y, 1, 2);
            g2d.fillRect(93 + x, 45 + y, 1, 23);
            g2d.fillRect(92 + x, 68 + y, 1, 9);
            g2d.fillRect(91 + x, 77 + y, 1, 8);
            g2d.fillRect(92 + x, 84 + y, 4, 1);
            g2d.fillRect(95 + x, 83 + y, 2, 1);
            g2d.fillRect(97 + x, 82 + y, 1, 1);
            g2d.fillRect(95 + x, 81 + y, 2, 1);
            g2d.fillRect(94 + x, 80 + y, 1, 1);
            g2d.fillRect(95 + x, 78 + y, 1, 2);
            g2d.fillRect(96 + x, 68 + y, 1, 10);
            g2d.fillRect(97 + x, 61 + y, 1, 7);
            g2d.fillRect(98 + x, 49 + y, 1, 12);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(97 + x, 42 + y, 2, 1);
            g2d.fillRect(95 + x, 43 + y, 4, 1);
            g2d.fillRect(95 + x, 44 + y, 1, 3);
            g2d.fillRect(94 + x, 45 + y, 1, 23);
            g2d.fillRect(93 + x, 68 + y, 1, 9);
            g2d.fillRect(92 + x, 77 + y, 1, 7);
            g2d.fillRect(93 + x, 83 + y, 2, 1);
            g2d.fillRect(95 + x, 82 + y, 2, 1);
            g2d.fillRect(94 + x, 81 + y, 1, 1);
            g2d.fillRect(94 + x, 78 + y, 1, 2);
            g2d.fillRect(95 + x, 68 + y, 1, 10);
            g2d.fillRect(96 + x, 61 + y, 1, 7);
            g2d.fillRect(97 + x, 50 + y, 1, 11);

            g2d.setColor(b.fillColor);
            g2d.fillRect(94 + x, 82 + y, 1, 1);
            g2d.fillRect(93 + x, 77 + y, 1, 6);
            g2d.fillRect(94 + x, 68 + y, 1, 10);
            g2d.fillRect(95 + x, 47 + y, 1, 21);
            g2d.fillRect(96 + x, 44 + y, 1, 17);
            g2d.fillRect(97 + x, 44 + y, 1, 6);
            g2d.fillRect(98 + x, 44 + y, 1, 5);
        } else if (step == 1) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(101 + x, 78 + y, 1, 1);
            g2d.fillRect(102 + x, 77 + y, 2, 1);
            g2d.fillRect(96 + x, 76 + y, 1, 2);
            g2d.fillRect(104 + x, 75 + y, 1, 2);
            g2d.fillRect(95 + x, 75 + y, 1, 1);
            g2d.fillRect(103 + x, 74 + y, 1, 1);
            g2d.fillRect(94 + x, 74 + y, 1, 1);
            g2d.fillRect(101 + x, 73 + y, 2, 1);
            g2d.fillRect(93 + x, 73 + y, 1, 1);
            g2d.fillRect(92 + x, 72 + y, 1, 1);
            g2d.fillRect(96 + x, 71 + y, 1, 2);
            g2d.fillRect(95 + x, 70 + y, 1, 1);
            g2d.fillRect(91 + x, 70 + y, 1, 2);
            g2d.fillRect(90 + x, 69 + y, 1, 1);
            g2d.fillRect(94 + x, 67 + y, 1, 3);
            g2d.fillRect(89 + x, 67 + y, 1, 2);
            g2d.fillRect(93 + x, 65 + y, 1, 2);
            g2d.fillRect(88 + x, 65 + y, 1, 2);
            g2d.fillRect(87 + x, 62 + y, 1, 3);
            g2d.fillRect(93 + x, 60 + y, 1, 2);
            g2d.fillRect(88 + x, 60 + y, 1, 2);
            g2d.fillRect(94 + x, 59 + y, 1, 1);
            g2d.fillRect(89 + x, 58 + y, 1, 2);
            g2d.fillRect(95 + x, 57 + y, 1, 2);
            g2d.fillRect(96 + x, 55 + y, 1, 2);
            g2d.fillRect(90 + x, 55 + y, 1, 3);
            g2d.fillRect(97 + x, 53 + y, 1, 2);
            g2d.fillRect(91 + x, 52 + y, 1, 3);
            g2d.fillRect(98 + x, 50 + y, 1, 3);
            g2d.fillRect(92 + x, 50 + y, 1, 2);
            g2d.fillRect(93 + x, 47 + y, 1, 3);
            g2d.fillRect(94 + x, 44 + y, 1, 3);
            g2d.fillRect(95 + x, 43 + y, 1, 1);
            g2d.fillRect(96 + x, 42 + y, 2, 1);
            g2d.fillRect(98 + x, 41 + y, 1, 1);
            g2d.fillRect(90 + x, 63 + y, 2, 1);
            g2d.fillRect(97 + x, 73 + y, 2, 1);
            g2d.fillRect(91 + x, 62 + y, 1, 1);
            g2d.fillRect(92 + x, 62 + y, 1, 3);
            g2d.fillRect(98 + x, 74 + y, 3, 1);
            g2d.fillRect(99 + x, 75 + y, 1, 2);
            g2d.fillRect(97 + x, 77 + y, 1, 2);
            g2d.fillRect(98 + x, 78 + y, 1, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(98 + x, 75 + y, 1, 1);
            g2d.fillRect(97 + x, 74 + y, 1, 1);
            g2d.fillRect(95 + x, 74 + y, 1, 1);
            g2d.fillRect(96 + x, 73 + y, 1, 1);
            g2d.fillRect(94 + x, 73 + y, 1, 1);
            g2d.fillRect(95 + x, 71 + y, 1, 1);
            g2d.fillRect(92 + x, 70 + y, 1, 2);
            g2d.fillRect(91 + x, 69 + y, 1, 1);
            g2d.fillRect(90 + x, 68 + y, 1, 1);
            g2d.fillRect(93 + x, 67 + y, 1, 2);
            g2d.fillRect(89 + x, 65 + y, 1, 2);
            g2d.fillRect(91 + x, 64 + y, 1, 2);
            g2d.fillRect(89 + x, 60 + y, 1, 3);
            g2d.fillRect(90 + x, 58 + y, 1, 2);
            g2d.fillRect(95 + x, 55 + y, 1, 2);
            g2d.fillRect(91 + x, 55 + y, 1, 3);
            g2d.fillRect(92 + x, 52 + y, 1, 3);
            g2d.fillRect(97 + x, 51 + y, 1, 2);
            g2d.fillRect(93 + x, 50 + y, 1, 2);
            g2d.fillRect(94 + x, 47 + y, 1, 3);
            g2d.fillRect(98 + x, 42 + y, 1, 2);
            g2d.fillRect(91 + x, 61 + y, 2, 1);
            g2d.fillRect(97 + x, 43 + y, 1, 1);
            g2d.fillRect(96 + x, 43 + y, 1, 2);
            g2d.fillRect(95 + x, 44 + y, 1, 3);
            g2d.fillRect(88 + x, 62 + y, 1, 3);
            g2d.fillRect(96 + x, 52 + y, 1, 3);
            g2d.fillRect(94 + x, 56 + y, 1, 3);
            g2d.fillRect(93 + x, 58 + y, 1, 2);
            g2d.fillRect(92 + x, 59 + y, 1, 2);
            g2d.fillRect(92 + x, 65 + y, 1, 2);
            g2d.fillRect(93 + x, 71 + y, 1, 2);
            g2d.fillRect(101 + x, 74 + y, 2, 1);
            g2d.fillRect(100 + x, 75 + y, 2, 1);
            g2d.fillRect(100 + x, 76 + y, 1, 1);
            g2d.fillRect(99 + x, 77 + y, 2, 2);

            g2d.setColor(b.fillColor);
            g2d.fillRect(96 + x, 74 + y, 1, 2);
            g2d.fillRect(89 + x, 63 + y, 1, 2);
            g2d.fillRect(98 + x, 44 + y, 1, 6);
            g2d.fillRect(97 + x, 44 + y, 1, 7);
            g2d.fillRect(96 + x, 45 + y, 1, 7);
            g2d.fillRect(95 + x, 47 + y, 1, 8);
            g2d.fillRect(94 + x, 50 + y, 1, 6);
            g2d.fillRect(93 + x, 52 + y, 1, 6);
            g2d.fillRect(92 + x, 55 + y, 1, 4);
            g2d.fillRect(91 + x, 58 + y, 1, 3);
            g2d.fillRect(90 + x, 60 + y, 1, 3);
            g2d.fillRect(90 + x, 64 + y, 1, 4);
            g2d.fillRect(91 + x, 66 + y, 1, 3);
            g2d.fillRect(92 + x, 67 + y, 1, 3);
            g2d.fillRect(93 + x, 69 + y, 1, 2);
            g2d.fillRect(94 + x, 70 + y, 1, 3);
            g2d.fillRect(95 + x, 72 + y, 1, 2);
            g2d.fillRect(97 + x, 75 + y, 1, 2);
            g2d.fillRect(98 + x, 76 + y, 1, 2);
            g2d.fillRect(101 + x, 76 + y, 1, 2);
            g2d.fillRect(102 + x, 75 + y, 2, 2);
        } else if (step == 2) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(98 + x, 41 + y, 1, 1);
            g2d.fillRect(96 + x, 42 + y, 2, 1);
            g2d.fillRect(95 + x, 43 + y, 1, 2);
            g2d.fillRect(94 + x, 45 + y, 1, 2);
            g2d.fillRect(93 + x, 47 + y, 1, 2);
            g2d.fillRect(92 + x, 49 + y, 1, 2);
            g2d.fillRect(91 + x, 51 + y, 1, 2);
            g2d.fillRect(98 + x, 51 + y, 1, 1);
            g2d.fillRect(97 + x, 52 + y, 1, 1);
            g2d.fillRect(90 + x, 53 + y, 1, 1);
            g2d.fillRect(96 + x, 53 + y, 1, 2);
            g2d.fillRect(89 + x, 54 + y, 1, 2);
            g2d.fillRect(95 + x, 55 + y, 1, 2);
            g2d.fillRect(88 + x, 56 + y, 1, 2);
            g2d.fillRect(94 + x, 57 + y, 1, 1);
            g2d.fillRect(87 + x, 58 + y, 1, 2);
            g2d.fillRect(86 + x, 60 + y, 1, 2);
            g2d.fillRect(85 + x, 62 + y, 1, 5);


            g2d.setColor(b.highlightColor);
            g2d.fillRect(98 + x, 42 + y, 1, 1);
            g2d.fillRect(96 + x, 43 + y, 1, 3);
            g2d.fillRect(95 + x, 45 + y, 1, 3);
            g2d.fillRect(94 + x, 47 + y, 1, 3);
            g2d.fillRect(93 + x, 49 + y, 1, 2);
            g2d.fillRect(98 + x, 49 + y, 1, 2);
            g2d.fillRect(97 + x, 50 + y, 1, 2);
            g2d.fillRect(92 + x, 51 + y, 1, 2);
            g2d.fillRect(96 + x, 52 + y, 1, 1);
            g2d.fillRect(91 + x, 53 + y, 1, 1);
            g2d.fillRect(95 + x, 53 + y, 1, 2);
            g2d.fillRect(90 + x, 54 + y, 1, 2);
            g2d.fillRect(94 + x, 54 + y, 1, 3);
            g2d.fillRect(89 + x, 56 + y, 1, 2);
            g2d.fillRect(93 + x, 56 + y, 1, 2);
            g2d.fillRect(88 + x, 58 + y, 1, 2);
            g2d.fillRect(92 + x, 58 + y, 1, 1);
            g2d.fillRect(91 + x, 59 + y, 1, 1);
            g2d.fillRect(87 + x, 60 + y, 1, 2);
            g2d.fillRect(86 + x, 62 + y, 1, 2);

            g2d.setColor(b.fillColor);
            g2d.fillRect(97 + x, 44 + y, 1, 5);
            g2d.fillRect(98 + x, 44 + y, 1, 4);
            g2d.fillRect(95 + x, 49 + y, 1, 2);
            g2d.fillRect(92 + x, 54 + y, 1, 2);
            g2d.fillRect(93 + x, 54 + y, 1, 1);
            g2d.fillRect(91 + x, 55 + y, 1, 4);
            g2d.fillRect(90 + x, 57 + y, 1, 1);
            g2d.fillRect(90 + x, 59 + y, 1, 1);
            g2d.fillRect(89 + x, 60 + y, 1, 1);
            g2d.fillRect(88 + x, 62 + y, 1, 1);


            g2d.setColor(b.fillColor);
            g2d.fillRect(97 + x, 43 + y, 2, 1);
            g2d.fillRect(96 + x, 46 + y, 1, 6);
            g2d.fillRect(95 + x, 48 + y, 1, 1);
            g2d.fillRect(98 + x, 48 + y, 1, 1);
            g2d.fillRect(97 + x, 49 + y, 1, 1);
            g2d.fillRect(94 + x, 50 + y, 1, 4);
            g2d.fillRect(93 + x, 51 + y, 1, 3);
            g2d.fillRect(95 + x, 51 + y, 1, 2);
            g2d.fillRect(92 + x, 53 + y, 1, 1);
            g2d.fillRect(91 + x, 54 + y, 1, 1);
            g2d.fillRect(93 + x, 55 + y, 1, 1);
            g2d.fillRect(90 + x, 56 + y, 1, 1);
            g2d.fillRect(92 + x, 56 + y, 1, 2);
            g2d.fillRect(89 + x, 58 + y, 1, 2);
            g2d.fillRect(90 + x, 58 + y, 1, 1);
            g2d.fillRect(88 + x, 60 + y, 1, 2);
            g2d.fillRect(90 + x, 60 + y, 1, 1);
            g2d.fillRect(89 + x, 61 + y, 1, 1);
            g2d.fillRect(87 + x, 62 + y, 1, 3);
            g2d.fillRect(88 + x, 63 + y, 1, 1);
            g2d.fillRect(86 + x, 64 + y, 1, 2);
        } else if (step == 3) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(98 + x, 41 + y, 1, 1);
            g2d.fillRect(96 + x, 42 + y, 2, 1);
            g2d.fillRect(95 + x, 43 + y, 1, 2);
            g2d.fillRect(94 + x, 45 + y, 1, 12);
            g2d.fillRect(81 + x, 53 + y, 5, 1);
            g2d.fillRect(77 + x, 54 + y, 4, 1);
            g2d.fillRect(86 + x, 54 + y, 2, 1);
            g2d.fillRect(76 + x, 55 + y, 1, 1);
            g2d.fillRect(88 + x, 55 + y, 1, 1);
            g2d.fillRect(77 + x, 56 + y, 8, 1);
            g2d.fillRect(89 + x, 56 + y, 1, 2);
            g2d.fillRect(99 + x, 56 + y, 1, 7);
            g2d.fillRect(85 + x, 57 + y, 2, 1);
            g2d.fillRect(93 + x, 57 + y, 1, 6);
            g2d.fillRect(87 + x, 58 + y, 1, 2);
            g2d.fillRect(90 + x, 58 + y, 1, 2);
            g2d.fillRect(88 + x, 60 + y, 1, 2);
            g2d.fillRect(91 + x, 61 + y, 1, 1);
            g2d.fillRect(89 + x, 62 + y, 1, 3);
            g2d.fillRect(92 + x, 62 + y, 1, 1);
            g2d.fillRect(98 + x, 63 + y, 1, 3);
            g2d.fillRect(90 + x, 65 + y, 1, 1);
            g2d.fillRect(91 + x, 66 + y, 1, 1);
            g2d.fillRect(97 + x, 66 + y, 1, 2);
            g2d.fillRect(92 + x, 67 + y, 2, 1);
            g2d.fillRect(94 + x, 68 + y, 1, 1);
            g2d.fillRect(96 + x, 68 + y, 1, 1);
            g2d.fillRect(95 + x, 69 + y, 1, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(98 + x, 42 + y, 1, 2);
            g2d.fillRect(96 + x, 43 + y, 1, 4);
            g2d.fillRect(97 + x, 43 + y, 1, 2);
            g2d.fillRect(95 + x, 45 + y, 1, 12);
            g2d.fillRect(98 + x, 50 + y, 1, 13);
            g2d.fillRect(81 + x, 54 + y, 5, 1);
            g2d.fillRect(77 + x, 55 + y, 1, 1);
            g2d.fillRect(87 + x, 55 + y, 1, 1);
            g2d.fillRect(85 + x, 56 + y, 2, 1);
            g2d.fillRect(88 + x, 56 + y, 1, 1);
            g2d.fillRect(87 + x, 57 + y, 1, 1);
            g2d.fillRect(94 + x, 57 + y, 1, 5);
            g2d.fillRect(89 + x, 58 + y, 1, 1);
            g2d.fillRect(88 + x, 59 + y, 1, 1);
            g2d.fillRect(90 + x, 60 + y, 1, 1);
            g2d.fillRect(89 + x, 61 + y, 1, 1);
            g2d.fillRect(91 + x, 62 + y, 1, 1);
            g2d.fillRect(90 + x, 63 + y, 1, 2);
            g2d.fillRect(92 + x, 63 + y, 2, 1);
            g2d.fillRect(97 + x, 63 + y, 1, 3);
            g2d.fillRect(91 + x, 65 + y, 2, 1);
            g2d.fillRect(92 + x, 66 + y, 3, 1);
            g2d.fillRect(96 + x, 66 + y, 1, 2);
            g2d.fillRect(94 + x, 67 + y, 2, 1);
            g2d.fillRect(95 + x, 68 + y, 1, 1);


            g2d.setColor(b.fillColor);
            g2d.fillRect(98 + x, 44 + y, 1, 6);
            g2d.fillRect(97 + x, 45 + y, 1, 18);
            g2d.fillRect(96 + x, 47 + y, 1, 19);
            g2d.fillRect(78 + x, 55 + y, 9, 1);
            g2d.fillRect(87 + x, 56 + y, 1, 1);
            g2d.fillRect(88 + x, 57 + y, 1, 2);
            g2d.fillRect(95 + x, 57 + y, 1, 10);
            g2d.fillRect(89 + x, 59 + y, 1, 2);
            g2d.fillRect(90 + x, 61 + y, 1, 2);
            g2d.fillRect(94 + x, 62 + y, 1, 4);
            g2d.fillRect(91 + x, 63 + y, 1, 2);
            g2d.fillRect(92 + x, 64 + y, 2, 1);
            g2d.fillRect(93 + x, 65 + y, 1, 1);

        } else if (step == 4) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(97 + x, 41 + y, 2, 1);
            g2d.fillRect(95 + x, 42 + y, 2, 1);


            g2d.setColor(b.outlineColor);
            g2d.fillRect(73 + x, 28 + y, 1, 6);
            g2d.fillRect(74 + x, 28 + y, 1, 1);
            g2d.fillRect(75 + x, 29 + y, 1, 2);
            g2d.fillRect(78 + x, 30 + y, 1, 1);
            g2d.fillRect(76 + x, 31 + y, 2, 1);
            g2d.fillRect(79 + x, 31 + y, 1, 1);
            g2d.fillRect(80 + x, 32 + y, 1, 1);
            g2d.fillRect(81 + x, 33 + y, 1, 1);
            g2d.fillRect(74 + x, 34 + y, 1, 1);
            g2d.fillRect(82 + x, 34 + y, 1, 1);
            g2d.fillRect(75 + x, 35 + y, 2, 1);
            g2d.fillRect(83 + x, 35 + y, 1, 13);
            g2d.fillRect(77 + x, 36 + y, 2, 1);
            g2d.fillRect(79 + x, 37 + y, 1, 1);
            g2d.fillRect(80 + x, 38 + y, 1, 19);
            g2d.fillRect(94 + x, 43 + y, 1, 1);
            g2d.fillRect(93 + x, 44 + y, 1, 1);
            g2d.fillRect(92 + x, 45 + y, 1, 1);
            g2d.fillRect(91 + x, 46 + y, 1, 1);
            g2d.fillRect(98 + x, 46 + y, 1, 2);
            g2d.fillRect(90 + x, 47 + y, 1, 1);
            g2d.fillRect(97 + x, 47 + y, 1, 2);
            g2d.fillRect(84 + x, 48 + y, 1, 3);
            g2d.fillRect(89 + x, 48 + y, 1, 1);
            g2d.fillRect(96 + x, 48 + y, 1, 2);
            g2d.fillRect(88 + x, 49 + y, 1, 1);
            g2d.fillRect(95 + x, 49 + y, 1, 2);
            g2d.fillRect(87 + x, 50 + y, 1, 1);
            g2d.fillRect(85 + x, 51 + y, 1, 3);
            g2d.fillRect(86 + x, 51 + y, 1, 1);
            g2d.fillRect(94 + x, 51 + y, 1, 1);
            g2d.fillRect(93 + x, 52 + y, 1, 1);
            g2d.fillRect(92 + x, 53 + y, 1, 1);
            g2d.fillRect(90 + x, 54 + y, 2, 1);
            g2d.fillRect(88 + x, 55 + y, 2, 1);
            g2d.fillRect(86 + x, 56 + y, 2, 1);
            g2d.fillRect(81 + x, 57 + y, 5, 1);


            g2d.setColor(b.highlightColor);
            g2d.fillRect(78 + x, 31 + y, 1, 1);
            g2d.fillRect(79 + x, 32 + y, 1, 3);
            g2d.fillRect(77 + x, 33 + y, 2, 1);
            g2d.fillRect(80 + x, 33 + y, 1, 3);
            g2d.fillRect(81 + x, 34 + y, 1, 1);
            g2d.fillRect(82 + x, 37 + y, 1, 11);
            g2d.fillRect(97 + x, 42 + y, 2, 1);
            g2d.fillRect(95 + x, 43 + y, 2, 1);
            g2d.fillRect(94 + x, 44 + y, 1, 1);
            g2d.fillRect(93 + x, 45 + y, 1, 1);
            g2d.fillRect(98 + x, 45 + y, 1, 1);
            g2d.fillRect(92 + x, 46 + y, 1, 1);
            g2d.fillRect(97 + x, 46 + y, 1, 1);
            g2d.fillRect(91 + x, 47 + y, 1, 1);
            g2d.fillRect(96 + x, 47 + y, 1, 1);
            g2d.fillRect(83 + x, 48 + y, 1, 3);
            g2d.fillRect(90 + x, 48 + y, 1, 1);
            g2d.fillRect(95 + x, 48 + y, 1, 1);
            g2d.fillRect(81 + x, 49 + y, 1, 8);
            g2d.fillRect(89 + x, 49 + y, 1, 1);
            g2d.fillRect(94 + x, 49 + y, 1, 2);
            g2d.fillRect(88 + x, 50 + y, 1, 1);
            g2d.fillRect(93 + x, 50 + y, 1, 2);
            g2d.fillRect(84 + x, 51 + y, 1, 3);
            g2d.fillRect(87 + x, 51 + y, 1, 1);
            g2d.fillRect(92 + x, 51 + y, 1, 2);
            g2d.fillRect(86 + x, 52 + y, 1, 2);
            g2d.fillRect(91 + x, 52 + y, 1, 2);
            g2d.fillRect(90 + x, 53 + y, 1, 1);
            g2d.fillRect(85 + x, 54 + y, 1, 3);
            g2d.fillRect(88 + x, 54 + y, 2, 1);
            g2d.fillRect(86 + x, 55 + y, 2, 1);
            g2d.fillRect(82 + x, 56 + y, 3, 1);


            g2d.setColor(b.fillColor);
            g2d.fillRect(74 + x, 29 + y, 1, 5);
            g2d.fillRect(75 + x, 31 + y, 1, 4);
            g2d.fillRect(76 + x, 32 + y, 1, 3);
            g2d.fillRect(77 + x, 32 + y, 2, 1);
            g2d.fillRect(77 + x, 34 + y, 1, 2);
            g2d.fillRect(78 + x, 34 + y, 1, 2);
            g2d.fillRect(79 + x, 35 + y, 1, 2);
            g2d.fillRect(81 + x, 35 + y, 1, 14);
            g2d.fillRect(82 + x, 35 + y, 1, 2);
            g2d.fillRect(80 + x, 36 + y, 1, 2);
            g2d.fillRect(97 + x, 43 + y, 1, 3);
            g2d.fillRect(98 + x, 43 + y, 1, 2);
            g2d.fillRect(95 + x, 44 + y, 1, 4);
            g2d.fillRect(96 + x, 44 + y, 1, 3);
            g2d.fillRect(94 + x, 45 + y, 1, 4);
            g2d.fillRect(93 + x, 46 + y, 1, 4);
            g2d.fillRect(92 + x, 47 + y, 1, 4);
            g2d.fillRect(82 + x, 48 + y, 1, 8);
            g2d.fillRect(91 + x, 48 + y, 1, 4);
            g2d.fillRect(90 + x, 49 + y, 1, 4);
            g2d.fillRect(89 + x, 50 + y, 1, 4);
            g2d.fillRect(83 + x, 51 + y, 1, 5);
            g2d.fillRect(88 + x, 51 + y, 1, 3);
            g2d.fillRect(87 + x, 52 + y, 1, 3);
            g2d.fillRect(84 + x, 54 + y, 1, 2);
            g2d.fillRect(86 + x, 54 + y, 1, 1);
        } else if (step == 5) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(98 + x, 41 + y, 1, 1);
            g2d.fillRect(96 + x, 42 + y, 2, 1);
            g2d.fillRect(95 + x, 43 + y, 1, 1);
            g2d.fillRect(94 + x, 44 + y, 1, 3);
            g2d.fillRect(98 + x, 46 + y, 1, 2);
            g2d.fillRect(93 + x, 47 + y, 1, 3);
            g2d.fillRect(97 + x, 48 + y, 1, 3);
            g2d.fillRect(92 + x, 50 + y, 1, 3);
            g2d.fillRect(96 + x, 51 + y, 1, 3);
            g2d.fillRect(91 + x, 53 + y, 1, 3);
            g2d.fillRect(95 + x, 54 + y, 1, 3);
            g2d.fillRect(90 + x, 56 + y, 1, 3);
            g2d.fillRect(94 + x, 57 + y, 1, 3);
            g2d.fillRect(89 + x, 59 + y, 1, 3);
            g2d.fillRect(93 + x, 60 + y, 1, 3);
            g2d.fillRect(88 + x, 62 + y, 1, 2);
            g2d.fillRect(92 + x, 63 + y, 1, 1);
            g2d.fillRect(87 + x, 64 + y, 1, 2);
            g2d.fillRect(91 + x, 64 + y, 1, 2);
            g2d.fillRect(86 + x, 66 + y, 1, 2);
            g2d.fillRect(90 + x, 66 + y, 1, 2);
            g2d.fillRect(85 + x, 68 + y, 1, 3);
            g2d.fillRect(89 + x, 68 + y, 1, 2);
            g2d.fillRect(88 + x, 70 + y, 1, 2);
            g2d.fillRect(84 + x, 71 + y, 1, 2);
            g2d.fillRect(87 + x, 72 + y, 1, 2);
            g2d.fillRect(83 + x, 73 + y, 1, 2);
            g2d.fillRect(86 + x, 74 + y, 1, 2);
            g2d.fillRect(82 + x, 75 + y, 1, 1);
            g2d.fillRect(79 + x, 76 + y, 3, 1);
            g2d.fillRect(85 + x, 76 + y, 1, 1);
            g2d.fillRect(75 + x, 77 + y, 4, 1);
            g2d.fillRect(84 + x, 77 + y, 1, 2);
            g2d.fillRect(74 + x, 78 + y, 1, 2);
            g2d.fillRect(83 + x, 79 + y, 1, 2);
            g2d.fillRect(75 + x, 80 + y, 4, 1);
            g2d.fillRect(79 + x, 81 + y, 1, 1);
            g2d.fillRect(82 + x, 81 + y, 1, 1);
            g2d.fillRect(80 + x, 82 + y, 2, 1);


            g2d.setColor(b.highlightColor);
            g2d.fillRect(98 + x, 42 + y, 1, 2);
            g2d.fillRect(96 + x, 43 + y, 1, 2);
            g2d.fillRect(97 + x, 43 + y, 1, 1);
            g2d.fillRect(95 + x, 44 + y, 1, 3);
            g2d.fillRect(97 + x, 46 + y, 1, 2);
            g2d.fillRect(94 + x, 47 + y, 1, 3);
            g2d.fillRect(96 + x, 48 + y, 1, 3);
            g2d.fillRect(93 + x, 50 + y, 1, 3);
            g2d.fillRect(95 + x, 51 + y, 1, 3);
            g2d.fillRect(92 + x, 53 + y, 1, 3);
            g2d.fillRect(94 + x, 54 + y, 1, 3);
            g2d.fillRect(91 + x, 56 + y, 1, 3);
            g2d.fillRect(93 + x, 57 + y, 1, 3);
            g2d.fillRect(90 + x, 59 + y, 1, 3);
            g2d.fillRect(92 + x, 60 + y, 1, 3);
            g2d.fillRect(89 + x, 62 + y, 1, 2);
            g2d.fillRect(91 + x, 63 + y, 1, 1);
            g2d.fillRect(88 + x, 64 + y, 1, 2);
            g2d.fillRect(90 + x, 65 + y, 1, 1);
            g2d.fillRect(87 + x, 66 + y, 1, 2);
            g2d.fillRect(89 + x, 67 + y, 1, 1);
            g2d.fillRect(86 + x, 68 + y, 1, 2);
            g2d.fillRect(88 + x, 69 + y, 1, 1);
            g2d.fillRect(87 + x, 70 + y, 1, 2);
            g2d.fillRect(85 + x, 71 + y, 1, 1);
            g2d.fillRect(86 + x, 72 + y, 1, 2);
            g2d.fillRect(84 + x, 73 + y, 1, 1);
            g2d.fillRect(85 + x, 74 + y, 1, 2);
            g2d.fillRect(83 + x, 75 + y, 1, 1);
            g2d.fillRect(82 + x, 76 + y, 1, 1);
            g2d.fillRect(84 + x, 76 + y, 1, 1);
            g2d.fillRect(79 + x, 77 + y, 3, 1);
            g2d.fillRect(83 + x, 77 + y, 1, 2);
            g2d.fillRect(75 + x, 78 + y, 1, 2);
            g2d.fillRect(76 + x, 78 + y, 1, 2);
            g2d.fillRect(77 + x, 78 + y, 1, 2);
            g2d.fillRect(78 + x, 78 + y, 1, 2);
            g2d.fillRect(82 + x, 78 + y, 1, 3);
            g2d.fillRect(79 + x, 79 + y, 1, 2);
            g2d.fillRect(80 + x, 79 + y, 1, 3);
            g2d.fillRect(81 + x, 80 + y, 1, 2);


            g2d.setColor(b.fillColor);
            g2d.fillRect(97 + x, 44 + y, 1, 2);
            g2d.fillRect(98 + x, 44 + y, 1, 2);
            g2d.fillRect(96 + x, 45 + y, 1, 3);
            g2d.fillRect(95 + x, 47 + y, 1, 4);
            g2d.fillRect(94 + x, 50 + y, 1, 4);
            g2d.fillRect(93 + x, 53 + y, 1, 4);
            g2d.fillRect(92 + x, 56 + y, 1, 4);
            g2d.fillRect(91 + x, 59 + y, 1, 4);
            g2d.fillRect(90 + x, 62 + y, 1, 3);
            g2d.fillRect(89 + x, 64 + y, 1, 3);
            g2d.fillRect(88 + x, 66 + y, 1, 3);
            g2d.fillRect(87 + x, 68 + y, 1, 2);
            g2d.fillRect(86 + x, 70 + y, 1, 2);
            g2d.fillRect(85 + x, 72 + y, 1, 2);
            g2d.fillRect(84 + x, 74 + y, 1, 2);
            g2d.fillRect(83 + x, 76 + y, 1, 1);
            g2d.fillRect(82 + x, 77 + y, 1, 1);
            g2d.fillRect(79 + x, 78 + y, 3, 1);
            g2d.fillRect(81 + x, 79 + y, 1, 1);
        } else if (step == 7) {
            paintLeftA1(x, y, g2d);
        } else if (step == 8) {
            paintLeftB1B(x, y, g2d);
        } else if (step == 9) {
            paintL(x, y, g2d);
        } else if (step == 10) {
            paintL1(x, y, g2d);
        } else if (step == 11) {
            paintL2(x, y, g2d);
        } else if (step == 12) {
            paint12(x, y, g2d);
        }

    }

    public void paintFront(int x, int y, GraphicsMap g2d) {
        if (step == 1) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(101 + x, 78 + y, 1, 1);
            g2d.fillRect(102 + x, 77 + y, 2, 1);
            g2d.fillRect(96 + x, 76 + y, 1, 2);
            g2d.fillRect(104 + x, 75 + y, 1, 2);
            g2d.fillRect(95 + x, 75 + y, 1, 1);
            g2d.fillRect(103 + x, 74 + y, 1, 1);
            g2d.fillRect(94 + x, 74 + y, 1, 1);
            g2d.fillRect(101 + x, 73 + y, 2, 1);
            g2d.fillRect(93 + x, 73 + y, 1, 1);
            g2d.fillRect(92 + x, 72 + y, 1, 1);
            g2d.fillRect(96 + x, 71 + y, 1, 2);
            g2d.fillRect(95 + x, 70 + y, 1, 1);
            g2d.fillRect(91 + x, 70 + y, 1, 2);
            g2d.fillRect(90 + x, 69 + y, 1, 1);
            g2d.fillRect(94 + x, 67 + y, 1, 3);
            g2d.fillRect(89 + x, 67 + y, 1, 2);
            g2d.fillRect(93 + x, 65 + y, 1, 2);
            g2d.fillRect(88 + x, 65 + y, 1, 2);
            g2d.fillRect(87 + x, 62 + y, 1, 3);
            g2d.fillRect(90 + x, 63 + y, 3, 1);
            g2d.fillRect(92 + x, 64 + y, 1, 1);
            g2d.fillRect(97 + x, 73 + y, 2, 1);
            g2d.fillRect(98 + x, 74 + y, 3, 1);
            g2d.fillRect(99 + x, 75 + y, 1, 2);
            g2d.fillRect(97 + x, 77 + y, 1, 2);
            g2d.fillRect(98 + x, 78 + y, 1, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(98 + x, 75 + y, 1, 1);
            g2d.fillRect(97 + x, 74 + y, 1, 1);
            g2d.fillRect(95 + x, 74 + y, 1, 1);
            g2d.fillRect(96 + x, 73 + y, 1, 1);
            g2d.fillRect(94 + x, 73 + y, 1, 1);
            g2d.fillRect(95 + x, 71 + y, 1, 1);
            g2d.fillRect(92 + x, 70 + y, 1, 2);
            g2d.fillRect(91 + x, 69 + y, 1, 1);
            g2d.fillRect(90 + x, 68 + y, 1, 1);
            g2d.fillRect(93 + x, 67 + y, 1, 2);
            g2d.fillRect(89 + x, 65 + y, 1, 2);
            g2d.fillRect(91 + x, 64 + y, 1, 2);
            g2d.fillRect(88 + x, 62 + y, 1, 3);
            g2d.fillRect(92 + x, 65 + y, 1, 2);
            g2d.fillRect(93 + x, 71 + y, 1, 2);
            g2d.fillRect(99 + x, 77 + y, 1, 2);
            g2d.fillRect(100 + x, 75 + y, 1, 4);
            g2d.fillRect(101 + x, 74 + y, 1, 2);
            g2d.fillRect(102 + x, 74 + y, 1, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(96 + x, 74 + y, 1, 2);
            g2d.fillRect(90 + x, 64 + y, 1, 4);
            g2d.fillRect(91 + x, 66 + y, 1, 3);
            g2d.fillRect(92 + x, 67 + y, 1, 3);
            g2d.fillRect(93 + x, 69 + y, 1, 2);
            g2d.fillRect(94 + x, 70 + y, 1, 3);
            g2d.fillRect(95 + x, 72 + y, 1, 2);
            g2d.fillRect(97 + x, 75 + y, 1, 2);
            g2d.fillRect(98 + x, 76 + y, 1, 2);
            g2d.fillRect(101 + x, 76 + y, 1, 2);
            g2d.fillRect(102 + x, 75 + y, 2, 2);
        } else if (step == 2) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(97 + x, 54 + y, 1, 1);


            g2d.setColor(b.outlineColor);
            g2d.fillRect(101 + x, 47 + y, 1, 2);
            g2d.fillRect(102 + x, 47 + y, 2, 1);
            g2d.fillRect(104 + x, 48 + y, 2, 1);
            g2d.fillRect(100 + x, 49 + y, 1, 1);
            g2d.fillRect(105 + x, 49 + y, 1, 1);
            g2d.fillRect(99 + x, 50 + y, 1, 3);
            g2d.fillRect(106 + x, 50 + y, 1, 3);
            g2d.fillRect(100 + x, 51 + y, 1, 1);
            g2d.fillRect(98 + x, 53 + y, 1, 2);
            g2d.fillRect(105 + x, 53 + y, 1, 1);
            g2d.fillRect(104 + x, 54 + y, 1, 1);
            g2d.fillRect(97 + x, 55 + y, 1, 1);
            g2d.fillRect(103 + x, 55 + y, 1, 1);
            g2d.fillRect(96 + x, 56 + y, 1, 1);
            g2d.fillRect(102 + x, 56 + y, 1, 1);
            g2d.fillRect(95 + x, 57 + y, 1, 1);
            g2d.fillRect(101 + x, 57 + y, 1, 1);
            g2d.fillRect(93 + x, 58 + y, 1, 2);
            g2d.fillRect(94 + x, 58 + y, 1, 1);
            g2d.fillRect(100 + x, 58 + y, 1, 1);
            g2d.fillRect(92 + x, 59 + y, 1, 1);
            g2d.fillRect(99 + x, 59 + y, 1, 1);
            g2d.fillRect(91 + x, 60 + y, 1, 1);
            g2d.fillRect(98 + x, 60 + y, 1, 1);
            g2d.fillRect(90 + x, 61 + y, 1, 1);
            g2d.fillRect(97 + x, 61 + y, 1, 1);
            g2d.fillRect(89 + x, 62 + y, 1, 2);
            g2d.fillRect(96 + x, 62 + y, 1, 1);
            g2d.fillRect(95 + x, 63 + y, 1, 1);
            g2d.fillRect(94 + x, 64 + y, 1, 1);
            g2d.fillRect(93 + x, 65 + y, 1, 1);
            g2d.fillRect(92 + x, 66 + y, 1, 1);
            g2d.fillRect(86 + x, 67 + y, 1, 1);
            g2d.fillRect(90 + x, 67 + y, 2, 1);
            g2d.fillRect(87 + x, 68 + y, 3, 1);


            g2d.setColor(b.highlightColor);
            g2d.fillRect(102 + x, 48 + y, 1, 2);
            g2d.fillRect(103 + x, 48 + y, 1, 3);
            g2d.fillRect(101 + x, 49 + y, 1, 2);
            g2d.fillRect(104 + x, 49 + y, 1, 2);
            g2d.fillRect(100 + x, 50 + y, 1, 1);
            g2d.fillRect(105 + x, 50 + y, 1, 3);
            g2d.fillRect(102 + x, 51 + y, 1, 1);
            g2d.fillRect(100 + x, 52 + y, 1, 2);
            g2d.fillRect(99 + x, 53 + y, 1, 2);
            g2d.fillRect(103 + x, 53 + y, 1, 2);
            g2d.fillRect(104 + x, 53 + y, 1, 1);
            g2d.fillRect(102 + x, 54 + y, 1, 2);
            g2d.fillRect(98 + x, 55 + y, 1, 1);
            g2d.fillRect(101 + x, 55 + y, 1, 2);
            g2d.fillRect(97 + x, 56 + y, 1, 1);
            g2d.fillRect(96 + x, 57 + y, 1, 1);
            g2d.fillRect(100 + x, 57 + y, 1, 1);
            g2d.fillRect(95 + x, 58 + y, 1, 1);
            g2d.fillRect(99 + x, 58 + y, 1, 1);
            g2d.fillRect(94 + x, 59 + y, 1, 1);
            g2d.fillRect(98 + x, 59 + y, 1, 1);
            g2d.fillRect(92 + x, 60 + y, 1, 2);
            g2d.fillRect(93 + x, 60 + y, 1, 1);
            g2d.fillRect(97 + x, 60 + y, 1, 1);
            g2d.fillRect(91 + x, 61 + y, 1, 2);
            g2d.fillRect(96 + x, 61 + y, 1, 1);
            g2d.fillRect(90 + x, 62 + y, 1, 1);
            g2d.fillRect(95 + x, 62 + y, 1, 1);
            g2d.fillRect(94 + x, 63 + y, 1, 1);
            g2d.fillRect(88 + x, 64 + y, 1, 1);
            g2d.fillRect(93 + x, 64 + y, 1, 1);
            g2d.fillRect(92 + x, 65 + y, 1, 1);
            g2d.fillRect(86 + x, 66 + y, 1, 1);
            g2d.fillRect(91 + x, 66 + y, 1, 1);
            g2d.fillRect(87 + x, 67 + y, 3, 1);


            g2d.setColor(b.fillColor);
            g2d.fillRect(103 + x, 51 + y, 1, 2);
            g2d.fillRect(104 + x, 51 + y, 1, 2);
            g2d.fillRect(99 + x, 55 + y, 1, 2);
            g2d.fillRect(100 + x, 55 + y, 1, 1);
            g2d.fillRect(98 + x, 56 + y, 1, 2);
            g2d.fillRect(95 + x, 60 + y, 1, 2);
            g2d.fillRect(94 + x, 61 + y, 1, 1);
            g2d.fillRect(90 + x, 64 + y, 1, 3);
            g2d.fillRect(88 + x, 65 + y, 1, 2);
            g2d.fillRect(89 + x, 65 + y, 1, 2);


            g2d.setColor(b.fillColor);
            g2d.fillRect(102 + x, 50 + y, 1, 1);
            g2d.fillRect(101 + x, 51 + y, 1, 4);
            g2d.fillRect(102 + x, 52 + y, 1, 2);
            g2d.fillRect(100 + x, 54 + y, 1, 1);
            g2d.fillRect(100 + x, 56 + y, 1, 1);
            g2d.fillRect(97 + x, 57 + y, 1, 3);
            g2d.fillRect(99 + x, 57 + y, 1, 1);
            g2d.fillRect(96 + x, 58 + y, 1, 3);
            g2d.fillRect(98 + x, 58 + y, 1, 1);
            g2d.fillRect(95 + x, 59 + y, 1, 1);
            g2d.fillRect(94 + x, 60 + y, 1, 1);
            g2d.fillRect(93 + x, 61 + y, 1, 3);
            g2d.fillRect(92 + x, 62 + y, 1, 3);
            g2d.fillRect(94 + x, 62 + y, 1, 1);
            g2d.fillRect(90 + x, 63 + y, 2, 1);
            g2d.fillRect(89 + x, 64 + y, 1, 1);
            g2d.fillRect(91 + x, 64 + y, 1, 2);
            g2d.fillRect(87 + x, 65 + y, 1, 2);
        } else if (step == 8) {
            paintLeftB1F(x, y, g2d);
        }

    }

    void setStep(int step) {
        this.step = step;
    }

    public void paintLeftA1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(96 + x, 32 + y, 1, 5);
        g2d.fillRect(97 + x, 37 + y, 1, 3);
        g2d.fillRect(98 + x, 40 + y, 1, 1);


        g2d.setColor(b.outlineColor);
        g2d.fillRect(88 + x, 10 + y, 1, 4);
        g2d.fillRect(89 + x, 10 + y, 4, 1);
        g2d.fillRect(93 + x, 11 + y, 1, 2);
        g2d.fillRect(94 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 2, 1);
        g2d.fillRect(87 + x, 14 + y, 1, 10);
        g2d.fillRect(96 + x, 14 + y, 2, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(92 + x, 16 + y, 1, 7);
        g2d.fillRect(99 + x, 16 + y, 2, 1);
        g2d.fillRect(101 + x, 17 + y, 2, 1);
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(93 + x, 19 + y, 1, 2);
        g2d.fillRect(94 + x, 19 + y, 1, 2);
        g2d.fillRect(105 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 2);
        g2d.fillRect(96 + x, 21 + y, 2, 1);
        g2d.fillRect(98 + x, 22 + y, 2, 1);
        g2d.fillRect(93 + x, 23 + y, 1, 2);
        g2d.fillRect(100 + x, 23 + y, 3, 1);
        g2d.fillRect(88 + x, 24 + y, 1, 5);
        g2d.fillRect(94 + x, 25 + y, 1, 4);
        g2d.fillRect(89 + x, 29 + y, 1, 4);
        g2d.fillRect(95 + x, 29 + y, 1, 3);
        g2d.fillRect(90 + x, 33 + y, 1, 3);
        g2d.fillRect(91 + x, 36 + y, 1, 4);
        g2d.fillRect(92 + x, 40 + y, 1, 4);
        g2d.fillRect(93 + x, 44 + y, 1, 3);
        g2d.fillRect(94 + x, 47 + y, 1, 1);
        g2d.fillRect(95 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 2, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(89 + x, 11 + y, 1, 3);
        g2d.fillRect(90 + x, 11 + y, 3, 1);
        g2d.fillRect(92 + x, 12 + y, 1, 2);
        g2d.fillRect(93 + x, 13 + y, 2, 1);
        g2d.fillRect(88 + x, 14 + y, 1, 10);
        g2d.fillRect(94 + x, 14 + y, 2, 1);
        g2d.fillRect(95 + x, 15 + y, 1, 2);
        g2d.fillRect(97 + x, 15 + y, 1, 2);
        g2d.fillRect(91 + x, 16 + y, 1, 7);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 2, 1);
        g2d.fillRect(93 + x, 18 + y, 4, 1);
        g2d.fillRect(100 + x, 18 + y, 3, 1);
        g2d.fillRect(95 + x, 19 + y, 3, 1);
        g2d.fillRect(101 + x, 19 + y, 4, 1);
        g2d.fillRect(96 + x, 20 + y, 3, 1);
        g2d.fillRect(98 + x, 21 + y, 3, 1);
        g2d.fillRect(100 + x, 22 + y, 3, 1);
        g2d.fillRect(92 + x, 23 + y, 1, 2);
        g2d.fillRect(89 + x, 24 + y, 1, 5);
        g2d.fillRect(93 + x, 25 + y, 1, 4);
        g2d.fillRect(90 + x, 29 + y, 1, 4);
        g2d.fillRect(94 + x, 29 + y, 1, 3);
        g2d.fillRect(95 + x, 32 + y, 1, 5);
        g2d.fillRect(91 + x, 33 + y, 1, 3);
        g2d.fillRect(92 + x, 36 + y, 1, 4);
        g2d.fillRect(96 + x, 37 + y, 1, 3);
        g2d.fillRect(93 + x, 40 + y, 1, 4);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 3);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(90 + x, 12 + y, 1, 17);
        g2d.fillRect(91 + x, 12 + y, 1, 4);
        g2d.fillRect(89 + x, 14 + y, 1, 10);
        g2d.fillRect(92 + x, 14 + y, 1, 2);
        g2d.fillRect(93 + x, 14 + y, 1, 4);
        g2d.fillRect(94 + x, 15 + y, 1, 3);
        g2d.fillRect(96 + x, 15 + y, 1, 3);
        g2d.fillRect(95 + x, 17 + y, 1, 1);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 1, 3);
        g2d.fillRect(99 + x, 18 + y, 1, 3);
        g2d.fillRect(100 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 20 + y, 1, 2);
        g2d.fillRect(102 + x, 20 + y, 1, 2);
        g2d.fillRect(103 + x, 20 + y, 1, 2);
        g2d.fillRect(104 + x, 20 + y, 1, 1);
        g2d.fillRect(91 + x, 23 + y, 1, 10);
        g2d.fillRect(92 + x, 25 + y, 1, 11);
        g2d.fillRect(93 + x, 29 + y, 1, 11);
        g2d.fillRect(94 + x, 32 + y, 1, 12);
        g2d.fillRect(95 + x, 37 + y, 1, 10);
        g2d.fillRect(96 + x, 40 + y, 1, 8);
        g2d.fillRect(97 + x, 41 + y, 1, 8);
        g2d.fillRect(98 + x, 42 + y, 1, 8);
    }

    public void paintLeftB1F(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 2, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 3);
        g2d.fillRect(97 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 3);
        g2d.fillRect(94 + x, 54 + y, 1, 2);
        g2d.fillRect(93 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 55 + y, 1, 3);
        g2d.fillRect(99 + x, 55 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(92 + x, 56 + y, 1, 1);
        g2d.fillRect(91 + x, 57 + y, 1, 1);
        g2d.fillRect(90 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 58 + y, 1, 2);
        g2d.fillRect(96 + x, 59 + y, 1, 2);
        g2d.fillRect(90 + x, 60 + y, 1, 4);
        g2d.fillRect(95 + x, 60 + y, 1, 2);
        g2d.fillRect(89 + x, 61 + y, 1, 2);
        g2d.fillRect(94 + x, 61 + y, 1, 2);
        g2d.fillRect(91 + x, 62 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 1, 2);
        g2d.fillRect(93 + x, 62 + y, 1, 2);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(102 + x, 49 + y, 2, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 4);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 2, 1);
        g2d.fillRect(97 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 4, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 2, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 2);
        g2d.fillRect(92 + x, 57 + y, 2, 1);
        g2d.fillRect(91 + x, 58 + y, 1, 1);
        g2d.fillRect(96 + x, 58 + y, 1, 1);
        g2d.fillRect(89 + x, 59 + y, 1, 2);
        g2d.fillRect(90 + x, 59 + y, 1, 1);
        g2d.fillRect(95 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 60 + y, 1, 1);
        g2d.fillRect(91 + x, 61 + y, 3, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(102 + x, 50 + y, 1, 4);
        g2d.fillRect(103 + x, 50 + y, 1, 4);
        g2d.fillRect(104 + x, 50 + y, 2, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 4);
        g2d.fillRect(101 + x, 51 + y, 1, 4);
        g2d.fillRect(98 + x, 52 + y, 1, 3);
        g2d.fillRect(99 + x, 52 + y, 1, 3);
        g2d.fillRect(104 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 52 + y, 1, 2);
        g2d.fillRect(97 + x, 54 + y, 1, 2);
        g2d.fillRect(96 + x, 56 + y, 1, 2);
        g2d.fillRect(94 + x, 57 + y, 1, 3);
        g2d.fillRect(95 + x, 57 + y, 1, 2);
        g2d.fillRect(92 + x, 58 + y, 1, 3);
        g2d.fillRect(93 + x, 58 + y, 1, 3);
        g2d.fillRect(91 + x, 59 + y, 1, 2);
    }

    public void paintLeftB1B(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(97 + x, 41 + y, 1, 3);
        g2d.fillRect(98 + x, 41 + y, 1, 2);
        g2d.fillRect(96 + x, 42 + y, 1, 3);
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 3);
        g2d.fillRect(97 + x, 47 + y, 1, 4);
        g2d.fillRect(93 + x, 48 + y, 1, 2);
        g2d.fillRect(92 + x, 50 + y, 1, 3);
        g2d.fillRect(96 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 50 + y, 1, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 1);
        g2d.fillRect(91 + x, 53 + y, 1, 4);
        g2d.fillRect(90 + x, 56 + y, 1, 2);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(98 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 45 + y, 1, 2);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 3);
        g2d.fillRect(94 + x, 48 + y, 1, 2);
        g2d.fillRect(93 + x, 50 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(94 + x, 52 + y, 1, 2);
        g2d.fillRect(92 + x, 53 + y, 1, 1);
        g2d.fillRect(93 + x, 54 + y, 1, 1);
        g2d.fillRect(92 + x, 55 + y, 1, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(98 + x, 44 + y, 1, 6);
        g2d.fillRect(97 + x, 45 + y, 1, 2);
        g2d.fillRect(96 + x, 46 + y, 1, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 3);
        g2d.fillRect(94 + x, 50 + y, 1, 2);
        g2d.fillRect(93 + x, 52 + y, 1, 2);
        g2d.fillRect(92 + x, 54 + y, 1, 1);
    }

    public void paintL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(60 + x, 39 + y, 1, 2);
        g2d.fillRect(61 + x, 39 + y, 6, 1);
        g2d.fillRect(67 + x, 40 + y, 2, 1);
        g2d.fillRect(99 + x, 40 + y, 4, 1);
        g2d.fillRect(59 + x, 41 + y, 1, 1);
        g2d.fillRect(64 + x, 41 + y, 1, 2);
        g2d.fillRect(69 + x, 41 + y, 3, 1);
        g2d.fillRect(97 + x, 41 + y, 2, 1);
        g2d.fillRect(60 + x, 42 + y, 1, 2);
        g2d.fillRect(63 + x, 42 + y, 1, 2);
        g2d.fillRect(65 + x, 42 + y, 1, 3);
        g2d.fillRect(72 + x, 42 + y, 3, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(62 + x, 43 + y, 1, 1);
        g2d.fillRect(68 + x, 43 + y, 2, 1);
        g2d.fillRect(75 + x, 43 + y, 2, 1);
        g2d.fillRect(92 + x, 43 + y, 3, 1);
        g2d.fillRect(61 + x, 44 + y, 1, 1);
        g2d.fillRect(67 + x, 44 + y, 1, 1);
        g2d.fillRect(70 + x, 44 + y, 2, 1);
        g2d.fillRect(77 + x, 44 + y, 3, 1);
        g2d.fillRect(89 + x, 44 + y, 3, 1);
        g2d.fillRect(66 + x, 45 + y, 1, 1);
        g2d.fillRect(72 + x, 45 + y, 2, 1);
        g2d.fillRect(80 + x, 45 + y, 2, 1);
        g2d.fillRect(74 + x, 46 + y, 2, 1);
        g2d.fillRect(82 + x, 46 + y, 2, 1);
        g2d.fillRect(87 + x, 46 + y, 2, 1);
        g2d.fillRect(76 + x, 47 + y, 1, 1);
        g2d.fillRect(84 + x, 47 + y, 3, 1);
        g2d.fillRect(97 + x, 47 + y, 2, 1);
        g2d.fillRect(77 + x, 48 + y, 2, 1);
        g2d.fillRect(95 + x, 48 + y, 2, 1);
        g2d.fillRect(79 + x, 49 + y, 2, 1);
        g2d.fillRect(92 + x, 49 + y, 3, 1);
        g2d.fillRect(81 + x, 50 + y, 1, 1);
        g2d.fillRect(89 + x, 50 + y, 3, 1);
        g2d.fillRect(82 + x, 51 + y, 2, 1);
        g2d.fillRect(88 + x, 51 + y, 1, 1);
        g2d.fillRect(84 + x, 52 + y, 4, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(62 + x, 40 + y, 1, 3);
        g2d.fillRect(60 + x, 41 + y, 2, 1);
        g2d.fillRect(63 + x, 41 + y, 1, 1);
        g2d.fillRect(65 + x, 41 + y, 1, 1);
        g2d.fillRect(66 + x, 42 + y, 1, 3);
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(61 + x, 43 + y, 1, 1);
        g2d.fillRect(67 + x, 43 + y, 1, 1);
        g2d.fillRect(70 + x, 43 + y, 1, 1);
        g2d.fillRect(74 + x, 43 + y, 1, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(96 + x, 43 + y, 1, 2);
        g2d.fillRect(72 + x, 44 + y, 1, 1);
        g2d.fillRect(75 + x, 44 + y, 2, 1);
        g2d.fillRect(92 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 44 + y, 1, 1);
        g2d.fillRect(74 + x, 45 + y, 1, 1);
        g2d.fillRect(79 + x, 45 + y, 1, 1);
        g2d.fillRect(89 + x, 45 + y, 1, 2);
        g2d.fillRect(90 + x, 45 + y, 1, 2);
        g2d.fillRect(91 + x, 45 + y, 1, 1);
        g2d.fillRect(76 + x, 46 + y, 1, 1);
        g2d.fillRect(81 + x, 46 + y, 1, 1);
        g2d.fillRect(77 + x, 47 + y, 1, 1);
        g2d.fillRect(83 + x, 47 + y, 1, 1);
        g2d.fillRect(87 + x, 47 + y, 2, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(79 + x, 48 + y, 1, 1);
        g2d.fillRect(85 + x, 48 + y, 2, 1);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(81 + x, 49 + y, 1, 1);
        g2d.fillRect(91 + x, 49 + y, 1, 1);
        g2d.fillRect(82 + x, 50 + y, 2, 1);
        g2d.fillRect(84 + x, 51 + y, 4, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(61 + x, 40 + y, 1, 1);
        g2d.fillRect(63 + x, 40 + y, 4, 1);
        g2d.fillRect(66 + x, 41 + y, 3, 1);
        g2d.fillRect(61 + x, 42 + y, 1, 1);
        g2d.fillRect(67 + x, 42 + y, 5, 1);
        g2d.fillRect(71 + x, 43 + y, 3, 1);
        g2d.fillRect(73 + x, 44 + y, 2, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 3);
        g2d.fillRect(98 + x, 44 + y, 1, 3);
        g2d.fillRect(75 + x, 45 + y, 4, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 3);
        g2d.fillRect(95 + x, 45 + y, 1, 3);
        g2d.fillRect(96 + x, 45 + y, 1, 2);
        g2d.fillRect(77 + x, 46 + y, 4, 1);
        g2d.fillRect(91 + x, 46 + y, 1, 3);
        g2d.fillRect(92 + x, 46 + y, 1, 3);
        g2d.fillRect(93 + x, 46 + y, 1, 3);
        g2d.fillRect(78 + x, 47 + y, 5, 1);
        g2d.fillRect(89 + x, 47 + y, 1, 3);
        g2d.fillRect(90 + x, 47 + y, 1, 3);
        g2d.fillRect(80 + x, 48 + y, 5, 1);
        g2d.fillRect(87 + x, 48 + y, 1, 3);
        g2d.fillRect(88 + x, 48 + y, 1, 3);
        g2d.fillRect(82 + x, 49 + y, 5, 1);
        g2d.fillRect(84 + x, 50 + y, 3, 1);
    }

    public void paintL1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 42 + y, 2, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 1);
        g2d.fillRect(91 + x, 46 + y, 2, 1);
        g2d.fillRect(90 + x, 47 + y, 1, 1);
        g2d.fillRect(89 + x, 48 + y, 1, 1);
        g2d.fillRect(88 + x, 49 + y, 1, 1);
        g2d.fillRect(86 + x, 50 + y, 2, 1);
        g2d.fillRect(84 + x, 51 + y, 2, 1);
        g2d.fillRect(93 + x, 51 + y, 6, 1);
        g2d.fillRect(82 + x, 52 + y, 2, 1);
        g2d.fillRect(91 + x, 52 + y, 2, 1);
        g2d.fillRect(76 + x, 53 + y, 6, 1);
        g2d.fillRect(90 + x, 53 + y, 1, 1);
        g2d.fillRect(70 + x, 54 + y, 6, 1);
        g2d.fillRect(89 + x, 54 + y, 1, 1);
        g2d.fillRect(67 + x, 55 + y, 3, 1);
        g2d.fillRect(87 + x, 55 + y, 2, 1);
        g2d.fillRect(64 + x, 56 + y, 3, 1);
        g2d.fillRect(84 + x, 56 + y, 3, 1);
        g2d.fillRect(63 + x, 57 + y, 1, 2);
        g2d.fillRect(80 + x, 57 + y, 4, 1);
        g2d.fillRect(69 + x, 58 + y, 1, 7);
        g2d.fillRect(70 + x, 58 + y, 10, 1);
        g2d.fillRect(62 + x, 59 + y, 1, 2);
        g2d.fillRect(61 + x, 61 + y, 1, 8);
        g2d.fillRect(66 + x, 62 + y, 2, 1);
        g2d.fillRect(65 + x, 63 + y, 1, 2);
        g2d.fillRect(67 + x, 63 + y, 1, 2);
        g2d.fillRect(64 + x, 65 + y, 1, 5);
        g2d.fillRect(68 + x, 65 + y, 1, 1);
        g2d.fillRect(62 + x, 69 + y, 2, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 43 + y, 1, 2);
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 2);
        g2d.fillRect(93 + x, 46 + y, 1, 1);
        g2d.fillRect(91 + x, 47 + y, 2, 1);
        g2d.fillRect(89 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 6, 1);
        g2d.fillRect(86 + x, 51 + y, 1, 1);
        g2d.fillRect(91 + x, 51 + y, 2, 1);
        g2d.fillRect(84 + x, 52 + y, 1, 1);
        g2d.fillRect(89 + x, 52 + y, 1, 2);
        g2d.fillRect(90 + x, 52 + y, 1, 1);
        g2d.fillRect(82 + x, 53 + y, 1, 1);
        g2d.fillRect(87 + x, 53 + y, 1, 2);
        g2d.fillRect(88 + x, 53 + y, 1, 2);
        g2d.fillRect(76 + x, 54 + y, 6, 1);
        g2d.fillRect(84 + x, 54 + y, 1, 2);
        g2d.fillRect(85 + x, 54 + y, 1, 2);
        g2d.fillRect(86 + x, 54 + y, 1, 2);
        g2d.fillRect(70 + x, 55 + y, 1, 3);
        g2d.fillRect(71 + x, 55 + y, 5, 1);
        g2d.fillRect(80 + x, 55 + y, 1, 2);
        g2d.fillRect(81 + x, 55 + y, 1, 2);
        g2d.fillRect(82 + x, 55 + y, 1, 2);
        g2d.fillRect(83 + x, 55 + y, 1, 2);
        g2d.fillRect(69 + x, 57 + y, 1, 1);
        g2d.fillRect(71 + x, 57 + y, 9, 1);
        g2d.fillRect(68 + x, 58 + y, 1, 7);
        g2d.fillRect(66 + x, 60 + y, 1, 2);
        g2d.fillRect(67 + x, 61 + y, 1, 1);
        g2d.fillRect(62 + x, 62 + y, 1, 7);
        g2d.fillRect(65 + x, 62 + y, 1, 1);
        g2d.fillRect(64 + x, 63 + y, 1, 2);
        g2d.fillRect(63 + x, 67 + y, 1, 2);


        g2d.setColor(b.fillColor);
        g2d.fillRect(97 + x, 44 + y, 1, 6);
        g2d.fillRect(98 + x, 44 + y, 1, 6);
        g2d.fillRect(96 + x, 45 + y, 1, 5);
        g2d.fillRect(95 + x, 46 + y, 1, 4);
        g2d.fillRect(93 + x, 47 + y, 1, 3);
        g2d.fillRect(94 + x, 47 + y, 1, 3);
        g2d.fillRect(90 + x, 48 + y, 1, 4);
        g2d.fillRect(91 + x, 48 + y, 1, 3);
        g2d.fillRect(92 + x, 48 + y, 1, 3);
        g2d.fillRect(88 + x, 50 + y, 1, 3);
        g2d.fillRect(89 + x, 50 + y, 1, 2);
        g2d.fillRect(87 + x, 51 + y, 1, 2);
        g2d.fillRect(85 + x, 52 + y, 1, 2);
        g2d.fillRect(86 + x, 52 + y, 1, 2);
        g2d.fillRect(83 + x, 53 + y, 1, 2);
        g2d.fillRect(84 + x, 53 + y, 1, 1);
        g2d.fillRect(82 + x, 54 + y, 1, 1);
        g2d.fillRect(76 + x, 55 + y, 1, 2);
        g2d.fillRect(77 + x, 55 + y, 1, 2);
        g2d.fillRect(78 + x, 55 + y, 1, 2);
        g2d.fillRect(79 + x, 55 + y, 1, 2);
        g2d.fillRect(67 + x, 56 + y, 1, 5);
        g2d.fillRect(68 + x, 56 + y, 1, 2);
        g2d.fillRect(69 + x, 56 + y, 1, 1);
        g2d.fillRect(71 + x, 56 + y, 5, 1);
        g2d.fillRect(64 + x, 57 + y, 1, 6);
        g2d.fillRect(65 + x, 57 + y, 1, 5);
        g2d.fillRect(66 + x, 57 + y, 1, 3);
        g2d.fillRect(63 + x, 59 + y, 1, 8);
        g2d.fillRect(62 + x, 61 + y, 1, 1);
    }

    public void paintL2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(86 + x, 41 + y, 1, 2);
        g2d.fillRect(97 + x, 41 + y, 2, 1);
        g2d.fillRect(87 + x, 42 + y, 1, 4);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 17);
        g2d.fillRect(88 + x, 46 + y, 1, 8);
        g2d.fillRect(98 + x, 52 + y, 1, 9);
        g2d.fillRect(89 + x, 54 + y, 1, 1);
        g2d.fillRect(90 + x, 55 + y, 1, 2);
        g2d.fillRect(86 + x, 57 + y, 1, 1);
        g2d.fillRect(91 + x, 57 + y, 1, 2);
        g2d.fillRect(87 + x, 58 + y, 1, 2);
        g2d.fillRect(92 + x, 59 + y, 1, 2);
        g2d.fillRect(88 + x, 60 + y, 1, 2);
        g2d.fillRect(89 + x, 61 + y, 1, 2);
        g2d.fillRect(97 + x, 61 + y, 1, 8);
        g2d.fillRect(90 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 64 + y, 1, 2);
        g2d.fillRect(92 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 66 + y, 1, 2);
        g2d.fillRect(94 + x, 68 + y, 3, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(96 + x, 43 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 18);
        g2d.fillRect(86 + x, 48 + y, 1, 4);
        g2d.fillRect(98 + x, 49 + y, 1, 3);
        g2d.fillRect(97 + x, 50 + y, 1, 11);
        g2d.fillRect(88 + x, 54 + y, 1, 1);
        g2d.fillRect(89 + x, 55 + y, 1, 1);
        g2d.fillRect(87 + x, 57 + y, 1, 1);
        g2d.fillRect(90 + x, 57 + y, 1, 1);
        g2d.fillRect(88 + x, 59 + y, 1, 1);
        g2d.fillRect(91 + x, 59 + y, 1, 1);
        g2d.fillRect(89 + x, 60 + y, 1, 1);
        g2d.fillRect(90 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 62 + y, 1, 6);
        g2d.fillRect(91 + x, 63 + y, 1, 1);
        g2d.fillRect(92 + x, 64 + y, 1, 1);
        g2d.fillRect(93 + x, 65 + y, 1, 1);
        g2d.fillRect(94 + x, 67 + y, 2, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(86 + x, 43 + y, 1, 5);
        g2d.fillRect(97 + x, 44 + y, 1, 6);
        g2d.fillRect(98 + x, 44 + y, 1, 5);
        g2d.fillRect(96 + x, 45 + y, 1, 17);
        g2d.fillRect(87 + x, 46 + y, 1, 11);
        g2d.fillRect(95 + x, 47 + y, 1, 20);
        g2d.fillRect(86 + x, 52 + y, 1, 5);
        g2d.fillRect(88 + x, 55 + y, 1, 4);
        g2d.fillRect(89 + x, 56 + y, 1, 4);
        g2d.fillRect(90 + x, 58 + y, 1, 3);
        g2d.fillRect(91 + x, 60 + y, 1, 3);
        g2d.fillRect(92 + x, 61 + y, 1, 3);
        g2d.fillRect(93 + x, 62 + y, 1, 3);
        g2d.fillRect(94 + x, 63 + y, 1, 4);
    }

    public void paint12(int x, int y, GraphicsMap g2d) {


        g2d.setColor(b.outlineColor);
        g2d.fillRect(97 + x, 41 + y, 2, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 6);
        g2d.fillRect(92 + x, 51 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 3);
        g2d.fillRect(91 + x, 54 + y, 1, 4);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(96 + x, 57 + y, 1, 1);
        g2d.fillRect(90 + x, 58 + y, 1, 4);
        g2d.fillRect(95 + x, 58 + y, 1, 2);
        g2d.fillRect(94 + x, 60 + y, 1, 5);
        g2d.fillRect(89 + x, 62 + y, 1, 4);
        g2d.fillRect(95 + x, 65 + y, 1, 1);
        g2d.fillRect(90 + x, 66 + y, 1, 1);
        g2d.fillRect(96 + x, 66 + y, 1, 1);
        g2d.fillRect(91 + x, 67 + y, 1, 1);
        g2d.fillRect(97 + x, 67 + y, 1, 1);
        g2d.fillRect(92 + x, 68 + y, 1, 1);
        g2d.fillRect(98 + x, 68 + y, 1, 1);
        g2d.fillRect(93 + x, 69 + y, 1, 1);
        g2d.fillRect(99 + x, 69 + y, 1, 1);
        g2d.fillRect(94 + x, 70 + y, 2, 1);
        g2d.fillRect(100 + x, 70 + y, 1, 1);
        g2d.fillRect(96 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 71 + y, 2, 1);
        g2d.fillRect(97 + x, 72 + y, 1, 1);
        g2d.fillRect(98 + x, 73 + y, 1, 1);
        g2d.fillRect(99 + x, 74 + y, 1, 1);
        g2d.fillRect(100 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 1);


        g2d.setColor(b.highlightColor);
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(96 + x, 43 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 8);
        g2d.fillRect(98 + x, 49 + y, 1, 3);
        g2d.fillRect(97 + x, 50 + y, 1, 5);
        g2d.fillRect(93 + x, 51 + y, 1, 4);
        g2d.fillRect(92 + x, 54 + y, 1, 4);
        g2d.fillRect(96 + x, 55 + y, 1, 2);
        g2d.fillRect(95 + x, 57 + y, 1, 1);
        g2d.fillRect(91 + x, 58 + y, 1, 4);
        g2d.fillRect(94 + x, 58 + y, 1, 2);
        g2d.fillRect(93 + x, 60 + y, 1, 5);
        g2d.fillRect(90 + x, 62 + y, 1, 4);
        g2d.fillRect(94 + x, 65 + y, 1, 1);
        g2d.fillRect(91 + x, 66 + y, 1, 1);
        g2d.fillRect(95 + x, 66 + y, 1, 1);
        g2d.fillRect(92 + x, 67 + y, 1, 1);
        g2d.fillRect(96 + x, 67 + y, 1, 1);
        g2d.fillRect(93 + x, 68 + y, 1, 1);
        g2d.fillRect(97 + x, 68 + y, 1, 1);
        g2d.fillRect(94 + x, 69 + y, 2, 1);
        g2d.fillRect(98 + x, 69 + y, 1, 1);
        g2d.fillRect(96 + x, 70 + y, 1, 1);
        g2d.fillRect(99 + x, 70 + y, 1, 1);
        g2d.fillRect(97 + x, 71 + y, 1, 1);
        g2d.fillRect(100 + x, 71 + y, 1, 1);
        g2d.fillRect(98 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 72 + y, 2, 1);
        g2d.fillRect(99 + x, 73 + y, 1, 1);
        g2d.fillRect(100 + x, 74 + y, 1, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(97 + x, 46 + y, 1, 2);
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 3);
        g2d.fillRect(95 + x, 48 + y, 1, 2);
        g2d.fillRect(95 + x, 53 + y, 1, 2);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 1, 1);
        g2d.fillRect(93 + x, 57 + y, 1, 2);
        g2d.fillRect(92 + x, 63 + y, 1, 1);
        g2d.fillRect(93 + x, 65 + y, 1, 1);
        g2d.fillRect(95 + x, 68 + y, 1, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 1);
        g2d.fillRect(99 + x, 71 + y, 1, 1);


        g2d.setColor(b.fillColor);
        g2d.fillRect(97 + x, 44 + y, 1, 2);
        g2d.fillRect(98 + x, 44 + y, 1, 2);
        g2d.fillRect(96 + x, 45 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(97 + x, 48 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 3);
        g2d.fillRect(96 + x, 50 + y, 1, 3);
        g2d.fillRect(94 + x, 53 + y, 1, 3);
        g2d.fillRect(96 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 55 + y, 1, 2);
        g2d.fillRect(95 + x, 55 + y, 1, 2);
        g2d.fillRect(94 + x, 57 + y, 1, 1);
        g2d.fillRect(92 + x, 58 + y, 1, 5);
        g2d.fillRect(93 + x, 59 + y, 1, 1);
        g2d.fillRect(91 + x, 62 + y, 1, 4);
        g2d.fillRect(92 + x, 64 + y, 1, 3);
        g2d.fillRect(93 + x, 66 + y, 1, 2);
        g2d.fillRect(94 + x, 66 + y, 1, 3);
        g2d.fillRect(95 + x, 67 + y, 1, 1);
        g2d.fillRect(96 + x, 68 + y, 1, 1);
        g2d.fillRect(97 + x, 69 + y, 1, 2);
        g2d.fillRect(98 + x, 70 + y, 1, 2);
        g2d.fillRect(99 + x, 72 + y, 2, 1);
        g2d.fillRect(100 + x, 73 + y, 2, 1);
        g2d.fillRect(101 + x, 74 + y, 1, 2);
    }
}
