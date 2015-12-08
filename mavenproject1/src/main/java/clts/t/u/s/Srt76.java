package clts.t.u.s;

import clts.*;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt76 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt76()
    {
        super();
        containsTL = true;
    }

    public Srt76(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt76(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equals("b"))
        {
            drawB(x,y,g2d);
        }

        paintTL(x,0,g2d);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 47 + y, 1, 3);
        g2d.fillRect(117 + x, 47 + y, 1, 3);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 2, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 4);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 2, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 2, 1);
        g2d.fillRect(102 + x, 56 + y, 3, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 3, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 3, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 2, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 6, 1);
        g2d.fillRect(113 + x, 59 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 3, 1);
        g2d.fillRect(116 + x, 53 + y, 4, 1);
        g2d.fillRect(104 + x, 54 + y, 2, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 2, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 7, 1);
        g2d.fillRect(112 + x, 58 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 3, 1);
        g2d.fillRect(116 + x, 54 + y, 3, 1);
        g2d.fillRect(102 + x, 55 + y, 4, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 2, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 3, 1);
        g2d.fillRect(115 + x, 57 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 50 + y, 2, 1);
        g2d.fillRect(117 + x, 50 + y, 2, 1);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 2, 1);
        g2d.fillRect(117 + x, 52 + y, 2, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 51 + y, 2, 1);
        g2d.fillRect(117 + x, 51 + y, 2, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 41 + y, 1, 7);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 41 + y, 2, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 6);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 3, 1);
        g2d.fillRect(113 + x, 61 + y, 2, 1);
        g2d.fillRect(102 + x, 62 + y, 3, 1);
        g2d.fillRect(115 + x, 62 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 3, 1);
        g2d.fillRect(113 + x, 62 + y, 2, 1);
        g2d.fillRect(102 + x, 63 + y, 3, 1);
        g2d.fillRect(115 + x, 63 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 4);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 1, 2);
    }
}
