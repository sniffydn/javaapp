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
public class Skrt3 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt3()
    {
        super();
        containsTL = true;
        containsB = true;
    }

    public Skrt3(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
    }

    public Skrt3(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);

        if(y == 1)
            y = 0;
        paintTL1(x, y, g2d);
        paintTL2(x, y + prevY, g2d);
        paintTL3(x, y + prevY + prevPrevY, g2d);

        paintTL(x,0,g2d);

        prevPrevY = prevY;
        prevY = y;
    }
    int prevY = 0;
    int prevPrevY = 0;

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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(121 + x, 77 + y, 1, 3);
        g2d.fillRect(119 + x, 79 + y, 1, 1);
        g2d.fillRect(99 + x, 80 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 5);
        g2d.fillRect(102 + x, 80 + y, 4, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 5);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 4, 1);
        g2d.fillRect(122 + x, 80 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 4);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 2, 1);
        g2d.fillRect(119 + x, 81 + y, 3, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 1);
        g2d.fillRect(99 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 2, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 76 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 3, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 3);
        g2d.fillRect(119 + x, 82 + y, 2, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(105 + x, 78 + y, 2, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 2, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 3);
        g2d.fillRect(102 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 77 + y, 1, 2);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 2);
        g2d.fillRect(117 + x, 79 + y, 2, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 77 + y, 1, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 5);
        g2d.fillRect(101 + x, 85 + y, 1, 5);
        g2d.fillRect(115 + x, 85 + y, 1, 3);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(120 + x, 85 + y, 4, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 4);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 4);
        g2d.fillRect(116 + x, 86 + y, 1, 3);
        g2d.fillRect(121 + x, 86 + y, 2, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 5);
        g2d.fillRect(123 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 3);
        g2d.fillRect(114 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 2, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 3);
        g2d.fillRect(121 + x, 88 + y, 1, 3);
        g2d.fillRect(99 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 2, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 93 + y, 1, 3);
        g2d.fillRect(109 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 3, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(117 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 2, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(111 + x, 81 + y, 1, 4);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(123 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 2, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 92 + y, 2, 1);
        g2d.fillRect(105 + x, 92 + y, 1, 2);
        g2d.fillRect(123 + x, 92 + y, 1, 5);
        g2d.fillRect(100 + x, 93 + y, 1, 4);
        g2d.fillRect(103 + x, 93 + y, 1, 4);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 2);
        g2d.fillRect(99 + x, 94 + y, 1, 3);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 1, 3);
        g2d.fillRect(101 + x, 95 + y, 2, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 2);
        g2d.fillRect(112 + x, 95 + y, 1, 2);
        g2d.fillRect(113 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 3);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(109 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 96 + y, 2, 1);
        g2d.fillRect(120 + x, 96 + y, 2, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(121 + x, 97 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 90 + y, 1, 3);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 91 + y, 3, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 92 + y, 1, 3);
        g2d.fillRect(119 + x, 92 + y, 1, 3);
        g2d.fillRect(121 + x, 92 + y, 2, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 3);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 3);
        g2d.fillRect(122 + x, 93 + y, 1, 4);
        g2d.fillRect(105 + x, 94 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 2);
        g2d.fillRect(114 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 2, 1);
        g2d.fillRect(113 + x, 96 + y, 1, 2);
        g2d.fillRect(104 + x, 97 + y, 1, 1);
        g2d.fillRect(106 + x, 97 + y, 2, 1);
        g2d.fillRect(110 + x, 97 + y, 1, 2);
        g2d.fillRect(111 + x, 97 + y, 1, 2);
        g2d.fillRect(112 + x, 97 + y, 1, 2);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 1);
        g2d.fillRect(107 + x, 98 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(120 + x, 91 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(111 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 2, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(112 + x, 94 + y, 1, 1);
        g2d.fillRect(121 + x, 95 + y, 1, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 91 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 41 + y, 1, 7);
        g2d.fillRect(118 + x, 41 + y, 1, 8);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 3, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 6);
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 2, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 2);
        g2d.fillRect(102 + x, 64 + y, 2, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 6);
        g2d.fillRect(110 + x, 64 + y, 3, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 2, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 3);
        g2d.fillRect(111 + x, 65 + y, 4, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(106 + x, 68 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 3);
        g2d.fillRect(111 + x, 68 + y, 1, 3);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(103 + x, 69 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(113 + x, 69 + y, 1, 2);
        g2d.fillRect(116 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(101 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 4, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 74 + y, 2, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 3, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 2);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 4);
        g2d.fillRect(100 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(118 + x, 75 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 4);
        g2d.fillRect(108 + x, 60 + y, 5, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 4, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(104 + x, 64 + y, 3, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 3);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 2, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 2, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 72 + y, 1, 2);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 2);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 1, 4);
        g2d.fillRect(114 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 66 + y, 2, 1);
        g2d.fillRect(104 + x, 67 + y, 3, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(102 + x, 71 + y, 2, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 3);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 3);
        g2d.fillRect(117 + x, 76 + y, 2, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 2, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 2, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 3);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 4, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 71 + y, 3, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 2, 1);
        g2d.fillRect(103 + x, 75 + y, 2, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 76 + y, 2, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(110 + x, 77 + y, 2, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 2, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 2, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 47 + y, 1, 3);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 49 + y, 1, 9);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 3);
        g2d.fillRect(103 + x, 50 + y, 1, 2);
        g2d.fillRect(117 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 50 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 3);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(107 + x, 57 + y, 1, 3);
        g2d.fillRect(113 + x, 57 + y, 1, 3);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 50 + y, 1, 2);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 53 + y, 1, 3);
        g2d.fillRect(116 + x, 53 + y, 1, 3);
        g2d.fillRect(120 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 54 + y, 2, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
    }
}
