package clts.t.u.s;

import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

public class Srt69 extends SuperTU
{
    public Srt69()
    {
        super();
        containsTL = true;
        slenderB = true;
        containsB = Math.random() < .5;
    }

    /** Creates a new instance of GenericClothes */
    public Srt69(String middle)
    {
        super(middle);
        containsTL = true;
        slenderB = true;
        containsB = Math.random() < .5;
    }

    public Srt69(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        slenderB = true;
        containsB = Math.random() < .5;
    }

    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTL(x,0,g2d);
    }

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        paintTU(x,y,g2d);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,y,g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
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

    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(98 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 2, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 3, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 2);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6,ImageUtilities.NEG_GREY_5));
        g2d.fillRect(108 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(101 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 2);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 3, 1);
        g2d.fillRect(110 + x, 51 + y, 1, 2);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 53 + y, 1, 2);
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(109 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 3, 1);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(103 + x, 56 + y, 2, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 2, 1);
        g2d.fillRect(119 + x, 56 + y, 2, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(110 + x, 57 + y, 2, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 1);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3,ImageUtilities.NEG_GREY_2));
        g2d.fillRect(110 + x, 50 + y, 2, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 3, 1);
        g2d.fillRect(116 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 2, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 56 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1,ImageUtilities.GREY_2));
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 2, 1);
        g2d.fillRect(107 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 2, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2,ImageUtilities.GREY_3));
        g2d.fillRect(112 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(107 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(109 + x, 54 + y, 2, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 2, 1);
        g2d.fillRect(106 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(100 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 52 + y, 3, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 2, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 1);
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(121 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 2, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(118 + x, 73 + y, 1, 1);
        g2d.fillRect(120 + x, 75 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(121 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7,ImageUtilities.NEG_GREY_6));
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 2, 1);
        g2d.fillRect(103 + x, 64 + y, 2, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(118 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 72 + y, 2, 1);
        g2d.fillRect(118 + x, 72 + y, 2, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 1, 1);
        g2d.fillRect(120 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 2, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(103 + x, 69 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5,ImageUtilities.NEG_GREY_4));
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 5, 1);
        g2d.fillRect(108 + x, 63 + y, 2, 1);
        g2d.fillRect(114 + x, 63 + y, 1, 2);
        g2d.fillRect(105 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 2, 1);
        g2d.fillRect(112 + x, 66 + y, 3, 1);
        g2d.fillRect(106 + x, 67 + y, 2, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 2);
        g2d.fillRect(110 + x, 67 + y, 1, 2);
        g2d.fillRect(111 + x, 67 + y, 1, 2);
        g2d.fillRect(103 + x, 68 + y, 2, 1);
        g2d.fillRect(108 + x, 68 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 3);
        g2d.fillRect(108 + x, 70 + y, 2, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 2, 1);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 2, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 77 + y, 2, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 2, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 2, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 3, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 81 + y, 2, 1);
        g2d.fillRect(117 + x, 81 + y, 3, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 3, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 2, 1);
        g2d.fillRect(108 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 2, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 2);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 2, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 2, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 3, 1);
        g2d.fillRect(108 + x, 89 + y, 3, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(111 + x, 64 + y, 1, 1);
        g2d.fillRect(113 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 77 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4,ImageUtilities.NEG_GREY_3));
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(111 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(105 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3,ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 2, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 2);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(103 + x, 62 + y, 2, 1);
        g2d.fillRect(113 + x, 62 + y, 3, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 3);
        g2d.fillRect(106 + x, 65 + y, 2, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 3);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 1, 2);
        g2d.fillRect(106 + x, 70 + y, 2, 1);
        g2d.fillRect(115 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 71 + y, 2, 1);
        g2d.fillRect(116 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 2, 1);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(102 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(111 + x, 76 + y, 2, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(108 + x, 77 + y, 2, 1);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(117 + x, 80 + y, 2, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 2, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 3);
        g2d.fillRect(111 + x, 84 + y, 2, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 2, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 2, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 4, 1);
        g2d.fillRect(103 + x, 89 + y, 3, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 3, 1);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(111 + x, 91 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(112 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 2, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(114 + x, 69 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 2, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 74 + y, 2, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(102 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 83 + y, 3, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 2, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 90 + y, 3, 1);
        g2d.fillRect(108 + x, 91 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(105 + x, 63 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1,ImageUtilities.GREY_2));
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(109 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 2, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 2, 1);
        g2d.fillRect(113 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(118 + x, 74 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(116 + x, 79 + y, 1, 1);
        g2d.fillRect(120 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 80 + y, 1, 1);
        g2d.fillRect(111 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2,ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(113 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 71 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(119 + x, 74 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(107 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3,ImageUtilities.GREY_4));
        g2d.fillRect(105 + x, 61 + y, 2, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 65 + y, 3, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 2, 1);
        g2d.fillRect(110 + x, 69 + y, 1, 1);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 73 + y, 1, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 2, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 79 + y, 1, 1);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(111 + x, 59 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 65 + y, 1, 1);
        g2d.fillRect(111 + x, 65 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 2, 1);
        g2d.fillRect(113 + x, 68 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 2, 1);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(104 + x, 80 + y, 1, 1);
        g2d.fillRect(114 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 2, 1);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4,ImageUtilities.GREY_5));
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 1, 1);
        g2d.fillRect(112 + x, 67 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 2, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5,ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 2, 1);
        g2d.fillRect(113 + x, 74 + y, 2, 1);
        g2d.fillRect(104 + x, 75 + y, 2, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 2);
        g2d.fillRect(110 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 1, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 77 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 1);
        g2d.fillRect(114 + x, 79 + y, 2, 1);
        g2d.fillRect(103 + x, 80 + y, 1, 1);
        g2d.fillRect(105 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(111 + x, 58 + y, 1, 1);
    }
}
