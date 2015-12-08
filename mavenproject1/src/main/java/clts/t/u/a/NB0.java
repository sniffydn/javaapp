/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.Piece;
import clts.SuperTL;
import util.Color;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class NB0 extends SuperTL
{
    int prevX = -1;
    int prevY = -1;
    int prevDiffX = 0;
    int prevDiffY = 0;
    int prevPrevDiffY = 0;
    int tempLen = -1;
    int prevLen = -1;
    int prevPrevLen = -1;

    public NB0()
    {
        super();
    }

    public NB0(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d)
    {
        if(prevX == -1)
        {
            prevX = x;
            prevY = y;
            prevPrevLen = prevLen = tempLen = 0;
        }

        int diffX = prevX - x;
        int diffY = prevY - y;

        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(0 + x, 0 + y, 1, 1);
        g2d.fillRect(-2 + x, 2 + y, 1, 1);
        g2d.fillRect(0 + x, 4 + y, 1, 1);
        g2d.fillRect(2 + x, 2 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(-1 + x, 1 + y, 1, 1);
        g2d.fillRect(1 + x, 1 + y, 1, 1);
        g2d.fillRect(-1 + x, 3 + y, 1, 1);
        g2d.fillRect(1 + x, 3 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(-2 + x, 0 + y, 2, 1);
        g2d.fillRect(1 + x, 0 + y, 2, 1);
        g2d.fillRect(-2 + x, 1 + y, 1, 1);
        g2d.fillRect(2 + x, 1 + y, 1, 1);
        g2d.fillRect(-2 + x, 3 + y, 1, 1);
        g2d.fillRect(2 + x, 3 + y, 1, 1);

        if(prevDiffX > 0 || diffX > 0)
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(-2 + x, 4 + y, 1, 33);

            g2d.fillRect(2 + x, 4 + y, 1, 27);
            g2d.fillRect(3 + x, 7 + y, 1, 23);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + x, 4 + y, 1, 37);
            g2d.fillRect(-2 + x, 37 + y, 1, 3);
            g2d.fillRect(-1 + x, 4 + y, 1, 35);

            g2d.fillRect(1 + x, 4 + y, 1, 29);
            g2d.fillRect(2 + x, 31 + y, 1, 1);
            g2d.fillRect(3 + x, 30 + y, 1, 1);
            g2d.fillRect(3 + x, 4 + y, 1, 3);
            g2d.fillRect(4 + x, 7 + y, 1, 23);
        }
        else if(prevDiffX < 0 || diffX < 0)
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(-3 + x, 26 + y, 1, 6);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(-2 + x, 4 + y, 1, 33);
            g2d.fillRect(-3 + x, 32 + y, 1, 4);

            g2d.fillRect(2 + x, 4 + y, 1, 27);
            g2d.fillRect(3 + x, 7 + y, 1, 23);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-4 + x, 25 + y, 1, 12);
            g2d.fillRect(-3 + x, 4 + y, 1, 22);
            g2d.fillRect(-3 + x, 36 + y, 1, 3);
            g2d.fillRect(-2 + x, 37 + y, 1, 3);
            g2d.fillRect(-1 + x, 4 + y, 1, 36);

            g2d.fillRect(1 + x, 4 + y, 1, 29);
            g2d.fillRect(2 + x, 31 + y, 1, 1);
            g2d.fillRect(3 + x, 4 + y, 1, 27);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
            g2d.fillRect(-2 + x, 4 + y, 1, 33 + prevPrevLen);

            g2d.fillRect(2 + x, 4 + y, 1, 27 + prevPrevLen);
            g2d.fillRect(3 + x, 7 + y, 1, 23 + prevPrevLen);

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(-3 + x, 4 + y, 1, 37 + prevPrevLen);
            g2d.fillRect(-2 + x, 37 + prevPrevLen + y, 1, 3);
            g2d.fillRect(-1 + x, 4 + y, 1, 35 + prevPrevLen);

            g2d.fillRect(1 + x, 4 + y, 1, 29 + prevPrevLen);
            g2d.fillRect(2 + x, 31 + prevPrevLen + y, 1, 1);
            g2d.fillRect(3 + x, 4 + y, 1, 27 + prevPrevLen);
        }



        if(diffY < prevDiffY)
            tempLen--;
        else if(diffY > prevDiffY)
            tempLen++;


        prevPrevLen = prevLen;
        prevLen = tempLen;
        prevPrevDiffY = prevDiffY;
        prevDiffX = diffX;
        prevDiffY = diffY;
        prevX = x;
        prevY = y;
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        draw(offsetX + 110, offsetY + 53, g2d);
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {}

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {}

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {}

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {}
}
