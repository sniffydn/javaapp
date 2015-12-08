package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt62 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt62()
    {
        super();
        containsTL = true;
    }

    public Srt62(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt62(String middle, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 40 + y, 1, 2);
        g2d.fillRect(102 + x, 40 + y, 2, 1);
        g2d.fillRect(113 + x, 40 + y, 3, 1);
        g2d.fillRect(103 + x, 41 + y, 3, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(118 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 42 + y, 1, 3);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(105 + x, 42 + y, 3, 1);
        g2d.fillRect(116 + x, 42 + y, 1, 3);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(107 + x, 43 + y, 1, 1);
        g2d.fillRect(111 + x, 43 + y, 1, 2);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 3, 1);
        g2d.fillRect(105 + x, 44 + y, 1, 2);
        g2d.fillRect(108 + x, 44 + y, 1, 4);
        g2d.fillRect(115 + x, 44 + y, 1, 2);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(109 + x, 46 + y, 1, 2);
        g2d.fillRect(112 + x, 46 + y, 3, 1);
        g2d.fillRect(110 + x, 47 + y, 1, 4);
        g2d.fillRect(111 + x, 47 + y, 1, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 19);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(120 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(97 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 2, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(97 + x, 41 + y, 4, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 41 + y, 1, 3);
        g2d.fillRect(117 + x, 41 + y, 1, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(101 + x, 42 + y, 1, 2);
        g2d.fillRect(112 + x, 42 + y, 1, 4);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 4, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 2);
        g2d.fillRect(104 + x, 44 + y, 1, 1);
        g2d.fillRect(107 + x, 44 + y, 1, 4);
        g2d.fillRect(114 + x, 44 + y, 1, 2);
        g2d.fillRect(120 + x, 44 + y, 1, 7);
        g2d.fillRect(93 + x, 45 + y, 1, 19);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(111 + x, 45 + y, 1, 2);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 47 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(111 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(98 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 6);
        g2d.fillRect(98 + x, 56 + y, 1, 6);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 3);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 6);
        g2d.fillRect(103 + x, 59 + y, 1, 18);
        g2d.fillRect(114 + x, 59 + y, 1, 2);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(97 + x, 60 + y, 1, 8);
        g2d.fillRect(104 + x, 60 + y, 1, 5);
        g2d.fillRect(105 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 3);
        g2d.fillRect(116 + x, 60 + y, 1, 8);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(92 + x, 61 + y, 1, 10);
        g2d.fillRect(111 + x, 61 + y, 1, 5);
        g2d.fillRect(122 + x, 61 + y, 1, 4);
        g2d.fillRect(118 + x, 63 + y, 1, 4);
        g2d.fillRect(96 + x, 64 + y, 1, 13);
        g2d.fillRect(119 + x, 65 + y, 1, 10);
        g2d.fillRect(123 + x, 65 + y, 1, 5);
        g2d.fillRect(104 + x, 66 + y, 1, 3);
        g2d.fillRect(95 + x, 67 + y, 1, 6);
        g2d.fillRect(111 + x, 67 + y, 1, 7);
        g2d.fillRect(117 + x, 67 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 6);
        g2d.fillRect(120 + x, 70 + y, 1, 2);
        g2d.fillRect(121 + x, 70 + y, 1, 6);
        g2d.fillRect(90 + x, 71 + y, 1, 5);
        g2d.fillRect(91 + x, 71 + y, 1, 1);
        g2d.fillRect(93 + x, 71 + y, 2, 1);
        g2d.fillRect(102 + x, 71 + y, 1, 6);
        g2d.fillRect(123 + x, 71 + y, 3, 1);
        g2d.fillRect(122 + x, 72 + y, 1, 1);
        g2d.fillRect(124 + x, 72 + y, 1, 3);
        g2d.fillRect(125 + x, 72 + y, 1, 3);
        g2d.fillRect(97 + x, 73 + y, 1, 2);
        g2d.fillRect(101 + x, 73 + y, 1, 3);
        g2d.fillRect(120 + x, 73 + y, 1, 1);
        g2d.fillRect(91 + x, 74 + y, 1, 2);
        g2d.fillRect(92 + x, 74 + y, 1, 2);
        g2d.fillRect(93 + x, 74 + y, 1, 3);
        g2d.fillRect(107 + x, 74 + y, 1, 3);
        g2d.fillRect(108 + x, 74 + y, 1, 3);
        g2d.fillRect(109 + x, 74 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 1, 3);
        g2d.fillRect(117 + x, 74 + y, 1, 3);
        g2d.fillRect(94 + x, 75 + y, 1, 2);
        g2d.fillRect(95 + x, 75 + y, 1, 2);
        g2d.fillRect(104 + x, 75 + y, 1, 3);
        g2d.fillRect(106 + x, 75 + y, 1, 3);
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 2);
        g2d.fillRect(122 + x, 75 + y, 2, 1);
        g2d.fillRect(97 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 2);
        g2d.fillRect(115 + x, 76 + y, 1, 2);
        g2d.fillRect(116 + x, 76 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 41 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 2, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(99 + x, 43 + y, 1, 1);
        g2d.fillRect(106 + x, 43 + y, 1, 2);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 6);
        g2d.fillRect(117 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 19);
        g2d.fillRect(103 + x, 45 + y, 1, 2);
        g2d.fillRect(116 + x, 45 + y, 1, 3);
        g2d.fillRect(119 + x, 45 + y, 1, 5);
        g2d.fillRect(102 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 1);
        g2d.fillRect(109 + x, 48 + y, 1, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 9);
        g2d.fillRect(120 + x, 57 + y, 1, 4);
        g2d.fillRect(112 + x, 58 + y, 1, 9);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(96 + x, 59 + y, 1, 5);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 6);
        g2d.fillRect(118 + x, 60 + y, 1, 3);
        g2d.fillRect(121 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 63 + y, 1, 5);
        g2d.fillRect(119 + x, 63 + y, 1, 2);
        g2d.fillRect(93 + x, 64 + y, 1, 3);
        g2d.fillRect(95 + x, 64 + y, 1, 3);
        g2d.fillRect(104 + x, 65 + y, 2, 1);
        g2d.fillRect(120 + x, 65 + y, 1, 5);
        g2d.fillRect(122 + x, 65 + y, 1, 6);
        g2d.fillRect(105 + x, 66 + y, 1, 10);
        g2d.fillRect(94 + x, 68 + y, 1, 3);
        g2d.fillRect(116 + x, 68 + y, 1, 8);
        g2d.fillRect(104 + x, 69 + y, 1, 6);
        g2d.fillRect(123 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 4);
        g2d.fillRect(94 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 2);
        g2d.fillRect(117 + x, 72 + y, 1, 2);
        g2d.fillRect(123 + x, 72 + y, 1, 3);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 3);
        g2d.fillRect(115 + x, 73 + y, 1, 3);
        g2d.fillRect(113 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(114 + x, 41 + y, 1, 3);
        g2d.fillRect(97 + x, 42 + y, 1, 9);
        g2d.fillRect(98 + x, 42 + y, 1, 7);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 16);
        g2d.fillRect(95 + x, 44 + y, 1, 20);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 1, 3);
        g2d.fillRect(100 + x, 45 + y, 1, 2);
        g2d.fillRect(101 + x, 45 + y, 1, 3);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(102 + x, 47 + y, 2, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 3);
        g2d.fillRect(108 + x, 58 + y, 1, 15);
        g2d.fillRect(107 + x, 59 + y, 1, 13);
        g2d.fillRect(113 + x, 59 + y, 1, 15);
        g2d.fillRect(119 + x, 59 + y, 1, 4);
        g2d.fillRect(114 + x, 61 + y, 1, 12);
        g2d.fillRect(120 + x, 61 + y, 1, 4);
        g2d.fillRect(106 + x, 62 + y, 1, 9);
        g2d.fillRect(105 + x, 63 + y, 1, 2);
        g2d.fillRect(94 + x, 64 + y, 1, 4);
        g2d.fillRect(121 + x, 64 + y, 1, 6);
        g2d.fillRect(109 + x, 66 + y, 1, 8);
        g2d.fillRect(93 + x, 67 + y, 1, 4);
        g2d.fillRect(112 + x, 67 + y, 1, 7);
        g2d.fillRect(115 + x, 68 + y, 1, 5);
        g2d.fillRect(92 + x, 71 + y, 1, 3);
        g2d.fillRect(122 + x, 71 + y, 1, 1);
        g2d.fillRect(91 + x, 72 + y, 1, 2);
        g2d.fillRect(93 + x, 72 + y, 1, 2);
        g2d.fillRect(94 + x, 73 + y, 1, 2);
        g2d.fillRect(95 + x, 73 + y, 1, 2);
        g2d.fillRect(122 + x, 73 + y, 1, 2);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(107 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 7);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(111 + x, 49 + y, 1, 9);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(117 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(102 + x, 59 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 47 + y, 2, 1);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 47 + y, 2, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 3);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 3, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(108 + x, 49 + y, 1, 2);
        g2d.fillRect(109 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 7);
        g2d.fillRect(99 + x, 51 + y, 1, 5);
        g2d.fillRect(120 + x, 51 + y, 1, 4);
        g2d.fillRect(112 + x, 54 + y, 1, 5);
        g2d.fillRect(100 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 3);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 3);
        g2d.fillRect(105 + x, 57 + y, 1, 3);
        g2d.fillRect(106 + x, 57 + y, 1, 3);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(115 + x, 57 + y, 1, 3);
        g2d.fillRect(116 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 47 + y, 4, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 10);
        g2d.fillRect(117 + x, 47 + y, 1, 9);
        g2d.fillRect(102 + x, 48 + y, 1, 9);
        g2d.fillRect(103 + x, 48 + y, 1, 9);
        g2d.fillRect(104 + x, 48 + y, 1, 9);
        g2d.fillRect(105 + x, 48 + y, 1, 9);
        g2d.fillRect(114 + x, 48 + y, 1, 9);
        g2d.fillRect(115 + x, 48 + y, 1, 9);
        g2d.fillRect(101 + x, 49 + y, 1, 7);
        g2d.fillRect(106 + x, 49 + y, 1, 8);
        g2d.fillRect(107 + x, 49 + y, 1, 7);
        g2d.fillRect(113 + x, 49 + y, 1, 11);
        g2d.fillRect(118 + x, 50 + y, 1, 5);
        g2d.fillRect(100 + x, 51 + y, 1, 4);
        g2d.fillRect(108 + x, 51 + y, 1, 8);
        g2d.fillRect(109 + x, 51 + y, 1, 7);
        g2d.fillRect(112 + x, 51 + y, 1, 3);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
    }
}
