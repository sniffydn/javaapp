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
public class Skrt9 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Skrt9()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt9(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Skrt9(String middle, ColorArray colorSwitch)
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

        if(prevY > 0)
            prevY = 0;

        paintA1(x, prevY - 1, g2d);
        paintA2(x, y + prevY - 2, g2d);
        paintTL(x,0,g2d);

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
        g2d.fillRect(104 + x, 51 + y, 1, 2);
        g2d.fillRect(105 + x, 51 + y, 1, 2);
        g2d.fillRect(110 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 1, 2);
        g2d.fillRect(116 + x, 51 + y, 1, 2);
        g2d.fillRect(117 + x, 51 + y, 1, 2);
        g2d.fillRect(101 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(113 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 2, 1);
        g2d.fillRect(110 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 6);
        g2d.fillRect(120 + x, 52 + y, 1, 6);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 3);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 6);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 49 + y, 4, 1);
        g2d.fillRect(112 + x, 49 + y, 4, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(118 + x, 55 + y, 1, 4);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 50 + y, 2, 1);
        g2d.fillRect(107 + x, 50 + y, 2, 1);
        g2d.fillRect(110 + x, 50 + y, 2, 1);
        g2d.fillRect(113 + x, 50 + y, 2, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(109 + x, 51 + y, 1, 2);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 2, 1);
        g2d.fillRect(104 + x, 53 + y, 2, 1);
        g2d.fillRect(107 + x, 53 + y, 2, 1);
        g2d.fillRect(110 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 2, 1);
        g2d.fillRect(116 + x, 53 + y, 2, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 2, 1);
        g2d.fillRect(110 + x, 56 + y, 2, 1);
        g2d.fillRect(113 + x, 56 + y, 2, 1);
        g2d.fillRect(116 + x, 56 + y, 2, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(104 + x, 49 + y, 2, 1);
        g2d.fillRect(110 + x, 49 + y, 2, 1);
        g2d.fillRect(116 + x, 49 + y, 2, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 2);
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 2);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(110 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 57 + y, 2, 1);
    }





    public void paintA1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 5);
        g2d.fillRect(107 + x, 72 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 70 + y, 2, 1);
        g2d.fillRect(107 + x, 71 + y, 2, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 4);
    }





    public void paintA2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(107 + x, 76 + y, 2, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 3);
        g2d.fillRect(110 + x, 77 + y, 1, 6);
        g2d.fillRect(106 + x, 78 + y, 1, 5);
        g2d.fillRect(109 + x, 80 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 76 + y, 1, 4);
        g2d.fillRect(107 + x, 77 + y, 1, 4);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(103 + x, 67 + y, 1, 3);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 63 + y, 1, 2);
        g2d.fillRect(107 + x, 66 + y, 1, 4);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 3);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 3);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 2, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 3, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 3);
        g2d.fillRect(110 + x, 70 + y, 2, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 2);
        g2d.fillRect(107 + x, 72 + y, 1, 2);
        g2d.fillRect(108 + x, 72 + y, 1, 2);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 75 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 2);
        g2d.fillRect(110 + x, 75 + y, 1, 2);
        g2d.fillRect(111 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(101 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 78 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(114 + x, 78 + y, 1, 2);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(104 + x, 81 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 2);
        g2d.fillRect(119 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 2);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(122 + x, 87 + y, 1, 2);
        g2d.fillRect(98 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(107 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 90 + y, 1, 2);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 93 + y, 1, 2);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(110 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(122 + x, 93 + y, 1, 2);
        g2d.fillRect(123 + x, 93 + y, 1, 2);
        g2d.fillRect(101 + x, 96 + y, 1, 2);
        g2d.fillRect(102 + x, 96 + y, 1, 2);
        g2d.fillRect(107 + x, 96 + y, 1, 2);
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(113 + x, 96 + y, 1, 2);
        g2d.fillRect(114 + x, 96 + y, 1, 2);
        g2d.fillRect(119 + x, 96 + y, 1, 2);
        g2d.fillRect(120 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 99 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 5);
        g2d.fillRect(103 + x, 65 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 3);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 4);
        g2d.fillRect(101 + x, 75 + y, 1, 3);
        g2d.fillRect(120 + x, 77 + y, 1, 3);
        g2d.fillRect(100 + x, 78 + y, 1, 4);
        g2d.fillRect(121 + x, 80 + y, 1, 4);
        g2d.fillRect(99 + x, 82 + y, 1, 3);
        g2d.fillRect(122 + x, 84 + y, 1, 3);
        g2d.fillRect(98 + x, 85 + y, 1, 3);
        g2d.fillRect(123 + x, 87 + y, 1, 3);
        g2d.fillRect(97 + x, 88 + y, 1, 2);
        g2d.fillRect(96 + x, 90 + y, 1, 2);
        g2d.fillRect(124 + x, 90 + y, 1, 2);
        g2d.fillRect(95 + x, 92 + y, 1, 1);
        g2d.fillRect(125 + x, 92 + y, 1, 2);
        g2d.fillRect(94 + x, 93 + y, 1, 2);
        g2d.fillRect(126 + x, 94 + y, 1, 1);
        g2d.fillRect(95 + x, 95 + y, 1, 1);
        g2d.fillRect(124 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 67 + y, 6, 1);
        g2d.fillRect(110 + x, 68 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 3, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 4);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 60 + y, 2, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 7);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(104 + x, 71 + y, 1, 2);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(102 + x, 75 + y, 1, 3);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(97 + x, 90 + y, 1, 2);
        g2d.fillRect(96 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(95 + x, 93 + y, 1, 2);
        g2d.fillRect(125 + x, 94 + y, 1, 1);
        g2d.fillRect(96 + x, 96 + y, 1, 1);
        g2d.fillRect(123 + x, 96 + y, 1, 1);
        g2d.fillRect(97 + x, 97 + y, 2, 1);
        g2d.fillRect(121 + x, 97 + y, 2, 1);
        g2d.fillRect(99 + x, 98 + y, 4, 1);
        g2d.fillRect(118 + x, 98 + y, 3, 1);
        g2d.fillRect(102 + x, 99 + y, 5, 1);
        g2d.fillRect(115 + x, 99 + y, 3, 1);
        g2d.fillRect(107 + x, 100 + y, 8, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(110 + x, 59 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 2, 1);
        g2d.fillRect(107 + x, 62 + y, 2, 1);
        g2d.fillRect(110 + x, 62 + y, 2, 1);
        g2d.fillRect(113 + x, 62 + y, 2, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 65 + y, 2, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 4);
        g2d.fillRect(107 + x, 71 + y, 2, 1);
        g2d.fillRect(110 + x, 71 + y, 2, 1);
        g2d.fillRect(113 + x, 71 + y, 2, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(112 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 74 + y, 2, 1);
        g2d.fillRect(107 + x, 74 + y, 2, 1);
        g2d.fillRect(110 + x, 74 + y, 2, 1);
        g2d.fillRect(113 + x, 74 + y, 2, 1);
        g2d.fillRect(116 + x, 74 + y, 2, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(115 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 77 + y, 2, 1);
        g2d.fillRect(107 + x, 77 + y, 2, 1);
        g2d.fillRect(110 + x, 77 + y, 2, 1);
        g2d.fillRect(113 + x, 77 + y, 2, 1);
        g2d.fillRect(116 + x, 77 + y, 2, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(106 + x, 78 + y, 1, 2);
        g2d.fillRect(109 + x, 78 + y, 1, 2);
        g2d.fillRect(112 + x, 78 + y, 1, 2);
        g2d.fillRect(115 + x, 78 + y, 1, 2);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 2, 1);
        g2d.fillRect(107 + x, 80 + y, 2, 1);
        g2d.fillRect(110 + x, 80 + y, 2, 1);
        g2d.fillRect(113 + x, 80 + y, 2, 1);
        g2d.fillRect(116 + x, 80 + y, 2, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(115 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 83 + y, 2, 1);
        g2d.fillRect(104 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 83 + y, 2, 1);
        g2d.fillRect(110 + x, 83 + y, 2, 1);
        g2d.fillRect(113 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(115 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 2, 1);
        g2d.fillRect(107 + x, 86 + y, 2, 1);
        g2d.fillRect(110 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 86 + y, 2, 1);
        g2d.fillRect(116 + x, 86 + y, 2, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 2);
        g2d.fillRect(103 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 87 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 2, 1);
        g2d.fillRect(104 + x, 89 + y, 2, 1);
        g2d.fillRect(107 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 2, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 2);
        g2d.fillRect(121 + x, 90 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 2, 1);
        g2d.fillRect(101 + x, 92 + y, 2, 1);
        g2d.fillRect(104 + x, 92 + y, 2, 1);
        g2d.fillRect(107 + x, 92 + y, 2, 1);
        g2d.fillRect(110 + x, 92 + y, 2, 1);
        g2d.fillRect(113 + x, 92 + y, 2, 1);
        g2d.fillRect(116 + x, 92 + y, 2, 1);
        g2d.fillRect(119 + x, 92 + y, 2, 1);
        g2d.fillRect(122 + x, 92 + y, 2, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(112 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 93 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(121 + x, 93 + y, 1, 2);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 2, 1);
        g2d.fillRect(101 + x, 95 + y, 2, 1);
        g2d.fillRect(104 + x, 95 + y, 2, 1);
        g2d.fillRect(107 + x, 95 + y, 2, 1);
        g2d.fillRect(110 + x, 95 + y, 2, 1);
        g2d.fillRect(113 + x, 95 + y, 2, 1);
        g2d.fillRect(116 + x, 95 + y, 2, 1);
        g2d.fillRect(119 + x, 95 + y, 2, 1);
        g2d.fillRect(122 + x, 95 + y, 2, 1);
        g2d.fillRect(97 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 2);
        g2d.fillRect(103 + x, 96 + y, 1, 2);
        g2d.fillRect(106 + x, 96 + y, 1, 2);
        g2d.fillRect(109 + x, 96 + y, 1, 2);
        g2d.fillRect(112 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(118 + x, 96 + y, 1, 2);
        g2d.fillRect(121 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 2, 1);
        g2d.fillRect(107 + x, 98 + y, 2, 1);
        g2d.fillRect(110 + x, 98 + y, 2, 1);
        g2d.fillRect(113 + x, 98 + y, 2, 1);
        g2d.fillRect(116 + x, 98 + y, 2, 1);
        g2d.fillRect(109 + x, 99 + y, 1, 1);
        g2d.fillRect(112 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 2);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(98 + x, 90 + y, 1, 2);
        g2d.fillRect(122 + x, 90 + y, 1, 2);
        g2d.fillRect(123 + x, 90 + y, 1, 2);
        g2d.fillRect(97 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 1, 1);
        g2d.fillRect(96 + x, 93 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 2, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 2);
        g2d.fillRect(113 + x, 69 + y, 1, 2);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 2);
        g2d.fillRect(111 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 2, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 1, 2);
        g2d.fillRect(108 + x, 75 + y, 1, 2);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(105 + x, 78 + y, 1, 2);
        g2d.fillRect(110 + x, 78 + y, 1, 2);
        g2d.fillRect(111 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 2);
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(113 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(116 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 2);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 1, 2);
        g2d.fillRect(105 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(112 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 2);
        g2d.fillRect(97 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(121 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 2, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 2);
        g2d.fillRect(111 + x, 96 + y, 1, 2);
        g2d.fillRect(116 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 2);
        g2d.fillRect(122 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(109 + x, 98 + y, 1, 1);
        g2d.fillRect(112 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(107 + x, 99 + y, 2, 1);
        g2d.fillRect(113 + x, 99 + y, 2, 1);
    }
}
