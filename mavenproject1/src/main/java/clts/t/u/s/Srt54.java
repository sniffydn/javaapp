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
public class Srt54 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt54()
    {
        super();
        containsTL = Math.random() < .5;
    }

    public Srt54(String middle)
    {
        super(middle);
        containsTL = Math.random() < .5;
    }

    public Srt54(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = Math.random() < .5;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(104 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 4);
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
    }

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 9);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 3);
        g2d.fillRect(114 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 7, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(101 + x, 49 + y, 1, 9);
        g2d.fillRect(117 + x, 49 + y, 1, 10);
        g2d.fillRect(118 + x, 50 + y, 1, 8);
        g2d.fillRect(102 + x, 51 + y, 1, 8);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(103 + x, 52 + y, 1, 7);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 55 + y, 1, 4);
        g2d.fillRect(116 + x, 55 + y, 1, 4);
        g2d.fillRect(115 + x, 56 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
    }
}
