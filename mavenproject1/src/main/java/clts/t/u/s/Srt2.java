/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.s;

import clts.*;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import clts.t.u.a.T0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Srt2 extends SuperTU
{
    int leftA = 0;
    int rightA = 0;

    public Srt2()
    {
        super();
        sch = true;
        prep = true;
        containsTL = Math.random() < .5;
    }

    /** Creates a new instance of GenericClothes */
    public Srt2(String middle)
    {
        super(middle);
        sch = true;
        prep = true;
        containsTL = Math.random() < .5;
    }

    public Srt2(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        sch = true;
        prep = true;
        containsTL = Math.random() < .5;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        leftA = leftArm;
        rightA = rightArm;
    }

    public SuperC getRecommendedAccessory(ColorArray c)
    {
        return new clts.t.u.a.T0(c);
    }

    public void drawLowerLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 4);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(101 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 2, 1);
        g2d.fillRect(117 + x, 76 + y, 2, 1);
        g2d.fillRect(104 + x, 77 + y, 13, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 8);
        g2d.fillRect(117 + x, 61 + y, 1, 3);
        g2d.fillRect(116 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 3);
        g2d.fillRect(118 + x, 71 + y, 2, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 56 + y, 1, 12);
        g2d.fillRect(116 + x, 56 + y, 1, 8);
        g2d.fillRect(103 + x, 57 + y, 1, 8);
        g2d.fillRect(104 + x, 57 + y, 1, 5);
        g2d.fillRect(104 + x, 65 + y, 1, 7);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 72 + y, 1, 4);
        g2d.fillRect(118 + x, 72 + y, 1, 4);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 13, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 1, 3);
        g2d.fillRect(105 + x, 54 + y, 1, 22);
        g2d.fillRect(106 + x, 54 + y, 1, 22);
        g2d.fillRect(107 + x, 54 + y, 1, 22);
        g2d.fillRect(108 + x, 54 + y, 1, 22);
        g2d.fillRect(109 + x, 54 + y, 1, 22);
        g2d.fillRect(110 + x, 54 + y, 1, 22);
        g2d.fillRect(111 + x, 54 + y, 1, 22);
        g2d.fillRect(112 + x, 54 + y, 1, 22);
        g2d.fillRect(113 + x, 54 + y, 1, 22);
        g2d.fillRect(114 + x, 54 + y, 1, 22);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 3);
        g2d.fillRect(115 + x, 68 + y, 1, 8);
        g2d.fillRect(116 + x, 69 + y, 1, 7);
        g2d.fillRect(117 + x, 71 + y, 1, 4);
        g2d.fillRect(104 + x, 72 + y, 1, 4);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 46 + y, 1, 3);
        g2d.fillRect(111 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 3);
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(114 + x, 41 + y, 2, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 3);
        g2d.fillRect(104 + x, 42 + y, 1, 2);
        g2d.fillRect(113 + x, 42 + y, 1, 3);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(105 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 43 + y, 1, 6);
        g2d.fillRect(100 + x, 44 + y, 1, 2);
        g2d.fillRect(106 + x, 44 + y, 1, 5);
        g2d.fillRect(107 + x, 44 + y, 1, 2);
        g2d.fillRect(112 + x, 44 + y, 1, 5);
        g2d.fillRect(117 + x, 45 + y, 1, 2);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(111 + x, 46 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 48 + y, 2, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 2, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 2);
        g2d.fillRect(104 + x, 44 + y, 2, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 4);
        g2d.fillRect(101 + x, 45 + y, 1, 1);
        g2d.fillRect(105 + x, 45 + y, 1, 4);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(102 + x, 46 + y, 3, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 3);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 1, 2);
        g2d.fillRect(104 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 42 + y, 1, 4);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(103 + x, 44 + y, 1, 2);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 6);
        g2d.fillRect(102 + x, 49 + y, 1, 5);
        g2d.fillRect(103 + x, 49 + y, 1, 5);
        g2d.fillRect(104 + x, 49 + y, 1, 5);
        g2d.fillRect(105 + x, 49 + y, 1, 5);
        g2d.fillRect(106 + x, 49 + y, 1, 5);
        g2d.fillRect(107 + x, 49 + y, 1, 5);
        g2d.fillRect(108 + x, 49 + y, 1, 5);
        g2d.fillRect(109 + x, 49 + y, 1, 5);
        g2d.fillRect(110 + x, 49 + y, 1, 5);
        g2d.fillRect(111 + x, 49 + y, 1, 5);
        g2d.fillRect(112 + x, 49 + y, 1, 5);
        g2d.fillRect(113 + x, 49 + y, 1, 5);
        g2d.fillRect(114 + x, 50 + y, 1, 4);
        g2d.fillRect(116 + x, 49 + y, 1, 5);
        g2d.fillRect(115 + x, 50 + y, 1, 4);
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(109 + x, 48 + y, 2, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 2, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 3);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(108 + x, 49 + y, 3, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 3);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 47 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 47 + y, 5, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 47 + y, 4, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 2, 1);
        g2d.fillRect(121 + x, 48 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(123 + x, 50 + y, 1, 2);
        g2d.fillRect(96 + x, 51 + y, 1, 6);
        g2d.fillRect(124 + x, 52 + y, 1, 5);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(123 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 2, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(103 + x, 48 + y, 4, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 3, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 2, 1);
        g2d.fillRect(119 + x, 49 + y, 3, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 9);
        g2d.fillRect(120 + x, 50 + y, 3, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 6);
        g2d.fillRect(121 + x, 51 + y, 1, 9);
        g2d.fillRect(122 + x, 51 + y, 1, 8);
        g2d.fillRect(123 + x, 52 + y, 1, 5);
        g2d.fillRect(99 + x, 56 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 5);
        g2d.fillRect(119 + x, 57 + y, 1, 5);
        g2d.fillRect(100 + x, 58 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 4);
        g2d.fillRect(102 + x, 59 + y, 1, 4);
        g2d.fillRect(103 + x, 59 + y, 1, 4);
        g2d.fillRect(104 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 59 + y, 1, 4);
        g2d.fillRect(106 + x, 59 + y, 1, 4);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(115 + x, 59 + y, 1, 4);
        g2d.fillRect(116 + x, 59 + y, 1, 4);
        g2d.fillRect(117 + x, 59 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 11);
        g2d.fillRect(102 + x, 49 + y, 1, 10);
        g2d.fillRect(103 + x, 49 + y, 1, 10);
        g2d.fillRect(104 + x, 49 + y, 1, 10);
        g2d.fillRect(105 + x, 49 + y, 1, 10);
        g2d.fillRect(106 + x, 49 + y, 1, 10);
        g2d.fillRect(112 + x, 49 + y, 1, 4);
        g2d.fillRect(113 + x, 49 + y, 1, 10);
        g2d.fillRect(116 + x, 49 + y, 1, 10);
        g2d.fillRect(118 + x, 49 + y, 1, 9);
        g2d.fillRect(101 + x, 50 + y, 1, 8);
        g2d.fillRect(107 + x, 50 + y, 1, 9);
        g2d.fillRect(114 + x, 50 + y, 1, 9);
        g2d.fillRect(115 + x, 50 + y, 1, 9);
        g2d.fillRect(119 + x, 50 + y, 1, 7);
        g2d.fillRect(100 + x, 51 + y, 1, 7);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 5);
        g2d.fillRect(99 + x, 52 + y, 1, 4);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(109 + x, 48 + y, 2, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 2, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 3);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(108 + x, 49 + y, 3, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 3);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 47 + y, 1, 2);
        g2d.fillRect(108 + x, 47 + y, 3, 1);
        g2d.fillRect(102 + x, 46 + y, 5, 1);
        g2d.fillRect(115 + x, 46 + y, 3, 1);



        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 4, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 5, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 47 + y, 4, 1);
        g2d.fillRect(122 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 2, 1);
        g2d.fillRect(123 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(124 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 7);
        g2d.fillRect(125 + x, 51 + y, 1, 6);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(123 + x, 58 + y, 1, 2);
        g2d.fillRect(97 + x, 59 + y, 2, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 2);
        g2d.fillRect(98 + x, 60 + y, 2, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 2);
        g2d.fillRect(99 + x, 61 + y, 3, 1);
        g2d.fillRect(120 + x, 61 + y, 1, 2);
        g2d.fillRect(101 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(113 + x, 46 + y, 2, 1);
        g2d.fillRect(99 + x, 47 + y, 1, 5);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 5, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 11);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(103 + x, 48 + y, 4, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 5, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 10);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 2, 1);
        g2d.fillRect(119 + x, 49 + y, 5, 1);
        g2d.fillRect(96 + x, 50 + y, 1, 7);
        g2d.fillRect(120 + x, 50 + y, 4, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 9);
        g2d.fillRect(122 + x, 51 + y, 1, 8);
        g2d.fillRect(123 + x, 51 + y, 1, 7);
        g2d.fillRect(124 + x, 51 + y, 1, 6);
        g2d.fillRect(99 + x, 56 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 5);
        g2d.fillRect(119 + x, 57 + y, 1, 5);
        g2d.fillRect(100 + x, 58 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 4);
        g2d.fillRect(102 + x, 59 + y, 1, 4);
        g2d.fillRect(103 + x, 59 + y, 1, 4);
        g2d.fillRect(104 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 59 + y, 1, 4);
        g2d.fillRect(106 + x, 59 + y, 1, 4);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(115 + x, 59 + y, 1, 4);
        g2d.fillRect(116 + x, 59 + y, 1, 4);
        g2d.fillRect(117 + x, 59 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 11);
        g2d.fillRect(102 + x, 49 + y, 1, 10);
        g2d.fillRect(103 + x, 49 + y, 1, 10);
        g2d.fillRect(104 + x, 49 + y, 1, 10);
        g2d.fillRect(105 + x, 49 + y, 1, 10);
        g2d.fillRect(106 + x, 49 + y, 1, 10);
        g2d.fillRect(112 + x, 49 + y, 1, 4);
        g2d.fillRect(113 + x, 49 + y, 1, 10);
        g2d.fillRect(116 + x, 49 + y, 1, 10);
        g2d.fillRect(118 + x, 49 + y, 1, 9);
        g2d.fillRect(101 + x, 50 + y, 1, 8);
        g2d.fillRect(107 + x, 50 + y, 1, 9);
        g2d.fillRect(114 + x, 50 + y, 1, 9);
        g2d.fillRect(115 + x, 50 + y, 1, 9);
        g2d.fillRect(119 + x, 50 + y, 1, 7);
        g2d.fillRect(100 + x, 51 + y, 1, 7);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 5);
        g2d.fillRect(99 + x, 52 + y, 1, 4);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equalsIgnoreCase("c"))
        {
            drawC(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("d"))
        {
            drawD(x,y,g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, 0, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
}
