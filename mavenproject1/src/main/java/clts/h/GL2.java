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
public class GL2 extends SuperTL
{
    int direction = 0;
    public GL2()
    {
        super();
    }

    public GL2(ColorArray colorSwitch)
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
            paintGlasses(offsetX + 103, 0 + 19,g2d);
        else
            paintBackGlasses(offsetX - 103, 0 + 19,g2d);
    }

    public void paintGlasses(int x, int y, GraphicsMap g2d)
    {

        Color c1 = COLORS.get(ImageUtilities.GREY);
        c1 = new Color(c1.getRed(), c1.getGreen(), c1.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c2 = COLORS.get(ImageUtilities.GREY_1);
        c2 = new Color(c2.getRed(), c2.getGreen(), c2.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c3 = COLORS.get(ImageUtilities.GREY_2);
        c3 = new Color(c3.getRed(), c3.getGreen(), c3.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));

        g2d.setColor(c1);
        g2d.fillRect(3 + x, 6 + y, 5, 1);
        g2d.fillRect(2 + x, 7 + y, 1, 1);
        g2d.fillRect(6 + x, 7 + y, 1, 6);
        g2d.fillRect(7 + x, 7 + y, 1, 6);
        g2d.fillRect(8 + x, 7 + y, 1, 1);
        g2d.fillRect(13 + x, 7 + y, 2, 1);
        g2d.fillRect(18 + x, 7 + y, 1, 4);
        g2d.fillRect(3 + x, 8 + y, 1, 4);
        g2d.fillRect(4 + x, 8 + y, 1, 5);
        g2d.fillRect(5 + x, 8 + y, 1, 5);
        g2d.fillRect(12 + x, 8 + y, 1, 4);
        g2d.fillRect(17 + x, 8 + y, 1, 4);
        g2d.fillRect(2 + x, 9 + y, 1, 2);
        g2d.fillRect(9 + x, 9 + y, 1, 2);
        g2d.fillRect(11 + x, 9 + y, 1, 2);
        g2d.fillRect(8 + x, 10 + y, 1, 2);
        g2d.fillRect(13 + x, 10 + y, 1, 3);
        g2d.fillRect(14 + x, 10 + y, 1, 3);
        g2d.fillRect(16 + x, 10 + y, 1, 3);
        g2d.fillRect(15 + x, 11 + y, 1, 2);


        g2d.setColor(c2);
        g2d.fillRect(3 + x, 7 + y, 3, 1);
        g2d.fillRect(9 + x, 7 + y, 1, 2);
        g2d.fillRect(11 + x, 7 + y, 1, 2);
        g2d.fillRect(12 + x, 7 + y, 1, 1);
        g2d.fillRect(15 + x, 7 + y, 1, 4);
        g2d.fillRect(16 + x, 7 + y, 1, 3);
        g2d.fillRect(17 + x, 7 + y, 1, 1);
        g2d.fillRect(2 + x, 8 + y, 1, 1);
        g2d.fillRect(8 + x, 8 + y, 1, 2);
        g2d.fillRect(13 + x, 8 + y, 1, 2);
        g2d.fillRect(14 + x, 8 + y, 1, 2);


        g2d.setColor(c3);
        g2d.fillRect(10 + x, 6 + y, 5, 1);
        g2d.fillRect(10 + x, 9 + y, 1, 1);
    }





    public void paintBackGlasses(int x, int y, GraphicsMap g2d)
    {

        Color c1 = COLORS.get(ImageUtilities.GREY);
        c1 = new Color(c1.getRed(), c1.getGreen(), c1.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c2 = COLORS.get(ImageUtilities.GREY_1);
        c2 = new Color(c2.getRed(), c2.getGreen(), c2.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));
        Color c3 = COLORS.get(ImageUtilities.GREY_2);
        c3 = new Color(c3.getRed(), c3.getGreen(), c3.getBlue(), (int) (c1.getAlpha() * (opacity / 100.0)));

        g2d.setColor(c1);
        g2d.fillRect(208 + x, 6 + y, 5, 1);
        g2d.fillRect(213 + x, 7 + y, 1, 1);
        g2d.fillRect(209 + x, 7 + y, 1, 6);
        g2d.fillRect(208 + x, 7 + y, 1, 6);
        g2d.fillRect(207 + x, 7 + y, 1, 1);
        g2d.fillRect(201 + x, 7 + y, 2, 1);
        g2d.fillRect(197 + x, 7 + y, 1, 4);
        g2d.fillRect(212 + x, 8 + y, 1, 4);
        g2d.fillRect(211 + x, 8 + y, 1, 5);
        g2d.fillRect(210 + x, 8 + y, 1, 5);
        g2d.fillRect(203 + x, 8 + y, 1, 4);
        g2d.fillRect(198 + x, 8 + y, 1, 4);
        g2d.fillRect(213 + x, 9 + y, 1, 2);
        g2d.fillRect(206 + x, 9 + y, 1, 2);
        g2d.fillRect(204 + x, 9 + y, 1, 2);
        g2d.fillRect(207 + x, 10 + y, 1, 2);
        g2d.fillRect(202 + x, 10 + y, 1, 3);
        g2d.fillRect(201 + x, 10 + y, 1, 3);
        g2d.fillRect(199 + x, 10 + y, 1, 3);
        g2d.fillRect(200 + x, 11 + y, 1, 2);


        g2d.setColor(c2);
        g2d.fillRect(210 + x, 7 + y, 3, 1);
        g2d.fillRect(206 + x, 7 + y, 1, 2);
        g2d.fillRect(204 + x, 7 + y, 1, 2);
        g2d.fillRect(203 + x, 7 + y, 1, 1);
        g2d.fillRect(200 + x, 7 + y, 1, 4);
        g2d.fillRect(199 + x, 7 + y, 1, 3);
        g2d.fillRect(198 + x, 7 + y, 1, 1);
        g2d.fillRect(213 + x, 8 + y, 1, 1);
        g2d.fillRect(207 + x, 8 + y, 1, 2);
        g2d.fillRect(202 + x, 8 + y, 1, 2);
        g2d.fillRect(201 + x, 8 + y, 1, 2);


        g2d.setColor(c3);
        g2d.fillRect(201 + x, 6 + y, 5, 1);
        g2d.fillRect(205 + x, 9 + y, 1, 1);
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
