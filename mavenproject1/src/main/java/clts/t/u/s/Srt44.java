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
public class Srt44 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt44()
    {
        super();
        containsTL = true;
    }

    public Srt44(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt44(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paint2TL(x,0,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paint2TU(x,y,g2d);
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

   public void paint2TL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 2);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 2);
        g2d.fillRect(113 + x, 46 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(120 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(100 + x, 69 + y, 1, 2);
        g2d.fillRect(101 + x, 69 + y, 1, 1);
        g2d.fillRect(102 + x, 70 + y, 1, 3);
        g2d.fillRect(99 + x, 71 + y, 1, 2);
        g2d.fillRect(101 + x, 71 + y, 1, 1);
        g2d.fillRect(100 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 3, 1);
        g2d.fillRect(115 + x, 72 + y, 4, 1);
        g2d.fillRect(101 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(100 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 7, 1);
        g2d.fillRect(99 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(112 + x, 43 + y, 2, 1);
        g2d.fillRect(113 + x, 44 + y, 2, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 6);
        g2d.fillRect(103 + x, 64 + y, 1, 8);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 2, 1);
        g2d.fillRect(103 + x, 74 + y, 2, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 2, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 2, 1);
        g2d.fillRect(106 + x, 76 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 2, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 4);
        g2d.fillRect(104 + x, 60 + y, 1, 6);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 3, 1);
        g2d.fillRect(114 + x, 61 + y, 3, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 3);
        g2d.fillRect(104 + x, 69 + y, 1, 2);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 2, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(111 + x, 61 + y, 3, 1);
        g2d.fillRect(105 + x, 62 + y, 4, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 63 + y, 1, 3);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(113 + x, 66 + y, 1, 4);
        g2d.fillRect(106 + x, 67 + y, 1, 4);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 2, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 4);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 12);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 2, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 5);
        g2d.fillRect(108 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 3, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 67 + y, 2, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 5);
        g2d.fillRect(107 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(109 + x, 71 + y, 1, 3);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 2);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 2, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 59 + y, 1, 3);
        g2d.fillRect(109 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 3);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 1, 2);
    }





    public void paint2TU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 3);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 4);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 2, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 2, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 2);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 4);
        g2d.fillRect(106 + x, 53 + y, 1, 2);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(100 + x, 56 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 48 + y, 2, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 3, 1);
        g2d.fillRect(100 + x, 58 + y, 3, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 47 + y, 2, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(107 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 7);
        g2d.fillRect(112 + x, 51 + y, 1, 3);
        g2d.fillRect(113 + x, 51 + y, 2, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 53 + y, 1, 5);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 3);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 3, 1);
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 5);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 3);
        g2d.fillRect(106 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 2, 1);
        g2d.fillRect(103 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 3, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 52 + y, 1, 4);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 3);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 4);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(114 + x, 52 + y, 2, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 3, 1);
    }

}
