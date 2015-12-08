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
public class Skrt8 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt8()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt8(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt8(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
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

        if(prevY > 0 || y > 0)
            paintTL2(x,0,g2d);
        else
            paintTL1(x,0,g2d);


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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 47 + y, 1, 4);
        g2d.fillRect(116 + x, 47 + y, 1, 7);
        g2d.fillRect(100 + x, 50 + y, 4, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 2, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(110 + x, 56 + y, 2, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 4);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 3, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 3, 1);
        g2d.fillRect(101 + x, 59 + y, 5, 1);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 3);
        g2d.fillRect(106 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 3, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 2, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 2, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 2, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 6, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 3, 1);
        g2d.fillRect(103 + x, 58 + y, 2, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 6);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 4);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 3, 1);
        g2d.fillRect(118 + x, 56 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 4);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 4);
        g2d.fillRect(102 + x, 52 + y, 1, 4);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 2, 1);
        g2d.fillRect(119 + x, 55 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
    }

    public void paintTL1(int x, int y, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 40 + y, 1, 8);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 3);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 6);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 3, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 5);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 3);
        g2d.fillRect(100 + x, 78 + y, 1, 3);
        g2d.fillRect(99 + x, 81 + y, 1, 10);
        g2d.fillRect(100 + x, 91 + y, 1, 3);
        g2d.fillRect(101 + x, 94 + y, 2, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 3, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 45 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(103 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 4);
        g2d.fillRect(111 + x, 65 + y, 1, 11);
        g2d.fillRect(114 + x, 65 + y, 1, 4);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 69 + y, 1, 6);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 4);
        g2d.fillRect(120 + x, 75 + y, 1, 4);
        g2d.fillRect(121 + x, 79 + y, 1, 3);
        g2d.fillRect(122 + x, 82 + y, 1, 10);
        g2d.fillRect(121 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 2, 1);
        g2d.fillRect(104 + x, 95 + y, 6, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 4);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 3);
        g2d.fillRect(105 + x, 70 + y, 1, 2);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 3);
        g2d.fillRect(112 + x, 75 + y, 1, 19);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 3);
        g2d.fillRect(105 + x, 77 + y, 1, 3);
        g2d.fillRect(116 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 5);
        g2d.fillRect(118 + x, 86 + y, 1, 3);
        g2d.fillRect(113 + x, 90 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 25);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 4);
        g2d.fillRect(116 + x, 72 + y, 1, 3);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 4);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 4);
        g2d.fillRect(115 + x, 76 + y, 1, 6);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 12);
        g2d.fillRect(117 + x, 78 + y, 1, 3);
        g2d.fillRect(111 + x, 79 + y, 1, 4);
        g2d.fillRect(120 + x, 79 + y, 1, 3);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 5);
        g2d.fillRect(116 + x, 81 + y, 1, 7);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 4);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 4);
        g2d.fillRect(117 + x, 86 + y, 1, 5);
        g2d.fillRect(107 + x, 88 + y, 1, 7);
        g2d.fillRect(114 + x, 89 + y, 1, 6);
        g2d.fillRect(118 + x, 89 + y, 1, 3);
        g2d.fillRect(119 + x, 91 + y, 1, 3);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 5);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 4);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 4);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 4);
        g2d.fillRect(113 + x, 69 + y, 1, 5);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 3);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 19);
        g2d.fillRect(104 + x, 76 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 4);
        g2d.fillRect(119 + x, 79 + y, 1, 4);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 3);
        g2d.fillRect(100 + x, 81 + y, 1, 6);
        g2d.fillRect(105 + x, 82 + y, 1, 5);
        g2d.fillRect(115 + x, 82 + y, 1, 3);
        g2d.fillRect(120 + x, 82 + y, 1, 4);
        g2d.fillRect(107 + x, 83 + y, 1, 5);
        g2d.fillRect(111 + x, 83 + y, 1, 4);
        g2d.fillRect(104 + x, 84 + y, 1, 6);
        g2d.fillRect(121 + x, 84 + y, 1, 5);
        g2d.fillRect(103 + x, 86 + y, 1, 5);
        g2d.fillRect(114 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 8);
        g2d.fillRect(119 + x, 87 + y, 1, 4);
        g2d.fillRect(102 + x, 88 + y, 1, 6);
        g2d.fillRect(116 + x, 88 + y, 1, 4);
        g2d.fillRect(101 + x, 89 + y, 1, 5);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(105 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 4);
        g2d.fillRect(115 + x, 92 + y, 1, 3);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 4);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 4);
        g2d.fillRect(108 + x, 75 + y, 1, 8);
        g2d.fillRect(103 + x, 76 + y, 1, 4);
        g2d.fillRect(118 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 78 + y, 1, 3);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 7);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 79 + y, 1, 4);
        g2d.fillRect(118 + x, 79 + y, 1, 3);
        g2d.fillRect(107 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 81 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 1, 6);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(108 + x, 83 + y, 1, 11);
        g2d.fillRect(119 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 86 + y, 1, 4);
        g2d.fillRect(120 + x, 86 + y, 1, 4);
        g2d.fillRect(105 + x, 87 + y, 1, 4);
        g2d.fillRect(100 + x, 89 + y, 1, 2);
        g2d.fillRect(121 + x, 89 + y, 1, 3);
        g2d.fillRect(104 + x, 91 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 40 + y, 1, 8);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 3);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 6);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 3, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 5);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 3);
        g2d.fillRect(100 + x, 78 + y, 1, 16);
        g2d.fillRect(101 + x, 94 + y, 2, 1);
        g2d.fillRect(110 + x, 96 + y, 1, 1);
        g2d.fillRect(112 + x, 96 + y, 3, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 45 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(103 + x, 60 + y, 3, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 4);
        g2d.fillRect(111 + x, 65 + y, 1, 11);
        g2d.fillRect(114 + x, 65 + y, 1, 4);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 69 + y, 1, 6);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 4);
        g2d.fillRect(120 + x, 75 + y, 1, 4);
        g2d.fillRect(121 + x, 79 + y, 1, 15);
        g2d.fillRect(103 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 2, 1);
        g2d.fillRect(104 + x, 95 + y, 2, 1);
        g2d.fillRect(117 + x, 95 + y, 2, 1);
        g2d.fillRect(106 + x, 96 + y, 4, 1);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 4);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 3);
        g2d.fillRect(105 + x, 70 + y, 1, 2);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 3);
        g2d.fillRect(112 + x, 75 + y, 1, 20);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 3);
        g2d.fillRect(105 + x, 77 + y, 1, 3);
        g2d.fillRect(116 + x, 79 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 5);
        g2d.fillRect(113 + x, 90 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 26);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 1, 3);
        g2d.fillRect(103 + x, 72 + y, 1, 3);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 4);
        g2d.fillRect(116 + x, 72 + y, 1, 3);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 4);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 4);
        g2d.fillRect(115 + x, 76 + y, 1, 6);
        g2d.fillRect(106 + x, 77 + y, 1, 3);
        g2d.fillRect(101 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 12);
        g2d.fillRect(117 + x, 78 + y, 1, 3);
        g2d.fillRect(111 + x, 79 + y, 1, 4);
        g2d.fillRect(120 + x, 79 + y, 1, 5);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 5);
        g2d.fillRect(116 + x, 81 + y, 1, 7);
        g2d.fillRect(104 + x, 82 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 4);
        g2d.fillRect(117 + x, 86 + y, 1, 5);
        g2d.fillRect(107 + x, 88 + y, 1, 8);
        g2d.fillRect(114 + x, 89 + y, 1, 7);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 1);
        g2d.fillRect(111 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 5);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 4);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 4);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 4);
        g2d.fillRect(113 + x, 69 + y, 1, 5);
        g2d.fillRect(106 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 3);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 20);
        g2d.fillRect(104 + x, 76 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(101 + x, 79 + y, 1, 8);
        g2d.fillRect(119 + x, 79 + y, 1, 7);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 3);
        g2d.fillRect(105 + x, 82 + y, 1, 5);
        g2d.fillRect(115 + x, 82 + y, 1, 3);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 5);
        g2d.fillRect(111 + x, 83 + y, 1, 4);
        g2d.fillRect(104 + x, 84 + y, 1, 6);
        g2d.fillRect(120 + x, 84 + y, 1, 5);
        g2d.fillRect(103 + x, 86 + y, 1, 5);
        g2d.fillRect(114 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 6);
        g2d.fillRect(118 + x, 87 + y, 1, 4);
        g2d.fillRect(102 + x, 88 + y, 1, 6);
        g2d.fillRect(116 + x, 88 + y, 1, 4);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 3);
        g2d.fillRect(105 + x, 91 + y, 1, 4);
        g2d.fillRect(117 + x, 91 + y, 1, 4);
        g2d.fillRect(115 + x, 92 + y, 1, 4);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 4);
        g2d.fillRect(109 + x, 73 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 74 + y, 1, 4);
        g2d.fillRect(108 + x, 75 + y, 1, 8);
        g2d.fillRect(103 + x, 76 + y, 1, 4);
        g2d.fillRect(118 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 78 + y, 1, 3);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 8);
        g2d.fillRect(104 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 2);
        g2d.fillRect(109 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 79 + y, 1, 4);
        g2d.fillRect(118 + x, 79 + y, 1, 3);
        g2d.fillRect(107 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 81 + y, 1, 5);
        g2d.fillRect(106 + x, 83 + y, 1, 4);
        g2d.fillRect(108 + x, 83 + y, 1, 12);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(115 + x, 86 + y, 1, 4);
        g2d.fillRect(119 + x, 86 + y, 1, 4);
        g2d.fillRect(105 + x, 87 + y, 1, 4);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(120 + x, 89 + y, 1, 3);
        g2d.fillRect(104 + x, 91 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
    }
}
