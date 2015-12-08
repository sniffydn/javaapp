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
public class Srt3 extends SuperTU
{
    int leftA = 0;
    int rightA = 0;

    public Srt3()
    {
        super();
        sch = true;
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt3(String middle)
    {
        super(middle);
        sch = true;
        containsTL = true;
    }

    public Srt3(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        sch = true;
        containsTL = true;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        leftA = leftArm;
        rightA = rightArm;
    }

    public void drawSleevesFrontLeftOne(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(87 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 62 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 1, 3);
        g2d.fillRect(90 + x, 63 + y, 1, 1);
        g2d.fillRect(88 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 65 + y, 1, 2);
        g2d.fillRect(89 + x, 67 + y, 1, 2);
        g2d.fillRect(94 + x, 67 + y, 1, 3);
        g2d.fillRect(90 + x, 69 + y, 1, 1);
        g2d.fillRect(91 + x, 70 + y, 1, 2);
        g2d.fillRect(95 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(88 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 64 + y, 1, 2);
        g2d.fillRect(89 + x, 65 + y, 1, 2);
        g2d.fillRect(92 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 67 + y, 1, 2);
        g2d.fillRect(90 + x, 68 + y, 1, 1);
        g2d.fillRect(91 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 70 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(89 + x, 63 + y, 1, 2);
        g2d.fillRect(90 + x, 64 + y, 1, 4);
        g2d.fillRect(91 + x, 66 + y, 1, 3);
        g2d.fillRect(92 + x, 67 + y, 1, 3);
        g2d.fillRect(93 + x, 69 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(94 + x, 70 + y, 1, 2);
        g2d.fillRect(96 + x, 70 + y, 1, 4);
        g2d.fillRect(93 + x, 71 + y, 1, 2);
        g2d.fillRect(95 + x, 71 + y, 1, 1);
        g2d.fillRect(92 + x, 72 + y, 1, 3);
        g2d.fillRect(93 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(94 + x, 72 + y, 1, 3);
        g2d.fillRect(95 + x, 72 + y, 1, 2);
        g2d.fillRect(93 + x, 73 + y, 1, 1);
    }

    public void drawSleevesFront(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(leftA == 1)
        {
            drawSleevesFrontLeftOne(x,y,g2d);
        }
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 41 + y, 5, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 22);
        g2d.fillRect(98 + x, 49 + y, 1, 12);
        g2d.fillRect(97 + x, 61 + y, 1, 7);
        g2d.fillRect(92 + x, 67 + y, 1, 2);
        g2d.fillRect(96 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 42 + y, 1, 3);
        g2d.fillRect(98 + x, 42 + y, 1, 3);
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(100 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 42 + y, 1, 2);
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(96 + x, 43 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 22);
        g2d.fillRect(97 + x, 51 + y, 1, 10);
        g2d.fillRect(96 + x, 60 + y, 1, 8);
        g2d.fillRect(93 + x, 67 + y, 1, 2);
        g2d.fillRect(95 + x, 67 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 45 + y, 1, 22);
        g2d.fillRect(96 + x, 45 + y, 1, 15);
        g2d.fillRect(97 + x, 45 + y, 1, 6);
        g2d.fillRect(98 + x, 45 + y, 1, 4);
        g2d.fillRect(94 + x, 67 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(91 + x, 69 + y, 1, 2);
        g2d.fillRect(92 + x, 69 + y, 3, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 3);
        g2d.fillRect(94 + x, 70 + y, 1, 2);
        g2d.fillRect(92 + x, 71 + y, 1, 3);
        g2d.fillRect(95 + x, 71 + y, 1, 1);
        g2d.fillRect(93 + x, 73 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(92 + x, 70 + y, 2, 1);
        g2d.fillRect(93 + x, 71 + y, 1, 2);
        g2d.fillRect(94 + x, 72 + y, 2, 1);
    }

    public void drawSleevesLeft1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 42 + y, 2, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 3);
        g2d.fillRect(93 + x, 47 + y, 1, 3);
        g2d.fillRect(92 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(91 + x, 52 + y, 1, 3);
        g2d.fillRect(97 + x, 53 + y, 1, 2);
        g2d.fillRect(90 + x, 55 + y, 1, 3);
        g2d.fillRect(96 + x, 55 + y, 1, 2);
        g2d.fillRect(95 + x, 57 + y, 1, 2);
        g2d.fillRect(89 + x, 58 + y, 1, 2);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(88 + x, 60 + y, 1, 2);
        g2d.fillRect(93 + x, 60 + y, 1, 2);
        g2d.fillRect(87 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 62 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 1, 3);
        g2d.fillRect(90 + x, 63 + y, 1, 1);
        g2d.fillRect(88 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 65 + y, 1, 2);
        g2d.fillRect(89 + x, 67 + y, 1, 2);
        g2d.fillRect(94 + x, 67 + y, 1, 3);
        g2d.fillRect(90 + x, 69 + y, 1, 1);
        g2d.fillRect(91 + x, 70 + y, 1, 2);
        g2d.fillRect(95 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 42 + y, 1, 3);
        g2d.fillRect(96 + x, 43 + y, 1, 3);
        g2d.fillRect(97 + x, 43 + y, 1, 2);
        g2d.fillRect(95 + x, 44 + y, 1, 3);
        g2d.fillRect(94 + x, 47 + y, 1, 3);
        g2d.fillRect(93 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(92 + x, 52 + y, 1, 3);
        g2d.fillRect(96 + x, 52 + y, 1, 3);
        g2d.fillRect(91 + x, 55 + y, 1, 3);
        g2d.fillRect(95 + x, 55 + y, 1, 2);
        g2d.fillRect(94 + x, 56 + y, 1, 3);
        g2d.fillRect(90 + x, 58 + y, 1, 2);
        g2d.fillRect(93 + x, 58 + y, 1, 2);
        g2d.fillRect(92 + x, 59 + y, 1, 3);
        g2d.fillRect(89 + x, 60 + y, 1, 3);
        g2d.fillRect(91 + x, 61 + y, 1, 1);
        g2d.fillRect(88 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 64 + y, 1, 2);
        g2d.fillRect(89 + x, 65 + y, 1, 2);
        g2d.fillRect(92 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 67 + y, 1, 2);
        g2d.fillRect(90 + x, 68 + y, 1, 1);
        g2d.fillRect(91 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 70 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 45 + y, 1, 6);
        g2d.fillRect(98 + x, 45 + y, 1, 5);
        g2d.fillRect(96 + x, 46 + y, 1, 6);
        g2d.fillRect(95 + x, 47 + y, 1, 8);
        g2d.fillRect(94 + x, 50 + y, 1, 6);
        g2d.fillRect(93 + x, 52 + y, 1, 6);
        g2d.fillRect(92 + x, 55 + y, 1, 4);
        g2d.fillRect(91 + x, 58 + y, 1, 3);
        g2d.fillRect(90 + x, 60 + y, 1, 3);
        g2d.fillRect(89 + x, 63 + y, 1, 2);
        g2d.fillRect(90 + x, 64 + y, 1, 4);
        g2d.fillRect(91 + x, 66 + y, 1, 3);
        g2d.fillRect(92 + x, 67 + y, 1, 3);
        g2d.fillRect(93 + x, 69 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(94 + x, 70 + y, 1, 2);
        g2d.fillRect(96 + x, 70 + y, 1, 4);
        g2d.fillRect(93 + x, 71 + y, 1, 2);
        g2d.fillRect(95 + x, 71 + y, 1, 1);
        g2d.fillRect(92 + x, 72 + y, 1, 3);
        g2d.fillRect(93 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(94 + x, 72 + y, 1, 3);
        g2d.fillRect(95 + x, 72 + y, 1, 2);
        g2d.fillRect(93 + x, 73 + y, 1, 1);
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 41 + y, 3, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(120 + x, 46 + y, 1, 9);
        g2d.fillRect(121 + x, 55 + y, 1, 6);
        g2d.fillRect(117 + x, 56 + y, 1, 7);
        g2d.fillRect(122 + x, 61 + y, 1, 5);
        g2d.fillRect(118 + x, 63 + y, 1, 3);
        g2d.fillRect(119 + x, 65 + y, 1, 5);
        g2d.fillRect(123 + x, 66 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 8);
        g2d.fillRect(117 + x, 42 + y, 1, 14);
        g2d.fillRect(118 + x, 43 + y, 1, 20);
        g2d.fillRect(119 + x, 46 + y, 1, 13);
        g2d.fillRect(120 + x, 55 + y, 1, 6);
        g2d.fillRect(121 + x, 61 + y, 1, 4);
        g2d.fillRect(119 + x, 63 + y, 1, 2);
        g2d.fillRect(120 + x, 65 + y, 1, 4);
        g2d.fillRect(122 + x, 66 + y, 1, 3);
        g2d.fillRect(123 + x, 69 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 59 + y, 1, 4);
        g2d.fillRect(120 + x, 61 + y, 1, 4);
        g2d.fillRect(121 + x, 65 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(120 + x, 69 + y, 3, 1);
        g2d.fillRect(124 + x, 69 + y, 1, 3);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(122 + x, 70 + y, 1, 1);
        g2d.fillRect(123 + x, 71 + y, 1, 2);
        g2d.fillRect(120 + x, 72 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(120 + x, 70 + y, 1, 2);
        g2d.fillRect(121 + x, 70 + y, 1, 2);
        g2d.fillRect(122 + x, 71 + y, 1, 1);
    }

    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(rightA == 0)
        {
            drawSleevesRight0(x,y,g2d);
        }

        if(leftA == 0)
        {
            drawSleevesLeft0(x,y,g2d);
        }
        else if(leftA == 1)
        {
            drawSleevesLeft1(x,y,g2d);
        }
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(109 + x, 56 + y, 1, 21);
        g2d.fillRect(110 + x, 56 + y, 1, 18);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 62 + y, 1, 5);
        g2d.fillRect(103 + x, 65 + y, 1, 6);
        g2d.fillRect(117 + x, 67 + y, 1, 2);
        g2d.fillRect(118 + x, 69 + y, 1, 2);
        g2d.fillRect(102 + x, 71 + y, 1, 3);
        g2d.fillRect(119 + x, 71 + y, 1, 5);
        g2d.fillRect(101 + x, 74 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 3);
        g2d.fillRect(102 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 75 + y, 2, 1);
        g2d.fillRect(104 + x, 76 + y, 5, 1);
        g2d.fillRect(112 + x, 76 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 16);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(115 + x, 62 + y, 1, 5);
        g2d.fillRect(104 + x, 65 + y, 1, 6);
        g2d.fillRect(116 + x, 67 + y, 1, 2);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 71 + y, 1, 4);
        g2d.fillRect(118 + x, 71 + y, 1, 4);
        g2d.fillRect(102 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 4, 1);
        g2d.fillRect(113 + x, 75 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 56 + y, 1, 18);
        g2d.fillRect(112 + x, 56 + y, 1, 18);
        g2d.fillRect(116 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 5);
        g2d.fillRect(114 + x, 62 + y, 1, 5);
        g2d.fillRect(105 + x, 65 + y, 1, 6);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 2);
        g2d.fillRect(104 + x, 71 + y, 1, 4);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(105 + x, 74 + y, 3, 1);
        g2d.fillRect(113 + x, 74 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 56 + y, 6, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 18);
        g2d.fillRect(114 + x, 56 + y, 1, 6);
        g2d.fillRect(115 + x, 56 + y, 1, 6);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 8);
        g2d.fillRect(106 + x, 57 + y, 1, 7);
        g2d.fillRect(107 + x, 57 + y, 1, 17);
        g2d.fillRect(106 + x, 65 + y, 1, 6);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(105 + x, 71 + y, 1, 3);
        g2d.fillRect(116 + x, 71 + y, 1, 3);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 4);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(115 + x, 71 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 74 + y, 1, 5);
        g2d.fillRect(101 + x, 76 + y, 1, 2);
        g2d.fillRect(119 + x, 76 + y, 1, 3);
        g2d.fillRect(120 + x, 76 + y, 1, 1);
        g2d.fillRect(100 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 4, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 3, 1);
        g2d.fillRect(111 + x, 79 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 76 + y, 2, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 3);
        g2d.fillRect(118 + x, 76 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 4, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 2);
        g2d.fillRect(111 + x, 77 + y, 1, 2);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 2, 1);
        g2d.fillRect(113 + x, 78 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(107 + x, 77 + y, 2, 1);
        g2d.fillRect(113 + x, 77 + y, 3, 1);
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(120 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(98 + x, 43 + y, 1, 2);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 2, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 7);
        g2d.fillRect(119 + x, 44 + y, 2, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 4);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 3);
        g2d.fillRect(98 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 2, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(123 + x, 50 + y, 1, 2);
        g2d.fillRect(96 + x, 51 + y, 1, 6);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(124 + x, 52 + y, 1, 5);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 3);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(123 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 5);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 2, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 4, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(122 + x, 50 + y, 1, 9);
        g2d.fillRect(97 + x, 51 + y, 1, 6);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 4);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(123 + x, 52 + y, 1, 5);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 56 + y, 1, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 3);
        g2d.fillRect(108 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(121 + x, 57 + y, 1, 3);
        g2d.fillRect(99 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 3);
        g2d.fillRect(111 + x, 59 + y, 1, 4);
        g2d.fillRect(120 + x, 59 + y, 1, 2);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 3, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 45 + y, 1, 3);
        g2d.fillRect(119 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 48 + y, 3, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 5);
        g2d.fillRect(121 + x, 50 + y, 1, 7);
        g2d.fillRect(99 + x, 51 + y, 1, 7);
        g2d.fillRect(100 + x, 51 + y, 1, 8);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 54 + y, 2, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 4);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 4);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 4);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 59 + y, 1, 3);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 5);
        g2d.fillRect(106 + x, 59 + y, 1, 4);
        g2d.fillRect(115 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 2);
        g2d.fillRect(114 + x, 43 + y, 1, 4);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 2);
        g2d.fillRect(118 + x, 44 + y, 1, 3);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 2, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 3);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 3);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 2, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 43 + y, 2, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 4);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 3);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 46 + y, 1, 3);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 4);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 2);
        g2d.fillRect(113 + x, 49 + y, 1, 4);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 3);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 44 + y, 1, 2);
        g2d.fillRect(116 + x, 44 + y, 1, 3);
        g2d.fillRect(102 + x, 45 + y, 1, 2);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(120 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(98 + x, 43 + y, 1, 2);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 2, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 7);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 4);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 46 + y, 1, 3);
        g2d.fillRect(122 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 3);
        g2d.fillRect(123 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(124 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 1, 7);
        g2d.fillRect(103 + x, 50 + y, 2, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(125 + x, 51 + y, 1, 6);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 3);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 5);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 2, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(121 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 2, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 5, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(122 + x, 48 + y, 1, 12);
        g2d.fillRect(121 + x, 49 + y, 1, 1);
        g2d.fillRect(123 + x, 49 + y, 1, 10);
        g2d.fillRect(96 + x, 50 + y, 1, 7);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 8);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 4);
        g2d.fillRect(124 + x, 51 + y, 1, 6);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(98 + x, 56 + y, 1, 4);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 3);
        g2d.fillRect(108 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(121 + x, 57 + y, 1, 4);
        g2d.fillRect(99 + x, 58 + y, 1, 3);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 3);
        g2d.fillRect(111 + x, 59 + y, 1, 4);
        g2d.fillRect(120 + x, 59 + y, 1, 3);
        g2d.fillRect(101 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 3, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 45 + y, 1, 3);
        g2d.fillRect(119 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 48 + y, 3, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 5);
        g2d.fillRect(121 + x, 50 + y, 1, 7);
        g2d.fillRect(99 + x, 51 + y, 1, 7);
        g2d.fillRect(100 + x, 51 + y, 1, 8);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 54 + y, 2, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 4);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 4);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 4);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 59 + y, 1, 3);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 5);
        g2d.fillRect(106 + x, 59 + y, 1, 4);
        g2d.fillRect(115 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 2);
        g2d.fillRect(114 + x, 43 + y, 1, 4);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 2);
        g2d.fillRect(118 + x, 44 + y, 1, 3);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 2, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 3);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 3);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 2, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 43 + y, 2, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 4);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 3);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 46 + y, 1, 3);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 4);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 2);
        g2d.fillRect(113 + x, 49 + y, 1, 4);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 3);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 44 + y, 1, 2);
        g2d.fillRect(116 + x, 44 + y, 1, 3);
        g2d.fillRect(102 + x, 45 + y, 1, 2);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        ImageUtilities.drawLine(98 + x, 41, 98 + x, 42 + y, g2d);
        ImageUtilities.drawLine(99 + x, 41, 99 + x, 42 + y, g2d);
        ImageUtilities.drawLine(117 + x, 41, 117 + x, 42 + y, g2d);
        g2d.fillRect(100 + x, 41, 1, 1);
        g2d.fillRect(118 + x, 42, 1, 1 + y);
        g2d.fillRect(116 + x, 41, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        ImageUtilities.drawLine(114 + x, 40, 114 + x, 42 + y, g2d);
        ImageUtilities.drawLine(102 + x, 41, 102 + x, 42 + y, g2d);
        g2d.fillRect(101 + x, 41, 1, 1);
        g2d.fillRect(115 + x, 41, 1, 1);
        g2d.fillRect(100 + x, 42, 1, 1 + y);
        g2d.fillRect(116 + x, 42, 1, 1 + y);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 42, 1, 1 + y);
        g2d.fillRect(115 + x, 42, 1, 1 + y);


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
        drawSleeves(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawSleevesFront(offsetX, 0, g2d);
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
}
