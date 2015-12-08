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
public class D30 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D30()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 8;
    }

    public D30(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 8;
    }

    public D30(String middle, ColorArray colorSwitch)
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
        paintTL(x,0,g2d);
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

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(99 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 47 + y, 1, 5);
        g2d.fillRect(102 + x, 47 + y, 2, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 4);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 49 + y, 1, 7);
        g2d.fillRect(119 + x, 50 + y, 1, 9);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 4);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 2, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 4, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(116 + x, 47 + y, 1, 12);
        g2d.fillRect(102 + x, 48 + y, 1, 9);
        g2d.fillRect(103 + x, 48 + y, 1, 10);
        g2d.fillRect(104 + x, 49 + y, 1, 10);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 7);
        g2d.fillRect(118 + x, 51 + y, 1, 7);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(101 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 52 + y, 1, 5);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 6);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 3);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(114 + x, 48 + y, 1, 3);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 3);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 4);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 48 + y, 1, 1);
        g2d.fillRect(107 + x, 48 + y, 1, 2);
        g2d.fillRect(105 + x, 50 + y, 2, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(109 + x, 54 + y, 4, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 2, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 2, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 47 + y, 2, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 2, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 60 + y, 2, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 2);
        g2d.fillRect(113 + x, 126 + y, 1, 3);
        g2d.fillRect(106 + x, 128 + y, 1, 1);
        g2d.fillRect(114 + x, 130 + y, 1, 2);
        g2d.fillRect(105 + x, 133 + y, 1, 3);
        g2d.fillRect(114 + x, 133 + y, 1, 2);
        g2d.fillRect(115 + x, 133 + y, 1, 4);
        g2d.fillRect(104 + x, 135 + y, 1, 1);
        g2d.fillRect(104 + x, 137 + y, 1, 7);
        g2d.fillRect(116 + x, 142 + y, 1, 4);
        g2d.fillRect(117 + x, 146 + y, 1, 1);
        g2d.fillRect(104 + x, 148 + y, 1, 3);
        g2d.fillRect(117 + x, 148 + y, 1, 2);
        g2d.fillRect(118 + x, 150 + y, 1, 7);
        g2d.fillRect(103 + x, 153 + y, 1, 1);
        g2d.fillRect(103 + x, 158 + y, 1, 4);
        g2d.fillRect(118 + x, 158 + y, 1, 2);
        g2d.fillRect(102 + x, 160 + y, 1, 1);
        g2d.fillRect(119 + x, 160 + y, 1, 5);
        g2d.fillRect(102 + x, 162 + y, 1, 5);
        g2d.fillRect(118 + x, 165 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 4);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(116 + x, 45 + y, 1, 3);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 3, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 3);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 5);
        g2d.fillRect(105 + x, 64 + y, 1, 9);
        g2d.fillRect(104 + x, 65 + y, 1, 10);
        g2d.fillRect(116 + x, 65 + y, 1, 4);
        g2d.fillRect(103 + x, 66 + y, 1, 19);
        g2d.fillRect(117 + x, 67 + y, 1, 4);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(119 + x, 71 + y, 1, 6);
        g2d.fillRect(102 + x, 72 + y, 1, 21);
        g2d.fillRect(101 + x, 75 + y, 1, 29);
        g2d.fillRect(120 + x, 77 + y, 1, 9);
        g2d.fillRect(104 + x, 78 + y, 1, 5);
        g2d.fillRect(100 + x, 80 + y, 1, 28);
        g2d.fillRect(121 + x, 83 + y, 1, 32);
        g2d.fillRect(99 + x, 85 + y, 1, 26);
        g2d.fillRect(98 + x, 103 + y, 1, 8);
        g2d.fillRect(97 + x, 108 + y, 1, 7);
        g2d.fillRect(120 + x, 108 + y, 1, 18);
        g2d.fillRect(96 + x, 111 + y, 1, 4);
        g2d.fillRect(105 + x, 114 + y, 1, 1);
        g2d.fillRect(95 + x, 115 + y, 1, 15);
        g2d.fillRect(96 + x, 116 + y, 1, 12);
        g2d.fillRect(97 + x, 116 + y, 1, 7);
        g2d.fillRect(111 + x, 116 + y, 1, 14);
        g2d.fillRect(106 + x, 118 + y, 1, 1);
        g2d.fillRect(94 + x, 119 + y, 1, 13);
        g2d.fillRect(107 + x, 119 + y, 1, 10);
        g2d.fillRect(110 + x, 119 + y, 1, 4);
        g2d.fillRect(106 + x, 121 + y, 1, 7);
        g2d.fillRect(112 + x, 121 + y, 1, 2);
        g2d.fillRect(121 + x, 121 + y, 1, 9);
        g2d.fillRect(93 + x, 123 + y, 1, 13);
        g2d.fillRect(113 + x, 123 + y, 1, 3);
        g2d.fillRect(112 + x, 125 + y, 1, 3);
        g2d.fillRect(110 + x, 126 + y, 1, 2);
        g2d.fillRect(114 + x, 126 + y, 1, 4);
        g2d.fillRect(122 + x, 126 + y, 1, 9);
        g2d.fillRect(92 + x, 128 + y, 1, 18);
        g2d.fillRect(105 + x, 128 + y, 1, 5);
        g2d.fillRect(104 + x, 129 + y, 1, 6);
        g2d.fillRect(106 + x, 129 + y, 1, 14);
        g2d.fillRect(112 + x, 129 + y, 1, 4);
        g2d.fillRect(113 + x, 129 + y, 1, 4);
        g2d.fillRect(91 + x, 130 + y, 1, 17);
        g2d.fillRect(114 + x, 132 + y, 2, 1);
        g2d.fillRect(113 + x, 135 + y, 1, 2);
        g2d.fillRect(114 + x, 135 + y, 1, 5);
        g2d.fillRect(123 + x, 135 + y, 1, 4);
        g2d.fillRect(90 + x, 136 + y, 1, 18);
        g2d.fillRect(104 + x, 136 + y, 2, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 6);
        g2d.fillRect(105 + x, 137 + y, 1, 11);
        g2d.fillRect(115 + x, 137 + y, 1, 18);
        g2d.fillRect(103 + x, 139 + y, 1, 14);
        g2d.fillRect(124 + x, 139 + y, 1, 8);
        g2d.fillRect(89 + x, 140 + y, 1, 18);
        g2d.fillRect(113 + x, 140 + y, 1, 3);
        g2d.fillRect(114 + x, 142 + y, 1, 1);
        g2d.fillRect(117 + x, 143 + y, 1, 3);
        g2d.fillRect(104 + x, 144 + y, 1, 4);
        g2d.fillRect(106 + x, 144 + y, 1, 3);
        g2d.fillRect(114 + x, 144 + y, 1, 7);
        g2d.fillRect(88 + x, 146 + y, 1, 15);
        g2d.fillRect(116 + x, 146 + y, 1, 2);
        g2d.fillRect(118 + x, 146 + y, 1, 4);
        g2d.fillRect(125 + x, 146 + y, 1, 8);
        g2d.fillRect(117 + x, 147 + y, 1, 1);
        g2d.fillRect(87 + x, 150 + y, 1, 15);
        g2d.fillRect(105 + x, 150 + y, 1, 4);
        g2d.fillRect(116 + x, 150 + y, 1, 10);
        g2d.fillRect(117 + x, 150 + y, 1, 14);
        g2d.fillRect(104 + x, 151 + y, 1, 11);
        g2d.fillRect(106 + x, 151 + y, 1, 2);
        g2d.fillRect(107 + x, 151 + y, 1, 2);
        g2d.fillRect(103 + x, 154 + y, 1, 4);
        g2d.fillRect(126 + x, 154 + y, 1, 13);
        g2d.fillRect(86 + x, 155 + y, 1, 13);
        g2d.fillRect(102 + x, 155 + y, 1, 5);
        g2d.fillRect(105 + x, 155 + y, 1, 9);
        g2d.fillRect(107 + x, 155 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 12);
        g2d.fillRect(118 + x, 157 + y, 2, 1);
        g2d.fillRect(107 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 1, 2);
        g2d.fillRect(85 + x, 160 + y, 1, 9);
        g2d.fillRect(118 + x, 160 + y, 1, 5);
        g2d.fillRect(102 + x, 161 + y, 1, 1);
        g2d.fillRect(116 + x, 161 + y, 1, 3);
        g2d.fillRect(103 + x, 162 + y, 1, 7);
        g2d.fillRect(104 + x, 164 + y, 1, 4);
        g2d.fillRect(106 + x, 164 + y, 1, 4);
        g2d.fillRect(107 + x, 164 + y, 1, 1);
        g2d.fillRect(127 + x, 164 + y, 1, 3);
        g2d.fillRect(105 + x, 165 + y, 1, 2);
        g2d.fillRect(117 + x, 165 + y, 1, 3);
        g2d.fillRect(119 + x, 165 + y, 1, 4);
        g2d.fillRect(102 + x, 167 + y, 1, 2);
        g2d.fillRect(84 + x, 168 + y, 1, 1);
        g2d.fillRect(118 + x, 168 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 44 + y, 2, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 4);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 3);
        g2d.fillRect(114 + x, 62 + y, 1, 4);
        g2d.fillRect(107 + x, 64 + y, 1, 8);
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 1, 6);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 14);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 69 + y, 1, 5);
        g2d.fillRect(113 + x, 71 + y, 2, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 7);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 4);
        g2d.fillRect(105 + x, 73 + y, 1, 18);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 73 + y, 1, 2);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 49);
        g2d.fillRect(104 + x, 75 + y, 1, 3);
        g2d.fillRect(110 + x, 76 + y, 1, 3);
        g2d.fillRect(111 + x, 76 + y, 3, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 3);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(109 + x, 77 + y, 1, 5);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 48);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 5);
        g2d.fillRect(117 + x, 82 + y, 1, 21);
        g2d.fillRect(104 + x, 83 + y, 1, 8);
        g2d.fillRect(103 + x, 85 + y, 1, 23);
        g2d.fillRect(116 + x, 85 + y, 1, 8);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 3, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 22);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 4);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 3);
        g2d.fillRect(111 + x, 91 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 93 + y, 1, 17);
        g2d.fillRect(104 + x, 93 + y, 1, 11);
        g2d.fillRect(108 + x, 93 + y, 1, 4);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 96 + y, 1, 2);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 3);
        g2d.fillRect(110 + x, 97 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 3);
        g2d.fillRect(107 + x, 98 + y, 1, 2);
        g2d.fillRect(113 + x, 98 + y, 1, 5);
        g2d.fillRect(115 + x, 98 + y, 1, 5);
        g2d.fillRect(116 + x, 98 + y, 1, 3);
        g2d.fillRect(108 + x, 100 + y, 1, 3);
        g2d.fillRect(107 + x, 101 + y, 1, 3);
        g2d.fillRect(112 + x, 101 + y, 1, 3);
        g2d.fillRect(106 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 12);
        g2d.fillRect(101 + x, 104 + y, 1, 12);
        g2d.fillRect(113 + x, 104 + y, 1, 4);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 5);
        g2d.fillRect(105 + x, 105 + y, 1, 2);
        g2d.fillRect(106 + x, 105 + y, 1, 2);
        g2d.fillRect(112 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 2);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 3);
        g2d.fillRect(100 + x, 108 + y, 1, 14);
        g2d.fillRect(107 + x, 108 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 1, 2);
        g2d.fillRect(109 + x, 108 + y, 1, 2);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(117 + x, 108 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(98 + x, 111 + y, 1, 21);
        g2d.fillRect(99 + x, 111 + y, 1, 18);
        g2d.fillRect(102 + x, 111 + y, 1, 3);
        g2d.fillRect(103 + x, 111 + y, 1, 3);
        g2d.fillRect(104 + x, 111 + y, 1, 3);
        g2d.fillRect(107 + x, 111 + y, 1, 1);
        g2d.fillRect(110 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 2, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 8);
        g2d.fillRect(105 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 3);
        g2d.fillRect(106 + x, 114 + y, 1, 4);
        g2d.fillRect(107 + x, 114 + y, 1, 2);
        g2d.fillRect(110 + x, 114 + y, 1, 2);
        g2d.fillRect(112 + x, 114 + y, 1, 7);
        g2d.fillRect(96 + x, 115 + y, 2, 1);
        g2d.fillRect(102 + x, 115 + y, 1, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 13);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(113 + x, 115 + y, 1, 8);
        g2d.fillRect(108 + x, 116 + y, 1, 26);
        g2d.fillRect(101 + x, 118 + y, 1, 3);
        g2d.fillRect(104 + x, 118 + y, 1, 11);
        g2d.fillRect(107 + x, 118 + y, 1, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 1);
        g2d.fillRect(106 + x, 119 + y, 1, 2);
        g2d.fillRect(114 + x, 119 + y, 1, 7);
        g2d.fillRect(103 + x, 121 + y, 1, 1);
        g2d.fillRect(109 + x, 122 + y, 1, 4);
        g2d.fillRect(115 + x, 122 + y, 1, 1);
        g2d.fillRect(97 + x, 123 + y, 1, 9);
        g2d.fillRect(100 + x, 123 + y, 1, 2);
        g2d.fillRect(101 + x, 123 + y, 1, 5);
        g2d.fillRect(103 + x, 123 + y, 1, 16);
        g2d.fillRect(110 + x, 123 + y, 1, 3);
        g2d.fillRect(116 + x, 123 + y, 1, 3);
        g2d.fillRect(118 + x, 123 + y, 1, 2);
        g2d.fillRect(102 + x, 125 + y, 1, 1);
        g2d.fillRect(115 + x, 126 + y, 1, 6);
        g2d.fillRect(117 + x, 126 + y, 1, 2);
        g2d.fillRect(119 + x, 126 + y, 1, 2);
        g2d.fillRect(120 + x, 126 + y, 1, 4);
        g2d.fillRect(96 + x, 128 + y, 1, 14);
        g2d.fillRect(102 + x, 128 + y, 1, 1);
        g2d.fillRect(109 + x, 128 + y, 1, 4);
        g2d.fillRect(112 + x, 128 + y, 1, 1);
        g2d.fillRect(107 + x, 129 + y, 1, 22);
        g2d.fillRect(110 + x, 129 + y, 1, 1);
        g2d.fillRect(116 + x, 129 + y, 1, 7);
        g2d.fillRect(95 + x, 130 + y, 1, 21);
        g2d.fillRect(99 + x, 130 + y, 1, 2);
        g2d.fillRect(111 + x, 130 + y, 1, 7);
        g2d.fillRect(121 + x, 130 + y, 1, 9);
        g2d.fillRect(94 + x, 132 + y, 1, 21);
        g2d.fillRect(102 + x, 132 + y, 1, 23);
        g2d.fillRect(101 + x, 133 + y, 1, 7);
        g2d.fillRect(109 + x, 133 + y, 1, 7);
        g2d.fillRect(112 + x, 133 + y, 1, 21);
        g2d.fillRect(113 + x, 133 + y, 1, 2);
        g2d.fillRect(117 + x, 133 + y, 1, 10);
        g2d.fillRect(98 + x, 135 + y, 1, 1);
        g2d.fillRect(122 + x, 135 + y, 1, 9);
        g2d.fillRect(93 + x, 136 + y, 1, 17);
        g2d.fillRect(98 + x, 137 + y, 1, 3);
        g2d.fillRect(99 + x, 137 + y, 1, 2);
        g2d.fillRect(113 + x, 137 + y, 1, 3);
        g2d.fillRect(118 + x, 137 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 1);
        g2d.fillRect(123 + x, 139 + y, 1, 8);
        g2d.fillRect(99 + x, 140 + y, 1, 2);
        g2d.fillRect(110 + x, 140 + y, 1, 2);
        g2d.fillRect(114 + x, 140 + y, 1, 2);
        g2d.fillRect(109 + x, 142 + y, 1, 1);
        g2d.fillRect(118 + x, 142 + y, 1, 4);
        g2d.fillRect(99 + x, 143 + y, 1, 3);
        g2d.fillRect(100 + x, 143 + y, 1, 1);
        g2d.fillRect(106 + x, 143 + y, 1, 1);
        g2d.fillRect(108 + x, 143 + y, 1, 25);
        g2d.fillRect(113 + x, 143 + y, 1, 15);
        g2d.fillRect(114 + x, 143 + y, 1, 1);
        g2d.fillRect(101 + x, 144 + y, 1, 13);
        g2d.fillRect(120 + x, 144 + y, 1, 2);
        g2d.fillRect(92 + x, 146 + y, 1, 8);
        g2d.fillRect(98 + x, 146 + y, 1, 1);
        g2d.fillRect(111 + x, 146 + y, 1, 1);
        g2d.fillRect(119 + x, 146 + y, 1, 11);
        g2d.fillRect(91 + x, 147 + y, 1, 11);
        g2d.fillRect(99 + x, 147 + y, 1, 22);
        g2d.fillRect(100 + x, 147 + y, 1, 22);
        g2d.fillRect(106 + x, 147 + y, 1, 4);
        g2d.fillRect(122 + x, 147 + y, 1, 3);
        g2d.fillRect(124 + x, 147 + y, 1, 7);
        g2d.fillRect(98 + x, 148 + y, 1, 21);
        g2d.fillRect(105 + x, 148 + y, 1, 2);
        g2d.fillRect(109 + x, 148 + y, 1, 3);
        g2d.fillRect(116 + x, 148 + y, 1, 2);
        g2d.fillRect(121 + x, 150 + y, 1, 19);
        g2d.fillRect(97 + x, 151 + y, 1, 16);
        g2d.fillRect(111 + x, 151 + y, 1, 3);
        g2d.fillRect(114 + x, 151 + y, 1, 17);
        g2d.fillRect(120 + x, 151 + y, 1, 3);
        g2d.fillRect(95 + x, 153 + y, 1, 1);
        g2d.fillRect(106 + x, 153 + y, 1, 11);
        g2d.fillRect(107 + x, 153 + y, 1, 2);
        g2d.fillRect(90 + x, 154 + y, 1, 14);
        g2d.fillRect(93 + x, 154 + y, 2, 1);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(122 + x, 154 + y, 1, 15);
        g2d.fillRect(125 + x, 154 + y, 1, 6);
        g2d.fillRect(94 + x, 155 + y, 1, 2);
        g2d.fillRect(111 + x, 155 + y, 1, 2);
        g2d.fillRect(112 + x, 155 + y, 1, 2);
        g2d.fillRect(115 + x, 155 + y, 1, 13);
        g2d.fillRect(120 + x, 155 + y, 1, 14);
        g2d.fillRect(93 + x, 157 + y, 1, 11);
        g2d.fillRect(107 + x, 157 + y, 1, 1);
        g2d.fillRect(89 + x, 158 + y, 1, 11);
        g2d.fillRect(92 + x, 158 + y, 1, 6);
        g2d.fillRect(96 + x, 158 + y, 1, 9);
        g2d.fillRect(111 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 158 + y, 1, 2);
        g2d.fillRect(91 + x, 160 + y, 1, 8);
        g2d.fillRect(95 + x, 160 + y, 1, 7);
        g2d.fillRect(107 + x, 160 + y, 1, 4);
        g2d.fillRect(112 + x, 160 + y, 2, 1);
        g2d.fillRect(116 + x, 160 + y, 1, 1);
        g2d.fillRect(88 + x, 161 + y, 1, 8);
        g2d.fillRect(113 + x, 161 + y, 1, 7);
        g2d.fillRect(123 + x, 161 + y, 1, 8);
        g2d.fillRect(125 + x, 161 + y, 1, 3);
        g2d.fillRect(104 + x, 162 + y, 1, 2);
        g2d.fillRect(111 + x, 162 + y, 1, 3);
        g2d.fillRect(105 + x, 164 + y, 1, 1);
        g2d.fillRect(109 + x, 164 + y, 1, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 5);
        g2d.fillRect(117 + x, 164 + y, 1, 1);
        g2d.fillRect(87 + x, 165 + y, 1, 4);
        g2d.fillRect(94 + x, 165 + y, 1, 2);
        g2d.fillRect(107 + x, 165 + y, 1, 3);
        g2d.fillRect(110 + x, 165 + y, 1, 2);
        g2d.fillRect(92 + x, 167 + y, 1, 1);
        g2d.fillRect(105 + x, 167 + y, 1, 1);
        g2d.fillRect(112 + x, 167 + y, 1, 1);
        g2d.fillRect(86 + x, 168 + y, 1, 1);
        g2d.fillRect(117 + x, 168 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 10);
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 4);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 3);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 70 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 6);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 2);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(107 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 75 + y, 1, 18);
        g2d.fillRect(114 + x, 76 + y, 1, 13);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 7);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 7);
        g2d.fillRect(110 + x, 79 + y, 3, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(106 + x, 82 + y, 1, 5);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 12);
        g2d.fillRect(110 + x, 83 + y, 1, 3);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 3);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 6);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 7);
        g2d.fillRect(109 + x, 91 + y, 1, 3);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 93 + y, 1, 5);
        g2d.fillRect(116 + x, 93 + y, 1, 3);
        g2d.fillRect(106 + x, 94 + y, 1, 4);
        g2d.fillRect(110 + x, 94 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 1, 2);
        g2d.fillRect(114 + x, 94 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 97 + y, 1, 3);
        g2d.fillRect(112 + x, 97 + y, 1, 3);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 6);
        g2d.fillRect(105 + x, 100 + y, 1, 5);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(106 + x, 101 + y, 1, 2);
        g2d.fillRect(111 + x, 101 + y, 1, 2);
        g2d.fillRect(116 + x, 101 + y, 1, 2);
        g2d.fillRect(108 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 4);
        g2d.fillRect(117 + x, 103 + y, 1, 2);
        g2d.fillRect(104 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 104 + y, 2, 1);
        g2d.fillRect(109 + x, 104 + y, 1, 3);
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 105 + y, 1, 3);
        g2d.fillRect(114 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 107 + y, 1, 4);
        g2d.fillRect(106 + x, 107 + y, 1, 7);
        g2d.fillRect(108 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(103 + x, 108 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 108 + y, 1, 7);
        g2d.fillRect(102 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 110 + y, 1, 1);
        g2d.fillRect(107 + x, 110 + y, 1, 1);
        g2d.fillRect(110 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 2, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(108 + x, 111 + y, 1, 5);
        g2d.fillRect(109 + x, 111 + y, 1, 3);
        g2d.fillRect(107 + x, 112 + y, 1, 2);
        g2d.fillRect(110 + x, 112 + y, 1, 2);
        g2d.fillRect(111 + x, 112 + y, 1, 3);
        g2d.fillRect(102 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(104 + x, 115 + y, 1, 3);
        g2d.fillRect(109 + x, 115 + y, 1, 7);
        g2d.fillRect(115 + x, 115 + y, 2, 1);
        g2d.fillRect(101 + x, 116 + y, 1, 2);
        g2d.fillRect(103 + x, 116 + y, 1, 5);
        g2d.fillRect(110 + x, 116 + y, 1, 2);
        g2d.fillRect(114 + x, 116 + y, 1, 3);
        g2d.fillRect(116 + x, 116 + y, 1, 2);
        g2d.fillRect(115 + x, 119 + y, 1, 3);
        g2d.fillRect(101 + x, 121 + y, 1, 2);
        g2d.fillRect(100 + x, 122 + y, 1, 1);
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 123 + y, 1, 3);
        g2d.fillRect(100 + x, 125 + y, 1, 3);
        g2d.fillRect(117 + x, 125 + y, 2, 1);
        g2d.fillRect(116 + x, 126 + y, 1, 3);
        g2d.fillRect(118 + x, 126 + y, 1, 11);
        g2d.fillRect(101 + x, 128 + y, 1, 1);
        g2d.fillRect(99 + x, 129 + y, 1, 1);
        g2d.fillRect(102 + x, 129 + y, 1, 3);
        g2d.fillRect(117 + x, 129 + y, 1, 4);
        g2d.fillRect(110 + x, 130 + y, 1, 2);
        g2d.fillRect(119 + x, 130 + y, 1, 2);
        g2d.fillRect(97 + x, 132 + y, 1, 11);
        g2d.fillRect(98 + x, 132 + y, 1, 3);
        g2d.fillRect(100 + x, 132 + y, 2, 1);
        g2d.fillRect(99 + x, 133 + y, 1, 2);
        g2d.fillRect(110 + x, 133 + y, 1, 3);
        g2d.fillRect(98 + x, 136 + y, 2, 1);
        g2d.fillRect(119 + x, 136 + y, 1, 3);
        g2d.fillRect(111 + x, 137 + y, 1, 9);
        g2d.fillRect(100 + x, 140 + y, 1, 3);
        g2d.fillRect(101 + x, 140 + y, 1, 4);
        g2d.fillRect(118 + x, 140 + y, 1, 2);
        g2d.fillRect(119 + x, 140 + y, 1, 2);
        g2d.fillRect(96 + x, 142 + y, 1, 4);
        g2d.fillRect(99 + x, 142 + y, 1, 1);
        g2d.fillRect(120 + x, 142 + y, 1, 2);
        g2d.fillRect(109 + x, 143 + y, 1, 3);
        g2d.fillRect(119 + x, 143 + y, 1, 3);
        g2d.fillRect(98 + x, 144 + y, 1, 2);
        g2d.fillRect(100 + x, 144 + y, 1, 3);
        g2d.fillRect(97 + x, 146 + y, 1, 5);
        g2d.fillRect(99 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 147 + y, 1, 1);
        g2d.fillRect(110 + x, 147 + y, 2, 1);
        g2d.fillRect(120 + x, 147 + y, 1, 4);
        g2d.fillRect(111 + x, 148 + y, 1, 3);
        g2d.fillRect(96 + x, 151 + y, 1, 7);
        g2d.fillRect(93 + x, 153 + y, 2, 1);
        g2d.fillRect(92 + x, 154 + y, 1, 4);
        g2d.fillRect(109 + x, 154 + y, 1, 1);
        g2d.fillRect(111 + x, 154 + y, 2, 1);
        g2d.fillRect(120 + x, 154 + y, 1, 1);
        g2d.fillRect(93 + x, 155 + y, 1, 2);
        g2d.fillRect(95 + x, 157 + y, 1, 3);
        g2d.fillRect(110 + x, 157 + y, 1, 4);
        g2d.fillRect(112 + x, 157 + y, 1, 3);
        g2d.fillRect(91 + x, 158 + y, 1, 2);
        g2d.fillRect(113 + x, 158 + y, 1, 2);
        g2d.fillRect(112 + x, 161 + y, 1, 6);
        g2d.fillRect(94 + x, 162 + y, 1, 2);
        g2d.fillRect(92 + x, 165 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 9);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 5);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 73 + y, 2, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 1, 2);
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 76 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 4);
        g2d.fillRect(110 + x, 87 + y, 1, 7);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 1, 4);
        g2d.fillRect(109 + x, 94 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 2, 1);
        g2d.fillRect(113 + x, 96 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 4);
        g2d.fillRect(109 + x, 98 + y, 1, 6);
        g2d.fillRect(110 + x, 98 + y, 1, 2);
        g2d.fillRect(112 + x, 100 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 9);
        g2d.fillRect(111 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 1);
        g2d.fillRect(108 + x, 105 + y, 1, 2);
        g2d.fillRect(111 + x, 105 + y, 1, 2);
        g2d.fillRect(109 + x, 107 + y, 1, 1);
        g2d.fillRect(108 + x, 110 + y, 2, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 4);
        g2d.fillRect(105 + x, 111 + y, 1, 1);
        g2d.fillRect(111 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(103 + x, 114 + y, 1, 2);
        g2d.fillRect(104 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(102 + x, 116 + y, 1, 9);
        g2d.fillRect(107 + x, 116 + y, 1, 2);
        g2d.fillRect(115 + x, 116 + y, 1, 3);
        g2d.fillRect(116 + x, 118 + y, 1, 5);
        g2d.fillRect(117 + x, 119 + y, 1, 6);
        g2d.fillRect(118 + x, 122 + y, 1, 1);
        g2d.fillRect(119 + x, 125 + y, 1, 1);
        g2d.fillRect(102 + x, 126 + y, 1, 2);
        g2d.fillRect(109 + x, 126 + y, 1, 2);
        g2d.fillRect(100 + x, 128 + y, 1, 4);
        g2d.fillRect(110 + x, 128 + y, 1, 1);
        g2d.fillRect(117 + x, 128 + y, 1, 1);
        g2d.fillRect(119 + x, 128 + y, 1, 2);
        g2d.fillRect(101 + x, 129 + y, 1, 3);
        g2d.fillRect(120 + x, 130 + y, 1, 12);
        g2d.fillRect(99 + x, 132 + y, 1, 1);
        g2d.fillRect(109 + x, 132 + y, 2, 1);
        g2d.fillRect(119 + x, 132 + y, 1, 4);
        g2d.fillRect(100 + x, 133 + y, 1, 6);
        g2d.fillRect(99 + x, 135 + y, 1, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 4);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 1);
        g2d.fillRect(121 + x, 139 + y, 1, 11);
        g2d.fillRect(98 + x, 140 + y, 1, 4);
        g2d.fillRect(109 + x, 140 + y, 1, 2);
        g2d.fillRect(108 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 142 + y, 1, 5);
        g2d.fillRect(119 + x, 142 + y, 1, 1);
        g2d.fillRect(97 + x, 143 + y, 1, 3);
        g2d.fillRect(122 + x, 144 + y, 1, 3);
        g2d.fillRect(96 + x, 146 + y, 1, 1);
        g2d.fillRect(109 + x, 146 + y, 1, 2);
        g2d.fillRect(120 + x, 146 + y, 1, 1);
        g2d.fillRect(123 + x, 147 + y, 1, 11);
        g2d.fillRect(96 + x, 148 + y, 1, 3);
        g2d.fillRect(110 + x, 148 + y, 1, 9);
        g2d.fillRect(122 + x, 150 + y, 1, 4);
        g2d.fillRect(95 + x, 151 + y, 1, 2);
        g2d.fillRect(109 + x, 151 + y, 1, 3);
        g2d.fillRect(95 + x, 154 + y, 1, 3);
        g2d.fillRect(124 + x, 154 + y, 1, 14);
        g2d.fillRect(109 + x, 155 + y, 1, 9);
        g2d.fillRect(94 + x, 157 + y, 1, 5);
        g2d.fillRect(111 + x, 157 + y, 1, 1);
        g2d.fillRect(111 + x, 160 + y, 1, 2);
        g2d.fillRect(123 + x, 160 + y, 1, 1);
        g2d.fillRect(125 + x, 160 + y, 1, 1);
        g2d.fillRect(110 + x, 161 + y, 1, 4);
        g2d.fillRect(92 + x, 164 + y, 1, 1);
        g2d.fillRect(94 + x, 164 + y, 1, 1);
        g2d.fillRect(125 + x, 164 + y, 1, 4);
        g2d.fillRect(109 + x, 165 + y, 1, 3);
        g2d.fillRect(111 + x, 165 + y, 1, 3);
        g2d.fillRect(110 + x, 167 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(116 + x, 43 + y, 1, 2);
        g2d.fillRect(103 + x, 44 + y, 1, 2);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 1);
    }
}
