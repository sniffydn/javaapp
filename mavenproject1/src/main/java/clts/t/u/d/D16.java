/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.d;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D16 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    int prevStep = 0;

    public D16()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 7;
    }

    public D16(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 7;
    }

    public D16(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 7;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);

        if(step == 9 || step == 10 || step == 11 || step == 5 || step == 6 || step == 7 || (step == 8 && prevStep == 7))
        {
            paintTL1(x, 0, g2d);
        }
        else if (step == 1 || step == 2 || step == 3 || step == 13 || step == 14 || step == 15 || (step == 0 && prevStep == 15))
        {
            paintTL3(x, 0, g2d);
        }
        else
        {
            paintTL2(x, 0, g2d);
        }

        prevStep = step;
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equals("b"))
        {
            drawB(x,y,g2d);
        }
    }



    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintLB(offsetX, 0, g2d);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, offsetY, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(99 + x, 51 + y, 2, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 2, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 2, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 51 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 2, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 2, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 2, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 54 + y, 1, 3);
        g2d.fillRect(99 + x, 54 + y, 1, 4);
        g2d.fillRect(120 + x, 54 + y, 1, 4);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 5, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 3, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 6, 1);
        g2d.fillRect(113 + x, 58 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 6, 1);
        g2d.fillRect(113 + x, 57 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 2, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 2, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 2, 1);
        g2d.fillRect(114 + x, 56 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(114 + x, 55 + y, 3, 1);
    }





    public void paintLB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 90 + y, 1, 3);
        g2d.fillRect(100 + x, 90 + y, 1, 19);
        g2d.fillRect(103 + x, 91 + y, 1, 3);
        g2d.fillRect(102 + x, 94 + y, 1, 4);
        g2d.fillRect(99 + x, 108 + y, 1, 8);
        g2d.fillRect(100 + x, 112 + y, 1, 4);
        g2d.fillRect(101 + x, 113 + y, 1, 15);
        g2d.fillRect(107 + x, 113 + y, 1, 9);
        g2d.fillRect(97 + x, 116 + y, 1, 15);
        g2d.fillRect(112 + x, 120 + y, 1, 1);
        g2d.fillRect(121 + x, 123 + y, 1, 8);
        g2d.fillRect(113 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 1);
        g2d.fillRect(96 + x, 128 + y, 1, 6);
        g2d.fillRect(103 + x, 128 + y, 1, 4);
        g2d.fillRect(124 + x, 128 + y, 1, 2);
        g2d.fillRect(122 + x, 130 + y, 1, 20);
        g2d.fillRect(115 + x, 132 + y, 1, 1);
        g2d.fillRect(124 + x, 140 + y, 1, 8);
        g2d.fillRect(121 + x, 143 + y, 1, 10);
        g2d.fillRect(123 + x, 143 + y, 1, 8);
        g2d.fillRect(125 + x, 144 + y, 1, 1);
        g2d.fillRect(104 + x, 145 + y, 1, 3);
        g2d.fillRect(120 + x, 146 + y, 1, 3);
        g2d.fillRect(98 + x, 147 + y, 1, 3);
        g2d.fillRect(115 + x, 147 + y, 1, 3);
        g2d.fillRect(103 + x, 148 + y, 1, 1);
        g2d.fillRect(105 + x, 148 + y, 1, 5);
        g2d.fillRect(125 + x, 148 + y, 1, 3);
        g2d.fillRect(97 + x, 150 + y, 1, 8);
        g2d.fillRect(99 + x, 150 + y, 1, 3);
        g2d.fillRect(124 + x, 150 + y, 1, 2);
        g2d.fillRect(104 + x, 151 + y, 1, 1);
        g2d.fillRect(122 + x, 152 + y, 1, 1);
        g2d.fillRect(125 + x, 152 + y, 1, 3);
        g2d.fillRect(98 + x, 153 + y, 1, 2);
        g2d.fillRect(116 + x, 154 + y, 1, 4);
        g2d.fillRect(96 + x, 155 + y, 1, 4);
        g2d.fillRect(117 + x, 155 + y, 1, 2);
        g2d.fillRect(108 + x, 156 + y, 1, 9);
        g2d.fillRect(122 + x, 156 + y, 1, 5);
        g2d.fillRect(123 + x, 156 + y, 1, 2);
        g2d.fillRect(94 + x, 157 + y, 1, 10);
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 2, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 2, 1);
        g2d.fillRect(107 + x, 159 + y, 1, 1);
        g2d.fillRect(93 + x, 160 + y, 1, 2);
        g2d.fillRect(125 + x, 160 + y, 1, 5);
        g2d.fillRect(95 + x, 161 + y, 1, 2);
        g2d.fillRect(127 + x, 161 + y, 1, 4);
        g2d.fillRect(109 + x, 162 + y, 1, 3);
        g2d.fillRect(104 + x, 163 + y, 1, 2);
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(111 + x, 163 + y, 1, 2);
        g2d.fillRect(124 + x, 163 + y, 1, 2);
        g2d.fillRect(126 + x, 163 + y, 1, 2);
        g2d.fillRect(128 + x, 163 + y, 1, 1);
        g2d.fillRect(93 + x, 164 + y, 1, 3);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(112 + x, 164 + y, 1, 2);
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(118 + x, 164 + y, 1, 2);
        g2d.fillRect(122 + x, 164 + y, 2, 1);
        g2d.fillRect(96 + x, 165 + y, 1, 1);
        g2d.fillRect(98 + x, 165 + y, 1, 2);
        g2d.fillRect(102 + x, 165 + y, 1, 1);
        g2d.fillRect(120 + x, 165 + y, 2, 1);
        g2d.fillRect(95 + x, 166 + y, 1, 1);
        g2d.fillRect(100 + x, 166 + y, 2, 1);
        g2d.fillRect(115 + x, 166 + y, 3, 1);
        g2d.fillRect(122 + x, 166 + y, 1, 1);
        g2d.fillRect(102 + x, 167 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 4);
        g2d.fillRect(101 + x, 86 + y, 1, 27);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 6);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 9);
        g2d.fillRect(111 + x, 91 + y, 1, 9);
        g2d.fillRect(106 + x, 93 + y, 1, 7);
        g2d.fillRect(109 + x, 93 + y, 1, 12);
        g2d.fillRect(115 + x, 93 + y, 1, 29);
        g2d.fillRect(116 + x, 93 + y, 1, 6);
        g2d.fillRect(117 + x, 93 + y, 1, 14);
        g2d.fillRect(103 + x, 94 + y, 1, 11);
        g2d.fillRect(114 + x, 97 + y, 1, 21);
        g2d.fillRect(102 + x, 98 + y, 1, 9);
        g2d.fillRect(105 + x, 99 + y, 1, 7);
        g2d.fillRect(108 + x, 100 + y, 1, 3);
        g2d.fillRect(118 + x, 100 + y, 1, 7);
        g2d.fillRect(113 + x, 101 + y, 1, 13);
        g2d.fillRect(109 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 106 + y, 1, 5);
        g2d.fillRect(100 + x, 109 + y, 1, 3);
        g2d.fillRect(105 + x, 109 + y, 1, 27);
        g2d.fillRect(109 + x, 109 + y, 1, 3);
        g2d.fillRect(119 + x, 109 + y, 1, 3);
        g2d.fillRect(120 + x, 109 + y, 1, 1);
        g2d.fillRect(106 + x, 111 + y, 1, 11);
        g2d.fillRect(110 + x, 111 + y, 1, 9);
        g2d.fillRect(107 + x, 112 + y, 1, 1);
        g2d.fillRect(108 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 113 + y, 1, 6);
        g2d.fillRect(119 + x, 113 + y, 1, 1);
        g2d.fillRect(102 + x, 114 + y, 1, 14);
        g2d.fillRect(98 + x, 116 + y, 1, 14);
        g2d.fillRect(99 + x, 116 + y, 1, 9);
        g2d.fillRect(100 + x, 116 + y, 1, 2);
        g2d.fillRect(111 + x, 116 + y, 1, 6);
        g2d.fillRect(119 + x, 116 + y, 1, 4);
        g2d.fillRect(112 + x, 118 + y, 1, 2);
        g2d.fillRect(108 + x, 119 + y, 1, 5);
        g2d.fillRect(118 + x, 119 + y, 1, 8);
        g2d.fillRect(122 + x, 119 + y, 2, 1);
        g2d.fillRect(103 + x, 120 + y, 1, 8);
        g2d.fillRect(114 + x, 120 + y, 1, 26);
        g2d.fillRect(121 + x, 120 + y, 1, 3);
        g2d.fillRect(123 + x, 120 + y, 1, 23);
        g2d.fillRect(109 + x, 121 + y, 1, 26);
        g2d.fillRect(113 + x, 121 + y, 1, 4);
        g2d.fillRect(120 + x, 121 + y, 1, 2);
        g2d.fillRect(124 + x, 121 + y, 1, 7);
        g2d.fillRect(110 + x, 122 + y, 1, 19);
        g2d.fillRect(122 + x, 122 + y, 1, 8);
        g2d.fillRect(111 + x, 123 + y, 1, 13);
        g2d.fillRect(117 + x, 124 + y, 1, 5);
        g2d.fillRect(116 + x, 125 + y, 1, 2);
        g2d.fillRect(112 + x, 126 + y, 1, 5);
        g2d.fillRect(113 + x, 126 + y, 1, 2);
        g2d.fillRect(104 + x, 127 + y, 1, 5);
        g2d.fillRect(101 + x, 128 + y, 1, 14);
        g2d.fillRect(115 + x, 128 + y, 1, 4);
        g2d.fillRect(102 + x, 130 + y, 1, 5);
        g2d.fillRect(106 + x, 130 + y, 1, 8);
        g2d.fillRect(107 + x, 130 + y, 1, 19);
        g2d.fillRect(97 + x, 131 + y, 1, 19);
        g2d.fillRect(119 + x, 131 + y, 1, 7);
        g2d.fillRect(121 + x, 132 + y, 1, 11);
        g2d.fillRect(103 + x, 133 + y, 1, 15);
        g2d.fillRect(115 + x, 133 + y, 1, 11);
        g2d.fillRect(96 + x, 134 + y, 1, 3);
        g2d.fillRect(116 + x, 134 + y, 1, 3);
        g2d.fillRect(98 + x, 137 + y, 1, 10);
        g2d.fillRect(104 + x, 137 + y, 1, 8);
        g2d.fillRect(113 + x, 137 + y, 1, 19);
        g2d.fillRect(118 + x, 137 + y, 1, 7);
        g2d.fillRect(102 + x, 138 + y, 1, 13);
        g2d.fillRect(108 + x, 138 + y, 1, 10);
        g2d.fillRect(99 + x, 140 + y, 1, 10);
        g2d.fillRect(105 + x, 140 + y, 1, 8);
        g2d.fillRect(117 + x, 141 + y, 1, 14);
        g2d.fillRect(116 + x, 145 + y, 1, 9);
        g2d.fillRect(125 + x, 145 + y, 1, 3);
        g2d.fillRect(112 + x, 146 + y, 1, 9);
        g2d.fillRect(96 + x, 147 + y, 1, 8);
        g2d.fillRect(104 + x, 148 + y, 1, 3);
        g2d.fillRect(106 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 148 + y, 1, 9);
        g2d.fillRect(124 + x, 148 + y, 1, 2);
        g2d.fillRect(103 + x, 149 + y, 1, 15);
        g2d.fillRect(98 + x, 150 + y, 1, 3);
        g2d.fillRect(115 + x, 150 + y, 1, 10);
        g2d.fillRect(122 + x, 150 + y, 1, 2);
        g2d.fillRect(95 + x, 151 + y, 1, 10);
        g2d.fillRect(110 + x, 151 + y, 1, 1);
        g2d.fillRect(119 + x, 151 + y, 1, 7);
        g2d.fillRect(125 + x, 151 + y, 2, 1);
        g2d.fillRect(104 + x, 152 + y, 1, 5);
        g2d.fillRect(120 + x, 152 + y, 1, 6);
        g2d.fillRect(124 + x, 152 + y, 1, 3);
        g2d.fillRect(126 + x, 152 + y, 1, 6);
        g2d.fillRect(109 + x, 153 + y, 1, 5);
        g2d.fillRect(121 + x, 153 + y, 1, 5);
        g2d.fillRect(102 + x, 155 + y, 1, 10);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(110 + x, 155 + y, 1, 8);
        g2d.fillRect(114 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 155 + y, 1, 1);
        g2d.fillRect(128 + x, 155 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 7);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(105 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 8);
        g2d.fillRect(106 + x, 158 + y, 1, 2);
        g2d.fillRect(107 + x, 158 + y, 1, 1);
        g2d.fillRect(116 + x, 158 + y, 1, 3);
        g2d.fillRect(127 + x, 158 + y, 1, 1);
        g2d.fillRect(96 + x, 159 + y, 1, 4);
        g2d.fillRect(99 + x, 159 + y, 1, 7);
        g2d.fillRect(100 + x, 159 + y, 1, 7);
        g2d.fillRect(119 + x, 159 + y, 1, 6);
        g2d.fillRect(120 + x, 159 + y, 1, 6);
        g2d.fillRect(121 + x, 159 + y, 1, 6);
        g2d.fillRect(104 + x, 160 + y, 1, 3);
        g2d.fillRect(107 + x, 160 + y, 1, 4);
        g2d.fillRect(126 + x, 160 + y, 1, 3);
        g2d.fillRect(117 + x, 161 + y, 1, 2);
        g2d.fillRect(118 + x, 161 + y, 1, 3);
        g2d.fillRect(122 + x, 161 + y, 1, 3);
        g2d.fillRect(128 + x, 161 + y, 1, 2);
        g2d.fillRect(95 + x, 163 + y, 1, 3);
        g2d.fillRect(98 + x, 163 + y, 1, 2);
        g2d.fillRect(112 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 84 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 4);
        g2d.fillRect(104 + x, 88 + y, 1, 3);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 7);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 6);
        g2d.fillRect(114 + x, 93 + y, 1, 4);
        g2d.fillRect(105 + x, 96 + y, 1, 3);
        g2d.fillRect(107 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 6);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(113 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 25);
        g2d.fillRect(112 + x, 103 + y, 1, 3);
        g2d.fillRect(102 + x, 107 + y, 1, 7);
        g2d.fillRect(106 + x, 107 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 3);
        g2d.fillRect(112 + x, 111 + y, 1, 7);
        g2d.fillRect(109 + x, 112 + y, 1, 9);
        g2d.fillRect(111 + x, 112 + y, 1, 4);
        g2d.fillRect(103 + x, 113 + y, 1, 7);
        g2d.fillRect(113 + x, 114 + y, 1, 7);
        g2d.fillRect(122 + x, 114 + y, 1, 1);
        g2d.fillRect(108 + x, 115 + y, 1, 4);
        g2d.fillRect(100 + x, 118 + y, 1, 25);
        g2d.fillRect(114 + x, 118 + y, 1, 2);
        g2d.fillRect(116 + x, 119 + y, 1, 6);
        g2d.fillRect(110 + x, 120 + y, 1, 2);
        g2d.fillRect(117 + x, 120 + y, 1, 4);
        g2d.fillRect(119 + x, 120 + y, 1, 8);
        g2d.fillRect(122 + x, 120 + y, 1, 2);
        g2d.fillRect(112 + x, 121 + y, 1, 5);
        g2d.fillRect(111 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 6);
        g2d.fillRect(120 + x, 123 + y, 1, 12);
        g2d.fillRect(108 + x, 124 + y, 1, 3);
        g2d.fillRect(99 + x, 125 + y, 1, 6);
        g2d.fillRect(118 + x, 127 + y, 1, 3);
        g2d.fillRect(102 + x, 129 + y, 1, 1);
        g2d.fillRect(98 + x, 130 + y, 1, 7);
        g2d.fillRect(112 + x, 131 + y, 1, 3);
        g2d.fillRect(103 + x, 132 + y, 2, 1);
        g2d.fillRect(108 + x, 132 + y, 1, 6);
        g2d.fillRect(104 + x, 133 + y, 1, 4);
        g2d.fillRect(102 + x, 135 + y, 1, 3);
        g2d.fillRect(105 + x, 136 + y, 1, 4);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
        g2d.fillRect(118 + x, 136 + y, 1, 1);
        g2d.fillRect(106 + x, 138 + y, 1, 10);
        g2d.fillRect(119 + x, 138 + y, 1, 4);
        g2d.fillRect(112 + x, 140 + y, 1, 6);
        g2d.fillRect(116 + x, 140 + y, 1, 5);
        g2d.fillRect(117 + x, 140 + y, 1, 1);
        g2d.fillRect(110 + x, 141 + y, 1, 7);
        g2d.fillRect(101 + x, 142 + y, 1, 7);
        g2d.fillRect(111 + x, 144 + y, 1, 6);
        g2d.fillRect(115 + x, 144 + y, 1, 3);
        g2d.fillRect(119 + x, 145 + y, 1, 1);
        g2d.fillRect(114 + x, 146 + y, 1, 9);
        g2d.fillRect(109 + x, 147 + y, 1, 1);
        g2d.fillRect(108 + x, 148 + y, 1, 1);
        g2d.fillRect(109 + x, 149 + y, 1, 4);
        g2d.fillRect(119 + x, 149 + y, 1, 2);
        g2d.fillRect(120 + x, 149 + y, 1, 3);
        g2d.fillRect(108 + x, 151 + y, 1, 4);
        g2d.fillRect(123 + x, 151 + y, 1, 5);
        g2d.fillRect(101 + x, 152 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 3);
        g2d.fillRect(99 + x, 153 + y, 1, 4);
        g2d.fillRect(100 + x, 153 + y, 1, 6);
        g2d.fillRect(122 + x, 153 + y, 1, 2);
        g2d.fillRect(107 + x, 154 + y, 1, 4);
        g2d.fillRect(128 + x, 154 + y, 1, 1);
        g2d.fillRect(112 + x, 155 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 2, 1);
        g2d.fillRect(98 + x, 156 + y, 1, 7);
        g2d.fillRect(101 + x, 156 + y, 1, 2);
        g2d.fillRect(106 + x, 156 + y, 1, 2);
        g2d.fillRect(104 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 157 + y, 1, 1);
        g2d.fillRect(125 + x, 157 + y, 1, 3);
        g2d.fillRect(97 + x, 158 + y, 1, 8);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 158 + y, 1, 5);
        g2d.fillRect(118 + x, 158 + y, 1, 3);
        g2d.fillRect(121 + x, 158 + y, 1, 1);
        g2d.fillRect(126 + x, 158 + y, 1, 2);
        g2d.fillRect(104 + x, 159 + y, 2, 1);
        g2d.fillRect(105 + x, 160 + y, 1, 4);
        g2d.fillRect(106 + x, 160 + y, 1, 3);
        g2d.fillRect(113 + x, 161 + y, 1, 5);
        g2d.fillRect(116 + x, 161 + y, 1, 3);
        g2d.fillRect(96 + x, 163 + y, 1, 2);
        g2d.fillRect(103 + x, 164 + y, 1, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 2);
        g2d.fillRect(117 + x, 165 + y, 1, 1);
        g2d.fillRect(119 + x, 165 + y, 1, 1);
        g2d.fillRect(99 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 1, 7);
        g2d.fillRect(107 + x, 98 + y, 1, 14);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(112 + x, 100 + y, 1, 3);
        g2d.fillRect(106 + x, 101 + y, 1, 5);
        g2d.fillRect(111 + x, 101 + y, 1, 5);
        g2d.fillRect(116 + x, 107 + y, 1, 3);
        g2d.fillRect(110 + x, 108 + y, 1, 3);
        g2d.fillRect(117 + x, 108 + y, 1, 5);
        g2d.fillRect(121 + x, 109 + y, 1, 11);
        g2d.fillRect(122 + x, 109 + y, 1, 4);
        g2d.fillRect(108 + x, 110 + y, 1, 3);
        g2d.fillRect(118 + x, 115 + y, 1, 4);
        g2d.fillRect(120 + x, 118 + y, 1, 3);
        g2d.fillRect(107 + x, 124 + y, 1, 5);
        g2d.fillRect(108 + x, 127 + y, 1, 3);
        g2d.fillRect(102 + x, 128 + y, 1, 1);
        g2d.fillRect(117 + x, 129 + y, 1, 11);
        g2d.fillRect(113 + x, 131 + y, 1, 5);
        g2d.fillRect(118 + x, 131 + y, 1, 5);
        g2d.fillRect(112 + x, 134 + y, 1, 3);
        g2d.fillRect(111 + x, 137 + y, 1, 7);
        g2d.fillRect(116 + x, 137 + y, 1, 3);
        g2d.fillRect(109 + x, 148 + y, 2, 1);
        g2d.fillRect(106 + x, 149 + y, 1, 1);
        g2d.fillRect(108 + x, 149 + y, 1, 2);
        g2d.fillRect(110 + x, 149 + y, 1, 2);
        g2d.fillRect(111 + x, 150 + y, 1, 6);
        g2d.fillRect(107 + x, 151 + y, 1, 3);
        g2d.fillRect(127 + x, 151 + y, 1, 7);
        g2d.fillRect(128 + x, 151 + y, 1, 3);
        g2d.fillRect(106 + x, 152 + y, 1, 4);
        g2d.fillRect(98 + x, 155 + y, 1, 1);
        g2d.fillRect(112 + x, 156 + y, 1, 2);
        g2d.fillRect(114 + x, 156 + y, 1, 1);
        g2d.fillRect(124 + x, 156 + y, 1, 7);
        g2d.fillRect(125 + x, 156 + y, 1, 1);
        g2d.fillRect(113 + x, 158 + y, 1, 3);
        g2d.fillRect(117 + x, 158 + y, 1, 3);
        g2d.fillRect(123 + x, 158 + y, 1, 6);
        g2d.fillRect(128 + x, 158 + y, 1, 3);
        g2d.fillRect(114 + x, 159 + y, 1, 5);
        g2d.fillRect(127 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(104 + x, 91 + y, 1, 11);
        g2d.fillRect(106 + x, 91 + y, 1, 2);
        g2d.fillRect(105 + x, 92 + y, 1, 4);
        g2d.fillRect(112 + x, 98 + y, 1, 2);
        g2d.fillRect(110 + x, 100 + y, 1, 8);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 7);
        g2d.fillRect(103 + x, 105 + y, 1, 8);
        g2d.fillRect(109 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 2);
        g2d.fillRect(105 + x, 106 + y, 1, 3);
        g2d.fillRect(106 + x, 106 + y, 1, 1);
        g2d.fillRect(111 + x, 106 + y, 1, 6);
        g2d.fillRect(109 + x, 107 + y, 1, 2);
        g2d.fillRect(117 + x, 107 + y, 2, 1);
        g2d.fillRect(106 + x, 108 + y, 1, 3);
        g2d.fillRect(118 + x, 108 + y, 1, 7);
        g2d.fillRect(120 + x, 110 + y, 1, 8);
        g2d.fillRect(119 + x, 112 + y, 1, 1);
        g2d.fillRect(117 + x, 113 + y, 1, 7);
        g2d.fillRect(122 + x, 113 + y, 1, 1);
        g2d.fillRect(119 + x, 114 + y, 1, 2);
        g2d.fillRect(122 + x, 115 + y, 1, 4);
        g2d.fillRect(106 + x, 122 + y, 1, 8);
        g2d.fillRect(107 + x, 122 + y, 1, 2);
        g2d.fillRect(113 + x, 128 + y, 1, 3);
        g2d.fillRect(116 + x, 128 + y, 1, 6);
        g2d.fillRect(119 + x, 128 + y, 1, 3);
        g2d.fillRect(107 + x, 129 + y, 1, 1);
        g2d.fillRect(108 + x, 130 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 1, 1);
        g2d.fillRect(99 + x, 131 + y, 1, 9);
        g2d.fillRect(121 + x, 131 + y, 1, 1);
        g2d.fillRect(120 + x, 135 + y, 1, 11);
        g2d.fillRect(113 + x, 136 + y, 1, 1);
        g2d.fillRect(112 + x, 137 + y, 1, 3);
        g2d.fillRect(119 + x, 142 + y, 1, 3);
        g2d.fillRect(100 + x, 143 + y, 1, 10);
        g2d.fillRect(118 + x, 144 + y, 1, 4);
        g2d.fillRect(119 + x, 146 + y, 1, 3);
        g2d.fillRect(101 + x, 149 + y, 1, 3);
        g2d.fillRect(107 + x, 149 + y, 1, 2);
        g2d.fillRect(106 + x, 150 + y, 1, 2);
        g2d.fillRect(102 + x, 151 + y, 1, 4);
        g2d.fillRect(101 + x, 153 + y, 1, 3);
        g2d.fillRect(105 + x, 153 + y, 1, 4);
        g2d.fillRect(113 + x, 156 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
        g2d.fillRect(115 + x, 160 + y, 1, 5);
        g2d.fillRect(117 + x, 163 + y, 1, 2);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(121 + x, 104 + y, 1, 1);
        g2d.fillRect(121 + x, 106 + y, 1, 1);
        g2d.fillRect(123 + x, 109 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 2, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 2);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(121 + x, 105 + y, 2, 1);
        g2d.fillRect(123 + x, 107 + y, 1, 2);
        g2d.fillRect(123 + x, 110 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 103 + y, 1, 2);
        g2d.fillRect(120 + x, 104 + y, 1, 2);
        g2d.fillRect(122 + x, 106 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(122 + x, 121 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 96 + y, 1, 5);
        g2d.fillRect(109 + x, 96 + y, 1, 7);
        g2d.fillRect(112 + x, 96 + y, 1, 2);
        g2d.fillRect(113 + x, 96 + y, 1, 3);
        g2d.fillRect(123 + x, 96 + y, 1, 6);
        g2d.fillRect(108 + x, 98 + y, 1, 4);
        g2d.fillRect(107 + x, 100 + y, 1, 2);
        g2d.fillRect(115 + x, 100 + y, 1, 3);
        g2d.fillRect(106 + x, 101 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 9);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(124 + x, 102 + y, 1, 12);
        g2d.fillRect(111 + x, 103 + y, 1, 5);
        g2d.fillRect(112 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 5);
        g2d.fillRect(116 + x, 107 + y, 1, 3);
        g2d.fillRect(111 + x, 109 + y, 1, 6);
        g2d.fillRect(112 + x, 109 + y, 1, 5);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(121 + x, 109 + y, 1, 2);
        g2d.fillRect(116 + x, 111 + y, 1, 7);
        g2d.fillRect(122 + x, 111 + y, 1, 7);
        g2d.fillRect(125 + x, 111 + y, 1, 9);
        g2d.fillRect(118 + x, 112 + y, 1, 3);
        g2d.fillRect(119 + x, 112 + y, 1, 4);
        g2d.fillRect(117 + x, 113 + y, 1, 6);
        g2d.fillRect(114 + x, 114 + y, 2, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 7);
        g2d.fillRect(124 + x, 115 + y, 1, 3);
        g2d.fillRect(126 + x, 115 + y, 1, 7);
        g2d.fillRect(116 + x, 119 + y, 1, 7);
        g2d.fillRect(119 + x, 119 + y, 1, 8);
        g2d.fillRect(127 + x, 119 + y, 1, 4);
        g2d.fillRect(117 + x, 120 + y, 1, 2);
        g2d.fillRect(118 + x, 120 + y, 1, 6);
        g2d.fillRect(128 + x, 121 + y, 1, 12);
        g2d.fillRect(124 + x, 122 + y, 1, 3);
        g2d.fillRect(122 + x, 123 + y, 1, 1);
        g2d.fillRect(117 + x, 124 + y, 1, 1);
        g2d.fillRect(123 + x, 124 + y, 1, 2);
        g2d.fillRect(125 + x, 124 + y, 1, 5);
        g2d.fillRect(129 + x, 124 + y, 1, 2);
        g2d.fillRect(121 + x, 126 + y, 1, 9);
        g2d.fillRect(117 + x, 127 + y, 1, 6);
        g2d.fillRect(122 + x, 127 + y, 1, 4);
        g2d.fillRect(126 + x, 127 + y, 1, 6);
        g2d.fillRect(129 + x, 128 + y, 1, 8);
        g2d.fillRect(118 + x, 130 + y, 1, 6);
        g2d.fillRect(127 + x, 130 + y, 1, 3);
        g2d.fillRect(119 + x, 131 + y, 1, 10);
        g2d.fillRect(130 + x, 131 + y, 1, 6);
        g2d.fillRect(122 + x, 134 + y, 1, 2);
        g2d.fillRect(123 + x, 134 + y, 1, 2);
        g2d.fillRect(124 + x, 134 + y, 1, 3);
        g2d.fillRect(125 + x, 136 + y, 1, 4);
        g2d.fillRect(129 + x, 137 + y, 1, 7);
        g2d.fillRect(124 + x, 141 + y, 1, 2);
        g2d.fillRect(131 + x, 141 + y, 1, 3);
        g2d.fillRect(120 + x, 142 + y, 1, 3);
        g2d.fillRect(121 + x, 143 + y, 1, 2);
        g2d.fillRect(125 + x, 143 + y, 1, 2);
        g2d.fillRect(126 + x, 143 + y, 1, 2);
        g2d.fillRect(132 + x, 143 + y, 1, 2);
        g2d.fillRect(127 + x, 144 + y, 1, 2);
        g2d.fillRect(122 + x, 145 + y, 1, 3);
        g2d.fillRect(128 + x, 145 + y, 1, 3);
        g2d.fillRect(129 + x, 147 + y, 1, 3);
        g2d.fillRect(123 + x, 148 + y, 1, 3);
        g2d.fillRect(130 + x, 148 + y, 1, 2);
        g2d.fillRect(131 + x, 148 + y, 1, 3);
        g2d.fillRect(132 + x, 150 + y, 1, 1);
        g2d.fillRect(125 + x, 152 + y, 1, 1);
        g2d.fillRect(127 + x, 152 + y, 1, 4);
        g2d.fillRect(131 + x, 152 + y, 1, 3);
        g2d.fillRect(132 + x, 152 + y, 1, 2);
        g2d.fillRect(133 + x, 152 + y, 1, 6);
        g2d.fillRect(134 + x, 155 + y, 1, 4);
        g2d.fillRect(135 + x, 159 + y, 1, 2);
        g2d.fillRect(127 + x, 160 + y, 1, 1);
        g2d.fillRect(132 + x, 160 + y, 1, 4);
        g2d.fillRect(128 + x, 161 + y, 1, 1);
        g2d.fillRect(134 + x, 161 + y, 1, 3);
        g2d.fillRect(130 + x, 162 + y, 2, 1);
        g2d.fillRect(133 + x, 162 + y, 1, 2);
        g2d.fillRect(135 + x, 162 + y, 1, 2);
        g2d.fillRect(136 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 5);
        g2d.fillRect(116 + x, 96 + y, 2, 1);
        g2d.fillRect(122 + x, 96 + y, 1, 5);
        g2d.fillRect(106 + x, 97 + y, 1, 4);
        g2d.fillRect(111 + x, 97 + y, 1, 6);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(121 + x, 97 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 8);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 102 + y, 1, 4);
        g2d.fillRect(123 + x, 102 + y, 1, 5);
        g2d.fillRect(115 + x, 104 + y, 1, 2);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 4);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 108 + y, 1, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 3);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 3);
        g2d.fillRect(121 + x, 111 + y, 1, 9);
        g2d.fillRect(114 + x, 113 + y, 1, 1);
        g2d.fillRect(123 + x, 113 + y, 1, 2);
        g2d.fillRect(124 + x, 114 + y, 1, 1);
        g2d.fillRect(118 + x, 115 + y, 1, 3);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(119 + x, 118 + y, 2, 1);
        g2d.fillRect(124 + x, 118 + y, 1, 4);
        g2d.fillRect(117 + x, 119 + y, 1, 1);
        g2d.fillRect(120 + x, 119 + y, 1, 2);
        g2d.fillRect(123 + x, 121 + y, 1, 3);
        g2d.fillRect(117 + x, 122 + y, 1, 2);
        g2d.fillRect(127 + x, 123 + y, 1, 1);
        g2d.fillRect(117 + x, 125 + y, 1, 2);
        g2d.fillRect(124 + x, 125 + y, 1, 3);
        g2d.fillRect(123 + x, 126 + y, 1, 8);
        g2d.fillRect(118 + x, 128 + y, 1, 2);
        g2d.fillRect(127 + x, 128 + y, 1, 2);
        g2d.fillRect(122 + x, 131 + y, 1, 3);
        g2d.fillRect(120 + x, 133 + y, 1, 3);
        g2d.fillRect(126 + x, 133 + y, 1, 3);
        g2d.fillRect(127 + x, 133 + y, 1, 5);
        g2d.fillRect(128 + x, 133 + y, 1, 5);
        g2d.fillRect(121 + x, 135 + y, 1, 4);
        g2d.fillRect(122 + x, 136 + y, 2, 1);
        g2d.fillRect(129 + x, 136 + y, 1, 1);
        g2d.fillRect(123 + x, 137 + y, 2, 1);
        g2d.fillRect(130 + x, 137 + y, 1, 5);
        g2d.fillRect(120 + x, 138 + y, 1, 4);
        g2d.fillRect(124 + x, 138 + y, 1, 3);
        g2d.fillRect(128 + x, 139 + y, 1, 4);
        g2d.fillRect(125 + x, 140 + y, 1, 3);
        g2d.fillRect(126 + x, 142 + y, 1, 1);
        g2d.fillRect(122 + x, 144 + y, 1, 1);
        g2d.fillRect(128 + x, 144 + y, 1, 1);
        g2d.fillRect(121 + x, 145 + y, 1, 3);
        g2d.fillRect(123 + x, 145 + y, 1, 3);
        g2d.fillRect(126 + x, 145 + y, 1, 3);
        g2d.fillRect(129 + x, 145 + y, 1, 2);
        g2d.fillRect(130 + x, 145 + y, 1, 3);
        g2d.fillRect(124 + x, 146 + y, 1, 7);
        g2d.fillRect(122 + x, 148 + y, 1, 4);
        g2d.fillRect(125 + x, 148 + y, 1, 4);
        g2d.fillRect(130 + x, 150 + y, 1, 8);
        g2d.fillRect(123 + x, 151 + y, 1, 6);
        g2d.fillRect(131 + x, 151 + y, 1, 1);
        g2d.fillRect(125 + x, 153 + y, 2, 1);
        g2d.fillRect(126 + x, 154 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 4);
        g2d.fillRect(128 + x, 155 + y, 1, 3);
        g2d.fillRect(125 + x, 158 + y, 1, 2);
        g2d.fillRect(129 + x, 158 + y, 1, 1);
        g2d.fillRect(126 + x, 159 + y, 1, 2);
        g2d.fillRect(131 + x, 160 + y, 1, 2);
        g2d.fillRect(133 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(119 + x, 96 + y, 3, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 98 + y, 1, 3);
        g2d.fillRect(121 + x, 98 + y, 1, 3);
        g2d.fillRect(120 + x, 101 + y, 1, 2);
        g2d.fillRect(122 + x, 101 + y, 1, 2);
        g2d.fillRect(121 + x, 103 + y, 1, 1);
        g2d.fillRect(122 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 3);
        g2d.fillRect(113 + x, 111 + y, 1, 3);
        g2d.fillRect(123 + x, 115 + y, 1, 2);
        g2d.fillRect(118 + x, 118 + y, 1, 2);
        g2d.fillRect(123 + x, 119 + y, 1, 2);
        g2d.fillRect(122 + x, 120 + y, 1, 1);
        g2d.fillRect(125 + x, 120 + y, 1, 4);
        g2d.fillRect(120 + x, 122 + y, 1, 2);
        g2d.fillRect(122 + x, 122 + y, 1, 1);
        g2d.fillRect(121 + x, 123 + y, 1, 2);
        g2d.fillRect(126 + x, 124 + y, 1, 3);
        g2d.fillRect(120 + x, 127 + y, 1, 6);
        g2d.fillRect(124 + x, 128 + y, 1, 6);
        g2d.fillRect(125 + x, 129 + y, 1, 1);
        g2d.fillRect(125 + x, 135 + y, 1, 1);
        g2d.fillRect(126 + x, 136 + y, 1, 6);
        g2d.fillRect(123 + x, 138 + y, 1, 1);
        g2d.fillRect(128 + x, 138 + y, 1, 1);
        g2d.fillRect(121 + x, 139 + y, 1, 4);
        g2d.fillRect(127 + x, 141 + y, 1, 3);
        g2d.fillRect(122 + x, 143 + y, 1, 1);
        g2d.fillRect(128 + x, 143 + y, 1, 1);
        g2d.fillRect(131 + x, 144 + y, 1, 1);
        g2d.fillRect(132 + x, 145 + y, 1, 3);
        g2d.fillRect(125 + x, 147 + y, 1, 1);
        g2d.fillRect(126 + x, 148 + y, 1, 5);
        g2d.fillRect(127 + x, 148 + y, 1, 4);
        g2d.fillRect(133 + x, 148 + y, 1, 2);
        g2d.fillRect(124 + x, 153 + y, 1, 2);
        g2d.fillRect(125 + x, 154 + y, 1, 4);
        g2d.fillRect(128 + x, 154 + y, 1, 1);
        g2d.fillRect(131 + x, 155 + y, 1, 1);
        g2d.fillRect(131 + x, 157 + y, 1, 3);
        g2d.fillRect(126 + x, 158 + y, 1, 1);
        g2d.fillRect(130 + x, 158 + y, 1, 1);
        g2d.fillRect(127 + x, 159 + y, 2, 1);
        g2d.fillRect(132 + x, 159 + y, 1, 1);
        g2d.fillRect(128 + x, 160 + y, 1, 1);
        g2d.fillRect(129 + x, 161 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 2, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 6);
        g2d.fillRect(116 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 2);
        g2d.fillRect(122 + x, 103 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 2, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 2);
        g2d.fillRect(120 + x, 106 + y, 1, 2);
        g2d.fillRect(119 + x, 107 + y, 1, 5);
        g2d.fillRect(121 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 108 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 4);
        g2d.fillRect(122 + x, 109 + y, 1, 2);
        g2d.fillRect(118 + x, 111 + y, 1, 1);
        g2d.fillRect(120 + x, 111 + y, 1, 7);
        g2d.fillRect(123 + x, 111 + y, 1, 2);
        g2d.fillRect(119 + x, 116 + y, 1, 2);
        g2d.fillRect(123 + x, 117 + y, 1, 2);
        g2d.fillRect(122 + x, 118 + y, 1, 1);
        g2d.fillRect(120 + x, 121 + y, 1, 1);
        g2d.fillRect(126 + x, 122 + y, 1, 2);
        g2d.fillRect(120 + x, 124 + y, 1, 3);
        g2d.fillRect(122 + x, 124 + y, 1, 3);
        g2d.fillRect(127 + x, 124 + y, 1, 4);
        g2d.fillRect(121 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 2);
        g2d.fillRect(119 + x, 127 + y, 1, 4);
        g2d.fillRect(125 + x, 130 + y, 1, 5);
        g2d.fillRect(120 + x, 136 + y, 1, 2);
        g2d.fillRect(122 + x, 137 + y, 1, 6);
        g2d.fillRect(127 + x, 138 + y, 1, 3);
        g2d.fillRect(123 + x, 139 + y, 1, 6);
        g2d.fillRect(130 + x, 142 + y, 1, 3);
        g2d.fillRect(124 + x, 143 + y, 1, 3);
        g2d.fillRect(129 + x, 144 + y, 1, 1);
        g2d.fillRect(125 + x, 145 + y, 1, 2);
        g2d.fillRect(131 + x, 145 + y, 1, 3);
        g2d.fillRect(127 + x, 146 + y, 1, 2);
        g2d.fillRect(128 + x, 148 + y, 1, 6);
        g2d.fillRect(132 + x, 148 + y, 1, 2);
        g2d.fillRect(129 + x, 150 + y, 1, 8);
        g2d.fillRect(133 + x, 150 + y, 1, 2);
        g2d.fillRect(132 + x, 151 + y, 1, 1);
        g2d.fillRect(132 + x, 154 + y, 1, 5);
        g2d.fillRect(126 + x, 155 + y, 1, 3);
        g2d.fillRect(127 + x, 156 + y, 1, 3);
        g2d.fillRect(131 + x, 156 + y, 1, 1);
        g2d.fillRect(128 + x, 158 + y, 1, 1);
        g2d.fillRect(133 + x, 158 + y, 1, 3);
        g2d.fillRect(129 + x, 159 + y, 1, 2);
        g2d.fillRect(130 + x, 159 + y, 1, 2);
        g2d.fillRect(134 + x, 159 + y, 1, 2);
        g2d.fillRect(135 + x, 161 + y, 2, 1);
        g2d.fillRect(136 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(107 + x, 96 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 98 + y, 1, 4);
        g2d.fillRect(120 + x, 98 + y, 1, 3);
        g2d.fillRect(121 + x, 101 + y, 1, 2);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(122 + x, 119 + y, 1, 1);
        g2d.fillRect(121 + x, 120 + y, 1, 3);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(121 + x, 104 + y, 1, 1);
        g2d.fillRect(121 + x, 106 + y, 1, 1);
        g2d.fillRect(123 + x, 107 + y, 1, 1);
        g2d.fillRect(122 + x, 109 + y, 1, 1);
        g2d.fillRect(124 + x, 109 + y, 1, 1);
        g2d.fillRect(124 + x, 112 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 2, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 2);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(121 + x, 105 + y, 2, 1);
        g2d.fillRect(123 + x, 110 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 103 + y, 1, 2);
        g2d.fillRect(120 + x, 104 + y, 1, 2);
        g2d.fillRect(122 + x, 106 + y, 1, 3);
        g2d.fillRect(123 + x, 108 + y, 1, 2);
        g2d.fillRect(124 + x, 110 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(124 + x, 121 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 96 + y, 1, 5);
        g2d.fillRect(109 + x, 96 + y, 1, 7);
        g2d.fillRect(112 + x, 96 + y, 1, 2);
        g2d.fillRect(113 + x, 96 + y, 1, 3);
        g2d.fillRect(122 + x, 96 + y, 2, 1);
        g2d.fillRect(123 + x, 97 + y, 1, 3);
        g2d.fillRect(108 + x, 98 + y, 1, 4);
        g2d.fillRect(107 + x, 100 + y, 1, 2);
        g2d.fillRect(115 + x, 100 + y, 1, 3);
        g2d.fillRect(124 + x, 100 + y, 1, 8);
        g2d.fillRect(106 + x, 101 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 9);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(111 + x, 103 + y, 1, 5);
        g2d.fillRect(112 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 5);
        g2d.fillRect(125 + x, 106 + y, 1, 8);
        g2d.fillRect(116 + x, 107 + y, 1, 3);
        g2d.fillRect(111 + x, 109 + y, 1, 6);
        g2d.fillRect(112 + x, 109 + y, 1, 5);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(121 + x, 109 + y, 1, 2);
        g2d.fillRect(116 + x, 111 + y, 1, 7);
        g2d.fillRect(122 + x, 111 + y, 1, 7);
        g2d.fillRect(126 + x, 111 + y, 1, 9);
        g2d.fillRect(118 + x, 112 + y, 1, 3);
        g2d.fillRect(119 + x, 112 + y, 1, 4);
        g2d.fillRect(123 + x, 112 + y, 1, 7);
        g2d.fillRect(117 + x, 113 + y, 1, 9);
        g2d.fillRect(124 + x, 113 + y, 1, 2);
        g2d.fillRect(114 + x, 114 + y, 2, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 11);
        g2d.fillRect(125 + x, 115 + y, 1, 3);
        g2d.fillRect(127 + x, 115 + y, 1, 7);
        g2d.fillRect(118 + x, 118 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 4);
        g2d.fillRect(120 + x, 119 + y, 1, 3);
        g2d.fillRect(128 + x, 119 + y, 1, 4);
        g2d.fillRect(118 + x, 120 + y, 1, 7);
        g2d.fillRect(119 + x, 120 + y, 1, 3);
        g2d.fillRect(129 + x, 121 + y, 1, 5);
        g2d.fillRect(123 + x, 122 + y, 1, 4);
        g2d.fillRect(125 + x, 122 + y, 1, 7);
        g2d.fillRect(117 + x, 123 + y, 1, 3);
        g2d.fillRect(122 + x, 123 + y, 1, 1);
        g2d.fillRect(116 + x, 124 + y, 1, 1);
        g2d.fillRect(119 + x, 124 + y, 1, 2);
        g2d.fillRect(124 + x, 124 + y, 1, 1);
        g2d.fillRect(128 + x, 124 + y, 1, 9);
        g2d.fillRect(121 + x, 126 + y, 1, 9);
        g2d.fillRect(116 + x, 127 + y, 1, 9);
        g2d.fillRect(122 + x, 127 + y, 1, 4);
        g2d.fillRect(126 + x, 127 + y, 1, 6);
        g2d.fillRect(129 + x, 128 + y, 1, 9);
        g2d.fillRect(117 + x, 130 + y, 1, 11);
        g2d.fillRect(127 + x, 130 + y, 1, 3);
        g2d.fillRect(118 + x, 131 + y, 1, 9);
        g2d.fillRect(130 + x, 131 + y, 1, 5);
        g2d.fillRect(122 + x, 134 + y, 1, 2);
        g2d.fillRect(123 + x, 134 + y, 1, 3);
        g2d.fillRect(124 + x, 134 + y, 1, 6);
        g2d.fillRect(128 + x, 137 + y, 1, 7);
        g2d.fillRect(123 + x, 141 + y, 1, 2);
        g2d.fillRect(130 + x, 141 + y, 1, 3);
        g2d.fillRect(119 + x, 142 + y, 1, 3);
        g2d.fillRect(120 + x, 143 + y, 1, 8);
        g2d.fillRect(124 + x, 143 + y, 1, 2);
        g2d.fillRect(125 + x, 143 + y, 1, 3);
        g2d.fillRect(131 + x, 143 + y, 1, 2);
        g2d.fillRect(126 + x, 144 + y, 1, 6);
        g2d.fillRect(127 + x, 147 + y, 1, 3);
        g2d.fillRect(128 + x, 148 + y, 1, 3);
        g2d.fillRect(129 + x, 150 + y, 1, 1);
        g2d.fillRect(122 + x, 152 + y, 1, 1);
        g2d.fillRect(124 + x, 152 + y, 1, 4);
        g2d.fillRect(128 + x, 152 + y, 1, 3);
        g2d.fillRect(129 + x, 152 + y, 1, 2);
        g2d.fillRect(130 + x, 152 + y, 1, 6);
        g2d.fillRect(131 + x, 155 + y, 1, 6);
        g2d.fillRect(122 + x, 160 + y, 1, 2);
        g2d.fillRect(128 + x, 160 + y, 1, 4);
        g2d.fillRect(126 + x, 161 + y, 1, 3);
        g2d.fillRect(124 + x, 162 + y, 2, 1);
        g2d.fillRect(127 + x, 162 + y, 1, 2);
        g2d.fillRect(129 + x, 162 + y, 1, 2);
        g2d.fillRect(130 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 5);
        g2d.fillRect(116 + x, 96 + y, 2, 1);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 4);
        g2d.fillRect(111 + x, 97 + y, 1, 6);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 8);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(123 + x, 100 + y, 1, 5);
        g2d.fillRect(112 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 104 + y, 1, 2);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 4);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 108 + y, 1, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 3);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 3);
        g2d.fillRect(121 + x, 111 + y, 1, 10);
        g2d.fillRect(114 + x, 113 + y, 1, 1);
        g2d.fillRect(125 + x, 114 + y, 1, 1);
        g2d.fillRect(118 + x, 115 + y, 1, 3);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(120 + x, 118 + y, 1, 1);
        g2d.fillRect(122 + x, 118 + y, 1, 2);
        g2d.fillRect(125 + x, 118 + y, 1, 4);
        g2d.fillRect(118 + x, 119 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 1);
        g2d.fillRect(116 + x, 123 + y, 1, 1);
        g2d.fillRect(124 + x, 123 + y, 1, 1);
        g2d.fillRect(128 + x, 123 + y, 1, 1);
        g2d.fillRect(116 + x, 125 + y, 1, 2);
        g2d.fillRect(124 + x, 125 + y, 1, 3);
        g2d.fillRect(123 + x, 126 + y, 1, 8);
        g2d.fillRect(117 + x, 128 + y, 1, 2);
        g2d.fillRect(127 + x, 128 + y, 1, 2);
        g2d.fillRect(122 + x, 131 + y, 1, 3);
        g2d.fillRect(120 + x, 133 + y, 1, 6);
        g2d.fillRect(126 + x, 133 + y, 1, 5);
        g2d.fillRect(127 + x, 133 + y, 1, 5);
        g2d.fillRect(128 + x, 133 + y, 1, 4);
        g2d.fillRect(121 + x, 135 + y, 1, 2);
        g2d.fillRect(122 + x, 136 + y, 1, 2);
        g2d.fillRect(123 + x, 137 + y, 1, 4);
        g2d.fillRect(129 + x, 137 + y, 1, 5);
        g2d.fillRect(119 + x, 138 + y, 1, 4);
        g2d.fillRect(127 + x, 139 + y, 1, 4);
        g2d.fillRect(118 + x, 140 + y, 1, 3);
        g2d.fillRect(124 + x, 140 + y, 1, 3);
        g2d.fillRect(125 + x, 142 + y, 1, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 9);
        g2d.fillRect(127 + x, 144 + y, 1, 3);
        g2d.fillRect(119 + x, 145 + y, 1, 7);
        g2d.fillRect(124 + x, 145 + y, 1, 3);
        g2d.fillRect(128 + x, 145 + y, 1, 3);
        g2d.fillRect(122 + x, 146 + y, 1, 6);
        g2d.fillRect(127 + x, 150 + y, 1, 8);
        g2d.fillRect(120 + x, 151 + y, 1, 6);
        g2d.fillRect(128 + x, 151 + y, 1, 1);
        g2d.fillRect(122 + x, 153 + y, 2, 1);
        g2d.fillRect(123 + x, 154 + y, 1, 1);
        g2d.fillRect(121 + x, 155 + y, 1, 6);
        g2d.fillRect(125 + x, 155 + y, 1, 3);
        g2d.fillRect(122 + x, 158 + y, 1, 2);
        g2d.fillRect(126 + x, 158 + y, 1, 1);
        g2d.fillRect(127 + x, 160 + y, 1, 2);
        g2d.fillRect(125 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(120 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 2, 1);
        g2d.fillRect(121 + x, 97 + y, 2, 1);
        g2d.fillRect(119 + x, 98 + y, 1, 3);
        g2d.fillRect(122 + x, 98 + y, 1, 2);
        g2d.fillRect(120 + x, 101 + y, 1, 2);
        g2d.fillRect(121 + x, 103 + y, 1, 1);
        g2d.fillRect(122 + x, 104 + y, 1, 1);
        g2d.fillRect(123 + x, 105 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 3);
        g2d.fillRect(113 + x, 111 + y, 1, 3);
        g2d.fillRect(124 + x, 116 + y, 1, 5);
        g2d.fillRect(119 + x, 118 + y, 1, 2);
        g2d.fillRect(126 + x, 120 + y, 1, 7);
        g2d.fillRect(120 + x, 122 + y, 1, 1);
        g2d.fillRect(124 + x, 122 + y, 1, 1);
        g2d.fillRect(119 + x, 123 + y, 1, 1);
        g2d.fillRect(121 + x, 123 + y, 1, 2);
        g2d.fillRect(120 + x, 127 + y, 1, 6);
        g2d.fillRect(124 + x, 128 + y, 1, 6);
        g2d.fillRect(119 + x, 129 + y, 1, 5);
        g2d.fillRect(125 + x, 129 + y, 1, 1);
        g2d.fillRect(125 + x, 135 + y, 1, 7);
        g2d.fillRect(122 + x, 138 + y, 1, 1);
        g2d.fillRect(127 + x, 138 + y, 1, 1);
        g2d.fillRect(120 + x, 139 + y, 1, 4);
        g2d.fillRect(126 + x, 141 + y, 1, 3);
        g2d.fillRect(121 + x, 143 + y, 1, 1);
        g2d.fillRect(127 + x, 143 + y, 1, 1);
        g2d.fillRect(130 + x, 144 + y, 1, 6);
        g2d.fillRect(123 + x, 147 + y, 1, 6);
        g2d.fillRect(124 + x, 148 + y, 1, 4);
        g2d.fillRect(121 + x, 153 + y, 1, 2);
        g2d.fillRect(122 + x, 154 + y, 1, 4);
        g2d.fillRect(125 + x, 154 + y, 1, 1);
        g2d.fillRect(128 + x, 155 + y, 1, 1);
        g2d.fillRect(128 + x, 157 + y, 1, 3);
        g2d.fillRect(123 + x, 158 + y, 1, 4);
        g2d.fillRect(127 + x, 158 + y, 1, 2);
        g2d.fillRect(124 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);
        g2d.fillRect(121 + x, 98 + y, 1, 2);
        g2d.fillRect(113 + x, 99 + y, 1, 6);
        g2d.fillRect(122 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 2);
        g2d.fillRect(118 + x, 105 + y, 2, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 2);
        g2d.fillRect(120 + x, 106 + y, 1, 2);
        g2d.fillRect(123 + x, 106 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 5);
        g2d.fillRect(121 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 108 + y, 1, 2);
        g2d.fillRect(124 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 4);
        g2d.fillRect(122 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 111 + y, 1, 1);
        g2d.fillRect(120 + x, 111 + y, 1, 7);
        g2d.fillRect(123 + x, 111 + y, 1, 1);
        g2d.fillRect(124 + x, 115 + y, 1, 1);
        g2d.fillRect(119 + x, 116 + y, 1, 2);
        g2d.fillRect(123 + x, 119 + y, 1, 1);
        g2d.fillRect(121 + x, 121 + y, 1, 1);
        g2d.fillRect(127 + x, 122 + y, 1, 6);
        g2d.fillRect(120 + x, 124 + y, 1, 3);
        g2d.fillRect(122 + x, 124 + y, 1, 3);
        g2d.fillRect(121 + x, 125 + y, 1, 1);
        g2d.fillRect(117 + x, 126 + y, 1, 2);
        g2d.fillRect(119 + x, 126 + y, 1, 3);
        g2d.fillRect(118 + x, 127 + y, 1, 4);
        g2d.fillRect(125 + x, 130 + y, 1, 5);
        g2d.fillRect(119 + x, 134 + y, 1, 4);
        g2d.fillRect(121 + x, 137 + y, 1, 6);
        g2d.fillRect(126 + x, 138 + y, 1, 3);
        g2d.fillRect(122 + x, 139 + y, 1, 7);
        g2d.fillRect(129 + x, 142 + y, 1, 8);
        g2d.fillRect(123 + x, 143 + y, 1, 4);
        g2d.fillRect(128 + x, 144 + y, 1, 1);
        g2d.fillRect(125 + x, 146 + y, 1, 8);
        g2d.fillRect(126 + x, 150 + y, 1, 8);
        g2d.fillRect(130 + x, 150 + y, 1, 2);
        g2d.fillRect(129 + x, 151 + y, 1, 1);
        g2d.fillRect(129 + x, 154 + y, 1, 8);
        g2d.fillRect(123 + x, 155 + y, 1, 3);
        g2d.fillRect(124 + x, 156 + y, 1, 3);
        g2d.fillRect(128 + x, 156 + y, 1, 1);
        g2d.fillRect(125 + x, 158 + y, 1, 3);
        g2d.fillRect(130 + x, 158 + y, 1, 5);
        g2d.fillRect(126 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(107 + x, 96 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 2, 1);
        g2d.fillRect(112 + x, 98 + y, 1, 4);
        g2d.fillRect(120 + x, 98 + y, 1, 3);
        g2d.fillRect(121 + x, 100 + y, 1, 3);
        g2d.fillRect(122 + x, 101 + y, 1, 3);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(122 + x, 120 + y, 1, 3);
        g2d.fillRect(123 + x, 120 + y, 1, 2);
        g2d.fillRect(121 + x, 122 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 1);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 1);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(120 + x, 106 + y, 1, 1);
        g2d.fillRect(121 + x, 109 + y, 1, 1);
        g2d.fillRect(123 + x, 109 + y, 1, 1);
        g2d.fillRect(123 + x, 112 + y, 1, 1);
        g2d.fillRect(124 + x, 113 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 2, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 5);
        g2d.fillRect(115 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 3);
        g2d.fillRect(118 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(120 + x, 105 + y, 2, 1);
        g2d.fillRect(122 + x, 107 + y, 1, 3);
        g2d.fillRect(124 + x, 109 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 103 + y, 1, 2);
        g2d.fillRect(119 + x, 104 + y, 1, 2);
        g2d.fillRect(121 + x, 106 + y, 1, 3);
        g2d.fillRect(122 + x, 110 + y, 2, 1);
        g2d.fillRect(123 + x, 111 + y, 1, 1);
        g2d.fillRect(124 + x, 114 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(123 + x, 121 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 96 + y, 1, 4);
        g2d.fillRect(109 + x, 96 + y, 1, 4);
        g2d.fillRect(112 + x, 96 + y, 1, 2);
        g2d.fillRect(113 + x, 96 + y, 1, 3);
        g2d.fillRect(122 + x, 96 + y, 2, 1);
        g2d.fillRect(123 + x, 97 + y, 1, 6);
        g2d.fillRect(108 + x, 98 + y, 1, 5);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 2);
        g2d.fillRect(107 + x, 100 + y, 1, 2);
        g2d.fillRect(114 + x, 100 + y, 1, 3);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(109 + x, 101 + y, 1, 9);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(110 + x, 103 + y, 1, 5);
        g2d.fillRect(124 + x, 103 + y, 1, 5);
        g2d.fillRect(111 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 5);
        g2d.fillRect(125 + x, 106 + y, 1, 8);
        g2d.fillRect(115 + x, 107 + y, 1, 3);
        g2d.fillRect(110 + x, 109 + y, 1, 6);
        g2d.fillRect(111 + x, 109 + y, 1, 5);
        g2d.fillRect(112 + x, 109 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(120 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 111 + y, 1, 12);
        g2d.fillRect(121 + x, 111 + y, 1, 8);
        g2d.fillRect(126 + x, 111 + y, 1, 9);
        g2d.fillRect(117 + x, 112 + y, 1, 4);
        g2d.fillRect(118 + x, 112 + y, 1, 3);
        g2d.fillRect(116 + x, 113 + y, 1, 2);
        g2d.fillRect(123 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 114 + y, 1, 6);
        g2d.fillRect(114 + x, 114 + y, 1, 4);
        g2d.fillRect(120 + x, 115 + y, 1, 3);
        g2d.fillRect(125 + x, 115 + y, 1, 3);
        g2d.fillRect(127 + x, 115 + y, 1, 8);
        g2d.fillRect(122 + x, 116 + y, 1, 2);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 7);
        g2d.fillRect(118 + x, 119 + y, 1, 4);
        g2d.fillRect(128 + x, 119 + y, 1, 7);
        g2d.fillRect(116 + x, 120 + y, 1, 2);
        g2d.fillRect(117 + x, 120 + y, 1, 7);
        g2d.fillRect(119 + x, 120 + y, 1, 1);
        g2d.fillRect(123 + x, 120 + y, 1, 1);
        g2d.fillRect(113 + x, 121 + y, 1, 1);
        g2d.fillRect(122 + x, 121 + y, 1, 5);
        g2d.fillRect(126 + x, 121 + y, 1, 1);
        g2d.fillRect(116 + x, 123 + y, 1, 3);
        g2d.fillRect(121 + x, 123 + y, 1, 1);
        g2d.fillRect(124 + x, 123 + y, 1, 6);
        g2d.fillRect(115 + x, 124 + y, 1, 1);
        g2d.fillRect(118 + x, 124 + y, 1, 2);
        g2d.fillRect(123 + x, 124 + y, 1, 1);
        g2d.fillRect(127 + x, 124 + y, 1, 7);
        g2d.fillRect(120 + x, 126 + y, 1, 9);
        g2d.fillRect(115 + x, 127 + y, 1, 9);
        g2d.fillRect(121 + x, 127 + y, 1, 4);
        g2d.fillRect(128 + x, 128 + y, 1, 9);
        g2d.fillRect(125 + x, 129 + y, 1, 4);
        g2d.fillRect(116 + x, 130 + y, 1, 11);
        g2d.fillRect(117 + x, 131 + y, 1, 9);
        g2d.fillRect(129 + x, 131 + y, 1, 5);
        g2d.fillRect(121 + x, 134 + y, 1, 2);
        g2d.fillRect(122 + x, 134 + y, 1, 3);
        g2d.fillRect(123 + x, 134 + y, 1, 6);
        g2d.fillRect(127 + x, 137 + y, 1, 7);
        g2d.fillRect(122 + x, 141 + y, 1, 2);
        g2d.fillRect(129 + x, 141 + y, 1, 3);
        g2d.fillRect(118 + x, 142 + y, 1, 3);
        g2d.fillRect(119 + x, 143 + y, 1, 8);
        g2d.fillRect(123 + x, 143 + y, 1, 2);
        g2d.fillRect(124 + x, 143 + y, 1, 3);
        g2d.fillRect(130 + x, 143 + y, 1, 2);
        g2d.fillRect(125 + x, 144 + y, 1, 6);
        g2d.fillRect(126 + x, 147 + y, 1, 3);
        g2d.fillRect(127 + x, 148 + y, 1, 3);
        g2d.fillRect(128 + x, 150 + y, 1, 1);
        g2d.fillRect(121 + x, 152 + y, 1, 1);
        g2d.fillRect(123 + x, 152 + y, 1, 4);
        g2d.fillRect(127 + x, 152 + y, 1, 3);
        g2d.fillRect(128 + x, 152 + y, 1, 2);
        g2d.fillRect(129 + x, 152 + y, 1, 6);
        g2d.fillRect(130 + x, 155 + y, 1, 6);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(127 + x, 160 + y, 1, 4);
        g2d.fillRect(125 + x, 161 + y, 1, 3);
        g2d.fillRect(123 + x, 162 + y, 2, 1);
        g2d.fillRect(126 + x, 162 + y, 1, 2);
        g2d.fillRect(128 + x, 162 + y, 1, 2);
        g2d.fillRect(129 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 7);
        g2d.fillRect(116 + x, 96 + y, 2, 1);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 3);
        g2d.fillRect(111 + x, 97 + y, 1, 3);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(122 + x, 97 + y, 1, 6);
        g2d.fillRect(114 + x, 98 + y, 1, 2);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(109 + x, 100 + y, 1, 1);
        g2d.fillRect(113 + x, 100 + y, 1, 6);
        g2d.fillRect(111 + x, 102 + y, 1, 4);
        g2d.fillRect(123 + x, 103 + y, 1, 6);
        g2d.fillRect(114 + x, 104 + y, 1, 2);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 4);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 2);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(110 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 1);
        g2d.fillRect(119 + x, 108 + y, 1, 3);
        g2d.fillRect(124 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 3);
        g2d.fillRect(120 + x, 111 + y, 1, 4);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(125 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 3);
        g2d.fillRect(119 + x, 115 + y, 1, 5);
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(118 + x, 118 + y, 1, 1);
        g2d.fillRect(120 + x, 118 + y, 1, 3);
        g2d.fillRect(125 + x, 118 + y, 1, 3);
        g2d.fillRect(116 + x, 119 + y, 1, 1);
        g2d.fillRect(124 + x, 121 + y, 1, 2);
        g2d.fillRect(116 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 123 + y, 1, 1);
        g2d.fillRect(123 + x, 123 + y, 1, 1);
        g2d.fillRect(127 + x, 123 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 1, 2);
        g2d.fillRect(123 + x, 125 + y, 1, 3);
        g2d.fillRect(122 + x, 126 + y, 1, 8);
        g2d.fillRect(125 + x, 127 + y, 1, 2);
        g2d.fillRect(116 + x, 128 + y, 1, 2);
        g2d.fillRect(126 + x, 128 + y, 1, 10);
        g2d.fillRect(121 + x, 131 + y, 1, 3);
        g2d.fillRect(127 + x, 131 + y, 1, 6);
        g2d.fillRect(119 + x, 133 + y, 1, 6);
        g2d.fillRect(125 + x, 133 + y, 1, 5);
        g2d.fillRect(120 + x, 135 + y, 1, 2);
        g2d.fillRect(121 + x, 136 + y, 1, 2);
        g2d.fillRect(122 + x, 137 + y, 1, 4);
        g2d.fillRect(128 + x, 137 + y, 1, 5);
        g2d.fillRect(118 + x, 138 + y, 1, 4);
        g2d.fillRect(126 + x, 139 + y, 1, 4);
        g2d.fillRect(117 + x, 140 + y, 1, 3);
        g2d.fillRect(123 + x, 140 + y, 1, 3);
        g2d.fillRect(124 + x, 142 + y, 1, 1);
        g2d.fillRect(120 + x, 144 + y, 1, 9);
        g2d.fillRect(126 + x, 144 + y, 1, 3);
        g2d.fillRect(118 + x, 145 + y, 1, 7);
        g2d.fillRect(123 + x, 145 + y, 1, 3);
        g2d.fillRect(127 + x, 145 + y, 1, 3);
        g2d.fillRect(121 + x, 146 + y, 1, 6);
        g2d.fillRect(126 + x, 150 + y, 1, 8);
        g2d.fillRect(119 + x, 151 + y, 1, 6);
        g2d.fillRect(127 + x, 151 + y, 1, 1);
        g2d.fillRect(121 + x, 153 + y, 2, 1);
        g2d.fillRect(122 + x, 154 + y, 1, 1);
        g2d.fillRect(120 + x, 155 + y, 1, 6);
        g2d.fillRect(124 + x, 155 + y, 1, 3);
        g2d.fillRect(121 + x, 158 + y, 1, 2);
        g2d.fillRect(125 + x, 158 + y, 1, 1);
        g2d.fillRect(126 + x, 160 + y, 1, 2);
        g2d.fillRect(124 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(120 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 2, 1);
        g2d.fillRect(121 + x, 97 + y, 1, 6);
        g2d.fillRect(119 + x, 98 + y, 1, 2);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(122 + x, 103 + y, 1, 1);
        g2d.fillRect(121 + x, 104 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 1, 3);
        g2d.fillRect(112 + x, 111 + y, 1, 3);
        g2d.fillRect(122 + x, 115 + y, 1, 1);
        g2d.fillRect(124 + x, 115 + y, 1, 2);
        g2d.fillRect(123 + x, 116 + y, 1, 4);
        g2d.fillRect(117 + x, 118 + y, 1, 2);
        g2d.fillRect(124 + x, 119 + y, 1, 2);
        g2d.fillRect(126 + x, 120 + y, 1, 1);
        g2d.fillRect(125 + x, 121 + y, 1, 6);
        g2d.fillRect(119 + x, 122 + y, 1, 1);
        g2d.fillRect(123 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 2);
        g2d.fillRect(119 + x, 127 + y, 1, 6);
        g2d.fillRect(123 + x, 128 + y, 1, 6);
        g2d.fillRect(118 + x, 129 + y, 1, 5);
        g2d.fillRect(124 + x, 129 + y, 1, 1);
        g2d.fillRect(124 + x, 135 + y, 1, 7);
        g2d.fillRect(121 + x, 138 + y, 1, 1);
        g2d.fillRect(126 + x, 138 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 4);
        g2d.fillRect(125 + x, 141 + y, 1, 3);
        g2d.fillRect(120 + x, 143 + y, 1, 1);
        g2d.fillRect(126 + x, 143 + y, 1, 1);
        g2d.fillRect(129 + x, 144 + y, 1, 6);
        g2d.fillRect(122 + x, 147 + y, 1, 6);
        g2d.fillRect(123 + x, 148 + y, 1, 4);
        g2d.fillRect(120 + x, 153 + y, 1, 2);
        g2d.fillRect(121 + x, 154 + y, 1, 4);
        g2d.fillRect(124 + x, 154 + y, 1, 1);
        g2d.fillRect(127 + x, 155 + y, 1, 1);
        g2d.fillRect(127 + x, 157 + y, 1, 3);
        g2d.fillRect(122 + x, 158 + y, 1, 4);
        g2d.fillRect(126 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 159 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 2);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 100 + y, 1, 5);
        g2d.fillRect(120 + x, 100 + y, 1, 1);
        g2d.fillRect(115 + x, 102 + y, 1, 4);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 2);
        g2d.fillRect(122 + x, 104 + y, 1, 3);
        g2d.fillRect(117 + x, 105 + y, 2, 1);
        g2d.fillRect(113 + x, 106 + y, 1, 2);
        g2d.fillRect(119 + x, 106 + y, 1, 2);
        g2d.fillRect(118 + x, 107 + y, 1, 5);
        g2d.fillRect(120 + x, 107 + y, 1, 2);
        g2d.fillRect(117 + x, 108 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 4);
        g2d.fillRect(121 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(119 + x, 111 + y, 1, 4);
        g2d.fillRect(122 + x, 111 + y, 1, 4);
        g2d.fillRect(118 + x, 115 + y, 1, 3);
        g2d.fillRect(123 + x, 115 + y, 1, 1);
        g2d.fillRect(117 + x, 116 + y, 1, 2);
        g2d.fillRect(124 + x, 117 + y, 1, 2);
        g2d.fillRect(122 + x, 118 + y, 1, 1);
        g2d.fillRect(121 + x, 119 + y, 1, 1);
        g2d.fillRect(119 + x, 121 + y, 1, 1);
        g2d.fillRect(126 + x, 122 + y, 1, 6);
        g2d.fillRect(119 + x, 124 + y, 1, 3);
        g2d.fillRect(121 + x, 124 + y, 1, 3);
        g2d.fillRect(120 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 126 + y, 1, 2);
        g2d.fillRect(118 + x, 126 + y, 1, 3);
        g2d.fillRect(117 + x, 127 + y, 1, 4);
        g2d.fillRect(124 + x, 130 + y, 1, 5);
        g2d.fillRect(118 + x, 134 + y, 1, 4);
        g2d.fillRect(120 + x, 137 + y, 1, 6);
        g2d.fillRect(125 + x, 138 + y, 1, 3);
        g2d.fillRect(121 + x, 139 + y, 1, 7);
        g2d.fillRect(128 + x, 142 + y, 1, 8);
        g2d.fillRect(122 + x, 143 + y, 1, 4);
        g2d.fillRect(127 + x, 144 + y, 1, 1);
        g2d.fillRect(124 + x, 146 + y, 1, 8);
        g2d.fillRect(125 + x, 150 + y, 1, 8);
        g2d.fillRect(129 + x, 150 + y, 1, 2);
        g2d.fillRect(128 + x, 151 + y, 1, 1);
        g2d.fillRect(128 + x, 154 + y, 1, 8);
        g2d.fillRect(122 + x, 155 + y, 1, 3);
        g2d.fillRect(123 + x, 156 + y, 1, 3);
        g2d.fillRect(127 + x, 156 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 3);
        g2d.fillRect(129 + x, 158 + y, 1, 5);
        g2d.fillRect(125 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(107 + x, 96 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 2, 1);
        g2d.fillRect(112 + x, 98 + y, 1, 2);
        g2d.fillRect(120 + x, 99 + y, 1, 1);
        g2d.fillRect(111 + x, 100 + y, 1, 2);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 2);
        g2d.fillRect(121 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 2);
        g2d.fillRect(122 + x, 119 + y, 1, 2);
        g2d.fillRect(121 + x, 120 + y, 1, 3);
        g2d.fillRect(120 + x, 121 + y, 1, 2);
        g2d.fillRect(119 + x, 123 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 3);
        g2d.fillRect(114 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 3);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 3, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 10);
        g2d.fillRect(103 + x, 64 + y, 1, 12);
        g2d.fillRect(115 + x, 64 + y, 1, 6);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 9);
        g2d.fillRect(118 + x, 70 + y, 1, 8);
        g2d.fillRect(119 + x, 72 + y, 1, 9);
        g2d.fillRect(102 + x, 73 + y, 1, 5);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(120 + x, 79 + y, 1, 7);
        g2d.fillRect(121 + x, 81 + y, 1, 10);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 86 + y, 1, 8);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 5);
        g2d.fillRect(122 + x, 91 + y, 1, 5);
        g2d.fillRect(103 + x, 92 + y, 1, 3);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 3);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 56 + y, 1, 3);
        g2d.fillRect(109 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 58 + y, 1, 4);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 3, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 3);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 3);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 3, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 3);
        g2d.fillRect(106 + x, 66 + y, 1, 5);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 3);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 3);
        g2d.fillRect(104 + x, 73 + y, 1, 4);
        g2d.fillRect(116 + x, 73 + y, 1, 5);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 3);
        g2d.fillRect(105 + x, 76 + y, 1, 5);
        g2d.fillRect(115 + x, 77 + y, 1, 4);
        g2d.fillRect(117 + x, 77 + y, 1, 3);
        g2d.fillRect(102 + x, 78 + y, 1, 3);
        g2d.fillRect(118 + x, 78 + y, 1, 7);
        g2d.fillRect(114 + x, 80 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 6);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 6);
        g2d.fillRect(113 + x, 87 + y, 1, 6);
        g2d.fillRect(114 + x, 87 + y, 1, 6);
        g2d.fillRect(107 + x, 89 + y, 1, 5);
        g2d.fillRect(111 + x, 89 + y, 2, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 5);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 2, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 2, 1);
        g2d.fillRect(112 + x, 69 + y, 2, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 71 + y, 1, 2);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 2, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 3, 1);
        g2d.fillRect(107 + x, 70 + y, 2, 1);
        g2d.fillRect(112 + x, 70 + y, 3, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(109 + x, 71 + y, 1, 3);
        g2d.fillRect(110 + x, 71 + y, 1, 2);
        g2d.fillRect(115 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 7);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 3);
        g2d.fillRect(112 + x, 74 + y, 1, 6);
        g2d.fillRect(113 + x, 74 + y, 1, 4);
        g2d.fillRect(114 + x, 74 + y, 1, 6);
        g2d.fillRect(110 + x, 75 + y, 1, 2);
        g2d.fillRect(107 + x, 76 + y, 2, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 5);
        g2d.fillRect(108 + x, 77 + y, 2, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 4);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 7);
        g2d.fillRect(105 + x, 81 + y, 1, 3);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 4);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(116 + x, 83 + y, 1, 3);
        g2d.fillRect(117 + x, 83 + y, 1, 6);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 2, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 5);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 3);
        g2d.fillRect(115 + x, 86 + y, 1, 5);
        g2d.fillRect(105 + x, 87 + y, 1, 4);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 9);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 3);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 4);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 3, 1);
        g2d.fillRect(111 + x, 73 + y, 2, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 4);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(103 + x, 79 + y, 1, 3);
        g2d.fillRect(117 + x, 80 + y, 1, 3);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 2, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 5);
        g2d.fillRect(106 + x, 91 + y, 1, 5);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 1, 3);
        g2d.fillRect(116 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 2, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 3);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 2, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 2, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 3);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 74 + y, 1, 3);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 2);
        g2d.fillRect(111 + x, 77 + y, 1, 2);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 80 + y, 1, 3);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 3);
        g2d.fillRect(109 + x, 82 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 4);
        g2d.fillRect(103 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
    }
}
