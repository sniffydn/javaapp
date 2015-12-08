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
public class Srt19 extends SuperTU
{
    public Srt19()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt19(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt19(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }


    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }
    public void drawSleevesLeft1(int x, int y, GraphicsMap g2d)
    {

    }
    public void drawSleevesLeft2(int x, int y, GraphicsMap g2d)
    {

    }
    public void drawSleevesLeft3(int x, int y, GraphicsMap g2d)
    {

    }
    public void drawSleevesLeft5(int x, int y, GraphicsMap g2d)
    {

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
    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(97 + x, 43 + y, 2, 1);
        g2d.fillRect(99 + x, 44 + y, 2, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 4);
        g2d.fillRect(101 + x, 45 + y, 2, 1);
        g2d.fillRect(103 + x, 46 + y, 2, 1);
        g2d.fillRect(94 + x, 49 + y, 2, 1);
        g2d.fillRect(96 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(114 + x, 62 + y, 3, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 3, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 4);
        g2d.fillRect(108 + x, 65 + y, 2, 1);
        g2d.fillRect(105 + x, 66 + y, 3, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(96 + x, 43 + y, 1, 2);
        g2d.fillRect(97 + x, 44 + y, 2, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 4);
        g2d.fillRect(99 + x, 45 + y, 2, 1);
        g2d.fillRect(101 + x, 46 + y, 2, 1);
        g2d.fillRect(103 + x, 47 + y, 2, 1);
        g2d.fillRect(95 + x, 48 + y, 2, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 6);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 2, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 63 + y, 2, 1);
        g2d.fillRect(111 + x, 63 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 2, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 2, 1);
        g2d.fillRect(108 + x, 66 + y, 2, 1);
        g2d.fillRect(105 + x, 67 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(96 + x, 45 + y, 1, 3);
        g2d.fillRect(97 + x, 45 + y, 1, 7);
        g2d.fillRect(98 + x, 45 + y, 1, 8);
        g2d.fillRect(99 + x, 46 + y, 1, 4);
        g2d.fillRect(100 + x, 46 + y, 1, 3);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 2, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 5);
        g2d.fillRect(110 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 3);
        g2d.fillRect(111 + x, 60 + y, 1, 3);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(105 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 3);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
    }





    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 46 + y, 2, 1);
        g2d.fillRect(107 + x, 47 + y, 4, 1);
        g2d.fillRect(111 + x, 48 + y, 4, 1);
        g2d.fillRect(115 + x, 49 + y, 2, 1);
        g2d.fillRect(117 + x, 50 + y, 3, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 5);
        g2d.fillRect(99 + x, 53 + y, 2, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 3, 1);
        g2d.fillRect(105 + x, 56 + y, 3, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 5, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 3, 1);
        g2d.fillRect(116 + x, 59 + y, 3, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 47 + y, 4, 1);
        g2d.fillRect(107 + x, 48 + y, 4, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(111 + x, 49 + y, 4, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 2, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 3, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 3);
        g2d.fillRect(118 + x, 52 + y, 3, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 2, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 6);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 3, 1);
        g2d.fillRect(113 + x, 55 + y, 2, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 56 + y, 5, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(113 + x, 57 + y, 3, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 47 + y, 1, 6);
        g2d.fillRect(102 + x, 47 + y, 1, 7);
        g2d.fillRect(100 + x, 48 + y, 1, 5);
        g2d.fillRect(103 + x, 48 + y, 1, 6);
        g2d.fillRect(104 + x, 48 + y, 1, 5);
        g2d.fillRect(105 + x, 48 + y, 1, 5);
        g2d.fillRect(106 + x, 48 + y, 1, 3);
        g2d.fillRect(107 + x, 49 + y, 4, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 4);
        g2d.fillRect(109 + x, 50 + y, 1, 3);
        g2d.fillRect(110 + x, 50 + y, 1, 3);
        g2d.fillRect(111 + x, 50 + y, 4, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 4);
        g2d.fillRect(112 + x, 51 + y, 1, 5);
        g2d.fillRect(113 + x, 51 + y, 1, 4);
        g2d.fillRect(114 + x, 51 + y, 1, 4);
        g2d.fillRect(115 + x, 51 + y, 2, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 6);
        g2d.fillRect(117 + x, 52 + y, 1, 5);
        g2d.fillRect(106 + x, 53 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 3);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 56 + y, 2, 1);
        g2d.fillRect(105 + x, 57 + y, 3, 1);
    }
}
