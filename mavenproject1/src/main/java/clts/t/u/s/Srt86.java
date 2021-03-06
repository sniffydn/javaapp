/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt86 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt86()
    {
        super();
        containsTL = true;
    }

    public Srt86(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt86(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        paintTL(x,0,g2d);
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
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {}
    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {}

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
        drawLower(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 47 + y, 2, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(100 + x, 49 + y, 2, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 51 + y, 4, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 6);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(99 + x, 57 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 51 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 47 + y, 1, 6);
        g2d.fillRect(113 + x, 47 + y, 1, 2);
        g2d.fillRect(114 + x, 47 + y, 1, 4);
        g2d.fillRect(115 + x, 47 + y, 1, 7);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 8);
        g2d.fillRect(101 + x, 50 + y, 1, 2);
        g2d.fillRect(104 + x, 50 + y, 2, 1);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(106 + x, 52 + y, 1, 4);
        g2d.fillRect(117 + x, 52 + y, 1, 4);
        g2d.fillRect(119 + x, 52 + y, 1, 6);
        g2d.fillRect(120 + x, 52 + y, 1, 3);
        g2d.fillRect(103 + x, 53 + y, 1, 4);
        g2d.fillRect(114 + x, 54 + y, 1, 7);
        g2d.fillRect(107 + x, 56 + y, 1, 5);
        g2d.fillRect(116 + x, 56 + y, 1, 5);
        g2d.fillRect(118 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 4);
        g2d.fillRect(117 + x, 57 + y, 1, 3);
        g2d.fillRect(102 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(115 + x, 59 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(121 + x, 48 + y, 1, 3);
        g2d.fillRect(122 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 8);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 3);
        g2d.fillRect(104 + x, 51 + y, 1, 6);
        g2d.fillRect(101 + x, 52 + y, 1, 5);
        g2d.fillRect(105 + x, 52 + y, 1, 7);
        g2d.fillRect(118 + x, 52 + y, 1, 4);
        g2d.fillRect(102 + x, 53 + y, 1, 5);
        g2d.fillRect(115 + x, 54 + y, 1, 5);
        g2d.fillRect(106 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(104 + x, 37 + y, 1, 3);
        g2d.fillRect(103 + x, 38 + y, 1, 2);
        g2d.fillRect(112 + x, 39 + y, 2, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 1);
        g2d.fillRect(111 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 2, 1);
        g2d.fillRect(97 + x, 41 + y, 5, 1);
        g2d.fillRect(114 + x, 41 + y, 4, 1);
        g2d.fillRect(95 + x, 42 + y, 2, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(94 + x, 43 + y, 1, 2);
        g2d.fillRect(100 + x, 43 + y, 1, 2);
        g2d.fillRect(116 + x, 43 + y, 1, 3);
        g2d.fillRect(119 + x, 43 + y, 1, 2);
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 4);
        g2d.fillRect(93 + x, 45 + y, 1, 22);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 3);
        g2d.fillRect(114 + x, 45 + y, 1, 2);
        g2d.fillRect(115 + x, 45 + y, 1, 2);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(120 + x, 45 + y, 1, 5);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(98 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 5);
        g2d.fillRect(99 + x, 58 + y, 1, 4);
        g2d.fillRect(102 + x, 60 + y, 1, 15);
        g2d.fillRect(117 + x, 60 + y, 1, 11);
        g2d.fillRect(122 + x, 61 + y, 1, 6);
        g2d.fillRect(98 + x, 62 + y, 1, 8);
        g2d.fillRect(116 + x, 62 + y, 1, 6);
        g2d.fillRect(118 + x, 64 + y, 1, 8);
        g2d.fillRect(103 + x, 65 + y, 1, 7);
        g2d.fillRect(92 + x, 67 + y, 1, 4);
        g2d.fillRect(123 + x, 67 + y, 1, 7);
        g2d.fillRect(110 + x, 69 + y, 1, 6);
        g2d.fillRect(97 + x, 70 + y, 1, 5);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(91 + x, 71 + y, 1, 3);
        g2d.fillRect(119 + x, 72 + y, 1, 5);
        g2d.fillRect(120 + x, 73 + y, 1, 2);
        g2d.fillRect(92 + x, 74 + y, 1, 2);
        g2d.fillRect(121 + x, 74 + y, 1, 2);
        g2d.fillRect(124 + x, 74 + y, 1, 1);
        g2d.fillRect(98 + x, 75 + y, 1, 2);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(111 + x, 75 + y, 1, 2);
        g2d.fillRect(122 + x, 75 + y, 2, 1);
        g2d.fillRect(93 + x, 76 + y, 1, 1);
        g2d.fillRect(95 + x, 77 + y, 3, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 2, 1);
        g2d.fillRect(103 + x, 78 + y, 5, 1);
        g2d.fillRect(113 + x, 78 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(111 + x, 39 + y, 1, 1);
        g2d.fillRect(104 + x, 40 + y, 1, 6);
        g2d.fillRect(112 + x, 40 + y, 1, 4);
        g2d.fillRect(102 + x, 41 + y, 1, 1);
        g2d.fillRect(97 + x, 42 + y, 1, 2);
        g2d.fillRect(98 + x, 42 + y, 4, 1);
        g2d.fillRect(116 + x, 42 + y, 2, 1);
        g2d.fillRect(95 + x, 43 + y, 1, 4);
        g2d.fillRect(96 + x, 43 + y, 1, 3);
        g2d.fillRect(117 + x, 43 + y, 2, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 2);
        g2d.fillRect(94 + x, 45 + y, 1, 24);
        g2d.fillRect(97 + x, 45 + y, 1, 3);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 5);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(98 + x, 47 + y, 1, 3);
        g2d.fillRect(114 + x, 47 + y, 2, 1);
        g2d.fillRect(97 + x, 50 + y, 1, 8);
        g2d.fillRect(98 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 6);
        g2d.fillRect(98 + x, 57 + y, 1, 5);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 5);
        g2d.fillRect(97 + x, 60 + y, 1, 10);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 60 + y, 1, 10);
        g2d.fillRect(105 + x, 60 + y, 1, 3);
        g2d.fillRect(106 + x, 60 + y, 1, 8);
        g2d.fillRect(107 + x, 60 + y, 1, 5);
        g2d.fillRect(114 + x, 60 + y, 1, 4);
        g2d.fillRect(115 + x, 60 + y, 1, 14);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 61 + y, 1, 15);
        g2d.fillRect(121 + x, 61 + y, 1, 6);
        g2d.fillRect(96 + x, 62 + y, 1, 2);
        g2d.fillRect(119 + x, 63 + y, 1, 9);
        g2d.fillRect(112 + x, 64 + y, 1, 3);
        g2d.fillRect(108 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 66 + y, 1, 5);
        g2d.fillRect(93 + x, 67 + y, 1, 9);
        g2d.fillRect(96 + x, 67 + y, 1, 10);
        g2d.fillRect(109 + x, 67 + y, 1, 8);
        g2d.fillRect(111 + x, 67 + y, 1, 8);
        g2d.fillRect(122 + x, 67 + y, 1, 7);
        g2d.fillRect(107 + x, 68 + y, 1, 8);
        g2d.fillRect(116 + x, 68 + y, 1, 2);
        g2d.fillRect(120 + x, 69 + y, 1, 4);
        g2d.fillRect(95 + x, 70 + y, 1, 7);
        g2d.fillRect(106 + x, 70 + y, 1, 4);
        g2d.fillRect(92 + x, 71 + y, 1, 3);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 2, 1);
        g2d.fillRect(103 + x, 72 + y, 1, 4);
        g2d.fillRect(117 + x, 72 + y, 1, 2);
        g2d.fillRect(118 + x, 72 + y, 1, 5);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(97 + x, 75 + y, 1, 2);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 2);
        g2d.fillRect(94 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 2, 1);
        g2d.fillRect(115 + x, 77 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 40 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 4);
        g2d.fillRect(99 + x, 43 + y, 1, 7);
        g2d.fillRect(101 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 2);
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 2, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 1, 4);
        g2d.fillRect(96 + x, 46 + y, 1, 16);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(118 + x, 46 + y, 1, 3);
        g2d.fillRect(95 + x, 47 + y, 1, 23);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 48 + y, 1, 2);
        g2d.fillRect(97 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 59 + y, 1, 4);
        g2d.fillRect(120 + x, 62 + y, 1, 7);
        g2d.fillRect(105 + x, 63 + y, 1, 3);
        g2d.fillRect(96 + x, 64 + y, 1, 3);
        g2d.fillRect(114 + x, 64 + y, 1, 12);
        g2d.fillRect(107 + x, 65 + y, 1, 3);
        g2d.fillRect(108 + x, 67 + y, 1, 2);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(121 + x, 67 + y, 1, 7);
        g2d.fillRect(106 + x, 68 + y, 1, 2);
        g2d.fillRect(94 + x, 69 + y, 1, 7);
        g2d.fillRect(105 + x, 71 + y, 1, 3);
        g2d.fillRect(104 + x, 72 + y, 1, 3);
        g2d.fillRect(116 + x, 72 + y, 1, 2);
        g2d.fillRect(106 + x, 74 + y, 1, 2);
        g2d.fillRect(115 + x, 74 + y, 1, 3);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(122 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 75 + y, 1, 2);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(102 + x, 76 + y, 3, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(103 + x, 42 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 8);
        g2d.fillRect(112 + x, 69 + y, 1, 8);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
    }

}
