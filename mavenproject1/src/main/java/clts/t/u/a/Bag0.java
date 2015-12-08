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
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Bag0 extends SuperTL {

    /** Creates a new instance of GenericClothes */
    public Bag0() {
        super(2);
    }

    public Bag0(int layer) {
        super(layer);
    }

    public Bag0(ColorArray colorSwitch) {
        super(2, colorSwitch);
    }

    public Bag0(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d) {

    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d) {

    }


    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryBack(offsetX, offsetY, g2d);
        paintB(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintF(offsetX, 0, g2d);
    }


    public void paintF(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(41, 41, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 90, 90, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 99, 99, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 115, 123, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(96 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 107, 107, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 123, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 140, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 83 + y, 1, 2);
        g2d.fillRect(94 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(156, 156, 156, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 198, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 206, 206, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 231, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(95 + x, 82 + y, 1, 1);
    }

    public void paintB(int x, int y, GraphicsMap g2d) {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(8, 16, 16, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(88 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 16, 16, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(80 + x, 89 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(24, 24, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(82 + x, 93 + y, 1, 1);
        g2d.fillRect(88 + x, 96 + y, 1, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 33, 33, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 82 + y, 1, 1);
        g2d.fillRect(86 + x, 83 + y, 1, 1);
        g2d.fillRect(91 + x, 83 + y, 1, 1);
        g2d.fillRect(97 + x, 83 + y, 1, 3);
        g2d.fillRect(89 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 41, 49, 255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(80 + x, 91 + y, 1, 1);
        g2d.fillRect(83 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(8, 49, 57, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(88 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 2);
        g2d.fillRect(89 + x, 97 + y, 1, 1);
        g2d.fillRect(95 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(41, 41, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(95 + x, 84 + y, 1, 2);
        g2d.fillRect(94 + x, 85 + y, 1, 1);
        g2d.fillRect(93 + x, 86 + y, 1, 1);
        g2d.fillRect(81 + x, 92 + y, 1, 1);
        g2d.fillRect(86 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(92 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 57, 57, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(85 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 49, 49, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 82 + y, 1, 1);
        g2d.fillRect(95 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(41, 57, 57, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(84 + x, 94 + y, 1, 1);
        g2d.fillRect(90 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(24, 66, 74, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(99 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(57, 57, 57, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(91 + x, 81 + y, 1, 1);
        g2d.fillRect(89 + x, 83 + y, 2, 1);
        g2d.fillRect(89 + x, 85 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 1);
        g2d.fillRect(94 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33, 74, 74, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(93 + x, 79 + y, 1, 1);
        g2d.fillRect(93 + x, 98 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(16, 82, 90, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(101 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 66, 66, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 86 + y, 1, 1);
        g2d.fillRect(93 + x, 94 + y, 1, 1);
        g2d.fillRect(91 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(24, 82, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(81 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(49, 74, 82, 255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(101 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(57, 74, 74, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(99 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 74, 74, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 81 + y, 1, 1);
        g2d.fillRect(87 + x, 83 + y, 1, 1);
        g2d.fillRect(91 + x, 85 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 2, 1);
        g2d.fillRect(97 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(81 + x, 91 + y, 1, 1);
        g2d.fillRect(93 + x, 93 + y, 1, 1);
        g2d.fillRect(85 + x, 94 + y, 1, 1);
        g2d.fillRect(93 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(41, 90, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(83 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82, 82, 82, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 81 + y, 1, 1);
        g2d.fillRect(94 + x, 86 + y, 1, 3);
        g2d.fillRect(97 + x, 89 + y, 2, 1);
        g2d.fillRect(82 + x, 92 + y, 1, 1);
        g2d.fillRect(93 + x, 92 + y, 2, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 1);
        g2d.fillRect(93 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(41, 99, 107, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(81 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 0, 0, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 87 + y, 1, 1);
        g2d.fillRect(87 + x, 88 + y, 1, 3);
        g2d.fillRect(86 + x, 89 + y, 1, 4);
        g2d.fillRect(88 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66, 99, 99, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(95 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(90, 90, 90, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 83 + y, 1, 1);
        g2d.fillRect(90 + x, 84 + y, 1, 1);
        g2d.fillRect(93 + x, 84 + y, 1, 2);
        g2d.fillRect(97 + x, 86 + y, 1, 2);
        g2d.fillRect(81 + x, 87 + y, 1, 1);
        g2d.fillRect(93 + x, 87 + y, 1, 1);
        g2d.fillRect(95 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(83 + x, 93 + y, 1, 1);
        g2d.fillRect(87 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99, 99, 99, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 82 + y, 1, 1);
        g2d.fillRect(89 + x, 84 + y, 1, 1);
        g2d.fillRect(98 + x, 85 + y, 1, 1);
        g2d.fillRect(81 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 1);
        g2d.fillRect(95 + x, 89 + y, 1, 1);
        g2d.fillRect(81 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(97 + x, 92 + y, 1, 2);
        g2d.fillRect(94 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(93 + x, 96 + y, 1, 1);
        g2d.fillRect(95 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 24, 24, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(85 + x, 88 + y, 1, 2);
        g2d.fillRect(88 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(74, 115, 123, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(96 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(107, 107, 107, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 80 + y, 1, 1);
        g2d.fillRect(91 + x, 82 + y, 1, 1);
        g2d.fillRect(92 + x, 83 + y, 1, 2);
        g2d.fillRect(88 + x, 84 + y, 1, 1);
        g2d.fillRect(90 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 1, 1);
        g2d.fillRect(95 + x, 90 + y, 1, 4);
        g2d.fillRect(96 + x, 90 + y, 1, 1);
        g2d.fillRect(97 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 2);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(89 + x, 96 + y, 1, 1);
        g2d.fillRect(92 + x, 97 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 41, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 115, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 82 + y, 1, 1);
        g2d.fillRect(84 + x, 84 + y, 1, 1);
        g2d.fillRect(92 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(94 + x, 95 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 49, 41, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115, 123, 123, 255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(82 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123, 123, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 82 + y, 1, 1);
        g2d.fillRect(90 + x, 85 + y, 1, 1);
        g2d.fillRect(92 + x, 87 + y, 1, 1);
        g2d.fillRect(95 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132, 132, 132, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 83 + y, 1, 1);
        g2d.fillRect(87 + x, 84 + y, 1, 1);
        g2d.fillRect(91 + x, 84 + y, 1, 1);
        g2d.fillRect(96 + x, 85 + y, 1, 1);
        g2d.fillRect(81 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 4);
        g2d.fillRect(93 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(88 + x, 95 + y, 1, 1);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(94 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140, 140, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(96 + x, 83 + y, 1, 2);
        g2d.fillRect(94 + x, 84 + y, 1, 1);
        g2d.fillRect(91 + x, 86 + y, 1, 2);
        g2d.fillRect(82 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132, 140, 148, 255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(92 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 90, 82, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 90 + y, 1, 1);
        g2d.fillRect(88 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148, 148, 148, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 80 + y, 1, 1);
        g2d.fillRect(85 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(83 + x, 92 + y, 1, 1);
        g2d.fillRect(84 + x, 93 + y, 1, 1);
        g2d.fillRect(96 + x, 94 + y, 2, 1);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
        g2d.fillRect(90 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(156, 156, 156, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 81 + y, 1, 1);
        g2d.fillRect(95 + x, 83 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(92 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 115, 115, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 89 + y, 1, 1);
        g2d.fillRect(87 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165, 165, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 79 + y, 1, 1);
        g2d.fillRect(91 + x, 79 + y, 1, 2);
        g2d.fillRect(89 + x, 82 + y, 1, 1);
        g2d.fillRect(82 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(93 + x, 90 + y, 1, 1);
        g2d.fillRect(86 + x, 94 + y, 1, 1);
        g2d.fillRect(92 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 123, 123, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 92 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231, 140, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(88 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(173, 173, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 79 + y, 1, 1);
        g2d.fillRect(93 + x, 83 + y, 1, 1);
        g2d.fillRect(86 + x, 84 + y, 1, 1);
        g2d.fillRect(83 + x, 85 + y, 1, 1);
        g2d.fillRect(90 + x, 86 + y, 1, 1);
        g2d.fillRect(82 + x, 90 + y, 1, 1);
        g2d.fillRect(87 + x, 94 + y, 1, 1);
        g2d.fillRect(92 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 140, 140, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(84 + x, 88 + y, 1, 1);
        g2d.fillRect(90 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181, 181, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(98 + x, 87 + y, 1, 1);
        g2d.fillRect(92 + x, 93 + y, 1, 1);
        g2d.fillRect(91 + x, 96 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189, 189, 189, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 81 + y, 1, 1);
        g2d.fillRect(92 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(89 + x, 95 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 165, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 173, 165, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(90 + x, 90 + y, 1, 1);
        g2d.fillRect(86 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(198, 198, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 80 + y, 1, 1);
        g2d.fillRect(95 + x, 81 + y, 1, 1);
        g2d.fillRect(88 + x, 85 + y, 1, 1);
        g2d.fillRect(93 + x, 88 + y, 1, 1);
        g2d.fillRect(88 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 181, 173, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(84 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(206, 206, 206, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(94 + x, 81 + y, 1, 1);
        g2d.fillRect(87 + x, 85 + y, 1, 1);
        g2d.fillRect(82 + x, 87 + y, 1, 2);
        g2d.fillRect(92 + x, 92 + y, 1, 1);
        g2d.fillRect(90 + x, 95 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 189, 181, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(85 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214, 214, 214, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(93 + x, 80 + y, 1, 1);
        g2d.fillRect(82 + x, 89 + y, 1, 1);
        g2d.fillRect(93 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 206, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 222, 214, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(89 + x, 88 + y, 1, 1);
        g2d.fillRect(84 + x, 92 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(222, 222, 222, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(89 + x, 80 + y, 1, 1);
        g2d.fillRect(92 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(83 + x, 91 + y, 1, 1);
        g2d.fillRect(89 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 214, 198, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(86 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 214, 206, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(87 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 231, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(95 + x, 82 + y, 1, 1);
        g2d.fillRect(84 + x, 85 + y, 1, 1);
        g2d.fillRect(86 + x, 85 + y, 1, 1);
        g2d.fillRect(83 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(90 + x, 88 + y, 1, 1);
        g2d.fillRect(83 + x, 90 + y, 1, 1);
        g2d.fillRect(85 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(239, 239, 239, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(92 + x, 89 + y, 1, 1);
        g2d.fillRect(92 + x, 91 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 247, 222, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(91 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 239, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(85 + x, 85 + y, 1, 2);
        g2d.fillRect(91 + x, 88 + y, 1, 1);
        g2d.fillRect(83 + x, 89 + y, 1, 1);
        g2d.fillRect(92 + x, 90 + y, 1, 1);
        g2d.fillRect(84 + x, 91 + y, 1, 1);
        g2d.fillRect(85 + x, 92 + y, 1, 1);
        g2d.fillRect(88 + x, 92 + y, 1, 2);
        g2d.fillRect(90 + x, 94 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 247, 239, 255), COLORS.get(ImageUtilities.GREY_2)));
        g2d.fillRect(84 + x, 86 + y, 1, 2);
        g2d.fillRect(91 + x, 92 + y, 1, 1);
        g2d.fillRect(89 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 231, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(89 + x, 89 + y, 1, 1);
        g2d.fillRect(91 + x, 89 + y, 1, 2);
        g2d.fillRect(90 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247, 247, 247, 255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(85 + x, 87 + y, 1, 1);
        g2d.fillRect(91 + x, 93 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 239, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(86 + x, 86 + y, 1, 1);
        g2d.fillRect(83 + x, 87 + y, 1, 1);
        g2d.fillRect(85 + x, 91 + y, 1, 1);
        g2d.fillRect(91 + x, 91 + y, 1, 1);
        g2d.fillRect(90 + x, 92 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255, 255, 247, 255), COLORS.get(ImageUtilities.GREY_6)));
        g2d.fillRect(83 + x, 88 + y, 1, 1);
        g2d.fillRect(90 + x, 89 + y, 1, 1);
        g2d.fillRect(84 + x, 90 + y, 1, 1);
        g2d.fillRect(89 + x, 92 + y, 1, 1);

    }

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }

    boolean originalColorArray = true;
}
