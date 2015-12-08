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
import pieces.p.Star0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Srt23 extends SuperTU
{
    public Srt23()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt23(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt23(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }



    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
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

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 9);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(98 + x, 51 + y, 1, 6);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 15, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(101 + x, 49 + y, 1, 9);
        g2d.fillRect(117 + x, 49 + y, 1, 10);
        g2d.fillRect(118 + x, 50 + y, 1, 8);
        g2d.fillRect(102 + x, 51 + y, 1, 8);
        g2d.fillRect(103 + x, 51 + y, 1, 8);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 54 + y, 1, 5);
        g2d.fillRect(116 + x, 54 + y, 1, 5);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 47 + y, 1, 4);
        g2d.fillRect(116 + x, 47 + y, 1, 7);
        g2d.fillRect(104 + x, 51 + y, 1, 3);
        g2d.fillRect(115 + x, 53 + y, 1, 4);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 3);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 40 + y, 1, 4);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 4);
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 4);
        g2d.fillRect(105 + x, 60 + y, 1, 20);
        g2d.fillRect(115 + x, 60 + y, 1, 20);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 64 + y, 1, 9);
        g2d.fillRect(117 + x, 68 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 5);
        g2d.fillRect(116 + x, 71 + y, 1, 6);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(117 + x, 76 + y, 2, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 60 + y, 1, 11);
        g2d.fillRect(103 + x, 61 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 1, 12);
        g2d.fillRect(117 + x, 74 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 44 + y, 1, 4);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 21);
        g2d.fillRect(114 + x, 59 + y, 1, 21);
    }
}
