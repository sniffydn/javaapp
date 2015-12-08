/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.a;

import clts.*;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import pieces.p.Star0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Mesh1 extends SuperTU
{
    public Mesh1()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Mesh1(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Mesh1(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {}

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintFront(offsetX, offsetY, g2d);
        drawUpper(offsetX, offsetY, g2d);
        drawLower(offsetX, 0, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 1);
    }
}
