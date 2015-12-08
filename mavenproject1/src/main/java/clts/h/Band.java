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
public class Band extends SuperTL
{
    int direction = 0;
    public Band()
    {
        super();
    }

    public Band(ColorArray colorSwitch)
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
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintH(offsetX, 0,g2d);
        else
            paintBackH(offsetX, 0,g2d);
    }
    
    public void paintH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(103 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(105 + x, 32 + y, 1, 1);
        g2d.fillRect(106 + x, 35 + y, 1, 1);
        g2d.fillRect(106 + x, 37 + y, 1, 1);
        g2d.fillRect(108 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(118 + x, 29 + y, 1, 1);
        g2d.fillRect(103 + x, 30 + y, 1, 1);
        g2d.fillRect(105 + x, 30 + y, 1, 2);
        g2d.fillRect(107 + x, 30 + y, 1, 1);
        g2d.fillRect(117 + x, 30 + y, 1, 1);
        g2d.fillRect(102 + x, 31 + y, 1, 4);
        g2d.fillRect(108 + x, 31 + y, 2, 1);
        g2d.fillRect(104 + x, 32 + y, 1, 1);
        g2d.fillRect(109 + x, 32 + y, 7, 1);
        g2d.fillRect(117 + x, 32 + y, 2, 1);
        g2d.fillRect(105 + x, 33 + y, 1, 2);
        g2d.fillRect(116 + x, 33 + y, 1, 1);
        g2d.fillRect(101 + x, 34 + y, 1, 1);
        g2d.fillRect(106 + x, 34 + y, 1, 1);
        g2d.fillRect(115 + x, 35 + y, 1, 1);
        g2d.fillRect(106 + x, 36 + y, 2, 1);
        g2d.fillRect(113 + x, 36 + y, 2, 1);
        g2d.fillRect(108 + x, 37 + y, 1, 1);
        g2d.fillRect(107 + x, 38 + y, 1, 1);
        g2d.fillRect(109 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 38 + y, 1, 1);
        g2d.fillRect(108 + x, 39 + y, 1, 1);
        g2d.fillRect(110 + x, 39 + y, 1, 1);
        g2d.fillRect(109 + x, 40 + y, 1, 3);
        g2d.fillRect(111 + x, 40 + y, 1, 2);
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(110 + x, 41 + y, 1, 3);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(111 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(104 + x, 30 + y, 1, 1);
        g2d.fillRect(106 + x, 30 + y, 1, 4);
        g2d.fillRect(118 + x, 30 + y, 1, 2);
        g2d.fillRect(107 + x, 31 + y, 1, 2);
        g2d.fillRect(116 + x, 31 + y, 1, 2);
        g2d.fillRect(117 + x, 31 + y, 1, 1);
        g2d.fillRect(108 + x, 32 + y, 1, 1);
        g2d.fillRect(104 + x, 33 + y, 1, 2);
        g2d.fillRect(109 + x, 33 + y, 1, 1);
        g2d.fillRect(117 + x, 33 + y, 1, 2);
        g2d.fillRect(107 + x, 34 + y, 1, 1);
        g2d.fillRect(110 + x, 34 + y, 5, 1);
        g2d.fillRect(116 + x, 34 + y, 1, 1);
        g2d.fillRect(105 + x, 35 + y, 1, 1);
        g2d.fillRect(108 + x, 36 + y, 1, 1);
        g2d.fillRect(110 + x, 36 + y, 2, 1);
        g2d.fillRect(117 + x, 36 + y, 1, 2);
        g2d.fillRect(107 + x, 37 + y, 1, 1);
        g2d.fillRect(109 + x, 37 + y, 1, 1);
        g2d.fillRect(116 + x, 37 + y, 1, 3);
        g2d.fillRect(108 + x, 38 + y, 1, 1);
        g2d.fillRect(110 + x, 38 + y, 1, 1);
        g2d.fillRect(112 + x, 38 + y, 1, 2);
        g2d.fillRect(113 + x, 38 + y, 1, 3);
        g2d.fillRect(115 + x, 38 + y, 1, 4);
        g2d.fillRect(109 + x, 39 + y, 1, 1);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(110 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(111 + x, 42 + y, 2, 1);
        g2d.fillRect(112 + x, 43 + y, 2, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 31 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(108 + x, 33 + y, 1, 1);
        g2d.fillRect(110 + x, 33 + y, 5, 1);
        g2d.fillRect(107 + x, 35 + y, 1, 1);
        g2d.fillRect(111 + x, 37 + y, 2, 1);
        g2d.fillRect(114 + x, 37 + y, 1, 1);
        g2d.fillRect(111 + x, 43 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 33 + y, 1, 1);
        g2d.fillRect(115 + x, 33 + y, 1, 2);
        g2d.fillRect(115 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 34 + y, 1, 1);
        g2d.fillRect(108 + x, 35 + y, 1, 1);
        g2d.fillRect(116 + x, 35 + y, 1, 1);
        g2d.fillRect(115 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 36 + y, 1, 1);
        g2d.fillRect(110 + x, 37 + y, 1, 1);
        g2d.fillRect(113 + x, 37 + y, 1, 1);
        g2d.fillRect(114 + x, 38 + y, 1, 1);
        g2d.fillRect(111 + x, 39 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 35 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(108 + x, 34 + y, 1, 1);
        g2d.fillRect(116 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(117 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(112 + x, 36 + y, 1, 1);
    }





    public void paintBackH(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(112 + x, 32 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(110 + x, 32 + y, 1, 1);
        g2d.fillRect(109 + x, 35 + y, 1, 1);
        g2d.fillRect(109 + x, 37 + y, 1, 1);
        g2d.fillRect(107 + x, 40 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(97 + x, 29 + y, 1, 1);
        g2d.fillRect(112 + x, 30 + y, 1, 1);
        g2d.fillRect(110 + x, 30 + y, 1, 2);
        g2d.fillRect(108 + x, 30 + y, 1, 1);
        g2d.fillRect(98 + x, 30 + y, 1, 1);
        g2d.fillRect(113 + x, 31 + y, 1, 4);
        g2d.fillRect(106 + x, 31 + y, 2, 1);
        g2d.fillRect(111 + x, 32 + y, 1, 1);
        g2d.fillRect(100 + x, 32 + y, 7, 1);
        g2d.fillRect(97 + x, 32 + y, 2, 1);
        g2d.fillRect(110 + x, 33 + y, 1, 2);
        g2d.fillRect(99 + x, 33 + y, 1, 1);
        g2d.fillRect(114 + x, 34 + y, 1, 1);
        g2d.fillRect(109 + x, 34 + y, 1, 1);
        g2d.fillRect(100 + x, 35 + y, 1, 1);
        g2d.fillRect(108 + x, 36 + y, 2, 1);
        g2d.fillRect(101 + x, 36 + y, 2, 1);
        g2d.fillRect(107 + x, 37 + y, 1, 1);
        g2d.fillRect(108 + x, 38 + y, 1, 1);
        g2d.fillRect(106 + x, 38 + y, 1, 1);
        g2d.fillRect(104 + x, 38 + y, 1, 1);
        g2d.fillRect(107 + x, 39 + y, 1, 1);
        g2d.fillRect(105 + x, 39 + y, 1, 1);
        g2d.fillRect(106 + x, 40 + y, 1, 3);
        g2d.fillRect(104 + x, 40 + y, 1, 2);
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(105 + x, 41 + y, 1, 3);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 3);
        g2d.fillRect(104 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 44 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 46 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(111 + x, 30 + y, 1, 1);
        g2d.fillRect(109 + x, 30 + y, 1, 4);
        g2d.fillRect(97 + x, 30 + y, 1, 2);
        g2d.fillRect(108 + x, 31 + y, 1, 2);
        g2d.fillRect(99 + x, 31 + y, 1, 2);
        g2d.fillRect(98 + x, 31 + y, 1, 1);
        g2d.fillRect(107 + x, 32 + y, 1, 1);
        g2d.fillRect(111 + x, 33 + y, 1, 2);
        g2d.fillRect(106 + x, 33 + y, 1, 1);
        g2d.fillRect(98 + x, 33 + y, 1, 2);
        g2d.fillRect(108 + x, 34 + y, 1, 1);
        g2d.fillRect(101 + x, 34 + y, 5, 1);
        g2d.fillRect(99 + x, 34 + y, 1, 1);
        g2d.fillRect(110 + x, 35 + y, 1, 1);
        g2d.fillRect(107 + x, 36 + y, 1, 1);
        g2d.fillRect(104 + x, 36 + y, 2, 1);
        g2d.fillRect(98 + x, 36 + y, 1, 2);
        g2d.fillRect(108 + x, 37 + y, 1, 1);
        g2d.fillRect(106 + x, 37 + y, 1, 1);
        g2d.fillRect(99 + x, 37 + y, 1, 3);
        g2d.fillRect(107 + x, 38 + y, 1, 1);
        g2d.fillRect(105 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 38 + y, 1, 2);
        g2d.fillRect(102 + x, 38 + y, 1, 3);
        g2d.fillRect(100 + x, 38 + y, 1, 4);
        g2d.fillRect(106 + x, 39 + y, 1, 1);
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(105 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 2);
        g2d.fillRect(103 + x, 42 + y, 2, 1);
        g2d.fillRect(102 + x, 43 + y, 2, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(111 + x, 31 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(107 + x, 33 + y, 1, 1);
        g2d.fillRect(101 + x, 33 + y, 5, 1);
        g2d.fillRect(108 + x, 35 + y, 1, 1);
        g2d.fillRect(103 + x, 37 + y, 2, 1);
        g2d.fillRect(101 + x, 37 + y, 1, 1);
        g2d.fillRect(104 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 33 + y, 1, 1);
        g2d.fillRect(100 + x, 33 + y, 1, 2);
        g2d.fillRect(100 + x, 37 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(106 + x, 34 + y, 1, 1);
        g2d.fillRect(107 + x, 35 + y, 1, 1);
        g2d.fillRect(99 + x, 35 + y, 1, 1);
        g2d.fillRect(100 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 29 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 36 + y, 1, 1);
        g2d.fillRect(105 + x, 37 + y, 1, 1);
        g2d.fillRect(102 + x, 37 + y, 1, 1);
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(104 + x, 39 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 35 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(107 + x, 34 + y, 1, 1);
        g2d.fillRect(99 + x, 36 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(98 + x, 35 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(103 + x, 36 + y, 1, 1);
    }
}
