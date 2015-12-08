/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u;

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
public class Sw0 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Sw0()
    {
        super();
        containsTL = true;
    }

    public Sw0(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Sw0(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintSL2(x,y,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintSB2(x,y,g2d);
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

    public void paintSL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 2);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 2);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 2);
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 46 + y, 1, 3);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
    }





    public void paintSB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 7, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 48 + y, 1, 11);
        g2d.fillRect(100 + x, 49 + y, 1, 9);
        g2d.fillRect(117 + x, 49 + y, 1, 11);
        g2d.fillRect(118 + x, 49 + y, 1, 10);
        g2d.fillRect(99 + x, 50 + y, 1, 7);
        g2d.fillRect(102 + x, 50 + y, 1, 10);
        g2d.fillRect(119 + x, 50 + y, 1, 10);
        g2d.fillRect(120 + x, 51 + y, 1, 8);
        g2d.fillRect(103 + x, 52 + y, 1, 8);
        g2d.fillRect(98 + x, 53 + y, 1, 5);
        g2d.fillRect(121 + x, 53 + y, 1, 4);
        g2d.fillRect(104 + x, 54 + y, 1, 6);
        g2d.fillRect(116 + x, 54 + y, 1, 6);
        g2d.fillRect(105 + x, 57 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 3);
    }
}
