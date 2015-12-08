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
public class Skrt2 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt2()
    {
        super();
        containsTL = true;
        containsB = true;
    }

    public Skrt2(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
    }

    public Skrt2(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
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

        if(y == -1)
            y = 0;

        if(prevY == -1)
            prevY = 0;
        paintTL1(x, y, g2d);
        paintTL2(x, y + prevY, g2d);
    }
    int prevY = 0;

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);

        if(prevY == -1)
        {
            paintB1(x, y, g2d);
        }
        else if(prevY == 1)
        {
            paintB3(x, y, g2d);
        }
        else
        {
            paintB2(x, y, g2d);
        }

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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 51 + y, 1, 3);
        g2d.fillRect(100 + x, 51 + y, 1, 2);
        g2d.fillRect(101 + x, 51 + y, 1, 2);
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(109 + x, 51 + y, 1, 2);
        g2d.fillRect(110 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 2);
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 3);
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(98 + x, 54 + y, 1, 3);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 2, 1);
        g2d.fillRect(114 + x, 61 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 53 + y, 1, 4);
        g2d.fillRect(101 + x, 53 + y, 1, 5);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 53 + y, 14, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 2, 1);
        g2d.fillRect(113 + x, 54 + y, 7, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(110 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 3, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 2, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 5);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 4, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 6);
        g2d.fillRect(113 + x, 55 + y, 1, 4);
        g2d.fillRect(115 + x, 55 + y, 2, 1);
        g2d.fillRect(104 + x, 56 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 3, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 3);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 2, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 81 + y, 2, 1);
        g2d.fillRect(102 + x, 82 + y, 4, 1);
        g2d.fillRect(115 + x, 82 + y, 3, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 2);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 3, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 3);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 3);
        g2d.fillRect(110 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 2);
        g2d.fillRect(115 + x, 86 + y, 2, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 3, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 82 + y, 1, 4);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 5, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 5, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 3);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 83 + y, 2, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 4, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 4, 1);
        g2d.fillRect(111 + x, 87 + y, 4, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(123 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 3, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 3);
        g2d.fillRect(105 + x, 88 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(118 + x, 88 + y, 1, 3);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 2, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 2, 1);
        g2d.fillRect(111 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 87 + y, 1, 2);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 4, 1);
        g2d.fillRect(115 + x, 87 + y, 7, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 2);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 1, 3);
        g2d.fillRect(109 + x, 88 + y, 1, 3);
        g2d.fillRect(112 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(114 + x, 88 + y, 1, 3);
        g2d.fillRect(116 + x, 88 + y, 1, 2);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(121 + x, 88 + y, 1, 2);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 2, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 2);
        g2d.fillRect(100 + x, 89 + y, 2, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 73 + y, 1, 5);
        g2d.fillRect(114 + x, 73 + y, 1, 5);
        g2d.fillRect(118 + x, 73 + y, 1, 5);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 4);
        g2d.fillRect(117 + x, 74 + y, 1, 4);
        g2d.fillRect(120 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 3);
        g2d.fillRect(101 + x, 76 + y, 1, 2);
        g2d.fillRect(102 + x, 76 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 2);
        g2d.fillRect(104 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 76 + y, 1, 2);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 2);
        g2d.fillRect(109 + x, 76 + y, 1, 2);
        g2d.fillRect(110 + x, 76 + y, 1, 2);
        g2d.fillRect(111 + x, 76 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 2);
        g2d.fillRect(100 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 61 + y, 1, 4);
        g2d.fillRect(116 + x, 61 + y, 1, 7);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(101 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(99 + x, 81 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 83 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(104 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 3, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 6);
        g2d.fillRect(104 + x, 65 + y, 1, 7);
        g2d.fillRect(105 + x, 67 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(117 + x, 70 + y, 1, 2);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(100 + x, 78 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 4);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 2);
        g2d.fillRect(117 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 3);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 2, 1);
        g2d.fillRect(100 + x, 82 + y, 6, 1);
        g2d.fillRect(115 + x, 82 + y, 3, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 61 + y, 4, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(104 + x, 62 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 5);
        g2d.fillRect(107 + x, 62 + y, 1, 3);
        g2d.fillRect(108 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 3);
        g2d.fillRect(114 + x, 62 + y, 1, 11);
        g2d.fillRect(106 + x, 63 + y, 1, 9);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 65 + y, 1, 3);
        g2d.fillRect(111 + x, 65 + y, 2, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 3);
        g2d.fillRect(112 + x, 66 + y, 1, 3);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 67 + y, 1, 4);
        g2d.fillRect(110 + x, 68 + y, 1, 3);
        g2d.fillRect(115 + x, 68 + y, 1, 6);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 6);
        g2d.fillRect(107 + x, 70 + y, 1, 3);
        g2d.fillRect(116 + x, 70 + y, 1, 2);
        g2d.fillRect(104 + x, 72 + y, 1, 4);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 2, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 3);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 74 + y, 1, 2);
        g2d.fillRect(109 + x, 74 + y, 1, 2);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 2, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 4);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 3, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 3);
        g2d.fillRect(109 + x, 78 + y, 1, 5);
        g2d.fillRect(110 + x, 78 + y, 3, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 78 + y, 1, 3);
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 2, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 3);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(112 + x, 80 + y, 2, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 2);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 61 + y, 1, 3);
        g2d.fillRect(111 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 5);
        g2d.fillRect(108 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 6);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 3);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 71 + y, 1, 3);
        g2d.fillRect(110 + x, 71 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 2, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 2);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 2);
        g2d.fillRect(114 + x, 78 + y, 1, 5);
        g2d.fillRect(118 + x, 78 + y, 1, 3);
        g2d.fillRect(113 + x, 82 + y, 1, 3);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 5);
        g2d.fillRect(118 + x, 79 + y, 1, 4);
        g2d.fillRect(113 + x, 83 + y, 1, 4);
    }





    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(114 + x, 79 + y, 1, 6);
        g2d.fillRect(118 + x, 79 + y, 1, 5);
        g2d.fillRect(113 + x, 84 + y, 1, 5);
    }

}
