/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

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
public class Mesh2 extends SuperTU
{
    public Mesh2()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Mesh2(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Mesh2(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {}
    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {}

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
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        drawUpper(offsetX, offsetY, g2d);
        drawLower(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(98 + x, 41 + y, 4, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 2);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 4, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 3);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 4, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 3);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 3);
        g2d.fillRect(104 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 3);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 2, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 3);
        g2d.fillRect(101 + x, 44 + y, 1, 3);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 44 + y, 3, 1);
        g2d.fillRect(109 + x, 44 + y, 1, 3);
        g2d.fillRect(111 + x, 44 + y, 1, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 3);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 3);
        g2d.fillRect(93 + x, 45 + y, 1, 24);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 3);
        g2d.fillRect(104 + x, 45 + y, 1, 3);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(108 + x, 45 + y, 1, 1);
        g2d.fillRect(110 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 3);
        g2d.fillRect(116 + x, 45 + y, 1, 3);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(95 + x, 46 + y, 1, 3);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 1);
        g2d.fillRect(105 + x, 46 + y, 1, 1);
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(111 + x, 46 + y, 1, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(120 + x, 46 + y, 1, 5);
        g2d.fillRect(94 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 47 + y, 1, 1);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 3);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 48 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 3);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(94 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 3);
        g2d.fillRect(94 + x, 53 + y, 1, 3);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 3);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 7);
        g2d.fillRect(94 + x, 57 + y, 1, 3);
        g2d.fillRect(98 + x, 57 + y, 1, 10);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 6);
        g2d.fillRect(111 + x, 58 + y, 1, 3);
        g2d.fillRect(120 + x, 58 + y, 1, 2);
        g2d.fillRect(96 + x, 59 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 3);
        g2d.fillRect(110 + x, 59 + y, 1, 3);
        g2d.fillRect(112 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(118 + x, 59 + y, 1, 3);
        g2d.fillRect(95 + x, 60 + y, 1, 3);
        g2d.fillRect(101 + x, 60 + y, 6, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 1, 4);
        g2d.fillRect(117 + x, 60 + y, 1, 4);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(94 + x, 61 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 3);
        g2d.fillRect(103 + x, 61 + y, 1, 3);
        g2d.fillRect(104 + x, 61 + y, 3, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 3);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(97 + x, 62 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 62 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(119 + x, 62 + y, 1, 1);
        g2d.fillRect(122 + x, 62 + y, 1, 4);
        g2d.fillRect(94 + x, 63 + y, 1, 3);
        g2d.fillRect(96 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(118 + x, 63 + y, 1, 3);
        g2d.fillRect(120 + x, 63 + y, 1, 3);
        g2d.fillRect(95 + x, 64 + y, 1, 1);
        g2d.fillRect(119 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 64 + y, 1, 1);
        g2d.fillRect(96 + x, 65 + y, 1, 3);
        g2d.fillRect(95 + x, 66 + y, 1, 1);
        g2d.fillRect(97 + x, 66 + y, 1, 14);
        g2d.fillRect(119 + x, 66 + y, 1, 5);
        g2d.fillRect(121 + x, 66 + y, 1, 3);
        g2d.fillRect(123 + x, 66 + y, 1, 9);
        g2d.fillRect(94 + x, 67 + y, 1, 3);
        g2d.fillRect(120 + x, 67 + y, 1, 1);
        g2d.fillRect(122 + x, 67 + y, 1, 1);
        g2d.fillRect(92 + x, 68 + y, 1, 10);
        g2d.fillRect(95 + x, 68 + y, 1, 1);
        g2d.fillRect(96 + x, 69 + y, 1, 3);
        g2d.fillRect(120 + x, 69 + y, 1, 1);
        g2d.fillRect(122 + x, 69 + y, 1, 1);
        g2d.fillRect(93 + x, 70 + y, 1, 1);
        g2d.fillRect(95 + x, 70 + y, 1, 1);
        g2d.fillRect(121 + x, 70 + y, 1, 3);
        g2d.fillRect(94 + x, 71 + y, 1, 3);
        g2d.fillRect(120 + x, 71 + y, 1, 7);
        g2d.fillRect(122 + x, 71 + y, 1, 1);
        g2d.fillRect(93 + x, 72 + y, 1, 1);
        g2d.fillRect(95 + x, 72 + y, 1, 1);
        g2d.fillRect(96 + x, 73 + y, 1, 1);
        g2d.fillRect(122 + x, 73 + y, 1, 1);
        g2d.fillRect(93 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 3);
        g2d.fillRect(121 + x, 74 + y, 1, 3);
        g2d.fillRect(124 + x, 74 + y, 1, 7);
        g2d.fillRect(94 + x, 75 + y, 1, 1);
        g2d.fillRect(96 + x, 75 + y, 1, 1);
        g2d.fillRect(122 + x, 75 + y, 1, 3);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(123 + x, 76 + y, 1, 1);
        g2d.fillRect(91 + x, 77 + y, 1, 4);
        g2d.fillRect(94 + x, 77 + y, 1, 3);
        g2d.fillRect(96 + x, 77 + y, 1, 1);
        g2d.fillRect(93 + x, 78 + y, 1, 1);
        g2d.fillRect(95 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(123 + x, 78 + y, 1, 4);
        g2d.fillRect(92 + x, 79 + y, 1, 2);
        g2d.fillRect(96 + x, 79 + y, 1, 2);
        g2d.fillRect(120 + x, 79 + y, 1, 3);
        g2d.fillRect(122 + x, 79 + y, 1, 1);
        g2d.fillRect(93 + x, 80 + y, 1, 2);
        g2d.fillRect(95 + x, 80 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(94 + x, 81 + y, 1, 1);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
    }





    public void drawB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 1, 4);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 47 + y, 2, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 3);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 3);
        g2d.fillRect(107 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 7);
        g2d.fillRect(99 + x, 49 + y, 1, 4);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 3);
        g2d.fillRect(112 + x, 49 + y, 1, 3);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 5);
        g2d.fillRect(107 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 3);
        g2d.fillRect(119 + x, 50 + y, 1, 3);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 51 + y, 1, 3);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 3);
        g2d.fillRect(110 + x, 51 + y, 1, 3);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 3);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(108 + x, 53 + y, 1, 3);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 4);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 3);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 3);
        g2d.fillRect(106 + x, 55 + y, 1, 5);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(113 + x, 56 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 4);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
    }
}
