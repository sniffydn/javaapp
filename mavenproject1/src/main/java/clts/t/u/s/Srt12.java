package clts.t.u.s;

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

public class Srt12 extends SuperTU
{
    public Srt12()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt12(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt12(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }


    public clts.SuperC getRecommendedAccessory(ColorArray c)
    {
        return new clts.t.u.a.SL3(c);
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(115 + x, 41 + y, 1, 2);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(113 + x, 45 + y, 1, 3);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 3);
        g2d.fillRect(101 + x, 59 + y, 1, 4);
        g2d.fillRect(116 + x, 60 + y, 1, 8);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 62 + y, 2, 1);
        g2d.fillRect(103 + x, 63 + y, 3, 1);
        g2d.fillRect(105 + x, 64 + y, 3, 1);
        g2d.fillRect(107 + x, 65 + y, 3, 1);
        g2d.fillRect(109 + x, 66 + y, 3, 1);
        g2d.fillRect(111 + x, 67 + y, 3, 1);
        g2d.fillRect(113 + x, 68 + y, 3, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(115 + x, 69 + y, 2, 1);
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 47 + y, 1, 2);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(111 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(108 + x, 50 + y, 1, 2);
        g2d.fillRect(109 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 2, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 2);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 2);
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 7);
        g2d.fillRect(104 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 2, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 2);
        g2d.fillRect(109 + x, 53 + y, 1, 2);
        g2d.fillRect(110 + x, 53 + y, 2, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 3, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 3);
        g2d.fillRect(99 + x, 55 + y, 1, 4);
        g2d.fillRect(119 + x, 56 + y, 1, 3);
        g2d.fillRect(112 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 3);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 59 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 3, 1);
        g2d.fillRect(102 + x, 60 + y, 5, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 51 + y, 1, 5);
        g2d.fillRect(116 + x, 52 + y, 1, 7);
        g2d.fillRect(117 + x, 52 + y, 1, 6);
        g2d.fillRect(118 + x, 52 + y, 1, 5);
        g2d.fillRect(113 + x, 53 + y, 1, 5);
        g2d.fillRect(114 + x, 53 + y, 1, 6);
        g2d.fillRect(115 + x, 53 + y, 1, 6);
        g2d.fillRect(103 + x, 54 + y, 1, 6);
        g2d.fillRect(104 + x, 54 + y, 1, 6);
        g2d.fillRect(110 + x, 54 + y, 1, 4);
        g2d.fillRect(111 + x, 54 + y, 1, 4);
        g2d.fillRect(112 + x, 54 + y, 1, 3);
        g2d.fillRect(101 + x, 55 + y, 1, 4);
        g2d.fillRect(102 + x, 55 + y, 1, 4);
        g2d.fillRect(105 + x, 55 + y, 1, 5);
        g2d.fillRect(106 + x, 55 + y, 1, 5);
        g2d.fillRect(107 + x, 55 + y, 1, 4);
        g2d.fillRect(108 + x, 55 + y, 1, 4);
        g2d.fillRect(109 + x, 55 + y, 1, 3);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
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
}
