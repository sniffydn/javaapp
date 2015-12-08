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
public class Skrt7 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt7()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt7(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt7(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        return new obsolete.D41Helper(middle, c);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);
        paintTL1(x,prevY,g2d);
        paintTL2(x,y + prevY,g2d);


    }
    int prevY = 0;


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU1(x,y,g2d);
        paintTU2(x,y,g2d);
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

    public void paintTU2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 3, 1);
        g2d.fillRect(116 + x, 59 + y, 3, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 3);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 3);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 3);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(115 + x, 59 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 60 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 12, 1);
        g2d.fillRect(101 + x, 58 + y, 6, 1);
        g2d.fillRect(113 + x, 58 + y, 6, 1);
        g2d.fillRect(108 + x, 60 + y, 3, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 53 + y, 4, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 2, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(99 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 3);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 3, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 54 + y, 1, 3);
        g2d.fillRect(103 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 1, 3);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(120 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 78 + y, 1, 11);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 1, 12);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 4);
        g2d.fillRect(120 + x, 84 + y, 1, 15);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(122 + x, 87 + y, 1, 5);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 7);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(123 + x, 96 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 6);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 19);
        g2d.fillRect(120 + x, 80 + y, 1, 4);
        g2d.fillRect(99 + x, 82 + y, 1, 3);
        g2d.fillRect(118 + x, 82 + y, 1, 7);
        g2d.fillRect(121 + x, 84 + y, 1, 8);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 4);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 6);
        g2d.fillRect(113 + x, 92 + y, 1, 7);
        g2d.fillRect(117 + x, 92 + y, 1, 7);
        g2d.fillRect(122 + x, 92 + y, 1, 7);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 79 + y, 1, 20);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 82 + y, 1, 14);
        g2d.fillRect(99 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 10);
        g2d.fillRect(98 + x, 91 + y, 1, 4);
        g2d.fillRect(104 + x, 91 + y, 1, 8);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 8);
        g2d.fillRect(114 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 95 + y, 1, 4);
        g2d.fillRect(119 + x, 95 + y, 1, 4);
        g2d.fillRect(101 + x, 97 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 78 + y, 1, 21);
        g2d.fillRect(101 + x, 79 + y, 1, 13);
        g2d.fillRect(103 + x, 80 + y, 1, 19);
        g2d.fillRect(104 + x, 80 + y, 1, 11);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(107 + x, 80 + y, 1, 19);
        g2d.fillRect(108 + x, 80 + y, 1, 15);
        g2d.fillRect(109 + x, 80 + y, 1, 19);
        g2d.fillRect(111 + x, 80 + y, 1, 19);
        g2d.fillRect(112 + x, 80 + y, 1, 19);
        g2d.fillRect(114 + x, 80 + y, 1, 12);
        g2d.fillRect(115 + x, 81 + y, 1, 8);
        g2d.fillRect(100 + x, 82 + y, 1, 17);
        g2d.fillRect(106 + x, 82 + y, 1, 17);
        g2d.fillRect(99 + x, 87 + y, 1, 9);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 3);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 114 + y, 2, 1);
        g2d.fillRect(122 + x, 114 + y, 2, 1);
        g2d.fillRect(101 + x, 115 + y, 4, 1);
        g2d.fillRect(119 + x, 115 + y, 2, 1);
        g2d.fillRect(105 + x, 116 + y, 14, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 18);
        g2d.fillRect(120 + x, 98 + y, 2, 1);
        g2d.fillRect(123 + x, 98 + y, 1, 3);
        g2d.fillRect(110 + x, 99 + y, 1, 1);
        g2d.fillRect(121 + x, 99 + y, 1, 11);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(122 + x, 103 + y, 1, 11);
        g2d.fillRect(124 + x, 105 + y, 1, 4);
        g2d.fillRect(110 + x, 109 + y, 1, 7);
        g2d.fillRect(113 + x, 110 + y, 1, 6);
        g2d.fillRect(100 + x, 111 + y, 1, 4);
        g2d.fillRect(103 + x, 113 + y, 1, 2);
        g2d.fillRect(108 + x, 113 + y, 1, 3);
        g2d.fillRect(109 + x, 114 + y, 1, 2);
        g2d.fillRect(114 + x, 114 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(97 + x, 95 + y, 1, 5);
        g2d.fillRect(113 + x, 98 + y, 1, 12);
        g2d.fillRect(116 + x, 98 + y, 1, 18);
        g2d.fillRect(122 + x, 98 + y, 1, 5);
        g2d.fillRect(120 + x, 99 + y, 1, 7);
        g2d.fillRect(114 + x, 100 + y, 1, 14);
        g2d.fillRect(110 + x, 101 + y, 1, 8);
        g2d.fillRect(123 + x, 101 + y, 1, 5);
        g2d.fillRect(96 + x, 104 + y, 1, 4);
        g2d.fillRect(108 + x, 105 + y, 1, 8);
        g2d.fillRect(118 + x, 105 + y, 1, 11);
        g2d.fillRect(100 + x, 106 + y, 1, 5);
        g2d.fillRect(109 + x, 106 + y, 1, 8);
        g2d.fillRect(103 + x, 109 + y, 1, 4);
        g2d.fillRect(124 + x, 109 + y, 1, 5);
        g2d.fillRect(115 + x, 110 + y, 1, 6);
        g2d.fillRect(121 + x, 110 + y, 1, 5);
        g2d.fillRect(101 + x, 111 + y, 1, 4);
        g2d.fillRect(123 + x, 111 + y, 1, 3);
        g2d.fillRect(102 + x, 113 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 96 + y, 1, 9);
        g2d.fillRect(101 + x, 98 + y, 1, 13);
        g2d.fillRect(109 + x, 98 + y, 2, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 2);
        g2d.fillRect(115 + x, 98 + y, 1, 12);
        g2d.fillRect(118 + x, 98 + y, 1, 7);
        g2d.fillRect(119 + x, 98 + y, 1, 3);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(97 + x, 100 + y, 1, 4);
        g2d.fillRect(100 + x, 100 + y, 1, 6);
        g2d.fillRect(109 + x, 100 + y, 1, 6);
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 8);
        g2d.fillRect(104 + x, 101 + y, 1, 9);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 1);
        g2d.fillRect(120 + x, 106 + y, 1, 5);
        g2d.fillRect(123 + x, 106 + y, 1, 5);
        g2d.fillRect(96 + x, 108 + y, 1, 6);
        g2d.fillRect(112 + x, 108 + y, 1, 8);
        g2d.fillRect(102 + x, 109 + y, 1, 4);
        g2d.fillRect(99 + x, 110 + y, 1, 4);
        g2d.fillRect(107 + x, 111 + y, 1, 5);
        g2d.fillRect(111 + x, 114 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(98 + x, 95 + y, 1, 19);
        g2d.fillRect(99 + x, 95 + y, 1, 15);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 98 + y, 1, 2);
        g2d.fillRect(102 + x, 98 + y, 1, 11);
        g2d.fillRect(103 + x, 98 + y, 1, 3);
        g2d.fillRect(105 + x, 98 + y, 1, 18);
        g2d.fillRect(106 + x, 98 + y, 1, 18);
        g2d.fillRect(107 + x, 98 + y, 1, 13);
        g2d.fillRect(111 + x, 98 + y, 1, 16);
        g2d.fillRect(112 + x, 98 + y, 1, 10);
        g2d.fillRect(109 + x, 99 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 2);
        g2d.fillRect(97 + x, 104 + y, 1, 10);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 9);
        g2d.fillRect(104 + x, 110 + y, 1, 5);
        g2d.fillRect(120 + x, 111 + y, 1, 4);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(120 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(113 + x, 60 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(115 + x, 61 + y, 1, 12);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 7);
        g2d.fillRect(117 + x, 70 + y, 1, 11);
        g2d.fillRect(114 + x, 71 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 78 + y, 1, 3);
        g2d.fillRect(119 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 60 + y, 7, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 4);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 3);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 4);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 3);
        g2d.fillRect(115 + x, 73 + y, 1, 4);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 6);
        g2d.fillRect(101 + x, 76 + y, 1, 3);
        g2d.fillRect(118 + x, 76 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 61 + y, 6, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 2, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 14);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 4);
        g2d.fillRect(104 + x, 65 + y, 1, 7);
        g2d.fillRect(105 + x, 65 + y, 1, 6);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 13);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(111 + x, 75 + y, 1, 3);
        g2d.fillRect(114 + x, 76 + y, 1, 4);
        g2d.fillRect(115 + x, 77 + y, 1, 3);
        g2d.fillRect(106 + x, 78 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(106 + x, 62 + y, 1, 6);
        g2d.fillRect(107 + x, 62 + y, 1, 19);
        g2d.fillRect(108 + x, 62 + y, 1, 19);
        g2d.fillRect(109 + x, 62 + y, 1, 19);
        g2d.fillRect(110 + x, 62 + y, 1, 4);
        g2d.fillRect(111 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 9);
        g2d.fillRect(110 + x, 67 + y, 1, 13);
        g2d.fillRect(106 + x, 69 + y, 1, 9);
        g2d.fillRect(105 + x, 71 + y, 1, 10);
        g2d.fillRect(104 + x, 73 + y, 1, 8);
        g2d.fillRect(103 + x, 75 + y, 1, 6);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(112 + x, 77 + y, 1, 4);
        g2d.fillRect(111 + x, 78 + y, 1, 3);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
    }





    public void paintTU1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 45 + y, 1, 4);
        g2d.fillRect(106 + x, 47 + y, 1, 5);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 2, 1);
        g2d.fillRect(102 + x, 48 + y, 3, 1);
        g2d.fillRect(109 + x, 48 + y, 4, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(115 + x, 48 + y, 1, 4);
        g2d.fillRect(100 + x, 49 + y, 1, 6);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 3, 1);
        g2d.fillRect(118 + x, 49 + y, 2, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 5);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 4);
        g2d.fillRect(110 + x, 50 + y, 1, 3);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 4);
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 4, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 52 + y, 3, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 5);
        g2d.fillRect(113 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 3);
        g2d.fillRect(116 + x, 54 + y, 1, 3);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 3, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 45 + y, 1, 2);
        g2d.fillRect(107 + x, 45 + y, 2, 1);
        g2d.fillRect(108 + x, 46 + y, 2, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 46 + y, 1, 3);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 47 + y, 3, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 3);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 3, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 2, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(107 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 2, 1);
        g2d.fillRect(112 + x, 50 + y, 3, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 53 + y, 1, 1);
    }
}
