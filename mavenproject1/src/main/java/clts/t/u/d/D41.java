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
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D41 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D41()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 11;
    }

    public D41(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 11;
    }

    public D41(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 11;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);

        if(step > 9 && step < 15)
        {
            paintB1(x,0,g2d);
        }
        else if(step < 7 && step > 1)
        {
            paintB2(x,0,g2d);
        }
        else
        {
            paintB3(x,0,g2d);
        }


    }
    int prevY = 0;


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
        prevY = offsetY;
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
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
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 4);
        g2d.fillRect(117 + x, 57 + y, 1, 4);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(99 + x, 52 + y, 5, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 2, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 2, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(99 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 2, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 57 + y, 1, 3);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 2, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(107 + x, 57 + y, 1, 4);
        g2d.fillRect(108 + x, 57 + y, 1, 4);
        g2d.fillRect(109 + x, 57 + y, 1, 4);
        g2d.fillRect(111 + x, 57 + y, 1, 4);
        g2d.fillRect(112 + x, 57 + y, 1, 4);
        g2d.fillRect(113 + x, 57 + y, 1, 4);
        g2d.fillRect(114 + x, 57 + y, 1, 4);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 4, 1);
        g2d.fillRect(112 + x, 54 + y, 4, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 4, 1);
        g2d.fillRect(112 + x, 56 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 2, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 2, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(105 + x, 55 + y, 2, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 7);
        g2d.fillRect(104 + x, 90 + y, 1, 3);
        g2d.fillRect(105 + x, 93 + y, 1, 6);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 173 + y, 1, 1);
        g2d.fillRect(103 + x, 174 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 89 + y, 1, 4);
        g2d.fillRect(117 + x, 89 + y, 1, 3);
        g2d.fillRect(118 + x, 89 + y, 1, 7);
        g2d.fillRect(106 + x, 93 + y, 1, 6);
        g2d.fillRect(107 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 100 + y, 1, 11);
        g2d.fillRect(108 + x, 100 + y, 1, 11);
        g2d.fillRect(109 + x, 102 + y, 1, 9);
        g2d.fillRect(110 + x, 111 + y, 1, 31);
        g2d.fillRect(109 + x, 142 + y, 1, 12);
        g2d.fillRect(108 + x, 154 + y, 1, 7);
        g2d.fillRect(107 + x, 161 + y, 1, 4);
        g2d.fillRect(106 + x, 165 + y, 1, 4);
        g2d.fillRect(105 + x, 169 + y, 1, 5);
        g2d.fillRect(104 + x, 172 + y, 1, 2);
        g2d.fillRect(106 + x, 172 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 3, 1);
        g2d.fillRect(103 + x, 173 + y, 1, 1);
        g2d.fillRect(107 + x, 173 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 2, 1);
        g2d.fillRect(117 + x, 173 + y, 2, 1);
        g2d.fillRect(99 + x, 174 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 1, 1);
        g2d.fillRect(119 + x, 174 + y, 1, 1);
        g2d.fillRect(100 + x, 175 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 89 + y, 1, 4);
        g2d.fillRect(107 + x, 89 + y, 1, 9);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(109 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 7, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 90 + y, 1, 22);
        g2d.fillRect(115 + x, 90 + y, 1, 17);
        g2d.fillRect(116 + x, 90 + y, 1, 15);
        g2d.fillRect(117 + x, 92 + y, 1, 3);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(107 + x, 100 + y, 1, 11);
        g2d.fillRect(109 + x, 100 + y, 1, 2);
        g2d.fillRect(113 + x, 107 + y, 1, 44);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(106 + x, 111 + y, 1, 15);
        g2d.fillRect(108 + x, 111 + y, 1, 14);
        g2d.fillRect(109 + x, 111 + y, 1, 31);
        g2d.fillRect(111 + x, 111 + y, 1, 31);
        g2d.fillRect(108 + x, 142 + y, 1, 12);
        g2d.fillRect(110 + x, 142 + y, 1, 12);
        g2d.fillRect(114 + x, 146 + y, 1, 12);
        g2d.fillRect(115 + x, 151 + y, 1, 21);
        g2d.fillRect(107 + x, 153 + y, 1, 8);
        g2d.fillRect(109 + x, 154 + y, 1, 7);
        g2d.fillRect(106 + x, 159 + y, 1, 6);
        g2d.fillRect(108 + x, 161 + y, 1, 4);
        g2d.fillRect(116 + x, 163 + y, 1, 9);
        g2d.fillRect(105 + x, 164 + y, 1, 5);
        g2d.fillRect(107 + x, 165 + y, 1, 4);
        g2d.fillRect(114 + x, 166 + y, 1, 6);
        g2d.fillRect(104 + x, 168 + y, 1, 4);
        g2d.fillRect(106 + x, 169 + y, 1, 3);
        g2d.fillRect(113 + x, 169 + y, 1, 4);
        g2d.fillRect(103 + x, 170 + y, 1, 3);
        g2d.fillRect(117 + x, 170 + y, 1, 3);
        g2d.fillRect(112 + x, 171 + y, 1, 2);
        g2d.fillRect(102 + x, 172 + y, 1, 2);
        g2d.fillRect(107 + x, 172 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 1, 1);
        g2d.fillRect(118 + x, 172 + y, 1, 1);
        g2d.fillRect(97 + x, 173 + y, 2, 1);
        g2d.fillRect(108 + x, 173 + y, 3, 1);
        g2d.fillRect(119 + x, 173 + y, 1, 1);
        g2d.fillRect(123 + x, 173 + y, 1, 1);
        g2d.fillRect(100 + x, 174 + y, 2, 1);
        g2d.fillRect(120 + x, 174 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 90 + y, 1, 20);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 81);
        g2d.fillRect(108 + x, 92 + y, 1, 6);
        g2d.fillRect(109 + x, 92 + y, 1, 8);
        g2d.fillRect(113 + x, 92 + y, 1, 15);
        g2d.fillRect(117 + x, 95 + y, 1, 12);
        g2d.fillRect(116 + x, 105 + y, 1, 4);
        g2d.fillRect(115 + x, 107 + y, 1, 44);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(107 + x, 111 + y, 1, 27);
        g2d.fillRect(114 + x, 112 + y, 1, 34);
        g2d.fillRect(117 + x, 123 + y, 1, 9);
        g2d.fillRect(108 + x, 125 + y, 1, 17);
        g2d.fillRect(105 + x, 126 + y, 1, 14);
        g2d.fillRect(118 + x, 132 + y, 1, 14);
        g2d.fillRect(116 + x, 137 + y, 1, 26);
        g2d.fillRect(104 + x, 140 + y, 1, 14);
        g2d.fillRect(106 + x, 140 + y, 1, 6);
        g2d.fillRect(107 + x, 140 + y, 1, 13);
        g2d.fillRect(119 + x, 146 + y, 1, 9);
        g2d.fillRect(105 + x, 151 + y, 1, 3);
        g2d.fillRect(113 + x, 151 + y, 1, 18);
        g2d.fillRect(103 + x, 154 + y, 1, 4);
        g2d.fillRect(106 + x, 154 + y, 1, 5);
        g2d.fillRect(117 + x, 154 + y, 1, 16);
        g2d.fillRect(104 + x, 155 + y, 1, 4);
        g2d.fillRect(120 + x, 155 + y, 1, 4);
        g2d.fillRect(114 + x, 158 + y, 1, 8);
        g2d.fillRect(103 + x, 159 + y, 1, 5);
        g2d.fillRect(105 + x, 159 + y, 1, 5);
        g2d.fillRect(121 + x, 160 + y, 1, 4);
        g2d.fillRect(109 + x, 161 + y, 1, 4);
        g2d.fillRect(102 + x, 164 + y, 1, 3);
        g2d.fillRect(104 + x, 164 + y, 1, 4);
        g2d.fillRect(118 + x, 164 + y, 1, 8);
        g2d.fillRect(122 + x, 164 + y, 1, 2);
        g2d.fillRect(108 + x, 165 + y, 1, 4);
        g2d.fillRect(111 + x, 166 + y, 1, 6);
        g2d.fillRect(123 + x, 166 + y, 1, 2);
        g2d.fillRect(101 + x, 167 + y, 1, 2);
        g2d.fillRect(103 + x, 167 + y, 1, 3);
        g2d.fillRect(119 + x, 168 + y, 1, 5);
        g2d.fillRect(124 + x, 168 + y, 1, 1);
        g2d.fillRect(100 + x, 169 + y, 1, 2);
        g2d.fillRect(102 + x, 169 + y, 1, 3);
        g2d.fillRect(107 + x, 169 + y, 1, 3);
        g2d.fillRect(125 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 3);
        g2d.fillRect(126 + x, 170 + y, 1, 2);
        g2d.fillRect(99 + x, 171 + y, 1, 1);
        g2d.fillRect(101 + x, 171 + y, 1, 3);
        g2d.fillRect(120 + x, 171 + y, 1, 3);
        g2d.fillRect(97 + x, 172 + y, 2, 1);
        g2d.fillRect(100 + x, 172 + y, 1, 2);
        g2d.fillRect(108 + x, 172 + y, 2, 1);
        g2d.fillRect(121 + x, 172 + y, 1, 2);
        g2d.fillRect(125 + x, 172 + y, 1, 1);
        g2d.fillRect(99 + x, 173 + y, 1, 1);
        g2d.fillRect(122 + x, 173 + y, 1, 1);
        g2d.fillRect(124 + x, 173 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 92 + y, 1, 18);
        g2d.fillRect(117 + x, 107 + y, 1, 16);
        g2d.fillRect(116 + x, 109 + y, 1, 28);
        g2d.fillRect(106 + x, 126 + y, 1, 14);
        g2d.fillRect(117 + x, 132 + y, 1, 22);
        g2d.fillRect(107 + x, 138 + y, 1, 2);
        g2d.fillRect(105 + x, 140 + y, 1, 11);
        g2d.fillRect(111 + x, 142 + y, 1, 24);
        g2d.fillRect(106 + x, 146 + y, 1, 8);
        g2d.fillRect(118 + x, 146 + y, 1, 18);
        g2d.fillRect(104 + x, 154 + y, 2, 1);
        g2d.fillRect(110 + x, 154 + y, 1, 16);
        g2d.fillRect(105 + x, 155 + y, 1, 4);
        g2d.fillRect(119 + x, 155 + y, 1, 13);
        g2d.fillRect(104 + x, 159 + y, 1, 5);
        g2d.fillRect(120 + x, 159 + y, 1, 12);
        g2d.fillRect(103 + x, 164 + y, 1, 3);
        g2d.fillRect(121 + x, 164 + y, 1, 8);
        g2d.fillRect(109 + x, 165 + y, 1, 7);
        g2d.fillRect(122 + x, 166 + y, 1, 7);
        g2d.fillRect(102 + x, 167 + y, 1, 2);
        g2d.fillRect(123 + x, 168 + y, 1, 5);
        g2d.fillRect(101 + x, 169 + y, 1, 2);
        g2d.fillRect(108 + x, 169 + y, 1, 3);
        g2d.fillRect(124 + x, 169 + y, 1, 4);
        g2d.fillRect(125 + x, 170 + y, 1, 2);
        g2d.fillRect(100 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 1);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 89 + y, 1, 4);
        g2d.fillRect(104 + x, 89 + y, 1, 11);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(117 + x, 92 + y, 1, 4);
        g2d.fillRect(105 + x, 99 + y, 1, 5);
        g2d.fillRect(104 + x, 173 + y, 1, 1);
        g2d.fillRect(101 + x, 174 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 89 + y, 1, 10);
        g2d.fillRect(117 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 91 + y, 1, 5);
        g2d.fillRect(106 + x, 93 + y, 1, 7);
        g2d.fillRect(104 + x, 100 + y, 1, 11);
        g2d.fillRect(107 + x, 100 + y, 1, 11);
        g2d.fillRect(108 + x, 102 + y, 1, 40);
        g2d.fillRect(106 + x, 104 + y, 1, 5);
        g2d.fillRect(107 + x, 142 + y, 1, 12);
        g2d.fillRect(106 + x, 154 + y, 1, 7);
        g2d.fillRect(105 + x, 161 + y, 1, 4);
        g2d.fillRect(106 + x, 162 + y, 1, 2);
        g2d.fillRect(104 + x, 165 + y, 1, 4);
        g2d.fillRect(103 + x, 169 + y, 1, 5);
        g2d.fillRect(102 + x, 172 + y, 1, 2);
        g2d.fillRect(104 + x, 172 + y, 1, 1);
        g2d.fillRect(113 + x, 172 + y, 2, 1);
        g2d.fillRect(101 + x, 173 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 2, 1);
        g2d.fillRect(111 + x, 173 + y, 1, 1);
        g2d.fillRect(115 + x, 173 + y, 2, 1);
        g2d.fillRect(97 + x, 174 + y, 1, 1);
        g2d.fillRect(100 + x, 174 + y, 1, 1);
        g2d.fillRect(117 + x, 174 + y, 1, 1);
        g2d.fillRect(98 + x, 175 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 89 + y, 1, 4);
        g2d.fillRect(107 + x, 89 + y, 1, 11);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(109 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 7, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 90 + y, 1, 17);
        g2d.fillRect(115 + x, 90 + y, 1, 5);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 4);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(109 + x, 100 + y, 1, 42);
        g2d.fillRect(105 + x, 104 + y, 1, 7);
        g2d.fillRect(113 + x, 107 + y, 1, 13);
        g2d.fillRect(106 + x, 109 + y, 1, 16);
        g2d.fillRect(104 + x, 111 + y, 1, 15);
        g2d.fillRect(107 + x, 111 + y, 1, 31);
        g2d.fillRect(112 + x, 120 + y, 1, 31);
        g2d.fillRect(106 + x, 142 + y, 1, 12);
        g2d.fillRect(108 + x, 142 + y, 1, 12);
        g2d.fillRect(113 + x, 151 + y, 1, 21);
        g2d.fillRect(105 + x, 153 + y, 1, 8);
        g2d.fillRect(107 + x, 154 + y, 1, 4);
        g2d.fillRect(108 + x, 158 + y, 1, 4);
        g2d.fillRect(104 + x, 159 + y, 1, 6);
        g2d.fillRect(106 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 162 + y, 1, 3);
        g2d.fillRect(114 + x, 163 + y, 1, 9);
        g2d.fillRect(103 + x, 164 + y, 1, 5);
        g2d.fillRect(106 + x, 164 + y, 1, 4);
        g2d.fillRect(105 + x, 165 + y, 1, 4);
        g2d.fillRect(102 + x, 168 + y, 1, 4);
        g2d.fillRect(104 + x, 169 + y, 1, 3);
        g2d.fillRect(112 + x, 169 + y, 1, 4);
        g2d.fillRect(101 + x, 170 + y, 1, 3);
        g2d.fillRect(115 + x, 170 + y, 1, 3);
        g2d.fillRect(111 + x, 171 + y, 1, 2);
        g2d.fillRect(100 + x, 172 + y, 1, 2);
        g2d.fillRect(105 + x, 172 + y, 2, 1);
        g2d.fillRect(116 + x, 172 + y, 1, 1);
        g2d.fillRect(96 + x, 173 + y, 1, 1);
        g2d.fillRect(107 + x, 173 + y, 4, 1);
        g2d.fillRect(117 + x, 173 + y, 1, 1);
        g2d.fillRect(121 + x, 173 + y, 1, 1);
        g2d.fillRect(98 + x, 174 + y, 2, 1);
        g2d.fillRect(118 + x, 174 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 90 + y, 1, 30);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 30);
        g2d.fillRect(108 + x, 92 + y, 1, 8);
        g2d.fillRect(109 + x, 92 + y, 1, 8);
        g2d.fillRect(113 + x, 92 + y, 1, 15);
        g2d.fillRect(115 + x, 95 + y, 1, 12);
        g2d.fillRect(114 + x, 107 + y, 1, 2);
        g2d.fillRect(105 + x, 111 + y, 1, 27);
        g2d.fillRect(111 + x, 120 + y, 1, 51);
        g2d.fillRect(113 + x, 120 + y, 1, 31);
        g2d.fillRect(115 + x, 123 + y, 1, 9);
        g2d.fillRect(106 + x, 125 + y, 1, 17);
        g2d.fillRect(103 + x, 126 + y, 1, 14);
        g2d.fillRect(116 + x, 132 + y, 1, 14);
        g2d.fillRect(114 + x, 137 + y, 1, 26);
        g2d.fillRect(102 + x, 140 + y, 1, 14);
        g2d.fillRect(104 + x, 140 + y, 1, 6);
        g2d.fillRect(105 + x, 140 + y, 1, 13);
        g2d.fillRect(110 + x, 144 + y, 1, 14);
        g2d.fillRect(117 + x, 146 + y, 1, 9);
        g2d.fillRect(103 + x, 151 + y, 1, 3);
        g2d.fillRect(112 + x, 151 + y, 1, 18);
        g2d.fillRect(101 + x, 154 + y, 1, 10);
        g2d.fillRect(104 + x, 154 + y, 1, 5);
        g2d.fillRect(108 + x, 154 + y, 1, 4);
        g2d.fillRect(115 + x, 154 + y, 1, 16);
        g2d.fillRect(102 + x, 155 + y, 1, 4);
        g2d.fillRect(118 + x, 155 + y, 1, 4);
        g2d.fillRect(107 + x, 158 + y, 1, 4);
        g2d.fillRect(109 + x, 158 + y, 1, 3);
        g2d.fillRect(103 + x, 159 + y, 1, 5);
        g2d.fillRect(119 + x, 160 + y, 1, 4);
        g2d.fillRect(108 + x, 162 + y, 1, 3);
        g2d.fillRect(100 + x, 164 + y, 1, 3);
        g2d.fillRect(102 + x, 164 + y, 1, 4);
        g2d.fillRect(116 + x, 164 + y, 1, 8);
        g2d.fillRect(120 + x, 164 + y, 1, 2);
        g2d.fillRect(107 + x, 165 + y, 1, 4);
        g2d.fillRect(121 + x, 166 + y, 1, 2);
        g2d.fillRect(99 + x, 167 + y, 1, 2);
        g2d.fillRect(101 + x, 167 + y, 1, 3);
        g2d.fillRect(106 + x, 168 + y, 1, 4);
        g2d.fillRect(117 + x, 168 + y, 1, 5);
        g2d.fillRect(122 + x, 168 + y, 1, 1);
        g2d.fillRect(98 + x, 169 + y, 1, 2);
        g2d.fillRect(100 + x, 169 + y, 1, 3);
        g2d.fillRect(105 + x, 169 + y, 1, 3);
        g2d.fillRect(123 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 3);
        g2d.fillRect(124 + x, 170 + y, 1, 2);
        g2d.fillRect(97 + x, 171 + y, 1, 1);
        g2d.fillRect(99 + x, 171 + y, 1, 3);
        g2d.fillRect(109 + x, 171 + y, 1, 2);
        g2d.fillRect(118 + x, 171 + y, 1, 3);
        g2d.fillRect(96 + x, 172 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 2);
        g2d.fillRect(107 + x, 172 + y, 2, 1);
        g2d.fillRect(119 + x, 172 + y, 1, 2);
        g2d.fillRect(123 + x, 172 + y, 1, 1);
        g2d.fillRect(97 + x, 173 + y, 1, 1);
        g2d.fillRect(120 + x, 173 + y, 1, 1);
        g2d.fillRect(122 + x, 173 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 92 + y, 1, 28);
        g2d.fillRect(115 + x, 107 + y, 1, 16);
        g2d.fillRect(114 + x, 109 + y, 1, 28);
        g2d.fillRect(110 + x, 120 + y, 1, 24);
        g2d.fillRect(104 + x, 126 + y, 1, 14);
        g2d.fillRect(115 + x, 132 + y, 1, 22);
        g2d.fillRect(105 + x, 138 + y, 1, 2);
        g2d.fillRect(103 + x, 140 + y, 1, 11);
        g2d.fillRect(109 + x, 142 + y, 1, 16);
        g2d.fillRect(104 + x, 146 + y, 1, 8);
        g2d.fillRect(116 + x, 146 + y, 1, 18);
        g2d.fillRect(102 + x, 154 + y, 2, 1);
        g2d.fillRect(103 + x, 155 + y, 1, 4);
        g2d.fillRect(117 + x, 155 + y, 1, 13);
        g2d.fillRect(110 + x, 158 + y, 1, 12);
        g2d.fillRect(102 + x, 159 + y, 1, 5);
        g2d.fillRect(118 + x, 159 + y, 1, 12);
        g2d.fillRect(109 + x, 161 + y, 1, 10);
        g2d.fillRect(101 + x, 164 + y, 1, 3);
        g2d.fillRect(119 + x, 164 + y, 1, 8);
        g2d.fillRect(108 + x, 165 + y, 1, 7);
        g2d.fillRect(120 + x, 166 + y, 1, 7);
        g2d.fillRect(100 + x, 167 + y, 1, 2);
        g2d.fillRect(121 + x, 168 + y, 1, 5);
        g2d.fillRect(99 + x, 169 + y, 1, 2);
        g2d.fillRect(107 + x, 169 + y, 1, 3);
        g2d.fillRect(122 + x, 169 + y, 1, 4);
        g2d.fillRect(123 + x, 170 + y, 1, 2);
        g2d.fillRect(98 + x, 171 + y, 1, 1);
        g2d.fillRect(97 + x, 172 + y, 1, 1);
    }





    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 89 + y, 1, 4);
        g2d.fillRect(104 + x, 89 + y, 1, 10);
        g2d.fillRect(119 + x, 89 + y, 1, 3);
        g2d.fillRect(118 + x, 92 + y, 1, 4);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 173 + y, 1, 1);
        g2d.fillRect(102 + x, 174 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 89 + y, 1, 10);
        g2d.fillRect(117 + x, 89 + y, 1, 7);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(106 + x, 93 + y, 1, 7);
        g2d.fillRect(105 + x, 100 + y, 1, 11);
        g2d.fillRect(107 + x, 100 + y, 1, 11);
        g2d.fillRect(108 + x, 102 + y, 1, 9);
        g2d.fillRect(109 + x, 111 + y, 1, 31);
        g2d.fillRect(108 + x, 142 + y, 1, 12);
        g2d.fillRect(107 + x, 154 + y, 1, 7);
        g2d.fillRect(106 + x, 161 + y, 1, 4);
        g2d.fillRect(105 + x, 165 + y, 1, 4);
        g2d.fillRect(104 + x, 169 + y, 1, 5);
        g2d.fillRect(103 + x, 172 + y, 1, 2);
        g2d.fillRect(105 + x, 172 + y, 1, 1);
        g2d.fillRect(114 + x, 172 + y, 2, 1);
        g2d.fillRect(102 + x, 173 + y, 1, 1);
        g2d.fillRect(106 + x, 173 + y, 1, 1);
        g2d.fillRect(111 + x, 173 + y, 2, 1);
        g2d.fillRect(116 + x, 173 + y, 2, 1);
        g2d.fillRect(98 + x, 174 + y, 1, 1);
        g2d.fillRect(101 + x, 174 + y, 1, 1);
        g2d.fillRect(118 + x, 174 + y, 1, 1);
        g2d.fillRect(99 + x, 175 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 89 + y, 1, 4);
        g2d.fillRect(107 + x, 89 + y, 1, 11);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(109 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 7, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 90 + y, 1, 17);
        g2d.fillRect(115 + x, 90 + y, 1, 17);
        g2d.fillRect(116 + x, 90 + y, 1, 5);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 11);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(109 + x, 100 + y, 1, 11);
        g2d.fillRect(113 + x, 107 + y, 1, 44);
        g2d.fillRect(105 + x, 111 + y, 1, 15);
        g2d.fillRect(107 + x, 111 + y, 1, 14);
        g2d.fillRect(108 + x, 111 + y, 1, 31);
        g2d.fillRect(110 + x, 111 + y, 1, 31);
        g2d.fillRect(107 + x, 142 + y, 1, 12);
        g2d.fillRect(109 + x, 142 + y, 1, 12);
        g2d.fillRect(114 + x, 151 + y, 1, 21);
        g2d.fillRect(106 + x, 153 + y, 1, 8);
        g2d.fillRect(108 + x, 154 + y, 1, 7);
        g2d.fillRect(105 + x, 159 + y, 1, 6);
        g2d.fillRect(107 + x, 161 + y, 1, 4);
        g2d.fillRect(115 + x, 163 + y, 1, 9);
        g2d.fillRect(104 + x, 164 + y, 1, 5);
        g2d.fillRect(106 + x, 165 + y, 1, 4);
        g2d.fillRect(103 + x, 168 + y, 1, 4);
        g2d.fillRect(105 + x, 169 + y, 1, 3);
        g2d.fillRect(113 + x, 169 + y, 1, 4);
        g2d.fillRect(102 + x, 170 + y, 1, 3);
        g2d.fillRect(116 + x, 170 + y, 1, 3);
        g2d.fillRect(112 + x, 171 + y, 1, 2);
        g2d.fillRect(101 + x, 172 + y, 1, 2);
        g2d.fillRect(106 + x, 172 + y, 1, 1);
        g2d.fillRect(111 + x, 172 + y, 1, 1);
        g2d.fillRect(117 + x, 172 + y, 1, 1);
        g2d.fillRect(96 + x, 173 + y, 2, 1);
        g2d.fillRect(107 + x, 173 + y, 4, 1);
        g2d.fillRect(118 + x, 173 + y, 1, 1);
        g2d.fillRect(122 + x, 173 + y, 1, 1);
        g2d.fillRect(99 + x, 174 + y, 2, 1);
        g2d.fillRect(119 + x, 174 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 90 + y, 1, 21);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 81);
        g2d.fillRect(108 + x, 92 + y, 1, 8);
        g2d.fillRect(109 + x, 92 + y, 1, 8);
        g2d.fillRect(113 + x, 92 + y, 1, 15);
        g2d.fillRect(116 + x, 95 + y, 1, 12);
        g2d.fillRect(114 + x, 107 + y, 1, 44);
        g2d.fillRect(115 + x, 107 + y, 1, 2);
        g2d.fillRect(106 + x, 111 + y, 1, 27);
        g2d.fillRect(116 + x, 123 + y, 1, 9);
        g2d.fillRect(107 + x, 125 + y, 1, 17);
        g2d.fillRect(104 + x, 126 + y, 1, 14);
        g2d.fillRect(117 + x, 132 + y, 1, 14);
        g2d.fillRect(115 + x, 137 + y, 1, 26);
        g2d.fillRect(103 + x, 140 + y, 1, 14);
        g2d.fillRect(105 + x, 140 + y, 1, 6);
        g2d.fillRect(106 + x, 140 + y, 1, 13);
        g2d.fillRect(118 + x, 146 + y, 1, 9);
        g2d.fillRect(104 + x, 151 + y, 1, 3);
        g2d.fillRect(113 + x, 151 + y, 1, 18);
        g2d.fillRect(102 + x, 154 + y, 1, 4);
        g2d.fillRect(105 + x, 154 + y, 1, 5);
        g2d.fillRect(109 + x, 154 + y, 1, 7);
        g2d.fillRect(116 + x, 154 + y, 1, 16);
        g2d.fillRect(103 + x, 155 + y, 1, 4);
        g2d.fillRect(119 + x, 155 + y, 1, 4);
        g2d.fillRect(102 + x, 159 + y, 1, 5);
        g2d.fillRect(104 + x, 159 + y, 1, 5);
        g2d.fillRect(120 + x, 160 + y, 1, 4);
        g2d.fillRect(108 + x, 161 + y, 1, 4);
        g2d.fillRect(101 + x, 164 + y, 1, 3);
        g2d.fillRect(103 + x, 164 + y, 1, 4);
        g2d.fillRect(117 + x, 164 + y, 1, 8);
        g2d.fillRect(121 + x, 164 + y, 1, 2);
        g2d.fillRect(107 + x, 165 + y, 1, 4);
        g2d.fillRect(111 + x, 166 + y, 1, 6);
        g2d.fillRect(122 + x, 166 + y, 1, 2);
        g2d.fillRect(100 + x, 167 + y, 1, 2);
        g2d.fillRect(102 + x, 167 + y, 1, 3);
        g2d.fillRect(118 + x, 168 + y, 1, 5);
        g2d.fillRect(123 + x, 168 + y, 1, 1);
        g2d.fillRect(99 + x, 169 + y, 1, 2);
        g2d.fillRect(101 + x, 169 + y, 1, 3);
        g2d.fillRect(106 + x, 169 + y, 1, 3);
        g2d.fillRect(124 + x, 169 + y, 1, 1);
        g2d.fillRect(110 + x, 170 + y, 1, 3);
        g2d.fillRect(125 + x, 170 + y, 1, 2);
        g2d.fillRect(98 + x, 171 + y, 1, 1);
        g2d.fillRect(100 + x, 171 + y, 1, 3);
        g2d.fillRect(109 + x, 171 + y, 1, 2);
        g2d.fillRect(119 + x, 171 + y, 1, 3);
        g2d.fillRect(96 + x, 172 + y, 2, 1);
        g2d.fillRect(99 + x, 172 + y, 1, 2);
        g2d.fillRect(107 + x, 172 + y, 2, 1);
        g2d.fillRect(120 + x, 172 + y, 1, 2);
        g2d.fillRect(124 + x, 172 + y, 1, 1);
        g2d.fillRect(98 + x, 173 + y, 1, 1);
        g2d.fillRect(121 + x, 173 + y, 1, 1);
        g2d.fillRect(123 + x, 173 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 92 + y, 1, 74);
        g2d.fillRect(116 + x, 107 + y, 1, 16);
        g2d.fillRect(115 + x, 109 + y, 1, 28);
        g2d.fillRect(105 + x, 126 + y, 1, 14);
        g2d.fillRect(116 + x, 132 + y, 1, 22);
        g2d.fillRect(106 + x, 138 + y, 1, 2);
        g2d.fillRect(104 + x, 140 + y, 1, 11);
        g2d.fillRect(110 + x, 142 + y, 1, 28);
        g2d.fillRect(105 + x, 146 + y, 1, 8);
        g2d.fillRect(117 + x, 146 + y, 1, 18);
        g2d.fillRect(103 + x, 154 + y, 2, 1);
        g2d.fillRect(104 + x, 155 + y, 1, 4);
        g2d.fillRect(118 + x, 155 + y, 1, 13);
        g2d.fillRect(103 + x, 159 + y, 1, 5);
        g2d.fillRect(119 + x, 159 + y, 1, 12);
        g2d.fillRect(109 + x, 161 + y, 1, 10);
        g2d.fillRect(102 + x, 164 + y, 1, 3);
        g2d.fillRect(120 + x, 164 + y, 1, 8);
        g2d.fillRect(108 + x, 165 + y, 1, 7);
        g2d.fillRect(121 + x, 166 + y, 1, 7);
        g2d.fillRect(101 + x, 167 + y, 1, 2);
        g2d.fillRect(122 + x, 168 + y, 1, 5);
        g2d.fillRect(100 + x, 169 + y, 1, 2);
        g2d.fillRect(107 + x, 169 + y, 1, 3);
        g2d.fillRect(123 + x, 169 + y, 1, 4);
        g2d.fillRect(124 + x, 170 + y, 1, 2);
        g2d.fillRect(99 + x, 171 + y, 1, 1);
        g2d.fillRect(98 + x, 172 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 4);
        g2d.fillRect(100 + x, 80 + y, 1, 6);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 3);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 60 + y, 1, 13);
        g2d.fillRect(107 + x, 60 + y, 2, 1);
        g2d.fillRect(112 + x, 60 + y, 3, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 8);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(120 + x, 79 + y, 1, 2);
        g2d.fillRect(119 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 5);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 1, 4);
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 3);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 61 + y, 1, 21);
        g2d.fillRect(105 + x, 61 + y, 1, 12);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 7);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 1, 2);
        g2d.fillRect(118 + x, 72 + y, 1, 9);
        g2d.fillRect(103 + x, 73 + y, 1, 8);
        g2d.fillRect(117 + x, 78 + y, 1, 8);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 5);
        g2d.fillRect(116 + x, 84 + y, 1, 3);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 11);
        g2d.fillRect(108 + x, 61 + y, 1, 3);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(113 + x, 61 + y, 1, 7);
        g2d.fillRect(114 + x, 61 + y, 1, 10);
        g2d.fillRect(106 + x, 62 + y, 1, 11);
        g2d.fillRect(115 + x, 68 + y, 1, 3);
        g2d.fillRect(116 + x, 70 + y, 1, 6);
        g2d.fillRect(117 + x, 72 + y, 1, 6);
        g2d.fillRect(105 + x, 73 + y, 1, 7);
        g2d.fillRect(116 + x, 77 + y, 1, 7);
        g2d.fillRect(106 + x, 78 + y, 1, 3);
        g2d.fillRect(107 + x, 80 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 5, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 5);
        g2d.fillRect(107 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 3, 1);
        g2d.fillRect(108 + x, 87 + y, 4, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 62 + y, 1, 6);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 1, 4);
        g2d.fillRect(108 + x, 64 + y, 1, 9);
        g2d.fillRect(112 + x, 64 + y, 1, 5);
        g2d.fillRect(113 + x, 68 + y, 1, 4);
        g2d.fillRect(114 + x, 71 + y, 1, 12);
        g2d.fillRect(115 + x, 71 + y, 1, 12);
        g2d.fillRect(107 + x, 72 + y, 1, 8);
        g2d.fillRect(106 + x, 73 + y, 1, 5);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 6);
        g2d.fillRect(108 + x, 78 + y, 1, 3);
        g2d.fillRect(112 + x, 78 + y, 1, 5);
        g2d.fillRect(109 + x, 79 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(111 + x, 84 + y, 1, 3);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 64 + y, 1, 16);
        g2d.fillRect(111 + x, 66 + y, 1, 15);
        g2d.fillRect(109 + x, 68 + y, 1, 11);
        g2d.fillRect(112 + x, 69 + y, 1, 9);
        g2d.fillRect(113 + x, 72 + y, 1, 5);
        g2d.fillRect(108 + x, 73 + y, 1, 5);
    }
}
