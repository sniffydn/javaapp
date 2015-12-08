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
public class Srt30 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    int prevY = 0;
    int prevPrevY = 0;

    public Srt30()
    {
        super();
        containsTL = true;
        drs = true;
    }

    public Srt30(String middle)
    {
        super(middle);
        containsTL = true;
        drs = true;
    }

    public Srt30(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        drs = true;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintsl7(x,0,g2d);

        paintL1(x,prevY,g2d);
        paintL2(x,prevPrevY,g2d);
        paintL3(x,0,g2d);

        prevPrevY = prevY;
        prevY = y;
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintsu7(x,y,g2d);
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

    public void paintsu7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 2, 1);
        g2d.fillRect(108 + x, 51 + y, 3, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(111 + x, 52 + y, 5, 1);
        g2d.fillRect(116 + x, 53 + y, 6, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 10, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 47 + y, 1, 3);
        g2d.fillRect(102 + x, 47 + y, 1, 4);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 9, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 1, 6);
        g2d.fillRect(104 + x, 50 + y, 2, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 4);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 53 + y, 7, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 4, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 2, 1);
        g2d.fillRect(105 + x, 57 + y, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 51 + y, 1, 5);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 3, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 2, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 52 + y, 1, 2);
        g2d.fillRect(106 + x, 52 + y, 1, 2);
        g2d.fillRect(107 + x, 52 + y, 4, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 2, 1);
        g2d.fillRect(108 + x, 55 + y, 4, 1);
    }





    public void paintsl7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 41 + y, 1, 4);
        g2d.fillRect(99 + x, 41 + y, 3, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(99 + x, 45 + y, 1, 5);
        g2d.fillRect(103 + x, 46 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 42 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(100 + x, 43 + y, 1, 4);
        g2d.fillRect(101 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
    }





    public void paintL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 59 + y, 1, 5);
        g2d.fillRect(103 + x, 59 + y, 1, 4);
        g2d.fillRect(104 + x, 59 + y, 1, 4);
        g2d.fillRect(105 + x, 59 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 3);
        g2d.fillRect(116 + x, 59 + y, 1, 6);
        g2d.fillRect(117 + x, 59 + y, 1, 4);
        g2d.fillRect(101 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(100 + x, 65 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 66 + y, 3, 1);
        g2d.fillRect(101 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 67 + y, 2, 1);
        g2d.fillRect(102 + x, 68 + y, 1, 2);
        g2d.fillRect(103 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 5, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
        g2d.fillRect(103 + x, 63 + y, 1, 2);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 62 + y, 2, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 3, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(104 + x, 64 + y, 3, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 2, 1);
        g2d.fillRect(107 + x, 66 + y, 2, 1);
        g2d.fillRect(102 + x, 67 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 2, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(101 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(108 + x, 65 + y, 2, 1);
        g2d.fillRect(102 + x, 66 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 3, 1);
        g2d.fillRect(102 + x, 65 + y, 3, 1);
    }





    public void paintL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 64 + y, 1, 3);
        g2d.fillRect(116 + x, 64 + y, 1, 6);
        g2d.fillRect(113 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 66 + y, 3, 1);
        g2d.fillRect(108 + x, 67 + y, 2, 1);
        g2d.fillRect(105 + x, 68 + y, 3, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(102 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 69 + y, 2, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(101 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(100 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 73 + y, 2, 1);
        g2d.fillRect(108 + x, 74 + y, 3, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 3, 1);
        g2d.fillRect(102 + x, 76 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 2);
        g2d.fillRect(106 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 69 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 1, 2);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 2, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 3, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 3, 1);
        g2d.fillRect(110 + x, 72 + y, 2, 1);
        g2d.fillRect(107 + x, 73 + y, 3, 1);
        g2d.fillRect(105 + x, 74 + y, 2, 1);
        g2d.fillRect(102 + x, 75 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 2, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 2);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(102 + x, 74 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 2, 1);
        g2d.fillRect(102 + x, 73 + y, 2, 1);
    }





    public void paintL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 2, 1);
        g2d.fillRect(117 + x, 70 + y, 2, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 5);
        g2d.fillRect(111 + x, 73 + y, 2, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 2);
        g2d.fillRect(109 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 2);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 4, 1);
        g2d.fillRect(100 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 2, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 79 + y, 1, 3);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 2, 1);
        g2d.fillRect(112 + x, 81 + y, 2, 1);
        g2d.fillRect(100 + x, 82 + y, 2, 1);
        g2d.fillRect(109 + x, 82 + y, 3, 1);
        g2d.fillRect(102 + x, 83 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 2);
        g2d.fillRect(118 + x, 72 + y, 1, 5);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(110 + x, 75 + y, 1, 2);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 2);
        g2d.fillRect(101 + x, 77 + y, 2, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 3, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 4);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(109 + x, 77 + y, 1, 2);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 2);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 2, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 5, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 3, 1);
        g2d.fillRect(109 + x, 81 + y, 2, 1);
        g2d.fillRect(103 + x, 82 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 73 + y, 1, 3);
        g2d.fillRect(115 + x, 74 + y, 1, 3);
        g2d.fillRect(113 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 1, 3);
        g2d.fillRect(111 + x, 78 + y, 1, 2);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(100 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 3);
        g2d.fillRect(101 + x, 80 + y, 2, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 2, 1);
        g2d.fillRect(103 + x, 80 + y, 3, 1);
    }
}
