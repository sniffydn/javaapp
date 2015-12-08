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
public class Srt51 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt51()
    {
        super();
        containsTL = true;
    }

    public Srt51(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt51(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }
    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
        paintTL(x,0,g2d);
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

    public void paintTL(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 41 + y, 4, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 7);
        g2d.fillRect(115 + x, 41 + y, 1, 7);
        g2d.fillRect(100 + x, 42 + y, 4, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(117 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 6);
        g2d.fillRect(102 + x, 43 + y, 1, 5);
        g2d.fillRect(103 + x, 43 + y, 1, 5);
        g2d.fillRect(118 + x, 43 + y, 2, 1);
        g2d.fillRect(97 + x, 44 + y, 4, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 4);
        g2d.fillRect(104 + x, 45 + y, 1, 3);
        g2d.fillRect(113 + x, 45 + y, 1, 3);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 21);
        g2d.fillRect(112 + x, 58 + y, 1, 13);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(113 + x, 59 + y, 1, 16);
        g2d.fillRect(109 + x, 63 + y, 1, 9);
        g2d.fillRect(107 + x, 70 + y, 1, 14);
        g2d.fillRect(114 + x, 71 + y, 1, 9);
        g2d.fillRect(115 + x, 74 + y, 1, 10);
        g2d.fillRect(106 + x, 76 + y, 1, 8);
        g2d.fillRect(116 + x, 76 + y, 1, 8);
        g2d.fillRect(119 + x, 76 + y, 1, 6);
        g2d.fillRect(118 + x, 77 + y, 1, 6);
        g2d.fillRect(120 + x, 77 + y, 1, 4);
        g2d.fillRect(121 + x, 77 + y, 1, 6);
        g2d.fillRect(122 + x, 77 + y, 1, 2);
        g2d.fillRect(123 + x, 77 + y, 1, 5);
        g2d.fillRect(124 + x, 77 + y, 1, 4);
        g2d.fillRect(125 + x, 77 + y, 1, 6);
        g2d.fillRect(91 + x, 78 + y, 1, 2);
        g2d.fillRect(92 + x, 78 + y, 1, 5);
        g2d.fillRect(93 + x, 78 + y, 1, 2);
        g2d.fillRect(94 + x, 78 + y, 1, 4);
        g2d.fillRect(95 + x, 78 + y, 1, 4);
        g2d.fillRect(96 + x, 78 + y, 1, 5);
        g2d.fillRect(99 + x, 78 + y, 1, 6);
        g2d.fillRect(100 + x, 78 + y, 1, 5);
        g2d.fillRect(105 + x, 78 + y, 1, 6);
        g2d.fillRect(109 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 3);
        g2d.fillRect(101 + x, 79 + y, 1, 6);
        g2d.fillRect(126 + x, 79 + y, 1, 1);
        g2d.fillRect(90 + x, 80 + y, 1, 1);
        g2d.fillRect(97 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 4);
        g2d.fillRect(103 + x, 80 + y, 1, 4);
        g2d.fillRect(104 + x, 80 + y, 1, 5);
        g2d.fillRect(98 + x, 81 + y, 1, 1);
        g2d.fillRect(91 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 41 + y, 2, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(98 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 23);
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 5);
        g2d.fillRect(121 + x, 55 + y, 1, 6);
        g2d.fillRect(98 + x, 57 + y, 1, 4);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(117 + x, 60 + y, 1, 4);
        g2d.fillRect(97 + x, 61 + y, 1, 7);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(122 + x, 61 + y, 1, 6);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(118 + x, 64 + y, 1, 2);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(119 + x, 66 + y, 1, 5);
        g2d.fillRect(123 + x, 67 + y, 1, 6);
        g2d.fillRect(92 + x, 68 + y, 1, 10);
        g2d.fillRect(96 + x, 68 + y, 1, 10);
        g2d.fillRect(107 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(120 + x, 71 + y, 1, 3);
        g2d.fillRect(102 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 4);
        g2d.fillRect(119 + x, 72 + y, 1, 4);
        g2d.fillRect(124 + x, 73 + y, 1, 4);
        g2d.fillRect(101 + x, 74 + y, 1, 2);
        g2d.fillRect(121 + x, 74 + y, 1, 3);
        g2d.fillRect(100 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 76 + y, 1, 2);
        g2d.fillRect(122 + x, 76 + y, 2, 1);
        g2d.fillRect(91 + x, 77 + y, 1, 1);
        g2d.fillRect(93 + x, 77 + y, 3, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(98 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 23);
        g2d.fillRect(98 + x, 45 + y, 2, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 4);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 49 + y, 1, 4);
        g2d.fillRect(97 + x, 50 + y, 1, 11);
        g2d.fillRect(120 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(118 + x, 60 + y, 1, 4);
        g2d.fillRect(96 + x, 61 + y, 1, 7);
        g2d.fillRect(121 + x, 61 + y, 1, 5);
        g2d.fillRect(107 + x, 62 + y, 1, 6);
        g2d.fillRect(119 + x, 63 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 1, 7);
        g2d.fillRect(105 + x, 66 + y, 1, 5);
        g2d.fillRect(120 + x, 66 + y, 1, 5);
        g2d.fillRect(122 + x, 67 + y, 1, 6);
        g2d.fillRect(93 + x, 68 + y, 1, 9);
        g2d.fillRect(95 + x, 68 + y, 1, 9);
        g2d.fillRect(116 + x, 68 + y, 1, 4);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 6);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(105 + x, 72 + y, 1, 4);
        g2d.fillRect(118 + x, 72 + y, 1, 5);
        g2d.fillRect(121 + x, 73 + y, 1, 1);
        g2d.fillRect(123 + x, 73 + y, 1, 3);
        g2d.fillRect(102 + x, 74 + y, 1, 3);
        g2d.fillRect(101 + x, 76 + y, 1, 2);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(102 + x, 78 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 41 + y, 1, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 16);
        g2d.fillRect(97 + x, 45 + y, 1, 5);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 21);
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 61 + y, 1, 5);
        g2d.fillRect(120 + x, 61 + y, 1, 5);
        g2d.fillRect(104 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 9);
        g2d.fillRect(114 + x, 62 + y, 1, 8);
        g2d.fillRect(121 + x, 66 + y, 1, 7);
        g2d.fillRect(94 + x, 68 + y, 1, 9);
        g2d.fillRect(115 + x, 70 + y, 1, 4);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 4);
        g2d.fillRect(116 + x, 72 + y, 1, 4);
        g2d.fillRect(122 + x, 73 + y, 1, 3);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(89 + x, 82 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 3, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 13);
        g2d.fillRect(114 + x, 47 + y, 1, 8);
        g2d.fillRect(115 + x, 47 + y, 1, 5);
        g2d.fillRect(116 + x, 47 + y, 1, 5);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 3);
        g2d.fillRect(104 + x, 48 + y, 1, 2);
        g2d.fillRect(105 + x, 48 + y, 1, 7);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 7);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 1, 7);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 5);
        g2d.fillRect(108 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 2, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 4);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 3);
        g2d.fillRect(117 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 3);
        g2d.fillRect(119 + x, 51 + y, 1, 7);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(116 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 4);
        g2d.fillRect(117 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 5);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(117 + x, 52 + y, 1, 5);
        g2d.fillRect(101 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 55 + y, 1, 3);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
    }
}
