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
public class Srt64 extends SuperTU
{

    public void setOriginalCA(boolean b) {
        originalColorArray = b;
    }

    public boolean getOriginalCA() {
        return originalColorArray;
    }

    boolean originalColorArray = true;

    public Srt64()
    {
        super();
        containsTL = true;
    }

    public Srt64(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Srt64(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
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


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,0,0,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(17,17,17,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(106 + x, 59 + y, 3, 1);
        g2d.fillRect(111 + x, 59 + y, 2, 1);
        g2d.fillRect(108 + x, 60 + y, 2, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 70 + y, 1, 3);
        g2d.fillRect(109 + x, 70 + y, 1, 1);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 2);
        g2d.fillRect(117 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 77 + y, 1, 1);
        g2d.fillRect(120 + x, 78 + y, 1, 1);
        g2d.fillRect(116 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,20,63,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 70 + y, 1, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 1);
        g2d.fillRect(118 + x, 75 + y, 1, 1);
        g2d.fillRect(120 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 1);
        g2d.fillRect(121 + x, 77 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33,33,33,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 59 + y, 1, 1);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(110 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 71 + y, 1, 2);
        g2d.fillRect(119 + x, 71 + y, 1, 1);
        g2d.fillRect(115 + x, 72 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(102 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51,51,51,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(102 + x, 73 + y, 1, 2);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(121 + x, 75 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,57,102,255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 70 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,38,127,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 62 + y, 1, 1);
        g2d.fillRect(118 + x, 69 + y, 1, 2);
        g2d.fillRect(119 + x, 73 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,21,158,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(119 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,90,102,255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(104 + x, 80 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68,68,68,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(116 + x, 80 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,73,158,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 72 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 1);
        g2d.fillRect(120 + x, 76 + y, 1, 1);
        g2d.fillRect(121 + x, 78 + y, 1, 1);
        g2d.fillRect(121 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,57,191,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(101 + x, 75 + y, 1, 2);
        g2d.fillRect(100 + x, 78 + y, 1, 2);
        g2d.fillRect(115 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84,84,84,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 67 + y, 1, 1);
        g2d.fillRect(119 + x, 69 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84,100,102,255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(117 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 75 + y, 1, 1);
        g2d.fillRect(118 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 81 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89,85,127,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 63 + y, 1, 1);
        g2d.fillRect(118 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102,102,102,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(120 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,92,221,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(118 + x, 63 + y, 1, 1);
        g2d.fillRect(110 + x, 72 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,115,204,255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(104 + x, 63 + y, 3, 1);
        g2d.fillRect(107 + x, 64 + y, 1, 1);
        g2d.fillRect(118 + x, 66 + y, 1, 1);
        g2d.fillRect(101 + x, 74 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103,83,158,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 63 + y, 1, 1);
        g2d.fillRect(102 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83,114,158,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 58 + y, 2, 1);
        g2d.fillRect(110 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(106 + x, 62 + y, 1, 1);
        g2d.fillRect(116 + x, 62 + y, 1, 2);
        g2d.fillRect(119 + x, 62 + y, 1, 1);
        g2d.fillRect(101 + x, 63 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 1, 2);
        g2d.fillRect(117 + x, 64 + y, 1, 1);
        g2d.fillRect(101 + x, 65 + y, 1, 1);
        g2d.fillRect(118 + x, 65 + y, 1, 1);
        g2d.fillRect(103 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 1);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(109 + x, 67 + y, 1, 1);
        g2d.fillRect(101 + x, 68 + y, 3, 1);
        g2d.fillRect(103 + x, 69 + y, 1, 1);
        g2d.fillRect(109 + x, 69 + y, 3, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 2, 1);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(100 + x, 72 + y, 1, 2);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 2, 1);
        g2d.fillRect(103 + x, 74 + y, 1, 1);
        g2d.fillRect(113 + x, 74 + y, 1, 1);
        g2d.fillRect(118 + x, 74 + y, 2, 1);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(119 + x, 76 + y, 1, 1);
        g2d.fillRect(99 + x, 77 + y, 1, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(115 + x, 77 + y, 2, 1);
        g2d.fillRect(120 + x, 77 + y, 1, 1);
        g2d.fillRect(116 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 80 + y, 1, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 1);
        g2d.fillRect(114 + x, 82 + y, 1, 1);
        g2d.fillRect(103 + x, 83 + y, 1, 2);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 2, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(119,119,119,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,100,191,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 2);
        g2d.fillRect(117 + x, 63 + y, 1, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(118 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 68 + y, 2, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 1);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(116 + x, 71 + y, 1, 2);
        g2d.fillRect(100 + x, 74 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 1);
        g2d.fillRect(99 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 79 + y, 1, 2);
        g2d.fillRect(117 + x, 79 + y, 1, 2);
        g2d.fillRect(118 + x, 80 + y, 1, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 2);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 3);
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(102 + x, 85 + y, 1, 4);
        g2d.fillRect(105 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(115 + x, 86 + y, 1, 2);
        g2d.fillRect(116 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 86 + y, 1, 2);
        g2d.fillRect(119 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 4, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85,145,153,255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(101 + x, 64 + y, 1, 1);
        g2d.fillRect(103 + x, 82 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84,134,221,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(116 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 2, 1);
        g2d.fillRect(107 + x, 65 + y, 2, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 70 + y, 1, 5);
        g2d.fillRect(105 + x, 71 + y, 1, 2);
        g2d.fillRect(109 + x, 71 + y, 1, 2);
        g2d.fillRect(110 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 74 + y, 3, 1);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(112 + x, 75 + y, 2, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 2);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(108 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(103 + x, 81 + y, 1, 1);
        g2d.fillRect(118 + x, 81 + y, 2, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 2, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85,158,204,255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(102 + x, 61 + y, 1, 1);
        g2d.fillRect(117 + x, 62 + y, 1, 1);
        g2d.fillRect(107 + x, 63 + y, 1, 1);
        g2d.fillRect(103 + x, 64 + y, 1, 1);
        g2d.fillRect(102 + x, 65 + y, 1, 1);
        g2d.fillRect(117 + x, 65 + y, 1, 1);
        g2d.fillRect(119 + x, 65 + y, 1, 1);
        g2d.fillRect(108 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(119 + x, 67 + y, 1, 1);
        g2d.fillRect(108 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 73 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 2, 1);
        g2d.fillRect(115 + x, 73 + y, 1, 2);
        g2d.fillRect(112 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 78 + y, 1, 2);
        g2d.fillRect(105 + x, 78 + y, 1, 1);
        g2d.fillRect(108 + x, 78 + y, 1, 1);
        g2d.fillRect(99 + x, 79 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(99 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,153,153,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 56 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(101 + x, 71 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,170,170,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 70 + y, 1, 1);
        g2d.fillRect(104 + x, 71 + y, 1, 2);
        g2d.fillRect(103 + x, 75 + y, 1, 1);
        g2d.fillRect(102 + x, 79 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84,200,255,255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(108 + x, 75 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 2);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,175,221,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(108 + x, 61 + y, 2, 1);
        g2d.fillRect(107 + x, 62 + y, 1, 1);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(115 + x, 63 + y, 1, 2);
        g2d.fillRect(116 + x, 64 + y, 1, 3);
        g2d.fillRect(104 + x, 66 + y, 2, 1);
        g2d.fillRect(107 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 1, 1);
        g2d.fillRect(118 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 1);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 5);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 73 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 74 + y, 1, 1);
        g2d.fillRect(114 + x, 74 + y, 1, 1);
        g2d.fillRect(100 + x, 76 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(120 + x, 79 + y, 2, 1);
        g2d.fillRect(102 + x, 80 + y, 2, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 2);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,199,204,255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(110 + x, 57 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 66 + y, 1, 1);
        g2d.fillRect(101 + x, 67 + y, 1, 1);
        g2d.fillRect(110 + x, 68 + y, 1, 1);
        g2d.fillRect(101 + x, 69 + y, 1, 1);
        g2d.fillRect(104 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 1);
        g2d.fillRect(103 + x, 77 + y, 1, 1);
        g2d.fillRect(118 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204,204,204,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(118 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 61 + y, 1, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 62 + y, 2, 1);
        g2d.fillRect(101 + x, 66 + y, 1, 1);
        g2d.fillRect(102 + x, 78 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,212,255,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 63 + y, 1, 1);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(118 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 2);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221,221,221,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 62 + y, 2, 1);
        g2d.fillRect(119 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 65 + y, 2, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(103 + x, 76 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(116 + x, 76 + y, 1, 1);
        g2d.fillRect(119 + x, 79 + y, 1, 1);
        g2d.fillRect(121 + x, 80 + y, 1, 1);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,245,255,255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(114 + x, 62 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 3);
        g2d.fillRect(104 + x, 78 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237,237,237,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 1, 2);
        g2d.fillRect(104 + x, 61 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 2, 1);
        g2d.fillRect(118 + x, 61 + y, 1, 2);
        g2d.fillRect(108 + x, 62 + y, 4, 1);
        g2d.fillRect(109 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 2);
        g2d.fillRect(112 + x, 63 + y, 1, 1);
        g2d.fillRect(119 + x, 63 + y, 1, 1);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(110 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 6);
        g2d.fillRect(109 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 4);
        g2d.fillRect(114 + x, 66 + y, 1, 4);
        g2d.fillRect(107 + x, 67 + y, 1, 3);
        g2d.fillRect(110 + x, 67 + y, 1, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 4);
        g2d.fillRect(117 + x, 67 + y, 1, 1);
        g2d.fillRect(111 + x, 68 + y, 2, 1);
        g2d.fillRect(117 + x, 71 + y, 1, 2);
        g2d.fillRect(113 + x, 73 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 1);
        g2d.fillRect(110 + x, 75 + y, 2, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(113 + x, 77 + y, 2, 1);
        g2d.fillRect(99 + x, 78 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 4);
        g2d.fillRect(103 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 1);
        g2d.fillRect(118 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 2);
        g2d.fillRect(118 + x, 83 + y, 2, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 63 + y, 1, 3);
        g2d.fillRect(112 + x, 64 + y, 1, 4);
        g2d.fillRect(111 + x, 65 + y, 1, 3);
        g2d.fillRect(114 + x, 65 + y, 1, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(117 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 11);
        g2d.fillRect(104 + x, 76 + y, 1, 1);
        g2d.fillRect(110 + x, 76 + y, 1, 7);
        g2d.fillRect(111 + x, 76 + y, 1, 9);
        g2d.fillRect(112 + x, 76 + y, 1, 5);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 1, 5);
        g2d.fillRect(117 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 3);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,0,0,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(17,17,17,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 2, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(107 + x, 56 + y, 1, 1);
        g2d.fillRect(101 + x, 57 + y, 3, 1);
        g2d.fillRect(109 + x, 57 + y, 1, 1);
        g2d.fillRect(117 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 3, 1);
        g2d.fillRect(106 + x, 59 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,20,63,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(33,33,33,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(51,51,51,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(114 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,57,102,255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(118 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,38,127,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(103 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(68,68,68,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84,84,84,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(89,85,127,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(120 + x, 57 + y, 1, 1);
        g2d.fillRect(101 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(102,102,102,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(0,92,221,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(111 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(103,83,158,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(101 + x, 53 + y, 1, 3);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 2, 1);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(83,114,158,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(108 + x, 50 + y, 1, 1);
        g2d.fillRect(104 + x, 51 + y, 2, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 4);
        g2d.fillRect(99 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 1);
        g2d.fillRect(100 + x, 54 + y, 1, 3);
        g2d.fillRect(102 + x, 54 + y, 1, 2);
        g2d.fillRect(99 + x, 55 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 1);
        g2d.fillRect(105 + x, 57 + y, 3, 1);
        g2d.fillRect(107 + x, 58 + y, 2, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(86,100,191,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 50 + y, 1, 5);
        g2d.fillRect(109 + x, 50 + y, 1, 4);
        g2d.fillRect(110 + x, 50 + y, 1, 4);
        g2d.fillRect(111 + x, 50 + y, 1, 4);
        g2d.fillRect(112 + x, 50 + y, 1, 4);
        g2d.fillRect(113 + x, 50 + y, 1, 4);
        g2d.fillRect(114 + x, 50 + y, 1, 4);
        g2d.fillRect(115 + x, 50 + y, 1, 4);
        g2d.fillRect(116 + x, 50 + y, 1, 4);
        g2d.fillRect(117 + x, 50 + y, 1, 4);
        g2d.fillRect(106 + x, 51 + y, 1, 4);
        g2d.fillRect(108 + x, 51 + y, 1, 3);
        g2d.fillRect(118 + x, 51 + y, 1, 4);
        g2d.fillRect(119 + x, 51 + y, 1, 5);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 2, 1);
        g2d.fillRect(120 + x, 52 + y, 1, 4);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(100 + x, 53 + y, 1, 1);
        g2d.fillRect(99 + x, 54 + y, 1, 1);
        g2d.fillRect(105 + x, 54 + y, 1, 1);
        g2d.fillRect(98 + x, 55 + y, 1, 2);
        g2d.fillRect(99 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(135,135,135,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(84,134,221,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(109 + x, 55 + y, 2, 1);
        g2d.fillRect(117 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 59 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(85,158,204,255), COLORS.get(ImageUtilities.NEG_GREY_4)));
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(153,153,153,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(109 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,170,170,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(108 + x, 54 + y, 1, 1);
        g2d.fillRect(106 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 56 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(186,186,186,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(113 + x, 55 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(168,175,221,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(119 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 2, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(169,199,204,255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(117 + x, 54 + y, 1, 1);
        g2d.fillRect(116 + x, 56 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(204,204,204,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(100 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,212,255,255), COLORS.get(ImageUtilities.NEG_GREY_6)));
        g2d.fillRect(114 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(221,221,221,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(112 + x, 54 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(170,245,255,255), COLORS.get(ImageUtilities.NEG_GREY_2)));
        g2d.fillRect(108 + x, 55 + y, 1, 1);
        g2d.fillRect(116 + x, 55 + y, 1, 1);
        g2d.fillRect(110 + x, 56 + y, 1, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(237,237,237,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(114 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);


        g2d.setColor(ImageUtilities.relative(originalColorArray, new Color(255,255,255,255), COLORS.get(ImageUtilities.GREY)));
        g2d.fillRect(115 + x, 55 + y, 1, 1);
        g2d.fillRect(115 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
    }
}
