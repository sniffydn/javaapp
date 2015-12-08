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
public class Skrt6 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;
    {
        containsTL = true;
        containsB = true;
        drs = true;
        includeInAutoPick = false;
    }

    public Skrt6()
    {
        super();
    }

    public Skrt6(String middle)
    {
        super(middle);
    }

    public Skrt6(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(101 + x, 47 + y, 1, 13);
        g2d.fillRect(102 + x, 47 + y, 1, 5);
        g2d.fillRect(103 + x, 47 + y, 1, 4);
        g2d.fillRect(114 + x, 47 + y, 3, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 3);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 9);
        g2d.fillRect(119 + x, 50 + y, 1, 9);
        g2d.fillRect(120 + x, 50 + y, 1, 8);
        g2d.fillRect(99 + x, 51 + y, 1, 7);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 8);
        g2d.fillRect(103 + x, 54 + y, 1, 7);
        g2d.fillRect(118 + x, 54 + y, 1, 6);
        g2d.fillRect(104 + x, 55 + y, 1, 4);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 6);
        g2d.fillRect(117 + x, 55 + y, 1, 6);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 3, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 50 + y, 1, 3);
        g2d.fillRect(116 + x, 50 + y, 2, 1);
        g2d.fillRect(103 + x, 51 + y, 2, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 4, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 3);
        g2d.fillRect(115 + x, 54 + y, 3, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 4);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 1, 2);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(104 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 51 + y, 1, 3);
        g2d.fillRect(117 + x, 51 + y, 1, 3);
        g2d.fillRect(103 + x, 52 + y, 3, 1);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 3, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 6, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 3, 1);
        g2d.fillRect(111 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 48 + y, 1, 2);
        g2d.fillRect(110 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 7);
        g2d.fillRect(110 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(105 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 48 + y, 1, 2);
        g2d.fillRect(107 + x, 48 + y, 1, 2);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 3);
        g2d.fillRect(113 + x, 52 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(105 + x, 47 + y, 3, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(109 + x, 48 + y, 1, 2);
        g2d.fillRect(111 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 3);
        g2d.fillRect(107 + x, 50 + y, 1, 4);
        g2d.fillRect(108 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(111 + x, 49 + y, 1, 5);
        g2d.fillRect(113 + x, 49 + y, 1, 3);
        g2d.fillRect(108 + x, 50 + y, 1, 2);
        g2d.fillRect(109 + x, 50 + y, 1, 3);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 40 + y, 2, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 8);
        g2d.fillRect(101 + x, 41 + y, 1, 7);
        g2d.fillRect(104 + x, 41 + y, 1, 5);
        g2d.fillRect(105 + x, 41 + y, 1, 5);
        g2d.fillRect(106 + x, 41 + y, 1, 5);
        g2d.fillRect(110 + x, 41 + y, 1, 4);
        g2d.fillRect(111 + x, 41 + y, 1, 5);
        g2d.fillRect(112 + x, 41 + y, 1, 5);
        g2d.fillRect(107 + x, 42 + y, 1, 3);
        g2d.fillRect(109 + x, 42 + y, 1, 3);
        g2d.fillRect(108 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 4);
        g2d.fillRect(115 + x, 44 + y, 1, 4);
        g2d.fillRect(103 + x, 45 + y, 1, 3);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 8, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 8);
        g2d.fillRect(104 + x, 60 + y, 1, 5);
        g2d.fillRect(114 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 60 + y, 1, 7);
        g2d.fillRect(112 + x, 61 + y, 2, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 69 + y, 1, 4);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 1);
        g2d.fillRect(100 + x, 72 + y, 1, 5);
        g2d.fillRect(101 + x, 72 + y, 1, 3);
        g2d.fillRect(120 + x, 72 + y, 1, 2);
        g2d.fillRect(99 + x, 73 + y, 1, 5);
        g2d.fillRect(121 + x, 73 + y, 1, 2);
        g2d.fillRect(98 + x, 74 + y, 1, 5);
        g2d.fillRect(122 + x, 74 + y, 1, 3);
        g2d.fillRect(96 + x, 75 + y, 1, 6);
        g2d.fillRect(97 + x, 75 + y, 1, 5);
        g2d.fillRect(123 + x, 75 + y, 1, 10);
        g2d.fillRect(95 + x, 76 + y, 1, 5);
        g2d.fillRect(124 + x, 76 + y, 1, 10);
        g2d.fillRect(93 + x, 77 + y, 1, 5);
        g2d.fillRect(94 + x, 77 + y, 1, 5);
        g2d.fillRect(125 + x, 77 + y, 1, 10);
        g2d.fillRect(92 + x, 78 + y, 1, 5);
        g2d.fillRect(126 + x, 78 + y, 1, 8);
        g2d.fillRect(91 + x, 79 + y, 1, 5);
        g2d.fillRect(89 + x, 80 + y, 1, 2);
        g2d.fillRect(90 + x, 80 + y, 1, 3);
        g2d.fillRect(127 + x, 80 + y, 1, 5);
        g2d.fillRect(128 + x, 80 + y, 1, 4);
        g2d.fillRect(129 + x, 81 + y, 1, 2);
        g2d.fillRect(122 + x, 82 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 8);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 6);
        g2d.fillRect(104 + x, 85 + y, 1, 7);
        g2d.fillRect(105 + x, 85 + y, 1, 7);
        g2d.fillRect(118 + x, 85 + y, 1, 4);
        g2d.fillRect(119 + x, 85 + y, 1, 8);
        g2d.fillRect(101 + x, 86 + y, 1, 5);
        g2d.fillRect(106 + x, 86 + y, 1, 6);
        g2d.fillRect(107 + x, 86 + y, 1, 6);
        g2d.fillRect(113 + x, 86 + y, 1, 7);
        g2d.fillRect(114 + x, 86 + y, 1, 7);
        g2d.fillRect(120 + x, 87 + y, 1, 5);
        g2d.fillRect(100 + x, 88 + y, 1, 3);
        g2d.fillRect(121 + x, 88 + y, 1, 4);
        g2d.fillRect(99 + x, 89 + y, 1, 2);
        g2d.fillRect(122 + x, 89 + y, 1, 3);
        g2d.fillRect(123 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 3);
        g2d.fillRect(108 + x, 60 + y, 1, 3);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 2, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 2, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 4, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 2);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(101 + x, 70 + y, 1, 2);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(100 + x, 71 + y, 1, 1);
        g2d.fillRect(120 + x, 71 + y, 1, 1);
        g2d.fillRect(99 + x, 72 + y, 1, 1);
        g2d.fillRect(121 + x, 72 + y, 1, 1);
        g2d.fillRect(98 + x, 73 + y, 1, 1);
        g2d.fillRect(122 + x, 73 + y, 1, 1);
        g2d.fillRect(96 + x, 74 + y, 2, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 75 + y, 1, 1);
        g2d.fillRect(124 + x, 75 + y, 1, 1);
        g2d.fillRect(93 + x, 76 + y, 2, 1);
        g2d.fillRect(125 + x, 76 + y, 1, 1);
        g2d.fillRect(92 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 77 + y, 1, 2);
        g2d.fillRect(126 + x, 77 + y, 1, 1);
        g2d.fillRect(91 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 78 + y, 1, 2);
        g2d.fillRect(98 + x, 79 + y, 1, 2);
        g2d.fillRect(88 + x, 80 + y, 1, 1);
        g2d.fillRect(97 + x, 80 + y, 1, 2);
        g2d.fillRect(129 + x, 80 + y, 1, 1);
        g2d.fillRect(95 + x, 81 + y, 1, 3);
        g2d.fillRect(96 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 81 + y, 1, 7);
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(130 + x, 81 + y, 1, 1);
        g2d.fillRect(93 + x, 82 + y, 1, 4);
        g2d.fillRect(94 + x, 82 + y, 1, 3);
        g2d.fillRect(99 + x, 82 + y, 1, 7);
        g2d.fillRect(92 + x, 83 + y, 1, 2);
        g2d.fillRect(98 + x, 83 + y, 1, 7);
        g2d.fillRect(102 + x, 83 + y, 1, 2);
        g2d.fillRect(97 + x, 84 + y, 1, 5);
        g2d.fillRect(122 + x, 84 + y, 1, 1);
        g2d.fillRect(96 + x, 85 + y, 1, 4);
        g2d.fillRect(120 + x, 85 + y, 1, 2);
        g2d.fillRect(123 + x, 85 + y, 1, 1);
        g2d.fillRect(94 + x, 86 + y, 2, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 6);
        g2d.fillRect(111 + x, 86 + y, 1, 7);
        g2d.fillRect(112 + x, 86 + y, 1, 7);
        g2d.fillRect(115 + x, 86 + y, 1, 7);
        g2d.fillRect(116 + x, 86 + y, 2, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(124 + x, 86 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 3);
        g2d.fillRect(122 + x, 87 + y, 1, 2);
        g2d.fillRect(125 + x, 87 + y, 1, 1);
        g2d.fillRect(123 + x, 88 + y, 1, 2);
        g2d.fillRect(126 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 4);
        g2d.fillRect(124 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(94 + x, 75 + y, 1, 1);
        g2d.fillRect(125 + x, 75 + y, 1, 1);
        g2d.fillRect(126 + x, 76 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 79 + y, 1, 2);
        g2d.fillRect(99 + x, 80 + y, 1, 2);
        g2d.fillRect(98 + x, 81 + y, 1, 2);
        g2d.fillRect(97 + x, 82 + y, 1, 2);
        g2d.fillRect(96 + x, 83 + y, 1, 2);
        g2d.fillRect(95 + x, 84 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(94 + x, 85 + y, 1, 1);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 7);
        g2d.fillRect(110 + x, 86 + y, 1, 7);
        g2d.fillRect(123 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 3);
        g2d.fillRect(124 + x, 87 + y, 1, 2);
        g2d.fillRect(125 + x, 88 + y, 1, 2);
        g2d.fillRect(126 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 62 + y, 1, 5);
        g2d.fillRect(110 + x, 62 + y, 1, 3);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 2, 1);
        g2d.fillRect(111 + x, 64 + y, 3, 1);
        g2d.fillRect(106 + x, 65 + y, 3, 1);
        g2d.fillRect(107 + x, 66 + y, 2, 1);
        g2d.fillRect(110 + x, 66 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 67 + y, 6, 1);
        g2d.fillRect(103 + x, 70 + y, 7, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 2);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(102 + x, 75 + y, 1, 6);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 2, 1);
        g2d.fillRect(106 + x, 84 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 40 + y, 1, 3);
        g2d.fillRect(100 + x, 41 + y, 1, 8);
        g2d.fillRect(102 + x, 41 + y, 1, 3);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 1);
        g2d.fillRect(109 + x, 46 + y, 1, 1);
        g2d.fillRect(111 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 4, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 2);
        g2d.fillRect(111 + x, 70 + y, 3, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 2);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(119 + x, 72 + y, 1, 2);
        g2d.fillRect(120 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 75 + y, 1, 2);
        g2d.fillRect(101 + x, 76 + y, 1, 1);
        g2d.fillRect(122 + x, 77 + y, 1, 3);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 5, 1);
        g2d.fillRect(90 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 2, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 3, 1);
        g2d.fillRect(114 + x, 70 + y, 3, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 2);
        g2d.fillRect(106 + x, 71 + y, 4, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 6);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 41 + y, 3, 1);
        g2d.fillRect(107 + x, 41 + y, 3, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(108 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 43 + y, 1, 5);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 3);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(120 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 2, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 1, 2);
        g2d.fillRect(106 + x, 68 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 2);
        g2d.fillRect(111 + x, 71 + y, 1, 4);
        g2d.fillRect(112 + x, 71 + y, 2, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 3);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 3);
        g2d.fillRect(107 + x, 72 + y, 1, 2);
        g2d.fillRect(110 + x, 72 + y, 1, 3);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(105 + x, 73 + y, 1, 9);
        g2d.fillRect(101 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 6);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 2);
        g2d.fillRect(106 + x, 79 + y, 1, 4);
        g2d.fillRect(121 + x, 79 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(122 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 2);
        g2d.fillRect(88 + x, 82 + y, 2, 1);
        g2d.fillRect(108 + x, 82 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(89 + x, 83 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 8, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(90 + x, 84 + y, 2, 1);
        g2d.fillRect(104 + x, 84 + y, 2, 1);
        g2d.fillRect(118 + x, 84 + y, 2, 1);
        g2d.fillRect(91 + x, 85 + y, 1, 2);
        g2d.fillRect(92 + x, 85 + y, 1, 2);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 3, 1);
        g2d.fillRect(127 + x, 85 + y, 1, 2);
        g2d.fillRect(128 + x, 85 + y, 1, 1);
        g2d.fillRect(93 + x, 86 + y, 1, 2);
        g2d.fillRect(126 + x, 86 + y, 1, 2);
        g2d.fillRect(94 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 91 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 2);
        g2d.fillRect(116 + x, 41 + y, 2, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 2);
        g2d.fillRect(96 + x, 42 + y, 3, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(98 + x, 43 + y, 2, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 2);
        g2d.fillRect(108 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 5);
        g2d.fillRect(107 + x, 45 + y, 1, 1);
        g2d.fillRect(109 + x, 45 + y, 2, 1);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 2);
        g2d.fillRect(98 + x, 46 + y, 1, 3);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 2);
        g2d.fillRect(97 + x, 47 + y, 1, 3);
        g2d.fillRect(107 + x, 47 + y, 5, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 3);
        g2d.fillRect(108 + x, 48 + y, 4, 1);
        g2d.fillRect(94 + x, 49 + y, 1, 2);
        g2d.fillRect(95 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 2);
        g2d.fillRect(111 + x, 68 + y, 1, 2);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 2, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 7);
        g2d.fillRect(108 + x, 74 + y, 1, 8);
        g2d.fillRect(119 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 4);
        g2d.fillRect(109 + x, 75 + y, 1, 7);
        g2d.fillRect(120 + x, 75 + y, 1, 5);
        g2d.fillRect(121 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 78 + y, 1, 4);
        g2d.fillRect(110 + x, 79 + y, 1, 3);
        g2d.fillRect(111 + x, 80 + y, 1, 3);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 2);
        g2d.fillRect(123 + x, 91 + y, 1, 2);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(120 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 2);
        g2d.fillRect(122 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 5, 1);
        g2d.fillRect(111 + x, 94 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(103 + x, 40 + y, 3, 1);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(117 + x, 42 + y, 1, 4);
        g2d.fillRect(118 + x, 42 + y, 1, 5);
        g2d.fillRect(96 + x, 43 + y, 1, 5);
        g2d.fillRect(97 + x, 43 + y, 1, 4);
        g2d.fillRect(95 + x, 44 + y, 1, 5);
        g2d.fillRect(98 + x, 44 + y, 1, 2);
        g2d.fillRect(119 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 4);
        g2d.fillRect(107 + x, 46 + y, 2, 1);
        g2d.fillRect(110 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 46 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 2);
        g2d.fillRect(113 + x, 68 + y, 1, 2);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(115 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 72 + y, 1, 9);
        g2d.fillRect(113 + x, 73 + y, 1, 8);
        g2d.fillRect(117 + x, 73 + y, 1, 8);
        g2d.fillRect(114 + x, 74 + y, 1, 7);
        g2d.fillRect(115 + x, 74 + y, 1, 7);
        g2d.fillRect(116 + x, 74 + y, 1, 7);
        g2d.fillRect(118 + x, 74 + y, 1, 6);
        g2d.fillRect(110 + x, 75 + y, 1, 4);
        g2d.fillRect(111 + x, 75 + y, 1, 5);
        g2d.fillRect(119 + x, 75 + y, 1, 3);
        g2d.fillRect(129 + x, 83 + y, 1, 2);
        g2d.fillRect(130 + x, 83 + y, 1, 1);
        g2d.fillRect(128 + x, 84 + y, 1, 1);
        g2d.fillRect(92 + x, 87 + y, 1, 1);
        g2d.fillRect(94 + x, 88 + y, 2, 1);
        g2d.fillRect(95 + x, 89 + y, 3, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(125 + x, 90 + y, 1, 2);
        g2d.fillRect(126 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(124 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 5, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 6, 1);
    }

}
