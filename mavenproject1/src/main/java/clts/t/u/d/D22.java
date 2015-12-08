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
public class D22 extends SuperTU
{
    int prevStep = 0;
    int prevPrevStep = 0;
    {
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public D22()
    {
        super();
    }

    public D22(String middle)
    {
        super(middle);
    }

    public D22(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        paint1TL(x,0,g2d);

        if(prevStep == 1 || prevStep == 2 || prevStep == 3 || prevStep == 15 || prevStep == 14 || prevStep == 13 || prevPrevStep == 15)
            paint1BOT1(x,0,g2d);
        else if(prevStep == 5 || prevStep == 6 || prevStep == 7 || prevStep == 9 || prevStep == 10 || prevStep == 11 || prevPrevStep == 7)
            paint1BOT2(x,0,g2d);
        else
            paint1BOT3(x,0,g2d);

        prevPrevStep = prevStep;
        prevStep = step;
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        paint1TU(x,y,g2d);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

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

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paint1BOT1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 4);
        g2d.fillRect(101 + x, 89 + y, 1, 10);
        g2d.fillRect(119 + x, 91 + y, 1, 4);
        g2d.fillRect(118 + x, 95 + y, 1, 5);
        g2d.fillRect(102 + x, 98 + y, 1, 5);
        g2d.fillRect(117 + x, 100 + y, 1, 5);
        g2d.fillRect(103 + x, 103 + y, 1, 4);
        g2d.fillRect(116 + x, 104 + y, 1, 5);
        g2d.fillRect(104 + x, 107 + y, 1, 5);
        g2d.fillRect(115 + x, 108 + y, 1, 3);
        g2d.fillRect(114 + x, 110 + y, 1, 3);
        g2d.fillRect(105 + x, 111 + y, 1, 13);
        g2d.fillRect(106 + x, 115 + y, 1, 4);
        g2d.fillRect(113 + x, 115 + y, 1, 6);
        g2d.fillRect(114 + x, 121 + y, 1, 5);
        g2d.fillRect(104 + x, 124 + y, 1, 6);
        g2d.fillRect(115 + x, 126 + y, 1, 7);
        g2d.fillRect(103 + x, 130 + y, 1, 3);
        g2d.fillRect(102 + x, 133 + y, 1, 1);
        g2d.fillRect(116 + x, 133 + y, 1, 8);
        g2d.fillRect(101 + x, 134 + y, 1, 2);
        g2d.fillRect(100 + x, 136 + y, 1, 1);
        g2d.fillRect(99 + x, 137 + y, 1, 2);
        g2d.fillRect(98 + x, 139 + y, 1, 2);
        g2d.fillRect(97 + x, 141 + y, 1, 1);
        g2d.fillRect(117 + x, 141 + y, 1, 6);
        g2d.fillRect(96 + x, 142 + y, 1, 3);
        g2d.fillRect(95 + x, 145 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 2);
        g2d.fillRect(118 + x, 147 + y, 1, 6);
        g2d.fillRect(93 + x, 148 + y, 1, 2);
        g2d.fillRect(92 + x, 150 + y, 1, 1);
        g2d.fillRect(91 + x, 151 + y, 1, 1);
        g2d.fillRect(90 + x, 152 + y, 1, 2);
        g2d.fillRect(91 + x, 153 + y, 1, 2);
        g2d.fillRect(119 + x, 153 + y, 1, 2);
        g2d.fillRect(92 + x, 154 + y, 1, 2);
        g2d.fillRect(93 + x, 155 + y, 1, 2);
        g2d.fillRect(120 + x, 155 + y, 1, 4);
        g2d.fillRect(94 + x, 156 + y, 1, 2);
        g2d.fillRect(95 + x, 157 + y, 1, 2);
        g2d.fillRect(96 + x, 158 + y, 1, 2);
        g2d.fillRect(97 + x, 159 + y, 1, 2);
        g2d.fillRect(98 + x, 159 + y, 1, 2);
        g2d.fillRect(121 + x, 159 + y, 1, 3);
        g2d.fillRect(99 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 161 + y, 1, 2);
        g2d.fillRect(103 + x, 161 + y, 1, 2);
        g2d.fillRect(104 + x, 161 + y, 1, 2);
        g2d.fillRect(118 + x, 161 + y, 1, 2);
        g2d.fillRect(119 + x, 161 + y, 1, 2);
        g2d.fillRect(120 + x, 161 + y, 1, 2);
        g2d.fillRect(105 + x, 162 + y, 1, 2);
        g2d.fillRect(106 + x, 162 + y, 1, 2);
        g2d.fillRect(107 + x, 162 + y, 1, 2);
        g2d.fillRect(108 + x, 162 + y, 1, 2);
        g2d.fillRect(109 + x, 162 + y, 1, 2);
        g2d.fillRect(110 + x, 162 + y, 1, 2);
        g2d.fillRect(111 + x, 162 + y, 1, 2);
        g2d.fillRect(112 + x, 162 + y, 1, 2);
        g2d.fillRect(113 + x, 162 + y, 1, 2);
        g2d.fillRect(114 + x, 162 + y, 1, 2);
        g2d.fillRect(115 + x, 162 + y, 1, 2);
        g2d.fillRect(116 + x, 162 + y, 1, 2);
        g2d.fillRect(117 + x, 162 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 84 + y, 1, 7);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(102 + x, 89 + y, 1, 9);
        g2d.fillRect(118 + x, 91 + y, 1, 4);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 12);
        g2d.fillRect(117 + x, 95 + y, 1, 5);
        g2d.fillRect(103 + x, 98 + y, 1, 5);
        g2d.fillRect(116 + x, 100 + y, 1, 4);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 1, 4);
        g2d.fillRect(115 + x, 104 + y, 1, 4);
        g2d.fillRect(105 + x, 107 + y, 1, 4);
        g2d.fillRect(113 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 111 + y, 1, 4);
        g2d.fillRect(112 + x, 112 + y, 1, 9);
        g2d.fillRect(107 + x, 115 + y, 1, 4);
        g2d.fillRect(106 + x, 119 + y, 1, 5);
        g2d.fillRect(113 + x, 121 + y, 1, 5);
        g2d.fillRect(105 + x, 124 + y, 1, 6);
        g2d.fillRect(114 + x, 126 + y, 1, 7);
        g2d.fillRect(104 + x, 130 + y, 1, 3);
        g2d.fillRect(103 + x, 133 + y, 1, 3);
        g2d.fillRect(115 + x, 133 + y, 1, 8);
        g2d.fillRect(102 + x, 134 + y, 1, 5);
        g2d.fillRect(101 + x, 136 + y, 1, 6);
        g2d.fillRect(100 + x, 137 + y, 1, 9);
        g2d.fillRect(99 + x, 139 + y, 1, 8);
        g2d.fillRect(98 + x, 141 + y, 1, 12);
        g2d.fillRect(116 + x, 141 + y, 1, 6);
        g2d.fillRect(97 + x, 142 + y, 1, 17);
        g2d.fillRect(96 + x, 145 + y, 1, 13);
        g2d.fillRect(95 + x, 146 + y, 1, 11);
        g2d.fillRect(117 + x, 147 + y, 1, 6);
        g2d.fillRect(94 + x, 148 + y, 1, 8);
        g2d.fillRect(93 + x, 150 + y, 1, 5);
        g2d.fillRect(92 + x, 151 + y, 1, 3);
        g2d.fillRect(91 + x, 152 + y, 1, 1);
        g2d.fillRect(118 + x, 153 + y, 1, 2);
        g2d.fillRect(119 + x, 155 + y, 1, 4);
        g2d.fillRect(98 + x, 158 + y, 1, 1);
        g2d.fillRect(99 + x, 159 + y, 3, 1);
        g2d.fillRect(120 + x, 159 + y, 1, 2);
        g2d.fillRect(102 + x, 160 + y, 3, 1);
        g2d.fillRect(118 + x, 160 + y, 2, 1);
        g2d.fillRect(105 + x, 161 + y, 13, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 84 + y, 1, 9);
        g2d.fillRect(113 + x, 85 + y, 1, 4);
        g2d.fillRect(103 + x, 86 + y, 1, 12);
        g2d.fillRect(107 + x, 86 + y, 1, 15);
        g2d.fillRect(102 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 4);
        g2d.fillRect(104 + x, 91 + y, 1, 12);
        g2d.fillRect(117 + x, 91 + y, 1, 4);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 95 + y, 1, 5);
        g2d.fillRect(115 + x, 100 + y, 1, 4);
        g2d.fillRect(105 + x, 103 + y, 1, 4);
        g2d.fillRect(108 + x, 103 + y, 1, 4);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(114 + x, 105 + y, 1, 5);
        g2d.fillRect(109 + x, 107 + y, 1, 2);
        g2d.fillRect(106 + x, 108 + y, 1, 3);
        g2d.fillRect(107 + x, 110 + y, 1, 5);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 111 + y, 1, 25);
        g2d.fillRect(108 + x, 115 + y, 1, 5);
        g2d.fillRect(107 + x, 119 + y, 1, 10);
        g2d.fillRect(112 + x, 121 + y, 1, 22);
        g2d.fillRect(106 + x, 124 + y, 1, 10);
        g2d.fillRect(113 + x, 126 + y, 1, 25);
        g2d.fillRect(105 + x, 130 + y, 1, 9);
        g2d.fillRect(104 + x, 133 + y, 1, 12);
        g2d.fillRect(114 + x, 133 + y, 1, 20);
        g2d.fillRect(103 + x, 136 + y, 1, 24);
        g2d.fillRect(102 + x, 139 + y, 1, 21);
        g2d.fillRect(115 + x, 141 + y, 1, 20);
        g2d.fillRect(101 + x, 142 + y, 1, 17);
        g2d.fillRect(100 + x, 146 + y, 1, 13);
        g2d.fillRect(99 + x, 147 + y, 1, 12);
        g2d.fillRect(116 + x, 147 + y, 1, 14);
        g2d.fillRect(98 + x, 153 + y, 1, 5);
        g2d.fillRect(104 + x, 153 + y, 1, 7);
        g2d.fillRect(117 + x, 153 + y, 1, 8);
        g2d.fillRect(118 + x, 155 + y, 1, 5);
        g2d.fillRect(105 + x, 156 + y, 1, 5);
        g2d.fillRect(106 + x, 157 + y, 1, 4);
        g2d.fillRect(107 + x, 158 + y, 1, 3);
        g2d.fillRect(108 + x, 158 + y, 1, 3);
        g2d.fillRect(109 + x, 158 + y, 1, 3);
        g2d.fillRect(110 + x, 159 + y, 1, 2);
        g2d.fillRect(111 + x, 159 + y, 1, 2);
        g2d.fillRect(112 + x, 159 + y, 1, 2);
        g2d.fillRect(113 + x, 159 + y, 1, 2);
        g2d.fillRect(114 + x, 159 + y, 1, 2);
        g2d.fillRect(119 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 86 + y, 1, 5);
        g2d.fillRect(105 + x, 86 + y, 1, 17);
        g2d.fillRect(106 + x, 86 + y, 1, 22);
        g2d.fillRect(115 + x, 86 + y, 1, 14);
        g2d.fillRect(116 + x, 86 + y, 1, 9);
        g2d.fillRect(117 + x, 86 + y, 1, 5);
        g2d.fillRect(113 + x, 95 + y, 1, 8);
        g2d.fillRect(107 + x, 101 + y, 1, 9);
        g2d.fillRect(108 + x, 107 + y, 1, 8);
        g2d.fillRect(109 + x, 109 + y, 1, 49);
        g2d.fillRect(110 + x, 111 + y, 1, 48);
        g2d.fillRect(108 + x, 120 + y, 1, 38);
        g2d.fillRect(107 + x, 129 + y, 1, 29);
        g2d.fillRect(106 + x, 134 + y, 1, 23);
        g2d.fillRect(111 + x, 136 + y, 1, 23);
        g2d.fillRect(105 + x, 139 + y, 1, 17);
        g2d.fillRect(112 + x, 143 + y, 1, 16);
        g2d.fillRect(104 + x, 145 + y, 1, 8);
        g2d.fillRect(113 + x, 151 + y, 1, 8);
        g2d.fillRect(114 + x, 153 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 2);
        g2d.fillRect(114 + x, 113 + y, 1, 5);
        g2d.fillRect(115 + x, 124 + y, 1, 1);
        g2d.fillRect(120 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 84 + y, 1, 5);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 6);
        g2d.fillRect(108 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 97 + y, 1, 4);
        g2d.fillRect(109 + x, 98 + y, 1, 6);
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(109 + x, 105 + y, 1, 2);
        g2d.fillRect(112 + x, 105 + y, 1, 4);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 111 + y, 2, 1);
        g2d.fillRect(113 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 1);
        g2d.fillRect(117 + x, 133 + y, 1, 1);
        g2d.fillRect(118 + x, 137 + y, 1, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 2);
        g2d.fillRect(119 + x, 139 + y, 1, 1);
        g2d.fillRect(118 + x, 142 + y, 1, 3);
        g2d.fillRect(119 + x, 142 + y, 1, 1);
        g2d.fillRect(118 + x, 146 + y, 1, 1);
        g2d.fillRect(119 + x, 147 + y, 1, 1);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(121 + x, 149 + y, 1, 1);
        g2d.fillRect(120 + x, 151 + y, 2, 1);
        g2d.fillRect(119 + x, 152 + y, 1, 1);
        g2d.fillRect(120 + x, 153 + y, 2, 1);
        g2d.fillRect(121 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 2);
        g2d.fillRect(121 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 93 + y, 1, 2);
        g2d.fillRect(109 + x, 95 + y, 1, 3);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(109 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 1, 1);
        g2d.fillRect(116 + x, 130 + y, 1, 1);
        g2d.fillRect(117 + x, 138 + y, 2, 1);
        g2d.fillRect(119 + x, 146 + y, 1, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 2);
        g2d.fillRect(120 + x, 152 + y, 1, 1);
        g2d.fillRect(121 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 4);
        g2d.fillRect(110 + x, 95 + y, 1, 5);
        g2d.fillRect(112 + x, 95 + y, 1, 6);
        g2d.fillRect(111 + x, 101 + y, 1, 2);
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 2);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 109 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 2);
        g2d.fillRect(110 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 2);
        g2d.fillRect(117 + x, 137 + y, 1, 1);
        g2d.fillRect(118 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 143 + y, 1, 2);
        g2d.fillRect(118 + x, 145 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(119 + x, 150 + y, 1, 1);
        g2d.fillRect(121 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 3);
        g2d.fillRect(110 + x, 101 + y, 1, 2);
        g2d.fillRect(112 + x, 101 + y, 1, 2);
        g2d.fillRect(111 + x, 103 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 136 + y, 1, 1);
        g2d.fillRect(118 + x, 140 + y, 1, 1);
        g2d.fillRect(119 + x, 145 + y, 1, 1);
        g2d.fillRect(119 + x, 151 + y, 1, 1);
        g2d.fillRect(122 + x, 156 + y, 1, 1);
    }





    public void paint1BOT2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 87 + y, 1, 4);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 89 + y, 1, 10);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 95 + y, 1, 5);
        g2d.fillRect(119 + x, 98 + y, 1, 5);
        g2d.fillRect(104 + x, 100 + y, 1, 5);
        g2d.fillRect(118 + x, 103 + y, 1, 4);
        g2d.fillRect(105 + x, 104 + y, 1, 5);
        g2d.fillRect(117 + x, 107 + y, 1, 5);
        g2d.fillRect(106 + x, 108 + y, 1, 3);
        g2d.fillRect(107 + x, 110 + y, 1, 3);
        g2d.fillRect(116 + x, 111 + y, 1, 13);
        g2d.fillRect(108 + x, 115 + y, 1, 6);
        g2d.fillRect(115 + x, 115 + y, 1, 4);
        g2d.fillRect(107 + x, 121 + y, 1, 5);
        g2d.fillRect(117 + x, 124 + y, 1, 6);
        g2d.fillRect(106 + x, 126 + y, 1, 7);
        g2d.fillRect(118 + x, 130 + y, 1, 3);
        g2d.fillRect(105 + x, 133 + y, 1, 8);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(120 + x, 134 + y, 1, 2);
        g2d.fillRect(121 + x, 136 + y, 1, 1);
        g2d.fillRect(122 + x, 137 + y, 1, 2);
        g2d.fillRect(123 + x, 139 + y, 1, 2);
        g2d.fillRect(104 + x, 141 + y, 1, 6);
        g2d.fillRect(124 + x, 141 + y, 1, 1);
        g2d.fillRect(125 + x, 142 + y, 1, 3);
        g2d.fillRect(126 + x, 145 + y, 1, 1);
        g2d.fillRect(127 + x, 146 + y, 1, 2);
        g2d.fillRect(103 + x, 147 + y, 1, 6);
        g2d.fillRect(128 + x, 148 + y, 1, 2);
        g2d.fillRect(129 + x, 150 + y, 1, 1);
        g2d.fillRect(130 + x, 151 + y, 1, 1);
        g2d.fillRect(131 + x, 152 + y, 1, 2);
        g2d.fillRect(102 + x, 153 + y, 1, 2);
        g2d.fillRect(130 + x, 153 + y, 1, 2);
        g2d.fillRect(129 + x, 154 + y, 1, 2);
        g2d.fillRect(101 + x, 155 + y, 1, 4);
        g2d.fillRect(128 + x, 155 + y, 1, 2);
        g2d.fillRect(127 + x, 156 + y, 1, 2);
        g2d.fillRect(126 + x, 157 + y, 1, 2);
        g2d.fillRect(125 + x, 158 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 1, 3);
        g2d.fillRect(123 + x, 159 + y, 1, 2);
        g2d.fillRect(124 + x, 159 + y, 1, 2);
        g2d.fillRect(99 + x, 160 + y, 1, 2);
        g2d.fillRect(120 + x, 160 + y, 1, 2);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 161 + y, 1, 2);
        g2d.fillRect(102 + x, 161 + y, 1, 2);
        g2d.fillRect(103 + x, 161 + y, 1, 2);
        g2d.fillRect(117 + x, 161 + y, 1, 2);
        g2d.fillRect(118 + x, 161 + y, 1, 2);
        g2d.fillRect(119 + x, 161 + y, 1, 2);
        g2d.fillRect(104 + x, 162 + y, 1, 2);
        g2d.fillRect(105 + x, 162 + y, 1, 2);
        g2d.fillRect(106 + x, 162 + y, 1, 2);
        g2d.fillRect(107 + x, 162 + y, 1, 2);
        g2d.fillRect(108 + x, 162 + y, 1, 2);
        g2d.fillRect(109 + x, 162 + y, 1, 2);
        g2d.fillRect(110 + x, 162 + y, 1, 2);
        g2d.fillRect(111 + x, 162 + y, 1, 2);
        g2d.fillRect(112 + x, 162 + y, 1, 2);
        g2d.fillRect(113 + x, 162 + y, 1, 2);
        g2d.fillRect(114 + x, 162 + y, 1, 2);
        g2d.fillRect(115 + x, 162 + y, 1, 2);
        g2d.fillRect(116 + x, 162 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(113 + x, 84 + y, 1, 7);
        g2d.fillRect(102 + x, 87 + y, 1, 4);
        g2d.fillRect(120 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 1, 9);
        g2d.fillRect(103 + x, 91 + y, 1, 4);
        g2d.fillRect(107 + x, 93 + y, 1, 12);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 95 + y, 1, 5);
        g2d.fillRect(118 + x, 98 + y, 1, 5);
        g2d.fillRect(105 + x, 100 + y, 1, 4);
        g2d.fillRect(113 + x, 101 + y, 1, 2);
        g2d.fillRect(117 + x, 103 + y, 1, 4);
        g2d.fillRect(106 + x, 104 + y, 1, 4);
        g2d.fillRect(108 + x, 107 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 4);
        g2d.fillRect(115 + x, 111 + y, 1, 4);
        g2d.fillRect(109 + x, 112 + y, 1, 9);
        g2d.fillRect(114 + x, 115 + y, 1, 4);
        g2d.fillRect(115 + x, 119 + y, 1, 5);
        g2d.fillRect(108 + x, 121 + y, 1, 5);
        g2d.fillRect(116 + x, 124 + y, 1, 6);
        g2d.fillRect(107 + x, 126 + y, 1, 7);
        g2d.fillRect(117 + x, 130 + y, 1, 3);
        g2d.fillRect(106 + x, 133 + y, 1, 8);
        g2d.fillRect(118 + x, 133 + y, 1, 3);
        g2d.fillRect(119 + x, 134 + y, 1, 5);
        g2d.fillRect(120 + x, 136 + y, 1, 6);
        g2d.fillRect(121 + x, 137 + y, 1, 9);
        g2d.fillRect(122 + x, 139 + y, 1, 8);
        g2d.fillRect(105 + x, 141 + y, 1, 6);
        g2d.fillRect(123 + x, 141 + y, 1, 12);
        g2d.fillRect(124 + x, 142 + y, 1, 17);
        g2d.fillRect(125 + x, 145 + y, 1, 13);
        g2d.fillRect(126 + x, 146 + y, 1, 11);
        g2d.fillRect(104 + x, 147 + y, 1, 6);
        g2d.fillRect(127 + x, 148 + y, 1, 8);
        g2d.fillRect(128 + x, 150 + y, 1, 5);
        g2d.fillRect(129 + x, 151 + y, 1, 3);
        g2d.fillRect(130 + x, 152 + y, 1, 1);
        g2d.fillRect(103 + x, 153 + y, 1, 2);
        g2d.fillRect(102 + x, 155 + y, 1, 4);
        g2d.fillRect(123 + x, 158 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 1, 2);
        g2d.fillRect(120 + x, 159 + y, 3, 1);
        g2d.fillRect(102 + x, 160 + y, 2, 1);
        g2d.fillRect(117 + x, 160 + y, 3, 1);
        g2d.fillRect(104 + x, 161 + y, 13, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 84 + y, 1, 9);
        g2d.fillRect(114 + x, 84 + y, 1, 17);
        g2d.fillRect(108 + x, 85 + y, 1, 4);
        g2d.fillRect(103 + x, 86 + y, 1, 5);
        g2d.fillRect(118 + x, 86 + y, 1, 12);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 12);
        g2d.fillRect(105 + x, 95 + y, 1, 5);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(106 + x, 100 + y, 1, 4);
        g2d.fillRect(113 + x, 103 + y, 1, 4);
        g2d.fillRect(116 + x, 103 + y, 1, 4);
        g2d.fillRect(107 + x, 105 + y, 1, 5);
        g2d.fillRect(108 + x, 105 + y, 1, 2);
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 3);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 5);
        g2d.fillRect(110 + x, 111 + y, 1, 25);
        g2d.fillRect(113 + x, 115 + y, 1, 5);
        g2d.fillRect(114 + x, 119 + y, 1, 10);
        g2d.fillRect(109 + x, 121 + y, 1, 22);
        g2d.fillRect(115 + x, 124 + y, 1, 10);
        g2d.fillRect(108 + x, 126 + y, 1, 25);
        g2d.fillRect(116 + x, 130 + y, 1, 9);
        g2d.fillRect(107 + x, 133 + y, 1, 20);
        g2d.fillRect(117 + x, 133 + y, 1, 12);
        g2d.fillRect(118 + x, 136 + y, 1, 24);
        g2d.fillRect(119 + x, 139 + y, 1, 21);
        g2d.fillRect(106 + x, 141 + y, 1, 20);
        g2d.fillRect(120 + x, 142 + y, 1, 17);
        g2d.fillRect(121 + x, 146 + y, 1, 13);
        g2d.fillRect(105 + x, 147 + y, 1, 14);
        g2d.fillRect(122 + x, 147 + y, 1, 12);
        g2d.fillRect(104 + x, 153 + y, 1, 8);
        g2d.fillRect(117 + x, 153 + y, 1, 7);
        g2d.fillRect(123 + x, 153 + y, 1, 5);
        g2d.fillRect(103 + x, 155 + y, 1, 5);
        g2d.fillRect(116 + x, 156 + y, 1, 5);
        g2d.fillRect(115 + x, 157 + y, 1, 4);
        g2d.fillRect(112 + x, 158 + y, 1, 3);
        g2d.fillRect(113 + x, 158 + y, 1, 3);
        g2d.fillRect(114 + x, 158 + y, 1, 3);
        g2d.fillRect(102 + x, 159 + y, 1, 1);
        g2d.fillRect(107 + x, 159 + y, 1, 2);
        g2d.fillRect(108 + x, 159 + y, 1, 2);
        g2d.fillRect(109 + x, 159 + y, 1, 2);
        g2d.fillRect(110 + x, 159 + y, 1, 2);
        g2d.fillRect(111 + x, 159 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 86 + y, 1, 5);
        g2d.fillRect(105 + x, 86 + y, 1, 9);
        g2d.fillRect(106 + x, 86 + y, 1, 14);
        g2d.fillRect(115 + x, 86 + y, 1, 22);
        g2d.fillRect(116 + x, 86 + y, 1, 17);
        g2d.fillRect(117 + x, 86 + y, 1, 5);
        g2d.fillRect(108 + x, 95 + y, 1, 8);
        g2d.fillRect(114 + x, 101 + y, 1, 9);
        g2d.fillRect(113 + x, 107 + y, 1, 8);
        g2d.fillRect(112 + x, 109 + y, 1, 49);
        g2d.fillRect(111 + x, 111 + y, 1, 48);
        g2d.fillRect(113 + x, 120 + y, 1, 38);
        g2d.fillRect(114 + x, 129 + y, 1, 29);
        g2d.fillRect(115 + x, 134 + y, 1, 23);
        g2d.fillRect(110 + x, 136 + y, 1, 23);
        g2d.fillRect(116 + x, 139 + y, 1, 17);
        g2d.fillRect(109 + x, 143 + y, 1, 16);
        g2d.fillRect(117 + x, 145 + y, 1, 8);
        g2d.fillRect(108 + x, 151 + y, 1, 8);
        g2d.fillRect(107 + x, 153 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 108 + y, 1, 1);
        g2d.fillRect(107 + x, 113 + y, 1, 5);
        g2d.fillRect(108 + x, 113 + y, 1, 2);
        g2d.fillRect(106 + x, 124 + y, 1, 1);
        g2d.fillRect(101 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 5);
        g2d.fillRect(109 + x, 87 + y, 1, 6);
        g2d.fillRect(108 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 4);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 97 + y, 1, 4);
        g2d.fillRect(112 + x, 98 + y, 1, 6);
        g2d.fillRect(108 + x, 103 + y, 1, 1);
        g2d.fillRect(111 + x, 103 + y, 1, 2);
        g2d.fillRect(109 + x, 105 + y, 1, 4);
        g2d.fillRect(112 + x, 105 + y, 1, 2);
        g2d.fillRect(108 + x, 109 + y, 1, 1);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(108 + x, 111 + y, 1, 2);
        g2d.fillRect(109 + x, 111 + y, 1, 1);
        g2d.fillRect(106 + x, 125 + y, 1, 1);
        g2d.fillRect(105 + x, 132 + y, 1, 1);
        g2d.fillRect(104 + x, 133 + y, 1, 1);
        g2d.fillRect(103 + x, 137 + y, 1, 1);
        g2d.fillRect(102 + x, 139 + y, 1, 1);
        g2d.fillRect(104 + x, 139 + y, 1, 2);
        g2d.fillRect(102 + x, 142 + y, 2, 1);
        g2d.fillRect(103 + x, 143 + y, 1, 2);
        g2d.fillRect(103 + x, 146 + y, 1, 1);
        g2d.fillRect(102 + x, 147 + y, 1, 1);
        g2d.fillRect(101 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 151 + y, 2, 1);
        g2d.fillRect(102 + x, 152 + y, 1, 1);
        g2d.fillRect(100 + x, 153 + y, 2, 1);
        g2d.fillRect(100 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 157 + y, 1, 2);
        g2d.fillRect(100 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(112 + x, 95 + y, 1, 3);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 2);
        g2d.fillRect(108 + x, 110 + y, 1, 1);
        g2d.fillRect(105 + x, 130 + y, 1, 1);
        g2d.fillRect(103 + x, 138 + y, 2, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 1);
        g2d.fillRect(102 + x, 148 + y, 1, 2);
        g2d.fillRect(101 + x, 152 + y, 1, 1);
        g2d.fillRect(100 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 93 + y, 1, 4);
        g2d.fillRect(109 + x, 95 + y, 1, 6);
        g2d.fillRect(111 + x, 95 + y, 1, 5);
        g2d.fillRect(110 + x, 101 + y, 1, 2);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(110 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 2, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(109 + x, 109 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 2);
        g2d.fillRect(111 + x, 109 + y, 1, 1);
        g2d.fillRect(105 + x, 131 + y, 1, 1);
        g2d.fillRect(104 + x, 134 + y, 1, 2);
        g2d.fillRect(104 + x, 137 + y, 1, 1);
        g2d.fillRect(103 + x, 139 + y, 1, 1);
        g2d.fillRect(102 + x, 143 + y, 1, 2);
        g2d.fillRect(103 + x, 145 + y, 1, 1);
        g2d.fillRect(101 + x, 149 + y, 1, 1);
        g2d.fillRect(102 + x, 150 + y, 1, 1);
        g2d.fillRect(100 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 84 + y, 2, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(110 + x, 97 + y, 1, 3);
        g2d.fillRect(109 + x, 101 + y, 1, 2);
        g2d.fillRect(111 + x, 101 + y, 1, 2);
        g2d.fillRect(110 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 108 + y, 1, 1);
        g2d.fillRect(109 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 136 + y, 1, 1);
        g2d.fillRect(103 + x, 140 + y, 1, 1);
        g2d.fillRect(102 + x, 145 + y, 1, 1);
        g2d.fillRect(102 + x, 151 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
    }





    public void paint1BOT3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 4);
        g2d.fillRect(101 + x, 89 + y, 1, 10);
        g2d.fillRect(119 + x, 91 + y, 1, 4);
        g2d.fillRect(118 + x, 95 + y, 1, 5);
        g2d.fillRect(102 + x, 98 + y, 1, 5);
        g2d.fillRect(117 + x, 100 + y, 1, 5);
        g2d.fillRect(103 + x, 103 + y, 1, 4);
        g2d.fillRect(116 + x, 104 + y, 1, 5);
        g2d.fillRect(104 + x, 107 + y, 1, 5);
        g2d.fillRect(115 + x, 108 + y, 1, 3);
        g2d.fillRect(114 + x, 110 + y, 1, 7);
        g2d.fillRect(105 + x, 111 + y, 1, 13);
        g2d.fillRect(106 + x, 115 + y, 1, 4);
        g2d.fillRect(113 + x, 117 + y, 1, 4);
        g2d.fillRect(114 + x, 121 + y, 1, 4);
        g2d.fillRect(104 + x, 124 + y, 1, 6);
        g2d.fillRect(115 + x, 125 + y, 1, 6);
        g2d.fillRect(103 + x, 130 + y, 1, 3);
        g2d.fillRect(116 + x, 131 + y, 1, 3);
        g2d.fillRect(102 + x, 133 + y, 1, 3);
        g2d.fillRect(117 + x, 134 + y, 1, 3);
        g2d.fillRect(101 + x, 136 + y, 1, 3);
        g2d.fillRect(118 + x, 137 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 3);
        g2d.fillRect(119 + x, 140 + y, 1, 3);
        g2d.fillRect(99 + x, 142 + y, 1, 4);
        g2d.fillRect(120 + x, 143 + y, 1, 4);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 6);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(122 + x, 148 + y, 1, 6);
        g2d.fillRect(96 + x, 153 + y, 1, 7);
        g2d.fillRect(123 + x, 154 + y, 1, 7);
        g2d.fillRect(97 + x, 159 + y, 1, 2);
        g2d.fillRect(98 + x, 159 + y, 1, 2);
        g2d.fillRect(99 + x, 160 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 160 + y, 1, 2);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 161 + y, 1, 2);
        g2d.fillRect(103 + x, 161 + y, 1, 2);
        g2d.fillRect(104 + x, 161 + y, 1, 2);
        g2d.fillRect(118 + x, 161 + y, 1, 2);
        g2d.fillRect(119 + x, 161 + y, 1, 2);
        g2d.fillRect(120 + x, 161 + y, 1, 2);
        g2d.fillRect(105 + x, 162 + y, 1, 2);
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(115 + x, 162 + y, 3, 1);
        g2d.fillRect(116 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 84 + y, 1, 7);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(102 + x, 89 + y, 1, 9);
        g2d.fillRect(118 + x, 91 + y, 1, 4);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 12);
        g2d.fillRect(117 + x, 95 + y, 1, 5);
        g2d.fillRect(103 + x, 98 + y, 1, 5);
        g2d.fillRect(116 + x, 100 + y, 1, 4);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 1, 4);
        g2d.fillRect(115 + x, 104 + y, 1, 4);
        g2d.fillRect(105 + x, 107 + y, 1, 4);
        g2d.fillRect(113 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 111 + y, 1, 4);
        g2d.fillRect(107 + x, 115 + y, 1, 4);
        g2d.fillRect(106 + x, 119 + y, 1, 5);
        g2d.fillRect(113 + x, 121 + y, 1, 3);
        g2d.fillRect(105 + x, 124 + y, 1, 6);
        g2d.fillRect(114 + x, 125 + y, 1, 6);
        g2d.fillRect(104 + x, 130 + y, 1, 3);
        g2d.fillRect(115 + x, 131 + y, 1, 3);
        g2d.fillRect(103 + x, 133 + y, 1, 3);
        g2d.fillRect(116 + x, 134 + y, 1, 3);
        g2d.fillRect(102 + x, 136 + y, 1, 3);
        g2d.fillRect(117 + x, 137 + y, 1, 3);
        g2d.fillRect(101 + x, 139 + y, 1, 3);
        g2d.fillRect(118 + x, 140 + y, 1, 3);
        g2d.fillRect(100 + x, 142 + y, 1, 4);
        g2d.fillRect(119 + x, 143 + y, 1, 4);
        g2d.fillRect(99 + x, 146 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 6);
        g2d.fillRect(120 + x, 147 + y, 1, 1);
        g2d.fillRect(121 + x, 148 + y, 1, 6);
        g2d.fillRect(97 + x, 153 + y, 1, 6);
        g2d.fillRect(122 + x, 154 + y, 1, 6);
        g2d.fillRect(98 + x, 158 + y, 1, 1);
        g2d.fillRect(99 + x, 159 + y, 3, 1);
        g2d.fillRect(121 + x, 159 + y, 1, 1);
        g2d.fillRect(102 + x, 160 + y, 3, 1);
        g2d.fillRect(118 + x, 160 + y, 3, 1);
        g2d.fillRect(105 + x, 161 + y, 2, 1);
        g2d.fillRect(115 + x, 161 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 84 + y, 1, 9);
        g2d.fillRect(113 + x, 85 + y, 1, 4);
        g2d.fillRect(103 + x, 86 + y, 1, 12);
        g2d.fillRect(107 + x, 86 + y, 1, 15);
        g2d.fillRect(102 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 4);
        g2d.fillRect(104 + x, 91 + y, 1, 12);
        g2d.fillRect(117 + x, 91 + y, 1, 4);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 95 + y, 1, 5);
        g2d.fillRect(115 + x, 100 + y, 1, 4);
        g2d.fillRect(105 + x, 103 + y, 1, 4);
        g2d.fillRect(108 + x, 103 + y, 1, 4);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(114 + x, 105 + y, 1, 4);
        g2d.fillRect(106 + x, 108 + y, 1, 3);
        g2d.fillRect(107 + x, 110 + y, 1, 5);
        g2d.fillRect(108 + x, 118 + y, 1, 2);
        g2d.fillRect(107 + x, 119 + y, 1, 10);
        g2d.fillRect(106 + x, 124 + y, 1, 10);
        g2d.fillRect(113 + x, 126 + y, 1, 2);
        g2d.fillRect(113 + x, 129 + y, 1, 6);
        g2d.fillRect(105 + x, 130 + y, 1, 9);
        g2d.fillRect(114 + x, 131 + y, 1, 6);
        g2d.fillRect(104 + x, 133 + y, 1, 12);
        g2d.fillRect(115 + x, 134 + y, 1, 12);
        g2d.fillRect(103 + x, 136 + y, 1, 24);
        g2d.fillRect(116 + x, 137 + y, 1, 24);
        g2d.fillRect(102 + x, 139 + y, 1, 21);
        g2d.fillRect(114 + x, 139 + y, 1, 1);
        g2d.fillRect(117 + x, 140 + y, 1, 21);
        g2d.fillRect(101 + x, 142 + y, 1, 17);
        g2d.fillRect(118 + x, 143 + y, 1, 17);
        g2d.fillRect(100 + x, 146 + y, 1, 13);
        g2d.fillRect(99 + x, 147 + y, 1, 12);
        g2d.fillRect(119 + x, 147 + y, 1, 13);
        g2d.fillRect(120 + x, 148 + y, 1, 12);
        g2d.fillRect(98 + x, 153 + y, 1, 5);
        g2d.fillRect(104 + x, 153 + y, 1, 7);
        g2d.fillRect(115 + x, 154 + y, 1, 7);
        g2d.fillRect(121 + x, 154 + y, 1, 5);
        g2d.fillRect(105 + x, 156 + y, 1, 5);
        g2d.fillRect(106 + x, 157 + y, 1, 3);
        g2d.fillRect(114 + x, 157 + y, 1, 3);
        g2d.fillRect(107 + x, 159 + y, 1, 1);
        g2d.fillRect(114 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 86 + y, 1, 5);
        g2d.fillRect(105 + x, 86 + y, 1, 17);
        g2d.fillRect(106 + x, 86 + y, 1, 22);
        g2d.fillRect(115 + x, 86 + y, 1, 14);
        g2d.fillRect(116 + x, 86 + y, 1, 9);
        g2d.fillRect(117 + x, 86 + y, 1, 5);
        g2d.fillRect(113 + x, 95 + y, 1, 8);
        g2d.fillRect(107 + x, 101 + y, 1, 7);
        g2d.fillRect(107 + x, 109 + y, 1, 1);
        g2d.fillRect(108 + x, 112 + y, 1, 1);
        g2d.fillRect(108 + x, 120 + y, 1, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 5);
        g2d.fillRect(107 + x, 129 + y, 1, 7);
        g2d.fillRect(108 + x, 130 + y, 1, 3);
        g2d.fillRect(106 + x, 134 + y, 1, 23);
        g2d.fillRect(107 + x, 137 + y, 1, 21);
        g2d.fillRect(105 + x, 139 + y, 1, 17);
        g2d.fillRect(114 + x, 140 + y, 1, 17);
        g2d.fillRect(108 + x, 141 + y, 1, 7);
        g2d.fillRect(113 + x, 142 + y, 1, 3);
        g2d.fillRect(104 + x, 145 + y, 1, 8);
        g2d.fillRect(115 + x, 146 + y, 1, 8);
        g2d.fillRect(113 + x, 147 + y, 1, 5);
        g2d.fillRect(108 + x, 150 + y, 1, 2);
        g2d.fillRect(108 + x, 153 + y, 1, 3);
        g2d.fillRect(113 + x, 154 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 2, 1);
        g2d.fillRect(108 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 1);
        g2d.fillRect(108 + x, 133 + y, 1, 1);
        g2d.fillRect(113 + x, 135 + y, 1, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 1);
        g2d.fillRect(108 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 141 + y, 1, 1);
        g2d.fillRect(109 + x, 149 + y, 1, 1);
        g2d.fillRect(112 + x, 158 + y, 1, 1);
        g2d.fillRect(106 + x, 160 + y, 2, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 84 + y, 1, 5);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 6);
        g2d.fillRect(108 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 97 + y, 1, 4);
        g2d.fillRect(109 + x, 98 + y, 1, 6);
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(109 + x, 105 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 1);
        g2d.fillRect(109 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 3);
        g2d.fillRect(107 + x, 108 + y, 2, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 1);
        g2d.fillRect(108 + x, 109 + y, 1, 2);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(108 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 116 + y, 1, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(109 + x, 117 + y, 1, 4);
        g2d.fillRect(111 + x, 118 + y, 1, 1);
        g2d.fillRect(112 + x, 119 + y, 1, 2);
        g2d.fillRect(111 + x, 121 + y, 1, 2);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(112 + x, 122 + y, 1, 3);
        g2d.fillRect(113 + x, 124 + y, 1, 2);
        g2d.fillRect(112 + x, 127 + y, 1, 2);
        g2d.fillRect(108 + x, 128 + y, 2, 1);
        g2d.fillRect(111 + x, 128 + y, 1, 1);
        g2d.fillRect(113 + x, 128 + y, 1, 1);
        g2d.fillRect(109 + x, 129 + y, 1, 2);
        g2d.fillRect(112 + x, 130 + y, 1, 2);
        g2d.fillRect(109 + x, 132 + y, 1, 2);
        g2d.fillRect(112 + x, 133 + y, 1, 3);
        g2d.fillRect(108 + x, 134 + y, 1, 1);
        g2d.fillRect(107 + x, 136 + y, 2, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 3);
        g2d.fillRect(108 + x, 137 + y, 1, 1);
        g2d.fillRect(112 + x, 137 + y, 1, 1);
        g2d.fillRect(114 + x, 138 + y, 1, 1);
        g2d.fillRect(108 + x, 139 + y, 1, 1);
        g2d.fillRect(109 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 140 + y, 1, 1);
        g2d.fillRect(112 + x, 141 + y, 1, 4);
        g2d.fillRect(110 + x, 142 + y, 1, 1);
        g2d.fillRect(109 + x, 143 + y, 1, 2);
        g2d.fillRect(110 + x, 145 + y, 1, 2);
        g2d.fillRect(109 + x, 146 + y, 1, 3);
        g2d.fillRect(113 + x, 146 + y, 1, 1);
        g2d.fillRect(108 + x, 148 + y, 1, 2);
        g2d.fillRect(109 + x, 151 + y, 1, 2);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(110 + x, 152 + y, 1, 1);
        g2d.fillRect(112 + x, 152 + y, 1, 3);
        g2d.fillRect(113 + x, 152 + y, 1, 1);
        g2d.fillRect(109 + x, 154 + y, 1, 2);
        g2d.fillRect(112 + x, 157 + y, 1, 1);
        g2d.fillRect(107 + x, 158 + y, 1, 1);
        g2d.fillRect(113 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 159 + y, 1, 3);
        g2d.fillRect(108 + x, 160 + y, 1, 3);
        g2d.fillRect(113 + x, 160 + y, 1, 3);
        g2d.fillRect(114 + x, 160 + y, 1, 1);
        g2d.fillRect(107 + x, 161 + y, 1, 2);
        g2d.fillRect(111 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 2, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 93 + y, 1, 2);
        g2d.fillRect(109 + x, 95 + y, 1, 3);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(109 + x, 104 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 2);
        g2d.fillRect(112 + x, 106 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 2, 1);
        g2d.fillRect(112 + x, 112 + y, 2, 1);
        g2d.fillRect(108 + x, 113 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(108 + x, 115 + y, 1, 1);
        g2d.fillRect(112 + x, 117 + y, 1, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 1);
        g2d.fillRect(111 + x, 120 + y, 1, 1);
        g2d.fillRect(112 + x, 121 + y, 1, 1);
        g2d.fillRect(111 + x, 124 + y, 1, 1);
        g2d.fillRect(112 + x, 125 + y, 1, 2);
        g2d.fillRect(109 + x, 127 + y, 1, 1);
        g2d.fillRect(112 + x, 129 + y, 1, 1);
        g2d.fillRect(112 + x, 132 + y, 1, 1);
        g2d.fillRect(108 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 136 + y, 1, 1);
        g2d.fillRect(108 + x, 138 + y, 1, 1);
        g2d.fillRect(113 + x, 139 + y, 1, 1);
        g2d.fillRect(109 + x, 141 + y, 1, 1);
        g2d.fillRect(111 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 144 + y, 1, 1);
        g2d.fillRect(109 + x, 145 + y, 1, 1);
        g2d.fillRect(110 + x, 148 + y, 1, 1);
        g2d.fillRect(109 + x, 150 + y, 1, 1);
        g2d.fillRect(112 + x, 151 + y, 1, 1);
        g2d.fillRect(109 + x, 153 + y, 1, 1);
        g2d.fillRect(112 + x, 156 + y, 1, 1);
        g2d.fillRect(108 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 159 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 1, 1);
        g2d.fillRect(107 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 3);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 4);
        g2d.fillRect(110 + x, 95 + y, 1, 5);
        g2d.fillRect(112 + x, 95 + y, 1, 6);
        g2d.fillRect(111 + x, 101 + y, 1, 2);
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(109 + x, 106 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 2);
        g2d.fillRect(110 + x, 108 + y, 1, 1);
        g2d.fillRect(109 + x, 110 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(110 + x, 111 + y, 1, 3);
        g2d.fillRect(112 + x, 111 + y, 1, 1);
        g2d.fillRect(111 + x, 112 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 2, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 2);
        g2d.fillRect(109 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 118 + y, 1, 1);
        g2d.fillRect(110 + x, 119 + y, 2, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 2);
        g2d.fillRect(110 + x, 121 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 1);
        g2d.fillRect(109 + x, 124 + y, 1, 2);
        g2d.fillRect(111 + x, 125 + y, 1, 2);
        g2d.fillRect(110 + x, 126 + y, 1, 2);
        g2d.fillRect(110 + x, 129 + y, 1, 1);
        g2d.fillRect(111 + x, 130 + y, 1, 2);
        g2d.fillRect(110 + x, 131 + y, 1, 2);
        g2d.fillRect(111 + x, 133 + y, 1, 1);
        g2d.fillRect(109 + x, 134 + y, 2, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
        g2d.fillRect(109 + x, 137 + y, 1, 2);
        g2d.fillRect(110 + x, 138 + y, 1, 1);
        g2d.fillRect(111 + x, 139 + y, 1, 2);
        g2d.fillRect(112 + x, 140 + y, 1, 1);
        g2d.fillRect(110 + x, 141 + y, 1, 1);
        g2d.fillRect(109 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 143 + y, 2, 1);
        g2d.fillRect(111 + x, 145 + y, 2, 1);
        g2d.fillRect(112 + x, 146 + y, 1, 1);
        g2d.fillRect(111 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 148 + y, 1, 3);
        g2d.fillRect(110 + x, 149 + y, 1, 2);
        g2d.fillRect(111 + x, 150 + y, 1, 2);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(110 + x, 154 + y, 1, 5);
        g2d.fillRect(111 + x, 155 + y, 1, 1);
        g2d.fillRect(109 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 158 + y, 1, 1);
        g2d.fillRect(111 + x, 158 + y, 1, 2);
        g2d.fillRect(109 + x, 159 + y, 1, 1);
        g2d.fillRect(109 + x, 161 + y, 1, 2);
        g2d.fillRect(110 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 163 + y, 1, 1);
        g2d.fillRect(114 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 2);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 112 + y, 1, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 116 + y, 1, 1);
        g2d.fillRect(110 + x, 120 + y, 1, 1);
        g2d.fillRect(108 + x, 121 + y, 1, 1);
        g2d.fillRect(110 + x, 124 + y, 1, 1);
        g2d.fillRect(110 + x, 128 + y, 1, 1);
        g2d.fillRect(108 + x, 129 + y, 1, 1);
        g2d.fillRect(111 + x, 129 + y, 1, 1);
        g2d.fillRect(109 + x, 131 + y, 1, 1);
        g2d.fillRect(111 + x, 134 + y, 1, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 1);
        g2d.fillRect(111 + x, 137 + y, 1, 1);
        g2d.fillRect(112 + x, 138 + y, 1, 1);
        g2d.fillRect(110 + x, 140 + y, 1, 1);
        g2d.fillRect(111 + x, 144 + y, 1, 1);
        g2d.fillRect(113 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 148 + y, 1, 1);
        g2d.fillRect(111 + x, 152 + y, 1, 1);
        g2d.fillRect(110 + x, 153 + y, 1, 1);
        g2d.fillRect(113 + x, 153 + y, 1, 1);
        g2d.fillRect(112 + x, 155 + y, 1, 1);
        g2d.fillRect(109 + x, 156 + y, 1, 1);
        g2d.fillRect(111 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 1);
        g2d.fillRect(110 + x, 159 + y, 1, 1);
        g2d.fillRect(106 + x, 163 + y, 1, 1);
        g2d.fillRect(113 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 3);
        g2d.fillRect(110 + x, 101 + y, 1, 2);
        g2d.fillRect(112 + x, 101 + y, 1, 2);
        g2d.fillRect(111 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(109 + x, 108 + y, 1, 2);
        g2d.fillRect(110 + x, 109 + y, 2, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 115 + y, 1, 1);
        g2d.fillRect(111 + x, 115 + y, 2, 1);
        g2d.fillRect(110 + x, 117 + y, 1, 1);
        g2d.fillRect(110 + x, 122 + y, 1, 1);
        g2d.fillRect(109 + x, 123 + y, 1, 1);
        g2d.fillRect(111 + x, 123 + y, 1, 1);
        g2d.fillRect(110 + x, 125 + y, 1, 1);
        g2d.fillRect(111 + x, 127 + y, 1, 1);
        g2d.fillRect(110 + x, 130 + y, 1, 1);
        g2d.fillRect(111 + x, 132 + y, 1, 1);
        g2d.fillRect(110 + x, 133 + y, 1, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 2);
        g2d.fillRect(110 + x, 135 + y, 2, 1);
        g2d.fillRect(110 + x, 137 + y, 1, 1);
        g2d.fillRect(111 + x, 138 + y, 1, 1);
        g2d.fillRect(109 + x, 139 + y, 2, 1);
        g2d.fillRect(112 + x, 139 + y, 1, 1);
        g2d.fillRect(111 + x, 141 + y, 1, 1);
        g2d.fillRect(111 + x, 146 + y, 1, 1);
        g2d.fillRect(110 + x, 147 + y, 1, 1);
        g2d.fillRect(112 + x, 147 + y, 1, 1);
        g2d.fillRect(111 + x, 149 + y, 1, 1);
        g2d.fillRect(110 + x, 151 + y, 1, 1);
        g2d.fillRect(111 + x, 154 + y, 1, 1);
        g2d.fillRect(108 + x, 156 + y, 1, 1);
        g2d.fillRect(111 + x, 156 + y, 1, 1);
        g2d.fillRect(109 + x, 160 + y, 3, 1);
        g2d.fillRect(111 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 1, 1);
    }





    public void paint1TL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 58 + y, 1, 4);
        g2d.fillRect(117 + x, 60 + y, 1, 4);
        g2d.fillRect(102 + x, 62 + y, 1, 3);
        g2d.fillRect(116 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(100 + x, 77 + y, 1, 10);
        g2d.fillRect(120 + x, 77 + y, 1, 3);
        g2d.fillRect(121 + x, 80 + y, 1, 7);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 14);
        g2d.fillRect(105 + x, 60 + y, 1, 13);
        g2d.fillRect(115 + x, 60 + y, 1, 13);
        g2d.fillRect(116 + x, 60 + y, 1, 4);
        g2d.fillRect(106 + x, 61 + y, 1, 6);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 6);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 7);
        g2d.fillRect(117 + x, 70 + y, 1, 6);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 73 + y, 1, 3);
        g2d.fillRect(102 + x, 75 + y, 1, 3);
        g2d.fillRect(101 + x, 77 + y, 1, 10);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 79 + y, 2, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 7);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 9);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 6);
        g2d.fillRect(108 + x, 67 + y, 1, 5);
        g2d.fillRect(113 + x, 69 + y, 2, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 11);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 6);
        g2d.fillRect(115 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 3);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 4);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(118 + x, 76 + y, 1, 4);
        g2d.fillRect(102 + x, 78 + y, 1, 9);
        g2d.fillRect(119 + x, 79 + y, 1, 8);
        g2d.fillRect(107 + x, 81 + y, 1, 5);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 1, 3);
        g2d.fillRect(118 + x, 85 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 63 + y, 1, 4);
        g2d.fillRect(107 + x, 68 + y, 1, 5);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 13);
        g2d.fillRect(105 + x, 74 + y, 1, 12);
        g2d.fillRect(115 + x, 75 + y, 1, 11);
        g2d.fillRect(116 + x, 76 + y, 1, 10);
        g2d.fillRect(104 + x, 77 + y, 1, 9);
        g2d.fillRect(117 + x, 78 + y, 1, 8);
        g2d.fillRect(103 + x, 80 + y, 1, 3);
        g2d.fillRect(118 + x, 80 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 61 + y, 3, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 3);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 4);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 3);
        g2d.fillRect(109 + x, 80 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 2, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 3);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 2, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 2, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 3);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 2);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 2, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 3, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
    }





    public void paint1TU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 51 + y, 2, 1);
        g2d.fillRect(118 + x, 51 + y, 2, 1);
        g2d.fillRect(99 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 2, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 50 + y, 3, 1);
        g2d.fillRect(113 + x, 50 + y, 3, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 7);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 3, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 4);
        g2d.fillRect(100 + x, 53 + y, 1, 5);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 4);
        g2d.fillRect(120 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 6);
        g2d.fillRect(108 + x, 55 + y, 1, 4);
        g2d.fillRect(118 + x, 55 + y, 1, 4);
        g2d.fillRect(103 + x, 56 + y, 1, 5);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 2, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 3);
        g2d.fillRect(117 + x, 53 + y, 1, 4);
        g2d.fillRect(118 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 52 + y, 2, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(105 + x, 53 + y, 1, 4);
        g2d.fillRect(115 + x, 53 + y, 1, 4);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(106 + x, 54 + y, 1, 3);
        g2d.fillRect(114 + x, 55 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 50 + y, 3, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 3);
        g2d.fillRect(108 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 3);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 51 + y, 3, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 2, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 2, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
