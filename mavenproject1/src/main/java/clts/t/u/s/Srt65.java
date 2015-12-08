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
public class Srt65 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt65()
    {
        super();
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Srt65(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = true;
        drs = true;
    }

    public Srt65(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = true;
        drs = true;
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

        if(prevY == 1)
        {
            paintB1(x, 0, g2d);
        }
        else if(prevY == -1)
        {
            paintB3(x, 0, g2d);
        }
        else
        {
            paintB2(x, 0, g2d);
        }

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

    public void paintB3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(99 + x, 84 + y, 2, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 4);
        g2d.fillRect(99 + x, 87 + y, 1, 3);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 91 + y, 1, 4);
        g2d.fillRect(116 + x, 92 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 2);
        g2d.fillRect(111 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 2);
        g2d.fillRect(119 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(101 + x, 78 + y, 1, 2);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 79 + y, 1, 4);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(114 + x, 81 + y, 1, 4);
        g2d.fillRect(122 + x, 81 + y, 1, 2);
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(123 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 4);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 2);
        g2d.fillRect(124 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(125 + x, 86 + y, 1, 3);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 4);
        g2d.fillRect(126 + x, 88 + y, 1, 4);
        g2d.fillRect(100 + x, 89 + y, 1, 3);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 90 + y, 1, 6);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(127 + x, 90 + y, 1, 3);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(122 + x, 92 + y, 2, 1);
        g2d.fillRect(123 + x, 93 + y, 2, 1);
        g2d.fillRect(128 + x, 93 + y, 1, 3);
        g2d.fillRect(98 + x, 94 + y, 1, 3);
        g2d.fillRect(100 + x, 94 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 2);
        g2d.fillRect(110 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 94 + y, 2, 1);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(125 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(106 + x, 95 + y, 1, 2);
        g2d.fillRect(108 + x, 95 + y, 2, 1);
        g2d.fillRect(114 + x, 95 + y, 3, 1);
        g2d.fillRect(119 + x, 95 + y, 2, 1);
        g2d.fillRect(127 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 2);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(102 + x, 97 + y, 2, 1);
        g2d.fillRect(97 + x, 98 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(102 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 78 + y, 2, 1);
        g2d.fillRect(111 + x, 78 + y, 3, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 2);
        g2d.fillRect(124 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(126 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 78 + y, 1, 3);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 3);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 2, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(118 + x, 79 + y, 1, 2);
        g2d.fillRect(119 + x, 79 + y, 2, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 7);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 3, 1);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 3);
        g2d.fillRect(123 + x, 84 + y, 1, 2);
        g2d.fillRect(113 + x, 85 + y, 1, 4);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 7);
        g2d.fillRect(124 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 3);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 5);
        g2d.fillRect(109 + x, 88 + y, 1, 4);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(124 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 4);
        g2d.fillRect(122 + x, 90 + y, 1, 2);
        g2d.fillRect(123 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(124 + x, 91 + y, 1, 2);
        g2d.fillRect(125 + x, 91 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 2);
        g2d.fillRect(126 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 2, 1);
        g2d.fillRect(111 + x, 93 + y, 2, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 2);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(125 + x, 93 + y, 1, 1);
        g2d.fillRect(127 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 3);
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 2);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 2);
        g2d.fillRect(107 + x, 79 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 2);
        g2d.fillRect(112 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 3);
        g2d.fillRect(108 + x, 80 + y, 3, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 6);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 3, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 4);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 5);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 89 + y, 1, 3);
        g2d.fillRect(123 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(124 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(111 + x, 92 + y, 2, 1);
        g2d.fillRect(103 + x, 93 + y, 4, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(125 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 1);
        g2d.fillRect(125 + x, 92 + y, 1, 1);
        g2d.fillRect(126 + x, 94 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(122 + x, 83 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 86 + y, 3, 1);
        g2d.fillRect(123 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(101 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 92 + y, 2, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 2, 1);
        g2d.fillRect(103 + x, 83 + y, 2, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 1, 3);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(113 + x, 93 + y, 2, 1);
        g2d.fillRect(101 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(107 + x, 85 + y, 2, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(114 + x, 43 + y, 2, 1);
        g2d.fillRect(112 + x, 44 + y, 2, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(110 + x, 45 + y, 2, 1);
        g2d.fillRect(108 + x, 46 + y, 2, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 2);
        g2d.fillRect(106 + x, 47 + y, 2, 1);
        g2d.fillRect(104 + x, 48 + y, 2, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 2, 1);
        g2d.fillRect(111 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 2);
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(98 + x, 53 + y, 1, 4);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 3, 1);
        g2d.fillRect(115 + x, 59 + y, 4, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(115 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 2);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(114 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 50 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(114 + x, 44 + y, 2, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 3);
        g2d.fillRect(112 + x, 46 + y, 2, 1);
        g2d.fillRect(110 + x, 47 + y, 2, 1);
        g2d.fillRect(113 + x, 47 + y, 2, 1);
        g2d.fillRect(108 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 49 + y, 2, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 50 + y, 3, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 2);
        g2d.fillRect(103 + x, 52 + y, 1, 3);
        g2d.fillRect(104 + x, 52 + y, 2, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 3);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 54 + y, 2, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(101 + x, 57 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 1, 2);
        g2d.fillRect(108 + x, 57 + y, 2, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 2);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 2, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 2, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 45 + y, 3, 1);
        g2d.fillRect(109 + x, 48 + y, 1, 3);
        g2d.fillRect(110 + x, 48 + y, 1, 2);
        g2d.fillRect(111 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 2);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 3);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 2);
        g2d.fillRect(114 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 2);
        g2d.fillRect(110 + x, 51 + y, 1, 2);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 52 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 2);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 2);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(100 + x, 55 + y, 5, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 3, 1);
        g2d.fillRect(108 + x, 56 + y, 2, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 3);
        g2d.fillRect(114 + x, 56 + y, 2, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 46 + y, 2, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(116 + x, 46 + y, 1, 2);
        g2d.fillRect(108 + x, 47 + y, 2, 1);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 48 + y, 2, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 2);
        g2d.fillRect(104 + x, 49 + y, 2, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 2);
        g2d.fillRect(107 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 2);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 2, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 2);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 54 + y, 2, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 1, 2);
        g2d.fillRect(111 + x, 55 + y, 1, 3);
        g2d.fillRect(114 + x, 55 + y, 2, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(117 + x, 41 + y, 1, 3);
        g2d.fillRect(116 + x, 42 + y, 1, 1);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(95 + x, 53 + y, 1, 2);
        g2d.fillRect(96 + x, 53 + y, 2, 1);
        g2d.fillRect(94 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 55 + y, 1, 2);
        g2d.fillRect(97 + x, 55 + y, 1, 1);
        g2d.fillRect(94 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 2);
        g2d.fillRect(101 + x, 59 + y, 1, 4);
        g2d.fillRect(116 + x, 60 + y, 2, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 4);
        g2d.fillRect(102 + x, 63 + y, 1, 2);
        g2d.fillRect(103 + x, 65 + y, 1, 8);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 2, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 2);
        g2d.fillRect(102 + x, 73 + y, 1, 4);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(120 + x, 76 + y, 1, 2);
        g2d.fillRect(101 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(106 + x, 67 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 1, 4);
        g2d.fillRect(108 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 65 + y, 1, 2);
        g2d.fillRect(112 + x, 69 + y, 1, 2);
        g2d.fillRect(110 + x, 70 + y, 2, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 75 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(94 + x, 52 + y, 3, 1);
        g2d.fillRect(93 + x, 54 + y, 1, 1);
        g2d.fillRect(96 + x, 54 + y, 2, 1);
        g2d.fillRect(94 + x, 55 + y, 2, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(94 + x, 57 + y, 2, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 3);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 1, 3);
        g2d.fillRect(106 + x, 63 + y, 2, 1);
        g2d.fillRect(112 + x, 63 + y, 2, 1);
        g2d.fillRect(107 + x, 64 + y, 2, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 7);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 3);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 3, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 2);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 2);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 77 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(94 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 59 + y, 4, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 61 + y, 2, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 2, 1);
        g2d.fillRect(106 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 3);
        g2d.fillRect(107 + x, 66 + y, 1, 3);
        g2d.fillRect(114 + x, 66 + y, 2, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 4, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 2);
        g2d.fillRect(109 + x, 70 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 2, 1);
        g2d.fillRect(110 + x, 71 + y, 2, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 3, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 74 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 2, 1);
        g2d.fillRect(113 + x, 74 + y, 2, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 3);
        g2d.fillRect(103 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 2, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 3);
        g2d.fillRect(112 + x, 76 + y, 2, 1);
        g2d.fillRect(116 + x, 76 + y, 2, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(93 + x, 53 + y, 1, 1);
        g2d.fillRect(93 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 57 + y, 1, 2);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 2, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 2, 1);
        g2d.fillRect(105 + x, 69 + y, 2, 1);
        g2d.fillRect(112 + x, 71 + y, 3, 1);
        g2d.fillRect(104 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 2);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 2, 1);
        g2d.fillRect(110 + x, 74 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 3);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(108 + x, 68 + y, 3, 1);
        g2d.fillRect(110 + x, 69 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 2, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 2);
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 62 + y, 1, 2);
        g2d.fillRect(110 + x, 62 + y, 4, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(112 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 2);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 76 + y, 3, 1);
        g2d.fillRect(111 + x, 77 + y, 4, 1);
    }





    public void paintB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(99 + x, 85 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 4);
        g2d.fillRect(100 + x, 88 + y, 1, 3);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 94 + y, 2, 1);
        g2d.fillRect(110 + x, 95 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(101 + x, 78 + y, 1, 2);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(121 + x, 79 + y, 1, 5);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(122 + x, 82 + y, 1, 3);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(123 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 87 + y, 1, 7);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 3);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(123 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 8);
        g2d.fillRect(120 + x, 91 + y, 1, 3);
        g2d.fillRect(109 + x, 92 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(125 + x, 92 + y, 1, 6);
        g2d.fillRect(110 + x, 94 + y, 1, 1);
        g2d.fillRect(122 + x, 94 + y, 1, 2);
        g2d.fillRect(101 + x, 95 + y, 1, 3);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(111 + x, 96 + y, 1, 1);
        g2d.fillRect(113 + x, 96 + y, 2, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 97 + y, 1, 2);
        g2d.fillRect(109 + x, 97 + y, 2, 1);
        g2d.fillRect(115 + x, 97 + y, 4, 1);
        g2d.fillRect(124 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 2, 1);
        g2d.fillRect(99 + x, 100 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(103 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 78 + y, 2, 1);
        g2d.fillRect(111 + x, 78 + y, 3, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(123 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 1, 2);
        g2d.fillRect(108 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 78 + y, 1, 3);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 5);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 2, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 6);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 3, 1);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 1, 4);
        g2d.fillRect(103 + x, 84 + y, 3, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 4);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 8);
        g2d.fillRect(123 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 4);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 5);
        g2d.fillRect(110 + x, 89 + y, 1, 5);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 3);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 3);
        g2d.fillRect(122 + x, 92 + y, 1, 2);
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(113 + x, 93 + y, 2, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(123 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 2);
        g2d.fillRect(103 + x, 94 + y, 1, 5);
        g2d.fillRect(121 + x, 94 + y, 1, 3);
        g2d.fillRect(124 + x, 94 + y, 1, 2);
        g2d.fillRect(112 + x, 95 + y, 2, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 1);
        g2d.fillRect(104 + x, 96 + y, 1, 3);
        g2d.fillRect(106 + x, 96 + y, 1, 2);
        g2d.fillRect(107 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 98 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 2);
        g2d.fillRect(107 + x, 79 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 2);
        g2d.fillRect(112 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 3);
        g2d.fillRect(108 + x, 80 + y, 3, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 3, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 4);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 5);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 3);
        g2d.fillRect(122 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 3, 1);
        g2d.fillRect(112 + x, 94 + y, 3, 1);
        g2d.fillRect(105 + x, 95 + y, 3, 1);
        g2d.fillRect(102 + x, 97 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 88 + y, 1, 3);
        g2d.fillRect(123 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(123 + x, 94 + y, 1, 1);
        g2d.fillRect(123 + x, 96 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 2, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 3, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 2, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 2, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(102 + x, 83 + y, 3, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 95 + y, 1, 1);
        g2d.fillRect(114 + x, 95 + y, 2, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(116 + x, 96 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
    }





    public void paintB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(99 + x, 85 + y, 2, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 4);
        g2d.fillRect(100 + x, 88 + y, 1, 3);
        g2d.fillRect(101 + x, 89 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 92 + y, 1, 4);
        g2d.fillRect(110 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(101 + x, 78 + y, 1, 2);
        g2d.fillRect(120 + x, 78 + y, 1, 2);
        g2d.fillRect(121 + x, 79 + y, 1, 5);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(122 + x, 82 + y, 1, 3);
        g2d.fillRect(99 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(123 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(124 + x, 87 + y, 1, 3);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(125 + x, 89 + y, 1, 4);
        g2d.fillRect(101 + x, 90 + y, 1, 3);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(100 + x, 91 + y, 1, 6);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 2);
        g2d.fillRect(126 + x, 91 + y, 1, 3);
        g2d.fillRect(110 + x, 93 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 2, 1);
        g2d.fillRect(122 + x, 94 + y, 2, 1);
        g2d.fillRect(127 + x, 94 + y, 1, 3);
        g2d.fillRect(99 + x, 95 + y, 1, 3);
        g2d.fillRect(101 + x, 95 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(111 + x, 95 + y, 1, 1);
        g2d.fillRect(113 + x, 95 + y, 2, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 1);
        g2d.fillRect(124 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 96 + y, 1, 1);
        g2d.fillRect(107 + x, 96 + y, 1, 2);
        g2d.fillRect(109 + x, 96 + y, 2, 1);
        g2d.fillRect(115 + x, 96 + y, 5, 1);
        g2d.fillRect(126 + x, 96 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 2);
        g2d.fillRect(106 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 2, 1);
        g2d.fillRect(98 + x, 99 + y, 5, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(103 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(106 + x, 78 + y, 2, 1);
        g2d.fillRect(111 + x, 78 + y, 3, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(123 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(105 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(125 + x, 94 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 78 + y, 1, 3);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 5);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 2, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 6);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 3, 1);
        g2d.fillRect(108 + x, 82 + y, 2, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 1, 4);
        g2d.fillRect(103 + x, 84 + y, 3, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(122 + x, 85 + y, 1, 2);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(114 + x, 86 + y, 1, 4);
        g2d.fillRect(121 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 7);
        g2d.fillRect(123 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 3);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 5);
        g2d.fillRect(110 + x, 89 + y, 1, 4);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(123 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 91 + y, 1, 2);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 4);
        g2d.fillRect(121 + x, 91 + y, 1, 2);
        g2d.fillRect(122 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 2);
        g2d.fillRect(123 + x, 92 + y, 1, 2);
        g2d.fillRect(124 + x, 92 + y, 1, 1);
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 2);
        g2d.fillRect(125 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 2, 1);
        g2d.fillRect(112 + x, 94 + y, 2, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 2);
        g2d.fillRect(121 + x, 94 + y, 1, 1);
        g2d.fillRect(124 + x, 94 + y, 1, 1);
        g2d.fillRect(126 + x, 94 + y, 1, 1);
        g2d.fillRect(103 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 95 + y, 1, 3);
        g2d.fillRect(106 + x, 95 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(103 + x, 78 + y, 1, 2);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 2);
        g2d.fillRect(107 + x, 79 + y, 1, 2);
        g2d.fillRect(111 + x, 79 + y, 1, 2);
        g2d.fillRect(112 + x, 79 + y, 1, 2);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 3);
        g2d.fillRect(108 + x, 80 + y, 3, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(119 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 3, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 4);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 5);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 3);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 2);
        g2d.fillRect(123 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 1);
        g2d.fillRect(112 + x, 93 + y, 2, 1);
        g2d.fillRect(104 + x, 94 + y, 4, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(124 + x, 90 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 1);
        g2d.fillRect(125 + x, 95 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 2, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 3, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 2, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 2, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 2, 1);
        g2d.fillRect(102 + x, 83 + y, 3, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 2, 1);
        g2d.fillRect(102 + x, 95 + y, 1, 1);
        g2d.fillRect(105 + x, 95 + y, 1, 1);
        g2d.fillRect(116 + x, 95 + y, 1, 1);
        g2d.fillRect(102 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
    }
}
