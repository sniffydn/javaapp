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
public class E2 extends SuperTL
{
    int direction = 0;
    public E2()
    {
        super();
    }

    public E2(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void setStep(int s, int direction, int leftArm, int rightArm,int eye)
    {
        step = s;
        this.direction = direction;
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintVeryFront(offsetX, offsetY, g2d);
        if(direction == 1)
        {
            paintNormal(offsetX, 0, g2d);
        }
        else
        {
            paintBackwards(offsetX, 0, g2d);
        }
    }

    private void paintNormal(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
g2d.fillRect(104 + x, 31 + y, 2, 1);
g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
g2d.fillRect(102 + x, 33 + y, 1, 1);
g2d.fillRect(105 + x, 32 + y, 1, 1);
g2d.fillRect(117 + x, 34 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY));
g2d.fillRect(102 + x, 34 + y, 1, 1);
g2d.fillRect(105 + x, 33 + y, 1, 1);
g2d.fillRect(115 + x, 36 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
g2d.fillRect(102 + x, 35 + y, 3, 1);
g2d.fillRect(116 + x, 36 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
g2d.fillRect(105 + x, 34 + y, 1, 2);
g2d.fillRect(117 + x, 36 + y, 1, 1);

    }

    private void paintBackwards(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
g2d.fillRect(110 + x, 31 + y, 2, 1);
g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
g2d.fillRect(113 + x, 33 + y, 1, 1);
g2d.fillRect(110 + x, 32 + y, 1, 1);
g2d.fillRect(98 + x, 34 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY));
g2d.fillRect(113 + x, 34 + y, 1, 1);
g2d.fillRect(110 + x, 33 + y, 1, 1);
g2d.fillRect(100 + x, 36 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
g2d.fillRect(111 + x, 35 + y, 3, 1);
g2d.fillRect(99 + x, 36 + y, 1, 1);
g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
g2d.fillRect(110 + x, 34 + y, 1, 2);
g2d.fillRect(98 + x, 36 + y, 1, 1);
g2d.fillRect(98 + x, 35 + y, 1, 1);

    }


}
