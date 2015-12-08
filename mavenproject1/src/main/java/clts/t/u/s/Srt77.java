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
public class Srt77 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt77()
    {
        super();
        containsTL = true;
    }

    public Srt77(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt77(String middle, ColorArray colorSwitch)
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
        g2d.fillRect(100 + x, 52 + y, 8, 1);
        g2d.fillRect(113 + x, 52 + y, 7, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 2, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 6);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 54 + y, 1, 5);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 2, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 5, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 53 + y, 1, 5);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 3, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 6);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(116 + x, 53 + y, 4, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(107 + x, 54 + y, 2, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 6);
        g2d.fillRect(112 + x, 54 + y, 1, 5);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 2);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 3);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 2, 1);
        g2d.fillRect(105 + x, 54 + y, 2, 1);
        g2d.fillRect(116 + x, 54 + y, 2, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 1, 3);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 3, 1);
        g2d.fillRect(114 + x, 57 + y, 3, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 54 + y, 4, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 2);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 58 + y, 5, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 3, 1);
        g2d.fillRect(116 + x, 58 + y, 2, 1);
        g2d.fillRect(101 + x, 59 + y, 3, 1);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 3);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 13);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 7);
        g2d.fillRect(116 + x, 60 + y, 1, 12);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 3);
        g2d.fillRect(107 + x, 64 + y, 3, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 3);
        g2d.fillRect(108 + x, 66 + y, 1, 3);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 3);
        g2d.fillRect(113 + x, 68 + y, 1, 2);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 4);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 70 + y, 2, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(112 + x, 71 + y, 2, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 3);
        g2d.fillRect(108 + x, 60 + y, 1, 2);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 2, 1);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 7);
        g2d.fillRect(113 + x, 65 + y, 2, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 2, 1);
        g2d.fillRect(114 + x, 69 + y, 2, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 4);
        g2d.fillRect(116 + x, 72 + y, 1, 3);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 4, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 2);
        g2d.fillRect(105 + x, 74 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 1, 3);
        g2d.fillRect(108 + x, 74 + y, 1, 3);
        g2d.fillRect(109 + x, 74 + y, 1, 3);
        g2d.fillRect(110 + x, 74 + y, 1, 3);
        g2d.fillRect(111 + x, 74 + y, 1, 3);
        g2d.fillRect(112 + x, 74 + y, 1, 3);
        g2d.fillRect(113 + x, 74 + y, 1, 3);
        g2d.fillRect(114 + x, 74 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(106 + x, 63 + y, 3, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 3, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 2, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 3);
        g2d.fillRect(111 + x, 71 + y, 1, 3);
        g2d.fillRect(106 + x, 72 + y, 2, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(112 + x, 72 + y, 1, 2);
        g2d.fillRect(113 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 2);
        g2d.fillRect(107 + x, 73 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 2, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 3, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 2, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 2);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 70 + y, 1, 1);
    }
}
