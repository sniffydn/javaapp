package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt59 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt59()
    {
        super();
        containsTL = true;
    }

    public Srt59(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt59(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
    }


    public void drawB(int x, int y, GraphicsMap g2d)
    {
        paintTU(x,y,g2d);
        paintTL(x,0,g2d);
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

    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 2);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(100 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(105 + x, 78 + y, 1, 3);
        g2d.fillRect(119 + x, 78 + y, 1, 2);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(111 + x, 58 + y, 1, 2);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 1, 5);
        g2d.fillRect(108 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(112 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 2, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 3);
        g2d.fillRect(116 + x, 64 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 66 + y, 1, 5);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 4);
        g2d.fillRect(118 + x, 70 + y, 1, 2);
        g2d.fillRect(113 + x, 71 + y, 3, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 4);
        g2d.fillRect(116 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 2);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 3);
        g2d.fillRect(100 + x, 78 + y, 2, 1);
        g2d.fillRect(111 + x, 78 + y, 2, 1);
        g2d.fillRect(116 + x, 78 + y, 2, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 2, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 2);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 2, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 5);
        g2d.fillRect(108 + x, 60 + y, 4, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 3);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 2);
        g2d.fillRect(104 + x, 62 + y, 1, 5);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 63 + y, 1, 3);
        g2d.fillRect(108 + x, 64 + y, 1, 11);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(103 + x, 67 + y, 1, 5);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 2);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(102 + x, 72 + y, 1, 3);
        g2d.fillRect(106 + x, 72 + y, 1, 2);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(119 + x, 72 + y, 1, 3);
        g2d.fillRect(101 + x, 75 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 2);
        g2d.fillRect(120 + x, 75 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 2, 1);
        g2d.fillRect(108 + x, 76 + y, 2, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 2);
        g2d.fillRect(102 + x, 78 + y, 2, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 2);
        g2d.fillRect(106 + x, 63 + y, 1, 9);
        g2d.fillRect(115 + x, 63 + y, 1, 4);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 1, 5);
        g2d.fillRect(116 + x, 66 + y, 1, 5);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 4);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 4);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 3);
        g2d.fillRect(110 + x, 73 + y, 1, 3);
        g2d.fillRect(114 + x, 73 + y, 2, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(102 + x, 75 + y, 1, 2);
        g2d.fillRect(112 + x, 75 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 2);
        g2d.fillRect(120 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 2, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 4);
        g2d.fillRect(114 + x, 67 + y, 2, 1);
        g2d.fillRect(114 + x, 69 + y, 2, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 5);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 2, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 74 + y, 1, 2);
        g2d.fillRect(104 + x, 75 + y, 1, 4);
        g2d.fillRect(108 + x, 75 + y, 2, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 2);
        g2d.fillRect(101 + x, 77 + y, 3, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 3);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 3);
        g2d.fillRect(115 + x, 77 + y, 1, 2);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 2);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 5);
        g2d.fillRect(113 + x, 67 + y, 1, 3);
        g2d.fillRect(105 + x, 68 + y, 1, 5);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 3);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 2);
        g2d.fillRect(114 + x, 81 + y, 1, 2);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(116 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 50 + y, 1, 4);
        g2d.fillRect(121 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 2);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 55 + y, 2, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 2, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 3, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 5);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 52 + y, 1, 5);
        g2d.fillRect(103 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(104 + x, 53 + y, 1, 2);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 3);
        g2d.fillRect(116 + x, 54 + y, 3, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 5);
        g2d.fillRect(106 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 6, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 1, 2);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 3, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 4, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 3, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 3);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 4, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 3, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 4, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
    }
}
