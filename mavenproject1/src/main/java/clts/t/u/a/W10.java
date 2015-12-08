/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class W10 extends SuperB
{

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }

    boolean originalColorArray = true;
    public W10()
    {
        super();
        includeY = true;
    }

    public W10(int layer)
    {
        super(layer);
        includeY = true;
    }

    public W10(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public W10(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryBack(offsetX, offsetY, g2d);
        if(!isIncludeY())
            offsetY = 0;
        offsetX = offsetX + shiftX;
        offsetY = offsetY + shiftY;
        paintW(offsetX + 64, offsetY + 10, g2d);
    }

    public void paintW(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(37,4,122,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(37 + x, 43 + y, 1, 6);
        g2d.fillRect(50 + x, 43 + y, 1, 6);
        g2d.fillRect(36 + x, 49 + y, 1, 2);
        g2d.fillRect(51 + x, 49 + y, 1, 2);
        g2d.fillRect(35 + x, 53 + y, 1, 1);
        g2d.fillRect(52 + x, 53 + y, 1, 1);
        g2d.fillRect(34 + x, 54 + y, 1, 2);
        g2d.fillRect(53 + x, 54 + y, 1, 2);
        g2d.fillRect(33 + x, 56 + y, 1, 3);
        g2d.fillRect(54 + x, 56 + y, 1, 3);
        g2d.fillRect(32 + x, 59 + y, 1, 2);
        g2d.fillRect(55 + x, 59 + y, 1, 2);
        g2d.fillRect(31 + x, 61 + y, 1, 1);
        g2d.fillRect(56 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(56,5,151,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(35 + x, 34 + y, 3, 1);
        g2d.fillRect(50 + x, 34 + y, 1, 9);
        g2d.fillRect(51 + x, 34 + y, 2, 1);
        g2d.fillRect(37 + x, 35 + y, 1, 8);
        g2d.fillRect(29 + x, 41 + y, 4, 1);
        g2d.fillRect(55 + x, 41 + y, 4, 1);
        g2d.fillRect(28 + x, 42 + y, 1, 1);
        g2d.fillRect(59 + x, 42 + y, 1, 1);
        g2d.fillRect(27 + x, 43 + y, 1, 1);
        g2d.fillRect(60 + x, 43 + y, 1, 1);
        g2d.fillRect(35 + x, 51 + y, 1, 2);
        g2d.fillRect(52 + x, 51 + y, 1, 2);
        g2d.fillRect(31 + x, 62 + y, 1, 1);
        g2d.fillRect(56 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(70,4,176,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(30 + x, 32 + y, 2, 1);
        g2d.fillRect(56 + x, 32 + y, 2, 1);
        g2d.fillRect(32 + x, 33 + y, 3, 1);
        g2d.fillRect(53 + x, 33 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,6,192,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(28 + x, 31 + y, 2, 1);
        g2d.fillRect(58 + x, 31 + y, 2, 1);
        g2d.fillRect(26 + x, 44 + y, 1, 1);
        g2d.fillRect(61 + x, 44 + y, 1, 1);
        g2d.fillRect(25 + x, 45 + y, 1, 1);
        g2d.fillRect(62 + x, 45 + y, 1, 1);
        g2d.fillRect(24 + x, 46 + y, 1, 1);
        g2d.fillRect(63 + x, 46 + y, 1, 1);
        g2d.fillRect(23 + x, 47 + y, 1, 1);
        g2d.fillRect(64 + x, 47 + y, 1, 1);
        g2d.fillRect(22 + x, 48 + y, 1, 1);
        g2d.fillRect(65 + x, 48 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(120,10,215,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(26 + x, 30 + y, 2, 1);
        g2d.fillRect(60 + x, 30 + y, 2, 1);
        g2d.fillRect(21 + x, 48 + y, 1, 1);
        g2d.fillRect(66 + x, 48 + y, 1, 1);
        g2d.fillRect(19 + x, 49 + y, 1, 1);
        g2d.fillRect(68 + x, 49 + y, 1, 1);
        g2d.fillRect(18 + x, 50 + y, 1, 1);
        g2d.fillRect(69 + x, 50 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(98,13,248,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(27 + x, 49 + y, 1, 2);
        g2d.fillRect(28 + x, 49 + y, 1, 2);
        g2d.fillRect(59 + x, 49 + y, 1, 2);
        g2d.fillRect(60 + x, 49 + y, 1, 2);
        g2d.fillRect(29 + x, 51 + y, 1, 1);
        g2d.fillRect(31 + x, 51 + y, 1, 2);
        g2d.fillRect(56 + x, 51 + y, 1, 2);
        g2d.fillRect(58 + x, 51 + y, 1, 1);
        g2d.fillRect(27 + x, 52 + y, 1, 4);
        g2d.fillRect(60 + x, 52 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131,29,216,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(20 + x, 49 + y, 1, 1);
        g2d.fillRect(67 + x, 49 + y, 1, 1);
        g2d.fillRect(30 + x, 63 + y, 1, 1);
        g2d.fillRect(57 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(136,9,232,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(22 + x, 28 + y, 2, 1);
        g2d.fillRect(64 + x, 28 + y, 2, 1);
        g2d.fillRect(24 + x, 29 + y, 2, 1);
        g2d.fillRect(62 + x, 29 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,16,249,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(21 + x, 31 + y, 1, 2);
        g2d.fillRect(66 + x, 31 + y, 1, 2);
        g2d.fillRect(22 + x, 32 + y, 1, 1);
        g2d.fillRect(65 + x, 32 + y, 1, 1);
        g2d.fillRect(27 + x, 48 + y, 3, 1);
        g2d.fillRect(58 + x, 48 + y, 3, 1);
        g2d.fillRect(30 + x, 49 + y, 1, 1);
        g2d.fillRect(57 + x, 49 + y, 1, 1);
        g2d.fillRect(26 + x, 50 + y, 1, 1);
        g2d.fillRect(31 + x, 50 + y, 2, 1);
        g2d.fillRect(55 + x, 50 + y, 2, 1);
        g2d.fillRect(61 + x, 50 + y, 1, 1);
        g2d.fillRect(25 + x, 51 + y, 1, 1);
        g2d.fillRect(62 + x, 51 + y, 1, 1);
        g2d.fillRect(26 + x, 52 + y, 1, 3);
        g2d.fillRect(61 + x, 52 + y, 1, 3);
        g2d.fillRect(25 + x, 53 + y, 1, 1);
        g2d.fillRect(62 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(115,32,249,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(24 + x, 54 + y, 2, 1);
        g2d.fillRect(62 + x, 54 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(132,15,250,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(21 + x, 34 + y, 1, 3);
        g2d.fillRect(23 + x, 34 + y, 1, 1);
        g2d.fillRect(64 + x, 34 + y, 1, 1);
        g2d.fillRect(66 + x, 34 + y, 1, 3);
        g2d.fillRect(22 + x, 35 + y, 1, 1);
        g2d.fillRect(65 + x, 35 + y, 1, 1);
        g2d.fillRect(27 + x, 46 + y, 1, 1);
        g2d.fillRect(60 + x, 46 + y, 1, 1);
        g2d.fillRect(28 + x, 47 + y, 2, 1);
        g2d.fillRect(58 + x, 47 + y, 2, 1);
        g2d.fillRect(31 + x, 48 + y, 1, 2);
        g2d.fillRect(56 + x, 48 + y, 1, 2);
        g2d.fillRect(26 + x, 49 + y, 1, 1);
        g2d.fillRect(32 + x, 49 + y, 1, 1);
        g2d.fillRect(55 + x, 49 + y, 1, 1);
        g2d.fillRect(61 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(149,24,226,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(17 + x, 50 + y, 1, 1);
        g2d.fillRect(70 + x, 50 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(138,26,251,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(18 + x, 29 + y, 1, 3);
        g2d.fillRect(69 + x, 29 + y, 1, 3);
        g2d.fillRect(16 + x, 30 + y, 1, 1);
        g2d.fillRect(19 + x, 30 + y, 1, 2);
        g2d.fillRect(20 + x, 30 + y, 1, 2);
        g2d.fillRect(67 + x, 30 + y, 1, 2);
        g2d.fillRect(68 + x, 30 + y, 1, 2);
        g2d.fillRect(71 + x, 30 + y, 1, 1);
        g2d.fillRect(16 + x, 32 + y, 1, 2);
        g2d.fillRect(17 + x, 32 + y, 1, 2);
        g2d.fillRect(70 + x, 32 + y, 1, 2);
        g2d.fillRect(71 + x, 32 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,16,251,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(24 + x, 34 + y, 1, 2);
        g2d.fillRect(25 + x, 34 + y, 1, 1);
        g2d.fillRect(29 + x, 34 + y, 1, 1);
        g2d.fillRect(58 + x, 34 + y, 1, 1);
        g2d.fillRect(62 + x, 34 + y, 2, 1);
        g2d.fillRect(27 + x, 35 + y, 2, 1);
        g2d.fillRect(59 + x, 35 + y, 2, 1);
        g2d.fillRect(63 + x, 35 + y, 1, 1);
        g2d.fillRect(22 + x, 36 + y, 1, 2);
        g2d.fillRect(65 + x, 36 + y, 1, 2);
        g2d.fillRect(21 + x, 37 + y, 1, 2);
        g2d.fillRect(66 + x, 37 + y, 1, 2);
        g2d.fillRect(28 + x, 45 + y, 1, 1);
        g2d.fillRect(59 + x, 45 + y, 1, 1);
        g2d.fillRect(29 + x, 46 + y, 2, 1);
        g2d.fillRect(57 + x, 46 + y, 1, 2);
        g2d.fillRect(58 + x, 46 + y, 1, 1);
        g2d.fillRect(30 + x, 47 + y, 1, 1);
        g2d.fillRect(32 + x, 47 + y, 1, 2);
        g2d.fillRect(55 + x, 47 + y, 1, 2);
        g2d.fillRect(33 + x, 48 + y, 1, 1);
        g2d.fillRect(54 + x, 48 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,15,235,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(16 + x, 10 + y, 1, 1);
        g2d.fillRect(71 + x, 10 + y, 1, 1);
        g2d.fillRect(15 + x, 11 + y, 1, 1);
        g2d.fillRect(17 + x, 11 + y, 1, 1);
        g2d.fillRect(70 + x, 11 + y, 1, 1);
        g2d.fillRect(72 + x, 11 + y, 1, 1);
        g2d.fillRect(16 + x, 12 + y, 1, 1);
        g2d.fillRect(71 + x, 12 + y, 1, 1);
        g2d.fillRect(24 + x, 15 + y, 1, 1);
        g2d.fillRect(63 + x, 15 + y, 1, 1);
        g2d.fillRect(23 + x, 16 + y, 1, 1);
        g2d.fillRect(25 + x, 16 + y, 1, 1);
        g2d.fillRect(62 + x, 16 + y, 1, 1);
        g2d.fillRect(64 + x, 16 + y, 1, 1);
        g2d.fillRect(24 + x, 17 + y, 1, 1);
        g2d.fillRect(63 + x, 17 + y, 1, 1);
        g2d.fillRect(16 + x, 36 + y, 2, 1);
        g2d.fillRect(70 + x, 36 + y, 2, 1);
        g2d.fillRect(10 + x, 43 + y, 2, 1);
        g2d.fillRect(76 + x, 43 + y, 2, 1);
        g2d.fillRect(12 + x, 44 + y, 1, 1);
        g2d.fillRect(75 + x, 44 + y, 1, 1);
        g2d.fillRect(13 + x, 45 + y, 1, 1);
        g2d.fillRect(74 + x, 45 + y, 1, 1);
        g2d.fillRect(6 + x, 65 + y, 1, 1);
        g2d.fillRect(81 + x, 65 + y, 1, 1);
        g2d.fillRect(5 + x, 66 + y, 1, 1);
        g2d.fillRect(7 + x, 66 + y, 1, 1);
        g2d.fillRect(80 + x, 66 + y, 1, 1);
        g2d.fillRect(82 + x, 66 + y, 1, 1);
        g2d.fillRect(6 + x, 67 + y, 1, 1);
        g2d.fillRect(9 + x, 67 + y, 1, 1);
        g2d.fillRect(78 + x, 67 + y, 1, 1);
        g2d.fillRect(81 + x, 67 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(147,47,228,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(29 + x, 64 + y, 1, 1);
        g2d.fillRect(58 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,0,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, 16 + y, 1, 1);
        g2d.fillRect(81 + x, 16 + y, 1, 1);
        g2d.fillRect(33 + x, 55 + y, 1, 1);
        g2d.fillRect(54 + x, 55 + y, 1, 1);
        g2d.fillRect(32 + x, 56 + y, 1, 3);
        g2d.fillRect(55 + x, 56 + y, 1, 3);
        g2d.fillRect(31 + x, 59 + y, 1, 1);
        g2d.fillRect(56 + x, 59 + y, 1, 1);
        g2d.fillRect(30 + x, 61 + y, 1, 1);
        g2d.fillRect(57 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,54,203,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(36 + x, 35 + y, 1, 4);
        g2d.fillRect(51 + x, 35 + y, 1, 4);
        g2d.fillRect(30 + x, 40 + y, 6, 1);
        g2d.fillRect(52 + x, 40 + y, 6, 1);
        g2d.fillRect(36 + x, 41 + y, 1, 4);
        g2d.fillRect(51 + x, 41 + y, 1, 4);
        g2d.fillRect(36 + x, 46 + y, 1, 2);
        g2d.fillRect(51 + x, 46 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,24,237,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(13 + x, 46 + y, 1, 1);
        g2d.fillRect(74 + x, 46 + y, 1, 1);
        g2d.fillRect(16 + x, 50 + y, 1, 1);
        g2d.fillRect(71 + x, 50 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,25,252,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(15 + x, 32 + y, 1, 2);
        g2d.fillRect(20 + x, 32 + y, 1, 1);
        g2d.fillRect(67 + x, 32 + y, 1, 1);
        g2d.fillRect(72 + x, 32 + y, 1, 2);
        g2d.fillRect(14 + x, 33 + y, 1, 1);
        g2d.fillRect(73 + x, 33 + y, 1, 1);
        g2d.fillRect(18 + x, 34 + y, 1, 2);
        g2d.fillRect(19 + x, 34 + y, 1, 2);
        g2d.fillRect(20 + x, 34 + y, 1, 1);
        g2d.fillRect(67 + x, 34 + y, 3, 1);
        g2d.fillRect(68 + x, 35 + y, 2, 1);
        g2d.fillRect(10 + x, 39 + y, 1, 1);
        g2d.fillRect(77 + x, 39 + y, 1, 1);
        g2d.fillRect(11 + x, 40 + y, 1, 1);
        g2d.fillRect(76 + x, 40 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,21,253,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(21 + x, 27 + y, 1, 1);
        g2d.fillRect(66 + x, 27 + y, 1, 1);
        g2d.fillRect(20 + x, 35 + y, 1, 1);
        g2d.fillRect(25 + x, 35 + y, 1, 2);
        g2d.fillRect(26 + x, 35 + y, 1, 1);
        g2d.fillRect(29 + x, 35 + y, 1, 2);
        g2d.fillRect(30 + x, 35 + y, 1, 2);
        g2d.fillRect(31 + x, 35 + y, 1, 1);
        g2d.fillRect(56 + x, 35 + y, 3, 1);
        g2d.fillRect(61 + x, 35 + y, 2, 1);
        g2d.fillRect(67 + x, 35 + y, 1, 1);
        g2d.fillRect(24 + x, 36 + y, 1, 1);
        g2d.fillRect(27 + x, 36 + y, 1, 2);
        g2d.fillRect(28 + x, 36 + y, 1, 2);
        g2d.fillRect(57 + x, 36 + y, 4, 1);
        g2d.fillRect(62 + x, 36 + y, 2, 1);
        g2d.fillRect(23 + x, 37 + y, 1, 2);
        g2d.fillRect(59 + x, 37 + y, 2, 1);
        g2d.fillRect(64 + x, 37 + y, 1, 2);
        g2d.fillRect(22 + x, 38 + y, 1, 1);
        g2d.fillRect(65 + x, 38 + y, 1, 1);
        g2d.fillRect(12 + x, 40 + y, 1, 2);
        g2d.fillRect(21 + x, 40 + y, 1, 1);
        g2d.fillRect(66 + x, 40 + y, 1, 1);
        g2d.fillRect(75 + x, 40 + y, 1, 2);
        g2d.fillRect(31 + x, 45 + y, 1, 2);
        g2d.fillRect(56 + x, 45 + y, 1, 2);
        g2d.fillRect(33 + x, 47 + y, 1, 1);
        g2d.fillRect(54 + x, 47 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,63,224,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(20 + x, 50 + y, 1, 1);
        g2d.fillRect(67 + x, 50 + y, 1, 1);
        g2d.fillRect(19 + x, 53 + y, 1, 1);
        g2d.fillRect(68 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(150,39,252,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(16 + x, 29 + y, 1, 1);
        g2d.fillRect(71 + x, 29 + y, 1, 1);
        g2d.fillRect(14 + x, 31 + y, 1, 2);
        g2d.fillRect(15 + x, 31 + y, 1, 1);
        g2d.fillRect(72 + x, 31 + y, 2, 1);
        g2d.fillRect(13 + x, 32 + y, 1, 2);
        g2d.fillRect(73 + x, 32 + y, 2, 1);
        g2d.fillRect(12 + x, 33 + y, 1, 1);
        g2d.fillRect(74 + x, 33 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(183,19,241,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 36 + y, 2, 1);
        g2d.fillRect(72 + x, 36 + y, 2, 1);
        g2d.fillRect(8 + x, 42 + y, 2, 1);
        g2d.fillRect(78 + x, 42 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(188,8,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, 15 + y, 1, 1);
        g2d.fillRect(81 + x, 15 + y, 1, 1);
        g2d.fillRect(28 + x, 32 + y, 1, 2);
        g2d.fillRect(29 + x, 32 + y, 1, 1);
        g2d.fillRect(58 + x, 32 + y, 2, 1);
        g2d.fillRect(59 + x, 33 + y, 1, 1);
        g2d.fillRect(33 + x, 54 + y, 1, 1);
        g2d.fillRect(54 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(134,71,251,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(24 + x, 24 + y, 1, 1);
        g2d.fillRect(63 + x, 24 + y, 1, 1);
        g2d.fillRect(24 + x, 56 + y, 2, 1);
        g2d.fillRect(62 + x, 56 + y, 1, 2);
        g2d.fillRect(63 + x, 56 + y, 1, 1);
        g2d.fillRect(25 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(181,23,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(31 + x, 31 + y, 2, 1);
        g2d.fillRect(55 + x, 31 + y, 1, 2);
        g2d.fillRect(56 + x, 31 + y, 1, 1);
        g2d.fillRect(32 + x, 32 + y, 1, 1);
        g2d.fillRect(32 + x, 35 + y, 1, 2);
        g2d.fillRect(34 + x, 35 + y, 1, 3);
        g2d.fillRect(53 + x, 35 + y, 1, 3);
        g2d.fillRect(55 + x, 35 + y, 1, 2);
        g2d.fillRect(26 + x, 36 + y, 1, 2);
        g2d.fillRect(31 + x, 36 + y, 1, 1);
        g2d.fillRect(56 + x, 36 + y, 1, 1);
        g2d.fillRect(61 + x, 36 + y, 1, 2);
        g2d.fillRect(20 + x, 37 + y, 1, 1);
        g2d.fillRect(29 + x, 37 + y, 1, 1);
        g2d.fillRect(33 + x, 37 + y, 1, 1);
        g2d.fillRect(54 + x, 37 + y, 1, 1);
        g2d.fillRect(58 + x, 37 + y, 1, 1);
        g2d.fillRect(67 + x, 37 + y, 1, 1);
        g2d.fillRect(24 + x, 38 + y, 1, 1);
        g2d.fillRect(30 + x, 38 + y, 2, 1);
        g2d.fillRect(56 + x, 38 + y, 2, 1);
        g2d.fillRect(63 + x, 38 + y, 1, 1);
        g2d.fillRect(18 + x, 39 + y, 1, 1);
        g2d.fillRect(23 + x, 39 + y, 1, 1);
        g2d.fillRect(27 + x, 39 + y, 2, 1);
        g2d.fillRect(59 + x, 39 + y, 2, 1);
        g2d.fillRect(64 + x, 39 + y, 1, 1);
        g2d.fillRect(69 + x, 39 + y, 1, 1);
        g2d.fillRect(16 + x, 40 + y, 1, 1);
        g2d.fillRect(22 + x, 40 + y, 1, 1);
        g2d.fillRect(65 + x, 40 + y, 1, 1);
        g2d.fillRect(71 + x, 40 + y, 1, 1);
        g2d.fillRect(21 + x, 41 + y, 1, 1);
        g2d.fillRect(66 + x, 41 + y, 1, 1);
        g2d.fillRect(31 + x, 43 + y, 1, 1);
        g2d.fillRect(56 + x, 43 + y, 1, 1);
        g2d.fillRect(30 + x, 44 + y, 1, 1);
        g2d.fillRect(32 + x, 44 + y, 1, 2);
        g2d.fillRect(55 + x, 44 + y, 1, 2);
        g2d.fillRect(57 + x, 44 + y, 1, 1);
        g2d.fillRect(33 + x, 45 + y, 2, 1);
        g2d.fillRect(53 + x, 45 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201,9,251,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(26 + x, 27 + y, 2, 1);
        g2d.fillRect(60 + x, 27 + y, 2, 1);
        g2d.fillRect(28 + x, 28 + y, 2, 1);
        g2d.fillRect(58 + x, 28 + y, 2, 1);
        g2d.fillRect(30 + x, 29 + y, 1, 1);
        g2d.fillRect(57 + x, 29 + y, 1, 1);
        g2d.fillRect(31 + x, 30 + y, 2, 1);
        g2d.fillRect(55 + x, 30 + y, 2, 1);
        g2d.fillRect(33 + x, 31 + y, 1, 2);
        g2d.fillRect(54 + x, 31 + y, 1, 2);
        g2d.fillRect(27 + x, 33 + y, 1, 1);
        g2d.fillRect(60 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(161,79,228,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(19 + x, 54 + y, 1, 1);
        g2d.fillRect(68 + x, 54 + y, 1, 1);
        g2d.fillRect(18 + x, 59 + y, 1, 1);
        g2d.fillRect(69 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(184,32,252,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(30 + x, 31 + y, 1, 1);
        g2d.fillRect(57 + x, 31 + y, 1, 1);
        g2d.fillRect(11 + x, 39 + y, 1, 1);
        g2d.fillRect(20 + x, 39 + y, 1, 1);
        g2d.fillRect(67 + x, 39 + y, 1, 1);
        g2d.fillRect(76 + x, 39 + y, 1, 1);
        g2d.fillRect(13 + x, 40 + y, 3, 1);
        g2d.fillRect(19 + x, 40 + y, 1, 1);
        g2d.fillRect(24 + x, 40 + y, 1, 1);
        g2d.fillRect(63 + x, 40 + y, 1, 1);
        g2d.fillRect(68 + x, 40 + y, 1, 1);
        g2d.fillRect(72 + x, 40 + y, 3, 1);
        g2d.fillRect(17 + x, 41 + y, 1, 2);
        g2d.fillRect(18 + x, 41 + y, 1, 1);
        g2d.fillRect(23 + x, 41 + y, 1, 1);
        g2d.fillRect(64 + x, 41 + y, 1, 1);
        g2d.fillRect(69 + x, 41 + y, 2, 1);
        g2d.fillRect(7 + x, 42 + y, 1, 1);
        g2d.fillRect(13 + x, 42 + y, 4, 1);
        g2d.fillRect(21 + x, 42 + y, 1, 1);
        g2d.fillRect(66 + x, 42 + y, 1, 1);
        g2d.fillRect(70 + x, 42 + y, 5, 1);
        g2d.fillRect(80 + x, 42 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(208,12,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(26 + x, 33 + y, 1, 1);
        g2d.fillRect(61 + x, 33 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,84,229,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(20 + x, 51 + y, 1, 1);
        g2d.fillRect(67 + x, 51 + y, 1, 1);
        g2d.fillRect(19 + x, 55 + y, 1, 1);
        g2d.fillRect(68 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(159,67,252,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(15 + x, 28 + y, 1, 2);
        g2d.fillRect(72 + x, 28 + y, 1, 2);
        g2d.fillRect(14 + x, 29 + y, 1, 1);
        g2d.fillRect(73 + x, 29 + y, 1, 1);
        g2d.fillRect(13 + x, 30 + y, 1, 1);
        g2d.fillRect(74 + x, 30 + y, 1, 1);
        g2d.fillRect(11 + x, 32 + y, 2, 1);
        g2d.fillRect(75 + x, 32 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(197,27,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(19 + x, 26 + y, 2, 1);
        g2d.fillRect(67 + x, 26 + y, 2, 1);
        g2d.fillRect(30 + x, 34 + y, 4, 1);
        g2d.fillRect(54 + x, 34 + y, 4, 1);
        g2d.fillRect(11 + x, 35 + y, 1, 1);
        g2d.fillRect(76 + x, 35 + y, 1, 1);
        g2d.fillRect(13 + x, 36 + y, 1, 1);
        g2d.fillRect(74 + x, 36 + y, 1, 1);
        g2d.fillRect(26 + x, 39 + y, 1, 2);
        g2d.fillRect(61 + x, 39 + y, 1, 2);
        g2d.fillRect(24 + x, 41 + y, 1, 1);
        g2d.fillRect(63 + x, 41 + y, 1, 1);
        g2d.fillRect(23 + x, 42 + y, 1, 1);
        g2d.fillRect(64 + x, 42 + y, 1, 1);
        g2d.fillRect(22 + x, 43 + y, 1, 1);
        g2d.fillRect(33 + x, 43 + y, 1, 2);
        g2d.fillRect(54 + x, 43 + y, 1, 2);
        g2d.fillRect(65 + x, 43 + y, 1, 1);
        g2d.fillRect(34 + x, 44 + y, 1, 1);
        g2d.fillRect(53 + x, 44 + y, 1, 1);
        g2d.fillRect(30 + x, 62 + y, 1, 1);
        g2d.fillRect(57 + x, 62 + y, 1, 1);
        g2d.fillRect(29 + x, 63 + y, 1, 1);
        g2d.fillRect(58 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(190,50,245,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, 41 + y, 1, 1);
        g2d.fillRect(81 + x, 41 + y, 1, 1);
        g2d.fillRect(15 + x, 51 + y, 1, 1);
        g2d.fillRect(72 + x, 51 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(177,71,239,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(28 + x, 65 + y, 1, 1);
        g2d.fillRect(59 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229,4,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(2 + x, 26 + y, 1, 1);
        g2d.fillRect(85 + x, 26 + y, 1, 1);
        g2d.fillRect(4 + x, 31 + y, 1, 1);
        g2d.fillRect(83 + x, 31 + y, 1, 1);
        g2d.fillRect(6 + x, 40 + y, 1, 1);
        g2d.fillRect(81 + x, 40 + y, 1, 1);
        g2d.fillRect(8 + x, 41 + y, 2, 1);
        g2d.fillRect(78 + x, 41 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(200,37,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(29 + x, 30 + y, 2, 1);
        g2d.fillRect(57 + x, 30 + y, 2, 1);
        g2d.fillRect(35 + x, 35 + y, 1, 3);
        g2d.fillRect(52 + x, 35 + y, 1, 3);
        g2d.fillRect(20 + x, 40 + y, 1, 3);
        g2d.fillRect(67 + x, 40 + y, 1, 3);
        g2d.fillRect(19 + x, 41 + y, 1, 1);
        g2d.fillRect(68 + x, 41 + y, 1, 1);
        g2d.fillRect(18 + x, 42 + y, 1, 3);
        g2d.fillRect(69 + x, 42 + y, 1, 3);
        g2d.fillRect(15 + x, 43 + y, 3, 1);
        g2d.fillRect(19 + x, 43 + y, 1, 1);
        g2d.fillRect(68 + x, 43 + y, 1, 1);
        g2d.fillRect(70 + x, 43 + y, 1, 2);
        g2d.fillRect(71 + x, 43 + y, 2, 1);
        g2d.fillRect(17 + x, 44 + y, 1, 1);
        g2d.fillRect(34 + x, 53 + y, 1, 1);
        g2d.fillRect(53 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(214,29,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(17 + x, 24 + y, 1, 1);
        g2d.fillRect(70 + x, 24 + y, 1, 1);
        g2d.fillRect(18 + x, 25 + y, 1, 1);
        g2d.fillRect(69 + x, 25 + y, 1, 1);
        g2d.fillRect(24 + x, 32 + y, 2, 1);
        g2d.fillRect(62 + x, 32 + y, 2, 1);
        g2d.fillRect(22 + x, 47 + y, 1, 1);
        g2d.fillRect(65 + x, 47 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,95,233,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(20 + x, 52 + y, 1, 1);
        g2d.fillRect(67 + x, 52 + y, 1, 1);
        g2d.fillRect(19 + x, 56 + y, 1, 2);
        g2d.fillRect(68 + x, 56 + y, 1, 2);
        g2d.fillRect(18 + x, 60 + y, 1, 1);
        g2d.fillRect(69 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(152,101,251,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(24 + x, 57 + y, 1, 1);
        g2d.fillRect(63 + x, 57 + y, 1, 1);
        g2d.fillRect(25 + x, 58 + y, 1, 1);
        g2d.fillRect(62 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,87,252,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 28 + y, 1, 1);
        g2d.fillRect(73 + x, 28 + y, 1, 1);
        g2d.fillRect(11 + x, 31 + y, 1, 1);
        g2d.fillRect(76 + x, 31 + y, 1, 1);
        g2d.fillRect(10 + x, 32 + y, 1, 1);
        g2d.fillRect(77 + x, 32 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(215,41,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(16 + x, 24 + y, 1, 1);
        g2d.fillRect(71 + x, 24 + y, 1, 1);
        g2d.fillRect(25 + x, 26 + y, 1, 1);
        g2d.fillRect(62 + x, 26 + y, 1, 1);
        g2d.fillRect(26 + x, 31 + y, 1, 1);
        g2d.fillRect(61 + x, 31 + y, 1, 1);
        g2d.fillRect(4 + x, 32 + y, 2, 1);
        g2d.fillRect(82 + x, 32 + y, 2, 1);
        g2d.fillRect(6 + x, 33 + y, 1, 1);
        g2d.fillRect(81 + x, 33 + y, 1, 1);
        g2d.fillRect(8 + x, 34 + y, 1, 1);
        g2d.fillRect(79 + x, 34 + y, 1, 1);
        g2d.fillRect(34 + x, 38 + y, 1, 1);
        g2d.fillRect(53 + x, 38 + y, 1, 1);
        g2d.fillRect(20 + x, 43 + y, 1, 1);
        g2d.fillRect(67 + x, 43 + y, 1, 1);
        g2d.fillRect(19 + x, 44 + y, 1, 1);
        g2d.fillRect(68 + x, 44 + y, 1, 1);
        g2d.fillRect(22 + x, 49 + y, 1, 1);
        g2d.fillRect(65 + x, 49 + y, 1, 1);
        g2d.fillRect(28 + x, 64 + y, 1, 1);
        g2d.fillRect(59 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,242,25,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(30 + x, 58 + y, 1, 3);
        g2d.fillRect(57 + x, 58 + y, 1, 3);
        g2d.fillRect(29 + x, 60 + y, 1, 1);
        g2d.fillRect(31 + x, 60 + y, 1, 1);
        g2d.fillRect(56 + x, 60 + y, 1, 1);
        g2d.fillRect(58 + x, 60 + y, 1, 1);
        g2d.fillRect(28 + x, 61 + y, 1, 1);
        g2d.fillRect(59 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(234,36,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(2 + x, 22 + y, 1, 1);
        g2d.fillRect(85 + x, 22 + y, 1, 1);
        g2d.fillRect(3 + x, 24 + y, 1, 2);
        g2d.fillRect(84 + x, 24 + y, 1, 2);
        g2d.fillRect(5 + x, 31 + y, 1, 1);
        g2d.fillRect(82 + x, 31 + y, 1, 1);
        g2d.fillRect(7 + x, 41 + y, 1, 1);
        g2d.fillRect(80 + x, 41 + y, 1, 1);
        g2d.fillRect(12 + x, 43 + y, 1, 1);
        g2d.fillRect(75 + x, 43 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(220,51,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, 14 + y, 1, 1);
        g2d.fillRect(80 + x, 14 + y, 1, 1);
        g2d.fillRect(1 + x, 20 + y, 1, 1);
        g2d.fillRect(86 + x, 20 + y, 1, 1);
        g2d.fillRect(15 + x, 23 + y, 1, 1);
        g2d.fillRect(72 + x, 23 + y, 1, 1);
        g2d.fillRect(22 + x, 29 + y, 2, 1);
        g2d.fillRect(26 + x, 29 + y, 2, 1);
        g2d.fillRect(60 + x, 29 + y, 2, 1);
        g2d.fillRect(64 + x, 29 + y, 2, 1);
        g2d.fillRect(24 + x, 30 + y, 2, 1);
        g2d.fillRect(62 + x, 30 + y, 2, 1);
        g2d.fillRect(23 + x, 31 + y, 1, 1);
        g2d.fillRect(64 + x, 31 + y, 1, 1);
        g2d.fillRect(35 + x, 38 + y, 1, 1);
        g2d.fillRect(52 + x, 38 + y, 1, 1);
        g2d.fillRect(28 + x, 41 + y, 1, 1);
        g2d.fillRect(59 + x, 41 + y, 1, 1);
        g2d.fillRect(27 + x, 42 + y, 1, 1);
        g2d.fillRect(60 + x, 42 + y, 1, 1);
        g2d.fillRect(26 + x, 43 + y, 1, 1);
        g2d.fillRect(28 + x, 43 + y, 1, 1);
        g2d.fillRect(59 + x, 43 + y, 1, 1);
        g2d.fillRect(61 + x, 43 + y, 1, 1);
        g2d.fillRect(25 + x, 44 + y, 1, 1);
        g2d.fillRect(27 + x, 44 + y, 1, 1);
        g2d.fillRect(60 + x, 44 + y, 1, 1);
        g2d.fillRect(62 + x, 44 + y, 1, 1);
        g2d.fillRect(21 + x, 47 + y, 1, 1);
        g2d.fillRect(66 + x, 47 + y, 1, 1);
        g2d.fillRect(23 + x, 48 + y, 1, 1);
        g2d.fillRect(64 + x, 48 + y, 1, 1);
        g2d.fillRect(31 + x, 54 + y, 1, 1);
        g2d.fillRect(56 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,106,253,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(17 + x, 16 + y, 1, 1);
        g2d.fillRect(70 + x, 16 + y, 1, 1);
        g2d.fillRect(18 + x, 17 + y, 1, 1);
        g2d.fillRect(69 + x, 17 + y, 1, 1);
        g2d.fillRect(17 + x, 18 + y, 1, 1);
        g2d.fillRect(70 + x, 18 + y, 1, 1);
        g2d.fillRect(14 + x, 27 + y, 1, 1);
        g2d.fillRect(73 + x, 27 + y, 1, 1);
        g2d.fillRect(13 + x, 28 + y, 1, 1);
        g2d.fillRect(74 + x, 28 + y, 1, 1);
        g2d.fillRect(10 + x, 31 + y, 1, 1);
        g2d.fillRect(77 + x, 31 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(182,115,237,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(19 + x, 58 + y, 1, 1);
        g2d.fillRect(68 + x, 58 + y, 1, 1);
        g2d.fillRect(18 + x, 61 + y, 1, 1);
        g2d.fillRect(69 + x, 61 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(203,87,249,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 47 + y, 1, 1);
        g2d.fillRect(73 + x, 47 + y, 1, 1);
        g2d.fillRect(13 + x, 49 + y, 1, 1);
        g2d.fillRect(74 + x, 49 + y, 1, 1);
        g2d.fillRect(14 + x, 51 + y, 1, 1);
        g2d.fillRect(73 + x, 51 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228,76,236,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, 17 + y, 1, 1);
        g2d.fillRect(87 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,248,37,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(28 + x, 56 + y, 2, 1);
        g2d.fillRect(58 + x, 56 + y, 1, 2);
        g2d.fillRect(59 + x, 56 + y, 1, 1);
        g2d.fillRect(29 + x, 57 + y, 1, 1);
        g2d.fillRect(27 + x, 61 + y, 1, 1);
        g2d.fillRect(60 + x, 61 + y, 1, 1);
        g2d.fillRect(26 + x, 62 + y, 1, 1);
        g2d.fillRect(61 + x, 62 + y, 1, 1);
        g2d.fillRect(25 + x, 63 + y, 1, 1);
        g2d.fillRect(62 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(165,126,251,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(24 + x, 58 + y, 1, 1);
        g2d.fillRect(63 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(229,60,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(8 + x, 20 + y, 1, 1);
        g2d.fillRect(79 + x, 20 + y, 1, 1);
        g2d.fillRect(12 + x, 22 + y, 3, 1);
        g2d.fillRect(73 + x, 22 + y, 3, 1);
        g2d.fillRect(3 + x, 23 + y, 1, 1);
        g2d.fillRect(84 + x, 23 + y, 1, 1);
        g2d.fillRect(23 + x, 25 + y, 2, 1);
        g2d.fillRect(63 + x, 25 + y, 2, 1);
        g2d.fillRect(21 + x, 28 + y, 1, 1);
        g2d.fillRect(66 + x, 28 + y, 1, 1);
        g2d.fillRect(21 + x, 30 + y, 1, 1);
        g2d.fillRect(66 + x, 30 + y, 1, 1);
        g2d.fillRect(3 + x, 31 + y, 1, 1);
        g2d.fillRect(84 + x, 31 + y, 1, 1);
        g2d.fillRect(33 + x, 39 + y, 1, 1);
        g2d.fillRect(54 + x, 39 + y, 1, 1);
        g2d.fillRect(29 + x, 42 + y, 1, 1);
        g2d.fillRect(58 + x, 42 + y, 1, 1);
        g2d.fillRect(28 + x, 44 + y, 1, 1);
        g2d.fillRect(59 + x, 44 + y, 1, 1);
        g2d.fillRect(26 + x, 45 + y, 2, 1);
        g2d.fillRect(60 + x, 45 + y, 2, 1);
        g2d.fillRect(25 + x, 46 + y, 1, 1);
        g2d.fillRect(62 + x, 46 + y, 1, 1);
        g2d.fillRect(20 + x, 48 + y, 1, 1);
        g2d.fillRect(67 + x, 48 + y, 1, 1);
        g2d.fillRect(34 + x, 51 + y, 1, 1);
        g2d.fillRect(53 + x, 51 + y, 1, 1);
        g2d.fillRect(30 + x, 55 + y, 1, 1);
        g2d.fillRect(57 + x, 55 + y, 1, 1);
        g2d.fillRect(31 + x, 58 + y, 1, 1);
        g2d.fillRect(56 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223,71,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(24 + x, 28 + y, 1, 1);
        g2d.fillRect(27 + x, 28 + y, 1, 1);
        g2d.fillRect(60 + x, 28 + y, 1, 1);
        g2d.fillRect(63 + x, 28 + y, 1, 1);
        g2d.fillRect(6 + x, 34 + y, 2, 1);
        g2d.fillRect(80 + x, 34 + y, 2, 1);
        g2d.fillRect(29 + x, 39 + y, 1, 2);
        g2d.fillRect(30 + x, 39 + y, 3, 1);
        g2d.fillRect(55 + x, 39 + y, 4, 1);
        g2d.fillRect(58 + x, 40 + y, 1, 1);
        g2d.fillRect(33 + x, 41 + y, 1, 1);
        g2d.fillRect(54 + x, 41 + y, 1, 1);
        g2d.fillRect(31 + x, 42 + y, 2, 1);
        g2d.fillRect(34 + x, 42 + y, 1, 2);
        g2d.fillRect(35 + x, 42 + y, 1, 3);
        g2d.fillRect(52 + x, 42 + y, 1, 3);
        g2d.fillRect(53 + x, 42 + y, 1, 2);
        g2d.fillRect(55 + x, 42 + y, 2, 1);
        g2d.fillRect(29 + x, 43 + y, 1, 1);
        g2d.fillRect(58 + x, 43 + y, 1, 1);
        g2d.fillRect(35 + x, 46 + y, 1, 5);
        g2d.fillRect(52 + x, 46 + y, 1, 5);
        g2d.fillRect(34 + x, 47 + y, 1, 3);
        g2d.fillRect(53 + x, 47 + y, 1, 3);
        g2d.fillRect(36 + x, 48 + y, 1, 1);
        g2d.fillRect(51 + x, 48 + y, 1, 1);
        g2d.fillRect(33 + x, 49 + y, 1, 2);
        g2d.fillRect(54 + x, 49 + y, 1, 2);
        g2d.fillRect(24 + x, 50 + y, 1, 1);
        g2d.fillRect(30 + x, 50 + y, 1, 4);
        g2d.fillRect(57 + x, 50 + y, 1, 4);
        g2d.fillRect(63 + x, 50 + y, 1, 1);
        g2d.fillRect(32 + x, 51 + y, 1, 2);
        g2d.fillRect(55 + x, 51 + y, 1, 2);
        g2d.fillRect(29 + x, 52 + y, 1, 3);
        g2d.fillRect(58 + x, 52 + y, 1, 3);
        g2d.fillRect(32 + x, 55 + y, 1, 1);
        g2d.fillRect(55 + x, 55 + y, 1, 1);
        g2d.fillRect(31 + x, 57 + y, 1, 1);
        g2d.fillRect(56 + x, 57 + y, 1, 1);
        g2d.fillRect(29 + x, 61 + y, 1, 2);
        g2d.fillRect(58 + x, 61 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(179,122,252,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(1 + x, 7 + y, 1, 1);
        g2d.fillRect(86 + x, 7 + y, 1, 1);
        g2d.fillRect(0 + x, 8 + y, 1, 1);
        g2d.fillRect(2 + x, 8 + y, 1, 1);
        g2d.fillRect(85 + x, 8 + y, 1, 1);
        g2d.fillRect(87 + x, 8 + y, 1, 1);
        g2d.fillRect(1 + x, 9 + y, 1, 1);
        g2d.fillRect(86 + x, 9 + y, 1, 1);
        g2d.fillRect(6 + x, 12 + y, 1, 1);
        g2d.fillRect(81 + x, 12 + y, 1, 1);
        g2d.fillRect(16 + x, 17 + y, 1, 1);
        g2d.fillRect(71 + x, 17 + y, 1, 1);
        g2d.fillRect(13 + x, 27 + y, 1, 1);
        g2d.fillRect(74 + x, 27 + y, 1, 1);
        g2d.fillRect(12 + x, 28 + y, 1, 1);
        g2d.fillRect(75 + x, 28 + y, 1, 1);
        g2d.fillRect(3 + x, 48 + y, 1, 1);
        g2d.fillRect(84 + x, 48 + y, 1, 1);
        g2d.fillRect(5 + x, 50 + y, 1, 1);
        g2d.fillRect(82 + x, 50 + y, 1, 1);
        g2d.fillRect(4 + x, 51 + y, 1, 1);
        g2d.fillRect(6 + x, 51 + y, 1, 1);
        g2d.fillRect(81 + x, 51 + y, 1, 1);
        g2d.fillRect(83 + x, 51 + y, 1, 1);
        g2d.fillRect(5 + x, 52 + y, 1, 1);
        g2d.fillRect(82 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231,69,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, 13 + y, 1, 1);
        g2d.fillRect(80 + x, 13 + y, 1, 1);
        g2d.fillRect(7 + x, 19 + y, 1, 1);
        g2d.fillRect(80 + x, 19 + y, 1, 1);
        g2d.fillRect(18 + x, 21 + y, 1, 1);
        g2d.fillRect(69 + x, 21 + y, 1, 1);
        g2d.fillRect(19 + x, 22 + y, 1, 1);
        g2d.fillRect(68 + x, 22 + y, 1, 1);
        g2d.fillRect(21 + x, 23 + y, 1, 1);
        g2d.fillRect(66 + x, 23 + y, 1, 1);
        g2d.fillRect(3 + x, 30 + y, 1, 1);
        g2d.fillRect(84 + x, 30 + y, 1, 1);
        g2d.fillRect(5 + x, 40 + y, 1, 1);
        g2d.fillRect(82 + x, 40 + y, 1, 1);
        g2d.fillRect(24 + x, 47 + y, 1, 1);
        g2d.fillRect(63 + x, 47 + y, 1, 1);
        g2d.fillRect(27 + x, 65 + y, 1, 1);
        g2d.fillRect(60 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,250,52,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(1 + x, 17 + y, 1, 2);
        g2d.fillRect(4 + x, 17 + y, 1, 1);
        g2d.fillRect(83 + x, 17 + y, 1, 1);
        g2d.fillRect(86 + x, 17 + y, 1, 2);
        g2d.fillRect(33 + x, 52 + y, 2, 1);
        g2d.fillRect(53 + x, 52 + y, 2, 1);
        g2d.fillRect(28 + x, 53 + y, 1, 3);
        g2d.fillRect(31 + x, 53 + y, 2, 1);
        g2d.fillRect(55 + x, 53 + y, 2, 1);
        g2d.fillRect(59 + x, 53 + y, 1, 3);
        g2d.fillRect(30 + x, 54 + y, 1, 1);
        g2d.fillRect(57 + x, 54 + y, 1, 1);
        g2d.fillRect(29 + x, 55 + y, 1, 1);
        g2d.fillRect(58 + x, 55 + y, 1, 1);
        g2d.fillRect(27 + x, 57 + y, 1, 1);
        g2d.fillRect(60 + x, 57 + y, 1, 1);
        g2d.fillRect(26 + x, 58 + y, 1, 1);
        g2d.fillRect(61 + x, 58 + y, 1, 1);
        g2d.fillRect(25 + x, 59 + y, 1, 2);
        g2d.fillRect(62 + x, 59 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,191,115,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(8 + x, 15 + y, 1, 2);
        g2d.fillRect(11 + x, 15 + y, 1, 2);
        g2d.fillRect(76 + x, 15 + y, 1, 2);
        g2d.fillRect(79 + x, 15 + y, 1, 2);
        g2d.fillRect(10 + x, 16 + y, 1, 2);
        g2d.fillRect(77 + x, 16 + y, 1, 2);
        g2d.fillRect(9 + x, 17 + y, 1, 1);
        g2d.fillRect(78 + x, 17 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(218,90,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(25 + x, 28 + y, 2, 1);
        g2d.fillRect(61 + x, 28 + y, 2, 1);
        g2d.fillRect(5 + x, 35 + y, 1, 1);
        g2d.fillRect(82 + x, 35 + y, 1, 1);
        g2d.fillRect(17 + x, 65 + y, 1, 2);
        g2d.fillRect(70 + x, 65 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237,77,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, 18 + y, 1, 1);
        g2d.fillRect(15 + x, 18 + y, 1, 1);
        g2d.fillRect(72 + x, 18 + y, 1, 1);
        g2d.fillRect(81 + x, 18 + y, 1, 1);
        g2d.fillRect(16 + x, 19 + y, 1, 1);
        g2d.fillRect(71 + x, 19 + y, 1, 1);
        g2d.fillRect(10 + x, 21 + y, 3, 1);
        g2d.fillRect(75 + x, 21 + y, 3, 1);
        g2d.fillRect(20 + x, 23 + y, 1, 1);
        g2d.fillRect(67 + x, 23 + y, 1, 1);
        g2d.fillRect(7 + x, 31 + y, 1, 1);
        g2d.fillRect(80 + x, 31 + y, 1, 1);
        g2d.fillRect(13 + x, 44 + y, 1, 1);
        g2d.fillRect(74 + x, 44 + y, 1, 1);
        g2d.fillRect(26 + x, 46 + y, 1, 1);
        g2d.fillRect(61 + x, 46 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(211,111,248,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(2 + x, 38 + y, 1, 1);
        g2d.fillRect(85 + x, 38 + y, 1, 1);
        g2d.fillRect(5 + x, 41 + y, 1, 1);
        g2d.fillRect(82 + x, 41 + y, 1, 1);
        g2d.fillRect(14 + x, 48 + y, 1, 1);
        g2d.fillRect(73 + x, 48 + y, 1, 1);
        g2d.fillRect(12 + x, 50 + y, 1, 1);
        g2d.fillRect(75 + x, 50 + y, 1, 1);
        g2d.fillRect(18 + x, 64 + y, 1, 1);
        g2d.fillRect(69 + x, 64 + y, 1, 1);
        g2d.fillRect(27 + x, 66 + y, 1, 1);
        g2d.fillRect(60 + x, 66 + y, 1, 1);
        g2d.fillRect(17 + x, 67 + y, 1, 1);
        g2d.fillRect(70 + x, 67 + y, 1, 1);
        g2d.fillRect(16 + x, 68 + y, 1, 2);
        g2d.fillRect(71 + x, 68 + y, 1, 2);
        g2d.fillRect(15 + x, 70 + y, 1, 1);
        g2d.fillRect(72 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,252,68,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, 15 + y, 1, 1);
        g2d.fillRect(87 + x, 15 + y, 1, 1);
        g2d.fillRect(4 + x, 18 + y, 1, 1);
        g2d.fillRect(83 + x, 18 + y, 1, 1);
        g2d.fillRect(2 + x, 19 + y, 2, 1);
        g2d.fillRect(5 + x, 19 + y, 1, 1);
        g2d.fillRect(82 + x, 19 + y, 1, 1);
        g2d.fillRect(84 + x, 19 + y, 2, 1);
        g2d.fillRect(28 + x, 51 + y, 1, 2);
        g2d.fillRect(59 + x, 51 + y, 1, 2);
        g2d.fillRect(26 + x, 56 + y, 1, 2);
        g2d.fillRect(61 + x, 56 + y, 1, 2);
        g2d.fillRect(24 + x, 61 + y, 1, 1);
        g2d.fillRect(63 + x, 61 + y, 1, 1);
        g2d.fillRect(24 + x, 64 + y, 1, 1);
        g2d.fillRect(63 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185,140,253,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(13 + x, 26 + y, 1, 1);
        g2d.fillRect(74 + x, 26 + y, 1, 1);
        g2d.fillRect(12 + x, 27 + y, 1, 1);
        g2d.fillRect(75 + x, 27 + y, 1, 1);
        g2d.fillRect(11 + x, 28 + y, 1, 1);
        g2d.fillRect(76 + x, 28 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(236,89,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 17 + y, 1, 1);
        g2d.fillRect(73 + x, 17 + y, 1, 1);
        g2d.fillRect(1 + x, 19 + y, 1, 1);
        g2d.fillRect(86 + x, 19 + y, 1, 1);
        g2d.fillRect(9 + x, 20 + y, 1, 1);
        g2d.fillRect(17 + x, 20 + y, 1, 1);
        g2d.fillRect(70 + x, 20 + y, 1, 1);
        g2d.fillRect(78 + x, 20 + y, 1, 1);
        g2d.fillRect(15 + x, 24 + y, 1, 1);
        g2d.fillRect(22 + x, 24 + y, 1, 1);
        g2d.fillRect(65 + x, 24 + y, 1, 1);
        g2d.fillRect(72 + x, 24 + y, 1, 1);
        g2d.fillRect(16 + x, 25 + y, 2, 1);
        g2d.fillRect(70 + x, 25 + y, 2, 1);
        g2d.fillRect(18 + x, 26 + y, 1, 1);
        g2d.fillRect(69 + x, 26 + y, 1, 1);
        g2d.fillRect(20 + x, 29 + y, 1, 1);
        g2d.fillRect(67 + x, 29 + y, 1, 1);
        g2d.fillRect(8 + x, 32 + y, 1, 1);
        g2d.fillRect(79 + x, 32 + y, 1, 1);
        g2d.fillRect(11 + x, 33 + y, 1, 1);
        g2d.fillRect(76 + x, 33 + y, 1, 1);
        g2d.fillRect(9 + x, 36 + y, 1, 1);
        g2d.fillRect(78 + x, 36 + y, 1, 1);
        g2d.fillRect(26 + x, 47 + y, 1, 1);
        g2d.fillRect(61 + x, 47 + y, 1, 1);
        g2d.fillRect(25 + x, 48 + y, 1, 1);
        g2d.fillRect(62 + x, 48 + y, 1, 1);
        g2d.fillRect(18 + x, 49 + y, 1, 1);
        g2d.fillRect(21 + x, 49 + y, 1, 1);
        g2d.fillRect(66 + x, 49 + y, 1, 1);
        g2d.fillRect(69 + x, 49 + y, 1, 1);
        g2d.fillRect(23 + x, 54 + y, 1, 1);
        g2d.fillRect(64 + x, 54 + y, 1, 1);
        g2d.fillRect(27 + x, 56 + y, 1, 1);
        g2d.fillRect(31 + x, 56 + y, 1, 1);
        g2d.fillRect(56 + x, 56 + y, 1, 1);
        g2d.fillRect(60 + x, 56 + y, 1, 1);
        g2d.fillRect(28 + x, 62 + y, 1, 1);
        g2d.fillRect(59 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235,101,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(2 + x, 30 + y, 1, 1);
        g2d.fillRect(85 + x, 30 + y, 1, 1);
        g2d.fillRect(27 + x, 32 + y, 1, 1);
        g2d.fillRect(60 + x, 32 + y, 1, 1);
        g2d.fillRect(16 + x, 35 + y, 2, 1);
        g2d.fillRect(70 + x, 35 + y, 2, 1);
        g2d.fillRect(24 + x, 53 + y, 1, 1);
        g2d.fillRect(63 + x, 53 + y, 1, 1);
        g2d.fillRect(32 + x, 54 + y, 1, 1);
        g2d.fillRect(55 + x, 54 + y, 1, 1);
        g2d.fillRect(23 + x, 55 + y, 1, 1);
        g2d.fillRect(31 + x, 55 + y, 1, 1);
        g2d.fillRect(56 + x, 55 + y, 1, 1);
        g2d.fillRect(64 + x, 55 + y, 1, 1);
        g2d.fillRect(30 + x, 57 + y, 1, 1);
        g2d.fillRect(57 + x, 57 + y, 1, 1);
        g2d.fillRect(26 + x, 59 + y, 1, 1);
        g2d.fillRect(61 + x, 59 + y, 1, 1);
        g2d.fillRect(25 + x, 61 + y, 1, 2);
        g2d.fillRect(62 + x, 61 + y, 1, 2);
        g2d.fillRect(28 + x, 63 + y, 1, 1);
        g2d.fillRect(59 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253,84,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(21 + x, 2 + y, 1, 1);
        g2d.fillRect(66 + x, 2 + y, 1, 1);
        g2d.fillRect(20 + x, 3 + y, 1, 1);
        g2d.fillRect(22 + x, 3 + y, 1, 1);
        g2d.fillRect(65 + x, 3 + y, 1, 1);
        g2d.fillRect(67 + x, 3 + y, 1, 1);
        g2d.fillRect(21 + x, 4 + y, 1, 1);
        g2d.fillRect(66 + x, 4 + y, 1, 1);
        g2d.fillRect(6 + x, 7 + y, 2, 1);
        g2d.fillRect(9 + x, 7 + y, 1, 1);
        g2d.fillRect(78 + x, 7 + y, 1, 1);
        g2d.fillRect(80 + x, 7 + y, 2, 1);
        g2d.fillRect(5 + x, 8 + y, 1, 2);
        g2d.fillRect(8 + x, 8 + y, 1, 2);
        g2d.fillRect(79 + x, 8 + y, 1, 2);
        g2d.fillRect(82 + x, 8 + y, 1, 2);
        g2d.fillRect(6 + x, 10 + y, 2, 1);
        g2d.fillRect(80 + x, 10 + y, 2, 1);
        g2d.fillRect(9 + x, 13 + y, 1, 1);
        g2d.fillRect(78 + x, 13 + y, 1, 1);
        g2d.fillRect(8 + x, 14 + y, 1, 1);
        g2d.fillRect(10 + x, 14 + y, 1, 1);
        g2d.fillRect(77 + x, 14 + y, 1, 1);
        g2d.fillRect(79 + x, 14 + y, 1, 1);
        g2d.fillRect(9 + x, 15 + y, 1, 1);
        g2d.fillRect(78 + x, 15 + y, 1, 1);
        g2d.fillRect(20 + x, 17 + y, 1, 1);
        g2d.fillRect(67 + x, 17 + y, 1, 1);
        g2d.fillRect(10 + x, 20 + y, 2, 1);
        g2d.fillRect(76 + x, 20 + y, 2, 1);
        g2d.fillRect(2 + x, 25 + y, 1, 1);
        g2d.fillRect(85 + x, 25 + y, 1, 1);
        g2d.fillRect(0 + x, 52 + y, 1, 1);
        g2d.fillRect(87 + x, 52 + y, 1, 1);
        g2d.fillRect(1 + x, 53 + y, 1, 1);
        g2d.fillRect(86 + x, 53 + y, 1, 1);
        g2d.fillRect(0 + x, 54 + y, 1, 1);
        g2d.fillRect(87 + x, 54 + y, 1, 1);
        g2d.fillRect(6 + x, 57 + y, 1, 1);
        g2d.fillRect(11 + x, 57 + y, 1, 1);
        g2d.fillRect(76 + x, 57 + y, 1, 1);
        g2d.fillRect(81 + x, 57 + y, 1, 1);
        g2d.fillRect(10 + x, 58 + y, 1, 1);
        g2d.fillRect(12 + x, 58 + y, 1, 1);
        g2d.fillRect(75 + x, 58 + y, 1, 1);
        g2d.fillRect(77 + x, 58 + y, 1, 1);
        g2d.fillRect(11 + x, 59 + y, 1, 1);
        g2d.fillRect(76 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,252,87,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(2 + x, 16 + y, 1, 1);
        g2d.fillRect(85 + x, 16 + y, 1, 1);
        g2d.fillRect(5 + x, 20 + y, 1, 1);
        g2d.fillRect(82 + x, 20 + y, 1, 1);
        g2d.fillRect(3 + x, 21 + y, 1, 1);
        g2d.fillRect(6 + x, 21 + y, 1, 1);
        g2d.fillRect(81 + x, 21 + y, 1, 1);
        g2d.fillRect(84 + x, 21 + y, 1, 1);
        g2d.fillRect(29 + x, 49 + y, 1, 2);
        g2d.fillRect(58 + x, 49 + y, 1, 2);
        g2d.fillRect(27 + x, 51 + y, 1, 1);
        g2d.fillRect(60 + x, 51 + y, 1, 1);
        g2d.fillRect(24 + x, 55 + y, 3, 1);
        g2d.fillRect(61 + x, 55 + y, 3, 1);
        g2d.fillRect(23 + x, 56 + y, 1, 1);
        g2d.fillRect(64 + x, 56 + y, 1, 1);
        g2d.fillRect(23 + x, 64 + y, 1, 1);
        g2d.fillRect(64 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(240,99,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(8 + x, 11 + y, 1, 1);
        g2d.fillRect(79 + x, 11 + y, 1, 1);
        g2d.fillRect(14 + x, 16 + y, 1, 1);
        g2d.fillRect(73 + x, 16 + y, 1, 1);
        g2d.fillRect(2 + x, 18 + y, 1, 1);
        g2d.fillRect(85 + x, 18 + y, 1, 1);
        g2d.fillRect(13 + x, 23 + y, 2, 1);
        g2d.fillRect(73 + x, 23 + y, 2, 1);
        g2d.fillRect(1 + x, 27 + y, 1, 2);
        g2d.fillRect(86 + x, 27 + y, 1, 2);
        g2d.fillRect(17 + x, 28 + y, 1, 1);
        g2d.fillRect(70 + x, 28 + y, 1, 1);
        g2d.fillRect(19 + x, 29 + y, 1, 1);
        g2d.fillRect(68 + x, 29 + y, 1, 1);
        g2d.fillRect(12 + x, 31 + y, 1, 1);
        g2d.fillRect(75 + x, 31 + y, 1, 1);
        g2d.fillRect(8 + x, 33 + y, 1, 1);
        g2d.fillRect(79 + x, 33 + y, 1, 1);
        g2d.fillRect(29 + x, 59 + y, 1, 1);
        g2d.fillRect(58 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(218,134,250,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(11 + x, 51 + y, 3, 1);
        g2d.fillRect(74 + x, 51 + y, 3, 1);
        g2d.fillRect(23 + x, 69 + y, 1, 1);
        g2d.fillRect(64 + x, 69 + y, 1, 1);
        g2d.fillRect(21 + x, 70 + y, 1, 1);
        g2d.fillRect(66 + x, 70 + y, 1, 1);
        g2d.fillRect(14 + x, 71 + y, 1, 1);
        g2d.fillRect(18 + x, 71 + y, 1, 1);
        g2d.fillRect(69 + x, 71 + y, 1, 1);
        g2d.fillRect(73 + x, 71 + y, 1, 1);
        g2d.fillRect(15 + x, 72 + y, 2, 1);
        g2d.fillRect(71 + x, 72 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(240,108,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(8 + x, 12 + y, 1, 1);
        g2d.fillRect(79 + x, 12 + y, 1, 1);
        g2d.fillRect(0 + x, 18 + y, 1, 1);
        g2d.fillRect(87 + x, 18 + y, 1, 1);
        g2d.fillRect(2 + x, 20 + y, 1, 1);
        g2d.fillRect(85 + x, 20 + y, 1, 1);
        g2d.fillRect(15 + x, 27 + y, 1, 1);
        g2d.fillRect(72 + x, 27 + y, 1, 1);
        g2d.fillRect(18 + x, 28 + y, 1, 1);
        g2d.fillRect(69 + x, 28 + y, 1, 1);
        g2d.fillRect(13 + x, 31 + y, 1, 1);
        g2d.fillRect(74 + x, 31 + y, 1, 1);
        g2d.fillRect(6 + x, 32 + y, 1, 1);
        g2d.fillRect(81 + x, 32 + y, 1, 1);
        g2d.fillRect(10 + x, 36 + y, 1, 1);
        g2d.fillRect(77 + x, 36 + y, 1, 1);
        g2d.fillRect(4 + x, 38 + y, 1, 1);
        g2d.fillRect(83 + x, 38 + y, 1, 1);
        g2d.fillRect(4 + x, 40 + y, 1, 1);
        g2d.fillRect(83 + x, 40 + y, 1, 1);
        g2d.fillRect(29 + x, 58 + y, 1, 1);
        g2d.fillRect(58 + x, 58 + y, 1, 1);
        g2d.fillRect(27 + x, 63 + y, 1, 1);
        g2d.fillRect(60 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(192,159,253,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(12 + x, 26 + y, 1, 1);
        g2d.fillRect(75 + x, 26 + y, 1, 1);
        g2d.fillRect(11 + x, 27 + y, 1, 1);
        g2d.fillRect(76 + x, 27 + y, 1, 1);
        g2d.fillRect(23 + x, 58 + y, 1, 1);
        g2d.fillRect(64 + x, 58 + y, 1, 1);
        g2d.fillRect(24 + x, 59 + y, 1, 1);
        g2d.fillRect(63 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(231,121,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, 16 + y, 1, 2);
        g2d.fillRect(80 + x, 16 + y, 1, 2);
        g2d.fillRect(4 + x, 37 + y, 1, 1);
        g2d.fillRect(83 + x, 37 + y, 1, 1);
        g2d.fillRect(3 + x, 38 + y, 1, 1);
        g2d.fillRect(84 + x, 38 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252,100,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(4 + x, 16 + y, 1, 1);
        g2d.fillRect(83 + x, 16 + y, 1, 1);
        g2d.fillRect(5 + x, 17 + y, 1, 1);
        g2d.fillRect(82 + x, 17 + y, 1, 1);
        g2d.fillRect(8 + x, 19 + y, 2, 1);
        g2d.fillRect(78 + x, 19 + y, 2, 1);
        g2d.fillRect(2 + x, 23 + y, 1, 2);
        g2d.fillRect(85 + x, 23 + y, 1, 2);
        g2d.fillRect(1 + x, 26 + y, 1, 1);
        g2d.fillRect(86 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(240,116,253,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(15 + x, 4 + y, 1, 1);
        g2d.fillRect(72 + x, 4 + y, 1, 1);
        g2d.fillRect(1 + x, 16 + y, 1, 1);
        g2d.fillRect(86 + x, 16 + y, 1, 1);
        g2d.fillRect(14 + x, 45 + y, 1, 1);
        g2d.fillRect(73 + x, 45 + y, 1, 1);
        g2d.fillRect(33 + x, 53 + y, 1, 1);
        g2d.fillRect(54 + x, 53 + y, 1, 1);
        g2d.fillRect(30 + x, 56 + y, 1, 1);
        g2d.fillRect(57 + x, 56 + y, 1, 1);
        g2d.fillRect(23 + x, 57 + y, 1, 1);
        g2d.fillRect(64 + x, 57 + y, 1, 1);
        g2d.fillRect(27 + x, 64 + y, 1, 1);
        g2d.fillRect(60 + x, 64 + y, 1, 1);
        g2d.fillRect(26 + x, 66 + y, 1, 1);
        g2d.fillRect(61 + x, 66 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,251,103,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(2 + x, 21 + y, 1, 1);
        g2d.fillRect(85 + x, 21 + y, 1, 1);
        g2d.fillRect(4 + x, 22 + y, 1, 1);
        g2d.fillRect(7 + x, 22 + y, 1, 1);
        g2d.fillRect(80 + x, 22 + y, 1, 1);
        g2d.fillRect(83 + x, 22 + y, 1, 1);
        g2d.fillRect(28 + x, 29 + y, 1, 2);
        g2d.fillRect(29 + x, 29 + y, 1, 1);
        g2d.fillRect(58 + x, 29 + y, 2, 1);
        g2d.fillRect(59 + x, 30 + y, 1, 1);
        g2d.fillRect(35 + x, 45 + y, 2, 1);
        g2d.fillRect(51 + x, 45 + y, 2, 1);
        g2d.fillRect(32 + x, 46 + y, 3, 1);
        g2d.fillRect(53 + x, 46 + y, 3, 1);
        g2d.fillRect(31 + x, 47 + y, 1, 1);
        g2d.fillRect(56 + x, 47 + y, 1, 1);
        g2d.fillRect(30 + x, 48 + y, 1, 1);
        g2d.fillRect(57 + x, 48 + y, 1, 1);
        g2d.fillRect(25 + x, 52 + y, 1, 1);
        g2d.fillRect(62 + x, 52 + y, 1, 1);
        g2d.fillRect(22 + x, 63 + y, 1, 1);
        g2d.fillRect(65 + x, 63 + y, 1, 1);
        g2d.fillRect(22 + x, 65 + y, 1, 1);
        g2d.fillRect(65 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(224,144,252,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(4 + x, 41 + y, 1, 1);
        g2d.fillRect(83 + x, 41 + y, 1, 1);
        g2d.fillRect(10 + x, 52 + y, 1, 1);
        g2d.fillRect(77 + x, 52 + y, 1, 1);
        g2d.fillRect(18 + x, 63 + y, 1, 1);
        g2d.fillRect(69 + x, 63 + y, 1, 1);
        g2d.fillRect(26 + x, 67 + y, 1, 1);
        g2d.fillRect(61 + x, 67 + y, 1, 1);
        g2d.fillRect(25 + x, 68 + y, 1, 1);
        g2d.fillRect(62 + x, 68 + y, 1, 1);
        g2d.fillRect(24 + x, 69 + y, 1, 1);
        g2d.fillRect(63 + x, 69 + y, 1, 1);
        g2d.fillRect(22 + x, 70 + y, 1, 1);
        g2d.fillRect(65 + x, 70 + y, 1, 1);
        g2d.fillRect(19 + x, 71 + y, 1, 1);
        g2d.fillRect(68 + x, 71 + y, 1, 1);
        g2d.fillRect(17 + x, 72 + y, 1, 1);
        g2d.fillRect(70 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242,124,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 5 + y, 1, 1);
        g2d.fillRect(73 + x, 5 + y, 1, 1);
        g2d.fillRect(1 + x, 15 + y, 1, 1);
        g2d.fillRect(86 + x, 15 + y, 1, 1);
        g2d.fillRect(2 + x, 17 + y, 1, 1);
        g2d.fillRect(85 + x, 17 + y, 1, 1);
        g2d.fillRect(1 + x, 29 + y, 1, 1);
        g2d.fillRect(86 + x, 29 + y, 1, 1);
        g2d.fillRect(10 + x, 34 + y, 1, 1);
        g2d.fillRect(77 + x, 34 + y, 1, 1);
        g2d.fillRect(8 + x, 35 + y, 1, 1);
        g2d.fillRect(14 + x, 35 + y, 2, 1);
        g2d.fillRect(72 + x, 35 + y, 2, 1);
        g2d.fillRect(79 + x, 35 + y, 1, 1);
        g2d.fillRect(11 + x, 36 + y, 1, 1);
        g2d.fillRect(76 + x, 36 + y, 1, 1);
        g2d.fillRect(21 + x, 50 + y, 1, 1);
        g2d.fillRect(23 + x, 50 + y, 1, 1);
        g2d.fillRect(64 + x, 50 + y, 1, 1);
        g2d.fillRect(66 + x, 50 + y, 1, 1);
        g2d.fillRect(28 + x, 60 + y, 1, 1);
        g2d.fillRect(59 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253,117,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(1 + x, 14 + y, 1, 1);
        g2d.fillRect(86 + x, 14 + y, 1, 1);
        g2d.fillRect(0 + x, 16 + y, 1, 1);
        g2d.fillRect(87 + x, 16 + y, 1, 1);
        g2d.fillRect(6 + x, 17 + y, 1, 1);
        g2d.fillRect(81 + x, 17 + y, 1, 1);
        g2d.fillRect(7 + x, 18 + y, 1, 1);
        g2d.fillRect(80 + x, 18 + y, 1, 1);
        g2d.fillRect(1 + x, 22 + y, 1, 1);
        g2d.fillRect(86 + x, 22 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,253,118,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(9 + x, 14 + y, 1, 1);
        g2d.fillRect(78 + x, 14 + y, 1, 1);
        g2d.fillRect(10 + x, 15 + y, 1, 1);
        g2d.fillRect(77 + x, 15 + y, 1, 1);
        g2d.fillRect(9 + x, 16 + y, 1, 1);
        g2d.fillRect(78 + x, 16 + y, 1, 1);
        g2d.fillRect(5 + x, 23 + y, 1, 1);
        g2d.fillRect(8 + x, 23 + y, 1, 1);
        g2d.fillRect(79 + x, 23 + y, 1, 1);
        g2d.fillRect(82 + x, 23 + y, 1, 1);
        g2d.fillRect(6 + x, 24 + y, 1, 1);
        g2d.fillRect(81 + x, 24 + y, 1, 1);
        g2d.fillRect(27 + x, 47 + y, 1, 1);
        g2d.fillRect(60 + x, 47 + y, 1, 1);
        g2d.fillRect(24 + x, 51 + y, 1, 2);
        g2d.fillRect(26 + x, 51 + y, 1, 1);
        g2d.fillRect(61 + x, 51 + y, 1, 1);
        g2d.fillRect(63 + x, 51 + y, 1, 2);
        g2d.fillRect(23 + x, 52 + y, 1, 1);
        g2d.fillRect(64 + x, 52 + y, 1, 1);
        g2d.fillRect(22 + x, 56 + y, 1, 1);
        g2d.fillRect(65 + x, 56 + y, 1, 1);
        g2d.fillRect(23 + x, 62 + y, 1, 1);
        g2d.fillRect(64 + x, 62 + y, 1, 1);
        g2d.fillRect(21 + x, 64 + y, 1, 1);
        g2d.fillRect(66 + x, 64 + y, 1, 1);
        g2d.fillRect(22 + x, 66 + y, 1, 1);
        g2d.fillRect(65 + x, 66 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(228,148,253,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(5 + x, 36 + y, 1, 1);
        g2d.fillRect(82 + x, 36 + y, 1, 1);
        g2d.fillRect(3 + x, 40 + y, 1, 1);
        g2d.fillRect(84 + x, 40 + y, 1, 1);
        g2d.fillRect(18 + x, 62 + y, 1, 1);
        g2d.fillRect(69 + x, 62 + y, 1, 1);
        g2d.fillRect(20 + x, 71 + y, 1, 1);
        g2d.fillRect(67 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242,133,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, 14 + y, 1, 1);
        g2d.fillRect(87 + x, 14 + y, 1, 1);
        g2d.fillRect(8 + x, 17 + y, 1, 1);
        g2d.fillRect(79 + x, 17 + y, 1, 1);
        g2d.fillRect(23 + x, 26 + y, 1, 1);
        g2d.fillRect(64 + x, 26 + y, 1, 1);
        g2d.fillRect(7 + x, 33 + y, 1, 1);
        g2d.fillRect(80 + x, 33 + y, 1, 1);
        g2d.fillRect(9 + x, 34 + y, 1, 1);
        g2d.fillRect(78 + x, 34 + y, 1, 1);
        g2d.fillRect(27 + x, 41 + y, 1, 1);
        g2d.fillRect(60 + x, 41 + y, 1, 1);
        g2d.fillRect(22 + x, 46 + y, 1, 1);
        g2d.fillRect(65 + x, 46 + y, 1, 1);
        g2d.fillRect(17 + x, 49 + y, 1, 1);
        g2d.fillRect(23 + x, 49 + y, 1, 1);
        g2d.fillRect(64 + x, 49 + y, 1, 1);
        g2d.fillRect(70 + x, 49 + y, 1, 1);
        g2d.fillRect(23 + x, 51 + y, 1, 1);
        g2d.fillRect(64 + x, 51 + y, 1, 1);
        g2d.fillRect(28 + x, 59 + y, 1, 1);
        g2d.fillRect(59 + x, 59 + y, 1, 1);
        g2d.fillRect(27 + x, 62 + y, 1, 1);
        g2d.fillRect(60 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(201,180,253,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(10 + x, 26 + y, 1, 2);
        g2d.fillRect(11 + x, 26 + y, 1, 1);
        g2d.fillRect(76 + x, 26 + y, 2, 1);
        g2d.fillRect(77 + x, 27 + y, 1, 1);
        g2d.fillRect(24 + x, 60 + y, 1, 1);
        g2d.fillRect(63 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,126,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(1 + x, 21 + y, 1, 1);
        g2d.fillRect(86 + x, 21 + y, 1, 1);
        g2d.fillRect(0 + x, 26 + y, 1, 1);
        g2d.fillRect(87 + x, 26 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248,134,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(16 + x, 4 + y, 1, 1);
        g2d.fillRect(71 + x, 4 + y, 1, 1);
        g2d.fillRect(13 + x, 6 + y, 1, 1);
        g2d.fillRect(74 + x, 6 + y, 1, 1);
        g2d.fillRect(12 + x, 7 + y, 1, 1);
        g2d.fillRect(75 + x, 7 + y, 1, 1);
        g2d.fillRect(9 + x, 10 + y, 1, 1);
        g2d.fillRect(78 + x, 10 + y, 1, 1);
        g2d.fillRect(2 + x, 15 + y, 1, 1);
        g2d.fillRect(85 + x, 15 + y, 1, 1);
        g2d.fillRect(0 + x, 20 + y, 1, 1);
        g2d.fillRect(87 + x, 20 + y, 1, 1);
        g2d.fillRect(3 + x, 27 + y, 1, 1);
        g2d.fillRect(84 + x, 27 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(243,141,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, 15 + y, 1, 1);
        g2d.fillRect(80 + x, 15 + y, 1, 1);
        g2d.fillRect(8 + x, 18 + y, 1, 1);
        g2d.fillRect(79 + x, 18 + y, 1, 1);
        g2d.fillRect(3 + x, 26 + y, 1, 1);
        g2d.fillRect(24 + x, 26 + y, 1, 1);
        g2d.fillRect(63 + x, 26 + y, 1, 1);
        g2d.fillRect(84 + x, 26 + y, 1, 1);
        g2d.fillRect(5 + x, 30 + y, 1, 1);
        g2d.fillRect(23 + x, 30 + y, 1, 1);
        g2d.fillRect(64 + x, 30 + y, 1, 1);
        g2d.fillRect(82 + x, 30 + y, 1, 1);
        g2d.fillRect(25 + x, 31 + y, 1, 1);
        g2d.fillRect(62 + x, 31 + y, 1, 1);
        g2d.fillRect(12 + x, 35 + y, 1, 1);
        g2d.fillRect(75 + x, 35 + y, 1, 1);
        g2d.fillRect(18 + x, 36 + y, 1, 1);
        g2d.fillRect(69 + x, 36 + y, 1, 1);
        g2d.fillRect(5 + x, 37 + y, 1, 1);
        g2d.fillRect(82 + x, 37 + y, 1, 1);
        g2d.fillRect(27 + x, 40 + y, 2, 1);
        g2d.fillRect(59 + x, 40 + y, 2, 1);
        g2d.fillRect(25 + x, 43 + y, 1, 1);
        g2d.fillRect(62 + x, 43 + y, 1, 1);
        g2d.fillRect(23 + x, 45 + y, 1, 1);
        g2d.fillRect(64 + x, 45 + y, 1, 1);
        g2d.fillRect(16 + x, 49 + y, 1, 1);
        g2d.fillRect(71 + x, 49 + y, 1, 1);
        g2d.fillRect(22 + x, 50 + y, 1, 1);
        g2d.fillRect(34 + x, 50 + y, 1, 1);
        g2d.fillRect(53 + x, 50 + y, 1, 1);
        g2d.fillRect(65 + x, 50 + y, 1, 1);
        g2d.fillRect(21 + x, 51 + y, 1, 2);
        g2d.fillRect(33 + x, 51 + y, 1, 1);
        g2d.fillRect(54 + x, 51 + y, 1, 1);
        g2d.fillRect(66 + x, 51 + y, 1, 2);
        g2d.fillRect(20 + x, 53 + y, 1, 1);
        g2d.fillRect(67 + x, 53 + y, 1, 1);
        g2d.fillRect(20 + x, 58 + y, 1, 1);
        g2d.fillRect(22 + x, 58 + y, 1, 1);
        g2d.fillRect(28 + x, 58 + y, 1, 1);
        g2d.fillRect(59 + x, 58 + y, 1, 1);
        g2d.fillRect(65 + x, 58 + y, 1, 1);
        g2d.fillRect(67 + x, 58 + y, 1, 1);
        g2d.fillRect(26 + x, 63 + y, 1, 1);
        g2d.fillRect(61 + x, 63 + y, 1, 1);
        g2d.fillRect(25 + x, 67 + y, 1, 1);
        g2d.fillRect(62 + x, 67 + y, 1, 1);
        g2d.fillRect(24 + x, 68 + y, 1, 1);
        g2d.fillRect(63 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249,139,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(17 + x, 4 + y, 1, 1);
        g2d.fillRect(70 + x, 4 + y, 1, 1);
        g2d.fillRect(18 + x, 5 + y, 1, 3);
        g2d.fillRect(69 + x, 5 + y, 1, 3);
        g2d.fillRect(16 + x, 6 + y, 1, 1);
        g2d.fillRect(71 + x, 6 + y, 1, 1);
        g2d.fillRect(15 + x, 7 + y, 1, 1);
        g2d.fillRect(72 + x, 7 + y, 1, 1);
        g2d.fillRect(11 + x, 8 + y, 1, 1);
        g2d.fillRect(16 + x, 8 + y, 2, 1);
        g2d.fillRect(70 + x, 8 + y, 2, 1);
        g2d.fillRect(76 + x, 8 + y, 1, 1);
        g2d.fillRect(10 + x, 9 + y, 1, 1);
        g2d.fillRect(77 + x, 9 + y, 1, 1);
        g2d.fillRect(0 + x, 13 + y, 1, 1);
        g2d.fillRect(87 + x, 13 + y, 1, 1);
        g2d.fillRect(3 + x, 15 + y, 1, 1);
        g2d.fillRect(13 + x, 15 + y, 1, 1);
        g2d.fillRect(74 + x, 15 + y, 1, 1);
        g2d.fillRect(84 + x, 15 + y, 1, 1);
        g2d.fillRect(0 + x, 19 + y, 1, 1);
        g2d.fillRect(87 + x, 19 + y, 1, 1);
        g2d.fillRect(4 + x, 30 + y, 1, 1);
        g2d.fillRect(83 + x, 30 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,253,137,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(23 + x, 8 + y, 1, 1);
        g2d.fillRect(64 + x, 8 + y, 1, 1);
        g2d.fillRect(22 + x, 9 + y, 1, 1);
        g2d.fillRect(65 + x, 9 + y, 1, 1);
        g2d.fillRect(23 + x, 10 + y, 1, 1);
        g2d.fillRect(64 + x, 10 + y, 1, 1);
        g2d.fillRect(18 + x, 16 + y, 1, 1);
        g2d.fillRect(69 + x, 16 + y, 1, 1);
        g2d.fillRect(24 + x, 20 + y, 1, 1);
        g2d.fillRect(63 + x, 20 + y, 1, 1);
        g2d.fillRect(9 + x, 24 + y, 2, 1);
        g2d.fillRect(77 + x, 24 + y, 2, 1);
        g2d.fillRect(7 + x, 25 + y, 1, 1);
        g2d.fillRect(80 + x, 25 + y, 1, 1);
        g2d.fillRect(31 + x, 44 + y, 1, 1);
        g2d.fillRect(56 + x, 44 + y, 1, 1);
        g2d.fillRect(29 + x, 45 + y, 2, 1);
        g2d.fillRect(57 + x, 45 + y, 2, 1);
        g2d.fillRect(28 + x, 46 + y, 1, 1);
        g2d.fillRect(59 + x, 46 + y, 1, 1);
        g2d.fillRect(25 + x, 49 + y, 1, 2);
        g2d.fillRect(62 + x, 49 + y, 1, 2);
        g2d.fillRect(22 + x, 53 + y, 1, 1);
        g2d.fillRect(65 + x, 53 + y, 1, 1);
        g2d.fillRect(13 + x, 63 + y, 1, 1);
        g2d.fillRect(74 + x, 63 + y, 1, 1);
        g2d.fillRect(12 + x, 64 + y, 1, 1);
        g2d.fillRect(75 + x, 64 + y, 1, 1);
        g2d.fillRect(13 + x, 65 + y, 1, 1);
        g2d.fillRect(19 + x, 65 + y, 3, 1);
        g2d.fillRect(66 + x, 65 + y, 3, 1);
        g2d.fillRect(74 + x, 65 + y, 1, 1);
        g2d.fillRect(18 + x, 66 + y, 1, 1);
        g2d.fillRect(69 + x, 66 + y, 1, 1);
        g2d.fillRect(21 + x, 67 + y, 1, 1);
        g2d.fillRect(66 + x, 67 + y, 1, 1);
        g2d.fillRect(20 + x, 68 + y, 1, 1);
        g2d.fillRect(67 + x, 68 + y, 1, 1);
        g2d.fillRect(19 + x, 69 + y, 1, 1);
        g2d.fillRect(68 + x, 69 + y, 1, 1);
        g2d.fillRect(18 + x, 70 + y, 1, 1);
        g2d.fillRect(69 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244,149,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(3 + x, 20 + y, 1, 1);
        g2d.fillRect(84 + x, 20 + y, 1, 1);
        g2d.fillRect(4 + x, 26 + y, 1, 3);
        g2d.fillRect(83 + x, 26 + y, 1, 3);
        g2d.fillRect(2 + x, 27 + y, 1, 1);
        g2d.fillRect(85 + x, 27 + y, 1, 1);
        g2d.fillRect(0 + x, 28 + y, 1, 1);
        g2d.fillRect(3 + x, 28 + y, 1, 1);
        g2d.fillRect(84 + x, 28 + y, 1, 1);
        g2d.fillRect(87 + x, 28 + y, 1, 1);
        g2d.fillRect(24 + x, 31 + y, 1, 1);
        g2d.fillRect(63 + x, 31 + y, 1, 1);
        g2d.fillRect(7 + x, 35 + y, 1, 1);
        g2d.fillRect(80 + x, 35 + y, 1, 1);
        g2d.fillRect(8 + x, 40 + y, 1, 1);
        g2d.fillRect(79 + x, 40 + y, 1, 1);
        g2d.fillRect(26 + x, 42 + y, 1, 1);
        g2d.fillRect(61 + x, 42 + y, 1, 1);
        g2d.fillRect(23 + x, 44 + y, 1, 1);
        g2d.fillRect(64 + x, 44 + y, 1, 1);
        g2d.fillRect(15 + x, 47 + y, 1, 1);
        g2d.fillRect(72 + x, 47 + y, 1, 1);
        g2d.fillRect(20 + x, 54 + y, 1, 1);
        g2d.fillRect(67 + x, 54 + y, 1, 1);
        g2d.fillRect(28 + x, 57 + y, 1, 1);
        g2d.fillRect(59 + x, 57 + y, 1, 1);
        g2d.fillRect(23 + x, 68 + y, 1, 1);
        g2d.fillRect(64 + x, 68 + y, 1, 1);
        g2d.fillRect(12 + x, 72 + y, 3, 1);
        g2d.fillRect(73 + x, 72 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(235,159,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(0 + x, 39 + y, 2, 1);
        g2d.fillRect(86 + x, 39 + y, 2, 1);
        g2d.fillRect(2 + x, 40 + y, 1, 1);
        g2d.fillRect(85 + x, 40 + y, 1, 1);
        g2d.fillRect(9 + x, 52 + y, 1, 1);
        g2d.fillRect(78 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253,146,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(12 + x, 13 + y, 1, 1);
        g2d.fillRect(75 + x, 13 + y, 1, 1);
        g2d.fillRect(8 + x, 71 + y, 2, 1);
        g2d.fillRect(78 + x, 71 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244,155,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(11 + x, 14 + y, 1, 1);
        g2d.fillRect(76 + x, 14 + y, 1, 1);
        g2d.fillRect(12 + x, 15 + y, 1, 2);
        g2d.fillRect(75 + x, 15 + y, 1, 2);
        g2d.fillRect(11 + x, 17 + y, 1, 2);
        g2d.fillRect(76 + x, 17 + y, 1, 2);
        g2d.fillRect(9 + x, 18 + y, 2, 1);
        g2d.fillRect(77 + x, 18 + y, 2, 1);
        g2d.fillRect(0 + x, 27 + y, 1, 1);
        g2d.fillRect(87 + x, 27 + y, 1, 1);
        g2d.fillRect(9 + x, 40 + y, 1, 1);
        g2d.fillRect(78 + x, 40 + y, 1, 1);
        g2d.fillRect(22 + x, 45 + y, 1, 1);
        g2d.fillRect(65 + x, 45 + y, 1, 1);
        g2d.fillRect(15 + x, 48 + y, 1, 1);
        g2d.fillRect(72 + x, 48 + y, 1, 1);
        g2d.fillRect(22 + x, 51 + y, 1, 1);
        g2d.fillRect(65 + x, 51 + y, 1, 1);
        g2d.fillRect(20 + x, 55 + y, 1, 1);
        g2d.fillRect(67 + x, 55 + y, 1, 1);
        g2d.fillRect(21 + x, 61 + y, 1, 1);
        g2d.fillRect(66 + x, 61 + y, 1, 1);
        g2d.fillRect(24 + x, 63 + y, 1, 1);
        g2d.fillRect(63 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(252,154,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(12 + x, 10 + y, 1, 1);
        g2d.fillRect(75 + x, 10 + y, 1, 1);
        g2d.fillRect(12 + x, 12 + y, 1, 1);
        g2d.fillRect(75 + x, 12 + y, 1, 1);
        g2d.fillRect(13 + x, 14 + y, 1, 1);
        g2d.fillRect(74 + x, 14 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,254,152,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(11 + x, 9 + y, 1, 1);
        g2d.fillRect(76 + x, 9 + y, 1, 1);
        g2d.fillRect(10 + x, 10 + y, 1, 2);
        g2d.fillRect(77 + x, 10 + y, 1, 2);
        g2d.fillRect(9 + x, 12 + y, 1, 1);
        g2d.fillRect(78 + x, 12 + y, 1, 1);
        g2d.fillRect(8 + x, 13 + y, 1, 1);
        g2d.fillRect(79 + x, 13 + y, 1, 1);
        g2d.fillRect(13 + x, 16 + y, 1, 3);
        g2d.fillRect(74 + x, 16 + y, 1, 3);
        g2d.fillRect(14 + x, 18 + y, 1, 1);
        g2d.fillRect(73 + x, 18 + y, 1, 1);
        g2d.fillRect(10 + x, 19 + y, 3, 1);
        g2d.fillRect(75 + x, 19 + y, 3, 1);
        g2d.fillRect(11 + x, 25 + y, 2, 1);
        g2d.fillRect(75 + x, 25 + y, 2, 1);
        g2d.fillRect(7 + x, 26 + y, 1, 1);
        g2d.fillRect(80 + x, 26 + y, 1, 1);
        g2d.fillRect(33 + x, 42 + y, 1, 1);
        g2d.fillRect(54 + x, 42 + y, 1, 1);
        g2d.fillRect(32 + x, 43 + y, 1, 1);
        g2d.fillRect(55 + x, 43 + y, 1, 1);
        g2d.fillRect(29 + x, 44 + y, 1, 1);
        g2d.fillRect(58 + x, 44 + y, 1, 1);
        g2d.fillRect(26 + x, 48 + y, 1, 1);
        g2d.fillRect(61 + x, 48 + y, 1, 1);
        g2d.fillRect(21 + x, 56 + y, 1, 1);
        g2d.fillRect(66 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248,160,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(12 + x, 8 + y, 1, 2);
        g2d.fillRect(75 + x, 8 + y, 1, 2);
        g2d.fillRect(12 + x, 11 + y, 1, 1);
        g2d.fillRect(75 + x, 11 + y, 1, 1);
        g2d.fillRect(3 + x, 18 + y, 1, 1);
        g2d.fillRect(84 + x, 18 + y, 1, 1);
        g2d.fillRect(21 + x, 26 + y, 1, 1);
        g2d.fillRect(66 + x, 26 + y, 1, 1);
        g2d.fillRect(2 + x, 28 + y, 1, 1);
        g2d.fillRect(5 + x, 28 + y, 1, 1);
        g2d.fillRect(82 + x, 28 + y, 1, 1);
        g2d.fillRect(85 + x, 28 + y, 1, 1);
        g2d.fillRect(5 + x, 38 + y, 2, 1);
        g2d.fillRect(81 + x, 38 + y, 2, 1);
        g2d.fillRect(7 + x, 40 + y, 1, 1);
        g2d.fillRect(80 + x, 40 + y, 1, 1);
        g2d.fillRect(10 + x, 41 + y, 1, 1);
        g2d.fillRect(77 + x, 41 + y, 1, 1);
        g2d.fillRect(25 + x, 42 + y, 1, 1);
        g2d.fillRect(62 + x, 42 + y, 1, 1);
        g2d.fillRect(24 + x, 48 + y, 1, 2);
        g2d.fillRect(63 + x, 48 + y, 1, 2);
        g2d.fillRect(15 + x, 50 + y, 1, 1);
        g2d.fillRect(72 + x, 50 + y, 1, 1);
        g2d.fillRect(20 + x, 56 + y, 1, 1);
        g2d.fillRect(67 + x, 56 + y, 1, 1);
        g2d.fillRect(26 + x, 65 + y, 1, 1);
        g2d.fillRect(61 + x, 65 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(246,166,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(26 + x, 41 + y, 1, 1);
        g2d.fillRect(61 + x, 41 + y, 1, 1);
        g2d.fillRect(23 + x, 43 + y, 1, 1);
        g2d.fillRect(64 + x, 43 + y, 1, 1);
        g2d.fillRect(25 + x, 47 + y, 1, 1);
        g2d.fillRect(62 + x, 47 + y, 1, 1);
        g2d.fillRect(22 + x, 52 + y, 1, 1);
        g2d.fillRect(65 + x, 52 + y, 1, 1);
        g2d.fillRect(23 + x, 53 + y, 1, 1);
        g2d.fillRect(64 + x, 53 + y, 1, 1);
        g2d.fillRect(19 + x, 59 + y, 1, 1);
        g2d.fillRect(68 + x, 59 + y, 1, 1);
        g2d.fillRect(18 + x, 65 + y, 1, 1);
        g2d.fillRect(23 + x, 65 + y, 1, 1);
        g2d.fillRect(64 + x, 65 + y, 1, 1);
        g2d.fillRect(69 + x, 65 + y, 1, 1);
        g2d.fillRect(21 + x, 69 + y, 2, 1);
        g2d.fillRect(65 + x, 69 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213,203,254,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(9 + x, 25 + y, 1, 2);
        g2d.fillRect(10 + x, 25 + y, 1, 1);
        g2d.fillRect(77 + x, 25 + y, 2, 1);
        g2d.fillRect(78 + x, 26 + y, 1, 1);
        g2d.fillRect(6 + x, 29 + y, 1, 1);
        g2d.fillRect(81 + x, 29 + y, 1, 1);
        g2d.fillRect(23 + x, 59 + y, 1, 1);
        g2d.fillRect(64 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247,171,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(3 + x, 17 + y, 1, 1);
        g2d.fillRect(84 + x, 17 + y, 1, 1);
        g2d.fillRect(3 + x, 22 + y, 1, 1);
        g2d.fillRect(84 + x, 22 + y, 1, 1);
        g2d.fillRect(5 + x, 26 + y, 1, 2);
        g2d.fillRect(82 + x, 26 + y, 1, 2);
        g2d.fillRect(6 + x, 35 + y, 1, 1);
        g2d.fillRect(81 + x, 35 + y, 1, 1);
        g2d.fillRect(22 + x, 44 + y, 1, 1);
        g2d.fillRect(65 + x, 44 + y, 1, 1);
        g2d.fillRect(21 + x, 46 + y, 1, 1);
        g2d.fillRect(66 + x, 46 + y, 1, 1);
        g2d.fillRect(19 + x, 63 + y, 1, 2);
        g2d.fillRect(68 + x, 63 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,254,165,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(24 + x, 9 + y, 1, 1);
        g2d.fillRect(63 + x, 9 + y, 1, 1);
        g2d.fillRect(13 + x, 25 + y, 1, 1);
        g2d.fillRect(74 + x, 25 + y, 1, 1);
        g2d.fillRect(16 + x, 26 + y, 2, 1);
        g2d.fillRect(70 + x, 26 + y, 2, 1);
        g2d.fillRect(8 + x, 27 + y, 1, 2);
        g2d.fillRect(79 + x, 27 + y, 1, 2);
        g2d.fillRect(3 + x, 29 + y, 3, 1);
        g2d.fillRect(82 + x, 29 + y, 3, 1);
        g2d.fillRect(36 + x, 40 + y, 1, 1);
        g2d.fillRect(51 + x, 40 + y, 1, 1);
        g2d.fillRect(34 + x, 41 + y, 2, 1);
        g2d.fillRect(52 + x, 41 + y, 2, 1);
        g2d.fillRect(30 + x, 43 + y, 1, 1);
        g2d.fillRect(57 + x, 43 + y, 1, 1);
        g2d.fillRect(20 + x, 57 + y, 1, 1);
        g2d.fillRect(67 + x, 57 + y, 1, 1);
        g2d.fillRect(14 + x, 64 + y, 1, 1);
        g2d.fillRect(73 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249,174,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(8 + x, 21 + y, 1, 1);
        g2d.fillRect(79 + x, 21 + y, 1, 1);
        g2d.fillRect(11 + x, 22 + y, 1, 1);
        g2d.fillRect(76 + x, 22 + y, 1, 1);
        g2d.fillRect(4 + x, 23 + y, 1, 3);
        g2d.fillRect(83 + x, 23 + y, 1, 3);
        g2d.fillRect(22 + x, 25 + y, 1, 1);
        g2d.fillRect(65 + x, 25 + y, 1, 1);
        g2d.fillRect(7 + x, 39 + y, 1, 1);
        g2d.fillRect(80 + x, 39 + y, 1, 1);
        g2d.fillRect(22 + x, 60 + y, 1, 1);
        g2d.fillRect(27 + x, 60 + y, 1, 1);
        g2d.fillRect(60 + x, 60 + y, 1, 1);
        g2d.fillRect(65 + x, 60 + y, 1, 1);
        g2d.fillRect(26 + x, 61 + y, 1, 1);
        g2d.fillRect(61 + x, 61 + y, 1, 1);
        g2d.fillRect(20 + x, 70 + y, 1, 1);
        g2d.fillRect(67 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248,177,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(11 + x, 10 + y, 1, 4);
        g2d.fillRect(76 + x, 10 + y, 1, 4);
        g2d.fillRect(9 + x, 11 + y, 1, 1);
        g2d.fillRect(78 + x, 11 + y, 1, 1);
        g2d.fillRect(10 + x, 12 + y, 1, 2);
        g2d.fillRect(77 + x, 12 + y, 1, 2);
        g2d.fillRect(12 + x, 14 + y, 1, 1);
        g2d.fillRect(75 + x, 14 + y, 1, 1);
        g2d.fillRect(12 + x, 17 + y, 1, 2);
        g2d.fillRect(75 + x, 17 + y, 1, 2);
        g2d.fillRect(11 + x, 23 + y, 2, 1);
        g2d.fillRect(75 + x, 23 + y, 2, 1);
        g2d.fillRect(10 + x, 40 + y, 1, 1);
        g2d.fillRect(77 + x, 40 + y, 1, 1);
        g2d.fillRect(22 + x, 54 + y, 1, 1);
        g2d.fillRect(65 + x, 54 + y, 1, 1);
        g2d.fillRect(21 + x, 62 + y, 1, 1);
        g2d.fillRect(66 + x, 62 + y, 1, 1);
        g2d.fillRect(20 + x, 63 + y, 1, 1);
        g2d.fillRect(67 + x, 63 + y, 1, 1);
        g2d.fillRect(19 + x, 70 + y, 1, 1);
        g2d.fillRect(68 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(248,181,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(3 + x, 16 + y, 1, 1);
        g2d.fillRect(84 + x, 16 + y, 1, 1);
        g2d.fillRect(5 + x, 18 + y, 1, 1);
        g2d.fillRect(82 + x, 18 + y, 1, 1);
        g2d.fillRect(6 + x, 19 + y, 1, 1);
        g2d.fillRect(81 + x, 19 + y, 1, 1);
        g2d.fillRect(4 + x, 20 + y, 1, 1);
        g2d.fillRect(7 + x, 20 + y, 1, 1);
        g2d.fillRect(80 + x, 20 + y, 1, 1);
        g2d.fillRect(83 + x, 20 + y, 1, 1);
        g2d.fillRect(9 + x, 21 + y, 1, 1);
        g2d.fillRect(78 + x, 21 + y, 1, 1);
        g2d.fillRect(10 + x, 22 + y, 1, 1);
        g2d.fillRect(77 + x, 22 + y, 1, 1);
        g2d.fillRect(20 + x, 25 + y, 1, 1);
        g2d.fillRect(67 + x, 25 + y, 1, 1);
        g2d.fillRect(6 + x, 31 + y, 1, 1);
        g2d.fillRect(81 + x, 31 + y, 1, 1);
        g2d.fillRect(8 + x, 39 + y, 1, 1);
        g2d.fillRect(79 + x, 39 + y, 1, 1);
        g2d.fillRect(14 + x, 49 + y, 1, 1);
        g2d.fillRect(73 + x, 49 + y, 1, 1);
        g2d.fillRect(27 + x, 58 + y, 1, 2);
        g2d.fillRect(60 + x, 58 + y, 1, 2);
        g2d.fillRect(19 + x, 60 + y, 1, 1);
        g2d.fillRect(26 + x, 60 + y, 1, 1);
        g2d.fillRect(61 + x, 60 + y, 1, 1);
        g2d.fillRect(68 + x, 60 + y, 1, 1);
        g2d.fillRect(20 + x, 64 + y, 1, 1);
        g2d.fillRect(67 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249,187,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, 20 + y, 1, 1);
        g2d.fillRect(81 + x, 20 + y, 1, 1);
        g2d.fillRect(4 + x, 21 + y, 1, 1);
        g2d.fillRect(83 + x, 21 + y, 1, 1);
        g2d.fillRect(8 + x, 22 + y, 2, 1);
        g2d.fillRect(78 + x, 22 + y, 2, 1);
        g2d.fillRect(12 + x, 24 + y, 1, 1);
        g2d.fillRect(75 + x, 24 + y, 1, 1);
        g2d.fillRect(5 + x, 25 + y, 1, 1);
        g2d.fillRect(19 + x, 25 + y, 1, 1);
        g2d.fillRect(68 + x, 25 + y, 1, 1);
        g2d.fillRect(82 + x, 25 + y, 1, 1);
        g2d.fillRect(17 + x, 27 + y, 1, 1);
        g2d.fillRect(70 + x, 27 + y, 1, 1);
        g2d.fillRect(19 + x, 28 + y, 1, 1);
        g2d.fillRect(68 + x, 28 + y, 1, 1);
        g2d.fillRect(7 + x, 37 + y, 3, 1);
        g2d.fillRect(78 + x, 37 + y, 3, 1);
        g2d.fillRect(9 + x, 39 + y, 1, 1);
        g2d.fillRect(78 + x, 39 + y, 1, 1);
        g2d.fillRect(18 + x, 48 + y, 1, 1);
        g2d.fillRect(69 + x, 48 + y, 1, 1);
        g2d.fillRect(14 + x, 50 + y, 1, 1);
        g2d.fillRect(73 + x, 50 + y, 1, 1);
        g2d.fillRect(22 + x, 55 + y, 1, 1);
        g2d.fillRect(65 + x, 55 + y, 1, 1);
        g2d.fillRect(19 + x, 62 + y, 1, 1);
        g2d.fillRect(68 + x, 62 + y, 1, 1);
        g2d.fillRect(25 + x, 64 + y, 1, 2);
        g2d.fillRect(62 + x, 64 + y, 1, 2);
        g2d.fillRect(10 + x, 72 + y, 1, 1);
        g2d.fillRect(77 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,254,183,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 26 + y, 2, 1);
        g2d.fillRect(72 + x, 26 + y, 2, 1);
        g2d.fillRect(16 + x, 27 + y, 1, 2);
        g2d.fillRect(18 + x, 27 + y, 2, 1);
        g2d.fillRect(68 + x, 27 + y, 2, 1);
        g2d.fillRect(71 + x, 27 + y, 1, 2);
        g2d.fillRect(2 + x, 29 + y, 1, 1);
        g2d.fillRect(8 + x, 29 + y, 1, 2);
        g2d.fillRect(79 + x, 29 + y, 1, 2);
        g2d.fillRect(85 + x, 29 + y, 1, 1);
        g2d.fillRect(6 + x, 30 + y, 2, 1);
        g2d.fillRect(80 + x, 30 + y, 2, 1);
        g2d.fillRect(36 + x, 39 + y, 1, 1);
        g2d.fillRect(51 + x, 39 + y, 1, 1);
        g2d.fillRect(30 + x, 42 + y, 1, 1);
        g2d.fillRect(57 + x, 42 + y, 1, 1);
        g2d.fillRect(23 + x, 46 + y, 1, 1);
        g2d.fillRect(64 + x, 46 + y, 1, 1);
        g2d.fillRect(21 + x, 53 + y, 1, 1);
        g2d.fillRect(66 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249,194,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(5 + x, 21 + y, 1, 1);
        g2d.fillRect(7 + x, 21 + y, 1, 1);
        g2d.fillRect(80 + x, 21 + y, 1, 1);
        g2d.fillRect(82 + x, 21 + y, 1, 1);
        g2d.fillRect(10 + x, 23 + y, 1, 1);
        g2d.fillRect(77 + x, 23 + y, 1, 1);
        g2d.fillRect(11 + x, 24 + y, 1, 1);
        g2d.fillRect(13 + x, 24 + y, 2, 1);
        g2d.fillRect(73 + x, 24 + y, 2, 1);
        g2d.fillRect(76 + x, 24 + y, 1, 1);
        g2d.fillRect(15 + x, 25 + y, 1, 1);
        g2d.fillRect(72 + x, 25 + y, 1, 1);
        g2d.fillRect(6 + x, 28 + y, 1, 1);
        g2d.fillRect(81 + x, 28 + y, 1, 1);
        g2d.fillRect(7 + x, 29 + y, 1, 1);
        g2d.fillRect(80 + x, 29 + y, 1, 1);
        g2d.fillRect(7 + x, 32 + y, 1, 1);
        g2d.fillRect(80 + x, 32 + y, 1, 1);
        g2d.fillRect(9 + x, 33 + y, 1, 1);
        g2d.fillRect(78 + x, 33 + y, 1, 1);
        g2d.fillRect(6 + x, 37 + y, 1, 1);
        g2d.fillRect(10 + x, 37 + y, 1, 1);
        g2d.fillRect(77 + x, 37 + y, 1, 1);
        g2d.fillRect(81 + x, 37 + y, 1, 1);
        g2d.fillRect(11 + x, 41 + y, 1, 1);
        g2d.fillRect(76 + x, 41 + y, 1, 1);
        g2d.fillRect(13 + x, 43 + y, 1, 1);
        g2d.fillRect(74 + x, 43 + y, 1, 1);
        g2d.fillRect(19 + x, 47 + y, 1, 1);
        g2d.fillRect(68 + x, 47 + y, 1, 1);
        g2d.fillRect(13 + x, 50 + y, 1, 1);
        g2d.fillRect(74 + x, 50 + y, 1, 1);
        g2d.fillRect(19 + x, 61 + y, 1, 1);
        g2d.fillRect(68 + x, 61 + y, 1, 1);
        g2d.fillRect(19 + x, 66 + y, 1, 1);
        g2d.fillRect(25 + x, 66 + y, 1, 1);
        g2d.fillRect(62 + x, 66 + y, 1, 1);
        g2d.fillRect(68 + x, 66 + y, 1, 1);
        g2d.fillRect(18 + x, 67 + y, 1, 1);
        g2d.fillRect(69 + x, 67 + y, 1, 1);
        g2d.fillRect(17 + x, 68 + y, 1, 1);
        g2d.fillRect(19 + x, 68 + y, 1, 1);
        g2d.fillRect(68 + x, 68 + y, 1, 1);
        g2d.fillRect(70 + x, 68 + y, 1, 1);
        g2d.fillRect(16 + x, 70 + y, 2, 1);
        g2d.fillRect(70 + x, 70 + y, 1, 2);
        g2d.fillRect(71 + x, 70 + y, 1, 1);
        g2d.fillRect(17 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,254,196,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(20 + x, 27 + y, 1, 2);
        g2d.fillRect(67 + x, 27 + y, 1, 2);
        g2d.fillRect(11 + x, 29 + y, 3, 1);
        g2d.fillRect(17 + x, 29 + y, 1, 1);
        g2d.fillRect(21 + x, 29 + y, 1, 1);
        g2d.fillRect(66 + x, 29 + y, 1, 1);
        g2d.fillRect(70 + x, 29 + y, 1, 1);
        g2d.fillRect(74 + x, 29 + y, 3, 1);
        g2d.fillRect(10 + x, 30 + y, 1, 1);
        g2d.fillRect(77 + x, 30 + y, 1, 1);
        g2d.fillRect(8 + x, 31 + y, 2, 1);
        g2d.fillRect(78 + x, 31 + y, 2, 1);
        g2d.fillRect(34 + x, 39 + y, 2, 1);
        g2d.fillRect(52 + x, 39 + y, 2, 1);
        g2d.fillRect(24 + x, 45 + y, 1, 1);
        g2d.fillRect(63 + x, 45 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(225,226,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(7 + x, 24 + y, 2, 1);
        g2d.fillRect(79 + x, 24 + y, 1, 2);
        g2d.fillRect(80 + x, 24 + y, 1, 1);
        g2d.fillRect(8 + x, 25 + y, 1, 1);
        g2d.fillRect(23 + x, 61 + y, 1, 1);
        g2d.fillRect(64 + x, 61 + y, 1, 1);
        g2d.fillRect(24 + x, 62 + y, 1, 1);
        g2d.fillRect(63 + x, 62 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(250,202,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(3 + x, 0 + y, 3, 1);
        g2d.fillRect(82 + x, 0 + y, 3, 1);
        g2d.fillRect(2 + x, 1 + y, 1, 3);
        g2d.fillRect(6 + x, 1 + y, 1, 3);
        g2d.fillRect(81 + x, 1 + y, 1, 3);
        g2d.fillRect(85 + x, 1 + y, 1, 3);
        g2d.fillRect(1 + x, 2 + y, 1, 1);
        g2d.fillRect(3 + x, 2 + y, 1, 1);
        g2d.fillRect(84 + x, 2 + y, 1, 1);
        g2d.fillRect(86 + x, 2 + y, 1, 1);
        g2d.fillRect(0 + x, 3 + y, 1, 3);
        g2d.fillRect(4 + x, 3 + y, 1, 3);
        g2d.fillRect(83 + x, 3 + y, 1, 3);
        g2d.fillRect(87 + x, 3 + y, 1, 3);
        g2d.fillRect(3 + x, 4 + y, 1, 1);
        g2d.fillRect(5 + x, 4 + y, 1, 1);
        g2d.fillRect(82 + x, 4 + y, 1, 1);
        g2d.fillRect(84 + x, 4 + y, 1, 1);
        g2d.fillRect(1 + x, 6 + y, 3, 1);
        g2d.fillRect(84 + x, 6 + y, 3, 1);
        g2d.fillRect(4 + x, 10 + y, 1, 1);
        g2d.fillRect(83 + x, 10 + y, 1, 1);
        g2d.fillRect(5 + x, 11 + y, 1, 1);
        g2d.fillRect(82 + x, 11 + y, 1, 1);
        g2d.fillRect(5 + x, 22 + y, 1, 1);
        g2d.fillRect(82 + x, 22 + y, 1, 1);
        g2d.fillRect(9 + x, 23 + y, 1, 1);
        g2d.fillRect(78 + x, 23 + y, 1, 1);
        g2d.fillRect(5 + x, 24 + y, 1, 1);
        g2d.fillRect(82 + x, 24 + y, 1, 1);
        g2d.fillRect(6 + x, 25 + y, 1, 3);
        g2d.fillRect(14 + x, 25 + y, 1, 1);
        g2d.fillRect(73 + x, 25 + y, 1, 1);
        g2d.fillRect(81 + x, 25 + y, 1, 3);
        g2d.fillRect(7 + x, 28 + y, 1, 1);
        g2d.fillRect(80 + x, 28 + y, 1, 1);
        g2d.fillRect(11 + x, 30 + y, 1, 1);
        g2d.fillRect(76 + x, 30 + y, 1, 1);
        g2d.fillRect(17 + x, 47 + y, 1, 2);
        g2d.fillRect(18 + x, 47 + y, 1, 1);
        g2d.fillRect(69 + x, 47 + y, 2, 1);
        g2d.fillRect(70 + x, 48 + y, 1, 1);
        g2d.fillRect(21 + x, 54 + y, 1, 2);
        g2d.fillRect(66 + x, 54 + y, 1, 2);
        g2d.fillRect(21 + x, 57 + y, 1, 2);
        g2d.fillRect(22 + x, 57 + y, 1, 1);
        g2d.fillRect(65 + x, 57 + y, 2, 1);
        g2d.fillRect(66 + x, 58 + y, 1, 1);
        g2d.fillRect(24 + x, 66 + y, 1, 1);
        g2d.fillRect(63 + x, 66 + y, 1, 1);
        g2d.fillRect(17 + x, 69 + y, 2, 1);
        g2d.fillRect(69 + x, 69 + y, 2, 1);
        g2d.fillRect(16 + x, 71 + y, 1, 1);
        g2d.fillRect(71 + x, 71 + y, 1, 1);
        g2d.fillRect(11 + x, 72 + y, 1, 1);
        g2d.fillRect(76 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251,209,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(6 + x, 23 + y, 1, 1);
        g2d.fillRect(18 + x, 23 + y, 1, 1);
        g2d.fillRect(69 + x, 23 + y, 1, 1);
        g2d.fillRect(81 + x, 23 + y, 1, 1);
        g2d.fillRect(7 + x, 27 + y, 1, 1);
        g2d.fillRect(80 + x, 27 + y, 1, 1);
        g2d.fillRect(9 + x, 29 + y, 1, 2);
        g2d.fillRect(10 + x, 29 + y, 1, 1);
        g2d.fillRect(77 + x, 29 + y, 2, 1);
        g2d.fillRect(12 + x, 30 + y, 1, 1);
        g2d.fillRect(75 + x, 30 + y, 1, 1);
        g2d.fillRect(78 + x, 30 + y, 1, 1);
        g2d.fillRect(19 + x, 36 + y, 1, 2);
        g2d.fillRect(20 + x, 36 + y, 1, 1);
        g2d.fillRect(67 + x, 36 + y, 2, 1);
        g2d.fillRect(68 + x, 37 + y, 1, 1);
        g2d.fillRect(11 + x, 38 + y, 1, 1);
        g2d.fillRect(16 + x, 38 + y, 1, 2);
        g2d.fillRect(17 + x, 38 + y, 1, 2);
        g2d.fillRect(18 + x, 38 + y, 1, 1);
        g2d.fillRect(69 + x, 38 + y, 3, 1);
        g2d.fillRect(76 + x, 38 + y, 1, 1);
        g2d.fillRect(70 + x, 39 + y, 2, 1);
        g2d.fillRect(14 + x, 43 + y, 1, 2);
        g2d.fillRect(73 + x, 43 + y, 1, 2);
        g2d.fillRect(15 + x, 45 + y, 1, 1);
        g2d.fillRect(20 + x, 45 + y, 1, 1);
        g2d.fillRect(67 + x, 45 + y, 1, 1);
        g2d.fillRect(72 + x, 45 + y, 1, 1);
        g2d.fillRect(17 + x, 46 + y, 3, 1);
        g2d.fillRect(68 + x, 46 + y, 3, 1);
        g2d.fillRect(16 + x, 47 + y, 1, 2);
        g2d.fillRect(71 + x, 47 + y, 1, 2);
        g2d.fillRect(20 + x, 59 + y, 2, 1);
        g2d.fillRect(66 + x, 59 + y, 2, 1);
        g2d.fillRect(24 + x, 65 + y, 1, 1);
        g2d.fillRect(63 + x, 65 + y, 1, 1);
        g2d.fillRect(23 + x, 67 + y, 1, 1);
        g2d.fillRect(64 + x, 67 + y, 1, 1);
        g2d.fillRect(15 + x, 71 + y, 1, 1);
        g2d.fillRect(72 + x, 71 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,254,209,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 30 + y, 2, 1);
        g2d.fillRect(17 + x, 30 + y, 1, 1);
        g2d.fillRect(22 + x, 30 + y, 1, 1);
        g2d.fillRect(65 + x, 30 + y, 1, 1);
        g2d.fillRect(70 + x, 30 + y, 1, 1);
        g2d.fillRect(72 + x, 30 + y, 2, 1);
        g2d.fillRect(16 + x, 31 + y, 1, 1);
        g2d.fillRect(71 + x, 31 + y, 1, 1);
        g2d.fillRect(9 + x, 32 + y, 1, 1);
        g2d.fillRect(78 + x, 32 + y, 1, 1);
        g2d.fillRect(24 + x, 44 + y, 1, 1);
        g2d.fillRect(63 + x, 44 + y, 1, 1);
        g2d.fillRect(19 + x, 48 + y, 1, 1);
        g2d.fillRect(68 + x, 48 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251,217,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(12 + x, 20 + y, 1, 1);
        g2d.fillRect(75 + x, 20 + y, 1, 1);
        g2d.fillRect(19 + x, 23 + y, 1, 1);
        g2d.fillRect(68 + x, 23 + y, 1, 1);
        g2d.fillRect(8 + x, 26 + y, 1, 1);
        g2d.fillRect(79 + x, 26 + y, 1, 1);
        g2d.fillRect(9 + x, 27 + y, 1, 2);
        g2d.fillRect(78 + x, 27 + y, 1, 2);
        g2d.fillRect(10 + x, 28 + y, 1, 1);
        g2d.fillRect(77 + x, 28 + y, 1, 1);
        g2d.fillRect(12 + x, 38 + y, 1, 2);
        g2d.fillRect(13 + x, 38 + y, 1, 2);
        g2d.fillRect(14 + x, 38 + y, 1, 2);
        g2d.fillRect(15 + x, 38 + y, 1, 2);
        g2d.fillRect(72 + x, 38 + y, 1, 2);
        g2d.fillRect(73 + x, 38 + y, 1, 2);
        g2d.fillRect(74 + x, 38 + y, 1, 2);
        g2d.fillRect(75 + x, 38 + y, 1, 2);
        g2d.fillRect(15 + x, 44 + y, 2, 1);
        g2d.fillRect(71 + x, 44 + y, 1, 2);
        g2d.fillRect(72 + x, 44 + y, 1, 1);
        g2d.fillRect(16 + x, 45 + y, 1, 1);
        g2d.fillRect(15 + x, 49 + y, 1, 1);
        g2d.fillRect(72 + x, 49 + y, 1, 1);
        g2d.fillRect(20 + x, 60 + y, 1, 3);
        g2d.fillRect(67 + x, 60 + y, 1, 3);
        g2d.fillRect(23 + x, 66 + y, 1, 1);
        g2d.fillRect(64 + x, 66 + y, 1, 1);
        g2d.fillRect(22 + x, 68 + y, 1, 1);
        g2d.fillRect(65 + x, 68 + y, 1, 1);
        g2d.fillRect(20 + x, 69 + y, 1, 1);
        g2d.fillRect(67 + x, 69 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,254,221,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(21 + x, 24 + y, 1, 2);
        g2d.fillRect(66 + x, 24 + y, 1, 2);
        g2d.fillRect(22 + x, 26 + y, 1, 2);
        g2d.fillRect(65 + x, 26 + y, 1, 2);
        g2d.fillRect(23 + x, 27 + y, 3, 1);
        g2d.fillRect(62 + x, 27 + y, 3, 1);
        g2d.fillRect(17 + x, 31 + y, 1, 1);
        g2d.fillRect(22 + x, 31 + y, 1, 1);
        g2d.fillRect(65 + x, 31 + y, 1, 1);
        g2d.fillRect(70 + x, 31 + y, 1, 1);
        g2d.fillRect(10 + x, 33 + y, 1, 1);
        g2d.fillRect(77 + x, 33 + y, 1, 1);
        g2d.fillRect(32 + x, 38 + y, 2, 1);
        g2d.fillRect(54 + x, 38 + y, 2, 1);
        g2d.fillRect(24 + x, 43 + y, 1, 1);
        g2d.fillRect(63 + x, 43 + y, 1, 1);
        g2d.fillRect(21 + x, 44 + y, 1, 2);
        g2d.fillRect(66 + x, 44 + y, 1, 2);
        g2d.fillRect(20 + x, 46 + y, 1, 2);
        g2d.fillRect(67 + x, 46 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237,240,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(4 + x, 19 + y, 1, 1);
        g2d.fillRect(83 + x, 19 + y, 1, 1);
        g2d.fillRect(6 + x, 22 + y, 1, 1);
        g2d.fillRect(81 + x, 22 + y, 1, 1);
        g2d.fillRect(7 + x, 23 + y, 1, 1);
        g2d.fillRect(80 + x, 23 + y, 1, 1);
        g2d.fillRect(23 + x, 63 + y, 1, 1);
        g2d.fillRect(64 + x, 63 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,229,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(13 + x, 19 + y, 1, 3);
        g2d.fillRect(74 + x, 19 + y, 1, 3);
        g2d.fillRect(14 + x, 21 + y, 1, 1);
        g2d.fillRect(73 + x, 21 + y, 1, 1);
        g2d.fillRect(16 + x, 22 + y, 3, 1);
        g2d.fillRect(69 + x, 22 + y, 3, 1);
        g2d.fillRect(22 + x, 67 + y, 1, 1);
        g2d.fillRect(65 + x, 67 + y, 1, 1);
        g2d.fillRect(21 + x, 68 + y, 1, 1);
        g2d.fillRect(66 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,229,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(18 + x, 32 + y, 2, 1);
        g2d.fillRect(68 + x, 32 + y, 2, 1);
        g2d.fillRect(11 + x, 34 + y, 2, 1);
        g2d.fillRect(75 + x, 34 + y, 2, 1);
        g2d.fillRect(9 + x, 35 + y, 2, 1);
        g2d.fillRect(77 + x, 35 + y, 2, 1);
        g2d.fillRect(8 + x, 36 + y, 1, 1);
        g2d.fillRect(79 + x, 36 + y, 1, 1);
        g2d.fillRect(24 + x, 42 + y, 1, 1);
        g2d.fillRect(63 + x, 42 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(242,245,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(22 + x, 62 + y, 1, 1);
        g2d.fillRect(65 + x, 62 + y, 1, 1);
        g2d.fillRect(21 + x, 63 + y, 1, 1);
        g2d.fillRect(66 + x, 63 + y, 1, 1);
        g2d.fillRect(22 + x, 64 + y, 1, 1);
        g2d.fillRect(65 + x, 64 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,235,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(27 + x, 31 + y, 1, 1);
        g2d.fillRect(60 + x, 31 + y, 1, 1);
        g2d.fillRect(23 + x, 32 + y, 1, 1);
        g2d.fillRect(64 + x, 32 + y, 1, 1);
        g2d.fillRect(18 + x, 33 + y, 2, 1);
        g2d.fillRect(21 + x, 33 + y, 2, 1);
        g2d.fillRect(65 + x, 33 + y, 2, 1);
        g2d.fillRect(68 + x, 33 + y, 2, 1);
        g2d.fillRect(13 + x, 34 + y, 1, 2);
        g2d.fillRect(14 + x, 34 + y, 4, 1);
        g2d.fillRect(70 + x, 34 + y, 5, 1);
        g2d.fillRect(74 + x, 35 + y, 1, 1);
        g2d.fillRect(7 + x, 36 + y, 1, 1);
        g2d.fillRect(80 + x, 36 + y, 1, 1);
        g2d.fillRect(32 + x, 37 + y, 1, 1);
        g2d.fillRect(55 + x, 37 + y, 1, 1);
        g2d.fillRect(25 + x, 41 + y, 1, 1);
        g2d.fillRect(62 + x, 41 + y, 1, 1);
        g2d.fillRect(22 + x, 42 + y, 1, 1);
        g2d.fillRect(65 + x, 42 + y, 1, 1);
        g2d.fillRect(21 + x, 43 + y, 1, 1);
        g2d.fillRect(66 + x, 43 + y, 1, 1);
        g2d.fillRect(20 + x, 44 + y, 1, 1);
        g2d.fillRect(67 + x, 44 + y, 1, 1);
        g2d.fillRect(18 + x, 45 + y, 2, 1);
        g2d.fillRect(68 + x, 45 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,240,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(15 + x, 19 + y, 1, 2);
        g2d.fillRect(72 + x, 19 + y, 1, 2);
        g2d.fillRect(16 + x, 20 + y, 1, 2);
        g2d.fillRect(71 + x, 20 + y, 1, 2);
        g2d.fillRect(17 + x, 21 + y, 1, 1);
        g2d.fillRect(70 + x, 21 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,242,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(26 + x, 32 + y, 1, 1);
        g2d.fillRect(61 + x, 32 + y, 1, 1);
        g2d.fillRect(20 + x, 33 + y, 1, 1);
        g2d.fillRect(23 + x, 33 + y, 3, 1);
        g2d.fillRect(62 + x, 33 + y, 3, 1);
        g2d.fillRect(67 + x, 33 + y, 1, 1);
        g2d.fillRect(22 + x, 34 + y, 1, 1);
        g2d.fillRect(65 + x, 34 + y, 1, 1);
        g2d.fillRect(6 + x, 36 + y, 1, 1);
        g2d.fillRect(12 + x, 36 + y, 1, 2);
        g2d.fillRect(33 + x, 36 + y, 1, 1);
        g2d.fillRect(54 + x, 36 + y, 1, 1);
        g2d.fillRect(75 + x, 36 + y, 1, 2);
        g2d.fillRect(81 + x, 36 + y, 1, 1);
        g2d.fillRect(11 + x, 37 + y, 1, 1);
        g2d.fillRect(30 + x, 37 + y, 2, 1);
        g2d.fillRect(56 + x, 37 + y, 2, 1);
        g2d.fillRect(76 + x, 37 + y, 1, 1);
        g2d.fillRect(7 + x, 38 + y, 4, 1);
        g2d.fillRect(27 + x, 38 + y, 3, 1);
        g2d.fillRect(58 + x, 38 + y, 3, 1);
        g2d.fillRect(77 + x, 38 + y, 4, 1);
        g2d.fillRect(3 + x, 39 + y, 4, 1);
        g2d.fillRect(81 + x, 39 + y, 4, 1);
        g2d.fillRect(25 + x, 40 + y, 1, 1);
        g2d.fillRect(62 + x, 40 + y, 1, 1);
        g2d.fillRect(22 + x, 41 + y, 1, 1);
        g2d.fillRect(65 + x, 41 + y, 1, 1);
        g2d.fillRect(17 + x, 45 + y, 1, 1);
        g2d.fillRect(70 + x, 45 + y, 1, 1);
        g2d.fillRect(14 + x, 46 + y, 3, 1);
        g2d.fillRect(71 + x, 46 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(249,249,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(20 + x, 66 + y, 1, 2);
        g2d.fillRect(21 + x, 66 + y, 1, 1);
        g2d.fillRect(66 + x, 66 + y, 2, 1);
        g2d.fillRect(19 + x, 67 + y, 1, 1);
        g2d.fillRect(67 + x, 67 + y, 2, 1);
        g2d.fillRect(18 + x, 68 + y, 1, 1);
        g2d.fillRect(69 + x, 68 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,249,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(14 + x, 19 + y, 1, 2);
        g2d.fillRect(73 + x, 19 + y, 1, 2);
        g2d.fillRect(15 + x, 21 + y, 1, 2);
        g2d.fillRect(72 + x, 21 + y, 1, 2);
        g2d.fillRect(16 + x, 23 + y, 2, 1);
        g2d.fillRect(70 + x, 23 + y, 2, 1);
        g2d.fillRect(18 + x, 24 + y, 3, 1);
        g2d.fillRect(67 + x, 24 + y, 3, 1);
        g2d.fillRect(29 + x, 33 + y, 2, 1);
        g2d.fillRect(57 + x, 33 + y, 2, 1);
        g2d.fillRect(26 + x, 34 + y, 2, 1);
        g2d.fillRect(34 + x, 34 + y, 1, 1);
        g2d.fillRect(53 + x, 34 + y, 1, 1);
        g2d.fillRect(60 + x, 34 + y, 2, 1);
        g2d.fillRect(23 + x, 35 + y, 1, 1);
        g2d.fillRect(33 + x, 35 + y, 1, 1);
        g2d.fillRect(54 + x, 35 + y, 1, 1);
        g2d.fillRect(64 + x, 35 + y, 1, 1);
        g2d.fillRect(13 + x, 37 + y, 5, 1);
        g2d.fillRect(70 + x, 37 + y, 5, 1);
        g2d.fillRect(26 + x, 38 + y, 1, 1);
        g2d.fillRect(61 + x, 38 + y, 1, 1);
        g2d.fillRect(2 + x, 39 + y, 1, 1);
        g2d.fillRect(24 + x, 39 + y, 2, 1);
        g2d.fillRect(62 + x, 39 + y, 2, 1);
        g2d.fillRect(85 + x, 39 + y, 1, 1);
        g2d.fillRect(23 + x, 40 + y, 1, 1);
        g2d.fillRect(64 + x, 40 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(31 + x, 33 + y, 1, 1);
        g2d.fillRect(56 + x, 33 + y, 1, 1);
        g2d.fillRect(28 + x, 34 + y, 1, 1);
        g2d.fillRect(59 + x, 34 + y, 1, 1);
        g2d.fillRect(23 + x, 36 + y, 1, 1);
        g2d.fillRect(64 + x, 36 + y, 1, 1);
        g2d.fillRect(18 + x, 37 + y, 1, 1);
        g2d.fillRect(24 + x, 37 + y, 2, 1);
        g2d.fillRect(62 + x, 37 + y, 1, 2);
        g2d.fillRect(63 + x, 37 + y, 1, 1);
        g2d.fillRect(69 + x, 37 + y, 1, 1);
        g2d.fillRect(19 + x, 38 + y, 1, 2);
        g2d.fillRect(20 + x, 38 + y, 1, 1);
        g2d.fillRect(25 + x, 38 + y, 1, 1);
        g2d.fillRect(67 + x, 38 + y, 2, 1);
        g2d.fillRect(21 + x, 39 + y, 2, 1);
        g2d.fillRect(65 + x, 39 + y, 2, 1);
        g2d.fillRect(68 + x, 39 + y, 1, 1);
        g2d.fillRect(17 + x, 40 + y, 2, 1);
        g2d.fillRect(69 + x, 40 + y, 2, 1);
        g2d.fillRect(13 + x, 41 + y, 4, 1);
        g2d.fillRect(71 + x, 41 + y, 4, 1);
        g2d.fillRect(10 + x, 42 + y, 3, 1);
        g2d.fillRect(19 + x, 42 + y, 1, 1);
        g2d.fillRect(68 + x, 42 + y, 1, 1);
        g2d.fillRect(75 + x, 42 + y, 3, 1);
        g2d.fillRect(22 + x, 59 + y, 1, 1);
        g2d.fillRect(65 + x, 59 + y, 1, 1);
        g2d.fillRect(21 + x, 60 + y, 1, 1);
        g2d.fillRect(23 + x, 60 + y, 1, 1);
        g2d.fillRect(64 + x, 60 + y, 1, 1);
        g2d.fillRect(66 + x, 60 + y, 1, 1);
        g2d.fillRect(22 + x, 61 + y, 1, 1);
        g2d.fillRect(65 + x, 61 + y, 1, 1);
        g2d.fillRect(26 + x, 64 + y, 1, 1);
        g2d.fillRect(61 + x, 64 + y, 1, 1);
        g2d.fillRect(24 + x, 67 + y, 1, 1);
        g2d.fillRect(63 + x, 67 + y, 1, 1);
    }
}
