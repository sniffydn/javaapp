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
public class Srt47 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt47()
    {
        super();
        containsTL = true;
    }

    public Srt47(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt47(String middle, ColorArray colorSwitch)
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

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(105 + x, 50 + y, 5, 1);
        g2d.fillRect(115 + x, 50 + y, 3, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 2, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(109 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 3);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(101 + x, 52 + y, 1, 4);
        g2d.fillRect(107 + x, 52 + y, 1, 2);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 2, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 3, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 2);
        g2d.fillRect(98 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 53 + y, 1, 3);
        g2d.fillRect(110 + x, 53 + y, 1, 2);
        g2d.fillRect(113 + x, 54 + y, 1, 3);
        g2d.fillRect(120 + x, 54 + y, 1, 4);
        g2d.fillRect(107 + x, 55 + y, 1, 3);
        g2d.fillRect(111 + x, 55 + y, 1, 3);
        g2d.fillRect(116 + x, 55 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 5);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 2, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 50 + y, 2, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 4);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 2, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 3);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(116 + x, 53 + y, 2, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 5);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 2, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 50 + y, 1, 2);
        g2d.fillRect(111 + x, 50 + y, 2, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(113 + x, 51 + y, 2, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(111 + x, 57 + y, 1, 6);
        g2d.fillRect(101 + x, 60 + y, 1, 3);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 5);
        g2d.fillRect(112 + x, 62 + y, 1, 9);
        g2d.fillRect(102 + x, 63 + y, 1, 3);
        g2d.fillRect(103 + x, 65 + y, 1, 5);
        g2d.fillRect(119 + x, 65 + y, 1, 4);
        g2d.fillRect(118 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 69 + y, 2, 1);
        g2d.fillRect(104 + x, 70 + y, 5, 1);
        g2d.fillRect(110 + x, 70 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 60 + y, 2, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 56 + y, 1, 6);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 2, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(118 + x, 65 + y, 1, 2);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 3, 1);
        g2d.fillRect(118 + x, 69 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 7);
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 2, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 2, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 4);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 6);
        g2d.fillRect(111 + x, 65 + y, 1, 5);
        g2d.fillRect(117 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 4);
        g2d.fillRect(104 + x, 67 + y, 1, 3);
        g2d.fillRect(106 + x, 67 + y, 2, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(117 + x, 67 + y, 2, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 2, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 9);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 2, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);
        g2d.fillRect(103 + x, 63 + y, 4, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 3);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 4);
        g2d.fillRect(115 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 3);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
    }
}
