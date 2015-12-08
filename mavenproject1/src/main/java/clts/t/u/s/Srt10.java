/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.s;

import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Srt10 extends clts.SuperTU
{
    public Srt10()
    {
        super();
        prep = true;
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt10(String middle)
    {
        super(middle, 3);
        prep = true;
        containsTL = true;
    }

    public Srt10(String middle, int layer)
    {
        super(middle, layer);
        prep = true;
        containsTL = true;
    }

    public Srt10(String middle, ColorArray colorSwitch)
    {
        super(middle, 3, colorSwitch);
        prep = true;
        containsTL = true;
    }

    public Srt10(String middle, int layer, ColorArray colorSwitch)
    {
        super(middle, layer, colorSwitch);
        prep = true;
        containsTL = true;
    }

    int leftA = 0;
    int rightA = 0;
    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        leftA = leftArm;
        rightA = rightArm;
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 46 + y, 1, 6);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(107 + x, 47 + y, 1, 6);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 4);
        g2d.fillRect(113 + x, 47 + y, 1, 3);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 6);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 6);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 6);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 7);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 4);
        g2d.fillRect(106 + x, 49 + y, 1, 4);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 50 + y, 1, 4);
        g2d.fillRect(102 + x, 51 + y, 1, 4);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 57 + y, 2, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 47 + y, 1, 6);
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 11);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 11);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 10);
        g2d.fillRect(113 + x, 50 + y, 1, 3);
        g2d.fillRect(114 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 8);
        g2d.fillRect(109 + x, 52 + y, 1, 6);
        g2d.fillRect(110 + x, 52 + y, 1, 6);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 5);
        g2d.fillRect(108 + x, 53 + y, 1, 5);
        g2d.fillRect(114 + x, 53 + y, 1, 6);
        g2d.fillRect(116 + x, 53 + y, 1, 6);
        g2d.fillRect(105 + x, 54 + y, 1, 4);
        g2d.fillRect(106 + x, 54 + y, 1, 4);
        g2d.fillRect(113 + x, 54 + y, 1, 5);
        g2d.fillRect(115 + x, 54 + y, 1, 5);
        g2d.fillRect(117 + x, 54 + y, 1, 5);
        g2d.fillRect(103 + x, 55 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 2, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(116 + x, 41 + y, 2, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 7);
        g2d.fillRect(117 + x, 42 + y, 1, 5);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(113 + x, 44 + y, 1, 5);
        g2d.fillRect(111 + x, 45 + y, 1, 4);
        g2d.fillRect(112 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 6);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 9);
        g2d.fillRect(99 + x, 54 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 2, 1);
        g2d.fillRect(113 + x, 58 + y, 2, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 2, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 1, 2);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 2, 1);
        g2d.fillRect(108 + x, 62 + y, 2, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 2);
        g2d.fillRect(118 + x, 62 + y, 1, 1);
        g2d.fillRect(101 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 3, 1);
        g2d.fillRect(106 + x, 64 + y, 2, 1);
        g2d.fillRect(102 + x, 65 + y, 1, 2);
        g2d.fillRect(103 + x, 65 + y, 3, 1);
        g2d.fillRect(113 + x, 65 + y, 4, 1);
        g2d.fillRect(111 + x, 66 + y, 2, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 2);
        g2d.fillRect(117 + x, 66 + y, 1, 1);
        g2d.fillRect(103 + x, 67 + y, 4, 1);
        g2d.fillRect(114 + x, 67 + y, 2, 1);
        g2d.fillRect(107 + x, 68 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 44 + y, 1, 4);
        g2d.fillRect(112 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 8, 1);
        g2d.fillRect(102 + x, 60 + y, 4, 1);
        g2d.fillRect(113 + x, 60 + y, 5, 1);
        g2d.fillRect(103 + x, 61 + y, 3, 1);
        g2d.fillRect(114 + x, 61 + y, 3, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 2, 1);
        g2d.fillRect(114 + x, 66 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 42 + y, 1, 5);
        g2d.fillRect(118 + x, 43 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 2, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 2, 1);
        g2d.fillRect(120 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 4);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 8);
        g2d.fillRect(111 + x, 60 + y, 1, 6);
        g2d.fillRect(112 + x, 60 + y, 1, 6);
        g2d.fillRect(118 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(105 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 2);
        g2d.fillRect(103 + x, 63 + y, 1, 2);
        g2d.fillRect(104 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 5);
        g2d.fillRect(109 + x, 63 + y, 1, 5);
        g2d.fillRect(113 + x, 64 + y, 2, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 1, 3);
        g2d.fillRect(103 + x, 66 + y, 3, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 67 + y, 2, 1);
    }

    public void drawSleevesLeft3(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 2, 1);
        g2d.fillRect(94 + x, 54 + y, 2, 1);
        g2d.fillRect(97 + x, 54 + y, 1, 4);
        g2d.fillRect(93 + x, 55 + y, 1, 6);
        g2d.fillRect(95 + x, 55 + y, 1, 4);
        g2d.fillRect(98 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 56 + y, 1, 7);
        g2d.fillRect(90 + x, 58 + y, 1, 4);
        g2d.fillRect(96 + x, 58 + y, 1, 1);
        g2d.fillRect(89 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(88 + x, 60 + y, 1, 2);
        g2d.fillRect(91 + x, 61 + y, 1, 1);
        g2d.fillRect(97 + x, 61 + y, 2, 1);
        g2d.fillRect(89 + x, 62 + y, 1, 3);
        g2d.fillRect(92 + x, 62 + y, 1, 2);
        g2d.fillRect(94 + x, 62 + y, 1, 1);
        g2d.fillRect(96 + x, 62 + y, 1, 1);
        g2d.fillRect(93 + x, 63 + y, 1, 2);
        g2d.fillRect(98 + x, 63 + y, 1, 3);
        g2d.fillRect(97 + x, 64 + y, 1, 4);
        g2d.fillRect(90 + x, 65 + y, 1, 1);
        g2d.fillRect(92 + x, 65 + y, 1, 1);
        g2d.fillRect(96 + x, 65 + y, 1, 1);
        g2d.fillRect(91 + x, 66 + y, 1, 1);
        g2d.fillRect(92 + x, 67 + y, 5, 1);
        g2d.fillRect(94 + x, 68 + y, 1, 1);
        g2d.fillRect(96 + x, 68 + y, 1, 1);
        g2d.fillRect(95 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(96 + x, 54 + y, 1, 4);
        g2d.fillRect(94 + x, 55 + y, 1, 4);
        g2d.fillRect(97 + x, 58 + y, 1, 3);
        g2d.fillRect(98 + x, 58 + y, 1, 3);
        g2d.fillRect(95 + x, 59 + y, 1, 3);
        g2d.fillRect(96 + x, 59 + y, 1, 2);
        g2d.fillRect(89 + x, 60 + y, 1, 2);
        g2d.fillRect(94 + x, 60 + y, 1, 2);
        g2d.fillRect(93 + x, 61 + y, 1, 2);
        g2d.fillRect(90 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 62 + y, 1, 1);
        g2d.fillRect(97 + x, 62 + y, 1, 2);
        g2d.fillRect(98 + x, 62 + y, 1, 1);
        g2d.fillRect(94 + x, 63 + y, 1, 2);
        g2d.fillRect(95 + x, 63 + y, 1, 1);
        g2d.fillRect(99 + x, 63 + y, 1, 2);
        g2d.fillRect(96 + x, 64 + y, 1, 1);
        g2d.fillRect(91 + x, 65 + y, 1, 1);
        g2d.fillRect(90 + x, 66 + y, 1, 1);
        g2d.fillRect(92 + x, 66 + y, 5, 1);
        g2d.fillRect(98 + x, 66 + y, 1, 1);
        g2d.fillRect(93 + x, 68 + y, 1, 1);
        g2d.fillRect(95 + x, 68 + y, 1, 1);
        g2d.fillRect(97 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(91 + x, 63 + y, 1, 2);
        g2d.fillRect(96 + x, 63 + y, 1, 1);
        g2d.fillRect(92 + x, 64 + y, 1, 1);
        g2d.fillRect(95 + x, 64 + y, 1, 2);
        g2d.fillRect(93 + x, 65 + y, 2, 1);
    }

    public void drawSleevesFrontLeftOne(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 6);
        g2d.fillRect(96 + x, 53 + y, 2, 1);
        g2d.fillRect(93 + x, 54 + y, 1, 9);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(97 + x, 54 + y, 1, 4);
        g2d.fillRect(90 + x, 55 + y, 3, 1);
        g2d.fillRect(91 + x, 56 + y, 1, 3);
        g2d.fillRect(98 + x, 56 + y, 1, 2);
        g2d.fillRect(89 + x, 58 + y, 1, 2);
        g2d.fillRect(96 + x, 58 + y, 1, 1);
        g2d.fillRect(90 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(88 + x, 60 + y, 1, 2);
        g2d.fillRect(91 + x, 60 + y, 2, 1);
        g2d.fillRect(89 + x, 61 + y, 2, 1);
        g2d.fillRect(87 + x, 62 + y, 1, 3);
        g2d.fillRect(92 + x, 62 + y, 1, 3);
        g2d.fillRect(94 + x, 63 + y, 1, 2);
        g2d.fillRect(88 + x, 65 + y, 1, 3);
        g2d.fillRect(93 + x, 65 + y, 1, 2);
        g2d.fillRect(94 + x, 67 + y, 1, 3);
        g2d.fillRect(93 + x, 68 + y, 1, 1);
        g2d.fillRect(88 + x, 69 + y, 1, 1);
        g2d.fillRect(90 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 69 + y, 1, 1);
        g2d.fillRect(89 + x, 70 + y, 1, 1);
        g2d.fillRect(91 + x, 70 + y, 1, 2);
        g2d.fillRect(93 + x, 70 + y, 1, 2);
        g2d.fillRect(95 + x, 70 + y, 1, 2);
        g2d.fillRect(96 + x, 71 + y, 1, 1);
        g2d.fillRect(92 + x, 72 + y, 1, 1);
        g2d.fillRect(94 + x, 72 + y, 1, 1);
        g2d.fillRect(93 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(96 + x, 54 + y, 1, 4);
        g2d.fillRect(94 + x, 55 + y, 1, 4);
        g2d.fillRect(90 + x, 56 + y, 1, 3);
        g2d.fillRect(92 + x, 56 + y, 1, 4);
        g2d.fillRect(97 + x, 58 + y, 1, 1);
        g2d.fillRect(91 + x, 59 + y, 1, 1);
        g2d.fillRect(95 + x, 59 + y, 2, 1);
        g2d.fillRect(89 + x, 60 + y, 2, 1);
        g2d.fillRect(94 + x, 60 + y, 1, 1);
        g2d.fillRect(91 + x, 61 + y, 1, 5);
        g2d.fillRect(92 + x, 61 + y, 1, 1);
        g2d.fillRect(88 + x, 62 + y, 1, 3);
        g2d.fillRect(89 + x, 62 + y, 2, 1);
        g2d.fillRect(90 + x, 63 + y, 1, 1);
        g2d.fillRect(93 + x, 63 + y, 1, 2);
        g2d.fillRect(89 + x, 64 + y, 1, 6);
        g2d.fillRect(92 + x, 65 + y, 1, 4);
        g2d.fillRect(90 + x, 67 + y, 1, 1);
        g2d.fillRect(93 + x, 67 + y, 1, 1);
        g2d.fillRect(88 + x, 68 + y, 1, 1);
        g2d.fillRect(91 + x, 68 + y, 1, 2);
        g2d.fillRect(93 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 70 + y, 1, 2);
        g2d.fillRect(94 + x, 70 + y, 1, 2);
        g2d.fillRect(93 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(89 + x, 63 + y, 1, 1);
        g2d.fillRect(90 + x, 64 + y, 1, 3);
        g2d.fillRect(91 + x, 66 + y, 1, 2);
        g2d.fillRect(90 + x, 68 + y, 1, 1);
    }

    public void drawSleevesLeft5(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(95 + x, 52 + y, 4, 1);
        g2d.fillRect(92 + x, 53 + y, 3, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 2);
        g2d.fillRect(91 + x, 54 + y, 1, 2);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 55 + y, 1, 3);
        g2d.fillRect(97 + x, 55 + y, 1, 2);
        g2d.fillRect(90 + x, 56 + y, 1, 3);
        g2d.fillRect(96 + x, 56 + y, 1, 2);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(95 + x, 57 + y, 1, 3);
        g2d.fillRect(91 + x, 58 + y, 2, 1);
        g2d.fillRect(94 + x, 58 + y, 1, 1);
        g2d.fillRect(89 + x, 59 + y, 1, 2);
        g2d.fillRect(94 + x, 60 + y, 1, 3);
        g2d.fillRect(88 + x, 61 + y, 1, 1);
        g2d.fillRect(90 + x, 61 + y, 1, 1);
        g2d.fillRect(87 + x, 62 + y, 1, 4);
        g2d.fillRect(88 + x, 63 + y, 1, 1);
        g2d.fillRect(91 + x, 63 + y, 1, 1);
        g2d.fillRect(93 + x, 63 + y, 1, 1);
        g2d.fillRect(92 + x, 64 + y, 1, 2);
        g2d.fillRect(86 + x, 65 + y, 1, 3);
        g2d.fillRect(88 + x, 65 + y, 1, 1);
        g2d.fillRect(89 + x, 66 + y, 3, 1);
        g2d.fillRect(88 + x, 67 + y, 1, 1);
        g2d.fillRect(90 + x, 67 + y, 1, 1);
        g2d.fillRect(85 + x, 68 + y, 1, 2);
        g2d.fillRect(87 + x, 68 + y, 1, 2);
        g2d.fillRect(89 + x, 68 + y, 1, 2);
        g2d.fillRect(86 + x, 70 + y, 1, 1);
        g2d.fillRect(88 + x, 70 + y, 1, 2);
        g2d.fillRect(87 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 53 + y, 1, 4);
        g2d.fillRect(97 + x, 53 + y, 1, 2);
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(92 + x, 54 + y, 1, 4);
        g2d.fillRect(93 + x, 54 + y, 1, 1);
        g2d.fillRect(94 + x, 55 + y, 1, 3);
        g2d.fillRect(96 + x, 55 + y, 1, 1);
        g2d.fillRect(91 + x, 56 + y, 1, 2);
        g2d.fillRect(93 + x, 58 + y, 1, 5);
        g2d.fillRect(90 + x, 59 + y, 1, 2);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(92 + x, 60 + y, 1, 4);
        g2d.fillRect(89 + x, 61 + y, 1, 3);
        g2d.fillRect(88 + x, 62 + y, 1, 1);
        g2d.fillRect(88 + x, 64 + y, 1, 1);
        g2d.fillRect(91 + x, 64 + y, 1, 2);
        g2d.fillRect(90 + x, 65 + y, 1, 1);
        g2d.fillRect(87 + x, 66 + y, 1, 2);
        g2d.fillRect(88 + x, 66 + y, 1, 1);
        g2d.fillRect(89 + x, 67 + y, 1, 1);
        g2d.fillRect(86 + x, 68 + y, 1, 2);
        g2d.fillRect(88 + x, 68 + y, 1, 2);
        g2d.fillRect(87 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(91 + x, 59 + y, 1, 4);
        g2d.fillRect(92 + x, 59 + y, 1, 1);
        g2d.fillRect(90 + x, 62 + y, 1, 3);
        g2d.fillRect(89 + x, 64 + y, 1, 2);
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 2, 1);
        g2d.fillRect(94 + x, 54 + y, 2, 1);
        g2d.fillRect(97 + x, 54 + y, 1, 4);
        g2d.fillRect(93 + x, 55 + y, 1, 6);
        g2d.fillRect(95 + x, 55 + y, 1, 4);
        g2d.fillRect(98 + x, 56 + y, 1, 10);
        g2d.fillRect(96 + x, 58 + y, 1, 1);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(92 + x, 61 + y, 1, 3);
        g2d.fillRect(97 + x, 61 + y, 1, 1);
        g2d.fillRect(94 + x, 62 + y, 1, 1);
        g2d.fillRect(93 + x, 63 + y, 1, 2);
        g2d.fillRect(92 + x, 65 + y, 1, 1);
        g2d.fillRect(96 + x, 65 + y, 2, 1);
        g2d.fillRect(91 + x, 66 + y, 1, 2);
        g2d.fillRect(97 + x, 66 + y, 1, 2);
        g2d.fillRect(92 + x, 67 + y, 1, 6);
        g2d.fillRect(93 + x, 67 + y, 4, 1);
        g2d.fillRect(94 + x, 68 + y, 1, 5);
        g2d.fillRect(96 + x, 68 + y, 1, 5);
        g2d.fillRect(93 + x, 72 + y, 1, 1);
        g2d.fillRect(95 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(96 + x, 54 + y, 1, 4);
        g2d.fillRect(94 + x, 55 + y, 1, 4);
        g2d.fillRect(97 + x, 58 + y, 1, 3);
        g2d.fillRect(95 + x, 59 + y, 1, 2);
        g2d.fillRect(96 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 60 + y, 1, 1);
        g2d.fillRect(93 + x, 61 + y, 1, 2);
        g2d.fillRect(97 + x, 62 + y, 1, 2);
        g2d.fillRect(94 + x, 63 + y, 1, 4);
        g2d.fillRect(96 + x, 64 + y, 1, 1);
        g2d.fillRect(93 + x, 65 + y, 1, 2);
        g2d.fillRect(92 + x, 66 + y, 1, 1);
        g2d.fillRect(95 + x, 66 + y, 2, 1);
        g2d.fillRect(93 + x, 68 + y, 1, 4);
        g2d.fillRect(95 + x, 68 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 60 + y, 1, 4);
        g2d.fillRect(94 + x, 61 + y, 2, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 4);
        g2d.fillRect(97 + x, 64 + y, 1, 1);
    }

    public void drawSleevesFront(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(leftA == 1)
        {
            drawSleevesFrontLeftOne(x,y,g2d);
        }
    }

    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(leftA == 3)
        {
            drawSleevesLeft3(x,y,g2d);
        }
        else if(leftA == 1)
        {
            drawSleevesFrontLeftOne(x,y,g2d);
        }
        else if(leftA == 5)
        {
            drawSleevesLeft5(x,y,g2d);
        }
        else if(leftA == 0)
        {
            drawSleevesLeft0(x,y,g2d);
        }
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        drawLower(x,0,g2d);

    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        draw(offsetX, 0, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawSleeves(offsetX,0,g2d);
        if(middle.equals("b"))
        {
            drawB(offsetX,offsetY,g2d);
        }
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawSleevesFront(offsetX, 0, g2d);
    }
}
