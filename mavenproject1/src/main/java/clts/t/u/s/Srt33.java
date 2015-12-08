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
public class Srt33 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt33()
    {
        super();
        containsTL = true;
    }

    public Srt33(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt33(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {}

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {}

    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        return new obsolete.Srt33_1(middle, c);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paint20TL(x,0,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paint20Top(x,y,g2d);
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

    public void paint20Top(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(101 + x, 59 + y, 7, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 1, 4);
        g2d.fillRect(102 + x, 47 + y, 1, 3);
        g2d.fillRect(103 + x, 47 + y, 1, 3);
        g2d.fillRect(104 + x, 47 + y, 1, 2);
        g2d.fillRect(105 + x, 47 + y, 1, 2);
        g2d.fillRect(106 + x, 47 + y, 1, 2);
        g2d.fillRect(107 + x, 47 + y, 1, 12);
        g2d.fillRect(113 + x, 47 + y, 1, 13);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 11);
        g2d.fillRect(112 + x, 48 + y, 1, 5);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 3);
        g2d.fillRect(109 + x, 49 + y, 1, 4);
        g2d.fillRect(111 + x, 49 + y, 1, 4);
        g2d.fillRect(117 + x, 49 + y, 3, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 2);
        g2d.fillRect(114 + x, 50 + y, 1, 7);
        g2d.fillRect(115 + x, 50 + y, 1, 9);
        g2d.fillRect(119 + x, 50 + y, 1, 6);
        g2d.fillRect(120 + x, 50 + y, 1, 3);
        g2d.fillRect(99 + x, 51 + y, 1, 7);
        g2d.fillRect(103 + x, 51 + y, 1, 8);
        g2d.fillRect(104 + x, 51 + y, 1, 8);
        g2d.fillRect(116 + x, 51 + y, 1, 3);
        g2d.fillRect(117 + x, 51 + y, 1, 7);
        g2d.fillRect(118 + x, 51 + y, 1, 6);
        g2d.fillRect(101 + x, 52 + y, 1, 7);
        g2d.fillRect(102 + x, 52 + y, 1, 7);
        g2d.fillRect(106 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 6);
        g2d.fillRect(108 + x, 53 + y, 1, 6);
        g2d.fillRect(109 + x, 54 + y, 1, 4);
        g2d.fillRect(110 + x, 54 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 3);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 4);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 4);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 3, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 3, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 2, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 3);
        g2d.fillRect(111 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
    }





    public void paint20TL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(99 + x, 43 + y, 2, 1);
        g2d.fillRect(101 + x, 44 + y, 3, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 5);
        g2d.fillRect(105 + x, 45 + y, 3, 1);
        g2d.fillRect(117 + x, 45 + y, 2, 1);
        g2d.fillRect(109 + x, 46 + y, 6, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 47 + y, 1, 2);
        g2d.fillRect(94 + x, 48 + y, 2, 1);
        g2d.fillRect(121 + x, 48 + y, 1, 5);
        g2d.fillRect(95 + x, 49 + y, 3, 1);
        g2d.fillRect(92 + x, 50 + y, 1, 10);
        g2d.fillRect(93 + x, 51 + y, 1, 4);
        g2d.fillRect(98 + x, 51 + y, 1, 2);
        g2d.fillRect(94 + x, 53 + y, 1, 2);
        g2d.fillRect(122 + x, 53 + y, 1, 8);
        g2d.fillRect(91 + x, 54 + y, 1, 6);
        g2d.fillRect(98 + x, 56 + y, 1, 10);
        g2d.fillRect(97 + x, 57 + y, 1, 9);
        g2d.fillRect(99 + x, 57 + y, 1, 8);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 5);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(90 + x, 59 + y, 1, 4);
        g2d.fillRect(93 + x, 59 + y, 2, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 7);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(123 + x, 59 + y, 1, 6);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 4, 1);
        g2d.fillRect(92 + x, 61 + y, 1, 3);
        g2d.fillRect(93 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 6);
        g2d.fillRect(117 + x, 61 + y, 1, 10);
        g2d.fillRect(124 + x, 61 + y, 1, 6);
        g2d.fillRect(88 + x, 62 + y, 2, 1);
        g2d.fillRect(91 + x, 62 + y, 1, 4);
        g2d.fillRect(93 + x, 63 + y, 1, 2);
        g2d.fillRect(102 + x, 63 + y, 1, 9);
        g2d.fillRect(103 + x, 63 + y, 1, 8);
        g2d.fillRect(121 + x, 63 + y, 2, 1);
        g2d.fillRect(125 + x, 63 + y, 1, 4);
        g2d.fillRect(94 + x, 64 + y, 2, 1);
        g2d.fillRect(118 + x, 64 + y, 1, 7);
        g2d.fillRect(90 + x, 65 + y, 1, 1);
        g2d.fillRect(92 + x, 65 + y, 1, 2);
        g2d.fillRect(95 + x, 65 + y, 1, 3);
        g2d.fillRect(96 + x, 65 + y, 1, 3);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(115 + x, 65 + y, 1, 2);
        g2d.fillRect(119 + x, 65 + y, 1, 4);
        g2d.fillRect(120 + x, 65 + y, 1, 1);
        g2d.fillRect(93 + x, 66 + y, 2, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 3, 1);
        g2d.fillRect(121 + x, 66 + y, 3, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 2);
        g2d.fillRect(120 + x, 68 + y, 3, 1);
        g2d.fillRect(124 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 12, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(101 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(95 + x, 43 + y, 1, 5);
        g2d.fillRect(96 + x, 43 + y, 1, 6);
        g2d.fillRect(97 + x, 43 + y, 1, 6);
        g2d.fillRect(98 + x, 44 + y, 1, 7);
        g2d.fillRect(99 + x, 44 + y, 1, 6);
        g2d.fillRect(100 + x, 44 + y, 1, 5);
        g2d.fillRect(94 + x, 45 + y, 1, 3);
        g2d.fillRect(101 + x, 45 + y, 1, 4);
        g2d.fillRect(102 + x, 45 + y, 1, 3);
        g2d.fillRect(103 + x, 45 + y, 1, 3);
        g2d.fillRect(104 + x, 45 + y, 1, 3);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 46 + y, 1, 2);
        g2d.fillRect(107 + x, 46 + y, 1, 2);
        g2d.fillRect(108 + x, 46 + y, 1, 4);
        g2d.fillRect(115 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 2, 1);
        g2d.fillRect(109 + x, 47 + y, 1, 4);
        g2d.fillRect(110 + x, 47 + y, 1, 4);
        g2d.fillRect(111 + x, 47 + y, 1, 3);
        g2d.fillRect(112 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 47 + y, 2, 1);
        g2d.fillRect(120 + x, 48 + y, 1, 3);
        g2d.fillRect(94 + x, 49 + y, 1, 4);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 4);
        g2d.fillRect(96 + x, 50 + y, 1, 11);
        g2d.fillRect(97 + x, 50 + y, 1, 7);
        g2d.fillRect(93 + x, 55 + y, 1, 4);
        g2d.fillRect(94 + x, 55 + y, 1, 4);
        g2d.fillRect(95 + x, 55 + y, 1, 9);
        g2d.fillRect(121 + x, 55 + y, 1, 8);
        g2d.fillRect(110 + x, 56 + y, 1, 13);
        g2d.fillRect(111 + x, 57 + y, 1, 9);
        g2d.fillRect(112 + x, 57 + y, 1, 9);
        g2d.fillRect(120 + x, 57 + y, 1, 8);
        g2d.fillRect(109 + x, 58 + y, 1, 11);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 6);
        g2d.fillRect(91 + x, 60 + y, 1, 2);
        g2d.fillRect(92 + x, 60 + y, 3, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 9);
        g2d.fillRect(108 + x, 60 + y, 1, 9);
        g2d.fillRect(113 + x, 60 + y, 1, 6);
        g2d.fillRect(94 + x, 61 + y, 1, 3);
        g2d.fillRect(106 + x, 61 + y, 1, 6);
        g2d.fillRect(114 + x, 61 + y, 1, 4);
        g2d.fillRect(115 + x, 61 + y, 1, 4);
        g2d.fillRect(118 + x, 61 + y, 1, 3);
        g2d.fillRect(122 + x, 61 + y, 1, 2);
        g2d.fillRect(93 + x, 62 + y, 1, 1);
        g2d.fillRect(96 + x, 62 + y, 1, 3);
        g2d.fillRect(103 + x, 62 + y, 3, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 3);
        g2d.fillRect(105 + x, 63 + y, 1, 3);
        g2d.fillRect(92 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 64 + y, 1, 2);
        g2d.fillRect(122 + x, 64 + y, 1, 2);
        g2d.fillRect(93 + x, 65 + y, 2, 1);
        g2d.fillRect(123 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(116 + x, 67 + y, 1, 2);
        g2d.fillRect(121 + x, 67 + y, 2, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(95 + x, 54 + y, 1, 1);
    }
}
