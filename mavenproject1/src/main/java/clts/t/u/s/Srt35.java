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
public class Srt35 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt35()
    {
        super();
        containsTL = true;
    }

    public Srt35(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt35(String middle, ColorArray colorSwitch)
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
        paint24TL(x,0,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paint24T(x,y,g2d);
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

    public void paint24T(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 48 + y, 2, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 49 + y, 2, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 10);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 56 + y, 2, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 4);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 4);
        g2d.fillRect(100 + x, 58 + y, 5, 1);
        g2d.fillRect(112 + x, 58 + y, 5, 1);
        g2d.fillRect(101 + x, 59 + y, 7, 1);
        g2d.fillRect(114 + x, 59 + y, 3, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 47 + y, 2, 1);
        g2d.fillRect(114 + x, 47 + y, 2, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(107 + x, 48 + y, 1, 2);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 3);
        g2d.fillRect(108 + x, 49 + y, 1, 3);
        g2d.fillRect(111 + x, 49 + y, 1, 7);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 8);
        g2d.fillRect(117 + x, 50 + y, 1, 7);
        g2d.fillRect(118 + x, 50 + y, 1, 6);
        g2d.fillRect(99 + x, 51 + y, 1, 5);
        g2d.fillRect(109 + x, 51 + y, 1, 2);
        g2d.fillRect(110 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 4);
        g2d.fillRect(101 + x, 55 + y, 1, 3);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 3);
        g2d.fillRect(115 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 3);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 4, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 1, 9);
        g2d.fillRect(104 + x, 47 + y, 1, 5);
        g2d.fillRect(105 + x, 47 + y, 1, 6);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 9);
        g2d.fillRect(103 + x, 49 + y, 1, 8);
        g2d.fillRect(112 + x, 49 + y, 1, 6);
        g2d.fillRect(113 + x, 49 + y, 1, 7);
        g2d.fillRect(114 + x, 49 + y, 1, 5);
        g2d.fillRect(101 + x, 50 + y, 1, 5);
        g2d.fillRect(107 + x, 50 + y, 1, 6);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 3);
        g2d.fillRect(108 + x, 52 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
    }





    public void paint24TL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 41 + y, 1, 3);
        g2d.fillRect(98 + x, 41 + y, 1, 3);
        g2d.fillRect(116 + x, 41 + y, 2, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 5);
        g2d.fillRect(96 + x, 42 + y, 1, 3);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 42 + y, 1, 7);
        g2d.fillRect(94 + x, 43 + y, 1, 24);
        g2d.fillRect(119 + x, 43 + y, 1, 7);
        g2d.fillRect(93 + x, 45 + y, 1, 22);
        g2d.fillRect(120 + x, 46 + y, 1, 5);
        g2d.fillRect(98 + x, 49 + y, 1, 3);
        g2d.fillRect(97 + x, 50 + y, 1, 17);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 10);
        g2d.fillRect(98 + x, 56 + y, 1, 5);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 5);
        g2d.fillRect(100 + x, 58 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 1, 4);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 7);
        g2d.fillRect(96 + x, 60 + y, 1, 7);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(117 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 61 + y, 1, 9);
        g2d.fillRect(122 + x, 61 + y, 1, 3);
        g2d.fillRect(103 + x, 62 + y, 1, 13);
        g2d.fillRect(123 + x, 63 + y, 1, 1);
        g2d.fillRect(119 + x, 64 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 1, 7);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(120 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 5);
        g2d.fillRect(117 + x, 68 + y, 1, 9);
        g2d.fillRect(118 + x, 70 + y, 1, 7);
        g2d.fillRect(102 + x, 72 + y, 1, 5);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(101 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 41 + y, 1, 2);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(97 + x, 44 + y, 2, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 4);
        g2d.fillRect(96 + x, 45 + y, 1, 2);
        g2d.fillRect(106 + x, 45 + y, 1, 3);
        g2d.fillRect(111 + x, 46 + y, 1, 4);
        g2d.fillRect(95 + x, 47 + y, 1, 13);
        g2d.fillRect(112 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 6);
        g2d.fillRect(114 + x, 59 + y, 1, 6);
        g2d.fillRect(119 + x, 59 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 4);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 4);
        g2d.fillRect(106 + x, 62 + y, 1, 12);
        g2d.fillRect(120 + x, 62 + y, 1, 3);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 3);
        g2d.fillRect(111 + x, 63 + y, 1, 3);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 7);
        g2d.fillRect(114 + x, 67 + y, 1, 3);
        g2d.fillRect(108 + x, 68 + y, 1, 3);
        g2d.fillRect(111 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 8);
        g2d.fillRect(105 + x, 71 + y, 1, 6);
        g2d.fillRect(104 + x, 72 + y, 1, 6);
        g2d.fillRect(116 + x, 72 + y, 1, 6);
        g2d.fillRect(103 + x, 75 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 42 + y, 1, 7);
        g2d.fillRect(99 + x, 43 + y, 1, 7);
        g2d.fillRect(115 + x, 43 + y, 1, 5);
        g2d.fillRect(116 + x, 44 + y, 1, 4);
        g2d.fillRect(97 + x, 45 + y, 1, 5);
        g2d.fillRect(98 + x, 45 + y, 1, 4);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(96 + x, 47 + y, 1, 13);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 5);
        g2d.fillRect(110 + x, 58 + y, 1, 6);
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 4);
        g2d.fillRect(108 + x, 59 + y, 1, 4);
        g2d.fillRect(111 + x, 59 + y, 1, 4);
        g2d.fillRect(95 + x, 60 + y, 1, 7);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 4);
        g2d.fillRect(107 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 4);
        g2d.fillRect(113 + x, 65 + y, 1, 4);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 66 + y, 1, 4);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 8);
        g2d.fillRect(108 + x, 71 + y, 1, 7);
        g2d.fillRect(112 + x, 71 + y, 1, 4);
        g2d.fillRect(110 + x, 72 + y, 1, 3);
        g2d.fillRect(107 + x, 73 + y, 1, 5);
        g2d.fillRect(111 + x, 73 + y, 1, 4);
        g2d.fillRect(106 + x, 74 + y, 1, 4);
        g2d.fillRect(109 + x, 75 + y, 1, 3);
        g2d.fillRect(113 + x, 75 + y, 1, 3);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 6);
        g2d.fillRect(109 + x, 70 + y, 1, 5);
        g2d.fillRect(111 + x, 70 + y, 1, 3);
        g2d.fillRect(110 + x, 75 + y, 1, 2);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(111 + x, 77 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 41 + y, 2, 1);
        g2d.fillRect(105 + x, 42 + y, 1, 1);
        g2d.fillRect(106 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);
        g2d.fillRect(92 + x, 65 + y, 1, 1);
        g2d.fillRect(124 + x, 66 + y, 1, 1);
        g2d.fillRect(91 + x, 67 + y, 1, 1);
        g2d.fillRect(95 + x, 67 + y, 2, 1);
        g2d.fillRect(119 + x, 68 + y, 1, 3);
        g2d.fillRect(90 + x, 69 + y, 1, 1);
        g2d.fillRect(97 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 2, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 2);
        g2d.fillRect(104 + x, 42 + y, 1, 2);
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(105 + x, 43 + y, 1, 3);
        g2d.fillRect(111 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 3);
        g2d.fillRect(111 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 3);
        g2d.fillRect(104 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(122 + x, 64 + y, 1, 2);
        g2d.fillRect(123 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 65 + y, 1, 2);
        g2d.fillRect(92 + x, 66 + y, 1, 4);
        g2d.fillRect(120 + x, 66 + y, 1, 2);
        g2d.fillRect(123 + x, 66 + y, 1, 1);
        g2d.fillRect(93 + x, 67 + y, 2, 1);
        g2d.fillRect(97 + x, 67 + y, 1, 4);
        g2d.fillRect(119 + x, 67 + y, 1, 1);
        g2d.fillRect(124 + x, 67 + y, 1, 1);
        g2d.fillRect(91 + x, 68 + y, 1, 2);
        g2d.fillRect(94 + x, 68 + y, 3, 1);
        g2d.fillRect(122 + x, 68 + y, 2, 1);
        g2d.fillRect(93 + x, 69 + y, 1, 2);
        g2d.fillRect(120 + x, 69 + y, 1, 2);
        g2d.fillRect(121 + x, 69 + y, 1, 1);
        g2d.fillRect(94 + x, 70 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 42 + y, 1, 3);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(112 + x, 43 + y, 1, 3);
        g2d.fillRect(103 + x, 44 + y, 2, 1);
        g2d.fillRect(111 + x, 44 + y, 1, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(123 + x, 65 + y, 1, 1);
        g2d.fillRect(122 + x, 66 + y, 1, 2);
        g2d.fillRect(121 + x, 67 + y, 1, 2);
        g2d.fillRect(123 + x, 67 + y, 1, 1);
        g2d.fillRect(93 + x, 68 + y, 1, 1);
        g2d.fillRect(120 + x, 68 + y, 1, 1);
        g2d.fillRect(94 + x, 69 + y, 3, 1);
    }

}
