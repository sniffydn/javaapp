/*
 * LongWavy1.java
 *
 * Created on March 30, 2007, 9:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package b.h;

import clts.SuperHLong;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 * part around the h that's always in front (doesn't move, probably should just cover the head and nothing else)
 * part behind that is pretty much the whole thing (moves up and down?)
 * part in the very front that moves up and down
 */
public class LongStraight7 extends SuperHLong {

    public LongStraight7() {
        super();
    }

    /** Creates a new instance of LongWavy1 */
    public LongStraight7(int step, int dir) {
        super(step, dir);
    }

    public LongStraight7(int step, int dir, ColorArray colorSwitch) {
        super(step, dir, colorSwitch);
    }

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }
    boolean originalColorArray = true;

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 35 + y, 1, 3);
        g2d.fillRect(123 + x, 35 + y, 1, 5);
        g2d.fillRect(117 + x, 37 + y, 1, 4);
        g2d.fillRect(103 + x, 38 + y, 1, 6);
        g2d.fillRect(105 + x, 38 + y, 1, 4);
        g2d.fillRect(114 + x, 38 + y, 1, 4);
        g2d.fillRect(115 + x, 38 + y, 1, 6);
        g2d.fillRect(116 + x, 39 + y, 1, 15);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(121 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 41 + y, 1, 7);
        g2d.fillRect(103 + x, 44 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 34 + y, 1, 2);
        g2d.fillRect(121 + x, 36 + y, 1, 4);
        g2d.fillRect(95 + x, 39 + y, 1, 6);
        g2d.fillRect(99 + x, 42 + y, 1, 8);
        g2d.fillRect(122 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 10);
        g2d.fillRect(102 + x, 48 + y, 1, 9);
        g2d.fillRect(96 + x, 49 + y, 1, 2);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(95 + x, 55 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 1, 2);
        g2d.fillRect(93 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 53, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 35 + y, 1, 10);
        g2d.fillRect(120 + x, 36 + y, 1, 1);
        g2d.fillRect(96 + x, 39 + y, 1, 4);
        g2d.fillRect(118 + x, 39 + y, 1, 5);
        g2d.fillRect(119 + x, 41 + y, 1, 2);
        g2d.fillRect(120 + x, 43 + y, 1, 4);
        g2d.fillRect(121 + x, 44 + y, 1, 1);
        g2d.fillRect(122 + x, 45 + y, 2, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 8);
        g2d.fillRect(97 + x, 48 + y, 1, 9);
        g2d.fillRect(119 + x, 48 + y, 1, 4);
        g2d.fillRect(121 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 4);
        g2d.fillRect(96 + x, 54 + y, 1, 3);
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(93 + x, 58 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 34 + y, 1, 2);
        g2d.fillRect(104 + x, 38 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 34 + y, 1, 2);
        g2d.fillRect(120 + x, 37 + y, 1, 1);
        g2d.fillRect(97 + x, 39 + y, 1, 3);
        g2d.fillRect(121 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 4);
        g2d.fillRect(100 + x, 45 + y, 1, 4);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 3);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(96 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 0, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 35 + y, 1, 4);
        g2d.fillRect(119 + x, 36 + y, 1, 5);
        g2d.fillRect(98 + x, 37 + y, 1, 9);
        g2d.fillRect(99 + x, 38 + y, 1, 4);
        g2d.fillRect(102 + x, 38 + y, 1, 10);
        g2d.fillRect(120 + x, 38 + y, 1, 5);
        g2d.fillRect(101 + x, 39 + y, 1, 11);
        g2d.fillRect(121 + x, 41 + y, 1, 3);
        g2d.fillRect(97 + x, 42 + y, 1, 6);
        g2d.fillRect(119 + x, 43 + y, 1, 5);
        g2d.fillRect(122 + x, 43 + y, 1, 2);
        g2d.fillRect(123 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 2);
        g2d.fillRect(95 + x, 48 + y, 1, 2);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 5);
        g2d.fillRect(121 + x, 49 + y, 1, 2);
        g2d.fillRect(93 + x, 50 + y, 1, 1);
        g2d.fillRect(122 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 2);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 3);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 3);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 3);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(122 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(96 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 20, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 35 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168, 7, 134, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177, 2, 197, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(178, 69, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 54 + y, 1, 1);
    }

    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 7 + y, 1, 1);
        g2d.fillRect(102 + x, 8 + y, 2, 1);
        g2d.fillRect(104 + x, 9 + y, 1, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 2);
        g2d.fillRect(108 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 2, 1);
        g2d.fillRect(93 + x, 14 + y, 2, 1);
        g2d.fillRect(91 + x, 15 + y, 1, 2);
        g2d.fillRect(92 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(90 + x, 16 + y, 1, 1);
        g2d.fillRect(89 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 20 + y, 1, 4);
        g2d.fillRect(110 + x, 22 + y, 1, 1);
        g2d.fillRect(112 + x, 22 + y, 1, 3);
        g2d.fillRect(91 + x, 23 + y, 1, 1);
        g2d.fillRect(113 + x, 23 + y, 1, 3);
        g2d.fillRect(114 + x, 24 + y, 1, 3);
        g2d.fillRect(88 + x, 25 + y, 1, 2);
        g2d.fillRect(95 + x, 25 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 2);
        g2d.fillRect(87 + x, 27 + y, 1, 1);
        g2d.fillRect(117 + x, 27 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 1);
        g2d.fillRect(94 + x, 29 + y, 1, 1);
        g2d.fillRect(117 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 7 + y, 3, 1);
        g2d.fillRect(104 + x, 8 + y, 1, 1);
        g2d.fillRect(105 + x, 9 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 2, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(96 + x, 23 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 7 + y, 1, 2);
        g2d.fillRect(107 + x, 8 + y, 1, 1);
        g2d.fillRect(91 + x, 9 + y, 1, 1);
        g2d.fillRect(97 + x, 9 + y, 1, 1);
        g2d.fillRect(99 + x, 9 + y, 1, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 1);
        g2d.fillRect(100 + x, 10 + y, 3, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(99 + x, 13 + y, 3, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 2, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 3);
        g2d.fillRect(95 + x, 17 + y, 1, 3);
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(93 + x, 18 + y, 1, 3);
        g2d.fillRect(92 + x, 19 + y, 1, 3);
        g2d.fillRect(91 + x, 20 + y, 1, 3);
        g2d.fillRect(90 + x, 21 + y, 1, 4);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(89 + x, 23 + y, 1, 4);
        g2d.fillRect(95 + x, 23 + y, 1, 2);
        g2d.fillRect(94 + x, 24 + y, 1, 5);
        g2d.fillRect(93 + x, 26 + y, 1, 8);
        g2d.fillRect(92 + x, 29 + y, 1, 6);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 7 + y, 2, 1);
        g2d.fillRect(105 + x, 8 + y, 1, 1);
        g2d.fillRect(106 + x, 9 + y, 2, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 3);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 2);
        g2d.fillRect(98 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 20 + y, 2, 1);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 25 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 2);
        g2d.fillRect(117 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 7 + y, 1, 1);
        g2d.fillRect(96 + x, 8 + y, 1, 1);
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 12 + y, 2, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(94 + x, 23 + y, 1, 1);
        g2d.fillRect(91 + x, 24 + y, 1, 2);
        g2d.fillRect(93 + x, 24 + y, 1, 2);
        g2d.fillRect(90 + x, 27 + y, 1, 6);
        g2d.fillRect(92 + x, 27 + y, 1, 2);
        g2d.fillRect(91 + x, 29 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 7 + y, 1, 1);
        g2d.fillRect(98 + x, 7 + y, 1, 1);
        g2d.fillRect(97 + x, 8 + y, 1, 1);
        g2d.fillRect(101 + x, 8 + y, 1, 2);
        g2d.fillRect(100 + x, 9 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 2);
        g2d.fillRect(104 + x, 10 + y, 2, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 2, 1);
        g2d.fillRect(96 + x, 19 + y, 2, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 1);
        g2d.fillRect(92 + x, 22 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 21 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 99, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 7 + y, 2, 1);
        g2d.fillRect(98 + x, 8 + y, 3, 1);
        g2d.fillRect(102 + x, 9 + y, 1, 1);
        g2d.fillRect(94 + x, 13 + y, 2, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(92 + x, 14 + y, 1, 1);
        g2d.fillRect(90 + x, 15 + y, 1, 1);
        g2d.fillRect(89 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(93 + x, 22 + y, 1, 2);
        g2d.fillRect(94 + x, 22 + y, 1, 1);
        g2d.fillRect(92 + x, 24 + y, 1, 3);
        g2d.fillRect(91 + x, 26 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 0, 54, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 9 + y, 5, 1);
        g2d.fillRect(98 + x, 9 + y, 1, 1);
        g2d.fillRect(93 + x, 10 + y, 2, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 3);
        g2d.fillRect(103 + x, 13 + y, 1, 2);
        g2d.fillRect(104 + x, 13 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 2, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 15 + y, 2, 1);
        g2d.fillRect(96 + x, 16 + y, 3, 1);
        g2d.fillRect(93 + x, 17 + y, 1, 1);
        g2d.fillRect(92 + x, 18 + y, 1, 1);
        g2d.fillRect(90 + x, 20 + y, 1, 1);
        g2d.fillRect(89 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 0, 114, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 49, 49, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(116 + x, 25 + y, 1, 1);
        g2d.fillRect(117 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 0, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 14 + y, 4, 1);
        g2d.fillRect(93 + x, 15 + y, 1, 1);
        g2d.fillRect(98 + x, 15 + y, 1, 1);
        g2d.fillRect(92 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(91 + x, 17 + y, 1, 1);
        g2d.fillRect(90 + x, 19 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 0, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 12 + y, 3, 1);
        g2d.fillRect(90 + x, 25 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 1);
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(113 + x, 26 + y, 1, 1);
        g2d.fillRect(114 + x, 27 + y, 1, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);
        g2d.fillRect(116 + x, 29 + y, 1, 1);
        g2d.fillRect(117 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 2, 155, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 10 + y, 5, 1);
        g2d.fillRect(91 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 0, 72, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 15 + y, 1, 2);
        g2d.fillRect(95 + x, 15 + y, 3, 1);
        g2d.fillRect(93 + x, 16 + y, 1, 1);
        g2d.fillRect(92 + x, 17 + y, 1, 1);
        g2d.fillRect(91 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 20, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 11 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 1, 2);
        g2d.fillRect(102 + x, 11 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(93 + x, 13 + y, 1, 1);
        g2d.fillRect(89 + x, 14 + y, 1, 1);
        g2d.fillRect(91 + x, 14 + y, 1, 1);
        g2d.fillRect(88 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 68, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 102, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 11 + y, 1, 2);
        g2d.fillRect(95 + x, 11 + y, 1, 2);
        g2d.fillRect(96 + x, 11 + y, 1, 2);
        g2d.fillRect(97 + x, 11 + y, 1, 2);
        g2d.fillRect(98 + x, 11 + y, 2, 1);
        g2d.fillRect(92 + x, 12 + y, 1, 2);
        g2d.fillRect(93 + x, 12 + y, 1, 1);
        g2d.fillRect(90 + x, 13 + y, 1, 2);
        g2d.fillRect(91 + x, 13 + y, 1, 1);
        g2d.fillRect(89 + x, 15 + y, 1, 1);
    }

    public void paintM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 13 + y, 1, 3);
        g2d.fillRect(109 + x, 13 + y, 1, 3);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 4);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 2);
        g2d.fillRect(108 + x, 18 + y, 1, 3);
        g2d.fillRect(109 + x, 18 + y, 2, 1);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(102 + x, 19 + y, 1, 2);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(110 + x, 19 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 19 + y, 3, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 21 + y, 1, 1);
        g2d.fillRect(107 + x, 21 + y, 1, 3);
        g2d.fillRect(112 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 2);
        g2d.fillRect(106 + x, 22 + y, 1, 6);
        g2d.fillRect(108 + x, 22 + y, 1, 1);
        g2d.fillRect(113 + x, 22 + y, 1, 2);
        g2d.fillRect(95 + x, 25 + y, 1, 8);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 2);
        g2d.fillRect(94 + x, 29 + y, 1, 7);
        g2d.fillRect(96 + x, 29 + y, 1, 2);
        g2d.fillRect(123 + x, 29 + y, 1, 7);
        g2d.fillRect(122 + x, 32 + y, 1, 4);
        g2d.fillRect(117 + x, 34 + y, 1, 4);
        g2d.fillRect(105 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 5);
        g2d.fillRect(115 + x, 36 + y, 1, 3);
        g2d.fillRect(114 + x, 37 + y, 1, 2);
        g2d.fillRect(103 + x, 38 + y, 1, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 1);
        g2d.fillRect(113 + x, 38 + y, 1, 2);
        g2d.fillRect(111 + x, 39 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(107 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 3);
        g2d.fillRect(103 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 2, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 3);
        g2d.fillRect(99 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 3);
        g2d.fillRect(96 + x, 26 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(99 + x, 24 + y, 1, 2);
        g2d.fillRect(98 + x, 26 + y, 1, 2);
        g2d.fillRect(97 + x, 29 + y, 1, 6);
        g2d.fillRect(102 + x, 29 + y, 1, 2);
        g2d.fillRect(96 + x, 31 + y, 1, 6);
        g2d.fillRect(95 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 2);
        g2d.fillRect(99 + x, 20 + y, 1, 3);
        g2d.fillRect(100 + x, 20 + y, 1, 2);
        g2d.fillRect(97 + x, 22 + y, 1, 2);
        g2d.fillRect(98 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 11 + y, 2, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 4);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(112 + x, 16 + y, 1, 3);
        g2d.fillRect(116 + x, 16 + y, 1, 3);
        g2d.fillRect(118 + x, 17 + y, 1, 2);
        g2d.fillRect(106 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 18 + y, 3, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 3);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 20 + y, 1, 3);
        g2d.fillRect(108 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 2, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 3);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 5);
        g2d.fillRect(116 + x, 23 + y, 1, 3);
        g2d.fillRect(119 + x, 23 + y, 1, 2);
        g2d.fillRect(123 + x, 23 + y, 1, 6);
        g2d.fillRect(117 + x, 24 + y, 1, 2);
        g2d.fillRect(121 + x, 24 + y, 1, 2);
        g2d.fillRect(118 + x, 25 + y, 1, 2);
        g2d.fillRect(122 + x, 25 + y, 1, 1);
        g2d.fillRect(105 + x, 27 + y, 1, 8);
        g2d.fillRect(121 + x, 30 + y, 1, 1);
        g2d.fillRect(122 + x, 31 + y, 1, 1);
        g2d.fillRect(105 + x, 36 + y, 1, 2);
        g2d.fillRect(103 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(103 + x, 26 + y, 1, 1);
        g2d.fillRect(119 + x, 27 + y, 2, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 7);
        g2d.fillRect(118 + x, 30 + y, 1, 2);
        g2d.fillRect(95 + x, 34 + y, 1, 6);
        g2d.fillRect(97 + x, 35 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 53, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 26 + y, 1, 1);
        g2d.fillRect(103 + x, 27 + y, 1, 3);
        g2d.fillRect(118 + x, 29 + y, 1, 1);
        g2d.fillRect(119 + x, 30 + y, 1, 4);
        g2d.fillRect(102 + x, 31 + y, 1, 2);
        g2d.fillRect(100 + x, 35 + y, 2, 1);
        g2d.fillRect(101 + x, 36 + y, 1, 1);
        g2d.fillRect(96 + x, 37 + y, 1, 3);
        g2d.fillRect(97 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(112 + x, 11 + y, 3, 1);
        g2d.fillRect(115 + x, 12 + y, 2, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(118 + x, 14 + y, 1, 3);
        g2d.fillRect(114 + x, 15 + y, 1, 3);
        g2d.fillRect(107 + x, 16 + y, 1, 2);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 20 + y, 1, 3);
        g2d.fillRect(106 + x, 20 + y, 1, 2);
        g2d.fillRect(107 + x, 20 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 2, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 2, 1);
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 3);
        g2d.fillRect(104 + x, 22 + y, 1, 1);
        g2d.fillRect(122 + x, 23 + y, 1, 2);
        g2d.fillRect(121 + x, 26 + y, 1, 4);
        g2d.fillRect(122 + x, 26 + y, 1, 5);
        g2d.fillRect(104 + x, 29 + y, 1, 1);
        g2d.fillRect(121 + x, 31 + y, 1, 4);
        g2d.fillRect(104 + x, 36 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 0, 54, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 3);
        g2d.fillRect(103 + x, 20 + y, 1, 5);
        g2d.fillRect(102 + x, 23 + y, 1, 6);
        g2d.fillRect(101 + x, 27 + y, 1, 8);
        g2d.fillRect(100 + x, 30 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 28 + y, 1, 1);
        g2d.fillRect(118 + x, 32 + y, 1, 1);
        g2d.fillRect(119 + x, 34 + y, 1, 1);
        g2d.fillRect(97 + x, 38 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 0, 114, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 22 + y, 1, 1);
        g2d.fillRect(100 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 49, 49, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 3, 1);
        g2d.fillRect(116 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 14 + y, 1, 3);
        g2d.fillRect(115 + x, 15 + y, 1, 2);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 22 + y, 1, 2);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(104 + x, 23 + y, 1, 1);
        g2d.fillRect(105 + x, 24 + y, 1, 3);
        g2d.fillRect(115 + x, 25 + y, 1, 1);
        g2d.fillRect(104 + x, 26 + y, 1, 3);
        g2d.fillRect(104 + x, 30 + y, 1, 6);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 0, 111, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 33 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 13 + y, 4, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 3);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 2);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(108 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 2);
        g2d.fillRect(107 + x, 24 + y, 1, 2);
        g2d.fillRect(117 + x, 30 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 82, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 0, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 1);
        g2d.fillRect(119 + x, 28 + y, 1, 2);
        g2d.fillRect(103 + x, 30 + y, 1, 7);
        g2d.fillRect(102 + x, 33 + y, 1, 6);
        g2d.fillRect(118 + x, 33 + y, 1, 3);
        g2d.fillRect(99 + x, 34 + y, 1, 5);
        g2d.fillRect(101 + x, 37 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 20, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 25 + y, 2, 1);
        g2d.fillRect(101 + x, 26 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 1);
        g2d.fillRect(99 + x, 32 + y, 1, 2);
        g2d.fillRect(98 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 53, 206, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 68, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 22 + y, 1, 1);
        g2d.fillRect(101 + x, 24 + y, 1, 1);
        g2d.fillRect(99 + x, 27 + y, 2, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(98 + x, 30 + y, 2, 1);
        g2d.fillRect(99 + x, 31 + y, 1, 1);
        g2d.fillRect(98 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 102, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 2);
        g2d.fillRect(98 + x, 31 + y, 1, 1);
        g2d.fillRect(98 + x, 33 + y, 1, 1);
    }

    public void paintBackB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 35 + y, 1, 3);
        g2d.fillRect(92 + x, 35 + y, 1, 5);
        g2d.fillRect(98 + x, 37 + y, 1, 4);
        g2d.fillRect(112 + x, 38 + y, 1, 6);
        g2d.fillRect(110 + x, 38 + y, 1, 4);
        g2d.fillRect(101 + x, 38 + y, 1, 4);
        g2d.fillRect(100 + x, 38 + y, 1, 6);
        g2d.fillRect(99 + x, 39 + y, 1, 15);
        g2d.fillRect(111 + x, 41 + y, 1, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 41 + y, 1, 7);
        g2d.fillRect(112 + x, 44 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 34 + y, 1, 2);
        g2d.fillRect(94 + x, 36 + y, 1, 4);
        g2d.fillRect(120 + x, 39 + y, 1, 6);
        g2d.fillRect(116 + x, 42 + y, 1, 8);
        g2d.fillRect(93 + x, 42 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 10);
        g2d.fillRect(113 + x, 48 + y, 1, 9);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 3);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 2);
        g2d.fillRect(122 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(95 + x, 57 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 53, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 35 + y, 1, 10);
        g2d.fillRect(95 + x, 36 + y, 1, 1);
        g2d.fillRect(119 + x, 39 + y, 1, 4);
        g2d.fillRect(97 + x, 39 + y, 1, 5);
        g2d.fillRect(96 + x, 41 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(94 + x, 44 + y, 1, 1);
        g2d.fillRect(92 + x, 45 + y, 2, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 8);
        g2d.fillRect(118 + x, 48 + y, 1, 9);
        g2d.fillRect(96 + x, 48 + y, 1, 4);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 49 + y, 1, 2);
        g2d.fillRect(93 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 4);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(97 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 58 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 34 + y, 1, 2);
        g2d.fillRect(111 + x, 38 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 34 + y, 1, 2);
        g2d.fillRect(95 + x, 37 + y, 1, 1);
        g2d.fillRect(118 + x, 39 + y, 1, 3);
        g2d.fillRect(94 + x, 40 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 4);
        g2d.fillRect(115 + x, 45 + y, 1, 4);
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 3);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(96 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 0, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 35 + y, 1, 4);
        g2d.fillRect(96 + x, 36 + y, 1, 5);
        g2d.fillRect(117 + x, 37 + y, 1, 9);
        g2d.fillRect(116 + x, 38 + y, 1, 4);
        g2d.fillRect(113 + x, 38 + y, 1, 10);
        g2d.fillRect(95 + x, 38 + y, 1, 5);
        g2d.fillRect(114 + x, 39 + y, 1, 11);
        g2d.fillRect(94 + x, 41 + y, 1, 3);
        g2d.fillRect(118 + x, 42 + y, 1, 6);
        g2d.fillRect(96 + x, 43 + y, 1, 5);
        g2d.fillRect(93 + x, 43 + y, 1, 2);
        g2d.fillRect(92 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 2);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 5);
        g2d.fillRect(94 + x, 49 + y, 1, 2);
        g2d.fillRect(122 + x, 50 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 2);
        g2d.fillRect(92 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(96 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(95 + x, 53 + y, 1, 3);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(122 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 3);
        g2d.fillRect(94 + x, 55 + y, 1, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 20, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 35 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168, 7, 134, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177, 2, 197, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(178, 69, 252, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 54 + y, 1, 1);
    }

    public void paintBackF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 7 + y, 1, 1);
        g2d.fillRect(112 + x, 8 + y, 2, 1);
        g2d.fillRect(111 + x, 9 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(106 + x, 11 + y, 1, 2);
        g2d.fillRect(107 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 2, 1);
        g2d.fillRect(121 + x, 14 + y, 2, 1);
        g2d.fillRect(124 + x, 15 + y, 1, 2);
        g2d.fillRect(123 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(125 + x, 16 + y, 1, 1);
        g2d.fillRect(126 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 20 + y, 1, 4);
        g2d.fillRect(105 + x, 22 + y, 1, 1);
        g2d.fillRect(103 + x, 22 + y, 1, 3);
        g2d.fillRect(124 + x, 23 + y, 1, 1);
        g2d.fillRect(102 + x, 23 + y, 1, 3);
        g2d.fillRect(101 + x, 24 + y, 1, 3);
        g2d.fillRect(127 + x, 25 + y, 1, 2);
        g2d.fillRect(120 + x, 25 + y, 1, 1);
        g2d.fillRect(100 + x, 26 + y, 1, 2);
        g2d.fillRect(128 + x, 27 + y, 1, 1);
        g2d.fillRect(98 + x, 27 + y, 1, 1);
        g2d.fillRect(99 + x, 28 + y, 1, 1);
        g2d.fillRect(121 + x, 29 + y, 1, 1);
        g2d.fillRect(98 + x, 29 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 7 + y, 3, 1);
        g2d.fillRect(111 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 14 + y, 2, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(119 + x, 23 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 7 + y, 1, 2);
        g2d.fillRect(108 + x, 8 + y, 1, 1);
        g2d.fillRect(124 + x, 9 + y, 1, 1);
        g2d.fillRect(118 + x, 9 + y, 1, 1);
        g2d.fillRect(116 + x, 9 + y, 1, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 1);
        g2d.fillRect(113 + x, 10 + y, 3, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 3, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 1);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 15 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 2, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 3);
        g2d.fillRect(120 + x, 17 + y, 1, 3);
        g2d.fillRect(119 + x, 17 + y, 1, 2);
        g2d.fillRect(118 + x, 17 + y, 1, 2);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(122 + x, 18 + y, 1, 3);
        g2d.fillRect(123 + x, 19 + y, 1, 3);
        g2d.fillRect(124 + x, 20 + y, 1, 3);
        g2d.fillRect(125 + x, 21 + y, 1, 4);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(126 + x, 23 + y, 1, 4);
        g2d.fillRect(120 + x, 23 + y, 1, 2);
        g2d.fillRect(121 + x, 24 + y, 1, 5);
        g2d.fillRect(122 + x, 26 + y, 1, 8);
        g2d.fillRect(123 + x, 29 + y, 1, 6);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 7 + y, 2, 1);
        g2d.fillRect(110 + x, 8 + y, 1, 1);
        g2d.fillRect(108 + x, 9 + y, 2, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 16 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 3);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 2);
        g2d.fillRect(117 + x, 20 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 20 + y, 2, 1);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 25 + y, 1, 1);
        g2d.fillRect(99 + x, 26 + y, 1, 2);
        g2d.fillRect(98 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 7 + y, 1, 1);
        g2d.fillRect(119 + x, 8 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 1, 1);
        g2d.fillRect(108 + x, 12 + y, 2, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(121 + x, 23 + y, 1, 1);
        g2d.fillRect(124 + x, 24 + y, 1, 2);
        g2d.fillRect(122 + x, 24 + y, 1, 2);
        g2d.fillRect(125 + x, 27 + y, 1, 6);
        g2d.fillRect(123 + x, 27 + y, 1, 2);
        g2d.fillRect(124 + x, 29 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 81, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 7 + y, 1, 1);
        g2d.fillRect(117 + x, 7 + y, 1, 1);
        g2d.fillRect(118 + x, 8 + y, 1, 1);
        g2d.fillRect(114 + x, 8 + y, 1, 2);
        g2d.fillRect(115 + x, 9 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 2);
        g2d.fillRect(110 + x, 10 + y, 2, 1);
        g2d.fillRect(109 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 17 + y, 1, 1);
        g2d.fillRect(116 + x, 18 + y, 2, 1);
        g2d.fillRect(118 + x, 19 + y, 2, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 1);
        g2d.fillRect(123 + x, 22 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 21 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 99, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 7 + y, 2, 1);
        g2d.fillRect(115 + x, 8 + y, 3, 1);
        g2d.fillRect(113 + x, 9 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 2, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(123 + x, 14 + y, 1, 1);
        g2d.fillRect(125 + x, 15 + y, 1, 1);
        g2d.fillRect(126 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 21 + y, 1, 1);
        g2d.fillRect(122 + x, 22 + y, 1, 2);
        g2d.fillRect(121 + x, 22 + y, 1, 1);
        g2d.fillRect(123 + x, 24 + y, 1, 3);
        g2d.fillRect(124 + x, 26 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 0, 54, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 9 + y, 5, 1);
        g2d.fillRect(117 + x, 9 + y, 1, 1);
        g2d.fillRect(121 + x, 10 + y, 2, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 3);
        g2d.fillRect(112 + x, 13 + y, 1, 2);
        g2d.fillRect(111 + x, 13 + y, 1, 2);
        g2d.fillRect(108 + x, 13 + y, 2, 1);
        g2d.fillRect(119 + x, 14 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(115 + x, 15 + y, 2, 1);
        g2d.fillRect(117 + x, 16 + y, 3, 1);
        g2d.fillRect(122 + x, 17 + y, 1, 1);
        g2d.fillRect(123 + x, 18 + y, 1, 1);
        g2d.fillRect(125 + x, 20 + y, 1, 1);
        g2d.fillRect(126 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 0, 114, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 11 + y, 1, 1);
        g2d.fillRect(110 + x, 12 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 49, 49, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 23 + y, 1, 1);
        g2d.fillRect(99 + x, 25 + y, 1, 1);
        g2d.fillRect(98 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 0, 44, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 14 + y, 4, 1);
        g2d.fillRect(122 + x, 15 + y, 1, 1);
        g2d.fillRect(117 + x, 15 + y, 1, 1);
        g2d.fillRect(123 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(124 + x, 17 + y, 1, 1);
        g2d.fillRect(124 + x, 19 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(38, 0, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 12 + y, 3, 1);
        g2d.fillRect(125 + x, 25 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 22 + y, 1, 1);
        g2d.fillRect(105 + x, 23 + y, 1, 1);
        g2d.fillRect(104 + x, 24 + y, 1, 1);
        g2d.fillRect(103 + x, 25 + y, 1, 1);
        g2d.fillRect(102 + x, 26 + y, 1, 1);
        g2d.fillRect(101 + x, 27 + y, 1, 1);
        g2d.fillRect(100 + x, 28 + y, 1, 1);
        g2d.fillRect(99 + x, 29 + y, 1, 1);
        g2d.fillRect(98 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 2, 155, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 10 + y, 5, 1);
        g2d.fillRect(124 + x, 12 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 0, 72, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 15 + y, 1, 2);
        g2d.fillRect(118 + x, 15 + y, 3, 1);
        g2d.fillRect(122 + x, 16 + y, 1, 1);
        g2d.fillRect(123 + x, 17 + y, 1, 1);
        g2d.fillRect(124 + x, 18 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 20, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 11 + y, 1, 1);
        g2d.fillRect(114 + x, 11 + y, 1, 2);
        g2d.fillRect(113 + x, 11 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(122 + x, 13 + y, 1, 1);
        g2d.fillRect(126 + x, 14 + y, 1, 1);
        g2d.fillRect(124 + x, 14 + y, 1, 1);
        g2d.fillRect(127 + x, 15 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 68, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(116 + x, 12 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 102, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(121 + x, 11 + y, 1, 2);
        g2d.fillRect(120 + x, 11 + y, 1, 2);
        g2d.fillRect(119 + x, 11 + y, 1, 2);
        g2d.fillRect(118 + x, 11 + y, 1, 2);
        g2d.fillRect(116 + x, 11 + y, 2, 1);
        g2d.fillRect(123 + x, 12 + y, 1, 2);
        g2d.fillRect(122 + x, 12 + y, 1, 1);
        g2d.fillRect(125 + x, 13 + y, 1, 2);
        g2d.fillRect(124 + x, 13 + y, 1, 1);
        g2d.fillRect(126 + x, 15 + y, 1, 1);
    }

    public void paintBackM(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 13 + y, 1, 3);
        g2d.fillRect(106 + x, 13 + y, 1, 3);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 4);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 2);
        g2d.fillRect(107 + x, 18 + y, 1, 3);
        g2d.fillRect(105 + x, 18 + y, 2, 1);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(113 + x, 19 + y, 1, 2);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 19 + y, 1, 1);
        g2d.fillRect(105 + x, 19 + y, 1, 2);
        g2d.fillRect(104 + x, 19 + y, 1, 2);
        g2d.fillRect(101 + x, 19 + y, 3, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 21 + y, 1, 1);
        g2d.fillRect(108 + x, 21 + y, 1, 3);
        g2d.fillRect(103 + x, 21 + y, 1, 1);
        g2d.fillRect(115 + x, 22 + y, 1, 2);
        g2d.fillRect(109 + x, 22 + y, 1, 6);
        g2d.fillRect(107 + x, 22 + y, 1, 1);
        g2d.fillRect(102 + x, 22 + y, 1, 2);
        g2d.fillRect(120 + x, 25 + y, 1, 8);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(118 + x, 27 + y, 1, 2);
        g2d.fillRect(121 + x, 29 + y, 1, 7);
        g2d.fillRect(119 + x, 29 + y, 1, 2);
        g2d.fillRect(92 + x, 29 + y, 1, 7);
        g2d.fillRect(93 + x, 32 + y, 1, 4);
        g2d.fillRect(98 + x, 34 + y, 1, 4);
        g2d.fillRect(110 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 5);
        g2d.fillRect(100 + x, 36 + y, 1, 3);
        g2d.fillRect(101 + x, 37 + y, 1, 2);
        g2d.fillRect(112 + x, 38 + y, 1, 1);
        g2d.fillRect(110 + x, 38 + y, 1, 1);
        g2d.fillRect(102 + x, 38 + y, 1, 2);
        g2d.fillRect(103 + x, 39 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 15, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 3);
        g2d.fillRect(112 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 2, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 3);
        g2d.fillRect(116 + x, 23 + y, 1, 1);
        g2d.fillRect(118 + x, 24 + y, 1, 3);
        g2d.fillRect(119 + x, 26 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(116 + x, 24 + y, 1, 2);
        g2d.fillRect(117 + x, 26 + y, 1, 2);
        g2d.fillRect(118 + x, 29 + y, 1, 6);
        g2d.fillRect(113 + x, 29 + y, 1, 2);
        g2d.fillRect(119 + x, 31 + y, 1, 6);
        g2d.fillRect(120 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 2);
        g2d.fillRect(116 + x, 20 + y, 1, 3);
        g2d.fillRect(115 + x, 20 + y, 1, 2);
        g2d.fillRect(118 + x, 22 + y, 1, 2);
        g2d.fillRect(117 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 11 + y, 2, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 14 + y, 1, 4);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(103 + x, 16 + y, 1, 3);
        g2d.fillRect(99 + x, 16 + y, 1, 3);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 3, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(106 + x, 19 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 3);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 20 + y, 1, 3);
        g2d.fillRect(107 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 21 + y, 2, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(100 + x, 22 + y, 1, 3);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 5);
        g2d.fillRect(99 + x, 23 + y, 1, 3);
        g2d.fillRect(96 + x, 23 + y, 1, 2);
        g2d.fillRect(92 + x, 23 + y, 1, 6);
        g2d.fillRect(98 + x, 24 + y, 1, 2);
        g2d.fillRect(94 + x, 24 + y, 1, 2);
        g2d.fillRect(97 + x, 25 + y, 1, 2);
        g2d.fillRect(93 + x, 25 + y, 1, 1);
        g2d.fillRect(110 + x, 27 + y, 1, 8);
        g2d.fillRect(94 + x, 30 + y, 1, 1);
        g2d.fillRect(93 + x, 31 + y, 1, 1);
        g2d.fillRect(110 + x, 36 + y, 1, 2);
        g2d.fillRect(112 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(44, 0, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(112 + x, 26 + y, 1, 1);
        g2d.fillRect(95 + x, 27 + y, 2, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 7);
        g2d.fillRect(97 + x, 30 + y, 1, 2);
        g2d.fillRect(120 + x, 34 + y, 1, 6);
        g2d.fillRect(118 + x, 35 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 53, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 26 + y, 1, 1);
        g2d.fillRect(112 + x, 27 + y, 1, 3);
        g2d.fillRect(97 + x, 29 + y, 1, 1);
        g2d.fillRect(96 + x, 30 + y, 1, 4);
        g2d.fillRect(113 + x, 31 + y, 1, 2);
        g2d.fillRect(114 + x, 35 + y, 2, 1);
        g2d.fillRect(114 + x, 36 + y, 1, 1);
        g2d.fillRect(119 + x, 37 + y, 1, 3);
        g2d.fillRect(118 + x, 37 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 11 + y, 1, 1);
        g2d.fillRect(101 + x, 11 + y, 3, 1);
        g2d.fillRect(99 + x, 12 + y, 2, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(97 + x, 14 + y, 1, 3);
        g2d.fillRect(101 + x, 15 + y, 1, 3);
        g2d.fillRect(108 + x, 16 + y, 1, 2);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 20 + y, 1, 3);
        g2d.fillRect(109 + x, 20 + y, 1, 2);
        g2d.fillRect(108 + x, 20 + y, 1, 1);
        g2d.fillRect(102 + x, 20 + y, 2, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 2, 1);
        g2d.fillRect(102 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 3);
        g2d.fillRect(111 + x, 22 + y, 1, 1);
        g2d.fillRect(93 + x, 23 + y, 1, 2);
        g2d.fillRect(94 + x, 26 + y, 1, 4);
        g2d.fillRect(93 + x, 26 + y, 1, 5);
        g2d.fillRect(111 + x, 29 + y, 1, 1);
        g2d.fillRect(94 + x, 31 + y, 1, 4);
        g2d.fillRect(111 + x, 36 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 0, 54, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 2);
        g2d.fillRect(111 + x, 19 + y, 1, 3);
        g2d.fillRect(112 + x, 20 + y, 1, 5);
        g2d.fillRect(113 + x, 23 + y, 1, 6);
        g2d.fillRect(114 + x, 27 + y, 1, 8);
        g2d.fillRect(115 + x, 30 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 0, 87, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 28 + y, 1, 1);
        g2d.fillRect(97 + x, 32 + y, 1, 1);
        g2d.fillRect(96 + x, 34 + y, 1, 1);
        g2d.fillRect(118 + x, 38 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(12, 0, 114, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 22 + y, 1, 1);
        g2d.fillRect(115 + x, 24 + y, 1, 1);
        g2d.fillRect(116 + x, 26 + y, 1, 1);
        g2d.fillRect(117 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 49, 49, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 12 + y, 1, 2);
        g2d.fillRect(101 + x, 12 + y, 3, 1);
        g2d.fillRect(99 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 14 + y, 1, 3);
        g2d.fillRect(100 + x, 15 + y, 1, 2);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 1);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 22 + y, 1, 2);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(111 + x, 23 + y, 1, 1);
        g2d.fillRect(110 + x, 24 + y, 1, 3);
        g2d.fillRect(100 + x, 25 + y, 1, 1);
        g2d.fillRect(111 + x, 26 + y, 1, 3);
        g2d.fillRect(111 + x, 30 + y, 1, 6);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(53, 0, 111, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 33 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 13 + y, 4, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 3);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 2);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 22 + y, 1, 1);
        g2d.fillRect(110 + x, 23 + y, 1, 1);
        g2d.fillRect(107 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 23 + y, 1, 1);
        g2d.fillRect(111 + x, 24 + y, 1, 2);
        g2d.fillRect(108 + x, 24 + y, 1, 2);
        g2d.fillRect(98 + x, 30 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 82, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(97 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(97 + x, 24 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 0, 139, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 25 + y, 1, 1);
        g2d.fillRect(97 + x, 27 + y, 1, 1);
        g2d.fillRect(96 + x, 28 + y, 1, 2);
        g2d.fillRect(112 + x, 30 + y, 1, 7);
        g2d.fillRect(113 + x, 33 + y, 1, 6);
        g2d.fillRect(97 + x, 33 + y, 1, 3);
        g2d.fillRect(116 + x, 34 + y, 1, 5);
        g2d.fillRect(114 + x, 37 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(71, 20, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 21 + y, 1, 1);
        g2d.fillRect(114 + x, 25 + y, 2, 1);
        g2d.fillRect(114 + x, 26 + y, 1, 1);
        g2d.fillRect(117 + x, 29 + y, 1, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 1);
        g2d.fillRect(116 + x, 32 + y, 1, 2);
        g2d.fillRect(117 + x, 35 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(104, 53, 206, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119, 68, 221, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 22 + y, 1, 1);
        g2d.fillRect(114 + x, 24 + y, 1, 1);
        g2d.fillRect(115 + x, 27 + y, 2, 1);
        g2d.fillRect(115 + x, 28 + y, 1, 1);
        g2d.fillRect(116 + x, 30 + y, 2, 1);
        g2d.fillRect(116 + x, 31 + y, 1, 1);
        g2d.fillRect(117 + x, 34 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153, 102, 255, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 23 + y, 1, 1);
        g2d.fillRect(115 + x, 26 + y, 1, 1);
        g2d.fillRect(116 + x, 28 + y, 1, 2);
        g2d.fillRect(117 + x, 31 + y, 1, 1);
        g2d.fillRect(117 + x, 33 + y, 1, 1);
    }
}
