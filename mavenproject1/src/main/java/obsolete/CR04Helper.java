/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.h.*;
import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class CR04Helper extends SuperTL
{
    int direction = 0;
    public CR04Helper()
    {
        super();
    }

    public CR04Helper(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }
    

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintBack(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintC1(offsetX, 0,g2d);
        else
            paintBackC1(offsetX, 0,g2d);
    }
    
    public void paintC2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 4 + y, 1, 2);
        g2d.fillRect(108 + x, 5 + y, 1, 1);
        g2d.fillRect(114 + x, 5 + y, 2, 1);
        g2d.fillRect(99 + x, 6 + y, 1, 1);
        g2d.fillRect(115 + x, 6 + y, 1, 1);
        g2d.fillRect(121 + x, 6 + y, 1, 1);
        g2d.fillRect(114 + x, 7 + y, 1, 1);
        g2d.fillRect(100 + x, 8 + y, 1, 1);
        g2d.fillRect(111 + x, 8 + y, 1, 1);
        g2d.fillRect(113 + x, 8 + y, 1, 1);
        g2d.fillRect(112 + x, 9 + y, 1, 1);
        g2d.fillRect(106 + x, 10 + y, 1, 1);
        g2d.fillRect(104 + x, 11 + y, 2, 1);
        g2d.fillRect(108 + x, 11 + y, 1, 2);
        g2d.fillRect(120 + x, 11 + y, 1, 1);
        g2d.fillRect(99 + x, 12 + y, 1, 2);
        g2d.fillRect(103 + x, 12 + y, 1, 2);
        g2d.fillRect(102 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 1, 1);
        g2d.fillRect(100 + x, 14 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(121 + x, 15 + y, 1, 1);
        g2d.fillRect(123 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 16 + y, 1, 1);
        g2d.fillRect(113 + x, 16 + y, 1, 1);
        g2d.fillRect(115 + x, 16 + y, 1, 2);
        g2d.fillRect(111 + x, 17 + y, 1, 1);
        g2d.fillRect(121 + x, 17 + y, 1, 1);
        g2d.fillRect(105 + x, 18 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(104 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 19 + y, 1, 1);
        g2d.fillRect(106 + x, 20 + y, 1, 1);
        g2d.fillRect(117 + x, 20 + y, 1, 1);
        g2d.fillRect(126 + x, 20 + y, 1, 1);
        g2d.fillRect(93 + x, 21 + y, 1, 1);
        g2d.fillRect(99 + x, 21 + y, 1, 1);
        g2d.fillRect(121 + x, 21 + y, 1, 1);
        g2d.fillRect(98 + x, 23 + y, 1, 1);
        g2d.fillRect(122 + x, 23 + y, 1, 1);
        g2d.fillRect(92 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(113 + x, 4 + y, 1, 2);
        g2d.fillRect(112 + x, 5 + y, 1, 1);
        g2d.fillRect(106 + x, 7 + y, 1, 1);
        g2d.fillRect(107 + x, 8 + y, 1, 1);
        g2d.fillRect(109 + x, 8 + y, 1, 1);
        g2d.fillRect(120 + x, 8 + y, 1, 1);
        g2d.fillRect(108 + x, 9 + y, 1, 1);
        g2d.fillRect(107 + x, 10 + y, 1, 1);
        g2d.fillRect(118 + x, 10 + y, 2, 1);
        g2d.fillRect(116 + x, 11 + y, 1, 1);
        g2d.fillRect(117 + x, 12 + y, 1, 3);
        g2d.fillRect(121 + x, 12 + y, 1, 2);
        g2d.fillRect(109 + x, 13 + y, 1, 1);
        g2d.fillRect(101 + x, 14 + y, 1, 1);
        g2d.fillRect(103 + x, 14 + y, 1, 1);
        g2d.fillRect(125 + x, 14 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 19 + y, 1, 1);
        g2d.fillRect(95 + x, 23 + y, 1, 1);
        g2d.fillRect(125 + x, 23 + y, 1, 1);
        g2d.fillRect(96 + x, 25 + y, 1, 1);
        g2d.fillRect(126 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 5 + y, 1, 2);
        g2d.fillRect(106 + x, 5 + y, 1, 1);
        g2d.fillRect(109 + x, 6 + y, 1, 1);
        g2d.fillRect(111 + x, 6 + y, 1, 1);
        g2d.fillRect(110 + x, 7 + y, 1, 1);
        g2d.fillRect(101 + x, 10 + y, 2, 1);
        g2d.fillRect(113 + x, 10 + y, 2, 1);
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(112 + x, 11 + y, 1, 2);
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(111 + x, 13 + y, 1, 1);
        g2d.fillRect(118 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 14 + y, 2, 1);
        g2d.fillRect(97 + x, 15 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(109 + x, 15 + y, 1, 1);
        g2d.fillRect(105 + x, 16 + y, 1, 2);
        g2d.fillRect(99 + x, 17 + y, 1, 1);
        g2d.fillRect(109 + x, 17 + y, 1, 1);
        g2d.fillRect(115 + x, 18 + y, 1, 1);
        g2d.fillRect(101 + x, 19 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(119 + x, 19 + y, 1, 1);
        g2d.fillRect(121 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 20 + y, 1, 1);
        g2d.fillRect(114 + x, 20 + y, 1, 1);
        g2d.fillRect(124 + x, 25 + y, 1, 1);
        g2d.fillRect(94 + x, 26 + y, 1, 1);
    }





    public void paintC1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 3 + y, 1, 1);
        g2d.fillRect(114 + x, 3 + y, 1, 1);
        g2d.fillRect(100 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 22 + y, 1, 1);
        g2d.fillRect(123 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 2 + y, 1, 1);
        g2d.fillRect(114 + x, 2 + y, 1, 1);
        g2d.fillRect(106 + x, 3 + y, 1, 1);
        g2d.fillRect(115 + x, 3 + y, 1, 1);
        g2d.fillRect(100 + x, 12 + y, 1, 1);
        g2d.fillRect(119 + x, 12 + y, 1, 1);
        g2d.fillRect(101 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 21 + y, 1, 1);
        g2d.fillRect(123 + x, 21 + y, 1, 1);
        g2d.fillRect(97 + x, 22 + y, 1, 1);
        g2d.fillRect(124 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 2 + y, 1, 1);
        g2d.fillRect(115 + x, 2 + y, 1, 1);
        g2d.fillRect(101 + x, 12 + y, 1, 1);
        g2d.fillRect(120 + x, 12 + y, 1, 1);
        g2d.fillRect(97 + x, 21 + y, 1, 1);
        g2d.fillRect(124 + x, 21 + y, 1, 1);
    }





    public void paintBackC2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 4 + y, 1, 2);
        g2d.fillRect(107 + x, 5 + y, 1, 1);
        g2d.fillRect(100 + x, 5 + y, 2, 1);
        g2d.fillRect(116 + x, 6 + y, 1, 1);
        g2d.fillRect(100 + x, 6 + y, 1, 1);
        g2d.fillRect(94 + x, 6 + y, 1, 1);
        g2d.fillRect(101 + x, 7 + y, 1, 1);
        g2d.fillRect(115 + x, 8 + y, 1, 1);
        g2d.fillRect(104 + x, 8 + y, 1, 1);
        g2d.fillRect(102 + x, 8 + y, 1, 1);
        g2d.fillRect(103 + x, 9 + y, 1, 1);
        g2d.fillRect(109 + x, 10 + y, 1, 1);
        g2d.fillRect(110 + x, 11 + y, 2, 1);
        g2d.fillRect(107 + x, 11 + y, 1, 2);
        g2d.fillRect(95 + x, 11 + y, 1, 1);
        g2d.fillRect(116 + x, 12 + y, 1, 2);
        g2d.fillRect(112 + x, 12 + y, 1, 2);
        g2d.fillRect(113 + x, 13 + y, 1, 1);
        g2d.fillRect(120 + x, 14 + y, 1, 1);
        g2d.fillRect(115 + x, 14 + y, 1, 1);
        g2d.fillRect(104 + x, 15 + y, 1, 1);
        g2d.fillRect(94 + x, 15 + y, 1, 1);
        g2d.fillRect(92 + x, 15 + y, 1, 1);
        g2d.fillRect(108 + x, 16 + y, 1, 1);
        g2d.fillRect(102 + x, 16 + y, 1, 1);
        g2d.fillRect(100 + x, 16 + y, 1, 2);
        g2d.fillRect(104 + x, 17 + y, 1, 1);
        g2d.fillRect(94 + x, 17 + y, 1, 1);
        g2d.fillRect(110 + x, 18 + y, 1, 1);
        g2d.fillRect(116 + x, 19 + y, 1, 1);
        g2d.fillRect(111 + x, 19 + y, 1, 1);
        g2d.fillRect(103 + x, 19 + y, 1, 1);
        g2d.fillRect(109 + x, 20 + y, 1, 1);
        g2d.fillRect(98 + x, 20 + y, 1, 1);
        g2d.fillRect(89 + x, 20 + y, 1, 1);
        g2d.fillRect(122 + x, 21 + y, 1, 1);
        g2d.fillRect(116 + x, 21 + y, 1, 1);
        g2d.fillRect(94 + x, 21 + y, 1, 1);
        g2d.fillRect(117 + x, 23 + y, 1, 1);
        g2d.fillRect(93 + x, 23 + y, 1, 1);
        g2d.fillRect(123 + x, 26 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 4 + y, 1, 2);
        g2d.fillRect(103 + x, 5 + y, 1, 1);
        g2d.fillRect(109 + x, 7 + y, 1, 1);
        g2d.fillRect(108 + x, 8 + y, 1, 1);
        g2d.fillRect(106 + x, 8 + y, 1, 1);
        g2d.fillRect(95 + x, 8 + y, 1, 1);
        g2d.fillRect(107 + x, 9 + y, 1, 1);
        g2d.fillRect(108 + x, 10 + y, 1, 1);
        g2d.fillRect(96 + x, 10 + y, 2, 1);
        g2d.fillRect(99 + x, 11 + y, 1, 1);
        g2d.fillRect(98 + x, 12 + y, 1, 3);
        g2d.fillRect(94 + x, 12 + y, 1, 2);
        g2d.fillRect(106 + x, 13 + y, 1, 1);
        g2d.fillRect(114 + x, 14 + y, 1, 1);
        g2d.fillRect(112 + x, 14 + y, 1, 1);
        g2d.fillRect(90 + x, 14 + y, 1, 1);
        g2d.fillRect(99 + x, 15 + y, 1, 1);
        g2d.fillRect(107 + x, 19 + y, 1, 1);
        g2d.fillRect(120 + x, 23 + y, 1, 1);
        g2d.fillRect(90 + x, 23 + y, 1, 1);
        g2d.fillRect(119 + x, 25 + y, 1, 1);
        g2d.fillRect(89 + x, 25 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 5 + y, 1, 2);
        g2d.fillRect(109 + x, 5 + y, 1, 1);
        g2d.fillRect(106 + x, 6 + y, 1, 1);
        g2d.fillRect(104 + x, 6 + y, 1, 1);
        g2d.fillRect(105 + x, 7 + y, 1, 1);
        g2d.fillRect(113 + x, 10 + y, 2, 1);
        g2d.fillRect(101 + x, 10 + y, 2, 1);
        g2d.fillRect(115 + x, 11 + y, 1, 1);
        g2d.fillRect(103 + x, 11 + y, 1, 2);
        g2d.fillRect(100 + x, 11 + y, 1, 1);
        g2d.fillRect(104 + x, 13 + y, 1, 1);
        g2d.fillRect(97 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 14 + y, 2, 1);
        g2d.fillRect(118 + x, 15 + y, 1, 1);
        g2d.fillRect(116 + x, 15 + y, 1, 1);
        g2d.fillRect(111 + x, 15 + y, 1, 1);
        g2d.fillRect(106 + x, 15 + y, 1, 1);
        g2d.fillRect(110 + x, 16 + y, 1, 2);
        g2d.fillRect(116 + x, 17 + y, 1, 1);
        g2d.fillRect(106 + x, 17 + y, 1, 1);
        g2d.fillRect(100 + x, 18 + y, 1, 1);
        g2d.fillRect(114 + x, 19 + y, 1, 1);
        g2d.fillRect(99 + x, 19 + y, 1, 1);
        g2d.fillRect(96 + x, 19 + y, 1, 1);
        g2d.fillRect(94 + x, 19 + y, 1, 1);
        g2d.fillRect(112 + x, 20 + y, 1, 1);
        g2d.fillRect(101 + x, 20 + y, 1, 1);
        g2d.fillRect(91 + x, 25 + y, 1, 1);
        g2d.fillRect(121 + x, 26 + y, 1, 1);
    }





    public void paintBackC1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 3 + y, 1, 1);
        g2d.fillRect(101 + x, 3 + y, 1, 1);
        g2d.fillRect(115 + x, 13 + y, 1, 1);
        g2d.fillRect(96 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 22 + y, 1, 1);
        g2d.fillRect(92 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 2 + y, 1, 1);
        g2d.fillRect(101 + x, 2 + y, 1, 1);
        g2d.fillRect(109 + x, 3 + y, 1, 1);
        g2d.fillRect(100 + x, 3 + y, 1, 1);
        g2d.fillRect(115 + x, 12 + y, 1, 1);
        g2d.fillRect(96 + x, 12 + y, 1, 1);
        g2d.fillRect(114 + x, 13 + y, 1, 1);
        g2d.fillRect(95 + x, 13 + y, 1, 1);
        g2d.fillRect(119 + x, 21 + y, 1, 1);
        g2d.fillRect(92 + x, 21 + y, 1, 1);
        g2d.fillRect(118 + x, 22 + y, 1, 1);
        g2d.fillRect(91 + x, 22 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 2 + y, 1, 1);
        g2d.fillRect(100 + x, 2 + y, 1, 1);
        g2d.fillRect(114 + x, 12 + y, 1, 1);
        g2d.fillRect(95 + x, 12 + y, 1, 1);
        g2d.fillRect(118 + x, 21 + y, 1, 1);
        g2d.fillRect(91 + x, 21 + y, 1, 1);
    }
}
