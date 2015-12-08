/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.*;
import draw.Panel;
import util.Color;
import util.DFactory;
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
public class Copy2 extends SuperTL
{
    int y = -50;
    int alpha = 0;
    int count = 0;
    int increment = 0;
    int length = 0;

    public Copy2()
    {
        super();
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public Copy2(ColorArray colorSwitch)
    {
        super(colorSwitch);
        length = (DFactory.ARRAY_SIZE) / 2;
        increment = (255 / length) * 3;
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;

        count++;
        if(count > DFactory.ARRAY_SIZE)
        {
            count = 0;
            alpha = 0;
            y = -50;
        }

        if(count > (length - 3))
        {
            if((count - (length - 3)) < (length / 2))
            {
                alpha += increment;
                if(alpha > 255)
                    alpha = 255;
            }
            else
            {
                alpha -= increment;
                if(alpha < 0)
                    alpha = 0;
            }

            if(alpha != 255)
                y-=4;
        }

        COLORS.setAlpha(alpha);
    }


    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        paintMar(offsetX + shiftX, y + shiftY,g2d);
    }

    public void paintMar(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(121 + x, 143 + y, 1, 1);
        g2d.fillRect(118 + x, 144 + y, 2, 1);
        g2d.fillRect(122 + x, 144 + y, 2, 1);
        g2d.fillRect(119 + x, 146 + y, 4, 1);
        g2d.fillRect(88 + x, 148 + y, 1, 10);
        g2d.fillRect(89 + x, 148 + y, 1, 10);
        g2d.fillRect(90 + x, 148 + y, 1, 10);
        g2d.fillRect(91 + x, 148 + y, 1, 10);
        g2d.fillRect(92 + x, 148 + y, 1, 2);
        g2d.fillRect(93 + x, 148 + y, 1, 10);
        g2d.fillRect(94 + x, 148 + y, 1, 10);
        g2d.fillRect(95 + x, 148 + y, 1, 10);
        g2d.fillRect(96 + x, 148 + y, 1, 9);
        g2d.fillRect(97 + x, 148 + y, 1, 2);
        g2d.fillRect(98 + x, 148 + y, 1, 10);
        g2d.fillRect(99 + x, 148 + y, 1, 10);
        g2d.fillRect(106 + x, 148 + y, 1, 4);
        g2d.fillRect(107 + x, 148 + y, 1, 4);
        g2d.fillRect(108 + x, 148 + y, 1, 4);
        g2d.fillRect(109 + x, 148 + y, 1, 10);
        g2d.fillRect(113 + x, 148 + y, 1, 10);
        g2d.fillRect(114 + x, 148 + y, 1, 10);
        g2d.fillRect(115 + x, 148 + y, 1, 4);
        g2d.fillRect(116 + x, 148 + y, 1, 4);
        g2d.fillRect(120 + x, 148 + y, 1, 10);
        g2d.fillRect(121 + x, 148 + y, 1, 10);
        g2d.fillRect(122 + x, 148 + y, 1, 10);
        g2d.fillRect(125 + x, 148 + y, 1, 2);
        g2d.fillRect(126 + x, 148 + y, 4, 1);
        g2d.fillRect(100 + x, 149 + y, 1, 9);
        g2d.fillRect(104 + x, 149 + y, 1, 8);
        g2d.fillRect(105 + x, 149 + y, 1, 3);
        g2d.fillRect(112 + x, 149 + y, 1, 9);
        g2d.fillRect(117 + x, 149 + y, 1, 3);
        g2d.fillRect(119 + x, 149 + y, 1, 9);
        g2d.fillRect(124 + x, 149 + y, 1, 6);
        g2d.fillRect(129 + x, 149 + y, 2, 1);
        g2d.fillRect(103 + x, 150 + y, 1, 6);
        g2d.fillRect(111 + x, 150 + y, 1, 8);
        g2d.fillRect(118 + x, 150 + y, 1, 1);
        g2d.fillRect(130 + x, 150 + y, 1, 3);
        g2d.fillRect(102 + x, 152 + y, 1, 2);
        g2d.fillRect(125 + x, 152 + y, 1, 5);
        g2d.fillRect(129 + x, 152 + y, 1, 1);
        g2d.fillRect(126 + x, 153 + y, 1, 4);
        g2d.fillRect(127 + x, 154 + y, 1, 4);
        g2d.fillRect(128 + x, 154 + y, 1, 4);
        g2d.fillRect(129 + x, 154 + y, 1, 4);
        g2d.fillRect(130 + x, 154 + y, 1, 4);
        g2d.fillRect(105 + x, 156 + y, 4, 1);
        g2d.fillRect(106 + x, 157 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(120 + x, 143 + y, 1, 1);
        g2d.fillRect(122 + x, 145 + y, 1, 1);
        g2d.fillRect(119 + x, 148 + y, 1, 1);
        g2d.fillRect(128 + x, 149 + y, 1, 1);
        g2d.fillRect(118 + x, 151 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(96 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(119 + x, 145 + y, 1, 1);
        g2d.fillRect(112 + x, 148 + y, 1, 1);
        g2d.fillRect(111 + x, 149 + y, 1, 1);
        g2d.fillRect(126 + x, 149 + y, 1, 1);
        g2d.fillRect(129 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 152 + y, 1, 1);
        g2d.fillRect(108 + x, 152 + y, 1, 1);
        g2d.fillRect(127 + x, 153 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(120 + x, 142 + y, 2, 1);
        g2d.fillRect(105 + x, 148 + y, 1, 1);
        g2d.fillRect(102 + x, 151 + y, 1, 1);
        g2d.fillRect(125 + x, 151 + y, 1, 1);
        g2d.fillRect(102 + x, 154 + y, 1, 1);
        g2d.fillRect(105 + x, 155 + y, 1, 1);
        g2d.fillRect(108 + x, 155 + y, 1, 1);
        g2d.fillRect(105 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 148 + y, 1, 1);
        g2d.fillRect(117 + x, 148 + y, 1, 1);
        g2d.fillRect(124 + x, 148 + y, 1, 1);
        g2d.fillRect(130 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 149 + y, 1, 1);
        g2d.fillRect(101 + x, 150 + y, 1, 8);
        g2d.fillRect(123 + x, 150 + y, 1, 4);
        g2d.fillRect(129 + x, 150 + y, 1, 1);
        g2d.fillRect(131 + x, 150 + y, 1, 3);
        g2d.fillRect(128 + x, 153 + y, 2, 1);
        g2d.fillRect(131 + x, 154 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 147 + y, 1, 1);
        g2d.fillRect(122 + x, 147 + y, 1, 1);
        g2d.fillRect(101 + x, 149 + y, 1, 1);
        g2d.fillRect(125 + x, 150 + y, 1, 1);
        g2d.fillRect(105 + x, 154 + y, 1, 1);
        g2d.fillRect(126 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 149 + y, 1, 1);
        g2d.fillRect(123 + x, 149 + y, 1, 1);
        g2d.fillRect(131 + x, 149 + y, 1, 1);
        g2d.fillRect(130 + x, 153 + y, 1, 1);
        g2d.fillRect(103 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 143 + y, 1, 1);
        g2d.fillRect(122 + x, 143 + y, 1, 1);
        g2d.fillRect(120 + x, 147 + y, 1, 1);
        g2d.fillRect(108 + x, 154 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(120 + x, 144 + y, 1, 1);
        g2d.fillRect(123 + x, 145 + y, 1, 1);
        g2d.fillRect(121 + x, 147 + y, 1, 1);
        g2d.fillRect(110 + x, 148 + y, 1, 10);
        g2d.fillRect(123 + x, 154 + y, 1, 1);
        g2d.fillRect(106 + x, 155 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 143 + y, 1, 1);
        g2d.fillRect(121 + x, 144 + y, 1, 1);
        g2d.fillRect(127 + x, 149 + y, 1, 1);
        g2d.fillRect(106 + x, 152 + y, 1, 1);
        g2d.fillRect(124 + x, 156 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(123 + x, 143 + y, 1, 1);
        g2d.fillRect(118 + x, 145 + y, 1, 1);
        g2d.fillRect(104 + x, 148 + y, 1, 1);
        g2d.fillRect(102 + x, 150 + y, 1, 1);
        g2d.fillRect(107 + x, 152 + y, 1, 1);
        g2d.fillRect(127 + x, 152 + y, 1, 1);
        g2d.fillRect(102 + x, 155 + y, 1, 1);
        g2d.fillRect(104 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(118 + x, 146 + y, 1, 1);
        g2d.fillRect(123 + x, 146 + y, 1, 1);
        g2d.fillRect(97 + x, 150 + y, 1, 7);
        g2d.fillRect(126 + x, 150 + y, 1, 1);
        g2d.fillRect(128 + x, 150 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(120 + x, 145 + y, 2, 1);
        g2d.fillRect(111 + x, 148 + y, 1, 1);
        g2d.fillRect(118 + x, 148 + y, 1, 1);
        g2d.fillRect(128 + x, 151 + y, 1, 2);
        g2d.fillRect(97 + x, 157 + y, 1, 1);
        g2d.fillRect(125 + x, 157 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5, ImageUtilities.GREY_6));
        g2d.fillRect(126 + x, 151 + y, 1, 1);
        g2d.fillRect(105 + x, 153 + y, 1, 1);
        g2d.fillRect(131 + x, 153 + y, 1, 1);
        g2d.fillRect(123 + x, 155 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(122 + x, 142 + y, 1, 1);
        g2d.fillRect(118 + x, 147 + y, 1, 1);
        g2d.fillRect(123 + x, 147 + y, 1, 2);
        g2d.fillRect(101 + x, 148 + y, 1, 1);
        g2d.fillRect(131 + x, 148 + y, 1, 1);
        g2d.fillRect(92 + x, 150 + y, 1, 1);
        g2d.fillRect(126 + x, 152 + y, 1, 1);
        g2d.fillRect(106 + x, 153 + y, 3, 1);
    }

    public void attributesSetUpDecreaseShiftX()
    {
        shiftX--;
    }

    public void attributesSetUpIncreaseShiftX()
    {
        shiftX++;
    }

    public int getShiftX()
    {
        return shiftX;
    }

    public void attributesSetUpDecreaseShiftY()
    {
        shiftY--;
    }

    public void attributesSetUpIncreaseShiftY()
    {
        shiftY++;
    }

    public int getShiftY()
    {
        return shiftY;
    }

    int shiftX = 0;
    int shiftY = 0;

}
