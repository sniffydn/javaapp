/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.h;

import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class CR05 extends SuperTL
{
    int direction = 0;
    public CR05()
    {
        super();
    }

    public CR05(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }
    
    
    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        return new obsolete.CR05Helper(c);
    }
    

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintC2(offsetX, 0,g2d);
        else
            paintBackC2(offsetX, 0,g2d);
    }
    
    public void paintC2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 9 + y, 1, 2);
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 3);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(122 + x, 17 + y, 1, 2);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 17 + y, 1, 1);
        g2d.fillRect(107 + x, 17 + y, 1, 2);
        g2d.fillRect(112 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(103 + x, 18 + y, 2, 1);
        g2d.fillRect(115 + x, 18 + y, 2, 1);
        g2d.fillRect(118 + x, 18 + y, 1, 1);
        g2d.fillRect(100 + x, 19 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 4, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 20 + y, 1, 1);
        g2d.fillRect(120 + x, 20 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 8 + y, 2, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 2);
        g2d.fillRect(111 + x, 9 + y, 1, 2);
        g2d.fillRect(109 + x, 11 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 13 + y, 2, 1);
        g2d.fillRect(115 + x, 13 + y, 2, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 14 + y, 1, 4);
        g2d.fillRect(111 + x, 14 + y, 1, 4);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 14 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 16 + y, 2, 1);
        g2d.fillRect(115 + x, 16 + y, 2, 1);
        g2d.fillRect(121 + x, 16 + y, 2, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(123 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(121 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 6 + y, 1, 1);
        g2d.fillRect(111 + x, 6 + y, 1, 1);
        g2d.fillRect(109 + x, 7 + y, 2, 1);
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(108 + x, 8 + y, 1, 1);
        g2d.fillRect(111 + x, 8 + y, 1, 1);
        g2d.fillRect(113 + x, 8 + y, 1, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 2);
        g2d.fillRect(112 + x, 9 + y, 1, 2);
        g2d.fillRect(108 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 12 + y, 2, 1);
        g2d.fillRect(106 + x, 12 + y, 1, 1);
        g2d.fillRect(109 + x, 12 + y, 2, 1);
        g2d.fillRect(113 + x, 12 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 2, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(105 + x, 13 + y, 1, 1);
        g2d.fillRect(108 + x, 13 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(117 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(107 + x, 14 + y, 1, 3);
        g2d.fillRect(112 + x, 14 + y, 1, 3);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(118 + x, 14 + y, 1, 2);
        g2d.fillRect(97 + x, 15 + y, 2, 1);
        g2d.fillRect(121 + x, 15 + y, 2, 1);
        g2d.fillRect(94 + x, 16 + y, 1, 1);
        g2d.fillRect(96 + x, 16 + y, 1, 1);
        g2d.fillRect(99 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 1);
        g2d.fillRect(114 + x, 16 + y, 1, 1);
        g2d.fillRect(117 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 16 + y, 1, 1);
        g2d.fillRect(123 + x, 16 + y, 1, 1);
        g2d.fillRect(125 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(100 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(103 + x, 17 + y, 2, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 2);
        g2d.fillRect(113 + x, 17 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 2, 1);
        g2d.fillRect(118 + x, 17 + y, 2, 1);
        g2d.fillRect(124 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 18 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(108 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(117 + x, 18 + y, 1, 2);
        g2d.fillRect(119 + x, 18 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(118 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 19 + y, 1, 1);
        g2d.fillRect(123 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 20 + y, 2, 1);
        g2d.fillRect(100 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 20 + y, 1, 1);
        g2d.fillRect(121 + x, 20 + y, 1, 2);
        g2d.fillRect(122 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 21 + y, 1, 1);
        g2d.fillRect(123 + x, 21 + y, 1, 1);
        g2d.fillRect(95 + x, 22 + y, 1, 1);
        g2d.fillRect(124 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
    }





    public void paintC1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 9 + y, 1, 2);
        g2d.fillRect(110 + x, 10 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 2);
        g2d.fillRect(116 + x, 14 + y, 1, 2);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 15 + y, 1, 3);
        g2d.fillRect(115 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 16 + y, 1, 2);
        g2d.fillRect(97 + x, 17 + y, 1, 2);
        g2d.fillRect(122 + x, 17 + y, 1, 2);
        g2d.fillRect(98 + x, 18 + y, 1, 1);
        g2d.fillRect(121 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(109 + x, 8 + y, 2, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 2);
        g2d.fillRect(111 + x, 9 + y, 1, 2);
        g2d.fillRect(109 + x, 11 + y, 2, 1);
        g2d.fillRect(103 + x, 13 + y, 2, 1);
        g2d.fillRect(109 + x, 13 + y, 2, 1);
        g2d.fillRect(115 + x, 13 + y, 2, 1);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 14 + y, 1, 4);
        g2d.fillRect(111 + x, 14 + y, 1, 4);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 14 + y, 1, 2);
        g2d.fillRect(97 + x, 16 + y, 2, 1);
        g2d.fillRect(103 + x, 16 + y, 2, 1);
        g2d.fillRect(115 + x, 16 + y, 2, 1);
        g2d.fillRect(121 + x, 16 + y, 2, 1);
        g2d.fillRect(96 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 2);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(123 + x, 17 + y, 1, 2);
        g2d.fillRect(109 + x, 18 + y, 2, 1);
        g2d.fillRect(97 + x, 19 + y, 2, 1);
        g2d.fillRect(121 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 9 + y, 1, 1);
        g2d.fillRect(104 + x, 14 + y, 1, 1);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
    }





    public void paintBackC2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 9 + y, 1, 2);
        g2d.fillRect(105 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 3);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(118 + x, 17 + y, 1, 2);
        g2d.fillRect(93 + x, 17 + y, 1, 2);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 17 + y, 1, 1);
        g2d.fillRect(108 + x, 17 + y, 1, 2);
        g2d.fillRect(103 + x, 17 + y, 1, 2);
        g2d.fillRect(101 + x, 17 + y, 1, 1);
        g2d.fillRect(98 + x, 17 + y, 1, 1);
        g2d.fillRect(114 + x, 18 + y, 1, 1);
        g2d.fillRect(111 + x, 18 + y, 2, 1);
        g2d.fillRect(99 + x, 18 + y, 2, 1);
        g2d.fillRect(97 + x, 18 + y, 1, 1);
        g2d.fillRect(115 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 4, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 20 + y, 1, 1);
        g2d.fillRect(95 + x, 20 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 8 + y, 2, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 2);
        g2d.fillRect(104 + x, 9 + y, 1, 2);
        g2d.fillRect(105 + x, 11 + y, 2, 1);
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(105 + x, 13 + y, 2, 1);
        g2d.fillRect(99 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(107 + x, 14 + y, 1, 4);
        g2d.fillRect(104 + x, 14 + y, 1, 4);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(98 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(111 + x, 16 + y, 2, 1);
        g2d.fillRect(99 + x, 16 + y, 2, 1);
        g2d.fillRect(93 + x, 16 + y, 2, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(92 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 2, 1);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(93 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 6 + y, 1, 1);
        g2d.fillRect(104 + x, 6 + y, 1, 1);
        g2d.fillRect(105 + x, 7 + y, 2, 1);
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(107 + x, 8 + y, 1, 1);
        g2d.fillRect(104 + x, 8 + y, 1, 1);
        g2d.fillRect(102 + x, 8 + y, 1, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 2);
        g2d.fillRect(103 + x, 9 + y, 1, 2);
        g2d.fillRect(107 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 12 + y, 2, 1);
        g2d.fillRect(109 + x, 12 + y, 1, 1);
        g2d.fillRect(105 + x, 12 + y, 2, 1);
        g2d.fillRect(102 + x, 12 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 2, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(110 + x, 13 + y, 1, 1);
        g2d.fillRect(107 + x, 13 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(98 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 2);
        g2d.fillRect(109 + x, 14 + y, 1, 2);
        g2d.fillRect(108 + x, 14 + y, 1, 3);
        g2d.fillRect(103 + x, 14 + y, 1, 3);
        g2d.fillRect(102 + x, 14 + y, 1, 2);
        g2d.fillRect(97 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 15 + y, 2, 1);
        g2d.fillRect(93 + x, 15 + y, 2, 1);
        g2d.fillRect(121 + x, 16 + y, 1, 1);
        g2d.fillRect(119 + x, 16 + y, 1, 1);
        g2d.fillRect(116 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 1);
        g2d.fillRect(101 + x, 16 + y, 1, 1);
        g2d.fillRect(98 + x, 16 + y, 1, 1);
        g2d.fillRect(95 + x, 16 + y, 1, 1);
        g2d.fillRect(92 + x, 16 + y, 1, 1);
        g2d.fillRect(90 + x, 16 + y, 1, 1);
        g2d.fillRect(120 + x, 17 + y, 1, 2);
        g2d.fillRect(115 + x, 17 + y, 1, 2);
        g2d.fillRect(114 + x, 17 + y, 1, 1);
        g2d.fillRect(111 + x, 17 + y, 2, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 2);
        g2d.fillRect(102 + x, 17 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 2, 1);
        g2d.fillRect(96 + x, 17 + y, 2, 1);
        g2d.fillRect(91 + x, 17 + y, 1, 2);
        g2d.fillRect(113 + x, 18 + y, 1, 2);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(107 + x, 18 + y, 1, 1);
        g2d.fillRect(104 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 18 + y, 1, 1);
        g2d.fillRect(98 + x, 18 + y, 1, 2);
        g2d.fillRect(96 + x, 18 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(97 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 19 + y, 1, 1);
        g2d.fillRect(92 + x, 19 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 2, 1);
        g2d.fillRect(115 + x, 20 + y, 1, 1);
        g2d.fillRect(96 + x, 20 + y, 1, 1);
        g2d.fillRect(94 + x, 20 + y, 1, 2);
        g2d.fillRect(93 + x, 20 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 21 + y, 1, 1);
        g2d.fillRect(92 + x, 21 + y, 1, 1);
        g2d.fillRect(120 + x, 22 + y, 1, 1);
        g2d.fillRect(91 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 9 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 1);
    }





    public void paintBackC1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 9 + y, 1, 2);
        g2d.fillRect(105 + x, 10 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 2);
        g2d.fillRect(99 + x, 14 + y, 1, 2);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 15 + y, 1, 3);
        g2d.fillRect(100 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 16 + y, 1, 2);
        g2d.fillRect(118 + x, 17 + y, 1, 2);
        g2d.fillRect(93 + x, 17 + y, 1, 2);
        g2d.fillRect(117 + x, 18 + y, 1, 1);
        g2d.fillRect(94 + x, 18 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 8 + y, 2, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 2);
        g2d.fillRect(104 + x, 9 + y, 1, 2);
        g2d.fillRect(105 + x, 11 + y, 2, 1);
        g2d.fillRect(111 + x, 13 + y, 2, 1);
        g2d.fillRect(105 + x, 13 + y, 2, 1);
        g2d.fillRect(99 + x, 13 + y, 2, 1);
        g2d.fillRect(113 + x, 14 + y, 1, 2);
        g2d.fillRect(110 + x, 14 + y, 1, 2);
        g2d.fillRect(107 + x, 14 + y, 1, 4);
        g2d.fillRect(104 + x, 14 + y, 1, 4);
        g2d.fillRect(101 + x, 14 + y, 1, 2);
        g2d.fillRect(98 + x, 14 + y, 1, 2);
        g2d.fillRect(117 + x, 16 + y, 2, 1);
        g2d.fillRect(111 + x, 16 + y, 2, 1);
        g2d.fillRect(99 + x, 16 + y, 2, 1);
        g2d.fillRect(93 + x, 16 + y, 2, 1);
        g2d.fillRect(119 + x, 17 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 2);
        g2d.fillRect(95 + x, 17 + y, 1, 2);
        g2d.fillRect(92 + x, 17 + y, 1, 2);
        g2d.fillRect(105 + x, 18 + y, 2, 1);
        g2d.fillRect(117 + x, 19 + y, 2, 1);
        g2d.fillRect(93 + x, 19 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 9 + y, 1, 1);
        g2d.fillRect(111 + x, 14 + y, 1, 1);
        g2d.fillRect(106 + x, 14 + y, 1, 2);
        g2d.fillRect(105 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(117 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 1);
    }

}
