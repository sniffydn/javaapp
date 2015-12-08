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
public class Skrt5 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt5()
    {
        super();
        containsTL = true;
        containsB = true;
    }

    public Skrt5(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
    }

    public Skrt5(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
    }


    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);


        paintTL(x,0,g2d);

        prevY = y;
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 19, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 3, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(111 + x, 54 + y, 4, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 4, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 5, 1);
        g2d.fillRect(114 + x, 59 + y, 4, 1);
        g2d.fillRect(102 + x, 60 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 3, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 4);
        g2d.fillRect(110 + x, 52 + y, 1, 3);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 2, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 2, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 4);
        g2d.fillRect(120 + x, 53 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 3);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 12, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 6, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 3, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 5, 1);
        g2d.fillRect(113 + x, 53 + y, 2, 1);
        g2d.fillRect(104 + x, 54 + y, 5, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 51 + y, 3, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 2, 1);
        g2d.fillRect(115 + x, 53 + y, 4, 1);
        g2d.fillRect(109 + x, 55 + y, 2, 1);
        g2d.fillRect(112 + x, 55 + y, 2, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 2, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 2, 1);
        g2d.fillRect(107 + x, 55 + y, 2, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 2, 1);
        g2d.fillRect(104 + x, 55 + y, 3, 1);
        g2d.fillRect(115 + x, 55 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 3);
        g2d.fillRect(102 + x, 52 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 2, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 8, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 14);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(105 + x, 60 + y, 1, 6);
        g2d.fillRect(115 + x, 60 + y, 1, 7);
        g2d.fillRect(116 + x, 60 + y, 1, 10);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 66 + y, 1, 7);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 10);
        g2d.fillRect(117 + x, 68 + y, 1, 5);
        g2d.fillRect(111 + x, 70 + y, 1, 8);
        g2d.fillRect(118 + x, 70 + y, 1, 6);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(101 + x, 75 + y, 1, 3);
        g2d.fillRect(112 + x, 75 + y, 1, 3);
        g2d.fillRect(109 + x, 76 + y, 1, 2);
        g2d.fillRect(120 + x, 76 + y, 1, 7);
        g2d.fillRect(107 + x, 77 + y, 2, 1);
        g2d.fillRect(121 + x, 79 + y, 1, 9);
        g2d.fillRect(109 + x, 80 + y, 7, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 86 + y, 1, 3);
        g2d.fillRect(118 + x, 86 + y, 1, 2);
        g2d.fillRect(119 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 2);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 60 + y, 8, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 4);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 3, 1);
        g2d.fillRect(110 + x, 63 + y, 2, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 6);
        g2d.fillRect(108 + x, 64 + y, 1, 10);
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 9);
        g2d.fillRect(110 + x, 67 + y, 3, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 68 + y, 1, 7);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 2);
        g2d.fillRect(107 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 73 + y, 2, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 2);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 6);
        g2d.fillRect(105 + x, 75 + y, 1, 3);
        g2d.fillRect(106 + x, 75 + y, 1, 3);
        g2d.fillRect(107 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 75 + y, 1, 2);
        g2d.fillRect(115 + x, 75 + y, 1, 5);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 2, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 4);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 2, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 1, 3);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 8, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 83 + y, 5, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 3, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 2);
        g2d.fillRect(119 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 11, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 4, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 2, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 3, 1);
        g2d.fillRect(111 + x, 89 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 5, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 3);
        g2d.fillRect(107 + x, 63 + y, 3, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 7);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 78 + y, 1, 3);
        g2d.fillRect(105 + x, 78 + y, 4, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 2, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 3);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 2, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(104 + x, 83 + y, 11, 1);
        g2d.fillRect(106 + x, 86 + y, 10, 1);
        g2d.fillRect(103 + x, 89 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 2, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 2);
        g2d.fillRect(115 + x, 69 + y, 1, 3);
        g2d.fillRect(107 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 2, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(110 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 2, 1);
        g2d.fillRect(108 + x, 81 + y, 3, 1);
        g2d.fillRect(116 + x, 82 + y, 2, 1);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 2, 1);
        g2d.fillRect(105 + x, 90 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(112 + x, 63 + y, 3, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 2, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 3);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 2);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 2, 1);
        g2d.fillRect(108 + x, 79 + y, 2, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 3);
        g2d.fillRect(106 + x, 81 + y, 2, 1);
        g2d.fillRect(108 + x, 84 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(106 + x, 87 + y, 5, 1);
        g2d.fillRect(108 + x, 90 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(112 + x, 90 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 65 + y, 1, 5);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(105 + x, 79 + y, 3, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 2, 1);
        g2d.fillRect(110 + x, 84 + y, 2, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(114 + x, 67 + y, 1, 5);
        g2d.fillRect(103 + x, 79 + y, 2, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(99 + x, 83 + y, 1, 1);
    }
}
