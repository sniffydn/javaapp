/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.d;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D49 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D49()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public D49(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public D49(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        if(y == 1)
            y = 0;
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);
        paintB1(x,0,g2d);
        paintB2(x,prevY,g2d);
        paintB3(x,y+prevY,g2d);


    }
    int prevY = 0;


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

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintBB1(offsetX, offsetY, g2d);
        paintBB2(offsetX, offsetY + prevY, g2d);
        paintBB3(offsetX, offsetY + prevY + prevPrevY, g2d);
        paintBB4(offsetX, offsetY + prevY + prevPrevY + prevPrevPrevY, g2d);

        prevPrevPrevY = prevPrevY;
        prevPrevY = prevY;
        prevY = offsetY;
    }
    int prevPrevY = 0;
    int prevPrevPrevY = 0;

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

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(98 + x, 54 + y, 1, 3);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 7, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(109 + x, 60 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 52 + y, 21, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 3);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 1, 3);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 1, 2);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 53 + y, 2, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 2, 1);
        g2d.fillRect(108 + x, 56 + y, 6, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 53 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 17, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 4, 1);
        g2d.fillRect(114 + x, 56 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(113 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 1);
        g2d.fillRect(102 + x, 70 + y, 1, 2);
        g2d.fillRect(101 + x, 72 + y, 1, 2);
        g2d.fillRect(100 + x, 74 + y, 1, 4);
        g2d.fillRect(99 + x, 78 + y, 1, 16);
        g2d.fillRect(98 + x, 94 + y, 1, 12);
        g2d.fillRect(97 + x, 106 + y, 1, 7);
        g2d.fillRect(96 + x, 113 + y, 1, 5);
        g2d.fillRect(95 + x, 118 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 5);
        g2d.fillRect(121 + x, 89 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 69 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(101 + x, 74 + y, 1, 10);
        g2d.fillRect(100 + x, 78 + y, 1, 20);
        g2d.fillRect(119 + x, 79 + y, 1, 2);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 2);
        g2d.fillRect(99 + x, 94 + y, 1, 13);
        g2d.fillRect(98 + x, 106 + y, 1, 6);
        g2d.fillRect(97 + x, 113 + y, 1, 5);
        g2d.fillRect(96 + x, 118 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 2);
        g2d.fillRect(104 + x, 71 + y, 1, 7);
        g2d.fillRect(103 + x, 73 + y, 1, 9);
        g2d.fillRect(102 + x, 75 + y, 1, 13);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 2);
        g2d.fillRect(108 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 14);
        g2d.fillRect(100 + x, 98 + y, 1, 11);
        g2d.fillRect(99 + x, 107 + y, 1, 9);
        g2d.fillRect(98 + x, 112 + y, 1, 8);
        g2d.fillRect(97 + x, 118 + y, 1, 4);
        g2d.fillRect(108 + x, 125 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(117 + x, 69 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 5);
        g2d.fillRect(121 + x, 95 + y, 1, 27);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(107 + x, 69 + y, 1, 2);
        g2d.fillRect(108 + x, 69 + y, 2, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 5);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 6);
        g2d.fillRect(107 + x, 73 + y, 1, 4);
        g2d.fillRect(116 + x, 73 + y, 1, 5);
        g2d.fillRect(108 + x, 74 + y, 1, 3);
        g2d.fillRect(109 + x, 75 + y, 1, 3);
        g2d.fillRect(110 + x, 75 + y, 1, 3);
        g2d.fillRect(111 + x, 75 + y, 1, 2);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(115 + x, 77 + y, 1, 2);
        g2d.fillRect(104 + x, 78 + y, 1, 4);
        g2d.fillRect(106 + x, 78 + y, 1, 5);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 3);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 1, 6);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 3);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 3);
        g2d.fillRect(102 + x, 88 + y, 1, 10);
        g2d.fillRect(101 + x, 98 + y, 1, 13);
        g2d.fillRect(108 + x, 102 + y, 1, 23);
        g2d.fillRect(100 + x, 109 + y, 1, 7);
        g2d.fillRect(99 + x, 116 + y, 1, 4);
        g2d.fillRect(109 + x, 118 + y, 1, 9);
        g2d.fillRect(98 + x, 120 + y, 1, 3);
        g2d.fillRect(107 + x, 122 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 69 + y, 4, 1);
        g2d.fillRect(116 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(111 + x, 72 + y, 5, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 3, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 3);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 3);
        g2d.fillRect(112 + x, 77 + y, 1, 3);
        g2d.fillRect(113 + x, 77 + y, 1, 5);
        g2d.fillRect(117 + x, 77 + y, 1, 3);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 2, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 15);
        g2d.fillRect(105 + x, 82 + y, 1, 5);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(112 + x, 83 + y, 2, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 4);
        g2d.fillRect(107 + x, 85 + y, 1, 3);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 23);
        g2d.fillRect(109 + x, 88 + y, 1, 5);
        g2d.fillRect(110 + x, 89 + y, 1, 3);
        g2d.fillRect(111 + x, 89 + y, 1, 3);
        g2d.fillRect(107 + x, 90 + y, 1, 32);
        g2d.fillRect(108 + x, 90 + y, 1, 12);
        g2d.fillRect(112 + x, 90 + y, 1, 2);
        g2d.fillRect(105 + x, 94 + y, 1, 4);
        g2d.fillRect(109 + x, 94 + y, 1, 24);
        g2d.fillRect(110 + x, 96 + y, 1, 7);
        g2d.fillRect(102 + x, 98 + y, 1, 14);
        g2d.fillRect(111 + x, 98 + y, 1, 5);
        g2d.fillRect(112 + x, 101 + y, 1, 6);
        g2d.fillRect(104 + x, 103 + y, 1, 12);
        g2d.fillRect(113 + x, 103 + y, 1, 6);
        g2d.fillRect(110 + x, 106 + y, 1, 21);
        g2d.fillRect(114 + x, 106 + y, 1, 5);
        g2d.fillRect(111 + x, 109 + y, 1, 8);
        g2d.fillRect(115 + x, 109 + y, 1, 4);
        g2d.fillRect(101 + x, 111 + y, 1, 14);
        g2d.fillRect(105 + x, 115 + y, 1, 8);
        g2d.fillRect(100 + x, 116 + y, 1, 8);
        g2d.fillRect(102 + x, 116 + y, 1, 5);
        g2d.fillRect(112 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 120 + y, 1, 3);
        g2d.fillRect(106 + x, 121 + y, 1, 6);
        g2d.fillRect(111 + x, 121 + y, 1, 6);
        g2d.fillRect(112 + x, 125 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 70 + y, 1, 3);
        g2d.fillRect(111 + x, 70 + y, 3, 1);
        g2d.fillRect(108 + x, 72 + y, 2, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 3, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 2, 1);
        g2d.fillRect(107 + x, 78 + y, 3, 1);
        g2d.fillRect(108 + x, 79 + y, 2, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 3);
        g2d.fillRect(116 + x, 84 + y, 1, 3);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 7);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 2, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 4, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 3);
        g2d.fillRect(110 + x, 92 + y, 1, 4);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 1, 4);
        g2d.fillRect(104 + x, 97 + y, 1, 6);
        g2d.fillRect(112 + x, 97 + y, 1, 4);
        g2d.fillRect(113 + x, 99 + y, 1, 4);
        g2d.fillRect(114 + x, 102 + y, 1, 4);
        g2d.fillRect(110 + x, 103 + y, 1, 3);
        g2d.fillRect(111 + x, 103 + y, 1, 3);
        g2d.fillRect(105 + x, 106 + y, 1, 9);
        g2d.fillRect(115 + x, 106 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 7);
        g2d.fillRect(103 + x, 111 + y, 1, 15);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(102 + x, 112 + y, 1, 4);
        g2d.fillRect(112 + x, 112 + y, 1, 5);
        g2d.fillRect(117 + x, 113 + y, 1, 3);
        g2d.fillRect(113 + x, 115 + y, 1, 6);
        g2d.fillRect(106 + x, 116 + y, 1, 5);
        g2d.fillRect(111 + x, 117 + y, 1, 4);
        g2d.fillRect(112 + x, 118 + y, 1, 2);
        g2d.fillRect(102 + x, 121 + y, 1, 4);
        g2d.fillRect(112 + x, 121 + y, 1, 4);
        g2d.fillRect(105 + x, 123 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 3);
        g2d.fillRect(111 + x, 71 + y, 2, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 3);
        g2d.fillRect(110 + x, 73 + y, 2, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 8);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 3, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 2);
        g2d.fillRect(120 + x, 82 + y, 1, 5);
        g2d.fillRect(117 + x, 84 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 2, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 4);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 3);
        g2d.fillRect(114 + x, 89 + y, 4, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 3);
        g2d.fillRect(111 + x, 92 + y, 1, 2);
        g2d.fillRect(112 + x, 93 + y, 1, 4);
        g2d.fillRect(113 + x, 93 + y, 1, 3);
        g2d.fillRect(114 + x, 93 + y, 1, 3);
        g2d.fillRect(115 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 94 + y, 1, 5);
        g2d.fillRect(117 + x, 96 + y, 1, 5);
        g2d.fillRect(113 + x, 97 + y, 1, 2);
        g2d.fillRect(118 + x, 97 + y, 1, 6);
        g2d.fillRect(105 + x, 98 + y, 1, 8);
        g2d.fillRect(114 + x, 99 + y, 1, 3);
        g2d.fillRect(119 + x, 101 + y, 1, 6);
        g2d.fillRect(116 + x, 103 + y, 1, 1);
        g2d.fillRect(120 + x, 103 + y, 1, 8);
        g2d.fillRect(115 + x, 104 + y, 1, 2);
        g2d.fillRect(111 + x, 106 + y, 1, 2);
        g2d.fillRect(116 + x, 106 + y, 1, 2);
        g2d.fillRect(106 + x, 107 + y, 1, 9);
        g2d.fillRect(112 + x, 107 + y, 1, 5);
        g2d.fillRect(117 + x, 108 + y, 1, 5);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(118 + x, 112 + y, 1, 8);
        g2d.fillRect(119 + x, 113 + y, 1, 10);
        g2d.fillRect(104 + x, 115 + y, 1, 5);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 7);
        g2d.fillRect(117 + x, 116 + y, 1, 1);
        g2d.fillRect(120 + x, 117 + y, 1, 6);
        g2d.fillRect(112 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 120 + y, 1, 6);
        g2d.fillRect(113 + x, 121 + y, 1, 5);
        g2d.fillRect(116 + x, 123 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(113 + x, 71 + y, 2, 1);
        g2d.fillRect(112 + x, 73 + y, 3, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(115 + x, 83 + y, 4, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 4);
        g2d.fillRect(119 + x, 84 + y, 1, 6);
        g2d.fillRect(120 + x, 87 + y, 1, 16);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 3);
        g2d.fillRect(116 + x, 90 + y, 1, 4);
        g2d.fillRect(117 + x, 90 + y, 1, 6);
        g2d.fillRect(118 + x, 91 + y, 1, 6);
        g2d.fillRect(106 + x, 92 + y, 1, 15);
        g2d.fillRect(119 + x, 93 + y, 1, 8);
        g2d.fillRect(113 + x, 96 + y, 2, 1);
        g2d.fillRect(114 + x, 97 + y, 1, 2);
        g2d.fillRect(115 + x, 97 + y, 1, 7);
        g2d.fillRect(116 + x, 99 + y, 1, 4);
        g2d.fillRect(117 + x, 101 + y, 1, 7);
        g2d.fillRect(118 + x, 103 + y, 1, 9);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(119 + x, 107 + y, 1, 6);
        g2d.fillRect(113 + x, 111 + y, 1, 4);
        g2d.fillRect(120 + x, 111 + y, 1, 6);
        g2d.fillRect(114 + x, 113 + y, 1, 3);
        g2d.fillRect(115 + x, 113 + y, 1, 7);
        g2d.fillRect(116 + x, 116 + y, 1, 7);
        g2d.fillRect(117 + x, 117 + y, 1, 8);
        g2d.fillRect(104 + x, 120 + y, 1, 6);
        g2d.fillRect(118 + x, 120 + y, 1, 4);
        g2d.fillRect(114 + x, 123 + y, 1, 3);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(95 + x, 119 + y, 1, 3);
        g2d.fillRect(94 + x, 122 + y, 1, 5);
        g2d.fillRect(93 + x, 127 + y, 1, 4);
        g2d.fillRect(92 + x, 131 + y, 1, 4);
        g2d.fillRect(91 + x, 135 + y, 1, 4);
        g2d.fillRect(90 + x, 139 + y, 1, 2);
        g2d.fillRect(89 + x, 141 + y, 1, 3);
        g2d.fillRect(88 + x, 144 + y, 1, 2);
        g2d.fillRect(87 + x, 146 + y, 1, 2);
        g2d.fillRect(86 + x, 148 + y, 1, 2);
        g2d.fillRect(85 + x, 150 + y, 1, 2);
        g2d.fillRect(84 + x, 152 + y, 1, 2);
        g2d.fillRect(83 + x, 154 + y, 1, 1);
        g2d.fillRect(82 + x, 155 + y, 1, 2);
        g2d.fillRect(81 + x, 157 + y, 1, 1);
        g2d.fillRect(80 + x, 158 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(90 + x, 141 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(96 + x, 120 + y, 1, 5);
        g2d.fillRect(95 + x, 122 + y, 1, 8);
        g2d.fillRect(94 + x, 127 + y, 1, 4);
        g2d.fillRect(93 + x, 131 + y, 1, 4);
        g2d.fillRect(92 + x, 135 + y, 1, 4);
        g2d.fillRect(91 + x, 139 + y, 1, 2);
        g2d.fillRect(90 + x, 143 + y, 1, 1);
        g2d.fillRect(89 + x, 144 + y, 1, 2);
        g2d.fillRect(88 + x, 146 + y, 1, 3);
        g2d.fillRect(87 + x, 148 + y, 1, 4);
        g2d.fillRect(86 + x, 150 + y, 1, 3);
        g2d.fillRect(85 + x, 152 + y, 1, 5);
        g2d.fillRect(84 + x, 154 + y, 1, 4);
        g2d.fillRect(83 + x, 155 + y, 1, 4);
        g2d.fillRect(125 + x, 155 + y, 1, 2);
        g2d.fillRect(82 + x, 157 + y, 1, 4);
        g2d.fillRect(81 + x, 158 + y, 1, 3);
        g2d.fillRect(126 + x, 158 + y, 1, 7);
        g2d.fillRect(80 + x, 159 + y, 1, 1);
        g2d.fillRect(127 + x, 160 + y, 1, 4);
        g2d.fillRect(125 + x, 164 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(97 + x, 121 + y, 1, 3);
        g2d.fillRect(96 + x, 125 + y, 1, 2);
        g2d.fillRect(108 + x, 126 + y, 1, 23);
        g2d.fillRect(95 + x, 130 + y, 1, 1);
        g2d.fillRect(94 + x, 131 + y, 1, 4);
        g2d.fillRect(107 + x, 134 + y, 1, 21);
        g2d.fillRect(93 + x, 135 + y, 1, 3);
        g2d.fillRect(92 + x, 139 + y, 1, 1);
        g2d.fillRect(91 + x, 141 + y, 1, 3);
        g2d.fillRect(90 + x, 144 + y, 1, 4);
        g2d.fillRect(89 + x, 146 + y, 1, 2);
        g2d.fillRect(106 + x, 146 + y, 1, 12);
        g2d.fillRect(88 + x, 149 + y, 1, 1);
        g2d.fillRect(87 + x, 152 + y, 1, 1);
        g2d.fillRect(105 + x, 152 + y, 1, 8);
        g2d.fillRect(86 + x, 153 + y, 1, 2);
        g2d.fillRect(104 + x, 157 + y, 1, 6);
        g2d.fillRect(125 + x, 157 + y, 1, 7);
        g2d.fillRect(84 + x, 158 + y, 1, 1);
        g2d.fillRect(83 + x, 159 + y, 1, 3);
        g2d.fillRect(94 + x, 160 + y, 1, 2);
        g2d.fillRect(103 + x, 160 + y, 1, 4);
        g2d.fillRect(93 + x, 162 + y, 1, 1);
        g2d.fillRect(128 + x, 162 + y, 1, 3);
        g2d.fillRect(102 + x, 163 + y, 1, 2);
        g2d.fillRect(129 + x, 163 + y, 1, 1);
        g2d.fillRect(92 + x, 164 + y, 2, 1);
        g2d.fillRect(100 + x, 164 + y, 1, 3);
        g2d.fillRect(101 + x, 164 + y, 1, 3);
        g2d.fillRect(124 + x, 164 + y, 1, 3);
        g2d.fillRect(127 + x, 164 + y, 1, 2);
        g2d.fillRect(93 + x, 165 + y, 1, 2);
        g2d.fillRect(94 + x, 165 + y, 1, 2);
        g2d.fillRect(98 + x, 165 + y, 1, 3);
        g2d.fillRect(99 + x, 165 + y, 1, 3);
        g2d.fillRect(123 + x, 165 + y, 1, 2);
        g2d.fillRect(126 + x, 165 + y, 1, 1);
        g2d.fillRect(97 + x, 167 + y, 1, 1);
        g2d.fillRect(119 + x, 167 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 121 + y, 1, 18);
        g2d.fillRect(122 + x, 139 + y, 1, 6);
        g2d.fillRect(123 + x, 145 + y, 1, 5);
        g2d.fillRect(124 + x, 150 + y, 1, 3);
        g2d.fillRect(125 + x, 153 + y, 1, 2);
        g2d.fillRect(126 + x, 155 + y, 1, 3);
        g2d.fillRect(127 + x, 158 + y, 1, 2);
        g2d.fillRect(128 + x, 160 + y, 1, 2);
        g2d.fillRect(129 + x, 162 + y, 1, 1);
        g2d.fillRect(130 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 122 + y, 1, 2);
        g2d.fillRect(97 + x, 124 + y, 1, 3);
        g2d.fillRect(107 + x, 126 + y, 1, 8);
        g2d.fillRect(109 + x, 126 + y, 1, 34);
        g2d.fillRect(96 + x, 127 + y, 1, 4);
        g2d.fillRect(110 + x, 129 + y, 1, 25);
        g2d.fillRect(95 + x, 131 + y, 1, 4);
        g2d.fillRect(106 + x, 133 + y, 1, 13);
        g2d.fillRect(94 + x, 135 + y, 1, 3);
        g2d.fillRect(93 + x, 138 + y, 1, 2);
        g2d.fillRect(92 + x, 140 + y, 1, 4);
        g2d.fillRect(105 + x, 143 + y, 1, 9);
        g2d.fillRect(91 + x, 144 + y, 1, 4);
        g2d.fillRect(89 + x, 148 + y, 1, 5);
        g2d.fillRect(90 + x, 148 + y, 1, 2);
        g2d.fillRect(104 + x, 148 + y, 1, 9);
        g2d.fillRect(108 + x, 149 + y, 1, 14);
        g2d.fillRect(88 + x, 150 + y, 1, 5);
        g2d.fillRect(87 + x, 153 + y, 1, 5);
        g2d.fillRect(86 + x, 155 + y, 1, 4);
        g2d.fillRect(107 + x, 155 + y, 1, 9);
        g2d.fillRect(85 + x, 157 + y, 1, 5);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(103 + x, 157 + y, 1, 3);
        g2d.fillRect(96 + x, 158 + y, 1, 4);
        g2d.fillRect(97 + x, 158 + y, 1, 2);
        g2d.fillRect(106 + x, 158 + y, 1, 7);
        g2d.fillRect(84 + x, 159 + y, 1, 4);
        g2d.fillRect(94 + x, 159 + y, 2, 1);
        g2d.fillRect(102 + x, 159 + y, 1, 4);
        g2d.fillRect(92 + x, 160 + y, 1, 4);
        g2d.fillRect(93 + x, 160 + y, 1, 2);
        g2d.fillRect(95 + x, 160 + y, 1, 3);
        g2d.fillRect(105 + x, 160 + y, 1, 7);
        g2d.fillRect(94 + x, 162 + y, 1, 3);
        g2d.fillRect(101 + x, 162 + y, 1, 2);
        g2d.fillRect(124 + x, 162 + y, 1, 2);
        g2d.fillRect(93 + x, 163 + y, 1, 1);
        g2d.fillRect(100 + x, 163 + y, 1, 1);
        g2d.fillRect(104 + x, 163 + y, 1, 5);
        g2d.fillRect(123 + x, 163 + y, 1, 2);
        g2d.fillRect(91 + x, 164 + y, 1, 2);
        g2d.fillRect(95 + x, 164 + y, 1, 3);
        g2d.fillRect(96 + x, 164 + y, 1, 3);
        g2d.fillRect(97 + x, 164 + y, 1, 3);
        g2d.fillRect(98 + x, 164 + y, 2, 1);
        g2d.fillRect(103 + x, 164 + y, 1, 4);
        g2d.fillRect(114 + x, 164 + y, 1, 4);
        g2d.fillRect(122 + x, 164 + y, 1, 3);
        g2d.fillRect(92 + x, 165 + y, 1, 1);
        g2d.fillRect(102 + x, 165 + y, 1, 3);
        g2d.fillRect(115 + x, 165 + y, 1, 3);
        g2d.fillRect(116 + x, 165 + y, 1, 3);
        g2d.fillRect(117 + x, 165 + y, 1, 3);
        g2d.fillRect(118 + x, 165 + y, 1, 3);
        g2d.fillRect(119 + x, 165 + y, 1, 2);
        g2d.fillRect(120 + x, 165 + y, 1, 2);
        g2d.fillRect(121 + x, 165 + y, 1, 2);
        g2d.fillRect(100 + x, 167 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 122 + y, 1, 19);
        g2d.fillRect(100 + x, 123 + y, 1, 11);
        g2d.fillRect(98 + x, 124 + y, 1, 10);
        g2d.fillRect(101 + x, 124 + y, 1, 3);
        g2d.fillRect(106 + x, 126 + y, 1, 7);
        g2d.fillRect(110 + x, 126 + y, 1, 3);
        g2d.fillRect(111 + x, 126 + y, 1, 41);
        g2d.fillRect(112 + x, 126 + y, 1, 8);
        g2d.fillRect(97 + x, 127 + y, 1, 7);
        g2d.fillRect(113 + x, 127 + y, 1, 8);
        g2d.fillRect(96 + x, 131 + y, 1, 9);
        g2d.fillRect(114 + x, 131 + y, 1, 5);
        g2d.fillRect(95 + x, 135 + y, 1, 10);
        g2d.fillRect(105 + x, 135 + y, 1, 8);
        g2d.fillRect(112 + x, 135 + y, 1, 1);
        g2d.fillRect(115 + x, 135 + y, 1, 4);
        g2d.fillRect(104 + x, 136 + y, 1, 12);
        g2d.fillRect(94 + x, 138 + y, 1, 8);
        g2d.fillRect(112 + x, 138 + y, 1, 6);
        g2d.fillRect(93 + x, 140 + y, 1, 8);
        g2d.fillRect(116 + x, 140 + y, 1, 1);
        g2d.fillRect(113 + x, 141 + y, 1, 3);
        g2d.fillRect(103 + x, 143 + y, 1, 14);
        g2d.fillRect(92 + x, 144 + y, 1, 10);
        g2d.fillRect(114 + x, 144 + y, 1, 2);
        g2d.fillRect(115 + x, 146 + y, 1, 2);
        g2d.fillRect(91 + x, 148 + y, 1, 6);
        g2d.fillRect(99 + x, 148 + y, 1, 1);
        g2d.fillRect(102 + x, 148 + y, 1, 11);
        g2d.fillRect(112 + x, 148 + y, 1, 20);
        g2d.fillRect(96 + x, 149 + y, 1, 9);
        g2d.fillRect(90 + x, 150 + y, 1, 5);
        g2d.fillRect(100 + x, 150 + y, 1, 13);
        g2d.fillRect(113 + x, 150 + y, 1, 8);
        g2d.fillRect(95 + x, 152 + y, 1, 7);
        g2d.fillRect(97 + x, 152 + y, 1, 6);
        g2d.fillRect(101 + x, 152 + y, 1, 10);
        g2d.fillRect(89 + x, 153 + y, 1, 6);
        g2d.fillRect(124 + x, 153 + y, 1, 9);
        g2d.fillRect(98 + x, 154 + y, 1, 3);
        g2d.fillRect(99 + x, 154 + y, 1, 10);
        g2d.fillRect(110 + x, 154 + y, 1, 8);
        g2d.fillRect(114 + x, 154 + y, 1, 5);
        g2d.fillRect(88 + x, 155 + y, 1, 4);
        g2d.fillRect(118 + x, 157 + y, 1, 1);
        g2d.fillRect(87 + x, 158 + y, 1, 5);
        g2d.fillRect(93 + x, 158 + y, 1, 2);
        g2d.fillRect(94 + x, 158 + y, 1, 1);
        g2d.fillRect(115 + x, 158 + y, 1, 1);
        g2d.fillRect(119 + x, 158 + y, 1, 7);
        g2d.fillRect(86 + x, 159 + y, 1, 5);
        g2d.fillRect(98 + x, 159 + y, 1, 5);
        g2d.fillRect(97 + x, 160 + y, 1, 4);
        g2d.fillRect(109 + x, 160 + y, 1, 3);
        g2d.fillRect(113 + x, 160 + y, 1, 8);
        g2d.fillRect(120 + x, 160 + y, 1, 5);
        g2d.fillRect(85 + x, 162 + y, 1, 1);
        g2d.fillRect(90 + x, 162 + y, 1, 4);
        g2d.fillRect(91 + x, 162 + y, 1, 2);
        g2d.fillRect(96 + x, 162 + y, 1, 2);
        g2d.fillRect(114 + x, 162 + y, 1, 2);
        g2d.fillRect(121 + x, 162 + y, 1, 3);
        g2d.fillRect(123 + x, 162 + y, 1, 1);
        g2d.fillRect(95 + x, 163 + y, 1, 1);
        g2d.fillRect(108 + x, 163 + y, 1, 1);
        g2d.fillRect(110 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 163 + y, 1, 2);
        g2d.fillRect(116 + x, 163 + y, 1, 2);
        g2d.fillRect(122 + x, 163 + y, 1, 1);
        g2d.fillRect(89 + x, 164 + y, 1, 1);
        g2d.fillRect(107 + x, 164 + y, 1, 3);
        g2d.fillRect(117 + x, 164 + y, 2, 1);
        g2d.fillRect(106 + x, 165 + y, 1, 3);
        g2d.fillRect(110 + x, 165 + y, 1, 2);
        g2d.fillRect(105 + x, 167 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 124 + y, 1, 6);
        g2d.fillRect(105 + x, 125 + y, 1, 4);
        g2d.fillRect(113 + x, 125 + y, 1, 2);
        g2d.fillRect(101 + x, 127 + y, 1, 8);
        g2d.fillRect(114 + x, 127 + y, 1, 4);
        g2d.fillRect(104 + x, 130 + y, 1, 6);
        g2d.fillRect(115 + x, 131 + y, 1, 4);
        g2d.fillRect(105 + x, 133 + y, 1, 2);
        g2d.fillRect(97 + x, 134 + y, 1, 18);
        g2d.fillRect(98 + x, 134 + y, 1, 4);
        g2d.fillRect(100 + x, 134 + y, 1, 5);
        g2d.fillRect(112 + x, 134 + y, 1, 1);
        g2d.fillRect(113 + x, 135 + y, 1, 6);
        g2d.fillRect(112 + x, 136 + y, 1, 2);
        g2d.fillRect(114 + x, 136 + y, 1, 3);
        g2d.fillRect(116 + x, 138 + y, 1, 1);
        g2d.fillRect(115 + x, 139 + y, 1, 1);
        g2d.fillRect(96 + x, 140 + y, 1, 5);
        g2d.fillRect(103 + x, 140 + y, 1, 3);
        g2d.fillRect(99 + x, 141 + y, 1, 3);
        g2d.fillRect(100 + x, 141 + y, 1, 5);
        g2d.fillRect(102 + x, 141 + y, 1, 7);
        g2d.fillRect(116 + x, 141 + y, 1, 2);
        g2d.fillRect(114 + x, 143 + y, 1, 1);
        g2d.fillRect(112 + x, 144 + y, 1, 4);
        g2d.fillRect(95 + x, 145 + y, 1, 1);
        g2d.fillRect(115 + x, 145 + y, 1, 1);
        g2d.fillRect(117 + x, 145 + y, 1, 1);
        g2d.fillRect(94 + x, 146 + y, 1, 3);
        g2d.fillRect(116 + x, 146 + y, 1, 4);
        g2d.fillRect(93 + x, 148 + y, 1, 5);
        g2d.fillRect(96 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 148 + y, 1, 2);
        g2d.fillRect(115 + x, 148 + y, 1, 1);
        g2d.fillRect(95 + x, 149 + y, 1, 3);
        g2d.fillRect(113 + x, 149 + y, 1, 1);
        g2d.fillRect(117 + x, 149 + y, 1, 6);
        g2d.fillRect(101 + x, 150 + y, 1, 2);
        g2d.fillRect(123 + x, 150 + y, 1, 12);
        g2d.fillRect(98 + x, 152 + y, 1, 2);
        g2d.fillRect(114 + x, 152 + y, 1, 2);
        g2d.fillRect(118 + x, 152 + y, 1, 5);
        g2d.fillRect(99 + x, 153 + y, 1, 1);
        g2d.fillRect(91 + x, 154 + y, 1, 3);
        g2d.fillRect(94 + x, 154 + y, 1, 4);
        g2d.fillRect(115 + x, 154 + y, 1, 4);
        g2d.fillRect(119 + x, 154 + y, 1, 4);
        g2d.fillRect(90 + x, 155 + y, 1, 3);
        g2d.fillRect(116 + x, 157 + y, 1, 3);
        g2d.fillRect(113 + x, 158 + y, 1, 2);
        g2d.fillRect(88 + x, 159 + y, 1, 4);
        g2d.fillRect(92 + x, 159 + y, 1, 1);
        g2d.fillRect(120 + x, 159 + y, 1, 1);
        g2d.fillRect(122 + x, 159 + y, 1, 1);
        g2d.fillRect(91 + x, 160 + y, 1, 2);
        g2d.fillRect(114 + x, 160 + y, 1, 2);
        g2d.fillRect(110 + x, 162 + y, 1, 1);
        g2d.fillRect(115 + x, 162 + y, 1, 1);
        g2d.fillRect(122 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 163 + y, 1, 2);
        g2d.fillRect(117 + x, 163 + y, 1, 1);
        g2d.fillRect(108 + x, 164 + y, 1, 1);
        g2d.fillRect(110 + x, 164 + y, 1, 1);
        g2d.fillRect(107 + x, 167 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(119 + x, 122 + y, 1, 2);
        g2d.fillRect(120 + x, 122 + y, 1, 7);
        g2d.fillRect(116 + x, 124 + y, 1, 5);
        g2d.fillRect(103 + x, 125 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 1, 2);
        g2d.fillRect(117 + x, 127 + y, 1, 3);
        g2d.fillRect(119 + x, 128 + y, 1, 2);
        g2d.fillRect(105 + x, 129 + y, 1, 4);
        g2d.fillRect(102 + x, 130 + y, 1, 1);
        g2d.fillRect(103 + x, 133 + y, 1, 7);
        g2d.fillRect(101 + x, 135 + y, 1, 1);
        g2d.fillRect(102 + x, 136 + y, 1, 5);
        g2d.fillRect(98 + x, 138 + y, 1, 3);
        g2d.fillRect(101 + x, 139 + y, 1, 11);
        g2d.fillRect(114 + x, 139 + y, 1, 4);
        g2d.fillRect(116 + x, 139 + y, 1, 1);
        g2d.fillRect(115 + x, 140 + y, 1, 1);
        g2d.fillRect(117 + x, 141 + y, 1, 4);
        g2d.fillRect(115 + x, 143 + y, 1, 2);
        g2d.fillRect(99 + x, 144 + y, 1, 4);
        g2d.fillRect(113 + x, 144 + y, 1, 5);
        g2d.fillRect(96 + x, 145 + y, 1, 3);
        g2d.fillRect(119 + x, 145 + y, 1, 1);
        g2d.fillRect(122 + x, 145 + y, 1, 8);
        g2d.fillRect(95 + x, 146 + y, 1, 3);
        g2d.fillRect(100 + x, 146 + y, 1, 2);
        g2d.fillRect(114 + x, 146 + y, 1, 2);
        g2d.fillRect(118 + x, 146 + y, 1, 6);
        g2d.fillRect(117 + x, 148 + y, 1, 1);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(99 + x, 149 + y, 1, 4);
        g2d.fillRect(114 + x, 149 + y, 1, 3);
        g2d.fillRect(116 + x, 150 + y, 1, 2);
        g2d.fillRect(115 + x, 152 + y, 1, 2);
        g2d.fillRect(94 + x, 153 + y, 1, 1);
        g2d.fillRect(119 + x, 153 + y, 1, 1);
        g2d.fillRect(93 + x, 154 + y, 1, 4);
        g2d.fillRect(116 + x, 155 + y, 1, 2);
        g2d.fillRect(120 + x, 155 + y, 1, 4);
        g2d.fillRect(92 + x, 157 + y, 1, 2);
        g2d.fillRect(122 + x, 157 + y, 1, 2);
        g2d.fillRect(91 + x, 158 + y, 1, 2);
        g2d.fillRect(117 + x, 158 + y, 1, 4);
        g2d.fillRect(89 + x, 159 + y, 1, 3);
        g2d.fillRect(114 + x, 159 + y, 2, 1);
        g2d.fillRect(121 + x, 159 + y, 1, 3);
        g2d.fillRect(116 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 160 + y, 1, 2);
        g2d.fillRect(87 + x, 163 + y, 1, 1);
        g2d.fillRect(89 + x, 163 + y, 1, 1);
        g2d.fillRect(108 + x, 165 + y, 1, 2);
        g2d.fillRect(109 + x, 165 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(118 + x, 123 + y, 1, 23);
        g2d.fillRect(117 + x, 124 + y, 1, 3);
        g2d.fillRect(119 + x, 124 + y, 1, 4);
        g2d.fillRect(104 + x, 125 + y, 1, 5);
        g2d.fillRect(114 + x, 125 + y, 1, 2);
        g2d.fillRect(103 + x, 126 + y, 1, 7);
        g2d.fillRect(115 + x, 127 + y, 1, 4);
        g2d.fillRect(116 + x, 129 + y, 1, 9);
        g2d.fillRect(120 + x, 129 + y, 1, 26);
        g2d.fillRect(117 + x, 130 + y, 1, 11);
        g2d.fillRect(119 + x, 130 + y, 1, 15);
        g2d.fillRect(102 + x, 131 + y, 1, 5);
        g2d.fillRect(101 + x, 136 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 2);
        g2d.fillRect(121 + x, 139 + y, 1, 20);
        g2d.fillRect(98 + x, 141 + y, 1, 11);
        g2d.fillRect(115 + x, 141 + y, 1, 2);
        g2d.fillRect(116 + x, 143 + y, 1, 3);
        g2d.fillRect(117 + x, 146 + y, 1, 2);
        g2d.fillRect(119 + x, 146 + y, 1, 7);
        g2d.fillRect(114 + x, 148 + y, 1, 1);
        g2d.fillRect(115 + x, 149 + y, 1, 3);
        g2d.fillRect(94 + x, 150 + y, 1, 3);
        g2d.fillRect(116 + x, 152 + y, 1, 3);
        g2d.fillRect(93 + x, 153 + y, 1, 1);
        g2d.fillRect(122 + x, 153 + y, 1, 4);
        g2d.fillRect(92 + x, 154 + y, 1, 3);
        g2d.fillRect(117 + x, 155 + y, 1, 3);
        g2d.fillRect(91 + x, 157 + y, 1, 1);
        g2d.fillRect(90 + x, 158 + y, 1, 4);
        g2d.fillRect(118 + x, 158 + y, 1, 6);
        g2d.fillRect(115 + x, 160 + y, 1, 2);
        g2d.fillRect(89 + x, 162 + y, 1, 1);
        g2d.fillRect(116 + x, 162 + y, 2, 1);
        g2d.fillRect(88 + x, 163 + y, 1, 2);
    }





    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(79 + x, 158 + y, 1, 1);
        g2d.fillRect(78 + x, 159 + y, 1, 2);
        g2d.fillRect(77 + x, 161 + y, 1, 1);
        g2d.fillRect(76 + x, 162 + y, 1, 1);
        g2d.fillRect(75 + x, 163 + y, 1, 3);
        g2d.fillRect(76 + x, 166 + y, 1, 1);
        g2d.fillRect(77 + x, 167 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(79 + x, 159 + y, 1, 7);
        g2d.fillRect(80 + x, 159 + y, 1, 5);
        g2d.fillRect(81 + x, 160 + y, 1, 3);
        g2d.fillRect(82 + x, 160 + y, 1, 1);
        g2d.fillRect(78 + x, 161 + y, 1, 6);
        g2d.fillRect(77 + x, 162 + y, 1, 5);
        g2d.fillRect(76 + x, 163 + y, 1, 3);
        g2d.fillRect(125 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(82 + x, 161 + y, 1, 1);
        g2d.fillRect(81 + x, 163 + y, 1, 1);
        g2d.fillRect(129 + x, 163 + y, 1, 1);
        g2d.fillRect(80 + x, 164 + y, 1, 4);
        g2d.fillRect(126 + x, 165 + y, 1, 2);
        g2d.fillRect(127 + x, 165 + y, 1, 1);
        g2d.fillRect(79 + x, 166 + y, 1, 2);
        g2d.fillRect(95 + x, 166 + y, 2, 1);
        g2d.fillRect(122 + x, 166 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(131 + x, 163 + y, 1, 1);
        g2d.fillRect(132 + x, 164 + y, 1, 2);
        g2d.fillRect(79 + x, 168 + y, 1, 2);
        g2d.fillRect(80 + x, 168 + y, 1, 2);
        g2d.fillRect(131 + x, 168 + y, 1, 1);
        g2d.fillRect(81 + x, 170 + y, 4, 1);
        g2d.fillRect(129 + x, 170 + y, 1, 1);
        g2d.fillRect(85 + x, 171 + y, 6, 1);
        g2d.fillRect(125 + x, 171 + y, 3, 1);
        g2d.fillRect(91 + x, 172 + y, 10, 1);
        g2d.fillRect(117 + x, 172 + y, 7, 1);
        g2d.fillRect(101 + x, 173 + y, 16, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(83 + x, 161 + y, 1, 9);
        g2d.fillRect(82 + x, 162 + y, 1, 8);
        g2d.fillRect(84 + x, 162 + y, 1, 1);
        g2d.fillRect(130 + x, 163 + y, 1, 1);
        g2d.fillRect(81 + x, 164 + y, 1, 6);
        g2d.fillRect(91 + x, 165 + y, 2, 1);
        g2d.fillRect(92 + x, 166 + y, 3, 1);
        g2d.fillRect(127 + x, 166 + y, 1, 1);
        g2d.fillRect(84 + x, 167 + y, 1, 3);
        g2d.fillRect(94 + x, 167 + y, 10, 1);
        g2d.fillRect(115 + x, 167 + y, 12, 1);
        g2d.fillRect(96 + x, 168 + y, 1, 2);
        g2d.fillRect(97 + x, 168 + y, 1, 2);
        g2d.fillRect(98 + x, 168 + y, 1, 2);
        g2d.fillRect(99 + x, 168 + y, 1, 2);
        g2d.fillRect(100 + x, 168 + y, 1, 2);
        g2d.fillRect(101 + x, 168 + y, 1, 2);
        g2d.fillRect(119 + x, 168 + y, 1, 2);
        g2d.fillRect(120 + x, 168 + y, 1, 2);
        g2d.fillRect(85 + x, 170 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(85 + x, 162 + y, 1, 8);
        g2d.fillRect(84 + x, 163 + y, 1, 4);
        g2d.fillRect(86 + x, 163 + y, 1, 8);
        g2d.fillRect(90 + x, 165 + y, 1, 1);
        g2d.fillRect(87 + x, 166 + y, 1, 5);
        g2d.fillRect(91 + x, 166 + y, 1, 1);
        g2d.fillRect(109 + x, 166 + y, 1, 2);
        g2d.fillRect(110 + x, 166 + y, 1, 4);
        g2d.fillRect(93 + x, 167 + y, 1, 1);
        g2d.fillRect(104 + x, 167 + y, 1, 3);
        g2d.fillRect(105 + x, 167 + y, 2, 1);
        g2d.fillRect(127 + x, 167 + y, 1, 1);
        g2d.fillRect(88 + x, 168 + y, 1, 3);
        g2d.fillRect(94 + x, 168 + y, 1, 4);
        g2d.fillRect(95 + x, 168 + y, 1, 4);
        g2d.fillRect(102 + x, 168 + y, 1, 5);
        g2d.fillRect(103 + x, 168 + y, 1, 5);
        g2d.fillRect(111 + x, 168 + y, 1, 3);
        g2d.fillRect(124 + x, 168 + y, 1, 2);
        g2d.fillRect(89 + x, 170 + y, 2, 1);
        g2d.fillRect(96 + x, 170 + y, 1, 2);
        g2d.fillRect(97 + x, 170 + y, 1, 2);
        g2d.fillRect(98 + x, 170 + y, 1, 2);
        g2d.fillRect(99 + x, 170 + y, 1, 2);
        g2d.fillRect(100 + x, 170 + y, 1, 2);
        g2d.fillRect(101 + x, 170 + y, 1, 3);
        g2d.fillRect(112 + x, 170 + y, 1, 2);
        g2d.fillRect(91 + x, 171 + y, 3, 1);
        g2d.fillRect(113 + x, 171 + y, 1, 2);
        g2d.fillRect(114 + x, 172 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(87 + x, 164 + y, 1, 2);
        g2d.fillRect(128 + x, 164 + y, 1, 2);
        g2d.fillRect(111 + x, 166 + y, 1, 2);
        g2d.fillRect(88 + x, 167 + y, 1, 1);
        g2d.fillRect(91 + x, 167 + y, 1, 1);
        g2d.fillRect(112 + x, 167 + y, 1, 3);
        g2d.fillRect(113 + x, 167 + y, 2, 1);
        g2d.fillRect(89 + x, 168 + y, 1, 2);
        g2d.fillRect(93 + x, 168 + y, 1, 3);
        g2d.fillRect(105 + x, 168 + y, 1, 3);
        g2d.fillRect(106 + x, 168 + y, 1, 2);
        g2d.fillRect(109 + x, 168 + y, 1, 3);
        g2d.fillRect(121 + x, 168 + y, 1, 2);
        g2d.fillRect(122 + x, 168 + y, 1, 2);
        g2d.fillRect(123 + x, 168 + y, 1, 2);
        g2d.fillRect(125 + x, 168 + y, 1, 2);
        g2d.fillRect(91 + x, 170 + y, 2, 1);
        g2d.fillRect(104 + x, 170 + y, 1, 3);
        g2d.fillRect(110 + x, 170 + y, 1, 2);
        g2d.fillRect(113 + x, 170 + y, 1, 1);
        g2d.fillRect(111 + x, 171 + y, 1, 2);
        g2d.fillRect(114 + x, 171 + y, 1, 1);
        g2d.fillRect(112 + x, 172 + y, 1, 1);
        g2d.fillRect(115 + x, 172 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(87 + x, 163 + y, 1, 1);
        g2d.fillRect(88 + x, 164 + y, 1, 3);
        g2d.fillRect(129 + x, 164 + y, 1, 3);
        g2d.fillRect(130 + x, 164 + y, 1, 3);
        g2d.fillRect(131 + x, 164 + y, 1, 2);
        g2d.fillRect(89 + x, 166 + y, 1, 2);
        g2d.fillRect(128 + x, 166 + y, 1, 2);
        g2d.fillRect(132 + x, 166 + y, 1, 1);
        g2d.fillRect(92 + x, 167 + y, 1, 3);
        g2d.fillRect(107 + x, 167 + y, 1, 1);
        g2d.fillRect(131 + x, 167 + y, 1, 1);
        g2d.fillRect(90 + x, 168 + y, 1, 2);
        g2d.fillRect(91 + x, 168 + y, 1, 2);
        g2d.fillRect(106 + x, 170 + y, 1, 1);
        g2d.fillRect(108 + x, 170 + y, 1, 1);
        g2d.fillRect(114 + x, 170 + y, 4, 1);
        g2d.fillRect(128 + x, 170 + y, 1, 1);
        g2d.fillRect(105 + x, 171 + y, 1, 2);
        g2d.fillRect(109 + x, 171 + y, 1, 2);
        g2d.fillRect(115 + x, 171 + y, 10, 1);
        g2d.fillRect(110 + x, 172 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(89 + x, 164 + y, 1, 2);
        g2d.fillRect(90 + x, 166 + y, 1, 2);
        g2d.fillRect(108 + x, 166 + y, 1, 4);
        g2d.fillRect(131 + x, 166 + y, 1, 1);
        g2d.fillRect(129 + x, 167 + y, 1, 3);
        g2d.fillRect(130 + x, 167 + y, 1, 3);
        g2d.fillRect(107 + x, 168 + y, 1, 5);
        g2d.fillRect(113 + x, 168 + y, 1, 2);
        g2d.fillRect(114 + x, 168 + y, 1, 2);
        g2d.fillRect(115 + x, 168 + y, 1, 2);
        g2d.fillRect(116 + x, 168 + y, 1, 2);
        g2d.fillRect(117 + x, 168 + y, 1, 2);
        g2d.fillRect(118 + x, 168 + y, 1, 3);
        g2d.fillRect(126 + x, 168 + y, 1, 3);
        g2d.fillRect(127 + x, 168 + y, 1, 3);
        g2d.fillRect(128 + x, 168 + y, 1, 2);
        g2d.fillRect(119 + x, 170 + y, 7, 1);
        g2d.fillRect(106 + x, 171 + y, 1, 2);
        g2d.fillRect(108 + x, 171 + y, 1, 2);
    }





    public void paintBB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(103 + x, 69 + y, 1, 26);
        g2d.fillRect(104 + x, 69 + y, 1, 26);
        g2d.fillRect(105 + x, 69 + y, 1, 26);
        g2d.fillRect(106 + x, 69 + y, 1, 26);
        g2d.fillRect(107 + x, 69 + y, 1, 26);
        g2d.fillRect(108 + x, 69 + y, 1, 26);
        g2d.fillRect(109 + x, 69 + y, 1, 27);
        g2d.fillRect(110 + x, 69 + y, 1, 27);
        g2d.fillRect(111 + x, 69 + y, 1, 27);
        g2d.fillRect(102 + x, 70 + y, 1, 25);
        g2d.fillRect(101 + x, 72 + y, 1, 23);
        g2d.fillRect(100 + x, 74 + y, 1, 21);
        g2d.fillRect(112 + x, 77 + y, 1, 19);
        g2d.fillRect(113 + x, 77 + y, 1, 19);
        g2d.fillRect(114 + x, 77 + y, 1, 19);
        g2d.fillRect(99 + x, 78 + y, 1, 17);
        g2d.fillRect(98 + x, 80 + y, 1, 5);
        g2d.fillRect(115 + x, 84 + y, 1, 12);
        g2d.fillRect(116 + x, 84 + y, 1, 13);
        g2d.fillRect(118 + x, 84 + y, 1, 13);
        g2d.fillRect(119 + x, 84 + y, 1, 13);
        g2d.fillRect(120 + x, 84 + y, 1, 14);
        g2d.fillRect(121 + x, 84 + y, 1, 14);
        g2d.fillRect(97 + x, 85 + y, 1, 4);
        g2d.fillRect(96 + x, 89 + y, 1, 3);
        g2d.fillRect(95 + x, 92 + y, 1, 2);
        g2d.fillRect(94 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(98 + x, 85 + y, 1, 9);
        g2d.fillRect(97 + x, 89 + y, 1, 6);
        g2d.fillRect(96 + x, 92 + y, 1, 3);
        g2d.fillRect(125 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 94 + y, 1, 1);
        g2d.fillRect(124 + x, 94 + y, 1, 1);
        g2d.fillRect(123 + x, 95 + y, 1, 1);
        g2d.fillRect(122 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(122 + x, 89 + y, 1, 3);
        g2d.fillRect(125 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(122 + x, 86 + y, 1, 3);
        g2d.fillRect(123 + x, 89 + y, 1, 3);
        g2d.fillRect(124 + x, 91 + y, 1, 2);
        g2d.fillRect(122 + x, 92 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 84 + y, 1, 2);
        g2d.fillRect(123 + x, 88 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 1, 1);
        g2d.fillRect(125 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(123 + x, 86 + y, 1, 2);
        g2d.fillRect(124 + x, 87 + y, 1, 3);
        g2d.fillRect(125 + x, 90 + y, 1, 2);
        g2d.fillRect(126 + x, 91 + y, 1, 2);
        g2d.fillRect(123 + x, 92 + y, 1, 3);
    }





    public void paintBB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(94 + x, 94 + y, 1, 2);
        g2d.fillRect(98 + x, 94 + y, 1, 72);
        g2d.fillRect(99 + x, 94 + y, 1, 72);
        g2d.fillRect(100 + x, 94 + y, 1, 72);
        g2d.fillRect(101 + x, 94 + y, 1, 72);
        g2d.fillRect(102 + x, 94 + y, 1, 72);
        g2d.fillRect(103 + x, 94 + y, 1, 72);
        g2d.fillRect(104 + x, 94 + y, 1, 72);
        g2d.fillRect(105 + x, 94 + y, 1, 72);
        g2d.fillRect(106 + x, 94 + y, 1, 72);
        g2d.fillRect(107 + x, 94 + y, 1, 72);
        g2d.fillRect(108 + x, 94 + y, 1, 72);
        g2d.fillRect(109 + x, 95 + y, 1, 71);
        g2d.fillRect(110 + x, 95 + y, 1, 51);
        g2d.fillRect(111 + x, 95 + y, 1, 46);
        g2d.fillRect(112 + x, 95 + y, 1, 44);
        g2d.fillRect(113 + x, 95 + y, 1, 41);
        g2d.fillRect(114 + x, 95 + y, 1, 39);
        g2d.fillRect(115 + x, 95 + y, 1, 38);
        g2d.fillRect(93 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 35);
        g2d.fillRect(118 + x, 96 + y, 1, 32);
        g2d.fillRect(119 + x, 96 + y, 1, 31);
        g2d.fillRect(92 + x, 97 + y, 1, 3);
        g2d.fillRect(120 + x, 97 + y, 1, 29);
        g2d.fillRect(121 + x, 97 + y, 1, 27);
        g2d.fillRect(91 + x, 100 + y, 1, 1);
        g2d.fillRect(90 + x, 101 + y, 1, 1);
        g2d.fillRect(89 + x, 102 + y, 1, 1);
        g2d.fillRect(88 + x, 103 + y, 1, 2);
        g2d.fillRect(87 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 61);
        g2d.fillRect(85 + x, 106 + y, 2, 1);
        g2d.fillRect(84 + x, 107 + y, 1, 1);
        g2d.fillRect(83 + x, 108 + y, 1, 2);
        g2d.fillRect(96 + x, 112 + y, 1, 54);
        g2d.fillRect(88 + x, 114 + y, 1, 1);
        g2d.fillRect(87 + x, 115 + y, 1, 1);
        g2d.fillRect(89 + x, 115 + y, 1, 1);
        g2d.fillRect(86 + x, 116 + y, 1, 2);
        g2d.fillRect(90 + x, 116 + y, 1, 4);
        g2d.fillRect(95 + x, 117 + y, 1, 49);
        g2d.fillRect(91 + x, 120 + y, 1, 6);
        g2d.fillRect(124 + x, 120 + y, 1, 1);
        g2d.fillRect(123 + x, 121 + y, 1, 1);
        g2d.fillRect(94 + x, 122 + y, 1, 44);
        g2d.fillRect(117 + x, 122 + y, 1, 8);
        g2d.fillRect(92 + x, 126 + y, 2, 1);
        g2d.fillRect(93 + x, 127 + y, 1, 39);
        g2d.fillRect(92 + x, 131 + y, 1, 1);
        g2d.fillRect(92 + x, 144 + y, 1, 22);
        g2d.fillRect(91 + x, 148 + y, 1, 18);
        g2d.fillRect(90 + x, 151 + y, 1, 15);
        g2d.fillRect(110 + x, 158 + y, 1, 8);
        g2d.fillRect(89 + x, 160 + y, 1, 6);
        g2d.fillRect(111 + x, 163 + y, 1, 3);
        g2d.fillRect(88 + x, 165 + y, 1, 1);
        g2d.fillRect(112 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(95 + x, 94 + y, 1, 11);
        g2d.fillRect(96 + x, 94 + y, 1, 18);
        g2d.fillRect(97 + x, 94 + y, 1, 11);
        g2d.fillRect(94 + x, 96 + y, 1, 4);
        g2d.fillRect(93 + x, 97 + y, 1, 3);
        g2d.fillRect(122 + x, 98 + y, 1, 19);
        g2d.fillRect(92 + x, 100 + y, 1, 1);
        g2d.fillRect(91 + x, 101 + y, 1, 1);
        g2d.fillRect(90 + x, 102 + y, 1, 1);
        g2d.fillRect(94 + x, 102 + y, 1, 4);
        g2d.fillRect(123 + x, 102 + y, 1, 10);
        g2d.fillRect(89 + x, 103 + y, 1, 2);
        g2d.fillRect(88 + x, 105 + y, 1, 1);
        g2d.fillRect(93 + x, 105 + y, 1, 3);
        g2d.fillRect(87 + x, 106 + y, 1, 1);
        g2d.fillRect(124 + x, 106 + y, 1, 2);
        g2d.fillRect(85 + x, 107 + y, 2, 1);
        g2d.fillRect(84 + x, 108 + y, 1, 2);
        g2d.fillRect(92 + x, 108 + y, 1, 3);
        g2d.fillRect(95 + x, 108 + y, 1, 9);
        g2d.fillRect(83 + x, 110 + y, 1, 1);
        g2d.fillRect(84 + x, 111 + y, 1, 1);
        g2d.fillRect(85 + x, 112 + y, 2, 1);
        g2d.fillRect(86 + x, 113 + y, 1, 1);
        g2d.fillRect(87 + x, 114 + y, 1, 1);
        g2d.fillRect(129 + x, 114 + y, 1, 1);
        g2d.fillRect(88 + x, 115 + y, 1, 6);
        g2d.fillRect(87 + x, 116 + y, 1, 4);
        g2d.fillRect(89 + x, 116 + y, 1, 7);
        g2d.fillRect(94 + x, 116 + y, 1, 6);
        g2d.fillRect(127 + x, 118 + y, 2, 1);
        g2d.fillRect(90 + x, 120 + y, 1, 5);
        g2d.fillRect(124 + x, 121 + y, 1, 2);
        g2d.fillRect(122 + x, 122 + y, 1, 3);
        g2d.fillRect(123 + x, 122 + y, 1, 2);
        g2d.fillRect(121 + x, 124 + y, 1, 1);
        g2d.fillRect(91 + x, 126 + y, 1, 2);
        g2d.fillRect(92 + x, 127 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(93 + x, 100 + y, 2, 1);
        g2d.fillRect(94 + x, 101 + y, 1, 1);
        g2d.fillRect(91 + x, 102 + y, 1, 1);
        g2d.fillRect(93 + x, 102 + y, 1, 3);
        g2d.fillRect(90 + x, 103 + y, 1, 2);
        g2d.fillRect(124 + x, 104 + y, 1, 2);
        g2d.fillRect(89 + x, 105 + y, 1, 1);
        g2d.fillRect(95 + x, 105 + y, 1, 3);
        g2d.fillRect(88 + x, 106 + y, 1, 1);
        g2d.fillRect(92 + x, 106 + y, 1, 2);
        g2d.fillRect(94 + x, 106 + y, 1, 2);
        g2d.fillRect(87 + x, 107 + y, 1, 1);
        g2d.fillRect(85 + x, 108 + y, 1, 2);
        g2d.fillRect(86 + x, 108 + y, 1, 2);
        g2d.fillRect(93 + x, 108 + y, 1, 2);
        g2d.fillRect(124 + x, 108 + y, 1, 7);
        g2d.fillRect(84 + x, 110 + y, 1, 1);
        g2d.fillRect(91 + x, 110 + y, 1, 4);
        g2d.fillRect(92 + x, 111 + y, 1, 1);
        g2d.fillRect(90 + x, 112 + y, 1, 2);
        g2d.fillRect(123 + x, 112 + y, 1, 5);
        g2d.fillRect(122 + x, 117 + y, 1, 2);
        g2d.fillRect(93 + x, 125 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(92 + x, 101 + y, 1, 5);
        g2d.fillRect(93 + x, 101 + y, 1, 1);
        g2d.fillRect(91 + x, 103 + y, 1, 7);
        g2d.fillRect(90 + x, 105 + y, 1, 2);
        g2d.fillRect(89 + x, 106 + y, 1, 1);
        g2d.fillRect(88 + x, 107 + y, 1, 1);
        g2d.fillRect(125 + x, 107 + y, 1, 10);
        g2d.fillRect(87 + x, 108 + y, 1, 2);
        g2d.fillRect(90 + x, 108 + y, 1, 4);
        g2d.fillRect(94 + x, 108 + y, 1, 8);
        g2d.fillRect(85 + x, 110 + y, 1, 2);
        g2d.fillRect(86 + x, 110 + y, 1, 1);
        g2d.fillRect(93 + x, 110 + y, 1, 4);
        g2d.fillRect(89 + x, 112 + y, 1, 3);
        g2d.fillRect(92 + x, 112 + y, 1, 3);
        g2d.fillRect(90 + x, 114 + y, 2, 1);
        g2d.fillRect(93 + x, 115 + y, 1, 10);
        g2d.fillRect(124 + x, 115 + y, 1, 2);
        g2d.fillRect(126 + x, 116 + y, 1, 2);
        g2d.fillRect(123 + x, 117 + y, 1, 3);
        g2d.fillRect(127 + x, 117 + y, 1, 1);
        g2d.fillRect(122 + x, 119 + y, 1, 3);
        g2d.fillRect(92 + x, 121 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(89 + x, 107 + y, 1, 3);
        g2d.fillRect(90 + x, 107 + y, 1, 1);
        g2d.fillRect(88 + x, 108 + y, 1, 2);
        g2d.fillRect(126 + x, 109 + y, 1, 7);
        g2d.fillRect(87 + x, 110 + y, 1, 1);
        g2d.fillRect(86 + x, 111 + y, 1, 1);
        g2d.fillRect(89 + x, 111 + y, 1, 1);
        g2d.fillRect(88 + x, 112 + y, 1, 2);
        g2d.fillRect(93 + x, 114 + y, 1, 1);
        g2d.fillRect(90 + x, 115 + y, 2, 1);
        g2d.fillRect(127 + x, 115 + y, 1, 2);
        g2d.fillRect(124 + x, 117 + y, 1, 1);
        g2d.fillRect(128 + x, 117 + y, 1, 1);
        g2d.fillRect(126 + x, 118 + y, 1, 1);
        g2d.fillRect(92 + x, 119 + y, 1, 2);
        g2d.fillRect(123 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(88 + x, 110 + y, 1, 2);
        g2d.fillRect(89 + x, 110 + y, 1, 1);
        g2d.fillRect(87 + x, 111 + y, 1, 3);
        g2d.fillRect(127 + x, 111 + y, 1, 4);
        g2d.fillRect(128 + x, 112 + y, 1, 5);
        g2d.fillRect(92 + x, 115 + y, 1, 4);
        g2d.fillRect(129 + x, 115 + y, 1, 3);
        g2d.fillRect(91 + x, 116 + y, 1, 4);
        g2d.fillRect(125 + x, 117 + y, 1, 2);
        g2d.fillRect(124 + x, 118 + y, 1, 2);
    }





    public void paintBB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(86 + x, 117 + y, 1, 1);
        g2d.fillRect(85 + x, 118 + y, 1, 2);
        g2d.fillRect(84 + x, 120 + y, 1, 1);
        g2d.fillRect(83 + x, 121 + y, 1, 2);
        g2d.fillRect(82 + x, 123 + y, 1, 1);
        g2d.fillRect(81 + x, 124 + y, 1, 1);
        g2d.fillRect(79 + x, 125 + y, 2, 1);
        g2d.fillRect(120 + x, 125 + y, 1, 40);
        g2d.fillRect(78 + x, 126 + y, 1, 2);
        g2d.fillRect(119 + x, 126 + y, 1, 39);
        g2d.fillRect(118 + x, 127 + y, 1, 38);
        g2d.fillRect(76 + x, 128 + y, 2, 1);
        g2d.fillRect(121 + x, 128 + y, 1, 37);
        g2d.fillRect(74 + x, 129 + y, 2, 1);
        g2d.fillRect(117 + x, 129 + y, 1, 36);
        g2d.fillRect(73 + x, 130 + y, 1, 3);
        g2d.fillRect(116 + x, 130 + y, 1, 35);
        g2d.fillRect(92 + x, 131 + y, 1, 12);
        g2d.fillRect(115 + x, 132 + y, 1, 33);
        g2d.fillRect(74 + x, 133 + y, 1, 1);
        g2d.fillRect(114 + x, 133 + y, 1, 32);
        g2d.fillRect(75 + x, 134 + y, 3, 1);
        g2d.fillRect(91 + x, 134 + y, 1, 13);
        g2d.fillRect(78 + x, 135 + y, 1, 3);
        g2d.fillRect(79 + x, 135 + y, 1, 2);
        g2d.fillRect(80 + x, 135 + y, 1, 2);
        g2d.fillRect(113 + x, 135 + y, 1, 30);
        g2d.fillRect(81 + x, 137 + y, 2, 1);
        g2d.fillRect(77 + x, 138 + y, 1, 1);
        g2d.fillRect(83 + x, 138 + y, 1, 4);
        g2d.fillRect(90 + x, 138 + y, 1, 12);
        g2d.fillRect(112 + x, 138 + y, 1, 26);
        g2d.fillRect(122 + x, 138 + y, 1, 18);
        g2d.fillRect(126 + x, 139 + y, 2, 1);
        g2d.fillRect(89 + x, 140 + y, 1, 19);
        g2d.fillRect(111 + x, 140 + y, 1, 22);
        g2d.fillRect(125 + x, 140 + y, 1, 3);
        g2d.fillRect(84 + x, 142 + y, 1, 5);
        g2d.fillRect(88 + x, 143 + y, 1, 21);
        g2d.fillRect(124 + x, 143 + y, 1, 2);
        g2d.fillRect(123 + x, 144 + y, 1, 8);
        g2d.fillRect(87 + x, 145 + y, 1, 20);
        g2d.fillRect(110 + x, 145 + y, 1, 12);
        g2d.fillRect(85 + x, 147 + y, 2, 1);
        g2d.fillRect(86 + x, 148 + y, 1, 8);
        g2d.fillRect(85 + x, 149 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(86 + x, 118 + y, 1, 2);
        g2d.fillRect(87 + x, 119 + y, 1, 10);
        g2d.fillRect(85 + x, 120 + y, 1, 1);
        g2d.fillRect(88 + x, 120 + y, 1, 5);
        g2d.fillRect(84 + x, 121 + y, 1, 2);
        g2d.fillRect(89 + x, 122 + y, 1, 2);
        g2d.fillRect(124 + x, 122 + y, 1, 2);
        g2d.fillRect(83 + x, 123 + y, 1, 1);
        g2d.fillRect(123 + x, 123 + y, 1, 9);
        g2d.fillRect(82 + x, 124 + y, 1, 1);
        g2d.fillRect(90 + x, 124 + y, 1, 2);
        g2d.fillRect(121 + x, 124 + y, 1, 4);
        g2d.fillRect(122 + x, 124 + y, 1, 14);
        g2d.fillRect(81 + x, 125 + y, 1, 1);
        g2d.fillRect(86 + x, 125 + y, 1, 5);
        g2d.fillRect(79 + x, 126 + y, 1, 3);
        g2d.fillRect(80 + x, 126 + y, 1, 2);
        g2d.fillRect(91 + x, 127 + y, 1, 1);
        g2d.fillRect(78 + x, 128 + y, 1, 2);
        g2d.fillRect(76 + x, 129 + y, 1, 3);
        g2d.fillRect(77 + x, 129 + y, 1, 1);
        g2d.fillRect(85 + x, 129 + y, 1, 3);
        g2d.fillRect(74 + x, 130 + y, 1, 3);
        g2d.fillRect(75 + x, 130 + y, 1, 3);
        g2d.fillRect(91 + x, 130 + y, 1, 4);
        g2d.fillRect(124 + x, 130 + y, 1, 2);
        g2d.fillRect(90 + x, 133 + y, 1, 5);
        g2d.fillRect(79 + x, 137 + y, 1, 2);
        g2d.fillRect(80 + x, 137 + y, 1, 2);
        g2d.fillRect(89 + x, 137 + y, 1, 3);
        g2d.fillRect(78 + x, 138 + y, 1, 1);
        g2d.fillRect(81 + x, 138 + y, 1, 3);
        g2d.fillRect(82 + x, 138 + y, 1, 8);
        g2d.fillRect(128 + x, 138 + y, 1, 3);
        g2d.fillRect(129 + x, 138 + y, 2, 1);
        g2d.fillRect(88 + x, 139 + y, 1, 4);
        g2d.fillRect(126 + x, 140 + y, 1, 3);
        g2d.fillRect(127 + x, 140 + y, 1, 2);
        g2d.fillRect(83 + x, 142 + y, 1, 5);
        g2d.fillRect(87 + x, 143 + y, 1, 2);
        g2d.fillRect(125 + x, 143 + y, 1, 4);
        g2d.fillRect(86 + x, 145 + y, 1, 2);
        g2d.fillRect(124 + x, 145 + y, 1, 4);
        g2d.fillRect(84 + x, 147 + y, 1, 3);
        g2d.fillRect(85 + x, 148 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(86 + x, 120 + y, 1, 5);
        g2d.fillRect(85 + x, 121 + y, 1, 2);
        g2d.fillRect(84 + x, 123 + y, 1, 1);
        g2d.fillRect(83 + x, 124 + y, 1, 2);
        g2d.fillRect(89 + x, 124 + y, 1, 2);
        g2d.fillRect(124 + x, 124 + y, 1, 6);
        g2d.fillRect(82 + x, 125 + y, 1, 3);
        g2d.fillRect(88 + x, 125 + y, 1, 4);
        g2d.fillRect(81 + x, 126 + y, 1, 3);
        g2d.fillRect(90 + x, 126 + y, 1, 2);
        g2d.fillRect(80 + x, 128 + y, 1, 2);
        g2d.fillRect(85 + x, 128 + y, 1, 1);
        g2d.fillRect(91 + x, 128 + y, 1, 2);
        g2d.fillRect(79 + x, 129 + y, 1, 1);
        g2d.fillRect(87 + x, 129 + y, 1, 1);
        g2d.fillRect(77 + x, 130 + y, 1, 2);
        g2d.fillRect(78 + x, 130 + y, 1, 2);
        g2d.fillRect(86 + x, 130 + y, 1, 2);
        g2d.fillRect(85 + x, 132 + y, 1, 1);
        g2d.fillRect(123 + x, 132 + y, 1, 12);
        g2d.fillRect(124 + x, 132 + y, 1, 2);
        g2d.fillRect(125 + x, 133 + y, 1, 2);
        g2d.fillRect(89 + x, 135 + y, 1, 2);
        g2d.fillRect(129 + x, 140 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(85 + x, 123 + y, 1, 5);
        g2d.fillRect(125 + x, 123 + y, 1, 10);
        g2d.fillRect(84 + x, 124 + y, 1, 2);
        g2d.fillRect(83 + x, 126 + y, 1, 2);
        g2d.fillRect(89 + x, 126 + y, 1, 4);
        g2d.fillRect(82 + x, 128 + y, 1, 1);
        g2d.fillRect(84 + x, 128 + y, 1, 7);
        g2d.fillRect(90 + x, 128 + y, 1, 5);
        g2d.fillRect(81 + x, 129 + y, 1, 1);
        g2d.fillRect(88 + x, 129 + y, 1, 3);
        g2d.fillRect(79 + x, 130 + y, 1, 3);
        g2d.fillRect(80 + x, 130 + y, 1, 2);
        g2d.fillRect(87 + x, 130 + y, 1, 3);
        g2d.fillRect(76 + x, 132 + y, 1, 2);
        g2d.fillRect(77 + x, 132 + y, 2, 1);
        g2d.fillRect(86 + x, 132 + y, 1, 1);
        g2d.fillRect(75 + x, 133 + y, 1, 1);
        g2d.fillRect(83 + x, 133 + y, 1, 4);
        g2d.fillRect(85 + x, 133 + y, 1, 1);
        g2d.fillRect(89 + x, 133 + y, 1, 2);
        g2d.fillRect(126 + x, 133 + y, 1, 6);
        g2d.fillRect(88 + x, 134 + y, 1, 5);
        g2d.fillRect(124 + x, 134 + y, 1, 8);
        g2d.fillRect(82 + x, 135 + y, 1, 2);
        g2d.fillRect(125 + x, 135 + y, 1, 3);
        g2d.fillRect(87 + x, 138 + y, 1, 5);
        g2d.fillRect(127 + x, 138 + y, 1, 1);
        g2d.fillRect(86 + x, 140 + y, 1, 5);
        g2d.fillRect(85 + x, 143 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(126 + x, 125 + y, 1, 8);
        g2d.fillRect(84 + x, 126 + y, 1, 2);
        g2d.fillRect(83 + x, 128 + y, 1, 5);
        g2d.fillRect(82 + x, 129 + y, 1, 3);
        g2d.fillRect(81 + x, 130 + y, 1, 3);
        g2d.fillRect(89 + x, 130 + y, 1, 3);
        g2d.fillRect(127 + x, 130 + y, 1, 8);
        g2d.fillRect(80 + x, 132 + y, 1, 1);
        g2d.fillRect(88 + x, 132 + y, 1, 2);
        g2d.fillRect(77 + x, 133 + y, 2, 1);
        g2d.fillRect(82 + x, 133 + y, 1, 2);
        g2d.fillRect(86 + x, 133 + y, 1, 2);
        g2d.fillRect(87 + x, 133 + y, 1, 1);
        g2d.fillRect(81 + x, 134 + y, 1, 3);
        g2d.fillRect(85 + x, 134 + y, 1, 1);
        g2d.fillRect(128 + x, 134 + y, 1, 4);
        g2d.fillRect(84 + x, 135 + y, 1, 2);
        g2d.fillRect(83 + x, 137 + y, 1, 1);
        g2d.fillRect(87 + x, 137 + y, 1, 1);
        g2d.fillRect(86 + x, 138 + y, 1, 2);
        g2d.fillRect(85 + x, 140 + y, 1, 3);
        g2d.fillRect(124 + x, 142 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(127 + x, 126 + y, 1, 4);
        g2d.fillRect(128 + x, 128 + y, 1, 6);
        g2d.fillRect(129 + x, 129 + y, 1, 9);
        g2d.fillRect(130 + x, 130 + y, 1, 8);
        g2d.fillRect(82 + x, 132 + y, 1, 1);
        g2d.fillRect(79 + x, 133 + y, 1, 2);
        g2d.fillRect(80 + x, 133 + y, 1, 2);
        g2d.fillRect(81 + x, 133 + y, 1, 1);
        g2d.fillRect(131 + x, 133 + y, 1, 5);
        g2d.fillRect(78 + x, 134 + y, 1, 1);
        g2d.fillRect(87 + x, 134 + y, 1, 3);
        g2d.fillRect(85 + x, 135 + y, 1, 5);
        g2d.fillRect(86 + x, 135 + y, 1, 3);
        g2d.fillRect(84 + x, 137 + y, 1, 5);
        g2d.fillRect(125 + x, 138 + y, 1, 2);
    }





    public void paintBB4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(77 + x, 138 + y, 1, 1);
        g2d.fillRect(76 + x, 139 + y, 1, 2);
        g2d.fillRect(75 + x, 141 + y, 1, 1);
        g2d.fillRect(74 + x, 142 + y, 1, 1);
        g2d.fillRect(72 + x, 143 + y, 2, 1);
        g2d.fillRect(71 + x, 144 + y, 1, 2);
        g2d.fillRect(70 + x, 145 + y, 1, 1);
        g2d.fillRect(67 + x, 146 + y, 3, 1);
        g2d.fillRect(62 + x, 147 + y, 5, 1);
        g2d.fillRect(58 + x, 148 + y, 1, 2);
        g2d.fillRect(59 + x, 148 + y, 1, 2);
        g2d.fillRect(60 + x, 148 + y, 1, 2);
        g2d.fillRect(61 + x, 148 + y, 1, 2);
        g2d.fillRect(124 + x, 148 + y, 1, 16);
        g2d.fillRect(57 + x, 150 + y, 1, 1);
        g2d.fillRect(84 + x, 150 + y, 1, 14);
        g2d.fillRect(55 + x, 151 + y, 1, 2);
        g2d.fillRect(56 + x, 151 + y, 1, 2);
        g2d.fillRect(85 + x, 151 + y, 1, 13);
        g2d.fillRect(123 + x, 151 + y, 1, 13);
        g2d.fillRect(125 + x, 151 + y, 1, 13);
        g2d.fillRect(83 + x, 152 + y, 1, 12);
        g2d.fillRect(57 + x, 153 + y, 1, 2);
        g2d.fillRect(82 + x, 153 + y, 1, 11);
        g2d.fillRect(126 + x, 153 + y, 1, 11);
        g2d.fillRect(58 + x, 155 + y, 1, 1);
        g2d.fillRect(81 + x, 155 + y, 1, 9);
        g2d.fillRect(86 + x, 155 + y, 1, 9);
        g2d.fillRect(122 + x, 155 + y, 1, 9);
        g2d.fillRect(80 + x, 156 + y, 1, 8);
        g2d.fillRect(127 + x, 156 + y, 1, 8);
        g2d.fillRect(64 + x, 157 + y, 1, 1);
        g2d.fillRect(79 + x, 157 + y, 1, 7);
        g2d.fillRect(78 + x, 158 + y, 1, 6);
        g2d.fillRect(128 + x, 158 + y, 1, 6);
        g2d.fillRect(77 + x, 160 + y, 1, 4);
        g2d.fillRect(129 + x, 160 + y, 1, 4);
        g2d.fillRect(76 + x, 161 + y, 1, 3);
        g2d.fillRect(130 + x, 161 + y, 1, 3);
        g2d.fillRect(140 + x, 161 + y, 2, 1);
        g2d.fillRect(75 + x, 162 + y, 1, 2);
        g2d.fillRect(131 + x, 162 + y, 1, 2);
        g2d.fillRect(138 + x, 162 + y, 1, 1);
        g2d.fillRect(137 + x, 163 + y, 1, 1);
        g2d.fillRect(70 + x, 165 + y, 4, 1);
        g2d.fillRect(133 + x, 165 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(78 + x, 138 + y, 1, 3);
        g2d.fillRect(79 + x, 138 + y, 1, 1);
        g2d.fillRect(77 + x, 139 + y, 1, 3);
        g2d.fillRect(81 + x, 140 + y, 1, 15);
        g2d.fillRect(128 + x, 140 + y, 1, 18);
        g2d.fillRect(76 + x, 141 + y, 1, 2);
        g2d.fillRect(127 + x, 141 + y, 1, 15);
        g2d.fillRect(75 + x, 142 + y, 1, 1);
        g2d.fillRect(126 + x, 142 + y, 1, 11);
        g2d.fillRect(74 + x, 143 + y, 1, 1);
        g2d.fillRect(72 + x, 144 + y, 1, 4);
        g2d.fillRect(73 + x, 144 + y, 1, 3);
        g2d.fillRect(82 + x, 145 + y, 1, 8);
        g2d.fillRect(70 + x, 146 + y, 1, 5);
        g2d.fillRect(71 + x, 146 + y, 1, 4);
        g2d.fillRect(80 + x, 146 + y, 1, 10);
        g2d.fillRect(83 + x, 146 + y, 1, 6);
        g2d.fillRect(125 + x, 146 + y, 1, 5);
        g2d.fillRect(67 + x, 147 + y, 3, 1);
        g2d.fillRect(79 + x, 147 + y, 1, 10);
        g2d.fillRect(134 + x, 147 + y, 1, 1);
        g2d.fillRect(62 + x, 148 + y, 1, 2);
        g2d.fillRect(63 + x, 148 + y, 1, 2);
        g2d.fillRect(64 + x, 148 + y, 1, 2);
        g2d.fillRect(65 + x, 148 + y, 1, 2);
        g2d.fillRect(66 + x, 148 + y, 1, 2);
        g2d.fillRect(136 + x, 148 + y, 1, 2);
        g2d.fillRect(84 + x, 149 + y, 1, 1);
        g2d.fillRect(137 + x, 149 + y, 1, 1);
        g2d.fillRect(58 + x, 150 + y, 1, 2);
        g2d.fillRect(59 + x, 150 + y, 3, 1);
        g2d.fillRect(69 + x, 150 + y, 1, 2);
        g2d.fillRect(138 + x, 150 + y, 2, 1);
        g2d.fillRect(57 + x, 151 + y, 1, 1);
        g2d.fillRect(68 + x, 151 + y, 1, 2);
        g2d.fillRect(78 + x, 151 + y, 1, 7);
        g2d.fillRect(141 + x, 151 + y, 1, 1);
        g2d.fillRect(67 + x, 152 + y, 1, 1);
        g2d.fillRect(133 + x, 152 + y, 1, 4);
        g2d.fillRect(134 + x, 152 + y, 1, 3);
        g2d.fillRect(129 + x, 153 + y, 1, 7);
        g2d.fillRect(132 + x, 153 + y, 1, 3);
        g2d.fillRect(144 + x, 154 + y, 1, 1);
        g2d.fillRect(77 + x, 155 + y, 1, 5);
        g2d.fillRect(130 + x, 155 + y, 1, 3);
        g2d.fillRect(131 + x, 155 + y, 1, 2);
        g2d.fillRect(59 + x, 156 + y, 3, 1);
        g2d.fillRect(62 + x, 157 + y, 2, 1);
        g2d.fillRect(76 + x, 157 + y, 1, 4);
        g2d.fillRect(65 + x, 158 + y, 1, 2);
        g2d.fillRect(75 + x, 158 + y, 1, 3);
        g2d.fillRect(66 + x, 160 + y, 1, 2);
        g2d.fillRect(74 + x, 160 + y, 1, 5);
        g2d.fillRect(137 + x, 161 + y, 3, 1);
        g2d.fillRect(142 + x, 161 + y, 1, 1);
        g2d.fillRect(67 + x, 162 + y, 1, 1);
        g2d.fillRect(68 + x, 163 + y, 1, 2);
        g2d.fillRect(69 + x, 163 + y, 1, 2);
        g2d.fillRect(73 + x, 163 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(80 + x, 138 + y, 1, 8);
        g2d.fillRect(79 + x, 139 + y, 1, 8);
        g2d.fillRect(129 + x, 140 + y, 1, 13);
        g2d.fillRect(78 + x, 141 + y, 1, 1);
        g2d.fillRect(77 + x, 142 + y, 1, 1);
        g2d.fillRect(130 + x, 142 + y, 1, 4);
        g2d.fillRect(75 + x, 143 + y, 1, 3);
        g2d.fillRect(76 + x, 143 + y, 1, 1);
        g2d.fillRect(74 + x, 144 + y, 1, 3);
        g2d.fillRect(73 + x, 147 + y, 1, 1);
        g2d.fillRect(78 + x, 147 + y, 1, 4);
        g2d.fillRect(67 + x, 148 + y, 1, 4);
        g2d.fillRect(68 + x, 148 + y, 1, 3);
        g2d.fillRect(69 + x, 148 + y, 1, 2);
        g2d.fillRect(72 + x, 148 + y, 1, 2);
        g2d.fillRect(62 + x, 150 + y, 1, 2);
        g2d.fillRect(63 + x, 150 + y, 1, 2);
        g2d.fillRect(64 + x, 150 + y, 1, 2);
        g2d.fillRect(65 + x, 150 + y, 1, 2);
        g2d.fillRect(66 + x, 150 + y, 1, 2);
        g2d.fillRect(71 + x, 150 + y, 1, 1);
        g2d.fillRect(77 + x, 150 + y, 1, 5);
        g2d.fillRect(130 + x, 150 + y, 1, 5);
        g2d.fillRect(59 + x, 151 + y, 1, 2);
        g2d.fillRect(60 + x, 151 + y, 2, 1);
        g2d.fillRect(70 + x, 151 + y, 1, 1);
        g2d.fillRect(57 + x, 152 + y, 2, 1);
        g2d.fillRect(69 + x, 152 + y, 1, 1);
        g2d.fillRect(76 + x, 152 + y, 1, 5);
        g2d.fillRect(131 + x, 152 + y, 1, 3);
        g2d.fillRect(132 + x, 152 + y, 1, 1);
        g2d.fillRect(135 + x, 152 + y, 1, 3);
        g2d.fillRect(136 + x, 152 + y, 1, 3);
        g2d.fillRect(137 + x, 152 + y, 1, 1);
        g2d.fillRect(66 + x, 153 + y, 1, 3);
        g2d.fillRect(67 + x, 153 + y, 1, 2);
        g2d.fillRect(65 + x, 155 + y, 1, 1);
        g2d.fillRect(75 + x, 155 + y, 1, 3);
        g2d.fillRect(134 + x, 155 + y, 1, 1);
        g2d.fillRect(64 + x, 156 + y, 1, 1);
        g2d.fillRect(74 + x, 156 + y, 1, 4);
        g2d.fillRect(132 + x, 156 + y, 1, 2);
        g2d.fillRect(133 + x, 156 + y, 1, 1);
        g2d.fillRect(131 + x, 157 + y, 1, 5);
        g2d.fillRect(73 + x, 158 + y, 1, 5);
        g2d.fillRect(130 + x, 158 + y, 1, 3);
        g2d.fillRect(72 + x, 160 + y, 1, 5);
        g2d.fillRect(137 + x, 160 + y, 4, 1);
        g2d.fillRect(75 + x, 161 + y, 1, 1);
        g2d.fillRect(71 + x, 162 + y, 1, 3);
        g2d.fillRect(132 + x, 162 + y, 1, 1);
        g2d.fillRect(137 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(78 + x, 142 + y, 1, 5);
        g2d.fillRect(77 + x, 143 + y, 1, 7);
        g2d.fillRect(76 + x, 144 + y, 1, 2);
        g2d.fillRect(131 + x, 144 + y, 1, 3);
        g2d.fillRect(75 + x, 146 + y, 1, 1);
        g2d.fillRect(130 + x, 146 + y, 1, 4);
        g2d.fillRect(74 + x, 147 + y, 1, 1);
        g2d.fillRect(76 + x, 147 + y, 1, 5);
        g2d.fillRect(73 + x, 148 + y, 1, 2);
        g2d.fillRect(72 + x, 150 + y, 1, 1);
        g2d.fillRect(75 + x, 150 + y, 1, 5);
        g2d.fillRect(131 + x, 150 + y, 1, 2);
        g2d.fillRect(132 + x, 150 + y, 1, 2);
        g2d.fillRect(133 + x, 150 + y, 1, 2);
        g2d.fillRect(134 + x, 150 + y, 1, 2);
        g2d.fillRect(135 + x, 150 + y, 1, 2);
        g2d.fillRect(136 + x, 150 + y, 1, 2);
        g2d.fillRect(71 + x, 151 + y, 1, 1);
        g2d.fillRect(137 + x, 151 + y, 2, 1);
        g2d.fillRect(60 + x, 152 + y, 1, 3);
        g2d.fillRect(61 + x, 152 + y, 1, 3);
        g2d.fillRect(62 + x, 152 + y, 5, 1);
        g2d.fillRect(70 + x, 152 + y, 1, 1);
        g2d.fillRect(74 + x, 152 + y, 1, 4);
        g2d.fillRect(138 + x, 152 + y, 1, 3);
        g2d.fillRect(58 + x, 153 + y, 1, 2);
        g2d.fillRect(59 + x, 153 + y, 1, 2);
        g2d.fillRect(68 + x, 153 + y, 1, 3);
        g2d.fillRect(69 + x, 153 + y, 1, 2);
        g2d.fillRect(73 + x, 153 + y, 1, 5);
        g2d.fillRect(137 + x, 153 + y, 1, 2);
        g2d.fillRect(67 + x, 155 + y, 1, 1);
        g2d.fillRect(135 + x, 155 + y, 1, 2);
        g2d.fillRect(136 + x, 155 + y, 1, 1);
        g2d.fillRect(65 + x, 156 + y, 1, 2);
        g2d.fillRect(66 + x, 156 + y, 1, 1);
        g2d.fillRect(72 + x, 156 + y, 1, 4);
        g2d.fillRect(134 + x, 156 + y, 1, 2);
        g2d.fillRect(133 + x, 157 + y, 1, 8);
        g2d.fillRect(71 + x, 158 + y, 1, 4);
        g2d.fillRect(132 + x, 158 + y, 1, 4);
        g2d.fillRect(70 + x, 161 + y, 1, 4);
        g2d.fillRect(134 + x, 163 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(76 + x, 146 + y, 1, 1);
        g2d.fillRect(132 + x, 146 + y, 1, 2);
        g2d.fillRect(75 + x, 147 + y, 1, 3);
        g2d.fillRect(131 + x, 147 + y, 1, 3);
        g2d.fillRect(133 + x, 147 + y, 1, 1);
        g2d.fillRect(74 + x, 148 + y, 1, 4);
        g2d.fillRect(73 + x, 150 + y, 1, 3);
        g2d.fillRect(137 + x, 150 + y, 1, 1);
        g2d.fillRect(72 + x, 151 + y, 1, 5);
        g2d.fillRect(139 + x, 151 + y, 1, 4);
        g2d.fillRect(140 + x, 151 + y, 1, 4);
        g2d.fillRect(71 + x, 152 + y, 1, 1);
        g2d.fillRect(62 + x, 153 + y, 1, 2);
        g2d.fillRect(63 + x, 153 + y, 1, 2);
        g2d.fillRect(64 + x, 153 + y, 1, 3);
        g2d.fillRect(65 + x, 153 + y, 1, 2);
        g2d.fillRect(70 + x, 153 + y, 1, 3);
        g2d.fillRect(59 + x, 155 + y, 1, 1);
        g2d.fillRect(69 + x, 155 + y, 1, 1);
        g2d.fillRect(137 + x, 155 + y, 2, 1);
        g2d.fillRect(62 + x, 156 + y, 2, 1);
        g2d.fillRect(67 + x, 156 + y, 1, 2);
        g2d.fillRect(68 + x, 156 + y, 1, 1);
        g2d.fillRect(71 + x, 156 + y, 1, 2);
        g2d.fillRect(136 + x, 156 + y, 1, 1);
        g2d.fillRect(66 + x, 157 + y, 1, 1);
        g2d.fillRect(70 + x, 157 + y, 1, 4);
        g2d.fillRect(135 + x, 157 + y, 1, 3);
        g2d.fillRect(134 + x, 158 + y, 1, 5);
        g2d.fillRect(140 + x, 158 + y, 1, 2);
        g2d.fillRect(141 + x, 158 + y, 1, 3);
        g2d.fillRect(142 + x, 158 + y, 1, 3);
        g2d.fillRect(143 + x, 158 + y, 1, 3);
        g2d.fillRect(144 + x, 158 + y, 1, 2);
        g2d.fillRect(69 + x, 160 + y, 1, 3);
        g2d.fillRect(136 + x, 160 + y, 1, 5);
        g2d.fillRect(68 + x, 162 + y, 1, 1);
        g2d.fillRect(135 + x, 163 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(132 + x, 148 + y, 1, 2);
        g2d.fillRect(133 + x, 148 + y, 1, 2);
        g2d.fillRect(134 + x, 148 + y, 1, 2);
        g2d.fillRect(135 + x, 148 + y, 1, 2);
        g2d.fillRect(141 + x, 152 + y, 1, 6);
        g2d.fillRect(142 + x, 152 + y, 1, 6);
        g2d.fillRect(71 + x, 153 + y, 1, 3);
        g2d.fillRect(143 + x, 153 + y, 1, 5);
        g2d.fillRect(60 + x, 155 + y, 4, 1);
        g2d.fillRect(139 + x, 155 + y, 1, 5);
        g2d.fillRect(140 + x, 155 + y, 1, 3);
        g2d.fillRect(144 + x, 155 + y, 1, 3);
        g2d.fillRect(69 + x, 156 + y, 1, 4);
        g2d.fillRect(70 + x, 156 + y, 1, 1);
        g2d.fillRect(137 + x, 156 + y, 1, 4);
        g2d.fillRect(138 + x, 156 + y, 1, 4);
        g2d.fillRect(68 + x, 157 + y, 1, 5);
        g2d.fillRect(136 + x, 157 + y, 1, 3);
        g2d.fillRect(66 + x, 158 + y, 1, 2);
        g2d.fillRect(67 + x, 158 + y, 1, 4);
        g2d.fillRect(135 + x, 160 + y, 1, 3);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 65 + y, 1, 5);
        g2d.fillRect(116 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 5, 1);
        g2d.fillRect(115 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 62 + y, 5, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 5);
        g2d.fillRect(105 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 66 + y, 1, 3);
        g2d.fillRect(107 + x, 67 + y, 2, 1);
        g2d.fillRect(109 + x, 69 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 5, 1);
        g2d.fillRect(105 + x, 64 + y, 3, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 3, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 5);
        g2d.fillRect(107 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 2, 1);
        g2d.fillRect(105 + x, 65 + y, 4, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 60 + y, 6, 1);
        g2d.fillRect(109 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 3);
        g2d.fillRect(111 + x, 63 + y, 2, 1);
        g2d.fillRect(108 + x, 64 + y, 2, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 3);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(111 + x, 61 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 3, 1);
        g2d.fillRect(111 + x, 68 + y, 4, 1);
    }
}
