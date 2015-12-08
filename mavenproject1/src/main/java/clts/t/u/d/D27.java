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
public class D27 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D27()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 4;
        noWalk = true;
    }

    public D27(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 4;
        noWalk = true;
    }

    public D27(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 4;
        noWalk = true;
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

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 5, 1);
        g2d.fillRect(114 + x, 57 + y, 6, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 49 + y, 1, 5);
        g2d.fillRect(100 + x, 50 + y, 1, 7);
        g2d.fillRect(119 + x, 50 + y, 1, 4);
        g2d.fillRect(117 + x, 51 + y, 1, 3);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(101 + x, 52 + y, 1, 5);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 13, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 56 + y, 6, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 3, 1);
        g2d.fillRect(101 + x, 58 + y, 3, 1);
        g2d.fillRect(113 + x, 58 + y, 5, 1);
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 16, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 3);
        g2d.fillRect(118 + x, 54 + y, 2, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 3, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 52 + y, 14, 1);
        g2d.fillRect(104 + x, 54 + y, 14, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 8, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(101 + x, 76 + y, 1, 4);
        g2d.fillRect(120 + x, 78 + y, 1, 4);
        g2d.fillRect(100 + x, 80 + y, 1, 11);
        g2d.fillRect(121 + x, 82 + y, 1, 16);
        g2d.fillRect(101 + x, 91 + y, 1, 8);
        g2d.fillRect(120 + x, 98 + y, 1, 9);
        g2d.fillRect(102 + x, 99 + y, 1, 4);
        g2d.fillRect(103 + x, 103 + y, 1, 9);
        g2d.fillRect(119 + x, 107 + y, 1, 8);
        g2d.fillRect(102 + x, 112 + y, 1, 23);
        g2d.fillRect(120 + x, 115 + y, 1, 3);
        g2d.fillRect(121 + x, 118 + y, 1, 1);
        g2d.fillRect(122 + x, 119 + y, 1, 4);
        g2d.fillRect(120 + x, 123 + y, 2, 1);
        g2d.fillRect(121 + x, 124 + y, 1, 6);
        g2d.fillRect(122 + x, 130 + y, 1, 4);
        g2d.fillRect(123 + x, 134 + y, 1, 4);
        g2d.fillRect(101 + x, 135 + y, 1, 9);
        g2d.fillRect(121 + x, 138 + y, 2, 1);
        g2d.fillRect(120 + x, 139 + y, 1, 3);
        g2d.fillRect(121 + x, 142 + y, 1, 4);
        g2d.fillRect(100 + x, 143 + y, 1, 7);
        g2d.fillRect(116 + x, 144 + y, 1, 3);
        g2d.fillRect(120 + x, 146 + y, 1, 10);
        g2d.fillRect(117 + x, 147 + y, 1, 5);
        g2d.fillRect(99 + x, 150 + y, 1, 2);
        g2d.fillRect(98 + x, 152 + y, 1, 3);
        g2d.fillRect(116 + x, 152 + y, 1, 4);
        g2d.fillRect(97 + x, 155 + y, 1, 2);
        g2d.fillRect(115 + x, 155 + y, 1, 2);
        g2d.fillRect(121 + x, 156 + y, 1, 6);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
        g2d.fillRect(96 + x, 158 + y, 1, 3);
        g2d.fillRect(95 + x, 159 + y, 1, 1);
        g2d.fillRect(113 + x, 159 + y, 1, 1);
        g2d.fillRect(97 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 161 + y, 1, 3);
        g2d.fillRect(98 + x, 162 + y, 3, 1);
        g2d.fillRect(122 + x, 162 + y, 1, 1);
        g2d.fillRect(101 + x, 163 + y, 9, 1);
        g2d.fillRect(111 + x, 163 + y, 11, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 17);
        g2d.fillRect(115 + x, 61 + y, 1, 7);
        g2d.fillRect(105 + x, 67 + y, 1, 10);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 10);
        g2d.fillRect(103 + x, 73 + y, 1, 5);
        g2d.fillRect(118 + x, 73 + y, 1, 11);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(102 + x, 76 + y, 1, 4);
        g2d.fillRect(119 + x, 78 + y, 1, 10);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 1, 9);
        g2d.fillRect(102 + x, 82 + y, 1, 14);
        g2d.fillRect(111 + x, 82 + y, 1, 4);
        g2d.fillRect(120 + x, 82 + y, 1, 6);
        g2d.fillRect(112 + x, 83 + y, 1, 7);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 3);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 3, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 1, 8);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 4);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 4);
        g2d.fillRect(113 + x, 92 + y, 1, 3);
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 4);
        g2d.fillRect(112 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 11);
        g2d.fillRect(110 + x, 95 + y, 1, 11);
        g2d.fillRect(111 + x, 95 + y, 1, 13);
        g2d.fillRect(114 + x, 95 + y, 1, 4);
        g2d.fillRect(118 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 3);
        g2d.fillRect(107 + x, 96 + y, 1, 7);
        g2d.fillRect(108 + x, 96 + y, 1, 8);
        g2d.fillRect(113 + x, 96 + y, 1, 3);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 98 + y, 1, 4);
        g2d.fillRect(112 + x, 98 + y, 1, 4);
        g2d.fillRect(117 + x, 98 + y, 1, 8);
        g2d.fillRect(116 + x, 99 + y, 1, 3);
        g2d.fillRect(118 + x, 99 + y, 1, 8);
        g2d.fillRect(115 + x, 100 + y, 1, 2);
        g2d.fillRect(119 + x, 100 + y, 1, 7);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(112 + x, 103 + y, 1, 7);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(104 + x, 104 + y, 1, 7);
        g2d.fillRect(113 + x, 106 + y, 1, 4);
        g2d.fillRect(116 + x, 106 + y, 1, 5);
        g2d.fillRect(110 + x, 107 + y, 1, 5);
        g2d.fillRect(114 + x, 107 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 4);
        g2d.fillRect(115 + x, 108 + y, 1, 4);
        g2d.fillRect(109 + x, 110 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 2);
        g2d.fillRect(118 + x, 110 + y, 1, 5);
        g2d.fillRect(103 + x, 112 + y, 1, 2);
        g2d.fillRect(108 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 4);
        g2d.fillRect(117 + x, 112 + y, 1, 6);
        g2d.fillRect(105 + x, 114 + y, 2, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 2);
        g2d.fillRect(116 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 115 + y, 2, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 4);
        g2d.fillRect(115 + x, 115 + y, 1, 1);
        g2d.fillRect(119 + x, 115 + y, 1, 3);
        g2d.fillRect(103 + x, 116 + y, 1, 18);
        g2d.fillRect(107 + x, 116 + y, 1, 2);
        g2d.fillRect(118 + x, 116 + y, 1, 4);
        g2d.fillRect(104 + x, 118 + y, 1, 9);
        g2d.fillRect(109 + x, 118 + y, 1, 4);
        g2d.fillRect(113 + x, 118 + y, 1, 4);
        g2d.fillRect(120 + x, 118 + y, 1, 2);
        g2d.fillRect(112 + x, 119 + y, 1, 4);
        g2d.fillRect(117 + x, 119 + y, 1, 4);
        g2d.fillRect(121 + x, 119 + y, 1, 4);
        g2d.fillRect(106 + x, 120 + y, 1, 4);
        g2d.fillRect(111 + x, 120 + y, 1, 3);
        g2d.fillRect(114 + x, 120 + y, 1, 2);
        g2d.fillRect(115 + x, 120 + y, 1, 4);
        g2d.fillRect(116 + x, 120 + y, 1, 3);
        g2d.fillRect(107 + x, 122 + y, 1, 2);
        g2d.fillRect(108 + x, 122 + y, 1, 17);
        g2d.fillRect(118 + x, 122 + y, 1, 4);
        g2d.fillRect(120 + x, 122 + y, 1, 1);
        g2d.fillRect(119 + x, 123 + y, 1, 5);
        g2d.fillRect(105 + x, 124 + y, 1, 2);
        g2d.fillRect(111 + x, 124 + y, 1, 6);
        g2d.fillRect(114 + x, 124 + y, 1, 3);
        g2d.fillRect(120 + x, 124 + y, 1, 6);
        g2d.fillRect(113 + x, 126 + y, 1, 6);
        g2d.fillRect(106 + x, 127 + y, 1, 7);
        g2d.fillRect(107 + x, 127 + y, 1, 4);
        g2d.fillRect(115 + x, 128 + y, 1, 2);
        g2d.fillRect(116 + x, 128 + y, 1, 3);
        g2d.fillRect(112 + x, 130 + y, 1, 1);
        g2d.fillRect(117 + x, 130 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 2, 1);
        g2d.fillRect(121 + x, 130 + y, 1, 5);
        g2d.fillRect(110 + x, 131 + y, 1, 11);
        g2d.fillRect(114 + x, 131 + y, 1, 15);
        g2d.fillRect(105 + x, 132 + y, 1, 4);
        g2d.fillRect(112 + x, 132 + y, 1, 4);
        g2d.fillRect(115 + x, 132 + y, 1, 12);
        g2d.fillRect(118 + x, 132 + y, 1, 3);
        g2d.fillRect(111 + x, 134 + y, 1, 1);
        g2d.fillRect(122 + x, 134 + y, 1, 4);
        g2d.fillRect(107 + x, 135 + y, 1, 7);
        g2d.fillRect(117 + x, 135 + y, 1, 1);
        g2d.fillRect(119 + x, 135 + y, 1, 8);
        g2d.fillRect(104 + x, 136 + y, 1, 3);
        g2d.fillRect(109 + x, 136 + y, 1, 3);
        g2d.fillRect(116 + x, 136 + y, 1, 8);
        g2d.fillRect(120 + x, 136 + y, 1, 3);
        g2d.fillRect(121 + x, 136 + y, 1, 2);
        g2d.fillRect(103 + x, 138 + y, 1, 1);
        g2d.fillRect(106 + x, 139 + y, 1, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 3);
        g2d.fillRect(118 + x, 139 + y, 1, 3);
        g2d.fillRect(102 + x, 140 + y, 1, 3);
        g2d.fillRect(105 + x, 140 + y, 1, 3);
        g2d.fillRect(109 + x, 140 + y, 1, 6);
        g2d.fillRect(120 + x, 142 + y, 1, 4);
        g2d.fillRect(104 + x, 143 + y, 1, 1);
        g2d.fillRect(106 + x, 143 + y, 1, 1);
        g2d.fillRect(108 + x, 143 + y, 1, 7);
        g2d.fillRect(113 + x, 143 + y, 1, 5);
        g2d.fillRect(117 + x, 143 + y, 1, 4);
        g2d.fillRect(105 + x, 146 + y, 1, 1);
        g2d.fillRect(107 + x, 146 + y, 1, 6);
        g2d.fillRect(112 + x, 146 + y, 1, 6);
        g2d.fillRect(104 + x, 147 + y, 1, 3);
        g2d.fillRect(119 + x, 147 + y, 1, 14);
        g2d.fillRect(116 + x, 148 + y, 1, 4);
        g2d.fillRect(118 + x, 148 + y, 1, 8);
        g2d.fillRect(103 + x, 150 + y, 1, 2);
        g2d.fillRect(111 + x, 150 + y, 1, 6);
        g2d.fillRect(102 + x, 151 + y, 1, 2);
        g2d.fillRect(106 + x, 151 + y, 1, 2);
        g2d.fillRect(105 + x, 152 + y, 1, 3);
        g2d.fillRect(110 + x, 152 + y, 1, 7);
        g2d.fillRect(117 + x, 152 + y, 1, 5);
        g2d.fillRect(101 + x, 153 + y, 1, 3);
        g2d.fillRect(104 + x, 153 + y, 1, 3);
        g2d.fillRect(109 + x, 153 + y, 1, 7);
        g2d.fillRect(100 + x, 156 + y, 1, 1);
        g2d.fillRect(103 + x, 156 + y, 1, 1);
        g2d.fillRect(108 + x, 156 + y, 1, 1);
        g2d.fillRect(116 + x, 156 + y, 1, 1);
        g2d.fillRect(120 + x, 156 + y, 1, 7);
        g2d.fillRect(99 + x, 157 + y, 1, 2);
        g2d.fillRect(107 + x, 157 + y, 1, 6);
        g2d.fillRect(115 + x, 157 + y, 1, 2);
        g2d.fillRect(106 + x, 159 + y, 1, 4);
        g2d.fillRect(108 + x, 159 + y, 1, 3);
        g2d.fillRect(114 + x, 159 + y, 1, 1);
        g2d.fillRect(118 + x, 159 + y, 1, 1);
        g2d.fillRect(105 + x, 160 + y, 1, 3);
        g2d.fillRect(98 + x, 161 + y, 7, 1);
        g2d.fillRect(117 + x, 161 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 4, 1);
        g2d.fillRect(121 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 3);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 5);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 16);
        g2d.fillRect(107 + x, 59 + y, 1, 12);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 8);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 6);
        g2d.fillRect(109 + x, 61 + y, 1, 4);
        g2d.fillRect(110 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(115 + x, 68 + y, 1, 8);
        g2d.fillRect(116 + x, 69 + y, 1, 5);
        g2d.fillRect(107 + x, 74 + y, 1, 6);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 8);
        g2d.fillRect(116 + x, 75 + y, 1, 9);
        g2d.fillRect(105 + x, 77 + y, 1, 3);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(109 + x, 77 + y, 1, 3);
        g2d.fillRect(103 + x, 78 + y, 1, 6);
        g2d.fillRect(104 + x, 78 + y, 1, 4);
        g2d.fillRect(110 + x, 78 + y, 1, 3);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 4);
        g2d.fillRect(117 + x, 80 + y, 1, 3);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 5);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 4);
        g2d.fillRect(110 + x, 83 + y, 1, 3);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 3);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 4);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 1, 5);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 4);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(110 + x, 88 + y, 1, 3);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 94 + y, 1, 4);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 2, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 3);
        g2d.fillRect(113 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 3);
        g2d.fillRect(117 + x, 95 + y, 1, 3);
        g2d.fillRect(120 + x, 95 + y, 1, 3);
        g2d.fillRect(102 + x, 96 + y, 1, 2);
        g2d.fillRect(106 + x, 96 + y, 1, 2);
        g2d.fillRect(119 + x, 96 + y, 1, 4);
        g2d.fillRect(103 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 2);
        g2d.fillRect(114 + x, 100 + y, 1, 2);
        g2d.fillRect(106 + x, 102 + y, 1, 1);
        g2d.fillRect(112 + x, 102 + y, 2, 1);
        g2d.fillRect(115 + x, 102 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 1, 1);
        g2d.fillRect(107 + x, 103 + y, 1, 1);
        g2d.fillRect(105 + x, 104 + y, 1, 10);
        g2d.fillRect(108 + x, 104 + y, 1, 8);
        g2d.fillRect(113 + x, 104 + y, 1, 2);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(106 + x, 106 + y, 1, 8);
        g2d.fillRect(107 + x, 106 + y, 1, 6);
        g2d.fillRect(109 + x, 106 + y, 1, 4);
        g2d.fillRect(110 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(104 + x, 111 + y, 1, 7);
        g2d.fillRect(113 + x, 111 + y, 1, 3);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 112 + y, 1, 2);
        g2d.fillRect(110 + x, 112 + y, 1, 3);
        g2d.fillRect(115 + x, 112 + y, 1, 3);
        g2d.fillRect(103 + x, 114 + y, 1, 2);
        g2d.fillRect(105 + x, 115 + y, 1, 9);
        g2d.fillRect(109 + x, 115 + y, 1, 3);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(118 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 116 + y, 1, 3);
        g2d.fillRect(112 + x, 116 + y, 1, 3);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(116 + x, 116 + y, 1, 4);
        g2d.fillRect(114 + x, 118 + y, 1, 2);
        g2d.fillRect(117 + x, 118 + y, 1, 1);
        g2d.fillRect(119 + x, 118 + y, 1, 1);
        g2d.fillRect(106 + x, 119 + y, 1, 1);
        g2d.fillRect(110 + x, 119 + y, 1, 5);
        g2d.fillRect(107 + x, 120 + y, 1, 2);
        g2d.fillRect(108 + x, 120 + y, 1, 2);
        g2d.fillRect(118 + x, 120 + y, 1, 2);
        g2d.fillRect(119 + x, 120 + y, 1, 3);
        g2d.fillRect(120 + x, 120 + y, 1, 2);
        g2d.fillRect(109 + x, 122 + y, 1, 14);
        g2d.fillRect(114 + x, 122 + y, 1, 2);
        g2d.fillRect(111 + x, 123 + y, 2, 1);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(106 + x, 124 + y, 1, 3);
        g2d.fillRect(107 + x, 124 + y, 1, 3);
        g2d.fillRect(115 + x, 124 + y, 1, 4);
        g2d.fillRect(105 + x, 126 + y, 1, 6);
        g2d.fillRect(104 + x, 127 + y, 1, 9);
        g2d.fillRect(114 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 1);
        g2d.fillRect(112 + x, 128 + y, 1, 2);
        g2d.fillRect(117 + x, 128 + y, 1, 2);
        g2d.fillRect(119 + x, 128 + y, 1, 2);
        g2d.fillRect(111 + x, 130 + y, 1, 4);
        g2d.fillRect(120 + x, 130 + y, 1, 2);
        g2d.fillRect(107 + x, 131 + y, 1, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(118 + x, 131 + y, 1, 1);
        g2d.fillRect(113 + x, 132 + y, 1, 3);
        g2d.fillRect(117 + x, 132 + y, 1, 3);
        g2d.fillRect(103 + x, 134 + y, 1, 4);
        g2d.fillRect(106 + x, 134 + y, 1, 1);
        g2d.fillRect(102 + x, 135 + y, 1, 5);
        g2d.fillRect(111 + x, 135 + y, 1, 8);
        g2d.fillRect(116 + x, 135 + y, 1, 1);
        g2d.fillRect(118 + x, 135 + y, 1, 1);
        g2d.fillRect(117 + x, 136 + y, 1, 3);
        g2d.fillRect(106 + x, 138 + y, 1, 1);
        g2d.fillRect(103 + x, 139 + y, 1, 3);
        g2d.fillRect(105 + x, 139 + y, 1, 1);
        g2d.fillRect(108 + x, 139 + y, 1, 4);
        g2d.fillRect(109 + x, 139 + y, 1, 1);
        g2d.fillRect(106 + x, 140 + y, 1, 3);
        g2d.fillRect(113 + x, 140 + y, 1, 3);
        g2d.fillRect(107 + x, 142 + y, 1, 4);
        g2d.fillRect(110 + x, 142 + y, 1, 5);
        g2d.fillRect(117 + x, 142 + y, 2, 1);
        g2d.fillRect(102 + x, 143 + y, 1, 1);
        g2d.fillRect(105 + x, 143 + y, 1, 3);
        g2d.fillRect(119 + x, 143 + y, 1, 1);
        g2d.fillRect(101 + x, 144 + y, 1, 9);
        g2d.fillRect(104 + x, 144 + y, 1, 3);
        g2d.fillRect(112 + x, 144 + y, 1, 2);
        g2d.fillRect(115 + x, 144 + y, 1, 6);
        g2d.fillRect(103 + x, 146 + y, 1, 4);
        g2d.fillRect(106 + x, 146 + y, 1, 1);
        g2d.fillRect(109 + x, 146 + y, 1, 2);
        g2d.fillRect(114 + x, 146 + y, 1, 1);
        g2d.fillRect(119 + x, 146 + y, 1, 1);
        g2d.fillRect(105 + x, 147 + y, 1, 3);
        g2d.fillRect(116 + x, 147 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 1);
        g2d.fillRect(102 + x, 148 + y, 1, 3);
        g2d.fillRect(111 + x, 148 + y, 1, 2);
        g2d.fillRect(113 + x, 148 + y, 1, 3);
        g2d.fillRect(100 + x, 150 + y, 1, 6);
        g2d.fillRect(104 + x, 150 + y, 1, 1);
        g2d.fillRect(106 + x, 150 + y, 1, 1);
        g2d.fillRect(110 + x, 150 + y, 1, 2);
        g2d.fillRect(109 + x, 151 + y, 1, 2);
        g2d.fillRect(99 + x, 152 + y, 1, 5);
        g2d.fillRect(103 + x, 152 + y, 1, 4);
        g2d.fillRect(104 + x, 152 + y, 1, 1);
        g2d.fillRect(107 + x, 152 + y, 1, 5);
        g2d.fillRect(108 + x, 152 + y, 1, 4);
        g2d.fillRect(112 + x, 152 + y, 1, 3);
        g2d.fillRect(115 + x, 152 + y, 1, 3);
        g2d.fillRect(102 + x, 153 + y, 1, 8);
        g2d.fillRect(106 + x, 153 + y, 1, 6);
        g2d.fillRect(98 + x, 155 + y, 1, 6);
        g2d.fillRect(105 + x, 155 + y, 1, 5);
        g2d.fillRect(101 + x, 156 + y, 1, 5);
        g2d.fillRect(104 + x, 156 + y, 1, 5);
        g2d.fillRect(111 + x, 156 + y, 1, 5);
        g2d.fillRect(113 + x, 156 + y, 1, 3);
        g2d.fillRect(114 + x, 156 + y, 1, 1);
        g2d.fillRect(118 + x, 156 + y, 1, 3);
        g2d.fillRect(97 + x, 157 + y, 1, 4);
        g2d.fillRect(100 + x, 157 + y, 1, 4);
        g2d.fillRect(103 + x, 157 + y, 1, 4);
        g2d.fillRect(108 + x, 157 + y, 1, 2);
        g2d.fillRect(117 + x, 157 + y, 1, 4);
        g2d.fillRect(99 + x, 159 + y, 1, 2);
        g2d.fillRect(110 + x, 159 + y, 1, 2);
        g2d.fillRect(112 + x, 159 + y, 1, 1);
        g2d.fillRect(109 + x, 160 + y, 1, 3);
        g2d.fillRect(116 + x, 160 + y, 1, 3);
        g2d.fillRect(118 + x, 160 + y, 1, 3);
        g2d.fillRect(113 + x, 161 + y, 1, 2);
        g2d.fillRect(114 + x, 161 + y, 1, 2);
        g2d.fillRect(115 + x, 161 + y, 1, 2);
        g2d.fillRect(119 + x, 161 + y, 1, 2);
        g2d.fillRect(108 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 41 + y, 1, 3);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 3);
        g2d.fillRect(117 + x, 44 + y, 1, 3);
        g2d.fillRect(111 + x, 59 + y, 1, 3);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 21);
        g2d.fillRect(113 + x, 60 + y, 1, 22);
        g2d.fillRect(108 + x, 63 + y, 1, 12);
        g2d.fillRect(110 + x, 63 + y, 1, 15);
        g2d.fillRect(111 + x, 64 + y, 1, 16);
        g2d.fillRect(109 + x, 65 + y, 1, 12);
        g2d.fillRect(114 + x, 68 + y, 1, 6);
        g2d.fillRect(107 + x, 71 + y, 1, 3);
        g2d.fillRect(114 + x, 75 + y, 1, 8);
        g2d.fillRect(115 + x, 76 + y, 1, 4);
        g2d.fillRect(105 + x, 80 + y, 1, 7);
        g2d.fillRect(106 + x, 80 + y, 1, 4);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 4);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 3);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(108 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 1, 5);
        g2d.fillRect(115 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 4);
        g2d.fillRect(111 + x, 90 + y, 1, 5);
        g2d.fillRect(112 + x, 90 + y, 1, 4);
        g2d.fillRect(118 + x, 90 + y, 1, 5);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(109 + x, 92 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 3);
        g2d.fillRect(114 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 3);
        g2d.fillRect(113 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 2);
        g2d.fillRect(116 + x, 102 + y, 1, 2);
        g2d.fillRect(106 + x, 103 + y, 1, 3);
        g2d.fillRect(114 + x, 103 + y, 1, 3);
        g2d.fillRect(107 + x, 104 + y, 1, 2);
        g2d.fillRect(115 + x, 104 + y, 1, 4);
        g2d.fillRect(112 + x, 110 + y, 1, 6);
        g2d.fillRect(113 + x, 110 + y, 2, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 3);
        g2d.fillRect(107 + x, 112 + y, 1, 3);
        g2d.fillRect(111 + x, 112 + y, 1, 3);
        g2d.fillRect(108 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 116 + y, 1, 3);
        g2d.fillRect(111 + x, 116 + y, 1, 4);
        g2d.fillRect(114 + x, 116 + y, 1, 2);
        g2d.fillRect(115 + x, 116 + y, 1, 4);
        g2d.fillRect(107 + x, 118 + y, 1, 2);
        g2d.fillRect(108 + x, 119 + y, 1, 1);
        g2d.fillRect(119 + x, 119 + y, 1, 1);
        g2d.fillRect(113 + x, 122 + y, 1, 4);
        g2d.fillRect(116 + x, 123 + y, 1, 4);
        g2d.fillRect(110 + x, 124 + y, 1, 7);
        g2d.fillRect(112 + x, 124 + y, 1, 4);
        g2d.fillRect(117 + x, 124 + y, 1, 4);
        g2d.fillRect(118 + x, 126 + y, 1, 4);
        g2d.fillRect(114 + x, 128 + y, 1, 3);
        g2d.fillRect(115 + x, 130 + y, 1, 2);
        g2d.fillRect(112 + x, 131 + y, 1, 1);
        g2d.fillRect(119 + x, 131 + y, 1, 4);
        g2d.fillRect(107 + x, 132 + y, 1, 3);
        g2d.fillRect(116 + x, 132 + y, 1, 3);
        g2d.fillRect(120 + x, 132 + y, 1, 4);
        g2d.fillRect(106 + x, 135 + y, 1, 3);
        g2d.fillRect(113 + x, 135 + y, 1, 5);
        g2d.fillRect(121 + x, 135 + y, 1, 1);
        g2d.fillRect(105 + x, 136 + y, 1, 3);
        g2d.fillRect(112 + x, 136 + y, 1, 8);
        g2d.fillRect(118 + x, 136 + y, 1, 3);
        g2d.fillRect(104 + x, 139 + y, 1, 4);
        g2d.fillRect(103 + x, 142 + y, 1, 4);
        g2d.fillRect(111 + x, 143 + y, 1, 5);
        g2d.fillRect(118 + x, 143 + y, 1, 4);
        g2d.fillRect(102 + x, 144 + y, 1, 4);
        g2d.fillRect(106 + x, 144 + y, 1, 2);
        g2d.fillRect(119 + x, 144 + y, 1, 2);
        g2d.fillRect(106 + x, 147 + y, 1, 3);
        g2d.fillRect(110 + x, 147 + y, 1, 3);
        g2d.fillRect(114 + x, 147 + y, 1, 9);
        g2d.fillRect(109 + x, 148 + y, 1, 3);
        g2d.fillRect(105 + x, 150 + y, 1, 2);
        g2d.fillRect(108 + x, 150 + y, 1, 2);
        g2d.fillRect(115 + x, 150 + y, 1, 2);
        g2d.fillRect(104 + x, 151 + y, 1, 1);
        g2d.fillRect(113 + x, 151 + y, 1, 5);
        g2d.fillRect(112 + x, 155 + y, 1, 4);
        g2d.fillRect(116 + x, 157 + y, 1, 3);
        g2d.fillRect(115 + x, 159 + y, 1, 2);
        g2d.fillRect(112 + x, 160 + y, 1, 3);
        g2d.fillRect(113 + x, 160 + y, 2, 1);
        g2d.fillRect(111 + x, 161 + y, 1, 2);
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }
}
