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
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D38 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D38()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 6;
    }

    public D38(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 6;
    }

    public D38(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
        platzHeight = 6;
    }

    public SuperC getRecommendedAccessory(ColorArray c)
    {
        return new obsolete.D38_1(middle, c);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);


        if(step == 11 || step == 12 || step == 13)
        {
            tl1 = -1;
        }
        else
            tl1 = 0;


            paintTL1(x + tl1,0,g2d);
            paintTL2(x + tl2 + tl1,y,g2d);
            paintTL3(x + tl3 + tl2 + tl1,y + prevY, g2d);

        if(step == 11 || step == 12 || step == 13)
        {
            if(tl2 > -1)
                tl2--;
        }
        else
        {
            if(x > prevX)
            {
                if(tl2 > -1)
                    tl2--;
            }
            else if(x < prevX)
            {
                if(tl2 < 1)
                    tl2++;
            }
        }

        if(prevX > prevPrevX)
        {
            tl3--;
        }
        else if(prevX < prevPrevX)
        {
            tl3++;
        }

        prevPrevX = prevX;
        prevX = x;
    }
    int prevX = 0;
    int prevPrevX = 0;
    int prevY = 0;
    int tl1 = 0;
    int tl2 = 0;
    int tl3 = 0;

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
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(prevY == -1)
            prevY = 0;
        paintLB(offsetX, prevY, g2d);
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

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(101 + x, 52 + y, 2, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 2, 1);
        g2d.fillRect(115 + x, 53 + y, 3, 1);
        g2d.fillRect(119 + x, 53 + y, 2, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 2, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 2, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 3, 1);
        g2d.fillRect(118 + x, 57 + y, 2, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 4, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 2, 1);
        g2d.fillRect(119 + x, 54 + y, 2, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 2, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 3, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 2, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 2, 1);
        g2d.fillRect(112 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 3, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 3, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 54 + y, 2, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 3, 1);
        g2d.fillRect(107 + x, 58 + y, 4, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 2, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(102 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 2, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(103 + x, 53 + y, 2, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(107 + x, 85 + y, 2, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 1);
        g2d.fillRect(93 + x, 97 + y, 1, 3);
        g2d.fillRect(103 + x, 97 + y, 1, 2);
        g2d.fillRect(99 + x, 98 + y, 1, 2);
        g2d.fillRect(102 + x, 98 + y, 1, 3);
        g2d.fillRect(94 + x, 100 + y, 1, 1);
        g2d.fillRect(107 + x, 101 + y, 1, 2);
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(108 + x, 102 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 1);
        g2d.fillRect(104 + x, 103 + y, 1, 1);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(96 + x, 104 + y, 1, 4);
        g2d.fillRect(97 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 104 + y, 1, 1);
        g2d.fillRect(93 + x, 114 + y, 1, 2);
        g2d.fillRect(97 + x, 115 + y, 1, 2);
        g2d.fillRect(92 + x, 116 + y, 1, 1);
        g2d.fillRect(102 + x, 116 + y, 1, 2);
        g2d.fillRect(97 + x, 118 + y, 1, 2);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(104 + x, 119 + y, 1, 2);
        g2d.fillRect(96 + x, 120 + y, 1, 3);
        g2d.fillRect(105 + x, 120 + y, 1, 5);
        g2d.fillRect(100 + x, 121 + y, 1, 1);
        g2d.fillRect(103 + x, 123 + y, 1, 1);
        g2d.fillRect(101 + x, 124 + y, 2, 1);
        g2d.fillRect(106 + x, 124 + y, 1, 1);
        g2d.fillRect(94 + x, 125 + y, 1, 1);
        g2d.fillRect(97 + x, 125 + y, 1, 1);
        g2d.fillRect(100 + x, 125 + y, 1, 1);
        g2d.fillRect(95 + x, 126 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(109 + x, 100 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 2);
        g2d.fillRect(95 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 100 + y, 1, 3);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 102 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 1);
        g2d.fillRect(104 + x, 104 + y, 1, 2);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(109 + x, 105 + y, 1, 2);
        g2d.fillRect(101 + x, 106 + y, 1, 2);
        g2d.fillRect(108 + x, 106 + y, 1, 2);
        g2d.fillRect(98 + x, 107 + y, 1, 2);
        g2d.fillRect(100 + x, 107 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 1, 1);
        g2d.fillRect(106 + x, 108 + y, 1, 1);
        g2d.fillRect(92 + x, 117 + y, 1, 2);
        g2d.fillRect(96 + x, 117 + y, 2, 1);
        g2d.fillRect(93 + x, 118 + y, 1, 1);
        g2d.fillRect(101 + x, 119 + y, 1, 1);
        g2d.fillRect(92 + x, 121 + y, 1, 2);
        g2d.fillRect(104 + x, 121 + y, 1, 1);
        g2d.fillRect(97 + x, 122 + y, 1, 1);
        g2d.fillRect(100 + x, 122 + y, 3, 1);
        g2d.fillRect(93 + x, 123 + y, 1, 1);
        g2d.fillRect(97 + x, 124 + y, 3, 1);
        g2d.fillRect(95 + x, 125 + y, 2, 1);
        g2d.fillRect(101 + x, 125 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(97 + x, 84 + y, 1, 4);
        g2d.fillRect(98 + x, 84 + y, 1, 2);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(96 + x, 86 + y, 1, 2);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 1, 5);
        g2d.fillRect(106 + x, 89 + y, 1, 4);
        g2d.fillRect(97 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(95 + x, 93 + y, 1, 3);
        g2d.fillRect(108 + x, 93 + y, 1, 3);
        g2d.fillRect(100 + x, 94 + y, 1, 4);
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(94 + x, 95 + y, 1, 3);
        g2d.fillRect(109 + x, 95 + y, 1, 3);
        g2d.fillRect(108 + x, 99 + y, 1, 3);
        g2d.fillRect(109 + x, 99 + y, 1, 1);
        g2d.fillRect(94 + x, 101 + y, 1, 13);
        g2d.fillRect(95 + x, 101 + y, 1, 1);
        g2d.fillRect(97 + x, 102 + y, 1, 1);
        g2d.fillRect(109 + x, 102 + y, 1, 1);
        g2d.fillRect(103 + x, 103 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 1);
        g2d.fillRect(96 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(105 + x, 109 + y, 1, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 3);
        g2d.fillRect(93 + x, 112 + y, 1, 2);
        g2d.fillRect(97 + x, 112 + y, 1, 3);
        g2d.fillRect(105 + x, 112 + y, 1, 1);
        g2d.fillRect(102 + x, 114 + y, 1, 2);
        g2d.fillRect(93 + x, 116 + y, 1, 1);
        g2d.fillRect(105 + x, 116 + y, 1, 4);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(92 + x, 119 + y, 1, 2);
        g2d.fillRect(97 + x, 120 + y, 1, 2);
        g2d.fillRect(103 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 1, 1);
        g2d.fillRect(92 + x, 123 + y, 1, 1);
        g2d.fillRect(98 + x, 123 + y, 1, 1);
        g2d.fillRect(100 + x, 123 + y, 1, 2);
        g2d.fillRect(102 + x, 123 + y, 1, 1);
        g2d.fillRect(93 + x, 124 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 2);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 91 + y, 1, 2);
        g2d.fillRect(97 + x, 92 + y, 1, 3);
        g2d.fillRect(105 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(96 + x, 94 + y, 1, 2);
        g2d.fillRect(99 + x, 94 + y, 1, 4);
        g2d.fillRect(107 + x, 94 + y, 1, 7);
        g2d.fillRect(95 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 96 + y, 1, 3);
        g2d.fillRect(98 + x, 97 + y, 1, 4);
        g2d.fillRect(94 + x, 98 + y, 1, 2);
        g2d.fillRect(109 + x, 98 + y, 1, 1);
        g2d.fillRect(97 + x, 99 + y, 1, 2);
        g2d.fillRect(104 + x, 101 + y, 1, 2);
        g2d.fillRect(95 + x, 102 + y, 1, 2);
        g2d.fillRect(96 + x, 102 + y, 1, 2);
        g2d.fillRect(97 + x, 103 + y, 1, 1);
        g2d.fillRect(99 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 2);
        g2d.fillRect(108 + x, 103 + y, 1, 3);
        g2d.fillRect(98 + x, 104 + y, 1, 3);
        g2d.fillRect(103 + x, 105 + y, 1, 6);
        g2d.fillRect(97 + x, 106 + y, 1, 2);
        g2d.fillRect(102 + x, 106 + y, 1, 8);
        g2d.fillRect(104 + x, 106 + y, 1, 4);
        g2d.fillRect(106 + x, 106 + y, 1, 2);
        g2d.fillRect(100 + x, 108 + y, 1, 3);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 1, 7);
        g2d.fillRect(99 + x, 109 + y, 1, 3);
        g2d.fillRect(97 + x, 110 + y, 1, 2);
        g2d.fillRect(105 + x, 110 + y, 1, 2);
        g2d.fillRect(106 + x, 110 + y, 1, 2);
        g2d.fillRect(94 + x, 114 + y, 1, 3);
        g2d.fillRect(103 + x, 114 + y, 1, 3);
        g2d.fillRect(96 + x, 116 + y, 1, 1);
        g2d.fillRect(101 + x, 116 + y, 1, 1);
        g2d.fillRect(102 + x, 118 + y, 1, 3);
        g2d.fillRect(100 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 121 + y, 1, 1);
        g2d.fillRect(98 + x, 122 + y, 1, 1);
        g2d.fillRect(103 + x, 122 + y, 2, 1);
        g2d.fillRect(95 + x, 123 + y, 1, 2);
        g2d.fillRect(99 + x, 123 + y, 1, 1);
        g2d.fillRect(101 + x, 123 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(99 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 5);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 1, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 3);
        g2d.fillRect(106 + x, 95 + y, 1, 3);
        g2d.fillRect(95 + x, 104 + y, 1, 11);
        g2d.fillRect(99 + x, 105 + y, 1, 2);
        g2d.fillRect(100 + x, 105 + y, 1, 1);
        g2d.fillRect(107 + x, 107 + y, 1, 1);
        g2d.fillRect(96 + x, 109 + y, 1, 2);
        g2d.fillRect(104 + x, 110 + y, 1, 3);
        g2d.fillRect(100 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 112 + y, 1, 3);
        g2d.fillRect(105 + x, 113 + y, 1, 3);
        g2d.fillRect(103 + x, 119 + y, 1, 1);
        g2d.fillRect(94 + x, 121 + y, 1, 1);
        g2d.fillRect(99 + x, 122 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(95 + x, 99 + y, 2, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 2);
        g2d.fillRect(100 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 1, 3);
        g2d.fillRect(106 + x, 104 + y, 1, 2);
        g2d.fillRect(101 + x, 109 + y, 1, 2);
        g2d.fillRect(96 + x, 111 + y, 1, 2);
        g2d.fillRect(101 + x, 113 + y, 1, 3);
        g2d.fillRect(104 + x, 113 + y, 1, 1);
        g2d.fillRect(95 + x, 115 + y, 1, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(94 + x, 117 + y, 1, 1);
        g2d.fillRect(103 + x, 117 + y, 1, 2);
        g2d.fillRect(93 + x, 119 + y, 1, 1);
        g2d.fillRect(96 + x, 123 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(96 + x, 100 + y, 1, 2);
        g2d.fillRect(97 + x, 101 + y, 2, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(105 + x, 104 + y, 1, 5);
        g2d.fillRect(101 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 1);
        g2d.fillRect(99 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 108 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 1, 1);
        g2d.fillRect(106 + x, 109 + y, 1, 1);
        g2d.fillRect(93 + x, 117 + y, 1, 1);
        g2d.fillRect(94 + x, 118 + y, 3, 1);
        g2d.fillRect(95 + x, 119 + y, 1, 2);
        g2d.fillRect(96 + x, 119 + y, 1, 1);
        g2d.fillRect(93 + x, 120 + y, 1, 3);
        g2d.fillRect(94 + x, 120 + y, 1, 1);
        g2d.fillRect(101 + x, 120 + y, 1, 2);
        g2d.fillRect(102 + x, 121 + y, 2, 1);
        g2d.fillRect(94 + x, 122 + y, 1, 3);
        g2d.fillRect(97 + x, 123 + y, 1, 1);
        g2d.fillRect(98 + x, 125 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 7);
        g2d.fillRect(104 + x, 91 + y, 1, 8);
        g2d.fillRect(101 + x, 93 + y, 1, 9);
        g2d.fillRect(98 + x, 94 + y, 1, 3);
        g2d.fillRect(97 + x, 95 + y, 1, 4);
        g2d.fillRect(96 + x, 96 + y, 1, 3);
        g2d.fillRect(105 + x, 96 + y, 1, 5);
        g2d.fillRect(95 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 98 + y, 1, 6);
        g2d.fillRect(100 + x, 102 + y, 1, 3);
        g2d.fillRect(107 + x, 103 + y, 1, 4);
        g2d.fillRect(99 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 111 + y, 1, 2);
        g2d.fillRect(100 + x, 112 + y, 1, 8);
        g2d.fillRect(96 + x, 113 + y, 1, 3);
        g2d.fillRect(104 + x, 114 + y, 1, 5);
        g2d.fillRect(95 + x, 116 + y, 1, 2);
        g2d.fillRect(99 + x, 116 + y, 1, 6);
        g2d.fillRect(98 + x, 117 + y, 1, 5);
        g2d.fillRect(94 + x, 119 + y, 1, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(97 + x, 116 + y, 2, 1);
        g2d.fillRect(98 + x, 117 + y, 1, 1);
        g2d.fillRect(104 + x, 117 + y, 1, 1);
        g2d.fillRect(102 + x, 123 + y, 1, 2);
        g2d.fillRect(97 + x, 124 + y, 2, 1);
        g2d.fillRect(108 + x, 124 + y, 1, 2);
        g2d.fillRect(98 + x, 125 + y, 1, 2);
        g2d.fillRect(100 + x, 126 + y, 1, 1);
        g2d.fillRect(107 + x, 126 + y, 1, 1);
        g2d.fillRect(92 + x, 127 + y, 2, 1);
        g2d.fillRect(99 + x, 127 + y, 1, 1);
        g2d.fillRect(103 + x, 127 + y, 1, 1);
        g2d.fillRect(96 + x, 128 + y, 1, 1);
        g2d.fillRect(104 + x, 128 + y, 1, 1);
        g2d.fillRect(97 + x, 129 + y, 1, 1);
        g2d.fillRect(105 + x, 129 + y, 1, 3);
        g2d.fillRect(104 + x, 137 + y, 1, 2);
        g2d.fillRect(109 + x, 137 + y, 1, 2);
        g2d.fillRect(105 + x, 138 + y, 1, 2);
        g2d.fillRect(98 + x, 139 + y, 1, 2);
        g2d.fillRect(111 + x, 139 + y, 1, 1);
        g2d.fillRect(104 + x, 140 + y, 1, 1);
        g2d.fillRect(96 + x, 141 + y, 1, 2);
        g2d.fillRect(105 + x, 141 + y, 1, 1);
        g2d.fillRect(95 + x, 142 + y, 1, 1);
        g2d.fillRect(101 + x, 142 + y, 1, 1);
        g2d.fillRect(106 + x, 142 + y, 1, 3);
        g2d.fillRect(97 + x, 145 + y, 1, 1);
        g2d.fillRect(100 + x, 145 + y, 1, 1);
        g2d.fillRect(98 + x, 146 + y, 2, 1);
        g2d.fillRect(101 + x, 146 + y, 1, 1);
        g2d.fillRect(105 + x, 147 + y, 1, 1);
        g2d.fillRect(109 + x, 147 + y, 1, 1);
        g2d.fillRect(106 + x, 148 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(91 + x, 126 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 116 + y, 1, 1);
        g2d.fillRect(96 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 117 + y, 1, 1);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(103 + x, 117 + y, 1, 1);
        g2d.fillRect(97 + x, 125 + y, 1, 3);
        g2d.fillRect(102 + x, 125 + y, 1, 2);
        g2d.fillRect(103 + x, 126 + y, 1, 1);
        g2d.fillRect(106 + x, 126 + y, 1, 1);
        g2d.fillRect(98 + x, 128 + y, 1, 1);
        g2d.fillRect(96 + x, 129 + y, 1, 1);
        g2d.fillRect(100 + x, 129 + y, 1, 2);
        g2d.fillRect(91 + x, 130 + y, 1, 1);
        g2d.fillRect(99 + x, 130 + y, 1, 2);
        g2d.fillRect(101 + x, 130 + y, 1, 1);
        g2d.fillRect(103 + x, 130 + y, 1, 2);
        g2d.fillRect(104 + x, 131 + y, 1, 1);
        g2d.fillRect(94 + x, 132 + y, 1, 1);
        g2d.fillRect(104 + x, 139 + y, 1, 1);
        g2d.fillRect(100 + x, 140 + y, 1, 1);
        g2d.fillRect(105 + x, 140 + y, 2, 1);
        g2d.fillRect(111 + x, 140 + y, 1, 1);
        g2d.fillRect(99 + x, 141 + y, 1, 1);
        g2d.fillRect(95 + x, 143 + y, 2, 1);
        g2d.fillRect(100 + x, 143 + y, 2, 1);
        g2d.fillRect(104 + x, 143 + y, 1, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 2);
        g2d.fillRect(112 + x, 143 + y, 1, 2);
        g2d.fillRect(98 + x, 144 + y, 2, 1);
        g2d.fillRect(105 + x, 144 + y, 1, 1);
        g2d.fillRect(102 + x, 145 + y, 3, 1);
        g2d.fillRect(110 + x, 145 + y, 1, 1);
        g2d.fillRect(100 + x, 146 + y, 1, 1);
        g2d.fillRect(105 + x, 146 + y, 1, 1);
        g2d.fillRect(99 + x, 147 + y, 1, 1);
        g2d.fillRect(106 + x, 147 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 113 + y, 1, 1);
        g2d.fillRect(100 + x, 114 + y, 1, 1);
        g2d.fillRect(103 + x, 114 + y, 2, 1);
        g2d.fillRect(97 + x, 115 + y, 3, 1);
        g2d.fillRect(104 + x, 115 + y, 1, 2);
        g2d.fillRect(105 + x, 116 + y, 1, 6);
        g2d.fillRect(97 + x, 117 + y, 1, 1);
        g2d.fillRect(103 + x, 118 + y, 2, 1);
        g2d.fillRect(94 + x, 120 + y, 1, 1);
        g2d.fillRect(92 + x, 121 + y, 1, 2);
        g2d.fillRect(93 + x, 121 + y, 1, 1);
        g2d.fillRect(101 + x, 121 + y, 1, 2);
        g2d.fillRect(106 + x, 121 + y, 1, 2);
        g2d.fillRect(91 + x, 122 + y, 1, 2);
        g2d.fillRect(97 + x, 122 + y, 1, 2);
        g2d.fillRect(107 + x, 122 + y, 1, 2);
        g2d.fillRect(91 + x, 125 + y, 2, 1);
        g2d.fillRect(92 + x, 126 + y, 1, 1);
        g2d.fillRect(104 + x, 126 + y, 1, 1);
        g2d.fillRect(91 + x, 127 + y, 1, 1);
        g2d.fillRect(107 + x, 127 + y, 1, 4);
        g2d.fillRect(97 + x, 128 + y, 1, 1);
        g2d.fillRect(108 + x, 128 + y, 1, 9);
        g2d.fillRect(102 + x, 131 + y, 1, 1);
        g2d.fillRect(104 + x, 132 + y, 2, 1);
        g2d.fillRect(95 + x, 133 + y, 1, 1);
        g2d.fillRect(97 + x, 134 + y, 1, 3);
        g2d.fillRect(104 + x, 134 + y, 1, 3);
        g2d.fillRect(95 + x, 135 + y, 1, 1);
        g2d.fillRect(109 + x, 135 + y, 1, 2);
        g2d.fillRect(98 + x, 137 + y, 1, 2);
        g2d.fillRect(95 + x, 139 + y, 1, 3);
        g2d.fillRect(100 + x, 139 + y, 1, 1);
        g2d.fillRect(109 + x, 139 + y, 2, 1);
        g2d.fillRect(99 + x, 140 + y, 1, 1);
        g2d.fillRect(104 + x, 141 + y, 1, 2);
        g2d.fillRect(111 + x, 141 + y, 1, 2);
        g2d.fillRect(112 + x, 141 + y, 1, 2);
        g2d.fillRect(97 + x, 142 + y, 1, 1);
        g2d.fillRect(105 + x, 142 + y, 1, 2);
        g2d.fillRect(101 + x, 144 + y, 1, 2);
        g2d.fillRect(103 + x, 144 + y, 2, 1);
        g2d.fillRect(107 + x, 144 + y, 1, 1);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 145 + y, 2, 1);
        g2d.fillRect(110 + x, 146 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(96 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 115 + y, 2, 1);
        g2d.fillRect(99 + x, 116 + y, 1, 1);
        g2d.fillRect(101 + x, 116 + y, 1, 1);
        g2d.fillRect(100 + x, 117 + y, 1, 2);
        g2d.fillRect(95 + x, 118 + y, 1, 3);
        g2d.fillRect(96 + x, 118 + y, 1, 1);
        g2d.fillRect(98 + x, 118 + y, 2, 1);
        g2d.fillRect(101 + x, 118 + y, 2, 1);
        g2d.fillRect(99 + x, 119 + y, 1, 1);
        g2d.fillRect(103 + x, 119 + y, 2, 1);
        g2d.fillRect(104 + x, 120 + y, 1, 1);
        g2d.fillRect(94 + x, 121 + y, 1, 1);
        g2d.fillRect(102 + x, 121 + y, 1, 2);
        g2d.fillRect(93 + x, 122 + y, 1, 5);
        g2d.fillRect(105 + x, 122 + y, 1, 1);
        g2d.fillRect(92 + x, 123 + y, 1, 2);
        g2d.fillRect(103 + x, 123 + y, 1, 3);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(91 + x, 124 + y, 1, 1);
        g2d.fillRect(104 + x, 124 + y, 1, 2);
        g2d.fillRect(107 + x, 124 + y, 1, 2);
        g2d.fillRect(96 + x, 127 + y, 1, 1);
        g2d.fillRect(100 + x, 127 + y, 1, 2);
        g2d.fillRect(102 + x, 127 + y, 1, 1);
        g2d.fillRect(104 + x, 127 + y, 3, 1);
        g2d.fillRect(91 + x, 128 + y, 1, 2);
        g2d.fillRect(92 + x, 128 + y, 1, 2);
        g2d.fillRect(99 + x, 128 + y, 1, 2);
        g2d.fillRect(103 + x, 128 + y, 1, 2);
        g2d.fillRect(105 + x, 128 + y, 2, 1);
        g2d.fillRect(104 + x, 129 + y, 1, 2);
        g2d.fillRect(94 + x, 130 + y, 1, 2);
        g2d.fillRect(96 + x, 130 + y, 1, 4);
        g2d.fillRect(97 + x, 130 + y, 1, 4);
        g2d.fillRect(98 + x, 130 + y, 1, 7);
        g2d.fillRect(100 + x, 131 + y, 2, 1);
        g2d.fillRect(99 + x, 132 + y, 1, 1);
        g2d.fillRect(101 + x, 132 + y, 3, 1);
        g2d.fillRect(102 + x, 133 + y, 3, 1);
        g2d.fillRect(94 + x, 134 + y, 2, 1);
        g2d.fillRect(103 + x, 134 + y, 1, 4);
        g2d.fillRect(97 + x, 137 + y, 1, 3);
        g2d.fillRect(108 + x, 137 + y, 1, 3);
        g2d.fillRect(100 + x, 138 + y, 1, 1);
        g2d.fillRect(99 + x, 139 + y, 1, 1);
        g2d.fillRect(106 + x, 139 + y, 1, 1);
        g2d.fillRect(98 + x, 141 + y, 1, 2);
        g2d.fillRect(101 + x, 141 + y, 1, 1);
        g2d.fillRect(103 + x, 143 + y, 1, 1);
        g2d.fillRect(107 + x, 143 + y, 1, 1);
        g2d.fillRect(96 + x, 144 + y, 1, 2);
        g2d.fillRect(97 + x, 144 + y, 1, 1);
        g2d.fillRect(100 + x, 144 + y, 1, 1);
        g2d.fillRect(102 + x, 144 + y, 1, 1);
        g2d.fillRect(99 + x, 145 + y, 1, 1);
        g2d.fillRect(107 + x, 145 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(101 + x, 114 + y, 2, 1);
        g2d.fillRect(97 + x, 118 + y, 1, 4);
        g2d.fillRect(96 + x, 119 + y, 1, 1);
        g2d.fillRect(98 + x, 119 + y, 1, 1);
        g2d.fillRect(102 + x, 119 + y, 1, 1);
        g2d.fillRect(101 + x, 120 + y, 1, 1);
        g2d.fillRect(103 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 121 + y, 1, 2);
        g2d.fillRect(94 + x, 122 + y, 1, 2);
        g2d.fillRect(102 + x, 129 + y, 1, 1);
        g2d.fillRect(106 + x, 129 + y, 1, 5);
        g2d.fillRect(92 + x, 131 + y, 2, 1);
        g2d.fillRect(107 + x, 131 + y, 1, 7);
        g2d.fillRect(101 + x, 133 + y, 1, 1);
        g2d.fillRect(105 + x, 133 + y, 1, 1);
        g2d.fillRect(96 + x, 134 + y, 1, 2);
        g2d.fillRect(102 + x, 134 + y, 1, 3);
        g2d.fillRect(95 + x, 136 + y, 1, 3);
        g2d.fillRect(97 + x, 141 + y, 1, 1);
        g2d.fillRect(102 + x, 143 + y, 1, 1);
        g2d.fillRect(108 + x, 143 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(94 + x, 115 + y, 2, 1);
        g2d.fillRect(103 + x, 115 + y, 1, 2);
        g2d.fillRect(100 + x, 119 + y, 2, 1);
        g2d.fillRect(99 + x, 120 + y, 1, 1);
        g2d.fillRect(102 + x, 120 + y, 1, 1);
        g2d.fillRect(96 + x, 125 + y, 1, 2);
        g2d.fillRect(101 + x, 125 + y, 1, 1);
        g2d.fillRect(105 + x, 125 + y, 2, 1);
        g2d.fillRect(95 + x, 127 + y, 1, 2);
        g2d.fillRect(94 + x, 129 + y, 1, 1);
        g2d.fillRect(100 + x, 132 + y, 1, 1);
        g2d.fillRect(99 + x, 133 + y, 1, 1);
        g2d.fillRect(105 + x, 134 + y, 1, 2);
        g2d.fillRect(106 + x, 134 + y, 1, 2);
        g2d.fillRect(100 + x, 135 + y, 1, 3);
        g2d.fillRect(96 + x, 136 + y, 1, 1);
        g2d.fillRect(99 + x, 136 + y, 1, 3);
        g2d.fillRect(102 + x, 137 + y, 1, 1);
        g2d.fillRect(103 + x, 138 + y, 1, 1);
        g2d.fillRect(107 + x, 138 + y, 1, 1);
        g2d.fillRect(97 + x, 140 + y, 1, 1);
        g2d.fillRect(108 + x, 140 + y, 1, 1);
        g2d.fillRect(109 + x, 141 + y, 2, 1);
        g2d.fillRect(106 + x, 145 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(94 + x, 116 + y, 1, 2);
        g2d.fillRect(95 + x, 117 + y, 1, 1);
        g2d.fillRect(102 + x, 117 + y, 1, 1);
        g2d.fillRect(105 + x, 126 + y, 1, 1);
        g2d.fillRect(98 + x, 127 + y, 1, 1);
        g2d.fillRect(95 + x, 129 + y, 1, 4);
        g2d.fillRect(98 + x, 129 + y, 1, 1);
        g2d.fillRect(101 + x, 129 + y, 1, 1);
        g2d.fillRect(102 + x, 130 + y, 1, 1);
        g2d.fillRect(92 + x, 132 + y, 2, 1);
        g2d.fillRect(93 + x, 133 + y, 2, 1);
        g2d.fillRect(109 + x, 140 + y, 2, 1);
        g2d.fillRect(100 + x, 141 + y, 1, 2);
        g2d.fillRect(106 + x, 141 + y, 2, 1);
        g2d.fillRect(99 + x, 142 + y, 1, 2);
        g2d.fillRect(107 + x, 142 + y, 4, 1);
        g2d.fillRect(97 + x, 143 + y, 2, 1);
        g2d.fillRect(110 + x, 143 + y, 1, 2);
        g2d.fillRect(108 + x, 144 + y, 1, 3);
        g2d.fillRect(109 + x, 144 + y, 1, 3);
        g2d.fillRect(105 + x, 145 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(102 + x, 115 + y, 1, 2);
        g2d.fillRect(95 + x, 116 + y, 2, 1);
        g2d.fillRect(96 + x, 120 + y, 1, 5);
        g2d.fillRect(98 + x, 120 + y, 1, 4);
        g2d.fillRect(100 + x, 120 + y, 1, 6);
        g2d.fillRect(99 + x, 121 + y, 1, 6);
        g2d.fillRect(103 + x, 121 + y, 1, 2);
        g2d.fillRect(104 + x, 121 + y, 1, 3);
        g2d.fillRect(95 + x, 123 + y, 1, 4);
        g2d.fillRect(101 + x, 123 + y, 1, 2);
        g2d.fillRect(105 + x, 123 + y, 1, 2);
        g2d.fillRect(94 + x, 124 + y, 1, 5);
        g2d.fillRect(106 + x, 124 + y, 1, 1);
        g2d.fillRect(101 + x, 126 + y, 1, 3);
        g2d.fillRect(93 + x, 128 + y, 1, 3);
        g2d.fillRect(102 + x, 128 + y, 1, 1);
        g2d.fillRect(92 + x, 130 + y, 1, 1);
        g2d.fillRect(100 + x, 133 + y, 1, 2);
        g2d.fillRect(99 + x, 134 + y, 1, 2);
        g2d.fillRect(101 + x, 134 + y, 1, 7);
        g2d.fillRect(105 + x, 136 + y, 1, 2);
        g2d.fillRect(106 + x, 136 + y, 1, 3);
        g2d.fillRect(96 + x, 137 + y, 1, 4);
        g2d.fillRect(102 + x, 138 + y, 1, 5);
        g2d.fillRect(103 + x, 139 + y, 1, 4);
        g2d.fillRect(107 + x, 139 + y, 1, 2);
        g2d.fillRect(108 + x, 141 + y, 1, 1);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(99 + x, 150 + y, 1, 2);
        g2d.fillRect(104 + x, 154 + y, 2, 1);
        g2d.fillRect(105 + x, 155 + y, 1, 3);
        g2d.fillRect(100 + x, 156 + y, 2, 1);
        g2d.fillRect(107 + x, 157 + y, 1, 1);
        g2d.fillRect(108 + x, 160 + y, 1, 1);
        g2d.fillRect(99 + x, 161 + y, 1, 1);
        g2d.fillRect(100 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(108 + x, 143 + y, 1, 4);
        g2d.fillRect(107 + x, 147 + y, 1, 1);
        g2d.fillRect(107 + x, 150 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(107 + x, 159 + y, 1, 4);
        g2d.fillRect(106 + x, 160 + y, 1, 1);
        g2d.fillRect(106 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(107 + x, 156 + y, 1, 1);
        g2d.fillRect(106 + x, 157 + y, 1, 3);
        g2d.fillRect(105 + x, 160 + y, 1, 4);
        g2d.fillRect(106 + x, 161 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 145 + y, 2, 1);
        g2d.fillRect(103 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 152 + y, 1, 1);
        g2d.fillRect(101 + x, 153 + y, 1, 1);
        g2d.fillRect(100 + x, 154 + y, 1, 1);
        g2d.fillRect(103 + x, 155 + y, 1, 3);
        g2d.fillRect(104 + x, 157 + y, 1, 1);
        g2d.fillRect(103 + x, 160 + y, 1, 1);
        g2d.fillRect(100 + x, 161 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 2, 1);
        g2d.fillRect(102 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 142 + y, 1, 1);
        g2d.fillRect(107 + x, 142 + y, 1, 3);
        g2d.fillRect(108 + x, 142 + y, 1, 1);
        g2d.fillRect(96 + x, 143 + y, 1, 2);
        g2d.fillRect(99 + x, 143 + y, 1, 7);
        g2d.fillRect(100 + x, 143 + y, 1, 7);
        g2d.fillRect(101 + x, 143 + y, 3, 1);
        g2d.fillRect(97 + x, 144 + y, 2, 1);
        g2d.fillRect(106 + x, 146 + y, 1, 11);
        g2d.fillRect(102 + x, 148 + y, 1, 3);
        g2d.fillRect(103 + x, 148 + y, 1, 1);
        g2d.fillRect(101 + x, 151 + y, 1, 1);
        g2d.fillRect(101 + x, 154 + y, 1, 1);
        g2d.fillRect(100 + x, 157 + y, 1, 3);
        g2d.fillRect(102 + x, 157 + y, 1, 1);
        g2d.fillRect(101 + x, 158 + y, 1, 1);
        g2d.fillRect(103 + x, 158 + y, 1, 2);
        g2d.fillRect(107 + x, 158 + y, 1, 1);
        g2d.fillRect(99 + x, 159 + y, 1, 2);
        g2d.fillRect(105 + x, 159 + y, 1, 1);
        g2d.fillRect(104 + x, 161 + y, 1, 1);
        g2d.fillRect(99 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 146 + y, 1, 1);
        g2d.fillRect(107 + x, 148 + y, 1, 2);
        g2d.fillRect(103 + x, 163 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 140 + y, 1, 1);
        g2d.fillRect(105 + x, 141 + y, 1, 1);
        g2d.fillRect(101 + x, 144 + y, 1, 3);
        g2d.fillRect(102 + x, 144 + y, 2, 1);
        g2d.fillRect(106 + x, 144 + y, 1, 1);
        g2d.fillRect(103 + x, 145 + y, 1, 3);
        g2d.fillRect(104 + x, 145 + y, 2, 1);
        g2d.fillRect(105 + x, 146 + y, 1, 1);
        g2d.fillRect(103 + x, 149 + y, 1, 1);
        g2d.fillRect(100 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 151 + y, 1, 3);
        g2d.fillRect(102 + x, 155 + y, 1, 1);
        g2d.fillRect(104 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 157 + y, 1, 1);
        g2d.fillRect(104 + x, 158 + y, 1, 2);
        g2d.fillRect(105 + x, 158 + y, 1, 1);
        g2d.fillRect(101 + x, 159 + y, 1, 1);
        g2d.fillRect(100 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 143 + y, 1, 1);
        g2d.fillRect(102 + x, 145 + y, 1, 1);
        g2d.fillRect(104 + x, 146 + y, 1, 3);
        g2d.fillRect(105 + x, 147 + y, 1, 1);
        g2d.fillRect(100 + x, 150 + y, 2, 1);
        g2d.fillRect(103 + x, 150 + y, 1, 1);
        g2d.fillRect(104 + x, 153 + y, 1, 1);
        g2d.fillRect(103 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(106 + x, 141 + y, 1, 3);
        g2d.fillRect(105 + x, 148 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 151 + y, 1, 1);
        g2d.fillRect(99 + x, 152 + y, 3, 1);
        g2d.fillRect(100 + x, 155 + y, 2, 1);
        g2d.fillRect(104 + x, 155 + y, 1, 1);
        g2d.fillRect(102 + x, 156 + y, 1, 1);
        g2d.fillRect(104 + x, 160 + y, 1, 1);
        g2d.fillRect(102 + x, 161 + y, 2, 1);
        g2d.fillRect(101 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(105 + x, 142 + y, 1, 3);
        g2d.fillRect(104 + x, 144 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 2);
        g2d.fillRect(101 + x, 147 + y, 1, 3);
        g2d.fillRect(104 + x, 149 + y, 1, 4);
        g2d.fillRect(103 + x, 151 + y, 1, 3);
        g2d.fillRect(102 + x, 153 + y, 1, 2);
        g2d.fillRect(102 + x, 158 + y, 1, 3);
        g2d.fillRect(101 + x, 160 + y, 1, 2);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 3);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 8);
        g2d.fillRect(101 + x, 78 + y, 3, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 4);
        g2d.fillRect(118 + x, 82 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(111 + x, 59 + y, 2, 1);
        g2d.fillRect(103 + x, 60 + y, 2, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 2, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 5);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 3, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(124 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(119 + x, 83 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(108 + x, 83 + y, 2, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 4);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 4);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 2, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 10);
        g2d.fillRect(116 + x, 74 + y, 2, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 2, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 2, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 3, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 3, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 3);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 3);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 2, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(124 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(123 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 2, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 2, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 2, 1);
        g2d.fillRect(104 + x, 68 + y, 4, 1);
        g2d.fillRect(114 + x, 68 + y, 2, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 3);
        g2d.fillRect(108 + x, 69 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 1, 3);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 2);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(114 + x, 74 + y, 1, 2);
        g2d.fillRect(104 + x, 75 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 3);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 3);
        g2d.fillRect(116 + x, 77 + y, 1, 3);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 3);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 4);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 3);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 2, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 2, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 2, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 7);
        g2d.fillRect(112 + x, 76 + y, 2, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 2, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 2, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 2, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 2);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 2);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 2, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 3);
        g2d.fillRect(120 + x, 85 + y, 1, 3);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 3, 1);
        g2d.fillRect(113 + x, 86 + y, 2, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 2);
        g2d.fillRect(123 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(100 + x, 83 + y, 1, 3);
        g2d.fillRect(115 + x, 85 + y, 2, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 3, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 2, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(113 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 3);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 3);
        g2d.fillRect(105 + x, 76 + y, 1, 3);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 3, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 4);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(123 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(117 + x, 85 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 5);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 5);
        g2d.fillRect(112 + x, 66 + y, 1, 2);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 3);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
    }





    public void paintLB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 93 + y, 1, 5);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(114 + x, 94 + y, 1, 16);
        g2d.fillRect(118 + x, 95 + y, 1, 5);
        g2d.fillRect(105 + x, 97 + y, 1, 2);
        g2d.fillRect(109 + x, 98 + y, 1, 9);
        g2d.fillRect(104 + x, 99 + y, 1, 14);
        g2d.fillRect(98 + x, 100 + y, 1, 9);
        g2d.fillRect(119 + x, 100 + y, 1, 2);
        g2d.fillRect(103 + x, 101 + y, 1, 6);
        g2d.fillRect(115 + x, 101 + y, 1, 12);
        g2d.fillRect(108 + x, 102 + y, 1, 7);
        g2d.fillRect(120 + x, 102 + y, 1, 19);
        g2d.fillRect(97 + x, 103 + y, 1, 9);
        g2d.fillRect(101 + x, 103 + y, 1, 2);
        g2d.fillRect(102 + x, 103 + y, 1, 4);
        g2d.fillRect(100 + x, 104 + y, 1, 3);
        g2d.fillRect(126 + x, 104 + y, 1, 12);
        g2d.fillRect(121 + x, 105 + y, 1, 8);
        g2d.fillRect(99 + x, 106 + y, 1, 3);
        g2d.fillRect(113 + x, 106 + y, 1, 4);
        g2d.fillRect(116 + x, 106 + y, 1, 10);
        g2d.fillRect(101 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 14);
        g2d.fillRect(100 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(112 + x, 108 + y, 1, 1);
        g2d.fillRect(122 + x, 108 + y, 1, 5);
        g2d.fillRect(123 + x, 108 + y, 1, 2);
        g2d.fillRect(127 + x, 108 + y, 1, 12);
        g2d.fillRect(106 + x, 109 + y, 1, 4);
        g2d.fillRect(107 + x, 109 + y, 1, 3);
        g2d.fillRect(110 + x, 109 + y, 1, 1);
        g2d.fillRect(124 + x, 109 + y, 1, 4);
        g2d.fillRect(96 + x, 110 + y, 1, 7);
        g2d.fillRect(125 + x, 112 + y, 1, 4);
        g2d.fillRect(119 + x, 113 + y, 1, 19);
        g2d.fillRect(123 + x, 113 + y, 1, 1);
        g2d.fillRect(97 + x, 114 + y, 1, 3);
        g2d.fillRect(124 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 115 + y, 1, 7);
        g2d.fillRect(104 + x, 116 + y, 1, 6);
        g2d.fillRect(109 + x, 116 + y, 1, 5);
        g2d.fillRect(117 + x, 116 + y, 1, 4);
        g2d.fillRect(118 + x, 116 + y, 1, 5);
        g2d.fillRect(107 + x, 117 + y, 1, 5);
        g2d.fillRect(128 + x, 117 + y, 1, 10);
        g2d.fillRect(108 + x, 118 + y, 1, 13);
        g2d.fillRect(110 + x, 120 + y, 1, 3);
        g2d.fillRect(100 + x, 121 + y, 1, 3);
        g2d.fillRect(102 + x, 121 + y, 1, 2);
        g2d.fillRect(103 + x, 121 + y, 1, 1);
        g2d.fillRect(101 + x, 122 + y, 1, 2);
        g2d.fillRect(107 + x, 123 + y, 1, 6);
        g2d.fillRect(111 + x, 123 + y, 1, 4);
        g2d.fillRect(127 + x, 123 + y, 1, 9);
        g2d.fillRect(106 + x, 124 + y, 1, 4);
        g2d.fillRect(118 + x, 124 + y, 1, 9);
        g2d.fillRect(120 + x, 125 + y, 1, 8);
        g2d.fillRect(103 + x, 126 + y, 1, 2);
        g2d.fillRect(104 + x, 126 + y, 2, 1);
        g2d.fillRect(102 + x, 127 + y, 1, 3);
        g2d.fillRect(112 + x, 127 + y, 1, 2);
        g2d.fillRect(117 + x, 127 + y, 1, 6);
        g2d.fillRect(126 + x, 127 + y, 1, 6);
        g2d.fillRect(129 + x, 127 + y, 1, 15);
        g2d.fillRect(113 + x, 128 + y, 4, 1);
        g2d.fillRect(125 + x, 128 + y, 1, 8);
        g2d.fillRect(128 + x, 128 + y, 1, 4);
        g2d.fillRect(100 + x, 129 + y, 2, 1);
        g2d.fillRect(114 + x, 129 + y, 1, 2);
        g2d.fillRect(115 + x, 129 + y, 1, 6);
        g2d.fillRect(116 + x, 129 + y, 1, 15);
        g2d.fillRect(103 + x, 130 + y, 1, 29);
        g2d.fillRect(109 + x, 131 + y, 1, 2);
        g2d.fillRect(110 + x, 132 + y, 1, 3);
        g2d.fillRect(121 + x, 132 + y, 2, 1);
        g2d.fillRect(124 + x, 132 + y, 1, 4);
        g2d.fillRect(130 + x, 132 + y, 1, 8);
        g2d.fillRect(111 + x, 133 + y, 1, 6);
        g2d.fillRect(122 + x, 133 + y, 1, 2);
        g2d.fillRect(123 + x, 133 + y, 1, 3);
        g2d.fillRect(102 + x, 135 + y, 1, 19);
        g2d.fillRect(106 + x, 135 + y, 1, 12);
        g2d.fillRect(117 + x, 135 + y, 1, 8);
        g2d.fillRect(131 + x, 135 + y, 1, 11);
        g2d.fillRect(107 + x, 136 + y, 1, 6);
        g2d.fillRect(110 + x, 136 + y, 1, 3);
        g2d.fillRect(118 + x, 136 + y, 1, 6);
        g2d.fillRect(128 + x, 136 + y, 1, 6);
        g2d.fillRect(112 + x, 137 + y, 1, 5);
        g2d.fillRect(127 + x, 137 + y, 1, 5);
        g2d.fillRect(108 + x, 139 + y, 1, 3);
        g2d.fillRect(109 + x, 139 + y, 1, 3);
        g2d.fillRect(119 + x, 139 + y, 3, 1);
        g2d.fillRect(132 + x, 139 + y, 1, 19);
        g2d.fillRect(105 + x, 140 + y, 1, 6);
        g2d.fillRect(113 + x, 140 + y, 1, 3);
        g2d.fillRect(115 + x, 140 + y, 1, 6);
        g2d.fillRect(121 + x, 140 + y, 1, 2);
        g2d.fillRect(122 + x, 140 + y, 1, 4);
        g2d.fillRect(126 + x, 140 + y, 1, 3);
        g2d.fillRect(101 + x, 141 + y, 1, 10);
        g2d.fillRect(104 + x, 142 + y, 1, 8);
        g2d.fillRect(114 + x, 142 + y, 1, 1);
        g2d.fillRect(125 + x, 142 + y, 1, 2);
        g2d.fillRect(123 + x, 143 + y, 1, 2);
        g2d.fillRect(124 + x, 143 + y, 1, 1);
        g2d.fillRect(100 + x, 144 + y, 1, 3);
        g2d.fillRect(110 + x, 144 + y, 1, 4);
        g2d.fillRect(111 + x, 144 + y, 1, 2);
        g2d.fillRect(114 + x, 144 + y, 1, 8);
        g2d.fillRect(121 + x, 144 + y, 1, 22);
        g2d.fillRect(109 + x, 147 + y, 1, 15);
        g2d.fillRect(125 + x, 148 + y, 1, 6);
        g2d.fillRect(133 + x, 148 + y, 1, 3);
        g2d.fillRect(122 + x, 151 + y, 1, 15);
        g2d.fillRect(134 + x, 151 + y, 1, 4);
        g2d.fillRect(115 + x, 152 + y, 1, 4);
        g2d.fillRect(126 + x, 152 + y, 1, 11);
        g2d.fillRect(101 + x, 154 + y, 1, 3);
        g2d.fillRect(110 + x, 154 + y, 1, 8);
        g2d.fillRect(127 + x, 154 + y, 1, 9);
        g2d.fillRect(114 + x, 155 + y, 1, 3);
        g2d.fillRect(133 + x, 155 + y, 1, 4);
        g2d.fillRect(108 + x, 156 + y, 1, 3);
        g2d.fillRect(111 + x, 156 + y, 1, 6);
        g2d.fillRect(113 + x, 156 + y, 1, 3);
        g2d.fillRect(102 + x, 157 + y, 1, 3);
        g2d.fillRect(135 + x, 157 + y, 1, 3);
        g2d.fillRect(100 + x, 158 + y, 1, 3);
        g2d.fillRect(107 + x, 158 + y, 1, 4);
        g2d.fillRect(112 + x, 158 + y, 1, 9);
        g2d.fillRect(128 + x, 158 + y, 1, 6);
        g2d.fillRect(123 + x, 159 + y, 1, 6);
        g2d.fillRect(106 + x, 160 + y, 1, 5);
        g2d.fillRect(120 + x, 160 + y, 1, 6);
        g2d.fillRect(129 + x, 160 + y, 1, 5);
        g2d.fillRect(132 + x, 160 + y, 1, 5);
        g2d.fillRect(103 + x, 161 + y, 1, 4);
        g2d.fillRect(99 + x, 162 + y, 1, 4);
        g2d.fillRect(102 + x, 162 + y, 1, 3);
        g2d.fillRect(105 + x, 162 + y, 1, 1);
        g2d.fillRect(125 + x, 162 + y, 1, 2);
        g2d.fillRect(130 + x, 162 + y, 1, 1);
        g2d.fillRect(133 + x, 162 + y, 1, 3);
        g2d.fillRect(136 + x, 162 + y, 1, 4);
        g2d.fillRect(107 + x, 163 + y, 1, 1);
        g2d.fillRect(111 + x, 163 + y, 1, 3);
        g2d.fillRect(124 + x, 163 + y, 1, 1);
        g2d.fillRect(101 + x, 164 + y, 1, 2);
        g2d.fillRect(104 + x, 164 + y, 2, 1);
        g2d.fillRect(108 + x, 164 + y, 2, 1);
        g2d.fillRect(116 + x, 164 + y, 4, 1);
        g2d.fillRect(130 + x, 164 + y, 2, 1);
        g2d.fillRect(134 + x, 164 + y, 1, 2);
        g2d.fillRect(109 + x, 165 + y, 2, 1);
        g2d.fillRect(113 + x, 165 + y, 1, 2);
        g2d.fillRect(114 + x, 165 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 85 + y, 1, 6);
        g2d.fillRect(113 + x, 85 + y, 1, 5);
        g2d.fillRect(114 + x, 85 + y, 1, 8);
        g2d.fillRect(115 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 4);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 86 + y, 1, 6);
        g2d.fillRect(111 + x, 86 + y, 1, 18);
        g2d.fillRect(117 + x, 86 + y, 1, 5);
        g2d.fillRect(107 + x, 87 + y, 1, 4);
        g2d.fillRect(118 + x, 87 + y, 1, 4);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(105 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 92 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 3);
        g2d.fillRect(107 + x, 93 + y, 1, 3);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(122 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 94 + y, 1, 5);
        g2d.fillRect(117 + x, 94 + y, 1, 4);
        g2d.fillRect(123 + x, 94 + y, 1, 4);
        g2d.fillRect(104 + x, 95 + y, 1, 4);
        g2d.fillRect(105 + x, 95 + y, 1, 2);
        g2d.fillRect(109 + x, 95 + y, 1, 3);
        g2d.fillRect(124 + x, 96 + y, 1, 6);
        g2d.fillRect(103 + x, 97 + y, 1, 4);
        g2d.fillRect(106 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 4);
        g2d.fillRect(119 + x, 97 + y, 1, 3);
        g2d.fillRect(120 + x, 97 + y, 1, 5);
        g2d.fillRect(99 + x, 98 + y, 1, 8);
        g2d.fillRect(110 + x, 98 + y, 1, 11);
        g2d.fillRect(102 + x, 99 + y, 1, 4);
        g2d.fillRect(105 + x, 99 + y, 1, 2);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(121 + x, 100 + y, 1, 5);
        g2d.fillRect(101 + x, 101 + y, 1, 2);
        g2d.fillRect(125 + x, 101 + y, 1, 11);
        g2d.fillRect(119 + x, 102 + y, 1, 3);
        g2d.fillRect(122 + x, 102 + y, 1, 6);
        g2d.fillRect(100 + x, 103 + y, 1, 1);
        g2d.fillRect(107 + x, 103 + y, 1, 6);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(101 + x, 105 + y, 1, 2);
        g2d.fillRect(123 + x, 105 + y, 1, 3);
        g2d.fillRect(100 + x, 107 + y, 1, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 4);
        g2d.fillRect(103 + x, 107 + y, 1, 9);
        g2d.fillRect(109 + x, 107 + y, 1, 2);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 8);
        g2d.fillRect(124 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 1, 6);
        g2d.fillRect(99 + x, 109 + y, 1, 3);
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(108 + x, 109 + y, 1, 1);
        g2d.fillRect(112 + x, 109 + y, 1, 4);
        g2d.fillRect(110 + x, 110 + y, 1, 10);
        g2d.fillRect(111 + x, 110 + y, 1, 13);
        g2d.fillRect(113 + x, 110 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 3);
        g2d.fillRect(123 + x, 110 + y, 1, 3);
        g2d.fillRect(107 + x, 112 + y, 1, 1);
        g2d.fillRect(97 + x, 113 + y, 1, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 3);
        g2d.fillRect(106 + x, 113 + y, 1, 2);
        g2d.fillRect(115 + x, 113 + y, 1, 3);
        g2d.fillRect(121 + x, 113 + y, 1, 12);
        g2d.fillRect(122 + x, 113 + y, 1, 5);
        g2d.fillRect(124 + x, 113 + y, 1, 1);
        g2d.fillRect(123 + x, 114 + y, 1, 2);
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 1);
        g2d.fillRect(124 + x, 116 + y, 3, 1);
        g2d.fillRect(125 + x, 117 + y, 1, 3);
        g2d.fillRect(126 + x, 117 + y, 1, 7);
        g2d.fillRect(102 + x, 118 + y, 1, 3);
        g2d.fillRect(103 + x, 119 + y, 1, 2);
        g2d.fillRect(117 + x, 120 + y, 1, 1);
        g2d.fillRect(127 + x, 120 + y, 1, 3);
        g2d.fillRect(105 + x, 121 + y, 1, 3);
        g2d.fillRect(109 + x, 121 + y, 1, 4);
        g2d.fillRect(112 + x, 121 + y, 1, 6);
        g2d.fillRect(118 + x, 121 + y, 1, 3);
        g2d.fillRect(120 + x, 121 + y, 1, 4);
        g2d.fillRect(106 + x, 122 + y, 2, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 4);
        g2d.fillRect(113 + x, 124 + y, 1, 4);
        g2d.fillRect(104 + x, 125 + y, 2, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 3);
        g2d.fillRect(126 + x, 125 + y, 1, 2);
        g2d.fillRect(101 + x, 126 + y, 1, 3);
        g2d.fillRect(102 + x, 126 + y, 1, 1);
        g2d.fillRect(104 + x, 127 + y, 1, 2);
        g2d.fillRect(105 + x, 127 + y, 1, 2);
        g2d.fillRect(111 + x, 127 + y, 1, 2);
        g2d.fillRect(128 + x, 127 + y, 1, 1);
        g2d.fillRect(100 + x, 128 + y, 1, 1);
        g2d.fillRect(103 + x, 128 + y, 1, 2);
        g2d.fillRect(106 + x, 128 + y, 1, 5);
        g2d.fillRect(109 + x, 128 + y, 1, 3);
        g2d.fillRect(122 + x, 128 + y, 1, 4);
        g2d.fillRect(107 + x, 129 + y, 1, 7);
        g2d.fillRect(113 + x, 129 + y, 1, 3);
        g2d.fillRect(121 + x, 129 + y, 1, 3);
        g2d.fillRect(102 + x, 130 + y, 1, 5);
        g2d.fillRect(104 + x, 130 + y, 1, 12);
        g2d.fillRect(105 + x, 130 + y, 1, 1);
        g2d.fillRect(108 + x, 131 + y, 1, 5);
        g2d.fillRect(110 + x, 131 + y, 1, 1);
        g2d.fillRect(114 + x, 131 + y, 1, 4);
        g2d.fillRect(111 + x, 132 + y, 1, 1);
        g2d.fillRect(119 + x, 132 + y, 1, 4);
        g2d.fillRect(127 + x, 132 + y, 1, 4);
        g2d.fillRect(128 + x, 132 + y, 1, 4);
        g2d.fillRect(117 + x, 133 + y, 1, 2);
        g2d.fillRect(118 + x, 133 + y, 1, 2);
        g2d.fillRect(126 + x, 133 + y, 1, 2);
        g2d.fillRect(110 + x, 135 + y, 1, 1);
        g2d.fillRect(112 + x, 135 + y, 1, 2);
        g2d.fillRect(115 + x, 135 + y, 1, 1);
        g2d.fillRect(113 + x, 136 + y, 1, 4);
        g2d.fillRect(105 + x, 137 + y, 1, 3);
        g2d.fillRect(108 + x, 137 + y, 1, 2);
        g2d.fillRect(109 + x, 137 + y, 1, 2);
        g2d.fillRect(119 + x, 137 + y, 1, 2);
        g2d.fillRect(120 + x, 137 + y, 1, 2);
        g2d.fillRect(110 + x, 139 + y, 1, 3);
        g2d.fillRect(111 + x, 139 + y, 1, 3);
        g2d.fillRect(114 + x, 139 + y, 1, 3);
        g2d.fillRect(115 + x, 139 + y, 1, 1);
        g2d.fillRect(122 + x, 139 + y, 2, 1);
        g2d.fillRect(126 + x, 139 + y, 1, 1);
        g2d.fillRect(119 + x, 140 + y, 1, 3);
        g2d.fillRect(120 + x, 140 + y, 1, 3);
        g2d.fillRect(123 + x, 140 + y, 1, 3);
        g2d.fillRect(125 + x, 140 + y, 1, 2);
        g2d.fillRect(130 + x, 140 + y, 1, 16);
        g2d.fillRect(107 + x, 142 + y, 1, 8);
        g2d.fillRect(108 + x, 142 + y, 1, 4);
        g2d.fillRect(109 + x, 142 + y, 1, 5);
        g2d.fillRect(112 + x, 142 + y, 1, 1);
        g2d.fillRect(118 + x, 142 + y, 1, 6);
        g2d.fillRect(121 + x, 142 + y, 1, 2);
        g2d.fillRect(124 + x, 142 + y, 1, 1);
        g2d.fillRect(127 + x, 142 + y, 1, 1);
        g2d.fillRect(100 + x, 143 + y, 1, 1);
        g2d.fillRect(113 + x, 143 + y, 1, 5);
        g2d.fillRect(114 + x, 143 + y, 1, 1);
        g2d.fillRect(117 + x, 143 + y, 1, 11);
        g2d.fillRect(126 + x, 143 + y, 1, 1);
        g2d.fillRect(129 + x, 143 + y, 1, 3);
        g2d.fillRect(112 + x, 144 + y, 1, 2);
        g2d.fillRect(116 + x, 144 + y, 1, 12);
        g2d.fillRect(119 + x, 144 + y, 1, 2);
        g2d.fillRect(120 + x, 144 + y, 1, 16);
        g2d.fillRect(122 + x, 144 + y, 1, 7);
        g2d.fillRect(125 + x, 144 + y, 1, 4);
        g2d.fillRect(127 + x, 144 + y, 1, 2);
        g2d.fillRect(128 + x, 144 + y, 1, 2);
        g2d.fillRect(105 + x, 146 + y, 1, 13);
        g2d.fillRect(115 + x, 146 + y, 1, 6);
        g2d.fillRect(131 + x, 146 + y, 1, 13);
        g2d.fillRect(106 + x, 147 + y, 1, 3);
        g2d.fillRect(126 + x, 147 + y, 1, 5);
        g2d.fillRect(110 + x, 148 + y, 1, 6);
        g2d.fillRect(104 + x, 150 + y, 1, 10);
        g2d.fillRect(127 + x, 150 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 4);
        g2d.fillRect(113 + x, 152 + y, 1, 4);
        g2d.fillRect(114 + x, 152 + y, 1, 3);
        g2d.fillRect(119 + x, 154 + y, 1, 10);
        g2d.fillRect(125 + x, 154 + y, 1, 8);
        g2d.fillRect(112 + x, 155 + y, 1, 3);
        g2d.fillRect(107 + x, 156 + y, 1, 2);
        g2d.fillRect(115 + x, 156 + y, 1, 2);
        g2d.fillRect(128 + x, 156 + y, 1, 2);
        g2d.fillRect(114 + x, 158 + y, 1, 1);
        g2d.fillRect(118 + x, 158 + y, 1, 6);
        g2d.fillRect(132 + x, 158 + y, 1, 2);
        g2d.fillRect(103 + x, 159 + y, 1, 2);
        g2d.fillRect(106 + x, 159 + y, 1, 1);
        g2d.fillRect(108 + x, 159 + y, 1, 5);
        g2d.fillRect(113 + x, 159 + y, 1, 4);
        g2d.fillRect(133 + x, 159 + y, 1, 3);
        g2d.fillRect(102 + x, 160 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 4);
        g2d.fillRect(117 + x, 160 + y, 1, 4);
        g2d.fillRect(131 + x, 160 + y, 1, 4);
        g2d.fillRect(134 + x, 160 + y, 1, 4);
        g2d.fillRect(101 + x, 161 + y, 1, 3);
        g2d.fillRect(104 + x, 161 + y, 1, 3);
        g2d.fillRect(107 + x, 162 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 1, 2);
        g2d.fillRect(110 + x, 162 + y, 2, 1);
        g2d.fillRect(124 + x, 162 + y, 1, 1);
        g2d.fillRect(105 + x, 163 + y, 1, 1);
        g2d.fillRect(115 + x, 163 + y, 1, 2);
        g2d.fillRect(130 + x, 163 + y, 1, 1);
        g2d.fillRect(100 + x, 164 + y, 1, 3);
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(135 + x, 164 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(115 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 4);
        g2d.fillRect(113 + x, 90 + y, 1, 14);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 2, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(120 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 97 + y, 1, 2);
        g2d.fillRect(121 + x, 97 + y, 1, 3);
        g2d.fillRect(100 + x, 99 + y, 1, 4);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(122 + x, 100 + y, 1, 2);
        g2d.fillRect(116 + x, 102 + y, 1, 2);
        g2d.fillRect(124 + x, 102 + y, 1, 6);
        g2d.fillRect(111 + x, 104 + y, 1, 1);
        g2d.fillRect(106 + x, 106 + y, 1, 3);
        g2d.fillRect(111 + x, 106 + y, 1, 2);
        g2d.fillRect(112 + x, 106 + y, 1, 2);
        g2d.fillRect(101 + x, 109 + y, 1, 6);
        g2d.fillRect(109 + x, 109 + y, 1, 2);
        g2d.fillRect(100 + x, 110 + y, 1, 3);
        g2d.fillRect(108 + x, 110 + y, 1, 1);
        g2d.fillRect(102 + x, 111 + y, 1, 7);
        g2d.fillRect(99 + x, 112 + y, 1, 2);
        g2d.fillRect(118 + x, 112 + y, 1, 4);
        g2d.fillRect(114 + x, 113 + y, 1, 4);
        g2d.fillRect(98 + x, 115 + y, 1, 1);
        g2d.fillRect(103 + x, 116 + y, 1, 3);
        g2d.fillRect(107 + x, 116 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 2);
        g2d.fillRect(123 + x, 116 + y, 1, 8);
        g2d.fillRect(112 + x, 117 + y, 1, 4);
        g2d.fillRect(116 + x, 117 + y, 1, 1);
        g2d.fillRect(124 + x, 117 + y, 1, 4);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(122 + x, 118 + y, 1, 10);
        g2d.fillRect(101 + x, 120 + y, 1, 2);
        g2d.fillRect(125 + x, 120 + y, 1, 3);
        g2d.fillRect(104 + x, 123 + y, 1, 2);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(105 + x, 124 + y, 1, 1);
        g2d.fillRect(126 + x, 124 + y, 1, 1);
        g2d.fillRect(103 + x, 125 + y, 1, 1);
        g2d.fillRect(109 + x, 125 + y, 1, 3);
        g2d.fillRect(117 + x, 125 + y, 1, 2);
        g2d.fillRect(121 + x, 125 + y, 1, 4);
        g2d.fillRect(100 + x, 126 + y, 1, 2);
        g2d.fillRect(110 + x, 127 + y, 1, 2);
        g2d.fillRect(123 + x, 128 + y, 1, 1);
        g2d.fillRect(104 + x, 129 + y, 2, 1);
        g2d.fillRect(112 + x, 129 + y, 1, 2);
        g2d.fillRect(100 + x, 130 + y, 2, 1);
        g2d.fillRect(101 + x, 131 + y, 1, 7);
        g2d.fillRect(123 + x, 131 + y, 1, 2);
        g2d.fillRect(113 + x, 132 + y, 1, 1);
        g2d.fillRect(106 + x, 133 + y, 1, 2);
        g2d.fillRect(109 + x, 133 + y, 1, 4);
        g2d.fillRect(114 + x, 135 + y, 1, 4);
        g2d.fillRect(118 + x, 135 + y, 1, 1);
        g2d.fillRect(120 + x, 135 + y, 1, 2);
        g2d.fillRect(105 + x, 136 + y, 1, 1);
        g2d.fillRect(108 + x, 136 + y, 1, 1);
        g2d.fillRect(115 + x, 136 + y, 1, 3);
        g2d.fillRect(119 + x, 136 + y, 1, 1);
        g2d.fillRect(127 + x, 136 + y, 1, 1);
        g2d.fillRect(121 + x, 137 + y, 1, 2);
        g2d.fillRect(125 + x, 137 + y, 1, 3);
        g2d.fillRect(126 + x, 137 + y, 1, 2);
        g2d.fillRect(124 + x, 138 + y, 1, 4);
        g2d.fillRect(100 + x, 142 + y, 1, 1);
        g2d.fillRect(110 + x, 142 + y, 1, 2);
        g2d.fillRect(128 + x, 142 + y, 1, 2);
        g2d.fillRect(129 + x, 142 + y, 1, 1);
        g2d.fillRect(112 + x, 143 + y, 1, 1);
        g2d.fillRect(119 + x, 143 + y, 2, 1);
        g2d.fillRect(127 + x, 143 + y, 1, 1);
        g2d.fillRect(124 + x, 144 + y, 1, 2);
        g2d.fillRect(126 + x, 144 + y, 1, 3);
        g2d.fillRect(123 + x, 145 + y, 1, 10);
        g2d.fillRect(108 + x, 146 + y, 1, 2);
        g2d.fillRect(111 + x, 146 + y, 1, 5);
        g2d.fillRect(128 + x, 146 + y, 2, 1);
        g2d.fillRect(129 + x, 147 + y, 1, 7);
        g2d.fillRect(113 + x, 148 + y, 1, 4);
        g2d.fillRect(118 + x, 148 + y, 1, 3);
        g2d.fillRect(127 + x, 148 + y, 1, 2);
        g2d.fillRect(106 + x, 150 + y, 1, 1);
        g2d.fillRect(108 + x, 151 + y, 1, 1);
        g2d.fillRect(106 + x, 152 + y, 1, 2);
        g2d.fillRect(112 + x, 152 + y, 1, 3);
        g2d.fillRect(119 + x, 152 + y, 1, 2);
        g2d.fillRect(107 + x, 154 + y, 1, 2);
        g2d.fillRect(117 + x, 154 + y, 1, 1);
        g2d.fillRect(111 + x, 155 + y, 1, 1);
        g2d.fillRect(118 + x, 155 + y, 1, 3);
        g2d.fillRect(116 + x, 156 + y, 1, 2);
        g2d.fillRect(130 + x, 156 + y, 1, 3);
        g2d.fillRect(106 + x, 158 + y, 1, 1);
        g2d.fillRect(117 + x, 158 + y, 1, 2);
        g2d.fillRect(105 + x, 159 + y, 1, 1);
        g2d.fillRect(116 + x, 159 + y, 1, 1);
        g2d.fillRect(131 + x, 159 + y, 1, 1);
        g2d.fillRect(104 + x, 160 + y, 1, 1);
        g2d.fillRect(115 + x, 160 + y, 1, 3);
        g2d.fillRect(124 + x, 160 + y, 1, 2);
        g2d.fillRect(110 + x, 164 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 90 + y, 1, 4);
        g2d.fillRect(119 + x, 90 + y, 1, 5);
        g2d.fillRect(104 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 15);
        g2d.fillRect(118 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 1, 4);
        g2d.fillRect(103 + x, 92 + y, 1, 3);
        g2d.fillRect(109 + x, 92 + y, 1, 3);
        g2d.fillRect(110 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 2, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 4);
        g2d.fillRect(102 + x, 94 + y, 1, 3);
        g2d.fillRect(115 + x, 94 + y, 1, 3);
        g2d.fillRect(108 + x, 95 + y, 1, 4);
        g2d.fillRect(122 + x, 95 + y, 1, 5);
        g2d.fillRect(101 + x, 96 + y, 1, 5);
        g2d.fillRect(107 + x, 96 + y, 1, 7);
        g2d.fillRect(116 + x, 97 + y, 1, 5);
        g2d.fillRect(106 + x, 98 + y, 1, 8);
        g2d.fillRect(117 + x, 98 + y, 1, 10);
        g2d.fillRect(123 + x, 98 + y, 1, 7);
        g2d.fillRect(105 + x, 101 + y, 1, 6);
        g2d.fillRect(118 + x, 101 + y, 1, 11);
        g2d.fillRect(113 + x, 104 + y, 1, 2);
        g2d.fillRect(111 + x, 105 + y, 1, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 8);
        g2d.fillRect(108 + x, 111 + y, 1, 7);
        g2d.fillRect(109 + x, 111 + y, 1, 5);
        g2d.fillRect(113 + x, 112 + y, 1, 12);
        g2d.fillRect(100 + x, 113 + y, 1, 8);
        g2d.fillRect(107 + x, 113 + y, 1, 3);
        g2d.fillRect(112 + x, 113 + y, 1, 4);
        g2d.fillRect(99 + x, 114 + y, 1, 3);
        g2d.fillRect(101 + x, 115 + y, 1, 3);
        g2d.fillRect(114 + x, 117 + y, 1, 8);
        g2d.fillRect(115 + x, 118 + y, 1, 10);
        g2d.fillRect(116 + x, 118 + y, 1, 10);
        g2d.fillRect(101 + x, 119 + y, 1, 1);
        g2d.fillRect(117 + x, 121 + y, 1, 4);
        g2d.fillRect(124 + x, 121 + y, 1, 11);
        g2d.fillRect(103 + x, 122 + y, 1, 3);
        g2d.fillRect(104 + x, 122 + y, 1, 1);
        g2d.fillRect(102 + x, 123 + y, 1, 3);
        g2d.fillRect(125 + x, 123 + y, 1, 5);
        g2d.fillRect(100 + x, 124 + y, 1, 2);
        g2d.fillRect(101 + x, 124 + y, 1, 2);
        g2d.fillRect(123 + x, 124 + y, 1, 4);
        g2d.fillRect(110 + x, 129 + y, 1, 2);
        g2d.fillRect(111 + x, 129 + y, 1, 3);
        g2d.fillRect(123 + x, 129 + y, 1, 2);
        g2d.fillRect(100 + x, 131 + y, 1, 11);
        g2d.fillRect(105 + x, 131 + y, 1, 5);
        g2d.fillRect(112 + x, 131 + y, 1, 4);
        g2d.fillRect(113 + x, 133 + y, 1, 3);
        g2d.fillRect(120 + x, 133 + y, 1, 2);
        g2d.fillRect(121 + x, 133 + y, 1, 4);
        g2d.fillRect(122 + x, 135 + y, 1, 4);
        g2d.fillRect(126 + x, 135 + y, 1, 2);
        g2d.fillRect(123 + x, 136 + y, 1, 3);
        g2d.fillRect(124 + x, 136 + y, 1, 2);
        g2d.fillRect(125 + x, 136 + y, 1, 1);
        g2d.fillRect(101 + x, 138 + y, 1, 3);
        g2d.fillRect(111 + x, 142 + y, 1, 2);
        g2d.fillRect(112 + x, 146 + y, 1, 6);
        g2d.fillRect(119 + x, 146 + y, 1, 6);
        g2d.fillRect(124 + x, 146 + y, 1, 14);
        g2d.fillRect(127 + x, 146 + y, 1, 2);
        g2d.fillRect(128 + x, 147 + y, 1, 9);
        g2d.fillRect(108 + x, 148 + y, 1, 3);
        g2d.fillRect(107 + x, 150 + y, 1, 4);
        g2d.fillRect(106 + x, 151 + y, 1, 1);
        g2d.fillRect(111 + x, 151 + y, 1, 4);
        g2d.fillRect(118 + x, 151 + y, 1, 4);
        g2d.fillRect(127 + x, 151 + y, 1, 3);
        g2d.fillRect(133 + x, 151 + y, 1, 4);
        g2d.fillRect(102 + x, 154 + y, 1, 3);
        g2d.fillRect(106 + x, 154 + y, 1, 4);
        g2d.fillRect(129 + x, 154 + y, 1, 6);
        g2d.fillRect(117 + x, 155 + y, 1, 3);
        g2d.fillRect(123 + x, 155 + y, 1, 4);
        g2d.fillRect(134 + x, 155 + y, 1, 5);
        g2d.fillRect(101 + x, 157 + y, 1, 4);
        g2d.fillRect(115 + x, 158 + y, 1, 2);
        g2d.fillRect(116 + x, 158 + y, 1, 1);
        g2d.fillRect(114 + x, 159 + y, 1, 5);
        g2d.fillRect(130 + x, 159 + y, 1, 3);
        g2d.fillRect(105 + x, 160 + y, 1, 2);
        g2d.fillRect(135 + x, 160 + y, 1, 4);
        g2d.fillRect(100 + x, 161 + y, 1, 3);
        g2d.fillRect(110 + x, 163 + y, 1, 1);
        g2d.fillRect(113 + x, 163 + y, 1, 2);
    }
}
