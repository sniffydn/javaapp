package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt57 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt57()
    {
        super();
        containsTL = true;
    }

    public Srt57(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt57(String middle, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(91 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 2);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(101 + x, 43 + y, 5, 1);
        g2d.fillRect(104 + x, 44 + y, 2, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 2);
        g2d.fillRect(120 + x, 44 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 2);
        g2d.fillRect(107 + x, 46 + y, 1, 2);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 1);
        g2d.fillRect(92 + x, 57 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(98 + x, 58 + y, 1, 8);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 6);
        g2d.fillRect(118 + x, 59 + y, 1, 3);
        g2d.fillRect(111 + x, 60 + y, 1, 7);
        g2d.fillRect(102 + x, 61 + y, 1, 5);
        g2d.fillRect(103 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(118 + x, 63 + y, 1, 2);
        g2d.fillRect(100 + x, 64 + y, 1, 1);
        g2d.fillRect(117 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 2);
        g2d.fillRect(113 + x, 65 + y, 4, 1);
        g2d.fillRect(103 + x, 66 + y, 4, 1);
        g2d.fillRect(108 + x, 66 + y, 3, 1);
        g2d.fillRect(97 + x, 67 + y, 1, 3);
        g2d.fillRect(96 + x, 70 + y, 1, 6);
        g2d.fillRect(120 + x, 70 + y, 1, 2);
        g2d.fillRect(124 + x, 70 + y, 1, 2);
        g2d.fillRect(125 + x, 71 + y, 1, 2);
        g2d.fillRect(121 + x, 72 + y, 1, 3);
        g2d.fillRect(90 + x, 73 + y, 1, 1);
        g2d.fillRect(95 + x, 73 + y, 1, 1);
        g2d.fillRect(122 + x, 73 + y, 1, 2);
        g2d.fillRect(123 + x, 73 + y, 2, 1);
        g2d.fillRect(91 + x, 74 + y, 4, 1);
        g2d.fillRect(92 + x, 75 + y, 1, 1);
        g2d.fillRect(95 + x, 75 + y, 1, 2);
        g2d.fillRect(121 + x, 76 + y, 2, 1);
        g2d.fillRect(124 + x, 76 + y, 1, 2);
        g2d.fillRect(91 + x, 77 + y, 1, 2);
        g2d.fillRect(92 + x, 77 + y, 1, 2);
        g2d.fillRect(93 + x, 77 + y, 2, 1);
        g2d.fillRect(122 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(96 + x, 42 + y, 1, 2);
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 1, 5);
        g2d.fillRect(99 + x, 42 + y, 1, 6);
        g2d.fillRect(117 + x, 42 + y, 1, 5);
        g2d.fillRect(118 + x, 42 + y, 1, 4);
        g2d.fillRect(119 + x, 42 + y, 1, 3);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 1, 3);
        g2d.fillRect(101 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(116 + x, 44 + y, 1, 4);
        g2d.fillRect(97 + x, 45 + y, 1, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 2);
        g2d.fillRect(114 + x, 45 + y, 1, 2);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 2);
        g2d.fillRect(95 + x, 47 + y, 1, 2);
        g2d.fillRect(106 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 3);
        g2d.fillRect(97 + x, 49 + y, 1, 4);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(98 + x, 56 + y, 1, 2);
        g2d.fillRect(97 + x, 57 + y, 1, 10);
        g2d.fillRect(121 + x, 57 + y, 1, 2);
        g2d.fillRect(96 + x, 58 + y, 1, 2);
        g2d.fillRect(120 + x, 58 + y, 1, 8);
        g2d.fillRect(95 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 6);
        g2d.fillRect(102 + x, 60 + y, 2, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 5);
        g2d.fillRect(114 + x, 60 + y, 4, 1);
        g2d.fillRect(103 + x, 61 + y, 2, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 4);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(113 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 2, 1);
        g2d.fillRect(96 + x, 62 + y, 1, 8);
        g2d.fillRect(104 + x, 62 + y, 1, 3);
        g2d.fillRect(105 + x, 62 + y, 1, 3);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 2);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(95 + x, 64 + y, 1, 9);
        g2d.fillRect(94 + x, 65 + y, 1, 2);
        g2d.fillRect(118 + x, 65 + y, 1, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 5);
        g2d.fillRect(120 + x, 69 + y, 1, 1);
        g2d.fillRect(121 + x, 70 + y, 1, 2);
        g2d.fillRect(94 + x, 72 + y, 1, 2);
        g2d.fillRect(120 + x, 72 + y, 1, 3);
        g2d.fillRect(122 + x, 72 + y, 3, 1);
        g2d.fillRect(93 + x, 73 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 2, 1);
        g2d.fillRect(93 + x, 76 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(120 + x, 43 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 10);
        g2d.fillRect(121 + x, 45 + y, 1, 5);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(122 + x, 49 + y, 1, 11);
        g2d.fillRect(92 + x, 54 + y, 1, 3);
        g2d.fillRect(92 + x, 58 + y, 1, 6);
        g2d.fillRect(93 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(123 + x, 62 + y, 1, 5);
        g2d.fillRect(91 + x, 63 + y, 1, 10);
        g2d.fillRect(95 + x, 63 + y, 1, 1);
        g2d.fillRect(94 + x, 64 + y, 1, 1);
        g2d.fillRect(124 + x, 67 + y, 1, 3);
        g2d.fillRect(92 + x, 68 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(97 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 2, 1);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 2);
        g2d.fillRect(96 + x, 44 + y, 1, 3);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(94 + x, 45 + y, 1, 5);
        g2d.fillRect(104 + x, 45 + y, 2, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 5);
        g2d.fillRect(97 + x, 46 + y, 1, 3);
        g2d.fillRect(100 + x, 46 + y, 1, 2);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 3);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 1);
        g2d.fillRect(95 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(95 + x, 51 + y, 1, 2);
        g2d.fillRect(96 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 51 + y, 1, 2);
        g2d.fillRect(97 + x, 53 + y, 1, 4);
        g2d.fillRect(96 + x, 54 + y, 1, 4);
        g2d.fillRect(93 + x, 55 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 2);
        g2d.fillRect(95 + x, 56 + y, 1, 2);
        g2d.fillRect(93 + x, 57 + y, 1, 3);
        g2d.fillRect(94 + x, 58 + y, 1, 3);
        g2d.fillRect(121 + x, 59 + y, 1, 11);
        g2d.fillRect(95 + x, 60 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 3, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 6);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 2);
        g2d.fillRect(96 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 3, 1);
        g2d.fillRect(95 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 3);
        g2d.fillRect(117 + x, 62 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(92 + x, 64 + y, 2, 1);
        g2d.fillRect(112 + x, 64 + y, 2, 1);
        g2d.fillRect(103 + x, 65 + y, 7, 1);
        g2d.fillRect(119 + x, 65 + y, 1, 1);
        g2d.fillRect(120 + x, 66 + y, 1, 3);
        g2d.fillRect(92 + x, 67 + y, 1, 1);
        g2d.fillRect(94 + x, 67 + y, 1, 5);
        g2d.fillRect(122 + x, 67 + y, 1, 5);
        g2d.fillRect(123 + x, 67 + y, 1, 2);
        g2d.fillRect(93 + x, 70 + y, 1, 3);
        g2d.fillRect(123 + x, 70 + y, 1, 2);
        g2d.fillRect(92 + x, 72 + y, 1, 2);
        g2d.fillRect(91 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 48 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 53 + y, 1, 1);
        g2d.fillRect(95 + x, 55 + y, 1, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 1);
        g2d.fillRect(95 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(95 + x, 61 + y, 1, 1);
        g2d.fillRect(94 + x, 63 + y, 1, 1);
        g2d.fillRect(117 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(93 + x, 65 + y, 1, 1);
        g2d.fillRect(122 + x, 66 + y, 1, 1);
        g2d.fillRect(93 + x, 68 + y, 1, 1);
        g2d.fillRect(123 + x, 69 + y, 1, 1);
        g2d.fillRect(92 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 50 + y, 1, 8);
        g2d.fillRect(95 + x, 53 + y, 1, 2);
        g2d.fillRect(94 + x, 61 + y, 1, 2);
        g2d.fillRect(93 + x, 62 + y, 1, 2);
        g2d.fillRect(122 + x, 62 + y, 1, 4);
        g2d.fillRect(92 + x, 65 + y, 1, 2);
        g2d.fillRect(93 + x, 66 + y, 1, 2);
        g2d.fillRect(93 + x, 69 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(121 + x, 75 + y, 1, 1);
        g2d.fillRect(124 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 41 + y, 2, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 2, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(93 + x, 75 + y, 2, 1);
        g2d.fillRect(122 + x, 75 + y, 2, 1);
        g2d.fillRect(92 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(91 + x, 76 + y, 1, 1);
        g2d.fillRect(123 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(120 + x, 50 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(101 + x, 48 + y, 1, 2);
        g2d.fillRect(102 + x, 48 + y, 1, 4);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 2);
        g2d.fillRect(113 + x, 49 + y, 1, 3);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 7);
        g2d.fillRect(99 + x, 52 + y, 1, 6);
        g2d.fillRect(112 + x, 52 + y, 1, 4);
        g2d.fillRect(110 + x, 53 + y, 1, 3);
        g2d.fillRect(100 + x, 55 + y, 1, 4);
        g2d.fillRect(111 + x, 56 + y, 1, 5);
        g2d.fillRect(101 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 57 + y, 1, 4);
        g2d.fillRect(117 + x, 57 + y, 2, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(105 + x, 47 + y, 2, 1);
        g2d.fillRect(114 + x, 47 + y, 2, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 7);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(100 + x, 53 + y, 4, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 2, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 2);
        g2d.fillRect(117 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 1, 4);
        g2d.fillRect(104 + x, 56 + y, 1, 3);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 3, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(103 + x, 48 + y, 1, 3);
        g2d.fillRect(105 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 3, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(101 + x, 47 + y, 4, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 3);
        g2d.fillRect(117 + x, 47 + y, 1, 2);
        g2d.fillRect(104 + x, 48 + y, 1, 1);
        g2d.fillRect(107 + x, 48 + y, 1, 2);
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 3, 1);
        g2d.fillRect(107 + x, 51 + y, 2, 1);
        g2d.fillRect(114 + x, 51 + y, 2, 1);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 2, 1);
        g2d.fillRect(113 + x, 54 + y, 2, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 2);
        g2d.fillRect(105 + x, 56 + y, 4, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 56 + y, 1, 5);
        g2d.fillRect(113 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 3, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 59 + y, 2, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(100 + x, 52 + y, 3, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 2);
        g2d.fillRect(108 + x, 52 + y, 1, 2);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 3, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(104 + x, 52 + y, 3, 1);
        g2d.fillRect(113 + x, 52 + y, 3, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(117 + x, 49 + y, 3, 1);
        g2d.fillRect(105 + x, 50 + y, 4, 1);
        g2d.fillRect(114 + x, 50 + y, 3, 1);
        g2d.fillRect(100 + x, 54 + y, 3, 1);
        g2d.fillRect(117 + x, 54 + y, 2, 1);
        g2d.fillRect(103 + x, 55 + y, 6, 1);
        g2d.fillRect(113 + x, 55 + y, 4, 1);
    }
}
