package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt58 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt58()
    {
        super();
        containsTL = true;
    }

    public Srt58(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt58(String middle, ColorArray colorSwitch)
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(96 + x, 50 + y, 1, 17);
        g2d.fillRect(97 + x, 51 + y, 1, 2);
        g2d.fillRect(95 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 2);
        g2d.fillRect(95 + x, 57 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 6);
        g2d.fillRect(95 + x, 60 + y, 1, 14);
        g2d.fillRect(117 + x, 60 + y, 1, 4);
        g2d.fillRect(118 + x, 65 + y, 1, 2);
        g2d.fillRect(120 + x, 65 + y, 1, 2);
        g2d.fillRect(119 + x, 69 + y, 1, 2);
        g2d.fillRect(94 + x, 70 + y, 1, 1);
        g2d.fillRect(121 + x, 70 + y, 1, 1);
        g2d.fillRect(94 + x, 72 + y, 1, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 2);
        g2d.fillRect(96 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(95 + x, 43 + y, 1, 1);
        g2d.fillRect(93 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(95 + x, 42 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 2);
        g2d.fillRect(95 + x, 49 + y, 1, 5);
        g2d.fillRect(94 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(97 + x, 53 + y, 1, 2);
        g2d.fillRect(94 + x, 55 + y, 2, 1);
        g2d.fillRect(95 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 57 + y, 1, 9);
        g2d.fillRect(120 + x, 57 + y, 1, 2);
        g2d.fillRect(98 + x, 58 + y, 1, 3);
        g2d.fillRect(95 + x, 59 + y, 1, 1);
        g2d.fillRect(120 + x, 63 + y, 1, 2);
        g2d.fillRect(119 + x, 64 + y, 1, 2);
        g2d.fillRect(94 + x, 67 + y, 1, 1);
        g2d.fillRect(97 + x, 67 + y, 1, 1);
        g2d.fillRect(120 + x, 67 + y, 1, 3);
        g2d.fillRect(121 + x, 68 + y, 1, 2);
        g2d.fillRect(94 + x, 69 + y, 1, 1);
        g2d.fillRect(94 + x, 71 + y, 1, 1);
        g2d.fillRect(121 + x, 71 + y, 1, 3);
        g2d.fillRect(96 + x, 72 + y, 1, 2);
        g2d.fillRect(122 + x, 72 + y, 1, 3);
        g2d.fillRect(94 + x, 73 + y, 1, 2);
        g2d.fillRect(124 + x, 73 + y, 1, 2);
        g2d.fillRect(123 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 43 + y, 1, 3);
        g2d.fillRect(93 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 48 + y, 1, 3);
        g2d.fillRect(94 + x, 52 + y, 1, 1);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(97 + x, 55 + y, 1, 12);
        g2d.fillRect(121 + x, 55 + y, 1, 3);
        g2d.fillRect(94 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(120 + x, 59 + y, 1, 4);
        g2d.fillRect(121 + x, 63 + y, 1, 2);
        g2d.fillRect(118 + x, 64 + y, 1, 1);
        g2d.fillRect(94 + x, 66 + y, 1, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 1);
        g2d.fillRect(96 + x, 67 + y, 1, 5);
        g2d.fillRect(121 + x, 67 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 1);
        g2d.fillRect(92 + x, 68 + y, 1, 2);
        g2d.fillRect(94 + x, 68 + y, 1, 1);
        g2d.fillRect(119 + x, 68 + y, 1, 1);
        g2d.fillRect(93 + x, 70 + y, 1, 3);
        g2d.fillRect(120 + x, 70 + y, 1, 1);
        g2d.fillRect(122 + x, 70 + y, 1, 2);
        g2d.fillRect(120 + x, 72 + y, 1, 1);
        g2d.fillRect(123 + x, 72 + y, 1, 2);
        g2d.fillRect(92 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(121 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(121 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 1);
        g2d.fillRect(121 + x, 76 + y, 1, 2);
        g2d.fillRect(96 + x, 77 + y, 1, 1);
        g2d.fillRect(93 + x, 78 + y, 1, 1);
        g2d.fillRect(96 + x, 79 + y, 1, 1);
        g2d.fillRect(121 + x, 79 + y, 2, 1);
        g2d.fillRect(94 + x, 80 + y, 1, 1);
        g2d.fillRect(123 + x, 80 + y, 1, 1);
        g2d.fillRect(93 + x, 81 + y, 1, 1);
        g2d.fillRect(95 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(122 + x, 81 + y, 1, 1);
        g2d.fillRect(125 + x, 81 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(92 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(94 + x, 46 + y, 1, 2);
        g2d.fillRect(93 + x, 48 + y, 1, 22);
        g2d.fillRect(121 + x, 58 + y, 1, 5);
        g2d.fillRect(118 + x, 61 + y, 1, 3);
        g2d.fillRect(122 + x, 61 + y, 1, 9);
        g2d.fillRect(121 + x, 65 + y, 1, 2);
        g2d.fillRect(119 + x, 67 + y, 1, 1);
        g2d.fillRect(123 + x, 68 + y, 1, 4);
        g2d.fillRect(92 + x, 70 + y, 1, 3);
        g2d.fillRect(120 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 41 + y, 2, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 4);
        g2d.fillRect(115 + x, 41 + y, 1, 1);
        g2d.fillRect(99 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 3);
        g2d.fillRect(103 + x, 42 + y, 1, 5);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 3);
        g2d.fillRect(95 + x, 44 + y, 1, 3);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(120 + x, 44 + y, 2, 1);
        g2d.fillRect(115 + x, 45 + y, 2, 1);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 46 + y, 1, 2);
        g2d.fillRect(121 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 2, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 48 + y, 3, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(97 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 2, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(92 + x, 75 + y, 1, 4);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(91 + x, 76 + y, 1, 1);
        g2d.fillRect(94 + x, 76 + y, 3, 1);
        g2d.fillRect(93 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(122 + x, 77 + y, 2, 1);
        g2d.fillRect(94 + x, 78 + y, 1, 2);
        g2d.fillRect(95 + x, 78 + y, 3, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(123 + x, 78 + y, 1, 1);
        g2d.fillRect(91 + x, 79 + y, 1, 2);
        g2d.fillRect(93 + x, 79 + y, 1, 2);
        g2d.fillRect(124 + x, 79 + y, 2, 1);
        g2d.fillRect(90 + x, 80 + y, 1, 1);
        g2d.fillRect(95 + x, 80 + y, 2, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(122 + x, 80 + y, 1, 1);
        g2d.fillRect(92 + x, 81 + y, 1, 2);
        g2d.fillRect(94 + x, 81 + y, 1, 1);
        g2d.fillRect(96 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(123 + x, 81 + y, 2, 1);
        g2d.fillRect(126 + x, 81 + y, 1, 1);
        g2d.fillRect(93 + x, 82 + y, 1, 1);
        g2d.fillRect(95 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 41 + y, 1, 6);
        g2d.fillRect(98 + x, 41 + y, 1, 7);
        g2d.fillRect(99 + x, 41 + y, 2, 1);
        g2d.fillRect(116 + x, 41 + y, 3, 1);
        g2d.fillRect(96 + x, 42 + y, 1, 2);
        g2d.fillRect(100 + x, 42 + y, 1, 6);
        g2d.fillRect(101 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(117 + x, 42 + y, 3, 1);
        g2d.fillRect(99 + x, 43 + y, 1, 5);
        g2d.fillRect(116 + x, 43 + y, 1, 2);
        g2d.fillRect(118 + x, 43 + y, 1, 5);
        g2d.fillRect(119 + x, 43 + y, 1, 6);
        g2d.fillRect(120 + x, 43 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 1, 3);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 3);
        g2d.fillRect(120 + x, 45 + y, 1, 1);
        g2d.fillRect(122 + x, 45 + y, 1, 4);
        g2d.fillRect(116 + x, 46 + y, 2, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 1, 2);
        g2d.fillRect(120 + x, 48 + y, 2, 1);
        g2d.fillRect(98 + x, 49 + y, 1, 3);
        g2d.fillRect(121 + x, 49 + y, 1, 2);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(88 + x, 73 + y, 1, 1);
        g2d.fillRect(91 + x, 73 + y, 1, 3);
        g2d.fillRect(93 + x, 73 + y, 1, 1);
        g2d.fillRect(89 + x, 74 + y, 1, 8);
        g2d.fillRect(90 + x, 74 + y, 1, 6);
        g2d.fillRect(92 + x, 74 + y, 1, 1);
        g2d.fillRect(95 + x, 74 + y, 1, 2);
        g2d.fillRect(119 + x, 74 + y, 1, 1);
        g2d.fillRect(125 + x, 74 + y, 1, 2);
        g2d.fillRect(126 + x, 74 + y, 2, 1);
        g2d.fillRect(88 + x, 75 + y, 1, 2);
        g2d.fillRect(93 + x, 75 + y, 1, 2);
        g2d.fillRect(94 + x, 75 + y, 1, 1);
        g2d.fillRect(96 + x, 75 + y, 2, 1);
        g2d.fillRect(121 + x, 75 + y, 1, 1);
        g2d.fillRect(123 + x, 75 + y, 1, 2);
        g2d.fillRect(124 + x, 75 + y, 1, 4);
        g2d.fillRect(120 + x, 76 + y, 1, 1);
        g2d.fillRect(122 + x, 76 + y, 1, 1);
        g2d.fillRect(126 + x, 76 + y, 1, 5);
        g2d.fillRect(127 + x, 76 + y, 1, 4);
        g2d.fillRect(128 + x, 76 + y, 1, 1);
        g2d.fillRect(91 + x, 77 + y, 1, 2);
        g2d.fillRect(94 + x, 77 + y, 2, 1);
        g2d.fillRect(88 + x, 78 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(122 + x, 78 + y, 1, 1);
        g2d.fillRect(125 + x, 78 + y, 1, 1);
        g2d.fillRect(92 + x, 79 + y, 1, 2);
        g2d.fillRect(95 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 1);
        g2d.fillRect(123 + x, 79 + y, 1, 1);
        g2d.fillRect(88 + x, 80 + y, 1, 2);
        g2d.fillRect(121 + x, 80 + y, 1, 1);
        g2d.fillRect(124 + x, 80 + y, 2, 1);
        g2d.fillRect(128 + x, 80 + y, 1, 1);
        g2d.fillRect(90 + x, 81 + y, 1, 2);
        g2d.fillRect(91 + x, 81 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(99 + x, 53 + y, 1, 2);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 2);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(101 + x, 55 + y, 2, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 2, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(105 + x, 58 + y, 1, 2);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 3, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 3, 1);
        g2d.fillRect(116 + x, 58 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 2);
        g2d.fillRect(105 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 2, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 2);
        g2d.fillRect(114 + x, 52 + y, 1, 3);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 56 + y, 2, 1);
        g2d.fillRect(101 + x, 57 + y, 3, 1);
        g2d.fillRect(117 + x, 57 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(102 + x, 47 + y, 3, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 50 + y, 2, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 3);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 2, 1);
        g2d.fillRect(113 + x, 55 + y, 2, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 47 + y, 1, 5);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 6);
        g2d.fillRect(102 + x, 48 + y, 1, 5);
        g2d.fillRect(103 + x, 48 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 8);
        g2d.fillRect(118 + x, 48 + y, 1, 7);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 5);
        g2d.fillRect(103 + x, 50 + y, 1, 6);
        g2d.fillRect(116 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 4);
        g2d.fillRect(116 + x, 53 + y, 1, 4);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
    }
}
