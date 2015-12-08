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
public class Skrt1 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Skrt1()
    {
        super();
        containsTL = true;
        drs = true;
    }

    public Skrt1(String middle)
    {
        super(middle);
        containsTL = true;
        drs = true;
    }

    public Skrt1(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        drs = true;
    }
    
    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        
        if (!containsB || Math.random() < .3) {
            return new clts.Blank();
        } else if (Math.random() < .5) {
            return new clts.b.a.Pose2(c);
        } else {
            return new clts.b.a.Pose3(c);
        }
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(prevY == -1)
            paintTL1(x,0,g2d);
        else if(prevY == 1)
            paintTL3(x,0,g2d);
        else
            paintTL2(x,0,g2d);
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

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 51 + y, 2, 1);
        g2d.fillRect(103 + x, 52 + y, 2, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 2, 1);
        g2d.fillRect(103 + x, 55 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 49 + y, 1, 4);
        g2d.fillRect(102 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 2);
        g2d.fillRect(107 + x, 49 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(111 + x, 49 + y, 1, 2);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(113 + x, 49 + y, 1, 2);
        g2d.fillRect(114 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 3);
        g2d.fillRect(99 + x, 50 + y, 1, 8);
        g2d.fillRect(100 + x, 50 + y, 1, 9);
        g2d.fillRect(119 + x, 50 + y, 1, 9);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 1, 3);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 51 + y, 9, 1);
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(105 + x, 52 + y, 2, 1);
        g2d.fillRect(117 + x, 52 + y, 2, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 4);
        g2d.fillRect(106 + x, 53 + y, 1, 5);
        g2d.fillRect(112 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 5);
        g2d.fillRect(113 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 4);
        g2d.fillRect(102 + x, 55 + y, 1, 3);
        g2d.fillRect(105 + x, 55 + y, 1, 3);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 10, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 5);
        g2d.fillRect(108 + x, 52 + y, 1, 5);
        g2d.fillRect(109 + x, 52 + y, 1, 5);
        g2d.fillRect(110 + x, 52 + y, 1, 5);
        g2d.fillRect(111 + x, 52 + y, 1, 5);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 2, 1);
        g2d.fillRect(115 + x, 56 + y, 2, 1);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 61 + y, 2, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 2, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(105 + x, 66 + y, 2, 1);
        g2d.fillRect(107 + x, 72 + y, 2, 1);
        g2d.fillRect(117 + x, 72 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 75 + y, 2, 1);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(123 + x, 83 + y, 1, 2);
        g2d.fillRect(99 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 2, 1);
        g2d.fillRect(121 + x, 85 + y, 2, 1);
        g2d.fillRect(100 + x, 86 + y, 2, 1);
        g2d.fillRect(117 + x, 89 + y, 2, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 2, 1);
        g2d.fillRect(125 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 2, 1);
        g2d.fillRect(125 + x, 94 + y, 2, 1);
        g2d.fillRect(99 + x, 96 + y, 2, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 2);
        g2d.fillRect(101 + x, 97 + y, 1, 2);
        g2d.fillRect(99 + x, 99 + y, 2, 1);
        g2d.fillRect(124 + x, 99 + y, 2, 1);
        g2d.fillRect(111 + x, 100 + y, 2, 1);
        g2d.fillRect(123 + x, 100 + y, 1, 2);
        g2d.fillRect(126 + x, 100 + y, 1, 2);
        g2d.fillRect(110 + x, 101 + y, 1, 2);
        g2d.fillRect(113 + x, 101 + y, 1, 2);
        g2d.fillRect(92 + x, 102 + y, 2, 1);
        g2d.fillRect(124 + x, 102 + y, 2, 1);
        g2d.fillRect(91 + x, 103 + y, 1, 2);
        g2d.fillRect(94 + x, 103 + y, 1, 2);
        g2d.fillRect(111 + x, 103 + y, 2, 1);
        g2d.fillRect(92 + x, 105 + y, 2, 1);
        g2d.fillRect(124 + x, 107 + y, 2, 1);
        g2d.fillRect(97 + x, 108 + y, 2, 1);
        g2d.fillRect(107 + x, 108 + y, 2, 1);
        g2d.fillRect(123 + x, 108 + y, 1, 2);
        g2d.fillRect(126 + x, 108 + y, 1, 2);
        g2d.fillRect(96 + x, 109 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 1, 2);
        g2d.fillRect(106 + x, 109 + y, 1, 2);
        g2d.fillRect(109 + x, 109 + y, 1, 2);
        g2d.fillRect(124 + x, 110 + y, 2, 1);
        g2d.fillRect(97 + x, 111 + y, 2, 1);
        g2d.fillRect(107 + x, 111 + y, 2, 1);
        g2d.fillRect(114 + x, 111 + y, 2, 1);
        g2d.fillRect(113 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 114 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(100 + x, 84 + y, 1, 2);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 2);
        g2d.fillRect(125 + x, 92 + y, 1, 2);
        g2d.fillRect(126 + x, 92 + y, 1, 2);
        g2d.fillRect(99 + x, 97 + y, 1, 2);
        g2d.fillRect(100 + x, 97 + y, 1, 2);
        g2d.fillRect(124 + x, 100 + y, 1, 2);
        g2d.fillRect(125 + x, 100 + y, 1, 2);
        g2d.fillRect(111 + x, 101 + y, 1, 2);
        g2d.fillRect(112 + x, 101 + y, 1, 2);
        g2d.fillRect(92 + x, 103 + y, 1, 2);
        g2d.fillRect(93 + x, 103 + y, 1, 2);
        g2d.fillRect(124 + x, 108 + y, 1, 2);
        g2d.fillRect(125 + x, 108 + y, 1, 2);
        g2d.fillRect(97 + x, 109 + y, 1, 2);
        g2d.fillRect(98 + x, 109 + y, 1, 2);
        g2d.fillRect(107 + x, 109 + y, 1, 2);
        g2d.fillRect(108 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 8, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 8);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 66 + y, 1, 13);
        g2d.fillRect(104 + x, 66 + y, 1, 6);
        g2d.fillRect(105 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 4);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 8);
        g2d.fillRect(101 + x, 77 + y, 1, 4);
        g2d.fillRect(118 + x, 77 + y, 1, 5);
        g2d.fillRect(119 + x, 77 + y, 1, 4);
        g2d.fillRect(106 + x, 78 + y, 1, 10);
        g2d.fillRect(107 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 3);
        g2d.fillRect(109 + x, 78 + y, 1, 3);
        g2d.fillRect(110 + x, 78 + y, 1, 4);
        g2d.fillRect(111 + x, 78 + y, 1, 2);
        g2d.fillRect(112 + x, 78 + y, 1, 4);
        g2d.fillRect(113 + x, 78 + y, 1, 4);
        g2d.fillRect(114 + x, 78 + y, 1, 10);
        g2d.fillRect(115 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 6);
        g2d.fillRect(117 + x, 78 + y, 1, 3);
        g2d.fillRect(120 + x, 78 + y, 1, 5);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(99 + x, 81 + y, 1, 3);
        g2d.fillRect(107 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 14);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 4);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 7);
        g2d.fillRect(124 + x, 84 + y, 1, 8);
        g2d.fillRect(97 + x, 85 + y, 1, 8);
        g2d.fillRect(105 + x, 85 + y, 1, 12);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(116 + x, 85 + y, 1, 5);
        g2d.fillRect(120 + x, 85 + y, 1, 8);
        g2d.fillRect(123 + x, 85 + y, 1, 7);
        g2d.fillRect(111 + x, 86 + y, 1, 5);
        g2d.fillRect(112 + x, 86 + y, 1, 6);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 1, 9);
        g2d.fillRect(125 + x, 88 + y, 1, 3);
        g2d.fillRect(121 + x, 89 + y, 1, 10);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(95 + x, 92 + y, 1, 9);
        g2d.fillRect(116 + x, 92 + y, 1, 4);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 6);
        g2d.fillRect(118 + x, 93 + y, 1, 10);
        g2d.fillRect(97 + x, 94 + y, 1, 1);
        g2d.fillRect(127 + x, 94 + y, 1, 6);
        g2d.fillRect(94 + x, 95 + y, 1, 8);
        g2d.fillRect(125 + x, 95 + y, 2, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 5);
        g2d.fillRect(126 + x, 96 + y, 1, 3);
        g2d.fillRect(103 + x, 97 + y, 1, 2);
        g2d.fillRect(122 + x, 97 + y, 1, 5);
        g2d.fillRect(128 + x, 97 + y, 1, 6);
        g2d.fillRect(93 + x, 98 + y, 1, 4);
        g2d.fillRect(123 + x, 98 + y, 1, 2);
        g2d.fillRect(92 + x, 100 + y, 1, 2);
        g2d.fillRect(103 + x, 101 + y, 1, 4);
        g2d.fillRect(129 + x, 101 + y, 1, 3);
        g2d.fillRect(113 + x, 103 + y, 1, 9);
        g2d.fillRect(114 + x, 103 + y, 1, 8);
        g2d.fillRect(119 + x, 103 + y, 1, 3);
        g2d.fillRect(130 + x, 103 + y, 1, 5);
        g2d.fillRect(102 + x, 104 + y, 1, 5);
        g2d.fillRect(90 + x, 105 + y, 1, 6);
        g2d.fillRect(91 + x, 105 + y, 1, 6);
        g2d.fillRect(120 + x, 105 + y, 1, 4);
        g2d.fillRect(92 + x, 106 + y, 1, 6);
        g2d.fillRect(131 + x, 107 + y, 1, 3);
        g2d.fillRect(89 + x, 108 + y, 1, 3);
        g2d.fillRect(101 + x, 108 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(88 + x, 109 + y, 1, 1);
        g2d.fillRect(93 + x, 109 + y, 1, 3);
        g2d.fillRect(94 + x, 109 + y, 1, 2);
        g2d.fillRect(95 + x, 109 + y, 1, 3);
        g2d.fillRect(100 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 2, 1);
        g2d.fillRect(96 + x, 111 + y, 1, 2);
        g2d.fillRect(106 + x, 111 + y, 1, 5);
        g2d.fillRect(109 + x, 111 + y, 1, 5);
        g2d.fillRect(112 + x, 111 + y, 1, 5);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(97 + x, 112 + y, 1, 1);
        g2d.fillRect(105 + x, 112 + y, 1, 4);
        g2d.fillRect(107 + x, 112 + y, 1, 3);
        g2d.fillRect(108 + x, 112 + y, 1, 4);
        g2d.fillRect(111 + x, 112 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 2);
        g2d.fillRect(110 + x, 115 + y, 2, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 3, 1);
        g2d.fillRect(105 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 5);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 6);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 3);
        g2d.fillRect(115 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 6);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 27);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 5);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 7);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 13);
        g2d.fillRect(107 + x, 83 + y, 1, 25);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 13);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 7);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 5);
        g2d.fillRect(102 + x, 86 + y, 1, 18);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(100 + x, 87 + y, 2, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 9);
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 13);
        g2d.fillRect(114 + x, 88 + y, 1, 15);
        g2d.fillRect(98 + x, 90 + y, 1, 5);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 11);
        g2d.fillRect(97 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 12);
        g2d.fillRect(109 + x, 94 + y, 1, 10);
        g2d.fillRect(112 + x, 94 + y, 1, 6);
        g2d.fillRect(97 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 14);
        g2d.fillRect(111 + x, 95 + y, 1, 5);
        g2d.fillRect(115 + x, 95 + y, 1, 13);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 14);
        g2d.fillRect(96 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 15);
        g2d.fillRect(101 + x, 99 + y, 1, 9);
        g2d.fillRect(103 + x, 99 + y, 1, 2);
        g2d.fillRect(117 + x, 99 + y, 1, 16);
        g2d.fillRect(121 + x, 99 + y, 1, 14);
        g2d.fillRect(126 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 100 + y, 1, 9);
        g2d.fillRect(100 + x, 100 + y, 1, 9);
        g2d.fillRect(104 + x, 101 + y, 1, 14);
        g2d.fillRect(122 + x, 102 + y, 1, 11);
        g2d.fillRect(123 + x, 102 + y, 1, 6);
        g2d.fillRect(98 + x, 103 + y, 1, 5);
        g2d.fillRect(118 + x, 103 + y, 1, 11);
        g2d.fillRect(124 + x, 103 + y, 1, 4);
        g2d.fillRect(125 + x, 103 + y, 1, 4);
        g2d.fillRect(103 + x, 105 + y, 1, 10);
        g2d.fillRect(126 + x, 105 + y, 1, 3);
        g2d.fillRect(97 + x, 106 + y, 1, 2);
        g2d.fillRect(119 + x, 106 + y, 1, 8);
        g2d.fillRect(127 + x, 106 + y, 1, 6);
        g2d.fillRect(109 + x, 107 + y, 1, 1);
        g2d.fillRect(128 + x, 107 + y, 1, 5);
        g2d.fillRect(129 + x, 107 + y, 1, 4);
        g2d.fillRect(96 + x, 108 + y, 1, 1);
        g2d.fillRect(130 + x, 108 + y, 1, 3);
        g2d.fillRect(102 + x, 109 + y, 1, 6);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(120 + x, 109 + y, 1, 5);
        g2d.fillRect(101 + x, 110 + y, 1, 5);
        g2d.fillRect(123 + x, 110 + y, 1, 3);
        g2d.fillRect(126 + x, 110 + y, 1, 2);
        g2d.fillRect(131 + x, 110 + y, 1, 1);
        g2d.fillRect(94 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 1, 3);
        g2d.fillRect(100 + x, 111 + y, 1, 3);
        g2d.fillRect(124 + x, 111 + y, 1, 2);
        g2d.fillRect(125 + x, 111 + y, 1, 2);
        g2d.fillRect(98 + x, 112 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 1);
        g2d.fillRect(107 + x, 115 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 62 + y, 5, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 9);
        g2d.fillRect(109 + x, 63 + y, 1, 9);
        g2d.fillRect(110 + x, 65 + y, 1, 13);
        g2d.fillRect(111 + x, 65 + y, 1, 13);
        g2d.fillRect(112 + x, 65 + y, 1, 13);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 4);
        g2d.fillRect(113 + x, 68 + y, 1, 10);
        g2d.fillRect(114 + x, 71 + y, 1, 7);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 2, 1);
        g2d.fillRect(115 + x, 77 + y, 2, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 5);
        g2d.fillRect(103 + x, 79 + y, 1, 5);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 5);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(122 + x, 87 + y, 1, 10);
        g2d.fillRect(100 + x, 88 + y, 1, 7);
        g2d.fillRect(99 + x, 91 + y, 1, 5);
        g2d.fillRect(123 + x, 92 + y, 1, 6);
        g2d.fillRect(124 + x, 94 + y, 1, 5);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 6);
        g2d.fillRect(97 + x, 96 + y, 1, 10);
        g2d.fillRect(125 + x, 96 + y, 1, 3);
        g2d.fillRect(96 + x, 98 + y, 1, 10);
        g2d.fillRect(98 + x, 99 + y, 1, 4);
        g2d.fillRect(127 + x, 100 + y, 1, 6);
        g2d.fillRect(95 + x, 101 + y, 1, 8);
        g2d.fillRect(126 + x, 102 + y, 1, 3);
        g2d.fillRect(110 + x, 103 + y, 1, 12);
        g2d.fillRect(128 + x, 103 + y, 1, 4);
        g2d.fillRect(109 + x, 104 + y, 1, 3);
        g2d.fillRect(111 + x, 104 + y, 1, 8);
        g2d.fillRect(112 + x, 104 + y, 1, 7);
        g2d.fillRect(129 + x, 104 + y, 1, 3);
        g2d.fillRect(94 + x, 105 + y, 1, 4);
        g2d.fillRect(93 + x, 106 + y, 1, 3);
        g2d.fillRect(109 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 2);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 61 + y, 2, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 2, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(105 + x, 66 + y, 2, 1);
        g2d.fillRect(107 + x, 72 + y, 2, 1);
        g2d.fillRect(117 + x, 72 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 75 + y, 2, 1);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 2, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(123 + x, 83 + y, 1, 2);
        g2d.fillRect(99 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 2, 1);
        g2d.fillRect(121 + x, 85 + y, 2, 1);
        g2d.fillRect(100 + x, 86 + y, 2, 1);
        g2d.fillRect(117 + x, 89 + y, 2, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 91 + y, 2, 1);
        g2d.fillRect(125 + x, 91 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(112 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 2, 1);
        g2d.fillRect(125 + x, 94 + y, 2, 1);
        g2d.fillRect(99 + x, 97 + y, 2, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 2);
        g2d.fillRect(101 + x, 98 + y, 1, 2);
        g2d.fillRect(99 + x, 100 + y, 2, 1);
        g2d.fillRect(124 + x, 100 + y, 2, 1);
        g2d.fillRect(111 + x, 101 + y, 2, 1);
        g2d.fillRect(123 + x, 101 + y, 1, 2);
        g2d.fillRect(126 + x, 101 + y, 1, 2);
        g2d.fillRect(110 + x, 102 + y, 1, 2);
        g2d.fillRect(113 + x, 102 + y, 1, 2);
        g2d.fillRect(92 + x, 103 + y, 2, 1);
        g2d.fillRect(124 + x, 103 + y, 2, 1);
        g2d.fillRect(91 + x, 104 + y, 1, 2);
        g2d.fillRect(94 + x, 104 + y, 1, 2);
        g2d.fillRect(111 + x, 104 + y, 2, 1);
        g2d.fillRect(92 + x, 106 + y, 2, 1);
        g2d.fillRect(124 + x, 108 + y, 2, 1);
        g2d.fillRect(97 + x, 109 + y, 2, 1);
        g2d.fillRect(107 + x, 109 + y, 2, 1);
        g2d.fillRect(123 + x, 109 + y, 1, 2);
        g2d.fillRect(126 + x, 109 + y, 1, 2);
        g2d.fillRect(96 + x, 110 + y, 1, 2);
        g2d.fillRect(99 + x, 110 + y, 1, 2);
        g2d.fillRect(106 + x, 110 + y, 1, 2);
        g2d.fillRect(109 + x, 110 + y, 1, 2);
        g2d.fillRect(124 + x, 111 + y, 2, 1);
        g2d.fillRect(97 + x, 112 + y, 2, 1);
        g2d.fillRect(107 + x, 112 + y, 2, 1);
        g2d.fillRect(114 + x, 112 + y, 2, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 113 + y, 1, 2);
        g2d.fillRect(114 + x, 115 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(100 + x, 84 + y, 1, 2);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 1, 2);
        g2d.fillRect(111 + x, 92 + y, 1, 2);
        g2d.fillRect(125 + x, 92 + y, 1, 2);
        g2d.fillRect(126 + x, 92 + y, 1, 2);
        g2d.fillRect(99 + x, 98 + y, 1, 2);
        g2d.fillRect(100 + x, 98 + y, 1, 2);
        g2d.fillRect(124 + x, 101 + y, 1, 2);
        g2d.fillRect(125 + x, 101 + y, 1, 2);
        g2d.fillRect(111 + x, 102 + y, 1, 2);
        g2d.fillRect(112 + x, 102 + y, 1, 2);
        g2d.fillRect(92 + x, 104 + y, 1, 2);
        g2d.fillRect(93 + x, 104 + y, 1, 2);
        g2d.fillRect(124 + x, 109 + y, 1, 2);
        g2d.fillRect(125 + x, 109 + y, 1, 2);
        g2d.fillRect(97 + x, 110 + y, 1, 2);
        g2d.fillRect(98 + x, 110 + y, 1, 2);
        g2d.fillRect(107 + x, 110 + y, 1, 2);
        g2d.fillRect(108 + x, 110 + y, 1, 2);
        g2d.fillRect(114 + x, 113 + y, 1, 2);
        g2d.fillRect(115 + x, 113 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 8, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 8);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 66 + y, 1, 13);
        g2d.fillRect(104 + x, 66 + y, 1, 6);
        g2d.fillRect(105 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 4);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 8);
        g2d.fillRect(101 + x, 77 + y, 1, 4);
        g2d.fillRect(118 + x, 77 + y, 1, 5);
        g2d.fillRect(119 + x, 77 + y, 1, 4);
        g2d.fillRect(106 + x, 78 + y, 1, 10);
        g2d.fillRect(107 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 3);
        g2d.fillRect(109 + x, 78 + y, 1, 3);
        g2d.fillRect(110 + x, 78 + y, 1, 4);
        g2d.fillRect(111 + x, 78 + y, 1, 2);
        g2d.fillRect(112 + x, 78 + y, 1, 4);
        g2d.fillRect(113 + x, 78 + y, 1, 4);
        g2d.fillRect(114 + x, 78 + y, 1, 10);
        g2d.fillRect(115 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 6);
        g2d.fillRect(117 + x, 78 + y, 1, 3);
        g2d.fillRect(120 + x, 78 + y, 1, 5);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(99 + x, 81 + y, 1, 3);
        g2d.fillRect(107 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 14);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 4);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 7);
        g2d.fillRect(124 + x, 84 + y, 1, 8);
        g2d.fillRect(97 + x, 85 + y, 1, 8);
        g2d.fillRect(105 + x, 85 + y, 1, 13);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(116 + x, 85 + y, 1, 5);
        g2d.fillRect(120 + x, 85 + y, 1, 8);
        g2d.fillRect(123 + x, 85 + y, 1, 7);
        g2d.fillRect(111 + x, 86 + y, 1, 5);
        g2d.fillRect(112 + x, 86 + y, 1, 6);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 1, 10);
        g2d.fillRect(125 + x, 88 + y, 1, 3);
        g2d.fillRect(121 + x, 89 + y, 1, 11);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(95 + x, 92 + y, 1, 10);
        g2d.fillRect(116 + x, 92 + y, 1, 5);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 3);
        g2d.fillRect(118 + x, 93 + y, 1, 11);
        g2d.fillRect(97 + x, 94 + y, 1, 1);
        g2d.fillRect(127 + x, 94 + y, 1, 7);
        g2d.fillRect(94 + x, 95 + y, 1, 9);
        g2d.fillRect(125 + x, 95 + y, 1, 2);
        g2d.fillRect(126 + x, 95 + y, 1, 5);
        g2d.fillRect(103 + x, 97 + y, 1, 3);
        g2d.fillRect(104 + x, 97 + y, 1, 5);
        g2d.fillRect(117 + x, 97 + y, 1, 3);
        g2d.fillRect(122 + x, 97 + y, 1, 6);
        g2d.fillRect(128 + x, 98 + y, 1, 6);
        g2d.fillRect(93 + x, 99 + y, 1, 4);
        g2d.fillRect(123 + x, 99 + y, 1, 2);
        g2d.fillRect(92 + x, 101 + y, 1, 2);
        g2d.fillRect(103 + x, 102 + y, 1, 4);
        g2d.fillRect(129 + x, 102 + y, 1, 3);
        g2d.fillRect(113 + x, 104 + y, 1, 9);
        g2d.fillRect(114 + x, 104 + y, 1, 8);
        g2d.fillRect(119 + x, 104 + y, 1, 3);
        g2d.fillRect(130 + x, 104 + y, 1, 5);
        g2d.fillRect(102 + x, 105 + y, 1, 5);
        g2d.fillRect(90 + x, 106 + y, 1, 6);
        g2d.fillRect(91 + x, 106 + y, 1, 6);
        g2d.fillRect(120 + x, 106 + y, 1, 4);
        g2d.fillRect(92 + x, 107 + y, 1, 6);
        g2d.fillRect(131 + x, 108 + y, 1, 3);
        g2d.fillRect(89 + x, 109 + y, 1, 3);
        g2d.fillRect(101 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(88 + x, 110 + y, 1, 1);
        g2d.fillRect(93 + x, 110 + y, 1, 3);
        g2d.fillRect(94 + x, 110 + y, 1, 2);
        g2d.fillRect(95 + x, 110 + y, 1, 3);
        g2d.fillRect(100 + x, 110 + y, 1, 2);
        g2d.fillRect(115 + x, 111 + y, 2, 1);
        g2d.fillRect(96 + x, 112 + y, 1, 2);
        g2d.fillRect(106 + x, 112 + y, 1, 5);
        g2d.fillRect(109 + x, 112 + y, 1, 5);
        g2d.fillRect(112 + x, 112 + y, 1, 5);
        g2d.fillRect(116 + x, 112 + y, 1, 1);
        g2d.fillRect(97 + x, 113 + y, 1, 1);
        g2d.fillRect(105 + x, 113 + y, 1, 4);
        g2d.fillRect(107 + x, 113 + y, 1, 3);
        g2d.fillRect(108 + x, 113 + y, 1, 4);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(113 + x, 115 + y, 1, 2);
        g2d.fillRect(110 + x, 116 + y, 2, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 3, 1);
        g2d.fillRect(105 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 5);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 6);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 3);
        g2d.fillRect(115 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 6);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 28);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 5);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 7);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 14);
        g2d.fillRect(107 + x, 83 + y, 1, 26);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 13);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 7);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 5);
        g2d.fillRect(102 + x, 86 + y, 1, 19);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(100 + x, 87 + y, 2, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 10);
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 14);
        g2d.fillRect(114 + x, 88 + y, 1, 16);
        g2d.fillRect(98 + x, 90 + y, 1, 5);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 12);
        g2d.fillRect(97 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 13);
        g2d.fillRect(109 + x, 94 + y, 1, 11);
        g2d.fillRect(112 + x, 94 + y, 1, 7);
        g2d.fillRect(97 + x, 95 + y, 1, 2);
        g2d.fillRect(100 + x, 95 + y, 1, 2);
        g2d.fillRect(106 + x, 95 + y, 1, 15);
        g2d.fillRect(111 + x, 95 + y, 1, 6);
        g2d.fillRect(115 + x, 95 + y, 1, 14);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 14);
        g2d.fillRect(96 + x, 98 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 15);
        g2d.fillRect(101 + x, 100 + y, 1, 9);
        g2d.fillRect(103 + x, 100 + y, 1, 2);
        g2d.fillRect(117 + x, 100 + y, 1, 16);
        g2d.fillRect(121 + x, 100 + y, 1, 14);
        g2d.fillRect(126 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 9);
        g2d.fillRect(100 + x, 101 + y, 1, 9);
        g2d.fillRect(104 + x, 102 + y, 1, 14);
        g2d.fillRect(122 + x, 103 + y, 1, 11);
        g2d.fillRect(123 + x, 103 + y, 1, 6);
        g2d.fillRect(98 + x, 104 + y, 1, 5);
        g2d.fillRect(118 + x, 104 + y, 1, 11);
        g2d.fillRect(124 + x, 104 + y, 1, 4);
        g2d.fillRect(125 + x, 104 + y, 1, 4);
        g2d.fillRect(103 + x, 106 + y, 1, 10);
        g2d.fillRect(126 + x, 106 + y, 1, 3);
        g2d.fillRect(97 + x, 107 + y, 1, 2);
        g2d.fillRect(119 + x, 107 + y, 1, 8);
        g2d.fillRect(127 + x, 107 + y, 1, 6);
        g2d.fillRect(109 + x, 108 + y, 1, 1);
        g2d.fillRect(128 + x, 108 + y, 1, 5);
        g2d.fillRect(129 + x, 108 + y, 1, 4);
        g2d.fillRect(96 + x, 109 + y, 1, 1);
        g2d.fillRect(130 + x, 109 + y, 1, 3);
        g2d.fillRect(102 + x, 110 + y, 1, 6);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(120 + x, 110 + y, 1, 5);
        g2d.fillRect(101 + x, 111 + y, 1, 5);
        g2d.fillRect(123 + x, 111 + y, 1, 3);
        g2d.fillRect(126 + x, 111 + y, 1, 2);
        g2d.fillRect(131 + x, 111 + y, 1, 1);
        g2d.fillRect(94 + x, 112 + y, 1, 1);
        g2d.fillRect(99 + x, 112 + y, 1, 3);
        g2d.fillRect(100 + x, 112 + y, 1, 3);
        g2d.fillRect(124 + x, 112 + y, 1, 2);
        g2d.fillRect(125 + x, 112 + y, 1, 2);
        g2d.fillRect(98 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(107 + x, 116 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 62 + y, 5, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 9);
        g2d.fillRect(109 + x, 63 + y, 1, 9);
        g2d.fillRect(110 + x, 65 + y, 1, 13);
        g2d.fillRect(111 + x, 65 + y, 1, 13);
        g2d.fillRect(112 + x, 65 + y, 1, 13);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 4);
        g2d.fillRect(113 + x, 68 + y, 1, 10);
        g2d.fillRect(114 + x, 71 + y, 1, 7);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 2, 1);
        g2d.fillRect(115 + x, 77 + y, 2, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 5);
        g2d.fillRect(103 + x, 79 + y, 1, 5);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 5);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(122 + x, 87 + y, 1, 10);
        g2d.fillRect(100 + x, 88 + y, 1, 7);
        g2d.fillRect(99 + x, 91 + y, 1, 6);
        g2d.fillRect(123 + x, 92 + y, 1, 7);
        g2d.fillRect(124 + x, 94 + y, 1, 6);
        g2d.fillRect(98 + x, 95 + y, 1, 2);
        g2d.fillRect(110 + x, 95 + y, 1, 7);
        g2d.fillRect(97 + x, 97 + y, 1, 10);
        g2d.fillRect(125 + x, 97 + y, 1, 3);
        g2d.fillRect(96 + x, 99 + y, 1, 10);
        g2d.fillRect(98 + x, 100 + y, 1, 4);
        g2d.fillRect(127 + x, 101 + y, 1, 6);
        g2d.fillRect(95 + x, 102 + y, 1, 8);
        g2d.fillRect(126 + x, 103 + y, 1, 3);
        g2d.fillRect(110 + x, 104 + y, 1, 12);
        g2d.fillRect(128 + x, 104 + y, 1, 4);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(111 + x, 105 + y, 1, 8);
        g2d.fillRect(112 + x, 105 + y, 1, 7);
        g2d.fillRect(129 + x, 105 + y, 1, 3);
        g2d.fillRect(94 + x, 106 + y, 1, 4);
        g2d.fillRect(93 + x, 107 + y, 1, 3);
        g2d.fillRect(109 + x, 109 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 2);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 61 + y, 2, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 2, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(105 + x, 66 + y, 2, 1);
        g2d.fillRect(107 + x, 72 + y, 2, 1);
        g2d.fillRect(117 + x, 72 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 75 + y, 2, 1);
        g2d.fillRect(110 + x, 82 + y, 2, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 2, 1);
        g2d.fillRect(100 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(123 + x, 84 + y, 1, 2);
        g2d.fillRect(99 + x, 85 + y, 1, 2);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 2, 1);
        g2d.fillRect(121 + x, 86 + y, 2, 1);
        g2d.fillRect(100 + x, 87 + y, 2, 1);
        g2d.fillRect(117 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 92 + y, 2, 1);
        g2d.fillRect(125 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(112 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 2, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 2);
        g2d.fillRect(110 + x, 95 + y, 2, 1);
        g2d.fillRect(125 + x, 95 + y, 2, 1);
        g2d.fillRect(99 + x, 98 + y, 2, 1);
        g2d.fillRect(98 + x, 99 + y, 1, 2);
        g2d.fillRect(101 + x, 99 + y, 1, 2);
        g2d.fillRect(99 + x, 101 + y, 2, 1);
        g2d.fillRect(124 + x, 101 + y, 2, 1);
        g2d.fillRect(111 + x, 102 + y, 2, 1);
        g2d.fillRect(123 + x, 102 + y, 1, 2);
        g2d.fillRect(126 + x, 102 + y, 1, 2);
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 103 + y, 1, 2);
        g2d.fillRect(92 + x, 104 + y, 2, 1);
        g2d.fillRect(124 + x, 104 + y, 2, 1);
        g2d.fillRect(91 + x, 105 + y, 1, 2);
        g2d.fillRect(94 + x, 105 + y, 1, 2);
        g2d.fillRect(111 + x, 105 + y, 2, 1);
        g2d.fillRect(92 + x, 107 + y, 2, 1);
        g2d.fillRect(124 + x, 109 + y, 2, 1);
        g2d.fillRect(97 + x, 110 + y, 2, 1);
        g2d.fillRect(107 + x, 110 + y, 2, 1);
        g2d.fillRect(123 + x, 110 + y, 1, 2);
        g2d.fillRect(126 + x, 110 + y, 1, 2);
        g2d.fillRect(96 + x, 111 + y, 1, 2);
        g2d.fillRect(99 + x, 111 + y, 1, 2);
        g2d.fillRect(106 + x, 111 + y, 1, 2);
        g2d.fillRect(109 + x, 111 + y, 1, 2);
        g2d.fillRect(124 + x, 112 + y, 2, 1);
        g2d.fillRect(97 + x, 113 + y, 2, 1);
        g2d.fillRect(107 + x, 113 + y, 2, 1);
        g2d.fillRect(114 + x, 113 + y, 2, 1);
        g2d.fillRect(113 + x, 114 + y, 1, 2);
        g2d.fillRect(116 + x, 114 + y, 1, 2);
        g2d.fillRect(114 + x, 116 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(122 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(125 + x, 93 + y, 1, 2);
        g2d.fillRect(126 + x, 93 + y, 1, 2);
        g2d.fillRect(99 + x, 99 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 2);
        g2d.fillRect(124 + x, 102 + y, 1, 2);
        g2d.fillRect(125 + x, 102 + y, 1, 2);
        g2d.fillRect(111 + x, 103 + y, 1, 2);
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(92 + x, 105 + y, 1, 2);
        g2d.fillRect(93 + x, 105 + y, 1, 2);
        g2d.fillRect(124 + x, 110 + y, 1, 2);
        g2d.fillRect(125 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 111 + y, 1, 2);
        g2d.fillRect(98 + x, 111 + y, 1, 2);
        g2d.fillRect(107 + x, 111 + y, 1, 2);
        g2d.fillRect(108 + x, 111 + y, 1, 2);
        g2d.fillRect(114 + x, 114 + y, 1, 2);
        g2d.fillRect(115 + x, 114 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 8, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 8);
        g2d.fillRect(115 + x, 60 + y, 1, 10);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 66 + y, 1, 13);
        g2d.fillRect(104 + x, 66 + y, 1, 6);
        g2d.fillRect(105 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 4);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 8);
        g2d.fillRect(101 + x, 77 + y, 1, 5);
        g2d.fillRect(118 + x, 77 + y, 1, 6);
        g2d.fillRect(119 + x, 77 + y, 1, 5);
        g2d.fillRect(106 + x, 78 + y, 1, 10);
        g2d.fillRect(107 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 3);
        g2d.fillRect(109 + x, 78 + y, 1, 3);
        g2d.fillRect(110 + x, 78 + y, 1, 4);
        g2d.fillRect(111 + x, 78 + y, 1, 2);
        g2d.fillRect(112 + x, 78 + y, 1, 4);
        g2d.fillRect(113 + x, 78 + y, 1, 4);
        g2d.fillRect(114 + x, 78 + y, 1, 10);
        g2d.fillRect(115 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 7);
        g2d.fillRect(117 + x, 78 + y, 1, 3);
        g2d.fillRect(120 + x, 78 + y, 1, 6);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(121 + x, 80 + y, 1, 3);
        g2d.fillRect(122 + x, 80 + y, 1, 3);
        g2d.fillRect(107 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 15);
        g2d.fillRect(99 + x, 82 + y, 1, 3);
        g2d.fillRect(123 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 1, 4);
        g2d.fillRect(98 + x, 84 + y, 1, 7);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(124 + x, 85 + y, 1, 8);
        g2d.fillRect(97 + x, 86 + y, 1, 8);
        g2d.fillRect(105 + x, 86 + y, 1, 13);
        g2d.fillRect(111 + x, 86 + y, 1, 6);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(116 + x, 86 + y, 1, 5);
        g2d.fillRect(117 + x, 86 + y, 1, 4);
        g2d.fillRect(120 + x, 86 + y, 1, 8);
        g2d.fillRect(123 + x, 86 + y, 1, 7);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 1, 10);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(125 + x, 89 + y, 1, 3);
        g2d.fillRect(121 + x, 90 + y, 1, 11);
        g2d.fillRect(106 + x, 91 + y, 1, 2);
        g2d.fillRect(95 + x, 93 + y, 1, 10);
        g2d.fillRect(116 + x, 93 + y, 1, 5);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 3);
        g2d.fillRect(118 + x, 94 + y, 1, 11);
        g2d.fillRect(97 + x, 95 + y, 1, 1);
        g2d.fillRect(127 + x, 95 + y, 1, 7);
        g2d.fillRect(94 + x, 96 + y, 1, 9);
        g2d.fillRect(125 + x, 96 + y, 1, 2);
        g2d.fillRect(126 + x, 96 + y, 1, 5);
        g2d.fillRect(103 + x, 98 + y, 1, 3);
        g2d.fillRect(104 + x, 98 + y, 1, 5);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(122 + x, 98 + y, 1, 6);
        g2d.fillRect(128 + x, 99 + y, 1, 6);
        g2d.fillRect(93 + x, 100 + y, 1, 4);
        g2d.fillRect(123 + x, 100 + y, 1, 2);
        g2d.fillRect(92 + x, 102 + y, 1, 2);
        g2d.fillRect(103 + x, 103 + y, 1, 4);
        g2d.fillRect(129 + x, 103 + y, 1, 3);
        g2d.fillRect(113 + x, 105 + y, 1, 9);
        g2d.fillRect(114 + x, 105 + y, 1, 8);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(130 + x, 105 + y, 1, 5);
        g2d.fillRect(102 + x, 106 + y, 1, 5);
        g2d.fillRect(90 + x, 107 + y, 1, 6);
        g2d.fillRect(91 + x, 107 + y, 1, 6);
        g2d.fillRect(120 + x, 107 + y, 1, 4);
        g2d.fillRect(92 + x, 108 + y, 1, 6);
        g2d.fillRect(131 + x, 109 + y, 1, 3);
        g2d.fillRect(89 + x, 110 + y, 1, 3);
        g2d.fillRect(101 + x, 110 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(88 + x, 111 + y, 1, 1);
        g2d.fillRect(93 + x, 111 + y, 1, 3);
        g2d.fillRect(94 + x, 111 + y, 1, 2);
        g2d.fillRect(95 + x, 111 + y, 1, 3);
        g2d.fillRect(100 + x, 111 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 2, 1);
        g2d.fillRect(96 + x, 113 + y, 1, 2);
        g2d.fillRect(106 + x, 113 + y, 1, 5);
        g2d.fillRect(109 + x, 113 + y, 1, 5);
        g2d.fillRect(112 + x, 113 + y, 1, 5);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(97 + x, 114 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 1, 4);
        g2d.fillRect(107 + x, 114 + y, 1, 3);
        g2d.fillRect(108 + x, 114 + y, 1, 4);
        g2d.fillRect(111 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(110 + x, 117 + y, 2, 1);
        g2d.fillRect(114 + x, 117 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 3, 1);
        g2d.fillRect(105 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 5);
        g2d.fillRect(114 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 2);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 6);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 3);
        g2d.fillRect(115 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 7);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 29);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 5);
        g2d.fillRect(112 + x, 82 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 27);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 1, 7);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 14);
        g2d.fillRect(103 + x, 85 + y, 1, 13);
        g2d.fillRect(109 + x, 85 + y, 1, 8);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 5);
        g2d.fillRect(102 + x, 87 + y, 1, 19);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(100 + x, 88 + y, 2, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 10);
        g2d.fillRect(114 + x, 89 + y, 1, 16);
        g2d.fillRect(113 + x, 90 + y, 1, 13);
        g2d.fillRect(98 + x, 91 + y, 1, 5);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 12);
        g2d.fillRect(97 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 13);
        g2d.fillRect(109 + x, 95 + y, 1, 11);
        g2d.fillRect(112 + x, 95 + y, 1, 7);
        g2d.fillRect(97 + x, 96 + y, 1, 2);
        g2d.fillRect(100 + x, 96 + y, 1, 2);
        g2d.fillRect(106 + x, 96 + y, 1, 15);
        g2d.fillRect(111 + x, 96 + y, 1, 6);
        g2d.fillRect(115 + x, 96 + y, 1, 14);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 14);
        g2d.fillRect(96 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 15);
        g2d.fillRect(101 + x, 101 + y, 1, 9);
        g2d.fillRect(103 + x, 101 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 16);
        g2d.fillRect(121 + x, 101 + y, 1, 14);
        g2d.fillRect(126 + x, 101 + y, 1, 1);
        g2d.fillRect(99 + x, 102 + y, 1, 9);
        g2d.fillRect(100 + x, 102 + y, 1, 9);
        g2d.fillRect(104 + x, 103 + y, 1, 14);
        g2d.fillRect(122 + x, 104 + y, 1, 11);
        g2d.fillRect(123 + x, 104 + y, 1, 6);
        g2d.fillRect(98 + x, 105 + y, 1, 5);
        g2d.fillRect(118 + x, 105 + y, 1, 11);
        g2d.fillRect(124 + x, 105 + y, 1, 4);
        g2d.fillRect(125 + x, 105 + y, 1, 4);
        g2d.fillRect(103 + x, 107 + y, 1, 10);
        g2d.fillRect(126 + x, 107 + y, 1, 3);
        g2d.fillRect(97 + x, 108 + y, 1, 2);
        g2d.fillRect(119 + x, 108 + y, 1, 8);
        g2d.fillRect(127 + x, 108 + y, 1, 6);
        g2d.fillRect(109 + x, 109 + y, 1, 1);
        g2d.fillRect(128 + x, 109 + y, 1, 5);
        g2d.fillRect(129 + x, 109 + y, 1, 4);
        g2d.fillRect(96 + x, 110 + y, 1, 1);
        g2d.fillRect(130 + x, 110 + y, 1, 3);
        g2d.fillRect(102 + x, 111 + y, 1, 6);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(120 + x, 111 + y, 1, 5);
        g2d.fillRect(101 + x, 112 + y, 1, 5);
        g2d.fillRect(123 + x, 112 + y, 1, 3);
        g2d.fillRect(126 + x, 112 + y, 1, 2);
        g2d.fillRect(131 + x, 112 + y, 1, 1);
        g2d.fillRect(94 + x, 113 + y, 1, 1);
        g2d.fillRect(99 + x, 113 + y, 1, 3);
        g2d.fillRect(100 + x, 113 + y, 1, 3);
        g2d.fillRect(124 + x, 113 + y, 1, 2);
        g2d.fillRect(125 + x, 113 + y, 1, 2);
        g2d.fillRect(98 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 1);
        g2d.fillRect(107 + x, 117 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 62 + y, 5, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 9);
        g2d.fillRect(109 + x, 63 + y, 1, 9);
        g2d.fillRect(110 + x, 65 + y, 1, 13);
        g2d.fillRect(111 + x, 65 + y, 1, 13);
        g2d.fillRect(112 + x, 65 + y, 1, 13);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 4);
        g2d.fillRect(113 + x, 68 + y, 1, 10);
        g2d.fillRect(114 + x, 71 + y, 1, 7);
        g2d.fillRect(105 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 2, 1);
        g2d.fillRect(115 + x, 77 + y, 2, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 6);
        g2d.fillRect(103 + x, 79 + y, 1, 6);
        g2d.fillRect(102 + x, 81 + y, 1, 3);
        g2d.fillRect(101 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 6);
        g2d.fillRect(121 + x, 87 + y, 1, 3);
        g2d.fillRect(122 + x, 88 + y, 1, 10);
        g2d.fillRect(100 + x, 89 + y, 1, 7);
        g2d.fillRect(99 + x, 92 + y, 1, 6);
        g2d.fillRect(123 + x, 93 + y, 1, 7);
        g2d.fillRect(124 + x, 95 + y, 1, 6);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 7);
        g2d.fillRect(97 + x, 98 + y, 1, 10);
        g2d.fillRect(125 + x, 98 + y, 1, 3);
        g2d.fillRect(96 + x, 100 + y, 1, 10);
        g2d.fillRect(98 + x, 101 + y, 1, 4);
        g2d.fillRect(127 + x, 102 + y, 1, 6);
        g2d.fillRect(95 + x, 103 + y, 1, 8);
        g2d.fillRect(126 + x, 104 + y, 1, 3);
        g2d.fillRect(110 + x, 105 + y, 1, 12);
        g2d.fillRect(128 + x, 105 + y, 1, 4);
        g2d.fillRect(109 + x, 106 + y, 1, 3);
        g2d.fillRect(111 + x, 106 + y, 1, 8);
        g2d.fillRect(112 + x, 106 + y, 1, 7);
        g2d.fillRect(129 + x, 106 + y, 1, 3);
        g2d.fillRect(94 + x, 107 + y, 1, 4);
        g2d.fillRect(93 + x, 108 + y, 1, 3);
        g2d.fillRect(109 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 115 + y, 1, 2);
    }
}
