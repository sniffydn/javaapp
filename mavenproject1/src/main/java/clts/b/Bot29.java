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
public class Bot29 extends SuperB
{
    /** Creates a new instance of GenericClothes */
    public Bot29()
    {
        super();
        jean = true;
        pant = true;
    }

    public Bot29(int layer)
    {
        super(layer);
        jean = true;
        pant = true;
    }

    public Bot29(ColorArray colorSwitch)
    {
        super(colorSwitch);
        jean = true;
        pant = true;
    }

    public Bot29(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
        jean = true;
        pant = true;
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
        

        if(step <= 12 && step > 3)
        {
            paintRight(offsetX,0,g2d);
        }
        else
        {
            paintLeft(offsetX,0,g2d);
        }
        paintT(offsetX,0,g2d);
    }

    private void paintRight(int x, int y, GraphicsMap g2d)
    {
        if(step == 0 || step == 8 || step == 9 || step == 15)
        {
            paint1(x,y,g2d);
        }else if(step == 11 || step == 12 || step == 13)
        {
            paint3(x,y,g2d);
        }else if(step == 1 || step == 7)
        {
            paint4(x,y,g2d);
        }else if(step == 2 || step == 6)
        {
            paint5(x,y,g2d);
        }else if(step == 3 || step == 5)
        {
            paint6(x,y,g2d);
        }else if(step == 10 || step == 14)
        {
            paint2(x,y,g2d);
        }else if(step == 4)
        {
            paint7(x,y,g2d);
        }
    }
    private void paintLeft(int x, int y, GraphicsMap g2d)
    {
        x+=7;
        if(step == 0 || step == 1 || step == 7 || step == 8)
        {
            paintBack1(x,y,g2d);
        }else if(step == 3 || step == 4 || step == 5)
        {
            paintBack3(x,y,g2d);
        }else if(step == 2 || step == 6)
        {
            paintBack2(x,y,g2d);
        }else if(step == 9 || step == 15)
        {
            paintBack4(x,y,g2d);
        }else if(step == 10 || step == 14)
        {
            paintBack5(x,y,g2d);
        }else if(step == 11 || step == 13)
        {
            paintBack6(x,y,g2d);
        }else if(step == 12)
        {
            paintBack7(x,y,g2d);
        }
    }
    public void paintT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(119 + x, 82 + y, 3, 1);
        g2d.fillRect(101 + x, 83 + y, 7, 1);
        g2d.fillRect(115 + x, 83 + y, 2, 1);
        g2d.fillRect(118 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 8);
        g2d.fillRect(108 + x, 84 + y, 2, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 4);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(113 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(106 + x, 85 + y, 1, 2);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 86 + y, 1, 2);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 3, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 83 + y, 2, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 3);
        g2d.fillRect(102 + x, 84 + y, 1, 4);
        g2d.fillRect(104 + x, 84 + y, 4, 1);
        g2d.fillRect(115 + x, 84 + y, 1, 7);
        g2d.fillRect(116 + x, 84 + y, 3, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 1, 3);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 8, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 7, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 5, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 88 + y, 1, 3);
        g2d.fillRect(110 + x, 88 + y, 3, 1);
        g2d.fillRect(114 + x, 88 + y, 1, 3);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 1, 2);
        g2d.fillRect(120 + x, 89 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 85 + y, 1, 2);
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 87 + y, 1, 4);
        g2d.fillRect(116 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(111 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(118 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 89 + y, 1, 1);
    }





    public void paint1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 3);
        g2d.fillRect(121 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 94 + y, 1, 8);
        g2d.fillRect(120 + x, 94 + y, 1, 7);
        g2d.fillRect(119 + x, 101 + y, 1, 4);
        g2d.fillRect(111 + x, 102 + y, 1, 11);
        g2d.fillRect(118 + x, 105 + y, 1, 3);
        g2d.fillRect(117 + x, 108 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(118 + x, 109 + y, 1, 2);
        g2d.fillRect(112 + x, 110 + y, 4, 1);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(113 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 2, 1);
        g2d.fillRect(110 + x, 113 + y, 1, 2);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(109 + x, 114 + y, 1, 4);
        g2d.fillRect(111 + x, 114 + y, 2, 1);
        g2d.fillRect(117 + x, 114 + y, 1, 2);
        g2d.fillRect(112 + x, 115 + y, 2, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 2);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(118 + x, 115 + y, 1, 3);
        g2d.fillRect(117 + x, 117 + y, 1, 2);
        g2d.fillRect(110 + x, 118 + y, 1, 2);
        g2d.fillRect(116 + x, 118 + y, 1, 2);
        g2d.fillRect(111 + x, 119 + y, 1, 2);
        g2d.fillRect(112 + x, 119 + y, 1, 2);
        g2d.fillRect(113 + x, 119 + y, 1, 1);
        g2d.fillRect(115 + x, 119 + y, 1, 2);
        g2d.fillRect(114 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 91 + y, 1, 8);
        g2d.fillRect(115 + x, 91 + y, 1, 5);
        g2d.fillRect(120 + x, 91 + y, 1, 3);
        g2d.fillRect(113 + x, 94 + y, 1, 11);
        g2d.fillRect(119 + x, 95 + y, 1, 6);
        g2d.fillRect(118 + x, 100 + y, 1, 5);
        g2d.fillRect(114 + x, 101 + y, 1, 1);
        g2d.fillRect(112 + x, 102 + y, 1, 8);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 108 + y, 1, 2);
        g2d.fillRect(114 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 3, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 1);
        g2d.fillRect(115 + x, 113 + y, 1, 1);
        g2d.fillRect(113 + x, 114 + y, 2, 1);
        g2d.fillRect(110 + x, 115 + y, 1, 3);
        g2d.fillRect(111 + x, 115 + y, 1, 1);
        g2d.fillRect(114 + x, 115 + y, 1, 2);
        g2d.fillRect(112 + x, 116 + y, 2, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 2);
        g2d.fillRect(117 + x, 116 + y, 1, 1);
        g2d.fillRect(111 + x, 118 + y, 3, 1);
        g2d.fillRect(115 + x, 118 + y, 1, 1);
        g2d.fillRect(114 + x, 119 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 91 + y, 1, 6);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 4);
        g2d.fillRect(118 + x, 95 + y, 1, 5);
        g2d.fillRect(115 + x, 96 + y, 1, 7);
        g2d.fillRect(114 + x, 99 + y, 1, 2);
        g2d.fillRect(117 + x, 100 + y, 1, 4);
        g2d.fillRect(114 + x, 102 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 1, 5);
        g2d.fillRect(114 + x, 104 + y, 1, 4);
        g2d.fillRect(113 + x, 105 + y, 1, 3);
        g2d.fillRect(117 + x, 105 + y, 1, 3);
        g2d.fillRect(115 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 2, 1);
        g2d.fillRect(111 + x, 116 + y, 1, 2);
        g2d.fillRect(112 + x, 117 + y, 1, 1);
        g2d.fillRect(115 + x, 117 + y, 1, 1);
        g2d.fillRect(114 + x, 118 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 1, 6);
        g2d.fillRect(116 + x, 97 + y, 1, 6);
        g2d.fillRect(115 + x, 103 + y, 1, 4);
        g2d.fillRect(112 + x, 112 + y, 1, 2);
        g2d.fillRect(113 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 98 + y, 1, 2);
    }





    public void paint2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 11);
        g2d.fillRect(121 + x, 91 + y, 1, 10);
        g2d.fillRect(120 + x, 101 + y, 1, 4);
        g2d.fillRect(112 + x, 102 + y, 1, 11);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(118 + x, 108 + y, 1, 2);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(119 + x, 109 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 4, 1);
        g2d.fillRect(118 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 2, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 2);
        g2d.fillRect(117 + x, 113 + y, 1, 1);
        g2d.fillRect(110 + x, 114 + y, 1, 4);
        g2d.fillRect(112 + x, 114 + y, 2, 1);
        g2d.fillRect(118 + x, 114 + y, 1, 2);
        g2d.fillRect(113 + x, 115 + y, 2, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 115 + y, 1, 1);
        g2d.fillRect(119 + x, 115 + y, 1, 3);
        g2d.fillRect(118 + x, 117 + y, 1, 2);
        g2d.fillRect(111 + x, 118 + y, 1, 2);
        g2d.fillRect(117 + x, 118 + y, 1, 2);
        g2d.fillRect(112 + x, 119 + y, 1, 2);
        g2d.fillRect(113 + x, 119 + y, 1, 2);
        g2d.fillRect(114 + x, 119 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 2);
        g2d.fillRect(115 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 91 + y, 1, 14);
        g2d.fillRect(115 + x, 91 + y, 1, 5);
        g2d.fillRect(120 + x, 91 + y, 1, 10);
        g2d.fillRect(119 + x, 100 + y, 1, 5);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(113 + x, 102 + y, 1, 8);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(114 + x, 108 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 3, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(114 + x, 114 + y, 2, 1);
        g2d.fillRect(111 + x, 115 + y, 1, 3);
        g2d.fillRect(112 + x, 115 + y, 1, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 2, 1);
        g2d.fillRect(117 + x, 116 + y, 1, 2);
        g2d.fillRect(118 + x, 116 + y, 1, 1);
        g2d.fillRect(112 + x, 118 + y, 3, 1);
        g2d.fillRect(116 + x, 118 + y, 1, 1);
        g2d.fillRect(115 + x, 119 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 91 + y, 1, 12);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 9);
        g2d.fillRect(118 + x, 95 + y, 1, 3);
        g2d.fillRect(115 + x, 96 + y, 1, 5);
        g2d.fillRect(118 + x, 100 + y, 1, 4);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(117 + x, 103 + y, 1, 5);
        g2d.fillRect(115 + x, 104 + y, 1, 4);
        g2d.fillRect(114 + x, 105 + y, 1, 3);
        g2d.fillRect(118 + x, 105 + y, 1, 3);
        g2d.fillRect(116 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 2, 1);
        g2d.fillRect(112 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 117 + y, 1, 1);
        g2d.fillRect(115 + x, 118 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 1, 5);
        g2d.fillRect(117 + x, 98 + y, 1, 5);
        g2d.fillRect(116 + x, 103 + y, 1, 4);
        g2d.fillRect(113 + x, 112 + y, 1, 2);
        g2d.fillRect(114 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
    }





    public void paint3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 22);
        g2d.fillRect(121 + x, 91 + y, 1, 14);
        g2d.fillRect(120 + x, 105 + y, 1, 3);
        g2d.fillRect(119 + x, 108 + y, 1, 2);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(120 + x, 109 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 4, 1);
        g2d.fillRect(119 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 2);
        g2d.fillRect(116 + x, 112 + y, 1, 2);
        g2d.fillRect(117 + x, 112 + y, 2, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 2);
        g2d.fillRect(118 + x, 113 + y, 1, 1);
        g2d.fillRect(111 + x, 114 + y, 1, 4);
        g2d.fillRect(113 + x, 114 + y, 2, 1);
        g2d.fillRect(119 + x, 114 + y, 1, 2);
        g2d.fillRect(114 + x, 115 + y, 2, 1);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(118 + x, 115 + y, 1, 1);
        g2d.fillRect(120 + x, 115 + y, 1, 3);
        g2d.fillRect(119 + x, 117 + y, 1, 2);
        g2d.fillRect(112 + x, 118 + y, 1, 2);
        g2d.fillRect(118 + x, 118 + y, 1, 2);
        g2d.fillRect(113 + x, 119 + y, 1, 2);
        g2d.fillRect(114 + x, 119 + y, 1, 2);
        g2d.fillRect(115 + x, 119 + y, 1, 1);
        g2d.fillRect(117 + x, 119 + y, 1, 2);
        g2d.fillRect(116 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 91 + y, 1, 10);
        g2d.fillRect(115 + x, 91 + y, 1, 7);
        g2d.fillRect(120 + x, 91 + y, 1, 14);
        g2d.fillRect(119 + x, 100 + y, 1, 6);
        g2d.fillRect(115 + x, 101 + y, 1, 4);
        g2d.fillRect(116 + x, 101 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 8);
        g2d.fillRect(116 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 108 + y, 1, 2);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(118 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(119 + x, 110 + y, 1, 1);
        g2d.fillRect(114 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 3, 1);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(117 + x, 113 + y, 1, 1);
        g2d.fillRect(115 + x, 114 + y, 2, 1);
        g2d.fillRect(112 + x, 115 + y, 1, 3);
        g2d.fillRect(113 + x, 115 + y, 1, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 2);
        g2d.fillRect(114 + x, 116 + y, 2, 1);
        g2d.fillRect(118 + x, 116 + y, 1, 2);
        g2d.fillRect(119 + x, 116 + y, 1, 1);
        g2d.fillRect(113 + x, 118 + y, 3, 1);
        g2d.fillRect(117 + x, 118 + y, 1, 1);
        g2d.fillRect(116 + x, 119 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 91 + y, 1, 10);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 9);
        g2d.fillRect(118 + x, 95 + y, 1, 3);
        g2d.fillRect(115 + x, 98 + y, 1, 3);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(114 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 101 + y, 1, 2);
        g2d.fillRect(116 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 5);
        g2d.fillRect(116 + x, 104 + y, 1, 4);
        g2d.fillRect(115 + x, 105 + y, 1, 3);
        g2d.fillRect(119 + x, 106 + y, 1, 2);
        g2d.fillRect(117 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 109 + y, 1, 1);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(115 + x, 111 + y, 1, 1);
        g2d.fillRect(117 + x, 114 + y, 2, 1);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(114 + x, 117 + y, 1, 1);
        g2d.fillRect(117 + x, 117 + y, 1, 1);
        g2d.fillRect(116 + x, 118 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(117 + x, 92 + y, 1, 5);
        g2d.fillRect(117 + x, 98 + y, 1, 3);
        g2d.fillRect(118 + x, 101 + y, 1, 2);
        g2d.fillRect(117 + x, 103 + y, 1, 4);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
    }





    public void paint4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 10);
        g2d.fillRect(121 + x, 91 + y, 1, 9);
        g2d.fillRect(120 + x, 100 + y, 1, 4);
        g2d.fillRect(112 + x, 101 + y, 1, 10);
        g2d.fillRect(119 + x, 104 + y, 1, 2);
        g2d.fillRect(118 + x, 106 + y, 1, 2);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(119 + x, 107 + y, 1, 2);
        g2d.fillRect(113 + x, 108 + y, 4, 1);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 2);
        g2d.fillRect(116 + x, 110 + y, 2, 1);
        g2d.fillRect(111 + x, 111 + y, 1, 2);
        g2d.fillRect(117 + x, 111 + y, 1, 1);
        g2d.fillRect(110 + x, 112 + y, 1, 3);
        g2d.fillRect(112 + x, 112 + y, 2, 1);
        g2d.fillRect(118 + x, 112 + y, 1, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 1);
        g2d.fillRect(119 + x, 113 + y, 1, 2);
        g2d.fillRect(118 + x, 114 + y, 1, 2);
        g2d.fillRect(111 + x, 115 + y, 1, 2);
        g2d.fillRect(117 + x, 115 + y, 1, 2);
        g2d.fillRect(112 + x, 116 + y, 1, 2);
        g2d.fillRect(113 + x, 116 + y, 1, 2);
        g2d.fillRect(114 + x, 116 + y, 1, 1);
        g2d.fillRect(116 + x, 116 + y, 1, 2);
        g2d.fillRect(115 + x, 117 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 91 + y, 1, 13);
        g2d.fillRect(115 + x, 91 + y, 1, 4);
        g2d.fillRect(120 + x, 91 + y, 1, 9);
        g2d.fillRect(119 + x, 99 + y, 1, 5);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(113 + x, 101 + y, 1, 7);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 2);
        g2d.fillRect(115 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 107 + y, 1, 1);
        g2d.fillRect(118 + x, 108 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 1, 1);
        g2d.fillRect(115 + x, 109 + y, 3, 1);
        g2d.fillRect(112 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(114 + x, 112 + y, 1, 2);
        g2d.fillRect(115 + x, 112 + y, 1, 2);
        g2d.fillRect(111 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 113 + y, 1, 1);
        g2d.fillRect(117 + x, 113 + y, 1, 2);
        g2d.fillRect(118 + x, 113 + y, 1, 1);
        g2d.fillRect(112 + x, 115 + y, 3, 1);
        g2d.fillRect(116 + x, 115 + y, 1, 1);
        g2d.fillRect(115 + x, 116 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 91 + y, 1, 11);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 8);
        g2d.fillRect(118 + x, 94 + y, 1, 3);
        g2d.fillRect(115 + x, 95 + y, 1, 5);
        g2d.fillRect(118 + x, 99 + y, 1, 4);
        g2d.fillRect(115 + x, 101 + y, 1, 1);
        g2d.fillRect(117 + x, 102 + y, 1, 4);
        g2d.fillRect(115 + x, 103 + y, 1, 3);
        g2d.fillRect(114 + x, 104 + y, 1, 2);
        g2d.fillRect(118 + x, 104 + y, 1, 2);
        g2d.fillRect(116 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 107 + y, 1, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 112 + y, 2, 1);
        g2d.fillRect(112 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 114 + y, 1, 1);
        g2d.fillRect(116 + x, 114 + y, 1, 1);
        g2d.fillRect(115 + x, 115 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 4);
        g2d.fillRect(117 + x, 97 + y, 1, 5);
        g2d.fillRect(116 + x, 102 + y, 1, 3);
        g2d.fillRect(113 + x, 110 + y, 1, 2);
        g2d.fillRect(114 + x, 114 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 2);
    }





    public void paint5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 8);
        g2d.fillRect(121 + x, 91 + y, 1, 7);
        g2d.fillRect(120 + x, 98 + y, 1, 4);
        g2d.fillRect(112 + x, 99 + y, 1, 9);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(113 + x, 105 + y, 4, 1);
        g2d.fillRect(119 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 106 + y, 1, 1);
        g2d.fillRect(114 + x, 107 + y, 1, 2);
        g2d.fillRect(115 + x, 107 + y, 1, 2);
        g2d.fillRect(116 + x, 107 + y, 2, 1);
        g2d.fillRect(111 + x, 108 + y, 1, 2);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(110 + x, 109 + y, 1, 3);
        g2d.fillRect(112 + x, 109 + y, 2, 1);
        g2d.fillRect(118 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 1);
        g2d.fillRect(119 + x, 110 + y, 1, 2);
        g2d.fillRect(118 + x, 111 + y, 1, 2);
        g2d.fillRect(111 + x, 112 + y, 1, 2);
        g2d.fillRect(117 + x, 112 + y, 1, 2);
        g2d.fillRect(112 + x, 113 + y, 1, 2);
        g2d.fillRect(113 + x, 113 + y, 1, 2);
        g2d.fillRect(114 + x, 113 + y, 1, 1);
        g2d.fillRect(116 + x, 113 + y, 1, 2);
        g2d.fillRect(115 + x, 114 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 91 + y, 1, 11);
        g2d.fillRect(115 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 1, 7);
        g2d.fillRect(119 + x, 97 + y, 1, 5);
        g2d.fillRect(115 + x, 98 + y, 1, 1);
        g2d.fillRect(113 + x, 99 + y, 1, 6);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(114 + x, 104 + y, 2, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(113 + x, 106 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 3, 1);
        g2d.fillRect(112 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 108 + y, 1, 1);
        g2d.fillRect(114 + x, 109 + y, 1, 2);
        g2d.fillRect(115 + x, 109 + y, 1, 2);
        g2d.fillRect(111 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 2);
        g2d.fillRect(118 + x, 110 + y, 1, 1);
        g2d.fillRect(112 + x, 112 + y, 3, 1);
        g2d.fillRect(116 + x, 112 + y, 1, 1);
        g2d.fillRect(115 + x, 113 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 91 + y, 1, 9);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 6);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(115 + x, 94 + y, 1, 4);
        g2d.fillRect(118 + x, 97 + y, 1, 4);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 100 + y, 1, 4);
        g2d.fillRect(115 + x, 101 + y, 1, 3);
        g2d.fillRect(114 + x, 102 + y, 1, 2);
        g2d.fillRect(118 + x, 102 + y, 1, 2);
        g2d.fillRect(116 + x, 103 + y, 1, 2);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(114 + x, 106 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 2, 1);
        g2d.fillRect(112 + x, 110 + y, 1, 2);
        g2d.fillRect(113 + x, 111 + y, 1, 1);
        g2d.fillRect(116 + x, 111 + y, 1, 1);
        g2d.fillRect(115 + x, 112 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 5);
        g2d.fillRect(116 + x, 100 + y, 1, 3);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 111 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(118 + x, 95 + y, 1, 2);
    }





    public void paint6(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 14);
        g2d.fillRect(121 + x, 91 + y, 1, 8);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 101 + y, 1, 1);
        g2d.fillRect(114 + x, 102 + y, 4, 1);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 103 + y, 1, 1);
        g2d.fillRect(115 + x, 104 + y, 1, 2);
        g2d.fillRect(116 + x, 104 + y, 1, 2);
        g2d.fillRect(117 + x, 104 + y, 2, 1);
        g2d.fillRect(112 + x, 105 + y, 1, 2);
        g2d.fillRect(118 + x, 105 + y, 1, 1);
        g2d.fillRect(111 + x, 106 + y, 1, 3);
        g2d.fillRect(113 + x, 106 + y, 2, 1);
        g2d.fillRect(119 + x, 106 + y, 1, 1);
        g2d.fillRect(117 + x, 107 + y, 1, 1);
        g2d.fillRect(120 + x, 107 + y, 1, 2);
        g2d.fillRect(119 + x, 108 + y, 1, 2);
        g2d.fillRect(112 + x, 109 + y, 1, 2);
        g2d.fillRect(118 + x, 109 + y, 1, 2);
        g2d.fillRect(113 + x, 110 + y, 1, 2);
        g2d.fillRect(114 + x, 110 + y, 1, 2);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(117 + x, 110 + y, 1, 2);
        g2d.fillRect(116 + x, 111 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 91 + y, 1, 11);
        g2d.fillRect(115 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 1, 8);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 3);
        g2d.fillRect(119 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 101 + y, 2, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 103 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 3, 1);
        g2d.fillRect(113 + x, 105 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);
        g2d.fillRect(115 + x, 106 + y, 1, 2);
        g2d.fillRect(116 + x, 106 + y, 1, 2);
        g2d.fillRect(112 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 107 + y, 1, 1);
        g2d.fillRect(118 + x, 107 + y, 1, 2);
        g2d.fillRect(119 + x, 107 + y, 1, 1);
        g2d.fillRect(113 + x, 109 + y, 3, 1);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(116 + x, 110 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(116 + x, 91 + y, 1, 10);
        g2d.fillRect(117 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 91 + y, 1, 4);
        g2d.fillRect(118 + x, 93 + y, 1, 8);
        g2d.fillRect(115 + x, 94 + y, 1, 2);
        g2d.fillRect(119 + x, 96 + y, 1, 2);
        g2d.fillRect(115 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 99 + y, 1, 2);
        g2d.fillRect(117 + x, 100 + y, 1, 2);
        g2d.fillRect(118 + x, 102 + y, 1, 1);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 106 + y, 2, 1);
        g2d.fillRect(113 + x, 107 + y, 1, 2);
        g2d.fillRect(114 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(116 + x, 109 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 2);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 3);
        g2d.fillRect(114 + x, 104 + y, 1, 2);
        g2d.fillRect(115 + x, 108 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(118 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
    }





    public void paint7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(113 + x, 91 + y, 1, 11);
        g2d.fillRect(121 + x, 91 + y, 1, 4);
        g2d.fillRect(120 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 97 + y, 1, 1);
        g2d.fillRect(114 + x, 98 + y, 4, 1);
        g2d.fillRect(120 + x, 98 + y, 1, 1);
        g2d.fillRect(115 + x, 99 + y, 1, 1);
        g2d.fillRect(118 + x, 99 + y, 2, 1);
        g2d.fillRect(116 + x, 100 + y, 2, 1);
        g2d.fillRect(119 + x, 100 + y, 1, 1);
        g2d.fillRect(112 + x, 101 + y, 1, 3);
        g2d.fillRect(114 + x, 101 + y, 2, 1);
        g2d.fillRect(120 + x, 101 + y, 1, 1);
        g2d.fillRect(118 + x, 102 + y, 1, 1);
        g2d.fillRect(121 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 2);
        g2d.fillRect(113 + x, 104 + y, 1, 2);
        g2d.fillRect(119 + x, 104 + y, 1, 2);
        g2d.fillRect(114 + x, 105 + y, 1, 2);
        g2d.fillRect(115 + x, 105 + y, 1, 2);
        g2d.fillRect(116 + x, 105 + y, 1, 1);
        g2d.fillRect(118 + x, 105 + y, 1, 2);
        g2d.fillRect(117 + x, 106 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 91 + y, 1, 7);
        g2d.fillRect(120 + x, 91 + y, 1, 4);
        g2d.fillRect(119 + x, 92 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 2, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 98 + y, 1, 1);
        g2d.fillRect(114 + x, 99 + y, 1, 2);
        g2d.fillRect(116 + x, 99 + y, 2, 1);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 101 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 2);
        g2d.fillRect(113 + x, 102 + y, 1, 2);
        g2d.fillRect(115 + x, 102 + y, 1, 1);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(120 + x, 102 + y, 1, 1);
        g2d.fillRect(114 + x, 104 + y, 3, 1);
        g2d.fillRect(118 + x, 104 + y, 1, 1);
        g2d.fillRect(117 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(116 + x, 91 + y, 1, 6);
        g2d.fillRect(118 + x, 91 + y, 1, 6);
        g2d.fillRect(119 + x, 91 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(117 + x, 96 + y, 1, 2);
        g2d.fillRect(118 + x, 98 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 2, 1);
        g2d.fillRect(114 + x, 102 + y, 1, 2);
        g2d.fillRect(115 + x, 103 + y, 1, 1);
        g2d.fillRect(118 + x, 103 + y, 1, 1);
        g2d.fillRect(117 + x, 104 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(117 + x, 92 + y, 1, 4);
        g2d.fillRect(115 + x, 100 + y, 1, 1);
        g2d.fillRect(116 + x, 103 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(117 + x, 91 + y, 1, 1);
    }





    public void paintBackT(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(115 + x, 82 + y, 1, 5);
        g2d.fillRect(94 + x, 82 + y, 3, 1);
        g2d.fillRect(108 + x, 83 + y, 7, 1);
        g2d.fillRect(99 + x, 83 + y, 2, 1);
        g2d.fillRect(97 + x, 83 + y, 1, 1);
        g2d.fillRect(94 + x, 83 + y, 1, 8);
        g2d.fillRect(106 + x, 84 + y, 2, 1);
        g2d.fillRect(101 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 4);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 88 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(109 + x, 85 + y, 1, 2);
        g2d.fillRect(99 + x, 85 + y, 1, 2);
        g2d.fillRect(98 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(97 + x, 87 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 3, 1);
        g2d.fillRect(95 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(95 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 3);
        g2d.fillRect(113 + x, 84 + y, 1, 4);
        g2d.fillRect(108 + x, 84 + y, 4, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 7);
        g2d.fillRect(97 + x, 84 + y, 3, 1);
        g2d.fillRect(95 + x, 84 + y, 1, 4);
        g2d.fillRect(112 + x, 85 + y, 1, 3);
        g2d.fillRect(110 + x, 85 + y, 1, 2);
        g2d.fillRect(101 + x, 85 + y, 8, 1);
        g2d.fillRect(98 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 7, 1);
        g2d.fillRect(97 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 5, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(96 + x, 87 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 3);
        g2d.fillRect(103 + x, 88 + y, 3, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 2);
        g2d.fillRect(95 + x, 89 + y, 1, 2);
        g2d.fillRect(106 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(98 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 2, 1);
        g2d.fillRect(96 + x, 84 + y, 1, 3);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(97 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 4);
        g2d.fillRect(99 + x, 88 + y, 1, 3);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 89 + y, 1, 2);
        g2d.fillRect(98 + x, 89 + y, 1, 2);
        g2d.fillRect(96 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(104 + x, 84 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(110 + x, 88 + y, 1, 1);
        g2d.fillRect(98 + x, 88 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 2);
        g2d.fillRect(97 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 89 + y, 1, 1);
    }





    public void paintBack1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 3);
        g2d.fillRect(94 + x, 91 + y, 1, 3);
        g2d.fillRect(103 + x, 94 + y, 1, 8);
        g2d.fillRect(95 + x, 94 + y, 1, 7);
        g2d.fillRect(96 + x, 101 + y, 1, 4);
        g2d.fillRect(104 + x, 102 + y, 1, 11);
        g2d.fillRect(97 + x, 105 + y, 1, 3);
        g2d.fillRect(98 + x, 108 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(97 + x, 109 + y, 1, 2);
        g2d.fillRect(100 + x, 110 + y, 4, 1);
        g2d.fillRect(98 + x, 111 + y, 1, 1);
        g2d.fillRect(102 + x, 112 + y, 1, 2);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(99 + x, 112 + y, 2, 1);
        g2d.fillRect(105 + x, 113 + y, 1, 2);
        g2d.fillRect(99 + x, 113 + y, 1, 1);
        g2d.fillRect(106 + x, 114 + y, 1, 4);
        g2d.fillRect(103 + x, 114 + y, 2, 1);
        g2d.fillRect(98 + x, 114 + y, 1, 2);
        g2d.fillRect(102 + x, 115 + y, 2, 1);
        g2d.fillRect(100 + x, 115 + y, 1, 2);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(97 + x, 115 + y, 1, 3);
        g2d.fillRect(98 + x, 117 + y, 1, 2);
        g2d.fillRect(105 + x, 118 + y, 1, 2);
        g2d.fillRect(99 + x, 118 + y, 1, 2);
        g2d.fillRect(104 + x, 119 + y, 1, 2);
        g2d.fillRect(103 + x, 119 + y, 1, 2);
        g2d.fillRect(102 + x, 119 + y, 1, 1);
        g2d.fillRect(100 + x, 119 + y, 1, 2);
        g2d.fillRect(101 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 91 + y, 1, 8);
        g2d.fillRect(100 + x, 91 + y, 1, 5);
        g2d.fillRect(95 + x, 91 + y, 1, 3);
        g2d.fillRect(102 + x, 94 + y, 1, 11);
        g2d.fillRect(96 + x, 95 + y, 1, 6);
        g2d.fillRect(97 + x, 100 + y, 1, 5);
        g2d.fillRect(101 + x, 101 + y, 1, 1);
        g2d.fillRect(103 + x, 102 + y, 1, 8);
        g2d.fillRect(101 + x, 103 + y, 1, 1);
        g2d.fillRect(98 + x, 104 + y, 1, 1);
        g2d.fillRect(102 + x, 108 + y, 1, 2);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 3, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 1);
        g2d.fillRect(100 + x, 113 + y, 1, 1);
        g2d.fillRect(101 + x, 114 + y, 2, 1);
        g2d.fillRect(105 + x, 115 + y, 1, 3);
        g2d.fillRect(104 + x, 115 + y, 1, 1);
        g2d.fillRect(101 + x, 115 + y, 1, 2);
        g2d.fillRect(102 + x, 116 + y, 2, 1);
        g2d.fillRect(99 + x, 116 + y, 1, 2);
        g2d.fillRect(98 + x, 116 + y, 1, 1);
        g2d.fillRect(102 + x, 118 + y, 3, 1);
        g2d.fillRect(100 + x, 118 + y, 1, 1);
        g2d.fillRect(101 + x, 119 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 91 + y, 1, 6);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 4);
        g2d.fillRect(97 + x, 95 + y, 1, 5);
        g2d.fillRect(100 + x, 96 + y, 1, 7);
        g2d.fillRect(101 + x, 99 + y, 1, 2);
        g2d.fillRect(98 + x, 100 + y, 1, 4);
        g2d.fillRect(101 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 103 + y, 1, 5);
        g2d.fillRect(101 + x, 104 + y, 1, 4);
        g2d.fillRect(102 + x, 105 + y, 1, 3);
        g2d.fillRect(98 + x, 105 + y, 1, 3);
        g2d.fillRect(100 + x, 107 + y, 1, 2);
        g2d.fillRect(101 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 110 + y, 1, 1);
        g2d.fillRect(102 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 114 + y, 2, 1);
        g2d.fillRect(104 + x, 116 + y, 1, 2);
        g2d.fillRect(103 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 117 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 6);
        g2d.fillRect(99 + x, 97 + y, 1, 6);
        g2d.fillRect(100 + x, 103 + y, 1, 4);
        g2d.fillRect(103 + x, 112 + y, 1, 2);
        g2d.fillRect(101 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 98 + y, 1, 2);
    }





    public void paintBack2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 11);
        g2d.fillRect(94 + x, 91 + y, 1, 10);
        g2d.fillRect(95 + x, 101 + y, 1, 4);
        g2d.fillRect(103 + x, 102 + y, 1, 11);
        g2d.fillRect(96 + x, 105 + y, 1, 3);
        g2d.fillRect(97 + x, 108 + y, 1, 2);
        g2d.fillRect(98 + x, 109 + y, 1, 1);
        g2d.fillRect(96 + x, 109 + y, 1, 2);
        g2d.fillRect(99 + x, 110 + y, 4, 1);
        g2d.fillRect(97 + x, 111 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(100 + x, 112 + y, 1, 2);
        g2d.fillRect(98 + x, 112 + y, 2, 1);
        g2d.fillRect(104 + x, 113 + y, 1, 2);
        g2d.fillRect(98 + x, 113 + y, 1, 1);
        g2d.fillRect(105 + x, 114 + y, 1, 4);
        g2d.fillRect(102 + x, 114 + y, 2, 1);
        g2d.fillRect(97 + x, 114 + y, 1, 2);
        g2d.fillRect(101 + x, 115 + y, 2, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 2);
        g2d.fillRect(98 + x, 115 + y, 1, 1);
        g2d.fillRect(96 + x, 115 + y, 1, 3);
        g2d.fillRect(97 + x, 117 + y, 1, 2);
        g2d.fillRect(104 + x, 118 + y, 1, 2);
        g2d.fillRect(98 + x, 118 + y, 1, 2);
        g2d.fillRect(103 + x, 119 + y, 1, 2);
        g2d.fillRect(102 + x, 119 + y, 1, 2);
        g2d.fillRect(101 + x, 119 + y, 1, 1);
        g2d.fillRect(99 + x, 119 + y, 1, 2);
        g2d.fillRect(100 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 91 + y, 1, 14);
        g2d.fillRect(100 + x, 91 + y, 1, 5);
        g2d.fillRect(95 + x, 91 + y, 1, 10);
        g2d.fillRect(96 + x, 100 + y, 1, 5);
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(102 + x, 102 + y, 1, 8);
        g2d.fillRect(100 + x, 103 + y, 1, 1);
        g2d.fillRect(97 + x, 104 + y, 1, 1);
        g2d.fillRect(101 + x, 108 + y, 1, 2);
        g2d.fillRect(100 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(97 + x, 110 + y, 1, 1);
        g2d.fillRect(102 + x, 111 + y, 1, 1);
        g2d.fillRect(98 + x, 111 + y, 3, 1);
        g2d.fillRect(103 + x, 113 + y, 1, 1);
        g2d.fillRect(99 + x, 113 + y, 1, 1);
        g2d.fillRect(100 + x, 114 + y, 2, 1);
        g2d.fillRect(104 + x, 115 + y, 1, 3);
        g2d.fillRect(103 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 115 + y, 1, 2);
        g2d.fillRect(101 + x, 116 + y, 2, 1);
        g2d.fillRect(98 + x, 116 + y, 1, 2);
        g2d.fillRect(97 + x, 116 + y, 1, 1);
        g2d.fillRect(101 + x, 118 + y, 3, 1);
        g2d.fillRect(99 + x, 118 + y, 1, 1);
        g2d.fillRect(100 + x, 119 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 91 + y, 1, 12);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 9);
        g2d.fillRect(97 + x, 95 + y, 1, 3);
        g2d.fillRect(100 + x, 96 + y, 1, 5);
        g2d.fillRect(97 + x, 100 + y, 1, 4);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 1, 5);
        g2d.fillRect(100 + x, 104 + y, 1, 4);
        g2d.fillRect(101 + x, 105 + y, 1, 3);
        g2d.fillRect(97 + x, 105 + y, 1, 3);
        g2d.fillRect(99 + x, 107 + y, 1, 2);
        g2d.fillRect(100 + x, 109 + y, 1, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 1);
        g2d.fillRect(101 + x, 111 + y, 1, 1);
        g2d.fillRect(98 + x, 114 + y, 2, 1);
        g2d.fillRect(103 + x, 116 + y, 1, 2);
        g2d.fillRect(102 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 117 + y, 1, 1);
        g2d.fillRect(100 + x, 118 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 5);
        g2d.fillRect(98 + x, 98 + y, 1, 5);
        g2d.fillRect(99 + x, 103 + y, 1, 4);
        g2d.fillRect(102 + x, 112 + y, 1, 2);
        g2d.fillRect(100 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 2);
    }





    public void paintBack3(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 22);
        g2d.fillRect(94 + x, 91 + y, 1, 14);
        g2d.fillRect(95 + x, 105 + y, 1, 3);
        g2d.fillRect(96 + x, 108 + y, 1, 2);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(95 + x, 109 + y, 1, 2);
        g2d.fillRect(98 + x, 110 + y, 4, 1);
        g2d.fillRect(96 + x, 111 + y, 1, 1);
        g2d.fillRect(100 + x, 112 + y, 1, 2);
        g2d.fillRect(99 + x, 112 + y, 1, 2);
        g2d.fillRect(97 + x, 112 + y, 2, 1);
        g2d.fillRect(103 + x, 113 + y, 1, 2);
        g2d.fillRect(97 + x, 113 + y, 1, 1);
        g2d.fillRect(104 + x, 114 + y, 1, 4);
        g2d.fillRect(101 + x, 114 + y, 2, 1);
        g2d.fillRect(96 + x, 114 + y, 1, 2);
        g2d.fillRect(100 + x, 115 + y, 2, 1);
        g2d.fillRect(98 + x, 115 + y, 1, 2);
        g2d.fillRect(97 + x, 115 + y, 1, 1);
        g2d.fillRect(95 + x, 115 + y, 1, 3);
        g2d.fillRect(96 + x, 117 + y, 1, 2);
        g2d.fillRect(103 + x, 118 + y, 1, 2);
        g2d.fillRect(97 + x, 118 + y, 1, 2);
        g2d.fillRect(102 + x, 119 + y, 1, 2);
        g2d.fillRect(101 + x, 119 + y, 1, 2);
        g2d.fillRect(100 + x, 119 + y, 1, 1);
        g2d.fillRect(98 + x, 119 + y, 1, 2);
        g2d.fillRect(99 + x, 120 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 91 + y, 1, 10);
        g2d.fillRect(100 + x, 91 + y, 1, 7);
        g2d.fillRect(95 + x, 91 + y, 1, 14);
        g2d.fillRect(96 + x, 100 + y, 1, 6);
        g2d.fillRect(100 + x, 101 + y, 1, 4);
        g2d.fillRect(99 + x, 101 + y, 1, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 8);
        g2d.fillRect(99 + x, 103 + y, 1, 1);
        g2d.fillRect(100 + x, 108 + y, 1, 2);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 1, 1);
        g2d.fillRect(96 + x, 110 + y, 1, 1);
        g2d.fillRect(101 + x, 111 + y, 1, 1);
        g2d.fillRect(97 + x, 111 + y, 3, 1);
        g2d.fillRect(102 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 113 + y, 1, 1);
        g2d.fillRect(99 + x, 114 + y, 2, 1);
        g2d.fillRect(103 + x, 115 + y, 1, 3);
        g2d.fillRect(102 + x, 115 + y, 1, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 2);
        g2d.fillRect(100 + x, 116 + y, 2, 1);
        g2d.fillRect(97 + x, 116 + y, 1, 2);
        g2d.fillRect(96 + x, 116 + y, 1, 1);
        g2d.fillRect(100 + x, 118 + y, 3, 1);
        g2d.fillRect(98 + x, 118 + y, 1, 1);
        g2d.fillRect(99 + x, 119 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 91 + y, 1, 10);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 9);
        g2d.fillRect(97 + x, 95 + y, 1, 3);
        g2d.fillRect(100 + x, 98 + y, 1, 3);
        g2d.fillRect(97 + x, 100 + y, 1, 1);
        g2d.fillRect(101 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 101 + y, 1, 2);
        g2d.fillRect(99 + x, 102 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 5);
        g2d.fillRect(99 + x, 104 + y, 1, 4);
        g2d.fillRect(100 + x, 105 + y, 1, 3);
        g2d.fillRect(96 + x, 106 + y, 1, 2);
        g2d.fillRect(98 + x, 107 + y, 1, 2);
        g2d.fillRect(99 + x, 109 + y, 1, 1);
        g2d.fillRect(97 + x, 110 + y, 1, 1);
        g2d.fillRect(100 + x, 111 + y, 1, 1);
        g2d.fillRect(97 + x, 114 + y, 2, 1);
        g2d.fillRect(102 + x, 116 + y, 1, 2);
        g2d.fillRect(101 + x, 117 + y, 1, 1);
        g2d.fillRect(98 + x, 117 + y, 1, 1);
        g2d.fillRect(99 + x, 118 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 5);
        g2d.fillRect(98 + x, 98 + y, 1, 3);
        g2d.fillRect(97 + x, 101 + y, 1, 2);
        g2d.fillRect(98 + x, 103 + y, 1, 4);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(99 + x, 117 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 93 + y, 1, 2);
        g2d.fillRect(98 + x, 97 + y, 1, 1);
        g2d.fillRect(97 + x, 98 + y, 1, 2);
    }





    public void paintBack4(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 10);
        g2d.fillRect(94 + x, 91 + y, 1, 9);
        g2d.fillRect(95 + x, 100 + y, 1, 4);
        g2d.fillRect(103 + x, 101 + y, 1, 10);
        g2d.fillRect(96 + x, 104 + y, 1, 2);
        g2d.fillRect(97 + x, 106 + y, 1, 2);
        g2d.fillRect(98 + x, 107 + y, 1, 1);
        g2d.fillRect(96 + x, 107 + y, 1, 2);
        g2d.fillRect(99 + x, 108 + y, 4, 1);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(101 + x, 110 + y, 1, 2);
        g2d.fillRect(100 + x, 110 + y, 1, 2);
        g2d.fillRect(98 + x, 110 + y, 2, 1);
        g2d.fillRect(104 + x, 111 + y, 1, 2);
        g2d.fillRect(98 + x, 111 + y, 1, 1);
        g2d.fillRect(105 + x, 112 + y, 1, 3);
        g2d.fillRect(102 + x, 112 + y, 2, 1);
        g2d.fillRect(97 + x, 112 + y, 1, 1);
        g2d.fillRect(99 + x, 113 + y, 1, 1);
        g2d.fillRect(96 + x, 113 + y, 1, 2);
        g2d.fillRect(97 + x, 114 + y, 1, 2);
        g2d.fillRect(104 + x, 115 + y, 1, 2);
        g2d.fillRect(98 + x, 115 + y, 1, 2);
        g2d.fillRect(103 + x, 116 + y, 1, 2);
        g2d.fillRect(102 + x, 116 + y, 1, 2);
        g2d.fillRect(101 + x, 116 + y, 1, 1);
        g2d.fillRect(99 + x, 116 + y, 1, 2);
        g2d.fillRect(100 + x, 117 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 91 + y, 1, 13);
        g2d.fillRect(100 + x, 91 + y, 1, 4);
        g2d.fillRect(95 + x, 91 + y, 1, 9);
        g2d.fillRect(96 + x, 99 + y, 1, 5);
        g2d.fillRect(100 + x, 100 + y, 1, 1);
        g2d.fillRect(102 + x, 101 + y, 1, 7);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 1);
        g2d.fillRect(101 + x, 106 + y, 1, 2);
        g2d.fillRect(100 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 106 + y, 1, 1);
        g2d.fillRect(99 + x, 107 + y, 1, 1);
        g2d.fillRect(97 + x, 108 + y, 1, 1);
        g2d.fillRect(102 + x, 109 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 3, 1);
        g2d.fillRect(103 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 1, 2);
        g2d.fillRect(100 + x, 112 + y, 1, 2);
        g2d.fillRect(104 + x, 113 + y, 1, 2);
        g2d.fillRect(102 + x, 113 + y, 1, 1);
        g2d.fillRect(98 + x, 113 + y, 1, 2);
        g2d.fillRect(97 + x, 113 + y, 1, 1);
        g2d.fillRect(101 + x, 115 + y, 3, 1);
        g2d.fillRect(99 + x, 115 + y, 1, 1);
        g2d.fillRect(100 + x, 116 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 91 + y, 1, 11);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 8);
        g2d.fillRect(97 + x, 94 + y, 1, 3);
        g2d.fillRect(100 + x, 95 + y, 1, 5);
        g2d.fillRect(97 + x, 99 + y, 1, 4);
        g2d.fillRect(100 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 102 + y, 1, 4);
        g2d.fillRect(100 + x, 103 + y, 1, 3);
        g2d.fillRect(101 + x, 104 + y, 1, 2);
        g2d.fillRect(97 + x, 104 + y, 1, 2);
        g2d.fillRect(99 + x, 105 + y, 1, 2);
        g2d.fillRect(100 + x, 107 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(101 + x, 109 + y, 1, 1);
        g2d.fillRect(98 + x, 112 + y, 2, 1);
        g2d.fillRect(103 + x, 113 + y, 1, 2);
        g2d.fillRect(102 + x, 114 + y, 1, 1);
        g2d.fillRect(99 + x, 114 + y, 1, 1);
        g2d.fillRect(100 + x, 115 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 4);
        g2d.fillRect(98 + x, 97 + y, 1, 5);
        g2d.fillRect(99 + x, 102 + y, 1, 3);
        g2d.fillRect(102 + x, 110 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 92 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(97 + x, 97 + y, 1, 2);
    }





    public void paintBack5(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 8);
        g2d.fillRect(94 + x, 91 + y, 1, 7);
        g2d.fillRect(95 + x, 98 + y, 1, 4);
        g2d.fillRect(103 + x, 99 + y, 1, 9);
        g2d.fillRect(96 + x, 102 + y, 1, 2);
        g2d.fillRect(97 + x, 104 + y, 1, 1);
        g2d.fillRect(99 + x, 105 + y, 4, 1);
        g2d.fillRect(96 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 106 + y, 1, 1);
        g2d.fillRect(101 + x, 107 + y, 1, 2);
        g2d.fillRect(100 + x, 107 + y, 1, 2);
        g2d.fillRect(98 + x, 107 + y, 2, 1);
        g2d.fillRect(104 + x, 108 + y, 1, 2);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(105 + x, 109 + y, 1, 3);
        g2d.fillRect(102 + x, 109 + y, 2, 1);
        g2d.fillRect(97 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 110 + y, 1, 1);
        g2d.fillRect(96 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 111 + y, 1, 2);
        g2d.fillRect(104 + x, 112 + y, 1, 2);
        g2d.fillRect(98 + x, 112 + y, 1, 2);
        g2d.fillRect(103 + x, 113 + y, 1, 2);
        g2d.fillRect(102 + x, 113 + y, 1, 2);
        g2d.fillRect(101 + x, 113 + y, 1, 1);
        g2d.fillRect(99 + x, 113 + y, 1, 2);
        g2d.fillRect(100 + x, 114 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 91 + y, 1, 11);
        g2d.fillRect(100 + x, 91 + y, 1, 3);
        g2d.fillRect(95 + x, 91 + y, 1, 7);
        g2d.fillRect(96 + x, 97 + y, 1, 5);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(102 + x, 99 + y, 1, 6);
        g2d.fillRect(100 + x, 100 + y, 1, 1);
        g2d.fillRect(97 + x, 101 + y, 1, 1);
        g2d.fillRect(100 + x, 104 + y, 2, 1);
        g2d.fillRect(98 + x, 104 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 1);
        g2d.fillRect(102 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 106 + y, 3, 1);
        g2d.fillRect(103 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 108 + y, 1, 1);
        g2d.fillRect(101 + x, 109 + y, 1, 2);
        g2d.fillRect(100 + x, 109 + y, 1, 2);
        g2d.fillRect(104 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 110 + y, 1, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 2);
        g2d.fillRect(97 + x, 110 + y, 1, 1);
        g2d.fillRect(101 + x, 112 + y, 3, 1);
        g2d.fillRect(99 + x, 112 + y, 1, 1);
        g2d.fillRect(100 + x, 113 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 91 + y, 1, 9);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 6);
        g2d.fillRect(97 + x, 93 + y, 1, 2);
        g2d.fillRect(100 + x, 94 + y, 1, 4);
        g2d.fillRect(97 + x, 97 + y, 1, 4);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(98 + x, 100 + y, 1, 4);
        g2d.fillRect(100 + x, 101 + y, 1, 3);
        g2d.fillRect(101 + x, 102 + y, 1, 2);
        g2d.fillRect(97 + x, 102 + y, 1, 2);
        g2d.fillRect(99 + x, 103 + y, 1, 2);
        g2d.fillRect(98 + x, 105 + y, 1, 1);
        g2d.fillRect(101 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 109 + y, 2, 1);
        g2d.fillRect(103 + x, 110 + y, 1, 2);
        g2d.fillRect(102 + x, 111 + y, 1, 1);
        g2d.fillRect(99 + x, 111 + y, 1, 1);
        g2d.fillRect(100 + x, 112 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 2);
        g2d.fillRect(98 + x, 95 + y, 1, 5);
        g2d.fillRect(99 + x, 100 + y, 1, 3);
        g2d.fillRect(102 + x, 107 + y, 1, 2);
        g2d.fillRect(100 + x, 111 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(97 + x, 95 + y, 1, 2);
    }





    public void paintBack6(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 14);
        g2d.fillRect(94 + x, 91 + y, 1, 8);
        g2d.fillRect(95 + x, 99 + y, 1, 2);
        g2d.fillRect(96 + x, 101 + y, 1, 1);
        g2d.fillRect(98 + x, 102 + y, 4, 1);
        g2d.fillRect(95 + x, 102 + y, 1, 1);
        g2d.fillRect(96 + x, 103 + y, 1, 1);
        g2d.fillRect(100 + x, 104 + y, 1, 2);
        g2d.fillRect(99 + x, 104 + y, 1, 2);
        g2d.fillRect(97 + x, 104 + y, 2, 1);
        g2d.fillRect(103 + x, 105 + y, 1, 2);
        g2d.fillRect(97 + x, 105 + y, 1, 1);
        g2d.fillRect(104 + x, 106 + y, 1, 3);
        g2d.fillRect(101 + x, 106 + y, 2, 1);
        g2d.fillRect(96 + x, 106 + y, 1, 1);
        g2d.fillRect(98 + x, 107 + y, 1, 1);
        g2d.fillRect(95 + x, 107 + y, 1, 2);
        g2d.fillRect(96 + x, 108 + y, 1, 2);
        g2d.fillRect(103 + x, 109 + y, 1, 2);
        g2d.fillRect(97 + x, 109 + y, 1, 2);
        g2d.fillRect(102 + x, 110 + y, 1, 2);
        g2d.fillRect(101 + x, 110 + y, 1, 2);
        g2d.fillRect(100 + x, 110 + y, 1, 1);
        g2d.fillRect(98 + x, 110 + y, 1, 2);
        g2d.fillRect(99 + x, 111 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 91 + y, 1, 11);
        g2d.fillRect(100 + x, 91 + y, 1, 3);
        g2d.fillRect(95 + x, 91 + y, 1, 8);
        g2d.fillRect(96 + x, 95 + y, 1, 1);
        g2d.fillRect(100 + x, 96 + y, 1, 3);
        g2d.fillRect(96 + x, 98 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 2, 1);
        g2d.fillRect(97 + x, 101 + y, 1, 1);
        g2d.fillRect(96 + x, 102 + y, 1, 1);
        g2d.fillRect(101 + x, 103 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 3, 1);
        g2d.fillRect(102 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 105 + y, 1, 1);
        g2d.fillRect(100 + x, 106 + y, 1, 2);
        g2d.fillRect(99 + x, 106 + y, 1, 2);
        g2d.fillRect(103 + x, 107 + y, 1, 2);
        g2d.fillRect(101 + x, 107 + y, 1, 1);
        g2d.fillRect(97 + x, 107 + y, 1, 2);
        g2d.fillRect(96 + x, 107 + y, 1, 1);
        g2d.fillRect(100 + x, 109 + y, 3, 1);
        g2d.fillRect(98 + x, 109 + y, 1, 1);
        g2d.fillRect(99 + x, 110 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(99 + x, 91 + y, 1, 10);
        g2d.fillRect(98 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 91 + y, 1, 4);
        g2d.fillRect(97 + x, 93 + y, 1, 8);
        g2d.fillRect(100 + x, 94 + y, 1, 2);
        g2d.fillRect(96 + x, 96 + y, 1, 2);
        g2d.fillRect(100 + x, 99 + y, 1, 2);
        g2d.fillRect(96 + x, 99 + y, 1, 2);
        g2d.fillRect(98 + x, 100 + y, 1, 2);
        g2d.fillRect(97 + x, 102 + y, 1, 1);
        g2d.fillRect(100 + x, 103 + y, 1, 1);
        g2d.fillRect(97 + x, 106 + y, 2, 1);
        g2d.fillRect(102 + x, 107 + y, 1, 2);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 109 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(97 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 2);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 3);
        g2d.fillRect(101 + x, 104 + y, 1, 2);
        g2d.fillRect(99 + x, 108 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(97 + x, 92 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
    }





    public void paintBack7(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 11);
        g2d.fillRect(94 + x, 91 + y, 1, 4);
        g2d.fillRect(95 + x, 95 + y, 1, 2);
        g2d.fillRect(96 + x, 97 + y, 1, 1);
        g2d.fillRect(98 + x, 98 + y, 4, 1);
        g2d.fillRect(95 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(96 + x, 99 + y, 2, 1);
        g2d.fillRect(98 + x, 100 + y, 2, 1);
        g2d.fillRect(96 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 3);
        g2d.fillRect(100 + x, 101 + y, 2, 1);
        g2d.fillRect(95 + x, 101 + y, 1, 1);
        g2d.fillRect(97 + x, 102 + y, 1, 1);
        g2d.fillRect(94 + x, 102 + y, 1, 2);
        g2d.fillRect(95 + x, 103 + y, 1, 2);
        g2d.fillRect(102 + x, 104 + y, 1, 2);
        g2d.fillRect(96 + x, 104 + y, 1, 2);
        g2d.fillRect(101 + x, 105 + y, 1, 2);
        g2d.fillRect(100 + x, 105 + y, 1, 2);
        g2d.fillRect(99 + x, 105 + y, 1, 1);
        g2d.fillRect(97 + x, 105 + y, 1, 2);
        g2d.fillRect(98 + x, 106 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(101 + x, 91 + y, 1, 7);
        g2d.fillRect(95 + x, 91 + y, 1, 4);
        g2d.fillRect(96 + x, 92 + y, 1, 1);
        g2d.fillRect(100 + x, 93 + y, 1, 2);
        g2d.fillRect(96 + x, 94 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 2, 1);
        g2d.fillRect(97 + x, 97 + y, 1, 1);
        g2d.fillRect(96 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 99 + y, 1, 2);
        g2d.fillRect(98 + x, 99 + y, 2, 1);
        g2d.fillRect(97 + x, 100 + y, 1, 1);
        g2d.fillRect(99 + x, 101 + y, 1, 2);
        g2d.fillRect(98 + x, 101 + y, 1, 2);
        g2d.fillRect(102 + x, 102 + y, 1, 2);
        g2d.fillRect(100 + x, 102 + y, 1, 1);
        g2d.fillRect(96 + x, 102 + y, 1, 2);
        g2d.fillRect(95 + x, 102 + y, 1, 1);
        g2d.fillRect(99 + x, 104 + y, 3, 1);
        g2d.fillRect(97 + x, 104 + y, 1, 1);
        g2d.fillRect(98 + x, 105 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 91 + y, 1, 2);
        g2d.fillRect(99 + x, 91 + y, 1, 6);
        g2d.fillRect(97 + x, 91 + y, 1, 6);
        g2d.fillRect(96 + x, 91 + y, 1, 1);
        g2d.fillRect(96 + x, 93 + y, 1, 1);
        g2d.fillRect(100 + x, 95 + y, 1, 2);
        g2d.fillRect(96 + x, 95 + y, 1, 2);
        g2d.fillRect(98 + x, 96 + y, 1, 2);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(96 + x, 101 + y, 2, 1);
        g2d.fillRect(101 + x, 102 + y, 1, 2);
        g2d.fillRect(100 + x, 103 + y, 1, 1);
        g2d.fillRect(97 + x, 103 + y, 1, 1);
        g2d.fillRect(98 + x, 104 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(98 + x, 92 + y, 1, 4);
        g2d.fillRect(100 + x, 100 + y, 1, 1);
        g2d.fillRect(98 + x, 103 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(98 + x, 91 + y, 1, 1);
    }
}
