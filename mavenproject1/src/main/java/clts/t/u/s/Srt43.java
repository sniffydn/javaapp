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
public class Srt43 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt43()
    {
        super();
        containsTL = true;
    }

    public Srt43(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt43(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintB(x,y,g2d);
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 2);
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(99 + x, 41 + y, 4, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 2);
        g2d.fillRect(115 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 2, 1);
        g2d.fillRect(104 + x, 42 + y, 2, 1);
        g2d.fillRect(112 + x, 42 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 1, 2);
        g2d.fillRect(103 + x, 43 + y, 1, 3);
        g2d.fillRect(105 + x, 43 + y, 3, 1);
        g2d.fillRect(111 + x, 43 + y, 1, 2);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(104 + x, 44 + y, 1, 4);
        g2d.fillRect(106 + x, 44 + y, 5, 1);
        g2d.fillRect(108 + x, 45 + y, 1, 4);
        g2d.fillRect(109 + x, 45 + y, 1, 3);
        g2d.fillRect(110 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 4);
        g2d.fillRect(113 + x, 45 + y, 1, 3);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 46 + y, 1, 2);
        g2d.fillRect(107 + x, 46 + y, 1, 2);
        g2d.fillRect(111 + x, 47 + y, 1, 3);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 2, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(104 + x, 43 + y, 1, 1);
        g2d.fillRect(113 + x, 43 + y, 1, 2);
        g2d.fillRect(105 + x, 44 + y, 1, 2);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 2, 1);
        g2d.fillRect(111 + x, 45 + y, 1, 2);
        g2d.fillRect(110 + x, 46 + y, 1, 3);
        g2d.fillRect(109 + x, 48 + y, 1, 2);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
    }





    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 47 + y, 4, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(105 + x, 48 + y, 3, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 3);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(111 + x, 49 + y, 1, 8);
        g2d.fillRect(116 + x, 49 + y, 3, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 2);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(110 + x, 50 + y, 1, 5);
        g2d.fillRect(117 + x, 50 + y, 3, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 3, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 6);
        g2d.fillRect(119 + x, 52 + y, 3, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(109 + x, 53 + y, 1, 4);
        g2d.fillRect(120 + x, 53 + y, 1, 5);
        g2d.fillRect(121 + x, 53 + y, 1, 3);
        g2d.fillRect(108 + x, 55 + y, 1, 3);
        g2d.fillRect(112 + x, 55 + y, 1, 4);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 1, 3);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 2);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 4);
        g2d.fillRect(113 + x, 49 + y, 1, 3);
        g2d.fillRect(114 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 50 + y, 2, 1);
        g2d.fillRect(103 + x, 51 + y, 2, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 4);
        g2d.fillRect(112 + x, 51 + y, 1, 4);
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 52 + y, 2, 1);
        g2d.fillRect(117 + x, 52 + y, 2, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 4);
        g2d.fillRect(107 + x, 53 + y, 1, 4);
        g2d.fillRect(118 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 3);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 49 + y, 1, 2);
        g2d.fillRect(107 + x, 50 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 1, 7);
        g2d.fillRect(106 + x, 51 + y, 1, 5);
        g2d.fillRect(114 + x, 51 + y, 1, 7);
        g2d.fillRect(115 + x, 51 + y, 1, 7);
        g2d.fillRect(103 + x, 52 + y, 1, 7);
        g2d.fillRect(104 + x, 52 + y, 1, 7);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 7);
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(102 + x, 53 + y, 1, 5);
        g2d.fillRect(117 + x, 53 + y, 1, 4);
        g2d.fillRect(118 + x, 54 + y, 1, 3);
    }





    public void paintBackTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 40 + y, 1, 2);
        g2d.fillRect(101 + x, 40 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 4, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(100 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 2, 1);
        g2d.fillRect(110 + x, 42 + y, 2, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 2);
        g2d.fillRect(113 + x, 43 + y, 1, 2);
        g2d.fillRect(112 + x, 43 + y, 1, 3);
        g2d.fillRect(108 + x, 43 + y, 3, 1);
        g2d.fillRect(104 + x, 43 + y, 1, 2);
        g2d.fillRect(101 + x, 43 + y, 1, 2);
        g2d.fillRect(111 + x, 44 + y, 1, 4);
        g2d.fillRect(105 + x, 44 + y, 5, 1);
        g2d.fillRect(107 + x, 45 + y, 1, 4);
        g2d.fillRect(106 + x, 45 + y, 1, 3);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 4);
        g2d.fillRect(102 + x, 45 + y, 1, 3);
        g2d.fillRect(110 + x, 46 + y, 1, 2);
        g2d.fillRect(109 + x, 46 + y, 1, 2);
        g2d.fillRect(108 + x, 46 + y, 1, 2);
        g2d.fillRect(104 + x, 47 + y, 1, 3);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(94 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(98 + x, 61 + y, 2, 1);
        g2d.fillRect(98 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(111 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 2);
        g2d.fillRect(110 + x, 44 + y, 1, 2);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(108 + x, 45 + y, 2, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 2);
        g2d.fillRect(105 + x, 46 + y, 1, 3);
        g2d.fillRect(106 + x, 48 + y, 1, 2);
        g2d.fillRect(94 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 3, 1);
        g2d.fillRect(98 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
    }





    public void paintBackB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 47 + y, 4, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 2);
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(108 + x, 48 + y, 3, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 3);
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(111 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 1, 8);
        g2d.fillRect(97 + x, 49 + y, 3, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 2);
        g2d.fillRect(113 + x, 50 + y, 1, 2);
        g2d.fillRect(105 + x, 50 + y, 1, 5);
        g2d.fillRect(96 + x, 50 + y, 3, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(95 + x, 51 + y, 3, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 6);
        g2d.fillRect(94 + x, 52 + y, 3, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 4);
        g2d.fillRect(106 + x, 53 + y, 1, 4);
        g2d.fillRect(95 + x, 53 + y, 1, 5);
        g2d.fillRect(94 + x, 53 + y, 1, 3);
        g2d.fillRect(107 + x, 55 + y, 1, 3);
        g2d.fillRect(103 + x, 55 + y, 1, 4);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 3);
        g2d.fillRect(96 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(97 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 2);
        g2d.fillRect(100 + x, 59 + y, 1, 2);
        g2d.fillRect(98 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(99 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 49 + y, 1, 4);
        g2d.fillRect(102 + x, 49 + y, 1, 3);
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 2, 1);
        g2d.fillRect(111 + x, 51 + y, 2, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 4);
        g2d.fillRect(103 + x, 51 + y, 1, 4);
        g2d.fillRect(98 + x, 51 + y, 2, 1);
        g2d.fillRect(113 + x, 52 + y, 2, 1);
        g2d.fillRect(97 + x, 52 + y, 2, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 4);
        g2d.fillRect(108 + x, 53 + y, 1, 4);
        g2d.fillRect(96 + x, 53 + y, 2, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 3);
        g2d.fillRect(96 + x, 54 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(98 + x, 57 + y, 1, 2);
        g2d.fillRect(97 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(99 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 49 + y, 1, 2);
        g2d.fillRect(108 + x, 50 + y, 1, 3);
        g2d.fillRect(110 + x, 51 + y, 1, 7);
        g2d.fillRect(109 + x, 51 + y, 1, 5);
        g2d.fillRect(101 + x, 51 + y, 1, 7);
        g2d.fillRect(100 + x, 51 + y, 1, 7);
        g2d.fillRect(112 + x, 52 + y, 1, 7);
        g2d.fillRect(111 + x, 52 + y, 1, 7);
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 7);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(113 + x, 53 + y, 1, 5);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(97 + x, 54 + y, 1, 3);
    }

}
