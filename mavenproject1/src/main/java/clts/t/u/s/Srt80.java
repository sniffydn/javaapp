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
public class Srt80 extends SuperTU
{
    /** Creates a new instance of GenericClothes */
    boolean switcher = false;

    public Srt80()
    {
        super();
        containsTL = true;
    }

    public Srt80(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt80(String middle, ColorArray colorSwitch)
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

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, offsetY, g2d);
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(104 + x, 48 + y, 1, 8);
        g2d.fillRect(116 + x, 48 + y, 1, 8);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 3);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(105 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 1, 2);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(114 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 48 + y, 1, 8);
        g2d.fillRect(117 + x, 48 + y, 1, 8);
        g2d.fillRect(100 + x, 49 + y, 1, 3);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 5);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(104 + x, 56 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 3);
        g2d.fillRect(115 + x, 58 + y, 1, 3);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 8);
        g2d.fillRect(101 + x, 49 + y, 1, 3);
        g2d.fillRect(118 + x, 50 + y, 1, 8);
        g2d.fillRect(100 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 52 + y, 1, 4);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 52 + y, 1, 5);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 52 + y, 2, 1);
        g2d.fillRect(114 + x, 52 + y, 2, 1);
        g2d.fillRect(105 + x, 55 + y, 2, 1);
        g2d.fillRect(114 + x, 55 + y, 2, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 52 + y, 2, 1);
        g2d.fillRect(111 + x, 52 + y, 2, 1);
        g2d.fillRect(108 + x, 55 + y, 2, 1);
        g2d.fillRect(111 + x, 55 + y, 2, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 41 + y, 8, 1);
        g2d.fillRect(108 + x, 42 + y, 2, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(106 + x, 43 + y, 2, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 3);
        g2d.fillRect(104 + x, 44 + y, 2, 1);
        g2d.fillRect(107 + x, 44 + y, 6, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 45 + y, 2, 1);
        g2d.fillRect(102 + x, 46 + y, 1, 2);
        g2d.fillRect(105 + x, 46 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 46 + y, 1, 5);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 55 + y, 1, 6);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 5);
        g2d.fillRect(107 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 4);
        g2d.fillRect(122 + x, 61 + y, 1, 6);
        g2d.fillRect(108 + x, 62 + y, 1, 2);
        g2d.fillRect(112 + x, 62 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 4);
        g2d.fillRect(118 + x, 64 + y, 1, 2);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 6);
        g2d.fillRect(123 + x, 67 + y, 1, 7);
        g2d.fillRect(114 + x, 68 + y, 2, 1);
        g2d.fillRect(112 + x, 69 + y, 2, 1);
        g2d.fillRect(110 + x, 70 + y, 2, 1);
        g2d.fillRect(108 + x, 71 + y, 2, 1);
        g2d.fillRect(106 + x, 72 + y, 2, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 4);
        g2d.fillRect(102 + x, 73 + y, 1, 3);
        g2d.fillRect(104 + x, 73 + y, 2, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(124 + x, 74 + y, 1, 3);
        g2d.fillRect(117 + x, 76 + y, 1, 4);
        g2d.fillRect(122 + x, 76 + y, 2, 1);
        g2d.fillRect(120 + x, 77 + y, 2, 1);
        g2d.fillRect(118 + x, 78 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 42 + y, 1, 2);
        g2d.fillRect(111 + x, 42 + y, 1, 2);
        g2d.fillRect(112 + x, 42 + y, 1, 2);
        g2d.fillRect(113 + x, 42 + y, 5, 1);
        g2d.fillRect(108 + x, 43 + y, 2, 1);
        g2d.fillRect(118 + x, 43 + y, 1, 3);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(113 + x, 44 + y, 2, 1);
        g2d.fillRect(104 + x, 45 + y, 1, 3);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 2, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 4);
        g2d.fillRect(117 + x, 47 + y, 2, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 4);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 5);
        g2d.fillRect(103 + x, 60 + y, 1, 5);
        g2d.fillRect(105 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 3);
        g2d.fillRect(121 + x, 61 + y, 1, 6);
        g2d.fillRect(107 + x, 62 + y, 1, 2);
        g2d.fillRect(113 + x, 62 + y, 1, 2);
        g2d.fillRect(108 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 4);
        g2d.fillRect(119 + x, 64 + y, 1, 2);
        g2d.fillRect(104 + x, 65 + y, 1, 8);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 2);
        g2d.fillRect(120 + x, 66 + y, 1, 6);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(122 + x, 67 + y, 1, 7);
        g2d.fillRect(112 + x, 68 + y, 2, 1);
        g2d.fillRect(110 + x, 69 + y, 2, 1);
        g2d.fillRect(108 + x, 70 + y, 2, 1);
        g2d.fillRect(106 + x, 71 + y, 2, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 4);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(123 + x, 74 + y, 1, 2);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 2);
        g2d.fillRect(120 + x, 76 + y, 2, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(113 + x, 43 + y, 5, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 2);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 5);
        g2d.fillRect(119 + x, 60 + y, 1, 4);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 3);
        g2d.fillRect(120 + x, 61 + y, 1, 5);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(114 + x, 62 + y, 1, 5);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 7);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 1, 1);
        g2d.fillRect(109 + x, 66 + y, 1, 2);
        g2d.fillRect(111 + x, 66 + y, 1, 3);
        g2d.fillRect(112 + x, 67 + y, 2, 1);
        g2d.fillRect(121 + x, 67 + y, 1, 7);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 2, 1);
        g2d.fillRect(106 + x, 70 + y, 2, 1);
        g2d.fillRect(120 + x, 72 + y, 1, 4);
        g2d.fillRect(122 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 3);
        g2d.fillRect(106 + x, 64 + y, 1, 6);
        g2d.fillRect(107 + x, 65 + y, 1, 5);
        g2d.fillRect(113 + x, 65 + y, 1, 2);
        g2d.fillRect(108 + x, 66 + y, 1, 3);
        g2d.fillRect(112 + x, 66 + y, 1, 1);
        g2d.fillRect(109 + x, 68 + y, 1, 1);
        g2d.fillRect(121 + x, 74 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 61 + y, 1, 1);
    }
}
