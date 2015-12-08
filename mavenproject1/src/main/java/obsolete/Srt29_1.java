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
public class Srt29_1 extends SuperTU
{
    public Srt29_1()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt29_1(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt29_1(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }



    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
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
        drawLower(offsetX, 0, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {


//v.add(new Color(204,0,0,255));
//v.add(new Color(51,191,85,255));
//v.add(new Color(244,122,163,255));
//v.add(new Color(204,204,204,255));
//v.add(new Color(255,255,170,255));
//v.add(new Color(255,255,255,255));

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);


        g2d.setColor(new Color(51,191,85,255));
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);


        g2d.setColor(new Color(204,204,204,255));
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);


        g2d.setColor(new Color(255,255,170,255));
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);


        g2d.setColor(new Color(255,255,255,255));
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 2, 1);
        g2d.fillRect(107 + x, 75 + y, 1, 1);


        g2d.setColor(new Color(51,191,85,255));
        g2d.fillRect(109 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);


        g2d.setColor(new Color(204,204,204,255));
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);


        g2d.setColor(new Color(255,255,170,255));
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 2, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);


        g2d.setColor(new Color(255,255,255,255));
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 2, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
    }
}
