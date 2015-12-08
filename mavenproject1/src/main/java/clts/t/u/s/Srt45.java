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
public class Srt45 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt45()
    {
        super();
        containsTL = true;
        drs = true;
    }

    public Srt45(String middle)
    {
        super(middle);
        containsTL = true;
        drs = true;
    }

    public Srt45(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        drs = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 74 + y, 2, 1);
        g2d.fillRect(120 + x, 75 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(117 + x, 44 + y, 1, 3);
        g2d.fillRect(115 + x, 45 + y, 1, 3);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 61 + y, 1, 12);
        g2d.fillRect(115 + x, 62 + y, 1, 11);
        g2d.fillRect(103 + x, 63 + y, 1, 4);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 5);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 2, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 2, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(111 + x, 72 + y, 2, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 3);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 2, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 4);
        g2d.fillRect(113 + x, 60 + y, 1, 6);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 2, 1);
        g2d.fillRect(104 + x, 63 + y, 2, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 4);
        g2d.fillRect(105 + x, 64 + y, 1, 4);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 2, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 3);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 2, 1);
        g2d.fillRect(116 + x, 74 + y, 2, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 5);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 5);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 2, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 64 + y, 1, 7);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 2, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 4);
        g2d.fillRect(107 + x, 67 + y, 2, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 5);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 2, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 12);
        g2d.fillRect(111 + x, 49 + y, 1, 2);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 10);
        g2d.fillRect(108 + x, 50 + y, 1, 2);
        g2d.fillRect(109 + x, 50 + y, 2, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 7);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 3, 1);
        g2d.fillRect(116 + x, 52 + y, 2, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 4);
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 2, 1);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 47 + y, 3, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 4);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 3, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 2, 1);
        g2d.fillRect(113 + x, 52 + y, 3, 1);
        g2d.fillRect(102 + x, 53 + y, 3, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 4);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(100 + x, 54 + y, 2, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 3, 1);
        g2d.fillRect(102 + x, 56 + y, 2, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(101 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 2, 1);
        g2d.fillRect(103 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 2, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 2, 1);
        g2d.fillRect(108 + x, 52 + y, 3, 1);
        g2d.fillRect(105 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 2, 1);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 4);
        g2d.fillRect(113 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 2, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 3, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 53 + y, 3, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 3, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 4);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 3, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 2, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 54 + y, 1, 4);
        g2d.fillRect(109 + x, 54 + y, 3, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 2, 1);
    }
}
