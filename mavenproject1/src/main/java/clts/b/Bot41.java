/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b;

import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class Bot41 extends SuperB
{
    {
        slenderB = true;
        jean = true;
        pant = true;
        legPos = 0;
    }
    public Bot41()
    {
        super();
    }

    public Bot41(int layer)
    {
        super(layer);
    }

    public Bot41(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public Bot41(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintBack(int offsetX, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(step <= 12 && step > 3)
        {
            paintLeft(offsetX,0,g2d);
        }
        else
        {
            paintRight(offsetX,0,g2d);
        }
    }

    public void paintMiddle(int offsetX, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        int x = offsetX;
        y = 0;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 4);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 3);
        g2d.fillRect(108 + x, 90 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 2);
        g2d.fillRect(107 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(104 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 7);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 2);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);

        if(step <= 12 && step > 3)
        {
            paintRight(offsetX,0,g2d);
        }
        else
        {
            paintLeft(offsetX,0,g2d);
        }
    }

    private void paintRight(int x, int y, GraphicsMap g2d)
    {
        if(step == 0 || step == 8 || step == 9 || step == 15)
        {
            r1(x, y, g2d);
        }else if(step == 11 || step == 12 || step == 13)
        {
            r3(x, y, g2d);
        }else if(step == 1 || step == 7)
        {
            r4(x, y, g2d);
        }else if(step == 2 || step == 6)
        {
            r5(x, y, g2d);
        }else if(step == 3 || step == 5)
        {
            r6(x, y, g2d);
        }else if(step == 10 || step == 14)
        {
            r2(x, y, g2d);
        }else if(step == 4)
        {
            r7(x, y, g2d);
        }
    }
    private void paintLeft(int x, int y, GraphicsMap g2d)
    {
        if(step == 0 || step == 1 || step == 7 || step == 8)
        {
            l1(x, y, g2d);
        }else if(step == 3 || step == 4 || step == 5)
        {
            l3(x, y, g2d);
        }else if(step == 2 || step == 6)
        {
            l2(x, y, g2d);
        }else if(step == 9 || step == 15)
        {
            l4(x, y, g2d);
        }else if(step == 10 || step == 14)
        {
            l5(x, y, g2d);
        }else if(step == 11 || step == 13)
        {
            l6(x, y, g2d);
        }else if(step == 12)
        {
            l7(x, y, g2d);
        }
    }

    private void r1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 11);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 4);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 8);
        g2d.fillRect(112 + x, 94 + y, 1, 8);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 99 + y, 1, 6);
        g2d.fillRect(111 + x, 102 + y, 1, 11);
        g2d.fillRect(118 + x, 105 + y, 1, 3);
        g2d.fillRect(117 + x, 108 + y, 1, 14);
        g2d.fillRect(110 + x, 112 + y, 1, 5);
        g2d.fillRect(118 + x, 114 + y, 1, 9);
        g2d.fillRect(109 + x, 116 + y, 1, 7);
        g2d.fillRect(116 + x, 117 + y, 1, 2);
        g2d.fillRect(111 + x, 118 + y, 1, 1);
        g2d.fillRect(115 + x, 118 + y, 1, 1);
        g2d.fillRect(116 + x, 120 + y, 1, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(119 + x, 122 + y, 1, 7);
        g2d.fillRect(107 + x, 123 + y, 1, 3);
        g2d.fillRect(114 + x, 123 + y, 1, 1);
        g2d.fillRect(106 + x, 125 + y, 1, 1);
        g2d.fillRect(108 + x, 125 + y, 1, 2);
        g2d.fillRect(109 + x, 126 + y, 1, 1);
        g2d.fillRect(110 + x, 127 + y, 4, 1);
        g2d.fillRect(118 + x, 127 + y, 1, 2);
        g2d.fillRect(114 + x, 128 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(113 + x, 94 + y, 1, 8);
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 4);
        g2d.fillRect(118 + x, 99 + y, 1, 4);
        g2d.fillRect(112 + x, 102 + y, 1, 10);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 112 + y, 1, 5);
        g2d.fillRect(111 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(111 + x, 116 + y, 1, 2);
        g2d.fillRect(112 + x, 116 + y, 1, 1);
        g2d.fillRect(110 + x, 117 + y, 1, 1);
        g2d.fillRect(114 + x, 117 + y, 1, 3);
        g2d.fillRect(110 + x, 119 + y, 1, 4);
        g2d.fillRect(113 + x, 119 + y, 1, 2);
        g2d.fillRect(115 + x, 119 + y, 1, 2);
        g2d.fillRect(116 + x, 119 + y, 1, 1);
        g2d.fillRect(116 + x, 121 + y, 1, 2);
        g2d.fillRect(112 + x, 122 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 2);
        g2d.fillRect(109 + x, 123 + y, 1, 3);
        g2d.fillRect(115 + x, 123 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 4);
        g2d.fillRect(111 + x, 124 + y, 1, 1);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(113 + x, 125 + y, 1, 1);
        g2d.fillRect(117 + x, 126 + y, 1, 2);
        g2d.fillRect(115 + x, 127 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 12);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(114 + x, 94 + y, 1, 11);
        g2d.fillRect(118 + x, 96 + y, 1, 3);
        g2d.fillRect(115 + x, 100 + y, 1, 2);
        g2d.fillRect(113 + x, 102 + y, 1, 9);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 2);
        g2d.fillRect(114 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 108 + y, 1, 4);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(112 + x, 112 + y, 1, 3);
        g2d.fillRect(115 + x, 112 + y, 1, 6);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 1);
        g2d.fillRect(112 + x, 118 + y, 2, 1);
        g2d.fillRect(111 + x, 119 + y, 1, 5);
        g2d.fillRect(114 + x, 120 + y, 1, 2);
        g2d.fillRect(112 + x, 121 + y, 1, 1);
        g2d.fillRect(113 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 3);
        g2d.fillRect(112 + x, 123 + y, 1, 4);
        g2d.fillRect(117 + x, 123 + y, 1, 3);
        g2d.fillRect(113 + x, 124 + y, 1, 1);
        g2d.fillRect(115 + x, 124 + y, 2, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 1);
        g2d.fillRect(113 + x, 126 + y, 1, 1);
        g2d.fillRect(116 + x, 126 + y, 1, 1);
        g2d.fillRect(114 + x, 127 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 14);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 7);
        g2d.fillRect(118 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 102 + y, 1, 7);
        g2d.fillRect(114 + x, 105 + y, 1, 2);
        g2d.fillRect(116 + x, 106 + y, 1, 2);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 4);
        g2d.fillRect(112 + x, 115 + y, 2, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(112 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 119 + y, 1, 2);
        g2d.fillRect(113 + x, 121 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(114 + x, 122 + y, 1, 1);
        g2d.fillRect(113 + x, 123 + y, 1, 1);
        g2d.fillRect(116 + x, 123 + y, 1, 1);
        g2d.fillRect(111 + x, 125 + y, 1, 2);
        g2d.fillRect(115 + x, 125 + y, 1, 2);
        g2d.fillRect(116 + x, 125 + y, 1, 1);
        g2d.fillRect(110 + x, 126 + y, 1, 1);
        g2d.fillRect(114 + x, 126 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
    }
    private void r2(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 18);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 12);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(112 + x, 102 + y, 1, 11);
        g2d.fillRect(120 + x, 102 + y, 1, 3);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(118 + x, 108 + y, 1, 14);
        g2d.fillRect(111 + x, 112 + y, 1, 5);
        g2d.fillRect(119 + x, 114 + y, 1, 9);
        g2d.fillRect(110 + x, 116 + y, 1, 7);
        g2d.fillRect(117 + x, 117 + y, 1, 2);
        g2d.fillRect(112 + x, 118 + y, 1, 1);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 1);
        g2d.fillRect(109 + x, 122 + y, 1, 1);
        g2d.fillRect(120 + x, 122 + y, 1, 7);
        g2d.fillRect(108 + x, 123 + y, 1, 3);
        g2d.fillRect(115 + x, 123 + y, 1, 1);
        g2d.fillRect(107 + x, 125 + y, 1, 1);
        g2d.fillRect(109 + x, 125 + y, 1, 2);
        g2d.fillRect(110 + x, 126 + y, 1, 1);
        g2d.fillRect(111 + x, 127 + y, 4, 1);
        g2d.fillRect(119 + x, 127 + y, 1, 2);
        g2d.fillRect(115 + x, 128 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 9);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 4);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(113 + x, 102 + y, 1, 10);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(117 + x, 112 + y, 1, 5);
        g2d.fillRect(112 + x, 113 + y, 1, 2);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 117 + y, 1, 1);
        g2d.fillRect(115 + x, 117 + y, 1, 3);
        g2d.fillRect(111 + x, 119 + y, 1, 4);
        g2d.fillRect(114 + x, 119 + y, 1, 2);
        g2d.fillRect(116 + x, 119 + y, 1, 2);
        g2d.fillRect(117 + x, 119 + y, 1, 1);
        g2d.fillRect(117 + x, 121 + y, 1, 2);
        g2d.fillRect(113 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 122 + y, 1, 1);
        g2d.fillRect(109 + x, 123 + y, 1, 2);
        g2d.fillRect(110 + x, 123 + y, 1, 3);
        g2d.fillRect(116 + x, 123 + y, 1, 1);
        g2d.fillRect(119 + x, 123 + y, 1, 4);
        g2d.fillRect(112 + x, 124 + y, 1, 1);
        g2d.fillRect(115 + x, 124 + y, 1, 1);
        g2d.fillRect(114 + x, 125 + y, 1, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 2);
        g2d.fillRect(116 + x, 127 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 11);
        g2d.fillRect(118 + x, 95 + y, 1, 6);
        g2d.fillRect(119 + x, 96 + y, 1, 3);
        g2d.fillRect(116 + x, 100 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 9);
        g2d.fillRect(118 + x, 102 + y, 1, 3);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(115 + x, 107 + y, 1, 2);
        g2d.fillRect(117 + x, 108 + y, 1, 4);
        g2d.fillRect(116 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 3);
        g2d.fillRect(116 + x, 112 + y, 1, 6);
        g2d.fillRect(112 + x, 115 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 118 + y, 1, 1);
        g2d.fillRect(113 + x, 118 + y, 2, 1);
        g2d.fillRect(112 + x, 119 + y, 1, 5);
        g2d.fillRect(115 + x, 120 + y, 1, 2);
        g2d.fillRect(113 + x, 121 + y, 1, 1);
        g2d.fillRect(114 + x, 122 + y, 1, 1);
        g2d.fillRect(116 + x, 122 + y, 1, 1);
        g2d.fillRect(111 + x, 123 + y, 1, 3);
        g2d.fillRect(113 + x, 123 + y, 1, 4);
        g2d.fillRect(118 + x, 123 + y, 1, 3);
        g2d.fillRect(114 + x, 124 + y, 1, 1);
        g2d.fillRect(116 + x, 124 + y, 2, 1);
        g2d.fillRect(115 + x, 125 + y, 1, 1);
        g2d.fillRect(114 + x, 126 + y, 1, 1);
        g2d.fillRect(117 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 127 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 9);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 6);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(116 + x, 102 + y, 1, 7);
        g2d.fillRect(117 + x, 102 + y, 1, 3);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 106 + y, 1, 2);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 4);
        g2d.fillRect(113 + x, 115 + y, 2, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 117 + y, 1, 1);
        g2d.fillRect(113 + x, 119 + y, 1, 2);
        g2d.fillRect(114 + x, 121 + y, 1, 1);
        g2d.fillRect(116 + x, 121 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 1);
        g2d.fillRect(114 + x, 123 + y, 1, 1);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(112 + x, 125 + y, 1, 2);
        g2d.fillRect(116 + x, 125 + y, 1, 2);
        g2d.fillRect(117 + x, 125 + y, 1, 1);
        g2d.fillRect(111 + x, 126 + y, 1, 1);
        g2d.fillRect(115 + x, 126 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
    }
    private void r3(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 21);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 23);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(120 + x, 105 + y, 1, 3);
        g2d.fillRect(119 + x, 108 + y, 1, 14);
        g2d.fillRect(112 + x, 112 + y, 1, 5);
        g2d.fillRect(120 + x, 114 + y, 1, 9);
        g2d.fillRect(111 + x, 116 + y, 1, 7);
        g2d.fillRect(118 + x, 117 + y, 1, 2);
        g2d.fillRect(113 + x, 118 + y, 1, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 1);
        g2d.fillRect(118 + x, 120 + y, 1, 1);
        g2d.fillRect(110 + x, 122 + y, 1, 1);
        g2d.fillRect(121 + x, 122 + y, 1, 7);
        g2d.fillRect(109 + x, 123 + y, 1, 3);
        g2d.fillRect(116 + x, 123 + y, 1, 1);
        g2d.fillRect(108 + x, 125 + y, 1, 1);
        g2d.fillRect(110 + x, 125 + y, 1, 2);
        g2d.fillRect(111 + x, 126 + y, 1, 1);
        g2d.fillRect(112 + x, 127 + y, 4, 1);
        g2d.fillRect(120 + x, 127 + y, 1, 2);
        g2d.fillRect(116 + x, 128 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 19);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 95 + y, 1, 4);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(120 + x, 101 + y, 1, 2);
        g2d.fillRect(120 + x, 104 + y, 1, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(118 + x, 112 + y, 1, 5);
        g2d.fillRect(113 + x, 113 + y, 1, 2);
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(112 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 117 + y, 1, 3);
        g2d.fillRect(112 + x, 119 + y, 1, 4);
        g2d.fillRect(115 + x, 119 + y, 1, 2);
        g2d.fillRect(117 + x, 119 + y, 1, 2);
        g2d.fillRect(118 + x, 119 + y, 1, 1);
        g2d.fillRect(118 + x, 121 + y, 1, 2);
        g2d.fillRect(114 + x, 122 + y, 1, 1);
        g2d.fillRect(119 + x, 122 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 2);
        g2d.fillRect(111 + x, 123 + y, 1, 3);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(120 + x, 123 + y, 1, 4);
        g2d.fillRect(113 + x, 124 + y, 1, 1);
        g2d.fillRect(116 + x, 124 + y, 1, 1);
        g2d.fillRect(115 + x, 125 + y, 1, 1);
        g2d.fillRect(119 + x, 126 + y, 1, 2);
        g2d.fillRect(117 + x, 127 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 17);
        g2d.fillRect(118 + x, 95 + y, 1, 6);
        g2d.fillRect(119 + x, 96 + y, 1, 3);
        g2d.fillRect(116 + x, 100 + y, 1, 5);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 4);
        g2d.fillRect(120 + x, 103 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 2);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(118 + x, 108 + y, 1, 4);
        g2d.fillRect(117 + x, 109 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 3);
        g2d.fillRect(117 + x, 112 + y, 1, 6);
        g2d.fillRect(113 + x, 115 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 1);
        g2d.fillRect(112 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 118 + y, 2, 1);
        g2d.fillRect(113 + x, 119 + y, 1, 5);
        g2d.fillRect(116 + x, 120 + y, 1, 2);
        g2d.fillRect(114 + x, 121 + y, 1, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 1);
        g2d.fillRect(117 + x, 122 + y, 1, 1);
        g2d.fillRect(112 + x, 123 + y, 1, 3);
        g2d.fillRect(114 + x, 123 + y, 1, 4);
        g2d.fillRect(119 + x, 123 + y, 1, 3);
        g2d.fillRect(115 + x, 124 + y, 1, 1);
        g2d.fillRect(117 + x, 124 + y, 2, 1);
        g2d.fillRect(116 + x, 125 + y, 1, 1);
        g2d.fillRect(115 + x, 126 + y, 1, 1);
        g2d.fillRect(118 + x, 126 + y, 1, 1);
        g2d.fillRect(116 + x, 127 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 9);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 6);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 4);
        g2d.fillRect(117 + x, 102 + y, 1, 7);
        g2d.fillRect(116 + x, 105 + y, 1, 2);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 1, 4);
        g2d.fillRect(114 + x, 115 + y, 2, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 2);
        g2d.fillRect(114 + x, 117 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 2);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(117 + x, 121 + y, 1, 1);
        g2d.fillRect(116 + x, 122 + y, 1, 1);
        g2d.fillRect(115 + x, 123 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 1);
        g2d.fillRect(113 + x, 125 + y, 1, 2);
        g2d.fillRect(117 + x, 125 + y, 1, 2);
        g2d.fillRect(118 + x, 125 + y, 1, 1);
        g2d.fillRect(112 + x, 126 + y, 1, 1);
        g2d.fillRect(116 + x, 126 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
    }
    private void r4(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 16);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 11);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 98 + y, 1, 6);
        g2d.fillRect(112 + x, 101 + y, 1, 10);
        g2d.fillRect(119 + x, 104 + y, 1, 2);
        g2d.fillRect(118 + x, 106 + y, 1, 13);
        g2d.fillRect(111 + x, 110 + y, 1, 4);
        g2d.fillRect(119 + x, 112 + y, 1, 8);
        g2d.fillRect(110 + x, 113 + y, 1, 7);
        g2d.fillRect(117 + x, 114 + y, 1, 2);
        g2d.fillRect(112 + x, 115 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(109 + x, 119 + y, 1, 1);
        g2d.fillRect(120 + x, 119 + y, 1, 7);
        g2d.fillRect(108 + x, 120 + y, 1, 3);
        g2d.fillRect(115 + x, 120 + y, 1, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(109 + x, 122 + y, 1, 2);
        g2d.fillRect(110 + x, 123 + y, 1, 1);
        g2d.fillRect(111 + x, 124 + y, 4, 1);
        g2d.fillRect(119 + x, 124 + y, 1, 2);
        g2d.fillRect(115 + x, 125 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(114 + x, 93 + y, 1, 8);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 4);
        g2d.fillRect(119 + x, 98 + y, 1, 4);
        g2d.fillRect(113 + x, 101 + y, 1, 9);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 4);
        g2d.fillRect(112 + x, 111 + y, 1, 4);
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 3);
        g2d.fillRect(111 + x, 116 + y, 1, 4);
        g2d.fillRect(114 + x, 116 + y, 1, 2);
        g2d.fillRect(116 + x, 116 + y, 1, 2);
        g2d.fillRect(117 + x, 116 + y, 1, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 2);
        g2d.fillRect(113 + x, 119 + y, 1, 1);
        g2d.fillRect(118 + x, 119 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 1, 2);
        g2d.fillRect(110 + x, 120 + y, 1, 3);
        g2d.fillRect(116 + x, 120 + y, 1, 1);
        g2d.fillRect(119 + x, 120 + y, 1, 4);
        g2d.fillRect(112 + x, 121 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);
        g2d.fillRect(114 + x, 122 + y, 1, 1);
        g2d.fillRect(118 + x, 123 + y, 1, 2);
        g2d.fillRect(116 + x, 124 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 93 + y, 2, 1);
        g2d.fillRect(115 + x, 94 + y, 1, 10);
        g2d.fillRect(118 + x, 94 + y, 1, 10);
        g2d.fillRect(119 + x, 95 + y, 1, 3);
        g2d.fillRect(116 + x, 99 + y, 1, 2);
        g2d.fillRect(114 + x, 101 + y, 1, 8);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 4);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 1, 3);
        g2d.fillRect(116 + x, 110 + y, 1, 5);
        g2d.fillRect(115 + x, 113 + y, 1, 1);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(113 + x, 115 + y, 2, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 5);
        g2d.fillRect(115 + x, 117 + y, 1, 2);
        g2d.fillRect(113 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 1);
        g2d.fillRect(111 + x, 120 + y, 1, 3);
        g2d.fillRect(113 + x, 120 + y, 1, 4);
        g2d.fillRect(118 + x, 120 + y, 1, 3);
        g2d.fillRect(114 + x, 121 + y, 1, 1);
        g2d.fillRect(116 + x, 121 + y, 2, 1);
        g2d.fillRect(115 + x, 122 + y, 1, 1);
        g2d.fillRect(114 + x, 123 + y, 1, 1);
        g2d.fillRect(117 + x, 123 + y, 1, 1);
        g2d.fillRect(115 + x, 124 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 8);
        g2d.fillRect(117 + x, 92 + y, 2, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 10);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 6);
        g2d.fillRect(115 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 3);
        g2d.fillRect(114 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(115 + x, 119 + y, 1, 1);
        g2d.fillRect(114 + x, 120 + y, 1, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 1);
        g2d.fillRect(112 + x, 122 + y, 1, 2);
        g2d.fillRect(116 + x, 122 + y, 1, 2);
        g2d.fillRect(117 + x, 122 + y, 1, 1);
        g2d.fillRect(111 + x, 123 + y, 1, 1);
        g2d.fillRect(115 + x, 123 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
    }
    private void r5(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 14);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 9);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 96 + y, 1, 6);
        g2d.fillRect(112 + x, 99 + y, 1, 9);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(118 + x, 104 + y, 1, 12);
        g2d.fillRect(111 + x, 107 + y, 1, 4);
        g2d.fillRect(119 + x, 109 + y, 1, 8);
        g2d.fillRect(110 + x, 110 + y, 1, 7);
        g2d.fillRect(117 + x, 111 + y, 1, 2);
        g2d.fillRect(112 + x, 112 + y, 1, 1);
        g2d.fillRect(116 + x, 112 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 116 + y, 1, 1);
        g2d.fillRect(120 + x, 116 + y, 1, 7);
        g2d.fillRect(108 + x, 117 + y, 1, 3);
        g2d.fillRect(115 + x, 117 + y, 1, 1);
        g2d.fillRect(107 + x, 119 + y, 1, 1);
        g2d.fillRect(109 + x, 119 + y, 1, 2);
        g2d.fillRect(110 + x, 120 + y, 1, 1);
        g2d.fillRect(111 + x, 121 + y, 4, 1);
        g2d.fillRect(119 + x, 121 + y, 1, 2);
        g2d.fillRect(115 + x, 122 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(114 + x, 92 + y, 1, 7);
        g2d.fillRect(120 + x, 92 + y, 1, 4);
        g2d.fillRect(119 + x, 96 + y, 1, 4);
        g2d.fillRect(113 + x, 99 + y, 1, 8);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 4);
        g2d.fillRect(112 + x, 108 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 3);
        g2d.fillRect(111 + x, 113 + y, 1, 4);
        g2d.fillRect(114 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 113 + y, 1, 2);
        g2d.fillRect(117 + x, 113 + y, 1, 1);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 1, 1);
        g2d.fillRect(118 + x, 116 + y, 1, 1);
        g2d.fillRect(109 + x, 117 + y, 1, 2);
        g2d.fillRect(110 + x, 117 + y, 1, 3);
        g2d.fillRect(116 + x, 117 + y, 1, 1);
        g2d.fillRect(119 + x, 117 + y, 1, 4);
        g2d.fillRect(112 + x, 118 + y, 1, 1);
        g2d.fillRect(115 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(118 + x, 120 + y, 1, 2);
        g2d.fillRect(116 + x, 121 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 2, 1);
        g2d.fillRect(115 + x, 92 + y, 1, 10);
        g2d.fillRect(118 + x, 92 + y, 1, 12);
        g2d.fillRect(119 + x, 93 + y, 1, 3);
        g2d.fillRect(116 + x, 97 + y, 1, 2);
        g2d.fillRect(114 + x, 99 + y, 1, 7);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 2);
        g2d.fillRect(117 + x, 104 + y, 1, 3);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 107 + y, 1, 5);
        g2d.fillRect(112 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 112 + y, 1, 1);
        g2d.fillRect(113 + x, 112 + y, 2, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 5);
        g2d.fillRect(115 + x, 114 + y, 1, 2);
        g2d.fillRect(113 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 117 + y, 1, 3);
        g2d.fillRect(113 + x, 117 + y, 1, 4);
        g2d.fillRect(118 + x, 117 + y, 1, 3);
        g2d.fillRect(114 + x, 118 + y, 1, 1);
        g2d.fillRect(116 + x, 118 + y, 2, 1);
        g2d.fillRect(115 + x, 119 + y, 1, 1);
        g2d.fillRect(114 + x, 120 + y, 1, 1);
        g2d.fillRect(117 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 121 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 6);
        g2d.fillRect(117 + x, 92 + y, 1, 12);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 6);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 107 + y, 1, 5);
        g2d.fillRect(115 + x, 107 + y, 1, 3);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 2);
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 1);
        g2d.fillRect(114 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 119 + y, 1, 2);
        g2d.fillRect(116 + x, 119 + y, 1, 2);
        g2d.fillRect(117 + x, 119 + y, 1, 1);
        g2d.fillRect(111 + x, 120 + y, 1, 1);
        g2d.fillRect(115 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
    }
    private void r6(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 15);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 15);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 97 + y, 1, 4);
        g2d.fillRect(119 + x, 101 + y, 1, 3);
        g2d.fillRect(118 + x, 104 + y, 1, 8);
        g2d.fillRect(112 + x, 105 + y, 1, 2);
        g2d.fillRect(111 + x, 107 + y, 1, 2);
        g2d.fillRect(119 + x, 107 + y, 1, 6);
        g2d.fillRect(110 + x, 108 + y, 1, 5);
        g2d.fillRect(117 + x, 109 + y, 1, 2);
        g2d.fillRect(109 + x, 112 + y, 1, 1);
        g2d.fillRect(120 + x, 112 + y, 1, 7);
        g2d.fillRect(108 + x, 113 + y, 1, 3);
        g2d.fillRect(115 + x, 113 + y, 1, 1);
        g2d.fillRect(109 + x, 115 + y, 1, 2);
        g2d.fillRect(110 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 117 + y, 4, 1);
        g2d.fillRect(119 + x, 117 + y, 1, 2);
        g2d.fillRect(115 + x, 118 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 5);
        g2d.fillRect(114 + x, 93 + y, 1, 12);
        g2d.fillRect(119 + x, 97 + y, 1, 2);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 2);
        g2d.fillRect(112 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 108 + y, 1, 1);
        g2d.fillRect(111 + x, 109 + y, 1, 4);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 2);
        g2d.fillRect(113 + x, 112 + y, 1, 1);
        g2d.fillRect(118 + x, 112 + y, 1, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 2);
        g2d.fillRect(110 + x, 113 + y, 1, 3);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(119 + x, 113 + y, 1, 4);
        g2d.fillRect(112 + x, 114 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 1);
        g2d.fillRect(118 + x, 116 + y, 1, 2);
        g2d.fillRect(116 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 14);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(118 + x, 93 + y, 1, 8);
        g2d.fillRect(119 + x, 94 + y, 1, 3);
        g2d.fillRect(116 + x, 98 + y, 1, 3);
        g2d.fillRect(119 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 2);
        g2d.fillRect(116 + x, 103 + y, 1, 7);
        g2d.fillRect(117 + x, 104 + y, 1, 3);
        g2d.fillRect(114 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 4);
        g2d.fillRect(115 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 1);
        g2d.fillRect(116 + x, 112 + y, 1, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 3);
        g2d.fillRect(113 + x, 113 + y, 1, 4);
        g2d.fillRect(118 + x, 113 + y, 1, 3);
        g2d.fillRect(114 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 2, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(117 + x, 116 + y, 1, 1);
        g2d.fillRect(115 + x, 117 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 7);
        g2d.fillRect(117 + x, 92 + y, 1, 9);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 2);
        g2d.fillRect(117 + x, 102 + y, 1, 2);
        g2d.fillRect(113 + x, 107 + y, 3, 1);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 1);
        g2d.fillRect(114 + x, 113 + y, 1, 1);
        g2d.fillRect(117 + x, 113 + y, 1, 1);
        g2d.fillRect(112 + x, 115 + y, 1, 2);
        g2d.fillRect(116 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 115 + y, 1, 1);
        g2d.fillRect(111 + x, 116 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
    }
    private void r7(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(116 + x, 84 + y, 4, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 11);
        g2d.fillRect(110 + x, 85 + y, 6, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 86 + y, 1, 5);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 13);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 3, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 3);
        g2d.fillRect(119 + x, 97 + y, 1, 3);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 6);
        g2d.fillRect(112 + x, 103 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 5);
        g2d.fillRect(111 + x, 104 + y, 1, 4);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(121 + x, 107 + y, 1, 6);
        g2d.fillRect(109 + x, 108 + y, 1, 2);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 111 + y, 4, 1);
        g2d.fillRect(120 + x, 111 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(115 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(116 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 85 + y, 2, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 2, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 1);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 2);
        g2d.fillRect(114 + x, 93 + y, 1, 10);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 104 + y, 1, 2);
        g2d.fillRect(114 + x, 104 + y, 1, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 3);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 1);
        g2d.fillRect(110 + x, 108 + y, 2, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(120 + x, 108 + y, 1, 3);
        g2d.fillRect(111 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(119 + x, 110 + y, 1, 2);
        g2d.fillRect(117 + x, 111 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 4, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 90 + y, 1, 1);
        g2d.fillRect(114 + x, 91 + y, 1, 2);
        g2d.fillRect(115 + x, 91 + y, 1, 12);
        g2d.fillRect(119 + x, 92 + y, 1, 2);
        g2d.fillRect(118 + x, 93 + y, 1, 4);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
        g2d.fillRect(116 + x, 99 + y, 1, 2);
        g2d.fillRect(117 + x, 100 + y, 1, 6);
        g2d.fillRect(118 + x, 101 + y, 1, 2);
        g2d.fillRect(116 + x, 102 + y, 1, 1);
        g2d.fillRect(113 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 106 + y, 1, 3);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 108 + y, 1, 2);
        g2d.fillRect(114 + x, 108 + y, 1, 3);
        g2d.fillRect(119 + x, 108 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 86 + y, 2, 1);
        g2d.fillRect(115 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(118 + x, 90 + y, 2, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 3);
        g2d.fillRect(117 + x, 92 + y, 1, 5);
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 98 + y, 1, 2);
        g2d.fillRect(114 + x, 103 + y, 3, 1);
        g2d.fillRect(115 + x, 104 + y, 1, 3);
        g2d.fillRect(114 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 1);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(118 + x, 108 + y, 1, 2);
        g2d.fillRect(113 + x, 109 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 2);
        g2d.fillRect(112 + x, 110 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(111 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
    }

    private void l1(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 7);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 6);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 8);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(110 + x, 94 + y, 1, 9);
        g2d.fillRect(109 + x, 98 + y, 1, 2);
        g2d.fillRect(103 + x, 101 + y, 1, 4);
        g2d.fillRect(109 + x, 101 + y, 1, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 13);
        g2d.fillRect(104 + x, 105 + y, 1, 3);
        g2d.fillRect(110 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 108 + y, 1, 6);
        g2d.fillRect(112 + x, 113 + y, 1, 4);
        g2d.fillRect(104 + x, 114 + y, 1, 3);
        g2d.fillRect(113 + x, 116 + y, 1, 9);
        g2d.fillRect(103 + x, 117 + y, 1, 1);
        g2d.fillRect(102 + x, 118 + y, 1, 5);
        g2d.fillRect(103 + x, 119 + y, 1, 1);
        g2d.fillRect(101 + x, 120 + y, 1, 2);
        g2d.fillRect(107 + x, 121 + y, 1, 1);
        g2d.fillRect(112 + x, 121 + y, 1, 6);
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(106 + x, 122 + y, 1, 1);
        g2d.fillRect(109 + x, 122 + y, 1, 1);
        g2d.fillRect(104 + x, 123 + y, 2, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 1);
        g2d.fillRect(105 + x, 124 + y, 3, 1);
        g2d.fillRect(110 + x, 124 + y, 2, 1);
        g2d.fillRect(106 + x, 125 + y, 2, 1);
        g2d.fillRect(111 + x, 125 + y, 1, 2);
        g2d.fillRect(108 + x, 126 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 1, 3);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(109 + x, 95 + y, 1, 3);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 100 + y, 1, 1);
        g2d.fillRect(109 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 102 + y, 1, 3);
        g2d.fillRect(109 + x, 102 + y, 1, 1);
        g2d.fillRect(110 + x, 103 + y, 1, 2);
        g2d.fillRect(105 + x, 105 + y, 1, 3);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(106 + x, 108 + y, 1, 4);
        g2d.fillRect(110 + x, 108 + y, 1, 6);
        g2d.fillRect(107 + x, 112 + y, 1, 2);
        g2d.fillRect(106 + x, 113 + y, 1, 4);
        g2d.fillRect(105 + x, 114 + y, 1, 4);
        g2d.fillRect(108 + x, 115 + y, 1, 1);
        g2d.fillRect(109 + x, 116 + y, 1, 3);
        g2d.fillRect(111 + x, 116 + y, 1, 2);
        g2d.fillRect(104 + x, 117 + y, 1, 6);
        g2d.fillRect(112 + x, 117 + y, 1, 4);
        g2d.fillRect(103 + x, 118 + y, 1, 1);
        g2d.fillRect(105 + x, 119 + y, 1, 1);
        g2d.fillRect(108 + x, 119 + y, 1, 4);
        g2d.fillRect(103 + x, 120 + y, 1, 2);
        g2d.fillRect(111 + x, 120 + y, 1, 4);
        g2d.fillRect(109 + x, 121 + y, 1, 1);
        g2d.fillRect(105 + x, 122 + y, 1, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 2);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(110 + x, 123 + y, 1, 1);
        g2d.fillRect(108 + x, 124 + y, 2, 1);
        g2d.fillRect(110 + x, 125 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 5);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 2, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 3);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 8);
        g2d.fillRect(108 + x, 95 + y, 1, 4);
        g2d.fillRect(103 + x, 96 + y, 1, 4);
        g2d.fillRect(106 + x, 96 + y, 1, 4);
        g2d.fillRect(107 + x, 98 + y, 1, 4);
        g2d.fillRect(108 + x, 100 + y, 1, 9);
        g2d.fillRect(105 + x, 101 + y, 1, 4);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(106 + x, 105 + y, 1, 3);
        g2d.fillRect(107 + x, 107 + y, 1, 5);
        g2d.fillRect(109 + x, 108 + y, 1, 5);
        g2d.fillRect(106 + x, 112 + y, 1, 1);
        g2d.fillRect(108 + x, 113 + y, 1, 2);
        g2d.fillRect(107 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 115 + y, 2, 1);
        g2d.fillRect(108 + x, 116 + y, 1, 2);
        g2d.fillRect(110 + x, 116 + y, 1, 6);
        g2d.fillRect(107 + x, 117 + y, 1, 2);
        g2d.fillRect(105 + x, 118 + y, 2, 1);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(106 + x, 119 + y, 1, 1);
        g2d.fillRect(109 + x, 120 + y, 1, 1);
        g2d.fillRect(105 + x, 121 + y, 2, 1);
        g2d.fillRect(108 + x, 125 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 3);
        g2d.fillRect(105 + x, 96 + y, 1, 5);
        g2d.fillRect(106 + x, 100 + y, 1, 5);
        g2d.fillRect(107 + x, 102 + y, 1, 5);
        g2d.fillRect(108 + x, 109 + y, 1, 4);
        g2d.fillRect(109 + x, 113 + y, 1, 2);
        g2d.fillRect(110 + x, 114 + y, 1, 1);
        g2d.fillRect(107 + x, 115 + y, 1, 2);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(106 + x, 117 + y, 1, 1);
        g2d.fillRect(108 + x, 118 + y, 1, 1);
        g2d.fillRect(107 + x, 119 + y, 1, 2);
        g2d.fillRect(109 + x, 119 + y, 1, 1);
        g2d.fillRect(105 + x, 120 + y, 2, 1);
        g2d.fillRect(110 + x, 122 + y, 1, 1);
        g2d.fillRect(109 + x, 123 + y, 1, 1);
    }
    private void l2(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 14);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 14);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(102 + x, 101 + y, 1, 4);
        g2d.fillRect(108 + x, 101 + y, 1, 1);
        g2d.fillRect(110 + x, 102 + y, 1, 13);
        g2d.fillRect(103 + x, 105 + y, 1, 3);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 108 + y, 1, 6);
        g2d.fillRect(111 + x, 113 + y, 1, 4);
        g2d.fillRect(103 + x, 114 + y, 1, 3);
        g2d.fillRect(112 + x, 116 + y, 1, 9);
        g2d.fillRect(102 + x, 117 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 5);
        g2d.fillRect(102 + x, 119 + y, 1, 1);
        g2d.fillRect(100 + x, 120 + y, 1, 2);
        g2d.fillRect(106 + x, 121 + y, 1, 1);
        g2d.fillRect(111 + x, 121 + y, 1, 6);
        g2d.fillRect(102 + x, 122 + y, 1, 1);
        g2d.fillRect(105 + x, 122 + y, 1, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(103 + x, 123 + y, 2, 1);
        g2d.fillRect(107 + x, 123 + y, 1, 1);
        g2d.fillRect(104 + x, 124 + y, 3, 1);
        g2d.fillRect(109 + x, 124 + y, 2, 1);
        g2d.fillRect(105 + x, 125 + y, 2, 1);
        g2d.fillRect(110 + x, 125 + y, 1, 2);
        g2d.fillRect(107 + x, 126 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 2, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 3);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 3);
        g2d.fillRect(108 + x, 102 + y, 1, 1);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(104 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 108 + y, 1, 4);
        g2d.fillRect(109 + x, 108 + y, 1, 6);
        g2d.fillRect(106 + x, 112 + y, 1, 2);
        g2d.fillRect(105 + x, 113 + y, 1, 4);
        g2d.fillRect(104 + x, 114 + y, 1, 4);
        g2d.fillRect(107 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 116 + y, 1, 3);
        g2d.fillRect(110 + x, 116 + y, 1, 2);
        g2d.fillRect(103 + x, 117 + y, 1, 6);
        g2d.fillRect(111 + x, 117 + y, 1, 4);
        g2d.fillRect(102 + x, 118 + y, 1, 1);
        g2d.fillRect(104 + x, 119 + y, 1, 1);
        g2d.fillRect(107 + x, 119 + y, 1, 4);
        g2d.fillRect(102 + x, 120 + y, 1, 2);
        g2d.fillRect(110 + x, 120 + y, 1, 4);
        g2d.fillRect(108 + x, 121 + y, 1, 1);
        g2d.fillRect(104 + x, 122 + y, 1, 1);
        g2d.fillRect(106 + x, 122 + y, 1, 2);
        g2d.fillRect(105 + x, 123 + y, 1, 1);
        g2d.fillRect(109 + x, 123 + y, 1, 1);
        g2d.fillRect(107 + x, 124 + y, 2, 1);
        g2d.fillRect(109 + x, 125 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 2, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 94 + y, 1, 8);
        g2d.fillRect(104 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 4);
        g2d.fillRect(102 + x, 96 + y, 1, 4);
        g2d.fillRect(105 + x, 96 + y, 1, 4);
        g2d.fillRect(106 + x, 98 + y, 1, 4);
        g2d.fillRect(107 + x, 100 + y, 1, 9);
        g2d.fillRect(104 + x, 101 + y, 1, 4);
        g2d.fillRect(108 + x, 103 + y, 1, 2);
        g2d.fillRect(105 + x, 105 + y, 1, 3);
        g2d.fillRect(106 + x, 107 + y, 1, 5);
        g2d.fillRect(108 + x, 108 + y, 1, 5);
        g2d.fillRect(105 + x, 112 + y, 1, 1);
        g2d.fillRect(107 + x, 113 + y, 1, 2);
        g2d.fillRect(106 + x, 114 + y, 1, 1);
        g2d.fillRect(108 + x, 115 + y, 2, 1);
        g2d.fillRect(107 + x, 116 + y, 1, 2);
        g2d.fillRect(109 + x, 116 + y, 1, 6);
        g2d.fillRect(106 + x, 117 + y, 1, 2);
        g2d.fillRect(104 + x, 118 + y, 2, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 2);
        g2d.fillRect(105 + x, 119 + y, 1, 1);
        g2d.fillRect(108 + x, 120 + y, 1, 1);
        g2d.fillRect(104 + x, 121 + y, 2, 1);
        g2d.fillRect(107 + x, 125 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 5);
        g2d.fillRect(105 + x, 100 + y, 1, 5);
        g2d.fillRect(106 + x, 102 + y, 1, 5);
        g2d.fillRect(107 + x, 109 + y, 1, 4);
        g2d.fillRect(108 + x, 113 + y, 1, 2);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(106 + x, 115 + y, 1, 2);
        g2d.fillRect(110 + x, 115 + y, 1, 1);
        g2d.fillRect(105 + x, 117 + y, 1, 1);
        g2d.fillRect(107 + x, 118 + y, 1, 1);
        g2d.fillRect(106 + x, 119 + y, 1, 2);
        g2d.fillRect(108 + x, 119 + y, 1, 1);
        g2d.fillRect(104 + x, 120 + y, 2, 1);
        g2d.fillRect(109 + x, 122 + y, 1, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 1);
    }
    private void l3(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 18);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 26);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 2);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(107 + x, 101 + y, 2, 1);
        g2d.fillRect(108 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 3);
        g2d.fillRect(108 + x, 105 + y, 1, 3);
        g2d.fillRect(103 + x, 108 + y, 1, 6);
        g2d.fillRect(110 + x, 113 + y, 1, 4);
        g2d.fillRect(102 + x, 114 + y, 1, 3);
        g2d.fillRect(111 + x, 116 + y, 1, 9);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 118 + y, 1, 5);
        g2d.fillRect(101 + x, 119 + y, 1, 1);
        g2d.fillRect(99 + x, 120 + y, 1, 2);
        g2d.fillRect(105 + x, 121 + y, 1, 1);
        g2d.fillRect(110 + x, 121 + y, 1, 6);
        g2d.fillRect(101 + x, 122 + y, 1, 1);
        g2d.fillRect(104 + x, 122 + y, 1, 1);
        g2d.fillRect(107 + x, 122 + y, 1, 1);
        g2d.fillRect(102 + x, 123 + y, 2, 1);
        g2d.fillRect(106 + x, 123 + y, 1, 1);
        g2d.fillRect(103 + x, 124 + y, 3, 1);
        g2d.fillRect(108 + x, 124 + y, 2, 1);
        g2d.fillRect(104 + x, 125 + y, 2, 1);
        g2d.fillRect(109 + x, 125 + y, 1, 2);
        g2d.fillRect(106 + x, 126 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(103 + x, 93 + y, 2, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 1);
        g2d.fillRect(108 + x, 95 + y, 1, 3);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(102 + x, 100 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 3);
        g2d.fillRect(107 + x, 102 + y, 1, 1);
        g2d.fillRect(108 + x, 103 + y, 1, 2);
        g2d.fillRect(103 + x, 105 + y, 1, 3);
        g2d.fillRect(107 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 108 + y, 1, 4);
        g2d.fillRect(108 + x, 108 + y, 1, 6);
        g2d.fillRect(105 + x, 112 + y, 1, 2);
        g2d.fillRect(104 + x, 113 + y, 1, 4);
        g2d.fillRect(103 + x, 114 + y, 1, 4);
        g2d.fillRect(106 + x, 115 + y, 1, 1);
        g2d.fillRect(107 + x, 116 + y, 1, 3);
        g2d.fillRect(109 + x, 116 + y, 1, 2);
        g2d.fillRect(102 + x, 117 + y, 1, 6);
        g2d.fillRect(110 + x, 117 + y, 1, 4);
        g2d.fillRect(101 + x, 118 + y, 1, 1);
        g2d.fillRect(103 + x, 119 + y, 1, 1);
        g2d.fillRect(106 + x, 119 + y, 1, 4);
        g2d.fillRect(101 + x, 120 + y, 1, 2);
        g2d.fillRect(109 + x, 120 + y, 1, 4);
        g2d.fillRect(107 + x, 121 + y, 1, 1);
        g2d.fillRect(103 + x, 122 + y, 1, 1);
        g2d.fillRect(105 + x, 122 + y, 1, 2);
        g2d.fillRect(104 + x, 123 + y, 1, 1);
        g2d.fillRect(108 + x, 123 + y, 1, 1);
        g2d.fillRect(106 + x, 124 + y, 2, 1);
        g2d.fillRect(108 + x, 125 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 3);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 2, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 2);
        g2d.fillRect(106 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 94 + y, 1, 11);
        g2d.fillRect(104 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 95 + y, 1, 4);
        g2d.fillRect(102 + x, 96 + y, 1, 4);
        g2d.fillRect(105 + x, 96 + y, 1, 4);
        g2d.fillRect(106 + x, 98 + y, 1, 11);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 1);
        g2d.fillRect(105 + x, 101 + y, 1, 1);
        g2d.fillRect(107 + x, 103 + y, 1, 2);
        g2d.fillRect(104 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 107 + y, 1, 5);
        g2d.fillRect(107 + x, 108 + y, 1, 5);
        g2d.fillRect(104 + x, 112 + y, 1, 1);
        g2d.fillRect(106 + x, 113 + y, 1, 2);
        g2d.fillRect(105 + x, 114 + y, 1, 1);
        g2d.fillRect(107 + x, 115 + y, 2, 1);
        g2d.fillRect(106 + x, 116 + y, 1, 2);
        g2d.fillRect(108 + x, 116 + y, 1, 6);
        g2d.fillRect(105 + x, 117 + y, 1, 2);
        g2d.fillRect(103 + x, 118 + y, 2, 1);
        g2d.fillRect(109 + x, 118 + y, 1, 2);
        g2d.fillRect(104 + x, 119 + y, 1, 1);
        g2d.fillRect(107 + x, 120 + y, 1, 1);
        g2d.fillRect(103 + x, 121 + y, 2, 1);
        g2d.fillRect(106 + x, 125 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 2);
        g2d.fillRect(106 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 9);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(105 + x, 102 + y, 1, 5);
        g2d.fillRect(106 + x, 109 + y, 1, 4);
        g2d.fillRect(107 + x, 113 + y, 1, 2);
        g2d.fillRect(108 + x, 114 + y, 1, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 2);
        g2d.fillRect(109 + x, 115 + y, 1, 1);
        g2d.fillRect(104 + x, 117 + y, 1, 1);
        g2d.fillRect(106 + x, 118 + y, 1, 1);
        g2d.fillRect(105 + x, 119 + y, 1, 2);
        g2d.fillRect(107 + x, 119 + y, 1, 1);
        g2d.fillRect(103 + x, 120 + y, 2, 1);
        g2d.fillRect(108 + x, 122 + y, 1, 1);
        g2d.fillRect(107 + x, 123 + y, 1, 1);
    }
    private void l4(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 13);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 13);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 100 + y, 1, 4);
        g2d.fillRect(108 + x, 100 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 8);
        g2d.fillRect(103 + x, 104 + y, 1, 2);
        g2d.fillRect(109 + x, 104 + y, 1, 4);
        g2d.fillRect(104 + x, 106 + y, 1, 3);
        g2d.fillRect(105 + x, 109 + y, 1, 2);
        g2d.fillRect(111 + x, 109 + y, 1, 3);
        g2d.fillRect(104 + x, 111 + y, 1, 2);
        g2d.fillRect(112 + x, 111 + y, 1, 3);
        g2d.fillRect(103 + x, 113 + y, 1, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 8);
        g2d.fillRect(102 + x, 114 + y, 1, 5);
        g2d.fillRect(103 + x, 115 + y, 1, 1);
        g2d.fillRect(101 + x, 116 + y, 1, 2);
        g2d.fillRect(107 + x, 117 + y, 1, 1);
        g2d.fillRect(112 + x, 117 + y, 1, 6);
        g2d.fillRect(103 + x, 118 + y, 1, 1);
        g2d.fillRect(106 + x, 118 + y, 1, 1);
        g2d.fillRect(109 + x, 118 + y, 1, 1);
        g2d.fillRect(104 + x, 119 + y, 2, 1);
        g2d.fillRect(108 + x, 119 + y, 1, 1);
        g2d.fillRect(105 + x, 120 + y, 3, 1);
        g2d.fillRect(110 + x, 120 + y, 2, 1);
        g2d.fillRect(106 + x, 121 + y, 2, 1);
        g2d.fillRect(111 + x, 121 + y, 1, 2);
        g2d.fillRect(108 + x, 122 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 3);
        g2d.fillRect(107 + x, 98 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 1);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 3);
        g2d.fillRect(108 + x, 101 + y, 1, 1);
        g2d.fillRect(109 + x, 102 + y, 1, 2);
        g2d.fillRect(104 + x, 104 + y, 1, 2);
        g2d.fillRect(108 + x, 104 + y, 1, 4);
        g2d.fillRect(105 + x, 107 + y, 1, 2);
        g2d.fillRect(107 + x, 107 + y, 1, 1);
        g2d.fillRect(109 + x, 108 + y, 1, 1);
        g2d.fillRect(106 + x, 109 + y, 1, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 2);
        g2d.fillRect(107 + x, 110 + y, 1, 1);
        g2d.fillRect(105 + x, 111 + y, 1, 3);
        g2d.fillRect(106 + x, 111 + y, 1, 3);
        g2d.fillRect(108 + x, 112 + y, 1, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 6);
        g2d.fillRect(109 + x, 113 + y, 1, 2);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(103 + x, 114 + y, 1, 1);
        g2d.fillRect(112 + x, 114 + y, 1, 3);
        g2d.fillRect(105 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 115 + y, 1, 4);
        g2d.fillRect(103 + x, 116 + y, 1, 2);
        g2d.fillRect(111 + x, 116 + y, 1, 4);
        g2d.fillRect(109 + x, 117 + y, 1, 1);
        g2d.fillRect(105 + x, 118 + y, 1, 1);
        g2d.fillRect(107 + x, 118 + y, 1, 2);
        g2d.fillRect(106 + x, 119 + y, 1, 1);
        g2d.fillRect(110 + x, 119 + y, 1, 1);
        g2d.fillRect(108 + x, 120 + y, 2, 1);
        g2d.fillRect(110 + x, 121 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 9);
        g2d.fillRect(104 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 4);
        g2d.fillRect(102 + x, 95 + y, 1, 4);
        g2d.fillRect(105 + x, 95 + y, 1, 4);
        g2d.fillRect(106 + x, 97 + y, 1, 4);
        g2d.fillRect(107 + x, 99 + y, 1, 8);
        g2d.fillRect(104 + x, 100 + y, 1, 4);
        g2d.fillRect(108 + x, 102 + y, 1, 2);
        g2d.fillRect(105 + x, 104 + y, 1, 3);
        g2d.fillRect(106 + x, 106 + y, 1, 3);
        g2d.fillRect(107 + x, 108 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 1, 1);
        g2d.fillRect(109 + x, 109 + y, 1, 2);
        g2d.fillRect(106 + x, 110 + y, 1, 1);
        g2d.fillRect(107 + x, 111 + y, 2, 1);
        g2d.fillRect(109 + x, 112 + y, 2, 1);
        g2d.fillRect(108 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 113 + y, 1, 5);
        g2d.fillRect(105 + x, 114 + y, 3, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 115 + y, 1, 1);
        g2d.fillRect(109 + x, 116 + y, 1, 1);
        g2d.fillRect(105 + x, 117 + y, 2, 1);
        g2d.fillRect(108 + x, 121 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(104 + x, 95 + y, 1, 5);
        g2d.fillRect(105 + x, 99 + y, 1, 5);
        g2d.fillRect(106 + x, 101 + y, 1, 5);
        g2d.fillRect(108 + x, 109 + y, 1, 2);
        g2d.fillRect(109 + x, 111 + y, 2, 1);
        g2d.fillRect(107 + x, 112 + y, 1, 2);
        g2d.fillRect(111 + x, 112 + y, 1, 1);
        g2d.fillRect(108 + x, 114 + y, 1, 1);
        g2d.fillRect(107 + x, 115 + y, 1, 2);
        g2d.fillRect(109 + x, 115 + y, 1, 1);
        g2d.fillRect(105 + x, 116 + y, 2, 1);
        g2d.fillRect(110 + x, 118 + y, 1, 1);
        g2d.fillRect(109 + x, 119 + y, 1, 1);
    }
    private void l5(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 13);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 11);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 97 + y, 1, 2);
        g2d.fillRect(102 + x, 99 + y, 1, 3);
        g2d.fillRect(110 + x, 99 + y, 1, 8);
        g2d.fillRect(103 + x, 102 + y, 1, 2);
        g2d.fillRect(109 + x, 102 + y, 1, 4);
        g2d.fillRect(104 + x, 104 + y, 1, 5);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(112 + x, 108 + y, 1, 2);
        g2d.fillRect(103 + x, 109 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 8);
        g2d.fillRect(102 + x, 110 + y, 1, 5);
        g2d.fillRect(103 + x, 111 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(107 + x, 113 + y, 1, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 6);
        g2d.fillRect(103 + x, 114 + y, 1, 1);
        g2d.fillRect(106 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 1);
        g2d.fillRect(104 + x, 115 + y, 2, 1);
        g2d.fillRect(108 + x, 115 + y, 1, 1);
        g2d.fillRect(105 + x, 116 + y, 3, 1);
        g2d.fillRect(110 + x, 116 + y, 2, 1);
        g2d.fillRect(106 + x, 117 + y, 2, 1);
        g2d.fillRect(111 + x, 117 + y, 1, 2);
        g2d.fillRect(108 + x, 118 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 3);
        g2d.fillRect(107 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 99 + y, 1, 3);
        g2d.fillRect(108 + x, 99 + y, 1, 1);
        g2d.fillRect(109 + x, 100 + y, 1, 2);
        g2d.fillRect(104 + x, 102 + y, 1, 2);
        g2d.fillRect(108 + x, 102 + y, 1, 4);
        g2d.fillRect(105 + x, 105 + y, 1, 2);
        g2d.fillRect(107 + x, 105 + y, 1, 1);
        g2d.fillRect(109 + x, 106 + y, 1, 1);
        g2d.fillRect(107 + x, 107 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 108 + y, 1, 2);
        g2d.fillRect(106 + x, 108 + y, 1, 2);
        g2d.fillRect(108 + x, 108 + y, 1, 1);
        g2d.fillRect(104 + x, 109 + y, 1, 6);
        g2d.fillRect(109 + x, 109 + y, 1, 2);
        g2d.fillRect(111 + x, 109 + y, 1, 1);
        g2d.fillRect(103 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 3);
        g2d.fillRect(105 + x, 111 + y, 1, 1);
        g2d.fillRect(108 + x, 111 + y, 1, 4);
        g2d.fillRect(103 + x, 112 + y, 1, 2);
        g2d.fillRect(111 + x, 112 + y, 1, 4);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 1, 1);
        g2d.fillRect(107 + x, 114 + y, 1, 2);
        g2d.fillRect(106 + x, 115 + y, 1, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 1);
        g2d.fillRect(108 + x, 116 + y, 2, 1);
        g2d.fillRect(110 + x, 117 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 7);
        g2d.fillRect(104 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 4);
        g2d.fillRect(102 + x, 95 + y, 1, 4);
        g2d.fillRect(105 + x, 95 + y, 1, 4);
        g2d.fillRect(106 + x, 97 + y, 1, 2);
        g2d.fillRect(104 + x, 99 + y, 1, 3);
        g2d.fillRect(107 + x, 99 + y, 1, 6);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(105 + x, 102 + y, 1, 3);
        g2d.fillRect(106 + x, 104 + y, 1, 4);
        g2d.fillRect(107 + x, 106 + y, 2, 1);
        g2d.fillRect(109 + x, 107 + y, 1, 2);
        g2d.fillRect(110 + x, 108 + y, 1, 6);
        g2d.fillRect(108 + x, 109 + y, 1, 1);
        g2d.fillRect(105 + x, 110 + y, 3, 1);
        g2d.fillRect(111 + x, 110 + y, 1, 2);
        g2d.fillRect(106 + x, 111 + y, 1, 1);
        g2d.fillRect(109 + x, 112 + y, 1, 1);
        g2d.fillRect(105 + x, 113 + y, 2, 1);
        g2d.fillRect(108 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 3);
        g2d.fillRect(104 + x, 95 + y, 1, 4);
        g2d.fillRect(105 + x, 99 + y, 1, 3);
        g2d.fillRect(106 + x, 99 + y, 1, 5);
        g2d.fillRect(108 + x, 107 + y, 1, 1);
        g2d.fillRect(107 + x, 108 + y, 1, 2);
        g2d.fillRect(111 + x, 108 + y, 1, 1);
        g2d.fillRect(108 + x, 110 + y, 1, 1);
        g2d.fillRect(107 + x, 111 + y, 1, 2);
        g2d.fillRect(109 + x, 111 + y, 1, 1);
        g2d.fillRect(105 + x, 112 + y, 2, 1);
        g2d.fillRect(110 + x, 114 + y, 1, 1);
        g2d.fillRect(109 + x, 115 + y, 1, 1);
    }
    private void l6(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 12);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 2, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 10);
        g2d.fillRect(102 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(108 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(102 + x, 98 + y, 1, 3);
        g2d.fillRect(110 + x, 98 + y, 1, 7);
        g2d.fillRect(103 + x, 101 + y, 1, 3);
        g2d.fillRect(109 + x, 101 + y, 1, 2);
        g2d.fillRect(104 + x, 104 + y, 1, 3);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 105 + y, 1, 1);
        g2d.fillRect(112 + x, 106 + y, 1, 2);
        g2d.fillRect(103 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 8);
        g2d.fillRect(102 + x, 108 + y, 1, 5);
        g2d.fillRect(103 + x, 109 + y, 1, 1);
        g2d.fillRect(101 + x, 110 + y, 1, 2);
        g2d.fillRect(107 + x, 111 + y, 1, 1);
        g2d.fillRect(112 + x, 111 + y, 1, 6);
        g2d.fillRect(103 + x, 112 + y, 1, 1);
        g2d.fillRect(106 + x, 112 + y, 1, 1);
        g2d.fillRect(109 + x, 112 + y, 1, 1);
        g2d.fillRect(104 + x, 113 + y, 2, 1);
        g2d.fillRect(108 + x, 113 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 3, 1);
        g2d.fillRect(110 + x, 114 + y, 2, 1);
        g2d.fillRect(106 + x, 115 + y, 2, 1);
        g2d.fillRect(111 + x, 115 + y, 1, 2);
        g2d.fillRect(108 + x, 116 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(107 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 90 + y, 3, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 4);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(108 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 3);
        g2d.fillRect(108 + x, 98 + y, 1, 1);
        g2d.fillRect(109 + x, 99 + y, 1, 2);
        g2d.fillRect(104 + x, 101 + y, 1, 3);
        g2d.fillRect(108 + x, 101 + y, 1, 4);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(105 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 104 + y, 1, 2);
        g2d.fillRect(110 + x, 105 + y, 1, 1);
        g2d.fillRect(105 + x, 106 + y, 1, 2);
        g2d.fillRect(106 + x, 106 + y, 1, 2);
        g2d.fillRect(108 + x, 106 + y, 1, 1);
        g2d.fillRect(104 + x, 107 + y, 1, 6);
        g2d.fillRect(109 + x, 107 + y, 1, 2);
        g2d.fillRect(111 + x, 107 + y, 1, 1);
        g2d.fillRect(103 + x, 108 + y, 1, 1);
        g2d.fillRect(112 + x, 108 + y, 1, 3);
        g2d.fillRect(105 + x, 109 + y, 1, 1);
        g2d.fillRect(108 + x, 109 + y, 1, 4);
        g2d.fillRect(103 + x, 110 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 4);
        g2d.fillRect(109 + x, 111 + y, 1, 1);
        g2d.fillRect(105 + x, 112 + y, 1, 1);
        g2d.fillRect(107 + x, 112 + y, 1, 2);
        g2d.fillRect(106 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 113 + y, 1, 1);
        g2d.fillRect(108 + x, 114 + y, 2, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 2, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 92 + y, 1, 6);
        g2d.fillRect(104 + x, 92 + y, 1, 3);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(106 + x, 93 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 3);
        g2d.fillRect(102 + x, 95 + y, 1, 3);
        g2d.fillRect(105 + x, 95 + y, 1, 3);
        g2d.fillRect(106 + x, 96 + y, 1, 2);
        g2d.fillRect(104 + x, 98 + y, 1, 3);
        g2d.fillRect(107 + x, 98 + y, 1, 6);
        g2d.fillRect(108 + x, 99 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 1, 3);
        g2d.fillRect(106 + x, 103 + y, 1, 3);
        g2d.fillRect(109 + x, 105 + y, 1, 2);
        g2d.fillRect(110 + x, 106 + y, 1, 6);
        g2d.fillRect(108 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 108 + y, 3, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(106 + x, 109 + y, 1, 1);
        g2d.fillRect(109 + x, 110 + y, 1, 1);
        g2d.fillRect(105 + x, 111 + y, 2, 1);
        g2d.fillRect(108 + x, 115 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 2, 1);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 1, 2);
        g2d.fillRect(106 + x, 94 + y, 1, 2);
        g2d.fillRect(104 + x, 95 + y, 1, 3);
        g2d.fillRect(105 + x, 98 + y, 1, 3);
        g2d.fillRect(106 + x, 98 + y, 1, 5);
        g2d.fillRect(108 + x, 105 + y, 1, 1);
        g2d.fillRect(107 + x, 106 + y, 1, 2);
        g2d.fillRect(111 + x, 106 + y, 1, 1);
        g2d.fillRect(108 + x, 108 + y, 1, 1);
        g2d.fillRect(107 + x, 109 + y, 1, 2);
        g2d.fillRect(109 + x, 109 + y, 1, 1);
        g2d.fillRect(105 + x, 110 + y, 2, 1);
        g2d.fillRect(110 + x, 112 + y, 1, 1);
        g2d.fillRect(109 + x, 113 + y, 1, 1);
    }
    private void l7(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 3, 1);
        g2d.fillRect(104 + x, 84 + y, 3, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 8);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(103 + x, 88 + y, 1, 2);
        g2d.fillRect(108 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 1);
        g2d.fillRect(109 + x, 89 + y, 1, 12);
        g2d.fillRect(108 + x, 90 + y, 1, 2);
        g2d.fillRect(108 + x, 93 + y, 1, 1);
        g2d.fillRect(102 + x, 94 + y, 1, 3);
        g2d.fillRect(103 + x, 97 + y, 1, 5);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(110 + x, 101 + y, 1, 2);
        g2d.fillRect(102 + x, 102 + y, 1, 1);
        g2d.fillRect(111 + x, 102 + y, 1, 8);
        g2d.fillRect(101 + x, 103 + y, 1, 5);
        g2d.fillRect(102 + x, 104 + y, 1, 1);
        g2d.fillRect(100 + x, 105 + y, 1, 2);
        g2d.fillRect(106 + x, 106 + y, 1, 1);
        g2d.fillRect(110 + x, 106 + y, 1, 6);
        g2d.fillRect(102 + x, 107 + y, 1, 1);
        g2d.fillRect(105 + x, 107 + y, 1, 1);
        g2d.fillRect(108 + x, 107 + y, 1, 1);
        g2d.fillRect(103 + x, 108 + y, 2, 1);
        g2d.fillRect(107 + x, 108 + y, 1, 1);
        g2d.fillRect(104 + x, 109 + y, 3, 1);
        g2d.fillRect(109 + x, 109 + y, 1, 3);
        g2d.fillRect(105 + x, 110 + y, 2, 1);
        g2d.fillRect(107 + x, 111 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 3);
        g2d.fillRect(107 + x, 91 + y, 1, 1);
        g2d.fillRect(108 + x, 92 + y, 1, 1);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(103 + x, 94 + y, 1, 3);
        g2d.fillRect(108 + x, 94 + y, 1, 1);
        g2d.fillRect(104 + x, 97 + y, 1, 3);
        g2d.fillRect(108 + x, 97 + y, 1, 3);
        g2d.fillRect(106 + x, 99 + y, 1, 2);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 2);
        g2d.fillRect(105 + x, 101 + y, 1, 2);
        g2d.fillRect(107 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 6);
        g2d.fillRect(108 + x, 102 + y, 1, 2);
        g2d.fillRect(109 + x, 102 + y, 1, 1);
        g2d.fillRect(102 + x, 103 + y, 1, 1);
        g2d.fillRect(110 + x, 103 + y, 1, 3);
        g2d.fillRect(104 + x, 104 + y, 1, 1);
        g2d.fillRect(107 + x, 104 + y, 1, 4);
        g2d.fillRect(102 + x, 105 + y, 1, 2);
        g2d.fillRect(109 + x, 105 + y, 1, 4);
        g2d.fillRect(108 + x, 106 + y, 1, 1);
        g2d.fillRect(104 + x, 107 + y, 1, 1);
        g2d.fillRect(106 + x, 107 + y, 1, 2);
        g2d.fillRect(105 + x, 108 + y, 1, 1);
        g2d.fillRect(107 + x, 109 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 82 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 3, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 90 + y, 2, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 3);
        g2d.fillRect(104 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 91 + y, 1, 1);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 93 + y, 2, 1);
        g2d.fillRect(104 + x, 94 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 5);
        g2d.fillRect(108 + x, 95 + y, 1, 2);
        g2d.fillRect(105 + x, 97 + y, 1, 4);
        g2d.fillRect(106 + x, 98 + y, 1, 1);
        g2d.fillRect(108 + x, 100 + y, 1, 2);
        g2d.fillRect(107 + x, 102 + y, 1, 1);
        g2d.fillRect(104 + x, 103 + y, 3, 1);
        g2d.fillRect(109 + x, 103 + y, 1, 2);
        g2d.fillRect(105 + x, 104 + y, 1, 1);
        g2d.fillRect(108 + x, 105 + y, 1, 1);
        g2d.fillRect(104 + x, 106 + y, 2, 1);
        g2d.fillRect(107 + x, 110 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 86 + y, 2, 1);
        g2d.fillRect(103 + x, 90 + y, 2, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 2);
        g2d.fillRect(106 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 1);
        g2d.fillRect(105 + x, 94 + y, 1, 3);
        g2d.fillRect(106 + x, 94 + y, 1, 4);
        g2d.fillRect(107 + x, 100 + y, 1, 1);
        g2d.fillRect(106 + x, 101 + y, 1, 2);
        g2d.fillRect(109 + x, 101 + y, 1, 1);
        g2d.fillRect(107 + x, 103 + y, 1, 1);
        g2d.fillRect(106 + x, 104 + y, 1, 2);
        g2d.fillRect(108 + x, 104 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 2, 1);
        g2d.fillRect(108 + x, 108 + y, 1, 1);
    }
}

