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
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D33 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D33()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public D33(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public D33(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 5;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        if(prevY == 1)
        {
            paintTL1(x, 0, g2d);
        }
        else if(prevY == -1)
        {
            paintTL3(x, 0, g2d);
        }
        else
        {
            paintTL(x, 0, g2d);
        }
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
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(offsetY == 1)
        {
            paintB1(offsetX, 0, g2d);
        }
        else if(offsetY == -1)
        {
            paintB3(offsetX, 0, g2d);
        }
        else
        {
            paintB2(offsetX, 0, g2d);
        }
        prevY = offsetY;
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
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

    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(109 + x, 59 + y, 3, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 5);
        g2d.fillRect(99 + x, 79 + y, 1, 11);
        g2d.fillRect(100 + x, 79 + y, 1, 13);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(97 + x, 80 + y, 1, 3);
        g2d.fillRect(102 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(108 + x, 82 + y, 1, 10);
        g2d.fillRect(109 + x, 82 + y, 1, 6);
        g2d.fillRect(101 + x, 83 + y, 1, 11);
        g2d.fillRect(98 + x, 85 + y, 1, 4);
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(97 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(107 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(100 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 2, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(107 + x, 101 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(108 + x, 94 + y, 1, 5);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 2, 1);
        g2d.fillRect(106 + x, 100 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(99 + x, 41 + y, 1, 9);
        g2d.fillRect(100 + x, 41 + y, 1, 8);
        g2d.fillRect(101 + x, 41 + y, 1, 7);
        g2d.fillRect(116 + x, 41 + y, 1, 7);
        g2d.fillRect(117 + x, 41 + y, 1, 7);
        g2d.fillRect(102 + x, 42 + y, 1, 6);
        g2d.fillRect(118 + x, 42 + y, 1, 7);
        g2d.fillRect(115 + x, 44 + y, 1, 4);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 6);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 15);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 4);
        g2d.fillRect(111 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 5);
        g2d.fillRect(104 + x, 64 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 12);
        g2d.fillRect(119 + x, 73 + y, 1, 13);
        g2d.fillRect(102 + x, 74 + y, 1, 3);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 4);
        g2d.fillRect(109 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 1, 38);
        g2d.fillRect(111 + x, 79 + y, 1, 35);
        g2d.fillRect(112 + x, 79 + y, 1, 23);
        g2d.fillRect(113 + x, 79 + y, 1, 15);
        g2d.fillRect(114 + x, 79 + y, 1, 6);
        g2d.fillRect(115 + x, 79 + y, 1, 3);
        g2d.fillRect(116 + x, 79 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 6);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 5);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 29);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 98 + y, 1, 13);
        g2d.fillRect(105 + x, 98 + y, 3, 1);
        g2d.fillRect(100 + x, 101 + y, 1, 19);
        g2d.fillRect(106 + x, 101 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 1, 13);
        g2d.fillRect(108 + x, 108 + y, 1, 13);
        g2d.fillRect(98 + x, 110 + y, 1, 7);
        g2d.fillRect(107 + x, 111 + y, 1, 10);
        g2d.fillRect(97 + x, 112 + y, 1, 4);
        g2d.fillRect(106 + x, 114 + y, 1, 7);
        g2d.fillRect(105 + x, 116 + y, 1, 5);
        g2d.fillRect(101 + x, 117 + y, 1, 4);
        g2d.fillRect(102 + x, 118 + y, 1, 3);
        g2d.fillRect(103 + x, 118 + y, 1, 3);
        g2d.fillRect(104 + x, 118 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 59 + y, 1, 5);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 61 + y, 1, 9);
        g2d.fillRect(104 + x, 62 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 9);
        g2d.fillRect(105 + x, 64 + y, 1, 12);
        g2d.fillRect(110 + x, 64 + y, 1, 3);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 11);
        g2d.fillRect(112 + x, 65 + y, 1, 10);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 8);
        g2d.fillRect(111 + x, 68 + y, 1, 6);
        g2d.fillRect(106 + x, 69 + y, 1, 8);
        g2d.fillRect(110 + x, 69 + y, 1, 4);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(104 + x, 71 + y, 1, 5);
        g2d.fillRect(107 + x, 71 + y, 1, 7);
        g2d.fillRect(116 + x, 72 + y, 1, 7);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 6);
        g2d.fillRect(117 + x, 73 + y, 1, 5);
        g2d.fillRect(109 + x, 74 + y, 1, 5);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 4);
        g2d.fillRect(111 + x, 75 + y, 1, 4);
        g2d.fillRect(112 + x, 76 + y, 1, 3);
        g2d.fillRect(113 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 4);
        g2d.fillRect(105 + x, 102 + y, 1, 9);
        g2d.fillRect(107 + x, 102 + y, 1, 9);
        g2d.fillRect(108 + x, 102 + y, 1, 6);
        g2d.fillRect(102 + x, 103 + y, 1, 7);
        g2d.fillRect(104 + x, 106 + y, 1, 12);
        g2d.fillRect(103 + x, 110 + y, 1, 8);
        g2d.fillRect(101 + x, 111 + y, 1, 6);
        g2d.fillRect(106 + x, 111 + y, 1, 3);
        g2d.fillRect(102 + x, 112 + y, 1, 6);
        g2d.fillRect(105 + x, 113 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 3);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 5);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 3);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 3);
        g2d.fillRect(108 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 3, 1);
        g2d.fillRect(104 + x, 76 + y, 2, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 78 + y, 1, 3);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 4);
        g2d.fillRect(106 + x, 102 + y, 1, 9);
        g2d.fillRect(103 + x, 106 + y, 1, 4);
        g2d.fillRect(102 + x, 110 + y, 1, 2);
        g2d.fillRect(105 + x, 111 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3,ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2,ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1,ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2,ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(104 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 3);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 4);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 47 + y, 3, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 4);
        g2d.fillRect(116 + x, 47 + y, 1, 4);
        g2d.fillRect(117 + x, 47 + y, 1, 5);
        g2d.fillRect(100 + x, 48 + y, 1, 6);
        g2d.fillRect(103 + x, 48 + y, 1, 5);
        g2d.fillRect(118 + x, 48 + y, 1, 5);
        g2d.fillRect(99 + x, 49 + y, 1, 9);
        g2d.fillRect(104 + x, 50 + y, 1, 5);
        g2d.fillRect(119 + x, 50 + y, 1, 9);
        g2d.fillRect(114 + x, 51 + y, 1, 9);
        g2d.fillRect(120 + x, 51 + y, 1, 7);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(105 + x, 52 + y, 1, 7);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 55 + y, 1, 5);
        g2d.fillRect(113 + x, 56 + y, 1, 4);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 48 + y, 1, 10);
        g2d.fillRect(102 + x, 48 + y, 1, 11);
        g2d.fillRect(115 + x, 51 + y, 1, 9);
        g2d.fillRect(116 + x, 51 + y, 1, 9);
        g2d.fillRect(117 + x, 52 + y, 1, 7);
        g2d.fillRect(103 + x, 53 + y, 1, 7);
        g2d.fillRect(118 + x, 53 + y, 1, 4);
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 6);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(109 + x, 59 + y, 3, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 5);
        g2d.fillRect(99 + x, 79 + y, 1, 11);
        g2d.fillRect(100 + x, 79 + y, 1, 13);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(97 + x, 80 + y, 1, 3);
        g2d.fillRect(102 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(108 + x, 82 + y, 1, 10);
        g2d.fillRect(109 + x, 82 + y, 1, 6);
        g2d.fillRect(101 + x, 83 + y, 1, 11);
        g2d.fillRect(98 + x, 85 + y, 1, 4);
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(97 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(107 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(100 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 2, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(107 + x, 101 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(108 + x, 94 + y, 1, 5);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 2, 1);
        g2d.fillRect(106 + x, 100 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(99 + x, 41 + y, 1, 9);
        g2d.fillRect(100 + x, 41 + y, 1, 8);
        g2d.fillRect(101 + x, 41 + y, 1, 7);
        g2d.fillRect(116 + x, 41 + y, 1, 7);
        g2d.fillRect(117 + x, 41 + y, 1, 7);
        g2d.fillRect(102 + x, 42 + y, 1, 6);
        g2d.fillRect(118 + x, 42 + y, 1, 7);
        g2d.fillRect(115 + x, 44 + y, 1, 4);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 6);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 15);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 4);
        g2d.fillRect(111 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 5);
        g2d.fillRect(104 + x, 64 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 12);
        g2d.fillRect(119 + x, 73 + y, 1, 13);
        g2d.fillRect(102 + x, 74 + y, 1, 3);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 4);
        g2d.fillRect(109 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 1, 37);
        g2d.fillRect(111 + x, 79 + y, 1, 34);
        g2d.fillRect(112 + x, 79 + y, 1, 23);
        g2d.fillRect(113 + x, 79 + y, 1, 15);
        g2d.fillRect(114 + x, 79 + y, 1, 6);
        g2d.fillRect(115 + x, 79 + y, 1, 3);
        g2d.fillRect(116 + x, 79 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 6);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 5);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 28);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 98 + y, 1, 12);
        g2d.fillRect(105 + x, 98 + y, 3, 1);
        g2d.fillRect(100 + x, 101 + y, 1, 18);
        g2d.fillRect(106 + x, 101 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 1, 12);
        g2d.fillRect(108 + x, 108 + y, 1, 12);
        g2d.fillRect(98 + x, 109 + y, 1, 7);
        g2d.fillRect(107 + x, 110 + y, 1, 10);
        g2d.fillRect(97 + x, 111 + y, 1, 4);
        g2d.fillRect(106 + x, 113 + y, 1, 7);
        g2d.fillRect(105 + x, 115 + y, 1, 5);
        g2d.fillRect(101 + x, 116 + y, 1, 4);
        g2d.fillRect(102 + x, 117 + y, 1, 3);
        g2d.fillRect(103 + x, 117 + y, 1, 3);
        g2d.fillRect(104 + x, 117 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 59 + y, 1, 5);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 61 + y, 1, 9);
        g2d.fillRect(104 + x, 62 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 9);
        g2d.fillRect(105 + x, 64 + y, 1, 12);
        g2d.fillRect(110 + x, 64 + y, 1, 3);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 11);
        g2d.fillRect(112 + x, 65 + y, 1, 10);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 8);
        g2d.fillRect(111 + x, 68 + y, 1, 6);
        g2d.fillRect(106 + x, 69 + y, 1, 8);
        g2d.fillRect(110 + x, 69 + y, 1, 4);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(104 + x, 71 + y, 1, 5);
        g2d.fillRect(107 + x, 71 + y, 1, 7);
        g2d.fillRect(116 + x, 72 + y, 1, 7);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 6);
        g2d.fillRect(117 + x, 73 + y, 1, 5);
        g2d.fillRect(109 + x, 74 + y, 1, 5);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 4);
        g2d.fillRect(111 + x, 75 + y, 1, 4);
        g2d.fillRect(112 + x, 76 + y, 1, 3);
        g2d.fillRect(113 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 4);
        g2d.fillRect(105 + x, 102 + y, 1, 8);
        g2d.fillRect(107 + x, 102 + y, 1, 8);
        g2d.fillRect(108 + x, 102 + y, 1, 6);
        g2d.fillRect(102 + x, 103 + y, 1, 5);
        g2d.fillRect(104 + x, 106 + y, 1, 11);
        g2d.fillRect(103 + x, 109 + y, 1, 8);
        g2d.fillRect(101 + x, 110 + y, 1, 6);
        g2d.fillRect(106 + x, 110 + y, 1, 3);
        g2d.fillRect(102 + x, 111 + y, 1, 6);
        g2d.fillRect(105 + x, 112 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 3);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 5);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 3);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 3);
        g2d.fillRect(108 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 3, 1);
        g2d.fillRect(104 + x, 76 + y, 2, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 78 + y, 1, 3);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 4);
        g2d.fillRect(106 + x, 102 + y, 1, 8);
        g2d.fillRect(103 + x, 106 + y, 1, 3);
        g2d.fillRect(102 + x, 108 + y, 1, 3);
        g2d.fillRect(105 + x, 110 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3,ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2,ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1,ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2,ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(104 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 3);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 4);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(120 + x, 87 + y, 1, 13);
        g2d.fillRect(121 + x, 87 + y, 1, 6);
        g2d.fillRect(122 + x, 87 + y, 1, 9);
        g2d.fillRect(123 + x, 88 + y, 1, 8);
        g2d.fillRect(124 + x, 89 + y, 1, 10);
        g2d.fillRect(125 + x, 90 + y, 1, 11);
        g2d.fillRect(126 + x, 93 + y, 1, 9);
        g2d.fillRect(119 + x, 95 + y, 1, 11);
        g2d.fillRect(127 + x, 95 + y, 1, 9);
        g2d.fillRect(118 + x, 99 + y, 1, 7);
        g2d.fillRect(128 + x, 99 + y, 1, 8);
        g2d.fillRect(129 + x, 101 + y, 1, 7);
        g2d.fillRect(117 + x, 102 + y, 1, 13);
        g2d.fillRect(130 + x, 104 + y, 1, 7);
        g2d.fillRect(131 + x, 106 + y, 1, 8);
        g2d.fillRect(118 + x, 107 + y, 1, 7);
        g2d.fillRect(132 + x, 108 + y, 1, 13);
        g2d.fillRect(119 + x, 110 + y, 1, 4);
        g2d.fillRect(133 + x, 110 + y, 1, 11);
        g2d.fillRect(120 + x, 111 + y, 1, 4);
        g2d.fillRect(121 + x, 112 + y, 1, 4);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(122 + x, 113 + y, 1, 5);
        g2d.fillRect(134 + x, 113 + y, 1, 7);
        g2d.fillRect(123 + x, 114 + y, 1, 5);
        g2d.fillRect(124 + x, 115 + y, 1, 5);
        g2d.fillRect(135 + x, 115 + y, 1, 5);
        g2d.fillRect(125 + x, 116 + y, 1, 5);
        g2d.fillRect(126 + x, 117 + y, 1, 5);
        g2d.fillRect(127 + x, 118 + y, 1, 4);
        g2d.fillRect(131 + x, 118 + y, 1, 4);
        g2d.fillRect(128 + x, 119 + y, 1, 3);
        g2d.fillRect(129 + x, 119 + y, 1, 3);
        g2d.fillRect(130 + x, 119 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(122 + x, 96 + y, 1, 4);
        g2d.fillRect(123 + x, 96 + y, 1, 6);
        g2d.fillRect(124 + x, 99 + y, 1, 4);
        g2d.fillRect(125 + x, 101 + y, 1, 5);
        g2d.fillRect(126 + x, 102 + y, 1, 5);
        g2d.fillRect(121 + x, 104 + y, 1, 4);
        g2d.fillRect(127 + x, 104 + y, 1, 5);
        g2d.fillRect(122 + x, 106 + y, 1, 4);
        g2d.fillRect(123 + x, 107 + y, 1, 5);
        g2d.fillRect(128 + x, 107 + y, 1, 4);
        g2d.fillRect(124 + x, 108 + y, 1, 5);
        g2d.fillRect(129 + x, 108 + y, 1, 5);
        g2d.fillRect(125 + x, 109 + y, 1, 5);
        g2d.fillRect(120 + x, 110 + y, 2, 1);
        g2d.fillRect(121 + x, 111 + y, 1, 1);
        g2d.fillRect(126 + x, 111 + y, 1, 4);
        g2d.fillRect(130 + x, 111 + y, 1, 3);
        g2d.fillRect(122 + x, 112 + y, 1, 1);
        g2d.fillRect(123 + x, 113 + y, 1, 1);
        g2d.fillRect(127 + x, 113 + y, 1, 3);
        g2d.fillRect(124 + x, 114 + y, 1, 1);
        g2d.fillRect(128 + x, 114 + y, 1, 2);
        g2d.fillRect(131 + x, 114 + y, 1, 4);
        g2d.fillRect(125 + x, 115 + y, 1, 1);
        g2d.fillRect(129 + x, 115 + y, 1, 4);
        g2d.fillRect(126 + x, 116 + y, 1, 1);
        g2d.fillRect(130 + x, 116 + y, 1, 3);
        g2d.fillRect(127 + x, 117 + y, 2, 1);
        g2d.fillRect(128 + x, 118 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 93 + y, 1, 11);
        g2d.fillRect(120 + x, 100 + y, 1, 10);
        g2d.fillRect(122 + x, 100 + y, 1, 6);
        g2d.fillRect(123 + x, 102 + y, 1, 5);
        g2d.fillRect(124 + x, 103 + y, 1, 5);
        g2d.fillRect(118 + x, 106 + y, 2, 1);
        g2d.fillRect(125 + x, 106 + y, 1, 3);
        g2d.fillRect(119 + x, 107 + y, 1, 3);
        g2d.fillRect(126 + x, 107 + y, 1, 4);
        g2d.fillRect(121 + x, 108 + y, 1, 2);
        g2d.fillRect(127 + x, 109 + y, 1, 4);
        g2d.fillRect(122 + x, 110 + y, 1, 2);
        g2d.fillRect(128 + x, 111 + y, 1, 3);
        g2d.fillRect(123 + x, 112 + y, 1, 1);
        g2d.fillRect(124 + x, 113 + y, 1, 1);
        g2d.fillRect(129 + x, 113 + y, 1, 2);
        g2d.fillRect(125 + x, 114 + y, 1, 1);
        g2d.fillRect(130 + x, 114 + y, 1, 2);
        g2d.fillRect(126 + x, 115 + y, 1, 1);
        g2d.fillRect(127 + x, 116 + y, 2, 1);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(120 + x, 87 + y, 1, 12);
        g2d.fillRect(121 + x, 87 + y, 1, 5);
        g2d.fillRect(122 + x, 87 + y, 1, 8);
        g2d.fillRect(123 + x, 88 + y, 1, 7);
        g2d.fillRect(124 + x, 88 + y, 1, 10);
        g2d.fillRect(125 + x, 89 + y, 1, 11);
        g2d.fillRect(126 + x, 92 + y, 1, 9);
        g2d.fillRect(119 + x, 94 + y, 1, 10);
        g2d.fillRect(127 + x, 94 + y, 1, 9);
        g2d.fillRect(118 + x, 98 + y, 1, 6);
        g2d.fillRect(128 + x, 98 + y, 1, 7);
        g2d.fillRect(129 + x, 100 + y, 1, 6);
        g2d.fillRect(117 + x, 101 + y, 1, 12);
        g2d.fillRect(130 + x, 103 + y, 1, 6);
        g2d.fillRect(131 + x, 104 + y, 1, 8);
        g2d.fillRect(118 + x, 105 + y, 1, 7);
        g2d.fillRect(132 + x, 106 + y, 1, 13);
        g2d.fillRect(119 + x, 108 + y, 1, 4);
        g2d.fillRect(133 + x, 108 + y, 1, 11);
        g2d.fillRect(120 + x, 109 + y, 1, 4);
        g2d.fillRect(121 + x, 110 + y, 1, 4);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(122 + x, 111 + y, 1, 5);
        g2d.fillRect(134 + x, 111 + y, 1, 7);
        g2d.fillRect(123 + x, 112 + y, 1, 5);
        g2d.fillRect(124 + x, 113 + y, 1, 5);
        g2d.fillRect(135 + x, 113 + y, 1, 5);
        g2d.fillRect(125 + x, 114 + y, 1, 5);
        g2d.fillRect(126 + x, 115 + y, 1, 5);
        g2d.fillRect(127 + x, 116 + y, 1, 4);
        g2d.fillRect(131 + x, 116 + y, 1, 4);
        g2d.fillRect(128 + x, 117 + y, 1, 3);
        g2d.fillRect(129 + x, 117 + y, 1, 3);
        g2d.fillRect(130 + x, 117 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(122 + x, 95 + y, 1, 4);
        g2d.fillRect(123 + x, 95 + y, 1, 6);
        g2d.fillRect(124 + x, 98 + y, 1, 4);
        g2d.fillRect(125 + x, 100 + y, 1, 4);
        g2d.fillRect(126 + x, 101 + y, 1, 4);
        g2d.fillRect(121 + x, 103 + y, 1, 3);
        g2d.fillRect(127 + x, 103 + y, 1, 4);
        g2d.fillRect(122 + x, 104 + y, 1, 4);
        g2d.fillRect(123 + x, 105 + y, 1, 5);
        g2d.fillRect(128 + x, 105 + y, 1, 4);
        g2d.fillRect(124 + x, 106 + y, 1, 5);
        g2d.fillRect(129 + x, 106 + y, 1, 5);
        g2d.fillRect(125 + x, 107 + y, 1, 5);
        g2d.fillRect(120 + x, 108 + y, 2, 1);
        g2d.fillRect(121 + x, 109 + y, 1, 1);
        g2d.fillRect(126 + x, 109 + y, 1, 4);
        g2d.fillRect(130 + x, 109 + y, 1, 3);
        g2d.fillRect(122 + x, 110 + y, 1, 1);
        g2d.fillRect(123 + x, 111 + y, 1, 1);
        g2d.fillRect(127 + x, 111 + y, 1, 3);
        g2d.fillRect(124 + x, 112 + y, 1, 1);
        g2d.fillRect(128 + x, 112 + y, 1, 2);
        g2d.fillRect(131 + x, 112 + y, 1, 4);
        g2d.fillRect(125 + x, 113 + y, 1, 1);
        g2d.fillRect(129 + x, 113 + y, 1, 4);
        g2d.fillRect(126 + x, 114 + y, 1, 1);
        g2d.fillRect(130 + x, 114 + y, 1, 3);
        g2d.fillRect(127 + x, 115 + y, 2, 1);
        g2d.fillRect(128 + x, 116 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 92 + y, 1, 11);
        g2d.fillRect(120 + x, 99 + y, 1, 9);
        g2d.fillRect(122 + x, 99 + y, 1, 5);
        g2d.fillRect(123 + x, 101 + y, 1, 4);
        g2d.fillRect(124 + x, 102 + y, 1, 4);
        g2d.fillRect(118 + x, 104 + y, 2, 1);
        g2d.fillRect(125 + x, 104 + y, 1, 3);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(126 + x, 105 + y, 1, 4);
        g2d.fillRect(121 + x, 106 + y, 1, 2);
        g2d.fillRect(127 + x, 107 + y, 1, 4);
        g2d.fillRect(122 + x, 108 + y, 1, 2);
        g2d.fillRect(128 + x, 109 + y, 1, 3);
        g2d.fillRect(123 + x, 110 + y, 1, 1);
        g2d.fillRect(124 + x, 111 + y, 1, 1);
        g2d.fillRect(129 + x, 111 + y, 1, 2);
        g2d.fillRect(125 + x, 112 + y, 1, 1);
        g2d.fillRect(130 + x, 112 + y, 1, 2);
        g2d.fillRect(126 + x, 113 + y, 1, 1);
        g2d.fillRect(127 + x, 114 + y, 2, 1);
    }





    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(120 + x, 87 + y, 1, 11);
        g2d.fillRect(121 + x, 87 + y, 1, 5);
        g2d.fillRect(122 + x, 87 + y, 1, 8);
        g2d.fillRect(123 + x, 88 + y, 1, 7);
        g2d.fillRect(124 + x, 88 + y, 1, 9);
        g2d.fillRect(125 + x, 89 + y, 1, 10);
        g2d.fillRect(126 + x, 92 + y, 1, 8);
        g2d.fillRect(119 + x, 94 + y, 1, 9);
        g2d.fillRect(127 + x, 94 + y, 1, 8);
        g2d.fillRect(118 + x, 97 + y, 1, 6);
        g2d.fillRect(128 + x, 97 + y, 1, 7);
        g2d.fillRect(129 + x, 99 + y, 1, 6);
        g2d.fillRect(117 + x, 100 + y, 1, 12);
        g2d.fillRect(130 + x, 102 + y, 1, 6);
        g2d.fillRect(131 + x, 103 + y, 1, 8);
        g2d.fillRect(118 + x, 104 + y, 1, 7);
        g2d.fillRect(132 + x, 105 + y, 1, 12);
        g2d.fillRect(119 + x, 107 + y, 1, 4);
        g2d.fillRect(133 + x, 107 + y, 1, 10);
        g2d.fillRect(120 + x, 108 + y, 1, 4);
        g2d.fillRect(121 + x, 109 + y, 1, 4);
        g2d.fillRect(122 + x, 110 + y, 1, 4);
        g2d.fillRect(134 + x, 110 + y, 1, 6);
        g2d.fillRect(123 + x, 111 + y, 1, 4);
        g2d.fillRect(124 + x, 112 + y, 1, 4);
        g2d.fillRect(125 + x, 112 + y, 1, 5);
        g2d.fillRect(135 + x, 112 + y, 1, 4);
        g2d.fillRect(126 + x, 113 + y, 1, 5);
        g2d.fillRect(127 + x, 114 + y, 1, 4);
        g2d.fillRect(131 + x, 114 + y, 1, 4);
        g2d.fillRect(128 + x, 115 + y, 1, 3);
        g2d.fillRect(129 + x, 115 + y, 1, 3);
        g2d.fillRect(130 + x, 115 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(122 + x, 95 + y, 1, 3);
        g2d.fillRect(123 + x, 95 + y, 1, 5);
        g2d.fillRect(124 + x, 97 + y, 1, 4);
        g2d.fillRect(125 + x, 99 + y, 1, 4);
        g2d.fillRect(126 + x, 100 + y, 1, 4);
        g2d.fillRect(121 + x, 102 + y, 1, 3);
        g2d.fillRect(127 + x, 102 + y, 1, 4);
        g2d.fillRect(122 + x, 103 + y, 1, 4);
        g2d.fillRect(123 + x, 104 + y, 1, 5);
        g2d.fillRect(128 + x, 104 + y, 1, 4);
        g2d.fillRect(124 + x, 105 + y, 1, 5);
        g2d.fillRect(129 + x, 105 + y, 1, 5);
        g2d.fillRect(125 + x, 106 + y, 1, 5);
        g2d.fillRect(120 + x, 107 + y, 2, 1);
        g2d.fillRect(121 + x, 108 + y, 1, 1);
        g2d.fillRect(126 + x, 108 + y, 1, 5);
        g2d.fillRect(130 + x, 108 + y, 1, 3);
        g2d.fillRect(122 + x, 109 + y, 1, 1);
        g2d.fillRect(123 + x, 110 + y, 1, 1);
        g2d.fillRect(127 + x, 110 + y, 1, 2);
        g2d.fillRect(124 + x, 111 + y, 1, 1);
        g2d.fillRect(128 + x, 111 + y, 1, 1);
        g2d.fillRect(131 + x, 111 + y, 1, 3);
        g2d.fillRect(129 + x, 112 + y, 1, 3);
        g2d.fillRect(130 + x, 112 + y, 1, 3);
        g2d.fillRect(127 + x, 113 + y, 2, 1);
        g2d.fillRect(128 + x, 114 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(121 + x, 92 + y, 1, 10);
        g2d.fillRect(120 + x, 98 + y, 1, 9);
        g2d.fillRect(122 + x, 98 + y, 1, 5);
        g2d.fillRect(123 + x, 100 + y, 1, 4);
        g2d.fillRect(124 + x, 101 + y, 1, 4);
        g2d.fillRect(118 + x, 103 + y, 2, 1);
        g2d.fillRect(125 + x, 103 + y, 1, 3);
        g2d.fillRect(119 + x, 104 + y, 1, 3);
        g2d.fillRect(126 + x, 104 + y, 1, 4);
        g2d.fillRect(121 + x, 105 + y, 1, 2);
        g2d.fillRect(127 + x, 106 + y, 1, 4);
        g2d.fillRect(122 + x, 107 + y, 1, 2);
        g2d.fillRect(128 + x, 108 + y, 1, 3);
        g2d.fillRect(123 + x, 109 + y, 1, 1);
        g2d.fillRect(124 + x, 110 + y, 1, 1);
        g2d.fillRect(129 + x, 110 + y, 1, 2);
        g2d.fillRect(125 + x, 111 + y, 1, 1);
        g2d.fillRect(130 + x, 111 + y, 1, 1);
        g2d.fillRect(127 + x, 112 + y, 2, 1);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(109 + x, 59 + y, 3, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 5);
        g2d.fillRect(99 + x, 79 + y, 1, 11);
        g2d.fillRect(100 + x, 79 + y, 1, 13);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 2);
        g2d.fillRect(97 + x, 80 + y, 1, 3);
        g2d.fillRect(102 + x, 82 + y, 1, 2);
        g2d.fillRect(103 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(108 + x, 82 + y, 1, 10);
        g2d.fillRect(109 + x, 82 + y, 1, 6);
        g2d.fillRect(101 + x, 83 + y, 1, 11);
        g2d.fillRect(98 + x, 85 + y, 1, 4);
        g2d.fillRect(102 + x, 85 + y, 1, 3);
        g2d.fillRect(97 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 4);
        g2d.fillRect(107 + x, 91 + y, 1, 4);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(100 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 2, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(107 + x, 101 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(108 + x, 94 + y, 1, 5);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 2, 1);
        g2d.fillRect(106 + x, 100 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(99 + x, 41 + y, 1, 9);
        g2d.fillRect(100 + x, 41 + y, 1, 8);
        g2d.fillRect(101 + x, 41 + y, 1, 7);
        g2d.fillRect(116 + x, 41 + y, 1, 7);
        g2d.fillRect(117 + x, 41 + y, 1, 7);
        g2d.fillRect(102 + x, 42 + y, 1, 6);
        g2d.fillRect(118 + x, 42 + y, 1, 7);
        g2d.fillRect(115 + x, 44 + y, 1, 4);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 6);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 15);
        g2d.fillRect(109 + x, 60 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 4);
        g2d.fillRect(111 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 5);
        g2d.fillRect(104 + x, 64 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 12);
        g2d.fillRect(119 + x, 73 + y, 1, 13);
        g2d.fillRect(102 + x, 74 + y, 1, 3);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 4);
        g2d.fillRect(109 + x, 79 + y, 1, 3);
        g2d.fillRect(110 + x, 79 + y, 1, 36);
        g2d.fillRect(111 + x, 79 + y, 1, 33);
        g2d.fillRect(112 + x, 79 + y, 1, 23);
        g2d.fillRect(113 + x, 79 + y, 1, 15);
        g2d.fillRect(114 + x, 79 + y, 1, 6);
        g2d.fillRect(115 + x, 79 + y, 1, 3);
        g2d.fillRect(116 + x, 79 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 6);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 5);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 27);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 98 + y, 1, 11);
        g2d.fillRect(105 + x, 98 + y, 3, 1);
        g2d.fillRect(100 + x, 101 + y, 1, 17);
        g2d.fillRect(106 + x, 101 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 1, 11);
        g2d.fillRect(98 + x, 108 + y, 1, 7);
        g2d.fillRect(108 + x, 108 + y, 1, 11);
        g2d.fillRect(107 + x, 109 + y, 1, 10);
        g2d.fillRect(97 + x, 110 + y, 1, 4);
        g2d.fillRect(106 + x, 112 + y, 1, 7);
        g2d.fillRect(105 + x, 114 + y, 1, 5);
        g2d.fillRect(101 + x, 115 + y, 1, 4);
        g2d.fillRect(102 + x, 116 + y, 1, 3);
        g2d.fillRect(103 + x, 116 + y, 1, 3);
        g2d.fillRect(104 + x, 116 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 59 + y, 1, 5);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 5);
        g2d.fillRect(108 + x, 61 + y, 1, 9);
        g2d.fillRect(104 + x, 62 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 9);
        g2d.fillRect(105 + x, 64 + y, 1, 12);
        g2d.fillRect(110 + x, 64 + y, 1, 3);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 11);
        g2d.fillRect(112 + x, 65 + y, 1, 10);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 8);
        g2d.fillRect(111 + x, 68 + y, 1, 6);
        g2d.fillRect(106 + x, 69 + y, 1, 8);
        g2d.fillRect(110 + x, 69 + y, 1, 4);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(104 + x, 71 + y, 1, 5);
        g2d.fillRect(107 + x, 71 + y, 1, 7);
        g2d.fillRect(116 + x, 72 + y, 1, 7);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 6);
        g2d.fillRect(117 + x, 73 + y, 1, 5);
        g2d.fillRect(109 + x, 74 + y, 1, 5);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 4);
        g2d.fillRect(111 + x, 75 + y, 1, 4);
        g2d.fillRect(112 + x, 76 + y, 1, 3);
        g2d.fillRect(113 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 76 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 4);
        g2d.fillRect(105 + x, 102 + y, 1, 7);
        g2d.fillRect(107 + x, 102 + y, 1, 7);
        g2d.fillRect(108 + x, 102 + y, 1, 6);
        g2d.fillRect(102 + x, 103 + y, 1, 5);
        g2d.fillRect(104 + x, 106 + y, 1, 10);
        g2d.fillRect(103 + x, 108 + y, 1, 8);
        g2d.fillRect(101 + x, 109 + y, 1, 6);
        g2d.fillRect(106 + x, 109 + y, 1, 3);
        g2d.fillRect(102 + x, 110 + y, 1, 6);
        g2d.fillRect(105 + x, 111 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 3);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 5);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 3);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 3);
        g2d.fillRect(108 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 3, 1);
        g2d.fillRect(104 + x, 76 + y, 2, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(107 + x, 78 + y, 1, 3);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 4);
        g2d.fillRect(106 + x, 102 + y, 1, 7);
        g2d.fillRect(103 + x, 106 + y, 1, 2);
        g2d.fillRect(102 + x, 108 + y, 1, 2);
        g2d.fillRect(105 + x, 109 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3,ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2,ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1,ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2,ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(106 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(104 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 3);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 4);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
    }
}
