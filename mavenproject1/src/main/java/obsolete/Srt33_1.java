/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

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
public class Srt33_1 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt33_1()
    {
        super();
    }

    public Srt33_1(String middle)
    {
        super(middle);
    }

    public Srt33_1(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 50 + y, 1, 3);
        g2d.fillRect(110 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 1, 5);
        g2d.fillRect(107 + x, 51 + y, 1, 9);
        g2d.fillRect(108 + x, 51 + y, 1, 3);
        g2d.fillRect(112 + x, 51 + y, 1, 5);
        g2d.fillRect(113 + x, 51 + y, 1, 9);
        g2d.fillRect(106 + x, 52 + y, 1, 7);
        g2d.fillRect(114 + x, 52 + y, 1, 7);
        g2d.fillRect(115 + x, 52 + y, 5, 1);
        g2d.fillRect(99 + x, 53 + y, 7, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 1, 4);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(116 + x, 54 + y, 4, 1);
        g2d.fillRect(100 + x, 55 + y, 4, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
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
}
