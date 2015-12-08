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
public class Srt1 extends SuperTU
{
    Piece piece = null;

    public Srt1()
    {
        super();
        sch = true;
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt1(String middle)
    {
        super(middle);
        piece = new Star0();
        sch = true;
        containsTL = true;
    }

    public Srt1(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        piece = new Star0(colorSwitch);
        sch = true;
        containsTL = true;
    }

    public Srt1(String middle, Piece p)
    {
        super(middle);
        piece = p;
    }

    public Srt1(String middle, ColorArray colorSwitch, Piece p)
    {
        super(middle, colorSwitch);
        piece = p;
    }
    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(116 + x, 67 + y, 1, 2);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 6);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 3);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 69 + y, 1, 8);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 16, 2);
        g2d.fillRect(101 + x, 58 + y, 15, 1);
        g2d.fillRect(102 + x, 59 + y, 13, 1);
        g2d.fillRect(103 + x, 60 + y, 2, 5);
        g2d.fillRect(105 + x, 60 + y, 9, 1);
        g2d.fillRect(105 + x, 61 + y, 8, 1);
        g2d.fillRect(105 + x, 62 + y, 7, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 3);
        g2d.fillRect(117 + x, 71 + y, 1, 5);
        g2d.fillRect(118 + x, 73 + y, 1, 3);
        g2d.fillRect(115 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 73 + y, 2, 3);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 5);
        g2d.fillRect(106 + x, 71 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 6);
        g2d.fillRect(112 + x, 67 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 6, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 5, 1);
        g2d.fillRect(107 + x, 65 + y, 3, 2);
        g2d.fillRect(106 + x, 67 + y, 3, 2);
        g2d.fillRect(106 + x, 69 + y, 2, 2);
        g2d.fillRect(111 + x, 69 + y, 1, 3);
        g2d.fillRect(110 + x, 71 + y, 1, 3);
        g2d.fillRect(109 + x, 73 + y, 1, 3);
        g2d.fillRect(108 + x, 75 + y, 1, 2);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 4);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(113 + x, 74 + y, 1, 3);
        g2d.fillRect(108 + x, 69 + y, 1, 6);
        g2d.fillRect(116 + x, 63 + y, 1, 4);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(107 + x, 71 + y, 1, 5);
        g2d.fillRect(106 + x, 73 + y, 1, 3);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 6, 2);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 4, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 4);
        g2d.fillRect(114 + x, 60 + y, 1, 3);
        g2d.fillRect(115 + x, 59 + y, 1, 3);
        g2d.fillRect(115 + x, 64 + y, 1, 5);
        g2d.fillRect(114 + x, 66 + y, 1, 5);
        g2d.fillRect(113 + x, 68 + y, 1, 5);
        g2d.fillRect(114 + x, 75 + y, 1, 4);
        g2d.fillRect(115 + x, 77 + y, 2, 2);
        g2d.fillRect(117 + x, 76 + y, 3, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(112 + x, 70 + y, 1, 6);
        g2d.fillRect(112 + x, 62 + y, 1, 5);
        g2d.fillRect(111 + x, 63 + y, 1, 6);
        g2d.fillRect(110 + x, 65 + y, 1, 6);
        g2d.fillRect(109 + x, 67 + y, 1, 6);
        g2d.fillRect(111 + x, 72 + y, 1, 5);
        g2d.fillRect(110 + x, 74 + y, 1, 5);
        g2d.fillRect(109 + x, 76 + y, 1, 3);
        g2d.fillRect(108 + x, 77 + y, 1, 2);
    }

    public void drawC(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 62 + y, 5, 1);
        g2d.fillRect(113 + x, 61 + y, 2, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(100 + x, 61 + y, 2, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 5, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(98 + x, 59 + y, 1, 1);
        g2d.fillRect(123 + x, 57 + y, 1, 2);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(124 + x, 56 + y, 1, 1);
        g2d.fillRect(123 + x, 53 + y, 2, 1);
        g2d.fillRect(122 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 5, 1);
        g2d.fillRect(97 + x, 53 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 4);
        g2d.fillRect(119 + x, 61 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 61 + y, 1, 1);
        g2d.fillRect(122 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 52 + y, 7, 1);
        g2d.fillRect(118 + x, 51 + y, 3, 1);
        g2d.fillRect(119 + x, 60 + y, 2, 1);
        g2d.fillRect(120 + x, 59 + y, 2, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 3, 1);
        g2d.fillRect(120 + x, 53 + y, 3, 1);
        g2d.fillRect(120 + x, 54 + y, 2, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 7, 1);
        g2d.fillRect(100 + x, 51 + y, 3, 1);
        g2d.fillRect(99 + x, 52 + y, 3, 1);
        g2d.fillRect(98 + x, 53 + y, 3, 1);
        g2d.fillRect(97 + x, 54 + y, 4, 3);
        g2d.fillRect(98 + x, 57 + y, 4, 2);
        g2d.fillRect(99 + x, 59 + y, 4, 1);
        g2d.fillRect(100 + x, 60 + y, 6, 1);
        g2d.fillRect(102 + x, 61 + y, 5, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 51 + y, 15, 1);
        g2d.fillRect(102 + x, 52 + y, 5, 1);
        g2d.fillRect(114 + x, 52 + y, 5, 1);
        g2d.fillRect(101 + x, 53 + y, 19, 4);
        g2d.fillRect(102 + x, 57 + y, 17, 1);
        g2d.fillRect(102 + x, 58 + y, 16, 1);
        g2d.fillRect(103 + x, 59 + y, 4, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 3, 1);
        g2d.fillRect(114 + x, 60 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 3);
        g2d.fillRect(123 + x, 52 + y, 1, 1);
        g2d.fillRect(97 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 4, 1);
        g2d.fillRect(98 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 48 + y, 4, 1);
        g2d.fillRect(100 + x, 49 + y, 4, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 49 + y, 4, 2);
        g2d.fillRect(121 + x, 50 + y, 1, 2);
        g2d.fillRect(122 + x, 51 + y, 1, 1);
        g2d.fillRect(122 + x, 54 + y, 3, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 3);
        g2d.fillRect(122 + x, 56 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(120 + x, 56 + y, 1, 3);
        g2d.fillRect(105 + x, 48 + y, 3, 1);
        g2d.fillRect(104 + x, 49 + y, 6, 1);
        g2d.fillRect(104 + x, 50 + y, 13, 1);
        g2d.fillRect(111 + x, 49 + y, 6, 1);
        g2d.fillRect(113 + x, 48 + y, 3, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 3);
    }

    public void drawD(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 62 + y, 6, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(99 + x, 61 + y, 2, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 5, 1);
        g2d.fillRect(98 + x, 60 + y, 1, 1);
        g2d.fillRect(123 + x, 59 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 1);
        g2d.fillRect(124 + x, 57 + y, 1, 2);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(125 + x, 56 + y, 1, 1);
        g2d.fillRect(124 + x, 52 + y, 2, 1);
        g2d.fillRect(123 + x, 51 + y, 1, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 4, 1);
        g2d.fillRect(96 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 52 + y, 1, 5);
        g2d.fillRect(120 + x, 61 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(123 + x, 57 + y, 1, 2);
        g2d.fillRect(124 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 7, 1);
        g2d.fillRect(119 + x, 50 + y, 3, 1);
        g2d.fillRect(120 + x, 60 + y, 2, 1);
        g2d.fillRect(120 + x, 51 + y, 3, 1);
        g2d.fillRect(121 + x, 52 + y, 3, 1);
        g2d.fillRect(121 + x, 53 + y, 2, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(122 + x, 58 + y, 1, 1);
        g2d.fillRect(121 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 7, 1);
        g2d.fillRect(99 + x, 50 + y, 3, 1);
        g2d.fillRect(98 + x, 51 + y, 3, 1);
        g2d.fillRect(97 + x, 52 + y, 3, 1);
        g2d.fillRect(96 + x, 53 + y, 4, 4);
        g2d.fillRect(97 + x, 57 + y, 4, 2);
        g2d.fillRect(98 + x, 59 + y, 4, 1);
        g2d.fillRect(99 + x, 60 + y, 6, 1);
        g2d.fillRect(101 + x, 61 + y, 6, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 50 + y, 17, 1);
        g2d.fillRect(101 + x, 51 + y, 19, 1);
        g2d.fillRect(100 + x, 52 + y, 7, 1);
        g2d.fillRect(114 + x, 52 + y, 7, 1);
        g2d.fillRect(100 + x, 53 + y, 21, 3);
        g2d.fillRect(100 + x, 56 + y, 20, 1);
        g2d.fillRect(101 + x, 57 + y, 18, 1);
        g2d.fillRect(101 + x, 58 + y, 17, 1);
        g2d.fillRect(102 + x, 59 + y, 5, 1);
        g2d.fillRect(105 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 3, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(118 + x, 58 + y, 1, 4);
        g2d.fillRect(124 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 4, 1);
        g2d.fillRect(97 + x, 50 + y, 2, 1);
        g2d.fillRect(114 + x, 62 + y, 3, 1);
        g2d.fillRect(100 + x, 47 + y, 4, 1);
        g2d.fillRect(99 + x, 48 + y, 4, 1);
        g2d.fillRect(98 + x, 49 + y, 5, 1);
        g2d.fillRect(118 + x, 48 + y, 4, 1);
        g2d.fillRect(118 + x, 49 + y, 5, 1);
        g2d.fillRect(122 + x, 50 + y, 2, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 3);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(122 + x, 54 + y, 1, 4);
        g2d.fillRect(123 + x, 56 + y, 1, 1);
        g2d.fillRect(123 + x, 53 + y, 3, 3);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(121 + x, 55 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 4);
        g2d.fillRect(119 + x, 57 + y, 1, 4);
        g2d.fillRect(104 + x, 47 + y, 4, 1);
        g2d.fillRect(113 + x, 47 + y, 4, 1);
        g2d.fillRect(103 + x, 48 + y, 7, 1);
        g2d.fillRect(111 + x, 48 + y, 7, 1);
        g2d.fillRect(103 + x, 49 + y, 15, 1);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equalsIgnoreCase("c"))
        {
            drawC(x,y,g2d);
        }
        else if(middle.equalsIgnoreCase("d"))
        {
            drawD(x,y,g2d);
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
}
