package clts.t.u.s;

import clts.*;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

public class Srt66 extends SuperTU
{
    public Srt66()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Srt66(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt66(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
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


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 47 + y, 2, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 48 + y, 1, 5);
        g2d.fillRect(116 + x, 48 + y, 1, 3);
        g2d.fillRect(117 + x, 48 + y, 2, 1);
        g2d.fillRect(99 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 49 + y, 1, 6);
        g2d.fillRect(118 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 50 + y, 1, 5);
        g2d.fillRect(120 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 52 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 5);
        g2d.fillRect(104 + x, 52 + y, 1, 7);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 2);
        g2d.fillRect(102 + x, 54 + y, 1, 5);
        g2d.fillRect(116 + x, 54 + y, 2, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 55 + y, 1, 7);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(99 + x, 56 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 2);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 2);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 3);
        g2d.fillRect(114 + x, 58 + y, 1, 10);
        g2d.fillRect(118 + x, 58 + y, 1, 2);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 59 + y, 1, 3);
        g2d.fillRect(108 + x, 59 + y, 2, 1);
        g2d.fillRect(111 + x, 59 + y, 3, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 2);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(106 + x, 64 + y, 1, 1);
        g2d.fillRect(107 + x, 65 + y, 1, 2);
        g2d.fillRect(108 + x, 65 + y, 1, 3);
        g2d.fillRect(109 + x, 65 + y, 4, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 49 + y, 1, 2);
        g2d.fillRect(117 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(98 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 2);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 64 + y, 3, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 3);
        g2d.fillRect(118 + x, 50 + y, 1, 6);
        g2d.fillRect(100 + x, 51 + y, 2, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 2);
        g2d.fillRect(120 + x, 52 + y, 1, 1);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 1);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 55 + y, 2, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 1);
        g2d.fillRect(100 + x, 56 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 2, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(99 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 2, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 1);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(113 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 3);
        g2d.fillRect(115 + x, 65 + y, 1, 3);
    }





    public void paintTL(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 6);
        g2d.fillRect(114 + x, 67 + y, 1, 11);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 4, 1);
        g2d.fillRect(115 + x, 74 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 5, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 4);
        g2d.fillRect(109 + x, 79 + y, 1, 3);
        g2d.fillRect(114 + x, 79 + y, 1, 2);
        g2d.fillRect(108 + x, 80 + y, 1, 6);
        g2d.fillRect(101 + x, 81 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 6);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 3, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 3);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 4);
        g2d.fillRect(111 + x, 84 + y, 1, 5);
        g2d.fillRect(112 + x, 84 + y, 1, 2);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 1);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 44 + y, 1, 1);
        g2d.fillRect(115 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 3);
        g2d.fillRect(115 + x, 70 + y, 1, 4);
        g2d.fillRect(109 + x, 72 + y, 1, 1);
        g2d.fillRect(108 + x, 74 + y, 1, 1);
        g2d.fillRect(108 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 2, 1);
        g2d.fillRect(119 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 2, 1);
        g2d.fillRect(118 + x, 81 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 2, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 2, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 41 + y, 1, 3);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(103 + x, 45 + y, 1, 2);
        g2d.fillRect(116 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(117 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 3);
        g2d.fillRect(116 + x, 70 + y, 1, 1);
        g2d.fillRect(108 + x, 73 + y, 1, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 82 + y, 2, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 90 + y, 1, 1);
    }
}
