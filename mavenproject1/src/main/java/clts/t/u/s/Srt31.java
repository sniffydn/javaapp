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
public class Srt31 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt31()
    {
        super();
        containsTL = true;
    }

    public Srt31(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt31(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {}

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {}

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintSL1(x,0,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintSB1(x,y,g2d);
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

    public void paintSB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 46 + y, 4, 1);
        g2d.fillRect(105 + x, 47 + y, 12, 1);
        g2d.fillRect(117 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 51 + y, 6, 1);
        g2d.fillRect(105 + x, 52 + y, 12, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(117 + x, 53 + y, 4, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 4, 1);
        g2d.fillRect(105 + x, 48 + y, 12, 1);
        g2d.fillRect(117 + x, 49 + y, 3, 1);
        g2d.fillRect(99 + x, 50 + y, 6, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 12, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 4);
        g2d.fillRect(117 + x, 52 + y, 3, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 4);
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(101 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 2);
        g2d.fillRect(104 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 2);
        g2d.fillRect(107 + x, 49 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(111 + x, 49 + y, 1, 2);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(113 + x, 49 + y, 1, 2);
        g2d.fillRect(114 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(101 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 52 + y, 1, 4);
        g2d.fillRect(105 + x, 53 + y, 1, 3);
        g2d.fillRect(106 + x, 53 + y, 1, 3);
        g2d.fillRect(107 + x, 53 + y, 1, 3);
        g2d.fillRect(108 + x, 53 + y, 1, 3);
        g2d.fillRect(109 + x, 53 + y, 1, 3);
        g2d.fillRect(110 + x, 53 + y, 1, 3);
        g2d.fillRect(111 + x, 53 + y, 1, 3);
        g2d.fillRect(112 + x, 53 + y, 1, 3);
        g2d.fillRect(113 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(115 + x, 53 + y, 1, 3);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(117 + x, 54 + y, 1, 3);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
    }





    public void paintSL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(93 + x, 45 + y, 1, 23);
        g2d.fillRect(94 + x, 45 + y, 3, 1);
        g2d.fillRect(92 + x, 46 + y, 1, 4);
        g2d.fillRect(97 + x, 46 + y, 4, 1);
        g2d.fillRect(118 + x, 48 + y, 3, 1);
        g2d.fillRect(119 + x, 49 + y, 3, 1);
        g2d.fillRect(94 + x, 50 + y, 3, 1);
        g2d.fillRect(120 + x, 50 + y, 2, 1);
        g2d.fillRect(97 + x, 51 + y, 2, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 9);
        g2d.fillRect(121 + x, 55 + y, 1, 6);
        g2d.fillRect(97 + x, 61 + y, 1, 7);
        g2d.fillRect(122 + x, 61 + y, 1, 6);
        g2d.fillRect(118 + x, 62 + y, 1, 4);
        g2d.fillRect(119 + x, 66 + y, 1, 5);
        g2d.fillRect(123 + x, 67 + y, 1, 6);
        g2d.fillRect(92 + x, 68 + y, 1, 7);
        g2d.fillRect(96 + x, 68 + y, 1, 9);
        g2d.fillRect(120 + x, 71 + y, 1, 4);
        g2d.fillRect(121 + x, 72 + y, 2, 1);
        g2d.fillRect(124 + x, 72 + y, 1, 1);
        g2d.fillRect(125 + x, 73 + y, 1, 3);
        g2d.fillRect(93 + x, 74 + y, 3, 1);
        g2d.fillRect(91 + x, 75 + y, 1, 3);
        g2d.fillRect(121 + x, 75 + y, 4, 1);
        g2d.fillRect(92 + x, 77 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 46 + y, 1, 4);
        g2d.fillRect(95 + x, 46 + y, 2, 1);
        g2d.fillRect(97 + x, 47 + y, 4, 1);
        g2d.fillRect(97 + x, 50 + y, 2, 1);
        g2d.fillRect(94 + x, 51 + y, 1, 17);
        g2d.fillRect(97 + x, 52 + y, 1, 9);
        g2d.fillRect(120 + x, 57 + y, 1, 5);
        g2d.fillRect(118 + x, 60 + y, 1, 2);
        g2d.fillRect(96 + x, 61 + y, 1, 7);
        g2d.fillRect(121 + x, 61 + y, 1, 5);
        g2d.fillRect(119 + x, 63 + y, 1, 3);
        g2d.fillRect(120 + x, 66 + y, 1, 5);
        g2d.fillRect(122 + x, 67 + y, 1, 5);
        g2d.fillRect(93 + x, 68 + y, 1, 6);
        g2d.fillRect(95 + x, 68 + y, 1, 6);
        g2d.fillRect(122 + x, 73 + y, 3, 1);
        g2d.fillRect(121 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 2, 1);
        g2d.fillRect(92 + x, 75 + y, 1, 2);
        g2d.fillRect(93 + x, 75 + y, 1, 2);
        g2d.fillRect(95 + x, 75 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(95 + x, 47 + y, 1, 3);
        g2d.fillRect(96 + x, 47 + y, 1, 3);
        g2d.fillRect(97 + x, 48 + y, 1, 2);
        g2d.fillRect(98 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 17);
        g2d.fillRect(96 + x, 51 + y, 1, 10);
        g2d.fillRect(119 + x, 58 + y, 1, 5);
        g2d.fillRect(120 + x, 62 + y, 1, 4);
        g2d.fillRect(121 + x, 66 + y, 1, 6);
        g2d.fillRect(94 + x, 68 + y, 1, 6);
        g2d.fillRect(121 + x, 73 + y, 1, 1);
        g2d.fillRect(122 + x, 74 + y, 1, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 2);
    }
}
