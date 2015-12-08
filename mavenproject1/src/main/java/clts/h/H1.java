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
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import clts.t.u.a.T0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class H1 extends SuperTL
{
    int direction = 0;
    public H1()
    {
        super();
    }

    public H1(ColorArray colorSwitch)
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
            paintH(offsetX, -95, g2d);
        else
            paintH(offsetX - 4, -95, g2d);
    }

    public void paintH(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(104 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 2, 1);
        g2d.fillRect(105 + x, 111 + y, 9, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 99 + y, 1, 1);
        g2d.fillRect(111 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 101 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(109 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 3);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 4);
        g2d.fillRect(110 + x, 103 + y, 1, 4);
        g2d.fillRect(117 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 108 + y, 2, 1);
        g2d.fillRect(112 + x, 108 + y, 2, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 2);
        g2d.fillRect(103 + x, 110 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 98 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(99 + x, 100 + y, 1, 1);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(98 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 101 + y, 1, 4);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(99 + x, 102 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 1);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 105 + y, 1, 3);
        g2d.fillRect(102 + x, 108 + y, 1, 2);
        g2d.fillRect(112 + x, 109 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(110 + x, 100 + y, 1, 1);
        g2d.fillRect(109 + x, 101 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 3);
        g2d.fillRect(114 + x, 108 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(109 + x, 103 + y, 1, 8);
        g2d.fillRect(101 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 3);
        g2d.fillRect(116 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 107 + y, 1, 4);
        g2d.fillRect(110 + x, 107 + y, 1, 4);
        g2d.fillRect(103 + x, 108 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 98 + y, 1, 9);
        g2d.fillRect(114 + x, 98 + y, 1, 9);
        g2d.fillRect(103 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 6);
        g2d.fillRect(113 + x, 102 + y, 1, 6);
        g2d.fillRect(106 + x, 104 + y, 1, 4);
        g2d.fillRect(112 + x, 104 + y, 1, 4);
        g2d.fillRect(107 + x, 105 + y, 1, 2);
        g2d.fillRect(111 + x, 105 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 110 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 108 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(104 + x, 108 + y, 1, 2);
        g2d.fillRect(105 + x, 109 + y, 2, 1);
        g2d.fillRect(106 + x, 110 + y, 1, 1);
    }

}
