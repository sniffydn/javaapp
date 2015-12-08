/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.t.u.*;
import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class D41Helper extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public D41Helper()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public D41Helper(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public D41Helper(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU1(x,y,g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equals("b"))
        {
            drawB(x,y,g2d);
        }
    }

    

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, offsetY, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
    
    public void paintTU1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 45 + y, 1, 4);
        g2d.fillRect(106 + x, 47 + y, 1, 5);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 2, 1);
        g2d.fillRect(102 + x, 48 + y, 3, 1);
        g2d.fillRect(109 + x, 48 + y, 4, 1);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(115 + x, 48 + y, 1, 4);
        g2d.fillRect(100 + x, 49 + y, 1, 6);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 3, 1);
        g2d.fillRect(118 + x, 49 + y, 2, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 5);
        g2d.fillRect(105 + x, 50 + y, 1, 1);
        g2d.fillRect(109 + x, 50 + y, 1, 4);
        g2d.fillRect(110 + x, 50 + y, 1, 3);
        g2d.fillRect(116 + x, 50 + y, 1, 3);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 4);
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(108 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 51 + y, 4, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 52 + y, 3, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 5);
        g2d.fillRect(113 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 54 + y, 1, 3);
        g2d.fillRect(116 + x, 54 + y, 1, 3);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 3, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(106 + x, 45 + y, 1, 2);
        g2d.fillRect(107 + x, 45 + y, 2, 1);
        g2d.fillRect(108 + x, 46 + y, 2, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(119 + x, 46 + y, 1, 3);
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 47 + y, 3, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 3);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 2);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 3, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(119 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 2, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(107 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 2, 1);
        g2d.fillRect(112 + x, 50 + y, 3, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 53 + y, 1, 1);
    }
}
