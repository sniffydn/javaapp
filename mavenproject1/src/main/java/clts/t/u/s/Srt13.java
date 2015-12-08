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
public class Srt13 extends SuperTU
{
    int leftA = 0;
    int rightA = 0;

    public Srt13()
    {
        super();
        sch = true;
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt13(String middle)
    {
        super(middle);
        sch = true;
        containsTL = true;
    }

    public Srt13(String middle, ColorArray colorSwitch)
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

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d){}
    public void drawSleevesLeft1(int x, int y, GraphicsMap g2d){}
    public void drawSleevesLeft2(int x, int y, GraphicsMap g2d){}
    public void drawSleevesLeft3(int x, int y, GraphicsMap g2d){}
    public void drawSleevesLeft5(int x, int y, GraphicsMap g2d){}
    public void drawSleevesRight0(int x, int y, GraphicsMap g2d){}
    public void drawSleevesRight1(int x, int y, GraphicsMap g2d){}
    public void drawSleevesRight3(int x, int y, GraphicsMap g2d){}

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(93 + x, 45 + y, 1, 2);
        g2d.fillRect(97 + x, 45 + y, 1, 2);
        g2d.fillRect(98 + x, 45 + y, 1, 2);
        g2d.fillRect(99 + x, 45 + y, 1, 2);
        g2d.fillRect(104 + x, 45 + y, 1, 2);
        g2d.fillRect(105 + x, 45 + y, 1, 2);
        g2d.fillRect(114 + x, 45 + y, 1, 2);
        g2d.fillRect(115 + x, 45 + y, 1, 2);
        g2d.fillRect(116 + x, 45 + y, 1, 2);
        g2d.fillRect(120 + x, 45 + y, 1, 2);
        g2d.fillRect(94 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 46 + y, 2, 1);
        g2d.fillRect(100 + x, 46 + y, 4, 1);
        g2d.fillRect(106 + x, 46 + y, 4, 1);
        g2d.fillRect(112 + x, 46 + y, 2, 1);
        g2d.fillRect(117 + x, 46 + y, 3, 1);
        g2d.fillRect(109 + x, 47 + y, 2, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 2, 1);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 48 + y, 1, 2);
        g2d.fillRect(94 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(97 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 14);
        g2d.fillRect(103 + x, 60 + y, 1, 11);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 6);
        g2d.fillRect(101 + x, 72 + y, 1, 6);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(100 + x, 74 + y, 1, 5);
        g2d.fillRect(116 + x, 75 + y, 2, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 3);
        g2d.fillRect(115 + x, 76 + y, 1, 5);
        g2d.fillRect(99 + x, 77 + y, 1, 3);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(121 + x, 78 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 3);
        g2d.fillRect(112 + x, 79 + y, 2, 1);
        g2d.fillRect(117 + x, 79 + y, 3, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 2, 1);
        g2d.fillRect(108 + x, 81 + y, 2, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 5, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 47 + y, 2, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 3);
        g2d.fillRect(108 + x, 48 + y, 4, 1);
        g2d.fillRect(118 + x, 48 + y, 2, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 2);
        g2d.fillRect(96 + x, 53 + y, 2, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 8);
        g2d.fillRect(105 + x, 60 + y, 1, 11);
        g2d.fillRect(115 + x, 60 + y, 1, 11);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 12);
        g2d.fillRect(106 + x, 64 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(103 + x, 71 + y, 1, 5);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 74 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(120 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 3);
        g2d.fillRect(118 + x, 76 + y, 1, 3);
        g2d.fillRect(119 + x, 76 + y, 1, 3);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 2, 1);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 3);
        g2d.fillRect(95 + x, 48 + y, 1, 3);
        g2d.fillRect(98 + x, 48 + y, 1, 3);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 3);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 3, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(110 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 59 + y, 1, 6);
        g2d.fillRect(111 + x, 59 + y, 1, 5);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 9);
        g2d.fillRect(113 + x, 61 + y, 1, 10);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 7);
        g2d.fillRect(108 + x, 63 + y, 1, 5);
        g2d.fillRect(106 + x, 67 + y, 1, 5);
        g2d.fillRect(114 + x, 67 + y, 1, 12);
        g2d.fillRect(105 + x, 71 + y, 1, 4);
        g2d.fillRect(110 + x, 71 + y, 1, 3);
        g2d.fillRect(115 + x, 71 + y, 1, 5);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 5);
        g2d.fillRect(103 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 4);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(120 + x, 77 + y, 2, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 47 + y, 1, 3);
        g2d.fillRect(98 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(96 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 3);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 1, 10);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 8);
        g2d.fillRect(109 + x, 65 + y, 1, 7);
        g2d.fillRect(108 + x, 68 + y, 1, 10);
        g2d.fillRect(107 + x, 69 + y, 1, 9);
        g2d.fillRect(112 + x, 69 + y, 1, 9);
        g2d.fillRect(113 + x, 71 + y, 1, 6);
        g2d.fillRect(106 + x, 72 + y, 1, 4);
        g2d.fillRect(109 + x, 73 + y, 1, 7);
        g2d.fillRect(111 + x, 73 + y, 1, 3);
        g2d.fillRect(110 + x, 74 + y, 1, 6);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 2);
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(107 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 6);
        g2d.fillRect(120 + x, 51 + y, 1, 5);
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 4);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 5, 1);
        g2d.fillRect(115 + x, 59 + y, 3, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 47 + y, 1, 3);
        g2d.fillRect(104 + x, 47 + y, 1, 2);
        g2d.fillRect(105 + x, 47 + y, 1, 2);
        g2d.fillRect(106 + x, 47 + y, 1, 2);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 3);
        g2d.fillRect(101 + x, 48 + y, 1, 9);
        g2d.fillRect(102 + x, 48 + y, 1, 3);
        g2d.fillRect(108 + x, 48 + y, 1, 2);
        g2d.fillRect(112 + x, 48 + y, 1, 3);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 4);
        g2d.fillRect(119 + x, 51 + y, 1, 5);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 4, 1);
        g2d.fillRect(113 + x, 57 + y, 3, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 2, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 3);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 50 + y, 1, 2);
        g2d.fillRect(107 + x, 50 + y, 1, 2);
        g2d.fillRect(108 + x, 50 + y, 1, 2);
        g2d.fillRect(109 + x, 50 + y, 1, 2);
        g2d.fillRect(110 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 2);
        g2d.fillRect(113 + x, 50 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 2);
        g2d.fillRect(117 + x, 50 + y, 1, 6);
        g2d.fillRect(102 + x, 51 + y, 1, 4);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 4);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 4);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 56 + y, 2, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 4);
        g2d.fillRect(114 + x, 51 + y, 1, 5);
        g2d.fillRect(115 + x, 51 + y, 1, 4);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 3);
        g2d.fillRect(106 + x, 52 + y, 8, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 53 + y, 1, 2);
        g2d.fillRect(109 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 4);
        g2d.fillRect(111 + x, 53 + y, 1, 4);
        g2d.fillRect(112 + x, 53 + y, 1, 4);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 48 + y, 2, 1);
        g2d.fillRect(107 + x, 48 + y, 1, 2);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 2);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(121 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 7);
        g2d.fillRect(122 + x, 52 + y, 1, 8);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 4);
        g2d.fillRect(123 + x, 54 + y, 1, 5);
        g2d.fillRect(124 + x, 55 + y, 1, 3);
        g2d.fillRect(98 + x, 56 + y, 1, 5);
        g2d.fillRect(99 + x, 57 + y, 1, 5);
        g2d.fillRect(121 + x, 57 + y, 1, 3);
        g2d.fillRect(120 + x, 58 + y, 1, 3);
        g2d.fillRect(100 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 59 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 3);
        g2d.fillRect(101 + x, 60 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 3);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(118 + x, 60 + y, 1, 3);
        g2d.fillRect(119 + x, 60 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 4);
        g2d.fillRect(103 + x, 47 + y, 1, 3);
        g2d.fillRect(104 + x, 47 + y, 1, 2);
        g2d.fillRect(105 + x, 47 + y, 1, 3);
        g2d.fillRect(106 + x, 47 + y, 1, 3);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 3, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 4);
        g2d.fillRect(101 + x, 48 + y, 1, 4);
        g2d.fillRect(108 + x, 48 + y, 1, 3);
        g2d.fillRect(112 + x, 48 + y, 2, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 3, 1);
        g2d.fillRect(120 + x, 48 + y, 2, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 3);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 10);
        g2d.fillRect(113 + x, 49 + y, 1, 3);
        g2d.fillRect(117 + x, 49 + y, 2, 1);
        g2d.fillRect(121 + x, 49 + y, 1, 2);
        g2d.fillRect(122 + x, 49 + y, 1, 3);
        g2d.fillRect(111 + x, 50 + y, 2, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(123 + x, 50 + y, 1, 2);
        g2d.fillRect(96 + x, 51 + y, 1, 3);
        g2d.fillRect(99 + x, 51 + y, 1, 6);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 5);
        g2d.fillRect(124 + x, 52 + y, 1, 3);
        g2d.fillRect(123 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(119 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 2, 1);
        g2d.fillRect(104 + x, 62 + y, 2, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 2, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 3);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 3);
        g2d.fillRect(103 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 50 + y, 1, 3);
        g2d.fillRect(106 + x, 50 + y, 2, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 3);
        g2d.fillRect(115 + x, 50 + y, 1, 2);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(109 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 51 + y, 1, 6);
        g2d.fillRect(101 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 54 + y, 1, 4);
        g2d.fillRect(105 + x, 54 + y, 2, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 3);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 1, 3);
        g2d.fillRect(108 + x, 56 + y, 1, 5);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 52 + y, 1, 4);
        g2d.fillRect(115 + x, 52 + y, 1, 6);
        g2d.fillRect(116 + x, 52 + y, 1, 4);
        g2d.fillRect(117 + x, 52 + y, 1, 3);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 10, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 6);
        g2d.fillRect(111 + x, 54 + y, 1, 6);
        g2d.fillRect(112 + x, 54 + y, 1, 4);
        g2d.fillRect(113 + x, 54 + y, 1, 5);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 2, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 47 + y, 1, 4);
        g2d.fillRect(98 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(107 + x, 48 + y, 3, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 2, 1);
        g2d.fillRect(121 + x, 50 + y, 2, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 10);
        g2d.fillRect(123 + x, 51 + y, 1, 9);
        g2d.fillRect(95 + x, 53 + y, 1, 6);
        g2d.fillRect(122 + x, 53 + y, 1, 1);
        g2d.fillRect(94 + x, 54 + y, 1, 4);
        g2d.fillRect(124 + x, 54 + y, 1, 5);
        g2d.fillRect(125 + x, 55 + y, 1, 3);
        g2d.fillRect(97 + x, 56 + y, 1, 6);
        g2d.fillRect(98 + x, 57 + y, 1, 6);
        g2d.fillRect(121 + x, 57 + y, 1, 5);
        g2d.fillRect(122 + x, 57 + y, 1, 4);
        g2d.fillRect(120 + x, 58 + y, 1, 5);
        g2d.fillRect(99 + x, 59 + y, 1, 4);
        g2d.fillRect(103 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(100 + x, 60 + y, 1, 3);
        g2d.fillRect(101 + x, 60 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(118 + x, 60 + y, 1, 3);
        g2d.fillRect(119 + x, 60 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 5);
        g2d.fillRect(102 + x, 46 + y, 1, 3);
        g2d.fillRect(103 + x, 46 + y, 1, 3);
        g2d.fillRect(104 + x, 46 + y, 1, 3);
        g2d.fillRect(105 + x, 46 + y, 1, 3);
        g2d.fillRect(106 + x, 46 + y, 2, 1);
        g2d.fillRect(114 + x, 46 + y, 4, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 4);
        g2d.fillRect(120 + x, 46 + y, 1, 3);
        g2d.fillRect(121 + x, 46 + y, 1, 3);
        g2d.fillRect(99 + x, 47 + y, 1, 12);
        g2d.fillRect(107 + x, 47 + y, 2, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 4);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(122 + x, 47 + y, 1, 3);
        g2d.fillRect(95 + x, 48 + y, 1, 5);
        g2d.fillRect(96 + x, 48 + y, 1, 3);
        g2d.fillRect(98 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(106 + x, 48 + y, 1, 2);
        g2d.fillRect(111 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(123 + x, 48 + y, 1, 3);
        g2d.fillRect(107 + x, 49 + y, 2, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(124 + x, 49 + y, 1, 5);
        g2d.fillRect(94 + x, 50 + y, 1, 4);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 5);
        g2d.fillRect(98 + x, 51 + y, 1, 6);
        g2d.fillRect(121 + x, 51 + y, 2, 1);
        g2d.fillRect(125 + x, 51 + y, 1, 4);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(122 + x, 54 + y, 1, 3);
        g2d.fillRect(121 + x, 55 + y, 1, 2);
        g2d.fillRect(100 + x, 56 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 5);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 4);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 46 + y, 2, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 4);
        g2d.fillRect(102 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 3);
        g2d.fillRect(104 + x, 49 + y, 1, 3);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 3);
        g2d.fillRect(106 + x, 50 + y, 1, 2);
        g2d.fillRect(107 + x, 50 + y, 1, 2);
        g2d.fillRect(108 + x, 50 + y, 1, 3);
        g2d.fillRect(109 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 3);
        g2d.fillRect(114 + x, 50 + y, 1, 3);
        g2d.fillRect(118 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 8);
        g2d.fillRect(100 + x, 51 + y, 1, 5);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 2, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 3);
        g2d.fillRect(101 + x, 53 + y, 1, 4);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 4);
        g2d.fillRect(108 + x, 56 + y, 1, 4);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 3);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 3);
        g2d.fillRect(115 + x, 51 + y, 1, 7);
        g2d.fillRect(116 + x, 51 + y, 1, 5);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 52 + y, 1, 4);
        g2d.fillRect(107 + x, 52 + y, 1, 4);
        g2d.fillRect(109 + x, 52 + y, 1, 4);
        g2d.fillRect(110 + x, 52 + y, 1, 8);
        g2d.fillRect(112 + x, 52 + y, 1, 7);
        g2d.fillRect(113 + x, 52 + y, 1, 6);
        g2d.fillRect(117 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 52 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 3);
        g2d.fillRect(111 + x, 53 + y, 1, 6);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("c"))
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
