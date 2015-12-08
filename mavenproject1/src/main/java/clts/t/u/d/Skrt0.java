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
public class Skrt0 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Skrt0()
    {
        super();
        containsTL = true;
        drs = true;
    }

    public Skrt0(String middle)
    {
        super(middle);
        containsTL = true;
        drs = true;
    }

    public Skrt0(String middle, ColorArray colorSwitch)
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

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, 0, g2d);
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(100 + x, 51 + y, 6, 1);
        g2d.fillRect(114 + x, 51 + y, 5, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 2, 1);
        g2d.fillRect(112 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 52 + y, 2, 1);
        g2d.fillRect(108 + x, 53 + y, 2, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 5);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(99 + x, 53 + y, 3, 1);
        g2d.fillRect(118 + x, 53 + y, 2, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 1, 4);
        g2d.fillRect(118 + x, 55 + y, 1, 4);
        g2d.fillRect(119 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 56 + y, 1, 4);
        g2d.fillRect(117 + x, 56 + y, 1, 4);
        g2d.fillRect(103 + x, 57 + y, 1, 4);
        g2d.fillRect(115 + x, 57 + y, 1, 4);
        g2d.fillRect(116 + x, 57 + y, 1, 4);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 52 + y, 6, 1);
        g2d.fillRect(114 + x, 52 + y, 5, 1);
        g2d.fillRect(106 + x, 53 + y, 2, 1);
        g2d.fillRect(112 + x, 53 + y, 2, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 2, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 4);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 1, 3);
        g2d.fillRect(106 + x, 56 + y, 1, 3);
        g2d.fillRect(107 + x, 56 + y, 1, 3);
        g2d.fillRect(108 + x, 56 + y, 1, 3);
        g2d.fillRect(109 + x, 56 + y, 1, 2);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 3);
        g2d.fillRect(113 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 3);
        g2d.fillRect(115 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 54 + y, 3, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 3, 1);
        g2d.fillRect(112 + x, 55 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(102 + x, 53 + y, 4, 1);
        g2d.fillRect(114 + x, 53 + y, 4, 1);
        g2d.fillRect(99 + x, 54 + y, 3, 1);
        g2d.fillRect(106 + x, 54 + y, 2, 1);
        g2d.fillRect(112 + x, 54 + y, 2, 1);
        g2d.fillRect(118 + x, 54 + y, 2, 1);
        g2d.fillRect(108 + x, 55 + y, 2, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(116 + x, 60 + y, 1, 8);
        g2d.fillRect(103 + x, 65 + y, 1, 4);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(102 + x, 69 + y, 1, 1);
        g2d.fillRect(101 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(100 + x, 71 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 1);
        g2d.fillRect(99 + x, 72 + y, 1, 1);
        g2d.fillRect(120 + x, 72 + y, 2, 1);
        g2d.fillRect(98 + x, 73 + y, 1, 1);
        g2d.fillRect(122 + x, 73 + y, 2, 1);
        g2d.fillRect(97 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(124 + x, 74 + y, 2, 1);
        g2d.fillRect(95 + x, 75 + y, 2, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(126 + x, 75 + y, 1, 1);
        g2d.fillRect(93 + x, 76 + y, 2, 1);
        g2d.fillRect(127 + x, 76 + y, 2, 1);
        g2d.fillRect(91 + x, 77 + y, 2, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(129 + x, 77 + y, 2, 1);
        g2d.fillRect(88 + x, 78 + y, 3, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 9);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(131 + x, 78 + y, 1, 1);
        g2d.fillRect(86 + x, 79 + y, 2, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 2);
        g2d.fillRect(132 + x, 79 + y, 2, 1);
        g2d.fillRect(85 + x, 80 + y, 1, 1);
        g2d.fillRect(133 + x, 80 + y, 1, 2);
        g2d.fillRect(83 + x, 81 + y, 2, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 1);
        g2d.fillRect(82 + x, 82 + y, 1, 2);
        g2d.fillRect(85 + x, 82 + y, 4, 1);
        g2d.fillRect(122 + x, 82 + y, 1, 1);
        g2d.fillRect(132 + x, 82 + y, 1, 2);
        g2d.fillRect(84 + x, 83 + y, 1, 1);
        g2d.fillRect(89 + x, 83 + y, 2, 1);
        g2d.fillRect(123 + x, 83 + y, 1, 2);
        g2d.fillRect(83 + x, 84 + y, 1, 1);
        g2d.fillRect(91 + x, 84 + y, 2, 1);
        g2d.fillRect(131 + x, 84 + y, 1, 2);
        g2d.fillRect(93 + x, 85 + y, 1, 1);
        g2d.fillRect(124 + x, 85 + y, 1, 1);
        g2d.fillRect(94 + x, 86 + y, 1, 1);
        g2d.fillRect(125 + x, 86 + y, 1, 1);
        g2d.fillRect(130 + x, 86 + y, 1, 1);
        g2d.fillRect(95 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 6);
        g2d.fillRect(126 + x, 87 + y, 1, 2);
        g2d.fillRect(129 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 88 + y, 1, 1);
        g2d.fillRect(128 + x, 88 + y, 1, 1);
        g2d.fillRect(97 + x, 89 + y, 1, 1);
        g2d.fillRect(127 + x, 89 + y, 1, 2);
        g2d.fillRect(98 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(126 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 92 + y, 2, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 3);
        g2d.fillRect(122 + x, 93 + y, 2, 1);
        g2d.fillRect(102 + x, 94 + y, 2, 1);
        g2d.fillRect(119 + x, 94 + y, 3, 1);
        g2d.fillRect(104 + x, 95 + y, 2, 1);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 4, 1);
        g2d.fillRect(108 + x, 96 + y, 7, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(104 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 3);
        g2d.fillRect(102 + x, 70 + y, 1, 2);
        g2d.fillRect(103 + x, 70 + y, 1, 1);
        g2d.fillRect(101 + x, 71 + y, 1, 2);
        g2d.fillRect(100 + x, 72 + y, 1, 2);
        g2d.fillRect(99 + x, 73 + y, 1, 2);
        g2d.fillRect(98 + x, 74 + y, 1, 2);
        g2d.fillRect(97 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(95 + x, 76 + y, 1, 3);
        g2d.fillRect(96 + x, 76 + y, 1, 2);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(93 + x, 77 + y, 1, 4);
        g2d.fillRect(94 + x, 77 + y, 1, 3);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(87 + x, 78 + y, 1, 1);
        g2d.fillRect(91 + x, 78 + y, 1, 4);
        g2d.fillRect(92 + x, 78 + y, 1, 4);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(88 + x, 79 + y, 1, 2);
        g2d.fillRect(89 + x, 79 + y, 1, 2);
        g2d.fillRect(90 + x, 79 + y, 1, 2);
        g2d.fillRect(119 + x, 79 + y, 1, 3);
        g2d.fillRect(121 + x, 79 + y, 1, 2);
        g2d.fillRect(109 + x, 80 + y, 1, 14);
        g2d.fillRect(122 + x, 80 + y, 1, 2);
        g2d.fillRect(85 + x, 81 + y, 3, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 6);
        g2d.fillRect(120 + x, 81 + y, 1, 3);
        g2d.fillRect(123 + x, 81 + y, 1, 2);
        g2d.fillRect(83 + x, 82 + y, 1, 2);
        g2d.fillRect(84 + x, 82 + y, 1, 1);
        g2d.fillRect(89 + x, 82 + y, 2, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 3);
        g2d.fillRect(124 + x, 82 + y, 1, 3);
        g2d.fillRect(122 + x, 83 + y, 1, 4);
        g2d.fillRect(125 + x, 83 + y, 1, 3);
        g2d.fillRect(106 + x, 84 + y, 1, 9);
        g2d.fillRect(126 + x, 84 + y, 1, 3);
        g2d.fillRect(123 + x, 85 + y, 1, 4);
        g2d.fillRect(127 + x, 85 + y, 1, 2);
        g2d.fillRect(124 + x, 86 + y, 1, 4);
        g2d.fillRect(105 + x, 87 + y, 1, 6);
        g2d.fillRect(108 + x, 87 + y, 1, 7);
        g2d.fillRect(125 + x, 87 + y, 1, 3);
        g2d.fillRect(128 + x, 87 + y, 1, 1);
        g2d.fillRect(127 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 3);
        g2d.fillRect(126 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(125 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 2, 1);
        g2d.fillRect(104 + x, 94 + y, 2, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 61 + y, 1, 4);
        g2d.fillRect(105 + x, 61 + y, 1, 11);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 9, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 6);
        g2d.fillRect(106 + x, 65 + y, 1, 6);
        g2d.fillRect(107 + x, 65 + y, 1, 6);
        g2d.fillRect(108 + x, 65 + y, 4, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 4);
        g2d.fillRect(109 + x, 67 + y, 5, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(104 + x, 69 + y, 1, 3);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 4, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 2);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 2);
        g2d.fillRect(119 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 73 + y, 1, 2);
        g2d.fillRect(120 + x, 73 + y, 2, 1);
        g2d.fillRect(100 + x, 74 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(122 + x, 74 + y, 2, 1);
        g2d.fillRect(99 + x, 75 + y, 1, 2);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(124 + x, 75 + y, 2, 1);
        g2d.fillRect(98 + x, 76 + y, 1, 3);
        g2d.fillRect(109 + x, 76 + y, 1, 4);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(126 + x, 76 + y, 1, 1);
        g2d.fillRect(97 + x, 77 + y, 1, 3);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 2, 1);
        g2d.fillRect(127 + x, 77 + y, 2, 1);
        g2d.fillRect(96 + x, 78 + y, 1, 3);
        g2d.fillRect(117 + x, 78 + y, 1, 2);
        g2d.fillRect(121 + x, 78 + y, 2, 1);
        g2d.fillRect(129 + x, 78 + y, 2, 1);
        g2d.fillRect(95 + x, 79 + y, 1, 4);
        g2d.fillRect(107 + x, 79 + y, 1, 2);
        g2d.fillRect(110 + x, 79 + y, 1, 15);
        g2d.fillRect(122 + x, 79 + y, 2, 1);
        g2d.fillRect(94 + x, 80 + y, 1, 4);
        g2d.fillRect(118 + x, 80 + y, 1, 3);
        g2d.fillRect(123 + x, 80 + y, 2, 1);
        g2d.fillRect(132 + x, 80 + y, 1, 2);
        g2d.fillRect(93 + x, 81 + y, 1, 2);
        g2d.fillRect(106 + x, 81 + y, 1, 3);
        g2d.fillRect(124 + x, 81 + y, 2, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 3);
        g2d.fillRect(125 + x, 82 + y, 3, 1);
        g2d.fillRect(91 + x, 83 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 4);
        g2d.fillRect(126 + x, 83 + y, 3, 1);
        g2d.fillRect(93 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 3);
        g2d.fillRect(127 + x, 84 + y, 2, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 4);
        g2d.fillRect(111 + x, 85 + y, 1, 9);
        g2d.fillRect(121 + x, 85 + y, 1, 4);
        g2d.fillRect(128 + x, 85 + y, 1, 1);
        g2d.fillRect(130 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 5);
        g2d.fillRect(129 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 4);
        g2d.fillRect(102 + x, 88 + y, 1, 4);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 89 + y, 1, 5);
        g2d.fillRect(123 + x, 89 + y, 1, 2);
        g2d.fillRect(124 + x, 91 + y, 1, 1);
        g2d.fillRect(123 + x, 92 + y, 1, 1);
        g2d.fillRect(110 + x, 95 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 56 + y, 1, 3);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 62 + y, 1, 3);
        g2d.fillRect(108 + x, 62 + y, 1, 3);
        g2d.fillRect(109 + x, 62 + y, 1, 3);
        g2d.fillRect(110 + x, 62 + y, 1, 3);
        g2d.fillRect(111 + x, 62 + y, 1, 3);
        g2d.fillRect(112 + x, 62 + y, 1, 5);
        g2d.fillRect(113 + x, 62 + y, 1, 5);
        g2d.fillRect(114 + x, 62 + y, 1, 18);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 66 + y, 4, 1);
        g2d.fillRect(109 + x, 68 + y, 5, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 14);
        g2d.fillRect(110 + x, 70 + y, 1, 9);
        g2d.fillRect(111 + x, 70 + y, 1, 15);
        g2d.fillRect(112 + x, 70 + y, 1, 19);
        g2d.fillRect(113 + x, 70 + y, 1, 8);
        g2d.fillRect(116 + x, 70 + y, 1, 4);
        g2d.fillRect(106 + x, 71 + y, 1, 10);
        g2d.fillRect(107 + x, 71 + y, 1, 8);
        g2d.fillRect(108 + x, 71 + y, 1, 6);
        g2d.fillRect(109 + x, 71 + y, 1, 5);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(104 + x, 72 + y, 1, 5);
        g2d.fillRect(105 + x, 72 + y, 1, 11);
        g2d.fillRect(118 + x, 72 + y, 1, 3);
        g2d.fillRect(103 + x, 73 + y, 1, 5);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(102 + x, 74 + y, 1, 5);
        g2d.fillRect(120 + x, 74 + y, 1, 3);
        g2d.fillRect(121 + x, 74 + y, 1, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 5);
        g2d.fillRect(122 + x, 75 + y, 2, 1);
        g2d.fillRect(100 + x, 76 + y, 1, 5);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(124 + x, 76 + y, 2, 1);
        g2d.fillRect(99 + x, 77 + y, 1, 5);
        g2d.fillRect(122 + x, 77 + y, 2, 1);
        g2d.fillRect(125 + x, 77 + y, 2, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 7);
        g2d.fillRect(116 + x, 78 + y, 1, 6);
        g2d.fillRect(123 + x, 78 + y, 2, 1);
        g2d.fillRect(127 + x, 78 + y, 2, 1);
        g2d.fillRect(98 + x, 79 + y, 1, 4);
        g2d.fillRect(124 + x, 79 + y, 3, 1);
        g2d.fillRect(129 + x, 79 + y, 2, 1);
        g2d.fillRect(97 + x, 80 + y, 1, 4);
        g2d.fillRect(103 + x, 80 + y, 1, 6);
        g2d.fillRect(117 + x, 80 + y, 1, 6);
        g2d.fillRect(125 + x, 80 + y, 4, 1);
        g2d.fillRect(96 + x, 81 + y, 1, 4);
        g2d.fillRect(113 + x, 81 + y, 1, 13);
        g2d.fillRect(126 + x, 81 + y, 3, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 6);
        g2d.fillRect(128 + x, 82 + y, 2, 1);
        g2d.fillRect(95 + x, 83 + y, 1, 2);
        g2d.fillRect(101 + x, 83 + y, 1, 6);
        g2d.fillRect(118 + x, 83 + y, 1, 5);
        g2d.fillRect(129 + x, 83 + y, 1, 1);
        g2d.fillRect(131 + x, 83 + y, 1, 1);
        g2d.fillRect(130 + x, 84 + y, 1, 1);
        g2d.fillRect(94 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 5);
        g2d.fillRect(119 + x, 85 + y, 1, 5);
        g2d.fillRect(95 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 8);
        g2d.fillRect(96 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(120 + x, 87 + y, 1, 5);
        g2d.fillRect(97 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 3);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 3);
        g2d.fillRect(122 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 2, 1);
        g2d.fillRect(113 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(121 + x, 75 + y, 1, 1);
        g2d.fillRect(122 + x, 76 + y, 2, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(124 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 3);
        g2d.fillRect(125 + x, 78 + y, 2, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 3);
        g2d.fillRect(127 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 80 + y, 1, 6);
        g2d.fillRect(129 + x, 80 + y, 1, 2);
        g2d.fillRect(130 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 4);
        g2d.fillRect(99 + x, 82 + y, 1, 5);
        g2d.fillRect(115 + x, 82 + y, 1, 8);
        g2d.fillRect(131 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 5);
        g2d.fillRect(97 + x, 84 + y, 1, 3);
        g2d.fillRect(116 + x, 84 + y, 1, 9);
        g2d.fillRect(96 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 7);
        g2d.fillRect(118 + x, 88 + y, 1, 5);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 2, 1);
        g2d.fillRect(117 + x, 94 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(131 + x, 79 + y, 1, 1);
        g2d.fillRect(86 + x, 80 + y, 2, 1);
        g2d.fillRect(88 + x, 81 + y, 3, 1);
        g2d.fillRect(91 + x, 82 + y, 1, 1);
        g2d.fillRect(128 + x, 86 + y, 1, 1);
        g2d.fillRect(127 + x, 87 + y, 1, 1);
        g2d.fillRect(126 + x, 89 + y, 1, 1);
        g2d.fillRect(125 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 2, 1);
        g2d.fillRect(104 + x, 93 + y, 2, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(134 + x, 79 + y, 1, 2);
        g2d.fillRect(135 + x, 80 + y, 1, 1);
        g2d.fillRect(136 + x, 81 + y, 1, 2);
        g2d.fillRect(85 + x, 83 + y, 1, 1);
        g2d.fillRect(135 + x, 83 + y, 1, 1);
        g2d.fillRect(137 + x, 83 + y, 1, 3);
        g2d.fillRect(81 + x, 84 + y, 1, 1);
        g2d.fillRect(86 + x, 84 + y, 1, 2);
        g2d.fillRect(90 + x, 84 + y, 1, 1);
        g2d.fillRect(133 + x, 84 + y, 2, 1);
        g2d.fillRect(83 + x, 85 + y, 1, 1);
        g2d.fillRect(89 + x, 85 + y, 1, 1);
        g2d.fillRect(134 + x, 85 + y, 1, 2);
        g2d.fillRect(82 + x, 86 + y, 1, 1);
        g2d.fillRect(85 + x, 86 + y, 1, 2);
        g2d.fillRect(87 + x, 86 + y, 2, 1);
        g2d.fillRect(90 + x, 86 + y, 1, 5);
        g2d.fillRect(135 + x, 86 + y, 2, 1);
        g2d.fillRect(83 + x, 87 + y, 2, 1);
        g2d.fillRect(131 + x, 87 + y, 1, 4);
        g2d.fillRect(132 + x, 87 + y, 2, 1);
        g2d.fillRect(86 + x, 88 + y, 1, 1);
        g2d.fillRect(89 + x, 88 + y, 1, 1);
        g2d.fillRect(94 + x, 88 + y, 1, 1);
        g2d.fillRect(134 + x, 88 + y, 1, 1);
        g2d.fillRect(87 + x, 89 + y, 2, 1);
        g2d.fillRect(91 + x, 89 + y, 3, 1);
        g2d.fillRect(133 + x, 89 + y, 1, 1);
        g2d.fillRect(93 + x, 90 + y, 1, 2);
        g2d.fillRect(97 + x, 90 + y, 1, 1);
        g2d.fillRect(128 + x, 90 + y, 1, 3);
        g2d.fillRect(129 + x, 90 + y, 1, 1);
        g2d.fillRect(132 + x, 90 + y, 1, 1);
        g2d.fillRect(91 + x, 91 + y, 2, 1);
        g2d.fillRect(94 + x, 91 + y, 3, 1);
        g2d.fillRect(130 + x, 91 + y, 1, 2);
        g2d.fillRect(95 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 92 + y, 1, 1);
        g2d.fillRect(129 + x, 92 + y, 1, 2);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 93 + y, 3, 1);
        g2d.fillRect(125 + x, 93 + y, 1, 1);
        g2d.fillRect(127 + x, 93 + y, 1, 2);
        g2d.fillRect(97 + x, 94 + y, 1, 1);
        g2d.fillRect(100 + x, 94 + y, 1, 2);
        g2d.fillRect(126 + x, 94 + y, 1, 1);
        g2d.fillRect(128 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 2, 1);
        g2d.fillRect(101 + x, 95 + y, 2, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(123 + x, 95 + y, 3, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(106 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(120 + x, 96 + y, 3, 1);
        g2d.fillRect(103 + x, 97 + y, 3, 1);
        g2d.fillRect(107 + x, 97 + y, 1, 1);
        g2d.fillRect(112 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 3, 1);
        g2d.fillRect(121 + x, 97 + y, 1, 1);
        g2d.fillRect(108 + x, 98 + y, 4, 1);
        g2d.fillRect(113 + x, 98 + y, 2, 1);
        g2d.fillRect(118 + x, 98 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(131 + x, 80 + y, 1, 2);
        g2d.fillRect(130 + x, 81 + y, 1, 3);
        g2d.fillRect(92 + x, 82 + y, 1, 1);
        g2d.fillRect(93 + x, 83 + y, 1, 1);
        g2d.fillRect(94 + x, 84 + y, 1, 1);
        g2d.fillRect(129 + x, 84 + y, 1, 2);
        g2d.fillRect(95 + x, 85 + y, 1, 1);
        g2d.fillRect(96 + x, 86 + y, 1, 1);
        g2d.fillRect(97 + x, 87 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 1);
        g2d.fillRect(124 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(122 + x, 91 + y, 2, 1);
        g2d.fillRect(119 + x, 92 + y, 3, 1);
        g2d.fillRect(115 + x, 93 + y, 4, 1);
        g2d.fillRect(110 + x, 94 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(133 + x, 82 + y, 1, 2);
        g2d.fillRect(87 + x, 83 + y, 2, 1);
        g2d.fillRect(134 + x, 83 + y, 1, 1);
        g2d.fillRect(136 + x, 83 + y, 1, 1);
        g2d.fillRect(82 + x, 84 + y, 1, 1);
        g2d.fillRect(84 + x, 84 + y, 2, 1);
        g2d.fillRect(89 + x, 84 + y, 1, 1);
        g2d.fillRect(132 + x, 84 + y, 1, 3);
        g2d.fillRect(135 + x, 84 + y, 1, 1);
        g2d.fillRect(85 + x, 85 + y, 1, 1);
        g2d.fillRect(91 + x, 85 + y, 2, 1);
        g2d.fillRect(89 + x, 86 + y, 1, 2);
        g2d.fillRect(92 + x, 86 + y, 2, 1);
        g2d.fillRect(131 + x, 86 + y, 1, 1);
        g2d.fillRect(87 + x, 87 + y, 2, 1);
        g2d.fillRect(94 + x, 87 + y, 1, 1);
        g2d.fillRect(130 + x, 87 + y, 1, 1);
        g2d.fillRect(91 + x, 88 + y, 3, 1);
        g2d.fillRect(95 + x, 88 + y, 1, 1);
        g2d.fillRect(129 + x, 88 + y, 1, 2);
        g2d.fillRect(132 + x, 88 + y, 1, 1);
        g2d.fillRect(96 + x, 89 + y, 1, 2);
        g2d.fillRect(128 + x, 89 + y, 1, 1);
        g2d.fillRect(92 + x, 90 + y, 1, 1);
        g2d.fillRect(94 + x, 90 + y, 2, 1);
        g2d.fillRect(130 + x, 90 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 2, 1);
        g2d.fillRect(126 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(122 + x, 94 + y, 1, 2);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(121 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 97 + y, 2, 1);
        g2d.fillRect(113 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
    }
}
