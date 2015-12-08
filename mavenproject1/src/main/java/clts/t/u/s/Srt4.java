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
import clts.t.u.a.T0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Srt4 extends Srt2
{
    public Srt4()
    {
        super();
        sch = true;
        prep = true;
        containsTL = Math.random() < .5;
    }

    /** Creates a new instance of GenericClothes */
    public Srt4(String middle)
    {
        super(middle);
        sch = true;
        prep = true;
        containsTL = Math.random() < .5;
    }

    public Srt4(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        sch = true;
        prep = true;
        containsTL = Math.random() < .5;
    }

    public void drawSleevesFrontLeftOne(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(87 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 62 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 1, 3);
        g2d.fillRect(90 + x, 63 + y, 1, 1);
        g2d.fillRect(88 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 65 + y, 1, 2);
        g2d.fillRect(89 + x, 67 + y, 1, 2);
        g2d.fillRect(94 + x, 67 + y, 1, 3);
        g2d.fillRect(90 + x, 69 + y, 1, 1);
        g2d.fillRect(91 + x, 70 + y, 1, 2);
        g2d.fillRect(95 + x, 70 + y, 1, 1);
        g2d.fillRect(96 + x, 71 + y, 1, 2);
        g2d.fillRect(92 + x, 72 + y, 1, 1);
        g2d.fillRect(97 + x, 72 + y, 1, 1);
        g2d.fillRect(93 + x, 73 + y, 1, 2);
        g2d.fillRect(98 + x, 73 + y, 1, 1);
        g2d.fillRect(94 + x, 74 + y, 1, 1);
        g2d.fillRect(99 + x, 74 + y, 1, 1);
        g2d.fillRect(98 + x, 75 + y, 1, 2);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(94 + x, 77 + y, 1, 1);
        g2d.fillRect(97 + x, 77 + y, 1, 1);
        g2d.fillRect(95 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(88 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 64 + y, 1, 2);
        g2d.fillRect(89 + x, 65 + y, 1, 2);
        g2d.fillRect(92 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 67 + y, 1, 2);
        g2d.fillRect(90 + x, 68 + y, 1, 1);
        g2d.fillRect(91 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 70 + y, 1, 2);
        g2d.fillRect(93 + x, 71 + y, 1, 2);
        g2d.fillRect(95 + x, 71 + y, 1, 1);
        g2d.fillRect(94 + x, 73 + y, 1, 1);
        g2d.fillRect(96 + x, 73 + y, 2, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 1);
        g2d.fillRect(95 + x, 77 + y, 1, 1);
        g2d.fillRect(96 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(89 + x, 63 + y, 1, 2);
        g2d.fillRect(90 + x, 64 + y, 1, 4);
        g2d.fillRect(91 + x, 66 + y, 1, 3);
        g2d.fillRect(92 + x, 67 + y, 1, 3);
        g2d.fillRect(93 + x, 69 + y, 1, 2);
        g2d.fillRect(94 + x, 70 + y, 1, 3);
        g2d.fillRect(95 + x, 72 + y, 1, 5);
        g2d.fillRect(96 + x, 74 + y, 1, 4);
        g2d.fillRect(97 + x, 74 + y, 1, 3);
        g2d.fillRect(98 + x, 74 + y, 1, 1);
        g2d.fillRect(94 + x, 76 + y, 1, 1);
    }

    public void drawSleevesFront(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(leftA == 1)
        {
            drawSleevesFrontLeftOne(x,y,g2d);
        }
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 41 + y, 6, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 23);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 9);
        g2d.fillRect(97 + x, 61 + y, 1, 7);
        g2d.fillRect(92 + x, 68 + y, 1, 9);
        g2d.fillRect(96 + x, 68 + y, 1, 10);
        g2d.fillRect(90 + x, 76 + y, 1, 4);
        g2d.fillRect(91 + x, 76 + y, 1, 1);
        g2d.fillRect(97 + x, 77 + y, 1, 4);
        g2d.fillRect(91 + x, 79 + y, 4, 1);
        g2d.fillRect(95 + x, 80 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 41 + y, 1, 3);
        g2d.fillRect(97 + x, 42 + y, 6, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 3);
        g2d.fillRect(95 + x, 43 + y, 1, 2);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(105 + x, 43 + y, 1, 3);
        g2d.fillRect(106 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 23);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 52 + y, 1, 9);
        g2d.fillRect(96 + x, 60 + y, 1, 8);
        g2d.fillRect(93 + x, 68 + y, 1, 8);
        g2d.fillRect(95 + x, 69 + y, 1, 9);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 43 + y, 1, 9);
        g2d.fillRect(98 + x, 43 + y, 1, 7);
        g2d.fillRect(99 + x, 43 + y, 1, 6);
        g2d.fillRect(100 + x, 43 + y, 1, 5);
        g2d.fillRect(101 + x, 43 + y, 1, 6);
        g2d.fillRect(96 + x, 44 + y, 1, 16);
        g2d.fillRect(102 + x, 44 + y, 1, 6);
        g2d.fillRect(103 + x, 44 + y, 1, 6);
        g2d.fillRect(95 + x, 45 + y, 1, 24);
        g2d.fillRect(104 + x, 45 + y, 1, 4);
        g2d.fillRect(105 + x, 46 + y, 1, 3);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(94 + x, 68 + y, 1, 11);
        g2d.fillRect(93 + x, 76 + y, 1, 3);
        g2d.fillRect(91 + x, 77 + y, 1, 2);
        g2d.fillRect(92 + x, 77 + y, 1, 2);
        g2d.fillRect(95 + x, 78 + y, 1, 2);
        g2d.fillRect(96 + x, 78 + y, 1, 2);
    }



    public void drawSleevesLeft1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 41 + y, 5, 1);
        g2d.fillRect(96 + x, 42 + y, 2, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(94 + x, 44 + y, 1, 3);
        g2d.fillRect(93 + x, 47 + y, 1, 3);
        g2d.fillRect(92 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(91 + x, 52 + y, 1, 3);
        g2d.fillRect(97 + x, 53 + y, 1, 2);
        g2d.fillRect(90 + x, 55 + y, 1, 3);
        g2d.fillRect(96 + x, 55 + y, 1, 2);
        g2d.fillRect(95 + x, 57 + y, 1, 2);
        g2d.fillRect(89 + x, 58 + y, 1, 2);
        g2d.fillRect(94 + x, 59 + y, 1, 1);
        g2d.fillRect(88 + x, 60 + y, 1, 2);
        g2d.fillRect(93 + x, 60 + y, 1, 2);
        g2d.fillRect(87 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 62 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 1, 3);
        g2d.fillRect(90 + x, 63 + y, 1, 1);
        g2d.fillRect(88 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 65 + y, 1, 2);
        g2d.fillRect(89 + x, 67 + y, 1, 2);
        g2d.fillRect(94 + x, 67 + y, 1, 3);
        g2d.fillRect(90 + x, 69 + y, 1, 1);
        g2d.fillRect(91 + x, 70 + y, 1, 2);
        g2d.fillRect(95 + x, 70 + y, 1, 1);
        g2d.fillRect(96 + x, 71 + y, 1, 2);
        g2d.fillRect(92 + x, 72 + y, 1, 1);
        g2d.fillRect(97 + x, 72 + y, 1, 1);
        g2d.fillRect(93 + x, 73 + y, 1, 2);
        g2d.fillRect(98 + x, 73 + y, 1, 1);
        g2d.fillRect(94 + x, 74 + y, 1, 1);
        g2d.fillRect(99 + x, 74 + y, 1, 1);
        g2d.fillRect(98 + x, 75 + y, 1, 2);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(94 + x, 77 + y, 1, 1);
        g2d.fillRect(97 + x, 77 + y, 1, 1);
        g2d.fillRect(95 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 41 + y, 1, 3);
        g2d.fillRect(98 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 4, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 3);
        g2d.fillRect(96 + x, 43 + y, 1, 2);
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(105 + x, 43 + y, 1, 3);
        g2d.fillRect(95 + x, 44 + y, 1, 3);
        g2d.fillRect(106 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 47 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 1, 5);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(93 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(92 + x, 52 + y, 1, 3);
        g2d.fillRect(96 + x, 52 + y, 1, 3);
        g2d.fillRect(91 + x, 55 + y, 1, 3);
        g2d.fillRect(95 + x, 55 + y, 1, 2);
        g2d.fillRect(94 + x, 56 + y, 1, 3);
        g2d.fillRect(90 + x, 58 + y, 1, 2);
        g2d.fillRect(93 + x, 58 + y, 1, 2);
        g2d.fillRect(92 + x, 59 + y, 1, 3);
        g2d.fillRect(89 + x, 60 + y, 1, 3);
        g2d.fillRect(91 + x, 61 + y, 1, 1);
        g2d.fillRect(88 + x, 62 + y, 1, 3);
        g2d.fillRect(91 + x, 64 + y, 1, 2);
        g2d.fillRect(89 + x, 65 + y, 1, 2);
        g2d.fillRect(92 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 67 + y, 1, 2);
        g2d.fillRect(90 + x, 68 + y, 1, 1);
        g2d.fillRect(91 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 70 + y, 1, 2);
        g2d.fillRect(93 + x, 71 + y, 1, 2);
        g2d.fillRect(95 + x, 71 + y, 1, 1);
        g2d.fillRect(94 + x, 73 + y, 1, 1);
        g2d.fillRect(96 + x, 73 + y, 2, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 1);
        g2d.fillRect(95 + x, 77 + y, 1, 1);
        g2d.fillRect(96 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 43 + y, 1, 5);
        g2d.fillRect(100 + x, 43 + y, 1, 5);
        g2d.fillRect(101 + x, 43 + y, 1, 6);
        g2d.fillRect(97 + x, 44 + y, 1, 7);
        g2d.fillRect(98 + x, 44 + y, 1, 5);
        g2d.fillRect(102 + x, 44 + y, 1, 6);
        g2d.fillRect(103 + x, 44 + y, 1, 6);
        g2d.fillRect(96 + x, 45 + y, 1, 7);
        g2d.fillRect(104 + x, 45 + y, 1, 4);
        g2d.fillRect(105 + x, 46 + y, 1, 3);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 8);
        g2d.fillRect(94 + x, 50 + y, 1, 6);
        g2d.fillRect(93 + x, 52 + y, 1, 6);
        g2d.fillRect(92 + x, 55 + y, 1, 4);
        g2d.fillRect(91 + x, 58 + y, 1, 3);
        g2d.fillRect(90 + x, 60 + y, 1, 3);
        g2d.fillRect(89 + x, 63 + y, 1, 2);
        g2d.fillRect(90 + x, 64 + y, 1, 4);
        g2d.fillRect(91 + x, 66 + y, 1, 3);
        g2d.fillRect(92 + x, 67 + y, 1, 3);
        g2d.fillRect(93 + x, 69 + y, 1, 2);
        g2d.fillRect(94 + x, 70 + y, 1, 3);
        g2d.fillRect(95 + x, 72 + y, 1, 5);
        g2d.fillRect(96 + x, 74 + y, 1, 4);
        g2d.fillRect(97 + x, 74 + y, 1, 3);
        g2d.fillRect(98 + x, 74 + y, 1, 1);
        g2d.fillRect(94 + x, 76 + y, 1, 1);
    }


    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 41 + y, 4, 1);
        g2d.fillRect(117 + x, 42 + y, 2, 1);
        g2d.fillRect(118 + x, 43 + y, 2, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 2);
        g2d.fillRect(120 + x, 46 + y, 1, 9);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 7);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(122 + x, 61 + y, 1, 6);
        g2d.fillRect(118 + x, 62 + y, 1, 4);
        g2d.fillRect(119 + x, 66 + y, 1, 5);
        g2d.fillRect(123 + x, 67 + y, 1, 7);
        g2d.fillRect(120 + x, 71 + y, 1, 3);
        g2d.fillRect(121 + x, 74 + y, 1, 7);
        g2d.fillRect(124 + x, 74 + y, 1, 5);
        g2d.fillRect(125 + x, 78 + y, 1, 2);
        g2d.fillRect(122 + x, 80 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 42 + y, 1, 7);
        g2d.fillRect(116 + x, 42 + y, 1, 6);
        g2d.fillRect(117 + x, 43 + y, 1, 4);
        g2d.fillRect(118 + x, 44 + y, 1, 7);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 46 + y, 1, 4);
        g2d.fillRect(119 + x, 51 + y, 1, 8);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 59 + y, 1, 3);
        g2d.fillRect(118 + x, 61 + y, 1, 1);
        g2d.fillRect(121 + x, 62 + y, 1, 3);
        g2d.fillRect(119 + x, 64 + y, 1, 2);
        g2d.fillRect(120 + x, 66 + y, 1, 5);
        g2d.fillRect(122 + x, 67 + y, 1, 8);
        g2d.fillRect(121 + x, 73 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 6);
        g2d.fillRect(124 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 42 + y, 1, 4);
        g2d.fillRect(117 + x, 47 + y, 1, 9);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 5);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 5);
        g2d.fillRect(120 + x, 62 + y, 1, 4);
        g2d.fillRect(121 + x, 65 + y, 1, 8);
        g2d.fillRect(122 + x, 75 + y, 1, 5);
    }

    public void drawSleeves(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(rightA == 0)
        {
            drawSleevesRight0(x,y,g2d);
        }
        if(leftA == 0)
        {
            drawSleevesLeft0(x,y,g2d);
        }
        else if(leftA == 1)
        {
            drawSleevesLeft1(x,y,g2d);
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
        drawSleeves(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawSleevesFront(offsetX, 0, g2d);
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
}
