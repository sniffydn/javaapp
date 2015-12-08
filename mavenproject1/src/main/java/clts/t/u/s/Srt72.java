package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt72 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt72()
    {
        super();
        containsTL = true;
    }

    public Srt72(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt72(String middle, ColorArray colorSwitch)
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
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 1, 2);
        g2d.fillRect(112 + x, 48 + y, 1, 7);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(108 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 59 + y, 1, 5);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 2, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 3);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(105 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(107 + x, 52 + y, 1, 2);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 3);
        g2d.fillRect(105 + x, 55 + y, 1, 3);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 2, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 3);
        g2d.fillRect(104 + x, 60 + y, 1, 3);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 7);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 2, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 2);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 1, 4);
        g2d.fillRect(102 + x, 47 + y, 2, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 3);
        g2d.fillRect(103 + x, 48 + y, 1, 2);
        g2d.fillRect(104 + x, 48 + y, 1, 3);
        g2d.fillRect(114 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(105 + x, 50 + y, 1, 3);
        g2d.fillRect(113 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 6);
        g2d.fillRect(116 + x, 51 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 4);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 2);
        g2d.fillRect(113 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 4);
        g2d.fillRect(107 + x, 54 + y, 2, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 55 + y, 1, 5);
        g2d.fillRect(108 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 2, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 2, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 5);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 1, 3);
        g2d.fillRect(109 + x, 62 + y, 1, 3);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 2);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 5);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 5);
        g2d.fillRect(104 + x, 51 + y, 1, 4);
        g2d.fillRect(117 + x, 51 + y, 1, 4);
        g2d.fillRect(105 + x, 53 + y, 1, 2);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(103 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 4);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 4);
        g2d.fillRect(109 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 4);
        g2d.fillRect(110 + x, 61 + y, 3, 1);
        g2d.fillRect(111 + x, 62 + y, 2, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 2, 1);
        g2d.fillRect(113 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 2, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 50 + y, 1, 5);
        g2d.fillRect(103 + x, 51 + y, 1, 3);
        g2d.fillRect(110 + x, 66 + y, 2, 1);
        g2d.fillRect(111 + x, 67 + y, 2, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(99 + x, 41 + y, 3, 1);
        g2d.fillRect(115 + x, 41 + y, 3, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 4);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 3);
        g2d.fillRect(114 + x, 43 + y, 1, 3);
        g2d.fillRect(117 + x, 43 + y, 1, 4);
        g2d.fillRect(99 + x, 46 + y, 1, 4);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(113 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 3);
        g2d.fillRect(112 + x, 47 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 42 + y, 1, 4);
        g2d.fillRect(115 + x, 42 + y, 1, 4);
        g2d.fillRect(116 + x, 42 + y, 1, 6);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 3);
        g2d.fillRect(100 + x, 46 + y, 1, 3);
        g2d.fillRect(103 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
    }
}
