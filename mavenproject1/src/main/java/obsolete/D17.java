/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

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
public class D17 extends SuperTU
{
    /** Creates a new instance of GenericClothes */


    public D17()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public D17(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }

    public D17(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 2;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paint7TL(x,0,g2d);
        if(step == 0 || step == 8)
        {
            paint7B1(x,0,g2d);
        }
        else
        {
            paint7B2(x,0,g2d);
        }
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paint7TU(x,y,g2d);
        paint7BOT(x,y,g2d);
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
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, offsetY, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paint7TU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(100 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 2, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 2, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 2, 1);
        g2d.fillRect(112 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(109 + x, 61 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 3, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 3, 1);
        g2d.fillRect(109 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 2, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 2, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 5, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(103 + x, 58 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 52 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 4, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 57 + y, 2, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
    }





    public void paint7TL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 1);
        g2d.fillRect(102 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 2, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 3);
        g2d.fillRect(101 + x, 81 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(117 + x, 83 + y, 2, 1);
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(101 + x, 84 + y, 2, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 3);
        g2d.fillRect(100 + x, 86 + y, 2, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(116 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 2);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 2, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 3);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 2, 1);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 2, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 55 + y, 2, 1);
        g2d.fillRect(116 + x, 55 + y, 2, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 3);
        g2d.fillRect(104 + x, 56 + y, 2, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 2);
        g2d.fillRect(103 + x, 66 + y, 1, 2);
        g2d.fillRect(104 + x, 66 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 2, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 2, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 4);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 2);
        g2d.fillRect(116 + x, 77 + y, 2, 1);
        g2d.fillRect(106 + x, 78 + y, 2, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(118 + x, 79 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 2, 1);
        g2d.fillRect(105 + x, 85 + y, 2, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 2, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 2);
        g2d.fillRect(121 + x, 89 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 3, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 2, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 2, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 2, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 75 + y, 1, 3);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 2);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 2, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 4);
        g2d.fillRect(110 + x, 77 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 55 + y, 6, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 1, 5);
        g2d.fillRect(114 + x, 55 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 2, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 2, 1);
        g2d.fillRect(109 + x, 58 + y, 3, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 2, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 8);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 3);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 3);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 2, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 3);
        g2d.fillRect(107 + x, 68 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 2, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 5);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 4);
        g2d.fillRect(112 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 75 + y, 1, 2);
        g2d.fillRect(113 + x, 75 + y, 2, 1);
        g2d.fillRect(109 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 3);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 2);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 2, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 4);
        g2d.fillRect(109 + x, 80 + y, 1, 8);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 3);
        g2d.fillRect(105 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 3);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(114 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 2, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 56 + y, 1, 3);
        g2d.fillRect(107 + x, 57 + y, 2, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 1, 4);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 3);
        g2d.fillRect(108 + x, 68 + y, 1, 3);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 3, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 2);
        g2d.fillRect(113 + x, 71 + y, 1, 4);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 2, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 4);
        g2d.fillRect(106 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(109 + x, 56 + y, 2, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(110 + x, 71 + y, 1, 4);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 2);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 2, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
    }





    public void paint7B1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 3);
        g2d.fillRect(120 + x, 97 + y, 1, 2);
        g2d.fillRect(105 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 2, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 2);
        g2d.fillRect(103 + x, 104 + y, 2, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 108 + y, 1, 3);
        g2d.fillRect(116 + x, 109 + y, 2, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 112 + y, 1, 1);
        g2d.fillRect(106 + x, 114 + y, 1, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 2);
        g2d.fillRect(106 + x, 121 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 130 + y, 1, 1);
        g2d.fillRect(106 + x, 131 + y, 2, 1);
        g2d.fillRect(102 + x, 133 + y, 1, 3);
        g2d.fillRect(119 + x, 134 + y, 2, 1);
        g2d.fillRect(103 + x, 136 + y, 2, 1);
        g2d.fillRect(120 + x, 136 + y, 1, 2);
        g2d.fillRect(119 + x, 137 + y, 1, 1);
        g2d.fillRect(104 + x, 138 + y, 1, 2);
        g2d.fillRect(106 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 2, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 2, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 3);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 2);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(105 + x, 108 + y, 1, 1);
        g2d.fillRect(106 + x, 110 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 2, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 116 + y, 1, 1);
        g2d.fillRect(106 + x, 122 + y, 1, 3);
        g2d.fillRect(115 + x, 124 + y, 1, 1);
        g2d.fillRect(104 + x, 128 + y, 2, 1);
        g2d.fillRect(107 + x, 128 + y, 1, 2);
        g2d.fillRect(108 + x, 128 + y, 1, 1);
        g2d.fillRect(104 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 131 + y, 1, 3);
        g2d.fillRect(107 + x, 133 + y, 1, 1);
        g2d.fillRect(121 + x, 134 + y, 1, 1);
        g2d.fillRect(103 + x, 135 + y, 2, 1);
        g2d.fillRect(119 + x, 135 + y, 2, 1);
        g2d.fillRect(119 + x, 138 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(106 + x, 115 + y, 1, 1);
        g2d.fillRect(106 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(105 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 120 + y, 1, 1);
        g2d.fillRect(105 + x, 122 + y, 1, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 1);
        g2d.fillRect(102 + x, 132 + y, 1, 1);
        g2d.fillRect(108 + x, 134 + y, 1, 1);
        g2d.fillRect(108 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 2, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 2, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 4);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 2);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 1);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 100 + y, 2, 1);
        g2d.fillRect(106 + x, 101 + y, 2, 1);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(107 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 1);
        g2d.fillRect(103 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 103 + y, 1, 2);
        g2d.fillRect(117 + x, 103 + y, 1, 2);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(104 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 2);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 108 + y, 2, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(105 + x, 109 + y, 1, 2);
        g2d.fillRect(107 + x, 111 + y, 2, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(108 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 114 + y, 1, 1);
        g2d.fillRect(117 + x, 115 + y, 1, 1);
        g2d.fillRect(105 + x, 116 + y, 2, 1);
        g2d.fillRect(107 + x, 117 + y, 1, 1);
        g2d.fillRect(106 + x, 118 + y, 1, 2);
        g2d.fillRect(107 + x, 119 + y, 1, 2);
        g2d.fillRect(115 + x, 119 + y, 1, 1);
        g2d.fillRect(105 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 121 + y, 1, 2);
        g2d.fillRect(116 + x, 122 + y, 1, 1);
        g2d.fillRect(105 + x, 123 + y, 1, 2);
        g2d.fillRect(115 + x, 123 + y, 1, 1);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(106 + x, 125 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 2, 1);
        g2d.fillRect(105 + x, 126 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 2);
        g2d.fillRect(106 + x, 127 + y, 1, 1);
        g2d.fillRect(117 + x, 127 + y, 1, 1);
        g2d.fillRect(106 + x, 129 + y, 1, 2);
        g2d.fillRect(117 + x, 129 + y, 1, 1);
        g2d.fillRect(104 + x, 131 + y, 2, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(103 + x, 132 + y, 1, 2);
        g2d.fillRect(105 + x, 132 + y, 3, 1);
        g2d.fillRect(104 + x, 133 + y, 1, 2);
        g2d.fillRect(108 + x, 133 + y, 1, 1);
        g2d.fillRect(116 + x, 133 + y, 1, 2);
        g2d.fillRect(117 + x, 133 + y, 1, 1);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(106 + x, 134 + y, 2, 1);
        g2d.fillRect(118 + x, 134 + y, 1, 1);
        g2d.fillRect(105 + x, 135 + y, 1, 1);
        g2d.fillRect(106 + x, 136 + y, 1, 2);
        g2d.fillRect(119 + x, 136 + y, 1, 1);
        g2d.fillRect(117 + x, 137 + y, 1, 2);
        g2d.fillRect(118 + x, 137 + y, 1, 2);
        g2d.fillRect(115 + x, 138 + y, 2, 1);
        g2d.fillRect(120 + x, 138 + y, 1, 1);
        g2d.fillRect(105 + x, 139 + y, 1, 1);
        g2d.fillRect(107 + x, 139 + y, 1, 1);
        g2d.fillRect(109 + x, 139 + y, 2, 1);
        g2d.fillRect(114 + x, 139 + y, 1, 1);
        g2d.fillRect(116 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 109 + y, 1, 1);
        g2d.fillRect(107 + x, 110 + y, 1, 1);
        g2d.fillRect(107 + x, 112 + y, 1, 1);
        g2d.fillRect(108 + x, 114 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(105 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 1);
        g2d.fillRect(106 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 124 + y, 1, 1);
        g2d.fillRect(118 + x, 128 + y, 1, 2);
        g2d.fillRect(107 + x, 130 + y, 1, 1);
        g2d.fillRect(103 + x, 134 + y, 1, 1);
        g2d.fillRect(118 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 2);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 2, 1);
        g2d.fillRect(114 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 2, 1);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 113 + y, 1, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 1);
        g2d.fillRect(113 + x, 117 + y, 2, 1);
        g2d.fillRect(105 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 120 + y, 1, 1);
        g2d.fillRect(112 + x, 122 + y, 2, 1);
        g2d.fillRect(116 + x, 123 + y, 1, 1);
        g2d.fillRect(113 + x, 125 + y, 1, 1);
        g2d.fillRect(105 + x, 127 + y, 1, 1);
        g2d.fillRect(108 + x, 127 + y, 2, 1);
        g2d.fillRect(117 + x, 128 + y, 1, 1);
        g2d.fillRect(104 + x, 129 + y, 1, 1);
        g2d.fillRect(108 + x, 129 + y, 1, 1);
        g2d.fillRect(117 + x, 130 + y, 1, 1);
        g2d.fillRect(109 + x, 131 + y, 2, 1);
        g2d.fillRect(117 + x, 132 + y, 1, 1);
        g2d.fillRect(105 + x, 133 + y, 2, 1);
        g2d.fillRect(109 + x, 134 + y, 1, 1);
        g2d.fillRect(107 + x, 135 + y, 1, 1);
        g2d.fillRect(116 + x, 135 + y, 1, 1);
        g2d.fillRect(105 + x, 136 + y, 1, 1);
        g2d.fillRect(107 + x, 137 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 2, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(114 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(104 + x, 103 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 109 + y, 1, 1);
        g2d.fillRect(106 + x, 112 + y, 1, 2);
        g2d.fillRect(107 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 117 + y, 1, 2);
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(105 + x, 119 + y, 1, 1);
        g2d.fillRect(113 + x, 123 + y, 1, 1);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(104 + x, 132 + y, 1, 1);
        g2d.fillRect(109 + x, 132 + y, 1, 1);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(104 + x, 137 + y, 2, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(106 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 3);
        g2d.fillRect(117 + x, 119 + y, 1, 2);
        g2d.fillRect(114 + x, 121 + y, 1, 3);
        g2d.fillRect(105 + x, 125 + y, 1, 1);
        g2d.fillRect(108 + x, 130 + y, 1, 3);
        g2d.fillRect(117 + x, 131 + y, 1, 1);
        g2d.fillRect(105 + x, 134 + y, 1, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 98 + y, 1, 1);
        g2d.fillRect(111 + x, 100 + y, 1, 2);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(111 + x, 121 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 130 + y, 1, 1);
        g2d.fillRect(112 + x, 132 + y, 1, 2);
        g2d.fillRect(111 + x, 137 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 92 + y, 1, 4);
        g2d.fillRect(110 + x, 100 + y, 1, 2);
        g2d.fillRect(112 + x, 104 + y, 2, 1);
        g2d.fillRect(111 + x, 110 + y, 1, 4);
        g2d.fillRect(110 + x, 118 + y, 1, 2);
        g2d.fillRect(109 + x, 123 + y, 1, 2);
        g2d.fillRect(112 + x, 126 + y, 1, 2);
        g2d.fillRect(113 + x, 132 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 91 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 2, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 5);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 96 + y, 1, 4);
        g2d.fillRect(112 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 98 + y, 1, 2);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(109 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 99 + y, 1, 3);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(109 + x, 101 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 1);
        g2d.fillRect(113 + x, 102 + y, 1, 2);
        g2d.fillRect(105 + x, 103 + y, 1, 4);
        g2d.fillRect(107 + x, 103 + y, 1, 4);
        g2d.fillRect(109 + x, 103 + y, 1, 8);
        g2d.fillRect(112 + x, 103 + y, 1, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 3);
        g2d.fillRect(110 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 2);
        g2d.fillRect(113 + x, 105 + y, 1, 3);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(110 + x, 108 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(112 + x, 111 + y, 2, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 4);
        g2d.fillRect(112 + x, 114 + y, 1, 2);
        g2d.fillRect(107 + x, 115 + y, 1, 2);
        g2d.fillRect(110 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 2, 1);
        g2d.fillRect(109 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 117 + y, 1, 3);
        g2d.fillRect(107 + x, 118 + y, 1, 1);
        g2d.fillRect(108 + x, 119 + y, 1, 2);
        g2d.fillRect(109 + x, 119 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(113 + x, 120 + y, 1, 2);
        g2d.fillRect(109 + x, 121 + y, 1, 2);
        g2d.fillRect(110 + x, 121 + y, 1, 2);
        g2d.fillRect(112 + x, 121 + y, 1, 1);
        g2d.fillRect(116 + x, 121 + y, 1, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(111 + x, 122 + y, 1, 3);
        g2d.fillRect(107 + x, 124 + y, 1, 3);
        g2d.fillRect(108 + x, 124 + y, 1, 1);
        g2d.fillRect(113 + x, 124 + y, 1, 1);
        g2d.fillRect(116 + x, 124 + y, 1, 1);
        g2d.fillRect(112 + x, 125 + y, 1, 1);
        g2d.fillRect(117 + x, 125 + y, 1, 1);
        g2d.fillRect(106 + x, 126 + y, 1, 1);
        g2d.fillRect(108 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 126 + y, 2, 1);
        g2d.fillRect(114 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 4);
        g2d.fillRect(106 + x, 128 + y, 1, 1);
        g2d.fillRect(111 + x, 128 + y, 1, 2);
        g2d.fillRect(112 + x, 128 + y, 1, 4);
        g2d.fillRect(115 + x, 128 + y, 1, 1);
        g2d.fillRect(105 + x, 130 + y, 1, 1);
        g2d.fillRect(109 + x, 130 + y, 2, 1);
        g2d.fillRect(113 + x, 130 + y, 1, 2);
        g2d.fillRect(111 + x, 131 + y, 1, 3);
        g2d.fillRect(114 + x, 131 + y, 1, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 1);
        g2d.fillRect(109 + x, 133 + y, 1, 1);
        g2d.fillRect(114 + x, 133 + y, 2, 1);
        g2d.fillRect(110 + x, 134 + y, 1, 3);
        g2d.fillRect(115 + x, 134 + y, 1, 2);
        g2d.fillRect(108 + x, 135 + y, 1, 3);
        g2d.fillRect(112 + x, 135 + y, 1, 4);
        g2d.fillRect(113 + x, 135 + y, 1, 2);
        g2d.fillRect(114 + x, 135 + y, 1, 2);
        g2d.fillRect(118 + x, 135 + y, 1, 2);
        g2d.fillRect(107 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 2);
        g2d.fillRect(105 + x, 138 + y, 3, 1);
        g2d.fillRect(110 + x, 138 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 91 + y, 1, 3);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 3, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 4);
        g2d.fillRect(108 + x, 97 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(109 + x, 102 + y, 2, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 103 + y, 1, 2);
        g2d.fillRect(112 + x, 105 + y, 1, 4);
        g2d.fillRect(106 + x, 106 + y, 1, 2);
        g2d.fillRect(107 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 3);
        g2d.fillRect(108 + x, 109 + y, 1, 2);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 112 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 4);
        g2d.fillRect(108 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 2, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(108 + x, 125 + y, 2, 1);
        g2d.fillRect(110 + x, 126 + y, 1, 4);
        g2d.fillRect(111 + x, 126 + y, 1, 2);
        g2d.fillRect(117 + x, 126 + y, 1, 1);
        g2d.fillRect(107 + x, 127 + y, 1, 1);
        g2d.fillRect(109 + x, 128 + y, 1, 2);
        g2d.fillRect(105 + x, 129 + y, 1, 1);
        g2d.fillRect(115 + x, 129 + y, 1, 1);
        g2d.fillRect(115 + x, 131 + y, 1, 1);
        g2d.fillRect(113 + x, 134 + y, 2, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 4);
        g2d.fillRect(115 + x, 136 + y, 1, 2);
        g2d.fillRect(110 + x, 137 + y, 1, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 2);
        g2d.fillRect(108 + x, 138 + y, 1, 1);
        g2d.fillRect(111 + x, 139 + y, 1, 1);
        g2d.fillRect(113 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 1, 4);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 97 + y, 1, 2);
        g2d.fillRect(108 + x, 98 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 2, 1);
        g2d.fillRect(113 + x, 100 + y, 1, 2);
        g2d.fillRect(112 + x, 102 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 2);
        g2d.fillRect(109 + x, 111 + y, 1, 2);
        g2d.fillRect(110 + x, 112 + y, 1, 4);
        g2d.fillRect(109 + x, 115 + y, 1, 2);
        g2d.fillRect(108 + x, 116 + y, 1, 1);
        g2d.fillRect(108 + x, 118 + y, 2, 1);
        g2d.fillRect(113 + x, 118 + y, 1, 2);
        g2d.fillRect(112 + x, 120 + y, 1, 1);
        g2d.fillRect(107 + x, 121 + y, 2, 1);
        g2d.fillRect(107 + x, 123 + y, 2, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 125 + y, 1, 1);
        g2d.fillRect(113 + x, 126 + y, 1, 4);
        g2d.fillRect(114 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 127 + y, 1, 1);
        g2d.fillRect(114 + x, 129 + y, 1, 2);
        g2d.fillRect(115 + x, 130 + y, 1, 1);
        g2d.fillRect(110 + x, 132 + y, 1, 2);
        g2d.fillRect(114 + x, 132 + y, 2, 1);
        g2d.fillRect(111 + x, 134 + y, 1, 2);
        g2d.fillRect(113 + x, 137 + y, 1, 2);
        g2d.fillRect(112 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 1);
        g2d.fillRect(110 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(110 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 120 + y, 1, 1);
        g2d.fillRect(110 + x, 125 + y, 1, 1);
        g2d.fillRect(114 + x, 128 + y, 1, 1);
        g2d.fillRect(112 + x, 134 + y, 1, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
    }





    public void paint7B2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 92 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 2, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 3);
        g2d.fillRect(121 + x, 97 + y, 1, 2);
        g2d.fillRect(105 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(120 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 2, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 3);
        g2d.fillRect(121 + x, 103 + y, 1, 2);
        g2d.fillRect(101 + x, 104 + y, 2, 1);
        g2d.fillRect(117 + x, 106 + y, 2, 1);
        g2d.fillRect(120 + x, 106 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 1);
        g2d.fillRect(118 + x, 108 + y, 1, 3);
        g2d.fillRect(119 + x, 109 + y, 2, 1);
        g2d.fillRect(116 + x, 111 + y, 2, 1);
        g2d.fillRect(119 + x, 112 + y, 1, 1);
        g2d.fillRect(103 + x, 114 + y, 1, 2);
        g2d.fillRect(105 + x, 116 + y, 1, 1);
        g2d.fillRect(116 + x, 117 + y, 2, 1);
        g2d.fillRect(118 + x, 119 + y, 1, 2);
        g2d.fillRect(104 + x, 121 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 2, 1);
        g2d.fillRect(118 + x, 130 + y, 1, 1);
        g2d.fillRect(106 + x, 131 + y, 2, 1);
        g2d.fillRect(102 + x, 133 + y, 1, 3);
        g2d.fillRect(119 + x, 134 + y, 2, 1);
        g2d.fillRect(103 + x, 136 + y, 2, 1);
        g2d.fillRect(120 + x, 136 + y, 1, 2);
        g2d.fillRect(119 + x, 137 + y, 1, 1);
        g2d.fillRect(104 + x, 138 + y, 1, 2);
        g2d.fillRect(106 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 2);
        g2d.fillRect(116 + x, 92 + y, 2, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 2, 1);
        g2d.fillRect(120 + x, 96 + y, 2, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 3);
        g2d.fillRect(120 + x, 99 + y, 1, 1);
        g2d.fillRect(101 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(120 + x, 102 + y, 1, 2);
        g2d.fillRect(121 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 2, 1);
        g2d.fillRect(120 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 108 + y, 1, 1);
        g2d.fillRect(103 + x, 110 + y, 1, 2);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(119 + x, 110 + y, 2, 1);
        g2d.fillRect(119 + x, 113 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 2, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(118 + x, 115 + y, 1, 2);
        g2d.fillRect(119 + x, 116 + y, 1, 1);
        g2d.fillRect(105 + x, 117 + y, 1, 3);
        g2d.fillRect(116 + x, 119 + y, 1, 1);
        g2d.fillRect(104 + x, 122 + y, 1, 3);
        g2d.fillRect(115 + x, 124 + y, 2, 1);
        g2d.fillRect(104 + x, 128 + y, 2, 1);
        g2d.fillRect(107 + x, 128 + y, 1, 2);
        g2d.fillRect(108 + x, 128 + y, 1, 1);
        g2d.fillRect(104 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 131 + y, 1, 3);
        g2d.fillRect(107 + x, 133 + y, 1, 1);
        g2d.fillRect(121 + x, 134 + y, 1, 1);
        g2d.fillRect(103 + x, 135 + y, 2, 1);
        g2d.fillRect(119 + x, 135 + y, 2, 1);
        g2d.fillRect(119 + x, 138 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 2);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 1);
        g2d.fillRect(104 + x, 115 + y, 1, 1);
        g2d.fillRect(104 + x, 117 + y, 1, 1);
        g2d.fillRect(119 + x, 117 + y, 1, 1);
        g2d.fillRect(103 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 120 + y, 1, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 1);
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 1);
        g2d.fillRect(102 + x, 132 + y, 1, 1);
        g2d.fillRect(108 + x, 134 + y, 1, 1);
        g2d.fillRect(108 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 91 + y, 2, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 2, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 4);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 1, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 2);
        g2d.fillRect(103 + x, 98 + y, 1, 2);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 1, 1);
        g2d.fillRect(121 + x, 99 + y, 1, 3);
        g2d.fillRect(104 + x, 100 + y, 1, 2);
        g2d.fillRect(116 + x, 100 + y, 2, 1);
        g2d.fillRect(106 + x, 101 + y, 2, 1);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(107 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 2);
        g2d.fillRect(101 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 103 + y, 1, 2);
        g2d.fillRect(117 + x, 103 + y, 1, 2);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 2);
        g2d.fillRect(103 + x, 107 + y, 1, 2);
        g2d.fillRect(104 + x, 107 + y, 1, 2);
        g2d.fillRect(105 + x, 108 + y, 2, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 1);
        g2d.fillRect(102 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 2);
        g2d.fillRect(104 + x, 111 + y, 2, 1);
        g2d.fillRect(119 + x, 111 + y, 1, 1);
        g2d.fillRect(105 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(117 + x, 112 + y, 1, 2);
        g2d.fillRect(118 + x, 112 + y, 1, 2);
        g2d.fillRect(106 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(119 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 115 + y, 1, 1);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(103 + x, 116 + y, 2, 1);
        g2d.fillRect(107 + x, 117 + y, 1, 1);
        g2d.fillRect(104 + x, 118 + y, 1, 2);
        g2d.fillRect(116 + x, 118 + y, 2, 1);
        g2d.fillRect(106 + x, 119 + y, 2, 1);
        g2d.fillRect(115 + x, 119 + y, 1, 1);
        g2d.fillRect(105 + x, 120 + y, 1, 1);
        g2d.fillRect(107 + x, 120 + y, 1, 1);
        g2d.fillRect(116 + x, 120 + y, 1, 2);
        g2d.fillRect(103 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 121 + y, 1, 1);
        g2d.fillRect(119 + x, 121 + y, 1, 2);
        g2d.fillRect(106 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 122 + y, 1, 1);
        g2d.fillRect(103 + x, 123 + y, 1, 2);
        g2d.fillRect(115 + x, 123 + y, 3, 1);
        g2d.fillRect(105 + x, 124 + y, 2, 1);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(117 + x, 124 + y, 1, 1);
        g2d.fillRect(104 + x, 125 + y, 1, 2);
        g2d.fillRect(106 + x, 125 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 2, 1);
        g2d.fillRect(118 + x, 125 + y, 1, 3);
        g2d.fillRect(105 + x, 126 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 1);
        g2d.fillRect(106 + x, 127 + y, 1, 1);
        g2d.fillRect(117 + x, 127 + y, 1, 1);
        g2d.fillRect(106 + x, 129 + y, 1, 2);
        g2d.fillRect(117 + x, 129 + y, 1, 1);
        g2d.fillRect(104 + x, 131 + y, 2, 1);
        g2d.fillRect(116 + x, 131 + y, 1, 1);
        g2d.fillRect(103 + x, 132 + y, 1, 2);
        g2d.fillRect(105 + x, 132 + y, 3, 1);
        g2d.fillRect(104 + x, 133 + y, 1, 2);
        g2d.fillRect(108 + x, 133 + y, 1, 1);
        g2d.fillRect(116 + x, 133 + y, 1, 2);
        g2d.fillRect(117 + x, 133 + y, 1, 1);
        g2d.fillRect(119 + x, 133 + y, 1, 1);
        g2d.fillRect(106 + x, 134 + y, 2, 1);
        g2d.fillRect(118 + x, 134 + y, 1, 1);
        g2d.fillRect(105 + x, 135 + y, 1, 1);
        g2d.fillRect(106 + x, 136 + y, 1, 2);
        g2d.fillRect(119 + x, 136 + y, 1, 1);
        g2d.fillRect(117 + x, 137 + y, 1, 2);
        g2d.fillRect(118 + x, 137 + y, 1, 2);
        g2d.fillRect(115 + x, 138 + y, 2, 1);
        g2d.fillRect(120 + x, 138 + y, 1, 1);
        g2d.fillRect(105 + x, 139 + y, 1, 1);
        g2d.fillRect(107 + x, 139 + y, 1, 1);
        g2d.fillRect(109 + x, 139 + y, 2, 1);
        g2d.fillRect(114 + x, 139 + y, 1, 1);
        g2d.fillRect(116 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 2);
        g2d.fillRect(120 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(104 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(104 + x, 110 + y, 1, 1);
        g2d.fillRect(104 + x, 112 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 1, 2);
        g2d.fillRect(118 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 1);
        g2d.fillRect(103 + x, 117 + y, 1, 1);
        g2d.fillRect(119 + x, 118 + y, 1, 1);
        g2d.fillRect(104 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(119 + x, 124 + y, 1, 1);
        g2d.fillRect(104 + x, 127 + y, 1, 1);
        g2d.fillRect(118 + x, 128 + y, 1, 2);
        g2d.fillRect(107 + x, 130 + y, 1, 1);
        g2d.fillRect(103 + x, 134 + y, 1, 1);
        g2d.fillRect(118 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 2);
        g2d.fillRect(104 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 2, 1);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(114 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 2);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 109 + y, 1, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 1);
        g2d.fillRect(114 + x, 113 + y, 2, 1);
        g2d.fillRect(106 + x, 114 + y, 1, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 1);
        g2d.fillRect(106 + x, 116 + y, 1, 1);
        g2d.fillRect(113 + x, 117 + y, 2, 1);
        g2d.fillRect(103 + x, 118 + y, 1, 1);
        g2d.fillRect(106 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 120 + y, 1, 1);
        g2d.fillRect(105 + x, 121 + y, 1, 1);
        g2d.fillRect(112 + x, 122 + y, 2, 1);
        g2d.fillRect(105 + x, 123 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 1);
        g2d.fillRect(113 + x, 125 + y, 1, 1);
        g2d.fillRect(105 + x, 127 + y, 1, 1);
        g2d.fillRect(108 + x, 127 + y, 2, 1);
        g2d.fillRect(117 + x, 128 + y, 1, 1);
        g2d.fillRect(104 + x, 129 + y, 1, 1);
        g2d.fillRect(108 + x, 129 + y, 1, 1);
        g2d.fillRect(117 + x, 130 + y, 1, 1);
        g2d.fillRect(109 + x, 131 + y, 2, 1);
        g2d.fillRect(117 + x, 132 + y, 1, 1);
        g2d.fillRect(105 + x, 133 + y, 2, 1);
        g2d.fillRect(109 + x, 134 + y, 1, 1);
        g2d.fillRect(107 + x, 135 + y, 1, 1);
        g2d.fillRect(116 + x, 135 + y, 1, 1);
        g2d.fillRect(105 + x, 136 + y, 1, 1);
        g2d.fillRect(107 + x, 137 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 2);
        g2d.fillRect(120 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 2, 1);
        g2d.fillRect(114 + x, 100 + y, 1, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 1);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 2, 1);
        g2d.fillRect(120 + x, 107 + y, 1, 1);
        g2d.fillRect(119 + x, 108 + y, 1, 1);
        g2d.fillRect(104 + x, 109 + y, 1, 1);
        g2d.fillRect(103 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 1, 1);
        g2d.fillRect(104 + x, 114 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 1);
        g2d.fillRect(118 + x, 117 + y, 1, 2);
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(103 + x, 119 + y, 1, 1);
        g2d.fillRect(117 + x, 119 + y, 1, 1);
        g2d.fillRect(113 + x, 123 + y, 1, 1);
        g2d.fillRect(119 + x, 123 + y, 1, 1);
        g2d.fillRect(104 + x, 132 + y, 1, 1);
        g2d.fillRect(109 + x, 132 + y, 1, 1);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(104 + x, 137 + y, 2, 1);
        g2d.fillRect(117 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 2);
        g2d.fillRect(106 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 116 + y, 1, 3);
        g2d.fillRect(106 + x, 117 + y, 1, 1);
        g2d.fillRect(119 + x, 119 + y, 1, 2);
        g2d.fillRect(106 + x, 120 + y, 1, 1);
        g2d.fillRect(114 + x, 121 + y, 1, 3);
        g2d.fillRect(105 + x, 122 + y, 1, 1);
        g2d.fillRect(105 + x, 125 + y, 1, 1);
        g2d.fillRect(108 + x, 130 + y, 1, 3);
        g2d.fillRect(117 + x, 131 + y, 1, 1);
        g2d.fillRect(105 + x, 134 + y, 1, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 98 + y, 1, 1);
        g2d.fillRect(111 + x, 100 + y, 1, 2);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(111 + x, 121 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 130 + y, 1, 1);
        g2d.fillRect(112 + x, 132 + y, 1, 2);
        g2d.fillRect(111 + x, 137 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 92 + y, 1, 4);
        g2d.fillRect(110 + x, 100 + y, 1, 2);
        g2d.fillRect(112 + x, 104 + y, 2, 1);
        g2d.fillRect(111 + x, 110 + y, 1, 4);
        g2d.fillRect(110 + x, 118 + y, 1, 2);
        g2d.fillRect(109 + x, 123 + y, 1, 2);
        g2d.fillRect(112 + x, 126 + y, 1, 2);
        g2d.fillRect(113 + x, 132 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 91 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(109 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 2, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 5);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 96 + y, 1, 4);
        g2d.fillRect(112 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 98 + y, 1, 2);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(109 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 99 + y, 1, 3);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 2);
        g2d.fillRect(109 + x, 101 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 1);
        g2d.fillRect(113 + x, 102 + y, 1, 2);
        g2d.fillRect(104 + x, 103 + y, 2, 1);
        g2d.fillRect(107 + x, 103 + y, 1, 4);
        g2d.fillRect(109 + x, 103 + y, 1, 8);
        g2d.fillRect(112 + x, 103 + y, 1, 1);
        g2d.fillRect(105 + x, 104 + y, 1, 1);
        g2d.fillRect(108 + x, 104 + y, 1, 3);
        g2d.fillRect(110 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 2);
        g2d.fillRect(106 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 2);
        g2d.fillRect(113 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 106 + y, 1, 2);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(110 + x, 108 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 2, 1);
        g2d.fillRect(106 + x, 109 + y, 1, 3);
        g2d.fillRect(107 + x, 109 + y, 1, 2);
        g2d.fillRect(105 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 111 + y, 2, 1);
        g2d.fillRect(118 + x, 111 + y, 1, 1);
        g2d.fillRect(107 + x, 112 + y, 1, 5);
        g2d.fillRect(108 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(108 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 4);
        g2d.fillRect(112 + x, 114 + y, 1, 2);
        g2d.fillRect(110 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 2, 1);
        g2d.fillRect(109 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 117 + y, 1, 3);
        g2d.fillRect(107 + x, 118 + y, 1, 1);
        g2d.fillRect(108 + x, 119 + y, 1, 2);
        g2d.fillRect(109 + x, 119 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(113 + x, 120 + y, 1, 2);
        g2d.fillRect(106 + x, 121 + y, 1, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 2);
        g2d.fillRect(110 + x, 121 + y, 1, 2);
        g2d.fillRect(112 + x, 121 + y, 1, 1);
        g2d.fillRect(118 + x, 121 + y, 1, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(111 + x, 122 + y, 1, 3);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(107 + x, 124 + y, 1, 3);
        g2d.fillRect(108 + x, 124 + y, 1, 1);
        g2d.fillRect(113 + x, 124 + y, 1, 1);
        g2d.fillRect(118 + x, 124 + y, 1, 1);
        g2d.fillRect(112 + x, 125 + y, 1, 1);
        g2d.fillRect(117 + x, 125 + y, 1, 1);
        g2d.fillRect(106 + x, 126 + y, 1, 1);
        g2d.fillRect(108 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 126 + y, 2, 1);
        g2d.fillRect(114 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 4);
        g2d.fillRect(106 + x, 128 + y, 1, 1);
        g2d.fillRect(111 + x, 128 + y, 1, 2);
        g2d.fillRect(112 + x, 128 + y, 1, 4);
        g2d.fillRect(115 + x, 128 + y, 1, 1);
        g2d.fillRect(105 + x, 130 + y, 1, 1);
        g2d.fillRect(109 + x, 130 + y, 2, 1);
        g2d.fillRect(113 + x, 130 + y, 1, 2);
        g2d.fillRect(111 + x, 131 + y, 1, 3);
        g2d.fillRect(114 + x, 131 + y, 1, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 1);
        g2d.fillRect(109 + x, 133 + y, 1, 1);
        g2d.fillRect(114 + x, 133 + y, 2, 1);
        g2d.fillRect(110 + x, 134 + y, 1, 3);
        g2d.fillRect(115 + x, 134 + y, 1, 2);
        g2d.fillRect(108 + x, 135 + y, 1, 3);
        g2d.fillRect(112 + x, 135 + y, 1, 4);
        g2d.fillRect(113 + x, 135 + y, 1, 2);
        g2d.fillRect(114 + x, 135 + y, 1, 2);
        g2d.fillRect(118 + x, 135 + y, 1, 2);
        g2d.fillRect(107 + x, 136 + y, 1, 1);
        g2d.fillRect(116 + x, 136 + y, 1, 2);
        g2d.fillRect(105 + x, 138 + y, 3, 1);
        g2d.fillRect(110 + x, 138 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 91 + y, 1, 3);
        g2d.fillRect(113 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 3, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 4);
        g2d.fillRect(108 + x, 97 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(109 + x, 102 + y, 2, 1);
        g2d.fillRect(106 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 103 + y, 1, 2);
        g2d.fillRect(112 + x, 105 + y, 1, 4);
        g2d.fillRect(106 + x, 106 + y, 1, 2);
        g2d.fillRect(107 + x, 107 + y, 1, 2);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 3);
        g2d.fillRect(108 + x, 109 + y, 1, 3);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(107 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(106 + x, 112 + y, 1, 1);
        g2d.fillRect(112 + x, 112 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 4);
        g2d.fillRect(114 + x, 114 + y, 1, 2);
        g2d.fillRect(108 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 2, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(108 + x, 125 + y, 2, 1);
        g2d.fillRect(110 + x, 126 + y, 1, 4);
        g2d.fillRect(111 + x, 126 + y, 1, 2);
        g2d.fillRect(117 + x, 126 + y, 1, 1);
        g2d.fillRect(107 + x, 127 + y, 1, 1);
        g2d.fillRect(109 + x, 128 + y, 1, 2);
        g2d.fillRect(105 + x, 129 + y, 1, 1);
        g2d.fillRect(115 + x, 129 + y, 1, 1);
        g2d.fillRect(115 + x, 131 + y, 1, 1);
        g2d.fillRect(113 + x, 134 + y, 2, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 4);
        g2d.fillRect(115 + x, 136 + y, 1, 2);
        g2d.fillRect(110 + x, 137 + y, 1, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 2);
        g2d.fillRect(108 + x, 138 + y, 1, 1);
        g2d.fillRect(111 + x, 139 + y, 1, 1);
        g2d.fillRect(113 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 1, 4);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 97 + y, 1, 2);
        g2d.fillRect(108 + x, 98 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 2, 1);
        g2d.fillRect(113 + x, 100 + y, 1, 2);
        g2d.fillRect(112 + x, 102 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 105 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 2);
        g2d.fillRect(109 + x, 111 + y, 1, 2);
        g2d.fillRect(110 + x, 112 + y, 1, 4);
        g2d.fillRect(108 + x, 113 + y, 1, 1);
        g2d.fillRect(109 + x, 115 + y, 1, 2);
        g2d.fillRect(108 + x, 116 + y, 1, 1);
        g2d.fillRect(108 + x, 118 + y, 2, 1);
        g2d.fillRect(113 + x, 118 + y, 1, 2);
        g2d.fillRect(112 + x, 120 + y, 1, 1);
        g2d.fillRect(107 + x, 121 + y, 2, 1);
        g2d.fillRect(107 + x, 123 + y, 2, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 125 + y, 1, 1);
        g2d.fillRect(113 + x, 126 + y, 1, 4);
        g2d.fillRect(114 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 127 + y, 1, 1);
        g2d.fillRect(114 + x, 129 + y, 1, 2);
        g2d.fillRect(115 + x, 130 + y, 1, 1);
        g2d.fillRect(110 + x, 132 + y, 1, 2);
        g2d.fillRect(114 + x, 132 + y, 2, 1);
        g2d.fillRect(111 + x, 134 + y, 1, 2);
        g2d.fillRect(113 + x, 137 + y, 1, 2);
        g2d.fillRect(112 + x, 139 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 1);
        g2d.fillRect(110 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(110 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 120 + y, 1, 1);
        g2d.fillRect(110 + x, 125 + y, 1, 1);
        g2d.fillRect(114 + x, 128 + y, 1, 1);
        g2d.fillRect(112 + x, 134 + y, 1, 1);
        g2d.fillRect(111 + x, 136 + y, 1, 1);
    }

    public void paint7BOT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(116 + x, 117 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(115 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 128 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 1);
        g2d.fillRect(115 + x, 124 + y, 2, 1);
        g2d.fillRect(107 + x, 128 + y, 1, 2);
        g2d.fillRect(108 + x, 128 + y, 1, 1);
        g2d.fillRect(104 + x, 129 + y, 1, 1);
        g2d.fillRect(121 + x, 129 + y, 1, 1);
        g2d.fillRect(103 + x, 130 + y, 1, 3);
        g2d.fillRect(105 + x, 131 + y, 1, 2);
        g2d.fillRect(106 + x, 131 + y, 1, 2);
        g2d.fillRect(120 + x, 131 + y, 1, 4);
        g2d.fillRect(102 + x, 132 + y, 1, 6);
        g2d.fillRect(122 + x, 132 + y, 1, 1);
        g2d.fillRect(107 + x, 133 + y, 2, 1);
        g2d.fillRect(101 + x, 134 + y, 1, 1);
        g2d.fillRect(103 + x, 134 + y, 1, 2);
        g2d.fillRect(104 + x, 134 + y, 1, 1);
        g2d.fillRect(119 + x, 134 + y, 1, 1);
        g2d.fillRect(121 + x, 134 + y, 1, 8);
        g2d.fillRect(100 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 1, 5);
        g2d.fillRect(117 + x, 135 + y, 1, 3);
        g2d.fillRect(113 + x, 136 + y, 1, 2);
        g2d.fillRect(120 + x, 136 + y, 1, 1);
        g2d.fillRect(123 + x, 136 + y, 1, 5);
        g2d.fillRect(98 + x, 137 + y, 1, 3);
        g2d.fillRect(99 + x, 137 + y, 1, 1);
        g2d.fillRect(101 + x, 137 + y, 1, 3);
        g2d.fillRect(122 + x, 137 + y, 1, 8);
        g2d.fillRect(97 + x, 138 + y, 1, 2);
        g2d.fillRect(109 + x, 138 + y, 1, 2);
        g2d.fillRect(116 + x, 138 + y, 1, 1);
        g2d.fillRect(95 + x, 140 + y, 1, 2);
        g2d.fillRect(96 + x, 140 + y, 1, 1);
        g2d.fillRect(100 + x, 140 + y, 1, 2);
        g2d.fillRect(103 + x, 140 + y, 1, 2);
        g2d.fillRect(116 + x, 140 + y, 1, 10);
        g2d.fillRect(124 + x, 140 + y, 1, 1);
        g2d.fillRect(112 + x, 141 + y, 1, 5);
        g2d.fillRect(125 + x, 141 + y, 1, 2);
        g2d.fillRect(94 + x, 142 + y, 1, 1);
        g2d.fillRect(98 + x, 142 + y, 2, 1);
        g2d.fillRect(119 + x, 142 + y, 1, 11);
        g2d.fillRect(93 + x, 143 + y, 1, 1);
        g2d.fillRect(105 + x, 143 + y, 1, 4);
        g2d.fillRect(115 + x, 143 + y, 1, 6);
        g2d.fillRect(127 + x, 143 + y, 1, 1);
        g2d.fillRect(91 + x, 144 + y, 1, 1);
        g2d.fillRect(99 + x, 144 + y, 1, 4);
        g2d.fillRect(109 + x, 144 + y, 1, 2);
        g2d.fillRect(111 + x, 144 + y, 1, 8);
        g2d.fillRect(123 + x, 144 + y, 1, 2);
        g2d.fillRect(95 + x, 145 + y, 1, 1);
        g2d.fillRect(97 + x, 145 + y, 2, 1);
        g2d.fillRect(103 + x, 145 + y, 1, 7);
        g2d.fillRect(106 + x, 145 + y, 1, 3);
        g2d.fillRect(110 + x, 145 + y, 1, 4);
        g2d.fillRect(124 + x, 145 + y, 1, 2);
        g2d.fillRect(128 + x, 145 + y, 1, 1);
        g2d.fillRect(98 + x, 146 + y, 1, 2);
        g2d.fillRect(104 + x, 146 + y, 1, 1);
        g2d.fillRect(108 + x, 146 + y, 1, 9);
        g2d.fillRect(126 + x, 146 + y, 1, 2);
        g2d.fillRect(88 + x, 147 + y, 2, 1);
        g2d.fillRect(91 + x, 147 + y, 1, 3);
        g2d.fillRect(92 + x, 147 + y, 1, 1);
        g2d.fillRect(94 + x, 147 + y, 1, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 1);
        g2d.fillRect(102 + x, 147 + y, 1, 5);
        g2d.fillRect(118 + x, 147 + y, 1, 4);
        g2d.fillRect(127 + x, 147 + y, 1, 1);
        g2d.fillRect(129 + x, 147 + y, 1, 4);
        g2d.fillRect(130 + x, 147 + y, 1, 1);
        g2d.fillRect(93 + x, 148 + y, 1, 2);
        g2d.fillRect(105 + x, 148 + y, 1, 1);
        g2d.fillRect(120 + x, 148 + y, 1, 2);
        g2d.fillRect(128 + x, 148 + y, 1, 2);
        g2d.fillRect(90 + x, 149 + y, 1, 1);
        g2d.fillRect(96 + x, 149 + y, 1, 2);
        g2d.fillRect(107 + x, 149 + y, 1, 5);
        g2d.fillRect(112 + x, 149 + y, 1, 3);
        g2d.fillRect(89 + x, 150 + y, 1, 1);
        g2d.fillRect(92 + x, 150 + y, 1, 1);
        g2d.fillRect(97 + x, 150 + y, 1, 1);
        g2d.fillRect(101 + x, 150 + y, 1, 3);
        g2d.fillRect(113 + x, 150 + y, 1, 3);
        g2d.fillRect(123 + x, 150 + y, 1, 2);
        g2d.fillRect(125 + x, 150 + y, 1, 1);
        g2d.fillRect(130 + x, 150 + y, 1, 1);
        g2d.fillRect(91 + x, 151 + y, 1, 2);
        g2d.fillRect(93 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 151 + y, 1, 1);
        g2d.fillRect(120 + x, 151 + y, 1, 3);
        g2d.fillRect(124 + x, 151 + y, 1, 6);
        g2d.fillRect(127 + x, 151 + y, 2, 1);
        g2d.fillRect(90 + x, 152 + y, 1, 2);
        g2d.fillRect(92 + x, 152 + y, 1, 2);
        g2d.fillRect(95 + x, 152 + y, 2, 1);
        g2d.fillRect(109 + x, 152 + y, 1, 1);
        g2d.fillRect(114 + x, 152 + y, 1, 6);
        g2d.fillRect(117 + x, 152 + y, 1, 2);
        g2d.fillRect(129 + x, 152 + y, 1, 1);
        g2d.fillRect(87 + x, 153 + y, 1, 1);
        g2d.fillRect(93 + x, 153 + y, 1, 5);
        g2d.fillRect(116 + x, 153 + y, 1, 1);
        g2d.fillRect(118 + x, 153 + y, 1, 3);
        g2d.fillRect(121 + x, 153 + y, 1, 4);
        g2d.fillRect(122 + x, 153 + y, 1, 4);
        g2d.fillRect(123 + x, 153 + y, 1, 2);
        g2d.fillRect(94 + x, 154 + y, 1, 2);
        g2d.fillRect(97 + x, 154 + y, 1, 5);
        g2d.fillRect(99 + x, 154 + y, 1, 2);
        g2d.fillRect(104 + x, 154 + y, 1, 3);
        g2d.fillRect(109 + x, 154 + y, 1, 2);
        g2d.fillRect(115 + x, 154 + y, 1, 1);
        g2d.fillRect(119 + x, 154 + y, 1, 2);
        g2d.fillRect(128 + x, 154 + y, 1, 1);
        g2d.fillRect(92 + x, 155 + y, 1, 1);
        g2d.fillRect(102 + x, 155 + y, 1, 5);
        g2d.fillRect(103 + x, 155 + y, 1, 2);
        g2d.fillRect(125 + x, 155 + y, 1, 2);
        g2d.fillRect(89 + x, 156 + y, 1, 1);
        g2d.fillRect(98 + x, 156 + y, 1, 1);
        g2d.fillRect(108 + x, 156 + y, 1, 3);
        g2d.fillRect(123 + x, 156 + y, 1, 2);
        g2d.fillRect(129 + x, 156 + y, 1, 2);
        g2d.fillRect(91 + x, 157 + y, 1, 6);
        g2d.fillRect(92 + x, 157 + y, 1, 2);
        g2d.fillRect(94 + x, 157 + y, 1, 1);
        g2d.fillRect(96 + x, 157 + y, 1, 2);
        g2d.fillRect(101 + x, 157 + y, 1, 1);
        g2d.fillRect(110 + x, 157 + y, 2, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 2);
        g2d.fillRect(116 + x, 157 + y, 1, 1);
        g2d.fillRect(89 + x, 158 + y, 1, 1);
        g2d.fillRect(98 + x, 158 + y, 1, 2);
        g2d.fillRect(99 + x, 158 + y, 2, 1);
        g2d.fillRect(111 + x, 158 + y, 1, 2);
        g2d.fillRect(120 + x, 158 + y, 1, 2);
        g2d.fillRect(121 + x, 158 + y, 1, 1);
        g2d.fillRect(125 + x, 158 + y, 2, 1);
        g2d.fillRect(130 + x, 158 + y, 1, 2);
        g2d.fillRect(90 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 159 + y, 1, 1);
        g2d.fillRect(105 + x, 159 + y, 1, 1);
        g2d.fillRect(117 + x, 159 + y, 1, 2);
        g2d.fillRect(126 + x, 159 + y, 2, 1);
        g2d.fillRect(93 + x, 160 + y, 2, 1);
        g2d.fillRect(103 + x, 160 + y, 1, 2);
        g2d.fillRect(104 + x, 160 + y, 1, 4);
        g2d.fillRect(109 + x, 160 + y, 1, 3);
        g2d.fillRect(110 + x, 160 + y, 1, 1);
        g2d.fillRect(121 + x, 160 + y, 1, 4);
        g2d.fillRect(124 + x, 160 + y, 1, 1);
        g2d.fillRect(128 + x, 160 + y, 1, 2);
        g2d.fillRect(88 + x, 161 + y, 1, 1);
        g2d.fillRect(92 + x, 161 + y, 1, 1);
        g2d.fillRect(96 + x, 161 + y, 2, 1);
        g2d.fillRect(119 + x, 161 + y, 1, 3);
        g2d.fillRect(105 + x, 162 + y, 1, 2);
        g2d.fillRect(106 + x, 162 + y, 1, 1);
        g2d.fillRect(123 + x, 162 + y, 1, 1);
        g2d.fillRect(129 + x, 162 + y, 2, 1);
        g2d.fillRect(93 + x, 163 + y, 2, 1);
        g2d.fillRect(120 + x, 163 + y, 1, 1);
        g2d.fillRect(130 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7, ImageUtilities.NEG_GREY_6));
        g2d.fillRect(106 + x, 130 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(115 + x, 120 + y, 1, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 1);
        g2d.fillRect(120 + x, 128 + y, 1, 2);
        g2d.fillRect(104 + x, 130 + y, 2, 1);
        g2d.fillRect(119 + x, 130 + y, 1, 1);
        g2d.fillRect(121 + x, 130 + y, 1, 3);
        g2d.fillRect(104 + x, 133 + y, 1, 1);
        g2d.fillRect(122 + x, 133 + y, 1, 2);
        g2d.fillRect(119 + x, 135 + y, 1, 4);
        g2d.fillRect(120 + x, 135 + y, 1, 1);
        g2d.fillRect(103 + x, 136 + y, 1, 1);
        g2d.fillRect(120 + x, 137 + y, 1, 1);
        g2d.fillRect(113 + x, 138 + y, 1, 2);
        g2d.fillRect(106 + x, 139 + y, 1, 3);
        g2d.fillRect(109 + x, 140 + y, 1, 4);
        g2d.fillRect(115 + x, 140 + y, 1, 3);
        g2d.fillRect(101 + x, 141 + y, 1, 1);
        g2d.fillRect(105 + x, 141 + y, 1, 2);
        g2d.fillRect(100 + x, 142 + y, 1, 1);
        g2d.fillRect(124 + x, 142 + y, 1, 2);
        g2d.fillRect(98 + x, 143 + y, 1, 2);
        g2d.fillRect(99 + x, 143 + y, 1, 1);
        g2d.fillRect(97 + x, 144 + y, 1, 1);
        g2d.fillRect(103 + x, 144 + y, 1, 1);
        g2d.fillRect(127 + x, 144 + y, 2, 1);
        g2d.fillRect(94 + x, 146 + y, 2, 1);
        g2d.fillRect(93 + x, 147 + y, 1, 1);
        g2d.fillRect(95 + x, 147 + y, 1, 1);
        g2d.fillRect(104 + x, 147 + y, 1, 2);
        g2d.fillRect(105 + x, 147 + y, 1, 1);
        g2d.fillRect(123 + x, 147 + y, 2, 1);
        g2d.fillRect(98 + x, 148 + y, 1, 1);
        g2d.fillRect(113 + x, 148 + y, 1, 1);
        g2d.fillRect(125 + x, 148 + y, 1, 2);
        g2d.fillRect(97 + x, 149 + y, 1, 1);
        g2d.fillRect(124 + x, 149 + y, 1, 1);
        g2d.fillRect(93 + x, 150 + y, 1, 1);
        g2d.fillRect(115 + x, 150 + y, 1, 2);
        g2d.fillRect(120 + x, 150 + y, 1, 1);
        g2d.fillRect(126 + x, 150 + y, 1, 1);
        g2d.fillRect(92 + x, 151 + y, 1, 1);
        g2d.fillRect(114 + x, 151 + y, 1, 1);
        g2d.fillRect(116 + x, 151 + y, 1, 1);
        g2d.fillRect(89 + x, 152 + y, 1, 2);
        g2d.fillRect(104 + x, 152 + y, 1, 2);
        g2d.fillRect(123 + x, 152 + y, 1, 1);
        g2d.fillRect(127 + x, 152 + y, 1, 1);
        g2d.fillRect(88 + x, 153 + y, 1, 1);
        g2d.fillRect(94 + x, 153 + y, 1, 1);
        g2d.fillRect(92 + x, 154 + y, 1, 1);
        g2d.fillRect(116 + x, 154 + y, 2, 1);
        g2d.fillRect(98 + x, 155 + y, 1, 1);
        g2d.fillRect(101 + x, 155 + y, 1, 1);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(105 + x, 156 + y, 1, 1);
        g2d.fillRect(95 + x, 157 + y, 1, 1);
        g2d.fillRect(103 + x, 157 + y, 2, 1);
        g2d.fillRect(125 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 1, 2);
        g2d.fillRect(119 + x, 158 + y, 1, 1);
        g2d.fillRect(95 + x, 159 + y, 1, 1);
        g2d.fillRect(103 + x, 159 + y, 1, 1);
        g2d.fillRect(122 + x, 160 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6, ImageUtilities.NEG_GREY_5));
        g2d.fillRect(119 + x, 129 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(107 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(107 + x, 119 + y, 1, 2);
        g2d.fillRect(115 + x, 119 + y, 1, 1);
        g2d.fillRect(116 + x, 120 + y, 1, 2);
        g2d.fillRect(117 + x, 121 + y, 1, 1);
        g2d.fillRect(106 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 123 + y, 3, 1);
        g2d.fillRect(105 + x, 124 + y, 2, 1);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(117 + x, 124 + y, 1, 1);
        g2d.fillRect(106 + x, 125 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 2, 1);
        g2d.fillRect(118 + x, 125 + y, 1, 3);
        g2d.fillRect(105 + x, 126 + y, 1, 1);
        g2d.fillRect(109 + x, 126 + y, 1, 1);
        g2d.fillRect(106 + x, 127 + y, 1, 1);
        g2d.fillRect(117 + x, 127 + y, 1, 1);
        g2d.fillRect(104 + x, 128 + y, 1, 1);
        g2d.fillRect(117 + x, 129 + y, 1, 1);
        g2d.fillRect(104 + x, 131 + y, 1, 2);
        g2d.fillRect(119 + x, 131 + y, 1, 3);
        g2d.fillRect(103 + x, 133 + y, 1, 1);
        g2d.fillRect(105 + x, 133 + y, 1, 1);
        g2d.fillRect(110 + x, 133 + y, 1, 2);
        g2d.fillRect(111 + x, 133 + y, 1, 1);
        g2d.fillRect(117 + x, 133 + y, 2, 1);
        g2d.fillRect(121 + x, 133 + y, 1, 1);
        g2d.fillRect(106 + x, 134 + y, 1, 1);
        g2d.fillRect(113 + x, 134 + y, 1, 2);
        g2d.fillRect(109 + x, 135 + y, 1, 2);
        g2d.fillRect(114 + x, 135 + y, 1, 3);
        g2d.fillRect(100 + x, 136 + y, 1, 2);
        g2d.fillRect(101 + x, 136 + y, 1, 1);
        g2d.fillRect(105 + x, 136 + y, 3, 1);
        g2d.fillRect(107 + x, 137 + y, 1, 1);
        g2d.fillRect(99 + x, 138 + y, 1, 1);
        g2d.fillRect(102 + x, 138 + y, 2, 1);
        g2d.fillRect(106 + x, 138 + y, 1, 1);
        g2d.fillRect(103 + x, 139 + y, 1, 1);
        g2d.fillRect(102 + x, 140 + y, 1, 1);
        g2d.fillRect(105 + x, 140 + y, 1, 1);
        g2d.fillRect(114 + x, 140 + y, 1, 1);
        g2d.fillRect(104 + x, 141 + y, 1, 2);
        g2d.fillRect(111 + x, 141 + y, 1, 3);
        g2d.fillRect(119 + x, 141 + y, 1, 1);
        g2d.fillRect(102 + x, 142 + y, 1, 5);
        g2d.fillRect(97 + x, 143 + y, 1, 1);
        g2d.fillRect(126 + x, 143 + y, 1, 2);
        g2d.fillRect(96 + x, 144 + y, 1, 3);
        g2d.fillRect(113 + x, 144 + y, 1, 1);
        g2d.fillRect(120 + x, 144 + y, 1, 1);
        g2d.fillRect(108 + x, 145 + y, 1, 1);
        g2d.fillRect(92 + x, 146 + y, 2, 1);
        g2d.fillRect(117 + x, 146 + y, 1, 1);
        g2d.fillRect(127 + x, 146 + y, 4, 1);
        g2d.fillRect(97 + x, 148 + y, 1, 1);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 2);
        g2d.fillRect(124 + x, 148 + y, 1, 1);
        g2d.fillRect(101 + x, 149 + y, 1, 1);
        g2d.fillRect(106 + x, 149 + y, 1, 1);
        g2d.fillRect(95 + x, 150 + y, 1, 1);
        g2d.fillRect(104 + x, 150 + y, 1, 2);
        g2d.fillRect(105 + x, 150 + y, 1, 1);
        g2d.fillRect(121 + x, 150 + y, 1, 1);
        g2d.fillRect(124 + x, 150 + y, 1, 1);
        g2d.fillRect(127 + x, 150 + y, 1, 1);
        g2d.fillRect(89 + x, 151 + y, 1, 1);
        g2d.fillRect(97 + x, 151 + y, 1, 1);
        g2d.fillRect(100 + x, 151 + y, 1, 1);
        g2d.fillRect(130 + x, 151 + y, 1, 2);
        g2d.fillRect(110 + x, 152 + y, 2, 1);
        g2d.fillRect(96 + x, 153 + y, 1, 1);
        g2d.fillRect(111 + x, 153 + y, 1, 1);
        g2d.fillRect(127 + x, 153 + y, 1, 1);
        g2d.fillRect(91 + x, 155 + y, 1, 1);
        g2d.fillRect(128 + x, 155 + y, 1, 3);
        g2d.fillRect(90 + x, 156 + y, 1, 2);
        g2d.fillRect(94 + x, 156 + y, 1, 1);
        g2d.fillRect(89 + x, 157 + y, 1, 1);
        g2d.fillRect(98 + x, 157 + y, 2, 1);
        g2d.fillRect(95 + x, 158 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 1);
        g2d.fillRect(129 + x, 158 + y, 1, 1);
        g2d.fillRect(94 + x, 159 + y, 1, 1);
        g2d.fillRect(96 + x, 159 + y, 1, 1);
        g2d.fillRect(127 + x, 160 + y, 1, 1);
        g2d.fillRect(129 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5, ImageUtilities.NEG_GREY_4));
        g2d.fillRect(119 + x, 128 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(116 + x, 131 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4, ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 129 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 130 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3, ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 129 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(116 + x, 116 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(119 + x, 126 + y, 1, 1);
        g2d.fillRect(118 + x, 128 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2, ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 129 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 130 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1, ImageUtilities.GREY));
        g2d.fillRect(114 + x, 113 + y, 2, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 1);
        g2d.fillRect(113 + x, 117 + y, 2, 1);
        g2d.fillRect(114 + x, 120 + y, 1, 1);
        g2d.fillRect(112 + x, 122 + y, 2, 1);
        g2d.fillRect(105 + x, 123 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 1);
        g2d.fillRect(113 + x, 125 + y, 1, 1);
        g2d.fillRect(105 + x, 127 + y, 1, 1);
        g2d.fillRect(108 + x, 127 + y, 2, 1);
        g2d.fillRect(119 + x, 127 + y, 1, 1);
        g2d.fillRect(117 + x, 128 + y, 1, 1);
        g2d.fillRect(108 + x, 129 + y, 1, 1);
        g2d.fillRect(109 + x, 131 + y, 2, 1);
        g2d.fillRect(107 + x, 132 + y, 1, 1);
        g2d.fillRect(108 + x, 134 + y, 1, 3);
        g2d.fillRect(118 + x, 134 + y, 1, 1);
        g2d.fillRect(94 + x, 143 + y, 1, 3);
        g2d.fillRect(95 + x, 143 + y, 1, 1);
        g2d.fillRect(121 + x, 143 + y, 1, 1);
        g2d.fillRect(124 + x, 144 + y, 1, 1);
        g2d.fillRect(125 + x, 145 + y, 1, 1);
        g2d.fillRect(127 + x, 145 + y, 1, 1);
        g2d.fillRect(114 + x, 146 + y, 1, 1);
        g2d.fillRect(122 + x, 147 + y, 1, 1);
        g2d.fillRect(126 + x, 149 + y, 2, 1);
        g2d.fillRect(100 + x, 150 + y, 1, 1);
        g2d.fillRect(98 + x, 151 + y, 1, 1);
        g2d.fillRect(102 + x, 152 + y, 1, 2);
        g2d.fillRect(91 + x, 154 + y, 1, 1);
        g2d.fillRect(100 + x, 155 + y, 1, 2);
        g2d.fillRect(105 + x, 155 + y, 1, 1);
        g2d.fillRect(111 + x, 155 + y, 1, 1);
        g2d.fillRect(116 + x, 155 + y, 1, 2);
        g2d.fillRect(120 + x, 155 + y, 1, 3);
        g2d.fillRect(126 + x, 155 + y, 1, 3);
        g2d.fillRect(92 + x, 156 + y, 1, 1);
        g2d.fillRect(110 + x, 156 + y, 1, 1);
        g2d.fillRect(117 + x, 156 + y, 1, 2);
        g2d.fillRect(106 + x, 157 + y, 1, 4);
        g2d.fillRect(128 + x, 159 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 131 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY, ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 130 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(117 + x, 119 + y, 1, 1);
        g2d.fillRect(113 + x, 123 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1, ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 116 + y, 1, 3);
        g2d.fillRect(106 + x, 120 + y, 1, 1);
        g2d.fillRect(114 + x, 121 + y, 1, 3);
        g2d.fillRect(105 + x, 125 + y, 1, 1);
        g2d.fillRect(108 + x, 130 + y, 1, 1);
        g2d.fillRect(120 + x, 130 + y, 1, 1);
        g2d.fillRect(118 + x, 131 + y, 1, 1);
        g2d.fillRect(120 + x, 138 + y, 1, 1);
        g2d.fillRect(95 + x, 144 + y, 1, 1);
        g2d.fillRect(120 + x, 145 + y, 1, 2);
        g2d.fillRect(91 + x, 146 + y, 1, 1);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(96 + x, 155 + y, 1, 1);
        g2d.fillRect(115 + x, 156 + y, 1, 1);
        g2d.fillRect(100 + x, 157 + y, 1, 1);
        g2d.fillRect(105 + x, 157 + y, 1, 2);
        g2d.fillRect(94 + x, 158 + y, 1, 1);
        g2d.fillRect(107 + x, 158 + y, 1, 3);
        g2d.fillRect(117 + x, 158 + y, 1, 1);
        g2d.fillRect(97 + x, 159 + y, 1, 1);
        g2d.fillRect(125 + x, 159 + y, 1, 3);
        g2d.fillRect(130 + x, 160 + y, 1, 1);
        g2d.fillRect(118 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 131 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2, ImageUtilities.GREY_3));
        g2d.fillRect(108 + x, 131 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(111 + x, 121 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 130 + y, 1, 1);
        g2d.fillRect(112 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3, ImageUtilities.GREY_4));
        g2d.fillRect(109 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(111 + x, 110 + y, 1, 4);
        g2d.fillRect(110 + x, 118 + y, 1, 2);
        g2d.fillRect(109 + x, 123 + y, 1, 2);
        g2d.fillRect(112 + x, 126 + y, 1, 2);
        g2d.fillRect(118 + x, 136 + y, 1, 1);
        g2d.fillRect(104 + x, 137 + y, 2, 1);
        g2d.fillRect(110 + x, 138 + y, 1, 3);
        g2d.fillRect(116 + x, 139 + y, 1, 1);
        g2d.fillRect(97 + x, 140 + y, 1, 2);
        g2d.fillRect(106 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 143 + y, 1, 1);
        g2d.fillRect(93 + x, 144 + y, 1, 2);
        g2d.fillRect(107 + x, 144 + y, 1, 2);
        g2d.fillRect(114 + x, 144 + y, 1, 1);
        g2d.fillRect(101 + x, 145 + y, 1, 3);
        g2d.fillRect(113 + x, 145 + y, 1, 3);
        g2d.fillRect(117 + x, 145 + y, 1, 1);
        g2d.fillRect(90 + x, 146 + y, 1, 1);
        g2d.fillRect(122 + x, 146 + y, 1, 1);
        g2d.fillRect(125 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 148 + y, 1, 1);
        g2d.fillRect(106 + x, 148 + y, 1, 1);
        g2d.fillRect(109 + x, 148 + y, 1, 3);
        g2d.fillRect(105 + x, 149 + y, 1, 1);
        g2d.fillRect(94 + x, 150 + y, 1, 1);
        g2d.fillRect(106 + x, 150 + y, 1, 6);
        g2d.fillRect(95 + x, 151 + y, 2, 1);
        g2d.fillRect(125 + x, 151 + y, 1, 2);
        g2d.fillRect(112 + x, 152 + y, 1, 1);
        g2d.fillRect(118 + x, 152 + y, 1, 1);
        g2d.fillRect(126 + x, 153 + y, 1, 2);
        g2d.fillRect(127 + x, 154 + y, 1, 1);
        g2d.fillRect(113 + x, 155 + y, 1, 1);
        g2d.fillRect(123 + x, 155 + y, 1, 1);
        g2d.fillRect(107 + x, 156 + y, 1, 2);
        g2d.fillRect(127 + x, 157 + y, 1, 1);
        g2d.fillRect(109 + x, 159 + y, 2, 1);
        g2d.fillRect(118 + x, 159 + y, 1, 2);
        g2d.fillRect(122 + x, 159 + y, 1, 1);
        g2d.fillRect(97 + x, 160 + y, 1, 1);
        g2d.fillRect(108 + x, 160 + y, 1, 1);
        g2d.fillRect(120 + x, 160 + y, 1, 1);
        g2d.fillRect(90 + x, 161 + y, 1, 1);
        g2d.fillRect(95 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(113 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(109 + x, 110 + y, 2, 1);
        g2d.fillRect(112 + x, 111 + y, 2, 1);
        g2d.fillRect(108 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(108 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 4);
        g2d.fillRect(112 + x, 114 + y, 1, 2);
        g2d.fillRect(110 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 2, 1);
        g2d.fillRect(109 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 117 + y, 1, 3);
        g2d.fillRect(107 + x, 118 + y, 1, 1);
        g2d.fillRect(108 + x, 119 + y, 1, 2);
        g2d.fillRect(109 + x, 119 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(113 + x, 120 + y, 1, 2);
        g2d.fillRect(106 + x, 121 + y, 1, 1);
        g2d.fillRect(109 + x, 121 + y, 1, 2);
        g2d.fillRect(110 + x, 121 + y, 1, 2);
        g2d.fillRect(112 + x, 121 + y, 1, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(111 + x, 122 + y, 1, 3);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(107 + x, 124 + y, 1, 3);
        g2d.fillRect(108 + x, 124 + y, 1, 1);
        g2d.fillRect(113 + x, 124 + y, 1, 1);
        g2d.fillRect(118 + x, 124 + y, 1, 1);
        g2d.fillRect(112 + x, 125 + y, 1, 1);
        g2d.fillRect(117 + x, 125 + y, 1, 1);
        g2d.fillRect(106 + x, 126 + y, 1, 1);
        g2d.fillRect(108 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 126 + y, 2, 1);
        g2d.fillRect(114 + x, 127 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 4);
        g2d.fillRect(106 + x, 128 + y, 1, 1);
        g2d.fillRect(111 + x, 128 + y, 1, 2);
        g2d.fillRect(112 + x, 128 + y, 1, 4);
        g2d.fillRect(115 + x, 128 + y, 1, 1);
        g2d.fillRect(109 + x, 130 + y, 2, 1);
        g2d.fillRect(113 + x, 130 + y, 1, 2);
        g2d.fillRect(111 + x, 131 + y, 1, 2);
        g2d.fillRect(114 + x, 131 + y, 1, 1);
        g2d.fillRect(116 + x, 132 + y, 1, 6);
        g2d.fillRect(106 + x, 133 + y, 1, 1);
        g2d.fillRect(113 + x, 133 + y, 3, 1);
        g2d.fillRect(105 + x, 134 + y, 1, 2);
        g2d.fillRect(107 + x, 134 + y, 1, 2);
        g2d.fillRect(109 + x, 134 + y, 1, 1);
        g2d.fillRect(111 + x, 134 + y, 1, 6);
        g2d.fillRect(112 + x, 134 + y, 1, 1);
        g2d.fillRect(114 + x, 134 + y, 2, 1);
        g2d.fillRect(117 + x, 134 + y, 1, 1);
        g2d.fillRect(101 + x, 135 + y, 1, 1);
        g2d.fillRect(104 + x, 135 + y, 1, 2);
        g2d.fillRect(110 + x, 135 + y, 1, 1);
        g2d.fillRect(115 + x, 135 + y, 1, 1);
        g2d.fillRect(118 + x, 135 + y, 1, 1);
        g2d.fillRect(122 + x, 135 + y, 1, 1);
        g2d.fillRect(103 + x, 137 + y, 1, 1);
        g2d.fillRect(106 + x, 137 + y, 1, 1);
        g2d.fillRect(108 + x, 137 + y, 1, 2);
        g2d.fillRect(109 + x, 137 + y, 1, 1);
        g2d.fillRect(104 + x, 138 + y, 1, 3);
        g2d.fillRect(105 + x, 138 + y, 1, 2);
        g2d.fillRect(107 + x, 138 + y, 1, 1);
        g2d.fillRect(114 + x, 138 + y, 1, 2);
        g2d.fillRect(117 + x, 138 + y, 1, 1);
        g2d.fillRect(102 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 139 + y, 1, 1);
        g2d.fillRect(120 + x, 139 + y, 1, 4);
        g2d.fillRect(101 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 140 + y, 1, 4);
        g2d.fillRect(117 + x, 140 + y, 1, 1);
        g2d.fillRect(98 + x, 141 + y, 2, 1);
        g2d.fillRect(102 + x, 141 + y, 1, 1);
        g2d.fillRect(123 + x, 141 + y, 2, 1);
        g2d.fillRect(101 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 142 + y, 1, 1);
        g2d.fillRect(117 + x, 142 + y, 1, 1);
        g2d.fillRect(121 + x, 142 + y, 1, 1);
        g2d.fillRect(96 + x, 143 + y, 1, 1);
        g2d.fillRect(104 + x, 143 + y, 1, 3);
        g2d.fillRect(106 + x, 143 + y, 1, 2);
        g2d.fillRect(118 + x, 143 + y, 1, 3);
        g2d.fillRect(110 + x, 144 + y, 1, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 2);
        g2d.fillRect(90 + x, 145 + y, 1, 1);
        g2d.fillRect(92 + x, 145 + y, 1, 1);
        g2d.fillRect(100 + x, 145 + y, 1, 3);
        g2d.fillRect(114 + x, 145 + y, 1, 1);
        g2d.fillRect(122 + x, 145 + y, 1, 1);
        g2d.fillRect(88 + x, 146 + y, 2, 1);
        g2d.fillRect(97 + x, 146 + y, 1, 1);
        g2d.fillRect(107 + x, 146 + y, 1, 3);
        g2d.fillRect(109 + x, 146 + y, 1, 2);
        g2d.fillRect(112 + x, 146 + y, 1, 2);
        g2d.fillRect(123 + x, 146 + y, 1, 1);
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(114 + x, 147 + y, 1, 1);
        g2d.fillRect(128 + x, 147 + y, 1, 1);
        g2d.fillRect(122 + x, 148 + y, 2, 1);
        g2d.fillRect(126 + x, 148 + y, 2, 1);
        g2d.fillRect(92 + x, 149 + y, 1, 1);
        g2d.fillRect(98 + x, 149 + y, 1, 2);
        g2d.fillRect(100 + x, 149 + y, 1, 1);
        g2d.fillRect(104 + x, 149 + y, 1, 1);
        g2d.fillRect(110 + x, 149 + y, 1, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 1);
        g2d.fillRect(123 + x, 149 + y, 1, 1);
        g2d.fillRect(90 + x, 150 + y, 1, 1);
        g2d.fillRect(116 + x, 150 + y, 2, 1);
        g2d.fillRect(122 + x, 150 + y, 1, 1);
        g2d.fillRect(128 + x, 150 + y, 1, 1);
        g2d.fillRect(117 + x, 151 + y, 1, 1);
        g2d.fillRect(121 + x, 151 + y, 1, 2);
        g2d.fillRect(88 + x, 152 + y, 1, 1);
        g2d.fillRect(93 + x, 152 + y, 1, 1);
        g2d.fillRect(99 + x, 152 + y, 1, 2);
        g2d.fillRect(100 + x, 152 + y, 1, 1);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(116 + x, 152 + y, 1, 1);
        g2d.fillRect(91 + x, 153 + y, 1, 1);
        g2d.fillRect(98 + x, 153 + y, 1, 2);
        g2d.fillRect(103 + x, 153 + y, 1, 2);
        g2d.fillRect(112 + x, 153 + y, 1, 2);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(90 + x, 154 + y, 1, 1);
        g2d.fillRect(96 + x, 154 + y, 1, 1);
        g2d.fillRect(102 + x, 154 + y, 1, 1);
        g2d.fillRect(107 + x, 154 + y, 1, 1);
        g2d.fillRect(120 + x, 154 + y, 1, 1);
        g2d.fillRect(117 + x, 155 + y, 1, 1);
        g2d.fillRect(91 + x, 156 + y, 1, 1);
        g2d.fillRect(96 + x, 156 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 156 + y, 1, 1);
        g2d.fillRect(109 + x, 156 + y, 1, 1);
        g2d.fillRect(111 + x, 156 + y, 1, 1);
        g2d.fillRect(113 + x, 156 + y, 1, 1);
        g2d.fillRect(119 + x, 156 + y, 1, 1);
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(121 + x, 157 + y, 1, 1);
        g2d.fillRect(124 + x, 157 + y, 1, 1);
        g2d.fillRect(103 + x, 158 + y, 1, 1);
        g2d.fillRect(110 + x, 158 + y, 1, 1);
        g2d.fillRect(122 + x, 158 + y, 1, 1);
        g2d.fillRect(128 + x, 158 + y, 1, 1);
        g2d.fillRect(108 + x, 159 + y, 1, 1);
        g2d.fillRect(119 + x, 159 + y, 1, 2);
        g2d.fillRect(121 + x, 159 + y, 1, 1);
        g2d.fillRect(124 + x, 159 + y, 1, 1);
        g2d.fillRect(129 + x, 159 + y, 1, 2);
        g2d.fillRect(95 + x, 160 + y, 1, 1);
        g2d.fillRect(98 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 160 + y, 1, 1);
        g2d.fillRect(123 + x, 160 + y, 1, 1);
        g2d.fillRect(126 + x, 160 + y, 1, 3);
        g2d.fillRect(94 + x, 161 + y, 1, 2);
        g2d.fillRect(120 + x, 161 + y, 1, 2);
        g2d.fillRect(130 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 162 + y, 1, 2);
        g2d.fillRect(127 + x, 162 + y, 1, 2);
        g2d.fillRect(128 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 110 + y, 1, 2);
        g2d.fillRect(112 + x, 110 + y, 3, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(112 + x, 112 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 4);
        g2d.fillRect(114 + x, 114 + y, 1, 2);
        g2d.fillRect(108 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 2, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(108 + x, 125 + y, 2, 1);
        g2d.fillRect(110 + x, 126 + y, 1, 4);
        g2d.fillRect(111 + x, 126 + y, 1, 2);
        g2d.fillRect(117 + x, 126 + y, 1, 1);
        g2d.fillRect(107 + x, 127 + y, 1, 1);
        g2d.fillRect(109 + x, 128 + y, 1, 2);
        g2d.fillRect(115 + x, 129 + y, 1, 1);
        g2d.fillRect(115 + x, 131 + y, 1, 1);
        g2d.fillRect(108 + x, 132 + y, 1, 1);
        g2d.fillRect(117 + x, 132 + y, 2, 1);
        g2d.fillRect(109 + x, 133 + y, 1, 1);
        g2d.fillRect(106 + x, 135 + y, 1, 1);
        g2d.fillRect(100 + x, 138 + y, 1, 2);
        g2d.fillRect(99 + x, 139 + y, 1, 2);
        g2d.fillRect(117 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 139 + y, 1, 2);
        g2d.fillRect(98 + x, 140 + y, 1, 1);
        g2d.fillRect(108 + x, 140 + y, 1, 5);
        g2d.fillRect(111 + x, 140 + y, 2, 1);
        g2d.fillRect(110 + x, 141 + y, 1, 1);
        g2d.fillRect(117 + x, 141 + y, 1, 1);
        g2d.fillRect(97 + x, 142 + y, 1, 1);
        g2d.fillRect(123 + x, 142 + y, 1, 2);
        g2d.fillRect(101 + x, 143 + y, 1, 2);
        g2d.fillRect(117 + x, 143 + y, 1, 2);
        g2d.fillRect(120 + x, 143 + y, 1, 1);
        g2d.fillRect(125 + x, 144 + y, 1, 1);
        g2d.fillRect(126 + x, 145 + y, 1, 1);
        g2d.fillRect(117 + x, 147 + y, 1, 1);
        g2d.fillRect(120 + x, 147 + y, 1, 1);
        g2d.fillRect(92 + x, 148 + y, 1, 1);
        g2d.fillRect(101 + x, 148 + y, 1, 1);
        g2d.fillRect(121 + x, 148 + y, 1, 2);
        g2d.fillRect(95 + x, 149 + y, 1, 1);
        g2d.fillRect(113 + x, 149 + y, 1, 1);
        g2d.fillRect(91 + x, 150 + y, 1, 1);
        g2d.fillRect(114 + x, 150 + y, 1, 1);
        g2d.fillRect(88 + x, 151 + y, 1, 1);
        g2d.fillRect(109 + x, 151 + y, 1, 1);
        g2d.fillRect(126 + x, 151 + y, 1, 2);
        g2d.fillRect(94 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 152 + y, 2, 1);
        g2d.fillRect(103 + x, 152 + y, 1, 1);
        g2d.fillRect(122 + x, 152 + y, 1, 1);
        g2d.fillRect(101 + x, 153 + y, 1, 2);
        g2d.fillRect(113 + x, 153 + y, 1, 2);
        g2d.fillRect(89 + x, 154 + y, 1, 2);
        g2d.fillRect(111 + x, 154 + y, 1, 1);
        g2d.fillRect(107 + x, 155 + y, 1, 1);
        g2d.fillRect(112 + x, 155 + y, 1, 1);
        g2d.fillRect(106 + x, 156 + y, 1, 1);
        g2d.fillRect(109 + x, 157 + y, 1, 2);
        g2d.fillRect(93 + x, 158 + y, 1, 2);
        g2d.fillRect(112 + x, 158 + y, 1, 1);
        g2d.fillRect(118 + x, 158 + y, 1, 1);
        g2d.fillRect(127 + x, 158 + y, 1, 1);
        g2d.fillRect(92 + x, 159 + y, 1, 2);
        g2d.fillRect(89 + x, 160 + y, 1, 2);
        g2d.fillRect(106 + x, 161 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(115 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4, ImageUtilities.GREY_5));
        g2d.fillRect(114 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(109 + x, 111 + y, 1, 2);
        g2d.fillRect(110 + x, 112 + y, 1, 4);
        g2d.fillRect(108 + x, 113 + y, 1, 1);
        g2d.fillRect(109 + x, 115 + y, 1, 2);
        g2d.fillRect(108 + x, 116 + y, 1, 1);
        g2d.fillRect(108 + x, 118 + y, 2, 1);
        g2d.fillRect(113 + x, 118 + y, 1, 2);
        g2d.fillRect(112 + x, 120 + y, 1, 1);
        g2d.fillRect(107 + x, 121 + y, 2, 1);
        g2d.fillRect(107 + x, 123 + y, 2, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 125 + y, 1, 1);
        g2d.fillRect(113 + x, 126 + y, 1, 4);
        g2d.fillRect(114 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 127 + y, 1, 1);
        g2d.fillRect(114 + x, 129 + y, 1, 2);
        g2d.fillRect(115 + x, 130 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 132 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 120 + y, 1, 1);
        g2d.fillRect(110 + x, 125 + y, 1, 1);
        g2d.fillRect(114 + x, 128 + y, 1, 1);
        g2d.fillRect(112 + x, 133 + y, 1, 1);
        g2d.fillRect(110 + x, 136 + y, 1, 2);
        g2d.fillRect(115 + x, 136 + y, 1, 3);
        g2d.fillRect(122 + x, 136 + y, 1, 1);
        g2d.fillRect(118 + x, 137 + y, 1, 6);
        g2d.fillRect(107 + x, 139 + y, 1, 5);
        g2d.fillRect(108 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 141 + y, 1, 2);
        g2d.fillRect(114 + x, 141 + y, 1, 3);
        g2d.fillRect(95 + x, 142 + y, 1, 1);
        g2d.fillRect(103 + x, 142 + y, 1, 2);
        g2d.fillRect(100 + x, 143 + y, 1, 2);
        g2d.fillRect(125 + x, 143 + y, 1, 1);
        g2d.fillRect(91 + x, 145 + y, 1, 1);
        g2d.fillRect(118 + x, 146 + y, 1, 1);
        g2d.fillRect(121 + x, 146 + y, 1, 1);
        g2d.fillRect(125 + x, 147 + y, 1, 1);
        g2d.fillRect(94 + x, 148 + y, 1, 2);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(99 + x, 148 + y, 1, 4);
        g2d.fillRect(114 + x, 148 + y, 1, 2);
        g2d.fillRect(122 + x, 149 + y, 1, 1);
        g2d.fillRect(110 + x, 150 + y, 1, 2);
        g2d.fillRect(90 + x, 151 + y, 1, 1);
        g2d.fillRect(94 + x, 151 + y, 1, 1);
        g2d.fillRect(118 + x, 151 + y, 1, 1);
        g2d.fillRect(122 + x, 151 + y, 1, 1);
        g2d.fillRect(129 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 152 + y, 1, 3);
        g2d.fillRect(95 + x, 153 + y, 1, 4);
        g2d.fillRect(97 + x, 153 + y, 1, 1);
        g2d.fillRect(100 + x, 153 + y, 1, 2);
        g2d.fillRect(109 + x, 153 + y, 2, 1);
        g2d.fillRect(125 + x, 153 + y, 1, 2);
        g2d.fillRect(110 + x, 154 + y, 1, 2);
        g2d.fillRect(90 + x, 155 + y, 1, 1);
        g2d.fillRect(127 + x, 155 + y, 1, 2);
        g2d.fillRect(112 + x, 156 + y, 1, 2);
        g2d.fillRect(118 + x, 156 + y, 1, 1);
        g2d.fillRect(119 + x, 157 + y, 1, 1);
        g2d.fillRect(122 + x, 157 + y, 1, 1);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(123 + x, 158 + y, 1, 2);
        g2d.fillRect(90 + x, 160 + y, 1, 1);
        g2d.fillRect(96 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 161 + y, 1, 1);
        g2d.fillRect(107 + x, 161 + y, 2, 1);
        g2d.fillRect(127 + x, 161 + y, 1, 1);
        g2d.fillRect(128 + x, 162 + y, 1, 1);
    }
}
