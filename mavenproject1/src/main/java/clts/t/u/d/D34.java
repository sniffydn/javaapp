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
public class D34 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D34()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 7;
    }

    public D34(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 7;
    }

    public D34(String middle, ColorArray colorSwitch)
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
        if(prevY == 1)
            paintTL1(x,0,g2d);
        else if(prevY == 0)
            paintTL2(x,0,g2d);
        else
            paintTL3(x,0, g2d);

        prevY = y;

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
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintB(offsetX, prevY, g2d);
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

    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(103 + x, 75 + y, 2, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 7);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 13);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 2, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 2, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 97 + y, 1, 2);
        g2d.fillRect(122 + x, 97 + y, 1, 36);
        g2d.fillRect(111 + x, 99 + y, 1, 3);
        g2d.fillRect(114 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 102 + y, 1, 2);
        g2d.fillRect(121 + x, 103 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 2);
        g2d.fillRect(120 + x, 104 + y, 1, 2);
        g2d.fillRect(114 + x, 106 + y, 1, 4);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 9);
        g2d.fillRect(116 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 14);
        g2d.fillRect(121 + x, 122 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 2);
        g2d.fillRect(117 + x, 133 + y, 1, 8);
        g2d.fillRect(123 + x, 133 + y, 1, 5);
        g2d.fillRect(124 + x, 139 + y, 1, 6);
        g2d.fillRect(118 + x, 141 + y, 1, 6);
        g2d.fillRect(125 + x, 144 + y, 1, 3);
        g2d.fillRect(119 + x, 147 + y, 1, 5);
        g2d.fillRect(126 + x, 147 + y, 1, 4);
        g2d.fillRect(127 + x, 151 + y, 1, 2);
        g2d.fillRect(120 + x, 152 + y, 1, 3);
        g2d.fillRect(127 + x, 154 + y, 1, 3);
        g2d.fillRect(121 + x, 155 + y, 1, 2);
        g2d.fillRect(122 + x, 157 + y, 1, 3);
        g2d.fillRect(128 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 160 + y, 1, 2);
        g2d.fillRect(129 + x, 160 + y, 1, 4);
        g2d.fillRect(124 + x, 162 + y, 1, 1);
        g2d.fillRect(125 + x, 163 + y, 1, 4);
        g2d.fillRect(128 + x, 164 + y, 1, 1);
        g2d.fillRect(126 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 2, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(104 + x, 61 + y, 1, 12);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 2, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 6);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(117 + x, 70 + y, 1, 8);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(110 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 4);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 3);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 10);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 10);
        g2d.fillRect(109 + x, 79 + y, 2, 1);
        g2d.fillRect(114 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 5);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 2, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 3);
        g2d.fillRect(105 + x, 81 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 9);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(118 + x, 85 + y, 1, 4);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 3);
        g2d.fillRect(114 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 3);
        g2d.fillRect(109 + x, 95 + y, 2, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 97 + y, 1, 2);
        g2d.fillRect(121 + x, 97 + y, 1, 4);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(112 + x, 99 + y, 1, 3);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 1, 2);
        g2d.fillRect(113 + x, 102 + y, 1, 2);
        g2d.fillRect(121 + x, 102 + y, 1, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 104 + y, 1, 2);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(121 + x, 104 + y, 1, 18);
        g2d.fillRect(115 + x, 106 + y, 1, 4);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(120 + x, 107 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(119 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 4);
        g2d.fillRect(118 + x, 113 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 3);
        g2d.fillRect(116 + x, 115 + y, 1, 4);
        g2d.fillRect(117 + x, 118 + y, 1, 15);
        g2d.fillRect(120 + x, 122 + y, 1, 1);
        g2d.fillRect(119 + x, 123 + y, 1, 2);
        g2d.fillRect(121 + x, 123 + y, 1, 10);
        g2d.fillRect(118 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 132 + y, 1, 9);
        g2d.fillRect(122 + x, 133 + y, 1, 5);
        g2d.fillRect(120 + x, 136 + y, 1, 1);
        g2d.fillRect(119 + x, 137 + y, 1, 1);
        g2d.fillRect(123 + x, 138 + y, 1, 5);
        g2d.fillRect(119 + x, 141 + y, 1, 6);
        g2d.fillRect(123 + x, 144 + y, 1, 4);
        g2d.fillRect(124 + x, 145 + y, 1, 2);
        g2d.fillRect(120 + x, 147 + y, 1, 5);
        g2d.fillRect(122 + x, 147 + y, 1, 1);
        g2d.fillRect(125 + x, 147 + y, 1, 4);
        g2d.fillRect(121 + x, 151 + y, 1, 4);
        g2d.fillRect(126 + x, 151 + y, 1, 6);
        g2d.fillRect(122 + x, 152 + y, 1, 5);
        g2d.fillRect(127 + x, 153 + y, 1, 1);
        g2d.fillRect(125 + x, 154 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(123 + x, 156 + y, 1, 4);
        g2d.fillRect(127 + x, 157 + y, 1, 5);
        g2d.fillRect(124 + x, 159 + y, 1, 3);
        g2d.fillRect(125 + x, 160 + y, 1, 3);
        g2d.fillRect(128 + x, 160 + y, 1, 4);
        g2d.fillRect(126 + x, 162 + y, 1, 4);
        g2d.fillRect(127 + x, 163 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 1, 4);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 4);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 4);
        g2d.fillRect(111 + x, 65 + y, 1, 4);
        g2d.fillRect(112 + x, 65 + y, 1, 11);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(114 + x, 68 + y, 1, 8);
        g2d.fillRect(105 + x, 69 + y, 1, 6);
        g2d.fillRect(106 + x, 69 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(106 + x, 71 + y, 2, 1);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 75 + y, 2, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 76 + y, 2, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 4);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 8);
        g2d.fillRect(103 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 2, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 3);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 2, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 4);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 3);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(109 + x, 88 + y, 1, 6);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 3);
        g2d.fillRect(107 + x, 89 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(113 + x, 89 + y, 1, 3);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 91 + y, 1, 3);
        g2d.fillRect(111 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 91 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 3);
        g2d.fillRect(113 + x, 94 + y, 1, 2);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 2);
        g2d.fillRect(112 + x, 95 + y, 1, 4);
        g2d.fillRect(116 + x, 95 + y, 1, 4);
        g2d.fillRect(117 + x, 95 + y, 1, 3);
        g2d.fillRect(119 + x, 95 + y, 1, 7);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(120 + x, 97 + y, 1, 4);
        g2d.fillRect(114 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 5);
        g2d.fillRect(113 + x, 100 + y, 1, 2);
        g2d.fillRect(114 + x, 100 + y, 1, 4);
        g2d.fillRect(115 + x, 100 + y, 1, 6);
        g2d.fillRect(117 + x, 100 + y, 1, 4);
        g2d.fillRect(116 + x, 102 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 2);
        g2d.fillRect(116 + x, 106 + y, 1, 4);
        g2d.fillRect(119 + x, 106 + y, 1, 3);
        g2d.fillRect(120 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(120 + x, 109 + y, 1, 6);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(119 + x, 110 + y, 1, 7);
        g2d.fillRect(117 + x, 113 + y, 1, 1);
        g2d.fillRect(118 + x, 114 + y, 1, 11);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(120 + x, 118 + y, 1, 4);
        g2d.fillRect(119 + x, 121 + y, 1, 2);
        g2d.fillRect(119 + x, 125 + y, 1, 3);
        g2d.fillRect(120 + x, 125 + y, 1, 11);
        g2d.fillRect(118 + x, 126 + y, 1, 3);
        g2d.fillRect(119 + x, 129 + y, 1, 3);
        g2d.fillRect(118 + x, 130 + y, 1, 2);
        g2d.fillRect(121 + x, 133 + y, 1, 7);
        g2d.fillRect(119 + x, 134 + y, 1, 3);
        g2d.fillRect(120 + x, 137 + y, 1, 10);
        g2d.fillRect(119 + x, 138 + y, 1, 3);
        g2d.fillRect(122 + x, 138 + y, 1, 2);
        g2d.fillRect(122 + x, 141 + y, 1, 6);
        g2d.fillRect(123 + x, 143 + y, 1, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 7);
        g2d.fillRect(124 + x, 147 + y, 1, 4);
        g2d.fillRect(122 + x, 148 + y, 1, 4);
        g2d.fillRect(123 + x, 148 + y, 1, 1);
        g2d.fillRect(123 + x, 151 + y, 1, 5);
        g2d.fillRect(125 + x, 151 + y, 1, 3);
        g2d.fillRect(124 + x, 152 + y, 1, 1);
        g2d.fillRect(124 + x, 154 + y, 1, 1);
        g2d.fillRect(125 + x, 155 + y, 1, 1);
        g2d.fillRect(124 + x, 156 + y, 1, 3);
        g2d.fillRect(126 + x, 157 + y, 1, 5);
        g2d.fillRect(127 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 1, 4);
        g2d.fillRect(111 + x, 69 + y, 1, 3);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 3);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 3);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 4);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 2, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 4);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 3);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 3);
        g2d.fillRect(113 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(118 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 2, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(119 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 2);
        g2d.fillRect(120 + x, 115 + y, 1, 2);
        g2d.fillRect(119 + x, 117 + y, 1, 1);
        g2d.fillRect(119 + x, 119 + y, 1, 2);
        g2d.fillRect(118 + x, 129 + y, 1, 1);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(121 + x, 140 + y, 2, 1);
        g2d.fillRect(121 + x, 143 + y, 1, 1);
        g2d.fillRect(124 + x, 151 + y, 1, 1);
        g2d.fillRect(124 + x, 153 + y, 1, 1);
        g2d.fillRect(125 + x, 156 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 3);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 2, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 3);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 1);
        g2d.fillRect(121 + x, 101 + y, 1, 1);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 2, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 111 + y, 1, 2);
        g2d.fillRect(120 + x, 117 + y, 1, 1);
        g2d.fillRect(119 + x, 118 + y, 1, 1);
        g2d.fillRect(119 + x, 128 + y, 1, 1);
        g2d.fillRect(119 + x, 132 + y, 1, 1);
        g2d.fillRect(121 + x, 141 + y, 1, 2);
        g2d.fillRect(123 + x, 149 + y, 1, 2);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 3);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 2, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 51 + y, 2, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 2, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(99 + x, 85 + y, 1, 6);
        g2d.fillRect(123 + x, 167 + y, 1, 1);
        g2d.fillRect(115 + x, 168 + y, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 83 + y, 1, 20);
        g2d.fillRect(102 + x, 83 + y, 1, 23);
        g2d.fillRect(103 + x, 83 + y, 1, 27);
        g2d.fillRect(104 + x, 83 + y, 1, 85);
        g2d.fillRect(105 + x, 83 + y, 1, 85);
        g2d.fillRect(106 + x, 83 + y, 1, 85);
        g2d.fillRect(107 + x, 83 + y, 1, 85);
        g2d.fillRect(108 + x, 83 + y, 1, 85);
        g2d.fillRect(109 + x, 83 + y, 1, 85);
        g2d.fillRect(110 + x, 83 + y, 1, 85);
        g2d.fillRect(111 + x, 83 + y, 1, 85);
        g2d.fillRect(112 + x, 83 + y, 1, 85);
        g2d.fillRect(113 + x, 83 + y, 1, 85);
        g2d.fillRect(114 + x, 83 + y, 1, 85);
        g2d.fillRect(115 + x, 83 + y, 1, 85);
        g2d.fillRect(116 + x, 83 + y, 1, 85);
        g2d.fillRect(117 + x, 83 + y, 1, 85);
        g2d.fillRect(100 + x, 85 + y, 1, 9);
        g2d.fillRect(103 + x, 118 + y, 1, 49);
        g2d.fillRect(102 + x, 123 + y, 1, 44);
        g2d.fillRect(118 + x, 128 + y, 1, 40);
        g2d.fillRect(101 + x, 129 + y, 1, 38);
        g2d.fillRect(119 + x, 133 + y, 1, 35);
        g2d.fillRect(100 + x, 136 + y, 1, 30);
        g2d.fillRect(120 + x, 139 + y, 1, 29);
        g2d.fillRect(121 + x, 144 + y, 1, 24);
        g2d.fillRect(99 + x, 145 + y, 1, 21);
        g2d.fillRect(122 + x, 147 + y, 1, 21);
        g2d.fillRect(98 + x, 148 + y, 1, 18);
        g2d.fillRect(97 + x, 151 + y, 1, 13);
        g2d.fillRect(123 + x, 151 + y, 1, 16);
        g2d.fillRect(124 + x, 154 + y, 1, 13);
        g2d.fillRect(125 + x, 158 + y, 1, 8);
        g2d.fillRect(96 + x, 159 + y, 1, 7);
        g2d.fillRect(126 + x, 160 + y, 1, 5);
        g2d.fillRect(95 + x, 163 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 94 + y, 1, 6);
        g2d.fillRect(101 + x, 103 + y, 1, 26);
        g2d.fillRect(102 + x, 106 + y, 1, 17);
        g2d.fillRect(103 + x, 110 + y, 1, 8);
        g2d.fillRect(100 + x, 123 + y, 1, 13);
        g2d.fillRect(99 + x, 129 + y, 1, 16);
        g2d.fillRect(98 + x, 134 + y, 1, 14);
        g2d.fillRect(97 + x, 140 + y, 1, 11);
        g2d.fillRect(96 + x, 144 + y, 1, 15);
        g2d.fillRect(95 + x, 147 + y, 1, 16);
        g2d.fillRect(94 + x, 149 + y, 1, 18);
        g2d.fillRect(93 + x, 152 + y, 1, 15);
        g2d.fillRect(92 + x, 156 + y, 1, 12);
        g2d.fillRect(91 + x, 159 + y, 1, 8);
        g2d.fillRect(90 + x, 162 + y, 1, 5);
        g2d.fillRect(89 + x, 163 + y, 1, 4);
        g2d.fillRect(88 + x, 164 + y, 1, 3);
        g2d.fillRect(97 + x, 164 + y, 1, 2);
        g2d.fillRect(95 + x, 166 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 3);
        g2d.fillRect(100 + x, 94 + y, 1, 29);
        g2d.fillRect(99 + x, 100 + y, 1, 4);
        g2d.fillRect(99 + x, 123 + y, 1, 6);
        g2d.fillRect(98 + x, 129 + y, 1, 5);
        g2d.fillRect(97 + x, 134 + y, 1, 6);
        g2d.fillRect(96 + x, 140 + y, 1, 4);
        g2d.fillRect(95 + x, 143 + y, 1, 4);
        g2d.fillRect(94 + x, 145 + y, 1, 4);
        g2d.fillRect(93 + x, 149 + y, 1, 3);
        g2d.fillRect(92 + x, 152 + y, 1, 4);
        g2d.fillRect(91 + x, 155 + y, 1, 4);
        g2d.fillRect(90 + x, 157 + y, 1, 5);
        g2d.fillRect(89 + x, 160 + y, 1, 3);
        g2d.fillRect(88 + x, 162 + y, 1, 2);
        g2d.fillRect(87 + x, 164 + y, 1, 4);
        g2d.fillRect(88 + x, 167 + y, 4, 1);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(103 + x, 75 + y, 2, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 7);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 21);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 2, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 2, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 3);
        g2d.fillRect(110 + x, 99 + y, 1, 3);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 6);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(120 + x, 105 + y, 1, 28);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 110 + y, 1, 9);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 14);
        g2d.fillRect(119 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 2);
        g2d.fillRect(115 + x, 133 + y, 1, 8);
        g2d.fillRect(121 + x, 133 + y, 1, 5);
        g2d.fillRect(122 + x, 139 + y, 1, 6);
        g2d.fillRect(116 + x, 141 + y, 1, 6);
        g2d.fillRect(123 + x, 144 + y, 1, 3);
        g2d.fillRect(117 + x, 147 + y, 1, 5);
        g2d.fillRect(124 + x, 147 + y, 1, 6);
        g2d.fillRect(118 + x, 152 + y, 1, 3);
        g2d.fillRect(125 + x, 154 + y, 1, 3);
        g2d.fillRect(119 + x, 155 + y, 1, 2);
        g2d.fillRect(120 + x, 157 + y, 1, 3);
        g2d.fillRect(126 + x, 158 + y, 1, 2);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(127 + x, 160 + y, 1, 4);
        g2d.fillRect(122 + x, 162 + y, 1, 1);
        g2d.fillRect(123 + x, 163 + y, 1, 5);
        g2d.fillRect(126 + x, 164 + y, 1, 1);
        g2d.fillRect(124 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 2, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(104 + x, 61 + y, 1, 12);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 2, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 6);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(117 + x, 70 + y, 1, 8);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(110 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 4);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 3);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 10);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 10);
        g2d.fillRect(109 + x, 79 + y, 2, 1);
        g2d.fillRect(114 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 5);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 2, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 3);
        g2d.fillRect(105 + x, 81 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 9);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(118 + x, 85 + y, 1, 4);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 3);
        g2d.fillRect(114 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 7);
        g2d.fillRect(109 + x, 95 + y, 2, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 3);
        g2d.fillRect(114 + x, 98 + y, 1, 1);
        g2d.fillRect(111 + x, 99 + y, 1, 3);
        g2d.fillRect(112 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 2);
        g2d.fillRect(112 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 6);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 17);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 4);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 3);
        g2d.fillRect(114 + x, 115 + y, 1, 4);
        g2d.fillRect(115 + x, 118 + y, 1, 15);
        g2d.fillRect(118 + x, 122 + y, 1, 1);
        g2d.fillRect(117 + x, 123 + y, 1, 2);
        g2d.fillRect(119 + x, 123 + y, 1, 10);
        g2d.fillRect(116 + x, 125 + y, 1, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 9);
        g2d.fillRect(120 + x, 133 + y, 1, 5);
        g2d.fillRect(118 + x, 136 + y, 1, 1);
        g2d.fillRect(117 + x, 137 + y, 1, 1);
        g2d.fillRect(121 + x, 138 + y, 1, 5);
        g2d.fillRect(117 + x, 141 + y, 1, 6);
        g2d.fillRect(121 + x, 144 + y, 1, 4);
        g2d.fillRect(122 + x, 145 + y, 1, 2);
        g2d.fillRect(118 + x, 147 + y, 1, 5);
        g2d.fillRect(120 + x, 147 + y, 1, 1);
        g2d.fillRect(123 + x, 147 + y, 1, 8);
        g2d.fillRect(119 + x, 151 + y, 1, 4);
        g2d.fillRect(120 + x, 152 + y, 1, 5);
        g2d.fillRect(124 + x, 153 + y, 1, 4);
        g2d.fillRect(122 + x, 155 + y, 1, 1);
        g2d.fillRect(121 + x, 156 + y, 1, 4);
        g2d.fillRect(125 + x, 157 + y, 1, 5);
        g2d.fillRect(122 + x, 159 + y, 1, 3);
        g2d.fillRect(123 + x, 160 + y, 1, 3);
        g2d.fillRect(126 + x, 160 + y, 1, 4);
        g2d.fillRect(124 + x, 162 + y, 1, 4);
        g2d.fillRect(125 + x, 163 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 1, 4);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 4);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 4);
        g2d.fillRect(111 + x, 65 + y, 1, 4);
        g2d.fillRect(112 + x, 65 + y, 1, 11);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(114 + x, 68 + y, 1, 8);
        g2d.fillRect(105 + x, 69 + y, 1, 6);
        g2d.fillRect(106 + x, 69 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(106 + x, 71 + y, 2, 1);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 75 + y, 2, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 76 + y, 2, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 4);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 8);
        g2d.fillRect(103 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 2, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 3);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 2, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 4);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 3);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(109 + x, 88 + y, 1, 6);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 3);
        g2d.fillRect(107 + x, 89 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(113 + x, 89 + y, 1, 3);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 91 + y, 1, 3);
        g2d.fillRect(111 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 91 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 3);
        g2d.fillRect(113 + x, 94 + y, 1, 2);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 4);
        g2d.fillRect(112 + x, 95 + y, 1, 4);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(117 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 95 + y, 1, 6);
        g2d.fillRect(115 + x, 97 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 5);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 5);
        g2d.fillRect(112 + x, 100 + y, 1, 2);
        g2d.fillRect(113 + x, 100 + y, 1, 4);
        g2d.fillRect(114 + x, 100 + y, 1, 10);
        g2d.fillRect(116 + x, 100 + y, 1, 4);
        g2d.fillRect(115 + x, 102 + y, 1, 2);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 3);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 109 + y, 1, 6);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 7);
        g2d.fillRect(115 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 11);
        g2d.fillRect(115 + x, 117 + y, 1, 1);
        g2d.fillRect(118 + x, 118 + y, 1, 4);
        g2d.fillRect(117 + x, 121 + y, 1, 2);
        g2d.fillRect(117 + x, 125 + y, 1, 3);
        g2d.fillRect(118 + x, 125 + y, 1, 11);
        g2d.fillRect(116 + x, 126 + y, 1, 3);
        g2d.fillRect(117 + x, 129 + y, 1, 3);
        g2d.fillRect(116 + x, 130 + y, 1, 2);
        g2d.fillRect(119 + x, 133 + y, 1, 7);
        g2d.fillRect(117 + x, 134 + y, 1, 3);
        g2d.fillRect(118 + x, 137 + y, 1, 10);
        g2d.fillRect(117 + x, 138 + y, 1, 3);
        g2d.fillRect(120 + x, 138 + y, 1, 2);
        g2d.fillRect(120 + x, 141 + y, 1, 6);
        g2d.fillRect(121 + x, 143 + y, 1, 1);
        g2d.fillRect(119 + x, 144 + y, 1, 7);
        g2d.fillRect(122 + x, 147 + y, 1, 8);
        g2d.fillRect(120 + x, 148 + y, 1, 4);
        g2d.fillRect(121 + x, 148 + y, 1, 1);
        g2d.fillRect(121 + x, 151 + y, 1, 5);
        g2d.fillRect(123 + x, 155 + y, 1, 1);
        g2d.fillRect(122 + x, 156 + y, 1, 3);
        g2d.fillRect(124 + x, 157 + y, 1, 5);
        g2d.fillRect(125 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 1, 4);
        g2d.fillRect(111 + x, 69 + y, 1, 3);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 3);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 3);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 4);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 2, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 4);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 3);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 3);
        g2d.fillRect(113 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 1);
        g2d.fillRect(114 + x, 99 + y, 2, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 104 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 2);
        g2d.fillRect(118 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 119 + y, 1, 2);
        g2d.fillRect(116 + x, 129 + y, 1, 1);
        g2d.fillRect(117 + x, 133 + y, 1, 1);
        g2d.fillRect(119 + x, 140 + y, 2, 1);
        g2d.fillRect(119 + x, 143 + y, 1, 1);
        g2d.fillRect(123 + x, 156 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 3);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 2, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 3);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 2);
        g2d.fillRect(118 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 1);
        g2d.fillRect(117 + x, 128 + y, 1, 1);
        g2d.fillRect(117 + x, 132 + y, 1, 1);
        g2d.fillRect(119 + x, 141 + y, 1, 2);
        g2d.fillRect(121 + x, 149 + y, 1, 2);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(103 + x, 75 + y, 2, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 7);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 21);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 2, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 2, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 3);
        g2d.fillRect(110 + x, 99 + y, 1, 3);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 6);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(120 + x, 105 + y, 1, 23);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 110 + y, 1, 9);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 7);
        g2d.fillRect(119 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 2);
        g2d.fillRect(115 + x, 126 + y, 1, 7);
        g2d.fillRect(121 + x, 128 + y, 1, 5);
        g2d.fillRect(116 + x, 133 + y, 1, 8);
        g2d.fillRect(122 + x, 133 + y, 1, 5);
        g2d.fillRect(123 + x, 139 + y, 1, 6);
        g2d.fillRect(117 + x, 141 + y, 1, 6);
        g2d.fillRect(124 + x, 144 + y, 1, 3);
        g2d.fillRect(118 + x, 147 + y, 1, 5);
        g2d.fillRect(125 + x, 147 + y, 1, 4);
        g2d.fillRect(126 + x, 151 + y, 1, 2);
        g2d.fillRect(119 + x, 152 + y, 1, 1);
        g2d.fillRect(120 + x, 153 + y, 1, 2);
        g2d.fillRect(127 + x, 154 + y, 1, 3);
        g2d.fillRect(121 + x, 155 + y, 1, 2);
        g2d.fillRect(122 + x, 157 + y, 1, 3);
        g2d.fillRect(128 + x, 158 + y, 1, 2);
        g2d.fillRect(123 + x, 160 + y, 1, 2);
        g2d.fillRect(129 + x, 160 + y, 1, 4);
        g2d.fillRect(124 + x, 162 + y, 1, 1);
        g2d.fillRect(125 + x, 163 + y, 1, 4);
        g2d.fillRect(128 + x, 164 + y, 1, 1);
        g2d.fillRect(126 + x, 166 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 41 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 2, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(104 + x, 61 + y, 1, 12);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 2, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 6);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 5);
        g2d.fillRect(117 + x, 70 + y, 1, 8);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(110 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 4);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 3);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 10);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 10);
        g2d.fillRect(109 + x, 79 + y, 2, 1);
        g2d.fillRect(114 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 5);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 2, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 3);
        g2d.fillRect(105 + x, 81 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 9);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(118 + x, 85 + y, 1, 4);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 3);
        g2d.fillRect(114 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 92 + y, 1, 3);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 7);
        g2d.fillRect(109 + x, 95 + y, 2, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 3);
        g2d.fillRect(114 + x, 98 + y, 1, 1);
        g2d.fillRect(111 + x, 99 + y, 1, 3);
        g2d.fillRect(112 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 2);
        g2d.fillRect(112 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(113 + x, 104 + y, 1, 6);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 17);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 4);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 3);
        g2d.fillRect(114 + x, 115 + y, 1, 4);
        g2d.fillRect(115 + x, 118 + y, 1, 8);
        g2d.fillRect(118 + x, 122 + y, 1, 1);
        g2d.fillRect(117 + x, 123 + y, 1, 2);
        g2d.fillRect(119 + x, 123 + y, 1, 5);
        g2d.fillRect(116 + x, 125 + y, 1, 8);
        g2d.fillRect(120 + x, 128 + y, 1, 5);
        g2d.fillRect(117 + x, 132 + y, 1, 9);
        g2d.fillRect(121 + x, 133 + y, 1, 5);
        g2d.fillRect(119 + x, 136 + y, 1, 1);
        g2d.fillRect(118 + x, 137 + y, 1, 1);
        g2d.fillRect(122 + x, 138 + y, 1, 5);
        g2d.fillRect(118 + x, 141 + y, 1, 6);
        g2d.fillRect(122 + x, 144 + y, 1, 4);
        g2d.fillRect(123 + x, 145 + y, 1, 2);
        g2d.fillRect(119 + x, 147 + y, 1, 5);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(124 + x, 147 + y, 1, 4);
        g2d.fillRect(120 + x, 151 + y, 1, 2);
        g2d.fillRect(125 + x, 151 + y, 1, 4);
        g2d.fillRect(121 + x, 152 + y, 1, 3);
        g2d.fillRect(122 + x, 153 + y, 1, 4);
        g2d.fillRect(126 + x, 153 + y, 1, 4);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(123 + x, 156 + y, 1, 4);
        g2d.fillRect(127 + x, 157 + y, 1, 5);
        g2d.fillRect(124 + x, 159 + y, 1, 3);
        g2d.fillRect(125 + x, 160 + y, 1, 3);
        g2d.fillRect(128 + x, 160 + y, 1, 4);
        g2d.fillRect(126 + x, 162 + y, 1, 4);
        g2d.fillRect(127 + x, 163 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 1, 4);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 4);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 4);
        g2d.fillRect(111 + x, 65 + y, 1, 4);
        g2d.fillRect(112 + x, 65 + y, 1, 11);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(114 + x, 68 + y, 1, 8);
        g2d.fillRect(105 + x, 69 + y, 1, 6);
        g2d.fillRect(106 + x, 69 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(106 + x, 71 + y, 2, 1);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 75 + y, 2, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 76 + y, 2, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 4);
        g2d.fillRect(114 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 8);
        g2d.fillRect(103 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 2, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 3);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 2, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 4);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 3);
        g2d.fillRect(106 + x, 85 + y, 1, 3);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(109 + x, 88 + y, 1, 6);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 3);
        g2d.fillRect(107 + x, 89 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(113 + x, 89 + y, 1, 3);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(110 + x, 91 + y, 1, 3);
        g2d.fillRect(111 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 91 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 3);
        g2d.fillRect(113 + x, 94 + y, 1, 2);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 4);
        g2d.fillRect(112 + x, 95 + y, 1, 4);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(117 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 95 + y, 1, 6);
        g2d.fillRect(115 + x, 97 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 5);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 5);
        g2d.fillRect(112 + x, 100 + y, 1, 2);
        g2d.fillRect(113 + x, 100 + y, 1, 4);
        g2d.fillRect(114 + x, 100 + y, 1, 10);
        g2d.fillRect(116 + x, 100 + y, 1, 4);
        g2d.fillRect(115 + x, 102 + y, 1, 2);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 3);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 109 + y, 1, 6);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 7);
        g2d.fillRect(115 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 11);
        g2d.fillRect(115 + x, 117 + y, 1, 1);
        g2d.fillRect(118 + x, 118 + y, 1, 4);
        g2d.fillRect(117 + x, 121 + y, 1, 2);
        g2d.fillRect(117 + x, 125 + y, 1, 4);
        g2d.fillRect(118 + x, 125 + y, 1, 3);
        g2d.fillRect(119 + x, 128 + y, 1, 8);
        g2d.fillRect(118 + x, 129 + y, 1, 3);
        g2d.fillRect(117 + x, 130 + y, 1, 2);
        g2d.fillRect(120 + x, 133 + y, 1, 7);
        g2d.fillRect(118 + x, 134 + y, 1, 3);
        g2d.fillRect(119 + x, 137 + y, 1, 10);
        g2d.fillRect(118 + x, 138 + y, 1, 3);
        g2d.fillRect(121 + x, 138 + y, 1, 2);
        g2d.fillRect(121 + x, 141 + y, 1, 6);
        g2d.fillRect(122 + x, 143 + y, 1, 1);
        g2d.fillRect(120 + x, 144 + y, 1, 7);
        g2d.fillRect(123 + x, 147 + y, 1, 4);
        g2d.fillRect(121 + x, 148 + y, 1, 4);
        g2d.fillRect(122 + x, 148 + y, 1, 1);
        g2d.fillRect(122 + x, 151 + y, 1, 2);
        g2d.fillRect(124 + x, 151 + y, 1, 4);
        g2d.fillRect(123 + x, 152 + y, 1, 4);
        g2d.fillRect(125 + x, 155 + y, 1, 1);
        g2d.fillRect(124 + x, 156 + y, 1, 3);
        g2d.fillRect(126 + x, 157 + y, 1, 5);
        g2d.fillRect(127 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 1, 4);
        g2d.fillRect(111 + x, 69 + y, 1, 3);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 3);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 3);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 4);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 2, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 4);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 3);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 3);
        g2d.fillRect(113 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 1);
        g2d.fillRect(114 + x, 99 + y, 2, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 104 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 2);
        g2d.fillRect(118 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 119 + y, 1, 2);
        g2d.fillRect(117 + x, 129 + y, 1, 1);
        g2d.fillRect(118 + x, 133 + y, 1, 1);
        g2d.fillRect(120 + x, 140 + y, 2, 1);
        g2d.fillRect(120 + x, 143 + y, 1, 1);
        g2d.fillRect(123 + x, 151 + y, 1, 1);
        g2d.fillRect(125 + x, 156 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 3);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 2, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 3);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 2);
        g2d.fillRect(118 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 1);
        g2d.fillRect(118 + x, 128 + y, 1, 1);
        g2d.fillRect(118 + x, 132 + y, 1, 1);
        g2d.fillRect(120 + x, 141 + y, 1, 2);
        g2d.fillRect(122 + x, 149 + y, 1, 2);
    }
}
