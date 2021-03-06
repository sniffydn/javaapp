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
public class Srt67 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt67()
    {
        super();
        containsTL = true;
    }

    public Srt67(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt67(String middle, ColorArray colorSwitch)
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

        if(prevY == 1)
        {
            paintTL1(x, 0, g2d);
        }
        else if(prevY == -1)
        {
            paintTL3(x, 0, g2d);
        }
        else
        {
            paintTL2(x, 0, g2d);
        }

        paintTUB(x,0,g2d);

        prevY = y;
    }

    int prevY = 0;


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

    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(99 + x, 76 + y, 2, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 5);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(118 + x, 69 + y, 1, 1);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(120 + x, 71 + y, 1, 2);
        g2d.fillRect(101 + x, 73 + y, 1, 1);
        g2d.fillRect(121 + x, 73 + y, 1, 3);
        g2d.fillRect(100 + x, 74 + y, 1, 2);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 75 + y, 2, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 3, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 2, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 2, 1);
        g2d.fillRect(106 + x, 79 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 6);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 4);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 3);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(102 + x, 71 + y, 1, 2);
        g2d.fillRect(105 + x, 71 + y, 1, 2);
        g2d.fillRect(119 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 2);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 2);
        g2d.fillRect(101 + x, 74 + y, 1, 2);
        g2d.fillRect(102 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 77 + y, 2, 1);
        g2d.fillRect(106 + x, 78 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 5);
        g2d.fillRect(112 + x, 58 + y, 1, 4);
        g2d.fillRect(106 + x, 59 + y, 1, 4);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(105 + x, 60 + y, 1, 6);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 3);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(108 + x, 62 + y, 1, 3);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 4);
        g2d.fillRect(111 + x, 64 + y, 1, 3);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 4);
        g2d.fillRect(110 + x, 65 + y, 1, 4);
        g2d.fillRect(108 + x, 66 + y, 1, 4);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 8);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(105 + x, 69 + y, 1, 2);
        g2d.fillRect(107 + x, 69 + y, 1, 6);
        g2d.fillRect(111 + x, 69 + y, 1, 3);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 69 + y, 1, 7);
        g2d.fillRect(103 + x, 70 + y, 1, 2);
        g2d.fillRect(104 + x, 70 + y, 1, 3);
        g2d.fillRect(110 + x, 70 + y, 1, 4);
        g2d.fillRect(115 + x, 70 + y, 1, 5);
        g2d.fillRect(109 + x, 71 + y, 1, 3);
        g2d.fillRect(112 + x, 71 + y, 1, 5);
        g2d.fillRect(114 + x, 71 + y, 1, 4);
        g2d.fillRect(117 + x, 71 + y, 1, 3);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 3);
        g2d.fillRect(118 + x, 72 + y, 1, 4);
        g2d.fillRect(119 + x, 72 + y, 1, 3);
        g2d.fillRect(102 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 5);
        g2d.fillRect(104 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 74 + y, 1, 4);
        g2d.fillRect(111 + x, 74 + y, 1, 3);
        g2d.fillRect(109 + x, 75 + y, 1, 3);
        g2d.fillRect(110 + x, 75 + y, 1, 4);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 3);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 4);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 2, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 4);
        g2d.fillRect(113 + x, 65 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 2);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 2, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(114 + x, 75 + y, 2, 1);
        g2d.fillRect(112 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(120 + x, 49 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(106 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 2, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 2, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 47 + y, 2, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(116 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 3, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 48 + y, 1, 7);
        g2d.fillRect(118 + x, 48 + y, 1, 3);
        g2d.fillRect(102 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 4);
        g2d.fillRect(100 + x, 51 + y, 1, 6);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 4);
        g2d.fillRect(119 + x, 51 + y, 1, 5);
        g2d.fillRect(104 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 3);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 4);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 3);
        g2d.fillRect(103 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 3);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 3);
        g2d.fillRect(108 + x, 56 + y, 1, 2);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 51 + y, 1, 3);
        g2d.fillRect(118 + x, 51 + y, 1, 5);
        g2d.fillRect(103 + x, 52 + y, 1, 3);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 5);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 3);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
    }





    public void paintTUB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 45 + y, 1, 3);
        g2d.fillRect(117 + x, 45 + y, 1, 3);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 2, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 6);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 5);
        g2d.fillRect(102 + x, 75 + y, 1, 3);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 2, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 3, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 2, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 6);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 4);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 4);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 4);
        g2d.fillRect(116 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(105 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 73 + y, 1, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 2);
        g2d.fillRect(118 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 2, 1);
        g2d.fillRect(108 + x, 80 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 5);
        g2d.fillRect(112 + x, 58 + y, 1, 4);
        g2d.fillRect(106 + x, 59 + y, 1, 4);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(105 + x, 60 + y, 1, 6);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 3);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(108 + x, 62 + y, 1, 3);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 4);
        g2d.fillRect(111 + x, 64 + y, 1, 3);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 5);
        g2d.fillRect(110 + x, 65 + y, 1, 4);
        g2d.fillRect(108 + x, 66 + y, 1, 5);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 3);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 9);
        g2d.fillRect(114 + x, 68 + y, 1, 10);
        g2d.fillRect(105 + x, 69 + y, 1, 4);
        g2d.fillRect(107 + x, 69 + y, 1, 6);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(115 + x, 69 + y, 2, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 2);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 3);
        g2d.fillRect(104 + x, 71 + y, 1, 4);
        g2d.fillRect(110 + x, 71 + y, 1, 5);
        g2d.fillRect(115 + x, 71 + y, 1, 5);
        g2d.fillRect(109 + x, 72 + y, 1, 5);
        g2d.fillRect(112 + x, 72 + y, 1, 6);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 5);
        g2d.fillRect(106 + x, 74 + y, 1, 5);
        g2d.fillRect(108 + x, 74 + y, 1, 6);
        g2d.fillRect(117 + x, 74 + y, 1, 3);
        g2d.fillRect(118 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 4);
        g2d.fillRect(111 + x, 76 + y, 1, 3);
        g2d.fillRect(110 + x, 77 + y, 1, 3);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 2);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 3);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 4);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 2, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 4);
        g2d.fillRect(113 + x, 65 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 3);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 3);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 2);
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(100 + x, 77 + y, 2, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 4);
        g2d.fillRect(103 + x, 65 + y, 1, 6);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(119 + x, 72 + y, 1, 2);
        g2d.fillRect(102 + x, 74 + y, 1, 1);
        g2d.fillRect(120 + x, 74 + y, 1, 3);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 2, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 3, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 2, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 6);
        g2d.fillRect(103 + x, 61 + y, 1, 4);
        g2d.fillRect(112 + x, 62 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 4);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 3);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 2);
        g2d.fillRect(105 + x, 72 + y, 1, 3);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 2);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 58 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(110 + x, 58 + y, 1, 3);
        g2d.fillRect(111 + x, 58 + y, 1, 5);
        g2d.fillRect(112 + x, 58 + y, 1, 4);
        g2d.fillRect(106 + x, 59 + y, 1, 4);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 3);
        g2d.fillRect(105 + x, 60 + y, 1, 6);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 3);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(108 + x, 62 + y, 1, 3);
        g2d.fillRect(110 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 4);
        g2d.fillRect(111 + x, 64 + y, 1, 3);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 5);
        g2d.fillRect(110 + x, 65 + y, 1, 4);
        g2d.fillRect(108 + x, 66 + y, 1, 5);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 3);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 9);
        g2d.fillRect(114 + x, 68 + y, 1, 8);
        g2d.fillRect(105 + x, 69 + y, 1, 3);
        g2d.fillRect(107 + x, 69 + y, 1, 5);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(115 + x, 69 + y, 2, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 3);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 2);
        g2d.fillRect(104 + x, 71 + y, 1, 3);
        g2d.fillRect(110 + x, 71 + y, 1, 4);
        g2d.fillRect(115 + x, 71 + y, 1, 6);
        g2d.fillRect(109 + x, 72 + y, 1, 3);
        g2d.fillRect(112 + x, 72 + y, 1, 5);
        g2d.fillRect(116 + x, 72 + y, 1, 3);
        g2d.fillRect(106 + x, 73 + y, 1, 6);
        g2d.fillRect(108 + x, 73 + y, 1, 3);
        g2d.fillRect(117 + x, 73 + y, 1, 4);
        g2d.fillRect(118 + x, 73 + y, 1, 3);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 3);
        g2d.fillRect(107 + x, 75 + y, 1, 4);
        g2d.fillRect(111 + x, 75 + y, 1, 3);
        g2d.fillRect(109 + x, 76 + y, 1, 3);
        g2d.fillRect(110 + x, 76 + y, 1, 4);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 2);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 3);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 4);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 2, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 4);
        g2d.fillRect(113 + x, 65 + y, 1, 3);
        g2d.fillRect(105 + x, 66 + y, 1, 3);
        g2d.fillRect(111 + x, 67 + y, 1, 3);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 69 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 2, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
    }
}
