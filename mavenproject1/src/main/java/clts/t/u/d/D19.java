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
public class D19 extends SuperTU
{

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }

    boolean originalColorArray = true;

    public D19()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        slenderS = true;
        platzHeight = 1;
    }

    public D19(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        slenderS = true;
        platzHeight = 1;
    }

    public D19(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        slenderS = true;
        platzHeight = 1;
    }

    public void drawBody(b.Bd bd)
    {
        bd.paintLegs = false;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);

        if(step == 14 || step == 15 || step == 0 || step == 1 || step == 2 || step == 3 || step == 4 || step == 5)
        {
            paintB1(x,0,g2d);
        }
        else
        {
            paintB2(x,0,g2d);
        }
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

    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,0,0,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 91 + y, 1, 3);
        g2d.fillRect(119 + x, 91 + y, 1, 9);
        g2d.fillRect(120 + x, 91 + y, 1, 5);
        g2d.fillRect(104 + x, 92 + y, 1, 4);
        g2d.fillRect(105 + x, 95 + y, 2, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 3);
        g2d.fillRect(107 + x, 96 + y, 1, 4);
        g2d.fillRect(108 + x, 96 + y, 1, 3);
        g2d.fillRect(109 + x, 97 + y, 1, 6);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 6);
        g2d.fillRect(117 + x, 108 + y, 1, 5);
        g2d.fillRect(107 + x, 112 + y, 1, 1);
        g2d.fillRect(112 + x, 127 + y, 1, 1);
        g2d.fillRect(121 + x, 133 + y, 1, 2);
        g2d.fillRect(122 + x, 135 + y, 1, 2);
        g2d.fillRect(123 + x, 137 + y, 1, 2);
        g2d.fillRect(112 + x, 139 + y, 1, 3);
        g2d.fillRect(124 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 141 + y, 1, 3);
        g2d.fillRect(114 + x, 145 + y, 1, 3);
        g2d.fillRect(127 + x, 145 + y, 1, 1);
        g2d.fillRect(128 + x, 146 + y, 1, 2);
        g2d.fillRect(129 + x, 148 + y, 2, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 2);
        g2d.fillRect(130 + x, 149 + y, 2, 1);
        g2d.fillRect(131 + x, 150 + y, 1, 1);
        g2d.fillRect(116 + x, 151 + y, 1, 3);
        g2d.fillRect(129 + x, 151 + y, 1, 2);
        g2d.fillRect(130 + x, 151 + y, 1, 1);
        g2d.fillRect(117 + x, 154 + y, 1, 3);
        g2d.fillRect(124 + x, 155 + y, 1, 2);
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(123 + x, 157 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 1, 2);
        g2d.fillRect(122 + x, 158 + y, 1, 4);
        g2d.fillRect(120 + x, 159 + y, 1, 1);
        g2d.fillRect(121 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(9,9,9,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 9);
        g2d.fillRect(110 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 1);
        g2d.fillRect(111 + x, 101 + y, 1, 3);
        g2d.fillRect(117 + x, 101 + y, 1, 7);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 3);
        g2d.fillRect(116 + x, 105 + y, 1, 3);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(107 + x, 109 + y, 1, 3);
        g2d.fillRect(108 + x, 112 + y, 1, 2);
        g2d.fillRect(109 + x, 114 + y, 1, 3);
        g2d.fillRect(110 + x, 115 + y, 1, 4);
        g2d.fillRect(111 + x, 118 + y, 1, 3);
        g2d.fillRect(115 + x, 127 + y, 1, 1);
        g2d.fillRect(112 + x, 128 + y, 1, 2);
        g2d.fillRect(112 + x, 131 + y, 1, 2);
        g2d.fillRect(119 + x, 131 + y, 1, 2);
        g2d.fillRect(120 + x, 132 + y, 1, 3);
        g2d.fillRect(112 + x, 135 + y, 1, 1);
        g2d.fillRect(121 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 137 + y, 1, 2);
        g2d.fillRect(122 + x, 137 + y, 1, 2);
        g2d.fillRect(113 + x, 139 + y, 1, 2);
        g2d.fillRect(123 + x, 139 + y, 1, 2);
        g2d.fillRect(124 + x, 141 + y, 1, 3);
        g2d.fillRect(125 + x, 142 + y, 1, 3);
        g2d.fillRect(126 + x, 144 + y, 1, 2);
        g2d.fillRect(115 + x, 146 + y, 1, 2);
        g2d.fillRect(127 + x, 146 + y, 1, 2);
        g2d.fillRect(128 + x, 148 + y, 1, 1);
        g2d.fillRect(111 + x, 149 + y, 1, 1);
        g2d.fillRect(110 + x, 151 + y, 1, 2);
        g2d.fillRect(128 + x, 151 + y, 1, 2);
        g2d.fillRect(125 + x, 154 + y, 1, 1);
        g2d.fillRect(123 + x, 155 + y, 1, 2);
        g2d.fillRect(119 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(18,18,18,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 3);
        g2d.fillRect(117 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 100 + y, 1, 1);
        g2d.fillRect(112 + x, 101 + y, 1, 2);
        g2d.fillRect(113 + x, 103 + y, 1, 2);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 2);
        g2d.fillRect(112 + x, 121 + y, 1, 1);
        g2d.fillRect(113 + x, 122 + y, 1, 1);
        g2d.fillRect(114 + x, 123 + y, 1, 1);
        g2d.fillRect(115 + x, 124 + y, 1, 3);
        g2d.fillRect(116 + x, 127 + y, 1, 3);
        g2d.fillRect(117 + x, 128 + y, 1, 3);
        g2d.fillRect(118 + x, 130 + y, 1, 2);
        g2d.fillRect(112 + x, 142 + y, 1, 8);
        g2d.fillRect(114 + x, 142 + y, 1, 3);
        g2d.fillRect(113 + x, 144 + y, 1, 4);
        g2d.fillRect(114 + x, 148 + y, 1, 5);
        g2d.fillRect(115 + x, 148 + y, 1, 1);
        g2d.fillRect(129 + x, 149 + y, 1, 2);
        g2d.fillRect(111 + x, 150 + y, 1, 3);
        g2d.fillRect(116 + x, 150 + y, 1, 1);
        g2d.fillRect(130 + x, 150 + y, 1, 1);
        g2d.fillRect(115 + x, 151 + y, 1, 4);
        g2d.fillRect(117 + x, 151 + y, 1, 3);
        g2d.fillRect(127 + x, 151 + y, 1, 3);
        g2d.fillRect(110 + x, 153 + y, 1, 1);
        g2d.fillRect(126 + x, 153 + y, 1, 1);
        g2d.fillRect(109 + x, 154 + y, 1, 4);
        g2d.fillRect(116 + x, 154 + y, 1, 4);
        g2d.fillRect(124 + x, 154 + y, 1, 1);
        g2d.fillRect(118 + x, 155 + y, 1, 2);
        g2d.fillRect(122 + x, 155 + y, 1, 3);
        g2d.fillRect(108 + x, 157 + y, 1, 3);
        g2d.fillRect(117 + x, 157 + y, 1, 2);
        g2d.fillRect(120 + x, 157 + y, 1, 2);
        g2d.fillRect(121 + x, 157 + y, 1, 3);
        g2d.fillRect(107 + x, 158 + y, 1, 2);
        g2d.fillRect(118 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 160 + y, 1, 2);
        g2d.fillRect(120 + x, 160 + y, 1, 2);
        g2d.fillRect(106 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21,21,21,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 121 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25,25,25,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(118 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 97 + y, 1, 4);
        g2d.fillRect(114 + x, 126 + y, 1, 4);
        g2d.fillRect(113 + x, 128 + y, 1, 2);
        g2d.fillRect(120 + x, 135 + y, 1, 1);
        g2d.fillRect(121 + x, 136 + y, 1, 1);
        g2d.fillRect(113 + x, 137 + y, 1, 2);
        g2d.fillRect(122 + x, 139 + y, 1, 1);
        g2d.fillRect(114 + x, 140 + y, 1, 2);
        g2d.fillRect(128 + x, 149 + y, 1, 2);
        g2d.fillRect(127 + x, 150 + y, 1, 1);
        g2d.fillRect(125 + x, 153 + y, 1, 1);
        g2d.fillRect(123 + x, 154 + y, 1, 1);
        g2d.fillRect(106 + x, 160 + y, 1, 3);
        g2d.fillRect(107 + x, 160 + y, 1, 2);
        g2d.fillRect(117 + x, 160 + y, 1, 2);
        g2d.fillRect(105 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(34,34,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 2);
        g2d.fillRect(112 + x, 99 + y, 1, 2);
        g2d.fillRect(113 + x, 99 + y, 1, 4);
        g2d.fillRect(116 + x, 100 + y, 1, 1);
        g2d.fillRect(115 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 113 + y, 1, 2);
        g2d.fillRect(108 + x, 114 + y, 1, 4);
        g2d.fillRect(109 + x, 117 + y, 1, 2);
        g2d.fillRect(110 + x, 119 + y, 1, 3);
        g2d.fillRect(111 + x, 123 + y, 1, 1);
        g2d.fillRect(112 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 128 + y, 1, 3);
        g2d.fillRect(113 + x, 130 + y, 1, 2);
        g2d.fillRect(116 + x, 130 + y, 1, 1);
        g2d.fillRect(119 + x, 133 + y, 1, 2);
        g2d.fillRect(113 + x, 136 + y, 1, 1);
        g2d.fillRect(121 + x, 137 + y, 1, 2);
        g2d.fillRect(114 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 145 + y, 1, 1);
        g2d.fillRect(113 + x, 148 + y, 1, 2);
        g2d.fillRect(116 + x, 148 + y, 1, 2);
        g2d.fillRect(112 + x, 150 + y, 1, 3);
        g2d.fillRect(117 + x, 150 + y, 1, 1);
        g2d.fillRect(118 + x, 151 + y, 1, 4);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(114 + x, 153 + y, 1, 4);
        g2d.fillRect(110 + x, 154 + y, 1, 5);
        g2d.fillRect(119 + x, 154 + y, 1, 3);
        g2d.fillRect(115 + x, 155 + y, 1, 3);
        g2d.fillRect(120 + x, 155 + y, 1, 2);
        g2d.fillRect(121 + x, 155 + y, 1, 2);
        g2d.fillRect(109 + x, 158 + y, 1, 4);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(117 + x, 159 + y, 1, 1);
        g2d.fillRect(108 + x, 160 + y, 1, 2);
        g2d.fillRect(118 + x, 160 + y, 1, 3);
        g2d.fillRect(107 + x, 162 + y, 1, 1);
        g2d.fillRect(119 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(42,42,42,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 91 + y, 1, 3);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 2);
        g2d.fillRect(116 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(111 + x, 121 + y, 1, 2);
        g2d.fillRect(112 + x, 122 + y, 1, 4);
        g2d.fillRect(113 + x, 124 + y, 1, 4);
        g2d.fillRect(115 + x, 131 + y, 3, 1);
        g2d.fillRect(113 + x, 132 + y, 1, 4);
        g2d.fillRect(117 + x, 132 + y, 2, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 2);
        g2d.fillRect(115 + x, 142 + y, 1, 3);
        g2d.fillRect(116 + x, 145 + y, 1, 3);
        g2d.fillRect(127 + x, 148 + y, 1, 1);
        g2d.fillRect(117 + x, 149 + y, 1, 1);
        g2d.fillRect(126 + x, 151 + y, 1, 2);
        g2d.fillRect(107 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51,51,51,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 2, 1);
        g2d.fillRect(111 + x, 95 + y, 2, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 96 + y, 1, 3);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(113 + x, 123 + y, 1, 1);
        g2d.fillRect(114 + x, 124 + y, 1, 2);
        g2d.fillRect(114 + x, 130 + y, 1, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 1);
        g2d.fillRect(114 + x, 135 + y, 1, 2);
        g2d.fillRect(115 + x, 141 + y, 1, 1);
        g2d.fillRect(123 + x, 141 + y, 1, 1);
        g2d.fillRect(127 + x, 149 + y, 1, 1);
        g2d.fillRect(118 + x, 150 + y, 1, 1);
        g2d.fillRect(126 + x, 150 + y, 1, 1);
        g2d.fillRect(119 + x, 151 + y, 1, 3);
        g2d.fillRect(120 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58,58,58,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 1, 3);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 4);
        g2d.fillRect(115 + x, 97 + y, 1, 2);
        g2d.fillRect(114 + x, 131 + y, 1, 2);
        g2d.fillRect(121 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 140 + y, 1, 1);
        g2d.fillRect(122 + x, 140 + y, 1, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 149 + y, 1, 1);
        g2d.fillRect(125 + x, 151 + y, 1, 2);
        g2d.fillRect(120 + x, 153 + y, 1, 1);
        g2d.fillRect(124 + x, 153 + y, 1, 1);
        g2d.fillRect(121 + x, 154 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62,62,62,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 136 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66,66,66,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 137 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68,68,68,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 132 + y, 1, 1);
        g2d.fillRect(114 + x, 133 + y, 1, 2);
        g2d.fillRect(118 + x, 133 + y, 1, 2);
        g2d.fillRect(119 + x, 135 + y, 1, 1);
        g2d.fillRect(115 + x, 139 + y, 1, 1);
        g2d.fillRect(116 + x, 144 + y, 1, 1);
        g2d.fillRect(117 + x, 146 + y, 1, 2);
        g2d.fillRect(126 + x, 146 + y, 1, 2);
        g2d.fillRect(113 + x, 150 + y, 1, 8);
        g2d.fillRect(112 + x, 153 + y, 1, 1);
        g2d.fillRect(122 + x, 153 + y, 1, 1);
        g2d.fillRect(111 + x, 154 + y, 1, 4);
        g2d.fillRect(114 + x, 157 + y, 1, 2);
        g2d.fillRect(115 + x, 158 + y, 1, 2);
        g2d.fillRect(110 + x, 159 + y, 1, 3);
        g2d.fillRect(116 + x, 159 + y, 1, 4);
        g2d.fillRect(108 + x, 162 + y, 1, 2);
        g2d.fillRect(109 + x, 162 + y, 1, 1);
        g2d.fillRect(117 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75,75,75,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 6);
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(110 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 2);
        g2d.fillRect(112 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 133 + y, 1, 2);
        g2d.fillRect(117 + x, 133 + y, 1, 2);
        g2d.fillRect(118 + x, 135 + y, 1, 1);
        g2d.fillRect(119 + x, 136 + y, 1, 1);
        g2d.fillRect(120 + x, 139 + y, 1, 1);
        g2d.fillRect(116 + x, 142 + y, 1, 2);
        g2d.fillRect(124 + x, 144 + y, 1, 1);
        g2d.fillRect(125 + x, 145 + y, 1, 1);
        g2d.fillRect(126 + x, 148 + y, 1, 1);
        g2d.fillRect(123 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(103 + x, 97 + y, 1, 3);
        g2d.fillRect(104 + x, 101 + y, 1, 3);
        g2d.fillRect(105 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 4);
        g2d.fillRect(108 + x, 118 + y, 1, 1);
        g2d.fillRect(107 + x, 119 + y, 1, 5);
        g2d.fillRect(110 + x, 122 + y, 1, 1);
        g2d.fillRect(109 + x, 123 + y, 1, 3);
        g2d.fillRect(106 + x, 124 + y, 1, 4);
        g2d.fillRect(107 + x, 126 + y, 1, 2);
        g2d.fillRect(108 + x, 126 + y, 1, 1);
        g2d.fillRect(120 + x, 128 + y, 1, 2);
        g2d.fillRect(121 + x, 131 + y, 1, 2);
        g2d.fillRect(111 + x, 144 + y, 1, 5);
        g2d.fillRect(110 + x, 149 + y, 1, 2);
        g2d.fillRect(109 + x, 151 + y, 1, 3);
        g2d.fillRect(108 + x, 153 + y, 1, 4);
        g2d.fillRect(99 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82,82,82,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 133 + y, 1, 3);
        g2d.fillRect(117 + x, 135 + y, 1, 1);
        g2d.fillRect(118 + x, 136 + y, 1, 1);
        g2d.fillRect(119 + x, 137 + y, 1, 2);
        g2d.fillRect(121 + x, 140 + y, 1, 1);
        g2d.fillRect(122 + x, 141 + y, 1, 1);
        g2d.fillRect(123 + x, 142 + y, 1, 2);
        g2d.fillRect(124 + x, 145 + y, 1, 1);
        g2d.fillRect(125 + x, 146 + y, 1, 2);
        g2d.fillRect(118 + x, 148 + y, 1, 1);
        g2d.fillRect(126 + x, 149 + y, 1, 1);
        g2d.fillRect(119 + x, 150 + y, 1, 1);
        g2d.fillRect(120 + x, 151 + y, 1, 2);
        g2d.fillRect(121 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157,4,89,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(111 + x, 142 + y, 1, 2);
        g2d.fillRect(100 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(162,9,94,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 108 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 2);
        g2d.fillRect(116 + x, 114 + y, 1, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 2);
        g2d.fillRect(118 + x, 122 + y, 1, 2);
        g2d.fillRect(118 + x, 126 + y, 2, 1);
        g2d.fillRect(119 + x, 127 + y, 1, 1);
        g2d.fillRect(106 + x, 128 + y, 1, 3);
        g2d.fillRect(112 + x, 130 + y, 1, 1);
        g2d.fillRect(112 + x, 133 + y, 1, 2);
        g2d.fillRect(112 + x, 136 + y, 1, 1);
        g2d.fillRect(111 + x, 139 + y, 1, 3);
        g2d.fillRect(107 + x, 155 + y, 1, 3);
        g2d.fillRect(100 + x, 160 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91,91,91,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 135 + y, 1, 1);
        g2d.fillRect(117 + x, 136 + y, 1, 1);
        g2d.fillRect(115 + x, 137 + y, 1, 2);
        g2d.fillRect(122 + x, 142 + y, 1, 2);
        g2d.fillRect(123 + x, 144 + y, 1, 1);
        g2d.fillRect(117 + x, 145 + y, 1, 1);
        g2d.fillRect(118 + x, 146 + y, 1, 2);
        g2d.fillRect(119 + x, 149 + y, 1, 1);
        g2d.fillRect(120 + x, 150 + y, 1, 1);
        g2d.fillRect(124 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 5);
        g2d.fillRect(105 + x, 97 + y, 1, 7);
        g2d.fillRect(106 + x, 99 + y, 1, 4);
        g2d.fillRect(108 + x, 99 + y, 1, 2);
        g2d.fillRect(106 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 2);
        g2d.fillRect(108 + x, 119 + y, 1, 7);
        g2d.fillRect(109 + x, 119 + y, 1, 4);
        g2d.fillRect(107 + x, 124 + y, 1, 2);
        g2d.fillRect(111 + x, 124 + y, 1, 2);
        g2d.fillRect(111 + x, 127 + y, 1, 3);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(110 + x, 146 + y, 1, 3);
        g2d.fillRect(109 + x, 148 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 118 + y, 1, 3);
        g2d.fillRect(118 + x, 124 + y, 1, 2);
        g2d.fillRect(105 + x, 131 + y, 1, 2);
        g2d.fillRect(101 + x, 159 + y, 1, 3);
        g2d.fillRect(106 + x, 159 + y, 1, 1);
        g2d.fillRect(105 + x, 160 + y, 1, 3);
        g2d.fillRect(102 + x, 162 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,99,99,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 91 + y, 3, 1);
        g2d.fillRect(115 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 139 + y, 1, 1);
        g2d.fillRect(116 + x, 141 + y, 1, 1);
        g2d.fillRect(121 + x, 141 + y, 1, 1);
        g2d.fillRect(117 + x, 144 + y, 1, 1);
        g2d.fillRect(118 + x, 145 + y, 1, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(125 + x, 150 + y, 1, 1);
        g2d.fillRect(122 + x, 151 + y, 1, 2);
        g2d.fillRect(123 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213,9,94,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 2);
        g2d.fillRect(114 + x, 105 + y, 1, 3);
        g2d.fillRect(106 + x, 106 + y, 1, 2);
        g2d.fillRect(107 + x, 106 + y, 1, 3);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 5);
        g2d.fillRect(108 + x, 110 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 3);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 4);
        g2d.fillRect(117 + x, 119 + y, 1, 3);
        g2d.fillRect(111 + x, 126 + y, 1, 1);
        g2d.fillRect(107 + x, 128 + y, 1, 2);
        g2d.fillRect(119 + x, 128 + y, 1, 3);
        g2d.fillRect(111 + x, 130 + y, 1, 2);
        g2d.fillRect(110 + x, 142 + y, 1, 4);
        g2d.fillRect(108 + x, 150 + y, 1, 1);
        g2d.fillRect(107 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108,108,108,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 136 + y, 1, 3);
        g2d.fillRect(118 + x, 137 + y, 1, 2);
        g2d.fillRect(119 + x, 139 + y, 1, 1);
        g2d.fillRect(120 + x, 140 + y, 1, 1);
        g2d.fillRect(122 + x, 144 + y, 1, 1);
        g2d.fillRect(123 + x, 145 + y, 1, 1);
        g2d.fillRect(119 + x, 146 + y, 1, 2);
        g2d.fillRect(125 + x, 149 + y, 1, 1);
        g2d.fillRect(121 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185,32,117,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(105 + x, 133 + y, 1, 2);
        g2d.fillRect(104 + x, 136 + y, 1, 3);
        g2d.fillRect(101 + x, 157 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,1,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(107 + x, 100 + y, 1, 5);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(114 + x, 108 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 7);
        g2d.fillRect(108 + x, 127 + y, 1, 3);
        g2d.fillRect(120 + x, 131 + y, 1, 1);
        g2d.fillRect(109 + x, 145 + y, 1, 3);
        g2d.fillRect(108 + x, 148 + y, 1, 2);
        g2d.fillRect(108 + x, 151 + y, 1, 2);
        g2d.fillRect(112 + x, 154 + y, 1, 5);
        g2d.fillRect(111 + x, 158 + y, 1, 5);
        g2d.fillRect(113 + x, 158 + y, 1, 2);
        g2d.fillRect(114 + x, 159 + y, 1, 4);
        g2d.fillRect(115 + x, 160 + y, 1, 4);
        g2d.fillRect(110 + x, 162 + y, 1, 2);
        g2d.fillRect(109 + x, 163 + y, 1, 1);
        g2d.fillRect(116 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(108 + x, 106 + y, 1, 2);
        g2d.fillRect(113 + x, 113 + y, 1, 4);
        g2d.fillRect(112 + x, 115 + y, 1, 3);
        g2d.fillRect(115 + x, 115 + y, 1, 4);
        g2d.fillRect(111 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 4);
        g2d.fillRect(117 + x, 122 + y, 1, 4);
        g2d.fillRect(107 + x, 130 + y, 1, 1);
        g2d.fillRect(106 + x, 131 + y, 1, 1);
        g2d.fillRect(111 + x, 132 + y, 1, 7);
        g2d.fillRect(110 + x, 141 + y, 1, 1);
        g2d.fillRect(106 + x, 157 + y, 1, 2);
        g2d.fillRect(102 + x, 160 + y, 1, 2);
        g2d.fillRect(104 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,117,117,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 137 + y, 1, 3);
        g2d.fillRect(118 + x, 139 + y, 1, 1);
        g2d.fillRect(116 + x, 140 + y, 1, 1);
        g2d.fillRect(119 + x, 140 + y, 1, 1);
        g2d.fillRect(117 + x, 141 + y, 1, 1);
        g2d.fillRect(120 + x, 141 + y, 1, 1);
        g2d.fillRect(121 + x, 142 + y, 1, 2);
        g2d.fillRect(124 + x, 146 + y, 1, 2);
        g2d.fillRect(121 + x, 150 + y, 1, 1);
        g2d.fillRect(124 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195,42,127,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(105 + x, 135 + y, 1, 1);
        g2d.fillRect(104 + x, 139 + y, 1, 5);
        g2d.fillRect(103 + x, 145 + y, 1, 6);
        g2d.fillRect(102 + x, 151 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,123,123,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 140 + y, 2, 1);
        g2d.fillRect(117 + x, 142 + y, 1, 2);
        g2d.fillRect(125 + x, 148 + y, 1, 1);
        g2d.fillRect(122 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233,29,114,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(107 + x, 131 + y, 1, 1);
        g2d.fillRect(106 + x, 132 + y, 1, 1);
        g2d.fillRect(110 + x, 139 + y, 1, 2);
        g2d.fillRect(106 + x, 155 + y, 1, 2);
        g2d.fillRect(102 + x, 158 + y, 1, 1);
        g2d.fillRect(105 + x, 158 + y, 1, 2);
        g2d.fillRect(103 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(107 + x, 105 + y, 2, 1);
        g2d.fillRect(109 + x, 106 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 1, 2);
        g2d.fillRect(109 + x, 109 + y, 1, 4);
        g2d.fillRect(113 + x, 109 + y, 1, 4);
        g2d.fillRect(110 + x, 112 + y, 1, 3);
        g2d.fillRect(112 + x, 112 + y, 1, 3);
        g2d.fillRect(111 + x, 114 + y, 1, 3);
        g2d.fillRect(114 + x, 115 + y, 1, 6);
        g2d.fillRect(115 + x, 119 + y, 1, 4);
        g2d.fillRect(116 + x, 123 + y, 1, 3);
        g2d.fillRect(117 + x, 126 + y, 1, 1);
        g2d.fillRect(118 + x, 127 + y, 1, 3);
        g2d.fillRect(108 + x, 130 + y, 1, 2);
        g2d.fillRect(110 + x, 130 + y, 1, 3);
        g2d.fillRect(109 + x, 142 + y, 1, 3);
        g2d.fillRect(108 + x, 146 + y, 1, 2);
        g2d.fillRect(107 + x, 149 + y, 1, 5);
        g2d.fillRect(106 + x, 153 + y, 1, 2);
        g2d.fillRect(102 + x, 159 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,36,90,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(108 + x, 103 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131,131,131,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 141 + y, 1, 1);
        g2d.fillRect(118 + x, 144 + y, 1, 1);
        g2d.fillRect(123 + x, 146 + y, 1, 2);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(121 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205,52,137,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(104 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,63,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(110 + x, 101 + y, 1, 2);
        g2d.fillRect(110 + x, 104 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 2);
        g2d.fillRect(113 + x, 160 + y, 1, 2);
        g2d.fillRect(111 + x, 163 + y, 2, 1);
        g2d.fillRect(114 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244,37,122,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(107 + x, 132 + y, 1, 1);
        g2d.fillRect(106 + x, 133 + y, 1, 2);
        g2d.fillRect(110 + x, 133 + y, 1, 2);
        g2d.fillRect(110 + x, 136 + y, 1, 3);
        g2d.fillRect(109 + x, 141 + y, 1, 1);
        g2d.fillRect(103 + x, 154 + y, 1, 1);
        g2d.fillRect(105 + x, 155 + y, 1, 3);
        g2d.fillRect(104 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,70,94,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(109 + x, 103 + y, 1, 3);
        g2d.fillRect(110 + x, 103 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 2, 1);
        g2d.fillRect(112 + x, 108 + y, 2, 1);
        g2d.fillRect(113 + x, 118 + y, 1, 1);
        g2d.fillRect(117 + x, 127 + y, 1, 1);
        g2d.fillRect(109 + x, 128 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,140,140,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 141 + y, 1, 3);
        g2d.fillRect(118 + x, 142 + y, 1, 2);
        g2d.fillRect(120 + x, 142 + y, 1, 3);
        g2d.fillRect(121 + x, 144 + y, 1, 1);
        g2d.fillRect(119 + x, 145 + y, 1, 1);
        g2d.fillRect(122 + x, 145 + y, 1, 1);
        g2d.fillRect(120 + x, 146 + y, 1, 2);
        g2d.fillRect(123 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251,48,133,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(108 + x, 132 + y, 1, 1);
        g2d.fillRect(107 + x, 133 + y, 1, 2);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(110 + x, 135 + y, 1, 1);
        g2d.fillRect(105 + x, 136 + y, 1, 4);
        g2d.fillRect(105 + x, 142 + y, 1, 7);
        g2d.fillRect(106 + x, 144 + y, 1, 2);
        g2d.fillRect(104 + x, 145 + y, 1, 8);
        g2d.fillRect(103 + x, 151 + y, 1, 3);
        g2d.fillRect(103 + x, 155 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,96,86,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 159 + y, 1, 4);
        g2d.fillRect(113 + x, 162 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,83,105,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 106 + y, 1, 2);
        g2d.fillRect(113 + x, 106 + y, 1, 2);
        g2d.fillRect(109 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 3);
        g2d.fillRect(110 + x, 110 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 4);
        g2d.fillRect(113 + x, 119 + y, 1, 2);
        g2d.fillRect(114 + x, 121 + y, 1, 1);
        g2d.fillRect(115 + x, 123 + y, 1, 1);
        g2d.fillRect(116 + x, 126 + y, 1, 1);
        g2d.fillRect(109 + x, 130 + y, 1, 2);
        g2d.fillRect(108 + x, 144 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,148,148,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(119 + x, 144 + y, 1, 1);
        g2d.fillRect(121 + x, 148 + y, 1, 1);
        g2d.fillRect(124 + x, 148 + y, 1, 2);
        g2d.fillRect(122 + x, 149 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,62,147,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(107 + x, 135 + y, 1, 5);
        g2d.fillRect(106 + x, 136 + y, 1, 3);
        g2d.fillRect(105 + x, 140 + y, 1, 2);
        g2d.fillRect(106 + x, 140 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(155,155,155,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 145 + y, 2, 1);
        g2d.fillRect(121 + x, 146 + y, 1, 2);
        g2d.fillRect(122 + x, 148 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,110,100,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 105 + y, 1, 3);
        g2d.fillRect(111 + x, 106 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,119,109,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 108 + y, 1, 2);
        g2d.fillRect(111 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 122 + y, 1, 1);
        g2d.fillRect(107 + x, 146 + y, 1, 3);
        g2d.fillRect(106 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,74,159,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 139 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,106,128,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(109 + x, 132 + y, 1, 1);
        g2d.fillRect(108 + x, 133 + y, 1, 2);
        g2d.fillRect(107 + x, 142 + y, 1, 4);
        g2d.fillRect(108 + x, 142 + y, 1, 2);
        g2d.fillRect(106 + x, 146 + y, 1, 2);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(104 + x, 155 + y, 1, 3);
        g2d.fillRect(103 + x, 157 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,164,164,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(122 + x, 146 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247,133,123,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 140 + y, 1, 1);
        g2d.fillRect(106 + x, 148 + y, 1, 3);
        g2d.fillRect(105 + x, 149 + y, 1, 5);
        g2d.fillRect(104 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,124,146,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(108 + x, 135 + y, 1, 2);
        g2d.fillRect(107 + x, 140 + y, 1, 2);
        g2d.fillRect(108 + x, 140 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253,147,136,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 133 + y, 1, 7);
        g2d.fillRect(108 + x, 141 + y, 1, 1);
        g2d.fillRect(104 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,161,149,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 137 + y, 1, 3);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,0,0,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 60 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(105 + x, 47 + y, 1, 3);
        g2d.fillRect(114 + x, 47 + y, 1, 3);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157,4,89,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(162,9,94,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 2, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 5, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 3, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 4);
        g2d.fillRect(116 + x, 47 + y, 2, 1);
        g2d.fillRect(103 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 48 + y, 2, 1);
        g2d.fillRect(118 + x, 49 + y, 2, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(108 + x, 53 + y, 1, 3);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213,9,94,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 3);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(113 + x, 55 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185,32,117,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,1,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 3);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 4, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233,29,114,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 3, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(102 + x, 50 + y, 2, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244,37,122,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(102 + x, 51 + y, 3, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 3, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251,48,133,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(104 + x, 52 + y, 2, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 2, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,83,105,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(117 + x, 51 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,62,147,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,74,159,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,106,128,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,81,166,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(105 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247,133,123,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,84,169,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,124,146,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(103 + x, 52 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253,147,136,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 3);
        g2d.fillRect(116 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,131,172,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(103 + x, 53 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,161,149,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 53 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,156,173,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(104 + x, 53 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,185,175,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,0,0,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 60 + y, 2, 1);
        g2d.fillRect(112 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 61 + y, 2, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 5);
        g2d.fillRect(116 + x, 62 + y, 1, 8);
        g2d.fillRect(103 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 1, 3);
        g2d.fillRect(103 + x, 67 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 7);
        g2d.fillRect(118 + x, 70 + y, 1, 8);
        g2d.fillRect(103 + x, 71 + y, 1, 6);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 5);
        g2d.fillRect(119 + x, 73 + y, 1, 9);
        g2d.fillRect(101 + x, 77 + y, 1, 6);
        g2d.fillRect(120 + x, 78 + y, 1, 13);
        g2d.fillRect(100 + x, 79 + y, 1, 11);
        g2d.fillRect(121 + x, 81 + y, 1, 10);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 5);
        g2d.fillRect(119 + x, 88 + y, 1, 3);
        g2d.fillRect(118 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(9,9,9,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 4);
        g2d.fillRect(104 + x, 69 + y, 1, 6);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(18,18,18,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 62 + y, 1, 2);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 63 + y, 1, 3);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 3);
        g2d.fillRect(116 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 5);
        g2d.fillRect(118 + x, 78 + y, 1, 12);
        g2d.fillRect(119 + x, 82 + y, 1, 6);
        g2d.fillRect(101 + x, 83 + y, 1, 3);
        g2d.fillRect(102 + x, 85 + y, 1, 6);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25,25,25,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(104 + x, 66 + y, 1, 3);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(34,34,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 61 + y, 3, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(114 + x, 72 + y, 2, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 13);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(42,42,42,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 6);
        g2d.fillRect(105 + x, 68 + y, 1, 5);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 6);
        g2d.fillRect(104 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51,51,51,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 74 + y, 1, 4);
        g2d.fillRect(105 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 5);
        g2d.fillRect(116 + x, 80 + y, 1, 3);
        g2d.fillRect(117 + x, 85 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58,58,58,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 62 + y, 2, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 3);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68,68,68,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 8);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75,75,75,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 60 + y, 1, 3);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 4);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 4);
        g2d.fillRect(115 + x, 88 + y, 1, 3);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(103 + x, 40 + y, 1, 5);
        g2d.fillRect(112 + x, 40 + y, 3, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 4);
        g2d.fillRect(113 + x, 41 + y, 3, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 6);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(116 + x, 43 + y, 1, 3);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(104 + x, 45 + y, 1, 3);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(100 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82,82,82,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 2, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 4);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(105 + x, 78 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 4);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91,91,91,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 3);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 3);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(115 + x, 44 + y, 1, 4);
        g2d.fillRect(102 + x, 45 + y, 1, 3);
        g2d.fillRect(103 + x, 45 + y, 1, 3);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,99,99,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 63 + y, 1, 3);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 3);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 4);
        g2d.fillRect(114 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 4);
        g2d.fillRect(108 + x, 87 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 4);
        g2d.fillRect(109 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108,108,108,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 1, 4);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 3);
        g2d.fillRect(113 + x, 82 + y, 1, 4);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,117,117,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 2, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 3);
        g2d.fillRect(108 + x, 74 + y, 1, 4);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 4);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,123,123,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 4);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 4);
        g2d.fillRect(109 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 3);
        g2d.fillRect(112 + x, 88 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131,131,131,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,140,140,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 3);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 4);
        g2d.fillRect(109 + x, 82 + y, 1, 4);
        g2d.fillRect(110 + x, 83 + y, 1, 5);
        g2d.fillRect(111 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,148,148,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 75 + y, 1, 2);
        g2d.fillRect(111 + x, 82 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(155,155,155,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 79 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,164,164,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,170,170,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(189,189,189,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(193,193,193,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 2, 1);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,0,0,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 91 + y, 1, 5);
        g2d.fillRect(102 + x, 91 + y, 1, 9);
        g2d.fillRect(118 + x, 91 + y, 1, 3);
        g2d.fillRect(119 + x, 91 + y, 1, 4);
        g2d.fillRect(120 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 92 + y, 1, 4);
        g2d.fillRect(115 + x, 95 + y, 1, 4);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 96 + y, 1, 3);
        g2d.fillRect(114 + x, 96 + y, 1, 4);
        g2d.fillRect(112 + x, 97 + y, 1, 6);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 106 + y, 1, 6);
        g2d.fillRect(104 + x, 108 + y, 1, 5);
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(109 + x, 127 + y, 1, 1);
        g2d.fillRect(100 + x, 133 + y, 1, 2);
        g2d.fillRect(99 + x, 135 + y, 1, 2);
        g2d.fillRect(98 + x, 137 + y, 1, 2);
        g2d.fillRect(109 + x, 139 + y, 1, 3);
        g2d.fillRect(97 + x, 140 + y, 1, 1);
        g2d.fillRect(108 + x, 141 + y, 1, 3);
        g2d.fillRect(94 + x, 145 + y, 1, 1);
        g2d.fillRect(107 + x, 145 + y, 1, 3);
        g2d.fillRect(93 + x, 146 + y, 1, 2);
        g2d.fillRect(91 + x, 148 + y, 1, 2);
        g2d.fillRect(92 + x, 148 + y, 1, 1);
        g2d.fillRect(90 + x, 149 + y, 1, 2);
        g2d.fillRect(106 + x, 149 + y, 1, 2);
        g2d.fillRect(91 + x, 151 + y, 2, 1);
        g2d.fillRect(105 + x, 151 + y, 1, 3);
        g2d.fillRect(92 + x, 152 + y, 1, 1);
        g2d.fillRect(104 + x, 154 + y, 1, 3);
        g2d.fillRect(97 + x, 155 + y, 1, 2);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(103 + x, 157 + y, 1, 1);
        g2d.fillRect(99 + x, 158 + y, 1, 4);
        g2d.fillRect(102 + x, 158 + y, 1, 2);
        g2d.fillRect(101 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(9,9,9,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 9);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(111 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 7);
        g2d.fillRect(110 + x, 101 + y, 1, 3);
        g2d.fillRect(103 + x, 105 + y, 1, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 3);
        g2d.fillRect(106 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 105 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 3);
        g2d.fillRect(113 + x, 112 + y, 1, 2);
        g2d.fillRect(112 + x, 114 + y, 1, 3);
        g2d.fillRect(111 + x, 115 + y, 1, 4);
        g2d.fillRect(110 + x, 118 + y, 1, 3);
        g2d.fillRect(106 + x, 127 + y, 1, 1);
        g2d.fillRect(109 + x, 128 + y, 1, 2);
        g2d.fillRect(102 + x, 131 + y, 1, 2);
        g2d.fillRect(109 + x, 131 + y, 1, 2);
        g2d.fillRect(101 + x, 132 + y, 1, 3);
        g2d.fillRect(100 + x, 135 + y, 1, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 1);
        g2d.fillRect(99 + x, 137 + y, 1, 2);
        g2d.fillRect(109 + x, 137 + y, 1, 2);
        g2d.fillRect(98 + x, 139 + y, 1, 2);
        g2d.fillRect(108 + x, 139 + y, 1, 2);
        g2d.fillRect(97 + x, 141 + y, 1, 3);
        g2d.fillRect(96 + x, 142 + y, 1, 3);
        g2d.fillRect(95 + x, 144 + y, 1, 2);
        g2d.fillRect(94 + x, 146 + y, 1, 2);
        g2d.fillRect(106 + x, 146 + y, 1, 2);
        g2d.fillRect(93 + x, 148 + y, 1, 1);
        g2d.fillRect(110 + x, 149 + y, 1, 1);
        g2d.fillRect(93 + x, 151 + y, 1, 2);
        g2d.fillRect(111 + x, 151 + y, 1, 2);
        g2d.fillRect(96 + x, 154 + y, 1, 1);
        g2d.fillRect(98 + x, 155 + y, 1, 2);
        g2d.fillRect(102 + x, 157 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(18,18,18,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 2);
        g2d.fillRect(111 + x, 96 + y, 1, 3);
        g2d.fillRect(104 + x, 97 + y, 1, 2);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(109 + x, 101 + y, 1, 2);
        g2d.fillRect(105 + x, 103 + y, 1, 2);
        g2d.fillRect(107 + x, 103 + y, 2, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(107 + x, 123 + y, 1, 1);
        g2d.fillRect(106 + x, 124 + y, 1, 3);
        g2d.fillRect(105 + x, 127 + y, 1, 3);
        g2d.fillRect(104 + x, 128 + y, 1, 3);
        g2d.fillRect(103 + x, 130 + y, 1, 2);
        g2d.fillRect(107 + x, 142 + y, 1, 3);
        g2d.fillRect(109 + x, 142 + y, 1, 8);
        g2d.fillRect(108 + x, 144 + y, 1, 4);
        g2d.fillRect(106 + x, 148 + y, 2, 1);
        g2d.fillRect(92 + x, 149 + y, 1, 2);
        g2d.fillRect(107 + x, 149 + y, 1, 4);
        g2d.fillRect(91 + x, 150 + y, 1, 1);
        g2d.fillRect(105 + x, 150 + y, 1, 1);
        g2d.fillRect(110 + x, 150 + y, 1, 3);
        g2d.fillRect(94 + x, 151 + y, 1, 3);
        g2d.fillRect(104 + x, 151 + y, 1, 3);
        g2d.fillRect(106 + x, 151 + y, 1, 4);
        g2d.fillRect(95 + x, 153 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 1);
        g2d.fillRect(105 + x, 154 + y, 1, 4);
        g2d.fillRect(112 + x, 154 + y, 1, 4);
        g2d.fillRect(99 + x, 155 + y, 1, 3);
        g2d.fillRect(103 + x, 155 + y, 1, 2);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(101 + x, 157 + y, 1, 2);
        g2d.fillRect(104 + x, 157 + y, 1, 2);
        g2d.fillRect(113 + x, 157 + y, 1, 3);
        g2d.fillRect(103 + x, 158 + y, 1, 2);
        g2d.fillRect(114 + x, 158 + y, 1, 2);
        g2d.fillRect(101 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 160 + y, 1, 2);
        g2d.fillRect(115 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(21,21,21,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 121 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(25,25,25,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 97 + y, 1, 4);
        g2d.fillRect(107 + x, 126 + y, 1, 4);
        g2d.fillRect(108 + x, 128 + y, 1, 2);
        g2d.fillRect(101 + x, 135 + y, 1, 1);
        g2d.fillRect(100 + x, 136 + y, 1, 1);
        g2d.fillRect(108 + x, 137 + y, 1, 2);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(107 + x, 140 + y, 1, 2);
        g2d.fillRect(93 + x, 149 + y, 1, 2);
        g2d.fillRect(94 + x, 150 + y, 1, 1);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(98 + x, 154 + y, 1, 1);
        g2d.fillRect(104 + x, 160 + y, 1, 2);
        g2d.fillRect(114 + x, 160 + y, 1, 2);
        g2d.fillRect(115 + x, 160 + y, 1, 3);
        g2d.fillRect(116 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(34,34,34,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 2);
        g2d.fillRect(108 + x, 99 + y, 1, 4);
        g2d.fillRect(109 + x, 99 + y, 1, 2);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(106 + x, 101 + y, 1, 2);
        g2d.fillRect(106 + x, 104 + y, 1, 1);
        g2d.fillRect(114 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 114 + y, 1, 4);
        g2d.fillRect(112 + x, 117 + y, 1, 2);
        g2d.fillRect(111 + x, 119 + y, 1, 3);
        g2d.fillRect(110 + x, 123 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 1);
        g2d.fillRect(106 + x, 128 + y, 1, 3);
        g2d.fillRect(105 + x, 130 + y, 1, 1);
        g2d.fillRect(108 + x, 130 + y, 1, 2);
        g2d.fillRect(102 + x, 133 + y, 1, 2);
        g2d.fillRect(108 + x, 136 + y, 1, 1);
        g2d.fillRect(100 + x, 137 + y, 1, 2);
        g2d.fillRect(107 + x, 139 + y, 1, 1);
        g2d.fillRect(106 + x, 145 + y, 1, 1);
        g2d.fillRect(105 + x, 148 + y, 1, 2);
        g2d.fillRect(108 + x, 148 + y, 1, 2);
        g2d.fillRect(104 + x, 150 + y, 1, 1);
        g2d.fillRect(109 + x, 150 + y, 1, 3);
        g2d.fillRect(103 + x, 151 + y, 1, 4);
        g2d.fillRect(107 + x, 153 + y, 1, 4);
        g2d.fillRect(110 + x, 153 + y, 1, 1);
        g2d.fillRect(102 + x, 154 + y, 1, 3);
        g2d.fillRect(111 + x, 154 + y, 1, 5);
        g2d.fillRect(100 + x, 155 + y, 1, 2);
        g2d.fillRect(101 + x, 155 + y, 1, 2);
        g2d.fillRect(106 + x, 155 + y, 1, 3);
        g2d.fillRect(105 + x, 158 + y, 1, 1);
        g2d.fillRect(112 + x, 158 + y, 1, 4);
        g2d.fillRect(104 + x, 159 + y, 1, 1);
        g2d.fillRect(103 + x, 160 + y, 1, 3);
        g2d.fillRect(113 + x, 160 + y, 1, 2);
        g2d.fillRect(102 + x, 162 + y, 1, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(42,42,42,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 91 + y, 1, 3);
        g2d.fillRect(104 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 2);
        g2d.fillRect(107 + x, 101 + y, 1, 2);
        g2d.fillRect(106 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 121 + y, 1, 2);
        g2d.fillRect(109 + x, 122 + y, 1, 4);
        g2d.fillRect(108 + x, 124 + y, 1, 4);
        g2d.fillRect(104 + x, 131 + y, 1, 2);
        g2d.fillRect(105 + x, 131 + y, 2, 1);
        g2d.fillRect(103 + x, 132 + y, 1, 1);
        g2d.fillRect(108 + x, 132 + y, 1, 4);
        g2d.fillRect(107 + x, 137 + y, 1, 2);
        g2d.fillRect(106 + x, 142 + y, 1, 3);
        g2d.fillRect(105 + x, 145 + y, 1, 3);
        g2d.fillRect(94 + x, 148 + y, 1, 1);
        g2d.fillRect(104 + x, 149 + y, 1, 1);
        g2d.fillRect(95 + x, 151 + y, 1, 2);
        g2d.fillRect(114 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51,51,51,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 2, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 4);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 97 + y, 1, 2);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 1);
        g2d.fillRect(107 + x, 124 + y, 1, 2);
        g2d.fillRect(107 + x, 130 + y, 1, 1);
        g2d.fillRect(105 + x, 132 + y, 1, 1);
        g2d.fillRect(107 + x, 135 + y, 1, 2);
        g2d.fillRect(98 + x, 141 + y, 1, 1);
        g2d.fillRect(106 + x, 141 + y, 1, 1);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(95 + x, 150 + y, 1, 1);
        g2d.fillRect(103 + x, 150 + y, 1, 1);
        g2d.fillRect(102 + x, 151 + y, 1, 3);
        g2d.fillRect(101 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(58,58,58,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 92 + y, 1, 3);
        g2d.fillRect(112 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(107 + x, 97 + y, 1, 4);
        g2d.fillRect(107 + x, 131 + y, 1, 2);
        g2d.fillRect(100 + x, 139 + y, 1, 1);
        g2d.fillRect(99 + x, 140 + y, 1, 1);
        g2d.fillRect(106 + x, 140 + y, 1, 1);
        g2d.fillRect(104 + x, 148 + y, 1, 1);
        g2d.fillRect(103 + x, 149 + y, 1, 1);
        g2d.fillRect(96 + x, 151 + y, 1, 2);
        g2d.fillRect(97 + x, 153 + y, 1, 1);
        g2d.fillRect(101 + x, 153 + y, 1, 1);
        g2d.fillRect(99 + x, 154 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(62,62,62,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 136 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(66,66,66,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(101 + x, 137 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68,68,68,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 92 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(110 + x, 94 + y, 1, 1);
        g2d.fillRect(106 + x, 132 + y, 1, 1);
        g2d.fillRect(103 + x, 133 + y, 1, 2);
        g2d.fillRect(107 + x, 133 + y, 1, 2);
        g2d.fillRect(102 + x, 135 + y, 1, 1);
        g2d.fillRect(106 + x, 139 + y, 1, 1);
        g2d.fillRect(105 + x, 144 + y, 1, 1);
        g2d.fillRect(95 + x, 146 + y, 1, 2);
        g2d.fillRect(104 + x, 146 + y, 1, 2);
        g2d.fillRect(108 + x, 150 + y, 1, 8);
        g2d.fillRect(99 + x, 153 + y, 1, 1);
        g2d.fillRect(109 + x, 153 + y, 1, 1);
        g2d.fillRect(110 + x, 154 + y, 1, 4);
        g2d.fillRect(107 + x, 157 + y, 1, 2);
        g2d.fillRect(106 + x, 158 + y, 1, 2);
        g2d.fillRect(105 + x, 159 + y, 1, 4);
        g2d.fillRect(111 + x, 159 + y, 1, 3);
        g2d.fillRect(104 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 162 + y, 2, 1);
        g2d.fillRect(113 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(75,75,75,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 91 + y, 1, 4);
        g2d.fillRect(107 + x, 91 + y, 1, 6);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(104 + x, 133 + y, 1, 2);
        g2d.fillRect(105 + x, 133 + y, 1, 2);
        g2d.fillRect(103 + x, 135 + y, 1, 1);
        g2d.fillRect(102 + x, 136 + y, 1, 1);
        g2d.fillRect(101 + x, 139 + y, 1, 1);
        g2d.fillRect(105 + x, 142 + y, 1, 2);
        g2d.fillRect(97 + x, 144 + y, 1, 1);
        g2d.fillRect(96 + x, 145 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 3);
        g2d.fillRect(117 + x, 101 + y, 1, 3);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 109 + y, 1, 4);
        g2d.fillRect(113 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 5);
        g2d.fillRect(111 + x, 122 + y, 1, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 3);
        g2d.fillRect(115 + x, 124 + y, 1, 4);
        g2d.fillRect(113 + x, 126 + y, 2, 1);
        g2d.fillRect(114 + x, 127 + y, 1, 1);
        g2d.fillRect(101 + x, 128 + y, 1, 2);
        g2d.fillRect(100 + x, 131 + y, 1, 2);
        g2d.fillRect(110 + x, 144 + y, 1, 5);
        g2d.fillRect(111 + x, 149 + y, 1, 2);
        g2d.fillRect(112 + x, 151 + y, 1, 3);
        g2d.fillRect(113 + x, 153 + y, 1, 4);
        g2d.fillRect(122 + x, 161 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(82,82,82,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 133 + y, 1, 3);
        g2d.fillRect(104 + x, 135 + y, 1, 1);
        g2d.fillRect(103 + x, 136 + y, 1, 1);
        g2d.fillRect(102 + x, 137 + y, 1, 2);
        g2d.fillRect(100 + x, 140 + y, 1, 1);
        g2d.fillRect(99 + x, 141 + y, 1, 1);
        g2d.fillRect(98 + x, 142 + y, 1, 2);
        g2d.fillRect(97 + x, 145 + y, 1, 1);
        g2d.fillRect(96 + x, 146 + y, 1, 2);
        g2d.fillRect(103 + x, 148 + y, 1, 1);
        g2d.fillRect(95 + x, 149 + y, 1, 1);
        g2d.fillRect(102 + x, 150 + y, 1, 1);
        g2d.fillRect(101 + x, 151 + y, 1, 2);
        g2d.fillRect(100 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(157,4,89,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(105 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 142 + y, 1, 2);
        g2d.fillRect(121 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(162,9,94,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(106 + x, 108 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 2);
        g2d.fillRect(105 + x, 114 + y, 1, 1);
        g2d.fillRect(104 + x, 117 + y, 1, 2);
        g2d.fillRect(103 + x, 122 + y, 1, 2);
        g2d.fillRect(102 + x, 126 + y, 1, 2);
        g2d.fillRect(103 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 128 + y, 1, 3);
        g2d.fillRect(109 + x, 130 + y, 1, 1);
        g2d.fillRect(109 + x, 133 + y, 1, 2);
        g2d.fillRect(109 + x, 136 + y, 1, 1);
        g2d.fillRect(110 + x, 139 + y, 1, 3);
        g2d.fillRect(114 + x, 155 + y, 1, 3);
        g2d.fillRect(121 + x, 160 + y, 1, 2);
        g2d.fillRect(120 + x, 162 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(91,91,91,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(105 + x, 135 + y, 1, 1);
        g2d.fillRect(104 + x, 136 + y, 1, 1);
        g2d.fillRect(106 + x, 137 + y, 1, 2);
        g2d.fillRect(99 + x, 142 + y, 1, 2);
        g2d.fillRect(98 + x, 144 + y, 1, 1);
        g2d.fillRect(104 + x, 145 + y, 1, 1);
        g2d.fillRect(103 + x, 146 + y, 1, 2);
        g2d.fillRect(102 + x, 149 + y, 1, 1);
        g2d.fillRect(101 + x, 150 + y, 1, 1);
        g2d.fillRect(97 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205,0,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(118 + x, 94 + y, 1, 3);
        g2d.fillRect(117 + x, 96 + y, 1, 5);
        g2d.fillRect(116 + x, 97 + y, 1, 7);
        g2d.fillRect(113 + x, 99 + y, 1, 2);
        g2d.fillRect(115 + x, 99 + y, 1, 4);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(106 + x, 110 + y, 1, 2);
        g2d.fillRect(112 + x, 119 + y, 1, 4);
        g2d.fillRect(113 + x, 119 + y, 1, 7);
        g2d.fillRect(110 + x, 124 + y, 1, 2);
        g2d.fillRect(114 + x, 124 + y, 1, 2);
        g2d.fillRect(110 + x, 127 + y, 1, 3);
        g2d.fillRect(101 + x, 130 + y, 1, 1);
        g2d.fillRect(111 + x, 146 + y, 1, 3);
        g2d.fillRect(112 + x, 148 + y, 1, 3);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(172,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(107 + x, 114 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 118 + y, 1, 3);
        g2d.fillRect(103 + x, 124 + y, 1, 2);
        g2d.fillRect(116 + x, 131 + y, 1, 2);
        g2d.fillRect(115 + x, 159 + y, 1, 1);
        g2d.fillRect(120 + x, 159 + y, 1, 3);
        g2d.fillRect(116 + x, 160 + y, 1, 3);
        g2d.fillRect(117 + x, 162 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(99,99,99,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 91 + y, 3, 1);
        g2d.fillRect(106 + x, 136 + y, 1, 1);
        g2d.fillRect(105 + x, 139 + y, 1, 1);
        g2d.fillRect(100 + x, 141 + y, 1, 1);
        g2d.fillRect(105 + x, 141 + y, 1, 1);
        g2d.fillRect(104 + x, 144 + y, 1, 1);
        g2d.fillRect(103 + x, 145 + y, 1, 1);
        g2d.fillRect(102 + x, 148 + y, 1, 1);
        g2d.fillRect(101 + x, 149 + y, 1, 1);
        g2d.fillRect(96 + x, 150 + y, 1, 1);
        g2d.fillRect(98 + x, 151 + y, 1, 2);
        g2d.fillRect(99 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(213,9,94,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(116 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 2);
        g2d.fillRect(107 + x, 105 + y, 1, 3);
        g2d.fillRect(114 + x, 106 + y, 1, 3);
        g2d.fillRect(115 + x, 106 + y, 1, 2);
        g2d.fillRect(105 + x, 108 + y, 1, 1);
        g2d.fillRect(107 + x, 109 + y, 1, 5);
        g2d.fillRect(113 + x, 110 + y, 1, 2);
        g2d.fillRect(106 + x, 112 + y, 1, 3);
        g2d.fillRect(112 + x, 113 + y, 1, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 4);
        g2d.fillRect(104 + x, 119 + y, 1, 3);
        g2d.fillRect(110 + x, 126 + y, 1, 1);
        g2d.fillRect(102 + x, 128 + y, 1, 3);
        g2d.fillRect(114 + x, 128 + y, 1, 2);
        g2d.fillRect(110 + x, 130 + y, 1, 2);
        g2d.fillRect(111 + x, 142 + y, 1, 4);
        g2d.fillRect(113 + x, 150 + y, 1, 1);
        g2d.fillRect(114 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(108,108,108,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 136 + y, 1, 3);
        g2d.fillRect(103 + x, 137 + y, 1, 2);
        g2d.fillRect(102 + x, 139 + y, 1, 1);
        g2d.fillRect(101 + x, 140 + y, 1, 1);
        g2d.fillRect(99 + x, 144 + y, 1, 1);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 2);
        g2d.fillRect(96 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(185,32,117,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(116 + x, 133 + y, 1, 2);
        g2d.fillRect(117 + x, 136 + y, 1, 3);
        g2d.fillRect(120 + x, 157 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,1,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(114 + x, 100 + y, 1, 5);
        g2d.fillRect(113 + x, 101 + y, 1, 2);
        g2d.fillRect(113 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 123 + y, 1, 7);
        g2d.fillRect(113 + x, 127 + y, 1, 3);
        g2d.fillRect(101 + x, 131 + y, 1, 1);
        g2d.fillRect(112 + x, 145 + y, 1, 3);
        g2d.fillRect(113 + x, 148 + y, 1, 2);
        g2d.fillRect(113 + x, 151 + y, 1, 2);
        g2d.fillRect(109 + x, 154 + y, 1, 5);
        g2d.fillRect(108 + x, 158 + y, 1, 2);
        g2d.fillRect(110 + x, 158 + y, 1, 5);
        g2d.fillRect(107 + x, 159 + y, 1, 4);
        g2d.fillRect(106 + x, 160 + y, 1, 4);
        g2d.fillRect(111 + x, 162 + y, 1, 2);
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(223,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(107 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 106 + y, 1, 2);
        g2d.fillRect(108 + x, 113 + y, 1, 4);
        g2d.fillRect(106 + x, 115 + y, 1, 4);
        g2d.fillRect(109 + x, 115 + y, 1, 3);
        g2d.fillRect(110 + x, 117 + y, 1, 1);
        g2d.fillRect(105 + x, 119 + y, 1, 4);
        g2d.fillRect(104 + x, 122 + y, 1, 4);
        g2d.fillRect(114 + x, 130 + y, 1, 1);
        g2d.fillRect(115 + x, 131 + y, 1, 1);
        g2d.fillRect(110 + x, 132 + y, 1, 7);
        g2d.fillRect(111 + x, 141 + y, 1, 1);
        g2d.fillRect(115 + x, 157 + y, 1, 2);
        g2d.fillRect(117 + x, 160 + y, 1, 2);
        g2d.fillRect(119 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(117,117,117,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(104 + x, 137 + y, 1, 3);
        g2d.fillRect(103 + x, 139 + y, 1, 1);
        g2d.fillRect(102 + x, 140 + y, 1, 1);
        g2d.fillRect(105 + x, 140 + y, 1, 1);
        g2d.fillRect(101 + x, 141 + y, 1, 1);
        g2d.fillRect(104 + x, 141 + y, 1, 1);
        g2d.fillRect(100 + x, 142 + y, 1, 2);
        g2d.fillRect(97 + x, 146 + y, 1, 2);
        g2d.fillRect(97 + x, 150 + y, 1, 1);
        g2d.fillRect(100 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(195,42,127,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(116 + x, 135 + y, 1, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 5);
        g2d.fillRect(118 + x, 145 + y, 1, 6);
        g2d.fillRect(119 + x, 151 + y, 1, 7);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(123,123,123,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 140 + y, 2, 1);
        g2d.fillRect(104 + x, 142 + y, 1, 2);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(99 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(233,29,114,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(114 + x, 131 + y, 1, 1);
        g2d.fillRect(115 + x, 132 + y, 1, 1);
        g2d.fillRect(111 + x, 139 + y, 1, 2);
        g2d.fillRect(115 + x, 155 + y, 1, 2);
        g2d.fillRect(116 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 1, 1);
        g2d.fillRect(118 + x, 160 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,19,104,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 105 + y, 2, 1);
        g2d.fillRect(112 + x, 106 + y, 1, 2);
        g2d.fillRect(113 + x, 108 + y, 1, 2);
        g2d.fillRect(108 + x, 109 + y, 1, 4);
        g2d.fillRect(112 + x, 109 + y, 1, 4);
        g2d.fillRect(109 + x, 112 + y, 1, 3);
        g2d.fillRect(111 + x, 112 + y, 1, 3);
        g2d.fillRect(110 + x, 114 + y, 1, 3);
        g2d.fillRect(107 + x, 115 + y, 1, 6);
        g2d.fillRect(106 + x, 119 + y, 1, 4);
        g2d.fillRect(105 + x, 123 + y, 1, 3);
        g2d.fillRect(104 + x, 126 + y, 1, 1);
        g2d.fillRect(103 + x, 127 + y, 1, 3);
        g2d.fillRect(111 + x, 130 + y, 1, 3);
        g2d.fillRect(113 + x, 130 + y, 1, 2);
        g2d.fillRect(112 + x, 142 + y, 1, 3);
        g2d.fillRect(113 + x, 146 + y, 1, 2);
        g2d.fillRect(114 + x, 149 + y, 1, 5);
        g2d.fillRect(115 + x, 153 + y, 1, 2);
        g2d.fillRect(117 + x, 159 + y, 3, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,36,90,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(113 + x, 103 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(131,131,131,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(103 + x, 141 + y, 1, 1);
        g2d.fillRect(103 + x, 144 + y, 1, 1);
        g2d.fillRect(98 + x, 146 + y, 1, 2);
        g2d.fillRect(101 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 149 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(205,52,137,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(117 + x, 144 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,63,85,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(111 + x, 101 + y, 1, 2);
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 126 + y, 1, 2);
        g2d.fillRect(108 + x, 160 + y, 1, 2);
        g2d.fillRect(107 + x, 163 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(244,37,122,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(114 + x, 132 + y, 1, 1);
        g2d.fillRect(111 + x, 133 + y, 1, 2);
        g2d.fillRect(115 + x, 133 + y, 1, 2);
        g2d.fillRect(111 + x, 136 + y, 1, 3);
        g2d.fillRect(112 + x, 141 + y, 1, 1);
        g2d.fillRect(118 + x, 154 + y, 1, 1);
        g2d.fillRect(116 + x, 155 + y, 1, 3);
        g2d.fillRect(117 + x, 158 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,70,94,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(111 + x, 103 + y, 2, 1);
        g2d.fillRect(112 + x, 104 + y, 1, 2);
        g2d.fillRect(109 + x, 105 + y, 2, 1);
        g2d.fillRect(108 + x, 108 + y, 2, 1);
        g2d.fillRect(108 + x, 118 + y, 1, 1);
        g2d.fillRect(104 + x, 127 + y, 1, 1);
        g2d.fillRect(112 + x, 128 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(140,140,140,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 141 + y, 1, 3);
        g2d.fillRect(101 + x, 142 + y, 1, 3);
        g2d.fillRect(103 + x, 142 + y, 1, 2);
        g2d.fillRect(100 + x, 144 + y, 1, 1);
        g2d.fillRect(99 + x, 145 + y, 1, 1);
        g2d.fillRect(102 + x, 145 + y, 1, 1);
        g2d.fillRect(101 + x, 146 + y, 1, 2);
        g2d.fillRect(98 + x, 150 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(251,48,133,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(113 + x, 132 + y, 1, 1);
        g2d.fillRect(114 + x, 133 + y, 1, 2);
        g2d.fillRect(111 + x, 135 + y, 1, 1);
        g2d.fillRect(115 + x, 135 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 4);
        g2d.fillRect(116 + x, 142 + y, 1, 7);
        g2d.fillRect(115 + x, 144 + y, 1, 2);
        g2d.fillRect(117 + x, 145 + y, 1, 8);
        g2d.fillRect(118 + x, 151 + y, 1, 3);
        g2d.fillRect(118 + x, 155 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,96,86,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 159 + y, 1, 4);
        g2d.fillRect(108 + x, 162 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,83,105,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(110 + x, 104 + y, 1, 1);
        g2d.fillRect(108 + x, 106 + y, 1, 2);
        g2d.fillRect(109 + x, 106 + y, 1, 2);
        g2d.fillRect(110 + x, 108 + y, 1, 1);
        g2d.fillRect(112 + x, 108 + y, 1, 1);
        g2d.fillRect(109 + x, 109 + y, 1, 3);
        g2d.fillRect(110 + x, 110 + y, 1, 4);
        g2d.fillRect(111 + x, 110 + y, 1, 2);
        g2d.fillRect(108 + x, 119 + y, 1, 2);
        g2d.fillRect(107 + x, 121 + y, 1, 1);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(105 + x, 126 + y, 1, 1);
        g2d.fillRect(112 + x, 130 + y, 1, 2);
        g2d.fillRect(113 + x, 144 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(148,148,148,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 144 + y, 1, 1);
        g2d.fillRect(97 + x, 148 + y, 1, 2);
        g2d.fillRect(100 + x, 148 + y, 1, 1);
        g2d.fillRect(98 + x, 149 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,62,147,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(114 + x, 135 + y, 1, 5);
        g2d.fillRect(115 + x, 136 + y, 1, 3);
        g2d.fillRect(115 + x, 140 + y, 1, 4);
        g2d.fillRect(116 + x, 140 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(155,155,155,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(100 + x, 145 + y, 1, 3);
        g2d.fillRect(101 + x, 145 + y, 1, 1);
        g2d.fillRect(98 + x, 148 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,110,100,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 105 + y, 1, 3);
        g2d.fillRect(110 + x, 106 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,119,109,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(110 + x, 109 + y, 1, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(114 + x, 146 + y, 1, 3);
        g2d.fillRect(115 + x, 151 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,74,159,255), COLORS.get(ImageUtilities.NEG_GREY_3)));
        g2d.fillRect(115 + x, 139 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,106,128,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(112 + x, 132 + y, 1, 1);
        g2d.fillRect(113 + x, 133 + y, 1, 2);
        g2d.fillRect(113 + x, 142 + y, 1, 2);
        g2d.fillRect(114 + x, 142 + y, 1, 4);
        g2d.fillRect(115 + x, 146 + y, 1, 2);
        g2d.fillRect(116 + x, 154 + y, 1, 1);
        g2d.fillRect(117 + x, 155 + y, 1, 3);
        g2d.fillRect(118 + x, 157 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(164,164,164,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(99 + x, 146 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(247,133,123,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 140 + y, 1, 1);
        g2d.fillRect(115 + x, 148 + y, 1, 3);
        g2d.fillRect(116 + x, 149 + y, 1, 5);
        g2d.fillRect(117 + x, 154 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,124,146,255), COLORS.get(ImageUtilities.NEG_GREY_1)));
        g2d.fillRect(113 + x, 135 + y, 1, 2);
        g2d.fillRect(113 + x, 140 + y, 2, 1);
        g2d.fillRect(114 + x, 141 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(253,147,136,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 133 + y, 1, 7);
        g2d.fillRect(113 + x, 141 + y, 1, 1);
        g2d.fillRect(117 + x, 153 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(254,161,149,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 137 + y, 1, 3);
    }
}
