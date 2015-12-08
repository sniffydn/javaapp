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
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class GL1 extends SuperTL
{
    int direction = 0;
    public GL1()
    {
        super();
    }

    public GL1(ColorArray colorSwitch)
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

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        if(direction == 1)
            paintGlasses2(offsetX, 0,g2d);
        else
            paintBackGlasses2(offsetX, 0,g2d);
    }

    public void paintGlasses2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 26 + y, 3, 1);
        g2d.fillRect(106 + x, 27 + y, 1, 1);
        g2d.fillRect(105 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 28 + y, 1, 1);

        Color c1 = COLORS.get(ImageUtilities.GREY);
        c1 = new Color(c1.getRed(), c1.getGreen(), c1.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c2 = COLORS.get(ImageUtilities.GREY_1);
        c2 = new Color(c2.getRed(), c2.getGreen(), c2.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c3 = COLORS.get(ImageUtilities.GREY_2);
        c3 = new Color(c3.getRed(), c3.getGreen(), c3.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));

        g2d.setColor(c1);
        g2d.fillRect(109 + x, 27 + y, 3, 1);
        g2d.fillRect(115 + x, 27 + y, 1, 2);
        g2d.fillRect(116 + x, 27 + y, 1, 3);
        g2d.fillRect(117 + x, 27 + y, 1, 4);
        g2d.fillRect(118 + x, 27 + y, 1, 5);
        g2d.fillRect(119 + x, 27 + y, 1, 5);
        g2d.fillRect(112 + x, 28 + y, 1, 1);
        g2d.fillRect(120 + x, 28 + y, 1, 3);


        g2d.setColor(c2);
        g2d.fillRect(108 + x, 27 + y, 1, 1);
        g2d.fillRect(110 + x, 28 + y, 2, 1);
        g2d.fillRect(114 + x, 28 + y, 1, 2);
        g2d.fillRect(112 + x, 29 + y, 2, 1);
        g2d.fillRect(115 + x, 29 + y, 1, 2);
        g2d.fillRect(116 + x, 30 + y, 1, 2);
        g2d.fillRect(117 + x, 31 + y, 1, 1);


        g2d.setColor(c3);
        g2d.fillRect(107 + x, 27 + y, 1, 5);
        g2d.fillRect(106 + x, 28 + y, 1, 3);
        g2d.fillRect(108 + x, 28 + y, 1, 4);
        g2d.fillRect(109 + x, 28 + y, 1, 4);
        g2d.fillRect(110 + x, 29 + y, 1, 3);
        g2d.fillRect(111 + x, 29 + y, 1, 3);
        g2d.fillRect(112 + x, 30 + y, 1, 1);
        g2d.fillRect(114 + x, 30 + y, 1, 1);
        g2d.fillRect(115 + x, 31 + y, 1, 1);
    }

    public void paintBackGlasses2(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 26 + y, 3, 1);
        g2d.fillRect(109 + x, 27 + y, 1, 1);
        g2d.fillRect(110 + x, 28 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 28 + y, 1, 1);


        Color c1 = COLORS.get(ImageUtilities.GREY);
        c1 = new Color(c1.getRed(), c1.getGreen(), c1.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c2 = COLORS.get(ImageUtilities.GREY_1);
        c2 = new Color(c2.getRed(), c2.getGreen(), c2.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c3 = COLORS.get(ImageUtilities.GREY_2);
        c3 = new Color(c3.getRed(), c3.getGreen(), c3.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));


        g2d.setColor(c1);
        g2d.fillRect(104 + x, 27 + y, 3, 1);
        g2d.fillRect(100 + x, 27 + y, 1, 2);
        g2d.fillRect(99 + x, 27 + y, 1, 3);
        g2d.fillRect(98 + x, 27 + y, 1, 4);
        g2d.fillRect(97 + x, 27 + y, 1, 5);
        g2d.fillRect(96 + x, 27 + y, 1, 5);
        g2d.fillRect(103 + x, 28 + y, 1, 1);
        g2d.fillRect(95 + x, 28 + y, 1, 3);


        g2d.setColor(c2);
        g2d.fillRect(107 + x, 27 + y, 1, 1);
        g2d.fillRect(104 + x, 28 + y, 2, 1);
        g2d.fillRect(101 + x, 28 + y, 1, 2);
        g2d.fillRect(102 + x, 29 + y, 2, 1);
        g2d.fillRect(100 + x, 29 + y, 1, 2);
        g2d.fillRect(99 + x, 30 + y, 1, 2);
        g2d.fillRect(98 + x, 31 + y, 1, 1);


        g2d.setColor(c3);
        g2d.fillRect(108 + x, 27 + y, 1, 5);
        g2d.fillRect(109 + x, 28 + y, 1, 3);
        g2d.fillRect(107 + x, 28 + y, 1, 4);
        g2d.fillRect(106 + x, 28 + y, 1, 4);
        g2d.fillRect(105 + x, 29 + y, 1, 3);
        g2d.fillRect(104 + x, 29 + y, 1, 3);
        g2d.fillRect(103 + x, 30 + y, 1, 1);
        g2d.fillRect(101 + x, 30 + y, 1, 1);
        g2d.fillRect(100 + x, 31 + y, 1, 1);
    }


    protected int opacity = 80;

    public


    int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }
}
