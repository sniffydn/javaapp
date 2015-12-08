package clts.t.u.s;

import clts.*;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Srt70 extends SuperTU
{
    /** Creates a new instance of GenericClothes */

    public Srt70()
    {
        super();
        containsTL = true;
        containsB = Math.random() < .5;
    }

    public Srt70(String middle)
    {
        super(middle);
        containsTL = true;
        containsB = Math.random() < .5;
    }

    public Srt70(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
        containsB = Math.random() < .5;
    }

    public clts.SuperC getRecommendedAccessory(ColorArray c) {
        
        if (!containsB || Math.random() < .3) {
            return new clts.Blank();
        } else if (Math.random() < .5) {
            return new clts.b.a.Pose2(c);
        } else {
            return new clts.b.a.Pose3(c);
        }
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


        if(step == 5 || step == 12)
        {
            paintTL4(x, 0, g2d);
        }
        else if(step == 4 || step == 6 || step == 11 || step == 13)
        {
            paintTL3(x, 0, g2d);
        }
        else if((step == 0 && prevStep != 0) || (step == 8 && prevStep != 8) || step == 1 || step == 9)
        {
            paintTL1(x, 0, g2d);
        }
        else
        {
            paintTL2(x, 0, g2d);
        }

        prevStep = step;
    }

    int prevStep = 0;


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

    public void paintTL4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 63 + y, 1, 5);
        g2d.fillRect(118 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 67 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(99 + x, 70 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(112 + x, 74 + y, 1, 5);
        g2d.fillRect(98 + x, 75 + y, 1, 4);
        g2d.fillRect(119 + x, 75 + y, 1, 3);
        g2d.fillRect(104 + x, 80 + y, 1, 10);
        g2d.fillRect(97 + x, 81 + y, 1, 1);
        g2d.fillRect(113 + x, 82 + y, 1, 6);
        g2d.fillRect(103 + x, 84 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 16);
        g2d.fillRect(116 + x, 60 + y, 1, 6);
        g2d.fillRect(101 + x, 62 + y, 1, 4);
        g2d.fillRect(110 + x, 62 + y, 1, 4);
        g2d.fillRect(100 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 12);
        g2d.fillRect(111 + x, 68 + y, 1, 7);
        g2d.fillRect(99 + x, 75 + y, 1, 1);
        g2d.fillRect(97 + x, 79 + y, 1, 2);
        g2d.fillRect(98 + x, 79 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 5);
        g2d.fillRect(120 + x, 79 + y, 1, 2);
        g2d.fillRect(97 + x, 82 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 60 + y, 1, 5);
        g2d.fillRect(101 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(118 + x, 60 + y, 1, 5);
        g2d.fillRect(102 + x, 61 + y, 1, 3);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 6);
        g2d.fillRect(111 + x, 62 + y, 1, 6);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(98 + x, 64 + y, 1, 5);
        g2d.fillRect(100 + x, 64 + y, 1, 2);
        g2d.fillRect(101 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(118 + x, 66 + y, 1, 4);
        g2d.fillRect(97 + x, 68 + y, 1, 11);
        g2d.fillRect(99 + x, 68 + y, 1, 2);
        g2d.fillRect(119 + x, 69 + y, 1, 2);
        g2d.fillRect(100 + x, 70 + y, 1, 2);
        g2d.fillRect(112 + x, 70 + y, 1, 4);
        g2d.fillRect(98 + x, 72 + y, 1, 3);
        g2d.fillRect(119 + x, 72 + y, 1, 3);
        g2d.fillRect(96 + x, 75 + y, 1, 7);
        g2d.fillRect(111 + x, 75 + y, 1, 4);
        g2d.fillRect(99 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 14);
        g2d.fillRect(120 + x, 76 + y, 1, 3);
        g2d.fillRect(100 + x, 77 + y, 1, 3);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(103 + x, 78 + y, 1, 6);
        g2d.fillRect(106 + x, 78 + y, 1, 12);
        g2d.fillRect(99 + x, 79 + y, 1, 5);
        g2d.fillRect(113 + x, 79 + y, 1, 3);
        g2d.fillRect(121 + x, 79 + y, 1, 4);
        g2d.fillRect(95 + x, 81 + y, 1, 2);
        g2d.fillRect(114 + x, 81 + y, 1, 8);
        g2d.fillRect(94 + x, 82 + y, 1, 1);
        g2d.fillRect(98 + x, 83 + y, 1, 3);
        g2d.fillRect(107 + x, 83 + y, 1, 7);
        g2d.fillRect(100 + x, 84 + y, 1, 3);
        g2d.fillRect(112 + x, 84 + y, 1, 6);
        g2d.fillRect(115 + x, 84 + y, 1, 5);
        g2d.fillRect(116 + x, 84 + y, 1, 5);
        g2d.fillRect(99 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 86 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(119 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 16);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 6);
        g2d.fillRect(107 + x, 66 + y, 1, 17);
        g2d.fillRect(112 + x, 66 + y, 1, 4);
        g2d.fillRect(113 + x, 67 + y, 1, 10);
        g2d.fillRect(101 + x, 69 + y, 1, 4);
        g2d.fillRect(110 + x, 69 + y, 1, 6);
        g2d.fillRect(100 + x, 72 + y, 1, 5);
        g2d.fillRect(114 + x, 74 + y, 1, 7);
        g2d.fillRect(99 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 77 + y, 1, 11);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(115 + x, 78 + y, 1, 6);
        g2d.fillRect(111 + x, 79 + y, 1, 5);
        g2d.fillRect(98 + x, 80 + y, 1, 3);
        g2d.fillRect(100 + x, 80 + y, 1, 4);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 6);
        g2d.fillRect(99 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 4);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 2);
        g2d.fillRect(121 + x, 84 + y, 2, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 5);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 60 + y, 1, 4);
        g2d.fillRect(103 + x, 60 + y, 1, 18);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 6);
        g2d.fillRect(108 + x, 60 + y, 1, 17);
        g2d.fillRect(112 + x, 60 + y, 1, 6);
        g2d.fillRect(109 + x, 61 + y, 1, 22);
        g2d.fillRect(113 + x, 62 + y, 1, 5);
        g2d.fillRect(114 + x, 62 + y, 1, 12);
        g2d.fillRect(115 + x, 64 + y, 1, 14);
        g2d.fillRect(99 + x, 65 + y, 1, 3);
        g2d.fillRect(116 + x, 66 + y, 1, 16);
        g2d.fillRect(101 + x, 68 + y, 1, 1);
        g2d.fillRect(98 + x, 69 + y, 1, 3);
        g2d.fillRect(102 + x, 70 + y, 1, 14);
        g2d.fillRect(117 + x, 70 + y, 1, 14);
        g2d.fillRect(119 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 73 + y, 1, 13);
        g2d.fillRect(120 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 74 + y, 1, 11);
        g2d.fillRect(110 + x, 75 + y, 1, 10);
        g2d.fillRect(121 + x, 76 + y, 1, 3);
        g2d.fillRect(119 + x, 78 + y, 1, 7);
        g2d.fillRect(122 + x, 78 + y, 1, 4);
        g2d.fillRect(95 + x, 80 + y, 1, 1);
        g2d.fillRect(123 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 81 + y, 1, 3);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 84 + y, 1, 4);
        g2d.fillRect(121 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
    }





    public void paintTU(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 57 + y, 1, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 1);
        g2d.fillRect(106 + x, 58 + y, 1, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 58 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(98 + x, 52 + y, 1, 5);
        g2d.fillRect(99 + x, 53 + y, 1, 5);
        g2d.fillRect(100 + x, 55 + y, 1, 4);
        g2d.fillRect(101 + x, 56 + y, 1, 3);
        g2d.fillRect(103 + x, 58 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(107 + x, 50 + y, 4, 1);
        g2d.fillRect(113 + x, 50 + y, 2, 1);
        g2d.fillRect(99 + x, 51 + y, 1, 2);
        g2d.fillRect(100 + x, 52 + y, 1, 3);
        g2d.fillRect(101 + x, 52 + y, 1, 4);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 4);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 4);
        g2d.fillRect(119 + x, 55 + y, 1, 2);
        g2d.fillRect(102 + x, 56 + y, 1, 1);
        g2d.fillRect(118 + x, 56 + y, 1, 4);
        g2d.fillRect(103 + x, 57 + y, 4, 1);
        g2d.fillRect(110 + x, 57 + y, 8, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(107 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 2, 1);
        g2d.fillRect(114 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 3);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(101 + x, 50 + y, 1, 2);
        g2d.fillRect(102 + x, 50 + y, 1, 6);
        g2d.fillRect(103 + x, 50 + y, 4, 1);
        g2d.fillRect(111 + x, 50 + y, 2, 1);
        g2d.fillRect(115 + x, 50 + y, 5, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 3);
        g2d.fillRect(103 + x, 52 + y, 1, 5);
        g2d.fillRect(117 + x, 52 + y, 1, 5);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 2, 1);
        g2d.fillRect(113 + x, 53 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 55 + y, 1, 2);
        g2d.fillRect(115 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(105 + x, 56 + y, 2, 1);
        g2d.fillRect(111 + x, 56 + y, 4, 1);
        g2d.fillRect(107 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(99 + x, 60 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(117 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 51 + y, 17, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 3);
        g2d.fillRect(105 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 52 + y, 2, 1);
        g2d.fillRect(110 + x, 53 + y, 3, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 2);
        g2d.fillRect(105 + x, 54 + y, 1, 2);
        g2d.fillRect(106 + x, 55 + y, 9, 1);
        g2d.fillRect(107 + x, 56 + y, 4, 1);
        g2d.fillRect(108 + x, 57 + y, 2, 1);
        g2d.fillRect(100 + x, 59 + y, 15, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(106 + x, 52 + y, 1, 3);
        g2d.fillRect(107 + x, 52 + y, 1, 3);
        g2d.fillRect(108 + x, 52 + y, 7, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 2);
        g2d.fillRect(115 + x, 53 + y, 1, 2);
        g2d.fillRect(108 + x, 54 + y, 6, 1);
        g2d.fillRect(109 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 60 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 3, 1);
        g2d.fillRect(111 + x, 60 + y, 3, 1);
    }





    public void paintTL1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 63 + y, 1, 3);
        g2d.fillRect(118 + x, 65 + y, 1, 1);
        g2d.fillRect(117 + x, 67 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 66 + y, 2, 1);
        g2d.fillRect(100 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(99 + x, 71 + y, 1, 6);
        g2d.fillRect(118 + x, 71 + y, 1, 5);
        g2d.fillRect(112 + x, 76 + y, 1, 6);
        g2d.fillRect(98 + x, 77 + y, 1, 5);
        g2d.fillRect(119 + x, 77 + y, 1, 4);
        g2d.fillRect(104 + x, 83 + y, 1, 13);
        g2d.fillRect(97 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 9);
        g2d.fillRect(103 + x, 89 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 18);
        g2d.fillRect(116 + x, 60 + y, 1, 6);
        g2d.fillRect(101 + x, 62 + y, 1, 4);
        g2d.fillRect(110 + x, 62 + y, 1, 5);
        g2d.fillRect(100 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 14);
        g2d.fillRect(111 + x, 69 + y, 1, 8);
        g2d.fillRect(99 + x, 77 + y, 1, 1);
        g2d.fillRect(97 + x, 82 + y, 1, 2);
        g2d.fillRect(98 + x, 82 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 1, 6);
        g2d.fillRect(120 + x, 82 + y, 1, 2);
        g2d.fillRect(97 + x, 85 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 60 + y, 1, 5);
        g2d.fillRect(101 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(118 + x, 60 + y, 1, 5);
        g2d.fillRect(102 + x, 61 + y, 1, 3);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 7);
        g2d.fillRect(111 + x, 62 + y, 1, 7);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(98 + x, 64 + y, 1, 6);
        g2d.fillRect(100 + x, 64 + y, 1, 3);
        g2d.fillRect(101 + x, 66 + y, 1, 3);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 3);
        g2d.fillRect(118 + x, 67 + y, 1, 4);
        g2d.fillRect(97 + x, 69 + y, 1, 13);
        g2d.fillRect(99 + x, 69 + y, 1, 2);
        g2d.fillRect(119 + x, 70 + y, 1, 2);
        g2d.fillRect(100 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 71 + y, 1, 5);
        g2d.fillRect(98 + x, 74 + y, 1, 3);
        g2d.fillRect(119 + x, 74 + y, 1, 3);
        g2d.fillRect(96 + x, 77 + y, 1, 8);
        g2d.fillRect(111 + x, 77 + y, 1, 5);
        g2d.fillRect(99 + x, 78 + y, 1, 1);
        g2d.fillRect(105 + x, 78 + y, 1, 18);
        g2d.fillRect(120 + x, 78 + y, 1, 4);
        g2d.fillRect(113 + x, 79 + y, 1, 2);
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(103 + x, 81 + y, 1, 8);
        g2d.fillRect(106 + x, 81 + y, 1, 7);
        g2d.fillRect(99 + x, 82 + y, 1, 7);
        g2d.fillRect(113 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 5);
        g2d.fillRect(95 + x, 84 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 1, 11);
        g2d.fillRect(94 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 87 + y, 1, 5);
        g2d.fillRect(107 + x, 87 + y, 1, 9);
        g2d.fillRect(100 + x, 88 + y, 1, 5);
        g2d.fillRect(112 + x, 88 + y, 1, 8);
        g2d.fillRect(106 + x, 89 + y, 1, 7);
        g2d.fillRect(115 + x, 90 + y, 1, 5);
        g2d.fillRect(116 + x, 90 + y, 1, 5);
        g2d.fillRect(99 + x, 91 + y, 1, 2);
        g2d.fillRect(101 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 1, 3);
        g2d.fillRect(119 + x, 92 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(113 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 19);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 7);
        g2d.fillRect(107 + x, 66 + y, 1, 21);
        g2d.fillRect(112 + x, 67 + y, 1, 4);
        g2d.fillRect(113 + x, 68 + y, 1, 11);
        g2d.fillRect(101 + x, 70 + y, 1, 5);
        g2d.fillRect(110 + x, 70 + y, 1, 7);
        g2d.fillRect(100 + x, 73 + y, 1, 7);
        g2d.fillRect(114 + x, 76 + y, 1, 8);
        g2d.fillRect(99 + x, 79 + y, 1, 3);
        g2d.fillRect(108 + x, 79 + y, 1, 15);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(115 + x, 81 + y, 1, 9);
        g2d.fillRect(111 + x, 82 + y, 1, 7);
        g2d.fillRect(98 + x, 83 + y, 1, 4);
        g2d.fillRect(100 + x, 83 + y, 1, 5);
        g2d.fillRect(116 + x, 85 + y, 1, 4);
        g2d.fillRect(109 + x, 86 + y, 1, 9);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 5);
        g2d.fillRect(117 + x, 89 + y, 1, 3);
        g2d.fillRect(121 + x, 89 + y, 1, 2);
        g2d.fillRect(99 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 5);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(111 + x, 94 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 60 + y, 1, 4);
        g2d.fillRect(103 + x, 60 + y, 1, 21);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 6);
        g2d.fillRect(108 + x, 60 + y, 1, 19);
        g2d.fillRect(112 + x, 60 + y, 1, 7);
        g2d.fillRect(109 + x, 61 + y, 1, 25);
        g2d.fillRect(113 + x, 62 + y, 1, 6);
        g2d.fillRect(114 + x, 62 + y, 1, 14);
        g2d.fillRect(115 + x, 64 + y, 1, 17);
        g2d.fillRect(99 + x, 65 + y, 1, 4);
        g2d.fillRect(116 + x, 67 + y, 1, 18);
        g2d.fillRect(101 + x, 69 + y, 1, 1);
        g2d.fillRect(98 + x, 70 + y, 1, 4);
        g2d.fillRect(102 + x, 71 + y, 1, 18);
        g2d.fillRect(117 + x, 71 + y, 1, 18);
        g2d.fillRect(119 + x, 72 + y, 1, 2);
        g2d.fillRect(101 + x, 75 + y, 1, 17);
        g2d.fillRect(120 + x, 75 + y, 1, 3);
        g2d.fillRect(118 + x, 76 + y, 1, 15);
        g2d.fillRect(110 + x, 77 + y, 1, 14);
        g2d.fillRect(121 + x, 78 + y, 1, 4);
        g2d.fillRect(119 + x, 81 + y, 1, 10);
        g2d.fillRect(122 + x, 81 + y, 1, 4);
        g2d.fillRect(95 + x, 83 + y, 1, 1);
        g2d.fillRect(123 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 6);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 5);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
    }





    public void paintTL2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 63 + y, 1, 3);
        g2d.fillRect(118 + x, 65 + y, 1, 1);
        g2d.fillRect(117 + x, 67 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 66 + y, 2, 1);
        g2d.fillRect(100 + x, 68 + y, 1, 3);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(99 + x, 71 + y, 1, 5);
        g2d.fillRect(118 + x, 71 + y, 1, 4);
        g2d.fillRect(112 + x, 75 + y, 1, 6);
        g2d.fillRect(98 + x, 76 + y, 1, 5);
        g2d.fillRect(119 + x, 76 + y, 1, 4);
        g2d.fillRect(104 + x, 82 + y, 1, 12);
        g2d.fillRect(97 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 8);
        g2d.fillRect(103 + x, 87 + y, 1, 6);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 17);
        g2d.fillRect(116 + x, 60 + y, 1, 6);
        g2d.fillRect(101 + x, 62 + y, 1, 4);
        g2d.fillRect(110 + x, 62 + y, 1, 5);
        g2d.fillRect(100 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 13);
        g2d.fillRect(111 + x, 69 + y, 1, 7);
        g2d.fillRect(99 + x, 76 + y, 1, 1);
        g2d.fillRect(97 + x, 81 + y, 1, 2);
        g2d.fillRect(98 + x, 81 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 5);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(97 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 60 + y, 1, 5);
        g2d.fillRect(101 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(118 + x, 60 + y, 1, 5);
        g2d.fillRect(102 + x, 61 + y, 1, 3);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 7);
        g2d.fillRect(111 + x, 62 + y, 1, 7);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(98 + x, 64 + y, 1, 6);
        g2d.fillRect(100 + x, 64 + y, 1, 3);
        g2d.fillRect(101 + x, 66 + y, 1, 3);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(110 + x, 67 + y, 1, 3);
        g2d.fillRect(118 + x, 67 + y, 1, 4);
        g2d.fillRect(97 + x, 69 + y, 1, 12);
        g2d.fillRect(99 + x, 69 + y, 1, 2);
        g2d.fillRect(119 + x, 70 + y, 1, 2);
        g2d.fillRect(100 + x, 71 + y, 1, 2);
        g2d.fillRect(112 + x, 71 + y, 1, 4);
        g2d.fillRect(98 + x, 73 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 3);
        g2d.fillRect(96 + x, 76 + y, 1, 8);
        g2d.fillRect(111 + x, 76 + y, 1, 5);
        g2d.fillRect(99 + x, 77 + y, 1, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 17);
        g2d.fillRect(120 + x, 77 + y, 1, 4);
        g2d.fillRect(113 + x, 78 + y, 1, 2);
        g2d.fillRect(100 + x, 79 + y, 1, 3);
        g2d.fillRect(103 + x, 80 + y, 1, 7);
        g2d.fillRect(106 + x, 80 + y, 1, 6);
        g2d.fillRect(99 + x, 81 + y, 1, 6);
        g2d.fillRect(113 + x, 81 + y, 1, 3);
        g2d.fillRect(121 + x, 81 + y, 1, 4);
        g2d.fillRect(95 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 83 + y, 1, 10);
        g2d.fillRect(94 + x, 84 + y, 1, 1);
        g2d.fillRect(98 + x, 85 + y, 1, 5);
        g2d.fillRect(107 + x, 85 + y, 1, 9);
        g2d.fillRect(100 + x, 86 + y, 1, 5);
        g2d.fillRect(112 + x, 86 + y, 1, 8);
        g2d.fillRect(106 + x, 87 + y, 1, 7);
        g2d.fillRect(115 + x, 88 + y, 1, 5);
        g2d.fillRect(116 + x, 88 + y, 1, 5);
        g2d.fillRect(99 + x, 89 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(117 + x, 90 + y, 1, 3);
        g2d.fillRect(119 + x, 90 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 2);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 93 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 18);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 7);
        g2d.fillRect(107 + x, 66 + y, 1, 19);
        g2d.fillRect(112 + x, 67 + y, 1, 4);
        g2d.fillRect(113 + x, 68 + y, 1, 10);
        g2d.fillRect(101 + x, 70 + y, 1, 4);
        g2d.fillRect(110 + x, 70 + y, 1, 6);
        g2d.fillRect(100 + x, 73 + y, 1, 6);
        g2d.fillRect(114 + x, 75 + y, 1, 8);
        g2d.fillRect(99 + x, 78 + y, 1, 3);
        g2d.fillRect(108 + x, 78 + y, 1, 14);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(115 + x, 80 + y, 1, 8);
        g2d.fillRect(111 + x, 81 + y, 1, 6);
        g2d.fillRect(98 + x, 82 + y, 1, 3);
        g2d.fillRect(100 + x, 82 + y, 1, 4);
        g2d.fillRect(116 + x, 84 + y, 1, 3);
        g2d.fillRect(109 + x, 85 + y, 1, 8);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 5);
        g2d.fillRect(117 + x, 87 + y, 1, 3);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 2);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 5);
        g2d.fillRect(118 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 92 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 60 + y, 1, 4);
        g2d.fillRect(103 + x, 60 + y, 1, 20);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 6);
        g2d.fillRect(108 + x, 60 + y, 1, 18);
        g2d.fillRect(112 + x, 60 + y, 1, 7);
        g2d.fillRect(109 + x, 61 + y, 1, 24);
        g2d.fillRect(113 + x, 62 + y, 1, 6);
        g2d.fillRect(114 + x, 62 + y, 1, 13);
        g2d.fillRect(115 + x, 64 + y, 1, 16);
        g2d.fillRect(99 + x, 65 + y, 1, 4);
        g2d.fillRect(116 + x, 67 + y, 1, 17);
        g2d.fillRect(101 + x, 69 + y, 1, 1);
        g2d.fillRect(98 + x, 70 + y, 1, 3);
        g2d.fillRect(102 + x, 71 + y, 1, 16);
        g2d.fillRect(117 + x, 71 + y, 1, 16);
        g2d.fillRect(119 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 74 + y, 1, 16);
        g2d.fillRect(120 + x, 74 + y, 1, 3);
        g2d.fillRect(118 + x, 75 + y, 1, 14);
        g2d.fillRect(110 + x, 76 + y, 1, 13);
        g2d.fillRect(121 + x, 77 + y, 1, 4);
        g2d.fillRect(119 + x, 80 + y, 1, 9);
        g2d.fillRect(122 + x, 80 + y, 1, 4);
        g2d.fillRect(95 + x, 82 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 5);
        g2d.fillRect(121 + x, 85 + y, 1, 2);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 5);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
    }





    public void paintTL3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(117 + x, 63 + y, 1, 5);
        g2d.fillRect(118 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 67 + y, 1, 3);
        g2d.fillRect(117 + x, 68 + y, 1, 2);
        g2d.fillRect(99 + x, 70 + y, 1, 5);
        g2d.fillRect(118 + x, 70 + y, 1, 4);
        g2d.fillRect(112 + x, 74 + y, 1, 6);
        g2d.fillRect(98 + x, 75 + y, 1, 5);
        g2d.fillRect(119 + x, 75 + y, 1, 4);
        g2d.fillRect(104 + x, 81 + y, 1, 11);
        g2d.fillRect(97 + x, 82 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 7);
        g2d.fillRect(103 + x, 86 + y, 1, 5);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 60 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 16);
        g2d.fillRect(116 + x, 60 + y, 1, 6);
        g2d.fillRect(101 + x, 62 + y, 1, 4);
        g2d.fillRect(110 + x, 62 + y, 1, 4);
        g2d.fillRect(100 + x, 66 + y, 1, 1);
        g2d.fillRect(104 + x, 68 + y, 1, 13);
        g2d.fillRect(111 + x, 68 + y, 1, 7);
        g2d.fillRect(99 + x, 75 + y, 1, 1);
        g2d.fillRect(97 + x, 80 + y, 1, 2);
        g2d.fillRect(98 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 5);
        g2d.fillRect(120 + x, 80 + y, 1, 2);
        g2d.fillRect(97 + x, 83 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 60 + y, 1, 5);
        g2d.fillRect(101 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 3);
        g2d.fillRect(118 + x, 60 + y, 1, 5);
        g2d.fillRect(102 + x, 61 + y, 1, 3);
        g2d.fillRect(110 + x, 61 + y, 1, 1);
        g2d.fillRect(104 + x, 62 + y, 1, 6);
        g2d.fillRect(111 + x, 62 + y, 1, 6);
        g2d.fillRect(115 + x, 63 + y, 1, 1);
        g2d.fillRect(98 + x, 64 + y, 1, 5);
        g2d.fillRect(100 + x, 64 + y, 1, 2);
        g2d.fillRect(101 + x, 66 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 3);
        g2d.fillRect(118 + x, 66 + y, 1, 4);
        g2d.fillRect(97 + x, 68 + y, 1, 12);
        g2d.fillRect(99 + x, 68 + y, 1, 2);
        g2d.fillRect(119 + x, 69 + y, 1, 2);
        g2d.fillRect(100 + x, 70 + y, 1, 2);
        g2d.fillRect(112 + x, 70 + y, 1, 4);
        g2d.fillRect(98 + x, 72 + y, 1, 3);
        g2d.fillRect(119 + x, 72 + y, 1, 3);
        g2d.fillRect(96 + x, 75 + y, 1, 8);
        g2d.fillRect(111 + x, 75 + y, 1, 5);
        g2d.fillRect(99 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 76 + y, 1, 16);
        g2d.fillRect(120 + x, 76 + y, 1, 4);
        g2d.fillRect(113 + x, 77 + y, 1, 2);
        g2d.fillRect(100 + x, 78 + y, 1, 3);
        g2d.fillRect(103 + x, 79 + y, 1, 7);
        g2d.fillRect(106 + x, 79 + y, 1, 6);
        g2d.fillRect(99 + x, 80 + y, 1, 6);
        g2d.fillRect(113 + x, 80 + y, 1, 3);
        g2d.fillRect(121 + x, 80 + y, 1, 4);
        g2d.fillRect(95 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 9);
        g2d.fillRect(94 + x, 83 + y, 1, 1);
        g2d.fillRect(98 + x, 84 + y, 1, 4);
        g2d.fillRect(107 + x, 84 + y, 1, 8);
        g2d.fillRect(100 + x, 85 + y, 1, 4);
        g2d.fillRect(112 + x, 85 + y, 1, 7);
        g2d.fillRect(106 + x, 86 + y, 1, 6);
        g2d.fillRect(115 + x, 86 + y, 1, 5);
        g2d.fillRect(116 + x, 86 + y, 1, 5);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(101 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 88 + y, 1, 3);
        g2d.fillRect(119 + x, 88 + y, 1, 2);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 2);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(111 + x, 60 + y, 1, 2);
        g2d.fillRect(113 + x, 60 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 62 + y, 1, 17);
        g2d.fillRect(115 + x, 62 + y, 1, 1);
        g2d.fillRect(102 + x, 64 + y, 1, 6);
        g2d.fillRect(107 + x, 66 + y, 1, 18);
        g2d.fillRect(112 + x, 66 + y, 1, 4);
        g2d.fillRect(113 + x, 67 + y, 1, 10);
        g2d.fillRect(101 + x, 69 + y, 1, 4);
        g2d.fillRect(110 + x, 69 + y, 1, 6);
        g2d.fillRect(100 + x, 72 + y, 1, 6);
        g2d.fillRect(114 + x, 74 + y, 1, 8);
        g2d.fillRect(99 + x, 77 + y, 1, 3);
        g2d.fillRect(108 + x, 77 + y, 1, 13);
        g2d.fillRect(113 + x, 79 + y, 1, 1);
        g2d.fillRect(115 + x, 79 + y, 1, 7);
        g2d.fillRect(111 + x, 80 + y, 1, 6);
        g2d.fillRect(98 + x, 81 + y, 1, 3);
        g2d.fillRect(100 + x, 81 + y, 1, 4);
        g2d.fillRect(116 + x, 83 + y, 1, 3);
        g2d.fillRect(109 + x, 84 + y, 1, 7);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 4);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(120 + x, 86 + y, 1, 2);
        g2d.fillRect(121 + x, 86 + y, 2, 1);
        g2d.fillRect(110 + x, 87 + y, 1, 5);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 90 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 60 + y, 1, 4);
        g2d.fillRect(103 + x, 60 + y, 1, 19);
        g2d.fillRect(106 + x, 60 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 6);
        g2d.fillRect(108 + x, 60 + y, 1, 17);
        g2d.fillRect(112 + x, 60 + y, 1, 6);
        g2d.fillRect(109 + x, 61 + y, 1, 23);
        g2d.fillRect(113 + x, 62 + y, 1, 5);
        g2d.fillRect(114 + x, 62 + y, 1, 12);
        g2d.fillRect(115 + x, 64 + y, 1, 15);
        g2d.fillRect(99 + x, 65 + y, 1, 3);
        g2d.fillRect(116 + x, 66 + y, 1, 17);
        g2d.fillRect(101 + x, 68 + y, 1, 1);
        g2d.fillRect(98 + x, 69 + y, 1, 3);
        g2d.fillRect(102 + x, 70 + y, 1, 16);
        g2d.fillRect(117 + x, 70 + y, 1, 16);
        g2d.fillRect(119 + x, 71 + y, 1, 1);
        g2d.fillRect(101 + x, 73 + y, 1, 15);
        g2d.fillRect(120 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 74 + y, 1, 13);
        g2d.fillRect(110 + x, 75 + y, 1, 12);
        g2d.fillRect(121 + x, 76 + y, 1, 4);
        g2d.fillRect(119 + x, 79 + y, 1, 8);
        g2d.fillRect(122 + x, 79 + y, 1, 4);
        g2d.fillRect(95 + x, 81 + y, 1, 1);
        g2d.fillRect(123 + x, 81 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 4);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 86 + y, 1, 4);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
    }
}
