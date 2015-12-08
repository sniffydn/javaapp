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
import draw.Panel;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import pieces.p.Star0;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D12 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public D12()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 8;
    }

    public D12(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 8;
    }

    public D12(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 8;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintdl1(x,0,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 51 + y, 1, 3);
        g2d.fillRect(102 + x, 51 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 4);
        g2d.fillRect(104 + x, 51 + y, 1, 4);
        g2d.fillRect(115 + x, 51 + y, 1, 4);
        g2d.fillRect(116 + x, 51 + y, 1, 4);
        g2d.fillRect(117 + x, 51 + y, 1, 3);
        g2d.fillRect(118 + x, 51 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 52 + y, 1, 4);
        g2d.fillRect(113 + x, 52 + y, 1, 4);
        g2d.fillRect(114 + x, 52 + y, 1, 4);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 5);
        g2d.fillRect(107 + x, 53 + y, 1, 4);
        g2d.fillRect(112 + x, 53 + y, 1, 4);
        g2d.fillRect(120 + x, 53 + y, 1, 5);
        g2d.fillRect(98 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 1, 3);
        g2d.fillRect(110 + x, 54 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 3);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 58 + y, 2, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 3, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 54 + y, 2, 1);
        g2d.fillRect(117 + x, 54 + y, 3, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 2, 1);
        g2d.fillRect(113 + x, 56 + y, 2, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 3, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 55 + y, 3, 1);
        g2d.fillRect(116 + x, 55 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 56 + y, 3, 1);
        g2d.fillRect(115 + x, 56 + y, 3, 1);
        g2d.fillRect(105 + x, 57 + y, 5, 1);
        g2d.fillRect(111 + x, 57 + y, 4, 1);
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
        paintdlb1(offsetX, 0, g2d);
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

    public void paintdl1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 3, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 8);
        g2d.fillRect(116 + x, 61 + y, 1, 10);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(103 + x, 65 + y, 1, 5);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 17);
        g2d.fillRect(102 + x, 69 + y, 1, 13);
        g2d.fillRect(108 + x, 70 + y, 3, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 7);
        g2d.fillRect(104 + x, 71 + y, 1, 3);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 11);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 2, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 6);
        g2d.fillRect(101 + x, 76 + y, 1, 6);
        g2d.fillRect(120 + x, 76 + y, 1, 6);
        g2d.fillRect(114 + x, 77 + y, 1, 3);
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(100 + x, 79 + y, 1, 21);
        g2d.fillRect(111 + x, 79 + y, 1, 2);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 2, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 5);
        g2d.fillRect(121 + x, 80 + y, 1, 5);
        g2d.fillRect(115 + x, 81 + y, 1, 5);
        g2d.fillRect(113 + x, 82 + y, 1, 5);
        g2d.fillRect(114 + x, 82 + y, 1, 4);
        g2d.fillRect(101 + x, 83 + y, 1, 10);
        g2d.fillRect(108 + x, 83 + y, 5, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 4);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(104 + x, 86 + y, 3, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 6);
        g2d.fillRect(110 + x, 87 + y, 1, 4);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 4);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(106 + x, 91 + y, 1, 2);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 93 + y, 1, 3);
        g2d.fillRect(112 + x, 95 + y, 1, 4);
        g2d.fillRect(109 + x, 96 + y, 1, 5);
        g2d.fillRect(110 + x, 96 + y, 1, 4);
        g2d.fillRect(111 + x, 96 + y, 1, 4);
        g2d.fillRect(115 + x, 96 + y, 1, 3);
        g2d.fillRect(108 + x, 97 + y, 1, 6);
        g2d.fillRect(114 + x, 99 + y, 1, 2);
        g2d.fillRect(107 + x, 100 + y, 1, 3);
        g2d.fillRect(106 + x, 101 + y, 1, 3);
        g2d.fillRect(113 + x, 101 + y, 1, 3);
        g2d.fillRect(105 + x, 103 + y, 1, 4);
        g2d.fillRect(109 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 3);
        g2d.fillRect(108 + x, 105 + y, 1, 3);
        g2d.fillRect(107 + x, 107 + y, 1, 4);
        g2d.fillRect(111 + x, 107 + y, 1, 2);
        g2d.fillRect(103 + x, 109 + y, 1, 2);
        g2d.fillRect(106 + x, 109 + y, 1, 3);
        g2d.fillRect(110 + x, 109 + y, 1, 3);
        g2d.fillRect(105 + x, 112 + y, 1, 2);
        g2d.fillRect(109 + x, 112 + y, 1, 3);
        g2d.fillRect(108 + x, 114 + y, 1, 5);
        g2d.fillRect(107 + x, 118 + y, 1, 5);
        g2d.fillRect(104 + x, 121 + y, 1, 22);
        g2d.fillRect(105 + x, 124 + y, 1, 5);
        g2d.fillRect(103 + x, 128 + y, 1, 18);
        g2d.fillRect(102 + x, 139 + y, 1, 9);
        g2d.fillRect(101 + x, 142 + y, 1, 7);
        g2d.fillRect(105 + x, 143 + y, 1, 3);
        g2d.fillRect(100 + x, 144 + y, 1, 6);
        g2d.fillRect(99 + x, 145 + y, 1, 6);
        g2d.fillRect(98 + x, 146 + y, 1, 5);
        g2d.fillRect(104 + x, 146 + y, 1, 2);
        g2d.fillRect(97 + x, 147 + y, 1, 5);
        g2d.fillRect(96 + x, 148 + y, 1, 4);
        g2d.fillRect(103 + x, 148 + y, 1, 3);
        g2d.fillRect(95 + x, 149 + y, 1, 4);
        g2d.fillRect(94 + x, 150 + y, 1, 4);
        g2d.fillRect(93 + x, 151 + y, 1, 5);
        g2d.fillRect(102 + x, 151 + y, 1, 1);
        g2d.fillRect(92 + x, 152 + y, 1, 5);
        g2d.fillRect(100 + x, 152 + y, 1, 2);
        g2d.fillRect(99 + x, 153 + y, 1, 2);
        g2d.fillRect(91 + x, 154 + y, 1, 5);
        g2d.fillRect(98 + x, 154 + y, 1, 2);
        g2d.fillRect(97 + x, 155 + y, 1, 2);
        g2d.fillRect(100 + x, 155 + y, 1, 1);
        g2d.fillRect(90 + x, 156 + y, 1, 3);
        g2d.fillRect(89 + x, 157 + y, 1, 1);
        g2d.fillRect(96 + x, 157 + y, 1, 2);
        g2d.fillRect(88 + x, 158 + y, 1, 1);
        g2d.fillRect(95 + x, 158 + y, 1, 3);
        g2d.fillRect(99 + x, 158 + y, 1, 1);
        g2d.fillRect(98 + x, 159 + y, 1, 2);
        g2d.fillRect(89 + x, 160 + y, 1, 4);
        g2d.fillRect(94 + x, 160 + y, 1, 3);
        g2d.fillRect(88 + x, 161 + y, 1, 1);
        g2d.fillRect(97 + x, 161 + y, 1, 3);
        g2d.fillRect(93 + x, 162 + y, 1, 7);
        g2d.fillRect(90 + x, 163 + y, 1, 2);
        g2d.fillRect(91 + x, 163 + y, 1, 2);
        g2d.fillRect(92 + x, 163 + y, 1, 6);
        g2d.fillRect(96 + x, 164 + y, 1, 5);
        g2d.fillRect(94 + x, 166 + y, 1, 3);
        g2d.fillRect(89 + x, 167 + y, 3, 1);
        g2d.fillRect(95 + x, 167 + y, 1, 2);
        g2d.fillRect(91 + x, 168 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 3);
        g2d.fillRect(111 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 8);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 4, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 2);
        g2d.fillRect(115 + x, 71 + y, 1, 8);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 4);
        g2d.fillRect(110 + x, 75 + y, 1, 3);
        g2d.fillRect(112 + x, 75 + y, 1, 3);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 3, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 4);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 4);
        g2d.fillRect(107 + x, 93 + y, 1, 3);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 3);
        g2d.fillRect(105 + x, 95 + y, 1, 4);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 97 + y, 1, 4);
        g2d.fillRect(103 + x, 100 + y, 1, 3);
        g2d.fillRect(107 + x, 103 + y, 1, 1);
        g2d.fillRect(106 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(102 + x, 111 + y, 1, 4);
        g2d.fillRect(103 + x, 111 + y, 1, 3);
        g2d.fillRect(107 + x, 111 + y, 1, 2);
        g2d.fillRect(106 + x, 112 + y, 1, 3);
        g2d.fillRect(105 + x, 114 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 2, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 3, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 2, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 4);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 7);
        g2d.fillRect(106 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 70 + y, 1, 4);
        g2d.fillRect(112 + x, 70 + y, 1, 3);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(107 + x, 71 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 5);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(106 + x, 78 + y, 1, 2);
        g2d.fillRect(111 + x, 78 + y, 2, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 2);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 4, 1);
        g2d.fillRect(113 + x, 81 + y, 2, 1);
        g2d.fillRect(101 + x, 82 + y, 3, 1);
        g2d.fillRect(109 + x, 82 + y, 4, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 3);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 7);
        g2d.fillRect(114 + x, 86 + y, 1, 3);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 4);
        g2d.fillRect(115 + x, 89 + y, 1, 4);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(101 + x, 93 + y, 1, 12);
        g2d.fillRect(114 + x, 93 + y, 1, 3);
        g2d.fillRect(103 + x, 95 + y, 2, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 14);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 2);
        g2d.fillRect(111 + x, 101 + y, 1, 3);
        g2d.fillRect(103 + x, 103 + y, 1, 6);
        g2d.fillRect(110 + x, 103 + y, 1, 4);
        g2d.fillRect(104 + x, 104 + y, 1, 17);
        g2d.fillRect(106 + x, 108 + y, 1, 1);
        g2d.fillRect(109 + x, 108 + y, 1, 1);
        g2d.fillRect(105 + x, 109 + y, 1, 3);
        g2d.fillRect(108 + x, 111 + y, 1, 1);
        g2d.fillRect(103 + x, 114 + y, 1, 11);
        g2d.fillRect(102 + x, 115 + y, 1, 4);
        g2d.fillRect(105 + x, 120 + y, 1, 4);
        g2d.fillRect(106 + x, 121 + y, 1, 8);
        g2d.fillRect(108 + x, 123 + y, 1, 6);
        g2d.fillRect(105 + x, 129 + y, 1, 6);
        g2d.fillRect(107 + x, 129 + y, 1, 7);
        g2d.fillRect(106 + x, 135 + y, 1, 8);
        g2d.fillRect(101 + x, 149 + y, 1, 2);
        g2d.fillRect(100 + x, 150 + y, 1, 2);
        g2d.fillRect(98 + x, 151 + y, 1, 3);
        g2d.fillRect(99 + x, 151 + y, 1, 2);
        g2d.fillRect(96 + x, 152 + y, 2, 1);
        g2d.fillRect(102 + x, 152 + y, 1, 2);
        g2d.fillRect(95 + x, 153 + y, 1, 1);
        g2d.fillRect(97 + x, 153 + y, 1, 2);
        g2d.fillRect(94 + x, 154 + y, 1, 1);
        g2d.fillRect(96 + x, 154 + y, 1, 3);
        g2d.fillRect(101 + x, 154 + y, 1, 1);
        g2d.fillRect(93 + x, 156 + y, 1, 1);
        g2d.fillRect(95 + x, 156 + y, 1, 2);
        g2d.fillRect(98 + x, 156 + y, 1, 1);
        g2d.fillRect(100 + x, 156 + y, 1, 1);
        g2d.fillRect(92 + x, 157 + y, 1, 2);
        g2d.fillRect(99 + x, 157 + y, 1, 1);
        g2d.fillRect(89 + x, 158 + y, 1, 1);
        g2d.fillRect(94 + x, 158 + y, 1, 2);
        g2d.fillRect(88 + x, 159 + y, 1, 2);
        g2d.fillRect(91 + x, 159 + y, 1, 1);
        g2d.fillRect(90 + x, 161 + y, 1, 2);
        g2d.fillRect(93 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 2, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 4);
        g2d.fillRect(110 + x, 71 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 3, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 4);
        g2d.fillRect(106 + x, 74 + y, 1, 4);
        g2d.fillRect(108 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 1, 2);
        g2d.fillRect(108 + x, 79 + y, 1, 4);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 3, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 2, 1);
        g2d.fillRect(109 + x, 81 + y, 3, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 82 + y, 1, 2);
        g2d.fillRect(106 + x, 82 + y, 2, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 5);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 4);
        g2d.fillRect(107 + x, 87 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(103 + x, 96 + y, 1, 3);
        g2d.fillRect(107 + x, 96 + y, 1, 3);
        g2d.fillRect(106 + x, 99 + y, 1, 2);
        g2d.fillRect(112 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(110 + x, 100 + y, 1, 3);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 3);
        g2d.fillRect(106 + x, 105 + y, 1, 3);
        g2d.fillRect(109 + x, 105 + y, 1, 2);
        g2d.fillRect(105 + x, 108 + y, 1, 1);
        g2d.fillRect(108 + x, 108 + y, 1, 1);
        g2d.fillRect(107 + x, 113 + y, 1, 1);
        g2d.fillRect(106 + x, 116 + y, 1, 2);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(95 + x, 154 + y, 1, 2);
        g2d.fillRect(94 + x, 155 + y, 1, 3);
        g2d.fillRect(93 + x, 157 + y, 1, 4);
        g2d.fillRect(97 + x, 157 + y, 1, 2);
        g2d.fillRect(89 + x, 159 + y, 2, 1);
        g2d.fillRect(92 + x, 159 + y, 1, 4);
        g2d.fillRect(96 + x, 159 + y, 1, 2);
        g2d.fillRect(90 + x, 160 + y, 2, 1);
        g2d.fillRect(91 + x, 161 + y, 1, 2);
        g2d.fillRect(95 + x, 161 + y, 1, 3);
        g2d.fillRect(94 + x, 163 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 2, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 2, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 2, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 5);
        g2d.fillRect(106 + x, 67 + y, 1, 3);
        g2d.fillRect(109 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 68 + y, 1, 2);
        g2d.fillRect(113 + x, 68 + y, 2, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 2, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 3);
        g2d.fillRect(110 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(109 + x, 101 + y, 1, 3);
        g2d.fillRect(108 + x, 103 + y, 1, 2);
        g2d.fillRect(107 + x, 104 + y, 1, 3);
        g2d.fillRect(109 + x, 107 + y, 1, 1);
        g2d.fillRect(108 + x, 109 + y, 1, 2);
        g2d.fillRect(106 + x, 115 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
    }





    public void paintdlb1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 115 + y, 1, 2);
        g2d.fillRect(111 + x, 116 + y, 1, 4);
        g2d.fillRect(112 + x, 120 + y, 1, 3);
        g2d.fillRect(109 + x, 121 + y, 1, 2);
        g2d.fillRect(113 + x, 123 + y, 1, 10);
        g2d.fillRect(114 + x, 128 + y, 1, 10);
        g2d.fillRect(115 + x, 131 + y, 1, 11);
        g2d.fillRect(116 + x, 134 + y, 1, 12);
        g2d.fillRect(117 + x, 138 + y, 1, 9);
        g2d.fillRect(118 + x, 141 + y, 1, 8);
        g2d.fillRect(119 + x, 145 + y, 1, 4);
        g2d.fillRect(120 + x, 147 + y, 1, 4);
        g2d.fillRect(121 + x, 148 + y, 1, 7);
        g2d.fillRect(122 + x, 149 + y, 1, 3);
        g2d.fillRect(123 + x, 149 + y, 1, 3);
        g2d.fillRect(118 + x, 150 + y, 1, 2);
        g2d.fillRect(119 + x, 151 + y, 1, 2);
        g2d.fillRect(125 + x, 151 + y, 1, 2);
        g2d.fillRect(126 + x, 151 + y, 1, 3);
        g2d.fillRect(120 + x, 152 + y, 1, 2);
        g2d.fillRect(127 + x, 152 + y, 1, 3);
        g2d.fillRect(122 + x, 153 + y, 1, 4);
        g2d.fillRect(128 + x, 154 + y, 1, 2);
        g2d.fillRect(123 + x, 155 + y, 1, 3);
        g2d.fillRect(124 + x, 155 + y, 1, 7);
        g2d.fillRect(129 + x, 155 + y, 1, 2);
        g2d.fillRect(125 + x, 156 + y, 1, 8);
        g2d.fillRect(130 + x, 156 + y, 1, 2);
        g2d.fillRect(131 + x, 156 + y, 1, 4);
        g2d.fillRect(126 + x, 158 + y, 1, 2);
        g2d.fillRect(127 + x, 159 + y, 1, 2);
        g2d.fillRect(123 + x, 160 + y, 1, 1);
        g2d.fillRect(128 + x, 160 + y, 3, 1);
        g2d.fillRect(129 + x, 161 + y, 1, 1);
        g2d.fillRect(128 + x, 162 + y, 1, 5);
        g2d.fillRect(126 + x, 163 + y, 1, 4);
        g2d.fillRect(127 + x, 163 + y, 1, 4);
        g2d.fillRect(129 + x, 164 + y, 1, 3);
        g2d.fillRect(123 + x, 165 + y, 1, 1);
        g2d.fillRect(130 + x, 165 + y, 1, 1);
        g2d.fillRect(124 + x, 166 + y, 1, 2);
        g2d.fillRect(125 + x, 166 + y, 1, 2);
        g2d.fillRect(122 + x, 167 + y, 1, 2);
        g2d.fillRect(123 + x, 167 + y, 1, 1);
        g2d.fillRect(97 + x, 168 + y, 4, 1);
        g2d.fillRect(119 + x, 168 + y, 3, 1);
        g2d.fillRect(101 + x, 169 + y, 18, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 149 + y, 2, 1);
        g2d.fillRect(119 + x, 150 + y, 1, 1);
        g2d.fillRect(124 + x, 150 + y, 1, 3);
        g2d.fillRect(120 + x, 151 + y, 1, 1);
        g2d.fillRect(122 + x, 152 + y, 2, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(123 + x, 153 + y, 1, 2);
        g2d.fillRect(125 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 154 + y, 1, 1);
        g2d.fillRect(121 + x, 155 + y, 1, 2);
        g2d.fillRect(127 + x, 155 + y, 1, 1);
        g2d.fillRect(128 + x, 156 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 2);
        g2d.fillRect(126 + x, 157 + y, 1, 1);
        g2d.fillRect(129 + x, 157 + y, 1, 1);
        g2d.fillRect(120 + x, 158 + y, 1, 1);
        g2d.fillRect(123 + x, 158 + y, 1, 2);
        g2d.fillRect(130 + x, 158 + y, 1, 2);
        g2d.fillRect(129 + x, 159 + y, 1, 1);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 161 + y, 1, 3);
        g2d.fillRect(126 + x, 161 + y, 1, 2);
        g2d.fillRect(128 + x, 161 + y, 1, 1);
        g2d.fillRect(127 + x, 162 + y, 1, 1);
        g2d.fillRect(123 + x, 163 + y, 1, 2);
        g2d.fillRect(124 + x, 165 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(124 + x, 153 + y, 1, 2);
        g2d.fillRect(119 + x, 154 + y, 2, 1);
        g2d.fillRect(125 + x, 154 + y, 1, 2);
        g2d.fillRect(120 + x, 155 + y, 1, 3);
        g2d.fillRect(126 + x, 155 + y, 1, 2);
        g2d.fillRect(127 + x, 156 + y, 1, 3);
        g2d.fillRect(121 + x, 157 + y, 1, 3);
        g2d.fillRect(128 + x, 157 + y, 1, 3);
        g2d.fillRect(129 + x, 158 + y, 1, 1);
        g2d.fillRect(122 + x, 159 + y, 1, 2);
        g2d.fillRect(126 + x, 160 + y, 1, 1);
        g2d.fillRect(123 + x, 161 + y, 1, 2);
        g2d.fillRect(127 + x, 161 + y, 1, 1);
        g2d.fillRect(124 + x, 162 + y, 1, 3);
        g2d.fillRect(125 + x, 164 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(111 + x, 109 + y, 1, 3);
        g2d.fillRect(110 + x, 112 + y, 1, 3);
        g2d.fillRect(109 + x, 115 + y, 1, 4);
        g2d.fillRect(110 + x, 117 + y, 1, 3);
        g2d.fillRect(108 + x, 119 + y, 1, 4);
        g2d.fillRect(111 + x, 120 + y, 1, 3);
        g2d.fillRect(109 + x, 123 + y, 1, 6);
        g2d.fillRect(112 + x, 123 + y, 1, 10);
        g2d.fillRect(108 + x, 129 + y, 1, 7);
        g2d.fillRect(113 + x, 133 + y, 1, 5);
        g2d.fillRect(107 + x, 136 + y, 1, 7);
        g2d.fillRect(114 + x, 138 + y, 1, 5);
        g2d.fillRect(106 + x, 143 + y, 1, 3);
        g2d.fillRect(115 + x, 143 + y, 1, 3);
        g2d.fillRect(105 + x, 146 + y, 1, 3);
        g2d.fillRect(116 + x, 146 + y, 1, 3);
        g2d.fillRect(104 + x, 148 + y, 1, 4);
        g2d.fillRect(117 + x, 149 + y, 1, 3);
        g2d.fillRect(103 + x, 151 + y, 1, 4);
        g2d.fillRect(118 + x, 152 + y, 1, 5);
        g2d.fillRect(102 + x, 154 + y, 1, 2);
        g2d.fillRect(101 + x, 155 + y, 1, 3);
        g2d.fillRect(119 + x, 155 + y, 1, 5);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(99 + x, 159 + y, 1, 3);
        g2d.fillRect(120 + x, 160 + y, 1, 3);
        g2d.fillRect(98 + x, 161 + y, 1, 7);
        g2d.fillRect(121 + x, 162 + y, 1, 3);
        g2d.fillRect(97 + x, 164 + y, 1, 4);
        g2d.fillRect(122 + x, 164 + y, 1, 3);
        g2d.fillRect(99 + x, 166 + y, 1, 2);
        g2d.fillRect(100 + x, 166 + y, 1, 2);
        g2d.fillRect(120 + x, 166 + y, 1, 2);
        g2d.fillRect(121 + x, 166 + y, 1, 2);
        g2d.fillRect(123 + x, 166 + y, 1, 1);
        g2d.fillRect(101 + x, 167 + y, 1, 2);
        g2d.fillRect(102 + x, 167 + y, 1, 2);
        g2d.fillRect(117 + x, 167 + y, 1, 2);
        g2d.fillRect(118 + x, 167 + y, 1, 2);
        g2d.fillRect(119 + x, 167 + y, 1, 1);
        g2d.fillRect(103 + x, 168 + y, 1, 1);
        g2d.fillRect(113 + x, 168 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 4);
        g2d.fillRect(115 + x, 93 + y, 1, 3);
        g2d.fillRect(114 + x, 96 + y, 1, 3);
        g2d.fillRect(113 + x, 99 + y, 1, 2);
        g2d.fillRect(112 + x, 101 + y, 1, 3);
        g2d.fillRect(111 + x, 104 + y, 1, 3);
        g2d.fillRect(110 + x, 107 + y, 1, 2);
        g2d.fillRect(109 + x, 109 + y, 1, 3);
        g2d.fillRect(108 + x, 112 + y, 1, 2);
        g2d.fillRect(107 + x, 114 + y, 1, 4);
        g2d.fillRect(106 + x, 118 + y, 1, 3);
        g2d.fillRect(109 + x, 119 + y, 1, 2);
        g2d.fillRect(110 + x, 120 + y, 1, 24);
        g2d.fillRect(107 + x, 123 + y, 1, 6);
        g2d.fillRect(111 + x, 123 + y, 1, 23);
        g2d.fillRect(106 + x, 129 + y, 1, 6);
        g2d.fillRect(109 + x, 129 + y, 1, 14);
        g2d.fillRect(112 + x, 133 + y, 1, 15);
        g2d.fillRect(105 + x, 135 + y, 1, 8);
        g2d.fillRect(108 + x, 136 + y, 1, 11);
        g2d.fillRect(113 + x, 138 + y, 1, 11);
        g2d.fillRect(115 + x, 142 + y, 1, 1);
        g2d.fillRect(104 + x, 143 + y, 1, 3);
        g2d.fillRect(107 + x, 143 + y, 1, 6);
        g2d.fillRect(114 + x, 143 + y, 1, 8);
        g2d.fillRect(103 + x, 146 + y, 1, 2);
        g2d.fillRect(106 + x, 146 + y, 1, 5);
        g2d.fillRect(115 + x, 146 + y, 1, 6);
        g2d.fillRect(117 + x, 147 + y, 1, 2);
        g2d.fillRect(102 + x, 148 + y, 1, 1);
        g2d.fillRect(105 + x, 149 + y, 1, 3);
        g2d.fillRect(116 + x, 149 + y, 1, 5);
        g2d.fillRect(101 + x, 151 + y, 1, 1);
        g2d.fillRect(104 + x, 152 + y, 1, 5);
        g2d.fillRect(117 + x, 152 + y, 1, 3);
        g2d.fillRect(113 + x, 153 + y, 1, 15);
        g2d.fillRect(109 + x, 154 + y, 1, 15);
        g2d.fillRect(103 + x, 155 + y, 1, 4);
        g2d.fillRect(108 + x, 155 + y, 1, 14);
        g2d.fillRect(114 + x, 155 + y, 1, 13);
        g2d.fillRect(102 + x, 156 + y, 1, 5);
        g2d.fillRect(110 + x, 156 + y, 1, 13);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(107 + x, 157 + y, 1, 12);
        g2d.fillRect(112 + x, 157 + y, 1, 12);
        g2d.fillRect(115 + x, 157 + y, 1, 11);
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 4);
        g2d.fillRect(106 + x, 158 + y, 1, 11);
        g2d.fillRect(116 + x, 158 + y, 1, 10);
        g2d.fillRect(97 + x, 159 + y, 1, 2);
        g2d.fillRect(105 + x, 159 + y, 1, 10);
        g2d.fillRect(120 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 160 + y, 1, 2);
        g2d.fillRect(104 + x, 160 + y, 1, 9);
        g2d.fillRect(111 + x, 160 + y, 1, 9);
        g2d.fillRect(117 + x, 160 + y, 1, 7);
        g2d.fillRect(96 + x, 161 + y, 1, 3);
        g2d.fillRect(99 + x, 162 + y, 1, 4);
        g2d.fillRect(118 + x, 162 + y, 1, 5);
        g2d.fillRect(103 + x, 163 + y, 1, 5);
        g2d.fillRect(119 + x, 163 + y, 1, 4);
        g2d.fillRect(95 + x, 164 + y, 1, 3);
        g2d.fillRect(100 + x, 164 + y, 1, 2);
        g2d.fillRect(102 + x, 164 + y, 1, 3);
        g2d.fillRect(101 + x, 165 + y, 1, 2);
        g2d.fillRect(120 + x, 165 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 143 + y, 1, 11);
        g2d.fillRect(110 + x, 144 + y, 1, 12);
        g2d.fillRect(111 + x, 146 + y, 1, 14);
        g2d.fillRect(108 + x, 147 + y, 1, 8);
        g2d.fillRect(112 + x, 148 + y, 1, 9);
        g2d.fillRect(102 + x, 149 + y, 1, 2);
        g2d.fillRect(107 + x, 149 + y, 1, 8);
        g2d.fillRect(113 + x, 149 + y, 1, 4);
        g2d.fillRect(106 + x, 151 + y, 1, 7);
        g2d.fillRect(114 + x, 151 + y, 1, 4);
        g2d.fillRect(101 + x, 152 + y, 1, 2);
        g2d.fillRect(105 + x, 152 + y, 1, 7);
        g2d.fillRect(115 + x, 152 + y, 1, 5);
        g2d.fillRect(100 + x, 154 + y, 1, 1);
        g2d.fillRect(116 + x, 154 + y, 1, 4);
        g2d.fillRect(99 + x, 155 + y, 1, 2);
        g2d.fillRect(117 + x, 155 + y, 1, 5);
        g2d.fillRect(104 + x, 157 + y, 1, 3);
        g2d.fillRect(118 + x, 158 + y, 1, 4);
        g2d.fillRect(103 + x, 159 + y, 1, 4);
        g2d.fillRect(119 + x, 160 + y, 1, 3);
        g2d.fillRect(102 + x, 161 + y, 1, 3);
        g2d.fillRect(100 + x, 162 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 1, 3);
        g2d.fillRect(120 + x, 163 + y, 1, 2);
    }
}
