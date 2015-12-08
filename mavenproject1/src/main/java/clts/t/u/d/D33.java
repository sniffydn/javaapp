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
public class D33 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D33()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 10;
    }

    public D33(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 10;
    }

    public D33(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 10;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        if(step == 4)
        {
            paintTL1(x, 0, g2d);
        }
        else if(prevY == -1 || step == 3 || step == 5)
        {
            paintTL2(x, 0, g2d);
        }
        else if(prevY == 1)
        {
            paintTL4(x, 0, g2d);
        }
        else
        {
            paintTL3(x, 0, g2d);
        }

    }
    int prevY = 0;

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
        paintTL(x,0,g2d);
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
        if(prevY == 1)
            prevY = 0;
        paintLB(offsetX, prevY, g2d);
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

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 47 + y, 1, 3);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 9);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 47 + y, 1, 3);
        g2d.fillRect(117 + x, 47 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 52 + y, 1, 5);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 5);
        g2d.fillRect(117 + x, 56 + y, 1, 5);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(103 + x, 57 + y, 1, 4);
        g2d.fillRect(116 + x, 57 + y, 1, 4);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 1, 5);
        g2d.fillRect(118 + x, 50 + y, 1, 5);
        g2d.fillRect(104 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 2, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 49 + y, 1, 6);
        g2d.fillRect(116 + x, 49 + y, 1, 6);
        g2d.fillRect(102 + x, 50 + y, 1, 5);
        g2d.fillRect(117 + x, 50 + y, 1, 5);
        g2d.fillRect(104 + x, 54 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
    }





    public void paintLB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 127 + y, 1, 5);
        g2d.fillRect(104 + x, 132 + y, 1, 4);
        g2d.fillRect(102 + x, 140 + y, 1, 2);
        g2d.fillRect(102 + x, 146 + y, 1, 1);
        g2d.fillRect(101 + x, 148 + y, 1, 2);
        g2d.fillRect(102 + x, 150 + y, 1, 2);
        g2d.fillRect(101 + x, 152 + y, 1, 2);
        g2d.fillRect(103 + x, 152 + y, 1, 3);
        g2d.fillRect(104 + x, 154 + y, 1, 5);
        g2d.fillRect(100 + x, 155 + y, 1, 1);
        g2d.fillRect(117 + x, 155 + y, 1, 2);
        g2d.fillRect(99 + x, 156 + y, 1, 7);
        g2d.fillRect(118 + x, 157 + y, 1, 3);
        g2d.fillRect(105 + x, 158 + y, 1, 6);
        g2d.fillRect(115 + x, 158 + y, 1, 1);
        g2d.fillRect(100 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 163 + y, 1, 5);
        g2d.fillRect(100 + x, 163 + y, 1, 1);
        g2d.fillRect(106 + x, 163 + y, 1, 5);
        g2d.fillRect(119 + x, 164 + y, 1, 2);
        g2d.fillRect(100 + x, 167 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 81 + y, 1, 4);
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 82 + y, 1, 5);
        g2d.fillRect(103 + x, 83 + y, 1, 6);
        g2d.fillRect(104 + x, 84 + y, 1, 11);
        g2d.fillRect(105 + x, 85 + y, 1, 16);
        g2d.fillRect(106 + x, 86 + y, 1, 17);
        g2d.fillRect(107 + x, 87 + y, 1, 24);
        g2d.fillRect(108 + x, 88 + y, 1, 30);
        g2d.fillRect(109 + x, 90 + y, 1, 34);
        g2d.fillRect(110 + x, 92 + y, 1, 41);
        g2d.fillRect(111 + x, 93 + y, 1, 42);
        g2d.fillRect(112 + x, 94 + y, 1, 46);
        g2d.fillRect(113 + x, 95 + y, 1, 75);
        g2d.fillRect(114 + x, 100 + y, 1, 68);
        g2d.fillRect(106 + x, 106 + y, 1, 5);
        g2d.fillRect(115 + x, 109 + y, 1, 43);
        g2d.fillRect(116 + x, 113 + y, 1, 35);
        g2d.fillRect(117 + x, 113 + y, 1, 32);
        g2d.fillRect(106 + x, 115 + y, 1, 48);
        g2d.fillRect(105 + x, 118 + y, 1, 9);
        g2d.fillRect(107 + x, 121 + y, 1, 47);
        g2d.fillRect(104 + x, 122 + y, 1, 10);
        g2d.fillRect(108 + x, 127 + y, 1, 29);
        g2d.fillRect(103 + x, 130 + y, 1, 9);
        g2d.fillRect(105 + x, 132 + y, 1, 26);
        g2d.fillRect(101 + x, 135 + y, 2, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 23);
        g2d.fillRect(110 + x, 135 + y, 1, 26);
        g2d.fillRect(102 + x, 136 + y, 1, 4);
        g2d.fillRect(104 + x, 136 + y, 1, 18);
        g2d.fillRect(101 + x, 139 + y, 1, 1);
        g2d.fillRect(100 + x, 140 + y, 1, 4);
        g2d.fillRect(103 + x, 140 + y, 1, 12);
        g2d.fillRect(111 + x, 141 + y, 1, 25);
        g2d.fillRect(102 + x, 142 + y, 1, 4);
        g2d.fillRect(99 + x, 144 + y, 1, 3);
        g2d.fillRect(101 + x, 146 + y, 1, 2);
        g2d.fillRect(98 + x, 147 + y, 1, 5);
        g2d.fillRect(102 + x, 147 + y, 1, 3);
        g2d.fillRect(97 + x, 152 + y, 1, 3);
        g2d.fillRect(102 + x, 152 + y, 1, 9);
        g2d.fillRect(112 + x, 153 + y, 1, 17);
        g2d.fillRect(101 + x, 154 + y, 1, 14);
        g2d.fillRect(115 + x, 154 + y, 1, 4);
        g2d.fillRect(96 + x, 155 + y, 1, 5);
        g2d.fillRect(103 + x, 155 + y, 1, 9);
        g2d.fillRect(100 + x, 156 + y, 1, 3);
        g2d.fillRect(119 + x, 158 + y, 1, 6);
        g2d.fillRect(104 + x, 159 + y, 1, 9);
        g2d.fillRect(108 + x, 159 + y, 1, 9);
        g2d.fillRect(115 + x, 159 + y, 1, 8);
        g2d.fillRect(116 + x, 159 + y, 1, 3);
        g2d.fillRect(95 + x, 160 + y, 1, 6);
        g2d.fillRect(100 + x, 160 + y, 1, 3);
        g2d.fillRect(109 + x, 162 + y, 1, 7);
        g2d.fillRect(117 + x, 163 + y, 1, 3);
        g2d.fillRect(118 + x, 163 + y, 1, 3);
        g2d.fillRect(100 + x, 164 + y, 1, 3);
        g2d.fillRect(102 + x, 164 + y, 1, 4);
        g2d.fillRect(105 + x, 164 + y, 1, 4);
        g2d.fillRect(119 + x, 166 + y, 1, 1);
        g2d.fillRect(110 + x, 167 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 89 + y, 1, 6);
        g2d.fillRect(104 + x, 95 + y, 1, 8);
        g2d.fillRect(105 + x, 101 + y, 1, 17);
        g2d.fillRect(106 + x, 103 + y, 1, 3);
        g2d.fillRect(106 + x, 111 + y, 1, 4);
        g2d.fillRect(107 + x, 111 + y, 1, 10);
        g2d.fillRect(104 + x, 115 + y, 1, 7);
        g2d.fillRect(108 + x, 118 + y, 1, 9);
        g2d.fillRect(103 + x, 123 + y, 1, 7);
        g2d.fillRect(109 + x, 124 + y, 1, 11);
        g2d.fillRect(102 + x, 127 + y, 1, 8);
        g2d.fillRect(101 + x, 131 + y, 1, 4);
        g2d.fillRect(110 + x, 133 + y, 1, 2);
        g2d.fillRect(100 + x, 134 + y, 1, 6);
        g2d.fillRect(111 + x, 135 + y, 1, 6);
        g2d.fillRect(101 + x, 136 + y, 1, 3);
        g2d.fillRect(118 + x, 136 + y, 1, 21);
        g2d.fillRect(103 + x, 139 + y, 1, 1);
        g2d.fillRect(99 + x, 140 + y, 1, 4);
        g2d.fillRect(101 + x, 140 + y, 1, 6);
        g2d.fillRect(112 + x, 140 + y, 1, 13);
        g2d.fillRect(98 + x, 144 + y, 1, 3);
        g2d.fillRect(100 + x, 144 + y, 1, 11);
        g2d.fillRect(117 + x, 145 + y, 1, 10);
        g2d.fillRect(119 + x, 146 + y, 1, 12);
        g2d.fillRect(97 + x, 147 + y, 1, 5);
        g2d.fillRect(99 + x, 147 + y, 1, 9);
        g2d.fillRect(116 + x, 148 + y, 1, 11);
        g2d.fillRect(101 + x, 150 + y, 1, 2);
        g2d.fillRect(96 + x, 152 + y, 1, 3);
        g2d.fillRect(98 + x, 152 + y, 1, 11);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(120 + x, 153 + y, 1, 15);
        g2d.fillRect(95 + x, 155 + y, 1, 5);
        g2d.fillRect(97 + x, 155 + y, 1, 13);
        g2d.fillRect(108 + x, 156 + y, 1, 3);
        g2d.fillRect(117 + x, 157 + y, 1, 6);
        g2d.fillRect(109 + x, 158 + y, 1, 4);
        g2d.fillRect(121 + x, 159 + y, 1, 8);
        g2d.fillRect(94 + x, 160 + y, 1, 6);
        g2d.fillRect(96 + x, 160 + y, 1, 7);
        g2d.fillRect(118 + x, 160 + y, 1, 3);
        g2d.fillRect(102 + x, 161 + y, 1, 3);
        g2d.fillRect(110 + x, 161 + y, 1, 6);
        g2d.fillRect(99 + x, 163 + y, 1, 5);
        g2d.fillRect(116 + x, 163 + y, 1, 7);
        g2d.fillRect(122 + x, 163 + y, 1, 3);
        g2d.fillRect(103 + x, 164 + y, 1, 4);
        g2d.fillRect(95 + x, 166 + y, 1, 1);
        g2d.fillRect(111 + x, 166 + y, 1, 3);
        g2d.fillRect(117 + x, 166 + y, 1, 3);
        g2d.fillRect(118 + x, 166 + y, 1, 3);
        g2d.fillRect(115 + x, 167 + y, 1, 3);
        g2d.fillRect(119 + x, 167 + y, 1, 1);
        g2d.fillRect(114 + x, 168 + y, 1, 2);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 117 + y, 1, 8);
        g2d.fillRect(118 + x, 127 + y, 1, 2);
        g2d.fillRect(117 + x, 128 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(104 + x, 83 + y, 3, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 86 + y, 3, 1);
        g2d.fillRect(108 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 4);
        g2d.fillRect(111 + x, 88 + y, 1, 5);
        g2d.fillRect(112 + x, 89 + y, 1, 5);
        g2d.fillRect(113 + x, 90 + y, 1, 5);
        g2d.fillRect(114 + x, 97 + y, 1, 3);
        g2d.fillRect(115 + x, 101 + y, 1, 8);
        g2d.fillRect(116 + x, 101 + y, 1, 12);
        g2d.fillRect(117 + x, 106 + y, 1, 11);
        g2d.fillRect(117 + x, 125 + y, 1, 3);
        g2d.fillRect(118 + x, 129 + y, 1, 2);
        g2d.fillRect(117 + x, 131 + y, 1, 25);
        g2d.fillRect(118 + x, 139 + y, 1, 5);
        g2d.fillRect(118 + x, 148 + y, 1, 2);
        g2d.fillRect(118 + x, 155 + y, 1, 5);
        g2d.fillRect(119 + x, 159 + y, 1, 3);
        g2d.fillRect(120 + x, 161 + y, 1, 4);
        g2d.fillRect(121 + x, 164 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 82 + y, 4, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(113 + x, 83 + y, 1, 7);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 9);
        g2d.fillRect(115 + x, 89 + y, 1, 12);
        g2d.fillRect(116 + x, 91 + y, 1, 10);
        g2d.fillRect(117 + x, 96 + y, 1, 10);
        g2d.fillRect(118 + x, 100 + y, 1, 27);
        g2d.fillRect(119 + x, 114 + y, 1, 3);
        g2d.fillRect(118 + x, 131 + y, 1, 1);
        g2d.fillRect(119 + x, 136 + y, 1, 1);
        g2d.fillRect(118 + x, 144 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 4);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 5);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 3, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 9);
        g2d.fillRect(118 + x, 87 + y, 1, 13);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 24);
        g2d.fillRect(121 + x, 90 + y, 1, 4);
        g2d.fillRect(120 + x, 94 + y, 1, 14);
        g2d.fillRect(119 + x, 135 + y, 1, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 3);
        g2d.fillRect(118 + x, 147 + y, 3, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 11);
        g2d.fillRect(118 + x, 150 + y, 1, 5);
        g2d.fillRect(120 + x, 153 + y, 1, 8);
        g2d.fillRect(121 + x, 156 + y, 1, 8);
        g2d.fillRect(122 + x, 156 + y, 1, 9);
        g2d.fillRect(123 + x, 159 + y, 1, 2);
        g2d.fillRect(124 + x, 161 + y, 1, 2);
        g2d.fillRect(125 + x, 162 + y, 1, 1);
        g2d.fillRect(123 + x, 163 + y, 1, 2);
        g2d.fillRect(124 + x, 164 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 4);
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 8);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(120 + x, 90 + y, 1, 4);
        g2d.fillRect(121 + x, 94 + y, 1, 8);
        g2d.fillRect(118 + x, 132 + y, 1, 7);
        g2d.fillRect(119 + x, 137 + y, 1, 10);
        g2d.fillRect(120 + x, 140 + y, 1, 7);
        g2d.fillRect(121 + x, 147 + y, 1, 9);
        g2d.fillRect(120 + x, 148 + y, 1, 5);
        g2d.fillRect(122 + x, 151 + y, 1, 5);
        g2d.fillRect(123 + x, 156 + y, 1, 3);
        g2d.fillRect(124 + x, 158 + y, 1, 3);
        g2d.fillRect(123 + x, 161 + y, 1, 2);
        g2d.fillRect(124 + x, 163 + y, 2, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 118 + y, 1, 8);
        g2d.fillRect(119 + x, 128 + y, 1, 2);
        g2d.fillRect(118 + x, 129 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(104 + x, 83 + y, 3, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 86 + y, 3, 1);
        g2d.fillRect(108 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 4);
        g2d.fillRect(111 + x, 88 + y, 1, 5);
        g2d.fillRect(112 + x, 89 + y, 1, 5);
        g2d.fillRect(113 + x, 90 + y, 1, 6);
        g2d.fillRect(114 + x, 98 + y, 1, 3);
        g2d.fillRect(115 + x, 102 + y, 1, 8);
        g2d.fillRect(116 + x, 102 + y, 1, 12);
        g2d.fillRect(117 + x, 107 + y, 1, 11);
        g2d.fillRect(118 + x, 126 + y, 1, 3);
        g2d.fillRect(119 + x, 130 + y, 1, 2);
        g2d.fillRect(118 + x, 132 + y, 1, 19);
        g2d.fillRect(119 + x, 140 + y, 1, 5);
        g2d.fillRect(119 + x, 149 + y, 1, 8);
        g2d.fillRect(120 + x, 156 + y, 1, 5);
        g2d.fillRect(121 + x, 160 + y, 1, 3);
        g2d.fillRect(122 + x, 162 + y, 1, 4);
        g2d.fillRect(123 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 82 + y, 4, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(113 + x, 83 + y, 1, 7);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 10);
        g2d.fillRect(115 + x, 89 + y, 1, 13);
        g2d.fillRect(116 + x, 91 + y, 1, 11);
        g2d.fillRect(117 + x, 97 + y, 1, 10);
        g2d.fillRect(118 + x, 101 + y, 1, 17);
        g2d.fillRect(119 + x, 115 + y, 1, 13);
        g2d.fillRect(119 + x, 132 + y, 1, 1);
        g2d.fillRect(120 + x, 137 + y, 1, 1);
        g2d.fillRect(119 + x, 145 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 4);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 5);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 3, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 10);
        g2d.fillRect(118 + x, 87 + y, 1, 14);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 25);
        g2d.fillRect(121 + x, 90 + y, 1, 5);
        g2d.fillRect(120 + x, 95 + y, 1, 14);
        g2d.fillRect(120 + x, 136 + y, 1, 1);
        g2d.fillRect(122 + x, 145 + y, 1, 3);
        g2d.fillRect(119 + x, 148 + y, 3, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 7);
        g2d.fillRect(121 + x, 149 + y, 1, 11);
        g2d.fillRect(122 + x, 154 + y, 1, 8);
        g2d.fillRect(123 + x, 157 + y, 1, 8);
        g2d.fillRect(124 + x, 157 + y, 1, 9);
        g2d.fillRect(125 + x, 160 + y, 1, 2);
        g2d.fillRect(126 + x, 162 + y, 1, 2);
        g2d.fillRect(127 + x, 163 + y, 1, 1);
        g2d.fillRect(125 + x, 164 + y, 1, 2);
        g2d.fillRect(126 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 4);
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 8);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(120 + x, 90 + y, 1, 5);
        g2d.fillRect(121 + x, 95 + y, 1, 8);
        g2d.fillRect(119 + x, 133 + y, 1, 7);
        g2d.fillRect(120 + x, 138 + y, 1, 10);
        g2d.fillRect(121 + x, 141 + y, 1, 7);
        g2d.fillRect(122 + x, 148 + y, 1, 6);
        g2d.fillRect(123 + x, 149 + y, 1, 8);
        g2d.fillRect(124 + x, 152 + y, 1, 5);
        g2d.fillRect(125 + x, 157 + y, 1, 3);
        g2d.fillRect(126 + x, 159 + y, 1, 3);
        g2d.fillRect(125 + x, 162 + y, 1, 2);
        g2d.fillRect(126 + x, 164 + y, 2, 1);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 119 + y, 1, 8);
        g2d.fillRect(119 + x, 129 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(104 + x, 83 + y, 3, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 86 + y, 3, 1);
        g2d.fillRect(108 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 4);
        g2d.fillRect(111 + x, 88 + y, 1, 5);
        g2d.fillRect(112 + x, 89 + y, 1, 6);
        g2d.fillRect(113 + x, 90 + y, 1, 7);
        g2d.fillRect(114 + x, 99 + y, 1, 3);
        g2d.fillRect(115 + x, 103 + y, 1, 8);
        g2d.fillRect(116 + x, 103 + y, 1, 12);
        g2d.fillRect(117 + x, 108 + y, 1, 11);
        g2d.fillRect(118 + x, 127 + y, 1, 3);
        g2d.fillRect(119 + x, 131 + y, 1, 2);
        g2d.fillRect(118 + x, 133 + y, 1, 12);
        g2d.fillRect(119 + x, 141 + y, 1, 11);
        g2d.fillRect(120 + x, 150 + y, 1, 8);
        g2d.fillRect(121 + x, 157 + y, 1, 5);
        g2d.fillRect(122 + x, 161 + y, 1, 3);
        g2d.fillRect(123 + x, 163 + y, 1, 4);
        g2d.fillRect(124 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 82 + y, 4, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(113 + x, 83 + y, 1, 7);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 11);
        g2d.fillRect(115 + x, 89 + y, 1, 14);
        g2d.fillRect(116 + x, 91 + y, 1, 12);
        g2d.fillRect(117 + x, 98 + y, 1, 10);
        g2d.fillRect(118 + x, 102 + y, 1, 17);
        g2d.fillRect(119 + x, 116 + y, 1, 13);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(120 + x, 138 + y, 1, 1);
        g2d.fillRect(120 + x, 146 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 4);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 5);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 3, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 11);
        g2d.fillRect(118 + x, 87 + y, 1, 15);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 26);
        g2d.fillRect(121 + x, 90 + y, 1, 6);
        g2d.fillRect(120 + x, 96 + y, 1, 14);
        g2d.fillRect(120 + x, 137 + y, 1, 1);
        g2d.fillRect(123 + x, 146 + y, 1, 3);
        g2d.fillRect(120 + x, 149 + y, 3, 1);
        g2d.fillRect(121 + x, 150 + y, 1, 7);
        g2d.fillRect(122 + x, 150 + y, 1, 11);
        g2d.fillRect(123 + x, 155 + y, 1, 8);
        g2d.fillRect(124 + x, 158 + y, 1, 8);
        g2d.fillRect(125 + x, 158 + y, 1, 9);
        g2d.fillRect(126 + x, 161 + y, 1, 2);
        g2d.fillRect(127 + x, 163 + y, 1, 2);
        g2d.fillRect(128 + x, 164 + y, 1, 1);
        g2d.fillRect(126 + x, 165 + y, 1, 2);
        g2d.fillRect(127 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 4);
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 8);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(120 + x, 90 + y, 1, 6);
        g2d.fillRect(121 + x, 96 + y, 1, 8);
        g2d.fillRect(119 + x, 134 + y, 1, 7);
        g2d.fillRect(120 + x, 139 + y, 1, 7);
        g2d.fillRect(121 + x, 142 + y, 1, 7);
        g2d.fillRect(122 + x, 146 + y, 1, 3);
        g2d.fillRect(123 + x, 149 + y, 1, 6);
        g2d.fillRect(124 + x, 150 + y, 1, 8);
        g2d.fillRect(125 + x, 153 + y, 1, 5);
        g2d.fillRect(126 + x, 158 + y, 1, 3);
        g2d.fillRect(127 + x, 160 + y, 1, 3);
        g2d.fillRect(126 + x, 163 + y, 1, 2);
        g2d.fillRect(127 + x, 165 + y, 2, 1);
    }





    public void paintTL4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 120 + y, 1, 8);
        g2d.fillRect(119 + x, 130 + y, 1, 2);
        g2d.fillRect(118 + x, 131 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 82 + y, 3, 1);
        g2d.fillRect(104 + x, 83 + y, 3, 1);
        g2d.fillRect(105 + x, 84 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 3, 1);
        g2d.fillRect(107 + x, 86 + y, 3, 1);
        g2d.fillRect(108 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 4);
        g2d.fillRect(111 + x, 88 + y, 1, 6);
        g2d.fillRect(112 + x, 89 + y, 1, 7);
        g2d.fillRect(113 + x, 90 + y, 1, 8);
        g2d.fillRect(114 + x, 100 + y, 1, 3);
        g2d.fillRect(115 + x, 104 + y, 1, 8);
        g2d.fillRect(116 + x, 104 + y, 1, 12);
        g2d.fillRect(117 + x, 109 + y, 1, 11);
        g2d.fillRect(118 + x, 128 + y, 1, 3);
        g2d.fillRect(119 + x, 132 + y, 1, 14);
        g2d.fillRect(120 + x, 142 + y, 1, 11);
        g2d.fillRect(121 + x, 151 + y, 1, 8);
        g2d.fillRect(122 + x, 158 + y, 1, 5);
        g2d.fillRect(123 + x, 162 + y, 1, 3);
        g2d.fillRect(124 + x, 164 + y, 1, 4);
        g2d.fillRect(125 + x, 167 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 82 + y, 4, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(110 + x, 83 + y, 1, 4);
        g2d.fillRect(113 + x, 83 + y, 1, 7);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 12);
        g2d.fillRect(115 + x, 89 + y, 1, 15);
        g2d.fillRect(116 + x, 91 + y, 1, 13);
        g2d.fillRect(117 + x, 99 + y, 1, 10);
        g2d.fillRect(118 + x, 103 + y, 1, 17);
        g2d.fillRect(119 + x, 117 + y, 1, 13);
        g2d.fillRect(120 + x, 134 + y, 1, 1);
        g2d.fillRect(121 + x, 139 + y, 1, 1);
        g2d.fillRect(121 + x, 147 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 4);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 4);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 1, 5);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 3, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 12);
        g2d.fillRect(118 + x, 87 + y, 1, 16);
        g2d.fillRect(115 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 27);
        g2d.fillRect(121 + x, 90 + y, 1, 7);
        g2d.fillRect(120 + x, 97 + y, 1, 14);
        g2d.fillRect(121 + x, 138 + y, 1, 1);
        g2d.fillRect(124 + x, 147 + y, 1, 3);
        g2d.fillRect(121 + x, 150 + y, 3, 1);
        g2d.fillRect(122 + x, 151 + y, 1, 7);
        g2d.fillRect(123 + x, 151 + y, 1, 11);
        g2d.fillRect(124 + x, 156 + y, 1, 8);
        g2d.fillRect(125 + x, 159 + y, 1, 8);
        g2d.fillRect(126 + x, 159 + y, 1, 9);
        g2d.fillRect(127 + x, 162 + y, 1, 2);
        g2d.fillRect(128 + x, 164 + y, 1, 2);
        g2d.fillRect(129 + x, 165 + y, 1, 1);
        g2d.fillRect(127 + x, 166 + y, 1, 2);
        g2d.fillRect(128 + x, 167 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 4);
        g2d.fillRect(120 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 8);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(120 + x, 90 + y, 1, 7);
        g2d.fillRect(121 + x, 97 + y, 1, 8);
        g2d.fillRect(120 + x, 135 + y, 1, 7);
        g2d.fillRect(121 + x, 140 + y, 1, 7);
        g2d.fillRect(122 + x, 143 + y, 1, 7);
        g2d.fillRect(123 + x, 147 + y, 1, 3);
        g2d.fillRect(124 + x, 150 + y, 1, 6);
        g2d.fillRect(125 + x, 151 + y, 1, 8);
        g2d.fillRect(126 + x, 154 + y, 1, 5);
        g2d.fillRect(127 + x, 159 + y, 1, 3);
        g2d.fillRect(128 + x, 161 + y, 1, 3);
        g2d.fillRect(127 + x, 164 + y, 1, 2);
        g2d.fillRect(128 + x, 166 + y, 2, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 4);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(102 + x, 42 + y, 1, 3);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 43 + y, 1, 2);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(117 + x, 45 + y, 1, 3);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(101 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(102 + x, 67 + y, 2, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 14);
        g2d.fillRect(104 + x, 68 + y, 1, 5);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 9);
        g2d.fillRect(101 + x, 77 + y, 1, 4);
        g2d.fillRect(104 + x, 79 + y, 1, 3);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 45 + y, 1, 3);
        g2d.fillRect(116 + x, 45 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(115 + x, 60 + y, 1, 3);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(104 + x, 65 + y, 1, 3);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 8);
        g2d.fillRect(107 + x, 67 + y, 1, 6);
        g2d.fillRect(110 + x, 67 + y, 1, 5);
        g2d.fillRect(112 + x, 67 + y, 1, 6);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 4);
        g2d.fillRect(109 + x, 68 + y, 1, 2);
        g2d.fillRect(111 + x, 69 + y, 1, 4);
        g2d.fillRect(113 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 10);
        g2d.fillRect(104 + x, 73 + y, 1, 6);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 5);
        g2d.fillRect(107 + x, 78 + y, 1, 4);
        g2d.fillRect(114 + x, 79 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 4);
        g2d.fillRect(104 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 4);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 15);
        g2d.fillRect(113 + x, 68 + y, 2, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 14);
        g2d.fillRect(117 + x, 68 + y, 1, 8);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 2);
        g2d.fillRect(108 + x, 72 + y, 1, 4);
        g2d.fillRect(110 + x, 72 + y, 1, 3);
        g2d.fillRect(113 + x, 72 + y, 2, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 73 + y, 1, 3);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 73 + y, 1, 9);
        g2d.fillRect(113 + x, 74 + y, 1, 2);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 4);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(110 + x, 76 + y, 1, 5);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 78 + y, 1, 3);
        g2d.fillRect(111 + x, 78 + y, 1, 4);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 3);
        g2d.fillRect(109 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(112 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 65 + y, 1, 3);
        g2d.fillRect(111 + x, 65 + y, 1, 3);
        g2d.fillRect(118 + x, 71 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 2);
        g2d.fillRect(111 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 6);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 4);
        g2d.fillRect(109 + x, 79 + y, 1, 2);
        g2d.fillRect(119 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
    }
}
