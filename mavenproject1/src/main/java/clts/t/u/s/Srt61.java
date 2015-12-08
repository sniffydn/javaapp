package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt61 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt61()
    {
        super();
        containsTL = true;
    }

    public Srt61(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt61(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {

    }
    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {

    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {

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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(95 + x, 51 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(95 + x, 54 + y, 1, 2);
        g2d.fillRect(94 + x, 55 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 2, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 66 + y, 1, 4);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 2, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 4);
        g2d.fillRect(104 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 47 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 2);
        g2d.fillRect(97 + x, 48 + y, 3, 1);
        g2d.fillRect(93 + x, 49 + y, 1, 3);
        g2d.fillRect(94 + x, 50 + y, 1, 2);
        g2d.fillRect(95 + x, 50 + y, 2, 1);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(93 + x, 53 + y, 2, 1);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 1, 1);
        g2d.fillRect(93 + x, 55 + y, 1, 2);
        g2d.fillRect(92 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 1, 2);
        g2d.fillRect(95 + x, 57 + y, 2, 1);
        g2d.fillRect(97 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 62 + y, 1, 3);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 2, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 4, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 2, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 3, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 3);
        g2d.fillRect(115 + x, 76 + y, 5, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 2);
        g2d.fillRect(103 + x, 77 + y, 1, 2);
        g2d.fillRect(109 + x, 77 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(96 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 4, 1);
        g2d.fillRect(94 + x, 49 + y, 2, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 50 + y, 1, 2);
        g2d.fillRect(94 + x, 52 + y, 3, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 2, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 2, 1);
        g2d.fillRect(106 + x, 65 + y, 2, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 2);
        g2d.fillRect(106 + x, 67 + y, 2, 1);
        g2d.fillRect(108 + x, 68 + y, 3, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 72 + y, 2, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 3, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(96 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(97 + x, 54 + y, 1, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 61 + y, 8, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 3, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 3, 1);
        g2d.fillRect(108 + x, 67 + y, 2, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 2);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 2, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 2, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 3, 1);
        g2d.fillRect(104 + x, 75 + y, 2, 1);
        g2d.fillRect(106 + x, 76 + y, 4, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 2, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 2);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(92 + x, 46 + y, 1, 2);
        g2d.fillRect(121 + x, 46 + y, 1, 2);
        g2d.fillRect(93 + x, 47 + y, 1, 2);
        g2d.fillRect(119 + x, 47 + y, 2, 1);
        g2d.fillRect(97 + x, 49 + y, 2, 1);
        g2d.fillRect(93 + x, 52 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 2, 1);
        g2d.fillRect(92 + x, 54 + y, 1, 2);
        g2d.fillRect(93 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 56 + y, 2, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 4);
        g2d.fillRect(114 + x, 60 + y, 4, 1);
        g2d.fillRect(108 + x, 61 + y, 2, 1);
        g2d.fillRect(108 + x, 63 + y, 5, 1);
        g2d.fillRect(111 + x, 64 + y, 4, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(112 + x, 65 + y, 5, 1);
        g2d.fillRect(106 + x, 66 + y, 4, 1);
        g2d.fillRect(115 + x, 66 + y, 1, 2);
        g2d.fillRect(116 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 5, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 2, 1);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 1, 3);
        g2d.fillRect(111 + x, 70 + y, 2, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 3);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 72 + y, 1, 4);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 2, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 3, 1);
        g2d.fillRect(110 + x, 75 + y, 3, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 2, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 2);
        g2d.fillRect(119 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 6, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(92 + x, 48 + y, 1, 6);
        g2d.fillRect(108 + x, 60 + y, 4, 1);
        g2d.fillRect(108 + x, 62 + y, 9, 1);
        g2d.fillRect(113 + x, 63 + y, 4, 1);
        g2d.fillRect(110 + x, 66 + y, 5, 1);
        g2d.fillRect(114 + x, 68 + y, 2, 1);
        g2d.fillRect(109 + x, 69 + y, 4, 1);
        g2d.fillRect(111 + x, 71 + y, 2, 1);
        g2d.fillRect(112 + x, 72 + y, 4, 1);
        g2d.fillRect(115 + x, 73 + y, 4, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 2);
        g2d.fillRect(115 + x, 75 + y, 3, 1);
        g2d.fillRect(110 + x, 76 + y, 3, 1);
        g2d.fillRect(108 + x, 78 + y, 9, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 3, 1);
        g2d.fillRect(113 + x, 51 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 2, 1);
        g2d.fillRect(101 + x, 53 + y, 2, 1);
        g2d.fillRect(104 + x, 54 + y, 2, 1);
        g2d.fillRect(100 + x, 58 + y, 4, 1);
        g2d.fillRect(108 + x, 58 + y, 6, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 3, 1);
        g2d.fillRect(110 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 2, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 3, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 5, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 3, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 2, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 3);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(112 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(121 + x, 48 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 2, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 4, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 2, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 2, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 2, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 3, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 3, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 3, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 2, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 7, 1);
        g2d.fillRect(117 + x, 56 + y, 2, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(101 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 1, 2);
        g2d.fillRect(113 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 2);
        g2d.fillRect(108 + x, 50 + y, 1, 2);
        g2d.fillRect(109 + x, 50 + y, 4, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 2, 1);
        g2d.fillRect(117 + x, 51 + y, 3, 1);
        g2d.fillRect(104 + x, 52 + y, 3, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 3, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 5, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 2, 1);
        g2d.fillRect(110 + x, 60 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(117 + x, 48 + y, 2, 1);
        g2d.fillRect(107 + x, 49 + y, 6, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 2, 1);
        g2d.fillRect(103 + x, 51 + y, 4, 1);
        g2d.fillRect(107 + x, 52 + y, 12, 1);
        g2d.fillRect(113 + x, 53 + y, 4, 1);
        g2d.fillRect(99 + x, 54 + y, 2, 1);
        g2d.fillRect(103 + x, 55 + y, 7, 1);
        g2d.fillRect(110 + x, 57 + y, 4, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 3, 1);
    }
}
