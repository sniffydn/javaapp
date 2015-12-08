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
public class Srt24 extends SuperTU
{
    public Srt24()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt24(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt24(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
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

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(101 + x, 48 + y, 3, 1);
        g2d.fillRect(116 + x, 48 + y, 4, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 3, 1);
        g2d.fillRect(114 + x, 49 + y, 2, 1);
        g2d.fillRect(119 + x, 49 + y, 2, 1);
        g2d.fillRect(105 + x, 50 + y, 3, 1);
        g2d.fillRect(111 + x, 50 + y, 3, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(97 + x, 53 + y, 1, 2);
        g2d.fillRect(100 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 2);
        g2d.fillRect(122 + x, 53 + y, 1, 2);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 2, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 2, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 3, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 5, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 49 + y, 1, 5);
        g2d.fillRect(117 + x, 49 + y, 1, 3);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 2);
        g2d.fillRect(99 + x, 55 + y, 1, 2);
        g2d.fillRect(110 + x, 55 + y, 3, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 2, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 3, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 49 + y, 1, 3);
        g2d.fillRect(103 + x, 49 + y, 1, 5);
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 2, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 3);
        g2d.fillRect(119 + x, 51 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 52 + y, 1, 2);
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 2, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 2, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 3, 1);
        g2d.fillRect(106 + x, 56 + y, 5, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 2, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 2, 1);
        g2d.fillRect(108 + x, 58 + y, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 4);
        g2d.fillRect(109 + x, 50 + y, 2, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 3);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 4);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 3);
        g2d.fillRect(117 + x, 52 + y, 1, 3);
        g2d.fillRect(98 + x, 53 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 2);
        g2d.fillRect(120 + x, 53 + y, 2, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 3);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 3, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 3, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 9);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(103 + x, 65 + y, 1, 9);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 6);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(106 + x, 68 + y, 2, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(105 + x, 71 + y, 2, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 3, 1);
        g2d.fillRect(108 + x, 75 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 3);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 2, 1);
        g2d.fillRect(106 + x, 63 + y, 2, 1);
        g2d.fillRect(103 + x, 64 + y, 2, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 2, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 2, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 3, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 2);
        g2d.fillRect(106 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 3, 1);
        g2d.fillRect(107 + x, 71 + y, 2, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 3, 1);
        g2d.fillRect(105 + x, 73 + y, 3, 1);
        g2d.fillRect(108 + x, 74 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 59 + y, 3, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 3);
        g2d.fillRect(108 + x, 60 + y, 1, 5);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 2, 1);
        g2d.fillRect(109 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 4);
        g2d.fillRect(114 + x, 61 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 2, 1);
        g2d.fillRect(110 + x, 63 + y, 3, 1);
        g2d.fillRect(105 + x, 64 + y, 3, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 5, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 4, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 2, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 2, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 3);
        g2d.fillRect(110 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 71 + y, 1, 2);
        g2d.fillRect(113 + x, 71 + y, 1, 3);
        g2d.fillRect(114 + x, 71 + y, 3, 1);
        g2d.fillRect(105 + x, 72 + y, 4, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 3, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 3, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 2);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 2, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 3, 1);
    }
}
