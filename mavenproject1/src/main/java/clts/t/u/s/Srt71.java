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
public class Srt71 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt71()
    {
        super();
        containsTL = true;
    }

    public Srt71(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt71(String middle, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 47 + y, 2, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 6);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 5);
        g2d.fillRect(102 + x, 52 + y, 2, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 2, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 2, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(111 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 5);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 4);
        g2d.fillRect(108 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 4);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 3, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(119 + x, 50 + y, 1, 8);
        g2d.fillRect(99 + x, 51 + y, 1, 6);
        g2d.fillRect(120 + x, 51 + y, 1, 5);
        g2d.fillRect(100 + x, 55 + y, 1, 3);
        g2d.fillRect(118 + x, 55 + y, 1, 4);
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(104 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 2, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 2);
        g2d.fillRect(113 + x, 57 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 2);
        g2d.fillRect(104 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 4);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 4);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 2, 1);
        g2d.fillRect(112 + x, 61 + y, 2, 1);
        g2d.fillRect(105 + x, 62 + y, 2, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 2, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 3, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 3);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 3);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 62 + y, 2, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 68 + y, 1, 2);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 3);
        g2d.fillRect(110 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 2);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 2);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(100 + x, 43 + y, 1, 5);
        g2d.fillRect(117 + x, 44 + y, 1, 4);
        g2d.fillRect(99 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(102 + x, 63 + y, 1, 2);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 6);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 6);
        g2d.fillRect(101 + x, 75 + y, 1, 4);
        g2d.fillRect(102 + x, 78 + y, 2, 1);
        g2d.fillRect(117 + x, 78 + y, 2, 1);
        g2d.fillRect(103 + x, 79 + y, 14, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(105 + x, 66 + y, 2, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(107 + x, 67 + y, 2, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 3, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 62 + y, 1, 8);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 4);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(118 + x, 72 + y, 1, 6);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 2);
        g2d.fillRect(107 + x, 68 + y, 1, 2);
        g2d.fillRect(114 + x, 70 + y, 2, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 2);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 2, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(110 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 2, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 4);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 4);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 2);
        g2d.fillRect(111 + x, 62 + y, 1, 4);
        g2d.fillRect(104 + x, 63 + y, 1, 2);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 7);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 2);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 3);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 3);
        g2d.fillRect(105 + x, 72 + y, 1, 7);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 7);
        g2d.fillRect(104 + x, 73 + y, 1, 6);
        g2d.fillRect(110 + x, 73 + y, 2, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 4);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 4);
        g2d.fillRect(115 + x, 75 + y, 1, 4);
        g2d.fillRect(109 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 2, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 77 + y, 2, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
    }

}
